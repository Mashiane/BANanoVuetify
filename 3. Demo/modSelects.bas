B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "selectsCode"
	Public title As String = "Selects"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(20).AddColumns12
	'
	vm.setstatesingle("items", Array("Programming", "Design", "Vue", "Vuetify"))
	vm.SetStateSingle("states", Array("Alabama", "Alaska", "American Samoa", "Arizona", _
	"Arkansas", "California", "Colorado", "Connecticut", _
	"Delaware", "District of Columbia", "Federated States of Micronesia", _
	"Florida", "Georgia", "Guam", "Hawaii", "Idaho", _
	"Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", _
	"Louisiana", "Maine", "Marshall Islands", "Maryland", _
	"Massachusetts", "Michigan", "Minnesota", "Mississippi", _
	"Missouri", "Montana", "Nebraska", "Nevada", _
	"New Hampshire", "New Jersey", "New Mexico", "New York", _
	"North Carolina", "North Dakota", "Northern Mariana Islands", "Ohio", _
	"Oklahoma", "Oregon", "Palau", "Pennsylvania", "Puerto Rico", _
	"Rhode Island", "South Carolina", "South Dakota", "Tennessee", _
	"Texas", "Utah", "Vermont", "Virgin Island", "Virginia", _
	"Washington", "West Virginia", "Wisconsin", "Wyoming"))
	'
	vm.CreateSelect("sel1", Me).SetItems("items").SetLabel("Disabled").SetDisabled(True).AddToContainer(cont, 1, 1)
	'
	vm.CreateSelect("sel2", Me).SetItems("items").SetLabel("Read Only").SetReadonly(True).AddToContainer(cont, 2, 1)
	'
	vm.CreateSelect("sel3", Me).SetMultiple(True).SetChips(True).SetAttach(True).SetVModel("sel3").SetItems("items").SetLabel("Chips").AddToContainer(cont, 3, 1)
	'
	vm.CreateSelect("sel4", Me).SetFilled(True).SetOnChange(Me, "sel4_change").SetChips(True).SetAttach(True).SetVModel("sel4").SetItems("items").SetLabel("Chips").AddToContainer(cont, 4, 1)
	'
	vm.CreateSelect("sel5", Me).SetOutlined(True).SetMultiple(True).SetChips(True).SetVModel("sel5").SetItems("items").SetLabel("Chips").AddToContainer(cont, 5, 1)
	'
	vm.CreateSelect("sel6", Me).SetSolo(True).SetMultiple(True).SetChips(True).SetVModel("sel6").SetItems("items").SetLabel("Chips").AddToContainer(cont, 6, 1)
	'
	vm.CreateSelect("sel7", Me).SetMenuProps("auto").SetHideDetails(True).SetPrependIcon("map").SetSingleLine(True).SetVModel("sel7").SetItems("states").SetLabel("States").AddToContainer(cont, 7, 1)
	'
	Dim sel8 As VMSelect = vm.CreateSelect("sel8", Me).SetMenuProps("auto").SetHideDetails(True).SetAppendOuterIcon("map").SetVModel("sel8").SetItems("states").SetLabel("States")
	sel8.SetHint("Pick your favorite states").SetPersistentHint(True).SetMultiple(True)
	sel8.AddToContainer(cont, 8, 1)
	'
	Dim sel9 As VMSelect = vm.CreateSelect("sel9", Me).SetVModel("sel9").SetLabel("Key Value Pairs").SetPersistentHint(True)
	sel9.SetOptions("littlestates", CreateMap("Florida": "FL", "Georgia": "GA", "Nebraska": "NE", "California": "CA", "New York": "NY") ,"state", "abbr", False)
	sel9.AddToContainer(cont, 9, 1)
	'
	vm.CreateSelect("sel10", Me).SetVModel("value").SetItems("items").SetLabel("Standard").SetDense(True).AddToContainer(cont, 10, 1)
	'
	vm.CreateSelect("sel11", Me).SetVModel("value").SetItems("items").SetLabel("Filled").SetFilled(True).SetDense(True).AddToContainer(cont, 11, 1)
	'
	vm.CreateSelect("sel12", Me).SetVModel("value").SetItems("items").SetLabel("Outlined").SetOutlined(True).SetDense(True).AddToContainer(cont, 12, 1)
	'
	vm.CreateSelect("sel13", Me).SetVModel("value").SetItems("items").SetLabel("Solo").SetSolo(True).SetDense(True).AddToContainer(cont, 13, 1)
	
	'select with list items
	Dim selList As VMSelect = vm.CreateSelect("selList", Me)
	selList.setvmodel("mylistx")
	selList.SetLabel("List Items")
	selList.AddListItem("myfiles", "", "mdi-folder", "red", "My Files", "", "")
	selList.AddListItem("account", "", "mdi-account-multiple", "blue", "Shared with Me", "","")
	selList.AddListItem("starred", "", "mdi-star", "yellow", "Starred", "", "")
	selList.AddListItem("person1", "./assets/1.png", "", "", "Person 1", "", "")
	selList.AddListItem("person2", "./assets/2.png", "", "", "Person 2", "", "")
	selList.AddListItem("person3", "./assets/1.png", "", "", "Jane Smith", "Logged In", "")
	selList.AddListItem("sa", "", "",  "", "Sandra Adams", "Chief Executive Officer", "sandra_a88@gmail.com")
	selList.AddListItem("person4", "./assets/2.png", "", "", "Anele Mbanga", "", "")
	selList.SetOnChange(Me, "sellist_change")
	selList.AddToContainer(cont, 14,  1)
	'
	Dim selList1 As VMSelect = vm.CreateSelect("selList1", Me)
	selList1.setvmodel("mylistx")
	selList1.SetLabel("Add at runtime")
	'add at least 1 item
	selList1.AddItem("dummy", "dummy")
	selList1.AddToContainer(cont, 15,  1)
	
	selList1.Clear
	selList1.AddItem("markhams", "Khanyiso")
	selList1.AddItem("siba", "Usibabale")
	selList1.AddItem("orio", "Olothando")
	selList1.AddItem("ernesto", "Esona")
	selList1.AddItem("gift", "Sisipho")
	selList1.Update
	
	'add container to page
	vm.AddContainer(cont)
End Sub

'trap change event for the select
Sub selList_change(value As Object)
	vm.ShowSnackBarSuccess(value)
End Sub

Sub sel4_change(value As Object)
	vm.ShowSnackBar(value)
End Sub
