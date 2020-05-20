B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public EditDialog As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the EditDialog
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMEditDialog
	ID = sid.tolowercase
	EditDialog.Initialize(v, ID)
	EditDialog.SetTag("v-edit-dialog")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return EditDialog.ToString
End Sub

Sub SetVModel(k As String) As VMEditDialog
	EditDialog.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMEditDialog
	EditDialog.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMEditDialog
	EditDialog.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMEditDialog
	Dim childHTML As String = child.ToString
	EditDialog.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMEditDialog
	EditDialog.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMEditDialog
	EditDialog.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMEditDialog
	EditDialog.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMEditDialog
	EditDialog.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set cancel-text
Sub SetCancelText(varCancelText As Object) As VMEditDialog
	Dim pp As String = $"${ID}CancelText"$
	vue.SetStateSingle(pp, varCancelText)
	EditDialog.Bind(":cancel-text", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMEditDialog
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	EditDialog.Bind(":dark", pp)
	Return Me
End Sub

'set eager
Sub SetEager(varEager As Object) As VMEditDialog
	Dim pp As String = $"${ID}Eager"$
	vue.SetStateSingle(pp, varEager)
	EditDialog.Bind(":eager", pp)
	Return Me
End Sub

'set large
Sub SetLarge(varLarge As Object) As VMEditDialog
	Dim pp As String = $"${ID}Large"$
	vue.SetStateSingle(pp, varLarge)
	EditDialog.Bind(":large", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMEditDialog
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	EditDialog.Bind(":light", pp)
	Return Me
End Sub

'set persistent
Sub SetPersistent(varPersistent As Object) As VMEditDialog
	Dim pp As String = $"${ID}Persistent"$
	vue.SetStateSingle(pp, varPersistent)
	EditDialog.Bind(":persistent", pp)
	Return Me
End Sub

'set return-value
Sub SetReturnValue(varReturnValue As Object) As VMEditDialog
	Dim pp As String = $"${ID}ReturnValue"$
	vue.SetStateSingle(pp, varReturnValue)
	EditDialog.Bind(":return-value", pp)
	Return Me
End Sub

'set save-text
Sub SetSaveText(varSaveText As Object) As VMEditDialog
	Dim pp As String = $"${ID}SaveText"$
	vue.SetStateSingle(pp, varSaveText)
	EditDialog.Bind(":save-text", pp)
	Return Me
End Sub

'set transition
Sub SetTransition(varTransition As Object) As VMEditDialog
	Dim pp As String = $"${ID}Transition"$
	vue.SetStateSingle(pp, varTransition)
	EditDialog.Bind(":transition", pp)
	Return Me
End Sub

'
Sub SetSlotInput(b As Boolean) As VMEditDialog    'ignore
	SetAttr(CreateMap("slot": "input"))
	Return Me
End Sub

'
Sub SetOnCancel(methodName As String) As VMEditDialog
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:cancel": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClose(methodName As String) As VMEditDialog
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:close": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnOpen(methodName As String) As VMEditDialog
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:open": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnSave(methodName As String) As VMEditDialog
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:save": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'hide the component
Sub Hide As VMEditDialog
	EditDialog.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMEditDialog
	EditDialog.SetVisible(True)
	Return Me
End Sub

'enable the component
Sub Enable As VMEditDialog
	EditDialog.Enable(True)
	Return Me
End Sub

'disable the component
Sub Disable As VMEditDialog
	EditDialog.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMEditDialog
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMEditDialog
	EditDialog.SetAttrLoose(loose)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMEditDialog
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMEditDialog
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	EditDialog.Bind(":color", pp)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMEditDialog
	EditDialog.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMEditDialog
	EditDialog.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMEditDialog
	EditDialog.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMEditDialog
	EditDialog.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set tab index
Sub SetTabIndex(ti As String) As VMEditDialog
	EditDialog.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMEditDialog
	EditDialog.SetName(varName, bbind)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMEditDialog
	EditDialog.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMEditDialog
	EditDialog.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMEditDialog
	EditDialog.BindStyleSingle(prop, value)
	Return Me
End Sub


Sub SetVText(vhtml As String) As VMEditDialog
	EditDialog.SetVText(vhtml)
	Return Me
End Sub

Sub SetVhtml(vhtml As String) As VMEditDialog
	EditDialog.SetVHtml(vhtml)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMEditDialog
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VMEditDialog
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttrSingle("v-for", sline)
	Return Me
End Sub

Sub SetKey(k As String) As VMEditDialog
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMEditDialog
EditDialog.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMEditDialog
EditDialog.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMEditDialog
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMEditDialog
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub