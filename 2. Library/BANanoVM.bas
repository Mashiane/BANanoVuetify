B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Public Modules As Map
	Private BANano As BANano   'ignore
	Public vue As BANanoVue
	Private Pages As List
	Public VApp As VMElement
	Public VContent As VMElement
	Public RouterView As VMElement
	Public Container As VMContainer
	Public BOVuetify As BANanoObject
	Public Animate As VMTransition
	Public Drawer As VMNavigationDrawer
	Public NavBar As VMToolBar
	Public Footer As VMFooter
	Private Module As Object
	Public Elevation As Map
	Public Transition As Map
	Public Transitions As Map
	Public IntensityOptions As Map
	Public ColorOptions As Map
	Public BorderOptions As Map
	Public Overlay As VMOverlay
	Public vuetify As BANanoObject
	Public Confirm As VMDialog
	Public Alert As VMDialog
	Public DisplayOptions As Map
	Public TextAlignmentOptions As Map
	Public FontWeightOptions As Map
	Public TargetOptions As Map
	Public ColumnTypes As Map
	Public Direction As Map
	Public ColumnAlign As Map
	Public DataTypes As Map
	Public ControlTypes As Map
	Public BottomNav As VMBottomNavigation
	Public Notification As VMAlert
	'
	Public const COLOR_AMBER As String = "amber"
	Public const COLOR_BLACK As String = "black"
	Public const COLOR_BLUE As String = "blue"
	Public const COLOR_BLUEGREY As String = "blue-grey"
	Public const COLOR_BROWN As String = "brown"
	Public const COLOR_CYAN As String = "cyan"
	Public const COLOR_DEEPORANGE As String = "deep-orange"
	Public const COLOR_DEEPPURPLE As String = "deep-purple"
	Public const COLOR_GREEN As String = "green"
	Public const COLOR_GREY As String = "grey"
	Public const COLOR_INDIGO As String = "indigo"
	Public const COLOR_LIGHTBLUE As String = "light-blue"
	Public const COLOR_LIGHTGREEN As String = "light-green"
	Public const COLOR_LIME As String = "lime"
	Public const COLOR_ORANGE As String = "orange"
	Public const COLOR_PINK As String = "pink"
	Public const COLOR_PURPLE As String = "purple"
	Public const COLOR_RED As String = "red"
	Public const COLOR_TEAL As String = "teal"
	Public const COLOR_TRANSPARENT As String = "transparent"
	Public const COLOR_WHITE As String = "white"
	Public const COLOR_YELLOW As String = "yellow"
	Public const COLOR_NONE As String = ""
	Public const COLOR_PRIMARY As String = "primary"
	Public const COLOR_SECONDARY As String = "secondary"
	Public const COLOR_ACCENT As String = "accent"
	Public const COLOR_ERROR As String = "error"
	Public const COLOR_INFO As String = "info"
	Public const COLOR_SUCCESS As String = "success"
	Public const COLOR_WARNING As String = "warning"
	Public const COLOR_NONE As String = ""
	'
	Public const INTENSITY_NORMAL As String = ""
	Public const INTENSITY_LIGHTEN5 As String = "lighten-5"
	Public const INTENSITY_LIGHTEN4 As String = "lighten-4"
	Public const INTENSITY_LIGHTEN3 As String = "lighten-3"
	Public const INTENSITY_LIGHTEN2 As String = "lighten-2"
	Public const INTENSITY_LIGHTEN1 As String = "lighten-1"
	Public const INTENSITY_DARKEN1 As String = "darken-1"
	Public const INTENSITY_DARKEN2 As String = "darken-2"
	Public const INTENSITY_DARKEN3 As String = "darken-3"
	Public const INTENSITY_DARKEN4 As String = "darken-4"
	Public const INTENSITY_ACCENT1 As String = "accent-1"
	Public const INTENSITY_ACCENT2 As String = "accent-2"
	Public const INTENSITY_ACCENT3 As String = "accent-3"
	Public const INTENSITY_ACCENT4 As String = "accent-4"
	'
	Public const BORDER_DEFAULT As String = ""
	Public const BORDER_DASHED As String = "dashed"
	Public const BORDER_DOTTED As String = "dotted"
	Public const BORDER_DOUBLE As String = "double"
	Public const BORDER_GROOVE As String = "groove"
	Public const BORDER_HIDDEN As String = "hidden"
	Public const BORDER_INSET As String = "inset"
	Public const BORDER_NONE As String = "none"
	Public const BORDER_OUTSET As String = "outset"
	Public const BORDER_RIDGE As String = "ridge"
	Public const BORDER_SOLID As String = "solid"
	'
	Public const SIZE_H1 As String = "h1"
	Public const SIZE_H2 As String = "h2"
	Public const SIZE_H3 As String = "h3"
	Public const SIZE_H4 As String = "h4"
	Public const SIZE_H5 As String = "h5"
	Public const SIZE_H6 As String = "h6"
	Public const SIZE_P As String = "p"
	Public const SIZE_SPAN As String = "span"
	Public const SIZE_BLOCKQUOTE As String = "blockquote"
	Public const SIZE_DIV As String = "div"
	'
	Public const ICON_SMALL As String = "small"
	Public const ICON_LARGE As String = "large"
	Public const ICON_XSMALL As String = "x-small"
	Public const ICON_XLARGE As String = "x-large"
	'
	Public const BUTTON_SMALL As String = "small"
	Public const BUTTON_LARGE As String = "large"
	Public const BUTTON_XSMALL As String = "x-small"
	Public const BUTTON_XLARGE As String = "x-large"
	
	Public const TRANSITION_SLIDE_X As String = "slide-x-transition"
	Public const TRANSITION_SLIDE_X_REVERSE As String = "slide-x-reverse-transition"
	Public const TRANSITION_SLIDE_Y As String = "slide-y-transition"
	Public const TRANSITION_SLIDE_Y_REVERSE As String = "slide-y-reverse-transition"
	Public const TRANSITION_SCROLL_X As String = "scroll-x-transition"
	Public const TRANSITION_SCROLL_X_REVERSE As String = "scroll-x-reverse-transition"
	Public const TRANSITION_SCROLL_Y As String = "scroll-y-transition"
	Public const TRANSITION_SCROLL_Y_REVERSE As String = "scroll-y-reverse-transition"
	Public const TRANSITION_SCALE As String = "scale-transition"
	Public const TRANSITION_FADE As String = "fade-transition"
	Public const TRANSITION_FAB As String = "fab-transition"
	'
	Public const JUSTIFY_CENTER As String = "center"
	Public const JUSTIFY_START As String = "start"
	Public const JUSTIFY_END As String = "end"
	'
	Public const ALIGN_CENTER As String = "center"
	Public const ALIGN_START As String = "start"
	Public const ALIGN_END As String = "end"
	Public const ALIGN_STRETCH As String = "stretch"
	'
	Public const FLEX_GROW_0 As String = "flex-grow-0"
	Public const FLEX_GROW_1 As String = "flex-grow-1"
	Public const FLEX_SHRINK_0 As String = "flex-shrink-0"
	Public const FLEX_SHRINK_1 As String = "flex-shrink-1"
	'
	Public const TEXT_LEFT As String = "text-left"
	Public const TEXT_CENTER As String = "text-center"
	Public const TEXT_RIGHT As String = "text-right"
	Public const TEXT_NO_WRAP As String = "text-no-wrap"
	Public const TEXT_TRUNCATE As String = "text-truncate"
	Public const TEXT_LOWERCASE As String = "text-lowercase"
	Public const TEXT_UPPERCASE As String = "text-uppercase"
	Public const TEXT_CAPITALIZE As String = "text-capitalize"
			
	Public SnackBar As VMSnackBar
	Public RTL As Boolean
	Public Dark As Boolean
	Private Options As Map
	Private lang As String
	Private drawers As List
	Private placeHolder As Int
	Public Floats As Map
	Public FontSizes As Map
	Private bUseRouter As Boolean
	Public Position As Map
	Public ShowWarnings As Boolean
	Public ScrollBarWidth As Int
	'
	Public CONST BREAKPOINT_XS As String = "xs"
	Public CONST BREAKPOINT_SM As String = "sm"
	Public CONST BREAKPOINT_MD As String = "md"
	Public CONST BREAKPOINT_LG As String = "lg"
	Public CONST BREAKPOINT_XL As String = "xl"
	
	Public CONST BREAKPOINT_xsOnly As String = "xsOnly"
	Public CONST BREAKPOINT_smOnly As String = "smOnly"
	Public CONST BREAKPOINT_smAndDown As String = "smAndDown"
	Public CONST BREAKPOINT_smAndUp As String = "smAndUp"
	Public CONST BREAKPOINT_mdOnly As String = "mdOnly"
	Public CONST BREAKPOINT_mdAndDown As String = "mdAndDown"
	Public CONST BREAKPOINT_mdAndUp As String = "mdAndUp"
	Public CONST BREAKPOINT_lgOnly As String = "lgOnly"
	Public CONST BREAKPOINT_lgAndDown As String = "lgAndDown"
	Public CONST BREAKPOINT_lgAndUp As String = "lgAndUp"
	Public CONST BREAKPOINT_xlOnly As String = "xlOnly"
	Public Breakpoint As Object
	Public BreakpointName As String
	Public Config As BANanoObject
	Public UsesDrawer As Boolean
	Public UsesNavBar As Boolean
	Public UsesFooter As Boolean
	Public UsesBottomNav As Boolean
	Public UsesOverlay As Boolean
	Public UsesLoader As Boolean
	Public UsesSnackBar As Boolean
	Public UsesDialog As Boolean
	Public UsesNotification As Boolean
	'
	Public const LOCALE_Afrikaans As String = "af" 
	Public const LOCALE_Arabic As String = "ar"
	Public const LOCALE_Catalan As String = "ca"
	Public const LOCALE_Czech As String = "cs"
	Public const LOCALE_German As String = "de"
	Public const LOCALE_Greek As String = "el"
	Public const LOCALE_English	As String = "en"
	Public const LOCALE_Spanish As String = "es"
	Public const LOCALE_Estonian As String = "et"
	Public const LOCALE_Persian As String = "fa"
	Public const LOCALE_Finnish	As String = "fi"
	Public const LOCALE_French 	As String = "fr"
	Public const LOCALE_Hebrew 	As String = "he"
	Public const LOCALE_Croatian As String = "hr"
	Public const LOCALE_Hungarian As String = "hu"
	Public const LOCALE_Indonesian As String = "id"
	Public const LOCALE_Italian As String = "it"
	Public const LOCALE_Japanese As String = "ja"
	Public const LOCALE_Korean As String = "ko"
	Public const LOCALE_Lithuanian As String = "lt"
	Public const LOCALE_Latvian As String = "lv"
	Public const LOCALE_Dutch As String = "nl"
	Public const LOCALE_Norwegian As String = "no"
	Public const LOCALE_Polish As String = "pl"
	Public const LOCALE_Portuguese As String = "pt"
	Public const LOCALE_Romanian As String = "ro"
	Public const LOCALE_Russian As String = "ru"
	Public const LOCALE_Slovak As String = "sk"
	Public const LOCALE_Slovene As String = "sl"
	Public const LOCALE_Serbian As String = "srCyrl"
	Public const LOCALE_Swedish As String = "sv"
	Public const LOCALE_Thai As String = "th"
	Public const LOCALE_Turkish As String = "tr"
	Public const LOCALE_Ukrainian As String = "uk"
	Public const LOCALE_Chinese As String = "zhHans"
	Public const LOCALE_Chinese1 As String = "zhHant"
	'
	Public const VISIBILITY_PrintOnly As String = "print-only"
	Public const VISIBILITY_ScreenOnly As String = "screen-only"
	Public const VISIBILITY_XsOnly As String = "xs-only"
	Public const VISIBILITY_SmOnly As String = "sm-only"
	Public const VISIBILITY_SmAndDown As String = "sm-and-down"
	Public const VISIBILITY_SmAndUp As String = "sm-and-up"
	Public const VISIBILITY_MdOnly As String = "md-only"
	Public const VISIBILITY_MdAndDown As String = "md-and-down"
	Public const VISIBILITY_MdAndUp As String = "md-and-up"
	Public const VISIBILITY_LgOnly As String = "lg-only"
	Public const VISIBILITY_LgAndDown As String = "lg-and-down"
	Public const VISIBILITY_LgAndUp As String = "lg-and-up"
	Public const VISIBILITY_XlOnly As String = "xl-only"
	Public const VISIBILITY_ALL As String = ""
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(eventHandler As Object, appName As String)
	'initialize vue
	vue.Initialize(eventHandler)
	Modules.Initialize 
	Modules = vue.modules
	placeHolder = 0
	ShowWarnings = True
	Options.Initialize
	drawers.Initialize
	Position.initialize
	Position.Put("static","static")
	Position.Put("relative","relative")
	Position.Put("fixed","fixe")
	Position.Put("absolute","absolute")
	Position.Put("sticky", "sticky")
	Position.Put("", "none")
	RTL = False
	Dark = False
	Module = eventHandler
	lang = "en"
	Floats.Initialize
	FontSizes.Initialize
	bUseRouter = False 
	'
	RouterView.Initialize(vue, "").SetTag("router-view")
	
	'initialize the pages
	Pages.initialize
	'
	VApp.Initialize(vue, appName).SetTag("v-app")
	VContent.Initialize(vue, "main").SetTag("v-main")
	Container.Initialize(vue, "container", eventHandler).SetFluid(True)
	'
	Drawer.Initialize(vue, "drawer", eventHandler)
	Drawer.SetApp(True)
	Drawer.SetVModel("drawer")
	'
	NavBar.Initialize(vue, "appbar", eventHandler)
	NavBar.SetAppBar(True)
	NavBar.Show
	'
	Footer.Initialize(vue, "footer", eventHandler)
	Footer.SetApp(True)
	'
	BottomNav.Initialize(vue, "bottomnav", eventHandler)
	BottomNav.SetApp(True)
	BottomNav.Hide
	
	SnackBar = CreateSnackBar("snack", eventHandler).SetColor("").SetBottom(False).SetRight(False)
	'
	Notification = CreateAlert("notif", eventHandler, "")
	Notification.SetContent("Notification")
	Notification.SetBorder("left")
	Notification.SetColor("green")
	Notification.SetColoredBorder(True)
	Notification.SetDismissible(True)
	Notification.SetIcon("")
	Notification.SetType("")
	Notification.Hide
	'
	'put loader on page
	Overlay.Initialize(vue, "pageloader", eventHandler)
	'
	Animate.Initialize(vue, "appanimate", eventHandler).SetType(TRANSITION_FADE)
	Animate.SetMode("out-in").SetHideOnLeave(True)
	
	Dim vpc As VMProgressCircular
	vpc.Initialize(vue, "pageloaderprogress", eventHandler)
	vpc.SetSize(200)
	vpc.SetIndeterminate(True)
	vpc.SetColor("blue")
	Overlay.AddComponent(vpc.ToString)
	'
	Drawer.Hide
	Footer.hide
	Overlay.hide
	BottomNav.hide	
	'
	vue.SetData("confirmtitle", "Confirm")
	vue.SetData("btnconfirmcancellabel", "Cancel")
	vue.SetData("btnconfirmoklabel", "Ok")
	vue.SetData("confirmcontent","Confirm Message")
	vue.SetData("confirmkey", "confirm")
	
	Confirm = CreateDialog("confirm", Me).SetWidth("600").SetModal(True)
	Confirm.SetTitle("Title")
	Confirm.SetContent("Confirm Message")
	Confirm.AddCancel("btnConfirmCancel", "Cancel")
	Confirm.AddOK("btnConfirmOk", "Ok")
	'
	Alert = CreateDialog("alert", Me).SetWidth("600").SetModal(True)
	Alert.SetTitle("Title")
	Alert.SetContent("Alert Message")
	Alert.AddOK("btnalertOk", "Ok")
	'
	InitColors
	UsesDrawer = True
	UsesNavBar = True
	UsesFooter = True
	UsesBottomNav = True
	UsesOverlay = True
	UsesLoader = True
	UsesSnackBar = True
	UsesDialog = True
	UsesNotification = True
End Sub

'use a completelt blank template
Sub UseBlankTemplate
	UsesDrawer = False
	UsesNavBar = False
	UsesFooter = False
	UsesBottomNav = False
	UsesOverlay = False
	UsesLoader = False
	UsesSnackBar = False
	UsesDialog = False
	UsesNotification = False
End Sub

Sub H1(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("h1")
	Return elx
End Sub

Sub VFileInput(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-file-input")
	Return elx
End Sub

Sub H2(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("h2")
	Return elx
End Sub

Sub H3(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("h3")
	Return elx
End Sub

Sub H4(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("h4")
	Return elx
End Sub


Sub H5(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("h5")
	Return elx
End Sub


Sub H6(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("h6")
	Return elx
End Sub


Sub Div(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("div")
	Return elx
End Sub

Sub Span(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("span")
	Return elx
End Sub

Sub VSnackBar(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-snackbar")
	Return elx
End Sub

Sub A(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("a")
	Return elx
End Sub

Sub P(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("p")
	Return elx
End Sub

Sub VRating(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-rating")
	Return elx
End Sub

Sub VCarouselItem(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-carousel-item")
	Return elx
End Sub


Sub VCarousel(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-carousel")
	Return elx
End Sub

Sub VResponsive(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-responsive")
	Return elx
End Sub

Sub VBottomNav(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-bottom-nav")
	Return elx
End Sub

Sub VStepper(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-stepper")
	Return elx
End Sub

Sub VStepperHeader(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-stepper-header")
	Return elx
End Sub


Sub VStepperStep(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-stepper-step")
	Return elx
End Sub

Sub VTimeline(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-timeline")
	Return elx
End Sub

Sub VTimelineItem(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-timeline-item")
	Return elx
End Sub


Sub VStepperItems(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-stepper-items")
	Return elx
End Sub

Sub VStepperContent(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-stepper-content")
	Return elx
End Sub

Sub VRow(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-row")
	Return elx
End Sub

Sub VDialog(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-dialog")
	Return elx
End Sub

Sub VCardActions(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-card-actions")
	Return elx
End Sub

Sub VTooltip(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-tooltip")
	Return elx
End Sub

Sub Form(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("form")
	Return elx
End Sub

Sub VListItemGroup(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-list-item-group")
	Return elx
End Sub

Sub VListItemActionText(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-list-item-action-text")
	Return elx
End Sub


Sub VTemplate(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("template")
	Return elx
End Sub

Sub VContainer(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-container")
	Return elx
End Sub

Sub VCard(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-card")
	Return elx
End Sub

Sub VCardText(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-card-text")
	Return elx
End Sub

Sub VCardTitle(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-card-title")
	Return elx
End Sub

Sub VCol(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-col")
	Return elx
End Sub

Sub VSelect(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-select")
	Return elx
End Sub


Sub VAutoComplete(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-autocomplete")
	Return elx
End Sub


Sub VProgressLinear(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-progress-linear")
	Return elx
End Sub


Sub VToolBar(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-toolbar")
	Return elx
End Sub

Sub VSubHeader(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-subheader")
	Return elx
End Sub

Sub VCheckBox(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("<v-checkbox")
	Return elx
End Sub

Sub VListItemSubTitle(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-list-item-subtitle")
	Return elx
End Sub


Sub VImg(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-img")
	Return elx
End Sub


Sub VMenu(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-menu")
	Return elx
End Sub


Sub VToolbarItems(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-toolbar-items")
	Return elx
End Sub


Sub VRadio(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-radio")
	Return elx
End Sub

Sub VRadioGroup(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-radio-group")
	Return elx
End Sub

Sub VTextField(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-text-field")
	Return elx
End Sub

Sub VAppBar(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-app-bar").AddAttr("app", True)
	Return elx
End Sub

Sub VNavigationDrawer(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-navigation-drawer")
	Return elx
End Sub

Sub VAppBarNavIcon(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-app-bar-nav-icon")
	Return elx
End Sub

Sub VListItem(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-list-item")
	Return elx
End Sub

Sub VListItemAvatar(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-list-item-avatar")
	Return elx
End Sub

Sub VListItemContent(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-list-item-content")
	Return elx
End Sub

Sub VListItemTitle(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-list-item-title")
	Return elx
End Sub

Sub VListItemAction(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-list-item-action")
	Return elx
End Sub

Sub VSpacer(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-spacer")
	Return elx
End Sub

Sub VDivider(elid As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elid)
	elx.SetTag("v-divider")
	Return elx
End Sub

Sub VList(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-list")
	Return elx
End Sub

Sub VBtn(elID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag("v-btn")
	Return elx
End Sub

Sub VToolbarTitle(tID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, tID)
	elx.SetTag("v-toolbar-title")
	Return elx
End Sub

Sub VAvatar(tID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, tID)
	elx.SetTag("v-avatar")
	Return elx
End Sub

Sub VIcon(tID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, tID)
	elx.SetTag("v-icon")
	Return elx
End Sub

Sub Img(tID As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, tID)
	elx.SetTag("img")
	Return elx
End Sub

Sub SetUseRouter(b As Boolean) As BANanoVM
	bUseRouter = b
	Return Me
End Sub

'show loading on toolbar
Sub ShowLoading
	NavBar.SetLoading(True)
End Sub

'create a new element
Sub NewElement(elID As String, elTag As String, mprops As Map, mstyles As Map, lclasses As List, loose As List, elText As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elID)
	elx.SetTag(elTag)
	elx.BuildModel(mprops, mstyles, lclasses, loose)
	elx.SetText(elText)
	Return elx
End Sub

'create a new spacer
Sub NewSpacer(elid As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elid)
	elx.SetTag("v-spacer")
	Return elx
End Sub

'create a new divider
Sub NewDivider(elid As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, elid)
	elx.SetTag("v-divider")
	Return elx
End Sub

'hide loading on toolbar
Sub HideLoading
	NavBar.SetLoading(False)
End Sub

Sub CreateHamburger(v As BANanoVue, eid As String, eventHandler As Object) As VMElement
	Dim elx As VMElement
	elx.Initialize(v, eid)
	elx.SetTag("v-app-bar-nav-icon")
	Return elx
End Sub

Sub AddModule(tagName As String) As BANanoVM
	tagName = tagName.tolowercase
	Modules.Put(tagName, tagName)
	Return Me
End Sub

Sub ModuleExist(tagName As String) As Boolean
	tagName = tagName.tolowercase
	Dim b As Boolean = Modules.ContainsKey(tagName)
	Return b
End Sub

'remove the delimiter from stringbuilder
Sub RemDelim(sValue As String, Delim As String) As String
	Dim sw As Boolean = sValue.EndsWith(Delim)
	If sw Then
		Dim lDelim As Int = Delim.Length
		Dim nValue As String = sValue
		sw = nValue.EndsWith(Delim)
		If sw Then
			nValue = nValue.SubString2(0, nValue.Length-lDelim)
		End If
		Return nValue
	Else
		Return sValue
	End If
End Sub


Sub JoinMapKeys(m As Map, delim As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	Dim kTot As Int = m.Size - 1
	Dim kCnt As Int
	Dim strKey As String = m.getkeyat(0)
	sb.Append(strKey)
	For kCnt = 1 To kTot
		Dim strKey As String = m.getkeyat(kCnt)
		sb.Append(delim).append(strKey)
	Next
	Return sb.ToString
End Sub

'return sentences of lorem ipsum
Sub Rand_LoremIpsum(count As Int) As String
	Dim str As String = $"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."$
	Dim sb As StringBuilder
	sb.Initialize
	For i = 1 To count
		sb.Append(str).Append(CRLF)
	Next
	Return sb.tostring
End Sub

'join list to multi value string with a quote
Sub JoinItems(delimiter As String, sQuote As String, lst As List) As String
	If lst.Size = 0 Then Return ""
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	Dim xfld As String = $"${fld}"$
	xfld = sQuote & xfld & sQuote
	sb.Append(xfld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		Dim xfld As String = $"${fld}"$
		xfld = sQuote & xfld & sQuote
		sb.Append(delimiter).Append(xfld)
	Next
	Return sb.ToString
End Sub

Sub NewMap As Map
	Dim nm As Map = CreateMap()
	Return nm
End Sub

'get the record position from saved items
Sub ListOfMapsRecordPos(lst As List, k As String, v As String) As Int
	Dim lTot As Int = lst.Size - 1
	Dim lCnt As Int
	For lCnt = 0 To lTot
		Dim m As Map = lst.Get(lCnt)
		Dim sk As String = m.GetDefault(k, "")
		If sk.EqualsIgnoreCase(v) Then
			Return lCnt
		End If
	Next
	Return -1
End Sub

'nullify the file select
Sub NullifyFileSelect(refID As String)
	RefNull(refID)
End Sub

Sub RefNull(refID As String)
	refID = refID.tolowercase
	vue.refs.GetField(refID).SetField("value", Null)
End Sub

Sub FormValidate(frmID As String)
	frmID = frmID.tolowercase
	vue.refs.GetField(frmID).RunMethod("validate", Null)
End Sub

Sub FormReset(frmID As String)
	frmID = frmID.tolowercase
	vue.refs.GetField(frmID).RunMethod("reset", Null)
End Sub

Sub RefReset(frmID As String)
	frmID = frmID.tolowercase
	vue.refs.GetField(frmID).RunMethod("reset", Null)
End Sub

'click a reference
Sub RefClick(refID As String)
	refID = refID.tolowercase
	vue.refs.GetField(refID).RunMethod("click", Null)
End Sub

Sub ShowFileSelect(fsName As String)
	RefClick(fsName)
End Sub

'focus on a ref
Sub SetFocus(refID As String)
	refID = refID.tolowercase
	vue.refs.GetField(refID).RunMethod("focus", Null)
End Sub

Sub AddFileSelect(eventHandler As Object, fid As String)
	Dim fu As VMElement = CreateInvisibleFileInput(eventHandler, fid)
	Container.SetText(fu.ToString)
End Sub

'create an invisible file input
private Sub CreateInvisibleFileInput(eventHandler As Object, fid As String) As VMElement
	fid = fid.tolowercase
	Dim methodName As String = $"${fid}_change"$
	'
	Dim fu As VMElement
	fu.Initialize(vue, fid).SetTag("input")
	fu.SetAttrSingle("v-show", "false")
	fu.SetAttrSingle("ref", fid)
	fu.SetAttrSingle("type", "file")
	fu.SetAttrSingle("@change", methodName)
	'
	If SubExists(eventHandler, methodName) = False Then Return fu
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(eventHandler, methodName, Array(e))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return fu
End Sub

Sub SetOnClick(EventHandler As Object, methodName As String)
	methodName = methodName.tolowercase
	If SubExists(EventHandler, methodName) = False Then Return
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(EventHandler, methodName, Array(e))
	'add to methods
	vue.SetCallBack(methodName, cb)
End Sub


'getElementById
Sub getElementById(sid As String) As BANanoObject
	Dim el As BANanoObject = BANano.Window.GetField("document").RunMethod("getElementById", Array(sid))
	Return el
End Sub

Sub List2ArrayVariable(lst As List) As String
	If lst.Size = 0 Then
		Return $""""$
	End If
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = $""${lst.Get(0)}""$
	sb.Append(fld)
	For i = 1 To lst.size - 1
		fld = $""${lst.Get(i)}""$
		sb.Append(",").Append(fld)
	Next
	Return sb.ToString
End Sub


Sub AddHTMLElement(EventHandler As Object, parentID As String, elID As String, tag As String, props As Map, styleProps As Map, classNames As List, loose As List, Text As String)
	parentID = parentID.ToLowerCase
	elID = elID.tolowercase
	parentID = parentID.Replace("#","")
	elID = elID.Replace("#","")
	'
	Dim elIT As VMElement
	elIT.Initialize(EventHandler, elID)
	elIT.SetText(Text)
	If loose <> Null Then
		For Each k As String In loose
			elIT.SetAttrSingle(k, True)
		Next
	End If
	If props <> Null Then
		For Each k As String In props.Keys
			Dim v As String = props.Get(k)
			elIT.SetAttrSingle(k, v)
		Next
	End If
	If styleProps <> Null Then
		For Each k As String In styleProps.Keys
			Dim v As String = styleProps.get(k)
			elIT.SetStyleSingle(k, v)
		Next
	End If
	If classNames <> Null Then
		For Each strClass As String In classNames
			elIT.AddClass(strClass)
		Next
	End If
	'add to the parent element
	Dim sElement As String = elIT.tostring
	BANano.GetElement($"#${parentID}"$).Append(sElement)
End Sub

'build the map to send an email to use in callinlinephp
Sub BuildPHPEmail(sfrom As String, sto As String, scc As String, ssubject As String, smsg As String) As Map
	Dim se As Map = CreateMap("from":sfrom, "to":sto, "cc":scc, "subject":ssubject, "msg":smsg)
	Return se
End Sub

'convert delimited values and keys to a map
Sub KeyValues2Map(delim As String, keys As String, values As String) As Map
	Return vue.KeyValues2Map(delim, keys, values)
End Sub

'get a property from a list of maps
Sub GetListOfMapsProperty(lst As List, prop As String) As List
	Return vue.GetListOfMapsProperty(lst, prop)
End Sub

Sub BeautifySourceCode(slang As String, sourceCode As String) As String
	Return vue.BeautifySourceCode(slang, sourceCode)
End Sub

Sub LogState(stateName As String)
	stateName = stateName.ToLowerCase
	Dim rec As Object = vue.GetData(stateName)
	Log(rec)
End Sub

Sub NewList As List
	Dim lst As List
	lst.Initialize
	Return lst
End Sub


Sub RefreshKey(keyName As String) As BANanoVM
	keyName = keyName.ToLowerCase
	vue.SetData(keyName, DateTime.now)
	Return Me
End Sub

Sub CreatePlaceholder() As VMLabel
	placeHolder = placeHolder + 1
	Dim sKey As String = $"placeholder${placeHolder}"$
	Dim lbl As VMLabel = CreateLabel(sKey).SetText("Placeholder").SetVisible(False).SetParagraph
	Return lbl
End Sub

Sub ShowConfirm(process As String, Title As String, Message As String,ConfirmText As String, CancelText As String)
	process = process.tolowercase
	vue.SetState(CreateMap("confirmtitle":Title,"confirmcontent":Message,"confirmkey":process,"btnconfirmoklabel":ConfirmText,"btnconfirmcancellabel":CancelText))
	Confirm.Show
End Sub

Sub ShowConfirm1(eventHandler As Object, process As String, Title As String, Message As String,ConfirmText As String, CancelText As String)
	process = process.tolowercase
	vue.SetState(CreateMap("confirmtitle":Title,"confirmcontent":Message,"confirmkey":process,"btnconfirmoklabel":ConfirmText,"btnconfirmcancellabel":CancelText))
	SetOnClick(eventHandler, "btnConfirmOk_click")
	SetOnClick(eventHandler, "btnConfirmCancel_click")
	Confirm.Show
End Sub

Sub ConfirmHide
	Confirm.hide
End Sub

Sub ShowAlert(process As String, Title As String, Message As String, ConfirmText As String)
	process = process.tolowercase
	vue.SetState(CreateMap("alertkey":process, "alerttitle":Title,"alertcontent":Message,"btnalertoklabel":ConfirmText))
	Alert.Show
End Sub

Sub ShowNotification(Message As String, Color As String, Dismissable As Boolean)
	Notification.SetContent(Message)
	Notification.SetColor(Color)
	Notification.SetDismissible(Dismissable)
	Notification.SetIcon("")
	Notification.Show
End Sub

Sub HideNotification
	Notification.hide
End Sub

Sub GetConfirm As String
	Dim sproc As String = vue.GetData("confirmkey")
	Return sproc
End Sub

Sub btnalertOk_click(e As BANanoEvent)
	Alert.hide
	Dim e As BANanoEvent
	BANano.CallSub(Module, "alert_ok", Array(e))   'ignore
End Sub

Sub btnConfirmCancel_click(e As BANanoEvent)
	Confirm.hide
	Dim e As BANanoEvent
	BANano.CallSub(Module, "confirm_cancel", Array(e))   'ignore
End Sub

Sub btnConfirmOk_click(e As BANanoEvent)
	Confirm.hide
	Dim e As BANanoEvent
	BANano.CallSub(Module, "confirm_ok", Array(e))  'ignore
End Sub

'convert json to a list
Sub Json2List(strValue As String) As List
	Return vue.Json2List(strValue)
End Sub

Sub CreateExpandTransition(eID As String, eventHandler As Object) As VMExpandTransition
	Dim el As VMExpandTransition
	el.Initialize(vue, eID, eventHandler)
	Return el
End Sub

Sub CreateAlert(eID As String, eventHandler As Object, typeOf As String) As VMAlert
	Dim el As VMAlert
	el.Initialize(vue, eID, eventHandler)
	If typeOf <> "" Then el.SetType(typeOf)
	Return el
End Sub

Sub CreateParallax(eID As String, eventHandler As Object) As VMParallax
	Dim el As VMParallax
	el.Initialize(vue, eID, eventHandler)
	Return el
End Sub

Sub NewParallax(eventHandler As Object,bStatic As Boolean, sname As String, sheight As String, src As String,salt As String) As VMParallax
	Dim el As VMParallax = CreateParallax(sname, eventHandler)
	el.SetStatic(bStatic)
	el.SetHeight(sheight)
	el.SetSrc(src)
	el.SetAlt(salt)
	Return el
End Sub

Sub CreateAutoComplete(eID As String, eventHandler As Object) As VMSelect
	Dim el As VMSelect
	el.Initialize(vue, eID, eventHandler)
	el.SetAutoComplete
	Return el
End Sub

Sub CreateComboBox(eID As String, eventHandler As Object) As VMSelect
	Dim el As VMSelect
	el.Initialize(vue, eID, eventHandler)
	el.SetComboBox
	Return el
End Sub

Sub CreateTimePicker(eID As String, eventHandler As Object) As VMDateTimePicker
	Dim el As VMDateTimePicker
	el.Initialize(vue, eID, eventHandler)
	el.SetTimePicker
	Return el
End Sub

Sub CreateDatePicker(eID As String, eventHandler As Object) As VMDateTimePicker
	Dim el As VMDateTimePicker
	el.Initialize(vue, eID, eventHandler)
	Return el
End Sub

Sub CreateTextArea(eID As String, eventHandler As Object) As VMTextField
	Dim el As VMTextField
	el.Initialize(vue, eID, eventHandler)
	el.SetTextArea
	Return el
End Sub


Sub CreateProperty(eID As String, eventHandler As Object) As VMProperty
	Dim el As VMProperty
	el.Initialize(vue, eID, eventHandler)
	Return el
End Sub

Sub CreateDiv(sid As String) As VMElement
	Return vue.CreateDiv(sid)
End Sub

Sub CreateExpansionPanel(eID As String, parentid As String, eventHandler As Object) As VMExpansionPanel
	Dim el As VMExpansionPanel
	el.Initialize(vue, parentid, eID, eventHandler)
	Return el
End Sub

Sub CreateColorPicker(eID As String, eventHandler As Object) As VMColorPicker
	Dim el As VMColorPicker
	el.Initialize(vue, eID, eventHandler)
	Return el
End Sub


Sub CreateRating(eID As String, eventHandler As Object) As VMRating
	Dim el As VMRating
	el.Initialize(vue, eID, eventHandler)
	Return el
End Sub


Sub CreateSkeletonLoader(eID As String, eventHandler As Object) As VMSkeletonLoader
	Dim el As VMSkeletonLoader
	el.Initialize(vue, eID, eventHandler)
	Return el
End Sub


Sub CreateBanner(eID As String, eventHandler As Object) As VMBanner
	Dim el As VMBanner
	el.Initialize(vue, eID, eventHandler)
	Return el
End Sub

Sub CreateBottomNavigation(eID As String, eventHandler As Object) As VMBottomNavigation
	Dim el As VMBottomNavigation
	el.Initialize(vue, eID, eventHandler)
	Return el
End Sub


Sub CreateDataTable(cID As String, PrimaryKey As String, eventHandler As Object) As VMDataTable
	Dim el As VMDataTable
	el.Initialize(vue, cID,PrimaryKey,  eventHandler)
	Return el
End Sub

Sub CreatePagination(cID As String, eventHandler As Object) As VMPagination
	Dim el As VMPagination
	el.Initialize(vue, cID, eventHandler)
	Return el
End Sub


Sub CreateDataTable1(el As VMDataTable, cID As String, PrimaryKey As String, eventHandler As Object)
	el.Initialize(vue, cID,PrimaryKey,  eventHandler)
End Sub

Sub CreateTreeView(cID As String, eventHandler As Object) As VMTreeView
	Dim el As VMTreeView
	el.Initialize(vue, cID, eventHandler)
	Return el
End Sub

Sub CreateCard(cID As String, eventHandler As Object) As VMCard
	Dim el As VMCard
	el.Initialize(vue, cID, eventHandler)
	Return el
End Sub

Sub CreateCardText(cID As String, eventHandler As Object) As VMCardText
	Dim el As VMCardText
	el.Initialize(vue, cID, eventHandler)
	Return el
End Sub

Sub HideSpeedDial(elID As String) As BANanoVM
	SetStateSingle(elID, False)
	Return Me
End Sub

Sub ShowSpeedDial(elID As String) As BANanoVM
	SetStateSingle(elID, True)
	Return Me
End Sub

Sub CreateProgressCircular(sid As String, eventHandler As Object) As VMProgressCircular
	Dim el As VMProgressCircular
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub CreateProgressLinear(sid As String, eventHandler As Object) As VMProgressLinear
	Dim el As VMProgressLinear
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub ShowSnackBarError(Message As String)
	Message = CStr(Message)
	Message = Message.Replace("null", "")
	Message = Message.Trim
	If Message = "" Then Return
	SetStateSingle("snackmessage", Message)
	SnackBar.SetTop(True)
	SnackBar.SetColor("red")
	SnackBar.Button.Hide
	SnackBar.show
End Sub

Sub ShowSnackBarSuccess(Message As String)
	Message = CStr(Message)
	Message = Message.Replace("null", "")
	Message = Message.Trim
	If Message = "" Then Return
	SetStateSingle("snackmessage", Message)
	SnackBar.SetColor("green")
	SnackBar.SetTop(True)
	SnackBar.Button.Hide
	SnackBar.show
End Sub

Sub ShowSnackBar(Message As String)
	Message = CStr(Message)
	Message = Message.Replace("null", "")
	Message = Message.Trim
	If Message = "" Then Return
	SetStateSingle("snackmessage", Message)
	SnackBar.Button.Hide
	SnackBar.show
End Sub

Sub ShowSnackBarButton(Message As String, buttonText As String, OnClick As String)
	SetStateSingle("snackmessage", Message)
	SnackBar.Button.Show
	SnackBar.SetOnClick(OnClick)
	SnackBar.Button.SetLabel(buttonText)
	SnackBar.show
End Sub

'set the progress value
Sub SetProgressValue(elID As String, elValue As String)
	elID = elID.tolowercase
	Dim elKey As String = $"${elID}value"$
	vue.SetData(elKey, elValue)
End Sub

Sub GetProgressValue(elID As String) As String
	elID = elID.tolowercase
	Dim elKey As String = $"${elID}value"$
	Dim svalue As String = vue.getData(elKey)
	Return svalue
End Sub


Sub Increment(elID As String, valueOf As Int) As BANanoVM
	elID = elID.tolowercase
	Dim oldv As Int = vue.GetState(elID,0)
	oldv = BANano.parseInt(oldv) + valueOf
	vue.SetStateSingle(elID, oldv)
	Return Me
End Sub

Sub Decrement(elID As String, valueOf As Int) As BANanoVM
	elID = elID.tolowercase
	Dim oldv As Int = vue.GetState(elID,0)
	oldv = BANano.parseInt(oldv) - valueOf
	vue.SetStateSingle(elID, oldv)
	Return Me
End Sub

'add a theme to use in the app
Sub AddTheme(themeName As String, ForeColor As String, ForeColorIntensity As String, BackColor As String, BackColorIntensity As String)
	vue.AddTheme(themeName, ForeColor, ForeColorIntensity, BackColor, BackColorIntensity)
End Sub

Sub MapKeys2List(m As Map) As List
	Return vue.MapKeys2List(m)
End Sub

Sub SaveText2File(sContent As String, sfileName As String)
	vue.SaveText2File(sContent, sfileName)
End Sub

Sub ProperCase(myStr As String) As String
	Return vue.ProperCase(myStr)
End Sub

Sub BeautifyName(namx As String) As String
	Return vue.BeautifyName(namx)
End Sub

Sub Capitalize(t As String) As String
	Return vue.propercase(t)
End Sub

Sub ShowMulti(lst As List)
	For Each item As String In lst
		Show(item)
	Next
End Sub

Sub BeautifyRest(idName As String) As String
	Return vue.BeautifyRest(idName)
End Sub

Sub HideMulti(lst As List)
	For Each item As String In lst
		Hide(item)
	Next
End Sub

'create a b4j list from delimited string
Sub CreateList1(Delimiter As String, Values As String) As List
	Return vue.CreateList(Delimiter, Values)
End Sub


Sub CreateList(sid As String, eventHandler As Object) As VMList
	Dim el As VMList
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

'set booleans from checked and unchecked values
Sub SetBooleans(rec As Map, xFields As List, checkedValue As String, UnCheckedValue As String) As Map
	Return vue.SetBooleans(rec, xFields, checkedValue, UnCheckedValue)
End Sub

Sub SetUncheckedValue(rec As Map, xfields As List, checkedValue As String, UncheckedValue As String) As Map
	Return vue.SetUncheckedValue(rec, xfields, checkedValue, UncheckedValue)
End Sub

Public Sub YearNow() As String
	Return vue.YearNow
End Sub

Public Sub MonthNow() As String
	Return vue.monthnow
End Sub

'join list to mv string
Sub Join(delimiter As String, lst As List) As String
	Return vue.Join(delimiter, lst)
End Sub


Sub JoinLists(lst As List) As List
	Return vue.JoinLists(lst)
End Sub

'fix the records to match their data types
Sub FixRecordsUseDesign(recs As List, design As VMContainer)
	vue.FixRecords(recs, design.Strings, design.Integers, design.Booleans, design.Dates, design.Doubles)
End Sub

'copy a state from one to another
Sub State2Another(source As String, target As String, defaultValue As Object)
	vue.State2Another(source, target, defaultValue)
End Sub

'update buffer of progress bar
Sub SetProgressBuffer(pID As String, bVal As Int) As BANanoVM
	pID = pID.ToLowerCase
	SetStateSingle($"${pID}buffer"$, bVal)
	Return Me
End Sub

'add a dialog to the page
Sub AddDialog(diag As VMDialog)
	diag.Pop(Container.Container)
End Sub

Sub AddSpeedDial(sd As VMSpeedDial)
	sd.Pop(Container.Container)
End Sub

'add a snack bar
Sub AddSnackBar(cSnackBar As VMSnackBar)
	cSnackBar.Pop(Container.Container)
End Sub

'show any dialog, alert, prompt
Sub ShowDialog(dID As String)
	dID = dID.tolowercase
	SetStateTrue(dID)
End Sub

Sub ShowBottomSheet(dID As String)
	dID = dID.tolowercase
	vue.SetData($"${dID}show"$, True)
End Sub

Sub HideBottomSheet(dID As String)
	dID = dID.tolowercase
	vue.SetData($"${dID}show"$, False)
End Sub

Sub ShowOverlay(dID As String)
	dID = dID.tolowercase
	vue.SetData($"${dID}show"$, True)
End Sub

Sub HideOverlay(dID As String)
	dID = dID.tolowercase
	vue.SetData($"${dID}show"$, False)
End Sub

Sub HideDrawer(dID As String)
	dID = dID.tolowercase
	SetStateFalse(dID)
End Sub

'show a specific drawer and hide all others
Sub ShowDrawer(dID As String)
	dID = dID.tolowercase
	HideOtherDrawers(dID)
	SetStateTrue(dID)
End Sub

'show a specific drawer and hide all others
Sub HideDrawers
	Dim nm As Map = CreateMap()
	For Each k As String In drawers
		nm.Put(k, False)
	Next
	SetState(nm)
End Sub

Sub HideOtherDrawers(sexcept As String)
	Dim nm As Map = CreateMap()
	For Each k As String In drawers
		If k.EqualsIgnoreCase(sexcept) = False Then nm.Put(k, False)
	Next
	SetState(nm)
End Sub


Sub HideDialog(dID As String)
	dID = dID.tolowercase
	SetStateFalse(dID)
End Sub

Sub SetCloak(b As Boolean) As BANanoVM
	vue.SetCloak(b)
	Return Me
End Sub

Sub SetRequired(elID As String, b As Boolean)
	elID = elID.tolowercase
	vue.SetStateSingle($"${elID}required"$, b)
End Sub

Sub Enable(elID As String)
	elID = elID.tolowercase
	vue.SetStateSingle($"${elID}disabled"$, False)
End Sub

Sub Disable(elID As String)
	elID = elID.tolowercase
	vue.SetStateSingle($"${elID}disabled"$, True)
End Sub

Sub SetEnabled(elID As String, b As Boolean)
	elID = elID.tolowercase
	vue.SetStateSingle($"${elID}disabled"$, b)
End Sub

Sub Hide(elID As String)
	elID = elID.tolowercase
	vue.SetStateSingle($"${elID}show"$, False)
End Sub

Sub Show(elID As String)
	vue.SetStateSingle($"${elID}show"$, True)
End Sub


Sub DateAdd(mDate As String, HowManyDays As Int) As String
	Return vue.DateAdd(mDate, HowManyDays)
End Sub

Sub CreateContainer(sid As String, eventHandler As Object) As VMContainer
	Dim el As VMContainer
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub InStr(searchit As String, searchfor As String) As Int
	Return vue.InStr(searchit, searchfor)
End Sub

Public Sub GetAlphabets(value As String) As String
	Return vue.GetAlphabets(value)
End Sub

Sub JSONSetProperty(sjson As String, updates As Map) As String
	Return vue.JSONSetProperty(sjson, updates)
End Sub

Sub EQOperators(sm As Map) As List
	Return vue.EQOperators(sm)
End Sub

'create a map subset from list of keys
Sub ExtractMap(source As Map, keys As List) As Map
	Return vue.ExtractMap(source, keys)
End Sub

'set dynamic style
Sub SetStyle(className As String, prop As String, vals As String) As BANanoVM
	vue.SetStyle(className, prop, vals)
	Return Me
End Sub

'return a pretty json from something
Sub JSONPretty(m As Object) As String
	Return vue.JSONPretty(m)
End Sub

Sub CreateImage(sImg As String, eventHandler As Object) As VMImage
	Dim el As VMImage
	el.Initialize(vue, sImg, eventHandler)
	el.Image.typeof = "image"
	Return el
End Sub

Sub MvField(sValue As String, iPosition As Int, Delimiter As String) As String
	Return vue.MvField(sValue, iPosition, Delimiter)
End Sub

'convert object to string
Sub CStr(o As Object) As String
	Return vue.CStr(o)
End Sub


'pad things to the right
Sub PadRight(Value As String, MaxLen As Int, PadChar As String) As String
	Return vue.PadRight(Value, MaxLen, PadChar)
End Sub

'length
private Sub Len(Text As String) As Int
	Return Text.Length
End Sub

Sub StrParse(Delim As String, InputString As String) As List
	Return vue.StrParse(Delim, InputString)
End Sub

private Sub InitColors
	Dim e As Int
	Elevation.initialize
	For e = 0 To 24
		Elevation.Put(e, e)
	Next
	Elevation.Put("", "None")
	'
	Dim tran As List
	tran.Initialize
	'
	tran.AddAll(Array("slide-x-transition", "slide-x-reverse-transition", "slide-y-transition", "slide-y-reverse-transition", "scroll-x-transition"))
	tran.AddAll(Array("scroll-x-reverse-transition", "scroll-y-transition", "scroll-y-reverse-transition", "scale-transition",  "fade-transition", "fab-transition"))
	'
	Transition.Initialize
	Transitions.Initialize
	For Each sl As String In tran
		Transition.Put(sl, sl)
		Transitions.Put($"v-${sl}"$, sl)
	Next
	Transition.Put("", "None")
	
	DisplayOptions.Initialize
	DisplayOptions.Put("", "None")
	DisplayOptions.Put("display-4", "Display 4")
	DisplayOptions.Put("display-3", "Display 3")
	DisplayOptions.Put("display-2", "Display 2")
	DisplayOptions.Put("display-1", "Display 1")
	DisplayOptions.Put("headline", "Headline")
	DisplayOptions.Put("title", "Title")
	DisplayOptions.Put("subtitle-1", "Sub Title 1")
	DisplayOptions.Put("subtitle-2", "Sub Title 2")
	DisplayOptions.Put("body-1", "Body 2")
	DisplayOptions.Put("body-2", "Body 1")
	DisplayOptions.Put("caption", "Caption")
	DisplayOptions.Put("overline", "Overline")
	'
	TextAlignmentOptions.Initialize
	TextAlignmentOptions.put("", "None")
	TextAlignmentOptions.put("text-left", "Left")
	TextAlignmentOptions.put("text-center", "Center")
	TextAlignmentOptions.put("text-right", "Right")
	TextAlignmentOptions.put("text-justify", "Justify")
	'
	FontWeightOptions.Initialize
	FontWeightOptions.Put("", "None")
	FontWeightOptions.Put("font-weight-black", "Black")
	FontWeightOptions.Put("font-weight-bold","Bold")
	FontWeightOptions.Put("font-weight-medium", "Medium")
	FontWeightOptions.Put("font-weight-regular", "Regular")
	FontWeightOptions.Put("font-weight-light", "Light")
	FontWeightOptions.Put("font-weight-thin", "Thin")
	'
	IntensityOptions.Initialize
	IntensityOptions.put("","Normal")
	IntensityOptions.put("lighten-1","Lighten 1")
	IntensityOptions.put("lighten-2","Lighten 2")
	IntensityOptions.put("lighten-3","Lighten 3")
	IntensityOptions.put("lighten-4","Lighten 4")
	IntensityOptions.put("lighten-5","Lighten 5")
	IntensityOptions.put("darken-1","Darken 1")
	IntensityOptions.put("darken-2","Darken 2")
	IntensityOptions.put("darken-3","Darken 3")
	IntensityOptions.put("darken-4","Darken 4")
	IntensityOptions.put("accent-1","Accent 1")
	IntensityOptions.put("accent-2","Accent 2")
	IntensityOptions.put("accent-3","Accent 3")
	IntensityOptions.put("accent-4","Accent 4")
	'
	ColorOptions.Initialize
	ColorOptions.Put("amber","Amber")
	ColorOptions.Put("black","Black")
	ColorOptions.Put("blue","Blue")
	ColorOptions.Put("blue-grey","Blue Grey")
	ColorOptions.Put("brown","Brown")
	ColorOptions.Put("cyan","Cyan")
	ColorOptions.Put("deep-orange","Deep Orange")
	ColorOptions.Put("deep-purple","Deep Purple")
	ColorOptions.Put("green","Green")
	ColorOptions.Put("grey","Grey")
	ColorOptions.Put("indigo","Indigo")
	ColorOptions.Put("light-blue","Light Blue")
	ColorOptions.Put("light-green", "Light Green")
	ColorOptions.Put("lime", "Lime")
	ColorOptions.Put("orange", "Orange")
	ColorOptions.Put("pink", "Pink")
	ColorOptions.Put("purple", "Purple")
	ColorOptions.Put("red", "Red")
	ColorOptions.Put("teal", "Teal")
	ColorOptions.Put("transparent", "Transparent")
	ColorOptions.Put("white", "White")
	ColorOptions.Put("yellow", "Yellow")
	ColorOptions.Put("", "None")
	ColorOptions.Put("primary","Primary")
	ColorOptions.Put("secondary","Secondary")
	ColorOptions.Put("accent","Accent")
	ColorOptions.Put("error","Error")
	ColorOptions.Put("info","Info")
	ColorOptions.Put("success","Success")
	ColorOptions.Put("warning","Warning")
	'
	BorderOptions.Initialize
	BorderOptions.Put("dashed", "Dashed")
	BorderOptions.Put("dotted", "Dotted")
	BorderOptions.Put("double", "Double")
	BorderOptions.Put("groove", "Groove")
	BorderOptions.Put("hidden", "Hidden")
	BorderOptions.Put("inset", "Inset")
	BorderOptions.Put("none", "None")
	BorderOptions.Put("outset", "Outset")
	BorderOptions.Put("ridge", "Ridge")
	BorderOptions.Put("solid", "Solid")
	'
	TargetOptions.Put("","None")
	TargetOptions.Put("_blank","Blank")
	TargetOptions.Put("_self","Self")
	TargetOptions.Put("_parent","Parent")
	TargetOptions.Put("_top","Top")
	'
	ColumnTypes.Initialize
	ColumnTypes.put("date","Date")
	ColumnTypes.put("text", "Text")
	ColumnTypes.put("icon", "Icon")
	ColumnTypes.put("checkbox", "Check Box")
	ColumnTypes.put("", "None")
	ColumnTypes.put("time","Time")
	ColumnTypes.put("datetime","Date Time")
	ColumnTypes.put("image","Image")
	ColumnTypes.Put("money","Money")
	ColumnTypes.put("filesize", "File Size")
	ColumnTypes.put("chip","Chip")
	ColumnTypes.put("edit","Edit")
	ColumnTypes.put("delete","Delete")
	ColumnTypes.put("action","Action")
	ColumnTypes.put("save","Save")
	ColumnTypes.put("cancel","Cancel")
	ColumnTypes.Put("switch", "Switch")
	ColumnTypes.put("avatarimg", "Avatar")
	ColumnTypes.Put("rating", "Rating")
	ColumnTypes.Put("progresscircular", "ProgressCircular")
	ColumnTypes.Put("progresslinear", "ProgressLinear")
	
	'
	ColumnAlign.Initialize
	ColumnAlign.Put("start", "Start")
	ColumnAlign.Put("center", "Center")
	ColumnAlign.Put("end", "End")
	'
	DataTypes.Initialize
	DataTypes.Put("BOOL", "Boolean")
	DataTypes.Put("INT", "Integer")
	DataTypes.Put("TEXT", "Text")
	DataTypes.Put("FLOAT", "Double")
	DataTypes.Put("BLOB", "Blob")
	DataTypes.Put("DATE", "Date")
	DataTypes.Put("None", "None")
	'
	ControlTypes.Initialize
	ControlTypes.put("text", "Text")
	ControlTypes.put("textarea", "Text Area")
	ControlTypes.put("checkbox", "Check Box")
	ControlTypes.put("date", "Date")
	ControlTypes.put("file", "File")
	ControlTypes.put("radio", "Radio")
	ControlTypes.put("select", "Select")
	ControlTypes.put("slider", "Slider")
	ControlTypes.put("switch", "Switch")
	ControlTypes.put("label", "Label")
	ControlTypes.put("email", "Email")
	ControlTypes.put("rating", "Rating")
	ControlTypes.put("password", "Password")
	ControlTypes.put("tel", "Telephone")
	ControlTypes.put("time", "Time")
	ControlTypes.put("combo", "Combo")
	ControlTypes.put("auto", "Auto Complete")
	ControlTypes.put("profile", "Profile")
	ControlTypes.put("image", "Image")
	ControlTypes.put("button", "Button")
	ControlTypes.put("icon", "Icon")
	ControlTypes.put("parallax", "Parallax")
	ControlTypes.put("container", "Container")
	ControlTypes.put("menu", "Menu")
	ControlTypes.put("carousel", "Carousel")
	ControlTypes.put("speeddial", "Speed Dial")
	ControlTypes.Put("quill", "Quill Editor")
	ControlTypes.Put("None", "None")
	ControlTypes.Put("rangeslider", "Range Slider")
	ControlTypes.Put("infobox", "Info Box")
	ControlTypes.Put("fileselect", "File Select")
	ControlTypes.Put("sparkline", "Sparkline")
	ControlTypes.Put("number", "Number")
	'
	Direction.Initialize
	Direction.Put("top", "Top")
	Direction.Put("bottom", "Bottom")
	Direction.Put("left", "Left")
	Direction.Put("right", "Right")
	'
	Dim fList As List
	fList.Initialize
	fList.AddAll(Array("float-left", "float-right", "float-none", "float-sm-left", "float-sm-right", "float-sm-none", _
	"float-md-left", "float-md-right", "float-md-none", "float-lg-left", "float-lg-right", "float-lg-none", "float-xl-left", _
	"float-xl-right", "float-xl-none"))
	Floats = vue.List2MapSimple(fList, True)
	Floats.Put("","None")
	'
	Dim xList As List = vue.NewList
	xList.AddAll(Array("medium","xx-small","x-small","small","large","x-large","xx-large","smaller","larger","initial","inherit"))
	
End Sub


Sub MergeMaps(oldm As Map, newm As Map) As Map
	Return vue.MergeMaps(oldm, newm)
End Sub

Sub AddComponent(comp As VMComponent)
	vue.AddComponent(comp)
End Sub

'add an element to the page content
Sub AddElement(elm As VMElement)
	elm.Pop(Container.Container)
End Sub

Sub AddHTML(htmlContent As String)
	Container.SetText(htmlContent)
End Sub

Sub CreateCustomComponent(id As String, tag As String) As VMElement
	Dim el As VMElement
	el.Initialize(vue, id).SetTag(tag)
	
	Return el
End Sub

'create an element with a 'component' tag
Sub CreateComponent(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(vue, id).SetTag("component")	
	Return el
End Sub

'create an element with a 'component' tag
Sub CreateOwnComponent(id As String, compName As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(vue, id).SetTag(compName)
	Return elx
End Sub

Sub AddRoute(comp As VMComponent) As BANanoVM
	vue.AddRoute(comp)
	SetUseRouter(True)
	Return Me
End Sub

Sub SetBadgeAvatar(elID As String, b As Boolean) As BANanoVM
	elID = elID.tolowercase
	Dim badValue As String = $"${elID}badgeavatar"$
	vue.SetStateSingle(badValue, b)
	Return Me
End Sub

Sub SetBadgeOverlap(elID As String, b As Boolean) As BANanoVM
	elID = elID.tolowercase
	Dim badValue As String = $"${elID}badgeoverlap"$
	vue.SetStateSingle(badValue, b)
	Return Me
End Sub


Sub SetBadgeBordered(elID As String, bordered As Boolean) As BANanoVM
	elID = elID.tolowercase
	Dim badValue As String = $"${elID}badgebordered"$
	vue.SetStateSingle(badValue, bordered)
	Return Me
End Sub

Sub SetBadgeColor(elID As String, color As String, intensity As String) As BANanoVM
	elID = elID.tolowercase
	Dim scolor As String = $"${color} ${intensity}"$
	Dim badValue As String = $"${elID}badgecolor"$
	vue.SetStateSingle(badValue, scolor)
	Return Me
End Sub

Sub SetBadgeIcon(elID As String, sicon As String) As BANanoVM
	elID = elID.tolowercase
	Dim badValue As String = $"${elID}badgeicon"$
	vue.SetStateSingle(badValue, sicon)
	Return Me
End Sub

Sub SetBadgeContent(elID As String, counted As String) As BANanoVM
	elID = elID.tolowercase
	counted = BANano.parseInt(counted)
	Dim badValue As String = $"${elID}badgecontent"$
	vue.SetStateSingle(badValue, counted)
	Return Me
End Sub

Sub SetBadgeOffsetX(elID As String, counted As String) As BANanoVM
	elID = elID.tolowercase
	counted = BANano.parseInt(counted)
	Dim badValue As String = $"${elID}badgeoffsetx"$
	vue.SetStateSingle(badValue, counted)
	Return Me
End Sub

Sub SetBadgeOffsetY(elID As String, counted As String) As BANanoVM
	elID = elID.tolowercase
	counted = BANano.parseInt(counted)
	Dim badValue As String = $"${elID}badgeoffsety"$
	vue.SetStateSingle(badValue, counted)
	Return Me
End Sub


Sub IncrementBadge(elID As String, counted As Int) As BANanoVM
	elID = elID.tolowercase
	Dim badValue As String = $"${elID}badgecontent"$
	Dim lastValue As String = vue.GetState(badValue, "0")
	Dim intLast As Int = BANano.parseInt(lastValue)
	intLast = intLast + counted
	vue.SetStateSingle(badValue, intLast)
	Return Me
End Sub

Sub DecrementBadge(elID As String, counted As Int) As BANanoVM
	elID = elID.tolowercase
	Dim badValue As String = $"${elID}badgecontent"$
	Dim lastValue As String = vue.GetState(badValue, "0")
	Dim intLast As Int = BANano.parseInt(lastValue)
	intLast = intLast - counted
	vue.SetStateSingle(badValue, intLast)
	Return Me
End Sub

Sub GetFileListFromTarget(e As BANanoEvent) As List
	Dim files As List = e.OtherField("target").GetField("files").Result
	Return files
End Sub


'hack
Sub GetChipIDFromEvent(e As BANanoEvent) As String
	Try
		Dim spath As List = e.OtherField("path").Result
		Dim sitem As Map = spath.get(5)
		Dim sid As String = sitem.get("id")
		Return sid
	Catch
		Log(LastException)
		Return ""
	End Try
End Sub

Sub CreateAvatar(sid As String, moduleObj As Object) As VMAvatar
	Dim el As VMAvatar
	el.Initialize(vue,sid, moduleObj)
	Return el
End Sub

Sub CreateCarousel(sid As String, moduleObj As Object) As VMCarousel
	Dim el As VMCarousel
	el.Initialize(vue,sid, moduleObj)
	Return el
End Sub

Sub CreateBadge(sid As String, moduleObj As Object) As VMBadge
	Dim el As VMBadge
	el.Initialize(vue, sid, moduleObj)
	Return el
End Sub

'add break
Sub BR As String
	Return "<br>"
End Sub

'add hr
Sub HR As String
	Return "<hr>"
End Sub

Sub CreateRouterLink(rID As String, rTo As String, Text As String) As VMElement
	Dim el As VMElement
	el.Initialize(vue,rID).SetTag("router-link").SetTo(rTo).SetText(Text)
	Return el
End Sub

Sub CreateRouterView(rID As String) As VMElement
	Dim el As VMElement
	el.Initialize(vue,rID).SetTag("router-view")
	
	Return el
End Sub

Sub CreateKeepAlive(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(vue,sid).SetTag("keep-alive")
	
	Return el
End Sub

Sub CreateTag(id As String, tag As String) As VMElement
	Dim el As VMElement
	el.Initialize(vue,id).SetTag(tag)
	
	Return el
End Sub

Sub CreateLabel(id As String) As VMLabel
	Dim el As VMLabel
	el.Initialize(vue, id)
	Return el
End Sub


'return if state exists
Sub HasState(k As String) As Boolean
	Return vue.HasState(k)
End Sub


Sub GetStates(lst As List) As Map
	Return vue.GetStates(lst)
End Sub

'set the state
Sub SetState(m As Map) As BANanoVM
	vue.SetState(m)
	Return Me
End Sub

'convert a list to key value pairs map records
Sub List2Options(lst As List, keyName As String, valueName As String) As Map
	Return vue.List2Options(lst, keyName, valueName)
End Sub

'convert a list to key value pairs map records
Sub List2Map(lst As List, keyName As String, valueName As String) As Map
	Return vue.List2Options(lst, keyName, valueName)
End Sub

'convert map to a list of maps with key and values
Sub Map2Options(m As Map, keyName As String, valueName As String) As List
	Return vue.Map2Options(m, keyName, valueName)
End Sub

'change state of items to be false
Sub HideItems(items As List)
	For Each item As String In items
		HideItem(item)
	Next
End Sub

Sub ShowItem(elID As String)
	vue.ShowItem(elID)
End Sub

Sub HideItem(elID As String)
	vue.HideItem(elID)
End Sub

'change state of items to be true
Sub ShowItems(items As List)
	For Each item As String In items
		ShowItem(item)
	Next
End Sub

Sub SetStateSingle(k As String, v As Object) As BANanoVM
	vue.SetStateSingle(k, v)
	Return Me
End Sub

Sub SetStateListValues(mapValues As List) As BANanoVM
	vue.SetStateListValues(mapValues)
	Return Me
End Sub

'set state list
Sub SetStateList(mapKey As String, mapValues As List) As BANanoVM
	vue.SetStateList(mapKey, mapValues)
	Return Me
End Sub

'set state object
Sub SetStateMap(mapKey As String, mapValues As Map) As BANanoVM
	vue.SetStateMap(mapKey, mapValues)
	Return Me
End Sub

'set watches 
Sub SetWatch(k As String, bImmediate As Boolean, bDeep As Boolean, moduleObj As Object, methodName As String) As BANanoVM
	vue.SetWatch(k, bImmediate, bDeep, moduleObj, methodName)
	Return Me
End Sub

Sub CreateTemplate(sid As String, eventHandler As Object) As VMTemplate
	Dim el As VMTemplate
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub SetData(prop As String, valuex As Object) As BANanoVM
	vue.SetStateSingle(prop, valuex)
	Return Me
End Sub

Sub GetData(prop As String) As Object
	Dim obj As Object = vue.GetState(prop, Null)
	Return obj
End Sub

'set direct method
Sub SetMethod(moduleObj As Object, methodName As String) As BANanoVM
	vue.SetMethod(moduleObj, methodName)
	Return Me
End Sub

'set created
Sub SetCreated(moduleObj As Object, methodName As String) As BANanoVM
	vue.SetCreated(moduleObj, methodName)
	Return Me
End Sub

Sub RunMethod(methodName As String, params As Object) As BANanoObject
	Return vue.RunMethod(methodName, params)
End Sub


Sub CallMethod(methodName As String)
	vue.CallMethod(methodName)
End Sub

Sub CallComputed(methodName As String) As Object
	Return vue.CallComputed(methodName)
End Sub

Sub GetIDFromEvent(e As BANanoEvent) As String
	Return vue.GetIDFromEvent(e)
End Sub

Sub GetKeyFromEvent(e As BANanoEvent) As String
	Return vue.GetKeyFromEvent(e)
End Sub


Sub GetEventTargetProperty(e As BANanoEvent, prop As String) As String
	Return vue.GetEventTargetProperty(e, prop)
End Sub

private Sub SetFontFamily(ff As Object)
	vue.SetFontFamily(ff)
End Sub

Sub StateExists(stateName As String) As Boolean
	Return vue.StateExists(stateName)
End Sub

Sub ToggleState(stateName As String) As BANanoVM
	vue.ToggleState(stateName)
	Return Me
End Sub

Sub SetStateTrue(k As String) As BANanoVM
	vue.SetStateTrue(k)
	Return Me
End Sub

Sub AuditTrail(oldM As Map, newM As Map) As Map
	Return vue.AuditTrail(oldM, newM)
End Sub

Sub SetStateFalse(k As String) As BANanoVM
	vue.SetStateFalse(k)
	Return Me
End Sub

Sub SetStateIncrement(k As String) As BANanoVM
	vue.SetStateIncrement(k)
	Return Me
End Sub

Sub SetStateDecrement(k As String) As BANanoVM
	vue.SetStateDecrement(k)
	Return Me
End Sub

Sub GetState(k As String, default As Object) As Object
	Dim res As Object = vue.GetState(k, default)
	Return res
End Sub

'set mounted
Sub SetMounted(moduleObj As Object, methodName As String) As BANanoVM
	vue.SetMounted(moduleObj, methodName)
	Return Me
End Sub


Sub ForceUpdate
	vue.ForceUpdate
End Sub

Sub CreateSlider(sid As String, eventHandler As Object) As VMSlider
	Dim el As VMSlider
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub CreateTabs(sid As String, eventHandler As Object) As VMTabs
	Dim el As VMTabs
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub CreateTab(sid As String, eventHandler As Object) As VMTab
	Dim el As VMTab
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub CreateSwitch(sid As String, eventHandler As Object) As VMCheckBox
	Dim el As VMCheckBox
	el.Initialize(vue, sid, eventHandler)
	el.SetSwitch
	Return el
End Sub

Sub CreateCheckBox(sid As String, eventHandler As Object) As VMCheckBox
	Dim el As VMCheckBox
	el.Initialize(vue, sid, eventHandler)
	
	Return el
End Sub

Sub SetActivePanel(parentID As String, activeID As String)
	parentID = parentID.ToLowerCase
	activeID = activeID.tolowercase
	vue.SetData($"${parentID}active"$, activeID)
End Sub

Sub CreateDynamicContent(sid As String) As VMElement
	sid = sid.tolowercase
	Dim pp As String = $"${sid}htmlcontent"$
	SetStateSingle(pp,"<div></div>")
	Dim UI As VMElement = CreateTag(sid, "renderstring")
	UI.Bind(":string", pp)
	UI.SetStyleSingle("width", "100% !important")
	UI.SetStyleSingle("height", "100% !important")
	UI.SetStyleSingle("max-height", "100% !important")
	UI.SetStyleSingle("max-width", "100% !important")
	UI.SetStyleSingle("overflow-y", "auto !important")
	UI.SetStyleSingle("overflow-x", "hidden !important")
	UI.SetStyleSingle("float", "left !important")
	Return UI
End Sub

Sub SetDynamicContent(sid As String, dynaContent As String)
	sid = sid.ToLowerCase
	Dim pp As String = $"${sid}htmlcontent"$
	SetStateSingle(pp,dynaContent)
End Sub

Sub Use(bo As BANanoObject)
	vue.Use(bo)
End Sub

Sub CreateStepper(sid As String, eventHandler As Object) As VMStepper
	Dim el As VMStepper
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub CreateA(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(vue, sid).SetTag("a")
	
	Return el
End Sub

Sub GetShowState(k As String) As Boolean
	Dim showKey As String = $"${k}show"$
	Return GetState(showKey,False)
End Sub

Sub GetDisabledState(k As String) As Boolean
	Dim disKey As String = $"${k}disabled"$
	Return GetState(disKey,False)
End Sub

Sub GetRequiredState(k As String) As Boolean
	Dim disKey As String = $"${k}required"$
	Return GetState(disKey,False)
End Sub

Sub SetErrorState(k As String, v As Boolean)
	Dim showKey As String = $"${k}error"$
	SetStateSingle(showKey, v)
End Sub

Sub SetShowState(k As String, v As Boolean)
	Dim showKey As String = $"${k}show"$
	SetStateSingle(showKey, v)
End Sub

Sub SetDisabledState(k As String, v As Boolean)
	Dim disKey As String = $"${k}disabled"$
	SetStateSingle(disKey, v)
End Sub

Sub SetRequiredState(k As String, v As Boolean)
	Dim disKey As String = $"${k}required"$
	SetStateSingle(disKey, v)
End Sub

Sub CopyMap(source As Map, keys As List) As Map
	Return vue.CopyMap(source, keys)
End Sub

Sub FixRecords(recs As List, trimThese As List, numThese As List, boolThese As List, dateThese As List, dblThese As List)
	vue.FixRecords(recs, trimThese, numThese, boolThese, dateThese, dblThese)
End Sub

Sub MakeDouble(m As Map, xkeys As List)
	vue.MakeDouble(m, xkeys)
End Sub

Sub MakeInteger(m As Map, xkeys As List)
	vue.MakeInteger(m, xkeys)
End Sub

Sub MakeBoolean(m As Map, xkeys As List)
	vue.MakeBoolean(m, xkeys)
End Sub

Sub MakeTrim(m As Map, xkeys As List)
	vue.MakeTrim(m, xkeys)
End Sub


Sub JoinNonBlanks(delimiter As String, lst As List) As String
	Return vue.JoinNonBlanks(delimiter, lst)
End Sub

Sub JoinMaps(lst As List) As Map
	Return vue.JoinMaps(lst)
End Sub

Sub MakeDate(m As Map, xkeys As List)
	vue.MakeDate(m, xkeys)
End Sub

Sub ToggleNamedState(stateName As String, state1 As String, state2 As String) As BANanoVM
	vue.ToggleNamedState(stateName, state1, state2)
	Return Me
End Sub

Sub MakePx(sValue As String) As String
	Return vue.MakePx(sValue)
End Sub

Sub SetDestroyed(moduleObj As Object, methodName As String) As BANanoVM
	vue.SetDestroyed(moduleObj, methodName)
	Return Me
End Sub

Sub SetActivated(moduleObj As Object, methodName As String) As BANanoVM
	vue.SetActivated(moduleObj, methodName)
	Return Me
End Sub

Sub SetComputed(k As String, moduleObj As Object, methodName As String) As BANanoVM
	vue.SetComputed(k, moduleObj, methodName)
	Return Me
End Sub


Sub SetDeActivated(moduleObj As Object, methodName As String) As BANanoVM
	vue.SetDeActivated(moduleObj, methodName)
	Return Me
End Sub

Sub SetUpdated(moduleObj As Object, methodName As String) As BANanoVM
	vue.SetUpdated(moduleObj, methodName)
	Return Me
End Sub

Sub SetBeforeMount(moduleObj As Object, methodName As String) As BANanoVM
	vue.SetBeforeMount(moduleObj, methodName)
	Return Me
End Sub

Sub SetBeforeUpdate(moduleObj As Object, methodName As String) As BANanoVM
	vue.SetBeforeUpdate(moduleObj, methodName)
	Return Me
End Sub

Sub SetBeforeDestroy(moduleObj As Object, methodName As String) As BANanoVM
	vue.SetBeforeDestroy(moduleObj, methodName)
	Return Me
End Sub

Sub SetBeforeCreate(moduleObj As Object, methodName As String) As BANanoVM
	vue.SetBeforeCreate(moduleObj, methodName)
	Return Me
End Sub

'add a page to the template of the app
Sub AddPage(name As String, moduleObj As Object)
	name = name.tolowercase
	Pages.add(name)
	BANano.CallSub(moduleObj, "Code", Array(Me))   'ignore
	Hide(name)
End Sub

'show a page for the app
Sub ShowPage(name As String)
	name = name.tolowercase
	If Pages.IndexOf(name) = -1 Then
		Log($"ShowPage: ${name} does not exist!"$)
	End If
	HideDrawers
	Dim nm As Map = CreateMap()
	For Each page As String In Pages
		nm.Put($"${page}show"$, False)
	Next
	nm.Put($"${name}show"$, True)
	SetState(nm)
End Sub

Sub GetOptionsFromKV(delim As String, k As String, v As String) As Map
	Return vue.GetOptionsFromKV(delim, k, v)
End Sub


Sub ShowPrompt1(pName As String)
	SetPrompt(Null)
	ShowDialog(pName)
End Sub

Sub SetPrompt(pvalue As Object)
	vue.SetStateSingle("promptvalue",pvalue)
End Sub

Sub GetPrompt As String
	Dim ss As String = vue.GetState("promptvalue","")
	ss = ss.tolowercase
	Return ss
End Sub

Sub SetCallBack(moduleObj As Object, methodName As String) As BANanoVM
	methodName = methodName.tolowercase
	If SubExists(moduleObj, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(moduleObj, methodName, e)
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetButtonText(btnID As String, txt As String) As BANanoVM
	btnID = btnID.tolowercase
	vue.SetStateSingle($"${btnID}text"$, txt)
	Return Me
End Sub

Sub RemoveMethod(methodName As String) As BANanoVM
	vue.RemoveMethod(methodName)
	Return Me
End Sub

Sub CreateSnackBar(sid As String, eventHandler As Object) As VMSnackBar
	Dim el As VMSnackBar
	el.Initialize(vue, sid, eventHandler)
	
	Return el
End Sub
	

Sub GetAlert As String
	Return vue.getstate("alertkey","")
End Sub

Sub CreateExpansionPanels(sid As String, eventHandler As Object) As VMExpansionPanels
	Dim el As VMExpansionPanels
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub


Sub CreateForm(sid As String, eventHandler As Object) As VMForm
	Dim el As VMForm
	el.Initialize(vue, sid, eventHandler)
	
	Return el
End Sub

Sub CreateBottomSheet(sid As String, eventHandler As Object) As VMBottomSheet
	Dim el As VMBottomSheet
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub CreateSheet(sid As String, eventHandler As Object) As VMSheet
	Dim el As VMSheet
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub CreateCalendar(sid As String, eventHandler As Object) As VMCalendar
	Dim el As VMCalendar
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub


Sub CreateChip(sid As String, eventHandler As Object) As VMChip
	Dim el As VMChip
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub CreateCarouselItem(sid As String, eventHandler As Object) As VMCarouselItem
	Dim el As VMCarouselItem
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub CreateTextField(sid As String, eventHandler As Object) As VMTextField
	Dim el As VMTextField
	el.Initialize(vue, sid,eventHandler)
	Return el
End Sub


Sub CreateInput(sid As String, eventHandler As Object) As VMInput
	Dim el As VMInput
	el.Initialize(vue, sid, eventHandler)
	
	Return el
End Sub

Sub CreateFileInput(sid As String, eventHandler As Object) As VMFileInput
	Dim el As VMFileInput
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub AddContent(els As String)
	vue.SetTemplate(els)
End Sub

Sub CreateSpeedDial(sid As String, eventHandler As Object, initialIcon As String, finalIcon As String) As VMSpeedDial
	Dim el As VMSpeedDial
	el.Initialize(vue, sid,eventHandler)
	el.SetInitialIcon(initialIcon)
	el.SetFinalIcon(finalIcon)
	Return el
End Sub

Sub CreateMenu(sid As String, moduleObj As Object) As VMMenu
	Dim el As VMMenu
	el.Initialize(vue, sid, moduleObj)
	
	Return el
End Sub


Sub CreateDialog(sid As String, moduleObj As Object) As VMDialog
	Dim el As VMDialog
	el.Initialize(vue, sid, moduleObj)
	
	Return el
End Sub

Sub CreateDivider As VMDivider
	Dim el As VMDivider
	el.Initialize(vue)
	Return el
End Sub

Sub CreateRadio(sid As String, eventHandler As Object) As VMRadio
	Dim el As VMRadio
	el.Initialize(vue, sid, eventHandler)
	
	Return el
End Sub

Sub CreateDateTimePicker(sid As String, eventHandler As Object) As VMDateTimePicker
	Dim el As VMDateTimePicker
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub CreateIcon(sid As String, moduleObj As Object) As VMIcon
	Dim el As VMIcon
	el.Initialize(vue, sid, moduleObj)
	Return el
End Sub

Sub CreateSpan(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(vue,sid).SetTag("span")
	
	Return el
End Sub

Sub CreateElement(sid As String, stag As String) As VMElement
	Dim el As VMElement
	el.Initialize(vue,sid).SetTag(stag)
	Return el
End Sub

Sub CreateButton(sid As String,moduleObj As Object) As VMButton
	Dim el As VMButton
	el.Initialize(vue, sid, moduleObj)
	el.SetType("button")
	Return el
End Sub

Sub CreateButtonToggle(bid As String, moduleObj As Object) As VMButtonToggle
	Dim el As VMButtonToggle
	el.Initialize(vue, bid, moduleObj)
	Return el 
End Sub

Sub CreateB4xList(lst As List) As List
	Dim nl As List
	nl.Initialize 
	nl.AddAll(lst)
	Return nl
End Sub

Sub CreateIconButton(sid As String,moduleObj As Object, iconName As String) As VMButton
	Dim el As VMButton
	el.Initialize(vue, sid, moduleObj)
	el.SetIconButton(iconName)
	Return el
End Sub

Sub CreateFABButton(sid As String,moduleObj As Object, iconName As String) As VMButton
	Dim el As VMButton
	el.Initialize(vue, sid, moduleObj)
	el.SetFabButton(iconName)
	Return el
End Sub

Sub CreateRadioGroup(sid As String, eventHandler As Object) As VMRadioGroup
	Dim el As VMRadioGroup
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub CreateAppBar(sid As String, moduleObj As Object) As VMToolBar
	Dim el As VMToolBar
	el.Initialize(vue, sid, moduleObj)
	el.SetAppBar(True)
	Return el
End Sub

Sub CreateSystemBar(sid As String, moduleObj As Object) As VMToolBar
	Dim el As VMToolBar
	el.Initialize(vue, sid, moduleObj)
	el.SetSystemBar(True)
	Return el
End Sub

Sub MidString2(Text As String, Start As Int) As String
	Return vue.MidString2(Text, Start)
End Sub

Sub CreateToolbar(sid As String, moduleObj As Object) As VMToolBar
	Dim el As VMToolBar
	el.Initialize(vue, sid, moduleObj)
	el.SetToolBar(True)
	Return el
End Sub

Sub CreateOverlay(sid As String, moduleObj As Object) As VMOverlay
	Dim el As VMOverlay
	el.Initialize(vue, sid, moduleObj)
	Return el
End Sub

Sub Validate(rec As Map, required As Map) As Boolean
	Return vue.Validate(rec, required)
End Sub

Sub CreateSelect(sid As String, eventHandler As Object) As VMSelect
	Dim el As VMSelect
	el.Initialize(vue,sid,eventHandler)
	
	Return el
End Sub

Public Sub DateNow() As String
	Return vue.DateNow
End Sub

Public Sub TimeNow() As String
	Return vue.timenow
End Sub

Public Sub DateTimeNow() As String
	Return vue.DateTimeNow
End Sub


'convert a map keys to lowercase
Sub MakeLowerCase(m As Map) As Map
	Return vue.MakeLowerCase(m)
End Sub

Sub HTTPUpload(fileObj As Object, moduleObj As Object, methodname As String)
	vue.HTTPUpload(fileObj, moduleObj, methodname)
End Sub

Sub GetFileDetails(fileObj As Map) As FileObject
	Return vue.GetFileDetails(fileObj)
End Sub

'show hour glass
Sub PagePause
	Overlay.show
End Sub

'hide hourglass
Sub PageResume
	Overlay.hide
End Sub

Sub LeftString(Text As String, lLength As Long)As String
	Return vue.LeftString(Text, lLength)
End Sub

'set right to left
Sub SetRTL(b As Boolean) As BANanoVM
	RTL = b
	Drawer.SetRight(RTL)
	vuetify.SetField("rtl", b)
	Return Me
End Sub

'build the page
Sub UX
	vue.ShowWarnings = ShowWarnings
	If ShowWarnings Then
		If SubExists(Module, "confirm_ok") = False Then
			Log("Initialize.confirm_ok - please consider adding this optional event to trap confirm dialog!")
		End If
		'
		If SubExists(Module, "confirm_cancel") = False Then
			Log("Initialize.confirm_cancel - please consider adding this optional event to trap confirm dialog!")
		End If
		'
		If SubExists(Module, "alert_ok") = False Then
			Log("Initialize.alert_ok - please consider adding this optional event to trap alert dialog!")
		End If
		'
		If SubExists(Module, "logo_click") = False Then
			Log("Initialize.logo_click - please consider adding this optional event to trap logo click event if needed!")
		End If
		'
		If SubExists(Module, "title_click") = False Then
			Log("Initialize.title_click - please consider adding this optional event to trap title click event if needed!")
		End If
	End If
	Drawer.SetRight(RTL)
	'make spanish
	Dim mlang As Map = CreateMap()
	mlang.Put("current", lang)
	'
	Dim theme As Map = CreateMap()
	theme.Put("dark", Dark)
	Options.Put("rtl", RTL)
	Options.Put("theme", theme)
	Options.Put("lang", mlang)
	'
	If UsesDialog Then
		Dim sDialog As String = Confirm.tostring
		AddContent(sDialog)
	'
		Dim sDialog As String = Alert.tostring
		AddContent(sDialog)
	End If
	'
	If UsesSnackBar Then SnackBar.Pop(VContent)
	If UsesOverlay Then Overlay.Pop(VContent)
	If UsesNotification Then Notification.Pop(VContent)
	
	'add drawer first
	If UsesDrawer Then Drawer.Pop(VApp)
	'add navbar
	If UsesNavBar Then NavBar.Pop(VApp)
	
	If bUseRouter Then
		Animate.AddComponent(RouterView.ToString)
		VContent.AddComponent(Animate.ToString)
	Else
		Container.Pop(VContent)
	End If
	
	'add content
	VContent.Pop(VApp)
	'add footer
	If UsesFooter Then Footer.Pop(VApp)
	'add bottom nan
	If UsesBottomNav Then BottomNav.Pop(VApp)
	'template built from all pages
	vue.SetTemplate(VApp.ToString)
	'
	'set vuetify to the vue scope
	'create a new instance of vuetify
	BOVuetify.Initialize2("Vuetify", Options)
	vue.SetFrameWork("vuetify", BOVuetify)
	'create the app
	vue.ux
	'
	Dim svuetify As String = "$vuetify"
	vuetify = vue.BOVue.GetField(svuetify)
	Breakpoint = vuetify.GetField("breakpoint").Result
	BreakpointName = vuetify.GetField("breakpoint").GetField("name").Result
End Sub

'scroll to, 300, 0, easeInOutCubic
Sub ScrollTo(elID As String, duration As Int, offset As Int, easing As String)
	Try
		elID = elID.tolowercase
		Dim el As BANanoObject = vue.refs.GetField(elID)
		If duration = Null Then duration = 300
		If offset = Null Then offset = 0
		If easing = "" Then easing = "easeInOutCubic"
		Dim opt As Map = CreateMap()
		opt.Put("duration", duration)
		opt.Put("offset", offset)
		opt.Put("easing", easing)
		vuetify.RunMethod("goTo", Array(el, opt))
	Catch
		Log("ScrollTo Error")
	End Try
End Sub

'change the locale
Sub SetLocale(slang As String) As BANanoVM
	lang = slang
	Try
		vuetify.GetField("lang").SetField("current", slang)
	Catch
		Log(LastException)
	End Try
	Return Me
End Sub

Sub CreateDrawer(sid As String, eventHandler As Object) As VMNavigationDrawer
	Dim el As VMNavigationDrawer
	el.Initialize(vue, sid, eventHandler)
	el.RemoveAttr("app")
	Return el
End Sub

'add a container
Sub AddDrawer(cont As VMNavigationDrawer)
	drawers.Add(cont.ID)
	Dim scont As String = cont.tostring
	'Container.SetText(scont)
	VApp.SetText(scont)
End Sub

'add content to the v-app element
Sub AddToApp(content As String)
	VApp.SetText(content)
End Sub

'add a container
Sub AddContainer(cont As VMContainer)
	Dim scont As String = cont.tostring
	Container.SetText(scont)
End Sub


'add a bottom sheet
Sub AddBottomSheet(cont As VMBottomSheet)
	Dim scont As String = cont.tostring
	Container.SetText(scont)
End Sub

'add a container
Sub AddContainerRC(row As Int, col As Int, cont As VMContainer)
	Container.AddComponent(row, col, cont.ToString)
End Sub

Sub NewEmail(eventHandler As Object, bStatic As Boolean, sid As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, shelpertext As String, serrorText As String, iTabIndex As Int) As VMTextField
	Dim el As VMTextField = NewTextField(eventHandler, bStatic, sid, vmodel, slabel, splaceholder, bRequired, sIcon, 0, shelpertext, serrorText, iTabIndex)
	el.SetType("email")
	Return el
End Sub

Sub NewSwitch(eventHandler As Object, bStatic As Boolean, sid As String, vmodel As String, slabel As String, svalue As Object, sunchecked As Object, bPrimary As Boolean, iTabIndex As Int) As VMCheckBox
	Dim el As VMCheckBox = CreateSwitch(sid, eventHandler)
	el.SetStatic(bStatic)
	el.SetVModel(vmodel)
	el.Setlabel(slabel)
	el.SetValue(svalue)
	el.SetTrueValue(svalue)
	el.SetPrimary(bPrimary)
	el.SetUncheckedValue(sunchecked)
	el.SetFalseValue(sunchecked)
	el.SetTabIndex(iTabIndex)
	vue.SetData(vmodel, sunchecked)
	Return el
End Sub
'
Sub NewRadioGroup(eventHandler As Object, bStatic As Boolean, sid As String, vmodel As String, slabel As String, svalue As Object, optionsm As Map, bShowLabel As Boolean, bLabelOnTop As Boolean, iTabIndex As Int) As VMRadioGroup
	Dim el As VMRadioGroup = CreateRadioGroup(sid, eventHandler)
	el.SetStatic(bStatic)
	el.SetVModel(vmodel)
	el.Setlabel(slabel)
	el.SetOptions(optionsm)
	el.SetTabIndex(iTabIndex)
	el.SetValue(svalue)
	vue.SetData(vmodel, svalue)
	If bShowLabel = False Then el.SetLabel("")
	If bLabelOnTop Then
		el.SetColumn(bLabelOnTop)
	Else
		el.SetRow(True)
	End If
	Return el
End Sub


Sub NewRadioGroupDataSource(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, sLabel As String, svalue As String, sourceTable As String, sourceField As String, displayField As String, bShowLabel As Boolean, bLabelOnTop As Boolean, iTabIndex As Int) As VMRadioGroup
	Dim el As VMRadioGroup = CreateRadioGroup(sname, eventHandler)
	el.SetStatic(bStatic)
	el.SetVModel(vmodel)
	el.Setlabel(sLabel)
	el.SetTabIndex(iTabIndex)
	el.SetDataSource(sourceTable, sourceField, displayField)
	vue.SetData(vmodel, svalue)
	If bShowLabel = False Then el.SetLabel("")
	If bLabelOnTop Then
		el.SetColumn(bLabelOnTop)
	Else
		el.SetRow(True)
	End If
	Return el
End Sub

Sub NewCheckBox(eventHandler As Object, bStatic As Boolean, sid As String, vmodel As String, slabel As String, svalue As Object, sunchecked As Object, bPrimary As Boolean, iTabIndex As Int) As VMCheckBox
	Dim el As VMCheckBox = CreateCheckBox(sid, eventHandler)
	el.SetStatic(bStatic)
	el.SetVModel(vmodel)
	el.SetValue(svalue)
	el.SetTrueValue(svalue)
	el.Setlabel(slabel)
	el.SetPrimary(bPrimary)
	el.SetUncheckedValue(sunchecked)
	el.SetFalseValue(sunchecked)
	el.SetTabIndex(iTabIndex)
	vue.SetData(vmodel, sunchecked)
	Return el
End Sub

Sub NewDatePicker(eventHandler As Object, bStatic As Boolean, sid As String, vmodel As String, slabel As String, bRequired As Boolean, sPlaceholder As String, sHint As String, sErrorText As String, iTabIndex As Int) As VMDateTimePicker
	Dim el As VMDateTimePicker = CreateDateTimePicker(sid, eventHandler)
	el.setstatic(bStatic)
	el.Setlabel(slabel)
	el.SetRequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.SetVModel(vmodel)
	el.SetPlaceHolder(sPlaceholder)
	el.SetHint(sHint)
	el.TextField.SetRules(True)
	el.TextField.SetErrorMessages(True)
	el.DateTimePicker.ErrorMessage = sErrorText
	el.TextField.SetError(False)
	el.SetForInput
	Return el
End Sub
'
Sub NewTimePicker(eventHandler As Object, bStatic As Boolean, sid As String, vmodel As String, slabel As String, bRequired As Boolean, sPlaceholder As String, sHint As String, sErrorText As String, iTabIndex As Int) As VMDateTimePicker
	Dim el As VMDateTimePicker = CreateDateTimePicker(sid, eventHandler).SetTimePicker
	el.setstatic(bStatic)
	el.Setlabel(slabel)
	el.SetVModel(vmodel)
	el.SetRequired(bRequired)
	el.SetPlaceHolder(sPlaceholder)
	el.SetHint(sHint)
	el.SetTabIndex(iTabIndex)
	el.TextField.SetRules(True)
	el.TextField.SetErrorMessages(True)
	el.DateTimePicker.ErrorMessage = sErrorText
	el.TextField.SetError(False)
	el.SetForInput
	Return el
End Sub
'
'Sub NewChip(sname As String, sText As String, bClickable As Boolean, bDeletable As Boolean, sourceTable As String, sourceField As String, displayField As String) As VMInputControl
'	sname = sname.tolowercase
'	Dim actName As String = sname
'	Dim actID As String = sname
'	If sname.IndexOf(".") >= 0 Then
'		actName = MvField(sname,2,".")
'	End If
'	Dim el As VMInputControl
'	el.Initialize(actName)
'	el.ActualID = actID
'	el.SetChip
'	el.Text = sText
'	el.Clickable = bClickable
'	el.Deletable = bDeletable
'	If sourceTable <> Null Then el.sourceTable = sourceTable
'	If sourceField <> Null Then el.sourceField =sourceField
'	If displayField <> Null Then el.displayField = displayField
'	el.UseOptions = False
'	el.UseDataSource = True
'	el.Host = actName
'	Return el
'End Sub
'
''
Sub NewSlider(eventHandler As Object,bStatic As Boolean,sid As String, vmodel As String, slabel As String, iMinValue As String, iMaxValue As String,iTabIndex As Int) As VMSlider
	Dim el As VMSlider = CreateSlider(sid, eventHandler)
	el.SetStatic(bStatic)
	el.SetMin(iMinValue)
	el.SetMax(iMaxValue)
	el.SetLabel(slabel)
	el.SetVModel(vmodel)
	el.SetTabIndex(iTabIndex)
	Return el
End Sub
'
'added for back ward compatibility
Sub NewText(eventHandler As Object,bStatic As Boolean,sid As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, iMaxLen As Int, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMTextField
	Return NewTextField(eventHandler,bStatic,sid, vmodel, slabel, splaceholder, bRequired, sIcon, iMaxLen, shelpertext, sErrorText, iTabIndex)
End Sub

Sub NewTextField(eventHandler As Object,bStatic As Boolean,sid As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, iMaxLen As Int, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMTextField
	Dim el As VMTextField = CreateTextField(sid, eventHandler)
	el.SetStatic(bStatic)
	el.Setlabel(slabel)
	el.SetRequired(bRequired)
	el.SetPrependIcon(sIcon)
	If iMaxLen > 0 Then
		el.SetMaxLength(iMaxLen)
		el.SetCounter(True)
	End If
	el.SetPlaceHolder(splaceholder)
	el.SetHint(shelpertext)
	el.SetTabIndex(iTabIndex)
	el.SetVModel(vmodel)
	el.SetType("text")
	el.SetRules(True)
	el.SetErrorMessages(True)
	el.TextField.ErrorMessage = sErrorText
	el.SetError(False)
	Return el
End Sub
'
Sub ShowError(elID As String, elError As String)
	vue.ShowError(elID, elError)
End Sub

Sub HideError(elID As String)
	vue.HideError(elID)
End Sub

Sub NewTel(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMTextField
	Dim el As VMTextField = NewTextField(eventHandler,bStatic,sname, vmodel, slabel, splaceholder, bRequired, sIcon, 0, shelpertext, sErrorText, iTabIndex)
	el.SetType("tel")
	Return el
End Sub

Sub NewNumber(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMTextField
	Dim el As VMTextField = NewTextField(eventHandler,bStatic,sname, vmodel, slabel, splaceholder, bRequired, sIcon, 0, shelpertext, sErrorText, iTabIndex)
	el.SetType("number")
	Return el
End Sub

Sub NewTextArea(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, bAutoGrow As Boolean, sIcon As String, iMaxLen As Int, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMTextField
	Dim el As VMTextField = CreateTextField(sname, eventHandler).SetTextArea
	el.setstatic(bStatic)
	el.Setlabel(slabel)
	el.Setrequired(bRequired)
	el.SetPrependIcon(sIcon)
	If iMaxLen > 0 Then
		el.SetCounter(iMaxLen)
		el.SetMaxLength(iMaxLen)
	End If
	el.SetVModel(vmodel)
	el.SetPlaceHolder(splaceholder)
	el.SetHint(shelpertext)
	el.SetTabIndex(iTabIndex)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.SetAutoGrow(bAutoGrow)
	el.TextField.ErrorMessage = sErrorText
	Return el
End Sub

'
Sub NewPassword(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, bToggle As Boolean, sIcon As String, iMaxLen As Int, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMTextField
	Dim el As VMTextField = NewTextField(eventHandler,bStatic,sname, vmodel, slabel, splaceholder, bRequired, sIcon, iMaxLen, shelpertext, sErrorText, iTabIndex)
	el.SetPassword(True, bToggle)
	Return el
End Sub

'backward compatibility
Sub NewFile(eventHandler As Object,bStatic As Boolean, bUpload As Boolean, sname As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, shelpertext As String, sErrorText As String, iTabIndex As Int) As VMFileInput
	Return NewFileInput(eventHandler,bStatic,bUpload, sname, vmodel, slabel, splaceholder, bRequired, shelpertext, sErrorText, iTabIndex)
End Sub
'
Sub NewFileInput(eventHandler As Object,bStatic As Boolean, bUpload As Boolean, sname As String, vmodel As String, slabel As String, splaceholder As String, bRequired As Boolean, shelperText As String, sErrorText As String, iTabIndex As Int) As VMFileInput
	Dim el As VMFileInput = CreateFileInput(sname, eventHandler)
	el.setstatic(bStatic)
	el.SetHint(shelperText)
	el.SetTabIndex(iTabIndex)
	el.SetPlaceHolder(splaceholder)
	el.SetVModel(vmodel)
	el.Setlabel(slabel)
	el.SetClearable(False)
	el.SetRequired(bRequired)
	vue.SetData(vmodel, Null)
	el.SetRules(vue.NewList)
	el.SetErrorMessages(vue.NewList)
	el.SetError(False)
	el.SetErrorText(sErrorText)
	Return el
End Sub
'
Sub NewImage(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, src As String, salt As String, swidth As String, sheight As String) As VMImage
	vmodel = vmodel.ToLowerCase
	Dim el As VMImage = CreateImage(sname, eventHandler)
	el.setstatic(bStatic)
	el.SetWidth(swidth)
	el.SetHeight(sheight)
	el.SetAlt(salt)
	el.SetVModel(vmodel, src)
	Return el
End Sub
'
'
Sub NewLabel(bStatic As Boolean,sname As String, vmodel As String, sSize As String, sText As String) As VMLabel
	vmodel = vmodel.tolowercase
	Dim el As VMLabel = CreateLabel(sname)
	el.setstatic(bStatic)
	el.SetTag(sSize)
	el.SetVModel(vmodel, sText)
	Select Case sSize
		Case vue.SIZE_BLOCKQUOTE
			el.AddClass("blockquote")
	End Select
	Return el
End Sub


Sub NewIcon(eventHandler As Object,bStatic As Boolean,sname As String, sIcon As String, sSize As String, scolor As String, sintensity As String) As VMIcon
	Dim el As VMIcon = CreateIcon(sname, eventHandler)
	el.SetStatic(bStatic)
	el.SetText(sIcon)
	el.SetAttributes(Array(sSize))
	el.SetColorIntensity(scolor,sintensity)
	Return el
End Sub
'
Sub NewButton(eventHandler As Object,bStatic As Boolean,sname As String, sLabel As String, bRaised As Boolean, bPrimary As Boolean, bAccent As Boolean, bFitWidth As Boolean) As VMButton
	Dim el As VMButton = CreateButton(sname, eventHandler)
	el.setstatic(bStatic)
	el.SetLabel(sLabel)
	If bRaised = False Then el.SetTransparent(True)
	If bPrimary Then el.SetPrimary(bPrimary)
	If bAccent Then el.SetColor("accent")
	If bFitWidth Then el.SetBlock(True)
	Return el
End Sub
'
'use select with map
Sub NewAutoCompleteOptions(eventHandler As Object,bStatic As Boolean,sname As String,vmodel As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, optionsm As Map, sourceField As String, displayField As String, returnObject As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMSelect
	Dim el As VMSelect = CreateSelect(sname, eventHandler).SetAutoComplete
	el.setstatic(bStatic)
	el.Setlabel(sLabel)
	el.SetRequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.Setplaceholder(sPlaceHolder)
	el.SetHint(sHelperText)
	el.Setmultiple(bMultiple)
	el.SetVModel(vmodel)
	el.SetOptions($"${vmodel}items"$, optionsm, sourceField, displayField, returnObject)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.Combo.ErrorMessage = sErrorText
	Return el
End Sub

Sub NewAutoCompleteDataSource(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, sourceTable As String, sourceField As String, displayField As String, returnObject As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMSelect
	Dim el As VMSelect = CreateSelect(sname, eventHandler).SetAutoComplete
	el.SetStatic(bStatic)
	el.Setlabel(sLabel)
	el.SetRequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.SetPlaceholder(sPlaceHolder)
	el.SetHint(sHelperText)
	el.SetMultiple(bMultiple)
	el.SetDataSource(sourceTable, sourceField, displayField,returnObject)
	el.SetVModel(vmodel)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.Combo.ErrorMessage = sErrorText
	Return el
End Sub

Sub NewSelectDataSource(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, sourceTable As String, sourceField As String, displayField As String, returnObject As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMSelect
	Dim el As VMSelect = CreateSelect(sname, eventHandler)
	el.SetStatic(bStatic)
	el.Setlabel(sLabel)
	el.SetRequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.SetPlaceholder(sPlaceHolder)
	el.SetHint(sHelperText)
	el.SetMultiple(bMultiple)
	el.SetDataSource(sourceTable, sourceField, displayField,returnObject)
	el.SetVModel(vmodel)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.Combo.ErrorMessage = sErrorText
	Return el
End Sub

'use select with map
Sub NewSelectOptions(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, optionsm As Map, sourceField As String, displayField As String, returnObject As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMSelect
	Dim el As VMSelect = CreateSelect(sname, eventHandler)
	el.SetStatic(bStatic)
	el.Setlabel(sLabel)
	el.Setrequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.Setplaceholder(sPlaceHolder)
	el.SetHint(sHelperText)
	el.Setmultiple(bMultiple)
	el.SetVModel(vmodel)
	el.SetOptions($"${vmodel}items"$, optionsm, sourceField, displayField, returnObject)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.Combo.ErrorMessage = sErrorText
	Return el
End Sub

Sub NewComboDataSource(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, sourceTable As String, sourceField As String, displayField As String, returnObject As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMSelect
	Dim el As VMSelect = CreateSelect(sname, eventHandler).SetComboBox
	el.setstatic(bStatic)
	el.Setlabel(sLabel)
	el.SetRequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.SetPlaceholder(sPlaceHolder)
	el.SetHint(sHelperText)
	el.SetMultiple(bMultiple)
	el.SetVModel(vmodel)
	el.SetDataSource(sourceTable, sourceField, displayField,returnObject)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.Combo.ErrorMessage = sErrorText
	Return el
End Sub

'use select with map
Sub NewComboOptions(eventHandler As Object,bStatic As Boolean,sname As String, vmodel As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, optionsm As Map, sourceField As String, displayField As String, returnObject As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMSelect
	Dim el As VMSelect = CreateSelect(sname, eventHandler).SetComboBox
	el.SetStatic(bStatic)
	el.Setlabel(sLabel)
	el.SetRequired(bRequired)
	el.SetTabIndex(iTabIndex)
	el.Setplaceholder(sPlaceHolder)
	el.SetHint(sHelperText)
	el.Setmultiple(bMultiple)
	el.SetVModel(vmodel)
	el.SetOptions($"${vmodel}items"$, optionsm, sourceField, displayField, returnObject)
	el.SetRules(True)
	el.SetError(False)
	el.SetErrorMessages(True)
	el.Combo.ErrorMessage = sErrorText
	Return el
End Sub
'
Sub NewIconButton(eventHandler As Object,bStatic As Boolean,sname As String, iconName As String, sColor As String, sTooltip As String) As VMButton
	Dim el As VMButton = CreateButton(sname, eventHandler)
	el.SetStatic(bStatic)
	el.SetIconButton(iconName)
	el.SetColor(sColor)
	el.SetTooltip(sTooltip)
	Return el
End Sub

Sub NewFABButton(eventHandler As Object,bStatic As Boolean,sname As String, iconName As String, sColor As String, sTooltip As String) As VMButton
	Dim el As VMButton = CreateFABButton(sname, eventHandler, iconName)
	el.SetStatic(bStatic)
	el.SetColor(sColor)
	el.SetTooltip(sTooltip)
	Return el
End Sub

'add a blank option to a list
Sub AddBlankOption(lst As List, keyField As String, ValueField As String)
	Dim opt As Map = CreateMap()
	opt.Put(keyField, "")
	opt.Put(ValueField, "--Nothing Selected--")
	lst.Add(opt)
End Sub

Sub NewH1(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "h1", sText)
End Sub

Sub NewH2(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "h2", sText)
End Sub

Sub NewH3(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "h3", sText)
End Sub

Sub NewH4(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "h4", sText)
End Sub

Sub NewH5(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname,sname, "h5", sText)
End Sub

Sub NewH6(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "h6", sText)
End Sub

Sub NewP(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, "p", sText)
End Sub

Sub NewSPAN(bstatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bstatic,sname, sname, SIZE_SPAN, sText)
End Sub

Sub NewBLOCKQUOTE(bStatic As Boolean,sname As String, sText As String) As VMLabel
	Return NewLabel(bStatic,sname, sname, SIZE_BLOCKQUOTE, sText)
End Sub

public Sub readAsText(fr As String) As BANanoPromise
	Dim promise As BANanoPromise 'ignore
		
	' calling a single upload
	promise.CallSub(Me, "ReadFile", Array(fr, "readAsText"))
	Return promise
End Sub

Sub readAsBinaryString(fr As String) As BANanoPromise
	Dim promise As BANanoPromise 'ignore
		
	' calling a single upload
	promise.CallSub(Me, "ReadFile", Array(fr, "readAsBinaryString"))
	Return promise
End Sub

Sub readAsDataURL(fr As String) As BANanoPromise
	Dim promise As BANanoPromise 'ignore
		
	' calling a single upload
	promise.CallSub(Me, "ReadFile", Array(fr, "readAsDataURL"))
	Return promise
End Sub

Sub readAsArrayBuffer(fr As String) As BANanoPromise
	Dim promise As BANanoPromise 'ignore
		
	' calling a single upload
	promise.CallSub(Me, "ReadFile", Array(fr, "readAsArrayBuffer"))
	Return promise
End Sub

private Sub ReadFile(FileToRead As Object, MethodName As String)
	' make a filereader
	Dim FileReader As BANanoObject
	FileReader.Initialize2("FileReader", Null)
	' attach the file (to get the name later)
	FileReader.SetField("file", FileToRead)
	
	' make a callback for the onload event
	' an onload of a FileReader requires a 'event' param
	Dim event As Map
	FileReader.SetField("onload", BANano.CallBack(Me, "OnLoad", Array(event)))
	FileReader.SetField("onerror", BANano.CallBack(Me, "OnError", Array(event)))
	' start reading the DataURL
	FileReader.RunMethod(MethodName, FileToRead)
End Sub

private Sub OnLoad(event As Map) As String 'ignore
	' getting our file again (set in UploadFileAndGetDataURL)
	Dim FileReader As BANanoObject = event.Get("target")
	Dim UploadedFile As BANanoObject = FileReader.GetField("file")
	' return to the then of the UploadFileAndGetDataURL
	BANano.ReturnThen(CreateMap("name": UploadedFile.GetField("name"), "result": FileReader.Getfield("result")))
End Sub

private Sub OnError(event As Map) As String 'ignore
	Dim FileReader As BANanoObject = event.Get("target")
	Dim UploadedFile As BANanoObject = FileReader.GetField("file")
	Dim Abort As Boolean = False
	' uncomment this if you want to abort the whole operatio
	' Abort = true
	' FileReader.RunMethod("abort", Null)
	
	BANano.ReturnElse(CreateMap("name": UploadedFile.GetField("name"), "result": FileReader.GetField("error"), "abort": Abort))
End Sub

'generate a treeitem
Sub TreeItem(parentID As String, key As String, text As String, mhref As String, mIcon As String, mDisabled As Boolean) As Map
	parentID = parentID.tolowercase
	key = key.tolowercase
	Dim mitem As Map = CreateMap()
	mitem.Put("id", key)
	mitem.Put("name", text)
	mitem.Put("href", mhref)
	mitem.Put("icon", mIcon)
	mitem.Put("disabled", mDisabled)
	mitem.Put("parentid", parentID)
	Return mitem
End Sub

'return the icon for the file
Sub FileIcon(ext As String) As String
	Dim extm As Map = CreateMap()
	extm.Put("html", "mdi-language-html5")
	extm.Put("js", "mdi-nodejs")
	extm.Put("json", "mdi-code-json")
	extm.Put("md", "mdi-markdown")
	extm.Put("pdf", "mdi-file-pdf")
	extm.Put("png", "mdi-file-image")
	extm.Put("txt", "mdi-file-document-outline")
	extm.Put("xls", "mdi-file-excel")
	extm.Put("csv", "mdi-file-delimited-outline")
	extm.Put("pre", "mdi-file-code-outline")
	extm.Put("code", "mdi-file-code-outline")
	extm.Put("doc", "mdi-file-word-box-outline")
	extm.Put("mp3", "mdi-file-music-outline")
	extm.Put("folder", "mdi-folder")
	extm.Put("woff", "marketweb-webfont.woff")
	extm.Put("css", "mdi-language-css3")
	'
	ext = ext.ToLowerCase
	If extm.ContainsKey(ext) Then
		Dim res As String = extm.Get(ext)
		Return res
	Else
		Return "mdi-file-document-outline"
	End If
End Sub

'add a list with
Sub CreateMultiCheckList(EventHandler As Object, dtID As String, dtSource As String, dtKey As String, dtTitle As String, dtTarget As String) As VMList
	'create a list
	dtID = dtID.tolowercase
	Dim dtList As VMList
	dtList.Initialize(vue, dtID, EventHandler)
	dtList.SetDense(True)
	'
	Dim vlig As VMListItemGroup
	vlig.Initialize(vue, $"${dtID}lig"$, EventHandler)
	vlig.SetVModel(dtTarget)
	vlig.SetAttrLoose("multiple")
	vlig.SetOnChange($"${dtID}_check"$)
	'
	Dim dtLI As VMListItem
	dtLI.Initialize(vue, "", EventHandler)
	dtLI.SetAttrSingle("v-for", $"(item, index) in ${dtSource}"$)
	dtLI.SetAttrSingle(":key", $"item.${dtKey}"$)
	dtLI.SetAttrSingle(":value", $"item.${dtKey}"$)
	'add checkbox slot
	Dim tmpx As VMTemplate
	tmpx.Initialize(vue, "", EventHandler)
	tmpx.SetAttrSingle("v-slot:default", "{ active, toggle }")
	'add action item
	Dim vlia As VMListItemAction
	vlia.Initialize(vue, "", EventHandler)
	'add checkbox
	Dim vliacb As VMCheckBox
	vliacb.Initialize(vue, "", EventHandler)
	vliacb.SetAttrSingle(":input-value", "active")
	vliacb.SetAttrSingle(":key", $"item.${dtKey}"$)
	vliacb.SetAttrSingle(":true-value", $"item.${dtKey}"$)
	vliacb.SetColor("primary")
	vliacb.SetDense(True)
	vliacb.SetAttrSingle("@click", "toggle")
		
	'add checkbox to item action
	vlia.AddComponent(vliacb.tostring)
	tmpx.AddComponent(vlia.ToString)
	
	'add title
	Dim vlic As VMListItemContent
	vlic.Initialize(vue, "", EventHandler)
	Dim vlit As VMListItemTitle
	vlit.Initialize(vue, "", EventHandler)
	vlit.SetVText($"item.${dtTitle}"$)
	vlic.AddComponent(vlit.ToString)
	'add template to item
	tmpx.AddComponent(vlic.ToString)
	dtLI.AddComponent(tmpx.tostring)
	'add to group
	vlig.AddComponent(dtLI.ToString)
	'add item to list
	dtList.AddComponent(vlig.tostring)
	Return dtList
End Sub

Sub CreateH1(id As String) As VMLabel
	Dim elx As VMLabel = CreateLabel(id).seth1
	Return elx
End Sub

Sub CreateH2(id As String) As VMLabel
	Dim elx As VMLabel = CreateLabel(id).seth2
	Return elx
End Sub

Sub CreateH3(id As String) As VMLabel
	Dim elx As VMLabel = CreateLabel(id).seth3
	Return elx
End Sub

Sub CreateH4(id As String) As VMLabel
	Dim elx As VMLabel = CreateLabel(id).seth4
	Return elx
End Sub

Sub CreateH5(id As String) As VMLabel
	Dim elx As VMLabel = CreateLabel(id).seth5
	Return elx
End Sub

Sub CreateH6(id As String) As VMLabel
	Dim elx As VMLabel = CreateLabel(id).seth6
	Return elx
End Sub

Sub CreateParagraph(id As String) As VMLabel
	Dim elx As VMLabel = CreateLabel(id).SetParagraph
	Return elx
End Sub

Sub CreateAnchor(id As String) As VMLabel
	Dim elx As VMLabel = CreateLabel(id).SetA
	Return elx
End Sub

Sub LoremIpsum As String
	Return BANanoShared.Rand_LoremIpsum(1)
End Sub