﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.31
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Type VThing(propName As String, propType As String, propDescription As String, values As List, propDefault As String)
	Type VEvent(eventName As String, eventDescription As String, eventParts As String)
	Type VSlot(slotName As String, slotDescription As String)
	Type VStructure(propName As String, propDesc As String, propType As String)
	Private properties As Map
	Private events As Map
	Private slots As Map
	Private structure As Map
	Public RemovePrefix As Boolean
	Public Defaults As Map
	Private TagName As String
	Private CompName As String
	Private vue As BANanoVue
	Private styles As Map
	Type VOptions(propname As String, options As String)
	Private options As Map
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(v As BANanoVue, stag As String) As clsCodeBuilder
	vue = v
	TagName = stag
	Select Case stag
	Case "v-html"
		TagName = "div"
	Case "v-div"
		TagName = "div"
	Case "v-router-view"
		TagName = "router-view"
	Case "v-a"
		TagName = "a"
	Case "v-router-link"
		TagName = "router-link"
	Case "v-template"
		TagName = "template"
	End Select
	'
	Defaults.Initialize
	properties.Initialize
	events.Initialize
	slots.Initialize
	structure.Initialize
	styles.initialize
	CompName = vue.BeautifyName(stag)
	options.initialize
	Return Me
End Sub

'options for dropdowns
Sub AddOptions(propname As String, propOptions As String)
	Dim vo As VOptions
	vo.initialize
	vo.propname = propname
	vo.options = propOptions
	options.put(propname, vo)
End Sub

'add event
Sub AddEvent(propName As String, propDescription As String, propParts As String)
	propName = propName.trim
	propName = propName.tolowercase
	'
	Dim ve As VEvent
	ve.initialize
	ve.eventName = propName
	ve.eventDescription = propDescription
	ve.eventparts = propParts
	events.put(propName, ve)
End Sub

'add propery
Sub AddProperty(propName As String, propType As String, propDefault As String, propDescription As String, values As List)
	'exclude the id
	If propName.EqualsIgnoreCase("id") Then Return
	propName = propName.Trim
	propDescription = propDescription.trim
	propName = propName.tolowercase
	'
	Dim nv As VThing
	nv.Initialize
	nv.propName = propName
	nv.propDescription = propDescription
	nv.propType = propType
	nv.values = values
	nv.propdefault = propDefault
	properties.Put(propName, nv)
End Sub

'add style
Sub AddStyle(propName As String, propDefault As String, propDescription As String)
	'exclude the id
	If propName.EqualsIgnoreCase("id") Then Return
	propName = propName.Trim
	propDescription = propDescription.trim
	propName = propName.tolowercase
	'
	Dim nv As VThing
	nv.Initialize
	nv.propName = propName
	nv.propDescription = propDescription
	nv.propType = "string"
	nv.values = Null
	nv.propdefault = propDefault
	styles.Put(propName, nv)
End Sub


Sub AddDefault(defKey As String, defValue As String)
	Defaults.Put(defKey, defValue)
End Sub

Sub AddNewLine(sbx As StringBuilder) As clsCodeBuilder
	sbx.Append(CRLF)
	Return Me
End Sub

Sub AddComment(sbx As StringBuilder, xcode As String) As clsCodeBuilder
	sbx.Append("'" & xcode).Append(CRLF)
	Return Me
End Sub

Sub AddCode(sbx As StringBuilder, xcode As String) As clsCodeBuilder
	sbx.Append(xcode).Append(CRLF)
	Return Me
End Sub

Sub CreateCustomView As String
	'will hold the ToString value
	Dim sTo As StringBuilder
	sTo.initialize
	
	'master code
	Dim mc As StringBuilder
	mc.Initialize 
	
	'declarations
	Dim dc As StringBuilder
	dc.Initialize 
	
	'read of properties
	Dim dg As StringBuilder
	dg.Initialize 
		
	'designer properties
	Dim dp As StringBuilder
	dp.Initialize
	
	'build attributes
	Dim bai As StringBuilder
	bai.Initialize 
	'
	'build setters
	Dim sett As StringBuilder
	sett.initialize
	'
	Dim ea As StringBuilder
	ea.initialize
	
	' call events
	Dim es As StringBuilder
	es.initialize
	'
AddCode(mc, "B4J=true")
AddCode(mc, "Group=Default Group")
AddCode(mc, "ModulesStructureVersion=1")
AddCode(mc, "Type=Class")
AddCode(mc, "Version=8.3")
AddCode(mc,"@EndOfDesignText@")
	AddComment(mc, $"Custom BANano View class: ${CompName}"$)
	AddCode(mc, "#IgnoreWarnings:12")
		
	'can have multiple items, read it
	If TagName = "div" Or TagName = "v-div" Or TagName = "v-html" Then
		AddCode(dg, $"mTagName = props.Get("TagName")"$)
	End If	
		
	For Each v As VThing In properties.Values
		Select Case v.propName
			'required, readonly for inputs only
		End Select
		
		Dim baeName As String = vue.BeautifyName(v.propName)
		If v.propname.EqualsIgnoreCase("tagname") Then
			baeName = "TagName"
		End If
		Dim dpDef As String = $"#DesignerProperty: Key: ${baeName}, DisplayName: ${baeName}, Description: ${v.propDescription}"$
		'
		v.propdefault = ""
		If v.propname = "caption" Then
			Select Case TagName
			Case "v-btn"
				v.propDefault = "Click Me"
			Case "v-label", "v-alert"
				v.propDefault = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
			Case "v-icon"
				v.propDefault = "mdi-plus"
			Case "v-card-title"
				v.propDefault = "Card Title"
			Case "v-card-subtitle"
				v.propDefault = "Card Subtitle"
			Case "v-card-text"
				v.propDefault = "Card Text"
			Case "v-chip"
				v.propDefault = "Chip"
			End Select
		End If
		
		'
		If v.propDescription = "" Then v.propDescription = $"Set ${v.propName}"$
		Select Case v.propName
		Case "color", "text-color","background-color"
			dpDef = dpDef & ", List: amber|black|blue|blue-grey|brown|cyan|deep-orange|deep-purple|green|grey|indigo|light-blue|light-green|lime|orange|pink|purple|red|teal|transparent|white|yellow|primary|secondary|accent|error|info|success|warning|none"
		Case "transition"
			dpDef = dpDef & ", List: slide-x-transition|slide-x-reverse-transition|slide-y-transition|slide-y-reverse-transition|scroll-x-transition|scroll-x-reverse-transition|scroll-y-transition|scroll-y-reverse-transition|scale-transition|fade-transition|fab-transition|none"
		Case "target"
			dpDef = dpDef & ", List: _blank|_self|_parent|_top|none"
		Case "type"
			If TagName = "v-alert" Then
				dpDef = dpDef & ", List: success|info|warning|error|none"
			End If
		Case "border"
			If TagName = "v-alert" Then
				dpDef = dpDef & ", List: top|right|bottom|left|none"
			End If
		Case "tagname","TagName"
			If TagName = "v-div" Or TagName = "div" Then
				dpDef = dpDef & ", List:p|a|br|div|span|h1|h2|h3|h4|h5|h6"
			End If
		Case Else
		End Select
		
		Select Case v.propType
		Case "boolean"
			v.propDefault = "False"
			dpDef = dpDef & $", FieldType: Boolean, DefaultValue: ${v.propdefault}"$
			AddCode(dp, dpDef)
			'update declarations
			AddCode(dc, $"Private b${baeName} As Boolean = False"$)
			AddCode(dg, $"b${baeName} = props.Get("${baeName}")"$)
			'
			If v.propName <> "has-id" Then
				AddCode(bai, $"AddAttr(b${baeName}, "${v.propname}")"$)
			End If
			'
			AddComment(sett, $"set ${v.propName}"$)
			AddCode(sett, $"Sub Set${baeName}(var${baeName} As Boolean) As ${CompName}"$)
			AddCode(sett, $"b${baeName} = var${baeName}"$)
			AddCode(sett, $"SetAttr("${v.propname}", b${baeName})"$)
			AddCode(sett, $"Return Me"$)
			AddCode(sett, $"End Sub"$)
			AddNewLine(sett)
		Case "string"
			dpDef = dpDef & $", FieldType: String, DefaultValue: ${v.propdefault}"$
			AddCode(dp, dpDef)
			'
			AddCode(dc, $"Private s${baeName} As String = """$)
			'
			AddCode(dg, $"s${baeName} = props.Get("${baeName}")"$)
			'
			AddCode(bai, $"AddAttr(s${baeName}, "${v.propname}")"$)
			
			If v.propname <> "caption" Then
				AddComment(sett, $"set ${v.propName}"$)
				AddCode(sett, $"Sub Set${baeName}(var${baeName} As String) As ${CompName}"$)
				AddCode(sett, $"s${baeName} = var${baeName}"$)
				AddCode(sett, $"SetAttr("${v.propname}", s${baeName})"$)
				AddCode(sett, $"Return Me"$)
				AddCode(sett, $"End Sub"$)
				AddNewLine(sett)
			End If
		Case Else
			AddComment(sett, $"set ${v.propName}"$)
			AddCode(sett, $"Sub Set${baeName}(var${baeName} As Object) As ${CompName}"$)
			AddCode(sett, $"SetAttr("${v.propname}", var${baeName})"$)
			AddCode(sett, $"Return Me"$)
			AddCode(sett, $"End Sub"$)
			AddNewLine(sett)
		End Select
		
	Next
	'
	'***** process the styles
	For Each v As VThing In styles.values
		Dim baeName As String = vue.BeautifyName(v.propName)
		If v.propDescription = "" Then v.propDescription = $"Set ${v.propName}"$
		Dim dpDef As String = $"#DesignerProperty: Key: ${baeName}, DisplayName: ${baeName}, Description: ${v.propDescription}, FieldType: String, DefaultValue: ${v.propDefault}"$
		Select Case v.propname
		Case "border-style"
			dpDef = dpDef & ", List: dashed|dotted|double|groove|hidden|inset|none|outset|ridge|solid"
		Case "border-color"
			dpDef = dpDef & ", List: amber|black|blue|blue-grey|brown|cyan|deep-orange|deep-purple|green|grey|indigo|light-blue|light-green|lime|orange|pink|purple|red|teal|transparent|white|yellow|primary|secondary|accent|error|info|success|warning|none"
		End Select
		
		AddCode(dp, dpDef)
		'
		AddCode(dc, $"Private s${baeName} As String = """$)
		'
		AddCode(dg, $"s${baeName} = props.Get("${baeName}")"$)
		'
		AddCode(bai, $"SetStyleSingle("${v.propname}", s${baeName})"$)
			
		AddComment(sett, $"set ${v.propName}"$)
		AddCode(sett, $"Sub Set${baeName}(var${baeName} As String) As ${CompName}"$)
		AddCode(sett, $"s${baeName} = var${baeName}"$)
		AddCode(sett, $"SetStyleSingle("${v.propname}", s${baeName})"$)
		AddCode(sett, $"Return Me"$)
		AddCode(sett, $"End Sub"$)
		AddNewLine(sett)
	Next
	'
	'add extra dp
	dp.Append($"#DesignerProperty: Key: Classes, DisplayName: Classes, FieldType: String, DefaultValue: , Description: Classes added to the HTML tag.
#DesignerProperty: Key: Style, DisplayName: Style, FieldType: String, DefaultValue: , Description: Styles added to the HTML tag. Must be a json String.
#DesignerProperty: Key: Attributes, DisplayName: Attributes, FieldType: String, DefaultValue: , Description: Attributes added to the HTML tag. Must be a json String."$)
AddNewLine(dp)
'add events
For Each e As VEvent In events.values
	Dim ename As String = e.eventName
	Dim oname As String = ename
	Dim eargs As String = e.eventDescription
	Dim eparts As String = e.eventParts
	'
	ename = vue.BeautifyName(ename)
	Dim xname As String = ename
	'call events
	AddComment(ea, $"This activates ${ename} the event exists on the module"$)
	AddCode(ea, $"SetOn${ename}"$)
	'add events for trapping
	ename = ename.tolowercase
	AddCode(mc, $"#Event: ${ename} (${eargs})"$)
	'define setters
	AddComment(es, "set on " & ename & " event, updates the master events records")
	AddCode(es, $"Sub SetOn${xname}() As ${CompName}"$)
	AddCode(es, $"Dim sName As String = ~"~{mEventName}_${ename}"~"$)
	AddCode(es, $"sName = sName.tolowercase"$)
	AddCode(es, $"If SubExists(mCallBack, sName) = False Then Return Me"$)
	AddCode(es, $"Dim sCode As String = ~"~{sName}(~{eOn${ename}})"~"$)
	AddCode(es, $"SetAttr("v-on:${oname}", sCode)"$)
	AddComment(es, "arguments for the event")
	AddCode(es, $"Dim ${eargs} 'ignore"$)
	AddCode(es, $"Dim cb As BANanoObject = BANano.CallBack(mCallBack, sName, Array(${eparts}))"$)
	AddCode(es, $"methods.Put(sName, cb)"$)
	AddCode(es, $"Return Me"$)
	AddCode(es, "End Sub")
	AddNewLine(es)
	AddCode(es, $"Sub SetOn${xname}E(s${xname} As String) As ${CompName}"$)
	AddCode(es, $"eOn${ename} = s${xname}"$)
	AddCode(es, $"Return Me"$)
	AddCode(es, "End Sub")
	AddNewLine(es)
	
	'
	'add extra dp
	dp.Append($"#DesignerProperty: Key: On${ename}, DisplayName: On${ename}, FieldType: String, DefaultValue: , Description: Event arguments to be passed to the attribute."$)
	dp.append(CRLF)
	AddCode(dc, $"Private eOn${ename} As String = """$)
	'
	AddCode(dg, $"eOn${ename} = props.Get("On${ename}")"$)
Next
AddNewLine(mc)

	'
	AddNewLine(mc)
	AddCode(mc, dp.ToString)
AddCode(mc, $"Sub Class_Globals
Private BANano As BANano 'ignore
Private data As Map
private appLink As VueApp 'ignore
Public mName As String 'ignore
Private mEventName As String 'ignore
Private mCallBack As Object 'ignore
Private sbText As StringBuilder
'Private bindStyle As Map
'Private bindClass As Map
Private mTarget As BANanoElement 'ignore
Private mElement As BANanoElement 'ignore"$)
	AddNewLine(mc)
	AddCode(mc, $"Private properties As Map"$)
	AddCode(mc, $"Private styles As Map"$)
	AddCode(mc, $"Private classList As Map"$)
	AddCode(mc, $"Private mClasses As String = ""
	Private mStyle As String = ""
	Private mAttributes As String = """$)
	AddNewLine(mc)
	AddCode(mc, $"Private mTagName As String = "${TagName}"
	Public bindings As Map
	Public methods As Map"$)
	AddCode(mc, dc.tostring)
	AddCode(mc, "End Sub")
	AddNewLine(mc)
	'
AddCode(mc, $"Public Sub Initialize (CallBack As Object, Name As String, EventName As String) As ${CompName}
mName = Name.tolowercase
mEventName = EventName.ToLowerCase
mCallBack = CallBack
bindings.Initialize
methods.Initialize
properties.Initialize
styles.Initialize
sbText.Initialize
classList.Initialize
'bindClass.Initialize 
'bindStyle.Initialize"$)

AddCode(mc, $"'bindings.Put(~"~{mName}style"~, bindStyle)"$)
AddCode(mc, $"'bindings.Put(~"~{mName}class"~, bindClass)"$)
AddCode(mc, $"'SetVBindStyle(~"~{mName}style"~)"$)
AddCode(mc, $"'SetVBindClass(~"~{mName}class"~)"$)
AddCode(mc, "Return Me")
AddCode(mc, "End Sub")
AddNewLine(mc)

	AddCode(mc, $"' this is the place where you create the view in html and run initialize javascript.  Must be Public!"$)
	AddCode(mc, $"Public Sub DesignerCreateView (Target As BANanoElement, props As Map)
	mTarget = Target"$)
	AddNewLine(mc)
	AddCode(mc, $"If props <> Null Then"$)
	
AddCode(mc, $"mClasses = props.Get("Classes")
mAttributes = props.Get("Attributes")
mStyle = props.Get("Style")"$)
		'
		AddCode(mc, dg.ToString)
	AddCode(mc, "End If")
	'
	
	AddCode(sTo, bai.ToString)
	'
	AddComment(sTo, "build the class list")
	AddCode(sTo, $"Dim cKeys As String = BANanoShared.JoinMapKeys(classList, " ")"$)
	AddCode(sTo, $"cKeys = cKeys & " " & mClasses"$)
	AddCode(sTo, $"cKeys = cKeys.trim"$)
	AddCode(sTo, $"cKeys = BANanoShared.MvDistinct(" ", cKeys)"$)
	AddCode(sTo, $"AddAttr(cKeys, "class")"$)
	AddComment(sTo, "build the style list")
AddCode(sTo, $"If BANano.IsUndefined(mStyle) Or BANano.IsNull(mStyle) Then mStyle = """$)
AddCode(sTo, $"If mStyle.StartsWith("{") Then mStyle = """$)
AddCode(sTo, $"If mStyle <> "" Then"$)
AddCode(sTo, $"Dim sItems As List = BANanoShared.StrParse(",",mStyle)"$)
AddCode(sTo, $"For Each st As String In sItems"$)
AddCode(sTo, $"Dim k As String = BANanoShared.MvField(st,1,":")"$)
AddCode(sTo, $"Dim v As String = BANanoShared.MvField(st,2,":")"$)
AddCode(sTo, $"SetStyleSingle(k, v)"$)
AddCode(sTo, "Next")
AddCode(sTo, "End If")
	AddCode(sTo, $"Dim sKeys As String = BANanoShared.BuildStyle(styles)"$)
	AddCode(sTo, $"sKeys = sKeys.trim"$)
	AddCode(sTo, $"AddAttr(sKeys, "style")"$)
AddComment(sTo, "build the attributes")
AddCode(sTo, $"If BANano.IsUndefined(mAttributes) Or BANano.IsNull(mAttributes) Then mAttributes = """$)
AddCode(sTo, $"If mAttributes.StartsWith("{") Then mAttributes = """$)
AddCode(sTo, $"If mAttributes <> "" Then"$)
AddCode(sTo, $"Dim mItems As List = BANanoShared.StrParse(";",mAttributes)"$)
AddCode(sTo, $"For Each mt As String In mItems"$)
AddCode(sTo, $"Dim k As String = BANanoShared.MvField(mt,1,"=")"$)
AddCode(sTo, $"Dim v As String = BANanoShared.MvField(mt,2,"=")"$)
AddCode(sTo, $"AddAttr(v, k)"$)
AddCode(sTo, "Next")
AddCode(sTo, "End If")
	AddCode(sTo, $"Dim exattr As String = BANanoShared.BuildAttributes(properties)"$)
	'
	AddCode(mc, $"Dim strHTML As String = ToString"$)
	'
	Dim bLine As String = $"mElement = mTarget.Append(strHTML).Get("#" & mName)"$
	AddCode(mc, bLine)
	AddNewLine(mc)
	AddCode(mc, $"' defining events is very simple. Note that it has to be run AFTER adding it to the HTML DOM! eventName must be lowercase!"$)
	AddNewLine(mc)
	AddCode(mc, ea.tostring)
	AddNewLine(mc)
	AddCode(mc, "End Sub")
	AddNewLine(mc)
	'
	AddCode(mc, sett.tostring)
	Dim xes As String = es.tostring
	xes = xes.replace("#","$")
	xes = xes.replace("~","$")
	AddCode(mc, xes)
		
	AddComment(mc, "return the generated html")
	AddCode(mc, "Sub ToString As String")
	'AddCode(mc, $"If bHasID Then AddAttr(mName, "id")"$)
	AddCode(mc, sTo.ToString)
	AddCode(mc, $"Dim strRes As String = ~"<~{mTagName} id="~{mName}" ~{exAttr}>~{sCaption}</~{mTagName}>"~"$)
	AddCode(mc, "Return strRes")
	AddCode(mc, "End Sub")
	'
	
	
	Dim xout As String = mc.ToString
	xout = xout.Replace("~","$")
	
	'return result
	Return xout
End Sub