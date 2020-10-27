B4J=true
Group=Default Group\Views
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private signin As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
	Private banano As BANano
	Private vcontainer As VueElement
End Sub

Sub Initialize
	'get the app instance
	vm = pgIndex.vm
	'get the view instance
	vue = vm.vue
	'initialize the page
	signin.Initialize(vue, "signin", "/signin", Me)
	'
	banano.LoadLayout("#placeholder", "vsignin")
	'set the template for the page
	Dim stemplate As String = vue.BANanoGetHTML("placeholder")
	signin.SetTemplate(stemplate)
	'
	signin.SetData("signvalid", False)
	signin.AddRule("emailrules", Me, "emailrequired")
	signin.AddRule("passwordrules", Me, "passwordlength")
	signin.AddRule("passwordrules", Me, "passwordrequired")
	signin.SetData("email", "")
	signin.Setdata("password", "")
	signin.SetMethod(Me, "signin_click")
	
	'add the component as a router/page for the app
	vm.AddRoute(signin)
End Sub

Sub signin_click(e As BANanoEvent)
	'validate the form
	'Log(vue.BOVue)
		
	'Dim bValid As Boolean = vue.FormValidate("frmsign")
	'If bValid = False Then
	'	vm.ShowSnackBarError("The specified details are not valid!")
	'	Return
	'End If
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