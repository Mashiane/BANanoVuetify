B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public RadioGroup As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	
End Sub

'initialize the RadioGroup
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMRadioGroup
	ID = sid.tolowercase
	RadioGroup.Initialize(v, ID)
	RadioGroup.SetTag("v-radio-group")
	DesignMode = False
	Module = eventHandler
	vue = v	
	SetMandatory(False)
	RadioGroup.typeOf = "radiogroup"
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMRadioGroup
	RadioGroup.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMRadioGroup
	RadioGroup.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMRadioGroup
	RadioGroup.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMRadioGroup
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMRadioGroup
	RadioGroup.SetAttrLoose(loose)
	Return Me
End Sub


Sub SetAttributes(attrs As List) As VMRadioGroup
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetHorizontal(b As Boolean) As VMRadioGroup
	SetRow(True)
	Return Me
End Sub

Sub SetOptions(options As Map)
	For Each k As String In options.Keys
		Dim v As String = options.Get(k)
		AddItem(k, v)
	Next
End Sub


'use an existing state
Sub SetDataSource(sourceName As String, sourceField As String, displayField As String) As VMRadioGroup
	sourceName = sourceName.tolowercase
	'get the details of the content
	Dim kRow As String = $"row.${sourceField}"$
	Dim dRow As String = $"row.${displayField}"$
	'
	Dim Radio As VMRadio
	Radio.Initialize(vue, "", Module)
	Radio.SetAttrSingle("v-for", $"row in ${sourceName}"$)
	Radio.SetAttrSingle(":key", kRow)	
	Radio.SetAttrSingle(":value", kRow)
	Radio.SetAttrSingle(":label", dRow)
	Radio.Pop(RadioGroup)
	If vue.StateExists(sourceName) = False Then
		vue.SetData(sourceName, Array())
	End If
	
	Return Me
End Sub

Sub AddItems(m As Map) As VMRadioGroup
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		AddItem(k, v)
	Next
	Return Me
End Sub

private Sub AddItem(k As String, v As String) As VMRadioGroup
	Dim el As VMRadio
	el.Initialize(vue, "", Module)
	el.SetAttrSingle("label", v)
	el.SetAttrSingle("value", k)
	el.SetAttrSingle("key", k)
	el.SetPrimary(True)
	el.Pop(RadioGroup)	'
	Return Me
End Sub


'set for
Sub SetVFor(item As String, dataSource As String, keyField As String, valueField As String, labelField As String) As VMRadioGroup
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim Radio As VMRadio
	Radio.Initialize(vue, "", Module)
	Dim sline As String = $"${item} in ${dataSource}"$
	Radio.SetAttrSingle("v-for", sline)
	Radio.SetAttrSingle(":key", keyField)
	Radio.SetAttrSingle(":value", valueField)
	Radio.SetAttrSingle(":label", labelField)
	Radio.Pop(RadioGroup)
	Return Me
End Sub


'apply a theme to an element
Sub UseTheme(themeName As String) As VMRadioGroup
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMRadioGroup
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	RadioGroup.Bind(":color", pp)
	Return Me
End Sub


'set required
Sub SetRequired(varRequired As Boolean) As VMRadioGroup
	RadioGroup.SetRequired(varRequired)
	Return Me
End Sub


'set mandatory
Sub SetMandatory(varMandatory As Boolean) As VMRadioGroup
	Dim pp As String = $"${ID}varMandatory"$
	vue.SetStateSingle(pp, varMandatory)
	RadioGroup.Bind(":mandatory", pp)
	Return Me
End Sub


'get component
Sub ToString As String
	Return RadioGroup.ToString
End Sub

Sub SetVModel(k As String) As VMRadioGroup
	RadioGroup.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMRadioGroup
	RadioGroup.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMRadioGroup
	RadioGroup.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMRadioGroup
	Dim childHTML As String = child.ToString
	RadioGroup.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMRadioGroup
	RadioGroup.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMRadioGroup
	RadioGroup.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMRadioGroup
	RadioGroup.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMRadioGroup
	RadioGroup.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMRadioGroup
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	RadioGroup.Bind(":active-class", pp)
	Return Me
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As Object) As VMRadioGroup
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	RadioGroup.Bind(":append-icon", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMRadioGroup
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	RadioGroup.Bind(":background-color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	RadioGroup.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	RadioGroup.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMRadioGroup
	RadioGroup.SetDisabled(varDisabled)
	Return Me
End Sub

'set error
Sub SetError(varError As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	RadioGroup.Bind(":error", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMRadioGroup
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	RadioGroup.Bind(":error-count", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMRadioGroup
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	RadioGroup.Bind(":error-messages", pp)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Object) As VMRadioGroup
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	RadioGroup.Bind(":hide-details", pp)
	Return Me
End Sub

'set hint
Sub SetHint(varHint As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	RadioGroup.Bind(":hint", pp)
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	RadioGroup.Bind(":id", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	RadioGroup.Bind(":label", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	RadioGroup.Bind(":light", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	RadioGroup.Bind(":loading", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	RadioGroup.Bind(":max", pp)
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	RadioGroup.Bind(":messages", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	RadioGroup.Bind(":multiple", pp)
	Return Me
End Sub

'set name
Sub SetName(varName As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Name"$
	vue.SetStateSingle(pp, varName)
	RadioGroup.Bind(":name", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Object) As VMRadioGroup
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	RadioGroup.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As Object) As VMRadioGroup
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	RadioGroup.Bind(":prepend-icon", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	RadioGroup.Bind(":readonly", pp)
	Return Me
End Sub

'set row
Sub SetRow(varRow As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Row"$
	vue.SetStateSingle(pp, varRow)
	RadioGroup.Bind(":row", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Rules"$
	vue.SetStateSingle(pp, varRules)
	RadioGroup.Bind(":rules", pp)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	RadioGroup.Bind(":success", pp)
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMRadioGroup
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	RadioGroup.Bind(":success-messages", pp)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Object) As VMRadioGroup
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	RadioGroup.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMRadioGroup
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	RadioGroup.Bind(":value", pp)
	Return Me
End Sub

'set value-comparator
Sub SetValueComparator(varValueComparator As Object) As VMRadioGroup
	Dim pp As String = $"${ID}ValueComparator"$
	vue.SetStateSingle(pp, varValueComparator)
	RadioGroup.Bind(":value-comparator", pp)
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMRadioGroup    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As Boolean) As VMRadioGroup    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As Boolean) As VMRadioGroup    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetOnChange(methodName As String) As VMRadioGroup
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
Sub SetOnClickAppend(methodName As String) As VMRadioGroup
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
Sub SetOnClickPrepend(methodName As String) As VMRadioGroup
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
Sub SetOnMousedown(methodName As String) As VMRadioGroup
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
Sub SetOnMouseup(methodName As String) As VMRadioGroup
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
Sub SetOnUpdateError(methodName As String) As VMRadioGroup
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMRadioGroup
	RadioGroup.SetVisible(False)
	Return Me
End Sub

Sub Show As VMRadioGroup
	RadioGroup.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMRadioGroup
	RadioGroup.Enable(True)
	Return Me
End Sub

Sub Disable As VMRadioGroup
	RadioGroup.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMRadioGroup
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMRadioGroup
	RadioGroup.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMRadioGroup
	RadioGroup.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMRadioGroup
	RadioGroup.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMRadioGroup
	RadioGroup.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMRadioGroup
	RadioGroup.SetTabIndex(ti)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMRadioGroup
	RadioGroup.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMRadioGroup
	RadioGroup.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMRadioGroup
RadioGroup.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMRadioGroup
RadioGroup.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMRadioGroup
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMRadioGroup
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub