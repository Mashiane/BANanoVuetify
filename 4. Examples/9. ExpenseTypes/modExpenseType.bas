B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public name As String = "expensetypesCode"
	Public title As String = "Expense Types"
	Private vm As BANanoVM
	Private BANano As BANano  'ignore
	Private dialogexpensetypes As VMDialog
	Private datatableexpensetypes As VMDataTable
	Private cont As VMContainer
	Private Mode As String
End Sub

Sub Code
	'Establish a reference to the app
	vm = pgIndex.vm
	'create a container to hold all contents based on the page name
	cont = vm.CreateContainer(name, Me)
	'add the table
	CreateListing_expensetypes
	'hide the container
	cont.Hide
	'add the container to the page
	vm.AddContainer(cont)
	'add the dialog to the page
	CreateDialog_Expensetypes
	'add method to get all records
	vm.SetMethod(Me, "SelectAll_Expensetypes")
End Sub

Sub Show
	'1. update the navbar title, uncomment to activate
	vm.NavBar.UpdateTitle(title)
	vm.NavBAr.HideItems
	'show buttons for modExpenseType
	vm.ShowItem("btnAddExpenseType")
	vm.ShowItem("btnRefreshExpenseType")
	'2. Show the page and hide others
	vm.ShowPage(name)
End Sub			

Sub CreateListing_expensetypes
	Dim datatableexpensetypes As VMDataTable = vm.CreateDataTable("datatableexpensetypes", "id", Me)
	datatableexpensetypes.SetTitle("Expense Types")
	datatableexpensetypes.SetAddNew("btnNewExpenseType", "mdi-plus", "Add a new expense type")
	datatableexpensetypes.SetDatasourcename("recordsexpensetypes")
	datatableexpensetypes.SetItemsperpage("10")
	datatableexpensetypes.SetMobilebreakpoint("600")
	datatableexpensetypes.SetMultisort(True)
	datatableexpensetypes.SetPage("1")
	datatableexpensetypes.SetSingleselect(True)
	datatableexpensetypes.AddColumn1("id", "#", "text",0,False,"start")
	datatableexpensetypes.AddColumn1("text", "Name", "text",0,True,"start")
	datatableexpensetypes.SetEdit(True)
	datatableexpensetypes.SetDelete(True)
	cont.AddControl(datatableexpensetypes.DataTable, datatableexpensetypes.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
End Sub


'delete all records
Sub DeleteAll_Expensetypes
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("dbexpensetypes", "dbexpensetypes")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for deletion
	alaSQL.Initialize("expensetypes", "id")
	'generate & run command to delete all records
	alaSQL.DeleteAll
	alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)
End Sub

'delete single record
Sub DeleteRecord_Expensetypes(RecordID As String)
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("dbexpensetypes", "dbexpensetypes")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for deletion
	alaSQL.Initialize("expensetypes", "id")
	'generate & run command to delete single record
	alaSQL.Delete(RecordID)
	alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)
End Sub

'select all records
Sub SelectAll_Expensetypes
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("dbexpensetypes", "dbexpensetypes")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for reading
	alaSQL.Initialize("expensetypes", "id")
	'generate & run command to select all records
	alaSQL.SelectAll(Array("*"), Array("text"))
	alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
	vm.SetData("recordsexpensetypes", alaSQL.Result)
End Sub

'create/update record to table
Sub CreateUpdate_Expensetypes
	'get the record to create/update
	Dim Record As Map = dialogexpensetypes.Container.GetData
	'validate the record
	Dim bValid As Boolean = vm.Validate(Record, dialogexpensetypes.Container.Required)
	'if invalid exit create/update
	If bValid = False Then Return
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("dbexpensetypes", "dbexpensetypes")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for insert/update
	alaSQL.Initialize("expensetypes", "id")
	'generate max value
	Dim nextID As Int = 0
	'generate & run command to get max value
	alaSQL.GetMax
	alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)
	nextID = alaSQL.GetNextID
	'update the record with the next id
	Record.Put("id", nextID)
	'initialize table for insert/update after auto-increment
	alaSQL.Initialize("expensetypes", "id")
	'define schema for record
	alaSQL.SchemaFromDesign(dialogexpensetypes.Container)
	'prepare record for database
	alaSQL.RecordFromMap(Record)
	'are we creating/updating a record
	Select Case Mode
		Case "A"
			'insert a record
			alaSQL.Insert
			'generate & run command to insert record
			alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
		Case "E"
			'read record id
			Dim RecID As String = Record.Get("id")
			'update a record
			alaSQL.Update(RecID)
			'generate & run command to update record
			alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
	End Select
End Sub

'read record
Sub Read_Expensetypes(RecID As String)
	'set default values
	dialogexpensetypes.Container.SetDefaults
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("dbexpensetypes", "dbexpensetypes")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for reading
	alaSQL.Initialize("expensetypes", "id")
	'generate & run command to read record
	alaSQL.Read(RecID)
	alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
	'was the read successful?
	If alaSQL.Result.Size = 0 Then Return
	'the record as found!
	Dim Record As Map = alaSQL.result.get(0)
	'Update the dialog details
	dialogexpensetypes.SetTitle("Edit Expense Type")
	'set the default values for the dialog
	dialogexpensetypes.Container.SetDefaults
	'update the state, this updates the v-model(s) for each input control
	'save the state and update UI!
	vm.SetState(Record)
	'show the modal
	vm.ShowDialog("dialogexpensetypes")
End Sub

'expensetypes Edit action
Sub expensetypes_edit(item As Map)
	'get the key
	Dim RecID As String = item.Get("id")
	'set mode to E-dit
	Mode = "E"
	'read record from database
	Read_Expensetypes(RecID)
End Sub


'expensetypes Delete action
Sub expensetypes_delete(item As Map)
	'get the key
	Dim RecID As String = item.Get("id")
	'save the id to delete
	vm.SetData("expensetypesid", RecID)
	'show confirm dialog
	vm.ShowConfirm("delete_expensetypes", "Confirm Delete: " & RecID, _
"Are you sure that you want to delete this expense type. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub


'add a new record
Sub Addexpensetypes
	'set mode to A-add
	Mode = "A"
	'set default values
	dialogexpensetypes.Container.SetDefaults
	'update the title
	dialogexpensetypes.SetTitle("New Expense Type")
	'show dialog
	vm.ShowDialog("dialogexpensetypes")
End Sub


'when add new is clicked
Sub btnNewExpenseType_click(e As BANanoEvent)
	Addexpensetypes
End Sub

'confirm ok code
Sub confirm_ok
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
		Case "delete_expensetypes"
			'read the saved record id
			Dim RecID As String = vm.GetState("expensetypesid", "")
			If RecID = "" Then Return
			'delete the record
			DeleteRecord_Expensetypes(RecID)
			'execute code to refresh listing for ExpenseType
			vm.CallMethod("SelectAll_Expensetypes")
	End Select
End Sub

'create dialog
Sub CreateDialog_Expensetypes
	dialogexpensetypes = vm.CreateDialog("dialogexpensetypes", Me)
	dialogexpensetypes.SetTitle("Expense Types")
	dialogexpensetypes.SetOk("btnOkexpensetypes","Save")
	dialogexpensetypes.SetCancel("btnCancelexpensetypes","Cancel")
	dialogexpensetypes.Setwidth("70%")
	dialogexpensetypes.Setpersistent(True)
	vm.AddDialog(dialogexpensetypes)
End Sub

'add code to save the expense type
Sub btnOkexpensetypes_click(e As BANanoEvent)
	'save the record
	CreateUpdate_Expensetypes
	'execute code to refresh listing for ExpenseType
	vm.CallMethod("SelectAll_Expensetypes")
End Sub

'add code to cancel the dialog for expense type
Sub btnCancelexpensetypes_click(e As BANanoEvent)
	'hide the modal
	vm.HideDialog("dialogexpensetypes")
End Sub

