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
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the Calendar
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCalendar
	ID = sid.tolowercase
	Calendar.Initialize(v, ID)
	Calendar.SetTag("v-calendar")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return Calendar.ToString
End Sub

Sub SetVModel(k As String) As VMCalendar
	Calendar.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCalendar
	Calendar.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCalendar
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

'set text
Sub SetText(t As Object) As VMCalendar
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

'set color
Sub SetColor(varColor As Object) As VMCalendar
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Calendar.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMCalendar
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Calendar.Bind(":dark", pp)
	Return Me
End Sub

'set day-format
Sub SetDayFormat(varDayFormat As Object) As VMCalendar
	Dim pp As String = $"${ID}DayFormat"$
	vue.SetStateSingle(pp, varDayFormat)
	Calendar.Bind(":day-format", pp)
	Return Me
End Sub

'set end
Sub SetEnd(varEnd As Object) As VMCalendar
	Dim pp As String = $"${ID}End"$
	vue.SetStateSingle(pp, varEnd)
	Calendar.Bind(":end", pp)
	Return Me
End Sub

'set event-color
Sub SetEventColor(varEventColor As Object) As VMCalendar
	Dim pp As String = $"${ID}EventColor"$
	vue.SetStateSingle(pp, varEventColor)
	Calendar.Bind(":event-color", pp)
	Return Me
End Sub

'set event-end
Sub SetEventEnd(varEventEnd As Object) As VMCalendar
	Dim pp As String = $"${ID}EventEnd"$
	vue.SetStateSingle(pp, varEventEnd)
	Calendar.Bind(":event-end", pp)
	Return Me
End Sub

'set event-height
Sub SetEventHeight(varEventHeight As Object) As VMCalendar
	Dim pp As String = $"${ID}EventHeight"$
	vue.SetStateSingle(pp, varEventHeight)
	Calendar.Bind(":event-height", pp)
	Return Me
End Sub

'set event-margin-bottom
Sub SetEventMarginBottom(varEventMarginBottom As Object) As VMCalendar
	Dim pp As String = $"${ID}EventMarginBottom"$
	vue.SetStateSingle(pp, varEventMarginBottom)
	Calendar.Bind(":event-margin-bottom", pp)
	Return Me
End Sub

'set event-more
Sub SetEventMore(varEventMore As Object) As VMCalendar
	Dim pp As String = $"${ID}EventMore"$
	vue.SetStateSingle(pp, varEventMore)
	Calendar.Bind(":event-more", pp)
	Return Me
End Sub

'set event-more-text
Sub SetEventMoreText(varEventMoreText As Object) As VMCalendar
	Dim pp As String = $"${ID}EventMoreText"$
	vue.SetStateSingle(pp, varEventMoreText)
	Calendar.Bind(":event-more-text", pp)
	Return Me
End Sub

'set event-name
Sub SetEventName(varEventName As Object) As VMCalendar
	Dim pp As String = $"${ID}EventName"$
	vue.SetStateSingle(pp, varEventName)
	Calendar.Bind(":event-name", pp)
	Return Me
End Sub

'set event-overlap-mode
Sub SetEventOverlapMode(varEventOverlapMode As Object) As VMCalendar
	Dim pp As String = $"${ID}EventOverlapMode"$
	vue.SetStateSingle(pp, varEventOverlapMode)
	Calendar.Bind(":event-overlap-mode", pp)
	Return Me
End Sub

'set event-overlap-threshold
Sub SetEventOverlapThreshold(varEventOverlapThreshold As Object) As VMCalendar
	Dim pp As String = $"${ID}EventOverlapThreshold"$
	vue.SetStateSingle(pp, varEventOverlapThreshold)
	Calendar.Bind(":event-overlap-threshold", pp)
	Return Me
End Sub

'set event-ripple
Sub SetEventRipple(varEventRipple As Object) As VMCalendar
	Dim pp As String = $"${ID}EventRipple"$
	vue.SetStateSingle(pp, varEventRipple)
	Calendar.Bind(":event-ripple", pp)
	Return Me
End Sub

'set event-start
Sub SetEventStart(varEventStart As Object) As VMCalendar
	Dim pp As String = $"${ID}EventStart"$
	vue.SetStateSingle(pp, varEventStart)
	Calendar.Bind(":event-start", pp)
	Return Me
End Sub

'set event-text-color
Sub SetEventTextColor(varEventTextColor As Object) As VMCalendar
	Dim pp As String = $"${ID}EventTextColor"$
	vue.SetStateSingle(pp, varEventTextColor)
	Calendar.Bind(":event-text-color", pp)
	Return Me
End Sub

'set events
Sub SetEvents(varEvents As Object) As VMCalendar
	Dim pp As String = $"${ID}Events"$
	vue.SetStateSingle(pp, varEvents)
	Calendar.Bind(":events", pp)
	Return Me
End Sub

'set first-interval
Sub SetFirstInterval(varFirstInterval As Object) As VMCalendar
	Dim pp As String = $"${ID}FirstInterval"$
	vue.SetStateSingle(pp, varFirstInterval)
	Calendar.Bind(":first-interval", pp)
	Return Me
End Sub

'set hide-header
Sub SetHideHeader(varHideHeader As Object) As VMCalendar
	Dim pp As String = $"${ID}HideHeader"$
	vue.SetStateSingle(pp, varHideHeader)
	Calendar.Bind(":hide-header", pp)
	Return Me
End Sub

'set interval-count
Sub SetIntervalCount(varIntervalCount As Object) As VMCalendar
	Dim pp As String = $"${ID}IntervalCount"$
	vue.SetStateSingle(pp, varIntervalCount)
	Calendar.Bind(":interval-count", pp)
	Return Me
End Sub

'set interval-format
Sub SetIntervalFormat(varIntervalFormat As Object) As VMCalendar
	Dim pp As String = $"${ID}IntervalFormat"$
	vue.SetStateSingle(pp, varIntervalFormat)
	Calendar.Bind(":interval-format", pp)
	Return Me
End Sub

'set interval-height
Sub SetIntervalHeight(varIntervalHeight As Object) As VMCalendar
	Dim pp As String = $"${ID}IntervalHeight"$
	vue.SetStateSingle(pp, varIntervalHeight)
	Calendar.Bind(":interval-height", pp)
	Return Me
End Sub

'set interval-minutes
Sub SetIntervalMinutes(varIntervalMinutes As Object) As VMCalendar
	Dim pp As String = $"${ID}IntervalMinutes"$
	vue.SetStateSingle(pp, varIntervalMinutes)
	Calendar.Bind(":interval-minutes", pp)
	Return Me
End Sub

'set interval-style
Sub SetIntervalStyle(varIntervalStyle As Object) As VMCalendar
	Dim pp As String = $"${ID}IntervalStyle"$
	vue.SetStateSingle(pp, varIntervalStyle)
	Calendar.Bind(":interval-style", pp)
	Return Me
End Sub

'set interval-width
Sub SetIntervalWidth(varIntervalWidth As Object) As VMCalendar
	Dim pp As String = $"${ID}IntervalWidth"$
	vue.SetStateSingle(pp, varIntervalWidth)
	Calendar.Bind(":interval-width", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMCalendar
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Calendar.Bind(":light", pp)
	Return Me
End Sub

'set locale
Sub SetLocale(varLocale As Object) As VMCalendar
	Dim pp As String = $"${ID}Locale"$
	vue.SetStateSingle(pp, varLocale)
	Calendar.Bind(":locale", pp)
	Return Me
End Sub

'set max-days
Sub SetMaxDays(varMaxDays As Object) As VMCalendar
	Dim pp As String = $"${ID}MaxDays"$
	vue.SetStateSingle(pp, varMaxDays)
	Calendar.Bind(":max-days", pp)
	Return Me
End Sub

'set min-weeks
Sub SetMinWeeks(varMinWeeks As Object) As VMCalendar
	Dim pp As String = $"${ID}MinWeeks"$
	vue.SetStateSingle(pp, varMinWeeks)
	Calendar.Bind(":min-weeks", pp)
	Return Me
End Sub

'set month-format
Sub SetMonthFormat(varMonthFormat As Object) As VMCalendar
	Dim pp As String = $"${ID}MonthFormat"$
	vue.SetStateSingle(pp, varMonthFormat)
	Calendar.Bind(":month-format", pp)
	Return Me
End Sub

'set now
Sub SetNow(varNow As Object) As VMCalendar
	Dim pp As String = $"${ID}Now"$
	vue.SetStateSingle(pp, varNow)
	Calendar.Bind(":now", pp)
	Return Me
End Sub

'set short-intervals
Sub SetShortIntervals(varShortIntervals As Object) As VMCalendar
	Dim pp As String = $"${ID}ShortIntervals"$
	vue.SetStateSingle(pp, varShortIntervals)
	Calendar.Bind(":short-intervals", pp)
	Return Me
End Sub

'set short-months
Sub SetShortMonths(varShortMonths As Object) As VMCalendar
	Dim pp As String = $"${ID}ShortMonths"$
	vue.SetStateSingle(pp, varShortMonths)
	Calendar.Bind(":short-months", pp)
	Return Me
End Sub

'set short-weekdays
Sub SetShortWeekdays(varShortWeekdays As Object) As VMCalendar
	Dim pp As String = $"${ID}ShortWeekdays"$
	vue.SetStateSingle(pp, varShortWeekdays)
	Calendar.Bind(":short-weekdays", pp)
	Return Me
End Sub

'set show-interval-label
Sub SetShowIntervalLabel(varShowIntervalLabel As Object) As VMCalendar
	Dim pp As String = $"${ID}ShowIntervalLabel"$
	vue.SetStateSingle(pp, varShowIntervalLabel)
	Calendar.Bind(":show-interval-label", pp)
	Return Me
End Sub

'set show-month-on-first
Sub SetShowMonthOnFirst(varShowMonthOnFirst As Object) As VMCalendar
	Dim pp As String = $"${ID}ShowMonthOnFirst"$
	vue.SetStateSingle(pp, varShowMonthOnFirst)
	Calendar.Bind(":show-month-on-first", pp)
	Return Me
End Sub

'set start
Sub SetStart(varStart As Object) As VMCalendar
	Dim pp As String = $"${ID}Start"$
	vue.SetStateSingle(pp, varStart)
	Calendar.Bind(":start", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As Object) As VMCalendar
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	Calendar.Bind(":type", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMCalendar
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	Calendar.Bind(":value", pp)
	Return Me
End Sub

'set weekday-format
Sub SetWeekdayFormat(varWeekdayFormat As Object) As VMCalendar
	Dim pp As String = $"${ID}WeekdayFormat"$
	vue.SetStateSingle(pp, varWeekdayFormat)
	Calendar.Bind(":weekday-format", pp)
	Return Me
End Sub

'set weekdays
Sub SetWeekdays(varWeekdays As Object) As VMCalendar
	Dim pp As String = $"${ID}Weekdays"$
	vue.SetStateSingle(pp, varWeekdays)
	Calendar.Bind(":weekdays", pp)
	Return Me
End Sub

'
Sub SetSlotDay(b As boolean) As VMCalendar    'ignore
	SetAttr(CreateMap("slot": "day"))
	Return Me
End Sub

'
Sub SetSlotDayBody(b As boolean) As VMCalendar    'ignore
	SetAttr(CreateMap("slot": "day-body"))
	Return Me
End Sub

'
Sub SetSlotDayHeader(b As boolean) As VMCalendar    'ignore
	SetAttr(CreateMap("slot": "day-header"))
	Return Me
End Sub

'
Sub SetSlotDayLabel(b As boolean) As VMCalendar    'ignore
	SetAttr(CreateMap("slot": "day-label"))
	Return Me
End Sub

'
Sub SetSlotDayMonth(b As boolean) As VMCalendar    'ignore
	SetAttr(CreateMap("slot": "day-month"))
	Return Me
End Sub

'
Sub SetSlotEvent(b As boolean) As VMCalendar    'ignore
	SetAttr(CreateMap("slot": "event"))
	Return Me
End Sub

'
Sub SetSlotInterval(b As boolean) As VMCalendar    'ignore
	SetAttr(CreateMap("slot": "interval"))
	Return Me
End Sub

'
Sub SetOnChange(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickDate(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:date": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickDay(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:day": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickInterval(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:interval": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickMore(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:more": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickTime(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:click:time": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnContextmenuDate(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:contextmenu:date": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnContextmenuDay(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:contextmenu:day": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnContextmenuInterval(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:contextmenu:interval": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnContextmenuTime(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:contextmenu:time": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMousedownDay(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mousedown:day": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMousedownInterval(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mousedown:interval": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMousedownTime(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mousedown:time": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseenterDay(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mouseenter:day": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseenterInterval(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mouseenter:interval": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseenterTime(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mouseenter:time": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseleaveDay(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mouseleave:day": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseleaveInterval(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mouseleave:interval": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseleaveTime(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mouseleave:time": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMousemoveDay(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mousemove:day": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMousemoveInterval(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mousemove:interval": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMousemoveTime(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:mousemove:time": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseupDay(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:mouseup:day": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseupInterval(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:mouseup:interval": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseupTime(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:mouseup:time": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMoved(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:moved": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnTouchendDay(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:touchend:day": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnTouchendInterval(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:touchend:interval": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnTouchendTime(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:touchend:time": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnTouchmoveDay(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:touchmove:day": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnTouchmoveInterval(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:touchmove:interval": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnTouchmoveTime(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:touchmove:time": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnTouchstartDay(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:touchstart:day": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnTouchstartInterval(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:touchstart:interval": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnTouchstartTime(methodName As String) As VMCalendar
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:touchstart:time": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'hide the component
Sub Hide As VMCalendar
	vue.SetStateSingle($"${ID}show"$, False)
	Return Me
End Sub

'show the component
Sub Show As VMCalendar
	vue.SetStateSingle($"${ID}show"$, True)
	Return Me
End Sub

'enable the component
Sub Enable As VMCalendar
	vue.SetStateSingle($"${ID}disabled"$, False)
	Return Me
End Sub

'disable the component
Sub Disable As VMCalendar
	vue.SetStateSingle($"${ID}disabled"$, True)
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
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCalendar
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
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

'set tab index
Sub SetTabIndex(ti As String) As VMCalendar
	Calendar.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCalendar
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
