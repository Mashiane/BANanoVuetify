B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public PDF As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private docKey As String
	Private docVisible As String
	Private options As Map
	Private BANano As BANano 'ignore
	Private JQ As BANanoObject
End Sub

'Initializes the object.
Public Sub Initialize(v As BANanoVue, sid As String, URL As String)
	options.Initialize
	ID = sid.tolowercase
	vue = v
	JQ = vue.jquery
	PDF.Initialize(vue, sid)
	PDF.SetTag("iframe")
	PDF.SetAttr(CreateMap("type":"application/pdf"))
	PDF.SetAttr(CreateMap("frameborder":"0"))
	PDF.SetAttr(CreateMap("scrolling":"no"))
	PDF.SetAttr(CreateMap("allowfullscreen":True))
	SetURL(URL)
	docVisible = $"${ID}visible"$
	SetVIf(docVisible)
	SetVisible(True)
	SetWidth("100%")
	SetHeight("80vh")
End Sub



public Sub RemoveAttr(sName As String) As VMPDF
	PDF.RemoveAttr(sName)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMPDF
	PDF.SetDesignMode(b)
	Return Me
End Sub

'set width
Sub SetWidth(w As String) As VMPDF
	PDF.SetStyle(CreateMap("width":w & " !important"))
	options.Put("width", w)
	Return Me
End Sub

'set height
Sub SetHeight(h As String) As VMPDF
	PDF.SetStyle(CreateMap("height":h & " !important"))
	options.Put("height", h)
	Return Me
End Sub

Sub SetElevation(e As Int) As VMPDF
	PDF.SetElevation(e)
	Return Me
End Sub

Sub SetVisible(b As Boolean)
	vue.SetStateSingle(docVisible, b)
End Sub

Sub SetVIf(vif As Object) As VMPDF
	PDF.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMPDF
	PDF.SetVShow(vif)
	Return Me
End Sub

Sub SetURL(url As String)
	docKey = $"${ID}doc"$
	vue.SetStateSingle(docKey, url)
	PDF.SetAttr(CreateMap(":src":docKey))
End Sub

'view using media
Sub SetURL1(url As String)
	Dim iKey As String = $"#${ID}"$
	BANano.GetElement(iKey).SetAttr("href", url).AddClass("media")
	JQ.Selector(iKey).RunMethod("media", options)
End Sub

Sub ToString As String
	
	Return PDF.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub