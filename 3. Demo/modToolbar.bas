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
End Sub


Sub Code
	vm = pgIndex.vm
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
	Dim tbx As VMToolBar = vm.createtoolbar("tbx", Me).SetDark(True).SetColor(vm.COLOR_PURPLE)
	tbx.AddTitle("My Toolbar X","")
	tbx.AddDivider(True, Null, Null, Array("mx-4"), Null)
	tbx.AddSubHeading("My Sub Heading X", Null, Null, Null, Null)
	tbx.AddSpacer
	tbx.AddButton(vm.CreateButton("btnx1", Me).SetAttrLoose("text").SetLabel("News"))
	tbx.AddButton(vm.CreateButton("btnx2", Me).SetAttrLoose("text").SetLabel("Blog"))
	tbx.AddButton(vm.CreateButton("btnx3", Me).SetAttrLoose("text").SetLabel("Music"))
	tbx.AddHamburger   'tbxmenu
	
	cont.AddComponent(3,1, tbx.ToString)
	'
	'add container to page
	vm.AddContainer(cont)
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