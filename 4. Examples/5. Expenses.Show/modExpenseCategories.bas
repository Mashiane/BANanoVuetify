B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "expensecategorycode"
	Private expensecategory As VMDataTable
	Public Mode As String
	Public mdlExpenseCategory As VMDialog
	Private BANano As BANano
End Sub

Sub Code
	Mode = ""
	Log("modExpenseCategories.Code")
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 1 columns each spanning 12 columns
	cont.AddRows(2).AddColumns12
	'
	expensecategory = vm.CreateDataTable("expensecategory", "id", Me)
	expensecategory.SetTitle("Expense Categories")
	expensecategory.AddColumn("text","Name")
	expensecategory.AddColumn("description","Description")
	expensecategory.AddColumn("budget","Monthly Budget")
	expensecategory.AddEditThrash
	expensecategory.SetMoneyColumns(Array("budget"))
	expensecategory.SetDataSource(Array())
	cont.AddComponent(1,1, expensecategory.tostring)
	'add container to the page content
	vm.AddContainer(cont)
	'
	'add modal to add expense category
	'create a modal to add an expense type
	mdlExpenseCategory = vm.CreateDialog("mdlExpenseCategory",Me)
	mdlExpenseCategory.SetTitle("New Expense Category")
	mdlExpenseCategory.AddCancel("btnCancelCategory", "Cancel")
	mdlExpenseCategory.AddOK("btnSaveCategory", "Save")
	'
	Dim ecID As VMTextField = vm.NewText(Me,"txtid","id","#","",False,"",0,"","",0)
	ecID.SetVisible(False).SetInt
	Dim ecText As VMTextField = vm.NewText(Me,"txttext","text","Name","",True,"",20,"","The category name is required!",0)
	Dim ecDescription As VMTextArea = vm.NewTextArea(Me,"txtdescription","description","Description","",False,False,"",100,"","",0)
	Dim ecBudget As VMTextField = vm.NewTel(Me,"txtbudget","budget","Monthly Budget","",True,"","","The monthly budget is required!",0)
	ecBudget.SetDouble
	
	mdlExpenseCategory.Container.AddControlS(ecID.TextField,ecID.tostring, 1, 1, 12, 12, 12, 12)
	mdlExpenseCategory.Container.AddControlS(ecText.TextField, ecText.tostring, 2, 1, 12, 12, 12, 12)
	mdlExpenseCategory.Container.AddControlS(ecDescription.TextArea,ecDescription.ToString, 3, 1, 12, 12, 12, 12)
	mdlExpenseCategory.Container.AddControlS(ecBudget.TextField,ecBudget.ToString, 4, 1, 12, 12, 12, 12)
	 
	mdlExpenseCategory.SetWidth("500px")
	vm.AddDialog(mdlExpenseCategory)
End Sub

'refresh the table records
Sub Refresh
	'vm.pagepause
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expensecategories", "id")
	dbsql.SelectAll(Array("*"), Array("text"))
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		expensecategory.SetDataSource(dbsql.result)
	Else
		Log("modExpenseCategories.Refresh: Error - " & dbsql.error)
	End If
	'vm.pageresume
End Sub

'a button to add a new category is clicked
Sub Add
	Mode = "A"
	mdlExpenseCategory.SetTitle("New Expense Category")
	mdlExpenseCategory.Container.setdefaults
	vm.showdialog("mdlExpenseCategory")
End Sub

Sub btnCancelCategory_click(e As BANanoEvent)
	vm.HideDialog("mdlExpenseCategory")
End Sub

Sub btnSaveCategory_click(e As BANanoEvent)
	'get the category
	Dim rec As Map = mdlExpenseCategory.GetData
	'validate
	Dim bValid As Boolean = vm.validate(rec, mdlExpenseCategory.Required)
	If bValid = False Then Return
		
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expensecategories", "id")
	dbsql.SchemaFromDesign(mdlExpenseCategory.Container)
	Select Case Mode
	Case "A"
		dbsql.RecordFromMap(rec)
		dbsql.Insert
		dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
		dbsql.FromJSON
		If dbsql.OK Then
			vm.ShowSnackBar("Expense Category added successfully!")
			vm.HideDialog("mdlExpenseCategory")
			Refresh
		Else
			Log("modExpenseCategories.btnSaveCategory_click: Error - " & dbsql.error)
			vm.ShowSnackBar(dbsql.error)
		End If
	Case "E"
		Dim sid As String = rec.Get("id")
		dbsql.RecordFromMap(rec)
		dbsql.Update(sid)
		dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
		dbsql.FromJSON
		If dbsql.OK Then
			vm.ShowSnackBar("Expense Category updated successfully!")
			vm.HideDialog("mdlExpenseCategory")
			Refresh
		Else
			Log("modExpenseCategories.btnSaveCategory_click: Error - " & dbsql.error)
			vm.ShowSnackBar(dbsql.error)
		End If
	End Select
End Sub

'an edit button is clicked on the table
Sub expensecategory_edit(rec As Map)
	'get the record corresponding to the row
	Dim sid As String = rec.GetDefault("id","")
	If sid = "" Then Return
	'turn the mode to edit
	Mode = "E"
	'update the title of the modal dialog
	mdlExpenseCategory.SetTitle("Edit Expense Category")
	'set the default values for the modal
	mdlExpenseCategory.Container.setdefaults
	'update the states for the modeal
	vm.SetState(rec)
	'show the modal with new states
	vm.showdialog("mdlExpenseCategory")
End Sub

'table delete record is clicked
Sub expensecategory_delete(rec As Map)
	Dim sid As String = rec.GetDefault("id","")
	Dim stext As String = rec.getdefault("text","")
	If sid = "" Then Return
	'save the category id to delete
	vm.SetStateSingle("categoryid", sid)
	'indicate confirm dialog
	vm.ShowConfirm("delete_category", $"Confirm Delete: ${stext}"$, _
	"Are you sure that you want to delete this expense category. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub