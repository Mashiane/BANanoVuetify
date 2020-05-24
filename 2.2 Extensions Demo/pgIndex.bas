B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Dim vm As BANanoVM
End Sub

Sub Init
	vm.Initialize(Me, Main.appname)
	'add a hamburger
	vm.NavBar.AddHamburger
	vm.NavBar.Hamburger.SetVisible(True)
	'add a logo
	vm.NavBar.Logo.SetBorderRadius("50%")
	vm.NavBar.Logo.SetBorderWidth("1px")
	vm.NavBar.Logo.SetBorderColor("black")
	vm.NavBar.Logo.SetBorderStyle("solid")
	vm.NavBar.Logo.SetSize("46px","46px")
	vm.NavBar.AddLogo("./assets/sponge.png")
	vm.NavBar.Logo.Show
	vm.NavBar.AddTitle(Main.AppTitle,"")
	vm.NavBar.AddSubHeading1(Main.Version)
	vm.NavBar.AddSpacer
	vm.NavBar.SetVisible(True)
	vm.NavBar.SetModeFixed(True)
	vm.NavBar.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	vm.NavBar.SetDark(True)
	vm.Footer.SetVisible(False)
	
	vm.RTL = False
	vm.SnackBar.SetColor("green")
	vm.SnackBar.SetTop(True)
	
	BuildDrawer
	'
	vm.Container.SetFluid(True)
	'
	vm.AddTheme("grey5", vm.vue.COLOR_BLACK, vm.vue.INTENSITY_NORMAL, vm.vue.COLOR_RED, vm.vue.INTENSITY_LIGHTEN5)
	vm.AddTheme("bluedark2", vm.vue.COLOR_WHITE, vm.vue.INTENSITY_NORMAL, vm.vue.COLOR_BLUE, vm.vue.INTENSITY_DARKEN2)
	vm.AddTheme("red-l-2", vm.vue.COLOR_BLACK, vm.vue.INTENSITY_NORMAL, vm.vue.COLOR_RED, vm.vue.INTENSITY_LIGHTEN2)
	vm.AddTheme("white-text-only", vm.vue.COLOR_WHITE, vm.vue.INTENSITY_NORMAL, vm.vue.COLOR_NONE, vm.vue.INTENSITY_NORMAL)
	'
	AddPages
	'
	vm.UX
	'
	vm.NavBar.UpdateTitle(modChartKick.title)
	vm.ShowPage(modChartKick.name)
End Sub

Sub BuildDrawer
	vm.Drawer.List.SetDense(True)
	vm.Drawer.SetWidth("300")
	vm.Drawer.AddTitleSubTitle(Main.AppTitle, $"Version ${Main.version}"$)
	vm.Drawer.AddDivider
	vm.Drawer.AddItem("chartkick", "", "Chart Kick")
	vm.Drawer.AddItem("device", "", "Device")
	vm.drawer.AddItem("gmap", "", "Google Map")
	vm.drawer.AddItem("quill", "", "Quill")
	vm.drawer.AddItem("infobox", "", "Info Box")
	vm.drawer.AddItem("prism", "", "Prism")
	vm.drawer.additem("echarts", "", "ECharts")
	vm.drawer.additem("arccounter", "", "Arc Counter")
	vm.drawer.additem("files", "", "Read Text & Excel Files")
	'vm.drawer.additem("selectsides", "", "Select Sides")
End Sub

'when the ok button is clicked for a confirm dialog
Sub confirm_ok(e As BANanoEvent)
	Dim sproc As String = vm.GetConfirm
	Select Case sproc
	Case "promptuser"
		vm.ShowSnackBar("Yes, use Vuetify!")
	Case Else
		vm.ShowSnackBar(sproc)
	End Select
End Sub

'when the cancel button is clicked for a confirm dialog
Sub confirm_cancel(e As BANanoEvent)
	Dim sproc As String = vm.GetConfirm
	Select Case sproc
	Case ""
	End Select
	vm.ShowSnackBar(sproc)
End Sub

'when the ok button of an alert is clicked
Sub alert_ok(e As BANanoEvent)
	Dim sproc As String = vm.GetAlert
	Select Case sproc
	Case "alertuser"
		vm.ShowSnackBar("Selected alert user!")
	Case Else
		vm.ShowSnackBar(sproc)
	End Select		
End Sub

'*IMPORTANT
Sub draweritems_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	Select Case elID
	Case "selectsides"
		'vm.NavBar.UpdateTitle(modSelectSides.title)
		'vm.ShowPage(modSelectSides.name)
	Case "arccounter"
		vm.NavBar.UpdateTitle(modArcCounter.title)
		vm.ShowPage(modArcCounter.name)
	Case "echarts"
		vm.NavBar.UpdateTitle(modECharts.title)
		vm.ShowPage(modECharts.name)
	Case "prism"
		vm.NavBar.UpdateTitle(modPrism.title)
		vm.ShowPage(modPrism.name)
	Case "quill"
		vm.NavBar.UpdateTitle(modQuill.title)
		vm.ShowPage(modQuill.name)
	Case "infobox"
		vm.NavBar.UpdateTitle(modInfoBox.title)
		vm.ShowPage(modInfoBox.name)
		modInfoBox.refresh
	Case "gmap"
		vm.NavBar.UpdateTitle(modGMap.title)
		vm.ShowPage(modGMap.name)
	Case "device"
		vm.NavBar.UpdateTitle(modDevice.title)
		vm.ShowPage(modDevice.name)
	Case "chartkick"
		vm.NavBar.UpdateTitle(modChartKick.title)
		vm.ShowPage(modChartKick.name)
	Case "files"
		vm.NavBar.UpdateTitle(modFiles.title)
		vm.ShowPage(modFiles.name)
	End Select
End Sub

Sub dashboard_click(e As BANanoEvent)
	vm.ShowSnackBar("Dashboard!")
End Sub

Sub photos_click(e As BANanoEvent)
	vm.ShowSnackBar("Photos")
End Sub

Sub about_click(e As BANanoEvent)
	vm.ShowSnackBar("About!")
End Sub
	
Sub inbox_click(e As BANanoEvent)
	vm.ShowSnackBar("Inbox!")
	vm.pagepause
End Sub

Sub drafs_click(e As BANanoEvent)
	vm.ShowSnackBar("Drafts!")

End Sub

Sub sent_click(e As BANanoEvent)
	vm.ShowSnackBar("Sent!")
End Sub

Sub btnHeart_click(e As BANanoEvent)
	vm.ShowSnackBar("My heart...")
End Sub

Sub btnButton_click(e As BANanoEvent)
	vm.ShowSnackBar("Button click...")
End Sub

Sub AddPages
	vm.addpage(modChartKick.name, modChartKick)
	vm.addpage(modDevice.name, modDevice)
	vm.addpage(modGMap.name, modGMap)
	vm.addpage(modInfoBox.name, modInfoBox)
	vm.AddPage(modQuill.name, modQuill)
	vm.addpage(modPrism.name, modPrism)
	vm.addpage(modECharts.name, modECharts)
	vm.AddPage(modArcCounter.name, modArcCounter)
	vm.AddPage(modFiles.name, modFiles)
	'vm.AddPage(modSelectSides.name, modSelectSides)
End Sub
