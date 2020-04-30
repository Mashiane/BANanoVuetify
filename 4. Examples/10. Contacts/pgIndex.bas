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
	Dim txtfirstname As VMTextField = vm.NewTextField(Me, True, "txtfirstname", "firstname", "First Name", "", True, "mdi-account", 0, "", "", 0)
txtfirstname.SetValue("Anele")
txtfirstname.SetFieldType("string")
txtfirstname.SetOutlined(True)
txtfirstname.SetShaped(True)
txtfirstname.SetClearable(True)
txtfirstname.SetHideDetails(True)
vm.Container.AddControl(txtfirstname.textfield, txtfirstname.tostring, 1, 1, 0, 0, 0, 0, 12, 6, 6, 6)

Dim txtlastname As VMTextField = vm.NewTextField(Me, True, "txtlastname", "lastname", "Last Name", "", True, "mdi-account", 0, "", "", 0)
txtlastname.SetValue("Mbanga")
txtlastname.SetFieldType("string")
txtlastname.SetOutlined(True)
txtlastname.SetShaped(True)
txtlastname.SetClearable(True)
txtlastname.SetHideDetails(True)
vm.Container.AddControl(txtlastname.textfield, txtlastname.tostring, 1, 2, 0, 0, 0, 0, 12, 6, 6, 6)

Dim telmobilenumber As VMTextField = vm.NewTel(Me, True, "telmobilenumber", "mobilenumber", "Mobile #", "", True, "mdi-phone", "", "", 0)
telmobilenumber.SetValue("0833333456")
telmobilenumber.SetFieldType("string")
telmobilenumber.SetOutlined(True)
telmobilenumber.SetShaped(True)
telmobilenumber.SetClearable(True)
telmobilenumber.SetHideDetails(True)
vm.Container.AddControl(telmobilenumber.textfield, telmobilenumber.tostring, 2, 1, 0, 0, 0, 0, 12, 6, 6, 6)

Dim emailemailaddress As VMTextField = vm.NewEmail(Me, True, "emailemailaddress", "emailaddress", "Email Address", "", True, "mdi-email-outline", "", "", 0)
emailemailaddress.SetFieldType("string")
emailemailaddress.SetValue("mbanga.anele@gmail.com")
emailemailaddress.SetOutlined(True)
emailemailaddress.SetShaped(True)
emailemailaddress.SetClearable(True)
emailemailaddress.SetHideDetails(True)
vm.Container.AddControl(emailemailaddress.textfield, emailemailaddress.tostring, 2, 2, 0, 0, 0, 0, 12, 6, 6, 6)

Dim dpdateofbirth As VMDateTimePicker = vm.NewDatePicker(Me, True, "dpdateofbirth", "dateofbirth", "Date of Birth", True, "", "", "", 0)
dpdateofbirth.SetFieldType("string")
dpdateofbirth.SetVisible(True)
dpdateofbirth.SetValue("1973-04-15")
dpdateofbirth.SetFirstDayOfWeek("0")
dpdateofbirth.TextField.SetOutlined(True)
dpdateofbirth.TextField.SetShaped(True)
dpdateofbirth.TextField.SetClearable(True)
dpdateofbirth.TextField.SetHideDetails(True)
dpdateofbirth.SetOnChange(Me, "dpdateofbirth_change")
vm.Container.AddControl(dpdateofbirth.DateTimePicker, dpdateofbirth.tostring, 3, 1, 0, 0, 0, 0, 12, 6, 6, 6)

Dim citykeys As String = "c1,c2,c3"
Dim cityvalues As String = "City 1,City 2,City 3"
Dim citymap As Map = vm.keyvalues2map(",", citykeys, cityvalues)
Dim selcity As VMSelect = vm.NewAutoCompleteOptions(Me, True, "selcity", "city", "City", True, False, "", citymap, "id", "text", False, "", "", 0)
selcity.SetValue("c1")
selcity.SetPrependIcon("mdi-city")
selcity.SetFieldType("string")
selcity.SetOutlined(True)
selcity.SetShaped(True)
selcity.SetClearable(True)
selcity.SetHideDetails(True)
selcity.SetOnChange(Me, "selcity_change")
vm.Container.AddControl(selcity.Combo, selcity.tostring, 3, 2, 0, 0, 0, 0, 12, 6, 6, 6)

Dim genderkeys As String = "M,F"
Dim gendervalues As String = "Male,Female"
Dim gendermap As Map = vm.keyvalues2map(",", genderkeys, gendervalues)
Dim rdgender As VMRadioGroup = vm.NewRadioGroup(Me, True, "rdgender", "gender", "Gender", "M", gendermap, True, False, 0)
rdgender.SetFieldType("string")
rdgender.SetHideDetails(True)
rdgender.SetOnChange(Me, "rdgender_change")
vm.Container.AddControl(rdgender.RadioGroup, rdgender.tostring, 4, 1, 0, 0, 0, 0, 12, 6, 6, 6)

Dim swtnotifications As VMCheckBox = vm.NewSwitch(Me, True, "swtnotifications", "notifications", "Receive Notifications", "Yes", "No", False, 0)
swtnotifications.SetFieldType("string")
swtnotifications.SetValue("Yes")
swtnotifications.SetHideDetails(True)
swtnotifications.SetInset(True)
swtnotifications.SetOnChange(Me, "swtnotifications_change")
vm.Container.AddControl(swtnotifications.CheckBox, swtnotifications.tostring, 4, 2, 0, 0, 0, 0, 12, 6, 6, 6)

Dim btnbtnSaveRecord As VMButton = vm.NewButton(Me, True, "btnSaveRecord", "Save", True, False, False, True)
btnbtnSaveRecord.SetColorIntensity("blue", "")
btnbtnSaveRecord.SetTextColorIntensity("white", "")
	vm.Container.AddControl(btnbtnSaveRecord.Button, btnbtnSaveRecord.tostring, 5, 1, 0, 6, 6, 6, 12, 6, 6, 6)

End Sub

Private Sub dpdateofbirth_change(value As Object)
	vm.ShowSnackBar(value)
End Sub

Private Sub selcity_change(value As Object)
	vm.ShowSnackBar(value)
End Sub

Private Sub rdgender_change(value As Object)
	vm.ShowSnackBar(value)
End Sub

Private Sub swtnotifications_change(value As Object)
	vm.ShowSnackBar(value)
End Sub

Private Sub btnSaveRecord_click(e As BANanoEvent)
	'get the record to create/update
	Dim Record As Map = vm.Container.GetData
	Log(Record)
	'validate the record
	Dim bValid As Boolean = vm.Validate(Record, vm.Container.Required)
	'if invalid exit create/update
	If bValid = False Then Return
	'add code to save the record!
End Sub

