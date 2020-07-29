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
	Public COLUMN_SWITCH As String = "switch"
	Public COLUMN_AVATARIMG As String = "avatarimg"
	Public COLUMN_RATING As String = "rating"
	Public COLUMN_PROGRESS_CIRCULAR As String = "progresscircular"
	Public COLUMN_PROGRESS_LINEAR As String = "progresslinear"
	Public COLUMN_SAVE As String = "save"
	Public COLUMN_CANCEL As String = "cancel"
	Public COLUMN_TEXTFIELD As String = "textfield"
	
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
	Public vcard As VMCard
	Private title As String
	Private search As String
	Private items As String
	Type DataTableColumn(value As String, text As String, align As String, sortable As Boolean, filterable As Boolean, divider As Boolean, _
	className As String, width As String, filter As String, sort As String, TypeOf As String, extra As String, icon As String, Disabled As Boolean, imgWidth As String, imgHeight As String, avatarSize As String, iconSize As String, iconColor As String, ReadOnly As Boolean, progressColor As String, progressRotate As String, progressSize As String, progressWidth As String, progressHeight As String, progressShowValue As Boolean, valueFormat As String, bindTotals As String, hasTotal As Boolean)
	Private bStatic As Boolean
	Private hdr As List
	Private keyID As String
	Public masterColumns As List
	Public CardTitle As VMCardTitle
	Private hasTotals As Boolean
End Sub

'initialize the DataTable
Public Sub Initialize(v As BANanoVue, sid As String, sPrimaryKey As String, eventHandler As Object) As VMDataTable
	ID = sid.tolowercase
	vue = v
	Module = eventHandler
	keyID = $"${ID}key"$
	DataTable.Initialize(v, ID)
	DataTable.SetTag("v-data-table")
	vcard.Initialize(vue, $"${ID}card"$, Module)
	CardTitle = vcard.Title
	DesignMode = False
	filters.Initialize 
	hasFilters = False
	exclusions.Initialize 
	headers = $"${ID}headers"$
	title = $"${ID}title"$
	search = $"${ID}search"$
	items = $"${ID}items"$
	vue.SetData(headers, vue.newlist)
	vue.SetData(items, vue.newlist)
	vue.SetData(title, "")
	PrimaryKey = sPrimaryKey
	'
	vcard.IsDialog = False
	vcard.IsTable = True	'
	columnsM.Initialize 
	masterColumns.Initialize 
	hasTotals = False
	Return Me
End Sub

'get all the data from the table
Sub GetData As List
	Dim lst As List = vue.GetData(items)
	Return lst
End Sub

'return a list of selected primary keys
Sub GetItemKeys(lst As List) As List
	Dim xlist As List
	xlist.Initialize
	For Each m As Map In lst
		Dim xkey As String = m.GetDefault(PrimaryKey, "")
		xlist.Add(xkey)
	Next
	Return xlist
End Sub

Sub BANanoReplace
	Dim x As String = ToString
	BANano.GetElement($"#${ID}card"$).RenderReplace(x, "")
	Refresh
End Sub

Sub ResetFilter
	ApplyFilter(masterColumns)
End Sub

Sub ApplyFilter(thisFilter As List)
	'save this filter as a map, use the sequence of added columns
	'to the data-table
	Dim cols As List = vue.newlist
	Dim tk As Map = CreateMap()
	For Each colx As String In thisFilter
		tk.Put(colx, colx)
	Next
	Dim ds As List = vue.NewList
	
	'define new columns
	Dim nm As Map = CreateMap()
	'loop through master column
	For Each mc As String In masterColumns
		'is it on the filter
		If tk.ContainsKey(mc) Then
			Dim nf As DataTableColumn = columnsM.Get(mc)
			nm.Put(mc, nf)
			cols.Add(mc)
			'
			Dim ctext As String = nf.text
			Dim nc As Map = CreateMap()
			nc.Put("id", mc)
			nc.Put("text", ctext)
			ds.Add(nc)
		End If
	Next
	BuildHeaders(nm)
	vue.SetData($"${ID}columns"$, cols)
	'filter source
	vue.SetData($"${ID}fsource"$, ds)
End Sub

Sub SetStatic(b As Boolean) As VMDataTable
	bStatic = b
	DataTable.SetStatic(b)
	vcard.setstatic(b)
	Return Me
End Sub

Sub Reset
	exclusions.Initialize 
	filters.Initialize
	hasFilters = False
	columnsM.Initialize
	masterColumns.Initialize 
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

'add save icon
Sub AddSave(colField As String, colTitle As String)
	AddExclusion(colField)
	AddColumn(colField,colTitle)
	SetColumnFilterable(colField,False)
	SetColumnType(colField, COLUMN_SAVE)
	SetColumnSortable(colField, False)
	SetColumnAlignment(colField, ALIGN_CENTER)
	SetColumnIcon(colField, "mdi-content-save")
End Sub

'add cancel icon
Sub AddCancel(colField As String, colTitle As String)
	AddExclusion(colField)
	AddColumn(colField,colTitle)
	SetColumnFilterable(colField,False)
	SetColumnType(colField, COLUMN_CANCEL)
	SetColumnSortable(colField, False)
	SetColumnAlignment(colField, ALIGN_CENTER)
	SetColumnIcon(colField, "mdi-cancel")
End Sub


'add edit icon
Sub AddEdit(colField As String, colTitle As String)
	AddExclusion(colField)
	AddColumn(colField,colTitle)
	SetColumnFilterable(colField,False)
	SetColumnType(colField, COLUMN_EDIT)
	SetColumnSortable(colField, False)
	SetColumnAlignment(colField, ALIGN_CENTER)
	SetColumnIcon(colField, "mdi-pencil")
End Sub

Sub AddDelete(colField As String, colTitle As String)
	AddExclusion(colField)
	AddColumn(colField,colTitle)
	SetColumnFilterable(colField,False)
	SetColumnType(colField, COLUMN_DELETE)
	SetColumnSortable(colField, False)
	SetColumnAlignment(colField, ALIGN_CENTER)
	SetColumnIcon(colField, "mdi-delete")
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

Sub AddAction(colField As String, colTitle As String, colIcon As String)
	AddExclusion(colField)
	AddColumn(colField,colTitle)
	SetColumnFilterable(colField,False)
	SetColumnType(colField, COLUMN_ACTION)
	SetColumnSortable(colField, False)
	SetColumnAlignment(colField, ALIGN_CENTER)
	SetColumnIcon(colField, colIcon)
End Sub

Sub AddIconView(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_ICON)
	SetColumnFilterable(colField,False)
	SetColumnSortable(colField, False)
End Sub

Sub AddSwitch(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_SWITCH)
	SetColumnFilterable(colField,False)
	SetColumnSortable(colField, False)
End Sub

Sub SetColumnsSwitch(colFields As List)
	For Each col As String In colFields
		SetColumnType(col, COLUMN_SWITCH)
		SetColumnFilterable(col,False)
		SetColumnSortable(col, False)
	Next
End Sub

Sub SetColumnsCheckBox(colFields As List)
	For Each col As String In colFields
		SetColumnType(col, COLUMN_CHECKBOX)
		SetColumnFilterable(col,False)
		SetColumnSortable(col, False)
	Next
End Sub

Sub AddImage(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_IMAGE)
	SetColumnFilterable(colField,False)
	SetColumnSortable(colField, False)
End Sub


Sub AddAvatarImg(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_AVATARIMG)
	SetColumnFilterable(colField,False)
	SetColumnSortable(colField, False)
End Sub

Sub AddRating(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_RATING)
End Sub

Sub AddProgressCircular(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_PROGRESS_CIRCULAR)
End Sub

Sub AddProgressLinear(colField As String, colTitle As String)
	AddColumn(colField,colTitle)
	SetColumnType(colField, COLUMN_PROGRESS_LINEAR)
End Sub

'Sub AddTextField(colField As String, colTitle As String)
'	AddColumn(colField,colTitle)
'	SetColumnType(colField, COLUMN_TEXT_FIELD)
'End Sub
'
'Sub AddTextArea(colField As String, colTitle As String)
'	AddColumn(colField,colTitle)
'	SetColumnType(colField, COLUMN_TEXT_AREA)
'End Sub

'add edit & delete button
Sub AddEditThrash
	AddAction("edit", "Edit", "mdi-pencil")
	AddAction("delete", "Delete", "mdi-delete")
End Sub

Sub SetDelete(b As Boolean) As VMDataTable
	If b = False Then Return Me
	AddAction("delete", "Delete", "mdi-delete")
	Return Me
End Sub

Sub SetEdit(b As Boolean) As VMDataTable
	If b = False Then Return Me
	AddAction("edit", "Edit", "mdi-pencil")
	Return Me
End Sub

Sub SetSave(b As Boolean) As VMDataTable
	If b = False Then Return Me
	AddSave("save", "Save")
	Return Me
End Sub

Sub SetCancel(b As Boolean) As VMDataTable
	If b = False Then Return Me
	AddCancel("cancel", "Cancel")
	Return Me
End Sub


Sub SetDownload(b As Boolean) As VMDataTable
	If b = False Then Return Me
	AddDownload
	Return Me
End Sub

Sub AddDownload
	AddIcon("download","Get","attach_file")
End Sub

Sub AddMenuH
	AddIcon("menu","Menu","more_horiz")
End Sub

Sub SetMenu(b As Boolean) As VMDataTable
	If b = False Then Return Me
	AddMenuV
	Return Me
End Sub

Sub AddMenuV
	AddIcon("menu","Menu","more_vert")
End Sub

Sub SetClone(b As Boolean) As VMDataTable
	If b = False Then Return Me
	AddClone
	Return Me
End Sub

Sub AddClone
	AddIcon("clone","Clone","done_all")
End Sub

Sub SetPrint(b As Boolean) As VMDataTable
	If b = False Then Return Me
	AddPrint
	Return Me
End Sub

Sub AddPrint
	AddIcon("print", "Print", "print")
End Sub

Sub SetAddNew(key As String, iconName As String, toolTip As String) As VMDataTable
	AddNew(key, iconName, toolTip)
	Return Me
End Sub

'add search functionality
Sub SetSearchBox(b As Boolean) As VMDataTable
	If b = False Then Return Me
	AddSearch
	Return Me
End Sub

Sub AddSearch
	DataTable.Bind(":search", search)
	vcard.Title.AddSearch(search)
End Sub

'add spacer on the toolbar
Sub AddToolBarSpacer As VMDataTable
	vcard.Title.AddSpacer
	Return Me
End Sub

Sub AddDivider
	AddToolBarDivider
End Sub

Sub AddSpacer
	AddToolBarSpacer
End Sub

'add divider on the toolbar
Sub AddToolBarDivider As VMDataTable
	vcard.Title.AddDivider(True, Null, Null, Array("mx-2"), Null)
	Return Me
End Sub

'this should be added after all columns are added
Sub SetColumnChooser(isfilter As Boolean)
	If isfilter = False Then Return
	'all columns should be selected
	Dim ftime As List = vue.newlist
	Dim fsource As List = vue.newlist
	For Each colname As String In masterColumns
		Dim colm As DataTableColumn = columnsM.Get(colname)
		Dim coltext As String = colm.text
		'for selected items
		ftime.add(colname)
		'for data source
		Dim cols As Map = CreateMap()
		cols.Put("id", colname)
		cols.Put("text", coltext)
		fsource.Add(cols)
	Next
	'selectec items
	vue.SetData($"${ID}columns"$, ftime)
	'filter source
	vue.SetData($"${ID}fsource"$, fsource)
	'
	Dim dSource As String = $"${ID}fsource"$
	Dim dtKey As String = "id"
	Dim dtTitle As String = "text"
	'
	Dim dtMenu As VMMenu
	dtMenu.Initialize(vue, $"${ID}fsmenu"$, Me)
	dtMenu.SetOffSetY(True)
	'dtMenu.SetAttrSingle(":nudge-left", "170")
	dtMenu.SetAttrSingle(":close-on-content-click", "false")
	'
	Dim tmpact As VMTemplate
	tmpact.Initialize(vue, "", Me)
	tmpact.SetAttrSingle("v-slot:activator", "{ on, attrs }")
	'
	'create the menu button
	Dim btnMenu As VMButton
	btnMenu.Initialize(vue, $"${ID}fsbutton"$, Me)
	btnMenu.SetAttrLoose("icon")
	btnMenu.SetAttrSingle("v-on", "on")
	btnMenu.SetAttrSingle("v-bind", "attrs")
	btnMenu.Show
	'
	Dim btnIcon As VMIcon
	btnIcon.initialize(vue, $"${ID}fsicon"$, Me)
	btnIcon.SetText("more_vert")
	'add icon to button
	btnMenu.AddComponent(btnIcon.tostring)
	'add to template
	tmpact.AddComponent(btnMenu.ToString)
	'add button to menu
	dtMenu.AddComponent(tmpact.tostring)
	'create a list
	Dim dtList As VMList
	dtList.Initialize(vue, $"${ID}list"$, Me)
	dtList.SetDense(True)
	'
	Dim vlig As VMListItemGroup
	vlig.Initialize(vue, $"${ID}lig"$, Me)
	vlig.SetVModel($"${ID}columns"$)
	vlig.SetAttrLoose("multiple")
	vlig.SetOnChange("columnchooser")
	'
	Dim dtLI As VMListItem
	dtLI.Initialize(vue, "", Me)
	dtLI.SetAttrSingle("v-for", $"(item, index) in ${dSource}"$)
	dtLI.SetAttrSingle(":key", $"item.${dtKey}"$)
	dtLI.SetAttrSingle(":value", $"item.${dtKey}"$)
	'add checkbox slot
	Dim tmpx As VMTemplate
	tmpx.Initialize(vue, "", Me)
	tmpx.SetAttrSingle("v-slot:default", "{ active, toggle }")
	'add action item
	Dim vlia As VMListItemAction
	vlia.Initialize(vue, "", Me)
	'add checkbox
	Dim vliacb As VMCheckBox
	vliacb.Initialize(vue, "", Me)
	vliacb.SetStatic(bStatic)
	vliacb.SetAttrSingle(":input-value", "active")
	vliacb.SetAttrSingle(":key", $"item.${dtKey}"$)
	vliacb.SetAttrSingle(":true-value", $"item.${dtKey}"$)
	vliacb.SetColor("primary")
	vliacb.SetDense(True)
	vliacb.SetAttrSingle("@click", "toggle")
		
	'add checkbox to item action
	vlia.AddComponent(vliacb.tostring)
	tmpx.AddComponent(vlia.ToString)
	
	'add title
	Dim vlic As VMListItemContent
	vlic.Initialize(vue, "", Me)
	Dim vlit As VMListItemTitle
	vlit.Initialize(vue, "", Me)
	vlit.SetStatic(bStatic)
	vlit.SetVText($"item.${dtTitle}"$)
	vlic.AddComponent(vlit.ToString)
	'add template to item
	tmpx.AddComponent(vlic.ToString)
	dtLI.AddComponent(tmpx.tostring)
	'add to group
	vlig.AddComponent(dtLI.ToString)
	'add item to list
	dtList.AddComponent(vlig.tostring)
	'add list to menu
	dtMenu.AddComponent(dtList.Tostring)
	'add to the card
	Dim smenu As String = dtMenu.ToString
	vcard.Title.AddComponent(smenu)
	'
	'add filter cancel
	vcard.Title.AddDivider(True,Null,Null,Array("mx-2"),Null)
	'
	Dim btn As VMButton
	btn.Initialize(vue, "removefilter", Me)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetToolTip("Reset filter")
	btn.AddIcon("mdi-filter-remove","","")
	btn.SetColor("red")
	btn.SetAttrLoose("icon")
	btn.SetTransparent(True)
	vcard.Title.AddComponent(btn.tostring)
	'watch changes
	'vue.SetWatch($"${ID}columns"$, True, False, Me, "columnchooser")
End Sub

private Sub removefilter_click(e As BANanoEvent)
	ApplyFilter(masterColumns)
End Sub

private Sub columnchooser
	'get chosen columns
	Dim cols As List = vue.GetData($"${ID}columns"$)
	ApplyFilter(cols)
End Sub

'return the chosen columns
Sub GetSelectedColumns As List
	Dim cols As List = vue.GetData($"${ID}columns"$)
	Return cols
End Sub

Sub AddNew(key As String, iconName As String, toolTip As String) As VMDataTable
	key = key.tolowercase
	Dim btn As VMButton
	btn.Initialize(vue, key, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	btn.SetFabButton(iconName).SetTooltip(toolTip).SetPrimary(True).AddClass("mb-2")
	vcard.Title.SetText(btn.ToString)
	Return Me
End Sub

'update database from existing saved state
Sub SetDataSourceName(dsName As String) As VMDataTable
	dsName = dsName.ToLowerCase
	If vue.StateExists(dsName) = False Then
		vue.SetData(dsName, vue.newlist)
	End If
	Dim recs As List = vue.GetData(dsName)
	vue.SetData(items, recs)
	Return Me
End Sub

'update from a list of existing recods
Sub SetDataSource(ds As List) As VMDataTable
	vue.SetData(items, ds)
	Return Me
End Sub

Sub AddButton(btn As VMButton) As VMDataTable
	vcard.Title.SetText(btn.tostring)
	Return Me
End Sub

Sub AddButton1(key As String, iconName As String, text As String, toolTip As String) As VMDataTable
	vcard.Title.AddButton1(key, iconName, "", text, toolTip, "")
	Return Me
End Sub

Sub AddButtonIcon(key As String, iconName As String, iconColor As String, toolTip As String) As VMDataTable
	vcard.Title.AddIcon(key, iconName, iconColor, "", toolTip, "")
	Return Me
End Sub

Sub AddMenu(menu As VMMenu) As VMDataTable
	vcard.Title.SetText(menu.ToString)
	Return Me
End Sub

'set the title of the table
Sub SetTitle(sTitle As String) As VMDataTable
	If sTitle = "" Then Return Me
	If bStatic Then
		vcard.Title.SetText(sTitle)
		vcard.Title.AddSpacer
		Return Me
	End If
	vue.SetData(title, sTitle)
	vcard.Title.SetText($"{{ ${title} }}"$)
	vcard.Title.AddSpacer
	Return Me
End Sub

Sub UpdateTitle(sTitle As String) As VMDataTable
	vue.SetData(title, sTitle)
	Return Me
End Sub

'add columns to exclude
Sub AddExclusion(colKey As String) As VMDataTable
	exclusions.Add(colKey)
	Return Me
End Sub

'set filters
Sub SetFilters(sourceOf As String)
	filters = vue.GetState(sourceOf, vue.newlist)
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

'add expansion slot
Sub AddExpandSlot(bSingleExpand As Boolean, cont As VMContainer)
	AddExpandColumn
	SetSingleExpand(bSingleExpand)
	SetExpanded(vue.newlist)
	SetShowExpand(True)
	
	Dim expandSlot As VMTemplate
	expandSlot.Initialize(vue, $"${ID}expand"$, Module)
	expandSlot.SetAttrSingle("v-slot:expanded-item", "{ headers, item }")
	If cont <> Null Then expandSlot.SetText(cont.tostring)
	AddComponent(expandSlot.tostring)
End Sub

Sub AddEditDialogCombo(colName As String, bLarge As Boolean, sourceTable As String, sourceField As String, displayField As String, returnObject As Boolean)
	Dim changeEvent As String = $"${ID}_${colName}_change"$
	Dim el As VMSelect
	el.Initialize(vue, $"${ID}${colName}"$, Module)
	If SubExists(Module, changeEvent) Then
		el.SetOnChange(Module, $"${ID}_${colName}_change"$)
		el.SetAttrSingle("@change", $"${changeEvent}(props.item)"$)
		Dim item As Map
		Dim cb As BANanoObject = BANano.CallBack(Module, changeEvent, Array(item))
		vue.SetCallBack(changeEvent, cb)
	End If
	el.SetStatic(bStatic)
	el.SetDesignMode(DesignMode)
	el.SetAttrSingle(":label", "props.header.text")
	el.SetComboBox
	el.SetClearable(True)
	el.SetVModel($"props.item.${colName}"$)
	el.SetDataSource(sourceTable, sourceField, displayField,returnObject)
	Dim scombo As String = el.tostring
	'
	Dim slarge As String = "large lazy"
	If bLarge = False Then slarge = ""
	Dim temp As String = $"<template v-slot:item.${colName}="props">
<v-edit-dialog :return-value="props.item.${colName}" @save="${ID}_saveitem(props)" @cancel="${ID}_cancelitem(props)" @open="${ID}_openitem(props)" @close="${ID}_closeitem(props)" ${slarge}> {{ props.item.${colName} }}
<template v-slot:input> ${scombo} </template>
</v-edit-dialog>
</template>"$
	AddComponent(temp)
End Sub
'
Sub AddEditDialogAutoComplete(colName As String, bLarge As Boolean, sourceTable As String, sourceField As String, displayField As String, returnObject As Boolean)
	Dim changeEvent As String = $"${ID}_${colName}_change"$
	Dim el As VMSelect
	el.Initialize(vue, $"${ID}${colName}"$, Module)
	If SubExists(Module, changeEvent) Then
		el.SetOnChange(Module, $"${ID}_${colName}_change"$)
		el.SetAttrSingle("@change", $"${changeEvent}(props)"$)
		Dim item As Map
		Dim cb As BANanoObject = BANano.CallBack(Module, changeEvent, Array(item))
		vue.SetCallBack(changeEvent, cb)
	End If
	el.SetStatic(bStatic)
	el.SetDesignMode(DesignMode)
	el.SetAutoComplete
	el.SetAttrSingle(":label", $"props.header.text"$)
	el.SetClearable(True)
	el.SetVModel($"props.item.${colName}"$)
	el.SetDataSource(sourceTable, sourceField, displayField,returnObject)
	Dim scombo As String = el.tostring
	'
	Dim slarge As String = "large lazy"
	If bLarge = False Then slarge = ""
	Dim temp As String = $"<template v-slot:item.${colName}="props">
<v-edit-dialog :return-value="props.item.${colName}" @save="${ID}_saveitem(props)" @cancel="${ID}_cancelitem(props)" @open="${ID}_openitem(props)" @close="${ID}_closeitem(props)" ${slarge}> {{ props.item.${colName} }}
<template v-slot:input> ${scombo} </template>
</v-edit-dialog>
</template>"$
	AddComponent(temp)
End Sub

Sub AddEditDialog(colName As String, bLarge As Boolean)
	Dim slarge As String = "large lazy"
	If bLarge = False Then slarge = ""
Dim temp As String = $"<template v-slot:item.${colName}="props">
<v-edit-dialog :return-value.sync="props.item.${colName}" @save="${ID}_saveitem(props)" @cancel="${ID}_cancelitem(props)" @open="${ID}_openitem(props)" @close="${ID}_closeitem(props)" ${slarge}> {{ props.item.${colName} }}
<template v-slot:input> <v-text-field v-model="props.item.${colName}" :label="props.header.text" counter></v-text-field></template></v-edit-dialog>
</template>"$
	AddComponent(temp)
End Sub

Sub AddEditDialogTextArea(colName As String, bLarge As Boolean)
	Dim slarge As String = "large lazy"
	If bLarge = False Then slarge = ""
Dim temp As String = $"<template v-slot:item.${colName}="props">
<v-edit-dialog :return-value.sync="props.item.${colName}" @save="${ID}_saveitem(props)" @cancel="${ID}_cancelitem(props)" @open="${ID}_openitem(props)" @close="${ID}_closeitem(props)" ${slarge}> {{ props.item.${colName} }}
<template v-slot:input> <v-textarea v-model="props.item.${colName}" :label="props.header.text" counter></v-textarea></template>
</v-edit-dialog>
</template>"$
	  AddComponent(temp)
End Sub


Sub AddSaveCancelOpenClose
	Dim savemethodName As String = $"${ID}_saveitem"$
	If SubExists(Module, savemethodName) = False Then 
		Log($"VMDataTable: Please add '${ID}_saveitem(item As Map)' callback."$)
		Return
	End If
	Dim item As Map
	Dim cb As BANanoObject = BANano.CallBack(Module, savemethodName, Array(item))
	vue.SetCallBack(savemethodName, cb)
	'
	Dim cancelmethodName As String = $"${ID}_cancelitem"$
	If SubExists(Module, cancelmethodName) = False Then 
		Log($"VMDataTable: Please add '${ID}_cancelitem(item As Map)' callback."$)
		Return
	End If
	Dim item As Map
	Dim cb As BANanoObject = BANano.CallBack(Module, cancelmethodName, Array(item))
	vue.SetCallBack(cancelmethodName, cb)
	'
	Dim openmethodName As String = $"${ID}_openitem"$
	If SubExists(Module, openmethodName) = False Then 
		Log($"VMDataTable: Please add '${ID}_openitem(item As Map)' callback."$)
		Return
	End If
	Dim item As Map
	Dim cb As BANanoObject = BANano.CallBack(Module, openmethodName, Array(item))
	vue.SetCallBack(openmethodName, cb)
	
	Dim closemethodName As String = $"${ID}_closeitem"$
	If SubExists(Module, closemethodName) = False Then 
		Log($"VMDataTable: Please add '${ID}_closeitem(item As Map)' callback."$)
		Return
	End If
	Dim item As Map
	Dim cb As BANanoObject = BANano.CallBack(Module, closemethodName, Array(item))
	vue.SetCallBack(closemethodName, cb)
End Sub

Sub AddExpandColumn
	AddColumn("data-table-expand", "")
End Sub

'add a column
'key, title, 
Sub AddColumn1(colName As String, colTitle As String, colType As String, colWidth As Int, colSortable As Boolean, colAlign As String) As VMDataTable
	masterColumns.Add(colName)
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
Sub SetColumnTotal(colName As String, callBackMethod As String) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.bindTotals = callBackMethod
		columnsM.Put(colName,col)
		hasTotals = True
	End If
	Return Me
End Sub

'set image dimensions
Sub SetImageDimensions(colName As String, imgHeight As String, imgWidth As String) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.imgHeight = imgHeight
		col.imgWidth = imgWidth
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column sortable
Sub SetColumnSortable(colName As String, colSortable As Boolean) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.sortable = colSortable
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column sortable
Sub SetColumnDisabled(colName As String, colDisabled As Boolean) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.Disabled = colDisabled
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column sortable
Sub SetColumnReadOnly(colName As String, colReadOnly As Boolean) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.ReadOnly = colReadOnly
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set the column data template
Sub SetColumnAlignment(colName As String, colAlign As String) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.align = colAlign
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set the column data template
Sub SetColumnExtra(colName As String, colExtra As String) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.extra = colExtra
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

Sub SetColumnIcon(colName As String, icon As String) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.icon = icon
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

Sub SetIconDimensions(colName As String, iconSize As String, iconColor As String) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.iconSize = iconSize
		col.iconColor = iconColor
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

Sub SetIconDimensions1(colName As String, iconSize As String, iconColor As String, columnWidth As String) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.iconSize = iconSize
		col.iconColor = iconColor
		col.width = columnWidth
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub


Sub SetProgressCircularDimensions(colName As String, progressColor As String, progressRotate As String, progressSize As String, progressWidth As String) As VMDataTable
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

Sub SetProgressLinearDimensions(colName As String, progressColor As String, progressHeight As String, progressShowValue As Boolean) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.progressHeight = progressHeight
		col.progressShowValue = progressShowValue
		col.progressColor = progressColor
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

Sub SetRatingDimensions(colName As String, ratLength As String, ratColor As String) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.iconSize = ratLength
		col.iconColor = ratColor
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub


'set the column data template
Sub SetColumnWidth(colName As String, colWidth As Int) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.width = colWidth
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column filterable
Sub SetColumnFilterable(colName As String, colFilter As Boolean) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.filterable = colFilter
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column class
Sub SetColumnClass(colName As String, colClass As String) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.classname = colClass
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

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
Sub SetColumnType(colName As String, colType As String) As VMDataTable
	If columnsM.ContainsKey(colName) Then
		Dim col As DataTableColumn = columnsM.Get(colName)
		col.TypeOf = colType
		Select Case colType
		Case COLUMN_IMAGE, COLUMN_AVATARIMG, COLUMN_SWITCH
			col.filterable = False
		Case COLUMN_MONEY
			col.align = ALIGN_RIGHT
			Dim item As Map
			Dim cb As BANanoObject = BANano.CallBack(Me, "getmoneyformat", Array(item))
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
		Case COLUMN_DATETIME
			col.valueFormat = "yyyy-MM-dd HH:MM"
		End Select
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

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
		'
		Select Case ct
		Case COLUMN_TEXTFIELD
			Dim tmp As VMTemplate
			tmp.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			tmp.SetAttrSingle($"#item.${value}"$, "{item}")
			'
			Dim tmpSlot As VMTemplate
			tmpSlot.Initialize(vue, "", Module).SetAttrLoose("v-slot:input")
			tmpSlot.SetStatic(bStatic).SetDesignMode(DesignMode)
			
			Dim txtFIeld As VMTextField
			txtFIeld.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			txtFIeld.SetVModel($"props.item.${value}"$)
			txtFIeld.SetAttrSingle(":placeholer","props.header.text")
			txtFIeld.SetHideDetails(True)
			'
			tmpSlot.AddComponent(txtFIeld.ToString)
			tmp.AddComponent(tmpSlot.ToString)
			sb.Append(tmp.ToString)
				
		Case COLUMN_DATE, COLUMN_DATETIME, COLUMN_TIME
			'get the date format
			Dim df As String = nf.valueFormat
			'
			Dim tmp As VMTemplate
			tmp.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			tmp.SetAttrSingle($"#item.${value}"$, "{item}")
			'
			Dim span As VMElement
			span.Initialize(vue,"")
			span.SetTag("span") 
			span.SetText($"{{ getdateformat(item.${value}, "${df}") }}"$)
			tmp.AddComponent(span.ToString)
			sb.Append(tmp.ToString)
		Case COLUMN_MONEY
			Dim tmp As VMTemplate
			tmp.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			tmp.SetAttrSingle($"#item.${value}"$, "{item}")
			'
			Dim span As VMElement
			span.Initialize(vue,"")
			span.SetTag("span")
			span.SetText($"{{ getmoneyformat(item.${value}) }}"$)
			tmp.AddComponent(span.ToString)
			sb.Append(tmp.ToString)
		Case COLUMN_FILESIZE
			Dim tmp As VMTemplate
			tmp.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
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
			tmp.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			Dim sline As String = $"v-slot:item.${value}="{ item }""$
			tmp.SetAttrLoose(sline)
			'
			Dim pl As VMProgressLinear
			pl.Initialize(vue, $"${ID}${value}"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
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
			tmp.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			Dim sline As String = $"v-slot:item.${value}="{ item }""$
			tmp.SetAttrLoose(sline)
			'
			Dim pc As VMProgressCircular
			pc.Initialize(vue, $"${ID}${value}"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
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
			tmp.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			Dim sline As String = $"v-slot:item.${value}="{ item }""$
			tmp.SetAttrLoose(sline)
			'
			Dim rat As VMRating
			rat.Initialize(vue, $"${ID}${value}"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
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
			tmp.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			Dim sline As String = $"v-slot:item.${value}="{ item }""$
			tmp.SetAttrLoose(sline)
				
			Dim avt As VMAvatar
			Dim avtimg As VMImage
			'
			avt.Initialize(vue,"", "").SetStatic(bStatic).SetDesignMode(DesignMode)
			avtimg.Initialize(vue, "","").SetStatic(bStatic).SetDesignMode(DesignMode)
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
			tmp.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			Dim sline As String = $"v-slot:item.${value}="{ item }""$
			tmp.SetAttrLoose(sline)
			'
			Dim swt As VMCheckBox
			swt.Initialize(vue, $"${ID}${value}"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
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
			tmp.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			Dim sline As String = $"v-slot:item.${value}="{ item }""$
			tmp.SetAttrLoose(sline)
			'
			Dim aIcon As VMIcon
			aIcon.Initialize(vue, $"${ID}${value}"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			aIcon.SetVText($"item.${value}"$)
			If nf.Disabled Then aIcon.SetAttrLoose("disabled")
			If nf.iconSize <> "" Then aIcon.SetSize(nf.iconSize)
			If nf.iconColor <> "" Then aIcon.SetColor(nf.iconcolor)
			tmp.AddComponent(aIcon.ToString)
			sb.Append(tmp.ToString)
		Case COLUMN_IMAGE
			Dim tmp As VMTemplate
			tmp.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			Dim sline As String = $"v-slot:item.${value}="{ item }""$
			tmp.SetAttrLoose(sline)
			'		
			Dim avtimg As VMImage
			avtimg.Initialize(vue, "","").SetStatic(bStatic).SetDesignMode(DesignMode)
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
			tmp.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			Dim sline As String = $"v-slot:item.${value}="{ item }""$
			tmp.SetAttrLoose(sline)
			'
			Dim chp As VMChip
			chp.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			chp.SetAttributes(Array("dark"))
			chp.SetText($"{{ item.${value} }}"$)
			If nf.Disabled Then chp.SetAttrLoose("disabled")
			If nf.extra <> "" Then chp.SetAttrLoose(nf.extra)
			'
			tmp.AddComponent(chp.ToString)
			sb.Append(tmp.ToString)
		Case COLUMN_ACTION, COLUMN_EDIT, COLUMN_DELETE, COLUMN_SAVE, COLUMN_CANCEL
			Dim tmpa As VMTemplate
			tmpa.Initialize(vue, "" , Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			Dim sline As String = $"v-slot:item.${value}="{ item }""$
			tmpa.SetAttrLoose(sline)
			'
			Dim abtn As VMButton
			abtn.Initialize(vue, $"${ID}${value}"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			abtn.SetElevation("4").SetFab(True).SetSmall(True).SetDark(True)
			abtn.AddClass("mr-2")
			If nf.iconColor <> "" Then abtn.SetColor(nf.iconcolor)
			If nf.Disabled Then abtn.SetAttrLoose("disabled")
			 
			Dim aIcon As VMIcon
			aIcon.Initialize(vue, $"${ID}${value}icon"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
			aIcon.SetText(nf.icon)
			If nf.iconSize <> "" Then aIcon.SetSize(nf.iconSize)
			abtn.AddComponent(aIcon.tostring)
			
			If SubExists(Module, methodName) Then
				abtn.SetAttrSingle("@click", $"${ID}_${value}(item)"$)
				vue.SetMethod(Module, methodName)
			End If
			tmpa.AddComponent(abtn.ToString)
			sb.Append(tmpa.ToString)
		End Select	
	Next
	'
	If hasTotals Then
		sbTotals.Append($"</tr>"$)
		sb.Append(sbTotals.ToString)
	End If
	DataTable.SetText(sb.ToString)
End Sub

'get component
Sub ToString As String
	vue.SetData(keyID, DateTime.Now)
	'build the headers
	BuildHeaders(columnsM)
	vcard.Bind(":key", keyID)
	DataTable.Bind(":headers", headers)
	DataTable.Bind(":items", items)
	DataTable.Bind("item-key",PrimaryKey)
	BuildControls
	vcard.AddStuff(DataTable.ToString)
	Return vcard.ToString
End Sub

'update the key
Sub Refresh
	Dim dt As String = DateTime.now
	vue.SetData(keyID, dt)
End Sub

Sub SetVModel(k As String) As VMDataTable
	DataTable.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMDataTable
	vcard.SetVIf(vif)
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

Sub AddComponent(tcomp As String) As VMDataTable
	SetText(tcomp)
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

'set calculate-widths
Sub SetCalculateWidths(varCalculateWidths As Boolean) As VMDataTable
	If varCalculateWidths = False Then Return Me
	If bStatic Then
		SetAttrSingle("calculate-widths", varCalculateWidths)
		Return Me
	End If
	Dim pp As String = $"${ID}CalculateWidths"$
	vue.SetStateSingle(pp, varCalculateWidths)
	DataTable.Bind(":calculate-widths", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMDataTable
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	DataTable.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMDataTable
	If bStatic Then
		SetAttrSingle("dense", varDense)
		Return Me
	End If
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	DataTable.Bind(":dense", pp)
	Return Me
End Sub

'set disable-filtering
Sub SetDisableFiltering(varDisableFiltering As Boolean) As VMDataTable
	If varDisableFiltering = False Then Return Me
	If bStatic Then
		SetAttrSingle("disable-filtering", varDisableFiltering)
		Return Me
	End If
	Dim pp As String = $"${ID}DisableFiltering"$
	vue.SetStateSingle(pp, varDisableFiltering)
	DataTable.Bind(":disable-filtering", pp)
	Return Me
End Sub

'set disable-pagination
Sub SetDisablePagination(varDisablePagination As Boolean) As VMDataTable
	If varDisablePagination = False Then Return Me
	If bStatic Then
		SetAttrSingle("disable-pagination", varDisablePagination)
		Return Me
	End If
	Dim pp As String = $"${ID}DisablePagination"$
	vue.SetStateSingle(pp, varDisablePagination)
	DataTable.Bind(":disable-pagination", pp)
	Return Me
End Sub

'set disable-sort
Sub SetDisableSort(varDisableSort As Boolean) As VMDataTable
	If varDisableSort = False Then Return Me
	If bStatic Then
		SetAttrSingle("disable-sort", varDisableSort)
		Return Me
	End If
	Dim pp As String = $"${ID}DisableSort"$
	vue.SetStateSingle(pp, varDisableSort)
	DataTable.Bind(":disable-sort", pp)
	Return Me
End Sub

'set fixed-header
Sub SetFixedHeader(varFixedHeader As Boolean) As VMDataTable
	If varFixedHeader = False Then Return Me
	If bStatic Then
		SetAttrSingle("fixed-header", varFixedHeader)
		Return Me
	End If
	Dim pp As String = $"${ID}FixedHeader"$
	vue.SetStateSingle(pp, varFixedHeader)
	DataTable.Bind(":fixed-header", pp)
	Return Me
End Sub

'set hide-default-footer
Sub SetHideDefaultFooter(varHideDefaultFooter As Boolean) As VMDataTable
	If varHideDefaultFooter = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-default-footer", varHideDefaultFooter)
		Return Me
	End If
	Dim pp As String = $"${ID}HideDefaultFooter"$
	vue.SetStateSingle(pp, varHideDefaultFooter)
	DataTable.Bind(":hide-default-footer", pp)
	Return Me
End Sub

'set hide-default-header
Sub SetHideDefaultHeader(varHideDefaultHeader As Boolean) As VMDataTable
	If varHideDefaultHeader = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-default-header", varHideDefaultHeader)
		Return Me
	End If
	Dim pp As String = $"${ID}HideDefaultHeader"$
	vue.SetStateSingle(pp, varHideDefaultHeader)
	DataTable.Bind(":hide-default-header", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMDataTable
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	DataTable.Bind(":light", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Boolean) As VMDataTable
	If varLoading = False Then Return Me
	If bStatic Then
		SetAttrSingle("loading", varLoading)
		Return Me
	End If
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	DataTable.Bind(":loading", pp)
	Return Me
End Sub

'set multi-sort
Sub SetMultiSort(varMultiSort As Boolean) As VMDataTable
	If varMultiSort = False Then Return Me
	If bStatic Then
		SetAttrSingle("multi-sort", varMultiSort)
		Return Me
	End If
	Dim pp As String = $"${ID}MultiSort"$
	vue.SetStateSingle(pp, varMultiSort)
	DataTable.Bind(":multi-sort", pp)
	Return Me
End Sub

'set must-sort
Sub SetMustSort(varMustSort As Boolean) As VMDataTable
	If varMustSort = False Then Return Me
	If bStatic Then
		SetAttrSingle("must-sort", varMustSort)
		Return Me
	End If
	Dim pp As String = $"${ID}MustSort"$
	vue.SetStateSingle(pp, varMustSort)
	DataTable.Bind(":must-sort", pp)
	Return Me
End Sub

'set show-expand
Sub SetShowExpand(varShowExpand As Boolean) As VMDataTable
	If varShowExpand = False Then Return Me
	If bStatic Then
		SetAttrSingle("show-expand", varShowExpand)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowExpand"$
	vue.SetStateSingle(pp, varShowExpand)
	DataTable.Bind(":show-expand", pp)
	Return Me
End Sub

'set show-group-by
Sub SetShowGroupBy(varShowGroupBy As Boolean) As VMDataTable
	If varShowGroupBy = False Then Return Me
	If bStatic Then
		SetAttrSingle("show-group-by", varShowGroupBy)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowGroupBy"$
	vue.SetStateSingle(pp, varShowGroupBy)
	DataTable.Bind(":show-group-by", pp)
	Return Me
End Sub

'set show-select
Sub SetShowSelect(varShowSelect As Boolean) As VMDataTable
	If varShowSelect = False Then Return Me
	If bStatic Then
		SetAttrSingle("show-select", varShowSelect)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowSelect"$
	vue.SetStateSingle(pp, varShowSelect)
	DataTable.Bind(":show-select", pp)
	Return Me
End Sub

'set single-expand
Sub SetSingleExpand(varSingleExpand As Boolean) As VMDataTable
	If varSingleExpand = False Then Return Me
	If bStatic Then
		SetAttrSingle("single-expand", varSingleExpand)
		Return Me
	End If
	Dim pp As String = $"${ID}SingleExpand"$
	vue.SetStateSingle(pp, varSingleExpand)
	DataTable.Bind(":single-expand", pp)
	Return Me
End Sub

'set single-select
Sub SetSingleSelect(varSingleSelect As Boolean) As VMDataTable
	If varSingleSelect = False Then Return Me
	If bStatic Then
		SetAttrSingle("single-select", varSingleSelect)
		Return Me
	End If
	Dim pp As String = $"${ID}SingleSelect"$
	vue.SetStateSingle(pp, varSingleSelect)
	DataTable.Bind(":single-select", pp)
	Return Me
End Sub

'set caption
Sub SetCaption(varCaption As String) As VMDataTable
	If varCaption = "" Then Return Me
	If bStatic Then
		SetAttrSingle("caption", varCaption)
		Return Me
	End If
	Dim pp As String = $"${ID}Caption"$
	vue.SetStateSingle(pp, varCaption)
	DataTable.Bind(":caption", pp)
	Return Me
End Sub

'set expand-icon
Sub SetExpandIcon(varExpandIcon As String) As VMDataTable
	If varExpandIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("expand-icon", varExpandIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}ExpandIcon"$
	vue.SetStateSingle(pp, varExpandIcon)
	DataTable.Bind(":expand-icon", pp)
	Return Me
End Sub

'set headers-length
Sub SetHeadersLength(varHeadersLength As String) As VMDataTable
	If varHeadersLength = "" Then Return Me
	If bStatic Then
		SetAttrSingle("headers-length", varHeadersLength)
		Return Me
	End If
	Dim pp As String = $"${ID}HeadersLength"$
	vue.SetStateSingle(pp, varHeadersLength)
	DataTable.Bind(":headers-length", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMDataTable
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	DataTable.Bind(":height", pp)
	Return Me
End Sub

'set item-key
Sub SetItemKey(varItemKey As String) As VMDataTable
	If varItemKey = "" Then Return Me
	If bStatic Then
		SetAttrSingle("item-key", varItemKey)
		Return Me
	End If
	Dim pp As String = $"${ID}ItemKey"$
	vue.SetStateSingle(pp, varItemKey)
	DataTable.Bind(":item-key", pp)
	Return Me
End Sub

'set items-per-page
Sub SetItemsPerPage(varItemsPerPage As String) As VMDataTable
	If varItemsPerPage = "" Then Return Me
	varItemsPerPage = BANano.parseInt(varItemsPerPage)
	If bStatic Then
		SetAttrSingle("items-per-page", varItemsPerPage)
		Return Me
	End If
	Dim pp As String = $"${ID}ItemsPerPage"$
	vue.SetStateSingle(pp, varItemsPerPage)
	DataTable.Bind(":items-per-page", pp)
	Return Me
End Sub

'set loading-text
Sub SetLoadingText(varLoadingText As String) As VMDataTable
	If varLoadingText = "" Then Return Me
	If bStatic Then
		SetAttrSingle("loading-text", varLoadingText)
		Return Me
	End If
	Dim pp As String = $"${ID}LoadingText"$
	vue.SetStateSingle(pp, varLoadingText)
	DataTable.Bind(":loading-text", pp)
	Return Me
End Sub

'set locale
Sub SetLocale(varLocale As String) As VMDataTable
	If varLocale = "" Then Return Me
	If bStatic Then
		SetAttrSingle("locale", varLocale)
		Return Me
	End If
	Dim pp As String = $"${ID}Locale"$
	vue.SetStateSingle(pp, varLocale)
	DataTable.Bind(":locale", pp)
	Return Me
End Sub

'set mobile-breakpoint
Sub SetMobileBreakpoint(varMobileBreakpoint As String) As VMDataTable
	If varMobileBreakpoint = "" Then Return Me
	varMobileBreakpoint = BANano.parseInt(varMobileBreakpoint)
	If bStatic Then
		SetAttrSingle("mobile-breakpoint", varMobileBreakpoint)
		Return Me
	End If
	Dim pp As String = $"${ID}MobileBreakpoint"$
	vue.SetStateSingle(pp, varMobileBreakpoint)
	DataTable.Bind(":mobile-breakpoint", pp)
	Return Me
End Sub

'set no-data-text
Sub SetNoDataText(varNoDataText As String) As VMDataTable
	If varNoDataText = "" Then Return Me
	If bStatic Then
		SetAttrSingle("no-data-text", varNoDataText)
		Return Me
	End If
	Dim pp As String = $"${ID}NoDataText"$
	vue.SetStateSingle(pp, varNoDataText)
	DataTable.Bind(":no-data-text", pp)
	Return Me
End Sub

'set no-results-text
Sub SetNoResultsText(varNoResultsText As String) As VMDataTable
	If varNoResultsText = "" Then Return Me
	If bStatic Then
		SetAttrSingle("no-results-text", varNoResultsText)
		Return Me
	End If
	Dim pp As String = $"${ID}NoResultsText"$
	vue.SetStateSingle(pp, varNoResultsText)
	DataTable.Bind(":no-results-text", pp)
	Return Me
End Sub

'set page
Sub SetPage(varPage As String) As VMDataTable
	If varPage = "" Then Return Me
	varPage = BANano.parseInt(varPage)
	If bStatic Then
		SetAttrSingle("page", varPage)
		Return Me
	End If
	Dim pp As String = $"${ID}Page"$
	vue.SetStateSingle(pp, varPage)
	DataTable.Bind(":page.sync", pp)
	Return Me
End Sub

'link a data-table to the pagination
Sub SetExternalPagination As VMDataTable
	SetPage("1")
	vue.SetData($"${ID}pagecount"$, "0")
	Dim scode As String = ID & "pagecount = $event"
	SetAttrSingle("@page-count", scode)
	SetHideDefaultFooter(True)
	Return Me
End Sub

'set selectable-key
Sub SetSelectableKey(varSelectableKey As String) As VMDataTable
	If varSelectableKey = "" Then Return Me
	If bStatic Then
		SetAttrSingle("selectable-key", varSelectableKey)
		Return Me
	End If
	Dim pp As String = $"${ID}SelectableKey"$
	vue.SetStateSingle(pp, varSelectableKey)
	DataTable.Bind(":selectable-key", pp)
	Return Me
End Sub

'set server-items-length
Sub SetServerItemsLength(varServerItemsLength As String) As VMDataTable
	If varServerItemsLength = "" Then Return Me
	If bStatic Then
		SetAttrSingle("server-items-length", varServerItemsLength)
		Return Me
	End If
	Dim pp As String = $"${ID}ServerItemsLength"$
	vue.SetStateSingle(pp, varServerItemsLength)
	DataTable.Bind(":server-items-length", pp)
	Return Me
End Sub

'set expanded
Sub SetExpanded(varExpanded As List) As VMDataTable
	Dim pp As String = $"${ID}Expanded"$
	vue.SetStateSingle(pp, varExpanded)
	DataTable.Bind(":expanded.sync", pp)
	Return Me
End Sub

'set group-by
Sub SetGroupBy(varGroupBy As String) As VMDataTable
	If varGroupBy = "" Then Return Me
	If bStatic Then
		SetAttrSingle("group-by", varGroupBy)
		Return Me
	End If
	Dim pp As String = $"${ID}GroupBy"$
	vue.SetStateSingle(pp, varGroupBy)
	DataTable.Bind(":group-by", pp)
	Return Me
End Sub

'set group-desc
Sub SetGroupDesc(varGroupDesc As String) As VMDataTable
	If varGroupDesc = "" Then Return Me
	If bStatic Then
		SetAttrSingle("group-desc", varGroupDesc)
		Return Me
	End If
	Dim pp As String = $"${ID}GroupDesc"$
	vue.SetStateSingle(pp, varGroupDesc)
	DataTable.Bind(":group-desc", pp)
	Return Me
End Sub

'set sort-by
Sub SetSortBy(varSortBy As String) As VMDataTable
	If varSortBy = "" Then Return Me
	If bStatic Then
		SetAttrSingle("sort-by", varSortBy)
		Return Me
	End If
	Dim pp As String = $"${ID}SortBy"$
	vue.SetStateSingle(pp, varSortBy)
	DataTable.Bind(":sort-by", pp)
	Return Me
End Sub

'set sort-desc
Sub SetSortDesc(varSortDesc As String) As VMDataTable
	If varSortDesc = "" Then Return Me
	If bStatic Then
		SetAttrSingle("sort-desc", varSortDesc)
		Return Me
	End If
	Dim pp As String = $"${ID}SortDesc"$
	vue.SetStateSingle(pp, varSortDesc)
	DataTable.Bind(":sort-desc", pp)
	Return Me
End Sub


'set value
Sub SetValue(varValue As Object) As VMDataTable
	DataTable.SetValue(varValue, False)
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
SetAttr(CreateMap("@click:row": methodName))
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
SetAttr(CreateMap("@current-items": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMDataTable
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim xitems As List
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(xitems))
	SetAttr(CreateMap("@input": methodName))
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
SetAttr(CreateMap("@item-expanded": methodName))
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
SetAttr(CreateMap("@item-selected": methodName))
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
SetAttr(CreateMap("@page-count": methodName))
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
SetAttr(CreateMap("@pagination": methodName))
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
SetAttr(CreateMap("@toggle-select-all": methodName))
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
SetAttr(CreateMap("@update:expanded": methodName))
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
SetAttr(CreateMap("@update:group-by": methodName))
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
SetAttr(CreateMap("@update:group-desc": methodName))
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
SetAttr(CreateMap("@update:items-per-page": methodName))
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
SetAttr(CreateMap("@update:multi-sort": methodName))
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
SetAttr(CreateMap("@update:must-sort": methodName))
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
SetAttr(CreateMap("@update:options": methodName))
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
SetAttr(CreateMap("@update:page": methodName))
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
SetAttr(CreateMap("@update:sort-by": methodName))
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
	SetAttr(CreateMap("@update:sort-desc": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'hide the component
Sub Hide As VMDataTable
	vcard.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMDataTable
	vcard.SetVisible(True)
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
	vcard.SetDesignMode(b)
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

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMDataTable
	DataTable.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMDataTable
	vcard.SetVisible(b)
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

'used by designer only
Sub SetSelectType(selType As String) As VMDataTable
	If selType = "" Then Return Me
	Return Me
End Sub

'used by designer only
Sub SetSelectFields(selFields As String) As VMDataTable
	If selFields = "" Then Return Me
	Return Me
End Sub

'used by the designer only
Sub SetSortFields(sortFields As String) As VMDataTable
	If sortFields = "" Then Return Me
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

Sub SetItemClass(methodName As String) As VMDataTable
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) Then
		SetAttrSingle(":item-class", methodName)
		Dim Item As Map
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(Item))
		'add to methods
		vue.SetCallBack(methodName, cb)
	Else
		Log("VMDataTable:SetItemClass - the item-class method has not been defined!")
	End If
	Return Me
End Sub

'set the format of the date in the column
Sub SetColumnDateFormat(colName As String, colFormat As String) As VMDataTable
	'valueFormat
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

private Sub getdateformat(item As String, sFormat As String) As String
	If item.Length = 0 Then Return ""
	Try
		item = vue.MvField(item,1," ")
		item = item.trim
		DateTime.DateFormat = "yyyy-MM-dd"
		Dim dt As Long = DateTime.DateParse(item)
		DateTime.DateFormat = sFormat
		Dim rslt As String = DateTime.Date(dt)
		Return rslt
	Catch
		Return item
	End Try
End Sub


private Sub getmoneyformat(item As String) As String
	Dim svalue As String = vue.MakeMoney(item)
	Return svalue
End Sub

private Sub getfilesize(item As String) As String
	If BANano.IsNull(item) Or BANano.IsUndefined(item) Then 
		item = "0"
	End If
	item = BANano.parsefloat(item)
	Dim svalue As String = vue.FormatFileSize(item)
	Return svalue
End Sub