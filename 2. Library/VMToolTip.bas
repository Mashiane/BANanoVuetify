B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ToolTip As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object    'ignore
	Private bStatic As Boolean
End Sub

'initialize the ToolTip
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMToolTip
	ID = sid.tolowercase
	ToolTip.Initialize(v, ID)
	ToolTip.SetTag("v-tooltip")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMToolTip
	bStatic = b
	ToolTip.SetStatic(b)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMToolTip
	ToolTip.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMToolTip
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return ToolTip.ToString
End Sub

Sub SetVModel(k As String) As VMToolTip
	ToolTip.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMToolTip
	ToolTip.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMToolTip
	ToolTip.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMToolTip
	Dim childHTML As String = child.ToString
	ToolTip.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMToolTip
	ToolTip.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMToolTip
	ToolTip.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMToolTip
	ToolTip.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMToolTip
	ToolTip.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set absolute
Sub SetAbsolute(varAbsolute As Boolean) As VMToolTip
	If varAbsolute = False Then Return Me
	If bStatic Then
		SetAttrSingle("absolute", varAbsolute)
		Return Me
	End If
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	ToolTip.Bind(":absolute", pp)
	Return Me
End Sub

'set activator
Sub SetActivator(varActivator As String) As VMToolTip
	If varActivator = "" Then Return Me
	If bStatic Then
		SetAttrSingle("activator", varActivator)
		Return Me
	End If
	Dim pp As String = $"${ID}Activator"$
	vue.SetStateSingle(pp, varActivator)
	ToolTip.Bind(":activator", pp)
	Return Me
End Sub

'set allow-overflow
Sub SetAllowOverflow(varAllowOverflow As Boolean) As VMToolTip
	If varAllowOverflow = False Then Return Me
	If bStatic Then
		SetAttrSingle("allow-overflow", varAllowOverflow)
		Return Me
	End If
	Dim pp As String = $"${ID}AllowOverflow"$
	vue.SetStateSingle(pp, varAllowOverflow)
	ToolTip.Bind(":allow-overflow", pp)
	Return Me
End Sub

'set attach
Sub SetAttach(varAttach As Boolean) As VMToolTip
	If varAttach = False Then Return Me
	If bStatic Then
		SetAttrSingle("attach", varAttach)
		Return Me
	End If
	Dim pp As String = $"${ID}Attach"$
	vue.SetStateSingle(pp, varAttach)
	ToolTip.Bind(":attach", pp)
	Return Me
End Sub

'set bottom
Sub SetBottom(varBottom As Boolean) As VMToolTip
	If varBottom = False Then Return Me
	If bStatic Then
		SetAttrSingle("bottom", varBottom)
		Return Me
	End If
	Dim pp As String = $"${ID}Bottom"$
	vue.SetStateSingle(pp, varBottom)
	ToolTip.Bind(":bottom", pp)
	Return Me
End Sub

'set close-delay
Sub SetCloseDelay(varCloseDelay As Int) As VMToolTip
	If bStatic Then
		SetAttrSingle("close-delay", varCloseDelay)
		Return Me
	End If
	Dim pp As String = $"${ID}CloseDelay"$
	vue.SetStateSingle(pp, varCloseDelay)
	ToolTip.Bind(":close-delay", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMToolTip
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ToolTip.Bind(":color", pp)
	Return Me
End Sub

'set content-class
Sub SetContentClass(varContentClass As String) As VMToolTip
	If varContentClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("content-class", varContentClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ContentClass"$
	vue.SetStateSingle(pp, varContentClass)
	ToolTip.Bind(":content-class", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMToolTip
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ToolTip.Bind(":dark", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMToolTip
	ToolTip.SetDisabled(varDisabled)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Boolean) As VMToolTip
	If varEager = False Then Return Me
	If bStatic Then
		SetAttrSingle("eager", varEager)
		Return Me
	End If
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	ToolTip.Bind(":eager", pp)
	Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Boolean) As VMToolTip
	If varFixed = False Then Return Me
	If bStatic Then
		SetAttrSingle("fixed", varFixed)
		Return Me
	End If
	Dim pp As String = $"${ID}Fixed"$
	vue.SetStateSingle(pp, varFixed)
	ToolTip.Bind(":fixed", pp)
	Return Me
End Sub

'set internal-activator
Sub SetInternalActivator(varInternalActivator As Boolean) As VMToolTip
	If varInternalActivator = False Then Return Me
	If bStatic Then
		SetAttrSingle("internal-activator", varInternalActivator)
		Return Me
	End If
	Dim pp As String = $"${ID}InternalActivator"$
	vue.SetStateSingle(pp, varInternalActivator)
	ToolTip.Bind(":internal-activator", pp)
	Return Me
End Sub

'set left
Sub SetLeft(varLeft As Boolean) As VMToolTip
	If varLeft = False Then Return Me
	If bStatic Then
		SetAttrSingle("left", varLeft)
		Return Me
	End If
	Dim pp As String = $"${ID}Left"$
	vue.SetStateSingle(pp, varLeft)
	ToolTip.Bind(":left", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMToolTip
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ToolTip.Bind(":light", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As String) As VMToolTip
	If varMaxWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-width", varMaxWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	ToolTip.Bind(":max-width", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As String) As VMToolTip
	If varMinWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-width", varMinWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	ToolTip.Bind(":min-width", pp)
	Return Me
End Sub

'set nudge-bottom
Sub SetNudgeBottom(varNudgeBottom As String) As VMToolTip
	If varNudgeBottom = "" Then Return Me
	If bStatic Then
		SetAttrSingle("nudge-bottom", varNudgeBottom)
		Return Me
	End If
	Dim pp As String = $"${ID}NudgeBottom"$
	vue.SetStateSingle(pp, varNudgeBottom)
	ToolTip.Bind(":nudge-bottom", pp)
	Return Me
End Sub

'set nudge-left
Sub SetNudgeLeft(varNudgeLeft As String) As VMToolTip
	If varNudgeLeft = "" Then Return Me
	If bStatic Then
		SetAttrSingle("nudge-left", varNudgeLeft)
		Return Me
	End If
	Dim pp As String = $"${ID}NudgeLeft"$
	vue.SetStateSingle(pp, varNudgeLeft)
	ToolTip.Bind(":nudge-left", pp)
	Return Me
End Sub

'set nudge-right
Sub SetNudgeRight(varNudgeRight As String) As VMToolTip
	If varNudgeRight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("nudge-right", varNudgeRight)
		Return Me
	End If
	Dim pp As String = $"${ID}NudgeRight"$
	vue.SetStateSingle(pp, varNudgeRight)
	ToolTip.Bind(":nudge-right", pp)
	Return Me
End Sub

'set nudge-top
Sub SetNudgeTop(varNudgeTop As String) As VMToolTip
	If varNudgeTop = "" Then Return Me
	If bStatic Then
		SetAttrSingle("nudge-top", varNudgeTop)
		Return Me
	End If
	Dim pp As String = $"${ID}NudgeTop"$
	vue.SetStateSingle(pp, varNudgeTop)
	ToolTip.Bind(":nudge-top", pp)
	Return Me
End Sub

'set nudge-width
Sub SetNudgeWidth(varNudgeWidth As String) As VMToolTip
	If varNudgeWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("nudge-width", varNudgeWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}NudgeWidth"$
	vue.SetStateSingle(pp, varNudgeWidth)
	ToolTip.Bind(":nudge-width", pp)
	Return Me
End Sub

'set offset-overflow
Sub SetOffsetOverflow(varOffsetOverflow As Boolean) As VMToolTip
	If varOffsetOverflow = False Then Return Me
	If bStatic Then
		SetAttrSingle("offset-overflow", varOffsetOverflow)
		Return Me
	End If
	Dim pp As String = $"${ID}OffsetOverflow"$
	vue.SetStateSingle(pp, varOffsetOverflow)
	ToolTip.Bind(":offset-overflow", pp)
	Return Me
End Sub

'set open-delay
Sub SetOpenDelay(varOpenDelay As String) As VMToolTip
	If varOpenDelay = "" Then Return Me
	If bStatic Then
		SetAttrSingle("open-delay", varOpenDelay)
		Return Me
	End If
	Dim pp As String = $"${ID}OpenDelay"$
	vue.SetStateSingle(pp, varOpenDelay)
	ToolTip.Bind(":open-delay", pp)
	Return Me
End Sub

'set open-on-click
Sub SetOpenOnClick(varOpenOnClick As Boolean) As VMToolTip
	If varOpenOnClick = False Then Return Me
	If bStatic Then
		SetAttrSingle("open-on-click", varOpenOnClick)
		Return Me
	End If
	Dim pp As String = $"${ID}OpenOnClick"$
	vue.SetStateSingle(pp, varOpenOnClick)
	ToolTip.Bind(":open-on-click", pp)
	Return Me
End Sub

'set open-on-hover
Sub SetOpenOnHover(varOpenOnHover As Boolean) As VMToolTip
	If varOpenOnHover = False Then Return Me
	If bStatic Then
		SetAttrSingle("open-on-hover", varOpenOnHover)
		Return Me
	End If
	Dim pp As String = $"${ID}OpenOnHover"$
	vue.SetStateSingle(pp, varOpenOnHover)
	ToolTip.Bind(":open-on-hover", pp)
	Return Me
End Sub

'set position-x
Sub SetPositionX(varPositionX As Int) As VMToolTip
	If bStatic Then
		SetAttrSingle("position-x", varPositionX)
		Return Me
	End If
	Dim pp As String = $"${ID}PositionX"$
	vue.SetStateSingle(pp, varPositionX)
	ToolTip.Bind(":position-x", pp)
	Return Me
End Sub

'set position-y
Sub SetPositionY(varPositionY As Int) As VMToolTip
	If bStatic Then
		SetAttrSingle("position-y", varPositionY)
		Return Me
	End If
	Dim pp As String = $"${ID}PositionY"$
	vue.SetStateSingle(pp, varPositionY)
	ToolTip.Bind(":position-y", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Boolean) As VMToolTip
	If varRight = False Then Return Me
	If bStatic Then
		SetAttrSingle("right", varRight)
		Return Me
	End If
	Dim pp As String = $"${ID}Right"$
	vue.SetStateSingle(pp, varRight)
	ToolTip.Bind(":right", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMToolTip
	If varTag = "" Then Return Me
	If bStatic Then
		SetAttrSingle("tag", varTag)
		Return Me
	End If
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	ToolTip.Bind(":tag", pp)
	Return Me
End Sub

'set top
Sub SetTop(varTop As Boolean) As VMToolTip
	If varTop = False Then Return Me
	If bStatic Then
		SetAttrSingle("top", varTop)
		Return Me
	End If
	Dim pp As String = $"${ID}Top"$
	vue.SetStateSingle(pp, varTop)
	ToolTip.Bind(":top", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As String) As VMToolTip
	If varTransition = "" Then Return Me
	If bStatic Then
		SetAttrSingle("transition", varTransition)
		Return Me
	End If
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	ToolTip.Bind(":transition", pp)
	Return Me
End Sub

'set value, visible / not visible
Sub SetValue(varValue As String) As VMToolTip
	ToolTip.SetValue(varValue, False)
	Return Me
End Sub

'set z-index
Sub SetZIndex(varZIndex As String) As VMToolTip
	If varZIndex = "" Then Return Me
	If bStatic Then
		SetAttrSingle("z-index", varZIndex)
		Return Me
	End If
	Dim pp As String = $"${ID}ZIndex"$
	vue.SetStateSingle(pp, varZIndex)
	ToolTip.Bind(":z-index", pp)
	Return Me
End Sub

'
Sub SetSlotActivator(b As Boolean) As VMToolTip    'ignore
	SetAttr(CreateMap("slot": "activator"))
	Return Me
End Sub


Sub Hide As VMToolTip
	ToolTip.SetVisible(False)
	Return Me
End Sub

Sub Show As VMToolTip
	ToolTip.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMToolTip
	ToolTip.Enable(True)
	Return Me
End Sub

Sub Disable As VMToolTip
	ToolTip.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMToolTip
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMToolTip
	ToolTip.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMToolTip
	ToolTip.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMToolTip
	ToolTip.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMToolTip
	ToolTip.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMToolTip
	ToolTip.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMToolTip
	ToolTip.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMToolTip
	ToolTip.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMToolTip
	ToolTip.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMToolTip
	ToolTip.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMToolTip
	ToolTip.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMToolTip
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMToolTip
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub