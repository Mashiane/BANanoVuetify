B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Sparkline As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object      'ignore
	Private bStatic As Boolean
	Private xy As Map
	Private hasXY As Boolean
End Sub

'initialize the Sparkline
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSparkLine
	ID = sid.tolowercase
	Sparkline.Initialize(v, ID)
	Sparkline.SetTag("v-sparkline")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	xy.Initialize 
	hasXY = False
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	Sparkline.SetText(elm.ToString)
End Sub

'add xy values
Sub AddXY(x As String, y As Int) As VMSparkLine
	xy.Put(x, y)
	hasXY = True
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMSparkLine
	vue.SetData(xprop, xValue)
	Return Me
End Sub


'get component
Sub ToString As String
	If hasXY Then
		Dim labels As List
		labels.Initialize 
		Dim values As List
		values.Initialize 
		'
		For Each k As String In xy.Keys
			Dim v As String = xy.Get(k)
			v = BANano.parseInt(v)
			labels.Add(k)
			values.Add(v)
		Next
		SetLabels(labels)
		SetValue(values)
	End If
	Return Sparkline.ToString
End Sub

Sub SetVModel(k As String) As VMSparkLine
	Sparkline.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMSparkLine
	Sparkline.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMSparkLine
	Sparkline.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSparkLine
	Dim childHTML As String = child.ToString
	Sparkline.SetText(childHTML)
	Return Me
End Sub

'set text - built-in
Sub SetText(t As String) As VMSparkLine
	Sparkline.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSparkLine
	Sparkline.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSparkLine
	Sparkline.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSparkLine
	Sparkline.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set value
Sub SetValue(varValue As List) As VMSparkLine
	If bStatic Then	Return Me
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	Sparkline.Bind(":value", pp)
	Return Me
End Sub

'set stroke line cap
Sub SetStrokeLineCap(varValue As String) As VMSparkLine
	If varValue = "" Then Return Me
	If bStatic Then	
		SetAttrSingle("stroke-linecap", varValue)
		Return Me
	End If
	Dim pp As String = $"${ID}StrokeLineCap"$
	vue.SetStateSingle(pp, varValue)
	Sparkline.Bind(":stroke-linecap", pp)
	Return Me
End Sub

'set labels
Sub SetLabels(varLabels As List) As VMSparkLine
	If bStatic Then	Return Me
	Dim pp As String = $"${ID}Labels"$
	vue.SetStateSingle(pp, varLabels)
	Sparkline.Bind(":labels", pp)
	Return Me
End Sub

'set gradient
Sub SetGradient(varGradient As List) As VMSparkLine
	If bStatic Then Return Me
	Dim pp As String = $"${ID}Gradient"$
	vue.SetStateSingle(pp, varGradient)
	Sparkline.Bind(":gradient", pp)
	Return Me
End Sub

'set auto-draw
Sub SetAutoDraw(varAutoDraw As Boolean) As VMSparkLine
	If varAutoDraw = False Then Return Me
	If bStatic Then
		SetAttrSingle("auto-draw", varAutoDraw)
		Return Me
	End If
	Dim pp As String = $"${ID}AutoDraw"$
	vue.SetStateSingle(pp, varAutoDraw)
	Sparkline.Bind(":auto-draw", pp)
	Return Me
End Sub

'set auto-line-width
Sub SetAutoLineWidth(varAutoLineWidth As Boolean) As VMSparkLine
	If varAutoLineWidth = False Then Return Me
	If bStatic Then
		SetAttrSingle("auto-line-width", varAutoLineWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}AutoLineWidth"$
	vue.SetStateSingle(pp, varAutoLineWidth)
	Sparkline.Bind(":auto-line-width", pp)
	Return Me
End Sub

'set fill
Sub SetFill(varFill As Boolean) As VMSparkLine
	If bStatic Then
		SetAttrSingle("fill", varFill)
		Return Me
	End If
	Dim pp As String = $"${ID}Fill"$
	vue.SetStateSingle(pp, varFill)
	Sparkline.Bind(":fill", pp)
	Return Me
End Sub

'set show-labels
Sub SetShowLabels(varShowLabels As Boolean) As VMSparkLine
	If varShowLabels = False Then Return Me
	If bStatic Then
		SetAttrSingle("show-labels", varShowLabels)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowLabels"$
	vue.SetStateSingle(pp, varShowLabels)
	Sparkline.Bind(":show-labels", pp)
	Return Me
End Sub

'set smooth
Sub SetSmooth(varSmooth As Boolean) As VMSparkLine
	If varSmooth = False Then Return Me
	If bStatic Then
		SetAttrSingle("smooth", varSmooth)
		Return Me
	End If
	Dim pp As String = $"${ID}Smooth"$
	vue.SetStateSingle(pp, varSmooth)
	Sparkline.Bind(":smooth", pp)
	Return Me
End Sub

'set auto-draw-duration
Sub SetAutoDrawDuration(varAutoDrawDuration As String) As VMSparkLine
	If varAutoDrawDuration = "" Then Return Me
	If varAutoDrawDuration = "2000" Then Return Me
	If bStatic Then
		SetAttrSingle("auto-draw-duration", varAutoDrawDuration)
		Return Me
	End If
	Dim pp As String = $"${ID}AutoDrawDuration"$
	vue.SetStateSingle(pp, varAutoDrawDuration)
	Sparkline.Bind(":auto-draw-duration", pp)
	Return Me
End Sub

'set auto-draw-easing
Sub SetAutoDrawEasing(varAutoDrawEasing As String) As VMSparkLine
	If varAutoDrawEasing = "" Then Return Me
	If varAutoDrawEasing = "ease" Then Return Me
	If bStatic Then
		SetAttrSingle("auto-draw-easing", varAutoDrawEasing)
		Return Me
	End If
	Dim pp As String = $"${ID}AutoDrawEasing"$
	vue.SetStateSingle(pp, varAutoDrawEasing)
	Sparkline.Bind(":auto-draw-easing", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMSparkLine
	If varColor = "" Then Return Me
	If varColor = "primary" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Sparkline.Bind(":color", pp)
	Return Me
End Sub

'set gradient-direction
Sub SetGradientDirection(varGradientDirection As String) As VMSparkLine
	If varGradientDirection = "" Then Return Me
	If varGradientDirection = "top" Then Return Me
	If bStatic Then
		SetAttrSingle("gradient-direction", varGradientDirection)
		Return Me
	End If
	Dim pp As String = $"${ID}GradientDirection"$
	vue.SetStateSingle(pp, varGradientDirection)
	Sparkline.Bind(":gradient-direction", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMSparkLine
	If varHeight = "" Then Return Me
	If varHeight = "75" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Sparkline.Bind(":height", pp)
	Return Me
End Sub

'set label-size
Sub SetLabelSize(varLabelSize As String) As VMSparkLine
	If varLabelSize = "" Then Return Me
	If varLabelSize = "7" Then Return Me
	If bStatic Then
		SetAttrSingle("label-size", varLabelSize)
		Return Me
	End If
	Dim pp As String = $"${ID}LabelSize"$
	vue.SetStateSingle(pp, varLabelSize)
	Sparkline.Bind(":label-size", pp)
	Return Me
End Sub

'set line-width
Sub SetLineWidth(varLineWidth As String) As VMSparkLine
	If varLineWidth = "" Then Return Me
	If varLineWidth = "4" Then Return Me
	If bStatic Then
		SetAttrSingle("line-width", varLineWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}LineWidth"$
	vue.SetStateSingle(pp, varLineWidth)
	Sparkline.Bind(":line-width", pp)
	Return Me
End Sub

'set padding
Sub SetPadding(varPadding As String) As VMSparkLine
	If varPadding = "" Then Return Me
	If varPadding = "8" Then Return Me
	If bStatic Then
		SetAttrSingle("padding", varPadding)
		Return Me
	End If
	Dim pp As String = $"${ID}Padding"$
	vue.SetStateSingle(pp, varPadding)
	Sparkline.Bind(":padding", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As String) As VMSparkLine
	If varType = "" Then Return Me
	If varType = "trend" Then Return Me
	If bStatic Then
		SetAttrSingle("type", varType)
		Return Me
	End If
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	Sparkline.Bind(":type", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As String) As VMSparkLine
	If varWidth = "" Then Return Me
	If varWidth = "300" Then Return Me
	If bStatic Then
		SetAttrSingle("width", varWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	Sparkline.Bind(":width", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMSparkLine
	Sparkline.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMSparkLine
	Sparkline.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMSparkLine
	Sparkline.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMSparkLine
	Sparkline.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSparkLine
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMSparkLine
	Sparkline.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMSparkLine
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMSparkLine
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Sparkline.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMSparkLine
	Sparkline.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSparkLine
	Sparkline.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMSparkLine
	Sparkline.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMSparkLine
	Sparkline.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMSparkLine
	Sparkline.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMSparkLine
	Sparkline.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMSparkLine
	Sparkline.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMSparkLine
	Sparkline.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMSparkLine
	Sparkline.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMSparkLine
	Sparkline.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMSparkLine
	Sparkline.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMSparkLine
	Sparkline.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMSparkLine
	Sparkline.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSparkLine
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMSparkLine
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMSparkLine
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSparkLine
	Sparkline.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSparkLine
	Sparkline.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSparkLine
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSparkLine
	Sparkline.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMSparkLine
	Sparkline.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMSparkLine
	Sparkline.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSparkLine
	Sparkline.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMSparkLine
	Sparkline.SetVisible(b)
	Return Me
End Sub
