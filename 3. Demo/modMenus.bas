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
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(3).AddColumns12
	'
	Dim menu As VMMenu = vm.CreateMenu("menu1", Me).SetIcon("mdi-dots-vertical")
	menu.AddItem("inbox", "", "", "Inbox", "","")
	menu.AddItem("drafs", "", "", "Drafts", "","")
	menu.AddItem("sent", "", "", "Sent", "","")
	menu.AddToContainer(cont, 1, 1)
	'
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"Dim menu As VMMenu = vm.CreateMenu("menu1", Me).SetIcon("mdi-dots-vertical")"$)
	vue.AddCode($"menu.AddItem("inbox", "", "", "Inbox", "","")"$)
	vue.AddCode($"menu.AddItem("drafs", "", "", "Drafts", "","")"$)
	vue.AddCode($"menu.AddItem("sent", "", "", "Sent", "","")"$)
	vue.AddCode($"menu.AddToContainer(cont, 1, 1)"$)
	vue.AddCode($""$)
	vue.AddCode($"Sub menu1items_click(e As BANanoEvent)"$)
	vue.AddCode($"'get the id from the event"$)
	vue.AddCode($"Dim elID As String = vm.GetIDFromEvent(e)"$)
	vue.AddCode($"vm.ShowSnackBar(elID)"$)
	vue.AddCode($"End Sub"$)
	Main.CreateVBCode(vue, Me, "menu1code", "Menu", vue.GetSourceCode).AddToContainer(cont, 1, 1)

	'
	Dim menu1 As VMMenu = vm.CreateMenu("menu2", Me).SetButton("mdi-image", "My Button")
	menu1.AddItem("inbox1", "", "mdi-view-dashboard", "Inbox", "","")
	menu1.AddItem("drafs1", "", "mdi-image", "Drafts", "","")
	menu1.AddItem("sent1", "", "mdi-help-box", "Sent", "","")
	menu1.AddToContainer(cont, 2, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim menu1 As VMMenu = vm.CreateMenu("menu2", Me).SetButton("mdi-image", "My Button")"$)
vue.AddCode($"menu1.AddItem("inbox1", "", "mdi-view-dashboard", "Inbox", "","")"$)
vue.AddCode($"menu1.AddItem("drafs1", "", "mdi-image", "Drafts", "","")"$)
vue.AddCode($"menu1.AddItem("sent1", "", "mdi-help-box", "Sent", "","")"$)
vue.AddCode($"menu1.AddToContainer(cont, 2, 1)"$)
vue.AddCode($""$)
vue.AddCode($"Sub menu2items_click(e As BANanoEvent)"$)
vue.AddCode($"'get the id from the event"$)
vue.AddCode($"Dim elID As String = vm.GetIDFromEvent(e)"$)
vue.AddCode($"vm.ShowSnackBar(elID)"$)
vue.AddCode($"End Sub"$)
Main.CreateVBCode(vue, Me, "menu2code", "Menu", vue.GetSourceCode).AddToContainer(cont, 2, 1)

	'
	Dim menu2 As VMMenu = vm.CreateMenu("menu3", Me).SetAvatar("./assets/sponge.png")
	menu2.AddItem("inbox1", "", "mdi-view-dashboard", "Inbox", "","")
	menu2.AddItem("drafs1", "", "mdi-image", "Drafts", "","")
	menu2.AddItem("sent1", "", "mdi-help-box", "Sent", "","")
	menu2.AddToContainer(cont, 3, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim menu2 As VMMenu = vm.CreateMenu("menu3", Me).SetAvatar("./assets/sponge.png")"$)
vue.AddCode($"menu2.AddItem("inbox1", "", "mdi-view-dashboard", "Inbox", "","")"$)
vue.AddCode($"menu2.AddItem("drafs1", "", "mdi-image", "Drafts", "","")"$)
vue.AddCode($"menu2.AddItem("sent1", "", "mdi-help-box", "Sent", "","")"$)
vue.AddCode($"menu2.AddToContainer(cont, 3, 1)"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub menu3items_click(e As BANanoEvent)"$)
vue.AddCode($"'get the id from the event"$)
vue.AddCode($"Dim elID As String = vm.GetIDFromEvent(e)"$)
vue.AddCode($"vm.ShowSnackBar(elID)"$)
vue.AddCode($"End Sub"$)
Main.CreateVBCode(vue, Me, "menu3code", "Menu", vue.GetSourceCode).AddToContainer(cont, 3, 1)



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


Sub menu1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("menu1code")
End Sub

Sub menu1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("menu1code", "menu1code.txt")
End Sub


Sub menu2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("menu2code")
End Sub

Sub menu2codedownload_click(e As BANanoEvent)
	vue.DownloadCode("menu2code", "menu2code.txt")
End Sub


Sub menu3codecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("menu3code")
End Sub

Sub menu3codedownload_click(e As BANanoEvent)
vue.DownloadCode("menu3code", "menu3code.txt")
End Sub