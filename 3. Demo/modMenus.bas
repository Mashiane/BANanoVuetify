B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "menuCode"
	Public title As String = "Menus"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns3x4
	'
	Dim menu As VMMenu = vm.CreateMenu("menu1", Me).SetIcon("mdi-dots-vertical")
	menu.AddItem("inbox", "", "", "Inbox", "","")
	menu.AddItem("drafs", "", "", "Drafts", "","")
	menu.AddItem("sent", "", "", "Sent", "","")
	menu.AddToContainer(cont, 1, 1)
	'
	Dim menu1 As VMMenu = vm.CreateMenu("menu2", Me).SetButton("mdi-image", "My Button")
	menu1.AddItem("inbox1", "", "mdi-view-dashboard", "Inbox", "","")
	menu1.AddItem("drafs1", "", "mdi-image", "Drafts", "","")
	menu1.AddItem("sent1", "", "mdi-help-box", "Sent", "","")
	menu1.AddToContainer(cont, 1, 2)
	'
	Dim menu2 As VMMenu = vm.CreateMenu("menu3", Me).SetAvatar("./assets/sponge.png")
	menu2.AddItem("inbox1", "", "mdi-view-dashboard", "Inbox", "","")
	menu2.AddItem("drafs1", "", "mdi-image", "Drafts", "","")
	menu2.AddItem("sent1", "", "mdi-help-box", "Sent", "","")
	menu2.AddToContainer(cont, 2, 1)
	
	vm.AddContainer(cont)
End Sub

'*IMPORTANT
Sub menu1items_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	vm.ShowSnackBar(elID)
End Sub

Sub menu2items_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	vm.ShowSnackBar(elID)
End Sub


Sub menu3items_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	vm.ShowSnackBar(elID)
End Sub