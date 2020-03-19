B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Dim vm As BANanoVM
	Private db As BANanoSQL
	Private alaSQL As BANanoAlaSQLE
	Private ui As VMContainer
	Private BANano As BANano
End Sub


Sub Init
	vm.Initialize(Me, Main.appname)
	vm.RTL = False
	vm.SnackBar.SetColor("green")
	vm.SnackBar.SetTop(True)
	vm.NavBar.SetModeFixed(True)
	vm.NavBar.SetHasMenuButton(False)
	vm.NavBar.UpdateLogo("./assets/sponge.png")
	vm.NavBar.UpdateTitle("BANanoVuetify Designer 3")
	vm.NavBar.Logo.SetBorderRadius("50%")
	vm.NavBar.Logo.SetBorder("1px", vm.COLOR_BLACK, vm.BORDER_DOTTED)
	
	vm.NavBar.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	vm.NavBar.SetDark(True)
	vm.Footer.Hide
	'
	vm.NavBar.AddIcon("btnRefresh", "refresh", "Refresh", "")
	'
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	Dim gridmenu As VMMenu = vm.createmenu("gridMenu", Me).SetButton("", "Grid")
	gridmenu.AddItem("btnClearGrid", "", "delete", "Clear", "", "")
	gridmenu.AddItem("btnRemoveLastGrid", "", "delete", "Remove Last", "", "")
	gridmenu.AddItem("btngridsourcecode", "", "code", "B4x Source Code", "", "")
	gridmenu.AddItem("btngridhtml", "", "code", "Grid HTML", "", "")
	vm.NavBar.AddMenu(gridmenu)
	'
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	vm.NavBar.AddIcon("btnBack", "chevron_left", "Back to demo", "")
	'
	BuildDrawer
	'
	vm.Container.SetFluid(True)
	DesignLayout
	
	AddPages
	'
	vm.UX
	'
	CreateUI
End Sub

Sub BuildDrawer
	
End Sub

Sub btnRefresh_click(e As BANanoEvent)
	CreateUI
End Sub

Sub btnBack_click(e As BANanoEvent)
	pgIndex.init
End Sub

Sub gridMenuitems_click(e As BANanoEvent)
	Dim menuID As String = vm.getidfromevent(e)
	Select Case menuID
	Case "btncleargrid"
		vm.ShowConfirm("cleargrid", "Confirm Clear Grid", "Are you sure that you want to clear the grid?", "Yes", "No")
	Case "btnremovelastgrid"
		vm.ShowConfirm("removelastgrid", "Confirm Remove Last", "Are you sure that you want to remove the last grid row?", "Yes", "No")
	Case "btngridsourcecode"
		Dim gridsource As String = BANano.GetSessionStorage("gridsourcecode")
		vm.SaveText2File(gridsource, "grid.txt")
	Case "btngridhtml"
		Dim gridhtml As String = BANano.GetSessionStorage("gridhtml")
		vm.SaveText2File(gridhtml, "gridhtml.txt")
	End Select
End Sub

Sub confirm_ok(e As BANanoEvent)
	Dim resp As String = vm.getconfirm
	Select Case resp
	Case "cleargrid"
		ClearGrid
	Case "removelastgrid"
		RemoveLastGridItem
	End Select
End Sub


'remove last grid item
Sub RemoveLastGridItem
	vm.pagepause
	db.OpenWait("bvmdesigner", "bvmdesigner")
	alaSQL.Initialize("grid", "id")
	alaSQL.Execute("select id from grid order by id desc")
	alaSQL.result = db.executewait(alaSQL.query, alaSQL.args)
	If alaSQL.result.size > 0 Then
		'get the record
		Dim rec As Map = alaSQL.result.get(0)
		'get the id
		Dim sid As String = rec.get("id")
		'delete the record
		alaSQL.Initialize("grid", "id")
		alaSQL.Delete(sid)
		alaSQL.result = db.executewait(alaSQL.query, alaSQL.args)
	End If
	vm.pageresume
	CreateUI
End Sub

'clear the contents of the grid
Sub ClearGrid
	vm.pagepause
	db.OpenWait("bvmdesigner", "bvmdesigner")
	alaSQL.Initialize("grid", "id")
	alaSQL.DeleteAll
	alaSQL.result = db.executewait(alaSQL.query, alaSQL.args)
	vm.pageresume
	CreateUI
End Sub

Sub AddPages

End Sub

Sub DesignLayout
	vm.Container.AddRows(1)
	vm.Container.AddColumns(1,2,2,2,2)
	vm.Container.AddColumns(1,7,7,7,7)
	vm.Container.AddColumns(1,3,3,3,3)
	'
	vm.Container.SetBorderRC(1, 2, "1px", vm.COLOR_LIGHTBLUE, vm.BORDER_DASHED)
	vm.Container.SetBorderRC(1, 3, "1px", vm.COLOR_LIGHTBLUE, vm.BORDER_DASHED)
	'
	'set drag and drop events
	vm.Container.SetOnDragOverRC(1, 2, "ItemDragOver")
	vm.Container.SetOnDropRC(1, 2, "ItemDrop")
	'
	Dim ep As VMExpansionPanels = vm.CreateExpansionpanels("ep1", Me).SetAccordion(True)
	Dim ep1 As VMExpansionPanel = GridPanel
	ep.AddPanel(ep1)
	'***
	' form inputs
	Dim inputs As VMExpansionPanel = vm.CreateExpansionPanel("ep1inputs", Me)
	inputs.Header.SetText("Form Inputs")
	'
	ep.AddPanel(inputs)
	'
	vm.container.AddComponent(1, 1, ep.tostring)
	'
	Dim dc As VMElement = vm.CreateDynamicContent("dc")
	vm.container.AddComponent(1, 2, dc.tostring)
End Sub


Sub GridPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("ep1grid", Me)
	grd.Header.SetText("Grid")
	grd.Container.SetTag("div")
	grd.Container.AddRows(8).AddColumns4X3
	'
	Dim rc12_tool As VMElement = vm.CreateDiv("rc12_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc12_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	rc12_tool.SetText("12").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY).SetLineHeight("32px")
	grd.Container.AddComponent(1,1,rc12_tool.tostring)
	'
	Dim rc62_tool As VMElement = vm.CreateDiv("rc6x2_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc62_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	rc62_tool.SetText("6x2").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY).SetLineHeight("32px")
	grd.Container.AddComponent(1,2,rc62_tool.tostring)
	'
	Dim rc112_tool As VMElement = vm.CreateDiv("rc12x1_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc112_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	rc112_tool.SetText("12x1").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY).SetLineHeight("32px")
	grd.Container.AddComponent(1,3,rc112_tool.tostring)
	'
	Dim rc26_tool As VMElement = vm.CreateDiv("rc2x6_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc26_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	rc26_tool.SetText("2x6").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY).SetLineHeight("32px")
	grd.Container.AddComponent(1,4,rc26_tool.tostring)
	'
	Dim rc43_tool As VMElement = vm.CreateDiv("rc4x3_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc43_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	rc43_tool.SetText("4x3").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY).SetLineHeight("32px")
	grd.Container.AddComponent(2,1,rc43_tool.tostring)
	'
	Dim rc34_tool As VMElement = vm.CreateDiv("rc3x4_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc34_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	rc34_tool.SetText("3x4").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY).SetLineHeight("32px")
	grd.Container.AddComponent(2,2,rc34_tool.tostring)
	'
	Dim rc57_tool As VMElement = vm.CreateDiv("rc5p7_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc57_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	rc57_tool.SetText("5+7").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY).SetLineHeight("32px")
	grd.Container.AddComponent(2,3,rc57_tool.tostring)
	'
	Dim rc75_tool As VMElement = vm.CreateDiv("rc7p5_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc75_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	rc75_tool.SetText("7+5").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY).SetLineHeight("32px")
	grd.Container.AddComponent(2,4,rc75_tool.tostring)
	'
	Dim rc84_tool As VMElement = vm.CreateDiv("rc8p4_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc84_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	rc84_tool.SetText("8+4").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY).SetLineHeight("32px")
	grd.Container.AddComponent(3,1,rc84_tool.tostring)
	'
	Dim rc93_tool As VMElement = vm.CreateDiv("rc9p3_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc93_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	rc93_tool.SetText("9+3").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY).SetLineHeight("32px")
	grd.Container.AddComponent(3,2,rc93_tool.tostring)
	'
	Dim rc102_tool As VMElement = vm.CreateDiv("rc10p2_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc102_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	rc102_tool.SetText("10+2").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY).SetLineHeight("32px")
	grd.Container.AddComponent(3,3,rc102_tool.tostring)
	'
	Dim rc111_tool As VMElement = vm.CreateDiv("rc11p1_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc111_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	rc111_tool.SetText("11+1").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(3,4,rc111_tool.tostring)
	'
	Dim rc4p8_tool As VMElement = vm.CreateDiv("rc4p8_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc4p8_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	rc4p8_tool.SetText("4+8").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(4,1,rc4p8_tool.tostring)
	'
	Dim rc3p9_tool As VMElement = vm.CreateDiv("rc3p9_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc3p9_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	rc3p9_tool.SetText("3+9").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(4,2,rc3p9_tool.tostring)
	'
	Dim rc2p10_tool As VMElement = vm.CreateDiv("rc2p10_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc2p10_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	rc2p10_tool.SetText("2+10").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(4,3,rc2p10_tool.tostring)
	'
	Dim rc1p11_tool As VMElement = vm.CreateDiv("rc1p11_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	rc1p11_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	rc1p11_tool.SetText("1+11").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(4,4,rc1p11_tool.tostring)
	'
	Dim row_tool As VMElement = vm.CreateDiv("row_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	row_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	row_tool.SetText("R1").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(5,1,row_tool.tostring)
	'
	Dim col1_tool As VMElement = vm.CreateDiv("col1_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	col1_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	col1_tool.SetText("C1").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(5,2,col1_tool.tostring)
	'
	Dim col2_tool As VMElement = vm.CreateDiv("col2_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	col2_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	col2_tool.SetText("C2").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(5,3,col2_tool.tostring)
	'
	Dim col3_tool As VMElement = vm.CreateDiv("col3_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	col3_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	col3_tool.SetText("C3").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(5,4,col3_tool.tostring)
	'
	Dim col4_tool As VMElement = vm.CreateDiv("col4_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	col4_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	col4_tool.SetText("C4").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(6,1,col4_tool.tostring)
	'
	Dim col5_tool As VMElement = vm.CreateDiv("col5_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	col5_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	col5_tool.SetText("C5").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(6,2,col5_tool.tostring)
	'
	Dim col6_tool As VMElement = vm.CreateDiv("col6_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	col6_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	col6_tool.SetText("C6").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(6,3,col6_tool.tostring)
	'
	Dim col7_tool As VMElement = vm.CreateDiv("col7_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	col7_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	col7_tool.SetText("C7").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(6,4,col7_tool.tostring)
	
	Dim col8_tool As VMElement = vm.CreateDiv("col8_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	col8_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	col8_tool.SetText("C8").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(7,1,col8_tool.tostring)
	'
	Dim col9_tool As VMElement = vm.CreateDiv("col9_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	col9_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	col9_tool.SetText("C9").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(7,2,col9_tool.tostring)
	'
	Dim col10_tool As VMElement = vm.CreateDiv("col10_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	col10_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	col10_tool.SetText("C10").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(7,3,col10_tool.tostring)
	'
	Dim col11_tool As VMElement = vm.CreateDiv("col11_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	col11_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	col11_tool.SetText("C11").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(7,4,col11_tool.tostring)
	'
	Dim col12_tool As VMElement = vm.CreateDiv("col12_tool").SetDraggable(True).SetOnDragStart(Me, "ItemDragStart")
	col12_tool.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle.SetLineHeight("32px")
	col12_tool.SetText("C12").SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY)
	grd.Container.AddComponent(8,1,col12_tool.tostring)	
	Return grd
End Sub

'create the user interface
Sub CreateUI
	Dim sb As StringBuilder
	sb.initialize
	'
	Dim tmp As VMContainer = vm.createcontainer("ui", Me)
	
	vm.pagepause
	'make it a div
	ui = vm.CreateContainer("ui", Me).SetTag("div")
	ui.SetDesignMode(True)
	ui.ShowMatrix = True
	ui.HasBorder = True
	'start with the grid
	db.OpenWait("bvmdesigner", "bvmdesigner")
	alaSQL.Initialize("grid", "id")
	alaSQL.SelectAll(Array("*"), Array("id"))
	alaSQL.result = db.executewait(alaSQL.query, alaSQL.args)
	For Each rec As Map In alaSQL.result
		Dim typeof As String = rec.get("typeof")
		Select Case typeof
		Case "row_tool"
			ui.AddRows(1)
			tmp.AddRows(1)
			sb.append($".Container.AddRows(1)"$).append(CRLF)
		Case "col1_tool"
			ui.AddColumns(1,1,1,1,1)
			tmp.AddColumns(1,1,1,1,1)
			sb.append($".Container.AddColumns(1,1,1,1,1)"$).append(CRLF)
		Case "col2_tool"
			ui.AddColumns(1,2,2,2,2)
			tmp.AddColumns(1,2,2,2,2)
			sb.append($".Container.AddColumns(1,2,2,2,2)"$).append(CRLF)
		Case "col3_tool"
			ui.AddColumns(1,3,3,3,3)
			tmp.AddColumns(1,3,3,3,3)
			sb.append($".Container.AddColumns(1,3,3,3,3)"$).append(CRLF)
		Case "col4_tool"
			ui.AddColumns(1,4,4,4,4)
			tmp.AddColumns(1,4,4,4,4)
			sb.append($".Container.AddColumns(1,4,4,4,4)"$).append(CRLF)
		Case "col5_tool"
			ui.AddColumns(1,5,5,5,5)
			tmp.AddColumns(1,5,5,5,5)
			sb.append($".Container.AddColumns(1,5,5,5,5)"$).append(CRLF)
		Case "col6_tool"
			ui.AddColumns(1,6,6,6,6)
			tmp.AddColumns(1,6,6,6,6)
			sb.append($".Container.AddColumns(1,6,6,6,6)"$).append(CRLF)
		Case "col7_tool"
			ui.AddColumns(1,7,7,7,7)
			tmp.AddColumns(1,7,7,7,7)
			sb.append($".Container.AddColumns(1,7,7,7,7)"$).append(CRLF)
		Case "col8_tool"
			ui.AddColumns(1,8,8,8,8)
			tmp.AddColumns(1,8,8,8,8)
			sb.append($".Container.AddColumns(1,8,8,8,8)"$).append(CRLF)
		Case "col9_tool"
			ui.AddColumns(1,9,9,9,9)
			tmp.AddColumns(1,9,9,9,9)
			sb.append($".Container.AddColumns(1,9,9,9,9)"$).append(CRLF)
		Case "col10_tool"
			ui.AddColumns(1,10,10,10,10)
			tmp.AddColumns(1,10,10,10,10)
			sb.append($".Container.AddColumns(1,10,10,10,10)"$).append(CRLF)
		Case "col11_tool"
			ui.AddColumns(1,11,11,11,11)
			tmp.AddColumns(1,11,11,11,11)
			sb.append($".Container.AddColumns(1,11,11,11,11)"$).append(CRLF)
		Case "col12_tool"
			ui.AddColumns(1,12,12,12,12)
			tmp.AddColumns(1,12,12,12,12)
			sb.append($".Container.AddColumns(1,12,12,12,12)"$).append(CRLF)
		Case "rc1p11_tool"
			ui.AddRows(1).AddColumns1p11
			tmp.AddRows(1).AddColumns1p11
			sb.append($".Container.AddRows(1).AddColumns1p11"$).append(CRLF)
		Case "rc4p8_tool"
			ui.AddRows(1).AddColumns4P8
			tmp.AddRows(1).AddColumns4P8
			sb.append($".Container.AddRows(1).AddColumns4P8"$).append(CRLF)
		Case "rc3p9_tool"
			ui.AddRows(1).AddColumns3P9
			tmp.AddRows(1).AddColumns3P9
			sb.append($".Container.AddRows(1).AddColumns3P9"$).append(CRLF)
		Case "rc12_tool"
			ui.AddRows(1).AddColumns12
			tmp.AddRows(1).AddColumns12
			sb.append($".Container.AddRows(1).AddColumns12"$).append(CRLF)
		Case "rc6x2_tool"
			ui.AddRows(1).AddColumns6x2
			tmp.AddRows(1).AddColumns6x2
			sb.append($".Container.AddRows(1).AddColumns6x2"$).append(CRLF)
		Case "rc12x1_tool"
			ui.AddRows(1).AddColumns12x1
			tmp.AddRows(1).AddColumns12x1
			sb.append($".Container.AddRows(1).AddColumns12x1"$).append(CRLF)
		Case "rc2x6_tool"
			ui.AddRows(1).AddColumns2x6
			tmp.AddRows(1).AddColumns2x6
			sb.append($".Container.AddRows(1).AddColumns2x6"$).append(CRLF)
		Case "rc4x3_tool"
			ui.AddRows(1).AddColumns4x3
			tmp.AddRows(1).AddColumns4x3
			sb.append($".Container.AddRows(1).AddColumns4x3"$).append(CRLF)
		Case "rc3x4_tool"
			ui.AddRows(1).AddColumns3X4
			tmp.AddRows(1).AddColumns3X4
			sb.append($".Container.AddRows(1).AddColumns3X4"$).append(CRLF)
		Case "rc5p7_tool"
			ui.AddRows(1).AddColumns5p7
			tmp.AddRows(1).AddColumns5p7
			sb.append($".Container.AddRows(1).AddColumns5p7"$).append(CRLF)
		Case "rc7p5_tool"
			ui.AddROws(1).AddCOlumns7p5
			tmp.AddROws(1).AddCOlumns7p5
			sb.append($".Container.AddROws(1).AddCOlumns7p5"$).append(CRLF)
		Case "rc8p4_tool"
			ui.AddRows(1).AddColumns8p4
			tmp.AddRows(1).AddColumns8p4
			sb.append($".Container.AddRows(1).AddColumns8p4"$).append(CRLF)
		Case "rc9p3_tool"
			ui.AddRows(1).AddColumns9p3
			tmp.AddRows(1).AddColumns9p3
			sb.append($".Container.AddRows(1).AddColumns9p3"$).append(CRLF)
		Case "rc10p2_tool"
			ui.AddROws(1).AddColumns10p2
			tmp.AddROws(1).AddColumns10p2
			sb.append($".Container.AddROws(1).AddColumns10p2"$).append(CRLF)
		Case "rc11p1_tool"
			ui.AddROws(1).AddColumns11p1
			tmp.AddROws(1).AddColumns11p1
			sb.append($".Container.AddROws(1).AddColumns11p1"$).append(CRLF)
		Case "rc2p10_tool"
			ui.addrows(1).AddColumns2p10
			tmp.addrows(1).AddColumns2p10
			sb.append($".Container.addrows(1).AddColumns2p10"$).append(CRLF)
		End Select
	Next
	Dim html As String = ui.tostring
	'save grid source code
	BANano.SetSessionStorage("gridsourcecode", sb.tostring)
	BANano.SetSessionStorage("gridhtml", tmp.tostring)
	vm.SetDynamicContent("dc", html)
	vm.pageresume
End Sub

'whenever we drag over
Sub ItemDragOver(e As BANanoEvent)
	'prevent the browser from stopping our drop events
	e.PreventDefault
	'e.OtherField("dataTransfer").SetField("dropEffect", "none")
End Sub

'whenever something is dragged
Sub ItemDragStart(e As BANanoEvent)
	'get the id of the element and save it for later use
	Dim itemID As String = vm.GetIDFromEvent(e)
	e.OtherField("dataTransfer").RunMethod("setData", Array("text/plain", itemID))
End Sub

'whenever we drop an item
Sub ItemDrop(e As BANanoEvent)
	e.PreventDefault
	'get the saved id by data transfer
	Dim savedid As String = e.OtherField("dataTransfer").RunMethod("getData", Array("text")).result
	'
	'get the item we are dropping to
	Dim dropZoneID As String = vm.GetIDFromEvent(e)
	'
	e.OtherField("dataTransfer").RunMethod("clearData", Null)
	
	Select Case dropZoneID
	Case "bananovmdemocontainerr1c2"
		'drop on root
		Select Case savedid
		Case "rc12_tool","rc6x2_tool", "rc1x12_tool", "rc2x6_tool","rc4x3_tool", "rc3x4_tool", _
			"rc5p7_tool","rc7p5_tool","rc8p4_tool","rc9p3_tool","rc10p2_tool","rc11p1_tool", _
			"rc4p8_tool", "rc3p9_tool", "rc2p10_tool", "rc1p11_tool", "rc12x1_tool", _
			"row_tool", "col2_tool", "col1_tool", "col3_tool","col4_tool","col5_tool", "col6_tool", "col7_tool", _
			"col8_tool", "col9_tool", "col10_tool", "col11_tool", "col12_tool"
			'adding 1 row and
			vm.pagepause
			db.OpenWait("bvmdesigner", "bvmdesigner")
			alaSQL.Initialize("grid", "id")
			Dim nrec As Map = CreateMap()
			nrec.put("id", DateTime.now)
			nrec.put("typeof", savedid)
			alaSQL.RecordFromMap(nrec)
			alaSQL.Insert
			alaSQL.result = db.executewait(alaSQL.query, alaSQL.args)
			vm.pageresume
		End Select
		'
		CreateUI
	End Select
End Sub