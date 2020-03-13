B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TimeLineItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the TimeLineItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTimelineItem
	ID = sid.tolowercase
	TimeLineItem.Initialize(v, ID)
	TimeLineItem.SetTag("v-timeline-item")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return TimeLineItem.ToString
End Sub

Sub SetVModel(k As String) As VMTimelineItem
	TimeLineItem.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTimelineItem
	TimeLineItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTimelineItem
	TimeLineItem.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTimelineItem
	Dim childHTML As String = child.ToString
	TimeLineItem.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTimelineItem
	TimeLineItem.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTimelineItem
	TimeLineItem.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTimelineItem
	TimeLineItem.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTimelineItem
	TimeLineItem.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As Object) As VMTimelineItem
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	TimeLineItem.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMTimelineItem
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	TimeLineItem.Bind(":dark", pp)
	Return Me
End Sub

'set fill-dot
Sub SetFillDot(varFillDot As Object) As VMTimelineItem
	Dim pp As String = $"${ID}FillDot"$
	vue.SetStateSingle(pp, varFillDot)
	TimeLineItem.Bind(":fill-dot", pp)
	Return Me
End Sub

'set hide-dot
Sub SetHideDot(varHideDot As Object) As VMTimelineItem
	Dim pp As String = $"${ID}HideDot"$
	vue.SetStateSingle(pp, varHideDot)
	TimeLineItem.Bind(":hide-dot", pp)
	Return Me
End Sub

'set icon
Sub SetIcon(varIcon As Object) As VMTimelineItem
	Dim pp As String = $"${ID}Icon"$
	vue.SetStateSingle(pp, varIcon)
	TimeLineItem.Bind(":icon", pp)
	Return Me
End Sub

'set icon-color
Sub SetIconColor(varIconColor As Object) As VMTimelineItem
	Dim pp As String = $"${ID}IconColor"$
	vue.SetStateSingle(pp, varIconColor)
	TimeLineItem.Bind(":icon-color", pp)
	Return Me
End Sub

'set large
Sub SetLarge(varLarge As Object) As VMTimelineItem
	Dim pp As String = $"${ID}Large"$
	vue.SetStateSingle(pp, varLarge)
	TimeLineItem.Bind(":large", pp)
	Return Me
End Sub

'set left
Sub SetLeft(varLeft As Object) As VMTimelineItem
	Dim pp As String = $"${ID}Left"$
	vue.SetStateSingle(pp, varLeft)
	TimeLineItem.Bind(":left", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMTimelineItem
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	TimeLineItem.Bind(":light", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Object) As VMTimelineItem
	Dim pp As String = $"${ID}Right"$
	vue.SetStateSingle(pp, varRight)
	TimeLineItem.Bind(":right", pp)
	Return Me
End Sub

'set small
Sub SetSmall(varSmall As Object) As VMTimelineItem
	Dim pp As String = $"${ID}Small"$
	vue.SetStateSingle(pp, varSmall)
	TimeLineItem.Bind(":small", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMTimelineItem
	TimelineItem.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMTimelineItem
	TimelineItem.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMTimelineItem
	TimelineItem.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMTimelineItem
	TimelineItem.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMTimelineItem
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMTimelineItem
	TimeLineItem.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMTimelineItem
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMTimelineItem
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	TimeLineItem.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMTimelineItem
	TimeLineItem.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMTimelineItem
	TimeLineItem.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMTimelineItem
	TimeLineItem.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMTimelineItem
	TimeLineItem.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMTimelineItem
	TimeLineItem.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMTimelineItem
	TimeLineItem.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMTimelineItem
	TimeLineItem.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMTimelineItem
	TimeLineItem.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMTimelineItem
	TimeLineItem.BindStyleSingle(prop, value)
	Return Me
End Sub


Sub SetVText(vhtml As String) As VMTimelineItem
	TimeLineItem.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMTimelineItem
	TimeLineItem.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMTimelineItem
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMTimelineItem
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMTimelineItem
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMTimelineItem
TimelineItem.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMTimelineItem
TimelineItem.SetVisible(b)
Return Me
End Sub