B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
'http://pdfmake.org/#/
Sub Class_Globals
	Private styles As Map
	Private docDefinition As Map
	Private content As List
	Public defaultStyle As PDFStyle
	Private pdf As BANanoObject
	Private BANano As BANano  'ignore
	Public pageSize As String
	Public pageOrientation As String
	Public title As String
	Public author As String
	Public subject As String
	Public keywords As String
	Public creator As String
	Public producer As String
	Private info As Map
	Private compress As Boolean
	Public security As PDFSecurity
	Private parentID As String
	Private fName As String
	Private Blobs As Map
	Private NumFiles As Int
	Private files As Map
	Private images As Map
	Private fileKeys As Map
	Private action As String
	Private eventHandler As Object
	Private eventMethod As String
	Private mJSON As String
	Private mJSONPretty As String
End Sub

'Initializes the maker
Public Sub Initialize As PDFMaker
	BANano.DependsOnAsset("pdfmake.min.js")
	BANano.DependsOnAsset("vfs_fonts.js")
	BANano.DependsOnAsset("jquery-3.4.1.min.js")
	BANano.DependsOnAsset("jquery.media.js")
	
	'Log("PDFMaker.Initialize")
	pdf.Initialize("pdfMake")
	Blobs.Initialize
	styles.Initialize 
	docDefinition.Initialize 
	content.Initialize 
	defaultStyle.Initialize
	defaultStyle.name = "defaultStyle"
	pageSize = Null
	pageOrientation = Null
	title = Null
	author = Null
	subject = Null
	keywords = Null
	creator = Null
	producer = Null
	info.Initialize
	compress = Null 
	security.Initialize 
	files.Initialize 
	images.Initialize 
	fileKeys.Initialize 
	mJSON = ""
	Return Me
End Sub

'set multiple properties
Sub SetDocumentProperties(docprops As Map)
	'Log("PDFMaker.SetDocumentProperties")
	SetAuthor(docprops.Get("author"))
	SetTitle(docprops.Get("title"))
	SetSubject(docprops.Get("subject"))
	SetKeywords(docprops.Get("keywords"))
	SetCreator(docprops.Get("creator"))
	SetProducer(docprops.Get("producer"))
	SetCompress(docprops.Get("compress"))
	security.Set("userPassword", docprops.Get("userPassword"))
	security.Set("ownerPassword", docprops.Get("ownerPassword"))
	security.Set("modifying", docprops.Get("modifying"))
	security.Set("copying", docprops.Get("copying"))
	security.Set("annotating", docprops.Get("annotating"))
	security.Set("fillingForms", docprops.Get("fillingForms"))
	security.Set("contentAccessibility", docprops.Get("contentAccessibility"))
	security.Set("documentAssembly", docprops.Get("documentAssembly"))
	security.Set("printing", docprops.Get("printing"))
	SetPageSize(docprops.Get("pageSize"))
End Sub


'set progress call back
Sub SetProgressCallback(module As Object, methodName As String, params As List) As PDFMaker
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, params)
	docDefinition.Put("progressCallback", cb)
	Return Me
End Sub

'set default style
Sub SetDefaultStyle(ds As Map)
	'Log("PDFMaker.SetDefaultStyle")
	If ds.IsInitialized Then
		ds.Put("name", "defaultStyle")
		defaultStyle = GetStyle(ds)
	End If
End Sub

Sub SetStyles(allStyles As Map)
	'Log("PDFMaker.SetStyles")
	For Each sk As String In allStyles.Keys
		Dim sv As Map = allStyles.Get(sk)
		Dim ts As PDFStyle = GetStyle(sv)
		AddStyle(ts)
	Next
End Sub

'get a style from the map
Sub GetStyle(rec As Map) As PDFStyle
	'Log("PDFMaker.GetStyle")
	Dim name As String = rec.Get("name")
	Dim bold As Boolean = rec.get("bold")
	Dim italics As Boolean = rec.Get("italics")
	Dim alignment As String = rec.Get("alignment")
	Dim fontSize As Int = rec.Get("fontSize")
	Dim marginleft As Int = rec.Get("marginleft")
	Dim margintop As Int = rec.Get("margintop")
	Dim marginright As Int = rec.Get("marginright")
	Dim marginbottom As Int = rec.Get("marginbottom")
	Dim noborder As Boolean = rec.Get("noborder")
	Dim borderleft As Boolean = rec.get("borderleft")
	Dim bordertop As Boolean = rec.get("bordertop")
	Dim borderright As Boolean = rec.get("borderright")
	Dim borderbottom As Boolean = rec.get("borderbottom")
	Dim width As Int = rec.Get("width")
	Dim height As Int = rec.get("height")
	Dim color As String = rec.Get("color")
	Dim fillColor As String = rec.get("fillColor")
	Dim background As String = rec.Get("background")
	Dim opacity As Double = rec.Get("opacity")
	Dim angle As Int = rec.get("angle")
	Dim columnGap As Int = rec.get("columnGap")
	Dim decoration As String = rec.Get("decoration")
	If decoration = "none" Then decoration = ""
	Dim decorationStyle As String = rec.Get("decorationStyle")
	If decorationStyle = "none" Then decorationStyle = ""
	Dim decorationColor As String = rec.Get("decorationColor")
	Dim applymargins As Boolean = rec.Get("applymargins")
	Dim applyborders As Boolean = rec.Get("applyborders")
	'
	Dim st As PDFStyle
	st.Initialize
	st.SetName(name)
	st.SetBold(bold)
	st.SetItalics(italics)
	Select Case alignment
		Case "alignmentRight"
			st.alignmentRight = True
		Case "alignmentCenter"
			st.alignmentCenter = True
		Case "alignmentJustify"
			st.alignmentJustify = True
	End Select
	st.SetFontSize(fontSize)
	If applymargins Then
		st.SetMargin(marginleft, margintop, marginright, marginbottom)
	End If
	If noborder Then
		st.NoBorder
	Else
		If applyborders Then
			st.SetBorder(borderleft, bordertop, borderright, borderbottom)
		End If
	End If
	st.SetWidth(width)
	st.setheight(height)
	st.SetColor(color)
	st.SetFillColor(fillColor)
	st.setbackground(background)
	st.SetOpacity(opacity)
	st.SetAngle(angle)
	st.SetColumnGap(columnGap)
	Return st
End Sub


Sub SetProducer(sproducer As String) As PDFMaker
	'Log("PDFMaker.SetProducer")
	If sproducer = "" Then Return Me
	producer = sproducer
	Return Me
End Sub

Sub SetCompress(bcompress As Boolean) As PDFMaker
	'Log("PDFMaker.SetCompress")
	compress = bcompress
	Return Me
End Sub

Sub SetCreator(screator As String) As PDFMaker
	'Log("PDFMaker.SetCreator")
	If screator = "" Then Return Me
	creator = screator
	Return Me
End Sub

Sub SetKeywords(skeywords As String) As PDFMaker
	'Log("PDFMaker.SetKeywords")
	If skeywords = "" Then Return Me
	keywords = skeywords
	Return Me
End Sub

Sub SetSubject(ssubject As String) As PDFMaker
	'Log("PDFMaker.SetSubject")
	If ssubject = "" Then Return Me
	subject = ssubject
	Return Me
End Sub

Sub SetAuthor(sauthor As String) As PDFMaker
	'Log("PDFMaker.SetAuthor")
	If sauthor = "" Then Return Me
	author = sauthor
	Return Me
End Sub

Sub SetTitle(stitle As String) As PDFMaker
	'Log("PDFMaker.SetTitle")
	If stitle = "" Then Return Me
	title = stitle
	Return Me
End Sub

Sub SetPageSize(spageSize As String) As PDFMaker
	'Log("PDFMaker.SetPageSize")
	If spageSize = "" Then Return Me
	pageSize = spageSize
	Return Me
End Sub

Sub SetPageOrientation(spageOrientation As String) As PDFMaker
	'Log("PDFMaker.SetPageOrientation")
	If spageOrientation = "" Then Return Me
	pageOrientation = spageOrientation
	Return Me
End Sub

'preload images before use
Sub Preload(key As String, url As String) As PDFMaker
	'Log("PDFMaker.Preload")
	files.Put(key, url)
	fileKeys.Put(url, key)
	'how many files we need
	NumFiles = files.size
	Return Me
End Sub

'add toc
Sub AddToC(toc As PDFToC) As PDFMaker
	'Log("PDFMaker.AddToC")
	content.Add(toc.Content)
	Return Me
End Sub

'create the TOC
Sub CreateToC As PDFToC
	'Log("PDFMaker.CreateToC")
	Dim toc As PDFToC
	toc.Initialize 
	Return toc
End Sub

'set the margins
Sub SetPageMargins(l As Int, t As Int, r As Int, b As Int) As PDFMaker
	'Log("PDFMaker.SetPageMargins")
	Dim margin As List
	margin.Initialize
	margin.AddAll(Array(l,t,r,b))
	docDefinition.Put("pageMargins", margin)
	Return Me
End Sub

'create a row
Sub CreateRow As PDFRow
	'Log("PDFMaker.CreateRow")
	Dim row As PDFRow
	row.Initialize 
	Return row
End Sub

'create a table
Sub CreateTable As PDFTable
	'Log("PDFMaker.CreateTable")
	Dim tbl As PDFTable
	tbl.Initialize
	Return tbl 
End Sub

'create an image
Sub CreateImage(imgKey As String) As PDFImage
	'Log("PDFMaker.CreateImage")
	Dim img As PDFImage
	img.Initialize 
	img.SetImage(imgKey)
	Return img
End Sub

'add an image
Sub AddImage(img As PDFImage) As PDFMaker
	'Log("PDFMaker.AddImage")
	content.Add(img.Content)
	Return Me
End Sub

'add a table
Sub AddTable(tbl As PDFTable) As PDFMaker
	'Log("PDFMaker.AddTable")
	content.Add(tbl.Content)
	Return Me
End Sub

Sub SetWaterMark(wm As PDFText) As PDFMaker
	'Log("PDFMaker.SetWaterMark")
	docDefinition.Put("watermark", wm.Content)
	Return Me
End Sub

'set background to appear on every page
Sub SetBackground(wm As PDFText) As PDFMaker
	'Log("PDFMaker.SetBackground")
	docDefinition.Put("background", wm.Content)
	Return Me
End Sub

'set header
Sub SetHeader(hdr As PDFText) As PDFMaker
	'Log("PDFMaker.SetHeader")
	docDefinition.Put("header", hdr.content)
	Return Me
End Sub

'add columns to the page
Sub AddColumns(cols As PDFColumns) As PDFMaker
	'Log("PDFMaker.AddColumns")
	content.Add(cols.content)
	Return Me
End Sub

'add a footer to the page
Sub AddFooter(ftr As PDFFooter) As PDFMaker
	'Log("PDFMaker.AddFooter")
	docDefinition.Put("footer", ftr.content)
	Return Me
End Sub

'add a stack
Sub AddStack(stack As PDFStack) As PDFMaker
	'Log("PDFMaker.AddStack")
	content.Add(stack.Content)
	Return Me
End Sub

'add a qr code
Sub AddQRCode(qrCode As PDFQRCode) As PDFMaker
	'Log("PDFMaker.AddQRCode")
	content.Add(qrCode.Content)
	Return Me
End Sub

'add a paragraph
Sub AddParagraphs(stack As PDFParagraphs) As PDFMaker
	'Log("PDFMaker.AddParagraphs")
	content.Add(stack.Content)
	Return Me
End Sub

'add string
Sub AddString(txt As String) As PDFMaker
	'Log("PDFMaker.AddString")
	content.Add(txt)
	Return Me
End Sub

'create a qr code
Sub CreateQRCode As PDFQRCode
	'Log("PDFMaker.CreateQRCode")
	Dim qrcode As PDFQRCode
	qrcode.Initialize 
	Return qrcode
End Sub

'create a stack
Sub CreateStack As PDFStack
	'Log("PDFMaker.CreateStack")
	Dim stack As PDFStack
	stack.Initialize
	Return stack
End Sub

'create paragraphs
Sub CreateParagraphs As PDFParagraphs
	'Log("PDFMaker.CreateParagraphs")
	Dim stack As PDFParagraphs
	stack.Initialize
	Return stack
End Sub

'create a footer
Sub CreateFooter As PDFFooter
	'Log("PDFMaker.CreateFooter")
	Dim ftr As PDFFooter
	ftr.Initialize
	Return ftr 
End Sub

'create a list
Sub CreateList(typeOf As String) As PDFList
	'Log("PDFMaker.CreateList")
	Dim lstOf As PDFList
	lstOf.Initialize(typeOf)
	Return lstOf
End Sub

'add a list
Sub AddList(lstOf As PDFList) As PDFMaker
	'Log("PDFMaker.AddList")
	content.Add(lstOf.Content)
	Return Me
End Sub

'create columns
Sub CreateColumns As PDFColumns
	'Log("PDFMaker.CreateColumns")
	Dim col As PDFColumns
	col.Initialize
	Return col
End Sub

'create a new style
Sub CreateStyle(name As String) As PDFStyle
	'Log("PDFMaker.CreateStyle")
	Dim Style As PDFStyle
	Style.Initialize
	Style.name = name
	Return Style
End Sub

'create style only
Sub CreateStyleOnly As PDFStyle
	'Log("PDFMaker.CreateStyleOnly")
	Dim stl As PDFStyle
	stl.Initialize 
	Return stl
End Sub

'create new text content
Sub CreateText(txt As String) As PDFText
	'Log("PDFMaker.CreateText")
	Dim cnt As PDFText
	cnt.Initialize
	cnt.Append(txt)
	Return cnt
End Sub

'add a style for the collection
Sub AddStyle(style As PDFStyle)
	'Log("PDFMaker.AddStyle")
	Dim name As String = style.name
	Dim stylecontent As Map = style.content
	styles.Put(name, stylecontent)
End Sub

'add text to the page
Sub AddText(currentContent As PDFText)
	'Log("PDFMaker.AddText")
	Dim text As Map = currentContent.Content
	content.Add(text)
End Sub

'convert to json
Sub getJSON As String
	'Log("PDFMaker.getJSON")
	Return mJSON
End Sub

Sub getJSONPretty As String
	Return mJSONPretty
End Sub

'download the pdf document
Sub Download(fileName As String)
	'Log("PDFMaker.Download")
	fName = fileName
	action = "download"
	Build
End Sub

'build the report
private Sub Build
	'Log("PDFMaker.Build")
	If pageSize <> Null Then docDefinition.Put("pageSize", pageSize)
	If pageOrientation <> Null Then docDefinition.Put("pageOrientation", pageOrientation)
	docDefinition.Put("content", content)
	docDefinition.Put("styles", styles)
	If title <> Null Then info.Put("Title", title)
	If author <> Null Then info.Put("Author", author)
	If subject <> Null Then info.Put("Subject", subject)
	If keywords <> Null Then info.Put("Keywords", keywords)
	If creator <> Null Then info.Put("Creator", creator)
	If producer <> Null Then info.Put("Producer", producer)
	If info.Size > 0 Then docDefinition.Put("info", info)
	If compress <> Null Then docDefinition.Put("compress", compress)
	If security.userPassword <> Null Then docDefinition.Put("userPassword", security.userPassword)
	If security.ownerPassword <> Null Then docDefinition.Put("ownerPassword", security.ownerPassword)
	docDefinition.Put("permissions", security.content)
	docDefinition.Put("defaultStyle", defaultStyle.content)
	If files.Size > 0 Then
		For Each k As String In files.Keys
			'get the file url
			Dim v As String = files.Get(k)
			GetFileFromServer(v)
		Next
	Else
		FilesAreReady
	End If
End Sub

'print the pdf document
Sub Print
	'Log("PDFMaker.Print")
	action = "print"
	Build
End Sub

'open the pdf document
Sub Open
	'Log("PDFMaker.Open")
	action = "open"
	Build
End Sub


'code from alwaysbusy
private Sub GetFileFromServer(FileName As String)
	'Log("PDFMaker.GetFileFromServer")
	Dim Response As BANanoFetchResponse
	Dim Blob As BANanoObject
  
	' list (GET is default, and we do not need extra options so we pass Null for the options)
	Dim fetch1 As BANanoFetch
	fetch1.Initialize(FileName, Null)
	fetch1.Then(Response)
	' we got the response promise, so resolve it to a blob
	fetch1.Return(Response.Blob)
	fetch1.Then(Blob)
	'
	' we got the blob, read it in a FileReader
	Dim FileReader As BANanoObject
	FileReader.Initialize2("FileReader", Null)
	Dim event As BANanoEvent
	' when loaded...
	FileReader.AddEventListenerOpen("onload", Array(event))
	' get the data
	Dim Target As BANanoObject = event.OtherField("target")
	Dim DataUrl As String = Target.GetField("result").Result
	' save the data per filename
	Blobs.Put(FileName, DataUrl)
	' if we have them all...
	If Blobs.Size = NumFiles Then
		FilesAreReady
	End If
	' closing the 'onload' event listener function
	FileReader.CloseEventListener
	' get the DataURL, which will call the 'onload' method we've just written
	FileReader.RunMethod("readAsDataURL", Blob)
	fetch1.End ' always end a fetch with this!
End Sub


private Sub forReading(data As Object)
	'Log("PDFMaker.forReading")
	BANano.CallSub(eventHandler, eventMethod, data)
End Sub


private Sub forUpload(data As Object)
	'Log("PDFMaker.forUpload")
	Dim formData As BANanoObject
	formData.Initialize2("FormData",Null)
	formData.RunMethod("append", Array("upload", data, fName))
	BANano.CallSub(eventHandler, eventMethod, formData)
End Sub


private Sub FilesAreReady()
	Try
	'Log("PDFMaker.FilesAreReady")
	If files.Size > 0 Then
		' we got all the files in base64 format
		For Each k As String In Blobs.Keys
			'get the file key using URL
			Dim v As String = fileKeys.Get(k)
			Dim DataUrl As String = Blobs.Get(k)
			images.Put(v, DataUrl)
		Next
  		If images.Size > 0 Then docDefinition.Put("images", images)
	End If
	'ge the definition
	mJSON = BANano.ToJson(docDefinition)
	mJSONPretty = BANano.RunJavascriptMethod("JSON.stringify", Array(docDefinition, Null, 4))
	'
	Dim data As Object
	Dim res As BANanoObject
	Dim prom As BANanoPromise
	Select Case action
	Case "download"
		pdf.RunMethod("createPdf", docDefinition).RunMethod("download", fName)
	Case "print"
		pdf.RunMethod("createPdf", docDefinition).RunMethod("print", Null)
	Case "open"
		pdf.RunMethod("createPdf", docDefinition).RunMethod("open", Null)
	Case "upload"
		res = pdf.RunMethod("createPdf", docDefinition)
		prom = res.RunMethod("getBlob", data)
		prom.Then(data)
		BANano.CallSub(Me, "forUpload", data)
		prom.End
	Case "getDataUrl", "getBlob", "getBuffer", "getBase64"
		res = pdf.RunMethod("createPdf", docDefinition)
		prom = res.RunMethod(action, data)
		prom.Then(data)
		BANano.CallSub(Me, "forReading", data)
		prom.End
	End Select
	Catch
		Log(LastException)
	End Try
End Sub

'
''get the data url of the document
Sub GetDataURL(module As Object, methodName As String)
	'Log("PDFMaker.GetDataURL")
	eventHandler = module
	eventMethod = methodName.tolowercase
	action = "getDataUrl"
	Build
End Sub

''get the blob of the document
Sub GetBlob(module As Object, methodName As String)
	'Log("PDFMaker.GetBlob")
	eventHandler = module
	eventMethod = methodName.tolowercase
	action = "getBlob"
	Build
End Sub

''get the buffer of the document
Sub GetBuffer(module As Object, methodName As String)
	'Log("PDFMaker.GetBuffer")
	eventHandler = module
	eventMethod = methodName.tolowercase
	action = "getBuffer"
	Build
End Sub

''get the base64 of the document
Sub GetBase64(module As Object, methodName As String)
	'Log("PDFMaker.GetNase64")
	eventHandler = module
	eventMethod = methodName.tolowercase
	action = "getBase64"
	Build
End Sub

'upload the file
Sub Upload(module As Object, methodName As String, fileName As String)
	Log("PDFMaker.Upload")
	eventHandler = module
	eventMethod = methodName.tolowercase
	fName = fileName
	action = "upload"
	Build
End Sub

'get form data that you can upload with php
Sub GetFormData(data As Object, fileName As String) As BANanoObject
	'Log("PDFMaker.GetFormData")
	Dim formData As BANanoObject
	formData.Initialize2("FormData",Null)
	formData.RunMethod("append", Array("upload", data, fileName))
	Return formData
End Sub

Sub PageSizes As Map
	Dim ps As List
	ps.Initialize
	ps.Add("4A0")
	ps.Add("2A0")
	ps.Add("A0")
	ps.Add("A1")
	ps.Add("A2")
	ps.Add("A3")
	ps.Add("A4")
	ps.Add("A5")
	ps.Add("A6")
	ps.Add("A7")
	ps.Add("A8")
	ps.Add("A9")
	ps.Add("A10")
	ps.Add("B0")
	ps.Add("B1")
	ps.Add("B2")
	ps.Add("B3")
	ps.Add("B4")
	ps.Add("B5")
	ps.Add("B6")
	ps.Add("B7")
	ps.Add("B8")
	ps.Add("B9")
	ps.Add("B10")
	ps.Add("C0")
	ps.Add("C1")
	ps.Add("C2")
	ps.Add("C3")
	ps.Add("C4")
	ps.Add("C5")
	ps.Add("C6")
	ps.Add("C7")
	ps.Add("C8")
	ps.Add("C9")
	ps.Add("C10")
	ps.Add("RA0")
	ps.Add("RA1")
	ps.Add("RA2")
	ps.Add("RA3")
	ps.Add("RA4")
	ps.Add("SRA0")
	ps.Add("SRA1")
	ps.Add("SRA2")
	ps.Add("SRA3")
	ps.Add("SRA4")
	ps.Add("EXECUTIVE")
	ps.Add("FOLIO")
	ps.Add("LEGAL")
	ps.Add("LETTER")
	ps.Add("TABLOID")
	'
	Dim m As Map = CreateMap()
	For Each strItem As String In ps
		m.Put(strItem, strItem)
	Next
	Return m
End Sub
