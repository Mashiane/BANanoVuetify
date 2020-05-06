B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "messageBoardCode"
	Public title As String = "Message Board"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	cont.AddRows(1).AddColumns(1, 12, 8, 6, 6)
	'
	cont.SetJustifyRC(1, 0, vm.JUSTIFY_CENTER)
	'
	Dim mb As VMCard = vm.createcard("mb", Me)
	mb.Toolbar.SetColorIntensity(vm.COLOR_ORANGE, vm.INTENSITY_LIGHTEN1).SetDark(True)
	mb.ToolBar.AddHamburger
	mb.ToolBar.AddTitle("Message Board", "")
	mb.ToolBar.AddSpacer
	mb.ToolBar.AddIcon("btnMagnify", "mdi-magnify", "", "")
	'
	Dim messages As VMList = vm.CreateList("messages", Me).SetTwoLine(True)
	messages.AddItemJSON($"{ "header": "Today"}"$)
	messages.AddItemJSON($"{ "divider": true }"$)
	messages.AddItem("", "https://picsum.photos/250/300?image=660", "", "Meeting @ Noon", "Spike Lee - I'll be in your neighborhood","")
    
	'
	mb.AddStuff(messages.tostring)
	
	cont.AddComponent(1, 1, mb.tostring)
	'
	vm.AddContainer(cont)
End Sub
