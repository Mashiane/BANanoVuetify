B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "switchCode"
	Public title As String = "Switch box"
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
	
	vm.CreateSwitch("sw1", Me).SetLabel("Switch 1").SetVModel("sw1").SetOnChange(Me, "sw1_change").SetColorIntensity(vm.vue.COLOR_INDIGO, vm.vue.INTENSITY_DARKEN4).AddToContainer(cont, 1, 1)
	vm.CreateLABEL("lbl2").SetText("{{ sw1 }}").AddToContainer(cont, 1, 2 )
	'
	vm.CreateSwitch("sw2", Me).SetLabel("Switch 2").SetVModel("sw2").AddToContainer(cont, 2, 1)
	vm.CreateLABEL("lbl3").SetText("{{ sw2 }}").AddToContainer(cont, 2, 2 )
	'
	vm.CreateSwitch("sw3", Me).SetLabel("Switch 3").SetVModel("sw3").SetValue(True).SetFalseValue("No").SetInputValue("Yes").SetInset(True).AddToContainer(cont, 3, 1)
	vm.CreateLABEL("lbl4").SetText("{{ sw3 }}").AddToContainer(cont, 3, 2 )
	'
	vm.CreateSwitch("sw5", Me).SetLabel("Switch 4").SetLoading("warning").AddToContainer(cont, 4, 1)
	'
	vm.AddContainer(cont)
End Sub


Sub sw1_change(value As Object)
	
	vm.ShowSnackBar($"sw1_change: ${value}"$)
	
End Sub