B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ComboBox As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the ComboBox
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMComboBox
	ID = sid.tolowercase
	ComboBox.Initialize(v, ID)
	ComboBox.SetTag("v-combobox")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMComboBox
	ComboBox.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMComboBox
	ComboBox.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMComboBox
	ComboBox.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMComboBox
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMComboBox
	ComboBox.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMComboBox
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	Return ComboBox.ToString
End Sub

Sub SetVModel(k As String) As VMComboBox
	ComboBox.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMComboBox
	ComboBox.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMComboBox
	ComboBox.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMComboBox
	Dim childHTML As String = child.ToString
	ComboBox.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMComboBox
	ComboBox.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMComboBox
	ComboBox.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMComboBox
	ComboBox.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMComboBox
	ComboBox.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set allow-overflow
Sub SetAllowOverflow(varAllowOverflow As Object) As VMComboBox
	Dim pp As String = $"${ID}AllowOverflow"$
	vue.SetStateSingle(pp, varAllowOverflow)
	ComboBox.Bind(":allow-overflow", pp)
	Return Me
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As Object) As VMComboBox
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	ComboBox.Bind(":append-icon", pp)
	Return Me
End Sub

'set append-outer-icon
Sub SetAppendOuterIcon(varAppendOuterIcon As Object) As VMComboBox
	Dim pp As String = $"${ID}AppendOuterIcon"$
	vue.SetStateSingle(pp, varAppendOuterIcon)
	ComboBox.Bind(":append-outer-icon", pp)
	Return Me
End Sub

'set attach
Sub SetAttach(varAttach As Object) As VMComboBox
	Dim pp As String = $"${ID}Attach"$
	vue.SetStateSingle(pp, varAttach)
	ComboBox.Bind(":attach", pp)
	Return Me
End Sub

'set auto-select-first
Sub SetAutoSelectFirst(varAutoSelectFirst As Object) As VMComboBox
	Dim pp As String = $"${ID}AutoSelectFirst"$
	vue.SetStateSingle(pp, varAutoSelectFirst)
	ComboBox.Bind(":auto-select-first", pp)
	Return Me
End Sub

'set autofocus
Sub SetAutofocus(varAutofocus As Object) As VMComboBox
	Dim pp As String = $"${ID}Autofocus"$
	vue.SetStateSingle(pp, varAutofocus)
	ComboBox.Bind(":autofocus", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMComboBox
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	ComboBox.Bind(":background-color", pp)
	Return Me
End Sub

'set cache-items
Sub SetCacheItems(varCacheItems As Object) As VMComboBox
	Dim pp As String = $"${ID}CacheItems"$
	vue.SetStateSingle(pp, varCacheItems)
	ComboBox.Bind(":cache-items", pp)
	Return Me
End Sub

'set chips
Sub SetChips(varChips As Object) As VMComboBox
	Dim pp As String = $"${ID}Chips"$
	vue.SetStateSingle(pp, varChips)
	ComboBox.Bind(":chips", pp)
	Return Me
End Sub

'set clear-icon
Sub SetClearIcon(varClearIcon As Object) As VMComboBox
	Dim pp As String = $"${ID}ClearIcon"$
	vue.SetStateSingle(pp, varClearIcon)
	ComboBox.Bind(":clear-icon", pp)
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Object) As VMComboBox
	Dim pp As String = $"${ID}Clearable"$
	vue.SetStateSingle(pp, varClearable)
	ComboBox.Bind(":clearable", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMComboBox
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ComboBox.Bind(":color", pp)
	Return Me
End Sub

'set counter
Sub SetCounter(varCounter As Object) As VMComboBox
	Dim pp As String = $"${ID}Counter"$
	vue.SetStateSingle(pp, varCounter)
	ComboBox.Bind(":counter", pp)
	Return Me
End Sub

'set counter-value
Sub SetCounterValue(varCounterValue As Object) As VMComboBox
	Dim pp As String = $"${ID}CounterValue"$
	vue.SetStateSingle(pp, varCounterValue)
	ComboBox.Bind(":counter-value", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMComboBox
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ComboBox.Bind(":dark", pp)
	Return Me
End Sub

'set deletable-chips
Sub SetDeletableChips(varDeletableChips As Object) As VMComboBox
	Dim pp As String = $"${ID}DeletableChips"$
	vue.SetStateSingle(pp, varDeletableChips)
	ComboBox.Bind(":deletable-chips", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMComboBox
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	ComboBox.Bind(":dense", pp)
	Return Me
End Sub

'set disable-lookup
Sub SetDisableLookup(varDisableLookup As Object) As VMComboBox
	Dim pp As String = $"${ID}DisableLookup"$
	vue.SetStateSingle(pp, varDisableLookup)
	ComboBox.Bind(":disable-lookup", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As boolean) As VMComboBox
	ComboBox.SetDisabled(varDisabled)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Object) As VMComboBox
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	ComboBox.Bind(":eager", pp)
	Return Me
End Sub

'set error
Sub SetError(varError As Object) As VMComboBox
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	ComboBox.Bind(":error", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMComboBox
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	ComboBox.Bind(":error-count", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMComboBox
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	ComboBox.Bind(":error-messages", pp)
	Return Me
End Sub

'set filled
Sub SetFilled(varFilled As Object) As VMComboBox
	Dim pp As String = $"${ID}Filled"$
	vue.SetStateSingle(pp, varFilled)
	ComboBox.Bind(":filled", pp)
	Return Me
End Sub

'set filter
Sub SetFilter(varFilter As Object) As VMComboBox
	Dim pp As String = $"${ID}Filter"$
	vue.SetStateSingle(pp, varFilter)
	ComboBox.Bind(":filter", pp)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Object) As VMComboBox
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	ComboBox.Bind(":flat", pp)
	Return Me
End Sub

'set full-width
Sub SetFullWidth(varFullWidth As Object) As VMComboBox
	Dim pp As String = $"${ID}FullWidth"$
	vue.SetStateSingle(pp, varFullWidth)
	ComboBox.Bind(":full-width", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMComboBox
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	ComboBox.Bind(":height", pp)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Object) As VMComboBox
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	ComboBox.Bind(":hide-details", pp)
	Return Me
End Sub

'set hide-no-data
Sub SetHideNoData(varHideNoData As Object) As VMComboBox
	Dim pp As String = $"${ID}HideNoData"$
	vue.SetStateSingle(pp, varHideNoData)
	ComboBox.Bind(":hide-no-data", pp)
	Return Me
End Sub

'set hide-selected
Sub SetHideSelected(varHideSelected As Object) As VMComboBox
	Dim pp As String = $"${ID}HideSelected"$
	vue.SetStateSingle(pp, varHideSelected)
	ComboBox.Bind(":hide-selected", pp)
	Return Me
End Sub

'set hint
Sub SetHint(varHint As Object) As VMComboBox
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	ComboBox.Bind(":hint", pp)
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMComboBox
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	ComboBox.Bind(":id", pp)
	Return Me
End Sub

'set item-color
Sub SetItemColor(varItemColor As Object) As VMComboBox
	Dim pp As String = $"${ID}ItemColor"$
	vue.SetStateSingle(pp, varItemColor)
	ComboBox.Bind(":item-color", pp)
	Return Me
End Sub

'set item-disabled
Sub SetItemDisabled(varItemDisabled As Object) As VMComboBox
	Dim pp As String = $"${ID}ItemDisabled"$
	vue.SetStateSingle(pp, varItemDisabled)
	ComboBox.Bind(":item-disabled", pp)
	Return Me
End Sub

'set item-text
Sub SetItemText(varItemText As Object) As VMComboBox
	Dim pp As String = $"${ID}ItemText"$
	vue.SetStateSingle(pp, varItemText)
	ComboBox.Bind(":item-text", pp)
	Return Me
End Sub

'set item-value
Sub SetItemValue(varItemValue As Object) As VMComboBox
	Dim pp As String = $"${ID}ItemValue"$
	vue.SetStateSingle(pp, varItemValue)
	ComboBox.Bind(":item-value", pp)
	Return Me
End Sub

'set items
Sub SetItems(varItems As String) As VMComboBox
	varItems = varItems.tolowercase
	ComboBox.SetattrSingle(":items", varItems)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMComboBox
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	ComboBox.Bind(":label", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMComboBox
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ComboBox.Bind(":light", pp)
	Return Me
End Sub

'set loader-height
Sub SetLoaderHeight(varLoaderHeight As Object) As VMComboBox
	Dim pp As String = $"${ID}LoaderHeight"$
	vue.SetStateSingle(pp, varLoaderHeight)
	ComboBox.Bind(":loader-height", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMComboBox
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	ComboBox.Bind(":loading", pp)
	Return Me
End Sub

'set menu-props
Sub SetMenuProps(varMenuProps As Object) As VMComboBox
	Dim pp As String = $"${ID}MenuProps"$
	vue.SetStateSingle(pp, varMenuProps)
	ComboBox.Bind(":menu-props", pp)
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMComboBox
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	ComboBox.Bind(":messages", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Object) As VMComboBox
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	ComboBox.Bind(":multiple", pp)
	Return Me
End Sub

'set no-data-text
Sub SetNoDataText(varNoDataText As Object) As VMComboBox
	Dim pp As String = $"${ID}NoDataText"$
	vue.SetStateSingle(pp, varNoDataText)
	ComboBox.Bind(":no-data-text", pp)
	Return Me
End Sub

'set no-filter
Sub SetNoFilter(varNoFilter As Object) As VMComboBox
	Dim pp As String = $"${ID}NoFilter"$
	vue.SetStateSingle(pp, varNoFilter)
	ComboBox.Bind(":no-filter", pp)
	Return Me
End Sub

'set open-on-clear
Sub SetOpenOnClear(varOpenOnClear As Object) As VMComboBox
	Dim pp As String = $"${ID}OpenOnClear"$
	vue.SetStateSingle(pp, varOpenOnClear)
	ComboBox.Bind(":open-on-clear", pp)
	Return Me
End Sub

'set outlined
Sub SetOutlined(varOutlined As Object) As VMComboBox
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	ComboBox.Bind(":outlined", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Object) As VMComboBox
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	ComboBox.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set placeholder
Sub SetPlaceholder(varPlaceholder As Object) As VMComboBox
	Dim pp As String = $"${ID}Placeholder"$
	vue.SetStateSingle(pp, varPlaceholder)
	ComboBox.Bind(":placeholder", pp)
	Return Me
End Sub

'set prefix
Sub SetPrefix(varPrefix As Object) As VMComboBox
	Dim pp As String = $"${ID}Prefix"$
	vue.SetStateSingle(pp, varPrefix)
	ComboBox.Bind(":prefix", pp)
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As Object) As VMComboBox
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	ComboBox.Bind(":prepend-icon", pp)
	Return Me
End Sub

'set prepend-inner-icon
Sub SetPrependInnerIcon(varPrependInnerIcon As Object) As VMComboBox
	Dim pp As String = $"${ID}PrependInnerIcon"$
	vue.SetStateSingle(pp, varPrependInnerIcon)
	ComboBox.Bind(":prepend-inner-icon", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMComboBox
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	ComboBox.Bind(":readonly", pp)
	Return Me
End Sub

'set return-object
Sub SetReturnObject(varReturnObject As Object) As VMComboBox
	Dim pp As String = $"${ID}ReturnObject"$
	vue.SetStateSingle(pp, varReturnObject)
	ComboBox.Bind(":return-object", pp)
	Return Me
End Sub

'set reverse
Sub SetReverse(varReverse As Object) As VMComboBox
	Dim pp As String = $"${ID}Reverse"$
	vue.SetStateSingle(pp, varReverse)
	ComboBox.Bind(":reverse", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Object) As VMComboBox
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	ComboBox.Bind(":rounded", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMComboBox
	Dim pp As String = $"${ID}Rules"$
	vue.SetStateSingle(pp, varRules)
	ComboBox.Bind(":rules", pp)
	Return Me
End Sub

'set search-input
Sub SetSearchInput(varSearchInput As Object) As VMComboBox
	Dim pp As String = $"${ID}SearchInput"$
	vue.SetStateSingle(pp, varSearchInput)
	ComboBox.Bind(":search-input", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Object) As VMComboBox
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	ComboBox.Bind(":shaped", pp)
	Return Me
End Sub

'set single-line
Sub SetSingleLine(varSingleLine As Object) As VMComboBox
	Dim pp As String = $"${ID}SingleLine"$
	vue.SetStateSingle(pp, varSingleLine)
	ComboBox.Bind(":single-line", pp)
	Return Me
End Sub

'set small-chips
Sub SetSmallChips(varSmallChips As Object) As VMComboBox
	Dim pp As String = $"${ID}SmallChips"$
	vue.SetStateSingle(pp, varSmallChips)
	ComboBox.Bind(":small-chips", pp)
	Return Me
End Sub

'set solo
Sub SetSolo(varSolo As Object) As VMComboBox
	Dim pp As String = $"${ID}Solo"$
	vue.SetStateSingle(pp, varSolo)
	ComboBox.Bind(":solo", pp)
	Return Me
End Sub

'set solo-inverted
Sub SetSoloInverted(varSoloInverted As Object) As VMComboBox
	Dim pp As String = $"${ID}SoloInverted"$
	vue.SetStateSingle(pp, varSoloInverted)
	ComboBox.Bind(":solo-inverted", pp)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Object) As VMComboBox
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	ComboBox.Bind(":success", pp)
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMComboBox
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	ComboBox.Bind(":success-messages", pp)
	Return Me
End Sub

'set suffix
Sub SetSuffix(varSuffix As Object) As VMComboBox
	Dim pp As String = $"${ID}Suffix"$
	vue.SetStateSingle(pp, varSuffix)
	ComboBox.Bind(":suffix", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As Object) As VMComboBox
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	ComboBox.Bind(":type", pp)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Object) As VMComboBox
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	ComboBox.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMComboBox
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	ComboBox.Bind(":value", pp)
	Return Me
End Sub

'set value-comparator
Sub SetValueComparator(varValueComparator As Object) As VMComboBox
	Dim pp As String = $"${ID}ValueComparator"$
	vue.SetStateSingle(pp, varValueComparator)
	ComboBox.Bind(":value-comparator", pp)
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMComboBox    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotAppendItem(b As Boolean) As VMComboBox    'ignore
	SetAttr(CreateMap("slot": "append-item"))
	Return Me
End Sub

'
Sub SetSlotAppendOuter(b As Boolean) As VMComboBox    'ignore
	SetAttr(CreateMap("slot": "append-outer"))
	Return Me
End Sub

'
Sub SetSlotItem(b As Boolean) As VMComboBox    'ignore
	SetAttr(CreateMap("slot": "item"))
	Return Me
End Sub

'
Sub SetSlotLabel(b As Boolean) As VMComboBox    'ignore
	SetAttr(CreateMap("slot": "label"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As Boolean) As VMComboBox    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotNoData(b As boolean) As VMComboBox    'ignore
	SetAttr(CreateMap("slot": "no-data"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As boolean) As VMComboBox    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetSlotPrependInner(b As boolean) As VMComboBox    'ignore
	SetAttr(CreateMap("slot": "prepend-inner"))
	Return Me
End Sub

'
Sub SetSlotPrependItem(b As boolean) As VMComboBox    'ignore
	SetAttr(CreateMap("slot": "prepend-item"))
	Return Me
End Sub

'
Sub SetSlotProgress(b As boolean) As VMComboBox    'ignore
	SetAttr(CreateMap("slot": "progress"))
	Return Me
End Sub

'
Sub SetSlotSelection(b As Boolean) As VMComboBox    'ignore
	SetAttr(CreateMap("slot": "selection"))
	Return Me
End Sub

'
Sub SetOnBlur(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:blur": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnChange(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppend(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:append": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppendOuter(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:append-outer": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickClear(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:clear": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrepend(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:prepend": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrependInner(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:prepend-inner": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnFocus(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:focus": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMComboBox
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
Sub SetOnKeydown(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:keydown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMousedown(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:mousedown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseup(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:mouseup": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateError(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateListIndex(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:update:list-index": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateSearchInput(methodName As String) As VMComboBox
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:update:search-input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMComboBox
	vue.SetStateSingle($"${ID}show"$, False)
	Return Me
End Sub

Sub Show As VMComboBox
	vue.SetStateSingle($"${ID}show"$, True)
	Return Me
End Sub

Sub Enable As VMComboBox
	vue.SetStateSingle($"${ID}disabled"$, False)
	Return Me
End Sub

Sub Disable As VMComboBox
	vue.SetStateSingle($"${ID}disabled"$, True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMComboBox
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMComboBox
	ComboBox.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMComboBox
	ComboBox.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMComboBox
	ComboBox.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMComboBox
	ComboBox.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMComboBox
	ComboBox.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMComboBox
	ComboBox.SetName(varName, bbind)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMComboBox
	ComboBox.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMComboBox
	ComboBox.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub
