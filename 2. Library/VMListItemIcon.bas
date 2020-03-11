B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItemIcon As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the ListItemIcon
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItemIcon
	ID = sid.tolowercase
	ListItemIcon.Initialize(v, ID)
	ListItemIcon.SetTag("v-list-item-icon")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMListItemIcon
	ListItemIcon.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMListItemIcon
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	
	
	
	Return ListItemIcon.ToString
End Sub


Sub SetVText(vhtml As String) As VMListItemIcon
	ListItemIcon.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMListItemIcon
	ListItemIcon.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetVModel(k As String) As VMListItemIcon
	ListItemIcon.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMListItemIcon
	ListItemIcon.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMListItemIcon
	ListItemIcon.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMListItemIcon
	Dim childHTML As String = child.ToString
	ListItemIcon.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMListItemIcon
	ListItemIcon.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMListItemIcon
	ListItemIcon.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItemIcon
	ListItemIcon.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMListItemIcon
	ListItemIcon.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMListItemIcon
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	ListItemIcon.Bind(":active-class", pp)
	Return Me
End Sub

'set append
Sub SetAppend(varAppend As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Append"$
	vue.SetStateSingle(pp, varAppend)
	ListItemIcon.Bind(":append", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ListItemIcon.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ListItemIcon.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	ListItemIcon.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMListItemIcon
	ListItemIcon.SetDisabled(varDisabled)
	Return Me
End Sub

'set exact
Sub SetExact(varExact As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Exact"$
	vue.SetStateSingle(pp, varExact)
	ListItemIcon.Bind(":exact", pp)
	Return Me
End Sub

'set exact-active-class
Sub SetExactActiveClass(varExactActiveClass As Object) As VMListItemIcon
	Dim pp As String = $"${ID}ExactActiveClass"$
	vue.SetStateSingle(pp, varExactActiveClass)
	ListItemIcon.Bind(":exact-active-class", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Href"$
	vue.SetStateSingle(pp, varHref)
	ListItemIcon.Bind(":href", pp)
	Return Me
End Sub

'set inactive
Sub SetInactive(varInactive As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Inactive"$
	vue.SetStateSingle(pp, varInactive)
	ListItemIcon.Bind(":inactive", pp)
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As Object) As VMListItemIcon
	Dim pp As String = $"${ID}InputValue"$
	vue.SetStateSingle(pp, varInputValue)
	ListItemIcon.Bind(":input-value", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ListItemIcon.Bind(":light", pp)
	Return Me
End Sub

'set link
Sub SetLink(varLink As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Link"$
	vue.SetStateSingle(pp, varLink)
	ListItemIcon.Bind(":link", pp)
	Return Me
End Sub

'set nuxt
Sub SetNuxt(varNuxt As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Nuxt"$
	vue.SetStateSingle(pp, varNuxt)
	ListItemIcon.Bind(":nuxt", pp)
	Return Me
End Sub

'set replace
Sub SetReplace(varReplace As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Replace"$
	vue.SetStateSingle(pp, varReplace)
	ListItemIcon.Bind(":replace", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	ListItemIcon.Bind(":ripple", pp)
	Return Me
End Sub

'set selectable
Sub SetSelectable(varSelectable As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Selectable"$
	vue.SetStateSingle(pp, varSelectable)
	ListItemIcon.Bind(":selectable", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	ListItemIcon.Bind(":tag", pp)
	Return Me
End Sub

'set target
Sub SetTarget(varTarget As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Target"$
	vue.SetStateSingle(pp, varTarget)
	ListItemIcon.Bind(":target", pp)
	Return Me
End Sub

'set three-line
Sub SetThreeLine(varThreeLine As Object) As VMListItemIcon
	Dim pp As String = $"${ID}ThreeLine"$
	vue.SetStateSingle(pp, varThreeLine)
	ListItemIcon.Bind(":three-line", pp)
	Return Me
End Sub

'set to
Sub SetTo(varTo As Object) As VMListItemIcon
	Dim pp As String = $"${ID}To"$
	vue.SetStateSingle(pp, varTo)
	ListItemIcon.Bind(":to", pp)
	Return Me
End Sub

'set two-line
Sub SetTwoLine(varTwoLine As Object) As VMListItemIcon
	Dim pp As String = $"${ID}TwoLine"$
	vue.SetStateSingle(pp, varTwoLine)
	ListItemIcon.Bind(":two-line", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMListItemIcon
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	ListItemIcon.Bind(":value", pp)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMListItemIcon
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
Sub SetOnKeydown(methodName As String) As VMListItemIcon
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:keydown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMListItemIcon
	ListItemIcon.SetVisible(False)
	Return Me
End Sub

Sub Show As VMListItemIcon
	ListItemIcon.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMListItemIcon
	ListItemIcon.Enable(True)
	Return Me
End Sub

Sub Disable As VMListItemIcon
	ListItemIcon.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMListItemIcon
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMListItemIcon
	ListItemIcon.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMListItemIcon
	ListItemIcon.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMListItemIcon
	ListItemIcon.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMListItemIcon
	ListItemIcon.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMListItemIcon
	ListItemIcon.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMListItemIcon
	ListItemIcon.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMListItemIcon
	ListItemIcon.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMListItemIcon
	ListItemIcon.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMListItemIcon
ListItemIcon.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub