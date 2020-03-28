B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "selectSidesCode"
	Public title As String = "Select Sides"
	Private vm As BANanoVM
	Private BANano As BANano
End Sub

Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(5).AddColumns12
	'
	Dim ss As VMSelectSides = vm.CreateSelectSides("ss1", Me).SetVModel("myitems")
	ss.SetStatic(True)
	ss.SetSearch(False)
	ss.SetTotal(False)
	ss.SetDataList(Array("The Mash", "loves", "BANanoVuetify", "wrapping", "libraries"))
	cont.AddComponent(1, 1, ss.tostring)
	'
	cont.AddLabel(2, 1, "selx", vm.SIZE_P, "{{ myitems }}")
	'
	vm.AddContainer(cont)
End Sub
