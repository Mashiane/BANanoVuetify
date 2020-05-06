B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItemIcon As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the ListItemIcon
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItemIcon
	ID = sid.tolowercase
	ListItemIcon.Initialize(v, ID)
	ListItemIcon.SetTag("v-list-item-icon")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMListItemIcon
	bStatic = b
	ListItemIcon.SetStatic(b)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMListItemIcon
	ListItemIcon.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMListItemIcon
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	Return ListItemIcon.ToString
End Sub


Sub SetVText(vhtml As String) As VMListItemIcon
	ListItemIcon.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMListItemIcon
	ListItemIcon.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetVModel(k As String) As VMListItemIcon
	ListItemIcon.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMListItemIcon
	ListItemIcon.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMListItemIcon
	ListItemIcon.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMListItemIcon
	Dim childHTML As String = child.ToString
	ListItemIcon.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMListItemIcon
	ListItemIcon.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMListItemIcon
	ListItemIcon.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItemIcon
	ListItemIcon.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMListItemIcon
	ListItemIcon.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMListItemIcon
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMListItemIcon
	ListItemIcon.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMListItemIcon
	ListItemIcon.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMListItemIcon
	ListItemIcon.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMListItemIcon
	ListItemIcon.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMListItemIcon
	ListItemIcon.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMListItemIcon
	ListItemIcon.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMListItemIcon
	ListItemIcon.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMListItemIcon
	ListItemIcon.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMListItemIcon
	ListItemIcon.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMListItemIcon
	ListItemIcon.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMListItemIcon
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMListItemIcon
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub