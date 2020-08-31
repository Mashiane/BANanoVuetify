B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TreeView As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean  'ignore
	Private Module As Object
	Private items As List
	Private sActive As String
	Private loaded As Boolean   'ignore
	Private bStatic As Boolean
	Private sOpen As String
	Private IconSlot As VMTemplate
	Private sSelected As String
	Private extm As Map
End Sub

'initialize the TreeView
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTreeView
	ID = sid.tolowercase
	TreeView.Initialize(v, ID)
	TreeView.SetTag("v-treeview")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	extm = CreateMap()
	'
	sActive = $"${ID}active"$
	sOpen = $"${ID}open"$
	sSelected = $"${ID}selected"$
	items.Initialize
	SetActive(vue.NewList)
	SetItems(vue.NewList)
	SetOpen(vue.NewList)
	SetVModel(sSelected)
	vue.SetData(sSelected, vue.NewList)
	SetExpandIcon("mdi-chevron-down")
	loaded = False
	'define the icon slot
	IconSlot.Initialize(vue, $"${ID}iconslot"$, Module)
	IconSlot.SetSlotPrepend($"{ item, ${sActive} }"$)
	Dim tvicon As VMIcon
	tvicon.Initialize(vue,"", Module).SetVIf("item.icon").SetVText("item.icon")
	IconSlot.AddComponent(tvicon.ToString)
	SetItemKey("id")
	SetItemText("name")
	SetOpenOnClick(True)
	SetTransition(True)
	SetOnUpdateActive
	SetOnUpdateOpen
	SetOnInput
	'
	extm.Put("html", "mdi-language-html5")
	extm.Put("js", "mdi-nodejs")
	extm.Put("json", "mdi-code-json")
	extm.Put("md", "mdi-markdown")
	extm.Put("pdf", "mdi-file-pdf")
	extm.Put("png", "mdi-file-image")
	extm.Put("txt", "mdi-file-document-outline")
	extm.Put("xls", "mdi-file-excel")
	extm.Put("csv", "mdi-file-delimited-outline")
	extm.Put("pre", "mdi-file-code-outline")
	extm.Put("code", "mdi-file-code-outline")
	extm.Put("doc", "mdi-file-word-box-outline")
	extm.Put("mp3", "mdi-file-music-outline")
	extm.Put("folder", "mdi-folder")
	extm.Put("woff", "marketweb-webfont.woff")
	extm.Put("css", "mdi-language-css3")
	Return Me
End Sub

'add an icon extension
Sub AddExtension(icon As String, fullicon As String)
	extm.Put(icon, fullicon)
End Sub

'set selected items
Sub SetSelected(xitems As List)
	vue.SetData(sSelected, xitems)	
End Sub

Sub GetSelected As List
	Dim res As List = vue.GetData(sSelected)
	Return res
End Sub

'get active nodes
Sub GetActive As List
	Dim lst As List = vue.GetData(sActive)
	Return lst
End Sub

'get the open nodes
Sub GetOpen As List
	Dim lst As List = vue.GetData(sOpen)
	Return lst
End Sub

Sub SetStatic(b As Boolean) As VMTreeView
	bStatic = b
	TreeView.SetStatic(b)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMTreeView
	TreeView.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMTreeView
	TreeView.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMTreeView
	TreeView.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMTreeView
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
	loaded = True
End Sub

'add item
Sub AddItem(parentID As String, key As String, text As String, mhref As String, mIcon As String, mDisabled As Boolean) As VMTreeView
	parentID = parentID.tolowercase
	key = key.tolowercase
	Dim mitem As Map = CreateMap()
	mitem.Put("id", key)
	mitem.Put("name", text)
	mitem.Put("href", mhref)
	mitem.Put("icon", mIcon)
	mitem.Put("disabled", mDisabled)
	mitem.Put("parentid", parentID)
	If extm.ContainsKey(mIcon) Then
		mIcon = extm.Get(mIcon)
		mitem.Put("icon", mIcon)
	End If
	items.Add(mitem)
	loaded = False
	Return Me
End Sub

'clear the items
Sub Clear
	items.clear
	SetItems(items)
	SetActive(vue.NewList)
	SetValue(vue.NewList)
	SetOpen(vue.NewList)
End Sub

Sub Update
	SetDataSource(items)
End Sub

'get component
Sub ToString As String
	'unflatten the data
	Dim unflat As List = vue.Unflatten(items, "children")
	vue.SetData($"${ID}items"$, unflat)
	loaded = True
	TreeView.AddComponent(IconSlot.ToString)
	Return TreeView.ToString
End Sub

'from a database
private Sub SetDataSource(recs As List)
	Dim unflat As List = vue.Unflatten(recs, "children")
	vue.SetData($"${ID}items"$, unflat)
	loaded = True
End Sub

Sub SetVModel(k As String) As VMTreeView
	TreeView.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMTreeView
	TreeView.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMTreeView
	TreeView.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTreeView
	Dim childHTML As String = child.ToString
	TreeView.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTreeView
	TreeView.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTreeView
	TreeView.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTreeView
	TreeView.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTreeView
	TreeView.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set activatable
Sub SetActivatable(varActivatable As Boolean) As VMTreeView
	If varActivatable = False Then Return Me
	If bStatic Then
		SetAttrSingle("activatable", varActivatable)
		Return Me
	End If
	Dim pp As String = $"${ID}Activatable"$
	vue.SetStateSingle(pp, varActivatable)
	TreeView.Bind(":activatable", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMTreeView
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	TreeView.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMTreeView
	If varDense = False Then Return Me
	If bStatic Then
		SetAttrSingle("dense", varDense)
		Return Me
	End If
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	TreeView.Bind(":dense", pp)
	Return Me
End Sub

'set hoverable
Sub SetHoverable(varHoverable As Boolean) As VMTreeView
	If varHoverable = False Then Return Me
	If bStatic Then
		SetAttrSingle("hoverable", varHoverable)
		Return Me
	End If
	Dim pp As String = $"${ID}Hoverable"$
	vue.SetStateSingle(pp, varHoverable)
	TreeView.Bind(":hoverable", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMTreeView
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	TreeView.Bind(":light", pp)
	Return Me
End Sub

'set multiple-active
Sub SetMultipleActive(varMultipleActive As Boolean) As VMTreeView
	If varMultipleActive = False Then Return Me
	If bStatic Then
		SetAttrSingle("multiple-active", varMultipleActive)
		Return Me
	End If
	Dim pp As String = $"${ID}MultipleActive"$
	vue.SetStateSingle(pp, varMultipleActive)
	TreeView.Bind(":multiple-active", pp)
	Return Me
End Sub

'set open-all
Sub SetOpenAll(varOpenAll As Boolean) As VMTreeView
	If varOpenAll = False Then Return Me
	If bStatic Then
		SetAttrSingle("open-all", varOpenAll)
		Return Me
	End If
	Dim pp As String = $"${ID}OpenAll"$
	vue.SetStateSingle(pp, varOpenAll)
	TreeView.Bind(":open-all", pp)
	Return Me
End Sub

'set open-on-click
Sub SetOpenOnClick(varOpenOnClick As Boolean) As VMTreeView
	If varOpenOnClick = False Then Return Me
	If bStatic Then
		SetAttrSingle("open-on-click", varOpenOnClick)
		Return Me
	End If
	Dim pp As String = $"${ID}OpenOnClick"$
	vue.SetStateSingle(pp, varOpenOnClick)
	TreeView.Bind(":open-on-click", pp)
	Return Me
End Sub

'set return-object
Sub SetReturnObject(varReturnObject As Boolean) As VMTreeView
	If varReturnObject = False Then Return Me
	TreeView.Bind(":return-object", varReturnObject)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Boolean) As VMTreeView
	If varRounded = False Then Return Me
	If bStatic Then
		SetAttrSingle("rounded", varRounded)
		Return Me
	End If
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	TreeView.Bind(":rounded", pp)
	Return Me
End Sub

'set selectable
Sub SetSelectable(varSelectable As Boolean) As VMTreeView
	If varSelectable = False Then Return Me
	If bStatic Then
		SetAttrSingle("selectable", varSelectable)
		Return Me
	End If
	Dim pp As String = $"${ID}Selectable"$
	vue.SetStateSingle(pp, varSelectable)
	TreeView.Bind(":selectable", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Boolean) As VMTreeView
	If varShaped = False Then Return Me
	If bStatic Then
		SetAttrSingle("shaped", varShaped)
		Return Me
	End If
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	TreeView.Bind(":shaped", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As Boolean) As VMTreeView
	If varTransition = False Then Return Me
	If bStatic Then
		SetAttrSingle("transition", varTransition)
		Return Me
	End If
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	TreeView.Bind(":transition", pp)
	Return Me
End Sub

'set active
Sub SetActive(varActive As List) As VMTreeView
	Dim pp As String = $"${ID}Active"$
	vue.SetStateSingle(pp, varActive)
	TreeView.Bind(":active.sync", pp)
	Return Me
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMTreeView
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	TreeView.Bind(":active-class", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMTreeView
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	TreeView.Bind(":color", pp)
	Return Me
End Sub

'set expand-icon
Sub SetExpandIcon(varExpandIcon As String) As VMTreeView
	If varExpandIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("expand-icon", varExpandIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}ExpandIcon"$
	vue.SetStateSingle(pp, varExpandIcon)
	TreeView.Bind(":expand-icon", pp)
	Return Me
End Sub

'set indeterminate-icon
Sub SetIndeterminateIcon(varIndeterminateIcon As String) As VMTreeView
	If varIndeterminateIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("indeterminate-icon", varIndeterminateIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}IndeterminateIcon"$
	vue.SetStateSingle(pp, varIndeterminateIcon)
	TreeView.Bind(":indeterminate-icon", pp)
	Return Me
End Sub

'set item-children
Sub SetItemChildren(varItemChildren As String) As VMTreeView
	If varItemChildren = "" Then Return Me
	SetAttrSingle("item-children", varItemChildren)
	Return Me
End Sub

'set item-disabled
Sub SetItemDisabled(varItemDisabled As String) As VMTreeView
	If varItemDisabled = "" Then Return Me
	SetAttrSingle("item-disabled", varItemDisabled)
	Return Me
End Sub

'set item-key
Sub SetItemKey(varItemKey As String) As VMTreeView
	If varItemKey = "" Then Return Me
	SetAttrSingle("item-key", varItemKey)
	Return Me
End Sub

'set item-text
Sub SetItemText(varItemText As String) As VMTreeView
	If varItemText = "" Then Return Me
	SetAttrSingle("item-text", varItemText)
	Return Me
End Sub

'set items
Sub SetItems(varItems As List) As VMTreeView
	Dim pp As String = $"${ID}Items"$
	vue.SetStateSingle(pp, varItems)
	TreeView.Bind(":items", pp)
	Return Me
End Sub

'set loading-icon
Sub SetLoadingIcon(varLoadingIcon As String) As VMTreeView
	If varLoadingIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("loading-icon", varLoadingIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}LoadingIcon"$
	vue.SetStateSingle(pp, varLoadingIcon)
	TreeView.Bind(":loading-icon", pp)
	Return Me
End Sub

'set off-icon
Sub SetOffIcon(varOffIcon As String) As VMTreeView
	If varOffIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("off-icon", varOffIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}OffIcon"$
	vue.SetStateSingle(pp, varOffIcon)
	TreeView.Bind(":off-icon", pp)
	Return Me
End Sub

'set on-icon
Sub SetOnIcon(varOnIcon As String) As VMTreeView
	If varOnIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("on-icon", varOnIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}OnIcon"$
	vue.SetStateSingle(pp, varOnIcon)
	TreeView.Bind(":on-icon", pp)
	Return Me
End Sub

'set open
Sub SetOpen(varOpen As List) As VMTreeView
	Dim pp As String = $"${ID}Open"$
	vue.SetStateSingle(pp, varOpen)
	TreeView.Bind(":open.sync", pp)
	Return Me
End Sub

'set search
Sub SetSearch(varSearch As String) As VMTreeView
	If varSearch = "" Then Return Me
	If bStatic Then
		SetAttrSingle("search", varSearch)
		Return Me
	End If
	Dim pp As String = $"${ID}Search"$
	vue.SetStateSingle(pp, varSearch)
	TreeView.Bind(":search", pp)
	Return Me
End Sub

'set selected-color
Sub SetSelectedColor(varSelectedColor As String) As VMTreeView
	If varSelectedColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("selected-color", varSelectedColor)
		Return Me
	End If
	Dim pp As String = $"${ID}SelectedColor"$
	vue.SetStateSingle(pp, varSelectedColor)
	TreeView.Bind(":selected-color", pp)
	Return Me
End Sub


'set color intensity
Sub SetSelectedColorIntensity(varColor As String, varIntensity As String) As VMTreeView
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("selected-color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}SelectedColor"$
	vue.SetStateSingle(pp, scolor)
	TreeView.Bind(":selected-color", pp)
	Return Me
End Sub


'set selection-type
Sub SetSelectionType(varSelectionType As String) As VMTreeView
	If varSelectionType = "" Then Return Me
	If bStatic Then
		SetAttrSingle("selection-type", varSelectionType)
		Return Me
	End If
	Dim pp As String = $"${ID}SelectionType"$
	vue.SetStateSingle(pp, varSelectionType)
	TreeView.Bind(":selection-type", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As List) As VMTreeView
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	TreeView.Bind(":value", pp)
	Return Me
End Sub
'
Sub SetSlotAppend(b As Boolean) As VMTreeView    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotLabel(b As Boolean) As VMTreeView    'ignore
	SetAttr(CreateMap("slot": "label"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As Boolean) As VMTreeView    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetOnInput As VMTreeView
	Dim methodName As String = $"${ID}_input"$
	If SubExists(Module, methodName) = False Then Return Me
	Dim xitems As Object
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(xitems))
	SetAttr(CreateMap("@input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateActive As VMTreeView
	Dim methodName As String = $"${ID}_updateactive"$
	If SubExists(Module, methodName) = False Then Return Me
	Dim xitems As Object
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(xitems))
	SetAttr(CreateMap("@update:active": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateOpen As VMTreeView
	Dim methodName As String = $"${ID}_updateopen"$
	If SubExists(Module, methodName) = False Then Return Me
	Dim xitems As Object
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(xitems))
	SetAttr(CreateMap("@update:open": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'hide the component
Sub Hide As VMTreeView
	TreeView.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMTreeView
	TreeView.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMTreeView
	TreeView.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMTreeView
	TreeView.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMTreeView
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMTreeView
	TreeView.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMTreeView
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMTreeView
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	TreeView.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMTreeView
	TreeView.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMTreeView
	TreeView.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMTreeView
	TreeView.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMTreeView
	TreeView.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMTreeView
	TreeView.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMTreeView
	TreeView.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMTreeView
	TreeView.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMTreeView
	TreeView.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMTreeView
	TreeView.BindStyleSingle(prop, value)
	Return Me
End Sub


Sub SetVText(vhtml As String) As VMTreeView
	TreeView.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMTreeView
	TreeView.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMTreeView
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMTreeView
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMTreeView
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMTreeView
TreeView.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMTreeView
TreeView.SetVisible(b)
Return Me
End Sub
