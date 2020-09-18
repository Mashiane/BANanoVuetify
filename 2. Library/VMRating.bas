B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Rating As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean
	Private vmodel As String
End Sub

'initialize the Rating
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMRating
	vue = v
	ID = sid.tolowercase
	Rating.Initialize(v, ID)
	Rating.SetTag("v-rating")
	DesignMode = False
	Module = eventHandler
	bStatic = False
	vmodel = ""
	Rating.typeOf = "rating"
	Rating.fieldType = "dbl"
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMRating
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetAttrSingle(prop As String, value As String) As VMRating
	Rating.SetAttrSingle(prop, value)
	Return Me
End Sub
'
Sub SetOnInput(eventHandler As Object,methodName As String) As VMRating
	methodName = methodName.tolowercase
	If SubExists(eventHandler, methodName) = False Then Return Me
	Dim value As Object
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(value))
	SetAttr(CreateMap("@input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub



Sub SetFieldType(ft As String) As VMRating
	Rating.fieldType = ft
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMRating
	bStatic = b
	Rating.SetStatic(b)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMRating
	Rating.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMRating
	Rating.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMRating
	Rating.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMRating
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'get component
Sub ToString As String
	Return Rating.ToString
End Sub

Sub SetVModel(k As String) As VMRating
	vmodel = k.tolowercase
	Rating.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMRating
	Rating.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMRating
	Rating.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMRating
	Dim childHTML As String = child.ToString
	Rating.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMRating
	Rating.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMRating
	Rating.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMRating
	Rating.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMRating
	Rating.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As String) As VMRating
	If varBackgroundColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("background-color", varBackgroundColor)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	Rating.Bind(":background-color", pp)
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Boolean) As VMRating
	If varClearable = False Then Return Me
	If bStatic Then
		SetAttrSingle("clearable", varClearable)
		Return Me
	End If
	Dim pp As String = $"${ID}Clearable"$
	vue.SetStateSingle(pp, varClearable)
	Rating.Bind(":clearable", pp)
	Return Me
End Sub

'set close-delay
Sub SetCloseDelay(varCloseDelay As String) As VMRating
	If varCloseDelay = "" Then Return Me
	If bStatic Then
		SetAttrSingle("close-delay", varCloseDelay)
		Return Me
	End If
	Dim pp As String = $"${ID}CloseDelay"$
	vue.SetStateSingle(pp, varCloseDelay)
	Rating.Bind(":close-delay", pp)
	Return Me
End Sub

'set color
Sub SetColor(color As String) As VMRating
	If color = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", color)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, color)
	Rating.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMRating
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Rating.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMRating
	If varDense = False Then Return Me
	If bStatic Then
		SetAttrSingle("dense", varDense)
		Return Me
	End If
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	Rating.Bind(":dense", pp)
	Return Me
End Sub

'set empty-icon
Sub SetEmptyIcon(varEmptyIcon As String) As VMRating
	If varEmptyIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("empty-icon", varEmptyIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}EmptyIcon"$
	vue.SetStateSingle(pp, varEmptyIcon)
	Rating.Bind(":empty-icon", pp)
	Return Me
End Sub

'set full-icon
Sub SetFullIcon(varFullIcon As String) As VMRating
	If varFullIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("full-icon", varFullIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}FullIcon"$
	vue.SetStateSingle(pp, varFullIcon)
	Rating.Bind(":full-icon", pp)
	Return Me
End Sub

'set half-icon
Sub SetHalfIcon(varHalfIcon As String) As VMRating
	If varHalfIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("half-icon", varHalfIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}HalfIcon"$
	vue.SetStateSingle(pp, varHalfIcon)
	Rating.Bind(":half-icon", pp)
	Return Me
End Sub

'set half-increments
Sub SetHalfIncrements(varHalfIncrements As Boolean) As VMRating
	If varHalfIncrements = False Then Return Me
	If bStatic Then
		SetAttrSingle("half-increments", varHalfIncrements)
		Return Me
	End If
	Dim pp As String = $"${ID}HalfIncrements"$
	vue.SetStateSingle(pp, varHalfIncrements)
	Rating.Bind(":half-increments", pp)
	Return Me
End Sub

'set hover
Sub SetHover(varHover As Boolean) As VMRating
	If varHover = False Then Return Me
	If bStatic Then
		SetAttrSingle("hover", varHover)
		Return Me
	End If
	Dim pp As String = $"${ID}Hover"$
	vue.SetStateSingle(pp, varHover)
	Rating.Bind(":hover", pp)
	Return Me
End Sub

'set large
Sub SetLarge(varLarge As Boolean) As VMRating
	If varLarge = False Then Return Me
	If bStatic Then
		SetAttrSingle("large", varLarge)
		Return Me
	End If
	Dim pp As String = $"${ID}Large"$
	vue.SetStateSingle(pp, varLarge)
	Rating.Bind(":large", pp)
	Return Me
End Sub

'set length
Sub SetLength(varLength As String) As VMRating
	If varLength = "" Then Return Me
	If bStatic Then
		SetAttrSingle("length", varLength)
		Return Me
	End If
	Dim pp As String = $"${ID}Length"$
	vue.SetStateSingle(pp, varLength)
	Rating.Bind(":length", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMRating
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Rating.Bind(":light", pp)
	Return Me
End Sub

'set open-delay
Sub SetOpenDelay(varOpenDelay As String) As VMRating
	If varOpenDelay = "" Then Return Me
	If bStatic Then
		SetAttrSingle("open-delay", varOpenDelay)
		Return Me
	End If
	Dim pp As String = $"${ID}OpenDelay"$
	vue.SetStateSingle(pp, varOpenDelay)
	Rating.Bind(":open-delay", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Boolean) As VMRating
	If varReadonly = False Then Return Me
	If bStatic Then
		SetAttrSingle("readonly", varReadonly)
		Return Me
	End If
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	Rating.Bind(":readonly", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Boolean) As VMRating
	If varRipple Then Return Me
	If bStatic Then
		SetAttrSingle("ripple", varRipple)
		Return Me
	End If
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	Rating.Bind(":ripple", pp)
	Return Me
End Sub

'set size
Sub SetSize(varSize As String) As VMRating
	If varSize = "" Then Return Me
	If bStatic Then
		SetAttrSingle("size", varSize)
		Return Me
	End If
	Dim pp As String = $"${ID}Size"$
	vue.SetStateSingle(pp, varSize)
	Rating.Bind(":size", pp)
	Return Me
End Sub

'set small
Sub SetSmall(varSmall As Boolean) As VMRating
	If varSmall = False Then Return Me
	If bStatic Then
		SetAttrSingle("small", varSmall)
		Return Me
	End If
	Dim pp As String = $"${ID}Small"$
	vue.SetStateSingle(pp, varSmall)
	Rating.Bind(":small", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMRating
	Rating.SetValue(varValue, False)
	vue.SetData(vmodel, varValue)
	Return Me
End Sub

'set x-large
Sub SetXLarge(varXLarge As Boolean) As VMRating
	If varXLarge = False Then Return Me
	If bStatic Then
		SetAttrSingle("x-large", varXLarge)
		Return Me
	End If
	Dim pp As String = $"${ID}XLarge"$
	vue.SetStateSingle(pp, varXLarge)
	Rating.Bind(":x-large", pp)
	Return Me
End Sub

'set x-small
Sub SetXSmall(varXSmall As Boolean) As VMRating
	If varXSmall = False Then Return Me
	If bStatic Then
		SetAttrSingle("x-small", varXSmall)
		Return Me
	End If
	Dim pp As String = $"${ID}XSmall"$
	vue.SetStateSingle(pp, varXSmall)
	Rating.Bind(":x-small", pp)
	Return Me
End Sub

'hide the component
Sub Hide As VMRating
	Rating.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMRating
	Rating.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMRating
	Rating.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMRating
	Rating.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMRating
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMRating
	Rating.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMRating
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMRating
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Rating.Bind(":color", pp)
	Return Me
End Sub


'set background-color
Sub SetBackgroundColorIntensity(backgroundColor As String, backgroundintensity As String) As VMRating
	If backgroundColor = "" Then Return Me
	Dim scolor As String = $"${backgroundColor} ${backgroundintensity}"$
	If bStatic Then
		SetAttrSingle("background-color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, scolor)
	Rating.Bind(":background-color", pp)
	Return Me
End Sub


'remove an attribute
public Sub RemoveAttr(sName As String) As VMRating
	Rating.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMRating
	Rating.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMRating
	Rating.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMRating
	Rating.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMRating
	Rating.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMRating
	Rating.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMRating
	Rating.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMRating
	Rating.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMRating
	Rating.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMRating
	Rating.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMRating
	Rating.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMRating
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMRating
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMRating
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMRating
Rating.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMRating
Rating.SetVisible(b)
Return Me
End Sub

