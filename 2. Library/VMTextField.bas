B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public TextField As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private password As String
	Private bStatic As Boolean
	Private bMultiple As Boolean
	Private vmodel As String
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
	bStatic = False
	vmodel = ""
	bMultiple = False
	ErrorText = ""
	TextField.fieldType = "string"
	TextField.typeOf = "textfield"
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMTextField
	vue.SetData(xprop, xValue)
	Return Me
End Sub

'add a menu after the text box
Sub AddMenuAfter(menu As VMMenu) As VMTextField
	Dim appendOuter As VMTemplate
	appendOuter.Initialize(vue, $"${ID}menuafter"$, Module)
	appendOuter.SetAttrLoose("v-slot:append-outer")
	appendOuter.AddComponent(menu.ToString)
	AddComponent(appendOuter.ToString)
	Return Me
End Sub

'add a menu after the text box
Sub AddButtonAfter(btn As VMButton) As VMTextField
	Dim appendOuter As VMTemplate
	appendOuter.Initialize(vue, $"${ID}menuafter"$, Module)
	appendOuter.SetAttrLoose("v-slot:append-outer")
	appendOuter.AddComponent(btn.ToString)
	AddComponent(appendOuter.ToString)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMTextField
	SetText(comp)
	Return Me
End Sub

Sub SetErrorText(sError As String) As VMTextField    'ignore
	ErrorText = sError
	TextField.ErrorMessage = sError
	Return Me
End Sub

Sub SetSlotActivator(b As Boolean) As VMTextField    'ignore
	SetAttrSingle("slot", "activator")
	Return Me
End Sub

'set accept
Sub SetAccept(varAccept As String) As VMTextField
	If varAccept = "" Then Return Me
	If bStatic Then
		TextField.SetAttrSingle("accept", varAccept)
		Return Me
	End If
	Dim pp As String = $"${ID}varAccept"$
	vue.SetStateSingle(pp, varAccept)
	TextField.Bind(":accept", pp)
	Return Me
End Sub

Sub SetTextArea As VMTextField
	TextField.SetTag("v-textarea")
	TextField.typeOf = "textarea"
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMTextField
	bStatic = b
	TextField.SetStatic(b)
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
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
	Else
		Dim pp As String = $"${ID}Color"$
		vue.SetStateSingle(pp, scolor)
		TextField.Bind(":color", pp)
	End If
	Return Me
End Sub


Sub SetMaxLength(varMaxLen As String) As VMTextField
	If varMaxLen = "0" Then Return Me
	If varMaxLen = "" Then Return Me
	If bStatic Then
		SetAttrSingle("maxlength", varMaxLen)
	Else
		Dim pp As String = $"${ID}varMaxLen"$
		vue.SetStateSingle(pp, varMaxLen)
		TextField.Bind(":maxlength", pp)
	End If
	Return Me
End Sub

'set required
Sub SetRequired(varRequired As Boolean) As VMTextField
	If varRequired = False Then Return Me
	TextField.SetRequired(varRequired)
	Return Me
End Sub


'get component
Sub ToString As String
	Return TextField.ToString
End Sub

Sub SetVModel(k As String) As VMTextField
	vmodel = k.tolowercase
	TextField.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMTextField
	TextField.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMTextField
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
Sub SetAppendIcon(varAppendIcon As String) As VMTextField
	If varAppendIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("append-icon", varAppendIcon)
	Else
		Dim pp As String = $"${ID}AppendIcon"$
		vue.SetStateSingle(pp, varAppendIcon)
		TextField.Bind(":append-icon", pp)
	End If
	Return Me
End Sub

'set append-outer-icon
Sub SetAppendOuterIcon(varAppendOuterIcon As String) As VMTextField
	If varAppendOuterIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("append-outer-icon", varAppendOuterIcon)
	Else
		Dim pp As String = $"${ID}AppendOuterIcon"$
		vue.SetStateSingle(pp, varAppendOuterIcon)
		TextField.Bind(":append-outer-icon", pp)
	End If
	Return Me
End Sub

'set autofocus
Sub SetAutofocus(varAutofocus As Boolean) As VMTextField
	If varAutofocus = False Then Return Me
	If bStatic Then
		SetAttrSingle("autofocus", varAutofocus)
	Else
		Dim pp As String = $"${ID}Autofocus"$
		vue.SetStateSingle(pp, varAutofocus)
		TextField.Bind(":autofocus", pp)
	End If
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As String) As VMTextField
	If varBackgroundColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("background-color", varBackgroundColor)
	Else
		Dim pp As String = $"${ID}BackgroundColor"$
		vue.SetStateSingle(pp, varBackgroundColor)
		TextField.Bind(":background-color", pp)
	End If
	Return Me
End Sub

'set clear-icon
Sub SetClearIcon(varClearIcon As String) As VMTextField
	If varClearIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("clear-icon", varClearIcon)
	Else
		Dim pp As String = $"${ID}ClearIcon"$
		vue.SetStateSingle(pp, varClearIcon)
		TextField.Bind(":clear-icon", pp)
	End If
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Boolean) As VMTextField
	If varClearable = False Then Return Me
	If bStatic Then
		SetAttrSingle("clearable", varClearable)
	Else
		Dim pp As String = $"${ID}Clearable"$
		vue.SetStateSingle(pp, varClearable)
		TextField.Bind(":clearable", pp)
	End If
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMTextField
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
	Else
		Dim pp As String = $"${ID}Color"$
		vue.SetStateSingle(pp, varColor)
		TextField.Bind(":color", pp)
	End If
	Return Me
End Sub

'set counter
Sub SetCounter(varCounter As Boolean) As VMTextField
	If varCounter = False Then Return Me
	If bStatic Then
		SetAttrSingle("counter", varCounter)
	Else
		Dim pp As String = $"${ID}Counter"$
		vue.SetStateSingle(pp, varCounter)
		TextField.Bind(":counter", pp)
	End If
	Return Me
End Sub

'set counter-value
Sub SetCounterValue(varCounterValue As String) As VMTextField
	If varCounterValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("counter-value", varCounterValue)
	Else
		Dim pp As String = $"${ID}CounterValue"$
		vue.SetStateSingle(pp, varCounterValue)
		TextField.Bind(":counter-value", pp)
	End If
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMTextField
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
	Else
		Dim pp As String = $"${ID}Dark"$
		vue.SetStateSingle(pp, varDark)
		TextField.Bind(":dark", pp)
	End If
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMTextField
	If varDense = False Then Return Me
	If bStatic Then
		SetAttrSingle("dense", varDense)
	Else
		Dim pp As String = $"${ID}Dense"$
		vue.SetStateSingle(pp, varDense)
		TextField.Bind(":dense", pp)
	End If
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMTextField
	TextField.SetDisabled(varDisabled)
	Return Me
End Sub

'set error
Sub SetError(varError As Boolean) As VMTextField
	If bStatic Then
		SetAttrSingle("error", varError)
		Return Me
	End If
	Dim pp As String = $"${vmodel}Error"$
	vue.SetBoolean(pp, varError)
	TextField.Bind(":error", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As String) As VMTextField
	If bStatic Then
		SetAttrSingle("error-count", varErrorCount)
		Return Me
	End If
	Dim pp As String = $"${vmodel}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	TextField.Bind(":error-count", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(b As Boolean) As VMTextField
	If b = False Then Return Me
	Dim nl As List = vue.NewList
	Dim pp As String = $"${vmodel}ErrorMessages"$
	vue.SetData(pp, nl)
	TextField.Bind(":error-messages", pp)
	Return Me
End Sub

'set filled
Sub SetFilled(varFilled As Boolean) As VMTextField
	If varFilled = False Then Return Me
	If bStatic Then
		SetAttrSingle("filled", varFilled)
	Else
	Dim pp As String = $"${ID}Filled"$
	vue.SetStateSingle(pp, varFilled)
	TextField.Bind(":filled", pp)
	End If
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Boolean) As VMTextField
	If varFlat = False Then Return Me
	If bStatic Then
		SetAttrSingle("flat", varFlat)
	Else
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	TextField.Bind(":flat", pp)
	End If
	Return Me
End Sub

'set full-width
Sub SetFullWidth(varFullWidth As Boolean) As VMTextField
	If varFullWidth = False Then Return Me
	If bStatic Then
		SetAttrSingle("full-width", varFullWidth)
	Else
	Dim pp As String = $"${ID}FullWidth"$
	vue.SetStateSingle(pp, varFullWidth)
	TextField.Bind(":full-width", pp)
	End If
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMTextField
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
	Else
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	TextField.Bind(":height", pp)
	End If
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Boolean) As VMTextField
	If varHideDetails = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-details", varHideDetails)
	Else
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	TextField.Bind(":hide-details", pp)
	End If
	Return Me
End Sub

'set hint
Sub SetHint(varHint As String) As VMTextField
	If varHint = "" Then Return Me
	If bStatic Then
		SetAttrSingle("hint", varHint)
	Else
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	TextField.Bind(":hint", pp)
	End If
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As String) As VMTextField
	If varLabel = "" Then Return Me
	If bStatic Then
		SetAttrSingle("label", varLabel)
	Else
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	TextField.Bind(":label", pp)
	End If
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMTextField
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
	Else
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	TextField.Bind(":light", pp)
	End If
	Return Me
End Sub

'set loader-height
Sub SetLoaderHeight(varLoaderHeight As String) As VMTextField
	If varLoaderHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("loader-height", varLoaderHeight)
	Else
	Dim pp As String = $"${ID}LoaderHeight"$
	vue.SetStateSingle(pp, varLoaderHeight)
	TextField.Bind(":loader-height", pp)
	End If
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Boolean) As VMTextField
	If varLoading = False Then Return Me
	If bStatic Then
		SetAttrSingle("loading", varLoading)
	Else
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	TextField.Bind(":loading", pp)
	End If
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMTextField
	If bStatic Then
		SetAttrSingle("messages", varMessages)
	Else
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	TextField.Bind(":messages", pp)
	End If
	Return Me
End Sub

'set outlined
Sub SetOutlined(varOutlined As Boolean) As VMTextField
	If varOutlined = False Then Return Me
	If bStatic Then
		SetAttrSingle("outlined", varOutlined)
	Else
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	TextField.Bind(":outlined", pp)
	End If
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Boolean) As VMTextField
	If varPersistentHint = False Then Return Me
	If bStatic Then
		SetAttrSingle("persistent-hint", varPersistentHint)
	Else
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	TextField.Bind(":persistent-hint", pp)
	End If
	Return Me
End Sub

'set placeholder
Sub SetPlaceholder(varPlaceholder As String) As VMTextField
	If varPlaceholder = "" Then Return Me
	If bStatic Then
		SetAttrSingle("placeholder", varPlaceholder)
	Else
	Dim pp As String = $"${ID}Placeholder"$
	vue.SetStateSingle(pp, varPlaceholder)
	TextField.Bind(":placeholder", pp)
	End If
	Return Me
End Sub



'set prefix
Sub SetPrefix(varPrefix As String) As VMTextField
	If varPrefix = "" Then Return Me
	If bStatic Then
		SetAttrSingle("prefix", varPrefix)
	Else
	Dim pp As String = $"${ID}Prefix"$
	vue.SetStateSingle(pp, varPrefix)
	TextField.Bind(":prefix", pp)
	End If
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As String) As VMTextField
	If varPrependIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("prepend-icon", varPrependIcon)
	Else
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	TextField.Bind(":prepend-icon", pp)
	End If
	Return Me
End Sub

'set prepend-inner-icon
Sub SetPrependInnerIcon(varPrependInnerIcon As String) As VMTextField
	If varPrependInnerIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("prepend-inner-icon", varPrependInnerIcon)
	Else
	Dim pp As String = $"${ID}PrependInnerIcon"$
	vue.SetStateSingle(pp, varPrependInnerIcon)
	TextField.Bind(":prepend-inner-icon", pp)
	End If
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Boolean) As VMTextField
	If bStatic Then
		SetAttrSingle("readonly", varReadonly)
	Else
		Dim pp As String = $"${ID}Readonly"$
		vue.SetStateSingle(pp, varReadonly)
		TextField.Bind(":readonly", pp)
	End If
	Return Me
End Sub

'set reverse
Sub SetReverse(varReverse As Boolean) As VMTextField
	If varReverse = False Then Return Me
	If bStatic Then
		SetAttrSingle("reverse", varReverse)
	Else
	Dim pp As String = $"${ID}Reverse"$
	vue.SetStateSingle(pp, varReverse)
	TextField.Bind(":reverse", pp)
	End If
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Boolean) As VMTextField
	If varRounded = False Then Return Me
	If bStatic Then
		SetAttrSingle("rounded", varRounded)
	Else
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	TextField.Bind(":rounded", pp)
	End If
	Return Me
End Sub

'set rules
Sub SetRules(b As Boolean) As VMTextField
	If b = False Then Return Me
	If bStatic Then Return Me
	If DesignMode Then Return Me
	Dim pp As String = $"${vmodel}rules"$
	TextField.Bind(":rules", pp)
	vue.SetData(pp, vue.NewList)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Boolean) As VMTextField
	If varShaped = False Then Return Me
	If bStatic Then
		SetAttrSingle("shaped", varShaped)
	Else
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	TextField.Bind(":shaped", pp)
	End If
	Return Me
End Sub

'set single-line
Sub SetSingleLine(varSingleLine As Boolean) As VMTextField
	If varSingleLine = False Then Return Me
	If bStatic Then
		SetAttrSingle("single-line", varSingleLine)
	Else
	Dim pp As String = $"${ID}SingleLine"$
	vue.SetStateSingle(pp, varSingleLine)
	TextField.Bind(":single-line", pp)
	End If
	Return Me
End Sub

'set solo
Sub SetSolo(varSolo As Boolean) As VMTextField
	If varSolo = False Then Return Me
	If bStatic Then
		SetAttrSingle("solo", varSolo)
	Else
	Dim pp As String = $"${ID}Solo"$
	vue.SetStateSingle(pp, varSolo)
	TextField.Bind(":solo", pp)
	End If
	Return Me
End Sub

'set solo-inverted
Sub SetSoloInverted(varSoloInverted As Boolean) As VMTextField
	If varSoloInverted = False Then Return Me
	If bStatic Then
		SetAttrSingle("solo-inverted", varSoloInverted)
	Else
	Dim pp As String = $"${ID}SoloInverted"$
	vue.SetStateSingle(pp, varSoloInverted)
	TextField.Bind(":solo-inverted", pp)
	End If
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Boolean) As VMTextField
	If varSuccess = False Then Return Me
	If bStatic Then
		SetAttrSingle("success", varSuccess)
	Else
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	TextField.Bind(":success", pp)
	End If
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMTextField
	If bStatic Then
		SetAttrSingle("success-messages", varSuccessMessages)
	Else
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	TextField.Bind(":success-messages", pp)
	End If
	Return Me
End Sub

'set suffix
Sub SetSuffix(varSuffix As String) As VMTextField
	If varSuffix = "" Then Return Me
	If bStatic Then
		SetAttrSingle("suffix", varSuffix)
	Else
	Dim pp As String = $"${ID}Suffix"$
	vue.SetStateSingle(pp, varSuffix)
	TextField.Bind(":suffix", pp)
	End If
	Return Me
End Sub

'set type
Sub SetType(varType As String) As VMTextField
	If varType = "" Then Return Me
	If bStatic Then
		SetAttrSingle("type", varType)
	Else
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	TextField.Bind(":type", pp)
	End If
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Boolean) As VMTextField
	If varValidateOnBlur = False Then Return Me
	If bStatic Then
		SetAttrSingle("validate-on-blur", varValidateOnBlur)
		Return Me
	End If
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetBoolean(pp, varValidateOnBlur)
	TextField.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMTextField
	TextField.SetValue(varValue,False)
	vue.SetData(vmodel, varValue)
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
Sub SetOnBlur(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@blur": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnChange(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnFile(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim fileList As Object
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(fileList))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClick(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, array(e))
	SetAttr(CreateMap("@click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppend(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@click:append": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppendOuter(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@click:append-outer": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickClear(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@click:clear": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrepend(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@click:prepend": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrependInner(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@click:prepend-inner": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnFocus(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@focus": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnKeydown(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@keydown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnKeydownEnter(eventHandler As Object, methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@keydown.enter": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'
Sub SetOnMousedown(methodName As String) As VMTextField
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
Sub SetOnMouseup(methodName As String) As VMTextField
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
Sub SetOnUpdateError(methodName As String) As VMTextField
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:error": methodName))
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

Sub SetFieldType(ftype As String) As VMTextField
	TextField.fieldType = ftype
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

'set color intensity
Sub SetTextColor(varColor As String) As VMTextField
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMTextField
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub

'set auto-grow
Sub SetAutoGrow(varAutoGrow As Boolean) As VMTextField
	If varAutoGrow = False Then Return Me
	If bStatic Then
		TextField.SetAttrSingle("auto-grow", varAutoGrow)
		Return Me
	End If
	Dim pp As String = $"${ID}AutoGrow"$
	vue.SetStateSingle(pp, varAutoGrow)
	TextField.Bind(":auto-grow", pp)
	Return Me
End Sub

'set no-resize
Sub SetNoResize(varNoResize As Boolean) As VMTextField
	If varNoResize = False Then Return Me
	If bStatic Then
		TextField.SetAttrSingle("no-resize", varNoResize)
		Return Me
	End If
	Dim pp As String = $"${ID}NoResize"$
	vue.SetStateSingle(pp, varNoResize)
	TextField.Bind(":no-resize", pp)
	Return Me
End Sub

'set row-height
Sub SetRowHeight(varRowHeight As String) As VMTextField
	If varRowHeight = "" Then Return Me
	If bStatic Then
		TextField.SetAttrSingle(":row-height", varRowHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}RowHeight"$
	vue.SetStateSingle(pp, varRowHeight)
	TextField.Bind(":row-height", pp)
	Return Me
End Sub

'set rows
Sub SetRows(varRows As String) As VMTextField
	If varRows = "" Then Return Me
	If bStatic Then
		TextField.SetAttrSingle("rows", varRows)
		Return Me
	End If
	Dim pp As String = $"${ID}Rows"$
	vue.SetStateSingle(pp, varRows)
	TextField.Bind(":rows", pp)
	Return Me
End Sub

'set success-message
Sub SetSuccessMessage(varSuccessMessage As Object) As VMTextField
	Dim pp As String = $"${ID}SuccessMessage"$
	vue.SetStateSingle(pp, varSuccessMessage)
	TextField.Bind(":success-message", pp)
	Return Me
End Sub


'set background-color
Sub SetBackgroundColorIntensity(varBackgroundColor As Object, varIntensity As String) As VMTextField
	Dim scolor As String = $"${varBackgroundColor} ${varIntensity}"$
	If varBackgroundColor = "" And varIntensity = "" Then Return Me
	If bStatic Then
		TextField.SetAttrSingle("background-color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, scolor)
	TextField.Bind(":background-color", pp)
	Return Me
End Sub

'set chips
Sub SetChips(varChips As Boolean) As VMTextField
	If varChips = False Then Return Me
	If bStatic Then
		TextField.SetAttrSingle("chips", varChips)
		Return Me
	End If	
	Dim pp As String = $"${ID}Chips"$
	vue.SetStateSingle(pp, varChips)
	TextField.Bind(":chips", pp)
	Return Me
End Sub

'set counter-size-string
Sub SetCounterSizeString(varCounterSizeString As String) As VMTextField
	If varCounterSizeString = "" Then Return Me
	TextField.SetAttrSingle(":counter-size-string", varCounterSizeString)
	Return Me
End Sub

'set counter-string
Sub SetCounterString(varCounterString As String) As VMTextField
	If varCounterString = "" Then Return Me
	TextField.SetAttrSingle(":counter-string", varCounterString)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Boolean) As VMTextField
	If varMultiple = False Then Return Me
	If bStatic Then
		TextField.SetAttrSingle("multiple", varMultiple)
		Return Me
	End If
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	TextField.Bind(":multiple", pp)
	bMultiple = varMultiple
	Return Me
End Sub

'set show-size
Sub SetShowSize(varShowSize As Boolean) As VMTextField
	If varShowSize = False Then Return Me
	If bStatic Then
		TextField.Bind("show-size", varShowSize)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowSize"$
	vue.SetStateSingle(pp, varShowSize)
	TextField.Bind(":show-size", pp)
	Return Me
End Sub

'set small-chips
Sub SetSmallChips(varSmallChips As Boolean) As VMTextField
	If varSmallChips = False Then Return Me
	If bStatic Then
		TextField.SetAttrSingle("small-chips", varSmallChips)
		Return Me
	End If
	Dim pp As String = $"${ID}SmallChips"$
	vue.SetStateSingle(pp, varSmallChips)
	TextField.Bind(":small-chips", pp)
	Return Me
End Sub

'set truncate-length
Sub SetTruncateLength(varTruncateLength As Boolean) As VMTextField
	If varTruncateLength = False Then Return Me
	If bStatic Then
		TextField.SetAttrSingle(":truncate-length", varTruncateLength)
		Return Me
	End If
	Dim pp As String = $"${ID}TruncateLength"$
	vue.SetStateSingle(pp, varTruncateLength)
	TextField.Bind(":truncate-length", pp)
	Return Me
End Sub

Sub SetSlotSelection(b As Boolean) As VMTextField    'ignore
	SetAttr(CreateMap("slot": "selection"))
	Return Me
End Sub

Sub SetWidth(w As String) As VMTextField
	If w = "" Then Return Me
	TextField.SetStyleSingle("width", w)
	Return Me
End Sub
