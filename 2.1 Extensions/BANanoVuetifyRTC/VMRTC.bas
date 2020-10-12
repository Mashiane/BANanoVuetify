B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public RTC As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private Module As Object  'ignore
	Private boRTC As BANanoObject
End Sub

'initialize the RTC
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object)
	BANano.DependsOnAsset("vue-runtime-template-compiler.umd.js")
	'
	ID = sid.tolowercase
	RTC.Initialize(v, ID).SetTag("runtime-template-compiler")
	Module = eventHandler
	vue = v
	Dim tmpid As String = $"${ID}template"$
	Bind(":template", tmpid)
	vue.SetData(tmpid, "")
	'
	Dim pid As String = $"${ID}parent"$
	Bind(":parent", pid)
	vue.SetData(pid, Null)
	'
	If vue.ModuleExist("rtc") = False Then
		vue.AddModule("rtc")
		boRTC.Initialize("VueRuntimeTemplateCompiler.RuntimeTemplateCompiler")
		vue.AddComponentBO("runtime-template-compiler", boRTC)
	End If
End Sub

Sub SetTemplate(tmp As String) As VMRTC
	Dim tmpid As String = $"${ID}template"$
	vue.setdata(tmpid, tmp)
	Return Me
End Sub

Sub SetParent(parent As Object) As VMRTC
	Dim tmpid As String = $"${ID}parent"$
	vue.setdata(tmpid, parent)
	Return Me
End Sub


'set text - built-in
Sub SetText(t As String) As VMRTC
	RTC.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMRTC
	RTC.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMRTC
	RTC.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMRTC
	RTC.SetStyle(sm)
	Return Me
End Sub


'get component
Sub ToString As String
	Return RTC.ToString
End Sub

'hide the component
Sub Hide As VMRTC
	RTC.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMRTC
	RTC.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMRTC
	RTC.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMRTC
	RTC.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMRTC
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMRTC
	RTC.SetAttrLoose(loose)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMRTC
	RTC.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMRTC
	RTC.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMRTC
	RTC.setmarginall(p)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMRTC
	RTC.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMRTC
	RTC.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMRTC
	RTC.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMRTC
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMRTC
	RTC.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMRTC
	RTC.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMRTC
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMRTC
	RTC.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMRTC
	RTC.SetText(comp)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMRTC
	RTC.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMRTC
	RTC.SetVisible(b)
	Return Me
End Sub