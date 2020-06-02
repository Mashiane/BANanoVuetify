B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItemAction As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the ListItemAction
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItemAction
	ID = sid.tolowercase
	ListItemAction.Initialize(v, ID)
	ListItemAction.SetTag("v-list-item-action")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMListItemAction
	bStatic = b
	ListItemAction.SetStatic(b)
	Return Me
End Sub

Sub AddIcon(key As String, iconName As String) As VMListItemAction
	key = key.tolowercase
	Dim btn As VMButton
	btn.Initialize(vue, key, Module)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetIcon(True)
	'
	Dim icon As VMIcon
	icon.Initialize(vue, $"${key}icon"$, Module)
	icon.SetStatic(bStatic)
	icon.SetDesignMode(DesignMode)
	icon.SetVText(iconName)
	btn.AddComponent(icon.ToString)
	btn.Pop(ListItemAction)
	Return Me
End Sub

Sub AddComponent(comp As String) As VMListItemAction
	ListItemAction.SetText(comp)
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMListItemAction
	ListItemAction.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMListItemAction
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	Return ListItemAction.ToString
End Sub

Sub SetVModel(k As String) As VMListItemAction
	ListItemAction.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMListItemAction
	ListItemAction.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMListItemAction
	ListItemAction.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMListItemAction
	Dim childHTML As String = child.ToString
	ListItemAction.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMListItemAction
	ListItemAction.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMListItemAction
	ListItemAction.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItemAction
	ListItemAction.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMListItemAction
	ListItemAction.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub


Sub Hide As VMListItemAction
	ListItemAction.SetVisible(False)
	Return Me
End Sub

Sub Show As VMListItemAction
	ListItemAction.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMListItemAction
	ListItemAction.Enable(True)
	Return Me
End Sub

Sub Disable As VMListItemAction
	ListItemAction.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMListItemAction
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMListItemAction
	ListItemAction.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMListItemAction
	ListItemAction.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMListItemAction
	ListItemAction.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMListItemAction
	ListItemAction.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMListItemAction
	ListItemAction.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMListItemAction
	ListItemAction.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMListItemAction
	ListItemAction.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMListItemAction
	ListItemAction.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMListItemAction
	ListItemAction.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMListItemAction
	ListItemAction.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMListItemAction
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMListItemAction
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub