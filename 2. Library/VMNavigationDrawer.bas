B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public NavigationDrawer As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public List As VMList
	Public BottomSection As VMTemplate
	Private mini As String
	Public Container As VMContainer
End Sub

'initialize the NavigationDrawer
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMNavigationDrawer
	ID = sid.tolowercase
	NavigationDrawer.Initialize(v, ID)
	NavigationDrawer.SetTag("v-navigation-drawer").SetAttrSingle("app", True).SetVModel(ID)
	DesignMode = False
	Module = eventHandler
	vue = v
	List.Initialize(vue, $"${ID}items"$, Module) 
	BottomSection.Initialize(vue, $"${ID}bottom"$, Module).SetSlotAppend
	mini = $"${ID}mini"$
	SetMiniVariant(False)
	SetPermanent(False)
	Container.Initialize(vue, $"${ID}cont"$, Module)
	Hide
	Return Me
End Sub

Sub AddComponent(comp As String) As VMNavigationDrawer
	SetText(comp)
	Return Me
End Sub

Sub SetMini(b As Boolean) As VMNavigationDrawer
	SetMiniVariant(b)
	SetPermanent(b)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMNavigationDrawer
	NavigationDrawer.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMNavigationDrawer
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub AddDivider As VMNavigationDrawer
	Dim strLine As String = $"<v-divider></v-divider>"$
	SetText(strLine)
	Return Me
End Sub

'add title subtitle
Sub AddTitleSubTitle(title As String, subtitle As String) As VMNavigationDrawer
	Dim vli As VMListItem
	vli.Initialize(vue, $"${ID}app"$, Module)
	'
	Dim lic As VMListItemContent
	lic.Initialize(vue,"", Module)
	Dim lit As VMListItemTitle
	lit.Initialize(vue, "", Module).SetText(title).AddClass("title")
	Dim listt As VMListItemSubTitle
	listt.Initialize(vue, "", Module).SetText(subtitle)
	
	lit.Pop(lic.ListItemContent)
	listt.Pop(lic.ListItemContent)
	
	lic.Pop(vli.ListItem)
	vli.Pop(NavigationDrawer)
	Return Me
End Sub

Sub AddOnBottomSection(html As String) As VMNavigationDrawer
	BottomSection.SetText(html)
	Return Me
End Sub

Sub AddList(lst As VMList) As VMNavigationDrawer
	SetText(lst.ToString)
	Return Me
End Sub

Sub AddItem(key As String, iconName As String, title As String) As VMNavigationDrawer
	List.AddItem(key, "", iconName, title, "", "")
	Return Me
End Sub

Sub AddSubItem(parent As String, key As String, iconName As String, title As String) As VMNavigationDrawer
	List.AddSubItem(parent, key, "", iconName, title, "")
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMNavigationDrawer
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMNavigationDrawer
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	NavigationDrawer.Bind(":color", pp)
	Return Me
End Sub

'get component
Sub ToString As String
	vue.SetStateSingle("item", 1)
	SetText(Container.ToString)
	If List.HasContent Then 
		List.Pop(NavigationDrawer)
	End If
	If BottomSection.HasContent Then BottomSection.Pop(NavigationDrawer)
	Return NavigationDrawer.ToString
End Sub

Sub SetVModel(k As String) As VMNavigationDrawer
	NavigationDrawer.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMNavigationDrawer
	NavigationDrawer.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMNavigationDrawer
	NavigationDrawer.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMNavigationDrawer
	Dim childHTML As String = child.ToString
	NavigationDrawer.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMNavigationDrawer
	NavigationDrawer.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMNavigationDrawer
	NavigationDrawer.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMNavigationDrawer
	NavigationDrawer.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMNavigationDrawer
	NavigationDrawer.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set absolute
Sub SetAbsolute(varAbsolute As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	NavigationDrawer.Bind(":absolute", pp)
	Return Me
End Sub

'set app
Sub SetApp(varApp As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}App"$
	vue.SetStateSingle(pp, varApp)
	NavigationDrawer.Bind(":app", pp)
	Return Me
End Sub

'set bottom
Sub SetBottom(varBottom As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Bottom"$
	vue.SetStateSingle(pp, varBottom)
	NavigationDrawer.Bind(":bottom", pp)
	Return Me
End Sub

'set clipped
Sub SetClipped(varClipped As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Clipped"$
	vue.SetStateSingle(pp, varClipped)
	NavigationDrawer.Bind(":clipped", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	NavigationDrawer.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	NavigationDrawer.Bind(":dark", pp)
	Return Me
End Sub

'set disable-resize-watcher
Sub SetDisableResizeWatcher(varDisableResizeWatcher As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}DisableResizeWatcher"$
	vue.SetStateSingle(pp, varDisableResizeWatcher)
	NavigationDrawer.Bind(":disable-resize-watcher", pp)
	Return Me
End Sub

'set disable-route-watcher
Sub SetDisableRouteWatcher(varDisableRouteWatcher As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}DisableRouteWatcher"$
	vue.SetStateSingle(pp, varDisableRouteWatcher)
	NavigationDrawer.Bind(":disable-route-watcher", pp)
	Return Me
End Sub

'set expand-on-hover
Sub SetExpandOnHover(varExpandOnHover As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}ExpandOnHover"$
	vue.SetStateSingle(pp, varExpandOnHover)
	NavigationDrawer.Bind(":expand-on-hover", pp)
	Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Fixed"$
	vue.SetStateSingle(pp, varFixed)
	NavigationDrawer.Bind(":fixed", pp)
	Return Me
End Sub

'set floating
Sub SetFloating(varFloating As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Floating"$
	vue.SetStateSingle(pp, varFloating)
	NavigationDrawer.Bind(":floating", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	NavigationDrawer.Bind(":height", pp)
	Return Me
End Sub

'set hide-overlay
Sub SetHideOverlay(varHideOverlay As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}HideOverlay"$
	vue.SetStateSingle(pp, varHideOverlay)
	NavigationDrawer.Bind(":hide-overlay", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	NavigationDrawer.Bind(":light", pp)
	Return Me
End Sub

'set mini-variant
Sub SetMiniVariant(b As Boolean) As VMNavigationDrawer
	vue.SetData(mini, b)
	NavigationDrawer.Bind(":mini-variant.sync", mini)
	Return Me
End Sub

'set mini-variant-width
Sub SetMiniVariantWidth(varMiniVariantWidth As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}MiniVariantWidth"$
	vue.SetStateSingle(pp, varMiniVariantWidth)
	NavigationDrawer.Bind(":mini-variant-width", pp)
	Return Me
End Sub

'set mobile-break-point
Sub SetMobileBreakPoint(varMobileBreakPoint As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}MobileBreakPoint"$
	vue.SetStateSingle(pp, varMobileBreakPoint)
	NavigationDrawer.Bind(":mobile-break-point", pp)
	Return Me
End Sub

'set overlay-color
Sub SetOverlayColor(varOverlayColor As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}OverlayColor"$
	vue.SetStateSingle(pp, varOverlayColor)
	NavigationDrawer.Bind(":overlay-color", pp)
	Return Me
End Sub

'set overlay-opacity
Sub SetOverlayOpacity(varOverlayOpacity As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}OverlayOpacity"$
	vue.SetStateSingle(pp, varOverlayOpacity)
	NavigationDrawer.Bind(":overlay-opacity", pp)
	Return Me
End Sub

'set permanent
Sub SetPermanent(varPermanent As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Permanent"$
	vue.SetStateSingle(pp, varPermanent)
	NavigationDrawer.Bind(":permanent", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Right"$
	vue.SetStateSingle(pp, varRight)
	NavigationDrawer.Bind(":right", pp)
	Return Me
End Sub

'set src
Sub SetSrc(varSrc As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Src"$
	vue.SetStateSingle(pp, varSrc)
	NavigationDrawer.Bind(":src", pp)
	Return Me
End Sub

'set stateless
Sub SetStateless(varStateless As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Stateless"$
	vue.SetStateSingle(pp, varStateless)
	NavigationDrawer.Bind(":stateless", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	NavigationDrawer.Bind(":tag", pp)
	Return Me
End Sub

'set temporary
Sub SetTemporary(varTemporary As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Temporary"$
	vue.SetStateSingle(pp, varTemporary)
	NavigationDrawer.Bind(":temporary", pp)
	Return Me
End Sub

'set touchless
Sub SetTouchless(varTouchless As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Touchless"$
	vue.SetStateSingle(pp, varTouchless)
	NavigationDrawer.Bind(":touchless", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMNavigationDrawer
	SetAttrSingle("value", varValue)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMNavigationDrawer
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	NavigationDrawer.Bind(":width", pp)
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMNavigationDrawer    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotImg(b As Boolean) As VMNavigationDrawer    'ignore
	SetAttr(CreateMap("slot": "img"))
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMNavigationDrawer
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnTransitionend(methodName As String) As VMNavigationDrawer
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:transitionend": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateMiniVariant(methodName As String) As VMNavigationDrawer
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:mini-variant": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMNavigationDrawer
	vue.SetStateSingle(ID, False)
	Return Me
End Sub

Sub Show As VMNavigationDrawer
	vue.SetStateSingle(ID, True)
	Return Me
End Sub

Sub Enable As VMNavigationDrawer
	NavigationDrawer.Enable(True)
	Return Me
End Sub

Sub Disable As VMNavigationDrawer
	NavigationDrawer.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMNavigationDrawer
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMNavigationDrawer
	NavigationDrawer.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMNavigationDrawer
	NavigationDrawer.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMNavigationDrawer
	NavigationDrawer.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMNavigationDrawer
	NavigationDrawer.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMNavigationDrawer
	NavigationDrawer.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMNavigationDrawer
	NavigationDrawer.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMNavigationDrawer
	NavigationDrawer.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMNavigationDrawer
	NavigationDrawer.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMNavigationDrawer
NavigationDrawer.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMNavigationDrawer
NavigationDrawer.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMNavigationDrawer
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMNavigationDrawer
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub