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
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private objects As List
	Private Extension As VMTemplate
	Public hasContent As Boolean
	Public Tabs As VMTabs
End Sub

'initialize the ToolBar
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMToolBar
	ID = sid.tolowercase
	ToolBar.Initialize(v, ID)
	ToolBar.SetTag("v-toolbar")
	DesignMode = False
	Module = eventHandler
	vue = v
	objects.Initialize 
	Extension.Initialize(vue, $"${ID}tmpl"$, Module).SetSlotExtension
	Tabs.Initialize(vue, $"${ID}tabls"$, Module)
	Tabs.OnToolBar = True
	hasContent = False
	Return Me
End Sub


'set primary
Sub SetPrimary(b As Boolean) As VMToolBar
	If b = False Then Return Me
	SetColor("primary")
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

Sub AddSearch(key As String) As VMToolBar
	Dim txt As VMTextField
	txt.Initialize(vue, key, Module).AddClass("mx-4").SetAttributes(Array("single-line", "flat", "hide-details","solo-inverted"))
	txt.SetLabel("Search").SetPrependInnerIcon("search").SetClearable(True).SetVModel(key)
	ToolBar.SetText(txt.ToString)
	Return Me
End Sub


Sub SetAttributes(attrs As List) As VMToolBar
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMToolBar
	ToolBar.SetAttrLoose(loose)
	Return Me
End Sub

Sub AddButton(btn As VMButton) As VMToolBar
	btn.Pop(ToolBar)
	hasContent = True
	Return Me
End Sub


Sub AddButton1(key As String, iconName As String, text As String, toolTip As String, badge As String) As VMToolBar
	Dim btn As VMButton
	btn.Initialize(vue, key, Module).SetToolTip(toolTip).AddIcon(iconName,"left","").SetLabel(text)
	If badge <> "" Then
		'btn.SetBadgeContent(badge)
	End If
	btn.Pop(ToolBar)
	hasContent = True
	Return Me
End Sub

Sub AddMenu(menu As VMMenu) As VMToolBar
	menu.Pop(ToolBar)
	hasContent = True
	Return Me
End Sub

Sub AddFAB(btn As VMButton) As VMToolBar
	Extension.SetText(btn.ToString)
	hasContent = True
	Return Me
End Sub

Sub AddTabs(vTabs As VMTabs) As VMToolBar
	Extension.SetText(vTabs.ToString)
	hasContent = True
	Return Me
End Sub

'add a component to the toolbar
Sub AddComponent(key As String, comp As String) As VMToolBar
	ToolBar.SetText(comp)
	objects.Add(key)
	hasContent = True
	Return Me
End Sub

Sub AddIcon(key As String, iconName As String, toolTip As String, badge As String) As VMToolBar
	key = key.tolowercase
	Dim btn As VMButton
	btn.Initialize(vue, key, Module).SetIconButton(iconName).SetTooltip(toolTip)
	btn.Pop(ToolBar)
	objects.Add(key)
	hasContent = True
	Return Me
End Sub

Sub AddTitle(tt As String, classes As String) As VMToolBar
	Dim pp As String = $"${ID}title"$
	vue.SetStateSingle(pp, tt)
	
	Dim page_title As String = $"{{ ${pp} }}"$
	Dim Title As VMElement
	Title.Initialize(vue, $"${ID}title"$).SetTag("v-toolbar-title").SetText(page_title)
	Title.AddClass(classes)
	Title.Pop(ToolBar)
	hasContent = True
	Return Me
End Sub

Sub UpdateTitle(tt As String) As VMToolBar
	Dim pp As String = $"${ID}title"$
	vue.SetStateSingle(pp, tt)
	hasContent = True
	Return Me
End Sub

Sub AddSpacer As VMToolBar
	ToolBar.AddSpacer
	hasContent = True
	Return Me
End Sub

Sub AddHamburger As VMToolBar
	'will help place items on the right
	Dim Spacer As VMElement
	Spacer.Initialize(vue, $"${ID}menu"$).SetTag("v-app-bar-nav-icon")
	Spacer.Pop(ToolBar)
	hasContent = True
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
	hasContent = True
	Return Me
End Sub

'the stepLabelVModel is the vmodel to have the caption
Sub AddTab(tabID As String, tabLabel As String, tabIcon As String, tabContent As String)
	Tabs.AddTab(tabID, tabLabel, tabIcon, tabContent)
End Sub

'get component
Sub ToString As String
	If Tabs.hascontent Then AddTabs(Tabs)
	If Extension.HasContent Then Extension.pop(ToolBar)
	Return ToolBar.ToString
End Sub

Sub SetVModel(k As String) As VMToolBar
	ToolBar.SetVModel(k)
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
	hasContent = True
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMToolBar
	ToolBar.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMToolBar
	ToolBar.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMToolBar
	ToolBar.SetAttr(attr)
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

'set absolute
Sub SetAbsolute(varAbsolute As Object) As VMToolBar
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	ToolBar.Bind(":absolute", pp)
	Return Me
End Sub

'set bottom
Sub SetBottom(varBottom As Object) As VMToolBar
	Dim pp As String = $"${ID}Bottom"$
	vue.SetStateSingle(pp, varBottom)
	ToolBar.Bind(":bottom", pp)
	Return Me
End Sub

'set collapse
Sub SetCollapse(varCollapse As Object) As VMToolBar
	Dim pp As String = $"${ID}Collapse"$
	vue.SetStateSingle(pp, varCollapse)
	ToolBar.Bind(":collapse", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMToolBar
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	ToolBar.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMToolBar
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ToolBar.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMToolBar
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	ToolBar.Bind(":dense", pp)
	Return Me
End Sub

'set elevation
Sub SetElevation(varElevation As Object) As VMToolBar
	Dim pp As String = $"${ID}Elevation"$
	vue.SetStateSingle(pp, varElevation)
	ToolBar.Bind(":elevation", pp)
	Return Me
End Sub

'set extended
Sub SetExtended(varExtended As Object) As VMToolBar
	Dim pp As String = $"${ID}Extended"$
	vue.SetStateSingle(pp, varExtended)
	ToolBar.Bind(":extended", pp)
	Return Me
End Sub

'set extension-height
Sub SetExtensionHeight(varExtensionHeight As Object) As VMToolBar
	Dim pp As String = $"${ID}ExtensionHeight"$
	vue.SetStateSingle(pp, varExtensionHeight)
	ToolBar.Bind(":extension-height", pp)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Object) As VMToolBar
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	ToolBar.Bind(":flat", pp)
	Return Me
End Sub

'set floating
Sub SetFloating(varFloating As Object) As VMToolBar
	Dim pp As String = $"${ID}Floating"$
	vue.SetStateSingle(pp, varFloating)
	ToolBar.Bind(":floating", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMToolBar
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	ToolBar.Bind(":height", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMToolBar
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ToolBar.Bind(":light", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As Object) As VMToolBar
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	ToolBar.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As Object) As VMToolBar
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	ToolBar.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As Object) As VMToolBar
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	ToolBar.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As Object) As VMToolBar
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	ToolBar.Bind(":min-width", pp)
	Return Me
End Sub

'set prominent
Sub SetProminent(varProminent As Object) As VMToolBar
	Dim pp As String = $"${ID}Prominent"$
	vue.SetStateSingle(pp, varProminent)
	ToolBar.Bind(":prominent", pp)
	Return Me
End Sub

'set short
Sub SetShort(varShort As Object) As VMToolBar
	Dim pp As String = $"${ID}Short"$
	vue.SetStateSingle(pp, varShort)
	ToolBar.Bind(":short", pp)
	Return Me
End Sub

'set src
Sub SetSrc(varSrc As Object) As VMToolBar
	Dim pp As String = $"${ID}Src"$
	vue.SetStateSingle(pp, varSrc)
	ToolBar.Bind(":src", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMToolBar
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	ToolBar.Bind(":tag", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Object) As VMToolBar
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	ToolBar.Bind(":tile", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMToolBar
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


Sub Hide As VMToolBar
	ToolBar.SetVisible(False)
	Return Me
End Sub

Sub Show As VMToolBar
	ToolBar.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMToolBar
	ToolBar.Enable(True)
	Return Me
End Sub

Sub Disable As VMToolBar
	ToolBar.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMToolBar
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
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
	ToolBar.SetDesignMode(b)
	DesignMode = b
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


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMToolBar
ToolBar.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMToolBar
ToolBar.SetVisible(b)
Return Me
End Sub