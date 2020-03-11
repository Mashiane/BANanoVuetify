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
	Private showKey As String
	Private disKey As String
	Private reqKey As String
	Private errKey As String
	Private styleKey As String
	Public DesignMode As Boolean
	Private opt As Map
	Private data As Map
	Private refs As Map
	Private methods As Map
	Private computed As Map
	Private watches As Map
	Private created As BANanoObject
	Private mounted As BANanoObject
	Private beforeCreate As BANanoObject
	Private destroyed As BANanoObject
	Private beforeMount As BANanoObject
	Private updated As BANanoObject
	Private beforeDestroy As BANanoObject
	Private activated As BANanoObject
	Private deactivated As BANanoObject
	Private beforeUpdate As BANanoObject
	Public URL As String
	Public name As String
	Private props As List
	Private propFrom As String
	Private showKey As String
	Private disKey As String
	Private bUsesStyles As Boolean
	Private bUsesRequired As Boolean
	Private bUsedDisabled As Boolean
	Private bUsesShow As Boolean
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
	Public defaultValue As Object
	Public Template As String
	Public IsVisible As Boolean 
	Public IsDisabled As Boolean
	Public IsRequired As Boolean
	Public IsArray As Boolean
	Public IsExcluded As Boolean
	Public ActualID As String
	Public Host As String
	Public Exclude As Boolean
End Sub

Public Sub Initialize(v As BANanoVue, sid As String) As VMElement
	ID = sid.ToLowerCase
	ID = ID.trim
	Element.Initialize(ID,"div")
	vue = v
	MT = ""
	MB = ""
	ML = ""
	MR = ""
	PT = ""
	PB = ""
	PL = ""
	PR = ""
	Template = ""
	hasContent = False
	bUsesStyles = False
	bUsesRequired = False
	bUsedDisabled = False
	bUsesShow = False
	
	showKey = $"${ID}show"$
	disKey = $"${ID}disabled"$
	reqKey = $"${ID}required"$
	errKey = $"${ID}error"$
	styleKey = $"${ID}style"$
	
	If ID <> "" Then
		Dim SMp As Map = CreateMap()
		SetRef(ID)
		vue.SetStateSingle(showKey, True)
		vue.SetStateSingle(disKey, False)
		vue.SetStateSingle(reqKey, False)
		vue.SetStateSingle(errKey, False)
		vue.SetStateSingle(styleKey, SMp)
		SetAttrSingle(":style", styleKey)
	End If
	'	
	
	DesignMode = False
	opt.Initialize 
	data.Initialize
	refs.Initialize 
	props.Initialize
	methods.Initialize
	data.Initialize
	computed.Initialize
	watches.Initialize
	beforeMount = Null
	beforeUpdate = Null
	created = Null
	mounted = Null
	destroyed = Null
	updated = Null
	beforeCreate = Null
	activated = Null
	deactivated = Null
	beforeDestroy = Null
	
	URL = $"/${ID}"$
	SetRC(1,1)
	SetDeviceOffsets(0,0,0,0)
	SetDeviceSizes(12,12,12,12)
	'
	typeOf = "text"
	fieldType = "string"
	InputType = "text"
	defaultValue = Null
	name = ID
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


Sub SetRow(sRow As String) As VMElement
	R = sRow
	Return Me
End Sub

Sub SetRC(sRow As String, sCol As String) As VMElement
	SetRow(sRow)
	SetCell(sCol)
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
Sub UseTheme(themeName As String)
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
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

Sub AddDivider As VMElement
	Dim strLine As String = $"<v-divider></v-divider>"$
	SetText(strLine)
	Return Me
End Sub

Sub AddSpacer As VMElement
	Dim strLine As String = $"<v-spacer></v-spacer>"$
	SetText(strLine)
	Return Me
End Sub


Sub SetFluid As VMElement
	Element.SetAttrSingle("fluid", True)
	Return Me
End Sub

Sub SetDense As VMElement
	Element.SetAttrSingle("dense", True)
	Return Me
End Sub

Sub SetElevation(elNum As Int) As VMElement
	Element.SetAttrSingle("elevation",elNum)
	Return Me
End Sub


Sub SetFunctional(b As Boolean) As VMElement
	opt.Put("functional", b)
	Return Me
End Sub

Sub TemplateFromProperty(propName As String) As VMElement
	propName = propName.ToLowerCase
	propFrom = propName
	Dim cb As BANanoObject = BANano.CallBack(Me, "RenderIt", Null)
	opt.Put("render", cb)
	Return Me
End Sub


Sub RenderIt As BANanoObject
	Dim option As Map = CreateMap("template" : $"{{ ${propFrom} }}"$)
	Dim bo As BANanoObject = BANano.RunJavascriptMethod("createElement",Array(option))
	Return bo
End Sub

'set onchange event
Sub SetOnChange(eventHandler As Object, source As String) As VMElement
	source = source.tolowercase
	Dim methodName As String  = $"${source}_change"$
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim sval As String
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(sval))
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub SetStyleRound(size As String) As VMElement
	Element.SetStyleRound(size)
	Return Me
End Sub

Sub EnableItem(elID As String)
	elID = elID.tolowercase
	vue.SetStateSingle($"${elID}disabled"$, False)
End Sub

Sub DisableItem(elID As String)
	elID = elID.tolowercase
	vue.SetStateSingle($"${elID}disabled"$, True)
End Sub


Sub HideItem(elID As String)
	elID = elID.tolowercase
	vue.SetStateSingle($"${elID}show"$, False)
End Sub

Sub ShowItem(elID As String)
	vue.SetStateSingle($"${elID}show"$, True)
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

Sub AddChildDiv(divID As String, divClass As String)
	Dim childDiv As VMElement
	childDiv.Initialize(vue, divID).AddClass(divClass)
	childDiv.SetDesignMode(DesignMode)
	AddChild(childDiv)
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

Sub SetAttrSingle(prop As String, vals As String) As VMElement
	Dim attr As Map = CreateMap()
	attr.Put(prop, vals)
	SetAttr(attr)
	Return Me
End Sub

Sub Required(b As Boolean) As VMElement
	IsRequired = b
	vue.SetStateSingle(reqKey, b)
	Bind(":required", reqKey)
	Return Me
End Sub

Sub Enable(b As Boolean) As VMElement
	Dim n As Boolean = Not(b)
	IsDisabled = n
	vue.SetStateSingle(disKey, n)
	Bind(":disabled", disKey)
	Return Me
End Sub

Sub Disable(b As Boolean) As VMElement
	IsDisabled = b
	vue.SetStateSingle(disKey, b)
	Bind(":disabled", disKey)
	Return Me
End Sub


'show using id
Sub Show As VMElement
	IsVisible = True
	vue.SetStateSingle(ID, True)
	Return Me
End Sub

'hide using id
Sub Hide As VMElement
	IsVisible = False
	vue.SetStateSingle(ID, False)
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
	Element.SetAttr("for", f)
	Return Me
End Sub

Sub SetVCloak As VMElement
	Element.setvcloak
	Return Me
End Sub

Sub SetNotSelectible As VMElement
	Element.AddClass("gj-unselectable")
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
	SetAttr(CreateMap(":draggable":b))
	Return Me
End Sub

Sub SetDroppable(b As Boolean) As VMElement
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
	Element.SetAttr("slot", sltValue)
	Return Me
End Sub

Sub SetSlotScope(sltValue As String) As VMElement
	Element.SetAttr("slot-scope", sltValue)
	Return Me
End Sub

Sub SetType(stypeOf As String) As VMElement
	Element.SetAttr("type", stypeOf)
	Return Me
End Sub

Sub RemoveClass(className As String) As VMElement
	Element.removeClass(className)
	Return Me
End Sub


Sub SetOnMouseOut(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	SetAttr(CreateMap("v-on:mouseout": methodName))
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnMouseOver(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	SetAttr(CreateMap("v-on:mouseover": methodName))
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetKey(k As Object, bBind As Boolean) As VMElement
	If bBind Then
		If vue.StateExists(k) = False Then vue.SetStateSingle(k, DateTime.now)
		RemoveAttr("key")
		Element.SetAttr(":key", k)
	Else
		RemoveAttr(":key")
		Element.SetAttr("key", k)
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

Sub SetVOnce(t As Object) As VMElement
	SetAttr(CreateMap("v-once": t))
	Return Me
End Sub


'set for
Sub SetVFor(item As String, dataSource As String) As VMElement
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	If vue.StateExists(dataSource) = False Then vue.SetStateSingle(dataSource, Array())
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttr(CreateMap("v-for": sline))
	RemoveAttr("ref")
	Return Me
End Sub

'set value
Sub SetValue(valueName As String, bbind As Boolean) As VMElement
	If bbind Then
		RemoveAttr("value")
		valueName = valueName.tolowercase
		SetAttr(CreateMap(":value":valueName))
	Else
		RemoveAttr(":value")	
		SetAttr(CreateMap("value":valueName))
	End If
	Return Me
End Sub

'set template
Sub SetTemplate(tmp As Object) As VMElement
	Element.Clear
	SetText(tmp)
	hasContent = True
	Return Me
End Sub

Sub SetVHtml(h As String) As VMElement
	If h = "" Then Return Me
	h = h.tolowercase
	If vue.StateExists(h) = False Then vue.SetStateSingle(h, Null)
	Element.SetAttr("v-html", h)
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
	If vif <> "show" Then
		bUsesShow = True
		If vue.HasState(vif) = False Then vue.SetStateFalse(vif)
		Element.SetVShow(vif)
	End If
	Return Me
End Sub

Sub BindStyle(optm As Map) As VMElement
	bUsesStyles = True
	Dim nm As Map = CreateMap()
	Dim oldm As Map = vue.GetState(styleKey, nm)
	For Each k As String In optm.Keys
		Dim v As Object = optm.Get(k)
		oldm.Put(k, v)
	Next
	vue.SetStateSingle(styleKey, oldm)
	Return Me
End Sub

Sub BindStyleSingle(prop As String, optm As String) As VMElement
	Dim nm As Map = CreateMap()
	nm.Put(prop, optm)
	BindStyle(nm)
	Return Me
End Sub

'add break
Sub AddBR
	SetText("<br>")
End Sub

'add hr
Sub AddHR
	SetText("<hr>")
End Sub

'add a class
Sub AddClass(className As String) As VMElement
	Element.AddClass(className)
	hasContent = True
	Return Me
End Sub

'render the element to parent element
Sub Render1(parent As String)
	BANano.GetElement(parent).Append(ToString)
End Sub

'add to parent
Sub Pop1(p As VMElement)
	p.AddChild(Me)
End Sub

'set color
Sub SetColor(color As Object) As VMElement
	SetStyle(CreateMap("color": color))
	Return Me
End Sub
'
Sub SetStyle(m As Map) As VMElement
	Element.SetStyles(m)
	Return Me
End Sub

'add a child element
Sub AddChild(child As VMElement) As VMElement
	Dim childHTML As String = child.ToString
	SetText(childHTML)
	hasContent = True
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
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

Sub SetTo(t As Object) As VMElement
	Element.SetAttr("to", t)
	Return Me
End Sub

Sub SetHREF(h As String) As VMElement
	Element.SetAttrHREF(h)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMElement
	bUsedDisabled = b
	vue.SetStatesingle(disKey, b)
	Element.SetAttr(":disabled", disKey)
	Return Me
End Sub

Sub SetRequired(b As Boolean) As VMElement
	IsRequired = b
	bUsesRequired = True
	vue.SetStateSingle(reqKey, b)
	Element.SetAttr(":required", reqKey)
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
	'
	Select Case prop
	Case ":disabled"
		bUsedDisabled = True
	Case ":required"
		bUsesRequired = True
	End Select
	Return Me
End Sub


'add a property
Sub AddProp(propName As String) As VMElement
	props.Add(propName)
	Return Me
End Sub

Sub AddProps(propsList As List) As VMElement
	For Each k As String In propsList
		AddProp(k)
	Next
	Return Me
End Sub

Sub SetVModel(k As String) As VMElement
	k = k.tolowercase
	If vue.HasState(k) = False Then
		Dim opt As Map = CreateMap()
		opt.Put(k, Null)
		vue.SetState(opt)
	End If
	Element.SetAttr("v-model", k)
	Return Me
End Sub


'set state object
Sub SetStateMap(mapKey As String, mapValues As Map) As VMElement
	Dim opt As Map = CreateMap()
	opt.Put(mapKey, mapValues)
	SetState(opt)
	Return Me
End Sub

'set state list
Sub SetStateList(mapKey As String, mapValues As List) As VMElement
	Dim opt As Map = CreateMap()
	opt.Put(mapKey, mapValues)
	SetState(opt)
	Return Me
End Sub

Sub SetStateListValues(mapValues As List) As VMElement
	For Each lstValue As String In mapValues
		Dim opt As Map = CreateMap()
		opt.Put(lstValue, "")
		SetState(opt)
	Next
	Return Me
End Sub

Sub GetStates(lst As List) As Map
	Dim smm As Map = CreateMap()
	For Each lstrec As String In lst
		lstrec = lstrec.tolowercase
		Dim state As Object = GetState(lstrec, Null)
		smm.Put(lstrec, state)
	Next
	Return smm
End Sub

Sub SetChecked(b As Boolean) As VMElement
	SetAttr(CreateMap(":checked":b))
	Return Me
End Sub

Sub SetTag(t As String) As VMElement
	Element.SetTag(t)
	Return Me
End Sub

Sub AddElements(lst As List)
	For Each li As VMElement In lst
		SetText(li.tostring)
	Next
End Sub

Sub AddElement(el As VMElement)
	SetText(el.ToString)
End Sub

Sub SetText(t As String) As VMElement
	Element.SetText(t)
	hasContent = True
	Return Me
End Sub

'add to parent element
Sub Pop(p As VMElement)
	If hasContent Then p.SetText(ToString)
End Sub

Sub ToString As String
	If bUsesStyles = False Then
		vue.RemoveData(styleKey)
		RemoveAttr(":style")
	End If
	If bUsesRequired = False Then
		vue.RemoveData(reqKey)
		RemoveAttr(":required")
	End If
	If bUsedDisabled = False Then
		vue.RemoveData(disKey)
		RemoveAttr(":disabled")
	End If
	If bUsesShow = False Then
		vue.RemoveData(showKey)
		
	End If
	If DesignMode Then
		RemoveAttributes(Array("v-show", ":disabled", ":required", ":class", "v-model", "tabindex", ":style"))
	End If
	'save the template
	Template = Element.tostring
	Return Template
End Sub

'remove mutliple attributes
Sub RemoveAttributes(attrs As List) As VMElement
	For Each s As String In attrs
		RemoveAttr(s)
	Next
	Return Me
End Sub

Sub Component() As Map
	RemoveAttributes(Array("v-show", ":disabled", ":required", ":class", "v-model", "tabindex", ":style"))
	Dim tmp As String = Element.tostring
	If data.Size > 0 Then 
		Dim cb As BANanoObject = BANano.CallBack(Me, "returnData", Null)
		opt.Put("data", cb)
	End If
	If methods.Size > 0 Then opt.Put("methods", methods)
	If computed.Size > 0 Then opt.Put("computed", computed)
	If watches.Size > 0 Then opt.Put("watch", watches)
	If props.Size <> 0 Then opt.Put("props", props)
	If updated <> Null Then opt.Put("updated", updated)
	If destroyed <> Null Then opt.Put("destroyed", destroyed)
	If mounted <> Null Then	opt.Put("mounted", mounted)
	If beforeCreate <> Null Then opt.Put("beforeCreate", beforeCreate)
	If created <> Null Then opt.Put("created", created)
	If beforeMount <> Null Then opt.Put("beforeMount", beforeMount)
	If beforeUpdate <> Null Then opt.Put("beforeUpdate", beforeUpdate)
	If activated <> Null Then opt.Put("activated", activated)
	If deactivated <> Null Then opt.Put("deactivated", deactivated)
	If beforeDestroy <> Null Then opt.Put("beforeDestroy", beforeDestroy)
	opt.Put("template", tmp)
	Return opt
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
	SetAttr(CreateMap("v-on:input": methodName))
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
	SetAttr(CreateMap("v-on:focus": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnClear(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("v-on:md-clear": methodName))
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
	SetAttr(CreateMap("v-on:blur": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'set pointer
Sub SetPointer(b As Boolean) As VMElement
	Element.SetPointer(True)
	Return Me
End Sub

'set onclick event
Sub SetOnClick(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	SetAttrSingle("v-on:click", methodName)
	vue.SetMethod(module, methodName)
	Return Me
End Sub

'set onclick stop
Sub SetOnClickStop(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	SetAttrSingle("v-on:click.stop", methodName)
	vue.SetMethod(module, methodName)
	Return Me
End Sub

'set ontouch start event
Sub SetOnTouchStart(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("v-on:touchstart": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDragOver(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("v-on:dragover": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDragStart(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("v-on:dragstart": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDragEnd(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("v-on:dragend": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDragEnter(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("v-on:dragenter": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDrop(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("v-on:drop": methodName))
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

'generate another vue instance
Sub RenderTo(elID As String)
	elID = elID.tolowercase
	BANano.GetElement($"#${elID}"$).empty
	'
	Dim boVUE As BANanoObject
	opt.Put("el", $"#${elID}"$)
	Component
	boVUE.Initialize2("Vue", opt)
	'get the state
	Dim dKey As String = "$data"
	data = boVUE.GetField(dKey).Result
	'get the refs
	Dim rKey As String = "$refs"
	refs = boVUE.GetField(rKey).result
End Sub


Sub SetStateTrue(k As String) As VMElement
	SetStateSingle(k,True)
	Return Me
End Sub

Sub SetStateFalse(k As String) As VMElement
	SetStateSingle(k,False)
	Return Me
End Sub

Sub SetStateIncrement(k As String) As VMElement
	Dim oldV As String = GetState(k, "0")
	oldV = BANano.parseInt(oldV) + 1
	SetStateSingle(k, oldV)
	Return Me
End Sub

Sub SetStateDecrement(k As String) As VMElement
	Dim oldV As String = GetState(k, "0")
	oldV = BANano.parseInt(oldV) - 1
	SetStateSingle(k, oldV)
	Return Me
End Sub


'a single state change
Sub SetStateSingle(k As String, v As Object) As VMElement
	k = k.tolowercase
	Dim optx As Map = CreateMap()
	optx.Put(k, v)
	SetState(optx)
	Return Me
End Sub

Sub ToggleState(stateName As String) As VMElement
	Dim bcurrent As Boolean = GetState(stateName,"")
	bcurrent = Not(bcurrent)
	Dim optx As Map = CreateMap()
	optx.Put(stateName, bcurrent)
	SetState(optx)
	Return Me
End Sub

'return if state exists
Sub HasState(k As String) As Boolean
	Return data.ContainsKey(k)
End Sub

'get the state
Sub GetState(k As String, v As Object) As Object
	k = k.tolowercase
	If data.ContainsKey(k) Then
		Dim out As Object = data.GetDefault(k,v)
		Return out
	Else
		Log("GetState: First set the v-model for " & k)
		Return ""
	End If
End Sub

'check if we have state
Sub StateExists(stateName As String) As Boolean
	stateName = stateName.tolowercase
	Return data.ContainsKey(stateName)
End Sub

'set the state
Sub SetState(m As Map) As VMElement
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		k = k.tolowercase
		data.Put(k, v)
	Next
	Return Me
End Sub

'set a call back
Sub SetCallBack(methodName As String, cb As BANanoObject)
	methodName = methodName.ToLowerCase
	methods.Put(methodName, cb)
End Sub


'set onselected event
Sub SetOnSelected(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
		SetAttr(CreateMap("v-on:selected": methodName))
		'add to methods
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub


private Sub ReturnData As Map
	Return data
End Sub

'set computed
Sub SetComputed(module As Object, k As String, methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) Then
		k = k.tolowercase
		If data.ContainsKey(k) Then
			SetStateSingle(k, Null)
		End If
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
		computed.Put(k, cb)
	End If
	Return Me
End Sub

'set watches 
Sub SetWatch(module As Object, k As String, bImmediate As Boolean, bDeep As Boolean, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		k = k.tolowercase
		If data.ContainsKey(k) Then
			SetStateSingle(k, Null)
		End If
		Dim newVal As Object
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(newVal))
		Dim deepit As Map = CreateMap()
		deepit.Put("handler", methodName)
		deepit.Put("deep", bDeep)
		deepit.Put("immediate", bImmediate)
		watches.Put(k, deepit)
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub


'set before created
Sub SetBeforeCreate(module As Object,methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	beforeCreate = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub


'set created
Sub SetCreated(module As Object,methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	created = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub

'set direct method
Sub SetMethod(module As Object,methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub

'set before destroy
Sub SetBeforeDestroy(module As Object,methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	beforeDestroy = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub

'set activated
Sub SetActivated(module As Object,methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	activated = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub


'set deactivated
Sub SetDeActivated(module As Object,methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	deactivated = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub


'set updated
Sub SetUpdated(module As Object,methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	updated = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub

'set beforemount
Sub SetBeforeMount(module As Object,methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	beforeMount = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub

'set beforeupdate
Sub SetBeforeUpdate(module As Object,methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	beforeMount = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub


'set mounted
Sub SetMounted(module As Object,methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	mounted = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub


'set destroyed
Sub SetDestroyed(module As Object,methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	destroyed = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMElement
	Element.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub
