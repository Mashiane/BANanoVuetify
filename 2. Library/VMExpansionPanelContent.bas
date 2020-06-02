B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ExpansionPanelContent As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object
	Public Container As VMContainer
	Private bStatic As Boolean
End Sub

'initialize the ExpansionPanelContent
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMExpansionPanelContent
	ID = sid.tolowercase
	ExpansionPanelContent.Initialize(v, ID)
	ExpansionPanelContent.SetTag("v-expansion-panel-content")
	DesignMode = False
	Module = eventHandler
	vue = v
	Container.Initialize(vue, $"${ID}content"$, Module) 
	bStatic = False
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMExpansionPanelContent
	bStatic = b
	ExpansionPanelContent.SetStatic(b)
	Container.SetStatic(b)
	Return Me
End Sub


'get component
Sub ToString As String
	Container.RemoveAttr("v-show")
	Container.RemoveAttr(":style")
	If Container.HasContent Then AddComponent(Container.ToString)
	Return ExpansionPanelContent.ToString
End Sub

Sub SetVModel(k As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMExpansionPanelContent
	Dim childHTML As String = child.ToString
	ExpansionPanelContent.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMExpansionPanelContent
	ExpansionPanelContent.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMExpansionPanelContent
	ExpansionPanelContent.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMExpansionPanelContent
	ExpansionPanelContent.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMExpansionPanelContent
	ExpansionPanelContent.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As String) As VMExpansionPanelContent
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ExpansionPanelContent.Bind(":color", pp)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMExpansionPanelContent
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	vue.SetStateSingle(pp, scolor)
	ExpansionPanelContent.Bind(":color", pp)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Boolean) As VMExpansionPanelContent
	If varEager = False Then Return Me
	If bStatic Then
		SetAttrSingle("eager", varEager)
		Return Me
	End If
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	ExpansionPanelContent.Bind(":eager", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMExpansionPanelContent
	ExpansionPanelContent.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMExpansionPanelContent
	ExpansionPanelContent.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMExpansionPanelContent
	ExpansionPanelContent.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMExpansionPanelContent
	ExpansionPanelContent.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMExpansionPanelContent
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMExpansionPanelContent
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMExpansionPanelContent
	ExpansionPanelContent.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMExpansionPanelContent
	ExpansionPanelContent.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMExpansionPanelContent
	ExpansionPanelContent.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMExpansionPanelContent
	ExpansionPanelContent.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMExpansionPanelContent
	ExpansionPanelContent.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMExpansionPanelContent
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMExpansionPanelContent
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMExpansionPanelContent
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMExpansionPanelContent
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMExpansionPanelContent
	ExpansionPanelContent.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMExpansionPanelContent
	ExpansionPanelContent.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMExpansionPanelContent
ExpansionPanelContent.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMExpansionPanelContent
ExpansionPanelContent.SetVisible(b)
Return Me
End Sub
