B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Device As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private module As Object
	Private DesignMode As Boolean
	Private Content As VMElement
	Private xFrame As VMElement
End Sub

'initialize the device
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDevices
	ID = sid.tolowercase
	vue = v
	Device.Initialize(v, ID).SetTag("div")
	Content.Initialize(v, $"${ID}content"$).SetTag("div").AddClass("content").SetStyleSingle("position", "fixed")
	xFrame.Initialize(v, $"${ID}iframe"$).SetTag("iframe")
	xFrame.SetStyleSingle("width", "100%")
	xFrame.SetStyleSingle("border", "none")
	xFrame.SetStyleSingle("height", "100%")
	xFrame.SetStyleSingle("display", "block")
 	'xFrame.SetScrollBar(True)
	module = eventHandler
	DesignMode = False
	Return Me
End Sub

'<iframe src="./myPage.aspx" ID="myIframe" scrolling="no" frameborder="0"
'    style="position: relative; height: 100%; width: 100%;">
'...
'</iframe>

Sub SetURL(url As String) As VMDevices
	xFrame.SetSRC(url,False)
	Return Me
End Sub

Sub SetSmartPhone As VMDevices
	Device.AddClass("smartphone")
	Return Me
End Sub

Sub SetLaptop As VMDevices
	Device.AddClass("laptop")
	Return Me
End Sub

Sub SetTablet As VMDevices
	Device.AddClass("tablet")
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMDevices
	Device.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

'get component
Sub ToString As String
	xFrame.SetDesignMode(DesignMode)
	Content.SetDesignMode(DesignMode)
	xFrame.Pop(Content)
	Content.Pop(Device)
	Return Device.ToString
End Sub

Sub SetVIf(vif As Object) As VMDevices
	Device.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMDevices
	Device.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMDevices
	Dim childHTML As String = child.ToString
	Device.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMDevices
	If t = "" Then Return Me
	Device.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMDevices
	Device.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDevices
	Device.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMDevices
	Device.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMDevices
	Device.SetPaddingAll(p)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMDevices
	Device.SetDisabled(b)
	Return Me
End Sub

Sub SetKey(k As String) As VMDevices
	Device.SetKey(k, False)
	Return Me
End Sub
