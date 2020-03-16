B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CardActions As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the CardActions
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCardActions
	ID = sid.tolowercase
	CardActions.Initialize(v, ID)
	CardActions.SetTag("v-card-actions")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMCardActions
	CardActions.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCardActions
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCardActions
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

Sub AddButton(btn As VMButton) As VMCardActions
	btn.Pop(CardActions)
	Return Me
End Sub

Sub AddSpacer As VMCardActions
	CardActions.AddSpacer
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCardActions
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	CardActions.Bind(":color", pp)
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return CardActions.ToString
End Sub

Sub SetVModel(k As String) As VMCardActions
	CardActions.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCardActions
	CardActions.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCardActions
	CardActions.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCardActions
	Dim childHTML As String = child.ToString
	CardActions.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCardActions
	CardActions.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCardActions
	CardActions.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCardActions
	CardActions.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCardActions
	CardActions.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub


Sub Hide As VMCardActions
	CardActions.SetVisible(False)
	Return Me
End Sub

Sub Show As VMCardActions
	CardActions.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMCardActions
	CardActions.Enable(True)
	Return Me
End Sub

Sub Disable As VMCardActions
	CardActions.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCardActions
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMCardActions
	CardActions.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCardActions
	CardActions.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMCardActions
	CardActions.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMCardActions
	CardActions.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMCardActions
	CardActions.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCardActions
	CardActions.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMCardActions
	CardActions.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMCardActions
	CardActions.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCardActions
CardActions.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMCardActions
CardActions.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMCardActions
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMCardActions
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub