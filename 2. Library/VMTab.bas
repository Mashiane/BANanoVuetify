B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TabItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object	
End Sub

'initialize the TabItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTab
	ID = sid.tolowercase
	TabItem.Initialize(v, ID)
	TabItem.SetTag("v-tab")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

Sub AddComponent(comp As String) As VMTab
	TabItem.SetText(comp)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMTab
	TabItem.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMTab
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	Return TabItem.ToString
End Sub

Sub SetVModel(k As String) As VMTab
	TabItem.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTab
	TabItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVText(vtext As String) As VMTab
	TabItem.SetVtext(vtext)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTab
	TabItem.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTab
	Dim childHTML As String = child.ToString
	TabItem.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTab
	TabItem.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTab
	TabItem.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTab
	TabItem.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTab
	TabItem.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMTab
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	TabItem.Bind(":active-class", pp)
	Return Me
End Sub

'set append
Sub SetAppend(varAppend As Object) As VMTab
	Dim pp As String = $"${ID}Append"$
	vue.SetStateSingle(pp, varAppend)
	TabItem.Bind(":append", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMTab
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	TabItem.Bind(":dark", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMTab
	TabItem.SetDisabled(varDisabled)
	Return Me
End Sub

'set exact
Sub SetExact(varExact As Object) As VMTab
	Dim pp As String = $"${ID}Exact"$
	vue.SetStateSingle(pp, varExact)
	TabItem.Bind(":exact", pp)
	Return Me
End Sub

'set exact-active-class
Sub SetExactActiveClass(varExactActiveClass As Object) As VMTab
	Dim pp As String = $"${ID}ExactActiveClass"$
	vue.SetStateSingle(pp, varExactActiveClass)
	TabItem.Bind(":exact-active-class", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As Object) As VMTab
	Dim pp As String = $"${ID}Href"$
	vue.SetStateSingle(pp, varHref)
	TabItem.Bind(":href", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMTab
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	TabItem.Bind(":light", pp)
	Return Me
End Sub

'set link
Sub SetLink(varLink As Object) As VMTab
	Dim pp As String = $"${ID}Link"$
	vue.SetStateSingle(pp, varLink)
	TabItem.Bind(":link", pp)
	Return Me
End Sub

'set nuxt
Sub SetNuxt(varNuxt As Object) As VMTab
	Dim pp As String = $"${ID}Nuxt"$
	vue.SetStateSingle(pp, varNuxt)
	TabItem.Bind(":nuxt", pp)
	Return Me
End Sub

'set replace
Sub SetReplace(varReplace As Object) As VMTab
	Dim pp As String = $"${ID}Replace"$
	vue.SetStateSingle(pp, varReplace)
	TabItem.Bind(":replace", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Object) As VMTab
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	TabItem.Bind(":ripple", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMTab
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	TabItem.Bind(":tag", pp)
	Return Me
End Sub

'set target
Sub SetTarget(varTarget As String) As VMTab
	If varTarget = "" Then Return Me
	SetAttrSingle("target", varTarget)
	Return Me
End Sub

'set to
Sub SetTo(varTo As Object) As VMTab
	Dim pp As String = $"${ID}To"$
	vue.SetStateSingle(pp, varTo)
	TabItem.Bind(":to", pp)
	Return Me
End Sub

'
Sub SetOnChange(methodName As String) As VMTab
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMTab
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnKeydown(methodName As String) As VMTab
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:keydown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMTab
	TabItem.SetVisible(False)
	Return Me
End Sub

Sub Show As VMTab
	TabItem.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMTab
	TabItem.Enable(True)
	Return Me
End Sub

Sub Disable As VMTab
	TabItem.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMTab
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMTab
	TabItem.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMTab
	TabItem.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMTab
	TabItem.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMTab
	TabItem.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMTab
	TabItem.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMTab
	TabItem.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMTab
	TabItem.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMTab
	TabItem.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub SetTabLabel(stepID As String, stepLabel As String) As VMTab
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}label"$
	vue.SetStateSingle(stepShow, stepLabel)
	Return Me
End Sub


Sub SetTabIcon(stepID As String, stepLabel As String) As VMTab
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}icon"$
	vue.SetStateSingle(stepShow, stepLabel)
	Return Me
End Sub


Sub SetTabDisabled(stepID As String, stepLabel As Boolean) As VMTab
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}disabled"$
	vue.SetStateSingle(stepShow, stepLabel)
	Return Me
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMTab
TabItem.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMTab
TabItem.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMTab
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMTab
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub