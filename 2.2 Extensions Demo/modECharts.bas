B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'"Static code module
Sub Process_Globals
	Public name As String = "echartsCode"
	Public title As String = "ECharts"
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private echart1 As VMEChart
	Dim echart2 As VMEChart
	Dim echart3 As VMEChart
	Dim echart4 As VMEChart
	Dim echart5 As VMEChart
	Dim echart6 As VMEChart
	Dim echart7 As VMEChart
	Dim echart8 As VMEChart
	Dim echart9 As VMEChart
	Dim echart10 As VMEChart
	Dim echart11 As VMEChart
	Dim echart12 As VMEChart
	Dim echart13 As VMEChart
	Dim echart14 As VMEChart
	Dim echart15 As VMEChart
	Dim echart16 As VMEChart
	Dim echart17 As VMEChart
	Dim echart18 As VMEChart
	Dim echart19 As VMEChart
	Dim echart20 As VMEChart
	Dim echart21 As VMEChart
	Dim echart22 As VMEChart
	Dim echart23 As VMEChart
	Dim echart24 As VMEChart
	Dim echart26 As VMEChart
	Dim echart27 As VMEChart
	Dim echart28 As VMEChart
	Dim echart29 As VMEChart
	Dim echart30 As VMEChart
	Dim echart31 As VMEChart
	Dim echart32 As VMEChart
	Dim echart33 As VMEChart
	Dim echart34 As VMEChart
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'
	cont.AddRows(20).AddColumns4x3
	'
	Dim chartD As List
	chartD.initialize
	chartD.Add(CreateMap("date": "01/01", "cost": 1523, "profit": 1523, "growthRate": 0.12, "people": 100))
    chartD.Add(CreateMap("date": "01/02", "cost": 1223, "profit": 1623, "growthRate": 0.345, "people": 100))
    chartD.Add(CreateMap("date": "01/03", "cost": 2123, "profit": 1723, "growthRate": 0.7, "people": 100))
    chartD.Add(CreateMap("date": "01/04", "cost": 4123, "profit": 1423, "growthRate": 0.31, "people": 100))
    chartD.Add(CreateMap("date": "01/05", "cost": 3123, "profit": 1223, "growthRate": 0.12, "people": 100))
    chartD.Add(CreateMap("date": "01/06", "cost": 7123, "profit": 1123, "growthRate": 0.65, "people": 100))
    '
	Dim pieD As List
	pieD.initialize
	pieD.Add(CreateMap("date": "01/01", "cost": 1523,"profit": 1523))
    pieD.Add(CreateMap("date": "01/02", "cost": 1223,"profit": 1623))
    pieD.Add(CreateMap("date": "01/03", "cost": 2123, "profit": 1723))
    pieD.Add(CreateMap("date": "01/04", "cost": 4123,"profit": 1423))
    pieD.Add(CreateMap("date": "01/05", "cost": 3123, "profit": 1223))
    pieD.Add(CreateMap("date": "01/06", "cost": 7123,"profit": 1123))
	'
	echart1.Initialize(vue, "e1", Me).SetLineChart
	cont.AddComponent(1, 1, echart1.tostring)
	'	
	echart2.Initialize(vue, "e2", Me).SetLineChart
	echart2.SetColumns(Array("date", "cost", "profit", "growthRate", "people"))
	echart2.SetRows(chartD)
	cont.AddComponent(1, 2, echart2.tostring)
	'
	echart3.Initialize(vue,  "e3", Me).SetLineChart
	echart3.SetColumns(Array("date", "cost", "profit", "growthRate", "people"))
	echart3.SetMetrics(Array("cost","profit"))
	echart3.SetDimension(Array("date"))
	echart3.SetRotateXAxis(45)
	echart3.SetRows(chartD)
	cont.AddComponent(1, 3, echart3.tostring)
	'
	echart4.Initialize(vue,  "e4", Me).SetLineChart
	echart4.SetArea
	echart4.SetStack("sell", Array("cost", "profit"))
	echart4.SetColumns(Array("date", "cost", "profit", "growthRate", "people"))
	echart4.SetRows(chartD)
	cont.AddComponent(1, 4, echart4.tostring)
	'histogram
	echart5.Initialize(vue, "e5", Me).SetHistogram
	echart5.SetColumns(Array("date", "cost", "profit", "growthRate", "people"))
	echart5.SetRows(chartD)
	cont.AddComponent(2, 1, echart5.tostring)
	'
	echart6.Initialize(vue, "e6", Me).SetHistogram
	echart6.SetColumns(Array("date", "cost", "profit", "growthRate", "people"))
	echart6.SetRows(chartD)
	echart6.SetMetrics(Array("cost","profit"))
	echart6.SetDimension(Array("date"))
	cont.AddComponent(2, 2, echart6.tostring)
	'
	echart7.Initialize(vue, "e7", Me).SetHistogram
	echart7.SetColumns(Array("date", "cost", "profit", "growthRate", "people"))
	echart7.SetRows(chartD)
	echart7.SetMetrics(Array("cost","profit"))
	echart7.SetShowLine(Array("profit"))
	echart7.SetShowLabelOnTop
	cont.AddComponent(2, 3, echart7.tostring)
	'
	echart8.Initialize(vue,  "e8", Me).SetHistogram
	echart8.SetColumns(Array("date", "cost", "profit", "growthRate", "people"))
	echart8.SetRows(chartD)
	echart8.SetMetrics(Array("cost","profit"))
	echart8.SetStack("sales", Array("cost", "profit"))
	cont.AddComponent(2, 4, echart8.tostring)
	'
	echart9.Initialize(vue,  "e9", Me).SetBarChart
	echart9.SetColumns(Array("date", "cost", "profit", "growthRate", "people"))
	echart9.SetRows(chartD)
	echart9.SetMetrics(Array("cost","profit"))
	echart9.SetDimension(Array("date"))
	cont.AddComponent(3, 1, echart9.tostring)
	'
	echart10.Initialize(vue, "e10", Me).SetBarChart
	echart10.SetColumns(Array("date", "cost", "profit", "growthRate", "people"))
	echart10.SetRows(chartD)
	echart10.SetMetrics(Array("cost","profit"))
	echart10.SetDimension(Array("date"))
	echart10.SetStack("xxx", Array("cost", "profit"))
	cont.AddComponent(3, 2, echart10.tostring)
	'
	echart11.Initialize(vue, "e11", Me).SetBarChart
	echart11.SetColumns(Array("date", "cost", "profit", "growthRate", "people"))
	echart11.SetRows(chartD)
	echart11.SetMetrics(Array("profit"))
	echart11.SetDimension(Array("date"))
	echart11.SetDataOrder("profit", "desc")
	cont.AddComponent(3, 3, echart11.tostring)
	'
	echart12.Initialize(vue, "e12", Me).SetPieChart
	echart12.SetColumns(Array("date", "cost", "profit"))
	echart12.SetRows(pieD)
	cont.AddComponent(4, 1, echart12.tostring)
	'
	echart13.Initialize(vue,  "e13", Me).SetPieChart
	echart13.SetColumns(Array("date", "cost", "profit"))
	echart13.SetRows(pieD)
	echart13.SetDimension(Array("cost"))
	echart13.SetMetrics(Array("profit"))
	cont.AddComponent(4, 2, echart13.tostring)
	'
	echart14.Initialize(vue, "e14", Me).SetPieChart
	echart14.SetColumns(Array("date", "cost", "profit"))
	echart14.SetRows(pieD)
	echart14.SetRoseTypeRadius
	cont.AddComponent(4, 3, echart14.tostring)
	'
	echart15.Initialize(vue, "e15", Me).SetPieChart
	echart15.SetColumns(Array("date", "cost", "profit"))
	echart15.SetRows(pieD)
	echart15.SetDataTypePercent
	cont.AddComponent(4, 4, echart15.tostring)
	'
	echart16.Initialize(vue, "e16", Me).SetRingChart
	echart16.SetColumns(Array("date", "cost", "profit"))
	echart16.SetRows(pieD)
	cont.AddComponent(5, 1, echart16.tostring)
	'
	echart17.Initialize(vue,  "e17", Me).SetRingChart
	echart17.SetColumns(Array("date", "cost", "profit"))
	echart17.SetRows(pieD)
	echart17.SetDimension(Array("cost"))
	echart17.SetMetrics(Array("profit"))
	cont.AddComponent(5, 2, echart17.tostring)
	'
	echart18.Initialize(vue, "e18", Me).SetRingChart
	echart18.SetColumns(Array("date", "cost", "profit"))
	echart18.SetRows(pieD)
	echart18.SetRoseTypeRadius
	cont.AddComponent(5, 3, echart18.tostring)
	'
	Dim funnelD As List
	funnelD.initialize
	funnelD.add(CreateMap("status": "display", "value": 900))
    funnelD.add(CreateMap("status": "visit", "value": 600))
    funnelD.add(CreateMap("status": "click", "value": 300))
    funnelD.add(CreateMap("status": "order", "value": 200))
	funnelD.add(CreateMap("status": "zeroValue", "value": 0))
	'
	echart19.Initialize(vue,  "e19", Me).SetFunnelChart
	echart19.SetColumns(Array("status", "value"))
	echart19.SetRows(funnelD)
	cont.AddComponent(6, 1, echart19.tostring)
	'
	echart20.Initialize(vue, "e20", Me).SetFunnelChart
	echart20.SetColumns(Array("status", "value"))
	echart20.SetRows(funnelD)
	echart20.SetDimension(Array("status"))
	echart20.SetMetrics(Array("value"))
	cont.AddComponent(6, 2, echart20.tostring)
	'
	echart21.Initialize(vue, "e21", Me).SetFunnelChart
	echart21.SetColumns(Array("status", "value"))
	echart21.SetRows(funnelD)
	echart21.SetAscending
	cont.AddComponent(6, 3, echart21.tostring)
	'
	Dim mapD As List
	mapD.initialize
	mapD.add(CreateMap("location": "吉林", "GDP": 123, "person": 123, "area": 92134))
    mapD.add(CreateMap("location": "北京", "GDP": 1223, "person": 2123, "area": 29234))
    mapD.add(CreateMap("location": "上海", "GDP": 2123, "person": 1243, "area": 94234))
    mapD.add(CreateMap("location": "浙江", "GDP": 4123, "person": 5123, "area": 29234))
    '
	echart22.Initialize(vue,  "e22", Me).SetMapChart
	echart22.SetColumns(Array("location", "GDP"))
	echart22.SetRows(mapD)
	cont.AddComponent(7, 1, echart22.tostring)
	'
	echart23.Initialize(vue, "e23", Me).SetMapChart
	echart23.SetColumns(Array("location", "GDP"))
	echart23.SetPosition("china")
    echart23.SetDimension(Array("location"))
    echart23.SetMetrics(Array("person", "area"))
    echart23.SetDataType("area", "KMB")
	echart23.SetRows(mapD)
	cont.AddComponent(7, 2, echart23.tostring)
	'
	Dim mapD1 As List
	mapD1.initialize
	mapD1.add(CreateMap("location": "延庆区", "GDP": 123))
    mapD1.add(CreateMap("location": "密云区", "GDP": 1223))
    mapD1.add(CreateMap("location": "平谷区", "GDP": 2123))
    mapD1.add(CreateMap("location": "海淀区", "GDP": 4123))
    '
	echart24.Initialize(vue, "e24", Me).SetMapChart
	echart24.SetColumns(Array("location", "GDP"))
	echart24.SetPosition("province/beijing")
    echart24.SetRows(mapD1)
	echart24.SetLabel(False)
	cont.AddComponent(7, 3, echart24.tostring)
	'
'	Dim echart25 As VMEChart = vm.createechart("e25", Me).SetLiquidFillChart
'	echart25.SetColumns(Array("city", "percent"))
'	echart25.AddRow(CreateMap("city": "ShangHai", "percent": 0.6))
'	cont.AddComponent(8, 1, echart25.tostring)
	'
	Dim links As List
	links.initialize
	links.add(CreateMap("source": "front", "target": "list-a", "value": 0.5))
    links.add(CreateMap("source": "front", "target": "list-b", "value": 0.5))
    links.add(CreateMap("source": "list-a", "target": "content-a-1", "value": 0.1))
    links.add(CreateMap("source": "list-a", "target": "content-a-2", "value": 0.4))
    links.add(CreateMap("source": "list-b", "target": "content-b-1", "value": 0.2))
    links.add(CreateMap("source": "list-b", "target": "content-b-2", "value": 0.3))
    '
	Dim sData As List
	sData.initialize
	sData.add(CreateMap("page": "front", "pv": 100000))
    sData.add(CreateMap("page": "list-a", "pv": 20000))
    sData.add(CreateMap("page": "list-b", "pv": 80000))
    sData.add(CreateMap("page": "content-a-1", "pv": 10000))
    sData.add(CreateMap("page": "content-a-2", "pv": 10000))
    sData.add(CreateMap("page": "content-b-1", "pv": 60000))
    sData.add(CreateMap("page": "content-b-2", "pv": 20000))
		
	echart26.Initialize(vue,  "e26", Me).SetSanKeyChart
	echart26.SetLinks(links)
	echart26.SetColumns(Array("page", "pv"))
	echart26.SetRows(sData)
	cont.AddComponent(9, 1, echart26.tostring)
	'
	Dim hData As List
	hData.initialize
	hData.add(CreateMap("week": "Monday", "location": "Beijing", "person": 1000))
    hData.add(CreateMap("week": "Tuesday", "location": "Shanghai", "person": 400))
    hData.add(CreateMap("week": "Wednesday", "location": "Hangzhou", "person": 800))
    hData.add(CreateMap("week": "Tuesday", "location": "Shenzhen", "person": 200))
    hData.add(CreateMap("week": "Wednesday", "location": "Changhcun", "person": 100))
    hData.add(CreateMap("week": "Friday", "location": "Nanjing", "person": 300))
    hData.add(CreateMap("week": "Thursday", "location": "Jiangsu", "person": 800))
    hData.add(CreateMap("week": "Monday", "location": "Beijing", "person": 700))
    hData.add(CreateMap("week": "Wednesday", "location": "Shanghai", "person": 300))
    hData.add(CreateMap("week": "Tuesday", "location": "Hangzhou", "person": 500))
    '	
	echart27.Initialize(vue, "e27", Me).SetHeatMap
	echart27.SetColumns(Array("week", "location", "person"))
	echart27.SetRows(hData)
	cont.AddComponent(9, 2, echart27.tostring)
	'
	Dim mData As List
	mData.initialize
	mData.Add(CreateMap("lat": 120.14322240845, "lng": 30.236064370321))
    mData.Add(CreateMap("lat": 120.14301682797, "lng": 30.236035316745))
    mData.Add(CreateMap("lat": 120.14138577045, "lng": 30.236113748704))
    mData.Add(CreateMap("lat": 120.1400398833, "lng": 30.235973050702))
    mData.Add(CreateMap("lat": 120.13893453465, "lng": 30.23517220446))
    mData.Add(CreateMap("lat": 120.1382899739, "lng": 30.234062922977))
    mData.Add(CreateMap("lat": 120.13265960629, "lng": 30.231641351722))
    mData.Add(CreateMap("lat": 120.13170681763, "lng": 30.229925745619))
    mData.Add(CreateMap("lat": 120.13119614803, "lng": 30.228996846637))
    mData.Add(CreateMap("lat": 120.13023980134, "lng": 30.228226570416))
   
	
	echart28.Initialize(vue, "e28", Me).SetHeatMap
	echart28.SetColumns(Array("lat", "lng"))
	echart28.SetRows(mData)
	echart28.SetBMapKey("oBvDtR6nzWtVchkY4cLHtnah1VVZQKRK")
	echart28.SetBMapCenter(120.14322240845, 30.236064370321)
	echart28.SetBMapZoom(14)
	echart28.SetBMapRoam(True)
	cont.AddComponent(9, 3, echart28.tostring)
	'
	echart29.Initialize(vue, "e29", Me).SetGaugeChart
	echart29.SetColumns(Array("type", "value"))
	echart29.AddRow(CreateMap("type": "speed", "value": 80))
	echart29.SetDimension(Array("type"))
	echart29.SetMetrics(Array("value"))
	cont.AddComponent(10, 1, echart29.tostring)
	'
	echart30.Initialize(vue,  "e30", Me).SetGaugeChart
	echart30.SetColumns(Array("type", "value"))
	echart30.AddRow(CreateMap("type": "rate", "value": 0.8))
	echart30.SetDataType("rate", "percent")
	echart30.SetSeriesMap("rate", CreateMap("min":0, "max":1))
	cont.AddComponent(10, 2, echart30.tostring)
	'
	echart31.Initialize(vue, "e31", Me).SetGaugeChart
	echart31.SetColumns(Array("type", "value"))
	echart31.AddRow(CreateMap("type": "speed", "value": 60))
	echart31.SetLabelMap("speed", "s")
	echart31.SetDataName("speed", "km/h")
	cont.AddComponent(10, 3, echart31.tostring)
	'
	echart32.Initialize(vue, "e32", Me).SetTreeChart
	echart32.SetColumns(Array("name", "value"))
	'
	echart32.AddItem("", "1", CreateMap("value":1, "name":"f", "link":"https://ele.me"))
	echart32.AddItem("1", "2", CreateMap("name":"a", "value":1, "link":"https://ele.me"))
	echart32.AddItem("2", "6", CreateMap("name":"a-a", "value":2, "link":"https://ele.me"))
	echart32.AddItem("2", "7", CreateMap("name":"a-b", "value":2, "link":"https://ele.me"))
	'
	echart32.AddItem("1", "3", CreateMap("name":"b", "value":2, "link":"https://ele.me"))
	echart32.AddItem("3", "8", CreateMap("name":"b-a", "value":2, "link":"https://ele.me"))
	echart32.AddItem("3", "9", CreateMap("name":"b-b", "value":2, "link":"https://ele.me"))
	'
	echart32.AddItem("1", "4", CreateMap("name":"c", "value":3, "link":"https://ele.me"))
	echart32.AddItem("4", "10", CreateMap("name":"c-a", "value":4, "link":"https://ele.me"))
	echart32.AddItem("4", "11", CreateMap("name":"c-b", "value":2, "link":"https://ele.me"))
	'
	echart32.AddItem("1", "5", CreateMap("name":"d", "value":4, "link":"https://ele.me"))
	echart32.AddItem("5", "12", CreateMap("name":"d-a", "value":4, "link":"https://ele.me"))
	echart32.AddItem("5", "13", CreateMap("name":"d-b", "value":2, "link":"https://ele.me"))
	
	echart32.AddRow(CreateMap("name": "tree", "value": echart32.treeData))
	cont.AddComponent(11, 1, echart32.tostring)
	' radial chart
	echart33.Initialize(vue, "e33", Me).SetTreeChart
	echart33.SetColumns(Array("name", "value"))
	echart33.SetTreeRadial("tree")
	'
	echart33.AddItem("", "1", CreateMap("value":1, "name":"f", "link":"https://ele.me"))
	echart33.AddItem("1", "2", CreateMap("name":"a", "value":1, "link":"https://ele.me"))
	echart33.AddItem("2", "6", CreateMap("name":"a-a", "value":2, "link":"https://ele.me"))
	echart33.AddItem("2", "7", CreateMap("name":"a-b", "value":2, "link":"https://ele.me"))
	'
	echart33.AddItem("1", "3", CreateMap("name":"b", "value":2, "link":"https://ele.me"))
	echart33.AddItem("3", "8", CreateMap("name":"b-a", "value":2, "link":"https://ele.me"))
	echart33.AddItem("3", "9", CreateMap("name":"b-b", "value":2, "link":"https://ele.me"))
	'
	echart33.AddItem("1", "4", CreateMap("name":"c", "value":3, "link":"https://ele.me"))
	echart33.AddItem("4", "10", CreateMap("name":"c-a", "value":4, "link":"https://ele.me"))
	echart33.AddItem("4", "11", CreateMap("name":"c-b", "value":2, "link":"https://ele.me"))
	'
	echart33.AddItem("1", "5", CreateMap("name":"d", "value":4, "link":"https://ele.me"))
	echart33.AddItem("5", "12", CreateMap("name":"d-a", "value":4, "link":"https://ele.me"))
	echart33.AddItem("5", "13", CreateMap("name":"d-b", "value":2, "link":"https://ele.me"))
	
	echart33.AddRow(CreateMap("name": "tree", "value": echart33.treeData))
	cont.AddComponent(11, 2, echart33.tostring)
	' vertical tree
	echart34.Initialize(vue, "e34", Me).SetTreeChart
	echart34.SetColumns(Array("name", "value"))
	echart34.SetTreeVertical("tree")
	'
	echart34.AddItem("", "1", CreateMap("value":1, "name":"f", "link":"https://ele.me"))
	echart34.AddItem("1", "2", CreateMap("name":"a", "value":1, "link":"https://ele.me"))
	echart34.AddItem("2", "6", CreateMap("name":"a-a", "value":2, "link":"https://ele.me"))
	echart34.AddItem("2", "7", CreateMap("name":"a-b", "value":2, "link":"https://ele.me"))
	'
	echart34.AddItem("1", "3", CreateMap("name":"b", "value":2, "link":"https://ele.me"))
	echart34.AddItem("3", "8", CreateMap("name":"b-a", "value":2, "link":"https://ele.me"))
	echart34.AddItem("3", "9", CreateMap("name":"b-b", "value":2, "link":"https://ele.me"))
	'
	echart34.AddItem("1", "4", CreateMap("name":"c", "value":3, "link":"https://ele.me"))
	echart34.AddItem("4", "10", CreateMap("name":"c-a", "value":4, "link":"https://ele.me"))
	echart34.AddItem("4", "11", CreateMap("name":"c-b", "value":2, "link":"https://ele.me"))
	'
	echart34.AddItem("1", "5", CreateMap("name":"d", "value":4, "link":"https://ele.me"))
	echart34.AddItem("5", "12", CreateMap("name":"d-a", "value":4, "link":"https://ele.me"))
	echart34.AddItem("5", "13", CreateMap("name":"d-b", "value":2, "link":"https://ele.me"))
	
	echart34.AddRow(CreateMap("name": "tree", "value": echart34.treeData))
	cont.AddComponent(11, 3, echart34.tostring)
	'add container to page
	vm.AddContainer(cont)
End Sub

Sub Show
	'runtime update
	echart1.Clear
	echart1.SetColumns(Array("date", "sales"))
	echart1.AddRow(CreateMap("date": "01-Jan", "sales": 123))
	echart1.AddRow(CreateMap("date": "01-Feb", "sales": 1223))
	echart1.AddRow(CreateMap("date": "01-Mar", "sales": 2123))
	echart1.AddRow(CreateMap("date": "01-Apr", "sales": 4123))
	echart1.AddRow(CreateMap("date": "01-May", "sales": 3123))
	echart1.Refresh
	
	'refreshing static
	echart2.Refresh
	echart3.Refresh
	echart4.Refresh
	echart5.Refresh
	echart6.Refresh
	echart7.Refresh
	echart8.Refresh
	echart9.Refresh
	echart10.Refresh
	echart11.Refresh
	echart12.Refresh
	echart13.Refresh
	echart14.Refresh
	echart15.Refresh
	echart16.Refresh
	echart17.Refresh
	echart18.Refresh
	echart19.Refresh
	echart20.Refresh
	echart21.Refresh
	echart22.Refresh
	echart23.Refresh
	echart24.Refresh
	echart26.Refresh
	echart27.Refresh
	echart28.Refresh
	echart29.Refresh
	echart30.Refresh
	echart31.Refresh
	echart32.Refresh
	echart33.Refresh
	echart34.Refresh
	
	
End Sub
	