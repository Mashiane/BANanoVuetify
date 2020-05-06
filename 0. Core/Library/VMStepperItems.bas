B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public StepperItems As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the StepperItems
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMStepperItems
	ID = sid.tolowercase
	StepperItems.Initialize(v, ID).SetTag("v-stepper-items")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMStepperItems
	bStatic = b
	StepperItems.SetStatic(b)
	Return Me
End Sub


Sub AddComponent(scomp As String) As VMStepperItems
	SetText(scomp)
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return StepperItems.ToString
End Sub

Sub SetVModel(k As String) As VMStepperItems
	StepperItems.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMStepperItems
	StepperItems.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMStepperItems
	StepperItems.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMStepperItems
	Dim childHTML As String = child.ToString
	StepperItems.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMStepperItems
	StepperItems.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMStepperItems
	StepperItems.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMStepperItems
	StepperItems.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMStepperItems
	StepperItems.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub


'hide the component
Sub Hide As VMStepperItems
	StepperItems.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMStepperItems
	StepperItems.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMStepperItems
	StepperItems.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMStepperItems
	StepperItems.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMStepperItems
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMStepperItems
	StepperItems.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMStepperItems
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMStepperItems
	StepperItems.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMStepperItems
	StepperItems.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMStepperItems
	StepperItems.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMStepperItems
	StepperItems.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMStepperItems
	StepperItems.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMStepperItems
	StepperItems.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMStepperItems
	StepperItems.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMStepperItems
	StepperItems.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMStepperItems
	StepperItems.BindStyleSingle(prop, value)
	Return Me
End Sub


Sub SetVText(vhtml As String) As VMStepperItems
	StepperItems.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMStepperItems
	StepperItems.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMStepperItems
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMStepperItems
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMStepperItems
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMStepperItems
StepperItems.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMStepperItems
StepperItems.SetVisible(b)
Return Me
End Sub