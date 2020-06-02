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
	Private bStatic As Boolean
End Sub

'initialize the CardTitle
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCardTitle
	ID = sid.tolowercase
	CardTitle.Initialize(v, ID)
	CardTitle.SetTag("v-card-title")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMCardTitle
	bStatic = b
	CardTitle.SetStatic(b)
	Return Me
End Sub

'add a search box
Sub AddSearch(key As String) As VMCardTitle
	Dim txt As VMTextField
	txt.Initialize(vue, key, Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetAttributes(Array("flat", "single-line", "hide-details"))
	txt.SetLabel("Search").SetAppendIcon("mdi-magnify").SetClearable(True).Setvmodel(key).AddClass("mx-4")
	txt.SetOnChange(Module, $"${key}_change"$)
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


'add a component to the toolbar
Sub AddComponent(comp As String) As VMCardTitle
	CardTitle.SetText(comp)
	Return Me
End Sub


Sub AddButton(btn As VMButton) As VMCardTitle
	CardTitle.SetText(btn.tostring)
	Return Me
End Sub


Sub AddButton1(key As String, iconName As String, text As String, toolTip As String, badge As String) As VMCardTitle
	Dim btn As VMButton
	btn.Initialize(vue, key, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	btn.SetToolTip(toolTip)
	If iconName <> "" Then btn.AddIcon(iconName,"left","")
	btn.SetLabel(text)
	If badge <> "" Then
		btn.Badge.SetContent(badge)
	End If
	CardTitle.SetText(btn.tostring)
	Return Me
End Sub

Sub AddButtonIcon(key As String, iconName As String, iconColor As String, toolTip As String) As VMCardTitle
	key = key.tolowercase
	Dim btn As VMButton
	btn.Initialize(vue, key, Module)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetIconButton(iconName).SetTooltip(toolTip)
	btn.SetColor(iconColor)
	CardTitle.SetText(btn.tostring)
	Return Me
End Sub

Sub AddMenu(menu As VMMenu) As VMCardTitle
	AddComponent(menu.ToString)
	Return Me
End Sub

Sub AddSpacer As VMCardTitle
	CardTitle.AddSpacer
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

Sub SetVIf(vif As String) As VMCardTitle
	CardTitle.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMCardTitle
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

'set color intensity
Sub SetTextColor(varColor As String) As VMCardTitle
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMCardTitle
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub


'set color intensity
Sub SetColor(varColor As String) As VMCardTitle
	If varColor = "" Then Return Me
	AddClass(varColor)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCardTitle
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	AddClass(scolor)
	Return Me
End Sub
