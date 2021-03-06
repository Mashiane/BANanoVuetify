﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public FileInput As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
	Public ErrorText As String
End Sub

'initialize the FileInput
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMFileInput
	ID = sid.tolowercase
	FileInput.Initialize(v, ID)
	FileInput.SetTag("v-file-input")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	FileInput.fieldType = "string"
	FileInput.typeOf = "string"
	FileInput.InputType = "file"
	SetOnChange($"${ID}_change"$)
	SetRules(vue.NewList)
	SetErrorMessages(vue.NewList)
	SetError(False)
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	FileInput.SetText(elm.ToString)
End Sub

Sub SetData(xprop As String, xValue As Object) As VMFileInput
	vue.SetData(xprop, xValue)
	Return Me
End Sub


Sub SetErrorText(sError As String) As VMFileInput    'ignore
	ErrorText = sError
	FileInput.ErrorMessage = sError
	Return Me
End Sub

'set accept
Sub SetAccept(varAccept As String) As VMFileInput
	If varAccept = "" Then Return Me
	If bStatic Then
		SetAttrSingle("accept", varAccept)
		Return Me
	End If
	Dim pp As String = $"${ID}varAccept"$
	vue.SetStateSingle(pp, varAccept)
	Bind(":accept", pp)
	Return Me
End Sub


'set required
Sub SetRequired(varRequired As Boolean) As VMFileInput
	If varRequired = False Then Return Me
	FileInput.SetRequired(varRequired)
	Return Me
End Sub

'get component
Sub ToString As String
	If vue.ShowWarnings Then
	Dim eName As String = $"${ID}_change"$
	If SubExists(Module, eName) = False Then
		Log($"VMFileInput.${eName} event has not been defined!"$)
	End If
	End If
	Return FileInput.ToString
End Sub

Sub SetVModel(k As String) As VMFileInput
	FileInput.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMFileInput
	FileInput.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMFileInput
	FileInput.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMFileInput
	Dim childHTML As String = child.ToString
	FileInput.SetText(childHTML)
	Return Me
End Sub

'set text - built-in
Sub SetText(t As String) As VMFileInput
	FileInput.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMFileInput
	FileInput.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMFileInput
	FileInput.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMFileInput
	FileInput.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As String) As VMFileInput
	If varAppendIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("append-icon", varAppendIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	FileInput.Bind(":append-icon", pp)
	Return Me
End Sub

'set append-outer-icon
Sub SetAppendOuterIcon(varAppendOuterIcon As String) As VMFileInput
	If varAppendOuterIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("append-outer-icon", varAppendOuterIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}AppendOuterIcon"$
	vue.SetStateSingle(pp, varAppendOuterIcon)
	FileInput.Bind(":append-outer-icon", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As String) As VMFileInput
	If varBackgroundColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("background-color", varBackgroundColor)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	FileInput.Bind(":background-color", pp)
	Return Me
End Sub


'set color intensity
Sub SetBackgroundColorIntensity(color As String, intensity As String) As VMFileInput
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("background-color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, scolor)
	FileInput.Bind(":background-color", pp)
	Return Me
End Sub


'set color
Sub SetColor(varColor As String) As VMFileInput
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	FileInput.Bind(":color", pp)
	Return Me
End Sub

'set counter
Sub SetCounter(varCounter As String) As VMFileInput
	If varCounter = "" Then Return Me
	If bStatic Then
		SetAttrSingle("counter", varCounter)
		Return Me
	End If
	Dim pp As String = $"${ID}Counter"$
	vue.SetStateSingle(pp, varCounter)
	FileInput.Bind(":counter", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As String) As VMFileInput
	If varErrorCount = "" Then Return Me
	If varErrorCount = "1" Then Return Me
	If bStatic Then
		SetAttrSingle("error-count", varErrorCount)
		Return Me
	End If
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	FileInput.Bind(":error-count", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMFileInput
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	FileInput.Bind(":height", pp)
	Return Me
End Sub


'set hint
Sub SetHint(varHint As String) As VMFileInput
	If varHint = "" Then Return Me
	If bStatic Then
		SetAttrSingle("hint", varHint)
		Return Me
	End If
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	FileInput.Bind(":hint", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As String) As VMFileInput
	If varLabel = "" Then Return Me
	If bStatic Then
		SetAttrSingle("label", varLabel)
		Return Me
	End If
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	FileInput.Bind(":label", pp)
	Return Me
End Sub

'set loader-height
Sub SetLoaderHeight(varLoaderHeight As String) As VMFileInput
	If varLoaderHeight = "" Then Return Me
	If varLoaderHeight = "2" Then Return Me
	If bStatic Then
		SetAttrSingle("loader-height", varLoaderHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}LoaderHeight"$
	vue.SetStateSingle(pp, varLoaderHeight)
	FileInput.Bind(":loader-height", pp)
	Return Me
End Sub

'set placeholder
Sub SetPlaceholder(varPlaceholder As String) As VMFileInput
	If varPlaceholder = "" Then Return Me
	If bStatic Then
		SetAttrSingle("placeholder", varPlaceholder)
		Return Me
	End If
	Dim pp As String = $"${ID}Placeholder"$
	vue.SetStateSingle(pp, varPlaceholder)
	FileInput.Bind(":placeholder", pp)
	Return Me
End Sub

'set prefix
Sub SetPrefix(varPrefix As String) As VMFileInput
	If varPrefix = "" Then Return Me
	If bStatic Then
		SetAttrSingle("prefix", varPrefix)
		Return Me
	End If
	Dim pp As String = $"${ID}Prefix"$
	vue.SetStateSingle(pp, varPrefix)
	FileInput.Bind(":prefix", pp)
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As String) As VMFileInput
	If varPrependIcon = "" Then Return Me
	If varPrependIcon = "$file" Then Return Me
	If bStatic Then
		SetAttrSingle("prepend-icon", varPrependIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	FileInput.Bind(":prepend-icon", pp)
	Return Me
End Sub

'set prepend-inner-icon
Sub SetPrependInnerIcon(varPrependInnerIcon As String) As VMFileInput
	If varPrependInnerIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("prepend-inner-icon", varPrependInnerIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}PrependInnerIcon"$
	vue.SetStateSingle(pp, varPrependInnerIcon)
	FileInput.Bind(":prepend-inner-icon", pp)
	Return Me
End Sub

'set suffix
Sub SetSuffix(varSuffix As String) As VMFileInput
	If varSuffix = "" Then Return Me
	If bStatic Then
		SetAttrSingle("suffix", varSuffix)
		Return Me
	End If
	Dim pp As String = $"${ID}Suffix"$
	vue.SetStateSingle(pp, varSuffix)
	FileInput.Bind(":suffix", pp)
	Return Me
End Sub

'set truncate-length
Sub SetTruncateLength(varTruncateLength As String) As VMFileInput
	If varTruncateLength = "" Then Return Me
	If varTruncateLength = "22" Then Return Me
	If bStatic Then
		SetAttrSingle("truncate-length", varTruncateLength)
		Return Me
	End If
	Dim pp As String = $"${ID}TruncateLength"$
	vue.SetStateSingle(pp, varTruncateLength)
	FileInput.Bind(":truncate-length", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As String) As VMFileInput
	If varType = "" Then Return Me
	If varType = "file" Then Return Me
	If bStatic Then
		SetAttrSingle("type", varType)
		Return Me
	End If
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	FileInput.Bind(":type", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMFileInput
	If varValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("value", varValue)
		Return Me
	End If
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	FileInput.Bind(":value", pp)
	Return Me
End Sub

'set autofocus
Sub SetAutofocus(varAutofocus As Boolean) As VMFileInput
	If varAutofocus = False Then Return Me
	If bStatic Then
		SetAttrSingle("autofocus", varAutofocus)
		Return Me
	End If
	Dim pp As String = $"${ID}Autofocus"$
	vue.SetStateSingle(pp, varAutofocus)
	FileInput.Bind(":autofocus", pp)
	Return Me
End Sub

'set chips
Sub SetChips(varChips As Boolean) As VMFileInput
	If varChips = False Then Return Me
	If bStatic Then
		SetAttrSingle("chips", varChips)
		Return Me
	End If
	Dim pp As String = $"${ID}Chips"$
	vue.SetStateSingle(pp, varChips)
	FileInput.Bind(":chips", pp)
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Boolean) As VMFileInput
	If varClearable = True Then Return Me
	If bStatic Then
		SetAttrSingle("clearable", varClearable)
		Return Me
	End If
	Dim pp As String = $"${ID}Clearable"$
	vue.SetStateSingle(pp, varClearable)
	FileInput.Bind(":clearable", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMFileInput
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	FileInput.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMFileInput
	If varDense = False Then Return Me
	If bStatic Then
		SetAttrSingle("dense", varDense)
		Return Me
	End If
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	FileInput.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMFileInput
	If varDisabled = False Then Return Me
	If bStatic Then
		SetAttrSingle("disabled", varDisabled)
		Return Me
	End If
	Dim pp As String = $"${ID}Disabled"$
	vue.SetStateSingle(pp, varDisabled)
	FileInput.Bind(":disabled", pp)
	Return Me
End Sub

'set error
Sub SetError(varError As Boolean) As VMFileInput
	If varError = False Then Return Me
	If bStatic Then
		SetAttrSingle("error", varError)
		Return Me
	End If
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	FileInput.Bind(":error", pp)
	Return Me
End Sub

'set filled
Sub SetFilled(varFilled As Boolean) As VMFileInput
	If varFilled = False Then Return Me
	If bStatic Then
		SetAttrSingle("filled", varFilled)
		Return Me
	End If
	Dim pp As String = $"${ID}Filled"$
	vue.SetStateSingle(pp, varFilled)
	FileInput.Bind(":filled", pp)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Boolean) As VMFileInput
	If varFlat = False Then Return Me
	If bStatic Then
		SetAttrSingle("flat", varFlat)
		Return Me
	End If
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	FileInput.Bind(":flat", pp)
	Return Me
End Sub

'set full-width
Sub SetFullWidth(varFullWidth As Boolean) As VMFileInput
	If varFullWidth = False Then Return Me
	If bStatic Then
		SetAttrSingle("full-width", varFullWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}FullWidth"$
	vue.SetStateSingle(pp, varFullWidth)
	FileInput.Bind(":full-width", pp)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Boolean) As VMFileInput
	If varHideDetails = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-details", varHideDetails)
		Return Me
	End If
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	FileInput.Bind(":hide-details", pp)
	Return Me
End Sub

'set hide-input
Sub SetHideInput(varHideInput As Boolean) As VMFileInput
	If varHideInput = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-input", varHideInput)
		Return Me
	End If
	Dim pp As String = $"${ID}HideInput"$
	vue.SetStateSingle(pp, varHideInput)
	FileInput.Bind(":hide-input", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMFileInput
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	FileInput.Bind(":light", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Boolean) As VMFileInput
	If varLoading = False Then Return Me
	If bStatic Then
		SetAttrSingle("loading", varLoading)
		Return Me
	End If
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	FileInput.Bind(":loading", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Boolean) As VMFileInput
	If varMultiple = False Then Return Me
	If bStatic Then
		SetAttrSingle("multiple", varMultiple)
		Return Me
	End If
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	FileInput.Bind(":multiple", pp)
	Return Me
End Sub

'set outlined
Sub SetOutlined(varOutlined As Boolean) As VMFileInput
	If varOutlined = False Then Return Me
	If bStatic Then
		SetAttrSingle("outlined", varOutlined)
		Return Me
	End If
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	FileInput.Bind(":outlined", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Boolean) As VMFileInput
	If varPersistentHint = False Then Return Me
	If bStatic Then
		SetAttrSingle("persistent-hint", varPersistentHint)
		Return Me
	End If
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	FileInput.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set reverse
Sub SetReverse(varReverse As Boolean) As VMFileInput
	If varReverse = False Then Return Me
	If bStatic Then
		SetAttrSingle("reverse", varReverse)
		Return Me
	End If
	Dim pp As String = $"${ID}Reverse"$
	vue.SetStateSingle(pp, varReverse)
	FileInput.Bind(":reverse", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Boolean) As VMFileInput
	If varRounded = False Then Return Me
	If bStatic Then
		SetAttrSingle("rounded", varRounded)
		Return Me
	End If
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	FileInput.Bind(":rounded", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Boolean) As VMFileInput
	If varShaped = False Then Return Me
	If bStatic Then
		SetAttrSingle("shaped", varShaped)
		Return Me
	End If
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	FileInput.Bind(":shaped", pp)
	Return Me
End Sub

'set show-size
Sub SetShowSize(varShowSize As Boolean) As VMFileInput
	If varShowSize = False Then Return Me
	If bStatic Then
		SetAttrSingle("show-size", varShowSize)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowSize"$
	vue.SetStateSingle(pp, varShowSize)
	FileInput.Bind(":show-size", pp)
	Return Me
End Sub

'set single-line
Sub SetSingleLine(varSingleLine As Boolean) As VMFileInput
	If varSingleLine = False Then Return Me
	If bStatic Then
		SetAttrSingle("single-line", varSingleLine)
		Return Me
	End If
	Dim pp As String = $"${ID}SingleLine"$
	vue.SetStateSingle(pp, varSingleLine)
	FileInput.Bind(":single-line", pp)
	Return Me
End Sub

'set small-chips
Sub SetSmallChips(varSmallChips As Boolean) As VMFileInput
	If varSmallChips = False Then Return Me
	If bStatic Then
		SetAttrSingle("small-chips", varSmallChips)
		Return Me
	End If
	Dim pp As String = $"${ID}SmallChips"$
	vue.SetStateSingle(pp, varSmallChips)
	FileInput.Bind(":small-chips", pp)
	Return Me
End Sub

'set solo
Sub SetSolo(varSolo As Boolean) As VMFileInput
	If varSolo = False Then Return Me
	If bStatic Then
		SetAttrSingle("solo", varSolo)
		Return Me
	End If
	Dim pp As String = $"${ID}Solo"$
	vue.SetStateSingle(pp, varSolo)
	FileInput.Bind(":solo", pp)
	Return Me
End Sub

'set solo-inverted
Sub SetSoloInverted(varSoloInverted As Boolean) As VMFileInput
	If varSoloInverted = False Then Return Me
	If bStatic Then
		SetAttrSingle("solo-inverted", varSoloInverted)
		Return Me
	End If
	Dim pp As String = $"${ID}SoloInverted"$
	vue.SetStateSingle(pp, varSoloInverted)
	FileInput.Bind(":solo-inverted", pp)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Boolean) As VMFileInput
	If varSuccess = False Then Return Me
	If bStatic Then
		SetAttrSingle("success", varSuccess)
		Return Me
	End If
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	FileInput.Bind(":success", pp)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Boolean) As VMFileInput
	If varValidateOnBlur = False Then Return Me
	If bStatic Then
		SetAttrSingle("validate-on-blur", varValidateOnBlur)
		Return Me
	End If
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	FileInput.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As List) As VMFileInput
	If bStatic Then Return Me
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	FileInput.Bind(":error-messages", pp)
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As List) As VMFileInput
	If bStatic Then Return Me
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	FileInput.Bind(":messages", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As List) As VMFileInput
	If bStatic Then Return Me
	Dim pp As String = $"${ID}Rules"$
	vue.SetStateSingle(pp, varRules)
	FileInput.Bind(":rules", pp)
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As List) As VMFileInput
	If bStatic Then Return Me
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	FileInput.Bind(":success-messages", pp)
	Return Me
End Sub

'
Sub SetOnBlur(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@blur": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnChange(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim fl As Object
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(fl))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppend(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click:append": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppendOuter(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click:append-outer": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickClear(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click:clear": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrepend(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click:prepend": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrependInner(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click:prepend-inner": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnFocus(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@focus": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMFileInput
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
Sub SetOnKeydown(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@keydown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMousedown(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@mousedown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseup(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@mouseup": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateError(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'hide the component
Sub Hide As VMFileInput
	FileInput.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMFileInput
	FileInput.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMFileInput
	FileInput.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMFileInput
	FileInput.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMFileInput
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMFileInput
	FileInput.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMFileInput
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMFileInput
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	FileInput.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMFileInput
	FileInput.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMFileInput
	FileInput.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMFileInput
	FileInput.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMFileInput
	FileInput.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMFileInput
	FileInput.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMFileInput
	FileInput.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMFileInput
	FileInput.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMFileInput
	FileInput.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMFileInput
	FileInput.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMFileInput
	FileInput.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMFileInput
	FileInput.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMFileInput
	FileInput.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMFileInput
	FileInput.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMFileInput
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMFileInput
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMFileInput
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMFileInput
	FileInput.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMFileInput
	FileInput.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMFileInput
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMFileInput
	FileInput.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMFileInput
	FileInput.SetText(comp)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMFileInput
	FileInput.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMFileInput
	FileInput.SetVisible(b)
	Return Me
End Sub
