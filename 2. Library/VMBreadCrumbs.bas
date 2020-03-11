B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public BreadCrumbs As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the BreadCrumbs
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMBreadCrumbs
	ID = sid.tolowercase
	BreadCrumbs.Initialize(v, ID)
	BreadCrumbs.SetTag("v-breadcrumbs")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return BreadCrumbs.ToString
End Sub

Sub SetVModel(k As String) As VMBreadCrumbs
	BreadCrumbs.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMBreadCrumbs
	BreadCrumbs.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMBreadCrumbs
	BreadCrumbs.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMBreadCrumbs
	Dim childHTML As String = child.ToString
	BreadCrumbs.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMBreadCrumbs
	BreadCrumbs.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMBreadCrumbs
	BreadCrumbs.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMBreadCrumbs
	BreadCrumbs.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMBreadCrumbs
	BreadCrumbs.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set dark
Sub SetDark(varDark As Object) As VMBreadCrumbs
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	BreadCrumbs.Bind(":dark", pp)
	Return Me
End Sub

'set divider
Sub SetDivider(varDivider As Object) As VMBreadCrumbs
	Dim pp As String = $"${ID}Divider"$
	vue.SetStateSingle(pp, varDivider)
	BreadCrumbs.Bind(":divider", pp)
	Return Me
End Sub

'set items
Sub SetItems(varItems As Object) As VMBreadCrumbs
	Dim pp As String = $"${ID}Items"$
	vue.SetStateSingle(pp, varItems)
	BreadCrumbs.Bind(":items", pp)
	Return Me
End Sub

'set large
Sub SetLarge(varLarge As Object) As VMBreadCrumbs
	Dim pp As String = $"${ID}Large"$
	vue.SetStateSingle(pp, varLarge)
	BreadCrumbs.Bind(":large", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMBreadCrumbs
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	BreadCrumbs.Bind(":light", pp)
	Return Me
End Sub

'
Sub SetSlotDivider(b As Boolean) As VMBreadCrumbs    'ignore
	SetAttr(CreateMap("slot": "divider"))
	Return Me
End Sub

'
Sub SetSlotItem(b As Boolean) As VMBreadCrumbs    'ignore
	SetAttr(CreateMap("slot": "item"))
	Return Me
End Sub


'hide the component
Sub Hide As VMBreadCrumbs
	BreadCrumbs.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMBreadCrumbs
	BreadCrumbs.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMBreadCrumbs
	BreadCrumbs.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMBreadCrumbs
	BreadCrumbs.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMBreadCrumbs
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMBreadCrumbs
	BreadCrumbs.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMBreadCrumbs
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMBreadCrumbs
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	BreadCrumbs.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMBreadCrumbs
	BreadCrumbs.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMBreadCrumbs
	BreadCrumbs.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMBreadCrumbs
	BreadCrumbs.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMBreadCrumbs
	BreadCrumbs.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMBreadCrumbs
	BreadCrumbs.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMBreadCrumbs
	BreadCrumbs.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMBreadCrumbs
	BreadCrumbs.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMBreadCrumbs
	BreadCrumbs.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMBreadCrumbs
	BreadCrumbs.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMBreadCrumbs
	BreadCrumbs.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMBreadCrumbs
	BreadCrumbs.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMBreadCrumbs
	BreadCrumbs.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMBreadCrumbs
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMBreadCrumbs
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMBreadCrumbs
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMBreadCrumbs
	BreadCrumbs.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMBreadCrumbs
	BreadCrumbs.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMBreadCrumbs
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMBreadCrumbs
	BreadCrumbs.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMBreadCrumbs
	BreadCrumbs.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMBreadCrumbs
	BreadCrumbs.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMBreadCrumbs
BreadCrumbs.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub