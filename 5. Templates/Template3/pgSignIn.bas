B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private signin As VMComponent
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private BANAno As BANano
End Sub


'build the page
Sub Initialize
	vm = pgIndex.vm
	vue = pgIndex.vue
	
	'initialize the component,  the name of the component is 'signin'
	signin.Initialize(vue, "signin", "/signin", Me)
	'initialize the states values
	signin.SetData("login", vue.NewMap)
	signin.SetData("error", False)
	signin.SetData("emailrules", vue.NewList)
	signin.SetData("hidepassword", True)
	signin.SetData("passwordrules", vue.newlist)
	signin.SetData("loading", False)
	
	'create a container
	Dim vsignin As VMElement = vm.VContainer("vsignin")
	'let it sit in the center of the page
	vsignin.AddAttr("fluid", True).AddClass("fill-height")
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
	Dim h1 As VMElement = vm.H1("").AddClass("flex my-4 primary--text").SetText("Sign In")
	div.AddStyle("margin-top", "-100px")
	div.AddElement(img)
	div.AddElement(h1)
	ctext.AddElement(div)
	
	'create a form
	Dim cform As VMElement = vm.Form("frmsignin")
	'create email input
	Dim txtEmail As VMElement = vm.VTextField("txtemail")
	txtEmail.AddAttributes(CreateMap("append-icon": "person", "name":"email", "label":"Email Address", "type":"email"))
	txtEmail.AddAttributes(CreateMap("v-model": "login.email","required":True,"autocomplete":"off"))
	txtEmail.AddAttributes(CreateMap(":rules": "emailrules1"))
	cform.AddElement(txtEmail)
	'create password input
	Dim txtPassword As VMElement = vm.VTextField("txtpassword")
	txtPassword.AddAttributes(CreateMap(":type": "hidepassword ? 'password' : 'text'"))
	txtPassword.AddAttributes(CreateMap(":append-icon": "hidepassword ? 'visibility_off' : 'visibility'"))
	txtPassword.AddAttributes(CreateMap("name":"password", "label":"Password", "v-model":"login.password"))
	txtPassword.AddAttributes(CreateMap("@click:append": "hidepassword = !hidepassword","required":True,"autocomplete":"off"))
	txtPassword.AddAttributes(CreateMap(":rules":"passwordrules1"))
	cform.AddElement(txtPassword)
	'add form to the card text	
	ctext.AddElement(cform)
	'add card text to the card
	scard.AddElement(ctext)
	
	'card actions
	Dim cactions As VMElement = vm.VCardActions("")
	cactions.AddSpacer
	'add a button to the card actions
	Dim btnSignIn As VMElement = vm.VBtn("")
	btnSignIn.AddAttributes(CreateMap("color":"primary", "@click": "signinuser", ":loading":"loading")).SetText("Login")
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
	vsignin.AddElement(r1)
	
	'add container to component template
	signin.AddElement(vsignin)
	'register a method
	signin.SetMethod(Me, "signinuser")
	
	'
	'adding rules
	Dim v As Object
	Dim checkemailcallback As BANanoObject = BANAno.CallBack(Me, "checkemail1", Array(v))
	Dim emailrules As List = vue.newlist
	emailrules.Add(checkemailcallback.Result)
	signin.SetData("emailrules1", emailrules)
	
	'
	Dim passwordrulesCB As BANanoObject = BANAno.CallBack(Me, "checkpassword1", Array(v))
	Dim passwordrules As List = vue.newlist
	passwordrules.Add(passwordrulesCB.Result)
	signin.SetData("passwordrules1", passwordrules)
	
	'add the component as a router/page
	vm.AddRoute(signin)
End Sub


Sub checkemail1(v As String) As Object
	If v = "" Then
		Return "The email should be specified!"
	Else
		Return True
	End If
End Sub

Sub checkpassword1(v As String) As Object
	If v = "" Then
		Return "The password should be specified!"
	Else
		Return True
	End If
End Sub


'define the callback
Sub signinuser(e As BANanoEvent)
	'get the user details
	Dim userdata As Map = signin.getdata("login")
	Dim semail As String = userdata.get("email")
	Dim spassword As String = userdata.get("password")
	
	'show loading
	signin.SetData("loading", True)
	
End Sub