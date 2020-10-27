B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TimeLineItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean  'ignore
	Private Module As Object
	Private bStatic As Boolean
	Public Container As VMContainer
	Public Avatar As VMAvatar
	Private hasAvatar As Boolean
	Public Opposite As VMContainer
	Public OppositeText As VMLabel
	Public Card As VMCard
	Public UsesCard As Boolean
	Public CardTitle As VMCardTitle
	Public CardSubTitle As VMCardSubTitle
	Public CardText As VMCardText
	Public CardActions As VMCardActions
	Public CardContainer As VMContainer
End Sub

'initialize the TimeLineItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTimelineItem
	ID = sid.tolowercase
	TimeLineItem.Initialize(v, ID)
	TimeLineItem.SetTag("v-timeline-item")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	Container.Initialize(vue, $"${ID}cont"$, eventHandler) 
	Avatar.Initialize(vue, $"${ID}avt"$, eventHandler)
	Opposite.Initialize(vue, $"${ID}opp"$, eventHandler).SetTag("template").SetSlotOpposite
	OppositeText.Initialize(vue, $"${ID}span"$)
	OppositeText.SetSpan
	OppositeText.SetAttrSingle("slot","opposite")
	hasAvatar = False
	UsesCard = False
	Card.Initialize(vue, $"${ID}card"$,eventHandler) 
	CardTitle = Card.Title
	CardSubTitle = Card.SubTitle
	CardText = Card.Text
	CardActions = Card.Actions
	CardContainer = Card.Container
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMTimelineItem
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetAvatar(url As String) As VMTimelineItem
	Avatar.SetImage(url, "", Null, Null, Null)
	hasAvatar = True
	Return Me
End Sub

'get component
Sub ToString As String
	'add avatar that shows in the middle
	If hasAvatar Then
		Dim tmp As VMTemplate
		tmp.Initialize(vue, "", Module).SetSlotIcon
		tmp.AddComponent(Avatar.ToString)
		AddComponent(tmp.ToString) 
	End If
	AddComponent(OppositeText.ToString)
	If Opposite.HasContent Then
		AddComponent(Opposite.ToString)
	End If
	'add a container if available
	If Container.HasContent Then 
		AddComponent(Container.ToString)
	End If
	If UsesCard Then
		AddComponent(Card.ToString)
	End If
	Return TimeLineItem.ToString
End Sub

Sub SetVModel(k As String) As VMTimelineItem
	TimeLineItem.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMTimelineItem
	TimeLineItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMTimelineItem
	TimeLineItem.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTimelineItem
	Dim childHTML As String = child.ToString
	TimeLineItem.SetText(childHTML)
	Return Me
End Sub

'set text - built-in
Sub SetText(t As String) As VMTimelineItem
	TimeLineItem.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTimelineItem
	TimeLineItem.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTimelineItem
	TimeLineItem.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTimelineItem
	TimeLineItem.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMTimelineItem
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	TimeLineItem.Bind(":dark", pp)
	Return Me
End Sub

'set fill-dot
Sub SetFillDot(varFillDot As Boolean) As VMTimelineItem
	If varFillDot = False Then Return Me
	If bStatic Then
		SetAttrSingle("fill-dot", varFillDot)
		Return Me
	End If
	Dim pp As String = $"${ID}FillDot"$
	vue.SetStateSingle(pp, varFillDot)
	TimeLineItem.Bind(":fill-dot", pp)
	Return Me
End Sub

'set hide-dot
Sub SetHideDot(varHideDot As Boolean) As VMTimelineItem
	If varHideDot = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-dot", varHideDot)
		Return Me
	End If
	Dim pp As String = $"${ID}HideDot"$
	vue.SetStateSingle(pp, varHideDot)
	TimeLineItem.Bind(":hide-dot", pp)
	Return Me
End Sub

'set large
Sub SetLarge(varLarge As Boolean) As VMTimelineItem
	If varLarge = False Then Return Me
	If bStatic Then
		SetAttrSingle("large", varLarge)
		Return Me
	End If
	Dim pp As String = $"${ID}Large"$
	vue.SetStateSingle(pp, varLarge)
	TimeLineItem.Bind(":large", pp)
	Return Me
End Sub

'set left
Sub SetLeft(varLeft As Boolean) As VMTimelineItem
	If varLeft = False Then Return Me
	If bStatic Then
		SetAttrSingle("left", varLeft)
		Return Me
	End If
	Dim pp As String = $"${ID}Left"$
	vue.SetStateSingle(pp, varLeft)
	TimeLineItem.Bind(":left", pp)
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	TimeLineItem.SetText(elm.ToString)
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMTimelineItem
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	TimeLineItem.Bind(":light", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Boolean) As VMTimelineItem
	If varRight = False Then Return Me
	If bStatic Then
		SetAttrSingle("right", varRight)
		Return Me
	End If
	Dim pp As String = $"${ID}Right"$
	vue.SetStateSingle(pp, varRight)
	TimeLineItem.Bind(":right", pp)
	Return Me
End Sub

'set small
Sub SetSmall(varSmall As Boolean) As VMTimelineItem
	If varSmall = False Then Return Me
	If bStatic Then
		SetAttrSingle("small", varSmall)
		Return Me
	End If
	Dim pp As String = $"${ID}Small"$
	vue.SetStateSingle(pp, varSmall)
	TimeLineItem.Bind(":small", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMTimelineItem
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	TimeLineItem.Bind(":color", pp)
	Return Me
End Sub

'set icon
Sub SetIcon(varIcon As String) As VMTimelineItem
	If varIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("icon", varIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}Icon"$
	vue.SetStateSingle(pp, varIcon)
	TimeLineItem.Bind(":icon", pp)
	Return Me
End Sub

'set icon-color
Sub SetIconColor(varIconColor As String) As VMTimelineItem
	If varIconColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("icon-color", varIconColor)
		Return Me
	End If
	Dim pp As String = $"${ID}IconColor"$
	vue.SetStateSingle(pp, varIconColor)
	TimeLineItem.Bind(":icon-color", pp)
	Return Me
End Sub


'set color intensity
Sub SetIconColorIntensity(color As String, intensity As String) As VMTimelineItem
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("icon-color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	TimeLineItem.Bind(":icon-color", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMTimelineItem
	TimeLineItem.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMTimelineItem
	TimeLineItem.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMTimelineItem
	TimeLineItem.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMTimelineItem
	TimeLineItem.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMTimelineItem
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMTimelineItem
	TimeLineItem.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMTimelineItem
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMTimelineItem
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	TimeLineItem.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMTimelineItem
	TimeLineItem.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMTimelineItem
	TimeLineItem.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMTimelineItem
	TimeLineItem.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMTimelineItem
	TimeLineItem.SetDesignMode(b)
	Container.SetDesignMode(b)
	Avatar.SetDesignMode(b)
	Opposite.SetDesignMode(b)
	OppositeText.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMTimelineItem
	TimeLineItem.SetStatic(b)
	Container.SetStatic(b)
	Avatar.SetStatic(b)
	Opposite.SetStatic(b)
	OppositeText.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMTimelineItem
	TimeLineItem.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMTimelineItem
	TimeLineItem.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMTimelineItem
	TimeLineItem.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMTimelineItem
	TimeLineItem.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMTimelineItem
	TimeLineItem.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMTimelineItem
	TimeLineItem.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMTimelineItem
	TimeLineItem.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMTimelineItem
	TimeLineItem.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMTimelineItem
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMTimelineItem
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMTimelineItem
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMTimelineItem
	TimeLineItem.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMTimelineItem
	TimeLineItem.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMTimelineItem
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMTimelineItem
	TimeLineItem.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMTimelineItem
	TimeLineItem.SetText(comp)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMTimelineItem
	TimeLineItem.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMTimelineItem
	TimeLineItem.SetVisible(b)
	Return Me
End Sub

