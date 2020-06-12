B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public Container As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Type GridRow(Rows As Int, Columns As List, Row As Int)
	Type GridColumn(Columns As Int, sm As Int, md As Int, lg As Int, xl As Int, _
	ofsm As Int, ofmd As Int, oflg As Int, ofxl As Int, _
	orsm As Int, ormd As Int, orlg As Int, orxl As Int, Row As Int, Col As Int)
	'this will hold all our rows
	Private Rows As Map
	'this will hold temporal columns
	Private Columns As Map
	'this will hold each row definition
	'hold our last row
	Private LastRow As Int
	'temporal holder
	Private RC As Map
	Private Components As Map
	'
	Public Fields As List
	Public Controls As List
	Public Strings As List
	Public Integers As List
	Public Booleans As List
	Public Doubles As List
	Public Dates As List
	Public Defaults As Map
	Public Required As Map
	Public Mode As String
	Private TotalRows As Int
	Private sortitM As Map
	Private sortItL As List
	Private cells As Map
	Type EachRow(visibility As String)
	Public visibility As Map
	Private rowStyles As Map
	Public HasInfoBox As Boolean
	Public Exclusions As List
	Private DesignMode As Boolean
	Type CheckedUnchecked(fieldname As String, checkedValue As Object, uncheckedValue As Object)
	Private rowClasses As Map
	Private rowStyles As Map
	Private attributes As Map
	Private afewoptions As List
	Private bControls As Boolean
	Public HasBorder As Boolean
	Public ShowMatrix As Boolean
	Public NoGutters As Boolean
	Private cStatic As Boolean
	Public HasContent As Boolean
End Sub

'initialize the Container
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMContainer
	ID = sid.tolowercase
	HasContent = False
	rowClasses.Initialize
	rowStyles.Initialize	
	attributes.Initialize
	afewoptions.Initialize
	Container.Initialize(v, ID)
	Container.SetTag("v-container")
	DesignMode = False
	Module = eventHandler
	vue = v
	LastRow = 0
	Rows.Initialize
	RC.Initialize
	Columns.Initialize
	Components.Initialize
	'
	TotalRows = 0
	rowStyles.Initialize
	sortitM.Initialize
	sortItL.Initialize
	Fields.Initialize
	Controls.Initialize
	Strings.Initialize
	Integers.Initialize
	Booleans.Initialize
	Defaults.Initialize
	Required.Initialize
	Doubles.Initialize
	Dates.initialize
	cells.Initialize
	visibility.Initialize
	Exclusions.Initialize
	Mode = "A"
	HasInfoBox = False
	Container.SetVShow($"${ID}show"$)
	bControls = False
	HasBorder = False
	ShowMatrix = False
	NoGutters = False
	cStatic = True
	Return Me
End Sub


Sub SetVElse(vif As String) As VMContainer
	Container.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMContainer
	Container.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMContainer
	Container.SetVHtml(vhtml)
	Return Me
End Sub


Sub SetSlotOpposite As VMContainer
	Container.SetAttrLoose("v-slot:opposite")
	Return Me
End Sub

Sub SetFillHeight(b As Boolean) As VMContainer
	If b = False Then Return Me
	AddClass("fill-height")
	Return Me
End Sub

Sub SetVOnce(t As Boolean) As VMContainer
	Container.setvonce(t)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMContainer
	Container.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub CreateList(sid As String, eventHandler As Object) As VMList
	Dim el As VMList
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateStepper(sid As String, eventHandler As Object) As VMStepper
	Dim el As VMStepper
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateBadge(sid As String, moduleObj As Object) As VMBadge
	Dim el As VMBadge
	el.Initialize(vue, sid, moduleObj)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub SetStatic(b As Boolean) As VMContainer
	cStatic = b
	Container.SetStatic(b)
	Return Me
End Sub

Sub SetDiv(b As Boolean) As VMContainer
	If b = False Then Return Me
	SetTag("div")
	Return Me
End Sub

Sub CreateDataTable(cID As String, PrimaryKey As String, eventHandler As Object) As VMDataTable
	Dim el As VMDataTable
	el.Initialize(vue, cID,PrimaryKey,  eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateChip(sid As String, eventHandler As Object) As VMChip
	Dim el As VMChip
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub


Sub CreateExpansionPanels(sid As String, eventHandler As Object) As VMExpansionPanels
	Dim el As VMExpansionPanels
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateSpeedDial(sid As String, eventHandler As Object) As VMSpeedDial
	Dim el As VMSpeedDial
	el.Initialize(vue, sid,eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateRating(eID As String, eventHandler As Object) As VMRating
	Dim el As VMRating
	el.Initialize(vue, eID, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateTabs(sid As String, eventHandler As Object) As VMTabs
	Dim el As VMTabs
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateAvatar(sid As String, moduleObj As Object) As VMAvatar
	Dim el As VMAvatar
	el.Initialize(vue,sid, moduleObj)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateParallax(eID As String, eventHandler As Object) As VMParallax
	Dim el As VMParallax
	el.Initialize(vue, eID, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateDialog(sid As String, moduleObj As Object) As VMDialog
	Dim el As VMDialog
	el.Initialize(vue, sid, moduleObj)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateMenu(sid As String, moduleObj As Object) As VMMenu
	Dim el As VMMenu
	el.Initialize(vue, sid, moduleObj)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateCarousel(sid As String, moduleObj As Object) As VMCarousel
	Dim el As VMCarousel
	el.Initialize(vue,sid, moduleObj)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateDrawer(sid As String, eventHandler As Object) As VMNavigationDrawer
	Dim el As VMNavigationDrawer
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateContainer(sid As String, eventHandler As Object) As VMContainer
	Dim el As VMContainer
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateCard(cID As String, eventHandler As Object) As VMCard
	Dim el As VMCard
	el.Initialize(vue, cID, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub


Sub NewParallax(eventHandler As Object,bStatic As Boolean, sname As String, sheight As String, src As String,salt As String) As VMParallax
	Dim el As VMParallax = CreateParallax(sname, eventHandler)
	el.SetStatic(bStatic)
	el.SetDesignMode(DesignMode)
	el.SetHeight(sheight)
	el.SetSrc(src)
	el.SetAlt(salt)
	Return el
End Sub

Sub NewContainer(eventHandler As Object, bStatic As Boolean, sname As String) As VMContainer
	Dim el As VMContainer = CreateContainer(sname, eventHandler)
	el.SetStatic(bStatic)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub NewAutoCompleteDataSource(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, sourceTable As String, sourceField As String, displayField As String, returnObject As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMSelect
	Dim el As VMSelect = CreateSelect(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetAutoComplete
	el.SetStatic(bStatic)
	el.Setlabel(sLabel)
	el.SetRequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.SetPlaceholder(sPlaceHolder)
	el.SetHint(sHelperText)
	el.SetMultiple(bMultiple)
	el.SetDataSource(sourceTable, sourceField, displayField,returnObject)
	el.SetVModel(vmodel)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.Combo.ErrorMessage = sErrorText
	Return el
End Sub

Sub CreateAppBar(sid As String, moduleObj As Object) As VMToolBar
	Dim el As VMToolBar
	el.Initialize(vue, sid, moduleObj)
	el.SetDesignMode(DesignMode)
	el.SetAppBar(True)
	Return el
End Sub

Sub CreateSystemBar(sid As String, moduleObj As Object) As VMToolBar
	Dim el As VMToolBar
	el.Initialize(vue, sid, moduleObj)
	el.SetDesignMode(DesignMode)
	el.SetSystemBar(True)
	Return el
End Sub

Sub CreateToolbar(sid As String, moduleObj As Object) As VMToolBar
	Dim el As VMToolBar
	el.Initialize(vue, sid, moduleObj)
	el.SetDesignMode(DesignMode)
	el.SetToolBar(True)
	Return el
End Sub

Sub SetBorderRadius(size As String) As VMContainer
	Container.SetBorderRadius(size)
	Return Me
End Sub

Sub CreateLabel(sID As String) As VMLabel
	Dim el As VMLabel
	el.Initialize(vue, sID)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub CreateImage(img As String, eventHandler As Object) As VMImage
	Dim el As VMImage
	el.Initialize(vue, img, eventHandler)
	el.SetDesignMode(DesignMode)
	el.Image.typeof = "image"
	Return el
End Sub

Sub NewImage(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, src As String, salt As String, swidth As String, sheight As String) As VMImage
	vmodel = vmodel.ToLowerCase
	Dim el As VMImage = CreateImage(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.setstatic(bStatic)
	el.SetWidth(swidth)
	el.SetHeight(sheight)
	el.SetAlt(salt)
	el.SetVModel(vmodel, src)
	Return el
End Sub
'
'
Sub NewLabel(bStatic As Boolean,sname As String, vmodel As String, sSize As String, sText As String) As VMLabel
	vmodel = vmodel.tolowercase
	vue.SetStateSingle(vmodel, sText)
	Dim el As VMLabel = CreateLabel(sname)
	el.SetDesignMode(DesignMode)
	el.setstatic(bStatic)
	el.SetTag(sSize)
	el.SetVModel(vmodel, sText)
	Select Case sSize
		Case vue.SIZE_BLOCKQUOTE
			el.AddClass("blockquote")
	End Select
	Return el
End Sub

Sub CreateIcon(sid As String, moduleObj As Object) As VMIcon
	Dim el As VMIcon
	el.Initialize(vue, sid, moduleObj)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub NewIcon(eventHandler As Object,bStatic As Boolean,sname As String, sIcon As String, sSize As String, scolor As String, sintensity As String) As VMIcon
	Dim el As VMIcon = CreateIcon(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetStatic(bStatic)
	el.SetText(sIcon)
	el.SetAttributes(Array(sSize))
	el.SetColorIntensity(scolor,sintensity)
	Return el
End Sub


Sub CreateSlider(sid As String, eventHandler As Object) As VMSlider
	Dim el As VMSlider
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

''
Sub NewSlider(eventHandler As Object,bStatic As Boolean,sid As String, vmodel As String, slabel As String, iMinValue As String, iMaxValue As String,iTabIndex As Int) As VMSlider
	Dim el As VMSlider = CreateSlider(sid, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetStatic(bStatic)
	el.SetMin(iMinValue)
	el.SetMax(iMaxValue)
	el.SetLabel(slabel)
	el.SetVModel(vmodel)
	el.SetTabIndex(iTabIndex)
	Return el
End Sub


Sub CreateSwitch(sid As String, eventHandler As Object) As VMCheckBox
	Dim el As VMCheckBox
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetSwitch
	Return el
End Sub

Sub NewEmail(eventHandler As Object, bStatic As Boolean, sid As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, shelpertext As String, serrorText As String, iTabIndex As Int) As VMTextField
	Dim el As VMTextField = NewTextField(eventHandler, bStatic, sid, vmodel, slabel, splaceholder, bRequired, sIcon, 0, shelpertext, serrorText, iTabIndex)
	el.SetType("email")
	Return el
End Sub

Sub NewSwitch(eventHandler As Object, bStatic As Boolean, sid As String, vmodel As String, slabel As String, svalue As Object, sunchecked As Object, bPrimary As Boolean, iTabIndex As Int) As VMCheckBox
	Dim el As VMCheckBox = CreateSwitch(sid, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetStatic(bStatic)
	el.SetVModel(vmodel)
	el.Setlabel(slabel)
	el.SetValue(svalue)
	el.SetTrueValue(svalue)
	el.SetPrimary(bPrimary)
	el.SetUncheckedValue(sunchecked)
	el.SetFalseValue(sunchecked)
	el.SetTabIndex(iTabIndex)
	vue.SetData(vmodel, sunchecked)
	Return el
End Sub


Sub CreateRadioGroup(sid As String, eventHandler As Object) As VMRadioGroup
	Dim el As VMRadioGroup
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub
'
Sub NewRadioGroup(eventHandler As Object, bStatic As Boolean, sid As String, vmodel As String, slabel As String, svalue As Object, optionsm As Map, bShowLabel As Boolean, bLabelOnTop As Boolean, iTabIndex As Int) As VMRadioGroup
	Dim el As VMRadioGroup = CreateRadioGroup(sid, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetStatic(bStatic)
	el.SetVModel(vmodel)
	el.Setlabel(slabel)
	el.SetOptions(optionsm)
	el.SetTabIndex(iTabIndex)
	el.SetValue(svalue)
	vue.SetData(vmodel, svalue)
	If bShowLabel = False Then el.SetLabel("")
	If bLabelOnTop Then
		el.SetColumn(bLabelOnTop)
	Else
		el.SetRow(True)
	End If
	Return el
End Sub

Sub NewSelectDataSource(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, sourceTable As String, sourceField As String, displayField As String, returnObject As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMSelect
	Dim el As VMSelect = CreateSelect(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetStatic(bStatic)
	el.Setlabel(sLabel)
	el.SetRequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.SetPlaceholder(sPlaceHolder)
	el.SetHint(sHelperText)
	el.SetMultiple(bMultiple)
	el.SetDataSource(sourceTable, sourceField, displayField,returnObject)
	el.SetVModel(vmodel)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.Combo.ErrorMessage = sErrorText
	Return el
End Sub

'use select with map
Sub NewSelectOptions(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, optionsm As Map, sourceField As String, displayField As String, returnObject As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMSelect
	Dim el As VMSelect = CreateSelect(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetStatic(bStatic)
	el.Setlabel(sLabel)
	el.Setrequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.Setplaceholder(sPlaceHolder)
	el.SetHint(sHelperText)
	el.Setmultiple(bMultiple)
	el.SetVModel(vmodel)
	el.SetOptions($"${vmodel}items"$, optionsm, sourceField, displayField, returnObject)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.Combo.ErrorMessage = sErrorText
	Return el
End Sub

Sub NewComboDataSource(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, sourceTable As String, sourceField As String, displayField As String, returnObject As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMSelect
	Dim el As VMSelect = CreateSelect(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetComboBox
	el.setstatic(bStatic)
	el.Setlabel(sLabel)
	el.SetRequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.SetPlaceholder(sPlaceHolder)
	el.SetHint(sHelperText)
	el.SetMultiple(bMultiple)
	el.SetVModel(vmodel)
	el.SetDataSource(sourceTable, sourceField, displayField,returnObject)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.Combo.ErrorMessage = sErrorText
	Return el
End Sub

'use select with map
Sub NewComboOptions(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, optionsm As Map, sourceField As String, displayField As String, returnObject As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMSelect
	Dim el As VMSelect = CreateSelect(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetComboBox
	el.SetStatic(bStatic)
	el.Setlabel(sLabel)
	el.SetRequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.Setplaceholder(sPlaceHolder)
	el.SetHint(sHelperText)
	el.Setmultiple(bMultiple)
	el.SetVModel(vmodel)
	el.SetOptions($"${vmodel}items"$, optionsm, sourceField, displayField, returnObject)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.Combo.ErrorMessage = sErrorText
	Return el
End Sub
'

Sub CreateFABButton(sid As String,moduleObj As Object, iconName As String) As VMButton
	Dim el As VMButton
	el.Initialize(vue, sid, moduleObj)
	el.SetDesignMode(DesignMode)
	el.SetFabButton(iconName)
	Return el
End Sub

Sub NewIconButton(eventHandler As Object,bStatic As Boolean,sname As String, iconName As String, sColor As String, sTooltip As String) As VMButton
	Dim el As VMButton = CreateButton(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetStatic(bStatic)
	el.SetIconButton(iconName)
	el.SetColor(sColor)
	el.SetTooltip(sTooltip)
	Return el
End Sub

Sub NewFABButton(eventHandler As Object,bStatic As Boolean,sname As String, iconName As String, sColor As String, sTooltip As String) As VMButton
	Dim el As VMButton = CreateFABButton(sname, eventHandler, iconName)
	el.SetDesignMode(DesignMode)
	el.SetStatic(bStatic)
	el.SetColor(sColor)
	el.SetTooltip(sTooltip)
	Return el
End Sub

Sub NewH1(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "h1", sText)
End Sub

Sub NewH2(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "h2", sText)
End Sub

Sub NewH3(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "h3", sText)
End Sub

Sub NewH4(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "h4", sText)
End Sub

Sub NewH5(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname,sname, "h5", sText)
End Sub

Sub NewH6(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "h6", sText)
End Sub

Sub NewP(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "p", sText)
End Sub

Sub NewSPAN(bstatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bstatic,sname, sname, "span", sText)
End Sub

Sub NewBLOCKQUOTE(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "blockquote", sText)
End Sub

Sub NewRadioGroupDataSource(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, sLabel As String, svalue As String, sourceTable As String, sourceField As String, displayField As String, bShowLabel As Boolean, bLabelOnTop As Boolean, iTabIndex As Int) As VMRadioGroup
	Dim el As VMRadioGroup = CreateRadioGroup(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetStatic(bStatic)
	el.SetVModel(vmodel)
	el.Setlabel(sLabel)
	el.SetTabIndex(iTabIndex)
	el.SetDataSource(sourceTable, sourceField, displayField)
	vue.SetData(vmodel, svalue)
	If bShowLabel = False Then el.SetLabel("")
	If bLabelOnTop Then
		el.SetColumn(bLabelOnTop)
	Else
		el.SetRow(True)
	End If
	Return el
End Sub


Sub CreateCheckBox(sid As String, eventHandler As Object) As VMCheckBox
	Dim el As VMCheckBox
	el.Initialize(vue, sid, eventHandler)	
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub NewCheckBox(eventHandler As Object, bStatic As Boolean, sid As String, vmodel As String, slabel As String, svalue As Object, sunchecked As Object, bPrimary As Boolean, iTabIndex As Int) As VMCheckBox
	Dim el As VMCheckBox = CreateCheckBox(sid, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetStatic(bStatic)
	el.SetVModel(vmodel)
	el.SetTrueValue(svalue)
	el.SetValue(svalue)
	el.Setlabel(slabel)
	el.SetPrimary(bPrimary)
	el.SetUncheckedValue(sunchecked)
	el.SetFalseValue(sunchecked)
	el.SetTabIndex(iTabIndex)
	vue.SetData(vmodel, sunchecked)
	Return el
End Sub


Sub CreateDateTimePicker(sid As String, eventHandler As Object) As VMDateTimePicker
	Dim el As VMDateTimePicker
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

Sub NewDatePicker(eventHandler As Object, bStatic As Boolean, sid As String, vmodel As String, slabel As String, bRequired As Boolean, sPlaceholder As String, sHint As String, sErrorText As String, iTabIndex As Int) As VMDateTimePicker
	Dim el As VMDateTimePicker = CreateDateTimePicker(sid, eventHandler)
	el.SetDesignMode(DesignMode)
	el.setstatic(bStatic)
	el.Setlabel(slabel)
	el.SetRequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.SetVModel(vmodel)
	el.SetPlaceHolder(sPlaceholder)
	el.SetHint(sHint)
	el.TextField.SetRules(True)
	el.TextField.SetErrorMessages(True)
	el.DateTimePicker.ErrorMessage = sErrorText
	el.TextField.SetError(False)
	el.SetForInput
	Return el
End Sub
'
Sub NewTimePicker(eventHandler As Object, bStatic As Boolean, sid As String, vmodel As String, slabel As String, bRequired As Boolean, sPlaceholder As String, sHint As String, sErrorText As String, iTabIndex As Int) As VMDateTimePicker
	Dim el As VMDateTimePicker = CreateDateTimePicker(sid, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetTimePicker
	el.setstatic(bStatic)
	el.Setlabel(slabel)
	el.SetVModel(vmodel)
	el.SetRequired(bRequired)
	el.SetPlaceHolder(sPlaceholder)
	el.SetHint(sHint)
	el.SetTabIndex(iTabIndex)
	el.TextField.SetRules(True)
	el.TextField.SetErrorMessages(True)
	el.TextField.SetError(False)
	el.SetForInput
	el.DateTimePicker.ErrorMessage = sErrorText
	Return el
End Sub


Sub CreateTextField(sid As String, eventHandler As Object) As VMTextField
	Dim el As VMTextField
	el.Initialize(vue, sid,eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

'
'added for back ward compatibility
Sub NewText(eventHandler As Object,bStatic As Boolean,sid As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, iMaxLen As Int, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMTextField
	Return NewTextField(eventHandler,bStatic,sid, vmodel, slabel, splaceholder, bRequired, sIcon, iMaxLen, shelpertext, sErrorText, iTabIndex)
End Sub

Sub NewTextField(eventHandler As Object,bStatic As Boolean,sid As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, iMaxLen As Int, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMTextField
	Dim el As VMTextField = CreateTextField(sid, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetStatic(bStatic)
	el.Setlabel(slabel)
	el.SetRequired(bRequired)
	el.SetPrependIcon(sIcon)
	If iMaxLen > 0 Then
		el.SetMaxLength(iMaxLen)
		el.SetCounter(True)
	End If
	el.SetPlaceHolder(splaceholder)
	el.SetHint(shelpertext)
	el.SetTabIndex(iTabIndex)
	el.SetVModel(vmodel)
	el.SetType("text")
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.TextField.ErrorMessage = sErrorText
	Return el
End Sub
'
Sub NewTel(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMTextField
	Dim el As VMTextField = NewTextField(eventHandler,bStatic,sname, vmodel, slabel, splaceholder, bRequired, sIcon, 0, shelpertext, sErrorText, iTabIndex)
	el.SetType("tel")
	Return el
End Sub

Sub NewNumber(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMTextField
	Dim el As VMTextField = NewTextField(eventHandler,bStatic,sname, vmodel, slabel, splaceholder, bRequired, sIcon, 0, shelpertext, sErrorText, iTabIndex)
	el.SetType("number")
	Return el
End Sub

Sub NewTextArea(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, bAutoGrow As Boolean, sIcon As String, iMaxLen As Int, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMTextField
	Dim el As VMTextField = CreateTextField(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetTextArea
	el.setstatic(bStatic)
	el.Setlabel(slabel)
	el.Setrequired(bRequired)
	el.SetPrependIcon(sIcon)
	If iMaxLen > 0 Then
		el.SetCounter(iMaxLen)
		el.SetMaxLength(iMaxLen)
	End If
	el.SetPlaceHolder(splaceholder)
	el.SetHint(shelpertext)
	el.SetTabIndex(iTabIndex)
	el.SetAutoGrow(bAutoGrow)
	el.SetVModel(vmodel)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.TextField.ErrorMessage = sErrorText
	Return el
End Sub

'
Sub NewPassword(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, bToggle As Boolean, sIcon As String, iMaxLen As Int, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMTextField
	Dim el As VMTextField = NewTextField(eventHandler,bStatic,sname, vmodel, slabel, splaceholder, bRequired, sIcon, iMaxLen, shelpertext, sErrorText, iTabIndex)
	el.SetPassword(True, bToggle)
	Return el
End Sub

'backward compatibility
Sub NewFile(eventHandler As Object,bStatic As Boolean,bUpload As Boolean,sname As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMFileInput
	Return NewFileInput(eventHandler,bStatic,bUpload,sname, vmodel, slabel, splaceholder, bRequired, shelpertext, sErrorText, iTabIndex)
End Sub
'
Sub NewFileInput(eventHandler As Object,bStatic As Boolean,bUpload As Boolean, sname As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, shelperText As String, sErrorText As String, iTabIndex As Int) As VMFileInput
	Dim el As VMFileInput = CreateFileInput(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.setstatic(bStatic)
	el.SetHint(shelperText)
	el.SetTabIndex(iTabIndex)
	el.SetPlaceHolder(splaceholder)
	el.SetVModel(vmodel)
	el.SetClearable(False)
	el.Setlabel(slabel)
	el.SetRequired(bRequired)
	vue.SetData(vmodel, Null)
	el.SetRules(vue.newlist)
	el.SetError(False)
	el.SetErrorMessages(vue.newlist)
	el.SetErrorText(sErrorText)
	Return el
End Sub
'

Sub CreateFileInput(sid As String, eventHandler As Object) As VMFileInput
	Dim el As VMFileInput
	el.Initialize(vue, sid, eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub

'use select with map
Sub NewAutoCompleteOptions(eventHandler As Object,bStatic As Boolean,sname As String,vmodel As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, optionsm As Map, sourceField As String, displayField As String, returnObject As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMSelect
	Dim el As VMSelect = CreateSelect(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.SetAutoComplete
	el.setstatic(bStatic)
	el.Setlabel(sLabel)
	el.SetRequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.Setplaceholder(sPlaceHolder)
	el.SetHint(sHelperText)
	el.Setmultiple(bMultiple)
	el.SetVModel(vmodel)
	el.SetOptions($"${vmodel}items"$, optionsm, sourceField, displayField, returnObject)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.Combo.ErrorMessage = sErrorText
	Return el
End Sub


Sub NewButton(eventHandler As Object,bStatic As Boolean,sname As String, sLabel As String, bRaised As Boolean, bPrimary As Boolean, bAccent As Boolean, bFitWidth As Boolean) As VMButton
	Dim el As VMButton = CreateButton(sname, eventHandler)
	el.SetDesignMode(DesignMode)
	el.setstatic(bStatic)
	el.SetLabel(sLabel)
	If bRaised = False Then el.SetTransparent(True)
	If bPrimary Then el.SetPrimary(bPrimary)
	If bAccent Then el.SetColor("accent")
	If bFitWidth Then el.SetBlock(True)
	Return el
End Sub


Sub CreateSelect(sid As String, eventHandler As Object) As VMSelect
	Dim el As VMSelect
	el.Initialize(vue,sid,eventHandler)
	el.SetDesignMode(DesignMode)
	Return el
End Sub


Sub CreateButton(sid As String,moduleObj As Object) As VMButton
	Dim el As VMButton
	el.Initialize(vue, sid, moduleObj)
	el.SetDesignMode(DesignMode)
	el.SetType("button")
	Return el
End Sub

Sub SetHasBorder(b As Boolean) As VMContainer
	HasBorder = b
	Return Me
End Sub

Sub SetShowMatrix(b As Boolean) As VMContainer
	ShowMatrix = b
	Return Me
End Sub

Sub SetNoGutters(b As Boolean) As VMContainer
	NoGutters = b
	Return Me
End Sub

Sub SetWidth(w As String) As VMContainer
	If w = "" Then Return Me
	Container.SetStyleSingle("width", w)
	Return Me
End Sub

Sub SetMaxWidth(w As String) As VMContainer
	If w = "" Then Return Me
	Container.SetStyleSingle("max-width", w)
	Return Me
End Sub

Sub SetMinWidth(w As String) As VMContainer
	If w = "" Then Return Me
	Container.SetStyleSingle("min-width", w)
	Return Me
End Sub

Sub SetHeight(h As String) As VMContainer
	If h = "" Then Return Me
	Container.SetStyleSingle("height", h)
	Return Me
End Sub

Sub SetMaxHeight(h As String) As VMContainer
	If h = "" Then Return Me
	Container.SetStyleSingle("max-height", h)
	Return Me
End Sub

Sub SetMinHeight(h As String) As VMContainer
	If h = "" Then Return Me
	Container.SetStyleSingle("min-height", h)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As String) As VMContainer
	If varTransition = "" Then Return Me
	SetAttrSingle("transition", varTransition)
	Return Me
End Sub

Sub AddExclusion(them As List) As VMContainer
	For Each k As String In them
		Exclusions.Add(k)
	Next
	Return Me
End Sub

Sub SetElevation(elx As String) As VMContainer
	If elx = "" Then Return Me
	AddClass($"elevation-${elx}"$)
	Return Me
End Sub

Sub SetMargins(sMT As String, sMB As String, sML As String, sMR As String) As VMContainer
	Container.SetMargins(sMT, sMB, sML, sMR)
	Return Me
End Sub

Sub SetPadding(sPT As String, sPB As String, sPL As String, sPR As String) As VMContainer
	Container.SetPadding(sPT, sPB, sPL, sPR)
	Return Me
End Sub

Sub SetEmpty
	vue.SetStateListValues(Fields)
End Sub

Sub SetDefaults
	vue.SetState(Defaults)
	vue.SetState(visibility)
	For Each k As String In Required.Keys
		vue.HideError(k)
	Next
End Sub

Sub AddRequired(r As String,e As String) As VMContainer
	Required.put(r, e)
	Return Me
End Sub

Sub RemoveRequired(r As String) As VMContainer
	Required.Remove(r)
	Return Me
End Sub

'add control sizes only
Sub AddControlS(ctl As VMElement, template As String, r As String, c As String, s As String, m As String, l As String, xl As String)
	AddControl(ctl, template, r, c, 0,0,0,0,s,m,l,xl)
End Sub

'set booleans from checked and unchecked values
Sub SetBooleans(rec As Map, xFields As List, checkedValue As String, UnCheckedValue As String) As Map
	Try
		For Each sfield As String In xFields
			Dim svalue As String = rec.Get(sfield)
			If svalue.EqualsIgnoreCase(checkedValue) Then rec.Put(sfield, True)
			If svalue.EqualsIgnoreCase(UnCheckedValue) Then rec.Put(sfield, False)
		Next
		Return rec
	Catch
		Return rec
	End Try
End Sub

Sub SetUncheckedValue(rec As Map, xFields As List, checkedValue As String, UncheckedValue As String) As Map
	Try
		For Each sfield As String In xFields
			Dim svalue As String = rec.Get(sfield)
			If svalue.EqualsIgnoreCase(checkedValue) = False Then
				rec.Put(sfield, UncheckedValue)
			End If
		Next
		Return rec
	Catch
		Return rec
	End Try
End Sub

'get field data
Sub GetData As Map
	Dim m As Map = CreateMap()
	m = vue.GetStates(Fields)
	m = LinkRecordTypes(m)
	'map checked and unchecked values
	For Each record As CheckedUnchecked In afewoptions
		Dim xlst As List
		xlst.Initialize
		xlst.Add(record.fieldname)
		m = SetUncheckedValue(m, xlst, record.checkedValue, record.uncheckedValue)
	Next
	Return m
End Sub

'validate the records
Sub Validate(rec As Map) As Boolean
	Return vue.Validate(rec, Required)
End Sub

Sub LinkRecordTypes(rec As Map) As Map
	Dim nrec As Map = CreateMap()
	For Each k As String In rec.keys
		Dim v As Object = rec.Get(k)
		k = k.ToLowerCase
		nrec.Put(k, v)
	Next
	If Doubles.Size > 0 Then vue.MakeDouble(nrec, Doubles)
	If Integers.Size > 0 Then vue.MakeInteger(nrec, Integers)
	If Strings.Size > 0 Then vue.MakeTrim(nrec, Strings)
	If Dates.Size > 0 Then vue.MakeDate(nrec, Dates)
	If Booleans.Size > 0 Then vue.MakeBoolean(nrec, Booleans)
	Return nrec
End Sub

Sub NoSpaces(rec As Map, sFields As List) As Map
	Dim nrec As Map = CreateMap()
	For Each k As String In rec.keys
		Dim v As Object = rec.Get(k)
		If sFields.IndexOf(k) = -1 Then
			nrec.Put(k, v)
		Else
			Dim v1 As String = vue.CStr(v)
			v1 = v1.Replace(" ","")
			v1 = v1.trim
			nrec.Put(k, v1)
		End If
	Next
	Return nrec
End Sub

Sub AddIntegers(i As List) As VMContainer
	For Each s As String In i
		Integers.Add(s)
	Next
	Return Me
End Sub

Sub AddStrings(i As List) As VMContainer
	For Each s As String In i
		Strings.Add(s)
	Next
	Return Me
End Sub

Sub AddBooleans(i As List) As VMContainer
	For Each s As String In i
		Booleans.Add(s)
	Next
	Return Me
End Sub

Sub AddDates(i As List) As VMContainer
	For Each s As String In i
		Dates.Add(s)
	Next
	Return Me
End Sub

Sub AddDoubles(d As List) As VMContainer
	For Each s As String In d
		Doubles.Add(s)
	Next
	Return Me
End Sub

Sub AddLabel(row As Int, col As Int, elID As String, elSize As String, elText As String) As VMContainer
	Dim lbl As VMLabel
	lbl.Initialize(vue, elID).SetTag(elSize).SetText(elText)
	AddComponent(row, col, lbl.ToString)
	Return Me
End Sub

Sub AddButtonPrimary(eventHandler As Object, row As Int, col As Int, btnID As String, btnText As String, btnRaised As Boolean, btnTooltip As String, btnFitWidth As Boolean) As VMContainer
	Dim el As VMButton
	el.Initialize(vue, btnID, eventHandler)
	el.SetLabel(btnText)
	el.SetPrimary(True)
	el.SetBlock(btnFitWidth)
	el.SetToolTip(btnTooltip)
	If btnRaised = False Then el.SetTransparent(True)
	AddComponent(row, col, el.ToString)
	Return Me
End Sub

Sub AddButtonAccent(eventHandler As Object, row As Int, col As Int, btnID As String, btnText As String, btnRaised As Boolean, btnTooltip As String, btnFitWidth As Boolean) As VMContainer
	Dim el As VMButton
	el.Initialize(vue, btnID, eventHandler)
	el.SetLabel(btnText)
	el.SetAccent(True)
	el.SetBlock(btnFitWidth)
	el.SetToolTip(btnTooltip)
	If btnRaised = False Then el.SetTransparent(True)
	AddComponent(row, col, el.ToString)
	Return Me
End Sub

Sub SetTextCenter As VMContainer
	Container.SetTextCenter
	Return Me
End Sub



Sub SetAttrLoose(loose As String) As VMContainer
	Container.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMContainer
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'clear the contents of the grid
Sub Clear As VMContainer
	Rows.Initialize
	LastRow = 0
	RC.Initialize
	Columns.Initialize
	Components.Initialize
	rowStyles.Initialize 
	rowClasses.Initialize 
	HasContent = False
	Return Me
End Sub

Sub AddRows(iRows As Int) As VMContainer
	'if there is no existing row, then initialize the map
	'lets store the last row
	LastRow = Rows.size
	'create a new row
	Dim nRow As GridRow
	nRow.Initialize
	nRow.Rows = iRows
	nRow.Columns.Initialize
	nRow.Row = 0 
	'lets store this new row in rows
	Dim rowKey As String = $"${ID}r${LastRow}"$
	'lets save the row on the map
	Rows.Put(rowKey,nRow)
	HasContent = True
	Return Me
End Sub

Sub AddColumns(iColumns As Int, sm As Int, md As Int, lg As Int, xl As Int) As VMContainer
	AddColumnsOS(iColumns, 0,0,0,0,sm,md,lg,xl)
	Return Me
End Sub

'add columns - offsets and sizes
Sub AddColumnsOS(iColumns As Int, osm As Int, omd As Int, olg As Int, oxl As Int, sm As Int, md As Int, lg As Int, xl As Int) As VMContainer
	Dim nCol As GridColumn
	nCol.Initialize
	nCol.Columns = iColumns
	nCol.Row = 0
	nCol.Col = 0
	nCol.lg = lg
	nCol.md = md
	nCol.sm = sm
	nCol.xl = xl
	nCol.oflg = olg
	nCol.ofmd = omd
	nCol.ofsm = osm
	nCol.ofxl = oxl
	'get the existing columns for this row
	Dim rowkey As String = $"${ID}r${LastRow}"$
	'get the row from existing rows
	If Rows.ContainsKey(rowkey) Then
		'get the row from existing rows
		Dim oldRow As GridRow = Rows.Get(rowkey)
		'get the existing columns from the row
		oldRow.Columns.Add(nCol)
		'save it back
		Rows.Put(rowkey,oldRow)
	End If
	HasContent = True
	Return Me
End Sub

'add class to a RC
Sub AddClassRC(row As Int, col As Int, classNames As List) As VMContainer
	For Each clsName As String In classNames
		SetClassRC(row, col, clsName)
	Next
	Return Me
End Sub

'set color intensity
Sub SetColorIntensityRC(row As Int, col As Int, varColor As String, varIntensity As String) As VMContainer
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	SetClassRC(row, col, scolor)
	Return Me
End Sub

'set color intensity
Sub SetColorRC(row As Int, col As Int, varColor As String) As VMContainer
	SetClassRC(row, col, varColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorRC(row As Int, col As Int, varColor As String) As VMContainer
	Dim sColor As String = $"${varColor}--text"$
	SetClassRC(row, col, sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensityRC(row As Int, col As Int, varColor As String, varIntensity As String) As VMContainer
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	SetClassRC(row, col, mcolor)
	Return Me
End Sub

Sub SetTextCenterRC(row As Int, col As Int) As VMContainer
	AddClassRC(row, col, Array("text-center"))
	Return Me
End Sub

Sub SetTextRightRC(row As Int, col As Int) As VMContainer
	AddClassRC(row, col, Array("text-right"))
	Return Me
End Sub

'apply a theme to an element
Sub UseThemeRC(row As Int, col As Int, themeName As String) As VMContainer
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClassRC(row, col, Array(sclass))
	End If
	Return Me
End Sub

'add a class to a row/column
Sub SetClassRC(rowPos As Int, colPos As Int, className As String) As VMContainer
	'class names should be unique for the row
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowClasses.ContainsKey(rowKey) Then
		rowc = rowClasses.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put(className,className)
	rowClasses.Put(rowKey,rowc)
	Return Me
End Sub

Sub AddColumns3x4 As VMContainer
	AddColumns(3,"12","4","4","4")
	Return Me
End Sub

Sub AddColumns4x3 As VMContainer
	AddColumns(4,"12","3","3","3")
	Return Me
End Sub

Sub AddColumns2x6 As VMContainer
	AddColumns(2,"12","6","6","6")
	Return Me
End Sub

Sub AddColumns6x2 As VMContainer
	AddColumns(6,"12","2","2","2")
	Return Me
End Sub

Sub AddColumns12x1 As VMContainer
	AddColumns(12,"12","1","1","1")
	Return Me
End Sub

Sub AddColumns8p4 As VMContainer
	AddColumns(1,"12","8","8","8").AddColumns(1,"12","4","4","4")
	Return Me
End Sub

Sub AddColumns4p8 As VMContainer
	AddColumns(1,"12","4","4","4").AddColumns(1,"12","8","8","8")
	Return Me
End Sub

Sub AddColumns1p11 As VMContainer
	AddColumns(1,"12","1","1","1").AddColumns(1,"12","11","11","11")
	Return Me
End Sub

Sub AddColumns11p1 As VMContainer
	AddColumns(1,"12","11","11","11").AddColumns(1,"12","1","1","1")
	Return Me
End Sub

Sub AddColumns2p10 As VMContainer
	AddColumns(1,"12","2","2","2").AddColumns(1,"12","10","10","10")
	Return Me
End Sub

Sub AddColumns10p2 As VMContainer
	AddColumns(1,"12","10","10","10").AddColumns(1,"12","2","2","2")
	Return Me
End Sub

Sub AddColumns3p9 As VMContainer
	AddColumns(1,"12","3","3","3").AddColumns(1,"12","9","9","9")
	Return Me
End Sub

Sub AddColumns9p3 As VMContainer
	AddColumns(1,"12","9","9","9").AddColumns(1,"12","3","3","3")
	Return Me
End Sub

Sub AddColumns7p5 As VMContainer
	AddColumns(1,"12","7","7","7").AddColumns(1,"12","5","5","5")
	Return Me
End Sub

Sub AddColumns5p7 As VMContainer
	AddColumns(1,"12","5","5","5").AddColumns(1,"12","7","7","7")
	Return Me
End Sub

Sub AddColumns12 As VMContainer
	AddColumns(1,"12","12","12","12")
	Return Me
End Sub

'add a style to a column
Sub SetStyleRC(rowPos As Int, colPos As Int, prop As String, value As String) As VMContainer
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowStyles.ContainsKey(rowKey) Then
		rowc = rowStyles.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put(prop,value)
	rowStyles.Put(rowKey,rowc)
	Return Me
End Sub

'align row content
Sub SetAlignContentRC(rowPos As Int, colPos As Int, align As String) As VMContainer
	SetAttrRC(rowPos, colPos, "align-content", align)
	Return Me
End Sub

Sub SetJustifyCenterRow(rowPos As Int) As VMContainer
	SetJustifyRC(rowPos, 0, "center")
	Return Me
End Sub

Sub SetAlignCenterRow(rowPos As Int) As VMContainer
	SetAlignRC(rowPos, 0, "center")
	Return Me
End Sub

'jusrify row
Sub SetJustifyRC(rowPos As Int, colPos As Int, align As String) As VMContainer
	SetAttrRC(rowPos, colPos, "justify", align)
	Return Me
End Sub

'align row
Sub SetAlignRC(rowPos As Int, colPos As Int, align As String) As VMContainer
	SetAttrRC(rowPos, colPos, "align", align)
	Return Me
End Sub

'align column
Sub SetAlignSelfRC(rowPos As Int, colPos As Int, align As String) As VMContainer
	SetAttrRC(rowPos, colPos, "align-self", align)
	Return Me
End Sub

Sub SetDenseRC(rowPos As Int, colPos As Int) As VMContainer
	SetAttrRC(rowPos, colPos, "dense", True)
	Return Me
End Sub

Sub SetNoGuttersRC(rowPos As Int, colPos As Int) As VMContainer
	SetAttrRC(rowPos, colPos, "no-gutters", True)
	Return Me
End Sub

Sub SetKeyRC(rowPos As Int, colPos As Int, keyName As String) As VMContainer
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	keyName = keyName.tolowercase
	vue.SetData(keyName, rowKey)
	SetAttrRC(rowPos, colPos, ":key", keyName)
	Return Me
End Sub

'add an attribute to rc
Sub SetAttrRC(rowPos As Int, colPos As Int, prop As String, value As String) As VMContainer
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put(prop,value)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

'set the border
Sub SetBorderStyle(bstyle As String) As VMContainer
	If bstyle = "" Then Return Me
	SetStyleSingle("border-style", bstyle)
	Return Me
End Sub

Sub SetBorderWidth(bwidth As String) As VMContainer
	If bwidth = "" Then Return Me
	SetStyleSingle("border-width", bwidth)
	Return Me
End Sub

'set the border
Sub SetBorderColor(bcolor As String) As VMContainer
	If bcolor = "" Then Return Me
	SetStyleSingle("border-color", bcolor)
	Return Me
End Sub

'set the border
Sub SetBorder(bwidth As String, bcolor As String, bstyle As String) As VMContainer
	If bstyle <> "" Then SetStyleSingle("border-style", bstyle)
	If bwidth <> "" Then SetStyleSingle("border-width", bwidth)
	If bcolor <> "" Then SetStyleSingle("border-color", bcolor)
	Return Me
End Sub

'set the border of the rc
Sub SetBorderRC(rowPos As Int, colPos As Int, bwidth As String, bcolor As String, bstyle As String) As VMContainer
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowStyles.ContainsKey(rowKey) Then
		rowc = rowStyles.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	If bstyle <> "" Then rowc.Put("border-style", bstyle)
	If bwidth <> "" Then rowc.Put("border-width", bwidth)
	If bcolor <> "" Then rowc.Put("border-color", bcolor)
	rowStyles.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetMarginsRC(rowPos As Int, colPos As Int, mt As Object, mb As Object, ml As Object, mr As Object) As VMContainer
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowStyles.ContainsKey(rowKey) Then
		rowc = rowStyles.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	If mt <> Null Then rowc.Put("margin-top", mt)
	If mb <> Null Then rowc.Put("margin-bottom", mb)
	If ml <> Null Then rowc.Put("margin-left", ml)
	If mr <> Null Then rowc.Put("margin-right", mr)
	rowStyles.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetPaddingRC(rowPos As Int, colPos As Int, pt As Object, pb As Object, pl As Object, pr As Object) As VMContainer
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowStyles.ContainsKey(rowKey) Then
		rowc = rowStyles.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	If pt <> Null Then rowc.Put("padding-top", pt)
	If pb <> Null Then rowc.Put("padding-bottom", pb)
	If pl <> Null Then rowc.Put("padding-left", pl)
	If pr <> Null Then rowc.Put("padding-right", pr)
	rowStyles.Put(rowKey,rowc)
	Return Me
End Sub

private Sub CStr(o As Object) As String
	If o = BANano.UNDEFINED Then o = ""
	Return "" & o
End Sub

private Sub MapKeys2Delim(m As Map, delim As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	Dim kTot As Int = m.Size - 1
	Dim kCnt As Int
	Dim strKey As String = m.getkeyat(0)
	sb.Append(strKey)
	For kCnt = 1 To kTot
		Dim strKey As String = m.getkeyat(kCnt)
		sb.Append(delim).append(strKey)
	Next
	Return sb.ToString
End Sub

'build a single row
private Sub BuildRow(row As GridRow) As String
	'how many rows do we have to render
	Dim rowTot As Int = row.Rows
	Dim rowCnt As Int
	'
	Dim sb As StringBuilder
	sb.Initialize
	'for each row
	For rowCnt = 1 To rowTot
		LastRow = LastRow + 1
		row.Row = CStr(LastRow)
		Dim rowKey As String = $"${ID}r${LastRow}"$
		'
		If NoGutters Then
			SetAttrRC(LastRow, 0, "no-gutters", True)
		End If
		'
		Dim tRow As VMRow
		tRow.Initialize(vue, rowKey, Module)
		tRow.SetDesignMode(DesignMode)
		'detect if we have styles for the Row
		If rowStyles.ContainsKey(rowKey) Then
			Dim cm As Map = rowStyles.Get(rowKey)
			For Each strkey As String In cm.Keys
				Dim strVal As String = cm.Get(strkey)
				tRow.SetStyleSingle(strkey, strVal)
			Next
		End If
		'detect if we have classes for this row
		If rowClasses.ContainsKey(rowKey) Then
			'get keys and add them
			Dim cm As Map = rowClasses.Get(rowKey)
			Dim clsName As String = MapKeys2Delim(cm, " ")
			tRow.AddClass(clsName)
		End If
		'detect if we have an attribute
		If attributes.ContainsKey(rowKey) Then
			Dim cm As Map = attributes.Get(rowKey)
			For Each strkey As String In cm.Keys
				Dim strVal As String = cm.Get(strkey)
				tRow.SetAttrSingle(strkey, strVal)
			Next
		End If
				
		'get the columns to add
		Dim cols As List = row.Columns
		'how many columns to add here
		Dim colCnt As Int = 0
		Dim colTot As Int = cols.Size - 1
		'this will store the column count
		Dim LastColumn As Int = 0
		For colCnt = 0 To colTot
			'get this column
			Dim column As GridColumn = cols.Get(colCnt)
			Dim colCnt1 As Int = 0
			Dim colTot1 As Int = column.Columns
			For colCnt1 = 1 To colTot1
				'increment the column to add for this row
				LastColumn = LastColumn + 1
				column.Row = CStr(LastRow)
				column.Col = CStr(LastColumn)
				Dim cellKey As String = $"${rowKey}c${LastColumn}"$
				'add to RC map, this is used to check if Matrix Position Exist
				RC.Put(cellKey,cellKey)
				'if showid
				If HasBorder Then
					SetBorderRC(LastRow, LastColumn, "1px", vue.COLOR_GREY, vue.BORDER_SOLID)
				End If
				
				Dim tColumn As VMCol
				tColumn.Initialize(vue,cellKey,Module)
				tColumn.SetDesignMode(DesignMode)
				tColumn.SetLg(column.lg)
				tColumn.SetSm(column.sm)
				tColumn.SetMd(column.md)
				tColumn.SetXl(column.xl)
				tColumn.SetOffsetSm(column.ofsm)
				tColumn.SetOffsetMd(column.ofmd)
				tColumn.SetOffsetLg(column.oflg)
				tColumn.SetOffsetXl(column.ofxl)
				'
				If ShowMatrix Then
					Dim matrix As String = $"R${LastRow}.C${LastColumn}"$
					tColumn.SetText(matrix)
				End If
				'detect if we have styles for the rc
				If rowStyles.ContainsKey(cellKey) Then
					Dim cm As Map = rowStyles.Get(cellKey)
					For Each strkey As String In cm.Keys
						Dim strVal As String = cm.Get(strkey)
						tColumn.SetStyleSingle(strkey, strVal)
					Next
				End If
				'
				'detect if we have classes for this row
				If rowClasses.ContainsKey(cellKey) Then
					'get keys and add them
					Dim cm As Map = rowClasses.Get(cellKey)
					Dim clsName As String = MapKeys2Delim(cm, " ")
					tColumn.AddClass(clsName)
				End If
				'
				'detect if we have an attribute
				If attributes.ContainsKey(cellKey) Then
					Dim cm As Map = attributes.Get(cellKey)
					For Each strkey As String In cm.Keys
						Dim strVal As String = cm.Get(strkey)
						tColumn.SetAttrSingle(strkey, strVal)
					Next
				End If
		
				If Components.ContainsKey(cellKey) Then
					Dim lst As List = Components.Get(cellKey)
					tColumn.AddContentList(lst)
				End If
				tRow.SetText(tColumn.ToString)
			Next
		Next
		Dim strRow As String = tRow.tostring
		sb.Append(strRow)
	Next
	Return sb.tostring
End Sub

'add a component to the grid as html
Sub AddComponent(rowPos As Int, colPos As Int, elHTML As String)
	rowPos = CStr(rowPos)
	colPos = CStr(colPos)
	If rowPos = "0" And colPos = "0" Then
		SetText(elHTML)
	Else
		Dim cellKey As String = $"${ID}r${rowPos}c${colPos}"$
		Dim lst As List
		If Components.ContainsKey(cellKey) Then
			lst = Components.Get(cellKey)
		Else
			lst.Initialize
		End If
		lst.Add(elHTML)
		Components.Put(cellKey,lst)
	End If
	hascontent = True
End Sub

'backward compatibility
Sub AddControl(el As VMElement, template As String, r As String, c As String, os As String, om As String, ol As String, oxl As String, s As String, m As String, l As String, xl As String)
	el.SetDeviceOffsets(os, om, ol,oxl)
	el.SetDevicePositions(r, c, s, m, l, xl)
	AddControl1(el, template)
End Sub

'add a control that will be automatically grid designed
Sub AddControlOnly(el As VMElement, template As String) As VMContainer
	AddControl1(el, template)
	Return Me
End Sub

'center content on RC
Sub SetCenterContentRC(r As Int, c As Int) As VMContainer
	SetJustifyRC(r, c, "center")
	SetAlignRC(r, c, "center")
	AddClassRC(r, c, Array("mx-auto"))
	Return Me
End Sub

'add a control that will be automatically grid designed
Sub AddControl1(el As VMElement, template As String)
	HasContent = True
	Controls.Add(el)
	bControls = True
	'get the row
	Dim r As String = el.R
	'get the column
	Dim c As String = el.c
	'
	If el.CenterOnParent = True Then
		SetJustifyRC(r, c, "center")
		SetAlignRC(r, c, "center")
		AddClassRC(r, c, Array("mx-auto"))
	End If
	
	Dim sRow As String = vue.PadRight(r,2,"0")
	Dim sCell As String = vue.PadRight(c,2,"0")
	Dim rcKey As String = $"${sRow}.${sCell}"$
	'to sort the rc locations by row and cel
	sortitM.Put(rcKey, el)
	If BANano.parseInt(r) > TotalRows Then
		TotalRows = BANano.parseInt(r)
	End If
	'
	Dim showKey As String = $"${el.vmodel}show"$
	Dim disKey As String = $"${el.vmodel}disabled"$
	Dim enaKey As String = $"${el.vmodel}required"$
	Dim errKey As String = $"${el.vmodel}error"$
	visibility.Put(showKey, el.Isvisible)
	'
	AddComponent(el.r, el.C, template)
	Select Case el.typeOf
	Case "checkbox", "switchbox", "switch"
		Dim newoption As CheckedUnchecked
		newoption.Initialize
		newoption.fieldname = el.vmodel
		newoption.checkedValue = el.Value
		newoption.uncheckedValue = el.UncheckedValue 
		afewoptions.Add(newoption)
	End Select
	'
	If DesignMode = False Then
		vue.SetStateSingle(showKey, el.Isvisible)
		vue.SetStateSingle(disKey, el.IsDisabled)
		vue.SetStateSingle(enaKey, el.IsRequired)
		If el.isarray Then
			vue.SetStateSingle(el.vmodel, vue.newlist)
		Else
			vue.SetStateSingle(el.vmodel, el.Value)
		End If
		vue.SetStateSingle(errKey, False)
	End If	
End Sub

'get component
Sub ToString As String
	If bControls Then CreateGrid
	
	'hold row counter
	LastRow = 0
	Dim sb As StringBuilder
	sb.Initialize
	'for each defined row, for each defined column
	Dim rowCnt As Int = 0
	Dim rowTot As Int = Rows.Size - 1
	For rowCnt = 0 To rowTot
		'get the row key, should be r1, r2 etc
		Dim rowKey As String = Rows.GetKeyAt(rowCnt)
		Dim currentRow As GridRow = Rows.Get(rowKey)
		Dim strRow As String = BuildRow(currentRow)
		sb.Append(strRow)
	Next
	'set the result of the container
	SetText(sb.tostring)
	Return Container.ToString
End Sub

Sub SetVModel(k As String) As VMContainer
	Container.SetVModel(k)
	Return Me
End Sub

'check if the row exists
Sub RowExists(rowPos As Int) As Boolean
	Dim rowcol As String = $"${ID}r${rowPos}"$
	Return Rows.ContainsKey(rowcol)
End Sub

'check if the column exist
Sub ColumnExists(rowPos As Int, colPos As Int) As Boolean
	Dim rowcol As String = $"${ID}r${rowPos}c${colPos}"$
	Return RC.ContainsKey(rowcol)
End Sub

'how many rows do we have
Sub HowManyRows() As Int
	Return LastRow
End Sub

Sub SetVIf(vif As String) As VMContainer
	Container.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMContainer
	Container.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMContainer
	Dim childHTML As String = child.ToString
	Container.SetText(childHTML)
	HasContent = True
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMContainer
	Container.SetText(t)
	HasContent = True
	Return Me
End Sub

Sub AddHTML(htmlContent As String) As VMContainer
	Container.SetText(htmlContent)
	HasContent = True
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMContainer
	Container.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMContainer
	Container.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMContainer
	Container.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set fluid
Sub SetFluid(varFluid As Boolean) As VMContainer
	If varFluid = False Then Return Me
	If cStatic Then
		SetAttrSingle("fluid", varFluid)
		Return Me
	End If
	Dim pp As String = $"${ID}Fluid"$
	vue.SetStateSingle(pp, varFluid)
	Container.Bind(":fluid", pp)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMContainer
	Container.UseTheme(themeName)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMContainer
	If varTag = "" Then Return Me
	Container.SetTag(varTag)
	Return Me
End Sub

Sub Hide As VMContainer
	Container.SetVisible(False)
	Return Me
End Sub

Sub Show As VMContainer
	Container.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMContainer
	Container.Enable(True)
	Return Me
End Sub

Sub Disable As VMContainer
	Container.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMContainer
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMContainer
	Container.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMContainer
	Container.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMContainer
	Container.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMContainer
	Container.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMContainer
	Container.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMContainer
	Container.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMContainer
	Container.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMContainer
	Container.SetAttrSingle(prop, value)
	Return Me
End Sub

' build the grid for a container
private Sub CreateGrid
	'get the keys and sort them
	'build the controls
	For Each el As VMElement In Controls
		If el.Exclude = True Then Exclusions.Add(el.id)
		'check exclusions
		Dim idxpos As Int = Exclusions.IndexOf(el.id)
		If idxpos = -1 Then
			Select Case el.typeOf
				Case "button", "list", "image", "label", "profile", "table", _
					"alert", "badge", "avatar","banner","nav"
					el.fieldType = ""
					el.IsRequired = False
				Case Else
					Fields.Add(el.vmodel)
					Defaults.Put(el.vmodel, el.value)
			End Select
			If el.isrequired Then Required.put(el.vmodel, el.ErrorMessage)
			If (el.vmodel <> "") And (el.fieldType <> "") Then
				Select Case el.fieldType
				Case "int"
					Integers.Add(el.vmodel)
				Case "bool"
					Booleans.Add(el.vmodel)
				Case "string"
					Strings.Add(el.vmodel)
				Case "date"
					Dates.Add(el.vmodel)
				Case "dbl"
					Doubles.Add(el.vmodel)
				End Select
			End If
		End If
	Next
	
	'define sort order of grid
	sortItL.Initialize
	For Each k As String In sortitM.Keys
		sortItL.Add(k)
	Next
	' sort the rcs
	sortItL.Sort(True)
	'find out if we have a missing rc
	Dim missingRC As List
	missingRC.Initialize
	For compCnt = 1 To TotalRows
		Dim sRow As String = compCnt
		sRow = vue.PadRight(sRow, 2, "0")
		Dim sCell As String = vue.PadRight("1", 2, "0")
		Dim rcKey As String = $"${sRow}.${sCell}"$
		If sortItL.IndexOf(rcKey) = -1 Then
			missingRC.Add(rcKey)
		End If
	Next
	If missingRC.Size -1 >= 0 Then
		For Each strRC As String In missingRC
			Log("VMContainer.CreateGrid: "& strRC & ": RC is NOT defined")
		Next
	End If
	'add the grid definition
	'link related columns to the rows use the sorted list
	'if we have records falling in the same row, sequence them
	Dim finalRows As Map
	finalRows.Initialize
	For Each strRC As String In sortItL
		Dim sRow As String = vue.MvField(strRC,1,".")
		If finalRows.ContainsKey(sRow) Then
			Dim finalCells As List = finalRows.Get(sRow)
		Else
			Dim finalCells As List
			finalCells.Initialize
		End If
		finalCells.Add(strRC)
		finalRows.Put(sRow,finalCells)
	Next
	'sort the row numbers
	'grid creates rows in sequence
	sortItL.Initialize
	For Each strRow As String In finalRows.Keys
		sortItL.Add(strRow)
	Next
	sortItL.Sort(True)
	Dim colCnt As Int
	For Each finalRow As String In sortItL
		'build the grid
		Dim finalCell(11) As String
		Dim ec(11) As VMElement
		
		'add the row
		Dim finalCells As List = finalRows.Get(finalRow)
		'how many controls do we have per row, add appropriate cells
		Dim finalCellsSize As Int = finalCells.Size - 1
		For colCnt = 0 To finalCellsSize
			finalCell(colCnt) = finalCells.Get(colCnt)
			ec(colCnt) = sortitM.Get(finalCell(colCnt))
		Next
		'add the row
		AddRows(1)
		Dim cellSize As Int
		For cellSize = 0 To finalCellsSize
			'add columns to the row
			AddColumnsOS(1, ec(cellSize).os, ec(cellSize).om, ec(cellSize).ol, ec(cellSize).ox, _
			ec(cellSize).ss, ec(cellSize).sm, ec(cellSize).sl, ec(cellSize).sx)
		Next
	Next
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMContainer
	Container.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMContainer
	Container.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMContainer
	Container.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMContainer
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMContainer
	Container.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMContainer
	Container.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMContainer
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMContainer
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub

'set onclick event
Sub SetOnClickRC(rowpos As Int, colpos As Int, methodName As String) As VMContainer
	methodName = methodName.tolowercase
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowpos)}c${CStr(colpos)}"$
	If colpos = 0 Then
		rowKey = $"${ID}r${CStr(rowpos)}"$
	End If
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	'add to methods
	vue.SetCallBack(methodName, cb)
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("@click",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

'set ontouch start event
Sub SetOnTouchStartRC(rowpos As Int, colpos As Int, methodName As String) As VMContainer
	methodName = methodName.tolowercase
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowpos)}c${CStr(colpos)}"$
	If colpos = 0 Then
		rowKey = $"${ID}r${CStr(rowpos)}"$
	End If
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	'add to methods
	vue.SetCallBack(methodName, cb)
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("@touchstart",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetOnDrop(methodName As String) As VMContainer
	Container.SetOnDrop(Module, methodName)
	Return Me
End Sub

Sub SetOnDragOver(methodName As String) As VMContainer
	Container.SetOnDragOver(Module, methodName)
	Return Me
End Sub

Sub SetOnDragOverRC(rowPos As Int, colPos As Int, methodName As String) As VMContainer
	methodName = methodName.tolowercase
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	'add to methods
	vue.SetCallBack(methodName, cb)
	
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("@dragover",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetOnDragStartRC(rowPos As Int, colPos As Int, methodName As String) As VMContainer
	methodName = methodName.tolowercase
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	'add to methods
	vue.SetCallBack(methodName, cb)
	
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("@dragstart",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetOnDragEndRC(rowPos As Int, colPos As Int, methodName As String) As VMContainer
	methodName = methodName.tolowercase
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	'add to methods
	vue.SetCallBack(methodName, cb)
	
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("@dragend",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetOnDragEnterRC(rowPos As Int, colPos As Int, methodName As String) As VMContainer
	methodName = methodName.tolowercase
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	'add to methods
	vue.SetCallBack(methodName, cb)
	
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("@dragenter",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetOnDropRC(rowPos As Int, colPos As Int, methodName As String) As VMContainer
	methodName = methodName.tolowercase
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	'add to methods
	vue.SetCallBack(methodName, cb)
	
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("@drop",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

'overwrite contents at rc
Sub BANanoReplaceRC(rowPos As Int, colPos As Int, elHTML As String)
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	Dim cellKey As String = $"#${rowKey}"$
	Dim elBody As BANanoElement
	elBody = BANano.GetElement(cellKey)
	If elBody <> Null Then
		elBody.Empty
		elBody.SetHTML(elHTML)
	End If
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMContainer
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If cStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Container.Bind(":color", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMContainer
	If varColor = "" Then Return Me
	If cStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Container.Bind(":color", pp)
	Return Me
End Sub