B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12, 15
Sub Process_Globals
	Private BANano As BANano  'ignore
	Public vm As BANanoVM
	Private vue As BANanoVue   'ignore
	Private fb As BANanoFireStoreDB
	Private activeuser As VMMenu
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	vue = vm.vue
	'set the current user
	vm.setdata("currentUser", Null)
	vm.setdata("displayname", Null)
	vm.setdata("token", Null)
	'initialize firebase
	fb.Initialize
	'use credentials to connect
	fb.apiKey = "AIzaSyDBijdfdG3KPx7qd5-jDGrRNr2RRXWS57o"
	fb.authDomain = "fbtests-f9490.firebaseapp.com"
	fb.databaseURL = "https://fbtests-f9490.firebaseio.com"
	fb.projectId = "fbtests-f9490"
	fb.storageBucket = "fbtests-f9490.appspot.com"
	fb.messagingSenderId = "905575318254"
	fb.appId = "1:905575318254:web:fb5c35cdc13288aeb329ff"
	fb.measurementId = "G-41GS0509JY"
	'connect to firebase
	fb.connect
	'
	'detect onAuthStateChanged
	fb.onAuthStateChanged(Me, "onAuthStateChanged")
	
	BuildNavBar
	BuildNavDrawer
	BuildBottomNav
	BuildFooter
	'
	vm.ux
	'

End Sub

'fires everytime authentication changes
Sub onAuthStateChanged(user As Object)
	Log("onAuthStateChanged")
	Dim isauthenticated As Boolean
	Dim profileV As Map = CreateMap()
	If BANano.isnull(user) Or BANano.isundefined(user) Then
		'user not authenticated
		isauthenticated = False
		vm.setdata("currentUser", Null)
	Else
		'user authenticated
		isauthenticated = True
		'get the user data
		Dim usr As Map = fb.GetUserData(user)
		vm.setdata("currentUser", usr)
	End If
	'update menu item visibility
	profileV.Put("menulogin", Not(isauthenticated))
	profileV.put("menuuserprofile", isauthenticated)
	profileV.put("menulogoff", isauthenticated)
	activeuser.SetItemVisibility(profileV)
	'
	vm.setdata("isauthenticated", isauthenticated)
	'update profile details
	UpdateProfileImage
End Sub

'build the footer of the page
Sub BuildFooter
	'*copy code after this line
	vm.Footer.SHow
	vm.Footer.SetFixed(True)
	vm.Footer.SetColorIntensity(vm.COLOR_BROWN, vm.INTENSITY_LIGHTEN1)
	vm.footer.Container.SetTag("div")
	vm.footer.Container.AddRows(1).AddColumns12
	vm.Footer.Container.SetAttrRC(1, 0, "align", "center")
	vm.Footer.AddMadeWithLove(1, 1, "with B4J, BANanano & BANanoVuetify by", "TheMash", "mbanga.anele@gmail.com")
End Sub

'build the bottom nav bar
Sub BuildBottomNav
	'*copy code after this line
	
End Sub

'build the navigation bar
Sub BuildNavBar
	'*copy code after this line
	'add a hamburger
	vm.SnackBar.SetColor("green")
	vm.SnackBar.SetTop(True)
	'
	vm.NavBar.SetVisible(True)
	vm.NavBar.SetModeFixed(True)
	vm.NavBar.SetClippedLeft(True)
	vm.NavBar.SetColorIntensity(vm.COLOR_BROWN, vm.INTENSITY_LIGHTEN1)
	vm.NavBar.SetDark(True)
	'
	vm.NavBar.AddHamburger
	vm.NavBar.Hamburger.SetVisible(False)
	vm.NavBar.Progress.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	'
	'add a logo
	'vm.NavBar.Logo.SetBorderRadius("50%")
	'vm.NavBar.Logo.SetBorderWidth("1px")
	'vm.NavBar.Logo.SetBorderColor("black")
	'vm.NavBar.Logo.SetBorderStyle("solid")
	'vm.NavBar.Logo.SetSize("46px","46px")
	'vm.NavBar.AddLogo("./assets/sponge.png")
	'vm.NavBar.Logo.Hide
	'
	vm.NavBar.AddTitle(Main.AppTitle,"")
	vm.NavBar.AddSubHeading1(Main.Version)
	vm.NavBar.AddSpacer
	'
	'add a displayname
	Dim lblName As VMLabel
	lblName.Initialize(vue, "lblName")
	lblName.SetText("{{ displayname }}")
	vm.NavBar.AddComponent("displayname", lblName.tostring)
	'add divider
	vm.NavBar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	'the user is not authenticated
	vm.setdata("isauthenticated", False)
	'create a menu for the user
	activeuser = vm.CreateMenu("activeuser", Me)
	activeuser.SetTransition(vm.TRANSITION_FAB)
	'menu options appear depending on state
	activeuser.UseVisibility
	'set the generic avatar
	activeuser.SetAvatar("./assets/avatar.png")
	'show this when the user is not logged in
	activeuser.AddItemV("menulogin", "", "mdi-login", "Login", "","", True)
	'show when the user is logged in
	activeuser.AddItemV("menuuserprofile", "", "mdi-account-outline", "My Profile", "", "", False)
	activeuser.AddItemDivider
	'show when the user is logged in
	activeuser.AddItemV("menulogoff", "", "mdi-logout", "Logout", "","",False)
	vm.NavBar.AddMenu(activeuser)
	'
	vm.NavBar.Show
End Sub

Sub menuuserprofile
	
End Sub

'the user has clicked the sign out button
Sub menulogoff
	Dim oRes As Map
	Dim oErr As Map
	'execute the sign out promise
	Dim signOut As BANanoPromise = fb.signOut
	signOut.Then(oRes)
		'the user is signed out, disable stuff
		vm.setdata("isauthenticated", False)
		vm.setdata("currentUser", Null)
	signOut.Else(oErr)
		'show the error
		Dim serror As String = fb.getMessage(oErr)
		vm.ShowSnackBarError(serror)
	signOut.end
	'update user profile
	UpdateProfileImage
End Sub


'clicked a button to login
Sub menuLogin
	Log("signInWithPopupGoogle")
	'show the login screen of gmail
	Dim googleR As Map
	Dim googleE As Map
	Dim googleSign As BANanoPromise = fb.signInWithPopupGoogle
	googleSign.Then(googleR)
	'get the access token
	Dim token As String = fb.getAccessToken(googleR)
	vm.setdata("token", token)
	'get the user
	Dim usr As Map = fb.getUser(googleR)
	'get the user data
	usr = fb.GetUserData(usr)
	'save the user
	vm.setdata("currentUser", usr)
	'we have an error
	googleSign.Else(googleE)
	vm.setdata("currentUser", Null)
	vm.setdata("token", Null)
	Dim thisError As String = fb.getmessage(googleE)
	vm.ShowSnackBarError(thisError)
	googleSign.End
	'update the user profile
	UpdateProfileImage
End Sub

'update profile
Sub UpdateProfileImage
	Dim photoURL As String
	Dim displayName As String
	Dim currentUser As Map = vm.Getdata("currentUser")
	If BANano.isnull(currentUser) Or BANano.isundefined(currentUser) Then
		photoURL = ""
		displayName = ""
	Else	
		'get the photo url
		photoURL = currentUser.getdefault("photoURL","")
		displayName = currentUser.getdefault("displayName", "")
	End If
	'update the profile photo
	Select Case photoURL
	Case ""
		'show the generic avatar
		activeuser.UpdateAvatar("./assets/avatar.png")
	Case Else
		activeuser.UpdateAvatar(photoURL)
	End Select
	'update the display name
	vm.setdata("displayName", displayName)
End Sub

'build the nav drawer
Sub BuildNavDrawer
	'*copy code after this line
	vm.Drawer.SetClipped(True)
	vm.Drawer.AddTitleSubTitle(Main.AppName, Main.Version)
	vm.Drawer.SetWidth("430")
	vm.Drawer.Setabsolute(True)
	vm.Drawer.SetHideOverlay(True)
	vm.drawer.Container.SetNoGutters(True)
End Sub

'add pages to the app
Sub AddPages
	'*copy code after this line
End Sub

Sub activeuseritems_click(e As BANanoEvent)
	Dim elID As String = vm.GetIDFromEvent(e)
	Select Case elID
	Case "menulogoff"
		menulogoff
	Case "menulogin"
		menuLogin
	Case "menuuserprofile"
		menuuserprofile
	End Select
End Sub

'*IMPORTANT when a drawer item is clicked
Sub draweritems_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	Select Case elID
	End Select
End Sub

'confirm dialog ok click
Sub confirm_ok(e As BANanoEvent)
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
	'copy code below this line
	End Select
End Sub

'confirm dialog cancel click
Sub cancel_ok(e As BANanoEvent)

End Sub

'alert dialog ok clock
Sub alert_ok(e As BANanoEvent)

End Sub

'confirm dialog cancel click
Sub confirm_cancel(e As BANanoEvent)

End Sub

'fired when the logo is clicked
Sub logo_click(e As BANanoEvent)
	'you could show the home page
End Sub

'fired when the title is clicked
Sub title_click(e As BANanoEvent)
	'you could show the home page
End Sub

'fire when a button in the bottom nav is clicked
Private Sub bottomnav_change(value As Object)
	
End Sub

'toggle bottom bar visibility trap
Private Sub bottomnav_updateinputvalue(value As Object)
End Sub