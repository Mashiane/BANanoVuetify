B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public BottomNavigation As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the BottomNavigation
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMBottomNavigation
	ID = sid.tolowercase
	BottomNavigation.Initialize(v, ID)
	BottomNavigation.SetTag("v-bottom-navigation")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

Sub AddComponent(comp As String) As VMBottomNavigation
	BottomNavigation.SetText(comp)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMBottomNavigation
	BottomNavigation.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMBottomNavigation
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return BottomNavigation.ToString
End Sub

Sub SetVModel(k As String) As VMBottomNavigation
	BottomNavigation.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMBottomNavigation
	BottomNavigation.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMBottomNavigation
	BottomNavigation.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMBottomNavigation
	Dim childHTML As String = child.ToString
	BottomNavigation.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMBottomNavigation
	BottomNavigation.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMBottomNavigation
	BottomNavigation.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMBottomNavigation
	BottomNavigation.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMBottomNavigation
	BottomNavigation.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set absolute
Sub SetAbsolute(varAbsolute As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	BottomNavigation.Bind(":absolute", pp)
	Return Me
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	BottomNavigation.Bind(":active-class", pp)
	Return Me
End Sub

'set app
Sub SetApp(varApp As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}App"$
	vue.SetStateSingle(pp, varApp)
	BottomNavigation.Bind(":app", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	BottomNavigation.Bind(":background-color", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	BottomNavigation.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	BottomNavigation.Bind(":dark", pp)
	Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}Fixed"$
	vue.SetStateSingle(pp, varFixed)
	BottomNavigation.Bind(":fixed", pp)
	Return Me
End Sub

'set grow
Sub SetGrow(varGrow As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}Grow"$
	vue.SetStateSingle(pp, varGrow)
	BottomNavigation.Bind(":grow", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	BottomNavigation.Bind(":height", pp)
	Return Me
End Sub

'set hide-on-scroll
Sub SetHideOnScroll(varHideOnScroll As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}HideOnScroll"$
	vue.SetStateSingle(pp, varHideOnScroll)
	BottomNavigation.Bind(":hide-on-scroll", pp)
	Return Me
End Sub

'set horizontal
Sub SetHorizontal(varHorizontal As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}Horizontal"$
	vue.SetStateSingle(pp, varHorizontal)
	BottomNavigation.Bind(":horizontal", pp)
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}InputValue"$
	vue.SetStateSingle(pp, varInputValue)
	BottomNavigation.Bind(":input-value", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	BottomNavigation.Bind(":light", pp)
	Return Me
End Sub

'set mandatory
Sub SetMandatory(varMandatory As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}Mandatory"$
	vue.SetStateSingle(pp, varMandatory)
	BottomNavigation.Bind(":mandatory", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	BottomNavigation.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	BottomNavigation.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	BottomNavigation.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	BottomNavigation.Bind(":min-width", pp)
	Return Me
End Sub

'set scroll-target
Sub SetScrollTarget(varScrollTarget As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}ScrollTarget"$
	vue.SetStateSingle(pp, varScrollTarget)
	BottomNavigation.Bind(":scroll-target", pp)
	Return Me
End Sub

'set scroll-threshold
Sub SetScrollThreshold(varScrollThreshold As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}ScrollThreshold"$
	vue.SetStateSingle(pp, varScrollThreshold)
	BottomNavigation.Bind(":scroll-threshold", pp)
	Return Me
End Sub

'set shift
Sub SetShift(varShift As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}Shift"$
	vue.SetStateSingle(pp, varShift)
	BottomNavigation.Bind(":shift", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	BottomNavigation.Bind(":value", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMBottomNavigation
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	BottomNavigation.Bind(":width", pp)
	Return Me
End Sub

'selValue
Sub SetOnChange(methodName As String) As VMBottomNavigation
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'selValue
Sub SetOnUpdateInputValue(methodName As String) As VMBottomNavigation
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:input-value": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMBottomNavigation
	BottomNavigation.SetVisible(False)
	Return Me
End Sub

Sub Show As VMBottomNavigation
	BottomNavigation.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMBottomNavigation
	BottomNavigation.Enable(True)
	Return Me
End Sub

Sub Disable As VMBottomNavigation
	BottomNavigation.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMBottomNavigation
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMBottomNavigation
	BottomNavigation.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMBottomNavigation
	BottomNavigation.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMBottomNavigation
	BottomNavigation.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMBottomNavigation
	BottomNavigation.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMBottomNavigation
	BottomNavigation.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMBottomNavigation
	BottomNavigation.SetName(varName, bbind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMBottomNavigation
	BottomNavigation.SetDisabled(b)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMBottomNavigation
	BottomNavigation.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMBottomNavigation
	BottomNavigation.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMBottomNavigation
BottomNavigation.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMBottomNavigation
BottomNavigation.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMBottomNavigation
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMBottomNavigation
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub