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
End Sub

'initialize the SpeedDial
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSpeedDial
	ID = sid.tolowercase
	SpeedDial.Initialize(v, ID)
	SpeedDial.SetTag("v-speed-dial").SetVModel(ID)
	DesignMode = False
	Module = eventHandler
	vue = v
	Slot.Initialize(vue, "", Module).SetSlotActivator
	Button.Initialize(vue, $"${ID}btn"$, Module).SetVModel(ID).SetFab(True).SetDark(True)
	InitialIcon.Initialize(vue, $"${ID}initial"$, Module).SetAttrLoose("v-else")
	FinalIcon.Initialize(vue,$"${ID}finalicon"$, Module).SetVIf(ID)
	Hide
	SetAbsolute(True)
	SetRight(True)
	SetBottom(True)
	items.Initialize
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
	btn.Initialize(vue, key, Module).SetFab(True).SetDark(True).SetSmall(True)
	btn.SetColor(color)
	'
	Dim icn As VMIcon
	icn.Initialize(vue, $"${key}icon"$, Module).SetText(iconName)
	btn.AddComponent(icn.ToString)
	'
	items.Add(btn.ToString)
	Return Me 
End Sub

Sub SetInitialIcon(iconName As String) As VMSpeedDial
	InitialIcon.SetText(iconName)
	Return Me
End Sub


Sub SetFinalIcon(iconName As String) As VMSpeedDial
	FinalIcon.SetText(iconName)
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
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMSpeedDial
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	SpeedDial.Bind(":color", pp)
	Return Me
End Sub

'get component
Sub ToString As String
	FinalIcon.Pop(Button.Button)
	InitialIcon.Pop(Button.Button)
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

Sub SetVIf(vif As Object) As VMSpeedDial
	SpeedDial.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSpeedDial
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
Sub SetAbsolute(varAbsolute As Object) As VMSpeedDial
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	SpeedDial.Bind(":absolute", pp)
	Return Me
End Sub

'set bottom
Sub SetBottom(varBottom As Object) As VMSpeedDial
	Dim pp As String = $"${ID}Bottom"$
	vue.SetStateSingle(pp, varBottom)
	SpeedDial.Bind(":bottom", pp)
	Return Me
End Sub

'set direction
Sub SetDirection(varDirection As Object) As VMSpeedDial
	Dim pp As String = $"${ID}Direction"$
	vue.SetStateSingle(pp, varDirection)
	SpeedDial.Bind(":direction", pp)
	Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Object) As VMSpeedDial
	Dim pp As String = $"${ID}Fixed"$
	vue.SetStateSingle(pp, varFixed)
	SpeedDial.Bind(":fixed", pp)
	Return Me
End Sub

'set left
Sub SetLeft(varLeft As Object) As VMSpeedDial
	Dim pp As String = $"${ID}Left"$
	vue.SetStateSingle(pp, varLeft)
	SpeedDial.Bind(":left", pp)
	Return Me
End Sub

'set mode
Sub SetMode(varMode As Object) As VMSpeedDial
	Dim pp As String = $"${ID}Mode"$
	vue.SetStateSingle(pp, varMode)
	SpeedDial.Bind(":mode", pp)
	Return Me
End Sub

'set open-on-hove
Sub SetOpenOnHove(varOpenOnHove As Object) As VMSpeedDial
	Dim pp As String = $"${ID}OpenOnHove"$
	vue.SetStateSingle(pp, varOpenOnHove)
	SpeedDial.Bind(":open-on-hove", pp)
	Return Me
End Sub

'set origin
Sub SetOrigin(varOrigin As Object) As VMSpeedDial
	Dim pp As String = $"${ID}Origin"$
	vue.SetStateSingle(pp, varOrigin)
	SpeedDial.Bind(":origin", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Object) As VMSpeedDial
	Dim pp As String = $"${ID}Right"$
	vue.SetStateSingle(pp, varRight)
	SpeedDial.Bind(":right", pp)
	Return Me
End Sub

'set top
Sub SetTop(varTop As Object) As VMSpeedDial
	Dim pp As String = $"${ID}Top"$
	vue.SetStateSingle(pp, varTop)
	SpeedDial.Bind(":top", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As Object) As VMSpeedDial
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	SpeedDial.Bind(":transition", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMSpeedDial
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	SpeedDial.Bind(":value", pp)
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
	vue.SetStateSingle($"${ID}disabled"$, False)
	Return Me
End Sub

Sub Disable As VMSpeedDial
	vue.SetStateSingle($"${ID}disabled"$, True)
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


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub
