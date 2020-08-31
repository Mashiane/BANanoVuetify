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
	Public HasContent As Boolean
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
	HasContent = False
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
	txt.Initialize(vue, key, Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetAttributes(Array("single-line", "hide-details"))
	txt.SetLabel("Search").SetAppendIcon("mdi-magnify").SetClearable(True).Setvmodel(key)
	txt.SetSolo(True)
	txt.SetOnChange(Module, $"${key}_change"$)
	CardTitle.SetText(txt.ToString)
	HasContent = True
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

Sub AddIcon1(elID As String, iconName As String, mprops As Map, mstyles As Map, lclasses As List) As VMCardTitle
	Dim d As VMIcon
	d.Initialize(vue,elID,Module).SetDesignMode(DesignMode)
	d.SetText(iconName)
	d.BuildModel(mprops, mstyles, lclasses, Null)
	CardTitle.SetText(d.ToString)
	HasContent = True
	Return Me
End Sub

Sub AddElement(elID As String, elTag As String, elText As String, mprops As Map, mstyles As Map, lclasses As List) As VMCardTitle
	Dim d As VMElement
	d.Initialize(vue,elID).SetDesignMode(DesignMode).SetTag(elTag)
	d.SetText(elText)
	d.BuildModel(mprops, mstyles, lclasses, Null)
	CardTitle.SetText(d.ToString)
	HasContent = True
	Return Me
End Sub

Sub AddDivider(bVertical As Boolean, mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCardTitle
	Dim d As VMDivider
	d.Initialize(vue).SetDesignMode(DesignMode)
	If bVertical Then d.SetVertical
	d.BuildModel(mprops, mstyles, lclasses, loose)
	CardTitle.SetText(d.ToString)
	HasContent = True
	Return Me
End Sub

'add a component to the toolbar
Sub AddComponent(comp As String) As VMCardTitle
	CardTitle.SetText(comp)
	HasContent = True
	Return Me
End Sub


Sub AddButton(btn As VMButton) As VMCardTitle
	CardTitle.SetText(btn.tostring)
	HasContent = True
	Return Me
End Sub

Sub AddButton1(key As String, iconName As String, iconColor As String, text As String, toolTip As String, badge As String) As VMCardTitle
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
	CardTitle.SetText(btn.tostring)
	HasContent = True
	Return Me
End Sub

Sub AddButton3(key As String, iconName As String, iconColor As String, iconPos As String, text As String, bOutlined As Boolean, toolTip As String, badge As String) As VMCardTitle
	Dim btn As VMButton
	btn.Initialize(vue, key, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	btn.SetToolTip(toolTip)
	If iconName <> "" Then btn.AddIcon(iconName,iconPos,"")
	btn.SetLabel(text)
	btn.SetColor(iconColor)
	btn.SetTransparent(True)
	btn.SetOutlined(bOutlined)
	If badge <> "" Then
		btn.SetHasBadge(True)
		btn.SetBadge(badge)
	End If
	CardTitle.SetText(btn.tostring)
	HasContent = True
	Return Me
End Sub


'add divider on the toolbar
Sub AddDivider1 As VMCardTitle
	AddDivider(True, Null, Null, Array("mx-2"), Null)
	Return Me
End Sub


Sub AddButton2(btnID As String, btnText As String, btnIcon As String, btnColor As String, btnValue As String, btnToolTip As String, btnBadge As String, btnRaised As Boolean, btnFab As Boolean)
	Dim btn As VMButton
	btn.Initialize(vue, btnID, Module)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetColor(btnColor)
	btn.SetSpan(btnText)
	btn.AddIcon(btnIcon, "", "")
	btn.SetTooltip(btnToolTip)
	btn.SetRaised(btnRaised)
	btn.SetAttrSingle("value", btnValue)
	btn.SetFab(btnFab)
	If btnBadge <> "" Then
		btn.SetHasBadge(True)
		btn.SetBadge(btnBadge)
	End If
	HasContent = True
	CardTitle.SetText(btn.ToString)
End Sub

Sub AddIcon(key As String, iconName As String, iconColor As String, iconSize As String, toolTip As String, badge As String) As VMCardTitle
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
	CardTitle.SetText(btn.tostring)
	HasContent = True
	Return Me
End Sub

Sub AddIcon2(key As String, iconName As String, iconColor As String, iconSize As String, toolTip As String, badge As String, classes As String) As VMCardTitle
	key = key.tolowercase
	Dim btn As VMButton
	btn.Initialize(vue, key, Module)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetIconButton(iconName).SetTooltip(toolTip)
	btn.SetColor(iconColor)
	btn.SetSize(iconSize)
	btn.AddClass(classes)
	If badge <> "" Then
		btn.SetHasBadge(True)
		btn.SetBadge(badge)
	End If
	CardTitle.SetText(btn.tostring)
	HasContent = True
	Return Me
End Sub
'
Sub AddFab(key As String, iconName As String, iconColor As String, iconSize As String, toolTip As String, badge As String) As VMCardTitle
	key = key.tolowercase
	Dim btn As VMButton
	btn.Initialize(vue, key, Module)
	btn.SetStatic(bStatic)
	btn.SetFab(True)
	btn.SetDesignMode(DesignMode)
	btn.AddIcon(iconName,"","")
	btn.SetColor(iconColor)
	btn.SetSize(iconSize)
	btn.SetTooltip(toolTip)
	If badge <> "" Then
		btn.SetHasBadge(True)
		btn.SetBadge(badge)
	End If
	CardTitle.SetText(btn.tostring)
	HasContent = True
	Return Me
End Sub



Sub AddMenu(menu As VMMenu) As VMCardTitle
	AddComponent(menu.ToString)
	HasContent = True
	Return Me
End Sub

Sub AddSpacer As VMCardTitle
	CardTitle.AddSpacer
	HasContent = True
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
	HasContent = True
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMCardTitle
	If t = "" Then Return Me
	CardTitle.SetText(t)
	HasContent = True
	Return Me
End Sub

Sub Clear
	CardTitle.Clear
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
