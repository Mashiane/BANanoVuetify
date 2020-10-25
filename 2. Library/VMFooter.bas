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
	Private DesignMode As Boolean   'ignore
	Private Module As Object
	Public Container As VMContainer
	Public HasContent As Boolean
	Private bStatic As Boolean
	Private smodel As String
End Sub

'initialize the Footer
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMFooter
	ID = sid.tolowercase
	Footer.Initialize(v, ID)
	Footer.SetTag("v-footer")
	DesignMode = False
	Module = eventHandler
	vue = v
	SetVShow(Footer.showkey)
	Container.Initialize(vue, $"${ID}content"$, Module) 
	HasContent = False
	bStatic = False
	Show
	Return Me
End Sub

Sub RemoveVModel As VMFooter
	RemoveAttr("v-model")
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMFooter
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetStatic(b As Boolean) As VMFooter
	bStatic = b
	Footer.SetStatic(b)
	Container.SetStatic(b)
	Return Me
End Sub

Sub AddMadeWithLove(Row As Int, Col As Int, Message As String, CreatorName As String, EmailAddress As String)
	Dim footerDiv As VMElement
	footerDiv.initialize(vue, "footerdiv")
	footerDiv.AddClass("white--text ml-3")
	footerDiv.SetText("Made with")
	'
	Dim footerIcon As VMIcon
	footerIcon.Initialize(vue, "footerlove", Me).SetText("mdi-heart-multiple").AddClass("red--text")
	footerIcon.AddClass("mx-1")
	footerDiv.SetText(footerIcon.tostring)
	'
	Dim lblWith As VMLabel
	lblWith.initialize(vue, "lblwith")
	lblWith.SetText(Message)
	lblWith.AddClass("white--text").AddClass("mr-1")
	footerDiv.SetText(lblWith.ToString)
	'
	Dim lbla As VMLabel
	lbla.Initialize(vue, "lbla").SetTag("a").SetHREF($"mailto:${EmailAddress}"$).SetText($"${CreatorName}"$)
	lbla.AddClass("white--text")
	footerDiv.SetText(lbla.tostring)
	'
	Container.AddCOmponent(Row,Col, footerDiv.tostring)
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMFooter
	If varColor = "" Then Return Me
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		Footer.Bind("color", scolor)
		Return Me
	End If
	vue.SetStateSingle(pp, scolor)
	Footer.Bind(":color", pp)
	Return Me
End Sub

Sub AddSpacer As VMFooter
	Footer.AddSpacer
	Return Me
End Sub

Sub AddSpan(spanText As String) As VMFooter
	Dim span As VMElement
	span.Initialize(vue, "").SetTag("span").SetText(spanText)
	AddComponent(span.ToString)
	Return Me
End Sub

Sub AddCopyRight(cYear As String) As VMFooter
	Dim spanText As String = $"&copy; ${cYear}"$
	AddSpan(spanText)
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


Sub SetVisible(b As Boolean) As VMFooter
	vue.SetData(smodel, b)
	Return Me
End Sub

Sub Hide As VMFooter
	vue.SetStateSingle(smodel, False)
	Return Me
End Sub

Sub Show As VMFooter
	vue.SetStateSingle(smodel, True)
	Return Me
End Sub

'get component
Sub ToString As String
	If Container.HasContent Then AddComponent(Container.ToString)
	Return Footer.ToString
End Sub

Sub AddComponent(comp As String) As VMFooter
	Footer.SetText(comp)
	HasContent = True
	Return Me
End Sub

Sub SetVIf(vif As String) As VMFooter
	Footer.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMFooter
	smodel = vif
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
	HasContent = True
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
Sub SetAbsolute(varAbsolute As Boolean) As VMFooter
	If varAbsolute = False Then Return Me
	If bStatic Then
		SetAttrSingle("absolute", varAbsolute)
		Return Me
	End If
	Dim pp As String = $"${ID}Absolute"$
	vue.SetStateSingle(pp, varAbsolute)
	Footer.Bind(":absolute", pp)
	Return Me
End Sub

'set app
Sub SetApp(varApp As Boolean) As VMFooter
	If varApp = False Then Return Me
	Footer.SetAttrLoose("app")
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMFooter
	If varColor = False Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Footer.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMFooter
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Footer.Bind(":dark", pp)
	Return Me
End Sub

'set elevation
Sub SetElevation(varElevation As String) As VMFooter
	If varElevation = "" Then Return Me
	If bStatic Then
		SetAttrSingle("elevation", varElevation)
		Return Me
	End If
	Dim pp As String = $"${ID}Elevation"$
	vue.SetStateSingle(pp, varElevation)
	Footer.Bind(":elevation", pp)
	Return Me
End Sub

'set fixed
Sub SetFixed(varFixed As Boolean) As VMFooter
	If varFixed = False Then Return Me
	If bStatic Then
		SetAttrSingle("fixed", varFixed)
		Return Me
	End If
	Dim pp As String = $"${ID}Fixed"$
	vue.SetStateSingle(pp, varFixed)
	Footer.Bind(":fixed", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMFooter
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Footer.Bind(":height", pp)
	Return Me
End Sub

'set inset
Sub SetInset(varInset As Boolean) As VMFooter
	If varInset = "" Then Return Me
	If bStatic Then
		SetAttrSingle("inset", varInset)
		Return Me
	End If
	Dim pp As String = $"${ID}Inset"$
	vue.SetStateSingle(pp, varInset)
	Footer.Bind(":inset", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMFooter
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Footer.Bind(":light", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As String) As VMFooter
	If varMaxHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-height", varMaxHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	Footer.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As String) As VMFooter
	If varMaxWidth = "" Then Return Me
	If bStatic Then
		SetAttrSingle("max-width", varMaxWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Footer.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As String) As VMFooter
	If varMinHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("min-height", varMinHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	Footer.Bind(":min-height", pp)
	Return Me
End Sub

'set padless
Sub SetPadless(varPadless As Boolean) As VMFooter
	If varPadless = False Then Return Me
	If bStatic Then
		SetAttrSingle("padless", varPadless)
		Return Me
	End If
	Dim pp As String = $"${ID}Padless"$
	vue.SetStateSingle(pp, varPadless)
	Footer.Bind(":padless", pp)
	Return Me
End Sub

'set tag
Sub SetTag(varTag As String) As VMFooter
	If varTag = "" Then Return Me
	SetAttrSingle("tag", varTag)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Boolean) As VMFooter
	If varTile = False Then Return Me
	If bStatic Then
		SetAttrSingle("tile", varTile)
		Return Me
	End If
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	Footer.Bind(":tile", pp)
	Return Me
End Sub

'set width
Sub SetWidth(varWidth As String) As VMFooter
	If varWidth = False Then Return Me
	If bStatic Then
		SetAttrSingle("width", varWidth)
		Return Me
	End If
	Dim pp As String = $"${ID}Width"$
	vue.SetStateSingle(pp, varWidth)
	Footer.Bind(":width", pp)
	Return Me
End Sub

Sub Enable As VMFooter
	Footer.Enable(True)
	Return Me
End Sub

Sub Disable As VMFooter
	Footer.Disable(True)
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
	Container.SetDesignMode(b)
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

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMFooter
Footer.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub

