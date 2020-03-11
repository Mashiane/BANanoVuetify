B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ZCanvas As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private module As Object
	Private DesignMode As Boolean
	Private compID As String
	Private views As Map
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMZCanvas
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	ZCanvas.Initialize(vue, ID).SetTag("z-canvas")
	DesignMode = False
	compID = $"${ID}views"$
	vue.SetStateSingle(compID, CreateMap())
	ZCanvas.SetAttrSingle(":views", compID)
	views.Initialize
	Return Me
End Sub

Sub AddView(view As VMZView)
	Dim cid As String = view.ID
	Dim comp As Map = view.ZView.component
	views.Put(cid, comp)
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

'set the border of the element
Sub SetBorder(width As String, color As String, bstyle As String) As VMZCanvas
	ZCanvas.SetBorder(width, color, bstyle)
	Return Me
End Sub


Sub SetText(t As String) As VMZCanvas
	ZCanvas.SetText(t)
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMZCanvas
	ZCanvas.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMZCanvas
	ZCanvas.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMZCanvas
	ZCanvas.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMZCanvas
	ZCanvas.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMZCanvas
	ZCanvas.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMZCanvas
	ZCanvas.SetName(varName, bind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMZCanvas
	ZCanvas.SetDisabled(b)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMZCanvas
	ZCanvas.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMZCanvas
	ZCanvas.SetVShow(vif)
	Return Me
End Sub

private Sub SetVModel(k As String) As VMZCanvas
	ZCanvas.SetVModel(k)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMZCanvas
	ZCanvas.AddClass(c)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMZCanvas
	ZCanvas.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMZCanvas
	ZCanvas.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMZCanvas
	ZCanvas.SetStyle(m)
	Return Me
End Sub

Sub SetHeight(h As String) As VMZCanvas
	ZCanvas.SetStyleSingle("height", h)
	Return Me
End Sub


Sub SetWidth(w As String) As VMZCanvas
	ZCanvas.SetStyleSingle("width", w)
	Return Me
End Sub


'set an attribute
Sub SetAttr(attr As Map) As VMZCanvas
	ZCanvas.SetAttr(attr)
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
	vue.SetStateSingle(compID, views)
	Return ZCanvas.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMZCanvas
ZCanvas.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub