B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public const DB_BOOL As String = "BOOL"
	Public const DB_INT As String = "INT"
	Public const DB_STRING As String = "STRING"
	Public const DB_REAL As String = "REAL"
	Public const DB_DATE As String = "DATE"
	Public const DB_BLOB As String = "BLOB"
	Public const DB_FLOAT As String = "FLOAT"
	Public const DB_INTEGER As String = "INTEGER"
	Public const DB_TEXT As String = "TEXT"
	Private recType As Map
	Type AlaSQLResultSet(response As String, result As List, command As String, types As List, args As List, query As String, _
	json As String, error As String, affectedRows As Long)
	Private BANano As BANano  'ignore
	Private Schema As Map
End Sub

'initialize the class, a field named "id" is assumed to be an integer
Public Sub Initialize() As BANanoAlaSQL
	recType.Initialize
	Schema.Initialize
	Return Me
End Sub

Sub Update(tblName As String, priKey As String, priValue As String, tblfields As Map) As AlaSQLResultSet
	Dim tblWhere As Map = CreateMap()
	tblWhere.Put(priKey, priValue)
	Return UpdateWhere(tblName, tblfields, tblWhere, Null)
End Sub

'prepare for new table definition
Sub SchemaClear As BANanoAlaSQL
	Schema.clear
	Return Me
End Sub


Sub SchemaFromDesign(vDesign As VMContainer) As BANanoAlaSQL
	SchemaAddBoolean(vDesign.Booleans)
	SchemaAddDate(vDesign.Dates)
	SchemaAddFloat(vDesign.Doubles)
	SchemaAddInt(vDesign.Integers)
	SchemaAddText(vDesign.Strings)
	Return Me
End Sub


Sub SchemaAddField(fldName As String, fldType As String)
	Schema.Put(fldName, fldType)
End Sub

'schema add boolean
Sub SchemaAddBoolean(bools As List) As BANanoAlaSQL
	For Each b As String In bools
		Schema.Put(b, DB_BOOL)
	Next
	Return Me
End Sub
'
Sub SchemaAddInt(ints As List) As BANanoAlaSQL
	For Each b As String In ints
		Schema.Put(b, DB_INT)
	Next
	Return Me
End Sub

Sub SchemaAddFloat(floats As List) As BANanoAlaSQL
	For Each b As String In floats
		Schema.Put(b, DB_FLOAT)
	Next
	Return Me
End Sub

Sub SchemaAddBlob(blobs As List) As BANanoAlaSQL
	For Each b As String In blobs
		Schema.Put(b, DB_BLOB)
	Next
	Return Me
End Sub

Sub SchemaAddText(texts As List) As BANanoAlaSQL
	For Each b As String In texts
		Schema.Put(b, DB_TEXT)
	Next
	Return Me
End Sub

Sub SchemaAddDate(dates As List) As BANanoAlaSQL
	For Each b As String In dates
		Schema.Put(b, DB_DATE)
	Next
	Return Me
End Sub

Sub ResetTypes As BANanoAlaSQL
	recType.Initialize
	Return Me
End Sub

Sub GetNextID(fld As String, rsl As List) As String
	Dim nextid As Int
	Dim strid As String
	
	If rsl.Size = 0 Then
		nextid = 0
	Else
		Dim nr As Map = rsl.Get(0)
		Dim ni As String = nr.Getdefault(fld,"0")
		nextid = BANano.parseInt(ni)
	End If
	nextid = nextid + 1
	strid = CStr(nextid)
	Return strid
End Sub

Sub CStr(o As Object) As String
	Return "" & o
End Sub


'specify strings field types, this is default for all strings
Sub AddStrings(fieldNames As List) As BANanoAlaSQL
	For Each strfld As String In fieldNames
		recType.Put(strfld,"STRING")
	Next
	Return Me
End Sub

'specify integer field types
Sub AddIntegers(fieldNames As List) As BANanoAlaSQL
	For Each strfld As String In fieldNames
		recType.Put(strfld,"INT")
	Next
	Return Me
End Sub

'specify double field types
Sub AddDoubles(fieldNames As List) As BANanoAlaSQL
	For Each strfld As String In fieldNames
		recType.Put(strfld,"DOUBLE")
	Next
	Return Me
End Sub

'specify boolean field types
Sub AddBooleans(fieldNames As List) As BANanoAlaSQL
	For Each strfld As String In fieldNames
		recType.Put(strfld,"BOOL")
	Next
	Return Me
End Sub

'specify blobs field types
Sub AddBlobs(fieldNames As List) As BANanoAlaSQL
	For Each strfld As String In fieldNames
		recType.Put(strfld,"BLOB")
	Next
	Return Me
End Sub

'get map values
private Sub GetMapValues(sourceMap As Map) As List
	Dim listOfValues As List
	listOfValues.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim value As String = sourceMap.GetValueAt(iCnt)
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
Sub Json2Map(strJSON As String) As Map
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


Sub Delete(tblName As String, sPrimaryKey As String, primaryValue As String) As AlaSQLResultSet
	Dim qw As Map = CreateMap()
	qw.Put(sPrimaryKey, primaryValue)
	Dim qry As AlaSQLResultSet = DeleteWhere(tblName, qw, Array("="))
	Return qry
End Sub


Private Sub EscapeField(f As String) As String
	Return $"[${f}]"$
End Sub

Sub SchemaCreateTable(tblName As String, PK As String) As AlaSQLResultSet
	Return CreateTable(tblName, Schema, PK)
End Sub

'return a sql command to create the table
public Sub CreateTable(tblName As String, tblFields As Map, PK As String) As AlaSQLResultSet
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
		sb.Append(fldType)
		If fldName.EqualsIgnoreCase(PK) Then
			sb.Append(" PRIMARY KEY")
		End If
	Next
	sb.Append(")")
	'define the qry to execute
	Dim query As String = "CREATE TABLE IF NOT EXISTS " & EscapeField(tblName) & " " & sb.ToString
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = query
	m.args = Null
	m.types = Null
	m.command = "createtable"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub

Sub NewList As List
	Dim lst As List
	lst.Initialize
	Return lst
End Sub

'insert multiple records commands, pass the list name on ExecuteSQL
Sub InsertList(tblname As String) As AlaSQLResultSet
	Dim sSQL As String = $"SELECT * INTO [${tblname}] FROM ?"$
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = sSQL
	m.args = Null
	m.types = Null
	m.command = "insert"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub

'return a sql to delete record of table where one exists
Sub GetMax(tblName As String, fldName As String) As AlaSQLResultSet
	Dim sb As String = $"SELECT MAX(${fldName}) As ${fldName} FROM ${EscapeField(tblName)}"$
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = sb
	m.args = Null
	m.types = Null
	m.command = "getmax"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub

'return a sql to delete record of table where one exists
Sub GetMin(tblName As String, fldName As String) As AlaSQLResultSet
	Dim sb As String = $"SELECT MIN(${fldName}) As ${fldName} FROM ${EscapeField(tblName)}"$
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = sb
	m.args = Null
	m.types = Null
	m.command = "getmin"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub


'return sql command to drop a table
public Sub DropTable(tblName As String) As AlaSQLResultSet
	'define the qry to execute
	Dim query As String = "DROP TABLE " & EscapeField(tblName)
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = query
	m.args = Null
	m.types = Null
	m.response = ""
	m.error = ""
	m.command = "droptable"
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub


Sub Execute(strSQL As String) As AlaSQLResultSet
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = strSQL
	m.args = Null
	m.types = Null
	m.command = "execute"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub

'return a sql map to insert record to table. sql = query string, values = list of values
Sub Insert(tblName As String, tblFields As Map) As AlaSQLResultSet
	Dim sb As StringBuilder
	Dim columns As StringBuilder
	Dim values As StringBuilder
	Dim listOfValues As List = GetMapValues(tblFields)
	Dim listOfTypes As List = GetMapTypes(tblFields)
	Dim iCnt As Int
	Dim iTot As Int
	sb.Initialize
	columns.Initialize
	values.Initialize
	sb.Append($"INSERT INTO ${EscapeField(tblName)} ("$)
	iTot = tblFields.Size - 1
	For iCnt = 0 To iTot
		Dim col As String = tblFields.GetKeyAt(iCnt)
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
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = sb.ToString
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "insert"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub

'get the list of types
private Sub GetMapTypes(sourceMap As Map) As List
	Dim listOfTypes As List
	listOfTypes.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim col As String = sourceMap.GetKeyAt(iCnt)
		Dim colType As String = recType.GetDefault(col,"STRING")
		Select Case colType
			Case "VARCHAR(20)", "VARCHAR(10)", "VARCHAR(30)", "VARCHAR(40)"
				listOfTypes.add("s")
			Case "VARCHAR(50)", "VARCHAR(100)", "VARCHAR(255)"
				listOfTypes.add("s")
			Case "STRING","VARCHAR","TEXT","DATE","DATETIME","NVARCHAR"
				listOfTypes.add("s")
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


Sub EQOperators(sm As Map) As List   'ignore
	Dim nl As List
	nl.initialize
	For Each k As String In sm.Keys
		nl.Add("=")
	Next
	Return nl
End Sub


'return a sql to update records of table where one exists
Sub UpdateWhere(tblName As String, tblfields As Map, tblWhere As Map, operators As List) As AlaSQLResultSet
	If operators = Null Then operators = EQOperators(tblWhere)
	Dim listOfTypes As List = GetMapTypes(tblfields)
	Dim listOfTypes1 As List = GetMapTypes(tblWhere)
	listOfTypes.AddAll(listOfTypes1)
	Dim listOfValues As List = GetMapValues(tblfields)
	Dim listOfValues1 As List = GetMapValues(tblWhere)
	listOfValues.AddAll(listOfValues1)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"UPDATE ${EscapeField(tblName)} SET "$)
	Dim i As Int
	Dim iTot As Int = tblfields.Size - 1
	For i = 0 To iTot
		Dim col As String = tblfields.GetKeyAt(i)
		sb.Append(EscapeField(col))
		If i <> iTot Then
			sb.Append("= ?,")
		Else
			sb.Append("= ?")
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
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = sb.tostring
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "update"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub


'return a sql to delete record of table where one exists
Sub DeleteWhere(tblName As String, tblWhere As Map, operators As List) As AlaSQLResultSet
	If operators = Null Then operators = EQOperators(tblWhere)
	Dim listOfTypes As List = GetMapTypes(tblWhere)
	Dim listOfValues As List = GetMapValues(tblWhere)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"DELETE FROM ${EscapeField(tblName)} WHERE "$)
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
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = sb.tostring
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "delete"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub


'return a sql to delete record of table where one exists
Sub DeleteAll(tblName As String) As AlaSQLResultSet
	Dim sb As String = $"DELETE FROM ${EscapeField(tblName)} WHERE 1=1"$
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = sb
	m.args = Null
	m.types = Null
	m.command = "delete"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
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
Sub UpdateAll(tblName As String, tblFields As Map, operators As List) As AlaSQLResultSet
	If operators = Null Then operators = EQOperators(tblFields)
	Dim listOfTypes As List = GetMapTypes(tblFields)
	Dim args As List = GetMapValues(tblFields)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"UPDATE ${EscapeField(tblName)} SET "$)
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
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = sb.tostring
	m.args = args
	m.types = listOfTypes
	m.command = "update"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub

'read
Sub Read(tblName As String, sPrimaryKey As String, primaryValue As String) As AlaSQLResultSet
	Dim qw As Map = CreateMap()
	qw.Put(sPrimaryKey, primaryValue)
	Dim qry As AlaSQLResultSet = SelectWhere(tblName, Array("*"), qw, Array("="), Array(sPrimaryKey))
	Return qry
End Sub

'exists
Sub Exists(tblName As String, sPrimaryKey As String, primaryValue As String) As AlaSQLResultSet
	Dim qw As Map = CreateMap()
	qw.Put(sPrimaryKey, primaryValue)
	Dim qry As AlaSQLResultSet = SelectWhere(tblName, Array(sPrimaryKey), qw, Array("="), Array(sPrimaryKey))
	Return qry
End Sub

'return a sql to delete record of table where one exists
Sub GetMaxWhere(tblName As String, fldName As String, tblWhere As Map, operators As List) As AlaSQLResultSet
	If operators = Null Then operators = EQOperators(tblWhere)
	Dim listOfTypes As List = GetMapTypes(tblWhere)
	Dim listOfValues As List = GetMapValues(tblWhere)
	'
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"SELECT MAX(${fldName}) As ${fldName} FROM ${EscapeField(tblName)} WHERE "$)
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
	
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = sb.tostring
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "getmax"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub

'return a sql to select record of table where one exists
Sub SelectWhere(tblName As String, tblfields As List, tblWhere As Map, operators As List, orderBy As List) As AlaSQLResultSet
	If operators = Null Then operators = EQOperators(tblWhere)
	Dim listOfTypes As List = GetMapTypes(tblWhere)
	Dim listOfValues As List = GetMapValues(tblWhere)
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
	sb.Append($"SELECT ${selFIelds} FROM ${EscapeField(tblName)} WHERE "$)
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
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = sb.tostring
	m.args = listOfValues
	m.types = listOfTypes
	m.command = "select"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
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
Sub SelectAll(tblName As String, tblfields As List, orderBy As List) As AlaSQLResultSet
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
	sb.Append($"SELECT ${selFIelds} FROM ${EscapeField(tblName)}"$)
	If orderBy <> Null Then
		'order by
		Dim stro As String = JoinFields(",", orderBy)
		If stro.Length > 0 Then
			sb.Append(" ORDER BY ").Append(stro)
		End If
	End If
	Dim m As AlaSQLResultSet
	m.Initialize
	m.query = sb.tostring
	m.args = Null
	m.types = Null
	m.command = "select"
	m.response = ""
	m.error = ""
	m.result = NewList
	m.json = ""
	m.affectedRows = 0
	Return m
End Sub