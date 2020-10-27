B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public DataFooter As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the DataFooter
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDataFooter
	ID = sid.tolowercase
	DataFooter.Initialize(v, ID)
	DataFooter.SetTag("v-data-footer")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	DataFooter.SetText(elm.ToString)
End Sub

Sub SetData(prop As String, value As Object) As VMDataFooter
	vue.SetData(prop, value)
	Return Me
End Sub


'get component
Sub ToString As String
	Return DataFooter.ToString
End Sub

Sub SetVModel(k As String) As VMDataFooter
	DataFooter.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMDataFooter
	DataFooter.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMDataFooter
	DataFooter.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMDataFooter
	Dim childHTML As String = child.ToString
	DataFooter.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMDataFooter
	DataFooter.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMDataFooter
	DataFooter.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDataFooter
	DataFooter.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMDataFooter
	DataFooter.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set disable-items-per-page
Sub SetDisableItemsPerPage(varDisableItemsPerPage As Object) As VMDataFooter
	Dim pp As String = $"${ID}DisableItemsPerPage"$
	vue.SetStateSingle(pp, varDisableItemsPerPage)
	DataFooter.Bind(":disable-items-per-page", pp)
	Return Me
End Sub

'set disable-pagination
Sub SetDisablePagination(varDisablePagination As Object) As VMDataFooter
	Dim pp As String = $"${ID}DisablePagination"$
	vue.SetStateSingle(pp, varDisablePagination)
	DataFooter.Bind(":disable-pagination", pp)
	Return Me
End Sub

'set first-icon
Sub SetFirstIcon(varFirstIcon As Object) As VMDataFooter
	Dim pp As String = $"${ID}FirstIcon"$
	vue.SetStateSingle(pp, varFirstIcon)
	DataFooter.Bind(":first-icon", pp)
	Return Me
End Sub

'set items-per-page-all-text
Sub SetItemsPerPageAllText(varItemsPerPageAllText As Object) As VMDataFooter
	Dim pp As String = $"${ID}ItemsPerPageAllText"$
	vue.SetStateSingle(pp, varItemsPerPageAllText)
	DataFooter.Bind(":items-per-page-all-text", pp)
	Return Me
End Sub

'set items-per-page-options
Sub SetItemsPerPageOptions(varItemsPerPageOptions As Object) As VMDataFooter
	Dim pp As String = $"${ID}ItemsPerPageOptions"$
	vue.SetStateSingle(pp, varItemsPerPageOptions)
	DataFooter.Bind(":items-per-page-options", pp)
	Return Me
End Sub

'set items-per-page-text
Sub SetItemsPerPageText(varItemsPerPageText As Object) As VMDataFooter
	Dim pp As String = $"${ID}ItemsPerPageText"$
	vue.SetStateSingle(pp, varItemsPerPageText)
	DataFooter.Bind(":items-per-page-text", pp)
	Return Me
End Sub

'set last-icon
Sub SetLastIcon(varLastIcon As Object) As VMDataFooter
	Dim pp As String = $"${ID}LastIcon"$
	vue.SetStateSingle(pp, varLastIcon)
	DataFooter.Bind(":last-icon", pp)
	Return Me
End Sub

'set next-icon
Sub SetNextIcon(varNextIcon As Object) As VMDataFooter
	Dim pp As String = $"${ID}NextIcon"$
	vue.SetStateSingle(pp, varNextIcon)
	DataFooter.Bind(":next-icon", pp)
	Return Me
End Sub

'set options
Sub SetOptions(varOptions As Object) As VMDataFooter
	Dim pp As String = $"${ID}Options"$
	vue.SetStateSingle(pp, varOptions)
	DataFooter.Bind(":options", pp)
	Return Me
End Sub

'set page-text
Sub SetPageText(varPageText As Object) As VMDataFooter
	Dim pp As String = $"${ID}PageText"$
	vue.SetStateSingle(pp, varPageText)
	DataFooter.Bind(":page-text", pp)
	Return Me
End Sub

'set pagination
Sub SetPagination(varPagination As Object) As VMDataFooter
	Dim pp As String = $"${ID}Pagination"$
	vue.SetStateSingle(pp, varPagination)
	DataFooter.Bind(":pagination", pp)
	Return Me
End Sub

'set prev-icon
Sub SetPrevIcon(varPrevIcon As Object) As VMDataFooter
	Dim pp As String = $"${ID}PrevIcon"$
	vue.SetStateSingle(pp, varPrevIcon)
	DataFooter.Bind(":prev-icon", pp)
	Return Me
End Sub

'set show-current-page
Sub SetShowCurrentPage(varShowCurrentPage As Object) As VMDataFooter
	Dim pp As String = $"${ID}ShowCurrentPage"$
	vue.SetStateSingle(pp, varShowCurrentPage)
	DataFooter.Bind(":show-current-page", pp)
	Return Me
End Sub

'set show-first-last-page
Sub SetShowFirstLastPage(varShowFirstLastPage As Object) As VMDataFooter
	Dim pp As String = $"${ID}ShowFirstLastPage"$
	vue.SetStateSingle(pp, varShowFirstLastPage)
	DataFooter.Bind(":show-first-last-page", pp)
	Return Me
End Sub

'
Sub SetSlotPageText(b As Boolean) As VMDataFooter    'ignore
	SetAttr(CreateMap("slot": "page-text"))
	Return Me
End Sub

'
Sub SetOnUpdateOptions(methodName As String) As VMDataFooter
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@update:options": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'hide the component
Sub Hide As VMDataFooter
	DataFooter.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMDataFooter
	DataFooter.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMDataFooter
	DataFooter.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMDataFooter
	DataFooter.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMDataFooter
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMDataFooter
	DataFooter.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMDataFooter
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMDataFooter
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	DataFooter.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMDataFooter
	DataFooter.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMDataFooter
	DataFooter.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMDataFooter
	DataFooter.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMDataFooter
	DataFooter.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMDataFooter
	DataFooter.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMDataFooter
	DataFooter.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMDataFooter
	DataFooter.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMDataFooter
	DataFooter.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMDataFooter
	DataFooter.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMDataFooter
	DataFooter.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMDataFooter
	DataFooter.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMDataFooter
	DataFooter.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMDataFooter
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMDataFooter
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMDataFooter
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMDataFooter
	DataFooter.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMDataFooter
	DataFooter.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMDataFooter
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMDataFooter
	DataFooter.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMDataFooter
	DataFooter.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMDataFooter
	DataFooter.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMDataFooter
DataFooter.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMDataFooter
DataFooter.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMDataFooter
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMDataFooter
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub