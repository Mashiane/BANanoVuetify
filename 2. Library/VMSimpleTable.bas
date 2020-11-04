B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public SimpleTable As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean    'ignore
	Private Module As Object      'ignore
	Private items As List
	Private columns As Map
	Type TableColumn(value As String, text As String, align As String, sortable As Boolean, filterable As Boolean, divider As Boolean, _
	className As String, width As String, filter As String, sort As String, TypeOf As String, extra As String, icon As String, Disabled As Boolean, imgWidth As String, imgHeight As String, avatarSize As String, iconSize As String, iconColor As String, ReadOnly As Boolean, progressColor As String, progressRotate As String, progressSize As String, progressWidth As String, progressHeight As String, progressShowValue As Boolean, valueFormat As String, bindTotals As String, hasTotal As Boolean)
	Private template As VMElement
	Private thead As VMElement
	Private tbody As VMElement
	'
	'alignment
	Public ALIGN_CENTER As String = "center"
	Public ALIGN_RIGHT As String = "right"
	Public ALIGN_LEFT As String = "left"
	Private itemsname As String
	Private pk As String
End Sub

'initialize the SimpleTable
Public Sub Initialize(v As BANanoVue, sid As String, primaryKey As String, eventHandler As Object) As VMSimpleTable
	ID = sid.tolowercase
	SimpleTable.Initialize(v, ID)
	SimpleTable.SetTag("v-simple-table")
	DesignMode = False
	Module = eventHandler
	vue = v
	pk = primaryKey
	items.Initialize 
	columns.Initialize 
	template.Initialize(vue, "").SetTag("template")
	template.SetAttrLoose("v-slot:default")
	thead.Initialize(vue, "").SetTag("thead")
	tbody.Initialize(vue, "").SetTag("tbody")
	itemsname = $"${ID}records"$
	vue.SetData(itemsname, vue.NewList)
	Return Me
End Sub

private Sub BuildHeaders
	Dim tr As VMElement
	tr.Initialize(vue, "").SetTag("tr")
	'
	For Each k As String In columns.Keys
		Dim tc As TableColumn = columns.Get(k)
		Dim th As VMElement
		th.Initialize(vue, "").SetTag("th")
		th.SetText(tc.text)
		Select Case tc.align
		Case ALIGN_CENTER
		Case ALIGN_RIGHT	
		Case Else
			th.AddClass("text-left")
		End Select
		tr.AddElement(th)
	Next
	thead.AddElement(tr)
End Sub

private Sub BuildRecords
	Dim tr As VMElement
	tr.Initialize(vue, "").SetTag("tr")
	tr.SetVFor("item", $"${ID}items"$)
	If pk <> "" Then 
		tr.Bind(":key", $"item.${pk}"$)
	End If
	For Each k As String In columns.Keys
		Dim td As VMElement
		td.Initialize(vue, "").SetTag("td")
		td.SetText($"{{ item.${k} }}"$)
		tr.AddElement(td)
	Next
	tbody.AddElement(tr)
End Sub

'set the column data template
Sub SetColumnAlignment(colName As String, colAlign As String) As VMSimpleTable
	If columns.ContainsKey(colName) Then
		Dim col As TableColumn = columns.Get(colName)
		col.align = colAlign
		columns.Put(colName,col)
	End If
	Return Me
End Sub


'add column
Sub AddColumn(fld As String, title As String) As VMSimpleTable
	fld = fld.tolowercase
	Dim tc As TableColumn
	tc.Initialize 
	tc.value = fld.ToLowerCase
	tc.text = title
	columns.Put(fld, tc)
	Return Me 	
End Sub

'clear records
Sub Clear As VMSimpleTable
	items.Initialize
	vue.SetData(itemsname, vue.NewList)
	Return Me
End Sub

'add a new record
Sub AddRow(rowData As Map) As VMSimpleTable
	items.Add(rowData)
	Return Me
End Sub

'set data source
Sub SetDataSource(dsName As String) As VMSimpleTable
	Dim recs As List = vue.GetData(dsName)
	vue.SetData($"${ID}items"$, recs)
	Return Me
End Sub

'refresh the table
Sub Refresh
	vue.SetData($"${ID}items"$, items)
End Sub

Sub SetData(xprop As String, xValue As Object) As VMSimpleTable
	vue.SetData(xprop, xValue)
	Return Me
End Sub

'add an element to the page content
Sub AddElement(elm As VMElement)
	SimpleTable.SetText(elm.ToString)
End Sub

'get component
Sub ToString As String
	BuildHeaders
	BuildRecords
	If items.Size > 0 Then
		Refresh
	End If
	template.AddElement(thead)
	template.AddElement(tbody)
	SimpleTable.AddElement(template)
	Return SimpleTable.ToString
End Sub

Sub SetVModel(k As String) As VMSimpleTable
	SimpleTable.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMSimpleTable
	SimpleTable.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMSimpleTable
	SimpleTable.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSimpleTable
	Dim childHTML As String = child.ToString
	SimpleTable.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSimpleTable
	SimpleTable.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSimpleTable
	SimpleTable.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSimpleTable
	SimpleTable.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSimpleTable
	SimpleTable.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMSimpleTable
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	SimpleTable.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMSimpleTable
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	SimpleTable.Bind(":dense", pp)
	Return Me
End Sub

Sub SetCalculateWidth(b As Boolean) As VMSimpleTable
	'calculate-widths
	Dim pp As String = $"${ID}calcwidths"$
	vue.SetStateSingle(pp, b)
	SimpleTable.Bind(":calculate-widths", pp)
	Return Me
End Sub

'set fixed-header
Sub SetFixedHeader(varFixedHeader As Boolean) As VMSimpleTable
	Dim pp As String = $"${ID}FixedHeader"$
	vue.SetStateSingle(pp, varFixedHeader)
	SimpleTable.Bind(":fixed-header", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMSimpleTable
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	SimpleTable.Bind(":height", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMSimpleTable
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	SimpleTable.Bind(":light", pp)
	Return Me
End Sub

'hide the component
Sub Hide As VMSimpleTable
	SimpleTable.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMSimpleTable
	SimpleTable.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMSimpleTable
	SimpleTable.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMSimpleTable
	SimpleTable.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSimpleTable
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMSimpleTable
	SimpleTable.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMSimpleTable
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMSimpleTable
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	SimpleTable.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMSimpleTable
	SimpleTable.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSimpleTable
	SimpleTable.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMSimpleTable
	SimpleTable.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMSimpleTable
	SimpleTable.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMSimpleTable
	SimpleTable.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSimpleTable
	SimpleTable.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMSimpleTable
	SimpleTable.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMSimpleTable
	SimpleTable.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMSimpleTable
	SimpleTable.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMSimpleTable
	SimpleTable.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMSimpleTable
	SimpleTable.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMSimpleTable
	SimpleTable.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSimpleTable
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMSimpleTable
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMSimpleTable
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSimpleTable
	SimpleTable.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSimpleTable
	SimpleTable.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSimpleTable
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSimpleTable
	SimpleTable.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMSimpleTable
	SimpleTable.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMSimpleTable
	SimpleTable.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSimpleTable
SimpleTable.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub


Sub SetVisible(b As Boolean) As VMSimpleTable
SimpleTable.SetVisible(b)
Return Me
End Sub
