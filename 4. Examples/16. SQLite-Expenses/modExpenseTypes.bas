B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public Name As String = "ExpenseTypesCode"
	Public Title As String = "Expense Types"
	Private vm As BANanoVM
	Private BANano As BANano  'ignore
	Private dlgExpenseTypes As VMDialog
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
	CreateDialog_ExpenseTypes
	'add the container to the page
	vm.AddContainer(cont)
	'add method to get all records
	vm.SetMethod(Me, "SelectAll_ExpenseTypes")
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
	'show buttons for modExpenseTypes
	vm.HideItem("navExpenseTypes")
	'2. Show the page and hide others
	vm.ShowPage(Name)
	'load records to table
	vm.CallMethod("SelectAll_ExpenseTypes")
End Sub

'delete all records
Sub DeleteAll_ExpenseTypes
	Dim rsExpenseTypes As BANanoSQLiteE
	'initialize table for table creation
	rsExpenseTypes.Initialize("expenses.db", "expensetypes", "typeid", "typeid")
	rsExpenseTypes.DeleteAll
	rsExpenseTypes.JSON = BANano.CallInlinePHPWait(rsExpenseTypes.MethodName, rsExpenseTypes.Build)
	rsExpenseTypes.FromJSON
	'execute code to refresh listing for Expense Types
	vm.CallMethod("SelectAll_ExpenseTypes")
End Sub

'delete single record
Sub DeleteRecord_ExpenseTypes(RecordID As String)
	Dim rsExpenseTypes As BANanoSQLiteE
	'initialize table for deletion
	rsExpenseTypes.Initialize("expenses.db", "expensetypes", "typeid", "typeid")
	'define schema for record
	rsExpenseTypes.SchemaFromDesign(dlgExpenseTypes.Container)
	'generate & run command to delete single record
	rsExpenseTypes.Delete(RecordID)
	rsExpenseTypes.JSON = BANano.CallInlinePHPWait(rsExpenseTypes.MethodName, rsExpenseTypes.Build)
	rsExpenseTypes.FromJSON
	'execute code to refresh listing for Expense Types
	vm.CallMethod("SelectAll_ExpenseTypes")
End Sub

'select all records
Sub SelectAll_ExpenseTypes
	Dim rsExpenseTypes As BANanoSQLiteE
	'initialize table for table creation
	rsExpenseTypes.Initialize("expenses.db", "expensetypes", "typeid", "typeid")
	'generate & run command to select all records
	rsExpenseTypes.SelectAll(Array("*"), Array("typename"))
	rsExpenseTypes.JSON = BANano.CallInlinePHPWait(rsExpenseTypes.MethodName, rsExpenseTypes.Build)
	rsExpenseTypes.FromJSON
	'save records to state
	VM.SetData("expensetypes", rsExpenseTypes.Result)
	'update the data table records
	dtexpensetypes.SetDataSourceName("expensetypes")
End Sub

'expensetypes Edit action
Sub dtexpensetypes_edit(item As Map)
	'get the key
	Dim RecID As String = item.Get("typeid")
	If RecID = "" Then Return
	'set mode to E-dit
	Mode = "E"
	'read record from database
	Dim rsExpenseTypes As BANanoSQLiteE
	'initialize table for table creation
	rsExpenseTypes.Initialize("expenses.db", "expensetypes", "typeid", "typeid")
	'define schema for record
	rsExpenseTypes.SchemaFromDesign(dlgExpenseTypes.Container)
	'generate & run command to read record
	rsExpenseTypes.Read(RecID)
	rsExpenseTypes.JSON = BANano.CallInlinePHPWait(rsExpenseTypes.MethodName, rsExpenseTypes.Build)
	rsExpenseTypes.FromJSON
	'was the read successful?
	If rsExpenseTypes.Result.Size = 0 Then Return
	'the record as found!
	Dim Record As Map = rsExpenseTypes.result.get(0)
	'Update the dialog details
	dlgExpenseTypes.SetTitle("Edit Expense Type")
	'show the modal
	dlgExpenseTypes.Show
	'update the state, this updates the v-model(s) for each input control
	vm.SetState(Record)
End Sub


'expensetypes Delete action
Sub dtexpensetypes_delete(item As Map)
	'get the key
	Dim RecID As String = item.Get("typeid")
	If RecID = "" Then Return
	'save the id to delete
	vm.SetData("expensetypestypeid", RecID)
	'show confirm dialog
	Dim stypename As String = item.getdefault("typename","")
	vm.ShowConfirm("delete_expensetypes", "Confirm Delete: " & stypename, _
"Are you sure that you want to delete this Expense Type. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub


'add a new Expense Type
Sub AddExpenseTypes
	'set mode to A-add
	Mode = "A"
	'update the title
	dlgExpenseTypes.SetTitle("New Expense Type")
	'show dialog
	dlgExpenseTypes.Show
End Sub


'when add new is clicked
Sub btnNewExpenseType_click(e As BANanoEvent)
	AddExpenseTypes
End Sub

'create dialog
Sub CreateDialog_ExpenseTypes
	dlgExpenseTypes = vm.CreateDialog("dlgExpenseTypes", Me)
	dlgExpenseTypes.SetTitle("Expense Types")
	dlgExpenseTypes.SetOk("btnOkExpenseTypes","Save")
	dlgExpenseTypes.SetCancel("btnCancelExpenseTypes","Cancel")
	dlgExpenseTypes.Setwidth("700px")
	dlgExpenseTypes.Setpersistent(True)
	'*** Add code to create components below this line!
	Dim txttypeid As VMTextField = vm.NewTextField(Me, True, "txttypeid", "typeid", "#", "", False, "", 0, "", "", 0)
	txttypeid.SetFieldType("int")
	txttypeid.SetVisible(False)
	dlgExpenseTypes.Container.AddControl(txttypeid.textfield, txttypeid.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim txttypename As VMTextField = vm.NewTextField(Me, True, "txttypename", "typename", "Name", "", True, "", 0, "", "", 0)
	txttypename.SetFieldType("string")
	txttypename.SetOutlined(True)
	txttypename.SetAutoFocus(True)
	txttypename.SetVisible(True)
	dlgExpenseTypes.Container.AddControl(txttypename.textfield, txttypename.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	vm.AddDialog(dlgExpenseTypes)
End Sub

'add code to save the Expense Type
Sub btnOkExpenseTypes_click(e As BANanoEvent)
	'create/update record to table
	'get the record to create/update
	Dim Record As Map = dlgExpenseTypes.Container.GetData
	'validate the record
	Dim bValid As Boolean = vm.Validate(Record, dlgExpenseTypes.Container.Required)
	'if invalid exit create/update
	If bValid = False Then
		vm.ShowSnackBarError("The Expense Type could not be validated!")
		Return
	End If
	'resultset variable
	Dim rsExpenseTypes As BANanoSQLiteE
	'check mode
	Select Case Mode
		Case "A"
			Record.Put("typeid", Null)
			'initialize table for insert
			rsExpenseTypes.Initialize("expenses.db", "expensetypes", "typeid", "typeid")
			'define schema for record
			rsExpenseTypes.SchemaFromDesign(dlgExpenseTypes.Container)
			'insert a record
			rsExpenseTypes.Insert1(Record)
			'generate & run command to insert record
			rsExpenseTypes.JSON = BANano.CallInlinePHPWait(rsExpenseTypes.MethodName, rsExpenseTypes.Build)
			rsExpenseTypes.FromJSON
		Case "E"
			'read record id
			Dim RecID As String = Record.Get("typeid")
			'initialize table for edit
			rsExpenseTypes.Initialize("expenses.db", "expensetypes", "typeid", "typeid")
			'define schema for record
			rsExpenseTypes.SchemaFromDesign(dlgExpenseTypes.Container)
			'update a record
			rsExpenseTypes.Update1(Record, RecID)
			'generate & run command to update record
			rsExpenseTypes.JSON = BANano.CallInlinePHPWait(rsExpenseTypes.MethodName, rsExpenseTypes.Build)
			rsExpenseTypes.FromJSON
	End Select
	'hide the modal
	dlgExpenseTypes.Hide
	'execute code to refresh listing for Expense Types
	vm.CallMethod("SelectAll_ExpenseTypes")
End Sub

'add code to cancel the dialog for Expense Type
Sub btnCancelExpenseTypes_click(e As BANanoEvent)
	'hide the modal
	dlgExpenseTypes.Hide
End Sub

Sub CreateDataTable_expensetypes
	dtexpensetypes = vm.CreateDataTable("dtexpensetypes", "typeid", Me)
	dtexpensetypes.SetTitle("Expense Types")
	dtexpensetypes.SetSearchbox(True)
	dtexpensetypes.SetAddNew("btnNewExpenseType", "mdi-plus", "Add a new expense type")
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