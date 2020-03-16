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

Sub SetIcon(iconName As String, position As String) As VMChip
	Dim c6a As VMAvatar
	c6a.Initialize(vue, $"${ID}a"$, Module)
	c6a.SetAttributes(Array(position)).AddIcon($"${ID}i"$, iconName, Null, Null, Null)
	AddComponent(c6a.ToString)
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
	
	Return Chip.ToString
End Sub

Sub SetVModel(k As String) As VMChip
	Chip.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMChip
	Chip.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMChip
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
Sub SetText(t As Object) As VMChip
	Chip.SetText(t)
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
Sub SetActive(varActive As Object) As VMChip
	Dim pp As String = $"${ID}Active"$
	vue.SetStateSingle(pp, varActive)
	Chip.Bind(":active", pp)
	Return Me
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMChip
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	Chip.Bind(":active-class", pp)
	Return Me
End Sub

'set append
Sub SetAppend(varAppend As Object) As VMChip
	Dim pp As String = $"${ID}Append"$
	vue.SetStateSingle(pp, varAppend)
	Chip.Bind(":append", pp)
	Return Me
End Sub

'set close
Sub SetClose(varClose As Object) As VMChip
	Dim pp As String = $"${ID}Close"$
	vue.SetStateSingle(pp, varClose)
	Chip.Bind(":close", pp)
	Return Me
End Sub

'set close-icon
Sub SetCloseIcon(varCloseIcon As Object) As VMChip
	Dim pp As String = $"${ID}CloseIcon"$
	vue.SetStateSingle(pp, varCloseIcon)
	Chip.Bind(":close-icon", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMChip
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Chip.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMChip
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
Sub SetDraggable(varDraggable As Object) As VMChip
	Dim pp As String = $"${ID}Draggable"$
	vue.SetStateSingle(pp, varDraggable)
	Chip.Bind(":draggable", pp)
	Return Me
End Sub

'set exact
Sub SetExact(varExact As Object) As VMChip
	Dim pp As String = $"${ID}Exact"$
	vue.SetStateSingle(pp, varExact)
	Chip.Bind(":exact", pp)
	Return Me
End Sub

'set exact-active-class
Sub SetExactActiveClass(varExactActiveClass As Object) As VMChip
	Dim pp As String = $"${ID}ExactActiveClass"$
	vue.SetStateSingle(pp, varExactActiveClass)
	Chip.Bind(":exact-active-class", pp)
	Return Me
End Sub

'set filter
Sub SetFilter(varFilter As Object) As VMChip
	Dim pp As String = $"${ID}Filter"$
	vue.SetStateSingle(pp, varFilter)
	Chip.Bind(":filter", pp)
	Return Me
End Sub

'set filter-icon
Sub SetFilterIcon(varFilterIcon As Object) As VMChip
	Dim pp As String = $"${ID}FilterIcon"$
	vue.SetStateSingle(pp, varFilterIcon)
	Chip.Bind(":filter-icon", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As Object) As VMChip
	Dim pp As String = $"${ID}Href"$
	vue.SetStateSingle(pp, varHref)
	Chip.Bind(":href", pp)
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As Object) As VMChip
	Dim pp As String = $"${ID}InputValue"$
	vue.SetStateSingle(pp, varInputValue)
	Chip.Bind(":input-value", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMChip
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	Chip.Bind(":label", pp)
	Return Me
End Sub

'set large
Sub SetLarge(varLarge As Object) As VMChip
	Dim pp As String = $"${ID}Large"$
	vue.SetStateSingle(pp, varLarge)
	Chip.Bind(":large", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMChip
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Chip.Bind(":light", pp)
	Return Me
End Sub

'set link
Sub SetLink(varLink As Object) As VMChip
	Dim pp As String = $"${ID}Link"$
	vue.SetStateSingle(pp, varLink)
	Chip.Bind(":link", pp)
	Return Me
End Sub

'set nuxt
Sub SetNuxt(varNuxt As Object) As VMChip
	Dim pp As String = $"${ID}Nuxt"$
	vue.SetStateSingle(pp, varNuxt)
	Chip.Bind(":nuxt", pp)
	Return Me
End Sub

'set outlined
Sub SetOutlined(varOutlined As Object) As VMChip
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	Chip.Bind(":outlined", pp)
	Return Me
End Sub

'set pill
Sub SetPill(varPill As Object) As VMChip
	Dim pp As String = $"${ID}Pill"$
	vue.SetStateSingle(pp, varPill)
	Chip.Bind(":pill", pp)
	Return Me
End Sub

'set replace
Sub SetReplace(varReplace As Object) As VMChip
	Dim pp As String = $"${ID}Replace"$
	vue.SetStateSingle(pp, varReplace)
	Chip.Bind(":replace", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Object) As VMChip
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	Chip.Bind(":ripple", pp)
	Return Me
End Sub

'set small
Sub SetSmall(varSmall As Object) As VMChip
	Dim pp As String = $"${ID}Small"$
	vue.SetStateSingle(pp, varSmall)
	Chip.Bind(":small", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMChip
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	Chip.Bind(":tag", pp)
	Return Me
End Sub

'set target
Sub SetTarget(varTarget As Object) As VMChip
	Dim pp As String = $"${ID}Target"$
	vue.SetStateSingle(pp, varTarget)
	Chip.Bind(":target", pp)
	Return Me
End Sub

'set text-color
Sub SetTextColor(varTextColor As Object) As VMChip
	Dim pp As String = $"${ID}TextColor"$
	vue.SetStateSingle(pp, varTextColor)
	Chip.Bind(":text-color", pp)
	Return Me
End Sub

'set to
Sub SetTo(varTo As Object) As VMChip
	Dim pp As String = $"${ID}To"$
	vue.SetStateSingle(pp, varTo)
	Chip.Bind(":to", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMChip
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	Chip.Bind(":value", pp)
	Return Me
End Sub

'set x-large
Sub SetXLarge(varXLarge As Object) As VMChip
	Dim pp As String = $"${ID}XLarge"$
	vue.SetStateSingle(pp, varXLarge)
	Chip.Bind(":x-large", pp)
	Return Me
End Sub

'set x-small
Sub SetXSmall(varXSmall As Object) As VMChip
	Dim pp As String = $"${ID}XSmall"$
	vue.SetStateSingle(pp, varXSmall)
	Chip.Bind(":x-small", pp)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMChip
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickClose(methodName As String) As VMChip
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:close": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMChip
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateActive(methodName As String) As VMChip
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:active": methodName))
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


Sub SetHeight(h As String) As VMChip
	Chip.SetStyleSingle("height", h)
	Return Me
End Sub


Sub SetWidth(w As String) As VMChip
	Chip.SetStyleSingle("width", w)
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
