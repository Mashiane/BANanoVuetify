B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ProgressCircle As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private JQ As BANanoObject
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, Width As String, Height As String) As VMProgressCircle
	BANano.DependsOnAsset("progresscircle.css")
	BANano.DependsOnAsset("progresscircle.js")
	
	ID = sid.ToLowerCase
	vue = v
	JQ = vue.jquery
	ProgressCircle.Initialize(vue, ID).SetTag("div")
	ProgressCircle.AddClass(ID)
	Width = ProgressCircle.MakePx(Width)
	Height = ProgressCircle.MakePx(Height)
	ProgressCircle.SetWidth(Width).SetHeight(Height)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMProgressCircle
	ProgressCircle.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMProgressCircle
	ProgressCircle.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMProgressCircle
	ProgressCircle.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMProgressCircle
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMProgressCircle
	ProgressCircle.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMProgressCircle
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMProgressCircle
	ProgressCircle.SetDesignMode(b)
	Return Me
End Sub



public Sub RemoveAttr(sName As String) As VMProgressCircle
	ProgressCircle.RemoveAttr(sName)
	Return Me
End Sub


Sub SetDisabled(b As Boolean) As VMProgressCircle
	ProgressCircle.SetDisabled(b)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMProgressCircle
	If ti = "" Then Return Me
	ProgressCircle.SetTabIndex(ti)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMProgressCircle
	ProgressCircle.SetStyle(sm)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMProgressCircle
	ProgressCircle.SetVIf(vif)
	Return Me
End Sub

Sub SetID(iID As String, bind As Boolean) As VMProgressCircle
	ProgressCircle.SetID(iID,bind)
	Return Me
End Sub

Sub SetName(nam As String, bind As Boolean) As VMProgressCircle
	ProgressCircle.SetName(nam, bind)
	Return Me
End Sub

Sub SetKey(k As String, bind As Boolean) As VMProgressCircle
	ProgressCircle.SetKey(k, bind)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMProgressCircle
	ProgressCircle.SetVShow(vif)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMProgressCircle
	ProgressCircle.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMProgressCircle
	ProgressCircle.SetAttr(attr)
	Return Me
End Sub


Sub ToString As String
	
	Return ProgressCircle.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(px As VMElement)
	px.SetText(ToString)
End Sub

Sub SetValue(vl As Int) As VMProgressCircle
	ProgressCircle.SetAttr(CreateMap("data-percentage":vl))
	Return Me
End Sub

Sub SetLabel(lbl As String) As VMProgressCircle
	ProgressCircle.SetText(lbl)
	Return Me
End Sub

'refresh the ProgressCircle
Sub Refresh
	'select the element by class
	Dim loadingEle As BANanoObject = JQ.Selector($"#${ID}"$)
	loadingEle.RunMethod("circlechart", Null)
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub
