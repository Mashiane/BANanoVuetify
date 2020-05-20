B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "devicecode"
	Public Title As String = "Device"
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns2x6
	cont.AddRows(1).AddColumns12
	cont.addrows(4).AddColumns2x6
	
	'
	Dim d1 As VMDevice
	d1.Initialize(vue,"iphoneX", Me).SetIphoneX.SetURL("https://vuetifyjs.com/en/").AddToContainer(cont, 1, 1)
	
	
	Dim d2 As VMDevice
	d2.Initialize(vue, "iphoneXl", Me).SetIphoneX.SetURL("https://vuetifyjs.com/en/").SetLandScape(True).AddToContainer(cont, 1, 2)
	'
	Dim d3 As VMDevice
	d3.Initialize(vue,"ipad", Me).SetIpad.SetURL("https://vuetifyjs.com/en/").AddToContainer(cont, 2, 1)
	
	Dim d4 As VMDevice
	d4.Initialize(vue,"ipadl", Me).SetIpad.SetURL("https://vuetifyjs.com/en/").SetLandScape(True).AddToContainer(cont, 2, 2)
	'
	Dim d5 As VMDevice
	d5.Initialize(vue,"mac", Me).SetMacbook.SetURL("https://vuetifyjs.com/en/").AddToContainer(cont, 3, 1)
	'
	Dim d6 As VMDevice
	d6.Initialize(vue,"note", Me).SetNote8.SetURL("https://vuetifyjs.com/en/").AddToContainer(cont, 4, 1)
	
	Dim d7 As VMDevice
	d7.Initialize(vue,"s5", Me).SetS5White.SetURL("https://vuetifyjs.com/en/").AddToContainer(cont, 4, 2)
	'
	Dim d8 As VMDevice
	d8.Initialize(vue,"n5", Me).SetNexus5.SetURL("https://vuetifyjs.com/en/").AddToContainer(cont, 5, 1)
	
	Dim d9 As VMDevice
	d9.Initialize(vue,"i8", Me).SetIPhone8.SetURL("https://vuetifyjs.com/en/").AddToContainer(cont, 5, 2)
	'
	Dim d10 As VMDevice
	d10.Initialize(vue,"fourS", Me).SetIPhone4S.SetURL("https://vuetifyjs.com/en/").AddToContainer(cont, 6, 1)
	
	Dim d11 As VMDevice
	d11.Initialize(vue,"fiveS", Me).SetIPhone5S.SetURL("https://vuetifyjs.com/en/").AddToContainer(cont, 6, 2)
	'
	cont.SetCenterContentRC(1, 1).SetCenterContentRC(1, 2)
	cont.SetCenterContentRC(2, 1).SetCenterContentRC(2, 2)
	cont.SetCenterContentRC(3, 1)
	cont.SetCenterContentRC(4, 1).SetCenterContentRC(4, 2)
	cont.SetCenterContentRC(5, 1).SetCenterContentRC(5, 2)
	cont.SetCenterContentRC(6, 1).SetCenterContentRC(6, 2)
	
	'add container to page
	vm.AddContainer(cont)
End Sub
