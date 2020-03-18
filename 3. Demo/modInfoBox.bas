B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "infoboxcode"
	Private allspent As VMInfoBox
	Private mostspentby As VMInfoBox
	Private mostspenton As VMInfoBox
	Private spentthisyear As VMInfoBox
	Public Title As String = "Info Box"
	Private orders As VMInfoBox
	Private alarm As VMInfoBox
	Private kids As VMInfoBox
	Private newusers As VMInfoBox
End Sub

Sub Refresh
	allspent.start
	mostspentby.start
	mostspenton.start
	spentthisyear.start
	orders.start
	kids.start
	newusers.start
End Sub

Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.AddRows(5).AddColumns4x3
	'
	allspent = vm.CreateInfoBox("allspent", Me).SetIcon("attach_money").SetFrom("0").SetTo("3967").SetText("Overall Spent")
	allspent.SetIconBackgroundColor(vm.COLOR_GREEN).SetHoverExpandEffect(True).SetDuration("500")
	cont.AddComponent(1,1,allspent.tostring)
	'
	mostspentby = vm.CreateInfoBox("mostspentby", Me).SetIcon("insert_chart").SetFrom("0").SetTo("1800").SetText("Cheque").SetIconBackgroundColor(vm.COLOR_ORANGE)
	mostspentby.SetHoverExpandEffect(True).SetDuration("500")
	cont.AddComponent(1,2,mostspentby.tostring)
	'
	mostspenton = vm.CreateInfoBox("mostspenton", Me).SetIcon("insert_chart").SetFrom("0").SetTo("1600").SetText("Shopping")
	mostspenton.SetIconBackgroundColor(vm.COLOR_BLUE).SetHoverExpandEffect(True).SetDuration("500")
	cont.AddComponent(1,3,mostspenton.tostring)
	'
	spentthisyear = vm.CreateInfoBox("spentthisyear", Me).SetIcon("attach_money").SetFrom("0").SetTo("2000").SetText("Spent This Year")
	spentthisyear.SetIconBackgroundColor(vm.COLOR_PINK).SetHoverExpandEffect(True).SetDuration("500")
	cont.AddComponent(1,4,spentthisyear.tostring)
	'
	orders = vm.NewInfoBox(Me, "orders", "NEW ORDERS", "shopping_cart", Null, "0", "125")
	orders.SetHoverExpandEffect(True).SetStyle4(True)
	cont.AddComponent(2,1,orders.tostring)
	'
	alarm = vm.NewInfoBox(Me, "alarm", "ALARM", "access_alarm", Null, Null, "7:00")
	alarm.SetBackgroundCOlor(vm.COLOR_LIGHTBLUE)
	alarm.SetHoverZoomEffect(True)
	cont.AddComponent(2,2,alarm.tostring)
	'
	kids = vm.NewInfoBox(Me, "kids", "BOOKMARKS", "bookmark", "", "0", "117")
	kids.SetBackgroundCOlor(vm.COLOR_PURPLE).SetStyle2(True)
	kids.SetHoverZoomEffect(True)
	cont.AddComponent(2,3,kids.tostring)
	'
	newusers = vm.NewInfoBox(Me, "newusers", "NEW USERS", "face", "", "0", "257")
	newusers.SetBackgroundCOlor(vm.COLOR_INDIGO).SetStyle3(True).SetIconColor(vm.COLOR_WHITE)
	newusers.SetHoverZoomEffect(True)
	cont.AddComponent(2,4,newusers.tostring)
	
	
	vm.AddContainer(cont)
End Sub


Sub allspent_click(e As BANanoEvent)
	vm.ShowSnackBar("All Spent!")
End Sub

Sub mostspentby_click(e As BANanoEvent)
	vm.ShowSnackBar("Most Spent By!")
End Sub

Sub mostspenton_click(e As BANanoEvent)
	vm.ShowSnackBar("Most Spent On!")
End Sub

Sub spentthisyear_click(e As BANanoEvent)
	vm.ShowSnackBar("Spent this Year!")
End Sub