B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItemSubTitle As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the ListItemSubTitle
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMListItemSubTitle
	ID = sid.tolowercase
	ListItemSubTitle.Initialize(v, ID)
	ListItemSubTitle.SetTag("v-list-item-subtitle")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMListItemSubTitle
	ListItemSubTitle.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMListItemSubTitle
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	
	
	
	Return ListItemSubTitle.ToString
End Sub

Sub SetVModel(k As String) As VMListItemSubTitle
	ListItemSubTitle.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMListItemSubTitle
	ListItemSubTitle.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMListItemSubTitle
	ListItemSubTitle.SetVShow(vif)
	Return Me
End Sub


Sub SetVText(vhtml As String) As VMListItemSubTitle
	ListItemSubTitle.SetVText(vhtml)
	Return Me
End Sub


Sub SetVhtml(vhtml As String) As VMListItemSubTitle
	ListItemSubTitle.SetVHtml(vhtml)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMListItemSubTitle
	Dim childHTML As String = child.ToString
	ListItemSubTitle.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMListItemSubTitle
	ListItemSubTitle.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMListItemSubTitle
	ListItemSubTitle.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItemSubTitle
	ListItemSubTitle.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMListItemSubTitle
	ListItemSubTitle.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	ListItemSubTitle.Bind(":active-class", pp)
	Return Me
End Sub

'set append
Sub SetAppend(varAppend As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Append"$
	vue.SetStateSingle(pp, varAppend)
	ListItemSubTitle.Bind(":append", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ListItemSubTitle.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ListItemSubTitle.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	ListItemSubTitle.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMListItemSubTitle
	ListItemSubTitle.SetDisabled(varDisabled)
	Return Me
End Sub

'set exact
Sub SetExact(varExact As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Exact"$
	vue.SetStateSingle(pp, varExact)
	ListItemSubTitle.Bind(":exact", pp)
	Return Me
End Sub

'set exact-active-class
Sub SetExactActiveClass(varExactActiveClass As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}ExactActiveClass"$
	vue.SetStateSingle(pp, varExactActiveClass)
	ListItemSubTitle.Bind(":exact-active-class", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Href"$
	vue.SetStateSingle(pp, varHref)
	ListItemSubTitle.Bind(":href", pp)
	Return Me
End Sub

'set inactive
Sub SetInactive(varInactive As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Inactive"$
	vue.SetStateSingle(pp, varInactive)
	ListItemSubTitle.Bind(":inactive", pp)
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}InputValue"$
	vue.SetStateSingle(pp, varInputValue)
	ListItemSubTitle.Bind(":input-value", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ListItemSubTitle.Bind(":light", pp)
	Return Me
End Sub

'set link
Sub SetLink(varLink As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Link"$
	vue.SetStateSingle(pp, varLink)
	ListItemSubTitle.Bind(":link", pp)
	Return Me
End Sub

'set nuxt
Sub SetNuxt(varNuxt As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Nuxt"$
	vue.SetStateSingle(pp, varNuxt)
	ListItemSubTitle.Bind(":nuxt", pp)
	Return Me
End Sub

'set replace
Sub SetReplace(varReplace As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Replace"$
	vue.SetStateSingle(pp, varReplace)
	ListItemSubTitle.Bind(":replace", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	ListItemSubTitle.Bind(":ripple", pp)
	Return Me
End Sub

'set selectable
Sub SetSelectable(varSelectable As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Selectable"$
	vue.SetStateSingle(pp, varSelectable)
	ListItemSubTitle.Bind(":selectable", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	ListItemSubTitle.Bind(":tag", pp)
	Return Me
End Sub

'set target
Sub SetTarget(varTarget As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Target"$
	vue.SetStateSingle(pp, varTarget)
	ListItemSubTitle.Bind(":target", pp)
	Return Me
End Sub

'set three-line
Sub SetThreeLine(varThreeLine As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}ThreeLine"$
	vue.SetStateSingle(pp, varThreeLine)
	ListItemSubTitle.Bind(":three-line", pp)
	Return Me
End Sub

'set to
Sub SetTo(varTo As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}To"$
	vue.SetStateSingle(pp, varTo)
	ListItemSubTitle.Bind(":to", pp)
	Return Me
End Sub

'set two-line
Sub SetTwoLine(varTwoLine As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}TwoLine"$
	vue.SetStateSingle(pp, varTwoLine)
	ListItemSubTitle.Bind(":two-line", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMListItemSubTitle
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	ListItemSubTitle.Bind(":value", pp)
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMListItemSubTitle
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
Sub SetOnKeydown(methodName As String) As VMListItemSubTitle
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:keydown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMListItemSubTitle
	ListItemSubTitle.SetVisible(False)
	Return Me
End Sub

Sub Show As VMListItemSubTitle
	ListItemSubTitle.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMListItemSubTitle
	ListItemSubTitle.Enable(True)
	Return Me
End Sub

Sub Disable As VMListItemSubTitle
	ListItemSubTitle.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMListItemSubTitle
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMListItemSubTitle
	ListItemSubTitle.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMListItemSubTitle
	ListItemSubTitle.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMListItemSubTitle
	ListItemSubTitle.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMListItemSubTitle
	ListItemSubTitle.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMListItemSubTitle
	ListItemSubTitle.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMListItemSubTitle
	ListItemSubTitle.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMListItemSubTitle
	ListItemSubTitle.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMListItemSubTitle
	ListItemSubTitle.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMListItemSubTitle
ListItemSubTitle.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub