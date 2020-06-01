B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
'https://openbase.io/js/vue-count-to
Sub Class_Globals
Public CountTo As VMElement
Public ID As String
Private vue As BANanoVue
Private BANano As BANano  'ignore
Private DesignMode As Boolean
Private Module As Object
Private Static As Boolean
End Sub

'initialize the CountTo
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCountTo
	BANano.DependsOnAsset("info-box.min.css")
	BANano.DependsOnAsset("vue-count-to.min.js")
	BANano.DependsOnAsset("helpers.min.css")
	'
	ID = sid.tolowercase
	CountTo.Initialize(v, ID)
	CountTo.SetTag("count-to")
	DesignMode = False
	Module = eventHandler
	vue = v
	Static = False
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMCountTo
	Static = b
	CountTo.setstatic(b)
	Return Me
End Sub

'get component
Sub ToString As String
Return CountTo.ToString
End Sub

Sub SetVModel(k As String) As VMCountTo
CountTo.SetVModel(k)
Return Me
End Sub

Sub SetVIf(vif As Object) As VMCountTo
CountTo.SetVIf(vif)
Return Me
End Sub

Sub SetVShow(vif As Object) As VMCountTo
CountTo.SetVShow(vif)
Return Me
End Sub

'add to app template
Sub Render
vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCountTo
Dim childHTML As String = child.ToString
CountTo.SetText(childHTML)
Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCountTo
CountTo.SetText(t)
Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCountTo
CountTo.AddClass(c)
Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCountTo
CountTo.SetAttr(attr)
Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCountTo
CountTo.SetStyle(sm)
Return Me
End Sub

'add children
Sub AddChildren(children As List)
For Each childx As VMElement In children
AddChild(childx)
Next
End Sub

'set startVal
Sub SetStartval(varStartval As String) As VMCountTo
	varStartval = BANano.parseFloat(varStartval)
	If Static Then
		SetAttrSingle("start-val", varStartval)
		Return Me
	End If
	Dim pp As String = $"${ID}Startval"$
	vue.SetStateSingle(pp, varStartval)
	CountTo.Bind(":start-val", pp)
	Return Me
End Sub

'set endVal
Sub SetEndval(varEndval As String) As VMCountTo
	varEndval = BANano.parseFloat(varEndval)
	If Static Then
		SetAttrSingle("end-val", varEndval)
		Return Me
	End If
	Dim pp As String = $"${ID}Endval"$
	vue.SetStateSingle(pp, varEndval)
	CountTo.Bind(":end-val", pp)
	Return Me
End Sub

'set duration
Sub SetDuration(varDuration As String) As VMCountTo
	varDuration = BANano.parseFloat(varDuration)
	If Static Then
		SetAttrSingle("duration", varDuration)
		Return Me
	End If
	Dim pp As String = $"${ID}Duration"$
	vue.SetStateSingle(pp, varDuration)
	CountTo.Bind(":duration", pp)
	Return Me
End Sub

'set autoplay
Sub SetAutoplay(varAutoplay As Boolean) As VMCountTo
	If Static Then
		SetAttrSingle("autoplay", varAutoplay)
		Return Me
	End If
	Dim pp As String = $"${ID}Autoplay"$
	vue.SetStateSingle(pp, varAutoplay)
	CountTo.Bind(":autoplay", pp)
	Return Me
End Sub

'set decimals
Sub SetDecimals(varDecimals As String) As VMCountTo
	varDecimals = BANano.parseint(varDecimals)
	If Static Then
		SetAttrSingle("decimals", varDecimals)
		Return Me
	End If
	Dim pp As String = $"${ID}Decimals"$
	vue.SetStateSingle(pp, varDecimals)
	CountTo.Bind(":decimals", pp)
	Return Me
End Sub

'set decimal
Sub SetDecimal(varDecimal As String) As VMCountTo
	If Static Then
		SetAttrSingle("decimal", varDecimal)
		Return Me
	End If
	Dim pp As String = $"${ID}Decimal"$
	vue.SetStateSingle(pp, varDecimal)
	CountTo.Bind(":decimal", pp)
	Return Me
End Sub

'set separator
Sub SetSeparator(varSeparator As String) As VMCountTo
	If Static Then
		SetAttrSingle("separator", varSeparator)
		Return Me
	End If
	Dim pp As String = $"${ID}Separator"$
	vue.SetStateSingle(pp, varSeparator)
	CountTo.Bind(":separator", pp)
	Return Me
End Sub

'set prefix
Sub SetPrefix(varPrefix As String) As VMCountTo
	If Static Then
		SetAttrSingle("prefix", varPrefix)
		Return Me
	End If
	Dim pp As String = $"${ID}Prefix"$
	vue.SetStateSingle(pp, varPrefix)
	CountTo.Bind(":prefix", pp)
	Return Me
End Sub

'set suffix
Sub SetSuffix(varSuffix As String) As VMCountTo
	If Static Then
		SetAttrSingle("suffix", varSuffix)
		Return Me
	End If
	Dim pp As String = $"${ID}Suffix"$
	vue.SetStateSingle(pp, varSuffix)
	CountTo.Bind(":suffix", pp)
	Return Me
End Sub

'set useEasing
Sub SetUseEasing(varUseeasing As Boolean) As VMCountTo
	If varUseeasing = False Then Return Me
	If Static Then
		SetAttrSingle("use-easing", varUseeasing)
		Return Me
	End If
	Dim pp As String = $"${ID}Useeasing"$
	vue.SetStateSingle(pp, varUseeasing)
	CountTo.Bind(":use-easing", pp)
	Return Me
End Sub

'set easingFn
Sub SetEasingFn(varEasingfn As String) As VMCountTo
	Dim pp As String = $"${ID}Easingfn"$
	vue.SetStateSingle(pp, varEasingfn)
	CountTo.Bind(":easing-fn", pp)
	Return Me
End Sub


'hide the component
Sub Hide As VMCountTo
	CountTo.SetVisible(False)
    Return Me
End Sub

'show the component
Sub Show As VMCountTo
	CountTo.SetVisible(True)
    Return Me
End Sub

'enable the component
Sub Enable As VMCountTo
	CountTo.Enable(True)
    Return Me
End Sub

'disable the component
Sub Disable As VMCountTo
	CountTo.Disable(True)
    Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCountTo
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMCountTo
	CountTo.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMCountTo
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMCountTo
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	CountTo.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMCountTo
	CountTo.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCountTo
	CountTo.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMCountTo
	CountTo.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMCountTo
	CountTo.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMCountTo
	CountTo.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCountTo
	CountTo.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMCountTo
	CountTo.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMCountTo
	CountTo.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMCountTo
	CountTo.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMCountTo
	CountTo.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMCountTo
	CountTo.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMCountTo
	CountTo.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCountTo
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMCountTo
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMCountTo
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMCountTo
	CountTo.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMCountTo
	CountTo.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMCountTo
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMCountTo
	CountTo.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMCountTo
	CountTo.SetText(comp)
	Return Me
End Sub


Sub SetTextCenter As VMCountTo
	CountTo.AddClass("text-center")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCountTo
CountTo.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub


Sub SetVisible(b As Boolean) As VMCountTo
CountTo.SetVisible(b)
Return Me
End Sub

