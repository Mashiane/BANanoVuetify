B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public CardSubTitle As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
	Public HasContent As Boolean
End Sub

'initialize the CardSubTitle
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCardSubTitle
	ID = sid.tolowercase
	CardSubTitle.Initialize(v, ID)
	CardSubTitle.SetTag("v-card-subtitle")
	DesignMode = False
	Module = eventHandler
	vue = v
	HasContent = False
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	CardSubTitle.SetText(elm.ToString)
End Sub


Sub SetData(prop As String, value As Object) As VMCardSubTitle
	vue.SetData(prop, value)
	Return Me
End Sub


Sub AddElement1(elID As String, elTag As String, elText As String, mprops As Map, mstyles As Map, lclasses As List) As VMCardSubTitle
	Dim d As VMElement
	d.Initialize(vue,elID).SetDesignMode(DesignMode).SetTag(elTag)
	d.SetText(elText)
	d.BuildModel(mprops, mstyles, lclasses, Null)
	SetText(d.ToString)
	HasContent = True
	Return Me
End Sub

Sub Clear
	CardSubTitle.Clear
End Sub


Sub SetStatic(b As Boolean) As VMCardSubTitle
	bStatic = b
	CardSubTitle.SetStatic(b)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMCardSubTitle
	CardSubTitle.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCardSubTitle
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub


'apply a theme to an element
Sub UseTheme(themeName As String) As VMCardSubTitle
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


Sub AddSpacer As VMCardSubTitle
	CardSubTitle.AddSpacer
	HasContent = True
	Return Me
End Sub

'get component
Sub ToString As String	
	Return CardSubTitle.ToString
End Sub

Sub SetVModel(k As String) As VMCardSubTitle
	CardSubTitle.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMCardSubTitle
	CardSubTitle.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMCardSubTitle
	CardSubTitle.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCardSubTitle
	Dim childHTML As String = child.ToString
	CardSubTitle.SetText(childHTML)
	HasContent = True
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMCardSubTitle
	If t = "" Then Return Me
	CardSubTitle.SetText(t)
	HasContent = True
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCardSubTitle
	CardSubTitle.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCardSubTitle
	CardSubTitle.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCardSubTitle
	CardSubTitle.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub


Sub Hide As VMCardSubTitle
	CardSubTitle.SetVisible(False)
	Return Me
End Sub

Sub Show As VMCardSubTitle
	CardSubTitle.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMCardSubTitle
	CardSubTitle.Enable(True)
	Return Me
End Sub

Sub Disable As VMCardSubTitle
	CardSubTitle.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCardSubTitle
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMCardSubTitle
	CardSubTitle.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCardSubTitle
	CardSubTitle.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMCardSubTitle
	CardSubTitle.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMCardSubTitle
	CardSubTitle.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMCardSubTitle
	CardSubTitle.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCardSubTitle
	CardSubTitle.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMCardSubTitle
	CardSubTitle.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMCardSubTitle
	CardSubTitle.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCardSubTitle
CardSubTitle.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMCardSubTitle
CardSubTitle.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMCardSubTitle
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub


'set color intensity - built in
Sub SetTextColorIntensity(textcolor As String, textintensity As String) As VMCardSubTitle
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Dim sIntensity As String = $"text--${textintensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMCardSubTitle
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	CardSubTitle.Bind(":color", pp)
	Return Me
End Sub