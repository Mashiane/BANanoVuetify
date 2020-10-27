B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Container As VMContainer
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object
	Private bStatic As Boolean
	Private formValid As String
End Sub

'initialize the Form
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMForm
	ID = sid.tolowercase
	Container.Initialize(v, ID, eventHandler).SetTag("v-form")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	formValid = $"${ID}valid"$
	SetVModel(formValid)
	SetAttrSingle("ref", ID)
	SetValid(True)
	Return Me
End Sub

'add an element to the page content
Sub AddElement(elm As VMElement)
	Container.SetText(elm.ToString)
End Sub

Sub SetVModel(k As String) As VMForm
	Container.SetVModel(k)
	Return Me
End Sub

'set form validity state
Sub SetValid(b As Boolean) As VMForm
	vue.SetData(formValid, b)
	Return Me
End Sub

Sub RemoveVModel As VMForm
	RemoveAttr("v-model")
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMForm
	vue.SetData(xprop, xValue)
	Return Me
End Sub

Sub HasContent As Boolean
	Return Container.hascontent
End Sub

Sub Validate
	vue.refs.GetField(ID).RunMethod("validate", Null)
End Sub

Sub Reset
	vue.refs.GetField(ID).RunMethod("reset", Null)
End Sub

Sub ResetValidation
	vue.refs.GetField(ID).RunMethod("resetValidation", Null)
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMForm
	Container.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMForm
	Container.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMForm
	Container.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMForm
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMForm
	Container.SetAttrLoose(loose)
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
	Return Container.ToString
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

Sub SetVIf(vif As String) As VMForm
	Container.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMForm
	Container.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMForm
	Dim childHTML As String = child.ToString
	Container.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMForm
	Container.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMForm
	Container.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMForm
	Container.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMForm
	Container.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set lazy-validation
Sub SetLazyValidation(varLazyValidation As Boolean) As VMForm
	If bStatic Then
		SetAttrSingle("lazy-validation", varLazyValidation)
		Return Me
	End If
	Dim pp As String = $"${ID}LazyValidation"$
	vue.SetStateSingle(pp, varLazyValidation)
	Container.Bind(":lazy-validation", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Boolean) As VMForm
	vue.SetStateSingle(ID, varValue)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMForm
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnSubmit(methodName As String) As VMForm
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@submit": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMForm
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMForm
	Container.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMForm
	Container.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMForm
	Container.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMForm
	Container.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMForm
	Container.SetStatic(b)
	bStatic = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMForm
	Container.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMForm
	Container.SetName(varName, bbind)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMForm
	Container.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMForm
	Container.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub SetHeight(h As String) As VMForm
	Container.SetStyleSingle("height", h)
	Return Me
End Sub


Sub SetWidth(w As String) As VMForm
	Container.SetStyleSingle("width", w)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMForm
	Container.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

