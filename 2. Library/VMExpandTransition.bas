B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ExpandTransition As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public HasContent As Boolean
End Sub

'initialize the ExpandTransition
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMExpandTransition
	ID = sid.tolowercase
	ExpandTransition.Initialize(v, ID)
	ExpandTransition.SetTag("v-expand-transition")
	DesignMode = False
	Module = eventHandler
	vue = v
	HasContent = False
	Return Me
End Sub


Sub SetAttributes(attrs As List) As VMExpandTransition
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMExpandTransition
	ExpandTransition.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMExpandTransition
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMExpandTransition
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	ExpandTransition.Bind(":color", pp)
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return ExpandTransition.ToString
End Sub

Sub SetVModel(k As String) As VMExpandTransition
	ExpandTransition.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMExpandTransition
	ExpandTransition.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMExpandTransition
	ExpandTransition.SetVShow(vif)
	Return Me
End Sub

'add a child
Sub AddChild(child As VMElement) As VMExpandTransition
	Dim childHTML As String = child.ToString
	ExpandTransition.SetText(childHTML)
	HasContent = True
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMExpandTransition
	HasContent = True
	ExpandTransition.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMExpandTransition
	ExpandTransition.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMExpandTransition
	ExpandTransition.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMExpandTransition
	ExpandTransition.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub


Sub Hide As VMExpandTransition
	ExpandTransition.SetVisible(False)
	Return Me
End Sub

Sub Show As VMExpandTransition
	ExpandTransition.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMExpandTransition
	ExpandTransition.Enable(True)
	Return Me
End Sub

Sub Disable As VMExpandTransition
	ExpandTransition.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMExpandTransition
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMExpandTransition
	ExpandTransition.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMExpandTransition
	ExpandTransition.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMExpandTransition
	ExpandTransition.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMExpandTransition
	ExpandTransition.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMExpandTransition
	ExpandTransition.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMExpandTransition
	ExpandTransition.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMExpandTransition
	ExpandTransition.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMExpandTransition
	ExpandTransition.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMExpandTransition
ExpandTransition.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub