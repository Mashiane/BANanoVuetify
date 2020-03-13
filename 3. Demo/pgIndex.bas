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
	'vm.Dark = True
	'vm.SetLocale("ar")
	vm.RTL = False
	vm.SnackBar.SetColor("green")
	vm.SnackBar.SetTop(True)
	vm.NavBar.SetModeFixed(True)
	vm.NavBar.SetHasMenuButton(True)
	vm.NavBar.UpdateLogo("./assets/sponge.png")
	vm.NavBar.UpdateTitle("BANanoVuetify 3")
	vm.NavBar.Logo.SetBorderRadius("50%")
	vm.NavBar.Logo.SetBorder("1px", vm.COLOR_BLACK, vm.BORDER_DOTTED)
	
	'vm.NavBar.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	'vm.NavBar.SetDark(True)
	'
	vm.NavBar.AddSearch("txtsearch")
	vm.NavBar.AddIcon("btnHeart", "mdi-heart", "My heart", "")
	vm.NavBar.AddIcon("btnButton", "mdi-magnify", "My button", "")
	'
	'vm.NavBar.SetSrc("https://picsum.photos/1920/1080?random")
	'

	'
	'vm.Drawer.SetMiniVariant(True)
	'vm.Drawer.SetExpandOnHover(True)
	
	BuildDrawer
	'
	'vm.Drawer.SetSrc("./assets/bg-2.jpg")
	'
	'Dim btnLogOff As VMButton = vm.CreateButton("logOff", Me).SetLabel("Log Off").SetBlock(True)
	'vm.Drawer.AddOnBottomSection(btnLogOff.tostring)
	
	'vm.Drawer.SetDark(True)
	'vm.Drawer.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	
	
	vm.Container.SetFluid(True)
	'
	vm.AddTheme("grey5", vm.vue.COLOR_BLACK, vm.vue.INTENSITY_NORMAL, vm.vue.COLOR_RED, vm.vue.INTENSITY_LIGHTEN5)
	vm.AddTheme("bluedark2", vm.vue.COLOR_WHITE, vm.vue.INTENSITY_NORMAL, vm.vue.COLOR_BLUE, vm.vue.INTENSITY_DARKEN2)
	vm.AddTheme("red-l-2", vm.vue.COLOR_BLACK, vm.vue.INTENSITY_NORMAL, vm.vue.COLOR_RED, vm.vue.INTENSITY_LIGHTEN2)
	vm.AddTheme("white-text-only", vm.vue.COLOR_WHITE, vm.vue.INTENSITY_NORMAL, vm.vue.COLOR_NONE, vm.vue.INTENSITY_NORMAL)
	'
	AddPages
	
	vm.UX
	
End Sub

Sub BuildDrawer
	vm.Drawer.List.SetDense(True)
	vm.Drawer.SetWidth("300")
	vm.Drawer.AddTitleSubTitle("BANanoVuetify", "Version 3.00")
	vm.Drawer.AddDivider
	vm.Drawer.AddItem("alerts", "", "Alerts")
	'vm.Drawer.AddItem("application", "", "Application")
	'vm.Drawer.AddItem("aspectratio", "", "Aspect Ratio")
	vm.Drawer.AddItem("toolbars", "", "Toolbars")
	vm.Drawer.AddItem("grids", "", "Grids")
	vm.Drawer.AddItem("avatars", "", "Avatars")
	vm.Drawer.AddItem("badges", "", "Badges")
	vm.Drawer.AddItem("banners", "", "Banners")
	vm.Drawer.AddItem("bottomnavigation", "", "Bottom Navigation")
	vm.Drawer.AddItem("bottomsheets", "", "Bottom Sheets")
	'vm.Drawer.AddItem("breadcrumbs", "", "Breadcrumbs")
	vm.Drawer.AddItem("buttons", "", "Buttons")
	'vm.Drawer.AddItem("calendars", "", "Calendars")
	'vm.Drawer.AddItem("cards", "", "Cards")
	'vm.Drawer.AddItem("carousel", "", "Carousel")
	vm.Drawer.AddItem("chips", "", "Chips")
	vm.Drawer.AddItem("dialogs", "", "Dialogs")
	'vm.Drawer.AddItem("dividers", "", "Dividers")
	'vm.Drawer.AddItem("expansionpanels", "", "Expansion Panels")
	'vm.Drawer.AddItem("footer", "", "Footer")
	vm.Drawer.AddItem("autocomplete", "", "Auto Complete")
	vm.Drawer.AddItem("checkbox", "", "Check Box")
	vm.Drawer.AddItem("combo", "", "Combo Box")
	vm.Drawer.AddItem("datepicker", "", "Date Picker")
	vm.Drawer.AddItem("fileinput", "", "File Input")
	vm.Drawer.AddItem("form", "", "Form")
	vm.Drawer.AddItem("radiogroups", "", "Radio Groups")
	vm.Drawer.AddItem("selects", "", "Selects")
	vm.Drawer.AddItem("slider", "", "Slider")
	vm.Drawer.AddItem("switch", "", "Switch")
	vm.Drawer.AddItem("textarea", "", "Text Area")
	vm.Drawer.AddItem("textfield", "", "Text Field")
	vm.Drawer.AddItem("timepicker", "", "Time Picker")
	'vm.Drawer.AddItem("groups", "", "Groups")
	'vm.Drawer.AddItem("hover", "", "Hover")
	vm.Drawer.AddItem("icons", "", "Icons")
	vm.Drawer.AddItem("images", "", "Images")
	'vm.Drawer.AddItem("lazy", "", "Lazy")
	vm.Drawer.AddItem("lists", "", "Lists")
	vm.Drawer.AddItem("menus", "", "Menus")
	'vm.Drawer.AddItem("navdrawer", "", "Navigation Drawer")
	vm.Drawer.AddItem("overlays", "", "Overlays")
	'vm.Drawer.AddItem("pagination", "", "Paginations")
	'vm.Drawer.AddItem("parallax", "", "Parallax")
	'vm.Drawer.AddItem("pickers", "", "Pickers")
	'vm.Drawer.AddItem("progress", "", "Progress")
	'vm.Drawer.AddItem("ratings", "", "Ratings")
	'vm.Drawer.AddItem("sheets", "", "Sheets")
	'vm.Drawer.AddItem("skeletonloaders", "", "Skeleton Loaders")
	vm.Drawer.AddItem("snackbars", "", "Snackbars")
	'vm.Drawer.AddItem("sparklines", "", "Sparklines")
	vm.Drawer.AddItem("steppers", "", "Steppers")
	'vm.Drawer.AddItem("subheads", "", "Subheads")
	vm.Drawer.AddItem("tables", "", "Tables")
	vm.Drawer.AddItem("tabs", "", "Tabs")
	'vm.Drawer.AddItem("timelines", "", "Timelines")
	'vm.Drawer.AddItem("tooltips", "", "Tooltips")
	vm.Drawer.AddItem("treeview", "", "TreeView")
	vm.Drawer.AddItem("design", "", "Grid Design")
End Sub

Sub confirm_ok(e As BANanoEvent)
	Dim sproc As String = vm.GetConfirm
	vm.ShowSnackBar(sproc)
End Sub

Sub confirm_cancel(e As BANanoEvent)
	Dim sproc As String = vm.GetConfirm
	vm.ShowSnackBar(sproc)
End Sub

Sub alert_ok(e As BANanoEvent)
	Dim sproc As String = vm.GetAlert
	vm.ShowSnackBar(sproc)
End Sub

'*IMPORTANT
Sub draweritems_click(e As BANanoEvent)
	'get the id from the event
	Dim elID As String = vm.GetIDFromEvent(e)
	vm.pageresume
	Select Case elID
	Case "alerts"
		vm.NavBar.UpdateTitle(modAlert.title)
		vm.ShowPage(modAlert.name)
	Case "bottomsheets"
		vm.NavBar.UpdateTitle(modBottomSheet.title)
		vm.ShowPage(modBottomSheet.name)
	Case "bottomnavigation"
		vm.NavBar.UpdateTitle(modBottomNavigation.title)
		vm.ShowPage(modBottomNavigation.name)
	Case "banners"
		vm.NavBar.UpdateTitle(modBanner.title)
		vm.ShowPage(modBanner.name)
	Case "design"
		vm.NavBar.UpdateTitle(modDesign.title)
		vm.ShowPage(modDesign.name)
	Case "tables"
		vm.NavBar.UpdateTitle(modDataTable.title)
		vm.ShowPage(modDataTable.name)
	Case "treeview"
		vm.NavBar.UpdateTitle(modTreeView.title)
		vm.ShowPage(modTreeView.name)
	Case "overlays"
		vm.NavBar.UpdateTitle("Overlay")
		vm.ShowPage("")
		vm.PagePause		
	Case "images"
		vm.NavBar.UpdateTitle(modImages.title)
		vm.ShowPage(modImages.name)
	Case "icons"
			vm.NavBar.UpdateTitle(modIcons.title)
		vm.showpage(modIcons.name)
	Case "grids"
			vm.NavBar.UpdateTitle(modGrid.title)
		vm.ShowPage(modGrid.name)
	Case "avatars"
			vm.NavBar.UpdateTitle(modAvatar.title)
		vm.ShowPage(modAvatar.name)
	Case "badges"
			vm.NavBar.UpdateTitle(modBadges.title)
		vm.ShowPage(modBadges.name)
	Case "toolbars"
			vm.NavBar.UpdateTitle(modToolbar.title)
		vm.ShowPage(modToolbar.name)
	Case "buttons"
			vm.NavBar.UpdateTitle(modButtons.title)
		vm.ShowPage(modButtons.name)
	Case "cards"
	Case "chips"
			vm.NavBar.UpdateTitle(modChips.title)
		vm.ShowPage(modChips.name)
	Case "dialogs"
			vm.NavBar.UpdateTitle(modDialog.title)
		vm.ShowPage(modDialog.name)
	Case "snackbars"
			vm.NavBar.UpdateTitle(modSnackBar.title)
		vm.ShowPage(modSnackBar.name)
	Case "checkbox"
			vm.NavBar.UpdateTitle(modCheckBox.title)
		vm.ShowPage(modCheckBox.name)
	Case "combo"
			vm.NavBar.UpdateTitle(modCombo.title)
		vm.ShowPage(modCombo.name)
	Case "datepicker"
			vm.NavBar.UpdateTitle(modDatePicker.title)
		vm.ShowPage(modDatePicker.name)
	Case "fileinput"
			vm.NavBar.UpdateTitle(modFileInput.title)
		vm.ShowPage(modFileInput.name)
	Case "form"
			vm.NavBar.UpdateTitle(modForm.title)
		vm.ShowPage(modForm.name)
	Case "radiogroups"
			vm.NavBar.UpdateTitle(modRadioGroups.title)
		vm.ShowPage(modRadioGroups.name)
	Case "selects"
			vm.NavBar.UpdateTitle(modSelects.title)
		vm.ShowPage(modSelects.name)
	Case "slider"
			vm.NavBar.UpdateTitle(modSlider.title)
		vm.ShowPage(modSlider.name)
	Case "switch"
			vm.NavBar.UpdateTitle(modSwitch.title)
		vm.ShowPage(modSwitch.name)
	Case "textarea"
			vm.NavBar.UpdateTitle(modTextArea.title)
		vm.ShowPage(modTextArea.name)
	Case "textfield"
			vm.NavBar.UpdateTitle(modTextField.title)
		vm.ShowPage(modTextField.name)
	Case "timepicker"
			vm.NavBar.UpdateTitle(modTimePicker.title)
		vm.ShowPage(modTimePicker.name)
	Case "menus"
			vm.NavBar.UpdateTitle(modMenus.title)
		vm.ShowPage(modMenus.name)		
	Case "autocomplete"
			vm.NavBar.UpdateTitle(modAutoComplete.title)
		modAutoComplete.reset
		vm.ShowPage(modAutoComplete.name)		
	Case "lists"
			vm.NavBar.UpdateTitle(modLists.title)
		vm.ShowPage(modLists.name)
	Case "steppers"
			vm.NavBar.UpdateTitle(modStepper.title)
		vm.ShowPage(modStepper.name)	
	Case "tabs"
		vm.ShowPage(modTabs.name)	
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
	vm.AddPage(modButtons.name, modButtons)
	vm.AddPage(modCombo.name, modCombo)
	vm.AddPage(modFileInput.name, modFileInput)
	vm.AddPage(modForm.name, modForm)
	vm.AddPage(modSelects.name, modSelects)
	vm.AddPage(modCheckBox.name, modCheckBox)
	vm.AddPage(modSwitch.name, modSwitch)
	vm.AddPage(modRadioGroups.name, modRadioGroups)
	vm.AddPage(modSlider.name, modSlider)
	vm.AddPage(modTextArea.name, modTextArea)
	vm.AddPage(modTextField.name, modTextField)
	vm.AddPage(modImages.name, modImages)
	vm.AddPage(modSnackBar.name, modSnackBar)
	vm.AddPage(modLists.name, modLists)
	vm.AddPage(modDatePicker.name, modDatePicker)
	vm.AddPage(modTimePicker.name, modTimePicker)
	vm.AddPage(modAvatar.name, modAvatar)
	vm.AddPage(modBadges.name, modBadges)
	vm.AddPage(modIcons.name, modIcons)
	vm.AddPage(modGrid.name, modGrid)
	vm.AddPage(modToolbar.name, modToolbar)
	vm.AddPage(modDialog.name, modDialog)
	vm.AddPage(modMenus.name, modMenus)
	vm.AddPage(modAutoComplete.name, modAutoComplete)
	vm.AddPage(modChips.name, modChips)
	vm.AddPage(modStepper.name, modStepper)
	vm.AddPage(modTabs.name, modTabs)
	vm.addpage(modDataTable.name, modDataTable)
	vm.AddPage(modDesign.name, modDesign)
	vm.AddPage(modBanner.name, modBanner)
	vm.AddPage(modTreeView.name, modTreeView)
	vm.AddPage(modBottomNavigation.name, modBottomNavigation)
	vm.AddPage(modBottomSheet.name, modBottomSheet)
	vm.AddPage(modAlert.name, modAlert)
End Sub
