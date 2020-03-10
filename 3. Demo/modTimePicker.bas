B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "timePickerCode"
	Public title As String = "Time Picker"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(5).AddColumns2x6
	'
	Dim tp2 As VMTimePicker = vm.CreateTimePicker("tp2", Me).SetVModel("tp2").SetLabel("Time of Birth").SetForInput
	tp2.AddToContainer(cont, 1, 1)
	'
	vm.CreateLabel("lblt").SetParagraph.SetText("Time: {{ tp2 }}").AddToContainer(cont, 1, 2)
	'
	Dim tp1 As VMTimePicker = vm.CreateTimePicker("tp1", Me).SetVModel("tp1").Set24
	tp1.AddToContainer(cont, 2, 1)
	
	vm.CreateLabel("lblx").SetParagraph.SetText("Time: {{ tp1 }}").AddToContainer(cont, 2, 2)
	'
	vm.AddContainer(cont)
End Sub
