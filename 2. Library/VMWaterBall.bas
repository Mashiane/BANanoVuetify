B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public WaterBall As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Public isLoading As Boolean
	Private vnowRange As Int ' the value now
	Private vtargetRange As Int ' the target value to be achieved
	Private range1 As Int
	Private range2 As Int
	Private range3 As Int
	Private wWidth As Double
	Private wHeight As Int
	Private JQ As BANanoObject
	Private module As Object
End Sub

'add three ranges to mark to change colors between red, orange, green
Sub SetRanges(red As Int, orange As Int, green As Int)
	range1 = red
	range2 = orange
	range3 = green
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMWaterBall
	WaterBall.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMWaterBall
	WaterBall.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMWaterBall
	WaterBall.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMWaterBall
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMWaterBall
	WaterBall.RemoveAttr(sName)
	Return Me
End Sub

'set the values now
Sub SetValues(nowRange As Int, targetRange As Int)
	vnowRange = nowRange
	vtargetRange = targetRange
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object, Width As String, Height As String) As VMWaterBall
	BANano.DependsOnAsset("jquery-3.4.1.min.js")
	BANano.DependsOnAsset("createWaterBall-jquery.js")
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	JQ = vue.jquery
	WaterBall.Initialize(vue, ID).SetTag("div")
	range1 = 50
	range2 = 80
	range3 = 100
	wWidth = 0.02
	wHeight = 5
	WaterBall.AddClass(ID)
	Width = WaterBall.MakePx(Width)
	Height = WaterBall.MakePx(Height)
	WaterBall.SetWidth(Width).SetHeight(Height)
	isLoading = False
	Return Me
End Sub


Sub SetDesignMode(b As Boolean) As VMWaterBall
	WaterBall.SetDesignMode(b)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMWaterBall
	WaterBall.SetDisabled(b)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMWaterBall
	If ti = "" Then Return Me
	WaterBall.SetTabIndex(ti)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMWaterBall
	WaterBall.SetStyle(sm)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMWaterBall
	WaterBall.SetVIf(vif)
	Return Me
End Sub

Sub SetID(iID As String, bind As Boolean) As VMWaterBall
	WaterBall.SetID(iID,bind)
	Return Me
End Sub

Sub SetName(nam As String, bind As Boolean) As VMWaterBall
	WaterBall.SetName(nam, bind)
	Return Me
End Sub

Sub SetKey(k As String, bind As Boolean) As VMWaterBall
	WaterBall.SetKey(k, bind)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMWaterBall
	WaterBall.SetVShow(vif)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMWaterBall
	WaterBall.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMWaterBall
	WaterBall.SetAttr(attr)
	Return Me
End Sub


Sub ToString As String
	
	Return WaterBall.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(px As VMElement)
	px.SetText(ToString)
End Sub

'refresh the waterball
Sub Refresh
	'select the element by class
	Dim options As Map = CreateMap()
	Dim loadingEle As BANanoObject = JQ.Selector($"#${ID}"$)
	Dim loading_width As Int = loadingEle.RunMethod("width",Null).Result
	Dim loading_height As Int = loadingEle.RunMethod("height",Null).Result
	Dim data_range As List
	data_range.Initialize
	data_range.Add(range1)
	data_range.Add(range2)
	data_range.Add(range3)
	'
	Dim cvs_config As Map = CreateMap()
	cvs_config.Put("width", loading_width)
	cvs_config.Put("height", loading_height)
	'
	Dim wave_config As Map = CreateMap()
	wave_config.Put("waveWidth", wWidth)
	wave_config.Put("waveHeight", wHeight)
	'
	options.Put("cvs_config", cvs_config)
	options.Put("wave_config", wave_config)
	options.Put("data_range", data_range)
	options.Put("isLoading", isLoading)
	options.Put("nowRange", vnowRange)
	options.Put("targetRange", vtargetRange)
	options.Put("lineWidth", 2)
	'
	loadingEle.RunMethod("createWaterBall", options)
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

