B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
'Custom BANano View class
#IgnoreWarnings:12

'IMPORTANT: events are case sensitive, rather lowercase them
#Event: click (event As BANanoEvent)
#Event: clickstop (event As BANanoEvent)

' Properties that will be show in the ABStract Designer.  They will be passed in the props map in DesignerCreateView (Case Sensitive!)
#DesignerProperty: Key: TagName, DisplayName: TagName, FieldType: String, DefaultValue: div, Description: Tagname
#DesignerProperty: Key: Text, DisplayName: Text, FieldType: String, DefaultValue: , Description: Text on the label
#DesignerProperty: Key: VText, DisplayName: VText, FieldType: String, DefaultValue: , Description: VText
#DesignerProperty: Key: VHtml, DisplayName: VHtml, FieldType: String, DefaultValue: , Description: VHtml
#DesignerProperty: Key: VModel, DisplayName: VModel, FieldType: String, DefaultValue: , Description: VModel
#DesignerProperty: Key: RefName, DisplayName: RefName, FieldType: String, DefaultValue: , Description: RefName
#DesignerProperty: Key: VIf, DisplayName: VIf, FieldType: String, DefaultValue: , Description: VIf
#DesignerProperty: Key: VElse, DisplayName: VElse, FieldType: String, DefaultValue: , Description: VElse
#DesignerProperty: Key: VShow, DisplayName: VShow, FieldType: String, DefaultValue: , Description: VShow
#DesignerProperty: Key: VFor, DisplayName: VFor, FieldType: String, DefaultValue: , Description: VFor
#DesignerProperty: Key: KeyName, DisplayName: KeyName, FieldType: String, DefaultValue: , Description: KeyName

#DesignerProperty: Key: Classes, DisplayName: Classes, FieldType: String, DefaultValue: , Description: Classes added to the HTML tag.
#DesignerProperty: Key: Style, DisplayName: Style, FieldType: String, DefaultValue: , Description: Styles added to the HTML tag. Must be a json String.
#DesignerProperty: Key: Attributes, DisplayName: Attributes, FieldType: String, DefaultValue: , Description: Attributes added to the HTML tag. Must be a json String.
#DesignerProperty: Key: MarginLeft, DisplayName: Margin Left, FieldType: String, DefaultValue: , Description: Margin Left
#DesignerProperty: Key: MarginRight, DisplayName: Margin Right, FieldType: String, DefaultValue: , Description: Margin Right
#DesignerProperty: Key: MarginTop, DisplayName: Margin Top, FieldType: String, DefaultValue: , Description: Margin Top
#DesignerProperty: Key: MarginBottom, DisplayName: Margin Bottom, FieldType: String, DefaultValue: , Description: Margin Bottom
#DesignerProperty: Key: PaddingLeft, DisplayName: Padding Left, FieldType: String, DefaultValue: , Description: Padding Left
#DesignerProperty: Key: PaddingRight, DisplayName: Padding Right, FieldType: String, DefaultValue: , Description: Padding Right
#DesignerProperty: Key: PaddingTop, DisplayName: Padding Top, FieldType: String, DefaultValue: , Description: Padding Top
#DesignerProperty: Key: PaddingBottom, DisplayName: Padding Bottom, FieldType: String, DefaultValue: , Description: Padding Bottom

Sub Class_Globals
	Private BANano As BANano 'ignore
	Public mName As String 'ignore
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mTarget As BANanoElement 'ignore
	Private mElement As BANanoElement 'ignore
	Private mVFor As String = ""
	Public Errors As Map
	Public jsString As BANanoObject
	Public jsNumber As BANanoObject
	Public jsBoolean As BANanoObject
	Public jsArray As BANanoObject
	Public jsObject As BANanoObject
	'
	Public Path As String = ""
	Public Title As String = ""
	Public Icon As String = ""
	Public data As Map
	Private opt As Map
	Public methods As Map
	Public computed As Map
	Public watches As Map
	Public filters As Map
	Public components As Map
	Public refs As BANanoObject
	Private mprops As Map
	Private query As Map
	Private template As String = ""
	Private mAttributes As String = ""
	
	Private mClasses As String = ""
	Private mStyle As String = ""
	Public MarginLeft As String = ""
	Public MarginRight As String = ""
	Public MarginTop As String = ""
	Public MarginBottom As String = ""
	Public PaddingLeft As String = ""
	Public PaddingRight As String = ""
	Public PaddingTop As String = ""
	Public PaddingBottom As String = ""
	Private mText As String = ""
	Private mTagName As String = ""
	Private mVModel As String = ""
	Private mRefName As String = ""
	Private mKeyName As String = ""
	Private mVText As String = ""
	Private mVIf As String = ""
	Private mVElse As String = ""
	Private mVShow As String = ""
	Private mVHtml As String = ""
	Private properties As Map
	Private styles As Map
	Private classList As Map
End Sub

Public Sub Initialize (CallBack As Object, Name As String, EventName As String) As VMElement
	mName = Name
	mEventName = EventName.ToLowerCase
	mCallBack = CallBack
	opt.Initialize
	data.Initialize
	mprops.Initialize
	methods.Initialize
	computed.Initialize
	watches.Initialize
	filters.Initialize
	query.Initialize
	Errors.Initialize
	components.initialize
	Path = $"/${Name}"$
	Icon = ""
	Title = ""
	properties.Initialize
	styles.Initialize
	classList.Initialize
	jsString.Initialize("String")
	jsNumber.Initialize("Number")
	jsBoolean.Initialize("Boolean")
	jsArray.Initialize("Array")
	jsObject.Initialize("Object")
	Return Me
End Sub

'add a component we have defined internally
Sub AddComponent(comp As VMElement)
	comp.SetTag(comp.mName)
	Dim sid As String = comp.mName
	If components.ContainsKey(sid) = True Then
		Return
	End If
	components.Put(sid, comp.Component(False))
End Sub

'get a drawer item for this route
Sub GetDrawerItem As Map
	Dim elx As Map = CreateMap()
	elx.Put("icon", Icon)
	elx.Put("title", Title)
	elx.Put("link", Path)
	Return elx
End Sub

' this is the place where you create the view in html and run initialize javascript.  Must be Public!
Public Sub DesignerCreateView (Target As BANanoElement, props As Map)
	mTarget = Target

	If props <> Null Then
		mClasses = props.Get("Classes")
		mStyle = props.Get("Style")
		MarginLeft = props.Get("MarginLeft")
		MarginRight = props.Get("MarginRight")
		MarginTop = props.Get("MarginTop")
		MarginBottom = props.Get("MarginBottom")
		PaddingLeft = props.Get("PaddingLeft")
		PaddingRight = props.Get("PaddingRight")
		PaddingTop = props.Get("PaddingTop")
		PaddingBottom = props.Get("PaddingBottom")
		mText = props.Get("Text")
		mTagName = props.Get("TagName")
		mVModel = props.Get("VModel")
		mRefName = props.Get("RefName")
		mKeyName = props.Get("KeyName")
		mVText = props.Get("VText")
		mVIf = props.Get("VIf")
		mVElse = props.Get("VElse")
		mVShow = props.Get("VShow")
		mVHtml = props.Get("VHtml")
		mVFor = props.Get("VFor")
		mAttributes = props.Get("Attributes")
	End If
	
	Dim strHTML As String = ToString
	mElement = mTarget.Append(strHTML).Get("#" & mName)

	' defining events is very simple. Note that it has to be run AFTER adding it to the HTML DOM! eventName must be lowercase!
	'mElement.HandleEvents("click", mCallBack, mEventName & "_click")
	SetOnClick
	SetOnClickStop
End Sub

'set the title of the route
Sub SetTitle(sTitle As String) As VMElement
	Title = sTitle
	Return Me
End Sub

'set the icon of the route
Sub SetIcon(sIcon As String) As VMElement
	Icon = sIcon
	Return Me
End Sub

'set the path for router
Sub SetPath(sPath As String) As VMElement
	Path = $"/${sPath}"$
	Return Me
End Sub

Sub SetTag(nTag As String)
	mTagName = nTag
End Sub

'bind dynamic component
Sub BindDynamicComponent(viewID As String, compID As String)
	viewID = viewID.ToLowerCase
	compID = compID.tolowercase
	SetVBindIs(viewID)
	data.Put(viewID, compID)
End Sub

Sub SetVBindIs(t As String) As VMElement
	t = t.tolowercase
	SetAttr("v-bind:is", t)
	Return Me
End Sub


'add component to parent
public Sub AddToParent(targetID As String)
	mTarget = BANano.GetElement("#" & targetID.ToLowerCase)
	DesignerCreateView(mTarget, Null)
End Sub

'remove component
public Sub Remove()
	mTarget.Empty
	BANano.SetMeToNull
End Sub

'trigger an event
public Sub Trigger(event As String, params() As String)
	If mElement <> Null Then
		mElement.Trigger(event, params)
	End If
End Sub

'set an event
Sub SetVOn(event As String)
	Dim methodName As String = BANanoShared.BeautifyName(event)
	methodName = $"${mEventName}_${methodName}"$
	methodName = methodName.tolowercase
	If SubExists(mCallBack, methodName) = False Then Return
	SetAttr($"v-on:${event}"$, methodName)
	SetMethod(mCallBack, methodName)
End Sub

Sub SetVFor(vfor As String)
	mVFor = vfor
	SetAttr("v-for", mVFor)
End Sub

Sub SetVHtml(svhtml As String)
	mVHtml = svhtml
	mVHtml = BANano.SF(mVHtml)
	SetAttr("v-html", mVHtml)
End Sub

Sub SetVShow(vshow As String)
	mVShow = vshow
	SetAttr("v-show", vshow)
End Sub

Sub SetVIf(vif As String)
	mVIf = vif
	SetAttr("v-if", mVIf)
End Sub

Sub SetVElse(velse As String)
	mVElse = velse
	SetAttr("v-else", mVElse)
End Sub

Sub SetVText(vtext As String)
	mVText = vtext
	SetAttr("v-text", mVText)
End Sub

Sub SetKey(skey As String)
	mKeyName = skey
	SetAttr("key", skey)
End Sub

Sub SetRef(ref As String)
	mRefName = ref
	SetAttr("ref", ref)
End Sub

Sub SetVModel(vmodel As String) 
	mVModel = vmodel
	SetAttr("v-model", vmodel)
End Sub

' must be a json string
' e.g. $"{ "width": "200px", "height": "200px", "background": "green", "border-radius": "5px" }"$
public Sub SetStyle(Style As String)
	If mElement <> Null Then
		mElement.SetStyle(Style)
	End If
	mStyle = Style
End Sub


'return the generated html
Sub ToString As String
	AddAttr(mKeyName, "key")
	AddAttr(mRefName, "ref")
	AddAttr(mVElse, "v-else")
	AddAttr(mVFor, "v-for")
	AddAttr(mVHtml, "v-html")
	AddAttr(mVIf, "v-if")
	AddAttr(mVModel, "v-model")
	AddAttr(mVShow, "v-show")
	AddAttr(mVText, "v-text")
	SetStyleSingle("margin-bottom", MarginBottom)
	SetStyleSingle("margin-left", MarginLeft)
	SetStyleSingle("margin-top", MarginTop)
	SetStyleSingle("margin-right", MarginRight)
'
	SetStyleSingle("padding-top", PaddingTop)
	SetStyleSingle("padding-right", PaddingRight)
	SetStyleSingle("padding-bottom", PaddingBottom)
	SetStyleSingle("padding-left", PaddingLeft)
'
	'build the class list
	Dim cKeys As String = BANanoShared.JoinMapKeys(classList, " ")
	cKeys = cKeys & " " & mClasses
	cKeys = cKeys.trim
	AddAttr(BANanoShared.MvDistinct(" ", cKeys), "class")
	'build the style list
	If BANano.IsUndefined(mStyle) Or BANano.IsNull(mStyle) Then mStyle = ""
	If mStyle.StartsWith("{") Then mStyle = ""
	If mStyle <> "" Then
		Dim sItems As List = BANanoShared.StrParse(",",mStyle)
		For Each st As String In sItems
			Dim k As String = BANanoShared.MvField(st,1,":")
			Dim v As String = BANanoShared.MvField(st,2,":")
			SetStyleSingle(k, v)
		Next
	End If
	Dim sKeys As String = BANanoShared.BuildStyle(styles)
	sKeys = sKeys.trim
	AddAttr(sKeys, "style")
	'build the attributes
	If BANano.IsUndefined(mAttributes) Or BANano.IsNull(mAttributes) Then mAttributes = ""
	If mAttributes.StartsWith("{") Then mAttributes = ""
	If mAttributes <> "" Then
		Dim mItems As List = BANanoShared.StrParse(";",mAttributes)
		For Each mt As String In mItems
			Dim k As String = BANanoShared.MvField(mt,1,"=")
			Dim v As String = BANanoShared.MvField(mt,2,"=")
			AddAttr(v, k)
		Next
	End If
	Dim exattr As String = BANanoShared.BuildAttributes(properties)

	Dim strRes As String = $"<${mTagName} id="${mName}" ${exattr}>${mText}</${mTagName}>"$
	Return strRes
End Sub


'change the id of the element, ONLY execute this after a manual Initialize
Sub SetID(varText As String) As VMElement
	mName = varText
	Return Me
End Sub


'will add properties to attributes
private Sub AddAttr(varName As String, actProp As String) As VMElement
	If actProp = "caption" Then Return Me
	Try
		If BANano.IsBoolean(varName) Then
			If varName = True Then properties.put(actProp, varName)
		Else
			If varName.StartsWith(":") Then
				'this is a binding
				'get the real name
				Dim rname As String = BANanoShared.MidString2(varName, 2)
				If rname.Contains(".") Then
					'we are linked to a for loop
					properties.Put($":${actProp}"$, rname)
				Else
					properties.Put($":${actProp}"$, rname)
					data.Put(rname, Null)
				End If
			Else
				If varName <> "" Then properties.put(actProp, varName)
				Select Case actProp
					Case "v-model", "v-show", "v-if", "required", "disabled", "readonly"
						data.Put(varName, False)
				End Select
			End If
		End If
	Catch
		Log(LastException)
	
	End Try
	Return Me
End Sub

#Region Property Getters and Setters
public Sub SetClasses(Classes As String) As VMElement
	If mElement <> Null Then
		mElement.AddClass(Classes)
	End If
	mClasses = Classes
	Return Me
End Sub

public Sub GetClasses() As String
	Return mClasses
End Sub

'add a list of classes
Sub AddClass(classNames As List) As VMElement
	For Each k As String In classNames
		classList.put(k, k)
	Next
	Dim cm As String = BANanoShared.Join(" ", classNames)
	SetClasses(cm)
	Return Me
End Sub

'set styles from a map
Sub SetStyles(m As Map) As VMElement
	For Each k As String In m.Keys
		Dim v As String = m.get(k)
		styles.put(k, v)
	Next
	Dim jsonStyle As String = BANano.ToJson(m)
	SetStyle(jsonStyle)
	Return Me
End Sub

'set attributes from a map
Sub SetAttrs(props As Map) As VMElement
	For Each k As String In props.Keys
		Dim v As String = props.Get(k)
		SetAttr(k, v)
	Next
	Return Me
End Sub

'set an attribute
Sub SetAttr(prop As String, value As String) As VMElement
	If BANano.IsUndefined(prop) Or BANano.IsNull(prop) Then prop = ""
	If BANano.IsUndefined(value) Or BANano.IsNull(value) Then value = ""
	If prop = "" Then Return Me
	properties.put(prop, value)
	If mElement <> Null Then 
		mElement.SetAttr(prop, value)
	End If
	Return Me
End Sub

'set a single style
Sub SetStyleSingle(prop As String, value As String) As VMElement
	If BANano.IsUndefined(prop) Or BANano.IsNull(prop) Then prop = ""
	If BANano.IsUndefined(value) Or BANano.IsNull(value) Then value = ""
	If prop = "" Then Return Me
	styles.put(prop, value)
	Dim m As Map = CreateMap()
	m.put(prop, value)
	Dim jsonStyle As String = BANano.ToJson(m)
	SetStyle(jsonStyle)
	Return Me
End Sub

'build a structure using props, styleprops, classes and loose attributes
Sub Build(props As Map, styleProps As Map, classNames As List, loose As List) As VMElement
	If loose <> Null Then
		For Each k As String In loose
			SetAttr(k, True)
		Next
	End If
	If props <> Null Then
		For Each k As String In props.Keys
			Dim v As String = props.Get(k)
			SetAttr(k, v)
		Next
	End If
	If styleProps <> Null Then
		For Each k As String In styleProps.Keys
			Dim v As String = styleProps.get(k)
			SetStyleSingle(k, v)
		Next
	End If
	If classNames <> Null Then
		AddClass(classNames)
	End If
	Return Me
End Sub

'get html
Public Sub GetHtml() As String
	Return mElement.GetHtml
End Sub

'bind classes
Sub SetVClass(classObj As String) As VMElement
	SetVBind("class", classObj)
	Return Me
End Sub

'bind styles
Sub SetVStyle(styleObj As String) As VMElement
	SetVBind("style", styleObj)
	Return Me
End Sub


'stop compilation
Sub SetVPre
	SetAttr("v-pre", True)
End Sub

'bind an attribute
Sub SetVBind(prop As String, value As String)
	prop = prop.ToLowerCase
	value = value.ToLowerCase
	prop = $"v-bind:${prop}"$
	SetAttr(prop,value)
	data.Put(value, Null)
End Sub

'get text
public Sub GetText() As String
	Return mElement.GetText
End Sub

'hide until compilation finishes
Sub SetVCloak
	If mElement <> Null Then
		SetAttr("v-cloak", True)
	End If
End Sub

'compile once
Sub SetVOnce
	SetAttr("v-once", True)
End Sub

'set color
Sub SetColor(varColor As String)
	If varColor = "" Then Return
	Dim pp As String = $"${mName}color"$
	SetAttr(":color", pp)
	data.Put(pp, varColor)
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String)
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	Dim pp As String = $"${mName}color"$
	SetAttr(":color", pp)
	data.Put(pp, scolor)
End Sub

'set text color
Sub SetTextColor(varColor As String)
	Dim sColor As String = $"${varColor}--text"$
	AddClass(Array(sColor))
End Sub

'set text color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String)
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(Array(mcolor))
End Sub


'return the component
Sub Component(bRoute As Boolean) As Map
	If bRoute = False Then
		Dim cb As BANanoObject = BANano.CallBack(Me, "returndata", Null)
		opt.Put("data", cb)
	Else
		opt.Put("data", data)
	End If
	opt.Put("methods", methods)
	opt.Put("computed", computed)
	opt.Put("watch", watches)
	opt.Put("props", mprops)
	opt.Put("filters", filters)
	opt.Put("template", template)
	opt.Put("components", components)
	Return opt
End Sub


'set template for the component before calling Component
Sub SetTemplate(tmp As String)
	template = tmp
End Sub

'set as layout
Sub SetBANanoTemplate(id As String)
	id = id.tolowercase
	Dim be As BANanoElement
	be.Initialize(id)
	template = be.GetHTML
	be.Empty
End Sub

'use for components
private Sub returndata As Map
	Return data
End Sub


'query string for router path
Sub SetQueryString(k As String, v As String) 
	query.Put(k, v)
End Sub

'remove state data
Sub RemoveData(key As String) 
	key = key.ToLowerCase
	data.Remove(key)
End Sub

'set state
Sub SetData(prop As String, valuex As Object) 
	data.put(prop, valuex)
End Sub

Sub GetData(prop As String) As Object
	Dim obj As Object = data.GetDefault(prop, Null)
	Return obj
End Sub

'add a string property
Sub AddProp(propName As String)
	Dim mprop As Map = CreateMap()
	mprop.Put("type", jsString)
	mprops.Put(propName, mprop) 
End Sub

Sub AddProperty(propName As String, propType As BANanoObject, propDefault As String)
	Dim mprop As Map = CreateMap()
	mprop.Put("type", propType)
	mprop.Put("default", propDefault)
	mprops.Put(propName, mprop)
End Sub

'add a property to the component
Sub AddProps(propsList As List) 
	For Each k As String In propsList
		AddProp(k)
	Next
End Sub

'set direct method
Sub SetFilter(module As Object, methodName As String) 
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) Then
		Dim value As Object
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(value))
		filters.Put(methodName, cb)
	Else
		Log($"SetFilter.${methodName} could not be found!"$)
	End If
End Sub

'set computed
Sub SetComputed(k As String, module As Object, methodName As String) 
	k = k.tolowercase
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) Then
		data.Put(k, Null)
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, Null)
		computed.Put(k, cb.Result)
	End If
End Sub

'set watches 
Sub SetWatch(Module As Object, k As String, bImmediate As Boolean, bDeep As Boolean, methodName As String) 
	methodName = methodName.tolowercase
	k = k.tolowercase
	If SubExists(Module, methodName) Then
		data.Put(k, Null)
		Dim newVal As Object
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(newVal))
		Dim deepit As Map = CreateMap()
		deepit.Put("handler", methodName)
		deepit.Put("deep", bDeep)
		deepit.Put("immediate", bImmediate)
		watches.Put(k, deepit)
		methods.Put(methodName, cb)
	End If
End Sub


'set direct method
Sub SetMethod(Module As Object,methodName As String) 
	methodName = methodName.ToLowerCase
	If SubExists(Module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
		methods.Put(methodName, cb)
	End If
End Sub


'set a call back
Sub SetCallBack(methodName As String, cb As BANanoObject)
	methodName = methodName.ToLowerCase
	methods.Put(methodName, cb)
End Sub


'set the state
Sub SetState(m As Map) 
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		k = k.tolowercase
		data.Put(k, v)
	Next
End Sub

'return if state exists
Sub HasState(k As String) As Boolean
	k = k.tolowercase
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

'generate another vue instance
Sub RenderTo(elID As String)
	elID = elID.tolowercase
	BANano.GetElement($"#${elID}"$).empty
	'
	Dim boVUE As BANanoObject
	opt.Put("el", $"#${elID}"$)
	Component(False)
	boVUE.Initialize2("Vue", opt)
	'get the state
	Dim dKey As String = "$data"
	data = boVUE.GetField(dKey).Result
	'get the refs
	Dim rKey As String = "$refs"
	refs = boVUE.GetField(rKey)
End Sub

'toggle a state
Sub ToggleState(stateName As String) 
	Dim bcurrent As Boolean = GetState(stateName,"")
	bcurrent = Not(bcurrent)
	Dim optx As Map = CreateMap()
	optx.Put(stateName, bcurrent)
	SetState(optx)
End Sub

'check if we have state
Sub StateExists(stateName As String) As Boolean
	stateName = stateName.tolowercase
	Return data.ContainsKey(stateName)
End Sub

'set state object
Sub SetStateMap(mapKey As String, mapValues As Map) 
	mapKey = mapKey.tolowercase
	Dim optm As Map = CreateMap()
	optm.Put(mapKey, mapValues)
	SetState(optm)
End Sub

'set state list
Sub SetStateList(mapKey As String, mapValues As List) 
	mapKey = mapKey.tolowercase
	Dim optm As Map = CreateMap()
	optm.Put(mapKey, mapValues)
	SetState(optm)
End Sub

'set multiple states to blank
Sub SetStateListValues(mapValues As List) 
	For Each lstValue As String In mapValues
		lstValue = lstValue.tolowercase
		Dim optm As Map = CreateMap()
		optm.Put(lstValue, "")
		SetState(optm)
	Next
End Sub

'get states as a map
Sub GetStates(lst As List) As Map
	Dim smm As Map = CreateMap()
	For Each lstrec As String In lst
		lstrec = lstrec.tolowercase
		Dim state As Object = GetState(lstrec, Null)
		smm.Put(lstrec, state)
	Next
	Return smm
End Sub

'set state to true
Sub SetStateTrue(k As String) 
	SetStateSingle(k,True)
End Sub

'set state to false
Sub SetStateFalse(k As String) 
	SetStateSingle(k,False)
End Sub

'a single state change
Sub SetStateSingle(k As String, v As Object) 
	k = k.tolowercase
	Dim optx As Map = CreateMap()
	optx.Put(k, v)
	SetState(optx)
End Sub

'set onclick event
Sub SetOnClick
	Dim mName As String = $"${mEventName}_click"$
	mName = mName.tolowercase
	If SubExists(mCallBack, mName) = False Then Return
	SetAttr("v-on:click", mName)
	SetMethod(mCallBack, mName)
End Sub

'set onclick stop
Sub SetOnClickStop
	Dim methodName As String = $"${mEventName}_clickstop"$
	methodName = methodName.tolowercase
	If SubExists(mCallBack, methodName) = False Then Return
	SetAttr("v-on:click.stop", methodName)
	SetMethod(mCallBack, methodName)
End Sub

'add an error to the collection
Sub AddError(vmodel As String, vError As String)
	vmodel = vmodel.tolowercase
	Errors.Put(vmodel, vError)
End Sub


'return the first error in the list
Sub GetError As String
	Dim strError As String = Errors.GetValueAt(0)
	Return strError
End Sub

'validate entries
Sub Validate(rec As Map, required As Map) As Boolean
	Errors.Initialize
	Dim iv As Int = 0
	For Each k As String In required.Keys
		Dim error As String = required.GetDefault(k, "")
		If error = "" Then
			error = $"The ${k} should be specified!"$
		End If
		'get the message
		If rec.ContainsKey(k) Then
			Dim v As String = rec.GetDefault(k,"")
			v = BANanoShared.CStr(v)
			v = v.trim
			If v = "" Then
				iv = iv + 1
				ShowError(k, error)
				Errors.Put(k, error)
			Else
				HideError(k)
			End If
		End If
	Next
	If iv = 0 Then
		Return True
	Else
		Return False
	End If
End Sub

Sub ShowError(elID As String, elError As String)
	elID = elID.tolowercase
	Dim pp As String = $"${elID}ErrorMessages"$
	Dim nl As List
	nl = BANanoShared.NewList
	nl.Add(elError)
	SetData(pp, nl)
	Dim pp1 As String = $"${elID}Error"$
	SetData(pp1, True)
End Sub

Sub HideError(elID As String)
	elID = elID.tolowercase
	Dim pp As String = $"${elID}ErrorMessages"$
	Dim nl As List
	nl = BANanoShared.NewList
	SetData(pp, nl)
	Dim pp1 As String = $"${elID}Error"$
	SetData(pp1, False)
End Sub


Sub NotState(stateName As String) As Boolean
	Dim bcurrent As Boolean = GetState(stateName,False)
	If bcurrent = Null Then bcurrent = True
	bcurrent = Not(bcurrent)
	Return bcurrent
End Sub

Sub Increment(k As String) As VMElement
	Dim oldV As String = GetState(k, "0")
	oldV = BANano.parseInt(oldV) + 1
	SetStateSingle(k, oldV)
	Return Me
End Sub

Sub Decrement(k As String) As VMElement
	Dim oldV As String = GetState(k, "0")
	oldV = BANano.parseInt(oldV) - 1
	SetStateSingle(k, oldV)
	Return Me
End Sub


Sub SetRequired(elID As String, b As Boolean)
	elID = elID.tolowercase
	SetStateSingle($"${elID}required"$, b)
End Sub

Sub Enable(elID As String)
	elID = elID.tolowercase
	SetStateSingle($"${elID}disabled"$, False)
End Sub

Sub Disable(elID As String)
	elID = elID.tolowercase
	SetStateSingle($"${elID}disabled"$, True)
End Sub

Sub SetEnabled(elID As String, b As Boolean)
	elID = elID.tolowercase
	SetStateSingle($"${elID}disabled"$, b)
End Sub

Sub Hide(elID As String)
	elID = elID.tolowercase
	SetStateSingle($"${elID}show"$, False)
End Sub

Sub Show(elID As String)
	SetStateSingle($"${elID}show"$, True)
End Sub

'focus on a ref
Sub SetFocus(refID As String)
	refID = refID.tolowercase
	refs.GetField(refID).RunMethod("focus", Null)
End Sub


'nullify the file select
Sub NullifyFileSelect(refID As String)
	RefNull(refID)
End Sub

Sub RefNull(refID As String)
	refID = refID.tolowercase
	refs.GetField(refID).SetField("value", Null)
End Sub


'click a reference
Sub RefClick(refID As String)
	refID = refID.tolowercase
	refs.GetField(refID).RunMethod("click", Null)
End Sub

Sub ShowFileSelect(fsName As String)
	RefClick(fsName)
End Sub

'refresh the key of the element
Sub RefreshKey(keyName As String) As VMElement
	keyName = keyName.ToLowerCase
	SetData(keyName, DateTime.now)
	Return Me
End Sub


'set beforemount
Sub SetBeforeMount(module As Object, methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) = False Then Return Me
	Dim beforeMount As BANanoObject = BANano.CallBack(module, methodName, Null)
	opt.Put("beforeMount", beforeMount)
	SetMethod(module, methodName)
	Return Me
End Sub


'set mounted
Sub SetMounted(module As Object, methodName As String) As VMElement
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) = False Then Return Me
	Dim mounted As BANanoObject = BANano.CallBack(module, methodName, Null)
	opt.Put("mounted", mounted)
	SetMethod(module, methodName)
	Return Me
End Sub

'get the html part of a bananoelement
Sub BANanoGetHTML(id As String) As String
	id = id.tolowercase
	Dim be As BANanoElement
	be.Initialize(id)
	Dim sTemplate As String = be.GetHTML
	be.Empty
	Return sTemplate
End Sub

#End Region

#Region Internal Events

#End Region
