B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Type VThing(propName As String, propType As String, propDescription As String, values As List, propDefault As String)
	Type VEvent(eventName As String, eventDescription As String)
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
	Return Me
End Sub

'add propery
Sub AddProperty(propName As String, propType As String, propDefault As String, propDescription As String, values As List)
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
	'ad initial design stuff
	dp.Append($"#DesignerProperty: Key: Text, DisplayName: Text, FieldType: String, DefaultValue: , Description: Text on the label
#DesignerProperty: Key: VText, DisplayName: VText, FieldType: String, DefaultValue: , Description: VText
#DesignerProperty: Key: VHtml, DisplayName: VHtml, FieldType: String, DefaultValue: , Description: VHtml
#DesignerProperty: Key: VModel, DisplayName: VModel, FieldType: String, DefaultValue: , Description: VModel
#DesignerProperty: Key: RefName, DisplayName: RefName, FieldType: String, DefaultValue: , Description: RefName
#DesignerProperty: Key: VIf, DisplayName: VIf, FieldType: String, DefaultValue: , Description: VIf
#DesignerProperty: Key: VElse, DisplayName: VElse, FieldType: String, DefaultValue: , Description: VElse
#DesignerProperty: Key: VShow, DisplayName: VShow, FieldType: String, DefaultValue: , Description: VShow
#DesignerProperty: Key: VFor, DisplayName: VFor, FieldType: String, DefaultValue: , Description: VFor
#DesignerProperty: Key: KeyName, DisplayName: KeyName, FieldType: String, DefaultValue: , Description: KeyName"$)
AddNewLine(dp)
	'
	AddComment(mc, "Custom BANano View class")
	AddCode(mc, "#IgnoreWarnings:12")
	AddComment(sett, "***** ALL SETTERS")
	
	For Each v As VThing In properties.Values
		Dim baeName As String = vue.BeautifyName(v.propName)
		If v.propDescription = "" Then v.propDescription = $"Set ${v.propName}"$
		Select Case v.propType
		Case "boolean"
			AddCode(dp, $"#DesignerProperty: Key: ${baeName}, DisplayName: ${baeName}, FieldType: Boolean, DefaultValue: ${v.propDefault} , Description: ${v.propDescription}"$)
			'update declarations
			If v.propDefault = "" Then
				AddCode(dc, $"Public b${baeName} As Boolean = False"$)
			Else
				AddCode(dc, $"Public b${baeName} As Boolean = ${v.propDefault}"$)
			End If
			'
			AddCode(dg, $"b${baeName} = props.Get("${baeName}")"$)
			'
			AddCode(bai, $"AddAttr(Attributes, b${baeName}, "b", "${v.propname}")"$)
			'
			AddComment(sett, $"set ${v.propName}"$)
			AddCode(sett, $"Sub Set${baeName}(var${baeName} As Boolean)"$)
			AddCode(sett, $"b${baeName} = var${baeName}"$)
			AddCode(sett, $"mElement.SetAttr("${v.propname}", b${baeName})"$)
			AddCode(sett, $"End Sub"$)
			AddNewLine(sett)
		Case "string", "boolean|string"
			AddCode(dp, $"#DesignerProperty: Key: ${baeName}, DisplayName: ${baeName}, FieldType: String, DefaultValue: , Description: ${v.propDescription}"$)
			AddCode(dc, $"Public s${baeName} As String = "${v.propDefault}""$)
			'
			AddCode(dg, $"s${baeName} = props.Get("${baeName}")"$)
			'
			AddCode(bai, $"AddAttr(Attributes, s${baeName}, "s", "${v.propname}")"$)
				'
			AddComment(sett, $"set ${v.propName}"$)
			AddCode(sett, $"Sub Set${baeName}(var${baeName} As String)"$)
			AddCode(sett, $"s${baeName} = var${baeName}"$)
			AddCode(sett, $"mElement.SetAttr("${v.propname}", s${baeName})"$)
			AddCode(sett, $"End Sub"$)
			AddNewLine(sett)
		'Case "boolean|string"
'			AddCode(dp, $"#DesignerProperty: Key: ${baeName}On, DisplayName: ${baeName}On, FieldType: Boolean, DefaultValue: ${v.propDefault} , Description: ${v.propDescription}"$)
'			'update declarations
'			If v.propDefault = "" Then
'				AddCode(dc, $"Public b${baeName}On As Boolean = False"$)
'			Else
'				AddCode(dc, $"Public b${baeName}On As Boolean = ${v.propDefault}"$)
'			End If
'			'
'			AddCode(dg, $"b${baeName}On = props.Get("${baeName}On")"$)
'			'
'			AddCode(bai, $"AddAttr(Attributes, b${baeName}On, "b", "${v.propname}")"$)
'			'
'			AddComment(sett, $"set On ${v.propName}"$)
'			AddCode(sett, $"Sub Set${baeName}On(var${baeName} As Boolean)"$)
'			AddCode(sett, $"b${baeName}On = var${baeName}"$)
'			AddCode(sett, $"mElement.SetAttr("${v.propname}", b${baeName}On)"$)
'			AddCode(sett, $"End Sub"$)
'			AddNewLine(sett)
			'string part
'			AddCode(dp, $"#DesignerProperty: Key: ${baeName}, DisplayName: ${baeName}, FieldType: String, DefaultValue: , Description: ${v.propDescription}"$)
'			AddCode(dc, $"Public s${baeName} As String = "${v.propDefault}""$)
'			'
'			AddCode(dg, $"s${baeName} = props.Get("${baeName}")"$)
'			'
'			AddCode(bai, $"AddAttr(Attributes, s${baeName}, "s", "${v.propname}")"$)
'			'
'			AddComment(sett, $"set ${v.propName}"$)
'			AddCode(sett, $"Sub Set${baeName}(var${baeName} As String)"$)
'			AddCode(sett, $"s${baeName} = var${baeName}"$)
'			AddCode(sett, $"mElement.SetAttr("${v.propname}", s${baeName})"$)
'			AddCode(sett, $"End Sub"$)
'			AddNewLine(sett)
			
		Case "array"
			AddComment(sett, $"set ${v.propName}"$)
			AddCode(sett, $"Sub Set${baeName}(var${baeName} As List)"$)
			AddCode(sett, $"mElement.SetAttr("${v.propname}", var${baeName})"$)
			AddCode(sett, $"End Sub"$)
			AddNewLine(sett)
		Case "object"
			AddComment(sett, $"set ${v.propName}"$)
			AddCode(sett, $"Sub Set${baeName}(var${baeName} As Map)"$)
			AddCode(sett, $"mElement.SetAttr("${v.propname}", var${baeName})"$)
			AddCode(sett, $"End Sub"$)
			AddNewLine(sett)
		Case "function"
		Case Else
			Log("Error: " & v.propName & " " & v.propType) 	 
		End Select
		
	Next
	'
	'add extra dp
	dp.Append($"#DesignerProperty: Key: Classes, DisplayName: Classes, FieldType: String, DefaultValue: , Description: Classes added to the HTML tag.
#DesignerProperty: Key: Style, DisplayName: Style, FieldType: String, DefaultValue: , Description: Styles added to the HTML tag. Must be a json String.
#DesignerProperty: Key: MarginLeft, DisplayName: Margin Left, FieldType: String, DefaultValue: , Description: Margin Left
#DesignerProperty: Key: MarginRight, DisplayName: Margin Right, FieldType: String, DefaultValue: , Description: Margin Right
#DesignerProperty: Key: MarginTop, DisplayName: Margin Top, FieldType: String, DefaultValue: , Description: Margin Top
#DesignerProperty: Key: MarginBottom, DisplayName: Margin Bottom, FieldType: String, DefaultValue: , Description: Margin Bottom
#DesignerProperty: Key: PaddingLeft, DisplayName: Padding Left, FieldType: String, DefaultValue: , Description: Padding Left
#DesignerProperty: Key: PaddingRight, DisplayName: Padding Right, FieldType: String, DefaultValue: , Description: Padding Right
#DesignerProperty: Key: PaddingTop, DisplayName: Padding Top, FieldType: String, DefaultValue: , Description: Padding Top
#DesignerProperty: Key: PaddingBottom, DisplayName: Padding Bottom, FieldType: String, DefaultValue: , Description: Padding Bottom"$)
AddNewLine(dp)
	'
	AddNewLine(mc)
	AddCode(mc, dp.ToString)
	AddCode(mc, $"Sub Class_Globals
	Private BANano As BANano 'ignore
	Public mName As String 'ignore
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mTarget As BANanoElement 'ignore
	Private mElement As BANanoElement 'ignore"$)
	AddNewLine(mc)
	AddCode(mc, $"Private mClasses As String = ""
	Private mStyle As String = ""
	Public MarginLeft As String = ""
	Public MarginRight As String = ""
	Public MarginTop As String = ""
	Public MarginBottom As String = ""
	Public PaddingLeft As String = ""
	Public PaddingRight As String = ""
	Public PaddingTop As String = ""
	Public PaddingBottom As String = """$)
	AddNewLine(mc)
	AddCode(mc, $"Private mText As String = ""
	Private mTagName As String = "${TagName}"
	Private mVModel As String = ""
	Private mRefName As String = ""
	Private mKeyName As String = ""
	Private mVText As String = ""
	Private mVIf As String = ""
	Private mVElse As String = ""
	Private mVShow As String = ""
	Private mVHtml As String = ""
	Private mVFor As String = ""
	Private Attributes as StringBuilder
	Public bindings As Map
	Public methods As Map"$)
	AddCode(mc, dc.tostring)
	AddCode(mc, "End Sub")
	AddNewLine(mc)
	'
	AddCode(mc, $"Public Sub Initialize (CallBack As Object, Name As String, EventName As String)
	mName = Name
	mEventName = EventName.ToLowerCase
	mCallBack = CallBack
	bindings.Initialize
	methods.Initialize
	Attributes.Initialize
	End Sub"$)
AddNewLine(mc)
'
	
	AddCode(mc, $"' this is the place where you create the view in html and run initialize javascript.  Must be Public!"$)
	AddCode(mc, $"Public Sub DesignerCreateView (Target As BANanoElement, props As Map)
	mTarget = Target"$)
	AddNewLine(mc)
	AddCode(mc, $"If props <> Null Then"$)
	
	AddCode(mc, $"mClasses = props.Get("Classes")
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
		mVModel = props.Get("VModel")
		mRefName = props.Get("RefName")
		mKeyName = props.Get("KeyName")
		mVText = props.Get("VText")
		mVIf = props.Get("VIf")
		mVElse = props.Get("VElse")
		mVShow = props.Get("VShow")
		mVHtml = props.Get("VHtml")
		mVFor = props.Get("VFor")"$)
		'
		AddCode(mc, dg.ToString)
			'
	AddCode(mc, $"AddAttr(Attributes, mVModel, "s", "v-model")
	AddAttr(Attributes, mRefName, "s", "ref")
	AddAttr(Attributes, mKeyName, "s", "key")
	AddAttr(Attributes, mVText, "s", "v-text")
	AddAttr(Attributes, mVIf, "s", "v-if")
	AddAttr(Attributes, mVElse, "s", "v-else")
	AddAttr(Attributes, mVShow, "s", "v-show")
	AddAttr(Attributes, mVHtml, "s", "v-html")
	AddAttr(Attributes, mVFor, "s", "v-for")"$)
	'
	AddCode(mc, bai.ToString)
	
	AddCode(mc, "End If")
	'
	AddCode(mc, $"Dim exStyle As String = BuildExStyle
	Dim exAttr As String = Attributes.ToString"$)
	'
	Dim bLine As String = $"mElement = mTarget.Append(~"<~{mTagName} id="~{mName}" class="~{mClasses}" style="~{exStyle}~{mStyle}" ~{exAttr}>~{mText}</~{mTagName}>"~).Get("#" & mName)"$
	AddCode(mc, bLine)
	AddNewLine(mc)
	AddCode(mc, $"' defining events is very simple. Note that it has to be run AFTER adding it to the HTML DOM! eventName must be lowercase!"$)
	AddNewLine(mc)
	AddCode(mc, "End Sub")
	AddNewLine(mc)
	'
	AddCode(mc, sett.tostring)
		
	Dim xout As String = mc.ToString
	xout = xout.Replace("~","$")
	'return result
	Return xout
End Sub