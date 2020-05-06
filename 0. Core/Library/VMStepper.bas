B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Stepper As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private Header As VMStepperHeader
	Private Items As VMStepperItems
	Private steps As Map
	Private stepCount As Int
	Private content As Map
	Private bVertical As Boolean
	Private bStatic As Boolean
End Sub

'initialize the Stepper
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMStepper
	ID = sid.tolowercase
	Stepper.Initialize(v, ID).SetTag("v-stepper").SetVModel(ID)
	DesignMode = False
	Module = eventHandler
	vue = v
	vue.SetData(ID, ID)
	Header.Initialize(vue, $"${ID}hdr"$, Module)
	Items.Initialize(vue, $"${ID}items"$, Module) 
	stepCount = 0
	content.Initialize 
	bVertical = False
	steps.Initialize
	bStatic = False
	vue.SetData(ID, 1)
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMStepper
	bStatic = b
	Stepper.SetStatic(b)
	Header.SetStatic(b)
	Items.setstatic(b)
	Return Me
End Sub


'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMStepper
	Stepper.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMStepper
	Stepper.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMStepper
	Stepper.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMStepper
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub AddStep1(stepID As String, stepLabel As String, stepDescription As String, stepContent As String)
	AddStep(stepID, stepLabel, stepDescription, True, stepContent)
End Sub

'the stepLabelVModel is the vmodel to have the caption
Sub AddStep(stepID As String, stepLabel As String, stepDescription As String, stepEditable As Boolean, stepContent As String) As VMStepper
	stepCount = stepCount + 1
	stepID = stepID.tolowercase
	'
	Dim stepitem As VMStepperStep
	stepitem.Initialize(vue, stepID, Module).SetStatic(True).SetDesignMode(DesignMode)
	stepitem.SetComplete(False)
	stepitem.SetEditable(stepEditable)
	stepitem.SetStep(vue.CStr(stepCount))
	stepitem.Content = stepContent
	stepitem.Setlabel(stepLabel, stepDescription)
	steps.put(stepID, stepitem)
	'
	Dim stpContent As VMStepperContent
	stpContent.initialize(vue, $"${stepID}content"$, Module).SetStatic(True).SetDesignMode(DesignMode)
	stpContent.SetStep(vue.CStr(stepCount))
	If stepContent <> Null Then
		stpContent.AddComponent(stepContent)
	End If
	content.Put(stepID, stpContent)
	Return Me	
End Sub

Sub SetAttrLoose(loose As String) As VMStepper
	Stepper.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMStepper
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Private Sub Build	
	If bVertical = False Then	
		Dim sb As StringBuilder
		sb.Initialize
		Dim sTot As Int = steps.Size
		Dim cTot As Int = 0
		For Each k As String In steps.Keys
			Dim sstep As VMStepperStep = steps.Get(k)
			sb.Append(sstep.ToString)
			cTot = cTot + 1
			If cTot < sTot Then
				sb.Append($"<v-divider></v-divider>"$)
			End If
		Next
		Header.AddComponent(sb.ToString)
	'
		Dim sbc As StringBuilder
		sbc.Initialize
		For Each k As String In content.Keys
			Dim vstep As VMStepperContent = content.Get(k)
			sbc.Append(vstep.ToString)
		Next		
		Items.AddComponent(sbc.ToString)
	Else
		Dim sb1 As StringBuilder
		sb1.Initialize
		For Each k As String In steps.Keys
			Dim sstep As VMStepperStep = steps.Get(k)
			Dim vstep As VMStepperContent = content.Get(k)
			'
			sb1.Append(sstep.ToString)
			sb1.Append(vstep.ToString)
		Next
		SetText(sb1.ToString)
	End If
End Sub


Sub SetStepEditable(stepID As String, stepEditable As Boolean) As VMStepper
	If stepID = "" Then Return Me
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}editable"$
	vue.SetStateSingle(stepShow, stepEditable)
	Return Me
End Sub

Sub SetStepDescription(stepID As String, stepEditable As String) As VMStepper
	If stepID = "" Then Return Me
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}description"$
	vue.SetStateSingle(stepShow, stepEditable)
	Return Me
End Sub

Sub SetStepLabel(stepID As String, stepLabel As String) As VMStepper
	If stepID = "" Then Return Me
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}label"$
	vue.SetStateSingle(stepShow, stepLabel)
	Return Me
End Sub


Sub SetStepError(stepID As String, stepError As String) As VMStepper
	If stepID = "" Then Return Me
	stepID = stepID.tolowercase
	Dim dd As String = $"${stepID}error"$
	vue.SetStateSingle(dd, stepError)
	Return Me
End Sub

Sub SetStepComplete(stepDone As String, b As Boolean) As VMStepper
	If stepDone = "" Then Return Me
	stepDone = stepDone.tolowercase
	Dim dd As String = $"${stepDone}Complete"$
	vue.SetStateSingle(dd, b)
	Return Me
End Sub

'The id of the Step To be set As the current one.
Sub SetStepActive(varActiveStep As String) As VMStepper
	If varActiveStep = "" Then Return Me
	varActiveStep = varActiveStep.tolowercase
	vue.SetStateSingle(ID, varActiveStep)
	For Each stepa As String In steps.keys
		If stepa = varActiveStep Then
		Else
			SetStepComplete(stepa, False)
		End If
	Next
	Return Me
End Sub


'get component
Sub ToString As String
	Build
	'add the header
	If bVertical = False Then
		Header.Pop(Stepper)
		Items.Pop(Stepper)
	End If
	Return Stepper.ToString
End Sub

Sub SetVModel(k As String) As VMStepper
	Stepper.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMStepper
	Stepper.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMStepper
	Stepper.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMStepper
	Dim childHTML As String = child.ToString
	Stepper.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMStepper
	Stepper.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMStepper
	Stepper.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMStepper
	Stepper.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMStepper
	Stepper.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set alt-labels
Sub SetAltLabels(varAltLabels As Boolean) As VMStepper
	If varAltLabels = False Then Return Me
	If bStatic Then
		SetAttrSingle("alt-labels", varAltLabels)
		Return Me
	End If
	Dim pp As String = $"${ID}AltLabels"$
	vue.SetStateSingle(pp, varAltLabels)
	Stepper.Bind(":alt-labels", pp)
	bVertical = False
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMStepper
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Stepper.Bind(":dark", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMStepper
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Stepper.Bind(":light", pp)
	Return Me
End Sub

'set non-linear
Sub SetNonLinear(varNonLinear As Boolean) As VMStepper
	If varNonLinear = False Then Return Me
	If bStatic Then
		SetAttrSingle("non-linear", varNonLinear)
		Return Me
	End If
	Dim pp As String = $"${ID}NonLinear"$
	vue.SetStateSingle(pp, varNonLinear)
	Stepper.Bind(":non-linear", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMStepper
	If varValue = "" Then Return Me
	Stepper.SetValue(varValue, False)
	Return Me
End Sub

'set vertical
Sub SetVertical(varVertical As Boolean) As VMStepper
	If varVertical = False Then Return Me
	bVertical = True
	If bStatic Then
		SetAttrSingle("vertical", varVertical)
		Return Me
	End If
	Dim pp As String = $"${ID}Vertical"$
	vue.SetStateSingle(pp, varVertical)
	Stepper.Bind(":vertical", pp)
	Return Me
End Sub

'
Sub SetOnChange(eventHandler As Object, methodName As String) As VMStepper
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim num As Int  'ignore
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(num))
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMStepper
	Stepper.SetVisible(False)
	Return Me
End Sub

Sub Show As VMStepper
	Stepper.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMStepper
	Stepper.Enable(True)
	Return Me
End Sub

Sub Disable As VMStepper
	Stepper.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMStepper
	Stepper.Bind(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMStepper
	Stepper.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMStepper
	Stepper.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMStepper
	Stepper.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMStepper
	Stepper.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMStepper
	Stepper.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMStepper
	Stepper.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMStepper
	Stepper.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMStepper
	Stepper.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMStepper
Stepper.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMStepper
Stepper.SetVisible(b)
Return Me
End Sub