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
	vm.SetMethod(Me, "addRecipe")
	vm.setmethod(Me, "addUser")
	vm.SetMethod(Me, "updateRecipes")
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
End Sub

'get recipes stored on the firebase backend
Sub getUserRecipes 'IgnoreDeadCode
	Dim bisAuthenticated As Boolean = vm.GetDataGlobal("isAuthenticated")
	If bisAuthenticated = False Then
		vm.SetDataGlobal("userrecipes", vue.newlist)
		Return
	End If
	
	'get the details of the active user
	Dim user As Map = vm.getdataglobal("user")
	Dim userid As String = user.get("uid")
		
	'get the user details using the user id
	Dim gResponse As Map
	Dim gError As Map
	Dim getUser As BANanoPromise = fb.CollectionGet("users", userid)
	getUser.then(gResponse)
		'this is the complete user record
		Dim data As Map = fb.GetRecord(gResponse)
		'get a users recipes as a map object
		Dim recipes As Map = data.get("recipes")
		'compile a list of recipes
		Dim recipeList As List = vue.newlist
		'each recipe is unique based on the uri
		For Each k As String In recipes.keys
			Dim recipe As Map = recipes.get(k)
			Dim label As String = recipe.get("label")
			recipeList.add(label)
		Next
		recipeList.sort(True)
		vm.SetDataGlobal("userrecipes", recipeList)
	getUser.Else(gError)
		Dim message As String = fb.GetMessage(gError)
		vm.ShowSnackBarError(message)
		vm.SetDataGlobal("userrecipes", vue.newlist)
	getUser.End
End Sub

'add a user to the users collection
Sub addUser(userid As String)     'ignoredeadcode
	'[C]reate a new record for the users collection using the userid
	'as a primary key
	Dim user As Map = CreateMap()
	'use a map because we dont want duplicates
	Dim recipes As Map = CreateMap()
	user.put("recipes", recipes)   'list of recipes for user
	user.put("userid", userid)	   'the user id
	
	Dim aResponse As Map
	Dim aError As Map
	'create a new record / overwite existing record using key
	Dim addUserPromise As BANanoPromise = fb.CollectionSet("users", userid, user)
	addUserPromise.then(aResponse)
		'navigate to plans so that user can choose recipes to add
		vm.NavigateTo("/plans")
	addUserPromise.Else(aError)
		Dim message As String = fb.GetMessage(aError)
		vm.ShowSnackBarError(message)
	addUserPromise.End
End Sub

Sub addRecipe(payload As Map)    'ignoredeadcode
	'get the user details
	Dim user As Map = vm.getdataglobal("user")
	Dim userid As String = user.get("uid")
	'get the recipe
	Dim recipe As Map = payload.get("recipe")
	'get the label
	Dim label As String = recipe.get("label")
	Dim uri As String = recipe.get("uri")
	Dim url As String = recipe.get("url")
	'
	'we will use the uri as a key
	Dim record As Map = CreateMap()
	record.put("uri", uri)
	record.put("url", url)
	record.put("label", label)
	record.put("userid", userid)
	'
	'get the user details using the user id
	Dim uResponse As Map
	Dim uError As Map
	Dim getUser As BANanoPromise = fb.CollectionGet("users", userid)
	getUser.then(uResponse)
		'this is the complete user record
		Dim data As Map = fb.GetRecord(uResponse)
		'get a users recipes as a map object
		Dim recipes As Map = data.get("recipes")
		'use the uri (unique value) so that we dont have duplicates
		'update the user recipes
		recipes.put(uri, record)
		'update the user record
		data.put("recipes", recipes)
		'update recipes
		Dim urec As Map = CreateMap()
		urec.put("userid", userid)
		urec.put("payload", data)
		vm.RunMethod("updateRecipes", urec)
	getUser.Else(uError)
		Dim message As String =fb.GetMessage(uError)
		vm.ShowSnackBarError(message)
	getUser.End
End Sub

'update recipes for an existing user
Sub updateRecipes(urec As Map)    'ignoreDeadCode
	Dim userid As String = urec.get("userid")
	Dim payload As Map = urec.get("payload")
	Dim uResponse As Map
	Dim uError As Map
	'create a new record / overwite existing record using key
	Dim updateRecipePromise As BANanoPromise = fb.CollectionSet("users", userid, payload)
	updateRecipePromise.then(uResponse)
	vm.ShowSnackBarSuccess("Recipes successfully updated!")
	updateRecipePromise.Else(uError)
	Dim message As String = fb.GetMessage(uError)
	vm.ShowSnackBarSuccess(message)
	vm.ShowSnackBarError(message)
	updateRecipePromise.End
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
	vm.NavBar.Hamburger.SetStatic(True)
	vm.navbar.AddHamburger
	vm.NavBar.Hamburger.AddClass(vm.VISIBILITY_HIDDEN_MD_AND_UP)
	'vm.NavBar.SetClippedLeft(True)
	
	'the progressbar for long operations
	vm.NavBar.Progress.SetColorIntensity(vm.COLOR_YELLOW, vm.INTENSITY_ACCENT4)
		
	'add a logo
	vm.NavBar.Logo.SetStatic(True)
	vm.NavBar.Logo.SetBorderRadius("50%")
	vm.NavBar.Logo.SetBorderWidth("1px")
	vm.NavBar.Logo.SetBorderColor("black")
	vm.NavBar.Logo.SetBorderStyle("solid")
	vm.NavBar.Logo.SetSize("46px","46px")
	vm.NavBar.AddLogo("./assets/sponge.png")
	vm.navbar.Logo.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	'vm.NavBar.Logo.RemoveVShow
	
	vm.NavBar.Title.SetStatic(True)
	vm.NavBar.SubHeading.SetStatic(True)
	vm.NavBar.AddTitle(Main.AppTitle,"")
	vm.NavBar.AddSubHeading1(Main.Version)
	vm.navbar.Title.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	vm.NavBar.SubHeading.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	vm.NavBar.Show
	
	vm.NavBar.SetModeFixed(True)
	vm.NavBar.SetColorIntensity(vm.COLOR_BROWN, vm.INTENSITY_DARKEN4)
	vm.NavBar.SetDark(True)
	'
	vm.NavBar.AddSpacer1(vm.VISIBILITY_HIDDEN_MD_AND_UP)
	'add home button
	Dim btnHome As VMElement = vm.VBtn("btnhome")
	btnHome.SetStatic(True)
	btnHome.SetText("Home")
	btnHome.SetTo("/")
	btnHome.SetFlat(True)
	btnHome.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	vm.NavBar.AddElement(btnHome)
	
	'add menu button
	Dim btnMenu As VMElement = vm.VBtn("btnmenu")
	btnMenu.SetStatic(True)
	btnMenu.SetText("Menu")
	btnMenu.SetTo("/plans")
	btnMenu.SetFlat(True)
	btnMenu.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	vm.NavBar.AddElement(btnMenu)
	'
	vm.NavBar.AddSpacer1(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	'
	Dim btnSignIn As VMElement = vm.VBtn("btnsignin")
	btnSignIn.SetStatic(True)
	btnSignIn.SetText("Sign In")
	btnSignIn.SetTo("/signin")
	btnSignIn.SetFlat(True)
	btnSignIn.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	btnSignIn.SetVIf("!$store.isauthenticated")
	vm.NavBar.AddElement(btnSignIn)
	'
	Dim btnJoin As VMElement = vm.VBtn("btnjoin")
	btnJoin.SetStatic(True)
	btnJoin.SetText("Sign Up")
	btnJoin.SetTo("/join")
	btnJoin.SetFlat(True)
	btnJoin.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	btnJoin.SetVIf("!$store.isauthenticated")
	btnJoin.SetColorIntensity(vm.COLOR_Brown, vm.intensity_lighten3)
	vm.NavBar.AddElement(btnJoin)
	'
	Dim btnProfile As VMElement = vm.VBtn("btnprofile")
	btnProfile.SetStatic(True)
	btnProfile.SetText("Profile")
	btnProfile.SetTo("/about")
	btnProfile.SetFlat(True)
	btnProfile.SetVIf("$store.isauthenticated")
	btnProfile.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	vm.NavBar.AddElement(btnProfile)
	'
	Dim btnlogout As VMElement = vm.VBtn("btnlogout")
	btnlogout.SetStatic(True)
	btnlogout.SetText("Logout").SetOnClick(Me, "btnlogout_click")
	btnlogout.SetVIf("$store.isauthenticated")
	btnlogout.SetColor(vm.COLOR_WHITE).SetOutlined
	btnlogout.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
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
	vm.SetDataGlobal("recipes", vue.newlist)
	vm.SetDataGlobal("userRecipes", vue.NewList)
	vm.NavigateTo("/")
	outUser.Else(outError)
	vm.SetDataGlobal("user", Null)
	vm.SetDataGlobal("isAuthenticated", False)
	vm.SetDataGlobal("recipes", vue.newlist)
	vm.SetDataGlobal("userRecipes", vue.NewList)
	vm.NavigateTo("/")
	outUser.end
End Sub

Sub BuildFooter
	vm.Footer.SetStatic(True)
	vm.footer.AddClass(vm.VISIBILITY_HIDDEN_SM_AND_DOWN)
	vm.Footer.RemoveVShow
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
	vm.Drawer.AddListItem(vm.CreateListItem("drwmenu", Me).SetItemTo("/plans").SetTitle("Menu")).AddListItemDivider
	vm.Drawer.AddListItem(vm.CreateListItem("drwprofile", Me).SetItemTo("/about").SetTitle("Profile")).AddListItemDivider
	vm.Drawer.AddListItem(vm.CreateListItem("drwsignin", Me).SetItemTo("/signin").SetTitle("Sign In")).AddListItemDivider
	vm.Drawer.AddListItem(vm.CreateListItem("drwjoin", Me).SetItemTo("/join").SetTitle("Sign Up"))
	
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