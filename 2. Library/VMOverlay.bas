B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Overlay As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
	Private showKey As String
	Public Container As VMContainer
End Sub

'initialize the Overlay
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMOverlay
	ID = sid.tolowercase
	Overlay.Initialize(v, ID)
	Overlay.SetTag("v-overlay")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	showKey = $"${ID}value"$
	SetValue(False)
	Container.Initialize(vue, $"${ID}cont"$, Module)
	Return Me
End Sub


'add a child element
Sub SetText(child As String)
	Overlay.SetText(child)
End Sub

'get component
Sub ToString As String
	If Container.HasContent Then AddComponent(Container.ToString)
	Return Overlay.ToString
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMOverlay
	Dim childHTML As String = child.ToString
	Overlay.SetText(childHTML)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMOverlay
	Overlay.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMOverlay
	Overlay.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMOverlay
	Overlay.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As String) As VMOverlay
	If varColor = "" Then Return Me
	If varColor = "#212121" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Overlay.Bind(":color", pp)
	Return Me
End Sub

'set opacity
Sub SetOpacity(varOpacity As String) As VMOverlay
	If varOpacity = "" Then Return Me
	If varOpacity = "0.46" Then Return Me
	If bStatic Then
		SetAttrSingle("opacity", varOpacity)
		Return Me
	End If
	Dim pp As String = $"${ID}Opacity"$
	vue.SetStateSingle(pp, varOpacity)
	Overlay.Bind(":opacity", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Boolean) As VMOverlay
	If bStatic Then 
		SetAttrSingle(":value", varValue)	
		Return Me
	End If
	vue.SetStateSingle(showKey, varValue)
	Overlay.Bind(":value", showKey)
	Return Me
End Sub

'set z-index
Sub SetZIndex(varZIndex As String) As VMOverlay
	If varZIndex = "" Then Return Me
	If varZIndex = "5" Then Return Me
	If bStatic Then
		SetAttrSingle("z-index", varZIndex)
		Return Me
	End If
	Dim pp As String = $"${ID}ZIndex"$
	vue.SetStateSingle(pp, varZIndex)
	Overlay.Bind(":z-index", pp)
	Return Me
End Sub

'set absolute
Sub SetAbsolute(varAbsolute As Boolean) As VMOverlay
	If varAbsolute = False Then Return Me
	If bStatic Then
		SetAttrSingle("absolute", varAbsolute)
		Return Me
	End If
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	Overlay.Bind(":absolute", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMOverlay
	If varDark = True Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Overlay.Bind(":dark", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMOverlay
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Overlay.Bind(":light", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMOverlay
	vue.SetData(showKey, False)
	Return Me
End Sub

'show the component
Sub Show As VMOverlay
	vue.SetData(showKey, True)
	Return Me
End Sub

'enable the component
Sub Enable As VMOverlay
	Overlay.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMOverlay
	Overlay.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMOverlay
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMOverlay
	Overlay.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMOverlay
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMOverlay
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Overlay.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMOverlay
	Overlay.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMOverlay
	Overlay.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMOverlay
	Overlay.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMOverlay
	Overlay.SetDesignMode(b)
	Container.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMOverlay
	Overlay.SetStatic(b)
	Container.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMOverlay
	Overlay.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMOverlay
	Overlay.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMOverlay
	Overlay.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMOverlay
	Overlay.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMOverlay
	Overlay.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMOverlay
	Overlay.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMOverlay
	Overlay.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMOverlay
	Overlay.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMOverlay
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMOverlay
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMOverlay
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMOverlay
	Overlay.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMOverlay
	Overlay.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMOverlay
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMOverlay
	Overlay.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMOverlay
	Overlay.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMOverlay
	Overlay.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMOverlay
	Overlay.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub
