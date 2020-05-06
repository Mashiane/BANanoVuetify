B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItemSubTitle As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the ListItemSubTitle
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItemSubTitle
	ID = sid.tolowercase
	ListItemSubTitle.Initialize(v, ID)
	ListItemSubTitle.SetTag("v-list-item-subtitle")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMListItemSubTitle
	bStatic = b
	ListItemSubTitle.SetStatic(b)
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMListItemSubTitle
	ListItemSubTitle.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMListItemSubTitle
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	Return ListItemSubTitle.ToString
End Sub

Sub SetVModel(k As String) As VMListItemSubTitle
	ListItemSubTitle.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMListItemSubTitle
	ListItemSubTitle.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMListItemSubTitle
	ListItemSubTitle.SetVShow(vif)
	Return Me
End Sub


Sub SetVText(vhtml As String) As VMListItemSubTitle
	ListItemSubTitle.SetVText(vhtml)
	Return Me
End Sub


Sub SetVhtml(vhtml As String) As VMListItemSubTitle
	ListItemSubTitle.SetVHtml(vhtml)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMListItemSubTitle
	Dim childHTML As String = child.ToString
	ListItemSubTitle.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMListItemSubTitle
	ListItemSubTitle.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMListItemSubTitle
	ListItemSubTitle.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItemSubTitle
	ListItemSubTitle.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMListItemSubTitle
	ListItemSubTitle.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMListItemSubTitle
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMListItemSubTitle
	ListItemSubTitle.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMListItemSubTitle
	ListItemSubTitle.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMListItemSubTitle
	ListItemSubTitle.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMListItemSubTitle
	ListItemSubTitle.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMListItemSubTitle
	ListItemSubTitle.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMListItemSubTitle
	ListItemSubTitle.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMListItemSubTitle
	ListItemSubTitle.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMListItemSubTitle
	ListItemSubTitle.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMListItemSubTitle
	ListItemSubTitle.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMListItemSubTitle
	ListItemSubTitle.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMListItemSubTitle
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMListItemSubTitle
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub