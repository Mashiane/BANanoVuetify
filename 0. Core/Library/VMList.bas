B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public List As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public HasContent As Boolean
	Private items As Map
	Private bStatic As Boolean
End Sub

'initialize the List
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMList
	ID = sid.tolowercase
	List.Initialize(v, ID)
	List.SetTag("v-list")
	DesignMode = False
	Module = eventHandler
	vue = v
	HasContent = False
	items.Initialize
	bStatic = False
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMList
	bStatic = b
	List.SetStatic(b)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMList
	List.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMList
	List.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMList
	List.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMList
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMList
	List.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMList
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub


Sub AddSubHeader(Text As String) As VMList
	List.AddSubHeader(Text)
	HasContent = True
	Return Me
End Sub

Sub AddDivider As VMList
	Dim strLine As String = $"<v-divider></v-divider>"$
	SetText(strLine)
	HasContent = True
	Return Me
End Sub

Sub CreateListItem(datasource As String, key As String, avatar As String, iconName As String, title As String, subtitle As String, actionIcon As String) As VMListItem
	Dim vli As VMListItem
	vli.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	If DesignMode Then Return vli
	vli.SetAttrSingle("v-for", $"(item, i) in ${datasource}"$)
	If key = "" Then
		vli.SetAttrSingle(":key", "i")
		vli.SetAttrSingle(":id", "i")
	Else
		vli.SetAttrSingle(":key", $"item.${key}"$)
		vli.SetAttrSingle(":id", $"item.${key}"$)
	End If
	vli.SetOnClick($"${ID}_click"$)
	'
	If avatar <> "" Then
		Dim lia As VMListItemAvatar
		lia.Initialize(vue, "", Module).SetStatic(bStatic).SetVIf($"item.${avatar}"$)
		Dim img As VMImage
		img.Initialize(vue, "", Module).SetStatic(bStatic)
		img.SetAttrSingle(":src", $"item.${avatar}"$)
		img.Pop(lia.ListItemAvatar)
		lia.Pop(vli.ListItem)
	End If
	'
	If iconName <> "" Then
		Dim vlii As VMListItemIcon
		vlii.Initialize(vue, "", Module).SetStatic(bStatic).SetVif($"item.${iconName}"$)
		Dim icon As VMIcon
		icon.Initialize(vue,"", Module).SetStatic(bStatic)
		icon.SetVText($"item.${iconName}"$)
		icon.Pop(vlii.ListItemIcon)
		vlii.Pop(vli.ListItem)
	End If
	'
	Dim iContent As Int = 0
	If title <> "" Then iContent = iContent + 1
	If subtitle <> "" Then iContent = iContent + 1
	
	If iContent > 0 Then
		Dim lic As VMListItemContent
		lic.Initialize(vue,"", Module).SetStatic(bStatic)
		'
		If title <> "" Then
			Dim lit As VMListItemTitle
			lit.Initialize(vue, "", Module).SetStatic(bStatic).SetVText($"item.${title}"$)
			lit.Pop(lic.ListItemContent)
		End If
		'
		If subtitle <> "" Then
			Dim listt As VMListItemSubTitle
			listt.Initialize(vue, "", Module).SetStatic(bStatic).SetVText($"item.${subtitle}"$)
			listt.Pop(lic.ListItemContent)
		End If
		lic.Pop(vli.ListItem)
	End If
	'
	If actionIcon <> "" Then
		Dim la As VMListItemAction
		la.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVIf($"item.${actionIcon}"$)
		Dim btn As VMButton
		btn.Initialize(vue, "", Module).SetAttrLoose("icon")
		Dim icon As VMIcon
		icon.Initialize(vue, "", Module)
		icon.SetVText($"item.${actionIcon}"$)
		btn.AddComponent(icon.ToString)
		la.AddComponent(btn.ToString)
		la.Pop(vli.ListItem)
	End If
	Return vli
End Sub

'define a template to load items from
Sub SetDataSourceTemplate(datasource As String, key As String, avatar As String, iconName As String, title As String, subtitle As String, actionIcon As String) As VMList
	If vue.StateExists(datasource) = False Then
		vue.SetData(datasource, vue.newlist)
	End If
	If DesignMode Then Return Me
	'
	Dim tmp As VMTemplate
	tmp.Initialize(vue, $"${ID}tmpl"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	tmp.SetAttrSingle("v-for", $"(item, i) in ${datasource}"$)
	'
	Dim vli As VMListItem
	vli.Initialize(vue, "", Module).SetStatic(bStatic)
	vli.SetVIf($"item.${key}"$)
	vli.Bind(":key", $"item.${key}"$)
	vli.SetAttrSingle(":id", $"item.${key}"$)
	vli.SetOnClick($"${ID}_click"$)
	'
	If avatar <> "" Then
		Dim lia As VMListItemAvatar
		lia.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVIf($"item.${avatar}"$)
		Dim img As VMImage
		img.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetAttrSingle(":src", $"item.${avatar}"$)
		img.Pop(lia.ListItemAvatar)
		lia.Pop(vli.ListItem)
	End If
	'
	If iconName <> "" Then
		Dim vlii As VMListItemIcon
		vlii.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVif($"item.${iconName}"$)
		Dim icon As VMIcon
		icon.Initialize(vue,"", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVText($"item.${iconName}"$)
		icon.Pop(vlii.ListItemIcon)
		vlii.Pop(vli.ListItem)
	End If
	'
	Dim iContent As Int = 0
	If title <> "" Then iContent = iContent + 1
	If subtitle <> "" Then iContent = iContent + 1
	
	If iContent > 0 Then
		Dim lic As VMListItemContent
		lic.Initialize(vue,"", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
		'
		If title <> "" Then
			Dim lit As VMListItemTitle
			lit.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVText($"item.${title}"$)
			lit.Pop(lic.ListItemContent)
		End If
		'
		If subtitle <> "" Then
			Dim listt As VMListItemSubTitle
			listt.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVText($"item.${subtitle}"$)
			listt.Pop(lic.ListItemContent)
		End If
		lic.Pop(vli.ListItem)
	End If
	'
	If actionIcon <> "" Then
		Dim la As VMListItemAction
		la.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVIf($"item.${actionIcon}"$)
		Dim btn As VMButton
		btn.Initialize(vue, "", Module).SetAttrLoose("icon")
		Dim icon As VMIcon
		icon.Initialize(vue, "", Module)
		icon.SetVText($"item.${actionIcon}"$)
		btn.AddComponent(icon.ToString)
		la.AddComponent(btn.ToString)
		la.Pop(vli.ListItem)
	End If
	vli.Pop(tmp.Template)	
	'add the divider
	Dim dvd As VMDivider
	dvd.Initialize(vue).SetVElseIf("item.divider").Bind(":key", "i").SetInset
	dvd.Pop(tmp.Template)
	'add sub heading
	Dim sh As VMSubHeader
	sh.Initialize(vue).SetVElseIf("item.header").Bind(":key", "item.header").SetVText("item.header").SetInset(True)
	sh.Pop(tmp.Template)
	tmp.Pop(List)
	HasContent = True
	Return Me
End Sub

'define a template to load items from
Sub SetDataSourceTemplate1(datasource As String, key As String, avatar As String, iconName As String, iconColor As String, title As String, subtitle As String, subtitle1 As String, actionIcon As String, actionIconColor As String) As VMList
	If vue.StateExists(datasource) = False Then
		vue.SetData(datasource, vue.newlist)
	End If
	If DesignMode Then Return Me
	'
	Dim tmp As VMTemplate
	tmp.Initialize(vue, $"${ID}tmpl"$, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	tmp.SetAttrSingle("v-for", $"(item, i) in ${datasource}"$)
	'
	Dim vli As VMListItem
	vli.Initialize(vue, "", Module).SetStatic(bStatic)
	vli.SetVIf($"item.${key}"$)
	vli.Bind(":key", $"item.${key}"$)
	vli.SetAttrSingle(":id", $"item.${key}"$)
	vli.SetOnClick($"${ID}_click"$)
	'
	If avatar <> "" Then
		Dim lia As VMListItemAvatar
		lia.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVIf($"item.${avatar}"$)
		Dim img As VMImage
		img.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetAttrSingle(":src", $"item.${avatar}"$)
		img.Pop(lia.ListItemAvatar)
		lia.Pop(vli.ListItem)
	End If
	'
	If iconName <> "" Then
		Dim vlii As VMListItemIcon
		vlii.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVif($"item.${iconName}"$)
		Dim icon As VMIcon
		icon.Initialize(vue,"", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVText($"item.${iconName}"$)
		If iconColor <> "" Then icon.SetAttrSingle(":color", $"item.${iconColor}"$)
		icon.Pop(vlii.ListItemIcon)
		vlii.Pop(vli.ListItem)
	End If
	'
	Dim iContent As Int = 0
	If title <> "" Then iContent = iContent + 1
	If subtitle <> "" Then iContent = iContent + 1
	
	If iContent > 0 Then
		Dim lic As VMListItemContent
		lic.Initialize(vue,"", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
		'
		If title <> "" Then
			Dim lit As VMListItemTitle
			lit.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVText($"item.${title}"$)
			lit.Pop(lic.ListItemContent)
		End If
		'
		If subtitle <> "" Then
			Dim listt As VMListItemSubTitle
			listt.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVText($"item.${subtitle}"$)
			listt.Pop(lic.ListItemContent)
		End If
		'
		If subtitle1 <> "" Then
			Dim listt1 As VMListItemSubTitle
			listt1.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVText($"item.${subtitle1}"$)
			listt1.Pop(lic.ListItemContent)
		End If
		lic.Pop(vli.ListItem)
	End If
	'
	If actionIcon <> "" Then
		Dim la As VMListItemAction
		la.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetVIf($"item.${actionIcon}"$)
		Dim btn As VMButton
		btn.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetAttrLoose("icon")
		Dim icon As VMIcon
		icon.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
		If actionIconColor <> "" Then icon.SetAttrSingle(":color", $"item.${actionIconColor}"$)
		icon.SetVText($"item.${actionIcon}"$)
		btn.AddComponent(icon.ToString)
		la.AddComponent(btn.ToString)
		la.Pop(vli.ListItem)
	End If
	
	vli.Pop(tmp.Template)	
	'add the divider
	Dim dvd As VMDivider
	dvd.Initialize(vue).SetVElseIf("item.divider").Bind(":key", "i").SetInset
	dvd.Pop(tmp.Template)
	'add sub heading
	Dim sh As VMSubHeader
	sh.Initialize(vue).SetVElseIf("item.header").Bind(":key", "item.header").SetVText("item.header").SetInset(True)
	sh.Pop(tmp.Template)
	tmp.Pop(List)
	HasContent = True
	Return Me
End Sub


'add title subtitle
Sub SetDataSource(datasource As String, key As String, avatar As String, iconName As String, title As String, subtitle As String, actionIcon As String) As VMList
	Dim vli As VMListItem = CreateListItem(datasource, key, avatar, iconName, title, subtitle, actionIcon)
	vli.pop(List)
	HasContent = True
	Return Me
End Sub

Sub AddItem(key As String, avatar As String, iconName As String, title As String, subtitle As String, actionIcon As String) As VMList
	key = key.tolowercase
	If key = "" Then
		key = items.size
	End If
	title = BANano.SF(title)
	subtitle = BANano.SF(subtitle)
	Dim item As Map = CreateMap()
	item.Put("id", key)
	item.Put("avatar", avatar)
	item.Put("icon", iconName)
	item.Put("title", title)
	item.Put("subtitle", subtitle)
	item.Put("action", actionIcon)
	items.Put(key, item)
	HasContent = True
	Return Me
End Sub

'add item from json
Sub AddItemJSON(json As String) As VMList
	Dim m As Map = vue.Json2Map(json)
	items.Put(items.size, m)
	HasContent = True
	Return Me
End Sub

'add an item from a map
Sub AddItemMap(m As Map) As VMList
	items.Put(items.size, m)
	HasContent = True
	Return Me
End Sub

'add a divider to separate items
Sub AddItemDivider As VMList
	Dim item As Map = CreateMap()
	item.Put("divider", True)
	items.Put(items.Size, item)
	HasContent = True
	Return Me
End Sub

'add a header to separate items
Sub AddItemSubHeader(hdr As String) As VMList
	Dim item As Map = CreateMap()
	item.Put("header", hdr)
	items.Put(items.Size, item)
	HasContent = True
	Return Me
End Sub

'NOT IMPLEMENTED
Sub AddSubItem(parent As String, key As String, avatar As String, iconName As String, title As String, subtitle As String) As VMList
	parent = parent.ToLowerCase
	key = key.tolowercase
	If items.ContainsKey(parent) Then
		'read the item
		Dim pItem As Map = items.Get(parent)
		If pItem.ContainsKey("subitems") = False Then
			Dim subitems As List
			subitems.Initialize
			pItem.Put("subitems", subitems) 
		End If
		'read the subitems
		Dim subitems As List = pItem.Get("subitems")
		'
		Dim item As Map = CreateMap()
		item.Put("id", key)
		item.Put("avatar", avatar)
		item.Put("icon", iconName)
		item.Put("title", title)
		item.Put("subtitle", subtitle)
		'add a new item
		subitems.Add(item)
'		'update item
		pItem.Put("subitems", subitems)
		items.Put(parent, pItem)
	End If
	Return Me
End Sub

'add icon titles from a saved state
private Sub AddItemGroup(dataSource As String, key As String, avatar As String,  iconName As String, title As String, subtitle As String, actionIcon As String) As VMList
	dataSource = dataSource.ToLowerCase
	'
	Dim vlig As VMListItemGroup
	vlig.Initialize(vue, $"${ID}lig"$, Module).SetVModel("item").SetColor("primary")
	'
	Dim vli As VMListItem = CreateListItem(dataSource, key, avatar, iconName, title, subtitle, actionIcon)
	vli.Pop(vlig.ListItemGroup)
	vlig.Pop(List)
	HasContent = True
	Return Me
End Sub


'apply a theme to an element
Sub UseTheme(themeName As String) As VMList
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	HasContent = True
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMList
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	List.Bind(":color", pp)
	HasContent = True
	Return Me
End Sub

'
Sub AddItem1(key As String, avatar As String, iconName As String, iconColor As String, title As String, subtitle As String, subtitle1 As String, actionIcon As String, actionIconColor As String) As VMList
	Dim vli As VMListItem
	vli.Initialize(vue, key, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	vli.SetAttrSingle("key", key)
	vli.SetOnClick($"${ID}_click"$)
	'
	If avatar <> "" Then
		Dim lia As VMListItemAvatar
		lia.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
		Dim img As VMImage
		img.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetAttrSingle("src", avatar)
		img.Pop(lia.ListItemAvatar)
		lia.Pop(vli.ListItem)
	End If
	'
	If iconName <> "" Then
		Dim vlii As VMListItemIcon
		vlii.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
		Dim icon As VMIcon
		icon.Initialize(vue,"", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetText(iconName)
		If iconColor <> "" Then icon.SetAttrSingle("color", iconColor)
		icon.Pop(vlii.ListItemIcon)
		vlii.Pop(vli.ListItem)
	End If
	'
	Dim iContent As Int = 0
	If title <> "" Then iContent = iContent + 1
	If subtitle <> "" Then iContent = iContent + 1
	
	If iContent > 0 Then
		Dim lic As VMListItemContent
		lic.Initialize(vue,"", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
		'
		If title <> "" Then
			Dim lit As VMListItemTitle
			lit.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetText(title)
			lit.Pop(lic.ListItemContent)
		End If
		'
		If subtitle <> "" Then
			Dim listt As VMListItemSubTitle
			listt.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetText(subtitle)
			listt.Pop(lic.ListItemContent)
		End If
		'
		If subtitle1 <> "" Then
			Dim listt1 As VMListItemSubTitle
			listt1.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetText(subtitle1)
			listt1.Pop(lic.ListItemContent)
		End If
		lic.Pop(vli.ListItem)
	End If
	'
	If actionIcon <> "" Then
		Dim la As VMListItemAction
		la.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
		Dim btn As VMButton
		btn.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode).SetAttrLoose("icon")
		Dim icon As VMIcon
		icon.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
		If actionIconColor <> "" Then icon.SetAttrSingle("color", actionIconColor)
		icon.SetText(actionIcon)
		btn.AddComponent(icon.ToString)
		la.AddComponent(btn.ToString)
		la.Pop(vli.ListItem)
	End If
	
	vli.Pop(List)
	HasContent = True
	Return Me
End Sub

Sub AddComponent(comp As String) As VMList
	List.SetText(comp)
	Return Me
End Sub

Sub AddDivider1(bInset As Boolean) As VMList
	Dim div As VMDivider
	div.Initialize(vue)
	If bInset Then div.SetAttrLoose("inset")
	div.Pop(List)
	Return Me
End Sub

Sub AddSubHeader1(hdr As String, bInset As Boolean) As VMList
	Dim sh As VMElement
	sh.Initialize(vue, "").SetTag("v-subheader")
	If bInset Then sh.SetAttrLoose("inset")
	sh.SetText(hdr)
	sh.Pop(List)
	Return Me
End Sub

'get component
Sub ToString As String	
	If items.Size > 0 Then
		Dim listKey As String = $"${ID}ds"$
		'
		Dim xitems As List
		xitems.Initialize
		For Each k As String In items.Keys
			Dim v As Map = items.Get(k)
			xitems.Add(v)
		Next
		vue.SetStateSingle(listKey, xitems)
		SetDataSourceTemplate(listKey, "id", "avatar", "icon", "title", "subtitle", "action")
	End If
	Return List.ToString
End Sub


Sub Clear As VMList
	items.Clear
	Dim listKey As String = $"${ID}ds"$
	vue.SetStateSingle(listKey, items)
	Return Me
End Sub

Sub SetVModel(k As String) As VMList
	List.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMList
	List.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMList
	List.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMList
	Dim childHTML As String = child.ToString
	List.SetText(childHTML)
	HasContent = True
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMList
	List.SetText(t)
	HasContent = True
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMList
	List.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMList
	List.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMList
	List.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As String) As VMList
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	List.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMList
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	List.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMList
	If varDense = False Then Return Me
	If bStatic Then
		SetAttrSingle("dense", varDense)
		Return Me
	End If
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	List.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMList
	List.SetDisabled(varDisabled)
	Return Me
End Sub

'set elevation
Sub SetElevation(varElevation As String) As VMList
	If varElevation = "" Then Return Me
	If bStatic Then
		SetAttrSingle("elevation", varElevation)
		Return Me
	End If
	Dim pp As String = $"${ID}Elevation"$
	vue.SetStateSingle(pp, varElevation)
	List.Bind(":elevation", pp)
	Return Me
End Sub

'set expand
Sub SetExpand(varExpand As Boolean) As VMList
	If varExpand = False Then Return Me
	If bStatic Then
		SetAttrSingle("expand", varExpand)
		Return Me
	End If
	Dim pp As String = $"${ID}Expand"$
	vue.SetStateSingle(pp, varExpand)
	List.Bind(":expand", pp)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Boolean) As VMList
	If varFlat = False Then Return Me
	If bStatic Then
		SetAttrSingle("flat", varFlat)
		Return Me
	End If
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	List.Bind(":flat", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMList
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	List.Bind(":height", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMList
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	List.Bind(":light", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As String) As VMList
	If varMaxHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-height", varMaxHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	List.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As String) As VMList
	If varMaxWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-width", varMaxWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	List.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As String) As VMList
	If varMinHeight = "" Then Return Me
	If bStatic Then 
		SetAttrSingle("min-height", varMinHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	List.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As String) As VMList
	If varMinWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-width", varMinWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	List.Bind(":min-width", pp)
	Return Me
End Sub

'set nav used with navdrawer
Sub SetNav(varNav As Boolean) As VMList
	If varNav = False Then Return Me
	If bStatic Then
		SetAttrSingle("nav", varNav)
		Return Me
	End If
	Dim pp As String = $"${ID}Nav"$
	vue.SetStateSingle(pp, varNav)
	List.Bind(":nav", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Boolean) As VMList
	If varRounded = False Then Return Me
	If bStatic Then
		SetAttrSingle("rounded", varRounded)
		Return Me
	End If
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	List.Bind(":rounded", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Boolean) As VMList
	If varShaped = False Then Return Me
	If bStatic Then
		SetAttrSingle("shaped", varShaped)
		Return Me
	End If
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	List.Bind(":shaped", pp)
	Return Me
End Sub

'set subheader
Sub SetSubheader(varSubheader As Boolean) As VMList
	If varSubheader = False Then Return Me
	If bStatic Then
		SetAttrSingle("subheader", varSubheader)
		Return Me
	End If
	Dim pp As String = $"${ID}Subheader"$
	vue.SetStateSingle(pp, varSubheader)
	List.Bind(":subheader", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMList
	If varTag = "" Then Return Me
	SetAttrSingle("tag", varTag)
	Return Me
End Sub

'set three-line
Sub SetThreeLine(varThreeLine As Boolean) As VMList
	If varThreeLine = False Then Return Me
	If bStatic Then
		SetAttrSingle("three-line", varThreeLine)
		Return Me
	End If
	Dim pp As String = $"${ID}ThreeLine"$
	vue.SetStateSingle(pp, varThreeLine)
	List.Bind(":three-line", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Boolean) As VMList
	If bStatic Then
		SetAttrSingle("tile", varTile)
		Return Me
	End If
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	List.Bind(":tile", pp)
	Return Me
End Sub

'set two-line
Sub SetTwoLine(varTwoLine As Boolean) As VMList
	If varTwoLine = False Then Return Me
	If bStatic Then
		SetAttrSingle("two-line", varTwoLine)
		Return Me
	End If
	Dim pp As String = $"${ID}TwoLine"$
	vue.SetStateSingle(pp, varTwoLine)
	List.Bind(":two-line", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As String) As VMList
	If varWidth = "" Then Return Me
	If bStatic Then 
		SetAttrSingle("width", varWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	List.Bind(":width", pp)
	Return Me
End Sub


Sub Hide As VMList
	List.SetVisible(False)
	Return Me
End Sub

Sub Show As VMList
	List.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMList
	List.Enable(True)
	Return Me
End Sub

Sub Disable As VMList
	List.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMList
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMList
	List.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMList
	List.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMList
	List.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMList
	List.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMList
	List.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMList
	List.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMList
	List.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMList
	List.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMList
List.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMList
List.SetVisible(b)
Return Me
End Sub