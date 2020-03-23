B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ArcCounter As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the ArcCounter
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMArcCounter
	ID = sid.tolowercase
	ArcCounter.Initialize(v, ID)
	ArcCounter.SetTag("arc-counter")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return ArcCounter.ToString
End Sub

Sub SetVModel(k As String) As VMArcCounter
	ArcCounter.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMArcCounter
	ArcCounter.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMArcCounter
	ArcCounter.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMArcCounter
	Dim childHTML As String = child.ToString
	ArcCounter.SetText(childHTML)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMArcCounter
	ArcCounter.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMArcCounter
	ArcCounter.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMArcCounter
	ArcCounter.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set width and height of the element
Sub SetSize(varSize As String) As VMArcCounter
	Dim pp As String = $"${ID}Size"$
	vue.SetStateSingle(pp, varSize)
	ArcCounter.Bind(":size", pp)
	Return Me
End Sub

'set total number of dashes
Sub SetDashCount(varDashCount As Int) As VMArcCounter
	Dim pp As String = $"${ID}DashCount"$
	vue.SetStateSingle(pp, BANano.parseInt(varDashCount))
	ArcCounter.Bind(":dash-count", pp)
	Return Me
End Sub

'set number of dashes on top
Sub SetActiveCount(varActiveCount As Int) As VMArcCounter
	Dim pp As String = $"${ID}ActiveCount"$
	vue.SetStateSingle(pp, BANano.parseInt(varActiveCount))
	ArcCounter.Bind(":active-count", pp)
	Return Me
End Sub

'set bottom stroke width as a percentage of the radius
Sub SetStrokeWidth(varStrokeWidth As Int) As VMArcCounter
	Dim pp As String = $"${ID}StrokeWidth"$
	vue.SetStateSingle(pp, BANano.parseInt(varStrokeWidth))
	ArcCounter.Bind(":stroke-width", pp)
	Return Me
End Sub

'set top stroke width as a percentage of the radius
Sub SetActiveWidth(varActiveWidth As Int) As VMArcCounter
	Dim pp As String = $"${ID}ActiveWidth"$
	vue.SetStateSingle(pp, BANano.parseInt(varActiveWidth))
	ArcCounter.Bind(":active-width", pp)
	Return Me
End Sub

'set stroke color of the bottom dashes
Sub SetStroke(varStroke As String) As VMArcCounter
	Dim pp As String = $"${ID}Stroke"$
	vue.SetStateSingle(pp, varStroke)
	ArcCounter.Bind(":stroke", pp)
	Return Me
End Sub

'set stroke color of the top dashes
Sub SetActiveStroke(varActiveStroke As String) As VMArcCounter
	Dim pp As String = $"${ID}ActiveStroke"$
	vue.SetStateSingle(pp, varActiveStroke)
	ArcCounter.Bind(":active-stroke", pp)
	Return Me
End Sub

'set fraction of the width taken up by space between dashes
Sub SetDashSpacing(varDashSpacing As Double) As VMArcCounter
	Dim pp As String = $"${ID}DashSpacing"$
	vue.SetStateSingle(pp, BANano.parseFloat(varDashSpacing))
	ArcCounter.Bind(":dash-spacing", pp)
	Return Me
End Sub

'set start angle from top
Sub SetStart(varStart As Int) As VMArcCounter
	Dim pp As String = $"${ID}Start"$
	vue.SetStateSingle(pp, BANano.parseInt(varStart))
	ArcCounter.Bind(":start", pp)
	Return Me
End Sub

'set end angle from top
Sub SetEnd(varEnd As Int) As VMArcCounter
	Dim pp As String = $"${ID}End"$
	vue.SetStateSingle(pp, BANano.parseInt(varEnd))
	ArcCounter.Bind(":end", pp)
	Return Me
End Sub

'set text string to display inside SVG
Sub SetText(varText As String) As VMArcCounter
	Dim pp As String = $"${ID}Text"$
	vue.SetStateSingle(pp, varText)
	ArcCounter.Bind(":text", pp)
	Return Me
End Sub

'set horizontal position of the svg text
Sub SetTextX(varTextX As String) As VMArcCounter
	Dim pp As String = $"${ID}TextX"$
	vue.SetStateSingle(pp, varTextX)
	ArcCounter.Bind(":text-x", pp)
	Return Me
End Sub

'set vertical position of the svg text string
Sub SetTextY(varTextY As String) As VMArcCounter
	Dim pp As String = $"${ID}TextY"$
	vue.SetStateSingle(pp, varTextY)
	ArcCounter.Bind(":text-y", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMArcCounter
	ArcCounter.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMArcCounter
	ArcCounter.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMArcCounter
	ArcCounter.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMArcCounter
	ArcCounter.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMArcCounter
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMArcCounter
	ArcCounter.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMArcCounter
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMArcCounter
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	ArcCounter.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMArcCounter
	ArcCounter.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMArcCounter
	ArcCounter.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMArcCounter
	ArcCounter.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMArcCounter
	ArcCounter.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMArcCounter
	ArcCounter.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMArcCounter
	ArcCounter.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMArcCounter
	ArcCounter.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMArcCounter
	ArcCounter.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMArcCounter
	ArcCounter.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMArcCounter
	ArcCounter.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMArcCounter
	ArcCounter.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMArcCounter
	ArcCounter.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMArcCounter
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMArcCounter
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMArcCounter
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMArcCounter
	ArcCounter.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMArcCounter
	ArcCounter.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMArcCounter
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMArcCounter
	ArcCounter.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMArcCounter
	ArcCounter.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMArcCounter
	ArcCounter.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMArcCounter
	ArcCounter.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMArcCounter
	ArcCounter.SetVisible(b)
	Return Me
End Sub


'set color intensity
Sub SetTextColor(varColor As String) As VMArcCounter
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMArcCounter
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub
