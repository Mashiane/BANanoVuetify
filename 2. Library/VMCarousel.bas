B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Carousel As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public Item As VMCarouselItem
End Sub

'initialize the Carousel
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCarousel
	ID = sid.tolowercase
	Carousel.Initialize(v, ID)
	Carousel.SetTag("v-carousel")
	DesignMode = False
	Module = eventHandler
	vue = v
	Item.Initialize(vue, "",Module)
	Return Me
End Sub

Sub AddItem(ci As VMCarouselItem) As VMCarousel
	AddComponent(ci.ToString)
	Return Me
End Sub

'get component
Sub ToString As String
	AddComponent(Item.ToString)
	Return Carousel.ToString
End Sub

Sub SetVModel(k As String) As VMCarousel
	Carousel.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCarousel
	Carousel.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCarousel
	Carousel.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCarousel
	Dim childHTML As String = child.ToString
	Carousel.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCarousel
	Carousel.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCarousel
	Carousel.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCarousel
	Carousel.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCarousel
	Carousel.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMCarousel
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	Carousel.Bind(":active-class", pp)
	Return Me
End Sub

'set continuous
Sub SetContinuous(varContinuous As Object) As VMCarousel
	Dim pp As String = $"${ID}Continuous"$
	vue.SetStateSingle(pp, varContinuous)
	Carousel.Bind(":continuous", pp)
	Return Me
End Sub

'set cycle
Sub SetCycle(varCycle As Object) As VMCarousel
	Dim pp As String = $"${ID}Cycle"$
	vue.SetStateSingle(pp, varCycle)
	Carousel.Bind(":cycle", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMCarousel
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Carousel.Bind(":dark", pp)
	Return Me
End Sub

'set delimiter-icon
Sub SetDelimiterIcon(varDelimiterIcon As Object) As VMCarousel
	Dim pp As String = $"${ID}DelimiterIcon"$
	vue.SetStateSingle(pp, varDelimiterIcon)
	Carousel.Bind(":delimiter-icon", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMCarousel
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Carousel.Bind(":height", pp)
	Return Me
End Sub

'set hide-delimiter-background
Sub SetHideDelimiterBackground(varHideDelimiterBackground As Object) As VMCarousel
	Dim pp As String = $"${ID}HideDelimiterBackground"$
	vue.SetStateSingle(pp, varHideDelimiterBackground)
	Carousel.Bind(":hide-delimiter-background", pp)
	Return Me
End Sub

'set hide-delimiters
Sub SetHideDelimiters(varHideDelimiters As Object) As VMCarousel
	Dim pp As String = $"${ID}HideDelimiters"$
	vue.SetStateSingle(pp, varHideDelimiters)
	Carousel.Bind(":hide-delimiters", pp)
	Return Me
End Sub

'set interval
Sub SetInterval(varInterval As Object) As VMCarousel
	Dim pp As String = $"${ID}Interval"$
	vue.SetStateSingle(pp, varInterval)
	Carousel.Bind(":interval", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMCarousel
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Carousel.Bind(":light", pp)
	Return Me
End Sub

'set mandatory
Sub SetMandatory(varMandatory As Object) As VMCarousel
	Dim pp As String = $"${ID}Mandatory"$
	vue.SetStateSingle(pp, varMandatory)
	Carousel.Bind(":mandatory", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As Object) As VMCarousel
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	Carousel.Bind(":max", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Object) As VMCarousel
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	Carousel.Bind(":multiple", pp)
	Return Me
End Sub

'set next-icon
Sub SetNextIcon(varNextIcon As Object) As VMCarousel
	Dim pp As String = $"${ID}NextIcon"$
	vue.SetStateSingle(pp, varNextIcon)
	Carousel.Bind(":next-icon", pp)
	Return Me
End Sub

'set prev-icon
Sub SetPrevIcon(varPrevIcon As Object) As VMCarousel
	Dim pp As String = $"${ID}PrevIcon"$
	vue.SetStateSingle(pp, varPrevIcon)
	Carousel.Bind(":prev-icon", pp)
	Return Me
End Sub

'set progress
Sub SetProgress(varProgress As Object) As VMCarousel
	Dim pp As String = $"${ID}Progress"$
	vue.SetStateSingle(pp, varProgress)
	Carousel.Bind(":progress", pp)
	Return Me
End Sub

'set progress-color
Sub SetProgressColor(varProgressColor As Object) As VMCarousel
	Dim pp As String = $"${ID}ProgressColor"$
	vue.SetStateSingle(pp, varProgressColor)
	Carousel.Bind(":progress-color", pp)
	Return Me
End Sub

'set reverse
Sub SetReverse(varReverse As Object) As VMCarousel
	Dim pp As String = $"${ID}Reverse"$
	vue.SetStateSingle(pp, varReverse)
	Carousel.Bind(":reverse", pp)
	Return Me
End Sub

'set show-arrows
Sub SetShowArrows(varShowArrows As Object) As VMCarousel
	Dim pp As String = $"${ID}ShowArrows"$
	vue.SetStateSingle(pp, varShowArrows)
	Carousel.Bind(":show-arrows", pp)
	Return Me
End Sub

'set show-arrows-on-hover
Sub SetShowArrowsOnHover(varShowArrowsOnHover As Object) As VMCarousel
	Dim pp As String = $"${ID}ShowArrowsOnHover"$
	vue.SetStateSingle(pp, varShowArrowsOnHover)
	Carousel.Bind(":show-arrows-on-hover", pp)
	Return Me
End Sub

'set touch
Sub SetTouch(varTouch As Object) As VMCarousel
	Dim pp As String = $"${ID}Touch"$
	vue.SetStateSingle(pp, varTouch)
	Carousel.Bind(":touch", pp)
	Return Me
End Sub

'set touchless
Sub SetTouchless(varTouchless As Object) As VMCarousel
	Dim pp As String = $"${ID}Touchless"$
	vue.SetStateSingle(pp, varTouchless)
	Carousel.Bind(":touchless", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMCarousel
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	Carousel.Bind(":value", pp)
	Return Me
End Sub

'set vertical
Sub SetVertical(varVertical As Object) As VMCarousel
	Dim pp As String = $"${ID}Vertical"$
	vue.SetStateSingle(pp, varVertical)
	Carousel.Bind(":vertical", pp)
	Return Me
End Sub

'set vertical-delimiters
Sub SetVerticalDelimiters(varVerticalDelimiters As Object) As VMCarousel
	Dim pp As String = $"${ID}VerticalDelimiters"$
	vue.SetStateSingle(pp, varVerticalDelimiters)
	Carousel.Bind(":vertical-delimiters", pp)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMCarousel
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'hide the component
Sub Hide As VMCarousel
	Carousel.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMCarousel
	Carousel.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMCarousel
	Carousel.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMCarousel
	Carousel.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCarousel
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMCarousel
	Carousel.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCarousel
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCarousel
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Carousel.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMCarousel
	Carousel.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCarousel
	Carousel.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMCarousel
	Carousel.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMCarousel
	Carousel.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMCarousel
	Carousel.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCarousel
	Carousel.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMCarousel
	Carousel.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMCarousel
	Carousel.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMCarousel
	Carousel.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMCarousel
	Carousel.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMCarousel
	Carousel.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMCarousel
	Carousel.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCarousel
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(sItem As String, dataSource As String) As VMCarousel
	dataSource = dataSource.tolowercase
	sItem = sItem.tolowercase
	Dim sline As String = $"${sItem} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMCarousel
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMCarousel
	Carousel.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMCarousel
	Carousel.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMCarousel
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMCarousel
	Carousel.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMCarousel
	Carousel.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMCarousel
	Carousel.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCarousel
Carousel.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMCarousel
Carousel.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMCarousel
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMCarousel
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub