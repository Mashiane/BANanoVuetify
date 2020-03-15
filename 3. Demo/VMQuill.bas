B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
Public Quill As VMElement
Public ID As String
Private vue As BANanoVue
Private BANano As BANano  'ignore
Private DesignMode As Boolean
Private Module As Object
End Sub

'initialize the Quill
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMQuill
ID = sid.tolowercase
	Quill.Initialize(v, ID)
	Quill.SetTag("vue-editor")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
Return Quill.ToString
End Sub

Sub SetVModel(k As String) As VMQuill
Quill.SetVModel(k)
Return Me
End Sub

Sub SetVIf(vif As Object) As VMQuill
Quill.SetVIf(vif)
Return Me
End Sub

Sub SetVShow(vif As Object) As VMQuill
Quill.SetVShow(vif)
Return Me
End Sub

'add to app template
Sub Render
vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMQuill
Dim childHTML As String = child.ToString
Quill.SetText(childHTML)
Return Me
End Sub

'set text
Sub SetText(t As Object) As VMQuill
Quill.SetText(t)
Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMQuill
Quill.AddClass(c)
Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMQuill
Quill.SetAttr(attr)
Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMQuill
Quill.SetStyle(sm)
Return Me
End Sub

'add children
Sub AddChildren(children As List)
For Each childx As VMElement In children
AddChild(childx)
Next
End Sub


'hide the component
Sub Hide As VMQuill
	Quill.SetVisible(False)
    Return Me
End Sub

'show the component
Sub Show As VMQuill
	Quill.SetVisible(True)
    Return Me
End Sub

'enable the component
Sub Enable As VMQuill
	Quill.Enable(True)
    Return Me
End Sub

'disable the component
Sub Disable As VMQuill
	Quill.Disable(True)
    Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMQuill
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMQuill
	Quill.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMQuill
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMQuill
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Quill.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMQuill
	Quill.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMQuill
	Quill.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMQuill
	Quill.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMQuill
	Quill.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMQuill
	Quill.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMQuill
	Quill.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMQuill
	Quill.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMQuill
	Quill.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMQuill
	Quill.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMQuill
	Quill.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMQuill
	Quill.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMQuill
	Quill.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMQuill
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMQuill
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMQuill
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMQuill
	Quill.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMQuill
	Quill.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMQuill
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMQuill
	Quill.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMQuill
	Quill.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMQuill
	Quill.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMQuill
Quill.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub


Sub SetVisible(b As Boolean) As VMQuill
Quill.SetVisible(b)
Return Me
End Sub
