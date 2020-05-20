B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private contentInt As Map
	Private textInt As StringBuilder
	Public link As String
	Public linkToPage As Int
	Public tocItem As Boolean
	Public pageOrientation As String
	Public pageBreakBefore As Boolean
	Public pageBreakAfter As Boolean
	Public style As PDFStyle
	Public colSpan As Int
	Public rowSpan As Int
	Public linkToDestination As String
	Public id As String 
	Public listType As String
	Public pageReference As String
	Public textReference As String
	Public preserveLeadingSpaces As Boolean
	Private BANano As BANano  'ignore
	Public tabindex As String
	Public decoration As String
	Public decorationStyle As String
	Public decorationColor As String
	Public counter As Int
End Sub

Sub SetTabIndex(stabindex As String) As PDFText
	If stabindex = "" Then Return Me
	If stabindex = "0" Then Return Me
	If stabindex = Null Then Return Me
	tabindex = stabindex
	Return Me
End Sub

Sub SetID(sid As String) As PDFText
	If sid = "" Then Return Me
	id = sid
	Return Me
End Sub

Sub SetTextReference(stextReference As String) As PDFText
	If stextReference = "" Then Return Me
	textReference = stextReference
	Return Me
End Sub

Sub SetPageReference(spageReference As String) As PDFText
	If spageReference = "" Then Return Me
	pageReference = spageReference
	Return Me
End Sub

Sub SetLinkToDestination(slinkToDestination As String) As PDFText
	If slinkToDestination = "" Then Return Me
	linkToDestination = slinkToDestination
	Return Me
End Sub

Sub SetLinkToPage(slinkToPage As String) As PDFText
	If slinkToPage = "" Then Return Me
	linkToPage = slinkToPage
	Return Me
End Sub

Sub SetLink(slink As String) As PDFText
	If slink = "" Then Return Me
	link = slink
	Return Me
End Sub

Sub SetListType(slisttype As String) As PDFText
	If slisttype = "" Then Return Me
	listType = slisttype
	Return Me
End Sub

Sub SetPageOrientation(spageOrientation As String) As PDFText
	If spageOrientation = "" Then Return Me
	pageOrientation = spageOrientation
	Return Me
End Sub

'Initializes the text
Public Sub Initialize As PDFText
	contentInt.Initialize 
	textInt.Initialize 
	style.Initialize 
	counter = Null
	link = Null
	listType = Null
	linkToPage = Null
	tocItem = Null
	pageBreakBefore = Null
	pageBreakAfter = Null
	pageOrientation = Null
	colSpan = Null
	rowSpan = Null
	linkToDestination = Null
	listType = Null
	id = Null
	pageReference = Null
	textReference = Null
	preserveLeadingSpaces = Null
	tabindex = Null
	decoration = Null
	decorationStyle = Null
	decorationColor = Null
	Return Me 
End Sub


'set decoration
Sub SetDecoration(dec As String) As PDFText
	If dec = "" Then Return Me
	decoration = dec
	Return Me
End Sub


'decorationStyle
Sub SetDecorationStyle(sdecorationStyle As String) As PDFText
	If sdecorationStyle = "" Then Return Me
	decorationStyle = sdecorationStyle
	Return Me
End Sub

Sub SetDecorationColor(sdecorationColor As String) As PDFText
	If sdecorationColor = "" Then Return Me
	decorationColor = sdecorationColor
	Return Me
End Sub

'set tocNumberStyle
Sub SetTocNumberStyle(ts As PDFStyle) As PDFText
	contentInt.Put("tocNumberStyle", ts)
	Return Me
End Sub

'set tocStyle
Sub SetTocStyle(ts As PDFStyle) As PDFText
	contentInt.Put("tocStyle", ts)
	Return Me
End Sub

'set margins for the toc
Sub SetTocMargin(l As Int, t As Int, r As Int, b As Int) As PDFText
	Dim margin As List
	margin.Initialize
	margin.AddAll(Array(l,t,r,b))
	contentInt.Put("tocMargin", margin)
	Return Me
End Sub

'set tocItem
Sub SetTocItem(ti As Boolean) As PDFText
	If ti = False Then Return Me
	tocItem = ti
	Return Me
End Sub

'set absolute position
Sub SetAbsolutePosition(x As Int, y As Int) As PDFText
	Dim opt As Map = CreateMap()
	opt.Put("x", x)
	opt.Put("y", y)
	contentInt.Put("absolutePosition", opt)
	Return Me
End Sub

'set border color for the text
Sub SetBorderColor(l As String, t As String, r As String, b As String) As PDFText
	Dim margin As List
	margin.Initialize
	margin.AddAll(Array(l,t,r,b))
	contentInt.Put("borderColor", margin)
	Return Me
End Sub

'set border
Sub SetBorder(l As Boolean, t As Boolean, r As Boolean, b As Boolean) As PDFText
	style.SetBorder(l,t,r,b)
	Return Me
End Sub

'remove border
Sub NoBorder As PDFText
	style.noborder
	Return Me
End Sub

'set relativePosition
Sub SetRelativePosition(x As Int, y As Int) As PDFText
	Dim opt As Map = CreateMap()
	opt.Put("x", x)
	opt.Put("y", y)
	contentInt.Put("relativePosition", opt)
	Return Me
End Sub

'set fill color
Sub SetFillColor(fc As Object) As PDFText
	style.fillColor = fc
	Return Me
End Sub

'set alignment center
Sub SetAlignmentCenter As PDFText
	style.alignmentCenter = True
	Return Me
End Sub

'set alignment right
Sub SetAlignmentRight As PDFText
	style.alignmentRight = True
	Return Me	
End Sub

'set alignment justify
Sub SetAlignmentJustify As PDFText
	style.alignmentJustify = True
	Return Me
End Sub

'set the row Span
Sub SetRowSpan(rs As Int) As PDFText
	If rs = 0 Then Return Me
	rowSpan = rs
	Return Me
End Sub

'set col Span
Sub SetColSpan(cs As Int) As PDFText
	If cs = 0 Then Return Me
	colSpan = cs
	Return Me
End Sub

'set style
Sub SetStyle(styleName As String) As PDFText
	If styleName = "" Then Return Me
	style.AddStyle(styleName)
	Return Me
End Sub

'set the width
Sub SetWidth(sWidth As String) As PDFText
	style.width = sWidth
	Return Me
End Sub

'set the height
Sub SetHeight(sHeight As String) As PDFText
	style.height = sHeight
	Return Me
End Sub

Sub SetBold(b As Boolean) As PDFText
	style.bold = b
	Return Me
End Sub

Sub SetItalics(b As Boolean) As PDFText
	style.italics = b
	Return Me
End Sub

Sub SetFontSize(fs As Int) As PDFText
	style.fontSize = fs
	Return Me
End Sub

Sub SetColor(colour As String) As PDFText
	style.color = colour
	Return Me
End Sub

'append text to contents
Sub Append(txt As String) As PDFText
	textInt.Append(txt)
	Return Me
End Sub

'append text with a newline
Sub AppendLine(txt As String) As PDFText
	textInt.Append(txt)
	textInt.Append(CRLF)
	Return Me
End Sub

'set page break before
Sub SetPageBreakBefore As PDFText
	contentInt.Put("pageBreak", "before")
	Return Me
End Sub

'set page break after
Sub SetPageBreakAfter As PDFText
	contentInt.Put("pageBreak", "after")
	Return Me
End Sub

'get the contents of the ext
Sub getContent As Map
	Dim outcome As String = textInt.tostring
	contentInt.Put("text", outcome)
	If counter <> Null Then contentInt.Put("counter", counter)
	If linkToPage <> Null Then contentInt.Put("linkToPage", linkToPage)
	If link <> Null Then contentInt.Put("link", link)
	If tocItem <> Null Then contentInt.Put("tocItem", tocItem)
	If pageOrientation <> Null Then contentInt.Put("pageOrientation", pageOrientation)
	If pageBreakBefore Then contentInt.Put("pageBreak", "before")
	If pageBreakAfter Then contentInt.Put("pageBreak", "after")
	If colSpan <> Null Then contentInt.Put("colSpan", colSpan)
	If rowSpan <> Null Then contentInt.Put("rowSpan", rowSpan)
	If linkToDestination <> Null Then contentInt.Put("linkToDestination", linkToDestination)
	If id <> Null Then contentInt.Put("id", id)
	If listType <> Null Then contentInt.Put("listType", listType)
	If pageReference <> Null Then contentInt.Put("pageReference", pageReference)
	If textReference <> Null Then contentInt.Put("textReference", textReference)
	If preserveLeadingSpaces <> Null Then contentInt.Put("preserveLeadingSpaces", preserveLeadingSpaces)
	If decoration <> Null Then contentInt.Put("decoration", decoration)
	If decorationStyle <> Null Then contentInt.Put("decorationStyle", decorationStyle)
	If decorationColor <> Null Then contentInt.Put("decorationColor", decorationColor)
	style.Include(contentInt)
	Return contentInt
End Sub

'set margins for the text
Sub SetMargin(l As Int, t As Int, r As Int, b As Int) As PDFText
	style.SetMargin(l,t,r,b)
	Return Me
End Sub

'set angle
Sub SetAngle(dangle As Double) As PDFText
	style.angle = dangle
	Return Me
End Sub

'set opacity
Sub SetOpacity(o As Double) As PDFText
	style.opacity = o
	Return Me
End Sub
