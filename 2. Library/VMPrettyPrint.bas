B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public PP As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private codeName As String
	Private codevisible As String
	Private CodeEL As VMElement
End Sub

'initialize the PP
Public Sub Initialize(v As BANanoVue, sid As String, lang As String) As VMPrettyPrint
	ID = sid.tolowercase
	PP.Initialize(v, ID).SetTag("pre").AddClass("prettyprint").AddClass("linenums")
	vue = v
	PP.SetStyle(CreateMap("width":"100% !important", "height":"80vh !important"))
	'
	codeName = $"${ID}code"$
	CodeEL.Initialize(v, codeName).SetTag("code")
	CodeEL.SetText($"{{ ${codeName} }}"$)
	CodeEL.AddClass("col s12").AddClass("prettyprint")
	CodeEL.AddClass($"language-${lang}"$)
	'
	codevisible = $"${ID}visible"$
	SetVIf(codevisible)
	SetVisible(True)
	SetText("")
	Return Me
End Sub



public Sub RemoveAttr(sName As String) As VMPrettyPrint
	PP.RemoveAttr(sName)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMPrettyPrint
	PP.SetDesignMode(b)
	Return Me
End Sub

Sub SetElevation(e As Int) As VMPrettyPrint
	PP.SetElevation(e)
	Return Me
End Sub

Sub SetVisible(b As Boolean)
	vue.SetStateSingle(codevisible, b)
End Sub

Sub SetVIf(vif As String) As VMPrettyPrint
	PP.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMPrettyPrint
	PP.SetVShow(vif)
	Return Me
End Sub

'add text to the prim
Sub SetText(sText As String) As VMPrettyPrint
	vue.SetStateSingle(codeName, sText)
	Return Me
End Sub

Sub Refresh
	Dim PR As BANanoObject
	PR.Initialize("PR")
	PR.RunMethod("prettyPrint", Null)
End Sub

'get component
Sub ToString As String
	
	PP.AddElement(CodeEL)
	Return PP.ToString
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMPrettyPrint
	PP.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMPrettyPrint
	PP.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMPrettyPrint
	PP.SetStyle(sm)
	Return Me
End Sub

'set padding
Sub SetPadding(p As Object) As VMPrettyPrint
	PP.SetPaddingAll(p)
	Return Me
End Sub


