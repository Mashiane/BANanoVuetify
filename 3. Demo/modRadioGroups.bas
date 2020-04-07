B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "radioCode"
	Public title As String = "Radio Groups"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(10).AddColumns2x6
	'
	Dim rg1 As VMRadioGroup = vm.CreateRadioGroup("rg2", Me).SetVModel("rg2").SetHorizontal(True).SetLabel("Other Radios")
	rg1.SetOptions(CreateMap("rad1":"Radio 1","rad2":"Radio 2","rad3":"Radio 3"))
	rg1.SetOnChange(Me, "rg2_change")
	rg1.AddToContainer(cont, 1, 1)
	'
	vm.AddContainer(cont)
End Sub

Sub rg2_change(e As Object)
	vm.ShowSnackBar(e)
End Sub
