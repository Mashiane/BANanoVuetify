B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CalendarDaily As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the CalendarDaily
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCalendarDaily
	ID = sid.tolowercase
	CalendarDaily.Initialize(v, ID)
	CalendarDaily.SetTag("v-calendar-daily")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return CalendarDaily.ToString
End Sub

Sub SetVModel(k As String) As VMCalendarDaily
	CalendarDaily.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCalendarDaily
	CalendarDaily.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCalendarDaily
	CalendarDaily.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCalendarDaily
	Dim childHTML As String = child.ToString
	CalendarDaily.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCalendarDaily
	CalendarDaily.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCalendarDaily
	CalendarDaily.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCalendarDaily
	CalendarDaily.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCalendarDaily
	CalendarDaily.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	CalendarDaily.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	CalendarDaily.Bind(":dark", pp)
	Return Me
End Sub

'set day-format
Sub SetDayFormat(varDayFormat As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}DayFormat"$
	vue.SetStateSingle(pp, varDayFormat)
	CalendarDaily.Bind(":day-format", pp)
	Return Me
End Sub

'set end
Sub SetEnd(varEnd As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}End"$
	vue.SetStateSingle(pp, varEnd)
	CalendarDaily.Bind(":end", pp)
	Return Me
End Sub

'set first-interval
Sub SetFirstInterval(varFirstInterval As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}FirstInterval"$
	vue.SetStateSingle(pp, varFirstInterval)
	CalendarDaily.Bind(":first-interval", pp)
	Return Me
End Sub

'set hide-header
Sub SetHideHeader(varHideHeader As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}HideHeader"$
	vue.SetStateSingle(pp, varHideHeader)
	CalendarDaily.Bind(":hide-header", pp)
	Return Me
End Sub

'set interval-count
Sub SetIntervalCount(varIntervalCount As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}IntervalCount"$
	vue.SetStateSingle(pp, varIntervalCount)
	CalendarDaily.Bind(":interval-count", pp)
	Return Me
End Sub

'set interval-format
Sub SetIntervalFormat(varIntervalFormat As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}IntervalFormat"$
	vue.SetStateSingle(pp, varIntervalFormat)
	CalendarDaily.Bind(":interval-format", pp)
	Return Me
End Sub

'set interval-height
Sub SetIntervalHeight(varIntervalHeight As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}IntervalHeight"$
	vue.SetStateSingle(pp, varIntervalHeight)
	CalendarDaily.Bind(":interval-height", pp)
	Return Me
End Sub

'set interval-minutes
Sub SetIntervalMinutes(varIntervalMinutes As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}IntervalMinutes"$
	vue.SetStateSingle(pp, varIntervalMinutes)
	CalendarDaily.Bind(":interval-minutes", pp)
	Return Me
End Sub

'set interval-style
Sub SetIntervalStyle(varIntervalStyle As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}IntervalStyle"$
	vue.SetStateSingle(pp, varIntervalStyle)
	CalendarDaily.Bind(":interval-style", pp)
	Return Me
End Sub

'set interval-width
Sub SetIntervalWidth(varIntervalWidth As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}IntervalWidth"$
	vue.SetStateSingle(pp, varIntervalWidth)
	CalendarDaily.Bind(":interval-width", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	CalendarDaily.Bind(":light", pp)
	Return Me
End Sub

'set locale
Sub SetLocale(varLocale As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}Locale"$
	vue.SetStateSingle(pp, varLocale)
	CalendarDaily.Bind(":locale", pp)
	Return Me
End Sub

'set max-days
Sub SetMaxDays(varMaxDays As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}MaxDays"$
	vue.SetStateSingle(pp, varMaxDays)
	CalendarDaily.Bind(":max-days", pp)
	Return Me
End Sub

'set now
Sub SetNow(varNow As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}Now"$
	vue.SetStateSingle(pp, varNow)
	CalendarDaily.Bind(":now", pp)
	Return Me
End Sub

'set short-intervals
Sub SetShortIntervals(varShortIntervals As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}ShortIntervals"$
	vue.SetStateSingle(pp, varShortIntervals)
	CalendarDaily.Bind(":short-intervals", pp)
	Return Me
End Sub

'set short-weekdays
Sub SetShortWeekdays(varShortWeekdays As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}ShortWeekdays"$
	vue.SetStateSingle(pp, varShortWeekdays)
	CalendarDaily.Bind(":short-weekdays", pp)
	Return Me
End Sub

'set show-interval-label
Sub SetShowIntervalLabel(varShowIntervalLabel As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}ShowIntervalLabel"$
	vue.SetStateSingle(pp, varShowIntervalLabel)
	CalendarDaily.Bind(":show-interval-label", pp)
	Return Me
End Sub

'set start
Sub SetStart(varStart As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}Start"$
	vue.SetStateSingle(pp, varStart)
	CalendarDaily.Bind(":start", pp)
	Return Me
End Sub

'set weekday-format
Sub SetWeekdayFormat(varWeekdayFormat As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}WeekdayFormat"$
	vue.SetStateSingle(pp, varWeekdayFormat)
	CalendarDaily.Bind(":weekday-format", pp)
	Return Me
End Sub

'set weekdays
Sub SetWeekdays(varWeekdays As Object) As VMCalendarDaily
	Dim pp As String = $"${ID}Weekdays"$
	vue.SetStateSingle(pp, varWeekdays)
	CalendarDaily.Bind(":weekdays", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMCalendarDaily
	CalendarDaily.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMCalendarDaily
	CalendarDaily.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMCalendarDaily
	CalendarDaily.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMCalendarDaily
	CalendarDaily.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCalendarDaily
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMCalendarDaily
	CalendarDaily.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCalendarDaily
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCalendarDaily
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	CalendarDaily.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMCalendarDaily
	CalendarDaily.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCalendarDaily
	CalendarDaily.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMCalendarDaily
	CalendarDaily.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMCalendarDaily
	CalendarDaily.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMCalendarDaily
	CalendarDaily.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCalendarDaily
	CalendarDaily.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMCalendarDaily
	CalendarDaily.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMCalendarDaily
	CalendarDaily.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMCalendarDaily
	CalendarDaily.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMCalendarDaily
	CalendarDaily.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMCalendarDaily
	CalendarDaily.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMCalendarDaily
	CalendarDaily.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCalendarDaily
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMCalendarDaily
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMCalendarDaily
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMCalendarDaily
	CalendarDaily.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMCalendarDaily
	CalendarDaily.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMCalendarDaily
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMCalendarDaily
	CalendarDaily.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMCalendarDaily
	CalendarDaily.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMCalendarDaily
	CalendarDaily.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCalendarDaily
CalendarDaily.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMCalendarDaily
CalendarDaily.SetVisible(b)
Return Me
End Sub