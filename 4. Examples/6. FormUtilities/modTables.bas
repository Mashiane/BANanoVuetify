B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "tablescode"
	Public tables As VMDataTable
	Private db As BANanoSQL
	Private alaSQL As BANanoAlaSQLE
	Public mdlTable As VMDialog
	Public Mode As String
	Public BANano As BANano
End Sub

Sub Code
	Log("modTables.Code")
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 1 columns each spanning 12 columns
	cont.AddRows(1).AddColumns12
	' table listing
	tables = vm.CreateDataTable("tables", "id", Me)
	tables.SetTitle("Tables")
	tables.AddColumn("tablename", "Table Name")
	tables.AddColumn("primarykey", "Primary Key")
	tables.AddColumn("autoincrement", "Auto Increment")
	tables.AddColumn("description", "Description")
	tables.SetDataSource(Array())
	tables.AddEditThrash 
	cont.AddComponent(1,1, tables.tostring)
	'dialog
	Mode = "A"
	mdlTable = vm.CreateDialog("mdlTable", Me).SetTitle("New Table").SetWidth("600px").SetModal(True)
	mdlTable.AddOK("btnCancelTable", "Cancel")
	mdlTable.AddOK("btnSaveTable", "Save")
	'
	Dim txtTableName As VMTextField = vm.NewText(Me, True, "txttablename", "tablename", "Table Name", "", True, "", 20, "", "The table name is required", 0)
	mdlTable.container.AddControlS(txtTableName.TextField, txtTableName.tostring, 1, 1, 12, 12, 12, 12)
	'
	Dim txtPrimaryKey As VMTextField = vm.NewText(Me, True, "txtprimarykey", "primarykey", "Primary Key", "", True, "", 20, "", "The primary key field is required", 0)
	mdlTable.container.AddControlS(txtPrimaryKey.TextField, txtPrimaryKey.ToString, 2, 1, 12, 12, 12, 12)
	'
	Dim chkAI As VMCheckBox = vm.NewCheckBox(Me, True, "txtautoincrement", "autoincrement", "Auto Increment", "Yes", "No", True, 0)
	mdlTable.container.AddControlS(chkAI.CheckBox, chkAI.ToString, 3, 1, 12, 12, 12, 12)
	'
	Dim txtDescription As VMTextField = vm.NewTextArea(Me, True, "txtdescription", "description", "Description", "", False, False, "", 100, "", "", 0)
	mdlTable.container.AddControlS(txtDescription.TextField, txtDescription.ToString, 4, 1, 12, 12, 12, 12)
	
	'add the dialog to the page
	vm.AddDialog(mdlTable)
	'add container to the page content
	vm.AddContainer(cont)
	vm.SetMethod(Me, "RefreshTables")
End Sub

Sub btnSaveTable_click(e As BANanoEvent)
	'get the data of the container
	Dim rec As Map = mdlTable.Container.GetData
	'ensure table name and field dont have spaces
	rec = mdlTable.container.NoSpaces(rec, Array("tablename","primarykey"))
	'validate the record
	Dim bValid As Boolean = vm.Validate(rec, mdlTable.container.required)
	If bValid = False Then Return
	' get the table name and ensure there are no spaces
	Dim stablename As String = rec.Get("tablename")
	'
	'open the database
	db.OpenWait("alasql", "formutilities")
	'
	alaSQL.Initialize("tables", "tablename")
	Select Case Mode
	Case "A"
		'does the table exist
		alaSQL.Exists(stablename)
		db.ExecuteWait(alaSQL.query, alaSQL.args)
		If alaSQL.result.size = 0 Then
			alaSQL.Insert1(rec)
			'execute the table creation
			alaSQL.result = db.ExecuteWait(alaSQL.query, alaSQL.args)
			vm.CallMethod("RefreshTables")
			vm.hidedialog("mdlTable")
		Else
			vm.ShowSnackBar($"The table ${stablename} already exists!"$)
		End If
	Case "E"
		'get the old table name
		Dim oldname As String =	BANano.GetSessionStorage("oldname")
		If oldname.EqualsIgnoreCase(stablename) Then
			'the table names are the same
			alaSQL.Update1(rec, oldname)
			alaSQL.result = db.ExecuteWait(alaSQL.query, alaSQL.args)
		Else
			'the table names have changed
			'update the table details using the old name
			alaSQL.Update1(rec, oldname)	
			alaSQL.result = db.ExecuteWait(alaSQL.query, alaSQL.args)
		End If
		vm.CallMethod("RefreshTables")
		vm.hidedialog("mdlTable")
	End Select
End Sub

Sub btnCancelTable_click(e As BANanoEvent)
	vm.hidedialog("mdlTable")
End Sub

Sub RefreshTables
	vm.pagepause
	'open the database
	db.OpenWait("alasql", "formutilities")
	'init library
	alaSQL.Initialize("tables", "tablename") 
	'select all records in table
	alaSQL.SelectAll(Array("*"), Array("tablename"))
	'execute the table creation
	alaSQL.result = db.ExecuteWait(alaSQL.query, alaSQL.args)
	tables.SetDataSource(alaSQL.result)
	vm.pageresume
End Sub

Sub tables_edit(rec As Map)
	Dim stablename As String = rec.GetDefault("tablename","")
	If stablename = "" Then Return
	BANano.SetSessionStorage("oldname", stablename)
	'turn the mode to edit
	Mode = "E"
	'update the title of the modal dialog
	mdlTable.SetTitle("Edit Table")
	'set the default values for the modal
	mdlTable.Container.SetDefaults
	'update the states for the modeal
	vm.SetState(rec)
	'show the modal with new states
	vm.ShowDialog("mdlTable")
End Sub

Sub tables_delete(rec As Map)
	'get the record for the row
	Dim sTableName As String = rec.GetDefault("tablename","")
	If sTableName = "" Then Return
	'save the id to delete
	vm.SetStateSingle("tablename", sTableName)
	'indicate confirm dialog
	vm.ShowConfirm("delete_table", $"Confirm Delete: ${sTableName}"$, _
	"Are you sure that you want to delete this table. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub