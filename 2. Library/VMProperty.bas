B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#ignorewarnings:12
Sub Class_Globals
	Private expnl As VMExpansionPanels
	Public ID As String
	Private module As Object
	Private vue As BANanoVue
	Private DesignMode As Boolean
	Private controls As Map
	Private fields As List
	Private BANano As BANano 'ignore
	Private Booleans As List
	Private Strings As List
	Private Integers As List
	Private Doubles As List
	Private Dates As List
	Private defaults As Map
	Private labels As Map
	Type PropControls(vmodel As String, value As String, text As String, typeOf As String, module As Object, methodName As String, text1 As String, vmodel1 As String, _
	iconName As String, MinValue As Int, MaxValue As Int, sourceName As String, options As Map, sourcefield As String, displayfield As String, _
	sourceName1 As String, options1 As Map, sourcefield1 As String, displayfield1 As String, OptionsList As List, cont As VMContainer,horizontal As Boolean)
	Dim sshow As String
	Private contChecks As VMContainer
	Private hasChecks As Boolean
	Private changeEvent As String
	Public bText As List
	Public sText As List
	Public contentitems As List
	Private itemtypes As Map
	Public IsTable As Boolean
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMProperty
	ID = sid.tolowercase
	vue = v
	module = eventHandler
	expnl.Initialize(v, ID, eventHandler).SetAccordion(True)
	DesignMode = False
	controls.initialize
	fields.initialize
	Booleans.initialize
	Strings.initialize
	Integers.initialize
	Doubles.initialize
	Dates.initialize
	defaults.initialize
	labels.initialize
	sshow = ""
	hasChecks = False
	contChecks.Initialize(vue, "checks", module).SetFluid(True).SetTag("div").SetNoGutters(True)
	changeEvent = $"${ID}_change"$
	bText.Initialize 
	sText.Initialize 
	contentitems.Initialize
	contentitems.Add("key")
	contentitems.Add("avatar")
	contentitems.Add("icon")
	contentitems.Add("title")
	contentitems.Add("subtitle")
	contentitems.Add("action")
	contentitems.Add("itemtype")
	contentitems.Add("badge")
	contentitems.Add("iconcolor")
	contentitems.Add("subtitle1")
	contentitems.Add("actioncolor")
	contentitems.Add("colwidth")
	contentitems.Add("colsortable")
	contentitems.Add("colalign")
	contentitems.Add("colcontroltype")
	contentitems.Add("coldatatype")
	contentitems.Add("collength")
	contentitems.Add("colvalue")
	contentitems.Add("colplaceholder")
	contentitems.Add("colhelpertext")
	contentitems.Add("colforeigntable")
	contentitems.Add("colforeignkey")
	contentitems.Add("colforeignvalue")
	contentitems.Add("coloptionkeys")
	contentitems.Add("coloptionvalues")
	'
	contentitems.Add("colindexed")
	contentitems.Add("colrequired")
	contentitems.Add("colactive")
	contentitems.Add("colontable")
	contentitems.Add("colvisible")
	contentitems.Add("colvaluedisplay")
	'
	contentitems.Add("colrow")
	contentitems.Add("colcolumn")
	contentitems.Add("coloffsetsmall")
	contentitems.Add("coloffsetmedium")
	contentitems.Add("coloffsetlarge")
	contentitems.Add("coloffsetxlarge")
	contentitems.Add("colsizesmall")
	contentitems.Add("colsizemedium")
	contentitems.Add("colsizelarge")
	contentitems.Add("colsizexlarge")
	'
	contentitems.Add("coldefaultvalue")
	contentitems.Add("colminrange")
	contentitems.Add("colmaxrange")
	contentitems.Add("collist")
	contentitems.Add("coltype")
	contentitems.Add("colsetranges")
	contentitems.Add("colhasset")
	contentitems.Add("colhasget")
	contentitems.Add("colisconsant")
	contentitems.Add("colscope")
	contentitems.Add("colfieldtype")
	'
	IsTable = False
	Return Me
End Sub


'set the active panel
Sub OpenPanel(pnl As String) As VMProperty
	SetActivePanel(pnl)
	Return Me
End Sub


Sub SetActivePanel(activeID As String) As VMProperty
	expnl.SetActivePanel(activeID)
	Return Me
End Sub

Sub SetChangeEvent(cEx As String) As VMProperty
	changeEvent = cEx
	Return Me
End Sub

private Sub RaiseChangeEvent
	If SubExists(module, changeEvent) Then
		BANano.CallSub(module, changeEvent, Null)
	End If
End Sub

'IMPORTANT
Sub SetChecks(parent As String)
	If hasChecks Then
		AddContainer(parent, contChecks)
	End If
End Sub

Sub SetVShow(vif As String) As VMProperty
	sshow = vif
	expnl.SetVShow(vif)
	Return Me
End Sub

Sub Hide
	vue.setdata(sshow, False)
End Sub

Sub Show
	vue.setdata(sshow, True)
End Sub

Sub AddIntegers(i As List) As VMProperty
	For Each s As String In i
		Integers.Add(s)
	Next
	Return Me
End Sub

Sub AddStrings(i As List) As VMProperty
	For Each s As String In i
		Strings.Add(s)
	Next
	Return Me
End Sub

Sub AddBooleans(i As List) As VMProperty
	For Each s As String In i
		Booleans.Add(s)
	Next
	Return Me
End Sub

Sub AddDoubles(i As List) As VMProperty
	For Each s As String In i
		Doubles.Add(s)
	Next
	Return Me
End Sub

Sub AddDates(i As List) As VMProperty
	For Each s As String In i
		Dates.Add(s)
	Next
	Return Me
End Sub

Sub setProperties(m As Map)
	If Doubles.Size > 0 Then vue.MakeDouble(m, Doubles)
	If Integers.Size > 0 Then vue.MakeInteger(m, Integers)
	If Strings.Size > 0 Then vue.MakeTrim(m, Strings)
	If Dates.Size > 0 Then vue.MakeDate(m, Dates)
	If Booleans.Size > 0 Then vue.MakeBoolean(m, Booleans)
	vue.SetState(m)
End Sub

Sub AddSelect(parent As String, vmodel As String, vText As String, options As Map) As VMProperty
	vmodel = vmodel.tolowercase
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	Dim sourceName As String = $"${vmodel}items"$
	Dim sourcefield As String = "id"
	Dim displayfield As String = "text"
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vmodel
	nc.text = vText
	nc.value = ""
	nc.typeOf = "selectbox"
	nc.sourceName = sourceName
	nc.options = options
	nc.sourcefield = sourcefield
	nc.displayfield = displayfield
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Strings.Add(vmodel)
	defaults.Put(vmodel,"")
	Return Me
End Sub

Sub AddSelectM(parent As String, vmodel As String, vText As String, options As Map) As VMProperty
	vmodel = vmodel.tolowercase
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	Dim sourceName As String = $"${vmodel}items"$
	Dim sourcefield As String = "id"
	Dim displayfield As String = "text"
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vmodel
	nc.text = vText
	nc.value = ""
	nc.typeOf = "selectboxm"
	nc.sourceName = sourceName
	nc.options = options
	nc.sourcefield = sourcefield
	nc.displayfield = displayfield
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Strings.Add(vmodel)
	defaults.Put(vmodel,"")
	Return Me
End Sub

'get properties
Sub getProperties As Map
	Dim rec As Map = CreateMap()
	For Each k As String In fields
		Dim v As Object = vue.GetState(k, "")
		If v = BANano.UNDEFINED Then v = ""
		rec.Put(k, v)
	Next
	If Booleans.Size > 0 Then vue.MakeBoolean(rec, Booleans)
	If Doubles.Size > 0 Then vue.MakeDouble(rec, Doubles)
	If Integers.Size > 0 Then vue.MakeInteger(rec, Integers)
	If Strings.Size > 0 Then vue.MakeTrim(rec, Strings)
	Return rec
End Sub

'clear the property bag
Sub Clear
	For Each k As String In fields
		vue.SetStateSingle(k, Null)
	Next
End Sub


Sub getJSON As String
	Dim them As Map = getProperties
	Dim sjson As String = BANano.ToJson(them)
	Return sjson
End Sub

Sub AddButton(parent As String, btnID As String, btnText As String, methodName As String)
	parent = parent.tolowercase
	btnID = btnID.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = ""
	nc.text = btnText
	nc.value = btnID
	nc.typeOf = "button"
	nc.module = module
	nc.methodName = methodName
	existing.Add(nc)
	controls.Put(parent, existing)
End Sub

Sub AddSlider(parent As String, vmodel As String, Label As String, minValue As Int, maxValue As Int, value As Int)
	parent = parent.tolowercase
	vmodel = vmodel.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vmodel
	nc.text = Label
	nc.value = value
	nc.typeOf = "slider"
	nc.MinValue = minValue
	nc.MaxValue = maxValue
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Integers.Add(vmodel)
	defaults.Put(vmodel,value)
End Sub

Sub AddContainer(parent As String, cont As VMContainer)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = cont.id
	nc.text = ""
	nc.value = ""
	nc.typeOf = "container"
	nc.cont = cont
	existing.Add(nc)
	controls.Put(parent, existing)
End Sub

Sub AddHeightWidths(parent As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = "widths"
	nc.text = "Widths"
	nc.value = ""
	nc.typeOf = "widths"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add("width")
	fields.Add("minwidth")
	fields.Add("maxwidth")
	'
	fields.Add("height")
	fields.Add("minheight")
	fields.Add("maxheight")
	'
	Strings.Add("height")
	Strings.Add("minheight")
	Strings.Add("maxheight")
	'
	Strings.Add("width")
	Strings.Add("minwidth")
	Strings.Add("maxwidth")
	'
	defaults.Put("width","")
	defaults.Put("minwidth","")
	defaults.Put("maxwidth","")
	defaults.Put("height","")
	defaults.Put("minheight","")
	defaults.Put("maxheight","")
	'
	sText.add("width")
	sText.add("minwidth")
	sText.add("maxwidth")
	sText.add("height")
	sText.add("minheight")
	sText.add("maxheight")
End Sub

Sub AddMenuItems(parent As String)
	AddCrudList(parent, CreateMap("key":"Item Key","avatar":"Avatar","icon":"Icon Name", "iconcolor": "Icon Color", "title":"Title","subtitle":"Sub Title","action":"Action Icon"))
End Sub

Sub AddCarouselItems(parent As String)
	AddCrudList(parent, CreateMap("key":"Item Key","avatar":"Src","title":"Title"))
End Sub

Sub AddDataTableColumns(parent As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = "dtcolumns"
	nc.text = "dtcolumns"
	nc.value = ""
	nc.typeOf = "dtcolumns"
	existing.Add(nc)
	controls.Put(parent, existing)
End Sub


Sub AddToolbarItems(parent As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = "toolbaritems"
	nc.text = "toolbaritems"
	nc.value = ""
	nc.typeOf = "toolbaritems"
	existing.Add(nc)
	controls.Put(parent, existing)
End Sub

Sub AddDesignerProperties(parent As String)
	itemtypes.Initialize
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = "items"
	nc.text = "table"
	nc.value = ""
	nc.typeOf = "designerproperty"
	existing.Add(nc)
	controls.Put(parent, existing)
End Sub


'only 1 of this can exist in a property bag
Sub AddCrudList(parent As String, options As Map)
	itemtypes.Initialize 
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = "items"
	nc.text = "table"
	nc.value = ""
	nc.typeOf = "table"
	nc.options = options
	existing.Add(nc)
	controls.Put(parent, existing)
End Sub

Sub AddText2(parent As String, options As Map)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = "text2"
	nc.text = "Text2"
	nc.value = ""
	nc.typeOf = "text2"
	nc.options = options
	existing.Add(nc)
	controls.Put(parent, existing)
	'
	For Each k As String In options.keys
		fields.Add(k)
		defaults.Put(k, "")
		sText.Add(k)
		Strings.Add(k)
	Next
End Sub

'add 2 selects on same line
Sub AddSelect2(parent As String, vmodel As String, vText As String, options As Map, vmodel1 As String, vText1 As String, options1 As Map) As VMProperty
	vmodel = vmodel.tolowercase
	vmodel1 = vmodel1.tolowercase
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim sourceName As String = $"${vmodel}items"$
	Dim sourceName1 As String = $"${vmodel1}items"$
	Dim sourcefield As String = "id"
	Dim displayfield As String = "text"
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vmodel
	nc.vmodel1 = vmodel1
	nc.text = vText
	nc.text1 = vText1
	nc.value = ""
	nc.typeOf = "select2"
	nc.sourceName = sourceName
	nc.options = options
	nc.sourcefield = sourcefield
	nc.displayfield = displayfield
	'
	nc.sourceName1 = sourceName1
	nc.options1 = options1
	nc.sourcefield1 = sourcefield
	nc.displayfield1 = displayfield
	'
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Strings.Add(vmodel)
	defaults.Put(vmodel,"")
	'
	fields.Add(vmodel1)
	Strings.Add(vmodel1)
	defaults.Put(vmodel1,"")
	Return Me
End Sub


Sub AddMatrix(parent As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = "sizes"
	nc.text = "Sizes"
	nc.value = ""
	nc.typeOf = "sizes"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add("row")
	fields.Add("col")
	fields.Add("offsetsmall")
	fields.Add("offsetmedium")
	fields.Add("offsetlarge")
	fields.Add("offsetxlarge")
	'
	Integers.Add("offsetsmall")
	Integers.Add("offsetmedium")
	Integers.Add("offsetlarge")
	Integers.Add("offsetxlarge")
	'
	defaults.Put("offsetsmall",0)
	defaults.Put("offsetmedium",0)
	defaults.Put("offsetlarge",0)
	defaults.Put("offsetxlarge",0)
		
	fields.Add("sizesmall")
	fields.Add("sizemedium")
	fields.Add("sizelarge")
	fields.Add("sizexlarge")
	'
	Integers.Add("row")
	Integers.Add("col")
	Integers.Add("sizesmall")
	Integers.Add("sizemedium")
	Integers.Add("sizelarge")
	Integers.Add("sizexlarge")
	'
	defaults.put("row",1)
	defaults.put("col",1)
	defaults.Put("sizesmall",12)
	defaults.Put("sizemedium",12)
	defaults.Put("sizelarge",12)
	defaults.Put("sizexlarge",12)
	'
	sText.Add("row")
	sText.Add("col")
	sText.Add("sizesmall")
	sText.Add("sizemedium")
	sText.Add("sizelarge")
	sText.Add("sizexlarge")
End Sub

Sub AddLabel(parent As String, vmodel As String, txt As String)
	parent = parent.tolowercase
	vmodel = vmodel.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vmodel
	nc.text = txt
	nc.value = ""
	nc.typeOf = "label"
	existing.Add(nc)
	controls.Put(parent, existing)
End Sub

'add a heading
Sub AddHeading(sectName As String, sectHeading As String) As VMProperty
	sectName = sectName.tolowercase
	labels.Put(sectName, sectHeading)
	'
	Dim items As List
	items.Initialize
	controls.Put(sectName, items)
	Return Me
End Sub


Sub AddSwitch(parent As String, vModel As String, text As String, bValue As Boolean)
	parent = parent.tolowercase
	vModel = vModel.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = text
	nc.value = bValue
	nc.typeOf = "switch"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	Booleans.Add(vModel)
	defaults.Put(vModel,bValue)
End Sub

Sub AddIconButton(parent As String, btnID As String, btnIcon As String, methodName As String)
	parent = parent.tolowercase
	btnID = btnID.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.iconName = btnIcon
	nc.value = btnID
	nc.typeOf = "iconbutton"
	nc.module = module
	nc.methodName = methodName
	existing.Add(nc)
	controls.Put(parent, existing)
End Sub

Sub AddPassword(parent As String, vModel As String, vText As String, vValue As String)
	AddInput(parent, "password", vModel, vText, "", vValue)
	Strings.Add(vModel)
End Sub

Sub AddText(parent As String, vModel As String, vText As String, vIcon As String, vValue As String)
	AddInput(parent, "text", vModel, vText, vIcon, vValue)
	Strings.add(vModel)
End Sub

Sub AddTel(parent As String, vModel As String, vText As String, vIcon As String,vValue As String)
	AddInput(parent, "tel", vModel, vText, vIcon, vValue)
	Integers.add(vModel)
End Sub

Sub AddNumber(parent As String, vModel As String, vText As String, vIcon As String, vValue As String)
	AddInput(parent, "number", vModel, vText, vIcon, vValue)
	Integers.Add(vModel)
End Sub

Sub AddEmail(parent As String, vModel As String, vText As String, vIcon As String, vValue As String)
	AddInput(parent, "email", vModel, vText, vIcon, vValue)
	Strings.Add(vModel)
End Sub

Sub AddTextArea(parent As String, vModel As String, vText As String, vIcon As String, vValue As String)
	AddInput(parent, "textarea", vModel, vText, vIcon, vValue)
	Strings.Add(vModel)
End Sub

private Sub AddInput(parent As String, typeOf As String, vModel As String, vText As String, vIcon As String, vValue As String)
	parent = parent.tolowercase
	vModel = vModel.tolowercase
	sText.Add(vModel)
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Select Case typeOf
	Case "number", "tel"
		If vValue = "" Then vValue = "0"
		vValue = BANano.parseInt(vValue)
	End Select
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = vText
	nc.value = vValue
	nc.typeOf = typeOf
	nc.iconName = vIcon
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	defaults.Put(vModel,vValue)
End Sub

Sub SetDefaults
	vue.SetState(defaults)
	expnl.OpenPanel(0)
End Sub

Sub AddCheck(parent As String, vModel As String, text As String, bvalue As Boolean)
	parent = parent.tolowercase
	vModel = vModel.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = text
	nc.value = bvalue
	nc.typeOf = "checkbox"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	Booleans.Add(vModel)
	defaults.Put(vModel,bvalue)
End Sub

Sub AddDatePicker(parent As String, vModel As String, text As String, vValue As String)
	parent = parent.tolowercase
	vModel = vModel.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = text
	nc.value = vValue
	nc.typeOf = "datepicker"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	Strings.Add(vModel)
	defaults.Put(vModel,vValue)
End Sub


Sub AddTimePicker(parent As String, vModel As String, text As String, vValue As String)
	parent = parent.tolowercase
	vModel = vModel.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = text
	nc.value = vValue
	nc.typeOf = "timepicker"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	Strings.Add(vModel)
	defaults.Put(vModel,vValue)
End Sub

Sub AddRadioGroup(parent As String, vmodel As String, vText As String, options As Map)
	parent = parent.tolowercase
	vmodel = vmodel.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	Dim sourceName As String = $"${vmodel}items"$
	Dim sourcefield As String = "id"
	Dim displayfield As String = "text"
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vmodel
	nc.text = vText
	nc.value = ""
	nc.typeOf = "radiogroup"
	nc.sourceName = sourceName
	nc.options = options
	nc.sourcefield = sourcefield
	nc.displayfield = displayfield
	nc.horizontal = False
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Strings.Add(vmodel)
	defaults.Put(vmodel,"")
End Sub

Sub AddRadioGroupH(parent As String, vmodel As String, vText As String, options As Map)
	parent = parent.tolowercase
	vmodel = vmodel.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	Dim sourceName As String = $"${vmodel}items"$
	Dim sourcefield As String = "id"
	Dim displayfield As String = "text"
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vmodel
	nc.text = vText
	nc.value = ""
	nc.typeOf = "radiogroup"
	nc.sourceName = sourceName
	nc.options = options
	nc.sourcefield = sourcefield
	nc.displayfield = displayfield
	nc.horizontal = True
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Strings.Add(vmodel)
	defaults.Put(vmodel,"")
End Sub

Sub CreateToolbar(sid As String, moduleObj As Object) As VMToolBar
	Dim el As VMToolBar
	el.Initialize(vue, sid, moduleObj)
	el.SetDesignMode(DesignMode)
	el.SetToolBar(True)
	Return el
End Sub

Sub CreateList(sid As String, eventHandler As Object) As VMList
	Dim el As VMList
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

'add a new item
Sub btnAddTable_click(e As BANanoEvent)
	ClearContents
	If IsTable = False Then Return
	Dim m As Map = CreateMap()
	m.Put("subtitle", "text")
	m.Put("colalign", "start")
	m.Put("colcontroltype", "text")
	m.Put("coldatatype", "TEXT")
	m.Put("coloptionkeys", "1,2,3")
	m.Put("coloptionvalues", "One,Two,Three")
	m.Put("colforeignkey", "id")
	m.Put("colforeignvalue", "text")
	m.Put("colvisible", "Yes")
	m.Put("colactive", "Yes")
	m.Put("colontable", "Yes")
	m.Put("colindexed", "Yes")
	m.Put("colsortable", "Yes")
	m.Put("colrequired", "Yes")
	m.Put("colrow", "1")
	m.Put("colcolumn", "1")
	m.Put("coloffsetsmall", "0")
	m.Put("coloffsetmedium", "0")
	m.Put("coloffsetlarge", "0")
	m.Put("coloffsetxlarge", "1")
	m.Put("colsizesmall", "12")
	m.Put("colsizemedium", "12")
	m.Put("colsizelarge", "12")
	m.Put("colsizexlarge", "12")
	'
	For Each k As String In m.Keys
		Dim vmodel As String = $"items${k}"$
		Dim v As String = m.Get(k)
		vue.SetData(vmodel, v)
	Next
End Sub

'add item in items
Sub AddItem
	ClearContents
End Sub

'save an item
Sub btnSaveTable_click(e As BANanoEvent)
	Dim item As Map = CreateMap()
	For Each k As String In contentitems
		Dim v As String = vue.GetData($"items${k}"$)
		If v = BANano.UNDEFINED Then v = ""
		item.Put(k, v)
	Next
	'
	Dim b As List
	b.Initialize 
	Dim s As List
	s.Initialize 
	For Each k As String In itemtypes.keys
		Dim v As String = itemtypes.Get(k)
		If v.EqualsIgnoreCase("boolean") Then b.Add(k)
		If v.EqualsIgnoreCase("string") Then s.Add(k)
	Next
	If B.Size > 0 Then vue.MakeYesNo(item, B)
	If S.Size > 0 Then vue.MakeTrim(item, S)
	
	'read the existing items
	Dim contents As List = vue.GetData("tableitems")
	
	'get the value
	Dim v As String = item.Get("key")
	If v = "" Then Return
	'does the record exist
	Dim rpos As Int = RecordPos(contents, "key", v)
	rpos = BANano.parseInt(rpos)
	Select Case rpos
	Case -1	
		contents.Add(item)
	Case Else
		contents.Set(rpos, item)
	End Select		
	vue.SetData("tableitems", contents)
	vue.SetData("tableitem", item)
	ClearContents
	'ensure we save the prop bag
	BANano.CallSub(module, changeEvent, Null)
End Sub

'get the record position from saved items
Sub RecordPos(lst As List, k As String, v As String) As Int
	Dim lTot As Int = lst.Size - 1
	Dim lCnt As Int
	For lCnt = 0 To lTot
		Dim m As Map = lst.Get(lCnt)
		Dim sk As String = m.GetDefault(k, "")
		If sk.EqualsIgnoreCase(v) Then
			Return lCnt
		End If
	Next
	Return -1
End Sub

'clear the contents of the items on list
Sub ClearContents
	'empty the details for entry
	Dim item As Map = CreateMap()
	For Each k As String In contentitems
		Dim v As String = $"items${k}"$
		item.Put(v, Null)
	Next
	vue.SetState(item)
End Sub

'delete an item from items
Sub DeleteItem
	Dim item As Map = CreateMap()
	For Each k As String In contentitems
		Dim v As String = vue.GetData($"items${k}"$)
		item.Put(k, v)
	Next
	'read the existing items
	Dim contents As List = vue.GetData("tableitems")
	'get the value
	Dim v As String = item.Get("key")
	If v = "" Then Return
	'does the record exist
	Dim rpos As Int = RecordPos(contents, "key", v)
	rpos = BANano.parseInt(rpos)
	If rpos <> -1 Then
		contents.RemoveAt(rpos)
	End If
	vue.SetData("tableitems", contents)
	vue.SetData("tableitem", item)
	ClearContents
	BANano.CallSub(module, changeEvent, Null)
End Sub

Sub btnEmpty_click(e As BANanoEvent)
	vue.SetData("tableitems", vue.NewList)
	vue.SetData("tableitem", vue.newmap)
	ClearContents
	BANano.CallSub(module, changeEvent, Null)
End Sub

Sub btnDeleteTable_click(e As BANanoEvent)
	DeleteItem
End Sub

'edit an item in the menu items
Sub EditItem(menuID As String)
	If menuID = "" Then Return
	'read the existing items
	Dim contents As List = vue.GetData("tableitems")
	'does the record exist
	Dim rpos As Int = RecordPos(contents, "key", menuID)
	'copy to needed structure
	If rpos = -1 Then Return
	'get the saved record
	Dim m As Map = contents.Get(rpos)
	For Each k As String In contentitems
		'read the existing record
		Dim v As String = m.Get(k)
		m.Put($"items${k}"$, v)
	Next
	vue.SetState(m)
End Sub

Sub itemscrud_click(e As BANanoEvent)
	Dim menuID As String = vue.getidfromevent(e)
	EditItem(menuID)
End Sub

'create a multi-text container
Sub MultiText(nc As PropControls, m As Map) As VMContainer
	'how many text fields to add
	Dim tcont As VMContainer
	tcont.Initialize(vue, "mt" & nc.vmodel, module).SetTag("div").SetFluid(True).SetNoGutters(True)
	'
	Dim tTot As Int = m.Size
	Dim colSize As Int
	Select Case tTot
	Case 1
		colSize = 12
	Case 2
		colSize = 6	
	Case 3
		colSize = 4
	Case 4
		colSize = 3
	Case 6
		colSize = 2
	Case Else
		Log("VMProperty.MultiText - item sizes should be 1, 2, 3, 4, 6")	
	End Select
	'
	Dim colPos As Int = 0
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		Dim vmodel As String = $"${nc.vmodel}${k}"$
		colPos = colPos + 1
		
		Dim tw As VMTextField = AddTextField(k, vmodel, v)
		tcont.AddControlS(tw.TextField, tw.ToString, 1, colPos, colSize, colSize, colSize, colSize)
	Next
	Return tcont
End Sub

Sub MultiSelect(nc As PropControls, vmodel As String, vText As String, options As Map, vmodel1 As String, vText1 As String, options1 As Map) As VMContainer
	Dim tcont As VMContainer
	tcont.Initialize(vue, "mt" & nc.vmodel, module).SetTag("div").SetFluid(True).SetNoGutters(True)
	'
	Dim cbo As VMSelect
	cbo.Initialize(vue, "cbo" & vmodel, module).SetStatic(True).Setlabel(vText).SetVModel($"${nc.vmodel}${vmodel}"$)
	cbo.SetOptions($"${vmodel}1"$, options, "id", "text", False).RemoveAttr("ref").SetDense(True)
	cbo.SetOutlined(True).SetHideDetails(True).AddClass("my-2")
	tcont.AddControlS(cbo.Combo, cbo.ToString, 1, 1, 6, 6, 6, 6)
	'
	Dim cbo1 As VMSelect
	cbo1.Initialize(vue, "cbo" & vmodel1, module).SetStatic(True).Setlabel(vText1).SetVModel($"${nc.vmodel}${vmodel1}"$)
	cbo1.SetOptions($"${vmodel1}1"$, options1, "id", "text", False).RemoveAttr("ref").SetDense(True)
	cbo1.SetOutlined(True).SetHideDetails(True).AddClass("my-2")
	tcont.AddControlS(cbo1.Combo, cbo1.ToString, 1, 2, 6, 6, 6, 6)
	Return tcont
End Sub

Sub MultiSwitches(nc As PropControls, options As Map) As VMContainer
	Dim acont As VMContainer
	acont.Initialize(vue, "", module).SetTag("div")
	acont.NoGutters = True
	acont.SetFluid(True)
	Dim colPos As Int = 0
	For Each k As String In options.keys
		Dim v As String = options.Get(k)
		Dim vmodel As String = $"${nc.vmodel}${k}"$
		colPos = colPos + 1
		'
		Dim sw As VMCheckBox
		sw.Initialize(vue, "sw" & k, module).SetStatic(True).SetVModel(vmodel).SetSwitch
		sw.Setlabel(v).SetTrueValue("Yes").SetFalseValue("No").SetHideDetails(True).SetFieldType("string")
		sw.RemoveAttr("ref").SetDense(True).SetInset(True)
		acont.AddControlS(sw.CheckBox, sw.ToString, 1, colPos, 6, 6, 6, 6)
		vue.SetData(vmodel, "No")
	Next
	Return acont
End Sub

Sub ToString As String
	For Each slabel As String In labels.Keys
		'get the heading
		Dim hdr As String = labels.get(slabel)
		'get the items
		Dim items As List = controls.Get(slabel)
		'
		'create an expansion panel
		Dim expanel As VMExpansionPanel
		expanel.initialize(vue, ID, slabel, module)
		expanel.Header.SetText(hdr)
		expanel.Content.Container.SetTag("div")
		expanel.Content.Container.NoGutters = True
		expanel.Container.SetFluid(True)
		'
		For Each nc As PropControls In items
			Select Case nc.typeOf
			Case "designerproperty"
				itemtypes.Initialize
				nc.vmodel = "items"
				Dim bcont As VMContainer
				bcont.Initialize(vue, "tx" & nc.vmodel, module).SetStatic(True).SetTag("div").NoGutters = True
				bcont.SetFluid(True)
				bcont.AddRows(1).AddColumns12
				'add a toolbar
				Dim tblx As VMToolBar = CreateToolbar("t" & nc.vmodel, Me).SetStatic(True).SetFlat(True)
				tblx.SetDense(True).AddSpacer
				tblx.AddIcon("btnAddTable", "mdi-plus", "Add item", "")
				tblx.AddIcon("btnSaveTable", "save", "Save item", "")
				tblx.AddIcon("btnDeleteTable", "delete", "Delete item", "")
				tblx.AddIcon("btnEmpty","mdi-delete-empty-outline", "Empty items", "")
				bcont.AddComponent(1, 1, tblx.tostring)
					'
				'add input controls
				Dim tcont As VMContainer
				tcont.Initialize(vue, "tbl" & nc.vmodel, module).SetTag("div").SetStatic(True)
				tcont.NoGutters = True
				tcont.SetFluid(True)
				'
				nc.options.Initialize
				nc.options.Put("key", "Key")
				nc.options.Put("title", "Display Name")
				nc.options.Put("colscope", "Scope")
				nc.options.Put("colfieldtype", "Field Type")
				nc.options.Put("coldefaultvalue", "Default Value")
				nc.options.Put("subtitle1", "Description")
				nc.options.Put("colminrange", "Min Range")
				nc.options.Put("colmaxrange", "Max Range")
				nc.options.Put("collist", "List / Parameters")
				nc.options.Put("coltype", "Type")
				nc.options.Put("colsetranges", "Set Ranges")
				nc.options.Put("colhasset", "Set")
				nc.options.Put("colhasget", "Get")
				'
				Dim vc As VMContainer = MultiText(nc, CreateMap("key":"Key"))
				bcont.AddComponent(1, 1, vc.tostring)
				'
				Dim vc As VMContainer = MultiText(nc, CreateMap("title":"Display Name"))
				bcont.AddComponent(1, 1, vc.tostring)
				'
				Dim vc As VMContainer = MultiText(nc, CreateMap("coldefaultvalue":"Default Value"))
				bcont.AddComponent(1, 1, vc.tostring)
				'
				Dim optx As Map = vue.List2MapSimple(Array("String","StringBuilder","Byte","Int","Long","Map","List","Object","Canvas","Boolean","Short","Float","Double","Char","Color"), True)
					
				Dim vc As VMContainer = MultiSelect(nc, "colscope", "Scope", CreateMap("Private":"Private","Public":"Public"), _
				"colfieldtype", "Field Type", optx)
				bcont.AddComponent(1, 1, vc.tostring)
				'
				Dim cbo1 As VMSelect
				cbo1.Initialize(vue, "coltype", module).SetStatic(True).Setlabel("Type").SetVModel($"${nc.vmodel}coltype"$)
				Dim xx As Map = CreateMap("isconstant":"Constant","isproperty":"Property","isdesign":"Design Property","isevent":"Event","isclass":"Class Name","isstyle":"Style")
				cbo1.SetOptions("coltypes", xx, "id", "text", False).RemoveAttr("ref").SetDense(True)
				cbo1.SetOutlined(True).SetHideDetails(True).AddClass("my-2")
				bcont.AddComponent(1, 1, cbo1.ToString)
				'
				Dim vc As VMContainer = MultiText(nc, CreateMap("subtitle1":"Description"))
				bcont.AddComponent(1, 1, vc.tostring)
					
				Dim vc As VMContainer = MultiText(nc, CreateMap("colminrange":"Min Range","colmaxrange":"Max Range"))
				bcont.AddComponent(1, 1, vc.tostring)
				'
				Dim txta As VMTextField = NewTextArea("collist", $"${nc.vmodel}collist"$, "List / Parameters")
				bcont.AddComponent(1, 1, txta.tostring)
					
				Dim vc As VMContainer = MultiSwitches(nc, CreateMap("colsetranges":"Set Ranges"))
				bcont.AddComponent(1, 1, vc.tostring)
				'
				Dim vc As VMContainer = MultiSwitches(nc, CreateMap("colhasset":"Set","colhasget":"Get"))
				bcont.AddComponent(1, 1, vc.tostring)
					'
'				'add a list
'				Dim mItems As VMList = CreateList(nc.vmodel & "crud", Me).SetElevation("1")
'				mItems.SetStatic(True)
'				mItems.SetDataSourceTemplate1("tableitems", "key", "", "icon", "iconcolor", "title", "subtitle", "","","")
'				mItems.AddClass("my-2")
'				Dim mList As String = mItems.tostring
'				bcont.AddComponent(2, 1, mList)

				expanel.Container.AddControlS(bcont.Container, bcont.ToString, 1, 1, 12, 12, 12, 12)

					
			Case "dtcolumns"
				Dim iconfound As Boolean = False
				Dim lenfound As Boolean = False
				Dim forfound As Boolean = False
				'
				itemtypes.Initialize 
				nc.vmodel = "items"
				Dim bcont As VMContainer
				bcont.Initialize(vue, "tx" & nc.vmodel, module).SetStatic(True).SetTag("div").NoGutters = True
				bcont.SetFluid(True)
				bcont.AddRows(2).AddColumns12
				'add a toolbar
				Dim tblx As VMToolBar = CreateToolbar("t" & nc.vmodel, Me).SetStatic(True).SetFlat(True)
				tblx.SetDense(True).AddSpacer
				tblx.AddIcon("btnAddTable", "mdi-plus", "Add item", "")
				tblx.AddIcon("btnSaveTable", "save", "Save item", "")
				tblx.AddIcon("btnDeleteTable", "delete", "Delete item", "")
				tblx.AddIcon("btnEmpty","mdi-delete-empty-outline", "Empty items", "")
				bcont.AddComponent(1, 1, tblx.tostring)
				'
				'add input controls
				Dim tcont As VMContainer
				tcont.Initialize(vue, "tbl" & nc.vmodel, module).SetTag("div").SetStatic(True)
				tcont.NoGutters = True
				tcont.SetFluid(True)
				'
				nc.options.Initialize
				nc.options.Put("key", "Name")
				nc.options.Put("title", "Title")
				nc.options.Put("subtitle", "Col Type")
				nc.options.Put("colwidth", "Width")
				nc.options.Put("icon", "Icon")
				nc.options.Put("colalign", "Col Align")
				nc.options.Put("colvaluedisplay", "Value / Display")
				nc.options.Put("colcontroltype", "Component")
				nc.options.Put("coldatatype", "Data Type")
				nc.options.Put("collength", "Length")
				nc.options.Put("colvalue", "Value")
				'
				nc.options.Put("colplaceholder", "Place Holder")
				nc.options.Put("colhelpertext", "Helper Text")
				
				nc.options.Put("colforeigntable", "Foreign Table")
				nc.options.Put("colforeignkey", "Foreign Key")
				nc.options.Put("colforeignvalue", "Foreign Value")
				'
				nc.options.Put("coloptionkeys", "Option Keys (,)")
				nc.options.Put("coloptionvalues", "Option Values (,)")
				
				'
				nc.options.Put("colsortable", "Sortable")
				nc.options.Put("colrequired", "Required")
				nc.options.Put("colvisible", "Visible")
				nc.options.Put("colactive", "Active")
				nc.options.Put("colontable", "On Table")
				nc.options.Put("colindexed", "Indexed")
				'
				nc.options.Put("colrow", "Row")
				nc.options.Put("colcolumn", "Col")
				nc.options.Put("coloffsetsmall", "OS")
				nc.options.Put("coloffsetmedium", "OM")
				nc.options.Put("coloffsetlarge", "OL")
				nc.options.Put("coloffsetxlarge", "OX")
				nc.options.Put("colsizesmall", "SS")
				nc.options.Put("colsizemedium", "SM")
				nc.options.Put("colsizelarge", "SL")
				nc.options.Put("colsizexlarge", "SX")
				
				'add name and title			
				Dim vc As VMContainer = MultiText(nc, CreateMap("key":"Name","title":"Title"))
				bcont.AddComponent(1, 1, vc.tostring)
				
				'
				For Each k As String In nc.options.Keys
					Dim v As String = nc.options.Get(k)
					Dim vmodel As String = $"${nc.vmodel}${k}"$
					'
					If iconfound Then
						Dim vc As VMContainer = MultiText(nc, CreateMap("colwidth":"Col Width","icon":"Col Icon"))
						tcont.AddControlS(vc.Container, vc.ToString, 1, 1, 12, 12, 12, 12)
						iconfound = False
					End If
					'
					If lenfound Then
						Dim vc As VMContainer = MultiText(nc, CreateMap("collength":"Length","colvalue":"Value"))
						tcont.AddControlS(vc.Container, vc.ToString, 1, 1, 12, 12, 12, 12)
						lenfound = False
					End If
						
					If forfound	Then
						Dim vc As VMContainer = MultiText(nc, CreateMap("colforeigntable":"For.Table","colforeignkey":"For.Key","colforeignvalue":"For.Value"))
						tcont.AddControlS(vc.Container, vc.ToString, 1, 1, 12, 12, 12, 12)
						forfound = False
					End If
					
					Select Case k
					Case "colforeignvalue"
						forfound = True
						itemtypes.Put(k, "String")
						vue.SetData(vmodel,"")
					Case "colvalue"
						lenfound = True
						itemtypes.Put(k, "String")
						vue.SetData(vmodel,"")
					Case "colwidth", "collength", "colforeigntable","colforeignkey"
						itemtypes.Put(k, "String")
						vue.SetData(vmodel,"")
					Case "icon"
						iconfound = True
						itemtypes.Put(k, "String")
						vue.SetData(vmodel,"")
					Case "key", "title"
						itemtypes.Put(k, "String")
						vue.SetData(vmodel,"")
					Case "colrow","colcolumn","coloffsetsmall","coloffsetmedium","coloffsetlarge","coloffsetxlarge"
						itemtypes.Put(k, "String")
					Case "colsizesmall","colsizemedium","colsizelarge","colsizexlarge"
						itemtypes.Put(k, "String")
					Case "colsortable" ,"colrequired", "colvisible","colindexed","colactive","colontable"
						itemtypes.put(k, "Boolean")
					Case "colvaluedisplay"
						Dim rgx As VMRadioGroup
						rgx.Initialize(vue, "rgvaluedisplay", module).SetStatic(True).SetVModel(vmodel).Setlabel(v)
						rgx.SetOptions(CreateMap("isvalue":"Value","isdisplay":"Display","isnone":"None"))
						vue.SetData(vmodel, "isnone")
						rgx.SetDense(True).SetRow(True).RemoveAttr("ref").SetHideDetails(True)
						rgx.AddClass("my-2")
						tcont.AddControlS(rgx.RadioGroup, rgx.ToString, 1, 1, 12, 12, 12, 12)
						itemtypes.put(k, "String")
					Case "colalign"
						Dim rg As VMRadioGroup
						rg.Initialize(vue, "rgalign", module).SetStatic(True).SetVModel(vmodel).Setlabel(v)
						rg.SetOptions(CreateMap("start":"Start","center":"Center","end":"End"))
						vue.SetData(vmodel, "start")
						rg.SetDense(True).SetRow(True).RemoveAttr("ref").SetHideDetails(True)
						rg.AddClass("my-2")
						tcont.AddControlS(rg.RadioGroup, rg.ToString, 1, 1, 12, 12, 12, 12)
						itemtypes.put(k, "String")
					Case "colcontroltype"
						Dim cbot1 As VMSelect
						cbot1.Initialize(vue, "colcontroltype", module).SetStatic(True).Setlabel(v).SetVModel(vmodel)
						cbot1.SetOptions("colcontroltypes", vue.ControlTypes, "id", "text", False)
						cbot1.RemoveAttr("ref").SetDense(True).SetOutlined(True).SetHideDetails(True).AddClass("my-2")
						tcont.AddControlS(cbot1.Combo, cbot1.ToString, 1, 1, 12, 12, 12, 12)
						itemtypes.put(k,"String")
					Case "coldatatype"
						Dim cbot As VMSelect
						cbot.Initialize(vue, "coldatatype", module).SetStatic(True).Setlabel(v).SetVModel(vmodel)
						cbot.SetOptions("coldatatypes", vue.DataTypes, "id", "text", False)
						cbot.RemoveAttr("ref").SetDense(True).SetOutlined(True).SetHideDetails(True).AddClass("my-2")
						tcont.AddControlS(cbot.Combo, cbot.ToString, 1, 1, 12, 12, 12, 12)
						itemtypes.put(k,"String")
					Case "subtitle"
						Dim cbo As VMSelect
						cbo.Initialize(vue, "cbosubtitle", module).SetStatic(True).Setlabel(v).SetVModel(vmodel)
						cbo.SetOptions("columntypes", vue.ColumnTypes, "id", "text", False)
						cbo.RemoveAttr("ref").SetDense(True).SetOutlined(True).SetHideDetails(True).AddClass("my-2")
						tcont.AddControlS(cbo.Combo, cbo.ToString, 1, 1, 12, 12, 12, 12)
						itemtypes.put(k,"String")
					Case Else
						Dim tw As VMTextField
						tw.Initialize(vue, vmodel, module).SetStatic(True).Setlabel(v)
						tw.SetVModel(vmodel).SetType("text").RemoveAttr("ref").SetDense(True)
						tw.SetOutlined(True).SetHideDetails(True).AddClass("my-2").RemoveAttr("v-show")
						tcont.AddControlS(tw.TextField, tw.ToString, 1, 1, 12, 12, 12, 12)
						vue.SetData(vmodel,"")
						itemtypes.put(k,"String")
					End Select
				Next
				bcont.AddComponent(1, 1, tcont.tostring)
				
				'
				Dim xm As Map = CreateMap()
				xm.Put("colsortable", "Sortable")
				xm.Put("colrequired", "Required")
				xm.Put("colvisible", "Visible")
				xm.Put("colactive", "Active")
				xm.Put("colontable", "On Table")
				xm.Put("colindexed", "Indexed")
				
				Dim acont As VMContainer
				acont.Initialize(vue, "abc", module).SetTag("div")
				acont.NoGutters = True
				acont.SetFluid(True)
				Dim colPos As Int = 0
				For Each k As String In xm.keys
					Dim v As String = xm.Get(k)
					Dim vmodel As String = $"${nc.vmodel}${k}"$
					colPos = colPos + 1
					'
					Dim sw As VMCheckBox
					sw.Initialize(vue, "sw" & k, module).SetStatic(True).SetVModel(vmodel).SetSwitch
					sw.Setlabel(v).SetTrueValue("Yes").SetFalseValue("No").SetHideDetails(True).SetFieldType("string")
					sw.RemoveAttr("ref").SetDense(True).SetInset(True)
					acont.AddControlS(sw.CheckBox, sw.ToString, 1, colPos, 6, 6, 6, 6)
					vue.SetData(vmodel, "No")
				Next
				bcont.AddComponent(1, 1, acont.tostring)
				'matrix location
				Dim mcont As VMContainer
				mcont.Initialize(vue, "size" & nc.vmodel, module).SetTag("div")
				mcont.NoGutters = True
				mcont.SetFluid(True)
					'
				Dim rw As VMTextField = AddTextField("colrow", $"${nc.vmodel}colrow"$, "Row")
				mcont.AddControlS(rw.TextField, rw.ToString, 1, 1, 6, 6, 6, 6)
				'
				Dim cl As VMTextField = AddTextField("colcolumn", $"${nc.vmodel}colcolumn"$, "Col")
				mcont.AddControlS(cl.TextField, cl.ToString, 1, 2, 6, 6, 6, 6)
					'
				Dim os As VMTextField = AddTextField("coloffsetsmall", $"${nc.vmodel}coloffsetsmall"$, "OS")
				mcont.AddControlS(os.TextField, os.ToString, 2, 1, 3, 3, 3, 3)
					'
				Dim om As VMTextField = AddTextField("coloffsetmedium", $"${nc.vmodel}coloffsetmedium"$, "OM")
				mcont.AddControlS(om.TextField, om.ToString, 2, 2, 3, 3, 3, 3)
					'
				Dim ol As VMTextField = AddTextField("coloffsetlarge", $"${nc.vmodel}coloffsetlarge"$, "OL")
				mcont.AddControlS(ol.TextField, ol.ToString, 2, 3, 3, 3, 3, 3)
					'
				Dim oxl As VMTextField = AddTextField("coloffsetxlarge", $"${nc.vmodel}coloffsetxlarge"$,"OL")
				mcont.AddControlS(oxl.TextField, oxl.ToString, 2, 4, 3, 3, 3, 3)
				'
				Dim ss As VMTextField = AddTextField("colsizesmall", $"${nc.vmodel}colsizesmall"$,"SS")
				mcont.AddControlS(ss.TextField, ss.ToString, 3, 1, 3, 3, 3, 3)
					'
				Dim sm As VMTextField = AddTextField("colsizemedium", $"${nc.vmodel}colsizemedium"$, "SM")
				mcont.AddControlS(sm.TextField, sm.ToString, 3, 2, 3, 3, 3, 3)
					'
				Dim sl As VMTextField = AddTextField("colsizelarge", $"${nc.vmodel}colsizelarge"$, "SL")
				mcont.AddControlS(sl.TextField, sl.ToString, 3, 3, 3, 3, 3, 3)
					'
				Dim sxl As VMTextField = AddTextField("colsizexlarge", $"${nc.vmodel}colsizexlarge"$, "SX")
				mcont.AddControlS(sxl.TextField, sxl.ToString, 3, 4, 3, 3, 3, 3)
				'
				bcont.AddComponent(1, 1, mcont.tostring)
				expanel.Container.AddControlS(bcont.Container, bcont.ToString, 1, 1, 12, 12, 12, 12)
			Case "toolbaritems"
				itemtypes.Initialize 
				nc.vmodel = "items"
				Dim bcont As VMContainer
				bcont.Initialize(vue, "tx" & nc.vmodel, module).SetStatic(True).SetTag("div").NoGutters = True
				bcont.SetFluid(True)
				bcont.AddRows(2).AddColumns12
				'add a toolbar
				Dim tblx As VMToolBar = CreateToolbar("t" & nc.vmodel, Me).SetStatic(True)
				tblx.SetDense(True).AddSpacer.SetElevation("1")
				tblx.AddIcon("btnAddTable", "mdi-plus", "Add item", "")
				tblx.AddIcon("btnSaveTable", "save", "Save item", "")
				tblx.AddIcon("btnDeleteTable", "delete", "Delete item", "")
				tblx.AddIcon("btnEmpty","mdi-delete-empty-outline", "Empty items", "")
				bcont.AddComponent(1, 1, tblx.tostring)
				'add input controls
				Dim tcont As VMContainer
				tcont.Initialize(vue, "tbl" & nc.vmodel, module).SetTag("div").SetStatic(True)
				tcont.NoGutters = True
				tcont.SetFluid(True)
				tcont.SetElevation("1")
				'
				nc.options.Initialize 
				nc.options.Put("key", "Item Key")
				nc.options.Put("icon", "Icon Name")
				nc.options.Put("iconcolor", "Color")
				nc.options.Put("title", "Title")
				nc.options.Put("subtitle", "Tooltip")
				nc.options.Put("badge", "Badge")
				'
				Dim rg As VMRadioGroup
				rg.Initialize(vue, "rg" & nc.vmodel, module).SetStatic(True).SetVModel("itemsitemtype").Setlabel("Type")
				rg.SetOptions(CreateMap("menu":"Menu","btn":"Button","icon":"Icon"))
				vue.SetData("itemsitemtype", "icon")
				rg.SetDense(True).SetRow(True).RemoveAttr("ref").SetHideDetails(True).AddClass("my-2")
				tcont.AddControlS(rg.RadioGroup, rg.ToString, 1, 1, 12, 12, 12, 12)
				itemtypes.put("itemtype","String")
				'
				Dim rowPos As Int = 2
				Dim colPos As Int = 0
				For Each k As String In nc.options.Keys
					Dim v As String = nc.options.Get(k)
					'store for later retrieval
					colPos = colPos + 1
					If colPos = 3 Then
						rowPos = rowPos + 1
						colPos = 1
					End If
					'
					Dim vmodel As String = $"${nc.vmodel}${k}"$
					Dim tw As VMTextField
					tw.Initialize(vue, vmodel, module).SetStatic(True).Setlabel(v)
					tw.SetVModel(vmodel).SetType("text").RemoveAttr("ref").SetDense(True).SetOutlined(True)
					tw.SetHideDetails(True).AddClass("my-2").RemoveAttr("v-show")
					tcont.AddControlS(tw.TextField, tw.ToString, rowPos, colPos, 6, 6, 6, 6)
					itemtypes.put(k,"String")
				Next
				bcont.AddComponent(1, 1, tcont.tostring)
				'add a list
				Dim mItems As VMList = CreateList(nc.vmodel & "crud", Me).SetElevation("1")
				mItems.SetStatic(True)
				mItems.SetDataSourceTemplate1("tableitems", "key", "", "icon", "iconcolor", "title", "subtitle", "","","")
				Dim mList As String = mItems.tostring
				bcont.AddComponent(2, 1, mList)
				'
				expanel.Container.AddControlS(bcont.Container, bcont.ToString, 1, 1, 12, 12, 12, 12)
				
			Case "table"
				itemtypes.Initialize 
				Dim bcont As VMContainer
				bcont.Initialize(vue, "a" & nc.vmodel, module).SetStatic(True).SetTag("div").NoGutters = True
				bcont.SetFluid(True)
				bcont.AddRows(2).AddColumns12
				'add a toolbar
				Dim tblx As VMToolBar = CreateToolbar("t" & nc.vmodel, Me).SetStatic(True)
				tblx.SetDense(True).AddSpacer.SetElevation("1")
				tblx.AddIcon("btnAddTable", "mdi-plus", "Add item", "")
				tblx.AddIcon("btnSaveTable", "save", "Save item", "")
				tblx.AddIcon("btnDeleteTable", "delete", "Delete item", "")
				tblx.AddIcon("btnEmpty","mdi-delete-empty-outline", "Empty items", "")
				bcont.AddComponent(1, 1, tblx.tostring)
				'add input controls
				Dim tcont As VMContainer
				tcont.Initialize(vue, "tbl" & nc.vmodel, module).SetTag("div").SetStatic(True)
				tcont.NoGutters = True
				tcont.SetFluid(True)
				tcont.SetElevation("1")
				'
				Dim rowPos As Int = 1
				Dim colPos As Int = 0
				For Each k As String In nc.options.Keys
					Dim v As String = nc.options.Get(k)
					'store for later retrieval
					colPos = colPos + 1
					If colPos = 3 Then
						rowPos = rowPos + 1
						colPos = 1
					End If
					'
					Dim vmodel As String = $"${nc.vmodel}${k}"$
					Dim tw As VMTextField
					tw.Initialize(vue, vmodel, module).SetStatic(True).Setlabel(v)
					tw.SetVModel(vmodel).SetType("text").RemoveAttr("ref").SetDense(True).SetOutlined(True)
					tw.SetHideDetails(True).AddClass("my-2").RemoveAttr("v-show")
					tcont.AddControlS(tw.TextField, tw.ToString, rowPos, colPos, 6, 6, 6, 6)
					itemtypes.put(k,"String")
				Next
				bcont.AddComponent(1, 1, tcont.tostring)
				'add a list
				Dim mItems As VMList = CreateList(nc.vmodel & "crud", Me).SetElevation("1")
				mItems.SetStatic(True)
				mItems.SetDataSourceTemplate1("tableitems", "key", "avatar", "icon", "iconcolor", "title", "subtitle", "subtitle1", "action", "actioncolor")
				Dim mList As String = mItems.tostring
				bcont.AddComponent(2, 1, mList)
				'
				expanel.Container.AddControlS(bcont.Container, bcont.ToString, 1, 1, 12, 12, 12, 12)
			Case "switches"
				Dim acont As VMContainer
				acont.Initialize(vue, "a" & nc.vmodel, module).SetTag("div")
				acont.NoGutters = True
				acont.SetFluid(True)
				Dim colPos As Int = 0
				For Each k As String In nc.options.Keys
					Dim v As String = nc.options.Get(k)
					colPos = colPos + 1
						'
					Dim sw As VMCheckBox
					sw.Initialize(vue, "sw" & k, module).SetStatic(True).SetVModel(k).SetSwitch
					sw.Setlabel(v).SetTrueValue("Yes").SetFalseValue("No").SetHideDetails(True).SetFieldType("string")
					sw.RemoveAttr("ref").SetDense(True).SetOnChange(Me, "RaiseChangeEvent").SetInset(True)
					acont.AddControlS(sw.CheckBox, sw.ToString, 1, colPos, 6, 6, 6, 6)
					vue.SetData(k, "No")
				Next
				expanel.Container.AddControlS(acont.Container, acont.ToString, 1, 1, 12, 12, 12, 12)
			Case "select2"
				Dim tcont As VMContainer
				tcont.Initialize(vue, "", module).SetTag("div")
				tcont.NoGutters = True
				tcont.SetFluid(True)
					'
				sText.Add(nc.vmodel)
				sText.Add(nc.vmodel1)
				
				Dim cbo As VMSelect
				cbo.Initialize(vue, "cbo" & nc.vmodel, module).SetStatic(True).Setlabel(nc.Text).SetVModel(nc.vmodel)
				cbo.SetOptions(nc.sourceName, nc.options, nc.sourcefield, nc.displayField, False).RemoveAttr("ref").SetDense(True)
				cbo.SetOutlined(True).SetHideDetails(True).AddClass("my-2").SetVShow(nc.vmodel & "show")
				cbo.SetOnChange(Me, "RaiseChangeEvent")
				vue.SetData(nc.vmodel & "show", True)
				tcont.AddControlS(cbo.Combo, cbo.ToString, 1, 1, 6, 6, 6, 6)
					'
				Dim cbo1 As VMSelect
				cbo1.Initialize(vue, "cbo" & nc.vmodel1, module).SetStatic(True).Setlabel(nc.Text1).SetVModel(nc.vmodel1)
				cbo1.SetOptions(nc.sourceName1, nc.options1, nc.sourcefield1, nc.displayField1, False).RemoveAttr("ref").SetDense(True)
				cbo1.SetOutlined(True).SetHideDetails(True).AddClass("my-2").SetVShow(nc.vmodel1 & "show")
				cbo1.SetOnChange(Me, "RaiseChangeEvent")
				vue.SetData(nc.vmodel1 & "show", True)
				tcont.AddControlS(cbo1.Combo, cbo1.ToString, 1, 2, 6, 6, 6, 6)
				
				expanel.Container.AddControlS(tcont.Container, tcont.ToString, 1, 1, 12, 12, 12, 12)

			Case "text2"
				Dim tcont As VMContainer
				tcont.Initialize(vue, "t" & nc.vmodel, module).SetTag("div")
				tcont.NoGutters = True
				tcont.SetFluid(True)
				Dim colSize As Int
				Dim m As Map = nc.options
				Dim tTot As Int = m.Size
				Select Case tTot
				Case 1
					colSize = 12
				Case 2
					colSize = 6
				Case 3
					colSize = 4
				Case 4
					colSize = 3
				Case 6
					colSize = 2
				Case Else
					Log("VMProperty.MultiText - item sizes should be 1, 2, 3, 4, 6")
				End Select
				'
				Dim colPos As Int = 0
				For Each k As String In nc.options.Keys
					Dim v As String = nc.options.Get(k)
					colPos = colPos + 1
					'
					Dim tw As VMTextField
					tw.Initialize(vue, k, module).SetStatic(True).Setlabel(v)
					tw.SetVModel(k).SetType("text").RemoveAttr("ref").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					tw.SetHideDetails(True).AddClass("my-2")
					tcont.AddControlS(tw.TextField, tw.ToString, 1, colPos, colSize, colSize, colSize, colSize)
				Next
				expanel.Container.AddControlS(tcont.Container, tcont.ToString, 1, 1, 12, 12, 12, 12)
			Case "widths"
				Dim wcont As VMContainer
				wcont.Initialize(vue, "w" & nc.vmodel, module).SetTag("div")
				wcont.NoGutters = True
				wcont.SetFluid(True)
				'
				Dim w1 As VMTextField
				w1.Initialize(vue, "txtwidth", module).SetStatic(True).Setlabel("Width")
				w1.SetVModel("width").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
				w1.SetHideDetails(True).AddClass("my-2")
				wcont.AddControlS(w1.TextField, w1.ToString, 1, 1, 4, 4, 4, 4)
				'
				Dim w2 As VMTextField
				w2.Initialize(vue, "txtminwidth", module).SetStatic(True).Setlabel("Min Width")
					w2.SetVModel("minwidth").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					w2.SetHideDetails(True).AddClass("my-2")
				wcont.AddControlS(w2.TextField, w2.ToString, 1, 2, 4, 4, 4, 4)
				'
				Dim w3 As VMTextField
				w3.Initialize(vue, "txtmaxwidth", module).SetStatic(True).Setlabel("Max Width")
					w3.SetVModel("maxwidth").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					w3.SetHideDetails(True).AddClass("my-2")
				wcont.AddControlS(w3.TextField, w3.ToString, 1, 3, 4, 4, 4, 4)
				'height
				Dim h1 As VMTextField
				h1.Initialize(vue, "txtheight", module).SetStatic(True).Setlabel("Height")
					h1.SetVModel("height").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					h1.SetHideDetails(True).AddClass("my-2")
				wcont.AddControlS(h1.TextField, h1.ToString, 2, 1, 4, 4, 4, 4)
					'
				Dim h2 As VMTextField
				h2.Initialize(vue, "txtminheight", module).SetStatic(True).Setlabel("Min Height")
					h2.SetVModel("minheight").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					h2.SetHideDetails(True).AddClass("my-2")
				wcont.AddControlS(h2.TextField, h2.ToString, 2, 2, 4, 4, 4, 4)
					'
				Dim h3 As VMTextField
				h3.Initialize(vue, "txtmaxheight", module).SetStatic(True).Setlabel("Max Height")
					h3.SetVModel("maxheight").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					h3.SetHideDetails(True).AddClass("my-2")
				wcont.AddControlS(h3.TextField, h3.ToString, 2, 3, 4, 4, 4, 4)
				'
				expanel.Container.AddControlS(wcont.Container, wcont.ToString, 1, 1, 12, 12, 12, 12)
				
			Case "container"
				nc.cont.NoGutters = True
				nc.cont.SetTag("div")
				nc.Cont.SetFluid(True)
				nc.cont.NoGutters = True
				expanel.Content.Container.AddControlS(nc.cont.Container, nc.cont.ToString, 1, 1, 12, 12, 12, 12)
			Case "sizes"
				Dim scont As VMContainer
				scont.Initialize(vue, "size" & nc.vmodel, module).SetTag("div")
				scont.NoGutters = True
				scont.SetFluid(True)
				'
				Dim rw As VMTextField
				rw.Initialize(vue, "txtrow", module).SetStatic(True).Setlabel("Row")
					rw.SetVModel("row").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					rw.SetHideDetails(True).AddClass("my-2")
				scont.AddControlS(rw.TextField, rw.ToString, 1, 1, 6, 6, 6, 6)
				'
				Dim cl As VMTextField
				cl.Initialize(vue, "txtcol", module).SetStatic(True).Setlabel("Col")
					cl.SetVModel("col").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					cl.SetHideDetails(True).AddClass("my-2")
				scont.AddControlS(cl.TextField, cl.ToString, 1, 2, 6, 6, 6, 6)
					'
				Dim os As VMTextField
				os.Initialize(vue, "txtoffsetsmall", module).SetStatic(True).Setlabel("OS")
					os.SetVModel("offsetsmall").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					os.SetHideDetails(True).AddClass("my-2")
				scont.AddControlS(os.TextField, os.ToString, 2, 1, 3, 3, 3, 3)
					'
				Dim om As VMTextField
				om.Initialize(vue, "txtoffsetmedium", module).SetStatic(True).Setlabel("OM")
					om.SetVModel("offsetmedium").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					om.SetHideDetails(True).AddClass("my-2")
				scont.AddControlS(om.TextField, om.ToString, 2, 2, 3, 3, 3, 3)
					'
				Dim ol As VMTextField
				ol.Initialize(vue, "txtoffsetlarge", module).SetStatic(True).Setlabel("OL")
					ol.SetVModel("offsetlarge").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					ol.SetHideDetails(True).AddClass("my-2")
				scont.AddControlS(ol.TextField, ol.ToString, 2, 3, 3, 3, 3, 3)
					'
				Dim oxl As VMTextField
				oxl.Initialize(vue, "txtoffsetxlarge", module).SetStatic(True).Setlabel("OX")
					oxl.SetVModel("offsetxlarge").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					oxl.SetHideDetails(True).AddClass("my-2")
				scont.AddControlS(oxl.TextField, oxl.ToString, 2, 4, 3, 3, 3, 3)
				'				
				Dim ss As VMTextField
				ss.Initialize(vue, "txtsizesmall", module).SetStatic(True).Setlabel("SS")
					ss.SetVModel("sizesmall").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					ss.SetHideDetails(True).AddClass("my-2")
				scont.AddControlS(ss.TextField, ss.ToString, 3, 1, 3, 3, 3, 3)
				'
				Dim sm As VMTextField
				sm.Initialize(vue, "txtsizemedium", module).SetStatic(True).Setlabel("SM")
					sm.SetVModel("sizemedium").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					sm.SetHideDetails(True).AddClass("my-2")
				scont.AddControlS(sm.TextField, sm.ToString, 3, 2, 3, 3, 3, 3)
				'
				Dim sl As VMTextField
				sl.Initialize(vue, "txtsizelarge", module).SetStatic(True).Setlabel("SL")
					sl.SetVModel("sizelarge").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					sl.SetHideDetails(True).AddClass("my-2")
				scont.AddControlS(sl.TextField, sl.ToString, 3, 3, 3, 3, 3, 3)
				'
				Dim sxl As VMTextField
				sxl.Initialize(vue, "txtsizexlarge", module).SetStatic(True).Setlabel("SX")
					sxl.SetVModel("sizexlarge").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True).SetOnChange(Me, "RaiseChangeEvent")
					sxl.SetHideDetails(True).AddClass("my-2")
				scont.AddControlS(sxl.TextField, sxl.ToString, 3, 4, 3, 3, 3, 3)
				'
				expanel.Content.Container.AddControlS(scont.Container, scont.ToString, 1, 1, 12, 12, 12, 12)
			Case "selectbox"
				sText.Add(nc.vmodel)
				Dim cbo As VMSelect
				cbo.Initialize(vue, "cbo" & nc.vmodel, module)
				cbo.SetStatic(True)
				cbo.Setlabel(nc.Text)
				cbo.SetVModel(nc.vmodel)
				cbo.SetOptions(nc.sourceName, nc.options, nc.sourcefield, nc.displayField, False)
				cbo.RemoveAttr("ref")
				cbo.SetDense(True)
				cbo.SetOutlined(True)
				cbo.SetHideDetails(True)
				cbo.AddClass("my-2")
				cbo.SetVShow(nc.vmodel & "show")
				cbo.SetOnChange(Me, "RaiseChangeEvent")
				vue.SetData(nc.vmodel & "show", True)
				Dim scombo As String = cbo.tostring
				expanel.Content.Container.AddControlS(cbo.Combo, scombo, 1, 1, 12, 12, 12, 12)
			Case "selectboxm"
				sText.Add(nc.vmodel)
				Dim cbo As VMSelect
				cbo.Initialize(vue, "cbo" & nc.vmodel, module)
				cbo.SetStatic(True)
				cbo.Setlabel(nc.Text)
				cbo.SetVModel(nc.vmodel)
				cbo.SetOptions(nc.sourceName, nc.options, nc.sourcefield, nc.displayField, False)
				cbo.RemoveAttr("ref")
				cbo.SetDense(True)
				cbo.SetOutlined(True)
				cbo.SetHideDetails(True)
				cbo.AddClass("my-2")
				cbo.SetVShow(nc.vmodel & "show")
				cbo.SetOnChange(Me, "RaiseChangeEvent")
				cbo.SetMultiple(True)
				cbo.SetChips(True)
				cbo.SetDeletableChips(True)
				cbo.SetSmallChips(True)
				vue.SetData(nc.vmodel & "show", True)
				Dim scombo As String = cbo.tostring
				expanel.Content.Container.AddControlS(cbo.Combo, scombo, 1, 1, 12, 12, 12, 12)
			Case "button"
				Dim btnx As VMButton
				btnx.Initialize(vue, nc.value, module)
				btnx.SetLabel(nc.text)
				btnx.SetRaised(True)
				btnx.SetPrimary(True)
				btnx.SetBlock(True)
				btnx.RemoveAttr("ref")
				btnx.AddClass("my-2")
				btnx.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				If nc.methodName <> "" Then btnx.SetOnClick(nc.methodName)
				expanel.Content.Container.AddControlS(btnx.Button, btnx.ToString, 1, 1, 12, 12, 12, 12)
			Case "slider"
				Dim sld As VMSlider
				sld.Initialize(vue, "sld" & nc.vmodel, module)
				sld.Setmin(nc.MinValue)
				sld.Setmax(nc.MaxValue)
				sld.Setlabel(nc.text)
				sld.SetVModel(nc.vmodel)
				sld.SetThumbLabel("always")
				sld.SetHideDetails(True)
				vue.SetData(nc.vmodel, nc.value)
				sld.RemoveAttr("ref")
				sld.SetDense(True)
				sld.SetVShow(nc.vmodel & "show")
				sld.SetOnClick("RaiseChangeEvent")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(sld.Slider, sld.ToString, 1, 1, 12, 12, 12, 12)
				sText.Add(nc.vmodel)
			Case "label"
				Dim lbl As VMLabel
				lbl.Initialize(vue, "lbl" & nc.vmodel)
				lbl.SetTag("p")
				lbl.SetVModel(nc.vmodel, nc.text)
				lbl.RemoveAttr("ref")
				lbl.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(lbl.label, lbl.ToString, 1, 1, 12, 12, 12, 12)
				sText.Add(nc.vmodel)
			Case "switch"
				Dim sw As VMCheckBox
				sw.Initialize(vue, "sw" & nc.vmodel, module).SetSwitch
				sw.SetVModel(nc.vmodel)
				sw.Setlabel(nc.text)
				sw.SetTrueValue(nc.value)
				sw.SetFalseValue("No")
				sw.SetHideDetails(True)
				vue.SetData(nc.vmodel, "No")
				defaults.Put(nc.vModel,"No")
				sw.RemoveAttr("ref")
				sw.SetDense(True)
				sw.SetVShow(nc.vmodel & "show")
				sw.SetOnChange(Me,"RaiseChangeEvent")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(sw.CheckBox, sw.ToString, 1, 1, 12, 12, 12, 12)
				bText.Add(nc.vmodel)
			Case "iconbutton"
				Dim btnicon As VMButton
				btnicon.Initialize(vue, nc.value, module)
				btnicon.SetIconButton(nc.iconName)
				If nc.methodName <> "" Then btnicon.SetOnClick(nc.methodName)
				btnicon.RemoveAttr("ref")
				btnicon.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(btnicon.Button, btnicon.ToString, 1, 1, 12, 12, 12, 12)
			Case "password"
				Dim pwd As VMTextField = BuildTextField(nc)
				pwd.SetPassword(True, True)
				pwd.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				pwd.SetOnChange(Me, "RaiseChangeEvent")
				expanel.Container.AddControlS(pwd.TextField, pwd.ToString, 1, 1, 12, 12, 12, 12)
			Case "text"
				Dim text As VMTextField = BuildTextField(nc)
				text.SetType("text")
				text.SetVShow(nc.vmodel & "show")
				text.SetOnChange(Me, "RaiseChangeEvent")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(text.TextField, text.ToString, 1, 1, 12, 12, 12, 12)
			Case "number"
				Dim numx As VMTextField = BuildTextField(nc)
				numx.SetType("number")
				numx.SetVShow(nc.vmodel & "show")
				numx.SetOnChange(Me, "RaiseChangeEvent")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(numx.TextField, numx.ToString, 1, 1, 12, 12, 12, 12)
			Case "tel"
				Dim tel As VMTextField = BuildTextField(nc)
				tel.SetType("tel")
				tel.SetVShow(nc.vmodel & "show")
				tel.SetOnChange(Me, "RaiseChangeEvent")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(tel.TextField, tel.ToString, 1, 1, 12, 12, 12, 12)
			Case "email"
				Dim email As VMTextField = BuildTextField(nc)
				email.SetType("email")
				email.SetVShow(nc.vmodel & "show")
				email.SetOnChange(Me, "RaiseChangeEvent")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(email.TextField, email.ToString, 1, 1, 12, 12, 12, 12)
			Case "textarea"
				Dim txta As VMTextField
				txta.Initialize(vue, "ta" & nc.vmodel, module)
				txta.SetTextArea
				txta.SetClearable(True)
				txta.Setlabel(nc.text)
				txta.SetAutoGrow(True)
				txta.SetVModel(nc.vmodel)
				txta.SetDense(True)
				txta.RemoveAttr("ref")
				txta.SetOutlined(True)
				txta.SetVShow(nc.vmodel & "show")
				txta.SetHideDetails(True)
				txta.AddClass("my-2")
				txta.SetOnChange(Me, "RaiseChangeEvent")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(txta.TextField, txta.ToString, 1, 1, 12, 12, 12, 12)
			Case "checkbox"
				Dim chk As VMCheckBox
				chk.Initialize(vue, "chk" & nc.vmodel, module)
				chk.SetStatic(True)
				chk.SetVModel(nc.vmodel)
				chk.SetTrueValue(nc.value)
				chk.Setlabel(nc.text)
				chk.SetHideDetails(True)
				chk.SetFalseValue("No")
				vue.SetData(nc.vmodel, "No")
				defaults.Put(nc.vModel,"No")
				chk.SetDense(True)
				chk.RemoveAttr("ref")
				chk.SetVShow(nc.vmodel & "show")
				chk.SetOnChange(Me, "RaiseChangeEvent")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(chk.CheckBox, chk.ToString, 1, 1, 12, 12, 12, 12)
				bText.Add(nc.vmodel)
			Case "radiogroup"
				Dim rg As VMRadioGroup
				rg.Initialize(vue, "rd" & nc.vmodel, module)
				rg.SetStatic(True)
				rg.SetVModel(nc.vmodel)
				rg.Setlabel(nc.text)
				rg.SetOptions(nc.options)
				vue.SetData(nc.vmodel, nc.value)
				rg.SetDense(True)
				rg.SetRow(nc.horizontal)
				rg.RemoveAttr("ref")
				rg.SetVShow(nc.vmodel & "show")
				rg.SetOnChange(Me, "RaiseChangeEvent")
				rg.SetHideDetails(True)
				rg.AddClass("my-2")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(rg.RadioGroup, rg.ToString, 1, 1, 12, 12, 12, 12)
				sText.Add(nc.vmodel)
			Case "timepicker"
				Dim tp As VMDateTimePicker
				tp.Initialize(vue, "tp" & nc.vmodel, module).SetTimePicker 
				tp.SetStatic(True) 
				tp.Setlabel(nc.text)
				tp.SetVModel(nc.vmodel)
				tp.SetForInput
				vue.SetData(nc.vmodel, nc.value)
				tp.RemoveAttr("ref")
				tp.SetDense(True)
				tp.SetOutlined(True)
				tp.SetVShow(nc.vmodel & "show")
				tp.SetOnChange(Me, "RaiseChangeEvent")
				tp.SetHideDetails(True)
				tp.TextField.AddClass("my-2")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(tp.DateTimePicker, tp.ToString, 1, 1, 12, 12, 12, 12)
				sText.Add(nc.vmodel)
			Case "datepicker"
				Dim dp As VMDateTimePicker
				dp.Initialize(vue, "dp" & nc.vmodel, module)
				dp.SetStatic(True)
				dp.Setlabel(nc.text)
				dp.SetVModel(nc.vmodel)
				dp.SetForInput
				vue.SetData(nc.vmodel, nc.value)
				dp.RemoveAttr("ref")
				dp.SetDense(True)
				dp.SetOutlined(True)
				dp.SetVShow(nc.vmodel & "show")
				dp.SetOnChange(Me, "RaiseChangeEvent")
				dp.SetHideDetails(True)
				dp.TextField.AddClass("my-2")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(dp.DateTimePicker, dp.ToString, 1, 1, 12, 12, 12, 12)
				sText.Add(nc.vmodel)
			End Select
		Next
		expnl.addpanel(expanel)
	Next
	Return expnl.tostring
End Sub

Sub NewTextArea(tID As String, tvModel As String, tLabel As String) As VMTextField
	Dim txta As VMTextField
	txta.Initialize(vue, tID, module)
	txta.SetTextArea
	txta.SetClearable(True)
	txta.Setlabel(tLabel)
	txta.SetAutoGrow(True)
	txta.SetVModel(tvModel)
	txta.SetDense(True)
	txta.RemoveAttr("ref")
	txta.SetOutlined(True)
	txta.SetHideDetails(True)
	txta.AddClass("my-2")
	Return txta
End Sub

Sub AddTextField(tID As String, tVModel As String, tLabel As String) As VMTextField
	Dim t As VMTextField
	t.Initialize(vue, tID, module)
	t.SetStatic(True)
	t.Setlabel(tLabel)
	t.SetVModel(tVModel)
	t.SetType("text")
	t.RemoveAttr("ref")
	t.SetDense(True)
	t.SetOutlined(True)
	t.SetHideDetails(True)
	t.AddClass("my-2")
	Return t
End Sub

Sub ShowItem(item As String)
	item = item.ToLowerCase & "show"
	vue.SetData(item, True)
End Sub

Sub HideItem(item As String)
	item = item.ToLowerCase & "show"
	vue.SetData(item, False)
End Sub

Sub AddCheck1(pcont As VMContainer, r As Int, c As Int, k As String, v As String)
	Dim chk As VMCheckBox = BuildCheckBox(k, v)
	chk.SetOnChange(Me, "RaiseChangeEvent")
	bText.Add(k)
	pcont.AddControlS(chk.CheckBox, chk.ToString, r, c, 6, 6, 6, 6)
End Sub

Sub AddSwitch1(pcont As VMContainer, r As Int, c As Int, k As String, v As String)
	Dim chk As VMCheckBox = BuildSwitch(k, v)
	chk.SetOnChange(Me, "RaiseChangeEvent")
	bText.Add(k)
	pcont.AddControlS(chk.CheckBox, chk.ToString, r, c, 6, 6, 6, 6)
End Sub

Sub AddCheck2(r As Int, c As Int, k As String, v As String)
	Dim chk As VMCheckBox = BuildCheckBox(k, v)
	chk.SetOnChange(Me, "RaiseChangeEvent")
	bText.Add(k)
	contChecks.AddControlS(chk.CheckBox, chk.ToString, r, c, 6, 6, 6, 6)
	hasChecks = True
End Sub

Sub AddSwitch2(r As Int, c As Int, k As String, v As String)
	Dim chk As VMCheckBox = BuildSwitch(k, v)
	chk.SetOnChange(Me, "RaiseChangeEvent")
	bText.Add(k)
	contChecks.AddControlS(chk.CheckBox, chk.ToString, r, c, 6, 6, 6, 6)
	hasChecks = True
End Sub

private Sub BuildTextField(nc As PropControls) As VMTextField
	Dim el As VMTextField
	el.Initialize(vue, "txt" & nc.vmodel, module)
	el.SetStatic(True)
	el.Setlabel(nc.text)
	el.SetVModel(nc.vmodel)
	el.SetType("text")
	el.RemoveAttr("ref")
	el.SetDense(True)
	el.SetOutlined(True)
	el.SetHideDetails(True)
	el.AddClass("my-2")
	Return el
End Sub

private Sub BuildCheckBox(k As String, v As String) As VMCheckBox
	Dim chk As VMCheckBox
	chk.Initialize(vue, "chk" & k, module)
	chk.SetStatic(True)
	chk.SetVModel(k)
	chk.SetTrueValue("Yes")
	chk.Setlabel(v)
	chk.SetFalseValue("No")
	chk.SetHideDetails(True)
	chk.SetDense(True)
	vue.SetData(k, "No")
	defaults.Put(k,"No")
	fields.Add(k)
	Strings.Add(k)
	chk.RemoveAttr("ref")
	Return chk
End Sub

private Sub BuildSwitch(k As String, v As String) As VMCheckBox
	Dim sw As VMCheckBox
	sw.Initialize(vue, "sw" & k, module).SetSwitch
	sw.SetVModel(k)
	sw.Setlabel(v)
	sw.SetTrueValue("Yes")
	sw.SetFalseValue("No")
	sw.SetHideDetails(True)
	sw.SetInset(True)
	sw.SetFieldType("string")
	vue.SetData(k, "No")
	defaults.Put(k,"No")
	fields.Add(k)
	Strings.Add(k)
	sw.RemoveAttr("ref")
	sw.SetDense(True)
	Return sw
End Sub

Sub AddSwitches(parent As String, options As Map)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = "switches"
	nc.text = "Switches"
	nc.value = ""
	nc.typeOf = "switches"
	nc.options = options
	existing.Add(nc)
	controls.Put(parent, existing)
	'
	For Each k As String In options.keys
		fields.Add(k)
		defaults.Put(k, "No")
		sText.Add(k)
		Strings.Add(k)
		vue.SetData(k, "No")
	Next
End Sub