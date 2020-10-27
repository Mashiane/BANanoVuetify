B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ExpandTransition As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
End Sub

'initialize the ExpandTransition
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMExpandTransition
	ID = sid.tolowercase
	ExpandTransition.Initialize(v, ID)
	ExpandTransition.SetTag("v-expand-transition")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	ExpandTransition.SetText(elm.ToString)
End Sub


Sub AddElement1(elID As String, elTag As String, elText As String, mprops As Map, mstyles As Map, lclasses As List) As VMExpandTransition
	Dim d As VMElement
	d.Initialize(vue,elID).SetDesignMode(DesignMode).SetTag(elTag)
	d.SetText(elText)
	d.BuildModel(mprops, mstyles, lclasses, Null)
	SetText(d.ToString)
	Return Me
End Sub


Sub SetData(xprop As String, xValue As Object) As VMExpandTransition
	vue.SetData(xprop, xValue)
	Return Me
End Sub

'add a child element
Sub SetText(child As String)
	ExpandTransition.SetText(child)
End Sub

'get component
Sub ToString As String
	Return ExpandTransition.ToString
End Sub

Sub SetVModel(k As String) As VMExpandTransition
	ExpandTransition.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMExpandTransition
	ExpandTransition.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMExpandTransition
	ExpandTransition.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMExpandTransition
	Dim childHTML As String = child.ToString
	ExpandTransition.SetText(childHTML)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMExpandTransition
	ExpandTransition.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMExpandTransition
	ExpandTransition.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMExpandTransition
	ExpandTransition.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set mode
Sub SetMode(varMode As String) As VMExpandTransition
	If varMode = "" Then Return Me
	If varMode = "out-in" Then Return Me
	If bStatic Then
		SetAttrSingle("mode", varMode)
		Return Me
	End If
	Dim pp As String = $"${ID}Mode"$
	vue.SetStateSingle(pp, varMode)
	ExpandTransition.Bind(":mode", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMExpandTransition
	ExpandTransition.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMExpandTransition
	ExpandTransition.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMExpandTransition
	ExpandTransition.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMExpandTransition
	ExpandTransition.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMExpandTransition
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMExpandTransition
	ExpandTransition.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMExpandTransition
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMExpandTransition
	ExpandTransition.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMExpandTransition
	ExpandTransition.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMExpandTransition
	ExpandTransition.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMExpandTransition
	ExpandTransition.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMExpandTransition
	ExpandTransition.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMExpandTransition
	ExpandTransition.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMExpandTransition
	ExpandTransition.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMExpandTransition
	ExpandTransition.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMExpandTransition
	ExpandTransition.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMExpandTransition
	ExpandTransition.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMExpandTransition
	ExpandTransition.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMExpandTransition
	ExpandTransition.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMExpandTransition
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMExpandTransition
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMExpandTransition
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMExpandTransition
	ExpandTransition.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMExpandTransition
	ExpandTransition.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMExpandTransition
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMExpandTransition
	ExpandTransition.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMExpandTransition
	ExpandTransition.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMExpandTransition
	ExpandTransition.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMExpandTransition
	ExpandTransition.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMExpandTransition
	ExpandTransition.SetVisible(b)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColor(textcolor As String) As VMExpandTransition
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColorIntensity(textcolor As String, textintensity As String) As VMExpandTransition
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Dim sIntensity As String = $"text--${textintensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub
