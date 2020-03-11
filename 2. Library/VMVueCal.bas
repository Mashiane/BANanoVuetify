B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public VueCal As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private events As List
	Private module As Object
End Sub

#if css
	.vuecal__event {cursor: pointer;}
#End If

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object, Width As String, Height As String) As VMVueCal
	BANano.DependsOnAsset("vuecal.css")
	BANano.DependsOnAsset("vuecal.umd.min.js")
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	VueCal.Initialize(vue, ID).SetTag("vue-cal")
	Width = VueCal.MakePx(Width)
	Height = VueCal.MakePx(Height)
	VueCal.SetWidth(Width)
	VueCal.SetHeight(Height)
	events.Initialize 
	InitializeEvents
	Dim event As Object, e As BANanoEvent
	SetOnEventClick(event, e)
	Return Me
End Sub



public Sub RemoveAttr(sName As String) As VMVueCal
	VueCal.RemoveAttr(sName)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMVueCal
	VueCal.SetDesignMode(b)
	Return Me
End Sub


Sub SetEditableEvents(b As Boolean) As VMVueCal
	If b = False Then Return Me
	VueCal.SetAttr1("editable-events", True)
	Return Me
End Sub

Sub SetShowAllDayEvents(b As Boolean) As VMVueCal
	If b = False Then Return Me
	VueCal.SetAttr1("show-all-day-events", True)
	Return Me
End Sub

Sub SetHideTitleBar(b As Boolean) As VMVueCal
	If b = False Then Return Me
	VueCal.SetAttr1("hide-title-bar", True)
	Return Me
End Sub

private Sub SetOnEventClick(event As Object, e As BANanoEvent) As VMVueCal
	Dim eKey As String = $"${ID}_click"$
	Dim cb As BANanoObject = BANano.CallBack(module, eKey, Array(event, e))
	VueCal.SetAttr1(":on-event-click", cb)
	Return Me
End Sub

Sub SetEventsCountOnYearView(b As Boolean) As VMVueCal
	If b = False Then Return Me
	VueCal.SetAttr1("events-count-on-year-view", True)
	Return Me
End Sub

Sub SetEventsOnMonthView(eom As Object) As VMVueCal
	VueCal.SetAttr1("events-on-month-view", eom)
	Return Me
End Sub


Sub SetTime(b As Boolean) As VMVueCal
	VueCal.SetAttr1(":time", b)
	Return Me
End Sub

Sub SetHideWeekends(b As Boolean) As VMVueCal
	If b = False Then Return Me
	VueCal.SetAttr1("hide-weekends", True)
	Return Me
End Sub

Sub SetHideViewSelector(b As Boolean) As VMVueCal
	If b = False Then Return Me
	VueCal.SetAttr1("hide-view-selector", True)
	Return Me
End Sub

Sub SetShowWeekNumbers(b As Boolean) As VMVueCal
	If b = False Then Return Me
	VueCal.SetAttr1("show-week-numbers", True)
	Return Me
End Sub

Sub AddEvent(eID As String, eStart As String, eEnd As String, eTitle As String, eIcon As String, eContent As String, eContentFull As String, eClass As String, eAllDay As Boolean)
	Dim event As Map = CreateMap()
	event.Put("id", eID)
	event.Put("start", eStart)
	event.Put("end", eEnd)
	event.Put("title", eTitle)
	If eIcon <> "" Then event.Put("icon", eIcon)
	If eContent <> "" Then event.Put("content", eContent)
	If eContentFull <> "" Then event.Put("contentFull", eContentFull)
	If eClass <> "" Then event.Put("class", eClass)
	If eAllDay Then event.Put("allDay", eAllDay)
	events.Add(event)
End Sub

Sub SetStartWeekOnSunday(b As Boolean) As VMVueCal
	If b = False Then Return Me
	VueCal.SetAttr1("start-week-on-sunday", True)
	Return Me
End Sub

Sub SetTodayButton(b As Boolean) As VMVueCal
	If b = False Then Return Me
	VueCal.SetAttr1("today-button", True)
	Return Me
End Sub

Sub SetTimeStep(ts As String) As VMVueCal
	If ts = "" Then Return Me
	VueCal.SetAttr1("time-step",ts)
	Return Me
End Sub

Sub SetDefaultView(v As String) As VMVueCal
	If v = "" Then Return Me
	VueCal.SetAttr1("default-view", v)
	Return Me
End Sub

Sub SetDefaultViewMonth As VMVueCal
	VueCal.SetAttr1("default-view", "month")
	Return Me
End Sub


Sub SetDefaultViewDay As VMVueCal
	VueCal.SetAttr1("default-view", "day")
	Return Me
End Sub

private Sub InitializeEvents As VMVueCal
	Dim eveName As String = $"${ID}events"$
	vue.SetStateSingle(eveName, Array())
	VueCal.SetAttr1(":events", eveName)
	Return Me
End Sub

Sub SetEvents(eveList As List) As VMVueCal
	Dim eveName As String = $"${ID}events"$
	vue.SetStateSingle(eveName, eveList)
	Return Me
End Sub

Sub Refresh
	SetEvents(events)
End Sub

Sub SetMinDate(minDate As String) As VMVueCal
	Dim mind As String = $"${ID}mindate"$
	vue.SetStateSingle(mind, minDate)
	VueCal.SetAttr1(":mindate", mind)
	Return Me
End Sub

Sub SetMaxDate(maxDate As String) As VMVueCal
	Dim maxd As String = $"${ID}maxdate"$
	vue.SetStateSingle(maxd, maxDate)
	VueCal.SetAttr1(":maxdate", maxd)
	Return Me
End Sub


Sub SetXSmall(b As Boolean) As VMVueCal
	If b = False Then Return Me
	VueCal.SetAttr1("xsmall", True)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMVueCal
	If ti = "" Then Return Me
	VueCal.SetTabIndex(ti)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMVueCal
	VueCal.SetStyle(sm)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMVueCal
	VueCal.SetVIf(vif)
	Return Me
End Sub

Sub SetID(iID As String, bind As Boolean) As VMVueCal
	VueCal.SetID(iID,bind)
	Return Me
End Sub

Sub SetName(nam As String, bind As Boolean) As VMVueCal
	VueCal.SetName(nam, bind)
	Return Me
End Sub

Sub SetKey(k As String, bind As Boolean) As VMVueCal
	VueCal.SetKey(k, bind)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMVueCal
	VueCal.SetVShow(vif)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMVueCal
	VueCal.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMVueCal
	VueCal.SetAttr(attr)
	Return Me
End Sub


Sub ToString As String
	Return VueCal.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(px As VMElement)
	px.SetText(ToString)
End Sub
Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMVueCal
VueCal.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub