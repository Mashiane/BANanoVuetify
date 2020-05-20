B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private items As List
	Private listX As Map
	Private lType As String
	Public reversed As Boolean
	Public start As Int
	Public color As String
	Public markerColor As String
	Public separator As String
	Type ListStyleObj(circle As String, square As String, lowerAlpha As String, upperAlpha As String, upperRoman As String, _
	lowerRoman As String, none As String)
	Public ListStyle As ListStyleObj
	Public Style As String
	Public pageOrientation As String
	Public BANano As BANano
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(listType As String) As PDFList
	items.Initialize 
	listX.Initialize
	lType = listType
	reversed = Null
	start = Null
	color = Null
	markerColor = Null
	separator = Null
	ListStyle.Initialize
	ListStyle.square = "square"
	ListStyle.circle = "circle"
	ListStyle.lowerAlpha = "lower-alpha"
	ListStyle.upperAlpha = "upper-alpha"
	ListStyle.upperRoman = "upper-roman"
	ListStyle.lowerRoman = "lower-roman"
	ListStyle.none = "none"
	pageOrientation = Null
	Style = Null
	Return Me
End Sub

Sub SetType(typeOfList As String) As PDFList
	If typeOfList = "" Then Return Me
	Style = typeOfList
	Return Me
End Sub

'add text
Sub AddText(txt As PDFText) As PDFList
	items.Add(txt.Content)
	Return Me
End Sub

Sub AddString(str As String) As PDFList
	items.Add(str)
	Return Me
End Sub

'add items
Sub AddItems(lst As List)
	For Each item As Object In lst
		items.Add(item)
	Next
End Sub


'set page break before
Sub SetPageBreakBefore As PDFList
	listX.Put("pageBreak", "before")
	Return Me
End Sub

'set page break after
Sub SetPageBreakAfter As PDFList
	listX.Put("pageBreak", "after")
	Return Me
End Sub

'get the list content
Sub getContent As Map
	If reversed <> Null Then listX.Put("reversed", reversed)
	If start <> Null Then listX.Put("start", start)
	If Style <> Null Then listX.Put("type", Style)
	If color <> Null Then listX.Put("color", color)
	If markerColor <> Null Then listX.Put("markerColor", markerColor)
	If separator <> Null Then listX.Put("separator", separator)
	listX.Put(lType, items)
	Return listX
End Sub


Sub SetPageOrientation(spageOrientation As String) As PDFList
	If spageOrientation = "" Then Return Me
	pageOrientation = spageOrientation
	Return Me
End Sub

'set absolute position
Sub SetAbsolutePosition(x As Int, y As Int) As PDFList
	Dim opt As Map = CreateMap()
	opt.Put("x", x)
	opt.Put("y", y)
	listX.Put("absolutePosition", opt)
	Return Me
End Sub


'set margins for the text
Sub SetMargin(l As Int, t As Int, r As Int, b As Int) As PDFList
	If l = BANano.UNDEFINED Then l = 0
	If t = BANano.UNDEFINED Then t = 0
	If r = BANano.UNDEFINED Then r = 0
	If b = BANano.UNDEFINED Then b = 0
	Dim margin As List
	margin.Initialize
	margin.AddAll(Array(l,t,r,b))
	listX.Put("margin", margin)
	Return Me
End Sub
