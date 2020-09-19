B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12,9
Sub Class_Globals
	Public CardActions As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
	Public HasContent As Boolean
End Sub

'initialize the CardActions
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCardActions
	ID = sid.tolowercase
	CardActions.Initialize(v, ID)
	CardActions.SetTag("v-card-actions")
	DesignMode = False
	Module = eventHandler
	vue = v
	HasContent = False
	Return Me
End Sub

Sub SetData(prop As String, value As Object) As VMCardActions
	vue.SetData(prop, value)
	Return Me
End Sub

Sub SetSpaceBetween As VMCardActions
	AddClass("justify-space-between")
	Return Me
End Sub

Sub AddElement(elID As String, elTag As String, elText As String, mprops As Map, mstyles As Map, lclasses As List) As VMCardActions
	Dim d As VMElement
	d.Initialize(vue,elID).SetDesignMode(DesignMode).SetTag(elTag)
	d.SetText(elText)
	d.BuildModel(mprops, mstyles, lclasses, Null)
	SetText(d.ToString)
	HasContent = True
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMCardActions
	bStatic = b
	CardActions.SetStatic(b)
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
	HasContent = True
	Return Me
End Sub


Sub AddButton1(key As String, iconName As String, iconColor As String, text As String, toolTip As String, badge As String) As VMCardActions
	Dim btn As VMButton
	btn.Initialize(vue, key, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	btn.SetToolTip(toolTip)
	If iconName <> "" Then btn.AddIcon(iconName,"left","")
	btn.SetLabel(text)
	btn.SetColor(iconColor)
	btn.SetTransparent(True)
	If badge <> "" Then
		btn.SetHasBadge(True)
		btn.SetBadge(badge)
	End If
	CardActions.SetText(btn.tostring)
	HasContent = True
	Return Me
End Sub

Sub AddIcon(key As String, iconName As String, iconColor As String, iconSize As String, toolTip As String, badge As String) As VMCardActions
	key = key.tolowercase
	Dim btn As VMButton
	btn.Initialize(vue, key, Module)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetIconButton(iconName).SetTooltip(toolTip)
	btn.SetColor(iconColor)
	btn.SetSize(iconSize)
	If badge <> "" Then
		btn.SetHasBadge(True)
		btn.SetBadge(badge)
	End If
	CardActions.SetText(btn.tostring)
	HasContent = True
	Return Me
End Sub


Sub AddMenu(menu As VMMenu) As VMCardActions
	menu.Pop(CardActions)
	HasContent = True
	Return Me
End Sub

Sub AddSpacer As VMCardActions
	CardActions.AddSpacer
	HasContent = True
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

Sub SetVIf(vif As String) As VMCardActions
	CardActions.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMCardActions
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
	HasContent = True
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMCardActions
	If t = "" Then Return Me
	CardActions.SetText(t)
	HasContent = True
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


'set color intensity - built in
Sub SetTextColorIntensity(textcolor As String, textintensity As String) As VMCardActions
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Dim sIntensity As String = $"text--${textintensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMCardActions
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	CardActions.Bind(":color", pp)
	Return Me
End Sub