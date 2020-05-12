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
	vm.NavBar.AddTitle("Categories","")
	vm.NavBar.AddSubHeading1("1.00")
	vm.NavBar.AddSpacer
	vm.NavBar.SetFixed(True)
	vm.NavBar.SetVisible(True)
	'this page should have an icon/button in the navbar
	vm.NavBar.AddButton1("navCategory", "mdi-file-tree-outline", "", "Categories", "")
	'add add & refresh button to the navbar for Category
	vm.NavBar.AddIcon("btnAddCategory","add", "Add Category", "")
	vm.NavBar.AddIcon("btnRefreshCategory","refresh", "Refresh Categories", "")
End Sub

Sub BuildNavDrawer
	'*copy code after this line
	'this page should show on the drawer
	vm.Drawer.AddIcon1("pageCategory", "mdi-file-tree-outline", "", "", "Categories")
	vm.Drawer.AddDivider1(False)
End Sub

'click modCategory nav button
Sub navCategory_click(e As BANanoEvent)
	'show the page Category
	modCategory.Show
End Sub

Sub AddPages
	'*copy code after this line
	'code to add the Category template code to the master HTML template
	vm.AddPage(modCategory.name, modCategory)

End Sub

Sub AddContent
	'*copy code here to add to thos page
End Sub

'add a new Category category
Sub btnAddCategory_click(e As BANanoEvent)
	'execute adding Category
	modCategory.Addcats
End Sub

'refresh Category listing
Sub btnRefreshCategory_click(e As BANanoEvent)
	'execute code to refresh listing for Category
	vm.CallMethod("SelectAll_Cats")
End Sub

'*IMPORTANT
Sub draweritems_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	Select Case elID
		'copy code below this line
		Case "pagecategory"
			'show Category
			modCategory.Show
	End Select
End Sub

'confirm ok click
Sub confirm_ok(e As BANanoEvent)
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
		'copy code below this line
		Case "delete_cats"
			'read the saved record id
			Dim RecID As String = vm.GetState("catsid", "")
			If RecID = "" Then Return
			'delete the record
			modCategory.DeleteRecord_Cats(RecID)
			'execute code to refresh listing for Category
			vm.CallMethod("SelectAll_Cats")
	End Select
End Sub

'confirm cancel click
Sub cancel_ok(e As BANanoEvent)

End Sub

'alert ok
Sub alert_ok(e As BANanoEvent)

End Sub

'confirm cancel
Sub confirm_cancel(e As BANanoEvent)

End Sub
