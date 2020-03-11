B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Knob As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMKnob
	BANano.DependsOnAsset("jquery.knob.min.js")
	BANano.DependsOnAsset("tron-knob.js")
	
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	Knob.Initialize(vue, ID).SetTag("input").AddClass("knob").SetType("text")
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMKnob
	Knob.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMKnob
	Knob.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMKnob
	Knob.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMKnob
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMKnob
	Knob.RemoveAttr(sName)
	Return Me
End Sub


Sub SetDesignMode(b As Boolean) As VMKnob
	Knob.SetDesignMode(b)
	Return Me
End Sub

Sub SetName(name As String, bind As Boolean) As VMKnob
	Knob.SetName(name, bind)
	Return Me
End Sub

Sub SetVModel(vmodel As String) As VMKnob
	Knob.SetVModel(vmodel)
	Knob.SetValue(vmodel, True)
	Return Me
End Sub

Sub SetMin(minvalue As String) As VMKnob
	Knob.SetAttr(CreateMap("data-min": minvalue))
	Return Me
End Sub

'step value, default 1
Sub SetStep(stepvalue As String) As VMKnob
	Knob.SetAttr(CreateMap("data-step": stepvalue))
	Return Me
End Sub

'angleOffset : starting angle in degrees | default=0.
Sub SetAngleOffset(stepvalue As String) As VMKnob
	Knob.SetAttr(CreateMap("data-angleOffset": stepvalue))
	Return Me
End Sub

' angleArc : arc size in degrees | default=360.
Sub SetAngleArc(stepvalue As String) As VMKnob
	Knob.SetAttr(CreateMap("data-angleArc": stepvalue))
	Return Me
End Sub

'stopper : stop at min & max on keydown/mousewheel | default=true.
Sub SetStopper(stepvalue As String) As VMKnob
	Knob.SetAttr(CreateMap("data-stopper": stepvalue))
	Return Me
End Sub

'readOnly : disable input and events | default=false.
Sub SetReadOnly(stepvalue As Boolean) As VMKnob
	Knob.SetAttr(CreateMap("data-readOnly": stepvalue))
	Return Me
End Sub

'rotation : direction of progression | default=clockwise.
Sub SetRotation(stepvalue As String) As VMKnob
	Knob.SetAttr(CreateMap("data-rotation": stepvalue))
	Return Me
End Sub

'fgColor
Sub SetFgColor(stepvalue As String) As VMKnob
	Knob.SetAttr(CreateMap("data-fgColor": stepvalue))
	Return Me
End Sub

'skin
Sub SetSkin(skin As String) As VMKnob
	Knob.SetAttr(CreateMap("data-skin": skin))
	Return Me
End Sub

'thickness
Sub SetThickness(thickness As Double) As VMKnob
	Knob.SetAttr(CreateMap("data-thickness": thickness))
	Return Me
End Sub

'rounded corners
Sub SetRoundedCorners(b As Boolean) As VMKnob
	If b = False Then Return Me
	Knob.SetAttr(CreateMap("data-linecap":"round"))
	Return Me
End Sub

'width
Sub SetWidth(skin As String) As VMKnob
	Knob.SetAttr(CreateMap("data-width": skin))
	Return Me
End Sub

'height
Sub SetHeight(skin As String) As VMKnob
	Knob.SetAttr(CreateMap("data-height": skin))
	Return Me
End Sub


Sub SetMax(minvalue As String) As VMKnob
	Knob.SetAttr(CreateMap("data-max": minvalue))
	Return Me
End Sub

Sub ToString As String
	
	Return Knob.tostring
End Sub

'set style
Sub SetStyle(sm As Map) As VMKnob
	Knob.SetStyle(sm)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMKnob
	Knob.SetVIf(vif)
	Return Me
End Sub

Sub SetKey(k As String, bind As Boolean) As VMKnob
	Knob.SetKey(k, bind)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMKnob
	Knob.SetVShow(vif)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMKnob
	Knob.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMKnob
	Knob.SetAttr(attr)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMKnob
	Knob.SetDisabled(b)
	Return Me
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

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMKnob
Knob.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub