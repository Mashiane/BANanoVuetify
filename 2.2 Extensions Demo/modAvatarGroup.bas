B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "avatarGroupCode"
	Public title As String = "Avatar Group"
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
	
	Dim ag As VMAvatarGroup
	ag.Initialize(vue, "ag", Me)
	ag.AddAvatar("a1", "./assets/sponge.png")
	ag.AddAvatar("a2", "./assets/2.jpg")
	ag.AddAvatar("a3", "./assets/4.jpg")
	ag.AddAvatar("a4", "./assets/3.jpg")
	
	cont.AddControl(ag.AvatarGroup, ag.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	
	vm.AddContainer(cont)
End Sub
