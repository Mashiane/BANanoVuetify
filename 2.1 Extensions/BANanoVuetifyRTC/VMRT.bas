B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public RT As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private Module As Object  'ignore
	Private boRT As BANanoObject
End Sub

'initialize the RT
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMRT
	BANano.DependsOnAsset("v-runtime-template.umd.js")
	'
	ID = sid.tolowercase
	RT.Initialize(v, ID).SetTag("v-runtime-template")
	Module = eventHandler
	vue = v
	Dim tmpid As String = $"${ID}template"$
	Bind(":template", tmpid)
	vue.SetData(tmpid, "")
	'
	If vue.ModuleExist("RT") = False Then
		vue.AddModule("RT")
		boRT.Initialize("vRuntimeTemplate")
		vue.AddComponentBO("v-runtime-template", boRT)
	End If
	Return Me
End Sub

Sub SetTemplate(tmp As String) As VMRT
	Dim tmpid As String = $"${ID}template"$
	vue.setdata(tmpid, tmp)
	Return Me
End Sub


'set text - built-in
Sub SetText(t As String) As VMRT
	RT.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMRT
	RT.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMRT
	RT.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMRT
	RT.SetStyle(sm)
	Return Me
End Sub


'get component
Sub ToString As String
	Return RT.ToString
End Sub

'hide the component
Sub Hide As VMRT
	RT.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMRT
	RT.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMRT
	RT.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMRT
	RT.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMRT
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMRT
	RT.SetAttrLoose(loose)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMRT
	RT.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMRT
	RT.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMRT
	RT.setmarginall(p)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMRT
	RT.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMRT
	RT.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMRT
	RT.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMRT
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMRT
	RT.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMRT
	RT.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMRT
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMRT
	RT.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMRT
	RT.SetText(comp)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMRT
	RT.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMRT
	RT.SetVisible(b)
	Return Me
End Sub