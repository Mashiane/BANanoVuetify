B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.27
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private BANAno As BANano  'ignore
	Private db As BANanoObject
	Public const DB_BOOL As String = "BOOL"
	Public const DB_INT As String = "INT"
	Public const DB_STRING As String = "STRING"
	Public const DB_REAL As String = "REAL"
	Public const DB_DATE As String = "DATE"
	Public const DB_BLOB As String = "BLOB"
	Public const DB_FLOAT As String = "FLOAT"
	Public const DB_INTEGER As String = "INTEGER"
	Public const DB_TEXT As String = "TEXT"
	Private Module As Object  'ignore
	Type BANanoSQLiteRecordSet(query As String, args As List, types As List, command As String, response As String, _
	error As String, result As List, json As String, affectedRows As Int, recType As Map, Schema As Map, Record As Map, OK As Boolean, TableName As String, PrimaryKey As String)
End Sub

'open a database file from server
Public Sub OpenDatabase(EventHandler As Object, CallBackMethod As String, dbURL As String) As BANanoSQLiteR2
	Module = EventHandler
	Dim ArrayBuffer As String
	Dim dataUrlProm As BANanoPromise = BANAno.GetFileAsArrayBuffer(dbURL, Null)
	dataUrlProm.Then(ArrayBuffer)
	'
	Dim iUint8Array As BANanoObject
	iUint8Array.Initialize2("Uint8Array", ArrayBuffer)
	'
	db.Initialize2("SQL.Database", iUint8Array)
	'
	BANAno.CallSub(EventHandler, CallBackMethod, Null)
	dataUrlProm.End
	Return Me
End Sub

'open a database file from arrayBuffer
Public Sub OpenDatabaseFromArrayBuffer(EventHandler As Object, CallBackMethod As String, arrayBuffer As String) As BANanoSQLiteR2
	Module = EventHandler
	Dim iUint8Array As BANanoObject
	iUint8Array.Initialize2("Uint8Array", arrayBuffer)
	'
	db.Initialize2("SQL.Database", iUint8Array)
	'
	BANAno.CallSub(EventHandler, CallBackMethod, Null)
	Return Me
End Sub

private Sub AndOrOperators(sm As Map) As List    'ignore
	Dim nl As List
	nl.initialize
	For Each k As String In sm.Keys
		nl.Add("AND")
	Next
	Return nl
End Sub

'return a sql to select record of table where one exists
Sub SelectWhereAndOr(rs As BANanoSQLiteRecordSet, tblfields As List, tblWhere As Map, operators As List, AndOr As List, orderBy As List) As BANanoSQLiteR2
	If operators = Null Then operators = EQOperators(tblWhere)
	If AndOr = Null Then AndOr = AndOrOperators(tblWhere)
	Dim listOfTypes As List = GetMapTypes(rs, tblWhere)
	Dim listOfValues As List = GetMapValues(rs, tblWhere)
	'are we selecting all fields or just some
	Dim fld1 As String = tblfields.Get(0)
	Dim selFIelds As String = ""
	Select Case fld1
		Case "*"
			selFIelds = "*"
		Case Else
			selFIelds = JoinFields(",", tblfields)
	End Select
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"SELECT ${selFIelds} FROM ${EscapeField(rs.TableName)} WHERE "$)
	Dim i As Int
	Dim iWhere As Int = tblWhere.Size - 1
	For i = 0 To iWhere
		If i > 0 Then
			Dim sandor As String = AndOr.get(i)
			sb.Append($" ${sandor} "$)
		End If
		Dim col As String = tblWhere.GetKeyAt(i)
		sb.Append(col)
		Dim opr As String = operators.Get(i)
		sb.Append($" ${opr} ?"$)
	Next
	If orderBy <> Null Then
		'order by
		Dim stro As String = JoinFields(",", orderBy)
		If stro.Length > 0 Then
			sb.Append(" ORDER BY ").Append(stro)
		End If
	End If
	rs.query = sb.tostring
	rs.args = listOfValues
	rs.types = listOfTypes
	rs.command = "select"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Return Me
End Sub


'export database as binary array
Sub Export(dbName As String)
	Dim iUint8Array As Object = db.RunMethod("export", Null)
	'
	Dim fc As List
	fc.Initialize
	fc.Add(iUint8Array)
	'
	Dim blob As BANanoObject
	blob.Initialize2("Blob",Array(fc, CreateMap("type": "application/octet-stream")))
	BANAno.RunJavascriptMethod("saveAs",Array(blob, dbName))
End Sub

'close the database
Sub Close
	db.RunMethod("close", Null)
End Sub


'initialize the table to process
public Sub Initialize(tblName As String, priKey As String) As BANanoSQLiteRecordSet
	Dim rs As BANanoSQLiteRecordSet
	rs.Initialize 
	rs.recType.Initialize
	rs.Schema.Initialize
	rs.TableName = tblName
	rs.PrimaryKey = priKey
	rs.response = ""
	rs.result.initialize
	rs.command = ""
	rs.types = Null
	rs.args = Null
	rs.query = ""
	rs.json = ""
	rs.error = ""
	rs.affectedRows = 0
	rs.Record.initialize
	rs.OK = False
	Return rs
End Sub

'create a new database
Sub NewDatabase(EventHandler As Object, CallBackMethod As String) As BANanoSQLiteR2
	Module = EventHandler
	db.Initialize2("SQL.Database", Null)
	BANAno.CallSub(EventHandler, CallBackMethod, Null)
	Return Me
End Sub

'prepare the statement and get the result
private Sub Prepare(rs As BANanoSQLiteRecordSet)
	'prepare the query
	Dim resultBo As BANanoObject = db.RunMethod("prepare", rs.query)
	If rs.args <> Null Then
		resultBo.RunMethod("bind", rs.args)
	End If
	rs.result = NewList
	'execute a step
	Dim hasRecord As Boolean = resultBo.RunMethod("step", Null).Result
	Do While hasRecord
		Dim Rec As Map = resultBo.RunMethod("getAsObject", Null)
		rs.result.Add(Rec)
		hasRecord = resultBo.RunMethod("step", Null).Result
	Loop
	'
	resultBo.runmethod("free", Null)
	'
	FromJSON(rs)
End Sub


'just run without expecting result
Sub Run(rs As BANanoSQLiteRecordSet)
	If rs.args = Null Then
		db.RunMethod("run", rs.query)
	Else
		db.RunMethod("run", Array(rs.query, rs.args))
	End If
End Sub

private Sub NewList As List
	Dim nl As List
	nl.Initialize
	Return nl
End Sub

'execute a statement
Sub Exec(rs As BANanoSQLiteRecordSet)
	rs.result = NewList
	Try
		Dim res As List = db.RunMethod("exec", rs.query)
		'get first result
		If res.Size >= 0 Then
			Dim rec As Map = rs.result.Get(0)
			Dim columns As List = rec.Get("columns")
			Dim colTot As Int = columns.Size - 1
			Dim values As List = rec.Get("values")
			For Each value As List In values
				Dim nr As Map = CreateMap()
				For colCnt = 0 To colTot
					Dim colName As String = columns.Get(colCnt)
					Dim colValue As Object = value.Get(colCnt)
					nr.Put(colName, colValue)
				Next
				rs.result.Add(nr)
			Next
		End If
	Catch
		Log("Exec: Error")
	End Try
End Sub

'get the column names
Sub ColumnNames(rs As BANanoSQLiteRecordSet) As BANanoSQLiteR2
	rs.query = $"PRAGMA table_info('${rs.TableName}')"$
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub

'get the table names
Sub TableNames(rs As BANanoSQLiteRecordSet) As BANanoSQLiteR2
	rs.query = "SELECT name FROM sqlite_master WHERE type='table' AND name Not LIKE 'sqlite_%' ORDER BY name"
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub

'count the records
Sub Count(rs As BANanoSQLiteRecordSet) As BANanoSQLiteR2
	rs.query = $"SELECT COUNT(*) AS count FROM '${rs.TableName}'"$
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub

'schema add boolean
Sub SchemaAddBoolean(rs As BANanoSQLiteRecordSet, bools As List) As BANanoSQLiteR2
	For Each b As String In bools
		rs.Schema.Put(b, DB_BOOL)
	Next
	AddBooleans(rs,bools)
	Return Me
End Sub


Sub SchemaAddDate(rs As BANanoSQLiteRecordSet, bools As List) As BANanoSQLiteR2
	For Each b As String In bools
		rs.Schema.Put(b, DB_DATE)
	Next
	AddStrings(rs, bools)
	Return Me
End Sub


Sub SchemaAddFloat(rs As BANanoSQLiteRecordSet, bools As List) As BANanoSQLiteR2
	For Each b As String In bools
		rs.Schema.Put(b, DB_FLOAT)
	Next
	AddDoubles(rs,bools)
	Return Me
End Sub

Sub SchemaAddText(rs As BANanoSQLiteRecordSet, bools As List) As BANanoSQLiteR2
	For Each b As String In bools
		rs.Schema.Put(b, DB_STRING)
	Next
	AddStrings(rs,bools)
	Return Me
End Sub

Sub SchemaAddString(rs As BANanoSQLiteRecordSet, bools As List) As BANanoSQLiteR2
	For Each b As String In bools
		rs.Schema.Put(b, DB_STRING)
	Next
	AddStrings(rs,bools)
	Return Me
End Sub


Sub SchemaAddInt(rs As BANanoSQLiteRecordSet, bools As List) As BANanoSQLiteR2
	For Each b As String In bools
		rs.Schema.Put(b, DB_INT)
	Next
	AddIntegers(rs,bools)
	Return Me
End Sub

Sub SchemaAddField(rs As BANanoSQLiteRecordSet, fldName As String, fldType As String)
	rs.Schema.Put(fldName, fldType)
End Sub

'update the record field
Sub SetField(rs As BANanoSQLiteRecordSet, fldName As String, fldValue As Object) As BANanoSQLiteR2
	rs.Record.Put(fldName, fldValue)
	Return Me
End Sub

private Sub RecordFromMap(rs As BANanoSQLiteRecordSet, sm As Map)
	rs.Record.Initialize
	For Each k As String In sm.Keys
		Dim v As Object = sm.Get(k)
		rs.Record.Put(k, v)
	Next
End Sub

'get the first record
Sub FirstRecord(rs As BANanoSQLiteRecordSet) As Map
	Dim rec As Map = rs.result.Get(0)
	Return rec
End Sub


'convert the json
private Sub FromJSON(rs As BANanoSQLiteRecordSet) As BANanoSQLiteR2
	rs.response = "Success"
	rs.error = ""
	rs.affectedRows = rs.result.size
	rs.OK = True
	Return Me
End Sub

'update a record using primary key
Sub Update(rs As BANanoSQLiteRecordSet, priValue As String) As BANanoSQLiteR2
	Dim tblWhere As Map = CreateMap()
	tblWhere.Put(rs.PrimaryKey, priValue)
	UpdateWhere(rs, rs.Record, tblWhere, Null)
	Return Me
End Sub

'update record using primary key
Sub Update1(rs As BANanoSQLiteRecordSet, rec As Map, priValue As String) As BANanoSQLiteR2
	Dim tblWhere As Map = CreateMap()
	tblWhere.Put(rs.PrimaryKey, priValue)
	UpdateWhere(rs,rec, tblWhere, Null)
	Return Me
End Sub

'prepare for new table definition
Sub SchemaClear(rs As BANanoSQLiteRecordSet) As BANanoSQLiteR2
	rs.Schema.clear
	Return Me
End Sub


Sub SchemaAddBlob(rs As BANanoSQLiteRecordSet, bools As List) As BANanoSQLiteR2
	For Each b As String In bools
		rs.Schema.Put(b, DB_BLOB)
	Next
	AddBlobs(rs, bools)
	Return Me
End Sub

Sub SchemaAddBlobs(rs As BANanoSQLiteRecordSet, blobs As List) As BANanoSQLiteR2
	SchemaAddBlob(rs, blobs)
	Return Me
End Sub


Sub SchemaAddBooleans(rs As BANanoSQLiteRecordSet, bools As List) As BANanoSQLiteR2
	SchemaAddBoolean(rs, bools)
	Return Me
End Sub


Sub SchemaAddIntegers(rs As BANanoSQLiteRecordSet, ints As List) As BANanoSQLiteR2
	SchemaAddInt(rs, ints)
	Return Me
End Sub

Sub SchemaAddDoubles(rs As BANanoSQLiteRecordSet, dbls As List) As BANanoSQLiteR2
	SchemaAddFloat(rs, dbls)
	Return Me
End Sub


Sub SchemaAddDates(rs As BANanoSQLiteRecordSet, dates As List) As BANanoSQLiteR2
	SchemaAddDate(rs, dates)
	Return Me
End Sub

Sub SchemaAddStrings(rs As BANanoSQLiteRecordSet, strings As List) As BANanoSQLiteR2
	SchemaAddText(rs, strings)
	Return Me
End Sub

'
Sub SchemaFromDesign(rs As BANanoSQLiteRecordSet, Booleans As List, Dates As List, Doubles As List, Integers As List, Strings As List) As BANanoSQLiteR2
	If Booleans <> Null Then SchemaAddBoolean(rs,Booleans)
	If Dates <> Null Then SchemaAddDate(rs,Dates)
	If Doubles <> Null Then SchemaAddFloat(rs,Doubles)
	If Integers <> Null Then SchemaAddInt(rs,Integers)
	If Strings <> Null Then SchemaAddText(rs,Strings)
	'update field types
	If Strings <> Null Then AddStrings(rs,Strings)
	If Integers <> Null Then AddIntegers(rs,Integers)
	If Doubles <> Null Then AddDoubles(rs,Doubles)
	If Booleans <> Null Then AddBooleans(rs,Booleans)
	If Dates <> Null Then AddStrings(rs,Dates)
	Return Me
End Sub

'reset types
Sub ResetTypes(rs As BANanoSQLiteRecordSet) As BANanoSQLiteR2
	rs.recType.Initialize
	Return Me
End Sub

'get next available id
Sub GetNextID(rs As BANanoSQLiteRecordSet) As String
	Dim nextid As Int
	Dim strid As String
	Dim rsResult As List = rs.Result
	If rsResult.Size = 0 Then
		nextid = 0
	Else
		Dim nr As Map = rsResult.Get(0)
		Dim ni As String = nr.Getdefault(rs.PrimaryKey,"0")
		nextid = BANAno.parseInt(ni)
	End If
	nextid = nextid + 1
	strid = CStr(nextid)
	nextid = BANAno.ParseInt(nextid)
	Return strid
End Sub


private Sub CStr(o As Object) As String
	Return "" & o
End Sub


'specify strings field types, this is default for all strings
Sub AddStrings(rs As BANanoSQLiteRecordSet, fieldNames As List) As BANanoSQLiteR2
	For Each strfld As String In fieldNames
		rs.recType.Put(strfld,"STRING")
	Next
	Return Me
End Sub

'specify integer field types
Sub AddIntegers(rs As BANanoSQLiteRecordSet, fieldNames As List) As BANanoSQLiteR2
	For Each strfld As String In fieldNames
		rs.recType.Put(strfld,"INT")
	Next
	Return Me
End Sub

'specify double field types
Sub AddDoubles(rs As BANanoSQLiteRecordSet, fieldNames As List) As BANanoSQLiteR2
	For Each strfld As String In fieldNames
		rs.recType.Put(strfld,"DOUBLE")
	Next
	Return Me
End Sub

'specify boolean field types
Sub AddBooleans(rs As BANanoSQLiteRecordSet, fieldNames As List) As BANanoSQLiteR2
	For Each strfld As String In fieldNames
		rs.recType.Put(strfld,"BOOL")
	Next
	Return Me
End Sub

'specify blobs field types
Sub AddBlobs(rs As BANanoSQLiteRecordSet, fieldNames As List) As BANanoSQLiteR2
	For Each strfld As String In fieldNames
		rs.recType.Put(strfld,"BLOB")
	Next
	Return Me
End Sub

'get map values
private Sub GetMapValues(rs As BANanoSQLiteRecordSet, sourceMap As Map) As List
	Dim listOfValues As List
	listOfValues.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		'get the value
		Dim key As String = sourceMap.getkeyat(iCnt)
		Dim value As String = sourceMap.GetValueAt(iCnt)
		value = CStr(value)
		value = value.trim
		'get the type
		Dim vtype As String = GetMapType(rs, key)
		Select Case vtype
			Case "i"
				'integer
				If value = "" Then value = "0"
				value = BANAno.parseInt(value)
			Case "d"
				'double
				If value = "" Then value = "0"
				value = BANAno.parsefloat(value)
			Case "s", "b"
		End Select
		listOfValues.Add(value)
	Next
	Return listOfValues
End Sub

'join list to multi value string
private Sub JoinFields(delimiter As String, lst As List) As String
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	fld = EscapeField(fld)
	sb.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		fld = EscapeField(fld)
		sb.Append(delimiter).Append(fld)
	Next
	Return sb.ToString
End Sub

'get map keys
private Sub GetMapKeys(sourceMap As Map) As List
	Dim listOfValues As List
	listOfValues.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim value As String = sourceMap.GetKeyAt(iCnt)
		listOfValues.Add(value)
	Next
	Return listOfValues
End Sub

'convert a json string to a map
private Sub Json2Map(strJSON As String) As Map
	Dim jsonx As BANanoJSONParser
	Dim Map1 As Map
	Map1.Initialize
	Map1.clear
	Try
		If strJSON.length > 0 Then
			jsonx.Initialize(strJSON)
			Map1 = jsonx.NextObject
		End If
		Return Map1
	Catch
		Return Map1
	End Try
End Sub

'delete a record
Sub Delete(rs As BANanoSQLiteRecordSet, primaryValue As String) As BANanoSQLiteR2
	Dim qw As Map = CreateMap()
	qw.Put(rs.PrimaryKey, primaryValue)
	DeleteWhere(rs,qw, Array("="))
	Return Me
End Sub

Private Sub EscapeField(f As String) As String
	Return $"[${f}]"$
End Sub

'create a table
Sub SchemaCreateTable(rs As BANanoSQLiteRecordSet) As BANanoSQLiteR2
	CreateTable(rs, rs.Schema)
	Return Me
End Sub

'return a sql command to create the table
public Sub CreateTable(rs As BANanoSQLiteRecordSet, tblFields As Map) As BANanoSQLiteR2
	Dim fldName As String
	Dim fldType As String
	Dim fldTot As Int
	Dim fldCnt As Int
	fldTot = tblFields.Size - 1
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("(")
	For fldCnt = 0 To fldTot
		fldName = tblFields.GetKeyAt(fldCnt)
		fldType = tblFields.Get(fldName)
		If fldCnt > 0 Then
			sb.Append(", ")
		End If
		sb.Append(EscapeField(fldName))
		sb.Append(" ")
		If fldType = DB_INT Then fldType = DB_INTEGER
		sb.Append(fldType)
		If fldName.EqualsIgnoreCase(rs.PrimaryKey) Then
			sb.Append(" PRIMARY KEY")
		End If
	Next
	sb.Append(")")
	'define the qry to execute
	rs.query = "CREATE TABLE IF NOT EXISTS " & EscapeField(rs.TableName) & " " & sb.ToString
	rs.args = Null
	rs.types = Null
	rs.command = "createtable"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub


'return a sql to delete record of table where one exists
Sub GetMax(rs As BANanoSQLiteRecordSet) As BANanoSQLiteR2
	rs.query = $"SELECT MAX([${rs.PrimaryKey}]) As [${rs.PrimaryKey}] FROM ${EscapeField(rs.TableName)}"$
	rs.args = Null
	rs.types = Null
	rs.command = "getmax"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub

'return a sql to delete record of table where one exists
Sub GetMin(rs As BANanoSQLiteRecordSet) As BANanoSQLiteR2
	rs.query = $"SELECT MIN([${rs.PrimaryKey}]) As [${rs.PrimaryKey}] FROM ${EscapeField(rs.TableName)}"$
	rs.args = Null
	rs.types = Null
	rs.command = "getmin"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub


'return sql command to drop a table
public Sub DropTable(rs As BANanoSQLiteRecordSet) As BANanoSQLiteR2
	'define the qry to execute
	rs.query = "DROP TABLE " & EscapeField(rs.TableName)
	rs.args = Null
	rs.types = Null
	rs.response = ""
	rs.error = ""
	rs.command = "droptable"
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub

'execute own query
Sub Execute(rs As BANanoSQLiteRecordSet, strSQL As String) As BANanoSQLiteR2
	strSQL = strSQL.trim
	rs.query = strSQL
	rs.args = Null
	rs.types = Null
	rs.command = "execute"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub

'return a sql map to insert record to table. sql = query string, values = list of values
Sub Insert(rs As BANanoSQLiteRecordSet) As BANanoSQLiteR2
	Insert1(rs, rs.Record)
	Return Me
End Sub

'return a sql map to insert record to table. sql = query string, values = list of values
Sub Insert1(rs As BANanoSQLiteRecordSet, Rec As Map) As BANanoSQLiteR2
	Dim sb As StringBuilder
	Dim columns As StringBuilder
	Dim values As StringBuilder
	Dim listOfValues As List = GetMapValues(rs, Rec)
	Dim listOfTypes As List = GetMapTypes(rs,Rec)
	Dim iCnt As Int
	Dim iTot As Int
	sb.Initialize
	columns.Initialize
	values.Initialize
	sb.Append($"INSERT INTO ${EscapeField(rs.TableName)} ("$)
	iTot = Rec.Size - 1
	For iCnt = 0 To iTot
		Dim col As String = Rec.GetKeyAt(iCnt)
		If iCnt > 0 Then
			columns.Append(", ")
			values.Append(", ")
		End If
		columns.Append(EscapeField(col))
		values.Append("?")
	Next
	sb.Append(columns.ToString)
	sb.Append(") VALUES (")
	sb.Append(values.ToString)
	sb.Append(")")
	rs.query = sb.ToString
	rs.args = listOfValues
	rs.types = listOfTypes
	rs.command = "insert"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub

private Sub GetMapType(rs As BANanoSQLiteRecordSet, k As String) As String
	Dim rsRecType As Map = rs.RecType
	If rsRecType.ContainsKey(k) Then
		Dim colType As String = rsRecType.GetDefault(k, "STRING")
		Select Case colType
			Case "INTEGER", "INT", "BOOL","BOOLEAN"
				Return "i"
			Case "BLOB"
				Return "b"
			Case "REAL","FLOAT","DOUBLE"
				Return "d"
			Case Else
				Return "s"
		End Select
	Else
		Return "s"
	End If
End Sub

'get the list of types
private Sub GetMapTypes(rs As BANanoSQLiteRecordSet, sourceMap As Map) As List
	Dim listOfTypes As List
	listOfTypes.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim rsRecType As Map = rs.rectype
		Dim col As String = sourceMap.GetKeyAt(iCnt)
		Dim colType As String = rsRecType.GetDefault(col,"STRING")
		Select Case colType
			Case "INTEGER", "INT", "BOOL","BOOLEAN"
				listOfTypes.add("i")
			Case "BLOB"
				listOfTypes.add("b")
			Case "REAL","FLOAT","DOUBLE"
				listOfTypes.add("d")
			Case Else
				listOfTypes.add("s")
		End Select
	Next
	Return listOfTypes
End Sub


private Sub EQOperators(sm As Map) As List    'ignore
	Dim nl As List
	nl.initialize
	For Each k As String In sm.Keys
		nl.Add("=")
	Next
	Return nl
End Sub

'return a sql to update records of table where one exists
Sub UpdateWhere(rs As BANanoSQLiteRecordSet, tblfields As Map, tblWhere As Map, operators As List) As BANanoSQLiteR2
	If operators = Null Then operators = EQOperators(tblWhere)
	Dim listOfTypes As List = GetMapTypes(rs,tblfields)
	Dim listOfTypes1 As List = GetMapTypes(rs,tblWhere)
	listOfTypes.AddAll(listOfTypes1)
	Dim listOfValues As List = GetMapValues(rs,tblfields)
	Dim listOfValues1 As List = GetMapValues(rs, tblWhere)
	listOfValues.AddAll(listOfValues1)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"UPDATE ${EscapeField(rs.TableName)} SET "$)
	Dim i As Int
	Dim iTot As Int = tblfields.Size - 1
	For i = 0 To iTot
		Dim col As String = tblfields.GetKeyAt(i)
		sb.Append(EscapeField(col))
		If i <> iTot Then
			sb.Append(" = ?,")
		Else
			sb.Append(" = ?")
		End If
	Next
	sb.Append($" WHERE "$)
	Dim iWhere As Int = tblWhere.Size - 1
	For i = 0 To iWhere
		If i > 0 Then
			sb.Append(" AND ")
		End If
		Dim col As String = tblWhere.GetKeyAt(i)
		sb.Append(EscapeField(col))
		Dim opr As String = operators.Get(i)
		sb.Append($" ${opr} ?"$)
	Next
	rs.query = sb.tostring
	rs.args = listOfValues
	rs.types = listOfTypes
	rs.command = "update"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub

'return a sql to delete record of table where one exists
Sub DeleteWhere(rs As BANanoSQLiteRecordSet, tblWhere As Map, operators As List) As BANanoSQLiteR2
	If operators = Null Then operators = EQOperators(tblWhere)
	Dim listOfTypes As List = GetMapTypes(rs,tblWhere)
	Dim listOfValues As List = GetMapValues(rs, tblWhere)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"DELETE FROM ${EscapeField(rs.TableName)} WHERE "$)
	Dim i As Int
	Dim iWhere As Int = tblWhere.Size - 1
	For i = 0 To iWhere
		If i > 0 Then
			sb.Append(" AND ")
		End If
		Dim col As String = tblWhere.GetKeyAt(i)
		sb.Append(col)
		Dim opr As String = operators.Get(i)
		sb.Append($" ${opr} ?"$)
	Next
	rs.query = sb.tostring
	rs.args = listOfValues
	rs.types = listOfTypes
	rs.command = "delete"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub

'return a sql to delete record of table where one exists
Sub DeleteAll(rs As BANanoSQLiteRecordSet) As BANanoSQLiteR2
	rs.query = $"DELETE FROM ${EscapeField(rs.TableName)} WHERE 1=1"$
	rs.args = Null
	rs.types = Null
	rs.command = "delete"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub

'convert a map to a json string
Sub Map2Json(mp As Map) As String
	Dim xjson As BANanoJSONGenerator
	xjson.Initialize(mp)
	Return xjson.ToString
End Sub

'convert a list to json
Sub List2Json(mp As List) As String
	Dim xjson As BANanoJSONGenerator
	xjson.Initialize2(mp)
	Return xjson.ToString
End Sub

' convert a json string to a list
Sub Json2List(strValue As String) As List
	Dim lst As List
	lst.Initialize
	lst.clear
	If strValue.Length = 0 Then
		Return lst
	End If
	Try
		Dim parser As BANanoJSONParser
		parser.Initialize(strValue)
		Return parser.NextArray
	Catch
		Return lst
	End Try
End Sub

'Return a SQL To update all records of table
Sub UpdateAll(rs As BANanoSQLiteRecordSet, tblFields As Map, operators As List) As BANanoSQLiteR2
	If operators = Null Then operators = EQOperators(tblFields)
	Dim listOfTypes As List = GetMapTypes(rs, tblFields)
	Dim listOfValues As List = GetMapValues(rs, tblFields)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"UPDATE ${EscapeField(rs.TableName)} SET "$)
	Dim i As Int
	Dim iTot As Int = tblFields.Size - 1
	For i = 0 To iTot
		Dim oper As String = operators.Get(i)
		Dim col As String = tblFields.GetKeyAt(i)
		sb.Append(col)
		If i <> iTot Then
			sb.Append(" = ?,")
		Else
			sb.Append($" ${oper} ?"$)
		End If
	Next
	rs.query = sb.tostring
	rs.args = listOfValues
	rs.types = listOfTypes
	rs.command = "update"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub


Sub Read(rs As BANanoSQLiteRecordSet, primaryValue As String) As BANanoSQLiteR2
	Dim qw As Map = CreateMap()
	qw.Put(rs.PrimaryKey, primaryValue)
	SelectWhere(rs, Array("*"), qw, Array("="), Array(rs.PrimaryKey))
	Return Me
End Sub

'exists
Sub Exists(rs As BANanoSQLiteRecordSet, primaryValue As String) As BANanoSQLiteR2
	Dim qw As Map = CreateMap()
	qw.Put(rs.PrimaryKey, primaryValue)
	SelectWhere(rs, Array(rs.PrimaryKey), qw, Array("="), Array(rs.PrimaryKey))
	Return Me
End Sub


'return a sql to delete record of table where one exists
Sub GetMaxWhere(rs As BANanoSQLiteRecordSet, fldName As String, tblWhere As Map, operators As List) As BANanoSQLiteR2
	If operators = Null Then operators = EQOperators(tblWhere)
	Dim listOfTypes As List = GetMapTypes(rs, tblWhere)
	Dim listOfValues As List = GetMapValues(rs, tblWhere)
	'
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"SELECT MAX([${fldName}]) As [${fldName}] FROM ${EscapeField(rs.TableName)} WHERE "$)
	Dim i As Int
	Dim iWhere As Int = tblWhere.Size - 1
	For i = 0 To iWhere
		If i > 0 Then
			sb.Append(" AND ")
		End If
		Dim col As String = tblWhere.GetKeyAt(i)
		sb.Append(col)
		Dim opr As String = operators.Get(i)
		sb.Append($" ${opr} ?"$)
	Next
	
	rs.query = sb.tostring
	rs.args = listOfValues
	rs.types = listOfTypes
	rs.command = "getmax"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub

'return a sql to select record of table where one exists
Sub SelectWhere(rs As BANanoSQLiteRecordSet, tblfields As List, tblWhere As Map, operators As List, orderBy As List) As BANanoSQLiteR2
	If operators = Null Then operators = EQOperators(tblWhere)
	Dim listOfTypes As List = GetMapTypes(rs, tblWhere)
	Dim listOfValues As List = GetMapValues(rs, tblWhere)
	'are we selecting all fields or just some
	Dim fld1 As String = tblfields.Get(0)
	Dim selFIelds As String = ""
	Select Case fld1
		Case "*"
			selFIelds = "*"
		Case Else
			selFIelds = JoinFields(",", tblfields)
	End Select
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"SELECT ${selFIelds} FROM ${EscapeField(rs.TableName)} WHERE "$)
	Dim i As Int
	Dim iWhere As Int = tblWhere.Size - 1
	For i = 0 To iWhere
		If i > 0 Then
			sb.Append(" AND ")
		End If
		Dim col As String = tblWhere.GetKeyAt(i)
		sb.Append(col)
		Dim opr As String = operators.Get(i)
		sb.Append($" ${opr} ?"$)
	Next
	If orderBy <> Null Then
		'order by
		Dim stro As String = JoinFields(",", orderBy)
		If stro.Length > 0 Then
			sb.Append(" ORDER BY ").Append(stro)
		End If
	End If
	rs.query = sb.tostring
	rs.args = listOfValues
	rs.types = listOfTypes
	rs.command = "select"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub


'join list to mv string
private Sub Join(delimiter As String, lst As List) As String
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	sb.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		sb.Append(delimiter).Append(fld)
	Next
	Return sb.ToString
End Sub

'return a sql to select record of table where one exists
Sub SelectAll(rs As BANanoSQLiteRecordSet, tblfields As List, orderBy As List) As BANanoSQLiteR2
	'are we selecting all fields or just some
	Dim fld1 As String = tblfields.Get(0)
	Dim selFIelds As String = ""
	Select Case fld1
		Case "*"
			selFIelds = "*"
		Case Else
			selFIelds = JoinFields(",", tblfields)
	End Select
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"SELECT ${selFIelds} FROM ${EscapeField(rs.TableName)}"$)
	If orderBy <> Null Then
		'order by
		Dim stro As String = JoinFields(",", orderBy)
		If stro.Length > 0 Then
			sb.Append(" ORDER BY ").Append(stro)
		End If
	End If
	rs.query = sb.tostring
	rs.args = Null
	rs.types = Null
	rs.command = "select"
	rs.response = ""
	rs.error = ""
	rs.result = NewList
	rs.json = ""
	rs.affectedRows = 0
	Prepare(rs)
	FromJSON(rs)
	Return Me
End Sub