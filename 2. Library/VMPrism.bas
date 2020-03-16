B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
Public Prism As VMElement
Public ID As String
Private vue As BANanoVue
Private BANano As BANano  'ignore
Private DesignMode As Boolean
Private Module As Object
End Sub

#if css
	.v-application code {box-shadow: none !important;}
#End If

'initialize the Prism
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMPrism
ID = sid.tolowercase
	Prism.Initialize(v, ID)
	Prism.SetTag("vue-prism-editor")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
Return Prism.ToString
End Sub

Sub SetVModel(k As String) As VMPrism
Prism.SetVModel(k)
Return Me
End Sub

Sub SetVIf(vif As Object) As VMPrism
Prism.SetVIf(vif)
Return Me
End Sub

Sub SetVShow(vif As Object) As VMPrism
Prism.SetVShow(vif)
Return Me
End Sub

'add to app template
Sub Render
vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMPrism
Dim childHTML As String = child.ToString
Prism.SetText(childHTML)
Return Me
End Sub

'set text
Sub SetText(t As Object) As VMPrism
Prism.SetText(t)
Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMPrism
Prism.AddClass(c)
Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMPrism
Prism.SetAttr(attr)
Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMPrism
Prism.SetStyle(sm)
Return Me
End Sub

'add children
Sub AddChildren(children As List)
For Each childx As VMElement In children
AddChild(childx)
Next
End Sub

'set code
Sub SetCode(varCode As Object) As VMPrism
Dim pp As String = $"${ID}Code"$
vue.SetStateSingle(pp, varCode)
Prism.Bind(":code", pp)
Return Me
End Sub

'set language
Sub SetLanguage(varLanguage As Object) As VMPrism
Prism.Bind("language", varLanguage)
Return Me
End Sub

'set lineNumbers
Sub SetLinenumbers(varLinenumbers As Object) As VMPrism
Dim pp As String = $"${ID}Linenumbers"$
vue.SetStateSingle(pp, varLinenumbers)
Prism.Bind(":linenumbers", pp)
Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMPrism
Dim pp As String = $"${ID}Readonly"$
vue.SetStateSingle(pp, varReadonly)
Prism.Bind(":readonly", pp)
Return Me
End Sub

'set emitEvents
Sub SetEmitevents(varEmitevents As Object) As VMPrism
Dim pp As String = $"${ID}Emitevents"$
vue.SetStateSingle(pp, varEmitevents)
Prism.Bind(":emitevents", pp)
Return Me
End Sub

'set autoStyleLineNumbers
Sub SetAutostylelinenumbers(varAutostylelinenumbers As Object) As VMPrism
Dim pp As String = $"${ID}Autostylelinenumbers"$
vue.SetStateSingle(pp, varAutostylelinenumbers)
Prism.Bind(":autostylelinenumbers", pp)
Return Me
End Sub

'
Sub SetOnChange(methodName As String) As VMPrism
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("v-on:change": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub


'hide the component
Sub Hide As VMPrism
	Prism.SetVisible(False)
    Return Me
End Sub

'show the component
Sub Show As VMPrism
	Prism.SetVisible(True)
    Return Me
End Sub

'enable the component
Sub Enable As VMPrism
	Prism.Enable(True)
    Return Me
End Sub

'disable the component
Sub Disable As VMPrism
	Prism.Disable(True)
    Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMPrism
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMPrism
	Prism.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMPrism
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMPrism
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Prism.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMPrism
	Prism.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMPrism
	Prism.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMPrism
	Prism.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMPrism
	Prism.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMPrism
	Prism.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMPrism
	Prism.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMPrism
	Prism.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMPrism
	Prism.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMPrism
	Prism.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMPrism
	Prism.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMPrism
	Prism.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMPrism
	Prism.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMPrism
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMPrism
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMPrism
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMPrism
	Prism.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMPrism
	Prism.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMPrism
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMPrism
	Prism.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMPrism
	Prism.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMPrism
	Prism.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMPrism
Prism.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub


Sub SetVisible(b As Boolean) As VMPrism
Prism.SetVisible(b)
Return Me
End Sub


'set color intensity
Sub SetTextColor(varColor As String) As VMPrism
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMPrism
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub