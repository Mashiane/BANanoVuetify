B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ZSpot As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private module As Object
	Private DesignMode As Boolean
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMZSpot
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	ZSpot.Initialize(vue, ID).SetTag("z-spot")
	DesignMode = False
	Return Me
End Sub

Sub SetQty(qty As Int) As VMZSpot
	Dim pp As String = $"${ID}qty"$
	vue.setstatesingle(pp, qty)
	ZSpot.bind(":qty", pp)
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

Sub SetSlot(slot As String) As VMZSpot
	ZSpot.SetAttrSingle("slot", slot)
	Return Me
End Sub

Sub SetSlotExtension As VMZSpot
	SetSlot("extension")
	Return Me
End Sub

Sub SetButton As VMZSpot
	ZSpot.SetAttrSingle("button", True)
	Return Me
End Sub

Sub SetSlotScopes(slotscopes As String) As VMZSpot
	ZSpot.SetAttrSingle("slot-scope",slotscopes)
	Return Me
End Sub

Sub SetIndex(index As String) As VMZSpot
	ZSpot.SetAttrSingle(":index", index)
	Return Me
End Sub


Sub SetSizeXLarge As VMZSpot
	SetSize("xl")
	Return Me
End Sub


Sub SetSizeXSmall As VMZSpot
	SetSize("xs")
	Return Me
End Sub

Sub SetSizeXXSmall As VMZSpot
	SetSize("xxs")
	Return Me
End Sub

Sub SetKnob(knob As Boolean) As VMZSpot
	Dim pp As String = $"${ID}knob"$
	vue.setstatesingle(pp, knob)
	ZSpot.bind(":knob", pp)
	Return Me
End Sub

Sub SetSlider As VMZSpot
	Dim pp As String = $"${ID}slider"$
	vue.setstatesingle(pp, True)
	ZSpot.Bind(":slider", pp)
	Return Me
End Sub

Sub SetProgress(progress As Int) As VMZSpot
	Dim pp As String = $"${ID}progress"$
	vue.setstatesingle(pp, progress)
	ZSpot.bind(":progress", pp)
	Return Me
End Sub

Sub SetLabel(lbl As String) As VMZSpot
	Dim pp As String = $"${ID}label"$
	vue.setstatesingle(pp, lbl)
	ZSpot.bind(":label", pp)
	Return Me
End Sub

Sub SetImagePath(imagePath As String) As VMZSpot
	Dim pp As String = $"${ID}imagePath"$
	vue.setstatesingle(pp, imagePath)
	ZSpot.Bind(":imagePath", pp)
	Return Me
End Sub

Sub SetAngle(angle As Int) As VMZSpot
	Dim pp As String = $"${ID}angle"$
	vue.setstatesingle(pp, angle)
	ZSpot.bind(":angle", pp)
	Return Me
End Sub

Sub SetDistance(distance As Int) As VMZSpot
	Dim pp As String = $"${ID}distance"$
	vue.setstatesingle(pp, distance)
	ZSpot.bind(":distance", pp)
	Return Me
End Sub

Sub SetToView(toView As Object) As VMZSpot
	Dim pp As String = $"${ID}toView"$
	vue.setstatesingle(pp, toView)
	ZSpot.bind(":to-view", pp)
	Return Me
End Sub

Sub SetSize(size As String) As VMZSpot
	Dim pp As String = $"${ID}size"$
	vue.setstatesingle(pp, size)
	ZSpot.bind(":size", pp)
	Return Me
End Sub

Sub SetSizeLarge As VMZSpot
	SetSize("large")
	Return Me
End Sub

Sub SetSizeMedium As VMZSpot
	SetSize("medium")
	Return Me
End Sub

Sub SetSizeSmall As VMZSpot
	SetSize("small")
	Return Me
End Sub

'set the border of the element
Sub SetBorder(width As String, color As String, bstyle As String) As VMZSpot
	ZSpot.SetBorder(width, color, bstyle)
	Return Me
End Sub


Sub SetText(t As String) As VMZSpot
	ZSpot.SetText(t)
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMZSpot
	ZSpot.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMZSpot
	ZSpot.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMZSpot
	ZSpot.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMZSpot
	ZSpot.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMZSpot
	ZSpot.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMZSpot
	ZSpot.SetName(varName, bind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMZSpot
	ZSpot.SetDisabled(b)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMZSpot
	ZSpot.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMZSpot
	ZSpot.SetVShow(vif)
	Return Me
End Sub

private Sub SetVModel(k As String) As VMZSpot
	ZSpot.SetVModel(k)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMZSpot
	ZSpot.AddClass(c)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMZSpot
	ZSpot.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMZSpot
	ZSpot.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMZSpot
	ZSpot.SetStyle(m)
	Return Me
End Sub

Sub SetHeight(h As String) As VMZSpot
	ZSpot.SetStyleSingle("height", h)
	Return Me
End Sub


Sub SetWidth(w As String) As VMZSpot
	ZSpot.SetStyleSingle("width", w)
	Return Me
End Sub


'set an attribute
Sub SetAttr(attr As Map) As VMZSpot
	ZSpot.SetAttr(attr)
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
	Return ZSpot.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub
Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMZSpot
ZSpot.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
'Sub SetVisible(b As Boolean) As VMZSpot
ZSpot.SetVisible(b)
Return Me
End Sub