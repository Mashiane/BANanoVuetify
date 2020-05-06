B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "colorPickerCode"
	Public title As String = "Color Picker"
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
	Dim cp As VMColorPicker = vm.CreateColorPicker("cp1", Me).SetVModel("mycolor")
	cont.AddComponent(1, 1, cp.tostring)
	'
	cont.AddLabel(1, 2, "cpx", vm.SIZE_P , "{{ mycolor }}")
	'
	Dim cp2 As VMColorPicker = vm.CreateColorPicker("cp2", Me).SetVModel("mycolor").SetHideCanvas(True)
	cp2.SetHideInputs(True).SetHideModeSwitch(True)
	cont.AddComponent(2, 1, cp2.tostring)
	'
	Dim cp3 As VMColorPicker = vm.CreateColorPicker("cp3", Me).SetVModel("mycolor").SetCanvasHeight("300")
	cont.AddComponent(2, 2, cp3.tostring)
	'
	Dim cp4 As VMColorPicker = vm.CreateColorPicker("cp4", Me).SetVModel("mycolor").SetDotSize("30").SetShowSwatches(True)
	cont.AddComponent(3, 1, cp4.tostring)
	'
	vm.AddContainer(cont)
End Sub
