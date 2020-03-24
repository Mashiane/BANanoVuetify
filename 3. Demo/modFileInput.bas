B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "fileinputCode"
	Public title As String = "File Input"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(10).AddColumns(1, 12, 12, 12, 12)
	'
	vm.CreateFileInput("fi1", Me).SetMultiple(True).SetLabel("File input").SetVModel("myfiles").SetPlaceholder("Please choose some files").AddToContainer(cont, 1, 1)
	'
	vm.CreateFileInput("fi2", Me).SetAccept("image/*").SetLabel("File input").AddToContainer(cont, 2, 1)
	'
	vm.CreateFileInput("fi3", Me).SetChips(True).SetLabel("File input (with chips)").AddToContainer(cont, 3, 1)
	'
	vm.CreateFileInput("fi4", Me).SetSmallChips(True).SetLabel("File input (with small chips)").AddToContainer(cont, 4, 1)
	'
	vm.CreateFileInput("fi5", Me).SetShowSize(True).SetLabel("File input (show size)").AddToContainer(cont, 5, 1)
	'
	vm.CreateFileInput("fi6", Me).SetMultiple(True).SetShowSize(True).SetCounter(True).SetLabel("File input (show size & counter)").AddToContainer(cont, 6, 1)
	'
	vm.CreateFileInput("fi7", Me).SetFilled(True).SetPrependIcon("mdi-camera").SetLabel("File input (custom)").AddToContainer(cont, 7, 1)
	'
	vm.CreateFileInput("fi8", Me).SetOutlined(True).SetDense(True).SetLabel("File input (custom)").AddToContainer(cont, 8, 1)
	'
	Dim fi9 As VMTextField = vm.CreateFileInput("fi9", Me).SetVModel("files").SetColorIntensity(vm.vue.COLOR_DEEPPURPLE, vm.vue.INTENSITY_ACCENT4)
	fi9.SetCounter(True).SetLabel("File Input").SetMultiple(True).SetPlaceholder("Select your files")
	fi9.SetPrependIcon("mdi-paperclip").SetOutlined(True).SetShowSize("1000").AddToContainer(cont, 9, 1)
	
	'add container to page
	vm.AddContainer(cont)
End Sub


