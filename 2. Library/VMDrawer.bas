B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Drawer As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private module As Object
	Private DesignMode As Boolean
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDrawer
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	Drawer.Initialize(vue, ID).SetTag("v-navigation-drawer").SetAttrSingle("app", True).SetVModel(ID)
	DesignMode = False
	Return Me
End Sub

Sub Hide
	vue.SetStateSingle(ID, False)
End Sub

Sub Show
	vue.SetStateSingle(ID, True)
End Sub

Sub Enable
	vue.SetStateSingle($"${ID}disabled"$, False)
End Sub

Sub Disable
	vue.SetStateSingle($"${ID}disabled"$, True)
End Sub

Sub SetHeight(h As String) As VMDrawer
	Drawer.SetStyleSingle("height", h)
	Return Me
End Sub

'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMDrawer
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

Sub SetText(t As String) As VMDrawer
	Drawer.SetText(t)
	Return Me
End Sub

Sub SetWidth(w As String) As VMDrawer
	Drawer.SetStyleSingle("width", w)
	Return Me
End Sub


'set the border of the element
Sub SetBorder(width As String, color As String, bstyle As String) As VMDrawer
	Drawer.SetBorder(width, color, bstyle)
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMDrawer
	Drawer.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMDrawer
	Drawer.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMDrawer
	Drawer.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMDrawer
	Drawer.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMDrawer
	Drawer.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMDrawer
	Drawer.SetName(varName, bbind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMDrawer
	Drawer.SetDisabled(b)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMDrawer
	Drawer.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMDrawer
	Drawer.SetVShow(vif)
	Return Me
End Sub

private Sub SetVModel(k As String) As VMDrawer
	Drawer.SetVModel(k)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMDrawer
	Drawer.AddClass(c)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMDrawer
	Drawer.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMDrawer
	Drawer.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMDrawer
	Drawer.SetStyle(m)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDrawer
	Drawer.SetAttr(attr)
	Return Me
End Sub

Sub ToString As String
	Return Drawer.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMDrawer
Drawer.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
'Sub SetVisible(b As Boolean) As VMDrawer
Drawer.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMDrawer
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMDrawer
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub