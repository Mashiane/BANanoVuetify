B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public StepperContent As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object  'ignore 
	Private bStatic As Boolean   'ignore
End Sub

'initialize the StepperContent
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMStepperContent
	ID = sid.tolowercase
	StepperContent.Initialize(v, ID)
	StepperContent.SetTag("v-stepper-content")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMStepperContent
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetStatic(b As Boolean) As VMStepperContent
	bStatic = b
	StepperContent.SetStatic(b)
	Return Me
End Sub

Sub AddComponent(scomp As String) As VMStepperContent
	SetText(scomp)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMStepperContent
	StepperContent.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMStepperContent
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String	
	Return StepperContent.ToString
End Sub

Sub SetVModel(k As String) As VMStepperContent
	StepperContent.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMStepperContent
	StepperContent.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMStepperContent
	StepperContent.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMStepperContent
	Dim childHTML As String = child.ToString
	StepperContent.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMStepperContent
	StepperContent.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMStepperContent
	StepperContent.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMStepperContent
	StepperContent.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMStepperContent
	StepperContent.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set step
Sub SetStep(varStep As String) As VMStepperContent
	StepperContent.SetAttrSingle("step", varStep)
	Return Me
End Sub


Sub Hide As VMStepperContent
	StepperContent.SetVisible(False)
	Return Me
End Sub

Sub Show As VMStepperContent
	StepperContent.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMStepperContent
	StepperContent.Enable(True)
	Return Me
End Sub

Sub Disable As VMStepperContent
	StepperContent.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMStepperContent
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMStepperContent
	StepperContent.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMStepperContent
	StepperContent.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMStepperContent
	StepperContent.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMStepperContent
	StepperContent.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMStepperContent
	StepperContent.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMStepperContent
	StepperContent.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMStepperContent
	StepperContent.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMStepperContent
	StepperContent.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMStepperContent
StepperContent.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMStepperContent
StepperContent.SetVisible(b)
Return Me
End Sub
