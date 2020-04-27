B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano  'ignore
	Public vm As BANanoVM
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	BuildNavBar
	BuildNavDrawer
	AddPages
	'
	OurContacts
	vm.ux
End Sub

Sub BuildNavBar
	'*copy code after this line
End Sub

Sub BuildNavDrawer
	'*copy code after this line
End Sub

Sub AddPages
	'*copy code after this line
End Sub

'*IMPORTANT
Sub draweritems_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	Select Case elID
	'copy code below this line
	End Select
End Sub

'confirm ok click
Sub confirm_ok
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
	'copy code below this line
	End Select
End Sub

'confirm cancel click
Sub cancel_ok

End Sub

Sub OurContacts
	Dim txtfirsname As VMTextField = vm.NewTextField(Me, True, "txtfirsname", "firsname", "First Name", "", True, "", 0, "", "", 0)
	txtfirsname.SetOutlined(True)
	txtfirsname.SetShaped(True)
	txtfirsname.SetClearable(True)
	vm.Container.AddControl(txtfirsname.textfield, txtfirsname.tostring, 1, 1, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim txtlastname As VMTextField = vm.NewTextField(Me, True, "txtlastname", "lastname", "Last Name", "", True, "", 0, "", "", 0)
	txtlastname.SetOutlined(True)
	txtlastname.SetShaped(True)
	txtlastname.SetClearable(True)
	vm.Container.AddControl(txtlastname.textfield, txtlastname.tostring, 1, 2, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim telmobilenumber As VMTextField = vm.NewTel(Me, True, "telmobilenumber", "mobilenumber", "Mobile #", "", True, "", "", "", 0)
	telmobilenumber.SetOutlined(True)
	telmobilenumber.SetShaped(True)
	telmobilenumber.SetClearable(True)
	vm.Container.AddControl(telmobilenumber.textfield, telmobilenumber.tostring, 2, 1, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim emailemailaddress As VMTextField = vm.NewEmail(Me, True, "emailemailaddress", "emailaddress", "Email Address", "", True, "", "", "", 0)
	emailemailaddress.SetOutlined(True)
	emailemailaddress.SetShaped(True)
	emailemailaddress.SetClearable(True)
	vm.Container.AddControl(emailemailaddress.textfield, emailemailaddress.tostring, 2, 2, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim dpdateofbirth As VMDateTimePicker = vm.NewDatePicker(Me, True, "dpdateofbirth", "dateofbirth", "Date of Birth", True, "", "", "", 0)
	dpdateofbirth.SetVisible(True)
	dpdateofbirth.SetFirstDayOfWeek("0")
	dpdateofbirth.TextField.SetOutlined(True)
	dpdateofbirth.TextField.SetShaped(True)
	dpdateofbirth.TextField.SetClearable(True)
	vm.Container.AddControl(dpdateofbirth.DateTimePicker, dpdateofbirth.tostring, 3, 1, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim genderkeys As String = "M,F"
	Dim gendervalues As String = "Male,Female"
	Dim gendermap As Map = vm.keyvalues2map(",", genderkeys, gendervalues)
	Dim rdgender As VMRadioGroup = vm.NewRadioGroup(Me, True, "rdgender", "gender", "Gender", "M", gendermap, True, False, 0)
	vm.Container.AddControl(rdgender.RadioGroup, rdgender.tostring, 3, 2, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim swtnotifications As VMCheckBox = vm.NewSwitch(Me, True, "swtnotifications", "notifications", "Receive Notifications", "", "No", False, 0)
	swtnotifications.SetRequired(True)
	swtnotifications.SetInset(True)
	vm.Container.AddControl(swtnotifications.CheckBox, swtnotifications.tostring, 4, 1, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim citykeys As String = "c1,c2,c3"
	Dim cityvalues As String = "City 1,City 2,City 3"
	Dim citymap As Map = vm.keyvalues2map(",", citykeys, cityvalues)
	Dim selcity As VMSelect = vm.NewAutoCompleteOptions(Me, True, "selcity", "city", "City", True, False, "", citymap, "id", "text", False, "", "", 0)
	selcity.SetOutlined(True)
	selcity.SetShaped(True)
	selcity.SetClearable(True)
	vm.Container.AddControl(selcity.Combo, selcity.tostring, 4, 2, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim btnbtnSave As VMButton = vm.NewButton(Me, True, "btnSave", "Save", True, False, False, True)
	btnbtnSave.SetColorIntensity("blue", "")
	btnbtnSave.SetTextColorIntensity("white", "")
	vm.Container.AddControl(btnbtnSave.Button, btnbtnSave.tostring, 5, 1, 0, 6, 6, 6, 12, 6, 6, 6)


End Sub