B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "expansionPanelCode"
	Public title As String = "Expansion Panels"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	cont.AddRows(1).AddColumns12
	' make accordion
	Dim ep As VMExpansionPanels = vm.CreateExpansionPanels("ep", Me).SetAccordion(True)
	ep.Panel.SetVFor("(item, i)", "5")
	ep.Panel.Bind(":key", "i")
	'
	ep.Header.SetText("Item")
	ep.Content.SetText(vm.Fake.Rand_LoremIpsum(1))
	
	cont.AddComponent(1, 1, ep.tostring)
	'
	vm.AddContainer(cont)
End Sub
