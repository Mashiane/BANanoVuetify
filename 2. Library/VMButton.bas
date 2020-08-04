B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public Button As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private hasToolTip As Boolean
	Private tooltip As VMToolTip
	Private tmpl As VMTemplate
	Private span As VMLabel
	Private txt As String
	Private bStatic As Boolean
	Public Badge As VMBadge
	Private iconPos As String
	Private icon As String
	Private hasBadge As Boolean
End Sub

'initialize the Button
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMButton
	ID = sid.tolowercase
	Button.Initialize(v, ID)
	Button.SetTag("v-btn")
	DesignMode = False
	Module = eventHandler
	vue = v
	'link click event
	SetOnClick($"${ID}_click"$)
	hasToolTip = False
	tooltip.Initialize(vue, $"${ID}tt"$, Module)
	tmpl.Initialize(vue, $"${ID}tmp"$, Module).SetAttrSingle("v-slot:activator", "{ on }")
	span.Initialize(vue, $"${ID}span"$).SetSpan
	Button.SetVShow($"${ID}show"$)
	Button.typeOf = "button"
	Badge.Initialize(vue, $"${ID}badge"$, Module) 
	txt = ""
	bStatic = False
	icon = ""
	iconPos = ""
	hasBadge = False
	Return Me
End Sub

Sub SetHasBadge(b As Boolean) As VMButton
	hasBadge = b
	Return Me
End Sub

'set the badge value
Sub SetBadge(bvalue As String) As VMButton
	Badge.SetContent(bvalue)
	Badge.SetBordered(True)
	Badge.SetOverlap(True)
	Badge.SetColorIntensity(vue.COLOR_CYAN, vue.INTENSITY_NORMAL)
	Badge.SetAvatar(True)
	Badge.SetIcon("")
	Badge.SetDot(False)
	Return Me
End Sub

'the image should be centered on the RC
Sub SetCenterOnParent(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.CenterOnParent = True
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMButton
	bStatic = b
	Button.SetStatic(b)
	tooltip.setstatic(b)
	tmpl.setstatic(b)
	span.SetStatic(b)
	Badge.SetStatic(b)
	Return Me
End Sub


'set size
Sub SetSize(varSize As String) As VMButton
	If varSize = "" Then Return Me
	If bStatic Then
		SetAttrSingle("size", varSize)
		Return Me
	End If
	Dim pp As String = $"${ID}Size"$
	vue.SetStateSingle(pp, varSize)
	Button.Bind(":size", pp)
	Return Me
End Sub

Sub AddComponent(comp As String) As VMButton
	Button.SetText(comp)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMButton
	Button.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMButton
	Button.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMButton
	Button.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMButton
	SetRC(srow, scell)
	SetDeviceSizes(small, medium, large, xlarge) 
	Return Me
End Sub

Sub SetVOn(von As String) As VMButton
	Button.SetVOn(von)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMButton
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetAtClick(btnClick As String) As VMButton
	SetAttrSingle("@click", btnClick)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMButton
	Button.SetAttrLoose(loose)
	Return Me
End Sub

'make the button to be an icon only
Sub SetIconButton(iconName As String) As VMButton
	If iconName = "" Then Return Me
	SetIcon(True)
	Dim bicon As VMIcon
	bicon.Initialize(vue, $"${ID}icon"$, Module)
	bicon.SetStatic(bStatic)
	bicon.SetDesignMode(DesignMode)
	bicon.SetText(iconName)
	bicon.Pop(Button)
	txt = ""
	iconPos = ""
	icon = ""
	Return Me
End Sub



Sub SetMenuTrigger(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.SetAttrSingle("v-on","on")
	Return Me
End Sub

Sub SetTopRight(b As Boolean) As VMButton
	If b = False Then Return Me
	SetTop(True)
	SetRight(True)
	SetAbsolute(True)
	Return Me
End Sub

Sub SetTopLeft(b As Boolean) As VMButton
	If b = False Then Return Me
	SetTop(True)
	SetLeft(True)
	SetAbsolute(True)
	Return Me
End Sub

Sub SetBottomRight(b As Boolean) As VMButton
	If b = False Then Return Me
	SetBottom(True)
	SetRight(True)
	SetAbsolute(True)
	Return Me
End Sub

Sub SetBottomLeft(b As Boolean) As VMButton
	If b = False Then Return Me
	SetBottom(True)
	SetLeft(True)
	SetAbsolute(True)
	Return Me
End Sub


'make the button to be a floating action button
Sub SetFABButton(iconName As String) As VMButton
	If iconName = "" Then Return Me
	SetFab(True)
	SetDark(True)
	Dim bicon As VMIcon
	bicon.Initialize(vue, $"${ID}icon"$, Module)
	bicon.SetStatic(bStatic)
	bicon.SetDesignMode(DesignMode)
	bicon.SetText(iconName)
	bicon.Pop(Button)
	iconPos = ""
	txt = ""
	icon = ""
	Return Me
End Sub

Sub AddText(stxt As String) As VMButton
	Button.SetText(stxt)
	Return Me
End Sub

Sub SetToggleIcons(vmodel As String, vifIcon As String, velseIcon As String) As VMButton
	vmodel = vmodel.tolowercase
	AddIconVIf(vifIcon, vmodel, "")
	AddIconVElse(velseIcon, vmodel, "")
	Return Me
End Sub

'add an icon to the button
Sub AddIconVIf(iconName As String, vif As String, theme As String) As VMButton
	Dim bicon As VMIcon
	bicon.Initialize(vue, "", Module)
	bicon.SetStatic(bStatic)
	bicon.SetDesignMode(DesignMode)
	bicon.SetText(iconName).SetVIf(vif)
	If theme <> "" Then
		bicon.UseTheme(theme)
	End If
	bicon.Pop(Button)
	Return Me
End Sub

'add an icon to the button
Sub AddIconVElse(iconName As String, vif As String, theme As String) As VMButton
	Dim bicon As VMIcon
	bicon.Initialize(vue, "", Module)
	bicon.SetStatic(bStatic)
	bicon.SetDesignMode(DesignMode)
	bicon.SetText(iconName).setvelse(vif)
	If theme <> "" Then
		bicon.UseTheme(theme)
	End If
	bicon.Pop(Button)
	Return Me
End Sub

'add an icon to the button
Sub AddIcon(iconName As String, siconPos As String, iconTheme As String) As VMButton
	If iconName = "" Then Return Me
	iconPos = siconPos
	Dim bicon As VMIcon
	bicon.Initialize(vue, $"${ID}icon"$, Module)
	bicon.SetStatic(bStatic)
	bicon.SetDesignMode(DesignMode)
	bicon.SetText(iconName)
	bicon.SetHasBadge(False)
	Select Case iconPos
	Case "left"
		bicon.SetLeft(True)
	Case "right"
		bicon.SetRight(True)
	End Select
	If iconTheme <> "" Then
		bicon.UseTheme(iconTheme)
	End If
	icon = bicon.tostring
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMButton
	If themeName = "" Then Return Me
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMButton
	If b = False Then Return Me
	SetColor("primary")
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMButton
	If b = False Then Return Me
	SetColor("error")
	Return Me
End Sub

Sub SetTooltip(tt As String) As VMButton
	If tt = "" Then Return Me
	hasToolTip = True
	tooltip.SetBottom(True)	
	Button.SetAttrSingle("v-on", "on")
	span.SetText(tt)
	Return Me
End Sub

'get component
Sub ToString As String
	Select Case iconPos
	Case "left"
		Button.SetText(icon)
		Button.SetText(txt)	
	Case "right"
		Button.SetText(txt)
		Button.SetText(icon)
	Case Else
		Button.SetText(txt)
		Button.SetText(icon)
	End Select
	If hasToolTip Then
		Button.Pop(tmpl.Template)
		tmpl.Pop(tooltip.tooltip)
		span.Pop(tooltip.ToolTip)
		'
		If hasBadge = False Then
			Return tooltip.tostring
		End If
		'
		If Badge.HasContent Then
			Badge.AddComponent(tooltip.ToString)
			Return Badge.tostring
		Else	
			Return tooltip.ToString
		End If
	Else
		If hasBadge = False Then
			Return Button.tostring
		End If
		'
		If Badge.HasContent Then
			Badge.AddComponent(Button.ToString)
			Return Badge.tostring	
		Else
			Return Button.ToString
		End If
	End If
End Sub

Sub SetVModel(k As String) As VMButton
	Button.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMButton
	Button.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMButton
	Button.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMButton
	Dim childHTML As String = child.ToString
	Button.SetText(childHTML)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMButton
	Button.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMButton
	Button.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMButton
	Button.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set absolute
Sub SetAbsolute(varAbsolute As Boolean) As VMButton
	If varAbsolute = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("absolute", varAbsolute)
		Return Me
	End If
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	Button.Bind(":absolute", pp)
	Return Me
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMButton
	If varActiveClass = "" Then Return Me
	If bStatic Then
		Button.SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	Button.Bind(":active-class", pp)
	Return Me
End Sub

'set append
Sub SetAppend(varAppend As Boolean) As VMButton
	If varAppend = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("append", varAppend)
		Return Me
	End If
	Dim pp As String = $"${ID}Append"$
	vue.SetStateSingle(pp, varAppend)
	Button.Bind(":append", pp)
	Return Me
End Sub

'set block
Sub SetBlock(varBlock As Boolean) As VMButton
	If varBlock = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("block", varBlock)
		Return Me
	End If
	Dim pp As String = $"${ID}Block"$
	vue.SetStateSingle(pp, varBlock)
	Button.Bind(":block", pp)
	Return Me
End Sub

'set bottom
Sub SetBottom(varBottom As Boolean) As VMButton
	If varBottom = False Then Return Me
	If bStatic Then
		Button.Setattrsingle("bottom", varBottom)
		Return Me
	End If
	Dim pp As String = $"${ID}Bottom"$
	vue.SetStateSingle(pp, varBottom)
	Button.Bind(":bottom", pp)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMButton
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMButton
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMButton
	If varColor = "" Then Return Me
	If bStatic Then
		Button.SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Button.Bind(":color", pp)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMButton
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If varColor = "" Then Return Me
	If bStatic Then
		Button.SetAttrSingle("color", scolor)
		Return Me
	End If
	vue.SetStateSingle(pp, scolor)
	Button.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMButton
	If varDark = False Then Return Me
	Button.SetAttrLoose("dark")
	Return Me
End Sub

'set depressed
Sub SetDepressed(varDepressed As Boolean) As VMButton
	If varDepressed = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("depressed", varDepressed)
		Return Me
	End If
	Dim pp As String = $"${ID}Depressed"$
	vue.SetStateSingle(pp, varDepressed)
	Button.Bind(":depressed", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMButton
	Button.SetDisabled(varDisabled)
	Return Me
End Sub

'set elevation
Sub SetElevation(varElevation As String) As VMButton
	If varElevation = "" Then Return Me
	If bStatic Then
		Button.SetAttrSingle("elevation", varElevation)
		Return Me
	End If
	Dim pp As String = $"${ID}Elevation"$
	vue.SetStateSingle(pp, varElevation)
	Button.Bind(":elevation", pp)
	Return Me
End Sub

'set exact
Sub SetExact(varExact As Boolean) As VMButton
	If varExact = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("exact", varExact)
		Return Me
	End If
	Dim pp As String = $"${ID}Exact"$
	vue.SetStateSingle(pp, varExact)
	Button.Bind(":exact", pp)
	Return Me
End Sub

'set exact-active-class
Sub SetExactActiveClass(varExactActiveClass As String) As VMButton
	If varExactActiveClass = "" Then Return Me
	If bStatic Then
		Button.SetAttrSIngle("exact-active-class", varExactActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ExactActiveClass"$
	vue.SetStateSingle(pp, varExactActiveClass)
	Button.Bind(":exact-active-class", pp)
	Return Me
End Sub

'set fab
Sub SetFab(varFab As Boolean) As VMButton
	If varFab = False Then Return Me
	Button.SetAttrLoose("fab")
	Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Boolean) As VMButton
	If varFixed = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("fixed", varFixed)
		Return Me
	End If
	Dim pp As String = $"${ID}Fixed"$
	vue.SetStateSingle(pp, varFixed)
	Button.Bind(":fixed", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMButton
	If varHeight = "" Then Return Me
	If bStatic Then
		Button.SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Button.Bind(":height", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As String) As VMButton
	If varHref = "" Then Return Me
	Button.SetAttrSingle("href", varHref)
	Return Me
End Sub

'set icon
Sub SetIcon(varIcon As Boolean) As VMButton
	If varIcon = False Then Return Me
	Button.SetAttrSingle("icon", varIcon)
	Return Me
End Sub

'set input-value
Sub SetInputValue(varInputValue As String) As VMButton
	If varInputValue = "" Then Return Me
	Button.SetAttrSingle("input-value", varInputValue)
	Return Me
End Sub

'set large
Sub SetLarge(varLarge As Boolean) As VMButton
	If varLarge = False Then Return Me
	Button.SetAttrSIngle("large", varLarge)
	Return Me
End Sub

'set left
Sub SetLeft(varLeft As Boolean) As VMButton
	If varLeft = False Then Return Me
	Button.SetAttrLoose("left")
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMButton
	If varLight = False Then Return Me
	If bStatic Then
		Button.SetAttrsingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Button.Bind(":light", pp)
	Return Me
End Sub

'set link
Sub SetLink(varLink As Boolean) As VMButton
	If varLink = False Then Return Me
	If bStatic Then
		Button.SetAttrSIngle("link", varLink)
		Return Me
	End If
	Dim pp As String = $"${ID}Link"$
	vue.SetStateSingle(pp, varLink)
	Button.Bind(":link", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Boolean) As VMButton
	If varLoading = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("loading", varLoading)
		Return Me
	End If
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	Button.Bind(":loading", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As String) As VMButton
	If varMaxHeight = "" Then Return Me
	If bStatic Then
		Button.SetAttrSingle("max-height", varMaxHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	Button.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As String) As VMButton
	If varMaxWidth = "" Then Return Me
	If bStatic Then 
		Button.SetAttrSIngle("max-width", varMaxWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Button.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As String) As VMButton
	If varMinHeight = "" Then Return Me
	If bStatic Then
		Button.SetAttrSingle("min-height", varMinHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	Button.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As String) As VMButton
	If varMinWidth = "" Then Return Me
	If bStatic Then
		Button.SetAttrSingle("min-width", varMinWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	Button.Bind(":min-width", pp)
	Return Me
End Sub

'set nuxt
Sub SetNuxt(varNuxt As Boolean) As VMButton
	If varNuxt = False Then Return Me
	Button.SetAttrSingle("nuxt", varNuxt)
	Return Me
End Sub

'set outlined
Sub SetOutlined(varOutlined As Boolean) As VMButton
	If varOutlined = False Then Return Me
	If bStatic Then
		Button.SetAttrSIngle("outlined", varOutlined)
		Return Me
	End If
	Dim pp As String = $"${ID}Outlined"$
	vue.SetStateSingle(pp, varOutlined)
	Button.Bind(":outlined", pp)
	Return Me
End Sub

'set replace
Sub SetReplace(varReplace As Boolean) As VMButton
	If varReplace = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("replace", varReplace)
		Return Me
	End If
	Dim pp As String = $"${ID}Replace"$
	vue.SetStateSingle(pp, varReplace)
	Button.Bind(":replace", pp)
	Return Me
End Sub

'set retain-focus-on-click
Sub SetRetainFocusOnClick(varRetainFocusOnClick As Boolean) As VMButton
	If varRetainFocusOnClick = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("retain-focus-on-click", varRetainFocusOnClick)
		Return Me
	End If
	Dim pp As String = $"${ID}RetainFocusOnClick"$
	vue.SetStateSingle(pp, varRetainFocusOnClick)
	Button.Bind(":retain-focus-on-click", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Boolean) As VMButton
	If varRight = False Then Return Me
	Button.SetAttrLoose("right")
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Boolean) As VMButton
	If varRipple = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("ripple", varRipple)
		Return Me
	End If
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	Button.Bind(":ripple", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Boolean) As VMButton
	If varRounded = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("rounded", varRounded)
		Return Me
	End If
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	Button.Bind(":rounded", pp)
	Return Me
End Sub

'set small
Sub SetSmall(varSmall As Boolean) As VMButton
	If varSmall = False Then Return Me
	Button.SetAttrsingle("small", varSmall)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMButton
	If varTag = "" Then Return Me
	Button.SetAttrSingle("tag", varTag)
	Return Me
End Sub

'set target
Sub SetTarget(varTarget As String) As VMButton
	If varTarget = "" Then Return Me
	Button.SetAttrSingle("target", varTarget)
	Return Me
End Sub

'set text
Sub SetLabel(varText As String) As VMButton
	SetText(varText)
	Return Me
End Sub

'set text
private Sub SetText(varText As String) As VMButton
	If DesignMode = True Or bStatic = True Then
		txt = varText
	Else
		Dim pp As String = $"${ID}label"$
		pp = pp.tolowercase
		vue.SetStateSingle(pp, varText)
		txt = $"{{ ${pp} }}"$
	End If
	Return Me
End Sub

Sub SetSpan(varText As String) As VMButton
	If DesignMode = True Or bStatic = True Then
		txt = $"<span>${varText}</span>"$	
	Else
		Dim pp As String = $"${ID}label"$
		pp = pp.tolowercase
		vue.SetStateSingle(pp, varText)
		txt = $"<span>{{ ${pp} }}</span>"$
	End If
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Boolean) As VMButton
	If varTile = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("tile", varTile)
		Return Me
	End If
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	Button.Bind(":tile", pp)
	Return Me
End Sub

'set to
Sub SetTo(varTo As String) As VMButton
	If varTo = "" Then Return Me
	Button.SetAttrSingle("to", varTo)
	Return Me
End Sub

'set top
Sub SetTop(varTop As Boolean) As VMButton
	If varTop = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("top", varTop)
		Return Me
	End If
Dim pp As String = $"${ID}Top"$
vue.SetStateSingle(pp, varTop)
Button.Bind(":top", pp)
Return Me
End Sub

'set type
Sub SetType(varType As String) As VMButton
	If varType = "" Then Return Me
	Button.Bind("type", varType)
	Return Me
End Sub

Sub SetIsText(b As Boolean) As VMButton
	SetTransparent(b)
	Return Me
End Sub

Sub SetTransparent(varType As Boolean) As VMButton
	If varType = False Then Return Me
	If bStatic Then
		Button.SetAttrSingle("text", varType)
		Return Me
	End If
	Dim pp As String = $"${ID}text"$
	vue.SetStateSingle(pp, varType)
	Button.Bind(":text", pp)
	Return Me
End Sub

'this is kept for backward compatibility as buttons are raised by default
Sub SetRaised(b As Boolean) As VMButton
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMButton
	Button.SetValue(varValue,False)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As String) As VMButton
	If varWidth = "" Then Return Me
	If bStatic Then
		Button.SetAttrSingle("width", varWidth)
		Return Me
	End If
Dim pp As String = $"${ID}Width"$
vue.SetStateSingle(pp, varWidth)
Button.Bind(":width", pp)
Return Me
End Sub

'set x-large
Sub SetXLarge(varXLarge As Boolean) As VMButton
	If varXLarge = False Then Return Me
	Button.SetAttrSingle(":x-large", varXLarge)
	Return Me
End Sub

'set x-small
Sub SetXSmall(varXSmall As Boolean) As VMButton
	If varXSmall = False Then Return Me
	Button.SetAttrSingle(":x-small", varXSmall)
	Return Me
End Sub

'
Sub SetSlotLoader(b As Boolean) As VMButton    'ignore
SetAttr(CreateMap("slot": "loader"))
Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMButton
methodName = methodName.tolowercase
If SubExists(Module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
SetAttr(CreateMap("@click": methodName))
'add to methods
		vue.SetCallBack(methodName, cb)
		Return Me
End Sub


Sub Hide As VMButton
	Button.SetVisible(False)
    Return Me
End Sub

Sub Show As VMButton
	Button.SetVisible(True)
    Return Me
End Sub

Sub Enable As VMButton
	Button.Enable(True)
    Return Me
End Sub

Sub Disable As VMButton
	Button.Enable(False)
    Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMButton
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMButton
	Button.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMButton
	Button.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMButton
	Button.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMButton
	Button.SetDesignMode(b)
	tooltip.SetDesignMode(b)
	tmpl.SetDesignMode(b)
	span.SetDesignMode(b)
	Badge.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMButton
	Button.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMButton
	Button.SetName(varName, bbind)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMButton
	Button.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMButton
	Button.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMButton
	Button.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMButton
	Button.SetVisible(b)
	Return Me
End Sub