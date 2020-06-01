B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public PDFObject As VMContainer
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private PDF As BANanoObject
	Private height As String
	Private width As String	
	Private pdfOpenParams As Map
	Public const PAGEMODE_BOOKMARKS As String = "bookmarks"
	Public const PAGEMODE_THUMBS As String = "thumbs"
	Public const PAGEMODE_NONE As String = "none"
	Public const VIEW_FIT As String = "Fit"
	Public const VIEW_FITH As String = "FitH"
	Public const VIEW_FITH_TOP As String = "FitH, top"
	Public const VIEW_FITV As String = "FitV"
	Public const VIEW_FITV_LEFT As String = "FitV, left"
	Public const VIEW_FITB As String = "FitB"
	Public const VIEW_FITBH As String = "FitBH"
	Public const VIEW_FTIBH_TOP As String = "FitBH, top"
	Public const VIEW_FITBV As String = "FitBV"
	Public const VIEW_FITBV_LEFT As String = "FitBV, left"
End Sub

'initialize the PDFObject
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMPDFObject
	BANano.DependsOnAsset("pdfobject.min.js")
	'
	ID = sid.tolowercase
	PDFObject.Initialize(v, ID, eventHandler)
	DesignMode = False
	Module = eventHandler
	vue = v
	PDF.initialize("PDFObject")
	Dim bIsSupported As Boolean = PDF.GetField("supportsPDFs")
	If bIsSupported Then
		Log("Your browser supports inline PDFs...")
	Else
		Log("Inline PDFs is not supported in this browser...")
	End If
	height = ""
	width = ""
	pdfOpenParams = CreateMap()
	Return Me
End Sub

'set path of the pdf file
Sub SetURL(sURL As String) As VMPDFObject
	Dim opt As Map = CreateMap()
	'
	If height <> "" Then opt.put("height", height)
	If width <> "" Then opt.put("width", width)
	opt.put("pdfOpenParams", pdfOpenParams)
	'
	Dim elID As String = $"#${ID}"$
	PDF.RunMethod("embed", Array(sURL,elID,opt))
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMPDFObject
	PDFObject.SetStatic(b)
	Return Me
End Sub

'get component
Sub ToString As String
	Return PDFObject.ToString
End Sub

Sub SetVIf(vif As Object) As VMPDFObject
	PDFObject.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMPDFObject
	PDFObject.SetVShow(vif)
	Return Me
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
Sub AddClass(c As String) As VMPDFObject
	PDFObject.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMPDFObject
	PDFObject.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMPDFObject
	PDFObject.SetStyle(sm)
	Return Me
End Sub


'hide the component
Sub Hide As VMPDFObject
	PDFObject.SetVisible(False)
	Return Me
End Sub

'show the component
Sub Show As VMPDFObject
	PDFObject.SetVisible(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMPDFObject
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub

'add a loose attribute without value
Sub SetAttrLoose(loose As String) As VMPDFObject
	PDFObject.SetAttrLoose(loose)
	Return Me
End Sub

'remove an attribute
public Sub RemoveAttr(sName As String) As VMPDFObject
	PDFObject.RemoveAttr(sName)
	Return Me
End Sub

'set width
Sub SetWidth(w As String) As VMPDFObject
	PDFObject.SetWidth(W)
	width = w
	Return Me
End Sub

'set height
Sub SetHeight(h As String) As VMPDFObject
	PDFObject.SetHeight(h)
	height = h
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMPDFObject
	PDFObject.SetPaddingAll(p)
	Return Me
End Sub

'set all margins
Sub SetMarginAll(p As String) As VMPDFObject
	PDFObject.setmarginall(p)
	Return Me
End Sub

'set design mode
Sub SetDesignMode(b As Boolean) As VMPDFObject
	PDFObject.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'set single style
Sub SetStyleSingle(prop As String, value As String) As VMPDFObject
	PDFObject.SetStyleSingle(prop, value)
	Return Me
End Sub

'set single attribute
Sub SetAttrSingle(prop As String, value As String) As VMPDFObject
	PDFObject.SetAttrSingle(prop, value)
	Return Me
End Sub

'set single style
Sub BindStyleSingle(prop As String, value As String) As VMPDFObject
	PDFObject.BindStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMPDFObject
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetKey(k As String) As VMPDFObject
	k = k.tolowercase
	SetAttrSingle(":key", k)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMPDFObject
	PDFObject.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMPDFObject
	PDFObject.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub


'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMPDFObject
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMPDFObject
	PDFObject.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub


Sub AddComponent(comp As String) As VMPDFObject
	PDFObject.SetText(comp)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMPDFObject
	PDFObject.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMPDFObject
	PDFObject.SetVisible(b)
	Return Me
End Sub

Sub SetNavPanes(b As Boolean) As VMPDFObject
	If b Then
		pdfOpenParams.put("navpanes", 1)
	Else
		pdfOpenParams.Put("navpanes", 0)
	End If
	Return Me
End Sub

Sub SetMessages(b As Boolean) As VMPDFObject
	If b Then
		pdfOpenParams.put("messages", 1)
	Else
		pdfOpenParams.Put("messages", 0)
	End If
	Return Me
End Sub


Sub SetStatusBar(b As Boolean) As VMPDFObject
	If b Then
		pdfOpenParams.put("statusbar", 1)
	Else
		pdfOpenParams.Put("statusbar", 0)
	End If
	Return Me
End Sub

Sub SetToolBar(b As Boolean) As VMPDFObject
	If b Then
		pdfOpenParams.put("toolbar", 1)
	Else
		pdfOpenParams.Put("toolbar", 0)
	End If
	Return Me
End Sub

Sub SetScrollBar(b As Boolean) As VMPDFObject
	If b Then
		pdfOpenParams.put("scrollbar", 1)
	Else
		pdfOpenParams.Put("scrollbar", 0)
	End If
	Return Me
End Sub

Sub SetPageMode(b As String) As VMPDFObject
	If b = "" Then Return Me
	pdfOpenParams.put("pagemode", b)
	Return Me
End Sub

Sub SetView(b As String) As VMPDFObject
	If b = "" Then Return Me
	pdfOpenParams.put("view", b)
	Return Me
End Sub

Sub SetZoom(b As String) As VMPDFObject
	If b = "" Then Return Me
	pdfOpenParams.put("zoom", b)
	Return Me
End Sub

Sub SetPage(b As String) As VMPDFObject
	If b = "" Then Return Me
	pdfOpenParams.put("page", b)
	Return Me
End Sub
