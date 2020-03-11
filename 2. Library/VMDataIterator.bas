B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public DataIterator As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the DataIterator
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDataIterator
	ID = sid.tolowercase
	DataIterator.Initialize(v, ID)
	DataIterator.SetTag("v-data-iterator")
	DesignMode = False
	Module = eventHandler
	vue = v
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

Sub SetVIf(vif As Object) As VMDataIterator
	DataIterator.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMDataIterator
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
Sub SetAttr(attr as map) As VMDataIterator
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

'set custom-sort
Sub SetCustomSort(varCustomSort As Object) As VMDataIterator
	Dim pp As String = $"${ID}CustomSort"$
	vue.SetStateSingle(pp, varCustomSort)
	DataIterator.Bind(":custom-sort", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMDataIterator
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	DataIterator.Bind(":dark", pp)
	Return Me
End Sub

'set disable-filtering
Sub SetDisableFiltering(varDisableFiltering As Object) As VMDataIterator
	Dim pp As String = $"${ID}DisableFiltering"$
	vue.SetStateSingle(pp, varDisableFiltering)
	DataIterator.Bind(":disable-filtering", pp)
	Return Me
End Sub

'set disable-pagination
Sub SetDisablePagination(varDisablePagination As Object) As VMDataIterator
	Dim pp As String = $"${ID}DisablePagination"$
	vue.SetStateSingle(pp, varDisablePagination)
	DataIterator.Bind(":disable-pagination", pp)
	Return Me
End Sub

'set disable-sort
Sub SetDisableSort(varDisableSort As Object) As VMDataIterator
	Dim pp As String = $"${ID}DisableSort"$
	vue.SetStateSingle(pp, varDisableSort)
	DataIterator.Bind(":disable-sort", pp)
	Return Me
End Sub

'set expanded
Sub SetExpanded(varExpanded As Object) As VMDataIterator
	Dim pp As String = $"${ID}Expanded"$
	vue.SetStateSingle(pp, varExpanded)
	DataIterator.Bind(":expanded", pp)
	Return Me
End Sub

'set footer-props
Sub SetFooterProps(varFooterProps As Object) As VMDataIterator
	Dim pp As String = $"${ID}FooterProps"$
	vue.SetStateSingle(pp, varFooterProps)
	DataIterator.Bind(":footer-props", pp)
	Return Me
End Sub

'set group-by
Sub SetGroupBy(varGroupBy As Object) As VMDataIterator
	Dim pp As String = $"${ID}GroupBy"$
	vue.SetStateSingle(pp, varGroupBy)
	DataIterator.Bind(":group-by", pp)
	Return Me
End Sub

'set group-desc
Sub SetGroupDesc(varGroupDesc As Object) As VMDataIterator
	Dim pp As String = $"${ID}GroupDesc"$
	vue.SetStateSingle(pp, varGroupDesc)
	DataIterator.Bind(":group-desc", pp)
	Return Me
End Sub

'set hide-default-footer
Sub SetHideDefaultFooter(varHideDefaultFooter As Object) As VMDataIterator
	Dim pp As String = $"${ID}HideDefaultFooter"$
	vue.SetStateSingle(pp, varHideDefaultFooter)
	DataIterator.Bind(":hide-default-footer", pp)
	Return Me
End Sub

'set item-key
Sub SetItemKey(varItemKey As Object) As VMDataIterator
	Dim pp As String = $"${ID}ItemKey"$
	vue.SetStateSingle(pp, varItemKey)
	DataIterator.Bind(":item-key", pp)
	Return Me
End Sub

'set items
Sub SetItems(varItems As Object) As VMDataIterator
	Dim pp As String = $"${ID}Items"$
	vue.SetStateSingle(pp, varItems)
	DataIterator.Bind(":items", pp)
	Return Me
End Sub

'set items-per-page
Sub SetItemsPerPage(varItemsPerPage As Object) As VMDataIterator
	Dim pp As String = $"${ID}ItemsPerPage"$
	vue.SetStateSingle(pp, varItemsPerPage)
	DataIterator.Bind(":items-per-page", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMDataIterator
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	DataIterator.Bind(":light", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMDataIterator
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	DataIterator.Bind(":loading", pp)
	Return Me
End Sub

'set loading-text
Sub SetLoadingText(varLoadingText As Object) As VMDataIterator
	Dim pp As String = $"${ID}LoadingText"$
	vue.SetStateSingle(pp, varLoadingText)
	DataIterator.Bind(":loading-text", pp)
	Return Me
End Sub

'set locale
Sub SetLocale(varLocale As Object) As VMDataIterator
	Dim pp As String = $"${ID}Locale"$
	vue.SetStateSingle(pp, varLocale)
	DataIterator.Bind(":locale", pp)
	Return Me
End Sub

'set mobile-breakpoint
Sub SetMobileBreakpoint(varMobileBreakpoint As Object) As VMDataIterator
	Dim pp As String = $"${ID}MobileBreakpoint"$
	vue.SetStateSingle(pp, varMobileBreakpoint)
	DataIterator.Bind(":mobile-breakpoint", pp)
	Return Me
End Sub

'set multi-sort
Sub SetMultiSort(varMultiSort As Object) As VMDataIterator
	Dim pp As String = $"${ID}MultiSort"$
	vue.SetStateSingle(pp, varMultiSort)
	DataIterator.Bind(":multi-sort", pp)
	Return Me
End Sub

'set must-sort
Sub SetMustSort(varMustSort As Object) As VMDataIterator
	Dim pp As String = $"${ID}MustSort"$
	vue.SetStateSingle(pp, varMustSort)
	DataIterator.Bind(":must-sort", pp)
	Return Me
End Sub

'set no-data-text
Sub SetNoDataText(varNoDataText As Object) As VMDataIterator
	Dim pp As String = $"${ID}NoDataText"$
	vue.SetStateSingle(pp, varNoDataText)
	DataIterator.Bind(":no-data-text", pp)
	Return Me
End Sub

'set no-results-text
Sub SetNoResultsText(varNoResultsText As Object) As VMDataIterator
	Dim pp As String = $"${ID}NoResultsText"$
	vue.SetStateSingle(pp, varNoResultsText)
	DataIterator.Bind(":no-results-text", pp)
	Return Me
End Sub

'set options
Sub SetOptions(varOptions As Object) As VMDataIterator
	Dim pp As String = $"${ID}Options"$
	vue.SetStateSingle(pp, varOptions)
	DataIterator.Bind(":options", pp)
	Return Me
End Sub

'set page
Sub SetPage(varPage As Object) As VMDataIterator
	Dim pp As String = $"${ID}Page"$
	vue.SetStateSingle(pp, varPage)
	DataIterator.Bind(":page", pp)
	Return Me
End Sub

'set search
Sub SetSearch(varSearch As Object) As VMDataIterator
	Dim pp As String = $"${ID}Search"$
	vue.SetStateSingle(pp, varSearch)
	DataIterator.Bind(":search", pp)
	Return Me
End Sub

'set selectable-key
Sub SetSelectableKey(varSelectableKey As Object) As VMDataIterator
	Dim pp As String = $"${ID}SelectableKey"$
	vue.SetStateSingle(pp, varSelectableKey)
	DataIterator.Bind(":selectable-key", pp)
	Return Me
End Sub

'set server-items-length
Sub SetServerItemsLength(varServerItemsLength As Object) As VMDataIterator
	Dim pp As String = $"${ID}ServerItemsLength"$
	vue.SetStateSingle(pp, varServerItemsLength)
	DataIterator.Bind(":server-items-length", pp)
	Return Me
End Sub

'set single-expand
Sub SetSingleExpand(varSingleExpand As Object) As VMDataIterator
	Dim pp As String = $"${ID}SingleExpand"$
	vue.SetStateSingle(pp, varSingleExpand)
	DataIterator.Bind(":single-expand", pp)
	Return Me
End Sub

'set sort-by
Sub SetSortBy(varSortBy As Object) As VMDataIterator
	Dim pp As String = $"${ID}SortBy"$
	vue.SetStateSingle(pp, varSortBy)
	DataIterator.Bind(":sort-by", pp)
	Return Me
End Sub

'set sort-desc
Sub SetSortDesc(varSortDesc As Object) As VMDataIterator
	Dim pp As String = $"${ID}SortDesc"$
	vue.SetStateSingle(pp, varSortDesc)
	DataIterator.Bind(":sort-desc", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMDataIterator
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	DataIterator.Bind(":value", pp)
	Return Me
End Sub

'
Sub SetSlotFooter(b As boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "footer"))
	Return Me
End Sub

'
Sub SetSlotFooterPageText(b As boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "footer.page-text"))
	Return Me
End Sub

'
Sub SetSlotHeader(b As boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "header"))
	Return Me
End Sub

'
Sub SetSlotItem(b As boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "item"))
	Return Me
End Sub

'
Sub SetSlotLoading(b As boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "loading"))
	Return Me
End Sub

'
Sub SetSlotNoData(b As boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "no-data"))
	Return Me
End Sub

'
Sub SetSlotNoResults(b As boolean) As VMDataIterator    'ignore
	SetAttr(CreateMap("slot": "no-results"))
	Return Me
End Sub

'
Sub SetOnCurrentItems(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:current-items": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnItemExpanded(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:item-expanded": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnItemSelected(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:item-selected": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnPageCount(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:page-count": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnPagination(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:pagination": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnToggleSelectAll(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:toggle-select-all": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateExpanded(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:update:expanded": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateGroupBy(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:update:group-by": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateGroupDesc(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:update:group-desc": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateItemsPerPage(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:update:items-per-page": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateMultiSort(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:update:multi-sort": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateOptions(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:update:options": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdatePage(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:update:page": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateSortBy(methodName As String) As VMDataIterator
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:update:sort-by": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateSortDesc(methodName As String) As VMDataIterator
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


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMDataIterator
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	DataIterator.Bind(":color", pp)
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

'set for
Sub SetVFor(item As String, dataSource As String) As VMDataIterator
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMDataIterator
	k = k.tolowercase
	SetAttrSingle(":key", k)
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


Sub SetTextCenter As VMDataIterator
	DataIterator.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMDataIterator
DataIterator.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub