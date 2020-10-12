B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Image As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object
	Private imgLink As String
	Private hasTooltip As Boolean
	Private tooltip As VMToolTip
	Private tmpl As VMTemplate
	Private span As VMLabel
	Private bStatic As Boolean
	Public HasContent As Boolean
	Public Hover As VMHover
	Private hasHover As Boolean
End Sub

'initialize the Image
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMImage
	ID = sid.tolowercase
	Image.Initialize(v, ID)
	Image.SetTag("v-img")
	DesignMode = False
	Module = eventHandler
	vue = v
	imgLink = $"${ID}url"$
	hasTooltip = False
	tooltip.Initialize(vue, "", Module)
	tmpl.Initialize(vue, "", Module)
	tmpl.SetAttrSingle("v-slot:activator", "{ on }")
	span.Initialize(vue, "").SetSpan
	bStatic = False
	HasContent = False
	Hover.Initialize(vue, $"${ID}hover"$, Module)
	hasHover = False
	Show 
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMImage
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetHover(b As Boolean) As VMImage
	hasHover = b
	Return Me
End Sub

Sub SetVOnce(t As Boolean) As VMImage
	Image.setvonce(t)
	Return Me
End Sub

Sub SetOnClick(EventHandler As Object, methodName As String) As VMImage
	methodName = methodName.tolowercase
	If SubExists(EventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(EventHandler, methodName, Array(e))
	SetAttr(CreateMap("@click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMImage
	bStatic = b
	Image.SetStatic(b)
	tooltip.SetStatic(b)
	tmpl.SetStatic(b)
	span.SetStatic(b)
	Hover.SetStatic(b)
	Return Me
End Sub

'the image should be centered on the RC
Sub SetCenterOnParent(b As Boolean) As VMImage
	If b = False Then Return Me
	Image.CenterOnParent = True
	Return Me	
End Sub


Sub SetTooltip(tt As String) As VMImage
	If tt = "" Then Return Me
	hasTooltip = True
	tooltip.SetRight(True)
	Image.SetAttrSingle("v-on", "on")
	span.SetText(tt)
	Return Me
End Sub

Sub SetVerticalAlignMiddle As VMImage
	Image.SetVerticalAlignMiddle
	Return Me
End Sub

Sub SetBorderRadius(br As String) As VMImage
	If br = "" Then Return Me
	If bStatic Then
		SetStyleSingle("border-radius", br)
		Return Me
	End If		
	BindStyleSingle("borderRadius", br)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMImage
	Image.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMImage
	Image.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

Sub SetDraggable(b As Boolean) As VMImage
	Image.SetDraggable(b)
	Return Me
End Sub

Sub SetDroppable(b As Boolean) As VMImage
	Image.SetDroppable(b)
	Return Me	
End Sub

Sub SetOnDragStart(eventHandler As Object, methodName As String) As VMImage
	Image.SetOnDragStart(eventHandler, methodName)
	Return Me
End Sub

Sub SetCursorMove As VMImage
	Image.SetCursorMove
	Return Me
End Sub

Sub SetCursorPointer As VMImage
	Image.SetCursorPointer
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMImage
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMImage
	Image.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

Sub BindStyleSingle(prop As String, optm As String) As VMImage
	Image.BindStyleSingle(prop, optm)
	Return Me
End Sub

Sub BindStyle(optm As Map) As VMImage
	Image.BindStyle(optm)
	Return Me
End Sub

Sub SetBorderStyle(bStyle As String) As VMImage
	If bStyle = "" Then Return Me
	If bStatic Then
		SetStyleSingle("border-style", bStyle)
		Return Me
	End If
	BindStyleSingle("borderStyle", bStyle)
	Return Me
End Sub

Sub SetBorderWidth(bWidth As String) As VMImage
	If bWidth = "" Then Return Me
	If bStatic Then
		SetStyleSingle("border-width", bWidth)
		Return Me
	End If
	BindStyleSingle("borderWidth", bWidth)
	Return Me
End Sub

Sub SetBorderColor(bColor As String) As VMImage
	If bColor = "" Then Return Me
	If bStatic Then
		SetStyleSingle("border-color", bColor)
		Return Me
	End If
	BindStyleSingle("borderColor", bColor)
	Return Me
End Sub

Sub SetBorder(swidth As String, color As String, bstyle As String) As VMImage
	If bStatic Then
		SetStyleSingle("border-style", bstyle)
		SetStyleSingle("border-width", swidth)
		SetStyleSingle("border-color", color)
		Return Me
	End If
	Dim b As Map = CreateMap()
	b.Put("borderStyle", bstyle)
	b.Put("borderWidth", swidth)
	b.Put("borderColor", color)
	BindStyle(b)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMImage
	Image.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMImage
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetSize(swidth As String, sheight As String) As VMImage
	If swidth <> "" Then
		SetWidth(swidth)
		SetMaxWidth(swidth)
	End If
	If sheight <> "" Then
		SetHeight(sheight)
		SetMaxHeight(sheight)
	End If
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMImage
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMImage
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Image.Bind(":color", pp)
	Return Me
End Sub

'set required
Sub SetRequired(varRequired As Boolean) As VMImage
	If varRequired = False Then Return Me
	Image.SetRequired(varRequired)
	Return Me
End Sub

Sub AddComponent(scomp As String) As VMImage
	SetText(scomp)
	Return Me
End Sub

'get component
Sub ToString As String
	Dim sout As String = ""
	If hasTooltip Then
		Image.Pop(tmpl.Template)
		tmpl.Pop(tooltip.tooltip)
		span.Pop(tooltip.ToolTip)
		sout = tooltip.ToString
	Else	
		sout = Image.ToString
	End If
	If hasHover Then
		Hover.AddComponent(sout)
		Return Hover.tostring
	Else
		Return sout
	End If
End Sub

Sub SetValue(url As String) As VMImage
	SetVModel(imgLink, url)
	HasContent = True
	Return Me
End Sub

Sub SetVModel(k As String, value As String) As VMImage
	Image.Value = value
	If bStatic Then
		SetSrc(value)
		Return Me
	End If
	k = k.tolowercase
	vue.SetData(k, value)
	SetSrc(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMImage
	Image.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMImage
	Image.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMImage
	Dim childHTML As String = child.ToString
	Image.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMImage
	Image.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMImage
	Image.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMImage
	Image.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMImage
	Image.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set alt
Sub SetAlt(varAlt As String) As VMImage
	If varAlt = "" Then Return Me
	If bStatic Then
		SetAttrSingle("alt", varAlt)
		Return Me
	End If
	Dim pp As String = $"${ID}Alt"$
	vue.SetStateSingle(pp, varAlt)
	Image.Bind(":alt", pp)
	Return Me
End Sub

'set aspect-ratio
Sub SetAspectRatio(varAspectRatio As String) As VMImage
	If varAspectRatio = "" Then Return Me
	If bStatic Then
		SetAttrSingle("aspect-ratio", varAspectRatio)
		Return Me
	End If
	Dim pp As String = $"${ID}AspectRatio"$
	vue.SetStateSingle(pp, varAspectRatio)
	Image.Bind(":aspect-ratio", pp)
	Return Me
End Sub

'set contain
Sub SetContain(varContain As Boolean) As VMImage
	If varContain = False Then Return Me
	If bStatic Then
		SetAttrSingle("contain", varContain)
		Return Me
	End If
	Dim pp As String = $"${ID}Contain"$
	vue.SetStateSingle(pp, varContain)
	Image.Bind(":contain", pp)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Boolean) As VMImage
	If varEager = False Then Return Me
	If bStatic Then
		SetAttrSingle("eager", varEager)
		Return Me
	End If
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	Image.Bind(":eager", pp)
	Return Me
End Sub

'set gradient
Sub SetGradient(varGradient As String) As VMImage
	If varGradient = "" Then Return Me
	If bStatic Then
		SetAttrSingle("gradient", varGradient)
		Return Me
	End If
	Dim pp As String = $"${ID}Gradient"$
	vue.SetStateSingle(pp, varGradient)
	Image.Bind(":gradient", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMImage
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Image.Bind(":height", pp)
	Return Me
End Sub

'set lazy-src
Sub SetLazySrc(varLazySrc As String) As VMImage
	If varLazySrc = "" Then Return Me
	If bStatic Then
		SetAttrSingle("lazy-src", varLazySrc)
		Return Me
	End If
	Dim pp As String = $"${ID}LazySrc"$
	vue.SetStateSingle(pp, varLazySrc)
	Image.Bind(":lazy-src", pp)
	HasContent = True
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As String) As VMImage
	If varMaxHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-height", varMaxHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	Image.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As String) As VMImage
	If varMaxWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-width", varMaxWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Image.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As String) As VMImage
	If varMinHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-height", varMinHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	Image.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As String) As VMImage
	If varMinWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-width", varMinWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	Image.Bind(":min-width", pp)
	Return Me
End Sub

'set options
Sub SetOptions(varOptions As Object) As VMImage
	Dim pp As String = $"${ID}Options"$
	vue.SetStateSingle(pp, varOptions)
	Image.Bind(":options", pp)
	Return Me
End Sub

'set position
Sub SetPosition(varPosition As String) As VMImage
	If varPosition = "" Then Return Me
	If bStatic Then
		SetAttrSingle("position", varPosition)
		Return Me
	End If
	Dim pp As String = $"${ID}Position"$
	vue.SetStateSingle(pp, varPosition)
	Image.Bind(":position", pp)
	Return Me
End Sub

'set sizes
Sub SetSizes(varSizes As String) As VMImage
	If varSizes = "" Then Return Me
	If bStatic Then
		SetAttrSingle("sizes", varSizes)
		Return Me
	End If
	Dim pp As String = $"${ID}Sizes"$
	vue.SetStateSingle(pp, varSizes)
	Image.Bind(":sizes", pp)
	Return Me
End Sub

'set src via vmodel
Sub SetSrc(varSrc As String) As VMImage
	If varSrc = "" Then Return Me
	If bStatic Then
		SetAttrSingle("src", varSrc)
		Return Me
	End If
	Image.Bind(":src", varSrc)
	HasContent = True
	Return Me
End Sub

'set srcset
Sub SetSrcSet(varSrcset As String) As VMImage
	If varSrcset = "" Then Return Me
	If bStatic Then
		SetAttrSingle("srcset", varSrcset)
		Return Me
	End If
	Dim pp As String = $"${ID}Srcset"$
	vue.SetStateSingle(pp, varSrcset)
	Image.Bind(":srcset", pp)
	HasContent = True
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As String) As VMImage
	If varTransition = "" Then Return Me
	If bStatic Then
		SetAttrSingle("transition", varTransition)
		Return Me
	End If
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	Image.Bind(":transition", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As String) As VMImage
	If varWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("width", varWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	Image.Bind(":width", pp)
	Return Me
End Sub

'
Sub SetSlotPlaceholder(b As Boolean) As VMImage    'ignore
	SetAttr(CreateMap("slot": "placeholder"))
	Return Me
End Sub

'
Sub SetOnError(methodName As String) As VMImage
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnLoad(methodName As String) As VMImage
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@load": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMImage
	Image.SetVisible(False)
	Return Me
End Sub

Sub Show As VMImage
	Image.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMImage
	Image.Enable(True)
	Return Me
End Sub

Sub Disable As VMImage
	Image.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMImage
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMImage
	Image.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMImage
	Image.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMImage
	Image.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMImage
	Image.SetDesignMode(b)
	DesignMode = b
	Image.SetDesignMode(b)
	tooltip.SetDesignMode(b)
	tmpl.SetDesignMode(b)
	span.SetDesignMode(b)
	Hover.SetDesignMode(b)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMImage
	Image.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMImage
	Image.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMImage
	Image.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMImage
	Image.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMImage
	Image.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMImage
	Image.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMImage
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMImage
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub