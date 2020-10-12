B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "gridSelectCode"
	Public title As String = "Grid Select"
	Private vm As BANanoVM
	Private vue As BANanoVue
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
	
	Dim p As VMLabel = vm.CreateLabel("gsx").SetText("Grid Select Items: {{ gs1selected }}")
	p.AddToContainer(cont, 1, 1)
	
	Dim gs As VMDataGridSelect
	gs.Initialize(vue, "gs1", Me)
	gs.SetLabel("Select Foods")
	gs.SetChips(True)
	'gs.SetDense(True)
	gs.SetMultiple(True)
	gs.SetClearable(True)
	gs.SetDeletableChips(True)
	'gs.SetOutlined(True)
	gs.SetCaption("Foods to choose from")
	gs.SetHideDetails(True)
	gs.SetSolo(True)
	'
	'add columns to grid select
	gs.AddColumn("name", "Dessert (100g serving)")
	gs.AddColumn("calories", "Calories")
	gs.AddColumn("fat", "Fat (g)")
	gs.AddColumn("carbs", "Carbs (g)")
	gs.AddColumn("protein", "Protein (g)")
	gs.AddColumn("iron", "Iron (%)")
	'
	'add data
	Dim items As List = vue.NewList
	items.add(CreateMap("name": "Frozen Yogurt", "calories": 159, "fat": 6.0, "carbs": 24, "protein": 4.0, "iron": "1%"))
	items.add(CreateMap("name": "Ice cream sandwich", "calories": 237, "fat": 9.0, "carbs": 37, "protein": 4.3, "iron": "1%"))
	items.add(CreateMap("name": "Eclair", "calories": 262, "fat": 16.0, "carbs": 23, "protein": 6.0, "iron": "7%"))
	items.add(CreateMap("name": "Cupcake", "calories": 305, "fat": 3.7, "carbs": 67, "protein": 4.3, "iron": "8%"))
	items.add(CreateMap("name": "Gingerbread", "calories": 356, "fat": 16.0, "carbs": 49, "protein": 3.9, "iron": "16%"))
	items.add(CreateMap("name": "Jelly bean", "calories": 375, "fat": 0.0, "carbs": 94, "protein": 0.0, "iron": "0%"))
	'
	gs.SetDataSource(items, "name", "name")
	
	gs.AddToContainer(cont, 2, 1)
	
	'add container to page
	vm.AddContainer(cont)
End Sub
