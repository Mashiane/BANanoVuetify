B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Banner As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private Actions As VMTemplate
End Sub

'initialize the Banner
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMBanner
	ID = sid.tolowercase
	Banner.Initialize(v, ID)
	Banner.SetTag("v-banner")
	DesignMode = False
	Module = eventHandler
	vue = v
	Actions.Initialize(vue, $"${ID}actions"$, Module).SetSlotActions
	Return Me
End Sub

Sub SetOnClickIcon(methodName As String) As VMBanner
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("@click:icon": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'set two-line
Sub SetTwoLine(varTwoLine As Object) As VMBanner
	Dim pp As String = $"${ID}TwoLine"$
	vue.SetStateSingle(pp, varTwoLine)
	Banner.Bind(":two-line", pp)
	Return Me
End Sub


Sub AddAction(btn As VMButton) As VMBanner
	Actions.AddComponent(btn.ToString)
	Return Me
End Sub

Sub AddComponent(comp As String) As VMBanner
	SetText(comp)
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMBanner
	Banner.SetAttrLoose(loose)
	Return Me
End Sub


Sub SetAttributes(attrs As List) As VMBanner
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	Actions.Pop(Banner)
	Return Banner.ToString
End Sub

Sub SetVModel(k As String) As VMBanner
	Banner.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMBanner
	Banner.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMBanner
	Banner.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMBanner
	Dim childHTML As String = child.ToString
	Banner.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMBanner
	Banner.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMBanner
	Banner.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMBanner
	Banner.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMBanner
	Banner.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set app
Sub SetApp(varApp As Object) As VMBanner
	Dim pp As String = $"${ID}App"$
	vue.SetStateSingle(pp, varApp)
	Banner.Bind(":app", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMBanner
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Banner.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMBanner
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Banner.Bind(":dark", pp)
	Return Me
End Sub

'set evelation
Sub SetEvelation(varEvelation As Object) As VMBanner
	Dim pp As String = $"${ID}Evelation"$
	vue.SetStateSingle(pp, varEvelation)
	Banner.Bind(":evelation", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMBanner
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Banner.Bind(":height", pp)
	Return Me
End Sub

'set icon
Sub SetIcon(varIcon As Object) As VMBanner
	Dim pp As String = $"${ID}Icon"$
	vue.SetStateSingle(pp, varIcon)
	Banner.Bind(":icon", pp)
	Return Me
End Sub

'set icon-color
Sub SetIconColor(varIconColor As Object) As VMBanner
	Dim pp As String = $"${ID}IconColor"$
	vue.SetStateSingle(pp, varIconColor)
	Banner.Bind(":icon-color", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMBanner
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Banner.Bind(":light", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As Object) As VMBanner
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	Banner.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As Object) As VMBanner
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Banner.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As Object) As VMBanner
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	Banner.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As Object) As VMBanner
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	Banner.Bind(":min-width", pp)
	Return Me
End Sub

'set mobile-break-point
Sub SetMobileBreakPoint(varMobileBreakPoint As Object) As VMBanner
	Dim pp As String = $"${ID}MobileBreakPoint"$
	vue.SetStateSingle(pp, varMobileBreakPoint)
	Banner.Bind(":mobile-break-point", pp)
	Return Me
End Sub

'set single-line
Sub SetSingleLine(varSingleLine As Object) As VMBanner
	Dim pp As String = $"${ID}SingleLine"$
	vue.SetStateSingle(pp, varSingleLine)
	Banner.Bind(":single-line", pp)
	Return Me
End Sub

'set sticky
Sub SetSticky(varSticky As Object) As VMBanner
	Dim pp As String = $"${ID}Sticky"$
	vue.SetStateSingle(pp, varSticky)
	Banner.Bind(":sticky", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMBanner
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	Banner.Bind(":tag", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Object) As VMBanner
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	Banner.Bind(":tile", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMBanner
	SetAttrSingle("value", varValue)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMBanner
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	Banner.Bind(":width", pp)
	Return Me
End Sub

'
Sub SetSlotActions(b As Boolean) As VMBanner    'ignore
	SetAttr(CreateMap("slot": "actions"))
	Return Me
End Sub

'
Sub SetSlotIcon(b As Boolean) As VMBanner    'ignore
	SetAttr(CreateMap("slot": "icon"))
	Return Me
End Sub


Sub Hide As VMBanner
	Banner.SetVisible(False)
	Return Me
End Sub

Sub Show As VMBanner
	Banner.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMBanner
	Banner.Enable(True)
	Return Me
End Sub

Sub Disable As VMBanner
	Banner.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMBanner
	Banner.Bind(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMBanner
	Banner.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMBanner
	Banner.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMBanner
	Banner.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMBanner
	Banner.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMBanner
	Banner.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMBanner
	Banner.SetName(varName, bbind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMBanner
	Banner.SetDisabled(b)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMBanner
	Banner.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMBanner
	Banner.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMBanner
Banner.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMBanner
Banner.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMBanner
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMBanner
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub