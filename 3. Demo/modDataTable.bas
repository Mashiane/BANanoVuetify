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
	Private BANano As BANano  'ignore
	Private dt1 As VMDataTable
	Private dtUsers As VMDataTable
	Private dtImages As VMDataTable
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
	dt1 = vm.CreateDataTable("dt1", "name", Me)
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
	'dt1.SetColumnDisabled("calories", True)
	'
	dt1.SetShowSelect(True)
	'dt1.SetOnToggleSelectAll("dt1_selectall")
	'dt1.SetOnItemSelected("dt1_itemselected")
	dt1.SetOnInput("dt1_input")
	
	dt1.AddToContainer(cont, 1, 1)
	'
	Dim users As List = vm.NewList
	users.add(CreateMap("avatar": "./assets/1.jpg", "firstname":"Him", "lastname":"One", "active":True, "rating":5, "tasks":9))
	users.add(CreateMap("avatar": "./assets/2.jpg", "firstname":"Him 2", "lastname":"One", "active":False, "rating":4, "tasks": 8))
	users.add(CreateMap("avatar": "./assets/3.jpg", "firstname":"Her ", "lastname":"One", "active":True, "rating":3, "tasks": 5))
	users.add(CreateMap("avatar": "./assets/4.jpg", "firstname":"Her 1", "lastname":"One", "active":True, "rating":2, "tasks": 3))
	users.add(CreateMap("avatar": "./assets/5.jpg", "firstname":"Her 2", "lastname":"One", "active":False, "rating":1, "tasks": 1))
	
	dtUsers = vm.CreateDataTable("dtUsers", "firstname", Me)
	dtUsers.SetTitle("Users")
	dtUsers.AddAvatarImg("avatar", "Profile")
	dtUsers.AddColumn("firstname", "First Name")
	dtUsers.AddColumn("lastname", "Last Name")
	dtUsers.AddSwitch("active", "Active")
	dtUsers.AddRating("rating", "Performance")
	'dtUsers.AddProgressCircular("tasks", "Completed")
	'dtUsers.SetProgressCircularDimensions("tasks", "green", "-90", "46", "6")
	dtUsers.AddProgressLinear("tasks", "Progress")
	dtUsers.SetProgressLinearDimensions("tasks", "orange", "25", True)
	
	dtUsers.AddEditThrash
	dtUsers.SetIconDimensions("edit", "32px", "success")
	dtUsers.SetIconDimensions("delete", "32p", "error")
	dtUsers.SetDataSource(users)
	dtUsers.AddToContainer(cont, 2, 1)
	'
	Dim images As List = vm.newlist
	images.add(CreateMap("image": "./assets/bird.jpg", "comment":"A bird seen from above", "lat":"16.0", "lng":"20.1"))
	images.add(CreateMap("image": "./assets/dark-beach.jpg", "comment":"Seen whilst walking", "lat":"36.0", "lng":"24.8"))
	images.add(CreateMap("image": "./assets/planet.jpg", "comment":"A need to visit planets", "lat":"1.0", "lng":"1.1"))
	images.add(CreateMap("image": "./assets/sky.jpg", "comment":"A beautiful skyline", "lat":"0", "lng":"0"))
	images.add(CreateMap("image": "./assets/squirrel.jpg", "comment":"Nutting around", "lat":"45", "lng":"30"))
	'
	dtImages = vm.CreateDataTable("dtImages", "image", Me)
	dtImages.SetTitle("Presentation")
	dtImages.AddImage("image", "Image")
	dtImages.SetImageDimensions("image", "80px", "80px")
	dtImages.AddColumn("comment", "Comment")
	dtImages.AddColumn("datetaken", "Date Taken")
	dtImages.AddColumn("lat", "Latitude")
	dtImages.AddColumn("lng", "Longitude")
	dtImages.SetDataSource(images)
	dtImages.AddToContainer(cont, 3, 1)
	
	'add container to page
	vm.AddContainer(cont)
	'
	vm.SetMethod(Me,"getcolor")
End Sub

Sub dtuserssave(e As BANanoEvent)

End Sub

Sub dtuserscancel(e As BANanoEvent)

End Sub

Sub dtusersopen(e As BANanoEvent)
	
End Sub

Sub dtusersclose(e As BANanoEvent)

End Sub

Sub dt1_input(items As List)
	Log("selected items")
	Dim selKeys As List = dt1.GetItemKeys(items)
	Log(selKeys)
	'join the items
	Log("String Join")
	Dim selItems As String = vm.JoinItems(",", "'", selKeys)
	Log(selItems)
	'normal join
	Log("Normal Join")
	Dim selNormal As String = vm.Join(",", selKeys)
	Log(selNormal)
End Sub

Sub dt1_itemselected(item As Map)
	Log("item selected")
	Log(item)
End Sub

Sub dt1_selectall(items As List)
	Log(items)
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

Sub dtusers_active(item As Map)
	vm.ShowSnackBar("Active: " & BANano.tojson(item))
End Sub

Sub dtusers_rating(item As Map)
	vm.ShowSnackBar("Rating: " & BANano.tojson(item))
End Sub

Sub dtusers_firstname(item As Map)
	vm.ShowSnackBar("FirstName: " & BANano.tojson(item))
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
