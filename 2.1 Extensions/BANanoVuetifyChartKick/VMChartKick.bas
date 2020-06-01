B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ChartKick As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Private module As Object
	'series colors
	Private series As Map
	Private data As Map
	Private colors As List
	Private coptions As String
	Type grdLine(display As Boolean, circular As Boolean,lineWidth As Int, drawBorder As Boolean, drawOnChartArea As Boolean, _
	drawTicks As Boolean, tickMarkLength As Int, zeroLineWidth As Int, offsetGridLines As Boolean)
	Type ticksType(autoSkip As Boolean, maxRotation As Int, minRotation As Int, MinValue As Int, MaxValue As Int, stepSize As Int, _
	beginAtZero As Boolean)
	Type xAxesType(display As Boolean, ticks As ticksType, gridLines As grdLine)
	Public xAxes As xAxesType
	Public yAxes As xAxesType
	Public OverwriteOptions As Boolean
	Type titleType(display As Boolean, text As String, position As String)
	Public Title As titleType
	'
	Private CK As BANanoObject
	Private CT As BANanoObject
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMChartKick
	BANano.DependsOnAsset("moment.js")
	BANano.DependsOnAsset("Chart.min.css")
	BANano.DependsOnAsset("Chart.min.js")
	BANano.DependsOnAsset("vue-chartkick.min.js")
	'
	vue = v
	module = eventHandler
	
	If vue.ModuleExist("chartkick") = False Then	
		CK.initialize("Chartkick")
		CT.Initialize("Chart")
		vue.Use(CK.RunMethod("use", CT))
		vue.AddModule("chartkick")
	End If
	
	ID = sid.ToLowerCase
	
	ChartKick.Initialize(vue, ID)
	coptions = $"${ID}options"$
	SetDownload
	SetAttrSingle(":library", coptions)
	'
	Title.Initialize 
	Title.display = True
	Title.position = "top"
	Title.text = ""
	'
	OverwriteOptions = False
	Reset
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMChartKick
	ChartKick.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMChartKick
	ChartKick.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMChartKick
	ChartKick.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMChartKick
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMChartKick
	ChartKick.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMChartKick
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMChartKick
	ChartKick.RemoveAttr(sName)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMChartKick
	ChartKick.SetDesignMode(b)
	Return Me
End Sub

Sub Reset
	series.Initialize
	data.Initialize
	colors.Initialize
	Dim sl As List
	sl.Initialize
	data.Put("a",sl)
	xAxes.Initialize
	xAxes.ticks.Initialize
	xAxes.gridLines.Initialize
	xAxes.display = True
	xAxes.ticks.autoSkip = Null
	xAxes.ticks.maxRotation = Null
	xAxes.ticks.minRotation = Null
	xAxes.ticks.MinValue = Null
	xAxes.ticks.MaxValue = Null
	xAxes.ticks.stepSize = Null
	xAxes.ticks.beginAtZero = Null
	'
	xAxes.gridLines.display = True
	xAxes.gridLines.circular = False
	xAxes.gridLines.lineWidth = 1
	xAxes.gridLines.drawBorder = True
	xAxes.gridLines.drawOnChartArea = True
	xAxes.gridLines.drawTicks = True
	xAxes.gridLines.tickMarkLength = 10
	xAxes.gridLines.zeroLineWidth = 1
	xAxes.gridLines.offsetGridLines = False
	'
	yAxes.Initialize
	yAxes.ticks.Initialize
	yAxes.gridLines.Initialize
	yAxes.display = True
	yAxes.ticks.autoSkip = Null
	yAxes.ticks.maxRotation = Null
	yAxes.ticks.minRotation = Null
	yAxes.ticks.MinValue = Null
	yAxes.ticks.MaxValue = Null
	yAxes.ticks.stepSize = Null
	yAxes.ticks.beginAtZero = Null
	yAxes.gridLines.display = True
	yAxes.gridLines.circular = False
	yAxes.gridLines.lineWidth = 1
	yAxes.gridLines.drawBorder = True
	yAxes.gridLines.drawOnChartArea = True
	yAxes.gridLines.drawTicks = True
	yAxes.gridLines.tickMarkLength = 10
	yAxes.gridLines.zeroLineWidth = 1
	yAxes.gridLines.offsetGridLines = False
	
End Sub

Sub SetTitle(txt As String) As VMChartKick
	Title.text = txt
	Return Me
End Sub

private Sub BuildOptions
	Dim chartOptions As Map = CreateMap()
	Dim scales As Map = CreateMap()
	'x axis
	Dim xList As List
	Dim xticks As Map = CreateMap()
	Dim xsis As Map = CreateMap()
	Dim xgrid As Map = CreateMap()
	'
	xList.Initialize
	If xAxes.ticks.autoSkip <> Null Then xticks.Put("autoSkip", xAxes.ticks.autoSkip) 
	If xAxes.ticks.maxRotation <> Null Then xticks.Put("maxRotation", xAxes.ticks.maxRotation) 
	If xAxes.ticks.minRotation <> Null Then xticks.Put("minRotation", xAxes.ticks.minRotation)
	If xAxes.ticks.MinValue <> Null Then xticks.Put("min", xAxes.ticks.MinValue)
	If xAxes.ticks.MaxValue <> Null Then xticks.Put("max", xAxes.ticks.MaxValue)
	If xAxes.ticks.stepSize <> Null Then xticks.Put("stepSize", xAxes.ticks.stepSize)
	If xAxes.ticks.beginAtZero <> Null Then xticks.Put("beginAtZero", xAxes.ticks.beginAtZero)
	'
	xgrid.Put("display", xAxes.gridLines.display)
	xgrid.Put("circular",xAxes.gridLines.circular)
	xgrid.Put("lineWidth",xAxes.gridLines.lineWidth)
	xgrid.Put("drawBorder",xAxes.gridLines.drawBorder)
	xgrid.Put("drawOnChartArea",xAxes.gridLines.drawOnChartArea)
	xgrid.Put("drawTicks",xAxes.gridLines.drawTicks)
	xgrid.Put("tickMarkLength",xAxes.gridLines.tickMarkLength)
	xgrid.Put("zeroLineWidth",xAxes.gridLines.zeroLineWidth)
	xgrid.Put("offsetGridLines",xAxes.gridLines.offsetGridLines)
	
	'
	xsis.Put("display", xAxes.display)
	If xticks.Size > 0 Then xsis.Put("ticks", xticks)
	If xgrid.Size > 0 Then xsis.Put("gridLines", xgrid)
	xList.Add(xsis)
	scales.Put("xAxes", xList)
	'y axes
	Dim yList As List
	Dim ysis As Map = CreateMap()
	Dim yticks As Map = CreateMap()
	Dim ygrid As Map = CreateMap()
	'
	yList.Initialize
	If yAxes.ticks.autoSkip <> Null Then yticks.Put("autoSkip", yAxes.ticks.autoSkip)
	If yAxes.ticks.maxRotation <> Null Then yticks.Put("maxRotation", yAxes.ticks.maxRotation)
	If yAxes.ticks.minRotation <> Null Then yticks.Put("minRotation", yAxes.ticks.minRotation)
	If yAxes.ticks.MinValue <> Null Then yticks.Put("min", yAxes.ticks.MinValue)
	If yAxes.ticks.MaxValue <> Null Then yticks.Put("max", yAxes.ticks.MaxValue)
	If yAxes.ticks.stepSize <> Null Then yticks.Put("stepSize", yAxes.ticks.stepSize)
	If yAxes.ticks.beginAtZero <> Null Then yticks.Put("beginAtZero", yAxes.ticks.beginAtZero)
	'
	ygrid.Put("display", yAxes.gridLines.display)
	ygrid.Put("circular",yAxes.gridLines.circular)
	ygrid.Put("lineWidth",yAxes.gridLines.lineWidth)
	ygrid.Put("drawBorder",yAxes.gridLines.drawBorder)
	ygrid.Put("drawOnChartArea",yAxes.gridLines.drawOnChartArea)
	ygrid.Put("drawTicks",yAxes.gridLines.drawTicks)
	ygrid.Put("tickMarkLength",yAxes.gridLines.tickMarkLength)
	ygrid.Put("zeroLineWidth",yAxes.gridLines.zeroLineWidth)
	ygrid.Put("offsetGridLines",yAxes.gridLines.offsetGridLines)
	'	
	ysis.Put("display", yAxes.display)
	If yticks.Size > 0 Then ysis.Put("ticks", yticks)
	If ygrid.Size > 0 Then ysis.Put("gridLines", ygrid)
	yList.Add(ysis)
	scales.Put("yAxes", yList)
	'
	If OverwriteOptions = True Then chartOptions.Put("scales", scales)
	'
	Dim titObj As Map = CreateMap()
	titObj.Put("display", Title.display)
	titObj.Put("text", Title.text)
	chartOptions.Put("title", titObj)
	'
	If colors.Size > 0 Then chartOptions.Put("colors", colors)
	vue.SetStateSingle(coptions, chartOptions)
End Sub

'add a new series, the list will store the data
Sub AddSeries(seriesCaption As String, seriesColor As String, seriesCurve As Boolean, seriesData As Map) As VMChartKick
	Dim obj As Map = CreateMap()
	obj.Put("name", seriesCaption)
	obj.Put("data", seriesData)
	obj.Put("curve", seriesCurve)
	obj.Put("label", seriesCaption)
	If seriesColor <> "" Then
		Dim xColor As String = vue.GetColorHex(seriesColor)
		obj.Put("color", xColor)
	End If
	series.Put(seriesCaption, obj)
	Return Me
End Sub

'add xy values to a chart
Sub AddXY(X As String, y As String) As VMChartKick
	'get the list of records
	Dim exdata As List = data.Get("a")
	Dim cudata As List
	cudata.Initialize
	cudata.Add(X)
	cudata.Add(y)
	exdata.Add(cudata)
	data.Put("a",exdata)
	Return Me
End Sub

'add xy with a color
Sub AddXYColor(X As String, y As String, color As String) As VMChartKick
	'get the list of records
	Dim exdata As List = data.Get("a")
	Dim cudata As List
	cudata.Initialize
	cudata.Add(X)
	cudata.Add(y)
	exdata.Add(cudata)
	data.Put("a",exdata)
	If color <> "" Then
		Dim xColor As String = vue.GetColorHex(color)
		colors.Add(xColor)
	End If
	Return Me
End Sub

Sub SetDifferentColors(seriesCurve As Boolean) As VMChartKick
	series.Initialize 
	Dim exdata As List = data.Get("a")
	Dim colCnt As Int = 0
	For Each cudata As List In exdata
		If cudata.Size = 2 Then
			Dim c As String = ""
			Dim x As String = cudata.get(0)
			Dim y As String = cudata.get(1)
			If colors.size > 0 Then
				c = colors.get(colCnt)
			End If
			Dim xd As Map = CreateMap()
			xd.put(x, y)
			AddSeries(x, c, seriesCurve, xd)
		End If
		colCnt = colCnt + 1
	Next
	colors.initialize
	Return Me
End Sub

'add xy map
Sub AddXYMap(values As Map) As VMChartKick
	For Each strKey As String In values.Keys
		Dim strVal As String = values.Get(strKey)
		AddXY(strKey,strVal)
	Next
	Return Me
End Sub

'add a bubble
Sub AddBubble(X As String, y As String, size As String) As VMChartKick
	'get the list of records
	Dim exdata As List = data.Get("a")
	Dim cudata As List
	cudata.Initialize
	cudata.Add(X)
	cudata.Add(y)
	cudata.Add(size)
	exdata.Add(cudata)
	data.Put("a",exdata)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMChartKick
	ChartKick.SetStyle(sm)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, vals As String) As VMChartKick
	Dim stylex As Map = CreateMap()
	stylex.Put(prop, vals)
	SetStyle(stylex)
	Return Me
End Sub

Sub SetHeightStyle(h As String) As VMChartKick
	SetStyleSingle("height", h)
	Return Me
End Sub

Sub SetWidthStyle(w As String) As VMChartKick
	SetStyleSingle("width", w)
	Return Me
End Sub

private Sub SetData(chartData As String) As VMChartKick
	SetAttrSingle(":data", chartData)
	Return Me
End Sub

Sub SetMax(maxvalue As Int) As VMChartKick
	SetAttrSingle(":max", maxvalue)
	Return Me
End Sub

Sub SetMin(minvalue As Int) As VMChartKick
	SetAttrSingle(":min", minvalue)
	Return Me
End Sub

Sub SetXMax(maxvalue As Int) As VMChartKick
	SetAttrSingle("xmax", maxvalue)
	Return Me
End Sub

Sub SetXMin(minvalue As Int) As VMChartKick
	SetAttrSingle("xmin", minvalue)
	Return Me
End Sub

Sub SetLabel(seriesLabel As Int) As VMChartKick
	SetAttrSingle("label", seriesLabel)
	Return Me
End Sub

private Sub SetColors(lcolors As String) As VMChartKick
	SetAttrSingle(":colors", lcolors)
	Return Me
End Sub

Sub SetStacked As VMChartKick
	SetAttrSingle("stacked", "true")
	Return Me
End Sub

Sub SetDescrete As VMChartKick
	SetAttrSingle(":discrete", "true")
	Return Me
End Sub

Sub SetCurve As VMChartKick
	SetAttrSingle(":curve", "true")
	Return Me
End Sub

Sub SetLegendPositionBottom As VMChartKick
	SetAttrSingle("legend", "bottom")
	Return Me
End Sub

Sub SetLegendPositionTop As VMChartKick
	SetAttrSingle("legend", "top")
	Return Me
End Sub

Sub SetLegendPositionRight As VMChartKick
	SetAttrSingle("legend", "right")
	Return Me
End Sub

Sub SetDonut As VMChartKick
	SetAttrSingle(":donut","true")
	xAxes.display = False
	yAxes.display = False
	Return Me
End Sub

Sub SetPrefix(prefix As String) As VMChartKick
	SetAttrSingle("prefix", prefix)
	Return Me
End Sub

Sub SetThousands(sthousands As String) As VMChartKick
	SetAttrSingle("thousands", sthousands)
	Return Me
End Sub

Sub SetDecimal(sdecimal As String) As VMChartKick
	SetAttrSingle("decimal", sdecimal)
	Return Me
End Sub

Sub SetPrecision(sprecision As String) As VMChartKick
	SetAttrSingle(":precision", sprecision)
	Return Me
End Sub

Sub SetRound(sround As String) As VMChartKick
	SetAttrSingle(":round",sround)
	Return Me
End Sub

Sub SetZeros As VMChartKick
	SetAttrSingle(":zeros", "true")
	Return Me
End Sub

Sub SetBytes As VMChartKick
	SetAttrSingle(":bytes", "true")
	Return Me
End Sub

Sub SetRefresh(irefresh As Int) As VMChartKick
	SetAttrSingle(":refresh", irefresh)
	Return Me
End Sub

Sub SetDownload As VMChartKick
	Dim obj As Map = CreateMap()
	obj.Put("background", "#fff")
	Dim objJSON As String = BANano.ToJson(obj)
	objJSON = objJSON.Replace(QUOTE,"'")
	SetAttrSingle(":download", objJSON)
	Return Me
End Sub

Sub SetSuffix(suffix As String) As VMChartKick
	SetAttrSingle("suffix", suffix)
	Return Me
End Sub

Sub SetWidth(w As String) As VMChartKick
	SetAttrSingle("width", vue.makepx(w))
	Return Me
End Sub

Sub SetHeight(h As String) As VMChartKick
	SetAttrSingle("height", vue.MakePx(h))
	Return Me
End Sub

Sub SetXTitle(xtitle As String) As VMChartKick
	SetAttrSingle("xtitle", xtitle)
	Return Me
End Sub

Sub SetYTitle(ytitle As String) As VMChartKick
	SetAttrSingle("ytitle", ytitle)
	Return Me
End Sub

'lets define a line chart
Sub SetLineChart As VMChartKick
	ChartKick.SetTag("line-chart")
	Return Me
End Sub

Sub SetPieChart As VMChartKick
	ChartKick.settag("pie-chart")
	xAxes.display = False
	yAxes.display = False
	Return Me
End Sub

Sub SetBarChart As VMChartKick
	ChartKick.SetTag("bar-chart")
	Return Me
End Sub

Sub SetColumnChart As VMChartKick
	ChartKick.SetTag("column-chart")
	Return Me
End Sub

Sub SetAreaChart As VMChartKick
	ChartKick.SetTag("area-chart")
	Return Me
End Sub

Sub SetScatterChart As VMChartKick
	ChartKick.SetTag("scatter-chart")
	Return Me
End Sub

Sub SetVShow(vshow As String) As VMChartKick
	ChartKick.SetVShow(vshow)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMChartKick
	ChartKick.SetDisabled(b)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMChartKick
	ChartKick.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMChartKick
	ChartKick.SetAttr(attr)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, vals As Object) As VMChartKick
	Dim attr As Map = CreateMap()
	attr.Put(prop, vals)
	SetAttr(attr)
	Return Me
End Sub

Sub ToString As String
	
	BuildOptions
	If series.Size > 0 Then
		Dim seriesList As List
		seriesList.Initialize 
		Dim seriesKey As String = $"${ID}data"$
		For Each k As String In series.Keys
			Dim obj As Map = series.Get(k)
			seriesList.Add(obj)
		Next
		vue.SetStateSingle(seriesKey, seriesList)
		SetData(seriesKey)
	Else
		Dim plotList As List = data.Get("a")
		Dim seriesKey As String = $"${ID}data"$
		vue.SetStateSingle(seriesKey, plotList)
		SetData(seriesKey)
	End If
	If colors.Size > 0 Then
		Dim colorKey As String = $"${ID}color"$
		vue.SetStateSingle(colorKey, colors)
		SetColors(colorKey)
	End If
	Return ChartKick.tostring
End Sub

Sub Refresh
	If series.Size > 0 Then
		Dim seriesList As List
		seriesList.Initialize
		Dim seriesKey As String = $"${ID}data"$
		For Each k As String In series.Keys
			Dim obj As Map = series.Get(k)
			seriesList.Add(obj)
		Next
		vue.SetStateSingle(seriesKey, seriesList)
		SetData(seriesKey)
	Else
		Dim plotList As List = data.Get("a")
		Dim seriesKey As String = $"${ID}data"$
		vue.SetStateSingle(seriesKey, plotList)
		SetData(seriesKey)
	End If
	If colors.Size > 0 Then
		Dim colorKey As String = $"${ID}color"$
		vue.SetStateSingle(colorKey, colors)
		SetColors(colorKey)
	End If
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMChartKick
ChartKick.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMChartKick
ChartKick.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMChartKick
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMChartKick
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub