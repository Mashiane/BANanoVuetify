B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Sheet As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public Container As VMContainer
End Sub

'initialize the Sheet
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSheet
	ID = sid.tolowercase
	Sheet.Initialize(v, ID)
	Sheet.SetTag("v-sheet")
	DesignMode = False
	Module = eventHandler
	vue = v
	Container.Initialize(vue, $"${ID}container"$, Module)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSheet
	Sheet.SetRC(sRow, sCol)
	Return Me
End Sub

Sub SetTextCenter As VMSheet
	Sheet.AddClass("text-center")
	Return Me
End Sub

Sub AddComponent(comp As String) As VMSheet
	Sheet.SetText(comp)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSheet
	Sheet.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSheet
	Sheet.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSheet
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub
'get component
Sub ToString As String
	AddComponent(Container.ToString)
	Return Sheet.ToString
End Sub

Sub SetVModel(k As String) As VMSheet
	Sheet.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMSheet
	Sheet.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSheet
	Sheet.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSheet
	Dim childHTML As String = child.ToString
	Sheet.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSheet
	Sheet.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSheet
	Sheet.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSheet
	Sheet.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSheet
	Sheet.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As Object) As VMSheet
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Sheet.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMSheet
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Sheet.Bind(":dark", pp)
	Return Me
End Sub

'set elevation
Sub SetElevation(varElevation As Object) As VMSheet
	Dim pp As String = $"${ID}Elevation"$
	vue.SetStateSingle(pp, varElevation)
	Sheet.Bind(":elevation", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMSheet
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Sheet.Bind(":height", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMSheet
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Sheet.Bind(":light", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As Object) As VMSheet
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	Sheet.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As Object) As VMSheet
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Sheet.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As Object) As VMSheet
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	Sheet.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As Object) As VMSheet
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	Sheet.Bind(":min-width", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Object) As VMSheet
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	Sheet.Bind(":tile", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMSheet
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	Sheet.Bind(":width", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMSheet
	Sheet.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMSheet
	Sheet.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMSheet
	Sheet.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMSheet
	Sheet.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSheet
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMSheet
	Sheet.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMSheet
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMSheet
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Sheet.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMSheet
	Sheet.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSheet
	Sheet.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMSheet
	Sheet.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMSheet
	Sheet.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMSheet
	Sheet.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSheet
	Sheet.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMSheet
	Sheet.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMSheet
	Sheet.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMSheet
	Sheet.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMSheet
	Sheet.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMSheet
	Sheet.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMSheet
	Sheet.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSheet
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMSheet
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMSheet
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSheet
Sheet.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub