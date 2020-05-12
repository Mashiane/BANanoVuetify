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
	AddContent
	vm.ux
End Sub

Sub BuildNavBar
	'*copy code after this line
	'add a hamburger
	vm.NavBar.AddHamburger
	vm.NavBar.Hamburger.SetVisible(True)
	'add a logo
	vm.NavBar.Logo.SetBorderRadius("50%")
	vm.NavBar.Logo.SetBorderWidth("1px")
	vm.NavBar.Logo.SetBorderColor("black")
	vm.NavBar.Logo.SetBorderStyle("solid")
	vm.NavBar.Logo.SetSize("46px","46px")
	vm.NavBar.AddLogo("./assets/sponge.png")
	vm.NavBar.Logo.Show
	vm.NavBar.AddTitle("Parking Lot","")
	vm.NavBar.AddSubHeading1("1.00")
	vm.NavBar.AddSpacer
	vm.NavBar.AddSearch("appsearch")
	vm.NavBar.AddSpacer
	vm.NavBar.SetFixed(True)
	vm.NavBar.SetVisible(True)

	vm.NavBar.AddItem("btna", "mdi-plus", "blue", "Add", "Add parking", "")
End Sub

Sub BuildNavDrawer
	'*copy code after this line
End Sub

Sub AddPages
	'*copy code after this line
End Sub

Sub AddContent
	Dim txtowner As VMTextField = vm.NewTextField(Me, True, "txtowner", "owner", "Owner", "", True, "", 0, "", "", 0)
	txtowner.SetFieldType("string")
	txtowner.SetSolo(True)
	txtowner.SetOutlined(True)
	txtowner.SetDense(True)
	txtowner.SetRounded(True)
	txtowner.SetClearable(True)
	txtowner.SetHideDetails(True)
	txtowner.SetVisible(True)
	vm.Container.AddControl(txtowner.textfield, txtowner.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim txtcar As VMTextField = vm.NewTextField(Me, True, "txtcar", "car", "Car", "", True, "", 0, "", "", 0)
	txtcar.SetFieldType("string")
	txtcar.SetSolo(True)
	txtcar.SetOutlined(True)
	txtcar.SetDense(True)
	txtcar.SetRounded(True)
	txtcar.SetClearable(True)
	txtcar.SetHideDetails(True)
	txtcar.SetVisible(True)
	vm.Container.AddControl(txtcar.textfield, txtcar.tostring, 2, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim txtregistration As VMTextField = vm.NewTextField(Me, True, "txtregistration", "registration", "Registration", "", True, "", 0, "", "", 0)
	txtregistration.SetFieldType("string")
	txtregistration.SetSolo(True)
	txtregistration.SetOutlined(True)
	txtregistration.SetDense(True)
	txtregistration.SetRounded(True)
	txtregistration.SetClearable(True)
	txtregistration.SetHideDetails(True)
	txtregistration.SetVisible(True)
	vm.Container.AddControl(txtregistration.textfield, txtregistration.tostring, 3, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim dpentrydate As VMDateTimePicker = vm.NewDatePicker(Me, True, "dpentrydate", "entrydate", "Entry Date", True, "", "", "", 0)
	dpentrydate.SetFieldType("string")
	dpentrydate.SetVisible(True)
	dpentrydate.SetFirstDayOfWeek("0")
	dpentrydate.TextField.SetSolo(True)
	dpentrydate.TextField.SetOutlined(True)
	dpentrydate.TextField.SetDense(True)
	dpentrydate.TextField.SetRounded(True)
	dpentrydate.TextField.SetClearable(True)
	dpentrydate.TextField.SetHideDetails(True)
	dpentrydate.SetIsNow(True)
	dpentrydate.SetOnChange(Me, "dpentrydate_change")
	vm.Container.AddControl(dpentrydate.DateTimePicker, dpentrydate.tostring, 4, 1, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim dpexitdate As VMDateTimePicker = vm.NewDatePicker(Me, True, "dpexitdate", "exitdate", "Exit Date", True, "", "", "", 0)
	dpexitdate.SetFieldType("string")
	dpexitdate.SetVisible(True)
	dpexitdate.SetFirstDayOfWeek("0")
	dpexitdate.TextField.SetSolo(True)
	dpexitdate.TextField.SetOutlined(True)
	dpexitdate.TextField.SetDense(True)
	dpexitdate.TextField.SetRounded(True)
	dpexitdate.TextField.SetClearable(True)
	dpexitdate.TextField.SetHideDetails(True)
	dpexitdate.SetOnChange(Me, "dpexitdate_change")
	vm.Container.AddControl(dpexitdate.DateTimePicker, dpexitdate.tostring, 4, 2, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim btncancel As VMButton = vm.NewButton(Me, True, "btncancel", "Cancel", True, False, False, True)
	btncancel.SetColorIntensity("red", "")
	btncancel.Setoutlined(True)
	btncancel.SetRounded(True)
	btncancel.SetVisible(True)
	vm.Container.AddControl(btncancel.Button, btncancel.tostring, 5, 1, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim btnsave As VMButton = vm.NewButton(Me, True, "btnsave", "Save", True, False, False, True)
	btnsave.SetColorIntensity("green", "")
	btnsave.Setoutlined(True)
	btnsave.SetRounded(True)
	btnsave.SetVisible(True)
	vm.Container.AddControl(btnsave.Button, btnsave.tostring, 5, 2, 0, 0, 0, 0, 12, 6, 6, 6)
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
Sub confirm_ok(e As BANanoEvent)
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
	'copy code below this line
	End Select
End Sub

'confirm cancel click
Sub cancel_ok(e As BANanoEvent)

End Sub

'alert ok
Sub alert_ok(e As BANanoEvent)

End Sub

'confirm cancel
Sub confirm_cancel(e As BANanoEvent)

End Sub

Private Sub btnsave_click(e As BANanoEvent)
	'get the record to create/update
	Dim Record As Map = vm.Container.GetData
	'validate the record
	Dim bValid As Boolean = vm.Validate(Record, vm.Container.Required)
	'if invalid exit create/update
	If bValid = False Then 
		vm.ShowSnackBarError("The record is incomplete!")
		Return
	End If
	'add code to save the record!
	vm.ShowSnackBarSuccess(BANano.ToJson(Record))
End Sub

Private Sub btna_click(e As BANanoEvent)
	vm.Container.SetDefaults
	vm.SetData("entrydate", vm.DateNow)
	vm.setfocus("txtowner")
End Sub

'fire when search looses focus
Private Sub appsearch_change(e As BANanoEvent)
	'get the search phrase
	Dim sappsearch As String = vm.GetData("appsearch")
	vm.ShowSnackBar(sappsearch)
End Sub


Private Sub btncancel_click(e As BANanoEvent)
End Sub
