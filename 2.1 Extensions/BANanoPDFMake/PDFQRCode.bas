B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Dim options As Map
	Public qr As String
	Public foreground As String
	Public background As String
	Public fit As String
	'Public version As String
	Public modeNumeric As Boolean
	Public modeAlphanumeric As Boolean
	Public modeOctet As Boolean
	'Public mask As String
	Public eccLevelL As Boolean
	Public eccLevelM As Boolean
	Public eccLevelQ As Boolean
	Public eccLevelH As Boolean
	Public pageOrientation As String
	Private BANano As BANano   'ignore
End Sub

'Initializes the qrcode
Public Sub Initialize As PDFQRCode
	options.Initialize 
	qr = Null
	foreground = Null
	background = Null
	pageOrientation = Null
	fit = Null
	'version = Null
	modeNumeric = False
	modeAlphanumeric = False
	modeOctet = False
	'mask = Null
	Return Me
End Sub


Sub SetPageOrientation(spageOrientation As String) As PDFQRCode
	If spageOrientation = "" Then Return Me
	pageOrientation = spageOrientation
	Return Me
End Sub

'set absolute position
Sub SetAbsolutePosition(x As Int, y As Int) As PDFQRCode
	Dim opt As Map = CreateMap()
	opt.Put("x", x)
	opt.Put("y", y)
	options.Put("absolutePosition", opt)
	Return Me
End Sub


'set page break before
Sub SetPageBreakBefore As PDFQRCode
	options.Put("pageBreak", "before")
	Return Me
End Sub

'set page break after
Sub SetPageBreakAfter As PDFQRCode
	options.Put("pageBreak", "after")
	Return Me
End Sub

'get the contents of the qr code
Sub getContent As Map
	If qr <> Null Then options.Put("qr", qr)
	If foreground <> Null Then options.Put("foreground", foreground)
	If background <> Null Then options.Put("background", background)
	If pageOrientation <> Null Then options.Put("pageOrientation", pageOrientation)
	If fit <> Null Then options.Put("fit", fit)
	'If version <> Null Then options.Put("version", version)
	'If mask <> Null Then options.Put("mask", mask)
	If modeNumeric Then options.Put("mode", "numeric")
	If modeAlphanumeric Then options.Put("mode", "alphanumeric")
	If modeOctet Then options.Put("mode", "octet")
	If eccLevelL Then options.Put("eccLevel", "L")
	If eccLevelM Then options.Put("eccLevel", "M")
	If eccLevelQ Then options.Put("eccLevel", "Q")
	If eccLevelH Then options.Put("eccLevel", "H")
	Return options
End Sub

'set margins for the text
Sub SetMargin(l As Int, t As Int, r As Int, b As Int) As PDFQRCode
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