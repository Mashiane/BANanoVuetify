B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Tabs As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public hasContent As Boolean
	Public OnToolBar As Boolean
	Private bStatic As Boolean
	Private titems As List
	Private iconPos As String
End Sub

'initialize the Tabs
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTabs
	ID = sid.tolowercase
	Tabs.Initialize(v, ID)
	Tabs.SetTag("v-tabs").SetVModel($"${ID}ds"$)
	DesignMode = False
	Module = eventHandler
	vue = v
	vue.SetData($"${ID}ds"$, Null)
	hasContent = False
	OnToolBar = False
	bStatic = False
	titems.Initialize 
	iconPos = "left"
	Return Me
End Sub


Sub SetVOnce(t As Boolean) As VMTabs
	Tabs.setvonce(t)
	Return Me
End Sub

Sub SetIconPosRight(b As Boolean) As VMTabs
	If b = False Then Return Me
	iconPos = "right"
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMTabs
	bStatic = b
	Tabs.SetStatic(b)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMTabs
	Tabs.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMTabs
	Tabs.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMTabs
	Tabs.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMTabs
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub AddTabSlider As VMTabs
	AddComponent("<v-tabs-slider></v-tabs-slider>")
	hasContent = True
	Return Me
End Sub

Sub SetTabSlider(b As Boolean) As VMTabs
	If b = False Then Return Me
	AddComponent("<v-tabs-slider></v-tabs-slider>")
	hasContent = True
	Return Me
End Sub

'add a tab item with html string
Sub AddTabItemBadge(tabID As String, tabLabel As String, tabIcon As String, tabContent As String, badge As String)
	tabID = tabID.ToLowerCase
	Dim tabi As VMTab
	tabi.Initialize(vue, tabID, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	tabi.SetKey(tabID)
	tabi.SetBadge(badge)
	tabi.SetHref($"#tab${tabID}"$)
	Select Case iconPos
		Case "right"
			tabi.SetText(tabLabel)
			tabi.SetIcon(tabIcon)
		Case "left"
			tabi.SetText(tabLabel)
			tabi.SetIcon(tabIcon)
	End Select
	AddComponent(tabi.ToString)
	'add the tab item
	Dim tabitem As VMTabItem
	tabitem.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	tabitem.SetKey(tabID)
	tabitem.SetValue($"tab${tabID}"$)
	'
	Dim vcard As VMElement
	vcard.Initialize(vue, "").SetTag("v-card").SetStatic(bStatic).SetDesignMode(DesignMode).SetAttrLoose("flat")
	'
	Dim vcardtext As VMElement
	vcardtext.Initialize(vue,"").SetTag("v-card-text").SetStatic(bStatic).SetDesignMode(DesignMode)
	vcardtext.AddComponent(tabContent)
	vcard.AddComponent(vcardtext.ToString)
	tabitem.AddComponent(vcard.ToString)
	titems.Add(tabitem.ToString)
	hasContent = True
End Sub



'add a tab item with html string
Sub AddTabItem(tabID As String, tabLabel As String, tabIcon As String, tabContent As String)
	tabID = tabID.ToLowerCase
	Dim tabi As VMTab
	tabi.Initialize(vue, tabID, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	tabi.SetKey(tabID)
	tabi.SetHref($"#tab${tabID}"$)
	Select Case iconPos
		Case "right"
			tabi.SetText(tabLabel)
			tabi.SetIcon(tabIcon)
		Case "left"
			tabi.SetText(tabLabel)
			tabi.SetIcon(tabIcon)
	End Select
	AddComponent(tabi.ToString)
	'add the tab item
	Dim tabitem As VMTabItem
	tabitem.Initialize(vue, "", Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	tabitem.SetKey(tabID)
	tabitem.SetValue($"tab${tabID}"$)
	'
	Dim vcard As VMElement
	vcard.Initialize(vue, "").SetTag("v-card").SetStatic(bStatic).SetDesignMode(DesignMode).SetAttrLoose("flat")
	'
	Dim vcardtext As VMElement
	vcardtext.Initialize(vue,"").SetTag("v-card-text").SetStatic(bStatic).SetDesignMode(DesignMode)
	vcardtext.AddComponent(tabContent)
	vcard.AddComponent(vcardtext.ToString)
	tabitem.AddComponent(vcard.ToString)
	titems.Add(tabitem.ToString)
	hasContent = True
End Sub

'manual installation
Sub AddTab(tabID As String, tabLabel As String, tabIcon As String, tabContent As VMContainer)
	Dim xcode As String = ""
	If tabContent <> Null Then xcode = tabContent.tostring
	AddTabItem(tabID, tabLabel, tabIcon, xcode)
End Sub

'manual installation
Sub AddTabBadge(tabID As String, tabLabel As String, tabIcon As String, tabContent As VMContainer, badge As String)
	Dim xcode As String = ""
	If tabContent <> Null Then xcode = tabContent.tostring
	AddTabItemBadge(tabID, tabLabel, tabIcon, xcode, badge)
End Sub


Sub AddComponent(comp As String) As VMTabs
	Tabs.SetText(comp)
	hasContent = True
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMTabs
	Tabs.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMTabs
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	Dim sitems As String = vue.Join("", titems)
	AddComponent(sitems)
	'
	If OnToolBar = False Then
		Return $"<v-card>${Tabs.tostring}</v-card>"$
	Else
		Return Tabs.ToString
	End If
End Sub

Sub SetVModel(k As String) As VMTabs
	Tabs.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMTabs
	Tabs.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMTabs
	Tabs.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTabs
	Dim childHTML As String = child.ToString
	Tabs.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTabs
	Tabs.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTabs
	Tabs.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTabs
	Tabs.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTabs
	Tabs.SetStyle(sm)
	Return Me
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMTabs
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	Tabs.Bind(":active-class", pp)
	Return Me
End Sub

'set align-with-title
Sub SetAlignWithTitle(varAlignWithTitle As Boolean) As VMTabs
	If varAlignWithTitle = False Then Return Me
	If bStatic Then
		SetAttrSingle("align-with-title", varAlignWithTitle)
		Return Me
	End If
	Dim pp As String = $"${ID}AlignWithTitle"$
	vue.SetStateSingle(pp, varAlignWithTitle)
	Tabs.Bind(":align-with-title", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As String) As VMTabs
	If varBackgroundColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("background-color", varBackgroundColor)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	Tabs.Bind(":background-color", pp)
	Return Me
End Sub

'set color intensity
Sub SetBackgroundColorIntensity(varColor As String, varIntensity As String) As VMTabs
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("background-color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}backgroundcolor"$
	vue.SetStateSingle(pp, scolor)
	Tabs.Bind(":background-color", pp)
	Return Me
End Sub


'set center-active
Sub SetCenterActive(varCenterActive As Boolean) As VMTabs
	If varCenterActive = False Then Return Me
	If bStatic Then
		SetAttrSingle("center-active", varCenterActive)
		Return Me
	End If
	Dim pp As String = $"${ID}CenterActive"$
	vue.SetStateSingle(pp, varCenterActive)
	Tabs.Bind(":center-active", pp)
	Return Me
End Sub

'set centered
Sub SetCentered(varCentered As Boolean) As VMTabs
	If varCentered = False Then Return Me
	If bStatic Then
		SetAttrSingle("centered", varCentered)
		Return Me
	End If
	Dim pp As String = $"${ID}Centered"$
	vue.SetStateSingle(pp, varCentered)
	Tabs.Bind(":centered", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMTabs
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Tabs.Bind(":color", pp)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMTabs
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)	
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Tabs.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMTabs
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Tabs.Bind(":dark", pp)
	Return Me
End Sub

'set fixed-tabs
Sub SetFixedTabs(varFixedTabs As Boolean) As VMTabs
	If varFixedTabs = False Then Return Me
	If bStatic Then
		SetAttrSingle("fixed-tabs",varFixedTabs)
		Return Me
	End If
	Dim pp As String = $"${ID}FixedTabs"$
	vue.SetStateSingle(pp, varFixedTabs)
	Tabs.Bind(":fixed-tabs", pp)
	Return Me
End Sub

'set grow
Sub SetGrow(varGrow As Boolean) As VMTabs
	If varGrow = False Then Return Me
	If bStatic Then
		SetAttrSingle("grow", varGrow)
		Return Me
	End If
	Dim pp As String = $"${ID}Grow"$
	vue.SetStateSingle(pp, varGrow)
	Tabs.Bind(":grow", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMTabs
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Tabs.Bind(":height", pp)
	Return Me
End Sub

'set hide-slider
Sub SetHideSlider(varHideSlider As Boolean) As VMTabs
	If varHideSlider = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-slider", varHideSlider)
		Return Me
	End If
	Dim pp As String = $"${ID}HideSlider"$
	vue.SetStateSingle(pp, varHideSlider)
	Tabs.Bind(":hide-slider", pp)
	Return Me
End Sub

'set icons-and-text
Sub SetIconsAndText(varIconsAndText As Boolean) As VMTabs
	If varIconsAndText = False Then Return Me
	If bStatic Then
		SetAttrSingle("icons-and-text", varIconsAndText)
		Return Me
	End If
	Dim pp As String = $"${ID}IconsAndText"$
	vue.SetStateSingle(pp, varIconsAndText)
	Tabs.Bind(":icons-and-text", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMTabs
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Tabs.Bind(":light", pp)
	Return Me
End Sub

'set mobile-break-point
Sub SetMobileBreakPoint(varMobileBreakPoint As String) As VMTabs
	If varMobileBreakPoint = "" Then Return Me
	If bStatic Then
		SetAttrSingle("mobile-break-point", varMobileBreakPoint)
		Return Me
	End If
	Dim pp As String = $"${ID}MobileBreakPoint"$
	vue.SetStateSingle(pp, varMobileBreakPoint)
	Tabs.Bind(":mobile-break-point", pp)
	Return Me
End Sub

'set next-icon
Sub SetNextIcon(varNextIcon As String) As VMTabs
	If varNextIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("next-icon", varNextIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}NextIcon"$
	vue.SetStateSingle(pp, varNextIcon)
	Tabs.Bind(":next-icon", pp)
	Return Me
End Sub

'set optional
Sub SetOptional(varOptional As Boolean) As VMTabs
	If varOptional = False Then Return Me
	If bStatic Then
		SetAttrSingle("optional", varOptional)
		Return Me
	End If
	Dim pp As String = $"${ID}Optional"$
	vue.SetStateSingle(pp, varOptional)
	Tabs.Bind(":optional", pp)
	Return Me
End Sub

'set prev-icon
Sub SetPrevIcon(varPrevIcon As String) As VMTabs
	If varPrevIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("prev-icon", varPrevIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}PrevIcon"$
	vue.SetStateSingle(pp, varPrevIcon)
	Tabs.Bind(":prev-icon", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Boolean) As VMTabs
	If varRight = False Then Return Me
	If bStatic Then
		SetAttrSingle("right", varRight)
		Return Me
	End If
	Dim pp As String = $"${ID}Right"$
	vue.SetStateSingle(pp, varRight)
	Tabs.Bind(":right", pp)
	Return Me
End Sub

'set show-arrows
Sub SetShowArrows(varShowArrows As Boolean) As VMTabs
	If varShowArrows = False Then Return Me
	If bStatic Then
		SetAttrSingle("show-arrows", varShowArrows)
		Return Me
	End If
	Dim pp As String = $"${ID}ShowArrows"$
	vue.SetStateSingle(pp, varShowArrows)
	Tabs.Bind(":show-arrows", pp)
	Return Me
End Sub

'set slider-color
Sub SetSliderColor(varSliderColor As String) As VMTabs
	If varSliderColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("slider-color", varSliderColor)
		Return Me
	End If
	Dim pp As String = $"${ID}SliderColor"$
	vue.SetStateSingle(pp, varSliderColor)
	Tabs.Bind(":slider-color", pp)
	Return Me
End Sub

'set color intensity
Sub SetSliderColorIntensity(varColor As String, varIntensity As String) As VMTabs
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("slider-color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Tabs.Bind(":slider-color", pp)
	Return Me
End Sub

'set slider-size
Sub SetSliderSize(varSliderSize As String) As VMTabs
	If varSliderSize = "" Then Return Me
	If bStatic Then
		SetAttrSingle("slider-size",varSliderSize)
		Return Me
	End If
	Dim pp As String = $"${ID}SliderSize"$
	vue.SetStateSingle(pp, varSliderSize)
	Tabs.Bind(":slider-size", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMTabs
	varValue = varValue.tolowercase
	Tabs.SetValue(varValue, False)
	Return Me
End Sub

'set vertical
Sub SetVertical(varVertical As Boolean) As VMTabs
	If varVertical = False Then Return Me
	If bStatic Then
		SetAttrSingle("vertical", varVertical)
		Return Me
	End If
	Dim pp As String = $"${ID}Vertical"$
	vue.SetStateSingle(pp, varVertical)
	Tabs.Bind(":vertical", pp)
	Return Me
End Sub

'
Sub SetOnChange(eventHandler As Object, methodName As String) As VMTabs
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, e)
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMTabs
	Tabs.SetVisible(False)
	Return Me
End Sub

Sub Show As VMTabs
	Tabs.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMTabs
	Tabs.Enable(True)
	Return Me
End Sub

Sub Disable As VMTabs
	Tabs.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMTabs
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMTabs
	Tabs.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMTabs
	Tabs.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMTabs
	Tabs.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMTabs
	Tabs.SetDesignMode(b)
	'items.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMTabs
	Tabs.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMTabs
	Tabs.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMTabs
	Tabs.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMTabs
	Tabs.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMTabs
	Tabs.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
	End Sub
	
Sub SetVisible(b As Boolean) As VMTabs
	Tabs.SetVisible(b)
	Return Me
End Sub