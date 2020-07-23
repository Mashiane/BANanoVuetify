B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean  'ignore
	Private Module As Object
	Public childList As VMList
	Private bStatic As Boolean
End Sub

'initialize the ListItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItem
	ID = sid.tolowercase
	ListItem.Initialize(v, ID)
	ListItem.SetTag("v-list-item")
	ListItem.SetAttrLoose("link")
	DesignMode = False
	Module = eventHandler
	vue = v
	SetOnClick($"${ID}_click"$)
	childList.Initialize(vue, $"${ID}children"$, Module)
	bStatic = False
	Return Me
End Sub


Sub AddComponent(comp As String) As VMListItem
	ListItem.SetText(comp)
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMListItem
	bStatic = b
	ListItem.SetStatic(b)
	childList.SetStatic(b)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMListItem
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub
'
Sub SetAttrLoose(loose As String) As VMListItem
	ListItem.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetVElse(t As Object) As VMListItem
	ListItem.SetVElse(t)
	Return Me
End Sub

Sub SetList(lst As VMList) As VMListItem
	ListItem.SetText(lst.ToString)
	Return Me
End Sub

'get component
Sub ToString As String
	Return ListItem.ToString
End Sub

Sub SetVModel(k As String) As VMListItem
	ListItem.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMListItem
	ListItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMListItem
	ListItem.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMListItem
	Dim childHTML As String = child.ToString
	ListItem.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMListItem
	ListItem.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMListItem
	ListItem.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItem
	ListItem.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMListItem
	ListItem.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMListItem
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	ListItem.Bind(":active-class", pp)
	Return Me
End Sub

'set append
Sub SetAppend(varAppend As Boolean) As VMListItem
	If varAppend = False Then Return Me
	If bStatic Then
		SetAttrSingle("append", varAppend)
		Return Me
	End If
	Dim pp As String = $"${ID}Append"$
	vue.SetStateSingle(pp, varAppend)
	ListItem.Bind(":append", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMListItem
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ListItem.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMListItem
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ListItem.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMListItem
	If varDense = False Then Return Me
	If bStatic Then
		SetAttrSingle("dense", varDense)
		Return Me
	End If
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	ListItem.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMListItem
	ListItem.SetDisabled(varDisabled)
	Return Me
End Sub

'set exact
Sub SetExact(varExact As Boolean) As VMListItem
	If varExact = False Then Return Me
	If bStatic Then
		SetAttrSingle("exact", varExact)
		Return Me
	End If
	Dim pp As String = $"${ID}Exact"$
	vue.SetStateSingle(pp, varExact)
	ListItem.Bind(":exact", pp)
	Return Me
End Sub

'set exact-active-class
Sub SetExactActiveClass(varExactActiveClass As String) As VMListItem
	If varExactActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("exact-active-class", varExactActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ExactActiveClass"$
	vue.SetStateSingle(pp, varExactActiveClass)
	ListItem.Bind(":exact-active-class", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As String) As VMListItem
	If varHref = "" Then Return Me
	If bStatic Then
		SetAttrSingle("href", varHref)
		Return Me
	End If
	Dim pp As String = $"${ID}Href"$
	vue.SetStateSingle(pp, varHref)
	ListItem.Bind(":href", pp)
	Return Me
End Sub

'set inactive
Sub SetInactive(varInactive As Boolean) As VMListItem
	If varInactive  = False Then Return Me
	If bStatic Then
		SetAttrSingle("inactive", varInactive)
		Return Me
	End If
	Dim pp As String = $"${ID}Inactive"$
	vue.SetStateSingle(pp, varInactive)
	ListItem.Bind(":inactive", pp)
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As String) As VMListItem
	If varInputValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("input-value", varInputValue)
		Return Me
	End If
	Dim pp As String = $"${ID}InputValue"$
	vue.SetStateSingle(pp, varInputValue)
	ListItem.Bind(":input-value", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMListItem
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ListItem.Bind(":light", pp)
	Return Me
End Sub

'set link
Sub SetLink(varLink As Boolean) As VMListItem
	If varLink = False Then Return Me
	If bStatic Then
		SetAttrSingle("link", varLink)
		Return Me
	End If
	Dim pp As String = $"${ID}Link"$
	vue.SetStateSingle(pp, varLink)
	ListItem.Bind(":link", pp)
	Return Me
End Sub

'set nuxt
Sub SetNuxt(varNuxt As Boolean) As VMListItem
	If varNuxt = False Then Return Me
	If bStatic Then
		SetAttrSingle("nuxt", varNuxt)
		Return Me
	End If
	Dim pp As String = $"${ID}Nuxt"$
	vue.SetStateSingle(pp, varNuxt)
	ListItem.Bind(":nuxt", pp)
	Return Me
End Sub

'set replace
Sub SetReplace(varReplace As Boolean) As VMListItem
	If varReplace = False Then Return Me
	If bStatic Then
		SetAttrSingle("replace", varReplace)
		Return Me
	End If
	Dim pp As String = $"${ID}Replace"$
	vue.SetStateSingle(pp, varReplace)
	ListItem.Bind(":replace", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Boolean) As VMListItem
	If varRipple = False Then Return Me
	If bStatic Then
		SetAttrSingle("ripple", varRipple)
		Return Me
	End If
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	ListItem.Bind(":ripple", pp)
	Return Me
End Sub

'set selectable
Sub SetSelectable(varSelectable As Boolean) As VMListItem
	If varSelectable = False Then Return Me
	If bStatic Then
		SetAttrSingle("selectable", varSelectable)
		Return Me
	End If
	Dim pp As String = $"${ID}Selectable"$
	vue.SetStateSingle(pp, varSelectable)
	ListItem.Bind(":selectable", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMListItem
	If varTag = "" Then Return Me
	SetAttrSingle("tag", varTag)
	Return Me
End Sub

'set target
Sub SetTarget(varTarget As String) As VMListItem
	If varTarget = "" Then Return Me
	If bStatic Then
		SetAttrSingle("target", varTarget)
		Return Me
	End If
	Dim pp As String = $"${ID}Target"$
	vue.SetStateSingle(pp, varTarget)
	ListItem.Bind(":target", pp)
	Return Me
End Sub

'set three-line
Sub SetThreeLine(varThreeLine As Boolean) As VMListItem
	If varThreeLine = False Then Return Me
	If bStatic Then
		SetAttrSingle("three-line", varThreeLine)
		Return Me
	End If
	Dim pp As String = $"${ID}ThreeLine"$
	vue.SetStateSingle(pp, varThreeLine)
	ListItem.Bind(":three-line", pp)
	Return Me
End Sub

'set to
Sub SetTo(varTo As String) As VMListItem
	If varTo = "" Then Return Me
	SetAttrSingle("to", varTo)
	Return Me
End Sub

'set two-line
Sub SetTwoLine(varTwoLine As Boolean) As VMListItem
	If varTwoLine = False Then Return Me
	If bStatic Then
		SetAttrSingle("two-line", varTwoLine)
		Return Me
	End If
	Dim pp As String = $"${ID}TwoLine"$
	vue.SetStateSingle(pp, varTwoLine)
	ListItem.Bind(":two-line", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMListItem
	ListItem.SetValue(varValue, False)
	Return Me
End Sub
'
Sub SetOnClick(methodName As String) As VMListItem
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
Sub SetOnKeydown(methodName As String) As VMListItem
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("@keydown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub
'
Sub Hide As VMListItem
	ListItem.SetVisible(False)
	Return Me
End Sub

Sub Show As VMListItem
	ListItem.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMListItem
	ListItem.Enable(True)
	Return Me
End Sub

Sub Disable As VMListItem
	ListItem.Disable(True)
	Return Me
End Sub

'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMListItem
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMListItem
	ListItem.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMListItem
	ListItem.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMListItem
	ListItem.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMListItem
	ListItem.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMListItem
	ListItem.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMListItem
	ListItem.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMListItem
	ListItem.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMListItem
	ListItem.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMListItem
	ListItem.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMListItem
	ListItem.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMListItem
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMListItem
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub