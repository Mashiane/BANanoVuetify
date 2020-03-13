B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Row As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the Row
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMRow
	ID = sid.tolowercase
	Row.Initialize(v, ID)
	Row.SetTag("v-row")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMRow
	Row.SetAttrLoose(loose)
	Return Me
End Sub


Sub SetAttributes(attrs As List) As VMRow
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return Row.ToString
End Sub

Sub SetVModel(k As String) As VMRow
	Row.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMRow
	Row.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMRow
	Row.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMRow
	Dim childHTML As String = child.ToString
	Row.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMRow
	Row.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMRow
	Row.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMRow
	Row.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMRow
	Row.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set align
Sub SetAlign(varAlign As String) As VMRow
	Row.SetAttrSingle("align", varAlign)
	Return Me
End Sub

'set align-content
Sub SetAlignContent(varAlignContent As String) As VMRow
	Row.SetAttrSingle("align-content", varAlignContent)
	Return Me
End Sub

'set align-content-lg
Sub SetAlignContentLg(varAlignContentLg As String) As VMRow
	Row.SetAttrSingle("align-content-lg", varAlignContentLg)
	Return Me
End Sub

'set align-content-md
Sub SetAlignContentMd(varAlignContentMd As String) As VMRow
	Row.SetAttrSingle("align-content-md", varAlignContentMd)
	Return Me
End Sub

'set align-content-sm
Sub SetAlignContentSm(varAlignContentSm As String) As VMRow
	Row.SetAttrSingle("align-content-sm", varAlignContentSm)
	Return Me
End Sub

'set align-content-xl
Sub SetAlignContentXl(varAlignContentXl As String) As VMRow
	Row.SetAttrSingle("align-content-xl", varAlignContentXl)
	Return Me
End Sub

'set align-lg
Sub SetAlignLg(varAlignLg As String) As VMRow
	Row.SetAttrSingle("align-lg", varAlignLg)
	Return Me
End Sub

'set align-md
Sub SetAlignMd(varAlignMd As String) As VMRow
	Row.SetAttrSingle("align-md", varAlignMd)
	Return Me
End Sub

'set align-sm
Sub SetAlignSm(varAlignSm As String) As VMRow
	Row.SetAttrSingle("align-sm", varAlignSm)
	Return Me
End Sub

'set align-xl
Sub SetAlignXl(varAlignXl As String) As VMRow
	Row.SetAttrSingle("align-xl", varAlignXl)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As String) As VMRow
	Row.SetAttrSingle("dense", varDense)
	Return Me
End Sub

'set justify
Sub SetJustify(varJustify As String) As VMRow
	Row.SetAttrSingle("justify", varJustify)
	Return Me
End Sub

'set justify-lg
Sub SetJustifyLg(varJustifyLg As String) As VMRow
	Row.SetAttrSingle("justify-lg", varJustifyLg)
	Return Me
End Sub

'set justify-md
Sub SetJustifyMd(varJustifyMd As String) As VMRow
	Row.SetAttrSingle("justify-md", varJustifyMd)
	Return Me
End Sub

'set justify-sm
Sub SetJustifySm(varJustifySm As String) As VMRow
	Row.SetAttrSingle("justify-sm", varJustifySm)
	Return Me
End Sub

'set justify-xl
Sub SetJustifyXl(varJustifyXl As String) As VMRow
	Row.SetAttrSingle("justify-xl", varJustifyXl)
	Return Me
End Sub

'set no-gutters
Sub SetNoGutters(varNoGutters As String) As VMRow
	Row.SetAttrSingle("no-gutters", varNoGutters)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMRow
	Row.SetTag(varTag)
	Return Me
End Sub


Sub Hide As VMRow
	Row.SetVisible(False)
	Return Me
End Sub

Sub Show As VMRow
	Row.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMRow
	Row.Enable(True)
	Return Me
End Sub

Sub Disable As VMRow
	Row.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMRow
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMRow
	Row.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMRow
	Row.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMRow
	Row.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMRow
	Row.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMRow
	Row.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMRow
	Row.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMRow
	Row.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMRow
	Row.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMRow
Row.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMRow
Row.SetVisible(b)
Return Me
End Sub