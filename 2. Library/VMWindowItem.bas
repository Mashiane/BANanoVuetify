B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public WindowItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the WindowItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMWindowItem
	ID = sid.tolowercase
	WindowItem.Initialize(v, ID)
	WindowItem.SetTag("v-window-item")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return WindowItem.ToString
End Sub

Sub SetVModel(k As String) As VMWindowItem
	WindowItem.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMWindowItem
	WindowItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMWindowItem
	WindowItem.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMWindowItem
	Dim childHTML As String = child.ToString
	WindowItem.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMWindowItem
	WindowItem.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMWindowItem
	WindowItem.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMWindowItem
	WindowItem.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMWindowItem
	WindowItem.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As Object) As VMWindowItem
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	WindowItem.Bind(":active-class", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Object) As VMWindowItem
	Dim pp As String = $"${ID}Disabled"$
	vue.SetStateSingle(pp, varDisabled)
	WindowItem.Bind(":disabled", pp)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Object) As VMWindowItem
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	WindowItem.Bind(":eager", pp)
	Return Me
End Sub

'set reverse-transition
Sub SetReverseTransition(varReverseTransition As Object) As VMWindowItem
	Dim pp As String = $"${ID}ReverseTransition"$
	vue.SetStateSingle(pp, varReverseTransition)
	WindowItem.Bind(":reverse-transition", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As Object) As VMWindowItem
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	WindowItem.Bind(":transition", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMWindowItem
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	WindowItem.Bind(":value", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMWindowItem
	WindowItem.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMWindowItem
	WindowItem.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMWindowItem
	WindowItem.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMWindowItem
	WindowItem.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMWindowItem
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMWindowItem
	WindowItem.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMWindowItem
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMWindowItem
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	WindowItem.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMWindowItem
	WindowItem.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMWindowItem
	WindowItem.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMWindowItem
	WindowItem.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMWindowItem
	WindowItem.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMWindowItem
	WindowItem.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMWindowItem
	WindowItem.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMWindowItem
	WindowItem.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMWindowItem
	WindowItem.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMWindowItem
	WindowItem.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMWindowItem
	WindowItem.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMWindowItem
	WindowItem.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMWindowItem
	WindowItem.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMWindowItem
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMWindowItem
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMWindowItem
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMWindowItem
WindowItem.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMWindowItem
WindowItem.SetVisible(b)
Return Me
End Sub