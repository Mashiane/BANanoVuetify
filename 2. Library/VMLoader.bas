B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Loader As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Private module As Object   'ignore
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMLoader
	ID = sid.ToLowerCase
	vue = v
	Loader.Initialize(vue, ID).SetTag("loading").SetAttrSingle("v-model", ID)
	module = eventHandler	
	SetOnCancel
	SetFullPage(True)
	SetIsLoading(False)
	SetCanCancel(False)
	SetColor("blue")
	SetLoaderBars
	Return Me
End Sub



public Sub RemoveAttr(sName As String) As VMLoader
	Loader.RemoveAttr(sName)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMLoader
	Loader.SetDesignMode(b)
	Return Me
End Sub


Sub SetIsLoading(b As Boolean) As VMLoader
	Dim isloading As String = $"${ID}loading"$
	vue.SetStateSingle(isloading, b)
	vue.SetStateSingle(ID, b)
	Loader.SetAttr1(":active.sync", isloading)
	Return Me
End Sub

Sub SetCanCancel(b As Boolean) As VMLoader
	Loader.setattr1(":can-cancel", b)
	Return Me
End Sub

Sub SetFullPage(b As Boolean) As VMLoader
	Dim fPage As String = $"${ID}fullpage"$
	vue.SetStateSingle(fPage, b)
	Loader.SetAttr1(":is-full-page", fPage)
	Return Me
End Sub

Sub SetColor(scolor As String) As VMLoader
	Dim xcolor As String = $"${ID}color"$
	vue.SetStateSingle(xcolor, scolor)
	Loader.SetAttr1(":color", xcolor)
	Return Me
End Sub

Sub SetBackgroundColor(scolor As String) As VMLoader
	Dim xcolor As String = $"${ID}backgroundcolor"$
	vue.SetStateSingle(xcolor, scolor)
	Loader.SetAttr1(":background-color", xcolor)
	Return Me
End Sub

Sub SetOpacity(opac As Double) As VMLoader
	Dim xcolor As String = $"${ID}opacity"$
	vue.SetStateSingle(xcolor, opac)
	Loader.SetAttr1(":opacity", xcolor)
	Return Me
End Sub

Sub SetLoader(sloader As String) As VMLoader
	Dim xloader As String = $"${ID}loader"$
	vue.SetStateSingle(xloader, sloader)
	Loader.SetAttr1(":loader", xloader)
	Return Me
End Sub

Sub SetLoaderSpinner As VMLoader
	SetLoader("spinner")
	Return Me
End Sub

Sub SetLoaderDots As VMLoader
	SetLoader("dots")
	Return Me
End Sub

Sub SetLoaderBars As VMLoader
	SetLoader("bars")
	Return Me
End Sub


Sub SetOnCancel As VMLoader
	Dim e As BANanoEvent
	Dim onCancel As String = $"${ID}_oncancel"$
	If SubExists(module, onCancel) = False Then Return Me
	Dim cb As BANanoObject = BANano.CallBack(module, onCancel, Array(e))
	vue.SetCallBack(onCancel, cb)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMLoader
	Loader.SetStyle(m)
	Return Me
End Sub

Sub SetMargin(p As String) As VMLoader
	Loader.SetStyle(CreateMap("margin":p))
	Return Me
End Sub

Sub SetPadding(p As String) As VMLoader
	Loader.SetStyle(CreateMap("padding":p))
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMLoader
	Loader.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMLoader
	Loader.SetAttr(attr)
	Return Me
End Sub

Sub ToString As String
	Return Loader.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMLoader
Loader.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub