B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public DateTimePicker As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bForInput As Boolean
	Private vmodel As String
	Public TextField As VMTextField
	Private bTimePicker As Boolean
	Private bDatePicker As Boolean
	Private bStatic As Boolean
	Private bHideIcons As Boolean
End Sub

'initialize the DateTimePicker
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDateTimePicker
	ID = sid.tolowercase
	DateTimePicker.Initialize(v, ID)
	DateTimePicker.SetTag("v-date-picker")
	DesignMode = False
	Module = eventHandler
	vue = v
	bForInput = False
	vmodel = ""
	DateTimePicker.typeOf = "datepicker"
	DateTimePicker.fieldType = "date"
	TextField.Initialize(vue, $"${ID}txt"$, Module)
	bTimePicker = False
	bDatePicker = True
	bStatic = False
	bHideIcons = False
	SetOnChange(Module, $"${ID}_change"$)
	SetOnClickDate($"${ID}_clickdate"$)
	SetOnClickMinute($"${ID}_clickminute"$)
	Return Me
End Sub

Sub SetData(prop As String, value As Object) As VMDateTimePicker
	vue.SetData(prop, value)
	Return Me
End Sub

'set autofocus
Sub SetAutofocus(varAutofocus As Boolean) As VMDateTimePicker
	If varAutofocus = False Then Return Me
	If bStatic Then
		TextField.SetAttrSingle("autofocus", varAutofocus)
	Else
		Dim pp As String = $"${ID}Autofocus"$
		vue.SetStateSingle(pp, varAutofocus)
		TextField.Bind(":autofocus", pp)
	End If
	Return Me
End Sub

Sub SetOnClickClear(eventHandler As Object, methodName As String) As VMDateTimePicker
	TextField.SetOnClickClear(eventHandler, methodName)
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMDateTimePicker
	bStatic = b
	TextField.SetStatic(b)
	Return Me
End Sub

Sub SetTimePicker As VMDateTimePicker
	bTimePicker = True
	bDatePicker = False
	DateTimePicker.SetTag("v-time-picker")
	DateTimePicker.typeOf = "timepicker"
	DateTimePicker.fieldType = "string"
	Return Me
End Sub

Sub SetDateTimePicker As VMDateTimePicker
	bTimePicker = False
	bDatePicker = False
	DateTimePicker.SetTag("v-datetime-picker")
	DateTimePicker.typeOf = "datetimepicker"
	DateTimePicker.fieldType = "string"
	SetForInput
	'
'	If vue.ModuleExist("v-datetime-picker") = False Then
'		Dim co As BANanoObject
'		co.Initialize("VuetifyDatetimePicker")
'		vue.AddComponentBO("v-datetime-picker", co)
'		vue.AddModule("v-datetime-picker")
'	End If
	Return Me
End Sub

Sub SetHideDetails(b As Boolean) As VMDateTimePicker
	TextField.SetHideDetails(b)
	Return Me
End Sub

Sub SetOutlined(b As Boolean) As VMDateTimePicker
	TextField.SetOutlined(b)
	Return Me
End Sub

Sub SetDate As VMDateTimePicker
	DateTimePicker.fieldType = "date"
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMDateTimePicker
	DateTimePicker.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMDateTimePicker
	DateTimePicker.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMDateTimePicker
	DateTimePicker.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMDateTimePicker
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMDateTimePicker
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetLabel(dlabel As String) As VMDateTimePicker
	TextField.SetLabel(dlabel)
	Return Me
End Sub

'the date picker should be for date input
Sub SetForInput As VMDateTimePicker
	bForInput = True
	Return Me
End Sub

Sub SetMonthPicker As VMDateTimePicker
	SetType("month")
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMDateTimePicker
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMDateTimePicker
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		DateTimePicker.SetAttrSingle("color", scolor)
		Return Me
	End If	
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	DateTimePicker.Bind(":color", pp)
	Return Me
End Sub

Sub SetHeaderColorIntensity(varColor As String, varIntensity As String) As VMDateTimePicker
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		DateTimePicker.SetAttrSingle("header-color", scolor)
		Return Me
	End If	
	Dim pp As String = $"${ID}HeaderColor"$
	vue.SetStateSingle(pp, scolor)
	DateTimePicker.Bind(":header-color", pp)
	Return Me
End Sub

'set required
Sub SetRequired(varRequired As Boolean) As VMDateTimePicker
	TextField.SetRequired(varRequired)
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Boolean) As VMDateTimePicker
	TextField.SetClearable(varClearable)
	Return Me
End Sub

'set placeholder
Sub SetPlaceholder(varPlaceholder As String) As VMDateTimePicker
	If varPlaceholder = "" Then Return Me
	TextField.SetPlaceholder(varPlaceholder)
	Return Me
End Sub


'set placeholder
Sub SetHint(varHint As String) As VMDateTimePicker
	TextField.SetHint(varHint)
	Return Me
End Sub


'set dense
Sub SetDense(b As Boolean) As VMDateTimePicker
	TextField.SetDense(b)
	Return Me
End Sub

'get component
Sub ToString As String
	If vue.ShowWarnings Then
	Dim eName As String = $"${ID}_change"$
	If SubExists(Module, eName) = False Then
		Log($"VMDateTimePicker.${eName} event has not been defined!"$)
	End If
	eName = $"${ID}_clickdate"$
	If SubExists(Module, eName) = False Then
		Log($"VMDateTimePicker.${eName} event has not been defined!"$)
	End If
	End If
	If bForInput Then
		If DateTimePicker.typeOf = "datetimepicker" Then
			Return DateTimePicker.ToString
		End If
		'create a menu
		vue.SetStateSingle($"${ID}menu"$, False)
		Dim dMenu As VMElement
		dMenu.Initialize(vue, $"${ID}menu"$).SetTag("v-menu")
		dMenu.SetStatic(bStatic)
		dMenu.SetDesignMode(DesignMode)
		dMenu.SetAttrSingle("ref", $"${ID}menu"$)
		dMenu.SetVModel($"${ID}menu"$)
		dMenu.SetAttrSingle(":close-on-content-click", False)
		'dMenu.SetAttrSingle(":nudge-right", "40")
		dMenu.SetAttrSingle(":return-value.sync", vmodel)
		dMenu.SetAttrSingle("transition", "scale-transition")
		dMenu.SetAttrloose("offset-y")
		dMenu.SetAttrSingle("min-width", "290px")
		dMenu.SetAttrSingle("max-width", "290px")
		'
		Dim tmpl As VMTemplate
		tmpl.Initialize(vue, $"${ID}tmpl"$, Module)
		tmpl.SetStatic(bStatic)
		tmpl.SetDesignMode(DesignMode)
		tmpl.SetSlotActivator1($"on"$)
		'
		TextField.SetAttrSingle("v-on", $"on"$)
		'TextField.SetAttrSingle("v-bind", "attrs")
		'TextField.SetAttrSingle("@blur", $"${ID}menu = false"$)
		If bHideIcons = False Then
			If bTimePicker Then
				TextField.SetAppendIcon("schedule")
				TextField.SetAttrSingle("@click:append", $"${ID}menu = !${ID}menu"$)
			Else
				TextField.SetAppendIcon("today")
				TextField.SetAttrSingle("@click:append", $"${ID}menu = !${ID}menu"$)
			End If
		End If
		'
		If bTimePicker Then
		Else
			TextField.SetAttrSingle("v-model", $"${ID}date"$)
			vue.SetMethod(Me, "formatDate")
			vue.SetComputed($"${ID}date"$, Me, "computedDateFormatted")
		End If
		'
		TextField.Pop(tmpl.Template)
		dMenu.SetText(tmpl.ToString)
		'
		DateTimePicker.SetVIf($"${ID}menu"$)
		Dim ssave As String = "$refs." & ID & "menu.save(" & vmodel & ")"
		If bTimePicker Then
			DateTimePicker.SetAttrSingle("@click:minute", ssave)
		Else
			DateTimePicker.SetAttrLoose("scrollable")
			DateTimePicker.SetAttrSingle("@click:date", ssave)
		End If
		'
		dMenu.SetText(DateTimePicker.ToString)
		Return dMenu.tostring
	Else
		Return DateTimePicker.ToString
	End If
End Sub

private Sub computedDateFormatted As String
	Try
		'get the saved model
		Dim rdate As String = vue.GetData(vmodel)
		If rdate = "" Then Return ""
		Return vue.RunMethod("formatDate", Array(rdate)).Result
	Catch
		Return ""
	End Try
End Sub

'format the date
private Sub formatDate(date As Object) As String
	Try
		date = "" & date
		If date = "" Then Return Null
	    If BANano.isnull(date) Or BANano.IsUndefined(date) Then Return Null 
		Dim bo As BANanoObject = BANano.RunJavascriptMethod("dayjs", Array(date))
		Dim sdf As String = vue.DateDisplayFormat
		If sdf = "" Then sdf = "YYYY-MM-DD"
		Dim sdate As String = bo.RunMethod("format", Array(sdf)).Result
		Return sdate
	Catch
		Return ""
	End Try
End Sub

private Sub AddSpacer As VMDateTimePicker
	DateTimePicker.AddSpacer
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMDateTimePicker
	DateTimePicker.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetVModel(k As String) As VMDateTimePicker
	k =k.tolowercase
	DateTimePicker.SetVModel(k)
	TextField.SetVModel(k)
	vmodel = k
	Return Me
End Sub

Sub SetVIf(vif As String) As VMDateTimePicker
	DateTimePicker.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMDateTimePicker
	DateTimePicker.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMDateTimePicker
	Dim childHTML As String = child.ToString
	DateTimePicker.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMDateTimePicker
	DateTimePicker.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMDateTimePicker
	DateTimePicker.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDateTimePicker
	DateTimePicker.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMDateTimePicker
	DateTimePicker.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set allowed-dates
Sub SetAllowedDates(varAllowedDates As Object) As VMDateTimePicker
	Dim pp As String = $"${ID}AllowedDates"$
	vue.SetStateSingle(pp, varAllowedDates)
	DateTimePicker.Bind(":allowed-dates", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMDateTimePicker
	If varColor = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	DateTimePicker.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMDateTimePicker
	If varDark = False Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	DateTimePicker.Bind(":dark", pp)
	Return Me
End Sub

'set day-format
Sub SetDayFormat(varDayFormat As String) As VMDateTimePicker
	If varDayFormat = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("day-format", varDayFormat)
		Return Me
	End If
	Dim pp As String = $"${ID}DayFormat"$
	vue.SetStateSingle(pp, varDayFormat)
	DateTimePicker.Bind(":day-format", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMDateTimePicker
	DateTimePicker.SetDisabled(varDisabled)
	Return Me
End Sub

'set event-color
Sub SetEventColor(varEventColor As String) As VMDateTimePicker
	If varEventColor = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("event-color", varEventColor)
		Return Me
	End If
	Dim pp As String = $"${ID}EventColor"$
	vue.SetStateSingle(pp, varEventColor)
	DateTimePicker.Bind(":event-color", pp)
	Return Me
End Sub

'set events
Sub SetEvents(varEvents As Object) As VMDateTimePicker
	Dim pp As String = $"${ID}Events"$
	vue.SetStateSingle(pp, varEvents)
	DateTimePicker.Bind(":events", pp)
	Return Me
End Sub

'set first-day-of-week
Sub SetFirstDayOfWeek(varFirstDayOfWeek As String) As VMDateTimePicker
	If varFirstDayOfWeek = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("first-day-of-week", varFirstDayOfWeek)
		Return Me
	End If
	Dim pp As String = $"${ID}FirstDayOfWeek"$
	vue.SetStateSingle(pp, varFirstDayOfWeek)
	DateTimePicker.Bind(":first-day-of-week", pp)
	Return Me
End Sub

'set full-width
Sub SetFullWidth(varFullWidth As Boolean) As VMDateTimePicker
	If varFullWidth = False Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("full-width", varFullWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}FullWidth"$
	vue.SetStateSingle(pp, varFullWidth)
	DateTimePicker.Bind(":full-width", pp)
	Return Me
End Sub

'set header-color
Sub SetHeaderColor(varHeaderColor As String) As VMDateTimePicker
	If varHeaderColor = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("header-color", varHeaderColor)
		Return Me
	End If
	Dim pp As String = $"${ID}HeaderColor"$
	vue.SetStateSingle(pp, varHeaderColor)
	DateTimePicker.Bind(":header-color", pp)
	Return Me
End Sub

'set hader-date-format
Sub SetHaderDateFormat(varHaderDateFormat As String) As VMDateTimePicker
	If varHaderDateFormat = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("hader-date-format", varHaderDateFormat)
		Return Me
	End If
	Dim pp As String = $"${ID}HaderDateFormat"$
	vue.SetStateSingle(pp, varHaderDateFormat)
	DateTimePicker.Bind(":hader-date-format", pp)
	Return Me
End Sub

'set landscape
Sub SetLandscape(varLandscape As Boolean) As VMDateTimePicker
	If varLandscape = False Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("landscape", varLandscape)
		Return Me
	End If
	Dim pp As String = $"${ID}Landscape"$
	vue.SetStateSingle(pp, varLandscape)
	DateTimePicker.Bind(":landscape", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMDateTimePicker
	If varLight = False Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	DateTimePicker.Bind(":light", pp)
	Return Me
End Sub

'set locale
Sub SetLocale(varLocale As String) As VMDateTimePicker
	If varLocale = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("locale", varLocale)
		Return Me
	End If
	Dim pp As String = $"${ID}Locale"$
	vue.SetStateSingle(pp, varLocale)
	DateTimePicker.Bind(":locale", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As String) As VMDateTimePicker
	If varMax = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("max", varMax)
		Return Me
	End If
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	DateTimePicker.Bind(":max", pp)
	Return Me
End Sub

'set min
Sub SetMin(varMin As String) As VMDateTimePicker
	If varMin = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("min", varMin)
		Return Me
	End If
	Dim pp As String = $"${ID}Min"$
	vue.SetStateSingle(pp, varMin)
	DateTimePicker.Bind(":min", pp)
	Return Me
End Sub

'set month-format
Sub SetMonthFormat(varMonthFormat As String) As VMDateTimePicker
	If varMonthFormat = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("month-format", varMonthFormat)
		Return Me
	End If
	Dim pp As String = $"${ID}MonthFormat"$
	vue.SetStateSingle(pp, varMonthFormat)
	DateTimePicker.Bind(":month-format", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Boolean) As VMDateTimePicker
	If varMultiple = False Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("multiple", varMultiple)
		Return Me
	End If
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	DateTimePicker.Bind(":multiple", pp)
	Return Me
End Sub

'set next-icon
Sub SetNextIcon(varNextIcon As String) As VMDateTimePicker
	If varNextIcon = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("next-icon", varNextIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}NextIcon"$
	vue.SetStateSingle(pp, varNextIcon)
	DateTimePicker.Bind(":next-icon", pp)
	Return Me
End Sub

'set no-title
Sub SetNoTitle(varNoTitle As Boolean) As VMDateTimePicker
	If varNoTitle = False Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("no-title", varNoTitle)
		Return Me
	End If
	Dim pp As String = $"${ID}NoTitle"$
	vue.SetStateSingle(pp, varNoTitle)
	DateTimePicker.Bind(":no-title", pp)
	Return Me
End Sub

'set picker-date
Sub SetPickerDate(varPickerDate As String) As VMDateTimePicker
	If varPickerDate = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("picker-date", varPickerDate)
		Return Me
	End If
	Dim pp As String = $"${ID}PickerDate"$
	vue.SetStateSingle(pp, varPickerDate)
	DateTimePicker.Bind(":picker-date", pp)
	Return Me
End Sub

'set prev-icon
Sub SetPrevIcon(varPrevIcon As String) As VMDateTimePicker
	If varPrevIcon = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("prev-icon", varPrevIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}PrevIcon"$
	vue.SetStateSingle(pp, varPrevIcon)
	DateTimePicker.Bind(":prev-icon", pp)
	Return Me
End Sub

'set range
Sub SetRange(varRange As Boolean) As VMDateTimePicker
	If varRange = False Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("range", varRange)
		Return Me
	End If
	Dim pp As String = $"${ID}Range"$
	vue.SetStateSingle(pp, varRange)
	DateTimePicker.Bind(":range", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Boolean) As VMDateTimePicker
	bHideIcons = varReadonly
	If bStatic Then
		TextField.SetAttrSingle("readonly", varReadonly)
		Return Me
	End If
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	TextField.Bind(":readonly", pp)
	DateTimePicker.Bind(":readonly", pp)
	Return Me
End Sub

'set scrollable
Sub SetScrollable(varScrollable As Boolean) As VMDateTimePicker
	If varScrollable = False Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("scrollable", varScrollable)
		Return Me
	End If
	Dim pp As String = $"${ID}Scrollable"$
	vue.SetStateSingle(pp, varScrollable)
	DateTimePicker.Bind(":scrollable", pp)
	Return Me
End Sub

'set selected-items-text
Sub SetSelectedItemsText(varSelectedItemsText As String) As VMDateTimePicker
	If varSelectedItemsText = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("selected-items-text", varSelectedItemsText)
		Return Me
	End If
	Dim pp As String = $"${ID}SelectedItemsText"$
	vue.SetStateSingle(pp, varSelectedItemsText)
	DateTimePicker.Bind(":selected-items-text", pp)
	Return Me
End Sub

'set show-current
Sub SetShowCurrent(varShowCurrent As Boolean) As VMDateTimePicker
	If varShowCurrent = False Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("show-current", varShowCurrent)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowCurrent"$
	vue.SetStateSingle(pp, varShowCurrent)
	DateTimePicker.Bind(":show-current", pp)
	Return Me
End Sub

'set show-week
Sub SetShowWeek(varShowWeek As Boolean) As VMDateTimePicker
	If varShowWeek = False Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("show-week", varShowWeek)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowWeek"$
	vue.SetStateSingle(pp, varShowWeek)
	DateTimePicker.Bind(":show-week", pp)
	Return Me
End Sub

'set title-date-format
Sub SetTitleDateFormat(varTitleDateFormat As String) As VMDateTimePicker
	If varTitleDateFormat = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("title-date-format", varTitleDateFormat)
		Return Me
	End If
	Dim pp As String = $"${ID}TitleDateFormat"$
	vue.SetStateSingle(pp, varTitleDateFormat)
	DateTimePicker.Bind(":title-date-format", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As String) As VMDateTimePicker
	If varType = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("type", varType)
		Return Me
	End If
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	DateTimePicker.Bind(":type", pp)
	Return Me
End Sub


Sub SetFieldType(ft As String) As VMDateTimePicker
	DateTimePicker.fieldType = ft
	Return Me
End Sub

Sub GetValue As String
	Dim svalue As String = vue.GetData(vmodel)
	Return svalue
End Sub

'set value
Sub SetValue(varValue As String) As VMDateTimePicker
	DateTimePicker.SetValue(varValue,False)
	TextField.SetValue(varValue)
	If bStatic Then
		SetAttrSingle("value", varValue)
		Return Me
	End If
	If vmodel = "" Then
		vmodel = $"${ID}value"$
		SetVModel(vmodel)
	End If
	vue.SetData(vmodel, varValue)
	Return Me
End Sub

Sub SetIsNow(b As Boolean) As VMDateTimePicker
	If b = False Then Return Me
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	Select Case bTimePicker
	Case False
		'is date picker
		DateTime.DateFormat = "yyyy-MM-dd"
		dt = DateTime.Date(lNow)
		SetValue(dt)
	Case True
		'is time picker
		DateTime.DateFormat = "HH:mm"
		dt = DateTime.Date(lNow)
		SetValue(dt)
	End Select
	Return Me
End Sub

'set weekday-format
Sub SetWeekdayFormat(varWeekdayFormat As String) As VMDateTimePicker
	If varWeekdayFormat = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("weekday-format", varWeekdayFormat)
		Return Me
	End If
	Dim pp As String = $"${ID}WeekdayFormat"$
	vue.SetStateSingle(pp, varWeekdayFormat)
	DateTimePicker.Bind(":weekday-format", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As String) As VMDateTimePicker
	If varWidth = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("width", varWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	DateTimePicker.Bind(":width", pp)
	Return Me
End Sub

'set year-format
Sub SetYearFormat(varYearFormat As String) As VMDateTimePicker
	If varYearFormat = "" Then Return Me
	If bStatic Then 
		DateTimePicker.SetAttrSingle("year-format", varYearFormat)
		Return Me
	End If
	Dim pp As String = $"${ID}YearFormat"$
	vue.SetStateSingle(pp, varYearFormat)
	DateTimePicker.Bind(":year-format", pp)
	Return Me
End Sub

'set year-icon
Sub SetYearIcon(varYearIcon As String) As VMDateTimePicker
	If varYearIcon = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("year-icon", varYearIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}YearIcon"$
	vue.SetStateSingle(pp, varYearIcon)
	DateTimePicker.Bind(":year-icon", pp)
	Return Me
End Sub

'
Sub SetOnChange(eventHandler As Object, methodName As String) As VMDateTimePicker
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickDate(methodName As String) As VMDateTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click:date": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickMonth(methodName As String) As VMDateTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click:month": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnDblclickMonth(methodName As String) As VMDateTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@dblclick:month": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnDblclickDate(methodName As String) As VMDateTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@dblclick:date": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMDateTimePicker
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
Sub SetOnUpDatePickerDate(methodName As String) As VMDateTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:picker-date": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMDateTimePicker
	DateTimePicker.SetVisible(False)
	Return Me
End Sub

Sub Show As VMDateTimePicker
	DateTimePicker.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMDateTimePicker
	DateTimePicker.Enable(True)
	Return Me
End Sub

Sub Disable As VMDateTimePicker
	DateTimePicker.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMDateTimePicker
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMDateTimePicker
	DateTimePicker.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMDateTimePicker
	DateTimePicker.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMDateTimePicker
	DateTimePicker.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMDateTimePicker
	DateTimePicker.SetDesignMode(b)
	DesignMode = b
	TextField.SetDesignMode(b)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMDateTimePicker
	DateTimePicker.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMDateTimePicker
	DateTimePicker.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMDateTimePicker
	DateTimePicker.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMDateTimePicker
	DateTimePicker.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMDateTimePicker
DateTimePicker.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMDateTimePicker
DateTimePicker.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMDateTimePicker
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMDateTimePicker
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub


'set allowed-hours
Sub SetAllowedHours(varAllowedHours As Object) As VMDateTimePicker
	Dim pp As String = $"${ID}AllowedHours"$
	vue.SetStateSingle(pp, varAllowedHours)
	DateTimePicker.Bind(":allowed-hours", pp)
	Return Me
End Sub

'set allowed-minutes
Sub SetAllowedMinutes(varAllowedMinutes As Object) As VMDateTimePicker
	Dim pp As String = $"${ID}AllowedMinutes"$
	vue.SetStateSingle(pp, varAllowedMinutes)
	DateTimePicker.Bind(":allowed-minutes", pp)
	Return Me
End Sub

'set allowed-seconds
Sub SetAllowedSeconds(varAllowedSeconds As Object) As VMDateTimePicker
	Dim pp As String = $"${ID}AllowedSeconds"$
	vue.SetStateSingle(pp, varAllowedSeconds)
	DateTimePicker.Bind(":allowed-seconds", pp)
	Return Me
End Sub

'set ampm-in-title
Sub SetAmPmInTitle(varAmpmInTitle As Boolean) As VMDateTimePicker
	If bStatic Then
		DateTimePicker.SetAttrSingle("ampm-in-title", varAmpmInTitle)
		Return Me
	End If
	Dim pp As String = $"${ID}AmpmInTitle"$
	vue.SetStateSingle(pp, varAmpmInTitle)
	DateTimePicker.Bind(":ampm-in-title", pp)
	Return Me
End Sub


'set format
Sub SetFormat(varFormat As String) As VMDateTimePicker
	If varFormat = "" Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("format", varFormat)
		Return Me
	End If
	Dim pp As String = $"${ID}Format"$
	vue.SetStateSingle(pp, varFormat)
	DateTimePicker.Bind(":format", pp)
	Return Me
End Sub


'set user-seconds
Sub SetUseSeconds(varUserSeconds As Object) As VMDateTimePicker
	If varUserSeconds = False Then Return Me
	If bStatic Then
		DateTimePicker.SetAttrSingle("use-seconds", varUserSeconds)
		Return Me
	End If
	Dim pp As String = $"${ID}UserSeconds"$
	vue.SetStateSingle(pp, varUserSeconds)
	DateTimePicker.Bind(":use-seconds", pp)
	Return Me
End Sub


Sub SetOnClickHour(methodName As String) As VMDateTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click:hour": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickMinute(methodName As String) As VMDateTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click:minute": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickSecond(methodName As String) As VMDateTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click:second": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdatePeriod(methodName As String) As VMDateTimePicker
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:period": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Set24 As VMDateTimePicker
	SetFormat("24hr")
	Return Me
End Sub
