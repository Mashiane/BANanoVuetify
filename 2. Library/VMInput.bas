B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Input As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private vmodel As String
	Private bStatic As Boolean
End Sub

'initialize the Input
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMInput
	ID = sid.tolowercase
	Input.Initialize(v, ID)
	Input.SetTag("v-input")
	DesignMode = False
	Module = eventHandler
	vue = v
	vmodel = ""
	bStatic = False
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMInput
	bStatic = b
	Input.SetStatic(b)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMInput
	Input.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMInput
	Input.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMInput
	Input.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMInput
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMInput
	Input.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMInput
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	Return Input.ToString
End Sub

Sub SetVModel(k As String) As VMInput
	Input.SetVModel(k)
	vmodel = k.tolowercase
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMInput
	Input.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMInput
	Input.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMInput
	Dim childHTML As String = child.ToString
	Input.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMInput
	Input.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMInput
	Input.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMInput
	Input.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMInput
	Input.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As Object) As VMInput
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	Input.Bind(":append-icon", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMInput
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	Input.Bind(":background-color", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMInput
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Input.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMInput
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Input.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMInput
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	Input.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMInput
	Input.SetDisabled(varDisabled)
	Return Me
End Sub

'set error
Sub SetError(varError As Boolean) As VMInput
	Dim pp As String = $"${vmodel}Error"$
	vue.SetStateSingle(pp, varError)
	Input.Bind(":error", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMInput
	Dim pp As String = $"${vmodel}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	Input.Bind(":error-count", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As String) As VMInput
	Dim pp As String = $"${vmodel}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	Input.Bind(":error-messages", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMInput
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Input.Bind(":height", pp)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Boolean) As VMInput
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	Input.Bind(":hide-details", pp)
	Return Me
End Sub

'set hint
Sub SetHint(varHint As Object) As VMInput
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	Input.Bind(":hint", pp)
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMInput
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	Input.Bind(":id", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMInput
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	Input.Bind(":label", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMInput
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Input.Bind(":light", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMInput
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	Input.Bind(":loading", pp)
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMInput
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	Input.Bind(":messages", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Object) As VMInput
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	Input.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As Object) As VMInput
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	Input.Bind(":prepend-icon", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMInput
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	Input.Bind(":readonly", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Boolean) As VMInput
	If varRules = False Then Return Me
	If bStatic Then Return Me
	If DesignMode Then Return Me
	Dim pp As String = $"${ID}Rules"$
	Input.Bind(":rules", pp)
	vue.SetData(pp, vue.NewList)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Object) As VMInput
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	Input.Bind(":success", pp)
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMInput
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	Input.Bind(":success-messages", pp)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Object) As VMInput
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	Input.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMInput
	Input.SetValue(varValue, False)
	vue.SetData(vmodel, varValue)
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMInput    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As Boolean) As VMInput    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As Boolean) As VMInput    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetOnChange(EventHandler As Object, methodName As String) As VMInput
	methodName = methodName.tolowercase
	If SubExists(EventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(EventHandler, methodName, e)
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppend(methodName As String) As VMInput
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
Sub SetOnClickPrepend(methodName As String) As VMInput
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
Sub SetOnMousedown(methodName As String) As VMInput
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
Sub SetOnMouseup(methodName As String) As VMInput
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
Sub SetOnUpdateError(methodName As String) As VMInput
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMInput
	Input.SetVisible(False)
	Return Me
End Sub

Sub Show As VMInput
	Input.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMInput
	Input.Enable(True)
	Return Me
End Sub

Sub Disable As VMInput
	Input.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMInput
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMInput
	Input.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMInput
	Input.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMInput
	Input.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMInput
	Input.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMInput
	Input.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMInput
	Input.SetName(varName, bbind)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMInput
	Input.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMInput
	Input.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMInput
Input.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMInput
Input.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMInput
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMInput
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub