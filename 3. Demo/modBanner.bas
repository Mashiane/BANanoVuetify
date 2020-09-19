B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public name As String = "bannerCode"
	Public title As String = "Banner"
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
	cont.addrows(2).AddColumns12
	'
	Dim card As VMCard = vm.CreateCard("bannercard", Me)
	card.ToolBar.AddTitle("My Documents","")
	card.ToolBar.AddSpacer
	card.ToolBar.SetFlat(True)
	'
	Dim sticky As VMCheckBox = vm.CreateSwitch("switchsticky", Me).SetVModel("sticky").SetLabel("Sticky Banner").SetHideDetails(True)
	card.ToolBar.AddComponent("sticky", sticky.ToString)
	'
	Dim banner As VMBanner = vm.CreateBanner("banner1", Me).SetSingleLine(True).Bind(":sticky", "sticky")
	banner.SetText("We can't save your edits while you are in offline mode.")
	'
	Dim btnGetOnline As VMButton = vm.CreateButton("btngetOnline", Me).SetTransparent(True).SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	btnGetOnline.SetLAbel("Get Online")
	banner.AddAction(btnGetOnline)
	'
	card.AddStuff(banner.ToString)
	'
	cont.AddComponent(1, 1, card.ToString)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim card As VMCard = vm.CreateCard("bannercard", Me)"$)
vue.AddCode($"card.ToolBar.AddTitle("My Documents","")"$)
vue.AddCode($"card.ToolBar.AddSpacer"$)
vue.AddCode($"card.ToolBar.SetFlat(True)"$)
vue.AddCode($"Dim sticky As VMCheckBox = vm.CreateSwitch("switchsticky", Me).SetVModel("sticky").SetLabel("Sticky Banner").SetHideDetails(True)"$)
vue.AddCode($"card.ToolBar.AddComponent("sticky", sticky.ToString)"$)
vue.AddCode($"Dim banner As VMBanner = vm.CreateBanner("banner1", Me).SetSingleLine(True).Bind(":sticky", "sticky")"$)
vue.AddCode($"banner.SetText("We can't save your edits while you are in offline mode.")"$)
vue.AddCode($"Dim btnGetOnline As VMButton = vm.CreateButton("btngetOnline", Me).SetTransparent(True).SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)"$)
vue.AddCode($"btnGetOnline.SetLAbel("Get Online")"$)
vue.AddCode($"banner.AddAction(btnGetOnline)"$)
vue.AddCode($"card.AddStuff(banner.ToString)"$)
vue.AddCode($"cont.AddComponent(1, 1, card.ToString)"$)
pgIndex.CreateVBCode(vue, Me, "bannercardcode", "Banner", vue.GetSourceCode).AddToContainer(cont, 1, 1)
	
	'	
	Dim banner1 As VMBanner = vm.CreateBanner("banner1", Me).SetTwoLine(True)
	Dim avat As VMAvatar = vm.CreateAvatar("avat1", Me).SetSlot("icon").SetSize("40").SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	avat.SetIcon("mdi-lock","", CreateMap("color" : "white"), Null, Null)
	'
	banner1.AddComponent(avat.ToString)
	banner1.SetText(vm.Rand_LoremIpsum(1))
	banner1.AddAction(vm.CreateButton("btnDismis", Me).SetLabel("Dismiss").SetPrimary(True).SetTransparent(True))
	banner1.AddAction(vm.CreateButton("btnRetry", Me).SetLabel("Retry").SetPrimary(True).SetTransparent(True))
	'
	banner1.SetOnClickIcon("checkConnection")
	
	cont.AddComponent(2, 1, banner1.ToString)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim banner1 As VMBanner = vm.CreateBanner("banner1", Me).SetTwoLine(True)"$)
vue.AddCode($"Dim avat As VMAvatar = vm.CreateAvatar("avat1", Me).SetSlot("icon").SetSize("40").SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)"$)
vue.AddCode($"avat.SetIcon("mdi-lock","", CreateMap("color" : "white"), Null, Null)"$)
vue.AddCode($"'"$)
vue.AddCode($"banner1.AddComponent(avat.ToString)"$)
vue.AddCode($"banner1.SetText(vm.Rand_LoremIpsum(1))"$)
vue.AddCode($"banner1.AddAction(vm.CreateButton("btnDismis", Me).SetLabel("Dismiss").SetPrimary(True).SetTransparent(True))"$)
vue.AddCode($"banner1.AddAction(vm.CreateButton("btnRetry", Me).SetLabel("Retry").SetPrimary(True).SetTransparent(True))"$)
vue.AddCode($"'"$)
vue.AddCode($"banner1.SetOnClickIcon("checkConnection")"$)
vue.AddCode($""$)
vue.AddCode($"cont.AddComponent(1, 2, banner1.ToString)"$)
pgIndex.CreateVBCode(vue, Me, "banner1code", "Banner", vue.GetSourceCode).AddToContainer(cont, 2, 1)
	
	vm.AddContainer(cont)
End Sub


Sub checkConnection(e As BANanoEvent)
	vm.showsnackbar("Check connection!")
End Sub

Sub bannercardcodecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("bannercardcode")
End Sub

Sub bannercardcodedownload_click(e As BANanoEvent)
	vue.DownloadCode("bannercardcode", "bannercardcode.txt")
End Sub


Sub banner1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("banner1code")
End Sub

Sub banner1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("banner1code", "banner1code.txt")
End Sub


	
