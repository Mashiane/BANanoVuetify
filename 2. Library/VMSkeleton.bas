B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Skeleton As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private module As Object   'ignore
	Private DesignMode As Boolean    'ignore
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSkeleton
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	Skeleton.Initialize(vue, ID).SetTag("vue-skeleton")
	DesignMode = False
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMSkeleton
	vue.SetData(xprop, xValue)
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	Skeleton.SetText(elm.ToString)
End Sub

Sub SetAttrLoose(loose As String) As VMSkeleton
	Skeleton.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSkeleton
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub Hide
	Skeleton.SetVisible(False)
End Sub

Sub Show
	Skeleton.SetVisible(True)
End Sub

Sub Enable
	Skeleton.Enable(True)
End Sub

Sub Disable
	Skeleton.Disable(True)
End Sub

Sub SetHeight(h As String) As VMSkeleton
	Skeleton.SetStyleSingle("height", h)
	Return Me
End Sub

'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSkeleton
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

Sub SetText(t As String) As VMSkeleton
	Skeleton.SetText(t)
	Return Me
End Sub

Sub SetWidth(w As String) As VMSkeleton
	Skeleton.SetStyleSingle("width", w)
	Return Me
End Sub


'set the border of the element
Sub SetBorder(width As String, color As String, bstyle As String) As VMSkeleton
	Skeleton.SetBorder(width, color, bstyle)
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMSkeleton
	Skeleton.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSkeleton
	Skeleton.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMSkeleton
	Skeleton.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMSkeleton
	Skeleton.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMSkeleton
	Skeleton.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSkeleton
	Skeleton.SetName(varName, bbind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMSkeleton
	Skeleton.SetDisabled(b)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMSkeleton
	Skeleton.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMSkeleton
	Skeleton.SetVShow(vif)
	Return Me
End Sub

private Sub SetVModel(k As String) As VMSkeleton
	Skeleton.SetVModel(k)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMSkeleton
	Skeleton.AddClass(c)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, value As String) As VMSkeleton
	Skeleton.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMSkeleton
	Skeleton.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMSkeleton
	Skeleton.SetStyle(m)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSkeleton
	Skeleton.SetAttr(attr)
	Return Me
End Sub

Sub ToString As String
	Return Skeleton.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSkeleton
Skeleton.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMSkeleton
Skeleton.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMSkeleton
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMSkeleton
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub