B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#ignorewarnings:12
Sub Process_Globals
	Private BANano As BANano  'ignore
	Public vm As BANanoVM
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	vm.NavBar.UpdateTitle("Expenses.Show")
	'set primary color for the navbar
	'vm.NavBar.SetPrimary(True)
	'fix the navbar so that it does not move
	vm.NavBar.SetModeFixed(True)
	'hide the back button
	'show the hamburger button
	vm.NavBar.SetHasMenuButton(True)
	'
	'build the page
	vm.SetMethod(Me, "LoadTypes")
	vm.SetMethod(Me, "LoadCategories")
	'
	BuildDrawer
	AddPages
		
	vm.ux
	'
	ShowDashboard
End Sub

Sub LoadTypes
	vm.SetStateSingle("types", Array())
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expensetypes", "id")
	dbsql.SelectAll(Array("id","text"), Array("text"))
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		vm.SetStateSingle("types", dbsql.result)
	End If
End Sub

Sub LoadCategories
	vm.SetStateSingle("categories", Array())
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expensecategories", "id")
	dbsql.SelectAll(Array("id","text"), Array("text"))
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		vm.SetStateSingle("categories", dbsql.result)
	End If	
End Sub

Sub BuildDrawer
	vm.Drawer.AddItem("dashboard","","Dashboard")
	vm.Drawer.AddItem("expenses","","Expenses")
	vm.Drawer.AddItem("expensetypes","","Expense Types")
	vm.Drawer.AddItem("expensecategories","","Expense Categories")
End Sub

'*IMPORTANT
Sub draweritems_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	Select Case elID
	Case "dashboard"
		dashboard
	Case "expenses"	
		expenses
	Case "expensetypes"
		expensetypes
	Case "expensecategories"
		expensecategories
	End Select
End Sub	


'add different 'pages' you have created add them here
'these should be code modules
Sub AddPages
	vm.AddPage(modDashboard.name, modDashboard)
	vm.AddPage(modExpenses.name, modExpenses)
	vm.AddPage(modExpenseTypes.name, modExpenseTypes)
	vm.Addpage(modExpenseCategories.name, modExpenseCategories)
End Sub

Sub expensetypes
	vm.NavBar.UpdateTitle("Expenses.Show - Settings")
	vm.showpage(modExpenseTypes.name)
	modExpenseTypes.refresh
End Sub

Sub expensecategories
	vm.NavBar.UpdateTitle("Expenses.Show - Settings")
	vm.showpage(modExpenseCategories.name)
	modExpenseCategories.refresh
End Sub

Sub expenses
	vm.NavBar.UpdateTitle("Expenses.Show - Expenses")
	vm.showpage(modExpenses.name)
	modExpenses.refresh
End Sub

Sub dashboard
	ShowDashboard
End Sub

Sub ShowDashboard
	' show the dashboard
	vm.CallMethod("LoadTypes")
	vm.CallMethod("LoadCategories")
	vm.NavBar.UpdateTitle("Expenses.Show - Dashboard")
	modDashboard.expcont.setdefaults
	vm.showpage(modDashboard.name)
	modDashboard.refresh
End Sub	

Sub back_click(e As BANanoEvent)

End Sub

Sub confirm_ok
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
	Case "delete_expensetype"
		modExpenseTypes.delete
	Case "delete_category"
		modExpenseCategories.delete
	Case "delete_expense"
		modExpenses.delete
	End Select	
End Sub

