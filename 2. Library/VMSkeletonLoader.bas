B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public SkeletonLoader As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the SkeletonLoader
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSkeletonLoader
	ID = sid.tolowercase
	SkeletonLoader.Initialize(v, ID)
	SkeletonLoader.SetTag("v-skeleton-loader")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSkeletonLoader
	SkeletonLoader.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSkeletonLoader
	SkeletonLoader.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSkeletonLoader
	SkeletonLoader.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSkeletonLoader
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'get component
Sub ToString As String
	Return SkeletonLoader.ToString
End Sub

Sub SetVModel(k As String) As VMSkeletonLoader
	SkeletonLoader.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMSkeletonLoader
	SkeletonLoader.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSkeletonLoader
	SkeletonLoader.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSkeletonLoader
	Dim childHTML As String = child.ToString
	SkeletonLoader.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSkeletonLoader
	SkeletonLoader.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSkeletonLoader
	SkeletonLoader.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSkeletonLoader
	SkeletonLoader.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSkeletonLoader
	SkeletonLoader.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set boilerplate
Sub SetBoilerplate(varBoilerplate As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}Boilerplate"$
	vue.SetStateSingle(pp, varBoilerplate)
	SkeletonLoader.Bind(":boilerplate", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	SkeletonLoader.Bind(":dark", pp)
	Return Me
End Sub

'set elevation
Sub SetElevation(varElevation As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}Elevation"$
	vue.SetStateSingle(pp, varElevation)
	SkeletonLoader.Bind(":elevation", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	SkeletonLoader.Bind(":height", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	SkeletonLoader.Bind(":light", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	SkeletonLoader.Bind(":loading", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	SkeletonLoader.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	SkeletonLoader.Bind(":max-width", pp)
	Return Me
End Sub

'set min-heigh
Sub SetMinHeight(varMinHeigh As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeigh)
	SkeletonLoader.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	SkeletonLoader.Bind(":min-width", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	SkeletonLoader.Bind(":tile", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	SkeletonLoader.Bind(":transition", pp)
	Return Me
End Sub

'set type
Sub SetType(varType As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}Type"$
	vue.SetStateSingle(pp, varType)
	SkeletonLoader.Bind(":type", pp)
	Return Me
End Sub

'set types
Sub SetTypes(varTypes As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}Types"$
	vue.SetStateSingle(pp, varTypes)
	SkeletonLoader.Bind(":types", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMSkeletonLoader
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	SkeletonLoader.Bind(":width", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMSkeletonLoader
	SkeletonLoader.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMSkeletonLoader
	SkeletonLoader.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMSkeletonLoader
	SkeletonLoader.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMSkeletonLoader
	SkeletonLoader.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSkeletonLoader
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMSkeletonLoader
	SkeletonLoader.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMSkeletonLoader
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMSkeletonLoader
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	SkeletonLoader.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMSkeletonLoader
	SkeletonLoader.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSkeletonLoader
	SkeletonLoader.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMSkeletonLoader
	SkeletonLoader.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMSkeletonLoader
	SkeletonLoader.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMSkeletonLoader
	SkeletonLoader.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSkeletonLoader
	SkeletonLoader.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMSkeletonLoader
	SkeletonLoader.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMSkeletonLoader
	SkeletonLoader.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMSkeletonLoader
	SkeletonLoader.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMSkeletonLoader
	SkeletonLoader.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMSkeletonLoader
	SkeletonLoader.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMSkeletonLoader
	SkeletonLoader.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSkeletonLoader
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMSkeletonLoader
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMSkeletonLoader
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSkeletonLoader
SkeletonLoader.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub