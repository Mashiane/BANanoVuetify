B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
'https://github.com/juliorosseti/vue-select-sides
Sub Class_Globals
Public SelectSides As VMElement
Public ID As String
Private vue As BANanoVue
Private BANano As BANano  'ignore
Private DesignMode As Boolean
Private Module As Object
Private items As List
Private selected As String
Private lst As String
End Sub

'initialize the SelectSides
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSelectSides
ID = sid.tolowercase
	SelectSides.Initialize(v, ID)
	SelectSides.SetTag("vue-select-sides")
	DesignMode = False
	Module = eventHandler
	vue = v
	items.Initialize
	SetType("mirror") 
	lst = $"${ID}list"$
	vue.SetData(lst, Array())
	SetList(lst)
	Return Me
End Sub

'source from a list
Sub SetDataList(recs As List) As VMSelectSides
	For Each k As String In recs
		Dim nrec As Map = CreateMap()
		nrec.Put("value", k)
		nrec.Put("label", k)
		items.Add(nrec)
	Next
	vue.SetData(lst, items)	
	Return Me
End Sub

'source from a map
Sub SetOptions(recs As Map) As VMSelectSides
	For Each k As String In recs.keys
		Dim v As String = recs.Get(k)
		Dim nrec As Map = CreateMap()
		nrec.Put("value", k)
		nrec.Put("label", v)
		items.Add(nrec)
	Next
	vue.SetData(lst, items)
	Return Me
End Sub

'get component
Sub ToString As String
Return SelectSides.ToString
End Sub

Sub SetVModel(k As String) As VMSelectSides
	k = k.tolowercase
	SelectSides.SetVModel(k)
	vue.SetData(k, Array())
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMSelectSides
SelectSides.SetVIf(vif)
Return Me
End Sub

Sub SetVShow(vif As Object) As VMSelectSides
SelectSides.SetVShow(vif)
Return Me
End Sub

'add to app template
Sub Render
vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSelectSides
Dim childHTML As String = child.ToString
SelectSides.SetText(childHTML)
Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSelectSides
SelectSides.SetText(t)
Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSelectSides
SelectSides.AddClass(c)
Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSelectSides
SelectSides.SetAttr(attr)
Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSelectSides
SelectSides.SetStyle(sm)
Return Me
End Sub

'add children
Sub AddChildren(children As List)
For Each childx As VMElement In children
AddChild(childx)
Next
End Sub

'set type
Sub SetType(varType As Object) As VMSelectSides
Dim pp As String = $"${ID}Type"$
vue.SetStateSingle(pp, varType)
SelectSides.Bind(":type", pp)
Return Me
End Sub

'set list
Sub SetList(varList As String) As VMSelectSides
	SelectSides.Bind(":list", varList)
	Return Me
End Sub

'set search
Sub SetSearch(varSearch As Object) As VMSelectSides
Dim pp As String = $"${ID}Search"$
vue.SetStateSingle(pp, varSearch)
SelectSides.Bind(":search", pp)
Return Me
End Sub

'set total
Sub SetTotal(varTotal As Object) As VMSelectSides
Dim pp As String = $"${ID}Total"$
vue.SetStateSingle(pp, varTotal)
SelectSides.Bind(":total", pp)
Return Me
End Sub

'set toggle-all
Sub SetToggleAll(varToggleAll As Object) As VMSelectSides
Dim pp As String = $"${ID}ToggleAll"$
vue.SetStateSingle(pp, varToggleAll)
SelectSides.Bind(":toggle-all", pp)
Return Me
End Sub

'set sort-selected-up
Sub SetSortSelectedUp(varSortSelectedUp As Object) As VMSelectSides
Dim pp As String = $"${ID}SortSelectedUp"$
vue.SetStateSingle(pp, varSortSelectedUp)
SelectSides.Bind(":sort-selected-up", pp)
Return Me
End Sub

'set order-by
Sub SetOrderBy(varOrderBy As Object) As VMSelectSides
Dim pp As String = $"${ID}OrderBy"$
vue.SetStateSingle(pp, varOrderBy)
SelectSides.Bind(":order-by", pp)
Return Me
End Sub

'set lang
Sub SetLang(varLang As Object) As VMSelectSides
Dim pp As String = $"${ID}Lang"$
vue.SetStateSingle(pp, varLang)
SelectSides.Bind(":lang", pp)
Return Me
End Sub

'set placeholder-search-left
Sub SetPlaceholderSearchLeft(varPlaceholderSearchLeft As Object) As VMSelectSides
Dim pp As String = $"${ID}PlaceholderSearchLeft"$
vue.SetStateSingle(pp, varPlaceholderSearchLeft)
SelectSides.Bind(":placeholder-search-left", pp)
Return Me
End Sub

'set placeholder-search-right
Sub SetPlaceholderSearchRight(varPlaceholderSearchRight As Object) As VMSelectSides
Dim pp As String = $"${ID}PlaceholderSearchRight"$
vue.SetStateSingle(pp, varPlaceholderSearchRight)
SelectSides.Bind(":placeholder-search-right", pp)
Return Me
End Sub


'hide the component
Sub Hide As VMSelectSides
	SelectSides.SetVisible(False)
    Return Me
End Sub

'show the component
Sub Show As VMSelectSides
	SelectSides.SetVisible(True)
    Return Me
End Sub

'enable the component
Sub Enable As VMSelectSides
	SelectSides.Enable(True)
    Return Me
End Sub

'disable the component
Sub Disable As VMSelectSides
	SelectSides.Disable(True)
    Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSelectSides
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMSelectSides
	SelectSides.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMSelectSides
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMSelectSides
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	SelectSides.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMSelectSides
	SelectSides.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSelectSides
	SelectSides.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMSelectSides
	SelectSides.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMSelectSides
	SelectSides.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMSelectSides
	SelectSides.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSelectSides
	SelectSides.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMSelectSides
	SelectSides.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMSelectSides
	SelectSides.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMSelectSides
	SelectSides.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMSelectSides
	SelectSides.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMSelectSides
	SelectSides.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMSelectSides
	SelectSides.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSelectSides
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMSelectSides
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMSelectSides
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSelectSides
	SelectSides.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSelectSides
	SelectSides.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSelectSides
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSelectSides
	SelectSides.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMSelectSides
	SelectSides.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMSelectSides
	SelectSides.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSelectSides
SelectSides.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub


Sub SetVisible(b As Boolean) As VMSelectSides
SelectSides.SetVisible(b)
Return Me
End Sub


'set color intensity
Sub SetTextColor(varColor As String) As VMSelectSides
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMSelectSides
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub
