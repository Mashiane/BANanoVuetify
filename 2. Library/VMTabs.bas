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
	Private items As VMTabsItems
	Private children As List
	Public hasContent As Boolean
	Public OnToolBar As Boolean
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
	children.Initialize 
	hasContent = False
	OnToolBar = False
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

'the stepLabelVModel is the vmodel to have the caption
Sub AddTab(tabID As String, tabLabel As String, tabIcon As String, tabContent As String)
	tabID = tabID.tolowercase
	'
	Dim item As Map = CreateMap()
	item.Put("key", tabID)
	item.Put("label", tabLabel)
	item.Put("icon", tabIcon)
	item.Put("content", tabContent)
	children.Add(item)
	hasContent = True
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
	vue.SetStateSingle($"${ID}items"$, children)
	'
	Dim vtab As VMTab
	vtab.Initialize(vue, "", Module)
	vtab.SetAttrSingle("v-for", $"item in ${ID}items"$)
	vtab.Bind(":key", "item.key")
	vtab.SetText("{{ item.label }}")
	vtab.SetText($"<v-icon>{{ item.icon }}</v-icon>"$)
	vtab.Pop(Tabs)
	'
	items.Initialize(vue, "", Module).SetVModel($"${ID}ds"$)
	Dim vtabi As VMTabItem
	vtabi.Initialize(vue, "", Module)
	vtabi.SetAttrSingle("v-for", $"item in ${ID}items"$)
	vtabi.Bind(":key", "item.key")
	'
	Dim vcard As VMElement
	vcard.Initialize(vue, "").SetAttributes(Array("flat", "tile"))
	'
	Dim vtext As VMElement
	vtext.Initialize(vue, "").SetVText("item.content")
	vtext.Pop(vcard)
	vcard.Pop(vtabi.TabItem)
	'
	vtabi.Pop(items.TabsItems)
	
	Dim sb As StringBuilder
	sb.Initialize 
	sb.Append(Tabs.ToString)
	sb.Append(items.ToString)
	'
	If OnToolBar = False Then
		Return $"<v-card>${sb.tostring}</v-card>"$
	Else
		Return sb.ToString
	End If
End Sub

Sub SetVModel(k As String) As VMTabs
	Tabs.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTabs
	Tabs.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTabs
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
Sub SetActiveClass(varActiveClass As Object) As VMTabs
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	Tabs.Bind(":active-class", pp)
	Return Me
End Sub

'set align-with-title
Sub SetAlignWithTitle(varAlignWithTitle As Object) As VMTabs
	Dim pp As String = $"${ID}AlignWithTitle"$
	vue.SetStateSingle(pp, varAlignWithTitle)
	Tabs.Bind(":align-with-title", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMTabs
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	Tabs.Bind(":background-color", pp)
	Return Me
End Sub

'set center-active
Sub SetCenterActive(varCenterActive As Object) As VMTabs
	Dim pp As String = $"${ID}CenterActive"$
	vue.SetStateSingle(pp, varCenterActive)
	Tabs.Bind(":center-active", pp)
	Return Me
End Sub

'set centered
Sub SetCentered(varCentered As Object) As VMTabs
	Dim pp As String = $"${ID}Centered"$
	vue.SetStateSingle(pp, varCentered)
	Tabs.Bind(":centered", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMTabs
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Tabs.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMTabs
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Tabs.Bind(":dark", pp)
	Return Me
End Sub

'set fixed-tabs
Sub SetFixedTabs(varFixedTabs As Object) As VMTabs
	Dim pp As String = $"${ID}FixedTabs"$
	vue.SetStateSingle(pp, varFixedTabs)
	Tabs.Bind(":fixed-tabs", pp)
	Return Me
End Sub

'set grow
Sub SetGrow(varGrow As Object) As VMTabs
	Dim pp As String = $"${ID}Grow"$
	vue.SetStateSingle(pp, varGrow)
	Tabs.Bind(":grow", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMTabs
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Tabs.Bind(":height", pp)
	Return Me
End Sub

'set hide-slider
Sub SetHideSlider(varHideSlider As Object) As VMTabs
	Dim pp As String = $"${ID}HideSlider"$
	vue.SetStateSingle(pp, varHideSlider)
	Tabs.Bind(":hide-slider", pp)
	Return Me
End Sub

'set icons-and-text
Sub SetIconsAndText(varIconsAndText As Object) As VMTabs
	Dim pp As String = $"${ID}IconsAndText"$
	vue.SetStateSingle(pp, varIconsAndText)
	Tabs.Bind(":icons-and-text", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMTabs
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Tabs.Bind(":light", pp)
	Return Me
End Sub

'set mobile-break-point
Sub SetMobileBreakPoint(varMobileBreakPoint As Object) As VMTabs
	Dim pp As String = $"${ID}MobileBreakPoint"$
	vue.SetStateSingle(pp, varMobileBreakPoint)
	Tabs.Bind(":mobile-break-point", pp)
	Return Me
End Sub

'set next-icon
Sub SetNextIcon(varNextIcon As Object) As VMTabs
	Dim pp As String = $"${ID}NextIcon"$
	vue.SetStateSingle(pp, varNextIcon)
	Tabs.Bind(":next-icon", pp)
	Return Me
End Sub

'set optional
Sub SetOptional(varOptional As Object) As VMTabs
	Dim pp As String = $"${ID}Optional"$
	vue.SetStateSingle(pp, varOptional)
	Tabs.Bind(":optional", pp)
	Return Me
End Sub

'set prev-icon
Sub SetPrevIcon(varPrevIcon As Object) As VMTabs
	Dim pp As String = $"${ID}PrevIcon"$
	vue.SetStateSingle(pp, varPrevIcon)
	Tabs.Bind(":prev-icon", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Object) As VMTabs
	Dim pp As String = $"${ID}Right"$
	vue.SetStateSingle(pp, varRight)
	Tabs.Bind(":right", pp)
	Return Me
End Sub

'set show-arrows
Sub SetShowArrows(varShowArrows As Object) As VMTabs
	Dim pp As String = $"${ID}ShowArrows"$
	vue.SetStateSingle(pp, varShowArrows)
	Tabs.Bind(":show-arrows", pp)
	Return Me
End Sub

'set slider-color
Sub SetSliderColor(varSliderColor As Object) As VMTabs
	Dim pp As String = $"${ID}SliderColor"$
	vue.SetStateSingle(pp, varSliderColor)
	Tabs.Bind(":slider-color", pp)
	Return Me
End Sub

'set slider-size
Sub SetSliderSize(varSliderSize As Object) As VMTabs
	Dim pp As String = $"${ID}SliderSize"$
	vue.SetStateSingle(pp, varSliderSize)
	Tabs.Bind(":slider-size", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMTabs
	SetAttrSingle("value", varValue)
	Return Me
End Sub

'set vertical
Sub SetVertical(varVertical As Object) As VMTabs
	Dim pp As String = $"${ID}Vertical"$
	vue.SetStateSingle(pp, varVertical)
	Tabs.Bind(":vertical", pp)
	Return Me
End Sub

'
Sub SetOnChange(methodName As String) As VMTabs
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:change": methodName))
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

'set color intensity
Sub SetTextColor(varColor As String) As VMTabs
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMTabs
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub