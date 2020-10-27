B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Label As VMElement
	Public ID As String
	Private vue As BANanoVue
	Public vmodel As String
	Private DesignMode As Boolean    'ignore
	Private bStatic As Boolean
	Private BANano As BANano     'ignore
	Private vmodel As String
End Sub

Public Sub Initialize(v As BANanoVue, sid As String) As VMLabel
	ID = sid.ToLowerCase
	vue = v
	Label.Initialize(vue, ID).SetTag("label")
	vmodel = ""
	Label.typeOf = "label"
	DesignMode = False
	bStatic = False
	vmodel = ""
	Return Me
End Sub



'add an element to the page content
Sub AddElement(elm As VMElement)
	Label.SetText(elm.ToString)
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMLabel
	Label.SetAttrSingle(prop, value)
	Return Me
End Sub

Sub SetData(xprop As String, xValue As Object) As VMLabel
	vue.SetData(xprop, xValue)
	Return Me
End Sub



Sub SetFontFamily(ff As String) As VMLabel
	If ff = "" Then Return Me
	SetStyleSingle("font-family", ff)
	Return Me
End Sub

Sub SetFontSize(fs As String) As VMLabel
	If fs = "" Then Return Me
	SetStyleSingle("font-size", fs)
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMLabel
	Label.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetVOnce(t As Boolean) As VMLabel
	Label.setvonce(t)
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMLabel
	bStatic = b
	Label.SetStatic(b)
	Return Me
End Sub

Sub SetVModel(svmodel As String, value As String) As VMLabel
	vmodel = svmodel
	value = BANano.SF(value)
	svmodel = svmodel.tolowercase
	If bStatic Then
		SetText(value)
		Return Me
	End If
	vue.SetData(svmodel, value)
	SetText($"{{ ${svmodel} }}"$)
	Return Me
End Sub

Sub SetVModel1(svmodel As String) As VMLabel
	vmodel = svmodel.tolowercase
	SetText($"{{ ${vmodel} }}"$)
	Return Me
End Sub

Sub SetValue(varValue As String) As VMLabel
	If bStatic Then
		SetText(varValue)
		Return Me
	End If
	If vmodel = "" Then
		vmodel = $"${ID}value"$
		SetVModel(vmodel, varValue)
	End If
	vue.SetData(vmodel, varValue)
	Return Me
End Sub

Sub GetValue As String
	Dim sdata As String = vue.GetData(vmodel)
	Return sdata
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMLabel
	Label.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMLabel
	Label.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMLabel
	Label.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMLabel
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMLabel
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	AddClass(scolor)
	Return Me
End Sub

Sub SetColor(scolor As String) As VMLabel
	If scolor = "" Then Return Me
	AddClass(scolor)
	Return Me
End Sub

Sub TextCenter As VMLabel
	AddClass("text-center")
	Return Me
End Sub

Sub TextRight As VMLabel
	AddClass("text-right")
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMLabel
	Label.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMLabel
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMLabel
	If themeName = "" Then Return Me
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


Sub SetID(iID As String, bind As Boolean) As VMLabel
	Label.SetID(iID,bind)
	Return Me
End Sub

Sub SetTextJustify As VMLabel
	Label.AddClass("text-justify")
	Return Me
End Sub


Sub SetTextLeft As VMLabel
	Label.AddClass("text-left")
	Return Me
End Sub

Sub SetTextRight As VMLabel
	Label.AddClass("text-right")
	Return Me
End Sub

Sub SetTextLowerCase(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("text-lowercase")
	Return Me
End Sub

Sub SetTextUpperCase(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("text-uppercase")
	Return Me
End Sub


Sub SetTextCapitalize(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("text-capitalize")
	Return Me
End Sub


Sub SetTextCenter As VMLabel
	Label.AddClass("text-center")
	Return Me
End Sub


Sub SetDesignMode(b As Boolean) As VMLabel
	Label.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMLabel
	Label.RemoveAttr(sName)
	Return Me
End Sub

Sub SetRequired(b As Boolean) As VMLabel
	Label.SetRequired(b)
	Return Me
End Sub

Sub SetVerticalAlignMiddle As VMLabel
	Label.SetVerticalAlignMiddle
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMLabel
	Label.SetDisabled(b)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMLabel
	If vif = "" Then Return Me
	Label.SetVShow(vif)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMLabel
	Label.SetStyle(sm)
	Return Me
End Sub

Sub SetText(t As String) As VMLabel
	t = BANano.SF(t)
	Label.SetText(t)
	Return Me
End Sub

Sub SetParagraph As VMLabel
	Label.SetTag("p")
	Return Me
End Sub

Sub SetH1 As VMLabel
	Label.SetTag("h1")
	Return Me
End Sub

Sub SetTag(size As String) As VMLabel
	Label.SetTag(size)
	Return Me
End Sub

Sub SetH2 As VMLabel
	Label.SetTag("h2")
	Return Me
End Sub


Sub SetH3 As VMLabel
	Label.SetTag("h3")
	Return Me
End Sub

Sub SetH4 As VMLabel
	Label.SetTag("h4")
	Return Me
End Sub

Sub SetSpan As VMLabel
	Label.SetTag("span")
	Return Me
End Sub

Sub SetBlockQuote As VMLabel
	Label.SetTag("blockquote").AddClass("blockquote")
	Return Me
End Sub

Sub SetH5 As VMLabel
	Label.SetTag("h5")
	Return Me
End Sub

Sub SetH6 As VMLabel
	Label.SetTag("h6")
	Return Me
End Sub

Sub SetA As VMLabel
	Label.SetTag("a")
	Return Me
End Sub

Sub SetHREF(href As String) As VMLabel
	If href = "" Then Return Me
	Label.SetAttrSingle("href", href)
	Return Me
End Sub

Sub AddBold(value As String) As VMLabel
	If value = "" Then Return Me
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("{B}").Append(value).Append("{/B}")
	SetText(sb.ToString)
	Return Me
End Sub

Sub AddItalic(value As String) As VMLabel
	If value = "" Then Return Me
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("{I}").Append(value).Append("{/I}")
	SetText(sb.ToString)
	Return Me
End Sub

Sub AddUnderline(value As String) As VMLabel
	If value = "" Then Return Me
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("{U}").Append(value).Append("{/U}")
	SetText(sb.ToString)
	Return Me
End Sub

Sub AddSubScript(value As String) As VMLabel
	If value = "" Then Return Me
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("{SUB}").Append(value).Append("{/SUB}")
	SetText(sb.ToString)
	Return Me
End Sub

Sub AddSuperScript(value As String) As VMLabel
	If value = "" Then Return Me
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("{SUP}").Append(value).Append("{/SUP}")
	SetText(sb.ToString)
	Return Me
End Sub

Sub AddColor(value As String, HexColor As String) As VMLabel
	If value = "" Then Return Me
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"{C:${HexColor}}${value}{/C}"$)
	SetText(sb.ToString)
	Return Me
End Sub

Sub AddIconColor(icon As String,HexColor As String) As VMLabel
	If icon = "" Then Return Me
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"{IC:${HexColor}}${icon}{/IC}"$)
	SetText(sb.ToString)
	Return Me
End Sub

Sub AddHyperLink(Title As String, URL As String) As VMLabel
	Dim txt As String = $"<a href="${URL}" target="_blank">${Title}</a>."$
	SetText(txt)
	Return Me
End Sub

Sub SetItalic(b As Boolean) As VMLabel
	If b = False Then Return Me
	AddClass("font-italic")
	Return Me
End Sub

Sub SetElevation(e As Int) As VMLabel
	Dim sele As String = $"elevation-${e}"$
	AddClass(sele)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMLabel
	If c = "" Then Return Me
	Label.AddClass(c)
	Return Me
End Sub

'add a child
Sub AddChild(child As VMElement) As VMLabel
	Dim childHTML As String = child.ToString
	Label.SetText(childHTML)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMLabel
	Label.SetAttr(attr)
	Return Me
End Sub
'
'Sub SetFor(f As String) As VMLabel
'	Label.SetAttr(CreateMap("for": f))
'	Return Me
'End Sub

Sub ToString As String
	Return Label.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub


Sub SetDisplay4(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("display-4")
	Return Me
End Sub

Sub SetDisplay3(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("display-3")
	Return Me
End Sub

Sub SetDisplay2(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("display-2")
	Return Me
End Sub

Sub SetDisplay1(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("display-1")
	Return Me
End Sub

'headline
Sub SetHeadline(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("headline")
	Return Me
End Sub

'title
Sub SetTitle(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("title")
	Return Me
End Sub

Sub SetSubTitle1(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("subtitle-1")
	Return Me
End Sub


Sub SetSubTitle2(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("subtitle-2")
	Return Me
End Sub


Sub SetCaption(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("caption")
	Return Me
End Sub


Sub SetOverline(b As Boolean) As VMLabel
	If b = False Then Return Me
	Label.AddClass("overline")
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMLabel
	Label.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMLabel
	Label.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMLabel
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMLabel
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub