B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private p As VMElement
	Public FrappeGantt As VMElement
	Public ID As String
	Private vue As BANanoVue
	Type ViewType(QuarterDay As String,HalfDay As String,Day As String, Week As String,Month As String)
	Public EnumView As ViewType
	Public Tasks As List
	Private options As Map
	Private BANano As BANano  'ignore
	Private boFG As BANanoObject
	Private module As Object
End Sub

#if css
	.gantt .bar-label {fill: black !important; font-weight: normal !important}
	.gantt .bar-milestone .bar { fill: tomato !important;}
#End If

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMFrappeGantt
	FrappeGantt.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMFrappeGantt
	FrappeGantt.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMFrappeGantt
	FrappeGantt.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMFrappeGantt
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMFrappeGantt
	FrappeGantt.RemoveAttr(sName)
	Return Me
End Sub


Sub SetDesignMode(b As Boolean) As VMFrappeGantt
	FrappeGantt.SetDesignMode(b)
	Return Me
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMFrappeGantt
	BANano.DependsOnAsset("frappe-gantt.css")
	BANano.DependsOnAsset("frappe-gantt.js")
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	Tasks.Initialize 
	FrappeGantt.Initialize(vue, ID).SetTag("div")
	p.Initialize(vue, $"${ID}field"$).SetTag("div") 
	EnumView.Initialize
	EnumView.Day = "Day"
	EnumView.HalfDay = "Half Day"
	EnumView.Month = "Month"
	EnumView.QuarterDay = "Quarter Day"
	EnumView.Week = "Week"
	options.Initialize
	options.put("view_modes", Array("Quarter Day", "Half Day", "Day", "Week", "Month"))
	options.Put("custom_popup_html", Null)
	SetViewMode("Day")
	SetDateFormat("YYYY-MM-DD")
	SetLanguage("en")
	SetElevation(2)
	Dim task As Object, start As Object, finish As Object
	Dim progress As Object, mode As Object
	SetOnClick(task)
	SetOnDateChange(task, start, finish)
	SetOnProgressChange(task, progress)
	SetOnViewChange(mode)
	Return Me
End Sub

Sub SetElevation(e As Int) As VMFrappeGantt
	p.SetElevation(e)
	Return Me
End Sub


Sub SetLanguage(lng As String) As VMFrappeGantt
	options.Put("language", lng)
	Return Me
End Sub

Sub SetWidth(w As String) As VMFrappeGantt
	p.SetStyle(CreateMap("width":w))
	p.SetWidth(w)
	Return Me
End Sub

Sub SetHeight(h As String) As VMFrappeGantt
	p.SetStyle(CreateMap("height":h))
	p.SetHeight(h)
	Return Me
End Sub

Sub SetViewMonth As VMFrappeGantt
	SetViewMode("Month")
	Return Me
End Sub

Sub SetViewWeek As VMFrappeGantt
	SetViewMode("Week")
	Return Me
End Sub

Sub SetViewDay As VMFrappeGantt
	SetViewMode("Day")
	Return Me
End Sub

Sub SetViewHalfDay As VMFrappeGantt
	SetViewMode("Half Day")
	Return Me
End Sub

Sub SetViewQuarterDay As VMFrappeGantt
	SetViewMode("Quarter Day")
	Return Me
End Sub

'set header height
Sub SetHeaderHeight(hh As String) As VMFrappeGantt
	options.Put("header_height", hh)
	Return Me
End Sub

'set column width
Sub SetColumnWidth(cw As String) As VMFrappeGantt
	options.Put("column_width", cw)
	Return Me
End Sub

'set step
Sub SetStep(si As String) As VMFrappeGantt
	options.Put("step", si)
	Return Me
End Sub
    
'set bar height	
Sub SetBarHeight(bh As String) As VMFrappeGantt
	options.Put("bar_height", bh)
	Return Me
End Sub

'set border corner radius
Sub SetBorderCornerRadius(bcr As String) As VMFrappeGantt
	options.Put("bar_corner_radius", bcr)
	Return Me
End Sub

'set arrow curve
Sub SetArrowCurve(ac As String) As VMFrappeGantt
	options.Put("arrow_curve", ac)
	Return Me	
End Sub

'set padding
Sub SetPadding(px As String) As VMFrappeGantt
	options.Put("padding", px)
	Return Me
End Sub

'setviewmode
Sub SetViewMode(vm As String) As VMFrappeGantt
	options.Put("view_mode", vm)
	Return Me
End Sub

'set date format
Sub SetDateFormat(df As String) As VMFrappeGantt
	options.Put("date_format", df)
	Return Me
End Sub
   
'add a task
Sub AddTask(taskID As String, taskName As String, taskStart As String, taskFinish As String, taskProgress As Int, taskIDDependencies As String, bMileStone As Boolean)
	Dim tsk As Map = CreateMap("id": taskID, "start": taskStart, "end": taskFinish, "progress": taskProgress)
	Dim tn As String = $"${taskName} (${taskProgress}%)"$
	tsk.Put("name", tn)
	If taskIDDependencies <> "" Then
		tsk.put("dependencies", taskIDDependencies)
	End If
	If bMileStone Then
		tsk.Put("custom_class", "bar-milestone")
	End If
	Tasks.Add(tsk)
End Sub

'clear the tasks
Sub Clear
	Tasks.Initialize 
End Sub

Sub SetTabIndex(ti As String) As VMFrappeGantt
	If ti = "" Then Return Me
	FrappeGantt.SetTabIndex(ti)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMFrappeGantt
	FrappeGantt.SetStyle(sm)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMFrappeGantt
	FrappeGantt.SetVIf(vif)
	Return Me
End Sub

Sub SetID(iID As String, bind As Boolean) As VMFrappeGantt
	FrappeGantt.SetID(iID,bind)
	Return Me
End Sub

Sub SetName(nam As String, bind As Boolean) As VMFrappeGantt
	FrappeGantt.SetName(nam, bind)
	Return Me
End Sub

Sub SetKey(k As String, bind As Boolean) As VMFrappeGantt
	FrappeGantt.SetKey(k, bind)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMFrappeGantt
	FrappeGantt.SetVShow(vif)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMFrappeGantt
	FrappeGantt.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMFrappeGantt
	FrappeGantt.SetAttr(attr)
	Return Me
End Sub

'set onclick event, use id_click
private Sub SetOnClick(task As Object) As VMFrappeGantt
	Dim cb As BANanoObject = BANano.CallBack(module, $"${ID}_click"$, Array(task))
	options.Put("on_click", cb)
	Return Me
End Sub

'set on date change, use id_datechange
private Sub SetOnDateChange(task As Object, start As Object, finish As Object) As VMFrappeGantt
	Dim cb As BANanoObject = BANano.CallBack(module, $"${ID}_datechange"$, Array(task, start, finish))
	options.Put("on_date_change", cb)
	Return Me
End Sub

'set on progress change, use id_progresschange
private Sub SetOnProgressChange(task As Object, progress As Object) As VMFrappeGantt
	Dim cb As BANanoObject = BANano.CallBack(module, $"${ID}_progresschange"$, Array(task, progress))
	options.Put("on_date_change", cb)
	Return Me
End Sub

'set on view change, use id_viewchange
private Sub SetOnViewChange(mode As Object) As VMFrappeGantt
	Dim cb As BANanoObject = BANano.CallBack(module, $"${ID}_viewchange"$, Array(mode))
	options.Put("on_view_change", cb)
	Return Me
End Sub

Sub ToString As String
	
	FrappeGantt.Pop(p)
	Return p.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(px As VMElement)
	px.SetText(ToString)
End Sub


'refresh the grantt chart
Sub Refresh As VMFrappeGantt
	'initialize jquery
	Dim gKey As String = $"#${ID}"$
	boFG.Initialize2("Gantt", Array(gKey, Tasks, options))
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMFrappeGantt
FrappeGantt.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMFrappeGantt
FrappeGantt.SetVisible(b)
Return Me
End Sub