B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public PrismComponent As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private codeKey As String
	Private Card As VMCard
	Private PC As BANanoObject
End Sub

'initialize the PrismComponent
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMPrism
	vue = v
	Module = eventHandler
	PC.Initialize("PrismComponent")
	vue.AddComponentBO("prism", PC)
	
	BANano.DependsOnAsset("fileSaver.min.js")
	BANano.DependsOnAsset("jszip.min.js")
	'
	BANano.DependsOnAsset("prism.css")
	BANano.DependsOnAsset("prism.js")
	BANano.DependsOnAsset("vue-prism-component.min.js")
	'
	BANano.DependsOnAsset("beautify.js")
	BANano.DependsOnAsset("beautify-css.js")
	BANano.DependsOnAsset("beautify-html.js")
	'
	ID = sid.tolowercase
	PrismComponent.Initialize(v, ID)
	PrismComponent.SetTag("prism")
	DesignMode = False
	codeKey =  $"${ID}code"$
	vue.SetStateSingle(codeKey, "")
	Bind(":code", codeKey)
	Card.Initialize(vue, $"${ID}card"$, Module) 
	Card.ToolBar.AddTitle("Source Code", "")
	Return Me
End Sub

Sub SetTitle(sTitle As String)
	Card.ToolBar.UpdateTitle(sTitle)
End Sub

'get component
Sub ToString As String
	Card.ToolBar.SetDense(True)
	Card.ToolBar.SetFlat(True)
	Card.ToolBar.AddSpacer
	Card.ToolBar.AddIcon($"${ID}copy"$, "mdi-content-copy", "Copy content", "")
	Card.Actions.SetVisible(False)
	Card.Container.SetTag("div")
	Card.Container.AddControlS(PrismComponent, PrismComponent.ToString,1,1,12,12,12,12)  
	'Return PrismComponent.ToString
	Return Card.ToString
End Sub

Sub SetVIf(vif As Object) As VMPrism
PrismComponent.SetVIf(vif)
Return Me
End Sub

Sub SetVShow(vif As Object) As VMPrism
PrismComponent.SetVShow(vif)
Return Me
End Sub

'add to app template
Sub Render
vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMPrism
Dim childHTML As String = child.ToString
PrismComponent.SetText(childHTML)
Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMPrism
PrismComponent.AddClass(c)
Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMPrism
PrismComponent.SetAttr(attr)
Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMPrism
PrismComponent.SetStyle(sm)
Return Me
End Sub

'add children
Sub AddChildren(children As List)
For Each childx As VMElement In children
AddChild(childx)
Next
End Sub

'set code
Sub SetCode(varCode As String) As VMPrism
	vue.SetStateSingle(codeKey, varCode)
	Return Me
End Sub

'set inline
Sub SetInline(varInline As Object) As VMPrism
	Dim pp As String = $"${ID}Inline"$
	vue.SetStateSingle(pp, varInline)
	PrismComponent.Bind(":inline", pp)
	Return Me
End Sub

'set language
Sub SetLanguage(varLanguage As Object) As VMPrism
Dim pp As String = $"${ID}Language"$
vue.SetStateSingle(pp, varLanguage)
PrismComponent.Bind(":language", pp)
Return Me
End Sub


'hide the component
Sub Hide As VMPrism
	PrismComponent.SetVisible(False)
    Return Me
End Sub

'show the component
Sub Show As VMPrism
	PrismComponent.SetVisible(True)
    Return Me
End Sub

'enable the component
Sub Enable As VMPrism
	PrismComponent.Enable(True)
    Return Me
End Sub

'disable the component
Sub Disable As VMPrism
	PrismComponent.Disable(True)
    Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMPrism
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMPrism
	PrismComponent.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMPrism
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMPrism
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	PrismComponent.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMPrism
	PrismComponent.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMPrism
	PrismComponent.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMPrism
	PrismComponent.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMPrism
	PrismComponent.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMPrism
	PrismComponent.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMPrism
	PrismComponent.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMPrism
	PrismComponent.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMPrism
	PrismComponent.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMPrism
	PrismComponent.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMPrism
	PrismComponent.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMPrism
	PrismComponent.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMPrism
	PrismComponent.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMPrism
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMPrism
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMPrism
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMPrism
	PrismComponent.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMPrism
	PrismComponent.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMPrism
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMPrism
	PrismComponent.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMPrism
	PrismComponent.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMPrism
	PrismComponent.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMPrism
PrismComponent.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub


Sub SetVisible(b As Boolean) As VMPrism
PrismComponent.SetVisible(b)
Return Me
End Sub


'set color intensity
Sub SetTextColor(varColor As String) As VMPrism
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMPrism
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub
