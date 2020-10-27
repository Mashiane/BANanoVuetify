B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Sheet As VMContainer
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
	Public HasContent As Boolean
	Public Footer As VMContainer
End Sub

'initialize the Sheet
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSheet
	ID = sid.tolowercase
	Sheet.Initialize(v, ID, eventHandler).SetTag("v-sheet")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	HasContent = False
	Footer.Initialize(vue, $"${ID}footer"$, eventHandler)
	Footer.SetTag("v-sheet-footer")
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	Sheet.SetText(elm.ToString)
End Sub

Sub SetData(xprop As String, xValue As Object) As VMSheet
	vue.SetData(xprop, xValue)
	Return Me
End Sub

'set as top part
Sub SetTopOverlap As VMSheet
	AddClass("mx-auto")
	SetStyleSingle("top", "-24px")
	SetStyleSingle("margin-bottom", "-24px")
	SetStyleSingle("position", "relative")
	SetAttrSingle("max-width", "calc(100% - 32px)")
	Return Me
End Sub

'get component
Sub ToString As String
	If Footer.HasContent Then SetText(Footer.tostring)
	Return Sheet.ToString
End Sub

Sub SetVIf(vif As String) As VMSheet
	Sheet.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMSheet
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
	HasContent = True
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub SetText(txt As String)
	Sheet.SetText(txt)
	HasContent = True
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
Sub SetColor(varColor As String) As VMSheet
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Sheet.Bind(":color", pp)
	Return Me
End Sub

'set elevation
Sub SetElevation(varElevation As String) As VMSheet
	If varElevation = "" Then Return Me
	If bStatic Then
		SetAttrSingle("elevation", varElevation)
		Return Me
	End If
	Dim pp As String = $"${ID}Elevation"$
	vue.SetStateSingle(pp, varElevation)
	Sheet.Bind(":elevation", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMSheet
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Sheet.Bind(":height", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As String) As VMSheet
	If varMaxHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-height", varMaxHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	Sheet.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As String) As VMSheet
	If varMaxWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-width", varMaxWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Sheet.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As String) As VMSheet
	If varMinHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-height", varMinHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	Sheet.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As String) As VMSheet
	If varMinWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-width", varMinWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	Sheet.Bind(":min-width", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMSheet
	If varTag = "" Then Return Me
	If bStatic Then
		SetAttrSingle("tag", varTag)
		Return Me
	End If
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	Sheet.Bind(":tag", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As String) As VMSheet
	If varWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("width", varWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	Sheet.Bind(":width", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMSheet
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Sheet.Bind(":dark", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMSheet
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Sheet.Bind(":light", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Boolean) As VMSheet
	If varTile = False Then Return Me
	If bStatic Then
		SetAttrSingle("tile", varTile)
		Return Me
	End If
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	Sheet.Bind(":tile", pp)
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
Sub SetColorIntensity(color As String, intensity As String) As VMSheet
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
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
	Footer.SetDesignMode(b)
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMSheet
	Sheet.SetStatic(b)
	Footer.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMSheet
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
	HasContent = True
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMSheet
	Sheet.SetVHtml(vhtml)
	HasContent = True
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
	HasContent = True
	Return Me
End Sub

Sub SetKey(k As String) As VMSheet
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSheet
	Sheet.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSheet
	Sheet.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSheet
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSheet
	Sheet.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMSheet
	Sheet.SetText(comp)
	HasContent = True
	Return Me
End Sub


Sub SetTextCenter As VMSheet
	Sheet.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSheet
	Sheet.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMSheet
	Sheet.SetVisible(b)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColor(textcolor As String) As VMSheet
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColorIntensity(textcolor As String, textintensity As String) As VMSheet
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Dim sIntensity As String = $"text--${textintensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub
