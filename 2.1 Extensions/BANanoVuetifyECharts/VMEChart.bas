B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
'https://v-charts.js.org
Sub Class_Globals
Public EChart As VMElement
Public ID As String
Private vue As BANanoVue
Private BANano As BANano  'ignore
Private DesignMode As Boolean
Private Module As Object
Private columnsD As List
Private rowsD As List
Private chartData As Map
Private cdKey As String
Private optKey As String
Private options As Map
Private extend As Map
Private extKey As String
Private treeItems As List
End Sub

'initialize the EChart
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMEChart
	BANano.DependsOnAsset("echarts.min.js")
	BANano.DependsOnAsset("bmap.min.js")
	BANano.DependsOnAsset("v-chart.js")
	BANano.DependsOnAsset("v-chart.min.css")
	'
	ID = sid.tolowercase
	EChart.Initialize(v, ID)
	EChart.SetTag("ve-chart")
	Module = eventHandler
	vue = v
	
	'
	DesignMode = False
	rowsD.Initialize 
	columnsD.Initialize 
	chartData.Initialize 
	cdKey = $"${ID}chartdata"$
	vue.SetData(cdKey, vue.newlist)
	Bind(":data", cdKey)
	optKey = $"${ID}settings"$
	options.Initialize 
	vue.SetData(optKey, options)
	extend.Initialize 
	extKey = $"${ID}extend"$
	vue.SetData(extKey, extend)
	Bind(":extend", extKey)
	treeItems.Initialize
	Bind(":toolbox", $"${ID}toolbox"$) 
	'
	Dim toolbox As Map = CreateMap()
	Dim feature As Map = CreateMap()
	feature.Put("saveAsImage", CreateMap())
	toolbox.Put("feature", feature)
	'
	vue.SetData($"${ID}toolbox"$, toolbox)
	Return Me
End Sub

'add items for tree
Sub AddItem(parentid As String, itemid As String, props As Map) As VMEChart
	Dim m As Map = CreateMap()
	For Each k As String In props.keys
		Dim v As String = props.Get(k)
		m.Put(k, v)
	Next
	m.Put("parentid", parentid)
	m.Put("id", itemid)
	treeItems.Add(m)
	Return Me
End Sub

Sub TreeData As List
	Dim td As List = vue.Unflatten(treeItems, "children")
	Return td	
End Sub

Sub SetLinks(links As List) As VMEChart
	options.Put("links", links)
	Return Me
End Sub

Sub SetMetrics(metrics As List) As VMEChart
	options.Put("metrics", metrics)
	Return Me
End Sub
'
Sub SetDimension(dimension As List) As VMEChart
	options.Put("dimension", dimension)
	Return Me
End Sub

Sub SetRotateXAxis(angle As Int) As VMEChart
	extend.put("xAxis.0.axisLabel.rotate", angle)
	Return Me
End Sub

Sub SetXAxisTypeValue As VMEChart
	options.Put("xAxisType", "value")
	Return Me
End Sub

Sub SetBMapKey(skey As String) As VMEChart
	options.Put("key", skey)
	SetTypeBMap
	Return Me
End Sub

Sub SetBMapCenter(lat As Double, lng As Double) As VMEChart
	Dim bMap As Map = CreateMap()
	If options.ContainsKey("bmap") Then
		bMap = options.Get("bmap")
	End If
	Dim co As List
	co.Initialize 
	co.AddAll(Array(lat, lng))
	bMap.Put("center", co)
	options.Put("bmap", bMap)
	SetTypeBMap
	Return Me
End Sub

Sub SetBMapZoom(zoom As Int) As VMEChart
	zoom = BANano.parseInt(zoom)
	Dim bMap As Map = CreateMap()
	If options.ContainsKey("bmap") Then
		bMap = options.Get("bmap")
	End If
	bMap.Put("zoom", zoom)
	options.Put("bmap", bMap)
	SetTypeBMap
	Return Me
End Sub
'
Sub SetBMapRoam(roam As Boolean) As VMEChart
	Dim bMap As Map = CreateMap()
	If options.ContainsKey("bmap") Then
		bMap = options.Get("bmap")
	End If
	bMap.Put("roam", roam)
	options.Put("bmap", bMap)
	SetTypeBMap
	Return Me
End Sub

private Sub SetTypeBMap As VMEChart
	options.Put("type", "bmap")
	Return Me
End Sub

Sub SetArea As VMEChart
	options.Put("area", True)
	Return Me
End Sub

Sub SetStack(stackedName As String, columns As List) As VMEChart
	Dim stack As Map = CreateMap()
	stack.Put(stackedName, columns)
	options.Put("stack", stack)
	Return Me
End Sub

Sub SetShowLine(line As List) As VMEChart
	options.Put("showLine", line)
	Return Me
End Sub

Sub SetShowLabelOnTop As VMEChart
	Dim normal As Map = CreateMap()
	normal.Put("show", True)
	normal.Put("position", "top")
	'
	Dim label As Map = CreateMap()
	label.Put("normal", normal)
	options.Put("label", label)
	Return Me	
End Sub

Sub SetDataOrder(label As String, sortOrder As String) As VMEChart
	Dim dataorder As Map = CreateMap()
	dataorder.Put("label", label)
	dataorder.Put("order", sortOrder)
	options.Put("dataOrder", dataorder)
	Return Me	
End Sub

Sub SetDataType(column As String, dataType As String) As VMEChart
	Dim dt As Map = CreateMap()
	If options.ContainsKey("dataType") Then
		dt = options.Get("dataType")
	End If
	dt.Put(column, dataType)
	options.Put("dataType", dt)
	Return Me
End Sub


Sub SetDataName(label As String, value As String) As VMEChart
	Dim lm As Map = CreateMap()
	If options.ContainsKey("dataName") Then
		lm = options.Get("dataName")
	End If
	lm.Put(label, value)
	options.Put("dataName", lm)
	Return Me
End Sub


Sub SetLabelMap(label As String, value As String) As VMEChart
	Dim lm As Map = CreateMap()
	If options.ContainsKey("labelMap") Then
		lm = options.Get("labelMap")
	End If
	lm.Put(label, value)
	options.Put("labelMap", lm)
	Return Me
End Sub

Sub SetSeriesMap(series As String, m As Map) As VMEChart
	Dim dt As Map = CreateMap()
	Dim ol As Map = CreateMap()
	If options.ContainsKey("seriesMap") Then
		dt = options.Get("seriesMap")
	End If
	If dt.ContainsKey(series) Then
		ol = dt.Get(series)
	End If
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		ol.Put(k, v)
	Next
	dt.Put(series, ol)
	options.Put("seriesMap", dt)
	Return Me
End Sub

Sub SetTreeRadial(treeName As String) As VMEChart
	SetSeriesMap(treeName, CreateMap("layout":"radial"))
	Return Me
End Sub

Sub SetTreeVertical(treeName As String) As VMEChart
	SetSeriesMap(treeName, CreateMap("orient":"vertical"))
	Return Me
End Sub

Sub SetLabel(b As Boolean) As VMEChart
	options.Put("label", b)
	Return Me
End Sub

Sub SetGaugeChart As VMEChart
	EChart.SetTag("ve-gauge")
	Return Me
End Sub

Sub SetSanKeyChart As VMEChart
	EChart.SetTag("ve-sankey")
	Return Me
End Sub

Sub SetHeatMap As VMEChart
	EChart.SetTag("ve-heatmap")
	Return Me
End Sub


Sub SetTreeChart As VMEChart
	EChart.SetTag("ve-tree")
	Return Me
End Sub

Sub SetLiquidFillChart As VMEChart
	EChart.SetTag("ve-liquidfill")
	Return Me
End Sub

Sub SetSelectModeSingle As VMEChart
	options.Put("selectedMode", "single")
	Return Me
End Sub

Sub SetDataTypePercent As VMEChart
	options.Put("dataType", "percent")
	Return Me
End Sub

Sub SetDataTypeKMB As VMEChart
	options.Put("dataType", "KMB")
	Return Me
End Sub

Sub SetRadius(radius As List) As VMEChart
	options.Put("radius", radius)
	Return Me
End Sub

Sub SetOffsetY(offsetY As Int) As VMEChart
	offsetY = BANano.parseInt(offsetY)
	options.Put("offsetY", offsetY)
	Return Me
End Sub

Sub SetFunnelChart As VMEChart
	EChart.SetTag("ve-funnel")
	Return Me
End Sub

Sub SetWaterfall As VMEChart
	EChart.SetTag("ve-waterfall")
	Return Me
End Sub

Sub SetUseDefaultOrder As VMEChart
	options.Put("useDefaultOrder", True)
	Return Me
End Sub

Sub SetSequence(sequence As List) As VMEChart
	options.Put("sequence", sequence)
	Return Me
End Sub

Sub SetRadarChart As VMEChart
	EChart.SetTag("ve-radar")
	Return Me
End Sub

Sub SetPosition(position As String) As VMEChart
	options.Put("position", position)
	Return Me
End Sub

Sub SetMapChart As VMEChart
	EChart.SetTag("ve-map")
	Return Me
End Sub

Sub SetAscending As VMEChart
	options.Put("ascending", True)
	Return Me
End Sub

Sub SetFilterZero As VMEChart
	options.Put("filterZero", True)
	Return Me
End Sub

'make it a line chart
Sub SetLineChart As VMEChart
	EChart.SetTag("ve-line")
	Return Me
End Sub

Sub SetRingChart As VMEChart
	EChart.SetTag("ve-ring")
	Return Me
End Sub

Sub SetHistogram As VMEChart
	EChart.SetTag("ve-histogram")
	Return Me
End Sub

Sub SetBarChart As VMEChart
	EChart.SetTag("ve-bar")
	Return Me
End Sub

Sub SetPieChart As VMEChart
	EChart.SetTag("ve-pie")
	Return Me
End Sub

Sub SetRoseTypeRadius As VMEChart
	options.Put("roseType", "radius")
	Return Me
End Sub

Sub SetLimitShowNum(num As Int) As VMEChart
	num = BANano.parseInt(num)
	options.Put("limitShowNum", num)
	Return Me
End Sub

'add columns
Sub SetColumns(cols As List) As VMEChart
	columnsD.AddAll(cols)
	Return Me
End Sub

'add rows
Sub SetRows(rows As List) As VMEChart
	rowsD.AddAll(rows)
	Return Me 
End Sub

Sub AddRow(rowD As Map) As VMEChart
	rowsD.Add(rowD)
	Return Me
End Sub

'get component
Sub ToString As String
	vue.SetData(extKey, extend)
	chartData.Put("columns", columnsD)
	chartData.Put("rows", rowsD)
	vue.SetData(cdKey, chartData)
	If options.Size > 0 Then
		vue.SetData(optKey, options)
		Bind(":settings", optKey)
	End If
	Return EChart.ToString
End Sub

Sub SetVModel(k As String) As VMEChart
EChart.SetVModel(k)
Return Me
End Sub

Sub SetVIf(vif As Object) As VMEChart
EChart.SetVIf(vif)
Return Me
End Sub

Sub SetVShow(vif As Object) As VMEChart
EChart.SetVShow(vif)
Return Me
End Sub

'add to app template
Sub Render
vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMEChart
Dim childHTML As String = child.ToString
EChart.SetText(childHTML)
Return Me
End Sub

'set text
Sub SetText(t As Object) As VMEChart
EChart.SetText(t)
Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMEChart
EChart.AddClass(c)
Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMEChart
EChart.SetAttr(attr)
Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMEChart
EChart.SetStyle(sm)
Return Me
End Sub

'add children
Sub AddChildren(children As List)
For Each childx As VMElement In children
AddChild(childx)
Next
End Sub

'set data
Sub SetData(varData As Object) As VMEChart
Dim pp As String = $"${ID}Data"$
vue.SetStateSingle(pp, varData)
EChart.Bind(":data", pp)
Return Me
End Sub

'set settings
Sub SetSettings(varSettings As Object) As VMEChart
Dim pp As String = $"${ID}Settings"$
vue.SetStateSingle(pp, varSettings)
EChart.Bind(":settings", pp)
Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMEChart
Dim pp As String = $"${ID}Width"$
vue.SetStateSingle(pp, varWidth)
EChart.Bind(":width", pp)
Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMEChart
Dim pp As String = $"${ID}Height"$
vue.SetStateSingle(pp, varHeight)
EChart.Bind(":height", pp)
Return Me
End Sub

'set events
Sub SetEvents(varEvents As Object) As VMEChart
Dim pp As String = $"${ID}Events"$
vue.SetStateSingle(pp, varEvents)
EChart.Bind(":events", pp)
Return Me
End Sub

'set init-options
Sub SetInitOptions(varInitOptions As Object) As VMEChart
Dim pp As String = $"${ID}InitOptions"$
vue.SetStateSingle(pp, varInitOptions)
EChart.Bind(":init-options", pp)
Return Me
End Sub

'set tooltip-visible
Sub SetTooltipVisible(varTooltipVisible As Object) As VMEChart
Dim pp As String = $"${ID}TooltipVisible"$
vue.SetStateSingle(pp, varTooltipVisible)
EChart.Bind(":tooltip-visible", pp)
Return Me
End Sub

'set legend-visible
Sub SetLegendVisible(varLegendVisible As Object) As VMEChart
Dim pp As String = $"${ID}LegendVisible"$
vue.SetStateSingle(pp, varLegendVisible)
EChart.Bind(":legend-visible", pp)
Return Me
End Sub

'set theme
Sub SetTheme(varTheme As Object) As VMEChart
Dim pp As String = $"${ID}Theme"$
vue.SetStateSingle(pp, varTheme)
EChart.Bind(":theme", pp)
Return Me
End Sub

'set theme-name
Sub SetThemeName(varThemeName As Object) As VMEChart
Dim pp As String = $"${ID}ThemeName"$
vue.SetStateSingle(pp, varThemeName)
EChart.Bind(":theme-name", pp)
Return Me
End Sub

'set judge-width
Sub SetJudgeWidth(varJudgeWidth As Object) As VMEChart
Dim pp As String = $"${ID}JudgeWidth"$
vue.SetStateSingle(pp, varJudgeWidth)
EChart.Bind(":judge-width", pp)
Return Me
End Sub

'set width-change-delay
Sub SetWidthChangeDelay(varWidthChangeDelay As Object) As VMEChart
Dim pp As String = $"${ID}WidthChangeDelay"$
vue.SetStateSingle(pp, varWidthChangeDelay)
EChart.Bind(":width-change-delay", pp)
Return Me
End Sub

'set resizable
Sub SetResizable(varResizable As Object) As VMEChart
Dim pp As String = $"${ID}Resizable"$
vue.SetStateSingle(pp, varResizable)
EChart.Bind(":resizable", pp)
Return Me
End Sub

'set cancel-resize-check
Sub SetCancelResizeCheck(varCancelResizeCheck As Object) As VMEChart
Dim pp As String = $"${ID}CancelResizeCheck"$
vue.SetStateSingle(pp, varCancelResizeCheck)
EChart.Bind(":cancel-resize-check", pp)
Return Me
End Sub

'set resize-delay
Sub SetResizeDelay(varResizeDelay As Object) As VMEChart
Dim pp As String = $"${ID}ResizeDelay"$
vue.SetStateSingle(pp, varResizeDelay)
EChart.Bind(":resize-delay", pp)
Return Me
End Sub

'set change-delay
Sub SetChangeDelay(varChangeDelay As Object) As VMEChart
Dim pp As String = $"${ID}ChangeDelay"$
vue.SetStateSingle(pp, varChangeDelay)
EChart.Bind(":change-delay", pp)
Return Me
End Sub

'set set-option-opts
Sub SetSetOptionOpts(varSetOptionOpts As Object) As VMEChart
Dim pp As String = $"${ID}SetOptionOpts"$
vue.SetStateSingle(pp, varSetOptionOpts)
EChart.Bind(":set-option-opts", pp)
Return Me
End Sub

'set not-set-unchange
Sub SetNotSetUnchange(varNotSetUnchange As Object) As VMEChart
Dim pp As String = $"${ID}NotSetUnchange"$
vue.SetStateSingle(pp, varNotSetUnchange)
EChart.Bind(":not-set-unchange", pp)
Return Me
End Sub

'set log
Sub SetLog(varLog As Object) As VMEChart
Dim pp As String = $"${ID}Log"$
vue.SetStateSingle(pp, varLog)
EChart.Bind(":log", pp)
Return Me
End Sub


'hide the component
Sub Hide As VMEChart
	EChart.SetVisible(False)
    Return Me
End Sub

'show the component
Sub Show As VMEChart
	EChart.SetVisible(True)
    Return Me
End Sub

'enable the component
Sub Enable As VMEChart
	EChart.Enable(True)
    Return Me
End Sub

'disable the component
Sub Disable As VMEChart
	EChart.Disable(True)
    Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMEChart
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMEChart
	EChart.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMEChart
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMEChart
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	EChart.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMEChart
	EChart.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMEChart
	EChart.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMEChart
	EChart.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMEChart
	EChart.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMEChart
	EChart.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMEChart
	EChart.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMEChart
	EChart.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMEChart
	EChart.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMEChart
	EChart.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMEChart
	EChart.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMEChart
	EChart.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMEChart
	EChart.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMEChart
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMEChart
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMEChart
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMEChart
	EChart.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMEChart
	EChart.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMEChart
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMEChart
	EChart.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMEChart
	EChart.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMEChart
	EChart.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMEChart
EChart.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub


Sub SetVisible(b As Boolean) As VMEChart
EChart.SetVisible(b)
Return Me
End Sub


'set color intensity
Sub SetTextColor(varColor As String) As VMEChart
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMEChart
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub
