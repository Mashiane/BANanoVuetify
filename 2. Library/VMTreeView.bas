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
	Private DesignMode As Boolean
	Private Module As Object
	Private items As List
	Public Active As String
	Private selEvent As String
	Private loaded As Boolean
	Private selected As String
End Sub

'initialize the TreeView
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTreeView
	ID = sid.tolowercase
	TreeView.Initialize(v, ID)
	TreeView.SetTag("v-treeview")
	DesignMode = False
	Module = eventHandler
	vue = v
	'
	Active = $"${ID}active"$
	selEvent = $"${ID}_click"$
	selected = $"${ID}selected"$
	items.Initialize
	vue.SetData($"${ID}items"$, items)
	TreeView.Bind(":items",$"${ID}items"$)
	SetOpenOnClick(True)
	Dim aItems As List
	aItems.Initialize 
	vue.SetData(Active, aItems)
	SetReturnObject(True)
	SetActivatable(True)
	SetHoverable(True)
	SetAttrSingle(":active.sync", Active)
	SetExpandIcon("mdi-chevron-down")
	vue.SetComputed(selected, Me, "findselected")
	vue.SetWatch(selected, True, True, Me, "nodechanged")
	loaded = False
	Return Me
End Sub
'
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

Sub findselected As List
	Dim alist As List
	alist.Initialize 
	alist = vue.GetData(Active)
	If alist = Null Then 
		vue.SetData(selected, Null)
		Return Null
	Else
		vue.SetData(selected, alist)
		Return alist
	End If	
End Sub

private Sub nodechanged
	Dim treenode As Map = vue.GetData(selected)
	If SubExists(Module, selEvent) Then
		BANano.CallSub(Module, selEvent, treenode)
	Else
		Log("TreeView.NodeChanged - add _click event to parent module!")
	End If
End Sub

Sub GetSelected As List
	Dim res As List = vue.GetData(Active)
	Return res
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
	items.Add(mitem)
	loaded = False
	Return Me
End Sub

'clear the items
Sub Clear
	items.clear
	SetDataSource(items)
End Sub

'get component
Sub ToString As String
	'unflatten the data
	Dim unflat As List = vue.Unflatten(items, "children")
	vue.SetData($"${ID}items"$, unflat)
	loaded = True
	Return TreeView.ToString
End Sub

'from a database
Sub SetDataSource(recs As List)
	Dim unflat As List = vue.Unflatten(recs, "children")
	vue.SetData($"${ID}items"$, unflat)
	loaded = True
End Sub

Sub SetVModel(k As String) As VMTreeView
	TreeView.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTreeView
	TreeView.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTreeView
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
Sub SetActivatable(varActivatable As Object) As VMTreeView
	Dim pp As String = $"${ID}Activatable"$
	vue.SetStateSingle(pp, varActivatable)
	TreeView.Bind(":activatable", pp)
	Return Me
End Sub

'set active
Sub SetActive(varActive As Object) As VMTreeView
	Dim pp As String = $"${ID}Active"$
	vue.SetStateSingle(pp, varActive)
	TreeView.Bind(":active", pp)
	Return Me
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMTreeView
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	TreeView.Bind(":active-class", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMTreeView
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	TreeView.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMTreeView
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	TreeView.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMTreeView
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	TreeView.Bind(":dense", pp)
	Return Me
End Sub

'set expand-icon
Sub SetExpandIcon(varExpandIcon As Object) As VMTreeView
	Dim pp As String = $"${ID}ExpandIcon"$
	vue.SetStateSingle(pp, varExpandIcon)
	TreeView.Bind(":expand-icon", pp)
	Return Me
End Sub

'set filter
Sub SetFilter(varFilter As Object) As VMTreeView
	Dim pp As String = $"${ID}Filter"$
	vue.SetStateSingle(pp, varFilter)
	TreeView.Bind(":filter", pp)
	Return Me
End Sub

'set hoverable
Sub SetHoverable(varHoverable As Object) As VMTreeView
	Dim pp As String = $"${ID}Hoverable"$
	vue.SetStateSingle(pp, varHoverable)
	TreeView.Bind(":hoverable", pp)
	Return Me
End Sub

'set indeterminate-icon
Sub SetIndeterminateIcon(varIndeterminateIcon As Object) As VMTreeView
	Dim pp As String = $"${ID}IndeterminateIcon"$
	vue.SetStateSingle(pp, varIndeterminateIcon)
	TreeView.Bind(":indeterminate-icon", pp)
	Return Me
End Sub

'set item-children
Sub SetItemChildren(varItemChildren As Object) As VMTreeView
	Dim pp As String = $"${ID}ItemChildren"$
	vue.SetStateSingle(pp, varItemChildren)
	TreeView.Bind(":item-children", pp)
	Return Me
End Sub

'set item-disabled
Sub SetItemDisabled(varItemDisabled As Object) As VMTreeView
	Dim pp As String = $"${ID}ItemDisabled"$
	vue.SetStateSingle(pp, varItemDisabled)
	TreeView.Bind(":item-disabled", pp)
	Return Me
End Sub

'set item-key
Sub SetItemKey(varItemKey As Object) As VMTreeView
	Dim pp As String = $"${ID}ItemKey"$
	vue.SetStateSingle(pp, varItemKey)
	TreeView.Bind(":item-key", pp)
	Return Me
End Sub

'set item-text
Sub SetItemText(varItemText As Object) As VMTreeView
	Dim pp As String = $"${ID}ItemText"$
	vue.SetStateSingle(pp, varItemText)
	TreeView.Bind(":item-text", pp)
	Return Me
End Sub

'set items
Sub SetItems(varItems As Object) As VMTreeView
	Dim pp As String = $"${ID}Items"$
	vue.SetStateSingle(pp, varItems)
	TreeView.Bind(":items", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMTreeView
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	TreeView.Bind(":light", pp)
	Return Me
End Sub

'set load-children
Sub SetLoadChildren(varLoadChildren As Object) As VMTreeView
	Dim pp As String = $"${ID}LoadChildren"$
	vue.SetStateSingle(pp, varLoadChildren)
	TreeView.Bind(":load-children", pp)
	Return Me
End Sub

'set loading-icon
Sub SetLoadingIcon(varLoadingIcon As Object) As VMTreeView
	Dim pp As String = $"${ID}LoadingIcon"$
	vue.SetStateSingle(pp, varLoadingIcon)
	TreeView.Bind(":loading-icon", pp)
	Return Me
End Sub

'set multiple-active
Sub SetMultipleActive(varMultipleActive As Object) As VMTreeView
	Dim pp As String = $"${ID}MultipleActive"$
	vue.SetStateSingle(pp, varMultipleActive)
	TreeView.Bind(":multiple-active", pp)
	Return Me
End Sub

'set off-icon
Sub SetOffIcon(varOffIcon As Object) As VMTreeView
	Dim pp As String = $"${ID}OffIcon"$
	vue.SetStateSingle(pp, varOffIcon)
	TreeView.Bind(":off-icon", pp)
	Return Me
End Sub

'set on-icon
Sub SetOnIcon(varOnIcon As Object) As VMTreeView
	Dim pp As String = $"${ID}OnIcon"$
	vue.SetStateSingle(pp, varOnIcon)
	TreeView.Bind(":on-icon", pp)
	Return Me
End Sub

'set open
Sub SetOpen(varOpen As Object) As VMTreeView
	Dim pp As String = $"${ID}Open"$
	vue.SetStateSingle(pp, varOpen)
	TreeView.Bind(":open", pp)
	Return Me
End Sub

'set open-all
Sub SetOpenAll(varOpenAll As Object) As VMTreeView
	Dim pp As String = $"${ID}OpenAll"$
	vue.SetStateSingle(pp, varOpenAll)
	TreeView.Bind(":open-all", pp)
	Return Me
End Sub

'set open-on-click
Sub SetOpenOnClick(varOpenOnClick As Object) As VMTreeView
	Dim pp As String = $"${ID}OpenOnClick"$
	vue.SetStateSingle(pp, varOpenOnClick)
	TreeView.Bind(":open-on-click", pp)
	Return Me
End Sub

'set return-object
Sub SetReturnObject(varReturnObject As Object) As VMTreeView
	Dim pp As String = $"${ID}ReturnObject"$
	vue.SetStateSingle(pp, varReturnObject)
	TreeView.Bind(":return-object", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Object) As VMTreeView
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	TreeView.Bind(":rounded", pp)
	Return Me
End Sub

'set search
Sub SetSearch(varSearch As Object) As VMTreeView
	Dim pp As String = $"${ID}Search"$
	vue.SetStateSingle(pp, varSearch)
	TreeView.Bind(":search", pp)
	Return Me
End Sub

'set selectable
Sub SetSelectable(varSelectable As Object) As VMTreeView
	Dim pp As String = $"${ID}Selectable"$
	vue.SetStateSingle(pp, varSelectable)
	TreeView.Bind(":selectable", pp)
	Return Me
End Sub

'set selected-color
Sub SetSelectedColor(varSelectedColor As Object) As VMTreeView
	Dim pp As String = $"${ID}SelectedColor"$
	vue.SetStateSingle(pp, varSelectedColor)
	TreeView.Bind(":selected-color", pp)
	Return Me
End Sub

'set selection-type
Sub SetSelectionType(varSelectionType As Object) As VMTreeView
	Dim pp As String = $"${ID}SelectionType"$
	vue.SetStateSingle(pp, varSelectionType)
	TreeView.Bind(":selection-type", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Object) As VMTreeView
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	TreeView.Bind(":shaped", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As Object) As VMTreeView
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	TreeView.Bind(":transition", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMTreeView
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
Sub SetOnInput(methodName As String) As VMTreeView
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateActive(methodName As String) As VMTreeView
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:active": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateOpen(methodName As String) As VMTreeView
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:open": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'hide the component
Sub Hide As VMTreeView
	vue.SetStateSingle($"${ID}show"$, False)
	Return Me
End Sub

'show the component
Sub Show As VMTreeView
	vue.SetStateSingle($"${ID}show"$, True)
	Return Me
End Sub

'enable the component
Sub Enable As VMTreeView
	vue.SetStateSingle($"${ID}disabled"$, False)
	Return Me
End Sub

'disable the component
Sub Disable As VMTreeView
	vue.SetStateSingle($"${ID}disabled"$, True)
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
