B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public Name As String = "expensecategoriesCode"
	Public Title As String = "Expense Categories"
	Private vm As BANanoVM
	Private BANano As BANano  'ignore
	Private dlgexpensecategories As VMDialog
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
	CreateDialog_Expensecategories
	'add the container to the page
	vm.AddContainer(cont)
	'add method to get all records
	vm.SetMethod(Me, "SelectAll_Expensecategories")
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
	'show buttons for modExpenseCategory
	vm.HideItem("navExpenseCategory")
	'2. Show the page and hide others
	vm.ShowPage(Name)
	'load records to table
	vm.CallMethod("SelectAll_Expensecategories")
End Sub

'delete all records
Sub DeleteAll_Expensecategories
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("expenses", "expenses")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for deletion
	alaSQL.Initialize("expensecategories", "catid")
	'generate & run command to delete all records
	alaSQL.DeleteAll
	alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)
	alaSQL.FromJSON
	'execute code to refresh listing for ExpenseCategory
	vm.CallMethod("SelectAll_Expensecategories")
End Sub

'delete single record
Sub DeleteRecord_Expensecategories(RecordID As String)
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("expenses", "expenses")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for deletion
	alaSQL.Initialize("expensecategories", "catid")
	'define schema for record
	alaSQL.SchemaFromDesign(dlgexpensecategories.Container)
	'generate & run command to delete single record
	alaSQL.Delete(RecordID)
	alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)
	alaSQL.FromJSON
	'execute code to refresh listing for ExpenseCategory
	vm.CallMethod("SelectAll_Expensecategories")
End Sub

'select all records
Sub SelectAll_Expensecategories
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("expenses", "expenses")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for reading
	alaSQL.Initialize("expensecategories", "catid")
	'generate & run command to select all records
	alaSQL.SelectAll(Array("*"), Array("catname"))
	alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
	alaSQL.FromJSON
	'save records to state
	vm.SetData("expensecategories", alaSQL.Result)
	'update the data table records
	dtexpensecategories.SetDataSourceName("expensecategories")
End Sub

'expensecategories Edit action
Sub dtexpensecategories_edit(item As Map)
	'get the key
	Dim RecID As String = item.Get("catid")
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
	alaSQL.Initialize("expensecategories", "catid")
	'define schema for record
	alaSQL.SchemaFromDesign(dlgexpensecategories.Container)
	'generate & run command to read record
	alaSQL.Read(RecID)
	alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
	alaSQL.FromJSON
	'was the read successful?
	If alaSQL.Result.Size = 0 Then Return
	'the record as found!
	Dim Record As Map = alaSQL.result.get(0)
	'Update the dialog details
	dlgexpensecategories.SetTitle("Edit Expense Category")
	'show the modal
	dlgexpensecategories.Show
	'update the state, this updates the v-model(s) for each input control
	vm.SetState(Record)
End Sub


'expensecategories Delete action
Sub dtexpensecategories_delete(item As Map)
	'get the key
	Dim RecID As String = item.Get("catid")
	Dim scatname As String = item.Get("catname")
	'save the id to delete
	vm.SetData("expensecategoriescatid", RecID)
	'show confirm dialog
	vm.ShowConfirm("delete_expensecategories", "Confirm Delete: " & scatname, _
"Are you sure that you want to delete this expense category. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub


'add a new expense category
Sub Addexpensecategories
	'set mode to A-add
	Mode = "A"
	'update the title
	dlgexpensecategories.SetTitle("New Expense Category")
	'show dialog
	dlgexpensecategories.Show
End Sub


'when add new is clicked
Sub btnNewExpensecategory_click(e As BANanoEvent)
	Addexpensecategories
End Sub

'create dialog
Sub CreateDialog_Expensecategories
	dlgexpensecategories = vm.CreateDialog("dlgexpensecategories", Me)
	dlgexpensecategories.SetTitle("Expense Categories")
	dlgexpensecategories.SetOk("btnOkexpensecategories","Save")
	dlgexpensecategories.SetCancel("btnCancelexpensecategories","Cancel")
	dlgexpensecategories.Setwidth("700px")
	dlgexpensecategories.Setpersistent(True)
	Dim txtcatid As VMTextField = vm.NewTextField(Me, True, "txtcatid", "catid", "#", "", False, "", 0, "", "", 0)
	txtcatid.SetFieldType("int")
	txtcatid.SetVisible(False)
	dlgexpensecategories.Container.AddControl(txtcatid.textfield, txtcatid.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim txtcatname As VMTextField = vm.NewTextField(Me, True, "txtcatname", "catname", "Name", "", True, "", 0, "", "", 0)
	txtcatname.SetFieldType("string")
	txtcatname.SetVisible(True)
	txtcatname.SetOutlined(True)
	txtcatname.SetAutoFocus(True)
	dlgexpensecategories.Container.AddControl(txtcatname.textfield, txtcatname.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	vm.AddDialog(dlgexpensecategories)
End Sub

'add code to save the expense category
Sub btnOkexpensecategories_click(e As BANanoEvent)
	'create/update record to table
	'get the record to create/update
	Dim Record As Map = dlgexpensecategories.Container.GetData
	'validate the record
	Dim bValid As Boolean = vm.Validate(Record, dlgexpensecategories.Container.Required)
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
			alaSQL.Initialize("expensecategories", "catid")
			alaSQL.GetMax
			alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)
			alaSQL.FromJSON
			nextID = alaSQL.GetNextID
			'update the record with the next id
			Record.Put("catid", nextID)
			'initialize table for insert
			alaSQL.Initialize("expensecategories", "catid")
			'define schema for record
			alaSQL.SchemaFromDesign(dlgexpensecategories.Container)
			'insert a record
			alaSQL.Insert1(Record)
			'generate & run command to insert record
			alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
			alaSQL.FromJSON
		Case "E"
			'read record id
			Dim RecID As String = Record.Get("catid")
			'initialize table for edit
			alaSQL.Initialize("expensecategories", "catid")
			'define schema for record
			alaSQL.SchemaFromDesign(dlgexpensecategories.Container)
			'prepare record for database
			alaSQL.RecordFromMap(Record)
			'update a record
			alaSQL.Update1(Record, RecID)
			'generate & run command to update record
			alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
			alaSQL.FromJSON
	End Select
	'hide the modal
	dlgexpensecategories.Hide
	'execute code to refresh listing for ExpenseCategory
	vm.CallMethod("SelectAll_Expensecategories")
End Sub

'add code to cancel the dialog for expense category
Sub btnCancelexpensecategories_click(e As BANanoEvent)
	'hide the modal
	dlgexpensecategories.Hide
End Sub

Sub CreateDataTable_expensecategories
	dtexpensecategories = vm.CreateDataTable("dtexpensecategories", "catid", Me)
	dtexpensecategories.SetTitle("Expense Categories")
	dtexpensecategories.SetSearchbox(True)
	dtexpensecategories.SetAddNew("btnNewExpensecategory", "mdi-plus", "Add a new expense category")
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