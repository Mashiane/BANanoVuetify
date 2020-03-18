B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "ratingCode"
	Public title As String = "Rating"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(5).AddColumns4x3
	'
	vm.setdata("rating", 4)
	'
	Dim r1 As VMRating = vm.CreateRating("r1", Me).SetVModel("rating").SetBackgroundColorIntensity(vm.color_purple,vm.intensity_lighten3)
	r1.SetColor(vm.color_purple).SetSmall(True)
	cont.AddComponent(1, 1, r1.tostring)
	'
	Dim r2 As VMRating = vm.CreateRating("r2", Me).SetVModel("rating").SetBackgroundColorIntensity(vm.color_pink,vm.intensity_lighten3)
	r2.SetColor(vm.color_pink).SetSize("64")
	cont.AddComponent(1, 2, r2.tostring)
	
	'
	vm.AddContainer(cont)
End Sub
