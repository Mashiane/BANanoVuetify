B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public ButtonToggle As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the ButtonToggle
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMButtonToggle
	ID = sid.tolowercase
	ButtonToggle.Initialize(v, ID)
	ButtonToggle.SetTag("v-btn-toggle")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return ButtonToggle.ToString
End Sub

Sub SetVModel(k As String) As VMButtonToggle
	ButtonToggle.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMButtonToggle
	ButtonToggle.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMButtonToggle
	ButtonToggle.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMButtonToggle
	Dim childHTML As String = child.ToString
	ButtonToggle.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMButtonToggle
	ButtonToggle.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMButtonToggle
	ButtonToggle.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr as map) As VMButtonToggle
	ButtonToggle.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMButtonToggle
	ButtonToggle.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMButtonToggle
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	ButtonToggle.Bind(":active-class", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMButtonToggle
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	ButtonToggle.Bind(":background-color", pp)
	Return Me
End Sub

'set borderless
Sub SetBorderless(varBorderless As Object) As VMButtonToggle
	Dim pp As String = $"${ID}Borderless"$
	vue.SetStateSingle(pp, varBorderless)
	ButtonToggle.Bind(":borderless", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMButtonToggle
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ButtonToggle.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMButtonToggle
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ButtonToggle.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMButtonToggle
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	ButtonToggle.Bind(":dense", pp)
	Return Me
End Sub

'set group
Sub SetGroup(varGroup As Object) As VMButtonToggle
	Dim pp As String = $"${ID}Group"$
	vue.SetStateSingle(pp, varGroup)
	ButtonToggle.Bind(":group", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMButtonToggle
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ButtonToggle.Bind(":light", pp)
	Return Me
End Sub

'set mandatory
Sub SetMandatory(varMandatory As Object) As VMButtonToggle
	Dim pp As String = $"${ID}Mandatory"$
	vue.SetStateSingle(pp, varMandatory)
	ButtonToggle.Bind(":mandatory", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As Object) As VMButtonToggle
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	ButtonToggle.Bind(":max", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Object) As VMButtonToggle
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	ButtonToggle.Bind(":multiple", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Object) As VMButtonToggle
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	ButtonToggle.Bind(":rounded", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Object) As VMButtonToggle
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	ButtonToggle.Bind(":shaped", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Object) As VMButtonToggle
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	ButtonToggle.Bind(":tile", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMButtonToggle
	ButtonToggle.SetValue(varValue, False)
	Return Me
End Sub

'
Sub SetOnChange(eventHandler As Object,methodName As String) As VMButtonToggle
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'hide the component
Sub Hide As VMButtonToggle
	ButtonToggle.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMButtonToggle
	ButtonToggle.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMButtonToggle
	ButtonToggle.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMButtonToggle
	ButtonToggle.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMButtonToggle
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMButtonToggle
	ButtonToggle.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMButtonToggle
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMButtonToggle
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	ButtonToggle.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMButtonToggle
	ButtonToggle.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMButtonToggle
	ButtonToggle.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMButtonToggle
	ButtonToggle.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMButtonToggle
	ButtonToggle.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMButtonToggle
	ButtonToggle.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMButtonToggle
	ButtonToggle.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMButtonToggle
	ButtonToggle.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMButtonToggle
	ButtonToggle.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMButtonToggle
	ButtonToggle.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMButtonToggle
	ButtonToggle.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMButtonToggle
	ButtonToggle.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMButtonToggle
	ButtonToggle.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMButtonToggle
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMButtonToggle
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMButtonToggle
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMButtonToggle
	ButtonToggle.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMButtonToggle
	ButtonToggle.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMButtonToggle
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMButtonToggle
	ButtonToggle.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMButtonToggle
	ButtonToggle.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMButtonToggle
	ButtonToggle.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMButtonToggle
ButtonToggle.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMButtonToggle
ButtonToggle.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMButtonToggle
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMButtonToggle
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub