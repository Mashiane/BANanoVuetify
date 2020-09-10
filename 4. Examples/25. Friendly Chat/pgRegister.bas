B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private register As VMComponent
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private BANano As BANano
End Sub


'build the page
Sub Initialize
	vm = pgIndex.vm
	vue = pgIndex.vue
	
	'initialize the component,  the name of the component is 'register'
	register.Initialize(vue, "register", "/register", Me)
	'initialize the states values
	register.SetData("login", vue.NewMap)
	register.SetData("emailrules", vue.NewList)
	register.SetData("hidepassword", True)
	register.SetData("hideconfirmpassword", True)
	register.SetData("passwordrules", vue.newlist)
	register.SetData("confirmpasswordrules", vue.newlist)
	register.SetData("loading", False)
	
	'create a container
	Dim vregister As VMElement = vm.VContainer("vregister")
	'let it sit in the center of the page
	vregister.AddAttr("fluid", True).AddClass("fill-height")
	'create a row
	Dim r1 As VMElement = vm.VRow("").AddAttributes(CreateMap("align":"center","justify":"center"))
	'create a column
	Dim r1c1 As VMElement = vm.VCol("").AddSizes("8", "4", "4", "4")
	'create a card
	Dim scard As VMElement = vm.VCard("").AddClass("elevation-12")
	'create the card text
	Dim ctext As VMElement = vm.VCardText("")
	'add image
	Dim div As VMElement = vm.Div("").AddClass("layout column align-center")
	Dim img As VMElement = vm.Img("").AddAttributes(CreateMap("src":"./assets/vuejs.png", "alt":"VueJS Logo", "width":"180","height":"180"))
	Dim h1 As VMElement = vm.H1("").AddClass("flex my-4 primary--text").SetText("Register")
	div.AddStyle("margin-top", "-100px")
	div.AddElement(img)
	div.AddElement(h1)
	ctext.AddElement(div)
	
	'create a form
	Dim cform As VMElement = vm.Form("frmregister")
	'create email input
	Dim txtEmail As VMElement = vm.VTextField("txtemail")
	txtEmail.AddAttributes(CreateMap("append-icon": "person", "name":"email", "label":"Email Address", "type":"email"))
	txtEmail.AddAttributes(CreateMap("v-model": "login.email","required":True))
	txtEmail.AddAttributes(CreateMap(":rules": "emailrules","autocomplete":"off"))
	cform.AddElement(txtEmail)
	'create password input
	Dim txtPassword As VMElement = vm.VTextField("txtpassword")
	txtPassword.AddAttributes(CreateMap(":type": "hidepassword ? 'password' : 'text'"))
	txtPassword.AddAttributes(CreateMap(":append-icon": "hidepassword ? 'visibility_off' : 'visibility'"))
	txtPassword.AddAttributes(CreateMap("name":"password", "label":"Password", "v-model":"login.password"))
	txtPassword.AddAttributes(CreateMap("@click:append": "hidepassword = !hidepassword","required":True))
	txtPassword.AddAttributes(CreateMap(":rules":"passwordrules","autocomplete":"off"))
	cform.AddElement(txtPassword)
	'confirm email
	Dim txtConfirmPassword As VMElement = vm.VTextField("txtconfirmpassword")
	txtConfirmPassword.AddAttributes(CreateMap(":type": "hideconfirmpassword ? 'password' : 'text'"))
	txtConfirmPassword.AddAttributes(CreateMap(":append-icon": "hideconfirmpassword ? 'visibility_off' : 'visibility'"))
	txtConfirmPassword.AddAttributes(CreateMap("name":"password", "label":"Confirm Password", "v-model":"login.confirmpassword"))
	txtConfirmPassword.AddAttributes(CreateMap("@click:append": "hideconfirmpassword = !hideconfirmpassword","required":True))
	txtConfirmPassword.AddAttributes(CreateMap(":rules":"confirmpasswordrules","autocomplete":"off"))
	cform.AddElement(txtConfirmPassword)
	
	'add form to the card text
	ctext.AddElement(cform)
	'add card text to the card
	scard.AddElement(ctext)
	
	'card actions
	Dim cactions As VMElement = vm.VCardActions("")
	cactions.AddSpacer
	'add a button to the card actions
	Dim btnSignIn As VMElement = vm.VBtn("")
	btnSignIn.AddAttributes(CreateMap("color":"primary", "@click": "loginy", ":loading":"loading")).SetText("Register")
	cactions.AddElement(btnSignIn)
	'add a divider to the card
	scard.AddDivider
	'add card actions to the card
	scard.AddElement(cactions)
	'add the card tp r1c1
	r1c1.AddElement(scard)
	'add r1c1 to r1
	r1.AddElement(r1c1)
	'add r1 to the container
	vregister.AddElement(r1)
	
	'add container to component template
	register.AddElement(vregister)
	'register a method
	register.SetMethod(Me, "loginy")
	
	'adding rules
	Dim v As Object
	Dim checkemailcallback As BANanoObject = BANano.CallBack(Me, "checkemail", Array(v))
	Dim emailrules As List = vue.newlist
	emailrules.Add(checkemailcallback.Result)
	register.SetData("emailrules", emailrules)
	
	'
	Dim passwordrulesCB As BANanoObject = BANano.CallBack(Me, "checkpassword", Array(v))
	Dim passwordrules As List = vue.newlist
	passwordrules.Add(passwordrulesCB.Result)
	register.SetData("passwordrules", passwordrules)
	
	Dim confirmpasswordrulesCB As BANanoObject = BANano.callback(Me, "checkconfirmpassword", Array(v))
	Dim confirmpasswordrules As List = vue.newlist
	confirmpasswordrules.add(confirmpasswordrulesCB.Result)
	register.SetData("confirmpasswordrules", confirmpasswordrules)
	
	'add the component as a router/page
	vm.AddRoute(register)
End Sub

Sub checkemail(v As String) As Object
	If v = "" Then 
		Return "The email should be specified!"
	Else
		Return True
	End If	
End Sub

Sub checkpassword(v As String) As Object
	If v = "" Then 
		Return "The password should be specified!"
	Else
		Return True
	End If	
End Sub

Sub checkconfirmpassword(v As String) As Object
	If v = "" Then
		Return "The confirm password should be specified!"
	Else
		Return True
	End If
End Sub

'define the callback
Sub loginy(e As BANanoEvent)
	'get the captured details 
	Dim userdata As Map = register.getdata("login")
	Dim semail As String = userdata.get("email")
	Dim spassword As String = userdata.get("password")
	
	If semail = "" Or spassword = "" Then Return 
	'show loading on the button
	register.SetData("loading", True)
	'get the firebase firestore reference
	Dim fb As BANanoFireStoreDB = pgIndex.fb
	'try and register the user using email and password
	Dim regResponse As Map
	Dim regError As Map
	Dim reguser As BANanoPromise = fb.CreateUserWithEmailAndPassword(semail, spassword)
	reguser.ThenWait(regResponse)
	'turn loading off
	register.SetData("loading", False)
	'sign out
	fb.signOut
	reguser.Else(regError)
	'there was an error registering users
	Dim msg As String = fb.getMessage(regError)
	'show error on snack bar
	pgIndex.ShowSnackBarError(msg)
	'turn loading off
	register.SetData("loading", False)
	reguser.End
End Sub