B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ExpansionPanel As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public Header As VMExpansionPanelHeader
	Public Content As VMExpansionPanelContent
	Public Container As VMContainer
End Sub

'initialize the ExpansionPanel
Public Sub Initialize(v As BANanoVue, sparent As String, sid As String, eventHandler As Object) As VMExpansionPanel
	ID = sid.tolowercase
	ExpansionPanel.Initialize(v, ID)
	ExpansionPanel.SetTag("v-expansion-panel")
	DesignMode = False
	Module = eventHandler
	vue = v
	Header.Initialize(vue, $"${ID}hdr"$, Module)
	Header.SetOnClick($"${sparent}_click"$)
	Content.Initialize(vue, $"${ID}cnt"$, Module)
	Container = Content.container 
	SetAttrSingle("key", ID) 
	Return Me
End Sub

'get component
Sub ToString As String
	Content.RemoveAttr("v-show")
	Content.RemoveAttr("ref")
	Content.RemoveAttr(":style")
	ExpansionPanel.RemoveAttr("v-show")
	ExpansionPanel.RemoveAttr(":style")
	ExpansionPanel.RemoveAttr("ref")
	AddComponent(Header.ToString)
	AddComponent(Content.ToString)
	Return ExpansionPanel.ToString
End Sub

Sub SetVModel(k As String) As VMExpansionPanel
	ExpansionPanel.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMExpansionPanel
	ExpansionPanel.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMExpansionPanel
	ExpansionPanel.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMExpansionPanel
	Dim childHTML As String = child.ToString
	ExpansionPanel.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMExpansionPanel
	ExpansionPanel.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMExpansionPanel
	ExpansionPanel.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMExpansionPanel
	ExpansionPanel.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMExpansionPanel
	ExpansionPanel.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMExpansionPanel
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	ExpansionPanel.Bind(":active-class", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Object) As VMExpansionPanel
	Dim pp As String = $"${ID}Disabled"$
	vue.SetStateSingle(pp, varDisabled)
	ExpansionPanel.Bind(":disabled", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMExpansionPanel
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	ExpansionPanel.Bind(":readonly", pp)
	Return Me
End Sub

'
Sub SetOnChange(eventHandler As Object, methodName As String) As VMExpansionPanel
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMExpansionPanel
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'hide the component
Sub Hide As VMExpansionPanel
	ExpansionPanel.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMExpansionPanel
	ExpansionPanel.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMExpansionPanel
	ExpansionPanel.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMExpansionPanel
	ExpansionPanel.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMExpansionPanel
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMExpansionPanel
	ExpansionPanel.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMExpansionPanel
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMExpansionPanel
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	ExpansionPanel.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMExpansionPanel
	ExpansionPanel.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMExpansionPanel
	ExpansionPanel.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMExpansionPanel
	ExpansionPanel.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMExpansionPanel
	ExpansionPanel.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMExpansionPanel
	ExpansionPanel.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMExpansionPanel
	ExpansionPanel.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMExpansionPanel
	ExpansionPanel.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMExpansionPanel
	ExpansionPanel.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMExpansionPanel
	ExpansionPanel.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMExpansionPanel
	ExpansionPanel.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMExpansionPanel
	ExpansionPanel.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMExpansionPanel
	ExpansionPanel.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMExpansionPanel
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMExpansionPanel
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMExpansionPanel
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMExpansionPanel
	ExpansionPanel.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMExpansionPanel
	ExpansionPanel.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMExpansionPanel
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMExpansionPanel
	ExpansionPanel.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMExpansionPanel
	ExpansionPanel.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMExpansionPanel
	ExpansionPanel.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub
Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMExpansionPanel
ExpansionPanel.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMExpansionPanel
ExpansionPanel.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMExpansionPanel
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMExpansionPanel
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub