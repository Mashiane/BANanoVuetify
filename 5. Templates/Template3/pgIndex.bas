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
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.AppName)
	vue = vm.vue
	'we want to use a blank template
	vm.UseBlankTemplate
	'
	BuildDrawer
	BuildNavBar
	BuildSnackBar
	
	pgSignIn.Initialize
	pgRegister.Initialize
	'
	vm.ux
	'
	vm.CallMethod("signout")
	vue.NavigateTo("/signin")
End Sub

Sub BuildSnackBar
	vue.SetDataGlobal("snackshow", False)
	vue.SetDataGlobal("snackmsg", "")
	vue.SetDataGlobal("snackcolor", "")
	Dim snack As VMElement = vm.VSnackBar("").AddAttr("v-model", "$store.snackshow").SetText("{{ $store.snackmsg }}")
	snack.AddAttributes(CreateMap(":multi-line": True, "app":True,"centered":True,":color":"$store.snackcolor",":shaped":True))
	vm.VApp.AddElement(snack)
End Sub

Sub ShowSnackBarError(msg As String)
	vue.SetDataGlobal("snackshow", True)
	vue.SetDataGlobal("snackmsg",msg)
	vue.SetDataGlobal("snackcolor", "error")
End Sub

Sub ShowSnackBarSuccess(msg As String)
	vue.SetDataGlobal("snackshow", True)
	vue.SetDataGlobal("snackmsg",msg)
	vue.SetDataGlobal("snackcolor", "success")
End Sub

Sub BuildDrawer
	'create a nav drawer
	Dim drawer As VMElement = vm.VNavigationDrawer("drawerx")
	'bind visibility state
	drawer.AddAttr("v-model", "drawer")
	'set absolute position
	drawer.AddAttr("absolute", True)
	'drawer should be temporary
	drawer.AddAttr("temporary", True)
	'the drawer is linked to the app
	drawer.AddAttr("app", True)
	'drawer is hidden
	vm.setdata("drawer", False)
	
	'add list to drawer
	Dim drawerList As VMElement = vm.VList("drawerlist")
	'list item
	Dim li As VMElement = vm.VListItem("li")
	'list action
	Dim la As VMElement = vm.VListItemAction("lia")
	'icon
	Dim icn As VMElement = vm.VIcon("liaicn").SetText("mdi-account")
	
	icn.AddToParent(la)
	la.AddToParent(li)
	
	'list content
	Dim lic As VMElement = vm.VListItemContent("lic").SetText("Online Users")
	lic.AddToParent(li)
	'
	li.AddToParent(drawerList)
	drawerList.AddToParent(drawer)
		
	'add drawer To the app
	drawer.AddToParent(vm.VApp)
End Sub

Sub BuildNavBar
	'create the app bar
	Dim appBar As VMElement = vm.VAppBar("navbar").AddAttr("color", "primary")
	'create hamburger
	Dim hamburger As VMElement = vm.VAppBarNavIcon("hamburger")
	hamburger.AddAttr("@click.native.stop", "toggledrawer")
	'add hamburger to appbar
	hamburger.AddToParent(appBar)
	
	'create the avatar
	Dim avatar As VMElement = vm.VAvatar("userx").AddClass("mr-2")
	'create an image
	Dim img As VMElement = vm.img("userximg")
	'bind the image source to a state
	img.AddAttr(":src", "$store.userximage")
	img.AddAttr(":alt", "$store.userxalt")
	
	'add image to avatar
	img.AddToParent(avatar)
	'add avatar to appbar
	avatar.AddToParent(appBar)
	
	'create the toolbar title
	Dim title As VMElement = vm.VToolbarTitle("tbltitle").SetText("Template3 {{ $store.displayname }}")
	title.AddClass("headline").AddClass("white--text")
	title.AddClass("hidden-sm-and-down")
	'add title To the toolbar
	title.AddToParent(appBar)
	
	'add a spacer (will right alight everything else)
	appBar.AddSpacer
	
	'login
	Dim btnLogin As VMElement = vm.VBtn("btnLogin").AddAttr("text", True).SetText("Login").AddClass("white--text")
	btnLogin.AddAttr("v-if", "!$store.signedin")
	btnLogin.AddAttr("@click", "login")
	appBar.AddElement(btnLogin)
	'add vertical divider
	appBar.AddVerticalDivider("mx-2")
	'register
	Dim btnRegister As VMElement = vm.VBtn("btnRegister").AddAttr("text", True).SetText("Register").AddClass("white--text")
	btnRegister.AddAttr("v-if", "!$store.signedin")
	btnRegister.AddAttr("@click", "register")
	appBar.AddElement(btnRegister)
	'add vertical divider
	appBar.AddVerticalDivider("mx-2")
	
	Dim btnSignOut As VMElement = vm.VBtn("btnSignOut").AddAttr("text", True).SetText("Sign Out").AddClass("white--text")
	'show if we are signed in
	btnSignOut.AddAttr("v-if", "$store.signedin")
	btnSignOut.AddAttr("@click", "signout")
	btnSignOut.AddToParent(appBar)
	
	'add navBar To the app
	appBar.AddToParent(vm.VApp)
	'register the sign out method
	vm.SetMethod(Me, "signout")
	vm.SetMethod(Me, "toggledrawer")
	vm.SetMethod(Me, "login")
	vm.SetMethod(Me, "register")
	vm.SetMethod(Me, "dateoconv")
End Sub

Sub register
	vue.NavigateTo("/register")
End Sub

Sub login
	vue.NavigateTo("/signin")
End Sub

Sub toggledrawer(e As BANanoEvent)
	vm.ToggleState("drawer")
End Sub

'reset some stuff
Sub signout
	vue.SetdataGlobal("userximage", "./assets/avatar.png")
	vue.SetdataGlobal("userxalt", "User")
	vue.SetdataGlobal("displayname", "")
	vue.setdataglobal("signedin", False)
	vue.SetdataGlobal("user", vue.NewMap)
End Sub
