B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public DataIterator As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the DataIterator
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDataIterator
	ID = sid.tolowercase
	DataIterator.Initialize(v, ID)
	DataIterator.SetTag("v-data-iterator")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub

Sub SetData(prop As String, value As Object) As VMDataIterator
	vue.SetData(prop, value)
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMDataIterator
	bStatic = b
	DataIterator.SetStatic(b)
	Return Me
End Sub

'get component
Sub ToString As String
	Return DataIterator.ToString
End Sub

Sub SetVModel(k As String) As VMDataIterator
	DataIterator.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMDataIterator
	DataIterator.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMDataIterator
	DataIterator.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMDataIterator
	Dim childHTML As String = child.ToString
	DataIterator.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMDataIterator
	DataIterator.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMDataIterator
	DataIterator.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDataIterator
	DataIterator.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMDataIterator
	DataIterator.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set custom-sort
Sub SetCustomSort(varCustomFilter As Object) As VMDataIterator
	Dim pp As String = $"${ID}CustomSort"$
	vue.SetStateSingle(pp, varCustomFilter)
	DataIterator.Bind(":custom-sort", pp)
	Return Me
End Sub

'set custom-filter
Sub SetCustomFilter(varCustomFilter As Object) As VMDataIterator
	Dim pp As String = $"${ID}CustomFilter"$
	vue.SetStateSingle(pp, varCustomFilter)
	DataIterator.Bind(":custom-filter", pp)
	Return Me
End Sub

'set custom-group
Sub SetCustomGroup(varCustomGroup As Object) As VMDataIterator
	Dim pp As String = $"${ID}CustomGroup"$
	vue.SetStateSingle(pp, varCustomGroup)
	DataIterator.Bind(":custom-group", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMDataIterator
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	DataIterator.Bind(":dark", pp)
	Return Me
End Sub

'set disable-filtering
Sub SetDisableFiltering(varDisableFiltering As Boolean) As VMDataIterator
	If varDisableFiltering = False Then Return Me
	If bStatic Then
		SetAttrSingle("disable-filtering", varDisableFiltering)
		Return Me
	End If
	Dim pp As String = $"${ID}DisableFiltering"$
	vue.SetStateSingle(pp, varDisableFiltering)
	DataIterator.Bind(":disable-filtering", pp)
	Return Me
End Sub

'set disable-pagination
Sub SetDisablePagination(varDisablePagination As Boolean) As VMDataIterator
	If varDisablePagination = False Then Return Me
	If bStatic Then
		SetAttrSingle("disable-pagination", varDisablePagination)
		Return Me
	End If
	Dim pp As String = $"${ID}DisablePagination"$
	vue.SetStateSingle(pp, varDisablePagination)
	DataIterator.Bind(":disable-pagination", pp)
	Return Me
End Sub

'set disable-sort
Sub SetDisableSort(varDisableSort As Boolean) As VMDataIterator
	If varDisableSort = False Then Return Me
	If bStatic Then
		SetAttrSingle("disable-sort", varDisableSort)
		Return Me
	End If
	Dim pp As String = $"${ID}DisableSort"$
	vue.SetStateSingle(pp, varDisableSort)
	DataIterator.Bind(":disable-sort", pp)
	Return Me
End Sub

'set hide-default-footer
Sub SetHideDefaultFooter(varHideDefaultFooter As Boolean) As VMDataIterator
	If varHideDefaultFooter = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-default-footer", varHideDefaultFooter)
		Return Me
	End If
	Dim pp As String = $"${ID}HideDefaultFooter"$
	vue.SetStateSingle(pp, varHideDefaultFooter)
	DataIterator.Bind(":hide-default-footer", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMDataIterator
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	DataIterator.Bind(":light", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Boolean) As VMDataIterator
	If varLoading = False Then Return Me
	If bStatic Then
		SetAttrSingle("loading", varLoading)
		Return Me
	End If
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	DataIterator.Bind(":loading", pp)
	Return Me
End Sub

'set multi-sort
Sub SetMultiSort(varMultiSort As Boolean) As VMDataIterator
	If varMultiSort = False Then Return Me
	If bStatic Then
		SetAttrSingle("multi-sort", varMultiSort)
		Return Me
	End If
	Dim pp As String = $"${ID}MultiSort"$
	vue.SetStateSingle(pp, varMultiSort)
	DataIterator.Bind(":multi-sort", pp)
	Return Me
End Sub

'set must-sort
Sub SetMustSort(varMustSort As Boolean) As VMDataIterator
	If varMustSort = False Then Return Me
	If bStatic Then
		SetAttrSingle("must-sort", varMustSort)
		Return Me
	End If
	Dim pp As String = $"${ID}MustSort"$
	vue.SetStateSingle(pp, varMustSort)
	DataIterator.Bind(":must-sort", pp)
	Return Me
End Sub

'set single-expand
Sub SetSingleExpand(varSingleExpand As Boolean) As VMDataIterator
	If varSingleExpand = False Then Return Me
	If bStatic Then
		SetAttrSingle("single-expand", varSingleExpand)
		Return Me
	End If
	Dim pp As String = $"${ID}SingleExpand"$
	vue.SetStateSingle(pp, varSingleExpand)
	DataIterator.Bind(":single-expand", pp)
	Return Me
End Sub

'set single-select
Sub SetSingleSelect(varSingleSelect As Boolean) As VMDataIterator
	If varSingleSelect = False Then Return Me
	If bStatic Then
		SetAttrSingle("single-select", varSingleSelect)
		Return Me
	End If
	Dim pp As String = $"${ID}SingleSelect"$
	vue.SetStateSingle(pp, varSingleSelect)
	DataIterator.Bind(":single-select", pp)
	Return Me
End Sub

'set expanded
Sub SetExpanded(varExpanded As String) As VMDataIterator
	If varExpanded = "" Then Return Me
	If bStatic Then
		SetAttrSingle("expanded", varExpanded)
		Return Me
	End If
	Dim pp As String = $"${ID}Expanded"$
	vue.SetStateSingle(pp, varExpanded)
	DataIterator.Bind(":expanded", pp)
	Return Me
End Sub

'set footer-props
Sub SetFooterProps(varFooterProps As String) As VMDataIterator
	If varFooterProps = "" Then Return Me
	If bStatic Then
		SetAttrSingle("footer-props", varFooterProps)
		Return Me
	End If
	Dim pp As String = $"${ID}FooterProps"$
	vue.SetStateSingle(pp, varFooterProps)
	DataIterator.Bind(":footer-props", pp)
	Return Me
End Sub

'set group-by
Sub SetGroupBy(varGroupBy As String) As VMDataIterator
	If varGroupBy = "" Then Return Me
	If bStatic Then
		SetAttrSingle("group-by", varGroupBy)
		Return Me
	End If
	Dim pp As String = $"${ID}GroupBy"$
	vue.SetStateSingle(pp, varGroupBy)
	DataIterator.Bind(":group-by", pp)
	Return Me
End Sub

'set group-desc
Sub SetGroupDesc(varGroupDesc As String) As VMDataIterator
	If varGroupDesc = "" Then Return Me
	If bStatic Then
		SetAttrSingle("group-desc", varGroupDesc)
		Return Me
	End If
	Dim pp As String = $"${ID}GroupDesc"$
	vue.SetStateSingle(pp, varGroupDesc)
	DataIterator.Bind(":group-desc", pp)
	Return Me
End Sub

'set item-key
Sub SetItemKey(varItemKey As String) As VMDataIterator
	If varItemKey = "" Then Return Me
	If bStatic Then
		SetAttrSingle("item-key", varItemKey)
		Return Me
	End If
	Dim pp As String = $"${ID}ItemKey"$
	vue.SetStateSingle(pp, varItemKey)
	DataIterator.Bind(":item-key", pp)
	Return Me
End Sub

'set items
Sub SetItems(varItems As String) As VMDataIterator
	If varItems = "" Then Return Me
	If bStatic Then
		SetAttrSingle("items", varItems)
		Return Me
	End If
	Dim pp As String = $"${ID}Items"$
	vue.SetStateSingle(pp, varItems)
	DataIterator.Bind(":items", pp)
	Return Me
End Sub

'set items-per-page
Sub SetItemsPerPage(varItemsPerPage As String) As VMDataIterator
	If varItemsPerPage = "" Then Return Me
	If bStatic Then
		SetAttrSingle("items-per-page", varItemsPerPage)
		Return Me
	End If
	Dim pp As String = $"${ID}ItemsPerPage"$
	vue.SetStateSingle(pp, varItemsPerPage)
	DataIterator.Bind(":items-per-page", pp)
	Return Me
End Sub

'set loading-text
Sub SetLoadingText(varLoadingText As String) As VMDataIterator
	If varLoadingText = "" Then Return Me
	If bStatic Then
		SetAttrSingle("loading-text", varLoadingText)
		Return Me
	End If
	Dim pp As String = $"${ID}LoadingText"$
	vue.SetStateSingle(pp, varLoadingText)
	DataIterator.Bind(":loading-text", pp)
	Return Me
End Sub

'set locale
Sub SetLocale(varLocale As String) As VMDataIterator
	If varLocale = "" Then Return Me
	If bStatic Then
		SetAttrSingle("locale", varLocale)
		Return Me
	End If
	Dim pp As String = $"${ID}Locale"$
	vue.SetStateSingle(pp, varLocale)
	DataIterator.Bind(":locale", pp)
	Return Me
End Sub

'set mobile-breakpoint
Sub SetMobileBreakpoint(varMobileBreakpoint As String) As VMDataIterator
	If varMobileBreakpoint = "" Then Return Me
	If bStatic Then
		SetAttrSingle("mobile-breakpoint", varMobileBreakpoint)
		Return Me
	End If
	Dim pp As String = $"${ID}MobileBreakpoint"$
	vue.SetStateSingle(pp, varMobileBreakpoint)
	DataIterator.Bind(":mobile-breakpoint", pp)
	Return Me
End Sub

'set no-data-text
Sub SetNoDataText(varNoDataText As String) As VMDataIterator
	If varNoDataText = "" Then Return Me
	If bStatic Then
		SetAttrSingle("no-data-text", varNoDataText)
		Return Me
	End If
	Dim pp As String = $"${ID}NoDataText"$
	vue.SetStateSingle(pp, varNoDataText)
	DataIterator.Bind(":no-data-text", pp)
	Return Me
End Sub

'set no-results-text
Sub SetNoResultsText(varNoResultsText As String) As VMDataIterator
	If varNoResultsText = "" Then Return Me
	If bStatic Then
		SetAttrSingle("no-results-text", varNoResultsText)
		Return Me
	End If
	Dim pp As String = $"${ID}NoResultsText"$
	vue.SetStateSingle(pp, varNoResultsText)
	DataIterator.Bind(":no-results-text", pp)
	Return Me
End Sub

'set options
Sub SetOptions(varOptions As String) As VMDataIterator
	If varOptions = "" Then Return Me
	If bStatic Then
		SetAttrSingle("options", varOptions)
		Return Me
	End If
	Dim pp As String = $"${ID}Options"$
	vue.SetStateSingle(pp, varOptions)
	DataIterator.Bind(":options", pp)
	Return Me
End Sub

'set page
Sub SetPage(varPage As String) As VMDataIterator
	If varPage = "" Then Return Me
	If bStatic Then
		SetAttrSingle("page", varPage)
		Return Me
	End If
	Dim pp As String = $"${ID}Page"$
	vue.SetStateSingle(pp, varPage)
	DataIterator.Bind(":page", pp)
	Return Me
End Sub

'set search
Sub SetSearch(varSearch As String) As VMDataIterator
	If varSearch = "" Then Return Me
	If bStatic Then
		SetAttrSingle("search", varSearch)
		Return Me
	End If
	Dim pp As String = $"${ID}Search"$
	vue.SetStateSingle(pp, varSearch)
	DataIterator.Bind(":search", pp)
	Return Me
End Sub

'set selectable-key
Sub SetSelectableKey(varSelectableKey As String) As VMDataIterator
	If varSelectableKey = "" Then Return Me
	If bStatic Then
		SetAttrSingle("selectable-key", varSelectableKey)
		Return Me
	End If
	Dim pp As String = $"${ID}SelectableKey"$
	vue.SetStateSingle(pp, varSelectableKey)
	DataIterator.Bind(":selectable-key", pp)
	Return Me
End Sub

'set server-items-length
Sub SetServerItemsLength(varServerItemsLength As String) As VMDataIterator
	If varServerItemsLength = "" Then Return Me
	If bStatic Then
		SetAttrSingle("server-items-length", varServerItemsLength)
		Return Me
	End If
	Dim pp As String = $"${ID}ServerItemsLength"$
	vue.SetStateSingle(pp, varServerItemsLength)
	DataIterator.Bind(":server-items-length", pp)
	Return Me
End Sub

'set sort-by
Sub SetSortBy(varSortBy As String) As VMDataIterator
	If varSortBy = "" Then Return Me
	If bStatic Then
		SetAttrSingle("sort-by", varSortBy)
		Return Me
	End If
	Dim pp As String = $"${ID}SortBy"$
	vue.SetStateSingle(pp, varSortBy)
	DataIterator.Bind(":sort-by", pp)
	Return Me
End Sub

'set sort-desc
Sub SetSortDesc(varSortDesc As String) As VMDataIterator
	If varSortDesc = "" Then Return Me
	If bStatic Then
		SetAttrSingle("sort-desc", varSortDesc)
		Return Me
	End If
	Dim pp As String = $"${ID}SortDesc"$
	vue.SetStateSingle(pp, varSortDesc)
	DataIterator.Bind(":sort-desc", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMDataIterator
	DataIterator.SetValue(varValue, False)
	Return Me
End Sub

'
Sub SetSlotFooter(b As Boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "footer"))
	Return Me
End Sub

'
Sub SetSlotFooterPageText(b As Boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "footer.page-text"))
	Return Me
End Sub

'
Sub SetSlotHeader(b As Boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "header"))
	Return Me
End Sub

'
Sub SetSlotItem(b As Boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "item"))
	Return Me
End Sub

'
Sub SetSlotLoading(b As Boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "loading"))
	Return Me
End Sub

'
Sub SetSlotNoData(b As Boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "no-data"))
	Return Me
End Sub

'
Sub SetSlotNoResults(b As Boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "no-results"))
	Return Me
End Sub

'
Sub SetOnCurrentItems(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@current-items": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnItemExpanded(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@item-expanded": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnItemSelected(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@item-selected": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnPageCount(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@page-count": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnPagination(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@pagination": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnToggleSelectAll(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@toggle-select-all": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateExpanded(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:expanded": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateGroupBy(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:group-by": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateGroupDesc(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:group-desc": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateItemsPerPage(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:items-per-page": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateMultiSort(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:multi-sort": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateOptions(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:options": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdatePage(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:page": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateSortBy(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:sort-by": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateSortDesc(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:sort-desc": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'hide the component
Sub Hide As VMDataIterator
	DataIterator.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMDataIterator
	DataIterator.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMDataIterator
	DataIterator.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMDataIterator
	DataIterator.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMDataIterator
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMDataIterator
	DataIterator.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMDataIterator
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'remove an attribute
public Sub RemoveAttr(sName As String) As VMDataIterator
	DataIterator.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMDataIterator
	DataIterator.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMDataIterator
	DataIterator.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMDataIterator
	DataIterator.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMDataIterator
	DataIterator.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMDataIterator
	DataIterator.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMDataIterator
	DataIterator.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMDataIterator
	DataIterator.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMDataIterator
	DataIterator.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMDataIterator
	DataIterator.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMDataIterator
	DataIterator.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMDataIterator
	DataIterator.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMDataIterator
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMDataIterator
	DataIterator.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMDataIterator
	DataIterator.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMDataIterator
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMDataIterator
	DataIterator.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMDataIterator
	DataIterator.SetText(comp)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMDataIterator
DataIterator.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMDataIterator
DataIterator.SetVisible(b)
Return Me
End Sub
