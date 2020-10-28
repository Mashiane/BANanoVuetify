B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public vm As BANanoVM
	Public vue As BANanoVue   'ignore
	Private BANano As BANano
	Public fb As BANanoFireStoreDB
End Sub

Sub Init
	'initialize the app
	vm.Initialize(Me, Main.appname)
	'get the vue instance
	vue = vm.vue
	'set the display format
	vue.DateDisplayFormat = "DD, MMM YYYY"
	vm.ShowWarnings = False
	vue.ShowWarnings = False
	'vm.Dark = True
	'vm.RTL = False
	vm.SnackBar.SetColor("green")
	vm.SnackBar.SetTop(True)
	vm.SnackBar.SetShaped(True)
	'make the container fluid
	vm.Container.SetFluid(True)
	'
	vm.SetTransition(vm.TRANSITION_SLIDE_X)
	
	BuildNavBar
	BuildDrawer
	BuildFooter
	'
	'set some states
	vm.SetDataGlobal("recipes", vue.newlist)
	vm.SetDataGlobal("user", Null)
	vm.SetDataGlobal("isAuthenticated", False)
	vm.SetDataGlobal("userRecipes", vue.NewList)
	
	'add the getrecipes method to global scope
	vm.SetMethod(Me, "GetRecipes")
	vm.SetMethod(Me, "getUserRecipes")
	'add the pages
	AddPages
	'build the app and show the user interface
	vm.UX
		
	'lets set up firebase connection
	fb.Initialize
	'use your own credentials
	fb.apiKey = "AIzaSyBho-I504rEEgiBKW-oQ-CkQVx6tBXn-Zs"
	fb.authDomain = "mealprep-22c0b.firebaseapp.com"
	fb.databaseURL = "https://mealprep-22c0b.firebaseio.com"
	fb.projectId = "mealprep-22c0b"
	fb.storageBucket = "mealprep-22c0b.appspot.com"
	fb.messagingSenderId = "331097842138"
	fb.appId = "1:331097842138:web:e6821803063037e2bc20e3"
	fb.measurementId = "G-T3M47FEGRH"
	fb.timestampsInSnapshots
	fb.connect
	'
	Dim ofResponse As Map
	Dim ofError As Map
	Dim offline As BANanoPromise = fb.enablePersistence
	offline.then(ofResponse)
		vm.ShowSnackBarSuccess("We are connected to firestore, you can sign in or sign up now!")
	offline.Else(ofError)
		Dim message As String = fb.GetMessage(ofError)
		vm.ShowSnackBarError("We could not set offline functionality for this firestore!" & "<br/>" & message )
	offline.End
End Sub

Sub AddPages
	ViewHome.Initialize
	ViewMenu.Initialize
	ViewSignIn.initialize
	ViewJoin.Initialize
	ViewAbout.initialize
End Sub

'execute REST API call, we use BANanoFetch which uses promises
Sub GetRecipes(plan As String) 'IgnoreDeadCode
	vm.ShowLoading
	Dim error As Map
	Dim Response As BANanoFetchResponse
	Dim json As BANanoJSONParser
	Dim fetch As BANanoFetch
	Dim app_id As String = "5b6623d5"
	Dim app_key As String = "46674aa2193dbb7b88ffd897331e661a"
	'
	fetch.Initialize($"https://api.edamam.com/search?q=${plan}&app_id=${app_id}&app_key=${app_key}&from=0&to=9"$, Null)
	fetch.Then(Response)
	fetch.return(Response.Json)
	fetch.Then(json)
		Dim res As Map = json.NextObject
		Dim hits As List = res.get("hits")
		vm.SetDataGlobal("recipes", hits)
	fetch.Else(error)
		vm.SetDataGlobal("recipes", vue.newlist)
	fetch.end
	vm.HideLoading
End Sub

'get recipes stored on the firebase backend
Sub getUserRecipes 'IgnoreDeadCode
	
End Sub


'Sub BuildSnackBar
'	vue.SetDataGlobal("snackshow", False)
'	vue.SetDataGlobal("snackmsg", "")
'	vue.SetDataGlobal("snackcolor", "")
'	Dim snack As VMElement = vm.VSnackBar("").AddAttr("v-model", "$store.snackshow").SetText("{{ $store.snackmsg }}")
'	snack.AddAttributes(CreateMap(":multi-line": True, "app":True,"centered":True,":color":"$store.snackcolor",":shaped":True))
'	vm.VApp.AddElement(snack)
'End Sub
'
'Sub ShowSnackBarError(msg As String)
'	vue.SetDataGlobal("snackshow", True)
'	vue.SetDataGlobal("snackmsg",msg)
'	vue.SetDataGlobal("snackcolor", "error")
'End Sub
'
'Sub ShowSnackBarSuccess(msg As String)
'	vue.SetDataGlobal("snackshow", True)
'	vue.SetDataGlobal("snackmsg",msg)
'	vue.SetDataGlobal("snackcolor", "success")
'End Sub
'
''reset some stuff
'Sub signout
'	vue.SetdataGlobal("userximage", "./assets/avatar.png")
'	vue.SetdataGlobal("userxalt", "User")
'	vue.SetdataGlobal("displayname", "")
'	vue.setdataglobal("signedin", False)
'	vue.SetdataGlobal("user", vue.NewMap)
'End Sub


Sub BuildNavBar
	
	'add a hamburger
	'vm.NavBar.Hamburger.SetHiddenMdAndUp
	vm.navbar.AddHamburger
	'vm.NavBar.SetClippedLeft(True)
	
	'the progressbar for long operations
	vm.NavBar.Progress.SetColorIntensity(vm.COLOR_YELLOW, vm.INTENSITY_ACCENT4)
		
	'add a logo
	vm.NavBar.Logo.SetBorderRadius("50%")
	vm.NavBar.Logo.SetBorderWidth("1px")
	vm.NavBar.Logo.SetBorderColor("black")
	vm.NavBar.Logo.SetBorderStyle("solid")
	vm.NavBar.Logo.SetSize("46px","46px")
	vm.NavBar.AddLogo("./assets/sponge.png")
	vm.NavBar.Logo.Show

	vm.NavBar.AddTitle(Main.AppTitle,"")
	vm.NavBar.AddSubHeading1(Main.Version)
	vm.NavBar.Show
	
	vm.NavBar.SetModeFixed(True)
	vm.NavBar.SetColorIntensity(vm.COLOR_BROWN, vm.INTENSITY_DARKEN4)
	vm.NavBar.SetDark(True)
	'
	vm.NavBar.AddSpacer1(vm.VISIBILITY_HIDDEN_MD_AND_UP)
	'add home button
	Dim btnHome As VMElement = vm.VBtn("btnhome").SetStatic(True).SetText("Home").SetTo("/").SetFlat(True)
	btnHome.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	vm.NavBar.AddElement(btnHome)
	
	'add menu button
	Dim btnMenu As VMElement = vm.VBtn("btnmenu").SetStatic(True).SetText("Menu").SetTo("/menu").SetFlat(True)
	btnMenu.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	vm.NavBar.AddElement(btnMenu)
	'
	vm.NavBar.AddSpacer1(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	'
	Dim btnSignIn As VMElement = vm.VBtn("btnsignin").SetStatic(True).SetText("Sign In").SetTo("/signin").SetFlat(True)
	btnSignIn.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	btnSignIn.SetVIf("!isauthenticated")
	vm.NavBar.AddElement(btnSignIn)
	'
	Dim btnJoin As VMElement = vm.VBtn("btnjoin").SetStatic(True).SetText("Join").SetTo("/join").SetFlat(True)
	btnJoin.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	btnJoin.SetVIf("!isauthenticated")
	btnJoin.SetColorIntensity(vm.COLOR_Brown, vm.intensity_lighten3)
	vm.NavBar.AddElement(btnJoin)
	'
	Dim btnProfile As VMElement = vm.VBtn("btnprofile").SetStatic(True).SetText("Profile").SetTo("/about").SetFlat(True)
	btnProfile.SetVIf("isauthenticated")
	vm.NavBar.AddElement(btnProfile)
	'
	Dim btnlogout As VMElement = vm.VBtn("btnlogout").SetStatic(True).SetText("Logout").SetOnClick(Me, "btnlogout_click")
	btnlogout.SetVIf("isauthenticated")
	btnlogout.SetColor(vm.COLOR_WHITE).SetOutlined
	vm.NavBar.AddElement(btnlogout)
End Sub

'logout has been effected
Sub btnlogout_click(e As BANanoEvent)
	'sign out the user
	Dim outResponse As Map
	Dim outError As Map
	Dim outUser As BANanoPromise = fb.signOut
	outUser.Then(outResponse)
		vm.SetDataGlobal("user", Null)
		vm.SetDataGlobal("isAuthenticated", False)
		vm.NavigateTo("/")
	outUser.Else(outError)
		vm.SetDataGlobal("user", Null)
		vm.SetDataGlobal("isAuthenticated", False)
		vm.NavigateTo("/")
	outUser.end
End Sub

Sub BuildFooter
	vm.Footer.SHow
	vm.Footer.SetFixed(True)
	vm.Footer.SetColorIntensity(vm.COLOR_BROWN, vm.INTENSITY_DARKEN4)
	vm.footer.Container.SetTag("div")
	vm.footer.Container.AddRows(1).AddColumns12
	vm.Footer.AddMadeWithLove(1, 1, "with B4J, BANanano & BANanoVuetify by", "TheMash", "mbanga.anele@gmail.com")
End Sub

Sub BuildDrawer
	'vm.Drawer.SetClipped(True)
	vm.Drawer.Hide
	
	vm.Drawer.SetColorIntensity(vm.COLOR_Brown, vm.INTENSITY_LIGHTEN2)
	vm.Drawer.SetDark(True)
	vm.Drawer.SetDisableResizeWatcher(True)
	'
	'vm.Drawer.SetMiniVariant(True)
	'vm.Drawer.SetExpandOnHover(True)
	vm.Drawer.AddListItem(vm.CreateListItem("drwhome", Me).SetItemTo("/").SetTitle("Home")).AddListItemDivider
	vm.Drawer.AddListItem(vm.CreateListItem("drwmenu", Me).SetItemTo("/menu").SetTitle("Menu")).AddListItemDivider
	vm.Drawer.AddListItem(vm.CreateListItem("drwprofile", Me).SetItemTo("/about").SetTitle("Profile")).AddListItemDivider
	vm.Drawer.AddListItem(vm.CreateListItem("drwsignin", Me).SetItemTo("/signin").SetTitle("Sign In")).AddListItemDivider
	vm.Drawer.AddListItem(vm.CreateListItem("drwjoin", Me).SetItemTo("/join").SetTitle("Join"))
	
	'Dim btnLogOff As VMButton = vm.CreateButton("logOff", Me).SetLabel("Log Off").SetBlock(True)
	'vm.Drawer.AddOnBottomSection(btnLogOff.tostring)
	
	'vm.Drawer.SetDark(True)
	'vm.Drawer.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	
	
	'vm.Drawer.SetOpenOnMediumLarge(True)
	'vm.Drawer.List.SetDense(True)
	'vm.Drawer.SetWidth("300")
	'vm.Drawer.AddTitleSubTitle(Main.AppName, $"Version ${Main.version}"$)
	'vm.Drawer.AddDivider
	'
	'vm.Drawer.AddParentChild("", "login", "", "", "Sign In", "")
	
	'* IMPORTANT
	'vm.drawer.Refresh
End Sub
'
''when title is clicked, go to root
'Sub title_click(e As BANanoEvent)
'	vm.navigateTo("/")
'End Sub

'when the ok button is clicked for a confirm dialog
Sub confirm_ok(e As BANanoEvent)
	Dim sproc As String = vm.GetConfirm
	
End Sub

'when the cancel button is clicked for a confirm dialog
Sub confirm_cancel(e As BANanoEvent)
	Dim sproc As String = vm.GetConfirm
	
End Sub

'when the ok button of an alert is clicked
Sub alert_ok(e As BANanoEvent)
	Dim sproc As String = vm.GetAlert
	
End Sub

'
''*IMPORTANT
'Sub draweritems_click(e As BANanoEvent)
'	Dim draweritem As String = vm.GetIDFromEvent(e)
'
'	vm.ShowSnackBAr(draweritem)
'End Sub