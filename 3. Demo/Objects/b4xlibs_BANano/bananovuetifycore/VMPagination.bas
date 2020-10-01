B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Pagination As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object   'ignore
	Private bStatic As Boolean   'ignore
End Sub

'initialize the Pagination
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMPagination
	ID = sid.tolowercase
	Pagination.Initialize(v, ID)
	Pagination.SetTag("v-pagination")
	vue = v
	DesignMode = False
	Module = eventHandler
	bStatic = False
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMPagination
	vue.SetData(xprop, xValue)
	Return Me
End Sub



'get component
Sub ToString As String
	Return Pagination.ToString
End Sub

Sub SetVModel(k As String) As VMPagination
	Pagination.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMPagination
	Pagination.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMPagination
	Pagination.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMPagination
	Dim childHTML As String = child.ToString
	Pagination.SetText(childHTML)
	Return Me
End Sub

'link a data-table to the pagination
Sub SetDataTable(tblID As String) As VMPagination
	tblID = tblID.tolowercase
	SetAttrSingle(":length", $"${tblID}pagecount"$)
	SetAttrSingle("v-model", $"${tblID}page"$)
	vue.SetData($"${tblID}page"$, "1")
	vue.SetData($"${tblID}pagecount"$, "0")
	SetCircle(True)
	Return Me
End Sub


'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMPagination
	Pagination.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMPagination
	Pagination.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMPagination
	Pagination.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As String) As VMPagination
	if varColor = "" Then Return Me
	if bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Pagination.Bind(":color", pp)
	Return Me
End Sub

'set length
Sub SetLength(varLength As String) As VMPagination
	if varLength = "" Then Return Me
	If varLength = "0" Then Return Me
	If bStatic Then
		SetAttrSingle("length", varLength)
		Return Me
	End If
	Dim pp As String = $"${ID}Length"$
	vue.SetStateSingle(pp, varLength)
	Pagination.Bind(":length", pp)
	Return Me
End Sub

'set next-icon
Sub SetNextIcon(varNextIcon As String) As VMPagination
	If varNextIcon = "" Then Return Me
	If varNextIcon = "$next" Then Return Me
	If bStatic Then
		SetAttrSingle("next-icon", varNextIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}NextIcon"$
	vue.SetStateSingle(pp, varNextIcon)
	Pagination.Bind(":next-icon", pp)
	Return Me
End Sub

'set prev-icon
Sub SetPrevIcon(varPrevIcon As String) As VMPagination
	If varPrevIcon = "" Then Return Me
	If varPrevIcon = "$prev" Then Return Me
	If bStatic Then
		SetAttrSingle("prev-icon", varPrevIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}PrevIcon"$
	vue.SetStateSingle(pp, varPrevIcon)
	Pagination.Bind(":prev-icon", pp)
	Return Me
End Sub

'set total-visible
Sub SetTotalVisible(varTotalVisible As String) As VMPagination
	If varTotalVisible = "" Then Return Me
	If bStatic Then
		SetAttrSingle("total-visible", varTotalVisible)
		Return Me
	End If
	Dim pp As String = $"${ID}TotalVisible"$
	vue.SetStateSingle(pp, varTotalVisible)
	Pagination.Bind(":total-visible", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMPagination
	If varValue = "" Then Return Me
	If varValue = "0" Then Return Me
	If bStatic Then
		SetAttrSingle("value", varValue)
		Return Me
	End If
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	Pagination.Bind(":value", pp)
	Return Me
End Sub

'set circle
Sub SetCircle(varCircle As Boolean) As VMPagination
	If varCircle = False Then Return Me
	If bStatic Then
		SetAttrSingle("circle", varCircle)
		Return Me
	End If
	Dim pp As String = $"${ID}Circle"$
	vue.SetStateSingle(pp, varCircle)
	Pagination.Bind(":circle", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMPagination
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Pagination.Bind(":dark", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMPagination
	if varDisabled = False Then Return Me
	if bStatic Then
		SetAttrSingle("disabled", varDisabled)
		Return Me
	End If
	Dim pp As String = $"${ID}Disabled"$
	vue.SetStateSingle(pp, varDisabled)
	Pagination.Bind(":disabled", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMPagination
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Pagination.Bind(":light", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMPagination
	Pagination.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMPagination
	Pagination.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMPagination
	Pagination.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMPagination
	Pagination.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMPagination
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMPagination
	Pagination.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMPagination
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(color As String, intensity As String) As VMPagination
	If color = "" Then Return Me
	Dim scolor As String = $"${color} ${intensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Pagination.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMPagination
	Pagination.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMPagination
	Pagination.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMPagination
	Pagination.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMPagination
	Pagination.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set static
Sub SetStatic(b As Boolean) As VMPagination
	Pagination.SetStatic(b)
	bStatic = b
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String, bbind As Boolean) As VMPagination
	Pagination.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMPagination
	Pagination.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMPagination
	Pagination.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMPagination
	Pagination.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMPagination
	Pagination.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMPagination
	Pagination.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMPagination
	Pagination.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMPagination
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMPagination
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMPagination
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMPagination
	Pagination.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMPagination
	Pagination.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMPagination
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMPagination
	Pagination.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMPagination
	Pagination.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMPagination
	Pagination.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMPagination
	Pagination.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub


Sub SetVisible(b As Boolean) As VMPagination
	Pagination.SetVisible(b)
	Return Me
End Sub


Sub SetOnInput(methodName As String) As VMPagination
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim value As Object
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(value))
	SetAttr(CreateMap("@input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnNext(methodName As String) As VMPagination
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@next": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnPrevious(methodName As String) As VMPagination
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@previous": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub