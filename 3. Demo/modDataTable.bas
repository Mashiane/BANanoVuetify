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
	Private vue As BANanoVue
	Private dtButtons As VMDataTable
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
	'
	Dim recs As List = vm.Json2List($"[
    {
        "name": "Frozen Yogurt",
        "calories": 159,
        "fat": 6,
        "carbs": 24,
        "protein": 4,
        "iron": "1%",
        "glutenfree": "Yes"
    },
    {
        "name": "Ice cream sandwich",
        "calories": 237,
        "fat": 9,
        "carbs": 37,
        "protein": 4.3,
        "iron": "1%",
        "glutenfree": "No"
    },
    {
        "name": "Eclair",
        "calories": 262,
        "fat": 16,
        "carbs": 23,
        "protein": 6,
        "iron": "7%",
        "glutenfree": "No"
    },
    {
        "name": "Jelly bean",
        "calories": 375,
        "fat": 0,
        "carbs": 94,
        "protein": 0,
        "iron": "0%",
        "glutenfree": "Yes"
    },
    {
        "name": "Lollipop",
        "calories": 392,
        "fat": 0.2,
        "carbs": 98,
        "protein": 0,
        "iron": "2%",
        "glutenfree": "Yes"
    },
    {
        "name": "KitKat",
        "calories": 518,
        "fat": 26,
        "carbs": 65,
        "protein": 7,
        "iron": "6%",
        "glutenfree": "False"
    }
]"$)
	dt1 = vm.CreateDataTable("dt1", "name", Me)
	dt1.SetTitle("Food Intake")
	dt1.AddSearch
	dt1.AddDivider
	dt1.AddNew("btnNew", "mdi-plus", "Add a new record")
	dt1.AddDivider
	dt1.AddDeleteAll("btnDeleteAll", "mdi-delete", "Delete all records")
	dt1.SetDataSource(recs)
	dt1.AddColumn1("name", "Desset (100g serving)", dt1.COLUMN_TEXT, 0, False, dt1.ALIGN_LEFT)
	dt1.AddColumns(CreateMap("calories": "Calories", "fat": "Fat (g)", "carbs": "Carbs (g)", "protein": "Protein (g)", "iron": "Iron (%)"))
	dt1.AddColumn("glutenfree", "Gluten-Free")
	dt1.AddEditThrash
	dt1.AddDownload
	dt1.AddMenuV
	dt1.AddClone
	dt1.AddPrint
	dt1.SetItemKey("name")
	dt1.SetColumnTotal("calories", "sumfield('calories')")
	'register the method
	vue.SetMethod(Me, "sumfield")
	
	dt1.SetColumnType("glutenfree", dt1.COLUMN_CHECKBOX)
	dt1.SetColumnType("calories", dt1.COLUMN_CHIP)
	dt1.SetColumnExtra("calories", $":color="getcolor(item.calories)""$)
	'dt1.SetColumnDisabled("calories", True)
	'
	dt1.SetShowSelect(True)
	'dt1.SetOnToggleSelectAll("dt1_selectall")
	'dt1.SetOnItemSelected("dt1_itemselected")
	dt1.SetOnInput("dt1_input")
	'add an external pagination
	dt1.SetExternalPagination
	dt1.AddDivider
	dt1.SetClearSort
	dt1.AddDivider
	dt1.SetColumnChooser(True)
	dt1.AddToContainer(cont, 1, 1)
	'
	Dim lblSel As VMLabel = vm.CreateLabel("lblSelected").SetParagraph.SetText("Selected: {{ dt1selected }}").AddClass("ma-2")
	lblSel.AddToContainer(cont, 1,1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim recs As List = vm.Json2List($"["$)
vue.AddCode($"{"$)
vue.AddCode($""name": "Frozen Yogurt","$)
vue.AddCode($""calories": 159,"$)
vue.AddCode($""fat": 6,"$)
vue.AddCode($""carbs": 24,"$)
vue.AddCode($""protein": 4,"$)
vue.AddCode($""iron": "1%","$)
vue.AddCode($""glutenfree": "Yes""$)
vue.AddCode($"},"$)
vue.AddCode($"{"$)
vue.AddCode($""name": "Ice cream sandwich","$)
vue.AddCode($""calories": 237,"$)
vue.AddCode($""fat": 9,"$)
vue.AddCode($""carbs": 37,"$)
vue.AddCode($""protein": 4.3,"$)
vue.AddCode($""iron": "1%","$)
vue.AddCode($""glutenfree": "No""$)
vue.AddCode($"},"$)
vue.AddCode($"{"$)
vue.AddCode($""name": "Eclair","$)
vue.AddCode($""calories": 262,"$)
vue.AddCode($""fat": 16,"$)
vue.AddCode($""carbs": 23,"$)
vue.AddCode($""protein": 6,"$)
vue.AddCode($""iron": "7%","$)
vue.AddCode($""glutenfree": "No""$)
vue.AddCode($"},"$)
vue.AddCode($"{"$)
vue.AddCode($""name": "Jelly bean","$)
vue.AddCode($""calories": 375,"$)
vue.AddCode($""fat": 0,"$)
vue.AddCode($""carbs": 94,"$)
vue.AddCode($""protein": 0,"$)
vue.AddCode($""iron": "0%","$)
vue.AddCode($""glutenfree": "Yes""$)
vue.AddCode($"},"$)
vue.AddCode($"{"$)
vue.AddCode($""name": "Lollipop","$)
vue.AddCode($""calories": 392,"$)
vue.AddCode($""fat": 0.2,"$)
vue.AddCode($""carbs": 98,"$)
vue.AddCode($""protein": 0,"$)
vue.AddCode($""iron": "2%","$)
vue.AddCode($""glutenfree": "Yes""$)
vue.AddCode($"},"$)
vue.AddCode($"{"$)
vue.AddCode($""name": "KitKat","$)
vue.AddCode($""calories": 518,"$)
vue.AddCode($""fat": 26,"$)
vue.AddCode($""carbs": 65,"$)
vue.AddCode($""protein": 7,"$)
vue.AddCode($""iron": "6%","$)
vue.AddCode($""glutenfree": "False""$)
vue.AddCode($"}"$)
vue.AddCode($"]"~)"$)
pgIndex.CreateVBCode(vue, Me, "datDataCode", "Define DataTable Data - JSON Arrray", vue.GetSourceCode).AddToContainer(cont, 2, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"dt1 = vm.CreateDataTable("dt1", "name", Me)"$)
vue.AddCode($"dt1.SetTitle("Food Intake")"$)
vue.AddCode($"dt1.AddSearch"$)
vue.AddCode($"dt1.AddDivider"$)
vue.AddCode($"dt1.AddNew("btnNew", "mdi-plus", "Add a new record")"$)
vue.AddCode($"dt1.SetDataSource(recs)"$)
vue.AddCode($"dt1.AddColumn1("name", "Desset (100g serving)", dt1.COLUMN_TEXT, 0, False, dt1.ALIGN_LEFT)"$)
vue.AddCode($"dt1.AddColumns(CreateMap("calories": "Calories", "fat": "Fat (g)", "carbs": "Carbs (g)", "protein": "Protein (g)", "iron": "Iron (%)"))"$)
vue.AddCode($"dt1.AddColumn("glutenfree", "Gluten-Free")"$)
vue.AddCode($"dt1.AddEditThrash"$)
vue.AddCode($"dt1.AddDownload"$)
vue.AddCode($"dt1.AddMenuV"$)
vue.AddCode($"dt1.AddClone"$)
vue.AddCode($"dt1.AddPrint"$)
vue.AddCode($"dt1.SetItemKey("name")"$)
vue.AddCode($"dt1.SetColumnTotal("calories", "sumfield('calories')")"$)
vue.AddCode($"'register the method"$)
vue.AddCode($"vue.SetMethod(Me, "sumfield")"$)
vue.AddCode($""$)
vue.AddCode($"dt1.SetColumnType("glutenfree", dt1.COLUMN_CHECKBOX)"$)
vue.AddCode($"dt1.SetColumnType("calories", dt1.COLUMN_CHIP)"$)
vue.AddCode($"dt1.SetColumnExtra("calories", ~":color="getcolor(item.calories)""~)"$)
vue.AddCode($"'dt1.SetColumnDisabled("calories", True)"$)
vue.AddCode($"'"$)
vue.AddCode($"dt1.SetShowSelect(True)"$)
vue.AddCode($"'dt1.SetOnToggleSelectAll("dt1_selectall")"$)
vue.AddCode($"'dt1.SetOnItemSelected("dt1_itemselected")"$)
vue.AddCode($"dt1.SetOnInput("dt1_input")"$)
vue.AddCode($"'add an external pagination"$)
vue.AddCode($"dt1.SetExternalPagination"$)
vue.AddCode($"dt1.AddDivider"$)
vue.AddCode($"dt1.SetClearSort"$)
vue.AddCode($"dt1.AddDivider"$)
vue.AddCode($"dt1.SetColumnChooser(True)"$)
vue.AddCode($"dt1.AddToContainer(cont, 1, 1)"$)
pgIndex.CreateVBCode(vue, Me, "dt1code", "Data Table", vue.GetSourceCode).AddToContainer(cont, 2, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"vm.SetMethod(Me,"getcolor")"$)
vue.AddCode($""$)
vue.AddCode($"'sum any column passed"$)
vue.AddCode($"Sub sumfield(fld As String) As String"$)
vue.AddCode($"'get all the records"$)
vue.AddCode($"Dim totSum As Int = 0"$)
vue.AddCode($"Dim recs As List = dt1.GetData"$)
vue.AddCode($"For Each rec As Map In recs"$)
vue.AddCode($"Dim fldNum As String = rec.get(fld)"$)
vue.AddCode($"totSum = totSum + BANano.parseInt(fldNum)"$)
vue.AddCode($"Next"$)
vue.AddCode($"totSum = vue.makemoney(totSum)"$)
vue.AddCode($"Return totSum"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub dtuserssave(e As BANanoEvent)"$)
vue.AddCode($""$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dtuserscancel(e As BANanoEvent)"$)
vue.AddCode($""$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dtusersopen(e As BANanoEvent)"$)
vue.AddCode($""$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dtusersclose(e As BANanoEvent)"$)
vue.AddCode($""$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dt1_input(items As List)"$)
vue.AddCode($"Log("selected items")"$)
vue.AddCode($"Dim selKeys As List = dt1.GetItemKeys(items)"$)
vue.AddCode($"Log(selKeys)"$)
vue.AddCode($"'join the items"$)
vue.AddCode($"Log("String Join")"$)
vue.AddCode($"Dim selItems As String = vm.JoinItems(",", "'", selKeys)"$)
vue.AddCode($"Log(selItems)"$)
vue.AddCode($"'normal join"$)
vue.AddCode($"Log("Normal Join")"$)
vue.AddCode($"Dim selNormal As String = vm.Join(",", selKeys)"$)
vue.AddCode($"Log(selNormal)"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dt1_itemselected(item As Map)"$)
vue.AddCode($"Log("item selected")"$)
vue.AddCode($"Log(item)"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dt1_selectall(items As List)"$)
vue.AddCode($"Log(items)"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dt1_edit(item As Map)"$)
vue.AddCode($"vm.ShowSnackBar("Edit: " & BANano.tojson(item))"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dt1_delete(item As Map)"$)
vue.AddCode($"vm.ShowSnackBar("Delete: " & BANano.tojson(item))"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dt1_download(item As Map)"$)
vue.AddCode($"vm.ShowSnackBar("Download: " & BANano.tojson(item))"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dt1_menu(item As Map)"$)
vue.AddCode($"vm.ShowSnackBar("Menu: " & BANano.tojson(item))"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dt1_clone(item As Map)"$)
vue.AddCode($"vm.ShowSnackBar("Clone: " & BANano.tojson(item))"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dt1_print(item As Map)"$)
vue.AddCode($"vm.ShowSnackBar("Print: " & BANano.tojson(item))"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub getcolor(calories As Int) As String"$)
vue.AddCode($"If calories > 400 Then"$)
vue.AddCode($"Return "red""$)
vue.AddCode($"else if calories > 200 Then"$)
vue.AddCode($"Return "orange""$)
vue.AddCode($"Else"$)
vue.AddCode($"Return "green""$)
vue.AddCode($"End If"$)
vue.AddCode($"End Sub"$)
pgIndex.CreateVBCode(vue, Me, "dt1codex", "Data Table Methods", vue.GetSourceCode).AddToContainer(cont, 2, 1)

	
	
	'
	Dim users As List = vm.NewList
	users.add(CreateMap("avatar": "./assets/1.jpg", "firstname":"Him", "lastname":"One", "active":"Yes", "rating":5, "tasks":9))
	users.add(CreateMap("avatar": "./assets/2.jpg", "firstname":"Him 2", "lastname":"One", "active":"No", "rating":4, "tasks": 8))
	users.add(CreateMap("avatar": "./assets/3.jpg", "firstname":"Her ", "lastname":"One", "active":"Yes", "rating":3, "tasks": 5))
	users.add(CreateMap("avatar": "./assets/4.jpg", "firstname":"Her 1", "lastname":"One", "active":"Yes", "rating":2, "tasks": 3))
	users.add(CreateMap("avatar": "./assets/5.jpg", "firstname":"Her 2", "lastname":"One", "active":"No", "rating":1, "tasks": 1))
	
	dtUsers = vm.CreateDataTable("dtUsers", "firstname", Me)
	dtUsers.SetTitle("Users")
	dtUsers.AddAvatarImg("avatar", "Profile")
	dtUsers.AddColumn("firstname", "First Name")
	dtUsers.AddColumn("lastname", "Last Name")
	dtUsers.AddSwitch("active", "Active")
	dtUsers.AddRating("rating", "Performance")
	dtUsers.AddEditDialog("firstname",False)
	dtUsers.AddEditDialog("lastname",False)
	'dtUsers.AddProgressCircular("tasks", "Completed")
	'dtUsers.SetProgressCircularDimensions("tasks", "green", "-90", "46", "6")
	dtUsers.AddProgressLinear("tasks", "Progress")
	dtUsers.SetProgressLinearDimensions("tasks", "orange", "25", True)
	
	dtUsers.AddEditThrash
	dtUsers.SetIconDimensions("edit", "32px", "success")
	dtUsers.SetIconDimensions("delete", "32p", "error")
	dtUsers.SetDataSource(users)
	dtUsers.SetExternalPagination
	dtUsers.AddToContainer(cont, 3, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim users As List = vm.NewList"$)
vue.AddCode($"users.add(CreateMap("avatar": "./assets/1.jpg", "firstname":"Him", "lastname":"One", "active":"Yes", "rating":5, "tasks":9))"$)
vue.AddCode($"users.add(CreateMap("avatar": "./assets/2.jpg", "firstname":"Him 2", "lastname":"One", "active":"No", "rating":4, "tasks": 8))"$)
vue.AddCode($"users.add(CreateMap("avatar": "./assets/3.jpg", "firstname":"Her ", "lastname":"One", "active":"Yes", "rating":3, "tasks": 5))"$)
vue.AddCode($"users.add(CreateMap("avatar": "./assets/4.jpg", "firstname":"Her 1", "lastname":"One", "active":"Yes", "rating":2, "tasks": 3))"$)
vue.AddCode($"users.add(CreateMap("avatar": "./assets/5.jpg", "firstname":"Her 2", "lastname":"One", "active":"No", "rating":1, "tasks": 1))"$)
vue.AddCode($""$)
vue.AddCode($"dtUsers = vm.CreateDataTable("dtUsers", "firstname", Me)"$)
vue.AddCode($"dtUsers.SetTitle("Users")"$)
vue.AddCode($"dtUsers.AddAvatarImg("avatar", "Profile")"$)
vue.AddCode($"dtUsers.AddColumn("firstname", "First Name")"$)
vue.AddCode($"dtUsers.AddColumn("lastname", "Last Name")"$)
vue.AddCode($"dtUsers.AddSwitch("active", "Active")"$)
vue.AddCode($"dtUsers.AddRating("rating", "Performance")"$)
vue.AddCode($"dtUsers.AddEditDialog("firstname",False)"$)
vue.AddCode($"dtUsers.AddEditDialog("lastname",False)"$)
vue.AddCode($"'dtUsers.AddProgressCircular("tasks", "Completed")"$)
vue.AddCode($"'dtUsers.SetProgressCircularDimensions("tasks", "green", "-90", "46", "6")"$)
vue.AddCode($"dtUsers.AddProgressLinear("tasks", "Progress")"$)
vue.AddCode($"dtUsers.SetProgressLinearDimensions("tasks", "orange", "25", True)"$)
vue.AddCode($""$)
vue.AddCode($"dtUsers.AddEditThrash"$)
vue.AddCode($"dtUsers.SetIconDimensions("edit", "32px", "success")"$)
vue.AddCode($"dtUsers.SetIconDimensions("delete", "32p", "error")"$)
vue.AddCode($"dtUsers.SetDataSource(users)"$)
vue.AddCode($"dtUsers.SetExternalPagination"$)
vue.AddCode($"dtUsers.AddToContainer(cont, 3, 1)"$)
pgIndex.CreateVBCode(vue, Me, "usrdtcode", "Users Data Table", vue.GetSourceCode).AddToContainer(cont, 3, 1)

	'https://day.js.org/docs/en/display/format
	'http://numeraljs.com/
	'
	Dim images As List = vm.newlist
	images.add(CreateMap("image": "./assets/bird.jpg", "sendto":"mashy@gmail.com", "comment":"A bird seen from above", "lat":"16.0", "lng":"20.1", "datetaken":"1973-04-15"))
	images.add(CreateMap("image": "./assets/dark-beach.jpg", "sendto":"ozzie@gmail.com", "comment":"Seen whilst walking", "lat":"36.0", "lng":"24.8", "datetaken":"2003-02-27"))
	images.add(CreateMap("image": "./assets/planet.jpg", "sendto":"orio@gmail.com", "comment":"A need to visit planets", "lat":"1.0", "lng":"1.1", "datetaken":"2009-04-01"))
	images.add(CreateMap("image": "./assets/sky.jpg", "sendto":"ernesto@gmail.com", "comment":"A beautiful skyline", "lat":"0", "lng":"0", "datetaken":"2010-04-24"))
	images.add(CreateMap("image": "./assets/squirrel.jpg", "sendto":"tgifzone.inc@gmail.com", "comment":"Nutting around", "lat":"45", "lng":"30", "datetaken":"2010-09-02"))
	'
	dtImages = vm.CreateDataTable("dtImages", "image", Me)
	dtImages.SetTitle("Presentation")
	dtImages.AddImage("image", "Image")
	dtImages.SetImageDimensions("image", "80px", "80px")
	dtImages.AddLink("sendto", "Email To", "_blank")
	dtImages.SetColumnPrefix("sendto", "mailto:")
	dtImages.AddColumn("comment", "Comment")
	dtImages.AddColumn("datetaken", "Date Taken")
	dtImages.SetColumnType("datetaken", dtImages.COLUMN_DATE)
	dtImages.SetColumnDateFormat("datetaken", "ddd, DD MMM YYYY")
	dtImages.AddColumn("lat", "Latitude")
	dtImages.AddColumn("lng", "Longitude")
	dtImages.SetColumnNumberFormat("lat", "0.00")
	dtImages.SetColumnNumberFormat("lng", "0.00")
	dtImages.SetDataSource(images)
	dtImages.SetExternalPagination
	dtImages.AddToContainer(cont, 4, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim images As List = vm.newlist"$)
	vue.AddCode($"images.add(CreateMap("image": "./assets/bird.jpg", "comment":"A bird seen from above", "lat":"16.0", "lng":"20.1", "datetaken":"1973-04-15"))"$)
	vue.AddCode($"images.add(CreateMap("image": "./assets/dark-beach.jpg", "comment":"Seen whilst walking", "lat":"36.0", "lng":"24.8", "datetaken":"2003-02-27"))"$)
	vue.AddCode($"images.add(CreateMap("image": "./assets/planet.jpg", "comment":"A need to visit planets", "lat":"1.0", "lng":"1.1", "datetaken":"2009-04-01"))"$)
	vue.AddCode($"images.add(CreateMap("image": "./assets/sky.jpg", "comment":"A beautiful skyline", "lat":"0", "lng":"0", "datetaken":"2010-04-24"))"$)
	vue.AddCode($"images.add(CreateMap("image": "./assets/squirrel.jpg", "comment":"Nutting around", "lat":"45", "lng":"30", "datetaken":"2010-09-02"))"$)
vue.AddCode($"'"$)
vue.AddCode($"dtImages = vm.CreateDataTable("dtImages", "image", Me)"$)
vue.AddCode($"dtImages.SetTitle("Presentation")"$)
vue.AddCode($"dtImages.AddImage("image", "Image")"$)
vue.AddCode($"dtImages.SetImageDimensions("image", "80px", "80px")"$)
vue.AddCode($"dtImages.AddColumn("comment", "Comment")"$)
vue.AddCode($"dtImages.AddColumn("datetaken", "Date Taken")"$)
vue.AddCode($"dtImages.SetColumnType("datetaken", dtImages.COLUMN_DATE)"$)
vue.AddCode($"dtImages.SetColumnDateFormat("datetaken", "ddd, DD MMM YYYY")"$)
vue.AddCode($"dtImages.AddColumn("lat", "Latitude")"$)
vue.AddCode($"dtImages.AddColumn("lng", "Longitude")"$)
vue.AddCode($"dtImages.SetColumnNumberFormat("lat", "0.00")"$)
vue.AddCode($"dtImages.SetColumnNumberFormat("lng", "0.00")"$)
vue.AddCode($"dtImages.SetDataSource(images)"$)
vue.AddCode($"dtImages.SetExternalPagination"$)
vue.AddCode($"dtImages.AddToContainer(cont, 4, 1)"$)
vue.AddCode($""$)
	pgIndex.CreateVBCode(vue, Me, "imgdtcode", "Images Data Table", vue.GetSourceCode).AddToContainer(cont, 4, 1)
	'
	'buttons on columns
	dtButtons = vm.CreateDataTable("dtButtons", "name", Me)
	dtButtons.SetTitle("Button Variants")
	dtButtons.AddColumn("name", "Name")
	dtButtons.AddColumn("calories", "Calories")
	'
	dtButtons.AddButtonColumn("btnwarn", "Warning").SetButtonWarning("btnwarn")
	dtButtons.AddButtonColumn("btnerror", "Errors").SetButtonError("btnerror")
	dtButtons.AddButtonColumn("btnsuccess", "Success").SetButtonSuccess("btnsuccess")
	dtButtons.AddButtonColumn("btnsecondary", "Secondary").SetButtonSecondary("btnsecondary")
	dtButtons.AddButtonColumn("btnprimary", "Primary").SetButtonPrimary("btnprimary")
	dtButtons.AddButtonColumn("btnrounded", "Rounded").SetButtonRounded("btnrounded").SetButtonPrimary("btnrounded")
	dtButtons.AddButtonColumn("btnoutlined", "Outlined").SetButtonOutlined("btnoutlined").SetButtonPrimary("btnoutlined")
	'
	dtButtons.AddRow(CreateMap("name": "Frozen Yogurt", "calories": 159))
	dtButtons.AddRow(CreateMap("name": "Ice cream sandwich", "calories": 237))
	dtButtons.AddRow(CreateMap("name": "Eclair", "calories": 262))
	dtButtons.AddRow(CreateMap("name": "Cupcake", "calories": 305))
	dtButtons.AddRow(CreateMap("name": "Gingerbread", "calories": 356))
	dtButtons.AddRow(CreateMap("name": "Jelly bean", "calories": 375))
	dtButtons.AddRow(CreateMap("name": "Lollipop", "calories": 392))
	dtButtons.AddRow(CreateMap("name": "Honeycomb", "calories": 408))
	dtButtons.AddRow(CreateMap("name": "Donut", "calories": 452))
	dtButtons.AddRow(CreateMap("name": "KitKat", "calories": 518))
	dtButtons.AddToContainer(cont, 5, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'buttons on columns"$)
vue.AddCode($"dtButtons = vm.CreateDataTable("dtButtons", "name", Me)"$)
vue.AddCode($"dtButtons.SetTitle("Button Variants")"$)
vue.AddCode($"dtButtons.AddColumn("name", "Name")"$)
vue.AddCode($"dtButtons.AddColumn("calories", "Calories")"$)
vue.AddCode($"'"$)
vue.AddCode($"dtButtons.AddButtonColumn("btnwarn", "Warning").SetButtonWarning("btnwarn")"$)
vue.AddCode($"dtButtons.AddButtonColumn("btnerror", "Errors").SetButtonError("btnerror")"$)
vue.AddCode($"dtButtons.AddButtonColumn("btnsuccess", "Success").SetButtonSuccess("btnsuccess")"$)
vue.AddCode($"dtButtons.AddButtonColumn("btnsecondary", "Secondary").SetButtonSecondary("btnsecondary")"$)
vue.AddCode($"dtButtons.AddButtonColumn("btnprimary", "Primary").SetButtonPrimary("btnprimary")"$)
vue.AddCode($"dtButtons.AddButtonColumn("btnrounded", "Rounded").SetButtonRounded("btnrounded")"$)
vue.AddCode($"dtButtons.AddButtonColumn("btnoutlined", "Outlined").SetButtonOutlined("btnoutlined").SetButtonPrimary("btnoutlined")"$)
vue.AddCode($"'"$)
vue.AddCode($"dtButtons.AddRow(CreateMap("name": "Frozen Yogurt", "calories": 159))"$)
vue.AddCode($"dtButtons.AddRow(CreateMap("name": "Ice cream sandwich", "calories": 237))"$)
vue.AddCode($"dtButtons.AddRow(CreateMap("name": "Eclair", "calories": 262))"$)
vue.AddCode($"dtButtons.AddRow(CreateMap("name": "Cupcake", "calories": 305))"$)
vue.AddCode($"dtButtons.AddRow(CreateMap("name": "Gingerbread", "calories": 356))"$)
vue.AddCode($"dtButtons.AddRow(CreateMap("name": "Jelly bean", "calories": 375))"$)
vue.AddCode($"dtButtons.AddRow(CreateMap("name": "Lollipop", "calories": 392))"$)
vue.AddCode($"dtButtons.AddRow(CreateMap("name": "Honeycomb", "calories": 408))"$)
vue.AddCode($"dtButtons.AddRow(CreateMap("name": "Donut", "calories": 452))"$)
vue.AddCode($"dtButtons.AddRow(CreateMap("name": "KitKat", "calories": 518))"$)
vue.AddCode($"dtButtons.AddToContainer(cont, 5, 1)"$)
pgIndex.CreateVBCode(vue, Me, "tablebuttons", "Button Variants", vue.GetSourceCode).AddToContainer(cont, 6, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Sub dtButtons_btnoutlined(item As Map)"$)
vue.AddCode($"vm.ShowSnackBarPrimary("Outlined...")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub dtButtons_btnrounded(item As Map)"$)
vue.AddCode($"vm.ShowSnackBarPrimary("Rounded...")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub dtButtons_btnprimary(item As Map)"$)
vue.AddCode($"vm.ShowSnackBarPrimary("Primary...")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub dtButtons_btnsecondary(item As Map)"$)
vue.AddCode($"vm.ShowSnackBarSecondary("Secondary...")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub dtButtons_btnsuccess(item As Map)"$)
vue.AddCode($"vm.ShowSnackBarSuccess("Success...")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub dtButtons_btnwarn(item As Map)"$)
vue.AddCode($"vm.ShowSnackBarWarning("Warning...")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub dtButtons_btnerror(item As Map)"$)
vue.AddCode($"vm.ShowSnackBarError("Error...")"$)
vue.AddCode($"End Sub"$)
pgIndex.CreateVBCode(vue, Me, "buttoneve", "Button Events", vue.GetSourceCode).AddToContainer(cont, 7, 1)

	
	'add container to page
	vm.AddContainer(cont)
	'
	vm.SetMethod(Me,"getcolor")
End Sub



Sub dtButtons_btnshaped(item As Map)
	vm.ShowSnackBarPrimary("Shaped...")
End Sub


Sub buttonevecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("buttoneve")
End Sub

Sub buttonevedownload_click(e As BANanoEvent)
	vue.DownloadCode("buttoneve", "buttoneve.txt")
End Sub



Sub tablebuttonscopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("tablebuttons")
End Sub

Sub tablebuttonsdownload_click(e As BANanoEvent)
	vue.DownloadCode("tablebuttons", "tablebuttons.txt")
End Sub


Sub dtButtons_btnoutlined(item As Map)
	vm.ShowSnackBarPrimary("Outlined...")
End Sub


Sub dtButtons_btnrounded(item As Map)
	vm.ShowSnackBarPrimary("Rounded...")
End Sub


Sub dtButtons_btnprimary(item As Map)
	vm.ShowSnackBarPrimary("Primary...")
End Sub


Sub dtButtons_btnsecondary(item As Map)
	vm.ShowSnackBarSecondary("Secondary...")
End Sub


Sub dtButtons_btnsuccess(item As Map)
	vm.ShowSnackBarSuccess("Success...")
End Sub


Sub dtButtons_btnwarn(item As Map)
	vm.ShowSnackBarWarning("Warning...")
End Sub

Sub dtButtons_btnerror(item As Map)
	vm.ShowSnackBarError("Error...")
End Sub

Sub btnDeleteAll_click(e As BANanoEvent)
	vm.ShowSnackBarSuccess("Delete all!")
End Sub

Sub imgdtcodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("imgdtcode")
End Sub

Sub imgdtcodedownload_click(e As BANanoEvent)
	vue.DownloadCode("imgdtcode", "imgdtcode.txt")
End Sub

Sub usrdtcodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("usrdtcode")
End Sub

Sub usrdtcodedownload_click(e As BANanoEvent)
	vue.DownloadCode("usrdtcode", "usrdtcode.txt")
End Sub


Sub dt1codexcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("dt1codex")
End Sub

Sub dt1codexdownload_click(e As BANanoEvent)
	vue.DownloadCode("dt1codex", "dt1codex.txt")
End Sub




Sub dt1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("dt1code")
End Sub

Sub dt1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("dt1code", "dt1code.txt")
End Sub


Sub datDataCodecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("datDataCode")
End Sub

Sub datDataCodedownload_click(e As BANanoEvent)
	vue.DownloadCode("datDataCode", "datDataCode.txt")
End Sub



'sum any column passed
Sub sumfield(fld As String) As String
	'get all the records
	Dim totSum As Int = 0
	Dim recs As List = dt1.GetData
	For Each rec As Map In recs
		Dim fldNum As String = rec.get(fld)
		totSum = totSum + BANano.parseInt(fldNum)
	Next
	totSum = vue.makemoney(totSum)
	Return totSum
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
