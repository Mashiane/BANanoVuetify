B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItemTitle As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean    'ignore
	Private Module As Object    'ignore
	Private bStatic As Boolean   'ignore
End Sub

'initialize the ListItemTitle
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItemTitle
	ID = sid.tolowercase
	ListItemTitle.Initialize(v, ID)
	ListItemTitle.SetTag("v-list-item-title")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	ListItemTitle.SetText(elm.ToString)
End Sub

Sub SetStatic(b As Boolean) As VMListItemTitle
	bStatic = b
	ListItemTitle.SetStatic(b)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMListItemTitle
	ListItemTitle.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMListItemTitle
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetAttributes(attrs As List) As VMListItemTitle
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	Return ListItemTitle.ToString
End Sub

Sub SetVModel(k As String) As VMListItemTitle
	ListItemTitle.SetVModel(k)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMListItemTitle
	ListItemTitle.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMListItemTitle
	ListItemTitle.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMListItemTitle
	ListItemTitle.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMListItemTitle
	ListItemTitle.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMListItemTitle
	Dim childHTML As String = child.ToString
	ListItemTitle.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMListItemTitle
	ListItemTitle.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMListItemTitle
	ListItemTitle.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItemTitle
	ListItemTitle.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMListItemTitle
	ListItemTitle.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMListItemTitle
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMListItemTitle
	ListItemTitle.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMListItemTitle
	ListItemTitle.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMListItemTitle
	ListItemTitle.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMListItemTitle
	ListItemTitle.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMListItemTitle
	ListItemTitle.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMListItemTitle
	ListItemTitle.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMListItemTitle
	ListItemTitle.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMListItemTitle
	ListItemTitle.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMListItemTitle
	ListItemTitle.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMListItemTitle
	ListItemTitle.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMListItemTitle
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMListItemTitle
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub