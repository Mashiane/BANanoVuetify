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
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim vList As VMList = vm.CreateList("lst1", Me).SetElevation(3)"$)
vue.AddCode($"vList.AddSubHeader("Reports")"$)
vue.AddCode($"vList.AddItem("myfiles", "", "mdi-folder", "My Files", "", "")"$)
vue.AddCode($"vList.AddItem("account", "", "mdi-account-multiple", "Shared with Me", "","mdi-information")"$)
vue.AddCode($"vList.AddItem("starred", "", "mdi-star", "Starred", "","mdi-information")"$)
vue.AddCode($"vList.AddItem("person1", "./assets/1.png", "", "", "","mdi-information")"$)
vue.AddCode($"vList.AddItem("person2", "./assets/2.png", "", "", "","mdi-information")"$)
vue.AddCode($"vList.AddItem("person3", "./assets/1.png", "", "Jane Smith", "Logged In","mdi-information")"$)
vue.AddCode($"vList.AddItem("sa", "", "",  "Sandra Adams", "sandra_a88@gmail.com","mdi-information")"$)
vue.AddCode($"vList.AddItem("person4", "./assets/2.png", "", "Anele Mbanga", "","mdi-information")"$)
vue.AddCode($"vList.AddToContainer(cont, 1,  1)"$)
pgIndex.CreateVBCode(vue, Me, "list1code", "List", vue.GetSourceCode).AddToContainer(cont, 1, 1)

'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($""$)
vue.AddCode($"Sub lst1_click(e As BANanoEvent)"$)
vue.AddCode($"Dim itemID As String = vm.GetIDFromEvent(e)"$)
vue.AddCode($"vm.ShowSnackBar(itemID)"$)
vue.AddCode($"End Sub"$)
pgIndex.CreateVBCode(vue, Me, "list1click", "List Item Click", vue.GetSourceCode).AddToContainer(cont, 1, 1)


	
	'
	Dim ds As List
	ds.Initialize
	ds.Add(CreateMap("action": "mdi-inbox-arrow-down",	"title": "Inbox"))
	ds.Add(CreateMap("action": "mdi-send", "title": "Sent"))
	ds.Add(CreateMap("action": "mdi-delete", "title": "Trash"))
	ds.Add(CreateMap("action": "mdi-file-document-outline", "title": "Spam"))
	ds.Add(CreateMap("divider": True))
	ds.Add(CreateMap("header": "Labels"))
	ds.Add(CreateMap("action": "mdi-label", "title": "Family"))
	ds.Add(CreateMap("action": "mdi-label", "title": "Friends"))
	ds.Add(CreateMap("action": "mdi-label", "title": "Work"))
	'
	vm.SetData("lst2", ds)
	Dim vList1 As VMList = vm.CreateList("lst2", Me).SetElevation(3)
	vList1.SetDataSourceTemplate("lst2", "action", "", "action", "title", "", "")
	vList1.AddToContainer(cont, 2,  1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'"$)
vue.AddCode($"Dim ds As List"$)
vue.AddCode($"ds.Initialize"$)
	vue.AddCode($"ds.Add(CreateMap("action": "mdi-inbox-arrow-down",	"title": "Inbox"))"$)
vue.AddCode($"ds.Add(CreateMap("action": "mdi-send", "title": "Sent"))"$)
vue.AddCode($"ds.Add(CreateMap("action": "mdi-delete", "title": "Trash"))"$)
	vue.AddCode($"ds.Add(CreateMap("action": "mdi-file-document-outline", "title": "Spam"))"$)
vue.AddCode($"ds.Add(CreateMap("divider": True))"$)
vue.AddCode($"ds.Add(CreateMap("header": "Labels"))"$)
vue.AddCode($"ds.Add(CreateMap("action": "mdi-label", "title": "Family"))"$)
vue.AddCode($"ds.Add(CreateMap("action": "mdi-label", "title": "Friends"))"$)
vue.AddCode($"ds.Add(CreateMap("action": "mdi-label", "title": "Work"))"$)
vue.AddCode($"'"$)
vue.AddCode($"vm.SetData("lst2", ds)"$)
vue.AddCode($"Dim vList1 As VMList = vm.CreateList("lst2", Me).SetElevation(3)"$)
vue.AddCode($"vList1.SetDataSourceTemplate("lst2", "action", "", "action", "title", "", "")"$)
vue.AddCode($"vList1.AddToContainer(cont, 2,  1)"$)
pgIndex.CreateVBCode(vue, Me, "list2code", "List State", vue.GetSourceCode).AddToContainer(cont, 2, 1)

	'add container to page
	vm.AddContainer(cont)
End Sub


Sub list1clickcopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("list1click")
End Sub

Sub list1clickdownload_click(e As BANanoEvent)
vue.DownloadCode("list1click", "list1click.txt")
End Sub

Sub lst1_click(e As BANanoEvent)
	Dim itemID As String = vm.GetIDFromEvent(e)
	vm.ShowSnackBar(itemID)
End Sub


Sub list1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("list1code")
End Sub

Sub list1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("list1code", "list1code.txt")
End Sub


Sub list2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("list2code")
End Sub

Sub list2codedownload_click(e As BANanoEvent)
	vue.DownloadCode("list2code", "list2code.txt")
End Sub

