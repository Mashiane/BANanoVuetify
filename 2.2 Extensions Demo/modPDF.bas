B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "pdfObjectCode"
	Public title As String = "PDF Object"
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private PDFO As VMPDFObject
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.AddRows(1).AddColumns12
	'
	PDFO.Initialize(vue, "pdfo", Me)
	PDFO.SetHeight("800px")
	PDFO.SetPage("1")
	PDFO.SetView(PDFO.VIEW_FITH)
	PDFO.SetPageMode(PDFO.PAGEMODE_THUMBS)
	PDFO.SetNavPanes(True)
	PDFO.SetStatusBar(True)
	PDFO.SetToolBar(True)
	cont.AddComponent(1, 1, PDFO.tostring)
	vm.AddContainer(cont)
End Sub

Sub Show
	'this must be added after the page is rendered
	PDFO.SetURL("./assets/f1040.pdf")
	vm.NavBar.UpdateTitle(title)
	vm.ShowPage(name)
End Sub