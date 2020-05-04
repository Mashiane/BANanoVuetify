B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public StepperHeader As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the StepperHeader
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMStepperHeader
	ID = sid.tolowercase
	StepperHeader.Initialize(v, ID)
	StepperHeader.SetTag("v-stepper-header")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMStepperHeader
	bStatic = b
	StepperHeader.SetStatic(b)
	Return Me
End Sub

Sub AddDivider As VMStepperHeader
	StepperHeader.AddDivider
	Return Me
End Sub

Sub AddComponent(sComp As String) As VMStepperHeader
	SetText(sComp)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMStepperHeader
	StepperHeader.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMStepperHeader
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String	
	Return StepperHeader.ToString
End Sub

Sub SetVModel(k As String) As VMStepperHeader
	StepperHeader.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMStepperHeader
	StepperHeader.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMStepperHeader
	StepperHeader.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMStepperHeader
	Dim childHTML As String = child.ToString
	StepperHeader.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMStepperHeader
	StepperHeader.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMStepperHeader
	StepperHeader.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMStepperHeader
	StepperHeader.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMStepperHeader
	StepperHeader.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub


Sub Hide As VMStepperHeader
	StepperHeader.SetVisible(False)
	Return Me
End Sub

Sub Show As VMStepperHeader
	StepperHeader.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMStepperHeader
	StepperHeader.Enable(True)
	Return Me
End Sub

Sub Disable As VMStepperHeader
	StepperHeader.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMStepperHeader
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMStepperHeader
	StepperHeader.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMStepperHeader
	StepperHeader.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMStepperHeader
	StepperHeader.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMStepperHeader
	StepperHeader.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMStepperHeader
	StepperHeader.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMStepperHeader
	StepperHeader.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMStepperHeader
	StepperHeader.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMStepperHeader
	StepperHeader.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMStepperHeader
StepperHeader.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMStepperHeader
StepperHeader.SetVisible(b)
Return Me
End Sub