B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public AutoComplete As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private ErrorText As String
End Sub

'initialize the AutoComplete
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMAutoComplete
	ID = sid.tolowercase
	AutoComplete.Initialize(v, ID)
	AutoComplete.SetTag("v-autocomplete")
	DesignMode = False
	Module = eventHandler
	vue = v
	ErrorText = ""
	Return Me
End Sub

'use an existing state
Sub SetDataSource(sourceName As String, sourceField As String, displayField As String, returnObject As Boolean) As VMAutoComplete
	sourceName = sourceName.tolowercase
	sourceField = sourceField.ToLowerCase
	displayField = displayField.ToLowerCase
	AutoComplete.Bind(":items", sourceName)
	If vue.StateExists(sourceName) = False Then
		vue.SetData(sourceName, Array())
	End If
	SetItemText(displayField)
	SetItemValue(sourceField)
	SetReturnObject(returnObject)
	Return Me
End Sub

Sub SetOptions(sourceName As String, options As Map, sourcefield As String, displayfield As String, returnObject As Boolean) As VMAutoComplete
	sourceName = sourceName.tolowercase
	sourcefield = sourcefield.ToLowerCase
	displayfield = displayfield.ToLowerCase
	Dim recs As List
	recs.Initialize
	For Each k As String In options.Keys
		Dim v As String = options.Get(k)
		Dim nrec As Map = CreateMap()
		nrec.Put(sourcefield, k)
		nrec.Put(displayfield, v)
		recs.Add(nrec)
	Next
	'save the options
	vue.SetStateSingle(sourceName, recs)
	SetItems(sourceName)
	SetItemText(displayfield)
	SetItemValue(sourcefield)
	SetReturnObject(returnObject)
	Return Me
End Sub

'backward compatibility
Sub SetInvalidMessage(ErrText As String) As VMAutoComplete
	ErrorText = ErrText
	Return Me
End Sub

Sub SetErrorText(error As String) As VMAutoComplete
	ErrorText = error
	Return Me
End Sub

Sub SetString As VMAutoComplete
	AutoComplete.fieldType = "string"
	Return Me
End Sub


Sub SetInt As VMAutoComplete
	AutoComplete.fieldType = "int"
	Return Me
End Sub

'set required
Sub SetRequired(varRequired As Boolean) As VMAutoComplete
	AutoComplete.SetRequired(varRequired)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMAutoComplete
	AutoComplete.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMAutoComplete
	AutoComplete.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMAutoComplete
	AutoComplete.SetDeviceSizes(SS, SM, SL, SX)
	Return Me	
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMAutoComplete
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMAutoComplete
	AutoComplete.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMAutoComplete
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	Return AutoComplete.ToString
End Sub

Sub SetVModel(k As String) As VMAutoComplete
	AutoComplete.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMAutoComplete
	AutoComplete.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMAutoComplete
	AutoComplete.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMAutoComplete
	Dim childHTML As String = child.ToString
	AutoComplete.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMAutoComplete
	AutoComplete.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMAutoComplete
	AutoComplete.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMAutoComplete
	AutoComplete.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMAutoComplete
	AutoComplete.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set allow-overflow
Sub SetAllowOverflow(varAllowOverflow As Object) As VMAutoComplete
	Dim pp As String = $"${ID}AllowOverflow"$
	vue.SetStateSingle(pp, varAllowOverflow)
	AutoComplete.Bind(":allow-overflow", pp)
	Return Me
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As Object) As VMAutoComplete
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	AutoComplete.Bind(":append-icon", pp)
	Return Me
End Sub

'set append-outer-icon
Sub SetAppendOuterIcon(varAppendOuterIcon As Object) As VMAutoComplete
	Dim pp As String = $"${ID}AppendOuterIcon"$
	vue.SetStateSingle(pp, varAppendOuterIcon)
	AutoComplete.Bind(":append-outer-icon", pp)
	Return Me
End Sub

'set attach
Sub SetAttach(varAttach As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Attach"$
	vue.SetStateSingle(pp, varAttach)
	AutoComplete.Bind(":attach", pp)
	Return Me
End Sub

'set auto-select-first
Sub SetAutoSelectFirst(varAutoSelectFirst As Object) As VMAutoComplete
	Dim pp As String = $"${ID}AutoSelectFirst"$
	vue.SetStateSingle(pp, varAutoSelectFirst)
	AutoComplete.Bind(":auto-select-first", pp)
	Return Me
End Sub

'set autofocus
Sub SetAutofocus(varAutofocus As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Autofocus"$
	vue.SetStateSingle(pp, varAutofocus)
	AutoComplete.Bind(":autofocus", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMAutoComplete
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	AutoComplete.Bind(":background-color", pp)
	Return Me
End Sub

'set cache-items
Sub SetCacheItems(varCacheItems As Object) As VMAutoComplete
	Dim pp As String = $"${ID}CacheItems"$
	vue.SetStateSingle(pp, varCacheItems)
	AutoComplete.Bind(":cache-items", pp)
	Return Me
End Sub

'set chips
Sub SetChips(varChips As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Chips"$
	vue.SetStateSingle(pp, varChips)
	AutoComplete.Bind(":chips", pp)
	Return Me
End Sub

'set clear-icon
Sub SetClearIcon(varClearIcon As Object) As VMAutoComplete
	Dim pp As String = $"${ID}ClearIcon"$
	vue.SetStateSingle(pp, varClearIcon)
	AutoComplete.Bind(":clear-icon", pp)
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Clearable"$
	vue.SetStateSingle(pp, varClearable)
	AutoComplete.Bind(":clearable", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	AutoComplete.Bind(":color", pp)
	Return Me
End Sub

'set counter
Sub SetCounter(varCounter As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Counter"$
	vue.SetStateSingle(pp, varCounter)
	AutoComplete.Bind(":counter", pp)
	Return Me
End Sub

'set counter-value
Sub SetCounterValue(varCounterValue As Object) As VMAutoComplete
	Dim pp As String = $"${ID}CounterValue"$
	vue.SetStateSingle(pp, varCounterValue)
	AutoComplete.Bind(":counter-value", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	AutoComplete.Bind(":dark", pp)
	Return Me
End Sub

'set deletable-chips
Sub SetDeletableChips(varDeletableChips As Object) As VMAutoComplete
	Dim pp As String = $"${ID}DeletableChips"$
	vue.SetStateSingle(pp, varDeletableChips)
	AutoComplete.Bind(":deletable-chips", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	AutoComplete.Bind(":dense", pp)
	Return Me
End Sub

'set disable-lookup
Sub SetDisableLookup(varDisableLookup As Object) As VMAutoComplete
	Dim pp As String = $"${ID}DisableLookup"$
	vue.SetStateSingle(pp, varDisableLookup)
	AutoComplete.Bind(":disable-lookup", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMAutoComplete
	AutoComplete.SetDisabled(varDisabled)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	AutoComplete.Bind(":eager", pp)
	Return Me
End Sub

'set error
Sub SetError(varError As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	AutoComplete.Bind(":error", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMAutoComplete
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	AutoComplete.Bind(":error-count", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMAutoComplete
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	AutoComplete.Bind(":error-messages", pp)
	Return Me
End Sub

'set filled
Sub SetFilled(varFilled As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Filled"$
	vue.SetStateSingle(pp, varFilled)
	AutoComplete.Bind(":filled", pp)
	Return Me
End Sub

'set filter
Sub SetFilter(varFilter As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Filter"$
	vue.SetStateSingle(pp, varFilter)
	AutoComplete.Bind(":filter", pp)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	AutoComplete.Bind(":flat", pp)
	Return Me
End Sub

'set full-width
Sub SetFullWidth(varFullWidth As Object) As VMAutoComplete
	Dim pp As String = $"${ID}FullWidth"$
	vue.SetStateSingle(pp, varFullWidth)
	AutoComplete.Bind(":full-width", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	AutoComplete.Bind(":height", pp)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Object) As VMAutoComplete
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	AutoComplete.Bind(":hide-details", pp)
	Return Me
End Sub

'set hide-no-data
Sub SetHideNoData(varHideNoData As Object) As VMAutoComplete
	Dim pp As String = $"${ID}HideNoData"$
	vue.SetStateSingle(pp, varHideNoData)
	AutoComplete.Bind(":hide-no-data", pp)
	Return Me
End Sub

'set hide-selected
Sub SetHideSelected(varHideSelected As Object) As VMAutoComplete
	Dim pp As String = $"${ID}HideSelected"$
	vue.SetStateSingle(pp, varHideSelected)
	AutoComplete.Bind(":hide-selected", pp)
	Return Me
End Sub

'set hint
Sub SetHint(varHint As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	AutoComplete.Bind(":hint", pp)
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	AutoComplete.Bind(":id", pp)
	Return Me
End Sub

'set item-color
Sub SetItemColor(varItemColor As Object) As VMAutoComplete
	Dim pp As String = $"${ID}ItemColor"$
	vue.SetStateSingle(pp, varItemColor)
	AutoComplete.Bind(":item-color", pp)
	Return Me
End Sub

'set item-disabled
Sub SetItemDisabled(varItemDisabled As Object) As VMAutoComplete
	Dim pp As String = $"${ID}ItemDisabled"$
	vue.SetStateSingle(pp, varItemDisabled)
	AutoComplete.Bind(":item-disabled", pp)
	Return Me
End Sub

'set item-text
Sub SetItemText(varItemText As Object) As VMAutoComplete
	Dim pp As String = $"${ID}ItemText"$
	vue.SetStateSingle(pp, varItemText)
	AutoComplete.Bind(":item-text", pp)
	Return Me
End Sub

'set item-value
Sub SetItemValue(varItemValue As Object) As VMAutoComplete
	Dim pp As String = $"${ID}ItemValue"$
	vue.SetStateSingle(pp, varItemValue)
	AutoComplete.Bind(":item-value", pp)
	Return Me
End Sub

'set items
Sub SetItems(varItems As String) As VMAutoComplete
	AutoComplete.SetAttrSingle(":items", varItems)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	AutoComplete.Bind(":label", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	AutoComplete.Bind(":light", pp)
	Return Me
End Sub

'set loader-height
Sub SetLoaderHeight(varLoaderHeight As Object) As VMAutoComplete
	Dim pp As String = $"${ID}LoaderHeight"$
	vue.SetStateSingle(pp, varLoaderHeight)
	AutoComplete.Bind(":loader-height", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	AutoComplete.Bind(":loading", pp)
	Return Me
End Sub

'set menu-props
Sub SetMenuProps(varMenuProps As Object) As VMAutoComplete
	Dim pp As String = $"${ID}MenuProps"$
	vue.SetStateSingle(pp, varMenuProps)
	AutoComplete.Bind(":menu-props", pp)
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	AutoComplete.Bind(":messages", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	AutoComplete.Bind(":multiple", pp)
	Return Me
End Sub

'set no-data-text
Sub SetNoDataText(varNoDataText As Object) As VMAutoComplete
	Dim pp As String = $"${ID}NoDataText"$
	vue.SetStateSingle(pp, varNoDataText)
	AutoComplete.Bind(":no-data-text", pp)
	Return Me
End Sub

'set no-filter
Sub SetNoFilter(varNoFilter As Object) As VMAutoComplete
	Dim pp As String = $"${ID}NoFilter"$
	vue.SetStateSingle(pp, varNoFilter)
	AutoComplete.Bind(":no-filter", pp)
	Return Me
End Sub

'set open-on-clear
Sub SetOpenOnClear(varOpenOnClear As Object) As VMAutoComplete
	Dim pp As String = $"${ID}OpenOnClear"$
	vue.SetStateSingle(pp, varOpenOnClear)
	AutoComplete.Bind(":open-on-clear", pp)
	Return Me
End Sub

'set outlined
Sub SetOutlined(varOutlined As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	AutoComplete.Bind(":outlined", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Object) As VMAutoComplete
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	AutoComplete.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set placeholder
Sub SetPlaceholder(varPlaceholder As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Placeholder"$
	vue.SetStateSingle(pp, varPlaceholder)
	AutoComplete.Bind(":placeholder", pp)
	Return Me
End Sub

'set prefix
Sub SetPrefix(varPrefix As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Prefix"$
	vue.SetStateSingle(pp, varPrefix)
	AutoComplete.Bind(":prefix", pp)
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As Object) As VMAutoComplete
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	AutoComplete.Bind(":prepend-icon", pp)
	Return Me
End Sub

'set prepend-inner-icon
Sub SetPrependInnerIcon(varPrependInnerIcon As Object) As VMAutoComplete
	Dim pp As String = $"${ID}PrependInnerIcon"$
	vue.SetStateSingle(pp, varPrependInnerIcon)
	AutoComplete.Bind(":prepend-inner-icon", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	AutoComplete.Bind(":readonly", pp)
	Return Me
End Sub

'set return-object
Sub SetReturnObject(varReturnObject As Boolean) As VMAutoComplete
	If varReturnObject = False Then Return Me
	AutoComplete.SetAttrLoose("return-object")
	Return Me
End Sub

'set reverse
Sub SetReverse(varReverse As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Reverse"$
	vue.SetStateSingle(pp, varReverse)
	AutoComplete.Bind(":reverse", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	AutoComplete.Bind(":rounded", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Rules"$
	vue.SetStateSingle(pp, varRules)
	AutoComplete.Bind(":rules", pp)
	Return Me
End Sub

'set search-input
Sub SetSearchInput(varSearchInput As String) As VMAutoComplete
	AutoComplete.SetAttrSingle(":search-input.sync", varSearchInput)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	AutoComplete.Bind(":shaped", pp)
	Return Me
End Sub

'set single-line
Sub SetSingleLine(varSingleLine As Object) As VMAutoComplete
	Dim pp As String = $"${ID}SingleLine"$
	vue.SetStateSingle(pp, varSingleLine)
	AutoComplete.Bind(":single-line", pp)
	Return Me
End Sub

'set small-chips
Sub SetSmallChips(varSmallChips As Object) As VMAutoComplete
	Dim pp As String = $"${ID}SmallChips"$
	vue.SetStateSingle(pp, varSmallChips)
	AutoComplete.Bind(":small-chips", pp)
	Return Me
End Sub

'set solo
Sub SetSolo(varSolo As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Solo"$
	vue.SetStateSingle(pp, varSolo)
	AutoComplete.Bind(":solo", pp)
	Return Me
End Sub

'set solo-inverted
Sub SetSoloInverted(varSoloInverted As Object) As VMAutoComplete
	Dim pp As String = $"${ID}SoloInverted"$
	vue.SetStateSingle(pp, varSoloInverted)
	AutoComplete.Bind(":solo-inverted", pp)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	AutoComplete.Bind(":success", pp)
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMAutoComplete
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	AutoComplete.Bind(":success-messages", pp)
	Return Me
End Sub

'set suffix
Sub SetSuffix(varSuffix As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Suffix"$
	vue.SetStateSingle(pp, varSuffix)
	AutoComplete.Bind(":suffix", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	AutoComplete.Bind(":type", pp)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Object) As VMAutoComplete
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	AutoComplete.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMAutoComplete
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	AutoComplete.Bind(":value", pp)
	Return Me
End Sub

'set value-comparator
Sub SetValueComparator(varValueComparator As Object) As VMAutoComplete
	Dim pp As String = $"${ID}ValueComparator"$
	vue.SetStateSingle(pp, varValueComparator)
	AutoComplete.Bind(":value-comparator", pp)
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotAppendItem(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("slot": "append-item"))
	Return Me
End Sub

'
Sub SetSlotAppendOuter(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("slot": "append-outer"))
	Return Me
End Sub

'
Sub SetSlotItem(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("slot": "item"))
	Return Me
End Sub

'
Sub SetSlotLabel(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("slot": "label"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotNoData(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("slot": "no-data"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetSlotPrependInner(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("slot": "prepend-inner"))
	Return Me
End Sub

'
Sub SetSlotPrependItem(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("slot": "prepend-item"))
	Return Me
End Sub

'
Sub SetSlotProgress(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("slot": "progress"))
	Return Me
End Sub

'
Sub SetSlotSelection(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("slot": "selection"))
	Return Me
End Sub

'
Sub SetOnBlur(methodName As String) As VMAutoComplete
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
Sub SetOnChange(methodName As String) As VMAutoComplete
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
Sub SetOnClick(methodName As String) As VMAutoComplete
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
Sub SetOnClickAppend(methodName As String) As VMAutoComplete
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
Sub SetOnClickAppendOuter(methodName As String) As VMAutoComplete
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
Sub SetOnClickClear(methodName As String) As VMAutoComplete
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
Sub SetOnClickPrepend(methodName As String) As VMAutoComplete
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
Sub SetOnClickPrependInner(methodName As String) As VMAutoComplete
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
Sub SetOnFocus(methodName As String) As VMAutoComplete
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
Sub SetOnInput(methodName As String) As VMAutoComplete
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
Sub SetOnKeydown(methodName As String) As VMAutoComplete
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
Sub SetOnMousedown(methodName As String) As VMAutoComplete
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
Sub SetOnMouseup(methodName As String) As VMAutoComplete
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
Sub SetOnUpdateError(methodName As String) As VMAutoComplete
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
Sub SetOnUpdateListIndex(methodName As String) As VMAutoComplete
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:list-index": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateSearchInput(methodName As String) As VMAutoComplete
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:search-input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMAutoComplete
	AutoComplete.SetVisible(False)
	Return Me
End Sub

Sub Show As VMAutoComplete
	AutoComplete.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMAutoComplete
	AutoComplete.Enable(True)
	Return Me
End Sub

Sub Disable As VMAutoComplete
	AutoComplete.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMAutoComplete
	AutoComplete.Bind(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMAutoComplete
	AutoComplete.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMAutoComplete
	AutoComplete.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMAutoComplete
	AutoComplete.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMAutoComplete
	AutoComplete.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMAutoComplete
	AutoComplete.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMAutoComplete
	AutoComplete.SetName(varName, bbind)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMAutoComplete
	AutoComplete.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMAutoComplete
	AutoComplete.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMAutoComplete
AutoComplete.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMAutoComplete
AutoComplete.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMAutoComplete
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMAutoComplete
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub