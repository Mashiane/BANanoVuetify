B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "iconCode"
	Public title As String = "Icons"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(4).AddColumns(2, 12, 6, 6, 6)
	'
	vm.CreateIcon("icon1", Me, "home").AddToContainer(cont, 1, 1)
	'
	vm.CreateIcon("icon2", Me, "add").SetColor("red").SetLarge(True).AddToContainer(cont, 1, 2)
	'
	vm.CreateIcon("icon3", Me, "mdi-email").SetColor("teal").SetXLarge(True).AddToContainer(cont, 2, 1)
	'
	vm.CreateButton("btn1", Me).SetLabel("Accept").SetColor("purple").AddIcon("add", "left", "").AddToContainer(cont, 2, 2)
	
	'add container to page
	vm.AddContainer(cont)
End Sub


