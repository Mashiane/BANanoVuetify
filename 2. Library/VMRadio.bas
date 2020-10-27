B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Radio As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the Radio
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMRadio
	ID = sid.tolowercase
	Radio.Initialize(v, ID)
	Radio.SetTag("v-radio")
	DesignMode = False
	Module = eventHandler
	vue = v
	Radio.typeOf = "radio"
	bStatic = False
	SetOnChange(Module, $"${ID}_change"$)
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	Radio.SetText(elm.ToString)
End Sub

Sub SetStatic(b As Boolean) As VMRadio
	bStatic = b
	Radio.SetStatic(b)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMRadio
	Radio.SetRC(sRow, sCol)
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMRadio
	vue.SetData(xprop, xValue)
	Return Me
End Sub



'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMRadio
	Radio.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMRadio
	Radio.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMRadio
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMRadio
	Radio.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMRadio
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String, keyField As String, valueField As String, labelField As String) As VMRadio
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	SetAttrSingle(":key", keyField)
	SetAttrSingle(":value", valueField)
	SetAttrSingle(":label", labelField)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMRadio
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMRadio
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
	Else
		Dim pp As String = $"${ID}Color"$
		vue.SetStateSingle(pp, scolor)
		Radio.Bind(":color", pp)
	End If
	Return Me
End Sub


'get component
Sub ToString As String
	If vue.ShowWarnings Then
	Dim eName As String = $"${ID}_change"$
	If SubExists(Module, eName) = False Then
		Log($"VMRadio.${eName} event has not been defined!"$)
	End If
	End If
	RemoveAttr("required")
	RemoveAttr(":required")
	Return Radio.ToString
End Sub

Sub SetVModel(k As String) As VMRadio
	Radio.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMRadio
	Radio.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMRadio
	Radio.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMRadio
	Dim childHTML As String = child.ToString
	Radio.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMRadio
	Radio.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMRadio
	Radio.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMRadio
	Radio.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMRadio
	Radio.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMRadio
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
	Else
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	Radio.Bind(":active-class", pp)
	End If
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMRadio
	If bStatic Then
		SetAttrSingle("color", varColor)
	Else
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Radio.Bind(":color", pp)
	End If
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMRadio
	If bStatic Then
		SetAttrSingle("dark", varDark)
	Else
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Radio.Bind(":dark", pp)
	End If
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMRadio
	Radio.SetDisabled(varDisabled)
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMRadio
	If bStatic Then
		SetAttrSingle("id", varId)
	Else
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	Radio.Bind(":id", pp)
	End If
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMRadio
	If bStatic Then
		SetAttrSingle("label", varLabel)
	Else
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	Radio.Bind(":label", pp)
	End If
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMRadio
	If bStatic Then
		SetAttrSingle("light", varLight)
	Else
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Radio.Bind(":light", pp)
	End If
	Return Me
End Sub

'set name
Sub SetName(varName As Object) As VMRadio
	SetAttrSingle("name", varName)
	Return Me
End Sub

'set off-icon
Sub SetOffIcon(varOffIcon As Object) As VMRadio
	If bStatic Then
		SetAttrSingle("off-icon", varOffIcon)
	Else
	Dim pp As String = $"${ID}OffIcon"$
	vue.SetStateSingle(pp, varOffIcon)
	Radio.Bind(":off-icon", pp)
	End If
	Return Me
End Sub

'set on-icon
Sub SetOnIcon(varOnIcon As Object) As VMRadio
	If bStatic Then
		SetAttrSingle("on-icon", varOnIcon)
	Else
	Dim pp As String = $"${ID}OnIcon"$
	vue.SetStateSingle(pp, varOnIcon)
	Radio.Bind(":on-icon", pp)
	End If
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMRadio
	If bStatic Then
		SetAttrSingle("readonly", varReadonly)
	Else
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	Radio.Bind(":readonly", pp)
	End If
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Object) As VMRadio
	If bStatic Then
		SetAttrSingle("ripple", varRipple)
	Else
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	Radio.Bind(":ripple", pp)
	End If
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMRadio
	Radio.SetValue(varValue)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMRadio
	If b = False Then Return Me
	SetColor("primary")
	Return Me
End Sub

Sub SetSlotLabel(b As Boolean) As VMRadio    'ignore
	SetAttr(CreateMap("slot": "label"))
	Return Me
End Sub

'
Sub SetOnChange(eventHandler As Object,methodName As String) As VMRadio
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppend(methodName As String) As VMRadio
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
Sub SetOnClickPrepend(methodName As String) As VMRadio
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
Sub SetOnMousedown(methodName As String) As VMRadio
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
Sub SetOnMouseup(methodName As String) As VMRadio
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
Sub SetOnUpdateError(methodName As String) As VMRadio
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMRadio
	Radio.SetVisible(False)
	Return Me
End Sub

Sub Show As VMRadio
	Radio.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMRadio
	Radio.Enable(True)
	Return Me
End Sub

Sub Disable As VMRadio
	Radio.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMRadio
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMRadio
	Radio.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMRadio
	Radio.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMRadio
	Radio.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMRadio
	Radio.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMRadio
	Radio.SetTabIndex(ti)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMRadio
	Radio.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMRadio
	Radio.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMRadio
Radio.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMRadio
Radio.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMRadio
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMRadio
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub