B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItemActionText As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the ListItemActionText
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItemActionText
	ID = sid.tolowercase
	ListItemActionText.Initialize(v, ID)
	ListItemActionText.SetTag("v-list-item-action-text")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMListItemActionText
	bStatic = b
	ListItemActionText.SetStatic(b)
	Return Me
End Sub

Sub AddIcon(key As String, iconName As String) As VMListItemActionText
	key = key.tolowercase
	Dim btn As VMButton
	btn.Initialize(vue, key, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	btn.SetAttributes(Array("icon"))
	Dim icon As VMIcon
	icon.Initialize(vue, $"${key}icon"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	icon.SetVText(iconName)
	btn.AddComponent(icon.ToString)
	btn.Pop(ListItemActionText)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMListItemActionText
	ListItemActionText.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMListItemActionText
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	Return ListItemActionText.ToString
End Sub

Sub SetVModel(k As String) As VMListItemActionText
	ListItemActionText.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMListItemActionText
	ListItemActionText.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMListItemActionText
	ListItemActionText.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMListItemActionText
	Dim childHTML As String = child.ToString
	ListItemActionText.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMListItemActionText
	ListItemActionText.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMListItemActionText
	ListItemActionText.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItemActionText
	ListItemActionText.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMListItemActionText
	ListItemActionText.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub


Sub Hide As VMListItemActionText
	ListItemActionText.SetVisible(False)
	Return Me
End Sub

Sub Show As VMListItemActionText
	ListItemActionText.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMListItemActionText
	ListItemActionText.Enable(True)
	Return Me
End Sub

Sub Disable As VMListItemActionText
	ListItemActionText.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMListItemActionText
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMListItemActionText
	ListItemActionText.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMListItemActionText
	ListItemActionText.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMListItemActionText
	ListItemActionText.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMListItemActionText
	ListItemActionText.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMListItemActionText
	ListItemActionText.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMListItemActionText
	ListItemActionText.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMListItemActionText
	ListItemActionText.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMListItemActionText
	ListItemActionText.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMListItemActionText
	ListItemActionText.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMListItemActionText
	ListItemActionText.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMListItemActionText
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMListItemActionText
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub