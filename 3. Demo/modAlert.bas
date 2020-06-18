B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "alertCode"
	Public title As String = "Alert"
	Private vm As BANanoVM
End Sub


Sub Code
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(5).AddColumns2x6
	'
	vm.CreateAlert("a1", Me, "success").SetContent("I'm a success alert.").AddToContainer(cont, 1, 1)
	vm.CreateAlert("a2", Me, "info").SetContent("I'm an info alert.").AddToContainer(cont, 1, 1)
	vm.CreateAlert("a3", Me, "warning").SetContent("I'm a warning alert.").AddToContainer(cont, 1, 1)
	vm.CreateAlert("a4", Me, "error").SetContent("I'm an error alert.").AddToContainer(cont, 1, 1)
	'
	vm.CreateAlert("a5", Me, "").SetContent("I'm an alert.").SetIcon("mdi-material-design").SetBorder("top").SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_LIGHTEN2).SetDark(True).AddToContainer(cont, 1, 2)
	vm.CreateAlert("a6", Me, "").SetContent("I'm an alert.").SetBorder("right").SetColorIntensity(vm.COLOR_BLUEGREY, vm.INTENSITY_LIGHTEN2).SetDark(True).AddToContainer(cont, 1, 2)
	vm.CreateAlert("a7", Me, "").SetContent("I'm an alert.").SetIcon("mdi-vuetify").SetProminent(True).SetBorder("bottom").SetColorIntensity(vm.COLOR_PINK, vm.INTENSITY_LIGHTEN2).SetDark(True).AddToContainer(cont, 1, 2)
	vm.CreateAlert("a8", Me, "").SetContent("You've got {B}5{/B} new updates on your timeline!.").SetIcon("mdi-twitter") _
	.SetDismissible(True).SetBorder("left").SetColoredBorder(True).SetOutlined(True).SetColor(vm.COLOR_CYAN).SetElevation(2).AddToContainer(cont, 1, 2)
	'
	vm.CreateAlert("a9", Me, "success").SetContent("I'm an alert.").SetBorder("top").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 2, 1)
	vm.CreateAlert("a10", Me, "info").SetContent("I'm an alert.").SetBorder("right").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_BLUEGREY, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 2, 1)
	vm.CreateAlert("a11", Me, "warning").SetContent("I'm an alert.").SetBorder("bottom").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_PINK, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 2, 1)
	vm.CreateAlert("a12", Me, "error").SetContent("I'm an alert.").SetBorder("left").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_INDIGO, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 2, 1)
	'
	vm.SetData("alert1", True)
	Dim sContent As String = vm.Rand_LoremIpsum(1)
	vm.CreateAlert("a13", Me, "").SetVModel("alert1").SetContent(sContent).SetBorder("left").SetCloseLabel("Close Alert").SetDismissible(True).SetDark(True).SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4).AddToContainer(cont, 3, 1)
	
	
	'add container to page
	vm.AddContainer(cont)
End Sub


  