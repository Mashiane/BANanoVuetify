B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public SlideItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
End Sub

'initialize the Item
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSlideItem
	ID = sid.tolowercase
	SlideItem.Initialize(v, ID)
	SlideItem.SetTag("v-slide-item")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	Return Me
End Sub

Sub SetActiveToggle As VMSlideItem
	SetAttrSingle("v-slot:default", "{ active, toggle }")
	Return Me
End Sub


Sub AddComponent(comp As String) As VMSlideItem
	SetText(comp)
	Return Me
End Sub

Sub AddElement(elID As String, elTag As String, elText As String, mprops As Map, mstyles As Map, lclasses As List) As VMSlideItem
	Dim d As VMElement
	d.Initialize(vue,elID).SetDesignMode(DesignMode).SetTag(elTag)
	d.SetText(elText)
	d.BuildModel(mprops, mstyles, lclasses, Null)
	SetText(d.ToString)
	Return Me
End Sub


Sub SetText(txt As String) As VMSlideItem
	SlideItem.SetText(txt)
	Return Me
End Sub

'get component
Sub ToString As String
	Return SlideItem.ToString
End Sub

Sub SetData(xprop As String, xValue As Object) As VMSlideItem
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetVModel(k As String) As VMSlideItem
	SlideItem.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMSlideItem
	SlideItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMSlideItem
	SlideItem.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSlideItem
	Dim childHTML As String = child.ToString
	SlideItem.SetText(childHTML)
	Return Me
End Sub


'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSlideItem
	SlideItem.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSlideItem
	SlideItem.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSlideItem
	SlideItem.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMSlideItem
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	SlideItem.Bind(":active-class", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMSlideItem
	If varValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("value", varValue)
		Return Me
	End If
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	SlideItem.Bind(":value", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMSlideItem
	If varDisabled = False Then Return Me
	If bStatic Then
		SetAttrSingle("disabled", varDisabled)
		Return Me
	End If
	Dim pp As String = $"${ID}Disabled"$
	vue.SetStateSingle(pp, varDisabled)
	SlideItem.Bind(":disabled", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMSlideItem
	SlideItem.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMSlideItem
	SlideItem.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMSlideItem
	SlideItem.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMSlideItem
	SlideItem.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSlideItem
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMSlideItem
	SlideItem.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMSlideItem
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMSlideItem
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	SlideItem.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMSlideItem
	SlideItem.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSlideItem
	SlideItem.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMSlideItem
	SlideItem.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMSlideItem
	SlideItem.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMSlideItem
	SlideItem.SetStatic(b)
	bStatic = b
	Return Me
End Sub


'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMSlideItem
	SlideItem.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMSlideItem
	SlideItem.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMSlideItem
	SlideItem.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMSlideItem
	SlideItem.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMSlideItem
	SlideItem.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMSlideItem
	SlideItem.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMSlideItem
	SlideItem.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSlideItem
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(eitem As String, dataSource As String) As VMSlideItem
	dataSource = dataSource.tolowercase
	eitem = eitem.tolowercase
	Dim sline As String = $"${eitem} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMSlideItem
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSlideItem
	SlideItem.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSlideItem
	SlideItem.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSlideItem
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSlideItem
	SlideItem.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub SetTextCenter As VMSlideItem
	SlideItem.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSlideItem
	SlideItem.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMSlideItem
	SlideItem.SetVisible(b)
	Return Me
End Sub


'set color intensity - built in
Sub SetTextColor(textcolor As String) As VMSlideItem
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColorIntensity(textcolor As String, textintensity As String) As VMSlideItem
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Dim sIntensity As String = $"text--${textintensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub
