B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "carouselCode"
	Public title As String = "Carousel"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(5).AddColumns12
	
	' create a list of images
	Dim items As List
	items.initialize
	items.add(CreateMap("src":"./assets/squirrel.jpg"))
	items.add(CreateMap("src":"./assets/sky.jpg"))
	items.add(CreateMap("src":"./assets/bird.jpg"))
	items.add(CreateMap("src":"./assets/planet.jpg"))
	'save to state
	vm.setdata("images", items)
	
	Dim c1 As VMCarousel = vm.CreateCarousel("c1", Me).SetHeight("400").SetCycle(True).SetHideDelimiterBackground(True)
	c1.SetShowArrowsOnHover(True)
	c1.item.SetVFor("(item, i)", "images")
	c1.item.Bind(":key", "i")
	c1.item.Bind(":src", "item.src")
	c1.item.SetReverseTransition("fade-transition")
	c1.item.SetTransition("fade-transition")
	cont.AddComponent(1, 1, c1.tostring)
	
	'add container to page
	vm.AddContainer(cont)
End Sub
