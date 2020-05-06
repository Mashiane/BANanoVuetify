B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Template As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public HasContent As Boolean
	Private bStatic As Boolean
End Sub

'initialize the Template
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTemplate
	ID = sid.tolowercase
	Template.Initialize(v, ID)
	Template.SetTag("template")
	DesignMode = False
	Module = eventHandler
	vue = v
	HasContent = False
	bStatic = False
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMTemplate
	bStatic = b
	Template.SetStatic(b)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMTemplate
	Template.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMTemplate
	Template.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMTemplate
	Template.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMTemplate
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMTemplate
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub AddComponent(scomp As String) As VMTemplate
	SetText(scomp)
	Return Me
End Sub

Sub SetSlotAppend As VMTemplate
	Template.SetAttrLoose("v-slot:append")
	Return Me
End Sub

Sub SetSlotProgress As VMTemplate
	Template.SetAttrLoose("v-slot:progress")
	Return Me
End Sub

Sub SetSlotExtension As VMTemplate
	Template.SetAttrLoose("v-slot:extension")
	Return Me
End Sub

Sub SetSlotActions As VMTemplate
	SetAttrLoose("v-slot:actions")
	Return Me
End Sub

Sub SetSlotActivator As VMTemplate
	SetAttrLoose("v-slot:activator")
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMTemplate
	Template.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetSlotActivatorOn As VMTemplate
	SetAttrSingle("v-slot:activator", "{ on }")
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMTemplate
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMTemplate
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Template.Bind(":color", pp)
	Return Me
End Sub

'get component
Sub ToString As String
	Return Template.ToString
End Sub

Sub SetVModel(k As String) As VMTemplate
	Template.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTemplate
	Template.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTemplate
	Template.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTemplate
	Dim childHTML As String = child.ToString
	Template.SetText(childHTML)
	HasContent = True
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMTemplate
	HasContent = True
	Template.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTemplate
	Template.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTemplate
	Template.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTemplate
	Template.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub


Sub Hide As VMTemplate
	Template.SetVisible(False)
	Return Me
End Sub

Sub Show As VMTemplate
	Template.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMTemplate
	Template.Enable(True)
	Return Me
End Sub

Sub Disable As VMTemplate
	Template.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMTemplate
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMTemplate
	Template.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMTemplate
	Template.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMTemplate
	Template.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMTemplate
	Template.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMTemplate
	Template.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMTemplate
	Template.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMTemplate
	Template.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMTemplate
	Template.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMTemplate
	Template.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMTemplate
	Template.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMTemplate
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMTemplate
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub