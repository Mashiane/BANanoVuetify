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
	Public fb As BANanoFireStoreDB
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
	'
	'connect to firebase
	fb.Initialize
	'use your own credentials
	fb.apiKey = "AIzaSyDBijdfdG3KPx7qd5-jDGrRNr2RRXWS57o"
	fb.authDomain = "fbtests-f9490.firebaseapp.com"
	fb.databaseURL = "https://fbtests-f9490.firebaseio.com"
	fb.projectId = "fbtests-f9490"
	fb.storageBucket = "fbtests-f9490.appspot.com"
	fb.messagingSenderId = "905575318254"
	fb.appId = "1:905575318254:web:fb5c35cdc13288aeb329ff"
	fb.measurementId = "G-41GS0509JY"
	fb.connect
	'enable timestamps
	fb.timestampsInSnapshots
	'enable persistence
	fb.enablePersistence
	'detect login changes
	fb.onAuthStateChanged(Me, "onAuthStateChanged")
	'
	'add different pages
	'the app will know to use the router
	pghome.Initialize
	pgabout.Initialize
	pgSignIn.Initialize
	pgRegister.Initialize
	'
	vue.SetDataGlobal("showmessages", False)
	'
	vm.ux
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

'if state is changed
Sub onAuthStateChanged(user As Map)
	If BANano.isnull(user) Or BANano.IsUndefined(user) Then
		'user is not logged in
		vue.CallMethod("reset")
		Return
	End If
	'
	'get the logged in user details
	Dim activeUser As Map = fb.GetUserData(user)
	Dim sdisplayName As String = activeUser.get("displayName")
	Dim semail As String = activeUser.Get("email")
	Dim sphotoURL As String = activeUser.get("photoURL")
	Dim suid As String = activeUser.get("uid")
	'update some states
	If sphotoURL = "" Then sphotoURL = "./assets/avatar.png"
	If sdisplayName = "" Then sdisplayName = semail
	'
	vue.SetdataGlobal("userximage", sphotoURL)
	vue.SetdataGlobal("userxalt", sdisplayName)
	vue.SetdataGlobal("displayname", sdisplayName)
	vue.setdataglobal("signedin", True)
	vue.SetdataGlobal("user", activeUser)
	vue.setdataglobal("msgmessage", False)
	'
	vm.CallMethod("LoadMessages")
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
	'set number of online users
	vm.SetData("onlineusers", "")
	
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
	Dim lic As VMElement = vm.VListItemContent("lic").SetText("Online Users {{ onlineusers }}")
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
	Dim title As VMElement = vm.VToolbarTitle("tbltitle").SetText("Friendly Chat {{ $store.displayname }}")
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
	
	'
	Dim btnSignIn As VMElement = vm.VBtn("btnSignIn").AddAttr("text", True).AddClass("white--text")
	'show if signin = false
	btnSignIn.AddAttr("v-if", "!$store.signedin")
	btnSignIn.AddAttr("@click", "signin")
	'add icon to button
	Dim signicon As VMElement = vm.VIcon("").SetText("mdi-google")
	btnSignIn.AddElement(signicon)
	
	'add button to appbar
	btnSignIn.AddToParent(appBar)
	'add vertical divider
	appBar.AddVerticalDivider("mx-2")
	
	Dim btnSignOut As VMElement = vm.VBtn("btnSignOut").AddAttr("text", True).SetText("Sign Out").AddClass("white--text")
	'show if we are signed in
	btnSignOut.AddAttr("v-if", "$store.signedin")
	btnSignOut.AddAttr("@click", "signout")
	btnSignOut.AddToParent(appBar)
	'add vertical divider
	appBar.AddVerticalDivider("mx-2")
	
	'add navBar To the app
	appBar.AddToParent(vm.VApp)
	'register reset method
	vm.SetMethod(Me, "reset")
	'register a method
	vm.SetMethod(Me, "signin")
	'register the sign out method
	vm.SetMethod(Me, "signout")
	vm.SetMethod(Me, "LoadMessages")
	vm.SetMethod(Me, "toggledrawer")
	vm.SetMethod(Me, "addmessage")
	vm.SetMethod(Me, "login")
	vm.SetMethod(Me, "register")
	vm.SetMethod(Me, "dateoconv")
	'initialize states
	reset
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

'add the message from this user
Sub AddMessage(messageText As String)
	Dim activeUser As Map = vue.GetDataGlobal("user")
	If BANano.isnull(activeUser) Or BANano.IsUndefined(activeUser) Then 
		'user is not logged in
		vue.CallMethod("reset")
		Return 
	End If
	Dim sdisplayName As String = activeUser.get("displayName")
	Dim semail As String = activeUser.Get("email")
	Dim sphotoURL As String = activeUser.get("photoURL")
	Dim suid As String = activeUser.get("uid")
	'
	Dim nm As Map = CreateMap()
	nm.put("name", sdisplayName)
	nm.put("text", messageText)
	nm.put("profilepicurl", sphotoURL)
	nm.put("timestamp", newDate)
	'add message to messages
	Dim res As Map
	Dim err As Map
	Dim nmp As BANanoPromise
	nmp = fb.collectionAdd("messages", nm)
	nmp.Then(res)
	vue.setdataglobal("message", "")
	nmp.Else(err)
	nmp.End
End Sub

'load 12 messages
Sub LoadMessages
	'listen to change in the messages collection
	Dim query As BANanoObject = fb.getCollection("messages")
	query = fb.SetOrderBy(query, "timestamp", fb.FB_DESC)
	query = fb.SetLimit(query, 10)
	'
	fb.SetOnSnapShot(query, Me, "onmessageschanges")
End Sub

Sub onmessageschanges(snapshot As Map)
	'get document changes
	Dim recs As List = fb.FromJSON(snapshot)
	'Dim recs As List = fb.docChanges(snapshot)
	'For Each rec As Map In recs
	'	If fb.isremoved(rec) Then
	'	Else
	'	End If
	'Next
	vue.setdataglobal("messages", recs)
End Sub

Sub newDate As String
	Dim obj As BANanoObject
	Dim sdate As String = obj.Initialize2("Date", Null).RunMethod("toISOString", Null).Result
	Return sdate
End Sub


'reset some stuff
Sub reset
	vue.SetdataGlobal("userximage", "./assets/avatar.png")
	vue.SetdataGlobal("userxalt", "User")
	vue.SetdataGlobal("displayname", "")
	vue.setdataglobal("signedin", False)
	vue.SetdataGlobal("user", vue.NewMap)
	vue.Setdataglobal("messages", vue.newlist)
	vue.setdataglobal("msgmessage", True)
	vue.SetDataGlobal("message", "")
	Try
		vue.NavigateTo("/")
	Catch
		Log(LastException)
	End Try
End Sub

'the callback to sign out
Sub signout(e As BANanoEvent)
	fb.signOut
End Sub

'the callback to sign in
Sub signin(e As BANanoEvent)
	Try
		vue.NavigateTo("/")
	Catch
		Log(LastException)
	End Try
	fb.signInWithPopupGoogle
End Sub
