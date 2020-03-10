B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Form As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public Container As VMContainer
End Sub

'initialize the Form
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMForm
	ID = sid.tolowercase
	Form.Initialize(v, ID)
	Form.SetTag("v-form")
	DesignMode = False
	Module = eventHandler
	vue = v
	'set the vmodel to be the form name
	SetVModel(ID)
	'make the vmodel false
	vue.SetStateSingle(ID, False)'
	Container.Initialize(vue, $"${ID}cont"$, Module)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMForm
	Form.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMForm
	Form.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMForm
	Form.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMForm
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMForm
	Form.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMForm
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	
	Container.Pop(Form)
	Return Form.ToString
End Sub


'apply a theme to an element
Sub UseTheme(themeName As String) As VMForm
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMForm
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Form.Bind(":color", pp)
	Return Me
End Sub

Sub SetVModel(k As String) As VMForm
	Form.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMForm
	Form.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMForm
	Form.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMForm
	Dim childHTML As String = child.ToString
	Form.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMForm
	Form.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMForm
	Form.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMForm
	Form.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMForm
	Form.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set lazy-validation
Sub SetLazyValidation(varLazyValidation As Object) As VMForm
	Dim pp As String = $"${ID}LazyValidation"$
	vue.SetStateSingle(pp, varLazyValidation)
	Form.Bind(":lazy-validation", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMForm
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	Form.Bind(":value", pp)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMForm
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
Sub SetOnSubmit(methodName As String) As VMForm
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:submit": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMForm
	vue.SetStateSingle($"${ID}show"$, False)
	Return Me
End Sub

Sub Show As VMForm
	vue.SetStateSingle($"${ID}show"$, True)
	Return Me
End Sub

Sub Enable As VMForm
	vue.SetStateSingle($"${ID}disabled"$, False)
	Return Me
End Sub

Sub Disable As VMForm
	vue.SetStateSingle($"${ID}disabled"$, True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMForm
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMForm
	Form.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMForm
	Form.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMForm
	Form.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMForm
	Form.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMForm
	Form.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMForm
	Form.SetName(varName, bbind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMForm
	Form.SetDisabled(b)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMForm
	Form.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMForm
	Form.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub SetHeight(h As String) As VMForm
	Form.SetStyleSingle("height", h)
	Return Me
End Sub


Sub SetWidth(w As String) As VMForm
	Form.SetStyleSingle("width", w)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

