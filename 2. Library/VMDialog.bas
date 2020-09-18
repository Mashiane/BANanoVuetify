B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Dialog As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private Card As VMCard
	Public Title As VMCardTitle
	Public Content As VMCardText
	Public Actions As VMCardActions
	Public Container As VMContainer
	Private titleKey As String
	Private contentKey As String
	Private bStatic As Boolean
	Private Form As VMForm
End Sub

'initialize the Dialog
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDialog
	ID = sid.tolowercase
	Dialog.Initialize(v, ID)
	Dialog.SetTag("v-dialog")
	DesignMode = False
	Module = eventHandler
	vue = v
	SetVModel(ID)
	Card.Initialize(vue, $"${ID}card"$, eventHandler)
	Card.IsDialog = True
	Title = Card.title
	Content = Card.text
	Actions = Card.Actions
	Form = Card.Form
	Container = Form.Container
	Actions.AddSpacer
	'
	Title.AddClass("headline")
	titleKey = $"${ID}title"$
	contentKey = $"${ID}content"$
	bStatic = False
	Return Me
End Sub

Sub SetData(prop As String, value As Object) As VMDialog
	vue.SetData(prop, value)
	Return Me
End Sub


Sub RemoveVModel As VMDialog
	RemoveAttr("v-model")
	Return Me
End Sub


Sub Validate
	Card.Form.validate
End Sub

Sub Reset
	Card.Form.Reset	
End Sub

Sub ResetValidation
	Card.Form.ResetValidation
End Sub

Sub SetStatic(b As Boolean) As VMDialog
	bStatic = b
	Dialog.SetStatic(b)
	Card.setstatic(b)
	Container.SetStatic(b)
	Return Me
End Sub

'make the container a div
Sub MakeDiv As VMDialog
	Dialog.SetTag("div")
	Return Me
End Sub

'set defaults of the container
Sub SetDefaults
	Container.SetDefaults
End Sub

'get data from the container
Sub GetData As Map
	Return Container.GetData
End Sub

'get required fields
Sub Required As Map
	Return Container.Required
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMDialog
	Dialog.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMDialog
	Dialog.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMDialog
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set the title of the dialog
Sub SetTitle(sTitle As String) As VMDialog
	If bStatic Then
		Title.SetText(sTitle)
		Return Me
	End If
	vue.SetStateSingle(titleKey, sTitle)
	Title.SetText($"{{ ${titleKey} }}"$)
	Return Me
End Sub

Sub SetContent(sContent As String) As VMDialog
	If bStatic Then
		Content.SetText(sContent)
		Return Me
	End If
	vue.SetStateSingle(contentKey, sContent)
	Content.SetText($"{{ ${contentKey} }}"$)
	Return Me
End Sub

'update the title of the dialog
Sub UpdateTitle(sTitle As String) As VMDialog
	vue.SetStateSingle(titleKey, sTitle)
	Return Me
End Sub

Sub SetModal(b As Boolean) As VMDialog
	If b = False Then Return Me
	SetPersistent(True)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMDialog
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMDialog
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)	
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Dialog.Bind(":color", pp)
	Return Me
End Sub

Sub SetOK(okID As String, okCaption As String) As VMDialog
	AddOK(okID, okCaption)
	Return Me
End Sub

Sub AddOK(okID As String, okCaption As String) As VMDialog
	Dim btnOK As VMButton
	btnOK.Initialize(vue, okID, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	btnOK.SetPrimary(True)
	btnOK.SetLabel(okCaption)
	btnOK.SetTransparent(True)
	btnOK.Pop(Actions.CardActions)
	Return Me
End Sub

Sub SetCancel(cancelID As String, cancelCaption As String) As VMDialog
	AddCANCEL(cancelID, cancelCaption)
	Return Me
End Sub

Sub AddButton(btn As VMButton) As VMDialog
	btn.pop(Actions.CardActions)
	Return Me
End Sub

Sub AddCANCEL(cancelID As String, cancelCaption As String) As VMDialog
	Dim btnCancel As VMButton
	btnCancel.Initialize(vue, cancelID, Module).SetStatic(bStatic).SetDesignMode(DesignMode)
	btnCancel.SetLabel(cancelCaption)
	btnCancel.SetAccent(True)
	btnCancel.SetTransparent(True)
	btnCancel.Pop(Actions.CardActions)
	Return Me
End Sub

Sub SetTitlePrimary(b As Boolean) As VMDialog
	If b = False Then Return Me
	Card.Title.SetAttrSingle("primary-title", True)
	Return Me
End Sub

Sub ToString As String
	Card.Pop(Dialog)
	Return Dialog.tostring
End Sub

Sub SetVModel(k As String) As VMDialog
	Dialog.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMDialog
	Dialog.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMDialog
	Dialog.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMDialog
	Dim childHTML As String = child.ToString
	Dialog.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMDialog
	Dialog.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMDialog
	Dialog.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDialog
	Dialog.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMDialog
	Dialog.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set activator
Sub SetActivator(varActivator As String) As VMDialog
	If varActivator = "" Then Return Me
	If bStatic Then
		SetAttrSingle("activator", varActivator)
		Return Me
	End If
	Dim pp As String = $"${ID}Activator"$
	vue.SetStateSingle(pp, varActivator)
	Dialog.Bind(":activator", pp)
	Return Me
End Sub

'set attach
Sub SetAttach(varAttach As Boolean) As VMDialog
	If varAttach = False Then Return Me
	If bStatic Then
		SetAttrSingle("attach", varAttach)
		Return Me
	End If
	Dim pp As String = $"${ID}Attach"$
	vue.SetStateSingle(pp, varAttach)
	Dialog.Bind(":attach", pp)
	Return Me
End Sub

'set content-class
Sub SetContentClass(varContentClass As String) As VMDialog
	If varContentClass = "" Then Return Me
	If bStatic Then
		SetAttrSingle("content-class", varContentClass)
		Return Me
	End If
	Dim pp As String = $"${ID}ContentClass"$
	vue.SetStateSingle(pp, varContentClass)
	Dialog.Bind(":content-class", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMDialog
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Dialog.Bind(":dark", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMDialog
	Dialog.SetDisabled(varDisabled)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Boolean) As VMDialog
	If varEager = False Then Return Me
	If bStatic Then
		SetAttrSingle("eager", varEager)
		Return Me
	End If
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	Dialog.Bind(":eager", pp)
	Return Me
End Sub

'set fullscreen
Sub SetFullscreen(varFullscreen As Boolean) As VMDialog
	If varFullscreen = False Then Return Me
	If bStatic Then
		SetAttrSingle("fullscreen", varFullscreen)
		Return Me
	End If
	Dim pp As String = $"${ID}fullscreen"$
	vue.SetStateSingle(pp, varFullscreen)
	Dialog.Bind(":fullscreen", pp)
	Return Me
End Sub

'set hide-overlay
Sub SetHideOverlay(varHideOverlay As Boolean) As VMDialog
	If varHideOverlay = False Then Return Me
	Dialog.SetAttrLoose("hide-overlay")
	Return Me
End Sub

'backward compatibility
Sub SetBackdrop(b As Boolean) As VMDialog
	SetHideOverlay(b)
	Return Me
End Sub

'set internal-activator
Sub SetInternalActivator(varInternalActivator As Boolean) As VMDialog
	If varInternalActivator = False Then Return Me
	If bStatic Then
		SetAttrSingle("internal-activator", varInternalActivator)
		Return Me
	End If
	Dim pp As String = $"${ID}InternalActivator"$
	vue.SetStateSingle(pp, varInternalActivator)
	Dialog.Bind(":internal-activator", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMDialog
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Dialog.Bind(":light", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As String) As VMDialog
	If varMaxWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-width", varMaxWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Dialog.Bind(":max-width", pp)
	Return Me
End Sub

'set no-click-animation
Sub SetNoClickAnimation(varNoClickAnimation As Boolean) As VMDialog
	If varNoClickAnimation = False Then Return Me
	If bStatic Then
		SetAttrSingle("no-click-animation", varNoClickAnimation)
		Return Me
	End If
	Dim pp As String = $"${ID}NoClickAnimation"$
	vue.SetStateSingle(pp, varNoClickAnimation)
	Dialog.Bind(":no-click-animation", pp)
	Return Me
End Sub

'set open-on-hover
Sub SetOpenOnHover(varOpenOnHover As Boolean) As VMDialog
	If varOpenOnHover = False Then Return Me
	If bStatic Then
		SetAttrSingle("open-on-hover", varOpenOnHover)
		Return Me
	End If
	Dim pp As String = $"${ID}OpenOnHover"$
	vue.SetStateSingle(pp, varOpenOnHover)
	Dialog.Bind(":open-on-hover", pp)
	Return Me
End Sub

'set origin
Sub SetOrigin(varOrigin As String) As VMDialog
	If varOrigin = "" Then Return Me
	If bStatic Then
		SetAttrSingle("origin", varOrigin)
		Return Me
	End If
	Dim pp As String = $"${ID}Origin"$
	vue.SetStateSingle(pp, varOrigin)
	Dialog.Bind(":origin", pp)
	Return Me
End Sub

'set overlay-color
Sub SetOverlayColor(varOverlayColor As String) As VMDialog
	If varOverlayColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("overlay-color", varOverlayColor)
		Return Me
	End If
	Dim pp As String = $"${ID}OverlayColor"$
	vue.SetStateSingle(pp, varOverlayColor)
	Dialog.Bind(":overlay-color", pp)
	Return Me
End Sub

'set color intensity
Sub SetOverlayColorIntensity(varColor As String, varIntensity As String) As VMDialog
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("overlay-color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, scolor)
	Dialog.Bind(":overlay-color", pp)
	Return Me
End Sub

'set overlay-opacity
Sub SetOverlayOpacity(varOverlayOpacity As String) As VMDialog
	If varOverlayOpacity = "" Then Return Me
	If bStatic Then
		SetAttrSingle("overlay-opacity", varOverlayOpacity)
		Return Me
	End If
	Dim pp As String = $"${ID}OverlayOpacity"$
	vue.SetStateSingle(pp, varOverlayOpacity)
	Dialog.Bind(":overlay-opacity", pp)
	Return Me
End Sub

'set persistent
Sub SetPersistent(varPersistent As Boolean) As VMDialog
	If varPersistent = False Then Return Me
	If bStatic Then
		SetAttrSingle("persistent", varPersistent)
		Return Me
	End If
	Dim pp As String = $"${ID}Persistent"$
	vue.SetStateSingle(pp, varPersistent)
	Dialog.Bind(":persistent", pp)
	Return Me
End Sub

'set retain-focus
Sub SetRetainFocus(varRetainFocus As Boolean) As VMDialog
	If varRetainFocus Then Return Me
	If bStatic Then
		SetAttrSingle("retain-focus", varRetainFocus)
		Return Me
	End If
	Dim pp As String = $"${ID}RetainFocus"$
	vue.SetStateSingle(pp, varRetainFocus)
	Dialog.Bind(":retain-focus", pp)
	Return Me
End Sub

'set scrollable
Sub SetScrollable(varScrollable As Boolean) As VMDialog
	If varScrollable = False Then Return Me
	If bStatic Then
		SetAttrSingle("scrollable", varScrollable)
		Return Me
	End If
	Dim pp As String = $"${ID}scrollable"$
	vue.SetStateSingle(pp, varScrollable)
	Dialog.Bind(":scrollable", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As String) As VMDialog
	If varTransition = "" Then Return Me
	If bStatic Then
		SetAttrSingle("transition", varTransition)
		Return Me
	End If
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	Dialog.Bind(":transition", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Boolean) As VMDialog
	Dialog.SetValue(varValue, False)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As String) As VMDialog
	If varWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("width", varWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	Dialog.Bind(":width", pp)
	Return Me
End Sub

'
Sub SetSlotActivator(b As Boolean) As VMDialog    'ignore
	SetAttr(CreateMap("slot": "activator"))
	Return Me
End Sub

'
Sub SetOnClickOutside(methodName As String) As VMDialog
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@click:outside": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnInput(methodName As String) As VMDialog
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnKeydown(methodName As String) As VMDialog
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("@keydown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMDialog
	vue.SetStateSingle(ID, False)
	Return Me
End Sub

Sub Show As VMDialog
	Container.SetDefaults
	vue.SetStateSingle(ID, True)
	Return Me
End Sub

Sub Enable As VMDialog
	Dialog.Enable(True)
	Return Me
End Sub

Sub Disable As VMDialog
	Dialog.Disable(True)
	Return Me
End Sub

'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMDialog
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMDialog
	Dialog.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMDialog
	Dialog.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMDialog
	Dialog.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMDialog
	Dialog.SetDesignMode(b)
	DesignMode = b
	Card.SetDesignMode(b)
	Container.SetDesignMode(b)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMDialog
	Dialog.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMDialog
	Dialog.SetName(varName, bbind)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMDialog
	Dialog.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMDialog
	Dialog.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub SetHeight(h As String) As VMDialog
	If h = "" Then Return Me
	Dialog.SetStyleSingle("height", h)
	Return Me
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMDialog
	Dialog.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMDialog
	Dialog.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMDialog
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMDialog
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub