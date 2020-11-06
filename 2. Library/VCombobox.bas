B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7
@EndOfDesignText@
#IgnoreWarnings:12
'Created with BANano Custom View Creator 1.8 by TheMash
'https://github.com/Mashiane/BANano-Custom-View-Creator
'Custom BANano View class

#Event: Blur (argument As BANanoEvent)

#DesignerProperty: Key: OnBlur, DisplayName: OnBlur, FieldType: String, DefaultValue: , Description: Event arguments to be passed to the attribute.
#DesignerProperty: Key: Caption, DisplayName: Caption, FieldType: String, DefaultValue: , Description: Text on the element
#DesignerProperty: Key: Classes, DisplayName: Classes, FieldType: String, DefaultValue: , Description: Classes added to the HTML tag.
#DesignerProperty: Key: Style, DisplayName: Style, FieldType: String, DefaultValue: , Description: Styles added to the HTML tag. Must be a json String.
#DesignerProperty: Key: Attributes, DisplayName: Attributes, FieldType: String, DefaultValue: , Description: Attributes added to the HTML tag. Must be a json String.
#DesignerProperty: Key: States, DisplayName: States, FieldType: String, DefaultValue: , Description: Initial Binding States. Must be a json String.
'***** CLASSES *****

'***** ATTRIBUTES *****

#DesignerProperty: Key: Attach, DisplayName: Attach, FieldType: String, DefaultValue: false , Description: Specifies which DOM element that this component should detach to. String can be any valid querySelector and Object can be any valid Node. This will attach to the root `v-app` component by default.
#DesignerProperty: Key: Autofocus, DisplayName: Autofocus, FieldType: Boolean, DefaultValue: False , Description: Enables autofocus
#DesignerProperty: Key: Chips, DisplayName: Chips, FieldType: Boolean, DefaultValue: False , Description: Changes display of selections to chips
#DesignerProperty: Key: Clearable, DisplayName: Clearable, FieldType: Boolean, DefaultValue: False , Description: Add input clear functionality, default icon is Material Design Icons **mdi-clear**
#DesignerProperty: Key: Color, DisplayName: Color, FieldType: String, DefaultValue:  , Description: Applies specified color to the control - it can be the name of material color for example `success` or `purple` or css color `#033` or `rgba255, 0, 0, 0.5`. You can find list of built in classes on the colors page/styles/colors#material-colors.
#DesignerProperty: Key: Counter, DisplayName: Counter, FieldType: String, DefaultValue:  , Description: Creates counter for input length; if no number is specified, it defaults to 25. Does not apply any validation.
#DesignerProperty: Key: Delimiters, DisplayName: Delimiters, FieldType: String, DefaultValue:  , Description: Accepts an array of strings that will trigger a new tag when typing. Does not replace the normal Tab and Enter keys.
#DesignerProperty: Key: Dense, DisplayName: Dense, FieldType: Boolean, DefaultValue: False , Description: Reduces the input height
#DesignerProperty: Key: Disabled, DisplayName: Disabled, FieldType: Boolean, DefaultValue: False , Description: Disables the input
#DesignerProperty: Key: Eager, DisplayName: Eager, FieldType: Boolean, DefaultValue: False , Description: Will force the components content to render on mounted. This is useful if you have content that will not be rendered in the DOM that you want crawled for SEO.
#DesignerProperty: Key: Error, DisplayName: Error, FieldType: Boolean, DefaultValue: False , Description: Puts the input in a manual error state
#DesignerProperty: Key: Filled, DisplayName: Filled, FieldType: Boolean, DefaultValue: False , Description: Applies the alternate filled input style
#DesignerProperty: Key: Filter, DisplayName: Filter, FieldType: String, DefaultValue:  , Description: The filtering algorithm used when searching. examplehttps://github.com/vuetifyjs/vuetify/blob/master/packages/vuetify/src/components/VAutocomplete/VAutocomplete.ts#L36
#DesignerProperty: Key: Flat, DisplayName: Flat, FieldType: Boolean, DefaultValue: False , Description: Removes elevation shadow added to element when using the **solo** or **solo-inverted** props
#DesignerProperty: Key: Height, DisplayName: Height, FieldType: String, DefaultValue:  , Description: Sets the height of the input
#DesignerProperty: Key: Hint, DisplayName: Hint, FieldType: String, DefaultValue:  , Description: Hint text
#DesignerProperty: Key: Key, DisplayName: Key, FieldType: String, DefaultValue:  , Description: key
#DesignerProperty: Key: Label, DisplayName: Label, FieldType: String, DefaultValue:  , Description: Sets input label
#DesignerProperty: Key: Light, DisplayName: Light, FieldType: Boolean, DefaultValue: False , Description: Applies the light theme variant to the component.
#DesignerProperty: Key: Messages, DisplayName: Messages, FieldType: String, DefaultValue:  , Description: Displays a list of messages or message if using a string
#DesignerProperty: Key: Multiple, DisplayName: Multiple, FieldType: Boolean, DefaultValue: False , Description: Changes select to multiple. Accepts array for value
#DesignerProperty: Key: Outlined, DisplayName: Outlined, FieldType: Boolean, DefaultValue: False , Description: Applies the outlined style to the input
#DesignerProperty: Key: ParentId, DisplayName: ParentId, FieldType: String, DefaultValue:  , Description: parent-id
#DesignerProperty: Key: Placeholder, DisplayName: Placeholder, FieldType: String, DefaultValue:  , Description: Sets the inputs placeholder text
#DesignerProperty: Key: Prefix, DisplayName: Prefix, FieldType: String, DefaultValue:  , Description: Displays prefix text
#DesignerProperty: Key: Readonly, DisplayName: Readonly, FieldType: Boolean, DefaultValue: False , Description: Puts input in readonly state
#DesignerProperty: Key: Ref, DisplayName: Ref, FieldType: String, DefaultValue:  , Description: ref
#DesignerProperty: Key: Reverse, DisplayName: Reverse, FieldType: Boolean, DefaultValue: False , Description: Reverses the input orientation
#DesignerProperty: Key: Rounded, DisplayName: Rounded, FieldType: Boolean, DefaultValue: False , Description: Adds a border radius to the input
#DesignerProperty: Key: Shaped, DisplayName: Shaped, FieldType: Boolean, DefaultValue: False , Description: Round if `outlined` and increase `border-radius` if `filled`. Must be used with either `outlined` or `filled`
#DesignerProperty: Key: Solo, DisplayName: Solo, FieldType: Boolean, DefaultValue: False , Description: Changes the style of the input
#DesignerProperty: Key: Success, DisplayName: Success, FieldType: Boolean, DefaultValue: False , Description: Puts the input in a manual success state
#DesignerProperty: Key: Suffix, DisplayName: Suffix, FieldType: String, DefaultValue:  , Description: Displays suffix text
#DesignerProperty: Key: TypeOf, DisplayName: TypeOf, FieldType: String, DefaultValue: text , Description: Sets input type
#DesignerProperty: Key: VBindClass, DisplayName: VBindClass, FieldType: String, DefaultValue:  , Description: v-bind:class
#DesignerProperty: Key: VBindStyle, DisplayName: VBindStyle, FieldType: String, DefaultValue:  , Description: v-bind:style
#DesignerProperty: Key: VElse, DisplayName: VElse, FieldType: String, DefaultValue:  , Description: v-else
#DesignerProperty: Key: VElseIf, DisplayName: VElseIf, FieldType: String, DefaultValue:  , Description: v-else-if
#DesignerProperty: Key: VFor, DisplayName: VFor, FieldType: String, DefaultValue:  , Description: v-for
#DesignerProperty: Key: VHtml, DisplayName: VHtml, FieldType: String, DefaultValue:  , Description: v-html
#DesignerProperty: Key: VIf, DisplayName: VIf, FieldType: String, DefaultValue:  , Description: v-if
#DesignerProperty: Key: VModel, DisplayName: VModel, FieldType: String, DefaultValue:  , Description: v-model
#DesignerProperty: Key: VOn, DisplayName: VOn, FieldType: String, DefaultValue:  , Description: v-on
#DesignerProperty: Key: VShow, DisplayName: VShow, FieldType: String, DefaultValue:  , Description: v-show
#DesignerProperty: Key: VText, DisplayName: VText, FieldType: String, DefaultValue:  , Description: v-text
#DesignerProperty: Key: Value, DisplayName: Value, FieldType: String, DefaultValue:  , Description: The inputs value
'***** STYLES *****

#DesignerProperty: Key: BorderColor, DisplayName: BorderColor, FieldType: String, DefaultValue:  , Description: , List: accent|amber|black|blue|blue-grey|brown|cyan|deep-orange|deep-purple|error|green|grey|indigo|info|light-blue|light-green|lime|none|orange|pink|primary|purple|red|secondary|success|teal|transparent|warning|white|yellow
#DesignerProperty: Key: BorderRadius, DisplayName: BorderRadius, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: BorderStyle, DisplayName: BorderStyle, FieldType: String, DefaultValue:  , Description: , List: dashed|dotted|double|groove|hidden|inset|none|outset|ridge|solid
#DesignerProperty: Key: BorderWidth, DisplayName: BorderWidth, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: MarginBottom, DisplayName: MarginBottom, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: MarginLeft, DisplayName: MarginLeft, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: MarginRight, DisplayName: MarginRight, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: MarginTop, DisplayName: MarginTop, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: PaddingBottom, DisplayName: PaddingBottom, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: PaddingLeft, DisplayName: PaddingLeft, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: PaddingRight, DisplayName: PaddingRight, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: PaddingTop, DisplayName: PaddingTop, FieldType: String, DefaultValue:  , Description: 

Sub Class_Globals
Private BANano As BANano 'ignore
Private mName As String 'ignore
Private mEventName As String 'ignore
Private mCallBack As Object 'ignore
Private mTarget As BANanoElement 'ignore
Private mElement As BANanoElement 'ignore
Private mClasses As String = ""
Private mStyle As String = ""
Private mAttributes As String = ""
Private mCaption As String = ""
Private classList As Map
Private styleList As Map
Private attributeList As Map
Private mTagName As String = "v-combobox"
Private sbText As StringBuilder
Private mStates As String
Public bindings As Map
Public methods As Map
Private eOnBlur As String = ""
Private stAttach As String = "false"
Private boAutofocus As Boolean = False
Private boChips As Boolean = False
Private boClearable As Boolean = False
Private stColor As String = ""
Private stCounter As String = ""
Private stDelimiters As String = ""
Private boDense As Boolean = False
Private boDisabled As Boolean = False
Private boEager As Boolean = False
Private boError As Boolean = False
Private boFilled As Boolean = False
Private stFilter As String = ""
Private boFlat As Boolean = False
Private stHeight As String = ""
Private stHint As String = ""
Private stKey As String = ""
Private stLabel As String = ""
Private boLight As Boolean = False
Private stMessages As String = ""
Private boMultiple As Boolean = False
Private boOutlined As Boolean = False
Private stParentId As String = ""
Private stPlaceholder As String = ""
Private stPrefix As String = ""
Private boReadonly As Boolean = False
Private stRef As String = ""
Private boReverse As Boolean = False
Private boRounded As Boolean = False
Private boShaped As Boolean = False
Private boSolo As Boolean = False
Private boSuccess As Boolean = False
Private stSuffix As String = ""
Private stTypeOf As String = "text"
Private stVBindClass As String = ""
Private stVBindStyle As String = ""
Private stVElse As String = ""
Private stVElseIf As String = ""
Private stVFor As String = ""
Private stVHtml As String = ""
Private stVIf As String = ""
Private stVModel As String = ""
Private stVOn As String = ""
Private stVShow As String = ""
Private stVText As String = ""
Private stValue As String = ""
Private stBorderColor As String = ""
Private stBorderRadius As String = ""
Private stBorderStyle As String = ""
Private stBorderWidth As String = ""
Private stMarginBottom As String = ""
Private stMarginLeft As String = ""
Private stMarginRight As String = ""
Private stMarginTop As String = ""
Private stPaddingBottom As String = ""
Private stPaddingLeft As String = ""
Private stPaddingRight As String = ""
Private stPaddingTop As String = ""
End Sub

'initialize the custom view
Public Sub Initialize (CallBack As Object, Name As String, EventName As String)
mName = Name.ToLowerCase
mEventName = EventName.ToLowerCase
mCallBack = CallBack
classList.Initialize
styleList.Initialize
attributeList.Initialize
sbText.Initialize
bindings.Initialize
methods.Initialize
End Sub

'Create view in the designer
Public Sub DesignerCreateView (Target As BANanoElement, Props As Map)
mTarget = Target
If Props <> Null Then
mClasses = Props.Get("Classes")
mAttributes = Props.Get("Attributes")
mStyle = Props.Get("Style")
mCaption = Props.Get("Caption")
mStates = Props.Get("States")
eOnBlur = Props.Get("OnBlur")
stAttach = Props.Get("Attach")
boAutofocus = Props.Get("Autofocus")
boChips = Props.Get("Chips")
boClearable = Props.Get("Clearable")
stColor = Props.Get("Color")
stCounter = Props.Get("Counter")
stDelimiters = Props.Get("Delimiters")
boDense = Props.Get("Dense")
boDisabled = Props.Get("Disabled")
boEager = Props.Get("Eager")
boError = Props.Get("Error")
boFilled = Props.Get("Filled")
stFilter = Props.Get("Filter")
boFlat = Props.Get("Flat")
stHeight = Props.Get("Height")
stHint = Props.Get("Hint")
stKey = Props.Get("Key")
stLabel = Props.Get("Label")
boLight = Props.Get("Light")
stMessages = Props.Get("Messages")
boMultiple = Props.Get("Multiple")
boOutlined = Props.Get("Outlined")
stParentId = Props.Get("ParentId")
stPlaceholder = Props.Get("Placeholder")
stPrefix = Props.Get("Prefix")
boReadonly = Props.Get("Readonly")
stRef = Props.Get("Ref")
boReverse = Props.Get("Reverse")
boRounded = Props.Get("Rounded")
boShaped = Props.Get("Shaped")
boSolo = Props.Get("Solo")
boSuccess = Props.Get("Success")
stSuffix = Props.Get("Suffix")
stTypeOf = Props.Get("TypeOf")
stVBindClass = Props.Get("VBindClass")
stVBindStyle = Props.Get("VBindStyle")
stVElse = Props.Get("VElse")
stVElseIf = Props.Get("VElseIf")
stVFor = Props.Get("VFor")
stVHtml = Props.Get("VHtml")
stVIf = Props.Get("VIf")
stVModel = Props.Get("VModel")
stVOn = Props.Get("VOn")
stVShow = Props.Get("VShow")
stVText = Props.Get("VText")
stValue = Props.Get("Value")
stBorderColor = Props.Get("BorderColor")
stBorderRadius = Props.Get("BorderRadius")
stBorderStyle = Props.Get("BorderStyle")
stBorderWidth = Props.Get("BorderWidth")
stMarginBottom = Props.Get("MarginBottom")
stMarginLeft = Props.Get("MarginLeft")
stMarginRight = Props.Get("MarginRight")
stMarginTop = Props.Get("MarginTop")
stPaddingBottom = Props.Get("PaddingBottom")
stPaddingLeft = Props.Get("PaddingLeft")
stPaddingRight = Props.Get("PaddingRight")
stPaddingTop = Props.Get("PaddingTop")
End If

AddAttr("attach", stAttach)
AddAttr("autofocus", boAutofocus)
AddAttr("chips", boChips)
AddAttr("clearable", boClearable)
AddAttr("color", stColor)
AddAttr("counter", stCounter)
AddAttr("delimiters", stDelimiters)
AddAttr("dense", boDense)
AddAttr("disabled", boDisabled)
AddAttr("eager", boEager)
AddAttr("error", boError)
AddAttr("filled", boFilled)
AddAttr("filter", stFilter)
AddAttr("flat", boFlat)
AddAttr("height", stHeight)
AddAttr("hint", stHint)
AddAttr("key", stKey)
AddAttr("label", stLabel)
AddAttr("light", boLight)
AddAttr("messages", stMessages)
AddAttr("multiple", boMultiple)
AddAttr("outlined", boOutlined)
AddAttr("parent-id", stParentId)
AddAttr("placeholder", stPlaceholder)
AddAttr("prefix", stPrefix)
AddAttr("readonly", boReadonly)
AddAttr("ref", stRef)
AddAttr("reverse", boReverse)
AddAttr("rounded", boRounded)
AddAttr("shaped", boShaped)
AddAttr("solo", boSolo)
AddAttr("success", boSuccess)
AddAttr("suffix", stSuffix)
AddAttr("type", stTypeOf)
AddAttr("v-bind:class", stVBindClass)
AddAttr("v-bind:style", stVBindStyle)
AddAttr("v-else", stVElse)
AddAttr("v-else-if", stVElseIf)
AddAttr("v-for", stVFor)
AddAttr("v-html", stVHtml)
AddAttr("v-if", stVIf)
AddAttr("v-model", stVModel)
AddAttr("v-on", stVOn)
AddAttr("v-show", stVShow)
AddAttr("v-text", stVText)
AddAttr("value", stValue)
AddStyle("border-color", stBorderColor)
AddStyle("border-radius", stBorderRadius)
AddStyle("border-style", stBorderStyle)
AddStyle("border-width", stBorderWidth)
AddStyle("margin-bottom", stMarginBottom)
AddStyle("margin-left", stMarginLeft)
AddStyle("margin-right", stMarginRight)
AddStyle("margin-top", stMarginTop)
AddStyle("padding-bottom", stPaddingBottom)
AddStyle("padding-left", stPaddingLeft)
AddStyle("padding-right", stPaddingRight)
AddStyle("padding-top", stPaddingTop)
AddClass(mClasses)
setAttributes(mAttributes)
setStyles(mStyle)
SetStates(mStates)

'link the events, if any
'This activates Blur the event exists on the module
SetOnBlur

'build and get the element
Dim strHTML As String = ToString
mElement = mTarget.Append(strHTML).Get("#" & mName)
End Sub

'return the generated html
Sub ToString As String
'build the 'class' attribute
Dim className As String = BANanoShared.JoinMapKeys(classList, " ")
AddAttr("class", className)
'build the 'style' attribute
Dim styleName As String = BANanoShared.BuildStyle(styleList)
AddAttr("style", styleName)
'build element internal structure
Dim iStructure As String = BANanoShared.BuildAttributes(attributeList)
iStructure = iStructure.trim
Dim rslt As String = $"<${mTagName} id="${mName}" ${iStructure}>${mCaption}${sbText.ToString}</${mTagName}>"$
Return rslt
End Sub

'bind an attribute
Sub SetVBind(prop As String, value As String)
prop = prop.ToLowerCase
value = value.ToLowerCase
prop = $"v-bind:${prop}"$
AddAttr(prop,value)
bindings.Put(value, Null)
End Sub

'add html of component to app and this binds events and states
Sub AddToApp(vap As BANanoVue)
'Dim sout As String = ToString
'vap.AddHTML(sout)
'apply the binding for the control
For Each k As String In bindings.Keys
Dim v As Object = bindings.Get(k)
vap.SetData(k, v)
Next
'apply the events
For Each k As String In methods.Keys
Dim cb As BANanoObject = methods.Get(k)
vap.SetCallBack(k, cb)
Next
End Sub

'bind component to app
Sub BindToApp(vap As BANanoVue)
'apply the binding for the control
For Each k As String In bindings.Keys
Dim v As Object = bindings.Get(k)
vap.SetData(k, v)
Next
'apply the events
For Each k As String In methods.Keys
Dim cb As BANanoObject = methods.Get(k)
vap.SetCallBack(k, cb)
Next
End Sub

'add html of component to another and binds events and states
Sub AddToComponent(ve As VMComponent)
'Dim sout As String = ToString
've.AddHTML(sout)
'apply the binding for the control
For Each k As String In bindings.Keys
Dim v As Object = bindings.Get(k)
ve.SetData(k, v)
Next
'apply the events
For Each k As String In methods.Keys
Dim cb As BANanoObject = methods.Get(k)
ve.SetCallBack(k, cb)
Next
End Sub

'binds events and states
Sub BindToComponent(ve As VMComponent)
'apply the binding for the control
For Each k As String In bindings.Keys
Dim v As Object = bindings.Get(k)
ve.SetData(k, v)
Next
'apply the events
For Each k As String In methods.Keys
Dim cb As BANanoObject = methods.Get(k)
ve.SetCallBack(k, cb)
Next
End Sub

'initialize data
Sub SetData(prop as string, val as Object)
bindings.Put(prop, val)
End Sub

'sets the state bindings
public Sub SetStates(varBindings As String)
if varBindings = "" Then Return
Dim mxItems As List = BANanoShared.StrParse(";", varBindings)
For Each mt As String In mxItems
Dim k As String = BANanoShared.MvField(mt,1,"=")
Dim v As String = BANanoShared.MvField(mt,2,"=")
If v.EqualsIgnoreCase("false") Then
bindings.Put(k, False)
else if v.EqualsIgnoreCase("true") Then
bindings.Put(k, True)
Else
bindings.put(k, v)
End If
Next
End Sub

'add an element to the text
Sub AddElement(elID As String, tag As String, props As Map, styleProps As Map, classNames As List, loose As List, Text As String)
elID = elID.tolowercase
elID = elID.Replace("#","")
Dim elIT As VueElement
elIT.Initialize(mCallBack, elID, tag)
elIT.SetText(Text)
If loose <> Null Then
For Each k As String In loose
elIT.SetAttr(k, True)
Next
End If
If props <> Null Then
For Each k As String In props.Keys
Dim v As String = props.Get(k)
elIT.SetAttr(k, v)
Next
End If
If styleProps <> Null Then
For Each k As String In styleProps.Keys
Dim v As String = styleProps.Get(k)
elIT.SetAttr(k, v)
Next
End If
If classNames <> Null Then
elIT.AddClasses(classNames)
End If
'convert to string
Dim sElement As String = elIT.tostring
sbText.Append(sElement)
End Sub

'add a break
Sub AddBR
sbText.Append("<br>")
End Sub

'add a horizontal rule
Sub AddHR
sbText.Append("<hr>")
End Sub

'returns the BANanoElement
public Sub getElement() As BANanoElement
Return mElement
End Sub

'returns the tag id
public Sub getID() As String
Return mName
End Sub

'add the element to the parent
public Sub AddToParent(targetID As String)
mTarget = BANano.GetElement("#" & targetID.ToLowerCase)
DesignerCreateView(mTarget, Null)
End Sub

'remove the component
public Sub Remove()
mElement.Remove
BANano.SetMeToNull
End Sub

'trigger an event
public Sub Trigger(event As String, params() As String)
If mElement <> Null Then
mElement.Trigger(event, params)
End If
End Sub

'add a class
public Sub AddClass(varClass As String)
If BANano.IsUndefined(varClass) Or BANano.IsNull(varClass) Then Return
If BANano.IsNumber(varClass) Then varClass = BANanoShared.CStr(varClass)
varClass = varClass.trim
if varClass = "" Then Return
if varClass = "none" Then Return
If mElement <> Null Then mElement.AddClass(varClass)
Dim mxItems As List = BANanoShared.StrParse(" ", varClass)
For Each mt As String In mxItems
classList.put(mt, mt)
Next
End Sub

'add a class on condition
public Sub AddClassOnCondition(varClass As String, varCondition As Boolean, varShouldBe As boolean)
If BANano.IsUndefined(varCondition) Or BANano.IsNull(varCondition) Then Return
if varShouldBe <> varCondition Then Return
If BANano.IsUndefined(varClass) Or BANano.IsNull(varClass) Then Return
If BANano.IsNumber(varClass) Then varClass = BANanoShared.CStr(varClass)
varClass = varClass.trim
if varClass = "" Then Return
if varClass = "none" Then Return
If mElement <> Null Then mElement.AddClass(varClass)
Dim mxItems As List = BANanoShared.StrParse(" ", varClass)
For Each mt As String In mxItems
classList.put(mt, mt)
Next
End Sub

'add a style
public Sub AddStyle(varProp As string, varStyle As String)
If BANano.IsUndefined(varStyle) Or BANano.IsNull(varStyle) Then Return
If BANano.IsNumber(varStyle) Then varStyle = BANanoShared.CStr(varStyle)
if varStyle = "none" Then Return
If mElement <> Null Then
Dim aStyle As Map = CreateMap()
aStyle.put(varProp, varStyle)
Dim sStyle As String = BANano.ToJSON(aStyle)
mElement.SetStyle(sStyle)
End If
styleList.put(varProp, varStyle)
End Sub

'add an attribute
Public Sub AddAttr(varProp As String, varValue As String) 
If BANano.IsUndefined(varValue) Or BANano.IsNull(varValue) Then Return 
If BANano.IsNumber(varValue) Then varValue = BANanoShared.CStr(varValue) 
'we are adding a boolean 
If BANano.IsBoolean(varValue) Then 
If varValue = True Then  
attributeList.put(varProp, varValue) 
If mElement <> Null Then mElement.SetAttr(varProp, varValue) 
End If 
Else 
'we are adding a string 
If varValue.StartsWith(":") Then 
If varValue.StartsWith("$") Then 
attributeList.put(varProp, varValue) 
If mElement <> Null Then mElement.SetAttr(varProp, varValue) 
Else 
Dim rname As String = BANanoShared.MidString2(varValue, 2) 
If rname.Contains(".") = False Then bindings.Put(rname, Null) 
attributeList.put($":${varProp}"$, rname) 
If mElement <> Null Then mElement.SetAttr($":${varProp}"$, rname) 
End If 
Else 
'does not start with : 
If mElement <> Null Then mElement.SetAttr(varProp, varValue) 
attributeList.put(varProp, varValue) 
Select Case varProp 
Case "v-model", "v-show", "v-if", "required", "disabled", "readonly" 
bindings.Put(varValue, Null) 
End Select 
End If 
End If 
Return 
End Sub
'add attr on condition
public Sub AddAttrOnCondition(varProp As String, varCondition As Boolean, varShouldBe As boolean)
If BANano.IsUndefined(varProp) Or BANano.IsNull(varProp) Then Return
If BANano.IsUndefined(varCondition) Or BANano.IsNull(varCondition) Then Return
if varShouldBe <> varCondition Then Return
AddAttr(varProp, varCondition)
End Sub


'returns the class names
Public Sub getClasses() As String
Dim sbClass As StringBuilder
sbClass.Initialize
For each k As String in classList.Keys
sbClass.Append(k).Append(" ")
Next
mClasses = sbClass.ToString
Return mClasses
End Sub

'set the style use a valid JSON string with {}
public Sub setStyle(varStyle As String)
If mElement <> Null Then
mElement.SetStyle(varStyle)
End If
Dim mres as Map = BANano.FromJSON(varStyle)
For each k As String in mres.Keys
Dim v As String = mres.Get(k)
styleList.put(k, v)
Next
End Sub

'returns the style as JSON
public Sub getStyle() As String
Dim sbStyle As StringBuilder
sbStyle.Initialize
sbStyle.Append("{")
For each k As String in styleList.Keys
Dim v As String = styleList.Get(k)
sbStyle.Append(k).Append(":").Append(v).Append(",")
Next
sbStyle.Append("}")
mStyle = sbStyle.ToString
Return mStyle
End Sub

'sets the attributes
public Sub setAttributes(varAttributes As String)
If varAttributes.IndexOf("=") >= 0 Then varAttributes = varAttributes.Replace("=",":")
Dim mxItems As List = BANanoShared.StrParse(";", varAttributes)
For Each mt As String In mxItems
Dim k As String = BANanoShared.MvField(mt,1,":")
Dim v As String = BANanoShared.MvField(mt,2,":")
If mElement <> Null Then mElement.SetAttr(k, v)
attributeList.put(k, v)
Next
End Sub

'sets the styles from the designer
public Sub setStyles(varStyles As String)
If varStyles.IndexOf("=") >= 0 Then varStyles = varStyles.Replace("=",":")
Dim mxItems As List = BANanoShared.StrParse(";", varStyles)
For Each mt As String In mxItems
Dim k As String = BANanoShared.MvField(mt,1,":")
Dim v As String = BANanoShared.MvField(mt,2,":")
AddStyle(k, v)
Next
End Sub

'returns the attributes
public Sub getAttributes() As String
Dim sbAttr As StringBuilder
sbAttr.Initialize
For each k As String in attributeList.Keys
Dim v As String = attributeList.Get(k)
sbAttr.Append(k).Append("=").Append(v).Append(";")
Next
mAttributes = sbAttr.ToString
Return mAttributes
End Sub

'sets the caption
public Sub setCaption(varText As String)
If mElement <> Null Then
mElement.SetHTML(BANano.SF(varText))
End If
mCaption = varText
End Sub

'returns the text
public Sub getCaption() As String
Return mCaption
End Sub

'set Specifies which DOM element that this component should detach to. String can be any valid querySelector and Object can be any valid Node. This will attach to the root `v-app` component by default.
public Sub setAttach(varAttach As String)
AddAttr("attach", varAttach)
stAttach = varAttach
End Sub

'get Specifies which DOM element that this component should detach to. String can be any valid querySelector and Object can be any valid Node. This will attach to the root `v-app` component by default.
public Sub getAttach() As String
Return stAttach
End Sub

'set Enables autofocus
public Sub setAutofocus(varAutofocus As Boolean)
AddAttr("autofocus", varAutofocus)
boAutofocus = varAutofocus
End Sub

'get Enables autofocus
public Sub getAutofocus() As Boolean
Return boAutofocus
End Sub

'set Changes display of selections to chips
public Sub setChips(varChips As Boolean)
AddAttr("chips", varChips)
boChips = varChips
End Sub

'get Changes display of selections to chips
public Sub getChips() As Boolean
Return boChips
End Sub

'set Add input clear functionality, default icon is Material Design Icons **mdi-clear**
public Sub setClearable(varClearable As Boolean)
AddAttr("clearable", varClearable)
boClearable = varClearable
End Sub

'get Add input clear functionality, default icon is Material Design Icons **mdi-clear**
public Sub getClearable() As Boolean
Return boClearable
End Sub

'set Applies specified color to the control - it can be the name of material color for example `success` or `purple` or css color `#033` or `rgba255, 0, 0, 0.5`. You can find list of built in classes on the colors page/styles/colors#material-colors.
public Sub setColor(varColor As String)
AddAttr("color", varColor)
stColor = varColor
End Sub

'get Applies specified color to the control - it can be the name of material color for example `success` or `purple` or css color `#033` or `rgba255, 0, 0, 0.5`. You can find list of built in classes on the colors page/styles/colors#material-colors.
public Sub getColor() As String
Return stColor
End Sub

'set Creates counter for input length; if no number is specified, it defaults to 25. Does not apply any validation.
public Sub setCounter(varCounter As String)
AddAttr("counter", varCounter)
stCounter = varCounter
End Sub

'get Creates counter for input length; if no number is specified, it defaults to 25. Does not apply any validation.
public Sub getCounter() As String
Return stCounter
End Sub

'set Accepts an array of strings that will trigger a new tag when typing. Does not replace the normal Tab and Enter keys.
public Sub setDelimiters(varDelimiters As String)
AddAttr("delimiters", varDelimiters)
stDelimiters = varDelimiters
End Sub

'get Accepts an array of strings that will trigger a new tag when typing. Does not replace the normal Tab and Enter keys.
public Sub getDelimiters() As String
Return stDelimiters
End Sub

'set Reduces the input height
public Sub setDense(varDense As Boolean)
AddAttr("dense", varDense)
boDense = varDense
End Sub

'get Reduces the input height
public Sub getDense() As Boolean
Return boDense
End Sub

'set Disables the input
public Sub setDisabled(varDisabled As Boolean)
AddAttr("disabled", varDisabled)
boDisabled = varDisabled
End Sub

'get Disables the input
public Sub getDisabled() As Boolean
Return boDisabled
End Sub

'set Will force the components content to render on mounted. This is useful if you have content that will not be rendered in the DOM that you want crawled for SEO.
public Sub setEager(varEager As Boolean)
AddAttr("eager", varEager)
boEager = varEager
End Sub

'get Will force the components content to render on mounted. This is useful if you have content that will not be rendered in the DOM that you want crawled for SEO.
public Sub getEager() As Boolean
Return boEager
End Sub

'set Puts the input in a manual error state
public Sub setError(varError As Boolean)
AddAttr("error", varError)
boError = varError
End Sub

'get Puts the input in a manual error state
public Sub getError() As Boolean
Return boError
End Sub

'set Applies the alternate filled input style
public Sub setFilled(varFilled As Boolean)
AddAttr("filled", varFilled)
boFilled = varFilled
End Sub

'get Applies the alternate filled input style
public Sub getFilled() As Boolean
Return boFilled
End Sub

'set The filtering algorithm used when searching. examplehttps://github.com/vuetifyjs/vuetify/blob/master/packages/vuetify/src/components/VAutocomplete/VAutocomplete.ts#L36
public Sub setFilter(varFilter As String)
AddAttr("filter", varFilter)
stFilter = varFilter
End Sub

'get The filtering algorithm used when searching. examplehttps://github.com/vuetifyjs/vuetify/blob/master/packages/vuetify/src/components/VAutocomplete/VAutocomplete.ts#L36
public Sub getFilter() As String
Return stFilter
End Sub

'set Removes elevation shadow added to element when using the **solo** or **solo-inverted** props
public Sub setFlat(varFlat As Boolean)
AddAttr("flat", varFlat)
boFlat = varFlat
End Sub

'get Removes elevation shadow added to element when using the **solo** or **solo-inverted** props
public Sub getFlat() As Boolean
Return boFlat
End Sub

'set Sets the height of the input
public Sub setHeight(varHeight As String)
AddAttr("height", varHeight)
stHeight = varHeight
End Sub

'get Sets the height of the input
public Sub getHeight() As String
Return stHeight
End Sub

'set Hint text
public Sub setHint(varHint As String)
AddAttr("hint", varHint)
stHint = varHint
End Sub

'get Hint text
public Sub getHint() As String
Return stHint
End Sub

'set key
public Sub setKey(varKey As String)
AddAttr("key", varKey)
stKey = varKey
End Sub

'get key
public Sub getKey() As String
Return stKey
End Sub

'set Sets input label
public Sub setLabel(varLabel As String)
AddAttr("label", varLabel)
stLabel = varLabel
End Sub

'get Sets input label
public Sub getLabel() As String
Return stLabel
End Sub

'set Applies the light theme variant to the component.
public Sub setLight(varLight As Boolean)
AddAttr("light", varLight)
boLight = varLight
End Sub

'get Applies the light theme variant to the component.
public Sub getLight() As Boolean
Return boLight
End Sub

'set Displays a list of messages or message if using a string
public Sub setMessages(varMessages As String)
AddAttr("messages", varMessages)
stMessages = varMessages
End Sub

'get Displays a list of messages or message if using a string
public Sub getMessages() As String
Return stMessages
End Sub

'set Changes select to multiple. Accepts array for value
public Sub setMultiple(varMultiple As Boolean)
AddAttr("multiple", varMultiple)
boMultiple = varMultiple
End Sub

'get Changes select to multiple. Accepts array for value
public Sub getMultiple() As Boolean
Return boMultiple
End Sub

'set Applies the outlined style to the input
public Sub setOutlined(varOutlined As Boolean)
AddAttr("outlined", varOutlined)
boOutlined = varOutlined
End Sub

'get Applies the outlined style to the input
public Sub getOutlined() As Boolean
Return boOutlined
End Sub

'set parent-id
public Sub setParentId(varParentId As String)
AddAttr("parent-id", varParentId)
stParentId = varParentId
End Sub

'get parent-id
public Sub getParentId() As String
Return stParentId
End Sub

'set Sets the inputs placeholder text
public Sub setPlaceholder(varPlaceholder As String)
AddAttr("placeholder", varPlaceholder)
stPlaceholder = varPlaceholder
End Sub

'get Sets the inputs placeholder text
public Sub getPlaceholder() As String
Return stPlaceholder
End Sub

'set Displays prefix text
public Sub setPrefix(varPrefix As String)
AddAttr("prefix", varPrefix)
stPrefix = varPrefix
End Sub

'get Displays prefix text
public Sub getPrefix() As String
Return stPrefix
End Sub

'set Puts input in readonly state
public Sub setReadonly(varReadonly As Boolean)
AddAttr("readonly", varReadonly)
boReadonly = varReadonly
End Sub

'get Puts input in readonly state
public Sub getReadonly() As Boolean
Return boReadonly
End Sub

'set ref
public Sub setRef(varRef As String)
AddAttr("ref", varRef)
stRef = varRef
End Sub

'get ref
public Sub getRef() As String
Return stRef
End Sub

'set Reverses the input orientation
public Sub setReverse(varReverse As Boolean)
AddAttr("reverse", varReverse)
boReverse = varReverse
End Sub

'get Reverses the input orientation
public Sub getReverse() As Boolean
Return boReverse
End Sub

'set Adds a border radius to the input
public Sub setRounded(varRounded As Boolean)
AddAttr("rounded", varRounded)
boRounded = varRounded
End Sub

'get Adds a border radius to the input
public Sub getRounded() As Boolean
Return boRounded
End Sub

'set Round if `outlined` and increase `border-radius` if `filled`. Must be used with either `outlined` or `filled`
public Sub setShaped(varShaped As Boolean)
AddAttr("shaped", varShaped)
boShaped = varShaped
End Sub

'get Round if `outlined` and increase `border-radius` if `filled`. Must be used with either `outlined` or `filled`
public Sub getShaped() As Boolean
Return boShaped
End Sub

'set Changes the style of the input
public Sub setSolo(varSolo As Boolean)
AddAttr("solo", varSolo)
boSolo = varSolo
End Sub

'get Changes the style of the input
public Sub getSolo() As Boolean
Return boSolo
End Sub

'set Puts the input in a manual success state
public Sub setSuccess(varSuccess As Boolean)
AddAttr("success", varSuccess)
boSuccess = varSuccess
End Sub

'get Puts the input in a manual success state
public Sub getSuccess() As Boolean
Return boSuccess
End Sub

'set Displays suffix text
public Sub setSuffix(varSuffix As String)
AddAttr("suffix", varSuffix)
stSuffix = varSuffix
End Sub

'get Displays suffix text
public Sub getSuffix() As String
Return stSuffix
End Sub

'set Sets input type
public Sub setTypeOf(varTypeOf As String)
AddAttr("type", varTypeOf)
stTypeOf = varTypeOf
End Sub

'get Sets input type
public Sub getTypeOf() As String
Return stTypeOf
End Sub

'set v-bind:class
public Sub setVBindClass(varVBindClass As String)
AddAttr("v-bind:class", varVBindClass)
stVBindClass = varVBindClass
End Sub

'get v-bind:class
public Sub getVBindClass() As String
Return stVBindClass
End Sub

'set v-bind:style
public Sub setVBindStyle(varVBindStyle As String)
AddAttr("v-bind:style", varVBindStyle)
stVBindStyle = varVBindStyle
End Sub

'get v-bind:style
public Sub getVBindStyle() As String
Return stVBindStyle
End Sub

'set v-else
public Sub setVElse(varVElse As String)
AddAttr("v-else", varVElse)
stVElse = varVElse
End Sub

'get v-else
public Sub getVElse() As String
Return stVElse
End Sub

'set v-else-if
public Sub setVElseIf(varVElseIf As String)
AddAttr("v-else-if", varVElseIf)
stVElseIf = varVElseIf
End Sub

'get v-else-if
public Sub getVElseIf() As String
Return stVElseIf
End Sub

'set v-for
public Sub setVFor(varVFor As String)
AddAttr("v-for", varVFor)
stVFor = varVFor
End Sub

'get v-for
public Sub getVFor() As String
Return stVFor
End Sub

'set v-html
public Sub setVHtml(varVHtml As String)
AddAttr("v-html", varVHtml)
stVHtml = varVHtml
End Sub

'get v-html
public Sub getVHtml() As String
Return stVHtml
End Sub

'set v-if
public Sub setVIf(varVIf As String)
AddAttr("v-if", varVIf)
stVIf = varVIf
End Sub

'get v-if
public Sub getVIf() As String
Return stVIf
End Sub

'set v-model
public Sub setVModel(varVModel As String)
AddAttr("v-model", varVModel)
stVModel = varVModel
End Sub

'get v-model
public Sub getVModel() As String
Return stVModel
End Sub

'set v-on
public Sub setVOn(varVOn As String)
AddAttr("v-on", varVOn)
stVOn = varVOn
End Sub

'get v-on
public Sub getVOn() As String
Return stVOn
End Sub

'set v-show
public Sub setVShow(varVShow As String)
AddAttr("v-show", varVShow)
stVShow = varVShow
End Sub

'get v-show
public Sub getVShow() As String
Return stVShow
End Sub

'set v-text
public Sub setVText(varVText As String)
AddAttr("v-text", varVText)
stVText = varVText
End Sub

'get v-text
public Sub getVText() As String
Return stVText
End Sub

'set The inputs value
public Sub setValue(varValue As String)
AddAttr("value", varValue)
stValue = varValue
End Sub

'get The inputs value
public Sub getValue() As String
Return stValue
End Sub

'set border-color
public Sub setBorderColor(varBorderColor As String)
AddStyle("border-color", varBorderColor)
stBorderColor = varBorderColor
End Sub

'get border-color
public Sub getBorderColor() As String
Return stBorderColor
End Sub

'add value-accent style
public Sub setBorderColorAccent()
AddStyle("border-color", "accent")
End Sub

'add value-amber style
public Sub setBorderColorAmber()
AddStyle("border-color", "amber")
End Sub

'add value-black style
public Sub setBorderColorBlack()
AddStyle("border-color", "black")
End Sub

'add value-blue style
public Sub setBorderColorBlue()
AddStyle("border-color", "blue")
End Sub

'add value-blue-grey style
public Sub setBorderColorBlueGrey()
AddStyle("border-color", "blue-grey")
End Sub

'add value-brown style
public Sub setBorderColorBrown()
AddStyle("border-color", "brown")
End Sub

'add value-cyan style
public Sub setBorderColorCyan()
AddStyle("border-color", "cyan")
End Sub

'add value-deep-orange style
public Sub setBorderColorDeepOrange()
AddStyle("border-color", "deep-orange")
End Sub

'add value-deep-purple style
public Sub setBorderColorDeepPurple()
AddStyle("border-color", "deep-purple")
End Sub

'add value-error style
public Sub setBorderColorError()
AddStyle("border-color", "error")
End Sub

'add value-green style
public Sub setBorderColorGreen()
AddStyle("border-color", "green")
End Sub

'add value-grey style
public Sub setBorderColorGrey()
AddStyle("border-color", "grey")
End Sub

'add value-indigo style
public Sub setBorderColorIndigo()
AddStyle("border-color", "indigo")
End Sub

'add value-info style
public Sub setBorderColorInfo()
AddStyle("border-color", "info")
End Sub

'add value-light-blue style
public Sub setBorderColorLightBlue()
AddStyle("border-color", "light-blue")
End Sub

'add value-light-green style
public Sub setBorderColorLightGreen()
AddStyle("border-color", "light-green")
End Sub

'add value-lime style
public Sub setBorderColorLime()
AddStyle("border-color", "lime")
End Sub

'add value-orange style
public Sub setBorderColorOrange()
AddStyle("border-color", "orange")
End Sub

'add value-pink style
public Sub setBorderColorPink()
AddStyle("border-color", "pink")
End Sub

'add value-primary style
public Sub setBorderColorPrimary()
AddStyle("border-color", "primary")
End Sub

'add value-purple style
public Sub setBorderColorPurple()
AddStyle("border-color", "purple")
End Sub

'add value-red style
public Sub setBorderColorRed()
AddStyle("border-color", "red")
End Sub

'add value-secondary style
public Sub setBorderColorSecondary()
AddStyle("border-color", "secondary")
End Sub

'add value-success style
public Sub setBorderColorSuccess()
AddStyle("border-color", "success")
End Sub

'add value-teal style
public Sub setBorderColorTeal()
AddStyle("border-color", "teal")
End Sub

'add value-transparent style
public Sub setBorderColorTransparent()
AddStyle("border-color", "transparent")
End Sub

'add value-warning style
public Sub setBorderColorWarning()
AddStyle("border-color", "warning")
End Sub

'add value-white style
public Sub setBorderColorWhite()
AddStyle("border-color", "white")
End Sub

'add value-yellow style
public Sub setBorderColorYellow()
AddStyle("border-color", "yellow")
End Sub

'set border-radius
public Sub setBorderRadius(varBorderRadius As String)
AddStyle("border-radius", varBorderRadius)
stBorderRadius = varBorderRadius
End Sub

'get border-radius
public Sub getBorderRadius() As String
Return stBorderRadius
End Sub

'set border-style
public Sub setBorderStyle(varBorderStyle As String)
AddStyle("border-style", varBorderStyle)
stBorderStyle = varBorderStyle
End Sub

'get border-style
public Sub getBorderStyle() As String
Return stBorderStyle
End Sub

'add value-dashed style
public Sub setBorderStyleDashed()
AddStyle("border-style", "dashed")
End Sub

'add value-dotted style
public Sub setBorderStyleDotted()
AddStyle("border-style", "dotted")
End Sub

'add value-double style
public Sub setBorderStyleDouble()
AddStyle("border-style", "double")
End Sub

'add value-groove style
public Sub setBorderStyleGroove()
AddStyle("border-style", "groove")
End Sub

'add value-hidden style
public Sub setBorderStyleHidden()
AddStyle("border-style", "hidden")
End Sub

'add value-inset style
public Sub setBorderStyleInset()
AddStyle("border-style", "inset")
End Sub

'add value-outset style
public Sub setBorderStyleOutset()
AddStyle("border-style", "outset")
End Sub

'add value-ridge style
public Sub setBorderStyleRidge()
AddStyle("border-style", "ridge")
End Sub

'add value-solid style
public Sub setBorderStyleSolid()
AddStyle("border-style", "solid")
End Sub

'set border-width
public Sub setBorderWidth(varBorderWidth As String)
AddStyle("border-width", varBorderWidth)
stBorderWidth = varBorderWidth
End Sub

'get border-width
public Sub getBorderWidth() As String
Return stBorderWidth
End Sub

'set margin-bottom
public Sub setMarginBottom(varMarginBottom As String)
AddStyle("margin-bottom", varMarginBottom)
stMarginBottom = varMarginBottom
End Sub

'get margin-bottom
public Sub getMarginBottom() As String
Return stMarginBottom
End Sub

'set margin-left
public Sub setMarginLeft(varMarginLeft As String)
AddStyle("margin-left", varMarginLeft)
stMarginLeft = varMarginLeft
End Sub

'get margin-left
public Sub getMarginLeft() As String
Return stMarginLeft
End Sub

'set margin-right
public Sub setMarginRight(varMarginRight As String)
AddStyle("margin-right", varMarginRight)
stMarginRight = varMarginRight
End Sub

'get margin-right
public Sub getMarginRight() As String
Return stMarginRight
End Sub

'set margin-top
public Sub setMarginTop(varMarginTop As String)
AddStyle("margin-top", varMarginTop)
stMarginTop = varMarginTop
End Sub

'get margin-top
public Sub getMarginTop() As String
Return stMarginTop
End Sub

'set padding-bottom
public Sub setPaddingBottom(varPaddingBottom As String)
AddStyle("padding-bottom", varPaddingBottom)
stPaddingBottom = varPaddingBottom
End Sub

'get padding-bottom
public Sub getPaddingBottom() As String
Return stPaddingBottom
End Sub

'set padding-left
public Sub setPaddingLeft(varPaddingLeft As String)
AddStyle("padding-left", varPaddingLeft)
stPaddingLeft = varPaddingLeft
End Sub

'get padding-left
public Sub getPaddingLeft() As String
Return stPaddingLeft
End Sub

'set padding-right
public Sub setPaddingRight(varPaddingRight As String)
AddStyle("padding-right", varPaddingRight)
stPaddingRight = varPaddingRight
End Sub

'get padding-right
public Sub getPaddingRight() As String
Return stPaddingRight
End Sub

'set padding-top
public Sub setPaddingTop(varPaddingTop As String)
AddStyle("padding-top", varPaddingTop)
stPaddingTop = varPaddingTop
End Sub

'get padding-top
public Sub getPaddingTop() As String
Return stPaddingTop
End Sub


'add a child component
Sub AddChild(child As String)
sbText.Append(child)
End Sub

'set on Blur event, updates the master events records
Sub SetOnBlur()
Dim sName As String = $"${mEventName}_Blur"$
sName = sName.tolowercase
If SubExists(mCallBack, sName) = False Then Return
If BANano.IsUndefined(eOnBlur) Or BANano.IsNull(eOnBlur) Then eOnBlur = ""
Dim sCode As String = $"${sName}(${eOnBlur})"$
AddAttr("v-on:blur", sCode)
'arguments for the event
Dim argument As BANanoEvent 'ignore
Dim cb As BANanoObject = BANano.CallBack(mCallBack, sName, Array(argument))
methods.Put(sName, cb)
End Sub

Sub SetOnBlurE(sBlur As String)
eOnBlur = sBlur
End Sub

