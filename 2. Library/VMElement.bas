B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12,9
Sub Class_Globals
	Public Element As VueHTML
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Public hasContent As Boolean
	Public showKey As String
	Private disKey As String
	Private reqKey As String
	Private errKey As String
	Private styleKey As String
	Public DesignMode As Boolean
	Private bUsesStyles As Boolean
	Private bUsesRequired As Boolean
	Private bUsedDisabled As Boolean
	Private bUsesShow As Boolean
	Private bUsesVModel As Boolean
	Private bUsesClass As Boolean
	Public ErrorMessage As String
	
	'
	Public R As String
	Public C As String
	Public OS As String
	Public OM As String
	Public OL As String
	Public OX As String
	Public SS As String
	Public SM As String
	Public SL As String
	Public SX As String
	Public MT As String
	Public MB As String
	Public ML As String
	Public MR As String
	Public PT As String
	Public PB As String
	Public PL As String
	Public PR As String
	Public fieldType As String
	Public typeOf As String
	Public InputType As String
	Public Template As String
	Public IsVisible As Boolean 
	Public IsDisabled As Boolean
	Public IsRequired As Boolean
	Public IsArray As Boolean
	Public IsExcluded As Boolean
	Public ActualID As String
	Public Host As String
	Public Exclude As Boolean
	Public vmodel As String
	Public UncheckedValue As Object
	Public Value As Object
	Private bStatic As Boolean
	Public CenterOnParent As Boolean
	Private classList As List
	Private classKey As String
	Public password As String
End Sub

Public Sub Initialize(v As BANanoVue, sid As String) As VMElement
	ID = sid.ToLowerCase
	ID = ID.trim
	If IsValidID(ID) = False Then
		Log($"Your component ID '${ID}' should contain alphanumeric ONLY!"$)
	End If
	
	Element.Initialize(ID,"div")
	classList.Initialize 
	ErrorMessage = ""
	vue = v
	MT = ""
	MB = ""
	ML = ""
	MR = ""
	PT = ""
	PB = ""
	PL = ""
	PR = ""
	bStatic = False
	Value = Null
	UncheckedValue = Null
	Template = ""
	hasContent = False
	bUsesStyles = False
	bUsesRequired = False
	bUsedDisabled = False
	bUsesShow = False
	CenterOnParent = False
	bUsesVModel = False
	bUsesClass = False
	vmodel = ""
	
	showKey = $"${ID}show"$
	disKey = $"${ID}disabled"$
	reqKey = $"${ID}required"$
	errKey = $"${ID}error"$
	styleKey = $"${ID}style"$
	classKey = $"${ID}class"$
		
	If ID <> "" Then
		Dim SMp As Map = CreateMap()
		SetRef(ID)
		vue.SetStateSingle(showKey, True)
		vue.SetStateSingle(disKey, False)
		vue.SetStateSingle(reqKey, False)
		vue.SetStateSingle(errKey, False)
		vue.SetStateSingle(styleKey, SMp)
		vue.SetData(classKey, classList)
	End If
	'	
	DesignMode = False
	SetRC(1,1)
	SetDeviceOffsets(0,0,0,0)
	SetDeviceSizes(12,12,12,12)
	'
	password = $"${ID}password"$
	typeOf = "text"
	fieldType = "string"
	InputType = "text"
	
	IsVisible = True
	IsDisabled = False
	IsRequired = False
	IsArray = False
	IsExcluded = False
	ActualID = ""
	Host = ""
	Exclude = False
	Return Me
End Sub


Sub SetColumn As VMElement
	AddClass("column")
	Return Me
End Sub

Sub SetGridListXS As VMElement
	AddClass("grid-list-xs")
	Return Me
End Sub

Sub SetGridListSM As VMElement
	AddClass("grid-list-sm")
	Return Me
End Sub

Sub SetGridListMD As VMElement
	AddClass("grid-list-md")
	Return Me
End Sub

Sub SetGridListLG As VMElement
	AddClass("grid-list-lg")
	Return Me
End Sub

Sub SetGridListXL As VMElement
	AddClass("grid-list-xl")
	Return Me
End Sub


Sub AddCustomElement(eltag As String, elid As String, props As Map, eltext As String)
	AddElement1(eltag, elid, eltext, props, Null, Null, Null)
End Sub

'active class for router links
Sub SetActiveClass(sClass As String) As VMElement
	SetAttrSingle("active-class", sClass)
	Return Me
End Sub

Sub SetHideOnLeave(b As Boolean) As VMElement
	SetAttrSingle("hide-on-leave", b)
	Return Me
End Sub

Sub SetMode(sMode As String) As VMElement
	SetAttrSingle("mode", sMode)
	Return Me
End Sub

Sub CreateMETA() As VMElement
	Dim el As VMElement
	el.Initialize(vue, "").SetTag("meta")
	Return el
End Sub


Sub MoveUp(sTop As String) As VMElement
	SetAttrSingle("margin-top", sTop)
	SetStyleSingle("z-index","9999")
	Return Me
End Sub


Sub AddSpace() As VMElement
	SetText("{NBSP}")
	Return Me
End Sub

Sub SetErrorText(eTxt As String) As VMElement
	ErrorMessage = eTxt
	Return Me
End Sub

Sub IsValidID(idName As String) As Boolean
	If idName = "" Then Return True
	Dim slen As Int = idName.Length
	Dim i As Int = 0
	For i = 0 To slen - 1
		Dim mout As String = idName.CharAt(i)
		If "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".IndexOf(mout) = -1 Then
			Return False
		End If
	Next
	Return True
End Sub

Sub SetData(xprop As String, xValue As Object) As VMElement
	vue.SetData(xprop, xValue)
	Return Me
End Sub


Sub AddElement1(elTag As String, elID As String, elText As String, mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMElement
	Dim d As VMElement
	d.Initialize(vue, elID).SetTag(elTag)
	d.SetStatic(bStatic)
	d.SetDesignMode(DesignMode)
	d.BuildModel(mprops, mstyles, lclasses, loose)
	d.SetText(elText)
	SetText(d.ToString)
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMElement
	bStatic = b
	Return Me
End Sub

Sub SetRow(sRow As String) As VMElement
	R = sRow
	Return Me
End Sub

Sub SetRC(sRow As String, sCol As String) As VMElement
	SetRow(sRow)
	SetCell(sCol)
	Return Me
End Sub

Sub SetBorderRadius(size As String) As VMElement
	Element.SetStyleRound(size)
	Return Me
End Sub

Sub SetDeviceOffsets(sOffsetSmall As String, sOffsetMedium As String,sOffsetLarge As String,sOffsetXLarge As String) As VMElement
	OS = sOffsetSmall
	OM = sOffsetMedium
	OL = sOffsetLarge
	OX = sOffsetXLarge
	Return Me
End Sub

Sub SetDeviceSizes(sSizeSmall As String, sSizeMedium As String, sSizeLarge As String, sSizeXLarge As String) As VMElement
	SS = sSizeSmall
	SM = sSizeMedium
	SL = sSizeLarge
	SX = sSizeXLarge
	Return Me
End Sub

'set attribute sizes
Sub AddSizes(sSizeSmall As String, sSizeMedium As String, sSizeLarge As String, sSizeXLarge As String) As VMElement
	AddAttr("sm", sSizeSmall)
	AddAttr("xl", sSizeXLarge)
	AddAttr("md", sSizeMedium)
	AddAttr("lg", sSizeLarge)
	Return Me
End Sub

'set attribute offsets
Sub AddOffsets(sOffsetSmall As String, sOffsetMedium As String,sOffsetLarge As String,sOffsetXLarge As String) As VMElement
	AddAttr("offset-sm", sOffsetSmall)
	AddAttr("offset-xl", sOffsetXLarge)
	AddAttr("offset-md", sOffsetMedium)
	AddAttr("offset-lg", sOffsetLarge)
	Return Me
End Sub

Sub SetUncheckedValue(suncheckedValue As Object) As VMElement
	UncheckedValue = suncheckedValue
	Return Me
End Sub

Sub SetDouble As VMElement
	fieldType = "dbl"
	Return Me
End Sub


Sub SetNumber As VMElement
	typeOf = "number"
	Return Me
End Sub

Sub SetBool As VMElement
	fieldType = "bool"
	Return Me
End Sub

Sub SetInt As VMElement
	fieldType = "int"
	Return Me
End Sub

'set lazy-validation
Sub SetLazyValidation As VMElement
	If bStatic Then
		SetAttrSingle("lazy-validation", True)
		Return Me
	End If
	Dim pp As String = $"${ID}LazyValidation"$
	vue.SetStateSingle(pp, True)
	Bind(":lazy-validation", pp)
	Return Me
End Sub

Sub Validate
	vue.refs.GetField(ID).RunMethod("validate", Null)
End Sub

Sub Reset
	vue.refs.GetField(ID).RunMethod("reset", Null)
End Sub

Sub ResetValidation
	vue.refs.GetField(ID).RunMethod("resetValidation", Null)
End Sub

Sub SetFillHeight As VMElement
	AddClass("fill-height")
	Return Me
End Sub

Sub SetDate As VMElement
	fieldType = "date"
	Return Me
End Sub

Sub SetButton As VMElement
	typeOf = "button"
	Return Me
End Sub

Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMElement
	SetRC(srow,scell)
	SetDeviceSizes(small,medium,large,xlarge)
	Return Me
End Sub

Sub SetCell(scell As String) As VMElement
	C = scell
	Return Me
End Sub

Sub SetTextCenter As VMElement
	AddClass("text-center")
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMElement
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMElement
	Element.AddLooseAttribute(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMElement
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

Sub AddContentList(lst As List) As VMElement
	Element.AddContentList(lst)
	Return Me
End Sub

Sub AddSubHeader(Text As String) As VMElement
	Dim strLine As String = $"<v-subheader>${Text}</v-subheader>"$
	SetText(strLine)
	Return Me
End Sub

Sub AddVerticalDivider(className As String) As VMElement
	'create a spacer And add it To the appbar
	Dim elx As VMElement
	elx.Initialize(vue, "").SetTag("v-divider")
	elx.AddAttr("vertical", True)
	elx.AddClass(className)
	SetText(elx.ToString)
	Return Me
End Sub

Sub AddDivider As VMElement
	Dim el As VMElement
	el.Initialize(vue, "").SetTag("v-divider")
	SetText(el.tostring)
	Return Me
End Sub

Sub AddDivider1(className As String) As VMElement
	Dim el As VMElement
	el.Initialize(vue, "").SetTag("v-divider")
	el.AddClass(className)
	SetText(el.tostring)
	Return Me
End Sub

Sub AddSpacer As VMElement
	Dim el As VMElement
	el.Initialize(vue, "").SetTag("v-spacer")
	SetText(el.tostring)
	Return Me
End Sub

Sub AddSpacer1(className As String) As VMElement
	Dim el As VMElement
	el.Initialize(vue, "").SetTag("v-spacer")
	el.AddClass(className)
	SetText(el.tostring)
	Return Me
End Sub

Sub SetFlat(b As Boolean) As VMElement
	SetAttrSingle("text", True)
	Return Me
End Sub

Sub SetFluid As VMElement
	SetAttrSingle("fluid", True)
	Return Me
End Sub

Sub SetDense As VMElement
	SetAttrSingle("dense", True)
	Return Me
End Sub

Sub SetElevation(elNum As String) As VMElement
	AddClass($"elevation-${elNum}"$)
	SetAttrSingle("elevation", BANano.parseInt(elNum))
	Return Me
End Sub


'set onchange event
Sub SetOnChange(eventHandler As Object, source As String) As VMElement
	source = source.tolowercase
	Dim methodName As String  = $"${source}_change"$
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim sval As String
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(sval))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub SetStyleRound(size As String) As VMElement
	Element.SetStyleRound(size)
	Return Me
End Sub

Sub EnableItem(elID As String) As VMElement
	elID = elID.tolowercase
	vue.SetStateSingle($"${elID}disabled"$, False)
	Return Me
End Sub

Sub DisableItem(elID As String) As VMElement
	elID = elID.tolowercase
	vue.SetStateSingle($"${elID}disabled"$, True)
	Return Me
End Sub


Sub HideItem(elID As String) As VMElement
	elID = elID.tolowercase
	vue.SetStateSingle($"${elID}show"$, False)
	Return Me
End Sub

Sub ShowItem(elID As String) As VMElement
	vue.SetStateSingle($"${elID}show"$, True)
	Return Me
End Sub

Sub SetContainer(b As Boolean) As VMElement
	If b = False Then Return Me
	AddClass("container")
	Return Me
End Sub

Sub CenterAlign As VMElement
	SetStyleSingle("text-align", "center")
	SetStyleSingle("display", "inline-block")
	Return Me
End Sub

Sub AddChildDiv(divID As String, divClass As String) As VMElement
	Dim childDiv As VMElement
	childDiv.Initialize(vue, divID).AddClass(divClass)
	childDiv.SetDesignMode(DesignMode)
	AddChild(childDiv)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMElement
	Element.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub


Sub SetStyleSingle(prop As String, vals As Object) As VMElement
	Dim attr As Map = CreateMap()
	attr.Put(prop, vals)
	SetStyle(attr)
	Return Me
End Sub

Sub SetDark(b As Boolean) As VMElement
	If bStatic Then
		SetAttrSingle("dark", b)
		Return Me
	End If
	Dim pp As String = $"${ID}dark"$
	vue.SetStateSingle(pp, b)
	Bind(":dark", pp)
	Return Me
End Sub


Sub SetAttrSingle(prop As String, vals As String) As VMElement
	Dim attr As Map = CreateMap()
	attr.Put(prop, vals)
	SetAttr(attr)
	Return Me
End Sub

Sub Required(b As Boolean) As VMElement
	If ID = "" Then Return Me
	IsRequired = b
	bUsesRequired = True
	If bStatic Then
		SetAttrSingle("required", b)
		vue.SetStateSingle(errKey, False)
		Return Me
	End If
	vue.SetStateSingle(reqKey, b)
	vue.SetStateSingle(errKey, False)
	Bind(":required", reqKey)
	Return Me
End Sub

Sub Enable(b As Boolean) As VMElement
	If ID = "" Then Return Me
	Dim n As Boolean = Not(b)
	IsDisabled = n
	bUsedDisabled = True
	If bStatic Then
		SetAttrSingle("disabled", n)
		Return Me
	End If
	vue.SetStateSingle(disKey, n)
	Bind(":disabled", disKey)
	Return Me
End Sub

Sub Disable(b As Boolean) As VMElement
	If ID = "" Then Return Me
	IsDisabled = b
	bUsedDisabled = True
	If bStatic Then
		SetAttrSingle("disabled", b)
		Return Me
	End If
	vue.SetStateSingle(disKey, b)
	Bind(":disabled", disKey)
	Return Me
End Sub

'show using id
Sub Show As VMElement
	IsVisible = True
	vue.SetStateSingle(showKey, True)
	Return Me
End Sub

'hide using id
Sub Hide As VMElement
	IsVisible = False
	vue.SetStateSingle(showKey, False)
	Return Me
End Sub

'set vshow
Sub SetVisible(b As Boolean) As VMElement
	IsVisible = b
	SetVShow(showKey)
	vue.SetStateSingle(showKey, b)
	Return Me
End Sub

Sub SetPlaceholder(varPlaceholder As String) As VMElement
	Element.SetAttrPlaceHolder(varPlaceholder)
	Return Me
End Sub

Sub SetAttr1(attr As String, vals As Object) As VMElement
	Dim opt As Map = CreateMap()
	opt.Put(attr, vals)
	SetAttr(opt)
	Return Me
End Sub

Sub MakePx(sValue As String) As String
	Return Element.MakePx(sValue)
End Sub

Sub SetFor(f As String) As VMElement
	SetAttrSingle("for", f)
	Return Me
End Sub

Sub SetVCloak As VMElement
	Element.setvcloak
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMElement
	If ti = "" Then Return Me
	If ti = "0" Then Return Me
	If ti = Null Then Return Me
	Element.SetTabIndex(ti)
	Return Me
End Sub

Sub SetMethodPost As VMElement
	SetAttr(CreateMap("method":"POST"))
	Return Me
End Sub

Sub SetDraggable(b As Boolean) As VMElement
	If bStatic Then
		SetAttrSingle("draggable", b)
		Return Me
	End If
	SetAttr(CreateMap(":draggable":b))
	Return Me
End Sub

Sub SetDroppable(b As Boolean) As VMElement
	If bStatic Then
		SetAttr(CreateMap("droppable":b))
		Return Me
	End If
	SetAttr(CreateMap(":droppable":b))
	Return Me
End Sub


Sub SetWidth(w As String) As VMElement
	SetStyle(CreateMap("width":w))
	Return Me
End Sub

Sub SetHeight(h As String) As VMElement
	SetStyle(CreateMap("height":h))
	Return Me
End Sub

'set the border of the element
Sub SetBorder(width As String, color As String, bstyle As String) As VMElement
	Dim b As Map = CreateMap()
	b.Put("border-style", bstyle)
	b.Put("border-width", width)
	b.Put("border-color", color)
	SetStyle(b)
	Return Me
End Sub

Sub SetJustify(just As String) As VMElement
	Dim skey As String = $"justify-${just}"$
	SetAttrSingle(skey, skey)
	Return Me
End Sub

Sub SetAlign(align As String) As VMElement
	Dim skey As String = $"align-${align}"$
	SetAttrSingle(skey, skey)
	Return Me
End Sub

'set cursor move
Sub SetCursorMove As VMElement
	SetStyle(CreateMap("cursor": "move"))
	Return Me
End Sub

Sub SetCursorPointer As VMElement
	SetStyle(CreateMap("cursor": "pointer"))
	Return Me
End Sub

Sub SetTextAlignCenter As VMElement
	SetStyle(CreateMap("text-align": "center"))
	Return Me
End Sub

'clear the text content of the element
Sub Clear As VMElement
	Element.clear
	Return Me
End Sub

Sub SetSlot(sltValue As String) As VMElement
	SetAttrSingle("slot", sltValue)
	Return Me
End Sub

Sub SetSlotScope(sltValue As String) As VMElement
	SetAttrSingle("slot-scope", sltValue)
	Return Me
End Sub

Sub SetType(stypeOf As String) As VMElement
	SetAttrSingle("type", stypeOf)
	Return Me
End Sub

Sub RemoveClass(className As String) As VMElement
	Element.removeClass(className)
	Return Me
End Sub

Sub SetEvent(eventName As String, methodName As String) As VMElement
	methodName = methodName.tolowercase
	SetAttrSingle(eventName, methodName)
	Return Me
End Sub


Sub SetOnMouseOut(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	SetAttr(CreateMap("@mouseout": methodName))
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnMouseOver(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	SetAttr(CreateMap("@mouseover": methodName))
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetKey(k As Object, bBind As Boolean) As VMElement
	If bBind Then
		If vue.StateExists(k) = False Then vue.SetStateSingle(k, DateTime.now)
		RemoveAttr("key")
		SetAttrSingle(":key", k)
	Else
		RemoveAttr(":key")
		SetAttrSingle("key", k)
	End If
	Return Me
End Sub

Sub SetIs(t As String) As VMElement
	t = t.tolowercase
	SetAttr(CreateMap(":is": t))
	Return Me
End Sub


Sub SetRef(varRef As String) As VMElement
	If varRef <> "" Then
		SetAttr(CreateMap("ref": varRef))
	End If
	Return Me
End Sub

Sub SetVText(t As Object) As VMElement
	SetAttr(CreateMap("v-text": t))
	Return Me
End Sub

Sub SetVElse(t As Object) As VMElement
	SetAttr(CreateMap("v-else": t))
	Return Me
End Sub

Sub SetVElseIf(t As Object) As VMElement
	SetAttr(CreateMap("v-else-if": t))
	Return Me
End Sub

Sub SetVOn(t As Object) As VMElement
	SetAttr(CreateMap("v-on": t))
	Return Me
End Sub

Sub SetVBind(t As String) As VMElement
	t = t.tolowercase
	SetAttr(CreateMap("v-bind": t))
	Return Me
End Sub

Sub SetVBindIs(t As String) As VMElement
	t = t.tolowercase
	SetAttr(CreateMap("v-bind:is": t))
	Return Me
End Sub

Sub SetVOnce(t As Boolean) As VMElement
	If t = False Then Return Me
	SetAttrLoose("v-once")
	Return Me
End Sub

'bind dynamic component
Sub BindDynamicComponent(viewID As String, compID As String) As VMElement
	viewID = viewID.ToLowerCase
	compID = compID.tolowercase
	SetVBindIs(viewID)
	vue.SetData(viewID, compID)
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMElement
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	If vue.StateExists(dataSource) = False Then vue.SetStateSingle(dataSource, vue.newlist)
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttr(CreateMap("v-for": sline))
	RemoveAttr("ref")
	Return Me
End Sub

'set value
Sub SetValue(svalue As String) As VMElement
	If bStatic Then
		SetAttrSingle("value", svalue)
		Return Me
	End If
	If vmodel = "" Then
		vmodel = $"${ID}value"$
		SetVModel(vmodel)
	End If
	vue.setdata(vmodel, svalue)
	Return Me
End Sub

'set template
Sub SetTemplate(tmp As String) As VMElement
	Element.Clear
	SetText(tmp)
	Return Me
End Sub

Sub SetVHtml(h As String) As VMElement
	If h = "" Then Return Me
	h = h.tolowercase
	If vue.StateExists(h) = False Then vue.SetStateSingle(h, Null)
	SetAttrSingle("v-html", h)
	Return Me
End Sub

Sub SetAutoComplete(auto As String) As VMElement
	SetAttr(CreateMap("autocomplete": auto))
	Return Me
End Sub

Sub SetName(n As String, bBind As Boolean) As VMElement
	If bBind Then
		RemoveAttr("name")
		SetAttr(CreateMap(":name": n))
	Else
		RemoveAttr(":name")
		SetAttr(CreateMap("name": n))
	End If
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMElement
	Element.RemoveAttr(sName)
	Return Me
End Sub

Sub SetID(n As String, bBind As Boolean) As VMElement
	If bBind Then
		RemoveAttr("id")
		SetAttr(CreateMap(":id": n))
	Else
		RemoveAttr(":id")
		SetAttr(CreateMap("id": n))
	End If
	Return Me
End Sub

Sub SetVIf(vif As String) As VMElement
	vif = vif.ToLowerCase
	If vue.HasState(vif) = False Then vue.SetStateFalse(vif)
	Element.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMElement
	vif = vif.ToLowerCase
	bUsesShow = False
	If vif <> "show" Then
		bUsesShow = True
		If vue.HasState(vif) = False Then vue.SetStateFalse(vif)
		Element.SetVShow(vif)
	End If
	Return Me
End Sub

Sub BindStyle(optm As Map) As VMElement
	If ID = "" Then Return Me
	bUsesStyles = True
	Dim nm As Map = CreateMap()
	If vue.HasState(styleKey) = False Then
		Dim SMp As Map = CreateMap()
		vue.SetData(styleKey, SMp)
	End If
	Dim oldm As Map = vue.GetState(styleKey, nm)
	For Each k As String In optm.Keys
		Dim v As Object = optm.Get(k)
		oldm.Put(k, v)
	Next
	vue.SetStateSingle(styleKey, oldm)
	SetAttrSingle(":style", styleKey)
	Return Me
End Sub

Sub BindStyleSingle(prop As String, optm As String) As VMElement
	If ID = "" Then Return Me
	Dim nm As Map = CreateMap()
	nm.Put(prop, optm)
	BindStyle(nm)
	Return Me
End Sub

'add break
Sub AddBR As VMElement
	SetText("<br>")
	Return Me
End Sub

'add hr
Sub AddHR As VMElement
	SetText("<hr>")
	Return Me
End Sub

'add a class
Sub AddClass(className As String) As VMElement
	Element.AddClass(className)
	hasContent = True
	Return Me
End Sub

'add a class
Sub AddDynamicClass(className As String) As VMElement
	If vue.hasstate(classKey) = False Then
		vue.SetData(classKey, vue.NewList)
	End If
	classList = vue.GetData(classKey)
	Dim cpos As Int = classList.IndexOf(className)
	cpos = BANano.parseInt(cpos)
	If cpos = -1 Then classList.Add(className)
	vue.SetData(classKey, classList)
	hasContent = True
	bUsesClass = True
	Return Me
End Sub

Sub BindClass(className As String) As VMElement
	AddDynamicClass(className)
	Return Me
End Sub

'add a class
Sub AddClassDynamic(className As String) As VMElement
	AddDynamicClass(className)
	Return Me
End Sub

Sub RemoveClassDynamic(className As String) As VMElement
	RemoveDynamicClass(className)
	Return Me
End Sub


Sub RemoveDynamicClass(className As String) As VMElement
	If vue.hasstate(classKey) = False Then
		vue.SetData(classKey, vue.NewList)
	End If
	classList = vue.GetData(classKey)
	Dim cpos As Int = classList.IndexOf(className)
	cpos = BANano.parseInt(cpos)
	If cpos <> -1 Then classList.RemoveAt(cpos)
	vue.SetData(classKey, classList)
	hasContent = True
	bUsesClass = True
	Return Me
End Sub


'render the element to parent element
Sub Render1(Parent As String)
	BANano.GetElement(Parent).Append(ToString)
End Sub

'add to parent
Sub Pop1(p As VMElement)
	p.AddChild(Me)
End Sub


'set color
Sub SetColor(varColor As String) As VMElement
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Bind(":color", pp)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMElement
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Bind(":color", pp)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMElement
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMElement
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMElement
	Element.SetStyles(m)
	Return Me
End Sub

'add a child element
Sub AddChild(child As VMElement) As VMElement
	Dim childHTML As String = child.ToString
	SetText(childHTML)
	Return Me
End Sub

'add children
Sub AddChildren(children As List) As VMElement
	For Each childx As VMElement In children
		AddChild(childx)
	Next
	Return Me
End Sub

'set padding
Sub SetBackgroundColor(p As Object) As VMElement
	SetStyle(CreateMap("background-color":p))
	Return Me
End Sub

Sub SetMarginAll(p As Object) As VMElement
	SetStyle(CreateMap("margin":p))
	Return Me
End Sub

Sub SetPaddingAll(p As Object) As VMElement
	SetStyle(CreateMap("padding":p))
	Return Me
End Sub

Sub SetMaxWidth(mw As String) As VMElement
	Element.SetStyle("max-width",mw)
	Return Me
End Sub


Sub SetMaxHeight(mw As String) As VMElement
	Element.SetStyle("max-height",mw)
	Return Me
End Sub

Sub SetOutlined() As VMElement
	SetAttrSingle("outlined",True)
	Return Me
End Sub

Sub SetTo(t As String) As VMElement
	SetAttrSingle("to", t)
	Return Me
End Sub

Sub SetHREF(h As String) As VMElement
	Element.SetAttrHREF(h)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMElement
	If ID = "" Then Return Me
	bUsedDisabled = b
	IsDisabled = b
	vue.SetStatesingle(disKey, b)
	SetAttrSingle(":disabled", disKey)
	Return Me
End Sub

Sub SetRequired(b As Boolean) As VMElement
	IsRequired = b
	bUsesRequired = True
	If bStatic Then
		SetAttrSingle("required", b)
		Return Me
	End If
	If ID = "" Then Return Me
	vue.SetStateSingle(reqKey, b)
	SetAttrSingle(":required", reqKey)
	vue.SetStateSingle(errKey, False)
	Return Me
End Sub

Sub SetAttr(m As Map) As VMElement
	hasContent = True
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		Select Case k
		Case ":disabled"
			bUsedDisabled = True
		Case ":required"
			bUsesRequired = True
		Case ":style"
			bUsesStyles = True
		Case "v-show"
			bUsesShow = True
		Case "v-model"
			bUsesVModel = True
		Case ":class"
			bUsesClass = True
		End Select
		Element.SetAttr(k, v)
	Next
	Return Me
End Sub

Sub SetBackgroundImage(sURL As String) As VMElement
	Element.SetStyle("background-image", $"url('${sURL}')"$)
	Element.SetStyle("background-size", "100% 100%")
	
'	background: URL(images/bg.jpg) no-repeat center center fixed;
'	-webkit-background-size: cover;
'	-moz-background-size: cover;
'	-o-background-size: cover;
'	background-size: cover;
	Return Me
End Sub

Sub SetSRC(s As String, bbind As Boolean) As VMElement
	If bbind Then
		SetAttr(CreateMap(":src":s))
	Else
		SetAttr(CreateMap("src":s))
	End If
	Return Me
End Sub

Sub SetAlt(a As String) As VMElement
	Element.SetAlt(a)
	Return Me
End Sub

Sub SetVerticalAlignMiddle As VMElement
	SetStyle(CreateMap("vertical-align": "middle"))
	Return Me
End Sub

Sub SetLineHeight(lh As Object) As VMElement
	SetStyle(CreateMap("line-height": lh))
	Return Me
End Sub

Sub SetTagSpan(b As Boolean) As VMElement
	Element.SetTag("span")
	Return Me
End Sub

'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMElement
	prop = prop.tolowercase
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


Sub SetVModel(k As String) As VMElement
	k = k.tolowercase
	bUsesVModel = False
	If k = "value" Then Return Me
	vmodel = k
	If vue.HasState(k) = False Then
		vue.SetData(k, Null)
	End If
	SetAttrSingle("v-model", k)
	bUsesVModel = True
	Return Me
End Sub


Sub SetChecked(b As Boolean) As VMElement
	SetAttr(CreateMap(":checked":b))
	Return Me
End Sub

Sub SetTag(t As String) As VMElement
	Element.SetTag(t)
	Return Me
End Sub

Sub AddElements(lst As List) As VMElement
	For Each li As VMElement In lst
		SetText(li.tostring)
	Next
	Return Me
End Sub

Sub AddElement(el As VMElement) As VMElement
	SetText(el.ToString)
	Return Me
End Sub

Sub SetText(t As String) As VMElement
	Element.SetText(t)
	hasContent = True
	Return Me
End Sub

Sub AddComponent(comp As String) As VMElement
	SetText(comp)
	Return Me
End Sub

'add to parent element
Sub Pop(p As VMElement)
	If hasContent Then p.SetText(ToString)
End Sub

Sub ToString As String
	If bUsesStyles = False Then
		RemoveAttr(":style")
		vue.RemoveData(styleKey)
	End If
	If bUsesRequired = False Then
		RemoveAttr(":required")
		vue.removedata(reqKey)
		vue.RemoveData(errKey)
	End If
	If bUsedDisabled = False Then
		RemoveAttr(":disabled")
		vue.RemoveData(disKey)
	End If
	If bUsesShow = False Then
		RemoveAttr("v-show")
	End If
	If bUsesVModel = False Then
		RemoveAttr("v-model")
	End If
	If classList.Size = 0 Then
		bUsesClass = False
	Else
		vue.SetData(classKey, classList)
		SetAttrSingle(":class", classKey)
		bUsesClass = True
	End If
	If bUsesClass = False Then
		RemoveAttr(":class")
		vue.RemoveData(classKey)
	End If
	If DesignMode Then
		RemoveAttributes(Array("v-show", ":disabled", ":required", ":class", "v-model", "tabindex", ":style"))
		vue.RemoveData(styleKey)
		vue.removedata(reqKey)
		vue.RemoveData(disKey)
		vue.RemoveData(classKey)
		vue.RemoveData(errKey)
	End If
	'save the template
	Template = Element.tostring
	Return Template
End Sub

Sub RemoveVShow As VMElement
	RemoveAttr("v-show")
	bUsesShow = False
	Return Me
End Sub

Sub RemoveVIf As VMElement
	RemoveAttr("v-if")
	bUsesShow = False
	Return Me
End Sub

Sub RemoveVModel As VMElement
	RemoveAttr("v-model")
	bUsesVModel = False
	Return Me
End Sub

'remove mutliple attributes
Sub RemoveAttributes(attrs As List) As VMElement
	For Each s As String In attrs
		RemoveAttr(s)
	Next
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'Triggered when input value changed
Sub SetOnInput(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("@input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'Triggered when input gets focus
Sub SetOnFocus(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("@focus": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnClear(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("@md-clear": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'Triggered when input loses focus
Sub SetOnBlur(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("@blur": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'set pointer
Sub SetPointer(b As Boolean) As VMElement
	Element.SetPointer(True)
	Return Me
End Sub

Sub SetHiddenMdAndUp As VMElement
	AddClass("hidden-md-and-up")
	RemoveVShow
	RemoveVIf
	Return Me
End Sub

'set onclick event
Sub SetOnClick(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	SetAttrSingle("@click", methodName)
	vue.SetMethod(module, methodName)
	Return Me
End Sub

'link an event to the element
Sub SetOnEvent(module As Object, eventName As String,methodName As String, args As String) As VMElement
	methodName = methodName.tolowercase
	eventName = eventName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	SetAttrSingle($"v-on:${eventName}"$, methodName & $"(${args})"$)
	vue.SetMethod(module, methodName)
	Return Me
End Sub

'set onclick stop
Sub SetOnClickStop(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	SetAttrSingle("@click.stop", methodName)
	vue.SetMethod(module, methodName)
	Return Me
End Sub

'set ontouch start event
Sub SetOnTouchStart(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("@touchstart": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDragOver(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("@dragover": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDragStart(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	SetDraggable(True)
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("@dragstart": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDragEnd(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("@dragend": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDragEnter(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("@dragenter": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDrop(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("@drop": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'set all around margins
Sub SetMargins(sMT As String, sMB As String, sML As String, sMR As String) As VMElement
	SetStyleSingle("margin-top", sMT)
	SetStyleSingle("margin-bottom", sMB)
	SetStyleSingle("margin-left", sML)
	SetStyleSingle("margin-right", sMR)
	MT = sMT
	MB = sMB
	ML = sML
	MR = sMR
	Return Me
End Sub
'
Sub SetPadding(sPT As String, sPB As String, sPL As String, sPR As String) As VMElement
	SetStyleSingle("padding-top", sPT)
	SetStyleSingle("padding-bottom", sPB)
	SetStyleSingle("padding-left", sPL)
	SetStyleSingle("padding-right", sPR)
	PT = sPT
	PB = sPB
	PL = sPL
	PR = sPR
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMElement
	Element.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


'set position
Sub SetPosition(sposition As String) As VMElement
	If sposition = "" Then Return Me
	If bStatic Then
		SetAttrSingle("position", sposition)
		Return Me
	End If
	Dim pp As String = $"${ID}position"$
	vue.SetStateSingle(pp, sposition)
	Bind(":position", pp)
	Return Me
End Sub


'set top
Sub SetTop(stop As String) As VMElement
	If stop = "" Then Return Me
	If bStatic Then
		SetAttrSingle("top", stop)
		Return Me
	End If
	Dim pp As String = $"${ID}top"$
	vue.SetStateSingle(pp, stop)
	Bind(":top", pp)
	Return Me
End Sub


'set bottom
Sub SetBottom(sbottom As String) As VMElement
	If sbottom = "" Then Return Me
	If bStatic Then
		SetAttrSingle("bottom", sbottom)
		Return Me
	End If
	Dim pp As String = $"${ID}bottom"$
	vue.SetStateSingle(pp, sbottom)
	Bind(":bottom", pp)
	Return Me
End Sub


'set left
Sub SetLeft(sleft As String) As VMElement
	If sleft = "" Then Return Me
	If bStatic Then
		SetAttrSingle("left", sleft)
		Return Me
	End If
	Dim pp As String = $"${ID}left"$
	vue.SetStateSingle(pp, sleft)
	Bind(":left", pp)
	Return Me
End Sub


'set right
Sub SetRight(sright As String) As VMElement
	If sright = "" Then Return Me
	If bStatic Then
		SetAttrSingle("right", sright)
		Return Me
	End If
	Dim pp As String = $"${ID}right"$
	vue.SetStateSingle(pp, sright)
	Bind(":right", pp)
	Return Me
End Sub

'add this element to parent
Sub AddToParent(parent As VMElement) As VMElement
	parent.SetText(ToString)
	Return Me
End Sub

Sub AddAttr(attr As String, attrValue As String) As VMElement
	SetAttrSingle(attr, attrValue)
	Return Me
End Sub

Sub AddStyle(styleName As String, styleValue As String) As VMElement
	SetStyleSingle(styleName, styleValue)
	Return Me
End Sub

'add multiple styles
Sub AddStyles(m As Map) As VMElement
	For Each k As String In m.Keys
		Dim v As String = m.Get(k)
		AddStyle(k,v)
	Next
	Return Me
End Sub

'add multiple attributes
Sub AddAttributes(m As Map) As VMElement
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		SetAttrSingle(k, v)
	Next
	Return Me
End Sub

Sub SetOnKeydownEnter(eventHandler As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@keydown.enter": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetRounded As VMElement
	AddClass("rounded")
	Return Me
End Sub

Sub SetRounded_SM As VMElement
	AddClass("rounded-sm")
	Return Me
End Sub

Sub SetRounded_LG As VMElement
	AddClass("rounded-lg")
	Return Me
End Sub

Sub SetRounded_XL As VMElement
	AddClass("rounded-xl")
	Return Me
End Sub


Sub SetRounded_Pill As VMElement
	AddClass("rounded-pill")
	Return Me
End Sub

Sub SetRounded_Circle As VMElement
	AddClass("rounded-circle")
	Return Me
End Sub

Sub SetRounded_Top(Size As String) As VMElement
	If Size = "" Then
		AddClass("rounded-t")
	Else
		AddClass($"rounded-t-${Size}"$)
	End If
	Return Me
End Sub

Sub SetRounded_Bottom(Size As String) As VMElement
	If Size = "" Then
		AddClass("rounded-b")
	Else
		AddClass($"rounded-b-${Size}"$)
	End If
	Return Me
End Sub

Sub SetRounded_Right(Size As String) As VMElement
	If Size = "" Then
		AddClass("rounded-r")
	Else
		AddClass($"rounded-r-${Size}"$)
	End If
	Return Me
End Sub

Sub SetRounded_Left(Size As String) As VMElement
	If Size = "" Then
		AddClass("rounded-l")
	Else
		AddClass($"rounded-l-${Size}"$)
	End If
	Return Me
End Sub

Sub SetRounded_TopLeft(Size As String) As VMElement
	If Size = "" Then
		AddClass("rounded-tl")
	Else
		AddClass($"rounded-tl-${Size}"$)
	End If
	Return Me
End Sub

Sub SetRounded_TopRight(Size As String) As VMElement
	If Size = "" Then
		AddClass("rounded-tr")
	Else
		AddClass($"rounded-tr-${Size}"$)
	End If
	Return Me
End Sub

Sub SetRounded_BottomLeft(Size As String) As VMElement
	If Size = "" Then
		AddClass("rounded-bl")
	Else
		AddClass($"rounded-bl-${Size}"$)
	End If
	Return Me
End Sub

Sub SetRounded_BottomRight(Size As String) As VMElement
	If Size = "" Then
		AddClass("rounded-br")
	Else
		AddClass($"rounded-br-${Size}"$)
	End If
	Return Me
End Sub

Sub SetTypeEmail As VMElement
	SetType("email")
	Return Me
End Sub

Sub SetTypePassword As VMElement
	SetType("password")
	Return Me
End Sub

'this textbox accepts passwords
Sub SetPassword(b As Boolean, toggle As Boolean) As VMElement
	vue.SetData(password, False)
	Dim sline As String = $"${password} ? 'mdi-eye' : 'mdi-eye-off'"$
	If toggle Then Bind(":append-icon", sline)
	Bind(":type", $"${password} ? 'text' : 'password'"$)
	If toggle Then SetAttrSingle("@click:append", $"${password} = !${password}"$)
	typeOf = "password"
	SetAutoComplete("off")
	Return Me
End Sub

Sub SetAutoCompleteOff As VMElement
	SetAutoComplete("off")
	Return Me
End Sub

Sub SetAutoCompleteOn As VMElement
	SetAutoComplete("on")
	Return Me
End Sub

'get the value
Sub GetValue As String
	Dim svalue As String = vue.GetData(vmodel)
	Return svalue
End Sub

Sub SetShaped(varShaped As Boolean) As VMElement
	If bStatic Then
		SetAttrSingle("shaped", varShaped)
	Else
		Dim pp As String = $"${ID}Shaped"$
		vue.SetStateSingle(pp, varShaped)
		Bind(":shaped", pp)
	End If
	Return Me
End Sub

'set single-line
Sub SetSingleLine(varSingleLine As Boolean) As VMElement
	If bStatic Then
		SetAttrSingle("single-line", varSingleLine)
	Else
		Dim pp As String = $"${ID}SingleLine"$
		vue.SetStateSingle(pp, varSingleLine)
		Bind(":single-line", pp)
	End If
	Return Me
End Sub

'set solo
Sub SetSolo(varSolo As Boolean) As VMElement
	If bStatic Then
		SetAttrSingle("solo", varSolo)
	Else
		Dim pp As String = $"${ID}Solo"$
		vue.SetStateSingle(pp, varSolo)
		Bind(":solo", pp)
	End If
	Return Me
End Sub

'set solo-inverted
Sub SetSoloInverted(varSoloInverted As Boolean) As VMElement
	If bStatic Then
		SetAttrSingle("solo-inverted", varSoloInverted)
	Else
		Dim pp As String = $"${ID}SoloInverted"$
		vue.SetStateSingle(pp, varSoloInverted)
		Bind(":solo-inverted", pp)
	End If
	Return Me
End Sub


'set prepend-icon
Sub SetPrependIcon(varPrependIcon As String) As VMElement
	If bStatic Then
		SetAttrSingle("prepend-icon", varPrependIcon)
	Else
		Dim pp As String = $"${ID}PrependIcon"$
		vue.SetStateSingle(pp, varPrependIcon)
		Bind(":prepend-icon", pp)
	End If
	Return Me
End Sub

'set prepend-inner-icon
Sub SetPrependInnerIcon(varPrependInnerIcon As String) As VMElement
	If bStatic Then
		SetAttrSingle("prepend-inner-icon", varPrependInnerIcon)
	Else
		Dim pp As String = $"${ID}PrependInnerIcon"$
		vue.SetStateSingle(pp, varPrependInnerIcon)
		Bind(":prepend-inner-icon", pp)
	End If
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Boolean) As VMElement
	If bStatic Then
		SetAttrSingle("readonly", varReadonly)
	Else
		Dim pp As String = $"${ID}Readonly"$
		vue.SetStateSingle(pp, varReadonly)
		Bind(":readonly", pp)
	End If
	Return Me
End Sub

'set prefix
Sub SetPrefix(varPrefix As String) As VMElement
	If bStatic Then
		SetAttrSingle("prefix", varPrefix)
	Else
		Dim pp As String = $"${ID}Prefix"$
		vue.SetStateSingle(pp, varPrefix)
		Bind(":prefix", pp)
	End If
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Boolean) As VMElement
	If bStatic Then
		SetAttrSingle("persistent-hint", varPersistentHint)
	Else
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	Bind(":persistent-hint", pp)
	End If
	Return Me
End Sub

Sub SetTextArea As VMElement
	SetTag("v-textarea")
	typeOf = "textarea"
	Return Me
End Sub

Sub SetMaxLength(varMaxLen As String) As VMElement
	If bStatic Then
		SetAttrSingle("maxlength", varMaxLen)
	Else
		Dim pp As String = $"${ID}varMaxLen"$
		vue.SetStateSingle(pp, varMaxLen)
		Bind(":maxlength", pp)
	End If
	Return Me
End Sub

'set the conver image for the container
Sub SetCoverImage(url As String) As VMElement
	SetStyleSingle("background", $"url('${url}')"$)
	SetStyleSingle("background-size", "cover")
	SetStyleSingle("width", "100%")
	SetStyleSingle("height", "100%")
	Return Me
End Sub

Sub SetMinWidth(w As String) As VMElement
	If w = "" Then Return Me
	SetStyleSingle("min-width", w)
	Return Me
End Sub

Sub SetMinHeight(h As String) As VMElement
	If h = "" Then Return Me
	SetStyleSingle("min-height", h)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As String) As VMElement
	If varTransition = "" Then Return Me
	SetAttrSingle("transition", varTransition)
	Return Me
End Sub

'set the border
Sub SetBorderStyle(bstyle As String) As VMElement
	If bstyle = "" Then Return Me
	SetStyleSingle("border-style", bstyle)
	Return Me
End Sub

Sub SetBorderWidth(bwidth As String) As VMElement
	If bwidth = "" Then Return Me
	SetStyleSingle("border-width", bwidth)
	Return Me
End Sub

'set the border
Sub SetBorderColor(bcolor As String) As VMElement
	If bcolor = "" Then Return Me
	SetStyleSingle("border-color", bcolor)
	Return Me
End Sub

Sub SetCenterContent As VMElement
	SetJustify("center")
	SetAlign("center")
	AddClass("mx-auto")
	Return Me
End Sub


'set append-icon
Sub SetAppendIcon(varAppendIcon As String) As VMElement
	If varAppendIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("append-icon", varAppendIcon)
	Else
		Dim pp As String = $"${ID}AppendIcon"$
		vue.SetStateSingle(pp, varAppendIcon)
		Bind(":append-icon", pp)
	End If
	Return Me
End Sub

'set append-outer-icon
Sub SetAppendOuterIcon(varAppendOuterIcon As String) As VMElement
	If varAppendOuterIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("append-outer-icon", varAppendOuterIcon)
	Else
		Dim pp As String = $"${ID}AppendOuterIcon"$
		vue.SetStateSingle(pp, varAppendOuterIcon)
		Bind(":append-outer-icon", pp)
	End If
	Return Me
End Sub

'set autofocus
Sub SetAutofocus(varAutofocus As Boolean) As VMElement
	If varAutofocus = False Then Return Me
	If bStatic Then
		SetAttrSingle("autofocus", varAutofocus)
	Else
		Dim pp As String = $"${ID}Autofocus"$
		vue.SetStateSingle(pp, varAutofocus)
		Bind(":autofocus", pp)
	End If
	Return Me
End Sub


'set clearable
Sub SetClearable(varClearable As Boolean) As VMElement
	If varClearable = False Then Return Me
	If bStatic Then
		SetAttrSingle("clearable", varClearable)
	Else
		Dim pp As String = $"${ID}Clearable"$
		vue.SetStateSingle(pp, varClearable)
		Bind(":clearable", pp)
	End If
	Return Me
End Sub


'set counter
Sub SetCounter(varCounter As Boolean) As VMElement
	If varCounter = False Then Return Me
	If bStatic Then
		SetAttrSingle("counter", varCounter)
	Else
		Dim pp As String = $"${ID}Counter"$
		vue.SetStateSingle(pp, varCounter)
		Bind(":counter", pp)
	End If
	Return Me
End Sub

'set counter-value
Sub SetCounterValue(varCounterValue As String) As VMElement
	If varCounterValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("counter-value", varCounterValue)
	Else
		Dim pp As String = $"${ID}CounterValue"$
		vue.SetStateSingle(pp, varCounterValue)
		Bind(":counter-value", pp)
	End If
	Return Me
End Sub


'set filled
Sub SetFilled(varFilled As Boolean) As VMElement
	If varFilled = False Then Return Me
	If bStatic Then
		SetAttrSingle("filled", varFilled)
	Else
	Dim pp As String = $"${ID}Filled"$
	vue.SetStateSingle(pp, varFilled)
	Bind(":filled", pp)
	End If
	Return Me
End Sub


'set hide-details
Sub SetHideDetails(varHideDetails As Boolean) As VMElement
	If varHideDetails = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-details", varHideDetails)
	Else
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	Bind(":hide-details", pp)
	End If
	Return Me
End Sub

'set hint
Sub SetHint(varHint As String) As VMElement
	If varHint = "" Then Return Me
	If bStatic Then
		SetAttrSingle("hint", varHint)
	Else
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	Bind(":hint", pp)
	End If
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As String) As VMElement
	If varLabel = "" Then Return Me
	If bStatic Then
		SetAttrSingle("label", varLabel)
	Else
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	Bind(":label", pp)
	End If
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Boolean) As VMElement
	If varValidateOnBlur = False Then Return Me
	If bStatic Then
		SetAttrSingle("validate-on-blur", varValidateOnBlur)
		Return Me
	End If
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetBoolean(pp, varValidateOnBlur)
	Bind(":validate-on-blur", pp)
	Return Me
End Sub

'
Sub SetOnClickAppend(eventHandler As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@click:append": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppendOuter(eventHandler As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@click:append-outer": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickClear(eventHandler As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@click:clear": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrepend(eventHandler As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@click:prepend": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrependInner(eventHandler As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@click:prepend-inner": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnKeydown(eventHandler As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@keydown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'set chips
Sub SetChips(varChips As Boolean) As VMElement
	If varChips = False Then Return Me
	If bStatic Then
		SetAttrSingle("chips", varChips)
		Return Me
	End If	
	Dim pp As String = $"${ID}Chips"$
	vue.SetStateSingle(pp, varChips)
	Bind(":chips", pp)
	Return Me
End Sub


'set multiple
Sub SetMultiple(varMultiple As Boolean) As VMElement
	If varMultiple = False Then Return Me
	If bStatic Then
		SetAttrSingle("multiple", varMultiple)
		Return Me
	End If
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	Bind(":multiple", pp)
	Return Me
End Sub


'set small-chips
Sub SetSmallChips(varSmallChips As Boolean) As VMElement
	If varSmallChips = False Then Return Me
	If bStatic Then
		SetAttrSingle("small-chips", varSmallChips)
		Return Me
	End If
	Dim pp As String = $"${ID}SmallChips"$
	vue.SetStateSingle(pp, varSmallChips)
	Bind(":small-chips", pp)
	Return Me
End Sub