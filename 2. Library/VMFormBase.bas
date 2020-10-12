B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public FormBase As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private mdl As String
	Private sche As String
	Private ID As String
	Private vue As BANanoVue
	Private model As Map
	Private schema As Map
	Private FB As BANanoObject
	Private lastItem As String
	Private rowSettings As Map
	Private row As String
	Private col As String
	Private colSettings As Map
	Public const TSettingPrependIcon As String = "prependIcon"
	Public const TSettingHint As String = "hint"
	Public const TSettingClearable As String = "clearable"
	'
	Public const TCheckbox As String = "checkbox"
	Public const TText As String = "text"
	Public const TTextArea As String = "textarea"
	Public const TRadio As String = "radio"
	Public const TSelect As String = "select"
	Public const TAutoComplete As String = "autoselect"
	Public const TSwitch As String = "switch"
	Public const TDate As String = "date"
	Public const TTime As String = "time"
	Public const TPassword As String = "password"
	Public const TEmail As String = "email"
	Public const TNumber As String = "number"
	Public const TFile As String = "file"
	Public const TSlider As String = "slider"
	Public const TIcon As String = "icon"
	Public const TButton As String = "btn"
	Public const TComboBox As String = "combobox"
	Public const TAutoComplete As String = "autocomplete"
	Public const TList As String = "list"
	Public const TTreeView As String = "treeview"
	Public const TGroup As String = "group"
	Public const TColor As String = "color"
	'
	Private Module As Object
	Type ControlType(inputType As String, ext As String, sort As String, flex As Int, col As Int, _
	order As Object, offset As Object, label As String, placeholder As String, hint As String, tooltip As String, _
	color As String, backgroundColor As String, className As String, mask As String, _
	multiple As Boolean, required As Boolean, hidden As Boolean, disabled As Boolean, readonly As Boolean, _
	appendIcon As String, prependIcon As String, items As List, options As List, rules As List)
	'
	Type EventValue( on As String, ID As String, key As Object, value As Object, params As Object, obj As Map, data As Map, schema As Map, parent As Object, index As Object, _
	 event As BANanoEvent, ParamsTag As String, ParamsText As String, objSchema As Map)
	 Private items As Map
	 Private fields As Map
End Sub

'get the event
Sub GetEvent(value As Map) As EventValue
	Dim ev As EventValue
	ev.Initialize
	ev.on = value.get("on")
	ev.ID = value.get("id")
	ev.key = value.get("key")
	ev.value = value.get("value")
	ev.data = value.get("data")
	ev.event = value.get("event")
	ev.params = value.get("params")
	Dim params As Map = ev.params
	ev.paramstag = params.get("tag")
	ev.paramstext = params.get("text")
	ev.obj = value.get("obj")
	Dim obj As Map = ev.obj
	ev.objSchema = obj.get("schema")
	ev.schema = value.get("schema")
	ev.parent = value.get("parent")
	ev.index = value.get("index")
	ev.event = value.get("event")
	Return ev
End Sub


'initialize the form base
Sub Initialize(EventHandler As Object, v As BANanoVue, fid As String) As VMFormBase
	BANano.DependsOnAsset("vFormBase.umd.min.js")
	Module = EventHandler
	vue = v
	ID = fid.tolowercase
	mdl = $"${ID}model"$
	sche = $"${ID}schema"$
	row = $"${ID}row"$
	col = $"${ID}col"$
	FormBase.Initialize(v, ID) 
	FormBase.SetTag("v-form-base")
	FormBase.SetAttrSingle(":model", mdl)
	FormBase.SetAttrSingle(":schema", sche)
	FormBase.SetAttrSingle(":row", row)
	FormBase.setAttrSingle(":col", col)
	model.initialize
	schema.initialize
	rowSettings.Initialize
	colSettings.Initialize
	'initialize the schema and model
	vue.setdata(mdl, vue.newmap)
	vue.setdata(sche, vue.newmap)
	rowSettings.put("noGutters", True)
	vue.setdata(row, rowSettings)
	colSettings.put("cols", "auto")
	vue.setdata(col, colSettings)
	'
	If vue.ModuleExist("formbase") = False Then
		FB.Initialize("vFormBase")
		vue.AddComponentBO("v-form-base", FB)
		vue.AddModule("formbase")
	End If
	lastItem = ""
	'add events here
	onEvents
	items.initialize
	fields.Initialize
	Return Me
End Sub

'clear items
private Sub ClearItems() As VMFormBase
	Dim nitems As List = vue.newlist
	items.put(lastItem, nitems)
	Return Me
End Sub

'add item to list
Sub AddItem(key As String, value As String) As VMFormBase
	Dim nitems As List = items.get(lastItem)
	Dim nitem As Map = CreateMap()
	nitem.put("id", key)
	nitem.put("text", value)
	nitems.Add(nitem)
	items.put(lastItem, nitems)
	Return Me
End Sub

'refresh items
Sub RefreshItems As VMFormBase
	Dim nitems As List = items.get(lastItem)
	Dim itemschema As Map = schema.get(lastItem)
	Dim stype As String = itemschema.Get("type")
	Select Case stype
	Case "select", "combobox", "autocomplete"
		SetProperty(lastItem, "items", nitems)
	Case "radio"
		Dim xitems As List = vue.newlist
		For Each rm As Map In nitems
			Dim sid As String = rm.get("id")
			Dim stext As String = rm.get("text")
			Dim nr As Map = CreateMap()
			nr.Put("label", stext)
			nr.Put("value", sid)
			xitems.add(stext)
		Next
		SetProperty(lastItem, "options", xitems)
	End Select
	Return Me
End Sub

private Sub onEvents() As VMFormBase
	Dim events As Map = CreateMap()
	events.put($"@click:${ID}"$, $"${ID}_click"$)
	events.put($"@input:${ID}"$, $"${ID}_input"$)
	events.put($"@change:${ID}"$, $"${ID}_change"$)
	events.put($"@watch:${ID}"$, $"${ID}_watch"$)
	events.put($"@focus:${ID}"$, $"${ID}_focus"$)
	events.put($"@blur:${ID}"$, $"${ID}_blur"$)
	events.put($"@mouse:${ID}"$, $"${ID}_mouse"$)
	events.put($"@display:${ID}"$, $"${ID}_display"$)
	events.put($"@intersect:${ID}"$, $"${ID}_intersect"$)
	events.put($"@resize:${ID}"$, $"${ID}_resize"$)
	events.put($"@swipe:${ID}"$, $"${ID}_swipe"$)
	events.put($"@update:${ID}"$, $"${ID}_update"$)
	'
	For Each k As String In events.keys
		Dim v As String = events.get(k)
		v = v.tolowercase
		If SubExists(Module, v) = False Then Continue
		FormBase.setattrsingle(k, v)
		vue.setmethod(Module, v)
	Next
	Return Me
End Sub

'set the values
Sub SetData(data As Map) As VMFormBase
	model = vue.GetData(mdl)
	For Each k As String In data.keys
		Dim v As Object = data.Get(k)
		model.Put(k, v)
	Next
	vue.setdata(mdl, data)
	Return Me
End Sub

'get values
Sub GetData As Map
	Dim data As Map = CreateMap()
	model = vue.GetData(mdl)
	For Each k As String In fields.keys
		Dim v As Object = model.Get(k)
		data.put(k, v)
	Next
	Return data
End Sub


'set Cols
Sub SetCols(cols As String) As VMFormBase
	colSettings.put("cols", cols)
	Return Me
End Sub

'set noGutters
Sub SetRowNoGutters(b As Boolean) As VMFormBase
	rowSettings.put("noGutters", b)
	Return Me
End Sub

'set row justify
Sub SetRowJustify(j As String) As VMFormBase
	rowSettings.put("justify", j)
	Return Me
End Sub

'set row align
Sub SetRowAlign(j As String) As VMFormBase
	rowSettings.put("align", j)
	Return Me
End Sub


'clear the model and schema
Sub Clear As VMFormBase
	vue.setdata(mdl, vue.newmap)
	vue.setdata(sche, vue.newmap)
	Return Me
End Sub

'add a new text field
Sub AddTextField(sid As String, slabel As String) As VMFormBase
	sid = sid.tolowercase
	Dim el As Map = CreateMap()
	el.Put("type", "text")
	If slabel <> "" Then el.put("label", slabel)
	el.put("rules", vue.newlist)
	el.put("ref", sid)
	el.Put("id", sid)
	'
	model.put(sid, Null)
	schema.put(sid, el)
	lastItem = sid
	fields.put(sid, sid)
	Return Me
End Sub

'removeRules
Sub RemoveRules As VMFormBase
	Dim el As Map = schema.get(lastItem)
	el.Remove("rules")
	schema.put(lastItem, el)
	Return Me
End Sub

'add an array of items
Sub AddArray(sid As String, keyName As String) As VMFormBase
	sid = sid.tolowercase
	Dim el As Map = CreateMap()
	el.Put("type", "array")
	el.put("schema", vue.NewMap)
	el.put("key", keyName)
	'
	model.put(sid, vue.newlist)
	schema.put(sid, el)
	lastItem = sid
	RemoveRules
	fields.remove(lastItem)
	Return Me
End Sub

'add  group of items
Sub AddGroup(sid As String, keyName As String) As VMFormBase
	sid = sid.tolowercase
	Dim el As Map = CreateMap()
	el.Put("type", "group")
	el.put("schema", vue.NewMap)
	el.put("key", keyName)
	'
	model.put(sid, vue.newlist)
	schema.put(sid, el)
	lastItem = sid
	RemoveRules
	fields.remove(lastItem)
	Return Me
End Sub

'add an array item
Sub AddArrayItem(arrayName As String, itemName As String, itemLabel As String, itemType As String, itemFlex As Int) As VMFormBase
	arrayName = arrayName.tolowercase
	If schema.ContainsKey(arrayName) Then
		'get the schema from the overall model
		Dim el As Map = schema.get(arrayName)
		'get the schema inside the element
		Dim children As Map = el.get("schema")
		Dim child As Map = CreateMap()
		child.put("type", itemType)
		child.put("label", itemLabel)
		If BANano.isnull(itemFlex) = False Then 
			child.put("flex", itemFlex)
		End If
		children.put(itemName, child)
		el.put("schema", children)
		schema.Put(arrayName, el)
	End If	
	Return Me
End Sub

'add child data
Sub AddArrayItemData(arrayName As String, rowData As Map) As VMFormBase
	'get the model
	Dim mdldata As List = model.get(arrayName)
	mdldata.add(rowData)	
	model.put(arrayName, mdldata)
	Return Me
End Sub

''set required
'Sub SetRequired(bRequired As Boolean) As VMFormBase
'	If bRequired = False Then Return Me
'	
'	Return Me
'End Sub
'
''set tabindex
'Sub SetTabIndex(stabindex As Int) As VMFormBase
'	
'	Return Me
'End Sub

'set counter
Sub SetCounter(bCounter As Object) As VMFormBase
	If BANano.IsNull(bCounter) = False Then	SetProperty(lastItem, "counter", bCounter)
	Return Me
End Sub

'set prependIcon
Sub SetPrependIcon(sprependIcon As String) As VMFormBase
	SetProperty(lastItem, "prependIcon", sprependIcon)
	Return Me
End Sub

'set col
Sub SetCol(scol As String) As VMFormBase
	SetProperty(lastItem, "col", scol)
	Return Me
End Sub

'set format
Sub SetFormat(sformat As String) As VMFormBase
	SetProperty(lastItem, "format", sformat)
	Return Me
End Sub

'set itemText
private Sub SetItemText(itm As String) As VMFormBase
	SetProperty(lastItem, "itemText", itm)
	Return Me
End Sub

'set itemText
private Sub SetItemValue(itm As String) As VMFormBase
	SetProperty(lastItem, "itemValue", itm)
	Return Me
End Sub

'set key value pairs
private Sub SetKeyValues(key As String, value As String) As VMFormBase
	SetItemText(value)
	SetItemValue(key)
	Return Me
End Sub


'set returnObject
Sub SetReturnObject(b As Boolean) As VMFormBase
	SetProperty(lastItem, "returnObject", b)
	Return Me
End Sub

'set cache items
Sub SetCacheItems(b As Boolean) As VMFormBase
	SetProperty(lastItem, "cacheItems", b)
	Return Me
End Sub


'set items for select, autocomplete, radio
private Sub SetItems(xitems As List) As VMFormBase
	SetProperty(lastItem, "items", xitems)
	Return Me
End Sub

'set search input
Sub SetSearchInput(obj As Object) As VMFormBase
	SetProperty(lastItem, "searchInput", obj)
	Return Me
End Sub


'set appendIcon
Sub SetAppendIcon(sappendIcon As String) As VMFormBase
	SetProperty(lastItem, "appendIcon", sappendIcon)
	Return Me
End Sub

'set aspect-ratio
Sub SetAspectRatio(saspectratio As String) As VMFormBase
	SetProperty(lastItem, "aspect-ratio", saspectratio)
	Return Me
End Sub

'set hint
Sub SetHint(shint As String) As VMFormBase
	SetProperty(lastItem, "hint", shint)
	Return Me
End Sub

'set tooltip
Sub SetTooltip(stooltip As String, sposition As String, scolor As String) As VMFormBase
	Dim tt As Map = CreateMap()
	tt.put("label", stooltip)
	If sposition = "left" Then tt.put("left", True)
	If sposition = "right" Then tt.Put("right", True)
	If sposition = "top" Then tt.put("top", True)
	If sposition = "bottom" Then tt.put("bottom", True)
	If BANano.isnull(scolor) = False Or BANano.IsUndefined(scolor) = False Then tt.put("color", scolor)
	SetProperty(lastItem, "tooltip", tt)
	Return Me
End Sub

'set flex
Sub SetFlex(iflex As Int) As VMFormBase
	SetProperty(lastItem, "flex", iflex)
	Return Me
End Sub


'set placeholder
Sub SetPlaceholder(ph As String) As VMFormBase
	SetProperty(lastItem, "placeHolder", ph)
	Return Me
End Sub

'set default value
Sub SetValue(svalue As Object) As VMFormBase
	model.put(lastItem, svalue)
	Return Me
End Sub

'toggle password
Sub TogglePassword(objSchema As Map) As VMFormBase
	If objSchema.get("type") = "password" Then
		objSchema.Put("type", "text")
		objSchema.put("appendIcon", "mdi-eye-off")
	Else
		objSchema.Put("type", "password")
		objSchema.put("appendIcon", "mdi-eye")
	End If
	Return Me
End Sub

'add a password
Sub AddPassword(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "password")
	SetAppendIcon("mdi-eye")
	Return Me
End Sub

'set spacer
Sub SetSpacer(b As Boolean) As VMFormBase
	SetProperty(lastItem, "spacer", b)
	Return Me
End Sub

'set large
Sub SetLarge(b As Boolean) As VMFormBase
	SetProperty(lastItem, "large", b)
	Return Me
End Sub


'ext number
Sub SetExtNumber() As VMFormBase
	SetProperty(lastItem, "ext", "number")
	SetProperty(lastItem, "type", "text")
	Return Me
End Sub

'ext text
Sub SetExtText() As VMFormBase
	SetProperty(lastItem, "ext", "text")
	Return Me
End Sub


'add a date
Sub AddDate(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "date")
	SetProperty(sname, "typeInt", "date")
	SetExtText
	SetCloseOnContentClick(True)
	SetMenuOffsetY
	Return Me
End Sub

'add a time
Sub AddTime(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "time")
	SetFormat("24hr")
	SetExtText
	SetCloseOnContentClick(False)
	SetMenuOffsetY
	Return Me
End Sub


'add an email
Sub AddEmail(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "email")
	Return Me
End Sub

'add select
Sub AddSelect(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "select")
	ClearItems
	SetItemText("text")
	SetItemValue("id")
	Return Me
End Sub


'add a telephone
Sub AddTelephone(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "tel")
	Return Me
End Sub

'add a search
Sub AddSearch(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "search")
	Return Me
End Sub

'add a website
Sub AddWebsite(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "url")
	Return Me
End Sub

'add an image
Sub AddImage(sname As String, surl As String, salt As String) As VMFormBase
	AddTextField(sname, "")
	SetProperty(sname, "type", "img")
	SetProperty(sname, "src", surl)
	SetProperty(sname, "alt", salt)
	RemoveRules
	Return Me
End Sub

'add a number
Sub AddNumber(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "number")
	Return Me
End Sub

'add a color
Sub AddColor(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "color")
	SetExtText
	SetCloseOnContentClick(True)
	SetMenuOffsetY
	Return Me
End Sub


'add a switch
Sub AddSwitch(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "switch")
	Return Me
End Sub


'add a combobox
Sub AddComboBox(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "combobox")
	ClearItems
	SetItemText("text")
	SetItemValue("id")
	Return Me
End Sub

'add an autocomplete
Sub AddAutoComplete(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "autocomplete")
	ClearItems
	SetItemText("text")
	SetItemValue("id")
	Return Me
End Sub


'set Row
Sub SetRow() As VMFormBase
	SetProperty(lastItem, "row", True)
	Return Me
End Sub

'set icon left
Sub SetIconLeft(sicon As String) As VMFormBase
	SetProperty(lastItem, "iconLeft", sicon)
	Return Me
End Sub


'set offset
Sub SetOffset(ioffset As Int) As VMFormBase
	SetProperty(lastItem, "offset", ioffset)
	Return Me
End Sub

'set icon right
Sub SetIconRight(sicon As String) As VMFormBase
	SetProperty(lastItem, "iconRight", sicon)
	Return Me
End Sub

'set dark
Sub SetDark() As VMFormBase
	SetProperty(lastItem, "dark", True)
	Return Me
End Sub

'set drop
Sub SetDrop() As VMFormBase
	SetProperty(lastItem, "drop", True)
	Return Me
End Sub

'set disabled
Sub SetDisabled() As VMFormBase
	SetProperty(lastItem, "disabled", True)
	Return Me
End Sub



'add a slider
Sub AddSlider(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "slider")
	Return Me
End Sub

'add a checkbox
Sub AddCheckBox(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "checkbox")
	Return Me
End Sub

'add a button
Sub AddButton(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "btn")
	RemoveRules
	fields.remove(lastItem)
	Return Me
End Sub

'add an icon
Sub AddIcon(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "icon")
	RemoveRules
	fields.remove(lastItem)
	Return Me
End Sub

'add a file input
Sub AddFileInput(sname As String, slabel As String, bShowSize As Boolean, bMultiple As Boolean, sAccept As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "type", "file")
	SetProperty(sname, "multiple", bMultiple)
	SetProperty(sname, "accept", sAccept)
	SetProperty(sname, "showSize", bShowSize)
	If bMultiple Then
		SetValue(vue.newlist)
	End If
	Return Me
End Sub

'convert to string
Sub ToString As String
	Dim sout As String = FormBase.tostring
	Return sout
End Sub

'refresh the content of the form
Sub Refresh
	vue.setdata(mdl, model)
	vue.setdata(sche, schema)
	vue.setdata(row, rowSettings)
	vue.setdata(col, colSettings)
End Sub

'set closeOnContentClick
private Sub SetCloseOnContentClick(b As Boolean) As VMFormBase
	Dim itemschema As Map = schema.get(lastItem)
	Dim menu As Map
	If itemschema.ContainsKey("menu") Then
		menu = itemschema.get("menu")
	Else
		menu.initialize
	End If		
	menu.Put("closeOnContentClick", b)
	itemschema.put("menu", menu)
	schema.put(lastItem, itemschema)
	Return Me
End Sub

'set maxWidth
Sub SetMenuMaxWidth(smaxWidth As String) As VMFormBase
	Dim itemschema As Map = schema.get(lastItem)
	Dim menu As Map
	If itemschema.ContainsKey("menu") Then
		menu = itemschema.get("menu")
	Else
		menu.initialize
	End If		
	menu.Put("maxWidth", smaxWidth)
	itemschema.put("menu", menu)
	schema.put(lastItem, itemschema)
	Return Me
End Sub

'set minWidth
Sub SetMenuMinWidth(sminWidth As String) As VMFormBase
	Dim itemschema As Map = schema.get(lastItem)
	Dim menu As Map
	If itemschema.ContainsKey("menu") Then
		menu = itemschema.get("menu")
	Else
		menu.initialize
	End If		
	menu.Put("minWidth", sminWidth)
	itemschema.put("menu", menu)
	schema.put(lastItem, itemschema)
	Return Me
End Sub


'set offset-y
private Sub SetMenuOffsetY() As VMFormBase
	Dim itemschema As Map = schema.get(lastItem)
	Dim menu As Map
	If itemschema.ContainsKey("menu") Then
		menu = itemschema.get("menu")
	Else
		menu.initialize
	End If		
	menu.Put("offset-y", True)
	itemschema.put("menu", menu)
	schema.put(lastItem, itemschema)
	Return Me
End Sub


'set property
Sub SetProperty(sid As String, prop As String, value As Object) As VMFormBase
	sid = sid.tolowercase
	Dim itemschema As Map = schema.get(sid)
	itemschema.put(prop, value)
	schema.put(sid, itemschema)
	Return Me
End Sub

'set sizes for component for small, medium and large
Sub SetSizes(sizesmall As Int, sizemedium As Int, sizelarge As Int) As VMFormBase
	Dim itemschema As Map = schema.get(lastItem)
	Dim sizes As Map = CreateMap()
	sizes.put("sm", sizesmall)
	sizes.put("md", sizemedium)
	sizes.put("lg", sizelarge)
	itemschema.put("col", sizes)
	schema.put(lastItem, itemschema)
	Return Me
End Sub

'set offsets for component for small, medium and large
Sub SetOffsets(sizesmall As Int, sizemedium As Int, sizelarge As Int) As VMFormBase
	Dim itemschema As Map = schema.get(lastItem)
	Dim sizes As Map = CreateMap()
	sizes.put("sm", sizesmall)
	sizes.put("md", sizemedium)
	sizes.put("lg", sizelarge)
	itemschema.put("offset", sizes)
	schema.put(lastItem, itemschema)
	Return Me
End Sub

'set locale
Sub SetLocale(slocale As String) As VMFormBase
	SetProperty(lastItem, "locale", slocale)
	Return Me
End Sub

'set color
Sub SetBackgroundColor(sbackgroundColor As String) As VMFormBase
	SetProperty(lastItem, "backgroundColor", sbackgroundColor)
	Return Me
End Sub


'set color
Sub SetColor(scolor As String) As VMFormBase
	SetProperty(lastItem, "color", scolor)
	Return Me
End Sub


'set base
Sub SetBase(sURL As String) As VMFormBase
	SetProperty(lastItem, "base", sURL)
	Return Me
End Sub

'set clearable
Sub SetClearable() As VMFormBase
	SetProperty(lastItem, "clearable", True)
	Return Me
End Sub


'set hidden
Sub SetHidden() As VMFormBase
	SetProperty(lastItem, "hidden", True)
	Return Me
End Sub

'set read only
Sub SetReadOnly() As VMFormBase
	SetProperty(lastItem, "readonly", True)
	Return Me
End Sub

'set prependInnerIcon
Sub SetPrependInnerIcon(sicon As String) As VMFormBase
	SetProperty(lastItem, "prependInnerIcon", sicon)
	Return Me
End Sub

'set mask
Sub SetMask(smask As String) As VMFormBase
	SetProperty(lastItem, "mask", smask)
	Return Me
End Sub

'set class
Sub SetClass(className As String) As VMFormBase
	SetProperty(lastItem, "class", className)
	Return Me
End Sub

'set contains
Sub SetContains(bContains As Boolean) As VMFormBase
	SetProperty(lastItem, "contains", bContains)
	Return Me
End Sub


'set multiple
Sub SetMultiple As VMFormBase
	SetProperty(lastItem, "multiple", True)
	Return Me
End Sub

'set solo
Sub SetSolo() As VMFormBase
	SetProperty(lastItem, "solo", True)
	Return Me
End Sub

'set title
Sub SetTitle(stitle As String) As VMFormBase
	SetProperty(lastItem, "title", stitle)
	Return Me
End Sub

'set width
Sub SetWidth(swidth As Int) As VMFormBase
	SetProperty(lastItem, "width", swidth)
	Return Me
End Sub

'set height
Sub SetHeight(sheight As String) As VMFormBase
	SetProperty(lastItem, "height", sheight)
	Return Me
End Sub

'add VMFormBase to container
Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

'add a text area
Sub AddTextArea(sname As String, slabel As String, bAutoGrow As Boolean) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(sname, "autoGrow", bAutoGrow)
	SetProperty(sname, "type", "textarea")
	Return Me
End Sub

'add divider text
Sub AddSheet(sname As String, stext As String) As VMFormBase
	AddTextField(sname, "")
	SetProperty(sname, "type", "sheet")
	SetProperty(sname, "textContent", stext)
	RemoveRules
	fields.remove(lastItem)
	Return Me
End Sub

'add radio
Sub AddRadio(sname As String, slabel As String) As VMFormBase
	AddTextField(sname, slabel)
	SetProperty(lastItem, "type", "radio")
	ClearItems
	SetItemText("value")
	SetItemValue("key")
	Return Me
End Sub