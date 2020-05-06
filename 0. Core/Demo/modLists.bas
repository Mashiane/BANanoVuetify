B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "listCode"
	Public title As String = "Lists"
	Private vm As BANanoVM
	Private BANano As BANano   'ignore
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(5).AddColumns2x6
	'
	Dim vList As VMList = vm.CreateList("lst1", Me).SetElevation(3)
	vList.AddSubHeader("Reports")
	vList.AddItem("myfiles", "", "mdi-folder", "My Files", "", "")
	vList.AddItem("account", "", "mdi-account-multiple", "Shared with Me", "","mdi-information")
	vList.AddItem("starred", "", "mdi-star", "Starred", "","mdi-information")
	vList.AddItem("person1", "./assets/1.png", "", "", "","mdi-information")
	vList.AddItem("person2", "./assets/2.png", "", "", "","mdi-information")
	vList.AddItem("person3", "./assets/1.png", "", "Jane Smith", "Logged In","mdi-information")
	vList.AddItem("sa", "", "",  "Sandra Adams", "sandra_a88@gmail.com","mdi-information")
	vList.AddItem("person4", "./assets/2.png", "", "Anele Mbanga", "","mdi-information")
	vList.AddToContainer(cont, 1,  1)
	'
	Dim ds As List
	ds.Initialize
	ds.Add(CreateMap("action": "move_to_inbox",	"title": "Inbox"))
	ds.Add(CreateMap("action": "send", "title": "Sent"))
	ds.Add(CreateMap("action": "delete", "title": "Trash"))
	ds.Add(CreateMap("action": "report", "title": "Spam"))
	ds.Add(CreateMap("divider": True))
	ds.Add(CreateMap("header": "Labels"))
	ds.Add(CreateMap("action": "label", "title": "Family"))
	ds.Add(CreateMap("action": "label", "title": "Friends"))
	ds.Add(CreateMap("action": "label", "title": "Work"))
	'
	vm.SetData("lst2", ds)
	Dim vList1 As VMList = vm.CreateList("lst2", Me).SetElevation(3)
	vList1.SetDataSourceTemplate("lst2", "action", "", "action", "title", "", "")
	vList1.AddToContainer(cont, 1,  2)
	
	'add container to page
	vm.AddContainer(cont)
End Sub

Sub lst1_click(e As BANanoEvent)
	Dim itemID As String = vm.GetIDFromEvent(e)
	vm.ShowSnackBar(itemID)
End Sub