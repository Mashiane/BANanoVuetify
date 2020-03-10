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
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the Overlay
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMOverlay
	ID = sid.tolowercase
	Overlay.Initialize(v, ID)
	Overlay.SetTag("v-overlay")
	DesignMode = False
	Module = eventHandler
	vue = v
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

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMOverlay
	Overlay.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMOverlay
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMOverlay
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return Overlay.ToString
End Sub

Sub SetVModel(k As String) As VMOverlay
	Overlay.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMOverlay
	Overlay.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMOverlay
	Overlay.SetVShow(vif)
	Return Me
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

'set text
Sub SetText(t As Object) As VMOverlay
	Overlay.SetText(t)
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

'set absolute
Sub SetAbsolute(varAbsolute As Object) As VMOverlay
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	Overlay.Bind(":absolute", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMOverlay
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Overlay.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMOverlay
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Overlay.Bind(":dark", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMOverlay
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Overlay.Bind(":light", pp)
	Return Me
End Sub

'set opacity
Sub SetOpacity(varOpacity As Object) As VMOverlay
	Dim pp As String = $"${ID}Opacity"$
	vue.SetStateSingle(pp, varOpacity)
	Overlay.Bind(":opacity", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMOverlay
	Overlay.SetAttrsingle(":value", varValue)
	Return Me
End Sub

'set z-index
Sub SetZIndex(varZIndex As Object) As VMOverlay
	Dim pp As String = $"${ID}ZIndex"$
	vue.SetStateSingle(pp, varZIndex)
	Overlay.Bind(":z-index", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMOverlay
	vue.SetStateSingle($"${ID}show"$, False)
	Return Me
End Sub

'show the component
Sub Show As VMOverlay
	vue.SetStateSingle($"${ID}show"$, True)
	Return Me
End Sub

'enable the component
Sub Enable As VMOverlay
	vue.SetStateSingle($"${ID}disabled"$, False)
	Return Me
End Sub

'disable the component
Sub Disable As VMOverlay
	vue.SetStateSingle($"${ID}disabled"$, True)
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
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMOverlay
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
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
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMOverlay
	Overlay.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMOverlay
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
