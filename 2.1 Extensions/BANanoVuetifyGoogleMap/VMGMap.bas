B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
'get api key: https://developers.google.com/maps/documentation/javascript/get-api-key
Sub Class_Globals
	Public GMap As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private module As Object
	Private markers As VMElement
	Private options As Map
	Private points As List
	Private markerName As String
	Private infoWindow As VMElement
	Private iwOptions As String
	Private iwPosition As String
	Private iwOpen As String
	Private curMidx As String
	Type GMarker(ID As String, lat As Double, lng As Double, label As String, infoText As String)
	Private kmlLayer As VMElement
	Private kmlName As String
	Private VueGoogleMaps As BANanoObject
End Sub

'initialize the Field
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object, gKey As String) As VMGMap
	BANano.DependsOnAsset("vue-google-maps.js")
	vue = v
	module = eventHandler
	'
	If vue.ModuleExist("googlemap") = False Then	
		VueGoogleMaps.Initialize("VueGoogleMaps")
		Dim opt As Map = CreateMap()
		Dim load As Map = CreateMap()
		load.Put("key", gKey)
		load.Put("libraries", "places")
		opt.Put("load", load)
		opt.Put("installComponents", True)
		vue.Use1(VueGoogleMaps, opt)
		vue.AddModule("googlemap")
	End If	
	
	ID = sid.tolowercase
	GMap.Initialize(v, ID).SetTag("gmap-map")
	GMap.SetAttrSingle(":options", $"${ID}options"$)
	vue.setstatesingle($"${ID}options"$, CreateMap())
	markerName = $"${ID}markers"$
	kmlName = $"${ID}kmlayers"$
	'
	options.Initialize
	markers.initialize(vue,markerName)
	markers.SetTag("gmap-marker")
	markers.SetAttrSingle(":position","m.position")
	markers.SetAttrSingle("v-if", $"${ID}markersvisible"$)
	markers.SetAttrSingle(":clickable", True)
	markers.SetAttrSingle(":draggable", True)
	markers.SetVFor("(m,i)", markerName)
	markers.SetAttrSingle(":key", "m.id")
	markers.SetAttrSingle("@click", "toggleinfowindow(m,i)")
	SetEvents
	vue.SetStateSingle(markerName, vue.newlist)
	points.Initialize
	'
	iwPosition = $"${ID}iwpos"$
	iwOptions = $"${ID}opt"$
	iwOpen = $"${ID}open"$
	curMidx = $"${ID}midx"$
	'
	vue.setstatesingle(iwPosition, Null)
	vue.setstatesingle(iwOpen, False)
	vue.setstatesingle(curMidx, Null)
	'
	infoWindow.Initialize(vue, $"${ID}iw"$).SetTag("gmap-info-window")
	infoWindow.SetAttrSingle(":options", iwOptions)
	infoWindow.setattrsingle(":position", iwPosition)
	infoWindow.SetAttrSingle(":opened", iwOpen)
	infoWindow.SetAttrSingle("@closeclick", "closeinfowindow")
	'
	Dim woptions As Map = CreateMap()
	Dim pixelOffset As Map = CreateMap()
	pixelOffset.Put("width", 0)
	pixelOffset.put("height", -35)
	woptions.Put("content", "")
	woptions.put("pixelOffset", pixelOffset)
	vue.SetStateSingle(iwOptions, woptions)
	
	'
	kmlLayer.Initialize(vue, kmlName).SetTag("google-kml-layer")
	kmlLayer.SetAttrSingle("v-if", $"${ID}kmlvisible"$)
	vue.setstatesingle(kmlName, vue.newlist)
	kmlLayer.SetAttrSingle(":clickable", True)
	kmlLayer.SetVFor("lyr", kmlName)
	kmlLayer.SetAttrSingle(":url", "lyr.url")
	'
	ShowKML(False)
	ShowMarkers(True)
	'
	'set options
	SetFullscreenControl(True)
	SetDisableDefaultUi(False)
	SetMapTypeControl(True)
	SetRotateControl(True)
	SetStreetViewControl(True)
	SetScaleControl(True)
	SetZoomControl(True)
	GMap.SetVShow($"${ID}show"$)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMGMap
	GMap.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMGMap
	GMap.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMGMap
	GMap.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMGMap
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMGMap
	GMap.RemoveAttr(sName)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMGMap
	GMap.SetDesignMode(b)
	Return Me
End Sub

Sub ShowInfoWindow(b As Boolean) As VMGMap
	vue.SetStateSingle(iwOpen, b)
	Return Me
End Sub

Sub SetKMLURL(url As String) As VMGMap
	Dim kmlold As List
	Dim kml As List = vue.GetState(kmlName, kmlold)
	Dim nl As Map = CreateMap()
	nl.put("url", url)
	kml.add(nl)
	vue.setstatesingle(kmlName, kml)
	Return Me
End Sub

Sub ShowMarkers(b As Boolean) As VMGMap
	vue.setstatesingle($"${ID}markersvisible"$, b)
	Return Me
End Sub

Sub ShowKML(b As Boolean) As VMGMap
	vue.setstatesingle($"${ID}kmlvisible"$, b)
	Return Me
End Sub

Private Sub closeInfoWindow
	vue.setstatesingle(iwOpen, False)
End Sub

private Sub toggleInfoWindow(m As Map, i As Object)
	Dim mo As Map = CreateMap()
	Dim infoWindowPos As Map = m.Get("position")
	Dim mcontent As String = m.Get("infoText")	
	Dim infoOptions As Map = vue.GetState(iwOptions, mo)
	infoOptions.Put("content", mcontent)
	vue.setstatesingle(iwPosition, infoWindowPos)
	vue.setstatesingle(iwOptions, infoOptions)
	'
	Dim cIdx As Object = vue.getstate(curMidx, Null)
	If cIdx = i Then
		vue.ToggleState(iwOpen)
	Else
		vue.SetStateSingle(iwOpen, True)
		vue.setstatesingle(curMidx, i)
	End If
End Sub	

private Sub SetEvents
	Dim m, i As Object
	Dim cb As BANanoObject = BANano.CallBack(Me, "toggleInfoWindow", Array(m, i))
	vue.SetCallBack("toggleInfoWindow", cb)
	'
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Me, "closeInfoWindow", Array(e))
	vue.SetCallBack("closeInfoWindow", cb)
End Sub	

'clear all markers
Sub ClearMarkers As VMGMap
	points.Initialize
	Return Me
End Sub

'refresh markers
Sub Refresh
	vue.SetStateSingle(markerName, points)
End Sub

Sub AddMarker(mID As String, lat As Double, lng As Double, label As String, info As String)
	mID = mID.tolowercase
	Dim point As Map = CreateMap()
	Dim marker As Map = CreateMap()
	'
	lat = BANano.parseFloat(lat)
	lng = BANano.parseFloat(lng)
	
	point.Put("lat", lat)
	point.put("lng", lng)
	'
	marker.put("position", point)
	marker.put("id", mID)
	If info <> Null Then marker.Put("infoText", info)
	If label <> Null Then marker.put("label", label)
	points.add(marker)
End Sub

Sub SetZoomControl(b As Boolean) As VMGMap
	options.put("zoomControl", b)
	Return Me
End Sub

Sub SetScaleControl(b As Boolean) As VMGMap
	options.put("scaleControl", b)
	Return Me
End Sub

Sub SetStreetViewControl(b As Boolean) As VMGMap
	options.put("streetViewControl", b)
	Return Me
End Sub

Sub SetRotateControl(b As Boolean) As VMGMap
	options.put("rotateControl", b)
	Return Me
End Sub

Sub SetMapTypeControl(b As Boolean) As VMGMap
	options.put("mapTypeControl", b)
	Return Me
End Sub

Sub SetDisableDefaultUi(b As Boolean) As VMGMap
	options.put("disableDefaultUi", b)
	Return Me
End Sub

Sub SetFullscreenControl(b As Boolean) As VMGMap
	options.put("fullscreenControl", b)
	Return Me
End Sub

Sub SetCenter(lat As Double, lng As Double) As VMGMap
	lat = BANano.parseFloat(lat)
	lng = BANano.parseFloat(lng)
	'
	Dim pp As String = $"${ID}center"$
	Dim point As Map = CreateMap()
	point.put("lat", lat)
	point.put("lng", lng)
	vue.SetStateSingle(pp, point)
	GMap.SetAttrSingle(":center", pp)
	Return Me
End Sub

Sub SetZoom(z As Int) As VMGMap
	z = BANano.parseInt(z)
	Dim pp As String = $"${ID}zoom"$
	vue.SetStateSingle(pp, z)
	SetAttrSingle(":zoom", pp)
	Return Me
End Sub

Sub SetHeight(h As String) As VMGMap
	SetStyleSingle("height", h)
	Return Me
End Sub

Sub SetWidth(h As String) As VMGMap
	SetStyleSingle("width", h)
	Return Me
End Sub

Sub SetMapType(maptype As String) As VMGMap
	Dim pp As String = $"${ID}maptype"$
	vue.setstatesingle(pp, maptype)
	SetAttrSingle(":map-type-id", pp)
	Return Me
End Sub

Sub SetMapTypeRoadMap As VMGMap
	SetMapType("roadmap")
	Return Me
End Sub

Sub SetMapTypeSatellite As VMGMap
	SetMapType("satellite")
	Return Me
End Sub


Sub SetMapTypeHybrid As VMGMap
	SetMapType("hybrid")
	Return Me
End Sub

Sub SetMapTypeTerrain As VMGMap
	SetMapType("terrain")
	Return Me
End Sub


'get component
Sub ToString As String
	
	vue.SetStateSingle($"${ID}options"$, options)
	vue.SetStateSingle(markerName, points)
	infoWindow.Pop(GMap)
	kmlLayer.pop(GMap)
	markers.pop(GMap)
	Return GMap.ToString
End Sub

Sub SetVIf(vif As Object) As VMGMap
	GMap.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMGMap
	GMap.SetVShow(vif)
	Return Me
End Sub

Sub Hide As VMGMap
	GMap.Hide
	Return Me
End Sub

Sub Show As VMGMap
	GMap.Show
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMGMap
	Dim childHTML As String = child.ToString
	GMap.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMGMap
	GMap.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMGMap
	GMap.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMGMap
	GMap.SetAttr(attr)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, vals As Object) As VMGMap
	GMap.SetAttrSingle(prop, vals)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMGMap
	GMap.SetStyle(sm)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, val As Object) As VMGMap
	GMap.setstylesingle(prop, val)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMGMap
	GMap.SetPaddingAll(p)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMGMap
GMap.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMGMap
GMap.SetVisible(b)
Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMGMap
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMGMap
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub