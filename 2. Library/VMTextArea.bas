B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TextArea As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private ErrorText As String
End Sub

'initialize the TextArea
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTextArea
	ID = sid.tolowercase
	TextArea.Initialize(v, ID)
	TextArea.SetTag("v-textarea")
	DesignMode = False
	Module = eventHandler
	vue = v
	TextArea.typeOf = "textarea"
	ErrorText = ""
	Return Me
End Sub

Sub SetErrorText(error As String) As VMTextArea
	ErrorText = error
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMTextArea
	TextArea.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMTextArea
	TextArea.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMTextArea
	TextArea.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMTextArea
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMTextArea
	TextArea.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMTextArea
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetMaxLength(varMaxLen As String) As VMTextArea
	Dim pp As String = $"${ID}varMaxLen"$
	vue.SetStateSingle(pp, varMaxLen)
	TextArea.Bind(":maxlength", pp)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMTextArea
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMTextArea
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	TextArea.Bind(":color", pp)
	Return Me
End Sub


'set color intensity
Sub SetBackgroundColorIntensity(varColor As String, varIntensity As String) As VMTextArea
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	TextArea.Bind(":background-color", pp)
	Return Me
End Sub


'set required
Sub SetRequired(varRequired As Boolean) As VMTextArea
	TextArea.SetRequired(varRequired)
	Return Me
End Sub


'get component
Sub ToString As String
	Return TextArea.ToString
End Sub

Sub SetVModel(k As String) As VMTextArea
	TextArea.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTextArea
	TextArea.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTextArea
	TextArea.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTextArea
	Dim childHTML As String = child.ToString
	TextArea.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTextArea
	TextArea.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTextArea
	TextArea.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTextArea
	TextArea.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTextArea
	TextArea.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As Object) As VMTextArea
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	TextArea.Bind(":append-icon", pp)
	Return Me
End Sub

'set append-outer-icon
Sub SetAppendOuterIcon(varAppendOuterIcon As Object) As VMTextArea
	Dim pp As String = $"${ID}AppendOuterIcon"$
	vue.SetStateSingle(pp, varAppendOuterIcon)
	TextArea.Bind(":append-outer-icon", pp)
	Return Me
End Sub

'set auto-grow
Sub SetAutoGrow(varAutoGrow As Object) As VMTextArea
	Dim pp As String = $"${ID}AutoGrow"$
	vue.SetStateSingle(pp, varAutoGrow)
	TextArea.Bind(":auto-grow", pp)
	Return Me
End Sub

'set autofocus
Sub SetAutofocus(varAutofocus As Object) As VMTextArea
	Dim pp As String = $"${ID}Autofocus"$
	vue.SetStateSingle(pp, varAutofocus)
	TextArea.Bind(":autofocus", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMTextArea
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	TextArea.Bind(":background-color", pp)
	Return Me
End Sub

'set clear-icon
Sub SetClearIcon(varClearIcon As Object) As VMTextArea
	Dim pp As String = $"${ID}ClearIcon"$
	vue.SetStateSingle(pp, varClearIcon)
	TextArea.Bind(":clear-icon", pp)
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Object) As VMTextArea
	Dim pp As String = $"${ID}Clearable"$
	vue.SetStateSingle(pp, varClearable)
	TextArea.Bind(":clearable", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMTextArea
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	TextArea.Bind(":color", pp)
	Return Me
End Sub

'set counter
Sub SetCounter(varCounter As Object) As VMTextArea
	Dim pp As String = $"${ID}Counter"$
	vue.SetStateSingle(pp, varCounter)
	TextArea.Bind(":counter", pp)
	Return Me
End Sub

'set counter-value
Sub SetCounterValue(varCounterValue As Object) As VMTextArea
	Dim pp As String = $"${ID}CounterValue"$
	vue.SetStateSingle(pp, varCounterValue)
	TextArea.Bind(":counter-value", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMTextArea
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	TextArea.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMTextArea
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	TextArea.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As boolean) As VMTextArea
	TextArea.SetDisabled(varDisabled)
	Return Me
End Sub

'set error
Sub SetError(varError As Object) As VMTextArea
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	TextArea.Bind(":error", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMTextArea
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	TextArea.Bind(":error-count", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMTextArea
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	TextArea.Bind(":error-messages", pp)
	Return Me
End Sub

'set filled
Sub SetFilled(varFilled As Object) As VMTextArea
	Dim pp As String = $"${ID}Filled"$
	vue.SetStateSingle(pp, varFilled)
	TextArea.Bind(":filled", pp)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Object) As VMTextArea
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	TextArea.Bind(":flat", pp)
	Return Me
End Sub

'set full-width
Sub SetFullWidth(varFullWidth As Object) As VMTextArea
	Dim pp As String = $"${ID}FullWidth"$
	vue.SetStateSingle(pp, varFullWidth)
	TextArea.Bind(":full-width", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMTextArea
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	TextArea.Bind(":height", pp)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Object) As VMTextArea
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	TextArea.Bind(":hide-details", pp)
	Return Me
End Sub

'set hint
Sub SetHint(varHint As Object) As VMTextArea
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	TextArea.Bind(":hint", pp)
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMTextArea
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	TextArea.Bind(":id", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMTextArea
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	TextArea.Bind(":label", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMTextArea
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	TextArea.Bind(":light", pp)
	Return Me
End Sub

'set loader-height
Sub SetLoaderHeight(varLoaderHeight As Object) As VMTextArea
	Dim pp As String = $"${ID}LoaderHeight"$
	vue.SetStateSingle(pp, varLoaderHeight)
	TextArea.Bind(":loader-height", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMTextArea
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	TextArea.Bind(":loading", pp)
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMTextArea
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	TextArea.Bind(":messages", pp)
	Return Me
End Sub

'set no-resize
Sub SetNoResize(varNoResize As Object) As VMTextArea
	Dim pp As String = $"${ID}NoResize"$
	vue.SetStateSingle(pp, varNoResize)
	TextArea.Bind(":no-resize", pp)
	Return Me
End Sub

'set outlined
Sub SetOutlined(varOutlined As Object) As VMTextArea
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	TextArea.Bind(":outlined", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Object) As VMTextArea
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	TextArea.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set placeholder
Sub SetPlaceholder(varPlaceholder As Object) As VMTextArea
	Dim pp As String = $"${ID}Placeholder"$
	vue.SetStateSingle(pp, varPlaceholder)
	TextArea.Bind(":placeholder", pp)
	Return Me
End Sub

'set prefix
Sub SetPrefix(varPrefix As Object) As VMTextArea
	Dim pp As String = $"${ID}Prefix"$
	vue.SetStateSingle(pp, varPrefix)
	TextArea.Bind(":prefix", pp)
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As Object) As VMTextArea
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	TextArea.Bind(":prepend-icon", pp)
	Return Me
End Sub

'set prepend-inner-icon
Sub SetPrependInnerIcon(varPrependInnerIcon As Object) As VMTextArea
	Dim pp As String = $"${ID}PrependInnerIcon"$
	vue.SetStateSingle(pp, varPrependInnerIcon)
	TextArea.Bind(":prepend-inner-icon", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMTextArea
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	TextArea.Bind(":readonly", pp)
	Return Me
End Sub

'set reverse
Sub SetReverse(varReverse As Object) As VMTextArea
	Dim pp As String = $"${ID}Reverse"$
	vue.SetStateSingle(pp, varReverse)
	TextArea.Bind(":reverse", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Object) As VMTextArea
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	TextArea.Bind(":rounded", pp)
	Return Me
End Sub

'set row-height
Sub SetRowHeight(varRowHeight As Object) As VMTextArea
	Dim pp As String = $"${ID}RowHeight"$
	vue.SetStateSingle(pp, varRowHeight)
	TextArea.Bind(":row-height", pp)
	Return Me
End Sub

'set rows
Sub SetRows(varRows As Object) As VMTextArea
	Dim pp As String = $"${ID}Rows"$
	vue.SetStateSingle(pp, varRows)
	TextArea.Bind(":rows", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMTextArea
	Dim pp As String = $"${ID}Rules"$
	vue.SetStateSingle(pp, varRules)
	TextArea.Bind(":rules", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Object) As VMTextArea
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	TextArea.Bind(":shaped", pp)
	Return Me
End Sub

'set single-line
Sub SetSingleLine(varSingleLine As Object) As VMTextArea
	Dim pp As String = $"${ID}SingleLine"$
	vue.SetStateSingle(pp, varSingleLine)
	TextArea.Bind(":single-line", pp)
	Return Me
End Sub

'set solo
Sub SetSolo(varSolo As Object) As VMTextArea
	Dim pp As String = $"${ID}Solo"$
	vue.SetStateSingle(pp, varSolo)
	TextArea.Bind(":solo", pp)
	Return Me
End Sub

'set solo-inverted
Sub SetSoloInverted(varSoloInverted As Object) As VMTextArea
	Dim pp As String = $"${ID}SoloInverted"$
	vue.SetStateSingle(pp, varSoloInverted)
	TextArea.Bind(":solo-inverted", pp)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Object) As VMTextArea
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	TextArea.Bind(":success", pp)
	Return Me
End Sub

'set success-message
Sub SetSuccessMessage(varSuccessMessage As Object) As VMTextArea
	Dim pp As String = $"${ID}SuccessMessage"$
	vue.SetStateSingle(pp, varSuccessMessage)
	TextArea.Bind(":success-message", pp)
	Return Me
End Sub

'set suffix
Sub SetSuffix(varSuffix As Object) As VMTextArea
	Dim pp As String = $"${ID}Suffix"$
	vue.SetStateSingle(pp, varSuffix)
	TextArea.Bind(":suffix", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As Object) As VMTextArea
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	TextArea.Bind(":type", pp)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Object) As VMTextArea
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	TextArea.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMTextArea
	TextArea.SetAttrSingle("value", varValue)
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMTextArea    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotAppendOuter(b As Boolean) As VMTextArea    'ignore
	SetAttr(CreateMap("slot": "append-outer"))
	Return Me
End Sub

'
Sub SetSlotLabel(b As Boolean) As VMTextArea    'ignore
	SetAttr(CreateMap("slot": "label"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As boolean) As VMTextArea    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As boolean) As VMTextArea    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetSlotPrependInner(b As boolean) As VMTextArea    'ignore
	SetAttr(CreateMap("slot": "prepend-inner"))
	Return Me
End Sub

'
Sub SetSlotProgress(b As Boolean) As VMTextArea    'ignore
	SetAttr(CreateMap("slot": "progress"))
	Return Me
End Sub

'
Sub SetOnBlur(methodName As String) As VMTextArea
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
Sub SetOnChange(methodName As String) As VMTextArea
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
Sub SetOnClick(methodName As String) As VMTextArea
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
Sub SetOnClickAppend(methodName As String) As VMTextArea
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
Sub SetOnClickAppendOuter(methodName As String) As VMTextArea
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
Sub SetOnClickClear(methodName As String) As VMTextArea
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
Sub SetOnClickPrepend(methodName As String) As VMTextArea
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
Sub SetOnClickPrependInner(methodName As String) As VMTextArea
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
Sub SetOnFocus(methodName As String) As VMTextArea
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
Sub SetOnInput(methodName As String) As VMTextArea
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
Sub SetOnKeydown(methodName As String) As VMTextArea
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
Sub SetOnMousedown(methodName As String) As VMTextArea
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
Sub SetOnMouseup(methodName As String) As VMTextArea
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
Sub SetOnUpdateError(methodName As String) As VMTextArea
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMTextArea
	TextArea.SetVisible(False)
	Return Me
End Sub

Sub Show As VMTextArea
	TextArea.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMTextArea
	TextArea.Enable(True)
	Return Me
End Sub

Sub Disable As VMTextArea
	TextArea.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMTextArea
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMTextArea
	TextArea.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMTextArea
	TextArea.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMTextArea
	TextArea.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMTextArea
	TextArea.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMTextArea
	TextArea.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMTextArea
	TextArea.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMTextArea
	TextArea.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMTextArea
	TextArea.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMTextArea
TextArea.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub