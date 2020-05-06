B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "badgeCode"
	Public title As String = "Badges"
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
	'
	vm.SetStateSingle("messages", "0")
	
	Dim im As VMButton = vm.CreateButton("btnim", Me).SetLabel("Send Message")
	cont.AddComponent(1, 1, im.ToString)
	
	Dim b1 As VMBadge = vm.CreateBadge("b1", Me).SetColor("green").SetOverlap(True).SetValue("messages").SetContent("messages")
	Dim icon As VMIcon = vm.CreateIcon("icon1", Me).SetText("mdi-email").SetLarge(True)
	b1.AddComponent(icon.ToString)
	cont.AddComponent(1, 2, b1.ToString)
	'
	Dim b2 As VMBadge = vm.CreateBadge("b2", Me).SetBordered(True).SetColor("error").SetIcon("mdi-lock").SetOverlap(True)
	Dim b2btn As VMButton = vm.CreateButton("b2btn", Me).SetLabel("Lock Account").SetColor("error").SetDepressed(True).AddClass("white--text")
	b2.AddComponent(b2btn.tostring)
	cont.AddComponent(2, 1, b2.ToString)
	'
	Dim b3 As VMBadge = vm.CreateBadge("b3", Me).SetOnlineIndicator(True).SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	Dim av As VMAvatar = vm.CreateAvatar("avx", Me).SetImage("https://cdn.vuetifyjs.com/images/lists/2.jpg","",Null, Null, Null)
	'
	b3.AddComponent(av.ToString)
	cont.AddComponent(2, 2, b3.ToString)
		
	'add container to page
	vm.AddContainer(cont)
End Sub

Sub btnim_click(e As BANanoEvent)
	vm.Increment("messages", 1)
End Sub