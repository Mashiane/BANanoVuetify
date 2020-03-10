B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Footer As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
End Sub

'initialize the Footer
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMFooter
	ID = sid.tolowercase
	Footer.Initialize(v, ID)
	Footer.SetTag("v-footer")
	DesignMode = False
	Module = eventHandler
	vue = v
	SetVModel(ID)
	Return Me
End Sub


Sub SetAttrLoose(loose As String) As VMFooter
	Footer.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMFooter
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub Hide As VMFooter
	vue.SetStateSingle(ID, False)
	Return Me
End Sub

Sub Show As VMFooter
	vue.SetStateSingle(ID, True)
	Return Me
End Sub

'get component
Sub ToString As String
	
	Return Footer.ToString
End Sub

Sub SetVModel(k As String) As VMFooter
	Footer.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMFooter
	Footer.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMFooter
	Footer.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMFooter
	Dim childHTML As String = child.ToString
	Footer.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMFooter
	Footer.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMFooter
	Footer.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMFooter
	Footer.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMFooter
	Footer.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set absolute
Sub SetAbsolute(varAbsolute As Object) As VMFooter
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	Footer.Bind(":absolute", pp)
	Return Me
End Sub

'set app
Sub SetApp(varApp As Object) As VMFooter
	Dim pp As String = $"${ID}App"$
	vue.SetStateSingle(pp, varApp)
	Footer.Bind(":app", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMFooter
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Footer.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMFooter
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Footer.Bind(":dark", pp)
	Return Me
End Sub

'set elevation
Sub SetElevation(varElevation As Object) As VMFooter
	Dim pp As String = $"${ID}Elevation"$
	vue.SetStateSingle(pp, varElevation)
	Footer.Bind(":elevation", pp)
	Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Object) As VMFooter
	Dim pp As String = $"${ID}Fixed"$
	vue.SetStateSingle(pp, varFixed)
	Footer.Bind(":fixed", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMFooter
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Footer.Bind(":height", pp)
	Return Me
End Sub

'set inset
Sub SetInset(varInset As Object) As VMFooter
	Dim pp As String = $"${ID}Inset"$
	vue.SetStateSingle(pp, varInset)
	Footer.Bind(":inset", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMFooter
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Footer.Bind(":light", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As Object) As VMFooter
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	Footer.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As Object) As VMFooter
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Footer.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As Object) As VMFooter
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	Footer.Bind(":min-height", pp)
	Return Me
End Sub

'set padless
Sub SetPadless(varPadless As Object) As VMFooter
	Dim pp As String = $"${ID}Padless"$
	vue.SetStateSingle(pp, varPadless)
	Footer.Bind(":padless", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As Object) As VMFooter
	Dim pp As String = $"${ID}Tag"$
	vue.SetStateSingle(pp, varTag)
	Footer.Bind(":tag", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Object) As VMFooter
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	Footer.Bind(":tile", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As Object) As VMFooter
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	Footer.Bind(":width", pp)
	Return Me
End Sub

Sub Enable As VMFooter
	vue.SetStateSingle($"${ID}disabled"$, False)
	Return Me
End Sub

Sub Disable As VMFooter
	vue.SetStateSingle($"${ID}disabled"$, True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMFooter
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMFooter
	Footer.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMFooter
	Footer.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMFooter
	Footer.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMFooter
	Footer.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMFooter
	Footer.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMFooter
	Footer.SetName(varName, bbind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMFooter
	Footer.SetDisabled(b)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMFooter
	Footer.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMFooter
	Footer.SetAttrSingle(prop, value)
	Return Me
End Sub
