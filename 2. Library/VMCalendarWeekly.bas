B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CalendarWeekly As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the CalendarWeekly
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCalendarWeekly
	ID = sid.tolowercase
	CalendarWeekly.Initialize(v, ID)
	CalendarWeekly.SetTag("v-calendar-weekly")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return CalendarWeekly.ToString
End Sub

Sub SetVModel(k As String) As VMCalendarWeekly
	CalendarWeekly.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCalendarWeekly
	CalendarWeekly.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCalendarWeekly
	CalendarWeekly.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCalendarWeekly
	Dim childHTML As String = child.ToString
	CalendarWeekly.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCalendarWeekly
	CalendarWeekly.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCalendarWeekly
	CalendarWeekly.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr as map) As VMCalendarWeekly
	CalendarWeekly.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCalendarWeekly
	CalendarWeekly.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	CalendarWeekly.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	CalendarWeekly.Bind(":dark", pp)
	Return Me
End Sub

'set day-format
Sub SetDayFormat(varDayFormat As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}DayFormat"$
	vue.SetStateSingle(pp, varDayFormat)
	CalendarWeekly.Bind(":day-format", pp)
	Return Me
End Sub

'set end
Sub SetEnd(varEnd As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}End"$
	vue.SetStateSingle(pp, varEnd)
	CalendarWeekly.Bind(":end", pp)
	Return Me
End Sub

'set hide-header
Sub SetHideHeader(varHideHeader As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}HideHeader"$
	vue.SetStateSingle(pp, varHideHeader)
	CalendarWeekly.Bind(":hide-header", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	CalendarWeekly.Bind(":light", pp)
	Return Me
End Sub

'set locale
Sub SetLocale(varLocale As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}Locale"$
	vue.SetStateSingle(pp, varLocale)
	CalendarWeekly.Bind(":locale", pp)
	Return Me
End Sub

'set min-weeks
Sub SetMinWeeks(varMinWeeks As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}MinWeeks"$
	vue.SetStateSingle(pp, varMinWeeks)
	CalendarWeekly.Bind(":min-weeks", pp)
	Return Me
End Sub

'set month-format
Sub SetMonthFormat(varMonthFormat As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}MonthFormat"$
	vue.SetStateSingle(pp, varMonthFormat)
	CalendarWeekly.Bind(":month-format", pp)
	Return Me
End Sub

'set now
Sub SetNow(varNow As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}Now"$
	vue.SetStateSingle(pp, varNow)
	CalendarWeekly.Bind(":now", pp)
	Return Me
End Sub

'set short-months
Sub SetShortMonths(varShortMonths As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}ShortMonths"$
	vue.SetStateSingle(pp, varShortMonths)
	CalendarWeekly.Bind(":short-months", pp)
	Return Me
End Sub

'set short-weekdays
Sub SetShortWeekdays(varShortWeekdays As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}ShortWeekdays"$
	vue.SetStateSingle(pp, varShortWeekdays)
	CalendarWeekly.Bind(":short-weekdays", pp)
	Return Me
End Sub

'set start
Sub SetStart(varStart As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}Start"$
	vue.SetStateSingle(pp, varStart)
	CalendarWeekly.Bind(":start", pp)
	Return Me
End Sub

'set weekday-format
Sub SetWeekdayFormat(varWeekdayFormat As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}WeekdayFormat"$
	vue.SetStateSingle(pp, varWeekdayFormat)
	CalendarWeekly.Bind(":weekday-format", pp)
	Return Me
End Sub

'set weekdays
Sub SetWeekdays(varWeekdays As Object) As VMCalendarWeekly
	Dim pp As String = $"${ID}Weekdays"$
	vue.SetStateSingle(pp, varWeekdays)
	CalendarWeekly.Bind(":weekdays", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMCalendarWeekly
	CalendarWeekly.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMCalendarWeekly
	CalendarWeekly.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMCalendarWeekly
	CalendarWeekly.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMCalendarWeekly
	CalendarWeekly.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCalendarWeekly
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMCalendarWeekly
	CalendarWeekly.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCalendarWeekly
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCalendarWeekly
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	CalendarWeekly.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMCalendarWeekly
	CalendarWeekly.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCalendarWeekly
	CalendarWeekly.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMCalendarWeekly
	CalendarWeekly.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMCalendarWeekly
	CalendarWeekly.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMCalendarWeekly
	CalendarWeekly.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCalendarWeekly
	CalendarWeekly.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMCalendarWeekly
	CalendarWeekly.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMCalendarWeekly
	CalendarWeekly.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMCalendarWeekly
	CalendarWeekly.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMCalendarWeekly
	CalendarWeekly.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMCalendarWeekly
	CalendarWeekly.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMCalendarWeekly
	CalendarWeekly.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCalendarWeekly
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMCalendarWeekly
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMCalendarWeekly
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMCalendarWeekly
	CalendarWeekly.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMCalendarWeekly
	CalendarWeekly.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMCalendarWeekly
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMCalendarWeekly
	CalendarWeekly.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMCalendarWeekly
	CalendarWeekly.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMCalendarWeekly
	CalendarWeekly.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCalendarWeekly
CalendarWeekly.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub