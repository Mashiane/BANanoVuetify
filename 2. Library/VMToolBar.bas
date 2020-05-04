B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ToolBar As VMElement
	Public ID As String
	Private vue As BANanoVue
	Public HasContent As Boolean
	Public EndSection As VMElement
	Private module As Object
	Private objects As List
	Public Title As VMElement
	Public Hamburger As VMElement
	Private DesignMode As Boolean
	Public Logo As VMImage
	Private Extension As VMTemplate
	Public Tabs As VMTabs
	Private compx As Int
	Private bStatic As Boolean
	Private tTitle As String
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMToolBar
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	ToolBar.Initialize(vue, ID).SetVModel(ID)
	'
	'build the hamburger menu
	Hamburger.Initialize(vue, "menu").SetTag("v-app-bar-nav-icon").SetOnClickStop(Me, "menu_click")
	objects.Initialize 
	DesignMode = False
	Extension.Initialize(vue, $"${ID}tmpl"$, module).SetSlotExtension
	Tabs.Initialize(vue, $"${ID}tabls"$, module)
	Tabs.OnToolBar = True
	'
	tTitle = $"${ID}title"$
	Title.Initialize(vue, "appbartitle").SetTag("v-toolbar-title")
	'
	Logo.Initialize(vue, $"${ID}logo"$, module).SetSize("46", "46").AddClass("mx-2").AddClass("my-1").BindStyleSingle("opacity", "1")
	
	compx = 0
	bStatic = False
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMToolBar
	bStatic = b
	ToolBar.SetStatic(b)
	Hamburger.setstatic(b)
	Extension.setstatic(b)
	Tabs.SetStatic(b)
	Logo.SetStatic(b)
	Return Me
End Sub

'set this toolbar an an app toolbar
Sub SetAppBar(b As Boolean) As VMToolBar
	If b = False Then Return Me
	ToolBar.SetAttrSingle("app", True)
	ToolBar.SetTag("v-app-bar")
	Return Me
End Sub

Sub SetToolBar(b As Boolean) As VMToolBar
	If b = False Then Return Me
	ToolBar.SetTag("v-toolbar")
	Return Me
End Sub

Sub SetSystemBar(b As Boolean) As VMToolBar
	If b = False Then Return Me
	ToolBar.SetTag("v-system-bar")
	Return Me
End Sub

'add a hamburger menu
Sub AddHamburger As VMToolBar
	Hamburger.SetVisible(True)
	Hamburger.Pop(ToolBar)
	HasContent = True
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMToolBar
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	ToolBar.Bind(":color", pp)
	Return Me
End Sub

Sub AddDivider(bVertical As Boolean, mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMToolBar
	compx = compx + 1
	Dim skey As String = $"item${compx}"$
	Dim d As VMDivider
	d.Initialize(vue).SetDesignMode(DesignMode)
	If bVertical Then d.SetVertical
	d.BuildModel(mprops, mstyles, lclasses, loose)
	AddComponent(skey, d.ToString)
	HasContent = True
	Return Me
End Sub

Sub AddSubHeading(sText As String, mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMToolBar
	Dim skey As String = $"${ID}subheading"$
	Dim d As VMLabel
	d.Initialize(vue, skey)
	d.SetStatic(bStatic)
	d.SetDesignMode(DesignMode)
	If bStatic Then
		d.SetSpan.SetText(sText)
	Else	
		d.SetSpan.SetText($"{{ ${skey} }}"$)
	End If
	d.AddClass("subheading")
	d.BuildModel(mprops, mstyles, lclasses, loose)
	AddComponent(skey, d.ToString)
	vue.SetData(skey, sText)
	HasContent = True
	Return Me
End Sub

Sub UpdateSubTitle(sText As String) As VMToolBar
	Dim skey As String = $"${ID}subheading"$
	vue.SetData(skey, sText)
	HasContent = True
	Return Me
End Sub

'add a component to the toolbar
Sub AddComponent(key As String, comp As String) As VMToolBar
	ToolBar.SetText(comp)
	objects.Add(key)
	HasContent = True
	Return Me
End Sub

Sub AddButton(btn As VMButton) As VMToolBar
	AddComponent(btn.ID, btn.ToString)
	Return Me
End Sub

'set primary
Sub SetPrimary(b As Boolean) As VMToolBar
	If b = False Then Return Me
	SetColor("primary")
	Return Me
End Sub

Sub AddFAB(btn As VMButton) As VMToolBar
	Extension.SetText(btn.ToString)
	HasContent = True
	Return Me
End Sub

Sub AddTabs(vTabs As VMTabs) As VMToolBar
	Extension.SetText(vTabs.ToString)
	HasContent = True
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMToolBar
	ToolBar.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMToolBar
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMToolBar
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

public Sub AddLogo(url As String) As VMToolBar
	Logo.SetVisible(True)
	Logo.SetVModel("logo", url).Pop(ToolBar)
	HasContent = True
	Return Me
End Sub

Sub UpdateLogo(URL As String) As VMToolBar
	vue.SetData("logo", URL)
	Logo.Show
	HasContent = True
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMToolBar
	ToolBar.AddClass(c)
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

Sub SetVModel(k As String) As VMToolBar
	ToolBar.SetVModel(k)
	Return Me
End Sub

Sub AddSpacer As VMToolBar
	ToolBar.AddSpacer
	HasContent = True
	Return Me
End Sub

Sub AddSwitch(sid As String, vmodel As String, vlabel As String) As VMToolBar
	sid = sid.tolowercase
	Dim el As VMCheckBox
	el.Initialize(vue, sid, module)
	el.SetStatic(bStatic)
	el.SetDesignMode(DesignMode)
	el.SetSwitch
	el.SetInset(True)
	el.SetFalseValue("No")
	el.SetTrueValue("Yes")
	el.SetVModel(vmodel)
	el.Setlabel(vlabel)
	el.SetHideDetails(True)
	vue.SetData(vmodel, "No")
	el.SetOnChange(module, $"${sid}_change"$)
	el.show
	el.AddClass("mx-2")
	ToolBar.SetText(el.ToString)
	HasContent = True
	Return Me
End Sub


Sub AddSearch(key As String) As VMToolBar
	Dim txt As VMTextField
	txt.Initialize(vue, key, module)
	txt.SetStatic(bStatic)
	txt.SetDesignMode(DesignMode)
	txt.AddClass("mx-4").SetAttributes(Array("flat", "hide-details","solo-inverted"))
	txt.SetLabel("Search").SetPrependInnerIcon("search").AddClass("hidden-sm-and-down").SetClearable(True).SetVModel(key)
	ToolBar.SetText(txt.ToString)
	HasContent = True
	Return Me
End Sub

Sub AddMenu(menu As VMMenu) As VMToolBar
	menu.Pop(ToolBar)
	HasContent = True
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMToolBar
	ToolBar.SetAttr(attr)
	Return Me
End Sub


Sub AddIcon(key As String, iconName As String, toolTip As String, badge As String) As VMToolBar
	key = key.tolowercase
	Dim btn As VMButton
	btn.Initialize(vue, key, module)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetIconButton(iconName).SetTooltip(toolTip)
	If badge <> "" Then
		btn.SetHasBadge(True)
		btn.SetBadge(badge)
	End If
	btn.Pop(ToolBar)
	objects.Add(key)
	HasContent = True
	Return Me
End Sub

Sub AddIcon1(key As String, iconName As String, iconColor As String, toolTip As String, badge As String) As VMToolBar
	key = key.tolowercase
	Dim btn As VMButton
	btn.Initialize(vue, key, module)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetColor(iconColor)
	btn.SetIconButton(iconName).SetTooltip(toolTip)
	If badge <> "" Then
		btn.SetHasBadge(True)
		btn.SetBadge(badge)
	End If
	btn.Pop(ToolBar)
	objects.Add(key)
	HasContent = True
	Return Me
End Sub


Sub SetModeFixed(b As Boolean) As VMToolBar
	ToolBar.SetAttrSingle("fixed", b)
	Return Me
End Sub

'add a title to the toolbar
Sub AddTitle(tt As String, ttClass As String) As VMToolBar
	If ttClass <> "" Then Title.AddClass(ttClass)
	If bStatic Then
		Title.SetText(tt)
	Else
		vue.SetStateSingle(tTitle, tt)
		Dim page_title As String = $"{{ ${tTitle} }}"$
		Title.SetText(page_title)
	End If
	Title.Pop(ToolBar)
	HasContent = True
	Return Me
End Sub

Sub UpdateTitle(tt As String) As VMToolBar
	Dim pp As String = $"${ID}title"$
	vue.SetStateSingle(pp, tt)
	HasContent = True
	Return Me
End Sub

'has menu button to show drawer
Sub SetHasMenuButton(b As Boolean) As VMToolBar
	vue.SetStateSingle("menushow", b)
	HasContent = True
	Return Me
End Sub

'add to parent element
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub ToString As String
	If Tabs.hascontent Then AddTabs(Tabs)
	If Extension.HasContent Then Extension.pop(ToolBar)
	Return ToolBar.tostring
End Sub

Sub HideItems
	For Each item As String In objects
		ToolBar.HideItem(item)
	Next
End Sub

Sub ShowItems
	For Each item As String In objects
		ToolBar.ShowItem(item)
	Next
End Sub

'set absolute
Sub SetAbsolute(varAbsolute As Boolean) As VMToolBar
	If varAbsolute = False Then Return Me
	If bStatic Then
		SetAttrSingle("absolute", varAbsolute)
		Return Me
	End If
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	ToolBar.Bind(":absolute", pp)
	Return Me
End Sub

Sub SetLightsOut(varLightsOut As Boolean) As VMToolBar
	If varLightsOut = False Then Return Me
	If bStatic Then
		SetAttrSingle("lights-out", varLightsOut)
		Return Me
	End If
	Dim pp As String = $"${ID}LightsOut"$
	vue.SetStateSingle(pp, varLightsOut)
	ToolBar.Bind(":lights-out", pp)
	Return Me
End Sub

Sub SetWindow(varWindow As Boolean) As VMToolBar
	If varWindow = False Then Return Me
	If bStatic Then
		SetAttrSingle("window", varWindow)
		Return Me
	End If
	Dim pp As String = $"${ID}Window"$
	vue.SetStateSingle(pp, varWindow)
	ToolBar.Bind(":window", pp)
	Return Me
End Sub

'set bottom
Sub SetBottom(varBottom As Boolean) As VMToolBar
	If varBottom = False Then Return Me
	If bStatic Then
		SetAttrSingle("bottom", varBottom)
		Return Me
	End If
	Dim pp As String = $"${ID}Bottom"$
	vue.SetStateSingle(pp, varBottom)
	ToolBar.Bind(":bottom", pp)
	Return Me
End Sub

'set clipped-left
Sub SetClippedLeft(varClippedLeft As Boolean) As VMToolBar
	If varClippedLeft = False Then Return Me
	If bStatic Then
		SetAttrSingle("clipped-left", varClippedLeft)
		Return Me
	End If
	Dim pp As String = $"${ID}ClippedLeft"$
	vue.SetStateSingle(pp, varClippedLeft)
	ToolBar.Bind(":clipped-left", pp)
	Return Me
End Sub

'the stepLabelVModel is the vmodel to have the caption
Sub AddTab(tabID As String, tabLabel As String, tabIcon As String, tabContent As VMContainer)
	Tabs.AddTab(tabID, tabLabel, tabIcon, tabContent)
	HasContent = True
End Sub

'set clipped-right
Sub SetClippedRight(varClippedRight As Boolean) As VMToolBar
	If varClippedRight = False Then Return Me
	If bStatic Then 
		SetAttrSingle("clipped-right", varClippedRight)
		Return Me
	End If	
	Dim pp As String = $"${ID}ClippedRight"$
	vue.SetStateSingle(pp, varClippedRight)
	ToolBar.Bind(":clipped-right", pp)
	Return Me
End Sub

'set collapse
Sub SetCollapse(varCollapse As Boolean) As VMToolBar
	If varCollapse = False Then Return Me
	If bStatic Then
		SetAttrSingle("collapse", varCollapse)
		Return Me
	End If
	Dim pp As String = $"${ID}Collapse"$
	vue.SetStateSingle(pp, varCollapse)
	ToolBar.Bind(":collapse", pp)
	Return Me
End Sub

'set collapse-on-scroll
Sub SetCollapseOnScroll(varCollapseOnScroll As Boolean) As VMToolBar
	If varCollapseOnScroll = False Then Return Me
	If bStatic Then
		SetAttrSingle("collapse-on-scroll", varCollapseOnScroll)
		Return Me
	End If
	Dim pp As String = $"${ID}CollapseOnScroll"$
	vue.SetStateSingle(pp, varCollapseOnScroll)
	ToolBar.Bind(":collapse-on-scroll", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMToolBar
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ToolBar.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMToolBar
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ToolBar.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMToolBar
	If varDense = False Then Return Me
	If bStatic Then
		SetAttrSingle("dense", varDense)
		Return Me
	End If
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	ToolBar.Bind(":dense", pp)
	Return Me
End Sub

'set elevate-on-scroll
Sub SetElevateOnScroll(varElevateOnScroll As Boolean) As VMToolBar
	If varElevateOnScroll = False Then Return Me
	If bStatic Then
		SetAttrSingle("elevate-on-scroll", varElevateOnScroll)
		Return Me
	End If
	Dim pp As String = $"${ID}ElevateOnScroll"$
	vue.SetStateSingle(pp, varElevateOnScroll)
	ToolBar.Bind(":elevate-on-scroll", pp)
	Return Me
End Sub

'set elevation
Sub SetElevation(varElevation As String) As VMToolBar
	If varElevation = "" Then Return Me
	If bStatic Then
		SetAttrSingle("elevation", varElevation)
		Return Me
	End If
	Dim pp As String = $"${ID}Elevation"$
	vue.SetStateSingle(pp, varElevation)
	ToolBar.Bind(":elevation", pp)
	Return Me
End Sub

'set extended
Sub SetExtended(varExtended As Boolean) As VMToolBar
	If varExtended = False Then Return Me
	If bStatic Then
		SetAttrSingle("extended", varExtended)
		Return Me
	End If
	Dim pp As String = $"${ID}Extended"$
	vue.SetStateSingle(pp, varExtended)
	ToolBar.Bind(":extended", pp)
	Return Me
End Sub

'set extension-height
Sub SetExtensionHeight(varExtensionHeight As String) As VMToolBar
	If varExtensionHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("extension-height", varExtensionHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}ExtensionHeight"$
	vue.SetStateSingle(pp, varExtensionHeight)
	ToolBar.Bind(":extension-height", pp)
	Return Me
End Sub

'set fade-img-on-scroll
Sub SetFadeImgOnScroll(varFadeImgOnScroll As Boolean) As VMToolBar
	If varFadeImgOnScroll = False Then Return Me
	If bStatic Then
		SetAttrSingle("fade-img-on-scroll", varFadeImgOnScroll)
		Return Me
	End If
	Dim pp As String = $"${ID}FadeImgOnScroll"$
	vue.SetStateSingle(pp, varFadeImgOnScroll)
	ToolBar.Bind(":fade-img-on-scroll", pp)
	Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Boolean) As VMToolBar
	If varFixed = False Then Return Me
	If bStatic Then
		SetAttrSingle("fixed", varFixed)
		Return Me
	End If
	Dim pp As String = $"${ID}Fixed"$
	vue.SetStateSingle(pp, varFixed)
	ToolBar.Bind(":fixed", pp)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Boolean) As VMToolBar
	If varFlat = False Then Return Me
	If bStatic Then
		SetAttrSingle("flat", varFlat)
		Return Me
	End If
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	ToolBar.Bind(":flat", pp)
	Return Me
End Sub

'set floating
Sub SetFloating(varFloating As Boolean) As VMToolBar
	If varFloating = False Then Return Me
	If bStatic Then
		SetAttrSingle("floating", varFloating)
		Return Me
	End If
	Dim pp As String = $"${ID}Floating"$
	vue.SetStateSingle(pp, varFloating)
	ToolBar.Bind(":floating", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMToolBar
	If varHeight = "" Then Return Me
	If bStatic Then 
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	ToolBar.Bind(":height", pp)
	Return Me
End Sub

'set hide-on-scroll
Sub SetHideOnScroll(varHideOnScroll As Boolean) As VMToolBar
	If varHideOnScroll = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-on-scroll", varHideOnScroll)
		Return Me
	End If
	Dim pp As String = $"${ID}HideOnScroll"$
	vue.SetStateSingle(pp, varHideOnScroll)
	ToolBar.Bind(":hide-on-scroll", pp)
	Return Me
End Sub

'set inverted-scroll
Sub SetInvertedScroll(varInvertedScroll As Boolean) As VMToolBar
	If varInvertedScroll = False Then Return Me
	If bStatic Then
		SetAttrSingle("inverted-scroll", varInvertedScroll)
		Return Me
	End If
	Dim pp As String = $"${ID}InvertedScroll"$
	vue.SetStateSingle(pp, varInvertedScroll)
	ToolBar.Bind(":inverted-scroll", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMToolBar
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ToolBar.Bind(":light", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As String) As VMToolBar
	If varMaxHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-height", varMaxHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	ToolBar.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As String) As VMToolBar
	If varMaxWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-width", varMaxWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	ToolBar.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As String) As VMToolBar
	If varMinHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-height", varMinHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	ToolBar.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As String) As VMToolBar
	If varMinWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-width", varMinWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	ToolBar.Bind(":min-width", pp)
	Return Me
End Sub

'set prominent
Sub SetProminent(varProminent As Boolean) As VMToolBar
	If varProminent = False Then Return Me
	If bStatic Then
		SetAttrSingle("prominent", varProminent)
		Return Me
	End If
	Dim pp As String = $"${ID}Prominent"$
	vue.SetStateSingle(pp, varProminent)
	ToolBar.Bind(":prominent", pp)
	Return Me
End Sub

'set scroll-off-screen
Sub SetScrollOffScreen(varScrollOffScreen As Boolean) As VMToolBar
	If varScrollOffScreen = False Then Return Me
	If bStatic Then
		SetAttrSingle("scroll-off-screen", varScrollOffScreen)
		Return Me
	End If
	Dim pp As String = $"${ID}ScrollOffScreen"$
	vue.SetStateSingle(pp, varScrollOffScreen)
	ToolBar.Bind(":scroll-off-screen", pp)
	Return Me
End Sub

'set scroll-target
Sub SetScrollTarget(varScrollTarget As String) As VMToolBar
	If varScrollTarget = "" Then Return Me
	If bStatic Then
		SetAttrSingle("scroll-target", varScrollTarget)
		Return Me
	End If
	Dim pp As String = $"${ID}ScrollTarget"$
	vue.SetStateSingle(pp, varScrollTarget)
	ToolBar.Bind(":scroll-target", pp)
	Return Me
End Sub

'set scroll-threshold
Sub SetScrollThreshold(varScrollThreshold As String) As VMToolBar
	If varScrollThreshold = "" Then Return Me
	If bStatic Then
		SetAttrSingle("scroll-threshold", varScrollThreshold)
		Return Me
	End If
	Dim pp As String = $"${ID}ScrollThreshold"$
	vue.SetStateSingle(pp, varScrollThreshold)
	ToolBar.Bind(":scroll-threshold", pp)
	Return Me
End Sub

'set short
Sub SetShort(varShort As Boolean) As VMToolBar
	If varShort = False Then Return Me
	If bStatic Then 
		SetAttrSingle("short", varShort)
		Return Me
	End If
	Dim pp As String = $"${ID}Short"$
	vue.SetStateSingle(pp, varShort)
	ToolBar.Bind(":short", pp)
	Return Me
End Sub

'set shrink-on-scroll
Sub SetShrinkOnScroll(varShrinkOnScroll As Boolean) As VMToolBar
	If varShrinkOnScroll = False Then Return Me
	If bStatic Then
		SetAttrSingle("shrink-on-scroll", varShrinkOnScroll)
		Return Me
	End If
	Dim pp As String = $"${ID}ShrinkOnScroll"$
	vue.SetStateSingle(pp, varShrinkOnScroll)
	ToolBar.Bind(":shrink-on-scroll", pp)
	Return Me
End Sub

'set src
Sub SetSrc(varSrc As String) As VMToolBar
	If varSrc = "" Then Return Me
	If bStatic Then
		SetAttrSingle("src", varSrc)
		Return Me
	End If
	Dim pp As String = $"${ID}Src"$
	vue.SetStateSingle(pp, varSrc)
	ToolBar.Bind(":src", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMToolBar
	If varTag = "" Then Return Me
	If bStatic Then
		SetAttrSingle("tag", varTag)
		Return Me
	End If
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	ToolBar.Bind(":tag", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Boolean) As VMToolBar
	If varTile = False Then Return Me
	If bStatic Then
		SetAttrSingle("tile", varTile)
		Return Me
	End If
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	ToolBar.Bind(":tile", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Boolean) As VMToolBar
	ToolBar.SetValue(varValue, False)
Return Me
End Sub

'set width
Sub SetWidth(varWidth As String) As VMToolBar
	If varWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("width", varWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	ToolBar.Bind(":width", pp)
	Return Me
End Sub

'
Sub SetSlotExtension(b As Boolean) As VMToolBar    'ignore
SetAttr(CreateMap("slot": "extension"))
Return Me
End Sub

'
Sub SetSlotImg(b As Boolean) As VMToolBar    'ignore
SetAttr(CreateMap("slot": "img"))
Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMToolBar
	ToolBar.Bind(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMToolBar
	ToolBar.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMToolBar
	ToolBar.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMToolBar
	ToolBar.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMToolBar
	DesignMode = b
	ToolBar.SetDesignMode(b)
	Hamburger.SetDesignMode(b)
	Extension.SetDesignMode(b)
	Tabs.SetDesignMode(b)
	Logo.SetDesignMode(b)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMToolBar
	ToolBar.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMToolBar
	ToolBar.SetName(varName, bbind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMToolBar
	ToolBar.SetDisabled(b)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMToolBar
	ToolBar.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMToolBar
	ToolBar.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMToolBar
	ToolBar.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMToolBar
	ToolBar.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMToolBar
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMToolBar
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMToolBar
	ToolBar.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMToolBar
	ToolBar.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMToolBar
	ToolBar.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMToolBar
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub AddButton1(key As String, iconName As String, text As String, toolTip As String, badge As String) As VMToolBar
	Dim btn As VMButton
	btn.Initialize(vue, key, module)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetToolTip(toolTip).AddIcon(iconName,"left","").SetLabel(text)
	If badge <> "" Then
		btn.SetHasBadge(True)
		btn.SetBadge(badge)
	End If
	btn.Pop(ToolBar)
	HasContent = True
	Return Me
End Sub

Sub AddItem(key As String, iconName As String, color As String, text As String, toolTip As String, badge As String) As VMToolBar
	Dim btn As VMButton
	btn.Initialize(vue, key, module)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetColor(color)
	btn.SetToolTip(toolTip).AddIcon(iconName,"left","").SetLabel(text)
	If badge <> "" Then
		btn.SetHasBadge(True)
		btn.SetBadge(badge)
	End If
	btn.Pop(ToolBar)
	HasContent = True
	Return Me
End Sub


Sub SetVIf(vif As Object) As VMToolBar
	ToolBar.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMToolBar
	ToolBar.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMToolBar
	Dim childHTML As String = child.ToString
	ToolBar.SetText(childHTML)
	HasContent = True
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMToolBar
	ToolBar.SetText(t)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMToolBar
	ToolBar.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

Sub Enable As VMToolBar
	ToolBar.Enable(True)
	Return Me
End Sub

Sub Disable As VMToolBar
	ToolBar.Disable(True)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub