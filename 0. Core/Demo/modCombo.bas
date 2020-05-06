B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "comboCode"
	Public title As String = "Combo Boxes"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(1).AddColumns(10, 12, 12, 12, 12)
	'
	vm.setstatesingle("select", Array("Vuetify", "Programming"))
	vm.setstatesingle("items", Array("Programming", "Design", "Vue", "Vuetify"))
	'
	Dim cbo1 As VMSelect = vm.CreateComboBox("cbo1", Me)
	cbo1.SetVModel("select").SetItems("items").SetLabel("Select a favourate activity or create a new one")
	cbo1.SetMultiple(True).AddToContainer(cont, 1, 1)
	'
	Dim cbo2 As VMSelect = vm.CreateComboBox("cbo2", Me)
	cbo2.SetVModel("select").SetItems("items").SetLabel("I use chips").SetChips(True)
	cbo2.SetMultiple(True).AddToContainer(cont, 1, 2)
	'
	Dim cbo3 As VMSelect = vm.CreateComboBox("cbo3", Me)
	cbo3.SetVModel("select").SetItems("items").SetLabel("I use chips").SetChips(True).SetReadonly(True)
	cbo3.SetMultiple(True).AddToContainer(cont, 1, 3)
	'
	Dim cbo4 As VMSelect = vm.CreateComboBox("cbo4", Me)
	cbo4.SetVModel("select").SetItems("items").SetLabel("I use chips").SetDense(True).SetOutlined(True)
	cbo4.SetMultiple(True).AddToContainer(cont, 1, 4)
	'
	Dim cbo5 As VMSelect = vm.CreateComboBox("cbo5", Me)
	cbo5.SetVModel("select").SetItems("items").SetLabel("I use chips")
	cbo5.SetHint("Max of 5 tags").SetPersistentHint(True).SetHideSelected(True).SetSmallChips(True)
	cbo5.SetMultiple(True).AddToContainer(cont, 1, 5)
	
	'add container to page
	vm.AddContainer(cont)
End Sub


