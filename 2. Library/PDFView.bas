﻿B4J=true
Group=Default Group\PDFMake
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
'http://jquery.malsup.com/media/
Sub Class_Globals
	Private JQ As BANanoObject
	Private options As Map
	Private href As String
	Private id As String
	Private BANano As BANano  'ignore
End Sub

'Initializes the object.
Public Sub Initialize(elementID As String) As PDFView
	'initialize jquery
	JQ.Initialize("$")
	options.Initialize
	href = ""
	id = elementID.tolowercase
	SetWidth("100%")
	SetHeight("80vh")
	Return Me
End Sub


'set width
Sub SetWidth(w As String) As PDFView
	options.Put("width", w)
	Return Me
End Sub

'set height
Sub SetHeight(h As String) As PDFView
	options.Put("height", h)
	Return Me
End Sub

'set href
Sub SetHREF(shref As String) As PDFView
	href = shref
	Return Me
End Sub

'view
Sub Refresh
	Dim iKey As String = $"#${id}"$
	BANano.GetElement(iKey).SetAttr("href", href).AddClass("media")
	JQ.Selector(iKey).RunMethod("media", options)
End Sub