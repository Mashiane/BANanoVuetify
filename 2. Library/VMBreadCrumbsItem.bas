B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public BreadCrumbsItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
End Sub

'initialize the BreadCrumbsItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMBreadCrumbsItem
	ID = sid.tolowercase
	BreadCrumbsItem.Initialize(v, ID)
	BreadCrumbsItem.SetTag("v-breadcrumbs-item")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	Return Me
End Sub

'get component
Sub ToString As String
	Return BreadCrumbsItem.ToString
End Sub

Sub SetVModel(k As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMBreadCrumbsItem
	Dim childHTML As String = child.ToString
	BreadCrumbsItem.SetText(childHTML)
	Return Me
End Sub

Sub SetText(varText As String) As VMBreadCrumbsItem
	If varText = "" Then Return Me
	If bStatic Then
		SetAttrSingle("text", varText)
		Return Me
	End If
	Dim pp As String = $"${ID}Text"$
	vue.SetStateSingle(pp, varText)
	BreadCrumbsItem.Bind(":text", pp)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMBreadCrumbsItem
	BreadCrumbsItem.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMBreadCrumbsItem
	BreadCrumbsItem.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMBreadCrumbsItem
	BreadCrumbsItem.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMBreadCrumbsItem
	If varActiveClass = "" Then Return Me
	If varActiveClass = "v-breadcrumbs__item--disabled" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	BreadCrumbsItem.Bind(":active-class", pp)
	Return Me
End Sub

'set exact-active-class
Sub SetExactActiveClass(varExactActiveClass As String) As VMBreadCrumbsItem
	If varExactActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("exact-active-class", varExactActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ExactActiveClass"$
	vue.SetStateSingle(pp, varExactActiveClass)
	BreadCrumbsItem.Bind(":exact-active-class", pp)
	Return Me
End Sub

'set href
Sub SetHref(varHref As String) As VMBreadCrumbsItem
	If varHref = "" Then Return Me
	If bStatic Then
		SetAttrSingle("href", varHref)
		Return Me
	End If
	Dim pp As String = $"${ID}Href"$
	vue.SetStateSingle(pp, varHref)
	BreadCrumbsItem.Bind(":href", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMBreadCrumbsItem
	If varTag = "" Then Return Me
	If bStatic Then
		SetAttrSingle("tag", varTag)
		Return Me
	End If
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	BreadCrumbsItem.Bind(":tag", pp)
	Return Me
End Sub

'set target
Sub SetTarget(varTarget As String) As VMBreadCrumbsItem
	If varTarget = "" Then Return Me
	If bStatic Then
		SetAttrSingle("target", varTarget)
		Return Me
	End If
	Dim pp As String = $"${ID}Target"$
	vue.SetStateSingle(pp, varTarget)
	BreadCrumbsItem.Bind(":target", pp)
	Return Me
End Sub

'set to
Sub SetTo(varTo As String) As VMBreadCrumbsItem
	If varTo = "" Then Return Me
	If bStatic Then
		SetAttrSingle("to", varTo)
		Return Me
	End If
	Dim pp As String = $"${ID}To"$
	vue.SetStateSingle(pp, varTo)
	BreadCrumbsItem.Bind(":to", pp)
	Return Me
End Sub

'set append
Sub SetAppend(varAppend As Boolean) As VMBreadCrumbsItem
	If varAppend = False Then Return Me
	If bStatic Then
		SetAttrSingle("append", varAppend)
		Return Me
	End If
	Dim pp As String = $"${ID}Append"$
	vue.SetStateSingle(pp, varAppend)
	BreadCrumbsItem.Bind(":append", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMBreadCrumbsItem
	If varDisabled = False Then Return Me
	If bStatic Then
		SetAttrSingle("disabled", varDisabled)
		Return Me
	End If
	Dim pp As String = $"${ID}Disabled"$
	vue.SetStateSingle(pp, varDisabled)
	BreadCrumbsItem.Bind(":disabled", pp)
	Return Me
End Sub

'set exact
Sub SetExact(varExact As Boolean) As VMBreadCrumbsItem
	If varExact = False Then Return Me
	If bStatic Then
		SetAttrSingle("exact", varExact)
		Return Me
	End If
	Dim pp As String = $"${ID}Exact"$
	vue.SetStateSingle(pp, varExact)
	BreadCrumbsItem.Bind(":exact", pp)
	Return Me
End Sub

'set link
Sub SetLink(varLink As Boolean) As VMBreadCrumbsItem
	If varLink = False Then Return Me
	If bStatic Then
		SetAttrSingle("link", varLink)
		Return Me
	End If
	Dim pp As String = $"${ID}Link"$
	vue.SetStateSingle(pp, varLink)
	BreadCrumbsItem.Bind(":link", pp)
	Return Me
End Sub

'set nuxt
Sub SetNuxt(varNuxt As Boolean) As VMBreadCrumbsItem
	If varNuxt = False Then Return Me
	If bStatic Then
		SetAttrSingle("nuxt", varNuxt)
		Return Me
	End If
	Dim pp As String = $"${ID}Nuxt"$
	vue.SetStateSingle(pp, varNuxt)
	BreadCrumbsItem.Bind(":nuxt", pp)
	Return Me
End Sub

'set replace
Sub SetReplace(varReplace As Boolean) As VMBreadCrumbsItem
	If varReplace = False Then Return Me
	If bStatic Then
		SetAttrSingle("replace", varReplace)
		Return Me
	End If
	Dim pp As String = $"${ID}Replace"$
	vue.SetStateSingle(pp, varReplace)
	BreadCrumbsItem.Bind(":replace", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Boolean) As VMBreadCrumbsItem
	If varRipple = False Then Return Me
	If bStatic Then
		SetAttrSingle("ripple", varRipple)
		Return Me
	End If
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	BreadCrumbsItem.Bind(":ripple", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMBreadCrumbsItem
	BreadCrumbsItem.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMBreadCrumbsItem
	BreadCrumbsItem.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMBreadCrumbsItem
	BreadCrumbsItem.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMBreadCrumbsItem
	BreadCrumbsItem.Enable(False)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMBreadCrumbsItem
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMBreadCrumbsItem
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMBreadCrumbsItem
	BreadCrumbsItem.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMBreadCrumbsItem
	BreadCrumbsItem.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMBreadCrumbsItem
	BreadCrumbsItem.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMBreadCrumbsItem
	BreadCrumbsItem.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMBreadCrumbsItem
	BreadCrumbsItem.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMBreadCrumbsItem
	BreadCrumbsItem.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMBreadCrumbsItem
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMBreadCrumbsItem
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMBreadCrumbsItem
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMBreadCrumbsItem
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMBreadCrumbsItem
	BreadCrumbsItem.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMBreadCrumbsItem
	BreadCrumbsItem.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMBreadCrumbsItem
	BreadCrumbsItem.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMBreadCrumbsItem
	BreadCrumbsItem.SetVisible(b)
	Return Me
End Sub

