B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TextField As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private password As String
	Public ErrorText As String
End Sub

'initialize the TextField
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTextField
	ID = sid.tolowercase
	TextField.Initialize(v, ID)
	TextField.SetTag("v-text-field")
	DesignMode = False
	Module = eventHandler
	vue = v
	password = $"${ID}password"$
	Return Me
End Sub

'this textbox accepts passwords
Sub SetPassword(b As Boolean, toggle As Boolean) As VMTextField
	vue.SetData(password, False)
	Dim sline As String = $"${password} ? 'mdi-eye' : 'mdi-eye-off'"$
	If toggle Then TextField.Bind(":append-icon", sline)
	TextField.Bind(":type", $"${password} ? 'text' : 'password'"$)
	If toggle Then TextField.SetAttrSingle("@click:append", $"${password} = !${password}"$)
	TextField.typeOf = "password"
	Return Me
End Sub

Sub SetTypeNumber(b As Boolean) As VMTextField
	SetType("number")
	Return Me
End Sub

Sub SetTypeEmail(b As Boolean) As VMTextField
	SetType("email")
	Return Me
End Sub

Sub SetTypePassword(b As Boolean) As VMTextField
	SetType("password")
	Return Me
End Sub

Sub SetTypeText(b As Boolean) As VMTextField
	SetType("text")
	Return Me
End Sub

Sub SetTypeDate(b As Boolean) As VMTextField
	SetType("date")
	Return Me
End Sub

'backward compatibility
Sub SetInvalidMessage(ErrText As String) As VMTextField
	ErrorText = ErrText
	Return Me
End Sub

Sub SetErrorText(errText As String) As VMTextField
	ErrorText = errText
	Return Me
End Sub

Sub SetEmail As VMTextField
	TextField.typeOf = "email"
	TextField.InputType = "email"
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMTextField
	TextField.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMTextField
	TextField.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMTextField
	TextField.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMTextField
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetTel As VMTextField
	TextField.typeOf = "tel"
	TextField.InputType = "tel"
	Return Me
End Sub


Sub SetAttributes(attrs As List) As VMTextField
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMTextField
	TextField.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMTextField
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMTextField
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	TextField.Bind(":color", pp)
	Return Me
End Sub


Sub SetMaxLength(varMaxLen As String) As VMTextField
	Dim pp As String = $"${ID}varMaxLen"$
	vue.SetStateSingle(pp, varMaxLen)
	TextField.Bind(":maxlength", pp)
	Return Me
End Sub

'set required
Sub SetRequired(varRequired As Boolean) As VMTextField
	TextField.SetRequired(varRequired)
	Return Me
End Sub


'get component
Sub ToString As String
	Return TextField.ToString
End Sub

Sub SetVModel(k As String) As VMTextField
	TextField.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTextField
	TextField.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTextField
	TextField.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTextField
	Dim childHTML As String = child.ToString
	TextField.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTextField
	TextField.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTextField
	TextField.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTextField
	TextField.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTextField
	TextField.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As Object) As VMTextField
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	TextField.Bind(":append-icon", pp)
	Return Me
End Sub

'set append-outer-icon
Sub SetAppendOuterIcon(varAppendOuterIcon As Object) As VMTextField
	Dim pp As String = $"${ID}AppendOuterIcon"$
	vue.SetStateSingle(pp, varAppendOuterIcon)
	TextField.Bind(":append-outer-icon", pp)
	Return Me
End Sub

'set autofocus
Sub SetAutofocus(varAutofocus As Object) As VMTextField
	Dim pp As String = $"${ID}Autofocus"$
	vue.SetStateSingle(pp, varAutofocus)
	TextField.Bind(":autofocus", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMTextField
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	TextField.Bind(":background-color", pp)
	Return Me
End Sub

'set clear-icon
Sub SetClearIcon(varClearIcon As Object) As VMTextField
	Dim pp As String = $"${ID}ClearIcon"$
	vue.SetStateSingle(pp, varClearIcon)
	TextField.Bind(":clear-icon", pp)
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Object) As VMTextField
	Dim pp As String = $"${ID}Clearable"$
	vue.SetStateSingle(pp, varClearable)
	TextField.Bind(":clearable", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMTextField
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	TextField.Bind(":color", pp)
	Return Me
End Sub

'set counter
Sub SetCounter(varCounter As Object) As VMTextField
	Dim pp As String = $"${ID}Counter"$
	vue.SetStateSingle(pp, varCounter)
	TextField.Bind(":counter", pp)
	Return Me
End Sub

'set counter-value
Sub SetCounterValue(varCounterValue As Object) As VMTextField
	Dim pp As String = $"${ID}CounterValue"$
	vue.SetStateSingle(pp, varCounterValue)
	TextField.Bind(":counter-value", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMTextField
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	TextField.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMTextField
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	TextField.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMTextField
	TextField.SetDisabled(varDisabled)
	Return Me
End Sub

'set error
Sub SetError(varError As Object) As VMTextField
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	TextField.Bind(":error", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMTextField
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	TextField.Bind(":error-count", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMTextField
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	TextField.Bind(":error-messages", pp)
	Return Me
End Sub

'set filled
Sub SetFilled(varFilled As Object) As VMTextField
	Dim pp As String = $"${ID}Filled"$
	vue.SetStateSingle(pp, varFilled)
	TextField.Bind(":filled", pp)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Object) As VMTextField
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	TextField.Bind(":flat", pp)
	Return Me
End Sub

'set full-width
Sub SetFullWidth(varFullWidth As Object) As VMTextField
	Dim pp As String = $"${ID}FullWidth"$
	vue.SetStateSingle(pp, varFullWidth)
	TextField.Bind(":full-width", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMTextField
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	TextField.Bind(":height", pp)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Object) As VMTextField
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	TextField.Bind(":hide-details", pp)
	Return Me
End Sub

'set hint
Sub SetHint(varHint As Object) As VMTextField
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	TextField.Bind(":hint", pp)
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMTextField
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	TextField.Bind(":id", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMTextField
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	TextField.Bind(":label", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMTextField
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	TextField.Bind(":light", pp)
	Return Me
End Sub

'set loader-height
Sub SetLoaderHeight(varLoaderHeight As Object) As VMTextField
	Dim pp As String = $"${ID}LoaderHeight"$
	vue.SetStateSingle(pp, varLoaderHeight)
	TextField.Bind(":loader-height", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMTextField
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	TextField.Bind(":loading", pp)
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMTextField
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	TextField.Bind(":messages", pp)
	Return Me
End Sub

'set outlined
Sub SetOutlined(varOutlined As Object) As VMTextField
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	TextField.Bind(":outlined", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Object) As VMTextField
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	TextField.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set placeholder
Sub SetPlaceholder(varPlaceholder As Object) As VMTextField
	Dim pp As String = $"${ID}Placeholder"$
	vue.SetStateSingle(pp, varPlaceholder)
	TextField.Bind(":placeholder", pp)
	Return Me
End Sub



'set prefix
Sub SetPrefix(varPrefix As Object) As VMTextField
	Dim pp As String = $"${ID}Prefix"$
	vue.SetStateSingle(pp, varPrefix)
	TextField.Bind(":prefix", pp)
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As Object) As VMTextField
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	TextField.Bind(":prepend-icon", pp)
	Return Me
End Sub

'set prepend-inner-icon
Sub SetPrependInnerIcon(varPrependInnerIcon As Object) As VMTextField
	Dim pp As String = $"${ID}PrependInnerIcon"$
	vue.SetStateSingle(pp, varPrependInnerIcon)
	TextField.Bind(":prepend-inner-icon", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMTextField
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	TextField.Bind(":readonly", pp)
	Return Me
End Sub

'set reverse
Sub SetReverse(varReverse As Object) As VMTextField
	Dim pp As String = $"${ID}Reverse"$
	vue.SetStateSingle(pp, varReverse)
	TextField.Bind(":reverse", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Object) As VMTextField
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	TextField.Bind(":rounded", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMTextField
	Dim pp As String = $"${ID}Rules"$
	vue.SetStateSingle(pp, varRules)
	TextField.Bind(":rules", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Object) As VMTextField
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	TextField.Bind(":shaped", pp)
	Return Me
End Sub

'set single-line
Sub SetSingleLine(varSingleLine As Object) As VMTextField
	Dim pp As String = $"${ID}SingleLine"$
	vue.SetStateSingle(pp, varSingleLine)
	TextField.Bind(":single-line", pp)
	Return Me
End Sub

'set solo
Sub SetSolo(varSolo As Object) As VMTextField
	Dim pp As String = $"${ID}Solo"$
	vue.SetStateSingle(pp, varSolo)
	TextField.Bind(":solo", pp)
	Return Me
End Sub

'set solo-inverted
Sub SetSoloInverted(varSoloInverted As Object) As VMTextField
	Dim pp As String = $"${ID}SoloInverted"$
	vue.SetStateSingle(pp, varSoloInverted)
	TextField.Bind(":solo-inverted", pp)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Object) As VMTextField
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	TextField.Bind(":success", pp)
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMTextField
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	TextField.Bind(":success-messages", pp)
	Return Me
End Sub

'set suffix
Sub SetSuffix(varSuffix As Object) As VMTextField
	Dim pp As String = $"${ID}Suffix"$
	vue.SetStateSingle(pp, varSuffix)
	TextField.Bind(":suffix", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As Object) As VMTextField
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	TextField.Bind(":type", pp)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Object) As VMTextField
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	TextField.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMTextField
	TextField.SetAttrSingle("value", varValue)
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMTextField    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotAppendOuter(b As Boolean) As VMTextField    'ignore
	SetAttr(CreateMap("slot": "append-outer"))
	Return Me
End Sub

'
Sub SetSlotLabel(b As Boolean) As VMTextField    'ignore
	SetAttr(CreateMap("slot": "label"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As Boolean) As VMTextField    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As Boolean) As VMTextField    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetSlotPrependInner(b As Boolean) As VMTextField    'ignore
	SetAttr(CreateMap("slot": "prepend-inner"))
	Return Me
End Sub

'
Sub SetSlotProgress(b As Boolean) As VMTextField    'ignore
	SetAttr(CreateMap("slot": "progress"))
	Return Me
End Sub

'
Sub SetOnBlur(methodName As String) As VMTextField
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
Sub SetOnChange(methodName As String) As VMTextField
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
Sub SetOnClick(methodName As String) As VMTextField
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
Sub SetOnClickAppend(methodName As String) As VMTextField
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
Sub SetOnClickAppendOuter(methodName As String) As VMTextField
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
Sub SetOnClickClear(methodName As String) As VMTextField
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
Sub SetOnClickPrepend(methodName As String) As VMTextField
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
Sub SetOnClickPrependInner(methodName As String) As VMTextField
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
Sub SetOnFocus(methodName As String) As VMTextField
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
Sub SetOnInput(methodName As String) As VMTextField
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
Sub SetOnKeydown(methodName As String) As VMTextField
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
Sub SetOnMousedown(methodName As String) As VMTextField
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
Sub SetOnMouseup(methodName As String) As VMTextField
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
Sub SetOnUpdateError(methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub Hide As VMTextField
	TextField.SetVisible(False)
	Return Me
End Sub

Sub Show As VMTextField
	TextField.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMTextField
	TextField.Enable(True)
	Return Me
End Sub

Sub Disable As VMTextField
	TextField.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMTextField
	TextField.Bind(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMTextField
	TextField.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMTextField
	TextField.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMTextField
	TextField.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMTextField
	TextField.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMTextField
	TextField.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMTextField
	TextField.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMTextField
	TextField.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMTextField
	TextField.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMTextField
TextField.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetDouble As VMTextField
	TextField.fieldType = "dbl"
	Return Me
End Sub

Sub SetString As VMTextField
	TextField.fieldType = "string"
	Return Me
End Sub

Sub SetNumber As VMTextField
	TextField.typeOf = "number"
	Return Me
End Sub

Sub SetBool As VMTextField
	TextField.fieldType = "bool"
	Return Me
End Sub

Sub SetInt As VMTextField
	TextField.fieldType = "int"
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMTextField
TextField.SetVisible(b)
Return Me
End Sub