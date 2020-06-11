B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "breadCode"
	Public title As String = "Bread Crumbs"
	Private vm As BANanoVM
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(2).AddColumns(2, 12, 6, 6, 6)
	
	Dim bcbreadcrumbs1 As VMBreadCrumbs
	bcbreadcrumbs1.Initialize(vue, "bcbreadcrumbs1", Me)
	bcbreadcrumbs1.SetVisible(True)
	'add each item
	bcbreadcrumbs1.clear
	bcbreadcrumbs1.AddItem("Banner", "", "", False, False, True)
	bcbreadcrumbs1.AddItem("Squirrel", "", "", False, False, True)
	bcbreadcrumbs1.AddItem("Sky", "", "", False, False, True)
	bcbreadcrumbs1.AddItem("Planet", "", "", False, False, True)
	bcbreadcrumbs1.AddItem("Bird", "", "", False, False, True)
	bcbreadcrumbs1.Refresh
	
	cont.AddControl(bcbreadcrumbs1.BreadCrumbs, bcbreadcrumbs1.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	'add container to page
	vm.AddContainer(cont)
End Sub
