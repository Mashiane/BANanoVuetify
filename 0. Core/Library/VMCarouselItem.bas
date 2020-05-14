B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public CarouselItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private bStatic As Boolean
End Sub

'initialize the CarouselItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCarouselItem
ID = sid.tolowercase
	CarouselItem.Initialize(v, ID)
	CarouselItem.SetTag("v-carousel-item")
	DesignMode = False
	Module = eventHandler
	vue = v
	bStatic = False
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMCarouselItem
	bStatic = b
	CarouselItem.SetStatic(b)
	Return Me
End Sub

'get component
Sub ToString As String
	Return CarouselItem.ToString
End Sub

Sub SetVModel(k As String) As VMCarouselItem
	CarouselItem.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCarouselItem
CarouselItem.SetVIf(vif)
Return Me
End Sub

Sub SetVShow(vif As Object) As VMCarouselItem
CarouselItem.SetVShow(vif)
Return Me
End Sub

'add to app template
Sub Render
vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCarouselItem
Dim childHTML As String = child.ToString
CarouselItem.SetText(childHTML)
Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCarouselItem
CarouselItem.AddClass(c)
Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCarouselItem
CarouselItem.SetAttr(attr)
Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCarouselItem
CarouselItem.SetStyle(sm)
Return Me
End Sub

'add children
Sub AddChildren(children As List)
For Each childx As VMElement In children
AddChild(childx)
Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMCarouselItem
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	CarouselItem.Bind(":active-class", pp)
	Return Me
End Sub

'set append
Sub SetAppend(varAppend As Boolean) As VMCarouselItem
	If varAppend = False Then Return Me
	If bStatic Then
		SetAttrSingle("append", varAppend)
		Return Me
	End If
	Dim pp As String = $"${ID}Append"$
	vue.SetStateSingle(pp, varAppend)
	CarouselItem.Bind(":append", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMCarouselItem
	If varDisabled = False Then Return Me
	If bStatic Then
		SetAttrSingle("disabled", varDisabled)
	End If
	Dim pp As String = $"${ID}Disabled"$
	vue.SetStateSingle(pp, varDisabled)
	CarouselItem.Bind(":disabled", pp)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Boolean) As VMCarouselItem
	If varEager = False Then Return Me
	If bStatic Then
		SetAttrSingle("eager", varEager)
		Return Me
	End If
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	CarouselItem.Bind(":eager", pp)
	Return Me
End Sub

'set exact
Sub SetExact(varExact As Boolean) As VMCarouselItem
	If varExact = False Then Return Me
	If bStatic Then
		SetAttrSingle("exact", varExact)
		Return Me
	End If
	Dim pp As String = $"${ID}Exact"$
	vue.SetStateSingle(pp, varExact)
	CarouselItem.Bind(":exact", pp)
	Return Me
End Sub

'set exact-active-class
Sub SetExactActiveClass(varExactActiveClass As String) As VMCarouselItem
	If varExactActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("exact-active-class", varExactActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ExactActiveClass"$
	vue.SetStateSingle(pp, varExactActiveClass)
	CarouselItem.Bind(":exact-active-class", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As String) As VMCarouselItem
	If varHref = "" Then Return Me
	If bStatic Then
		SetAttrSingle("href", varHref)
		Return Me
	End If
	Dim pp As String = $"${ID}Href"$
	vue.SetStateSingle(pp, varHref)
	CarouselItem.Bind(":href", pp)
	Return Me
End Sub

'set link
Sub SetLink(varLink As Boolean) As VMCarouselItem
	If varLink = False Then Return Me
	If bStatic Then
		SetAttrSingle("link", varLink)
		Return Me
	End If
	Dim pp As String = $"${ID}Link"$
	vue.SetStateSingle(pp, varLink)
	CarouselItem.Bind(":link", pp)
	Return Me
End Sub

Sub SetSRC(src As String) As VMCarouselItem
	SetAttrSingle("src", src)
	Return Me
End Sub

'set nuxt
Sub SetNuxt(varNuxt As Boolean) As VMCarouselItem
	If varNuxt = False Then Return Me
	If bStatic Then
		SetAttrSingle("nuxt", varNuxt)
		Return Me
	End If
	Dim pp As String = $"${ID}Nuxt"$
	vue.SetStateSingle(pp, varNuxt)
	CarouselItem.Bind(":nuxt", pp)
	Return Me
End Sub

'set replace
Sub SetReplace(varReplace As Boolean) As VMCarouselItem
	If varReplace = False Then Return Me
	If bStatic Then
		SetAttrSingle("replace", varReplace)
		Return Me
	End If
	Dim pp As String = $"${ID}Replace"$
	vue.SetStateSingle(pp, varReplace)
	CarouselItem.Bind(":replace", pp)
	Return Me
End Sub

'set reverse-transition
Sub SetReverseTransition(varReverseTransition As String) As VMCarouselItem
	If varReverseTransition = "" Then Return Me
	If bStatic Then
		SetAttrSingle("reverse-transition", varReverseTransition)
		Return Me
	End If
	Dim pp As String = $"${ID}ReverseTransition"$
	vue.SetStateSingle(pp, varReverseTransition)
	CarouselItem.Bind(":reverse-transition", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Boolean) As VMCarouselItem
	If varRipple = False Then Return Me
	If bStatic Then
		SetAttrSingle("ripple", varRipple)
		Return Me
	End If
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	CarouselItem.Bind(":ripple", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMCarouselItem
	If varTag = "" Then Return Me
	SetAttrSingle("tag", varTag)
	Return Me
End Sub

'set target
Sub SetTarget(varTarget As String) As VMCarouselItem
	If varTarget = "" Then Return Me
	SetAttrSingle("target", varTarget)
	Return Me
End Sub

'set to
Sub SetTo(varTo As String) As VMCarouselItem
	If varTo = "" Then Return Me
	SetAttrSingle("to", varTo)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As String) As VMCarouselItem
	If varTransition = "" Then Return Me
	If bStatic Then
		SetAttrSingle("transition", varTransition)
		Return Me
	End If
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	CarouselItem.Bind(":transition", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMCarouselItem
	CarouselItem.SetValue(varValue, False)
Return Me
End Sub


'hide the component
Sub Hide As VMCarouselItem
	CarouselItem.SetVisible(False)
    Return Me
End Sub

'show the component
Sub Show As VMCarouselItem
	CarouselItem.SetVisible(True)
    Return Me
End Sub

'enable the component
Sub Enable As VMCarouselItem
	CarouselItem.Enable(True)
    Return Me
End Sub

'disable the component
Sub Disable As VMCarouselItem
	CarouselItem.Disable(True)
    Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCarouselItem
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMCarouselItem
	CarouselItem.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCarouselItem
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCarouselItem
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)	
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$	
	vue.SetStateSingle(pp, scolor)
	CarouselItem.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMCarouselItem
	CarouselItem.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCarouselItem
	CarouselItem.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMCarouselItem
	CarouselItem.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMCarouselItem
	CarouselItem.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMCarouselItem
	CarouselItem.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCarouselItem
	CarouselItem.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMCarouselItem
	CarouselItem.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMCarouselItem
	CarouselItem.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMCarouselItem
	CarouselItem.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMCarouselItem
	CarouselItem.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMCarouselItem
	CarouselItem.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMCarouselItem
	CarouselItem.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCarouselItem
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMCarouselItem
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMCarouselItem
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMCarouselItem
	CarouselItem.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMCarouselItem
	CarouselItem.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMCarouselItem
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMCarouselItem
	CarouselItem.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMCarouselItem
	CarouselItem.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMCarouselItem
	CarouselItem.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCarouselItem
CarouselItem.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub


Sub SetVisible(b As Boolean) As VMCarouselItem
CarouselItem.SetVisible(b)
Return Me
End Sub


'set color intensity
Sub SetTextColor(varColor As String) As VMCarouselItem
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMCarouselItem
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub