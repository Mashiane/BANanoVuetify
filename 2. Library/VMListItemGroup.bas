B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItemGroup As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the ListItemGroup
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItemGroup
	ID = sid.tolowercase
	ListItemGroup.Initialize(v, ID)
	ListItemGroup.SetTag("v-list-item-group")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub


Sub SetAttributes(attrs As List) As VMListItemGroup
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	
	
	
	Return ListItemGroup.ToString
End Sub

Sub SetVModel(k As String) As VMListItemGroup
	ListItemGroup.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMListItemGroup
	ListItemGroup.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMListItemGroup
	ListItemGroup.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMListItemGroup
	Dim childHTML As String = child.ToString
	ListItemGroup.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMListItemGroup
	ListItemGroup.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMListItemGroup
	ListItemGroup.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItemGroup
	ListItemGroup.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMListItemGroup
	ListItemGroup.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As String) As VMListItemGroup
	ListItemGroup.SetAttrSingle("color", varColor)
	Return Me
End Sub


'hide the component
Sub Hide As VMListItemGroup
	ListItemGroup.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMListItemGroup
	ListItemGroup.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMListItemGroup
	ListItemGroup.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMListItemGroup
	ListItemGroup.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMListItemGroup
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMListItemGroup
	ListItemGroup.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMListItemGroup
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMListItemGroup
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	ListItemGroup.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMListItemGroup
	ListItemGroup.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMListItemGroup
	ListItemGroup.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMListItemGroup
	ListItemGroup.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMListItemGroup
	ListItemGroup.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMListItemGroup
	ListItemGroup.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMListItemGroup
	ListItemGroup.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMListItemGroup
	ListItemGroup.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMListItemGroup
	ListItemGroup.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMListItemGroup
	ListItemGroup.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMListItemGroup
ListItemGroup.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub