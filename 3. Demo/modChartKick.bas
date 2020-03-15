B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "chartkickcode"
	Public title As String = "Chart Kick"
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.AddRows(5).AddColumns4x3
	'
	Dim provChart As VMChartKick = vm.CreateChartKick("provChart", Me).SetLineChart.SetStyleSingle("height", "300px")
	provChart.AddXYMap(CreateMap("2013-02-10":11,"2013-02-11":6,"2013-02-12":3,"2013-02-13":2,"2013-02-14":5, _
	"2013-02-15":3,"2013-02-16":8,"2013-02-17":6,"2013-02-18":6,"2013-02-19":12,"2013-02-20":5,"2013-02-21":5, _
	"2013-02-22":3,"2013-02-23":1,"2013-02-24":10,"2013-02-25":1,"2013-02-26":3,"2013-02-27":2, _
	"2013-02-28":3,"2013-03-01":2,"2013-03-02":8))
	provChart.SetTitle("My Chart")
	cont.AddComponent(1,1, provChart.tostring)
	'
	Dim pie As VMChartKick = vm.CreateChartKick("pie", Me).SetPieChart.SetStyleSingle("height", "300px")
	pie.AddXYMap(CreateMap("Blueberry":44,"Strawberry":23,"Banana":22,"Apple":21,"Grape":13))
	cont.AddComponent(1,2, pie.tostring)
	'
	Dim colChart As VMChartKick = vm.CreateChartKick("colChart", Me).SetColumnChart.SetStyleSingle("height", "300px")
	colChart.AddXYMap(CreateMap("0":32,"1":46,"2":28,"3":21,"4":20,"5":13,"6":27))
	cont.AddComponent(1,3, colChart.tostring)
	'
	Dim barChart As VMChartKick = vm.CreateChartKick("barChart", Me).SetBarChart.SetStyleSingle("height", "300px")
	barChart.AddXYMap(CreateMap("0":32,"1":46,"2":28,"3":21,"4":20,"5":13,"6":27))
	cont.AddComponent(1,4, barChart.tostring)
	'
	Dim areaChart As VMChartKick = vm.CreateChartKick("areaChart", Me).SetAreaChart.SetStyleSingle("height", "300px")
	areaChart.AddXYMap(CreateMap("2013-02-10":11,"2013-02-11":6,"2013-02-12":3,"2013-02-13":2,"2013-02-14":5,"2013-02-15":3, _
	"2013-02-16":8,"2013-02-17":6,"2013-02-18":6,"2013-02-19":12,"2013-02-20":5,"2013-02-21":5,"2013-02-22":3, _
	"2013-02-23":1,"2013-02-24":10,"2013-02-25":1,"2013-02-26":3,"2013-02-27":2,"2013-02-28":3,"2013-03-01":2,"2013-03-02":8))
	cont.AddComponent(2,1, areaChart.tostring)
	'
	Dim scatterChart As VMChartKick = vm.CreateChartKick("scatterChart", Me).SetScatterChart.SetStyleSingle("height", "300px")
	scatterChart.AddXYMap(CreateMap(174.0: 80.0, 176.5: 82.3, 180.3: 73.6, 167.6: 74.1, 188.0: 85.9))
	scatterChart.SetXTitle("Size")
	scatterChart.SetYTitle("Population")
	cont.AddComponent(2,2, scatterChart.tostring)
	'
	Dim lineChartM As VMChartKick = vm.CreateChartKick("lineChartM", Me).SetLineChart.SetStyleSingle("height", "300px")
	lineChartM.AddSeries("Workout", "", True, CreateMap("2013-02-10":3,"2013-02-17":3,"2013-02-24":3,"2013-03-03":1,"2013-03-10":4,"2013-03-17":3,"2013-03-24":2,"2013-03-31":3))
	lineChartM.AddSeries("Go to concert", "", True, CreateMap("2013-02-10":0,"2013-02-17":0,"2013-02-24":0,"2013-03-03":0,"2013-03-10":2,"2013-03-17":1,"2013-03-24":0,"2013-03-31":0))
	lineChartM.AddSeries("Wash face","", True, CreateMap("2013-02-10":0,"2013-02-17":1,"2013-02-24":0,"2013-03-03":0,"2013-03-10":0,"2013-03-17":1,"2013-03-24":0,"2013-03-31":1))
	lineChartM.AddSeries("Call parents","", True, CreateMap("2013-02-10":5,"2013-02-17":3,"2013-02-24":2,"2013-03-03":0,"2013-03-10":0,"2013-03-17":1,"2013-03-24":1,"2013-03-31":0))
	lineChartM.AddSeries("Eat breakfast","",True, CreateMap("2013-02-10":3,"2013-02-17":2,"2013-02-24":1,"2013-03-03":0,"2013-03-10":2,"2013-03-17":2,"2013-03-24":3,"2013-03-31":0))
	
	cont.AddComponent(2,3, lineChartM.tostring)
	'
	Dim donut As VMChartKick = vm.CreateChartKick("donut", Me).SetPieChart.SetStyleSingle("height", "300px")
	donut.AddXYMap(CreateMap("Blueberry":44,"Strawberry":23,"Banana":22,"Apple":21,"Grape":13))
	donut.SetDonut
	cont.AddComponent(2,4, donut.tostring)
	'
	Dim lineChart1 As VMChartKick = vm.CreateChartKick("lineChart1", Me).SetLineChart.SetStyleSingle("height", "300px")
	lineChart1.AddXYMap(CreateMap("Jan": 4, "Feb": 2, "Mar": 10, "Apr": 5, "May": 3))
	lineChart1.SetCurve
	cont.AddComponent(3, 1, lineChart1.tostring)
	'
	Dim colChart1 As VMChartKick = vm.CreateChartKick("colChart1", Me).SetColumnChart.SetStyleSingle("height", "300px")
	colChart1.AddSeries("Series A", "", False, CreateMap("0":32,"1":46,"2":28,"3":21,"4":20,"5":13,"6":27))
	colChart1.AddSeries("Series B", "", False, CreateMap("0":32,"1":46,"2":28,"3":21,"4":20,"5":13,"6":27))
	colChart1.SetStacked
	cont.AddComponent(3,2, colChart1.tostring)
	'
	Dim areaChart1 As VMChartKick = vm.CreateChartKick("areaChart1", Me).SetAreaChart.SetStyleSingle("height", "300px")
	areaChart1.AddSeries("Workout", "", True, CreateMap("2013-02-10":3,"2013-02-17":3,"2013-02-24":3,"2013-03-03":1,"2013-03-10":4,"2013-03-17":3,"2013-03-24":2,"2013-03-31":3))
	areaChart1.AddSeries("Go to concert", "", True, CreateMap("2013-02-10":0,"2013-02-17":0,"2013-02-24":0,"2013-03-03":0,"2013-03-10":2,"2013-03-17":1,"2013-03-24":0,"2013-03-31":0))
	areaChart1.AddSeries("Wash face","", True, CreateMap("2013-02-10":0,"2013-02-17":1,"2013-02-24":0,"2013-03-03":0,"2013-03-10":0,"2013-03-17":1,"2013-03-24":0,"2013-03-31":1))
	areaChart1.AddSeries("Call parents","", True, CreateMap("2013-02-10":5,"2013-02-17":3,"2013-02-24":2,"2013-03-03":0,"2013-03-10":0,"2013-03-17":1,"2013-03-24":1,"2013-03-31":0))
	areaChart1.AddSeries("Eat breakfast","",True, CreateMap("2013-02-10":3,"2013-02-17":2,"2013-02-24":1,"2013-03-03":0,"2013-03-10":2,"2013-03-17":2,"2013-03-24":3,"2013-03-31":0))
	cont.AddComponent(3,3, areaChart1.tostring)
	'
	Dim barChart1 As VMChartKick = vm.CreateChartKick("barChart1", Me).SetBarChart.SetStyleSingle("height", "300px")
	barChart1.AddSeries("Series A", "", False, CreateMap("0":32,"1":46,"2":28,"3":21,"4":20,"5":13,"6":27))
	barChart1.AddSeries("Series B", "", False, CreateMap("0":32,"1":46,"2":28,"3":21,"4":20,"5":13,"6":27))
	barChart1.SetMax(80)
	barChart1.SetStacked
	cont.AddComponent(3,4, barChart1.tostring)
	'
	Dim colChart2 As VMChartKick = vm.CreateChartKick("colChart2", Me).SetColumnChart.SetStyleSingle("height", "300px")
	colChart2.AddSeries("Series A", "", False, CreateMap("0":32,"1":46,"2":28,"3":21,"4":20,"5":13,"6":27))
	colChart2.AddSeries("Series B", "", False, CreateMap("0":32,"1":46,"2":28,"3":21,"4":20,"5":13,"6":27))
	cont.AddComponent(4,1, colChart2.tostring)
	'
	Dim barChart2 As VMChartKick = vm.CreateChartKick("barChart2", Me).SetBarChart.SetStyleSingle("height", "300px")
	barChart2.AddSeries("Series A", "", False, CreateMap("0":32,"1":46,"2":28,"3":21,"4":20,"5":13,"6":27))
	barChart2.AddSeries("Series B", "", False, CreateMap("0":32,"1":46,"2":28,"3":21,"4":20,"5":13,"6":27))
	cont.AddComponent(4,2, barChart2.tostring)
	'
	Dim scatterChart1 As VMChartKick = vm.CreateChartKick("scatterChart1", Me).SetScatterChart.SetStyleSingle("height", "300px")
	scatterChart1.AddSeries("Female", "", False, CreateMap(174.0: 73.6, 162.6: 61.4, 174.0: 55.5, 162.6: 63.6, 161.3: 60.9))
	scatterChart1.AddSeries("Male", "", False, CreateMap(174.0: 80.0, 176.5: 82.3, 180.3: 73.6, 167.6: 74.1, 188.0: 85.9))
	cont.AddComponent(4,3, scatterChart1.tostring)

	'add container to page
	vm.AddContainer(cont)
End Sub
