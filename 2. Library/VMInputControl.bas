B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public name As String
	Public label As String
	Public typeOf As String
	Public helperText As String
	Public errorText As String
	Public Required As Boolean
	Public clearable As Boolean
	Public sourceTable As String
	Public sourceField As String
	Public displayField As String
	Public fieldType As String
	Public Isvisible As Boolean
	Public defaultValue As Object
	Public options As Map
	Public MinValue As Int
	Public MaxValue As Int
	Public module As Object
	Public methodName As String
	Public IconName As String
	Public IsPrimary As Boolean
	Public IsAccent As Boolean
	Public IsDisabled As Boolean
	Public Text As String
	Public Description As String
	Public ThirdLine As String
	Public Lines As Int
	Public Key As String
	Public Source As String
	Public ActionIcon As String
	Public MenuIcon As String
	Public MenuClick As Boolean
	Public AddEdit As Boolean
	Public EditMethod As String
	Public DeleteMethod As String
	Public EditCaption As String
	Public DeleteCaption As String
	Public Row As String
	Public cell As String
	Public OffsetSmall As String
	Public OffsetMedium As String
	Public OffsetLarge As String
	Public OffsetXLarge As String
	Public SizeSmall As String
	Public SizeMedium As String
	Public SizeLarge As String
	Public SizeXLarge As String
	Public Visibility As String
	Public UseOptions As Boolean
	Public multiple As Boolean
	Public MarginTop As Object
	Public MarginBottom As Object
	Public MarginLeft As Object
	Public MarginRight As Object
	Public PaddingTop As Object
	Public PaddingBottom As Object
	Public PaddingLeft As Object
	Public PaddingRight As Object
	Public OptionsList As List
	Public MaxLength As Object
	Public TabIndex As Int
	Public AutoGrow As Boolean
	Public openonfocus As Boolean
	Public immediately As Boolean
	Public PlaceHolder As String
	Public ThumbLabel As Boolean
	Public Dense As Boolean
	Public IconSize As String
	Public Raised As Boolean
	Public Ripple As Boolean
	Public FitWidth As Boolean
	Public href As String
	Public MenuTrigger As Boolean
	Public IconButton As Boolean
	Public Plain As Boolean
	Public Mini As Boolean
	Public Fab As Boolean
	Public ListAction As Boolean
	Public ButtonType As String
	Public NavigateTo As String
	Public FabPosition As String
	Public FabFixed As Boolean
	Public Tag As String
	Public Width As String
	Public Height As String
	Public IsRound As Boolean
	Public Alt As String
	Public Count As String
	Public Start As String
	Public Finish As String
	Public Speed As String
	Public RefreshInterval As String
	Public BoxType As String
	Public IconColor As String
	Public IconBackgroundColor As String
	Public HoverZoomEffect As Boolean
	Public HoverExpandEffect As Boolean
	Public bSetCounter As Boolean
	Public Clickable As Boolean
	Public Deletable As Boolean
	Public TheLimit As String
	Public CheckDuplicates As Boolean
	Public InputType As String
	Public Static As Boolean
	'
	Public Footer As Boolean
	Public Format As String
	Public Locale As String
	Public Modal As Boolean
	Public Size As String
	Public Value As String
	Public ShowOtherMonths As Boolean
	Public CalendarWeeks As Boolean
	Public Header As Boolean
	Public Mode As String
	Public readonly As Boolean
	Public UseDataSource As Boolean
	Public TogglePassword As Boolean
	Public Exclude As Boolean
	Public DesignMode As Boolean
	Public ShowLabel As Boolean
	Public UncheckedValue As Object
	Public vmodel As String
	Public ActualID As String
	Public Host As String
	Public LabelOnTop As Boolean
End Sub

'Initializes the object.
Public Sub Initialize(sName As String) As VMInputControl
	sName = sName.tolowercase
	sName = sName.trim
	name = sName
	href = ""
	ActualID = ""
	TogglePassword = False
	UseDataSource = False
	HoverExpandEffect = False
	HoverZoomEffect = False
	bSetCounter = False
	typeOf = "text"
	fieldType = "string"
	defaultValue = Null
	Isvisible = True
	IsDisabled = False
	Required = False
	Clickable = False
	Deletable = False
	UseOptions = False
	multiple = False
	MarginTop = Null
	MarginBottom = Null
	MarginLeft = Null
	MarginRight = Null
	PaddingTop = Null
	PaddingBottom = Null
	PaddingLeft = Null
	PaddingRight = Null
	IsDisabled = False
	OptionsList.Initialize
	MaxLength = Null
	errorText = ""
	helperText = ""
	AutoGrow = False
	TabIndex = ""
	immediately = True
	openonfocus = False
	Dense = False
	Raised = True
	FitWidth = True
	Ripple = True
	MenuTrigger = False
	IconButton = False
	Plain = False
	Mini = False
	Fab = False
	ListAction = False
	IsPrimary = True
	IsAccent = False
	FabFixed = False
	Static = False
	CheckDuplicates = False
	readonly = False
	Exclude = False
	ShowLabel = True
	LabelOnTop = True
	SetRC(1,1)
	SetOffsets(0,0,0,0)
	SetSizes(12,12,12,12)
	Host = ""
	Return Me
End Sub

Sub SetVModel(vmdl As String) As VMInputControl
	vmodel = vmdl
	Return Me
End Sub

Sub SetMode(s As String) As VMInputControl
	Mode = s
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMInputControl
	DesignMode = b
	Return Me
End Sub

Sub SetHeader(b As Boolean) As VMInputControl
	Header = b
	Return Me
End Sub

Sub SetCalendarWeeks(cw As Boolean) As VMInputControl
	CalendarWeeks = cw
	Return Me
End Sub

Sub SetShowOtherMonths(som As Boolean) As VMInputControl
	ShowOtherMonths = som
	Return Me
End Sub

Sub SetValue(valu As String) As VMInputControl
	Value = valu
	Return Me
End Sub

Sub SetSize(sSize As String) As VMInputControl
	Size = sSize
	Return Me
End Sub

Sub SetFooter(b As Boolean) As VMInputControl
	Footer = b
	Return Me
End Sub

Sub SetFormat(fmt As String) As VMInputControl
	Format = fmt
	Return Me
End Sub

Sub SetLocale(loc As String) As VMInputControl
	Locale = loc
	Return Me
End Sub

Sub SetModal(mdl As Boolean) As VMInputControl
	Modal = mdl
	Return Me
End Sub

Sub SetTogglePassword(bTogglePassword As Boolean) As VMInputControl
	TogglePassword = bTogglePassword
	Return Me
End Sub


Sub SetName(sname As String) As VMInputControl
	sname = sname.tolowercase
	sname = sname.trim
	name = sname
	Return Me
End Sub


Sub SetLabelOnTop(bLabelOnTop As Boolean) As VMInputControl
	LabelOnTop = bLabelOnTop
	Return Me
End Sub

Sub SetExclude(b As Boolean) As VMInputControl
	Exclude = b
	Return Me
End Sub


Sub SetReadOnly(b As Boolean) As VMInputControl
	readonly = b
	Return Me
End Sub

Sub SetInputType(i As String) As VMInputControl
	InputType = i
	Return Me
End Sub

Sub SetCheckDuplicates(b As Boolean) As VMInputControl
	CheckDuplicates = b
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMInputControl
	Static = b
	Return Me
End Sub

Sub SetLimit(i As String) As VMInputControl
	TheLimit = i
	Return Me
End Sub

Sub SetClickable(b As Boolean) As VMInputControl
	Clickable = b
	Return Me
End Sub

Sub SetDeletable(b As Boolean) As VMInputControl
	Deletable = b
	Return Me
End Sub


Sub SetHoverExpandEffect(bHoverExpandEffect As Boolean) As VMInputControl
	HoverExpandEffect = bHoverExpandEffect
	Return Me
End Sub

Sub SetHoverZoomEffect(bHoverZoomEffect As Boolean) As VMInputControl
	HoverZoomEffect = bHoverZoomEffect
	Return Me
End Sub

Sub SetIconBackgroundColor(sIconBackgroundColor As String) As VMInputControl
	IconBackgroundColor = sIconBackgroundColor
	Return Me
End Sub

Sub SetIconColor(sIconColor As String) As VMInputControl
	IconColor = sIconColor
	Return Me
End Sub

Sub SetBoxType(sBoxType As String) As VMInputControl
	BoxType = sBoxType
	Return Me
End Sub


Sub SetRefreshInterval(sRefreshInterval As String) As VMInputControl
	RefreshInterval = sRefreshInterval
	Return Me
End Sub

Sub SetSpeed(sSpeed As String) As VMInputControl
	Speed = sSpeed
	Return Me
End Sub

Sub SetFinish(sFinish As String) As VMInputControl
	Finish = sFinish
	Return Me
End Sub

Sub SetStart(sStart As String) As VMInputControl
	Start = sStart
	Return Me
End Sub


Sub SetCount(sCount As String) As VMInputControl
	Count = sCount
	Return Me
End Sub

Sub SetRound(tg As Boolean) As VMInputControl
	IsRound = tg
	Return Me
End Sub

Sub SetAlt(tg As String) As VMInputControl
	Alt = tg
	Return Me
End Sub


Sub SetHeight(tg As String) As VMInputControl
	Height = tg
	Return Me
End Sub

Sub SetWidth(tg As String) As VMInputControl
	Width = tg
	Return Me
End Sub


Sub SetTag(tg As String) As VMInputControl
	Tag = tg
	Return Me
End Sub


Sub SetFabPositionTopRight As VMInputControl
	SetFabPosition("md-fab-top-right")
	Return Me
End Sub

Sub SetFabPositionTopCenter As VMInputControl
	SetFabPosition("md-fab-top-center")
	Return Me
End Sub

Sub SetFabPositionTopLeft As VMInputControl
	SetFabPosition("md-fab-top-left")
	Return Me
End Sub

Sub SetFabPositionBottomRight As VMInputControl
	SetFabPosition("md-fab-bottom-right")
	Return Me
End Sub

Sub SetFabPositionBottomCenter As VMInputControl
	SetFabPosition("md-fab-bottom-center")
	Return Me
End Sub

Sub SetFabPositionBottomLeft As VMInputControl
	SetFabPosition("md-fab-bottom-left")
	Return Me
End Sub

Sub SetFabPosition(pos As String) As VMInputControl
	FabPosition = pos
	Return Me
End Sub

Sub SetFabFixed(b As Boolean) As VMInputControl
	FabFixed = b
	Return Me
End Sub


Sub SetTo(sTo As String) As VMInputControl
	NavigateTo = sTo
	Return Me
End Sub

Sub SetButtonType(tt As String) As VMInputControl
	ButtonType = tt
	Return Me
End Sub

Sub SetButtonTypeRegular As VMInputControl
	ButtonType = "regular"
	Return Me
End Sub


Sub SetButtonTypeIcon As VMInputControl
	ButtonType = "icon"
	Return Me
End Sub


Sub SetButtonTypeFAB As VMInputControl
	ButtonType = "fab"
	Return Me
End Sub

Sub SetListAction(b As Boolean) As VMInputControl
	ListAction = b
	Return Me
End Sub

Sub SetFAB(b As Boolean) As VMInputControl
	Fab = b
	Return Me
End Sub

Sub SetMini(b As Boolean) As VMInputControl
	Mini = b
	Return Me
End Sub

Sub SetPlain(b As Boolean) As VMInputControl
	Plain = b
	Return Me
End Sub


Sub SetIconButton(b As Boolean) As VMInputControl
	IconButton = b
	Return Me
End Sub


Sub SetMenuTrigger(b As Boolean) As VMInputControl
	MenuTrigger = b
	Return Me
End Sub

Sub SetHREF(b As String) As VMInputControl
	href = b
	Return Me
End Sub

Sub SetFitWidth(b As Boolean) As VMInputControl
	FitWidth = b
	Return Me
End Sub


Sub SetRipple(b As Boolean) As VMInputControl
	Ripple = b
	Return Me
End Sub

Sub SetRaised(b As Boolean) As VMInputControl
	Raised = b
	Return Me
End Sub

Sub SetIconSize(icns As String) As VMInputControl
	IconSize = icns
	Return Me
End Sub

Sub SetThumbLabel(b As Boolean) As VMInputControl
	ThumbLabel = b
	Return Me
End Sub

Sub SetUseOptions(b As Boolean) As VMInputControl
	UseOptions = b
	Return Me
End Sub

Sub SetUseDataSource(b As Boolean) As VMInputControl
	UseDataSource = b
	Return Me
End Sub


Sub SetDense(b As Boolean) As VMInputControl
	Dense = b
	Return Me
End Sub

Sub SetPlaceHolder(txt As String) As VMInputControl
	PlaceHolder = txt
	Return Me
End Sub

Sub SetOpenOnFocus(b As Boolean) As VMInputControl
	openonfocus = b
	Return Me
End Sub

Sub SetImmediately(b As Boolean) As VMInputControl
	immediately = b
	Return Me
End Sub

Sub SetAutoGrow(b As Boolean) As VMInputControl
	If b = False Then Return Me
	AutoGrow = b
	Return Me
End Sub

Sub SetTabIndex(idx As Int) As VMInputControl
	TabIndex = idx
	Return Me
End Sub

Sub SetSwitch As VMInputControl
	typeOf = "switchbox"
	fieldType = "bool"
	Return Me
End Sub

Sub SetRadio As VMInputControl
	typeOf = "radio"
	Return Me
End Sub

Sub SetRadioGroup As VMInputControl
	typeOf = "radiogroup"
	fieldType = "string"
	Return Me
End Sub

Sub SetCheckBoxGroup As VMInputControl
	typeOf = "checkboxgroup"
	fieldType = "string"
	Return Me
End Sub

'
'Sub SetAutoComplete As VMInputControl
'	typeOf = "autocomplete"
'	Return Me
''End Sub

Sub SetChip As VMInputControl
	typeOf = "chip"
	fieldType = "string"
	InputType = "text"
	Return Me
End Sub

Sub SetChips As VMInputControl
	typeOf = "chips"
	fieldType = "string"
	InputType = "text"
	Return Me
End Sub

Sub SetCheckbox As VMInputControl
	typeOf = "checkbox"
	fieldType = "bool"
	Return Me
End Sub

Sub SetDatePicker As VMInputControl
	typeOf = "datepicker"
	fieldType = "date"
	Return Me
End Sub

Sub SetTimePicker As VMInputControl
	typeOf = "timepicker"
	fieldType = "string"
	Return Me
End Sub


Sub SetSelect As VMInputControl
	typeOf = "selectbox"
	Return Me
End Sub

Sub SetSlider As VMInputControl
	typeOf = "slide"
	Return Me
End Sub

Sub SetTextArea As VMInputControl
	typeOf = "textarea"
	Return Me
End Sub

Sub SetPassword As VMInputControl
	typeOf = "password"
	Return Me
End Sub

Sub SetEmail As VMInputControl
	typeOf = "email"
	Return Me
End Sub

Sub SetTel As VMInputControl
	typeOf = "tel"
	Return Me
End Sub

Sub SetDouble As VMInputControl
	fieldType = "dbl"
	Return Me
End Sub

Sub SetString As VMInputControl
	fieldType = "string"
	Return Me
End Sub

Sub SetNumber As VMInputControl
	typeOf = "number"
	Return Me
End Sub

Sub SetBool As VMInputControl
	fieldType = "bool"
	Return Me
End Sub

Sub SetInt As VMInputControl
	fieldType = "int"
	Return Me
End Sub

Sub SetDate As VMInputControl
	fieldType = "date"
	Return Me
End Sub

Sub SetButton As VMInputControl
	typeOf = "button"
	Return Me
End Sub

Sub SetList As VMInputControl
	typeOf = "list"
	Return Me
End Sub

'use a map for select options
Sub SetOptions(ssourceTable As String, soptions As Map, ssourceField As String, sdisplayField As String) As VMInputControl
	UseOptions = True
	UseDataSource = False
	sourceTable = ssourceTable
	options = soptions
	sourceField = ssourceField
	displayField = sdisplayField
	Return Me
End Sub

Sub SetDataSource(ssourceTable As String, ssourceField As String , sdisplayField As String) As VMInputControl
	UseOptions = False
	UseDataSource = True
	sourceTable = ssourceTable
	sourceField = ssourceField
	displayField = sdisplayField
	Return Me
End Sub

Sub SetLabel(lbl As String) As VMInputControl
	label = lbl
	Return Me
End Sub

Sub SetType(stypeOf As String) As VMInputControl
	typeOf = stypeOf
	Return Me
End Sub

Sub SetHelperText(txt As String) As VMInputControl
	If txt = "" Then Return Me
	helperText = txt
	Return Me
End Sub

Sub SetErrorText(txt As String) As VMInputControl
	If txt = "" Then Return Me
	errorText = txt
	Return Me
End Sub

Sub SetInvalidMessage(txt As String) As VMInputControl
	If txt = "" Then Return Me
	errorText = txt
	Return Me
End Sub

Sub SetMultiple(b As Boolean) As VMInputControl
	multiple = b
	Return Me
End Sub

Sub SetRequired(b As Boolean) As VMInputControl
	Required = b
	Return Me
End Sub

Sub SetClearable(b As Boolean) As VMInputControl
	clearable = b
	Return Me
End Sub

Sub SetSourceTable(ssourceTable As String) As VMInputControl
	sourceTable = ssourceTable
	Return Me
End Sub

Sub SetSourceField(ssourceField As String) As VMInputControl
	sourceField = ssourceField
	Return Me
End Sub

Sub SetDisplayField(sdisplayField As String) As VMInputControl
	displayField = sdisplayField
	Return Me
End Sub


Sub SetFieldType(sfieldType As String) As VMInputControl
	fieldType = sfieldType
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMInputControl
	Isvisible = b
	Return Me
End Sub

Sub SetHidden(b As Boolean) As VMInputControl
	If b = True Then
		SetVisible(False)
	Else
		SetVisible(True)
	End If
	Return Me
End Sub

Sub SetDefaultValue(sdefaultValue As Object) As VMInputControl
	defaultValue = sdefaultValue
	Return Me
End Sub

Sub SetMinValue(sMinValue As Int) As VMInputControl
	MinValue = sMinValue
	Return Me
End Sub

Sub SetMaxValue(sMaxValue As Int) As VMInputControl
	MaxValue = sMaxValue
	Return Me
End Sub

Sub SetMaxLength(sMaxValue As Int) As VMInputControl
	MaxLength = sMaxValue
	Return Me
End Sub

Sub SetModule(smodule As Object) As VMInputControl
	module = smodule
	Return Me
End Sub

Sub SetMethodName(smethodName As String) As VMInputControl
	methodName = smethodName
	Return Me
End Sub

Sub SetIconName(sIconName As String) As VMInputControl
	IconName = sIconName
	Return Me
End Sub


Sub SetPrimary(sIsPrimary As Boolean) As VMInputControl
	IsPrimary = sIsPrimary
	Return Me
End Sub

Sub SetAccent(sIsAccent As Boolean) As VMInputControl
	IsAccent = sIsAccent
	Return Me
End Sub

Sub SetDisabled(sIsDisabled As Boolean) As VMInputControl
	IsDisabled = sIsDisabled
	Return Me
End Sub

Sub SetText(sText As String) As VMInputControl
	Text = sText
	Return Me
End Sub

Sub SetDescription(sDescription As String) As VMInputControl
	Description = sDescription
	Return Me
End Sub

Sub SetThirdLine(sThirdLine As String) As VMInputControl
	ThirdLine = sThirdLine
	Return Me
End Sub

Sub SetLines(sLines As Int) As VMInputControl
	Lines = sLines
	Return Me
End Sub

Sub SetKey(sKey As String) As VMInputControl
	Key = sKey
	Return Me
End Sub

Sub SetSource(sSource As String) As VMInputControl
	Source = sSource
	Return Me
End Sub

Sub SetActionIcon(sActionIcon As String) As VMInputControl
	ActionIcon = sActionIcon
	Return Me
End Sub

Sub SetMenuIcon(sMenuIcon As String) As VMInputControl
	MenuIcon = sMenuIcon
	Return Me
End Sub

Sub SetMenuClick(sMenuClick As Boolean) As VMInputControl
	MenuClick = sMenuClick
	Return Me
End Sub

Sub SetAddEdit(sAddEdit As Boolean) As VMInputControl
	AddEdit = sAddEdit
	Return Me
End Sub

Sub SetEditMethod(sEditMethod As String) As VMInputControl
	EditMethod = sEditMethod
	Return Me
End Sub

Sub SetDeleteMethod(sDeleteMethod As String) As VMInputControl
	DeleteMethod = sDeleteMethod
	Return Me
End Sub

Sub SetEditCaption(sEditCaption As String) As VMInputControl
	EditCaption = sEditCaption
	Return Me
End Sub

Sub SetDeleteCaption(sDeleteCaption As String) As VMInputControl
	DeleteCaption = sDeleteCaption
	Return Me
End Sub

Sub SetRow(sRow As String) As VMInputControl
	Row = sRow
	Return Me
End Sub

Sub SetCell(scell As String) As VMInputControl
	cell = scell
	Return Me
End Sub

Sub SetRC(sRow As String, sCol As String) As VMInputControl
	SetRow(sRow)
	SetCell(sCol)
	Return Me
End Sub

Sub SetVisibility(sVisibility As String) As VMInputControl
	Visibility = sVisibility
	Return Me
End Sub

Sub SetOffsets(sOffsetSmall As String, sOffsetMedium As String,sOffsetLarge As String,sOffsetXLarge As String) As VMInputControl
	OffsetSmall = sOffsetSmall
	OffsetMedium = sOffsetMedium
	OffsetLarge = sOffsetLarge
	OffsetXLarge = sOffsetXLarge
	Return Me
End Sub

Sub SetSizes(sSizeSmall As String, sSizeMedium As String, sSizeLarge As String, sSizeXLarge As String) As VMInputControl
	SizeSmall = sSizeSmall
	SizeMedium = sSizeMedium
	SizeLarge = sSizeLarge
	SizeXLarge = sSizeXLarge
	Return Me
End Sub

Sub SetPosition(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMInputControl
	SetRC(srow,scell)
	SetSizes(small,medium,large,xlarge)
	Return Me
End Sub

Sub SetMargins(mt As Object, mb As Object, ml As Object, mr As Object) As VMInputControl
	MarginTop = mt
	MarginBottom = mb
	MarginLeft = ml
	MarginRight = mr
	Return Me
End Sub

Sub SetPadding(pt As Object, pb As Object, pl As Object, pr As Object) As VMInputControl
	PaddingTop = pt
	PaddingBottom = pb
	PaddingLeft = pl
	PaddingRight = pr
	Return Me
End Sub
Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMInputControl
InputControl.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
'Sub SetVisible(b As Boolean) As VMInputControl
InputControl.SetVisible(b)
Return Me
End Sub