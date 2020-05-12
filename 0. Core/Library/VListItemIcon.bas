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
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the ListItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItem
	ID = sid.tolowercase
	ListItem.Initialize(v, ID)
	ListItem.SetTag("v-list-item-icon")
	DesignMode = False
	Module = eventHandler
	vue = v
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

Sub SetVIf(vif As Object) As VMListItem
	ListItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMListItem
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
Sub SetActiveClass(varActiveClass As Object) As VMListItem
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	ListItem.Bind(":active-class", pp)
	Return Me
End Sub

'set append
Sub SetAppend(varAppend As Object) As VMListItem
	Dim pp As String = $"${ID}Append"$
	vue.SetStateSingle(pp, varAppend)
	ListItem.Bind(":append", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMListItem
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ListItem.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMListItem
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ListItem.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMListItem
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	ListItem.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Object) As VMListItem
	Dim pp As String = $"${ID}Disabled"$
	vue.SetStateSingle(pp, varDisabled)
	ListItem.Bind(":disabled", pp)
	Return Me
End Sub

'set exact
Sub SetExact(varExact As Object) As VMListItem
	Dim pp As String = $"${ID}Exact"$
	vue.SetStateSingle(pp, varExact)
	ListItem.Bind(":exact", pp)
	Return Me
End Sub

'set exact-active-class
Sub SetExactActiveClass(varExactActiveClass As Object) As VMListItem
	Dim pp As String = $"${ID}ExactActiveClass"$
	vue.SetStateSingle(pp, varExactActiveClass)
	ListItem.Bind(":exact-active-class", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As Object) As VMListItem
	Dim pp As String = $"${ID}Href"$
	vue.SetStateSingle(pp, varHref)
	ListItem.Bind(":href", pp)
	Return Me
End Sub

'set inactive
Sub SetInactive(varInactive As Object) As VMListItem
	Dim pp As String = $"${ID}Inactive"$
	vue.SetStateSingle(pp, varInactive)
	ListItem.Bind(":inactive", pp)
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As Object) As VMListItem
	Dim pp As String = $"${ID}InputValue"$
	vue.SetStateSingle(pp, varInputValue)
	ListItem.Bind(":input-value", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMListItem
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ListItem.Bind(":light", pp)
	Return Me
End Sub

'set link
Sub SetLink(varLink As Object) As VMListItem
	Dim pp As String = $"${ID}Link"$
	vue.SetStateSingle(pp, varLink)
	ListItem.Bind(":link", pp)
	Return Me
End Sub

'set nuxt
Sub SetNuxt(varNuxt As Object) As VMListItem
	Dim pp As String = $"${ID}Nuxt"$
	vue.SetStateSingle(pp, varNuxt)
	ListItem.Bind(":nuxt", pp)
	Return Me
End Sub

'set replace
Sub SetReplace(varReplace As Object) As VMListItem
	Dim pp As String = $"${ID}Replace"$
	vue.SetStateSingle(pp, varReplace)
	ListItem.Bind(":replace", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Object) As VMListItem
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	ListItem.Bind(":ripple", pp)
	Return Me
End Sub

'set selectable
Sub SetSelectable(varSelectable As Object) As VMListItem
	Dim pp As String = $"${ID}Selectable"$
	vue.SetStateSingle(pp, varSelectable)
	ListItem.Bind(":selectable", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMListItem
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	ListItem.Bind(":tag", pp)
	Return Me
End Sub

'set target
Sub SetTarget(varTarget As Object) As VMListItem
	Dim pp As String = $"${ID}Target"$
	vue.SetStateSingle(pp, varTarget)
	ListItem.Bind(":target", pp)
	Return Me
End Sub

'set three-line
Sub SetThreeLine(varThreeLine As Object) As VMListItem
	Dim pp As String = $"${ID}ThreeLine"$
	vue.SetStateSingle(pp, varThreeLine)
	ListItem.Bind(":three-line", pp)
	Return Me
End Sub

'set to
Sub SetTo(varTo As Object) As VMListItem
	Dim pp As String = $"${ID}To"$
	vue.SetStateSingle(pp, varTo)
	ListItem.Bind(":to", pp)
	Return Me
End Sub

'set two-line
Sub SetTwoLine(varTwoLine As Object) As VMListItem
	Dim pp As String = $"${ID}TwoLine"$
	vue.SetStateSingle(pp, varTwoLine)
	ListItem.Bind(":two-line", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMListItem
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	ListItem.Bind(":value", pp)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMListItem
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
Sub SetOnKeydown(methodName As String) As VMListItem
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:keydown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMListItem
	vue.SetStateSingle($"${ID}show"$, False)
	Return Me
End Sub

Sub Show As VMListItem
	vue.SetStateSingle($"${ID}show"$, True)
	Return Me
End Sub

Sub Enable As VMListItem
	vue.SetStateSingle($"${ID}disabled"$, False)
	Return Me
End Sub

Sub Disable As VMListItem
	vue.SetStateSingle($"${ID}disabled"$, True)
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
