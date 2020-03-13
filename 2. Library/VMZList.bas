B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ZList As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private module As Object
	Private DesignMode As Boolean
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMZList
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	ZList.Initialize(vue, ID).SetTag("z-list").SetAttrSingle("slot","extension")
	DesignMode = False
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

Sub SetItems(items As String) As VMZList
	ZList.Bind(":items", items)
	Return Me
End Sub

Sub SetPerPage(perPage As Int) As VMZList
	Dim pp As String = $"${ID}perpage"$
	vue.setstatesingle(pp, perPage)
	ZList.bind(":per-page", pp)
	Return Me
End Sub

Sub AddSpot(spot As VMZSpot) As VMZList
	spot.pop(ZList)
	Return Me
End Sub

'set the border of the element
Sub SetBorder(width As String, color As String, bstyle As String) As VMZList
	ZList.SetBorder(width, color, bstyle)
	Return Me
End Sub


Sub SetText(t As String) As VMZList
	ZList.SetText(t)
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMZList
	ZList.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMZList
	ZList.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMZList
	ZList.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMZList
	ZList.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMZList
	ZList.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMZList
	ZList.SetName(varName, bind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMZList
	ZList.SetDisabled(b)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMZList
	ZList.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMZList
	ZList.SetVShow(vif)
	Return Me
End Sub

private Sub SetVModel(k As String) As VMZList
	ZList.SetVModel(k)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMZList
	ZList.AddClass(c)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMZList
	ZList.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMZList
	ZList.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMZList
	ZList.SetStyle(m)
	Return Me
End Sub

Sub SetHeight(h As String) As VMZList
	ZList.SetStyleSingle("height", h)
	Return Me
End Sub


Sub SetWidth(w As String) As VMZList
	ZList.SetStyleSingle("width", w)
	Return Me
End Sub


'set an attribute
Sub SetAttr(attr As Map) As VMZList
	ZList.SetAttr(attr)
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
	Return ZList.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMZList
ZList.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
'Sub SetVisible(b As Boolean) As VMZList
ZList.SetVisible(b)
Return Me
End Sub