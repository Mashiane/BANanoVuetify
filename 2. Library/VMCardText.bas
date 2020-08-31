B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public CardText As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
	Public HasContent As Boolean
End Sub

'initialize the CardText
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCardText
	ID = sid.tolowercase
	CardText.Initialize(v, ID)
	CardText.SetTag("v-card-text")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	HasContent = False
	Return Me
End Sub

Sub AddElement(elID As String, elTag As String, elText As String, mprops As Map, mstyles As Map, lclasses As List) As VMCardText
	Dim d As VMElement
	d.Initialize(vue,elID).SetDesignMode(DesignMode).SetTag(elTag)
	d.SetText(elText)
	d.BuildModel(mprops, mstyles, lclasses, Null)
	SetText(d.ToString)
	HasContent = True
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMCardText
	bStatic = b
	CardText.SetStatic(b)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMCardText
	CardText.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCardText
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub AddContent(scontent As String) As VMCardText
	If scontent = "" Then Return Me
	SetText(scontent)
	HasContent = True
	Return Me
End Sub

Sub AddSpacer As VMCardText
	CardText.AddSpacer
	HasContent = True
	Return Me
End Sub

Sub AddDivider As VMCardText
	CardText.AddDivider
	HasContent = True
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCardText
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'set color intensity
Sub SetColor(varColor As String) As VMCardText
	If varColor = "" Then Return Me
	AddClass(varColor)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCardText
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	AddClass(scolor)
	Return Me
End Sub


'get component
Sub ToString As String
	
	Return CardText.ToString
End Sub

Sub SetVModel(k As String) As VMCardText
	CardText.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMCardText
	CardText.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMCardText
	CardText.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCardText
	Dim childHTML As String = child.ToString
	CardText.SetText(childHTML)
	HasContent = True
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMCardText
	If t = "" Then Return Me
	CardText.SetText(t)
	HasContent = True
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCardText
	CardText.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCardText
	CardText.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCardText
	CardText.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub


Sub Hide As VMCardText
	CardText.SetVisible(False)
	Return Me
End Sub

Sub Show As VMCardText
	CardText.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMCardText
	CardText.Enable(True)
	Return Me
End Sub

Sub Disable As VMCardText
	CardText.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCardText
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMCardText
	CardText.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCardText
	CardText.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMCardText
	CardText.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMCardText
	CardText.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMCardText
	CardText.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCardText
	CardText.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMCardText
	CardText.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMCardText
	CardText.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCardText
CardText.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMCardText
CardText.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMCardText
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColorIntensity(textcolor As String, textintensity As String) As VMCardText
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Dim sIntensity As String = $"text--${textintensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub