B4J=true
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
	Type VOptions(propname As String, options As String)
	Private options As Map
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(v As BANanoVue, stag As String) As clsCodeBuilder
	vue = v
	TagName = stag
	Defaults.Initialize
	properties.Initialize
	events.Initialize
	slots.Initialize
	structure.Initialize
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
		AddComment(ea, "This activates when the event exists on the module")
		AddCode(ea, $"SetOn${ename}"$)
		'add events for trapping
		ename = ename.tolowercase
		AddCode(mc, $"#Event: ${ename} (${eargs})"$)
		'define setters
		AddComment(es, "set on " & ename & " event, updates the master events records")
		AddCode(es, $"Sub SetOn${xname}() As ${CompName}"$)
		AddCode(es, $"Dim sName As String = #"#{mEventName}_${ename}"#"$)
		AddCode(es, $"sName = sName.tolowercase"$)
		AddCode(es, $"If SubExists(mCallBack, sName) = False Then Return Me"$)
		AddCode(es, $"SetAttr("v-on:${oname}", sName)"$)
		AddCode(es, $"Dim ${eargs} 'ignore"$)
		AddCode(es, $"Dim cb As BANanoObject = BANano.CallBack(mCallBack, sName, Array(${eparts}))"$)
		AddCode(es, $"methods.Put(sName, cb)"$)
		AddCode(es, $"Return Me"$)
		AddCode(es, "End Sub")
		AddNewLine(es)
	Next
	AddNewLine(mc)
		
	For Each v As VThing In properties.Values
		Dim baeName As String = vue.BeautifyName(v.propName)
		Dim dpDef As String = $"#DesignerProperty: Key: ${baeName}, DisplayName: ${baeName}, Description: ${v.propDescription}"$
		'
		If v.propname = "caption" Then
			Select Case TagName
			Case "v-btn"
				v.propDefault = "Click Me"
			Case "v-label", "v-alert"
				v.propDefault = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
			Case "v-icon"
				v.propDefault = "mdi-plus"
			End Select
			dpDef = dpDef & $", DefaultValue: ${v.propDefault}"$
		Else
			If v.propdefault = "" Then
				If v.propType = "boolean" Then
					v.propdefault = "False"
				End If
			End If
			dpDef = dpDef & $", DefaultValue: ${v.propdefault}"$
		End If
		'
		If v.propDescription = "" Then v.propDescription = $"Set ${v.propName}"$
		Select Case v.propName
		Case "color", "text-color","background-color"
			dpDef = dpDef & ", List: amber|black|blue|blue-grey|brown|cyan|deep-orange|deep-purple|green|grey|indigo|light-blue|light-green|lime|orange|pink|purple|red|teal|transparent|white|yellow|primary|secondary|accent|error|info|success|warning"
		Case "elevation"
			dpDef = $"#DesignerProperty: Key: Elevation, DisplayName: Elevation, FieldType: Int, DefaultValue: 0, MinRange: 0, MaxRange: 24, Description: Set elevation"$
		Case "transition"
			dpDef = dpDef & ", List: slide-x-transition|slide-x-reverse-transition|slide-y-transition|slide-y-reverse-transition|scroll-x-transition|scroll-x-reverse-transition|scroll-y-transition|scroll-y-reverse-transition|scale-transition|fade-transition|fab-transition"
		Case "target"
			dpDef = dpDef & ", List: _blank|_self|_parent|_top"
		Case "type"
			If TagName = "v-alert" Then
				dpDef = dpDef & ", List: success|info|warning|error"
			End If
		Case "border"
			If TagName = "v-alert" Then
				dpDef = dpDef & ", List: top|right|bottom|left"
			End If
		Case Else
		End Select
		'		
			
		Select Case v.propType
		Case "boolean"
			dpDef = dpDef & ", FieldType: Boolean"
			AddCode(dp, dpDef)
			'update declarations
			AddCode(dc, $"Private b${baeName} As Boolean = ${v.propDefault}"$)
			AddCode(dg, $"b${baeName} = props.Get("${baeName}")"$)
			'
			AddCode(bai, $"AddAttr(b${baeName}, "${v.propname}")"$)
			'
			AddComment(sett, $"set ${v.propName}"$)
			AddCode(sett, $"Sub Set${baeName}(var${baeName} As Boolean) As ${CompName}"$)
			AddCode(sett, $"b${baeName} = var${baeName}"$)
			AddCode(sett, $"SetAttr("${v.propname}", b${baeName})"$)
			AddCode(sett, $"Return Me"$)
			AddCode(sett, $"End Sub"$)
			AddNewLine(sett)
		Case "string", "boolean|string"
			dpDef = dpDef & ", FieldType: String"
			AddCode(dp, dpDef)
			'
			AddCode(dc, $"Private s${baeName} As String = "${v.propDefault}""$)
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
	'add extra dp
	dp.Append($"#DesignerProperty: Key: Classes, DisplayName: Classes, FieldType: String, DefaultValue: , Description: Classes added to the HTML tag.
#DesignerProperty: Key: Style, DisplayName: Style, FieldType: String, DefaultValue: , Description: Styles added to the HTML tag. Must be a json String."$)
AddNewLine(dp)
	'
	AddNewLine(mc)
	AddCode(mc, dp.ToString)
	AddCode(mc, $"Sub Class_Globals
	Private BANano As BANano 'ignore
	Private data As Map
	Public mName As String 'ignore
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mTarget As BANanoElement 'ignore
	Private mElement As BANanoElement 'ignore"$)
	AddNewLine(mc)
	AddCode(mc, $"Private properties As Map"$)
	AddCode(mc, $"Private styles As Map"$)
	AddCode(mc, $"Private classList As Map"$)
	AddCode(mc, $"Private mClasses As String = ""
	Private mStyle As String = """$)
	AddNewLine(mc)
	AddCode(mc, $"Private mTagName As String = "${TagName}"
	Public bindings As Map
	Public methods As Map"$)
	AddCode(mc, dc.tostring)
	AddCode(mc, "End Sub")
	AddNewLine(mc)
	'
AddCode(mc, $"Public Sub Initialize (CallBack As Object, Name As String, EventName As String) As ${CompName}
mName = Name
mEventName = EventName.ToLowerCase
mCallBack = CallBack
bindings.Initialize
methods.Initialize
properties.Initialize
styles.Initialize
classList.Initialize
Return Me
End Sub"$)
AddNewLine(mc)
'
	
	AddCode(mc, $"' this is the place where you create the view in html and run initialize javascript.  Must be Public!"$)
	AddCode(mc, $"Public Sub DesignerCreateView (Target As BANanoElement, props As Map)
	mTarget = Target"$)
	AddNewLine(mc)
	AddCode(mc, $"If props <> Null Then"$)
	
AddCode(mc, $"mClasses = props.Get("Classes")
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
	AddCode(sTo, $"AddAttr(cKeys, "class")"$)
	AddComment(sTo, "build the style list")
	AddCode(sTo, $"Dim sKeys As String = BANanoShared.BuildStyle(styles)"$)
	AddCode(sTo, $"sKeys = sKeys & " " & mStyle"$)
	AddCode(sTo, $"sKeys = sKeys.trim"$)
	AddCode(sTo, $"AddAttr(sKeys, "style")"$)
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
	AddCode(mc, xes)
		
	AddComment(mc, "return the generated html")
	AddCode(mc, "Sub ToString As String")
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