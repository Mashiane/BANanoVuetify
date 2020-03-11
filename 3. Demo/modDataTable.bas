B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public name As String = "dataTableCode"
	Public title As String = "Data Table"
	Private vm As BANanoVM
	Private BANano As BANano
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(5).AddColumns12
	'
	Dim recs As List = vm.Json2List($"[
    {
        "name": "Frozen Yogurt",
        "calories": 159,
        "fat": 6,
        "carbs": 24,
        "protein": 4,
        "iron": "1%",
        "glutenfree": true
    },
    {
        "name": "Ice cream sandwich",
        "calories": 237,
        "fat": 9,
        "carbs": 37,
        "protein": 4.3,
        "iron": "1%",
        "glutenfree": false
    },
    {
        "name": "Eclair",
        "calories": 262,
        "fat": 16,
        "carbs": 23,
        "protein": 6,
        "iron": "7%",
        "glutenfree": false
    },
    {
        "name": "Jelly bean",
        "calories": 375,
        "fat": 0,
        "carbs": 94,
        "protein": 0,
        "iron": "0%",
        "glutenfree": true
    },
    {
        "name": "Lollipop",
        "calories": 392,
        "fat": 0.2,
        "carbs": 98,
        "protein": 0,
        "iron": "2%",
        "glutenfree": true
    },
    {
        "name": "KitKat",
        "calories": 518,
        "fat": 26,
        "carbs": 65,
        "protein": 7,
        "iron": "6%",
        "glutenfree": false
    }
]"$)
	Dim dt1 As VMDataTable = vm.CreateDataTable("dt1", "name", Me)
	dt1.SetTitle("Food Intake")
	dt1.AddSearch
	dt1.AddNew("btnNew", "mdi-plus", "Add a new record")
	dt1.SetDataSource(recs)
	dt1.AddColumn1("name", "Desset (100g serving)", dt1.COLUMN_TEXT, 0, False, dt1.ALIGN_LEFT)
	dt1.AddColumns(CreateMap("calories": "Calories", "fat": "Fat (g)", "carbs": "Carbs (g)", "protein": "Protein (g)", "iron": "Iron (%)"))
	dt1.AddColumn("glutenfree", "Gluten-Free")
	dt1.AddEditThrash
	dt1.AddDownload
	dt1.AddMenuV
	dt1.AddClone
	dt1.AddPrint
	
	dt1.SetColumnType("glutenfree", dt1.COLUMN_CHECKBOX)
	dt1.SetColumnType("calories", dt1.COLUMN_CHIP)
	dt1.SetColumnExtra("calories", $":color="getcolor(item.calories)""$)
	'
	dt1.AddToContainer(cont, 1, 1)
	
	'add container to page
	vm.AddContainer(cont)
	'
	vm.SetMethod(Me,"getcolor")
End Sub

Sub dt1_edit(item As Map)
	vm.ShowSnackBar("Edit: " & BANano.tojson(item))
End Sub

Sub dt1_delete(item As Map)
	vm.ShowSnackBar("Delete: " & BANano.tojson(item))
End Sub

Sub dt1_download(item As Map)
	vm.ShowSnackBar("Download: " & BANano.tojson(item))
End Sub

Sub dt1_menu(item As Map)
	vm.ShowSnackBar("Menu: " & BANano.tojson(item))
End Sub

Sub dt1_clone(item As Map)
	vm.ShowSnackBar("Clone: " & BANano.tojson(item))
End Sub

Sub dt1_print(item As Map)
	vm.ShowSnackBar("Print: " & BANano.tojson(item))
End Sub



Sub btnNew_click(e As BANanoEvent)
	vm.ShowSnackBar("Add record!")
End Sub

Sub getcolor(calories As Int) As String
	If calories > 400 Then 
		Return "red"
	else if calories > 200 Then
		Return "orange"
	Else 
		Return "green"
	End If
End Sub
