B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "devicecode"
	Public Title As String = "Device"
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns2x6
	cont.AddRows(1).AddColumns12
	'
	vm.CreateDevice("iphoneX", Me).SetIphoneX.SetURL("https://www.google.com/").AddToContainer(cont, 1, 1)
	vm.CreateDevice("iphoneXl", Me).SetIphoneX.SetURL("https://www.google.com/").SetLandScape.AddToContainer(cont, 1, 2)
	'
	vm.CreateDevice("ipad", Me).SetIpad.SetURL("https://www.google.com/").AddToContainer(cont, 2, 1)
	vm.CreateDevice("ipadl", Me).SetIpad.SetURL("https://www.google.com/").SetLandScape.AddToContainer(cont, 2, 1)
	'
	vm.CreateDevice("mac", Me).SetMacbook.SetURL("https://www.google.com/").AddToContainer(cont, 3, 1)
	'
	'add container to page
	vm.AddContainer(cont)
End Sub
