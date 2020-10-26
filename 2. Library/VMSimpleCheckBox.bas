B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public SimpleCheckBox As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean  'ignore
	Private Module As Object
	Private bStatic As Boolean
	Private vmodel As String
End Sub

'initialize the SimpleCheckBox
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSimpleCheckBox
	ID = sid.tolowercase
	SimpleCheckBox.Initialize(v, ID)
	SimpleCheckBox.SetTag("v-simple-checkbox")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	vmodel = ""
	SetOnClick($"${ID}_click"$)
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMSimpleCheckBox
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetStatic(b As Boolean) As VMSimpleCheckBox
	bStatic = b
	SimpleCheckBox.SetStatic(b)
	Return Me
End Sub


'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSimpleCheckBox
	SimpleCheckBox.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSimpleCheckBox
	SimpleCheckBox.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSimpleCheckBox
	SimpleCheckBox.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSimpleCheckBox
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMSimpleCheckBox
	SimpleCheckBox.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSimpleCheckBox
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	If vue.ShowWarnings Then
	Dim eName As String = $"${ID}_click"$
	If SubExists(Module, eName) = False Then
		Log($"VMSimpleCheckBox.${eName} event has not been defined!"$)
	End If
	End If
	Return SimpleCheckBox.ToString
End Sub

Sub SetVModel(k As String) As VMSimpleCheckBox
	SimpleCheckBox.SetVModel(k)
	vmodel = k.tolowercase
	Return Me
End Sub

Sub SetVIf(vif As String) As VMSimpleCheckBox
	SimpleCheckBox.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMSimpleCheckBox
	SimpleCheckBox.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSimpleCheckBox
	Dim childHTML As String = child.ToString
	SimpleCheckBox.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSimpleCheckBox
	SimpleCheckBox.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSimpleCheckBox
	SimpleCheckBox.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSimpleCheckBox
	SimpleCheckBox.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSimpleCheckBox
	SimpleCheckBox.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As String) As VMSimpleCheckBox
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	SimpleCheckBox.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMSimpleCheckBox
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	SimpleCheckBox.Bind(":dark", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMSimpleCheckBox
	SimpleCheckBox.SetDisabled(varDisabled)
	Return Me
End Sub

'set indeterminate
Sub SetIndeterminate(varIndeterminate As Boolean) As VMSimpleCheckBox
	If varIndeterminate = False Then Return Me
	If bStatic Then
		SetAttrSingle("indeterminate", varIndeterminate)
		Return Me
	End If
	Dim pp As String = $"${ID}Indeterminate"$
	vue.SetStateSingle(pp, varIndeterminate)
	SimpleCheckBox.Bind(":indeterminate", pp)
	Return Me
End Sub

'set indeterminate-icon
Sub SetIndeterminateIcon(varIndeterminateIcon As String) As VMSimpleCheckBox
	If varIndeterminateIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("indeterminate-icon", varIndeterminateIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}IndeterminateIcon"$
	vue.SetStateSingle(pp, varIndeterminateIcon)
	SimpleCheckBox.Bind(":indeterminate-icon", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMSimpleCheckBox
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If	
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	SimpleCheckBox.Bind(":light", pp)
	Return Me
End Sub

'set off-icon
Sub SetOffIcon(varOffIcon As String) As VMSimpleCheckBox
	If varOffIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("off-icon", varOffIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}OffIcon"$
	vue.SetStateSingle(pp, varOffIcon)
	SimpleCheckBox.Bind(":off-icon", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Boolean) As VMSimpleCheckBox
	If varRipple = False Then Return Me
	If bStatic Then
		SetAttrSingle("ripple", varRipple)
		Return Me
	End If
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	SimpleCheckBox.Bind(":ripple", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Boolean) As VMSimpleCheckBox
	If vmodel = "" Then
		vmodel = $"${ID}value"$
		SetVModel(vmodel)
	End If
	SimpleCheckBox.SetValue(varValue)
	vue.SetData(vmodel, varValue)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMSimpleCheckBox
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMSimpleCheckBox
	SimpleCheckBox.SetVisible(False)
	Return Me
End Sub

Sub Show As VMSimpleCheckBox
	SimpleCheckBox.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMSimpleCheckBox
	SimpleCheckBox.Enable(True)
	Return Me
End Sub

Sub Disable As VMSimpleCheckBox
	SimpleCheckBox.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSimpleCheckBox
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMSimpleCheckBox
	SimpleCheckBox.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSimpleCheckBox
	SimpleCheckBox.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMSimpleCheckBox
	SimpleCheckBox.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMSimpleCheckBox
	SimpleCheckBox.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMSimpleCheckBox
	SimpleCheckBox.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSimpleCheckBox
	SimpleCheckBox.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMSimpleCheckBox
	SimpleCheckBox.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMSimpleCheckBox
	SimpleCheckBox.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSimpleCheckBox
SimpleCheckBox.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMSimpleCheckBox
SimpleCheckBox.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMSimpleCheckBox
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMSimpleCheckBox
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub