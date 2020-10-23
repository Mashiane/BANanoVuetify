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
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(15).AddColumns12
	'
	vm.CreateAlert("a1", Me, "").SetColor(vm.color_green).SetContent("I'm a success alert.").Show.AddPrependIcon("mdi-material-design", "red").SetDismissible(True).AddToContainer(cont, 1, 1)
	pgIndex.CreateVBCode(vue, Me, "a1code", "Alert", $"vm.CreateAlert("a1", Me, "").SetColor(vm.color_green).SetContent("I'm a success alert.").Show.AddPrependIcon("mdi-material-design", "red").SetDismissible(True).AddToContainer(cont, 1, 1)"$).AddToContainer(cont, 1, 1)
	'
	vm.CreateAlert("a2", Me, "info").SetContent("I'm an info alert.").Show.AddToContainer(cont, 2, 1)
	pgIndex.CreateVBCode(vue, Me, "a2code", "Alert", $"vm.CreateAlert("a2", Me, "info").SetContent("I'm an info alert.").AddToContainer(cont, 1, 1)"$).AddToContainer(cont, 2, 1)
	'
	vm.CreateAlert("a3", Me, "warning").SetContent("I'm a warning alert.").Show.AddToContainer(cont, 3, 1)
	pgIndex.CreateVBCode(vue, Me, "a3code", "Alert", $"vm.CreateAlert("a3", Me, "warning").SetContent("I'm a warning alert.").AddToContainer(cont, 1, 1)"$).AddToContainer(cont, 3, 1)
	'
	vm.CreateAlert("a4", Me, "error").SetContent("I'm an error alert.").Show.AddToContainer(cont, 4, 1)
	pgIndex.CreateVBCode(vue, Me,"a4code", "Alert", $"vm.CreateAlert("a4", Me, "error").SetContent("I'm an error alert.").AddToContainer(cont, 1, 1)"$).AddToContainer(cont, 4, 1)
	'
	vm.CreateAlert("a5", Me, "").SetContent("I'm an alert.").Show.SetIcon("mdi-material-design").SetBorder("top").SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_LIGHTEN2).SetDark(True).AddToContainer(cont, 5, 1)
	pgIndex.CreateVBCode(vue, Me,"a5code", "Alert", $"vm.CreateAlert("a5", Me, "").SetContent("I'm an alert.").SetIcon("mdi-material-design").SetBorder("top").SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_LIGHTEN2).SetDark(True).AddToContainer(cont, 1, 1)"$).AddToContainer(cont, 5, 1)
	'
	
	vm.CreateAlert("a6", Me, "").SetContent("I'm an alert.").Show.SetBorder("right").SetColorIntensity(vm.COLOR_BLUEGREY, vm.INTENSITY_LIGHTEN2).SetDark(True).AddToContainer(cont, 6, 1)
	pgIndex.CreateVBCode(vue, Me, "a6code", "Alert", $"vm.CreateAlert("a6", Me, "").SetContent("I'm an alert.").SetBorder("right").SetColorIntensity(vm.COLOR_BLUEGREY, vm.INTENSITY_LIGHTEN2).SetDark(True).AddToContainer(cont, 1, 1)"$).AddToContainer(cont, 6, 1)
	'
		
	vm.CreateAlert("a7", Me, "").SetContent("I'm an alert.").Show.SetIcon("mdi-vuetify").SetProminent(True).SetBorder("bottom").SetColorIntensity(vm.COLOR_PINK, vm.INTENSITY_LIGHTEN2).SetDark(True).AddToContainer(cont, 7, 1)
	pgIndex.CreateVBCode(vue, Me, "a7code", "Alert", $"vm.CreateAlert("a7", Me, "").SetContent("I'm an alert.").Show.SetIcon("mdi-vuetify").SetProminent(True).SetBorder("bottom").SetColorIntensity(vm.COLOR_PINK, vm.INTENSITY_LIGHTEN2).SetDark(True).AddToContainer(cont, 1, 1)"$).AddToContainer(cont, 7, 1)
'	
	vm.CreateAlert("a8", Me, "").Show.SetContent("You've got {B}5{/B} new updates on your timeline!.").SetIcon("mdi-twitter").SetDismissible(True).SetBorder("left").SetColoredBorder(True).SetOutlined(True).SetColor(vm.COLOR_CYAN).SetElevation(2).AddToContainer(cont, 8, 1)
	pgIndex.CreateVBCode(vue, Me, "a8code", "Alert", $"vm.CreateAlert("a8", Me, "").Show.SetContent("You've got {B}5{/B} new updates on your timeline!.").SetIcon("mdi-twitter").SetDismissible(True).SetBorder("left").SetColoredBorder(True).SetOutlined(True).SetColor(vm.COLOR_CYAN).SetElevation(2).AddToContainer(cont, 1, 1)"$).AddToContainer(cont, 8, 1)
'	
	vm.CreateAlert("a9", Me, "success").Show.SetContent("I'm an alert.").SetBorder("top").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 9, 1)
	pgIndex.CreateVBCode(vue, Me, "a9code", "Alert", $"vm.CreateAlert("a9", Me, "success").SetContent("I'm an alert.").SetBorder("top").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 9, 1)"$).AddToContainer(cont, 9, 1)
	
	vm.CreateAlert("a10", Me, "info").Show.SetContent("I'm an alert.").SetBorder("right").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_BLUEGREY, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 10, 1)
	pgIndex.CreateVBCode(vue, Me, "a10code", "Alert", $"vm.CreateAlert("a10", Me, "info").SetContent("I'm an alert.").SetBorder("right").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_BLUEGREY, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 10, 1)"$).AddToContainer(cont, 10, 1)

	vm.CreateAlert("a11", Me, "warning").Show.SetContent("I'm an alert.").SetBorder("bottom").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_PINK, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 11, 1)
	pgIndex.CreateVBCode(vue, Me, "a11code", "Alert", $"vm.CreateAlert("a11", Me, "warning").SetContent("I'm an alert.").SetBorder("bottom").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_PINK, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 11, 1)"$).AddToContainer(cont, 11, 1)

	
	vm.CreateAlert("a12", Me, "error").Show.SetContent("I'm an alert.").SetBorder("left").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_INDIGO, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 12, 1)
	pgIndex.CreateVBCode(vue, Me, "a12code", "Alert", $"vm.CreateAlert("a12", Me, "error").SetContent("I'm an alert.").SetBorder("left").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_INDIGO, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 12, 1)"$).AddToContainer(cont, 12, 1)

	'
	Dim sContent As String = vm.Rand_LoremIpsum(1)
	vm.CreateAlert("a13", Me, "").Show.SetContent(sContent).SetBorder("left").SetCloseLabel("Close Alert").SetDismissible(True).SetDark(True).SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4).AddToContainer(cont, 13, 1)
	pgIndex.CreateVBCode(vue, Me,"a13code", "Alert", $"Dim sContent As String = vm.Rand_LoremIpsum(1)<br>vm.CreateAlert("a13", Me, "").Show.SetContent(sContent).SetBorder("left").SetCloseLabel("Close Alert").SetDismissible(True).SetDark(True).SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4).AddToContainer(cont, 13, 1)"$).AddToContainer(cont, 13, 1)

	
	'add container to page
	vm.AddContainer(cont)
End Sub

Sub a1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a1code")
End Sub
Sub a2codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a2code")
End Sub
Sub a3codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a3code")
End Sub
Sub a4codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a4code")
End Sub
Sub a5codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a5code")
End Sub
Sub a6codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a6code")
End Sub
Sub a7codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a7code")
End Sub
Sub a8codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a8code")
End Sub
Sub a9codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a9code")
End Sub
Sub a10codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a10code")
End Sub
Sub a11codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a11code")
End Sub
Sub a12codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a12code")
End Sub
Sub a13codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("a13code")
End Sub

Sub a1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("a1code", "a1code.txt")
End Sub
