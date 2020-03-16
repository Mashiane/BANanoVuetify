B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public SubHeader As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
End Sub

'initialize the SubHeader
Public Sub Initialize(v As BANanoVue) As VMSubHeader
	SubHeader.Initialize(v, ID)
	SubHeader.SetTag("v-subheader")
	DesignMode = False
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return SubHeader.ToString
End Sub

Sub SetVModel(k As String) As VMSubHeader
	SubHeader.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMSubHeader
	SubHeader.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSubHeader
	SubHeader.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSubHeader
	Dim childHTML As String = child.ToString
	SubHeader.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSubHeader
	SubHeader.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSubHeader
	SubHeader.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSubHeader
	SubHeader.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSubHeader
	SubHeader.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set dark
Sub SetDark(varDark As Object) As VMSubHeader
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	SubHeader.Bind(":dark", pp)
	Return Me
End Sub


Sub SetVElseIf(t As String) As VMSubHeader
	SetAttrSingle("v-else-if", t)
	Return Me
End Sub

'set inset
Sub SetInset(varInset As Object) As VMSubHeader
	Dim pp As String = $"${ID}Inset"$
	vue.SetStateSingle(pp, varInset)
	SubHeader.Bind(":inset", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMSubHeader
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	SubHeader.Bind(":light", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMSubHeader
	SubHeader.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMSubHeader
	SubHeader.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMSubHeader
	SubHeader.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMSubHeader
	SubHeader.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSubHeader
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMSubHeader
	SubHeader.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMSubHeader
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMSubHeader
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	SubHeader.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMSubHeader
	SubHeader.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSubHeader
	SubHeader.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMSubHeader
	SubHeader.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMSubHeader
	SubHeader.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMSubHeader
	SubHeader.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSubHeader
	SubHeader.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMSubHeader
	SubHeader.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMSubHeader
	SubHeader.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMSubHeader
	SubHeader.BindStyleSingle(prop, value)
	Return Me
End Sub


Sub SetVText(vhtml As String) As VMSubHeader
	SubHeader.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMSubHeader
	SubHeader.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSubHeader
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMSubHeader
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMSubHeader
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSubHeader
SubHeader.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMSubHeader
SubHeader.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMSubHeader
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMSubHeader
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub