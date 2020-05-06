B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private Instance As BANanoObject
	Private vue As BANanoVue
	Public Element As BANanoObject
	Public ID As String
	Public props As Map
	Private elTag As String
	Public children As List
	Public style As Map
	Public class As Map
	Public attrs As Map
	Public domProps As Map
	Public on As Map
	Public nativeOn As Map
	Private BANano As BANano
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, stag As String) As VueElement
	'get the vue bananoobject
	vue = v
	Instance = v.bovue
	ID = sid.tolowercase
	props.Initialize 
	elTag = stag
	style.Initialize 
	class.Initialize 
	children.Initialize 
	attrs.Initialize 
	domProps.Initialize 
	on.Initialize 
	nativeOn.Initialize 
	SetProp("id", ID)
	SetKey(ID)
	SetRef(ID)
	Return Me
End Sub

Sub SetKey(k As String) As VueElement
	If k = "" Then Return Me
	SetProp("key", k)
	Return Me
End Sub

Sub SetRef(r As String) As VueElement
	If r = "" Then Return Me
	SetProp("ref", r)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VueElement
	class.Put(c, True)
	Return Me
End Sub

'set style
Sub SetStyle(k As String, v As Object) As VueElement
	style.Put(k, v)
	Return Me
End Sub

'set the property
Sub SetProp(k As String, v As Object) As VueElement
	props.Put(k,v)
	Return Me
End Sub

'set the attributes
Sub SetAttr(k As String, v As Object) As VueElement
	attrs.Put(k,v)
	Return Me
End Sub

'add a child object (BANanoObject or String)
Sub AddChild(child As Object) As VueElement
	If GetType(child) = "string" Then
		child = BANano.SF(child)
	End If
	children.Add(child)
	Return Me
End Sub

'add a vue element child
Sub AddElement(child As VueElement) As VueElement
	child.CreateElement
	children.Add(child.element)
	Return Me
End Sub

'create the element
Sub CreateElement
	Dim options As Map = CreateMap()
	If class.Size > 0 Then options.Put("class", class)
	If style.Size > 0 Then options.Put("style", style)
	If props.Size > 0 Then options.Put("props", props)
	If attrs.Size > 0 Then options.Put("attrs", attrs)
	If on.Size > 0 Then options.Put("on", on)
	If nativeOn.Size > 0 Then options.Put("nativeOn", nativeOn)
	If domProps.Size > 0 Then options.Put("domProps", domProps)
	'
	'get type
	Select Case elTag
	Case "input", "img", "textarea", "hr", "br"
		Element = Instance.RunMethod("createElement", Array(elTag, options))
	Case Else
		If children.Size = 0 Then
			Element = Instance.RunMethod("createElement", Array(elTag, options))
		Else
			Element = Instance.RunMethod("createElement", Array(elTag, options, children))
		End If
	End Select
End Sub

Sub SetInnerHTML(innerHTML As String) As VueElement
	domProps.Put("innerHTML", innerHTML)
	Return Me
End Sub