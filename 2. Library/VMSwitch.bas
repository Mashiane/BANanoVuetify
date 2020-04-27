B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public SwitchBox As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the SwitchBox
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSwitch
	ID = sid.tolowercase
	SwitchBox.Initialize(v, ID)
	SwitchBox.SetTag("v-switch")
	DesignMode = False
	Module = eventHandler
	vue = v
	SwitchBox.typeOf = "switchbox"
	SwitchBox.fieldType = "bool"
	SetOnChange($"${ID}_change"$)
	Return Me
End Sub

Sub SetUncheckedValue(suncheckedValue As Object) As VMSwitch
	SwitchBox.SetUncheckedValue(suncheckedValue)
	Return Me
End Sub

Sub SetString As VMSwitch
	SwitchBox.fieldType = "string"
	Return Me
End Sub

Sub SetBool As VMSwitch
	SwitchBox.fieldType = "bool"
	Return Me
End Sub

Sub SetInt As VMSwitch
	SwitchBox.fieldType = "int"
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSwitch
	SwitchBox.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSwitch
	SwitchBox.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSwitch
	SwitchBox.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSwitch
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub


Sub SetPrimary(b As Boolean) As VMSwitch
	If b = False Then Return Me
	SetColor("primary")
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMSwitch
	SwitchBox.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSwitch
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMSwitch
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMSwitch
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	SwitchBox.Bind(":color", pp)
	Return Me
End Sub


'set required
Sub SetRequired(varRequired As Boolean) As VMSwitch
	SwitchBox.SetRequired(varRequired)
	Return Me
End Sub

'get component
Sub ToString As String
	Return SwitchBox.ToString
End Sub

Sub SetVModel(k As String) As VMSwitch
	SwitchBox.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMSwitch
	SwitchBox.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSwitch
	SwitchBox.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSwitch
	Dim childHTML As String = child.ToString
	SwitchBox.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSwitch
	SwitchBox.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSwitch
	SwitchBox.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSwitch
	SwitchBox.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSwitch
	SwitchBox.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As Object) As VMSwitch
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	SwitchBox.Bind(":append-icon", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMSwitch
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	SwitchBox.Bind(":background-color", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMSwitch
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	SwitchBox.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMSwitch
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	SwitchBox.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMSwitch
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	SwitchBox.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMSwitch
	SwitchBox.SetDisabled(varDisabled)
	Return Me
End Sub

'set error
Sub SetError(varError As Object) As VMSwitch
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	SwitchBox.Bind(":error", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMSwitch
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	SwitchBox.Bind(":error-count", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMSwitch
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	SwitchBox.Bind(":error-messages", pp)
	Return Me
End Sub

'set false-value
Sub SetFalseValue(varFalseValue As Object) As VMSwitch
	SwitchBox.Bind("false-value", varFalseValue)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Object) As VMSwitch
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	SwitchBox.Bind(":flat", pp)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Boolean) As VMSwitch
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	SwitchBox.Bind(":hide-details", pp)
	Return Me
End Sub

'set hint
Sub SetHint(varHint As Object) As VMSwitch
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	SwitchBox.Bind(":hint", pp)
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMSwitch
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	SwitchBox.Bind(":id", pp)
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As Object) As VMSwitch
	SwitchBox.Bind("input-value", varInputValue)
	Return Me
End Sub

'set inset
Sub SetInset(varInset As Object) As VMSwitch
	Dim pp As String = $"${ID}Inset"$
	vue.SetStateSingle(pp, varInset)
	SwitchBox.Bind(":inset", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMSwitch
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	SwitchBox.Bind(":label", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMSwitch
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	SwitchBox.Bind(":light", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMSwitch
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	SwitchBox.Bind(":loading", pp)
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMSwitch
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	SwitchBox.Bind(":messages", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Object) As VMSwitch
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	SwitchBox.Bind(":multiple", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Object) As VMSwitch
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	SwitchBox.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As Object) As VMSwitch
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	SwitchBox.Bind(":prepend-icon", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMSwitch
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	SwitchBox.Bind(":readonly", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Object) As VMSwitch
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	SwitchBox.Bind(":ripple", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMSwitch
	Dim pp As String = $"${ID}Rules"$
	vue.SetStateSingle(pp, varRules)
	SwitchBox.Bind(":rules", pp)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Object) As VMSwitch
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	SwitchBox.Bind(":success", pp)
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMSwitch
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	SwitchBox.Bind(":success-messages", pp)
	Return Me
End Sub

'set true-value
Sub SetTrueValue(varTrueValue As Object) As VMSwitch
	SwitchBox.Bind("true-value", varTrueValue)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Object) As VMSwitch
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	SwitchBox.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMSwitch
	SwitchBox.SetValue(varValue,False)
	Return Me
End Sub

'set value-comparator
Sub SetValueComparator(varValueComparator As Object) As VMSwitch
	Dim pp As String = $"${ID}ValueComparator"$
	vue.SetStateSingle(pp, varValueComparator)
	SwitchBox.Bind(":value-comparator", pp)
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMSwitch    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotLabel(b As Boolean) As VMSwitch    'ignore
	SetAttr(CreateMap("slot": "label"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As Boolean) As VMSwitch    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As Boolean) As VMSwitch    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetOnChange(methodName As String) As VMSwitch
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
Sub SetOnClickAppend(methodName As String) As VMSwitch
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
Sub SetOnClickPrepend(methodName As String) As VMSwitch
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
Sub SetOnMousedown(methodName As String) As VMSwitch
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
Sub SetOnMouseup(methodName As String) As VMSwitch
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
Sub SetOnUpdateError(methodName As String) As VMSwitch
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMSwitch
	SwitchBox.SetVisible(False)
	Return Me
End Sub

Sub Show As VMSwitch
	SwitchBox.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMSwitch
	SwitchBox.Enable(True)
	Return Me
End Sub

Sub Disable As VMSwitch
	SwitchBox.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSwitch
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMSwitch
	SwitchBox.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSwitch
	SwitchBox.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMSwitch
	SwitchBox.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMSwitch
	SwitchBox.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMSwitch
	SwitchBox.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSwitch
	SwitchBox.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMSwitch
	SwitchBox.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMSwitch
	SwitchBox.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSwitch
SwitchBox.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMSwitch
SwitchBox.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMSwitch
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMSwitch
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub