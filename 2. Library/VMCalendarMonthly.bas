B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public CalendarMonthly As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the CalendarMonthly
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCalendarMonthly
	ID = sid.tolowercase
	CalendarMonthly.Initialize(v, ID)
	CalendarMonthly.SetTag("v-calendar-monthly")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return CalendarMonthly.ToString
End Sub

Sub SetVModel(k As String) As VMCalendarMonthly
	CalendarMonthly.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMCalendarMonthly
	CalendarMonthly.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMCalendarMonthly
	CalendarMonthly.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCalendarMonthly
	Dim childHTML As String = child.ToString
	CalendarMonthly.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCalendarMonthly
	CalendarMonthly.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCalendarMonthly
	CalendarMonthly.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr as map) As VMCalendarMonthly
	CalendarMonthly.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCalendarMonthly
	CalendarMonthly.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	CalendarMonthly.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	CalendarMonthly.Bind(":dark", pp)
	Return Me
End Sub

'set day-format
Sub SetDayFormat(varDayFormat As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}DayFormat"$
	vue.SetStateSingle(pp, varDayFormat)
	CalendarMonthly.Bind(":day-format", pp)
	Return Me
End Sub

'set end
Sub SetEnd(varEnd As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}End"$
	vue.SetStateSingle(pp, varEnd)
	CalendarMonthly.Bind(":end", pp)
	Return Me
End Sub

'set hide-header
Sub SetHideHeader(varHideHeader As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}HideHeader"$
	vue.SetStateSingle(pp, varHideHeader)
	CalendarMonthly.Bind(":hide-header", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	CalendarMonthly.Bind(":light", pp)
	Return Me
End Sub

'set locale
Sub SetLocale(varLocale As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}Locale"$
	vue.SetStateSingle(pp, varLocale)
	CalendarMonthly.Bind(":locale", pp)
	Return Me
End Sub

'set min-weeks
Sub SetMinWeeks(varMinWeeks As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}MinWeeks"$
	vue.SetStateSingle(pp, varMinWeeks)
	CalendarMonthly.Bind(":min-weeks", pp)
	Return Me
End Sub

'set month-format
Sub SetMonthFormat(varMonthFormat As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}MonthFormat"$
	vue.SetStateSingle(pp, varMonthFormat)
	CalendarMonthly.Bind(":month-format", pp)
	Return Me
End Sub

'set now
Sub SetNow(varNow As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}Now"$
	vue.SetStateSingle(pp, varNow)
	CalendarMonthly.Bind(":now", pp)
	Return Me
End Sub

'set short-months
Sub SetShortMonths(varShortMonths As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}ShortMonths"$
	vue.SetStateSingle(pp, varShortMonths)
	CalendarMonthly.Bind(":short-months", pp)
	Return Me
End Sub

'set short-weekdays
Sub SetShortWeekdays(varShortWeekdays As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}ShortWeekdays"$
	vue.SetStateSingle(pp, varShortWeekdays)
	CalendarMonthly.Bind(":short-weekdays", pp)
	Return Me
End Sub

'set show-month-on-first
Sub SetShowMonthOnFirst(varShowMonthOnFirst As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}ShowMonthOnFirst"$
	vue.SetStateSingle(pp, varShowMonthOnFirst)
	CalendarMonthly.Bind(":show-month-on-first", pp)
	Return Me
End Sub

'set start
Sub SetStart(varStart As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}Start"$
	vue.SetStateSingle(pp, varStart)
	CalendarMonthly.Bind(":start", pp)
	Return Me
End Sub

'set weekday-format
Sub SetWeekdayFormat(varWeekdayFormat As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}WeekdayFormat"$
	vue.SetStateSingle(pp, varWeekdayFormat)
	CalendarMonthly.Bind(":weekday-format", pp)
	Return Me
End Sub

'set weekdays
Sub SetWeekdays(varWeekdays As Object) As VMCalendarMonthly
	Dim pp As String = $"${ID}Weekdays"$
	vue.SetStateSingle(pp, varWeekdays)
	CalendarMonthly.Bind(":weekdays", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMCalendarMonthly
	CalendarMonthly.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMCalendarMonthly
	CalendarMonthly.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMCalendarMonthly
	CalendarMonthly.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMCalendarMonthly
	CalendarMonthly.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCalendarMonthly
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMCalendarMonthly
	CalendarMonthly.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCalendarMonthly
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCalendarMonthly
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	CalendarMonthly.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMCalendarMonthly
	CalendarMonthly.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCalendarMonthly
	CalendarMonthly.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMCalendarMonthly
	CalendarMonthly.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMCalendarMonthly
	CalendarMonthly.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMCalendarMonthly
	CalendarMonthly.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCalendarMonthly
	CalendarMonthly.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMCalendarMonthly
	CalendarMonthly.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMCalendarMonthly
	CalendarMonthly.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMCalendarMonthly
	CalendarMonthly.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMCalendarMonthly
	CalendarMonthly.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMCalendarMonthly
	CalendarMonthly.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMCalendarMonthly
	CalendarMonthly.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCalendarMonthly
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMCalendarMonthly
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMCalendarMonthly
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMCalendarMonthly
	CalendarMonthly.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMCalendarMonthly
	CalendarMonthly.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMCalendarMonthly
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMCalendarMonthly
	CalendarMonthly.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMCalendarMonthly
	CalendarMonthly.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMCalendarMonthly
	CalendarMonthly.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCalendarMonthly
CalendarMonthly.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMCalendarMonthly
CalendarMonthly.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMCalendarMonthly
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMCalendarMonthly
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub