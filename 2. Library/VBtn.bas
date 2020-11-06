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

#Event: Click (argument As BANanoEvent)

#DesignerProperty: Key: OnClick, DisplayName: OnClick, FieldType: String, DefaultValue: , Description: Event arguments to be passed to the attribute.
#DesignerProperty: Key: Caption, DisplayName: Caption, FieldType: String, DefaultValue: , Description: Text on the element
#DesignerProperty: Key: Classes, DisplayName: Classes, FieldType: String, DefaultValue: , Description: Classes added to the HTML tag.
#DesignerProperty: Key: Style, DisplayName: Style, FieldType: String, DefaultValue: , Description: Styles added to the HTML tag. Must be a json String.
#DesignerProperty: Key: Attributes, DisplayName: Attributes, FieldType: String, DefaultValue: , Description: Attributes added to the HTML tag. Must be a json String.
#DesignerProperty: Key: States, DisplayName: States, FieldType: String, DefaultValue: , Description: Initial Binding States. Must be a json String.
'***** CLASSES *****

'***** ATTRIBUTES *****

#DesignerProperty: Key: Absolute, DisplayName: Absolute, FieldType: Boolean, DefaultValue: False , Description: Applies **position: absolute** to the component.
#DesignerProperty: Key: Append, DisplayName: Append, FieldType: Boolean, DefaultValue: False , Description: Setting **append** prop always appends the relative path to the current path. You can find more information about the **append** prophttps://router.vuejs.org/api/#append on the vue-router documentation.
#DesignerProperty: Key: Block, DisplayName: Block, FieldType: Boolean, DefaultValue: False , Description: Expands the button to 100% of available space.
#DesignerProperty: Key: Bottom, DisplayName: Bottom, FieldType: Boolean, DefaultValue: False , Description: Aligns the component towards the bottom.
#DesignerProperty: Key: Color, DisplayName: Color, FieldType: String, DefaultValue:  , Description: Applies specified color to the control - it can be the name of material color for example `success` or `purple` or css color `#033` or `rgba255, 0, 0, 0.5`. You can find list of built in classes on the colors page/styles/colors#material-colors.
#DesignerProperty: Key: Dark, DisplayName: Dark, FieldType: Boolean, DefaultValue: False , Description: Applies the dark theme variant to the component. You can find more information on the Material Design documentation for dark themeshttps://material.io/design/color/dark-theme.html.
#DesignerProperty: Key: Depressed, DisplayName: Depressed, FieldType: Boolean, DefaultValue: False , Description: Removes the button box shadow.
#DesignerProperty: Key: Disabled, DisplayName: Disabled, FieldType: Boolean, DefaultValue: False , Description: Removes the ability to click or target the component.
#DesignerProperty: Key: Elevation, DisplayName: Elevation, FieldType: String, DefaultValue:  , Description: Designates an elevation applied to the component between 0 and 24. You can find more information on the elevation page/styles/elevation.
#DesignerProperty: Key: Exact, DisplayName: Exact, FieldType: Boolean, DefaultValue: False , Description: Exactly match the link. Without this, / will match every route. You can find more information about the **exact** prophttps://router.vuejs.org/api/#exact on the vue-router documentation.
#DesignerProperty: Key: Fab, DisplayName: Fab, FieldType: Boolean, DefaultValue: False , Description: Designates the button as a floating-action-button - _round_.
#DesignerProperty: Key: Fixed, DisplayName: Fixed, FieldType: Boolean, DefaultValue: False , Description: Applies **position: fixed** to the component.
#DesignerProperty: Key: Height, DisplayName: Height, FieldType: String, DefaultValue:  , Description: Sets the height for the component.
#DesignerProperty: Key: Href, DisplayName: Href, FieldType: String, DefaultValue:  , Description: Designates the component as anchor and applies the **href** attribute.
#DesignerProperty: Key: Icon, DisplayName: Icon, FieldType: Boolean, DefaultValue: False , Description: Designates the button as icon - _round and flat_
#DesignerProperty: Key: Key, DisplayName: Key, FieldType: String, DefaultValue:  , Description: key
#DesignerProperty: Key: Large, DisplayName: Large, FieldType: Boolean, DefaultValue: False , Description: Makes the component large.
#DesignerProperty: Key: Left, DisplayName: Left, FieldType: Boolean, DefaultValue: False , Description: Aligns the component towards the left. This should be used with the **absolute** or **fixed** props.
#DesignerProperty: Key: Light, DisplayName: Light, FieldType: Boolean, DefaultValue: False , Description: Applies the light theme variant to the component.
#DesignerProperty: Key: Link, DisplayName: Link, FieldType: Boolean, DefaultValue: False , Description: Designates that the component is a link. This is automatic when using the **href** or **to** prop.
#DesignerProperty: Key: Loading, DisplayName: Loading, FieldType: Boolean, DefaultValue: False , Description: Adds a loading icon animation
#DesignerProperty: Key: Nuxt, DisplayName: Nuxt, FieldType: Boolean, DefaultValue: False , Description: Specifies the link is a `nuxt-link`. For use with the nuxt frameworkhttps://nuxtjs.org/api/components-nuxt-link/.
#DesignerProperty: Key: Outlined, DisplayName: Outlined, FieldType: Boolean, DefaultValue: False , Description: Makes the background transparent and applies a thin border.
#DesignerProperty: Key: ParentId, DisplayName: ParentId, FieldType: String, DefaultValue:  , Description: parent-id
#DesignerProperty: Key: Ref, DisplayName: Ref, FieldType: String, DefaultValue:  , Description: ref
#DesignerProperty: Key: Right, DisplayName: Right, FieldType: Boolean, DefaultValue: False , Description: Aligns the component towards the right. This should be used with the **absolute** or **fixed** props.
#DesignerProperty: Key: Ripple, DisplayName: Ripple, FieldType: String, DefaultValue:  , Description: Applies the v-ripple/directives/ripple directive.
#DesignerProperty: Key: Rounded, DisplayName: Rounded, FieldType: Boolean, DefaultValue: False , Description: Applies a large border radius on the button.
#DesignerProperty: Key: Shaped, DisplayName: Shaped, FieldType: Boolean, DefaultValue: False , Description: Applies a large border radius on the top left and bottom right of the card.
#DesignerProperty: Key: Small, DisplayName: Small, FieldType: Boolean, DefaultValue: False , Description: Makes the component small.
#DesignerProperty: Key: Tag, DisplayName: Tag, FieldType: String, DefaultValue: button , Description: Specify a custom tag used on the root element.
#DesignerProperty: Key: Target, DisplayName: Target, FieldType: String, DefaultValue:  , Description: Designates the target attribute. This should only be applied when using the **href** prop.
#DesignerProperty: Key: Text, DisplayName: Text, FieldType: Boolean, DefaultValue: False , Description: Makes the background transparent.
#DesignerProperty: Key: Tile, DisplayName: Tile, FieldType: Boolean, DefaultValue: False , Description: Removes the components **border-radius**.
#DesignerProperty: Key: To, DisplayName: To, FieldType: String, DefaultValue:  , Description: Denotes the target route of the link. You can find more information about the **to** prophttps://router.vuejs.org/api/#to on the vue-router documentation.
#DesignerProperty: Key: Top, DisplayName: Top, FieldType: Boolean, DefaultValue: False , Description: Aligns the content towards the top.
#DesignerProperty: Key: TypeOf, DisplayName: TypeOf, FieldType: String, DefaultValue: button , Description: Set the buttons **type** attribute
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
#DesignerProperty: Key: Value, DisplayName: Value, FieldType: String, DefaultValue:  , Description: Controls whether the component is visible or hidden.
#DesignerProperty: Key: Width, DisplayName: Width, FieldType: String, DefaultValue:  , Description: Sets the width for the component.
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
Private mTagName As String = "v-btn"
Private sbText As StringBuilder
Private mStates As String
Public bindings As Map
Public methods As Map
Private eOnClick As String = ""
Private boAbsolute As Boolean = False
Private boAppend As Boolean = False
Private boBlock As Boolean = False
Private boBottom As Boolean = False
Private stColor As String = ""
Private boDark As Boolean = False
Private boDepressed As Boolean = False
Private boDisabled As Boolean = False
Private stElevation As String = ""
Private boExact As Boolean = False
Private boFab As Boolean = False
Private boFixed As Boolean = False
Private stHeight As String = ""
Private stHref As String = ""
Private boIcon As Boolean = False
Private stKey As String = ""
Private boLarge As Boolean = False
Private boLeft As Boolean = False
Private boLight As Boolean = False
Private boLink As Boolean = False
Private boLoading As Boolean = False
Private boNuxt As Boolean = False
Private boOutlined As Boolean = False
Private stParentId As String = ""
Private stRef As String = ""
Private boRight As Boolean = False
Private stRipple As String = ""
Private boRounded As Boolean = False
Private boShaped As Boolean = False
Private boSmall As Boolean = False
Private stTag As String = "button"
Private stTarget As String = ""
Private boText As Boolean = False
Private boTile As Boolean = False
Private stTo As String = ""
Private boTop As Boolean = False
Private stTypeOf As String = "button"
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
Private stWidth As String = ""
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
eOnClick = Props.Get("OnClick")
boAbsolute = Props.Get("Absolute")
boAppend = Props.Get("Append")
boBlock = Props.Get("Block")
boBottom = Props.Get("Bottom")
stColor = Props.Get("Color")
boDark = Props.Get("Dark")
boDepressed = Props.Get("Depressed")
boDisabled = Props.Get("Disabled")
stElevation = Props.Get("Elevation")
boExact = Props.Get("Exact")
boFab = Props.Get("Fab")
boFixed = Props.Get("Fixed")
stHeight = Props.Get("Height")
stHref = Props.Get("Href")
boIcon = Props.Get("Icon")
stKey = Props.Get("Key")
boLarge = Props.Get("Large")
boLeft = Props.Get("Left")
boLight = Props.Get("Light")
boLink = Props.Get("Link")
boLoading = Props.Get("Loading")
boNuxt = Props.Get("Nuxt")
boOutlined = Props.Get("Outlined")
stParentId = Props.Get("ParentId")
stRef = Props.Get("Ref")
boRight = Props.Get("Right")
stRipple = Props.Get("Ripple")
boRounded = Props.Get("Rounded")
boShaped = Props.Get("Shaped")
boSmall = Props.Get("Small")
stTag = Props.Get("Tag")
stTarget = Props.Get("Target")
boText = Props.Get("Text")
boTile = Props.Get("Tile")
stTo = Props.Get("To")
boTop = Props.Get("Top")
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
stWidth = Props.Get("Width")
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

AddAttr("absolute", boAbsolute)
AddAttr("append", boAppend)
AddAttr("block", boBlock)
AddAttr("bottom", boBottom)
AddAttr("color", stColor)
AddAttr("dark", boDark)
AddAttr("depressed", boDepressed)
AddAttr("disabled", boDisabled)
AddAttr("elevation", stElevation)
AddAttr("exact", boExact)
AddAttr("fab", boFab)
AddAttr("fixed", boFixed)
AddAttr("height", stHeight)
AddAttr("href", stHref)
AddAttr("icon", boIcon)
AddAttr("key", stKey)
AddAttr("large", boLarge)
AddAttr("left", boLeft)
AddAttr("light", boLight)
AddAttr("link", boLink)
AddAttr("loading", boLoading)
AddAttr("nuxt", boNuxt)
AddAttr("outlined", boOutlined)
AddAttr("parent-id", stParentId)
AddAttr("ref", stRef)
AddAttr("right", boRight)
AddAttr("ripple", stRipple)
AddAttr("rounded", boRounded)
AddAttr("shaped", boShaped)
AddAttr("small", boSmall)
AddAttr("tag", stTag)
AddAttr("target", stTarget)
AddAttr("text", boText)
AddAttr("tile", boTile)
AddAttr("to", stTo)
AddAttr("top", boTop)
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
AddAttr("width", stWidth)
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
'This activates Click the event exists on the module
SetOnClick

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

'set Applies **position: absolute** to the component.
public Sub setAbsolute(varAbsolute As Boolean)
AddAttr("absolute", varAbsolute)
boAbsolute = varAbsolute
End Sub

'get Applies **position: absolute** to the component.
public Sub getAbsolute() As Boolean
Return boAbsolute
End Sub

'set Setting **append** prop always appends the relative path to the current path. You can find more information about the **append** prophttps://router.vuejs.org/api/#append on the vue-router documentation.
public Sub setAppend(varAppend As Boolean)
AddAttr("append", varAppend)
boAppend = varAppend
End Sub

'get Setting **append** prop always appends the relative path to the current path. You can find more information about the **append** prophttps://router.vuejs.org/api/#append on the vue-router documentation.
public Sub getAppend() As Boolean
Return boAppend
End Sub

'set Expands the button to 100% of available space.
public Sub setBlock(varBlock As Boolean)
AddAttr("block", varBlock)
boBlock = varBlock
End Sub

'get Expands the button to 100% of available space.
public Sub getBlock() As Boolean
Return boBlock
End Sub

'set Aligns the component towards the bottom.
public Sub setBottom(varBottom As Boolean)
AddAttr("bottom", varBottom)
boBottom = varBottom
End Sub

'get Aligns the component towards the bottom.
public Sub getBottom() As Boolean
Return boBottom
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

'set Applies the dark theme variant to the component. You can find more information on the Material Design documentation for dark themeshttps://material.io/design/color/dark-theme.html.
public Sub setDark(varDark As Boolean)
AddAttr("dark", varDark)
boDark = varDark
End Sub

'get Applies the dark theme variant to the component. You can find more information on the Material Design documentation for dark themeshttps://material.io/design/color/dark-theme.html.
public Sub getDark() As Boolean
Return boDark
End Sub

'set Removes the button box shadow.
public Sub setDepressed(varDepressed As Boolean)
AddAttr("depressed", varDepressed)
boDepressed = varDepressed
End Sub

'get Removes the button box shadow.
public Sub getDepressed() As Boolean
Return boDepressed
End Sub

'set Removes the ability to click or target the component.
public Sub setDisabled(varDisabled As Boolean)
AddAttr("disabled", varDisabled)
boDisabled = varDisabled
End Sub

'get Removes the ability to click or target the component.
public Sub getDisabled() As Boolean
Return boDisabled
End Sub

'set Designates an elevation applied to the component between 0 and 24. You can find more information on the elevation page/styles/elevation.
public Sub setElevation(varElevation As String)
AddAttr("elevation", varElevation)
stElevation = varElevation
End Sub

'get Designates an elevation applied to the component between 0 and 24. You can find more information on the elevation page/styles/elevation.
public Sub getElevation() As String
Return stElevation
End Sub

'set Exactly match the link. Without this, / will match every route. You can find more information about the **exact** prophttps://router.vuejs.org/api/#exact on the vue-router documentation.
public Sub setExact(varExact As Boolean)
AddAttr("exact", varExact)
boExact = varExact
End Sub

'get Exactly match the link. Without this, / will match every route. You can find more information about the **exact** prophttps://router.vuejs.org/api/#exact on the vue-router documentation.
public Sub getExact() As Boolean
Return boExact
End Sub

'set Designates the button as a floating-action-button - _round_.
public Sub setFab(varFab As Boolean)
AddAttr("fab", varFab)
boFab = varFab
End Sub

'get Designates the button as a floating-action-button - _round_.
public Sub getFab() As Boolean
Return boFab
End Sub

'set Applies **position: fixed** to the component.
public Sub setFixed(varFixed As Boolean)
AddAttr("fixed", varFixed)
boFixed = varFixed
End Sub

'get Applies **position: fixed** to the component.
public Sub getFixed() As Boolean
Return boFixed
End Sub

'set Sets the height for the component.
public Sub setHeight(varHeight As String)
AddAttr("height", varHeight)
stHeight = varHeight
End Sub

'get Sets the height for the component.
public Sub getHeight() As String
Return stHeight
End Sub

'set Designates the component as anchor and applies the **href** attribute.
public Sub setHref(varHref As String)
AddAttr("href", varHref)
stHref = varHref
End Sub

'get Designates the component as anchor and applies the **href** attribute.
public Sub getHref() As String
Return stHref
End Sub

'set Designates the button as icon - _round and flat_
public Sub setIcon(varIcon As Boolean)
AddAttr("icon", varIcon)
boIcon = varIcon
End Sub

'get Designates the button as icon - _round and flat_
public Sub getIcon() As Boolean
Return boIcon
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

'set Makes the component large.
public Sub setLarge(varLarge As Boolean)
AddAttr("large", varLarge)
boLarge = varLarge
End Sub

'get Makes the component large.
public Sub getLarge() As Boolean
Return boLarge
End Sub

'set Aligns the component towards the left. This should be used with the **absolute** or **fixed** props.
public Sub setLeft(varLeft As Boolean)
AddAttr("left", varLeft)
boLeft = varLeft
End Sub

'get Aligns the component towards the left. This should be used with the **absolute** or **fixed** props.
public Sub getLeft() As Boolean
Return boLeft
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

'set Designates that the component is a link. This is automatic when using the **href** or **to** prop.
public Sub setLink(varLink As Boolean)
AddAttr("link", varLink)
boLink = varLink
End Sub

'get Designates that the component is a link. This is automatic when using the **href** or **to** prop.
public Sub getLink() As Boolean
Return boLink
End Sub

'set Adds a loading icon animation
public Sub setLoading(varLoading As Boolean)
AddAttr("loading", varLoading)
boLoading = varLoading
End Sub

'get Adds a loading icon animation
public Sub getLoading() As Boolean
Return boLoading
End Sub

'set Specifies the link is a `nuxt-link`. For use with the nuxt frameworkhttps://nuxtjs.org/api/components-nuxt-link/.
public Sub setNuxt(varNuxt As Boolean)
AddAttr("nuxt", varNuxt)
boNuxt = varNuxt
End Sub

'get Specifies the link is a `nuxt-link`. For use with the nuxt frameworkhttps://nuxtjs.org/api/components-nuxt-link/.
public Sub getNuxt() As Boolean
Return boNuxt
End Sub

'set Makes the background transparent and applies a thin border.
public Sub setOutlined(varOutlined As Boolean)
AddAttr("outlined", varOutlined)
boOutlined = varOutlined
End Sub

'get Makes the background transparent and applies a thin border.
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

'set ref
public Sub setRef(varRef As String)
AddAttr("ref", varRef)
stRef = varRef
End Sub

'get ref
public Sub getRef() As String
Return stRef
End Sub

'set Aligns the component towards the right. This should be used with the **absolute** or **fixed** props.
public Sub setRight(varRight As Boolean)
AddAttr("right", varRight)
boRight = varRight
End Sub

'get Aligns the component towards the right. This should be used with the **absolute** or **fixed** props.
public Sub getRight() As Boolean
Return boRight
End Sub

'set Applies the v-ripple/directives/ripple directive.
public Sub setRipple(varRipple As String)
AddAttr("ripple", varRipple)
stRipple = varRipple
End Sub

'get Applies the v-ripple/directives/ripple directive.
public Sub getRipple() As String
Return stRipple
End Sub

'set Applies a large border radius on the button.
public Sub setRounded(varRounded As Boolean)
AddAttr("rounded", varRounded)
boRounded = varRounded
End Sub

'get Applies a large border radius on the button.
public Sub getRounded() As Boolean
Return boRounded
End Sub

'set Applies a large border radius on the top left and bottom right of the card.
public Sub setShaped(varShaped As Boolean)
AddAttr("shaped", varShaped)
boShaped = varShaped
End Sub

'get Applies a large border radius on the top left and bottom right of the card.
public Sub getShaped() As Boolean
Return boShaped
End Sub

'set Makes the component small.
public Sub setSmall(varSmall As Boolean)
AddAttr("small", varSmall)
boSmall = varSmall
End Sub

'get Makes the component small.
public Sub getSmall() As Boolean
Return boSmall
End Sub

'set Specify a custom tag used on the root element.
public Sub setTag(varTag As String)
AddAttr("tag", varTag)
stTag = varTag
End Sub

'get Specify a custom tag used on the root element.
public Sub getTag() As String
Return stTag
End Sub

'set Designates the target attribute. This should only be applied when using the **href** prop.
public Sub setTarget(varTarget As String)
AddAttr("target", varTarget)
stTarget = varTarget
End Sub

'get Designates the target attribute. This should only be applied when using the **href** prop.
public Sub getTarget() As String
Return stTarget
End Sub

'set Makes the background transparent.
public Sub setText(varText As Boolean)
AddAttr("text", varText)
boText = varText
End Sub

'get Makes the background transparent.
public Sub getText() As Boolean
Return boText
End Sub

'set Removes the components **border-radius**.
public Sub setTile(varTile As Boolean)
AddAttr("tile", varTile)
boTile = varTile
End Sub

'get Removes the components **border-radius**.
public Sub getTile() As Boolean
Return boTile
End Sub

'set Denotes the target route of the link. You can find more information about the **to** prophttps://router.vuejs.org/api/#to on the vue-router documentation.
public Sub setTo(varTo As String)
AddAttr("to", varTo)
stTo = varTo
End Sub

'get Denotes the target route of the link. You can find more information about the **to** prophttps://router.vuejs.org/api/#to on the vue-router documentation.
public Sub getTo() As String
Return stTo
End Sub

'set Aligns the content towards the top.
public Sub setTop(varTop As Boolean)
AddAttr("top", varTop)
boTop = varTop
End Sub

'get Aligns the content towards the top.
public Sub getTop() As Boolean
Return boTop
End Sub

'set Set the buttons **type** attribute
public Sub setTypeOf(varTypeOf As String)
AddAttr("type", varTypeOf)
stTypeOf = varTypeOf
End Sub

'get Set the buttons **type** attribute
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

'set Controls whether the component is visible or hidden.
public Sub setValue(varValue As String)
AddAttr("value", varValue)
stValue = varValue
End Sub

'get Controls whether the component is visible or hidden.
public Sub getValue() As String
Return stValue
End Sub

'set Sets the width for the component.
public Sub setWidth(varWidth As String)
AddAttr("width", varWidth)
stWidth = varWidth
End Sub

'get Sets the width for the component.
public Sub getWidth() As String
Return stWidth
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

'add width-accent style
public Sub setBorderColorAccent()
AddStyle("border-color", "accent")
End Sub

'add width-amber style
public Sub setBorderColorAmber()
AddStyle("border-color", "amber")
End Sub

'add width-black style
public Sub setBorderColorBlack()
AddStyle("border-color", "black")
End Sub

'add width-blue style
public Sub setBorderColorBlue()
AddStyle("border-color", "blue")
End Sub

'add width-blue-grey style
public Sub setBorderColorBlueGrey()
AddStyle("border-color", "blue-grey")
End Sub

'add width-brown style
public Sub setBorderColorBrown()
AddStyle("border-color", "brown")
End Sub

'add width-cyan style
public Sub setBorderColorCyan()
AddStyle("border-color", "cyan")
End Sub

'add width-deep-orange style
public Sub setBorderColorDeepOrange()
AddStyle("border-color", "deep-orange")
End Sub

'add width-deep-purple style
public Sub setBorderColorDeepPurple()
AddStyle("border-color", "deep-purple")
End Sub

'add width-error style
public Sub setBorderColorError()
AddStyle("border-color", "error")
End Sub

'add width-green style
public Sub setBorderColorGreen()
AddStyle("border-color", "green")
End Sub

'add width-grey style
public Sub setBorderColorGrey()
AddStyle("border-color", "grey")
End Sub

'add width-indigo style
public Sub setBorderColorIndigo()
AddStyle("border-color", "indigo")
End Sub

'add width-info style
public Sub setBorderColorInfo()
AddStyle("border-color", "info")
End Sub

'add width-light-blue style
public Sub setBorderColorLightBlue()
AddStyle("border-color", "light-blue")
End Sub

'add width-light-green style
public Sub setBorderColorLightGreen()
AddStyle("border-color", "light-green")
End Sub

'add width-lime style
public Sub setBorderColorLime()
AddStyle("border-color", "lime")
End Sub

'add width-orange style
public Sub setBorderColorOrange()
AddStyle("border-color", "orange")
End Sub

'add width-pink style
public Sub setBorderColorPink()
AddStyle("border-color", "pink")
End Sub

'add width-primary style
public Sub setBorderColorPrimary()
AddStyle("border-color", "primary")
End Sub

'add width-purple style
public Sub setBorderColorPurple()
AddStyle("border-color", "purple")
End Sub

'add width-red style
public Sub setBorderColorRed()
AddStyle("border-color", "red")
End Sub

'add width-secondary style
public Sub setBorderColorSecondary()
AddStyle("border-color", "secondary")
End Sub

'add width-success style
public Sub setBorderColorSuccess()
AddStyle("border-color", "success")
End Sub

'add width-teal style
public Sub setBorderColorTeal()
AddStyle("border-color", "teal")
End Sub

'add width-transparent style
public Sub setBorderColorTransparent()
AddStyle("border-color", "transparent")
End Sub

'add width-warning style
public Sub setBorderColorWarning()
AddStyle("border-color", "warning")
End Sub

'add width-white style
public Sub setBorderColorWhite()
AddStyle("border-color", "white")
End Sub

'add width-yellow style
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

'add width-dashed style
public Sub setBorderStyleDashed()
AddStyle("border-style", "dashed")
End Sub

'add width-dotted style
public Sub setBorderStyleDotted()
AddStyle("border-style", "dotted")
End Sub

'add width-double style
public Sub setBorderStyleDouble()
AddStyle("border-style", "double")
End Sub

'add width-groove style
public Sub setBorderStyleGroove()
AddStyle("border-style", "groove")
End Sub

'add width-hidden style
public Sub setBorderStyleHidden()
AddStyle("border-style", "hidden")
End Sub

'add width-inset style
public Sub setBorderStyleInset()
AddStyle("border-style", "inset")
End Sub

'add width-outset style
public Sub setBorderStyleOutset()
AddStyle("border-style", "outset")
End Sub

'add width-ridge style
public Sub setBorderStyleRidge()
AddStyle("border-style", "ridge")
End Sub

'add width-solid style
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

'set on Click event, updates the master events records
Sub SetOnClick()
Dim sName As String = $"${mEventName}_Click"$
sName = sName.tolowercase
If SubExists(mCallBack, sName) = False Then Return
If BANano.IsUndefined(eOnClick) Or BANano.IsNull(eOnClick) Then eOnClick = ""
Dim sCode As String = $"${sName}(${eOnClick})"$
AddAttr("v-on:click", sCode)
'arguments for the event
Dim argument As BANanoEvent 'ignore
Dim cb As BANanoObject = BANano.CallBack(mCallBack, sName, Array(argument))
methods.Put(sName, cb)
End Sub

Sub SetOnClickE(sClick As String)
eOnClick = sClick
End Sub

