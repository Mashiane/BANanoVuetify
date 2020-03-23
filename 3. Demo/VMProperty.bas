B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#ignorewarnings:12
Sub Class_Globals
	Private exp As VMExpansionPanels
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
	iconName As String, MinValue As Int, MaxValue As Int, sourceName As String, options As Map, sourcefield As String, displayfield As String, OptionsList As List)
	Dim sshow As String
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMProperty
	ID = sid.tolowercase
	module = eventHandler
	exp.Initialize(v, ID, eventHandler).SetAccordion(True)
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
	Return Me
End Sub

Sub SetVShow(vif As String) As VMProperty
	sshow = vif
	exp.SetVShow(vif)
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


Sub AddSelect(parent As String, vmodel As String, vText As String, sourceName As String, options As Map, sourcefield As String, displayfield As String)
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
	nc.vmodel = vmodel
	nc.text = vText
	nc.value = ""
	nc.typeOf = "select"
	nc.sourceName = sourceName
	nc.options = options
	nc.sourcefield = sourcefield
	nc.displayfield = displayfield
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Strings.Add(vmodel)
	defaults.Put(vmodel,"")
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
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = ""
	nc.text = btnText
	nc.value = btnID
	nc.typeOf = "btn"
	nc.module = module
	nc.methodName = methodName
	existing.Add(nc)
	controls.Put(parent, existing)
End Sub

Sub AddSlider(parent As String, vmodel As String, Label As String, minValue As Int, maxValue As Int, value As Int)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
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

Sub AddNumberInput(parent As String, vmodel As String, Label As String, minValue As Int, maxValue As Int, value As Int)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vmodel
	nc.text = Label
	nc.value = value
	nc.typeOf = "numberinput"
	nc.MinValue = minValue
	nc.MaxValue = maxValue
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Integers.Add(vmodel)
	defaults.Put(vmodel,value)
End Sub


Sub AddLabel(parent As String, txt As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = ""
	nc.text = txt
	nc.value = ""
	nc.typeOf = "lbl"
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
		expanel.Container.SetTag("div")
		expanel.Container.NoGutters = True
		'
		exp.addpanel(expanel)
	Next
	Return exp.tostring
End Sub

Sub AddSwitch(parent As String, vModel As String, text As String, bValue As Boolean)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = text
	nc.value = bValue
	nc.typeOf = "swt"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	Booleans.Add(vModel)
	defaults.Put(vModel,bValue)
End Sub

Sub AddIconButton(parent As String, btnID As String, btnIcon As String, methodName As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.iconName = btnIcon
	nc.value = btnID
	nc.typeOf = "btnicon"
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

private Sub AddInput(parent As String, typeOf As String, vModel As String, vText As String, vIcon As String, vValue As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
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
End Sub

Sub AddCheck(parent As String, vModel As String, text As String, bvalue As Boolean)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = text
	nc.value = bvalue
	nc.typeOf = "chk"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	Booleans.Add(vModel)
	defaults.Put(vModel,bvalue)

End Sub

Sub AddDatePicker(parent As String, vModel As String, text As String, vValue As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = text
	nc.value = vValue
	nc.typeOf = "dp"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	Strings.Add(vModel)
	defaults.Put(vModel,vValue)
End Sub

Sub AddTextArea(parent As String, vModel As String, text As String, vValue As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = text
	nc.value = vValue
	nc.typeOf = "textarea"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	Strings.Add(vModel)
	defaults.Put(vModel,vValue)
End Sub


Sub AddRadioGroup(parent As String, vmodel As String, vText As String, sourceName As String, options As Map, sourcefield As String, displayfield As String)
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
	nc.vmodel = vmodel
	nc.text = vText
	nc.value = ""
	nc.typeOf = "radiogroup"
	nc.sourceName = sourceName
	nc.options = options
	nc.sourcefield = sourcefield
	nc.displayfield = displayfield
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Strings.Add(vmodel)
	defaults.Put(vmodel,"")
End Sub
