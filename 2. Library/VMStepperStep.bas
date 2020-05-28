B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public StepperStep As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public Content As String
	Public Description As String
	Private bStatic As Boolean
	Private xmodel As String
End Sub

'initialize the StepperStep
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMStepperStep
	ID = sid.tolowercase
	StepperStep.Initialize(v, ID)
	StepperStep.SetTag("v-stepper-step")
	DesignMode = False
	Module = eventHandler
	vue = v
	Content = ""
	Description = ""
	bStatic = False
	xmodel = ""
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMStepperStep
	bStatic = b
	StepperStep.SetStatic(b)
	Return Me
End Sub

Sub SetLabel(lbl As String, lbldesc As String) As VMStepperStep
	Dim pp As String = $"${ID}label"$
	Dim pd As String = $"${ID}desc"$
	vue.SetData(pp, lbl)
	vue.SetData(pd, lbldesc)
	If bStatic Or DesignMode Then
		StepperStep.SetText($"${lbl}<small>${lbldesc}</small>"$)
	Else
		StepperStep.SetText($"{{ ${pp} }}<small>{{ ${pd} }}</small>"$)
	End If
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMStepperStep
	StepperStep.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMStepperStep
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String	
	Return StepperStep.ToString
End Sub

Sub SetVModel(k As String) As VMStepperStep
	xmodel = k.tolowercase
	StepperStep.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMStepperStep
	StepperStep.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMStepperStep
	StepperStep.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMStepperStep
	Dim childHTML As String = child.ToString
	StepperStep.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMStepperStep
	StepperStep.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMStepperStep
	StepperStep.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMStepperStep
	StepperStep.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMStepperStep
	StepperStep.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As String) As VMStepperStep
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	StepperStep.Bind(":color", pp)
	Return Me
End Sub

'set complete
Sub SetComplete(varComplete As Boolean) As VMStepperStep
	If varComplete = False Then Return Me
	If bStatic Then
		SetAttrSingle("complete", varComplete)
		Return Me
	End If
	Dim pp As String = $"${ID}Complete"$
	vue.SetStateSingle(pp, varComplete)
	StepperStep.Bind(":complete", pp)
	Return Me
End Sub

'set complete-icon
Sub SetCompleteIcon(varCompleteIcon As String) As VMStepperStep
	If varCompleteIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("complete-icon", varCompleteIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}CompleteIcon"$
	vue.SetStateSingle(pp, varCompleteIcon)
	StepperStep.Bind(":complete-icon", pp)
	Return Me
End Sub

'set edit-icon
Sub SetEditIcon(varEditIcon As String) As VMStepperStep
	If varEditIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("edit-icon", varEditIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}EditIcon"$
	vue.SetStateSingle(pp, varEditIcon)
	StepperStep.Bind(":edit-icon", pp)
	Return Me
End Sub

'set editable
Sub SetEditable(varEditable As Boolean) As VMStepperStep
	If varEditable = False Then Return Me
	If bStatic Then
		SetAttrSingle("editable", "varEditable")
		Return Me
	End If
	Dim pp As String = $"${ID}Editable"$
	vue.SetStateSingle(pp, varEditable)
	StepperStep.Bind(":editable", pp)
	Return Me
End Sub

'set error-icon
Sub SetErrorIcon(varErrorIcon As String) As VMStepperStep
	If varErrorIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("error-icon", varErrorIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}ErrorIcon"$
	vue.SetStateSingle(pp, varErrorIcon)
	StepperStep.Bind(":error-icon", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Boolean) As VMStepperStep
	If varRules = False Then Return Me
	If bStatic Then Return Me
	If DesignMode Then Return Me
	Dim pp As String = $"${xmodel}Rules"$
	StepperStep.Bind(":rules", pp)
	vue.SetData(pp, vue.NewList)
	Return Me
End Sub

'set step
Sub SetStep(varStep As String) As VMStepperStep
	StepperStep.Bind("step", varStep)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMStepperStep
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMStepperStep
	StepperStep.SetVisible(False)
	Return Me
End Sub

Sub Show As VMStepperStep
	StepperStep.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMStepperStep
	StepperStep.Enable(True)
	Return Me
End Sub

Sub Disable As VMStepperStep
	StepperStep.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMStepperStep
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMStepperStep
	StepperStep.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMStepperStep
	StepperStep.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMStepperStep
	StepperStep.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMStepperStep
	StepperStep.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMStepperStep
	StepperStep.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMStepperStep
	StepperStep.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMStepperStep
	StepperStep.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMStepperStep
	StepperStep.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMStepperStep
StepperStep.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMStepperStep
StepperStep.SetVisible(b)
Return Me
End Sub
