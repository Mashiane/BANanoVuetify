B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Calendar As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
	Private focus As String
	Private events As List
	Private eventsName As String
	Private categories As List
	Private categoryName As String
	Private catmap As Map
End Sub

'initialize the Calendar
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCalendar
	ID = sid.tolowercase
	Calendar.Initialize(v, ID)
	Calendar.SetTag("v-calendar")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	focus = $"${ID}focus"$
	SetVModel(focus)
	vue.SetData(focus, "")
	events = vue.newlist
	SetType("month")
	SetOnChange
	SetOnClickDate
	SetOnClickMore
	SetOnClickEvent
	eventsName = $"${ID}events"$
	categoryName = $"${ID}categories"$
	categories.Initialize 
	SetCategories(categories)
	SetEvents(events)
	catmap.Initialize
	SetAttrSingle(":event-color", "geteventcolor")
	vue.SetMethod(Me, "geteventcolor")
	Return Me
End Sub

Sub SetData(prop As String, value As Object) As VMCalendar
	vue.SetData(prop, value)
	Return Me
End Sub


Sub geteventcolor(e As Map) As String
	Dim ecolor As String = e.Get("color")
	Return ecolor
End Sub

Sub AddEvent(eID As String, eCategory As String, eName As String, eStartDT As String, eEndDT As String, eAllDay As Boolean)
	Dim catColor As String 
	If catmap.ContainsKey(eCategory) Then
		catColor = catmap.Get(eCategory)
	Else
		catColor = "primary"
	End If
	Dim em As Map = CreateMap()
	em.Put("id", eID)
	em.Put("name", eName)
	em.Put("start", eStartDT)
	em.Put("end", eEndDT)
	em.put("color", catColor)
	em.Put("timed", eAllDay)
	em.Put("category", eCategory)
	events.Add(em)
End Sub

Sub ClearCategories
	categories.Clear
	vue.SetData(categoryName, categories)
	catmap.clear
End Sub

Sub AddCategory(catName As String, catColor As String)
	categories.Add(catName)
	catmap.Put(catName, catColor)
End Sub

Sub WeekView
	SetType("week")
End Sub


Sub DayView
	SetType("day")
End Sub

Sub MonthView
	SetType("month")
End Sub

'get title
Sub GetTitle As String
	Dim sTitle As String = vue.refs.GetField(ID).GetField("title").Result
	Return sTitle
End Sub

'check change
Sub CheckChange
	vue.refs.GetField(ID).RunMethod("checkChange", Null)
End Sub

'show previous
Sub ShowPrevious
	vue.refs.GetField(ID).RunMethod("prev", Null)
End Sub

'show next
Sub ShowNext
	vue.refs.GetField(ID).RunMethod("next", Null)
End Sub

'select a date
Sub SelectDate(selDate As Object)
	vue.SetData(focus, selDate)
	SetType("day")
End Sub

'select today
Sub SelectToday
	vue.SetData(focus, "")
End Sub

'clear the events
Sub ClearEvents
	events.clear
	vue.SetData(eventsName, events)
End Sub

'update events
Sub Update
	vue.SetData(eventsName, events)
	vue.SetData(categoryName, categories)
End Sub

'get component
Sub ToString As String
	If vue.ShowWarnings Then
	Dim eName As String = $"${ID}_change"$
	If SubExists(Module, eName) = False Then
		Log($"VMCalendar.${eName} event has not been defined!"$)
	End If
	eName = $"${ID}_clickdate"$
	If SubExists(Module, eName) = False Then
		Log($"VMCalendar.${eName} event has not been defined!"$)
	End If
	eName = $"${ID}_clickmore"$
	If SubExists(Module, eName) = False Then
		Log($"VMCalendar.${eName} event has not been defined!"$)
	End If
	eName = $"${ID}_clickevent"$
	If SubExists(Module, eName) = False Then
		Log($"VMCalendar.${eName} event has not been defined!"$)
	End If
	End If
	Return Calendar.ToString
End Sub

Sub SetVModel(k As String) As VMCalendar
	Calendar.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMCalendar
	Calendar.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMCalendar
	Calendar.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCalendar
	Dim childHTML As String = child.ToString
	Calendar.SetText(childHTML)
	Return Me
End Sub

'set text - built-in
Sub SetText(t As String) As VMCalendar
	Calendar.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCalendar
	Calendar.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCalendar
	Calendar.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCalendar
	Calendar.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set categories
Sub SetCategories(varCategories As List) As VMCalendar
	Dim pp As String = $"${ID}Categories"$
	vue.SetStateSingle(pp, varCategories)
	Calendar.Bind(":categories", pp)
	Return Me
End Sub

'set category-days
Sub SetCategoryDays(varCategoryDays As String) As VMCalendar
	If varCategoryDays = "" Then Return Me
	If varCategoryDays = "1" Then Return Me
	If bStatic Then
		SetAttrSingle("category-days", varCategoryDays)
		Return Me
	End If
	Dim pp As String = $"${ID}CategoryDays"$
	vue.SetStateSingle(pp, varCategoryDays)
	Calendar.Bind(":category-days", pp)
	Return Me
End Sub

'set category-for-invalid
Sub SetCategoryForInvalid(varCategoryForInvalid As String) As VMCalendar
	If varCategoryForInvalid = "" Then Return Me
	If bStatic Then
		SetAttrSingle("category-for-invalid", varCategoryForInvalid)
		Return Me
	End If
	Dim pp As String = $"${ID}CategoryForInvalid"$
	vue.SetStateSingle(pp, varCategoryForInvalid)
	Calendar.Bind(":category-for-invalid", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMCalendar
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Calendar.Bind(":color", pp)
	Return Me
End Sub

'set end
Sub SetEnd(varEnd As String) As VMCalendar
	If varEnd = "" Then Return Me
	If bStatic Then
		SetAttrSingle("end", varEnd)
		Return Me
	End If
	Dim pp As String = $"${ID}End"$
	vue.SetStateSingle(pp, varEnd)
	Calendar.Bind(":end", pp)
	Return Me
End Sub

'set event-category
Sub SetEventCategory(varEventCategory As String) As VMCalendar
	If varEventCategory = "" Then Return Me
	If varEventCategory = "category" Then Return Me
	If bStatic Then
		SetAttrSingle("event-category", varEventCategory)
		Return Me
	End If
	Dim pp As String = $"${ID}EventCategory"$
	vue.SetStateSingle(pp, varEventCategory)
	Calendar.Bind(":event-category", pp)
	Return Me
End Sub

'set event-color
Sub SetEventColor(varEventColor As String) As VMCalendar
	If varEventColor = "" Then Return Me
	If varEventColor = "primary" Then Return Me
	If bStatic Then
		SetAttrSingle("event-color", varEventColor)
		Return Me
	End If
	Dim pp As String = $"${ID}EventColor"$
	vue.SetStateSingle(pp, varEventColor)
	Calendar.Bind(":event-color", pp)
	Return Me
End Sub

'set event-end
Sub SetEventEnd(varEventEnd As String) As VMCalendar
	If varEventEnd = "" Then Return Me
	If varEventEnd = "end" Then Return Me
	If bStatic Then
		SetAttrSingle("event-end", varEventEnd)
		Return Me
	End If
	Dim pp As String = $"${ID}EventEnd"$
	vue.SetStateSingle(pp, varEventEnd)
	Calendar.Bind(":event-end", pp)
	Return Me
End Sub

'set event-height
Sub SetEventHeight(varEventHeight As String) As VMCalendar
	If varEventHeight = "" Then Return Me
	If varEventHeight = "20" Then Return Me
	If bStatic Then
		SetAttrSingle("event-height", varEventHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}EventHeight"$
	vue.SetStateSingle(pp, varEventHeight)
	Calendar.Bind(":event-height", pp)
	Return Me
End Sub

'set event-margin-bottom
Sub SetEventMarginBottom(varEventMarginBottom As String) As VMCalendar
	If varEventMarginBottom = "" Then Return Me
	If varEventMarginBottom = "1" Then Return Me
	If bStatic Then
		SetAttrSingle("event-margin-bottom", varEventMarginBottom)
		Return Me
	End If
	Dim pp As String = $"${ID}EventMarginBottom"$
	vue.SetStateSingle(pp, varEventMarginBottom)
	Calendar.Bind(":event-margin-bottom", pp)
	Return Me
End Sub

'set event-more-text
Sub SetEventMoreText(varEventMoreText As String) As VMCalendar
	If varEventMoreText = "" Then Return Me
	If varEventMoreText = "$vuetify.calendar.moreEvents" Then Return Me
	If bStatic Then
		SetAttrSingle("event-more-text", varEventMoreText)
		Return Me
	End If
	Dim pp As String = $"${ID}EventMoreText"$
	vue.SetStateSingle(pp, varEventMoreText)
	Calendar.Bind(":event-more-text", pp)
	Return Me
End Sub

'set event-name
Sub SetEventName(varEventName As String) As VMCalendar
	If varEventName = "" Then Return Me
	If varEventName = "name" Then Return Me
	If bStatic Then
		SetAttrSingle("event-name", varEventName)
		Return Me
	End If
	Dim pp As String = $"${ID}EventName"$
	vue.SetStateSingle(pp, varEventName)
	Calendar.Bind(":event-name", pp)
	Return Me
End Sub

'set event-overlap-mode
Sub SetEventOverlapMode(varEventOverlapMode As String) As VMCalendar
	If varEventOverlapMode = "" Then Return Me
	If varEventOverlapMode = "stack" Then Return Me
	If bStatic Then
		SetAttrSingle("event-overlap-mode", varEventOverlapMode)
		Return Me
	End If
	Dim pp As String = $"${ID}EventOverlapMode"$
	vue.SetStateSingle(pp, varEventOverlapMode)
	Calendar.Bind(":event-overlap-mode", pp)
	Return Me
End Sub

'set event-overlap-threshold
Sub SetEventOverlapThreshold(varEventOverlapThreshold As String) As VMCalendar
	If varEventOverlapThreshold = "" Then Return Me
	If varEventOverlapThreshold = "60" Then Return Me
	If bStatic Then
		SetAttrSingle("event-overlap-threshold", varEventOverlapThreshold)
		Return Me
	End If
	Dim pp As String = $"${ID}EventOverlapThreshold"$
	vue.SetStateSingle(pp, varEventOverlapThreshold)
	Calendar.Bind(":event-overlap-threshold", pp)
	Return Me
End Sub

'set event-start
Sub SetEventStart(varEventStart As String) As VMCalendar
	If varEventStart = "" Then Return Me
	If varEventStart = "start" Then Return Me
	If bStatic Then
		SetAttrSingle("event-start", varEventStart)
		Return Me
	End If
	Dim pp As String = $"${ID}EventStart"$
	vue.SetStateSingle(pp, varEventStart)
	Calendar.Bind(":event-start", pp)
	Return Me
End Sub

'set event-text-color
Sub SetEventTextColor(varEventTextColor As String) As VMCalendar
	If varEventTextColor = "" Then Return Me
	If varEventTextColor = "white" Then Return Me
	If bStatic Then
		SetAttrSingle("event-text-color", varEventTextColor)
		Return Me
	End If
	Dim pp As String = $"${ID}EventTextColor"$
	vue.SetStateSingle(pp, varEventTextColor)
	Calendar.Bind(":event-text-color", pp)
	Return Me
End Sub

'set event-timed
Sub SetEventTimed(varEventTimed As String) As VMCalendar
	If varEventTimed = "" Then Return Me
	If varEventTimed = "timed" Then Return Me
	If bStatic Then
		SetAttrSingle("event-timed", varEventTimed)
		Return Me
	End If
	Dim pp As String = $"${ID}EventTimed"$
	vue.SetStateSingle(pp, varEventTimed)
	Calendar.Bind(":event-timed", pp)
	Return Me
End Sub

'set first-interval
Sub SetFirstInterval(varFirstInterval As String) As VMCalendar
	If varFirstInterval = "" Then Return Me
	If varFirstInterval = "0" Then Return Me
	If bStatic Then
		SetAttrSingle("first-interval", varFirstInterval)
		Return Me
	End If
	Dim pp As String = $"${ID}FirstInterval"$
	vue.SetStateSingle(pp, varFirstInterval)
	Calendar.Bind(":first-interval", pp)
	Return Me
End Sub

'set first-time
Sub SetFirstTime(varFirstTime As String) As VMCalendar
	If varFirstTime = "" Then Return Me
	If bStatic Then
		SetAttrSingle("first-time", varFirstTime)
		Return Me
	End If
	Dim pp As String = $"${ID}FirstTime"$
	vue.SetStateSingle(pp, varFirstTime)
	Calendar.Bind(":first-time", pp)
	Return Me
End Sub

'set interval-count
Sub SetIntervalCount(varIntervalCount As String) As VMCalendar
	If varIntervalCount = "" Then Return Me
	If varIntervalCount = "24" Then Return Me
	If bStatic Then
		SetAttrSingle("interval-count", varIntervalCount)
		Return Me
	End If
	Dim pp As String = $"${ID}IntervalCount"$
	vue.SetStateSingle(pp, varIntervalCount)
	Calendar.Bind(":interval-count", pp)
	Return Me
End Sub

'set interval-format
Sub SetIntervalFormat(varIntervalFormat As String) As VMCalendar
	If varIntervalFormat = "" Then Return Me
	If bStatic Then
		SetAttrSingle("interval-format", varIntervalFormat)
		Return Me
	End If
	Dim pp As String = $"${ID}IntervalFormat"$
	vue.SetStateSingle(pp, varIntervalFormat)
	Calendar.Bind(":interval-format", pp)
	Return Me
End Sub

'set interval-height
Sub SetIntervalHeight(varIntervalHeight As String) As VMCalendar
	If varIntervalHeight = "" Then Return Me
	If varIntervalHeight = "48" Then Return Me
	If bStatic Then
		SetAttrSingle("interval-height", varIntervalHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}IntervalHeight"$
	vue.SetStateSingle(pp, varIntervalHeight)
	Calendar.Bind(":interval-height", pp)
	Return Me
End Sub

'set interval-minutes
Sub SetIntervalMinutes(varIntervalMinutes As String) As VMCalendar
	If varIntervalMinutes = "" Then Return Me
	If varIntervalMinutes = "60" Then Return Me
	If bStatic Then
		SetAttrSingle("interval-minutes", varIntervalMinutes)
		Return Me
	End If
	Dim pp As String = $"${ID}IntervalMinutes"$
	vue.SetStateSingle(pp, varIntervalMinutes)
	Calendar.Bind(":interval-minutes", pp)
	Return Me
End Sub

'set interval-style
Sub SetIntervalStyle(varIntervalStyle As String) As VMCalendar
	If varIntervalStyle = "" Then Return Me
	If bStatic Then
		SetAttrSingle("interval-style", varIntervalStyle)
		Return Me
	End If
	Dim pp As String = $"${ID}IntervalStyle"$
	vue.SetStateSingle(pp, varIntervalStyle)
	Calendar.Bind(":interval-style", pp)
	Return Me
End Sub

'set interval-width
Sub SetIntervalWidth(varIntervalWidth As String) As VMCalendar
	If varIntervalWidth = "" Then Return Me
	If varIntervalWidth = "60" Then Return Me
	If bStatic Then
		SetAttrSingle("interval-width", varIntervalWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}IntervalWidth"$
	vue.SetStateSingle(pp, varIntervalWidth)
	Calendar.Bind(":interval-width", pp)
	Return Me
End Sub

'set locale
Sub SetLocale(varLocale As String) As VMCalendar
	If varLocale = "" Then Return Me
	If bStatic Then
		SetAttrSingle("locale", varLocale)
		Return Me
	End If
	Dim pp As String = $"${ID}Locale"$
	vue.SetStateSingle(pp, varLocale)
	Calendar.Bind(":locale", pp)
	Return Me
End Sub

'set locale-first-day-of-year
Sub SetLocaleFirstDayOfYear(varLocaleFirstDayOfYear As String) As VMCalendar
	If varLocaleFirstDayOfYear = "" Then Return Me
	If varLocaleFirstDayOfYear = "0" Then Return Me
	If bStatic Then
		SetAttrSingle("locale-first-day-of-year", varLocaleFirstDayOfYear)
		Return Me
	End If
	Dim pp As String = $"${ID}LocaleFirstDayOfYear"$
	vue.SetStateSingle(pp, varLocaleFirstDayOfYear)
	Calendar.Bind(":locale-first-day-of-year", pp)
	Return Me
End Sub

'set max-days
Sub SetMaxDays(varMaxDays As String) As VMCalendar
	If varMaxDays = "" Then Return Me
	If varMaxDays = "7" Then Return Me
	If bStatic Then
		SetAttrSingle("max-days", varMaxDays)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxDays"$
	vue.SetStateSingle(pp, varMaxDays)
	Calendar.Bind(":max-days", pp)
	Return Me
End Sub

'set min-weeks
Sub SetMinWeeks(varMinWeeks As String) As VMCalendar
	If varMinWeeks = "" Then Return Me
	If varMinWeeks = "1" Then Return Me
	If bStatic Then
		SetAttrSingle("min-weeks", varMinWeeks)
		Return Me
	End If
	Dim pp As String = $"${ID}MinWeeks"$
	vue.SetStateSingle(pp, varMinWeeks)
	Calendar.Bind(":min-weeks", pp)
	Return Me
End Sub

'set month-format
Sub SetMonthFormat(varMonthFormat As String) As VMCalendar
	If varMonthFormat = "" Then Return Me
	If bStatic Then
		SetAttrSingle("month-format", varMonthFormat)
		Return Me
	End If
	Dim pp As String = $"${ID}MonthFormat"$
	vue.SetStateSingle(pp, varMonthFormat)
	Calendar.Bind(":month-format", pp)
	Return Me
End Sub

'set now
Sub SetNow(varNow As String) As VMCalendar
	If varNow = "" Then Return Me
	If bStatic Then
		SetAttrSingle("now", varNow)
		Return Me
	End If
	Dim pp As String = $"${ID}Now"$
	vue.SetStateSingle(pp, varNow)
	Calendar.Bind(":now", pp)
	Return Me
End Sub

'set show-interval-label
Sub SetShowIntervalLabel(varShowIntervalLabel As String) As VMCalendar
	If varShowIntervalLabel = "" Then Return Me
	If bStatic Then
		SetAttrSingle("show-interval-label", varShowIntervalLabel)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowIntervalLabel"$
	vue.SetStateSingle(pp, varShowIntervalLabel)
	Calendar.Bind(":show-interval-label", pp)
	Return Me
End Sub

'set start
Sub SetStart(varStart As String) As VMCalendar
	If varStart = "" Then Return Me
	If bStatic Then
		SetAttrSingle("start", varStart)
		Return Me
	End If
	Dim pp As String = $"${ID}Start"$
	vue.SetStateSingle(pp, varStart)
	Calendar.Bind(":start", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As String) As VMCalendar
	If varType = "" Then Return Me
	If bStatic Then
		SetAttrSingle("type", varType)
		Return Me
	End If
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	Calendar.Bind(":type", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMCalendar
	If varValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("value", varValue)
		Return Me
	End If
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	Calendar.Bind(":value", pp)
	Return Me
End Sub

'set weekday-format
Sub SetWeekdayFormat(varWeekdayFormat As String) As VMCalendar
	If varWeekdayFormat = "" Then Return Me
	If bStatic Then
		SetAttrSingle("weekday-format", varWeekdayFormat)
		Return Me
	End If
	Dim pp As String = $"${ID}WeekdayFormat"$
	vue.SetStateSingle(pp, varWeekdayFormat)
	Calendar.Bind(":weekday-format", pp)
	Return Me
End Sub

'set category-hide-dynamic
Sub SetCategoryHideDynamic(varCategoryHideDynamic As Boolean) As VMCalendar
	If varCategoryHideDynamic = False Then Return Me
	If bStatic Then
		SetAttrSingle("category-hide-dynamic", varCategoryHideDynamic)
		Return Me
	End If
	Dim pp As String = $"${ID}CategoryHideDynamic"$
	vue.SetStateSingle(pp, varCategoryHideDynamic)
	Calendar.Bind(":category-hide-dynamic", pp)
	Return Me
End Sub

'set category-show-all
Sub SetCategoryShowAll(varCategoryShowAll As Boolean) As VMCalendar
	If varCategoryShowAll = False Then Return Me
	If bStatic Then
		SetAttrSingle("category-show-all", varCategoryShowAll)
		Return Me
	End If
	Dim pp As String = $"${ID}CategoryShowAll"$
	vue.SetStateSingle(pp, varCategoryShowAll)
	Calendar.Bind(":category-show-all", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMCalendar
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Calendar.Bind(":dark", pp)
	Return Me
End Sub

'set event-more
Sub SetEventMore(varEventMore As Boolean) As VMCalendar
	If varEventMore = True Then Return Me
	If bStatic Then
		SetAttrSingle("event-more", varEventMore)
		Return Me
	End If
	Dim pp As String = $"${ID}EventMore"$
	vue.SetStateSingle(pp, varEventMore)
	Calendar.Bind(":event-more", pp)
	Return Me
End Sub

'set event-ripple
Sub SetEventRipple(varEventRipple As Boolean) As VMCalendar
	If varEventRipple = False Then Return Me
	If bStatic Then
		SetAttrSingle("event-ripple", varEventRipple)
		Return Me
	End If
	Dim pp As String = $"${ID}EventRipple"$
	vue.SetStateSingle(pp, varEventRipple)
	Calendar.Bind(":event-ripple", pp)
	Return Me
End Sub

'set hide-header
Sub SetHideHeader(varHideHeader As Boolean) As VMCalendar
	If varHideHeader = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-header", varHideHeader)
		Return Me
	End If
	Dim pp As String = $"${ID}HideHeader"$
	vue.SetStateSingle(pp, varHideHeader)
	Calendar.Bind(":hide-header", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMCalendar
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Calendar.Bind(":light", pp)
	Return Me
End Sub

'set short-intervals
Sub SetShortIntervals(varShortIntervals As Boolean) As VMCalendar
	If varShortIntervals = True Then Return Me
	If bStatic Then
		SetAttrSingle("short-intervals", varShortIntervals)
		Return Me
	End If
	Dim pp As String = $"${ID}ShortIntervals"$
	vue.SetStateSingle(pp, varShortIntervals)
	Calendar.Bind(":short-intervals", pp)
	Return Me
End Sub

'set short-months
Sub SetShortMonths(varShortMonths As Boolean) As VMCalendar
	If varShortMonths = True Then Return Me
	If bStatic Then
		SetAttrSingle("short-months", varShortMonths)
		Return Me
	End If
	Dim pp As String = $"${ID}ShortMonths"$
	vue.SetStateSingle(pp, varShortMonths)
	Calendar.Bind(":short-months", pp)
	Return Me
End Sub

'set short-weekdays
Sub SetShortWeekdays(varShortWeekdays As Boolean) As VMCalendar
	If varShortWeekdays = True Then Return Me
	If bStatic Then
		SetAttrSingle("short-weekdays", varShortWeekdays)
		Return Me
	End If
	Dim pp As String = $"${ID}ShortWeekdays"$
	vue.SetStateSingle(pp, varShortWeekdays)
	Calendar.Bind(":short-weekdays", pp)
	Return Me
End Sub

'set show-month-on-first
Sub SetShowMonthOnFirst(varShowMonthOnFirst As Boolean) As VMCalendar
	If varShowMonthOnFirst = True Then Return Me
	If bStatic Then
		SetAttrSingle("show-month-on-first", varShowMonthOnFirst)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowMonthOnFirst"$
	vue.SetStateSingle(pp, varShowMonthOnFirst)
	Calendar.Bind(":show-month-on-first", pp)
	Return Me
End Sub

'set show-week
Sub SetShowWeek(varShowWeek As Boolean) As VMCalendar
	If varShowWeek = False Then Return Me
	If bStatic Then
		SetAttrSingle("show-week", varShowWeek)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowWeek"$
	vue.SetStateSingle(pp, varShowWeek)
	Calendar.Bind(":show-week", pp)
	Return Me
End Sub

'set day-format
Sub SetDayFormat(varDayFormat As List) As VMCalendar
	If bStatic Then Return Me
	Dim pp As String = $"${ID}DayFormat"$
	vue.SetStateSingle(pp, varDayFormat)
	Calendar.Bind(":day-format", pp)
	Return Me
End Sub

'set events
Sub SetEvents(varEvents As List) As VMCalendar
	If bStatic Then Return Me
	Dim pp As String = $"${ID}Events"$
	vue.SetStateSingle(pp, varEvents)
	Calendar.Bind(":events", pp)
	Return Me
End Sub

'set weekdays
Sub SetWeekdays(varWeekdays As List) As VMCalendar
	If bStatic Then Return Me
	Dim pp As String = $"${ID}Weekdays"$
	vue.SetStateSingle(pp, varWeekdays)
	Calendar.Bind(":weekdays", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMCalendar
	Calendar.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMCalendar
	Calendar.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMCalendar
	Calendar.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMCalendar
	Calendar.Enable(False)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCalendar
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMCalendar
	Calendar.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCalendar
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMCalendar
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Calendar.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMCalendar
	Calendar.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCalendar
	Calendar.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMCalendar
	Calendar.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMCalendar
	Calendar.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMCalendar
	Calendar.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMCalendar
	Calendar.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMCalendar
	Calendar.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMCalendar
	Calendar.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMCalendar
	Calendar.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMCalendar
	Calendar.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMCalendar
	Calendar.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMCalendar
	Calendar.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMCalendar
	Calendar.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCalendar
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMCalendar
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMCalendar
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMCalendar
	Calendar.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMCalendar
	Calendar.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMCalendar
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMCalendar
	Calendar.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMCalendar
	Calendar.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMCalendar
	Calendar.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCalendar
	Calendar.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMCalendar
	Calendar.SetVisible(b)
	Return Me
End Sub


'set color intensity - built in
Sub SetTextColor(textcolor As String) As VMCalendar
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColorIntensity(textcolor As String, textintensity As String) As VMCalendar
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Dim sIntensity As String = $"text--${textintensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub
'
Sub SetOnClickEvent As VMCalendar
	Dim methodName As String = $"${ID}_clickevent"$
	If SubExists(Module, methodName) = False Then Return Me
	Dim obj As Object
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(obj))
	SetAttr(CreateMap("@click:event": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnClickMore As VMCalendar
	Dim methodName As String  = $"${ID}_clickmore"$
	If SubExists(Module, methodName) = False Then Return Me
	Dim obj As Object
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(obj))
	SetAttr(CreateMap("@click:more": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnClickDate As VMCalendar
	Dim methodName As String = $"${ID}_clickdate"$
	If SubExists(Module, methodName) = False Then Return Me
	Dim obj As Object
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(obj))
	SetAttr(CreateMap("@click:date": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnChange As VMCalendar
	Dim methodName As String = $"${ID}_change"$
	If SubExists(Module, methodName) = False Then Return Me
	Dim obj As Object
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(obj))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub
