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
	Private items As Map
	Private bStatic As Boolean
	Private xmodel As String
End Sub

'initialize the RadioGroup
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMRadioGroup
	ID = sid.tolowercase
	RadioGroup.Initialize(v, ID)
	RadioGroup.SetTag("v-radio-group")
	DesignMode = False
	Module = eventHandler
	vue = v	
	RadioGroup.typeOf = "radiogroup"
	items.Initialize 
	bStatic = False
	xmodel = ""
	Return Me
End Sub


'set for
Sub SetVFor(item As String, dataSource As String, keyField As String, valueField As String, labelField As String) As VMRadioGroup
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim Radio As VMRadio
	Radio.Initialize(vue, "", Module)
	Radio.SetStatic(bStatic)
	Dim sline As String = $"${item} in ${dataSource}"$
	Radio.SetAttrSingle("v-for", sline)
	Radio.SetAttrSingle(":key", keyField)
	Radio.SetAttrSingle(":value", valueField)
	Radio.SetAttrSingle(":label", labelField)
	Radio.SetDesignMode(DesignMode)
	Radio.Pop(RadioGroup)
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMRadioGroup
	bStatic = b
	RadioGroup.SetStatic(b)
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
		items.Put(k, v)
	Next
End Sub

'use an existing state
Sub SetDataSource(sourceName As String, sourceField As String, displayField As String) As VMRadioGroup
	items.Clear 
	sourceName = sourceName.tolowercase
	'get the details of the content
	Dim kRow As String = $"row.${sourceField}"$
	Dim dRow As String = $"row.${displayField}"$
	'
	Dim Radio As VMRadio
	Radio.Initialize(vue, "", Module)
	Radio.SetStatic(bStatic)
	Radio.SetAttrSingle("v-for", $"row in ${sourceName}"$)
	Radio.SetAttrSingle(":key", kRow)	
	Radio.SetAttrSingle(":value", kRow)
	Radio.SetAttrSingle(":label", dRow)
	Radio.SetDesignMode(DesignMode)
	
	Radio.Pop(RadioGroup)
	If vue.StateExists(sourceName) = False Then
		vue.SetData(sourceName, vue.newlist)
	End If
	
	Return Me
End Sub

Sub AddItems(m As Map) As VMRadioGroup
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		items.Put(k, v)
	Next
	Return Me
End Sub

private Sub AddItem(k As String, v As String) As VMRadioGroup
	Dim el As VMRadio
	el.Initialize(vue, "", Module)
	el.SetStatic(bStatic)
	el.SetAttrSingle("label", v)
	el.SetAttrSingle("value", k)
	el.SetAttrSingle("key", k)
	el.SetDesignMode(DesignMode)	
	el.Pop(RadioGroup)	'
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
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
	Else	
		Dim pp As String = $"${ID}Color"$
		vue.SetStateSingle(pp, scolor)
		RadioGroup.Bind(":color", pp)
	End If
	Return Me
End Sub


'set mandatory
Sub SetMandatory(varMandatory As Boolean) As VMRadioGroup
	If bStatic Then
		SetAttrSingle("mandatory", varMandatory)
	Else
		Dim pp As String = $"${ID}varMandatory"$
		vue.SetStateSingle(pp, varMandatory)
		RadioGroup.Bind(":mandatory", pp)
	End If
	Return Me
End Sub

'get component
Sub ToString As String
	RemoveAttr("required")
	RemoveAttr(":required")
	If items.Size > 0 Then
		For Each k As String In items.Keys
			Dim v As String = items.Get(k)
			AddItem(k, v)
		Next
	End If
	Return RadioGroup.ToString
End Sub

Sub SetVModel(k As String) As VMRadioGroup
	xmodel = k.tolowercase
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
Sub SetActiveClass(varActiveClass As String) As VMRadioGroup
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
	Else
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	RadioGroup.Bind(":active-class", pp)
	End If
	Return Me
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As String) As VMRadioGroup
	If varAppendIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("append-icon", varAppendIcon)
	Else
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	RadioGroup.Bind(":append-icon", pp)
	End If
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As String) As VMRadioGroup
	If varBackgroundColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("background-color", varBackgroundColor)
	Else
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	RadioGroup.Bind(":background-color", pp)
	End If
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMRadioGroup
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
	Else
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	RadioGroup.Bind(":dark", pp)
	End If
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMRadioGroup
	If varDense = False Then Return Me
	If bStatic Then
		SetAttrSingle("dense", varDense)
	Else
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	RadioGroup.Bind(":dense", pp)
	End If
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMRadioGroup
	RadioGroup.SetDisabled(varDisabled)
	Return Me
End Sub

'set error
Sub SetError(varError As Boolean) As VMRadioGroup
	If bStatic Then
		SetAttrSingle("error", varError)
	Else
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	RadioGroup.Bind(":error", pp)
	End If
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMRadioGroup
	If bStatic Then
		SetAttrSingle("error-count", varErrorCount)
	Else
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	RadioGroup.Bind(":error-count", pp)
	End If
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMRadioGroup
	If bStatic Then
		SetAttrSingle("error-messages", varErrorMessages)
	Else
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	RadioGroup.Bind(":error-messages", pp)
	End If
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Boolean) As VMRadioGroup
	If varHideDetails = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-details", varHideDetails)
	Else
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	RadioGroup.Bind(":hide-details", pp)
	End If
	Return Me
End Sub

'set hint
Sub SetHint(varHint As String) As VMRadioGroup
	If varHint = "" Then Return Me
	If bStatic Then
		SetAttrSingle("hint", varHint)
	Else
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	RadioGroup.Bind(":hint", pp)
	End If
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMRadioGroup
	If bStatic Then
		SetAttrSingle("id", varId)
	Else
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	RadioGroup.Bind(":id", pp)
	End If
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As String) As VMRadioGroup
	If varLabel = "" Then Return Me
	If bStatic Then
		SetAttrSingle("label", varLabel)
	Else
		Dim pp As String = $"${ID}Label"$
		vue.SetStateSingle(pp, varLabel)
		RadioGroup.Bind(":label", pp)
	End If
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMRadioGroup
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
	Else
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	RadioGroup.Bind(":light", pp)
	End If
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Boolean) As VMRadioGroup
	If varLoading = False Then Return Me
	If bStatic Then
		SetAttrSingle("loading", varLoading)
	Else
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	RadioGroup.Bind(":loading", pp)
	End If
	Return Me
End Sub

'set max
Sub SetMax(varMax As Object) As VMRadioGroup
	If bStatic Then
		SetAttrSingle("max", varMax)
	Else
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	RadioGroup.Bind(":max", pp)
	End If
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMRadioGroup
	If bStatic Then
		SetAttrSingle("messages", varMessages)
	Else
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	RadioGroup.Bind(":messages", pp)
	End If
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Boolean) As VMRadioGroup
	If varMultiple = False Then Return Me
	SetAttrSingle("multiple", varMultiple)
	Return Me
End Sub

'set name
Sub SetName(varName As Object) As VMRadioGroup
	SetAttrSingle("name", varName)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Boolean) As VMRadioGroup
	If varPersistentHint = False Then Return Me
	If bStatic Then
		SetAttrSingle("persistent-hint", varPersistentHint)
	Else
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	RadioGroup.Bind(":persistent-hint", pp)
	End If
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As String) As VMRadioGroup
	If varPrependIcon = "" Then Return Me
	If bStatic Then
	SetAttrSingle("prepend-icon", varPrependIcon)
	Else
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	RadioGroup.Bind(":prepend-icon", pp)
	End If
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Boolean) As VMRadioGroup
	If varReadonly = False Then Return Me
	If bStatic Then
		SetAttrSingle("readonly", varReadonly)
	Else
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	RadioGroup.Bind(":readonly", pp)
	End If
	Return Me
End Sub

'set row
Sub SetRow(varRow As Boolean) As VMRadioGroup
	If varRow = False Then Return Me
	If bStatic Then
		SetAttrSingle("row", varRow)
	Else
	Dim pp As String = $"${ID}Row"$
	vue.SetStateSingle(pp, varRow)
	RadioGroup.Bind(":row", pp)
	End If
	Return Me
End Sub


'set column
Sub SetColumn(varColumn As Boolean) As VMRadioGroup
	If varColumn = False Then Return Me
	If bStatic Then
		SetAttrSingle("column", varColumn)
	Else
		Dim pp As String = $"${ID}column"$
		vue.SetStateSingle(pp, varColumn)
		RadioGroup.Bind(":column", pp)
	End If
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMRadioGroup
	If bStatic Then
		SetAttrSingle("rules", varRules)
	Else
		Dim pp As String = $"${ID}Rules"$
		vue.SetStateSingle(pp, varRules)
		RadioGroup.Bind(":rules", pp)
	End If
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Object) As VMRadioGroup
	If bStatic Then
		SetAttrSingle("success", varSuccess)
	Else
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	RadioGroup.Bind(":success", pp)
	End If
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMRadioGroup
	If bStatic Then
		SetAttrSingle("success-messages", varSuccessMessages)
	Else
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	RadioGroup.Bind(":success-messages", pp)
	End If
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Boolean) As VMRadioGroup
	If varValidateOnBlur = False Then Return Me
	If bStatic Then
		SetAttrSingle("validate-on-blur", varValidateOnBlur)
	Else
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	RadioGroup.Bind(":validate-on-blur", pp)
	End If
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMRadioGroup
	SetAttrSingle("value", varValue)
	Return Me
End Sub

'set value-comparator
Sub SetValueComparator(varValueComparator As Object) As VMRadioGroup
	If bStatic Then
		SetAttrSingle("value-comparator", varValueComparator)
	Else
	Dim pp As String = $"${ID}ValueComparator"$
	vue.SetStateSingle(pp, varValueComparator)
	RadioGroup.Bind(":value-comparator", pp)
	End If
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
Sub SetOnChange(eventHandler As Object, methodName As String) As VMRadioGroup
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As Object
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
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