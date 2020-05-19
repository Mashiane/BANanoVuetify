B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.27
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public Name As String = "ExpensesCode"
	Public Title As String = "Expenses"
	Private vm As BANanoVM
	Private BANano As BANano  'ignore
	Private dlgExpenses As VMDialog
	Private dtexpenses As VMDataTable
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
	CreateDataTable_expenses
	'add the dialog to page
	CreateDialog_Expenses
	'add the container to the page
	vm.AddContainer(cont)
	'add method to get all records
	vm.SetMethod(Me, "SelectAll_Expenses")
	vm.SetMethod(Me, "Load_expensecategories")
	vm.SetMethod(Me, "Load_expensetypes")
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
	'show buttons for modExpenses
	vm.HideItem("navExpenses")
	'2. Show the page and hide others
	vm.ShowPage(Name)
	'load records to table
	vm.CallMethod("SelectAll_Expenses")
End Sub

'delete all records
Sub DeleteAll_Expenses
	Dim rsExpenses As BANanoMySQLE
	'initialize table for table creation
	rsExpenses.Initialize("expenses", "expenses", "expid", "expid")
	rsExpenses.DeleteAll
	rsExpenses.JSON = BANano.CallInlinePHPWait(rsExpenses.MethodName, rsExpenses.Build)
	rsExpenses.FromJSON
	'execute code to refresh listing for Expenses
	vm.CallMethod("SelectAll_Expenses")
End Sub

'delete single record
Sub DeleteRecord_Expenses(RecordID As String)
	Dim rsExpenses As BANanoMySQLE
	'initialize table for deletion
	rsExpenses.Initialize("expenses", "expenses", "expid", "expid")
	'define schema for record
	rsExpenses.SchemaFromDesign(dlgExpenses.Container)
	'generate & run command to delete single record
	rsExpenses.Delete(RecordID)
	rsExpenses.JSON = BANano.CallInlinePHPWait(rsExpenses.MethodName, rsExpenses.Build)
	rsExpenses.FromJSON
	'execute code to refresh listing for Expenses
	vm.CallMethod("SelectAll_Expenses")
End Sub

'select all records
Sub SelectAll_Expenses
	Dim rsExpenses As BANanoMySQLE
	'initialize table for table creation
	rsExpenses.Initialize("expenses", "expenses", "expid", "expid")
	'generate & run command to select all records
	Dim strSQL As String = "SELECT expenses.expid,expenses.expdate,expenses.expcatid,expensecategories.catname,expenses.exptypeid,expensetypes.typename,expenses.expamount FROM expenses, expensecategories,expensetypes WHERE expenses.expcatid = expensecategories.catid AND expenses.exptypeid = expensetypes.typeid ORDER BY expenses.expdate,expensecategories.catname,expensetypes.typename,expenses.expamount"
	rsExpenses.Execute(strSQL)
	rsExpenses.JSON = BANano.CallInlinePHPWait(rsExpenses.MethodName, rsExpenses.Build)
	rsExpenses.FromJSON
	'save records to state
	VM.SetData("expenses", rsExpenses.Result)
	'update the data table records
	dtexpenses.SetDataSourceName("expenses")
End Sub

'expenses Edit action
Sub dtexpenses_edit(item As Map)
	'get the key
	Dim RecID As String = item.Get("expid")
	If RecID = "" Then Return
	'set mode to E-dit
	Mode = "E"
	vm.CallMethod("Load_expensecategories")
	vm.CallMethod("Load_expensetypes")
	'read record from database
	Dim rsExpenses As BANanoMySQLE
	'initialize table for table creation
	rsExpenses.Initialize("expenses", "expenses", "expid", "expid")
	'define schema for record
	rsExpenses.SchemaFromDesign(dlgExpenses.Container)
	'generate & run command to read record
	rsExpenses.Read(RecID)
	rsExpenses.JSON = BANano.CallInlinePHPWait(rsExpenses.MethodName, rsExpenses.Build)
	rsExpenses.FromJSON
	'was the read successful?
	If rsExpenses.Result.Size = 0 Then Return
	'the record as found!
	Dim Record As Map = rsExpenses.result.get(0)
	'Update the dialog details
	dlgExpenses.SetTitle("Edit Expense")
	'show the modal
	dlgExpenses.Show
	'update the state, this updates the v-model(s) for each input control
	vm.SetState(Record)
End Sub


'expenses Delete action
Sub dtexpenses_delete(item As Map)
	'get the key
	Dim RecID As String = item.Get("expid")
	If RecID = "" Then Return
	'save the id to delete
	vm.SetData("expensesexpid", RecID)
	'show confirm dialog
	Dim sexpid As String = item.getdefault("expid","")
	vm.ShowConfirm("delete_expenses", "Confirm Delete: " & sexpid, _
"Are you sure that you want to delete this Expense. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub


'expenses Clone action
Sub dtexpenses_clone(item As Map)
	'get the key
	Dim RecID As String = item.Get("expid")
	If RecID = "" Then Return
	'set mode to A-dd
	Mode = "A"
	vm.CallMethod("Load_expensecategories")
	vm.CallMethod("Load_expensetypes")
	'read existing record from database
	Dim rsExpenses As BANanoMySQLE
	'initialize table for table creation
	rsExpenses.Initialize("expenses", "expenses", "expid", "expid")
	'define schema for record
	rsExpenses.SchemaFromDesign(dlgExpenses.Container)
	'generate & run command to read record
	rsExpenses.Read(RecID)
	rsExpenses.JSON = BANano.CallInlinePHPWait(rsExpenses.MethodName, rsExpenses.Build)
	rsExpenses.FromJSON
	'was the read successful?
	If rsExpenses.Result.Size = 0 Then Return
	'the record as found!
	Dim Record As Map = rsExpenses.Result.Get(0)
	'nullify key
	Record.put("expid", Null)
	'Update the dialog details
	dlgExpenses.SetTitle("New Expense")
	'show the modal
	dlgExpenses.Show
	'update the state, this updates the v-model(s) for each input control
	vm.SetState(Record)
End Sub


'add a new Expense
Sub AddExpenses
	'set mode to A-add
	Mode = "A"
	vm.CallMethod("Load_expensecategories")
	vm.CallMethod("Load_expensetypes")
	'update the title
	dlgExpenses.SetTitle("New Expense")
	'show dialog
	dlgExpenses.Show
End Sub


'when add new is clicked
Sub btnNewExpense_click(e As BANanoEvent)
	AddExpenses
End Sub

'create dialog
Sub CreateDialog_Expenses
	dlgExpenses = vm.CreateDialog("dlgExpenses", Me)
	dlgExpenses.SetTitle("Expenses")
	dlgExpenses.SetOk("btnOkExpenses","Save")
	dlgExpenses.SetCancel("btnCancelExpenses","Cancel")
	dlgExpenses.Setwidth("700px")
	dlgExpenses.Setpersistent(True)
	'*** Add code to create components below this line!
	Dim txtexpid As VMTextField = vm.NewTextField(Me, True, "txtexpid", "expid", "#", "", False, "", 0, "", "", 0)
	txtexpid.SetFieldType("int")
	txtexpid.SetVisible(False)
	dlgExpenses.Container.AddControl(txtexpid.textfield, txtexpid.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim dpexpdate As VMDateTimePicker = vm.NewDatePicker(Me, True, "dpexpdate", "expdate", "Date", True, "", "", "", 0)
	dpexpdate.SetFieldType("string")
	dpexpdate.SetVisible(True)
	dpexpdate.SetAutoFocus(True)
	dpexpdate.SetFirstDayOfWeek("0")
	dpexpdate.SetOnChange(Me, "dpexpdate_change")
	dlgExpenses.Container.AddControl(dpexpdate.DateTimePicker, dpexpdate.tostring, 2, 1, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim selexpcatid As VMSelect = vm.NewSelectDataSource(Me, True, "selexpcatid", "expcatid", "Category", True, False, "", "expensecategories", "catid", "catname", False, "", "", 0)
	selexpcatid.SetFieldType("int")
	selexpcatid.SetVisible(True)
	selexpcatid.SetOnChange(Me, "selexpcatid_change")
	dlgExpenses.Container.AddControl(selexpcatid.Combo, selexpcatid.tostring, 2, 2, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim selexptypeid As VMSelect = vm.NewSelectDataSource(Me, True, "selexptypeid", "exptypeid", "Type", True, False, "", "expensetypes", "typeid", "typename", False, "", "", 0)
	selexptypeid.SetFieldType("int")
	selexptypeid.SetVisible(True)
	selexptypeid.SetOnChange(Me, "selexptypeid_change")
	dlgExpenses.Container.AddControl(selexptypeid.Combo, selexptypeid.tostring, 3, 1, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim telexpamount As VMTextField = vm.NewTel(Me, True, "telexpamount", "expamount", "Amount", "", True, "", "", "", 0)
	telexpamount.SetFieldType("dbl")
	telexpamount.SetVisible(True)
	dlgExpenses.Container.AddControl(telexpamount.textfield, telexpamount.tostring, 3, 2, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim txtaexpdesc As VMTextField = vm.NewTextArea(Me, True, "txtaexpdesc", "expdesc", "Description", "", False, False, "", 0, "", "", 0)
	txtaexpdesc.SetFieldType("string")
	txtaexpdesc.SetVisible(True)
	dlgExpenses.Container.AddControl(txtaexpdesc.TextField, txtaexpdesc.tostring, 4, 1, 0, 0, 0, 0, 12, 12, 12, 12)


	vm.AddDialog(dlgExpenses)
End Sub

'add code to save the Expense
Sub btnOkExpenses_click(e As BANanoEvent)
	'create/update record to table
	'get the record to create/update
	Dim Record As Map = dlgExpenses.Container.GetData
	'validate the record
	Dim bValid As Boolean = vm.Validate(Record, dlgExpenses.Container.Required)
	'if invalid exit create/update
	If bValid = False Then
		vm.ShowSnackBarError("The Expense could not be validated!")
		Return
	End If
	'resultset variable
	Dim rsExpenses As BANanoMySQLE
	'check mode
	Select Case Mode
		Case "A"
			'initialize table for insert
			rsExpenses.Initialize("expenses", "expenses", "expid", "expid")
			'define schema for record
			rsExpenses.SchemaFromDesign(dlgExpenses.Container)
			'insert a record
			rsExpenses.Insert1(Record)
			'generate & run command to insert record
			rsExpenses.JSON = BANano.CallInlinePHPWait(rsExpenses.MethodName, rsExpenses.Build)
			rsExpenses.FromJSON
		Case "E"
			'read record id
			Dim RecID As String = Record.Get("expid")
			'initialize table for edit
			rsExpenses.Initialize("expenses", "expenses", "expid", "expid")
			'define schema for record
			rsExpenses.SchemaFromDesign(dlgExpenses.Container)
			'update a record
			rsExpenses.Update1(Record, RecID)
			'generate & run command to update record
			rsExpenses.JSON = BANano.CallInlinePHPWait(rsExpenses.MethodName, rsExpenses.Build)
			rsExpenses.FromJSON
	End Select
	'hide the modal
	dlgExpenses.Hide
	'execute code to refresh listing for Expenses
	vm.CallMethod("SelectAll_Expenses")
End Sub

'add code to cancel the dialog for Expense
Sub btnCancelExpenses_click(e As BANanoEvent)
	'hide the modal
	dlgExpenses.Hide
End Sub

'load records for expensecategories
Sub Load_expensecategories
	Dim rsexpensecategories As BANanoMySQLE
	'initialize table for reading
	rsexpensecategories.Initialize("expenses", "expensecategories", "catid", "expid")
	'generate & run command to select records
	rsexpensecategories.SelectAll(Array("catid","catname"), Array("catname"))
	rsexpensecategories.JSON = BANano.CallInlinePHPWait(rsexpensecategories.MethodName, rsexpensecategories.Build)
	rsexpensecategories.FromJSON
	vm.SetData("expensecategories", rsexpensecategories.Result)
End Sub
'load records for expensetypes
Sub Load_expensetypes
	Dim rsexpensetypes As BANanoMySQLE
	'initialize table for reading
	rsexpensetypes.Initialize("expenses", "expensetypes", "typeid", "expid")
	'generate & run command to select records
	rsexpensetypes.SelectAll(Array("typeid","typename"), Array("typename"))
	rsexpensetypes.JSON = BANano.CallInlinePHPWait(rsexpensetypes.MethodName, rsexpensetypes.Build)
	rsexpensetypes.FromJSON
	vm.SetData("expensetypes", rsexpensetypes.Result)
End Sub

Sub CreateDataTable_expenses
	dtexpenses = vm.CreateDataTable("dtexpenses", "expid", Me)
	dtexpenses.SetTitle("Expenses")
	dtexpenses.SetSearchbox(True)
	dtexpenses.SetAddNew("btnNewExpense", "mdi-plus", "Add a new expense")
	vm.setdata("expenses", vm.newlist)
	dtexpenses.SetDatasourcename("expenses")
	dtexpenses.SetItemsperpage("10")
	dtexpenses.SetMobilebreakpoint("600")
	dtexpenses.SetMultisort(True)
	dtexpenses.SetPage("1")
	dtexpenses.SetSingleselect(True)
	dtexpenses.SetVisible(True)
	dtexpenses.AddColumn1("expid", "#", "text",0,False,"start")
	dtexpenses.AddColumn1("expdate", "Date", "text",0,True,"start")
	dtexpenses.AddColumn1("catname", "Category", "text",0,True,"start")
	dtexpenses.AddColumn1("typename", "Type", "text",0,True,"start")
	dtexpenses.AddColumn1("expamount", "Amount", "money",0,True,"end")
	dtexpenses.SetEdit(True)
	dtexpenses.SetDelete(True)
	dtexpenses.SetClone(True)
	cont.AddControl(dtexpenses.DataTable, dtexpenses.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
End Sub
