B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CardSubTitle As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the CardSubTitle
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCardSubTitle
	ID = sid.tolowercase
	CardSubTitle.Initialize(v, ID)
	CardSubTitle.SetTag("v-card-subtitle")
	DesignMode = False
	Module = eventHandler
	vue = v
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
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCardSubTitle
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	CardSubTitle.Bind(":color", pp)
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

Sub SetVIf(vif As Object) As VMCardSubTitle
	CardSubTitle.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCardSubTitle
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
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCardSubTitle
	CardSubTitle.SetText(t)
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