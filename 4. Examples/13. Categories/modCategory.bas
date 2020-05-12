B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public Name As String = "catsCode"
	Public Title As String = "Categories"
	Private vm As BANanoVM
	Private BANano As BANano  'ignore
	Private dialogcats As VMDialog
	Private dtcats As VMDataTable
	Private cont As VMContainer
	Private Mode As String
End Sub

Sub Code
	'Establish a reference to the app
	vm = pgIndex.vm
	'create a container to hold all contents based on the page name
	cont = vm.CreateContainer(Name, Me)
	'add the table
	CreateDataTable_cats
	'hide the container
	cont.Hide
	'add the container to the page
	vm.AddContainer(cont)
	'add the dialog to the page
	CreateDialog_Cats
	'add method to get all records
	vm.SetMethod(Me, "SelectAll_Cats")
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
	'update the navbar title
	vm.NavBar.UpdateTitle(Title)
	'hide all buttons
	vm.NavBar.HideItems
	'show buttons for modCategory
	vm.ShowItem("btnAddCategory")
	vm.ShowItem("btnRefreshCategory")
	'2. Show the page and hide others
	vm.ShowPage(Name)
End Sub

'delete all records
Sub DeleteAll_Cats
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("ecommerce", "ecommerce")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for deletion
	alaSQL.Initialize("cats", "id")
	'generate & run command to delete all records
	alaSQL.DeleteAll
	alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)
End Sub

'delete single record
Sub DeleteRecord_Cats(RecordID As String)
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("ecommerce", "ecommerce")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for deletion
	alaSQL.Initialize("cats", "id")
	'generate & run command to delete single record
	alaSQL.Delete(RecordID)
	alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)
End Sub

'select all records
Sub SelectAll_Cats
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("ecommerce", "ecommerce")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for reading
	alaSQL.Initialize("cats", "id")
	'generate & run command to select all records
	alaSQL.SelectAll(Array("*"), Array("categoryname"))
	alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
	vm.SetData("categories", alaSQL.Result)
End Sub

'create/update record to table
Sub CreateUpdate_Cats
	'get the record to create/update
	Dim Record As Map = dialogcats.Container.GetData
	'validate the record
	Dim bValid As Boolean = vm.Validate(Record, dialogcats.Container.Required)
	'if invalid exit create/update
	If bValid = False Then Return
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("ecommerce", "ecommerce")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for insert/update
	alaSQL.Initialize("cats", "id")
	'generate max value
	Dim nextID As Int = 0
	'generate & run command to get max value
	alaSQL.GetMax
	alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)
	nextID = alaSQL.GetNextID
	'update the record with the next id
	Record.Put("id", nextID)
	'initialize table for insert/update after auto-increment
	alaSQL.Initialize("cats", "id")
	'define schema for record
	alaSQL.SchemaFromDesign(dialogcats.Container)
	'prepare record for database
	alaSQL.RecordFromMap(Record)
	'are we creating/updating a record
	Select Case Mode
		Case "A"
			'insert a record
			alaSQL.Insert
			'generate & run command to insert record
			alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
		Case "E"
			'read record id
			Dim RecID As String = Record.Get("id")
			'update a record
			alaSQL.Update(RecID)
			'generate & run command to update record
			alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
	End Select
End Sub

'read record
Sub Read_Cats(RecID As String)
	'set default values
	dialogcats.Container.SetDefaults
	'database variable
	Dim db As BANanoSQL
	'open the database and wait
	db.OpenWait("ecommerce", "ecommerce")
	'resultset variable
	Dim alaSQL As BANanoAlaSQLE
	'initialize table for reading
	alaSQL.Initialize("cats", "id")
	'generate & run command to read record
	alaSQL.Read(RecID)
	alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)
	'was the read successful?
	If alaSQL.Result.Size = 0 Then Return
	'the record as found!
	Dim Record As Map = alaSQL.result.get(0)
	'Update the dialog details
	dialogcats.SetTitle("Edit Category")
	'set the default values for the dialog
	dialogcats.Container.SetDefaults
	'update the state, this updates the v-model(s) for each input control
	'save the state and update UI!
	vm.SetState(Record)
	'show the modal
	vm.ShowDialog("dialogcats")
End Sub

'cats Edit action
Sub dtcats_edit(item As Map)
	'get the key
	Dim RecID As String = item.Get("id")
	'set mode to E-dit
	Mode = "E"
	'read record from database
	Read_Cats(RecID)
End Sub


'cats Delete action
Sub dtcats_delete(item As Map)
	'get the key
	Dim RecID As String = item.Get("id")
	'save the id to delete
	vm.SetData("catsid", RecID)
	'show confirm dialog
	vm.ShowConfirm("delete_cats", "Confirm Delete: " & RecID, _
"Are you sure that you want to delete this category. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub


'add a new record
Sub Addcats
	'set mode to A-add
	Mode = "A"
	'set default values
	dialogcats.Container.SetDefaults
	'update the title
	dialogcats.SetTitle("New Category")
	'show dialog
	vm.ShowDialog("dialogcats")
End Sub


'when add new is clicked
Sub btnNewRecord_click(e As BANanoEvent)
	Addcats
End Sub

'create dialog
Sub CreateDialog_Cats
	dialogcats = vm.CreateDialog("dialogcats", Me)
	dialogcats.SetTitle("Categories")
	dialogcats.SetOk("btnOkcats","Save")
	dialogcats.SetCancel("btnCancelcats","Cancel")
	dialogcats.Setwidth("70%")
	dialogcats.Setpersistent(True)
	vm.AddDialog(dialogcats)
End Sub

'add code to save the category
Sub btnOkcats_click(e As BANanoEvent)
	'save the record
	CreateUpdate_Cats
	'execute code to refresh listing for Category
	vm.CallMethod("SelectAll_Cats")
End Sub

'add code to cancel the dialog for category
Sub btnCancelcats_click(e As BANanoEvent)
	'hide the modal
	vm.HideDialog("dialogcats")
End Sub

Sub CreateDataTable_cats
	dtcats = vm.CreateDataTable("dtcats", "id", Me)
	dtcats.SetTitle("Categories")
	dtcats.SetSearchbox(True)
	dtcats.SetAddNew("btnNewRecord", "mdi-plus", "Add a new record")
	vm.setdata("categories", vm.newlist)
	dtcats.SetDatasourcename("categories")
	dtcats.SetItemsperpage("10")
	dtcats.SetMobilebreakpoint("600")
	dtcats.SetPage("1")
	dtcats.AddColumn1("id", "#", "text",0,False,"start")
	dtcats.AddColumn1("categoryname", "Name", "text",0,True,"start")
	dtcats.SetEdit(True)
	dtcats.SetDelete(True)
	dtcats.SetVisible(True)
	cont.AddControl(dtcats.DataTable, dtcats.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
End Sub
