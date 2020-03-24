B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "gmapcode"
	Private BANano As BANano  'ignore
	Private buildMap As VMGMap
	Private frm As VMContainer
	Public Title As String = "Google Map"
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	cont.AddRows(2).AddColumns12
	
	'create a container to hold GPS things
	'the grid will be automatically generated
	frm = vm.CreateContainer("content", Me)
	'
	Dim latitude As VMTextField = vm.CreateTextField("txtbuildinglatitude", Me).SetVmodel("building_latitude").SetLabel("GPS Latitude").SetInvalidMessage("The latitude is required!")
	frm.AddControl(latitude.TextField, latitude.ToString,1,2,0,0,0,0,12,6,6,6)
	'
	Dim longitude As VMTextField = vm.CreateTextField("txtbuildinglongitude", Me).SetVmodel("building_longitude").SetLabel("GPS Longitude").SetInvalidMessage("The address is required!")
	frm.AddControl(longitude.TextField, longitude.ToString,1,1,0,0,0,0,12,6,6,6)
	'
	'add content to main container
	cont.AddComponent(1, 1 ,frm.tostring)
	'build the map
	' add map
	Dim mapGrid As VMContainer = vm.CreateContainer("mapGrid", Me)
	mapGrid.AddRows(2).AddColumns12
	'
	Dim mapTool As VMToolBar = vm.CreateToolbar("maptool", Me).AddTitle("Building Location on Map", "")
	mapTool.AddSpacer
	mapTool.AddButton1("btnResetLoc", "", "Reset", "Reset the map location", "")
	mapTool.AddButton1("btnShowLoc", "", "Show", "Show location of building using GPS", "")
	mapGrid.AddComponent(1,1, mapTool.ToString)
	
	buildMap = vm.CreateGMap("build1", Me)
	vm.SetGMapKey("")
	buildMap.SetCenter(-28.4792625, 24.6727135)
	buildMap.SetZoom(8)
	buildMap.SetMapTypeHybrid
	buildMap.setwidth("100%")
	buildMap.setheight("500px")
	buildMap.ClearMarkers
	mapGrid.AddComponent(2,1, buildMap.ToString)
	'
	cont.AddComponent(2, 1 ,mapGrid.tostring)
	'
	vm.AddContainer(cont)
End Sub


Sub btnResetLoc_click(e As BANanoEvent)
	buildMap.clearmarkers
	buildMap.ShowInfoWindow(False)
	buildMap.setcenter(-28.4792625, 24.6727135)
	buildMap.SetZoom(8)
	buildMap.refresh
End Sub

Sub btnShowLoc_click(e As BANanoEvent)
	'we want to check the building GPS loc
	Dim req As Map = CreateMap()
	req.Put("building_longitude", "building_longitude")
	req.Put("building_latitude", "building_latitude")
	'get the gps data
	Dim record As Map = frm.GetData
	'validate
	Dim bvalid As String = vm.validate(record, req)
	If bvalid = False Then
		vm.ShowSnackBar("The GPS Location needs to be specified!")
		Return
	End If
	'show the location
	Dim dlat As Double = vm.GetState("building_latitude",0)
	Dim dlng As Double = vm.getstate("building_longitude",0)
	'get full address
	Dim saddress1 As String = vm.GetState("building_address1","")
	Dim saddress2 As String = vm.GetState("building_address2","")
	Dim saddress3 As String = vm.GetState("building_address3","")
	Dim sfulladdress As String =  vm.JoinNonBlanks(", ", Array(saddress1, saddress2, saddress3))
	'
	buildMap.ClearMarkers
	buildMap.AddMarker("buildx", dlat, dlng, "", $"<strong>${sfulladdress}</string>"$)
	buildMap.SetCenter(dlat, dlng)
	buildMap.SetZoom(8)
	buildMap.ShowInfoWindow(True)
	buildMap.Refresh
End Sub