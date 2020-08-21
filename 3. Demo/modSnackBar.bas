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
End Sub

Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	'
	vm.CreateButton("btns1", Me).SetLabel("Open Snackbar").SetDark(True).SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_DARKEN2).AddToContainer(cont, 1, 1)
	'
		'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"vm.CreateButton("btns1", Me).SetLabel("Open Snackbar").SetDark(True).SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_DARKEN2).AddToContainer(cont, 1, 1)"$)
	vue.AddCode($""$)
	vue.AddCode($""$)
	vue.AddCode($"Sub btns1_click(e As BANanoEvent)"$)
	vue.AddCode($"vm.ShowSnackBar("I am a snack bar!")"$)
	vue.AddCode($"End Sub"$)
	Main.CreateVBCode(vue, Me, "snack1code", "Show SnackBar", vue.GetSourceCode).AddToContainer(cont, 2, 1)



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
