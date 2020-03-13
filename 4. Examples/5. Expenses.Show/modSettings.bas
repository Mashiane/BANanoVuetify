B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "settingscode"
	Private expenseType As VMGijgoTable
	Private category As VMGijgoTable
End Sub

Sub Code
	Log("modSettings.Code")
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 1 columns each spanning 12 columns
	cont.AddRows(2).AddColumns12
	'
	expenseType = vm.CreateGijgoTable("expensetype", "id", Me)
	expenseType.SetTitle("Expense Types")
	expenseType.AddColumn("id","#")
	expenseType.AddColumn("text","Name")
	expenseType.AddColumn("description","Description")
	expenseType.AddEditTrash
	expenseType.autoLoad = True
	expenseType.SetDataSource(Array())	
	cont.AddComponent(1,1, expenseType.tostring)
	'add container to the page content
	vm.AddContainer(cont)
End Sub

Sub Refresh
	expenseType.refresh
End Sub