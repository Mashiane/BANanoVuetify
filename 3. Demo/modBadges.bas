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
	'
	Dim b1 As VMBadge = vm.CreateBadge("b1", Me).SetColor("green").SetOverlap(True).SetContent("5")
	Dim icon As VMIcon = vm.CreateIcon("icon1", Me).SetText("mdi-email").SetLarge(True)
	b1.AddComponent(icon.ToString)
	cont.AddComponent(1, 1, b1.ToString)
	'
	vue.SourceCodeBuilder
	vue.AddCode($"Dim b1 As VMBadge = vm.CreateBadge("b1", Me).SetColor("green").SetOverlap(True).SetContent("5")"$)
	vue.AddCode($"Dim icon As VMIcon = vm.CreateIcon("icon1", Me).SetText("mdi-email").SetLarge(True)"$)
	vue.AddCode($"b1.AddComponent(icon.ToString)"$)
	vue.AddCode($"cont.AddComponent(1, 1, b1.ToString)"$)
	pgIndex.CreateVBCode(vue, Me, "b1code", "Badge", vue.GetSourceCode).AddToContainer(cont, 1, 1)
	
	'
	Dim b2 As VMBadge = vm.CreateBadge("b2", Me).SetBordered(True).SetColor("error").SetIcon("mdi-lock").SetOverlap(True)
	Dim b2btn As VMButton = vm.CreateButton("b2btn", Me).SetLabel("Lock Account").SetColor("error").SetDepressed(True).AddClass("white--text")
	b2.AddComponent(b2btn.tostring)
	cont.AddComponent(2, 1, b2.ToString)
	'
	vue.SourceCodeBuilder
	vue.AddCode($"Dim b2 As VMBadge = vm.CreateBadge("b2", Me).SetBordered(True).SetColor("error").SetIcon("mdi-lock").SetOverlap(True)"$)
	vue.AddCode($"Dim b2btn As VMButton = vm.CreateButton("b2btn", Me).SetLabel("Lock Account").SetColor("error").SetDepressed(True).AddClass("white--text")"$)
	vue.AddCode($"b2.AddComponent(b2btn.ToString)"$)
	vue.AddCode($"cont.AddComponent(2, 1, b2.ToString)"$)
	pgIndex.CreateVBCode(vue, Me, "b2code", "Badge", vue.GetSourceCode).AddToContainer(cont, 2, 1)
	
	'
	Dim b3 As VMBadge = vm.CreateBadge("b3", Me).SetOnlineIndicator(True).SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	Dim av As VMAvatar = vm.CreateAvatar("avx", Me).SetImage("https://cdn.vuetifyjs.com/images/lists/2.jpg","",Null, Null, Null)
	b3.AddComponent(av.ToString)
	cont.AddComponent(3, 1, b3.ToString)
	'
	vue.SourceCodeBuilder
	vue.AddCode($"Dim b3 As VMBadge = vm.CreateBadge("b3", Me).SetOnlineIndicator(True).SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)"$)
	vue.AddCode($"Dim av As VMAvatar = vm.CreateAvatar("avx", Me).SetImage("https://cdn.vuetifyjs.com/images/lists/2.jpg","",Null, Null, Null)"$)
	vue.AddCode($"b3.AddComponent(av.ToString)"$)
	vue.AddCode($"cont.AddComponent(3, 1, b3.ToString)"$)
	pgIndex.CreateVBCode(vue, Me, "b3code", "Badge", vue.GetSourceCode).AddToContainer(cont, 3, 1)
	
	'add container to page
	vm.AddContainer(cont)
End Sub

Sub btnim_click(e As BANanoEvent)
	vm.IncrementBadge("b1", 1)
End Sub

Sub b1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("b1code")
End Sub

Sub b2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("b2code")
End Sub

Sub b3codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("b3code")
End Sub
