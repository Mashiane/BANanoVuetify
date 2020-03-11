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
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the Image
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMImage
	ID = sid.tolowercase
	Image.Initialize(v, ID)
	Image.SetTag("v-img")
	DesignMode = False
	Module = eventHandler
	vue = v
	Image.SetVShow($"${ID}show"$)
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

Sub SetBorder(width As String, color As String, bstyle As String) As VMImage
	Dim b As Map = CreateMap()
	b.Put("borderStyle", bstyle)
	b.Put("borderWidth", width)
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

Sub SetSize(width As String, height As String) As VMImage
	SetHeight(height)
	SetWidth(width)
	SetMaxHeight(height)
	SetMaxWidth(width)
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
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Image.Bind(":color", pp)
	Return Me
End Sub


'set required
Sub SetRequired(varRequired As Boolean) As VMImage
	Image.SetRequired(varRequired)
	Return Me
End Sub

Sub AddComponent(scomp As String) As VMImage
	SetText(scomp)
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return Image.ToString
End Sub

Sub SetVModel(k As String) As VMImage
	Image.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMImage
	Image.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMImage
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
Sub SetText(t As Object) As VMImage
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
Sub SetAlt(varAlt As Object) As VMImage
	Dim pp As String = $"${ID}Alt"$
	vue.SetStateSingle(pp, varAlt)
	Image.Bind(":alt", pp)
	Return Me
End Sub

'set aspect-ratio
Sub SetAspectRatio(varAspectRatio As Object) As VMImage
	Dim pp As String = $"${ID}AspectRatio"$
	vue.SetStateSingle(pp, varAspectRatio)
	Image.Bind(":aspect-ratio", pp)
	Return Me
End Sub

'set contain
Sub SetContain(varContain As Object) As VMImage
	Dim pp As String = $"${ID}Contain"$
	vue.SetStateSingle(pp, varContain)
	Image.Bind(":contain", pp)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Object) As VMImage
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	Image.Bind(":eager", pp)
	Return Me
End Sub

'set gradient
Sub SetGradient(varGradient As Object) As VMImage
	Dim pp As String = $"${ID}Gradient"$
	vue.SetStateSingle(pp, varGradient)
	Image.Bind(":gradient", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMImage
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Image.Bind(":height", pp)
	Return Me
End Sub

'set lazy-src
Sub SetLazySrc(varLazySrc As Object) As VMImage
	Dim pp As String = $"${ID}LazySrc"$
	vue.SetStateSingle(pp, varLazySrc)
	Image.Bind(":lazy-src", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As Object) As VMImage
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	Image.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As Object) As VMImage
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Image.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As Object) As VMImage
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	Image.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As Object) As VMImage
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
Sub SetPosition(varPosition As Object) As VMImage
	Dim pp As String = $"${ID}Position"$
	vue.SetStateSingle(pp, varPosition)
	Image.Bind(":position", pp)
	Return Me
End Sub

'set sizes
Sub SetSizes(varSizes As Object) As VMImage
	Dim pp As String = $"${ID}Sizes"$
	vue.SetStateSingle(pp, varSizes)
	Image.Bind(":sizes", pp)
	Return Me
End Sub

'set src
Sub SetSrc(varSrc As Object) As VMImage
	Dim pp As String = $"${ID}Src"$
	vue.SetStateSingle(pp, varSrc)
	Image.Bind(":src", pp)
	Return Me
End Sub

'set srcset
Sub SetSrcset(varSrcset As Object) As VMImage
	Dim pp As String = $"${ID}Srcset"$
	vue.SetStateSingle(pp, varSrcset)
	Image.Bind(":srcset", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As Object) As VMImage
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	Image.Bind(":transition", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMImage
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
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnLoad(methodName As String) As VMImage
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:load": methodName))
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
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMImage
	Image.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMImage
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