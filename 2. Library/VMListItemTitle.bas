B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItemTitle As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the ListItemTitle
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItemTitle
	ID = sid.tolowercase
	ListItemTitle.Initialize(v, ID)
	ListItemTitle.SetTag("v-list-item-title")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMListItemTitle
	ListItemTitle.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMListItemTitle
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	
	
	
	Return ListItemTitle.ToString
End Sub

Sub SetVModel(k As String) As VMListItemTitle
	ListItemTitle.SetVModel(k)
	Return Me
End Sub


Sub SetVText(vhtml As String) As VMListItemTitle
	ListItemTitle.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMListItemTitle
	ListItemTitle.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMListItemTitle
	ListItemTitle.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMListItemTitle
	ListItemTitle.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMListItemTitle
	Dim childHTML As String = child.ToString
	ListItemTitle.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMListItemTitle
	ListItemTitle.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMListItemTitle
	ListItemTitle.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItemTitle
	ListItemTitle.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMListItemTitle
	ListItemTitle.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMListItemTitle
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	ListItemTitle.Bind(":active-class", pp)
	Return Me
End Sub

'set append
Sub SetAppend(varAppend As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Append"$
	vue.SetStateSingle(pp, varAppend)
	ListItemTitle.Bind(":append", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ListItemTitle.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ListItemTitle.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	ListItemTitle.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMListItemTitle
	ListItemTitle.SetDisabled(varDisabled)
	Return Me
End Sub

'set exact
Sub SetExact(varExact As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Exact"$
	vue.SetStateSingle(pp, varExact)
	ListItemTitle.Bind(":exact", pp)
	Return Me
End Sub

'set exact-active-class
Sub SetExactActiveClass(varExactActiveClass As Object) As VMListItemTitle
	Dim pp As String = $"${ID}ExactActiveClass"$
	vue.SetStateSingle(pp, varExactActiveClass)
	ListItemTitle.Bind(":exact-active-class", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Href"$
	vue.SetStateSingle(pp, varHref)
	ListItemTitle.Bind(":href", pp)
	Return Me
End Sub

'set inactive
Sub SetInactive(varInactive As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Inactive"$
	vue.SetStateSingle(pp, varInactive)
	ListItemTitle.Bind(":inactive", pp)
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As Object) As VMListItemTitle
	Dim pp As String = $"${ID}InputValue"$
	vue.SetStateSingle(pp, varInputValue)
	ListItemTitle.Bind(":input-value", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ListItemTitle.Bind(":light", pp)
	Return Me
End Sub

'set link
Sub SetLink(varLink As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Link"$
	vue.SetStateSingle(pp, varLink)
	ListItemTitle.Bind(":link", pp)
	Return Me
End Sub

'set nuxt
Sub SetNuxt(varNuxt As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Nuxt"$
	vue.SetStateSingle(pp, varNuxt)
	ListItemTitle.Bind(":nuxt", pp)
	Return Me
End Sub

'set replace
Sub SetReplace(varReplace As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Replace"$
	vue.SetStateSingle(pp, varReplace)
	ListItemTitle.Bind(":replace", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	ListItemTitle.Bind(":ripple", pp)
	Return Me
End Sub

'set selectable
Sub SetSelectable(varSelectable As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Selectable"$
	vue.SetStateSingle(pp, varSelectable)
	ListItemTitle.Bind(":selectable", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	ListItemTitle.Bind(":tag", pp)
	Return Me
End Sub

'set target
Sub SetTarget(varTarget As Object) As VMListItemTitle
	Dim pp As String = $"${ID}Target"$
	vue.SetStateSingle(pp, varTarget)
	ListItemTitle.Bind(":target", pp)
	Return Me
End Sub

'set three-line
Sub SetThreeLine(varThreeLine As Object) As VMListItemTitle
	Dim pp As String = $"${ID}ThreeLine"$
	vue.SetStateSingle(pp, varThreeLine)
	ListItemTitle.Bind(":three-line", pp)
	Return Me
End Sub

'set to
Sub SetTo(varTo As Object) As VMListItemTitle
	Dim pp As String = $"${ID}To"$
	vue.SetStateSingle(pp, varTo)
	ListItemTitle.Bind(":to", pp)
	Return Me
End Sub

'set two-line
Sub SetTwoLine(varTwoLine As Object) As VMListItemTitle
	Dim pp As String = $"${ID}TwoLine"$
	vue.SetStateSingle(pp, varTwoLine)
	ListItemTitle.Bind(":two-line", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMListItemTitle
	SetAttrSingle("value", varValue)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMListItemTitle
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
Sub SetOnKeydown(methodName As String) As VMListItemTitle
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:keydown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMListItemTitle
	ListItemTitle.SetVisible(False)
	Return Me
End Sub

Sub Show As VMListItemTitle
	ListItemTitle.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMListItemTitle
	ListItemTitle.Enable(True)
	Return Me
End Sub

Sub Disable As VMListItemTitle
	ListItemTitle.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMListItemTitle
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMListItemTitle
	ListItemTitle.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMListItemTitle
	ListItemTitle.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMListItemTitle
	ListItemTitle.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMListItemTitle
	ListItemTitle.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMListItemTitle
	ListItemTitle.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMListItemTitle
	ListItemTitle.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMListItemTitle
	ListItemTitle.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMListItemTitle
	ListItemTitle.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMListItemTitle
ListItemTitle.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMListItemTitle
ListItemTitle.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMListItemTitle
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMListItemTitle
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub