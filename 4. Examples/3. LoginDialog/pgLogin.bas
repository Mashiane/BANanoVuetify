B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "signincode"
	Private mdlSignIn As VMDialog
	Private BANano As BANano
End Sub


Sub Code(vmx As BANanoVM)
	'the instance of view material
	vm = vmx
	'create the modal dialog
	mdlSignIn = vm.CreateDialog("mdlsignin", Me)
	'dont show the backdrop
	mdlSignIn.SetBackdrop(False)
	'set width of the modal
	mdlSignIn.SetWidth("600px")
	'
	'set the title of the modal
	mdlSignIn.SetTitle("Sign In")
	'add a cancel button
	mdlSignIn.AddCancel("btnCancelLogin", "Cancel")
	'add a login button
	mdlSignIn.AddOk("btnOkSignIn", "Sign In")
	'create the controls
	Dim txtEmail As VMTextField = vm.NewEmail(Me,"txtemail", "email", "Email Address","", True, "email", "Enter email address here", "The email address is required!", 0)
	Dim txtPassword As VMTextField = vm.NewPassword(Me,"txtpassword", "password", "Password","", True, True, "lock", 10, "Enter password here", "The password is required!", 0)
	'add the controls, the grid will be automatically created
	mdlSignIn.Container.AddControl(txtEmail.TextField, txtEmail.ToString, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	mdlSignIn.Container.AddControl(txtPassword.TextField, txtPassword.ToString, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	
	'add this modal to the page
	vm.adddialog(mdlSignIn)
End Sub

Sub btnCancelLogin_click(e As BANanoEvent)
	'hide the dialog using its name
	'vm.HideDialog("mdlsignin")
End Sub

Sub btnOkSignIn_click(e As BANanoEvent)
	'get the contents of the form
	Dim rec As Map = mdlSignIn.Container.GetData
	'validate the details
	Dim bValid As Boolean = mdlSignIn.Container.Validate(rec)
	If bValid = False Then Return
	vm.ShowSnackBar(BANano.tojson(rec))
	'process further
End Sub
