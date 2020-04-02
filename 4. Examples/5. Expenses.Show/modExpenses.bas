B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "expensescode"
	Public Mode As String
	Public mdlExpenses As VMDialog
	Private BANano As BANano
	Private expenses As VMDataTable
	Private ef As VMContainer
End Sub

Sub Code
	Log("modExpenses.Code")
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 1 columns each spanning 12 columns
	cont.AddRows(2).AddColumns12
	'
	ef = ExpenseFilter
	cont.AddComponent(1,1,ef.tostring)
	
	expenses = vm.CreateDataTable("expensetable", "id", Me)
	expenses.SetTitle("Expenses")
	expenses.AddSearch
	expenses.AddNew("btnNewExpense", "mdi-plus", "Add a new expense")
	expenses.AddColumn("expense_date","Date")   
	expenses.AddColumn("expense_category","Category")
	expenses.AddColumn("expense_type","Type")   
	expenses.AddColumn("expense_description","Description")  
	expenses.AddColumn("expense_amount","Amount")
	expenses.AddEditThrash
	expenses.AddClone
	expenses.SetMoneyColumns(Array("expense_amount"))
	expenses.SetDataSource(Array())
	cont.AddComponent(2,1, expenses.tostring)
	
	'add container to the page content
	vm.AddContainer(cont)
	'
	'create a modal to add an expense type
	mdlExpenses = vm.CreateDialog("mdlExpenses",Me)
	mdlExpenses.settitle("New Expense")
	mdlExpenses.AddCancel("btnCancelExpense", "Cancel")
	mdlExpenses.AddOK("btnSaveExpense", "Save")
	'
	Dim expense_id As VMTextField = vm.NewText(Me, True, "txtexpid", "id", "#","",False,"",0,"","",0).SetVisible(False).SetInt
	Dim expense_date As VMDateTimePicker = vm.NewDatePicker(Me, True, "txtexpdate", "expense_date", "Date", True, "","","The expense date should be specified!",0)
	Dim expense_category As VMSelect = vm.NewSelectDataSource(Me, True, "txtexpcategory","expense_category","Category",True,False,"","categories","id","text",False,"","The category should be specified!",0).SetInt
	Dim expense_type As VMSelect = vm.NewSelectDataSource(Me, True, "txtexptype","expense_type","Type",True,False,"","types","id","text",False,"","The type should be specified!",0).SetInt
	Dim expense_amount As VMTextField = vm.NewTel(Me, True, "txtexpamount", "expense_amount", "Amount", "", True, "", "","The amount should be specified!",0).SetDouble
	Dim expense_description As VMTextField = vm.NewTextArea(Me, True, "txtexpdescription", "expense_description", "Description", "", False, False, "",100, "","",0)
	'
	mdlExpenses.Container.AddControl(expense_id.TextField,expense_id.ToString, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	mdlExpenses.Container.AddControl(expense_date.DateTimePicker, expense_date.ToSTring, 2, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	mdlExpenses.Container.AddControl(expense_category.Combo, expense_category.ToSTring, 2, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	mdlExpenses.Container.AddControl(expense_type.Combo, expense_type.ToString, 3, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	mdlExpenses.Container.AddControl(expense_amount.TextField,expense_amount.ToString, 3, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	mdlExpenses.Container.AddControl(expense_description.TextField, expense_description.ToString, 4, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	'
	mdlExpenses.SetWidth("700px")
	vm.AddDialog(mdlExpenses)
	
End Sub

Sub ExpenseFilter As VMContainer
	Dim ec As VMContainer = vm.CreateContainer("ec", Me)
	'
	Dim dpstartdate As VMDateTimePicker = vm.NewDatePicker(Me, True, "dpstartdate", "startdate", "Start Date", True, "", "", "", 0).SetClearable(True)
	ec.AddControl(dpstartdate.DateTimePicker, dpstartdate.tostring, 1, 1, 0, 0, 0, 0, 12, 2, 2, 2)

	Dim dpfinishdate As VMDateTimePicker = vm.NewDatePicker(Me, True, "dpfinishdate", "finishdate", "Finish Date", True, "", "", "", 0).SetClearable(True)
	ec.AddControl(dpfinishdate.DateTimePicker, dpfinishdate.tostring, 1, 2, 0, 0, 0, 0, 12, 2, 2, 2)

	Dim cbocategory As VMSelect = vm.NewComboDataSource(Me, True, "cbocategory", "category", "Category", True, True, "", "categories", "id", "text", True, "", "", 0)
	cbocategory.SetSmallChips(True).SetClearable(True).SetDeletablechips(True)
	ec.AddControl(cbocategory.Combo, cbocategory.tostring, 1, 3, 0, 0, 0, 0, 12, 2, 2, 2)

	Dim cboexpensetype As VMSelect = vm.NewComboDataSource(Me, True, "cboexpensetype", "expensetype", "Type", True, True, "", "types", "id", "text", True, "", "", 0)
	cboexpensetype.setsmallchips(True).SetClearable(True).SetDeletablechips(True)
	ec.AddControl(cboexpensetype.Combo, cboexpensetype.tostring, 1, 4, 0, 0, 0, 0, 12, 2, 2, 2)

	Dim btnbtnApplyFilter As VMButton = vm.NewButton(Me, True, "btnApplyFilter", "Apply", True, False, False, True)
	btnbtnApplyFilter.SetTooltip("Apply filter")
	btnbtnApplyFilter.SetColorIntensity("green", "darken-1")
	ec.AddControl(btnbtnApplyFilter.Button, btnbtnApplyFilter.tostring, 1, 5, 0, 0, 0, 0, 12, 2, 2, 2)

	Dim btnbtnResetFilter As VMButton = vm.NewButton(Me, True, "btnResetFilter", "Reset", True, False, False, True)
	btnbtnResetFilter.SetTooltip("Reset filter")
	btnbtnResetFilter.SetColorIntensity("red", "darken-1")
	ec.AddControl(btnbtnResetFilter.Button, btnbtnResetFilter.tostring, 1, 6, 0, 0, 0, 0, 12, 2, 2, 2)

	Return ec
End Sub

'apply a filter to the records
Sub btnApplyFilter_click(e As BANanoEvent)
	Dim sstartdate As String = vm.getdata("startdate")
	Dim sfinishdate As String = vm.getdata("finishdate")
	Dim lcategory As List = vm.getdata("category")
	Dim lexpensetype As List = vm.getdata("expensetype")
	'
	If sstartdate = "" Then
		vm.ShowSnackBar("Start date should be specified!")
		Return
	End If
	'
	If sfinishdate = "" Then
		vm.ShowSnackBar("Finish date should be specified!")
		Return
	End If
	'
	If lcategory.size = 0 Then
		vm.ShowSnackBar("Category should be specified!")
		Return
	End If
	'
	If lexpensetype.size = 0 Then
		vm.ShowSnackBar("Expense type should be specified!")
		Return
	End If
	
	'get the ids, we have returned objects
	Dim kc As List = vm.GetListOfMapsProperty(lcategory, "id")
	Dim kt As List = vm.GetListOfMapsProperty(lexpensetype, "id")
	
	' join for query
	Dim scat As String = vm.Join(",", kc)
	Dim styp As String = vm.join(",", kt)
	'
	vm.pagepause
	Dim qry As String = "select expenses.id, expenses.expense_date, expenses.expense_description, expenses.expense_amount, expensecategories.text as expense_category,"
	qry = qry & "expensetypes.text As expense_type from expenses, expensecategories, expensetypes where expenses.expense_category = expensecategories.id and expenses.expense_type = "
	qry = qry & $"expensetypes.id and expenses.expense_date >= '${sstartdate}' and expenses.expense_date <= '${sfinishdate}' and expensecategories.id in (${scat}) and expensetypes.id in (${styp}) order by expenses.expense_date desc"$
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.Execute(qry)
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		expenses.SetDataSource(dbsql.result)
	Else
		Log("modExpenses.btnApplyFilter: Error - " & dbsql.error)
	End If
	vm.pageresume
End Sub

'reset the filter
Sub btnResetFilter_click(e As BANanoEvent)
	vm.pagepause
	Dim mp As Map = CreateMap()
	mp.put("startdate", Null)
	mp.put("finishdate", Null)
	mp.put("category", Array())
	mp.put("expensetype", Array())
	vm.setstate(mp)
	Refresh
	vm.pageresume
End Sub

Sub btnCancelExpense_click(e As BANanoEvent)
	vm.hidedialog("mdlExpenses")
End Sub

Sub btnSaveExpense_click(e As BANanoEvent)
	'get the data
	Dim Expense As Map = mdlExpenses.Container.GetData
	'validate the data
	Dim bValid As Boolean = vm.Validate(Expense, mdlExpenses.Container.Required)
	If bValid = False Then Return
	'
	'expense is valid
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.SchemaFromDesign(mdlExpenses.Container)
	dbsql.RecordFromMap(Expense)
	Select Case Mode
	Case "A"
		dbsql.Insert
		dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
		dbsql.FromJSON
		If dbsql.OK Then
			vm.ShowSnackBar("Expense added successfully!")
			vm.HideDialog("mdlExpenses")
			Refresh
		Else
			Log("modExpenses.btnSaveExpense_click: Error - " & dbsql.error)
			vm.ShowSnackBar(dbsql.error)
		End If
	Case "E"
		Dim sid As String = Expense.Get("id")
		dbsql.Update(sid)
		dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
		dbsql.FromJSON
		If dbsql.OK Then
			vm.ShowSnackBar("Expense updated successfully!")
			vm.HideDialog("mdlExpenses")
			Refresh
		Else
			Log("modExpenses.btnSaveExpense_click: Error - " & dbsql.error)
			vm.ShowSnackBar(dbsql.error)
		End If
	End Select
End Sub

'a button to add a new record is clicked
Sub Add
	Mode = "A"
	vm.CallMethod("LoadTypes")
	vm.CallMethod("LoadCategories")
	mdlExpenses.Container.SetDefaults
	mdlExpenses.SetTitle("New Expense")
	vm.ShowDialog("mdlExpenses")
End Sub

Sub btnNewExpense_click(e As BANanoEvent)
	Add
End Sub

'load all existing expenses
Sub Refresh
	'vm.pagepause
	Dim qry As String = "select expenses.id, expenses.expense_date, expenses.expense_description, expenses.expense_amount, expensecategories.text as expense_category,"
	qry = qry & "expensetypes.text As expense_type from expenses, expensecategories, expensetypes where expenses.expense_category = expensecategories.id and expenses.expense_type = "
	qry = qry & "expensetypes.id order by expenses.expense_date desc"
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.Execute(qry)
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		expenses.SetDataSource(dbsql.result)
	Else
		Log("modExpenses.Refresh: Error - " & dbsql.error)
	End If
	'vm.pageresume
End Sub

Sub expensetable_edit(rec As Map)
	'get the record corresponding to the row
	Dim sid As String = rec.GetDefault("id","")
	If sid = "" Then Return
	'turn the mode to edit
	Mode = "E"
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.Read(sid)
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		rec = dbsql.result.get(0)
		vm.CallMethod("LoadTypes")
		vm.CallMethod("LoadCategories")
		mdlExpenses.Container.SetDefaults
		mdlExpenses.SetTitle("Edit Expense")
		vm.SetState(rec)
		vm.ShowDialog("mdlExpenses")
	Else
		Log("modExpenses.expensetable_edit: Error - " & dbsql.error)
	End If
End Sub

Sub expensetable_clone(item As Map)
	'get the record corresponding to the row
	Dim sid As String = item.GetDefault("id","")
	If sid = "" Then Return
	'turn the mode to edit
	Mode = "A"
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.Read(sid)
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		Dim rec As Map = dbsql.result.get(0)
		rec.put("id", Null)
		vm.CallMethod("LoadTypes")
		vm.CallMethod("LoadCategories")
		mdlExpenses.Container.SetDefaults
		mdlExpenses.SetTitle("New Expense")
		vm.SetState(rec)
		vm.ShowDialog("mdlExpenses")
	Else
		Log("modExpenses.expensetable_clone: Error - " & dbsql.error)
	End If
End Sub

Sub expensetable_delete(rec As Map)
	'get the record corresponding to the row
	Dim sid As String = rec.GetDefault("id","")
	If sid = "" Then Return
	'save the category id to delete
	vm.SetStateSingle("expenseid", sid)
	'indicate confirm dialog
	vm.ShowConfirm("delete_expense", $"Confirm Delete: ${sid}"$, _
	"Are you sure that you want to delete this expense. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub

Sub Delete
	Dim sid As String = vm.getstate("expenseid", "")
	If sid = "" Then Return
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.Delete(sid)
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		vm.ShowSnackBar("Expense deleted successfully!")
		Refresh
	Else
		Log("phIndex.confirm_ok.delete_expense: Error - " & dbsql.error)
		vm.ShowSnackBar(dbsql.error)
	End If
End Sub

Sub PrintExpenses
	Dim oxml As BANanoOXML
	oxml.initialize("expenses.xlsx")
	Dim rpt As BANanoObject = oxml.WorkSheet("Expenses")
	'create a heading for the report
	oxml.SetText(rpt, 1, 1, "Expenses Report")
	'merge the heading
	oxml.Merge(rpt, "A1:E1")
	Dim rowH As BANanoObject = oxml.GetRow(rpt, 1, 1)
	Dim hstyle As OXMLStyle = oxml.CreateStyle
	hstyle.bold = True
	hstyle.fontSize = 18
	hstyle.hAlignment = "center"
	hstyle.vAlignment = "center"
	oxml.SetStyle(rowH, hstyle)
	'put border on merged rc
	Dim colCnt As Int
	For colCnt = 1 To 5
		Dim colH As BANanoObject = oxml.GetCell(rpt, 1, colCnt)
		oxml.SetStyleBorder(colH, oxml.colors_black, oxml.BorderThin)
	Next
	
	'add the headers
	oxml.SetRow(rpt, 2, 1, Array("Date", "Category", "Type", "Description", "Amount"))
	'get all the expenses we need to report on
	Dim qry As String = "select expenses.id, expenses.expense_date, expenses.expense_description, expenses.expense_amount, expensecategories.text as expense_category,"
	qry = qry & "expensetypes.text As expense_type from expenses, expensecategories, expensetypes where expenses.expense_category = expensecategories.id and expenses.expense_type = "
	qry = qry & "expensetypes.id order by expenses.expense_date desc"
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.Execute(qry)
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		Dim rowCnt As Int = 3
		'loop through each expense record
		For Each expmap As Map In dbsql.result
			Dim sexpense_date As String = expmap.Get("expense_date")
			Dim sexpense_description As String = expmap.get("expense_description")
			Dim sexpense_amount As String = expmap.get("expense_amount")
			Dim sexpense_category As String = expmap.get("expense_category")
			Dim expense_type As String = expmap.get("expense_type")
			'
			Dim rptLine As List
			rptLine.initialize
			rptLine.AddAll(Array(sexpense_date, sexpense_category, expense_type, sexpense_description, sexpense_amount))
			oxml.SetRow(rpt, rowCnt, 1, rptLine)
			rowCnt = rowCnt + 1
		Next
		'add a total for the amount
		oxml.SetFormula(rpt, rowCnt + 1, 5, $"SUM(E3:E${rowCnt})"$)
		'apply borders to all the rows
		Dim rowStart As Int
		Dim rstyle As OXMLStyle = oxml.CreateStyle
		rstyle.borderColor = oxml.colors_black
		rstyle.borderthickness = oxml.BorderThin
		For rowStart = 2 To rowCnt
			rstyle.bold = False
			Dim rptr As BANanoObject = oxml.GetRow(rpt, rowStart, 1)
			If rowStart = 2 Then rstyle.bold = True
			oxml.setstyle(rptr, rstyle) 
		Next
		'number format column from where amounts start
		Dim amt As BANanoObject = oxml.GetColumn(rpt, 3, 5)
		Dim cstyle As OXMLStyle = oxml.CreateStyle
		cstyle.numberFrmat = "#,##0.00 ;[Red](#,##0.00)"
		cstyle.borderColor = oxml.colors_black
		cstyle.borderthickness = oxml.BorderThin
		oxml.SetStyle(amt, cstyle)
	Else
		Log("modExpenses.Refresh: Error - " & dbsql.error)
	End If
	
	
	oxml.download(Me, "onDownload")
	
End Sub

Sub onDownload
	vm.ShowSnackBar("Expenses report downloaded!")
End Sub