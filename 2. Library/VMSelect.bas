B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Combo As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private ErrorText As String
	Private bStatic As Boolean
End Sub

'initialize the Combo
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSelect
	ID = sid.tolowercase
	Combo.Initialize(v, ID)
	Combo.SetTag("v-select")
	DesignMode = False
	Module = eventHandler
	vue = v
	Combo.typeOf = "selectbox"
	ErrorText = ""
	Combo.typeOf = "select"
	bStatic = False
	Return Me
End Sub

'make this select an autocomplete
Sub SetAutoComplete As VMSelect
	Combo.SetTag("v-autocomplete")
	Combo.typeOf = "auto"
	Return Me
End Sub

'make this select a combo
Sub SetComboBox As VMSelect
	Combo.SetTag("v-combobox")
	Combo.typeOf = "combo"
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMSelect
	bStatic = b
	Combo.SetStatic(b)
	Return Me
End Sub


'backward compatibility
Sub SetInvalidMessage(ErrText As String) As VMSelect
	If ErrText = "" Then Return Me
	ErrorText = ErrText
	Return Me
End Sub

Sub SetErrorText(Error As String) As VMSelect
	If Error = "" Then Return Me
	ErrorText = Error
	Return Me
End Sub

Sub SetString As VMSelect
	Combo.fieldType = "string"
	Return Me
End Sub


Sub SetInt As VMSelect
	Combo.fieldType = "int"
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSelect
	Combo.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSelect
	Combo.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSelect
	Combo.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSelect
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMSelect
	Combo.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSelect
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub


Sub AddComponent(comp As String) As VMSelect
	Combo.SetText(comp)
	Return Me
End Sub

Sub AddItems(items As List) As VMSelect
	Dim targ As String = $"${ID}items"$
	vue.SetData(targ, items)
	SetItems(targ)
	Return Me
End Sub

'use an existing state
Sub SetDataSource(sourceName As String, sourceField As String, displayField As String, returnObject As Boolean) As VMSelect
	sourceName = sourceName.tolowercase
	sourceField = sourceField.ToLowerCase
	displayField = displayField.ToLowerCase
	SetItems(sourceName)
	SetItemText(displayField)
	SetItemValue(sourceField)
	SetReturnObject(returnObject)
	If vue.StateExists(sourceName) = False Then
		vue.SetData(sourceName, Array())
	End If
	Return Me
End Sub

Sub SetOptions(sourceName As String, options As Map, sourcefield As String, displayfield As String, returnObject As Boolean) As VMSelect
	sourceName = sourceName.tolowercase
	sourcefield = sourcefield.ToLowerCase
	displayfield = displayfield.ToLowerCase
	Dim recs As List
	recs.Initialize
	For Each k As String In options.Keys
		Dim v As String = options.Get(k)
		k = vue.CStr(k)
		v = vue.CStr(v)
		Dim nrec As Map = CreateMap()
		nrec.Put(sourcefield, k)
		nrec.Put(displayfield, v)
		recs.Add(nrec)
	Next
	'save the options
	vue.SetData(sourceName, recs)
	SetItems(sourceName)
	SetItemText(displayfield)
	SetItemValue(sourcefield)
	SetReturnObject(returnObject)
	Return Me
End Sub

'get component
Sub ToString As String
	Return Combo.ToString
End Sub


'apply a theme to an element
Sub UseTheme(themeName As String) As VMSelect
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set required
Sub SetRequired(varRequired As Boolean) As VMSelect
	If varRequired = False Then Return Me
	Combo.SetRequired(varRequired)
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMSelect
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
	Else
		Dim pp As String = $"${ID}Color"$
		vue.SetStateSingle(pp, scolor)
		Combo.Bind(":color", pp)
	End If
	Return Me
End Sub

Sub SetVModel(k As String) As VMSelect
	Combo.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMSelect
	Combo.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSelect
	Combo.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSelect
	Dim childHTML As String = child.ToString
	Combo.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMSelect
	Combo.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSelect
	Combo.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSelect
	Combo.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSelect
	Combo.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As String) As VMSelect
	If varAppendIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("append-icon", varAppendIcon)
	Else
		Dim pp As String = $"${ID}AppendIcon"$
		vue.SetStateSingle(pp, varAppendIcon)
		Combo.Bind(":append-icon", pp)
	End If
	Return Me
End Sub

'set append-outer-icon
Sub SetAppendOuterIcon(varAppendOuterIcon As String) As VMSelect
	If varAppendOuterIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("append-outer-icon", varAppendOuterIcon)
	Else
	Dim pp As String = $"${ID}AppendOuterIcon"$
	vue.SetStateSingle(pp, varAppendOuterIcon)
	Combo.Bind(":append-outer-icon", pp)
	End If
	Return Me
End Sub

'set attach
Sub SetAttach(varAttach As String) As VMSelect
	If varAttach = "" Then Return Me
	If bStatic Then
		SetAttrSingle("attach", varAttach)
	Else
	Dim pp As String = $"${ID}Attach"$
	vue.SetStateSingle(pp, varAttach)
	Combo.Bind(":attach", pp)
	End If
	Return Me
End Sub

'set autofocus
Sub SetAutofocus(varAutofocus As Boolean) As VMSelect
	If varAutofocus = False Then Return Me
	If bStatic Then
		SetAttrSingle("autofocus", varAutofocus)
	Else
	Dim pp As String = $"${ID}Autofocus"$
	vue.SetStateSingle(pp, varAutofocus)
	Combo.Bind(":autofocus", pp)
	End If
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As String) As VMSelect
	If varBackgroundColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("background-color", varBackgroundColor)
	Else
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	Combo.Bind(":background-color", pp)
	End If
	Return Me
End Sub

'set cache-items
Sub SetCacheItems(varCacheItems As Boolean) As VMSelect
	If varCacheItems = False Then Return Me
	If bStatic Then
		SetAttrSingle("cache-items", varCacheItems)
	Else
	Dim pp As String = $"${ID}CacheItems"$
	vue.SetStateSingle(pp, varCacheItems)
	Combo.Bind(":cache-items", pp)
	End If
	Return Me
End Sub

'set chips
Sub SetChips(varChips As Boolean) As VMSelect
	If varChips = False Then Return Me
	If bStatic Then
		SetAttrSingle("chips", varChips)
	Else
	Dim pp As String = $"${ID}Chips"$
	vue.SetStateSingle(pp, varChips)
	Combo.Bind(":chips", pp)
	End If
	Return Me
End Sub

'set clear-icon
Sub SetClearIcon(varClearIcon As String) As VMSelect
	If varClearIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("clear-icon", varClearIcon)
	Else
	Dim pp As String = $"${ID}ClearIcon"$
	vue.SetStateSingle(pp, varClearIcon)
	Combo.Bind(":clear-icon", pp)
	End If
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Boolean) As VMSelect
	If varClearable = False Then Return Me
	If bStatic Then
		SetAttrSingle("clearable", varClearable)
	Else
	Dim pp As String = $"${ID}Clearable"$
	vue.SetStateSingle(pp, varClearable)
	Combo.Bind(":clearable", pp)
	End If
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMSelect
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
	Else
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Combo.Bind(":color", pp)
	End If
	Return Me
End Sub

'set counter
Sub SetCounter(varCounter As Boolean) As VMSelect
	If varCounter = False Then Return Me
	If bStatic Then
		SetAttrSingle("counter", varCounter)
	Else
	Dim pp As String = $"${ID}Counter"$
	vue.SetStateSingle(pp, varCounter)
	Combo.Bind(":counter", pp)
	End If
	Return Me
End Sub

'set counter-value
Sub SetCounterValue(varCounterValue As String) As VMSelect
	If varCounterValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("counter-value", varCounterValue)
	Else
	Dim pp As String = $"${ID}CounterValue"$
	vue.SetStateSingle(pp, varCounterValue)
	Combo.Bind(":counter-value", pp)
	End If
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMSelect
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
	Else
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Combo.Bind(":dark", pp)
	End If
	Return Me
End Sub

'set deletable-chips
Sub SetDeletableChips(varDeletableChips As Boolean) As VMSelect
	If varDeletableChips = False Then Return Me
	If bStatic Then
		SetAttrSingle("deletable-chips", varDeletableChips)
	Else
	Dim pp As String = $"${ID}DeletableChips"$
	vue.SetStateSingle(pp, varDeletableChips)
	Combo.Bind(":deletable-chips", pp)
	End If
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMSelect
	If varDense = False Then Return Me
	If bStatic Then
		SetAttrSingle("dense", varDense)
	Else
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	Combo.Bind(":dense", pp)
	End If
	Return Me
End Sub

'set disable-lookup
Sub SetDisableLookup(varDisableLookup As Boolean) As VMSelect
	If varDisableLookup = False Then Return Me
	If bStatic Then
		SetAttrSingle("disable-lookup", varDisableLookup)
	Else
	Dim pp As String = $"${ID}DisableLookup"$
	vue.SetStateSingle(pp, varDisableLookup)
	Combo.Bind(":disable-lookup", pp)
	End If
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMSelect
	Combo.SetDisabled(varDisabled)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Boolean) As VMSelect
	If varEager = False Then Return Me
	If bStatic Then
		SetAttrSingle("eager", varEager)
	Else
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	Combo.Bind(":eager", pp)
	End If
	Return Me
End Sub

'set error
Sub SetError(varError As Object) As VMSelect
	If bStatic Then
		SetAttrSingle("error", varError)
	Else
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	Combo.Bind(":error", pp)
	End If
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMSelect
	If bStatic Then
		SetAttrSingle("error-count", varErrorCount)
	Else
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	Combo.Bind(":error-count", pp)
	End If
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMSelect
	If bStatic Then
		SetAttrSingle("error-messages", varErrorMessages)
	Else
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	Combo.Bind(":error-messages", pp)
	End If
	Return Me
End Sub

'set filled
Sub SetFilled(varFilled As Boolean) As VMSelect
	If varFilled = False Then Return Me
	If bStatic Then
		SetAttrSingle("filled", varFilled)
	Else
	Dim pp As String = $"${ID}Filled"$
	vue.SetStateSingle(pp, varFilled)
	Combo.Bind(":filled", pp)
	End If
	Return Me
End Sub

'set filter
Sub SetFilter(varFilter As Object) As VMSelect
	SetAttrSingle("filter", varFilter)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Boolean) As VMSelect
	If varFlat = False Then Return Me
	If bStatic Then
		SetAttrSingle("flat", varFlat)
	Else
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	Combo.Bind(":flat", pp)
	End If
	Return Me
End Sub

'set full-width
Sub SetFullWidth(varFullWidth As Boolean) As VMSelect
	If varFullWidth = False Then Return Me
	If bStatic Then
		SetAttrSingle("full-width", varFullWidth)
	Else
	Dim pp As String = $"${ID}FullWidth"$
	vue.SetStateSingle(pp, varFullWidth)
	Combo.Bind(":full-width", pp)
	End If
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMSelect
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
	Else
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Combo.Bind(":height", pp)
	End If
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Boolean) As VMSelect
	If varHideDetails = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-details", varHideDetails)
	Else
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	Combo.Bind(":hide-details", pp)
	End If
	Return Me
End Sub

'set hide-selected
Sub SetHideSelected(varHideSelected As Boolean) As VMSelect
	If varHideSelected = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-selected", varHideSelected)
	Else
	Dim pp As String = $"${ID}HideSelected"$
	vue.SetStateSingle(pp, varHideSelected)
	Combo.Bind(":hide-selected", pp)
	End If
	Return Me
End Sub

'set hint
Sub SetHint(varHint As String) As VMSelect
	If varHint = "" Then Return Me
	If bStatic Then
		SetAttrSingle("hint", varHint)
	Else
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	Combo.Bind(":hint", pp)
	End If
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMSelect
	If bStatic Then
		SetAttrSingle("id", varId)
	Else
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	Combo.Bind(":id", pp)
	End If
	Return Me
End Sub

'set item-color
Sub SetItemColor(varItemColor As String) As VMSelect
	If varItemColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("item-color", varItemColor)
	Else
	Dim pp As String = $"${ID}ItemColor"$
	vue.SetStateSingle(pp, varItemColor)
	Combo.Bind(":item-color", pp)
	End If
	Return Me
End Sub

'set item-disabled
Sub SetItemDisabled(varItemDisabled As Boolean) As VMSelect
	If varItemDisabled = False Then Return Me
	If bStatic Then
		SetAttrSingle("item-disabled", varItemDisabled)
	Else
	Dim pp As String = $"${ID}ItemDisabled"$
	vue.SetStateSingle(pp, varItemDisabled)
	Combo.Bind(":item-disabled", pp)
	End If
	Return Me
End Sub

'set item-text
Sub SetItemText(varItemText As String) As VMSelect
	If varItemText = "" Then Return Me
	SetAttrSingle("item-text", varItemText)
	Return Me
End Sub

'set item-value
Sub SetItemValue(varItemValue As String) As VMSelect
	If varItemValue = "" Then Return Me
	SetAttrSingle("item-value", varItemValue)
	Return Me
End Sub

'set items
Sub SetItems(varItems As String) As VMSelect
	If varItems = "" Then Return Me
	varItems = varItems.tolowercase
	Combo.SetAttrsingle(":items", varItems)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As String) As VMSelect
	If varLabel = "" Then Return Me
	If bStatic Then
		SetAttrSingle("label", varLabel)
	Else
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	Combo.Bind(":label", pp)
	End If
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMSelect
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
	Else
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Combo.Bind(":light", pp)
	End If
	Return Me
End Sub

'set loader-height
Sub SetLoaderHeight(varLoaderHeight As String) As VMSelect
	If varLoaderHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("loader-height", varLoaderHeight)
	Else
	Dim pp As String = $"${ID}LoaderHeight"$
	vue.SetStateSingle(pp, varLoaderHeight)
	Combo.Bind(":loader-height", pp)
	End If
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Boolean) As VMSelect
	If varLoading = False Then Return Me
	If bStatic Then
		SetAttrSingle("loading", varLoading)
	Else
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	Combo.Bind(":loading", pp)
	End If
	Return Me
End Sub

'set menu-props
Sub SetMenuProps(varMenuProps As Object) As VMSelect
	If bStatic Then
		SetAttrSingle("menu-props", varMenuProps)
	Else
	Dim pp As String = $"${ID}MenuProps"$
	vue.SetStateSingle(pp, varMenuProps)
	Combo.Bind(":menu-props", pp)
	End If
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMSelect
	If bStatic Then
		SetAttrSingle("messages", varMessages)
	Else
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	Combo.Bind(":messages", pp)
	End If
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Boolean) As VMSelect
	If varMultiple = False Then Return Me
	If varMultiple Then Combo.IsArray = True
	If bStatic Then
		SetAttrSingle("multiple", varMultiple)
	Else
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	Combo.Bind(":multiple", pp)	
	End If
	Return Me
End Sub

'set no-data-text
Sub SetNoDataText(varNoDataText As String) As VMSelect
	If varNoDataText = "" Then Return Me
	If bStatic Then
		SetAttrSingle("no-data-text", varNoDataText)
	Else
	Dim pp As String = $"${ID}NoDataText"$
	vue.SetStateSingle(pp, varNoDataText)
	Combo.Bind(":no-data-text", pp)
	End If
	Return Me
End Sub

'set open-on-clear
Sub SetOpenOnClear(varOpenOnClear As Boolean) As VMSelect
	If varOpenOnClear = False Then Return Me
	If bStatic Then
		SetAttrSingle("open-on-clear", varOpenOnClear)
	Else
	Dim pp As String = $"${ID}OpenOnClear"$
	vue.SetStateSingle(pp, varOpenOnClear)
	Combo.Bind(":open-on-clear", pp)
	End If
	Return Me
End Sub

'set outlined
Sub SetOutlined(varOutlined As Boolean) As VMSelect
	If varOutlined = False Then Return Me
	If bStatic Then
		SetAttrSingle("outlined", varOutlined)
	Else
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	Combo.Bind(":outlined", pp)
	End If
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Boolean) As VMSelect
	If varPersistentHint = False Then Return Me
	If bStatic Then
		SetAttrSingle("persistent-hint", varPersistentHint)
	Else
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	Combo.Bind(":persistent-hint", pp)
	End If
	Return Me
End Sub

'set placeholder
Sub SetPlaceholder(varPlaceholder As String) As VMSelect
	If varPlaceholder = "" Then Return Me
	If bStatic Then
		SetAttrSingle("placeholder", varPlaceholder)
	Else
	Dim pp As String = $"${ID}Placeholder"$
	vue.SetStateSingle(pp, varPlaceholder)
	Combo.Bind(":placeholder", pp)
	End If
	Return Me
End Sub

'set prefix
Sub SetPrefix(varPrefix As String) As VMSelect
	If varPrefix = "" Then Return Me
	If bStatic Then
		SetAttrSingle("prefix", varPrefix)
	Else
	Dim pp As String = $"${ID}Prefix"$
	vue.SetStateSingle(pp, varPrefix)
	Combo.Bind(":prefix", pp)
	End If
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As String) As VMSelect
	If varPrependIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("prepend-icon", varPrependIcon)
	Else
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	Combo.Bind(":prepend-icon", pp)
	End If
	Return Me
End Sub

'set prepend-inner-icon
Sub SetPrependInnerIcon(varPrependInnerIcon As String) As VMSelect
	If varPrependInnerIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("prepend-inner-icon", varPrependInnerIcon)
	Else
	Dim pp As String = $"${ID}PrependInnerIcon"$
	vue.SetStateSingle(pp, varPrependInnerIcon)
	Combo.Bind(":prepend-inner-icon", pp)
	End If
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Boolean) As VMSelect
	If varReadonly = False Then Return Me
	If bStatic Then
		SetAttrSingle("readonly", varReadonly)
	Else
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	Combo.Bind(":readonly", pp)
	End If
	Return Me
End Sub

'set return-object
Sub SetReturnObject(varReturnObject As Boolean) As VMSelect
	Select Case Combo.typeOf
	Case "select", "auto"
		If varReturnObject = False Then Return Me
	Case "auto"
		If varReturnObject = True Then Return Me
	End Select
	SetAttrSingle("return-object", varReturnObject)
	Return Me
End Sub

'set reverse
Sub SetReverse(varReverse As Boolean) As VMSelect
	If varReverse = False Then Return Me
	If bStatic Then
		SetAttrSingle("reverse", varReverse)
	Else
	Dim pp As String = $"${ID}Reverse"$
	vue.SetStateSingle(pp, varReverse)
	Combo.Bind(":reverse", pp)
	End If
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Boolean) As VMSelect
	If varRounded = False Then Return Me
	If bStatic Then
		SetAttrSingle("rounded", varRounded)
	Else
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	Combo.Bind(":rounded", pp)
	End If
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMSelect
	Dim pp As String = $"${ID}Rules"$
	vue.SetStateSingle(pp, varRules)
	Combo.Bind(":rules", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Boolean) As VMSelect
	If varShaped = False Then Return Me
	If bStatic Then
		SetAttrSingle("shaped", varShaped)
	Else
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	Combo.Bind(":shaped", pp)
	End If
	Return Me
End Sub

'set single-line
Sub SetSingleLine(varSingleLine As Boolean) As VMSelect
	If varSingleLine = False Then Return Me
	If bStatic Then
		SetAttrSingle("single-line", varSingleLine)
	Else
	Dim pp As String = $"${ID}SingleLine"$
	vue.SetStateSingle(pp, varSingleLine)
	Combo.Bind(":single-line", pp)
	End If
	Return Me
End Sub

'set small-chips
Sub SetSmallChips(varSmallChips As Boolean) As VMSelect
	If varSmallChips = False Then Return Me
	If bStatic Then
		SetAttrSingle("small-chips", varSmallChips)
	Else
	Dim pp As String = $"${ID}SmallChips"$
	vue.SetStateSingle(pp, varSmallChips)
	Combo.Bind(":small-chips", pp)
	End If
	Return Me
End Sub

'set solo
Sub SetSolo(varSolo As Boolean) As VMSelect
	If varSolo = False Then Return Me
	If bStatic Then
		SetAttrSingle("solo", varSolo)
	Else
	Dim pp As String = $"${ID}Solo"$
	vue.SetStateSingle(pp, varSolo)
	Combo.Bind(":solo", pp)
	End If
	Return Me
End Sub

'set solo-inverted
Sub SetSoloInverted(varSoloInverted As Boolean) As VMSelect
	If varSoloInverted = False Then Return Me
	If bStatic Then
		SetAttrSingle("solo-inverted", varSoloInverted)
	Else
	Dim pp As String = $"${ID}SoloInverted"$
	vue.SetStateSingle(pp, varSoloInverted)
	Combo.Bind(":solo-inverted", pp)
	End If
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Boolean) As VMSelect
	If varSuccess = False Then Return Me
	If bStatic Then
		SetAttrSingle("success", varSuccess)
	Else
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	Combo.Bind(":success", pp)
	End If
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMSelect
	If bStatic Then
		SetAttrSingle("success-messages", varSuccessMessages)
	Else
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	Combo.Bind(":success-messages", pp)
	End If
	Return Me
End Sub

'set suffix
Sub SetSuffix(varSuffix As String) As VMSelect
	If varSuffix = "" Then Return Me
	If bStatic Then
		SetAttrSingle("suffix", varSuffix)
	Else
	Dim pp As String = $"${ID}Suffix"$
	vue.SetStateSingle(pp, varSuffix)
	Combo.Bind(":suffix", pp)
	End If
	Return Me
End Sub

'set type
Sub SetType(varType As String) As VMSelect
	If varType = "" Then Return Me
	If bStatic Then
		SetAttrSingle("type", varType)
	Else
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	Combo.Bind(":type", pp)
	End If
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Boolean) As VMSelect
	If varValidateOnBlur = False Then Return Me
	If bStatic Then
		SetAttrSingle("validate-on-blur", varValidateOnBlur)
	Else
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	Combo.Bind(":validate-on-blur", pp)
	End If
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMSelect
	SetAttrSingle("value", varValue)
	Return Me
End Sub

'set value-comparator
Sub SetValueComparator(varValueComparator As Object) As VMSelect
	If bStatic Then
		SetAttrSingle("value-comparator", varValueComparator)
	Else
	Dim pp As String = $"${ID}ValueComparator"$
	vue.SetStateSingle(pp, varValueComparator)
	Combo.Bind(":value-comparator", pp)
	End If
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMSelect    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotAppendItem(b As Boolean) As VMSelect    'ignore
	SetAttr(CreateMap("slot": "append-item"))
	Return Me
End Sub

'
Sub SetSlotAppendOuter(b As Boolean) As VMSelect    'ignore
	SetAttr(CreateMap("slot": "append-outer"))
	Return Me
End Sub

'
Sub SetSlotItem(b As Boolean) As VMSelect    'ignore
	SetAttr(CreateMap("slot": "item"))
	Return Me
End Sub

'
Sub SetSlotLabel(b As Boolean) As VMSelect    'ignore
	SetAttr(CreateMap("slot": "label"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As Boolean) As VMSelect    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotNoData(b As Boolean) As VMSelect    'ignore
	SetAttr(CreateMap("slot": "no-data"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As Boolean) As VMSelect    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetSlotPrependInner(b As Boolean) As VMSelect    'ignore
	SetAttr(CreateMap("slot": "prepend-inner"))
	Return Me
End Sub

'
Sub SetSlotPrependItem(b As Boolean) As VMSelect    'ignore
	SetAttr(CreateMap("slot": "prepend-item"))
	Return Me
End Sub

'
Sub SetSlotProgress(b As Boolean) As VMSelect    'ignore
	SetAttr(CreateMap("slot": "progress"))
	Return Me
End Sub

'
Sub SetSlotSelection(b As Boolean) As VMSelect    'ignore
	SetAttr(CreateMap("slot": "selection"))
	Return Me
End Sub

'
Sub SetOnBlur(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:blur": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnChange(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim value As Object
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(value))
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClick(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppend(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:click:append": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppendOuter(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:click:append-outer": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickClear(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:click:clear": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrepend(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:click:prepend": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrependInner(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:click:prepend-inner": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnFocus(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:focus": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnKeydown(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:keydown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMousedown(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:mousedown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseup(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:mouseup": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateError(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateListIndex(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:update:list-index": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateSearchInput(eventHandler As Object, methodName As String) As VMSelect
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:update:search-input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMSelect
	Combo.SetVisible(False)
	Return Me
End Sub

Sub Show As VMSelect
	Combo.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMSelect
	Combo.Enable(True)
	Return Me
End Sub

Sub Disable As VMSelect
	Combo.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSelect
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMSelect
	Combo.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSelect
	Combo.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMSelect
	Combo.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMSelect
	Combo.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMSelect
	Combo.SetTabIndex(ti)
	Return Me
End Sub

'The Combo name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSelect
	Combo.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMSelect
	Combo.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMSelect
	Combo.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSelect
	Combo.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMSelect
	Combo.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMSelect
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMSelect
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub

'******

'set allow-overflow
Sub SetAllowOverflow(varAllowOverflow As Boolean) As VMSelect
	If varAllowOverflow = False Then Return Me
	If bStatic Then
		SetAttrSingle("allow-overflow", varAllowOverflow)
		Return Me
	End If
	Dim pp As String = $"${ID}AllowOverflow"$
	vue.SetStateSingle(pp, varAllowOverflow)
	Combo.Bind(":allow-overflow", pp)
	Return Me
End Sub

'set auto-select-first
Sub SetAutoSelectFirst(varAutoSelectFirst As Boolean) As VMSelect
	If varAutoSelectFirst = False Then Return Me
	If bStatic Then
		SetAttrSingle("auto-select-first", varAutoSelectFirst)
		Return Me
	End If
	Dim pp As String = $"${ID}AutoSelectFirst"$
	vue.SetStateSingle(pp, varAutoSelectFirst)
	Combo.Bind(":auto-select-first", pp)
	Return Me
End Sub


'set hide-no-data
Sub SetHideNoData(varHideNoData As Boolean) As VMSelect
	If varHideNoData = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-no-data", varHideNoData)
		Return Me
	End If
	Dim pp As String = $"${ID}HideNoData"$
	vue.SetStateSingle(pp, varHideNoData)
	Combo.Bind(":hide-no-data", pp)
	Return Me
End Sub

'set no-filter
Sub SetNoFilter(varNoFilter As Boolean) As VMSelect
	If varNoFilter = False Then Return Me
	If bStatic Then
		SetAttrSingle("no-filter", varNoFilter)
		Return Me
	End If
	Dim pp As String = $"${ID}NoFilter"$
	vue.SetStateSingle(pp, varNoFilter)
	Combo.Bind(":no-filter", pp)
	Return Me
End Sub

'set search-input
Sub SetSearchInput(varSearchInput As Boolean) As VMSelect
	If varSearchInput = False Then Return Me
	If bStatic Then
		SetAttrSingle("search-input", varSearchInput)
		Return Me
	End If
	Dim pp As String = $"${ID}SearchInput"$
	vue.SetStateSingle(pp, varSearchInput)
	Combo.Bind(":search-input", pp)
	Return Me
End Sub