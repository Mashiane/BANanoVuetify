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
	Private top_bar As VMElement
	Private camera As VMElement
	Private screen As VMElement
	Private bottom_bar As VMElement
	Private deviceNum As Int
	Private home As VMElement
	Private slep As VMElement
	Private volume As VMElement
	Private inner_shadow As VMElement
	Private speaker As VMElement
	Private notch As VMElement
	Private overflow As VMElement
	Private dynamic As VMElement
	Private hasFrame As Boolean
	Private static As VMContainer
	Private hasStatic As Boolean
	Private hasDynamic As Boolean
	Private shadow As VMElement
	Private sensor As VMElement
	Private more_sensors As VMElement
	Private inner As VMElement
	Private sensors As VMElement
End Sub

'initialize the device
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDevice
	BANano.DependsOnAsset("renderstring.min.js")
	BANano.DependsOnAsset("devices.min.css")
	'
	ID = sid.tolowercase
	vue = v
	Device.Initialize(v, ID).SetTag("div")
	top_bar.Initialize(v, $"${ID}tb"$).SetTag("div").AddClass("top-bar")
	bottom_bar.Initialize(v, $"${ID}bb"$).SetTag("div").AddClass("bottom-bar")
	camera.Initialize(v, $"${ID}cam"$).SetTag("div").AddClass("camera")
	screen.Initialize(v, $"${ID}scren"$).SetTag("div").AddClass("screen")
	home.Initialize(v, $"${ID}hom"$).SetTag("div").AddClass("home")
	slep.Initialize(v, $"${ID}slep"$).SetTag("div").AddClass("sleep")
	volume.Initialize(v, $"${ID}vol"$).SetTag("div").AddClass("volume")
	inner_shadow.Initialize(v, $"${ID}inners"$).SetTag("div").AddClass("inner-shadow")
	speaker.Initialize(v, $"${ID}spek"$).SetTag("div").AddClass("speaker")
	notch.Initialize(v, $"${ID}notc"$).SetTag("div").AddClass("notch")
	overflow.Initialize(v, $"${ID}ovf"$).SetTag("div").AddClass("overflow")
	shadow.Initialize(v, $"${ID}shadow"$).SetTag("div").AddClass("shadow")
	sensor.Initialize(v, $"${ID}sensor"$).SetTag("div").AddClass("sensor")
	sensors.Initialize(v, $"${ID}sensors"$).SetTag("div").AddClass("sensors")
	more_sensors.Initialize(v, $"${ID}moresensors"$).SetTag("div").AddClass("more-sensors")
	inner.Initialize(v, $"${ID}inner"$).SetTag("div").AddClass("inner")
	'
	frme.Initialize(v, $"${ID}frme"$).SetTag("iframe")
	frme.SetStyleSingle("width", "100% !important")
	frme.SetStyleSingle("max-width", "100% !important")
	frme.SetStyleSingle("border", "none !important")
	frme.SetStyleSingle("height", "100% !important")
	frme.SetStyleSingle("max-height", "100% !important")
	frme.SetStyleSingle("overflow-y", "auto !important")
	frme.SetStyleSingle("overflow-x", "hidden !important")
	frme.SetStyleSingle("float", "left !important")
	module = eventHandler
	DesignMode = False
	deviceNum = 0
	dynamic = CreateDynamicContent
	hasFrame = False
	Device.SetVShow($"${ID}show"$)
	static.Initialize(vue, $"${ID}static"$, module)
	static.SetStyleSingle("width", "100% !important")
	static.SetStyleSingle("max-width", "100% !important")
	static.SetStyleSingle("height", "100% !important")
	static.SetStyleSingle("max-height", "100% !important")
	static.SetStyleSingle("overflow-y", "auto !important")
	static.SetStyleSingle("overflow-x", "hidden !important")
	static.SetStyleSingle("float", "left !important")
	hasStatic = False
	hasDynamic = False
	Return Me
End Sub

Sub AddDynamicClass(className As String) As VMDevice
	Device.AddDynamicClass(className)
	Return Me
End Sub

'the image should be centered on the RC
Sub SetCenterOnParent(b As Boolean) As VMDevice
	If b = False Then Return Me
	Device.CenterOnParent = True
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
	Device.SetVisible(False)
	Return Me
End Sub

Sub Show As VMDevice
	Device.SetVisible(True)
	Return Me
End Sub

private Sub CreateDynamicContent As VMElement
	Dim ppx As String = $"${ID}dynamic"$
	Dim pp As String = $"${ID}htmlcontent"$
	vue.SetStateSingle(pp,"<div></div>")
	Dim UI As VMElement = vue.CreateTag(ppx, "renderstring")
	UI.Bind(":string", pp)
	UI.SetStyleSingle("width", "100% !important")
	UI.SetStyleSingle("height", "100% !important")
	UI.SetStyleSingle("max-height", "100% !important")
	UI.SetStyleSingle("max-width", "100% !important")
	UI.SetStyleSingle("overflow-y", "auto !important")
	UI.SetStyleSingle("overflow-x", "hidden !important")
	UI.SetStyleSingle("float", "left !important")
	hasDynamic = True
	Return UI
End Sub

'get component
Sub ToString As String
	
	dynamic.SetDesignMode(DesignMode)
	notch.SetDesignMode(DesignMode)
	camera.SetDesignMode(DesignMode)
	speaker.SetDesignMode(DesignMode)
	top_bar.SetDesignMode(DesignMode)
	slep.SetDesignMode(DesignMode)
	bottom_bar.SetDesignMode(DesignMode)
	volume.SetDesignMode(DesignMode)
	overflow.SetDesignMode(DesignMode)
	inner_shadow.SetDesignMode(DesignMode)
	frme.SetDesignMode(DesignMode)
	screen.SetDesignMode(DesignMode)		
	home.SetDesignMode(DesignMode)
	shadow.SetDesignMode(DesignMode)
	more_sensors.SetDesignMode(DesignMode)
	sensor.SetDesignMode(DesignMode)
	sensors.SetDesignMode(DesignMode)
	'
	Select Case deviceNum
		Case 9
			'iphone 5s
			Device.AddChild(top_bar)
			Device.AddChild(slep)
			Device.AddChild(volume)
			Device.AddChild(camera)
			Device.AddChild(sensor)
			Device.AddChild(speaker)
			'
			If hasFrame Then
				frme.Pop(screen)
			Else
				If hasStatic = False Then screen.AddChild(dynamic)
				If hasDynamic = False Then screen.SetText(static.tostring)
			End If
			screen.Pop(Device)
			Device.AddChild(home)
			Device.AddChild(bottom_bar)
		Case 8
			'iphone 4s
			Device.AddChild(top_bar)
			Device.AddChild(slep)
			Device.AddChild(volume)
			Device.AddChild(camera)
			Device.AddChild(sensor)
			Device.AddChild(speaker)
			'
			If hasFrame Then
				frme.Pop(screen)
			Else
				If hasStatic = False Then screen.AddChild(dynamic)
				If hasDynamic = False Then screen.SetText(static.tostring)
			End If
			screen.Pop(Device)
			Device.AddChild(home)
			Device.AddChild(bottom_bar)
		Case 7
			'nexus
			Device.AddChild(top_bar)
			Device.AddChild(slep)
			Device.AddChild(volume)
			Device.AddChild(camera)
			If hasFrame Then
				frme.Pop(screen)
			Else
				If hasStatic = False Then screen.AddChild(dynamic)
				If hasDynamic = False Then screen.SetText(static.tostring)
			End If
			screen.Pop(Device)
		Case 6
			's5 white
			Device.AddChild(top_bar)
			Device.AddChild(slep)
			Device.AddChild(camera)
			Device.AddChild(sensor)
			Device.AddChild(speaker)
			If hasFrame Then
				frme.Pop(screen)
			Else
				If hasStatic = False Then screen.AddChild(dynamic)
				If hasDynamic = False Then screen.SetText(static.tostring)
			End If
			screen.Pop(Device)
			Device.AddChild(home)
		Case 5
			'iphone 8
			Device.AddChild(top_bar)
			Device.AddChild(slep)
			Device.AddChild(volume)
			Device.AddChild(camera)
			Device.AddChild(sensor)
			Device.AddChild(speaker)
			'
			If hasFrame Then
				frme.Pop(screen)
			Else
				If hasStatic = False Then screen.AddChild(dynamic)
				If hasDynamic = False Then screen.SetText(static.tostring)
			End If
			screen.Pop(Device)
			Device.AddChild(home)
			Device.AddChild(bottom_bar)
		Case 4
			'note 8
			overflow.AddChild(shadow)
			Device.AddChild(inner)
			Device.AddChild(overflow)
			Device.AddChild(speaker)
			Device.AddChild(sensors)
			Device.AddChild(more_sensors)
			Device.AddChild(slep)
			Device.AddChild(volume)
			Device.AddChild(camera)
			'
			If hasFrame Then
				frme.Pop(screen)
			Else
				If hasStatic = False Then screen.AddChild(dynamic)
				If hasDynamic = False Then screen.SetText(static.tostring)
			End If
			screen.Pop(Device)
		Case 3
			'iphone x
			notch.AddChild(camera)
			notch.AddChild(speaker)
			'
			Device.AddChild(notch)
			Device.AddChild(top_bar)
			'
			Device.addchild(slep)
			'
			Device.AddChild(bottom_bar)
			'
			Device.AddChild(volume)
			'
			overflow.AddChildDiv("ix1","shadow shadow--tr")
			overflow.AddChildDiv("ix2","shadow shadow--tl")
			overflow.AddChildDiv("ix3","shadow shadow--br")
			overflow.AddChildDiv("ix4","shadow shadow--bl")
			'
			Device.AddChild(overflow)
			'
			Device.AddChild(inner_shadow)
			'
			If hasFrame Then
				screen.AddChild(frme)
			Else
				If hasStatic = False Then screen.AddChild(dynamic)
				If hasDynamic = False Then screen.SetText(static.tostring)
			End If
			'
			Device.AddChild(screen)
			
		Case 1
			'macbook
			top_bar.Pop(Device)
			camera.Pop(Device)
			
			If hasFrame Then
				frme.Pop(screen)
			Else
				If hasStatic = False Then screen.AddChild(dynamic)
				If hasDynamic = False Then screen.SetText(static.tostring)
			End If
			screen.Pop(Device)
	
			bottom_bar.Pop(Device)
		Case 2
			'ipad
			camera.Pop(Device)
			
			If hasFrame Then
				frme.Pop(screen)
			Else
				If hasStatic = False Then screen.AddChild(dynamic)
				If hasDynamic = False Then screen.SetText(static.tostring)
			End If
			
			screen.Pop(Device)
			home.Pop(Device)
	End Select
	Return Device.ToString
End Sub

Sub SetURL(url As String) As VMDevice
	frme.SetSRC(url,False)
	hasFrame = True
	Return Me
End Sub

Sub SetStatic(dynaContent As String)
	static.SetText(dynaContent)
	hasFrame = False
	hasStatic = True
End Sub

Sub SetContent(dynaContent As String)
	Dim pp As String = $"${ID}htmlcontent"$
	vue.SetStateSingle(pp,dynaContent)
	hasFrame = False
	hasDynamic = True
End Sub

Sub SetIphoneX As VMDevice
	Device.AddDynamicClass("marvel-device").AddDynamicClass("iphone-x")
	deviceNum = 3
	Return Me
End Sub

Sub SetIpad As VMDevice
	Device.AddDynamicClass("marvel-device").AddDynamicClass("ipad silver")
	deviceNum = 2
	Return Me
End Sub

Sub SetMacBook As VMDevice
	Device.AddDynamicClass("marvel-device").AddDynamicClass("macbook")
	deviceNum = 1
	Return Me
End Sub

Sub SetNote8 As VMDevice
	Device.AddDynamicClass("marvel-device").AddDynamicClass("note8")
	deviceNum = 4
	Return Me
End Sub

Sub SetS5White As VMDevice
	Device.AddDynamicClass("marvel-device").AddDynamicClass("s5").AddDynamicClass("white")
	deviceNum = 6
	Return Me
End Sub


Sub SetIPhone4S As VMDevice
	Device.AddDynamicClass("marvel-device").AddDynamicClass("iphone4s").AddDynamicClass("silver")
	deviceNum = 8
	Return Me
End Sub


Sub SetIPhone5S As VMDevice
	Device.AddDynamicClass("marvel-device").AddDynamicClass("iphone5s").AddDynamicClass("gold")
	deviceNum = 9
	Return Me
End Sub


Sub SetNexus5 As VMDevice
	Device.AddDynamicClass("marvel-device").AddDynamicClass("nexus5")
	deviceNum = 7
	Return Me
End Sub

Sub SetIPhone8 As VMDevice
	Device.AddDynamicClass("marvel-device").AddDynamicClass("iphone8").AddDynamicClass("gold")
	deviceNum = 5
	Return Me
End Sub


Sub SetDesignMode(b As Boolean) As VMDevice
	Device.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetLandScape(b As Boolean) As VMDevice
	If b Then
		Device.AddDynamicClass("landscape")
	Else
		Device.RemoveDynamicClass("landscape")
	End If	
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

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMDevice
Device.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMDevice
Device.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMDevice
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMDevice
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub