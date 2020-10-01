B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Col As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean   'ignore
	Private Module As Object    'ignore
End Sub

'initialize the Col
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCol
	ID = sid.tolowercase
	Col.Initialize(v, ID)
	Col.SetTag("v-col")
	DesignMode = False
	Module = eventHandler
	vue = v
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMCol
	Col.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMCol
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetData(prop As String, value As Object) As VMCol
	vue.SetData(prop, value)
	Return Me
End Sub


'get component
Sub ToString As String	
	Return Col.ToString
End Sub

Sub SetVModel(k As String) As VMCol
	Col.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMCol
	Col.SetVIf(vif)
	Return Me
End Sub

Sub AddContentList(lst As List) As VMCol
	Col.AddContentList(lst)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMCol
	Col.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCol
	Dim childHTML As String = child.ToString
	Col.SetText(childHTML)
	Return Me
End Sub


'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCol
	Col.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCol
	Col.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCol
	Col.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set align-self
Sub SetAlignSelf(varAlignSelf As String) As VMCol
	Col.SetAttrSingle("align-self", varAlignSelf)
	Return Me
End Sub

'set cols
Sub SetCols(varCols As String) As VMCol
	Col.SetAttrSingle("cols", varCols)
	Return Me
End Sub

'set lg
Sub SetLg(varLg As String) As VMCol
	Col.SetAttrSingle("lg", varLg)
	Return Me
End Sub

'set md
Sub SetMd(varMd As String) As VMCol
	Col.SetAttrSingle("md", varMd)
	Return Me
End Sub

'set offset
Sub SetOffset(varOffset As String) As VMCol
	Col.SetAttrSingle("offset", varOffset)
	Return Me
End Sub

'set offset-lg
Sub SetOffsetLg(varOffsetLg As String) As VMCol
	If varOffsetLg = "0" Then Return Me
	Col.SetAttrSingle("offset-lg", varOffsetLg)
	Return Me
End Sub

'set offset-md
Sub SetOffsetMd(varOffsetMd As String) As VMCol
	If varOffsetMd = "0" Then Return Me
	Col.SetAttrSingle("offset-md", varOffsetMd)
	Return Me
End Sub

'set offset-sm
Sub SetOffsetSm(varOffsetSm As String) As VMCol
	If varOffsetSm = "0" Then Return Me
	Col.SetAttrSingle("offset-sm", varOffsetSm)
	Return Me
End Sub

'set offset-xl
Sub SetOffsetXl(varOffsetXl As String) As VMCol
	If varOffsetXl = "0" Then Return Me
	Col.SetAttrSingle("offset-xl", varOffsetXl)
	Return Me
End Sub

'set order
Sub SetOrder(varOrder As String) As VMCol
	Col.SetAttrSingle("order", varOrder)
	Return Me
End Sub

'set order-lg
Sub SetOrderLg(varOrderLg As String) As VMCol
	Col.SetAttrSingle("order-lg", varOrderLg)
	Return Me
End Sub

'set order-md
Sub SetOrderMd(varOrderMd As String) As VMCol
	Col.SetAttrSingle("order-md", varOrderMd)
	Return Me
End Sub

'set order-sm
Sub SetOrderSm(varOrderSm As String) As VMCol
	Col.SetAttrSingle("order-sm", varOrderSm)
	Return Me
End Sub

'set order-xl
Sub SetOrderXl(varOrderXl As String) As VMCol
	Col.SetAttrSingle("order-xl", varOrderXl)
	Return Me
End Sub

'set sm
Sub SetSm(varSm As String) As VMCol
	Col.SetAttrSingle("sm", varSm)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMCol
	Col.SetTag(varTag)
	Return Me
End Sub

'set xl
Sub SetXl(varXl As Object) As VMCol
	Col.SetAttrSingle("xl", varXl)
	Return Me
End Sub


Sub Hide As VMCol
	Col.SetVisible(False)
	Return Me
End Sub

Sub Show As VMCol
	Col.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMCol
	Col.Enable(True)
	Return Me
End Sub

Sub Disable As VMCol
	Col.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMCol
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMCol
	Col.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMCol
	Col.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMCol
	Col.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMCol
	Col.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub


Sub AddComponent(comp As String) As VMCol
	Col.SetText(comp)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMCol
	Col.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMCol
	Col.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMCol
	Col.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMCol
Col.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

Sub SetVisible(b As Boolean) As VMCol
Col.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMCol
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMCol
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub