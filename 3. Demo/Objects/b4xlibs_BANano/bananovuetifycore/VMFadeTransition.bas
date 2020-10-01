B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public FadeTransition As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
End Sub

'initialize the FadeTransition
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMFadeTransition
	ID = sid.tolowercase
	FadeTransition.Initialize(v, ID)
	FadeTransition.SetTag("v-fade-transition")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMFadeTransition
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub AddElement(elID As String, elTag As String, elText As String, mprops As Map, mstyles As Map, lclasses As List) As VMFadeTransition
	Dim d As VMElement
	d.Initialize(vue,elID).SetDesignMode(DesignMode).SetTag(elTag)
	d.SetText(elText)
	d.BuildModel(mprops, mstyles, lclasses, Null)
	SetText(d.ToString)
	Return Me
End Sub


'add a child element
Sub SetText(child As String)
	FadeTransition.SetText(child)
End Sub

'get component
Sub ToString As String
	Return FadeTransition.ToString
End Sub

Sub SetVModel(k As String) As VMFadeTransition
	FadeTransition.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMFadeTransition
	FadeTransition.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMFadeTransition
	FadeTransition.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMFadeTransition
	Dim childHTML As String = child.ToString
	FadeTransition.SetText(childHTML)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMFadeTransition
	FadeTransition.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMFadeTransition
	FadeTransition.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMFadeTransition
	FadeTransition.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set mode
Sub SetMode(varMode As String) As VMFadeTransition
	If varMode = "" Then Return Me
	If bStatic Then
		SetAttrSingle("mode", varMode)
		Return Me
	End If
	Dim pp As String = $"${ID}Mode"$
	vue.SetStateSingle(pp, varMode)
	FadeTransition.Bind(":mode", pp)
	Return Me
End Sub

'set origin
Sub SetOrigin(varOrigin As String) As VMFadeTransition
	If varOrigin = "" Then Return Me
	If varOrigin = "top center 0" Then Return Me
	If bStatic Then
		SetAttrSingle("origin", varOrigin)
		Return Me
	End If
	Dim pp As String = $"${ID}Origin"$
	vue.SetStateSingle(pp, varOrigin)
	FadeTransition.Bind(":origin", pp)
	Return Me
End Sub

'set group
Sub SetGroup(varGroup As Boolean) As VMFadeTransition
	If varGroup = False Then Return Me
	If bStatic Then
		SetAttrSingle("group", varGroup)
		Return Me
	End If
	Dim pp As String = $"${ID}Group"$
	vue.SetStateSingle(pp, varGroup)
	FadeTransition.Bind(":group", pp)
	Return Me
End Sub

'set hide-on-leave
Sub SetHideOnLeave(varHideOnLeave As Boolean) As VMFadeTransition
	If varHideOnLeave = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-on-leave", varHideOnLeave)
		Return Me
	End If
	Dim pp As String = $"${ID}HideOnLeave"$
	vue.SetStateSingle(pp, varHideOnLeave)
	FadeTransition.Bind(":hide-on-leave", pp)
	Return Me
End Sub

'set leave-absolute
Sub SetLeaveAbsolute(varLeaveAbsolute As Boolean) As VMFadeTransition
	If varLeaveAbsolute = False Then Return Me
	If bStatic Then
		SetAttrSingle("leave-absolute", varLeaveAbsolute)
		Return Me
	End If
	Dim pp As String = $"${ID}LeaveAbsolute"$
	vue.SetStateSingle(pp, varLeaveAbsolute)
	FadeTransition.Bind(":leave-absolute", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMFadeTransition
	FadeTransition.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMFadeTransition
	FadeTransition.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMFadeTransition
	FadeTransition.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMFadeTransition
	FadeTransition.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMFadeTransition
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMFadeTransition
	FadeTransition.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMFadeTransition
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMFadeTransition
	FadeTransition.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMFadeTransition
	FadeTransition.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMFadeTransition
	FadeTransition.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMFadeTransition
	FadeTransition.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMFadeTransition
	FadeTransition.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMFadeTransition
	FadeTransition.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMFadeTransition
	FadeTransition.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMFadeTransition
	FadeTransition.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMFadeTransition
	FadeTransition.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMFadeTransition
	FadeTransition.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMFadeTransition
	FadeTransition.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMFadeTransition
	FadeTransition.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMFadeTransition
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMFadeTransition
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMFadeTransition
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMFadeTransition
	FadeTransition.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMFadeTransition
	FadeTransition.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMFadeTransition
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMFadeTransition
	FadeTransition.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMFadeTransition
	FadeTransition.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMFadeTransition
	FadeTransition.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMFadeTransition
	FadeTransition.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMFadeTransition
	FadeTransition.SetVisible(b)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColor(textcolor As String) As VMFadeTransition
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColorIntensity(textcolor As String, textintensity As String) As VMFadeTransition
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Dim sIntensity As String = $"text--${textintensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub
