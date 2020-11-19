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
	Dim vue As BANanoVue
	Private BANano As BANano
End Sub

Sub Init
	vm.Initialize(Me, Main.appname)
	vue = vm.vue
	vue.DateDisplayFormat = "DD, MMM YYYY"
	vm.ShowWarnings = False
	vue.ShowWarnings = False		
	'vm.Dark = True
	'vm.SetLocale("ar")
	vm.RTL = False
	vm.SnackBar.SetColor("green")
	vm.SnackBar.SetTop(True)
	vm.SnackBar.SetShaped(True) 
	
	BuildNavBar
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
	BuildFooter
	
	vm.UX
	
	vm.showpage(modProgress.name)
End Sub

Sub BuildNavBar
	'add a hamburger
	vm.NavBar.AddHamburger
	vm.NavBar.Hamburger.SetVisible(True)
	'vm.NavBar.SetClippedLeft(True)
		
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
	'
	vm.NavBar.AddSearch("txtsearch")
	vm.NavBar.AddIcon("btnHeart", "mdi-heart", "My heart", "")
	vm.NavBar.AddIcon("btnButton", "mdi-magnify", "My button", "")
	'
	'vm.NavBar.SetSrc("https://picsum.photos/1920/1080?random")
	'

End Sub

Sub BuildFooter
	vm.Footer.SHow
	vm.Footer.SetFixed(True)
	vm.Footer.SetColor("indigo")
	vm.footer.Container.SetTag("div")
	vm.footer.Container.AddRows(1).AddColumns12
	vm.Footer.AddMadeWithLove(1, 1, "with B4J, BANanano & BANanoVuetify by", "TheMash", "mbanga.anele@gmail.com")
End Sub

Sub BuildDrawer
	'vm.Drawer.SetClipped(True)
	vm.Drawer.Show
	'
	'vm.Drawer.SetMiniVariant(True)
	'vm.Drawer.SetExpandOnHover(True)
	
	'
	'Dim btnLogOff As VMButton = vm.CreateButton("logOff", Me).SetLabel("Log Off").SetBlock(True)
	'vm.Drawer.AddOnBottomSection(btnLogOff.tostring)
	
	'vm.Drawer.SetDark(True)
	'vm.Drawer.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	
	
	vm.Drawer.SetOpenOnMediumLarge(True)
	'vm.Drawer.SetSrc("https://picsum.photos/1920/1080?random")
	vm.Drawer.List.SetDense(True)
	vm.Drawer.SetWidth("300")
	vm.Drawer.AddTitleSubTitle("BANanoVuetifyCore", $"Version ${Main.version}"$)
	vm.Drawer.AddDivider
	'
	vm.Drawer.AddParentChild("","styles", "", "", "Styles & Animations","")
	vm.Drawer.AddParentChild("styles","borders", "", "", "Borders & Radius","")
	vm.Drawer.AddParentChild("styles","itemgroups", "", "", "Item Groups","")
	vm.Drawer.AddParentChild("styles","slidegroups", "", "", "Slide Groups","")
	vm.Drawer.AddParentChild("styles","windows", "", "", "Windows","")
	'vm.Drawer.AddParentChild("styles","dynamic", "", "", "Dynamic Input Controls","")
	'vm.drawer.AddParentChild("styles", "gridselect", "", "", "Grid Select", "")
	'
	vm.Drawer.AddParentChild("","ui", "", "", "UI Components","")
	vm.Drawer.AddParentChild("ui","alerts", "", "", "Alerts","")
	vm.Drawer.AddParentChild("ui", "avatars", "", "", "Avatars","")
	vm.Drawer.AddParentChild("ui", "badges", "", "", "Badges","")
	vm.Drawer.AddParentChild("ui", "banners", "", "", "Banners","")
	vm.Drawer.AddParentChild("ui", "bottomnavigation", "", "", "Bottom Navigation","")
	vm.Drawer.AddParentChild("ui", "bottomsheets", "", "", "Bottom Sheets","")
	vm.Drawer.AddParentChild("ui", "breadcrumbs", "", "", "Breadcrumbs","")
	vm.Drawer.AddParentChild("ui", "buttons", "", "", "Buttons","")
	vm.Drawer.AddParentChild("ui", "calendar", "", "", "Calendar","")
	vm.Drawer.AddParentChild("ui", "cards", "", "", "Cards","")
	vm.drawer.AddParentChild("ui", "carousel", "","", "Carousel","")
	vm.Drawer.AddParentChild("ui", "chips", "", "", "Chips","")
	vm.Drawer.AddParentChild("ui", "dialogs", "", "", "Dialogs", "")
	vm.Drawer.AddParentChild("ui", "expansionpanel", "", "", "Expansion Panel","")
	'
	vm.Drawer.AddParentChild("ui", "icons", "", "", "Icons","")
	vm.Drawer.AddParentChild("ui", "images", "","", "Images","")
	'vm.Drawer.AddParentChild("lazy", "", "Lazy")
	vm.Drawer.AddParentChild("ui", "lists", "", "", "Lists","")
	vm.Drawer.AddParentChild("ui", "menus", "", "", "Menus","")
	vm.Drawer.AddParentChild("ui", "overlays", "", "", "Overlays","")
	vm.Drawer.AddParentChild("ui", "pagination", "", "", "Paginations","")
	vm.Drawer.AddParentChild("ui", "parallax", "", "", "Parallax","")
	vm.Drawer.AddParentChild("ui", "progress", "", "", "Progress", "")
	vm.Drawer.AddParentChild("ui", "modLoadingSkeleton", "", "", "Skeleton Loaders","")
	vm.Drawer.AddParentChild("ui", "snackbars", "","", "Snackbars","")
	vm.Drawer.AddParentChild("ui", "sparklines", "", "", "Sparklines","")
	vm.Drawer.AddParentChild("ui", "steppers", "", "", "Steppers","")
	vm.Drawer.AddParentChild("ui", "tables", "", "", "Tables","")
	vm.Drawer.AddParentChild("ui", "simpletable", "", "", "Simple Table","")
	vm.Drawer.AddParentChild("ui", "tabs", "", "", "Tabs","")
	vm.Drawer.AddParentChild("ui", "timelines", "", "", "Timelines","")
	vm.Drawer.AddParentChild("ui", "toolbars", "", "", "Toolbars","")
	vm.Drawer.AddParentChild("ui", "treeview", "", "", "TreeView","")
	'
	vm.Drawer.AddParentChild("", "forms", "", "", "Form Inputs", "")
	vm.Drawer.AddParentChild("forms", "autocomplete", "", "", "Auto Complete","")
	vm.Drawer.AddParentChild("forms", "checkbox", "", "", "Check Box","")
	vm.Drawer.AddParentChild("forms", "combo", "", "", "Combo Box","")
	vm.Drawer.AddParentChild("forms", "colorpicker", "", "", "Color Picker","")
	vm.Drawer.AddParentChild("forms", "datepicker", "", "", "Date Picker","")
	vm.Drawer.AddParentChild("forms", "fileinput", "", "", "File Input","")
	vm.Drawer.AddParentChild("forms", "form", "","", "Form","")
	vm.Drawer.AddParentChild("forms", "radiogroups", "", "", "Radio Groups","")
	vm.drawer.AddParentChild("forms", "rating", "", "", "Rating","")
	vm.Drawer.AddParentChild("forms", "selects", "","", "Selects","")
	vm.Drawer.AddParentChild("forms", "switch", "", "", "Switch","")
	vm.Drawer.AddParentChild("forms", "slider", "","", "Slider","")
	vm.Drawer.AddParentChild("forms", "textarea", "","", "Text Area","")
	vm.Drawer.AddParentChild("forms", "textfield", "","", "Text Field","")
	vm.Drawer.AddParentChild("forms", "timepicker", "", "", "Time Picker","")
	'
	vm.Drawer.AddParentChild("", "grid", "", "", "Grid Design", "")
	vm.Drawer.AddParentChild("grid", "grids", "", "", "Grids","")
	vm.Drawer.AddParentChild("grid", "design", "", "", "Grid Design","")
	
	vm.Drawer.AddParentChild("", "examples", "", "", "Examples", "")
	'vm.drawer.AddParentChild("examples", "pages", "", "", "Creating Pages","")
	vm.drawer.AddParentChild("examples", "messageboard", "", "", "Message Board","")
	vm.drawer.AddParentChild("examples", "reallogs", "", "", "Realtime Logging","")
	
	'vm.Drawer.AddParentChild("", "extensions", "", "", "Extensions", "")
	'vm.Drawer.AddParentChild("extensions", "toolkit", "", "", "Toolkit", "")
	
	
	'* IMPORTANT
	vm.drawer.Refresh
	
	
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
Sub draweritems_click(elID As Object)
	vm.pageresume
	vm.BottomNav.Hide
	modSnackBar.HideSnacks
	'stop logs
	vm.callmethod("stop")
	Select Case elID
	Case "pages"
		'vm.NavBar.UpdateTitle(modPages.title)
		'vm.showpage(modPages.name)
	Case "gridselect"
		'vm.NavBar.UpdateTitle(modGridSelect.title)
		'vm.showpage(modGridSelect.name)
	Case "dynamic"
		'vm.NavBar.UpdateTitle(modDynamic.title)
		'vm.showpage(modDynamic.name)
		'modDynamic.BuildDynamicForm
	Case "windows"
		vm.NavBar.UpdateTitle(modWindow.title)
		vm.ShowPage(modWindow.name)
	Case "slidegroups"
		vm.NavBar.UpdateTitle(modSlideGroups.title)
		vm.ShowPage(modSlideGroups.name)
	Case "itemgroups"
		vm.NavBar.UpdateTitle(modItemGroups.title)
		vm.ShowPage(modItemGroups.name)
	Case "borders"
		vm.NavBar.UpdateTitle(pgBRs.title)
		vm.ShowPage(pgBRs.name)
	Case "toolkit"
		vm.NavBar.UpdateTitle(modToolkit.title)
		vm.ShowPage(modToolkit.name)
		modToolkit.Show
	Case "calendar"
		vm.NavBar.UpdateTitle(modCalendar.title)
		vm.ShowPage(modCalendar.name)
	Case "reallogs"
		vm.NavBar.UpdateTitle(modRealtimeLogging.title)
		vm.ShowPage(modRealtimeLogging.name)
	Case "progress"
		vm.NavBar.UpdateTitle(modProgress.title)
		vm.ShowPage(modProgress.name)
	Case "pagination"
		vm.NavBar.UpdateTitle(modPagination.title)
		vm.ShowPage(modPagination.name)
	Case "breadcrumbs"
		vm.NavBar.UpdateTitle(modBreadCrumbs.title)
		vm.ShowPage(modBreadCrumbs.name)
	Case "cards"
		vm.NavBar.UpdateTitle(modCard.title)
		vm.ShowPage(modCard.name)
	Case "sparklines"
		vm.NavBar.UpdateTitle(modSparkLine.title)
		vm.ShowPage(modSparkLine.name)
	Case "timelines"
		vm.NavBar.UpdateTitle(modTimeLine.title)
		vm.ShowPage(modTimeLine.name)
	Case "modloadingskeleton"
		vm.NavBar.UpdateTitle(modLoadingSkeleton.title)
		vm.ShowPage(modLoadingSkeleton.name)
	Case "rating"
		vm.NavBar.UpdateTitle(modRating.title)
		vm.ShowPage(modRating.name)
	Case "colorpicker"
		vm.NavBar.UpdateTitle(modColorPicker.title)
		vm.ShowPage(modColorPicker.name)
	Case "parallax"
		vm.NavBar.UpdateTitle(modParallax.title)
		vm.ShowPage(modParallax.name)
	Case "expansionpanel"
		vm.NavBar.UpdateTitle(modExpansionPanels.title)
		vm.ShowPage(modExpansionPanels.name)
	Case "messageboard"
		vm.NavBar.UpdateTitle(modMessageBoard.title)
		vm.ShowPage(modMessageBoard.name)
	Case "carousel"
		vm.NavBar.UpdateTitle(modCarousel.title)
		vm.ShowPage(modCarousel.name)
	Case "alerts"
		vm.NavBar.UpdateTitle(modAlert.title)
		vm.ShowPage(modAlert.name)
	Case "bottomsheets"
		vm.NavBar.UpdateTitle(modBottomSheet.title)
		vm.ShowPage(modBottomSheet.name)
	Case "bottomnavigation"
		vm.BottomNav.Show
		vm.NavBar.UpdateTitle(modBottomNavigation.title)
		vm.ShowPage(modBottomNavigation.name)
	Case "banners"
		vm.NavBar.UpdateTitle(modBanner.title)
		vm.ShowPage(modBanner.name)
	Case "design"
		vm.NavBar.UpdateTitle(modDesign.title)
		vm.ShowPage(modDesign.name)
	Case "simpletable"
		vm.NavBar.UpdateTitle(modSimpleTable.title)
		vm.ShowPage(modSimpleTable.name)
	Case "tables"
		vm.NavBar.UpdateTitle(modDataTable.title)
		vm.ShowPage(modDataTable.name)
	Case "treeview"
		vm.NavBar.UpdateTitle(modTreeView.title)
		vm.ShowPage(modTreeView.name)
	Case "overlays"
		vm.NavBar.UpdateTitle(modOverlay.title)
		vm.ShowPage(modOverlay.name)
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
	Case "chips"
			vm.NavBar.UpdateTitle(modChips.title)
		vm.ShowPage(modChips.name)
	Case "dialogs"
			vm.NavBar.UpdateTitle(modDialog.title)
		vm.ShowPage(modDialog.name)
	Case "snackbars"
		vm.NavBar.UpdateTitle(modSnackBar.title)
		vm.ShowPage(modSnackBar.name)
		modSnackBar.ShowSnacks
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
	vm.AddPage(modCarousel.name, modCarousel)
	vm.AddPage(modMessageBoard.name, modMessageBoard)
	vm.AddPage(modExpansionPanels.name, modExpansionPanels)
	vm.addpage(modParallax.name, modParallax)
	vm.addpage(modColorPicker.name, modColorPicker)
	vm.addpage(modRating.name, modRating)
	vm.AddPage(modLoadingSkeleton.name, modLoadingSkeleton)
	vm.AddPage(modTimeLine.name, modTimeLine)
	vm.AddPage(modSparkLine.name, modSparkLine)
	vm.AddPage(modCard.name, modCard)
	vm.AddPage(modBreadCrumbs.name, modBreadCrumbs)
	vm.AddPage(modPagination.name, modPagination)
	vm.AddPage(modProgress.name, modProgress)
	vm.AddPage(modOverlay.name, modOverlay)
	vm.AddPage(modRealtimeLogging.name, modRealtimeLogging)
	vm.AddPage(modCalendar.name, modCalendar)
	'vm.AddPage(modToolkit.name, modToolkit)
	vm.AddPage(pgBRs.name, pgBRs)
	vm.AddPage(modItemGroups.name, modItemGroups)
	vm.AddPage(modSlideGroups.name, modSlideGroups)
	vm.AddPage(modWindow.name, modWindow)
	'vm.addpage(modDynamic.name, modDynamic)
	'vm.AddPage(modGridSelect.Name, modGridSelect)
	'vm.AddPage(modPages.name, modPages)
	vm.AddPage(modSimpleTable.name, modSimpleTable)
End Sub

Private Sub bottomnav_change(value As Object)
	vm.ShowSnackBarSuccess(value)
End Sub

Sub CreateVBCode(vuex As BANanoVue, module As Object, codeID As String, sTitle As String, scode As String) As VMPrism
	scode = scode.Replace("~", "$")
	Dim pri As VMPrism
	pri.Initialize(vuex, codeID, module)
	pri.SetLanguage("vb")
	pri.SetTitle(sTitle)
	pri.SetCode(scode)
	Return pri
End Sub
  