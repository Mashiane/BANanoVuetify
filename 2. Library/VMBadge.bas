B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public Badge As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
	Public HasContent As Boolean
	Private smodel As String
End Sub

'initialize the Badge
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMBadge
	HasContent = False
	vue = v
	ID = sid.tolowercase
	Badge.Initialize(v, ID)
	Badge.SetTag("v-badge")
	DesignMode = False
	Module = eventHandler
	bStatic = False
	SetVModel(Badge.showkey)
	Show
	Return Me
End Sub

Sub SetData(prop As String, value As Object) As VMBadge
	vue.SetData(prop, value)
	Return Me
End Sub


'add an element to the page content
Sub AddElement(elm As VMElement)
	Badge.SetText(elm.ToString)
End Sub


Sub SetStatic(b As Boolean) As VMBadge
	bStatic = b
	Badge.SetStatic(b)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMBadge
	Badge.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMBadge
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetOnlineIndicator(b As Boolean) As VMBadge
	If b = False Then Return Me
	SetBordered(True)
	SetDot(True)
	SetOffsetX("10")
	SetOffsetY("10")
	SetBottom(True)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMBadge
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)	
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Badge.Bind(":color", pp)
	Return Me
End Sub

'get component
Sub ToString As String
	Badge.RemoveVShow
	Return Badge.ToString
End Sub

Sub AddComponent(comp As String) As VMBadge
	Badge.SetText(comp)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMBadge
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

Sub SetVIf(vif As String) As VMBadge
	Badge.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMBadge
	Badge.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMBadge
	Dim childHTML As String = child.ToString
	Badge.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMBadge
	Badge.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMBadge
	Badge.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMBadge
	Badge.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMBadge
	Badge.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set avatar
Sub SetAvatar(varAvatar As Boolean) As VMBadge
	If bStatic Then
		SetAttrSingle("avatar", varAvatar)
		Return Me
	End If
	Dim pp As String = $"${ID}Avatar"$
	vue.SetStateSingle(pp, varAvatar)
	Badge.Bind(":avatar", pp)
	Return Me
End Sub

'set bordered
Sub SetBordered(varBordered As Boolean) As VMBadge
	If bStatic Then
		SetAttrSingle("bordered", varBordered)
		Return Me
	End If
	Dim pp As String = $"${ID}Bordered"$
	vue.SetStateSingle(pp, varBordered)
	Badge.Bind(":bordered", pp)
	Return Me
End Sub

'set bottom
Sub SetBottom(varBottom As Boolean) As VMBadge
	If bStatic Then
		SetAttrSingle("bottom", varBottom)
		Return Me
	End If
	Dim pp As String = $"${ID}Bottom"$
	vue.SetStateSingle(pp, varBottom)
	Badge.Bind(":bottom", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMBadge
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Badge.Bind(":color", pp)
	Return Me
End Sub

'set content
Sub SetContent(varContent As String) As VMBadge
	HasContent = True
	If bStatic Then
		SetAttrSingle("content", varContent)
		Return Me
	End If
	Dim pp As String = $"${ID}content"$
	vue.SetStateSingle(pp, varContent)
	Badge.bind(":content", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMBadge
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Badge.Bind(":dark", pp)
	Return Me
End Sub

'set dot
Sub SetDot(varDot As Boolean) As VMBadge
	If bStatic Then
		SetAttrSingle("dot", varDot)
		Return Me
	End If
	Dim pp As String = $"${ID}Dot"$
	vue.SetStateSingle(pp, varDot)
	Badge.Bind(":dot", pp)
	Return Me
End Sub

'set icon
Sub SetIcon(varIcon As String) As VMBadge
	If bStatic Then 
		SetAttrSingle("icon", varIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}Icon"$
	vue.SetStateSingle(pp, varIcon)
	Badge.Bind(":icon", pp)
	Return Me
End Sub

'set inline
Sub SetInline(varInline As Boolean) As VMBadge
	If bStatic Then
		SetAttrSingle("inline", varInline)
		Return Me
	End If
	Dim pp As String = $"${ID}Inline"$
	vue.SetStateSingle(pp, varInline)
	Badge.Bind(":inline", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As String) As VMBadge
	If bStatic Then
		SetAttrSingle("label", varLabel)
		Return Me
	End If
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	Badge.Bind(":label", pp)
	Return Me
End Sub

'set left
Sub SetLeft(varLeft As Boolean) As VMBadge
	If bStatic Then
		SetAttrSingle("left", varLeft)
		Return Me
	End If
	Dim pp As String = $"${ID}Left"$
	vue.SetStateSingle(pp, varLeft)
	Badge.Bind(":left", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMBadge
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Badge.Bind(":light", pp)
	Return Me
End Sub

'set mode
Sub SetMode(varMode As String) As VMBadge
	If varMode = "" Then Return Me
	If bStatic Then
		SetAttrSingle("mode", varMode)
		Return Me
	End If
	Dim pp As String = $"${ID}Mode"$
	vue.SetStateSingle(pp, varMode)
	Badge.Bind(":mode", pp)
	Return Me
End Sub

'set offset-x
Sub SetOffsetX(varOffsetX As String) As VMBadge
	If bStatic Then
		SetAttrSingle("offset-x", varOffsetX)
		Return Me
	End If
	Dim pp As String = $"${ID}OffsetX"$
	vue.SetStateSingle(pp, varOffsetX)
	Badge.Bind(":offset-x", pp)
	Return Me
End Sub

'set offset-y
Sub SetOffsetY(varOffsetY As String) As VMBadge
	If bStatic Then
		SetAttrSingle("offset-y", varOffsetY)
		Return Me
	End If
	Dim pp As String = $"${ID}OffsetY"$
	vue.SetStateSingle(pp, varOffsetY)
	Badge.Bind(":offset-y", pp)
	Return Me
End Sub

'set origin
Sub SetOrigin(varOrigin As String) As VMBadge
	If varOrigin = "" Then Return Me
	If bStatic Then
		SetAttrSingle("origin", varOrigin)
		Return Me
	End If
	Dim pp As String = $"${ID}Origin"$
	vue.SetStateSingle(pp, varOrigin)
	Badge.Bind(":origin", pp)
	Return Me
End Sub

'set overlap
Sub SetOverlap(varOverlap As Boolean) As VMBadge
	If bStatic Then
		SetAttrSingle("overlap", varOverlap)
		Return Me
	End If
	Dim pp As String = $"${ID}Overlap"$
	vue.SetStateSingle(pp, varOverlap)
	Badge.Bind(":overlap", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Boolean) As VMBadge
	If bStatic Then
		SetAttrSingle("tile", varTile)
		Return Me
	End If
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	Badge.Bind(":tile", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As String) As VMBadge
	If varTransition = "" Then Return Me
	If bStatic Then
		SetAttrSingle("transition", varTransition)
		Return Me
	End If
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	Badge.Bind(":transition", pp)
	Return Me
End Sub

'set value / whether its visible . not
Sub SetVisible(varValue As Boolean) As VMBadge
	If varValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("value", varValue)
		Return Me
	End If
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	Badge.Bind(":value", pp)
	Return Me
End Sub

Sub SetVModel(k As String) As VMBadge
	smodel = k
	Badge.SetVModel(k)
	Return Me
End Sub


Sub Hide As VMBadge
	vue.SetData(smodel, False)
	Return Me
End Sub

Sub Show As VMBadge
	vue.SetData(smodel, True)
	Return Me
End Sub

Sub Enable As VMBadge
	Badge.Enable(True)
	Return Me
End Sub

Sub Disable As VMBadge
	Badge.Enable(False)
	Return Me
End Sub

'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMBadge
	Badge.Bind(prop, stateprop)
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMBadge
	Badge.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMBadge
	Badge.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMBadge
	Badge.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMBadge
	Badge.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMBadge
	Badge.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMBadge
	Badge.SetName(varName, bbind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMBadge
	Badge.SetDisabled(b)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMBadge
	Badge.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMBadge
	Badge.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMBadge
	Badge.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub
