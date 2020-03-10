B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "checkCode"
	Public title As String = "Check boxes"
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
	vm.CreateCheckBox("chk1", Me).SetLabel("Check Box 1").SetVModel("chk1").AddToContainer(cont, 1, 1)
	vm.CreateLABEL("lbl1").SetText("{{ chk1 }}").AddToContainer(cont, 1, 2 )
	'
	vm.SetStateSingle("names", Array())
	vm.CreateCheckBox("chk2", Me).SetLabel("John").SetVModel("names").SetValue("John").AddToContainer(cont, 2, 1)
	vm.CreateCheckBox("chk3", Me).SetLabel("Jacob").SetVModel("names").SetValue("Jacob").AddToContainer(cont, 2, 1)
	vm.CreateLABEL("lbl2").SetText("{{ names }}").AddToContainer(cont, 2, 2 )
	'
	vm.CreateCheckBox("chk4", Me).SetLabel("Red").SetVModel("chk4").SetValue("chk4").SetHideDetails(True).SetColor("red").AddToContainer(cont, 3, 1)
	vm.CreateLABEL("lbl4").SetText("{{ chk4 }}").AddToContainer(cont, 3, 2 )
	
	
	vm.AddContainer(cont)
End Sub
