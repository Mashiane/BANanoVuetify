B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public ToolbarTitle As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the ToolbarTitle
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMToolbarTitle
	ID = sid.tolowercase
	ToolbarTitle.Initialize(v, ID)
	ToolbarTitle.SetTag("v-toolbar-title")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

Sub SetData(prop As String, value As Object) As VMToolbarTitle
	vue.SetData(prop, value)
	Return Me
End Sub


Sub AddElement(elID As String, elTag As String, elText As String, mprops As Map, mstyles As Map, lclasses As List) As VMToolbarTitle
	Dim d As VMElement
	d.Initialize(vue,elID).SetDesignMode(DesignMode).SetTag(elTag)
	d.SetText(elText)
	d.BuildModel(mprops, mstyles, lclasses, Null)
	SetText(d.ToString)
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMToolbarTitle
	bStatic = b
	ToolbarTitle.SetStatic(b)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMToolbarTitle
	ToolbarTitle.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMToolbarTitle
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub


'apply a theme to an element
Sub UseTheme(themeName As String) As VMToolbarTitle
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'get component
Sub ToString As String
	Return ToolbarTitle.ToString
End Sub

Sub SetVIf(vif As String) As VMToolbarTitle
	ToolbarTitle.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMToolbarTitle
	ToolbarTitle.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'set text
Sub SetText(t As String) As VMToolbarTitle
	If t = "" Then Return Me
	ToolbarTitle.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMToolbarTitle
	ToolbarTitle.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMToolbarTitle
	ToolbarTitle.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMToolbarTitle
	ToolbarTitle.SetStyle(sm)
	Return Me
End Sub

Sub Hide As VMToolbarTitle
	ToolbarTitle.SetVisible(False)
	Return Me
End Sub

Sub Show As VMToolbarTitle
	ToolbarTitle.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMToolbarTitle
	ToolbarTitle.Enable(True)
	Return Me
End Sub

Sub Disable As VMToolbarTitle
	ToolbarTitle.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMToolbarTitle
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMToolbarTitle
	ToolbarTitle.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMToolbarTitle
	ToolbarTitle.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMToolbarTitle
	ToolbarTitle.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMToolbarTitle
	ToolbarTitle.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMToolbarTitle
	ToolbarTitle.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMToolbarTitle
	ToolbarTitle.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMToolbarTitle
	ToolbarTitle.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMToolbarTitle
	ToolbarTitle.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMToolbarTitle
	ToolbarTitle.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMToolbarTitle
	ToolbarTitle.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMToolbarTitle
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub


'set color intensity - built in
Sub SetTextColorIntensity(textcolor As String, textintensity As String) As VMToolbarTitle
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Dim sIntensity As String = $"text--${textintensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMToolbarTitle
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	ToolbarTitle.Bind(":color", pp)
	Return Me
End Sub