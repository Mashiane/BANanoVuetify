B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ProgressCircular As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the ProgressCircular
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMProgressCircular
	ID = sid.tolowercase
	ProgressCircular.Initialize(v, ID)
	ProgressCircular.SetTag("v-progress-circular")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMProgressCircular
	ProgressCircular.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMProgressCircular
	ProgressCircular.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMProgressCircular
	ProgressCircular.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMProgressCircular
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMProgressCircular
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return ProgressCircular.ToString
End Sub

Sub SetVModel(k As String) As VMProgressCircular
	ProgressCircular.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMProgressCircular
	ProgressCircular.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMProgressCircular
	ProgressCircular.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMProgressCircular
	Dim childHTML As String = child.ToString
	ProgressCircular.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMProgressCircular
	ProgressCircular.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMProgressCircular
	ProgressCircular.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMProgressCircular
	ProgressCircular.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMProgressCircular
	ProgressCircular.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set button
Sub SetButton(varButton As Object) As VMProgressCircular
	Dim pp As String = $"${ID}Button"$
	vue.SetStateSingle(pp, varButton)
	ProgressCircular.Bind(":button", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMProgressCircular
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ProgressCircular.Bind(":color", pp)
	Return Me
End Sub

'set indeterminate
Sub SetIndeterminate(varIndeterminate As Object) As VMProgressCircular
	Dim pp As String = $"${ID}Indeterminate"$
	vue.SetStateSingle(pp, varIndeterminate)
	ProgressCircular.Bind(":indeterminate", pp)
	Return Me
End Sub

'set rotate
Sub SetRotate(varRotate As Object) As VMProgressCircular
	Dim pp As String = $"${ID}Rotate"$
	vue.SetStateSingle(pp, varRotate)
	ProgressCircular.Bind(":rotate", pp)
	Return Me
End Sub

'set size
Sub SetSize(varSize As Object) As VMProgressCircular
	Dim pp As String = $"${ID}Size"$
	vue.SetStateSingle(pp, varSize)
	ProgressCircular.Bind(":size", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMProgressCircular
	ProgressCircular.SetValue(varValue, False)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMProgressCircular
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	ProgressCircular.Bind(":width", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMProgressCircular
	ProgressCircular.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMProgressCircular
	ProgressCircular.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMProgressCircular
	ProgressCircular.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMProgressCircular
	ProgressCircular.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMProgressCircular
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMProgressCircular
	ProgressCircular.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMProgressCircular
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMProgressCircular
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	ProgressCircular.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMProgressCircular
	ProgressCircular.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMProgressCircular
	ProgressCircular.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMProgressCircular
	ProgressCircular.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMProgressCircular
	ProgressCircular.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMProgressCircular
	ProgressCircular.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMProgressCircular
	ProgressCircular.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMProgressCircular
	ProgressCircular.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMProgressCircular
	ProgressCircular.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMProgressCircular
	ProgressCircular.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMProgressCircular
ProgressCircular.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMProgressCircular
ProgressCircular.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMProgressCircular
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMProgressCircular
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub