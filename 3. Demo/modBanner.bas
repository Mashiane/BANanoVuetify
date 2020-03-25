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
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(10).AddColumns2x6
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
	Dim banner1 As VMBanner = vm.CreateBanner("banner1", Me).SetTwoLine(True)
	Dim avat As VMAvatar = vm.CreateAvatar("avat1", Me).SetSlot("icon").SetSize("40").SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	avat.SetIcon("mdi-lock","", CreateMap("color" : "white"), Null, Null)
	'
	banner1.AddComponent(avat.ToString)
	banner1.SetText(vm.Fake.Rand_LoremIpsum(1))
	banner1.AddAction(vm.CreateButton("btnDismis", Me).SetLabel("Dismiss").SetPrimary(True).SetTransparent(True))
	banner1.AddAction(vm.CreateButton("btnRetry", Me).SetLabel("Retry").SetPrimary(True).SetTransparent(True))
	'
	banner1.SetOnClickIcon("checkConnection")
	
	cont.AddComponent(1, 2, banner1.ToString)
	'
	
	vm.AddContainer(cont)
End Sub


Sub checkConnection(e As BANanoEvent)
	vm.showsnackbar("Check connection!")
End Sub