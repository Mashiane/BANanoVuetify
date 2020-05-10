B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "filesCode"
	Public title As String = "Files"
	Private vm As BANanoVM
	Private dtExcel As VMDataTable
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	Dim btnTextFile As VMButton = vm.CreateButton("btnTextFile", Me).SetLabel("Read Text File Without Upload")
	cont.AddControlS(btnTextFile.Button, btnTextFile.ToString, 1, 1, 12, 12, 12, 12)
	'
	Dim btnExcelFile As VMButton = vm.CreateButton("btnExcelFile", Me).SetLabel("Read Excel File Without Upload")
	cont.AddControlS(btnExcelFile.Button, btnExcelFile.ToString, 2, 1, 12, 12, 12, 12)
	'
	'add a table to the page use the same columns in the excel file
	dtExcel = vm.CreateDataTable("dtExcel", "OrderDate", Me)
	dtExcel.SetTitle("Orders")
	dtExcel.AddSearch
	dtExcel.AddColumn("OrderDate", "Order Date")
	dtExcel.AddColumn("Region", "Region")
	dtExcel.AddColumn("Rep", "Rep")
	dtExcel.AddColumn("Item", "Item")
	dtExcel.AddColumn("Units", "Units")
	dtExcel.AddColumn("Unit Cost", "Unit Cost")
	dtExcel.AddColumn("Total", "Total")
	cont.AddControlS(dtExcel.DataTable, dtExcel.ToString, 3, 1, 12, 12, 12, 12)
	
	'add container to page
	vm.AddContainer(cont)
	' add an invisible file selector
	vm.AddFileSelect(Me, "fucomponent")
	vm.AddFileSelect(Me, "xlscomponent")
	
End Sub

Sub btnExcelFile_click(e As BANanoEvent)
	vm.ShowFileSelect("xlscomponent")
End Sub


Sub btnTextFile_click(e As BANanoEvent)
	vm.ShowFileSelect("fucomponent")
End Sub

Sub fucomponent_change(e As BANanoEvent)
	Dim fileList As List = vm.GetFileListFromTarget(e)
	If fileList.size = 0 Then Return
	'only process 1 file
	Dim fr As String = fileList.get(0)
	'
	Dim Result As Map
	Dim promise As BANanoPromise = vm.readAsText(fr)
	promise.Then(Result)
		'get the json content
		Dim txt As String = Result.get("result")
		Log(txt)
		'
	promise.Else(Result)
		Dim compError As String = Result.get("result")
		Log(compError)
	promise.End
	
	'nully file component so we can select same file
	vm.NullifyFileSelect("fucomponent")
End Sub


Sub xlscomponent_change(e As BANanoEvent)
	Dim fileList As List = vm.GetFileListFromTarget(e)
	If fileList.size = 0 Then Return
	'only process 1 file
	Dim fr As String = fileList.get(0)
	'
	Dim Result As Map
	Dim promise As BANanoPromise = vm.readAsBinaryString(fr)
	promise.Then(Result)
		'get the json content
		Dim data As String = Result.get("result")
				
		Dim be As BANanoExcel
		be.initialize
		Dim records As List = be.ReadFile(data)
		Log(records)
		dtExcel.SetDataSource(records)
		'
	promise.Else(Result)
		Dim compError As String = Result.get("result")
		Log(compError)
	promise.End
	
	'nully file component so we can select same file
	vm.NullifyFileSelect("xlscomponent")
End Sub