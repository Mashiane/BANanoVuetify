B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Chip As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
	Private sPos As String
	Private icon As String
	Private content As String
End Sub

'initialize the Chip
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMChip
	ID = sid.tolowercase
	Chip.Initialize(v, ID).SetTag("v-chip").SetVIf(ID)
	DesignMode = False
	Module = eventHandler
	vue = v
	vue.SetData(ID, True)
	SetOnClickClose($"${ID}_close"$)
	SetOnClick($"${ID}_click"$)
	Chip.typeOf = "chip"
	Chip.fieldType = "string"
	Chip.InputType = "text"
	Chip.IsArray = True
	bStatic = False
	sPos = "left"
	icon = ""
	content = ""
	Return Me
End Sub

Sub SetData(prop As String, value As Object) As VMChip
	vue.SetData(prop, value)
	Return Me
End Sub


'set for
Sub SetVFor(item As String, dataSource As String) As VMChip
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMChip
	bStatic = b
	Chip.SetStatic(b)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMChip
	Chip.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMChip
	Chip.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMChip
	Chip.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMChip
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetImage(url As String, position As String) As VMChip
	If position = "" Then position = "left"
	sPos = position
	Dim c6a As VMAvatar
	c6a.Initialize(vue, $"${ID}a"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	c6a.SetAttributes(Array(position))
	c6a.SetImage(url, "", Null, Null, Null)
	icon = c6a.ToString
	Return Me
End Sub

Sub SetIcon(iconName As String, position As String) As VMChip
	If position = "" Then position = "left"
	sPos = position
	Dim c6a As VMIcon
	c6a.Initialize(vue, $"${ID}a"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	c6a.SetAttributes(Array(position))
	c6a.SetText(iconName)
	icon = c6a.ToString
	Return Me
End Sub

Sub AddComponent(scomp As String) As VMChip
	SetText(scomp)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMChip
	Chip.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMChip
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String	
	Select Case sPos
	Case "left"
		Chip.SetText(icon)
		Chip.SetText(content)
	Case "right"
		Chip.SetText(content)
		Chip.SetText(icon)
	End Select
	Return Chip.ToString
End Sub

Sub SetVModel(k As String) As VMChip
	Chip.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMChip
	Chip.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMChip
	Chip.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMChip
	Dim childHTML As String = child.ToString
	Chip.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMChip
	content = t
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMChip
	Chip.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMChip
	Chip.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMChip
	Chip.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active
Sub SetActive(varActive As Boolean) As VMChip
	If varActive = False Then Return Me
	If bStatic Then
		SetAttrSingle("active", varActive)
		Return Me
	End If
	Dim pp As String = $"${ID}Active"$
	vue.SetStateSingle(pp, varActive)
	Chip.Bind(":active", pp)
	Return Me
End Sub

'set append
Sub SetAppend(varAppend As Boolean) As VMChip
	If varAppend = False Then Return Me
	If bStatic Then
		SetAttrSingle("append", varAppend)
		Return Me
	End If
	Dim pp As String = $"${ID}Append"$
	vue.SetStateSingle(pp, varAppend)
	Chip.Bind(":append", pp)
	Return Me
End Sub

'set close
Sub SetClose(varClose As Boolean) As VMChip
	If varClose = False Then Return Me
	If bStatic Then
		SetAttrSingle("close", varClose)
		Return Me
	End If
	Dim pp As String = $"${ID}Close"$
	vue.SetStateSingle(pp, varClose)
	Chip.Bind(":close", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMChip
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Chip.Bind(":dark", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMChip
	Chip.SetDisabled(varDisabled)
	Return Me
End Sub

'set draggable
Sub SetDraggable(varDraggable As Boolean) As VMChip
	If varDraggable = False Then Return Me
	If bStatic Then
		SetAttrSingle("draggable", varDraggable)
		Return Me
	End If
	Dim pp As String = $"${ID}Draggable"$
	vue.SetStateSingle(pp, varDraggable)
	Chip.Bind(":draggable", pp)
	Return Me
End Sub

'set exact
Sub SetExact(varExact As Boolean) As VMChip
	If varExact = False Then Return Me
	If bStatic Then
		SetAttrSingle("exact", varExact)
		Return Me
	End If
	Dim pp As String = $"${ID}Exact"$
	vue.SetStateSingle(pp, varExact)
	Chip.Bind(":exact", pp)
	Return Me
End Sub

'set filter
Sub SetFilter(varFilter As Boolean) As VMChip
	If varFilter = False Then Return Me
	If bStatic Then
		SetAttrSingle("filter", varFilter)
		Return Me
	End If
	Dim pp As String = $"${ID}Filter"$
	vue.SetStateSingle(pp, varFilter)
	Chip.Bind(":filter", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Boolean) As VMChip
	If varLabel = False Then Return Me
	If bStatic Then
		SetAttrSingle("label", varLabel)
		Return Me
	End If
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	Chip.Bind(":label", pp)
	Return Me
End Sub

'set large
Sub SetLarge(varLarge As Boolean) As VMChip
	If varLarge = False Then Return Me
	If bStatic Then
		SetAttrSingle("large", varLarge)
		Return Me
	End If
	Dim pp As String = $"${ID}Large"$
	vue.SetStateSingle(pp, varLarge)
	Chip.Bind(":large", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMChip
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Chip.Bind(":light", pp)
	Return Me
End Sub

'set link
Sub SetLink(varLink As Boolean) As VMChip
	If varLink = False Then Return Me
	If bStatic Then
		SetAttrSingle("link", varLink)
		Return Me
	End If
	Dim pp As String = $"${ID}Link"$
	vue.SetStateSingle(pp, varLink)
	Chip.Bind(":link", pp)
	Return Me
End Sub

'set nuxt
Sub SetNuxt(varNuxt As Boolean) As VMChip
	If varNuxt = False Then Return Me
	If bStatic Then
		SetAttrSingle("nuxt", varNuxt)
		Return Me
	End If
	Dim pp As String = $"${ID}Nuxt"$
	vue.SetStateSingle(pp, varNuxt)
	Chip.Bind(":nuxt", pp)
	Return Me
End Sub

'set outlined
Sub SetOutlined(varOutlined As Boolean) As VMChip
	If varOutlined = False Then Return Me
	If bStatic Then
		SetAttrSingle("outlined", varOutlined)
		Return Me
	End If
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	Chip.Bind(":outlined", pp)
	Return Me
End Sub

'set pill
Sub SetPill(varPill As Boolean) As VMChip
	If varPill = False Then Return Me
	If bStatic Then
		SetAttrSingle("pill", varPill)
		Return Me
	End If
	Dim pp As String = $"${ID}Pill"$
	vue.SetStateSingle(pp, varPill)
	Chip.Bind(":pill", pp)
	Return Me
End Sub

'set replace
Sub SetReplace(varReplace As Boolean) As VMChip
	If varReplace = False Then Return Me
	If bStatic Then
		SetAttrSingle("replace", varReplace)
		Return Me
	End If
	Dim pp As String = $"${ID}Replace"$
	vue.SetStateSingle(pp, varReplace)
	Chip.Bind(":replace", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Boolean) As VMChip
	If varRipple = False Then Return Me
	If bStatic Then
		SetAttrSingle("ripple", varRipple)
		Return Me
	End If
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	Chip.Bind(":ripple", pp)
	Return Me
End Sub

'set small
Sub SetSmall(varSmall As Boolean) As VMChip
	If varSmall = False Then Return Me
	If bStatic Then
		SetAttrSingle("small", varSmall)
		Return Me
	End If
	Dim pp As String = $"${ID}Small"$
	vue.SetStateSingle(pp, varSmall)
	Chip.Bind(":small", pp)
	Return Me
End Sub

'set x-large
Sub SetXLarge(varXLarge As Boolean) As VMChip
	If varXLarge = False Then Return Me
	If bStatic Then
		SetAttrSingle("x-large", varXLarge)
		Return Me
	End If
	Dim pp As String = $"${ID}XLarge"$
	vue.SetStateSingle(pp, varXLarge)
	Chip.Bind(":x-large", pp)
	Return Me
End Sub

'set x-small
Sub SetXSmall(varXSmall As Boolean) As VMChip
	If varXSmall = False Then Return Me
	If bStatic Then
		SetAttrSingle("x-small", varXSmall)
		Return Me
	End If
	Dim pp As String = $"${ID}XSmall"$
	vue.SetStateSingle(pp, varXSmall)
	Chip.Bind(":x-small", pp)
	Return Me
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMChip
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	Chip.Bind(":active-class", pp)
	Return Me
End Sub

'set close-icon
Sub SetCloseIcon(varCloseIcon As String) As VMChip
	If varCloseIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("close-icon", varCloseIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}CloseIcon"$
	vue.SetStateSingle(pp, varCloseIcon)
	Chip.Bind(":close-icon", pp)
	Return Me
End Sub

'set text-color
Sub SetColor(color As String) As VMChip
	If color = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", color)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, color)
	Chip.Bind(":color", pp)
	Return Me
End Sub

'set text-color
Sub SetColorIntensity(color As String, intensity As String) As VMChip
	If color = "" Then Return Me
	Dim mcolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", mcolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, mcolor)
	Chip.Bind(":color", pp)
	Return Me
End Sub

'set exact-active-class
Sub SetExactActiveClass(varExactActiveClass As String) As VMChip
	If varExactActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("exact-active-class", varExactActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ExactActiveClass"$
	vue.SetStateSingle(pp, varExactActiveClass)
	Chip.Bind(":exact-active-class", pp)
	Return Me
End Sub

'set filter-icon
Sub SetFilterIcon(varFilterIcon As String) As VMChip
	If varFilterIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("filter-icon", varFilterIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}FilterIcon"$
	vue.SetStateSingle(pp, varFilterIcon)
	Chip.Bind(":filter-icon", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As String) As VMChip
	If varHref = "" Then Return Me
	If bStatic Then
		SetAttrSingle("href", varHref)
		Return Me
	End If
	Dim pp As String = $"${ID}Href"$
	vue.SetStateSingle(pp, varHref)
	Chip.Bind(":href", pp)
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As String) As VMChip
	If varInputValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("input-value", varInputValue)
		Return Me
	End If
	Dim pp As String = $"${ID}InputValue"$
	vue.SetStateSingle(pp, varInputValue)
	Chip.Bind(":input-value", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMChip
	If varTag = "" Then Return Me
	If bStatic Then
		SetAttrSingle("tag", varTag)
		Return Me
	End If
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	Chip.Bind(":tag", pp)
	Return Me
End Sub

'set target
Sub SetTarget(varTarget As String) As VMChip
	If varTarget = "" Then Return Me
	If bStatic Then
		SetAttrSingle("target", varTarget)
		Return Me
	End If
	Dim pp As String = $"${ID}Target"$
	vue.SetStateSingle(pp, varTarget)
	Chip.Bind(":target", pp)
	Return Me
End Sub

'set text-color
Sub SetTextColor(textcolor As String) As VMChip
	If textcolor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("text-color", textcolor)
		Return Me
	End If
	Dim pp As String = $"${ID}TextColor"$
	vue.SetStateSingle(pp, textcolor)
	Chip.Bind(":text-color", pp)
	Return Me
End Sub


'set text-color
Sub SetTextColorIntensity(textcolor As String, textintensity As String) As VMChip
	If textcolor = "" Then Return Me
	Dim mcolor As String = $"${textcolor} ${textintensity}"$
	If bStatic Then
		SetAttrSingle("text-color", mcolor)
		Return Me
	End If
	Dim pp As String = $"${ID}TextColor"$
	vue.SetStateSingle(pp, mcolor)
	Chip.Bind(":text-color", pp)
	Return Me
End Sub

'set to
Sub SetTo(varTo As String) As VMChip
	If varTo = "" Then Return Me
	If bStatic Then
		SetAttrSingle("to", varTo)
		Return Me
	End If
	Dim pp As String = $"${ID}To"$
	vue.SetStateSingle(pp, varTo)
	Chip.Bind(":to", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMChip
	If varValue = "" Then Return Me
	If bStatic Then
		Chip.SetValue(varValue, False)
		Return Me
	End If
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	Chip.Bind(":value", pp)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMChip
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickClose(methodName As String) As VMChip
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click:close": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMChip
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateActive(methodName As String) As VMChip
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:active": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMChip
	vue.SetStateSingle(ID, False)
	Return Me
End Sub

Sub Show As VMChip
	vue.SetStateSingle(ID, True)
	Return Me
End Sub

Sub Enable As VMChip
	Chip.Enable(True)
	Return Me
End Sub

Sub Disable As VMChip
	Chip.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMChip
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMChip
	Chip.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMChip
	Chip.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMChip
	Chip.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMChip
	Chip.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMChip
	Chip.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMChip
	Chip.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMChip
	Chip.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMChip
	Chip.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMChip
	Chip.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMChip
	Chip.SetVisible(b)
	Return Me
End Sub
