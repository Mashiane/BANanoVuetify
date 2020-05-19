B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano  'ignore
	Public vm As BANanoVM
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	BuildNavBar
	BuildNavDrawer
	AddPages
	AddContent
	vm.ux
End Sub

'build the navigation bar
Sub BuildNavBar
	'*copy code after this line
	'add a hamburger
	vm.NavBar.AddHamburger
	vm.NavBar.Hamburger.SetVisible(True)
	'add a logo
	vm.NavBar.Logo.SetBorderRadius("50%")
	vm.NavBar.Logo.SetBorderWidth("1px")
	vm.NavBar.Logo.SetBorderColor("black")
	vm.NavBar.Logo.SetBorderStyle("solid")
	vm.NavBar.Logo.SetSize("46px","46px")
	vm.NavBar.AddLogo("./assets/sponge.png")
	vm.NavBar.Logo.Show
	vm.NavBar.AddTitle(Main.AppTitle,"")
	vm.NavBar.AddSubHeading1("1.00")
	vm.NavBar.AddSpacer
	vm.NavBar.SetFixed(True)
	vm.NavBar.SetVisible(True)
	'this page should have an icon/button in the navbar
	vm.NavBar.AddButton1("navExpenses", "mdi-golf", "Expenses", "Maintain expenses", "")

	'this page should have an icon/button in the navbar
	vm.NavBar.AddButton1("navExpenseCategories", "mdi-account", "Expense Categories", "Maintain expense categories", "")
	'this page should have an icon/button in the navbar
	vm.NavBar.AddButton1("navExpenseTypes", "mdi-account", "Expense Types", "Maintain expense types", "")

End Sub

'build the nav drawer
Sub BuildNavDrawer
	'*copy code after this line
	vm.Drawer.Setwidth("300")
	vm.Drawer.Setvisible(True)
	'this page should show on the drawer
	vm.Drawer.AddIcon1("pageExpenses", "mdi-golf", "", "Expenses", "Maintain expenses")
	vm.Drawer.AddDivider1(False)

	'this page should show on the drawer
	vm.Drawer.AddIcon1("pageExpenseCategories", "mdi-account", "", "Expense Categories", "Maintain expense categories")
	vm.Drawer.AddDivider1(False)
	'this page should show on the drawer
	vm.Drawer.AddIcon1("pageExpenseTypes", "mdi-account", "", "Expense Types", "Maintain expense types")
	vm.Drawer.AddDivider1(False)

End Sub

Sub navExpenses_click(e As BANanoEvent)
	'show the page Expenses
	modExpenses.Show
End Sub


Sub navExpenseTypes_click(e As BANanoEvent)
	'show the page Expense Types
	modExpenseTypes.Show
End Sub


Sub navExpenseCategories_click(e As BANanoEvent)
'show the page Expense Categories
modExpenseCategories.Show
End Sub

'add pages to the app
Sub AddPages
	'*copy code after this line
	'code to add the Expense Categories template code to the master HTML template
	vm.AddPage(modExpenseCategories.name, modExpenseCategories)
	'code to add the Expense Types template code to the master HTML template
	vm.AddPage(modExpenseTypes.name, modExpenseTypes)
	'code to add the Expenses template code to the master HTML template
	vm.AddPage(modExpenses.name, modExpenses)

End Sub

'add content to this page
Sub AddContent
	'*copy code here to add to thos page
End Sub

'*IMPORTANT when a drawer item is clicked
Sub draweritems_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	Select Case elID
		'copy code below this line
		Case "pageexpensecategories"
			'show Expense Categories
			modExpenseCategories.Show
		Case "pageexpensetypes"
			'show Expense Types
			modExpenseTypes.Show
		Case "pageexpenses"
			'show Expenses
			modExpenses.Show


	End Select
End Sub

'confirm dialog ok click
Sub confirm_ok(e As BANanoEvent)
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
		'copy code below this line
		Case "delete_expensecategories"
			'read the saved record id
			Dim RecID As String = vm.GetState("expensecategoriescatid", "")
			If RecID = "" Then Return
			'delete the record
			modExpenseCategories.DeleteRecord_ExpenseCategories(RecID)
		Case "delete_expensetypes"
			'read the saved record id
			Dim RecID As String = vm.GetState("expensetypestypeid", "")
			If RecID = "" Then Return
			'delete the record
			modExpenseTypes.DeleteRecord_ExpenseTypes(RecID)
		Case "delete_expenses"
			'read the saved record id
			Dim RecID As String = vm.GetState("expensesexpid", "")
			If RecID = "" Then Return
			'delete the record
			modExpenses.DeleteRecord_Expenses(RecID)



	End Select
End Sub

'confirm dialog cancel click
Sub cancel_ok(e As BANanoEvent)

End Sub

'alert dialog ok clock
Sub alert_ok(e As BANanoEvent)

End Sub

'confirm dialog cancel click
Sub confirm_cancel(e As BANanoEvent)

End Sub
