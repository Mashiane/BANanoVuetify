B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "treeCode"
	Public title As String = "TreeView"
	Private vm As BANanoVM
	Private tv As VMTreeView
	Private BANano As BANano
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(5).AddColumns2X6
	'
	Dim tv As VMTreeView = vm.CreateTreeView("tv1", Me)
	tv.AddItem("", "1", "Applications", "", "", False)
	tv.AddItem("1", "2", "Calendar : app", "", "", False)
	tv.AddItem("1", "3", "Chrome : app", "", "", False)
	tv.AddItem("1", "4", "Webstorm : app", "", "", False)
	tv.AddItem("", "5", "Documents :", "", "", False)
	tv.AddItem("5", "6", "vuetify :", "", "", False)
	tv.AddItem("6", "7", "src :", "", "", False)
	tv.AddItem("7", "8", "index : ts", "", "", False)
	tv.AddItem("7", "9", "bootstrap : ts", "", "", False)
	tv.AddItem("5", "10", "material2 : ", "", "", False)
	tv.AddItem("10", "11", "src : ", "", "", False)
	tv.AddItem("11", "12", "v-btn : ts", "", "", False)
	tv.AddItem("11", "13", "v-card : ts", "", "", False)
	tv.AddItem("11", "14", "v-window : ts", "", "", False)
	'
	tv.AddToContainer(cont, 1, 1)
	'
	cont.AddLabel(1, 2, "lblx2","p", $"{{ ${tv.active} }}"$)
	
	'add container to page
	vm.AddContainer(cont)
End Sub

Sub tv1_click(items As List)
	If items = Null Then Return 
	Dim thisNode As Map = items.Get(0)
	If thisNode = Null Then Return
	
	vm.ShowSnackBar("Selected: " & BANano.ToJson(thisNode))
End Sub

