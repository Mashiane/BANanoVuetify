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
	Private BANano As BANano
End Sub


Sub Code(vmx As BANanoVM)
	'the instance of view material
	vm = vmx
	'create the modal dialog
	mdlRegister = vm.CreateDialog("mdlregister", Me)
	'dont show the backdrop
	mdlRegister.SetBackdrop(False)
	'set width of the modal
	mdlRegister.SetWidth("800px")
	'
	'set the title of the modal
	mdlRegister.SetTitle("Sign Up")
	'add a cancel button
	mdlRegister.AddCancel("btnCancelSignUp", "Cancel")
	'add a login button
	mdlRegister.AddOk("btnOkSignUp", "Sign In")
	'create the controls
	Dim txtfirstname As VMTextField = vm.NewText(Me,True,"txtfirstname", "firstname", "First Name", "First Name", True, "", 0, "", "The first name is required!", 0)
	Dim txtlastname As VMTextField = vm.NewText(Me,True,"txtlastname", "lastname", "Last Name", "Last Name", True, "", 0, "", "The last name is required!", 0)
	'
	Dim dpDOB As VMDateTimePicker = vm.NewDatePicker(Me,True,"dpdateofbirth", "dob", "Date of Birth", True, "Date of Birth","","",0)
	Dim tpTOB As VMDateTimePicker = vm.NewTimePicker(Me,True,"tptimeofbirth", "tob", "Time of Birth", True, "", "", "",0)
	'
	Dim txtTel As VMTextField = vm.NewTel(Me,True,"txttelephone", "telephone", "Telephone", "Telephone Number", True, "", "", "",0)
	Dim txtEmail As VMTextField = vm.NewEmail(Me,True,"txtemail", "email", "Email Address","Email Address",True,"","", "The email address is required!",0)
	'
	Dim radGender As VMRadioGroup = vm.NewRadioGroup(Me,True,"rggender", "gender", "Gender", "Male", CreateMap("Male":"Male","Female":"Female"), True, True, 0)
	'Dim chipSkills As VMTextField = vm.NewChips(me,"skills", "Skills", "", False, False, "","", 0)
	'
	Dim children As VMTextField = vm.NewNumber(Me,True,"txtchildren", "children", "Total Children", "", False, "", "","", 0)
	Dim notifications As VMCheckBox = vm.NewSwitch(Me,True,"swtnotifications", "notifications", "Receive Notifications", "Yes", "No",True, 0).SetString
	'
	Dim profilepic As VMImage = vm.NewImage(Me,True,"displaypic", "dp", "./assets/sponge.png", "SpongeBob", "80px", "80px")
	profilepic.SetBorder("1px", vm.COLOR_BLUE, vm.BORDER_RIDGE)
	profilepic.SetBorderRadius("50%")
	
	
	Dim uploadprofile As VMTextField = vm.NewFile(Me,True,True,"fiuploadpic", "upload", "Upload Profile Image", "", False, "", "", 0)
	
	
	Dim notes As VMTextField = vm.NewTextArea(Me,True,"txtnotes", "notes", "Notes", "", True, True, "", 0,"", "Notes are required!", 0)
	Dim agree As VMCheckBox = vm.NewCheckBox(Me,True,"chkagree", "agree", "I agree with terms of use", "Yes", "No", True, 0).SetString
	
	Dim txtPassword As VMTextField = vm.NewPassword(Me,True,"txtpassword", "password", "Password","",True,True,"",15,"", "The password is required!",0)
	Dim txtconfirmPassword As VMTextField = vm.NewPassword(Me,True,"txtconfirmpassword", "confirmpassword", "Confirm Password","",True,True,"",15,"", "The password is required!",0)
	
	'add the controls, the grid will be automatically created
	mdlRegister.container.SetAlignSelfRC(1, 1, "center")
	mdlRegister.Container.AddControl(profilepic.Image, profilepic.tostring,1,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(uploadprofile.TextField, uploadprofile.tostring,1,2,0,0,0,0,12,6,6,6)
	
	mdlRegister.Container.AddControl(txtfirstname.TextField, txtfirstname.tostring,2,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(txtlastname.TextField, txtlastname.tostring,2,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(dpDOB.DateTimePicker, dpDOB.tostring,3,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(tpTOB.DateTimePicker, tpTOB.ToString,3,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(txtTel.TextField,txtTel.ToString,4,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(txtEmail.TextField, txtEmail.ToString,4,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(radGender.RadioGroup, radGender.ToString,5,1,0,0,0,0,12,6,6,6)
	'mdlRegister.Container.AddControl(chipSkills,5,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(children.TextField, children.ToString,6,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(notifications.CheckBox, notifications.ToString,6,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(txtPassword.TextField, txtPassword.ToString,7,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(txtconfirmPassword.TextField, txtconfirmPassword.ToString,7,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(notes.TextField, notes.ToString,8,1,0,0,0,0,12,12,12,12)
	mdlRegister.Container.AddControl(agree.CheckBox, agree.ToString,9,1,0,0,0,0,12,12,12,12)
	
	'add this modal to the page
	vm.adddialog(mdlRegister)
End Sub

Sub fiuploadpic_change(fileList As List)
	If fileList = Null Then Return 
	'get the file object
	Dim fo As FileObject = fileList.Get(0)
	vm.setdata("dp", $"./assets/${fo.FileName}"$)
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
	vm.ShowAlert("register", "Register", BANano.tojson(rec), "Ok")
	'process further
End Sub

Sub Random
	Dim fake As VMFake
	fake.initialize
	'
	Dim structure As Map = CreateMap()
	structure.put("firstname", fake.DT_FIRST_NAME)
	structure.put("lastname", fake.DT_LAST_NAME)
	structure.put("dob", fake.DT_DATE)
	structure.put("tob", fake.DT_TIME)
	structure.put("telephone", fake.DT_PHONE)
	structure.put("email", fake.DT_EMAIL)
	structure.put("gender", fake.DT_GENDER)
	structure.put("children",fake.DT_AGE)
	structure.put("notifications", fake.DT_YES_NO)
	structure.put("notes", fake.DT_LOREM_IPSUM)
	structure.put("agree", fake.DT_YES_NO)
	structure.put("password", fake.DT_PASSWORD)
	structure.put("confirmpassword", fake.DT_PASSWORD)
	'
	Dim rec As Map = fake.GetRecord(structure)
	vm.setstate(rec)
End Sub