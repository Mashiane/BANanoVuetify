B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CheckBox As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the CheckBox
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCheckBox
	ID = sid.tolowercase
	CheckBox.Initialize(v, ID)
	CheckBox.SetTag("v-checkbox")
	DesignMode = False
	Module = eventHandler
	vue = v
	CheckBox.typeOf = "checkbox"
	CheckBox.fieldType = "bool"
	bStatic = False
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMCheckBox
	bStatic = b
	CheckBox.SetStatic(b)
	Return Me
End Sub

Sub SetUncheckedValue(suncheckedValue As Object) As VMCheckBox
	CheckBox.SetUncheckedValue(suncheckedValue)
	Return Me
End Sub

'set vshow
Sub SetVisible(b As Boolean) As VMCheckBox
	CheckBox.SetVisible(b)
	Return Me
End Sub

Sub SetString As VMCheckBox
	CheckBox.fieldType = "string"
	Return Me
End Sub

Sub SetBool As VMCheckBox
	CheckBox.fieldType = "bool"
	Return Me
End Sub

Sub SetInt As VMCheckBox
	CheckBox.fieldType = "int"
	Return Me
End Sub


'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMCheckBox
	CheckBox.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMCheckBox
	CheckBox.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMCheckBox
	CheckBox.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMCheckBox
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMCheckBox
	If b = False Then Return Me
	SetColor("primary")
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMCheckBox
	CheckBox.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCheckBox
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCheckBox
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCheckBox
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
	Else
	Dim pp As String = $"${ID}Color"$	
	vue.SetStateSingle(pp, scolor)
	CheckBox.Bind(":color", pp)
	End If
	Return Me
End Sub


'set required
Sub SetRequired(varRequired As Boolean) As VMCheckBox
	CheckBox.SetRequired(varRequired)
	Return Me
End Sub


'get component
Sub ToString As String
	Return CheckBox.ToString
End Sub

Sub SetVModel(k As String) As VMCheckBox
	CheckBox.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCheckBox
	CheckBox.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCheckBox
	CheckBox.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCheckBox
	Dim childHTML As String = child.ToString
	CheckBox.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCheckBox
	CheckBox.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCheckBox
	CheckBox.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCheckBox
	CheckBox.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCheckBox
	CheckBox.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("append-icon", varAppendIcon)
	Else
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	CheckBox.Bind(":append-icon", pp)
	End If
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("background-color", varBackgroundColor)
	Else
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	CheckBox.Bind(":background-color", pp)
	End If
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("color", varColor)
	Else
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	CheckBox.Bind(":color", pp)
	End If
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("dark", varDark)
	Else
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	CheckBox.Bind(":dark", pp)
	End If
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("dense", varDense)
	Else
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	CheckBox.Bind(":dense", pp)
	End If
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMCheckBox
	CheckBox.SetDisabled(varDisabled)
	Return Me
End Sub

'set error
Sub SetError(varError As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("error", varError)
	Else
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	CheckBox.Bind(":error", pp)
	End If
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("error-count", varErrorCount)
	Else
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	CheckBox.Bind(":error-count", pp)
	End If
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("error-messages", varErrorMessages)
	Else
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	CheckBox.Bind(":error-messages", pp)
	End If
	Return Me
End Sub

'set false-value
Sub SetFalseValue(varFalseValue As Object) As VMCheckBox
	CheckBox.Bind("false-value", varFalseValue)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As boolean) As VMCheckBox
	If bStatic Then
		SetAttrSingle("hide-details", varHideDetails)
	Else
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	CheckBox.Bind(":hide-details", pp)
	End If
	Return Me
End Sub

'set hint
Sub SetHint(varHint As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("hint", varHint)
	Else
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	CheckBox.Bind(":hint", pp)
	End If
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("id", varId)
	Else
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	CheckBox.Bind(":id", pp)
	End If
	Return Me
End Sub

'set indeterminate
Sub SetIndeterminate(varIndeterminate As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("indeterminate", varIndeterminate)
	Else
	Dim pp As String = $"${ID}Indeterminate"$
	vue.SetStateSingle(pp, varIndeterminate)
	CheckBox.Bind(":indeterminate", pp)
	End If
	Return Me
End Sub

'set indeterminate-icon
Sub SetIndeterminateIcon(varIndeterminateIcon As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("indeterminate-icon", varIndeterminateIcon)
	Else
	Dim pp As String = $"${ID}IndeterminateIcon"$
	vue.SetStateSingle(pp, varIndeterminateIcon)
	CheckBox.Bind(":indeterminate-icon", pp)
	End If
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As Object) As VMCheckBox
	CheckBox.Bind("input-value", varInputValue)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("label", varLabel)
	Else
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	CheckBox.Bind(":label", pp)
	End If
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("light", varLight)
	Else
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	CheckBox.Bind(":light", pp)
	End If
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("loading", varLoading)
	Else
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	CheckBox.Bind(":loading", pp)
	End If
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("messages", varMessages)
	Else
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	CheckBox.Bind(":messages", pp)
	End If
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("multiple", varMultiple)
	Else
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	CheckBox.Bind(":multiple", pp)
	End If
	Return Me
End Sub

'set off-icon
Sub SetOffIcon(varOffIcon As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("off-icon", varOffIcon)
	Else
	Dim pp As String = $"${ID}OffIcon"$
	vue.SetStateSingle(pp, varOffIcon)
	CheckBox.Bind(":off-icon", pp)
	End If
	Return Me
End Sub

'set on-icon
Sub SetOnIcon(varOnIcon As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("on-icon", varOnIcon)
	Else
	Dim pp As String = $"${ID}OnIcon"$
	vue.SetStateSingle(pp, varOnIcon)
	CheckBox.Bind(":on-icon", pp)
	End If
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("persistent-hint", varPersistentHint)
	Else
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	CheckBox.Bind(":persistent-hint", pp)
	End If
	Return Me
End Sub

'set preped-icon
Sub SetPrepedIcon(varPrepedIcon As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("prepend-icon", varPrepedIcon)
	Else
	Dim pp As String = $"${ID}PrepedIcon"$
	vue.SetStateSingle(pp, varPrepedIcon)
	CheckBox.Bind(":prepend-icon", pp)
	End If
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("readonly", varReadonly)
	Else
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	CheckBox.Bind(":readonly", pp)
	End If
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("ripple", varRipple)
	Else
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	CheckBox.Bind(":ripple", pp)
	End If
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMCheckBox
	CheckBox.Bind("rules", varRules)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("success", varSuccess)
	Else
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	CheckBox.Bind(":success", pp)
	End If
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("success-messages", varSuccessMessages)
	Else
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	CheckBox.Bind(":success-messages", pp)
	End If
	Return Me
End Sub

'set true-value
Sub SetTrueValue(varTrueValue As Object) As VMCheckBox
	CheckBox.Bind("true-value", varTrueValue)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("validate-on-blur", varValidateOnBlur)
	Else
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	CheckBox.Bind(":validate-on-blur", pp)
	End If
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMCheckBox
	CheckBox.SetValue(varValue,False)
	Return Me
End Sub

'set value-comparator
Sub SetValueComparator(varValueComparator As Object) As VMCheckBox
	If bStatic Then
		SetAttrSingle("value-comparator", varValueComparator)
	Else
	Dim pp As String = $"${ID}ValueComparator"$
	vue.SetStateSingle(pp, varValueComparator)
	CheckBox.Bind(":value-comparator", pp)
	End If
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMCheckBox    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotLabel(b As Boolean) As VMCheckBox    'ignore
	SetAttr(CreateMap("slot": "label"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As Boolean) As VMCheckBox    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As Boolean) As VMCheckBox    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMCheckBox
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
Sub SetOnClickAppend(methodName As String) As VMCheckBox
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
Sub SetOnClickPrepend(methodName As String) As VMCheckBox
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
Sub SetOnMousedown(methodName As String) As VMCheckBox
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
Sub SetOnMouseup(methodName As String) As VMCheckBox
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
Sub SetOnUpdateError(methodName As String) As VMCheckBox
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
Sub SetOnUpdateIndeterminate(methodName As String) As VMCheckBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:indeterminate": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMCheckBox
	CheckBox.SetVisible(False)
	Return Me
End Sub

Sub Show As VMCheckBox
	CheckBox.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMCheckBox
	CheckBox.Enable(True)
	Return Me
End Sub

Sub Disable As VMCheckBox
	CheckBox.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCheckBox
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMCheckBox
	CheckBox.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCheckBox
	CheckBox.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMCheckBox
	CheckBox.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMCheckBox
	CheckBox.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMCheckBox
	CheckBox.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCheckBox
	CheckBox.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMCheckBox
	CheckBox.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMCheckBox
	CheckBox.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCheckBox
CheckBox.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub



'set color intensity
Sub SetTextColor(varColor As String) As VMCheckBox
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMCheckBox
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub