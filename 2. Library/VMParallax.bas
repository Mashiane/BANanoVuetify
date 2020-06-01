B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Parallax As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public Container As VMContainer
	Private bStatic As Boolean
End Sub

'initialize the Parallax
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMParallax
	ID = sid.tolowercase
	Parallax.Initialize(v, ID)
	Parallax.SetTag("v-parallax")
	DesignMode = False
	Module = eventHandler
	vue = v
	Container.Initialize(vue, $"${ID}par"$, Module)
	bStatic = False
	Return Me
End Sub



Sub SetVOnce(t As Boolean) As VMParallax
	Parallax.setvonce(t)
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMParallax
	bStatic = b
	Parallax.SetStatic(b)
	Container.SetStatic(b)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMParallax
	Parallax.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMParallax
	Parallax.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMParallax
	Parallax.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMParallax
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'get component
Sub ToString As String
	If Container.HasContent Then AddComponent(Container.ToString)
	Return Parallax.ToString
End Sub

Sub AddComponent(comp As String) As VMParallax
	Parallax.SetText(comp)
	Return Me
End Sub

Sub SetVModel(k As String) As VMParallax
	Parallax.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMParallax
	Parallax.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMParallax
	Parallax.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMParallax
	Dim childHTML As String = child.ToString
	Parallax.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMParallax
	Parallax.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMParallax
	Parallax.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMParallax
	Parallax.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMParallax
	Parallax.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set alt
Sub SetAlt(varAlt As String) As VMParallax
	If varAlt = "" Then Return Me
	If bStatic Then
		SetAttrSingle("alt", varAlt)
		Return Me
	End If
	Dim pp As String = $"${ID}Alt"$
	vue.SetStateSingle(pp, varAlt)
	Parallax.Bind(":alt", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMParallax
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Parallax.Bind(":height", pp)
	Return Me
End Sub

'set src
Sub SetSrc(varSrc As String) As VMParallax
	If varSrc = "" Then Return Me
	If bStatic Then
		SetAttrSingle("src", varSrc)
		Return Me
	End If
	Dim pp As String = $"${ID}Src"$
	vue.SetStateSingle(pp, varSrc)
	Parallax.Bind(":src", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMParallax
	Parallax.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMParallax
	Parallax.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMParallax
	Parallax.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMParallax
	Parallax.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMParallax
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMParallax
	Parallax.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMParallax
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMParallax
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Parallax.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMParallax
	Parallax.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMParallax
	Parallax.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMParallax
	Parallax.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMParallax
	Parallax.SetDesignMode(b)
	Container.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMParallax
	Parallax.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMParallax
	Parallax.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMParallax
	Parallax.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMParallax
	Parallax.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMParallax
	Parallax.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMParallax
	Parallax.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMParallax
	Parallax.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMParallax
	Parallax.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMParallax
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMParallax
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMParallax
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMParallax
Parallax.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMParallax
Parallax.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMParallax
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMParallax
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub