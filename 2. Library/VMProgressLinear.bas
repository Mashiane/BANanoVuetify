B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ProgressLinear As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
	Private tmp As VMElement
	Private hasLabel As Boolean
	Private vmodel As String
End Sub

'initialize the ProgressLinear
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMProgressLinear
	ID = sid.tolowercase
	ProgressLinear.Initialize(v, ID)
	ProgressLinear.SetTag("v-progress-linear")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	tmp.Initialize(vue, $"${ID}tmp"$).SetTag("template")
	hasLabel = False
	vmodel = $"${ID}value"$
	SetOnChange(Module, $"${ID}_change"$)
	Return Me
End Sub

'add an element to the page content
Sub AddElement(elm As VMElement)
	ProgressLinear.SetText(elm.ToString)
End Sub

Sub SetOnChange(eventHandler As Object, methodName As String) As VMProgressLinear
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim value As Object
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(value))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub GetValue As String
	Dim svalue As String = vue.GetData(vmodel)
	Return svalue
End Sub

Sub SetData(xprop As String, xValue As Object) As VMProgressLinear
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetLabel(lblText As String) As VMProgressLinear
	hasLabel = True
	tmp.SetAttrSingle("v-slot", "{ value }")
	tmp.SetText($"<strong>{{ Math.ceil(value) }}${lblText}</strong>"$)
	Return Me
End Sub

Sub SetText(lblText As String) As VMProgressLinear
	hasLabel = True
	tmp.SetAttrSingle("v-slot", "{ value }")
	tmp.SetText($"<strong>{{ Math.ceil(value) }}${lblText}</strong>"$)
	Return Me
End Sub


'set color intensity
Sub SetTextColor(varColor As String) As VMProgressLinear
	Dim sColor As String = $"${varColor}--text"$
	tmp.AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMProgressLinear
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	tmp.AddClass(mcolor)
	Return Me
End Sub

'get component
Sub ToString As String
	If hasLabel Then AddComponent(tmp.ToString)
	Return ProgressLinear.ToString
End Sub

Sub SetVModel(k As String) As VMProgressLinear
	vmodel = k.tolowercase
	ProgressLinear.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMProgressLinear
	ProgressLinear.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMProgressLinear
	ProgressLinear.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMProgressLinear
	Dim childHTML As String = child.ToString
	ProgressLinear.SetText(childHTML)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMProgressLinear
	ProgressLinear.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMProgressLinear
	ProgressLinear.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMProgressLinear
	ProgressLinear.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set absolute
Sub SetAbsolute(varAbsolute As Boolean) As VMProgressLinear
	If varAbsolute = False Then Return Me
	If bStatic Then
		SetAttrSingle("absolute", varAbsolute)
		Return Me
	End If
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	ProgressLinear.Bind(":absolute", pp)
	Return Me
End Sub

'set reactive
Sub SetReactive(varReactive As Boolean) As VMProgressLinear
	If varReactive = False Then Return Me
	If bStatic Then
		SetAttrSingle("reactive", varReactive)
		Return Me
	End If
	Dim pp As String = $"${ID}Reactive"$
	vue.SetStateSingle(pp, varReactive)
	ProgressLinear.Bind(":reactive", pp)
	Return Me
End Sub

'set active
Sub SetActive(varActive As Boolean) As VMProgressLinear
	If bStatic Then
		SetAttrSingle("active", varActive)
		Return Me
	End If
	Dim pp As String = $"${ID}Active"$
	vue.SetStateSingle(pp, varActive)
	ProgressLinear.Bind(":active", pp)
	Return Me
End Sub

'set bottom
Sub SetBottom(varBottom As Boolean) As VMProgressLinear
	If varBottom = False Then Return Me
	If bStatic Then
		SetAttrSingle("bottom", varBottom)
		Return Me
	End If
	Dim pp As String = $"${ID}Bottom"$
	vue.SetStateSingle(pp, varBottom)
	ProgressLinear.Bind(":bottom", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMProgressLinear
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ProgressLinear.Bind(":dark", pp)
	Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Boolean) As VMProgressLinear
	If varFixed = False Then Return Me
	If bStatic Then
		SetAttrSingle("fixed", varFixed)
		Return Me
	End If
	Dim pp As String = $"${ID}Fixed"$
	vue.SetStateSingle(pp, varFixed)
	ProgressLinear.Bind(":fixed", pp)
	Return Me
End Sub

'set indeterminate
Sub SetIndeterminate(varIndeterminate As Boolean) As VMProgressLinear
	If bStatic Then
		SetAttrSingle("indeterminate", varIndeterminate)
		Return Me
	End If
	Dim pp As String = $"${ID}Indeterminate"$
	vue.SetStateSingle(pp, varIndeterminate)
	ProgressLinear.Bind(":indeterminate", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMProgressLinear
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ProgressLinear.Bind(":light", pp)
	Return Me
End Sub

'set query
Sub SetQuery(varQuery As Boolean) As VMProgressLinear
	If varQuery = False Then Return Me
	If bStatic Then
		SetAttrSingle("query", varQuery)
		Return Me
	End If
	Dim pp As String = $"${ID}Query"$
	vue.SetStateSingle(pp, varQuery)
	ProgressLinear.Bind(":query", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Boolean) As VMProgressLinear
	If varRounded = False Then Return Me
	If bStatic Then
		SetAttrSingle("rounded", varRounded)
		Return Me
	End If
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	ProgressLinear.Bind(":rounded", pp)
	Return Me
End Sub

'set stream
Sub SetStream(varStream As Boolean) As VMProgressLinear
	If varStream = False Then Return Me
	If bStatic Then
		SetAttrSingle("stream", varStream)
		Return Me
	End If
	Dim pp As String = $"${ID}Stream"$
	vue.SetStateSingle(pp, varStream)
	ProgressLinear.Bind(":stream", pp)
	Return Me
End Sub

'set striped
Sub SetStriped(varStriped As Boolean) As VMProgressLinear
	If varStriped = False Then Return Me
	If bStatic Then
		SetAttrSingle("striped", varStriped)
		Return Me
	End If
	Dim pp As String = $"${ID}Striped"$
	vue.SetStateSingle(pp, varStriped)
	ProgressLinear.Bind(":striped", pp)
	Return Me
End Sub

'set top
Sub SetTop(varTop As Boolean) As VMProgressLinear
	If varTop = False Then Return Me
	If bStatic Then
		SetAttrSingle("top", varTop)
		Return Me
	End If
	Dim pp As String = $"${ID}Top"$
	vue.SetStateSingle(pp, varTop)
	ProgressLinear.Bind(":top", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As String) As VMProgressLinear
	If varBackgroundColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("background-color", varBackgroundColor)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	ProgressLinear.Bind(":background-color", pp)
	Return Me
End Sub

'set background-opacity
Sub SetBackgroundOpacity(varBackgroundOpacity As String) As VMProgressLinear
	If varBackgroundOpacity = "" Then Return Me
	If bStatic Then
		SetAttrSingle("background-opacity", varBackgroundOpacity)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundOpacity"$
	vue.SetStateSingle(pp, varBackgroundOpacity)
	ProgressLinear.Bind(":background-opacity", pp)
	Return Me
End Sub

'set buffer-value
Sub SetBufferValue(varBufferValue As String) As VMProgressLinear
	If bStatic Then
		SetAttrSingle("buffer-value", varBufferValue)
		Return Me
	End If
	Dim pp As String = $"${ID}BufferValue"$
	vue.SetStateSingle(pp, varBufferValue)
	ProgressLinear.Bind(":buffer-value", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMProgressLinear
	If varColor = "" Then Return Me
	If varColor = "primary" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ProgressLinear.Bind(":color", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMProgressLinear
	If varHeight = "" Then Return Me
	If varHeight = "4" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	ProgressLinear.Bind(":height", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMProgressLinear
	If bStatic Then
		SetAttrSingle("value", varValue)
		Return Me
	End If
	If vmodel = "" Then
		vmodel = $"${ID}value"$
		SetVModel(vmodel)
	End If
	vue.SetData(vmodel, varValue)
	Return Me
End Sub

'hide the component
Sub Hide As VMProgressLinear
	SetActive(False)
	Return Me
End Sub

'show the component
Sub Show As VMProgressLinear
	SetActive(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMProgressLinear
	ProgressLinear.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMProgressLinear
	ProgressLinear.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMProgressLinear
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMProgressLinear
	ProgressLinear.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMProgressLinear
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMProgressLinear
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	ProgressLinear.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMProgressLinear
	ProgressLinear.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMProgressLinear
	ProgressLinear.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMProgressLinear
	ProgressLinear.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMProgressLinear
	ProgressLinear.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMProgressLinear
	ProgressLinear.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMProgressLinear
	ProgressLinear.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMProgressLinear
	ProgressLinear.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMProgressLinear
	ProgressLinear.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMProgressLinear
	ProgressLinear.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMProgressLinear
	ProgressLinear.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMProgressLinear
	ProgressLinear.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMProgressLinear
	ProgressLinear.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMProgressLinear
	ProgressLinear.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMProgressLinear
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMProgressLinear
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMProgressLinear
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMProgressLinear
	ProgressLinear.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMProgressLinear
	ProgressLinear.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMProgressLinear
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMProgressLinear
	ProgressLinear.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMProgressLinear
	ProgressLinear.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMProgressLinear
	ProgressLinear.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMProgressLinear
	ProgressLinear.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMProgressLinear
	ProgressLinear.SetVisible(b)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColorIntensity(varBackgroundColor As String, varBackgroundColorIntensity As String) As VMProgressLinear
	If varBackgroundColor = "" Then Return Me
	Dim mcolor As String = $"${varBackgroundColor} ${varBackgroundColorIntensity}"$
	If bStatic Then
		SetAttrSingle("background-color", mcolor)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, mcolor)
	ProgressLinear.Bind(":background-color", pp)
	Return Me
End Sub
