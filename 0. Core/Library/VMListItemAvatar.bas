B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItemAvatar As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the ListItemAvatar
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItemAvatar
	ID = sid.tolowercase
	ListItemAvatar.Initialize(v, ID)
	ListItemAvatar.SetTag("v-list-item-avatar")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMListItemAvatar
	bStatic = b
	ListItemAvatar.SetStatic(b)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMListItemAvatar
	ListItemAvatar.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMListItemAvatar
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	Return ListItemAvatar.ToString
End Sub

Sub SetVModel(k As String) As VMListItemAvatar
	ListItemAvatar.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMListItemAvatar
	ListItemAvatar.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMListItemAvatar
	ListItemAvatar.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMListItemAvatar
	Dim childHTML As String = child.ToString
	ListItemAvatar.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMListItemAvatar
	ListItemAvatar.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMListItemAvatar
	ListItemAvatar.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItemAvatar
	ListItemAvatar.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMListItemAvatar
	ListItemAvatar.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As String) As VMListItemAvatar
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ListItemAvatar.Bind(":color", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMListItemAvatar
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	ListItemAvatar.Bind(":height", pp)
	Return Me
End Sub

'set horizontal
Sub SetHorizontal(varHorizontal As Boolean) As VMListItemAvatar
	If varHorizontal = False Then Return Me
	If bStatic Then
		SetAttrSingle("horizontal", varHorizontal)
		Return Me
	End If
	Dim pp As String = $"${ID}Horizontal"$
	vue.SetStateSingle(pp, varHorizontal)
	ListItemAvatar.Bind(":horizontal", pp)
	Return Me
End Sub

'set left
Sub SetLeft(varLeft As Boolean) As VMListItemAvatar
	If varLeft = False Then Return Me
	If bStatic Then
		SetAttrSingle("left", varLeft)
		Return Me
	End If
	Dim pp As String = $"${ID}Left"$
	vue.SetStateSingle(pp, varLeft)
	ListItemAvatar.Bind(":left", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As String) As VMListItemAvatar
	If varMaxHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-height", varMaxHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	ListItemAvatar.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As String) As VMListItemAvatar
	If varMaxWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-width", varMaxWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	ListItemAvatar.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As String) As VMListItemAvatar
	If varMinHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-height", varMinHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	ListItemAvatar.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As String) As VMListItemAvatar
	If varMinWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-width", varMinWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	ListItemAvatar.Bind(":min-width", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Boolean) As VMListItemAvatar
	If varRight = False Then Return Me
	If bStatic Then
		SetAttrSingle("right", varRight)
		Return Me
	End If
	Dim pp As String = $"${ID}Right"$
	vue.SetStateSingle(pp, varRight)
	ListItemAvatar.Bind(":right", pp)
	Return Me
End Sub

'set size
Sub SetSize(varSize As String) As VMListItemAvatar
	If varSize = "" Then Return Me
	If bStatic Then
		SetAttrSingle("size", varSize)
		Return Me
	End If
	Dim pp As String = $"${ID}Size"$
	vue.SetStateSingle(pp, varSize)
	ListItemAvatar.Bind(":size", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Boolean) As VMListItemAvatar
	If varTile = False Then Return Me
	If bStatic Then
		SetAttrSingle("tile", varTile)
		Return Me
	End If
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	ListItemAvatar.Bind(":tile", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As String) As VMListItemAvatar
	If varWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("width", varWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	ListItemAvatar.Bind(":width", pp)
	Return Me
End Sub


Sub Hide As VMListItemAvatar
	ListItemAvatar.SetVisible(False)
	Return Me
End Sub

Sub Show As VMListItemAvatar
	ListItemAvatar.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMListItemAvatar
	ListItemAvatar.Enable(True)
	Return Me
End Sub

Sub Disable As VMListItemAvatar
	ListItemAvatar.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMListItemAvatar
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMListItemAvatar
	ListItemAvatar.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMListItemAvatar
	ListItemAvatar.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMListItemAvatar
	ListItemAvatar.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMListItemAvatar
	ListItemAvatar.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMListItemAvatar
	ListItemAvatar.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMListItemAvatar
	ListItemAvatar.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMListItemAvatar
	ListItemAvatar.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMListItemAvatar
	ListItemAvatar.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMListItemAvatar
	ListItemAvatar.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMListItemAvatar
	ListItemAvatar.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMListItemAvatar
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMListItemAvatar
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub