B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "avatarCode"
	Public title As String = "Avatars"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(2).AddColumns(2, 12, 6, 6, 6)
	'*** AVATARS
	Dim a1 As VMAvatar = vm.CreateAvatar("a1", Me).SetSize("36").SetColor("indigo").SetText("36", Null, Null, Null)
	a1.Label.UseTheme("white-text-only")
	cont.AddComponent(1, 1, a1.ToString)
	'
	Dim a2 As VMAvatar = vm.CreateAvatar("a2", Me).SetTile(True).SetColor("blue").SetIcon("mdi-alarm","",Null, Null, Null)
	cont.AddComponent(1, 2, a2.ToString)
	'
	Dim a3 As VMAvatar = vm.CreateAvatar("a3", Me).SetImage("./assets/sponge.png", "Sponge", Null, Null, Null)
	cont.AddComponent(2, 1, a3.ToString)
	'
	Dim a4 As VMAvatar = vm.CreateAvatar("a4", Me).SetColor("red").SetIcon("mdi-account-circle", "", Null, Null, Null)
	cont.AddComponent(2, 2, a4.ToString)
	
	'add container to page
	vm.AddContainer(cont)
End Sub
