B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Responsive As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean    'ignore
	Private Module As Object         'ignore
End Sub

'initialize the Responsive
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMResponsive
	ID = sid.tolowercase
	Responsive.Initialize(v, ID)
	Responsive.SetTag("v-responsive")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMResponsive
	vue.SetData(xprop, xValue)
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	Responsive.SetText(elm.ToString)
End Sub

'get component
Sub ToString As String
	Return Responsive.ToString
End Sub

Sub SetVModel(k As String) As VMResponsive
	Responsive.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMResponsive
	Responsive.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMResponsive
	Responsive.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMResponsive
	Dim childHTML As String = child.ToString
	Responsive.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMResponsive
	Responsive.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMResponsive
	Responsive.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr as map) As VMResponsive
	Responsive.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMResponsive
	Responsive.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set aspect-ratio
Sub SetAspectRatio(varAspectRatio As Object) As VMResponsive
	Dim pp As String = $"${ID}AspectRatio"$
	vue.SetStateSingle(pp, varAspectRatio)
	Responsive.Bind(":aspect-ratio", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMResponsive
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Responsive.Bind(":height", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As Object) As VMResponsive
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	Responsive.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As Object) As VMResponsive
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Responsive.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As Object) As VMResponsive
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	Responsive.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As Object) As VMResponsive
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	Responsive.Bind(":min-width", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMResponsive
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	Responsive.Bind(":width", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMResponsive
	Responsive.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMResponsive
	Responsive.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMResponsive
	Responsive.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMResponsive
	Responsive.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMResponsive
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMResponsive
	Responsive.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMResponsive
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMResponsive
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Responsive.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMResponsive
	Responsive.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMResponsive
	Responsive.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMResponsive
	Responsive.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMResponsive
	Responsive.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMResponsive
	Responsive.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMResponsive
	Responsive.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMResponsive
	Responsive.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMResponsive
	Responsive.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMResponsive
	Responsive.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMResponsive
	Responsive.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMResponsive
	Responsive.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMResponsive
	Responsive.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMResponsive
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMResponsive
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMResponsive
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMResponsive
	Responsive.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMResponsive
	Responsive.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMResponsive
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMResponsive
	Responsive.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMResponsive
Responsive.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMResponsive
Responsive.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMResponsive
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMResponsive
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub