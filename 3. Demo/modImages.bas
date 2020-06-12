B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "imagesCode"
	Public title As String = "Images"
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
	vm.CreateImage("img1", Me).SetVModel("img1", "https://picsum.photos/510/300?random").SetHover(True).SetHeight("125").SetAspectRatio("1.7").AddToContainer(cont, 1, 1)
	'
	vm.CreateImage("img2", Me).SetLazySrc("https://picsum.photos/id/11/100/60").SetMaxWidth("500").SetMaxHeight("300").SetVModel("img2", "https://picsum.photos/510/300?random").SetAspectRatio("2").AddToContainer(cont, 1, 2)
	'
	vm.CreateImage("img3", Me).SetVModel("img3", "https://picsum.photos/510/300?random").SetContain("125").SetMaxHeight("125").SetAspectRatio("1.4").AddToContainer(cont, 2, 1)
	
	vm.AddContainer(cont)
End Sub
