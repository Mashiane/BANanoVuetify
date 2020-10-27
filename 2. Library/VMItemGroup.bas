B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ItemGroup As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
	Public Container As VMContainer
End Sub

'initialize the ItemGroup
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMItemGroup
	ID = sid.tolowercase
	ItemGroup.Initialize(v, ID)
	ItemGroup.SetTag("v-item-group")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	Container.Initialize(vue, $"${ID}cont"$, Module)
	SetOnChange(Module, $"${ID}_change"$)
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	ItemGroup.SetText(elm.ToString)
End Sub

'selValue
Sub SetOnChange(eventHandler As Object,methodName As String) As VMItemGroup
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMItemGroup
	SetText(comp)
	Return Me
End Sub

'get component
Sub ToString As String
	If vue.ShowWarnings Then
		Dim eName As String = $"${ID}_change"$
		If SubExists(Module, eName) = False Then
			Log($"VMItemGroup.${eName} event has not been defined!"$)
		End If
	End If
	If Container.HasContent Then ItemGroup.AddComponent(Container.ToString)
	Return ItemGroup.ToString
End Sub

Sub SetData(xprop As String, xValue As Object) As VMItemGroup
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetVModel(k As String) As VMItemGroup
	ItemGroup.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMItemGroup
	ItemGroup.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMItemGroup
	ItemGroup.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMItemGroup
	Dim childHTML As String = child.ToString
	ItemGroup.SetText(childHTML)
	Return Me
End Sub

Sub AddItem(vitem As VMItem) As VMItemGroup
	SetText(vitem.ToString)
	Return Me
End Sub

Sub SetText(txt As String) As VMItemGroup
	ItemGroup.SetText(txt)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMItemGroup
	ItemGroup.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMItemGroup
	ItemGroup.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMItemGroup
	ItemGroup.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMItemGroup
	If varActiveClass = "" Then Return Me
	If varActiveClass = "v-item--active" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	ItemGroup.Bind(":active-class", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As String) As VMItemGroup
	If varMax = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max", varMax)
		Return Me
	End If
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	ItemGroup.Bind(":max", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMItemGroup
	If varValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("value", varValue)
		Return Me
	End If
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	ItemGroup.Bind(":value", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMItemGroup
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ItemGroup.Bind(":dark", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMItemGroup
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ItemGroup.Bind(":light", pp)
	Return Me
End Sub

'set mandatory
Sub SetMandatory(varMandatory As Boolean) As VMItemGroup
	If varMandatory = False Then Return Me
	If bStatic Then
		SetAttrSingle("mandatory", varMandatory)
		Return Me
	End If
	Dim pp As String = $"${ID}Mandatory"$
	vue.SetStateSingle(pp, varMandatory)
	ItemGroup.Bind(":mandatory", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Boolean) As VMItemGroup
	If varMultiple = False Then Return Me
	If bStatic Then
		SetAttrSingle("multiple", varMultiple)
		Return Me
	End If
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	ItemGroup.Bind(":multiple", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMItemGroup
	ItemGroup.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMItemGroup
	ItemGroup.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMItemGroup
	ItemGroup.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMItemGroup
	ItemGroup.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMItemGroup
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMItemGroup
	ItemGroup.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMItemGroup
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMItemGroup
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	ItemGroup.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMItemGroup
	ItemGroup.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMItemGroup
	ItemGroup.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMItemGroup
	ItemGroup.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMItemGroup
	ItemGroup.SetDesignMode(b)
	Container.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMItemGroup
	ItemGroup.SetStatic(b)
	Container.SetStatic(b)
	bStatic = b
	Return Me
End Sub


'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMItemGroup
	ItemGroup.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMItemGroup
	ItemGroup.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMItemGroup
	ItemGroup.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMItemGroup
	ItemGroup.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMItemGroup
	ItemGroup.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMItemGroup
	ItemGroup.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMItemGroup
	ItemGroup.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMItemGroup
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMItemGroup
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMItemGroup
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMItemGroup
	ItemGroup.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMItemGroup
	ItemGroup.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMItemGroup
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMItemGroup
	ItemGroup.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub SetTextCenter As VMItemGroup
	ItemGroup.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMItemGroup
	ItemGroup.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMItemGroup
	ItemGroup.SetVisible(b)
	Return Me
End Sub


Sub AddElement1(elID As String, elTag As String, elText As String, mprops As Map, mstyles As Map, lclasses As List) As VMItemGroup
	Dim d As VMElement
	d.Initialize(vue,elID).SetDesignMode(DesignMode).SetTag(elTag)
	d.SetText(elText)
	d.BuildModel(mprops, mstyles, lclasses, Null)
	SetText(d.ToString)
	Return Me
End Sub
