B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public BtnToggle As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
End Sub

'initialize the BtnToggle
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMBtnToggle
	ID = sid.tolowercase
	BtnToggle.Initialize(v, ID)
	BtnToggle.SetTag("v-btn-toggle")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	Return Me
End Sub

Sub AddIcon(btnID As String, btnIcon As String, btnColor As String, btnValue As String, btnToolTip As String)
	Dim btn As VMButton
	btn.Initialize(vue, btnID, Me)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetColor(btnColor)
	btn.AddIcon(btnIcon, "right", "")
	btn.SetTooltip(btnToolTip)
	If btnValue <> "" Then 
		btn.SetAttrSingle("value", btnValue)
	End If
	AddComponent(btn.ToString)
End Sub

Sub AddButton(btnID As String, btnText As String, btnIcon As String, btnColor As String, btnValue As String, btnToolTip As String)
	Dim btn As VMButton
	btn.Initialize(vue, btnID, Me)
	btn.SetStatic(bStatic)
	btn.SetDesignMode(DesignMode)
	btn.SetColor(btnColor)
	btn.SetLabel(btnText)
	btn.AddIcon(btnIcon, "right", "")
	btn.SetTooltip(btnToolTip)
	If btnValue <> "" Then 
		btn.SetAttrSingle("value", btnValue)
	End If
	AddComponent(btn.ToString)
End Sub

'get component
Sub ToString As String
	Return BtnToggle.ToString
End Sub

Sub SetVModel(k As String) As VMBtnToggle
	BtnToggle.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMBtnToggle
	BtnToggle.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMBtnToggle
	BtnToggle.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMBtnToggle
	Dim childHTML As String = child.ToString
	BtnToggle.SetText(childHTML)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMBtnToggle
	BtnToggle.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMBtnToggle
	BtnToggle.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMBtnToggle
	BtnToggle.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set active-class
Sub SetActiveClass(varActiveClass As String) As VMBtnToggle
	If varActiveClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("active-class", varActiveClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ActiveClass"$
	vue.SetStateSingle(pp, varActiveClass)
	BtnToggle.Bind(":active-class", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As String) As VMBtnToggle
	If varBackgroundColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("background-color", varBackgroundColor)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	BtnToggle.Bind(":background-color", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMBtnToggle
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	BtnToggle.Bind(":color", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As String) As VMBtnToggle
	If varMax = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max", varMax)
		Return Me
	End If
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	BtnToggle.Bind(":max", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMBtnToggle
	If varValue = "" Then Return Me
	If bStatic Then
		SetAttrSingle("value", varValue)
		Return Me
	End If
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	BtnToggle.Bind(":value", pp)
	Return Me
End Sub

'set borderless
Sub SetBorderless(varBorderless As Boolean) As VMBtnToggle
	If varBorderless = False Then Return Me
	If bStatic Then
		SetAttrSingle("borderless", varBorderless)
		Return Me
	End If
	Dim pp As String = $"${ID}Borderless"$
	vue.SetStateSingle(pp, varBorderless)
	BtnToggle.Bind(":borderless", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMBtnToggle
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	BtnToggle.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMBtnToggle
	If varDense = False Then Return Me
	If bStatic Then
		SetAttrSingle("dense", varDense)
		Return Me
	End If
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	BtnToggle.Bind(":dense", pp)
	Return Me
End Sub

'set group
Sub SetGroup(varGroup As Boolean) As VMBtnToggle
	If varGroup = False Then Return Me
	If bStatic Then
		SetAttrSingle("group", varGroup)
		Return Me
	End If
	Dim pp As String = $"${ID}Group"$
	vue.SetStateSingle(pp, varGroup)
	BtnToggle.Bind(":group", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMBtnToggle
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	BtnToggle.Bind(":light", pp)
	Return Me
End Sub

'set mandatory
Sub SetMandatory(varMandatory As Boolean) As VMBtnToggle
	If varMandatory = False Then Return Me
	If bStatic Then
		SetAttrSingle("mandatory", varMandatory)
		Return Me
	End If
	Dim pp As String = $"${ID}Mandatory"$
	vue.SetStateSingle(pp, varMandatory)
	BtnToggle.Bind(":mandatory", pp)
	Return Me
End Sub

'set multiple
Sub SetMultiple(varMultiple As Boolean) As VMBtnToggle
	If varMultiple = False Then Return Me
	If bStatic Then
		SetAttrSingle("multiple", varMultiple)
		Return Me
	End If
	Dim pp As String = $"${ID}Multiple"$
	vue.SetStateSingle(pp, varMultiple)
	BtnToggle.Bind(":multiple", pp)
	Return Me
End Sub

'set rounded
Sub SetRounded(varRounded As Boolean) As VMBtnToggle
	If varRounded = False Then Return Me
	If bStatic Then
		SetAttrSingle("rounded", varRounded)
		Return Me
	End If
	Dim pp As String = $"${ID}Rounded"$
	vue.SetStateSingle(pp, varRounded)
	BtnToggle.Bind(":rounded", pp)
	Return Me
End Sub

'set shaped
Sub SetShaped(varShaped As Boolean) As VMBtnToggle
	If varShaped = False Then Return Me
	If bStatic Then
		SetAttrSingle("shaped", varShaped)
		Return Me
	End If
	Dim pp As String = $"${ID}Shaped"$
	vue.SetStateSingle(pp, varShaped)
	BtnToggle.Bind(":shaped", pp)
	Return Me
End Sub

'set title
Sub SetTitle(varTitle As Boolean) As VMBtnToggle
	If varTitle = False Then Return Me
	If bStatic Then
		SetAttrSingle("title", varTitle)
		Return Me
	End If
	Dim pp As String = $"${ID}Title"$
	vue.SetStateSingle(pp, varTitle)
	BtnToggle.Bind(":title", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMBtnToggle
	BtnToggle.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMBtnToggle
	BtnToggle.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMBtnToggle
	BtnToggle.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMBtnToggle
	BtnToggle.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMBtnToggle
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMBtnToggle
	BtnToggle.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMBtnToggle
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMBtnToggle
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	BtnToggle.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMBtnToggle
	BtnToggle.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMBtnToggle
	BtnToggle.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMBtnToggle
	BtnToggle.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMBtnToggle
	BtnToggle.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMBtnToggle
	BtnToggle.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMBtnToggle
	BtnToggle.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMBtnToggle
	BtnToggle.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMBtnToggle
	BtnToggle.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMBtnToggle
	BtnToggle.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMBtnToggle
	BtnToggle.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMBtnToggle
	BtnToggle.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMBtnToggle
	BtnToggle.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMBtnToggle
	BtnToggle.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMBtnToggle
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMBtnToggle
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMBtnToggle
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMBtnToggle
	BtnToggle.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMBtnToggle
	BtnToggle.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMBtnToggle
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMBtnToggle
	BtnToggle.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMBtnToggle
	BtnToggle.SetText(comp)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMBtnToggle
	BtnToggle.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMBtnToggle
	BtnToggle.SetVisible(b)
	Return Me
End Sub

