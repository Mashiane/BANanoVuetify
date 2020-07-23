B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public BottomNavigation As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public HasContent As Boolean
	Private bStatic As Boolean
End Sub

'initialize the BottomNavigation
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMBottomNavigation
	ID = sid.tolowercase
	BottomNavigation.Initialize(v, ID)
	BottomNavigation.SetTag("v-bottom-navigation")
	DesignMode = False
	Module = eventHandler
	vue = v
	BottomNavigation.typeOf = "nav"
	HasContent = False
	bStatic = False
	SetOnChange(Module, $"${ID}_change"$)
	SetOnUpdateInputValue($"${ID}_updateinputvalue"$)
	SetVModel($"${ID}bn"$)
	Return Me
End Sub

Sub SetActive(btnID As String) As VMBottomNavigation
	vue.SetData($"${ID}bn"$, btnID)
	Return Me
End Sub

Sub AddButton(btnID As String, btnText As String, btnIcon As String, btnColor As String, btnValue As String, btnToolTip As String, btnBadge As String)
	Dim btn As VMButton
	btn.Initialize(vue, btnID, Module)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetColor(btnColor)
	btn.SetSpan(btnText)
	btn.AddIcon(btnIcon, "", "")
	btn.SetTooltip(btnToolTip)
	btn.SetAttrSingle("value", btnValue)
	If btnBadge <> "" Then
		btn.SetHasBadge(True)
		btn.SetBadge(btnBadge)
	End If
	HasContent = True
	AddComponent(btn.ToString)
End Sub

Sub SetStatic(b As Boolean) As VMBottomNavigation
	bStatic = b
	BottomNavigation.SetStatic(b)
	Return Me
End Sub

Sub AddComponent(comp As String) As VMBottomNavigation
	BottomNavigation.SetText(comp)
	HasContent = True
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

Sub SetVIf(vif As String) As VMBottomNavigation
	BottomNavigation.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMBottomNavigation
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
	HasContent = True
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
Sub SetAbsolute(varAbsolute As Boolean) As VMBottomNavigation
	If varAbsolute = False Then Return Me
	If bStatic Then
		SetAttrSingle("absolute", varAbsolute)
		Return Me
	End If
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	BottomNavigation.Bind(":absolute", pp)
	Return Me
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMBottomNavigation
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	BottomNavigation.Bind(":active-class", pp)
	Return Me
End Sub

'set app
Sub SetApp(varApp As Boolean) As VMBottomNavigation
	If varApp = False Then Return Me
	BottomNavigation.SetAttrLoose("app")
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As String) As VMBottomNavigation
	If varBackgroundColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("background-color", varBackgroundColor)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	BottomNavigation.Bind(":background-color", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMBottomNavigation
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	BottomNavigation.Bind(":color", pp)
	Return Me
End Sub

'set color intensity
Sub SetBackgroundColorIntensity(color As String, intensity As String) As VMBottomNavigation
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("background-color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}backgroundcolor"$
	vue.SetStateSingle(pp, scolor)
	Bind(":background-color", pp)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMBottomNavigation
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMBottomNavigation
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	BottomNavigation.Bind(":dark", pp)
	Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Boolean) As VMBottomNavigation
	If varFixed = False Then Return Me
	If bStatic Then
		SetAttrSingle("fixed", varFixed)
		Return Me
	End If
	Dim pp As String = $"${ID}Fixed"$
	vue.SetStateSingle(pp, varFixed)
	BottomNavigation.Bind(":fixed", pp)
	Return Me
End Sub

'set grow
Sub SetGrow(varGrow As Boolean) As VMBottomNavigation
	If varGrow = False Then Return Me
	If bStatic Then
		SetAttrSingle("grow", varGrow)
		Return Me
	End If
	Dim pp As String = $"${ID}Grow"$
	vue.SetStateSingle(pp, varGrow)
	BottomNavigation.Bind(":grow", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMBottomNavigation
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	BottomNavigation.Bind(":height", pp)
	Return Me
End Sub

'set hide-on-scroll
Sub SetHideOnScroll(varHideOnScroll As Boolean) As VMBottomNavigation
	If varHideOnScroll = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-on-scroll", varHideOnScroll)
		Return Me
	End If
	Dim pp As String = $"${ID}HideOnScroll"$
	vue.SetStateSingle(pp, varHideOnScroll)
	BottomNavigation.Bind(":hide-on-scroll", pp)
	Return Me
End Sub

'set horizontal
Sub SetHorizontal(varHorizontal As Boolean) As VMBottomNavigation
	If varHorizontal = False Then Return Me
	If bStatic Then
		SetAttrSingle("horizontal", varHorizontal)
		Return Me
	End If
	Dim pp As String = $"${ID}Horizontal"$
	vue.SetStateSingle(pp, varHorizontal)
	BottomNavigation.Bind(":horizontal", pp)
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As Boolean) As VMBottomNavigation
	If varInputValue = True Then Return Me
	If bStatic Then
		SetAttrSingle("input-value.sync", varInputValue)
		Return Me
	End If
	Dim pp As String = $"${ID}InputValue"$
	vue.SetStateSingle(pp, varInputValue)
	BottomNavigation.Bind(":input-value.sync", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMBottomNavigation
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	BottomNavigation.Bind(":light", pp)
	Return Me
End Sub

'set mandatory
Sub SetMandatory(varMandatory As Boolean) As VMBottomNavigation
	If varMandatory = False Then Return Me
	If bStatic Then
		SetAttrSingle("mandatory", varMandatory)
		Return Me
	End If
	Dim pp As String = $"${ID}Mandatory"$
	vue.SetStateSingle(pp, varMandatory)
	BottomNavigation.Bind(":mandatory", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As String) As VMBottomNavigation
	If varMaxHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-height", varMaxHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	BottomNavigation.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As String) As VMBottomNavigation
	If varMaxWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-width", varMaxWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	BottomNavigation.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As String) As VMBottomNavigation
	If varMinHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-height", varMinHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	BottomNavigation.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As String) As VMBottomNavigation
	If varMinWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-width", varMinWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	BottomNavigation.Bind(":min-width", pp)
	Return Me
End Sub

'set scroll-target
Sub SetScrollTarget(varScrollTarget As String) As VMBottomNavigation
	If varScrollTarget = "" Then Return Me
	If bStatic Then
		SetAttrSingle("scroll-target", varScrollTarget)
		Return Me
	End If
	Dim pp As String = $"${ID}ScrollTarget"$
	vue.SetStateSingle(pp, varScrollTarget)
	BottomNavigation.Bind(":scroll-target", pp)
	Return Me
End Sub

'set scroll-threshold
Sub SetScrollThreshold(varScrollThreshold As String) As VMBottomNavigation
	If varScrollThreshold = "" Then Return Me
	If bStatic Then
		SetAttrSingle("scroll-threshold", varScrollThreshold)
		Return Me
	End If
	Dim pp As String = $"${ID}ScrollThreshold"$
	vue.SetStateSingle(pp, varScrollThreshold)
	BottomNavigation.Bind(":scroll-threshold", pp)
	Return Me
End Sub

'set shift
Sub SetShift(varShift As Boolean) As VMBottomNavigation
	If varShift = "" Then Return Me
	If bStatic Then
		SetAttrSingle("shift", varShift)
		Return Me
	End If
	Dim pp As String = $"${ID}Shift"$
	vue.SetStateSingle(pp, varShift)
	BottomNavigation.Bind(":shift", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMBottomNavigation
	BottomNavigation.SetValue(varValue,False)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As String) As VMBottomNavigation
	If varWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("width", varWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	BottomNavigation.Bind(":width", pp)
	Return Me
End Sub

'selValue
Sub SetOnChange(eventHandler As Object,methodName As String) As VMBottomNavigation
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("@change": methodName))
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
	SetAttr(CreateMap("@update:input-value": methodName))
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
