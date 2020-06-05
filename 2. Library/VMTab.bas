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
	Private DesignMode As Boolean   'ignore
	Private Module As Object	
	Private bStatic As Boolean
	Private Icon As VMIcon
	Public Badge As VMBadge
	Private hasBadge As Boolean
End Sub

'initialize the TabItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTab
	ID = sid.tolowercase
	TabItem.Initialize(v, ID)
	TabItem.SetTag("v-tab")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Icon.Initialize(vue, $"${ID}icon"$, Module)
	Badge.Initialize(vue, $"${ID}badge"$, Module)
	hasBadge = False
	Return Me
End Sub

Sub SetBadge(scontent As String) As VMTab
	Badge.SetContent(scontent)
	Badge.SetBordered(True)
	Badge.SetOverlap(True)
	Badge.SetDark(True)
	Badge.SetColorIntensity(vue.COLOR_CYAN, vue.INTENSITY_NORMAL)
	Badge.SetAvatar(True)
	Badge.SetIcon("")
	Badge.SetDot(False)
	hasBadge = True
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMTab
	bStatic = b
	TabItem.SetStatic(b)
	Icon.SetStatic(b)
	Badge.SetStatic(b)
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
	If hasBadge Then AddComponent(Badge.ToString)
	Return TabItem.ToString
End Sub

Sub SetVModel(k As String) As VMTab
	TabItem.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMTab
	TabItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVText(vtext As String) As VMTab
	TabItem.SetVtext(vtext)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMTab
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

Sub SetIcon(iconName As String) As VMTab
	If iconName = "" Then Return Me
	Icon.SetText(iconName)
	AddComponent(Icon.ToString)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMTab
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
Sub SetActiveClass(varActiveClass As String) As VMTab
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	TabItem.Bind(":active-class", pp)
	Return Me
End Sub

'set append
Sub SetAppend(varAppend As Boolean) As VMTab
	If varAppend = False Then Return Me
	If bStatic Then
		SetAttrSingle("append", varAppend)
		Return Me
	End If
	Dim pp As String = $"${ID}Append"$
	vue.SetStateSingle(pp, varAppend)
	TabItem.Bind(":append", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMTab
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
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
Sub SetExact(varExact As Boolean) As VMTab
	If varExact = False Then Return Me
	If bStatic Then
		SetAttrSingle("exact", varExact)
		Return Me
	End If
	Dim pp As String = $"${ID}Exact"$
	vue.SetStateSingle(pp, varExact)
	TabItem.Bind(":exact", pp)
	Return Me
End Sub

'set exact-active-class
Sub SetExactActiveClass(varExactActiveClass As String) As VMTab
	If varExactActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("exact-active-class", varExactActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ExactActiveClass"$
	vue.SetStateSingle(pp, varExactActiveClass)
	TabItem.Bind(":exact-active-class", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As String) As VMTab
	If varHref = "" Then Return Me
	SetAttrSingle("href", varHref)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMTab
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	TabItem.Bind(":light", pp)
	Return Me
End Sub

'set link
Sub SetLink(varLink As Boolean) As VMTab
	If varLink = False Then Return Me
	If bStatic Then
		SetAttrSingle("link", varLink)
		Return Me
	End If
	Dim pp As String = $"${ID}Link"$
	vue.SetStateSingle(pp, varLink)
	TabItem.Bind(":link", pp)
	Return Me
End Sub

'set nuxt
Sub SetNuxt(varNuxt As Boolean) As VMTab
	If varNuxt = False Then Return Me
	If bStatic Then
		SetAttrSingle("nuxt", varNuxt)
		Return Me
	End If
	Dim pp As String = $"${ID}Nuxt"$
	vue.SetStateSingle(pp, varNuxt)
	TabItem.Bind(":nuxt", pp)
	Return Me
End Sub

'set replace
Sub SetReplace(varReplace As Boolean) As VMTab
	If varReplace = False Then Return Me
	If bStatic Then
		SetAttrSingle("replace", varReplace)
		Return Me
	End If
	Dim pp As String = $"${ID}Replace"$
	vue.SetStateSingle(pp, varReplace)
	TabItem.Bind(":replace", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Boolean) As VMTab
	If varRipple Then Return Me
	If bStatic Then
		SetAttrSingle("ripple", varRipple)
		Return Me
	End If
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	TabItem.Bind(":ripple", pp)
	Return Me
End Sub

'set key
Sub SetKey(varKey As String) As VMTab
	If varKey = "" Then Return Me
	SetAttrSingle("key", varKey)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMTab
	If varTag = "" Then Return Me
	If bStatic Then
		SetAttrSingle("tag", varTag)
		Return Me 
	End If
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
Sub SetTo(varTo As String) As VMTab
	If varTo = "" Then Return Me
	If bStatic Then
		SetAttrSingle("to", varTo)
		Return Me
	End If
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
	SetAttr(CreateMap("@change": methodName))
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
	SetAttr(CreateMap("@click": methodName))
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
	SetAttr(CreateMap("@keydown": methodName))
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
	Icon.SetDesignMode(b)
	Badge.SetDesignMode(b)
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
