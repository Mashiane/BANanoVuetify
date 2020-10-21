B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "dialogCode"
	Public title As String = "Dialog"
	Private vm As BANanoVM
	Private BANano As BANano   'ignore
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(3).AddColumns2x6
	cont.AddRows(10).AddColumns12
	'
	vm.CreateButton("btnDialog", Me).SetLabel("Show Dialog").AddToContainer(cont, 1, 1)
	vm.CreateButton("btnPersistent", Me).SetLabel("Persistent").AddToContainer(cont, 1, 2)
	vm.CreateButton("btnHideOverlay", Me).SetLabel("Hide Overlay").AddToContainer(cont, 2, 1)
	vm.CreateButton("btnInputDialog", Me).SetLabel("Input Dialog").AddToContainer(cont, 2, 2)
	vm.CreateButton("btnPrompt1", Me).SetLabel("Alert Dialog").AddToContainer(cont, 3, 1)
	vm.CreateButton("btnConfirm1", Me).SetLabel("Confirm Dialog").AddToContainer(cont, 3, 2)
	
	
	Dim diag As VMDialog = vm.CreateDialog("diag1", Me)
	diag.SetWidth("500")
	diag.SetTitle("Privacy Policy")
	diag.Container.SetText("Lorem ipsum...")
	diag.AddOK("btnOk", "I agree")
	vm.AddDialog(diag)
	'
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"Dim diag As VMDialog = vm.CreateDialog("diag1", Me)"$)
	vue.AddCode($"diag.SetWidth("500")"$)
	vue.AddCode($"diag.SetTitle("Privacy Policy")"$)
	vue.AddCode($"diag.Container.SetText("Lorem ipsum...")"$)
	vue.AddCode($"diag.AddOK("btnOk", "I agree")"$)
	vue.AddCode($"vm.AddDialog(diag)"$)
	vue.AddCode($"'"$)
	vue.AddCode("Sub btnok_click(e As BANanoEvent)")
	vue.AddCode($"vm.hidedialog("diag1")"$)
	vue.AddCode("End Sub")
	pgIndex.CreateVBCode(vue, Me, "diag1code", "Dialog", vue.GetSourceCode).AddToContainer(cont, 4, 1)

	'
	Dim diag2 As VMDialog = vm.CreateDialog("diag2", Me).SetMaxWidth("390").SetModal(True).SetTitle("Use Google's location service?")
	diag2.SetScrollable(True)
	diag2.Container.SetText("Let Google help apps determine location. This means sending anonymous location data to Google, even when no apps are running")
	diag2.AddCancel("btnDisagree", "I Disagree")
	diag2.AddOK("btnOk1", "I agree")
	vm.AddDialog(diag2)
	
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim diag2 As VMDialog = vm.CreateDialog("diag2", Me).SetMaxWidth("390").SetModal(True).SetTitle("Use Google's location service?")"$)
vue.AddCode($"diag2.SetScrollable(True)"$)
vue.AddCode($"diag2.Container.SetText("Let Google help apps determine location. This means sending anonymous location data to Google, even when no apps are running")"$)
vue.AddCode($"diag2.AddCancel("btnDisagree", "I Disagree")"$)
vue.AddCode($"diag2.AddOK("btnOk1", "I agree")"$)
vue.AddCode($"vm.AddDialog(diag2)"$)
pgIndex.CreateVBCode(vue, Me, "diag2code", "Dialog", vue.GetSourceCode).AddToContainer(cont, 5, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'see pgIndex.alert_ok"$)
vue.AddCode($"Sub btnPrompt1_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowAlert("alertuser", "Alert User", "This is an alert!", "Yippie!")"$)
vue.AddCode($"End Sub"$)
pgIndex.CreateVBCode(vue, Me, "alertCode", "Alert", vue.GetSourceCode).AddToContainer(cont, 6, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($""$)
vue.AddCode($"'see pgIndex.confirm_ok"$)
vue.AddCode($"Sub btnConfirm1_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowConfirm("promptuser", "Confirm Vuetify", "Are you sure that you want to use Vuetify?", "Yep", "Nada")"$)
vue.AddCode($"End Sub"$)
pgIndex.CreateVBCode(vue, Me, "confirmCode", "Confirm", vue.GetSourceCode).AddToContainer(cont, 7, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'when the ok button is clicked for a confirm dialog"$)
vue.AddCode($"Sub confirm_ok(e As BANanoEvent)"$)
vue.AddCode($"Dim sproc As String = vm.GetConfirm"$)
vue.AddCode($"Select Case sproc"$)
vue.AddCode($"Case "promptuser""$)
vue.AddCode($"vm.ShowSnackBar("Yes, use Vuetify!")"$)
vue.AddCode($"Case Else"$)
vue.AddCode($"vm.ShowSnackBar(sproc)"$)
vue.AddCode($"End Select"$)
vue.AddCode($"End Sub"$)
pgIndex.CreateVBCode(vue, Me, "confirmAnswer", "Confirm Response", vue.GetSourceCode).AddToContainer(cont, 8, 1)



	'
	Dim diag3 As VMDialog = vm.CreateDialog("diag3", Me).SetHideOverlay(True).SetMaxWidth("80%").SetTitle("This is it").SetScrollable(True)
	diag3.Container.SetText("Let Google help apps determine location. This means sending anonymous location data to Google, even when no apps are running")
	diag3.AddCancel("btnDisagree2", "I Disagree")
	diag3.AddOK("btnOk3", "I agree")
	vm.AddDialog(diag3)
	
	'add container to page
	vm.AddContainer(cont)
	'
	Dim diagx As VMDialog = InputDialog
	vm.AddDialog(diagx)
	
End Sub


Sub confirmAnswercopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("confirmAnswer")
End Sub

Sub confirmAnswerdownload_click(e As BANanoEvent)
vue.DownloadCode("confirmAnswer", "confirmAnswer.txt")
End Sub



Sub confirmCodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("confirmCode")
End Sub

Sub confirmCodedownload_click(e As BANanoEvent)
	vue.DownloadCode("confirmCode", "confirmCode.txt")
End Sub


Sub alertCodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("alertCode")
End Sub

Sub alertCodedownload_click(e As BANanoEvent)
	vue.DownloadCode("alertCode", "alertCode.txt")
End Sub


Sub diag2codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("diag2code")
End Sub

Sub diag2codedownload_click(e As BANanoEvent)
vue.DownloadCode("diag2code", "diag2code.txt")
End Sub

Sub diag1codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("diag1code")
End Sub

Sub diag1codedownload_click(e As BANanoEvent)
vue.DownloadCode("diag1code", "diag1code.txt")
End Sub


'see pgIndex.confirm_ok
Sub btnConfirm1_click(e As BANanoEvent)
	vm.ShowConfirm("promptuser", "Confirm Vuetify", "Are you sure that you want to use Vuetify?", "Yep", "Nada")
End Sub

'see pgIndex.alert_ok
Sub btnPrompt1_click(e As BANanoEvent)
	vm.ShowAlert("alertuser", "Alert User", "This is an alert!", "Yippie!")
End Sub

Sub btnInputDialog_click(e As BANanoEvent)
	vm.ShowDialog("inputdialog")
End Sub

Sub InputDialog As VMDialog
	Dim user As Map = CreateMap()
	vm.SetData("user", user)
	'
	Dim diag As VMDialog = vm.CreateDialog("inputdialog", Me)
	diag.SetModal(True)
	diag.SetWidth("800px")
	diag.SetTitle("Input Dialog")
	diag.Container.AddRows(7).AddColumns2x6
	'
	Dim chkAgree As VMCheckBox = vm.CreateCheckBox("chkAgree1", Me).SetVModel("user.agree").SetLabel("I agree")
	Dim dob As VMDateTimePicker = vm.CreateDatePicker("dob", Me).SetVModel("user.dob").SetLabel("Date of Birth").SetForInput
	Dim fi As VMFileInput = vm.CreateFileInput("myfile", Me).SetAccept("image/*").SetLabel("File input").SetVModel("user.myfile")
	Dim rg1 As VMRadioGroup = vm.CreateRadioGroup("gender", Me).SetVModel("user.gender").SetHorizontal(True).SetLabel("Gender")
	rg1.SetOptions(CreateMap("m":"Male","f":"Female"))
	Dim selx As VMSelect = vm.CreateSelect("code", Me).SetItems("items").SetLabel("Code").SetVModel("user.code")
	Dim age As VMSlider = vm.CreateSlider("age", Me).SetVModel("user.age").SetMin("0").SetMax("100").SetLabel("Age").SetThumbLabel("always").SetValue("46")
	Dim swt As VMCheckBox = vm.CreateSwitch("notif", Me).SetLabel("Receive Notifications").SetVModel("user.notif")
	Dim txtm As VMTextField = vm.CreateTextArea("about", Me).SetLabel("About Yourself").SetVModel("user.about")
	Dim txtfn As VMTextField = vm.CreateTextField("fn", Me).SetLabel("First Name").SetVModel("user.fn").SetHint("Enter a first name").SetPersistentHint(True).SetClearable(True).SetMaxLength(50)
	Dim ac1 As VMSelect = vm.CreateAutoComplete("ln", Me).SetVModel("user.ln").Bind(":items", "items").SetLabel("Last Name")
	Dim a3 As VMAvatar = vm.CreateAvatar("dp", Me).SetImage("./assets/sponge.png", "Sponge", Null, Null, Null)
	Dim tp2 As VMDateTimePicker = vm.CreateTimePicker("tob", Me).SetVModel("user.tob").SetLabel("Time of Birth").SetForInput
	Dim cbo1 As VMSelect = vm.CreateComboBox("combox", Me).SetVModel("user.combo").SetItems("items").SetLabel("Select a favourate activity or create a new one")
	Dim pwd As VMTextField = vm.CreateTextField("pwd", Me).SetLabel("Password").SetPassword(True, True).SetName("password",False).SetVModel("user.pwd").SetHint("At least enter 8 characters.")
	pwd.SetCounter(8)
	
	diag.Container.AddComponent(1, 1, chkAgree.ToString)
	diag.Container.AddComponent(1, 2, dob.tostring)
	diag.Container.AddComponent(2, 1, fi.tostring)
	diag.Container.AddComponent(2, 2, rg1.tostring)
	diag.Container.AddComponent(3, 1, selx.tostring)
	diag.Container.AddComponent(3, 2, age.tostring)
	diag.Container.AddComponent(4, 1, swt.tostring)
	diag.Container.AddComponent(4, 2, txtm.tostring)
	diag.Container.AddComponent(5, 1, txtfn.tostring)
	diag.Container.AddComponent(5, 2, ac1.tostring)
	diag.Container.AddComponent(6, 1, a3.tostring)
	diag.Container.AddComponent(6, 2, tp2.tostring)
	diag.Container.AddComponent(7, 1, cbo1.tostring)
	diag.Container.AddComponent(7, 2, pwd.tostring)
	'
	diag.AddCancel("btnCancelIt", "Cancel")
	diag.AddOK("btnSaveIt", "Save")
	Return diag
End Sub

Sub myfile_change(fObj As Map)
	Try
		Dim fO As FileObject = BANanoShared.GetFileDetails(fObj)
		vm.ShowSnackBarSuccess(fO.filename)
	Catch
		Log("myfile_change Error")
	End Try
End Sub

Sub btnSaveIt_click(e As BANanoEvent)
	Dim user As Map = vm.GetData("user")
	vm.ShowSnackBar(BANano.tojson(user))
	vm.HideDialog("inputdialog")
End Sub

Sub btnCancelIt_click(e As BANanoEvent)
	vm.HideDialog("inputdialog")
End Sub

Sub btnHideOverlay_click(e As BANanoEvent)
	vm.ShowDialog("diag3")
End Sub


Sub btnOk1_click(e As BANanoEvent)
	vm.HideDialog("diag2")	
End Sub

Sub btnPersistent_click(e As BANanoEvent)
	vm.ShowDialog("diag2")
End Sub

Sub btnDialog_click(e As BANanoEvent)
	vm.ShowDialog("diag1")
End Sub

Sub btnok_click(e As BANanoEvent)
	vm.hidedialog("diag1")
End Sub
