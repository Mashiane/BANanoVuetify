B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ExpansionPanelHeader As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the ExpansionPanelHeader
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMExpansionPanelHeader
	ID = sid.tolowercase
	ExpansionPanelHeader.Initialize(v, ID)
	ExpansionPanelHeader.SetTag("v-expansion-panel-header")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMExpansionPanelHeader
	bStatic = b
	ExpansionPanelHeader.SetStatic(b)
	Return Me
End Sub

'get component
Sub ToString As String
	Return ExpansionPanelHeader.ToString
End Sub

Sub SetVModel(k As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMExpansionPanelHeader
	Dim childHTML As String = child.ToString
	ExpansionPanelHeader.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As String) As VMExpansionPanelHeader
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ExpansionPanelHeader.Bind(":color", pp)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMExpansionPanelHeader
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	vue.SetStateSingle(pp, scolor)
	ExpansionPanelHeader.Bind(":color", pp)
	Return Me
End Sub

'set disabled-icon-rotate
Sub SetDisabledIconRotate(varDisabledIconRotate As Boolean) As VMExpansionPanelHeader
	If bStatic Then
		SetAttrSingle("color", varDisabledIconRotate)
		Return Me
	End If
	Dim pp As String = $"${ID}DisabledIconRotate"$
	vue.SetStateSingle(pp, varDisabledIconRotate)
	ExpansionPanelHeader.Bind(":disabled-icon-rotate", pp)
	Return Me
End Sub

'set expand-icon
Sub SetExpandIcon(varExpandIcon As String) As VMExpansionPanelHeader
	If varExpandIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("expand-icon", varExpandIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}ExpandIcon"$
	vue.SetStateSingle(pp, varExpandIcon)
	ExpansionPanelHeader.Bind(":expand-icon", pp)
	Return Me
End Sub

'set hide-actions
Sub SetHideActions(varHideActions As Boolean) As VMExpansionPanelHeader
	If varHideActions = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-actions", varHideActions)
		Return Me
	End If
	Dim pp As String = $"${ID}HideActions"$
	vue.SetStateSingle(pp, varHideActions)
	ExpansionPanelHeader.Bind(":hide-actions", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Boolean) As VMExpansionPanelHeader
	If varRipple = False Then Return Me
	If bStatic Then
		SetAttrSingle("ripple", varRipple)
		Return Me
	End If
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	ExpansionPanelHeader.Bind(":ripple", pp)
	Return Me
End Sub

'
Sub SetSlotActions(b As Boolean) As VMExpansionPanelHeader    'ignore
	SetAttr(CreateMap("slot": "actions"))
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMExpansionPanelHeader
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
Sub Hide As VMExpansionPanelHeader
	ExpansionPanelHeader.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMExpansionPanelHeader
	ExpansionPanelHeader.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMExpansionPanelHeader
	ExpansionPanelHeader.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMExpansionPanelHeader
	ExpansionPanelHeader.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMExpansionPanelHeader
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMExpansionPanelHeader
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'remove an attribute
public Sub RemoveAttr(sName As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMExpansionPanelHeader
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMExpansionPanelHeader
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMExpansionPanelHeader
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMExpansionPanelHeader
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMExpansionPanelHeader
	ExpansionPanelHeader.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMExpansionPanelHeader
	ExpansionPanelHeader.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMExpansionPanelHeader
ExpansionPanelHeader.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMExpansionPanelHeader
ExpansionPanelHeader.SetVisible(b)
Return Me
End Sub
