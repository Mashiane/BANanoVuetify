B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public SnackBar As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public Button As VMButton
	Private mKey As String
	Private mName As String
End Sub

'initialize the SnackBar
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSnackBar
	ID = sid.tolowercase
	SnackBar.Initialize(v, ID)
	SnackBar.SetTag("v-snackbar").SetVModel(ID)
	DesignMode = False
	Module = eventHandler
	vue = v
	mKey = $"${ID}message"$
	vue.SetStateSingle(mKey, Null)
	SetText($"{{ ${mKey} }}"$)
	Button.Initialize(vue, "snackbutton", Me).SetColor("")
	Button.hide
	Button.SetLabel("Ok")
	Hide
	mName = ""
	SetTop(False)
	SetBottom(False)
	SetRight(False)
	SetLeft(False)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSnackBar
	SnackBar.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSnackBar
	SnackBar.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSnackBar
	SnackBar.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSnackBar
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub Reset
	SetBottom(False)
	SetLeft(False)
	SetTop(False)
	SetRight(False)
End Sub

Sub SetBottomLeft(b As Boolean) As VMSnackBar
	If b = False Then Return Me
	SetBottom(True)
	SetLeft(True)
	SetTop(False)
	SetRight(False)
	Return Me
End Sub

Sub SetBottomRight(b As Boolean) As VMSnackBar
	If b = False Then Return Me
	SetBottom(True)
	SetLeft(False)
	SetTop(False)
	SetRight(True)
	Return Me
End Sub

Sub SetTopLeft(b As Boolean) As VMSnackBar
	If b = False Then Return Me
	SetBottom(False)
	SetLeft(True)
	SetTop(True)
	SetRight(False)
	Return Me
End Sub

Sub SetTopRight(b As Boolean) As VMSnackBar
	If b = False Then Return Me
	SetBottom(False)
	SetLeft(False)
	SetTop(True)
	SetRight(True)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMSnackBar
	SnackBar.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSnackBar
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set the click method for the button
Sub SetOnClick(methodName As String) As VMSnackBar
	mName = methodName.ToLowerCase
	Button.show
	Return Me
End Sub

Sub snackbutton_click(e As BANanoEvent)
	If mName = "" Then
		Log($"VMSnackbar.snackbutton_click: 'SetOnClick' has not been set!"$)
	End If
	Hide
	BANano.CallSub(Module, mName, Null)
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMSnackBar
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMSnackBar
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	SnackBar.Bind(":color", pp)
	Return Me
End Sub


'get component
Sub ToString As String
	
	
	Button.Pop(SnackBar)
	Return SnackBar.ToString
End Sub

Sub SetVModel(k As String) As VMSnackBar
	SnackBar.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMSnackBar
	SnackBar.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSnackBar
	SnackBar.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSnackBar
	Dim childHTML As String = child.ToString
	SnackBar.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMSnackBar
	SnackBar.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSnackBar
	SnackBar.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSnackBar
	SnackBar.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSnackBar
	SnackBar.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set absolute
Sub SetAbsolute(varAbsolute As Object) As VMSnackBar
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	SnackBar.Bind(":absolute", pp)
	Return Me
End Sub

'set bottom
Sub SetBottom(varBottom As Boolean) As VMSnackBar
	Dim pp As String = $"${ID}Bottom"$
	vue.SetStateSingle(pp, varBottom)
	SnackBar.Bind(":bottom", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMSnackBar
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	SnackBar.Bind(":color", pp)
	Return Me
End Sub

'set left
Sub SetLeft(varLeft As Boolean) As VMSnackBar
	Dim pp As String = $"${ID}Left"$
	vue.SetStateSingle(pp, varLeft)
	SnackBar.Bind(":left", pp)
	Return Me
End Sub

'set multi-line
Sub SetMultiLine(varMultiLine As Object) As VMSnackBar
	Dim pp As String = $"${ID}MultiLine"$
	vue.SetStateSingle(pp, varMultiLine)
	SnackBar.Bind(":multi-line", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Boolean) As VMSnackBar
	Dim pp As String = $"${ID}Right"$
	vue.SetStateSingle(pp, varRight)
	SnackBar.Bind(":right", pp)
	Return Me
End Sub

'set timeout
Sub SetTimeout(varTimeout As Object) As VMSnackBar
	Dim pp As String = $"${ID}Timeout"$
	vue.SetStateSingle(pp, varTimeout)
	SnackBar.Bind(":timeout", pp)
	Return Me
End Sub

'set top
Sub SetTop(varTop As Boolean) As VMSnackBar
	Dim pp As String = $"${ID}Top"$
	vue.SetStateSingle(pp, varTop)
	SnackBar.Bind(":top", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMSnackBar
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	SnackBar.Bind(":value", pp)
	Return Me
End Sub

'set vertical
Sub SetVertical(varVertical As Object) As VMSnackBar
	Dim pp As String = $"${ID}Vertical"$
	vue.SetStateSingle(pp, varVertical)
	SnackBar.Bind(":vertical", pp)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMSnackBar
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMSnackBar
	vue.SetStateSingle(ID, False)
	Return Me
End Sub

Sub Show As VMSnackBar
	vue.SetStateSingle(ID, True)
	Return Me
End Sub

Sub Enable As VMSnackBar
	SnackBar.Enable(True)
	Return Me
End Sub

Sub Disable As VMSnackBar
	SnackBar.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSnackBar
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMSnackBar
	SnackBar.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSnackBar
	SnackBar.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMSnackBar
	SnackBar.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMSnackBar
	SnackBar.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMSnackBar
	SnackBar.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSnackBar
	SnackBar.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMSnackBar
	SnackBar.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMSnackBar
	SnackBar.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSnackBar
SnackBar.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub