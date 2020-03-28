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
	Type PropControls(vmodel As String, value As String, text As String, typeOf As String, module As Object, methodName As String, _
	iconName As String, MinValue As Int, MaxValue As Int, sourceName As String, options As Map, sourcefield As String, displayfield As String, OptionsList As List, cont As VMContainer)
	Dim sshow As String
	Private contChecks As VMContainer
	Private hasChecks As Boolean
	Private xmodel As String
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
	contChecks.Initialize(vue, "checks", module).SetFluid(True)
	xmodel = ""
	Return Me
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

Sub SetVModel(vmodel As String) As VMProperty
	vmodel = vmodel.ToLowerCase
	expnl.SetVModel(vmodel)
	vue.SetData(vmodel, 0)
	xmodel = vmodel
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
	nc.options = vue.CopyMap(options, Array("*"))
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
	vue.SetData(xmodel,0)
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
	nc.options = vue.CopyMap(options, Array("*"))
	nc.sourcefield = sourcefield
	nc.displayfield = displayfield
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Strings.Add(vmodel)
	defaults.Put(vmodel,"")
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
			vue.SetData(nc.vmodel, Null)
			Select Case nc.typeOf
			Case "widths"
				Dim wcont As VMContainer
				wcont.Initialize(vue, "w" & nc.vmodel, module).SetTag("div")
				wcont.NoGutters = True
				wcont.SetFluid(True)
				'
				Dim w1 As VMTextField
				w1.Initialize(vue, "txtwidth", module).SetStatic(True).SetClearable(True).Setlabel("Width")
				w1.SetVModel("width").SetDense(True).SetOutlined(True)
				wcont.AddControlS(w1.TextField, w1.ToString, 1, 1, 4, 4, 4, 4)
				'
				Dim w2 As VMTextField
				w2.Initialize(vue, "txtminwidth", module).SetStatic(True).SetClearable(True).Setlabel("Min Width")
				w2.SetVModel("minwidth").SetDense(True).SetOutlined(True)
				wcont.AddControlS(w2.TextField, w2.ToString, 1, 2, 4, 4, 4, 4)
				'
				Dim w3 As VMTextField
				w3.Initialize(vue, "txtmaxwidth", module).SetStatic(True).SetClearable(True).Setlabel("Max Width")
				w3.SetVModel("maxwidth").SetDense(True).SetOutlined(True)
				wcont.AddControlS(w3.TextField, w3.ToString, 1, 3, 4, 4, 4, 4)
				'height
				Dim h1 As VMTextField
				h1.Initialize(vue, "txtheight", module).SetStatic(True).SetClearable(True).Setlabel("Height")
				h1.SetVModel("height").SetDense(True).SetOutlined(True)
				wcont.AddControlS(h1.TextField, h1.ToString, 2, 1, 4, 4, 4, 4)
					'
				Dim h2 As VMTextField
				h2.Initialize(vue, "txtminheight", module).SetStatic(True).SetClearable(True).Setlabel("Min Height")
				h2.SetVModel("minheight").SetDense(True).SetOutlined(True)
				wcont.AddControlS(h2.TextField, h2.ToString, 2, 2, 4, 4, 4, 4)
					'
				Dim h3 As VMTextField
				h3.Initialize(vue, "txtmaxheight", module).SetStatic(True).SetClearable(True).Setlabel("Max Height")
				h3.SetVModel("maxheight").SetDense(True).SetOutlined(True)
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
				rw.Initialize(vue, "txtrow", module).SetStatic(True).SetClearable(True).Setlabel("Row")
				rw.SetVModel("row").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True)
				scont.AddControlS(rw.TextField, rw.ToString, 1, 1, 6, 6, 6, 6)
				'
				Dim cl As VMTextField
				cl.Initialize(vue, "txtcol", module).SetStatic(True).SetClearable(True).Setlabel("Col")
				cl.SetVModel("col").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True)
				scont.AddControlS(cl.TextField, cl.ToString, 1, 2, 6, 6, 6, 6)
					'
				Dim os As VMTextField
				os.Initialize(vue, "txtoffsetsmall", module).SetStatic(True).SetClearable(True).Setlabel("Offset Small")
				os.SetVModel("offsetsmall").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True)
				scont.AddControlS(os.TextField, os.ToString, 2, 1, 6, 6, 6, 6)
					'
				Dim om As VMTextField
				om.Initialize(vue, "txtoffsetmedium", module).SetStatic(True).SetClearable(True).Setlabel("Offset Medium")
				om.SetVModel("offsetmedium").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True)
				scont.AddControlS(om.TextField, om.ToString, 2, 2, 6, 6, 6, 6)
					'
				Dim ol As VMTextField
				ol.Initialize(vue, "txtoffsetlarge", module).SetStatic(True).SetClearable(True).Setlabel("Offset Large")
				ol.SetVModel("offsetlarge").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True)
				scont.AddControlS(ol.TextField, ol.ToString, 3, 1, 6, 6, 6, 6)
					'
				Dim oxl As VMTextField
				oxl.Initialize(vue, "txtoffsetxlarge", module).SetStatic(True).SetClearable(True).Setlabel("Offset XLarge")
				oxl.SetVModel("offsetxlarge").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True)
				scont.AddControlS(oxl.TextField, oxl.ToString, 3, 2, 6, 6, 6, 6)
				'				
				Dim ss As VMTextField
				ss.Initialize(vue, "txtsizesmall", module).SetStatic(True).SetClearable(True).Setlabel("Size Small")
				ss.SetVModel("sizesmall").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True)
				scont.AddControlS(ss.TextField, ss.ToString, 4, 1, 6, 6, 6, 6)
				'
				Dim sm As VMTextField
				sm.Initialize(vue, "txtsizemedium", module).SetStatic(True).SetClearable(True).Setlabel("Size Medium")
				sm.SetVModel("sizemedium").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True)
				scont.AddControlS(sm.TextField, sm.ToString, 4, 2, 6, 6, 6, 6)
				'
				Dim sl As VMTextField
				sl.Initialize(vue, "txtsizelarge", module).SetStatic(True).SetClearable(True).Setlabel("Size Large")
				sl.SetVModel("sizelarge").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True)
				scont.AddControlS(sl.TextField, sl.ToString, 5, 1, 6, 6, 6, 6)
				'
				Dim sxl As VMTextField
				sxl.Initialize(vue, "txtsizexlarge", module).SetStatic(True).SetClearable(True).Setlabel("Size XLarge")
				sxl.SetVModel("sizexlarge").SetType("number").RemoveAttr("ref").SetDense(True).SetOutlined(True)
				scont.AddControlS(sxl.TextField, sxl.ToString, 5, 2, 6, 6, 6, 6)
				'
				expanel.Content.Container.AddControlS(scont.Container, scont.ToString, 1, 1, 12, 12, 12, 12)
			Case "selectbox"
				Dim cbo As VMSelect
				cbo.Initialize(vue, "cbo" & nc.vmodel, module)
				cbo.SetStatic(True)
				cbo.Setlabel(nc.Text)
				cbo.SetVModel(nc.vmodel)
				cbo.SetOptions(nc.sourceName, nc.options, nc.sourcefield, nc.displayField, False)
				cbo.RemoveAttr("ref")
				cbo.SetDense(True)
				cbo.SetOutlined(True)
				cbo.SetReturnObject(False)
				cbo.SetVShow(nc.vmodel & "show")
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
				vue.SetData(nc.vmodel, nc.value)
				sld.RemoveAttr("ref")
				sld.SetDense(True)
				sld.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(sld.Slider, sld.ToString, 1, 1, 12, 12, 12, 12)
			Case "label"
				Dim lbl As VMLabel
				lbl.Initialize(vue, "lbl" & nc.vmodel)
				lbl.SetTag("p")
				lbl.SetVModel(nc.vmodel, nc.text)
				lbl.RemoveAttr("ref")
				lbl.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(lbl.label, lbl.ToString, 1, 1, 12, 12, 12, 12)
			Case "switch"
				Dim sw As VMCheckBox
				sw.Initialize(vue, "sw" & nc.vmodel, module).SetSwitch
				sw.SetVModel(nc.vmodel)
				sw.Setlabel(nc.text)
				sw.SetValue(nc.value)
				sw.SetUncheckedValue("No")
				vue.SetData(nc.vmodel, "No")
				defaults.Put(nc.vModel,"No")
				sw.RemoveAttr("ref")
				sw.SetDense(True)
				sw.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(sw.CheckBox, sw.ToString, 1, 1, 12, 12, 12, 12)
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
				expanel.Container.AddControlS(pwd.TextField, pwd.ToString, 1, 1, 12, 12, 12, 12)
			Case "text"
				Dim text As VMTextField = BuildTextField(nc)
				text.SetType("text")
				text.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(text.TextField, text.ToString, 1, 1, 12, 12, 12, 12)
			Case "number"
				Dim numx As VMTextField = BuildTextField(nc)
				numx.SetType("number")
				numx.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(numx.TextField, numx.ToString, 1, 1, 12, 12, 12, 12)
			Case "tel"
				Dim tel As VMTextField = BuildTextField(nc)
				tel.SetType("tel")
				tel.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(tel.TextField, tel.ToString, 1, 1, 12, 12, 12, 12)
			Case "email"
				Dim email As VMTextField = BuildTextField(nc)
				email.SetType("email")
				email.SetVShow(nc.vmodel & "show")
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
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(txta.TextField, txta.ToString, 1, 1, 12, 12, 12, 12)
			Case "checkbox"
				Dim chk As VMCheckBox
				chk.Initialize(vue, "chk" & nc.vmodel, module)
				chk.SetStatic(True)
				chk.SetVModel(nc.vmodel)
				chk.SetValue(nc.value)
				chk.Setlabel(nc.text)
				chk.SetUncheckedValue("No")
				vue.SetData(nc.vmodel, "No")
				defaults.Put(nc.vModel,"No")
				chk.SetDense(True)
				chk.RemoveAttr("ref")
				chk.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(chk.CheckBox, chk.ToString, 1, 1, 12, 12, 12, 12)
			Case "radiogroup"
				Dim rg As VMRadioGroup
				rg.Initialize(vue, "rd" & nc.vmodel, module)
				rg.SetStatic(True)
				rg.SetVModel(nc.vmodel)
				rg.Setlabel(nc.text)
				rg.SetOptions(nc.options)
				vue.SetData(nc.vmodel, nc.value)
				rg.SetDense(True)
				rg.RemoveAttr("ref")
				rg.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(rg.RadioGroup, rg.ToString, 1, 1, 12, 12, 12, 12)
			Case "timepicker"
				Dim tp As VMDateTimePicker
				tp.Initialize(vue, "tp" & nc.vmodel, module).SetTimePicker 
				tp.SetStatic(True) 
				tp.Setlabel(nc.text)
				tp.SetVModel(nc.vmodel)
				tp.Setclearable(True)
				tp.SetForInput
				vue.SetData(nc.vmodel, nc.value)
				tp.RemoveAttr("ref")
				tp.SetDense(True)
				tp.SetOutlined(True)
				tp.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(tp.DateTimePicker, tp.ToString, 1, 1, 12, 12, 12, 12)
			Case "datepicker"
				Dim dp As VMDateTimePicker
				dp.Initialize(vue, "dp" & nc.vmodel, module)
				dp.SetStatic(True)
				dp.Setlabel(nc.text)
				dp.SetVModel(nc.vmodel)
				dp.Setclearable(True)
				dp.SetForInput
				vue.SetData(nc.vmodel, nc.value)
				dp.RemoveAttr("ref")
				dp.SetDense(True)
				dp.SetOutlined(True)
				dp.SetVShow(nc.vmodel & "show")
				vue.SetData(nc.vmodel & "show", True)
				expanel.Container.AddControlS(dp.DateTimePicker, dp.ToString, 1, 1, 12, 12, 12, 12)
			End Select
		Next
		expnl.addpanel(expanel)
	Next
	Return expnl.tostring
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
	pcont.AddControlS(chk.CheckBox, chk.ToString, r, c, 6, 6, 6, 6)
End Sub

Sub AddSwitch1(pcont As VMContainer, r As Int, c As Int, k As String, v As String)
	Dim chk As VMCheckBox = BuildSwitch(k, v)
	pcont.AddControlS(chk.CheckBox, chk.ToString, r, c, 6, 6, 6, 6)
End Sub

Sub AddCheck2(r As Int, c As Int, k As String, v As String)
	Dim chk As VMCheckBox = BuildCheckBox(k, v)
	contChecks.AddControlS(chk.CheckBox, chk.ToString, r, c, 6, 6, 6, 6)
	hasChecks = True
End Sub

Sub AddSwitch2(r As Int, c As Int, k As String, v As String)
	Dim chk As VMCheckBox = BuildSwitch(k, v)
	contChecks.AddControlS(chk.CheckBox, chk.ToString, r, c, 6, 6, 6, 6)
	hasChecks = True
End Sub

private Sub BuildTextField(nc As PropControls) As VMTextField
	Dim el As VMTextField
	el.Initialize(vue, "txt" & nc.vmodel, module)
	el.SetStatic(True)
	el.SetClearable(True)
	el.Setlabel(nc.text)
	el.SetVModel(nc.vmodel)
	el.SetType("text")
	el.RemoveAttr("ref")
	el.SetDense(True)
	el.SetOutlined(True)
	Return el
End Sub

private Sub BuildCheckBox(k As String, v As String) As VMCheckBox
	Dim chk As VMCheckBox
	chk.Initialize(vue, "chk" & k, module)
	chk.SetStatic(True)
	chk.SetVModel(k)
	chk.SetValue("Yes")
	chk.Setlabel(v)
	chk.SetUncheckedValue("No")
	vue.SetData(k, "No")
	defaults.Put(k,"No")
	fields.Add(k)
	Strings.Add(k)
	chk.SetDense(True)
	chk.RemoveAttr("ref")
	Return chk
End Sub

private Sub BuildSwitch(k As String, v As String) As VMCheckBox
	Dim sw As VMCheckBox
	sw.Initialize(vue, "sw" & k, module)
	sw.SetVModel(k)
	sw.Setlabel(v)
	sw.SetValue("Yes")
	sw.SetUncheckedValue("No")
	vue.SetData(k, "No")
	defaults.Put(k,"No")
	fields.Add(k)
	Strings.Add(k)
	sw.RemoveAttr("ref")
	sw.SetDense(True)
	Return sw
End Sub