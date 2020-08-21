B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "tabsCode"
	Public title As String = "Tabs"
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
	cont.addrows(5).AddColumns12
	'
	'create containers and content
	Dim lbl1 As VMLabel = vm.CreateLabel("").SetParagraph
	lbl1.SetText(vm.Rand_LoremIpsum(1))
	Dim contbtna As VMContainer
	contbtna = vm.CreateContainer("contxa", Me)
	contbtna.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)
	'
	Dim lbl2 As VMLabel = vm.CreateLabel("").SetParagraph
	lbl2.SetText(vm.Rand_LoremIpsum(1))
	Dim contbtnb As VMContainer
	contbtnb = vm.CreateContainer("contxb", Me)
	contbtnb.AddControlS(lbl2.Label, lbl2.tostring, 1, 1, 12, 12, 12, 12)

	'
	Dim lbl3 As VMLabel = vm.CreateLabel("").SetParagraph
	lbl3.SetText(vm.Rand_LoremIpsum(1))
	Dim contbtnc As VMContainer
	contbtnc = vm.CreateContainer("contxc", Me)
	contbtnc.AddControlS(lbl3.Label, lbl3.tostring, 1, 1, 12, 12, 12, 12)
	
	Dim b As VMTabs = vm.CreateTabs("b", Me).SetGrow(True).SetIconsAndText(True).SetDark(True).SetCentered(True)
	b.AddTab("b1", "Item 1", "mdi-phone",contbtna)
	b.AddTabBadge("b2", "Item 2", "mdi-heart", contbtnb, "10")
	vm.SetBadgeAvatar("b2", False)
	vm.SetBadgeOverlap("b2", False)
	vm.SetBadgeOffsetX("b2", "-40")
	vm.SetBadgeOffsetY("b2", "20")
	b.AddTab("b3", "Item 3", "mdi-account-box", contbtnc)
	b.AddToContainer(cont, 1, 1)
	'
	'initialize code builder
	vue.SourceCodeBuilder
	vue.AddCode($"'create containers and content"$)
	vue.AddCode($"Dim lbl1 As VMLabel = vm.CreateLabel("").SetParagraph"$)
	vue.AddCode($"lbl1.SetText(vm.Rand_LoremIpsum(1))"$)
	vue.AddCode($"Dim contbtna As VMContainer"$)
	vue.AddCode($"contbtna = vm.CreateContainer("contxa", Me)"$)
	vue.AddCode($"contbtna.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)"$)
	vue.AddCode($"'"$)
	vue.AddCode($"Dim lbl2 As VMLabel = vm.CreateLabel("").SetParagraph"$)
	vue.AddCode($"lbl2.SetText(vm.Rand_LoremIpsum(1))"$)
	vue.AddCode($"Dim contbtnb As VMContainer"$)
	vue.AddCode($"contbtnb = vm.CreateContainer("contxb", Me)"$)
	vue.AddCode($"contbtnb.AddControlS(lbl2.Label, lbl2.tostring, 1, 1, 12, 12, 12, 12)"$)
	vue.AddCode($""$)
	vue.AddCode($"'"$)
	vue.AddCode($"Dim lbl3 As VMLabel = vm.CreateLabel("").SetParagraph"$)
	vue.AddCode($"lbl3.SetText(vm.Rand_LoremIpsum(1))"$)
	vue.AddCode($"Dim contbtnc As VMContainer"$)
	vue.AddCode($"contbtnc = vm.CreateContainer("contxc", Me)"$)
	vue.AddCode($"contbtnc.AddControlS(lbl3.Label, lbl3.tostring, 1, 1, 12, 12, 12, 12)"$)
	Main.CreateVBCode(vue, Me, "tab1code", "Tab Containers", vue.GetSourceCode).AddToContainer(cont, 1, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim b As VMTabs = vm.CreateTabs("b", Me).SetGrow(True).SetIconsAndText(True).SetDark(True).SetCentered(True)"$)
vue.AddCode($"b.AddTab("b1", "Item 1", "mdi-phone",contbtna)"$)
vue.AddCode($"b.AddTabBadge("b2", "Item 2", "mdi-heart", contbtnb, "10")"$)
vue.AddCode($"vm.SetBadgeAvatar("b2", False)"$)
vue.AddCode($"vm.SetBadgeOverlap("b2", False)"$)
vue.AddCode($"vm.SetBadgeOffsetX("b2", "-40")"$)
vue.AddCode($"vm.SetBadgeOffsetY("b2", "20")"$)
vue.AddCode($"b.AddTab("b3", "Item 3", "mdi-account-box", contbtnc)"$)
vue.AddCode($"b.AddToContainer(cont, 1, 1)"$)
Main.CreateVBCode(vue, Me, "tab2code", "Tabs", vue.GetSourceCode).AddToContainer(cont, 2, 1)


	'
'	Dim tblBar As VMToolBar = vm.CreateToolbar("tbl1", Me).SetColor(vm.COLOR_CYAN).SetDark(True).SetFlat(True)
'	tblBar.AddHamburger
'	tblBar.AddTitle("Page title", "")
'	tblBar.AddSpacer
'	tblBar.AddIcon("mag", "mdi-magnify", "", "")
'	tblBar.AddIcon("mag1", "mdi-dots-vertical", "", "")
'	'
'	tblBar.Tabs.SetFixedTabs(True)
'	tblBar.AddTab("bb1", "Item 1", "mdi-phone", "This is item 1")
'	tblBar.AddTab("bb2", "Item 2", "mdi-heart", "This is item 2")
'	tblBar.AddTab("bb3", "Item 3", "mdi-account-box", "This is item 2")
'	
'	tblBar.AddToContainer(cont, 3, 1)
'	'
	vm.AddContainer(cont)
End Sub


Sub tab2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("tab2code")
End Sub

Sub tab2codedownload_click(e As BANanoEvent)
	vue.DownloadCode("tab2code", "tab2code.txt")
End Sub


Sub tab1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("tab1code")
End Sub

Sub tab1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("tab1code", "tab1code.txt")
End Sub

