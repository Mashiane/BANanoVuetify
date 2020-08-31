B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "calendarCode"
	Public title As String = "Calendar"
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private calmenu As VMMenu
	Private cal As VMCalendar
	Private calcard As VMCard
	Private BANano As BANano
End Sub

Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(10).AddColumns12
	
	'create a card to hold the calendar
	calcard = vm.CreateCard("calcard", Me)
	'set title of card, dynamic
	calcard.SetTitle("My Calendar")
	'add a spacer
	calcard.Title.AddSpacer
	'add buttons
	calcard.Title.AddButton3("caltoday", "", "", "", "Today", True, "", "")
	calcard.Title.AddIcon2("calprev", "mdi-chevron-left", "", "small", "","","mx-1")
	calcard.Title.AddIcon2("calnext", "mdi-chevron-right", "", "small", "", "", "mx-1")
	'create a menu to change calendar view
	calmenu = vm.CreateMenu("calmenu", Me)
	calmenu.SetButton1("mdi-menu-down", "right", "Type", True)
	calmenu.AddKeyValue("day", "Day")
	calmenu.AddKeyValue("week", "Week")
	calmenu.AddKeyValue("month", "Month")
	calcard.Title.AddMenu(calmenu)
	'we will add calendar to sheet
	Dim calsheet As VMSheet = vm.CreateSheet("calsheet", Me)
	calsheet.SetHeight("600")
	'
	'create the calendar
	cal = vm.CreateCalendar("cal", Me)
	cal.SetCOlor(vm.COLOR_PRIMARY)
	cal.SetEventOverlapMode("column")
	cal.SetEventOverlapThreshold("45")
	'add calender to sheet
	calsheet.SetText(cal.tostring)
	'add sheet to card
	calcard.Text.SetText(calsheet.ToString)
	'add card to container
	calcard.AddToContainer(cont,1,1)
	
	'
	'add some events
	cal.ClearEvents
	cal.ClearCategories
	cal.AddCategory("b4a", vm.COLOR_ORANGE)
	cal.AddCategory("b4i", vm.COLOR_PINK)
	cal.AddCategory("b4j", vm.COLOR_CYAN)
	'
	Dim sNow As String = BANanoShared.DateNow & "T10:00"
	Dim sNow1 As String = BANanoShared.DateNow & "T12:00"
	Dim sNow2 As String = BANanoShared.DateNow & "T13:05"
	'
	cal.AddEvent("1", "b4a", "Develop B4A App", sNow, sNow, False)
	cal.AddEvent("2", "b4i", "Develop B4i App", sNow1, sNow1, False)
	cal.AddEvent("3", "b4j", "Develop B4J App", sNow2, sNow2, True)
	cal.Update
	'run when app is mounded
	vue.SetMounted(Me, "MoundCalendar")
	
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Private calmenu As VMMenu"$)
vue.AddCode($"Private cal As VMCalendar"$)
vue.AddCode($"Private calcard As VMCard"$)
vue.AddCode($"Private BANano As BANano"$)
Main.CreateVBCode(vue, Me, "caldef", "Calendar Definition", vue.GetSourceCode).AddToContainer(cont, 2, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'create a card to hold the calendar"$)
vue.AddCode($"calcard = vm.CreateCard("calcard", Me)"$)
vue.AddCode($"'set title of card, dynamic"$)
vue.AddCode($"calcard.SetTitle("My Calendar")"$)
vue.AddCode($"'add a spacer"$)
vue.AddCode($"calcard.Title.AddSpacer"$)
vue.AddCode($"'add buttons"$)
vue.AddCode($"calcard.Title.AddButton3("caltoday", "", "", "", "Today", True, "", "")"$)
vue.AddCode($"calcard.Title.AddIcon2("calprev", "mdi-chevron-left", "", "small", "","","mx-1")"$)
vue.AddCode($"calcard.Title.AddIcon2("calnext", "mdi-chevron-right", "", "small", "", "", "mx-1")"$)
vue.AddCode($"'create a menu to change calendar view"$)
vue.AddCode($"calmenu = vm.CreateMenu("calmenu", Me)"$)
vue.AddCode($"calmenu.SetButton1("mdi-menu-down", "right", "Type", True)"$)
vue.AddCode($"calmenu.AddKeyValue("day", "Day")"$)
vue.AddCode($"calmenu.AddKeyValue("week", "Week")"$)
vue.AddCode($"calmenu.AddKeyValue("month", "Month")"$)
vue.AddCode($"calcard.Title.AddMenu(calmenu)"$)
vue.AddCode($"'we will add calendar to sheet"$)
vue.AddCode($"Dim calsheet As VMSheet = vm.CreateSheet("calsheet", Me)"$)
vue.AddCode($"calsheet.SetHeight("600")"$)
vue.AddCode($"'"$)
vue.AddCode($"'create the calendar"$)
vue.AddCode($"cal = vm.CreateCalendar("cal", Me)"$)
vue.AddCode($"cal.SetCOlor(vm.COLOR_PRIMARY)"$)
vue.AddCode($"cal.SetEventOverlapMode("column")"$)
vue.AddCode($"cal.SetEventOverlapThreshold("45")"$)
vue.AddCode($"'add calender to sheet"$)
vue.AddCode($"calsheet.SetText(cal.tostring)"$)
vue.AddCode($"'add sheet to card"$)
vue.AddCode($"calcard.Text.SetText(calsheet.ToString)"$)
vue.AddCode($"'add card to container"$)
vue.AddCode($"calcard.AddToContainer(cont,1,1)"$)
vue.AddCode($""$)
vue.AddCode($"'add container to page"$)
vue.AddCode($"vm.AddContainer(cont)"$)
vue.AddCode($"'"$)
vue.AddCode($"'add some events"$)
vue.AddCode($"cal.ClearEvents"$)
vue.AddCode($"cal.ClearCategories"$)
vue.AddCode($"cal.AddCategory("b4a", vm.COLOR_ORANGE)"$)
vue.AddCode($"cal.AddCategory("b4i", vm.COLOR_PINK)"$)
vue.AddCode($"cal.AddCategory("b4j", vm.COLOR_CYAN)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim sNow As String = BANanoShared.DateNow & "T10:00""$)
vue.AddCode($"Dim sNow1 As String = BANanoShared.DateNow & "T12:00""$)
vue.AddCode($"Dim sNow2 As String = BANanoShared.DateNow & "T13:05""$)
vue.AddCode($"'"$)
vue.AddCode($"cal.AddEvent("1", "b4a", "Develop B4A App", sNow, sNow, False)"$)
vue.AddCode($"cal.AddEvent("2", "b4i", "Develop B4i App", sNow1, sNow1, False)"$)
vue.AddCode($"cal.AddEvent("3", "b4j", "Develop B4J App", sNow2, sNow2, True)"$)
vue.AddCode($"cal.Update"$)
vue.AddCode($"'run when app is mounded"$)
vue.AddCode($"vue.SetMounted(Me, "MoundCalendar")"$)
vue.AddCode($""$)
Main.CreateVBCode(vue, Me, "calux", "Calendar User Interface", vue.GetSourceCode).AddToContainer(cont, 3, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'when calendar is mounted"$)
vue.AddCode($"Sub MoundCalendar"$)
vue.AddCode($"cal.CheckChange"$)
vue.AddCode($"Dim caltitle As String = cal.GetTitle"$)
vue.AddCode($"calcard.UpdateTitle(caltitle)"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"'an event is clicked"$)
vue.AddCode($"Sub cal_clickevent(obj As Map)"$)
vue.AddCode($"Dim sevent As String = BANano.tojson(obj)"$)
vue.AddCode($"vm.ShowSnackBar(sevent)"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub cal_clickmore(obj As Object)"$)
vue.AddCode($""$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub cal_clickdate(obj As Object)"$)
vue.AddCode($""$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub cal_change(obj As Object)"$)
vue.AddCode($""$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"'change calendar view"$)
vue.AddCode($"Sub calmenuitems_click(e As BANanoEvent)"$)
vue.AddCode($"Dim calitem As String = vm.GetIDFromEvent(e)"$)
vue.AddCode($"Dim caltitle As String = cal.GetTitle"$)
vue.AddCode($"Select Case calitem"$)
vue.AddCode($"Case "day""$)
vue.AddCode($"calmenu.UpdateButtonLabel("Day")"$)
vue.AddCode($"cal.dayview"$)
vue.AddCode($"calcard.UpdateTitle(caltitle)"$)
vue.AddCode($"Case "week""$)
vue.AddCode($"calmenu.UpdateButtonLabel("Week")"$)
vue.AddCode($"cal.weekview"$)
vue.AddCode($"calcard.UpdateTitle(caltitle)"$)
vue.AddCode($"Case "month""$)
vue.AddCode($"calmenu.UpdateButtonLabel("Month")"$)
vue.AddCode($"cal.monthview"$)
vue.AddCode($"calcard.UpdateTitle(caltitle)"$)
vue.AddCode($"End Select"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"'today is clicked"$)
vue.AddCode($"Sub caltoday_click(e As BANanoEvent)"$)
vue.AddCode($"cal.SelectToday"$)
vue.AddCode($"Dim caltitle As String = cal.GetTitle"$)
vue.AddCode($"calcard.UpdateTitle(caltitle)"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"'prev is clicked"$)
vue.AddCode($"Sub calprev_click(e As BANanoEvent)"$)
vue.AddCode($"cal.ShowPrevious"$)
vue.AddCode($"Dim caltitle As String = cal.GetTitle"$)
vue.AddCode($"calcard.UpdateTitle(caltitle)"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"'next is clicked"$)
vue.AddCode($"Sub calnext_click(e As BANanoEvent)"$)
vue.AddCode($"cal.ShowNext"$)
vue.AddCode($"Dim caltitle As String = cal.GetTitle"$)
vue.AddCode($"calcard.UpdateTitle(caltitle)"$)
vue.AddCode($"End Sub"$)
	Main.CreateVBCode(vue, Me, "calevents", "Calendar Events & Methods", vue.GetSourceCode).AddToContainer(cont, 4, 1)

	
	'add container to page
	vm.AddContainer(cont)

End Sub

'when calendar is mounted
Sub MoundCalendar
	cal.CheckChange
	Dim caltitle As String = cal.GetTitle
	calcard.UpdateTitle(caltitle)
End Sub

'an event is clicked
Sub cal_clickevent(obj As Map)
	Dim sevent As String = BANano.tojson(obj)
	vm.ShowSnackBar(sevent)
End Sub

Sub cal_clickmore(obj As Object)
	
End Sub

Sub cal_clickdate(obj As Object)
	
End Sub
	
Sub cal_change(obj As Object)
	
End Sub

'change calendar view
Sub calmenuitems_click(e As BANanoEvent)
	Dim calitem As String = vm.GetIDFromEvent(e)
	Dim caltitle As String = cal.GetTitle
	Select Case calitem
		Case "day"
			calmenu.UpdateButtonLabel("Day")
			cal.dayview
			calcard.UpdateTitle(caltitle)
		Case "week"
			calmenu.UpdateButtonLabel("Week")
			cal.weekview
			calcard.UpdateTitle(caltitle)
		Case "month"
			calmenu.UpdateButtonLabel("Month")
			cal.monthview	
			calcard.UpdateTitle(caltitle)
	End Select
End Sub

'today is clicked
Sub caltoday_click(e As BANanoEvent)
	cal.SelectToday
	Dim caltitle As String = cal.GetTitle
	calcard.UpdateTitle(caltitle)
End Sub

'prev is clicked
Sub calprev_click(e As BANanoEvent)
	cal.ShowPrevious
	Dim caltitle As String = cal.GetTitle
	calcard.UpdateTitle(caltitle)
End Sub

'next is clicked
Sub calnext_click(e As BANanoEvent)
	cal.ShowNext
	Dim caltitle As String = cal.GetTitle
	calcard.UpdateTitle(caltitle)
End Sub


Sub caldefcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("caldef")
End Sub

Sub caldefdownload_click(e As BANanoEvent)
	vue.DownloadCode("caldef", "caldef.txt")
End Sub


Sub caluxcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("calux")
End Sub

Sub caluxdownload_click(e As BANanoEvent)
	vue.DownloadCode("calux", "calux.txt")
End Sub


Sub caleventscopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("calevents")
End Sub

Sub caleventsdownload_click(e As BANanoEvent)
	vue.DownloadCode("calevents", "calevents.txt")
End Sub
