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
	cont.AddRows(2).AddColumns12
	
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
	bcbreadcrumbs1.AddToContainer(cont, 2,1)
	
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim bcbreadcrumbs1 As VMBreadCrumbs"$)
vue.AddCode($"bcbreadcrumbs1.Initialize(vue, "bcbreadcrumbs1", Me)"$)
vue.AddCode($"bcbreadcrumbs1.SetVisible(True)"$)
vue.AddCode($"'add each item"$)
vue.AddCode($"bcbreadcrumbs1.clear"$)
vue.AddCode($"bcbreadcrumbs1.AddItem("Banner", "", "", False, False, True)"$)
vue.AddCode($"bcbreadcrumbs1.AddItem("Squirrel", "", "", False, False, True)"$)
vue.AddCode($"bcbreadcrumbs1.AddItem("Sky", "", "", False, False, True)"$)
vue.AddCode($"bcbreadcrumbs1.AddItem("Planet", "", "", False, False, True)"$)
vue.AddCode($"bcbreadcrumbs1.AddItem("Bird", "", "", False, False, True)"$)
vue.AddCode($"bcbreadcrumbs1.Refresh"$)
vue.AddCode($""$)
	vue.AddCode($"bcbreadcrumbs1.AddToContainer(cont, 2,1)"$)
pgIndex.CreateVBCode(vue, Me, "bccode", "Bread Crumb", vue.GetSourceCode).AddToContainer(cont, 2, 1)

	'add container to page
	vm.AddContainer(cont)
End Sub

Sub bccodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("bccode")
End Sub

Sub bccodedownload_click(e As BANanoEvent)
	vue.DownloadCode("bccode", "bccode.txt")
End Sub
