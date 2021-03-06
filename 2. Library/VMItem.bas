﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Item As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
End Sub

'initialize the Item
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMItem
	ID = sid.tolowercase
	Item.Initialize(v, ID)
	Item.SetTag("v-item")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	Item.SetText(elm.ToString)
End Sub

Sub SetActiveToggle As VMItem
	SetAttrSingle("v-slot:default", "{ active, toggle }")
	Return Me
End Sub


Sub AddComponent(comp As String) As VMItem
	SetText(comp)
	Return Me
End Sub


Sub AddElement1(elID As String, elTag As String, elText As String, mprops As Map, mstyles As Map, lclasses As List) As VMItem
	Dim d As VMElement
	d.Initialize(vue,elID).SetDesignMode(DesignMode).SetTag(elTag)
	d.SetText(elText)
	d.BuildModel(mprops, mstyles, lclasses, Null)
	SetText(d.ToString)
	Return Me
End Sub


Sub SetText(txt As String) As VMItem
	Item.SetText(txt)
	Return Me
End Sub

'get component
Sub ToString As String
	Return Item.ToString
End Sub

Sub SetData(xprop As String, xValue As Object) As VMItem
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetVModel(k As String) As VMItem
	Item.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMItem
	Item.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMItem
	Item.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMItem
	Dim childHTML As String = child.ToString
	Item.SetText(childHTML)
	Return Me
End Sub


'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMItem
	Item.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMItem
	Item.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMItem
	Item.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMItem
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	Item.Bind(":active-class", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMItem
	If varValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("value", varValue)
		Return Me
	End If
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	Item.Bind(":value", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMItem
	If varDisabled = False Then Return Me
	If bStatic Then
		SetAttrSingle("disabled", varDisabled)
		Return Me
	End If
	Dim pp As String = $"${ID}Disabled"$
	vue.SetStateSingle(pp, varDisabled)
	Item.Bind(":disabled", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMItem
	Item.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMItem
	Item.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMItem
	Item.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMItem
	Item.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMItem
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMItem
	Item.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMItem
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMItem
	if color = "" then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Item.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMItem
	Item.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMItem
	Item.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMItem
	Item.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMItem
	Item.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMItem
	Item.SetStatic(b)
	bStatic = b
	Return Me
End Sub


'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMItem
	Item.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMItem
	Item.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMItem
	Item.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMItem
	Item.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMItem
	Item.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMItem
	Item.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMItem
	Item.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMItem
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(eitem As String, dataSource As String) As VMItem
	dataSource = dataSource.tolowercase
	eitem = eitem.tolowercase
	Dim sline As String = $"${eitem} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMItem
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMItem
	Item.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMItem
	Item.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMItem
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMItem
	Item.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub SetTextCenter As VMItem
	Item.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMItem
	Item.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMItem
	Item.SetVisible(b)
	Return Me
End Sub


'set color intensity - built in
Sub SetTextColor(textcolor As String) As VMItem
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColorIntensity(textcolor As String, textintensity As String) As VMItem
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Dim sIntensity As String = $"text--${textintensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub
