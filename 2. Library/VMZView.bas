B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ZView As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private module As Object
	Private DesignMode As Boolean
	Private ext As VMElement
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMZView
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	ZView.Initialize(vue, ID).SetTag("z-view")
	DesignMode = False
	ext.Initialize(vue, $"${ID}ext"$).SetTag("div").SetAttrSingle("slot", "extension")
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

Sub AddSpot(zSpot As VMZSpot) As VMZView
	zSpot.pop(ext)
	Return Me
End Sub

Sub SetLabel(lbl As String) As VMZView
	Dim pp As String = $"${ID}label"$
	vue.setstatesingle(pp, lbl)
	ZView.bind(":label", pp)
	Return Me
End Sub

Sub SetProgress(progress As Int) As VMZView
	Dim pp As String = $"${ID}progress"$
	vue.setstatesingle(pp, progress)
	ZView.bind(":progress", pp)
	Return Me
End Sub

Sub SetImagePath(imagePath As String) As VMZView
	Dim pp As String = $"${ID}imagePath"$
	vue.setstatesingle(pp, imagePath)
	ZView.Bind(":imagePath", pp)
	Return Me
End Sub

Sub SetLabelPos(lPos As String) As VMZView
	Dim pp As String = $"${ID}lpos"$
	vue.setstatesingle(pp, lPos)
	ZView.bind(":label-pos",pp)
	Return Me
End Sub

Sub SetSlider As VMZView
	Dim pp As String = $"${ID}slider"$
	vue.setstatesingle(pp, True)
	ZView.Bind(":slider", pp)
	Return Me
End Sub

Sub SetLabelPosBottom As VMZView
	SetLabelPos("bottom")
	Return Me
End Sub


Sub SetLabelPosTop As VMZView
	SetLabelPos("top")
	Return Me
End Sub


Sub SetSize(size As String) As VMZView
	Dim pp As String = $"${ID}size"$
	vue.setstatesingle(pp, size)
	ZView.bind(":size", pp)
	Return Me
End Sub

Sub SetSizeXLarge As VMZView
	SetSize("xl")
	Return Me
End Sub

Sub SetSizeLarge As VMZView
	SetSize("l")
	Return Me
End Sub

Sub SetSizeMedium As VMZView
	SetSize("m")
	Return Me
End Sub

Sub SetSizeSmall As VMZView
	SetSize("s")
	Return Me
End Sub

Sub SetSizeXSmall As VMZView
	SetSize("xs")
	Return Me
End Sub

Sub SetSizeXXSmall As VMZView
	SetSize("xxs")
	Return Me
End Sub

Sub SetHeight(h As String) As VMZView
	ZView.SetStyleSingle("height", h)
	Return Me
End Sub


Sub SetText(t As String) As VMZView
	ZView.SetText(t)
	Return Me
End Sub

Sub SetWidth(w As String) As VMZView
	ZView.SetStyleSingle("width", w)
	Return Me
End Sub


'set the border of the element
Sub SetBorder(width As String, color As String, bstyle As String) As VMZView
	ZView.SetBorder(width, color, bstyle)
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMZView
	ZView.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMZView
	ZView.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMZView
	ZView.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMZView
	ZView.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMZView
	ZView.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMZView
	ZView.SetName(varName, bind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMZView
	ZView.SetDisabled(b)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMZView
	ZView.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMZView
	ZView.SetVShow(vif)
	Return Me
End Sub

private Sub SetVModel(k As String) As VMZView
	ZView.SetVModel(k)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMZView
	ZView.AddClass(c)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMZView
	ZView.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMZView
	ZView.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMZView
	ZView.SetStyle(m)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMZView
	ZView.SetAttr(attr)
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
	ext.pop(ZView)
	Return ext.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMZView
ZView.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
'Sub SetVisible(b As Boolean) As VMZView
ZView.SetVisible(b)
Return Me
End Sub