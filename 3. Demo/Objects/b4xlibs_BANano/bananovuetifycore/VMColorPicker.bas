B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ColorPicker As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object    'ignore
	Private vmodel As String
End Sub

'initialize the ColorPicker
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMColorPicker
	ID = sid.tolowercase
	ColorPicker.Initialize(v, ID)
	ColorPicker.SetTag("v-color-picker")
	DesignMode = False
	Module = eventHandler
	vue = v
	vmodel = ""
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMColorPicker
	ColorPicker.SetRC(sRow, sCol)
	Return Me
End Sub

Sub SetData(prop As String, value As Object) As VMColorPicker
	vue.SetData(prop, value)
	Return Me
End Sub


'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMColorPicker
	ColorPicker.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMColorPicker
	ColorPicker.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMColorPicker
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'get component
Sub ToString As String
	Return ColorPicker.ToString
End Sub

Sub SetVModel(k As String) As VMColorPicker
	ColorPicker.SetVModel(k)
	vmodel = k.tolowercase
	Return Me
End Sub

Sub SetVIf(vif As String) As VMColorPicker
	ColorPicker.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMColorPicker
	ColorPicker.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMColorPicker
	Dim childHTML As String = child.ToString
	ColorPicker.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMColorPicker
	ColorPicker.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMColorPicker
	ColorPicker.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMColorPicker
	ColorPicker.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMColorPicker
	ColorPicker.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set canvas-height
Sub SetCanvasHeight(varCanvasHeight As Object) As VMColorPicker
	Dim pp As String = $"${ID}CanvasHeight"$
	vue.SetStateSingle(pp, varCanvasHeight)
	ColorPicker.Bind(":canvas-height", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMColorPicker
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	ColorPicker.Bind(":dark", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMColorPicker
	ColorPicker.SetDisabled(varDisabled)
	Return Me
End Sub

'set dot-size
Sub SetDotSize(varDotSize As Object) As VMColorPicker
	Dim pp As String = $"${ID}DotSize"$
	vue.SetStateSingle(pp, varDotSize)
	ColorPicker.Bind(":dot-size", pp)
	Return Me
End Sub

'set flat
Sub SetFlat(varFlat As Object) As VMColorPicker
	Dim pp As String = $"${ID}Flat"$
	vue.SetStateSingle(pp, varFlat)
	ColorPicker.Bind(":flat", pp)
	Return Me
End Sub

'set hide-canvas
Sub SetHideCanvas(varHideCanvas As Object) As VMColorPicker
	Dim pp As String = $"${ID}HideCanvas"$
	vue.SetStateSingle(pp, varHideCanvas)
	ColorPicker.Bind(":hide-canvas", pp)
	Return Me
End Sub

'set hide-inputs
Sub SetHideInputs(varHideInputs As Object) As VMColorPicker
	Dim pp As String = $"${ID}HideInputs"$
	vue.SetStateSingle(pp, varHideInputs)
	ColorPicker.Bind(":hide-inputs", pp)
	Return Me
End Sub

'set hide-mode-switch
Sub SetHideModeSwitch(varHideModeSwitch As Object) As VMColorPicker
	Dim pp As String = $"${ID}HideModeSwitch"$
	vue.SetStateSingle(pp, varHideModeSwitch)
	ColorPicker.Bind(":hide-mode-switch", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMColorPicker
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	ColorPicker.Bind(":light", pp)
	Return Me
End Sub

'set mode
Sub SetMode(varMode As Object) As VMColorPicker
	Dim pp As String = $"${ID}Mode"$
	vue.SetStateSingle(pp, varMode)
	ColorPicker.Bind(":mode", pp)
	Return Me
End Sub

'set show-swatches
Sub SetShowSwatches(varShowSwatches As Object) As VMColorPicker
	Dim pp As String = $"${ID}ShowSwatches"$
	vue.SetStateSingle(pp, varShowSwatches)
	ColorPicker.Bind(":show-swatches", pp)
	Return Me
End Sub

'set swatches
Sub SetSwatches(varSwatches As Object) As VMColorPicker
	Dim pp As String = $"${ID}Swatches"$
	vue.SetStateSingle(pp, varSwatches)
	ColorPicker.Bind(":swatches", pp)
	Return Me
End Sub

'set swatches-max-height
Sub SetSwatchesMaxHeight(varSwatchesMaxHeight As Object) As VMColorPicker
	Dim pp As String = $"${ID}SwatchesMaxHeight"$
	vue.SetStateSingle(pp, varSwatchesMaxHeight)
	ColorPicker.Bind(":swatches-max-height", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As String) As VMColorPicker
	ColorPicker.SetValue(varValue,False)
	vue.SetData(vmodel, varValue)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMColorPicker
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	ColorPicker.Bind(":width", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMColorPicker
	ColorPicker.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMColorPicker
	ColorPicker.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMColorPicker
	ColorPicker.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMColorPicker
	ColorPicker.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMColorPicker
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMColorPicker
	ColorPicker.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMColorPicker
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMColorPicker
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	ColorPicker.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMColorPicker
	ColorPicker.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMColorPicker
	ColorPicker.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMColorPicker
	ColorPicker.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMColorPicker
	ColorPicker.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMColorPicker
	ColorPicker.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMColorPicker
	ColorPicker.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMColorPicker
	ColorPicker.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMColorPicker
	ColorPicker.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMColorPicker
	ColorPicker.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMColorPicker
	ColorPicker.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMColorPicker
	ColorPicker.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMColorPicker
	ColorPicker.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMColorPicker
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMColorPicker
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMColorPicker
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMColorPicker
ColorPicker.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMColorPicker
ColorPicker.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMColorPicker
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMColorPicker
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub