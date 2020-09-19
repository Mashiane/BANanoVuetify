B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Window As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean  'ignore
	Private Module As Object   'ignore
End Sub

'initialize the Window
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMWindow
	ID = sid.tolowercase
	Window.Initialize(v, ID)
	Window.SetTag("v-window")
	DesignMode = False
	Module = eventHandler
	vue = v
	SetOnChange(Module, $"${ID}_change"$)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMWindow
	Window.SetRC(sRow, sCol)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMWindow
	SetText(comp)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMWindow
	Window.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMWindow
	vue.SetData(xprop, xValue)
	Return Me
End Sub

Sub SetOnChange(eventHandler As Object,methodName As String) As VMWindow
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	SetAttr(CreateMap("@change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub AddItem(vitem As VMWindowItem) As VMWindow
	SetText(vitem.ToString)
	Return Me
End Sub


'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMWindow
	Window.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMWindow
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub AddElement(elID As String, elTag As String, elText As String, mprops As Map, mstyles As Map, lclasses As List) As VMWindow
	Dim d As VMElement
	d.Initialize(vue,elID).SetDesignMode(DesignMode).SetTag(elTag)
	d.SetText(elText)
	d.BuildModel(mprops, mstyles, lclasses, Null)
	SetText(d.ToString)
	Return Me
End Sub

'get component
Sub ToString As String
	If vue.ShowWarnings Then
		Dim eName As String = $"${ID}_change"$
		If SubExists(Module, eName) = False Then
			Log($"VMWindow.${eName} event has not been defined!"$)
		End If
	End If
	Return Window.ToString
End Sub

Sub SetVModel(k As String) As VMWindow
	Window.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMWindow
	Window.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMWindow
	Window.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMWindow
	Dim childHTML As String = child.ToString
	Window.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMWindow
	Window.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMWindow
	Window.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMWindow
	Window.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMWindow
	Window.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMWindow
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	Window.Bind(":active-class", pp)
	Return Me
End Sub

'set continuos
Sub SetContinuos(varContinuos As Object) As VMWindow
	Dim pp As String = $"${ID}Continuos"$
	vue.SetStateSingle(pp, varContinuos)
	Window.Bind(":continuos", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMWindow
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Window.Bind(":dark", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMWindow
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Window.Bind(":light", pp)
	Return Me
End Sub

'set next-icon
Sub SetNextIcon(varNextIcon As Object) As VMWindow
	Dim pp As String = $"${ID}NextIcon"$
	vue.SetStateSingle(pp, varNextIcon)
	Window.Bind(":next-icon", pp)
	Return Me
End Sub

'set prev-icon
Sub SetPrevIcon(varPrevIcon As Object) As VMWindow
	Dim pp As String = $"${ID}PrevIcon"$
	vue.SetStateSingle(pp, varPrevIcon)
	Window.Bind(":prev-icon", pp)
	Return Me
End Sub

'set reverse
Sub SetReverse(varReverse As Object) As VMWindow
	Dim pp As String = $"${ID}Reverse"$
	vue.SetStateSingle(pp, varReverse)
	Window.Bind(":reverse", pp)
	Return Me
End Sub

'set show-arrows
Sub SetShowArrows(varShowArrows As Object) As VMWindow
	Dim pp As String = $"${ID}ShowArrows"$
	vue.SetStateSingle(pp, varShowArrows)
	Window.Bind(":show-arrows", pp)
	Return Me
End Sub

'set show-arrows-on-hover
Sub SetShowArrowsOnHover(varShowArrowsOnHover As Object) As VMWindow
	Dim pp As String = $"${ID}ShowArrowsOnHover"$
	vue.SetStateSingle(pp, varShowArrowsOnHover)
	Window.Bind(":show-arrows-on-hover", pp)
	Return Me
End Sub

'set touch
Sub SetTouch(varTouch As Object) As VMWindow
	Dim pp As String = $"${ID}Touch"$
	vue.SetStateSingle(pp, varTouch)
	Window.Bind(":touch", pp)
	Return Me
End Sub

'set touchless
Sub SetTouchless(varTouchless As Object) As VMWindow
	Dim pp As String = $"${ID}Touchless"$
	vue.SetStateSingle(pp, varTouchless)
	Window.Bind(":touchless", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMWindow
	Window.SetValue(varValue, False)
	Return Me
End Sub

'set vertical
Sub SetVertical(varVertical As Object) As VMWindow
	Dim pp As String = $"${ID}Vertical"$
	vue.SetStateSingle(pp, varVertical)
	Window.Bind(":vertical", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMWindow
	Window.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMWindow
	Window.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMWindow
	Window.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMWindow
	Window.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMWindow
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMWindow
	Window.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMWindow
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMWindow
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Window.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMWindow
	Window.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMWindow
	Window.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMWindow
	Window.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMWindow
	Window.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMWindow
	Window.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMWindow
	Window.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMWindow
	Window.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMWindow
	Window.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMWindow
	Window.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMWindow
	Window.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMWindow
	Window.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMWindow
	Window.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMWindow
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMWindow
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMWindow
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMWindow
Window.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMWindow
Window.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMWindow
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMWindow
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub