B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public AppBar As VMElement
	Public ID As String
	Private vue As BANanoVue
	Public HasContent As Boolean
	Public EndSection As VMElement
	Private module As Object
	Private objects As List
	Private Title As VMElement
	Private Hamburger As VMElement
	Private DesignMode As Boolean
	Public Logo As VMImage
	Private Extension As VMTemplate
	Public Tabs As VMTabs
	Private compx As Int
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMAppBar
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	AppBar.Initialize(vue, ID).SetTag("v-app-bar").SetVModel(ID)
	SetAppBar(True)
	'
	'build the hamburger menu
	Hamburger.Initialize(vue, "menu").SetTag("v-app-bar-nav-icon").SetOnClickStop(Me, "menu_click").SetVShow("menushow")
	Hamburger.Pop(AppBar)
	'
	'add the logo
	SetLogo("")
	SetTitle("")
	AddSpacer
	
	'
	objects.Initialize 
	DesignMode = False
	Extension.Initialize(vue, $"${ID}tmpl"$, module).SetSlotExtension
	Tabs.Initialize(vue, $"${ID}tabls"$, module)
	Tabs.OnToolBar = True
	compx = 0
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMAppBar
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	AppBar.Bind(":color", pp)
	Return Me
End Sub

Sub AddDivider(bVertical As Boolean, mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMAppBar
	compx = compx + 1
	Dim skey As String = $"item${compx}"$
	Dim d As VMDivider
	d.Initialize(vue)
	If bVertical Then d.SetVertical
	d.BuildModel(mprops, mstyles, lclasses, loose)
	AddComponent(skey, d.ToString)
	Return Me
End Sub

Sub AddSubHeading(sText As String, mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMAppBar
	Dim skey As String = $"${ID}subheading"$
	Dim d As VMLabel
	d.Initialize(vue, skey).SetSpan.SetText($"{{ ${skey} }}"$).AddClass("subheading")
	d.BuildModel(mprops, mstyles, lclasses, loose)
	AddComponent(skey, d.ToString)
	vue.SetData(skey, sText)
	Return Me
End Sub

Sub UpdateSubTitle(sText As String) As VMAppBar
	Dim skey As String = $"${ID}subheading"$
	vue.SetData(skey, sText)
	Return Me
End Sub

'add a component to the toolbar
Sub AddComponent(key As String, comp As String) As VMAppBar
	AppBar.SetText(comp)
	objects.Add(key)
	HasContent = True
	Return Me
End Sub

Sub AddButton(btn As VMButton) As VMAppBar
	AddComponent(btn.ID, btn.ToString)
	Return Me
End Sub

'set primary
Sub SetPrimary(b As Boolean) As VMAppBar
	If b = False Then Return Me
	SetColor("primary")
	Return Me
End Sub

Sub AddFAB(btn As VMButton) As VMAppBar
	Extension.SetText(btn.ToString)
	HasContent = True
	Return Me
End Sub

Sub AddTabs(vTabs As VMTabs) As VMAppBar
	Extension.SetText(vTabs.ToString)
	HasContent = True
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMAppBar
	AppBar.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMAppBar
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMAppBar
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

private Sub SetLogo(url As String) As VMAppBar
	Logo.Initialize(vue, $"${ID}logo"$, module)
	Logo.SetVModel("logo", url)
	Logo.SetSize("46", "46")
	Logo.AddClass("ma-2")  'margin all 8px
	Logo.Pop(AppBar)
	Logo.Hide
	Return Me
End Sub

Sub UpdateLogo(URL As String) As VMAppBar
	vue.SetData("logo", URL)
	Logo.Show
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMAppBar
	AppBar.AddClass(c)
	Return Me
End Sub


Sub menu_click(e As BANanoEvent)
	vue.ToggleState("drawer")
	'Drawer.Toggle
	'NavBar.ToggleMenu
End Sub

Sub Hide
	vue.SetStateSingle(ID, False)
End Sub

Sub Show
	vue.SetStateSingle(ID, True)
End Sub

Sub SetVModel(k As String) As VMAppBar
	AppBar.SetVModel(k)
	Return Me
End Sub

Sub AddSpacer As VMAppBar
	AppBar.AddSpacer
	Return Me
End Sub


Sub AddSearch(key As String) As VMAppBar
	Dim txt As VMTextField
	txt.Initialize(vue, key, module).AddClass("mx-4").SetAttributes(Array("flat", "hide-details","solo-inverted"))
	txt.SetLabel("Search").SetPrependInnerIcon("search").AddClass("hidden-sm-and-down").SetClearable(True).SetVModel(key)
	AppBar.SetText(txt.ToString)
	Return Me
End Sub

Sub AddMenu(menu As VMMenu) As VMAppBar
	menu.Pop(AppBar)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMAppBar
	AppBar.SetAttr(attr)
	Return Me
End Sub


Sub SetAppBar(b As Boolean) As VMAppBar
	If b = False Then Return Me
	AppBar.SetAttrSingle("app", True)
	Return Me
End Sub

Sub AddIcon(key As String, iconName As String, toolTip As String, badge As String) As VMAppBar
	key = key.tolowercase
	Dim btn As VMButton
	btn.Initialize(vue, key, module).SetIconButton(iconName).SetTooltip(toolTip)
	btn.Pop(AppBar)
	objects.Add(key)
	Return Me
End Sub

Sub SetModeFixed(b As Boolean) As VMAppBar
	AppBar.SetAttrSingle("fixed", b)
	Return Me
End Sub

private Sub SetTitle(tt As String) As VMAppBar
	Dim pp As String = $"${ID}title"$
	vue.SetStateSingle(pp, tt)
	
	Dim page_title As String = $"{{ ${pp} }}"$
	Title.Initialize(vue, "appbartitle").SetTag("v-toolbar-title").SetText(page_title)
	Title.Pop(AppBar)
	Return Me
End Sub

Sub UpdateTitle(tt As String) As VMAppBar
	Dim pp As String = $"${ID}title"$
	vue.SetStateSingle(pp, tt)
	Return Me
End Sub

'has menu button to show drawer
Sub SetHasMenuButton(b As Boolean) As VMAppBar
	vue.SetStateSingle("menushow", b)
	Return Me
End Sub

'add to parent element
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub ToString As String
	If Tabs.hascontent Then AddTabs(Tabs)
	If Extension.HasContent Then Extension.pop(AppBar)
	Return AppBar.tostring
End Sub

Sub HideItems
	For Each item As String In objects
		AppBar.HideItem(item)
	Next
End Sub

Sub ShowItems
	For Each item As String In objects
		AppBar.ShowItem(item)
	Next
End Sub

'set absolute
Sub SetAbsolute(varAbsolute As Object) As VMAppBar
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	AppBar.Bind(":absolute", pp)
	Return Me
End Sub

'set bottom
Sub SetBottom(varBottom As Object) As VMAppBar
	Dim pp As String = $"${ID}Bottom"$
	vue.SetStateSingle(pp, varBottom)
	AppBar.Bind(":bottom", pp)
	Return Me
End Sub

'set clipped-left
Sub SetClippedLeft(varClippedLeft As Object) As VMAppBar
	Dim pp As String = $"${ID}ClippedLeft"$
	vue.SetStateSingle(pp, varClippedLeft)
	AppBar.Bind(":clipped-left", pp)
	Return Me
End Sub


'the stepLabelVModel is the vmodel to have the caption
Sub AddTab(tabID As String, tabLabel As String, tabIcon As String, tabContent As VMContainer)
	Tabs.AddTab(tabID, tabLabel, tabIcon, tabContent)
End Sub

'set clipped-right
Sub SetClippedRight(varClippedRight As Object) As VMAppBar
	Dim pp As String = $"${ID}ClippedRight"$
	vue.SetStateSingle(pp, varClippedRight)
	AppBar.Bind(":clipped-right", pp)
	Return Me
End Sub

'set collapse
Sub SetCollapse(varCollapse As Object) As VMAppBar
	Dim pp As String = $"${ID}Collapse"$
	vue.SetStateSingle(pp, varCollapse)
	AppBar.Bind(":collapse", pp)
	Return Me
End Sub

'set collapse-on-scroll
Sub SetCollapseOnScroll(varCollapseOnScroll As Object) As VMAppBar
	Dim pp As String = $"${ID}CollapseOnScroll"$
	vue.SetStateSingle(pp, varCollapseOnScroll)
	AppBar.Bind(":collapse-on-scroll", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMAppBar
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	AppBar.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMAppBar
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	AppBar.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMAppBar
Dim pp As String = $"${ID}Dense"$
vue.SetStateSingle(pp, varDense)
AppBar.Bind(":dense", pp)
Return Me
End Sub

'set elevate-on-scroll
Sub SetElevateOnScroll(varElevateOnScroll As Object) As VMAppBar
Dim pp As String = $"${ID}ElevateOnScroll"$
vue.SetStateSingle(pp, varElevateOnScroll)
AppBar.Bind(":elevate-on-scroll", pp)
Return Me
End Sub

'set elevation
Sub SetElevation(varElevation As Object) As VMAppBar
Dim pp As String = $"${ID}Elevation"$
vue.SetStateSingle(pp, varElevation)
AppBar.Bind(":elevation", pp)
Return Me
End Sub

'set extended
Sub SetExtended(varExtended As Object) As VMAppBar
Dim pp As String = $"${ID}Extended"$
vue.SetStateSingle(pp, varExtended)
AppBar.Bind(":extended", pp)
Return Me
End Sub

'set extension-height
Sub SetExtensionHeight(varExtensionHeight As Object) As VMAppBar
Dim pp As String = $"${ID}ExtensionHeight"$
vue.SetStateSingle(pp, varExtensionHeight)
AppBar.Bind(":extension-height", pp)
Return Me
End Sub

'set fade-img-on-scroll
Sub SetFadeImgOnScroll(varFadeImgOnScroll As Object) As VMAppBar
Dim pp As String = $"${ID}FadeImgOnScroll"$
vue.SetStateSingle(pp, varFadeImgOnScroll)
AppBar.Bind(":fade-img-on-scroll", pp)
Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Object) As VMAppBar
Dim pp As String = $"${ID}Fixed"$
vue.SetStateSingle(pp, varFixed)
AppBar.Bind(":fixed", pp)
Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Object) As VMAppBar
Dim pp As String = $"${ID}Flat"$
vue.SetStateSingle(pp, varFlat)
AppBar.Bind(":flat", pp)
Return Me
End Sub

'set floating
Sub SetFloating(varFloating As Object) As VMAppBar
Dim pp As String = $"${ID}Floating"$
vue.SetStateSingle(pp, varFloating)
AppBar.Bind(":floating", pp)
Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMAppBar
Dim pp As String = $"${ID}Height"$
vue.SetStateSingle(pp, varHeight)
AppBar.Bind(":height", pp)
Return Me
End Sub

'set hide-on-scroll
Sub SetHideOnScroll(varHideOnScroll As Object) As VMAppBar
Dim pp As String = $"${ID}HideOnScroll"$
vue.SetStateSingle(pp, varHideOnScroll)
AppBar.Bind(":hide-on-scroll", pp)
Return Me
End Sub

'set inverted-scroll
Sub SetInvertedScroll(varInvertedScroll As Object) As VMAppBar
Dim pp As String = $"${ID}InvertedScroll"$
vue.SetStateSingle(pp, varInvertedScroll)
AppBar.Bind(":inverted-scroll", pp)
Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMAppBar
Dim pp As String = $"${ID}Light"$
vue.SetStateSingle(pp, varLight)
AppBar.Bind(":light", pp)
Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As Object) As VMAppBar
Dim pp As String = $"${ID}MaxHeight"$
vue.SetStateSingle(pp, varMaxHeight)
AppBar.Bind(":max-height", pp)
Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As Object) As VMAppBar
Dim pp As String = $"${ID}MaxWidth"$
vue.SetStateSingle(pp, varMaxWidth)
AppBar.Bind(":max-width", pp)
Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As Object) As VMAppBar
Dim pp As String = $"${ID}MinHeight"$
vue.SetStateSingle(pp, varMinHeight)
AppBar.Bind(":min-height", pp)
Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As Object) As VMAppBar
Dim pp As String = $"${ID}MinWidth"$
vue.SetStateSingle(pp, varMinWidth)
AppBar.Bind(":min-width", pp)
Return Me
End Sub

'set prominent
Sub SetProminent(varProminent As Object) As VMAppBar
Dim pp As String = $"${ID}Prominent"$
vue.SetStateSingle(pp, varProminent)
AppBar.Bind(":prominent", pp)
Return Me
End Sub

'set scroll-off-screen
Sub SetScrollOffScreen(varScrollOffScreen As Object) As VMAppBar
Dim pp As String = $"${ID}ScrollOffScreen"$
vue.SetStateSingle(pp, varScrollOffScreen)
AppBar.Bind(":scroll-off-screen", pp)
Return Me
End Sub

'set scroll-target
Sub SetScrollTarget(varScrollTarget As Object) As VMAppBar
Dim pp As String = $"${ID}ScrollTarget"$
vue.SetStateSingle(pp, varScrollTarget)
AppBar.Bind(":scroll-target", pp)
Return Me
End Sub

'set scroll-threshold
Sub SetScrollThreshold(varScrollThreshold As Object) As VMAppBar
Dim pp As String = $"${ID}ScrollThreshold"$
vue.SetStateSingle(pp, varScrollThreshold)
AppBar.Bind(":scroll-threshold", pp)
Return Me
End Sub

'set short
Sub SetShort(varShort As Object) As VMAppBar
Dim pp As String = $"${ID}Short"$
vue.SetStateSingle(pp, varShort)
AppBar.Bind(":short", pp)
Return Me
End Sub

'set shrink-on-scroll
Sub SetShrinkOnScroll(varShrinkOnScroll As Object) As VMAppBar
Dim pp As String = $"${ID}ShrinkOnScroll"$
vue.SetStateSingle(pp, varShrinkOnScroll)
AppBar.Bind(":shrink-on-scroll", pp)
Return Me
End Sub

'set src
Sub SetSrc(varSrc As Object) As VMAppBar
Dim pp As String = $"${ID}Src"$
vue.SetStateSingle(pp, varSrc)
AppBar.Bind(":src", pp)
Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMAppBar
Dim pp As String = $"${ID}Tag"$
vue.SetStateSingle(pp, varTag)
AppBar.Bind(":tag", pp)
Return Me
End Sub

'set tile
Sub SetTile(varTile As Object) As VMAppBar
Dim pp As String = $"${ID}Tile"$
vue.SetStateSingle(pp, varTile)
AppBar.Bind(":tile", pp)
Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMAppBar
	SetAttrSingle("value", varValue)
Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMAppBar
Dim pp As String = $"${ID}Width"$
vue.SetStateSingle(pp, varWidth)
AppBar.Bind(":width", pp)
Return Me
End Sub

'
Sub SetSlotExtension(b As Boolean) As VMAppBar    'ignore
SetAttr(CreateMap("slot": "extension"))
Return Me
End Sub

'
Sub SetSlotImg(b As Boolean) As VMAppBar    'ignore
SetAttr(CreateMap("slot": "img"))
Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMAppBar
	appbar.Bind(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMAppBar
	AppBar.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMAppBar
	AppBar.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMAppBar
	AppBar.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMAppBar
	AppBar.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMAppBar
	AppBar.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMAppBar
	AppBar.SetName(varName, bbind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMAppBar
	AppBar.SetDisabled(b)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMAppBar
	AppBar.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMAppBar
	AppBar.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMAppBar
AppBar.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMAppBar
AppBar.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMAppBar
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMAppBar
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub