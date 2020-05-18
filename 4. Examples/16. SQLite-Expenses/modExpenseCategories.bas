B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.27
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public Name As String = "ExpenseCategoriesCode"
	Public Title As String = "Expense Categories"
	Private vm As BANanoVM
	Private BANano As BANano  'ignore
	Private dlgExpenseCategories As VMDialog
	Private dtexpensecategories As VMDataTable
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
	CreateDataTable_expensecategories
	'add the dialog to page
	CreateDialog_ExpenseCategories
	'add the container to the page
	vm.AddContainer(cont)
	'add method to get all records
	vm.SetMethod(Me, "SelectAll_ExpenseCategories")
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
	'show buttons for modExpenseCategories
	vm.HideItem("navExpenseCategories")
	'2. Show the page and hide others
	vm.ShowPage(Name)
	'load records to table
	vm.CallMethod("SelectAll_ExpenseCategories")
End Sub

'delete all records
Sub DeleteAll_ExpenseCategories
	Dim rsExpenseCategories As BANanoSQLiteE
	'initialize table for table creation
	rsExpenseCategories.Initialize("expenses.db", "expensecategories", "catid", "catid")
	rsExpenseCategories.DeleteAll
	rsExpenseCategories.JSON = BANano.CallInlinePHPWait(rsExpenseCategories.MethodName, rsExpenseCategories.Build)
	rsExpenseCategories.FromJSON
	'execute code to refresh listing for Expense Categories
	vm.CallMethod("SelectAll_ExpenseCategories")
End Sub

'delete single record
Sub DeleteRecord_ExpenseCategories(RecordID As String)
	Dim rsExpenseCategories As BANanoSQLiteE
	'initialize table for deletion
	rsExpenseCategories.Initialize("expenses.db", "expensecategories", "catid", "catid")
	'define schema for record
	rsExpenseCategories.SchemaFromDesign(dlgExpenseCategories.Container)
	'generate & run command to delete single record
	rsExpenseCategories.Delete(RecordID)
	rsExpenseCategories.JSON = BANano.CallInlinePHPWait(rsExpenseCategories.MethodName, rsExpenseCategories.Build)
	rsExpenseCategories.FromJSON
	'execute code to refresh listing for Expense Categories
	vm.CallMethod("SelectAll_ExpenseCategories")
End Sub

'select all records
Sub SelectAll_ExpenseCategories
	Dim rsExpenseCategories As BANanoSQLiteE
	'initialize table for table creation
	rsExpenseCategories.Initialize("expenses.db", "expensecategories", "catid", "catid")
	'generate & run command to select all records
	rsExpenseCategories.SelectAll(Array("*"), Array("catname"))
	rsExpenseCategories.JSON = BANano.CallInlinePHPWait(rsExpenseCategories.MethodName, rsExpenseCategories.Build)
	rsExpenseCategories.FromJSON
	'save records to state
	vm.SetData("expensecategories", rsExpenseCategories.Result)
	'update the data table records
	dtexpensecategories.SetDataSourceName("expensecategories")
End Sub

'expensecategories Edit action
Sub dtexpensecategories_edit(item As Map)
	'get the key
	Dim RecID As String = item.Get("catid")
	If RecID = "" Then Return
	'set mode to E-dit
	Mode = "E"
	'read record from database
	Dim rsExpenseCategories As BANanoSQLiteE
	'initialize table for table creation
	rsExpenseCategories.Initialize("expenses.db", "expensecategories", "catid", "catid")
	'define schema for record
	rsExpenseCategories.SchemaFromDesign(dlgExpenseCategories.Container)
	'generate & run command to read record
	rsExpenseCategories.Read(RecID)
	rsExpenseCategories.JSON = BANano.CallInlinePHPWait(rsExpenseCategories.MethodName, rsExpenseCategories.Build)
	rsExpenseCategories.FromJSON
	'was the read successful?
	If rsExpenseCategories.Result.Size = 0 Then Return
	'the record as found!
	Dim Record As Map = rsExpenseCategories.result.get(0)
	'Update the dialog details
	dlgExpenseCategories.SetTitle("Edit Expense Category")
	'show the modal
	dlgExpenseCategories.Show
	'update the state, this updates the v-model(s) for each input control
	vm.SetState(Record)
End Sub


'expensecategories Delete action
Sub dtexpensecategories_delete(item As Map)
	'get the key
	Dim RecID As String = item.Get("catid")
	If RecID = "" Then Return
	'save the id to delete
	vm.SetData("expensecategoriescatid", RecID)
	'show confirm dialog
	Dim scatname As String = item.getdefault("catname","")
	vm.ShowConfirm("delete_expensecategories", "Confirm Delete: " & scatname, _
"Are you sure that you want to delete this Expense Category. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub


'add a new Expense Category
Sub AddExpenseCategories
	'set mode to A-add
	Mode = "A"
	'update the title
	dlgExpenseCategories.SetTitle("New Expense Category")
	'show dialog
	dlgExpenseCategories.Show
End Sub


'when add new is clicked
Sub btnNewExpenseCategory_click(e As BANanoEvent)
	AddExpenseCategories
End Sub

'create dialog
Sub CreateDialog_ExpenseCategories
	dlgExpenseCategories = vm.CreateDialog("dlgExpenseCategories", Me)
	dlgExpenseCategories.SetTitle("Expense Categories")
	dlgExpenseCategories.SetOk("btnOkExpenseCategories","Save")
	dlgExpenseCategories.SetCancel("btnCancelExpenseCategories","Cancel")
	dlgExpenseCategories.Setwidth("700px")
	dlgExpenseCategories.Setpersistent(True)
	'*** Add code to create components below this line!
	Dim txtcatid As VMTextField = vm.NewTextField(Me, True, "txtcatid", "catid", "#", "", False, "", 0, "", "", 0)
	txtcatid.SetFieldType("int")
	txtcatid.SetVisible(False)
	dlgExpenseCategories.Container.AddControl(txtcatid.textfield, txtcatid.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim txtcatname As VMTextField = vm.NewTextField(Me, True, "txtcatname", "catname", "Name", "", True, "", 0, "", "", 0)
	txtcatname.SetFieldType("string")
	txtcatname.SetOutlined(True)
	txtcatname.SetAutoFocus(True)
	txtcatname.SetVisible(True)
	dlgExpenseCategories.Container.AddControl(txtcatname.textfield, txtcatname.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)



	vm.AddDialog(dlgExpenseCategories)
End Sub

'add code to save the Expense Category
Sub btnOkExpenseCategories_click(e As BANanoEvent)
	'create/update record to table
	'get the record to create/update
	Dim Record As Map = dlgExpenseCategories.Container.GetData
	'validate the record
	Dim bValid As Boolean = vm.Validate(Record, dlgExpenseCategories.Container.Required)
	'if invalid exit create/update
	If bValid = False Then
		vm.ShowSnackBarError("The Expense Category could not be validated!")
		Return
	End If
	'resultset variable
	Dim rsExpenseCategories As BANanoSQLiteE
	'check mode
	Select Case Mode
		Case "A"
			'initialize table for insert
			rsExpenseCategories.Initialize("expenses.db", "expensecategories", "catid", "catid")
			'define schema for record
			rsExpenseCategories.SchemaFromDesign(dlgExpenseCategories.Container)
			'insert a record
			Record.put("catid", Null)
			rsExpenseCategories.Insert1(Record)
			'generate & run command to insert record
			rsExpenseCategories.JSON = BANano.CallInlinePHPWait(rsExpenseCategories.MethodName, rsExpenseCategories.Build)
			rsExpenseCategories.FromJSON
		Case "E"
			'read record id
			Dim RecID As String = Record.Get("catid")
			rsExpenseCategories.Initialize("expenses.db", "expensecategories", "catid", "catid")
			'define schema for record
			rsExpenseCategories.SchemaFromDesign(dlgExpenseCategories.Container)
			'update a record
			rsExpenseCategories.Update1(Record, RecID)
			'generate & run command to update record
			rsExpenseCategories.JSON = BANano.CallInlinePHPWait(rsExpenseCategories.MethodName, rsExpenseCategories.Build)
			rsExpenseCategories.FromJSON
	End Select
	'hide the modal
	dlgExpenseCategories.Hide
	'execute code to refresh listing for Expense Categories
	vm.CallMethod("SelectAll_ExpenseCategories")
End Sub

'add code to cancel the dialog for Expense Category
Sub btnCancelExpenseCategories_click(e As BANanoEvent)
	'hide the modal
	dlgExpenseCategories.Hide
End Sub

Sub CreateDataTable_expensecategories
	dtexpensecategories = vm.CreateDataTable("dtexpensecategories", "catid", Me)
	dtexpensecategories.SetTitle("Expense Categories")
	dtexpensecategories.SetSearchbox(True)
	dtexpensecategories.SetAddNew("btnNewExpenseCategory", "mdi-plus", "Add a new expense category")
	vm.setdata("expensecategories", vm.newlist)
	dtexpensecategories.SetDatasourcename("expensecategories")
	dtexpensecategories.SetItemsperpage("10")
	dtexpensecategories.SetMobilebreakpoint("600")
	dtexpensecategories.SetMultisort(True)
	dtexpensecategories.SetPage("1")
	dtexpensecategories.SetSingleselect(True)
	dtexpensecategories.SetVisible(True)
	dtexpensecategories.AddColumn1("catid", "#", "text",0,False,"start")
	dtexpensecategories.AddColumn1("catname", "Name", "text",0,True,"start")
	dtexpensecategories.SetEdit(True)
	dtexpensecategories.SetDelete(True)
	cont.AddControl(dtexpensecategories.DataTable, dtexpensecategories.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
End Sub