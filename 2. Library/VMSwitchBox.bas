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
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSwitchBox
	ID = sid.tolowercase
	SwitchBox.Initialize(v, ID)
	SwitchBox.SetTag("v-switch")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return SwitchBox.ToString
End Sub

Sub SetVModel(k As String) As VMSwitchBox
	SwitchBox.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMSwitchBox
	SwitchBox.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSwitchBox
	SwitchBox.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSwitchBox
	Dim childHTML As String = child.ToString
	SwitchBox.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSwitchBox
	SwitchBox.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSwitchBox
	SwitchBox.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr as map) As VMSwitchBox
	SwitchBox.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSwitchBox
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
Sub SetAppendIcon(varAppendIcon As Object) As VMSwitchBox
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	SwitchBox.Bind(":append-icon", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMSwitchBox
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	SwitchBox.Bind(":background-color", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	SwitchBox.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	SwitchBox.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	SwitchBox.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Disabled"$
	vue.SetStateSingle(pp, varDisabled)
	SwitchBox.Bind(":disabled", pp)
	Return Me
End Sub

'set error
Sub SetError(varError As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	SwitchBox.Bind(":error", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMSwitchBox
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	SwitchBox.Bind(":error-count", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMSwitchBox
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	SwitchBox.Bind(":error-messages", pp)
	Return Me
End Sub

'set false-value
Sub SetFalseValue(varFalseValue As Object) As VMSwitchBox
	Dim pp As String = $"${ID}FalseValue"$
	vue.SetStateSingle(pp, varFalseValue)
	SwitchBox.Bind(":false-value", pp)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	SwitchBox.Bind(":flat", pp)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Object) As VMSwitchBox
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	SwitchBox.Bind(":hide-details", pp)
	Return Me
End Sub

'set hint
Sub SetHint(varHint As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	SwitchBox.Bind(":hint", pp)
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	SwitchBox.Bind(":id", pp)
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As Object) As VMSwitchBox
	Dim pp As String = $"${ID}InputValue"$
	vue.SetStateSingle(pp, varInputValue)
	SwitchBox.Bind(":input-value", pp)
	Return Me
End Sub

'set inset
Sub SetInset(varInset As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Inset"$
	vue.SetStateSingle(pp, varInset)
	SwitchBox.Bind(":inset", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	SwitchBox.Bind(":label", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	SwitchBox.Bind(":light", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	SwitchBox.Bind(":loading", pp)
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	SwitchBox.Bind(":messages", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	SwitchBox.Bind(":multiple", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Object) As VMSwitchBox
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	SwitchBox.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As Object) As VMSwitchBox
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	SwitchBox.Bind(":prepend-icon", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	SwitchBox.Bind(":readonly", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	SwitchBox.Bind(":ripple", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Rules"$
	vue.SetStateSingle(pp, varRules)
	SwitchBox.Bind(":rules", pp)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	SwitchBox.Bind(":success", pp)
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMSwitchBox
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	SwitchBox.Bind(":success-messages", pp)
	Return Me
End Sub

'set true-value
Sub SetTrueValue(varTrueValue As Object) As VMSwitchBox
	Dim pp As String = $"${ID}TrueValue"$
	vue.SetStateSingle(pp, varTrueValue)
	SwitchBox.Bind(":true-value", pp)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Object) As VMSwitchBox
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	SwitchBox.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMSwitchBox
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	SwitchBox.Bind(":value", pp)
	Return Me
End Sub

'set value-comparator
Sub SetValueComparator(varValueComparator As Object) As VMSwitchBox
	Dim pp As String = $"${ID}ValueComparator"$
	vue.SetStateSingle(pp, varValueComparator)
	SwitchBox.Bind(":value-comparator", pp)
	Return Me
End Sub

'
Sub SetSlotAppend(b As boolean) As VMSwitchBox    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotLabel(b As boolean) As VMSwitchBox    'ignore
	SetAttr(CreateMap("slot": "label"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As boolean) As VMSwitchBox    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As boolean) As VMSwitchBox    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetOnChange(methodName As String) As VMSwitchBox
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppend(methodName As String) As VMSwitchBox
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:click:append": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrepend(methodName As String) As VMSwitchBox
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:click:prepend": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMousedown(methodName As String) As VMSwitchBox
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mousedown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseup(methodName As String) As VMSwitchBox
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:mouseup": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateError(methodName As String) As VMSwitchBox
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMSwitchBox
	vue.SetStateSingle($"${ID}show"$, False)
	Return Me
End Sub

Sub Show As VMSwitchBox
	vue.SetStateSingle($"${ID}show"$, True)
	Return Me
End Sub

Sub Enable As VMSwitchBox
	vue.SetStateSingle($"${ID}disabled"$, False)
	Return Me
End Sub

Sub Disable As VMSwitchBox
	vue.SetStateSingle($"${ID}disabled"$, True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSwitchBox
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMSwitchBox
	SwitchBox.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSwitchBox
	SwitchBox.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMSwitchBox
	SwitchBox.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMSwitchBox
	SwitchBox.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMSwitchBox
	SwitchBox.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSwitchBox
	SwitchBox.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMSwitchBox
	SwitchBox.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMSwitchBox
	SwitchBox.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSwitchBox
SwitchBox.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
'Sub SetVisible(b As Boolean) As VMSwitchBox
SwitchBox.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMSwitchBox
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMSwitchBox
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub