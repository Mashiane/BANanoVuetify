B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CircleChoice As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private Module As Object  'ignore
	Private boCircleChoice As BANanoObject
	Private DesignMode As Boolean
	Private bStatic As Boolean
	Private mcolors As List
End Sub

'initialize the CircleChoice
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCircleChoice
	BANano.DependsOnAsset("choice-color.js")
	bStatic = False
	DesignMode = False	
	ID = sid.tolowercase
	CircleChoice.Initialize(v, ID).SetTag("choice-color")
	Module = eventHandler
	vue = v
	'
	If vue.ModuleExist("choiceColor") = False Then
		vue.AddModule("choiceColor")
		boCircleChoice.Initialize("choiceColor")
		vue.AddComponentBO("choice-color", boCircleChoice)
	End If
	'define the colors
	mcolors.initialize
	mcolors.add("#f44336")
	mcolors.add("#e91e63")
	mcolors.add("#9c27b0")
	mcolors.add("#3f51b5")
	mcolors.add("#2196f3")
	mcolors.add("#03a9f4")
	mcolors.add("#00bcd4")
	mcolors.add("#009688")
	mcolors.add("#4caf50")
	mcolors.add("#8bc34a")
	mcolors.add("#cddc39")
	mcolors.add("#ffeb3b")
	mcolors.add("#ffc107")
	mcolors.add("#ff9800")
	mcolors.add("#ff5722")
	mcolors.add("#795548")
	mcolors.add("#9e9e9e")
	mcolors.add("#607d8b")
	mcolors.add("#000000")
	mcolors.add("#ffffff")
	mcolors.add("transparent")
	Return Me
End Sub

Sub SetColors(colors As List) As VMCircleChoice
	Dim scolors As String = $"${ID}colors"$
	If bStatic Then
		SetAttr(CreateMap("colors": colors))
		Return Me
	End If
	Bind(":colors", scolors)
	vue.setdata(scolors, colors)
	Return Me
End Sub

Sub SetRadius(radius As String) As VMCircleChoice
	If radius = "" Then Return Me
	Dim sradius As String = $"${ID}radius"$
	If bStatic Then
		SetAttrSingle("radius", radius)
		Return Me
	End If
	Bind(":radius", sradius)
	vue.setdata(sradius, radius)
	Return Me
End Sub


Sub SetOnUpateColor(methodName As String) As VMCircleChoice
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim index As Object
	Dim color As Object
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(index, color))
	SetAttr(CreateMap("@updateColor": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'set design mode
Sub SetDesignMode(b As Boolean) As VMCircleChoice
	CircleChoice.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMCircleChoice
	CircleChoice.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'set text - built-in
Sub SetText(t As String) As VMCircleChoice
	CircleChoice.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCircleChoice
	CircleChoice.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCircleChoice
	CircleChoice.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCircleChoice
	CircleChoice.SetStyle(sm)
	Return Me
End Sub


'get component
Sub ToString As String
	SetColors(mcolors)
	Return CircleChoice.ToString
End Sub

'hide the component
Sub Hide As VMCircleChoice
	CircleChoice.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMCircleChoice
	CircleChoice.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMCircleChoice
	CircleChoice.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMCircleChoice
	CircleChoice.Disable(True)
	Return Me
End Sub


'bind a propeCircleChoicey to state
Sub Bind(prop As String, stateprop As String) As VMCircleChoice
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMCircleChoice
	CircleChoice.SetAttrLoose(loose)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMCircleChoice
	CircleChoice.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCircleChoice
	CircleChoice.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMCircleChoice
	CircleChoice.setmarginall(p)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMCircleChoice
	CircleChoice.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMCircleChoice
	CircleChoice.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMCircleChoice
	CircleChoice.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCircleChoice
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMCircleChoice
	CircleChoice.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMCircleChoice
	CircleChoice.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMCircleChoice
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMCircleChoice
	CircleChoice.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMCircleChoice
	CircleChoice.SetText(comp)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCircleChoice
	CircleChoice.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMCircleChoice
	CircleChoice.SetVisible(b)
	Return Me
End Sub