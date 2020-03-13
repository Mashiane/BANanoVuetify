B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public DataTable As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public PrimaryKey As String = "id"
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
	Public COLUMN_FILESIZE As String = "filesize"
	Public COLUMN_CHIP As String = "chip"
	Public COLUMN_EDIT As String = "edit"
	Public COLUMN_DELETE As String = "delete"
	Public COLUMN_ACTION As String = "action"
	'alignment
	Public ALIGN_CENTER As String = "center"
	Public ALIGN_RIGHT As String = "end"
	Public ALIGN_LEFT As String = "start"
	'
	Private columnsM As Map
	Private filters As List
	Private hasFilters As Boolean
	Private exclusions As List
	'
	Private headers As String
	Private vcard As VMCard
	Private title As String
	Private search As String
	Private items As String
	Type DataTableColumn(value As String, text As String, align As String, sortable As Boolean, filterable As Boolean, divider As Boolean, _
	className As String, width As String, filter As String, sort As String, TypeOf As String, extra As String, icon As String)
	Private hasSearch As Boolean
End Sub

'initialize the DataTable
Public Sub Initialize(v As BANanoVue, sid As String, sPrimaryKey As String, eventHandler As Object) As VMDataTable
	ID = sid.tolowercase
	vue = v
	DataTable.Initialize(v, ID)
	DataTable.SetTag("v-data-table")
	vcard.Initialize(vue, $"${ID}card"$, Module)
	DesignMode = False
	Module = eventHandler
	
	filters.Initialize 
	hasFilters = False
	exclusions.Initialize 
	headers = $"${ID}headers"$
	title = $"${ID}title"$
	search = $"${ID}search"$
	items = $"${ID}items"$
	vue.SetData(headers, Array())
	vue.SetData(items, Array())
	vue.SetData(title, "")
	'
	vcard.Title.SetText($"{{ ${title} }}"$)
	vcard.Title.AddSpacer	
	vcard.IsDialog = False
	vcard.IsTable = True	'
	DataTable.Bind(":headers", headers)	
	DataTable.Bind(":items", items)
	PrimaryKey = sPrimaryKey
	DataTable.Bind("item-key",PrimaryKey)
	SetLoading(False)
	SetLoadingText("")
	hasSearch = False
	columnsM.Initialize 
	Return Me
End Sub

Sub Reset
	exclusions.Initialize 
	filters.Initialize
	hasFilters = False
	columnsM.Initialize
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMDataTable
	DataTable.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMDataTable
	DataTable.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMDataTable
	DataTable.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMDataTable
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'add edit icon
Sub AddEdit(colField As String, colTitle As String)
	AddExclusion(colField)
	AddColumn(colField,colTitle)
	SetColumnFilterable(colField,False)
	SetColumnType(colField, COLUMN_EDIT)
	SetColumnSortable(colField, False)
	SetColumnAlignment(colField, ALIGN_CENTER)
End Sub

Sub AddDelete(colField As String, colTitle As String)
	AddExclusion(colField)
	AddColumn(colField,colTitle)
	SetColumnFilterable(colField,False)
	SetColumnType(colField, COLUMN_DELETE)
	SetColumnSortable(colField, False)
	SetColumnAlignment(colField, ALIGN_CENTER)
End Sub

Sub AddIcon(colField As String, colTitle As String, colIcon As String)
	AddExclusion(colField)
	AddColumn(colField,colTitle)
	SetColumnFilterable(colField,False)
	SetColumnType(colField, COLUMN_ACTION)
	SetColumnSortable(colField, False)
	SetColumnAlignment(colField, ALIGN_CENTER)
	SetColumnIcon(colField, colIcon)
End Sub

'add edit & delete button
Sub AddEditThrash
	AddEdit("edit", "Edit")
	AddDelete("delete", "Delete")
End Sub

Sub AddDownload
	AddIcon("download","Get","attach_file")
End Sub

Sub AddMenuH
	AddIcon("menu","Menu","more_horiz")
End Sub

Sub AddMenuV
	AddIcon("menu","Menu","more_vert")
End Sub

Sub AddClone
	AddIcon("clone", "Clone", "done_all")
End Sub

Sub AddPrint
	AddIcon("print", "Print", "print")
End Sub


Sub AddSearch
	DataTable.Bind(":search", search)
	vcard.Title.AddSearch(search)
	hasSearch = True
	vcard.Title.addspacer
End Sub

Sub AddNew(key As String, iconName As String, toolTip As String) As VMDataTable
	key = key.tolowercase
	Dim btn As VMButton
	btn.Initialize(vue, key, Module).SetFabButton(iconName).SetTooltip(toolTip).SetPrimary(True).AddClass("mb-2")
	vcard.Title.SetText(btn.ToString)
	Return Me
End Sub

'update database from existing saved state
Sub SetDataSourceName(dsName As String) As VMDataTable
	dsName = dsName.ToLowerCase
	Dim recs As List = vue.GetData(dsName)
	vue.SetData(items, recs)
	Return Me
End Sub

'update from a list of existing recods
Sub SetDataSource(ds As List) As VMDataTable
	vue.SetData(items, ds)
	Return Me
End Sub

'set the title of the table
Sub SetTitle(sTitle As String) As VMDataTable
	vue.SetData(title, sTitle)
	Return Me
End Sub

'add columns to exclude
Sub AddExclusion(colKey As String) As VMDataTable
	colKey = colKey.tolowercase
	exclusions.Add(colKey)
	Return Me
End Sub

'set filters
Sub SetFilters(sourceOf As String)
	filters = vue.GetState(sourceOf, Array())
	hasFilters = True
End Sub

'add a column
Sub AddColumn(colName As String, colTitle As String) As VMDataTable
	AddColumn1(colName, colTitle, COLUMN_TEXT, 0, True, ALIGN_LEFT)
	Return Me
End Sub

'add columns from key value pairs
Sub AddColumns(flds As Map) As VMDataTable
	For Each k As String In flds.Keys
		Dim v As String = flds.Get(k)
		AddColumn(k, v)
	Next
	Return Me
End Sub

'add a column
Sub AddColumn1(colName As String, colTitle As String, colType As String, colWidth As Int, colSortable As Boolean, colAlign As String) As VMDataTable
	'column name should not have a space
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If hasFilters Then
		If exclusions.IndexOf(colName) = -1 Then
			If filters.IndexOf(colName) = -1 Then Return Me
		End If
	End If
	'
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
	'
	columnsM.Put(colName, nf)
	Return Me
End Sub

'set column sortable
Sub SetColumnSortable(colName As String, colSortable As Boolean) As VMDataTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.sortable = colSortable
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set the column data template
Sub SetColumnAlignment(colName As String, colAlign As String) As VMDataTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.align = colAlign
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set the column data template
Sub SetColumnExtra(colName As String, colExtra As String) As VMDataTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.extra = colExtra
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

Sub SetColumnIcon(colName As String, icon As String) As VMDataTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.icon = icon
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub


'set the column data template
Sub SetColumnWidth(colName As String, colWidth As Int) As VMDataTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.width = colWidth
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column filterable
Sub SetColumnFilterable(colName As String, colFilter As Boolean) As VMDataTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.filterable = colFilter
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column class
Sub SetColumnClass(colName As String, colClass As String) As VMDataTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.classname = colClass
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

private Sub BuildHeaders
	Dim hdr As List
	hdr.Initialize 
	'
	For Each k As String In columnsM.keys
		'get the column details
		Dim nf As DataTableColumn = columnsM.Get(k)
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
Sub SetColumnType(colName As String, colType As String) As VMDataTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.TypeOf = colType
		Select Case colType
		Case COLUMN_IMAGE
			col.filterable = False
		Case COLUMN_MONEY
			col.align = ALIGN_RIGHT
		Case COLUMN_FILESIZE
			col.align = ALIGN_RIGHT
		Case COLUMN_DATE
			'col.Put("format", "yyyy-mm-dd")
		Case COLUMN_TIME
			'col.Put("format", "HH:MM")
		Case COLUMN_DATETIME
			'col.Put("format", "yyyy-mm-dd HH:MM")
		End Select
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

private Sub BuildControls
	Dim sb As StringBuilder
	sb.Initialize 
	For Each k As String In columnsM.Keys
		Dim nf As DataTableColumn = columnsM.Get(k)
		'get type of column
		Dim ct As String = nf.TypeOf
		'get column name
		Dim value As String = nf.value
		'
		Select Case ct
		Case COLUMN_CHECKBOX	
			Dim tmpc As VMTemplate
			tmpc.Initialize(vue, "" , Module)
			Dim sline As String = $"v-slot:item.${value}="{ item }""$
			tmpc.SetAttrLoose(sline)
			'
			Dim scb As VMSimpleCheckBox
			scb.Initialize(vue, "", Module).SetVModel($"item.${value}"$).SetAttributes(Array("disabled"))
			If nf.extra <> "" Then scb.SetAttrLoose(nf.extra)
			'
			tmpc.AddComponent(scb.ToString)
			sb.Append(tmpc.ToString) 
		Case COLUMN_CHIP
			Dim tmp As VMTemplate
			tmp.Initialize(vue, "" , Module)
			Dim sline As String = $"v-slot:item.${value}="{ item }""$
			tmp.SetAttrLoose(sline)
			'
			Dim chp As VMChip
			chp.Initialize(vue, "", Module).SetAttributes(Array("dark")).SetText($"{{ item.${value} }}"$)
			If nf.extra <> "" Then chp.SetAttrLoose(nf.extra)
			'
			tmp.AddComponent(chp.ToString)
			sb.Append(tmp.ToString)
		Case COLUMN_EDIT
			Dim tmp As VMTemplate
			tmp.Initialize(vue, "" , Module)
			Dim sline As String = $"v-slot:item.edit="{ item }""$
			tmp.SetAttrLoose(sline)
				'
			Dim eIcon As VMIcon
			eIcon.Initialize(vue, "", Module).AddClass("mr-2")
			eIcon.SetAttrSingle("@click", $"${ID}_edit(item)"$)
			eIcon.SetText("mdi-pencil")
			tmp.AddComponent(eIcon.ToString)
			'
			sb.Append(tmp.ToString)
			vue.SetMethod(Module, $"${ID}_edit"$)
		Case COLUMN_DELETE
			Dim tmpd As VMTemplate
			tmpd.Initialize(vue, "" , Module)
			Dim sline As String = $"v-slot:item.delete="{ item }""$
			tmpd.SetAttrLoose(sline)
			'
			Dim eIcon As VMIcon
			eIcon.Initialize(vue, "", Module).AddClass("mr-2")
			eIcon.SetAttrSingle("@click", $"${ID}_delete(item)"$)
			eIcon.SetText("mdi-delete")
			tmpd.AddComponent(eIcon.ToString)
			'
			sb.Append(tmpd.ToString)
			vue.SetMethod(Module, $"${ID}_delete"$)
		Case COLUMN_ACTION
			Dim tmpa As VMTemplate
			tmpa.Initialize(vue, "" , Module)
			Dim sline As String = $"v-slot:item.${value}="{ item }""$
			tmpa.SetAttrLoose(sline)
			'
			Dim eIcon As VMIcon
			eIcon.Initialize(vue, "", Module).AddClass("mr-2")
			Dim clickCode As String = $"${ID}_${value}(item)"$
			eIcon.SetAttrSingle("@click", clickCode)
			eIcon.SetText(nf.icon)
			tmpa.AddComponent(eIcon.ToString)
			'
			sb.Append(tmpa.ToString)
			vue.SetMethod(Module, $"${ID}_${value}"$)
		End Select	
	Next
	DataTable.SetText(sb.ToString)
End Sub

'get component
Sub ToString As String
	'build the headers
	BuildHeaders
	BuildControls
	vcard.AddStuff(DataTable.ToString)
	Return vcard.ToString
End Sub

Sub SetVModel(k As String) As VMDataTable
	DataTable.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMDataTable
	DataTable.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMDataTable
	DataTable.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMDataTable
	Dim childHTML As String = child.ToString
	DataTable.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMDataTable
	DataTable.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMDataTable
	DataTable.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDataTable
	DataTable.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMDataTable
	DataTable.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set calculate-width
Sub SetCalculateWidth(varCalculateWidth As Object) As VMDataTable
	Dim pp As String = $"${ID}CalculateWidth"$
	vue.SetStateSingle(pp, varCalculateWidth)
	DataTable.Bind(":calculate-width", pp)
	Return Me
End Sub

'set caption
Sub SetCaption(varCaption As Object) As VMDataTable
	Dim pp As String = $"${ID}Caption"$
	vue.SetStateSingle(pp, varCaption)
	DataTable.Bind(":caption", pp)
	Return Me
End Sub

'set custom-filter
Sub SetCustomFilter(varCustomFilter As Object) As VMDataTable
	Dim pp As String = $"${ID}CustomFilter"$
	vue.SetStateSingle(pp, varCustomFilter)
	DataTable.Bind(":custom-filter", pp)
	Return Me
End Sub

'set custom-group
Sub SetCustomGroup(varCustomGroup As Object) As VMDataTable
	Dim pp As String = $"${ID}CustomGroup"$
	vue.SetStateSingle(pp, varCustomGroup)
	DataTable.Bind(":custom-group", pp)
	Return Me
End Sub

'set custom-sort
Sub SetCustomSort(varCustomSort As Object) As VMDataTable
	Dim pp As String = $"${ID}CustomSort"$
	vue.SetStateSingle(pp, varCustomSort)
	DataTable.Bind(":custom-sort", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMDataTable
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	DataTable.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMDataTable
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	DataTable.Bind(":dense", pp)
	Return Me
End Sub

'set disable-filtering
Sub SetDisableFiltering(varDisableFiltering As Object) As VMDataTable
	Dim pp As String = $"${ID}DisableFiltering"$
	vue.SetStateSingle(pp, varDisableFiltering)
	DataTable.Bind(":disable-filtering", pp)
	Return Me
End Sub

'set disable-pagination
Sub SetDisablePagination(varDisablePagination As Object) As VMDataTable
	Dim pp As String = $"${ID}DisablePagination"$
	vue.SetStateSingle(pp, varDisablePagination)
	DataTable.Bind(":disable-pagination", pp)
	Return Me
End Sub

'set disable-sort
Sub SetDisableSort(varDisableSort As Object) As VMDataTable
	Dim pp As String = $"${ID}DisableSort"$
	vue.SetStateSingle(pp, varDisableSort)
	DataTable.Bind(":disable-sort", pp)
	Return Me
End Sub

'set expand-icon
Sub SetExpandIcon(varExpandIcon As Object) As VMDataTable
	Dim pp As String = $"${ID}ExpandIcon"$
	vue.SetStateSingle(pp, varExpandIcon)
	DataTable.Bind(":expand-icon", pp)
	Return Me
End Sub

'set expanded
Sub SetExpanded(varExpanded As Object) As VMDataTable
	Dim pp As String = $"${ID}Expanded"$
	vue.SetStateSingle(pp, varExpanded)
	DataTable.Bind(":expanded", pp)
	Return Me
End Sub

'set fixed-header
Sub SetFixedHeader(varFixedHeader As Object) As VMDataTable
	Dim pp As String = $"${ID}FixedHeader"$
	vue.SetStateSingle(pp, varFixedHeader)
	DataTable.Bind(":fixed-header", pp)
	Return Me
End Sub

'set footer-props
Sub SetFooterProps(varFooterProps As Object) As VMDataTable
	Dim pp As String = $"${ID}FooterProps"$
	vue.SetStateSingle(pp, varFooterProps)
	DataTable.Bind(":footer-props", pp)
	Return Me
End Sub

'set group-by
Sub SetGroupBy(varGroupBy As Object) As VMDataTable
	Dim pp As String = $"${ID}GroupBy"$
	vue.SetStateSingle(pp, varGroupBy)
	DataTable.Bind(":group-by", pp)
	Return Me
End Sub

'set group-desc
Sub SetGroupDesc(varGroupDesc As Object) As VMDataTable
	Dim pp As String = $"${ID}GroupDesc"$
	vue.SetStateSingle(pp, varGroupDesc)
	DataTable.Bind(":group-desc", pp)
	Return Me
End Sub

'set header-props
Sub SetHeaderProps(varHeaderProps As Object) As VMDataTable
	Dim pp As String = $"${ID}HeaderProps"$
	vue.SetStateSingle(pp, varHeaderProps)
	DataTable.Bind(":header-props", pp)
	Return Me
End Sub

'set headers
Sub SetHeaders(varHeaders As Object) As VMDataTable
	Dim pp As String = $"${ID}Headers"$
	vue.SetStateSingle(pp, varHeaders)
	DataTable.Bind(":headers", pp)
	Return Me
End Sub

'set headers-length
Sub SetHeadersLength(varHeadersLength As Object) As VMDataTable
	Dim pp As String = $"${ID}HeadersLength"$
	vue.SetStateSingle(pp, varHeadersLength)
	DataTable.Bind(":headers-length", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMDataTable
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	DataTable.Bind(":height", pp)
	Return Me
End Sub

'set hide-default-footer
Sub SetHideDefaultFooter(varHideDefaultFooter As Object) As VMDataTable
	Dim pp As String = $"${ID}HideDefaultFooter"$
	vue.SetStateSingle(pp, varHideDefaultFooter)
	DataTable.Bind(":hide-default-footer", pp)
	Return Me
End Sub

'set hide-default-header
Sub SetHideDefaultHeader(varHideDefaultHeader As Object) As VMDataTable
	Dim pp As String = $"${ID}HideDefaultHeader"$
	vue.SetStateSingle(pp, varHideDefaultHeader)
	DataTable.Bind(":hide-default-header", pp)
	Return Me
End Sub

'set item-key
Sub SetItemKey(varItemKey As Object) As VMDataTable
	Dim pp As String = $"${ID}ItemKey"$
	vue.SetStateSingle(pp, varItemKey)
	DataTable.Bind(":item-key", pp)
	Return Me
End Sub

'set items
Sub SetItems(varItems As Object) As VMDataTable
	Dim pp As String = $"${ID}Items"$
	vue.SetStateSingle(pp, varItems)
	DataTable.Bind(":items", pp)
	Return Me
End Sub

'set items-per-page
Sub SetItemsPerPage(varItemsPerPage As Object) As VMDataTable
	Dim pp As String = $"${ID}ItemsPerPage"$
	vue.SetStateSingle(pp, varItemsPerPage)
	DataTable.Bind(":items-per-page", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMDataTable
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	DataTable.Bind(":light", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMDataTable
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	DataTable.Bind(":loading", pp)
	Return Me
End Sub

'set loading-text
Sub SetLoadingText(varLoadingText As Object) As VMDataTable
	Dim pp As String = $"${ID}LoadingText"$
	vue.SetStateSingle(pp, varLoadingText)
	DataTable.Bind(":loading-text", pp)
	Return Me
End Sub

'set locale
Sub SetLocale(varLocale As Object) As VMDataTable
	Dim pp As String = $"${ID}Locale"$
	vue.SetStateSingle(pp, varLocale)
	DataTable.Bind(":locale", pp)
	Return Me
End Sub

'set mobile-breakpoint
Sub SetMobileBreakpoint(varMobileBreakpoint As Object) As VMDataTable
	Dim pp As String = $"${ID}MobileBreakpoint"$
	vue.SetStateSingle(pp, varMobileBreakpoint)
	DataTable.Bind(":mobile-breakpoint", pp)
	Return Me
End Sub

'set multi-sort
Sub SetMultiSort(varMultiSort As Object) As VMDataTable
	Dim pp As String = $"${ID}MultiSort"$
	vue.SetStateSingle(pp, varMultiSort)
	DataTable.Bind(":multi-sort", pp)
	Return Me
End Sub

'set must-sort
Sub SetMustSort(varMustSort As Object) As VMDataTable
	Dim pp As String = $"${ID}MustSort"$
	vue.SetStateSingle(pp, varMustSort)
	DataTable.Bind(":must-sort", pp)
	Return Me
End Sub

'set no-data-text
Sub SetNoDataText(varNoDataText As Object) As VMDataTable
	Dim pp As String = $"${ID}NoDataText"$
	vue.SetStateSingle(pp, varNoDataText)
	DataTable.Bind(":no-data-text", pp)
	Return Me
End Sub

'set no-results-text
Sub SetNoResultsText(varNoResultsText As Object) As VMDataTable
	Dim pp As String = $"${ID}NoResultsText"$
	vue.SetStateSingle(pp, varNoResultsText)
	DataTable.Bind(":no-results-text", pp)
	Return Me
End Sub

'set options
Sub SetOptions(varOptions As Object) As VMDataTable
	Dim pp As String = $"${ID}Options"$
	vue.SetStateSingle(pp, varOptions)
	DataTable.Bind(":options", pp)
	Return Me
End Sub

'set page
Sub SetPage(varPage As Object) As VMDataTable
	Dim pp As String = $"${ID}Page"$
	vue.SetStateSingle(pp, varPage)
	DataTable.Bind(":page", pp)
	Return Me
End Sub

'set search
Sub SetSearch(varSearch As Object) As VMDataTable
	Dim pp As String = $"${ID}Search"$
	vue.SetStateSingle(pp, varSearch)
	DataTable.Bind(":search", pp)
	Return Me
End Sub

'set selectable-key
Sub SetSelectableKey(varSelectableKey As Object) As VMDataTable
	Dim pp As String = $"${ID}SelectableKey"$
	vue.SetStateSingle(pp, varSelectableKey)
	DataTable.Bind(":selectable-key", pp)
	Return Me
End Sub

'set server-items-length
Sub SetServerItemsLength(varServerItemsLength As Object) As VMDataTable
	Dim pp As String = $"${ID}ServerItemsLength"$
	vue.SetStateSingle(pp, varServerItemsLength)
	DataTable.Bind(":server-items-length", pp)
	Return Me
End Sub

'set show-expand
Sub SetShowExpand(varShowExpand As Object) As VMDataTable
	Dim pp As String = $"${ID}ShowExpand"$
	vue.SetStateSingle(pp, varShowExpand)
	DataTable.Bind(":show-expand", pp)
	Return Me
End Sub

'set show-group-by
Sub SetShowGroupBy(varShowGroupBy As Object) As VMDataTable
	Dim pp As String = $"${ID}ShowGroupBy"$
	vue.SetStateSingle(pp, varShowGroupBy)
	DataTable.Bind(":show-group-by", pp)
	Return Me
End Sub

'set show-select
Sub SetShowSelect(varShowSelect As Object) As VMDataTable
	Dim pp As String = $"${ID}ShowSelect"$
	vue.SetStateSingle(pp, varShowSelect)
	DataTable.Bind(":show-select", pp)
	Return Me
End Sub

'set single-expand
Sub SetSingleExpand(varSingleExpand As Object) As VMDataTable
	Dim pp As String = $"${ID}SingleExpand"$
	vue.SetStateSingle(pp, varSingleExpand)
	DataTable.Bind(":single-expand", pp)
	Return Me
End Sub

'set single-select
Sub SetSingleSelect(varSingleSelect As Object) As VMDataTable
	Dim pp As String = $"${ID}SingleSelect"$
	vue.SetStateSingle(pp, varSingleSelect)
	DataTable.Bind(":single-select", pp)
	Return Me
End Sub

'set sort-by
Sub SetSortBy(varSortBy As Object) As VMDataTable
	Dim pp As String = $"${ID}SortBy"$
	vue.SetStateSingle(pp, varSortBy)
	DataTable.Bind(":sort-by", pp)
	Return Me
End Sub

'set sort-desc
Sub SetSortDesc(varSortDesc As Object) As VMDataTable
	Dim pp As String = $"${ID}SortDesc"$
	vue.SetStateSingle(pp, varSortDesc)
	DataTable.Bind(":sort-desc", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMDataTable
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	DataTable.Bind(":value", pp)
	Return Me
End Sub

'
Sub SetSlotBody(b As Boolean) As VMDataTable    'ignore
	SetAttr(CreateMap("slot": "body"))
	Return Me
End Sub

'
Sub SetSlotBodyAppend(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "body.append"))
Return Me
End Sub

'
Sub SetSlotBodyPrepend(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "body.prepend"))
Return Me
End Sub

'
Sub SetSlotExpandedItem(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "expanded.item"))
Return Me
End Sub

'
Sub SetSlotFooter(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "footer"))
Return Me
End Sub

'
Sub SetSlotFooterPpageText(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "footer.page-text"))
Return Me
End Sub

'
Sub SetSlotGroup(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "group"))
Return Me
End Sub

'
Sub SetSlotGroupHeader(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "group.header"))
Return Me
End Sub

'
Sub SetSlotGroupSummary(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "group.summary"))
Return Me
End Sub

'
Sub SetSlotHeader(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "header"))
Return Me
End Sub

'
Sub SetSlotHeaderDataTableSelect(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "header.data-table-select"))
Return Me
End Sub

'
Sub SetSlotItem(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "item"))
Return Me
End Sub

'
Sub SetSlotItemDataTableExpand(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "item.data-table-expand"))
Return Me
End Sub

'
Sub SetSlotItemDataTableSelect(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "item.data-table-select"))
Return Me
End Sub

'
Sub SetSlotLoading(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "loading"))
Return Me
End Sub

'
Sub SetSlotNoData(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "no-data"))
Return Me
End Sub

'
Sub SetSlotNoResults(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "no-results"))
Return Me
End Sub

'
Sub SetSlotProgress(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "progress"))
Return Me
End Sub

'
Sub SetSlotTop(b As Boolean) As VMDataTable    'ignore
SetAttr(CreateMap("slot": "top"))
Return Me
End Sub

'
Sub SetOnClickRow(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:click:row": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnCurrentItems(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:current-items": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:input": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnItemExpanded(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:item-expanded": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnItemSelected(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:item-selected": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnPageCount(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:page-count": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnPagination(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:pagination": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnToggleSelectAll(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:toggle-select-all": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnUpdateExpanded(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:update:expanded": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnUpdateGroupBy(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:update:group-by": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnUpdateGroupDesc(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:update:group-desc": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnUpdateItemsPerPage(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:update:items-per-page": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnUpdateMultiSort(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:update:multi-sort": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnUpdateMustSort(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:update:must-sort": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnUpdateOptions(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:update:options": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnUpdatePage(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:update:page": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnUpdateSortBy(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:update:sort-by": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnUpdateSortDesc(methodName As String) As VMDataTable
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:update:sort-desc": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub


'hide the component
Sub Hide As VMDataTable
	DataTable.SetVisible(False)
    Return Me
End Sub

'show the component
Sub Show As VMDataTable
	DataTable.SetVisible(True)
    Return Me
End Sub

'enable the component
Sub Enable As VMDataTable
	DataTable.Enable(True)
    Return Me
End Sub

'disable the component
Sub Disable As VMDataTable
	DataTable.Disable(True)
    Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMDataTable
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMDataTable
	DataTable.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMDataTable
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMDataTable
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	DataTable.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMDataTable
	DataTable.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMDataTable
	DataTable.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMDataTable
	DataTable.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMDataTable
	DataTable.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMDataTable
	DataTable.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMDataTable
	DataTable.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMDataTable
	DataTable.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMDataTable
	DataTable.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMDataTable
	DataTable.BindStyleSingle(prop, value)
	Return Me
End Sub


Sub SetVText(vhtml As String) As VMDataTable
	DataTable.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMDataTable
	DataTable.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMDataTable
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMDataTable
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMDataTable
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMDataTable
DataTable.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMDataTable
DataTable.SetVisible(b)
Return Me
End Sub


'center align columns
Sub SetCenterAlignColumns(flds As List) As VMDataTable
	For Each k As String In flds
		SetColumnAlignment(k, ALIGN_CENTER)
	Next
	Return Me
End Sub

'right align columns
Sub SetColumnsAlignmentCenter(flds As List) As VMDataTable
	SetCenterAlignColumns(flds)
	Return Me
End Sub


'right align columns
Sub SetColumnsAlignmentRight(flds As List) As VMDataTable
	SetRightAlignColumns(flds)
	Return Me
End Sub

'right align columns
Sub SetRightAlignColumns(flds As List) As VMDataTable
	For Each k As String In flds
		SetColumnAlignment(k, ALIGN_RIGHT)
	Next
	Return Me
End Sub

'set the column type to date for these columns
Sub SetDateColumns(dates As List) As VMDataTable
	For Each k As String In dates
		SetColumnType(k, COLUMN_DATE)
	Next
	Return Me
End Sub

Sub SetColumnsFormatDate(dates As List) As VMDataTable
	SetDateColumns(dates)
	Return Me
End Sub

'set the column type to date time for these columns
Sub SetDateTimeColumns(dates As List) As VMDataTable
	For Each k As String In dates
		SetColumnType(k, COLUMN_DATETIME)
	Next
	Return Me
End Sub

Sub SetColumnsFormatDateTime(dates As List) As VMDataTable
	SetDateTimeColumns(dates)
	Return Me
End Sub


'set the column type to date time for these columns
Sub SetFileSizeColumns(dates As List) As VMDataTable
	For Each k As String In dates
		SetColumnType(k, COLUMN_FILESIZE)
	Next
	Return Me
End Sub

Sub SetColumnsFormatFileSize(dates As List) As VMDataTable
	SetFileSizeColumns(dates)
	Return Me
End Sub


'set the column type to time for these columns
Sub SetTimeColumns(dates As List) As VMDataTable
	For Each k As String In dates
		SetColumnType(k, COLUMN_TIME)
	Next
	Return Me
End Sub

Sub SetColumnsFormatTime(dates As List) As VMDataTable
	SetTimeColumns(dates)
	Return Me
End Sub

Sub SetColumnsFormatMoney(dates As List) As VMDataTable
	SetMoneyColumns(dates)
	Return Me
End Sub

'set the column type to time for these columns
Sub SetMoneyColumns(dates As List) As VMDataTable
	For Each k As String In dates
		SetColumnType(k, COLUMN_MONEY)
	Next
	Return Me
End Sub


