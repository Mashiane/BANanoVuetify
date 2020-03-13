B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CardTitle As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the CardTitle
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCardTitle
	ID = sid.tolowercase
	CardTitle.Initialize(v, ID)
	CardTitle.SetTag("v-card-title")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'add a search box
Sub AddSearch(key As String) As VMCardTitle
	Dim txt As VMTextField
	txt.Initialize(vue, key, Module).SetAttributes(Array("single-line", "hide-details"))
	txt.SetLabel("Search").SetAppendIcon("mdi-magnify").SetClearable(True).Setvmodel(key)
	CardTitle.SetText(txt.ToString)
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMCardTitle
	CardTitle.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCardTitle
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetPrimaryTitle(b As Boolean) As VMCardTitle
	If b = False Then Return Me
	CardTitle.SetAttrLoose("primary-title")
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCardTitle
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


Sub AddSpacer As VMCardTitle
	CardTitle.AddSpacer
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCardTitle
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	CardTitle.Bind(":color", pp)
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return CardTitle.ToString
End Sub

Sub SetVModel(k As String) As VMCardTitle
	CardTitle.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCardTitle
	CardTitle.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCardTitle
	CardTitle.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCardTitle
	Dim childHTML As String = child.ToString
	CardTitle.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCardTitle
	CardTitle.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCardTitle
	CardTitle.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCardTitle
	CardTitle.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCardTitle
	CardTitle.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub


Sub Hide As VMCardTitle
	CardTitle.SetVisible(False)
	Return Me
End Sub

Sub Show As VMCardTitle
	CardTitle.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMCardTitle
	CardTitle.Enable(True)
	Return Me
End Sub

Sub Disable As VMCardTitle
	CardTitle.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCardTitle
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMCardTitle
	CardTitle.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCardTitle
	CardTitle.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMCardTitle
	CardTitle.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMCardTitle
	CardTitle.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMCardTitle
	CardTitle.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCardTitle
	CardTitle.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMCardTitle
	CardTitle.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMCardTitle
	CardTitle.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCardTitle
CardTitle.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMCardTitle
CardTitle.SetVisible(b)
Return Me
End Sub