B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "signupcode"
	Private mdlRegister As VMDialog
End Sub


Sub Code(vmx As BANanoVM)
	'the instance of view material
	vm = vmx
	'create the modal dialog
	mdlRegister = vm.CreateDialog("mdlregister", Me)
	'dont show the backdrop
	mdlRegister.SetBackdrop(False)
	'set width of the modal
	mdlRegister.SetWidth("700px")
	'
	'set the title of the modal
	mdlRegister.SetTitle("Sign Up")
	'add a cancel button
	mdlRegister.AddCancel("btnCancelSignUp", "Cancel")
	'add a login button
	mdlRegister.AddOk("btnOkSignUp", "Sign In")
	'create the controls
	Dim txtfirstname As VMTextField = vm.NewText("firstname", "First Name", "First Name", True, "", 0, "", "The first name is required!", 0)
	Dim txtlastname As VMTextField = vm.NewText("lastname", "Last Name", "Last Name", True, "", 0, "", "The last name is required!", 0)
	'
	Dim dpDOB As VMDatePicker = vm.NewDatePicker("dateofbirth", "Date of Birth", True, "Date of Birth","","",0)
	Dim tpTOB As VMTimePicker = vm.NewTimePicker("timeofbirth", "Time of Birth", True, "", "", "",0)
	'
	Dim txtTel As VMTextField = vm.NewTel("telephone", "Telephone", "Telephone Number", True, "", "", "",0)
	Dim txtEmail As VMTextField = vm.NewEmail("email","Email Address","Email Address",True,"","", "The email address is required!",0)
	'
	Dim radGender As VMRadioGroup = vm.NewRadioGroup("gender", "Gender", "M", CreateMap("M":"Male","F":"Female"), True, True, 0)
	'Dim chipSkills As VMTextField = vm.NewChips("skills", "Skills", "", False, False, "","", 0)
	'
	Dim children As VMTextField = vm.NewNumber("children", "Total Children", "", False, "", "","", 0)
	Dim notifications As VMSwitch = vm.NewSwitch("notifications", "Receive Notifications", "true", "false",True, 0)
	'
	Dim profilepic As VMImage = vm.NewImage("displaypic", "./assets/sponge.png", "SpongeBob", "80px", "80px", "")
	Dim uploadprofile As VMFileInput = vm.NewFile("uploadpic", "Upload Profile Image", "", False, "", "", 0)
	
	Dim notes As VMTextArea = vm.NewTextArea("notes", "Notes", "", True, True, "", 0,"", "Notes are required!", 0)
	Dim agree As VMCheckBox = vm.NewCheckBox("agree", "I agree with terms of use", "true", "false", True, 0)
	
	Dim txtPassword As VMTextField = vm.NewPassword("password","Password","",True,False,"",15,"", "The password is required!",0)
	Dim txtconfirmPassword As VMTextField = vm.NewPassword("confirmpassword","Confirm Password","",True,False,"",15,"", "The password is required!",0)
	
	'add the controls, the grid will be automatically created
	mdlRegister.Container.AddControl(profilepic.Image, profilepic.tostring,1,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(uploadprofile.FileInput, uploadprofile.tostring,1,2,0,0,0,0,12,6,6,6)
	
	mdlRegister.Container.AddControl(txtfirstname.TextField, txtfirstname.tostring,2,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(txtlastname.TextField, txtlastname.tostring,2,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(dpDOB.DatePicker, dpDOB.tostring,3,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(tpTOB.TimePicker, tpTOB.ToString,3,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(txtTel.TextField,txtTel.ToString,4,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(txtEmail.TextField, txtEmail.ToString,4,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(radGender.RadioGroup, radGender.ToString,5,1,0,0,0,0,12,6,6,6)
	'mdlRegister.Container.AddControl(chipSkills,5,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(children.TextField, children.ToString,6,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(notifications.SwitchBox, notifications.ToString,6,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(txtPassword.TextField, txtPassword.ToString,7,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(txtconfirmPassword.TextField, txtconfirmPassword.ToString,7,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(notes.TextArea, notes.ToString,8,1,0,0,0,0,12,12,12,12)
	mdlRegister.Container.AddControl(agree.CheckBox, agree.ToString,9,1,0,0,0,0,12,12,12,12)
	
	'add this modal to the page
	vm.adddialog(mdlRegister)
End Sub

Sub btnCancelSignUp_click(e As BANanoEvent)
	'hide the registration modal
	vm.HideDialog("mdlregister")
	'show the login modal
	vm.ShowDialog("mdlsignin")
End Sub

Sub btnOkSignUp_click(e As BANanoEvent)
	'get the contents of the form
	Dim rec As Map = mdlRegister.Container.GetData
	'validate the details
	Dim bValid As Boolean = mdlRegister.Container.Validate(rec)
	If bValid = False Then Return
	Log(rec)
	'process further
End Sub
