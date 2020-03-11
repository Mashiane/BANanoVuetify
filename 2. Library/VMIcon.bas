﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Icon As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the Icon
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMIcon
	ID = sid.tolowercase
	Icon.Initialize(v, ID)
	Icon.SetTag("v-icon")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

Sub SetOnClick(methodName As String) As VMIcon
	methodName = methodName
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttrSingle("@click", methodName)
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMIcon
	Icon.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMIcon
	Icon.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMIcon
	Icon.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMIcon
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMIcon
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMIcon
	Icon.SetAttrLoose(loose)
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return Icon.ToString
End Sub


Sub SetVText(vhtml As String) As VMIcon
	Icon.SetVText(vhtml)
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMIcon
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Icon.Bind(":color", pp)
	Return Me
End Sub

Sub SetVModel(k As String) As VMIcon
	Icon.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMIcon
	Icon.SetVIf(vif)
	Return Me
End Sub

Sub SetVElse(vif As Object) As VMIcon
	Icon.SetVElse(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMIcon
	Icon.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMIcon
	Dim childHTML As String = child.ToString
	Icon.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMIcon
	Icon.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMIcon
	Icon.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMIcon
	Icon.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMIcon
	Icon.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMIcon
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMIcon
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Icon.Bind(":color", pp)
	Return Me
End Sub

'set color
Sub SetIcon(varIcon As String) As VMIcon
	Dim pp As String = $"${ID}icon"$
	vue.SetStateSingle(pp, varIcon)
	Icon.Bind(":icon", pp)
	SetText($"{{ ${pp} }}"$)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMIcon
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Icon.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMIcon
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	Icon.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMIcon
	Icon.SetDisabled(varDisabled)
	Return Me
End Sub

'set large
Sub SetLarge(varLarge As Object) As VMIcon
	Dim pp As String = $"${ID}Large"$
	vue.SetStateSingle(pp, varLarge)
	Icon.Bind(":large", pp)
	Return Me
End Sub

'set left
Sub SetLeft(varLeft As Boolean) As VMIcon
	If varLeft = False Then Return Me
	Icon.SetAttrLoose("left")
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMIcon
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Icon.Bind(":light", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Boolean) As VMIcon
	If varRight = False Then Return Me
	Icon.SetAttrLoose("right")
	Return Me
End Sub

'set size
Sub SetSize(varSize As Object) As VMIcon
	Dim pp As String = $"${ID}Size"$
	vue.SetStateSingle(pp, varSize)
	Icon.Bind(":size", pp)
	Return Me
End Sub

'set small
Sub SetSmall(varSmall As Object) As VMIcon
	Dim pp As String = $"${ID}Small"$
	vue.SetStateSingle(pp, varSmall)
	Icon.Bind(":small", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMIcon
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	Icon.Bind(":tag", pp)
	Return Me
End Sub

'set x-large
Sub SetXLarge(varXLarge As Object) As VMIcon
	Dim pp As String = $"${ID}XLarge"$
	vue.SetStateSingle(pp, varXLarge)
	Icon.Bind(":x-large", pp)
	Return Me
End Sub

'set x-small
Sub SetXSmall(varXSmall As Object) As VMIcon
	Dim pp As String = $"${ID}XSmall"$
	vue.SetStateSingle(pp, varXSmall)
	Icon.Bind(":x-small", pp)
	Return Me
End Sub


Sub Hide As VMIcon
	Icon.SetVisible(False)
	Return Me
End Sub

Sub Show As VMIcon
	Icon.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMIcon
	Icon.Enable(True)
	Return Me
End Sub

Sub Disable As VMIcon
	Icon.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMIcon
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMIcon
	Icon.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMIcon
	Icon.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMIcon
	Icon.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMIcon
	Icon.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMIcon
	Icon.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMIcon
	Icon.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMIcon
	Icon.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMIcon
	Icon.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMIcon
Icon.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub