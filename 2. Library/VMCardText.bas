﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CardText As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	
End Sub

'initialize the CardText
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCardText
	ID = sid.tolowercase
	CardText.Initialize(v, ID)
	CardText.SetTag("v-card-text")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMCardText
	CardText.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCardText
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub AddContent(scontent As String) As VMCardText
	SetText(scontent)
	Return Me
End Sub

Sub AddSpacer As VMCardText
	CardText.AddSpacer
	Return Me
End Sub

Sub AddDivider As VMCardText
	CardText.AddDivider
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCardText
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCardText
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	CardText.Bind(":color", pp)
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return CardText.ToString
End Sub

Sub SetVModel(k As String) As VMCardText
	CardText.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCardText
	CardText.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCardText
	CardText.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCardText
	Dim childHTML As String = child.ToString
	CardText.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCardText
	CardText.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCardText
	CardText.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCardText
	CardText.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCardText
	CardText.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub


Sub Hide As VMCardText
	CardText.SetVisible(False)
	Return Me
End Sub

Sub Show As VMCardText
	CardText.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMCardText
	CardText.Enable(True)
	Return Me
End Sub

Sub Disable As VMCardText
	CardText.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCardText
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMCardText
	CardText.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCardText
	CardText.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMCardText
	CardText.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMCardText
	CardText.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMCardText
	CardText.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCardText
	CardText.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMCardText
	CardText.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMCardText
	CardText.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCardText
CardText.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub