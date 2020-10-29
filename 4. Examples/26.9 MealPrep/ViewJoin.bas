B4J=true
Group=Default Group\Views
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private join As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
	Private fb As BANanoFireStoreDB
End Sub

Sub Initialize
	'get the app instance
	vm = pgIndex.vm
	'get the view instance
	vue = vm.vue
	'initialize the component
	join.Initialize(vue, "join", "/join", Me)
	'setstatic = no state bindinds
	Dim cont As VMContainer = vm.CreateContainer("contjoin", Me)
	cont.SetFluid(True)
	cont.SetFillHeight(True)
	cont.SetCoverImage("./assets/register.jpg")
	cont.SetStyleSingle("max-height", "100vh")
	join.SetData(cont.ShowKey, True)
	'
	Dim vlay As VMElement = vm.VLayout("")
	vlay.SetStatic(True)
	vlay.SetAlign("center").SetJustify("center")
	'
	Dim vflex As VMElement = vm.vflex("")
	vflex.SetStatic(True)
	vflex.AddClass("xs12 sm8 md4")
	
	Dim vcard As VMElement = vm.VCard("")
	vcard.SetStatic(True)
	vcard.SetElevation("12")
	'
	Dim vtoolbar As VMElement = vm.vtoolbar("")
	vtoolbar.SetStatic(True)
	vtoolbar.SetDark(True).SetColor(vm.COLOR_BROWN)
	'
	Dim vtitle As VMElement = vm.vtoolbartitle("")
	vtitle.SetStatic(True)
	vtitle.SetText("Sign Up").AddClass(vm.COLOR_WHITE_TEXT)
	vtoolbar.AddElement(vtitle)
	vcard.AddElement(vtoolbar)
	'
	Dim vcardtext As VMElement = vm.vcardtext("")
	vcardtext.SetStatic(True)
	'
	Dim vform As VMElement = vm.vform("frmjoin")
	vform.SetStatic(True)
	'set ref to be able to access the form
	vform.SetRef("frmjoin").SetVModel("joinvalid").SetLazyValidation
	join.setdata("joinvalid", False)
	'
	Dim email As VMElement = vm.VTextField("txtemail")
	email.SetStatic(True)
	email.SetPrependIcon("mdi-account-circle")
	email.SetName("email", False)
	email.SetLabel("Email")
	email.SetType("email")
	email.SetVModel("email")
	email.SetAutoComplete("off")
	email.bind(":rules", "emailrules")
	email.setRequired(True)
	vform.AddElement(email)
	'set v model
	join.SetData("email", "")
	'add rule
	join.AddRule("emailrules", Me, "emailrequired")
	'
	Dim password As VMElement = vm.vTextField("txtpassword")
	password.SetStatic(True)
	password.SetPrependIcon("mdi-lock")
	password.SetName("password", False)
	password.Setlabel("Password")
	password.SetPassword(True, True)
	password.SetRequired(True)
	password.SetVModel("password")
	password.Bind(":rules", "passwordrules")
	vform.AddElement(password)
	'set toggling
	join.setdata(password.password, False)
	'set vmodel
	join.SetData("password", "")
	'add the rule and its callback
	join.AddRule("passwordrules", Me, "passwordrequired")
	join.AddRule("passwordrules", Me, "passwordlength")
	
	vcardtext.AddElement(vform)
	
	vcard.AddElement(vcardtext)
	'
	Dim vcardactions As VMElement = vm.VCardActions("")
	vcardactions.SetStatic(True)
	'
	Dim vspacer As VMElement = vm.VSpacer("")
	vspacer.SetStatic(True)
	'
	vcardactions.AddElement(vspacer)
	'
	Dim vbtn As VMElement = vm.VBtn("btnSubmit")
	vbtn.SetStatic(True)
	vbtn.SetColor(vm.COLOR_BROWN).AddClass(vm.COLOR_WHITE_TEXT)
	'bind disabled to validility of form
	vbtn.Bind(":disabled", "!joinvalid")
	'set attribute
	vbtn.SetEvent("@click", "submit")
	vbtn.SetText("Sign Up")
	'register event on view
	join.SetMethod(Me, "submit")
	vcardactions.AddElement(vbtn)
	'
	vcard.AddElement(vcardactions)

	vflex.AddComponent(vcard.tostring)
	vlay.AddElement(vflex)
	cont.AddComponent(0, 0, vlay.tostring)
	'set the template for the page
	join.SetTemplate(cont.tostring)
	
	'add the component as a router/page for the app
	vm.AddRoute(join)
End Sub


Sub submit(e As BANanoEvent)    'IgnoreDeadCode
	'get the email and password
	Dim semail As String = join.GetData("email")
	Dim spassword As String = join.getdata("password")
	'try and sign up to fire base
	fb = pgIndex.fb
	'register a user (enable authentication)
	Dim regResponse As Map
	Dim regError As Map
	'create a user using the email and password
	Dim reguser As BANanoPromise = fb.CreateUserWithEmailAndPassword(semail, spassword)
	reguser.Then(regResponse)
	'get user details
	Dim user As Map = fb.CurrentUser
	'save the user details
	vm.SetDataGlobal("user", user)
	'mark the user as authenticated
	vm.SetDataGlobal("isAuthenticated", True)
	'add user to the users collection
	Dim userid As String = user.get("uid")
	'add the user to the users collection
	vm.RunMethod("addUser", userid)
	reguser.Else(regError)
	vm.SetDataGlobal("user", Null)
	vm.SetDataGlobal("isAuthenticated", False)
	'there was an error
	Dim message As String = fb.GetMessage(regError)
	vm.ShowSnackBarError(message)
	reguser.End
	
End Sub

'rule for the email required
Sub emailrequired(v As String) As Object  'IgnoreDeadCode
	v = v.trim
	If v = "" Then 
		Return "The email is required!"
	Else
		Return True
	End If
End Sub

Sub passwordlength(v As String) As Object   'IgnoreDeadCode
	v = v.trim
	If v.Length < 6 Then
		Return "The password length should be more than 6 characters!"
	Else
		Return True
	End If
End Sub

'rule for the email required
Sub passwordrequired(v As String) As Object   'IgnoreDeadCode
	v = v.trim
	If v = "" Then 
		Return "The password is required!"
	Else
		Return True
	End If
End Sub