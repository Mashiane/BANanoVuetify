B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
#IgnoreWarnings:12
'Custom BANano View class

#DesignerProperty: Key: SlotActivator, DisplayName: SlotActivator, FieldType: String, DefaultValue: , Description: Slot activator
#DesignerProperty: Key: Attributes, DisplayName: Attributes, FieldType: String, DefaultValue: , Description: Attributes added to the HTML tag. Must be a json String.

Sub Class_Globals
	Private BANano As BANano 'ignore
	Private mName As String 'ignore
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mTarget As BANanoElement 'ignore
	Private mElement As BANanoElement 'ignore
	Private mAttributes As String = ""
	Private attributeList As Map
	Private mTagName As String = "v-template"
	Public bindings As Map
	Private stSlotActivator As String = ""
End Sub

'initialize the custom view
Public Sub Initialize (CallBack As Object, Name As String, EventName As String)
	mName = Name.ToLowerCase
	mEventName = EventName.ToLowerCase
	mCallBack = CallBack
	attributeList.Initialize
	bindings.Initialize
End Sub

'Create view in the designer
Public Sub DesignerCreateView (Target As BANanoElement, Props As Map)
	mTarget = Target
	If Props <> Null Then
		mAttributes = Props.Get("Attributes")
		stSlotActivator = Props.get("SlotActivator")
	End If

	AddAttr("v-slot:activator", stSlotActivator)
	setAttributes(mAttributes)
	
	'build and get the element
	Dim strHTML As String = ToString
	mElement = mTarget.Append(strHTML).Get("#" & mName)
End Sub

'return the generated html
Sub ToString As String
	'build element internal structure
	Dim iStructure As String = BANanoShared.BuildAttributes(attributeList)
	iStructure = iStructure.trim
	Dim rslt As String = $"<${mTagName} id="${mName}" ${iStructure}></${mTagName}>"$
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
		Dim v As String = bindings.Get(k)
		vap.SetData(k, v)
	Next
End Sub

'add html of component to another and binds events and states
Sub AddToComponent(ve As VMComponent)
	'Dim sout As String = ToString
	've.AddHTML(sout)
	'apply the binding for the control
	For Each k As String In bindings.Keys
		Dim v As String = bindings.Get(k)
		ve.SetData(k, v)
	Next
End Sub

'binds events and states
Sub BindToComponent(ve As VMComponent)
	'apply the binding for the control
	For Each k As String In bindings.Keys
		Dim v As String = bindings.Get(k)
		ve.SetData(k, v)
	Next
End Sub

'initialize data
Sub SetData(prop As String, val As Object)
	bindings.Put(prop, val)
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

Sub SetAttr(varProp As String, varValue As String)
	AddAttr(varProp, varValue)
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

'returns the attributes
public Sub getAttributes() As String
	Dim sbAttr As StringBuilder
	sbAttr.Initialize
	For Each k As String In attributeList.Keys
		Dim v As String = attributeList.Get(k)
		sbAttr.Append(k).Append("=").Append(v).Append(";")
	Next
	mAttributes = sbAttr.ToString
	Return mAttributes
End Sub

public Sub setSlotActivator(varSlotActivator As String)
	AddAttr("v-slot:activator", varSlotActivator)
	stSlotActivator = varSlotActivator
End Sub

public Sub getSlotActivator() As String
	Return stSlotActivator
End Sub
