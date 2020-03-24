B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public name As String = "autocompleteCode"
	Public title As String = "Auto Complete"
	Private vm As BANanoVM
	Private descriptionlimit As Int
	Private BANano As BANano
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(5).AddColumns2x6
	'
	descriptionlimit = 60
	Reset
	
	Dim Card As VMCard = Card_1
	Dim card2 As VMCard = Card_2
	Dim card3 As VMCard = Card_3
	'Dim card4 As VMCard = Card_4
	
	cont.AddComponent(1, 1, Card.ToString)
	cont.AddComponent(1, 2, card2.ToString)
	cont.AddComponent(2, 1, card3.ToString)
	'cont.AddComponent(2, 2, card4.ToString)
	'
	vm.AddContainer(cont)
	'
	vm.SetWatch("search", True, True, Me, "SearchItems")
	vm.SetWatch("model", True, True, Me, "ComputeFields")
	vm.SetMethod(Me, "customfilter")
End Sub

Sub Card_4 As VMCard
	vm.SetData("isupdating", False)
	
	Dim Card As VMCard = vm.CreateCard("card4", Me).SetColorIntensity(vm.COLOR_BLUEGREY, vm.INTENSITY_DARKEN1)
	Card.SetDark(True).Bind(":loading", "isupdating")
	'
	Dim tmp As VMTemplate = vm.CreateTemplate("t1", Me).SetSlotProgress
	'
	Dim prg As VMProgressLinear = vm.CreateProgressLinear("prg1", Me).SetAttributes(Array("absolute", "indeterminate"))
	prg.SetColorIntensity(vm.COLOR_GREEN, vm.INTENSITY_LIGHTEN3).SetHeight("4")
	prg.Pop(tmp.Template)
	'
	Card.AddComponent(tmp.ToString)
	'
	Dim img As VMImage = vm.CreateImage("card4img", Me).SetHeight(200).SetVmodel("card4img", "./assets/dark-beach.jpg")
	Card.AddComponent(img.tostring)
	'
	Dim cont As VMContainer = vm.CreateContainer("card4cont", Me)
	cont.AddRows(1).AddColumns(1, 12, 12, 12, 12)
	cont.AddClassRC(1, 1, Array("text-right"))
	'
	Dim mm As VMMenu = vm.CreateMenu("mm", Me).SetAttributes(Array("bottom", "left")).SetSlideYTransition
	'
	Dim tmp1 As VMTemplate = vm.CreateTemplate("t2", Me).SetSlotActivatorOn
	Dim btn As VMButton = vm.CreateButton("btn2", Me).SetVOn("on").SetIconButton("mdi-dots-vertical")
	tmp1.AddComponent(btn.ToString)
	mm.AddComponent(tmp1.ToString)
	cont.AddComponent(1, 1, mm.ToString)
	'
	img.AddComponent(cont.ToString)
	
	Return Card
	
End Sub



Sub Card_3 As VMCard	'
	vm.SetData("value", Null)
	vm.SetData("items", Array("foo", "bar", "fizz", "buzz"))
	vm.SetData("values", Array("foo", "bar"))
	
	Dim Card As VMCard = vm.CreateCard("card3", Me)
	Card.Container.AddRows(1).AddColumns(3,12,12,12,12)
	'
	Dim ac1 As VMSelect = vm.CreateAutoComplete("ac31", Me).SetVModel("values").Bind(":items", "items")
	ac1.SetAttributes(Array("outlined", "dense", "chips", "small-chips", "multiple")).SetLabel("Outlined")
	Card.Container.AddComponent(1, 1, ac1.ToString)
	'
	Dim ac2 As VMSelect = vm.CreateAutoComplete("ac32", Me).SetVModel("values").Bind(":items", "items")
	ac2.SetAttributes(Array("dense", "chips", "small-chips", "multiple", "solo")).SetLabel("Solo")
	Card.Container.AddComponent(1, 2, ac2.ToString)
	'
	Dim ac3 As VMSelect = vm.CreateAutoComplete("ac33", Me).SetVModel("values").Bind(":items", "items")
	ac3.SetAttributes(Array("dense", "filled")).SetLabel("Filled")
	Card.Container.AddComponent(1, 3, ac3.ToString)
	
	Return Card
	
End Sub

Sub Card_2 As VMCard
	'
	vm.SetData("hasSaved", False)
	vm.SetData("isEditing", Null)
	vm.SetData("model1", "Null")
	'
	Dim lst As List
	lst.Initialize
	lst.Add(CreateMap("name": "Florida", "abbr": "FL", "id": "1"))
	lst.Add(CreateMap("name": "Georgia", "abbr": "GA", "id": "2"))
	lst.Add(CreateMap("name": "Nebraska", "abbr": "NE", "id": "3"))
	lst.Add(CreateMap("name": "California", "abbr": "CA", "id": "4"))
	lst.Add(CreateMap("name": "New York", "abbr": "NY", "id": "5"))
	vm.SetData("states1", lst)
	
	Dim Card As VMCard = vm.CreateCard("card2", Me)
	Card.SetColorIntensity(vm.COLOR_PURPLE, vm.INTENSITY_LIGHTEN1).SetDark(True).AddClass("overflow-hidden")
	Card.ToolBar.SetFlat(True).SetColor("purple")
	'
	Card.ToolBar.AddIcon("","mdi-account", "", "")
	Card.ToolBar.AddTitle("User Profile", "font-weight-light")
	Card.ToolBar.AddSpacer
	'
	Dim btn As VMButton = vm.CreateButton("btnEditing", Me).SetColorIntensity(vm.COLOR_PURPLE, vm.INTENSITY_DARKEN3)
	btn.SetAttributes(Array("fab", "small"))
	btn.SetToggleIcons("isEditing", "mdi-close", "mdi-pencil")
	Card.ToolBar.AddButton(btn)
	'
	Dim txtName As VMTextField = vm.CreateTextField("txtName", Me).SetColor("white").SetLabel("Name").Bind(":disabled", "!isEditing")
	Card.Text.AddContent(txtName.tostring)
	'
	Dim txtac As VMSelect = vm.CreateSelect("txtac", Me).Bind(":disabled","!isEditing").Bind(":items", "states1")
	'txtac.Bind(":filter", "customFilter")
	txtac.SetColor("white").SetItemText("name").SetLabel("State")
	Card.Text.AddContent(txtac.ToString)
	'
	Card.Actions.AddSpacer
	'
	Dim btn1 As VMButton = vm.CreateButton("btnSaveProfile", Me).SetLabel("Save").SetColor("success").Bind(":disabled", "!isEditing")
	Card.Actions.AddButton(btn1)
	'
	Dim sb1 As VMSnackBar = vm.CreateSnackBar("sb1", Me).SetVModel("hasSaved").Bind(":timeout", "2000")
	sb1.SetAttributes(Array("absolute", "bottom", "left")).SetText("Your profile has been updated!")
	Card.AddExtraContent(sb1.ToString)
	
	Return Card
End Sub

Sub customfilter(item As Map, queryText As String, itemText As String) As Boolean
	Dim textOne As String = item.get("name")
	Dim textTwo As String = item.Get("abbr")
	Dim searchText As String = queryText.toLowerCase
	'
	textOne = textOne.ToLowerCase
	textTwo = textTwo.ToLowerCase
	'
	Dim pos1 As Int = textOne.indexof(searchText)
	Dim pos2 As Int = textTwo.IndexOf(searchText)
	Dim bres As Boolean = BANano.IIf(pos1 > -1, True, pos2 > -1)
	Return bres
End Sub

Sub btnSaveProfile_click(e As BANanoEvent)
	vm.ToggleState("isEditing")
	vm.SetStateSingle("hasSaved", "True")
End Sub

Sub btnEditing_click(e As BANanoEvent)
	vm.ToggleState("isEditing")
End Sub

Sub Card_1 As VMCard
	Dim Card1 As VMCard = vm.CreateCard("card1", Me)
	Card1.SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_LIGHTEN2).SetDark(True).SetText("Search for Public APIs").AddClass("headline")
	'
	Dim lblNote As VMLabel = vm.CreateLabel("")
	lblNote.SetText("Explore hundreds of free API's ready for consumption! For more information visit{NBSP}")
	lblNote.AddHyperLink("this Github repository", "https://github.com/toddmotto/public-apis")
	Card1.Text.SetText(lblNote.ToString)
	'
	Dim ac As VMSelect = vm.CreateSelect("ac1", Me)
	ac.SetVModel("model")
	ac.SetItems("itemsa")
	ac.SetLoading("isloading")
	ac.SetSearchInput("search")
	ac.SetColor("white").SetHideNoData(True).SetHideSelected(True)
	ac.SetItemText("Description").SetItemValue("API").SetLabel("Public APIs")
	ac.SetPlaceholder("Start typing to search").SetPrependIcon("mdi-database-search")
	ac.SetReturnObject(True)
	'
	Dim ct As VMCardText = vm.CreateCardText("ct1", Me)
	ct.SetText(ac.ToString)
	'
	Card1.AddStuff(ct.tostring)
	Dim dvd1 As VMDivider = vm.CreateDivider
	Card1.AddStuff(dvd1.ToString)
	Dim et As VMExpandTransition = vm.CreateExpandTransition("et1", Me)
	'
	Dim sl As VMList = vm.CreateList("sl1", Me).SetVIf("model").SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_LIGHTEN3)
	sl.SetDataSource("fields", "", "", "", "key", "value", "")
	sl.Pop(et.ExpandTransition)
	'
	Card1.AddStuff(et.ToString)
	'
	Card1.Actions.AddSpacer
	'
	Dim btnClear As VMButton = vm.CreateButton("btnClear", Me).SetLabel("Clear")
	Card1.Actions.AddButton(btnClear)
	Return Card1
End Sub

Sub btnClear_click(e As BANanoEvent)
	vm.SetStateSingle("model", Null)
End Sub

Sub Reset
	vm.SetStateSingle("descriptionlimit", descriptionlimit)
	vm.SetStateSingle("isloading",False)
	vm.SetStateSingle("model", Null)
	vm.SetStateSingle("search", Null)
	vm.SetStateSingle("fields", Array())
	vm.SetStateSingle("itemsa", Array())
End Sub

Sub ComputeFields As List
	Dim fields As List
	fields.Initialize 
	Dim model As Map = vm.GetState("model",Null)
	If model = Null Then Return fields
	For Each k As String In model.Keys
		Dim v As Object = model.Get(k)
		fields.Add(CreateMap("key": v, "value":v))
	Next
	vm.SetStateSingle("fields", fields)
	Return fields
End Sub


Sub SearchItems(xval As String)
	'get the already existing list of items
	Dim items As List = vm.GetState("itemsa", Array())
	'get the loading status
	Dim isloading As Boolean = vm.GetState("isloading",False)
	'items already loaded
	If items.Size > 0 Then Return
	'items have been requested
	If isloading Then Return
	'change the state to loading
	vm.SetStateSingle("isloading", True)
	
	' do the search
	Dim Response As BANanoFetchResponse
	Dim Data As BANanoJSONParser
    Dim Error As BANanoJSONParser
	' list (GET is default, and we do not need extra options so we pass Null for the options)
	Dim fetch1 As BANanoFetch
	'execute the fetch
	fetch1.Initialize("https://api.publicapis.org/entries", Null)
	'we got a promise response
	fetch1.Then(Response)
	' so resolve it to a json
	fetch1.Return(Response.Json)
	fetch1.Then(Data)
		Dim res As Map = Data.NextObject
		Dim count As Long = res.Get("count")
		Dim entries As List = res.Get("entries")
		'lets build up our items
		Dim items As List
		items.Initialize 
		'we define how long a description should be
		Dim dl As Int = vm.GetState("descriptionlimit",descriptionlimit)
		'get the entries and limit the description to specified length
		For Each entry As Map In entries
			Dim sDescription As String = entry.Get("Description")
			If sDescription.Length > descriptionlimit Then
				sDescription = vm.LeftString(sDescription, dl) & "..."
				entry.Put("Description", sDescription)
			End If
			items.Add(entry)
		Next
		'save the list of items to load to the auto-complete
		vm.SetStateSingle("itemsa", items)
	fetch1.Else(Error)
		Log(Error)
	fetch1.Finally 
		'turn the loading state to false
		vm.SetStateSingle("isloading", False)
	fetch1.End
End Sub
