B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ZDialog As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private module As Object
	Private DesignMode As Boolean
	Private BANano As BANano  'ignore
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMZDialog
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	ZDialog.Initialize(vue, ID).SetTag("z-dialog ")
	DesignMode = False
	SetOnDone
	Return Me
End Sub

'set onclick event
private Sub SetOnDone As VMZDialog
	Dim methodName As String = $"${ID}_done"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttrSingle("@done", methodName)
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub Hide
	vue.SetStateSingle($"${ID}show"$, False)
End Sub

Sub Show
	vue.SetStateSingle($"${ID}show"$, True)
End Sub

Sub Enable
	vue.SetStateSingle($"${ID}disabled"$, False)
End Sub

Sub Disable
	vue.SetStateSingle($"${ID}disabled"$, True)
End Sub

Sub AddSpot(spot As VMZSpot) As VMZDialog
	spot.pop(ZDialog)
	Return Me
End Sub

Sub SetSelfClose As VMZDialog
	ZDialog.setattrsingle("self-close", True)
	Return Me
End Sub

'set the border of the element
Sub SetBorder(width As String, color As String, bstyle As String) As VMZDialog
	ZDialog.SetBorder(width, color, bstyle)
	Return Me
End Sub


Sub SetText(t As String) As VMZDialog
	ZDialog.SetText(t)
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMZDialog
	ZDialog.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMZDialog
	ZDialog.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMZDialog
	ZDialog.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMZDialog
	ZDialog.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMZDialog
	ZDialog.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMZDialog
	ZDialog.SetName(varName, bind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMZDialog
	ZDialog.SetDisabled(b)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMZDialog
	ZDialog.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMZDialog
	ZDialog.SetVShow(vif)
	Return Me
End Sub

private Sub SetVModel(k As String) As VMZDialog
	ZDialog.SetVModel(k)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMZDialog
	ZDialog.AddClass(c)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMZDialog
	ZDialog.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMZDialog
	ZDialog.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMZDialog
	ZDialog.SetStyle(m)
	Return Me
End Sub

Sub SetHeight(h As String) As VMZDialog
	ZDialog.SetStyleSingle("height", h)
	Return Me
End Sub


Sub SetWidth(w As String) As VMZDialog
	ZDialog.SetStyleSingle("width", w)
	Return Me
End Sub


'set an attribute
Sub SetAttr(attr As Map) As VMZDialog
	ZDialog.SetAttr(attr)
	Return Me
End Sub

Sub ToString As String
	RemoveAttr("ref")
	RemoveAttr(":disabled")
	RemoveAttr(":required")
	RemoveAttr(":class")
	RemoveAttr("v-model")
	RemoveAttr("tabindex")
	RemoveAttr(":md-active.sync")
	RemoveAttr(":style")
	Return ZDialog.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMZDialog
ZDialog.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
'Sub SetVisible(b As Boolean) As VMZDialog
ZDialog.SetVisible(b)
Return Me
End Sub