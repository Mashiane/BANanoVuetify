B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Lazy As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the Lazy
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMLazy
	ID = sid.tolowercase
	Lazy.Initialize(v, ID)
	Lazy.SetTag("v-lazy")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return Lazy.ToString
End Sub

Sub SetVModel(k As String) As VMLazy
	Lazy.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMLazy
	Lazy.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMLazy
	Lazy.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMLazy
	Dim childHTML As String = child.ToString
	Lazy.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMLazy
	Lazy.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMLazy
	Lazy.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMLazy
	Lazy.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMLazy
	Lazy.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As Object) As VMLazy
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	Lazy.Bind(":min-height", pp)
	Return Me
End Sub

'set options
Sub SetOptions(varOptions As Object) As VMLazy
	Dim pp As String = $"${ID}Options"$
	vue.SetStateSingle(pp, varOptions)
	Lazy.Bind(":options", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMLazy
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	Lazy.Bind(":tag", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As Object) As VMLazy
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	Lazy.Bind(":transition", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMLazy
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	Lazy.Bind(":value", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMLazy
	Lazy.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMLazy
	Lazy.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMLazy
	Lazy.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMLazy
	Lazy.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMLazy
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMLazy
	Lazy.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMLazy
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMLazy
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Lazy.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMLazy
	Lazy.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMLazy
	Lazy.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMLazy
	Lazy.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMLazy
	Lazy.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMLazy
	Lazy.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMLazy
	Lazy.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMLazy
	Lazy.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMLazy
	Lazy.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMLazy
	Lazy.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMLazy
	Lazy.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMLazy
	Lazy.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMLazy
	Lazy.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMLazy
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMLazy
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMLazy
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMLazy
Lazy.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMLazy
Lazy.SetVisible(b)
Return Me
End Sub