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
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the Rating
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMRating
	ID = sid.tolowercase
	Rating.Initialize(v, ID)
	Rating.SetTag("v-rating")
	DesignMode = False
	Module = eventHandler
	vue = v
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
	Rating.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMRating
	Rating.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMRating
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
Sub SetBackgroundColor(varBackgroundColor As Object) As VMRating
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	Rating.Bind(":background-color", pp)
	Return Me
End Sub

'set clearable
Sub SetClearable(varClearable As Object) As VMRating
	Dim pp As String = $"${ID}Clearable"$
	vue.SetStateSingle(pp, varClearable)
	Rating.Bind(":clearable", pp)
	Return Me
End Sub

'set close-delay
Sub SetCloseDelay(varCloseDelay As Object) As VMRating
	Dim pp As String = $"${ID}CloseDelay"$
	vue.SetStateSingle(pp, varCloseDelay)
	Rating.Bind(":close-delay", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMRating
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Rating.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMRating
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Rating.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMRating
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	Rating.Bind(":dense", pp)
	Return Me
End Sub

'set empty-icon
Sub SetEmptyIcon(varEmptyIcon As Object) As VMRating
	Dim pp As String = $"${ID}EmptyIcon"$
	vue.SetStateSingle(pp, varEmptyIcon)
	Rating.Bind(":empty-icon", pp)
	Return Me
End Sub

'set full-icon
Sub SetFullIcon(varFullIcon As Object) As VMRating
	Dim pp As String = $"${ID}FullIcon"$
	vue.SetStateSingle(pp, varFullIcon)
	Rating.Bind(":full-icon", pp)
	Return Me
End Sub

'set half-icon
Sub SetHalfIcon(varHalfIcon As Object) As VMRating
	Dim pp As String = $"${ID}HalfIcon"$
	vue.SetStateSingle(pp, varHalfIcon)
	Rating.Bind(":half-icon", pp)
	Return Me
End Sub

'set half-increments
Sub SetHalfIncrements(varHalfIncrements As Object) As VMRating
	Dim pp As String = $"${ID}HalfIncrements"$
	vue.SetStateSingle(pp, varHalfIncrements)
	Rating.Bind(":half-increments", pp)
	Return Me
End Sub

'set hover
Sub SetHover(varHover As Object) As VMRating
	Dim pp As String = $"${ID}Hover"$
	vue.SetStateSingle(pp, varHover)
	Rating.Bind(":hover", pp)
	Return Me
End Sub

'set large
Sub SetLarge(varLarge As Object) As VMRating
	Dim pp As String = $"${ID}Large"$
	vue.SetStateSingle(pp, varLarge)
	Rating.Bind(":large", pp)
	Return Me
End Sub

'set length
Sub SetLength(varLength As Object) As VMRating
	Dim pp As String = $"${ID}Length"$
	vue.SetStateSingle(pp, varLength)
	Rating.Bind(":length", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMRating
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Rating.Bind(":light", pp)
	Return Me
End Sub

'set open-delay
Sub SetOpenDelay(varOpenDelay As Object) As VMRating
	Dim pp As String = $"${ID}OpenDelay"$
	vue.SetStateSingle(pp, varOpenDelay)
	Rating.Bind(":open-delay", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMRating
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	Rating.Bind(":readonly", pp)
	Return Me
End Sub

'set ripple
Sub SetRipple(varRipple As Object) As VMRating
	Dim pp As String = $"${ID}Ripple"$
	vue.SetStateSingle(pp, varRipple)
	Rating.Bind(":ripple", pp)
	Return Me
End Sub

'set size
Sub SetSize(varSize As Object) As VMRating
	Dim pp As String = $"${ID}Size"$
	vue.SetStateSingle(pp, varSize)
	Rating.Bind(":size", pp)
	Return Me
End Sub

'set small
Sub SetSmall(varSmall As Object) As VMRating
	Dim pp As String = $"${ID}Small"$
	vue.SetStateSingle(pp, varSmall)
	Rating.Bind(":small", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMRating
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	Rating.Bind(":value", pp)
	Return Me
End Sub

'set x-large
Sub SetXLarge(varXLarge As Object) As VMRating
	Dim pp As String = $"${ID}XLarge"$
	vue.SetStateSingle(pp, varXLarge)
	Rating.Bind(":x-large", pp)
	Return Me
End Sub

'set x-small
Sub SetXSmall(varXSmall As Object) As VMRating
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
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMRating
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Rating.Bind(":color", pp)
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

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMRating
	Rating.SetAttrSingle(prop, value)
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