B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public SpeedDial As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private Slot As VMTemplate
	Public Button As VMButton
	Public InitialIcon As VMIcon
	Public FinalIcon As VMIcon
	Private items As List
	Private bStatic As Boolean
	Private hasInitial As Boolean
	Private hasFinal As Boolean
End Sub

'initialize the SpeedDial
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSpeedDial
	ID = sid.tolowercase
	SpeedDial.Initialize(v, ID)
	SpeedDial.SetTag("v-speed-dial").SetVModel(ID)
	DesignMode = False
	Module = eventHandler
	vue = v
	Slot.Initialize(vue, $"${ID}slot"$, Module)
	Button.Initialize(vue, $"${ID}btn"$, Module).SetVModel(ID)
	InitialIcon.Initialize(vue, $"${ID}initial"$, Module).SetAttrLoose("v-else")
	FinalIcon.Initialize(vue,$"${ID}finalicon"$, Module).SetVIf(ID)
	vue.SetData(ID, False)
	items.Initialize
	bStatic = False
	hasInitial = False
	hasFinal = False
	Return Me
End Sub


Sub SetVOnce(t As Boolean) As VMSpeedDial
	SpeedDial.setvonce(t)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMSpeedDial
	Button.SetOnClick(methodName)
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMSpeedDial
	bStatic = b
	SpeedDial.SetStatic(b)
	Slot.SetStatic(b)
	Button.SetStatic(b)
	InitialIcon.SetStatic(b)
	FinalIcon.SetStatic(b)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSpeedDial
	SpeedDial.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSpeedDial
	SpeedDial.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSpeedDial
	SpeedDial.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSpeedDial
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMSpeedDial
	SpeedDial.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSpeedDial
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub AddItem(key As String, iconName As String, color As String) As VMSpeedDial
	Dim btn As VMButton
	btn.Initialize(vue, key, Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetFab(True).SetDark(True).SetSmall(True)
	btn.SetColor(color)
	'
	Dim icn As VMIcon
	icn.Initialize(vue, $"${key}icon"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetText(iconName)
	btn.AddComponent(icn.ToString)
	'
	items.Add(btn.ToString)
	Return Me 
End Sub

Sub SetInitialIcon(iconName As String) As VMSpeedDial
	If iconName = "" Then Return Me
	InitialIcon.SetText(iconName)
	hasInitial = True
	Return Me
End Sub


Sub SetFinalIcon(iconName As String) As VMSpeedDial
	If iconName = "" Then Return Me
	FinalIcon.SetText(iconName)
	hasFinal = True
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMSpeedDial
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMSpeedDial
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		Button.SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Button.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMSpeedDial
	If varDark = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Button.Bind(":dark", pp)
	Return Me
End Sub

'set large
Sub SetLarge(varLarge As Boolean) As VMSpeedDial
	If varLarge = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("large", varLarge)
		Return Me
	End If
	Dim pp As String = $"${ID}Large"$
	vue.SetStateSingle(pp, varLarge)
	Button.Bind(":large", pp)
	Return Me
End Sub

'get component
Sub ToString As String
	Slot.SetSlotActivator
	Button.SetFab(True)
	If hasFinal Then FinalIcon.Pop(Button.Button)
	If hasInitial Then InitialIcon.Pop(Button.Button)
	Button.Pop(Slot.Template)
	Slot.Pop(SpeedDial)
	For Each item As String In items
		SpeedDial.SetText(item)
	Next
	Return SpeedDial.ToString
End Sub

Sub SetVModel(k As String) As VMSpeedDial
	SpeedDial.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMSpeedDial
	SpeedDial.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMSpeedDial
	SpeedDial.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSpeedDial
	Dim childHTML As String = child.ToString
	SpeedDial.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSpeedDial
	SpeedDial.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSpeedDial
	SpeedDial.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSpeedDial
	SpeedDial.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSpeedDial
	SpeedDial.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set absolute
Sub SetAbsolute(varAbsolute As Boolean) As VMSpeedDial
	If varAbsolute = False Then Return Me
	If bStatic Then
		SetAttrSingle("absolute", varAbsolute)
		Return Me
	End If
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	SpeedDial.Bind(":absolute", pp)
	Return Me
End Sub

'set bottom
Sub SetBottom(varBottom As Boolean) As VMSpeedDial
	If varBottom = False Then Return Me
	If bStatic Then
		SetAttrSingle("bottom", varBottom)
		Return Me
	End If
	Dim pp As String = $"${ID}Bottom"$
	vue.SetStateSingle(pp, varBottom)
	SpeedDial.Bind(":bottom", pp)
	Return Me
End Sub

'set direction
Sub SetDirection(varDirection As String) As VMSpeedDial
	If varDirection = "" Then Return Me
	If bStatic Then
		SetAttrSingle("direction", varDirection)
		Return Me
	End If
	Dim pp As String = $"${ID}Direction"$
	vue.SetStateSingle(pp, varDirection)
	SpeedDial.Bind(":direction", pp)
	Return Me
End Sub

'set small
Sub SetSmall(varSmall As Boolean) As VMSpeedDial
	If varSmall = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("small", varSmall)
		Return Me
	End If
	Dim pp As String = $"${ID}Small"$
	vue.SetStateSingle(pp, varSmall)
	Button.Bind(":small", pp)
	Return Me
End Sub

'set x-large
Sub SetXLarge(varXLarge As Boolean) As VMSpeedDial
	If varXLarge = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("x-large", varXLarge)
		Return Me
	End If
	Dim pp As String = $"${ID}XLarge"$
	vue.SetStateSingle(pp, varXLarge)
	Button.Bind(":x-large", pp)
	Return Me
End Sub

'set x-small
Sub SetXSmall(varXSmall As Boolean) As VMSpeedDial
	If varXSmall = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("x-small", varXSmall)
		Return Me
	End If
	Dim pp As String = $"${ID}XSmall"$
	vue.SetStateSingle(pp, varXSmall)
	Button.Bind(":x-small", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As String) As VMSpeedDial
	If varHref = "" Then Return Me
	If bStatic Then
		Button.SetAttrSingle("href", varHref)
		Return Me
	End If
	Dim pp As String = $"${ID}Href"$
	vue.SetStateSingle(pp, varHref)
	Button.Bind(":href", pp)
	Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Boolean) As VMSpeedDial
	If varFixed = False Then Return Me
	If bStatic Then
		SetAttrSingle("fixed", varFixed)
		Return Me
	End If
	Dim pp As String = $"${ID}Fixed"$
	vue.SetStateSingle(pp, varFixed)
	SpeedDial.Bind(":fixed", pp)
	Return Me
End Sub

'set target
Sub SetTarget(varTarget As String) As VMSpeedDial
	If varTarget = "" Then Return Me
	If bStatic Then
		Button.SetAttrSingle("target", varTarget)
		Return Me
	End If
	Dim pp As String = $"${ID}Target"$
	vue.SetStateSingle(pp, varTarget)
	Button.Bind(":target", pp)
	Return Me
End Sub

'set to
Sub SetTo(varTo As String) As VMSpeedDial
	If varTo = "" Then Return Me
	If bStatic Then
		Button.SetAttrSingle("to", varTo)
		Return Me
	End If
	Dim pp As String = $"${ID}To"$
	vue.SetStateSingle(pp, varTo)
	Button.Bind(":to", pp)
	Return Me
End Sub

'set left
Sub SetLeft(varLeft As Boolean) As VMSpeedDial
	If varLeft = False Then Return Me
	If bStatic Then
		SetAttrSingle("left", varLeft)
		Return Me
	End If
	Dim pp As String = $"${ID}Left"$
	vue.SetStateSingle(pp, varLeft)
	SpeedDial.Bind(":left", pp)
	Return Me
End Sub

'set mode
Sub SetMode(varMode As String) As VMSpeedDial
	If varMode = "" Then Return Me
	If bStatic Then
		SetAttrSingle("mode", varMode)
		Return Me
	End If
	Dim pp As String = $"${ID}Mode"$
	vue.SetStateSingle(pp, varMode)
	SpeedDial.Bind(":mode", pp)
	Return Me
End Sub

'set open-on-hove
Sub SetOpenOnHover(varOpenOnHover As Boolean) As VMSpeedDial
	If varOpenOnHover = False Then Return Me
	If bStatic Then
		SetAttrSingle("open-on-hover", varOpenOnHover)
		Return Me
	End If
	Dim pp As String = $"${ID}OpenOnHover"$
	vue.SetStateSingle(pp, varOpenOnHover)
	SpeedDial.Bind(":open-on-hover", pp)
	Return Me
End Sub

'set origin
Sub SetOrigin(varOrigin As String) As VMSpeedDial
	If varOrigin = "" Then Return Me
	If bStatic Then
		SetAttrSingle("origin", varOrigin)
		Return Me
	End If
	Dim pp As String = $"${ID}Origin"$
	vue.SetStateSingle(pp, varOrigin)
	SpeedDial.Bind(":origin", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Boolean) As VMSpeedDial
	If varRight = False Then Return Me
	If bStatic Then
		SetAttrSingle("right", varRight)
		Return Me
	End If
	Dim pp As String = $"${ID}Right"$
	vue.SetStateSingle(pp, varRight)
	SpeedDial.Bind(":right", pp)
	Return Me
End Sub

'set top
Sub SetTop(varTop As Boolean) As VMSpeedDial
	If varTop = False Then Return Me
	If bStatic Then
		SetAttrSingle("top", varTop)
		Return Me
	End If
	Dim pp As String = $"${ID}Top"$
	vue.SetStateSingle(pp, varTop)
	SpeedDial.Bind(":top", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As String) As VMSpeedDial
	If varTransition = "" Then Return Me
	If bStatic Then
		SetAttrSingle("transition", varTransition)
		Return Me
	End If
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	SpeedDial.Bind(":transition", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMSpeedDial
	SpeedDial.SetValue(varValue, False)
	Return Me
End Sub

'
Sub SetSlotActivator(b As Boolean) As VMSpeedDial    'ignore
	SetAttr(CreateMap("slot": "activator"))
	Return Me
End Sub


Sub Hide As VMSpeedDial
	vue.SetStateSingle(ID, False)
	Return Me
End Sub

Sub Show As VMSpeedDial
	vue.SetStateSingle(ID, True)
	Return Me
End Sub

Sub Enable As VMSpeedDial
	SpeedDial.Enable(True)
	Return Me
End Sub

Sub Disable As VMSpeedDial
	SpeedDial.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSpeedDial
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMSpeedDial
	SpeedDial.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSpeedDial
	SpeedDial.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMSpeedDial
	SpeedDial.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMSpeedDial
	SpeedDial.SetDesignMode(b)
	DesignMode = b
	Slot.SetDesignMode(b)
	Button.SetDesignMode(b)
	InitialIcon.SetDesignMode(b)
	FinalIcon.SetDesignMode(b)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMSpeedDial
	SpeedDial.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSpeedDial
	SpeedDial.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMSpeedDial
	SpeedDial.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMSpeedDial
	SpeedDial.SetAttrSingle(prop, value)
	Return Me
End Sub

'make the button to be a floating action button
Sub SetIcon(iconName As String) As VMSpeedDial
	If iconName = "" Then Return Me
	Dim icon As VMIcon
	icon.Initialize(vue, $"${ID}icon"$, Module)
	icon.SetStatic(bStatic)
	icon.SetDesignMode(DesignMode)
	icon.SetText(iconName)
	Button.AddComponent(icon.ToString)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSpeedDial
SpeedDial.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMSpeedDial
	vue.SetData(ID, b)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColor(textcolor As String) As VMSpeedDial
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Button.AddClass(sColor)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColorIntensity(textcolor As String, textcolorintensity As String) As VMSpeedDial
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Dim sIntensity As String = $"text--${textcolorintensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	Button.AddClass(mcolor)
	Return Me
End Sub
