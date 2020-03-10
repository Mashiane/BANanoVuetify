B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
'http://marvelapp.github.io/devices.css/
Sub Class_Globals
	Public Device As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private module As Object
	Private DesignMode As Boolean
	Private frme As VMElement
	Private tb As VMElement
	Private cam As VMElement
	Private scren As VMElement
	Private bb As VMElement
	Private deviceNum As Int
	Private hom As VMElement
	Private slep As VMElement
	Private vol As VMElement
	Private inners As VMElement
	Private spek As VMElement
	Private notc As VMElement
	Private ovf As VMElement
	Private dynamic As VMElement
	Private hasFrame As Boolean
End Sub

'initialize the device
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDevice
	ID = sid.tolowercase
	vue = v
	Device.Initialize(v, ID).SetTag("div")
	tb.Initialize(v, $"${ID}tb"$).SetTag("div").AddClass("top-bar")
	bb.Initialize(v, $"${ID}tb"$).SetTag("div").AddClass("bottom-bar")
	cam.Initialize(v, $"${ID}cam"$).SetTag("div").AddClass("camera")
	scren.Initialize(v, $"${ID}scren"$).SetTag("div").AddClass("screen")
	hom.Initialize(v, $"${ID}hom"$).SetTag("div").AddClass("home")
	slep.Initialize(v, $"${ID}slep"$).SetTag("div").AddClass("sleep")
	vol.Initialize(v, $"${ID}vol"$).SetTag("div").AddClass("volume")
	inners.Initialize(v, $"${ID}inners"$).SetTag("div").AddClass("inner-shadow")
	spek.Initialize(v, $"${ID}spek"$).SetTag("div").AddClass("speaker")
	notc.Initialize(v, $"${ID}notc"$).SetTag("div").AddClass("notch")
	ovf.Initialize(v, $"${ID}ovf"$).SetTag("div").AddClass("overflow")
	'
	frme.Initialize(v, $"${ID}frme"$).SetTag("iframe")
	frme.SetStyleSingle("width", "100%")
	frme.SetStyleSingle("border", "none")
	frme.SetStyleSingle("height", "100%")
	module = eventHandler
	DesignMode = False
	deviceNum = 0
	dynamic = CreateDynamicContent
	hasFrame = False
	Device.SetVShow($"${ID}show"$)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMDevice
	Device.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMDevice
	Device.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMDevice
	Device.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMDevice
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMDevice
	Device.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMDevice
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMDevice
	Device.RemoveAttr(sName)
	Return Me
End Sub

Sub SetContainer(b As Boolean) As VMDevice
	If b = False Then Return Me
	Device.AddClass("container")
	Return Me
End Sub

Sub Hide As VMDevice
	Device.hide
	Return Me
End Sub

Sub Show As VMDevice
	Device.Show
	Return Me
End Sub

private Sub CreateDynamicContent As VMElement
	Dim ppx As String = $"${ID}dynamic"$
	Dim pp As String = $"${ID}htmlcontent"$
	vue.SetStateSingle(pp,"<div></div>")
	Dim UI As VMElement = vue.CreateTag(ppx, "renderstring")
	UI.Bind(":string", pp)
	UI.SetStyleSingle("width", "100%")
	UI.SetStyleSingle("height", "100%")
	Return UI
End Sub

'get component
Sub ToString As String
	
	dynamic.SetDesignMode(DesignMode)
	notc.SetDesignMode(DesignMode)
	cam.SetDesignMode(DesignMode)
	spek.SetDesignMode(DesignMode)
	tb.SetDesignMode(DesignMode)
	slep.SetDesignMode(DesignMode)
	bb.SetDesignMode(DesignMode)
	vol.SetDesignMode(DesignMode)
	ovf.SetDesignMode(DesignMode)
	inners.SetDesignMode(DesignMode)
	frme.SetDesignMode(DesignMode)
	scren.SetDesignMode(DesignMode)		
	hom.SetDesignMode(DesignMode)
	'
	Select Case deviceNum
		Case 3
			'iphone x
			notc.AddChild(cam)
			notc.AddChild(spek)
			'
			Device.AddChild(notc)
			Device.AddChild(tb)
			'
			Device.addchild(slep)
			'
			Device.AddChild(bb)
			'
			Device.AddChild(vol)
			'
			ovf.AddChildDiv("ix1","shadow shadow--tr")
			ovf.AddChildDiv("ix2","shadow shadow--tl")
			ovf.AddChildDiv("ix3","shadow shadow--br")
			ovf.AddChildDiv("ix4","shadow shadow--bl")
			'
			Device.AddChild(ovf)
			'
			Device.AddChild(inners)
			'
			If hasFrame Then
				scren.AddChild(frme)
			Else
				scren.AddChild(dynamic)
			End If
			'
			Device.AddChild(scren)
			
		Case 1
			'macbook
			tb.Pop(Device)
			cam.Pop(Device)
			
			If hasFrame Then
				frme.Pop(scren)
			Else
				scren.AddChild(dynamic)
			End If
			scren.Pop(Device)
	
			bb.Pop(Device)
		Case 2
			'ipad
			cam.Pop(Device)
			
			If hasFrame Then
				frme.Pop(scren)
			Else
				scren.AddChild(dynamic)
			End If
			
			scren.Pop(Device)
			hom.Pop(Device)
	End Select
	Return Device.ToString
End Sub

Sub SetURL(url As String) As VMDevice
	frme.SetSRC(url,False)
	hasFrame = True
	Return Me
End Sub

Sub SetContent(dynaContent As String)
	Dim pp As String = $"${ID}htmlcontent"$
	vue.SetStateSingle(pp,dynaContent)
	hasFrame = False
End Sub

Sub SetIphoneX As VMDevice
	Device.AddClass("marvel-device iphone-x")
	deviceNum = 3
	Return Me
End Sub

Sub SetIpad As VMDevice
	Device.AddClass("marvel-device ipad silver")
	deviceNum = 2
	Return Me
End Sub

Sub SetMacBook As VMDevice
	Device.AddClass("marvel-device macbook")
	deviceNum = 1
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMDevice
	Device.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetLandScape As VMDevice
	Device.AddClass("landscape")
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMDevice
	Device.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMDevice
	Device.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMDevice
	Dim childHTML As String = child.ToString
	Device.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMDevice
	If t = "" Then Return Me
	Device.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMDevice
	Device.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDevice
	Device.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMDevice
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
Sub SetPadding(p As Object) As VMDevice
	Device.SetPaddingAll(p)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMDevice
	Device.SetDisabled(b)
	Return Me
End Sub

Sub SetKey(k As String) As VMDevice
	Device.SetKey(k, False)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub
