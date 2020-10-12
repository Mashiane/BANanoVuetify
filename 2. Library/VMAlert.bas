B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Alert As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
	Public Container As VMContainer
	Private smodel As String
End Sub

'initialize the Alert
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMAlert
	ID = sid.tolowercase
	Alert.Initialize(v, ID)
	Alert.SetTag("v-alert")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	Container.Initialize(vue, $"${ID}cont"$, Module)
	SetVModel(Alert.showkey)
	Hide
	Return Me
End Sub

Sub SetData(prop As String, value As Object) As VMAlert
	vue.SetData(prop, value)
	Return Me
End Sub

Sub RemoveVModel As VMAlert
	RemoveAttr("v-model")
	Return Me
End Sub

'add a content of the alert
Sub AddContent(child As String)
	Alert.SetText(child)
End Sub

Sub SetContent(sContent As String) As VMAlert
	If bStatic Then
		AddComponent(sContent)
	Else
		Dim contid As String = $"${ID}content"$
		vue.SetData(contid, sContent)
		AddComponent($"{{ ${contid} }}"$)	
	End If
	Return Me
End Sub

'get component
Sub ToString As String
	If Container.HasContent Then AddComponent(Container.ToString)
	Return Alert.ToString
End Sub

Sub SetVModel(k As String) As VMAlert
	smodel = k
	Alert.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMAlert
	Alert.SetVIf(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMAlert
	Dim childHTML As String = child.ToString
	Alert.SetText(childHTML)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMAlert
	Alert.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMAlert
	Alert.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMAlert
	Alert.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub




'set border
Sub SetBorder(varBorder As String) As VMAlert
	If varBorder = "" Then Return Me
	If bStatic Then
		SetAttrSingle("border", varBorder)
		Return Me
	End If
	Dim pp As String = $"${ID}Border"$
	vue.SetStateSingle(pp, varBorder)
	Alert.Bind(":border", pp)
	Return Me
End Sub

'set close-label
Sub SetCloseLabel(varCloseLabel As String) As VMAlert
	If varCloseLabel = "" Then Return Me
	If varCloseLabel = "$vuetify.close" Then Return Me
	If bStatic Then
		SetAttrSingle("close-label", varCloseLabel)
		Return Me
	End If
	Dim pp As String = $"${ID}CloseLabel"$
	vue.SetStateSingle(pp, varCloseLabel)
	Alert.Bind(":close-label", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMAlert
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Alert.Bind(":color", pp)
	Return Me
End Sub

'set elevation
Sub SetElevation(varElevation As String) As VMAlert
	If varElevation = "" Then Return Me
	If bStatic Then
		SetAttrSingle("elevation", varElevation)
		Return Me
	End If
	Dim pp As String = $"${ID}Elevation"$
	vue.SetStateSingle(pp, varElevation)
	Alert.Bind(":elevation", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMAlert
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Alert.Bind(":height", pp)
	Return Me
End Sub

'set icon
Sub SetIcon(varIcon As String) As VMAlert
	If bStatic Then
		SetAttrSingle("icon", varIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}Icon"$
	vue.SetStateSingle(pp, varIcon)
	Alert.Bind(":icon", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As String) As VMAlert
	If varMaxHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-height", varMaxHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	Alert.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As String) As VMAlert
	If varMaxWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-width", varMaxWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Alert.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As String) As VMAlert
	If varMinHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-height", varMinHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	Alert.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As String) As VMAlert
	If varMinWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-width", varMinWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	Alert.Bind(":min-width", pp)
	Return Me
End Sub

'set mode
Sub SetMode(varMode As String) As VMAlert
	If varMode = "" Then Return Me
	If bStatic Then
		SetAttrSingle("mode", varMode)
		Return Me
	End If
	Dim pp As String = $"${ID}Mode"$
	vue.SetStateSingle(pp, varMode)
	Alert.Bind(":mode", pp)
	Return Me
End Sub

'set origin
Sub SetOrigin(varOrigin As String) As VMAlert
	If varOrigin = "" Then Return Me
	If bStatic Then
		SetAttrSingle("origin", varOrigin)
		Return Me
	End If
	Dim pp As String = $"${ID}Origin"$
	vue.SetStateSingle(pp, varOrigin)
	Alert.Bind(":origin", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMAlert
	If varTag = "" Then Return Me
	If bStatic Then
		SetAttrSingle("tag", varTag)
		Return Me
	End If
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	Alert.Bind(":tag", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As String) As VMAlert
	If varTransition = "" Then Return Me
	If bStatic Then
		SetAttrSingle("transition", varTransition)
		Return Me
	End If
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	Alert.Bind(":transition", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As String) As VMAlert
	If bStatic Then
		SetAttrSingle("type", varType)
		Return Me
	End If
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	Alert.Bind(":type", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As String) As VMAlert
	If varWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("width", varWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	Alert.Bind(":width", pp)
	Return Me
End Sub

'set colored-border
Sub SetColoredBorder(varColoredBorder As Boolean) As VMAlert
	If bStatic Then
		SetAttrSingle("colored-border", varColoredBorder)
		Return Me
	End If
	Dim pp As String = $"${ID}ColoredBorder"$
	vue.SetStateSingle(pp, varColoredBorder)
	Alert.Bind(":colored-border", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMAlert
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Alert.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMAlert
	If bStatic Then
		SetAttrSingle("dense", varDense)
		Return Me
	End If
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	Alert.Bind(":dense", pp)
	Return Me
End Sub

'set dismissible
Sub SetDismissible(varDismissible As Boolean) As VMAlert
	If bStatic Then
		SetAttrSingle("dismissible", varDismissible)
		Return Me
	End If
	Dim pp As String = $"${ID}Dismissible"$
	vue.SetStateSingle(pp, varDismissible)
	Alert.Bind(":dismissible", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMAlert
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Alert.Bind(":light", pp)
	Return Me
End Sub

'set outline
Sub SetOutlined(varOutlined As Boolean) As VMAlert
	If bStatic Then
		SetAttrSingle("outlined", varOutlined)
		Return Me
	End If
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	Alert.Bind(":outlined", pp)
	Return Me
End Sub

'set prominent
Sub SetProminent(varProminent As Boolean) As VMAlert
	If bStatic Then
		SetAttrSingle("prominent", varProminent)
		Return Me
	End If
	Dim pp As String = $"${ID}Prominent"$
	vue.SetStateSingle(pp, varProminent)
	Alert.Bind(":prominent", pp)
	Return Me
End Sub

'set text
Sub SetText(varText As Boolean) As VMAlert
If bStatic Then
SetAttrSingle("text", varText)
Return Me
End If
Dim pp As String = $"${ID}Text"$
vue.SetStateSingle(pp, varText)
Alert.Bind(":text", pp)
Return Me
End Sub

'set tile
Sub SetTile(varTile As Boolean) As VMAlert
If bStatic Then
SetAttrSingle("tile", varTile)
Return Me
End If
Dim pp As String = $"${ID}Tile"$
vue.SetStateSingle(pp, varTile)
Alert.Bind(":tile", pp)
Return Me
End Sub

'set value
Sub SetValue(varValue As Boolean) As VMAlert
If varValue = False Then Return Me
If bStatic Then
SetAttrSingle("value", varValue)
Return Me
End If
Dim pp As String = $"${ID}Value"$
vue.SetStateSingle(pp, varValue)
Alert.Bind(":value", pp)
Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMAlert
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
SetAttr(CreateMap("@input": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub

Sub SetVisible(b As Boolean) 
	vue.SetData(smodel, b)
End Sub

'hide the component
Sub Hide As VMAlert
	vue.SetData(smodel, False)
    Return Me
End Sub

'show the component
Sub Show As VMAlert
	vue.SetData(smodel, True)
    Return Me
End Sub

'enable the component
Sub Enable As VMAlert
	Alert.Enable(True)
    Return Me
End Sub

'disable the component
Sub Disable As VMAlert
	Alert.Enable(False)
    Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMAlert
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMAlert
	Alert.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMAlert
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMAlert
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Alert.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMAlert
	Alert.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMAlert
	Alert.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMAlert
	Alert.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMAlert
	Alert.SetDesignMode(b)
	Container.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMAlert
	Alert.SetStatic(b)
	Container.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMAlert
	Alert.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMAlert
	Alert.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMAlert
	Alert.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMAlert
	Alert.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMAlert
	Alert.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMAlert
	Alert.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMAlert
	Alert.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMAlert
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMAlert
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMAlert
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMAlert
	Alert.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMAlert
	Alert.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMAlert
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMAlert
	Alert.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMAlert
	Alert.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMAlert
	Alert.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMAlert
Alert.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub


'set color intensity - built in
Sub SetTextColor(textcolor As String) As VMAlert
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity - built in
Sub SetTextColorIntensity(textcolor As String, textintensity As String) As VMAlert
	If textcolor = "" Then Return Me
	Dim sColor As String = $"${textcolor}--text"$
	Dim sIntensity As String = $"text--${textintensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub
