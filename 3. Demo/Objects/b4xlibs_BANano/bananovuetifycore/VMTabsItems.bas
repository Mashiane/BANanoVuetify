B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TabsItems As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the TabsItems
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTabsItems
	ID = sid.tolowercase
	TabsItems.Initialize(v, ID)
	TabsItems.SetTag("v-tabs-items")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	SetOnChange($"${ID}_change"$)
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMTabsItems
	bStatic = b
	TabsItems.SetStatic(b)
	Return Me
End Sub

Sub AddComponent(comp As String) As VMTabsItems
	TabsItems.SetText(comp)
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMTabsItems
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetAttrLoose(loose As String) As VMTabsItems
	TabsItems.SetAttrLoose(loose)
	Return Me
End Sub


Sub SetAttributes(attrs As List) As VMTabsItems
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	If vue.ShowWarnings Then
	Dim eName As String = $"${ID}_change"$
	If SubExists(Module, eName) = False Then
		Log($"VMTabsItems.${eName} event has not been defined!"$)
	End If
	End If
	Return TabsItems.ToString
End Sub

Sub SetVModel(k As String) As VMTabsItems
	TabsItems.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMTabsItems
	TabsItems.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMTabsItems
	TabsItems.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTabsItems
	Dim childHTML As String = child.ToString
	TabsItems.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTabsItems
	TabsItems.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTabsItems
	TabsItems.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTabsItems
	TabsItems.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTabsItems
	TabsItems.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMTabsItems
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	TabsItems.Bind(":active-class", pp)
	Return Me
End Sub

'set continuous
Sub SetContinuous(varContinuous As Boolean) As VMTabsItems
	If varContinuous = False Then Return Me
	If bStatic Then
		SetAttrSingle("continuous",varContinuous)
		Return Me
	End If
	Dim pp As String = $"${ID}Continuous"$
	vue.SetStateSingle(pp, varContinuous)
	TabsItems.Bind(":continuous", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMTabsItems
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	TabsItems.Bind(":dark", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMTabsItems
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	TabsItems.Bind(":light", pp)
	Return Me
End Sub

'set mandatory
Sub SetMandatory(varMandatory As Boolean) As VMTabsItems
	If varMandatory = False Then Return Me
	If bStatic Then
		SetAttrSingle("mandatory", varMandatory)
		Return Me
	End If
	Dim pp As String = $"${ID}Mandatory"$
	vue.SetStateSingle(pp, varMandatory)
	TabsItems.Bind(":mandatory", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As String) As VMTabsItems
	If varMax = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max", varMax)
		Return Me
	End If
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	TabsItems.Bind(":max", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Boolean) As VMTabsItems
	If varMultiple = False Then Return Me
	If bStatic Then
		SetAttrSingle("multiple", varMultiple)
		Return Me
	End If
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	TabsItems.Bind(":multiple", pp)
	Return Me
End Sub

'set next-icon
Sub SetNextIcon(varNextIcon As String) As VMTabsItems
	If varNextIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("next-icon", varNextIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}NextIcon"$
	vue.SetStateSingle(pp, varNextIcon)
	TabsItems.Bind(":next-icon", pp)
	Return Me
End Sub

'set prev-icon
Sub SetPrevIcon(varPrevIcon As String) As VMTabsItems
	If varPrevIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("prev-icon", varPrevIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}PrevIcon"$
	vue.SetStateSingle(pp, varPrevIcon)
	TabsItems.Bind(":prev-icon", pp)
	Return Me
End Sub

'set reverse
Sub SetReverse(varReverse As Boolean) As VMTabsItems
	If varReverse = False Then Return Me
	If bStatic Then
		SetAttrSingle("reverse", varReverse)
		Return Me
	End If
	Dim pp As String = $"${ID}Reverse"$
	vue.SetStateSingle(pp, varReverse)
	TabsItems.Bind(":reverse", pp)
	Return Me
End Sub

'set show-arows
Sub SetShowArrows(varShowArows As Boolean) As VMTabsItems
	If varShowArows = False Then Return Me
	If bStatic Then
		SetAttrSingle("show-arrows", varShowArows)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowArrows"$
	vue.SetStateSingle(pp, varShowArows)
	TabsItems.Bind(":show-arrows", pp)
	Return Me
End Sub

'set show-arrows-on-hover
Sub SetShowArrowsOnHover(varShowArrowsOnHover As Boolean) As VMTabsItems
	If varShowArrowsOnHover = False Then Return Me
	If bStatic Then
		SetAttrSingle("show-arrows-on-hover", varShowArrowsOnHover)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowArrowsOnHover"$
	vue.SetStateSingle(pp, varShowArrowsOnHover)
	TabsItems.Bind(":show-arrows-on-hover", pp)
	Return Me
End Sub

'set touch
Sub SetTouch(varTouch As Object) As VMTabsItems
	Dim pp As String = $"${ID}Touch"$
	vue.SetStateSingle(pp, varTouch)
	TabsItems.Bind(":touch", pp)
	Return Me
End Sub

'set touchless
Sub SetTouchless(varTouchless As Boolean) As VMTabsItems
	If varTouchless = False Then Return Me
	If bStatic Then
		SetAttrSingle("touchless", varTouchless)
		Return Me
	End If
	Dim pp As String = $"${ID}Touchless"$
	vue.SetStateSingle(pp, varTouchless)
	TabsItems.Bind(":touchless", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMTabsItems
	TabsItems.SetValue(varValue, False)
	Return Me
End Sub

'set vertical
Sub SetVertical(varVertical As Boolean) As VMTabsItems
	If varVertical = False Then Return Me
	If bStatic Then
		SetAttrSingle("vertical", varVertical)
		Return Me
	End If
	Dim pp As String = $"${ID}Vertical"$
	vue.SetStateSingle(pp, varVertical)
	TabsItems.Bind(":vertical", pp)
	Return Me
End Sub

'
Sub SetOnChange(methodName As String) As VMTabsItems
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMTabsItems
	TabsItems.SetVisible(False)
	Return Me
End Sub

Sub Show As VMTabsItems
	TabsItems.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMTabsItems
	TabsItems.Enable(True)
	Return Me
End Sub

Sub Disable As VMTabsItems
	TabsItems.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMTabsItems
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMTabsItems
	TabsItems.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMTabsItems
	TabsItems.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMTabsItems
	TabsItems.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMTabsItems
	TabsItems.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMTabsItems
	TabsItems.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMTabsItems
	TabsItems.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMTabsItems
	TabsItems.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMTabsItems
	TabsItems.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMTabsItems
TabsItems.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMTabsItems
TabsItems.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMTabsItems
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMTabsItems
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub