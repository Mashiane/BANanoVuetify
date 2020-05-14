B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public Name As String = "expensetypesCode"
	Public Title As String = "Expense Types"
	Private vm As BANanoVM
	Private BANano As BANano  'ignore
	Private dlgexpensetypes As VMDialog
	Private dtexpensetypes As VMDataTable
	Private cont As VMContainer
	Private Mode As String
End Sub

Sub Code
	'Establish a reference to the app
	vm = pgIndex.vm
	'create a container to hold all contents based on the page name
	cont = vm.CreateContainer(Name, Me)
	'hide the container
	cont.Hide
	'add the table to container
	CreateDataTable_expensetypes
	'add the dialog to page
	CreateDialog_Expensetypes
	'add the container to the page
	vm.AddContainer(cont)
	'add method to get all records
	vm.SetMethod(Me, "SelectAll_Expensetypes")
End Sub

'show the page
Sub Show
	'the navbar is visible for this page
	vm.NavBar.Show
	'show the hamburger for this page
	vm.NavBar.Hamburger.Show
	'the drawer should be hidden for this page
	vm.Drawer.Hide
	'the logo should be visible for this page
	vm.NavBar.Logo.Show
	'hide all buttons
	vm.NavBar.HideItems
	'show buttons for modExpenseType
	vm.HideItem("navExpenseType")
	'2. Show the page and hide others
	vm.ShowPage(Name)
	'load records to table
	vm.CallMethod("SelectAll_Expensetypes")
End Sub

'delete all records
Sub DeleteAll_Expensetypes
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("expenses", "expenses")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for deletion
	alaSQL.Initialize("expensetypes", "typeid")
	'generate & run command to delete all records
	alaSQL.DeleteAll
	alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)
	alaSQL.FromJSON
	'execute code to refresh listing for ExpenseType
	vm.CallMethod("SelectAll_Expensetypes")
End Sub

'delete single record
Sub DeleteRecord_Expensetypes(RecordID As String)
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("expenses", "expenses")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for deletion
	alaSQL.Initialize("expensetypes", "typeid")
	'define schema for record
	alaSQL.SchemaFromDesign(dlgexpensetypes.Container)
	'generate & run command to delete single record
	alaSQL.Delete(RecordID)
	alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)
	alaSQL.FromJSON
	'execute code to refresh listing for ExpenseType
	vm.CallMethod("SelectAll_Expensetypes")
End Sub

'select all records
Sub SelectAll_Expensetypes
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("expenses", "expenses")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for reading
	alaSQL.Initialize("expensetypes", "typeid")
	'generate & run command to select all records
	alaSQL.SelectAll(Array("*"), Array("typename"))
	alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
	alaSQL.FromJSON
	'save records to state
	VM.SetData("expensetypes", alaSQL.Result)
	'update the data table records
	dtexpensetypes.SetDataSourceName("expensetypes")
End Sub

'expensetypes Edit action
Sub dtexpensetypes_edit(item As Map)
	'get the key
	Dim RecID As String = item.Get("typeid")
	'set mode to E-dit
	Mode = "E"
	'read record from database
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("expenses", "expenses")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for reading
	alaSQL.Initialize("expensetypes", "typeid")
	'define schema for record
	alaSQL.SchemaFromDesign(dlgexpensetypes.Container)
	'generate & run command to read record
	alaSQL.Read(RecID)
	alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
	alaSQL.FromJSON
	'was the read successful?
	If alaSQL.Result.Size = 0 Then Return
	'the record as found!
	Dim Record As Map = alaSQL.result.get(0)
	'Update the dialog details
	dlgexpensetypes.SetTitle("Edit ExpenseType")
	'show the modal
	dlgexpensetypes.Show
	'update the state, this updates the v-model(s) for each input control
	vm.SetState(Record)
End Sub


'expensetypes Delete action
Sub dtexpensetypes_delete(item As Map)
	'get the key
	Dim RecID As String = item.Get("typeid")
	'save the id to delete
	vm.SetData("expensetypestypeid", RecID)
	'show confirm dialog
	vm.ShowConfirm("delete_expensetypes", "Confirm Delete: " & RecID, _
"Are you sure that you want to delete this expense type. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub


'add a new expense type
Sub Addexpensetypes
	'set mode to A-add
	Mode = "A"
	'update the title
	dlgexpensetypes.SetTitle("New ExpenseType")
	'show dialog
	dlgexpensetypes.Show
End Sub


'when add new is clicked
Sub btnNew_click(e As BANanoEvent)
	Addexpensetypes
End Sub

'create dialog
Sub CreateDialog_Expensetypes
	dlgexpensetypes = vm.CreateDialog("dlgexpensetypes", Me)
	dlgexpensetypes.SetTitle("Expense Types")
	dlgexpensetypes.SetOk("btnOkexpensetypes","Save")
	dlgexpensetypes.SetCancel("btnCancelexpensetypes","Cancel")
	dlgexpensetypes.Setwidth("700px")
	dlgexpensetypes.Setpersistent(True)
	'
	Dim txttypeid As VMTextField = vm.NewTextField(Me, True, "txttypeid", "typeid", "#", "", False, "", 0, "", "", 0)
txttypeid.SetFieldType("int")
txttypeid.SetVisible(False)
dlgexpensetypes.Container.AddControl(txttypeid.textfield, txttypeid.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

Dim txttypename As VMTextField = vm.NewTextField(Me, True, "txttypename", "typename", "Name", "", True, "", 0, "", "", 0)
txttypename.SetFieldType("string")
txttypename.SetVisible(True)
dlgexpensetypes.Container.AddControl(txttypename.textfield, txttypename.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	vm.AddDialog(dlgexpensetypes)
End Sub

'add code to save the expense type
Sub btnOkexpensetypes_click(e As BANanoEvent)
	'create/update record to table
	'get the record to create/update
	Dim Record As Map = dlgexpensetypes.Container.GetData
	'validate the record
	Dim bValid As Boolean = vm.Validate(Record, dlgexpensetypes.Container.Required)
	'if invalid exit create/update
	If bValid = False Then Return
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("expenses", "expenses")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'check mode
	Select Case Mode
		Case "A"
			'generate max value
			Dim nextID As Int = 0
			'generate & run command to get max value
			'initialize table
			alaSQL.Initialize("expensetypes", "typeid")
			alaSQL.GetMax
			alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)
			alaSQL.FromJSON
			nextID = alaSQL.GetNextID
			'update the record with the next id
			Record.Put("typeid", nextID)
			'initialize table for insert
			alaSQL.Initialize("expensetypes", "typeid")
			'define schema for record
			alaSQL.SchemaFromDesign(dlgexpensetypes.Container)
			'insert a record
			alaSQL.Insert1(Record)
			'generate & run command to insert record
			alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
			alaSQL.FromJSON
		Case "E"
			'read record id
			Dim RecID As String = Record.Get("typeid")
			'initialize table for edit
			alaSQL.Initialize("expensetypes", "typeid")
			'define schema for record
			alaSQL.SchemaFromDesign(dlgexpensetypes.Container)
			'prepare record for database
			alaSQL.RecordFromMap(Record)
			'update a record
			alaSQL.Update1(Record, RecID)
			'generate & run command to update record
			alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
			alaSQL.FromJSON
	End Select
	'hide the modal
	dlgexpensetypes.Hide
	'execute code to refresh listing for ExpenseType
	vm.CallMethod("SelectAll_Expensetypes")
End Sub

'add code to cancel the dialog for expense type
Sub btnCancelexpensetypes_click(e As BANanoEvent)
	'hide the modal
	dlgexpensetypes.Hide
End Sub

Sub CreateDataTable_expensetypes
	dtexpensetypes = vm.CreateDataTable("dtexpensetypes", "typeid", Me)
	dtexpensetypes.SetTitle("Expense Types")
	dtexpensetypes.SetSearchbox(True)
	dtexpensetypes.SetAddNew("btnNew", "mdi-plus", "Add a new expense type")
	vm.setdata("expensetypes", vm.newlist)
	dtexpensetypes.SetDatasourcename("expensetypes")
	dtexpensetypes.SetItemsperpage("10")
	dtexpensetypes.SetMobilebreakpoint("600")
	dtexpensetypes.SetMultisort(True)
	dtexpensetypes.SetPage("1")
	dtexpensetypes.SetSingleselect(True)
	dtexpensetypes.SetVisible(True)
	dtexpensetypes.AddColumn1("typeid", "#", "text",0,False,"start")
	dtexpensetypes.AddColumn1("typename", "Name", "text",0,True,"start")
	dtexpensetypes.SetEdit(True)
	dtexpensetypes.SetDelete(True)
	cont.AddControl(dtexpensetypes.DataTable, dtexpensetypes.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
End Sub