B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ExpansionPanels As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the ExpansionPanels
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMExpansionPanels
	ID = sid.tolowercase
	ExpansionPanels.Initialize(v, ID)
	ExpansionPanels.SetTag("v-expansion-panels")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return ExpansionPanels.ToString
End Sub

Sub SetVModel(k As String) As VMExpansionPanels
	ExpansionPanels.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMExpansionPanels
	ExpansionPanels.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMExpansionPanels
	ExpansionPanels.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMExpansionPanels
	Dim childHTML As String = child.ToString
	ExpansionPanels.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMExpansionPanels
	ExpansionPanels.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMExpansionPanels
	ExpansionPanels.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr as map) As VMExpansionPanels
	ExpansionPanels.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMExpansionPanels
	ExpansionPanels.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set accordion
Sub SetAccordion(varAccordion As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Accordion"$
	vue.SetStateSingle(pp, varAccordion)
	ExpansionPanels.Bind(":accordion", pp)
	Return Me
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	ExpansionPanels.Bind(":active-class", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ExpansionPanels.Bind(":dark", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Disabled"$
	vue.SetStateSingle(pp, varDisabled)
	ExpansionPanels.Bind(":disabled", pp)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	ExpansionPanels.Bind(":flat", pp)
	Return Me
End Sub

'set focusable
Sub SetFocusable(varFocusable As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Focusable"$
	vue.SetStateSingle(pp, varFocusable)
	ExpansionPanels.Bind(":focusable", pp)
	Return Me
End Sub

'set hover
Sub SetHover(varHover As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Hover"$
	vue.SetStateSingle(pp, varHover)
	ExpansionPanels.Bind(":hover", pp)
	Return Me
End Sub

'set inset
Sub SetInset(varInset As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Inset"$
	vue.SetStateSingle(pp, varInset)
	ExpansionPanels.Bind(":inset", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ExpansionPanels.Bind(":light", pp)
	Return Me
End Sub

'set mandatory
Sub SetMandatory(varMandatory As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Mandatory"$
	vue.SetStateSingle(pp, varMandatory)
	ExpansionPanels.Bind(":mandatory", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	ExpansionPanels.Bind(":max", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	ExpansionPanels.Bind(":multiple", pp)
	Return Me
End Sub

'set popout
Sub SetPopout(varPopout As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Popout"$
	vue.SetStateSingle(pp, varPopout)
	ExpansionPanels.Bind(":popout", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	ExpansionPanels.Bind(":readonly", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	ExpansionPanels.Bind(":tile", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMExpansionPanels
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	ExpansionPanels.Bind(":value", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMExpansionPanels
	ExpansionPanels.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMExpansionPanels
	ExpansionPanels.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMExpansionPanels
	ExpansionPanels.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMExpansionPanels
	ExpansionPanels.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMExpansionPanels
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMExpansionPanels
	ExpansionPanels.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMExpansionPanels
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMExpansionPanels
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	ExpansionPanels.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMExpansionPanels
	ExpansionPanels.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMExpansionPanels
	ExpansionPanels.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMExpansionPanels
	ExpansionPanels.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMExpansionPanels
	ExpansionPanels.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMExpansionPanels
	ExpansionPanels.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMExpansionPanels
	ExpansionPanels.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMExpansionPanels
	ExpansionPanels.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMExpansionPanels
	ExpansionPanels.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMExpansionPanels
	ExpansionPanels.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMExpansionPanels
	ExpansionPanels.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMExpansionPanels
	ExpansionPanels.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMExpansionPanels
	ExpansionPanels.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMExpansionPanels
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMExpansionPanels
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMExpansionPanels
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMExpansionPanels
	ExpansionPanels.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMExpansionPanels
	ExpansionPanels.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMExpansionPanels
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMExpansionPanels
	ExpansionPanels.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMExpansionPanels
	ExpansionPanels.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMExpansionPanels
	ExpansionPanels.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMExpansionPanels
ExpansionPanels.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub