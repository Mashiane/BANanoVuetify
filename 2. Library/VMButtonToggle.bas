B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ButtonToggle As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
End Sub

'initialize the ButtonToggle
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMButtonToggle
	ID = sid.tolowercase
	ButtonToggle.Initialize(v, ID)
	ButtonToggle.SetTag("v-btn-toggle")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	SetOnChange(Module, $"${ID}_change"$)
	Return Me
End Sub

Sub AddIcon(btnID As String, btnIcon As String, btnColor As String, btnValue As String, btnToolTip As String)
	Dim btn As VMButton
	btn.Initialize(vue, btnID, Me)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetColor(btnColor)
	btn.AddIcon(btnIcon,  "", "")
	btn.SetTooltip(btnToolTip)
	If btnValue <> "" Then
		btn.SetAttrSingle("value", btnValue)
	End If
	AddComponent(btn.ToString)
End Sub

Sub AddButton(btnID As String, btnText As String, btnIcon As String, btnColor As String, btnValue As String, btnToolTip As String)
	Dim btn As VMButton
	btn.Initialize(vue, btnID, Me)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetColor(btnColor)
	
	
	If btnText = "" Then
		btn.SetLabel(btnText)
		btn.AddIcon(btnIcon, "left", "")
	Else
		btn.SetLabel(btnText)
		btn.AddIcon(btnIcon, "right", "")
	End If
	btn.SetTooltip(btnToolTip)
	If btnValue <> "" Then
		btn.SetAttrSingle("value", btnValue)
	End If
	AddComponent(btn.ToString)
End Sub

'selValue
Sub SetOnChange(eventHandler As Object,methodName As String) As VMButtonToggle
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim items As List
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(items))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
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

Sub SetVIf(vif As String) As VMButtonToggle
	ButtonToggle.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMButtonToggle
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
Sub SetAttr(attr As Map) As VMButtonToggle
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
Sub SetActiveClass(varActiveClass As String) As VMButtonToggle
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	ButtonToggle.Bind(":active-class", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As String) As VMButtonToggle
	If varBackgroundColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("background-color", varBackgroundColor)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	ButtonToggle.Bind(":background-color", pp)
	Return Me
End Sub


'set color intensity
Sub SetBackgroundColorIntensity(color As String, intensity As String) As VMButtonToggle
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("background-color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}backgroundcolor"$
	vue.SetStateSingle(pp, scolor)
	ButtonToggle.Bind(":background-color", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMButtonToggle
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ButtonToggle.Bind(":color", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As String) As VMButtonToggle
	If varMax = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max", varMax)
		Return Me
	End If
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	ButtonToggle.Bind(":max", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMButtonToggle
	If varValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("value", varValue)
		Return Me
	End If
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	ButtonToggle.Bind(":value", pp)
	Return Me
End Sub

'set borderless
Sub SetBorderless(varBorderless As Boolean) As VMButtonToggle
	If varBorderless = False Then Return Me
	If bStatic Then
		SetAttrSingle("borderless", varBorderless)
		Return Me
	End If
	Dim pp As String = $"${ID}Borderless"$
	vue.SetStateSingle(pp, varBorderless)
	ButtonToggle.Bind(":borderless", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMButtonToggle
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ButtonToggle.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMButtonToggle
	If varDense = False Then Return Me
	If bStatic Then
		SetAttrSingle("dense", varDense)
		Return Me
	End If
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	ButtonToggle.Bind(":dense", pp)
	Return Me
End Sub

'set group
Sub SetGroup(varGroup As Boolean) As VMButtonToggle
	If varGroup = False Then Return Me
	If bStatic Then
		SetAttrSingle("group", varGroup)
		Return Me
	End If
	Dim pp As String = $"${ID}Group"$
	vue.SetStateSingle(pp, varGroup)
	ButtonToggle.Bind(":group", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMButtonToggle
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ButtonToggle.Bind(":light", pp)
	Return Me
End Sub

'set mandatory
Sub SetMandatory(varMandatory As Boolean) As VMButtonToggle
	If varMandatory = False Then Return Me
	If bStatic Then
		SetAttrSingle("mandatory", varMandatory)
		Return Me
	End If
	Dim pp As String = $"${ID}Mandatory"$
	vue.SetStateSingle(pp, varMandatory)
	ButtonToggle.Bind(":mandatory", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Boolean) As VMButtonToggle
	If varMultiple = False Then Return Me
	If bStatic Then
		SetAttrSingle("multiple", varMultiple)
		Return Me
	End If
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	ButtonToggle.Bind(":multiple", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Boolean) As VMButtonToggle
	If varRounded = False Then Return Me
	If bStatic Then
		SetAttrSingle("rounded", varRounded)
		Return Me
	End If
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	ButtonToggle.Bind(":rounded", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Boolean) As VMButtonToggle
	If varShaped = False Then Return Me
	If bStatic Then
		SetAttrSingle("shaped", varShaped)
		Return Me
	End If
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	ButtonToggle.Bind(":shaped", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTitle As Boolean) As VMButtonToggle
	If varTitle = False Then Return Me
	If bStatic Then
		SetAttrSingle("tile", varTitle)
		Return Me
	End If
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTitle)
	ButtonToggle.Bind(":tile", pp)
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
Sub SetColorIntensity(color As String, intensity As String) As VMButtonToggle
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
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

'set static
Sub SetStatic(b As Boolean) As VMButtonToggle
	ButtonToggle.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMButtonToggle
	ButtonToggle.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMButtonToggle
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

