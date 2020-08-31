B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "snackCode"
	Public title As String = "Snack Bar"
	Private vm As BANanoVM
	Private vue As BANanoVue
	Public snack1 As VMSnackBar
	Public snack3 As VMSnackBar
	Public snack4 As VMSnackBar
	Public snack5 As VMSnackBar
	Public snack6 As VMSnackBar
End Sub

Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(10).AddColumns12
	'
	vm.CreateButton("btns1", Me).SetLabel("Open Snackbar").SetDark(True).SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_DARKEN2).AddToContainer(cont, 5, 1)
	'
		'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateButton("btns1", Me).SetLabel("Open Snackbar").SetDark(True).SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_DARKEN2).AddToContainer(cont, 5, 1)"$)
	vue.AddCode($""$)
	vue.AddCode($""$)
	vue.AddCode($"Sub btns1_click(e As BANanoEvent)"$)
	vue.AddCode($"vm.ShowSnackBar("I am a snack bar!")"$)
	vue.AddCode($"End Sub"$)
	Main.CreateVBCode(vue, Me, "snack1code", "Show SnackBar", vue.GetSourceCode).AddToContainer(cont, 6, 1)
	'
	snack1 = vm.CreateSnackBar("snack2", Me)
	snack1.SetLabel("Shaped SnackBar")
	snack1.SetTimeout("-1")
	snack1.Hide
	snack1.SetAbsolute(True)
	snack1.SetTopLeft(True)
	snack1.SetShaped(True)
	vm.AddSnackBar(snack1)
	'
	snack3 = vm.CreateSnackBar("snack3", Me)
	snack3.SetLabel("Pill SnackBar")
	snack3.SetTimeout("-1")
	snack3.Hide
	snack3.SetColor(vm.COLOR_BLUEGREY)
	snack3.SetAbsolute(True)
	snack3.SetTopRight(True)
	snack3.SetRounded("pill")
	vm.AddSnackBar(snack3)
	'
	snack4  = vm.CreateSnackBar("snack4", Me)
	snack4.SetLabel("Centered SnackBar")
	snack4.SetTimeout("-1")
	snack4.Hide
	snack4.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	snack4.SetAbsolute(True)
	snack4.SetCentered(True)
	snack4.SetElevation("24")
	vm.AddSnackBar(snack4)
	'
	snack5 = vm.CreateSnackBar("snack5", Me)
	snack5.SetLabel("Bottom Left")
	snack5.SetTimeout("-1")
	snack5.Hide
	snack5.SetColor(vm.COLOR_PRIMARY)
	snack5.SetAbsolute(True)
	snack5.SetBottomLeft(True)
	snack5.SetText1(True)
	vm.AddSnackBar(snack5)
	'
	snack6  = vm.CreateSnackBar("snack6", Me)
	snack6.SetLabel("Outlined")
	snack6.SetTimeout("-1")
	snack6.Hide
	snack6.SetColor(vm.COLOR_SUCCESS)
	snack6.SetAbsolute(True)
	snack6.SetBottomRight(True)
	snack6.SetOutlined(True)
	vm.AddSnackBar(snack6)
	
	vm.AddContainer(cont)
End Sub

Sub btns1_click(e As BANanoEvent)
	vm.ShowSnackBar("I am a snack bar!")
End Sub

Sub snack1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("snack1code")
End Sub

Sub snack1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("snack1code", "snack1code.txt")
End Sub

Sub ShowSnacks
	snack1.Show
	snack3.Show
	snack4.Show
	snack5.Show
	snack6.Show
End Sub

Sub HideSnacks
	snack1.hide
	snack3.hide
	snack4.hide
	snack5.hide
	snack6.hide
End Sub