B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "realtimeLogging"
	Public title As String = "Realtime Logging"
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private ICONS As Map
	Private COLORS As List
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
	cont.AddRows(5).AddColumns12
	'
	'time logging
	Dim cardLog As VMCard
	cardLog.Initialize(vue,"rtlog", Me)
	cardLog.AddClass("mx-auto").SetMaxWidth("600")
	cardLog.Title.SetColor(vm.COLOR_BLUEGREY)
	cardLog.Title.SetTextColor(vm.COLOR_WHITE)
	cardLog.Title.AddElement1("", "span", "Logs", Null, Null, Array("title"))
	cardLog.Title.AddSpacer
	Dim btnReadLog As VMButton
	btnReadLog.Initialize(vue, "btnReadLog", Me)
	btnReadLog.SetLabel("Realtime Logging")
	btnReadLog.SetDark(True)
	btnReadLog.SetDepressed(True)
	btnReadLog.Bind(":outlined", "interval == null")
	btnReadLog.Bind(":color", "interval == null ? 'white' : 'primary'")
	cardLog.Title.AddButton(btnReadLog)
	'
	cardLog.Text.AddClass("py-0")
	'
	'create a timeline
	Dim tx As VMTimeline
	tx.Initialize(vue, "tx", Me).SetDense(True)
	'
	'create slide transition
	Dim stran As VMSlideXReverseTransition
	stran.Initialize(vue, "stran", Me).SetGroup(True).SetHideOnLeave(True)
	'add time line item to transition
	Dim txi As VMTimelineItem
	txi.Initialize(vue, "", Me)
	txi.SetVFor("item", "mashlogs")
	txi.Bind(":key", "item.id")
	txi.Bind(":color", "item.color")
	txi.SetSmall(True)
	txi.SetFillDot(True)
	'add alert to item
	Dim alx As VMAlert
	alx.Initialize(vue, "", Me)
	alx.RemoveVModel
	alx.Bind(":color", "item.color")
	alx.Bind(":icon", "item.icon")
	alx.Bind(":value", "true")
	alx.SetTextColor(vm.COLOR_WHITE)
	alx.AddContent($"<h1>{{ item.id }}</h1>"$)
	alx.AddContent($"<p>${BANanoShared.LoremIpsum(1)}</p>"$)
	txi.SetText(alx.tostring)
	
	'add item to transition
	stran.SetText(txi.ToString)
	'add transition to timeline
	tx.SetText(stran.tostring)
	
	'add timeline to text
	cardLog.Text.SetText(tx.tostring)
	'add card to container
	cardLog.AddToContainer(cont,1,1)

	'add container to page
	vm.AddContainer(cont)
	'
	'define states
	vm.SetData("interval", Null)
	COLORS = vue.CreateB4xList(Array("info", "warning", "error", "success"))
	ICONS = CreateMap("info": "mdi-information", "warning": "mdi-alert", "error": "mdi-alert-circle", "success": "mdi-check-circle")
    vue.SetMethod(Me, "start")
	vue.SetMethod(Me, "stop")
	'
	Dim mashlogs As List = vue.NewList
	Dim logx As Map = CreateMap("id":1, "color":"info")
	Dim sicon As String = ICONS.get("info")
	logx.Put("icon", sicon)
	mashlogs.Add(logx)
	vue.SetData("mashlogs", mashlogs)
	vue.SetData("nonce", 2)
End Sub


Sub btnReadLog_click(e As BANanoEvent)
	'get the interval
	Dim interval As Object = vm.getdata("interval")
	If BANano.isnull(interval) Or BANano.isundefined(interval) Then
		vm.callmethod("start")
	Else
		vm.callmethod("stop")
	End If
End Sub

'start the logs
Sub start
	'add an event every 3 seconds
	Dim interval As Object = BANanoShared.SetInterval(Me, "addevent", 5000, Null)
	'save interval to state
	vue.setdata("interval", interval)
End Sub

'stops the logs
Sub stop
	'get the current interval
	Dim interval As Object = vue.getdata("interval")
	'clear interval
	BANanoShared.clearinterval(interval)
	'update state
	vue.setdata("interval", Null)
End Sub

'add an event
Sub addevent()
	'get a random alert
	Dim alert As Map = genAlert
	Dim color As String = alert.get("color")
	'get the first item in the logs
	Dim firstitem As Map = vue.ListFirstItem("mashlogs")
	'find out if these colors match to last, if so generate another color
	Dim previousColor As String = firstitem.get("color")
	'ensure that colors are unique
	Do While previousColor = color
	'	'generate another color
		color = genColor
	Loop
	'add item at the beginning of the list
	Dim nonce As Int = vue.StateIncrement("nonce")
	
	alert.Put("id", nonce)
	vue.ListUnshift("mashlogs", alert)
	'
	If (nonce > 6) Then
		'array size
		vue.ListPop("mashlogs")
	End If
End Sub

'build a random alert
Sub genAlert As Map
	'get a random color
	Dim color As String = genColor
	'get an icon based on that color
	Dim icon As String = genIcon(color)
	'create an alert object
	Dim res As Map = CreateMap()
	res.put("color", color)
	res.put("icon", icon)
	Return res
End Sub

'get an icon linked to the color
Sub genIcon(color As String) As String
	Dim sicon As String = ICONS.get(color)
	Return sicon
End Sub

'get a random color from the colors list
Sub genColor As String
	'get a randol color
	Dim rcolor As String = BANanoShared.RandListValue(COLORS)
	Return rcolor
End Sub

