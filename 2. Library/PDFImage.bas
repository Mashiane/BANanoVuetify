B4J=true
Group=Default Group\PDFMake
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private options As Map
	Public image As String
	Public width As Int
	Public height As Int
	Public pageBreakAfter As Boolean
	Public pageBreakBefore As Boolean
	Public pageOrientation As String
	Private BANano As BANano  'ignore
	Public link As String
End Sub

'Initializes the stack: a collection of paragraphs
Public Sub Initialize As PDFImage
	options.Initialize
	image = Null
	width = Null
	height = Null
	pageBreakAfter = Null
	pageBreakBefore = Null
	pageOrientation = Null
	link = Null
	Return Me
End Sub

Sub SetLink(slink As String) As PDFImage
	If slink = "" Then Return Me
	link = slink
	Return Me
End Sub

Sub SetPageOrientation(spageOrientation As String) As PDFImage
	If spageOrientation = "" Then Return Me
	pageOrientation = spageOrientation
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As PDFImage
	If w = 0 Then Return Me
	width = w
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As PDFImage
	If h = 0 Then Return Me
	height = h
	Return Me
End Sub

'set image key
Sub SetImage(imgKey As String) As PDFImage
	If imgKey = "" Then Return Me
	image = imgKey
	Return Me
End Sub

'set opacity
Sub SetOpacity(opacity As Double) As PDFImage
	If opacity > 0 Then Return Me
	options.Put("opacity", opacity)
	Return Me
End Sub

'set absolute position
Sub SetAbsolutePosition(x As Int, y As Int) As PDFImage
	If x > 0 And y > 0 Then
		Dim opt As Map = CreateMap()
		opt.Put("x", x)
		opt.Put("y", y)
		options.Put("absolutePosition", opt)
	End If
	Return Me
End Sub

'make it fit
Sub SetFit(w As Int, h As Int) As PDFImage
	If w > 0 And h > 0 Then
		Dim lst As List
		lst.Initialize 
		lst.Add(w)
		lst.Add(h)
		options.Put("fit", lst)
	End If
	Return Me
End Sub

'set page break before
Sub SetPageBreakBefore As PDFImage
	options.Put("pageBreak", "before")
	Return Me
End Sub

'set page break after
Sub SetPageBreakAfter As PDFImage
	options.Put("pageBreak", "after")
	Return Me
End Sub

'get the contents of the stack
Sub getContent As Map
	If image <> Null Then options.Put("image", image)
	If width <> Null Then options.Put("width", width)
	If height <> Null Then options.Put("height", height)
	If pageBreakAfter <> Null Then options.Put("pageBreak", "after")
	If pageBreakBefore <> Null Then options.Put("pageBreak", "before")
	If link <> Null Then options.Put("link", link)
	Return options
End Sub


'set margins for the text
Sub SetMargin(l As Int, t As Int, r As Int, b As Int) As PDFImage
	If l = BANano.UNDEFINED Then l = 0
	If t = BANano.UNDEFINED Then t = 0
	If r = BANano.UNDEFINED Then r = 0
	If b = BANano.UNDEFINED Then b = 0
	Dim margin As List
	margin.Initialize
	margin.AddAll(Array(l,t,r,b))
	options.Put("margin", margin)
	Return Me
End Sub