B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public DataGridSelect As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private Module As Object
	'column type
	Public COLUMN_DATE As String = "date"
	Public COLUMN_TEXT As String = "text"
	Public COLUMN_ICON As String = "icon"
	Public COLUMN_CHECKBOX As String = "checkbox"
	Public COLUMN_NONE As String = ""
	Public COLUMN_TIME As String = "time"
	Public COLUMN_DATETIME As String = "datetime"
	Public COLUMN_IMAGE As String = "image"
	Public COLUMN_MONEY As String = "money"
	Public COLUMN_NUMBER As String = "number"
	Public COLUMN_FILESIZE As String = "filesize"
	Public COLUMN_CHIP As String = "chip"
	Public COLUMN_SWITCH As String = "switch"
	Public COLUMN_AVATARIMG As String = "avatarimg"
	Public COLUMN_RATING As String = "rating"
	Public COLUMN_PROGRESS_CIRCULAR As String = "progresscircular"
	Public COLUMN_PROGRESS_LINEAR As String = "progresslinear"
		
	'alignment
	Public ALIGN_CENTER As String = "center"
	Public ALIGN_RIGHT As String = "end"
	Public ALIGN_LEFT As String = "start"
	'
	Private columnsM As Map
	Private headers As String
	Private items As String
	Private hdr As List
	Private keyID As String
	Private hasTotals As Boolean
	Private selected As String
	Private controlType As String
End Sub

'initialize the DataGridSelect
'<code>dt.Initialize(vue, "dt1", "id", Me)
'</code>
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDataGridSelect
	ID = sid.tolowercase
	vue = v
	Module = eventHandler
	keyID = $"${ID}key"$
	DataGridSelect.Initialize(v, ID)
	DataGridSelect.SetTag("v-data-grid-select")
	headers = $"${ID}headers"$
	items = $"${ID}items"$
	selected = $"${ID}selected"$
	vue.SetData(headers, vue.newlist)
	vue.SetData(items, vue.newlist)
	vue.SetData(selected, vue.NewList)
	'SetSortBy(vue.newlist)
	'SetGroupBy(vue.NewList)
	'SetExpanded(vue.NewList)
	'SetGroupDesc(vue.NewList)
	'SetSortDesc(vue.NewList)
	'SetValue(vue.NewList)
	'
	columnsM.Initialize
	controlType = "auto"
	SetOnChange(Module, $"${ID}_change"$)
	SetVModel(selected)
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	DataGridSelect.SetText(elm.ToString)
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Boolean) As VMDataGridSelect
	If varHideDetails = False Then Return Me
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	DataGridSelect.Bind(":hide-details", pp)
	Return Me
End Sub

'set hint
Sub SetHint(varHint As String) As VMDataGridSelect
	If varHint = "" Then Return Me
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	DataGridSelect.Bind(":hint", pp)
	Return Me
End Sub


'set outlined
Sub SetOutlined(varOutlined As Boolean) As VMDataGridSelect
	If varOutlined = False Then Return Me
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	DataGridSelect.Bind(":outlined", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Boolean) As VMDataGridSelect
	If varPersistentHint = False Then Return Me
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	DataGridSelect.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set placeholder
Sub SetPlaceholder(varPlaceholder As String) As VMDataGridSelect
	If varPlaceholder = "" Then Return Me
	Dim pp As String = $"${ID}Placeholder"$
	vue.SetStateSingle(pp, varPlaceholder)
	DataGridSelect.Bind(":placeholder", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Boolean) As VMDataGridSelect
	If varRounded = False Then Return Me
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	DataGridSelect.Bind(":rounded", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Boolean) As VMDataGridSelect
	If varShaped = False Then Return Me
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	DataGridSelect.Bind(":shaped", pp)
	Return Me
End Sub

'set single-line
Sub SetSingleLine(varSingleLine As Boolean) As VMDataGridSelect
	If varSingleLine = False Then Return Me
	Dim pp As String = $"${ID}SingleLine"$
	vue.SetStateSingle(pp, varSingleLine)
	DataGridSelect.Bind(":single-line", pp)
	Return Me
End Sub

'set small-chips
Sub SetSmallChips(varSmallChips As Boolean) As VMDataGridSelect
	If varSmallChips = False Then Return Me
	Dim pp As String = $"${ID}SmallChips"$
	vue.SetStateSingle(pp, varSmallChips)
	DataGridSelect.Bind(":small-chips", pp)
	Return Me
End Sub

'set solo
Sub SetSolo(varSolo As Boolean) As VMDataGridSelect
	If varSolo = False Then Return Me
	Dim pp As String = $"${ID}Solo"$
	vue.SetStateSingle(pp, varSolo)
	DataGridSelect.Bind(":solo", pp)
	Return Me
End Sub

'set solo-inverted
Sub SetSoloInverted(varSoloInverted As Boolean) As VMDataGridSelect
	If varSoloInverted = False Then Return Me
	Dim pp As String = $"${ID}SoloInverted"$
	vue.SetStateSingle(pp, varSoloInverted)
	DataGridSelect.Bind(":solo-inverted", pp)
	Return Me
End Sub


Sub SetOnChange(eventHandler As Object, methodName As String) As VMDataGridSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim value As Object
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(value))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'set deletable-chips
Sub SetDeletableChips(varDeletableChips As Boolean) As VMDataGridSelect
	If varDeletableChips = False Then Return Me
	Dim pp As String = $"${ID}DeletableChips"$
	vue.SetStateSingle(pp, varDeletableChips)
	DataGridSelect.Bind(":deletable-chips", pp)
	Return Me
End Sub


'set color
Sub SetColor(varColor As String) As VMDataGridSelect
	If varColor = "" Then Return Me
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	DataGridSelect.Bind(":color", pp)
	Return Me
End Sub

'clear the contents of the list
Sub Clear As VMDataGridSelect
	vue.SetData(items, vue.NewList)
	Return Me
End Sub

'set items
Sub SetItems(varItems As String) As VMDataGridSelect
	If varItems = "" Then Return Me
	varItems = varItems.tolowercase
	DataGridSelect.SetAttrsingle(":items", varItems)
	Return Me
End Sub

'set selected-color
Sub SetSelectedColor(varSelectedColor As String) As VMDataGridSelect
	If varSelectedColor = "" Then Return Me
	Dim pp As String = $"${ID}SelectedColor"$
	vue.SetStateSingle(pp, varSelectedColor)
	DataGridSelect.Bind(":selected-color", pp)
	Return Me
End Sub

'set chips
Sub SetChips(varChips As Boolean) As VMDataGridSelect
	If varChips = False Then Return Me
	Dim pp As String = $"${ID}Chips"$
	vue.SetStateSingle(pp, varChips)
	DataGridSelect.Bind(":chips", pp)
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Boolean) As VMDataGridSelect
	If varClearable = False Then Return Me
	Dim pp As String = $"${ID}Clearable"$
	vue.SetStateSingle(pp, varClearable)
	DataGridSelect.Bind(":clearable", pp)
	Return Me
End Sub

'set autocomplete
Sub SetAutoComplete(varAutoComplete As Boolean) As VMDataGridSelect
	If varAutoComplete = False Then Return Me
	Dim pp As String = $"${ID}AutoComplete"$
	vue.SetStateSingle(pp, varAutoComplete)
	DataGridSelect.Bind(":autocomplete", pp)
	Return Me
End Sub

'set all selected
Sub SetSelected(nl As List)
	vue.SetData(selected, nl)
End Sub

'get all selected
Sub GetSelected As List
	Dim lst As List = vue.GetData(selected)
	Return lst
End Sub

'get all the data from the table
Sub GetData As List
	Dim lst As List = vue.GetData(items)
	Return lst
End Sub

'set vuejs state
Sub SetData(prop As String, value As Object) As VMDataGridSelect
	vue.SetData(prop, value)
	Return Me
End Sub

'reset the structure of the data-table
Sub Reset
	columnsM.Initialize
	vue.SetData(headers, vue.newlist)
	vue.SetData(items, vue.newlist)
	vue.SetData(selected, vue.NewList)
	'SetSortBy(vue.newlist)
	'SetGroupBy(vue.NewList)
	'SetExpanded(vue.NewList)
	'SetGroupDesc(vue.NewList)
	'SetSortDesc(vue.NewList)
	'SetValue(vue.NewList)
	vue.SetData($"${ID}columns"$, vue.newlist)
	vue.SetData($"${ID}fsource"$, vue.newlist)
	'SetPage("1")
	vue.SetData($"${ID}pagecount"$, "0")
	vue.SetData(keyID, DateTime.Now)
End Sub


'set dynamic data after adding columns
Sub ResetColumns
	BuildHeaders(columnsM)
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMDataGridSelect
	DataGridSelect.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMDataGridSelect
	DataGridSelect.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMDataGridSelect
	DataGridSelect.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMDataGridSelect
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'add icon field
Sub AddIconView(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_ICON)
	SetColumnFilterable(colField,False)
	SetColumnSortable(colField, False)
End Sub

'add switch field
Sub AddSwitch(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_SWITCH)
	SetColumnFilterable(colField,False)
	SetColumnSortable(colField, False)
End Sub

'set a field as a switch
Sub SetColumnsSwitch(colFields As List)
	For Each col As String In colFields
		SetColumnType(col, COLUMN_SWITCH)
		SetColumnFilterable(col,False)
		SetColumnSortable(col, False)
	Next
End Sub

'set column as a checkbox
Sub SetColumnsCheckBox(colFields As List)
	For Each col As String In colFields
		SetColumnType(col, COLUMN_CHECKBOX)
		SetColumnFilterable(col,False)
		SetColumnSortable(col, False)
	Next
End Sub

'add an image
Sub AddImage(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_IMAGE)
	SetColumnFilterable(colField,False)
	SetColumnSortable(colField, False)
End Sub

'add an avatar image
Sub AddAvatarImg(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_AVATARIMG)
	SetColumnFilterable(colField,False)
	SetColumnSortable(colField, False)
End Sub

'add a rating
Sub AddRating(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_RATING)
End Sub

'add a progress circular
Sub AddProgressCircular(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_PROGRESS_CIRCULAR)
End Sub

'add a progress linear
Sub AddProgressLinear(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_PROGRESS_LINEAR)
End Sub

'return the chosen columns
Sub GetSelectedColumns As List
	Dim cols As List = vue.GetData($"${ID}columns"$)
	Return cols
End Sub

'use an existing state
Sub SetDataSource(recs As List, key As String, value As String) As VMDataGridSelect
	vue.SetData(items, recs)
	SetItemText(value)
	SetItemKey(key)
	SetReturnObject(False)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Boolean) As VMDataGridSelect
	If varMultiple = False Then Return Me
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	DataGridSelect.Bind(":multiple", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As String) As VMDataGridSelect
	If varLabel = "" Then Return Me
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	DataGridSelect.Bind(":label", pp)
	Return Me
End Sub

'set return-object
Sub SetReturnObject(varReturnObject As Boolean) As VMDataGridSelect
	'Select Case controlType
	'Case "auto", "select"
	'	If varReturnObject = False Then Return Me
	'Case "combo"
	'   If varReturnObject = True Then Return Me
	'End Select
	SetAttrSingle(":return-object", varReturnObject)
	Return Me
End Sub


'set selectable
Sub SetSelectable(varSelectable As Boolean) As VMDataGridSelect
	If varSelectable = False Then Return Me
	Dim pp As String = $"${ID}Selectable"$
	vue.SetStateSingle(pp, varSelectable)
	DataGridSelect.Bind(":selectable", pp)
	Return Me
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMDataGridSelect
	If varActiveClass = "" Then Return Me
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	DataGridSelect.Bind(":active-class", pp)
	Return Me
End Sub


'add a column
Sub AddColumn(colName As String, colTitle As String) As VMDataGridSelect
	AddColumn1(colName, colTitle, COLUMN_TEXT, 0, True, ALIGN_LEFT)
	Return Me
End Sub

'add date column and use any of dayjs formats
'<code>dt.AddDateColumn("dateColumn", "Date", "DD/MM/YYY")
'</code>
Sub AddDateColumn(colName As String, colTitle As String, colFormat As String) As VMDataGridSelect
	AddColumn(colName, colTitle)
	SetColumnDateFormat(colName, colFormat)
	Return Me
End Sub

'add date time column and use any dayjs formats
'<code>dt.AddDateColumn("dateColumn", "Date", "DD/MM/YYY HH:MM:SS")
'</code>
Sub AddDateTimeColumnDate(colName As String, colTitle As String, colFormat As String) As VMDataGridSelect
	AddColumn(colName, colTitle)
	SetColumnDateTimeFormat(colName, colFormat)
	Return Me
End Sub

'add number column and use any numeraljs formats
'<code>dt.AddNumberColumn("money", "Received", "$0,0.00")
'</code>
Sub AddNumberColumn(colName As String, colTitle As String, colFormat As String) As VMDataGridSelect
	AddColumn(colName, colTitle)
	SetColumnNumberFormat(colName, colFormat)
	Return Me
End Sub

'add columns from key value pairs
Sub AddColumns(flds As Map) As VMDataGridSelect
	For Each k As String In flds.Keys
		Dim v As String = flds.Get(k)
		AddColumn(k, v)
	Next
	Return Me
End Sub

'add a column
'key, title, 
Sub AddColumn1(colName As String, colTitle As String, colType As String, colWidth As Int, colSortable As Boolean, colAlign As String) As VMDataGridSelect
	Dim nf As DataTableColumn
	nf.Initialize
	nf.text = colTitle
	nf.value = colName
	nf.align = colAlign
	nf.sortable = colSortable
	nf.filterable = True  ' can search
	nf.divider = False
	nf.className = Null
	nf.width = colWidth
	nf.filter = Null
	nf.sort = Null
	nf.TypeOf = colType
	nf.Disabled = False
	nf.valueFormat = ""
	nf.bindTotals = ""
	nf.hasTotal = False
	'
	columnsM.Put(colName, nf)
	SetColumnType(colName, colType)
	Return Me
End Sub

'define whether a column will be totalled or not
Sub SetColumnTotal(colName As String, callBackMethod As String) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.bindTotals = callBackMethod
		columnsM.Put(colName,col)
		hasTotals = True
	End If
	Return Me
End Sub

'set image dimensions
Sub SetImageDimensions(colName As String, imgHeight As String, imgWidth As String) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.imgHeight = imgHeight
		col.imgWidth = imgWidth
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column sortable
Sub SetColumnSortable(colName As String, colSortable As Boolean) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.sortable = colSortable
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column sortable
Sub SetColumnDisabled(colName As String, colDisabled As Boolean) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.Disabled = colDisabled
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column sortable
Sub SetColumnReadOnly(colName As String, colReadOnly As Boolean) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.ReadOnly = colReadOnly
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set the column data template
Sub SetColumnAlignment(colName As String, colAlign As String) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.align = colAlign
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set the column data template
Sub SetColumnExtra(colName As String, colExtra As String) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.extra = colExtra
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'change column icon
Sub SetColumnIcon(colName As String, icon As String) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.icon = icon
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set icon dimension
Sub SetIconDimensions(colName As String, iconSize As String, iconColor As String) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.iconSize = iconSize
		col.iconColor = iconColor
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

Sub SetIconDimensions1(colName As String, iconSize As String, iconColor As String, columnWidth As String) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.iconSize = iconSize
		col.iconColor = iconColor
		col.width = columnWidth
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set progress circular dialog
Sub SetProgressCircularDimensions(colName As String, progressColor As String, progressRotate As String, progressSize As String, progressWidth As String) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.progressRotate = progressRotate
		col.progressSize = progressSize
		col.progressWidth = progressWidth
		col.progressColor = progressColor
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

Sub SetProgressLinearDimensions(colName As String, progressColor As String, progressHeight As String, progressShowValue As Boolean) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.progressHeight = progressHeight
		col.progressShowValue = progressShowValue
		col.progressColor = progressColor
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set rating dimensions
Sub SetRatingDimensions(colName As String, ratLength As String, ratColor As String) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.iconSize = ratLength
		col.iconColor = ratColor
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub


'set the column data template
Sub SetColumnWidth(colName As String, colWidth As Int) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.width = colWidth
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column filterable
Sub SetColumnFilterable(colName As String, colFilter As Boolean) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.filterable = colFilter
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column class
Sub SetColumnClass(colName As String, colClass As String) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.classname = colClass
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'build headers
private Sub BuildHeaders(colNames As Map)
	hdr.Initialize
	'
	For Each k As String In colNames.keys
		'get the column details
		Dim nf As DataTableColumn = colNames.Get(k)
		'
		Dim header As Map = CreateMap()
		header.Initialize
		header.put("text", nf.text)
		header.put("value", nf.value)
		header.put("align", nf.align)
		header.put("sortable", nf.Sortable)
		header.put("filterable", nf.filterable)
		header.put("divider", nf.divider)
		header.Put("class", nf.classname)
		If nf.width <> 0 Then header.Put("width", nf.width)
		If nf.filter <> Null Then header.put("filter", nf.filter)
		If nf.sort <> Null Then header.Put("sort", nf.sort)
		hdr.Add(header)
	Next
	vue.SetData(headers, hdr)
End Sub

'set the column data template
Sub SetColumnType(colName As String, colType As String) As VMDataGridSelect
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.TypeOf = colType
		Select Case colType
			Case COLUMN_IMAGE, COLUMN_AVATARIMG, COLUMN_SWITCH
				col.filterable = False
			Case COLUMN_NUMBER
				col.align = ALIGN_RIGHT
				col.valueFormat = "0"
				Dim item As Map
				Dim value As String
				Dim cb As BANanoObject = BANano.CallBack(Me, "getmoneyformat", Array(item, value))
				'add to methods
				vue.SetCallBack("getmoneyformat", cb)
			Case COLUMN_MONEY
				col.align = ALIGN_RIGHT
				col.valueFormat = "0,0.00"
				Dim item As Map
				Dim value As String
				Dim cb As BANanoObject = BANano.CallBack(Me, "getmoneyformat", Array(item, value))
				'add to methods
				vue.SetCallBack("getmoneyformat", cb)
			Case COLUMN_FILESIZE
				col.align = ALIGN_RIGHT
				Dim item As Map
				Dim cb As BANanoObject = BANano.CallBack(Me, "getfilesize", Array(item))
				'add to methods
				vue.SetCallBack("getfilesize", cb)
			Case COLUMN_DATE
				col.valueFormat = "yyyy-MM-dd"
				Dim item As Map
				Dim value As String
				Dim cb As BANanoObject = BANano.CallBack(Me, "getdateformat", Array(item, value))
				'add to methods
				vue.SetCallBack("getdateformat", cb)
			Case COLUMN_TIME
				col.valueFormat = "HH:MM"
				Dim item As Map
				Dim value As String
				Dim cb As BANanoObject = BANano.CallBack(Me, "getdateformat", Array(item, value))
				'add to methods
				vue.SetCallBack("getdateformat", cb)
			Case COLUMN_DATETIME
				col.valueFormat = "yyyy-MM-dd HH:MM"
				Dim item As Map
				Dim value As String
				Dim cb As BANanoObject = BANano.CallBack(Me, "getdateformat", Array(item, value))
				'add to methods
				vue.SetCallBack("getdateformat", cb)
		End Select
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'build controls
private Sub BuildControls
	Dim sbTotals As StringBuilder
	sbTotals.Initialize
	If hasTotals Then
		'lets define the totals row
		sbTotals.Append($"<template slot="body.append">"$)
		sbTotals.Append($"<tr>"$)
		sbTotals.Append($"<th class="title">Totals</th>"$)
	End If
	
	Dim sb As StringBuilder
	sb.Initialize
	For Each k As String In columnsM.Keys
		Dim nf As DataTableColumn = columnsM.Get(k)
		'get type of column
		Dim ct As String = nf.TypeOf
		'get column name
		Dim value As String = nf.value
		Dim methodName As String = $"${ID}_${value}"$
		'does it have a total
		If hasTotals Then
			Dim bindTotals As String = nf.bindTotals
			Select Case bindTotals
				Case ""
					sbTotals.Append($"<th class="title"></th>"$)
				Case Else
					sbTotals.Append($"<th class="title">{{ ${bindTotals} }}</th>"$)
			End Select
		End If
		'
		Select Case ct
			Case COLUMN_DATE, COLUMN_DATETIME, COLUMN_TIME
				'get the date format
				Dim df As String = nf.valueFormat
				'
				Dim tmp As VMTemplate
				tmp.Initialize(vue, "" , Module)
				tmp.SetAttrSingle($"#item.${value}"$, "{item}")
				'
				Dim span As VMElement
				span.Initialize(vue,"")
				span.SetTag("span")
				span.SetText($"{{ getdateformat(item.${value}, "${df}") }}"$)
				tmp.AddComponent(span.ToString)
				sb.Append(tmp.ToString)
			Case COLUMN_MONEY, COLUMN_NUMBER
				'get the date format
				Dim mf As String = nf.valueFormat
				'
				Dim tmp As VMTemplate
				tmp.Initialize(vue, "" , Module)
				tmp.SetAttrSingle($"#item.${value}"$, "{item}")
				'
				Dim span As VMElement
				span.Initialize(vue,"")
				span.SetTag("span")
				span.SetText($"{{ getmoneyformat(item.${value}, "${mf}") }}"$)
				tmp.AddComponent(span.ToString)
				sb.Append(tmp.ToString)
			Case COLUMN_FILESIZE
				Dim tmp As VMTemplate
				tmp.Initialize(vue, "" , Module)
				tmp.SetAttrSingle($"#item.${value}"$, "{item}")
				'
				Dim span As VMElement
				span.Initialize(vue,"")
				span.SetTag("span")
				span.SetText($"{{ getfilesize(item.${value}) }}"$)
				tmp.AddComponent(span.ToString)
				sb.Append(tmp.ToString)
		
			Case COLUMN_PROGRESS_LINEAR
				Dim tmp As VMTemplate
				tmp.Initialize(vue, "" , Module)
				Dim sline As String = $"v-slot:item.${value}="{ item }""$
				tmp.SetAttrLoose(sline)
				'
				Dim pl As VMProgressLinear
				pl.Initialize(vue, $"${ID}${value}"$, Module)
				pl.SetVModel($"item.${value}"$)
				pl.SetReactive(True)
				pl.SetRounded(True)
				If nf.progressColor <> "" Then pl.SetColor(nf.progressColor)
				If nf.progressheight <> "" Then pl.SetHeight(nf.progressheight)
				If nf.progressShowValue Then
					Dim tmpx As VMElement
					tmpx.Initialize(vue, "").SetTag("strong")
					tmpx.AddComponent($"{{ Math.ceil(item.${value}) }}%"$)
					pl.AddComponent(tmpx.ToString)
				End If
				tmp.AddComponent(pl.ToString)
				sb.Append(tmp.ToString)
			Case COLUMN_PROGRESS_CIRCULAR
				Dim tmp As VMTemplate
				tmp.Initialize(vue, "" , Module)
				Dim sline As String = $"v-slot:item.${value}="{ item }""$
				tmp.SetAttrLoose(sline)
				'
				Dim pc As VMProgressCircular
				pc.Initialize(vue, $"${ID}${value}"$, Module)
				pc.SetVModel($"item.${value}"$)
				pc.SetReactive(True)
				pc.AddComponent($"{{ item.${value} }}"$)
				If nf.progressRotate <> "" Then pc.SetRotate(nf.progressRotate)
				If nf.progressSize <> "" Then pc.SetSize(nf.progressSize)
				If nf.progressWidth <> "" Then pc.SetWidth(nf.progressWidth)
				If nf.progressColor <> "" Then pc.SetColor(nf.progressColor)
				tmp.AddComponent(pc.ToString)
				sb.Append(tmp.ToString)
			Case COLUMN_RATING
				Dim tmp As VMTemplate
				tmp.Initialize(vue, "" , Module)
				Dim sline As String = $"v-slot:item.${value}="{ item }""$
				tmp.SetAttrLoose(sline)
				'
				Dim rat As VMRating
				rat.Initialize(vue, $"${ID}${value}"$, Module)
				rat.SetDense(True)
				rat.SetVModel($"item.${value}"$)
				If nf.Disabled Then rat.SetAttrLoose("disabled")
				If nf.ReadOnly Then rat.SetAttrLoose("readonly")
				If nf.iconSize <> "" Then rat.SetLength(nf.iconSize)
				If nf.iconColor <> "" Then rat.SetColor(nf.iconColor)
				'
				Dim methodName As String = $"${ID}_change"$
				If SubExists(Module, methodName) Then
					rat.SetAttrSingle("@input", $"${methodName}(item)"$)
					vue.SetMethod(Module, methodName)
				End If
				tmp.AddComponent(rat.ToString)
				sb.Append(tmp.ToString)
			Case COLUMN_AVATARIMG
				Dim tmp As VMTemplate
				tmp.Initialize(vue, "" , Module)
				Dim sline As String = $"v-slot:item.${value}="{ item }""$
				tmp.SetAttrLoose(sline)
				
				Dim avt As VMAvatar
				Dim avtimg As VMImage
				'
				avt.Initialize(vue,"", "")
				avtimg.Initialize(vue, "","")
				avtimg.SetSrc($"item.${value}"$)
				avtimg.SetAlt($"item.${value}"$)
				If nf.imgHeight <> "" Then
					avtimg.SetHeight(nf.imgheight)
					avtimg.SetMaxHeight(nf.imgheight)
				End If
				'
				If nf.imgWidth <> "" Then
					avtimg.SetWidth(nf.imgWidth)
					avtimg.SetMaxWidth(nf.imgWidth)
				End If
				avt.AddComponent(avtimg.ToString)
				tmp.AddComponent(avt.ToString)
				sb.Append(tmp.ToString)
			Case COLUMN_SWITCH, COLUMN_CHECKBOX
				Dim tmp As VMTemplate
				tmp.Initialize(vue, "" , Module)
				Dim sline As String = $"v-slot:item.${value}="{ item }""$
				tmp.SetAttrLoose(sline)
				'
				Dim swt As VMCheckBox
				swt.Initialize(vue, $"${ID}${value}"$, Module)
				If ct = COLUMN_SWITCH Then
					swt.SetTag("v-switch")
					swt.SetInset(True)
					swt.SetDense(True)
				End If
				swt.SetValue("Yes")
				swt.SetTrueValue("Yes")
				swt.SetUncheckedValue("No")
				swt.SetFalseValue("No")
				swt.SetVModel($"item.${value}"$)
				If nf.Disabled Then swt.SetAttrLoose("disabled")
				'
				Dim methodName As String = $"${ID}_change"$
				If SubExists(Module, methodName) Then
					swt.SetAttrSingle("@change", $"${methodName}(item)"$)
					vue.SetMethod(Module, methodName)
				End If
				tmp.AddComponent(swt.ToString)
				sb.Append(tmp.ToString)
			Case COLUMN_ICON
				Dim tmp As VMTemplate
				tmp.Initialize(vue, "" , Module)
				Dim sline As String = $"v-slot:item.${value}="{ item }""$
				tmp.SetAttrLoose(sline)
				'
				Dim aIcon As VMIcon
				aIcon.Initialize(vue, $"${ID}${value}"$, Module)
				aIcon.SetVText($"item.${value}"$)
				If nf.Disabled Then aIcon.SetAttrLoose("disabled")
				If nf.iconSize <> "" Then aIcon.SetSize(nf.iconSize)
				If nf.iconColor <> "" Then aIcon.SetColor(nf.iconcolor)
				tmp.AddComponent(aIcon.ToString)
				sb.Append(tmp.ToString)
			Case COLUMN_IMAGE
				Dim tmp As VMTemplate
				tmp.Initialize(vue, "" , Module)
				Dim sline As String = $"v-slot:item.${value}="{ item }""$
				tmp.SetAttrLoose(sline)
				'
				Dim avtimg As VMImage
				avtimg.Initialize(vue, "","")
				avtimg.SetSrc($"item.${value}"$)
				avtimg.SetAlt($"item.${value}"$)
				If nf.Disabled Then avtimg.SetAttrLoose("disabled")
				If nf.imgHeight <> "" Then
					avtimg.SetHeight(nf.imgheight)
					avtimg.SetMaxHeight(nf.imgheight)
				End If
				'
				If nf.imgWidth <> "" Then
					avtimg.SetWidth(nf.imgWidth)
					avtimg.SetMaxWidth(nf.imgWidth)
				End If
				tmp.AddComponent(avtimg.ToString)
				sb.Append(tmp.ToString)
			Case COLUMN_CHIP
				Dim tmp As VMTemplate
				tmp.Initialize(vue, "" , Module)
				Dim sline As String = $"v-slot:item.${value}="{ item }""$
				tmp.SetAttrLoose(sline)
				'
				Dim chp As VMChip
				chp.Initialize(vue, "", Module)
				chp.SetAttributes(Array("dark"))
				chp.SetText($"{{ item.${value} }}"$)
				If nf.Disabled Then chp.SetAttrLoose("disabled")
				If nf.extra <> "" Then chp.SetAttrLoose(nf.extra)
				'
				tmp.AddComponent(chp.ToString)
				sb.Append(tmp.ToString)
		End Select
	Next
	'
	If hasTotals Then
		sbTotals.Append($"</tr>"$)
		sbTotals.Append("</template>")
		sb.Append(sbTotals.ToString)
	End If
	DataGridSelect.SetText(sb.ToString)
End Sub

'get component
Sub ToString As String
	If vue.ShowWarnings Then
		Dim eName As String = $"${ID}_change"$
		If SubExists(Module, eName) = False Then
			Log($"VMDataGridSelect.${eName} event has not been defined!"$)
		End If
	End If
	vue.SetData(keyID, DateTime.Now)
	'build the headers
	BuildHeaders(columnsM)
	DataGridSelect.Bind(":key", keyID)
	DataGridSelect.Bind(":headers", headers)
	DataGridSelect.Bind(":items", items)
	BuildControls
	Return DataGridSelect.ToString
End Sub

'set required
Sub SetRequired(varRequired As Boolean) As VMDataGridSelect
	If varRequired = False Then Return Me
	DataGridSelect.SetRequired(varRequired)
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMDataGridSelect
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	DataGridSelect.Bind(":color", pp)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMDataGridSelect
	DataGridSelect.SetVShow(vif)
	Return Me
End Sub


'update the data
Sub Refresh
	Dim dt As String = DateTime.now
	vue.SetData(keyID, dt)
End Sub

'set vmodel
private Sub SetVModel(k As String) As VMDataGridSelect
	DataGridSelect.SetVModel(k)
	Return Me
End Sub

'set vif
Sub SetVIf(vif As String) As VMDataGridSelect
	DataGridSelect.SetVIf(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMDataGridSelect
	Dim childHTML As String = child.ToString
	DataGridSelect.SetText(childHTML)
	Return Me
End Sub

'add a component 
Sub AddComponent(tcomp As String) As VMDataGridSelect
	SetText(tcomp)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMDataGridSelect
	DataGridSelect.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMDataGridSelect
	DataGridSelect.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDataGridSelect
	DataGridSelect.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMDataGridSelect
	DataGridSelect.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMDataGridSelect
	If varDark = False Then Return Me
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	DataGridSelect.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMDataGridSelect
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	DataGridSelect.Bind(":dense", pp)
	Return Me
End Sub

'set hide-headers
Sub SetHideHeaders(varHideHeaders As Boolean) As VMDataGridSelect
	If varHideHeaders = False Then Return Me
	Dim pp As String = $"${ID}HideHeaders"$
	vue.SetStateSingle(pp, varHideHeaders)
	DataGridSelect.Bind(":hide-headers", pp)
	Return Me
End Sub



'set show-select
Sub SetShowSelect(varShowSelect As Boolean) As VMDataGridSelect
	If varShowSelect = False Then Return Me
	Dim pp As String = $"${ID}ShowSelect"$
	vue.SetStateSingle(pp, varShowSelect)
	DataGridSelect.Bind(":show-select", pp)
	Return Me
End Sub

'set caption
Sub SetCaption(varCaption As String) As VMDataGridSelect
	If varCaption = "" Then Return Me
	Dim pp As String = $"${ID}Caption"$
	vue.SetStateSingle(pp, varCaption)
	DataGridSelect.Bind(":caption", pp)
	Return Me
End Sub

'set headers-length
Sub SetHeadersLength(varHeadersLength As String) As VMDataGridSelect
	If varHeadersLength = "" Then Return Me
	Dim pp As String = $"${ID}HeadersLength"$
	vue.SetStateSingle(pp, varHeadersLength)
	DataGridSelect.Bind(":headers-length", pp)
	Return Me
End Sub

'set item-key and force usage
Sub SetItemKey(varItemKey As String) As VMDataGridSelect
	If varItemKey = "" Then Return Me
	Dim pp As String = $"${ID}ItemKey"$
	vue.SetStateSingle(pp, varItemKey)
	DataGridSelect.Bind(":item-key", pp)
	Return Me
End Sub

'set item-text and force usage
Sub SetItemText(varItemText As String) As VMDataGridSelect
	If varItemText = "" Then Return Me
	Dim pp As String = $"${ID}ItemText"$
	vue.SetStateSingle(pp, varItemText)
	DataGridSelect.Bind(":item-text", pp)
	Return Me
End Sub

'hide the component
Sub Hide As VMDataGridSelect
	DataGridSelect.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMDataGridSelect
	DataGridSelect.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMDataGridSelect
	DataGridSelect.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMDataGridSelect
	DataGridSelect.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMDataGridSelect
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMDataGridSelect
	DataGridSelect.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMDataGridSelect
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'remove an attribute
public Sub RemoveAttr(sName As String) As VMDataGridSelect
	DataGridSelect.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMDataGridSelect
	DataGridSelect.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMDataGridSelect
	DataGridSelect.setmarginall(p)
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMDataGridSelect
	DataGridSelect.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMDataGridSelect
	DataGridSelect.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMDataGridSelect
	DataGridSelect.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMDataGridSelect
	DataGridSelect.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMDataGridSelect
	DataGridSelect.BindStyleSingle(prop, value)
	Return Me
End Sub


Sub SetVText(vhtml As String) As VMDataGridSelect
	DataGridSelect.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMDataGridSelect
	DataGridSelect.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMDataGridSelect
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMDataGridSelect
	DataGridSelect.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMDataGridSelect
	DataGridSelect.SetVisible(b)
	Return Me
End Sub

'center align columns
Sub SetCenterAlignColumns(flds As List) As VMDataGridSelect
	For Each k As String In flds
		SetColumnAlignment(k, ALIGN_CENTER)
	Next
	Return Me
End Sub

'right align columns
Sub SetColumnsAlignmentCenter(flds As List) As VMDataGridSelect
	SetCenterAlignColumns(flds)
	Return Me
End Sub


'right align columns
Sub SetColumnsAlignmentRight(flds As List) As VMDataGridSelect
	SetRightAlignColumns(flds)
	Return Me
End Sub

'right align columns
Sub SetRightAlignColumns(flds As List) As VMDataGridSelect
	For Each k As String In flds
		SetColumnAlignment(k, ALIGN_RIGHT)
	Next
	Return Me
End Sub

'set the column type to date for these columns
Sub SetDateColumns(dates As List) As VMDataGridSelect
	For Each k As String In dates
		SetColumnType(k, COLUMN_DATE)
	Next
	Return Me
End Sub

Sub SetColumnsFormatDate(dates As List) As VMDataGridSelect
	SetDateColumns(dates)
	Return Me
End Sub

'set the column type to date time for these columns
Sub SetDateTimeColumns(dates As List) As VMDataGridSelect
	For Each k As String In dates
		SetColumnType(k, COLUMN_DATETIME)
	Next
	Return Me
End Sub

'used by designer only
Sub SetSelectType(selType As String) As VMDataGridSelect
	If selType = "" Then Return Me
	Return Me
End Sub

'used by designer only
Sub SetSelectFields(selFields As String) As VMDataGridSelect
	If selFields = "" Then Return Me
	Return Me
End Sub

'used by the designer only
Sub SetSortFields(sortFields As String) As VMDataGridSelect
	If sortFields = "" Then Return Me
	Return Me
End Sub

Sub SetColumnsFormatDateTime(dates As List) As VMDataGridSelect
	SetDateTimeColumns(dates)
	Return Me
End Sub

'set the column type to date time for these columns
Sub SetFileSizeColumns(dates As List) As VMDataGridSelect
	For Each k As String In dates
		SetColumnType(k, COLUMN_FILESIZE)
	Next
	Return Me
End Sub

Sub SetColumnsFormatFileSize(dates As List) As VMDataGridSelect
	SetFileSizeColumns(dates)
	Return Me
End Sub


'set the column type to time for these columns
Sub SetTimeColumns(dates As List) As VMDataGridSelect
	For Each k As String In dates
		SetColumnType(k, COLUMN_TIME)
	Next
	Return Me
End Sub

Sub SetColumnsFormatTime(dates As List) As VMDataGridSelect
	SetTimeColumns(dates)
	Return Me
End Sub

Sub SetColumnsFormatMoney(dates As List) As VMDataGridSelect
	SetMoneyColumns(dates)
	Return Me
End Sub

'set the column type to time for these columns
Sub SetMoneyColumns(dates As List) As VMDataGridSelect
	For Each k As String In dates
		SetColumnType(k, COLUMN_MONEY)
	Next
	Return Me
End Sub

'set the column type to time for these columns
Sub SetNumberColumns(dates As List) As VMDataGridSelect
	For Each k As String In dates
		SetColumnType(k, COLUMN_NUMBER)
	Next
	Return Me
End Sub


Sub SetItemClass(methodName As String) As VMDataGridSelect
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) Then
		SetAttrSingle(":item-class", methodName)
		Dim Item As Map
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(Item))
		'add to methods
		vue.SetCallBack(methodName, cb)
	Else
		Log("VMDataGridSelect:SetItemClass - the item-class method has not been defined!")
	End If
	Return Me
End Sub

'set the format of the date in the column
Sub SetColumnDateFormat(colName As String, colFormat As String) As VMDataGridSelect
	'valueFormat
	SetColumnType(colName, COLUMN_DATE)
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.valueFormat = colFormat
		columnsM.Put(colName,col)
		'
		Dim item As Map
		Dim cb As BANanoObject = BANano.CallBack(Me, "getdateformat", Array(item, colFormat))
		'add to methods
		vue.SetCallBack("getdateformat", cb)
	End If
	Return Me
End Sub

'set the format of the date time in the column
Sub SetColumnDateTimeFormat(colName As String, colFormat As String) As VMDataGridSelect
	'valueFormat
	SetColumnType(colName, COLUMN_DATETIME)
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.valueFormat = colFormat
		columnsM.Put(colName,col)
		'
		Dim item As Map
		Dim cb As BANanoObject = BANano.CallBack(Me, "getdateformat", Array(item, colFormat))
		'add to methods
		vue.SetCallBack("getdateformat", cb)
	End If
	Return Me
End Sub

'set the format of the number in the column
Sub SetColumnNumberFormat(colName As String, colFormat As String) As VMDataGridSelect
	'valueFormat
	SetColumnType(colName, COLUMN_NUMBER)
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.valueFormat = colFormat
		col.align = ALIGN_RIGHT
		columnsM.Put(colName,col)
		'
		Dim item As Map
		Dim cb As BANanoObject = BANano.CallBack(Me, "getmoneyformat", Array(item, colFormat))
		'add to methods
		vue.SetCallBack("getmoneyformat", cb)
	End If
	Return Me
End Sub

private Sub getdateformat(item As String, sFormat As String) As String
	Dim svalue As String = vue.FormatDisplayDate(item, sFormat)
	Return svalue
End Sub


private Sub getmoneyformat(item As String, sformat As String) As String
	Dim svalue As String = vue.FormatDisplayNumber(item, sformat)
	Return svalue
End Sub

private Sub getfilesize(item As String) As String
	Dim svalue As String = vue.FormatFileSize(item)
	Return svalue
End Sub