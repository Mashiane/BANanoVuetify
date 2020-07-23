B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Menu As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private act As VMTemplate
	Private MenuContent As VMList
	Private bStatic As Boolean
	Private hasActivator As Boolean
End Sub

'initialize the Menu
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMMenu
	vue = v
	Module = eventHandler
	ID = sid.tolowercase
	Menu.Initialize(v, ID).SetTag("v-menu")
	MenuContent.Initialize(vue, $"${ID}items"$, Module)
	'
	act.Initialize(vue, "", Module)
	act.SetSlotActivatorOn
	
	SetOpenOnHover(True)
	SetOffsetY(True)
	hasActivator = False
	Return Me
End Sub


Sub SetVOnce(t As Boolean) As VMMenu
	Menu.setvonce(t)
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMMenu
	bStatic = b
	Menu.SetStatic(b)
	act.setstatic(b)
	MenuContent.SetStatic(b)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMMenu
	DesignMode = b
	Menu.SetDesignMode(b)
	act.SetDesignMode(b)
	MenuContent.SetDesignMode(b)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMMenu
	Menu.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMMenu
	Menu.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMMenu
	Menu.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMMenu
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub AddComponent(scomp As String) As VMMenu
	SetText(scomp)
	Return Me
End Sub

Sub SetSlideYTransition As VMMenu
	SetAttrSingle("transition", "slide-y-transition")
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMMenu
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMMenu
	Menu.SetAttrLoose(loose)
	Return Me
End Sub

'set the icon to activate the menu
Sub SetIcon(iconName As String) As VMMenu
	Dim btn As VMButton
	btn.Initialize(vue, $"${ID}button"$, Module)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetIconButton(iconName)
	btn.SetMenuTrigger(True)
	btn.Pop(act.Template)
	hasActivator = True
	Return Me
End Sub

'set the button to activate the menu
Sub SetButton(iconName As String, btnText As String) As VMMenu
	Dim btn As VMButton
	btn.Initialize(vue, $"${ID}button"$, Module)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.AddIcon(iconName,"left","")
	btn.SetLabel(btnText)
	btn.SetMenuTrigger(True)
	btn.SetTransparent(True)
	btn.Pop(act.Template)
	hasActivator = True
	Return Me
End Sub

Sub SetAvatar(url As String) As VMMenu
	Dim c6a As VMAvatar
	c6a.Initialize(vue, $"${ID}avatar"$, Module)
	c6a.SetStatic(bStatic)
	c6a.SetDesignMode(DesignMode)
	c6a.SetImage(url, "", Null, Null, Null)
	c6a.SetMenuTrigger(True)
	c6a.Pop(act.Template)
	hasActivator = True
	Return Me
End Sub


'add an item to the menu content
Sub AddItem(key As String, avatar As String, iconName As String, title As String, subtitle As String, actionIcon As String)
	MenuContent.AddItem(key, avatar, iconName, title, subtitle, actionIcon)
End Sub

Sub AddItem1(key As String, avatar As String, iconName As String, iconColor As String, title As String, subtitle As String, subtitle1 As String, actionIcon As String, actionIconColor As String)
	MenuContent.AddItem1(key, avatar, iconName, iconColor, title, subtitle, subtitle1, actionIcon, actionIconColor)
End Sub

Sub AddDivider1(bInset As Boolean) As VMMenu
	MenuContent.AddDivider1(bInset)
	Return Me
End Sub

Sub AddSubHeader1(hdr As String, bInset As Boolean) As VMMenu
	MenuContent.AddSubHeader1(hdr, bInset)
	Return Me
End Sub

'get component
Sub ToString As String	
	If hasActivator Then act.Pop(Menu)
	If MenuContent.HasContent Then MenuContent.Pop(Menu)
	Return Menu.ToString
End Sub

Sub SetVModel(k As String) As VMMenu
	Menu.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMMenu
	Menu.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMMenu
	Menu.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMMenu
	Dim childHTML As String = child.ToString
	Menu.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMMenu
	Menu.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMMenu
	Menu.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMMenu
	Menu.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMMenu
	Menu.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set absolute
Sub SetAbsolute(varAbsolute As Boolean) As VMMenu
	If varAbsolute = False Then Return Me
	If bStatic Then
		SetAttrSingle("absolute", varAbsolute)
		Return Me
	End If
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	Menu.Bind(":absolute", pp)
	Return Me
End Sub

'set activator
Sub SetActivator(varActivator As String) As VMMenu
	If varActivator = "" Then Return Me
	If bStatic Then
		SetAttrSingle("activator", varActivator)
		Return Me
	End If	
	Dim pp As String = $"${ID}Activator"$
	vue.SetStateSingle(pp, varActivator)
	Menu.Bind(":activator", pp)
	Return Me
End Sub

'set allow-overflow
Sub SetAllowOverflow(varAllowOverflow As Boolean) As VMMenu
	If varAllowOverflow = False Then Return Me
	If bStatic Then
		SetAttrSingle("allow-overflow", varAllowOverflow)
		Return Me
	End If
	Dim pp As String = $"${ID}AllowOverflow"$
	vue.SetStateSingle(pp, varAllowOverflow)
	Menu.Bind(":allow-overflow", pp)
	Return Me
End Sub

'set attach
Sub SetAttach(varAttach As Object) As VMMenu
	Dim pp As String = $"${ID}Attach"$
	vue.SetStateSingle(pp, varAttach)
	Menu.Bind(":attach", pp)
	Return Me
End Sub

'set auto
Sub SetAuto(varAuto As Boolean) As VMMenu
	If varAuto = False Then Return Me
	If bStatic Then
		SetAttrSingle("auto", varAuto)
		Return Me
	End If
	Dim pp As String = $"${ID}Auto"$
	vue.SetStateSingle(pp, varAuto)
	Menu.Bind(":auto", pp)
	Return Me
End Sub

'set bottom
Sub SetBottom(varBottom As Boolean) As VMMenu
	If varBottom = False Then Return Me
	If bStatic Then
		SetAttrSingle("bottom", varBottom)
		Return Me
	End If
	Dim pp As String = $"${ID}Bottom"$
	vue.SetStateSingle(pp, varBottom)
	Menu.Bind(":bottom", pp)
	Return Me
End Sub

'set close-delay
Sub SetCloseDelay(varCloseDelay As String) As VMMenu
	If varCloseDelay = "" Then Return Me
	If bStatic Then
		SetAttrSingle("close-delay", varCloseDelay)
		Return Me
	End If
	Dim pp As String = $"${ID}CloseDelay"$
	vue.SetStateSingle(pp, varCloseDelay)
	Menu.Bind(":close-delay", pp)
	Return Me
End Sub

'set close-on-click
Sub SetCloseOnClick(varCloseOnClick As Boolean) As VMMenu
	If varCloseOnClick Then Return Me
	If bStatic Then
		SetAttrSingle("close-on-click", varCloseOnClick)
		Return Me
	End If
	Dim pp As String = $"${ID}CloseOnClick"$
	vue.SetStateSingle(pp, varCloseOnClick)
	Menu.Bind(":close-on-click", pp)
	Return Me
End Sub

'set close-on-content-click
Sub SetCloseOnContentClick(varCloseOnContentClick As Boolean) As VMMenu
	If varCloseOnContentClick Then Return Me
	If bStatic Then
		SetAttrSingle("close-on-content-click", varCloseOnContentClick)
		Return Me
	End If
	Dim pp As String = $"${ID}CloseOnContentClick"$
	vue.SetStateSingle(pp, varCloseOnContentClick)
	Menu.Bind(":close-on-content-click", pp)
	Return Me
End Sub

'set content-class
Sub SetContentClass(varContentClass As String) As VMMenu
	If varContentClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("content-class", varContentClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ContentClass"$
	vue.SetStateSingle(pp, varContentClass)
	Menu.Bind(":content-class", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMMenu
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Menu.Bind(":dark", pp)
	Return Me
End Sub

'set disable-keys
Sub SetDisableKeys(varDisableKeys As Boolean) As VMMenu
	If varDisableKeys = False Then Return Me
	If bStatic Then
		SetAttrSingle("disable-keys", varDisableKeys)
		Return Me
	End If
	Dim pp As String = $"${ID}DisableKeys"$
	vue.SetStateSingle(pp, varDisableKeys)
	Menu.Bind(":disable-keys", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMMenu
	Menu.SetDisabled(varDisabled)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Boolean) As VMMenu
	If varEager = False Then Return Me
	If bStatic Then
		SetAttrSingle("eager", varEager)
		Return Me
	End If
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	Menu.Bind(":eager", pp)
	Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Boolean) As VMMenu
	If varFixed = False Then Return Me
	If bStatic Then
		SetAttrSingle("fixed", varFixed)
		Return Me
	End If
	Dim pp As String = $"${ID}Fixed"$
	vue.SetStateSingle(pp, varFixed)
	Menu.Bind(":fixed", pp)
	Return Me
End Sub

'set internal-activator
Sub SetInternalActivator(varInternalActivator As Boolean) As VMMenu
	If varInternalActivator = False Then Return Me
	If bStatic Then
		SetAttrSingle("internal-activator", varInternalActivator)
		Return Me
	End If
	Dim pp As String = $"${ID}InternalActivator"$
	vue.SetStateSingle(pp, varInternalActivator)
	Menu.Bind(":internal-activator", pp)
	Return Me
End Sub

'set left
Sub SetLeft(varLeft As Boolean) As VMMenu
	If varLeft = False Then Return Me
	If bStatic Then
		SetAttrSingle("left", varLeft)
		Return Me
	End If
	Dim pp As String = $"${ID}Left"$
	vue.SetStateSingle(pp, varLeft)
	Menu.Bind(":left", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMMenu
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Menu.Bind(":light", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As String) As VMMenu
	If varMaxHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-height", varMaxHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	Menu.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As String) As VMMenu
	If varMaxWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-width", varMaxWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Menu.Bind(":max-width", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As String) As VMMenu
	If varMinWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-width", varMinWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	Menu.Bind(":min-width", pp)
	Return Me
End Sub

'set nudge-bottom
Sub SetNudgeBottom(varNudgeBottom As String) As VMMenu
	If varNudgeBottom = "" Then Return Me
	If bStatic Then
		SetAttrSingle("nudge-bottom", varNudgeBottom)
		Return Me
	End If
	Dim pp As String = $"${ID}NudgeBottom"$
	vue.SetStateSingle(pp, varNudgeBottom)
	Menu.Bind(":nudge-bottom", pp)
	Return Me
End Sub

'set nudge-left
Sub SetNudgeLeft(varNudgeLeft As String) As VMMenu
	If varNudgeLeft = "" Then Return Me
	If bStatic Then
		SetAttrSingle("nudge-left", varNudgeLeft)
		Return Me
	End If
	Dim pp As String = $"${ID}NudgeLeft"$
	vue.SetStateSingle(pp, varNudgeLeft)
	Menu.Bind(":nudge-left", pp)
	Return Me
End Sub

'set nudge-right
Sub SetNudgeRight(varNudgeRight As String) As VMMenu
	If varNudgeRight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("nudge-right", varNudgeRight)
		Return Me
	End If
	Dim pp As String = $"${ID}NudgeRight"$
	vue.SetStateSingle(pp, varNudgeRight)
	Menu.Bind(":nudge-right", pp)
	Return Me
End Sub

'set nudge-top
Sub SetNudgeTop(varNudgeTop As String) As VMMenu
	If varNudgeTop = "" Then Return Me
	If bStatic Then
		SetAttrSingle("nudge-top", varNudgeTop)
		Return Me
	End If
	Dim pp As String = $"${ID}NudgeTop"$
	vue.SetStateSingle(pp, varNudgeTop)
	Menu.Bind(":nudge-top", pp)
	Return Me
End Sub

'set nudge-width
Sub SetNudgeWidth(varNudgeWidth As String) As VMMenu
	If varNudgeWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("nudge-width", varNudgeWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}NudgeWidth"$
	vue.SetStateSingle(pp, varNudgeWidth)
	Menu.Bind(":nudge-width", pp)
	Return Me
End Sub

'set offset-overflow
Sub SetOffsetOverflow(varOffsetOverflow As Boolean) As VMMenu
	If varOffsetOverflow = False Then Return Me
	If bStatic Then
		SetAttrSingle("offset-overflow", varOffsetOverflow)
		Return Me
	End If
	Dim pp As String = $"${ID}OffsetOverflow"$
	vue.SetStateSingle(pp, varOffsetOverflow)
	Menu.Bind(":offset-overflow", pp)
	Return Me
End Sub

'set offset-x
Sub SetOffsetX(varOffsetX As Boolean) As VMMenu
	If varOffsetX = False Then Return Me
	If bStatic Then
		SetAttrSingle("offset-x", varOffsetX)
		Return Me
	End If
	Dim pp As String = $"${ID}OffsetX"$
	vue.SetStateSingle(pp, varOffsetX)
	Menu.Bind(":offset-x", pp)
	Return Me
End Sub

'set offset-y
Sub SetOffsetY(varOffsetY As Boolean) As VMMenu
	If varOffsetY = False Then 
		RemoveAttr("offset-y")
		RemoveAttr(":offset-y")
		Return Me
	End If
	If bStatic Then
		SetAttrSingle("offset-y", varOffsetY)
		Return Me
	End If
	Dim pp As String = $"${ID}OffsetY"$
	vue.SetStateSingle(pp, varOffsetY)
	Menu.Bind(":offset-y", pp)
	Return Me
End Sub

'set open-delay
Sub SetOpenDelay(varOpenDelay As String) As VMMenu
	If varOpenDelay = "" Then Return Me
	If bStatic Then
		SetAttrSingle("open-delay", varOpenDelay)
		Return Me
	End If
	Dim pp As String = $"${ID}OpenDelay"$
	vue.SetStateSingle(pp, varOpenDelay)
	Menu.Bind(":open-delay", pp)
	Return Me
End Sub

'set open-on-click
Sub SetOpenOnClick(varOpenOnClick As Boolean) As VMMenu
	If varOpenOnClick Then Return Me
	If bStatic Then
		SetAttrSingle("open-on-click", varOpenOnClick)
		Return Me
	End If
	Dim pp As String = $"${ID}OpenOnClick"$
	vue.SetStateSingle(pp, varOpenOnClick)
	Menu.Bind(":open-on-click", pp)
	Return Me
End Sub

'set open-on-hover
Sub SetOpenOnHover(varOpenOnHover As Boolean) As VMMenu
	If varOpenOnHover = False Then
		RemoveAttr("open-on-hover")
		RemoveAttr(":open-on-hover")
		Return Me
	End If
	If bStatic Then
		SetAttrSingle("", varOpenOnHover)
		Return Me
	End If
	Dim pp As String = $"${ID}OpenOnHover"$
	vue.SetStateSingle(pp, varOpenOnHover)
	Menu.Bind(":open-on-hover", pp)
	Return Me
End Sub

'set origin
Sub SetOrigin(varOrigin As String) As VMMenu
	If varOrigin = "" Then Return Me
	If bStatic Then
		SetAttrSingle("origin", varOrigin)
		Return Me
	End If
	Dim pp As String = $"${ID}Origin"$
	vue.SetStateSingle(pp, varOrigin)
	Menu.Bind(":origin", pp)
	Return Me
End Sub

'set position-x
Sub SetPositionX(varPositionX As String) As VMMenu
	If varPositionX = "" Then Return Me
	If bStatic Then
		SetAttrSingle("position-x", varPositionX)
		Return Me
	End If
	Dim pp As String = $"${ID}PositionX"$
	vue.SetStateSingle(pp, varPositionX)
	Menu.Bind(":position-x", pp)
	Return Me
End Sub

'set position-y
Sub SetPositionY(varPositionY As String) As VMMenu
	If varPositionY = "" Then Return Me
	If bStatic Then
		SetAttrSingle("position-y", varPositionY)
		Return Me
	End If
	Dim pp As String = $"${ID}PositionY"$
	vue.SetStateSingle(pp, varPositionY)
	Menu.Bind(":position-y", pp)
	Return Me
End Sub

'set return-value
Sub SetReturnValue(varReturnValue As String) As VMMenu
	If varReturnValue = "" Then Return Me
	Menu.Bind("return-value", varReturnValue)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Boolean) As VMMenu
	If varRight = False Then Return Me
	If bStatic Then
		SetAttrSingle("right", varRight)
		Return Me
	End If
	Dim pp As String = $"${ID}Right"$
	vue.SetStateSingle(pp, varRight)
	Menu.Bind(":right", pp)
	Return Me
End Sub

'set top
Sub SetTop(varTop As Boolean) As VMMenu
	If varTop = False Then Return Me
	If bStatic Then
		SetAttrSingle("top", varTop)
		Return Me
	End If
	Dim pp As String = $"${ID}Top"$
	vue.SetStateSingle(pp, varTop)
	Menu.Bind(":top", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As String) As VMMenu
	If varTransition = "" Then Return Me
	If bStatic Then
		SetAttrSingle("transition", varTransition)
		Return Me
	End If
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	Menu.Bind(":transition", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Boolean) As VMMenu
	Menu.SetValue(varValue,False)
	Return Me
End Sub

'set z-index
Sub SetZIndex(varZIndex As String) As VMMenu
	If varZIndex = "" Then Return Me
	If bStatic Then
		SetAttrSingle("z-index", varZIndex)
		Return Me
	End If
	Dim pp As String = $"${ID}ZIndex"$
	vue.SetStateSingle(pp, varZIndex)
	Menu.Bind(":z-index", pp)
	Return Me
End Sub

'
Sub SetSlotActivator(b As Boolean) As VMMenu    'ignore
	SetAttr(CreateMap("slot": "activator"))
	Return Me
End Sub


Sub Hide As VMMenu
	Menu.SetVisible(False)
	Return Me
End Sub

Sub Show As VMMenu
	Menu.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMMenu
	Menu.Enable(True)
	Return Me
End Sub

Sub Disable As VMMenu
	Menu.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMMenu
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMMenu
	Menu.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMMenu
	Menu.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMMenu
	Menu.setmarginall(p)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMMenu
	Menu.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMMenu
	Menu.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMMenu
	Menu.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMMenu
	Menu.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMMenu
	Menu.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMMenu
	Menu.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMMenu
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMMenu
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub