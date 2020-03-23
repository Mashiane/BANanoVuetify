B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CircleCounter As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the CircleCounter
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCircleCounter
	ID = sid.tolowercase
	CircleCounter.Initialize(v, ID)
	CircleCounter.SetTag("circle-counter")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return CircleCounter.ToString
End Sub

Sub SetVModel(k As String) As VMCircleCounter
	CircleCounter.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCircleCounter
	CircleCounter.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCircleCounter
	CircleCounter.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCircleCounter
	Dim childHTML As String = child.ToString
	CircleCounter.SetText(childHTML)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCircleCounter
	CircleCounter.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCircleCounter
	CircleCounter.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCircleCounter
	CircleCounter.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set width and height of the element
Sub SetSize(varSize As String) As VMCircleCounter
	Dim pp As String = $"${ID}Size"$
	vue.SetStateSingle(pp, varSize)
	CircleCounter.Bind(":size", pp)
	Return Me
End Sub

'set total number of dashes
Sub SetDashCount(varDashCount As Int) As VMCircleCounter
	Dim pp As String = $"${ID}DashCount"$
	vue.SetStateSingle(pp, BANano.parseInt(varDashCount))
	CircleCounter.Bind(":dash-count", pp)
	Return Me
End Sub

'set number of dashes on top
Sub SetActiveCount(varActiveCount As Int) As VMCircleCounter
	Dim pp As String = $"${ID}ActiveCount"$
	vue.SetStateSingle(pp, BANano.parseInt(varActiveCount))
	CircleCounter.Bind(":active-count", pp)
	Return Me
End Sub

'set bottom stroke width as a percentage of the radius
Sub SetStrokeWidth(varStrokeWidth As Int) As VMCircleCounter
	Dim pp As String = $"${ID}StrokeWidth"$
	vue.SetStateSingle(pp, BANano.parseInt(varStrokeWidth))
	CircleCounter.Bind(":stroke-width", pp)
	Return Me
End Sub

'set stroke color of the bottom dashes
Sub SetStroke(varStroke As String) As VMCircleCounter
	Dim pp As String = $"${ID}Stroke"$
	vue.SetStateSingle(pp, varStroke)
	CircleCounter.Bind(":stroke", pp)
	Return Me
End Sub

'set stroke color of the top dashes
Sub SetActiveStroke(varActiveStroke As String) As VMCircleCounter
	Dim pp As String = $"${ID}ActiveStroke"$
	vue.SetStateSingle(pp, varActiveStroke)
	CircleCounter.Bind(":active-stroke", pp)
	Return Me
End Sub

'set stroke stroke color as a percentage of the radius
Sub SetActiveWidth(varActiveWidth As String) As VMCircleCounter
	Dim pp As String = $"${ID}activewidth"$
	vue.SetStateSingle(pp, varActiveWidth)
	CircleCounter.Bind(":active-width", pp)
	Return Me
End Sub


'set fraction of the width taken up by space between dashes
Sub SetDashSpacing(varDashSpacing As Double) As VMCircleCounter
	Dim pp As String = $"${ID}DashSpacing"$
	vue.SetStateSingle(pp, BANano.parseFloat(varDashSpacing))
	CircleCounter.Bind(":dash-spacing", pp)
	Return Me
End Sub

'set degress rotateion for sart angle
Sub SetRotate(varStart As Int) As VMCircleCounter
	Dim pp As String = $"${ID}rotate"$
	vue.SetStateSingle(pp, BANano.parseInt(varStart))
	CircleCounter.Bind(":rotate", pp)
	Return Me
End Sub

'set reverse the direction of the counting
Sub SetReverse(varEnd As Int) As VMCircleCounter
	Dim pp As String = $"${ID}reverse"$
	vue.SetStateSingle(pp, BANano.parseInt(varEnd))
	CircleCounter.Bind(":reverse", pp)
	Return Me
End Sub

'set text string to display inside SVG
Sub SetText(varText As String) As VMCircleCounter
	Dim pp As String = $"${ID}Text"$
	vue.SetStateSingle(pp, varText)
	CircleCounter.Bind(":text", pp)
	Return Me
End Sub

'hide the component
Sub Hide As VMCircleCounter
	CircleCounter.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMCircleCounter
	CircleCounter.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMCircleCounter
	CircleCounter.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMCircleCounter
	CircleCounter.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCircleCounter
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMCircleCounter
	CircleCounter.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCircleCounter
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCircleCounter
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	CircleCounter.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMCircleCounter
	CircleCounter.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCircleCounter
	CircleCounter.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMCircleCounter
	CircleCounter.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMCircleCounter
	CircleCounter.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMCircleCounter
	CircleCounter.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCircleCounter
	CircleCounter.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMCircleCounter
	CircleCounter.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMCircleCounter
	CircleCounter.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMCircleCounter
	CircleCounter.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMCircleCounter
	CircleCounter.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMCircleCounter
	CircleCounter.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMCircleCounter
	CircleCounter.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCircleCounter
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMCircleCounter
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMCircleCounter
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMCircleCounter
	CircleCounter.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMCircleCounter
	CircleCounter.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMCircleCounter
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMCircleCounter
	CircleCounter.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMCircleCounter
	CircleCounter.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMCircleCounter
	CircleCounter.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCircleCounter
	CircleCounter.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMCircleCounter
	CircleCounter.SetVisible(b)
	Return Me
End Sub


'set color intensity
Sub SetTextColor(varColor As String) As VMCircleCounter
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMCircleCounter
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub
