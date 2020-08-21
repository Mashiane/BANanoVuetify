B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "toolbarCode"
	Public title As String = "Toolbars"
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
	cont.AddRows(5).AddColumns12
	'
	Dim tbl1 As VMToolBar = vm.CreateToolbar("tbl1", Me)
	tbl1.SetProminent(True).SetExtended(True).SetDark(True)
	tbl1.SetSrc("./assets/vbanner.jpg")
	'
	tbl1.AddHamburger
	tbl1.AddTitle("Toolbar Title","")
	tbl1.AddSpacer
	'
	tbl1.AddIcon("btnmagnify", "mdi-magnify", "", "")
	tbl1.AddIcon("btnheart", "mdi-heart", "", "")
	tbl1.AddIcon("btnmenu", "mdi-dots-vertical", "", "")
	tbl1.AddIcon("btnexport", "mdi-export", "", "")
	'
	Dim fab As VMButton = vm.CreateFABButton("fabx", Me, "mdi-plus").SetColor("pink").SetBottomLeft(True)
	Dim fab2 As VMButton = vm.CreateFABButton("fabbr", Me, "mdi-plus").SetColor("green").SetBottomRight(True)
	
	tbl1.AddFAB(fab)
	tbl1.AddFAB(fab2)
	'
	tbl1.AddToContainer(cont, 1, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim tbl1 As VMToolBar = vm.CreateToolbar("tbl1", Me)"$)
vue.AddCode($"tbl1.SetProminent(True).SetExtended(True).SetDark(True)"$)
vue.AddCode($"tbl1.SetSrc("./assets/vbanner.jpg")"$)
vue.AddCode($"'"$)
vue.AddCode($"tbl1.AddHamburger"$)
vue.AddCode($"tbl1.AddTitle("Toolbar Title","")"$)
vue.AddCode($"tbl1.AddSpacer"$)
vue.AddCode($"'"$)
vue.AddCode($"tbl1.AddIcon("btnmagnify", "mdi-magnify", "", "")"$)
vue.AddCode($"tbl1.AddIcon("btnheart", "mdi-heart", "", "")"$)
vue.AddCode($"tbl1.AddIcon("btnmenu", "mdi-dots-vertical", "", "")"$)
vue.AddCode($"tbl1.AddIcon("btnexport", "mdi-export", "", "")"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim fab As VMButton = vm.CreateFABButton("fabx", Me, "mdi-plus").SetColor("pink").SetBottomLeft(True)"$)
vue.AddCode($""$)
vue.AddCode($"'trapping events"$)
vue.AddCode($""$)
vue.AddCode($"Sub btnexport_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("Export!")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub btnmenu_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("Menu!")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub btnheart_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("Heart!")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub btnmagnify_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("Search!")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub fabx_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("Pink button clicked!")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub fabbr_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("Green button clicked!")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($"Dim fab2 As VMButton = vm.CreateFABButton("fabbr", Me, "mdi-plus").SetColor("green").SetBottomRight(True)"$)
vue.AddCode($""$)
vue.AddCode($"tbl1.AddFAB(fab)"$)
vue.AddCode($"tbl1.AddFAB(fab2)"$)
vue.AddCode($"'"$)
vue.AddCode($"tbl1.AddToContainer(cont, 1, 1)"$)
Main.CreateVBCode(vue, Me, "toolbar1code", "Toolbar", vue.GetSourceCode).AddToContainer(cont, 2, 1)


	'
	Dim tbx As VMToolBar = vm.createtoolbar("tbx", Me).SetDark(True).SetColor(vm.COLOR_PURPLE)
	tbx.AddTitle("My Toolbar X","")
	tbx.AddDivider(True, Null, Null, Array("mx-4"), Null)
	tbx.AddSubHeading("My Sub Heading X", Null, Null, Null, Null)
	tbx.AddSpacer
	tbx.AddButton(vm.CreateButton("btnx1", Me).SetAttrLoose("text").SetLabel("News"))
	tbx.AddButton(vm.CreateButton("btnx2", Me).SetAttrLoose("text").SetLabel("Blog"))
	tbx.AddButton(vm.CreateButton("btnx3", Me).SetAttrLoose("text").SetLabel("Music"))
	tbx.AddHamburger   'tbxmenu
	
	cont.AddComponent(4,1, tbx.ToString)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim tbx As VMToolBar = vm.createtoolbar("tbx", Me).SetDark(True).SetColor(vm.COLOR_PURPLE)"$)
vue.AddCode($"tbx.AddTitle("My Toolbar X","")"$)
vue.AddCode($"tbx.AddDivider(True, Null, Null, Array("mx-4"), Null)"$)
vue.AddCode($"tbx.AddSubHeading("My Sub Heading X", Null, Null, Null, Null)"$)
vue.AddCode($"tbx.AddSpacer"$)
vue.AddCode($"tbx.AddButton(vm.CreateButton("btnx1", Me).SetAttrLoose("text").SetLabel("News"))"$)
vue.AddCode($"tbx.AddButton(vm.CreateButton("btnx2", Me).SetAttrLoose("text").SetLabel("Blog"))"$)
vue.AddCode($"tbx.AddButton(vm.CreateButton("btnx3", Me).SetAttrLoose("text").SetLabel("Music"))"$)
vue.AddCode($"tbx.AddHamburger   'tbxmenu"$)
vue.AddCode($""$)
vue.AddCode($"cont.AddComponent(3,1, tbx.ToString)"$)
vue.AddCode($""$)
vue.AddCode($"'events"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub tbxmenu_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("Menu clicked!")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub btnexport_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("Export!")"$)
vue.AddCode($"End Sub"$)
Main.CreateVBCode(vue, Me, "toolbar2code", "Toolbar", vue.GetSourceCode).AddToContainer(cont,5, 1)


	'add container to page
	vm.AddContainer(cont)
End Sub


Sub toolbar2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("toolbar2code")
End Sub

Sub toolbar2codedownload_click(e As BANanoEvent)
	vue.DownloadCode("toolbar2code", "toolbar2code.txt")
End Sub


Sub toolbar1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("toolbar1code")
End Sub

Sub toolbar1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("toolbar1code", "toolbar1code.txt")
End Sub


Sub tbxmenu_click(e As BANanoEvent)
	vm.ShowSnackBar("Menu clicked!")
End Sub


Sub btnexport_click(e As BANanoEvent)
	vm.ShowSnackBar("Export!")
End Sub

Sub btnmenu_click(e As BANanoEvent)
	vm.ShowSnackBar("Menu!")
End Sub

Sub btnheart_click(e As BANanoEvent)
	vm.ShowSnackBar("Heart!")
End Sub

Sub btnmagnify_click(e As BANanoEvent)
	vm.ShowSnackBar("Search!")
End Sub

Sub fabx_click(e As BANanoEvent)
	vm.ShowSnackBar("Pink button clicked!")
End Sub


Sub fabbr_click(e As BANanoEvent)
	vm.ShowSnackBar("Green button clicked!")
End Sub