B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Divider As VMElement
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
End Sub

'initialize the Divider
Public Sub Initialize(v As BANanoVue) As VMDivider
	Divider.Initialize(v, "").SetTag("v-divider")
	DesignMode = False
	vue = v
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMDivider
	Divider.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMDivider
	Divider.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMDivider
	Divider.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMDivider
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMDivider
	Divider.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetVElseIf(t As String) As VMDivider
	SetAttrSingle("v-else-if", t)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMDivider
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return Divider.ToString
End Sub

Sub SetVModel(k As String) As VMDivider
	Divider.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMDivider
	Divider.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMDivider
	Divider.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMDivider
	Dim childHTML As String = child.ToString
	Divider.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMDivider
	Divider.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMDivider
	Divider.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDivider
	Divider.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMDivider
	Divider.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set dark
Sub SetDark As VMDivider
	Divider.SetAttrLoose("dark")
	Return Me
End Sub

'set inset
Sub SetInset As VMDivider
	Divider.SetAttrLoose("inset")
	Return Me
End Sub

'set light
Sub SetLight As VMDivider
	Divider.SetAttrLoose("light")
	Return Me
End Sub

'set vertical
Sub SetVertical As VMDivider
	Divider.SetAttrLoose(":vertical")
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMDivider
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMDivider
	Divider.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMDivider
	Divider.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMDivider
	Divider.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMDivider
	Divider.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMDivider
	Divider.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMDivider
	Divider.SetName(varName, bbind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMDivider
	Divider.SetDisabled(b)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMDivider
	Divider.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMDivider
	Divider.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub SetHeight(h As String) As VMDivider
	Divider.SetStyleSingle("height", h)
	Return Me
End Sub


Sub SetWidth(w As String) As VMDivider
	Divider.SetStyleSingle("width", w)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMDivider
Divider.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMDivider
Divider.SetVisible(b)
Return Me
End Sub