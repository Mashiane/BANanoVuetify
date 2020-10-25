B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "dynamicCode"
	Public title As String = "Dynamic Input Components"
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private dynaR1 As VMFormBase
	Private BANano As BANano
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	cont.AddRows(2).AddColumns12
	'hide this container
	cont.Hide
	'
	Dim btnContent As VMButton = vm.CreateButton("btnContent", Me)
	btnContent.SetLabel("Get Content")
	btnContent.SetOnClick("btnContent_click")
	cont.AddComponent(1,1, btnContent.ToString)
	' 
	'createthe form base
	dynaR1.Initialize(Me, vue, "dynaR1")
	
	'add form base to container
	dynaR1.AddToContainer(cont, 2, 1)
	
	'add container to page
	vm.AddContainer(cont)
End Sub

Sub btnContent_click(e As BANanoEvent)
	Dim modex As Map = dynaR1.GetData
	Log(modex)
End Sub

'build form at runtime
Sub BuildDynamicForm
	'
	BuildR1
End Sub

Sub dynaR1_change(val As Object)
	Dim ev As EventValue = dynaR1.GetEvent(val)
	Select Case ev.key
	Case "days"
		'click the select control change
		vm.ShowSnackBarSuccess(ev.value)
	Case "agree"
		'checkbox changed
		Dim didAgree As Object = ev.value
		If BANano.isnull(didAgree) Or BANano.IsUndefined(didAgree) Then
			vm.ShowSnackBarError("You need to agree!")
		End If
	Case "autoc", "cbo1"
		'if autocomplete changes, if combobox changes
		Dim svalue As String = BANano.ToJson(ev.value)
		vm.ShowSnackBarWarning(svalue)	
	End Select
End Sub

Sub dynaR1_click(val As Object)
	Dim ev As EventValue = dynaR1.GetEvent(val)
	Select Case ev.key
	Case "btnadd"
		vm.ShowSnackBarSuccess("Add has been clicked!")
	Case "btnremove"
		vm.ShowSnackBarSuccess("Remove has been clicked!")
	Case "icon1"
		vm.ShowSnackBarSuccess("Red printer selected!")
	Case "password1"
		'we have clicked the append button of password1, toggle the password
		If ev.paramstag = "append" Then dynaR1.TogglePassword(ev.objschema)
	End Select
End Sub

Sub BuildR1
	dynaR1.clear
	'disable gutters
	dynaR1.SetRowNoGutters(False)
	'we have 6 spans per row
	dynaR1.setCols("6")
	
	dynaR1.AddButton("btnAdd", "Add").SetColor("green").SetDark.SetIconLeft("mdi-plus")
	dynaR1.AddButton("btnRemove", "Remove").SetColor("red").SetDark.SetIconRight("mdi-delete")
	'
	dynaR1.AddSheet("divider2", "MULTIPLE ITEMS")
	dynaR1.SetColor("white--text green lighten-2")
	dynaR1.SetCol(12)
	'
	dynaR1.AddTextField("firstname", "First Name")
	dynaR1.AddTextField("position", "Position")
	
'	dynaR1.AddArray("tasks", "idx").SetCol(12)
'	dynaR1.AddItem("tasks", "done", "Done", dynaR1.TCheckbox, 3)
'	dynaR1.AddItem("tasks", "title", "Title", dynaR1.TText, 9)
'	dynaR1.AddItemData("tasks", CreateMap("idx":0, "done": True, "title": "make refactoring"))
'	dynaR1.AddItemData("tasks", CreateMap("idx":1, "done": True, "title": "write documentation"))
'	dynaR1.AddItemData("tasks", CreateMap("idx":2, "done": True, "title": "remove logs"))
'	
	'
'	dynaR1.AddGroup("group1", "id")
'	dynaR1.AddItem("group1", "done", "Done", dynaR1.TCheckbox, 3)
'	dynaR1.AddItem("group1", "title", "Title", dynaR1.TText, 9)
'	dynaR1.AddItemData("group1", CreateMap("idx":0, "done": True, "title": "make refactoring"))
'	dynaR1.AddItemData("group1", CreateMap("idx":1, "done": True, "title": "write documentation"))
'	dynaR1.AddItemData("group1", CreateMap("idx":2, "done": True, "title": "remove logs"))
	'
	dynaR1.AddTextField("name1", "Name").SetValue("Jumo")
	dynaR1.AddPassword("password1", "Password").SetValue("12345").SetHint("6 to 8 characters")
	'
	dynaR1.AddEmail("email1", "Email").SetValue("base@gmail.com")
	dynaR1.AddCheckBox("agree", "I agree").SetValue(True)
	'
	dynaR1.AddSelect("days", "Days").SetCacheItems(True)
	dynaR1.AddItem(1, "Tesla")
	dynaR1.AddItem(2, "Jobs")
	dynaR1.AddItem(3, "Taleb")
	dynaR1.RefreshItems
	dynaR1.SetValue(2)
	
	dynaR1.AddIcon("icon1", "mdi-printer").SetColor("red")
	dynaR1.SetTooltip("Icon Label", "left", "green")
	
		
	dynaR1.AddSheet("divider1", "CREATING DYNAMIC CONTROLS")
	dynaR1.SetColor("white--text blue lighten-2")
	dynaR1.SetCol(12)
'	'

	dynaR1.AddComboBox("cbo1", "Combo Box").SetCacheItems(True)
	dynaR1.AddItem(1, "Tesla")
	dynaR1.AddItem(2, "Jobs")
	dynaR1.AddItem(3, "Taleb")
	dynaR1.RefreshItems
	dynaR1.SetValue(1)
	
	dynaR1.AddAutoComplete("autoc", "Auto Complete").SetCacheItems(True).SetSearchInput(Null)
	dynaR1.SetReturnObject(True)
	dynaR1.AddItem(1, "Tesla")
	dynaR1.AddItem(2, "Jobs")
	dynaR1.AddItem(3, "Taleb")
	dynaR1.RefreshItems
	dynaR1.SetValue(3)
		
	dynaR1.AddTextField("creditcard", "Credit Card").setPrependInnerIcon("mdi-credit-card").setMask("####-####-####-####").setHint("####-####-####-####")
	dynaR1.AddFileInput("file", "Images", False, False, "image/*")
'	'
	dynaR1.AddNumber("count", "Number")
	dynaR1.SetToolTip("My number", "left", "orange")
	dynaR1.AddColor("color", "My Color").SetValue("#D22A4D").SetPrependIcon("mdi-palette")
'	'
	dynaR1.AddDate("date", "Meeting Date").SetLocale("en").SetPrependIcon("mdi-calendar")
	dynaR1.AddTime("time", "Meeting Time").SetPrependIcon("mdi-timer")
'	'
	dynaR1.AddSelect("countries", "Countries")
	dynaR1.AddSelect("states", "States").SetMultiple
'	
	dynaR1.AddTextArea("comment", "Comment", False)
	dynaR1.AddCheckBox("done", "This is done").SetColor("red")
'	'
	dynaR1.AddSlider("slide", "My Slider")
	dynaR1.AddSwitch("onoff", "On / Off")
'	'
	dynaR1.AddRadio("radiox", "Some Options").SetRow
	dynaR1.AddItem(1, "Tesla")
	dynaR1.AddItem(2, "Jobs")
	dynaR1.AddItem(3, "Taleb")
	dynaR1.RefreshItems
	dynaR1.SetValue(2)
	

	dynaR1.AddImage("image1","","").SetBase("https://picsum.photos/512/300?random").SetClass("ma-2")
	dynaR1.AddImage("image2","https://picsum.photos/512/300?random","").SetClass("ma-2")
'	dynaR1.AddImage("image3","https://picsum.photos/512/300?random","").SetClass("ma-2").SetAspectRatio("1.15")
'	dynaR1.AddImage("image4","https://picsum.photos/512/300?random","").SetCOntains(True).SetWidth("250").SetHeight("250")
'	
'	
	dynaR1.refresh
End Sub

Sub trackr1(e As BANanoEvent)
	Log(e)
	'Dim r1data As Map = dynaR1.getValues
	'Log(r1data)
End Sub