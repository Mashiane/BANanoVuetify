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
	cont.AddRows(4).AddColumns12
	'*** AVATARS
	vm.CreateAvatar("av1", Me).SetSize("36").SetColor("indigo").SetLabelTheme("white-text-only").SetText("36", Null, Null, Null).AddToContainer(cont, 1, 1)
	pgIndex.CreateVBCode(vue, Me, "av1code", "Avatar", $"vm.CreateAvatar("av1", Me).SetSize("36").SetColor("indigo").SetLabelTheme("white-text-only").SetText("36", Null, Null, Null).AddToContainer(cont, 1, 1)"$).AddToContainer(cont, 1, 1)
	'
	vm.CreateAvatar("av2", Me).SetTile(True).SetColor("blue").SetIcon("mdi-alarm","",Null, Null, Null).AddToContainer(cont, 2, 1)
	pgIndex.CreateVBCode(vue, Me, "av2code", "Avatar", $"vm.CreateAvatar("av2", Me).SetTile(True).SetColor("blue").SetIcon("mdi-alarm","",Null, Null, Null).AddToContainer(cont, 1, 1)"$).AddToContainer(cont, 2, 1)
	'
	vm.CreateAvatar("av3", Me).SetImage("./assets/sponge.png", "Sponge", Null, Null, Null).AddToContainer(cont, 3, 1)
	pgIndex.CreateVBCode(vue, Me,"av3code", "Avatar", $"vm.CreateAvatar("av3", Me).SetImage("./assets/sponge.png", "Sponge", Null, Null, Null).AddToContainer(cont, 1, 1)"$).AddToContainer(cont, 3, 1)
	'
	vm.CreateAvatar("av4", Me).SetColor("red").SetIcon("mdi-account-circle", "", Null, Null, Null).AddToContainer(cont, 4, 1)
	pgIndex.CreateVBCode(vue, Me, "av4code", "Avatar", $"vm.CreateAvatar("av4", Me).SetColor("red").SetIcon("mdi-account-circle", "", Null, Null, Null).AddToContainer(cont, 3, 1)"$).AddToContainer(cont, 4, 1)
	'add container to page
	vm.AddContainer(cont)
End Sub

Sub av1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("av1code")
End Sub

Sub av2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("av2code")
End Sub

Sub av3codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("av3code")
End Sub

Sub av4codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("av4code")
End Sub