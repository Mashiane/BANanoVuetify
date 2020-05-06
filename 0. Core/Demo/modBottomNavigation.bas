B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "bottomNavCode"
	Public title As String = "Bottom Navigation"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(10).AddColumns2x6
	'
	vm.SetData("bottomNav", "recent")
	Dim bn As VMBottomNavigation = vm.CreateBottomNavigation("bn1", Me).SetVModel("bottomNav").SetColor("teal").SetGrow(True)
	'
	Dim btnRecent As VMButton = vm.CreateButton("btnRecent", Me).SetValue("recent")
	btnRecent.AddComponent(vm.CreateLabel("").SetSpan.SetText("Recent").tostring)
	btnRecent.AddComponent(vm.CreateIcon("", Me).SetText("mdi-history").tostring)
	bn.AddComponent(btnRecent.ToString)
	'
	Dim btnFav As VMButton = vm.CreateButton("btnFav", Me).SetValue("favorites")
	btnFav.AddComponent(vm.CreateLabel("").SetSpan.SetText("Favorites").tostring)
	btnFav.AddComponent(vm.CreateIcon("", Me).SetText("mdi-heart").tostring)
	bn.AddComponent(btnFav.ToString)
	'
	Dim btnNear As VMButton = vm.CreateButton("btnNear", Me).SetValue("nearby")
	btnNear.AddComponent(vm.CreateLabel("").SetSpan.SetText("Nearby").tostring)
	btnNear.AddComponent(vm.CreateIcon("", Me).SetText("mdi-map-marker").tostring)
	bn.AddComponent(btnNear.ToString)
	'	
	cont.AddComponent(1, 1, bn.tostring)
	'
	'*****
	Dim bn2 As VMBottomNavigation = vm.CreateBottomNavigation("bn2", Me).SetVModel("bottomNav").SetColor("primary").SetHorizontal(True)
	'
	Dim btnRecent1 As VMButton = vm.CreateButton("btnRecent1", Me).SetValue("recent")
	btnRecent1.AddComponent(vm.CreateLabel("").SetSpan.SetText("Recent").tostring)
	btnRecent1.AddComponent(vm.CreateIcon("", Me).SetText("mdi-history").tostring)
	bn2.AddComponent(btnRecent1.ToString)
	'
	Dim btnFav1 As VMButton = vm.CreateButton("btnFav1", Me).SetValue("favorites")
	btnFav1.AddComponent(vm.CreateLabel("").SetSpan.SetText("Favorites").tostring)
	btnFav1.AddComponent(vm.CreateIcon("", Me).SetText("mdi-heart").tostring)
	bn2.AddComponent(btnFav1.ToString)
	'
	Dim btnNear1 As VMButton = vm.CreateButton("btnNear1", Me).SetValue("nearby")
	btnNear1.AddComponent(vm.CreateLabel("").SetSpan.SetText("Nearby").tostring)
	btnNear1.AddComponent(vm.CreateIcon("", Me).SetText("mdi-map-marker").tostring)
	bn2.AddComponent(btnNear1.ToString)
	'
	cont.AddComponent(1, 2, bn2.tostring)
	'
	'*****
	Dim bn3 As VMBottomNavigation = vm.CreateBottomNavigation("bn3", Me).SetVModel("bottomNav").SetDark(True).SetShift(True)
	'
	Dim btnRecent2 As VMButton = vm.CreateButton("btnRecent2", Me).SetValue("recent")
	btnRecent2.AddComponent(vm.CreateLabel("").SetSpan.SetText("Recent").tostring)
	btnRecent2.AddComponent(vm.CreateIcon("", Me).SetText("mdi-history").tostring)
	bn3.AddComponent(btnRecent2.ToString)
	'
	Dim btnFav2 As VMButton = vm.CreateButton("btnFav2", Me).SetValue("favorites")
	btnFav2.AddComponent(vm.CreateLabel("").SetSpan.SetText("Favorites").tostring)
	btnFav2.AddComponent(vm.CreateIcon("", Me).SetText("mdi-heart").tostring)
	bn3.AddComponent(btnFav2.ToString)
	'
	Dim btnNear2 As VMButton = vm.CreateButton("btnNear2", Me).SetValue("nearby")
	btnNear2.AddComponent(vm.CreateLabel("").SetSpan.SetText("Nearby").tostring)
	btnNear2.AddComponent(vm.CreateIcon("", Me).SetText("mdi-map-marker").tostring)
	bn3.AddComponent(btnNear2.ToString)
	'
	cont.AddComponent(2, 1, bn3.tostring)
	'
	vm.AddContainer(cont)
End Sub

Sub btnRecent_click(e As BANanoEvent)
	vm.ShowSnackBar("Recent!")
End Sub

Sub btnFav_click(e As BANanoEvent)
	vm.ShowSnackBar("Favorites!")
End Sub

Sub btnNear_click(e As BANanoEvent)
	vm.ShowSnackBar("Near!")
End Sub