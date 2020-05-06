B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public FileInput As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private ErrorText As String
	Private targetVModel As String
	Private numFiles As Int
	Private totFiles As Int
	Private fd As List
	Private bMultiple As Boolean
	Private vmodel As String
End Sub

'initialize the FileInput
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMFileInput
	ID = sid.tolowercase
	FileInput.Initialize(v, ID)
	FileInput.SetTag("v-file-input")
	DesignMode = False
	Module = eventHandler
	vue = v
	ErrorText = ""
	SetOnChange(Me, "change")
	bMultiple = False
	vmodel = ""
	Return Me
End Sub

'the list of files have changed
Sub change(fileList As List)
	numFiles = 0
	fd.Initialize 		
	Select Case bMultiple
	Case True	
		totFiles = fileList.Size
		'upload the files to the server	
		For Each fileObj As Object In fileList
			vue.HTTPUpload(fileObj, Me, "filedone")
		Next	
	Case Else
		totFiles = 1
		vue.HTTPUpload(fileList, Me, "filedone")
	End Select	
End Sub

Sub filedone(fileObj As Map, json As String)
	numFiles = numFiles + 1
	Dim fde As FileObject = vue.GetFileDetails(fileObj)
	fd.Add(fde)
	If numFiles = totFiles Then
		vue.SetData(vmodel, fd)
		If SubExists(Module, $"${ID}_change"$) = False Then Return
		BANano.CallSub(Module, $"${ID}_change"$, Array(fd))
	End If
End Sub

'backward compatibility
Sub SetInvalidMessage(ErrText As String) As VMFileInput
	ErrorText = ErrText
	Return Me
End Sub

Sub SetErrorText(error As String) As VMFileInput
	ErrorText = error
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

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMFileInput
	FileInput.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMFileInput
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMFileInput
	FileInput.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMFileInput
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub AcceptImages As VMFileInput
	SetAccept("image/*")
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
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMFileInput
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	FileInput.Bind(":color", pp)
	Return Me
End Sub

'set accept
Sub SetAccept(varAccept As Object) As VMFileInput
	Dim pp As String = $"${ID}varAccept"$
	vue.SetStateSingle(pp, varAccept)
	FileInput.Bind(":accept", pp)
	Return Me
End Sub

'get component
Sub ToString As String
	RemoveAttr("v-model")
	Return FileInput.ToString
End Sub

Sub SetVModel(k As String) As VMFileInput
	vmodel = k.tolowercase
	FileInput.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMFileInput
	FileInput.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMFileInput
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

'set text
Sub SetText(t As Object) As VMFileInput
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
Sub SetAppendIcon(varAppendIcon As Object) As VMFileInput
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	FileInput.Bind(":append-icon", pp)
	Return Me
End Sub

'set append-outer-icon
Sub SetAppendOuterIcon(varAppendOuterIcon As Object) As VMFileInput
	Dim pp As String = $"${ID}AppendOuterIcon"$
	vue.SetStateSingle(pp, varAppendOuterIcon)
	FileInput.Bind(":append-outer-icon", pp)
	Return Me
End Sub

'set autofocus
Sub SetAutofocus(varAutofocus As Object) As VMFileInput
	Dim pp As String = $"${ID}Autofocus"$
	vue.SetStateSingle(pp, varAutofocus)
	FileInput.Bind(":autofocus", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMFileInput
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	FileInput.Bind(":background-color", pp)
	Return Me
End Sub

'set chips
Sub SetChips(varChips As Object) As VMFileInput
	Dim pp As String = $"${ID}Chips"$
	vue.SetStateSingle(pp, varChips)
	FileInput.Bind(":chips", pp)
	Return Me
End Sub

'set clear-icon
Sub SetClearIcon(varClearIcon As Object) As VMFileInput
	Dim pp As String = $"${ID}ClearIcon"$
	vue.SetStateSingle(pp, varClearIcon)
	FileInput.Bind(":clear-icon", pp)
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Object) As VMFileInput
	Dim pp As String = $"${ID}Clearable"$
	vue.SetStateSingle(pp, varClearable)
	FileInput.Bind(":clearable", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMFileInput
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	FileInput.Bind(":color", pp)
	Return Me
End Sub

'set counter
Sub SetCounter(varCounter As Object) As VMFileInput
	Dim pp As String = $"${ID}Counter"$
	vue.SetStateSingle(pp, varCounter)
	FileInput.Bind(":counter", pp)
	Return Me
End Sub

'set counter-size-string
Sub SetCounterSizeString(varCounterSizeString As Object) As VMFileInput
	Dim pp As String = $"${ID}CounterSizeString"$
	vue.SetStateSingle(pp, varCounterSizeString)
	FileInput.Bind(":counter-size-string", pp)
	Return Me
End Sub

'set counter-string
Sub SetCounterString(varCounterString As Object) As VMFileInput
	Dim pp As String = $"${ID}CounterString"$
	vue.SetStateSingle(pp, varCounterString)
	FileInput.Bind(":counter-string", pp)
	Return Me
End Sub

'set counter-value
Sub SetCounterValue(varCounterValue As Object) As VMFileInput
	Dim pp As String = $"${ID}CounterValue"$
	vue.SetStateSingle(pp, varCounterValue)
	FileInput.Bind(":counter-value", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMFileInput
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	FileInput.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMFileInput
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	FileInput.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMFileInput
	FileInput.SetDisabled(varDisabled)
	Return Me
End Sub

'set error
Sub SetError(varError As Object) As VMFileInput
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	FileInput.Bind(":error", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMFileInput
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	FileInput.Bind(":error-count", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMFileInput
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	FileInput.Bind(":error-messages", pp)
	Return Me
End Sub

'set filled
Sub SetFilled(varFilled As Object) As VMFileInput
	Dim pp As String = $"${ID}Filled"$
	vue.SetStateSingle(pp, varFilled)
	FileInput.Bind(":filled", pp)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Object) As VMFileInput
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	FileInput.Bind(":flat", pp)
	Return Me
End Sub

'set full-width
Sub SetFullWidth(varFullWidth As Object) As VMFileInput
	Dim pp As String = $"${ID}FullWidth"$
	vue.SetStateSingle(pp, varFullWidth)
	FileInput.Bind(":full-width", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMFileInput
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	FileInput.Bind(":height", pp)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Boolean) As VMFileInput
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	FileInput.Bind(":hide-details", pp)
	Return Me
End Sub

'set hint
Sub SetHint(varHint As Object) As VMFileInput
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	FileInput.Bind(":hint", pp)
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMFileInput
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	FileInput.Bind(":id", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMFileInput
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	FileInput.Bind(":label", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMFileInput
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	FileInput.Bind(":light", pp)
	Return Me
End Sub

'set loader-height
Sub SetLoaderHeight(varLoaderHeight As Object) As VMFileInput
	Dim pp As String = $"${ID}LoaderHeight"$
	vue.SetStateSingle(pp, varLoaderHeight)
	FileInput.Bind(":loader-height", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMFileInput
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	FileInput.Bind(":loading", pp)
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMFileInput
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	FileInput.Bind(":messages", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Boolean) As VMFileInput
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	FileInput.Bind(":multiple", pp)
	bMultiple = varMultiple
	Return Me
End Sub

'set outlined
Sub SetOutlined(varOutlined As Object) As VMFileInput
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	FileInput.Bind(":outlined", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Object) As VMFileInput
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	FileInput.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set placeholder
Sub SetPlaceholder(varPlaceholder As Object) As VMFileInput
	Dim pp As String = $"${ID}Placeholder"$
	vue.SetStateSingle(pp, varPlaceholder)
	FileInput.Bind(":placeholder", pp)
	Return Me
End Sub

'set prefix
Sub SetPrefix(varPrefix As Object) As VMFileInput
	Dim pp As String = $"${ID}Prefix"$
	vue.SetStateSingle(pp, varPrefix)
	FileInput.Bind(":prefix", pp)
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As Object) As VMFileInput
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	FileInput.Bind(":prepend-icon", pp)
	Return Me
End Sub

'set prepend-inner-icon
Sub SetPrependInnerIcon(varPrependInnerIcon As Object) As VMFileInput
	Dim pp As String = $"${ID}PrependInnerIcon"$
	vue.SetStateSingle(pp, varPrependInnerIcon)
	FileInput.Bind(":prepend-inner-icon", pp)
	Return Me
End Sub

'set reverse
Sub SetReverse(varReverse As Object) As VMFileInput
	Dim pp As String = $"${ID}Reverse"$
	vue.SetStateSingle(pp, varReverse)
	FileInput.Bind(":reverse", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Object) As VMFileInput
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	FileInput.Bind(":rounded", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMFileInput
	Dim pp As String = $"${ID}Rules"$
	vue.SetStateSingle(pp, varRules)
	FileInput.Bind(":rules", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Object) As VMFileInput
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	FileInput.Bind(":shaped", pp)
	Return Me
End Sub

'set show-size
Sub SetShowSize(varShowSize As Object) As VMFileInput
	Dim pp As String = $"${ID}ShowSize"$
	vue.SetStateSingle(pp, varShowSize)
	FileInput.Bind(":show-size", pp)
	Return Me
End Sub

'set single-line
Sub SetSingleLine(varSingleLine As Object) As VMFileInput
	Dim pp As String = $"${ID}SingleLine"$
	vue.SetStateSingle(pp, varSingleLine)
	FileInput.Bind(":single-line", pp)
	Return Me
End Sub

'set small-chips
Sub SetSmallChips(varSmallChips As Object) As VMFileInput
	Dim pp As String = $"${ID}SmallChips"$
	vue.SetStateSingle(pp, varSmallChips)
	FileInput.Bind(":small-chips", pp)
	Return Me
End Sub

'set solo
Sub SetSolo(varSolo As Object) As VMFileInput
	Dim pp As String = $"${ID}Solo"$
	vue.SetStateSingle(pp, varSolo)
	FileInput.Bind(":solo", pp)
	Return Me
End Sub

'set solo-inverted
Sub SetSoloInverted(varSoloInverted As Object) As VMFileInput
	Dim pp As String = $"${ID}SoloInverted"$
	vue.SetStateSingle(pp, varSoloInverted)
	FileInput.Bind(":solo-inverted", pp)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Object) As VMFileInput
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	FileInput.Bind(":success", pp)
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMFileInput
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	FileInput.Bind(":success-messages", pp)
	Return Me
End Sub

'set suffix
Sub SetSuffix(varSuffix As Object) As VMFileInput
	Dim pp As String = $"${ID}Suffix"$
	vue.SetStateSingle(pp, varSuffix)
	FileInput.Bind(":suffix", pp)
	Return Me
End Sub

'set truncate-length
Sub SetTruncateLength(varTruncateLength As Object) As VMFileInput
	Dim pp As String = $"${ID}TruncateLength"$
	vue.SetStateSingle(pp, varTruncateLength)
	FileInput.Bind(":truncate-length", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As Object) As VMFileInput
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	FileInput.Bind(":type", pp)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Object) As VMFileInput
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	FileInput.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMFileInput
	SetAttrSingle("value", varValue)
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMFileInput    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotAppendOuter(b As Boolean) As VMFileInput    'ignore
	SetAttr(CreateMap("slot": "append-outer"))
	Return Me
End Sub

'
Sub SetSlotLabel(b As Boolean) As VMFileInput    'ignore
	SetAttr(CreateMap("slot": "label"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As Boolean) As VMFileInput    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As Boolean) As VMFileInput    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetSlotPrependInner(b As Boolean) As VMFileInput    'ignore
	SetAttr(CreateMap("slot": "prepend-inner"))
	Return Me
End Sub

'
Sub SetSlotProgress(b As Boolean) As VMFileInput    'ignore
	SetAttr(CreateMap("slot": "progress"))
	Return Me
End Sub

'
Sub SetSlotSelection(b As Boolean) As VMFileInput    'ignore
	SetAttr(CreateMap("slot": "selection"))
	Return Me
End Sub

'
Sub SetOnBlur(methodName As String) As VMFileInput
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
Sub SetOnChange(eventHandler As Object, methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim fileList As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(fileList))
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMFileInput
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
Sub SetOnClickAppend(methodName As String) As VMFileInput
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
Sub SetOnClickAppendOuter(methodName As String) As VMFileInput
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
Sub SetOnClickClear(methodName As String) As VMFileInput
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
Sub SetOnClickPrepend(methodName As String) As VMFileInput
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
Sub SetOnClickPrependInner(methodName As String) As VMFileInput
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
Sub SetOnFocus(methodName As String) As VMFileInput
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
Sub SetOnInput(methodName As String) As VMFileInput
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
Sub SetOnKeydown(methodName As String) As VMFileInput
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
Sub SetOnMousedown(methodName As String) As VMFileInput
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
Sub SetOnMouseup(methodName As String) As VMFileInput
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
Sub SetOnUpdateError(methodName As String) As VMFileInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMFileInput
	FileInput.SetVisible(False)
	Return Me
End Sub

Sub Show As VMFileInput
	FileInput.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMFileInput
	FileInput.Enable(True)
	Return Me
End Sub

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


public Sub RemoveAttr(sName As String) As VMFileInput
	FileInput.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMFileInput
	FileInput.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMFileInput
	FileInput.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMFileInput
	FileInput.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMFileInput
	FileInput.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMFileInput
	FileInput.SetName(varName, bbind)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMFileInput
	FileInput.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMFileInput
	FileInput.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub SetWidth(w As String) As VMFileInput
	FileInput.SetStyleSingle("width", w)
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

'set color intensity
Sub SetTextColor(varColor As String) As VMFileInput
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMFileInput
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub