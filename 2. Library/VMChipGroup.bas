B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ChipGroup As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private itemKey As String
	Private items As List
	Private hasSubHeading As Boolean
	Private heading As String
	Private vmodel As String
	Private bStatic As Boolean
End Sub

'initialize the ChipGroup
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMChipGroup
	ID = sid.tolowercase
	ChipGroup.Initialize(v, ID)
	ChipGroup.SetTag("v-chip-group")
	DesignMode = False
	Module = eventHandler
	vue = v
	itemKey = $"${ID}items"$
	vue.SetData(itemKey, vue.NewList)
	items.Initialize 
	hasSubHeading = False
	heading = ""
	SetOnChange(Module, $"${ID}_change"$)
	bStatic = False
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	ChipGroup.SetText(elm.ToString)
End Sub


Sub SetStatic(b As Boolean) As VMChipGroup
	bStatic = b
	ChipGroup.SetStatic(b)
	Return Me
End Sub

Sub SetSubHeading(hdr As String) As VMChipGroup
	hasSubHeading = True
	Dim el As VMElement
	el.Initialize(vue, $"${ID}hdr"$)
	el.SetTag("span")
	el.SetText(hdr)
	el.AddClass("subheading") 
	heading = el.tostring
	Return Me
End Sub

'add an actual chip, does not work with clear
Sub AddChip(chip As VMChip) As VMChipGroup
	SetText(chip.ToString)
	Return Me
End Sub

Sub SetData(prop As String, value As Object) As VMChipGroup
	vue.SetData(prop, value)
	Return Me
End Sub

'add a chip from own specs
Sub AddChip1(mkey As String, mtext As String, mprops As Map, mstyles As Map, lclasses As List) As VMChipGroup
	Dim mchip As VMChip
	mchip.Initialize(vue, mkey, Module)
	mchip.BuildModel(mprops, mstyles, lclasses, Null)
	mchip.SetText(mtext)
	SetText(mchip.ToString)
	Return Me
End Sub

'update contents and refresh UI
Sub Update
	vue.SetData(itemKey, items)
End Sub

'add a chip to the group, works with clear
Sub AddItem(cKey As String, bOutlined As Boolean, bFilter As Boolean, cText As String)
	Dim mchip As Map = CreateMap()
	mchip.Put("key", cKey)
	mchip.Put("outlined", bOutlined)
	mchip.Put("filter", bFilter)
	mchip.Put("outlined", bOutlined)
	mchip.Put("label", cText)
	items.Add(mchip)
End Sub

'add a chip to the group, works with clear
Sub AddItems(cText As List) As VMChipGroup
	For Each k As String In cText
		Dim mchip As Map = CreateMap()
		mchip.Put("label", k)
		mchip.Put("key", k)
		items.Add(mchip)
	Next
	Return Me
End Sub

'clear the items
Sub Clear As VMChipGroup
	vue.SetData(itemKey, vue.NewList)
	items.clear
	Return Me
End Sub

'get component
Sub ToString As String
	If vue.ShowWarnings Then
		Dim eName As String = $"${ID}_change"$
		If SubExists(Module, eName) = False Then
			Log($"VMChipGroup.${eName} event has not been defined!"$)
		End If
	End If
	If items.Size > 0 Then
		Dim xchip As VMChip
		xchip.Initialize(vue, "", Module)
		xchip.SetVFor("item", itemKey)
		xchip.SetAttrSingle(":outlined", "item.outlined")
		xchip.SetAttrSingle(":filter", "item.filter")
		xchip.SetAttrSingle(":key", "item.key")
		xchip.SetAttrSingle(":id", "item.key")
		xchip.SetAttrSingle(":value", "item.key")
		xchip.SetText("{{ item.label }}")
		SetText(xchip.ToString)
		Update
	End If
	Dim sb As StringBuilder
	sb.Initialize 
	If hasSubHeading Then 
		sb.Append(heading)
	End If
	sb.Append(ChipGroup.ToString)
	Return sb.tostring
End Sub

Sub SetVModel(k As String) As VMChipGroup
	vmodel = k
	ChipGroup.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMChipGroup
	ChipGroup.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMChipGroup
	ChipGroup.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMChipGroup
	Dim childHTML As String = child.ToString
	ChipGroup.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMChipGroup
	ChipGroup.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMChipGroup
	ChipGroup.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMChipGroup
	ChipGroup.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMChipGroup
	ChipGroup.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	ChipGroup.Bind(":active-class", pp)
	Return Me
End Sub

'set center-active
Sub SetCenterActive(varCenterActive As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("center-active", varCenterActive)
		Return Me
	End If
	Dim pp As String = $"${ID}CenterActive"$
	vue.SetStateSingle(pp, varCenterActive)
	ChipGroup.Bind(":center-active", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ChipGroup.Bind(":color", pp)
	Return Me
End Sub

'set column
Sub SetColumn(varColumn As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("column", varColumn)
		Return Me
	End If
	Dim pp As String = $"${ID}Column"$
	vue.SetStateSingle(pp, varColumn)
	ChipGroup.Bind(":column", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ChipGroup.Bind(":dark", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ChipGroup.Bind(":light", pp)
	Return Me
End Sub

'set mandatory
Sub SetMandatory(varMandatory As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("mandatory", varMandatory)
		Return Me
	End If
	Dim pp As String = $"${ID}Mandatory"$
	vue.SetStateSingle(pp, varMandatory)
	ChipGroup.Bind(":mandatory", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("max", varMax)
		Return Me
	End If
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	ChipGroup.Bind(":max", pp)
	Return Me
End Sub

'set mobile-break-point
Sub SetMobileBreakPoint(varMobileBreakPoint As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("mobile-break-point", varMobileBreakPoint)
		Return Me
	End If
	Dim pp As String = $"${ID}MobileBreakPoint"$
	vue.SetStateSingle(pp, varMobileBreakPoint)
	ChipGroup.Bind(":mobile-break-point", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("multiple", varMultiple)
		Return Me
	End If
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	ChipGroup.Bind(":multiple", pp)
	Return Me
End Sub

'set next-icon
Sub SetNextIcon(varNextIcon As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("next-icon", varNextIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}NextIcon"$
	vue.SetStateSingle(pp, varNextIcon)
	ChipGroup.Bind(":next-icon", pp)
	Return Me
End Sub

'set prev-icon
Sub SetPrevIcon(varPrevIcon As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("prev-icon", varPrevIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}PrevIcon"$
	vue.SetStateSingle(pp, varPrevIcon)
	ChipGroup.Bind(":prev-icon", pp)
	Return Me
End Sub

'set show-arrows
Sub SetShowArrows(varShowArrows As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("show-arrows", varShowArrows)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowArrows"$
	vue.SetStateSingle(pp, varShowArrows)
	ChipGroup.Bind(":show-arrows", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMChipGroup
	If bStatic Then
		SetAttrSingle("value", varValue)
		Return Me
	End If
	If vmodel = "" Then
		vmodel = $"${ID}value"$
		SetVModel(vmodel)
	End If
	vue.SetData(vmodel, varValue)
	ChipGroup.SetValue(varValue)
	Return Me
End Sub

Sub GetValue As String
	Dim svalue As String = vue.GetData(vmodel)
	Return svalue
End Sub

'
Sub SetOnChange(eventHandler As Object, methodName As String) As VMChipGroup
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'hide the component
Sub Hide As VMChipGroup
	ChipGroup.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMChipGroup
	ChipGroup.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMChipGroup
	ChipGroup.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMChipGroup
	ChipGroup.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMChipGroup
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMChipGroup
	ChipGroup.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMChipGroup
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMChipGroup
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	ChipGroup.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMChipGroup
	ChipGroup.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMChipGroup
	ChipGroup.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMChipGroup
	ChipGroup.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMChipGroup
	ChipGroup.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMChipGroup
	ChipGroup.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMChipGroup
	ChipGroup.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMChipGroup
	ChipGroup.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMChipGroup
	ChipGroup.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMChipGroup
	ChipGroup.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMChipGroup
	ChipGroup.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMChipGroup
	ChipGroup.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMChipGroup
	ChipGroup.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMChipGroup
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMChipGroup
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMChipGroup
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMChipGroup
	ChipGroup.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMChipGroup
	ChipGroup.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMChipGroup
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMChipGroup
	ChipGroup.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMChipGroup
	ChipGroup.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMChipGroup
	ChipGroup.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMChipGroup
ChipGroup.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMChipGroup
ChipGroup.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMChipGroup
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMChipGroup
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub