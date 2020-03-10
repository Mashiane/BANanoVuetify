B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public BottomSheet As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public Container As VMContainer
End Sub

'initialize the BottomSheet
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMBottomSheet
	ID = sid.tolowercase
	BottomSheet.Initialize(v, ID)
	BottomSheet.SetTag("v-bottom-sheet")
	DesignMode = False
	Module = eventHandler
	vue = v
	Container.Initialize(vue, $"${ID}container"$, Module)
	Return Me
End Sub

'get component
Sub ToString As String
	AddComponent(Container.ToString)
	Return BottomSheet.ToString
End Sub

Sub SetVModel(k As String) As VMBottomSheet
	BottomSheet.SetVModel(k)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMBottomSheet
	BottomSheet.SetText(comp)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMBottomSheet
	BottomSheet.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMBottomSheet
	BottomSheet.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMBottomSheet
	Dim childHTML As String = child.ToString
	BottomSheet.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMBottomSheet
	BottomSheet.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMBottomSheet
	BottomSheet.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMBottomSheet
	BottomSheet.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMBottomSheet
	BottomSheet.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set activator
Sub SetActivator(varActivator As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Activator"$
	vue.SetStateSingle(pp, varActivator)
	BottomSheet.Bind(":activator", pp)
	Return Me
End Sub

'set attach
Sub SetAttach(varAttach As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Attach"$
	vue.SetStateSingle(pp, varAttach)
	BottomSheet.Bind(":attach", pp)
	Return Me
End Sub

'set content-class
Sub SetContentClass(varContentClass As Object) As VMBottomSheet
	Dim pp As String = $"${ID}ContentClass"$
	vue.SetStateSingle(pp, varContentClass)
	BottomSheet.Bind(":content-class", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	BottomSheet.Bind(":dark", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Disabled"$
	vue.SetStateSingle(pp, varDisabled)
	BottomSheet.Bind(":disabled", pp)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	BottomSheet.Bind(":eager", pp)
	Return Me
End Sub

'set fullscreen
Sub SetFullscreen(varFullscreen As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Fullscreen"$
	vue.SetStateSingle(pp, varFullscreen)
	BottomSheet.Bind(":fullscreen", pp)
	Return Me
End Sub

'set hide-overlay
Sub SetHideOverlay(varHideOverlay As Object) As VMBottomSheet
	Dim pp As String = $"${ID}HideOverlay"$
	vue.SetStateSingle(pp, varHideOverlay)
	BottomSheet.Bind(":hide-overlay", pp)
	Return Me
End Sub

'set inset
Sub SetInset(varInset As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Inset"$
	vue.SetStateSingle(pp, varInset)
	BottomSheet.Bind(":inset", pp)
	Return Me
End Sub

'set internal-activator
Sub SetInternalActivator(varInternalActivator As Object) As VMBottomSheet
	Dim pp As String = $"${ID}InternalActivator"$
	vue.SetStateSingle(pp, varInternalActivator)
	BottomSheet.Bind(":internal-activator", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	BottomSheet.Bind(":light", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As Object) As VMBottomSheet
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	BottomSheet.Bind(":max-width", pp)
	Return Me
End Sub

'set no-click-animation
Sub SetNoClickAnimation(varNoClickAnimation As Object) As VMBottomSheet
	Dim pp As String = $"${ID}NoClickAnimation"$
	vue.SetStateSingle(pp, varNoClickAnimation)
	BottomSheet.Bind(":no-click-animation", pp)
	Return Me
End Sub

'set open-on-hover
Sub SetOpenOnHover(varOpenOnHover As Object) As VMBottomSheet
	Dim pp As String = $"${ID}OpenOnHover"$
	vue.SetStateSingle(pp, varOpenOnHover)
	BottomSheet.Bind(":open-on-hover", pp)
	Return Me
End Sub

'set origin
Sub SetOrigin(varOrigin As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Origin"$
	vue.SetStateSingle(pp, varOrigin)
	BottomSheet.Bind(":origin", pp)
	Return Me
End Sub

'set overlay-color
Sub SetOverlayColor(varOverlayColor As Object) As VMBottomSheet
	Dim pp As String = $"${ID}OverlayColor"$
	vue.SetStateSingle(pp, varOverlayColor)
	BottomSheet.Bind(":overlay-color", pp)
	Return Me
End Sub

'set overlay-opacity
Sub SetOverlayOpacity(varOverlayOpacity As Object) As VMBottomSheet
	Dim pp As String = $"${ID}OverlayOpacity"$
	vue.SetStateSingle(pp, varOverlayOpacity)
	BottomSheet.Bind(":overlay-opacity", pp)
	Return Me
End Sub

'set persistent
Sub SetPersistent(varPersistent As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Persistent"$
	vue.SetStateSingle(pp, varPersistent)
	BottomSheet.Bind(":persistent", pp)
	Return Me
End Sub

'set retain-focus
Sub SetRetainFocus(varRetainFocus As Object) As VMBottomSheet
	Dim pp As String = $"${ID}RetainFocus"$
	vue.SetStateSingle(pp, varRetainFocus)
	BottomSheet.Bind(":retain-focus", pp)
	Return Me
End Sub

'set scrollable
Sub SetScrollable(varScrollable As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Scrollable"$
	vue.SetStateSingle(pp, varScrollable)
	BottomSheet.Bind(":scrollable", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	BottomSheet.Bind(":transition", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	BottomSheet.Bind(":value", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMBottomSheet
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	BottomSheet.Bind(":width", pp)
	Return Me
End Sub

'
Sub SetSlotActions(b As Boolean) As VMBottomSheet    'ignore
	SetAttr(CreateMap("slot": "actions"))
	Return Me
End Sub

'
Sub SetSlotIcon(b As Boolean) As VMBottomSheet    'ignore
	SetAttr(CreateMap("slot": "icon"))
	Return Me
End Sub


'hide the component
Sub Hide As VMBottomSheet
	vue.SetStateSingle($"${ID}show"$, False)
	Return Me
End Sub

'show the component
Sub Show As VMBottomSheet
	vue.SetStateSingle($"${ID}show"$, True)
	Return Me
End Sub

'enable the component
Sub Enable As VMBottomSheet
	vue.SetStateSingle($"${ID}disabled"$, False)
	Return Me
End Sub

'disable the component
Sub Disable As VMBottomSheet
	vue.SetStateSingle($"${ID}disabled"$, True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMBottomSheet
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMBottomSheet
	BottomSheet.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMBottomSheet
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMBottomSheet
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	BottomSheet.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMBottomSheet
	BottomSheet.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMBottomSheet
	BottomSheet.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMBottomSheet
	BottomSheet.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMBottomSheet
	BottomSheet.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMBottomSheet
	BottomSheet.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMBottomSheet
	BottomSheet.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMBottomSheet
	BottomSheet.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMBottomSheet
	BottomSheet.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMBottomSheet
	BottomSheet.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVElse(vif As String) As VMBottomSheet
	BottomSheet.SetVElse(vif)
	Return Me
End Sub

Sub SetVText(vhtml As String) As VMBottomSheet
	BottomSheet.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMBottomSheet
	BottomSheet.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMBottomSheet
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMBottomSheet
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMBottomSheet
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMBottomSheet
	BottomSheet.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMBottomSheet
	BottomSheet.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMBottomSheet
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMBottomSheet
	BottomSheet.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub
