B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public SlideGroup As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the SlideGroup
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSlideGroup
	ID = sid.tolowercase
	SlideGroup.Initialize(v, ID)
	SlideGroup.SetTag("v-slide-group")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return SlideGroup.ToString
End Sub

Sub SetVModel(k As String) As VMSlideGroup
	SlideGroup.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMSlideGroup
	SlideGroup.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSlideGroup
	SlideGroup.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSlideGroup
	Dim childHTML As String = child.ToString
	SlideGroup.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSlideGroup
	SlideGroup.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSlideGroup
	SlideGroup.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr as map) As VMSlideGroup
	SlideGroup.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSlideGroup
	SlideGroup.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMSlideGroup
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	SlideGroup.Bind(":active-class", pp)
	Return Me
End Sub

'set center-active
Sub SetCenterActive(varCenterActive As Object) As VMSlideGroup
	Dim pp As String = $"${ID}CenterActive"$
	vue.SetStateSingle(pp, varCenterActive)
	SlideGroup.Bind(":center-active", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMSlideGroup
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	SlideGroup.Bind(":dark", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMSlideGroup
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	SlideGroup.Bind(":light", pp)
	Return Me
End Sub

'set mandatory
Sub SetMandatory(varMandatory As Object) As VMSlideGroup
	Dim pp As String = $"${ID}Mandatory"$
	vue.SetStateSingle(pp, varMandatory)
	SlideGroup.Bind(":mandatory", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As Object) As VMSlideGroup
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	SlideGroup.Bind(":max", pp)
	Return Me
End Sub

'set mobile-break-point
Sub SetMobileBreakPoint(varMobileBreakPoint As Object) As VMSlideGroup
	Dim pp As String = $"${ID}MobileBreakPoint"$
	vue.SetStateSingle(pp, varMobileBreakPoint)
	SlideGroup.Bind(":mobile-break-point", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Object) As VMSlideGroup
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	SlideGroup.Bind(":multiple", pp)
	Return Me
End Sub

'set next-icon
Sub SetNextIcon(varNextIcon As Object) As VMSlideGroup
	Dim pp As String = $"${ID}NextIcon"$
	vue.SetStateSingle(pp, varNextIcon)
	SlideGroup.Bind(":next-icon", pp)
	Return Me
End Sub

'set prev-icon
Sub SetPrevIcon(varPrevIcon As Object) As VMSlideGroup
	Dim pp As String = $"${ID}PrevIcon"$
	vue.SetStateSingle(pp, varPrevIcon)
	SlideGroup.Bind(":prev-icon", pp)
	Return Me
End Sub

'set show-arrows
Sub SetShowArrows(varShowArrows As Object) As VMSlideGroup
	Dim pp As String = $"${ID}ShowArrows"$
	vue.SetStateSingle(pp, varShowArrows)
	SlideGroup.Bind(":show-arrows", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMSlideGroup
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	SlideGroup.Bind(":value", pp)
	Return Me
End Sub

'
Sub SetSlotNext(b As boolean) As VMSlideGroup    'ignore
	SetAttr(CreateMap("slot": "next"))
	Return Me
End Sub

'
Sub SetSlotPrev(b As boolean) As VMSlideGroup    'ignore
	SetAttr(CreateMap("slot": "prev"))
	Return Me
End Sub

'
Sub SetOnClickLocation(methodName As String) As VMSlideGroup
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:click:location": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'hide the component
Sub Hide As VMSlideGroup
	vue.SetStateSingle($"${ID}show"$, False)
	Return Me
End Sub

'show the component
Sub Show As VMSlideGroup
	vue.SetStateSingle($"${ID}show"$, True)
	Return Me
End Sub

'enable the component
Sub Enable As VMSlideGroup
	vue.SetStateSingle($"${ID}disabled"$, False)
	Return Me
End Sub

'disable the component
Sub Disable As VMSlideGroup
	vue.SetStateSingle($"${ID}disabled"$, True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSlideGroup
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMSlideGroup
	SlideGroup.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMSlideGroup
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMSlideGroup
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	SlideGroup.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMSlideGroup
	SlideGroup.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSlideGroup
	SlideGroup.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMSlideGroup
	SlideGroup.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMSlideGroup
	SlideGroup.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMSlideGroup
	SlideGroup.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSlideGroup
	SlideGroup.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMSlideGroup
	SlideGroup.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMSlideGroup
	SlideGroup.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMSlideGroup
	SlideGroup.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMSlideGroup
	SlideGroup.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMSlideGroup
	SlideGroup.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMSlideGroup
	SlideGroup.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSlideGroup
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMSlideGroup
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMSlideGroup
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSlideGroup
	SlideGroup.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSlideGroup
	SlideGroup.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSlideGroup
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSlideGroup
	SlideGroup.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMSlideGroup
	SlideGroup.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMSlideGroup
	SlideGroup.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub
