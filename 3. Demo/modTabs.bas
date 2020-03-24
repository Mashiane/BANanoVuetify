B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "tabsCode"
	Public title As String = "Tabs"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(5).AddColumns12
	'
	Dim b As VMTabs = vm.CreateTabs("b", Me).SetGrow(True).SetIconsAndText(True).SetDark(True).SetCentered(True)
	'
	b.AddTab("b1", "Item 1", "mdi-phone", Null)
	b.AddTab("b2", "Item 2", "mdi-heart", Null)
	b.AddTab("b3", "Item 3", "mdi-account-box", Null)
	b.AddTab("b4", "Item 4", "", Null)
	b.AddTab("b5", "Item 5", "", Null)
	b.AddToContainer(cont, 1, 1)
	'
'	Dim tblBar As VMToolBar = vm.CreateToolbar("tbl1", Me).SetColor(vm.COLOR_CYAN).SetDark(True).SetFlat(True)
'	tblBar.AddHamburger
'	tblBar.AddTitle("Page title", "")
'	tblBar.AddSpacer
'	tblBar.AddIcon("mag", "mdi-magnify", "", "")
'	tblBar.AddIcon("mag1", "mdi-dots-vertical", "", "")
'	'
'	tblBar.Tabs.SetFixedTabs(True)
'	tblBar.AddTab("bb1", "Item 1", "mdi-phone", "This is item 1")
'	tblBar.AddTab("bb2", "Item 2", "mdi-heart", "This is item 2")
'	tblBar.AddTab("bb3", "Item 3", "mdi-account-box", "This is item 2")
'	
'	tblBar.AddToContainer(cont, 3, 1)
'	'
	vm.AddContainer(cont)
End Sub
