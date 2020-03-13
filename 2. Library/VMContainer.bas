B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Container As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Type GridRow(Rows As Int, Columns As List, Row As Int)
	Type GridColumn(Columns As Int, sm As Int, md As Int, lg As Int, xl As Int, _
	ofsm As Int, ofmd As Int, oflg As Int, ofxl As Int, _
	orsm As Int, ormd As Int, orlg As Int, orxl As Int, Row As Int, Col As Int)
	'this will hold all our rows
	Private Rows As Map
	'this will hold temporal columns
	Private Columns As Map
	'this will hold each row definition
	'hold our last row
	Private LastRow As Int
	'temporal holder
	Private RC As Map
	Private Components As Map
	'
	Public Fields As List
	Public Controls As List
	Public Strings As List
	Public Integers As List
	Public Booleans As List
	Public Doubles As List
	Public Dates As List
	Public Defaults As Map
	Public Required As Map
	Public Mode As String
	Private TotalRows As Int
	Private sortitM As Map
	Private sortItL As List
	Private cells As Map
	Type EachRow(visibility As String)
	Public visibility As Map
	Private rowStyles As Map
	Public HasInfoBox As Boolean
	Public Exclusions As List
	Private DesignMode As Boolean
	Type CheckedUnchecked(fieldname As String, checkedValue As Object, uncheckedValue As Object)
	Private rowClasses As Map
	Private rowStyles As Map
	Private attributes As Map
	Private afewoptions As List
	Private bControls As Boolean
End Sub

'initialize the Container
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMContainer
	ID = sid.tolowercase
	rowClasses.Initialize
	rowStyles.Initialize	
	attributes.Initialize
	afewoptions.Initialize
	Container.Initialize(v, ID)
	Container.SetTag("v-container")
	DesignMode = False
	Module = eventHandler
	vue = v
	LastRow = 0
	Rows.Initialize
	Module = eventHandler
	RC.Initialize
	Columns.Initialize
	Components.Initialize
	'
	TotalRows = 0
	rowStyles.Initialize
	sortitM.Initialize
	sortItL.Initialize
	Fields.Initialize
	Controls.Initialize
	Strings.Initialize
	Integers.Initialize
	Booleans.Initialize
	Defaults.Initialize
	Required.Initialize
	Doubles.Initialize
	Dates.initialize
	cells.Initialize
	visibility.Initialize
	Exclusions.Initialize
	Mode = "A"
	HasInfoBox = False
	Container.SetVShow($"${ID}show"$)
	bControls = False
	Return Me
End Sub

Sub AddExclusion(them As List) As VMContainer
	For Each k As String In them
		Exclusions.Add(k)
	Next
	Return Me
End Sub

Sub SetElevation(elx As string) As VMContainer
	Container.SetElevation(elx)
	Return Me
End Sub

Sub SetMargins(sMT As String, sMB As String, sML As String, sMR As String) As VMContainer
	Container.SetMargins(sMT, sMB, sML, sMR)
	Return Me
End Sub

Sub SetPadding(sPT As String, sPB As String, sPL As String, sPR As String) As VMContainer
	Container.SetPadding(sPT, sPB, sPL, sPR)
	Return Me
End Sub

Sub SetEmpty
	vue.SetStateListValues(Fields)
End Sub

Sub SetDefaults
	vue.SetState(Defaults)
	vue.SetState(visibility)
	For Each k As String In Required.Keys
		HideError(k)
	Next
End Sub

Sub AddRequired(r As String) As VMContainer
	Required.put(r,r)
	Return Me
End Sub

Sub RemoveRequired(r As String) As VMContainer
	Required.Remove(r)
	Return Me
End Sub

'add control sizes only
Sub AddControlS(ctl As VMElement, template As String, r As String, c As String, s As String, m As String, l As String, xl As String)
	AddControl(ctl, template, r, c, 0,0,0,0,s,m,l,xl)
End Sub

'set booleans from checked and unchecked values
Sub SetBooleans(rec As Map, xFields As List, checkedValue As String, UnCheckedValue As String) As Map
	Try
		For Each sfield As String In xFields
			Dim svalue As String = rec.Get(sfield)
			If svalue.EqualsIgnoreCase(checkedValue) Then rec.Put(sfield, True)
			If svalue.EqualsIgnoreCase(UnCheckedValue) Then rec.Put(sfield, False)
		Next
		Return rec
	Catch
		Return rec
	End Try
End Sub

Sub SetUncheckedValue(rec As Map, xFields As List, checkedValue As String, UncheckedValue As String) As Map
	Try
		For Each sfield As String In xFields
			Dim svalue As String = rec.Get(sfield)
			If svalue.EqualsIgnoreCase(checkedValue) = False Then
				rec.Put(sfield, UncheckedValue)
			End If
		Next
		Return rec
	Catch
		Return rec
	End Try
End Sub

'get field data
Sub GetData As Map
	Dim m As Map = CreateMap()
	m = vue.GetStates(Fields)
	m = LinkRecordTypes(m)
	'map checked and unchecked values
	For Each record As CheckedUnchecked In afewoptions
		Dim xlst As List
		xlst.Initialize
		xlst.Add(record.fieldname)
		m = SetUncheckedValue(m, xlst, record.checkedValue, record.uncheckedValue)
	Next
	Return m
End Sub

'validate the records
Sub Validate(rec As Map) As Boolean
	Dim iv As Int = 0
	For Each k As String In Required.Keys
		If rec.ContainsKey(k) Then
			Dim v As String = rec.GetDefault(k,"")
			v = vue.CStr(v)
			v = v.trim
			If v = "" Then
				Log("Validate: " & k)
				iv = iv + 1
				ShowError(k)
			Else
				HideError(k)
			End If
		End If
	Next
	If iv = 0 Then
		Return True
	Else
		Return False
	End If
End Sub

Sub ShowError(elID As String)
	vue.SetStateSingle($"${elID}error"$, True)
End Sub

Sub HideError(elID As String)
	vue.SetStateSingle($"${elID}error"$, False)
End Sub


private Sub CreateList(sid As String,eventHandler As Object) As VMList
	Dim el As VMList
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

private Sub CreateListItem(sid As String, eventHandler As Object) As VMListItem
	Dim el As VMListItem
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

private Sub CreateButton(sid As String, eventHandler As Object) As VMButton
	Dim el As VMButton
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

private Sub CreateDatePicker(sid As String, eventHandler As Object) As VMDatePicker
	Dim el As VMDatePicker
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub LinkRecordTypes(rec As Map) As Map
	Dim nrec As Map = CreateMap()
	For Each k As String In rec.keys
		Dim v As Object = rec.Get(k)
		k = k.ToLowerCase
		nrec.Put(k, v)
	Next
	If Doubles.Size > 0 Then vue.MakeDouble(nrec, Doubles)
	If Integers.Size > 0 Then vue.MakeInteger(nrec, Integers)
	If Strings.Size > 0 Then vue.MakeTrim(nrec, Strings)
	If Dates.Size > 0 Then vue.MakeDate(nrec, Dates)
	If Booleans.Size > 0 Then vue.MakeBoolean(nrec, Booleans)
	Return nrec
End Sub

Sub NoSpaces(rec As Map, sFields As List) As Map
	Dim nrec As Map = CreateMap()
	For Each k As String In rec.keys
		Dim v As Object = rec.Get(k)
		If sFields.IndexOf(k) = -1 Then
			nrec.Put(k, v)
		Else
			Dim v1 As String = vue.CStr(v)
			v1 = v1.Replace(" ","")
			v1 = v1.trim
			nrec.Put(k, v1)
		End If
	Next
	Return nrec
End Sub

Sub AddIntegers(i As List) As VMContainer
	For Each s As String In i
		Integers.Add(s)
	Next
	Return Me
End Sub

Sub AddStrings(i As List) As VMContainer
	For Each s As String In i
		Strings.Add(s)
	Next
	Return Me
End Sub

Sub AddBooleans(i As List) As VMContainer
	For Each s As String In i
		Booleans.Add(s)
	Next
	Return Me
End Sub

Sub AddDates(i As List) As VMContainer
	For Each s As String In i
		Dates.Add(s)
	Next
	Return Me
End Sub

Sub AddDoubles(d As List) As VMContainer
	For Each s As String In d
		Doubles.Add(s)
	Next
	Return Me
End Sub

Sub AddLabel(row As Int, col As Int, elID As String, elSize As String, elText As String) As VMContainer
	Dim lbl As VMLabel = CreateLABEL(elID).SetTag(elSize).SetText(elText)
	AddComponent(row, col, lbl.ToString)
	Return Me
End Sub

Sub AddButtonPrimary(eventHandler As Object, row As Int, col As Int, btnID As String, btnText As String, btnRaised As Boolean, btnTooltip As String, btnFitWidth As Boolean) As VMContainer
	Dim el As VMButton
	el.Initialize(vue, btnID, eventHandler)
	el.SetLabel(btnText)
	el.SetPrimary(True)
	el.SetBlock(btnFitWidth)
	el.SetToolTip(btnTooltip)
	If btnRaised = False Then el.SetTransparent(True)
	AddComponent(row, col, el.ToString)
	Return Me
End Sub

Sub AddButtonAccent(eventHandler As Object, row As Int, col As Int, btnID As String, btnText As String, btnRaised As Boolean, btnTooltip As String, btnFitWidth As Boolean) As VMContainer
	Dim el As VMButton
	el.Initialize(vue, btnID, eventHandler)
	el.SetLabel(btnText)
	el.SetAccent(True)
	el.SetBlock(btnFitWidth)
	el.SetToolTip(btnTooltip)
	If btnRaised = False Then el.SetTransparent(True)
	AddComponent(row, col, el.ToString)
	Return Me
End Sub

Sub SetTextCenter As VMContainer
	Container.SetTextCenter
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMContainer
	Container.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMContainer
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'clear the contents of the grid
Sub Clear As VMContainer
	Rows.Initialize
	LastRow = 0
	RC.Initialize
	Columns.Initialize
	Components.Initialize
	rowStyles.Initialize 
	rowClasses.Initialize 
	Return Me
End Sub

Sub AddRows(iRows As Int) As VMContainer
	'if there is no existing row, then initialize the map
	'lets store the last row
	LastRow = Rows.size
	'create a new row
	Dim nRow As GridRow
	nRow.Initialize
	nRow.Rows = iRows
	nRow.Columns.Initialize
	nRow.Row = 0 
	'lets store this new row in rows
	Dim rowKey As String = $"${ID}r${LastRow}"$
	'lets save the row on the map
	Rows.Put(rowKey,nRow)
	Return Me
End Sub

Sub AddColumns(iColumns As Int, sm As Int, md As Int, lg As Int, xl As Int) As VMContainer
	AddColumnsOS(iColumns, 0,0,0,0,sm,md,lg,xl)
	Return Me
End Sub

'add columns - offsets and sizes
Sub AddColumnsOS(iColumns As Int, osm As Int, omd As Int, olg As Int, oxl As Int, sm As Int, md As Int, lg As Int, xl As Int) As VMContainer
	Dim nCol As GridColumn
	nCol.Initialize
	nCol.Columns = iColumns
	nCol.Row = 0
	nCol.Col = 0
	nCol.lg = lg
	nCol.md = md
	nCol.sm = sm
	nCol.xl = xl
	nCol.oflg = olg
	nCol.ofmd = omd
	nCol.ofsm = osm
	nCol.ofxl = oxl
	'get the existing columns for this row
	Dim rowkey As String = $"${ID}r${LastRow}"$
	'get the row from existing rows
	If Rows.ContainsKey(rowkey) Then
		'get the row from existing rows
		Dim oldRow As GridRow = Rows.Get(rowkey)
		'get the existing columns from the row
		oldRow.Columns.Add(nCol)
		'save it back
		Rows.Put(rowkey,oldRow)
	End If
	Return Me
End Sub

'add class to a RC
Sub AddClassRC(row As Int, col As Int, classNames As List) As VMContainer
	For Each clsName As String In classNames
		SetClassRC(row, col, clsName)
	Next
	Return Me
End Sub

'apply a theme to an element
Sub UseThemeRC(row As Int, col As Int, themeName As String) As VMContainer
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClassRC(row, col, Array(sclass))
	End If
	Return Me
End Sub

'add a class to a row/column
Sub SetClassRC(rowPos As Int, colPos As Int, className As String) As VMContainer
	'class names should be unique for the row
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowClasses.ContainsKey(rowKey) Then
		rowc = rowClasses.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put(className,className)
	rowClasses.Put(rowKey,rowc)
	Return Me
End Sub

Sub AddColumns3x4 As VMContainer
	AddColumns(3,"12","4","4","4")
	Return Me
End Sub

Sub AddColumns4x3 As VMContainer
	AddColumns(4,"12","3","3","3")
	Return Me
End Sub

Sub AddColumns2x6 As VMContainer
	AddColumns(2,"12","6","6","6")
	Return Me
End Sub

Sub AddColumns6x2 As VMContainer
	AddColumns(6,"12","2","2","2")
	Return Me
End Sub

Sub AddColumns12x1 As VMContainer
	AddColumns(12,"12","1","1","1")
	Return Me
End Sub

Sub AddColumns8p4 As VMContainer
	AddColumns(1,"12","8","8","8").AddColumns(1,"12","4","4","4")
	Return Me
End Sub

Sub AddColumns4p8 As VMContainer
	AddColumns(1,"12","4","4","4").AddColumns(1,"12","8","8","8")
	Return Me
End Sub

Sub AddColumns1p11 As VMContainer
	AddColumns(1,"12","1","1","1").AddColumns(1,"12","11","11","11")
	Return Me
End Sub

Sub AddColumns11p1 As VMContainer
	AddColumns(1,"12","11","11","11").AddColumns(1,"12","1","1","1")
	Return Me
End Sub

Sub AddColumns2p10 As VMContainer
	AddColumns(1,"12","2","2","2").AddColumns(1,"12","10","10","10")
	Return Me
End Sub

Sub AddColumns10p2 As VMContainer
	AddColumns(1,"12","10","10","10").AddColumns(1,"12","2","2","2")
	Return Me
End Sub

Sub AddColumns3p9 As VMContainer
	AddColumns(1,"12","3","3","3").AddColumns(1,"12","9","9","9")
	Return Me
End Sub

Sub AddColumns9p3 As VMContainer
	AddColumns(1,"12","9","9","9").AddColumns(1,"12","3","3","3")
	Return Me
End Sub

Sub AddColumns7p5 As VMContainer
	AddColumns(1,"12","7","7","7").AddColumns(1,"12","5","5","5")
	Return Me
End Sub

Sub AddColumns5p7 As VMContainer
	AddColumns(1,"12","5","5","5").AddColumns(1,"12","7","7","7")
	Return Me
End Sub

Sub AddColumns12 As VMContainer
	AddColumns(1,"12","12","12","12")
	Return Me
End Sub

'add a style to a column
Sub SetStyleRC(rowPos As Int, colPos As Int, prop As String, value As String) As VMContainer
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowStyles.ContainsKey(rowKey) Then
		rowc = rowStyles.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put(prop,value)
	rowStyles.Put(rowKey,rowc)
	Return Me
End Sub

'add an attribute to rc
Sub SetAttrRC(rowPos As Int, colPos As Int, prop As String, value As String) As VMContainer
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put(prop,value)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

'set the border of the rc
Sub SetBorderRC(rowPos As Int, colPos As Int, width As String, color As String, bstyle As String) As VMContainer
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowStyles.ContainsKey(rowKey) Then
		rowc = rowStyles.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("border-style", bstyle)
	rowc.Put("border-width", width)
	rowc.Put("border-color", color)
	rowStyles.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetMarginsRC(rowPos As Int, colPos As Int, mt As Object, mb As Object, ml As Object, mr As Object) As VMContainer
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowStyles.ContainsKey(rowKey) Then
		rowc = rowStyles.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	If mt <> Null Then rowc.Put("margin-top", mt)
	If mb <> Null Then rowc.Put("margin-bottom", mb)
	If ml <> Null Then rowc.Put("margin-left", ml)
	If mr <> Null Then rowc.Put("margin-right", mr)
	rowStyles.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetPaddingRC(rowPos As Int, colPos As Int, pt As Object, pb As Object, pl As Object, pr As Object) As VMContainer
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowStyles.ContainsKey(rowKey) Then
		rowc = rowStyles.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	If pt <> Null Then rowc.Put("padding-top", pt)
	If pb <> Null Then rowc.Put("padding-bottom", pb)
	If pl <> Null Then rowc.Put("padding-left", pl)
	If pr <> Null Then rowc.Put("padding-right", pr)
	rowStyles.Put(rowKey,rowc)
	Return Me
End Sub

private Sub CStr(o As Object) As String
	If o = BANano.UNDEFINED Then o = ""
	Return "" & o
End Sub

private Sub MapKeys2Delim(m As Map, delim As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	Dim kTot As Int = m.Size - 1
	Dim kCnt As Int
	Dim strKey As String = m.getkeyat(0)
	sb.Append(strKey)
	For kCnt = 1 To kTot
		Dim strKey As String = m.getkeyat(kCnt)
		sb.Append(delim).append(strKey)
	Next
	Return sb.ToString
End Sub

'build a single row
private Sub BuildRow(row As GridRow) As String
	'how many rows do we have to render
	Dim rowTot As Int = row.Rows
	Dim rowCnt As Int
	'
	Dim sb As StringBuilder
	sb.Initialize
	'for each row
	For rowCnt = 1 To rowTot
		LastRow = LastRow + 1
		row.Row = CStr(LastRow)
		Dim rowKey As String = $"${ID}r${LastRow}"$
		'
		Dim tRow As VMRow
		tRow.Initialize(vue, rowKey, Module)
		'detect if we have styles for the Row
		If rowStyles.ContainsKey(rowKey) Then
			Dim cm As Map = rowStyles.Get(rowKey)
			For Each strkey As String In cm.Keys
				Dim strVal As String = cm.Get(strkey)
				tRow.SetStyleSingle(strkey, strVal)
			Next
		End If
		'detect if we have classes for this row
		If rowClasses.ContainsKey(rowKey) Then
			'get keys and add them
			Dim cm As Map = rowClasses.Get(rowKey)
			Dim clsName As String = MapKeys2Delim(cm, " ")
			tRow.AddClass(clsName)
		End If
		'detect if we have an attribute
		If attributes.ContainsKey(rowKey) Then
			Dim cm As Map = attributes.Get(rowKey)
			For Each strkey As String In cm.Keys
				Dim strVal As String = cm.Get(strkey)
				tRow.SetAttrSingle(strkey, strVal)
			Next
		End If
				
		'get the columns to add
		Dim cols As List = row.Columns
		'how many columns to add here
		Dim colCnt As Int = 0
		Dim colTot As Int = cols.Size - 1
		'this will store the column count
		Dim LastColumn As Int = 0
		For colCnt = 0 To colTot
			'get this column
			Dim column As GridColumn = cols.Get(colCnt)
			Dim colCnt1 As Int = 0
			Dim colTot1 As Int = column.Columns
			For colCnt1 = 1 To colTot1
				'increment the column to add for this row
				LastColumn = LastColumn + 1
				column.Row = CStr(LastRow)
				column.Col = CStr(LastColumn)
				Dim cellKey As String = $"${rowKey}c${LastColumn}"$
				'add to RC map, this is used to check if Matrix Position Exist
				RC.Put(cellKey,cellKey)
				'if showid
				
				Dim tColumn As VMCol
				tColumn.Initialize(vue,cellKey,Module)
				tColumn.SetLg(column.lg)
				tColumn.SetSm(column.sm)
				tColumn.SetMd(column.md)
				tColumn.SetXl(column.xl)
				tColumn.SetOffsetSm(column.ofsm)
				tColumn.SetOffsetMd(column.ofmd)
				tColumn.SetOffsetLg(column.oflg)
				tColumn.SetOffsetXl(column.ofxl)
				'
				'detect if we have styles for the rc
				If rowStyles.ContainsKey(cellKey) Then
					Dim cm As Map = rowStyles.Get(cellKey)
					For Each strkey As String In cm.Keys
						Dim strVal As String = cm.Get(strkey)
						tColumn.SetStyleSingle(strkey, strVal)
					Next
				End If
				'
				'detect if we have classes for this row
				If rowClasses.ContainsKey(cellKey) Then
					'get keys and add them
					Dim cm As Map = rowClasses.Get(cellKey)
					Dim clsName As String = MapKeys2Delim(cm, " ")
					tColumn.AddClass(clsName)
				End If
				'
				'detect if we have an attribute
				If attributes.ContainsKey(cellKey) Then
					Dim cm As Map = attributes.Get(cellKey)
					For Each strkey As String In cm.Keys
						Dim strVal As String = cm.Get(strkey)
						tColumn.SetAttrSingle(strkey, strVal)
					Next
				End If
		
				If Components.ContainsKey(cellKey) Then
					Dim lst As List = Components.Get(cellKey)
					tColumn.AddContentList(lst)
				End If
				tRow.SetText(tColumn.ToString)
			Next
		Next
		Dim strRow As String = tRow.tostring
		sb.Append(strRow)
	Next
	Return sb.tostring
End Sub

'add a component to the grid as html
Sub AddComponent(rowPos As Int, colPos As Int, elHTML As String)
	rowPos = CStr(rowPos)
	colPos = CStr(colPos)
	If rowPos = "0" And colPos = "0" Then
		SetText(elHTML)
	Else
		Dim cellKey As String = $"${ID}r${rowPos}c${colPos}"$
		Dim lst As List
		If Components.ContainsKey(cellKey) Then
			lst = Components.Get(cellKey)
		Else
			lst.Initialize
		End If
		lst.Add(elHTML)
		Components.Put(cellKey,lst)
	End If
End Sub

'backward compatibility
Sub AddControl(el As VMElement, template As String, r As String, c As String, os As String, om As String, ol As String, oxl As String, s As String, m As String, l As String, xl As String)
	el.SetDeviceOffsets(os, om, ol,oxl)
	el.SetDevicePositions(r, c, s, m, l, xl)
	AddControl1(el, template)
End Sub

'add a control that will be automatically grid designed
Sub AddControlOnly(el As VMElement, template As String) As VMContainer
	AddControl1(el, template)
	Return Me
End Sub

'add a control that will be automatically grid designed
Sub AddControl1(el As VMElement, template As String)
	Controls.Add(el)
	bControls = True
	'get the row
	Dim r As String = el.R
	'get the column
	Dim c As String = el.c
	'
	Dim sRow As String = vue.PadRight(r,2,"0")
	Dim sCell As String = vue.PadRight(c,2,"0")
	Dim rcKey As String = $"${sRow}.${sCell}"$
	'to sort the rc locations by row and cel
	sortitM.Put(rcKey, el)
	If BANano.parseInt(r) > TotalRows Then
		TotalRows = BANano.parseInt(r)
	End If
	'
	Dim showKey As String = $"${el.vmodel}show"$
	Dim disKey As String = $"${el.vmodel}disabled"$
	Dim enaKey As String = $"${el.vmodel}required"$
	Dim errKey As String = $"${el.vmodel}error"$
	visibility.Put(showKey, el.Isvisible)
	'
	AddComponent(el.r, el.C, template)
	Select Case el.typeOf
	Case "checkbox", "switchbox"
		Dim newoption As CheckedUnchecked
		newoption.Initialize
		newoption.fieldname = el.vmodel
		newoption.checkedValue = el.Value
		newoption.uncheckedValue = el.UncheckedValue 
		afewoptions.Add(newoption)
	End Select
	'
	If DesignMode = False Then
		vue.SetStateSingle(showKey, el.Isvisible)
		vue.SetStateSingle(disKey, el.IsDisabled)
		vue.SetStateSingle(enaKey, el.IsRequired)
		If el.isarray Then
			vue.SetStateSingle(el.vmodel, Array())
		Else
			vue.SetStateSingle(el.vmodel, el.defaultValue)
		End If
		vue.SetStateSingle(errKey, False)
	End If	
End Sub

'get component
Sub ToString As String
	If bControls Then CreateGrid
	
	'hold row counter
	LastRow = 0
	Dim sb As StringBuilder
	sb.Initialize
	'for each defined row, for each defined column
	Dim rowCnt As Int = 0
	Dim rowTot As Int = Rows.Size - 1
	For rowCnt = 0 To rowTot
		'get the row key, should be r1, r2 etc
		Dim rowKey As String = Rows.GetKeyAt(rowCnt)
		Dim currentRow As GridRow = Rows.Get(rowKey)
		Dim strRow As String = BuildRow(currentRow)
		sb.Append(strRow)
	Next
	'set the result of the container
	SetText(sb.tostring)
	Return Container.ToString
End Sub

Sub SetVModel(k As String) As VMContainer
	Container.SetVModel(k)
	Return Me
End Sub

'check if the row exists
Sub RowExists(rowPos As Int) As Boolean
	Dim rowcol As String = $"${ID}r${rowPos}"$
	Return Rows.ContainsKey(rowcol)
End Sub

'check if the column exist
Sub ColumnExists(rowPos As Int, colPos As Int) As Boolean
	Dim rowcol As String = $"${ID}r${rowPos}c${colPos}"$
	Return RC.ContainsKey(rowcol)
End Sub

'how many rows do we have
Sub HowManyRows() As Int
	Return LastRow
End Sub

Sub SetVIf(vif As Object) As VMContainer
	Container.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMContainer
	Container.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMContainer
	Dim childHTML As String = child.ToString
	Container.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMContainer
	Container.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMContainer
	Container.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMContainer
	Container.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMContainer
	Container.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set fluid
Sub SetFluid(varFluid As Object) As VMContainer
	Dim pp As String = $"${ID}Fluid"$
	vue.SetStateSingle(pp, varFluid)
	Container.Bind(":fluid", pp)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMContainer
	Container.UseTheme(themeName)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMContainer
	Container.SetTag(varTag)
	Return Me
End Sub

Sub Hide As VMContainer
	Container.SetVisible(False)
	Return Me
End Sub

Sub Show As VMContainer
	Container.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMContainer
	Container.Enable(True)
	Return Me
End Sub

Sub Disable As VMContainer
	Container.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMContainer
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMContainer
	Container.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMContainer
	Container.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMContainer
	Container.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMContainer
	Container.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMContainer
	Container.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMContainer
	Container.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMContainer
	Container.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMContainer
	Container.SetAttrSingle(prop, value)
	Return Me
End Sub

private Sub CreateImage(img As String, eventHandler As Object) As VMImage
	Dim el As VMImage
	el.Initialize(vue, img, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

private Sub CreateLABEL(lblID As String) As VMLabel
	Dim el As VMLabel
	el.Initialize(vue, lblID)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

private Sub CreateChip(sid As String, eventHandler As Object) As VMChip
	Dim el As VMChip
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

private Sub CreateRadioGroup(sid As String, eventHandler As Object) As VMRadioGroup
	Dim el As VMRadioGroup
	el.Initialize(vue, sid, eventHandler)
	el.SetVModel(sid)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

private Sub CreateTimePicker(sid As String, eventHandler As Object) As VMTimePicker
	Dim el As VMTimePicker
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

' build the grid for a container
private Sub CreateGrid
	'get the keys and sort them
	'build the controls
	For Each el As VMElement In Controls
		If el.Exclude = True Then Exclusions.Add(el.id)
		'check exclusions
		Dim idxpos As Int = Exclusions.IndexOf(el.id)
		If idxpos = -1 Then
			Select Case el.typeOf
				Case "button", "list", "image", "label"
					el.fieldType = ""
					el.IsRequired = False
				Case Else
					Fields.Add(el.vmodel)
					Defaults.Put(el.vmodel, el.defaultValue)
			End Select
			If el.isrequired Then Required.put(el.vmodel, el.vmodel)
			Select Case el.fieldType
				Case "int"
					Integers.Add(el.vmodel)
				Case "bool"
					Booleans.Add(el.vmodel)
				Case "string"
					Strings.Add(el.vmodel)
				Case "date"
					Dates.Add(el.vmodel)
				Case "dbl"
					Doubles.Add(el.vmodel)
			End Select
		End If
	Next
	
	'define sort order of grid
	sortItL.Initialize
	For Each k As String In sortitM.Keys
		sortItL.Add(k)
	Next
	' sort the rcs
	sortItL.Sort(True)
	'find out if we have a missing rc
	Dim missingRC As List
	missingRC.Initialize
	For compCnt = 1 To TotalRows
		Dim sRow As String = compCnt
		sRow = vue.PadRight(sRow, 2, "0")
		Dim sCell As String = vue.PadRight("1", 2, "0")
		Dim rcKey As String = $"${sRow}.${sCell}"$
		If sortItL.IndexOf(rcKey) = -1 Then
			missingRC.Add(rcKey)
		End If
	Next
	If missingRC.Size -1 >= 0 Then
		For Each strRC As String In missingRC
			Log("VMContainer.CreateGrid: "& strRC & ": RC is NOT defined")
		Next
		'nothing will be drawn if there is a missing element
		Return
	End If
	'add the grid definition
	'link related columns to the rows use the sorted list
	'if we have records falling in the same row, sequence them
	Dim finalRows As Map
	finalRows.Initialize
	For Each strRC As String In sortItL
		Dim sRow As String = vue.MvField(strRC,1,".")
		If finalRows.ContainsKey(sRow) Then
			Dim finalCells As List = finalRows.Get(sRow)
		Else
			Dim finalCells As List
			finalCells.Initialize
		End If
		finalCells.Add(strRC)
		finalRows.Put(sRow,finalCells)
	Next
	'sort the row numbers
	'grid creates rows in sequence
	sortItL.Initialize
	For Each strRow As String In finalRows.Keys
		sortItL.Add(strRow)
	Next
	sortItL.Sort(True)
	Dim colCnt As Int
	For Each finalRow As String In sortItL
		'build the grid
		Dim finalCell(11) As String
		Dim ec(11) As VMElement
		
		'add the row
		Dim finalCells As List = finalRows.Get(finalRow)
		'how many controls do we have per row, add appropriate cells
		Dim finalCellsSize As Int = finalCells.Size - 1
		For colCnt = 0 To finalCellsSize
			finalCell(colCnt) = finalCells.Get(colCnt)
			ec(colCnt) = sortitM.Get(finalCell(colCnt))
		Next
		'add the row
		AddRows(1)
		Dim cellSize As Int
		For cellSize = 0 To finalCellsSize
			'add columns to the row
			AddColumnsOS(1, ec(cellSize).os, ec(cellSize).om, ec(cellSize).ol, ec(cellSize).ox, _
			ec(cellSize).ss, ec(cellSize).sm, ec(cellSize).sl, ec(cellSize).sx)
		Next
	Next
End Sub


private Sub CreateInfoBox(sid As String, eventHandler As Object) As VMInfoBox
	HasInfoBox = True
	Dim el As VMInfoBox
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

private Sub CreateTextArea(sid As String, eventHandler As Object) As VMTextArea
	Dim el As VMTextArea
	el.Initialize(vue, sid,eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub


private Sub CreateFileInput(sid As String, eventHandler As Object) As VMFileInput
	Dim el As VMFileInput
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

private Sub CreateTextField(sid As String, eventHandler As Object) As VMTextField
	Dim el As VMTextField
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub


private Sub CreateSlider(sid As String, eventHandler As Object) As VMSlider
	Dim el As VMSlider
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub


private Sub CreateNumber(sid As String, eventHandler As Object) As VMTextField
	Dim el As VMTextField
	el = CreateTextField(sid, eventHandler).SetTypeNumber(True)
	Return el
End Sub

private Sub CreateSelect(sid As String, eventHandler As Object) As VMSelect
	Dim el As VMSelect
	el.Initialize(vue,sid,eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub


private Sub CreateSwitch(sid As String, eventHandler As Object) As VMSwitch
	Dim el As VMSwitch
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

private Sub CreateCheckBox(sid As String, eventHandler As Object) As VMCheckBox
	Dim el As VMCheckBox
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

private Sub CreateIcon(sid As String, eventHandler As Object) As VMIcon
	Dim el As VMIcon
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

private Sub CreateAutoComplete(sid As String, eventHandler As Object) As VMAutoComplete
	Dim el As VMAutoComplete
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMContainer
	Container.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMContainer
	Container.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMContainer
	Container.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMContainer
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMContainer
	Container.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMContainer
	Container.SetVisible(b)
	Return Me
End Sub