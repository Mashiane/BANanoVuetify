B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TimePicker As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bForInput As Boolean
	Private vmodel As String
	Private vLabel As String
	Private bRequired As Boolean
	Private splaceholder As String
	Private sHint As String
	Private bClearable As Boolean
	Private ErrorText As String
End Sub

'initialize the TimePicker
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTimePicker
	ID = sid.tolowercase
	TimePicker.Initialize(v, ID)
	TimePicker.SetTag("v-time-picker")
	DesignMode = False
	Module = eventHandler
	vue = v
	bForInput = False
	vmodel = ""
	vLabel = ""
	TimePicker.typeOf = "timepicker"
	TimePicker.fieldType = "string"	
	bRequired = False
	splaceholder = ""
	vLabel = ""
	sHint = ""
	bClearable = False
	ErrorText = ""
	Return Me
End Sub

Sub SetErrorText(error As String) As VMTimePicker
	ErrorText = error
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMTimePicker
	TimePicker.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMTimePicker
	TimePicker.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMTimePicker
	TimePicker.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMTimePicker
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMTimePicker
	TimePicker.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMTimePicker
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetLabel(dlabel As String) As VMTimePicker
	vLabel = dlabel
	Return Me
End Sub

'the date picker should be for date input
Sub SetForInput As VMTimePicker
	bForInput = True
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMTimePicker
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMTimePicker
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	TimePicker.Bind(":color", pp)
	Return Me
End Sub

Sub SetHeaderColorIntensity(varColor As String, varIntensity As String) As VMTimePicker
	Dim pp As String = $"${ID}HeaderColor"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	TimePicker.Bind(":header-color", pp)
	Return Me
End Sub

'set required
Sub SetClearable(varClearable As Boolean) As VMTimePicker
	bClearable = varClearable
	Return Me
End Sub

'set placeholder
Sub SetPlaceholder(varPlaceholder As Object) As VMTimePicker
	splaceholder = varPlaceholder
	
	Return Me
End Sub

'set placeholder
Sub SetHint(varHint As Object) As VMTimePicker
	sHint = varHint
	Return Me
End Sub

'set required
Sub SetRequired(varRequired As Boolean) As VMTimePicker
	bRequired = varRequired
	
	Return Me
End Sub

Sub Set24 As VMTimePicker
	SetFormat("24hr")
	Return Me
End Sub

'get component
Sub ToString As String
	If bForInput Then
		'create a menu
		vue.SetStateSingle($"${ID}menu2"$, False)
		Dim dMenu As VMElement
		dMenu.Initialize(vue, $"${ID}menu"$).SetTag("v-menu")
		dMenu.SetAttrSingle("ref", $"${ID}menu"$)
		dMenu.SetVModel($"${ID}menu2"$)
		dMenu.SetAttrSingle(":close-on-content-click", False)
		dMenu.SetAttrSingle(":nudge-right", "40")
		dMenu.SetAttrSingle(":return-value.sync", vmodel)
		dMenu.SetAttrSingle("transition", "scale-transition")
		dMenu.SetAttrloose("offset-y")
		dMenu.SetAttrSingle("min-width", "290px")
		dMenu.SetAttrSingle("max-width", "290px")
		'
		Dim tmpl As VMTemplate
		tmpl.Initialize(vue, $"${ID}tmpl"$, Module).SetSlotActivatorOn
		'
		Dim txt As VMTextField
		txt.Initialize(vue, $"${ID}txt"$, Module)
		txt.SetPrependIcon("access_time").SetAttrloose("readonly").SetAttrSingle("v-on", "on")
		txt.SetLabel(vLabel)
		txt.SetVModel(vmodel)
		txt.SetRequired(bRequired)
		txt.SetPlaceholder(splaceholder)
		txt.SetHint(sHint)
		txt.SetClearable(bClearable)
		
		txt.Pop(tmpl.Template)
		dMenu.SetText(tmpl.ToString)
		'
		TimePicker.SetVIf($"${ID}menu2"$)
		TimePicker.SetAttrLoose("full-width")
		Dim ssave As String = "$refs." & ID & "menu.save(" & vmodel & ")"
		TimePicker.SetAttrSingle("@click:minute", ssave)
				
		'
		dMenu.SetText(TimePicker.ToString)
		
		Return dMenu.tostring
	Else
		Return TimePicker.ToString
	End If
End Sub

Sub SetVModel(k As String) As VMTimePicker
	vmodel = k.tolowercase
	TimePicker.SetVModel(k)
	
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTimePicker
	TimePicker.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTimePicker
	TimePicker.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTimePicker
	Dim childHTML As String = child.ToString
	TimePicker.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTimePicker
	TimePicker.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTimePicker
	TimePicker.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTimePicker
	TimePicker.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTimePicker
	TimePicker.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set allowed-hours
Sub SetAllowedHours(varAllowedHours As Object) As VMTimePicker
	Dim pp As String = $"${ID}AllowedHours"$
	vue.SetStateSingle(pp, varAllowedHours)
	TimePicker.Bind(":allowed-hours", pp)
	Return Me
End Sub

'set allowed-minutes
Sub SetAllowedMinutes(varAllowedMinutes As Object) As VMTimePicker
	Dim pp As String = $"${ID}AllowedMinutes"$
	vue.SetStateSingle(pp, varAllowedMinutes)
	TimePicker.Bind(":allowed-minutes", pp)
	Return Me
End Sub

'set allowed-seconds
Sub SetAllowedSeconds(varAllowedSeconds As Object) As VMTimePicker
	Dim pp As String = $"${ID}AllowedSeconds"$
	vue.SetStateSingle(pp, varAllowedSeconds)
	TimePicker.Bind(":allowed-seconds", pp)
	Return Me
End Sub

'set ampm-in-title
Sub SetAmpmInTitle(varAmpmInTitle As Object) As VMTimePicker
	Dim pp As String = $"${ID}AmpmInTitle"$
	vue.SetStateSingle(pp, varAmpmInTitle)
	TimePicker.Bind(":ampm-in-title", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMTimePicker
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	TimePicker.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMTimePicker
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	TimePicker.Bind(":dark", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMTimePicker
	TimePicker.SetDisabled(varDisabled)
	Return Me
End Sub

'set format
Sub SetFormat(varFormat As Object) As VMTimePicker
	Dim pp As String = $"${ID}Format"$
	vue.SetStateSingle(pp, varFormat)
	TimePicker.Bind(":format", pp)
	Return Me
End Sub

'set full-width
Sub SetFullWidth(varFullWidth As Object) As VMTimePicker
	Dim pp As String = $"${ID}FullWidth"$
	vue.SetStateSingle(pp, varFullWidth)
	TimePicker.Bind(":full-width", pp)
	Return Me
End Sub

'set header-color
Sub SetHeaderColor(varHeaderColor As Object) As VMTimePicker
	Dim pp As String = $"${ID}HeaderColor"$
	vue.SetStateSingle(pp, varHeaderColor)
	TimePicker.Bind(":header-color", pp)
	Return Me
End Sub

'set landscape
Sub SetLandscape(varLandscape As Object) As VMTimePicker
	Dim pp As String = $"${ID}Landscape"$
	vue.SetStateSingle(pp, varLandscape)
	TimePicker.Bind(":landscape", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMTimePicker
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	TimePicker.Bind(":light", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As Object) As VMTimePicker
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	TimePicker.Bind(":max", pp)
	Return Me
End Sub

'set min
Sub SetMin(varMin As Object) As VMTimePicker
	Dim pp As String = $"${ID}Min"$
	vue.SetStateSingle(pp, varMin)
	TimePicker.Bind(":min", pp)
	Return Me
End Sub

'set no-title
Sub SetNoTitle(varNoTitle As Object) As VMTimePicker
	Dim pp As String = $"${ID}NoTitle"$
	vue.SetStateSingle(pp, varNoTitle)
	TimePicker.Bind(":no-title", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMTimePicker
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	TimePicker.Bind(":readonly", pp)
	Return Me
End Sub

'set scrollable
Sub SetScrollable(varScrollable As Object) As VMTimePicker
	Dim pp As String = $"${ID}Scrollable"$
	vue.SetStateSingle(pp, varScrollable)
	TimePicker.Bind(":scrollable", pp)
	Return Me
End Sub

'set user-seconds
Sub SetUserSeconds(varUserSeconds As Object) As VMTimePicker
	Dim pp As String = $"${ID}UserSeconds"$
	vue.SetStateSingle(pp, varUserSeconds)
	TimePicker.Bind(":user-seconds", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMTimePicker
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	TimePicker.Bind(":value", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMTimePicker
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	TimePicker.Bind(":width", pp)
	Return Me
End Sub

'
Sub SetOnChange(methodName As String) As VMTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickHour(methodName As String) As VMTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:hour": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickMinute(methodName As String) As VMTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:minute": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickSecond(methodName As String) As VMTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:second": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMTimePicker
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
Sub SetOnUpdatePeriod(methodName As String) As VMTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:period": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMTimePicker
	vue.SetStateSingle($"${ID}show"$, False)
	Return Me
End Sub

Sub Show As VMTimePicker
	vue.SetStateSingle($"${ID}show"$, True)
	Return Me
End Sub

Sub Enable As VMTimePicker
	vue.SetStateSingle($"${ID}disabled"$, False)
	Return Me
End Sub

Sub Disable As VMTimePicker
	vue.SetStateSingle($"${ID}disabled"$, True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMTimePicker
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMTimePicker
	TimePicker.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMTimePicker
	TimePicker.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMTimePicker
	TimePicker.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMTimePicker
	TimePicker.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMTimePicker
	TimePicker.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMTimePicker
	TimePicker.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMTimePicker
	TimePicker.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMTimePicker
	TimePicker.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub
