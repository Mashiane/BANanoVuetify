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
	vm.ux
	'
	modExpenseType.show
End Sub

Sub BuildNavBar
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
	vm.NavBar.AddTitle("Expense Types","")
	vm.NavBar.AddSubHeading1("")
	vm.NavBar.AddSpacer
	vm.NavBar.SetVisible(True)
	'set primary color for the navbar
	vm.NavBar.SetPrimary(True)
	'fix the navbar so that it does not move
	vm.NavBar.SetModeFixed(True)
	
	
	'code to add the add and refresh navigation buttons for expensetypes
	vm.NavBar.AddIcon("btnAddExpenseType","add", "Add ExpenseType", "")
	vm.NavBar.AddIcon("btnRefreshExpenseType","refresh", "Refresh Expense Types", "")

End Sub

Sub BuildNavDrawer
	'hide the drawer
	'vm.Drawer.Hide
	'code to add an item on the drawer for expensetypes
	vm.Drawer.AddItem("pageExpenseType", "", "Expense Types")
End Sub

Sub AddPages
	'add pages to the project
	'code to add the ExpenseType template code to the master HTML template
	vm.AddPage(modExpenseType.name, modExpenseType)
End Sub

'*IMPORTANT
Sub draweritems_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	Select Case elID
	Case "pageexpensetype"
		modExpenseType.Show
	End Select
End Sub

'confirm ok click
Sub confirm_ok
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
	Case ""
	End Select
End Sub

'confirm cancel click
Sub cancel_ok

End Sub

'add a new ExpenseType record
Sub btnAddExpenseType_click(e As BANanoEvent)
	'execute adding ExpenseType
	modExpenseType.AddExpenseTypes
End Sub



'refresh ExpenseType listing
Sub btnRefreshExpenseType_click(e As BANanoEvent)
	'execute code to refresh listing for ExpenseType
	vm.CallMethod("SelectAll_Expensetypes")
End Sub