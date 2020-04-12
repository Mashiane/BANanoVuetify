B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItemContent As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the ListItemContent
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItemContent
	ID = sid.tolowercase
	ListItemContent.Initialize(v, ID)
	ListItemContent.SetTag("v-list-item-content")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMListItemContent
	bStatic = b
	ListItemContent.SetStatic(b)
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMListItemContent
	ListItemContent.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMListItemContent
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	RemoveAttr("ref")
	Return ListItemContent.ToString
End Sub

Sub SetVModel(k As String) As VMListItemContent
	ListItemContent.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMListItemContent
	ListItemContent.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMListItemContent
	ListItemContent.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMListItemContent
	Dim childHTML As String = child.ToString
	ListItemContent.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMListItemContent
	ListItemContent.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMListItemContent
	ListItemContent.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItemContent
	ListItemContent.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMListItemContent
	ListItemContent.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMListItemContent
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMListItemContent
	ListItemContent.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMListItemContent
	ListItemContent.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMListItemContent
	ListItemContent.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMListItemContent
	ListItemContent.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMListItemContent
	ListItemContent.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMListItemContent
	ListItemContent.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMListItemContent
	ListItemContent.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMListItemContent
	ListItemContent.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMListItemContent
	ListItemContent.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMListItemContent
	ListItemContent.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMListItemContent
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMListItemContent
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub