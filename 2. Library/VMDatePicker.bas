B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public DatePicker As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bForInput As Boolean
	Private vmodel As String
	Private vLabel As String
	Private bClearable As Boolean
	Private splaceholder As String
	Private bRequired As Boolean
	Private sHint As String
	Private ErrorText As String
End Sub

'initialize the DatePicker
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDatePicker
	ID = sid.tolowercase
	DatePicker.Initialize(v, ID)
	DatePicker.SetTag("v-date-picker")
	DesignMode = False
	Module = eventHandler
	vue = v
	bForInput = False
	vmodel = ""
	vLabel = ""
	DatePicker.typeOf = "datepicker"
	DatePicker.fieldType = "date"
	bClearable = False
	splaceholder = ""
	bRequired = False
	sHint = ""
	ErrorText = ""
	Return Me
End Sub


Sub SetDate As VMDatePicker
	DatePicker.fieldType = "date"
	Return Me
End Sub

'backward compatibility
Sub SetInvalidMessage(ErrText As String) As VMDatePicker
	ErrorText = ErrText
	Return Me
End Sub

Sub SetErrorText(Error As String) As VMDatePicker
	ErrorText = Error
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMDatePicker
	DatePicker.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMDatePicker
	DatePicker.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMDatePicker
	DatePicker.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMDatePicker
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMDatePicker
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetLabel(dlabel As String) As VMDatePicker
	vLabel = dlabel
	Return Me
End Sub

'the date picker should be for date input
Sub SetForInput As VMDatePicker
	bForInput = True
	Return Me
End Sub

Sub SetMonthPicker As VMDatePicker
	SetType("month")
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMDatePicker
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMDatePicker
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	DatePicker.Bind(":color", pp)
	Return Me
End Sub

Sub SetHeaderColorIntensity(varColor As String, varIntensity As String) As VMDatePicker
	Dim pp As String = $"${ID}HeaderColor"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	DatePicker.Bind(":header-color", pp)
	Return Me
End Sub

'set required
Sub SetRequired(varRequired As Boolean) As VMDatePicker
	bRequired = varRequired
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Boolean) As VMDatePicker
	bClearable = varClearable
	Return Me
End Sub

'set placeholder
Sub SetPlaceholder(varPlaceholder As Object) As VMDatePicker
	splaceholder = varPlaceholder
	Return Me
End Sub


'set placeholder
Sub SetHint(varHint As Object) As VMDatePicker
	sHint = varHint
	Return Me
End Sub

'get component
Sub ToString As String
	If bForInput Then
		'create a menu
		vue.SetStateSingle($"${ID}menu"$, False)
		Dim dMenu As VMElement
		dMenu.Initialize(vue, $"${ID}menu"$).SetTag("v-menu")
		dMenu.SetAttrSingle("ref", $"${ID}menu"$)
		dMenu.SetVModel($"${ID}menu"$)
		dMenu.SetAttrSingle(":close-on-content-click", False)
		dMenu.SetAttrSingle(":return-value.sync", vmodel)
		dMenu.SetAttrSingle("transition", "scale-transition")
		dMenu.SetAttrloose("offset-y")
		dMenu.SetAttrSingle("min-width", "290px")
		'
		Dim tmpl As VMTemplate
		tmpl.Initialize(vue, $"${ID}tmpl"$, Module).SetSlotActivatorOn
		'
		Dim txt As VMTextField
		txt.Initialize(vue, $"${ID}txt"$, Module)
		txt.SetPrependIcon("event").SetAttrloose("readonly").SetAttrSingle("v-on", "on")
		txt.SetLabel(vLabel)
		txt.SetVModel(vmodel)
		txt.SetRequired(bRequired)
		txt.SetPlaceholder(splaceholder)
		txt.SetHint(sHint)
		txt.SetClearable(bClearable)
		txt.Pop(tmpl.Template)
				'
		dMenu.SetText(tmpl.ToString)
		'
		DatePicker.SetAttrLoose("no-title")
		DatePicker.SetAttrLoose("scrollable")
		'
		AddSpacer
		'
		Dim btnCancel As VMButton
		btnCancel.Initialize(vue, $"${ID}cancel"$, Me).SetTransparent(True).SetColor("primary")
		btnCancel.setattrsingle("@click", $"${ID}menu = false"$)
		btnCancel.SetLabel("Cancel")
		DatePicker.SetText(btnCancel.ToString)
		'
		Dim btnOk As VMButton
		btnOk.Initialize(vue, $"${ID}ok"$, Me).SetTransparent(True).SetColor("primary")
		Dim ssave As String = "$refs." & ID & "menu.save(" & vmodel & ")"
		btnOk.SetAttrSingle("@click", ssave)
		btnOk.SetLabel("Ok")
		DatePicker.SetText(btnOk.ToString)
			
		'
		dMenu.SetText(DatePicker.ToString)
		
		Return dMenu.tostring
	Else
		Return DatePicker.ToString
	End If
End Sub

private Sub AddSpacer As VMDatePicker
	DatePicker.AddSpacer
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMDatePicker
	DatePicker.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetVModel(k As String) As VMDatePicker
	k =k.tolowercase
	DatePicker.SetVModel(k)
	vmodel = k
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMDatePicker
	DatePicker.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMDatePicker
	DatePicker.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMDatePicker
	Dim childHTML As String = child.ToString
	DatePicker.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMDatePicker
	DatePicker.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMDatePicker
	DatePicker.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDatePicker
	DatePicker.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMDatePicker
	DatePicker.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set allowed-dates
Sub SetAllowedDates(varAllowedDates As Object) As VMDatePicker
	Dim pp As String = $"${ID}AllowedDates"$
	vue.SetStateSingle(pp, varAllowedDates)
	DatePicker.Bind(":allowed-dates", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMDatePicker
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	DatePicker.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMDatePicker
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	DatePicker.Bind(":dark", pp)
	Return Me
End Sub

'set day-format
Sub SetDayFormat(varDayFormat As Object) As VMDatePicker
	Dim pp As String = $"${ID}DayFormat"$
	vue.SetStateSingle(pp, varDayFormat)
	DatePicker.Bind(":day-format", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMDatePicker
	DatePicker.SetDisabled(varDisabled)
	Return Me
End Sub

'set event-color
Sub SetEventColor(varEventColor As Object) As VMDatePicker
	Dim pp As String = $"${ID}EventColor"$
	vue.SetStateSingle(pp, varEventColor)
	DatePicker.Bind(":event-color", pp)
	Return Me
End Sub

'set events
Sub SetEvents(varEvents As Object) As VMDatePicker
	Dim pp As String = $"${ID}Events"$
	vue.SetStateSingle(pp, varEvents)
	DatePicker.Bind(":events", pp)
	Return Me
End Sub

'set first-day-of-week
Sub SetFirstDayOfWeek(varFirstDayOfWeek As Object) As VMDatePicker
	Dim pp As String = $"${ID}FirstDayOfWeek"$
	vue.SetStateSingle(pp, varFirstDayOfWeek)
	DatePicker.Bind(":first-day-of-week", pp)
	Return Me
End Sub

'set full-width
Sub SetFullWidth(varFullWidth As Object) As VMDatePicker
	Dim pp As String = $"${ID}FullWidth"$
	vue.SetStateSingle(pp, varFullWidth)
	DatePicker.Bind(":full-width", pp)
	Return Me
End Sub

'set header-color
Sub SetHeaderColor(varHeaderColor As Object) As VMDatePicker
	Dim pp As String = $"${ID}HeaderColor"$
	vue.SetStateSingle(pp, varHeaderColor)
	DatePicker.Bind(":header-color", pp)
	Return Me
End Sub

'set hader-date-format
Sub SetHaderDateFormat(varHaderDateFormat As Object) As VMDatePicker
	Dim pp As String = $"${ID}HaderDateFormat"$
	vue.SetStateSingle(pp, varHaderDateFormat)
	DatePicker.Bind(":hader-date-format", pp)
	Return Me
End Sub

'set landscape
Sub SetLandscape(varLandscape As Object) As VMDatePicker
	Dim pp As String = $"${ID}Landscape"$
	vue.SetStateSingle(pp, varLandscape)
	DatePicker.Bind(":landscape", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMDatePicker
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	DatePicker.Bind(":light", pp)
	Return Me
End Sub

'set locale
Sub SetLocale(varLocale As Object) As VMDatePicker
	Dim pp As String = $"${ID}Locale"$
	vue.SetStateSingle(pp, varLocale)
	DatePicker.Bind(":locale", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As Object) As VMDatePicker
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	DatePicker.Bind(":max", pp)
	Return Me
End Sub

'set min
Sub SetMin(varMin As Object) As VMDatePicker
	Dim pp As String = $"${ID}Min"$
	vue.SetStateSingle(pp, varMin)
	DatePicker.Bind(":min", pp)
	Return Me
End Sub

'set month-format
Sub SetMonthFormat(varMonthFormat As Object) As VMDatePicker
	Dim pp As String = $"${ID}MonthFormat"$
	vue.SetStateSingle(pp, varMonthFormat)
	DatePicker.Bind(":month-format", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Object) As VMDatePicker
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	DatePicker.Bind(":multiple", pp)
	Return Me
End Sub

'set next-icon
Sub SetNextIcon(varNextIcon As Object) As VMDatePicker
	Dim pp As String = $"${ID}NextIcon"$
	vue.SetStateSingle(pp, varNextIcon)
	DatePicker.Bind(":next-icon", pp)
	Return Me
End Sub

'set no-title
Sub SetNoTitle(varNoTitle As Object) As VMDatePicker
	Dim pp As String = $"${ID}NoTitle"$
	vue.SetStateSingle(pp, varNoTitle)
	DatePicker.Bind(":no-title", pp)
	Return Me
End Sub

'set picker-date
Sub SetPickerDate(varPickerDate As Object) As VMDatePicker
	Dim pp As String = $"${ID}PickerDate"$
	vue.SetStateSingle(pp, varPickerDate)
	DatePicker.Bind(":picker-date", pp)
	Return Me
End Sub

'set prev-icon
Sub SetPrevIcon(varPrevIcon As Object) As VMDatePicker
	Dim pp As String = $"${ID}PrevIcon"$
	vue.SetStateSingle(pp, varPrevIcon)
	DatePicker.Bind(":prev-icon", pp)
	Return Me
End Sub

'set range
Sub SetRange(varRange As Object) As VMDatePicker
	Dim pp As String = $"${ID}Range"$
	vue.SetStateSingle(pp, varRange)
	DatePicker.Bind(":range", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMDatePicker
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	DatePicker.Bind(":readonly", pp)
	Return Me
End Sub

'set scrollable
Sub SetScrollable(varScrollable As Object) As VMDatePicker
	Dim pp As String = $"${ID}Scrollable"$
	vue.SetStateSingle(pp, varScrollable)
	DatePicker.Bind(":scrollable", pp)
	Return Me
End Sub

'set selected-items-text
Sub SetSelectedItemsText(varSelectedItemsText As Object) As VMDatePicker
	Dim pp As String = $"${ID}SelectedItemsText"$
	vue.SetStateSingle(pp, varSelectedItemsText)
	DatePicker.Bind(":selected-items-text", pp)
	Return Me
End Sub

'set show-current
Sub SetShowCurrent(varShowCurrent As Object) As VMDatePicker
	Dim pp As String = $"${ID}ShowCurrent"$
	vue.SetStateSingle(pp, varShowCurrent)
	DatePicker.Bind(":show-current", pp)
	Return Me
End Sub

'set show-week
Sub SetShowWeek(varShowWeek As Object) As VMDatePicker
	Dim pp As String = $"${ID}ShowWeek"$
	vue.SetStateSingle(pp, varShowWeek)
	DatePicker.Bind(":show-week", pp)
	Return Me
End Sub

'set title-date-format
Sub SetTitleDateFormat(varTitleDateFormat As Object) As VMDatePicker
	Dim pp As String = $"${ID}TitleDateFormat"$
	vue.SetStateSingle(pp, varTitleDateFormat)
	DatePicker.Bind(":title-date-format", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As Object) As VMDatePicker
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	DatePicker.Bind(":type", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMDatePicker
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	DatePicker.Bind(":value", pp)
	Return Me
End Sub

'set weekday-format
Sub SetWeekdayFormat(varWeekdayFormat As Object) As VMDatePicker
	Dim pp As String = $"${ID}WeekdayFormat"$
	vue.SetStateSingle(pp, varWeekdayFormat)
	DatePicker.Bind(":weekday-format", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMDatePicker
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	DatePicker.Bind(":width", pp)
	Return Me
End Sub

'set year-format
Sub SetYearFormat(varYearFormat As Object) As VMDatePicker
	Dim pp As String = $"${ID}YearFormat"$
	vue.SetStateSingle(pp, varYearFormat)
	DatePicker.Bind(":year-format", pp)
	Return Me
End Sub

'set year-icon
Sub SetYearIcon(varYearIcon As Object) As VMDatePicker
	Dim pp As String = $"${ID}YearIcon"$
	vue.SetStateSingle(pp, varYearIcon)
	DatePicker.Bind(":year-icon", pp)
	Return Me
End Sub

'
Sub SetOnChange(methodName As String) As VMDatePicker
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
Sub SetOnClickDate(methodName As String) As VMDatePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:date": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickMonth(methodName As String) As VMDatePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:month": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnDblclickMonth(methodName As String) As VMDatePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:dblclick:month": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnDblclickDate(methodName As String) As VMDatePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:dblclick:date": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMDatePicker
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
Sub SetOnUpdatePickerDate(methodName As String) As VMDatePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:picker-date": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMDatePicker
	DatePicker.SetVisible(False)
	Return Me
End Sub

Sub Show As VMDatePicker
	DatePicker.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMDatePicker
	DatePicker.Enable(True)
	Return Me
End Sub

Sub Disable As VMDatePicker
	DatePicker.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMDatePicker
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMDatePicker
	DatePicker.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMDatePicker
	DatePicker.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMDatePicker
	DatePicker.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMDatePicker
	DatePicker.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMDatePicker
	DatePicker.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMDatePicker
	DatePicker.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMDatePicker
	DatePicker.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMDatePicker
	DatePicker.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMDatePicker
DatePicker.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMDatePicker
DatePicker.SetVisible(b)
Return Me
End Sub