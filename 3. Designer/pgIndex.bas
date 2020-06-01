B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#ignorewarnings: 12, 9
Sub Process_Globals
	Private saccept As String
	Private sfilenamevmodel As String
	Private sfiledatevmodel As String
	Private sfilesizevmodel As String
	Private sfiletypevmodel As String
	Private sfloat As String
	Private smargintop As String
	Private smarginbottom As String
	Private smarginleft As String
	Private smarginright As String
	Private smargins As String
	Private smargine As String
	Private smarginx As String
	Private smarginy As String
	Private smargina As String
	Private spaddingtop As String
	Private spaddingbottom As String
	Private spaddingleft As String
	Private spaddingright As String
	Private spaddings As String
	Private spaddinge As String
	Private spaddingx As String
	Private spaddingy As String
	Private spaddinga As String
	
	Private bisupload As Boolean
	Private sAction As String
	Private rsType As String
	Private sbRead As StringBuilder
	Private dlgmultifields As VMDialog
	Private isDirty As Boolean
	Private Mode As String
	Private tblBox As VMTabs
	Private ep As VMExpansionPanels
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private ui As VMContainer
	Private BANano As BANano  'ignore
	Private bHasBorder As Boolean
	Private bShowMatrix As Boolean
	Private tblProp As VMToolBar
	Private istool As Boolean
	Private sconfirmfield As String
	Private bislookup As Boolean
	Private sdatabasename As String
	Private sprojectname As String
	Private sdbtype As String
	Private bisautofocus As Boolean
	Private shashtype As String
	Private salg As String
	Private bisupdatable As Boolean
	Private smatchto As String
	Private sdonotmatchto As String
	Private bisdatenow As Boolean
	Private bistimenow As Boolean
	Private bisdatetimenow As Boolean
	Private bisreadonly As Boolean
	Private stablename As String
	Private sprimarykey As String
	Private sinfotype As String
	Private bisautoplay As String
	Private sDecimal As String
	Private sDecimals As String
	Private sPrefix As String
	Private sSuffix As String
	Private sSeparator As String

	'
	Private sBackgroundcolor As String
	Private sColor As String
	Private bisDisabled As Boolean
	Private sDuration As String
	Private sFrom As String
	Private bisHoverexpandeffect As Boolean
	Private bisHoverzoomeffect As Boolean
	Private sIcon As String
	Private sIconbackgroundcolor As String
	Private sIconcolor As String
	Private sText As String
	Private sTo As String
	Private bisVisible As Boolean
	'
	Private sbuttontype As String
	Private pbtextfield As VMProperty   	
	Private pbdatepicker As VMProperty  	
	Private pbcheckbox As VMProperty    	
	Private pbradiogroup As VMProperty  	
	Private pbselectbox As VMProperty		
	Private pbslider As VMProperty			
	Private pbicon As VMProperty			
	Private pbbutton As VMProperty			
	Private pblabel As VMProperty			
	Private pbimage As VMProperty			
	Private pbparallax As VMProperty
	Private pbcontainer As VMProperty
	Private pbtoolbar As VMProperty
	Private pbmenu As VMProperty
	Private pbdrawer As VMProperty
	Private pbcarousel As VMProperty
	Private pbdialog As VMProperty
	Private pbspeeddial As VMProperty
	Private pbrating As VMProperty
	Private pbtable As VMProperty
	Private pbchip As VMProperty
	Private pbbadge As VMProperty
	Private pbavatar As VMProperty
	Private pblist As VMProperty
	Private pbtabs As VMProperty
	Private pbstepper As VMProperty
	Private pbexpansionpanels As VMProperty
	Private pbpage As VMProperty
	Private pbbuilder As VMProperty
	Private lstBags As List
	Private avatarMap As Map
	Private controltypes As Map
	Private fieldtypes As Map
	Private dnd As VMContainer
	Private tabs As VMTabs
	Private b4x As VMContainer
	Private html5 As VMContainer
	Private schema As VMContainer
	Private schemaDT As VMDataTable
	Private mymac As VMDevice
	Private myipad As VMDevice
	Private myiphone As VMDevice
	Private iconsizes As Map
	Private pbquill As VMProperty
	Private pbinfobox As VMProperty
	Private pbfileselect As VMProperty
	'
	Private controltype As String
	Private srow As String
	Private scol As String
	Private stabindex As String
	Private sname As String
	Private svmodel As String
	Private sattributes As String
	Private sstyles As String
	Private sclasses As String
	Private sloose As String
	Private stitle As String
	Private sfieldtype As String
		
	' get the attributes
	Private mattr As Map
	Private os As String
	Private om As String
	Private ol As String
	Private ox As String
	'
	Private ss As String
	Private sm As String
	Private sl As String
	Private sx As String
	'
	Private splaceholder As String
	Private bisrequired As Boolean
	Private siconname As String
	Private shelpertext As String
	Private serrortext As String
	Private imaxlen As String
	Private bautogrow As Boolean
	Private svalue As String
	Private bisPrimary As Boolean
	Private bisVisible As Boolean
	Private bisDisabled As Boolean
	Private bontable As Boolean
	Private bisdark As Boolean
	'
	Private bissolo As Boolean
	Private bisoutlined As Boolean
	Private bisfilled As Boolean
	Private bisdense As Boolean
	Private bissingleline As Boolean
	Private bispersistenthint As Boolean
	Private bisshaped As Boolean
	Private bisloading As Boolean
	Private bisflat As Boolean
	Private bisrounded As Boolean
	Private bclearable As Boolean
	Private bishidedetails As Boolean
	Private bToggle As Boolean
	Private bcenteronparent As Boolean
	'
	Private struevalue As String
	Private sfalsevalue As String
	Private bislight As Boolean
	Private bismultiple As Boolean
	Private bisinset As Boolean
	Private bisindeterminate As Boolean
	Private bisitalic As Boolean
	'
	Private bfitwidth As Boolean
	Private shref As String
	Private starget As String
	Private sTo As String
	Private bistext As Boolean
	Private bisdepressed As Boolean
	Private bistile As Boolean
	Private ssize As String
	Private sswitchloading As String
	'
	Private swidth As String
	Private sheight As String
	Private sminwidth As String
	Private sminheight As String
	Private smaxwidth As String
	Private smaxheight As String
	'
	Private stooltip As String
	Private sColor As String
	Private sintensity As String
	'
	Private stextcolor As String
	Private stextintensity As String
	'
	Private ssrc As String
	Private slazysrc As String
	Private salt As String
	Private sborderradius As String
	Private sborderwidth As String
	Private sbordercolor As String
	Private sborderstyle As String
	Private saspectratio As String
	'
	Private bisvertical As Boolean
	Private bisthumbalways As Boolean
	Private bisthumblabel As Boolean
	Private sminvalue As String
	Private sslidervalue As String
	Private sstepvalue As String
	Private smaxvalue As String
	Private sprependicon As String
	Private sappendicon As String
	Private sthumbsize As String
	Private sthumbcolor As String
	Private sthumbintensity As String
	Private strackcolor As String
	Private strackintensity As String
	'
	Private ssourcefield As String
	Private ssourcetable As String
	Private sdisplayfield As String
	Private skeys As String
	Private svalues As String
	Private bisreturnobject As Boolean
	Private buseoptions As Boolean
	Private bischips As Boolean
	Private bissmallchips As Boolean
	Private bisdeletablechips As Boolean
	'
	Private bshowlabel As Boolean
	Private blabelontop As Boolean
	Private bismandatory As Boolean
	'
	Private bisrange As Boolean
	Private bisshowweek As Boolean
	Private bisampm As Boolean
	Private bisnotitle As Boolean
	Private bisuseseconds As Boolean
	'
	Private sfirstdayofweek As String
	Private stformat As String
	Private bStatic As Boolean
	Private sb As StringBuilder
	'
	Private pc As VMPrism
	Private htm As VMPrism
	Private dbCode As VMPrism
	
	Private selevation As String
	Private stransition As String
	Private bisfluid As Boolean
	Private bisshowmatrix As Boolean
	Private bisnogutters As Boolean
	'
	Private ssearchkey As String 
	Private stoolbarsubtitle As String
	Private bistitle As Boolean
	Private bissubtitle As Boolean
	Private bissearch As Boolean
	Private sextensionheight As String
	Private sscrolltarget As String
	Private sscrollthreshold As String
	Private slogourl As String
	Private stitleclass As String
	Private sbartype As String
	Private slogowidth As String
	Private slogoheight As String
	Private bishamburger As Boolean
	Private bisHamburgervisible As Boolean
	Private biscurrent As Boolean
	Private bisflat As Boolean
	Private bisabsolute As Boolean
	Private bisclippedleft As Boolean
	Private bisclippedright As Boolean
	Private bisclippedleft As Boolean
	Private biscollapse As Boolean
	Private biscollapseonscroll As Boolean
	Private biselevateonscroll As Boolean
	Private bisextended As Boolean
	Private bisfadeimageonscroll As Boolean
	Private bisfixed As Boolean
	Private bisfloating As Boolean
	Private bishideonscroll As Boolean
	Private bisinvertedscroll As Boolean
	Private bisprominent As Boolean
	Private bisscrolloffscreen As Boolean
	Private bisshort As Boolean
	Private bisshrinkonscroll As Boolean
	Private bislogovisible As Boolean
	'menu
	Private sactivator As String
	Private sclosedelay As String
	Private scontentclass As String
	Private smaxheight As String
	Private smaxwidth As String
	Private sminwidth As String
	Private snudgebottom As String
	Private snudgeleft As String
	Private snudgeright As String
	Private snudgetop As String
	Private snudgewidth As String
	Private sopendelay As String
	Private sorigin As String
	Private spositionx As String
	Private spositiony As String
	Private sreturnvalue As String
	Private stabindex As String
	Private stransition As String
	'
	Private bisabsolute As Boolean
	Private bisallowoverflow As Boolean
	Private bisauto As Boolean
	Private bisbottom As Boolean
	Private biscloseonclick As Boolean
	Private biscloseoncontentclick As Boolean
	Private bisdisablekeys As Boolean
	Private biseager As Boolean
	Private bisfixed As Boolean
	Private bisinternalactivator As Boolean
	Private bisleft As Boolean
	Private bislight As Boolean
	Private bisoffsetoverflow As Boolean
	Private bisoffsetx As Boolean
	Private bisoffsety As Boolean
	Private bisopenonclick As Boolean
	Private bisopenonhover As Boolean
	Private bisright As Boolean
	Private bisslotactivator As Boolean
	Private bistop As Boolean
	Private menutype As String
	Private jcontents As String
	Private lcontents As List
	Private bisspacer As Boolean
	Private sColor As String
	Private sheight As String
	Private sminivariantwidth As String
	Private smobilebreakpoint As String
	Private soverlaycolor As String
	Private soverlayopacity As String
	Private stabindex As String
	Private stag As String
	Private swidth As String
	Private bisabsolute As Boolean
	Private bisapp As Boolean
	Private bisbottom As Boolean
	Private bisclipped As Boolean
	Private bisdisableresizewatcher As Boolean
	Private bisdisableroutewatcher As Boolean
	Private bisexpandonhover As Boolean
	Private bisfixed As Boolean
	Private bisfloating As Boolean
	Private bishideoverlay As Boolean
	Private bislight As Boolean
	Private bismini As Boolean
	Private bisminivariant As Boolean
	Private bispermanent As Boolean
	Private bisright As Boolean
	Private bisslotappend As Boolean
	Private bisslotimg As Boolean
	Private bisstateless As Boolean
	Private bistemporary As Boolean
	Private smtitle As String
	Private smsubtitle As String
	'
	Private sactiveclass As String
	Private sdelimitericon As String
	Private sheight As String
	Private sinterval As String
	Private sprogresscolor As String
	Private sprogresscolorintensity As String
	Private smmax As String
	'
	Private biscontinuous As Boolean
	Private biscycle As Boolean
	Private bishidedelimiterbackground As Boolean
	Private bishidedelimiters As Boolean
	Private bislight As Boolean
	Private bismandatory As Boolean
	Private bisnexticon As Boolean
	Private bisprevicon As Boolean
	Private bisprogress As Boolean
	Private bisreverse As Boolean
	Private bisshowarrows As Boolean
	Private bisshowarrowsonhover As Boolean
	Private bistouchless As Boolean
	Private sverticaldelimiter As String
	'
	Private biscaption As Boolean
	Private bisdisplay1 As Boolean
	Private bisdisplay2 As Boolean
	Private bisdisplay3 As Boolean
	Private bisdisplay4 As Boolean
	Private bisheadline As Boolean
	Private bisitalic As Boolean
	Private bisoverline As Boolean
	Private bisrequired As Boolean
	Private bissubtitle1 As Boolean
	Private bissubtitle2 As Boolean
	Private bistextcapitalize As Boolean
	Private bistextlowercase As Boolean
	Private bistextuppercase As Boolean
	Private bistitle As Boolean
	'
	Private sactivator As String
	Private scontentclass As String
	Private sheight As String
	Private smaxwidth As String
	Private sorigin As String
	Private soverlaycolor As String
	Private soverlaycolorintensity As String
	Private soverlayopacity As String
	Private stransition As String
	Private swidth As String
	Private bisattach As Boolean
	Private bisbackdrop As Boolean
	Private bisshowonopen As Boolean
	Private biseager As Boolean
	Private bisfullscreen As Boolean
	Private bishideoverlay As Boolean
	Private bisinternalactivator As Boolean
	Private bislight As Boolean
	Private bisnoclickanimation As Boolean
	Private bisopenonhover As Boolean
	Private bispersistent As Boolean
	Private bisretainfocus As Boolean
	Private bisscrollable As Boolean
	Private bisslotactivator As Boolean
	Private bistitleprimary As Boolean
	'
	Private sCancelid As String
	Private sCancelcaption As String
	Private sOkid As String
	Private sOkcaption As String
	'
	Private bisabsolute As Boolean
	Private bisbottom As Boolean
	Private sDirection As String
	Private sFinalicon As String
	Private bisfixed As Boolean
	Private shref As String
	Private sInitialicon As String
	Private bisLarge As Boolean
	Private bisleft As Boolean
	Private sMode As String
	Private bisopenonhover As Boolean
	Private sorigin As String
	Private bisright As Boolean
	Private bisSmall As Boolean
	Private starget As String
	Private sTo As String
	Private bistop As Boolean
	Private stransition As String
	Private bisXlarge As Boolean
	Private bisXsmall As Boolean
	'rating
	Private sBackgroundcolor As String
	Private sBackgroundintensity As String
	Private bisClearable As Boolean
	Private sclosedelay As String
	Private sColor As String
	Private sintensity As String
	Private bisdense As Boolean
	Private sEmptyicon As String
	Private sFullicon As String
	Private sHalficon As String
	Private bisHalfincrements As Boolean
	Private bisHover As Boolean
	Private bisLarge As Boolean
	Private sLength As String
	Private bislight As Boolean
	Private sopendelay As String
	Private bisRipple As Boolean
	Private bisSmall As Boolean
	Private stabindex As String
	Private sDatasource As String
	Private bisXlarge As Boolean
	Private bisXsmall As Boolean
	' table
	Private bisCalculatewidths As Boolean
Private sCaption As String
Private sDatasourcename As String
Private bisdense As Boolean
Private bisDisablefiltering As Boolean
Private bisDisablepagination As Boolean
Private bisDisablesort As Boolean
Private bisFixedheader As Boolean
Private sheight As String
Private bisHidedefaultfooter As Boolean
Private bisHidedefaultheader As Boolean
Private sItemkey As String
Private sItemsperpage As String
Private bislight As Boolean
Private bisloading As Boolean
'Private sLoadingtext As String
'Private sLocale As String
Private smobilebreakpoint As String
Private bisMultisort As Boolean
Private bisMustsort As Boolean
'Private sNodatatext As String
'Private sNoresultstext As String
Private sPage As String
'Private sSearch As String
Private bisShowexpand As Boolean
Private bisShowgroupby As Boolean
Private bisShowselect As Boolean
Private bisSingleexpand As Boolean
Private bisSingleselect As Boolean
Private stabindex As String
	Private smastericon As String
	'
	Private bisDelete As Boolean
	Private bisClone As Boolean
	Private bisDownload As Boolean
	Private bisEdit As Boolean
	Private bisMenu As Boolean
	Private bisPrint As Boolean
	Private bisSearchbox As Boolean
	Private bisdialog As Boolean
	Private sSelectfields As String
	Private sSelecttype As String
	Private sSortfields As String
	'
	Private snewid As String
	Private snewicon As String
	Private snewtooltip As String
	'
	Private bisautoincrement As Boolean
	Private bisaddnew As Boolean
	Private sparent As String
	Private bisnow As Boolean
	
	Private sdialogpage As String
	Private sclickaction As String
	Private sbEvents As StringBuilder
	Private iconpos As Map
	'
	'chip
	Private bisActive As Boolean
	Private bisAppend As Boolean
	Private bisClose As Boolean
	Private sCloseicon As String
	Private sColor As String
	Private sColorintensity As String
	Private bisDraggable As Boolean
	Private bisExact As Boolean
	Private bisFilter As Boolean
	Private shref As String
	Private sInputvalue As String
	Private bisLabel As Boolean
	Private bisLarge As Boolean
	Private bislight As Boolean
	Private bisLink As Boolean
	Private bisNuxt As Boolean
	Private bisoutlined As Boolean
	Private bisPill As Boolean
	Private bisReplace As Boolean
	Private bisRipple As Boolean
	Private bisSmall As Boolean
	Private starget As String
	Private sTo As String
	Private bisXlarge As Boolean
	Private bisXsmall As Boolean
	Private siconpos As String
	Private schiptype As String
	'
	Private bisAvatar As Boolean
	Private bisBordered As Boolean
	Private bisbottom As Boolean
	Private sContent As String
	Private bisdark As Boolean
	Private bisDot As Boolean
	Private bisInline As Boolean
	Private bisleft As Boolean
	Private bislight As Boolean
	Private sOffsetx As String
	Private sOffsety As String
	Private sorigin As String
	Private bisOverlap As Boolean
	'avatar
	Private sBadge As String
	Private bisHasbadge As Boolean
	Private bisleft As Boolean
	Private bisright As Boolean
	Private ssize As String
	Private savatartype As String
	Private sbadgetype As String
	'
	Private bisExpand As Boolean
	Private bisNav As Boolean
	Private bisSubheader As Boolean
	Private bisThreeline As Boolean
	Private bisTwoline As Boolean
	Private sKeyfld As String
	Private sAvatarfld As String
	Private bismasterdrawer As String
	Private sIconfld As String
	Private sTitlefld As String
	Private sSubtitlefld As String
	Private sActioniconfld As String
	Private sIconcolorfld As String
	Private sSubtitle1fld As String
	Private sActioniconcolorfld As String
	Private bisoptions As Boolean
	Private bisdivider As Boolean
	Private bismainclick As Boolean
	Private sactiveclass As String
	Private bisAlignwithtitle As Boolean
	Private sBackgroundcolor As String
	Private sBackgroundcolorintensity As String
	Private bisCenteractive As Boolean
	Private bisCentered As Boolean
	Private sColor As String
	Private sColorintensity As String
	Private bisdark As Boolean
	Private bisFixedtabs As Boolean
	Private bisGrow As Boolean
	Private sheight As String
	Private bisHideslider As Boolean
	Private bisIconsandtext As Boolean
	Private bislight As Boolean
	Private smobilebreakpoint As String
	Private sNexticon As String
	Private bisOptional As Boolean
	Private sPrevicon As String
	Private bisright As Boolean
	Private bisshowarrows As Boolean
	Private sSlidercolor As String
	Private sSlidercolorintensity As String
	Private sSlidersize As String
	Private stabindex As String
	Private bisVisible As Boolean
	Private bisiconposright As Boolean
	Private bistabslider As Boolean
	'
	Private bisAltlabels As Boolean
	Private bisdark As Boolean
	Private bislight As Boolean
	Private bisNonlinear As Boolean
	Private sStepactive As String
	Private stabindex As String
	Private bisvertical As Boolean
	Private bisVisible As Boolean
	'
	Private bisAccordion As Boolean
	Private sActivepanel As String
	Private bisdark As Boolean
	Private bisflat As Boolean
	Private bisFocusable As Boolean
	Private bisHover As Boolean
	Private bislight As Boolean
	Private bismandatory As Boolean
	Private bisPopout As Boolean
	Private bistile As Boolean
	Private bisVisible As Boolean
	'
	Private sBuildertype As String
	Private sDecription As String
	Private sPrefix As String
	Private stag As String
	'
	Private sDescription As String
	Private bisDrawervisible As Boolean
	Private sIconcolor As String
	Private sIconcolorintensity As String
	Private siconname As String
	Private sKeywords As String
	Private bislogovisible As Boolean
	Private bisNavbarvisible As Boolean
	Private bisShowondrawer As Boolean
	Private bisShowonnavbar As Boolean
	Private spagetitle As String
	Private bisUpdatenavtitle As Boolean
	Private stooltip As String
	Private bisdivider As Boolean
	Private bisinsetdivider As Boolean
	Private bisicon As Boolean
	Private drwprojectdetails As VMNavigationDrawer
	Private ssenderemail As String
	Private ssendtoemail As String
	Private sccemail As String
	'
	Private bisitemdiv As Boolean
	Private bisitemnogutter As Boolean
End Sub

Sub Init
	'initialize the application
	vm.Initialize(Me, Main.appname)
	vue = vm.vue
	'
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
	vm.NavBar.SetClippedLeft(True)
	vm.Drawer.SetClipped(True)  
	vm.RTL = False
	vm.SnackBar.SetColor("green")
	vm.SnackBar.SetTop(True)
	vm.NavBar.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	vm.NavBar.SetDark(True)
	vm.Footer.Hide
	'vm.Container.SetFillHeight(True)
	'
	vm.Drawer.AddTitleSubTitle("Projects", "")
	'
	vm.NavBar.AddIcon("btnSavePrj", "mdi-content-save", "Save stage to project","")
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	Dim gridmenu As VMMenu = vm.CreateMenu("gridMenu", Me).SetButton("", "Grid")
	gridmenu.AddItem("btnClearGrid", "", "delete", "Clear", "", "")
	gridmenu.AddItem("btnRemoveLastGrid", "", "delete", "Remove Last", "", "")
	vm.NavBar.AddMenu(gridmenu)
	'
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	Dim compmenu As VMMenu = vm.CreateMenu("compMenu", Me).SetButton("", "Components")
	compmenu.AddItem("btnclearcomp", "", "delete", "Clear", "", "")
	compmenu.AddItem("btnremovelastcomp", "", "delete", "Remove Last", "", "")
	compmenu.AddItem("btndownloadcomp", "", "mdi-cloud-download-outline", "Download", "", "")
	compmenu.AddItem("btnuploadcomp","", "mdi-cloud-upload-outline","Upload", "", "")
	vm.NavBar.AddMenu(compmenu)
	'
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	vm.NavBar.AddIcon("btnMatrix", "mdi-matrix","Show Matrix", "")
	vm.NavBar.AddIcon("btnBorder", "mdi-border-all", "Show Borders","")
	vm.NavBar.Addicon("btnmac", "mdi-laptop-mac", "Macbook","")
	vm.navbar.AddIcon("btnipad","mdi-tablet-ipad", "iPad", "")
	vm.NavBar.addicon("btniphone", "mdi-cellphone-iphone", "iPhone", "")
	vm.NavBar.AddIcon("btnLandScape", "mdi-phone-rotate-landscape", "Rotate", "")
	vm.NavBar.AddIcon("btnProject", "mdi-cogs", "Project", "")
	vm.NavBar.AddIcon("btnRefresh", "refresh", "Refresh", "")
	
	'
	'get last selected panel
	Dim sp As String = BANano.GetLocalStorage("selectedpanel")
	If sp <> Null Then
		vm.setdata("selectedpanel", BANano.parseint(sp))
	Else
		vm.setdata("selectedpanel", 0)
	End If
	controltypes = CreateMap("number":"number", "text":"text", "tel":"tel", "email":"email","password":"password", "textarea":"textarea", "date":"date", "time":"time", "select":"select", "combo":"combo", "auto":"auto","file":"file","profile":"profile","image":"image","button":"button","rangeslider":"rangeslider", _
	"quill": "quill","infobox":"infobox","fileselect":"fileselect")
	fieldtypes = CreateMap("string":"String", "int":"Integer", "bool":"Boolean", "date":"Date","dbl":"Float")
	iconsizes = CreateMap("":"Normal","small":"Small", "medium":"Medium", "large":"Large", "x-small":"X-Small", "x-large":"X-Large")
	'
	iconpos.initialize
	iconpos.put("left", "Left")
	iconpos.put("right", "Right")
	iconpos.put("", "None")
	'
	lstBags.Initialize
	avatarMap.initialize
	
	'
	vm.setdata("showmatrix", "Yes")
	vm.setdata("hasborder", "Yes")
	vm.setdata("landscape", "No")
	bHasBorder = True
	bShowMatrix = True
	'
	vm.Container.SetFluid(True)
	
	DesignLayout
	'add property bags
	PropertyBag_TextField   'ok
	PropertyBag_DatePicker  'ok
	PropertyBag_CheckBox
	PropertyBag_RadioGroup
	PropertyBag_Select    'ok
	PropertyBag_Slider
	PropertyBag_Label
	PropertyBag_Image
	PropertyBag_Icon
	PropertyBag_Button
	PropertyBag_Parallax
	PropertyBag_Container
	PropertyBag_Toolbar
	PropertyBag_Menu
	PropertyBag_Drawer
	PropertyBag_Carousel
	PropertyBag_Dialog
	PropertyBag_SpeedDial
	PropertyBag_Rating
	PropertyBag_Table
	PropertyBag_Chip
	PropertyBag_Badge
	PropertyBag_Avatar
	PropertyBag_List
	PropertyBag_Tabs
	PropertyBag_Stepper
	PropertyBag_ExpansionPanels
	PropertyBag_Builder
	PropertyBag_Page
	PropertyBag_Quill
	PropertyBag_InfoBox
	PropertyBag_FileSelect
	'
	'add an invisible file uploader
	vm.AddFileSelect(Me, "fucomponent")
	CreateProjectDrawer
	'
	vm.Drawer.SetWidth("300")
	Dim dtbl As VMToolBar = vm.CreateToolbar("dtbl", Me)
	dtbl.SetDense(True).SetFlat(True)
	dtbl.AddSpacer
	dtbl.AddIcon1("btnNewProject", "mdi-book-plus", "green", "Add a new project","")
	dtbl.AddIcon1("btnSaveComponents2Project", "mdi-content-save-outline", "orange", "Save components to project","")
	dtbl.AddIcon1("btnExtractComponents", "mdi-application-export", "purple", "Export components to stage","")
	dtbl.AddIcon1("btnDownloadComponents", "mdi-cloud-download-outline", "brown", "Download project components","")
	dtbl.AddIcon1("btnDeleteProject", "delete", "red", "Delete project", "")
	'
	vm.drawer.Container.SetNoGutters(True)
	vm.Drawer.Container.AddControlS(dtbl.ToolBar, dtbl.ToString,1,1,12,12,12,12)
	
	'load the list of projects
	vm.setdata("projects", vm.newlist)
	vm.setdata("components", vm.newlist)
	vm.Drawer.SetDataSourceTemplate1("projects","id","","","","projectname","","","","")
	'
	vm.SetMethod(Me, "LoadProjects")
	vm.SetMethod(Me, "LoadTables")
	vm.SetMethod(Me, "LoadContainers")
	vm.SetMethod(Me, "LoadComponents")
	'
	CreateDialog_Multifields
	'
	vm.UX
	'
	vm.SetData("project", vm.newmap)
	vm.SetData("propbag", vm.newmap)
	vm.SetData("tableitems", vm.newlist)
	drwprojectdetails.Container.Setdefaults
	CreateUX
	vm.CallMethod("LoadProjects")
	vm.CallMethod("LoadContainers")
	'
	Dim db As BANanoSQL
	Dim prjSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	prjSQL.Initialize("project", "id")
	prjSQL.SelectAll(Array("*"), Array("projectname"))
	prjSQL.result = db.ExecuteWait(prjSQL.query, prjSQL.args)
	prjSQL.FromJSON
	Dim projects As List = prjSQL.result
	If projects.size = 0 Then
		vm.ShowSnackBArError("You need to create a new project first!")
		Mode = "A"
		drwprojectdetails.Show
		Return
	End If
	'open last project
	Dim prjRec As Map = BANano.GetLocalStorage("project")
	If prjRec = Null Then 
		vm.ShowSnackBarError("You need to select the work project from the drawer first!")
		vm.Drawer.Show
		Return
	End If
	Mode = "E"
	sprojectname = prjRec.getdefault("projectname", "")
	sdatabasename = prjRec.getdefault("databasename","")
	vm.NavBar.UpdateTitle($"${Main.AppTitle} [${sprojectname}]"$)
	vm.setdata("project", prjRec)
	vm.setstate(prjRec)
End Sub

'create dialog
Sub CreateDialog_Multifields
	dlgmultifields = vm.CreateDialog("dlgmultifields", Me)
	dlgmultifields.Settitle("Add Mulitple Items")
	dlgmultifields.SetCancel("btnCancelFields","Cancel")
	dlgmultifields.SetOk("btnAddFields","Ok")
	dlgmultifields.Setwidth("700px")
	dlgmultifields.Setretainfocus(True)
	Dim txtamultifields As VMTextField = vm.NewTextArea(Me, False, "txtamultifields", "multifields", "Items (,)", "", True, False, "", 0, "", "", 0)
	txtamultifields.SetFieldType("string")
	txtamultifields.SetOutlined(True)
	txtamultifields.SetVisible(True)
	txtamultifields.SetHideDetails(True)
	dlgmultifields.Container.AddControl(txtamultifields.TextField, txtamultifields.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	'
	Dim selmultidatatype As VMSelect = vm.NewComboOptions(Me, False, "selmultidatatype", "multidatatype", "Data Type", True, False, "", vue.DataTypes, "id", "text", False, "", "", 0)
	selmultidatatype.SetFieldType("string")
	selmultidatatype.SetVisible(True)
	selmultidatatype.SetHideDetails(True)
	selmultidatatype.SetOutlined(True)
	selmultidatatype.SetDense(True)
	dlgmultifields.Container.AddControl(selmultidatatype.Combo, selmultidatatype.tostring, 2, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	vm.AddDialog(dlgmultifields)
End Sub

'clicked by the fields selector
Sub btnaddmultiple_click(e As BANanoEvent)
	dlgmultifields.Show
End Sub

'add multiple items
Sub btnAddFields_click(e As BANanoEvent)
	'get the fld data
	Dim flds As Map = dlgmultifields.Container.GetData
	Dim bValid As Boolean = vm.Validate(flds, dlgmultifields.Container.Required)
	'if invalid exit create/update
	If bValid = False Then
		Dim strError As String = vue.GetError
		vm.ShowSnackBar(strError)
		Return
	End If
	'read the details we want to add
	Dim smultifields As String = vm.getdata("multifields")
	Dim smultidatatype As String = vm.getdata("multidatatype")
	'read the existing items
	Dim nitems As List = vm.getdata("tableitems")
	'	
	If smultifields.Contains(",") Then
		Dim xitems() As String = BANano.Split(",", smultifields)
		For Each xi As String In xitems
			Dim xtitle As String = vm.BeautifyName(xi)
			xi = xtitle.tolowercase
			Dim ni As Map = CreateMap()
			ni.Put("key", xi)
			ni.put("title", xtitle)
			ni.put("coldatatype", smultidatatype)
			ni.put("colscope", "Public")
			ni.put("subtitle", "text")
			ni.put("colalign", "start")
			ni.put("colcontroltype", "text")
			ni.put("colactive", "Yes")
			ni.put("colontable", "Yes")
			ni.put("colvisible", "Yes")
			ni.put("colwidth", "0")
			ni.put("colrow", "1")
			ni.put("colcolumn", "1")
			ni.put("coloffsetsmall", "0")
			ni.put("coloffsetmedium", "0")
			ni.put("coloffsetlarge", "0")
			ni.put("coloffsetxlarge", "0")
			ni.put("colsizesmall", "12")
			ni.put("colsizemedium", "12")
			ni.put("colsizelarge", "12")
			ni.put("colsizexlarge", "12")
			Select Case smultidatatype
			Case "INT"
				ni.put("colfieldtype", "Int")
			Case "BOOL"
				ni.put("colfieldtype", "Boolean")
			Case "FLOAT"
				ni.put("colfieldtype", "Double")
			Case Else
				ni.put("colfieldtype", "String")
			End Select
			nitems.add(ni)
		Next
	Else
		Dim ni As Map = CreateMap()
		Dim xtitle As String = vm.BeautifyName(smultifields)
		smultifields = xtitle.tolowercase
		ni.Put("key", smultifields)
		ni.put("title", xtitle)
		ni.put("coldatatype", smultidatatype)
		ni.put("colscope", "Public")
		ni.put("subtitle", "text")
		ni.put("colalign", "start")
		ni.put("colcontroltype", "text")
		ni.put("colactive", "Yes")
		ni.put("colontable", "Yes")
		ni.put("colvisible", "Yes")
		ni.put("colwidth", "0")
		ni.put("colrow", "1")
		ni.put("colcolumn", "1")
		ni.put("coloffsetsmall", "0")
		ni.put("coloffsetmedium", "0")
		ni.put("coloffsetlarge", "0")
		ni.put("coloffsetxlarge", "0")
		ni.put("colsizesmall", "12")
		ni.put("colsizemedium", "12")
		ni.put("colsizelarge", "12")
		ni.put("colsizexlarge", "12")
		Select Case smultidatatype
		Case "INT"
			ni.put("colfieldtype", "Int")
		Case "BOOL"
			ni.put("colfieldtype", "Boolean")
		Case "FLOAT"
			ni.put("colfieldtype", "Double")
		Case Else
			ni.put("colfieldtype", "String")
		End Select
		nitems.add(ni)
	End If
	'save the items
	vm.setdata("tableitems", nitems)
	dlgmultifields.hide
	SavePropertyBag
End Sub

Sub btnCancelFields_click(e As BANanoEvent)
	dlgmultifields.hide
End Sub

Sub btnSavePrj_click(e As BANanoEvent)
	SaveComponents("No")
End Sub

Sub btnDownloadComponents_click(e As BANanoEvent)
	Dim prj As Map = vm.getdata("project")
	Dim pid As String = prj.getdefault("id", "")
	If pid = "" Then
		vm.ShowSnackBarError("Please select the project to download components from!")
		Return
	End If
	vm.PagePause
	pid = BANano.parseint(pid)
	Dim db As BANanoSQL
	Dim compSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	compSQL.Initialize("project", "id")
	compSQL.AddIntegers(Array("id"))
	compSQL.AddStrings(Array("projectname","dbtype","databasename","components"))
	compSQL.Read(pid)
	compSQL.result = db.ExecuteWait(compSQL.query, compSQL.args)
	compSQL.FromJSON
	If compSQL.result.Size = 0 Then
		vm.PageResume
		Return
	End If
	Dim prj As Map = compSQL.result.get(0)
	Dim sprojectname As String = prj.getdefault("projectname", "")
	Dim compJSON As String = prj.getdefault("components", "")
	vm.PageResume
	'save to file
	vm.SaveText2File(compJSON, $"${sprojectname}.txt"$)
End Sub

'extract components to stage
Sub btnExtractComponents_click(e As BANanoEvent)
	ExtractComponents("No")
End Sub

Sub ExtractComponents(YesNo As String)
	Dim prj As Map = vm.getdata("project")
	Dim pid As String = prj.getdefault("id", "")
	If pid = "" Then
		vm.ShowSnackBarError("Please select the project to extract components from!")
		Return
	End If
	'
	vm.setdata("devspace", 0)
	Dim db As BANanoSQL
	db.OpenWait("bvmdesigner", "bvmdesigner")
	isDirty = True 
	'
	If YesNo.EqualsIgnoreCase("yes") Then
		'delete all components in the stage
		Dim rsSQL As BANanoAlaSQLE
		rsSQL.Initialize("components", "id")
		rsSQL.DeleteAll
		rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
		rsSQL.FromJSON
		vm.Drawer.Hide
	End If
	
	Dim compJSON As String = prj.getdefault("components", "")
	If compJSON = "" Then 
		CreateUX
		Return
	End If
	'
	vm.PagePause
	'lets import to the db
	Dim CompList As List
	CompList.initialize
	If compJSON <> "" Then CompList = BANano.FromJSON(compJSON)
	Dim compSQL As BANanoAlaSQLE
	compSQL.Initialize("components", "id")
	compSQL.AddIntegers(Array("id", "row","col","tabindex"))
	compSQL.AddStrings(Array("parentid","name","vmodel","attributes","styles","classes", "loose","label", "icon","avatar","items", "controltype"))
	For Each nrec As Map In CompList
		compSQL.Insert1(nrec)
		compSQL.result = db.ExecuteWait(compSQL.query, compSQL.args)
		compSQL.FromJSON
	Next
	vm.PageResume
	CreateUX
End Sub

'save components to project
Sub btnSaveComponents2Project_click(e As BANanoEvent)
	SaveComponents("No")
End Sub

Sub SaveComponents(YesNo As String)		
	Dim prj As Map = vm.getdata("project")
	Dim pid As String = prj.getdefault("id", "")
	If pid = "" Then
		vm.ShowSnackBarError("Please select the project to save the components to first!")
		Return
	End If
	vm.setdata("devspace", 0)
	'get the components
	vm.PagePause
	Dim db As BANanoSQL
	Dim compSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	'add the components
	compSQL.Initialize("components", "id")
	compSQL.SelectAll(Array("*"), Array("row", "col"))
	compSQL.result = db.ExecuteWait(compSQL.query, compSQL.args)
	compSQL.FromJSON
	'convert to json
	Dim compJSON As String = BANano.ToJSON(compSQL.result)
	'save to project
	pid = BANano.parseint(pid)
	prj.Put("components", compJSON)
	db.OpenWait("bvmdesigner", "bvmdesigner")
	compSQL.Initialize("project", "id")
	compSQL.AddIntegers(Array("id"))
	compSQL.AddStrings(Array("projectname","dbtype","databasename","components"))
	compSQL.Update1(prj, pid)
	compSQL.result = db.ExecuteWait(compSQL.query, compSQL.args)
	compSQL.FromJSON
	vm.SetData("project", prj)
	BANano.SetLocalStorage("project", prj)
	isDirty = False
	vm.PageResume
	'
	If YesNo.EqualsIgnoreCase("yes") Then
		NewProject
	End If
End Sub

'master drawer click
Sub draweritems_click(e As BANanoEvent)
	Dim menuID As String = vm.getidfromevent(e)
	If menuID = "" Then Return
	menuID = BANano.parseint(menuID)
	vm.setdata("project", vm.NewMap)
	'read the record from the database
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("project", "id")
	rsSQL.AddIntegers(Array("id"))
	rsSQL.AddStrings(Array("projectname","dbtype","databasename","components"))
	rsSQL.Read(menuID)
	rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
	rsSQL.fromjson
	If rsSQL.result.size = 0 Then Return
	'read the first record found
	Dim rec As Map = rsSQL.result.get(0)
	vm.setdata("project", rec)
	vm.setstate(rec)
	BANano.SetLocalStorage("project", rec)
	Mode = "E"
	Dim sprojectname As String = rec.getdefault("projectname", "")
	vm.NavBar.UpdateTitle($"${Main.AppTitle} [${sprojectname}]"$)
	'
	vm.ShowConfirm("loadproject", $"Confirm Load: ${sprojectname}"$, _
	$"Would you like to load this project to the stage? If Yes, this will delete the stage components"$, "Yes", "No")
	
End Sub

Sub btnDeleteProject_click(e As BANanoEvent)
	Dim project As Map = vm.getdata("project")
	Dim sprojectname As String = project.getdefault("projectname", "")
	Dim pid As String = project.GetDefault("id", "")
	If pid = "" Then
		vm.ShowSnackBar("You need to select the project to delete first!")
		Return
	End If
	'
	vm.setdata("deleteid", pid)
	vm.ShowConfirm("deleteproject", $"Confirm Delete: ${sprojectname}"$, _
	$"Are you sure that you want to delete this project?"$, "Yes", "No")

End Sub

'add a new project
Sub btnNewProject_click(e As BANanoEvent)
	If isDirty Then
		vm.ShowConfirm("confirmsave", $"Confirm Save"$, _
	$"The stage has not been saved, do you want to save it to the current project?"$, "Yes", "No")
	Else
		NewProject
	End If
End Sub

Sub NewProject
	Mode = "A"
	vm.drawer.Hide
	'hide all property bags
	ShowBag("")
	'show the drawer
	drwprojectdetails.Container.SetDefaults
	drwprojectdetails.Show
	vm.SetFocus("txtprojectname")
End Sub

Sub alert_ok(e As BANanoEvent)
	
End Sub

Sub LoadTables
	'"tablename", "primarykey", "displayfields"
	Dim db As BANanoSQL
	Dim prjSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	prjSQL.Initialize("tables", "tablename")
	prjSQL.SelectAll(Array("*"), Array("tablename"))
	prjSQL.result = db.ExecuteWait(prjSQL.query, prjSQL.args)
	prjSQL.fromJSON
	vm.setdata("tablenames", prjSQL.result)
End Sub

Sub LoadComponents
	Dim db As BANanoSQL
	Dim prjSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	prjSQL.Initialize("components", "id")
	prjSQL.SelectAll(Array("vmodel"), Array("vmodel"))
	prjSQL.result = db.ExecuteWait(prjSQL.query, prjSQL.args)
	prjSQL.fromJSON
	vm.setdata("components", prjSQL.result)
End Sub

Sub LoadContainers
	Dim db As BANanoSQL
	Dim prjSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	prjSQL.Initialize("components", "id")
	prjSQL.Execute("select vmodel,controltype from components where controltype in ('page','dialog','panel','container','drawer','tabs','card','footer','form','parallax') order by vmodel")
	prjSQL.Result = db.ExecuteWait(prjSQL.query, prjSQL.args)
	prjSQL.fromJSON
	'prefix the items
	Dim newList As List = vm.NewList
	
	For Each item As Map In prjSQL.result
		Dim xvmodel As String = item.getdefault("vmodel", "")
		Dim xcontroltype As String = item.getdefault("controltype", "")
		Dim itemName As String = ""
		Select Case xcontroltype
		Case "page"
			itemName = $"vm.Container"$
		Case "dialog"
			itemName = $"dlg${xvmodel}.Container"$
		Case "panel"
			itemName = $"exp${xvmodel}.Container"$
		Case "container"
			itemName = $"cont${xvmodel}.Container"$
		Case "drawer"
			itemName = $"drw${xvmodel}.Container"$
		Case "tabs"
			itemName = $"tbs${xvmodel}.Container"$
		Case "card"
			itemName = $""$
		Case "footer"
		Case "form"
		Case "parallax"
			itemName = $"prlx${xvmodel}.Container"$
		End Select
		'
		If itemName <> "" Then
			Dim ni As Map = CreateMap()
			ni.put("component", itemName)
			newList.Add(ni)
		End If
	Next
	'
	Dim ni As Map = CreateMap()
	ni.put("component", "vm")
	newList.Add(ni)
	'
	Dim ni As Map = CreateMap()
	ni.put("component", "cont")
	newList.Add(ni)
	
	'
	Dim ni As Map = CreateMap()
	ni.put("component", "vm.Container")
	newList.Add(ni)
	
	vm.setdata("containers", newList)
End Sub

Sub LoadProjects
	'"projectname","dbtype","databasename"
	Dim db As BANanoSQL
	Dim prjSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	prjSQL.Initialize("project", "id")
	prjSQL.SelectAll(Array("*"), Array("projectname"))
	prjSQL.result = db.ExecuteWait(prjSQL.query, prjSQL.args)
	prjSQL.fromJSON
	vm.setdata("projects", prjSQL.result)
End Sub

Sub btnProject_click(e As BANanoEvent)
	'hide all property bags
	ShowBag("")
	Dim prj As Map = vm.getdata("project")
	Dim pid As String = prj.getdefault("id", "")
	If pid = "" Then
		vm.ShowSnackBarError("Please select the project first!")
		Return
	End If
	vm.SetState(prj)
	'show the drawer
	drwprojectdetails.toggle
End Sub

Sub CreateProjectDrawer
	drwprojectdetails = vm.CreateDrawer("drwprojectdetails", Me)
	drwprojectdetails.AddTitleSubTitle("Project","Project Configuration")
	drwprojectdetails.Setwidth("430")
	drwprojectdetails.Setabsolute(True)
	drwprojectdetails.Setright(True)
	'
	Dim txtprojectname As VMTextField = vm.NewTextField(Me, False, "txtprojectname", "projectname", "Project Name", "", True, "", 0, "", "", 0)
	txtprojectname.SetFieldType("string")
	txtprojectname.SetOutlined(True)
	txtprojectname.SetClearable(True)
	txtprojectname.SetHideDetails(True)
	txtprojectname.SetVisible(True)
	txtprojectname.SetDense(True).AddClass("my-2")
	drwprojectdetails.Container.AddControl(txtprojectname.textfield, txtprojectname.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	'
	Dim txtsenderemail As VMTextField = vm.NewTextField(Me, False, "txtsenderemail", "senderemail", "Sender Email", "", False, "", 0, "", "", 0)
	txtsenderemail.SetFieldType("string")
	txtsenderemail.SetOutlined(True)
	txtsenderemail.SetDense(True)
	txtsenderemail.SetClearable(True)
	txtsenderemail.SetHideDetails(True)
	txtsenderemail.SetVisible(True).AddClass("my-2")
	drwprojectdetails.Container.AddControl(txtsenderemail.textfield, txtsenderemail.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim txtsendtoemail As VMTextField = vm.NewTextField(Me, False, "txtsendtoemail", "sendtoemail", "Send To", "", False, "", 0, "", "", 0)
	txtsendtoemail.SetFieldType("string")
	txtsendtoemail.SetOutlined(True)
	txtsendtoemail.SetDense(True)
	txtsendtoemail.SetClearable(True)
	txtsendtoemail.SetHideDetails(True)
	txtsendtoemail.SetVisible(True).AddClass("my-2")
	drwprojectdetails.Container.AddControl(txtsendtoemail.textfield, txtsendtoemail.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim txtccemail As VMTextField = vm.NewTextField(Me, False, "txtccemail", "ccemail", "CC To", "", False, "", 0, "", "", 0)
	txtccemail.SetFieldType("string")
	txtccemail.SetOutlined(True)
	txtccemail.SetDense(True)
	txtccemail.SetClearable(True)
	txtccemail.SetHideDetails(True)
	txtccemail.SetVisible(True).AddClass("my-2")
	drwprojectdetails.Container.AddControl(txtccemail.textfield, txtccemail.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim dbtypekeys As String = "banano,sqlite,mysql,mssql"
	Dim dbtypevalues As String = "BANanoSQL,SQLite,MySQL,MSSQL"
	Dim dbtypemap As Map = vm.keyvalues2map(",", dbtypekeys, dbtypevalues)
	Dim rddbtype As VMRadioGroup = vm.NewRadioGroup(Me, False, "rddbtype", "dbtype", "Database Type", "banano", dbtypemap, False, True, 0)
	rddbtype.SetFieldType("string")
	rddbtype.SetHideDetails(True)
	rddbtype.SetVisible(True)
	rddbtype.AddClass("my-2")
	drwprojectdetails.Container.AddControl(rddbtype.RadioGroup, rddbtype.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim txtdatabasename As VMTextField = vm.NewTextField(Me, False, "txtdatabasename", "databasename", "Database Name", "", True, "", 0, "", "", 0)
	txtdatabasename.SetFieldType("string")
	txtdatabasename.SetOutlined(True)
	txtdatabasename.SetDense(True)
	txtdatabasename.SetClearable(True)
	txtdatabasename.SetHideDetails(True)
	txtdatabasename.SetVisible(True).AddClass("my-2")
	drwprojectdetails.Container.AddControl(txtdatabasename.textfield, txtdatabasename.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim btnbtnCancelProject As VMButton = vm.NewButton(Me, False, "btnbtnCancelProject", "Cancel", True, False, False, True)
	btnbtnCancelProject.SetColorIntensity("red", "")
	btnbtnCancelProject.Setoutlined(True)
	btnbtnCancelProject.SetVisible(True)
	drwprojectdetails.Container.AddControl(btnbtnCancelProject.Button, btnbtnCancelProject.tostring, 2, 1, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim btnbtnSaveProject As VMButton = vm.NewButton(Me, False, "btnbtnSaveProject", "Save", True, False, False, True)
	btnbtnSaveProject.SetColorIntensity("green", "")
	btnbtnSaveProject.Setoutlined(True)
	btnbtnSaveProject.SetVisible(True)
	drwprojectdetails.Container.AddControl(btnbtnSaveProject.Button, btnbtnSaveProject.tostring, 2, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	vm.AddDrawer(drwprojectdetails)
End Sub

Private Sub btnbtnCancelProject_click(e As BANanoEvent)
	drwprojectdetails.hide
End Sub

Private Sub btnbtnSaveProject_click(e As BANanoEvent)
	'get the record to create/update
	Dim Record As Map = drwprojectdetails.Container.GetData
	'validate the record
	Dim bValid As Boolean = vm.Validate(Record, drwprojectdetails.Container.Required)
	'if invalid exit create/update
	If bValid = False Then
		Dim strError As String = vue.GetError
		vm.ShowSnackBar(strError)
		Return
	End If
	'
	Dim pid As String
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
		
	'add code to save the project!
	Select Case Mode
	Case "A"
		'add mode
		pid = DateTime.now
		pid = BANano.parseint(pid)
		Record.put("id", pid)
		db.OpenWait("bvmdesigner", "bvmdesigner")
		rsSQL.Initialize("project", "id")
		rsSQL.AddIntegers(Array("id"))
		rsSQL.AddStrings(Array("projectname","dbtype","databasename","components", "senderemail","sendtoemail","ccemail"))
		rsSQL.Insert1(Record)
		rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
		rsSQL.FromJSON
	Case "E"
		Dim prj As Map = vm.GetData("project")
		Dim pid As String = prj.Get("id")
		pid = BANano.parseint(pid)
		Record.put("id", pid)
		db.OpenWait("bvmdesigner", "bvmdesigner")
		rsSQL.Initialize("project", "id")
		rsSQL.AddIntegers(Array("id"))
		rsSQL.AddStrings(Array("projectname","dbtype","databasename","components", "senderemail","sendtoemail","ccemail"))
		rsSQL.Update1(Record, pid)
		rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
		rsSQL.FromJSON
	End Select
	sprojectname = Record.getdefault("projectname", "")
	sdatabasename = Record.getdefault("databasename","")
	ssenderemail = Record.getdefault("senderemail","")
	ssendtoemail = Record.getdefault("sendtoemail","")
	sccemail = Record.getdefault("ccemail","")
	vm.NavBar.UpdateTitle($"${Main.AppTitle} [${sprojectname}]"$)
	vm.SetData("project", Record)
	BANano.SetLocalStorage("project", Record)
	vm.CallMethod("LoadProjects")
	drwprojectdetails.hide
End Sub

Sub Read_Badge
	bisAvatar = YesNoToBoolean(mattr.getdefault("isavatar", "No"))
	bisBordered = YesNoToBoolean(mattr.getdefault("isbordered", "No"))
	bisbottom = YesNoToBoolean(mattr.getdefault("isbottom", "No"))
	sColor = mattr.getdefault("color", "")
	sbadgetype = mattr.getdefault("badgetype", "iscontent")
	sColorintensity = mattr.getdefault("colorintensity", "")
	sContent = mattr.getdefault("content", "")
	bisdark = YesNoToBoolean(mattr.getdefault("isdark", "No"))
	bisDisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
	bisDot = YesNoToBoolean(mattr.getdefault("isdot", "No"))
	bisInline = YesNoToBoolean(mattr.getdefault("isinline", "No"))
	bisleft = YesNoToBoolean(mattr.getdefault("isleft", "No"))
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	sOffsetx = mattr.getdefault("offsetx", "")
	sOffsety = mattr.getdefault("offsety", "")
	sorigin = mattr.getdefault("origin", "")
	bisOverlap = YesNoToBoolean(mattr.getdefault("isoverlap", "No"))
	bistile = YesNoToBoolean(mattr.getdefault("istile", "No"))
	stransition = mattr.getdefault("transition", "")
End Sub


Sub Read_Chip
	bisActive = YesNoToBoolean(mattr.getdefault("isactive", "No"))
	sactiveclass = mattr.getdefault("activeclass", "")
	bisAppend = YesNoToBoolean(mattr.getdefault("isappend", "No"))
	bisClose = YesNoToBoolean(mattr.getdefault("isclose", "No"))
	sCloseicon = mattr.getdefault("closeicon", "")
	schiptype = mattr.getdefault("chiptype","")
	sColor = mattr.getdefault("color", "")
	sColorintensity = mattr.getdefault("colorintensity", "")
	bisDisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
	bisDraggable = YesNoToBoolean(mattr.getdefault("isdraggable", "No"))
	bisExact = YesNoToBoolean(mattr.getdefault("isexact", "No"))
	bisFilter = YesNoToBoolean(mattr.getdefault("isfilter", "No"))
	shref = mattr.getdefault("href", "")
	sInputvalue = mattr.getdefault("inputvalue", "")
	bisLabel = YesNoToBoolean(mattr.getdefault("islabel", "No"))
	bisLarge = YesNoToBoolean(mattr.getdefault("islarge", "No"))
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	bisLink = YesNoToBoolean(mattr.getdefault("islink", "No"))
	bisNuxt = YesNoToBoolean(mattr.getdefault("isnuxt", "No"))
	bisoutlined = YesNoToBoolean(mattr.getdefault("isoutlined", "No"))
	bisPill = YesNoToBoolean(mattr.getdefault("ispill", "No"))
	bisReplace = YesNoToBoolean(mattr.getdefault("isreplace", "No"))
	bisRipple = YesNoToBoolean(mattr.getdefault("isripple", "No"))
	bisSmall = YesNoToBoolean(mattr.getdefault("issmall", "No"))
	stabindex = mattr.getdefault("tabindex", "")
	stag = mattr.getdefault("tag", "")
	starget = mattr.getdefault("target", "")
	stextcolor = mattr.getdefault("textcolor", "")
	sTextintensity = mattr.getdefault("textintensity", "")
	sTo = mattr.getdefault("to", "")
	bisVisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
	bisXlarge = YesNoToBoolean(mattr.getdefault("isxlarge", "No"))
	bisXsmall = YesNoToBoolean(mattr.getdefault("isxsmall", "No"))
End Sub

Sub btnLandScape_click(e As BANanoEvent)
	vm.setdata("devspace", 0)
	vm.ToggleNamedState("landscape", "Yes", "No")
	Dim sState As String = vm.getdata("landscape")
	Select Case sState
	Case "No"
		'potrait
		myiphone.SetLandScape(False)
		myipad.SetLandScape(False)
	Case "Yes"
		'landscape
		myiphone.SetLandScape(True)
		myipad.SetLandScape(True)
	End Select
End Sub

Sub btnMatrix_click(e As BANanoEvent)
	vm.ToggleNamedState("showmatrix", "Yes", "No")
	CreateUX
End Sub
	
Sub btnBorder_click(e As BANanoEvent)
	vm.togglenamedstate("hasborder", "Yes", "No")
	CreateUX	
End Sub

Sub btnmac_click(e As BANanoEvent)
	vm.setdata("devspace", 0)
	mymac.Show
	myipad.hide
	myiphone.hide
End Sub

Sub btnipad_click(e As BANanoEvent)
	vm.setdata("devspace", 0)
	mymac.hide
	myipad.show
	myiphone.hide
End Sub

Sub btniphone_click(e As BANanoEvent)
	vm.setdata("devspace", 0)
	mymac.hide
	myipad.hide
	myiphone.show
End Sub
	

Sub YesNoToBoolean(xvalue As String) As Boolean
	Select Case xvalue
		Case "Yes","yes"
			Return True
		Case Else
			Return False
	End Select
End Sub

Sub CreateUX
	sbRead.initialize
	bShowMatrix = YesNoToBoolean(vm.getdata("showmatrix"))
	bHasBorder = YesNoToBoolean(vm.getdata("hasborder"))
	
	Dim prj As Map = vm.getdata("project")
	Dim pid As String = prj.getdefault("id", "")
	sprojectname = prj.getdefault("projectname", "")
	sdbtype = prj.getdefault("dbtype", "")
	sdatabasename = prj.getdefault("databasename", "")
	ssenderemail = prj.getdefault("senderemail","")
	ssendtoemail = prj.getdefault("sendtoemail","")
	sccemail = prj.getdefault("ccemail","")
	
	Select Case sdbtype
	Case "banano"
		rsType = "BANanoAlaSQLE"
	Case "sqlite"
		rsType = "BANanoSQLiteE"
		If sdatabasename.endswith(".db") = False Then sdatabasename = $"${sdatabasename}.db"$
	Case "mysql"
		rsType = "BANanoMySQLE"
	Case "mssql"
		rsType = "BANanoMSSQLE"
	End Select
	
	vm.pagepause
	'clear components
	vm.setdata("myux", vm.Newlist)
	'clear source code for the schema
	dbCode.SetCode("")
	vm.CallMethod("LoadContainers")
	'
	Dim db As BANanoSQL
	Dim gridSQL As BANanoAlaSQLE
	Dim compSQL As BANanoAlaSQLE
	''start with the grid
	db.OpenWait("bvmdesigner", "bvmdesigner")
	
	gridSQL.Initialize("grid", "id")
	gridSQL.SelectAll(Array("*"), Array("id"))
	gridSQL.result = db.ExecuteWait(gridSQL.query, gridSQL.args)
	gridSQL.FromJSON
	'
	'add the components
	compSQL.Initialize("components", "id")
	compSQL.SelectAll(Array("*"), Array("row","col"))
	compSQL.result = db.ExecuteWait(compSQL.query, compSQL.args)
	compSQL.FromJSON
	'update components
	vm.setdata("myux", compSQL.result)
	
	sb.initialize
	'
	Dim trimPRJ As String = sprojectname.replace(" ","")
	trimPRJ = trimPRJ.trim
	trimPRJ = trimPRJ.tolowercase
	'
	AddComment(sb, "INSTRUCTIONS: Copy the 5. Template1 folder to a new folder")
	AddComment(sb, $"INSTRUCTION: Rename the new folder to "${sprojectname}""$)
	AddComment(sb, $"INSTRUCTION: Open the folder and rename the .b4j file to "${trimPRJ}.b4j""$)
	'Template1.b4j.meta
	AddComment(sb, $"INSTRUCTION: Delete the "Template1.b4j.meta" file from the folder"$)
	AddComment(sb, $"INSTRUCTION: Double click the "${trimPRJ}.b4j" file to open B4J"$)
	AddComment(sb, $"INSTRUCTION: In the Main module on Line 8, replace the "template" for AppName to be "${trimPRJ}""$)
	AddComment(sb, $"INSTRUCTION: In the Main module on Line 9, replace the "template" for AppTitle to be "${sprojectname}""$)
	'
	Select Case sdbtype
	Case "banano"
		AddComment(sb, $"INSTRUCTION: Delete the config.php file in the Files tab of the B4J project, leave this if you will connect to other databases"$)
		AddComment(sb, $"INSTRUCTION: You will need to run your app and stop it, open the Files tab and click Sync and then run your app again for alasql.js to load!"$)
	Case Else
		AddComment(sb, $"INSTRUCTION: Comment out line 13 & 14"$)
	End Select
	AddComment(sb, $"INSTRUCTION: Update your version on line 15"$)
	AddComment(sb, $"INSTRUCTION: Update your Port number on line 16"$)
	
	
	AddComment(sb, "INSTRUCTION: In your B4J project, click Project > Add New Module > Code Module")
	AddComment(sb, $"INSTRUCTION: Type the name of <Your Module> as the module name and click Ok"$)
	AddInstruction(sb, "<Your Module>", "", "in appropriate sections")
	AddNewLine(sb)
	
	sbEvents.initialize
	'
	'make it a div
	ui = vm.CreateContainer("ui", Me).SetTag("div")
	ui.SetDesignMode(True)
	ui.ShowMatrix = bShowMatrix
	ui.HasBorder = bHasBorder
	'
	Design_Grid(gridSQL)
	
	For Each rec As Map In compSQL.result
		controltype = rec.get("controltype")
		srow = rec.getdefault("row","1")
		If srow = "" Then srow = "1"
		srow = BANano.parseint(srow)
		scol = rec.getdefault("col","1")
		If scol = "" Then scol = "1"
		scol = BANano.parseint(scol)
		stabindex = rec.getdefault("tabindex","0")
		If stabindex = "" Then stabindex = "0"
		stabindex = BANano.parseint(stabindex)
		sname = rec.get("name")
		svmodel = rec.get("vmodel")
		sattributes = rec.get("attributes")
		sstyles = rec.get("styles")
		sclasses = rec.get("classes")
		sloose = rec.get("loose")
		stitle = rec.get("label")
		jcontents = rec.getdefault("items", "")
		If jcontents = "" Then
			lcontents.initialize
		Else
			lcontents = BANano.fromjson(jcontents)
		End If	
		' get the attributes
		mattr = BANano.FromJson(sattributes)
		os = mattr.get("offsetsmall")
		om = mattr.get("offsetmedium")
		ol = mattr.get("offsetlarge")
		ox = mattr.get("offsetxlarge")
		'
		ss = mattr.get("sizesmall")
		sm = mattr.get("sizemedium")
		sl = mattr.get("sizelarge")
		sx = mattr.get("sizexlarge")
		'
		sfloat = mattr.getdefault("float", "")
		sparent = mattr.getdefault("parent", "vm.Container")
		splaceholder = mattr.getdefault("placeholder", "")
		bisrequired = YesNoToBoolean(mattr.getdefault("isrequired", "No"))
		siconname = mattr.GetDefault("iconname", "")
		shelpertext = mattr.getdefault("helpertext", "")
		serrortext = mattr.getdefault("errortext", "")
		imaxlen = mattr.getdefault("maxlength", "0")
		sfieldtype = mattr.getdefault("fieldtype", "string")
		If imaxlen = "" Then imaxlen = "0"
		imaxlen = BANano.parseint(imaxlen)
		bautogrow = YesNoToBoolean(mattr.getdefault("isautogrow", "No"))
		svalue = mattr.getdefault("value", "")
		bisdivider = YesNoToBoolean(mattr.getdefault("isdivider", "No"))
		bisPrimary = YesNoToBoolean(mattr.getdefault("isprimary", "No"))
		bisVisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
		bisDisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
		bisitemdiv = YesNoToBoolean(mattr.getdefault("isitemdiv", "No"))
		bisitemnogutter = YesNoToBoolean(mattr.GetDefault("isitemnogutter", "No"))
		bontable = YesNoToBoolean(mattr.getdefault("ontable", "No"))
		bisdark = YesNoToBoolean(mattr.getdefault("isdark", "No"))
		bisnow = YesNoToBoolean(mattr.getdefault("isnow", "No"))
		bisupdatable = YesNoToBoolean(mattr.getdefault("isupdatable", "No"))
		sdialogpage = mattr.getdefault("dialogpage", "")
		sclickaction = mattr.getdefault("clickaction","")
		siconpos = mattr.getdefault("iconpos", "left")
		sbuttontype = mattr.getdefault("buttontype", "normal")
		smatchto = mattr.getdefault("matchto", "")
		sdonotmatchto = mattr.getdefault("donotmatchto", "")
		bisdatenow = YesNoToBoolean(mattr.getdefault("isdatenow", "No"))
		bistimenow = YesNoToBoolean(mattr.getdefault("istimenow", "No"))
		bisdatetimenow = YesNoToBoolean(mattr.getdefault("isdatetimenow", "No"))
		bisreadonly = YesNoToBoolean(mattr.getdefault("isreadonly", "No"))
		bisupload = YesNoToBoolean(mattr.getdefault("isupload", "No"))
		saccept = mattr.getdefault("accept", "")
		sfilenamevmodel = mattr.getdefault("filenamevmodel", "")
		sfiledatevmodel = mattr.getdefault("filedatevmodel", "")
		sfilesizevmodel = mattr.getdefault("filesizevmodel", "")
		sfiletypevmodel = mattr.getdefault("filetypevmodel", "")	
		'margins and padding
		
		smargintop = mattr.getdefault("margintop", "")
		smarginbottom = mattr.getdefault("marginbottom", "")
		smarginleft = mattr.getdefault("marginleft", "")
		smarginright = mattr.getdefault("marginright", "")
		smargins = mattr.getdefault("margins", "")
		smargine = mattr.getdefault("margine", "")
		smarginx = mattr.getdefault("marginx", "")
		smarginy = mattr.getdefault("marginy", "")
		smargina = mattr.getdefault("margina", "")
		spaddingtop = mattr.getdefault("paddingtop", "")
		spaddingbottom = mattr.getdefault("paddingbottom", "")
		spaddingleft = mattr.getdefault("paddingleft", "")
		spaddingright = mattr.getdefault("paddingright", "")
		spaddings = mattr.getdefault("paddings", "")
		spaddinge = mattr.getdefault("paddinge", "")
		spaddingx = mattr.getdefault("paddingx", "")
		spaddingy = mattr.getdefault("paddingy", "")
		spaddinga = mattr.getdefault("paddinga", "")
		'
		bisautofocus = YesNoToBoolean(mattr.getdefault("isautofocus", "No"))
		bissolo = YesNoToBoolean(mattr.getdefault("issolo", "No"))
		bisoutlined = YesNoToBoolean(mattr.getdefault("isoutlined", "No"))
		bisfilled = YesNoToBoolean(mattr.getdefault("isfilled", "No"))
		bisdense = YesNoToBoolean(mattr.getdefault("isdense", "No"))
		bissingleline = YesNoToBoolean(mattr.getdefault("issingleline", "No"))
		bispersistenthint = YesNoToBoolean(mattr.getdefault("ispersistenthint", "No"))
		bisshaped = YesNoToBoolean(mattr.getdefault("isshaped", "No"))
		bisloading = YesNoToBoolean(mattr.getdefault("isloading", "No"))
		bisflat = YesNoToBoolean(mattr.getdefault("isflat", "No"))
		bisrounded = YesNoToBoolean(mattr.getdefault("isrounded", "No"))
		bclearable = YesNoToBoolean(mattr.getdefault("isclearable", "No"))
		bishidedetails = YesNoToBoolean(mattr.getdefault("ishidedetails", "No"))
		bToggle = YesNoToBoolean(mattr.getdefault("istoggle", "No"))
		bcenteronparent = YesNoToBoolean(mattr.getdefault("centeronparent", "No"))
		bisHamburgervisible = YesNoToBoolean(mattr.getdefault("ishamburgervisible", "No"))
		'
		struevalue = mattr.getdefault("truevalue", "")
		sfalsevalue = mattr.GetDefault("falsevalue", "")
		bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
		bismultiple = YesNoToBoolean(mattr.getdefault("ismultiple", "No"))
		bisinset = YesNoToBoolean(mattr.getdefault("isinset", "No"))
		bisindeterminate = YesNoToBoolean(mattr.getdefault("isindeterminate", "No"))
		bisitalic = YesNoToBoolean(mattr.getdefault("isitalic", "No"))
		'
		bfitwidth = YesNoToBoolean(mattr.getdefault("isfitwidth", "No"))
		shref = mattr.getdefault("href","")
		starget = mattr.getdefault("target","")
		sTo = mattr.getdefault("to","")
		bistext = YesNoToBoolean(mattr.getdefault("istext", "No"))
		bisdepressed = YesNoToBoolean(mattr.getdefault("isdepressed", "No"))
		bistile = YesNoToBoolean(mattr.getdefault("istile", "No"))
		ssize = mattr.GetDefault("size", "")
		sswitchloading = mattr.getdefault("switchloading","")
		'
		swidth = mattr.getdefault("width", "")
		sheight = mattr.getdefault("height", "")
		sminwidth = mattr.getdefault("minwidth", "")
		sminheight = mattr.getdefault("minheight", "")
		smaxwidth = mattr.getdefault("maxwidth", "")
		smaxheight = mattr.getdefault("maxheight", "")
		'
		stooltip = mattr.getdefault("tooltip", "")
		sColor = mattr.getdefault("color","")
		sintensity = mattr.getdefault("intensity","")
		If sColor = "undefined" Then sColor = ""
		If sColor = "none" Then sColor = ""
		If sintensity = "undefined" Then sintensity = ""
		If sintensity = "none" Then sintensity = ""
		'
		stextcolor = mattr.getdefault("textcolor", "")
		stextintensity = mattr.getdefault("textintensity", "")
		If stextcolor = "undefined" Then stextcolor = ""
		If stextcolor = "none" Then stextcolor = ""
		If stextintensity = "undefined" Then stextintensity = ""
		If stextintensity = "none" Then stextintensity = ""
		'
		ssrc = mattr.getdefault("src", "")
		slazysrc = mattr.getdefault("lazysrc", "")
		salt = mattr.getdefault("alt","")
		sborderradius = mattr.getdefault("borderradius","")
		sborderwidth = mattr.getdefault("borderwidth","")
		sbordercolor = mattr.getdefault("bordercolor", "")
		sborderstyle = mattr.getdefault("borderstyle", "")
		saspectratio = mattr.getdefault("aspectratio", "")
		'
		'
		ssourcefield = mattr.getdefault("sourcefield", "id")
		ssourcetable = mattr.getdefault("sourcetable", "datasource")
		sdisplayfield = mattr.getdefault("displayfield", "text")
		skeys = mattr.getdefault("keys", "")
		svalues = mattr.getdefault("values", "")
		bisreturnobject = YesNoToBoolean(mattr.getdefault("isreturnobject", "No"))
		buseoptions = YesNoToBoolean(mattr.getdefault("useoptions", "No"))
		bischips = YesNoToBoolean(mattr.getdefault("ischips", "No"))
		bissmallchips = YesNoToBoolean(mattr.getdefault("issmallchips", "No"))
		bisdeletablechips = YesNoToBoolean(mattr.getdefault("isdeletablechips", "No"))
		'
		bshowlabel = YesNoToBoolean(mattr.getdefault("showlabel", "No"))
		blabelontop = YesNoToBoolean(mattr.getdefault("labelontop", "No"))
		bismandatory = YesNoToBoolean(mattr.getdefault("ismandatory", "No"))
		'
		bisrange = YesNoToBoolean(mattr.getdefault("isrange", "No"))
		bisshowweek = YesNoToBoolean(mattr.getdefault("isshowweek", "No"))
		bisampm = YesNoToBoolean(mattr.getdefault("isampm", "No"))
		bisnotitle = YesNoToBoolean(mattr.getdefault("isnotitle", "No"))
		bisuseseconds = YesNoToBoolean(mattr.getdefault("isuseseconds", "No"))
		'
		sfirstdayofweek = mattr.GetDefault("firstdayofweek", "0")
		stformat = mattr.getdefault("tformat", "ampm")
		'sheadercolor = mattr.getdefault("headercolor", "")
		'sheaderintensity = mattr.getdefault("headerintensity", "")
		selevation = mattr.getdefault("elevation", "")
		stransition = mattr.getdefault("transition", "")
		bisfluid = YesNoToBoolean(mattr.getdefault("isfluid", "No"))
		bisshowmatrix = YesNoToBoolean(mattr.getdefault("isshowmatrix", "No"))
		bisnogutters = YesNoToBoolean(mattr.getdefault("isnogutters", "No"))
		shashtype = mattr.getdefault("hashtype", "")
		salg = mattr.getdefault("alg", "")
		'
		bStatic = False
		'
		Select Case controltype
			Case "page"
				Read_Page
				Design_Page
			Case "builder"
				Read_Builder
				Design_Builder
			Case "panel"
				Read_ExpansionPanels
				Design_ExpansionPanels
			Case "stepper"
				Read_Stepper
				Design_Stepper
			Case "tabs"
				Read_Tabs
				Design_Tabs
			Case "list"
				Read_List
				Design_List
			Case "avatar"
				Read_Avatar
				Design_Avatar
			Case "badge"
				Read_Badge
				Design_Badge
			Case "chip"
				Read_Chip
				Design_Chip
			Case "table"
				Read_Table
				Design_Table
			Case "rating"
				Read_Rating
				Design_Rating
			Case "speeddial"
				Read_SpeedDial
				Design_SpeedDial
			Case "dialog"
				Read_Dialog
				Design_Dialog
			Case "carousel"
				Read_Carousel
				Design_Carousel
			Case "drawer"
				Read_Drawer
				Design_Drawer
			Case "menu"
				Read_Menu
				Design_Menu
			Case "toolbar", "appbar", "systembar"
				Read_Toolbar
				Design_ToolBar
			Case "container"
				Design_Container
			Case "parallax"
				Design_Parallax
			Case "text"
				Design_TextField
			Case "textarea"
				Design_TextArea
			Case "switch"
				Design_Switch
			Case "checkbox"
				Design_CheckBox
			Case "date"
				Design_Date
			Case "file"
				Design_File
			Case "radio"
				Design_Radio
			Case "select","auto", "combo"
				Design_Select
			Case "slider"
				Read_Slider
				Design_Slider
			Case "label"
				Read_Label
				Design_Label
			Case "email"
				Design_Email
			Case "password"
				Design_Password
			Case "tel"
				Design_Tel
			Case "time"
				Design_Time
			Case "icon"
				Design_Icon
			Case "profile", "image"
				Design_Image
			Case "button"
				Design_Button
			Case "infobox"
				Read_InfoBox
				Design_InfoBox
			Case "quill"
				Read_Quill
				Design_Quill
			Case "fileselect"
				Read_FileSelect
				Design_FileSelect			
		End Select
	Next
	'
	If sbRead.Length > 0 Then
		AddNewLine(sb)
		AddInstruction(sb, "<Your Module>", "", "in case you need this!")
		sb.Append(sbRead.tostring)
		AddNewLine(sb)
	End If
	'
	'update with events
	sb.append(sbEvents.tostring)
	'
	Dim html As String = ui.tostring
	
	Dim shtml As String = vm.BeautifySourceCode("html", html)
	'save grid source code
	BANano.SetSessionStorage("sourcecode", sb.tostring)
	BANano.SetSessionStorage("html", shtml)
	'
	pc.SetCode(sb.tostring)
	htm.setcode(shtml)
	'
	mymac.SetContent(html)
	myipad.SetContent(html)
	myiphone.SetContent(html)
	'
	'mymac.SetStatic(html)
	'myipad.SetStatic(html)
	'myiphone.SetStatic(html)
	
	'
	vm.pageresume
End Sub


Sub Read_Label
	'read label
	biscaption = YesNoToBoolean(mattr.getdefault("iscaption", "No"))
	bisDisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
	bisdisplay1 = YesNoToBoolean(mattr.getdefault("isdisplay1", "No"))
	bisdisplay2 = YesNoToBoolean(mattr.getdefault("isdisplay2", "No"))
	bisdisplay3 = YesNoToBoolean(mattr.getdefault("isdisplay3", "No"))
	bisdisplay4 = YesNoToBoolean(mattr.getdefault("isdisplay4", "No"))
	bisheadline = YesNoToBoolean(mattr.getdefault("isheadline", "No"))
	bisitalic = YesNoToBoolean(mattr.getdefault("isitalic", "No"))
	bisoverline = YesNoToBoolean(mattr.getdefault("isoverline", "No"))
	bisrequired = YesNoToBoolean(mattr.getdefault("isrequired", "No"))
	bissubtitle1 = YesNoToBoolean(mattr.getdefault("issubtitle1", "No"))
	bissubtitle2 = YesNoToBoolean(mattr.getdefault("issubtitle2", "No"))
	bistextcapitalize = YesNoToBoolean(mattr.getdefault("istextcapitalize", "No"))
	bistextlowercase = YesNoToBoolean(mattr.getdefault("istextlowercase", "No"))
	bistextuppercase = YesNoToBoolean(mattr.getdefault("istextuppercase", "No"))
	bistitle = YesNoToBoolean(mattr.getdefault("istitle", "No"))
End Sub

Sub Read_Slider
	bisvertical = YesNoToBoolean(mattr.getdefault("isvertical", "No"))
	bisthumbalways = YesNoToBoolean(mattr.getdefault("isthumbalways", "No"))
	bisthumblabel = YesNoToBoolean(mattr.getdefault("isthumblabel", "No"))
	sminvalue = mattr.getdefault("minvalue", "0")
	sslidervalue = mattr.getdefault("slidervalue", "20")
	sstepvalue = mattr.getdefault("stepvalue","1")
	smaxvalue = mattr.getdefault("maxvalue", "100")
	sprependicon = mattr.getdefault("prependicon", "")
	sappendicon = mattr.getdefault("appendicon","")
	sthumbsize = mattr.getdefault("thumbsize","32")
	sthumbcolor = mattr.getdefault("thumbcolor", "")
	sthumbintensity = mattr.getdefault("thumbintensity", "")
	strackcolor = mattr.GetDefault("trackcolor", "")
	strackintensity = mattr.getdefault("trackintensity","")
End Sub


Sub Read_Toolbar
	sextensionheight = mattr.getdefault("extensionheight", "")
	sscrolltarget = mattr.getdefault("scrolltarget", "")
	sscrollthreshold = mattr.getdefault("scrollthreshold", "")
	slogourl = mattr.getdefault("logourl", "")
	stitleclass = mattr.getdefault("titleclass", "")
	sbartype = mattr.getdefault("bartype","tool")
	slogowidth = mattr.getdefault("logowidth", "46px")
	slogoheight = mattr.getdefault("logoheight","46px")
	bishamburger = YesNoToBoolean(mattr.getdefault("ishamburger", "No"))
	biscurrent = YesNoToBoolean(mattr.getdefault("iscurrent", "No"))
	bisflat = YesNoToBoolean(mattr.getdefault("isflat","No"))
	bisabsolute = YesNoToBoolean(mattr.getdefault("isabsolute", "No"))
	bisclippedleft = YesNoToBoolean(mattr.getdefault("isclippedleft", "No"))
	bisclippedright = YesNoToBoolean(mattr.getdefault("isclippedright", "No"))
	bisclippedleft = YesNoToBoolean(mattr.getdefault("isclippedleft", "No"))
	biscollapse = YesNoToBoolean(mattr.getdefault("iscollapse", "No"))
	biscollapseonscroll = YesNoToBoolean(mattr.getdefault("iscollapseonscroll", "No"))
	biselevateonscroll = YesNoToBoolean(mattr.getdefault("iselevateonscroll", "No"))
	bisextended = YesNoToBoolean(mattr.getdefault("isextended", "No"))
	bisfadeimageonscroll = YesNoToBoolean(mattr.getdefault("isfadeimageonscroll", "No"))
	bisfixed = YesNoToBoolean(mattr.getdefault("isfixed", "No"))
	bisfloating = YesNoToBoolean(mattr.getdefault("isfloating", "No"))
	bishideonscroll = YesNoToBoolean(mattr.getdefault("ishideonscroll", "No"))
	bisinvertedscroll = YesNoToBoolean(mattr.getdefault("isinvertedscroll", "No"))
	bisprominent = YesNoToBoolean(mattr.getdefault("isprominent", "No"))
	bisscrolloffscreen = YesNoToBoolean(mattr.getdefault("isscrolloffscreen", "No"))
	bisshort = YesNoToBoolean(mattr.getdefault("isshort", "No"))
	bisshrinkonscroll = YesNoToBoolean(mattr.getdefault("isshrinkonscroll", "No"))
	bislogovisible = YesNoToBoolean(mattr.getdefault("islogovisible", "No"))
	bisspacer = YesNoToBoolean(mattr.getdefault("isspacer", "No"))
	ssearchkey = mattr.getdefault("searchkey", "")
	stoolbarsubtitle = mattr.getdefault("toolbarsubtitle", "")
	bistitle = YesNoToBoolean(mattr.getdefault("istitle", "No"))
	bissubtitle = YesNoToBoolean(mattr.getdefault("issubtitle", "No"))
	bissearch = YesNoToBoolean(mattr.getdefault("issearch", "No"))
End Sub

Sub Read_Carousel
	sactiveclass = mattr.getdefault("activeclass", "")
	sdelimitericon = mattr.getdefault("delimitericon", "")
	sheight = mattr.getdefault("height", "")
	sinterval = mattr.getdefault("interval", "")
	smmax = mattr.getdefault("mmax", "")
	sprogresscolor = mattr.getdefault("progresscolor", "")
	sprogresscolorintensity = mattr.getdefault("progresscolorintensity", "")
	'
	If sprogresscolor = "undefined" Then sprogresscolor = ""
	If sprogresscolor = "none" Then sprogresscolor = ""
	
	sverticaldelimiter = mattr.getdefault("verticaldelimiter", "")
	'
	biscontinuous = YesNoToBoolean(mattr.getdefault("iscontinuous", "No"))
	biscycle = YesNoToBoolean(mattr.getdefault("iscycle", "No"))
	bishidedelimiterbackground = YesNoToBoolean(mattr.getdefault("ishidedelimiterbackground", "No"))
	bishidedelimiters = YesNoToBoolean(mattr.getdefault("ishidedelimiters", "No"))
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	bismandatory = YesNoToBoolean(mattr.getdefault("ismandatory", "No"))
	bismultiple = YesNoToBoolean(mattr.getdefault("ismultiple", "No"))
	bisnexticon = YesNoToBoolean(mattr.getdefault("isnexticon", "No"))
	bisprevicon = YesNoToBoolean(mattr.getdefault("isprevicon", "No"))
	bisprogress = YesNoToBoolean(mattr.getdefault("isprogress", "No"))
	bisreverse = YesNoToBoolean(mattr.getdefault("isreverse", "No"))
	bisshowarrows = YesNoToBoolean(mattr.getdefault("isshowarrows", "No"))
	bisshowarrowsonhover = YesNoToBoolean(mattr.getdefault("isshowarrowsonhover", "No"))
	bistouchless = YesNoToBoolean(mattr.getdefault("istouchless", "No"))
	bisvertical = YesNoToBoolean(mattr.getdefault("isvertical", "No"))
End Sub


Sub Read_Drawer
	sColor = mattr.getdefault("color", "")
	If sColor = "undefined" Then sColor = ""
	If sColor = "none" Then sColor = ""
	sintensity = mattr.getdefault("intensity","")
	sheight = mattr.getdefault("height", "")
	sminivariantwidth = mattr.getdefault("minivariantwidth", "")
	smobilebreakpoint = mattr.getdefault("mobilebreakpoint", "")
	soverlaycolor = mattr.getdefault("overlaycolor", "")
	soverlayopacity = mattr.getdefault("overlayopacity", "")
	If soverlaycolor = "undefined" Then soverlaycolor = ""
	If soverlaycolor = "none" Then soverlaycolor = ""
	stabindex = mattr.getdefault("tabindex", "")
	stag = mattr.getdefault("tag", "")
	swidth = mattr.getdefault("width", "")
	smtitle = mattr.getdefault("mtitle", "")
	smsubtitle = mattr.getdefault("msubtitle", "")
	'
	bisabsolute = YesNoToBoolean(mattr.getdefault("isabsolute", "No"))
	bisapp = YesNoToBoolean(mattr.getdefault("isapp", "No"))
	bisbottom = YesNoToBoolean(mattr.getdefault("isbottom", "No"))
	bisclipped = YesNoToBoolean(mattr.getdefault("isclipped", "No"))
	bisdisableresizewatcher = YesNoToBoolean(mattr.getdefault("isdisableresizewatcher", "No"))
	bisdisableroutewatcher = YesNoToBoolean(mattr.getdefault("isdisableroutewatcher", "No"))
	bisexpandonhover = YesNoToBoolean(mattr.getdefault("isexpandonhover", "No"))
	bisfixed = YesNoToBoolean(mattr.getdefault("isfixed", "No"))
	bisfloating = YesNoToBoolean(mattr.getdefault("isfloating", "No"))
	bishideoverlay = YesNoToBoolean(mattr.getdefault("ishideoverlay", "No"))
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	bismini = YesNoToBoolean(mattr.getdefault("ismini", "No"))
	bisminivariant = YesNoToBoolean(mattr.getdefault("isminivariant", "No"))
	bispermanent = YesNoToBoolean(mattr.getdefault("ispermanent", "No"))
	bisright = YesNoToBoolean(mattr.getdefault("isright", "No"))
	bisslotappend = YesNoToBoolean(mattr.getdefault("isslotappend", "No"))
	bisslotimg = YesNoToBoolean(mattr.getdefault("isslotimg", "No"))
	bisstateless = YesNoToBoolean(mattr.getdefault("isstateless", "No"))
	bistemporary = YesNoToBoolean(mattr.getdefault("istemporary", "No"))
	bistouchless = YesNoToBoolean(mattr.getdefault("istouchless", "No"))
	bisinset = YesNoToBoolean(mattr.getdefault("isinset", "No"))
	bismasterdrawer = YesNoToBoolean(mattr.getdefault("ismasterdrawer", "No"))
	'
	sDatasource = mattr.getdefault("datasource", "")
	sKeyfld = mattr.getdefault("keyfld", "")
	sAvatarfld = mattr.getdefault("avatarfld", "")
	sIconfld = mattr.getdefault("iconfld", "")
	sIconcolorfld = mattr.getdefault("iconcolorfld", "")
	sTitlefld = mattr.getdefault("titlefld", "")
	sSubtitlefld = mattr.getdefault("subtitlefld", "")
	sSubtitle1fld = mattr.getdefault("subtitle1fld", "")
	sActioniconfld = mattr.getdefault("actioniconfld", "")
	sActioniconcolorfld = mattr.getdefault("actioniconcolorfld", "")
End Sub

Sub Read_Menu
	bisabsolute = YesNoToBoolean(mattr.getdefault("isabsolute", "No"))
	bisallowoverflow = YesNoToBoolean(mattr.getdefault("isallowoverflow", "No"))
	bisauto = YesNoToBoolean(mattr.getdefault("isauto", "No"))
	bisbottom = YesNoToBoolean(mattr.getdefault("isbottom", "No"))
	biscloseonclick = YesNoToBoolean(mattr.getdefault("iscloseonclick", "No"))
	biscloseoncontentclick = YesNoToBoolean(mattr.getdefault("iscloseoncontentclick", "No"))
	bisdisablekeys = YesNoToBoolean(mattr.getdefault("isdisablekeys", "No"))
	bisdisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
	biseager = YesNoToBoolean(mattr.getdefault("iseager", "No"))
	bisfixed = YesNoToBoolean(mattr.getdefault("isfixed", "No"))
	bisinternalactivator = YesNoToBoolean(mattr.getdefault("isinternalactivator", "No"))
	bisleft = YesNoToBoolean(mattr.getdefault("isleft", "No"))
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	bisoffsetoverflow = YesNoToBoolean(mattr.getdefault("isoffsetoverflow", "No"))
	bisoffsetx = YesNoToBoolean(mattr.getdefault("isoffsetx", "No"))
	bisoffsety = YesNoToBoolean(mattr.getdefault("isoffsety", "No"))
	bisopenonclick = YesNoToBoolean(mattr.getdefault("isopenonclick", "No"))
	bisopenonhover = YesNoToBoolean(mattr.getdefault("isopenonhover", "No"))
	bisright = YesNoToBoolean(mattr.getdefault("isright", "No"))
	bisslotactivator = YesNoToBoolean(mattr.getdefault("isslotactivator", "No"))
	bistop = YesNoToBoolean(mattr.getdefault("istop", "No"))
	'
	'menu
	menutype = mattr.getdefault("menutype","")
	sactivator = mattr.getdefault("activator", "")
	sclosedelay = mattr.getdefault("closedelay", "")
	scontentclass = mattr.getdefault("contentclass", "")
	siconname = mattr.getdefault("iconname", "")
	smaxheight = mattr.getdefault("maxheight", "")
	smaxwidth = mattr.getdefault("maxwidth", "")
	sminwidth = mattr.getdefault("minwidth", "")
	snudgebottom = mattr.getdefault("nudgebottom", "")
	snudgeleft = mattr.getdefault("nudgeleft", "")
	snudgeright = mattr.getdefault("nudgeright", "")
	snudgetop = mattr.getdefault("nudgetop", "")
	snudgewidth = mattr.getdefault("nudgewidth", "")
	sopendelay = mattr.getdefault("opendelay", "")
	sorigin = mattr.getdefault("origin", "")
	spositionx = mattr.getdefault("positionx", "")
	spositiony = mattr.getdefault("positiony", "")
	sreturnvalue = mattr.getdefault("returnvalue", "")
	stransition = mattr.getdefault("transition", "")
End Sub

Sub Design_Grid(gridSQL As BANanoAlaSQLE)
	For Each rec As Map In gridSQL.result
		Dim controltype As String = rec.get("controltype")
		Select Case controltype
			Case "row"
				ui.AddRows(1)
				sb.append($".Container.AddRows(1)"$).append(CRLF)
			Case "col1"
				ui.AddColumns(1,1,1,1,1)
				sb.append($".Container.AddColumns(1,1,1,1,1)"$).append(CRLF)
			Case "col2"
				ui.AddColumns(1,2,2,2,2)
				sb.append($".Container.AddColumns(1,2,2,2,2)"$).append(CRLF)
			Case "col3"
				ui.AddColumns(1,3,3,3,3)
				sb.append($".Container.AddColumns(1,3,3,3,3)"$).append(CRLF)
			Case "col4"
				ui.AddColumns(1,4,4,4,4)
				sb.append($".Container.AddColumns(1,4,4,4,4)"$).append(CRLF)
			Case "col5"
				ui.AddColumns(1,5,5,5,5)
				sb.append($".Container.AddColumns(1,5,5,5,5)"$).append(CRLF)
			Case "col6"
				ui.AddColumns(1,6,6,6,6)
				sb.append($".Container.AddColumns(1,6,6,6,6)"$).append(CRLF)
			Case "col7"
				ui.AddColumns(1,7,7,7,7)
				sb.append($".Container.AddColumns(1,7,7,7,7)"$).append(CRLF)
			Case "col8"
				ui.AddColumns(1,8,8,8,8)
				sb.append($".Container.AddColumns(1,8,8,8,8)"$).append(CRLF)
			Case "col9"
				ui.AddColumns(1,9,9,9,9)
				sb.append($".Container.AddColumns(1,9,9,9,9)"$).append(CRLF)
			Case "col10"
				ui.AddColumns(1,10,10,10,10)
				sb.append($".Container.AddColumns(1,10,10,10,10)"$).append(CRLF)
			Case "col11"
				ui.AddColumns(1,11,11,11,11)
				sb.append($".Container.AddColumns(1,11,11,11,11)"$).append(CRLF)
			Case "col12"
				ui.AddColumns(1,12,12,12,12)
				sb.append($".Container.AddColumns(1,12,12,12,12)"$).append(CRLF)
			Case "rc1p11"
				ui.AddRows(1).AddColumns1p11
				sb.append($".Container.AddRows(1).AddColumns1p11"$).append(CRLF)
			Case "rc4p8"
				ui.AddRows(1).AddColumns4P8
				sb.append($".Container.AddRows(1).AddColumns4P8"$).append(CRLF)
			Case "rc3p9"
				ui.AddRows(1).AddColumns3P9
				sb.append($".Container.AddRows(1).AddColumns3P9"$).append(CRLF)
			Case "rc12"
				ui.AddRows(1).AddColumns12
				sb.append($".Container.AddRows(1).AddColumns12"$).append(CRLF)
			Case "rc6x2"
				ui.AddRows(1).AddColumns6x2
				sb.append($".Container.AddRows(1).AddColumns6x2"$).append(CRLF)
			Case "rc12x1"
				ui.AddRows(1).AddColumns12x1
				sb.append($".Container.AddRows(1).AddColumns12x1"$).append(CRLF)
			Case "rc2x6"
				ui.AddRows(1).AddColumns2x6
				sb.append($".Container.AddRows(1).AddColumns2x6"$).append(CRLF)
			Case "rc4x3"
				ui.AddRows(1).AddColumns4x3
				sb.append($".Container.AddRows(1).AddColumns4x3"$).append(CRLF)
			Case "rc3x4"
				ui.AddRows(1).AddColumns3X4
				sb.append($".Container.AddRows(1).AddColumns3X4"$).append(CRLF)
			Case "rc5p7"
				ui.AddRows(1).AddColumns5p7
				sb.append($".Container.AddRows(1).AddColumns5p7"$).append(CRLF)
			Case "rc7p5"
				ui.AddROws(1).AddCOlumns7p5
				sb.append($".Container.AddROws(1).AddCOlumns7p5"$).append(CRLF)
			Case "rc8p4"
				ui.AddRows(1).AddColumns8p4
				sb.append($".Container.AddRows(1).AddColumns8p4"$).append(CRLF)
			Case "rc9p3"
				ui.AddRows(1).AddColumns9p3
				sb.append($".Container.AddRows(1).AddColumns9p3"$).append(CRLF)
			Case "rc10p2"
				ui.AddROws(1).AddColumns10p2
				sb.append($".Container.AddROws(1).AddColumns10p2"$).append(CRLF)
			Case "rc11p1"
				ui.AddROws(1).AddColumns11p1
				sb.append($".Container.AddROws(1).AddColumns11p1"$).append(CRLF)
			Case "rc2p10"
				ui.addrows(1).AddColumns2p10
				sb.append($".Container.addrows(1).AddColumns2p10"$).append(CRLF)
		End Select
	Next
End Sub

Sub Design_TextArea
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	Dim txta As VMTextField = ui.NewTextArea(Me, True, sname, svmodel, stitle, splaceholder, bisrequired, bautogrow, siconname, imaxlen, shelpertext, serrortext, stabindex)
	txta.SetSolo(bissolo)
	txta.SetValue(svalue)
	txta.SetOutlined(bisoutlined)
	txta.SetFilled(bisfilled)
	txta.SetDense(bisdense)
	txta.SetSingleLine(bissingleline)
	txta.SetPersistentHint(bispersistenthint)
	txta.SetShaped(bisshaped)
	txta.SetLoading(bisloading)
	txta.SetFlat(bisflat)
	txta.SetRounded(bisrounded)
	txta.SetClearable(bclearable)
	txta.SetHideDetails(bishidedetails)
	txta.SetAutoGrow(bautogrow)
	txta.SetFieldType(sfieldtype)
	txta.SetVisible(bisVisible)
	txta.SetAutoFocus(bisautofocus)
	txta.SetReadOnly(bisreadonly)
	txta.SetDisabled(bisDisabled)
	If smargintop <> "" Then txta.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then txta.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then txta.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then txta.AddClass("mr-" & smarginright)
	If smargins <> "" Then txta.AddClass("ms-" & smargins)
	If smargine <> "" Then txta.AddClass("me-" & smargine)
	If smarginx <> "" Then txta.AddClass("mx-" & smarginx)
	If smarginy <> "" Then txta.AddClass("my-" & smarginy)
	If smargina <> "" Then txta.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then txta.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then txta.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then txta.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then txta.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then txta.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then txta.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then txta.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then txta.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then txta.AddClass("pa-" & spaddinga)


	'
	
	If sfloat <> "" Then
		txta.Addclass(sfloat)
	End If
	ui.AddControl(txta.TextField, txta.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim txta${sname} As VMTextField = vm.NewTextArea(Me, ${bStatic}, "txta${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, ${bautogrow}, "${siconname}", ${imaxlen}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)

	If sfloat <> "" Then
		AddCode(sb, $"txta${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, sfieldtype, "s", "txta", sname, "SetFieldType")
	CodeLine(sb, bisreadonly, "b", "txta", sname, "SetReadonly")
	CodeLine(sb, bisDisabled, "b", "txta", sname, "SetDisabled")
	CodeLine(sb, svalue, "s", "txta", sname, "SetValue")
	CodeLine(sb, bissolo, "b", "txta", sname, "SetSolo")
	CodeLine(sb, bisoutlined, "b", "txta", sname, "SetOutlined")
	CodeLine(sb, bisfilled, "b", "txta", sname, "SetFilled")
	CodeLine(sb, bisautofocus, "b", "txta", sname, "SetAutoFocus")
	CodeLine(sb, bisdense, "b", "txta", sname, "SetDense")
	CodeLine(sb, bissingleline, "b", "txta", sname, "SetSingleLine")
	CodeLine(sb, bispersistenthint, "b", "txta", sname, "SetPersistentHint")
	CodeLine(sb, bisshaped, "b", "txta", sname, "SetShaped")
	CodeLine(sb, bisloading, "b", "txta", sname, "SetLoading")
	CodeLine(sb, bisflat, "b", "txta", sname, "SetFlat")
	CodeLine(sb, bisrounded, "b", "txta", sname, "SetRounded")
	CodeLine(sb, bclearable, "b", "txta", sname, "SetClearable")
	CodeLine(sb, bishidedetails, "b", "txta", sname, "SetHideDetails")
	CodeLine(sb, bisVisible, "b", "txta", sname, "SetVisible")
	'
	Dim pres As String = "txta"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")

	sb.append($"${sparent}.AddControl(txta${sname}.TextField, txta${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Switch
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	Dim swt As VMCheckBox = ui.NewSwitch(Me, True, sname, svmodel, stitle, struevalue, sfalsevalue, bisPrimary, stabindex)
	swt.SetColorIntensity(sColor, sintensity)
	swt.SetRequired(bisrequired)
	swt.SetDisabled(bisDisabled)
	swt.SetDark(bisdark)
	swt.SetValue(svalue)
	swt.SetDense(bisdense)
	swt.SetHideDetails(bishidedetails)
	swt.SetLight(bislight)
	swt.SetLoading(sswitchloading)
	swt.SetMultiple(bismultiple)
	swt.SetInset(bisinset).SetFlat(bisflat)
	swt.SetFieldType(sfieldtype)
	swt.SetVisible(bisVisible)
	If smargintop <> "" Then swt.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then swt.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then swt.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then swt.AddClass("mr-" & smarginright)
	If smargins <> "" Then swt.AddClass("ms-" & smargins)
	If smargine <> "" Then swt.AddClass("me-" & smargine)
	If smarginx <> "" Then swt.AddClass("mx-" & smarginx)
	If smarginy <> "" Then swt.AddClass("my-" & smarginy)
	If smargina <> "" Then swt.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then swt.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then swt.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then swt.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then swt.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then swt.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then swt.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then swt.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then swt.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then swt.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		swt.Addclass(sfloat)
	End If
	ui.AddControl(swt.checkbox, swt.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim swt${sname} As VMCheckBox = vm.NewSwitch(Me, ${bStatic}, "swt${sname}", "${svmodel}", "${stitle}", "${svalue}", "${sfalsevalue}", ${bisPrimary}, ${stabindex})"$).append(CRLF)
	CodeLine(sb, bisrequired, "b", "swt", sname, "SetRequired")
	CodeLine(sb, sfieldtype, "s", "swt", sname, "SetFieldType")
	CodeLine(sb, svalue, "s", "swt", sname, "SetValue")
	If sfloat <> "" Then
		AddCode(sb, $"swt${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisDisabled, "b", "swt", sname, "SetDisabled")
	CodeLine(sb, bisdark, "b", "swt", sname, "SetDark")
	CodeLine(sb, bisdense, "b", "swt", sname, "SetDense")
	CodeLine(sb, bishidedetails, "b", "swt", sname, "SetHideDetails")
	CodeLine(sb, bisinset, "b", "swt", sname, "SetInset")
	CodeLine(sb, bislight, "b", "swt", sname, "SetLight")
	CodeLine(sb, sswitchloading, "s", "swt", sname, "SetLoading")
	CodeLine(sb, bismultiple, "b", "swt", sname, "SetMultiple")
	CodeLine(sb, bisflat, "b", "swt", sname, "SetFlat")
	CodeLine(sb, bisVisible, "b", "swt", sname, "SetVisible")
	'
	Dim pres As String = "swt"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	
	If sColor <> "" Then sb.append($"swt${sname}.SetColorIntensity("${sColor}", "${sintensity}")"$).append(CRLF)
	'
	AddCode(sb, $"swt${sname}.SetOnChange(Me, "swt${sname}_change")"$)
	sb.append($"${sparent}.AddControl(swt${sname}.CheckBox, swt${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	
	'add events
	AddCode(sbEvents, $"Private Sub swt${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

Sub Design_CheckBox
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	Dim chk As VMCheckBox = ui.NewCheckBox(Me, True, sname, svmodel, stitle, struevalue, sfalsevalue, bisPrimary, stabindex)
	chk.SetColorIntensity(sColor, sintensity)
	chk.SetRequired(bisrequired)
	chk.SetDisabled(bisDisabled)
	chk.SetDark(bisdark)
	chk.SetDense(bisdense)
	chk.SetHideDetails(bishidedetails)
	chk.SetIndeterminate(bisindeterminate)
	chk.SetLight(bislight)
	chk.SetMultiple(bismultiple)
	chk.SetValue(svalue)
	chk.SetFieldType(sfieldtype)
	chk.SetVisible(bisVisible)
	If smargintop <> "" Then chk.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then chk.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then chk.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then chk.AddClass("mr-" & smarginright)
	If smargins <> "" Then chk.AddClass("ms-" & smargins)
	If smargine <> "" Then chk.AddClass("me-" & smargine)
	If smarginx <> "" Then chk.AddClass("mx-" & smarginx)
	If smarginy <> "" Then chk.AddClass("my-" & smarginy)
	If smargina <> "" Then chk.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then chk.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then chk.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then chk.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then chk.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then chk.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then chk.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then chk.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then chk.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then chk.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		chk.Addclass(sfloat)
	End If
	ui.AddControl(chk.checkbox, chk.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim chk${sname} As VMCheckBox = vm.NewCheckBox(Me, ${bStatic}, "chk${sname}", "${svmodel}", "${stitle}", "${struevalue}", "${sfalsevalue}", ${bisPrimary}, ${stabindex})"$).append(CRLF)
	CodeLine(sb, bisrequired, "b", "chk", sname, "SetRequired")
	CodeLine(sb, svalue, "s", "chk", sname, "SetValue")
	CodeLine(sb, bisDisabled, "b", "chk", sname, "SetDisabled")
	CodeLine(sb, bisdark, "b", "chk", sname, "SetDark")
	If sfloat <> "" Then
		AddCode(sb, $"chk${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisdense, "b", "chk", sname, "SetDense")
	CodeLine(sb, bishidedetails, "b", "chk", sname, "SetHideDetails")
	CodeLine(sb, bisindeterminate, "b", "chk", sname, "SetIndeterminate")
	CodeLine(sb, bislight, "b", "chk", sname, "SetLight")
	CodeLine(sb, bismultiple, "b", "chk", sname, "SetMultiple")
	CodeLine(sb, sfieldtype, "s", "chk", sname, "SetFieldType")
	CodeLine(sb, bisVisible, "b", "chk", sname, "SetVisible")
	'
	Dim pres As String = "chk"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	
	AddCode(sb, $"chk${sname}.SetOnChange(Me, "chk${sname}_change")"$)
	If sColor <> "" Then sb.append($"chk${sname}.SetColorIntensity("${sColor}", "${sintensity}")"$).append(CRLF)
	'
	sb.append($"${sparent}.AddControl(chk${sname}.CheckBox, chk${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub chk${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

Sub Design_Date
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	Dim dp As VMDateTimePicker = ui.NewDatePicker(Me, True, sname, svmodel, stitle, bisrequired, splaceholder, shelpertext, serrortext, stabindex)
	dp.SetVisible(bisVisible)
	dp.SetDisabled(bisDisabled)
	dp.SetRange(bisrange)
	dp.SetShowWeek(bisshowweek)
	dp.SetDark(bisdark)
	dp.SetValue(svalue)
	dp.SetIsNow(bisnow)
	dp.SetFieldType(sfieldtype)
	'dp.SetNotitle(bisnotitle)
	'dp.SetColorIntensity(scolor, sintensity)
	'dp.SetHeaderColorIntensity(sheadercolor, sheaderintensity)
	dp.SetFirstDayOfWeek(sfirstdayofweek)
	dp.SetMultiple(bismultiple)
	dp.TextField.SetPrependIcon(siconname)
	dp.TextField.SetSolo(bissolo)
	dp.TextField.SetOutlined(bisoutlined)
	dp.TextField.SetFilled(bisfilled)
	dp.TextField.SetDense(bisdense)
	dp.TextField.SetSingleLine(bissingleline)
	dp.TextField.SetPersistentHint(bispersistenthint)
	dp.TextField.SetShaped(bisshaped)
	dp.TextField.SetLoading(bisloading)
	dp.TextField.SetFlat(bisflat)
	dp.TextField.SetRounded(bisrounded)
	dp.TextField.SetClearable(bclearable)
	dp.TextField.SetHideDetails(bishidedetails)
	dp.SetAutofocus(bisautofocus)
	If smargintop <> "" Then dp.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then dp.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then dp.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then dp.AddClass("mr-" & smarginright)
	If smargins <> "" Then dp.AddClass("ms-" & smargins)
	If smargine <> "" Then dp.AddClass("me-" & smargine)
	If smarginx <> "" Then dp.AddClass("mx-" & smarginx)
	If smarginy <> "" Then dp.AddClass("my-" & smarginy)
	If smargina <> "" Then dp.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then dp.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then dp.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then dp.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then dp.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then dp.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then dp.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then dp.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then dp.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then dp.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		dp.Addclass(sfloat)
	End If
	ui.AddControl(dp.DateTimePicker, dp.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	
	sb.append($"Dim dp${sname} As VMDateTimePicker = vm.NewDatePicker(Me, ${bStatic}, "dp${sname}", "${svmodel}", "${stitle}", ${bisrequired}, "${splaceholder}", "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
		
	CodeLine(sb, sfieldtype, "s", "dp", sname, "SetFieldType")
	CodeLine(sb, bisVisible, "b", "dp", sname, "SetVisible")
	CodeLine(sb, bisDisabled, "b", "dp", sname, "SetDisabled")
	CodeLine(sb, bisrange, "b", "dp", sname, "SetRange")
	If sfloat <> "" Then
		AddCode(sb, $"dp${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisshowweek, "b", "dp", sname, "SetShowWeek")
	CodeLine(sb, bisdark, "b", "dp", sname, "SetDark")
	CodeLine(sb, svalue, "s", "dp", sname, "SetValue")
	CodeLine(sb, bisnow, "b", "dp", sname, "SetIsNow")
	CodeLine(sb, bisautofocus, "b", "dp", sname, "SetAutoFocus")
	'CodeLine(sb, bisnotitle, "b", "dp", sname, "SetNotitle")
	CodeLine(sb, sfirstdayofweek, "s", "dp", sname, "SetFirstDayOfWeek")
	CodeLine(sb, bismultiple, "b", "dp", sname, "SetMultiple")
	'If scolor <> "" Then sb.append($"dp${sname}.SetColorIntensity("${scolor}", "${sintensity}")"$).append(CRLF)
	'If sheadercolor <> "" Then sb.append($"dp${sname}.SetHeaderColorIntensity("${sheadercolor}", "${sheaderintensity}")"$).append(CRLF)
	'
	CodeLine(sb, siconname, "s", "dp", sname, "TextField.SetPrependIcon")
	CodeLine(sb, bissolo, "b", "dp", sname, "TextField.SetSolo")
	CodeLine(sb, bisoutlined, "b", "dp", sname, "TextField.SetOutlined")
	CodeLine(sb, bisfilled, "b", "dp", sname, "TextField.SetFilled")
	CodeLine(sb, bisdense, "b", "dp", sname, "TextField.SetDense")
	CodeLine(sb, bissingleline, "b", "dp", sname, "TextField.SetSingleLine")
	CodeLine(sb, bispersistenthint, "b", "dp", sname, "TextField.SetPersistentHint")
	CodeLine(sb, bisshaped, "b", "dp", sname, "TextField.SetShaped")
	CodeLine(sb, bisloading, "b", "dp", sname, "TextField.SetLoading")
	CodeLine(sb, bisflat, "b", "dp", sname, "TextField.SetFlat")
	CodeLine(sb, bisrounded, "b", "dp", sname, "TextField.SetRounded")
	CodeLine(sb, bclearable, "b", "dp", sname, "TextField.SetClearable")
	CodeLine(sb, bishidedetails, "b", "dp", sname, "TextField.SetHideDetails")
	'
	Dim pres As String = "dp"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	AddCode(sb, $"dp${sname}.SetOnChange(Me, "dp${sname}_change")"$)
	
	sb.append($"${sparent}.AddControl(dp${sname}.DateTimePicker, dp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub dp${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
	
End Sub

Sub Design_Chip
	Dim chip As VMChip = ui.CreateChip(sname, Me)
	chip.SetStatic(True)
	Select Case schiptype
	Case "icon"
		chip.SetIcon(siconname, siconpos)
	Case "image"
		chip.SetImage(ssrc, siconpos)
	End Select
	chip.SetText(stitle)
	chip.SetActive(bisActive)
	chip.SetAppend(bisAppend)
	chip.SetClose(bisClose)
	chip.SetColorintensity(sColor, sColorintensity)
	chip.SetDark(bisdark)
	chip.SetDisabled(bisDisabled)
	chip.SetDraggable(bisDraggable)
	chip.SetExact(bisExact)
	chip.SetFilter(bisFilter)
	chip.SetHref(shref)
	chip.SetLabel(bisLabel)
	chip.SetLarge(bisLarge)
	chip.SetLight(bislight)
	chip.SetLink(bisLink)
	chip.SetNuxt(bisNuxt)
	chip.SetOutlined(bisoutlined)
	chip.SetPill(bisPill)
	chip.SetReplace(bisReplace)
	chip.SetRipple(bisRipple)
	chip.SetSmall(bisSmall)
	chip.SetTarget(starget)
	chip.SetTextcolorintensity(stextcolor, stextintensity)
	chip.SetTo(sTo)
	chip.SetVisible(bisVisible)
	chip.SetXlarge(bisXlarge)
	chip.SetXsmall(bisXsmall)
	'
	If smargintop <> "" Then chip.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then chip.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then chip.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then chip.AddClass("mr-" & smarginright)
	If smargins <> "" Then chip.AddClass("ms-" & smargins)
	If smargine <> "" Then chip.AddClass("me-" & smargine)
	If smarginx <> "" Then chip.AddClass("mx-" & smarginx)
	If smarginy <> "" Then chip.AddClass("my-" & smarginy)
	If smargina <> "" Then chip.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then chip.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then chip.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then chip.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then chip.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then chip.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then chip.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then chip.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then chip.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then chip.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		chip.Addclass(sfloat)
	End If
	ui.AddControl(chip.Chip, chip.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	
	AddCode(sb, $"Dim chp${sname} As VMChip = vm.CreateChip("chp${sname}", Me)"$)
	CodeLine(sb, stitle, "s", "chp", sname, "SetText")
	Select Case schiptype
	Case "icon"
		CodeLine2(sb, siconname, siconpos, "s", "chp", sname, "SetIcon")
	Case "image"
		CodeLine2(sb, ssrc, siconpos, "s", "chp", sname, "SetImage")
	End Select
	CodeLine(sb, bisActive, "b", "chp", sname, "SetActive")
	CodeLine(sb, bisAppend, "b", "chp", sname, "SetAppend")
	CodeLine(sb, bisClose, "b", "chp", sname, "SetClose")
	If sfloat <> "" Then
		AddCode(sb, $"chp${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine2(sb, sColor, sColorintensity, "s", "chp", sname, "SetColorintensity")
	CodeLine(sb, bisdark, "b", "chp", sname, "SetDark")
	CodeLine(sb, bisDisabled, "b", "chp", sname, "SetDisabled")
	CodeLine(sb, bisDraggable, "b", "chp", sname, "SetDraggable")
	CodeLine(sb, bisExact, "b", "chp", sname, "SetExact")
	CodeLine(sb, bisFilter, "b", "chp", sname, "SetFilter")
	CodeLine(sb, shref, "s", "chp", sname, "SetHref")
	CodeLine(sb, bisLabel, "b", "chp", sname, "SetLabel")
	CodeLine(sb, bisLarge, "b", "chp", sname, "SetLarge")
	CodeLine(sb, bislight, "b", "chp", sname, "SetLight")
	CodeLine(sb, bisLink, "b", "chp", sname, "SetLink")
	CodeLine(sb, bisNuxt, "b", "chp", sname, "SetNuxt")
	CodeLine(sb, bisoutlined, "b", "chp", sname, "SetOutlined")
	CodeLine(sb, bisPill, "b", "chp", sname, "SetPill")
	CodeLine(sb, bisReplace, "b", "chp", sname, "SetReplace")
	CodeLine(sb, bisRipple, "b", "chp", sname, "SetRipple")
	CodeLine(sb, bisSmall, "b", "chp", sname, "SetSmall")
	CodeLine(sb, starget, "s", "chp", sname, "SetTarget")
	CodeLine2(sb, stextcolor, stextintensity, "s", "chp", sname, "SetTextcolorintensity")
	CodeLine(sb, sTo, "s", "chp", sname, "SetTo")
	CodeLine(sb, bisVisible, "b", "chp", sname, "SetVisible")
	CodeLine(sb, bisXlarge, "b", "chp", sname, "SetXlarge")
	CodeLine(sb, bisXsmall, "b", "chp", sname, "SetXsmall")
	'
	Dim pres As String = "chp"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	
	sb.append($"${sparent}.AddControl(chp${sname}.Chip, chp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub chp${sname}_close(e As BANanoEvent)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
	'
	AddCode(sbEvents, $"Private Sub chp${sname}_click(e As BANanoEvent)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub


Sub Design_Badge
	Dim badge As VMBadge = ui.CreateBadge(sname, Me)
	badge.SetStatic(True)
	badge.SetAvatar(bisAvatar)
	badge.SetBordered(bisBordered)
	badge.SetBottom(bisbottom)
	badge.SetColorintensity(sColor, sColorintensity)
	Select Case sbadgetype
	Case "iscontent"
		badge.SetContent(sContent)
	Case "isicon"	
		badge.SetIcon(siconname)
	End Select
	badge.SetDark(bisdark)
	badge.SetDisabled(bisDisabled)
	badge.SetDot(bisDot)
	badge.SetInline(bisInline)
	badge.SetLeft(bisleft)
	badge.SetLight(bislight)
	badge.SetOffsetx(sOffsetx)
	badge.SetOffsety(sOffsety)
	badge.SetOrigin(sorigin)
	badge.SetOverlap(bisOverlap)
	badge.SetTile(bistile)
	badge.SetTransition(stransition)
	badge.SetVisible(bisVisible)
	'
	If smargintop <> "" Then badge.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then badge.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then badge.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then badge.AddClass("mr-" & smarginright)
	If smargins <> "" Then badge.AddClass("ms-" & smargins)
	If smargine <> "" Then badge.AddClass("me-" & smargine)
	If smarginx <> "" Then badge.AddClass("mx-" & smarginx)
	If smarginy <> "" Then badge.AddClass("my-" & smarginy)
	If smargina <> "" Then badge.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then badge.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then badge.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then badge.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then badge.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then badge.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then badge.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then badge.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then badge.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then badge.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		badge.Addclass(sfloat)
	End If
	ui.AddControl(badge.Badge, badge.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	
	AddCode(sb, $"Dim bdg${sname} As VMBadge = vm.CreateBadge("bdg${sname}", Me)"$)
	CodeLine(sb, bisAvatar, "b", "bdg", sname, "SetAvatar")
	CodeLine(sb, bisBordered, "b", "bdg", sname, "SetBordered")
	CodeLine(sb, bisbottom, "b", "bdg", sname, "SetBottom")
	CodeLine2(sb, sColor, sColorintensity, "s", "bdg", sname, "SetColorintensity")
	Select Case sbadgetype
	Case "iscontent"
		CodeLine(sb, sContent, "s", "bdg", sname, "SetContent")
	Case "isicon"
		CodeLine(sb, siconname, "s", "bdg", sname, "SetIcon")
	End Select
	If sfloat <> "" Then
		AddCode(sb, $"bdg${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisdark, "b", "bdg", sname, "SetDark")
	CodeLine(sb, bisDisabled, "b", "bdg", sname, "SetDisabled")
	CodeLine(sb, bisDot, "b", "bdg", sname, "SetDot")
	CodeLine(sb, bisInline, "b", "bdg", sname, "SetInline")
	CodeLine(sb, bisleft, "b", "bdg", sname, "SetLeft")
	CodeLine(sb, bislight, "b", "bdg", sname, "SetLight")
	CodeLine(sb, sOffsetx, "s", "bdg", sname, "SetOffsetx")
	CodeLine(sb, sOffsety, "s", "bdg", sname, "SetOffsety")
	CodeLine(sb, sorigin, "s", "bdg", sname, "SetOrigin")
	CodeLine(sb, bisOverlap, "b", "bdg", sname, "SetOverlap")
	CodeLine(sb, bistile, "b", "bdg", sname, "SetTile")
	CodeLine(sb, stransition, "s", "bdg", sname, "SetTransition")
	CodeLine(sb, bisVisible, "b", "bdg", sname, "SetVisible")
	'
	Dim pres As String = "bdg"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	
	sb.append($"${sparent}.AddControl(bdg${sname}.Badge, bdg${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_File
	'we are dealing with 1 file
	If bismultiple = False Then
		If sfilenamevmodel <> "" Then 
			AddCode(sbRead, $"Dim sFileName As String = vue.GetData("${sfilenamevmodel}")"$)
			AddCode(sbRead, $"Record.put("${sfilenamevmodel}", sFileName)"$)
		End If
		If sfiledatevmodel <> "" Then 
			AddCode(sbRead, $"Dim sFileDate As String = vue.GetData("${sfiledatevmodel}")"$)
			AddCode(sbRead, $"Record.put("${sfiledatevmodel}", sFileDate)"$)
		End If
		If sfilesizevmodel <> "" Then 
			AddCode(sbRead, $"Dim sFileSize As String = vue.GetData("${sfilesizevmodel}")"$)
			AddCode(sbRead, $"Record.put("${sfilesizevmodel}", sFileSize)"$)
		End If
		If sfiletypevmodel <> "" Then 
			AddCode(sbRead, $"Dim sFileType As String = vue.GetData("${sfiletypevmodel}")"$)
			AddCode(sbRead, $"Record.put("${sfiletypevmodel}", sFileType)"$)
		End If
	Else
		AddNewLine(sbEvents)
		AddInstruction(sbEvents, "<Your Module>", "Process_Globals", "")
		AddCode(sbEvents, "Private numFiles As Int")
		AddCode(sbEvents, "Private totFiles As Int")
		AddCode(sbEvents, "Private fl As List")
		AddNewLine(sbEvents)
	End If
	
	'is not updatable
	If bisupdatable = False Then
		AddComment(sbRead, "Should not be updated...")
		AddCode(sbRead, $"Record.Remove("fm${svmodel}")"$)
	Else
		AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("fm${svmodel}")"$)
	End If
	'
	Dim fi As VMTextField = ui.NewFileInput(Me, True, False, sname, svmodel, stitle, splaceholder, bisrequired, shelpertext, serrortext, stabindex)
	fi.SetSolo(bissolo)
	fi.SetOutlined(bisoutlined)
	fi.SetFilled(bisfilled)
	fi.SetDense(bisdense)
	fi.SetSingleLine(bissingleline)
	fi.SetPersistentHint(bispersistenthint)
	fi.SetShaped(bisshaped)
	fi.SetLoading(bisloading)
	fi.SetFlat(bisflat)
	fi.SetRounded(bisrounded)
	fi.SetClearable(bclearable)
	fi.SetHideDetails(bishidedetails)
	fi.SetFieldType(sfieldtype)
	fi.SetVisible(bisVisible)
	fi.SetAccept(saccept)
	fi.SetMultiple(bismultiple)
	'
	If smargintop <> "" Then fi.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then fi.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then fi.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then fi.AddClass("mr-" & smarginright)
	If smargins <> "" Then fi.AddClass("ms-" & smargins)
	If smargine <> "" Then fi.AddClass("me-" & smargine)
	If smarginx <> "" Then fi.AddClass("mx-" & smarginx)
	If smarginy <> "" Then fi.AddClass("my-" & smarginy)
	If smargina <> "" Then fi.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then fi.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then fi.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then fi.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then fi.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then fi.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then fi.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then fi.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then fi.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then fi.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		fi.Addclass(sfloat)
	End If
	ui.AddControl(fi.TextField, fi.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
			
	sb.append($"Dim fi${sname} As VMTextField = vm.NewFileInput(Me, ${bStatic}, ${bisupload}, "fi${sname}", "fm${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
	CodeLine(sb, bissolo, "b", "fi", sname, "SetSolo")
	CodeLine(sb, bismultiple, "b", "swt", sname, "SetMultiple")
	CodeLine(sb, saccept, "s", "fi", sname, "SetAccept")
	CodeLine(sb, bisoutlined, "b", "fi", sname, "SetOutlined")
	CodeLine(sb, bisfilled, "b", "fi", sname, "SetFilled")
	CodeLine(sb, bisdense, "b", "fi", sname, "SetDense")
	If sfloat <> "" Then
		AddCode(sb, $"fi${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bissingleline, "b", "fi", sname, "SetSingleLine")
	CodeLine(sb, bispersistenthint, "b", "fi", sname, "SetPersistentHint")
	CodeLine(sb, bisshaped, "b", "fi", sname, "SetShaped")
	CodeLine(sb, bisloading, "b", "fi", sname, "SetLoading")
	CodeLine(sb, bisflat, "b", "fi", sname, "SetFlat")
	CodeLine(sb, bisrounded, "b", "fi", sname, "SetRounded")
	CodeLine(sb, bclearable, "b", "fi", sname, "SetClearable")
	CodeLine(sb, bishidedetails, "b", "fi", sname, "SetHideDetails")
	CodeLine(sb, sfieldtype, "s", "fi", sname, "SetFieldType")
	AddCode(sb, $"fi${sname}.SetOnFile(Me, "fi${sname}_change")"$)
	CodeLine(sb, bisVisible, "b", "fi", sname, "SetVisible")
	'
	Dim pres As String = "fi"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	
	sb.append($"${sparent}.AddControl(fi${sname}.TextField, fi${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	If bismultiple = False Then
		AddNewLine(sbEvents)
		AddCode(sbEvents, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
		AddNewLine(sbEvents)
		AddComment(sbEvents, "we are uploading a single file")
		AddCode(sbEvents, $"Private Sub fi${sname}_change(fileO As Map)"$)
		AddComment(sbEvents, "clear the relevant vmodels")
		If sfilenamevmodel <> "" Then AddCode(sbEvents, $"vue.SetData("${sfilenamevmodel}", "")"$)
		If sfiledatevmodel <> "" Then AddCode(sbEvents, $"vue.SetData("${sfiledatevmodel}", "")"$)
		If sfilesizevmodel <> "" Then AddCode(sbEvents, $"vue.SetData("${sfilesizevmodel}", "")"$)
		If sfiletypevmodel <> "" Then AddCode(sbEvents, $"vue.SetData("${sfiletypevmodel}", "")"$)
		AddComment(sbEvents, "the file is blank")
		AddCode(sbEvents, $"If fileO = Null Then Return"$)
		AddComment(sbEvents, "get file details")
		AddCode(sbEvents, $"Dim fo As FileObject = vue.GetFileDetails(fileO)"$)
		If sfilenamevmodel <> "" Then 
			AddCode(sbEvents, $"Dim sFileName As String = fo.FileName"$)
			AddCode(sbEvents, $"vue.SetData("${sfilenamevmodel}", sFileName)"$)
		End If
		If sfiledatevmodel <> "" Then 
			AddCode(sbEvents, $"Dim sFileDate As String = fo.FileDate"$)
			AddCode(sbEvents, $"vue.SetData("${sfiledatevmodel}", sFileDate)"$)
		End If
		If sfilesizevmodel <> "" Then 
			AddCode(sbEvents, $"Dim sFileSize As String = fo.FileSize"$)
			AddCode(sbEvents, $"vue.SetData("${sfilesizevmodel}", sFileSize)"$)
		End If
		If sfiletypevmodel <> "" Then 
			AddCode(sbEvents, $"Dim sFileType As String = fo.FileType"$)
			AddCode(sbEvents, $"vue.SetData("${sfiletypevmodel}", sFileType)"$)
		End If
		'
		If bisupload Then
			AddComment(sbEvents, "start uploading file")
			AddCode(sbEvents, $"Dim fd As BANanoObject"$)
			AddCode(sbEvents, $"fd.Initialize2("FormData", Null)"$)
			AddCode(sbEvents, $"fd.RunMethod("append", Array("upload", fileO))"$)
			AddCode(sbEvents, $"Dim rsltJSON As String = BANano.CallAjaxWait("./assets/upload.php", "POST", "", fd, True, Null)"$)
			AddComment(sbEvents, "get the result of the upload")
			AddCode(sbEvents, $"Dim rsltMap As Map = BANano.FromJson(rsltJSON)"$)
			AddCode(sbEvents, $"Dim sResult As String = rsltMap.get("status")"$)
			AddCode(sbEvents, $"Select Case sResult"$)
			AddCode(sbEvents, $"Case "success""$)
			If sfilenamevmodel <> "" Then
				AddCode(sbEvents, $"sFileName = "./assets/" & sFileName"$)
				AddCode(sbEvents, $"vue.SetData("${sfilenamevmodel}", sFileName)"$)
			End If
			AddCode(sbEvents, $"vm.ShowSnackBarSuccess(sFileName & " was uploaded successfully.")"$)
			AddCode(sbEvents, $"Case "error""$)
			If sfilenamevmodel <> "" Then
				AddCode(sbEvents, $"vue.SetData("${sfilenamevmodel}", "")"$)
			End If
			AddCode(sbEvents, $"vm.ShowSnackBarError("An error was experienced uploading " & sFileName)"$)
			AddCode(sbEvents, $"End Select"$)
		End If
	
	Else
		AddComment(sbEvents, "we are uploading multiple files")
		AddCode(sbEvents, $"Private Sub fi${sname}_change(fileList As List)"$)
		AddCode(sbEvents, $"If fileList = Null Then Return"$)
		AddComment(sbEvents, "write code to process the files after select")
		AddCode(sbEvents, "numFiles = 0")
		AddComment(sbEvents, "store list of files uploaded")
		AddCode(sbEvents, "fl.Initialize")
		AddComment(sbEvents, "start uploading file, how many times we need")
		AddCode(sbEvents, "totFiles = fileList.Size")
		AddCode(sbEvents, "For Each fileO As Object In fileList")
		AddComment(sbEvents, "get the file object and add it to list")
		AddCode(sbEvents, "Dim fde As FileObject = vue.GetFileDetails(fileO)")
		AddCode(sbEvents, "fl.Add(fde)")
		AddComment(sbEvents, "upload each file")
		AddCode(sbEvents, $"Dim fd As BANanoObject"$)
		AddCode(sbEvents, $"fd.Initialize2("FormData", Null)"$)
		AddCode(sbEvents, $"fd.RunMethod("append", Array("upload", fileO))"$)
		AddCode(sbEvents, $"Dim rsltJSON As String = BANano.CallAjaxWait("./assets/upload.php", "POST", "", fd, True, Null)"$)
		AddComment(sbEvents, "get the result of the upload")
		AddCode(sbEvents, $"Dim rsltMap As Map = BANano.FromJson(rsltJSON)"$)
		AddCode(sbEvents, $"Dim sResult As String = rsltMap.get("status")"$)
		AddCode(sbEvents, $"Select Case sResult"$)
		AddCode(sbEvents, $"Case "success""$)
		AddComment(sbEvents, "count files uploaded")
		AddCode(sbEvents, "numFiles = numFiles + 1")
		AddCode(sbEvents, $"Case "error""$)
		AddCode(sbEvents, "End Select")	
		AddCode(sbEvents, "Next")
		'determine uploaded and all files
		AddComment(sbEvents, "detect uploaded files")
		AddCode(sbEvents, "if totFiles = numFiles Then")
		AddCode(sbEvents, $"vm.ShowSnackBarSuccess("All " & totFiles & " were uploaded successfully.")"$)
		AddCode(sbEvents, "else")
		AddCode(sbEvents, $"vm.ShowSnackBarError(numFiles & " of " & totFiles & " were uploaded successfully. Please retry.")"$)
		AddCode(sbEvents, "end if")
	End If
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

Sub Design_Radio
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	If buseoptions Then
		Dim optionsm As Map = vm.keyvalues2map(",", skeys, svalues)
		Dim rd As VMRadioGroup = ui.NewRadioGroup(Me, True, sname, svmodel, stitle, svalue, optionsm, bshowlabel, blabelontop, stabindex)
	Else
		Dim rd As VMRadioGroup = ui.NewRadioGroupDataSource(Me, True, sname, svmodel, stitle, svalue, ssourcetable, _
					ssourcefield, sdisplayfield, bshowlabel, blabelontop, stabindex)
	End If
	rd.SetMandatory(bismandatory)
	rd.SetDisabled(bisDisabled)
	rd.SetDense(bisdense)
	rd.SetMultiple(bismultiple)
	rd.SetHideDetails(bishidedetails)
	rd.SetFieldType(sfieldtype)
	rd.SetVisible(bisVisible)
	If smargintop <> "" Then rd.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then rd.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then rd.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then rd.AddClass("mr-" & smarginright)
	If smargins <> "" Then rd.AddClass("ms-" & smargins)
	If smargine <> "" Then rd.AddClass("me-" & smargine)
	If smarginx <> "" Then rd.AddClass("mx-" & smarginx)
	If smarginy <> "" Then rd.AddClass("my-" & smarginy)
	If smargina <> "" Then rd.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then rd.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then rd.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then rd.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then rd.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then rd.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then rd.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then rd.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then rd.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then rd.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		rd.Addclass(sfloat)
	End If
	ui.AddControl(rd.RadioGroup, rd.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	If buseoptions Then
		sb.append($"Dim ${svmodel}keys As String = "${skeys}""$).append(CRLF)
		sb.append($"Dim ${svmodel}values As String = "${svalues}""$).append(CRLF)
		sb.append($"Dim ${svmodel}map As Map = vm.keyvalues2map(",", ${svmodel}keys, ${svmodel}values)"$).append(CRLF)
		sb.append($"Dim rd${sname} As VMRadioGroup = vm.NewRadioGroup(Me, ${bStatic}, "rd${sname}", "${svmodel}", "${stitle}", "${svalue}", ${svmodel}map, ${bshowlabel}, ${blabelontop}, ${stabindex})"$).append(CRLF)
	Else
		sb.append($"Dim rd${sname} As VMRadioGroup = vm.NewRadioGroupDataSource(Me, ${bStatic}, "rd${sname}", "${svmodel}", "${stitle}", "${svalue}", "${ssourcetable}", "${ssourcefield}", "${sdisplayfield}" ${bshowlabel}, ${blabelontop}, ${stabindex})"$).append(CRLF)
	End If
	CodeLine(sb, bismandatory, "b", "rd", sname, "SetMandatory")
	CodeLine(sb, sfieldtype, "s", "rd", sname, "SetFieldType")
	If sfloat <> "" Then
		AddCode(sb, $"rd${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisDisabled, "b", "rd", sname, "SetDisabled")
	CodeLine(sb, bisdense, "b", "rd", sname, "SetDense")
	CodeLine(sb, bismultiple, "b", "rd", sname, "SetMultiple")
	CodeLine(sb, bishidedetails, "b", "rd", sname, "SetHideDetails")
	CodeLine(sb, bisVisible, "b", "rd", sname, "SetVisible")
	'
	Dim pres As String = "rd"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	
	AddCode(sb, $"rd${sname}.SetOnChange(Me, "rd${sname}_change")"$)
	sb.append($"${sparent}.AddControl(rd${sname}.RadioGroup, rd${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub rd${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

Sub Design_Select
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	Select Case controltype
		Case "select"
			If buseoptions Then
				Dim optionsm As Map = vm.keyvalues2map(",", skeys, svalues)
				Dim sel As VMSelect = ui.NewSelectOptions(Me, True, sname, svmodel, stitle, bisrequired, bismultiple, _
						splaceholder, optionsm, ssourcefield, sdisplayfield, bisreturnobject, shelpertext, serrortext, stabindex)
			Else
				'use data source
				Dim sel As VMSelect = ui.NewSelectDataSource(Me, True, sname, svmodel, stitle, bisrequired, bismultiple, _
						splaceholder, ssourcetable, ssourcefield, sdisplayfield, bisreturnobject, shelpertext, serrortext, stabindex)
			End If
		Case "combo"
			If buseoptions Then
				Dim optionsm As Map = vm.keyvalues2map(",", skeys, svalues)
				Dim sel As VMSelect = ui.NewComboOptions(Me, True, sname, svmodel, stitle, bisrequired, bismultiple, _
						splaceholder, optionsm, ssourcefield, sdisplayfield, bisreturnobject, shelpertext, serrortext, stabindex)
			Else
				'use data source
				Dim sel As VMSelect = ui.NewComboDataSource(Me, True, sname, svmodel, stitle, bisrequired, bismultiple, _
						splaceholder, ssourcetable, ssourcefield, sdisplayfield, bisreturnobject, shelpertext, serrortext, stabindex)
			End If
		Case "auto"
			If buseoptions Then
				Dim optionsm As Map = vm.keyvalues2map(",", skeys, svalues)
				Dim sel As VMSelect = ui.NewAutoCompleteOptions(Me, True, sname, svmodel, stitle, bisrequired, bismultiple, _
						splaceholder, optionsm, ssourcefield, sdisplayfield, bisreturnobject, shelpertext, serrortext, stabindex)
			Else
				'use data source
				Dim sel As VMSelect = ui.NewAutoCompleteDataSource(Me, True, sname, svmodel, stitle, bisrequired, bismultiple, _
						splaceholder, ssourcetable, ssourcefield, sdisplayfield, bisreturnobject, shelpertext, serrortext, stabindex)
			End If
	End Select
	'
	sel.SetSolo(bissolo)
	sel.SetOutlined(bisoutlined)
	sel.SetFilled(bisfilled)
	sel.SetDense(bisdense)
	sel.SetPrependIcon(siconname)
	sel.SetSingleLine(bissingleline)
	sel.SetPersistentHint(bispersistenthint)
	sel.SetShaped(bisshaped)
	sel.SetLoading(bisloading)
	sel.SetFlat(bisflat)
	sel.SetRounded(bisrounded)
	sel.SetClearable(bclearable)
	sel.SetHideDetails(bishidedetails)
	sel.SetChips(bischips)
	sel.SetSmallChips(bissmallchips)
	sel.SetDeletableChips(bisdeletablechips)
	sel.SetValue(svalue)
	sel.SetFieldType(sfieldtype)
	sel.SetVisible(bisVisible)
	sel.SetAutoFocus(bisautofocus)
	If smargintop <> "" Then sel.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then sel.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then sel.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then sel.AddClass("mr-" & smarginright)
	If smargins <> "" Then sel.AddClass("ms-" & smargins)
	If smargine <> "" Then sel.AddClass("me-" & smargine)
	If smarginx <> "" Then sel.AddClass("mx-" & smarginx)
	If smarginy <> "" Then sel.AddClass("my-" & smarginy)
	If smargina <> "" Then sel.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then sel.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then sel.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then sel.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then sel.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then sel.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then sel.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then sel.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then sel.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then sel.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		sel.Addclass(sfloat)
	End If
	ui.AddControl(sel.Combo, sel.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	'define the code for the control
	Select Case controltype
		Case "select"
			If buseoptions Then
				sb.append($"Dim ${svmodel}keys As String = "${skeys}""$).append(CRLF)
				sb.append($"Dim ${svmodel}values As String = "${svalues}""$).append(CRLF)
				sb.append($"Dim ${svmodel}map As Map = vm.keyvalues2map(",", ${svmodel}keys, ${svmodel}values)"$).append(CRLF)
				'
				sb.append($"Dim sel${sname} As VMSelect = vm.NewSelectOptions(Me, ${bStatic}, "sel${sname}", "${svmodel}", "${stitle}", ${bisrequired}, ${bismultiple}, "${splaceholder}", ${svmodel}map, "${ssourcefield}", "${sdisplayfield}", ${bisreturnobject}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
			Else
				sb.append($"Dim sel${sname} As VMSelect = vm.NewSelectDataSource(Me, ${bStatic}, "sel${sname}", "${svmodel}", "${stitle}", ${bisrequired}, ${bismultiple}, "${splaceholder}", "${ssourcetable}", "${ssourcefield}", "${sdisplayfield}", ${bisreturnobject}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
			End If
		Case "combo"
			If buseoptions Then
				sb.append($"Dim ${svmodel}keys As String = "${skeys}""$).append(CRLF)
				sb.append($"Dim ${svmodel}values As String = "${svalues}""$).append(CRLF)
				sb.append($"Dim ${svmodel}map As Map = vm.keyvalues2map(",", ${svmodel}keys, ${svmodel}values)"$).append(CRLF)
				'
				sb.append($"Dim sel${sname} As VMSelect = vm.NewComboOptions(Me, ${bStatic}, "sel${sname}", "${svmodel}", "${stitle}", ${bisrequired}, ${bismultiple}, "${splaceholder}", ${svmodel}map, "${ssourcefield}", "${sdisplayfield}", ${bisreturnobject}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
			Else
				sb.append($"Dim sel${sname} As VMSelect = vm.NewComboDataSource(Me, ${bStatic}, "sel${sname}", "${svmodel}", "${stitle}", ${bisrequired}, ${bismultiple}, "${splaceholder}", "${ssourcetable}", "${ssourcefield}", "${sdisplayfield}", ${bisreturnobject}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
			End If

		Case "auto"
			If buseoptions Then
				sb.append($"Dim ${svmodel}keys As String = "${skeys}""$).append(CRLF)
				sb.append($"Dim ${svmodel}values As String = "${svalues}""$).append(CRLF)
				sb.append($"Dim ${svmodel}map As Map = vm.keyvalues2map(",", ${svmodel}keys, ${svmodel}values)"$).append(CRLF)
				'
				sb.append($"Dim sel${sname} As VMSelect = vm.NewAutoCompleteOptions(Me, ${bStatic}, "sel${sname}", "${svmodel}", "${stitle}", ${bisrequired}, ${bismultiple}, "${splaceholder}", ${svmodel}map, "${ssourcefield}", "${sdisplayfield}", ${bisreturnobject}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
			Else
				sb.append($"Dim sel${sname} As VMSelect = vm.NewAutoCompleteDataSource(Me, ${bStatic}, "sel${sname}", "${svmodel}", "${stitle}", ${bisrequired}, ${bismultiple}, "${splaceholder}", "${ssourcetable}", "${ssourcefield}", "${sdisplayfield}", ${bisreturnobject}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
			End If
	End Select
	'
	CodeLine(sb, svalue, "s", "sel", sname, "SetValue")
	CodeLine(sb, siconname, "s", "sel", sname, "SetPrependIcon")
	CodeLine(sb, sfieldtype, "s", "sel", sname, "SetFieldType")
	CodeLine(sb, bissolo, "b", "sel", sname, "SetSolo")
	CodeLine(sb, bisoutlined, "b", "sel", sname, "SetOutlined")
	CodeLine(sb, bisfilled, "b", "sel", sname, "SetFilled")
	CodeLine(sb, bisdense, "b", "sel", sname, "SetDense")
	CodeLine(sb, bisautofocus, "b", "sel", sname, "SetAutoFocus")
	CodeLine(sb, bissingleline, "b", "sel", sname, "SetSingleLine")
	CodeLine(sb, bispersistenthint, "b", "sel", sname, "SetPersistentHint")
	CodeLine(sb, bisshaped, "b", "sel", sname, "SetShaped")
	CodeLine(sb, bisloading, "b", "sel", sname, "SetLoading")
	CodeLine(sb, bisflat, "b", "sel", sname, "SetFlat")
	If sfloat <> "" Then
		AddCode(sb, $"sel${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisrounded, "b", "sel", sname, "SetRounded")
	CodeLine(sb, bclearable, "b", "sel", sname, "SetClearable")
	CodeLine(sb, bishidedetails, "b", "sel", sname, "SetHideDetails")
	CodeLine(sb, bischips, "b", "sel", sname, "SetChips")
	CodeLine(sb, bissmallchips, "b", "sel", sname, "SetSmallChips")
	CodeLine(sb, bisdeletablechips, "b", "sel", sname, "SetDeletableChips")
	CodeLine(sb, bisVisible, "b", "sel", sname, "SetVisible")
	'
	Dim pres As String = "sel"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	AddCode(sb, $"sel${sname}.SetOnChange(Me, "sel${sname}_change")"$)
	'
	sb.append($"${sparent}.AddControl(sel${sname}.Combo, sel${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddInstruction(sbEvents, "<Your Module>", "", "")
	AddNewLine(sbEvents)
	AddCode(sbEvents, $"Private Sub sel${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
	'
End Sub

Sub Design_Slider
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	Dim sld As VMSlider = ui.Newslider(Me, True, sname, svmodel, stitle, sminvalue, smaxvalue, stabindex)
	sld.SetValue(sslidervalue)
	sld.SetColorIntensity(sColor, sintensity)
	sld.SetHideDetails(bishidedetails)
	sld.SetDark(bisdark)
	sld.SetValue(svalue)
	sld.SetReadonly(bisreadonly)
	sld.SetVertical(bisvertical)
	sld.SetStep(sstepvalue)
	sld.SetPrependIcon(sprependicon)
	sld.SetAppendIcon(sappendicon)
	sld.SetDense(bisdense)
	sld.SetThumbSize(sthumbsize)
	sld.SetThumbColorIntensity(sthumbcolor,sthumbintensity)
	sld.SetTrackColorIntensity(strackcolor,strackintensity)
	sld.SetFieldType(sfieldtype)
	If bisthumblabel Then sld.SetThumbLabel(bisthumblabel)
	If bisthumbalways Then sld.SetThumbLabelAlways(bisthumbalways)
	sld.SetVisible(bisVisible)
	If sfloat <> "" Then
		sld.Addclass(sfloat)
	End If
	If smargintop <> "" Then sld.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then sld.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then sld.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then sld.AddClass("mr-" & smarginright)
	If smargins <> "" Then sld.AddClass("ms-" & smargins)
	If smargine <> "" Then sld.AddClass("me-" & smargine)
	If smarginx <> "" Then sld.AddClass("mx-" & smarginx)
	If smarginy <> "" Then sld.AddClass("my-" & smarginy)
	If smargina <> "" Then sld.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then sld.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then sld.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then sld.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then sld.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then sld.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then sld.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then sld.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then sld.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then sld.AddClass("pa-" & spaddinga)


	ui.AddControl(sld.slider, sld.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim sld${sname} As VMSlider = vm.NewSlider(Me, ${bStatic}, "sld${sname}", "${svmodel}", "${stitle}", ${sminvalue}, ${smaxvalue}, ${stabindex})"$).append(CRLF)
	CodeLine(sb, sslidervalue, "s", "sld", sname, "SetValue")
	CodeLine2(sb, sColor, sintensity, "s", "sld", sname, "SetColorIntensity")
	CodeLine(sb, bishidedetails, "b", "sld", sname, "SetHidedetails")
	CodeLine(sb, sfieldtype, "s", "sld", sname, "SetFieldType")
	CodeLine(sb, svalue, "s", "sld", sname, "SetValue")
	CodeLine(sb, bisdark, "b", "sld", sname, "SetDark")
	If sfloat <> "" Then
		AddCode(sb, $"sld${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisreadonly, "b", "sld", sname, "SetReadonly")
	CodeLine(sb, bisvertical, "b", "sld", sname, "SetVertical")
	CodeLine(sb, sstepvalue, "s", "sld", sname, "SetStep")
	CodeLine(sb, sprependicon, "s", "sld", sname, "SetPrependicon")
	CodeLine(sb, sappendicon, "s", "sld", sname, "SetAppendIcon")
	CodeLine(sb, bisdense, "b", "sld", sname, "SetDense")
	CodeLine(sb, sthumbsize, "s", "sld", sname, "SetThumbSize")
	CodeLine(sb, bisVisible, "b", "sld", sname, "SetVisible")
	
	Dim pres As String = "sld"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	
	CodeLine2(sb, sthumbcolor, sthumbintensity, "s", "sld", sname, "SetThumbColorIntensity")
	CodeLine2(sb, strackcolor, strackintensity, "s", "sld", sname, "SetTrackColorIntensity")
	If bisthumblabel Then CodeLine(sb, bisthumblabel, "b", "sld", sname, "SetThumblabel")
	If bisthumbalways Then CodeLine(sb, bisthumbalways, "b", "sld", sname, "SetThumblabelalways")
	sb.append($"${sparent}.AddControl(sld${sname}.Slider, sld${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Label
	Dim slabelsize As String = mattr.GetDefault("labelsize", "")
	Dim sdisplay As String = mattr.getdefault("display", "")
	Dim salign As String = mattr.getdefault("align", "")
	Dim sfontweight As String = mattr.getdefault("fontweight", "")
	'
	Dim lbl As VMLabel = ui.NewLabel(True, sname, svmodel, slabelsize, svalue)
	lbl.AddClass(sdisplay)
	lbl.AddClass(salign)
	lbl.AddClass(sfontweight)
	lbl.SetItalic(bisitalic)
	lbl.SetTextColorIntensity(stextcolor, stextintensity)
	lbl.Setcaption(biscaption)
	lbl.Setdisplay1(bisdisplay1)
	lbl.Setdisplay2(bisdisplay2)
	lbl.Setdisplay3(bisdisplay3)
	lbl.Setdisplay4(bisdisplay4)
	lbl.Setheadline(bisheadline)
	lbl.Setoverline(bisoverline)
	lbl.Setsubtitle1(bissubtitle1)
	lbl.Setsubtitle2(bissubtitle2)
	lbl.Settextcapitalize(bistextcapitalize)
	lbl.Settextlowercase(bistextlowercase)
	lbl.Settextuppercase(bistextuppercase)
	lbl.Settitle(bistitle)
	lbl.Setvisible(bisVisible)
	If smargintop <> "" Then lbl.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then lbl.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then lbl.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then lbl.AddClass("mr-" & smarginright)
	If smargins <> "" Then lbl.AddClass("ms-" & smargins)
	If smargine <> "" Then lbl.AddClass("me-" & smargine)
	If smarginx <> "" Then lbl.AddClass("mx-" & smarginx)
	If smarginy <> "" Then lbl.AddClass("my-" & smarginy)
	If smargina <> "" Then lbl.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then lbl.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then lbl.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then lbl.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then lbl.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then lbl.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then lbl.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then lbl.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then lbl.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then lbl.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		lbl.Addclass(sfloat)
	End If
	ui.AddControl(lbl.Label, lbl.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim lbl${sname} As VMLabel =vm.NewLabel(${bStatic}, "lbl${sname}", "${svmodel}", "${slabelsize}", "${svalue}")"$).append(CRLF)
	CodeLine(sb, sdisplay, "s", "lbl", sname, "AddClass")
	CodeLine(sb, salign, "s", "lbl", sname, "AddClass")
	CodeLine(sb, sfontweight, "s", "lbl", sname, "AddClass")
	CodeLine(sb, bisitalic, "b", "lbl", sname, "SetItalic")
	If sfloat <> "" Then
		AddCode(sb, $"lbl${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, biscaption, "b", "lbl", sname, "Setcaption")
	CodeLine(sb, bisdisplay1, "b", "lbl", sname, "Setdisplay1")
	CodeLine(sb, bisdisplay2, "b", "lbl", sname, "Setdisplay2")
	CodeLine(sb, bisdisplay3, "b", "lbl", sname, "Setdisplay3")
	CodeLine(sb, bisdisplay4, "b", "lbl", sname, "Setdisplay4")
	CodeLine(sb, bisheadline, "b", "lbl", sname, "Setheadline")
	CodeLine(sb, bisoverline, "b", "lbl", sname, "Setoverline")
	CodeLine(sb, bissubtitle1, "b", "lbl", sname, "Setsubtitle1")
	CodeLine(sb, bissubtitle2, "b", "lbl", sname, "Setsubtitle2")
	CodeLine(sb, bistextcapitalize, "b", "lbl", sname, "Settextcapitalize")
	CodeLine(sb, bistextlowercase, "b", "lbl", sname, "Settextlowercase")
	CodeLine(sb, bistextuppercase, "b", "lbl", sname, "Settextuppercase")
	CodeLine(sb, bistitle, "b", "lbl", sname, "Settitle")
	CodeLine(sb, bisVisible, "b", "lbl", sname, "Setvisible")
	'
	Dim pres As String = "lbl"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	If stextcolor <> "" Then sb.append($"lbl${sname}.SetTextColorIntensity("${stextcolor}", "${stextintensity}")"$).append(CRLF)

	sb.append($"${sparent}.AddControl(lbl${sname}.Label, lbl${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Email
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	Dim email As VMTextField = ui.NewEmail(Me, True, sname, svmodel, stitle, splaceholder, bisrequired, siconname, shelpertext, serrortext, stabindex)
	email.SetFieldType(sfieldtype)
	email.SetSolo(bissolo)
	email.SetValue(svalue)
	email.SetOutlined(bisoutlined)
	email.SetFilled(bisfilled)
	email.SetDense(bisdense)
	email.SetSingleLine(bissingleline)
	email.SetPersistentHint(bispersistenthint)
	email.SetShaped(bisshaped)
	email.SetLoading(bisloading)
	email.SetFlat(bisflat)
	email.SetRounded(bisrounded)
	email.SetClearable(bclearable)
	email.SetHideDetails(bishidedetails)
	email.SetVisible(bisVisible)
	email.SetReadOnly(bisreadonly)
	email.SetDisabled(bisDisabled)
	If smargintop <> "" Then email.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then email.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then email.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then email.AddClass("mr-" & smarginright)
	If smargins <> "" Then email.AddClass("ms-" & smargins)
	If smargine <> "" Then email.AddClass("me-" & smargine)
	If smarginx <> "" Then email.AddClass("mx-" & smarginx)
	If smarginy <> "" Then email.AddClass("my-" & smarginy)
	If smargina <> "" Then email.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then email.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then email.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then email.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then email.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then email.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then email.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then email.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then email.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then email.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		email.Addclass(sfloat)
	End If
	ui.AddControl(email.TextField, email.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim txt${sname} As VMTextField = vm.NewEmail(Me, ${bStatic}, "txt${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, "${siconname}", "${shelpertext}", "${serrortext}", ${stabindex})"$).Append(CRLF)

	CodeLine(sb, sfieldtype, "s", "txt", sname, "SetFieldType")
	CodeLine(sb, bisreadonly, "b", "txt", sname, "SetReadonly")
	CodeLine(sb, bisDisabled, "b", "txt", sname, "SetDisabled")
	If sfloat <> "" Then
		AddCode(sb, $"txt${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, svalue, "s", "txt", sname, "SetValue")
	CodeLine(sb, bissolo, "b", "txt", sname, "SetSolo")
	CodeLine(sb, bisoutlined, "b", "txt", sname, "SetOutlined")
	CodeLine(sb, bisfilled, "b", "txt", sname, "SetFilled")
	CodeLine(sb, bisdense, "b", "txt", sname, "SetDense")
	CodeLine(sb, bissingleline, "b", "txt", sname, "SetSingleLine")
	CodeLine(sb, bispersistenthint, "b", "txt", sname, "SetPersistentHint")
	CodeLine(sb, bisshaped, "b", "txt", sname, "SetShaped")
	CodeLine(sb, bisloading, "b", "txt", sname, "SetLoading")
	CodeLine(sb, bisflat, "b", "txt", sname, "SetFlat")
	CodeLine(sb, bisrounded, "b", "txt", sname, "SetRounded")
	CodeLine(sb, bclearable, "b", "txt", sname, "SetClearable")
	CodeLine(sb, bishidedetails, "b", "txt", sname, "SetHideDetails")
	CodeLine(sb, bisVisible, "b", "txt", sname, "SetVisible")
	'
	Dim pres As String = "txt"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")

	sb.append($"${sparent}.AddControl(txt${sname}.textfield, txt${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Password
	Dim bHasHash As Boolean = False
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	'encrypt
	If shashtype <> "" And salg <> "" Then
		bHasHash = True
		AddComment(sbRead, "Reference the BANanoEncrypt Library...")
		AddCode(sbRead, $"Dim bencrypt As BANanoHashes"$)
		AddComment(sbRead, "Initialize the encryption")
		AddCode(sbRead, $"bencrypt.Initialize(s${svmodel}, Main.AppName)"$)
		AddComment(sbRead, "Encrypt the content")
		AddCode(sbRead, $"Dim s${svmodel}hash As String = bencrypt.Hash("${shashtype}", "${salg}")"$)
		AddComment(sbRead, "update the content")
		AddCode(sbRead, $"Record.put("${svmodel}", s${svmodel}hash)"$)
	End If
	'check do not match
	If sdonotmatchto <> "" Then
		AddComment(sbRead, "Check do not match")
		AddCode(sbRead, $"s${sdonotmatchto} = Record.Get("${smatchto}")"$)
		If bHasHash Then
			AddCode(sbRead, $"s${svmodel} = Record.Get("${svmodel}")"$)
		End If
		AddCode(sbRead, $"If s${sdonotmatchto} = s${svmodel} Then"$)
		AddCode(sbRead, $"vm.ShowSnackBarError("The '${sdonotmatchto}' and '${svmodel}' should not match!")"$)
		AddCode(sbRead, "Return")
		AddCode(sbRead, "End If")
	End If
	'check matching
	If smatchto <> "" Then
		AddComment(sbRead, "Check match")
		AddCode(sbRead, $"s${smatchto} = Record.Get("${smatchto}")"$)
		If bHasHash Then
			AddCode(sbRead, $"s${svmodel} = Record.Get("${svmodel}")"$)
		End If
		AddCode(sbRead, $"If s${smatchto} <> s${svmodel} Then"$)
		AddCode(sbRead, $"vm.ShowSnackBarError("The passwords do not match!")"$)
		AddCode(sbRead, "Return")
		AddCode(sbRead, "End If")
	End If
	'is not updatable
	If bisupdatable = False Then
		AddComment(sbRead, "Should not be updated...")
		AddCode(sbRead, $"Record.Remove("${svmodel}")"$)
	End If
		
	Dim pwd As VMTextField = ui.NewPassword(Me, True, sname, svmodel, stitle, splaceholder, bisrequired, bToggle, siconname, imaxlen, shelpertext, serrortext, stabindex)
	pwd.SetFieldType(sfieldtype)
	pwd.SetSolo(bissolo)
	pwd.SetOutlined(bisoutlined)
	pwd.SetFilled(bisfilled)
	pwd.SetDense(bisdense)
	pwd.SetSingleLine(bissingleline)
	pwd.SetPersistentHint(bispersistenthint)
	pwd.SetShaped(bisshaped)
	pwd.SetLoading(bisloading)
	pwd.SetFlat(bisflat)
	pwd.SetRounded(bisrounded)
	pwd.SetClearable(bclearable)
	pwd.SetHideDetails(bishidedetails)
	pwd.SetValue(svalue)
	pwd.SetVisible(bisVisible)
	pwd.SetReadOnly(bisreadonly)
	pwd.SetDisabled(bisDisabled)
	If smargintop <> "" Then pwd.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then pwd.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then pwd.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then pwd.AddClass("mr-" & smarginright)
	If smargins <> "" Then pwd.AddClass("ms-" & smargins)
	If smargine <> "" Then pwd.AddClass("me-" & smargine)
	If smarginx <> "" Then pwd.AddClass("mx-" & smarginx)
	If smarginy <> "" Then pwd.AddClass("my-" & smarginy)
	If smargina <> "" Then pwd.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then pwd.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then pwd.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then pwd.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then pwd.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then pwd.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then pwd.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then pwd.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then pwd.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then pwd.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		pwd.Addclass(sfloat)
	End If
	ui.AddControl(pwd.TextField, pwd.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim pwd${sname} As VMTextField = vm.NewPassword(Me, ${bStatic}, "pwd${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, ${bToggle}, "${siconname}", ${imaxlen}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
	'
	CodeLine(sb, sfieldtype, "s", "pwd", sname, "SetFieldType")
	CodeLine(sb, bisreadonly, "b", "pwd", sname, "SetReadonly")
	CodeLine(sb, bisDisabled, "b", "pwd", sname, "SetDisabled")
	CodeLine(sb, bissolo, "b", "pwd", sname, "SetSolo")
	If sfloat <> "" Then
		AddCode(sb, $"pwd${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisoutlined, "b", "pwd", sname, "SetOutlined")
	CodeLine(sb, bisfilled, "b", "pwd", sname, "SetFilled")
	CodeLine(sb, bisdense, "b", "pwd", sname, "SetDense")
	CodeLine(sb, bissingleline, "b", "pwd", sname, "SetSingleLine")
	CodeLine(sb, bispersistenthint, "b", "pwd", sname, "SetPersistentHint")
	CodeLine(sb, bisshaped, "b", "pwd", sname, "SetShaped")
	CodeLine(sb, bisloading, "b", "pwd", sname, "SetLoading")
	CodeLine(sb, bisflat, "b", "pwd", sname, "SetFlat")
	CodeLine(sb, bisrounded, "b", "pwd", sname, "SetRounded")
	CodeLine(sb, bclearable, "b", "pwd", sname, "SetClearable")
	CodeLine(sb, bishidedetails, "b", "pwd", sname, "SetHideDetails")
	CodeLine(sb, svalue, "s", "pwd", sname, "SetValue")
	CodeLine(sb, bisVisible, "b", "pwd", sname, "SetVisible")
	'
	Dim pres As String = "pwd"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")

	sb.append($"${sparent}.AddControl(pwd${sname}.textfield, pwd${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Tel
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	Dim tel As VMTextField = ui.NewTel(Me, True, sname, svmodel, stitle, splaceholder, bisrequired, siconname, shelpertext, serrortext, stabindex)
	tel.SetFieldType(sfieldtype)
	tel.SetSolo(bissolo)
	tel.SetValue(svalue)
	tel.SetOutlined(bisoutlined)
	tel.SetFilled(bisfilled)
	tel.SetDense(bisdense)
	tel.SetSingleLine(bissingleline)
	tel.SetPersistentHint(bispersistenthint)
	tel.SetShaped(bisshaped)
	tel.SetLoading(bisloading)
	tel.SetFlat(bisflat)
	tel.SetRounded(bisrounded)
	tel.SetClearable(bclearable)
	tel.SetHideDetails(bishidedetails)
	tel.SetVisible(bisVisible)
	tel.SetReadOnly(bisreadonly)
	tel.SetDisabled(bisDisabled)
	If smargintop <> "" Then tel.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then tel.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then tel.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then tel.AddClass("mr-" & smarginright)
	If smargins <> "" Then tel.AddClass("ms-" & smargins)
	If smargine <> "" Then tel.AddClass("me-" & smargine)
	If smarginx <> "" Then tel.AddClass("mx-" & smarginx)
	If smarginy <> "" Then tel.AddClass("my-" & smarginy)
	If smargina <> "" Then tel.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then tel.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then tel.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then tel.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then tel.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then tel.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then tel.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then tel.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then tel.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then tel.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		tel.Addclass(sfloat)
	End If
	ui.AddControl(tel.TextField, tel.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim tel${sname} As VMTextField = vm.NewTel(Me, ${bStatic}, "tel${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, "${siconname}", "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)

	CodeLine(sb, svalue, "s", "tel", sname, "SetValue")
	CodeLine(sb, bisreadonly, "b", "tel", sname, "SetReadonly")
	CodeLine(sb, bisDisabled, "b", "tel", sname, "SetDisabled")
	CodeLine(sb, sfieldtype, "s", "tel", sname, "SetFieldType")
	CodeLine(sb, bissolo, "b", "tel", sname, "SetSolo")
	If sfloat <> "" Then
		AddCode(sb, $"tel${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisoutlined, "b", "tel", sname, "SetOutlined")
	CodeLine(sb, bisfilled, "b", "tel", sname, "SetFilled")
	CodeLine(sb, bisdense, "b", "tel", sname, "SetDense")
	CodeLine(sb, bissingleline, "b", "tel", sname, "SetSingleLine")
	CodeLine(sb, bispersistenthint, "b", "tel", sname, "SetPersistentHint")
	CodeLine(sb, bisshaped, "b", "tel", sname, "SetShaped")
	CodeLine(sb, bisloading, "b", "tel", sname, "SetLoading")
	CodeLine(sb, bisflat, "b", "tel", sname, "SetFlat")
	CodeLine(sb, bisrounded, "b", "tel", sname, "SetRounded")
	CodeLine(sb, bclearable, "b", "tel", sname, "SetClearable")
	CodeLine(sb, bishidedetails, "b", "tel", sname, "SetHideDetails")
	CodeLine(sb, bisVisible, "b", "tel", sname, "SetVisible")
	'
	Dim pres As String = "tel"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
		
	sb.append($"${sparent}.AddControl(tel${sname}.textfield, tel${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Time
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	Dim tp As VMDateTimePicker = ui.Newtimepicker(Me, True, sname, svmodel, stitle, bisrequired, splaceholder, shelpertext, serrortext, stabindex)
	tp.SetVisible(bisVisible)
	tp.SetDisabled(bisDisabled)
	tp.SetAmPmInTitle(bisampm)
	tp.SetDark(bisdark)
	tp.SetValue(svalue)
	tp.SetIsNow(bisnow)
	'tp.SetNotitle(bisnotitle)
	tp.SetUSeSeconds(bisuseseconds)
	'tp.SetColorIntensity(scolor, sintensity)
	'tp.SetHeaderColorIntensity(sheadercolor, sheaderintensity)
	tp.SetFormat(stformat)
	
	tp.TextField.SetPrependIcon(siconname)		
	tp.TextField.SetSolo(bissolo)
	tp.TextField.SetOutlined(bisoutlined)
	tp.TextField.SetFilled(bisfilled)
	tp.TextField.SetDense(bisdense)
	tp.TextField.SetSingleLine(bissingleline)
	tp.TextField.SetPersistentHint(bispersistenthint)
	tp.TextField.SetShaped(bisshaped)
	tp.TextField.SetLoading(bisloading)
	tp.TextField.SetFlat(bisflat)
	tp.TextField.SetRounded(bisrounded)
	tp.TextField.SetClearable(bclearable)
	tp.TextField.SetHideDetails(bishidedetails)
	If smargintop <> "" Then tp.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then tp.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then tp.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then tp.AddClass("mr-" & smarginright)
	If smargins <> "" Then tp.AddClass("ms-" & smargins)
	If smargine <> "" Then tp.AddClass("me-" & smargine)
	If smarginx <> "" Then tp.AddClass("mx-" & smarginx)
	If smarginy <> "" Then tp.AddClass("my-" & smarginy)
	If smargina <> "" Then tp.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then tp.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then tp.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then tp.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then tp.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then tp.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then tp.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then tp.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then tp.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then tp.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		tp.Addclass(sfloat)
	End If
	ui.AddControl(tp.DateTimePicker, tp.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim tp${sname} As VMDateTimePicker = vm.NewTimePicker(Me, ${bStatic}, "tp${sname}", "${svmodel}", "${stitle}", ${bisrequired}, "${splaceholder}", "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
	'
	CodeLine(sb, svalue, "s", "tp", sname, "SetValue")
	CodeLine(sb, bisVisible, "b", "tp", sname, "SetVisible")
	CodeLine(sb, bisDisabled, "b", "tp", sname, "SetDisabled")
	If sfloat <> "" Then
		AddCode(sb, $"tp${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisampm, "b", "tp", sname, "SetAmPmInTitle")
	CodeLine(sb, bisdark, "b", "tp", sname, "SetDark")
	CodeLine(sb, bisnow, "b", "tp", sname, "SetIsNow")
	'CodeLine(sb, bisnotitle, "b", "tp", sname, "SetNotitle")
	CodeLine(sb, bisuseseconds, "b", "tp", sname, "SetUSeSeconds")
	'If scolor <> "" Then sb.append($"tp${sname}.SetColorIntensity("${scolor}", "${sintensity}")"$).append(CRLF)
	'If sheadercolor <> "" Then sb.append($"tp${sname}.SetHeaderColorIntensity("${sheadercolor}", "${sheaderintensity}")"$).append(CRLF)
	'
	CodeLine(sb, siconname, "s", "tp", sname, "TextField.SetPrependIcon")
	CodeLine(sb, bissolo, "b", "tp", sname, "TextField.SetSolo")
	CodeLine(sb, bisoutlined, "b", "tp", sname, "TextField.SetOutlined")
	CodeLine(sb, bisfilled, "b", "tp", sname, "TextField.SetFilled")
	CodeLine(sb, bisdense, "b", "tp", sname, "TextField.SetDense")
	CodeLine(sb, bissingleline, "b", "tp", sname, "TextField.SetSingleLine")
	CodeLine(sb, bispersistenthint, "b", "tp", sname, "TextField.SetPersistentHint")
	CodeLine(sb, bisshaped, "b", "tp", sname, "TextField.SetShaped")
	CodeLine(sb, bisloading, "b", "tp", sname, "TextField.SetLoading")
	CodeLine(sb, bisflat, "b", "tp", sname, "TextField.SetFlat")
	CodeLine(sb, bisrounded, "b", "tp", sname, "TextField.SetRounded")
	CodeLine(sb, bclearable, "b", "tp", sname, "TextField.SetClearable")
	CodeLine(sb, bishidedetails, "b", "tp", sname, "TextField.SetHideDetails")
	
	'
	Dim pres As String = "tp"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	
	AddCode(sb, $"tp${sname}.SetOnChange(Me, "tp${sname}_change")"$)
	sb.append($"${sparent}.AddControl(tp${sname}.DateTimePicker, tp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub tp${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

Sub Design_Icon
	Dim icn As VMIcon = ui.NewIcon(Me, True, sname, siconname, ssize, sColor, sintensity)
	icn.SetDark(bisdark)
	icn.SetDense(bisdense)
	icn.SetDisabled(bisDisabled)
	icn.SetCenterOnParent(bcenteronparent)
	icn.SetLeft(bisleft)
	icn.SetRight(bisright)
	icn.SetVisible(bisVisible)
	If smargintop <> "" Then icn.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then icn.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then icn.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then icn.AddClass("mr-" & smarginright)
	If smargins <> "" Then icn.AddClass("ms-" & smargins)
	If smargine <> "" Then icn.AddClass("me-" & smargine)
	If smarginx <> "" Then icn.AddClass("mx-" & smarginx)
	If smarginy <> "" Then icn.AddClass("my-" & smarginy)
	If smargina <> "" Then icn.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then icn.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then icn.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then icn.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then icn.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then icn.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then icn.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then icn.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then icn.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then icn.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		icn.Addclass(sfloat)
	End If
	ui.AddControl(icn.Icon, icn.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim icn${sname} As VMIcon = vm.NewIcon(Me, True, "${sname}", "${siconname}", "${ssize}", "${sColor}", "${sintensity}")"$).append(CRLF)
	CodeLine(sb, bisdark, "b", "icn", sname, "SetDark")
	If sfloat <> "" Then
		AddCode(sb, $"icn${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisdense, "b", "icn", sname, "SetDense")
	CodeLine(sb, bisDisabled, "b", "icn", sname, "SetDisabled")
	CodeLine(sb, bcenteronparent, "b", "icn", sname, "SetCenterOnParent")
	CodeLine(sb, bisleft, "b", "icn", sname, "SetLeft")
	CodeLine(sb, bisright, "b", "icn", sname, "SetRight")
	CodeLine(sb, bisVisible, "b", "icn", sname, "SetVisible")
	'
	Dim pres As String = "icn"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	sb.append($"${sparent}.AddControl(icn${sname}.Icon, icn${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Parallax
	Dim para As VMParallax = ui.NewParallax(Me, True, sname, sheight, ssrc, salt)
	para.SetVisible(bisVisible)
	If sfloat <> "" Then
		para.Addclass(sfloat)
	End If
	If smargintop <> "" Then para.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then para.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then para.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then para.AddClass("mr-" & smarginright)
	If smargins <> "" Then para.AddClass("ms-" & smargins)
	If smargine <> "" Then para.AddClass("me-" & smargine)
	If smarginx <> "" Then para.AddClass("mx-" & smarginx)
	If smarginy <> "" Then para.AddClass("my-" & smarginy)
	If smargina <> "" Then para.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then para.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then para.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then para.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then para.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then para.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then para.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then para.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then para.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then para.AddClass("pa-" & spaddinga)


	ui.AddControl(para.Parallax, para.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim prlx${sname} As VMParallax = vm.NewParallax(Me, ${bStatic}, "prlx${sname}", "${sheight}", "${ssrc}", "${salt}")"$).append(CRLF)
	CodeLine(sb, bisVisible, "b", "prlx", sname, "SetVisible")
	'
	Dim pres As String = "prlx"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	If sfloat <> "" Then
		AddCode(sb, $"prlx${sname}.AddClass("${sfloat}")"$)
	End If
	sb.append($"${sparent}.AddControl(prlx${sname}.Parallax, prlx${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Container
	Dim cont As VMContainer = ui.NewContainer(Me, True, sname)
	cont.SetElevation(selevation)
	cont.SetTransition(stransition)
	cont.SetFluid(bisfluid)
	cont.SetShowMatrix(bisshowmatrix)
	cont.SetNoGutters(bisnogutters)
	cont.SetDiv(bisitemdiv)
	cont.SetVisible(bisVisible)
	cont.SetBorderRadius(sborderradius)
	cont.SetBorderWidth(sborderwidth)
	cont.SetBorderColor(sbordercolor)
	cont.SetBorderStyle(sborderstyle)
	cont.SetColorIntensity(sColor, sintensity)
	cont.SetWidth(swidth)
	cont.SetHeight(sheight)
	cont.SetMinWidth(sminwidth)
	cont.SetMaxWidth(smaxwidth)
	cont.SetMinHeight(sminheight)
	cont.SetMaxHeight(smaxheight)
	If smargintop <> "" Then cont.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then cont.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then cont.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then cont.AddClass("mr-" & smarginright)
	If smargins <> "" Then cont.AddClass("ms-" & smargins)
	If smargine <> "" Then cont.AddClass("me-" & smargine)
	If smarginx <> "" Then cont.AddClass("mx-" & smarginx)
	If smarginy <> "" Then cont.AddClass("my-" & smarginy)
	If smargina <> "" Then cont.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then cont.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then cont.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then cont.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then cont.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then cont.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then cont.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then cont.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then cont.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then cont.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		cont.Addclass(sfloat)
	End If
	ui.AddControl(cont.Container, cont.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim cont${sname} As VMContainer = vm.NewContainer(Me, cont${bStatic}, "cont${sname}")"$).append(CRLF)
	CodeLine(sb, bisnogutters, "b", "cont", sname, "SetNoGutters")
	CodeLine(sb, bisitemdiv, "b", "cont", sname, "SetDiv")
	CodeLine(sb, selevation, "s", "cont", sname, "SetElevation")
	CodeLine(sb, stransition, "s", "cont", sname, "SetTransition")
	CodeLine(sb, bisfluid, "b", "cont", sname, "SetFluid")
	If sfloat <> "" Then
		AddCode(sb, $"cont${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisshowmatrix, "b", "cont", sname, "SetShowMatrix")
	CodeLine(sb, bisVisible, "b", "cont", sname, "SetVisible")
	CodeLine(sb, sborderradius, "s", "cont", sname, "SetBorderRadius")
	CodeLine(sb, sborderwidth, "s", "cont", sname, "SetBorderWidth")
	CodeLine(sb, sbordercolor, "s", "cont", sname, "SetBorderColor")
	CodeLine(sb, sborderstyle, "s", "cont", sname, "SetBorderStyle")
	CodeLine(sb, swidth, "s", "cont", sname, "SetWidth")
	CodeLine(sb, sheight, "s", "cont", sname, "SetHeight")
	CodeLine(sb, sminwidth, "s", "cont", sname, "SetMinWidth")
	CodeLine(sb, smaxwidth, "s", "cont", sname, "SetMaxWidth")
	CodeLine(sb, sminheight, "s", "cont", sname, "SetMinHeight")
	CodeLine(sb, smaxheight, "s", "cont", sname, "SetMaxHeight")
	'
	Dim pres As String = "cont"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	If sColor <> "" Then sb.append($"cont${sname}.SetColorIntensity("${sColor}", "${sintensity}")"$).append(CRLF)
	sb.append($"${sparent}.AddControl(cont${sname}.Container, cont${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Image
	Dim img As VMImage = ui.NewImage(Me, True, sname, svmodel, ssrc, salt, swidth, sheight)
	img.SetLazysrc(slazysrc)
	img.SetBorderRadius(sborderradius)
	img.SetBorderWidth(sborderwidth)
	img.SetBorderColor(sbordercolor)
	img.SetBorderStyle(sborderstyle)
	img.SetAspectRatio(saspectratio)
	img.SetMinWidth(sminwidth)
	img.SetMaxWidth(smaxwidth)
	img.SetMinHeight(sminheight)
	img.SetMaxHeight(smaxheight)
	img.SetVisible(bisVisible)
	If smargintop <> "" Then img.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then img.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then img.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then img.AddClass("mr-" & smarginright)
	If smargins <> "" Then img.AddClass("ms-" & smargins)
	If smargine <> "" Then img.AddClass("me-" & smargine)
	If smarginx <> "" Then img.AddClass("mx-" & smarginx)
	If smarginy <> "" Then img.AddClass("my-" & smarginy)
	If smargina <> "" Then img.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then img.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then img.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then img.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then img.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then img.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then img.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then img.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then img.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then img.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		img.Addclass(sfloat)
	End If
	img.SetCenterOnParent(bcenteronparent)
				
	ui.AddControl(img.Image, img.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim img${sname} As VMImage = vm.NewImage(Me, ${bStatic}, "img${sname}", "${svmodel}", "${ssrc}", "${salt}", "${swidth}", "${sheight}")"$).append(CRLF)
	CodeLine(sb, slazysrc, "s", "img", sname, "SetLazysrc")
	If sfloat <> "" Then
		AddCode(sb, $"img${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, sborderradius, "s", "img", sname, "SetBorderRadius")
	CodeLine(sb, sborderwidth, "s", "img", sname, "SetBorderWidth")
	CodeLine(sb, sbordercolor, "s", "img", sname, "SetBorderColor")
	CodeLine(sb, sborderstyle, "s", "img", sname, "SetBorderStyle")
	CodeLine(sb, saspectratio, "s", "img", sname, "SetAspectRatio")
	CodeLine(sb, sminwidth, "s", "img", sname, "SetMinWidth")
	CodeLine(sb, smaxwidth, "s", "img", sname, "SetMaxWidth")
	CodeLine(sb, sminheight, "s", "img", sname, "SetMinHeight")
	CodeLine(sb, smaxheight, "s", "img", sname, "SetMaxHeight")
	CodeLine(sb, bcenteronparent, "b", "img", sname, "SetCenterOnParent")
	CodeLine(sb, bisVisible, "b", "img", sname, "SetVisible")
	'
	Dim pres As String = "img"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	
	sb.append($"${sparent}.AddControl(img${sname}.Image, img${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
End Sub

Sub Design_Drawer
	Dim drw As VMNavigationDrawer = ui.CreateDrawer(sname, Me)
	drw.SetStatic(True)
	drw.AddTitleSubTitle(smtitle,smsubtitle)
	drw.SetcolorIntensity(sColor,sintensity)
	drw.Setminivariantwidth(sminivariantwidth)
	drw.Setmobilebreakpoint(smobilebreakpoint)
	drw.Setoverlaycolor(soverlaycolor)
	drw.Setoverlayopacity(soverlayopacity)
	drw.Setsrc(ssrc)
	drw.Settag(stag)
	drw.Setheight(sheight)
	drw.Setwidth(swidth)
	drw.Setabsolute(bisabsolute)
	drw.Setapp(bisapp)
	drw.Setbottom(bisbottom)
	drw.Setclipped(bisclipped)
	drw.Setdark(bisdark)
	drw.Setdisableresizewatcher(bisdisableresizewatcher)
	drw.Setdisableroutewatcher(bisdisableroutewatcher)
	drw.Setexpandonhover(bisexpandonhover)
	drw.Setfixed(bisfixed)
	drw.Setfloating(bisfloating)
	drw.Sethideoverlay(bishideoverlay)
	drw.Setlight(bislight)
	drw.Setminivariant(bisminivariant)
	drw.Setpermanent(bispermanent)
	drw.Setright(bisright)
	drw.Setstateless(bisstateless)
	drw.Settemporary(bistemporary)
	drw.Settouchless(bistouchless)
	drw.Setvisible(bisVisible)
	If smargintop <> "" Then drw.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then drw.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then drw.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then drw.AddClass("mr-" & smarginright)
	If smargins <> "" Then drw.AddClass("ms-" & smargins)
	If smargine <> "" Then drw.AddClass("me-" & smargine)
	If smarginx <> "" Then drw.AddClass("mx-" & smarginx)
	If smarginy <> "" Then drw.AddClass("my-" & smarginy)
	If smargina <> "" Then drw.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then drw.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then drw.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then drw.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then drw.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then drw.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then drw.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then drw.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then drw.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then drw.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		drw.Addclass(sfloat)
	End If
	'
	'link events
	If bismasterdrawer = False Then
		AddNewLine(sbEvents)
		AddCode(sbEvents, $"Sub drw${sname}Items_click(e As BANanoEvent)"$)
		AddCode(sbEvents, $"Dim itemID As String = vm.GetIDFromEvent(e)"$)
		AddCode(sbEvents, $"Select Case itemID"$)
	Else
		AddNewLine(sbEvents)
		If lcontents.Size > 0 Then
			AddInstruction(sbEvents, "pgIndex", "drawerItems_click", "inside the case statement")
		End If
	End If
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssavatar As String = m.getdefault("avatar", "")
		Dim ssiconname As String = m.getdefault("icon", "")
		Dim sIconcolor As String = m.getdefault("iconcolor", "")
		Dim sstitle As String = m.getdefault("title", "")
		Dim sssubtitle As String = m.GetDefault("subtitle", "")
		Dim ssactionicon As String = m.getdefault("action", "")
		If sskey = "" Then Continue
		drw.AddItem1(sskey, ssavatar, ssiconname, sIconcolor, sstitle, sssubtitle, "", ssactionicon, "")
		If bisdivider Then drw.AddDivider1(bisinset)
		AddCode(sbEvents, $"Case "${sskey}""$)
	Next
	'
	If bismasterdrawer = False Then
		AddCode(sbEvents,"End Select")
		AddCode(sbEvents, "End Sub")
	End If
	'
	ui.AddControl(drw.NavigationDrawer, drw.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	
	'
	Dim prefix As String = "drw"
	Dim suffix As String = sname
	If bismasterdrawer Then
		prefix = "vm.Drawer"
		suffix = ""
	End If
	
	If bismasterdrawer = False Then
		AddInstruction(sb, "Your", "Process_Globals","")
		AddNewLine(sb)
		AddCode(sb, $"Private drw${sname} As VMNavigationDrawer"$)
		AddNewLine(sb)
	
		AddInstruction(sb, "Your", "Code","")
		AddNewLine(sb)
		AddCode(sb, $"Sub CreateDrawer_${sname}"$)
		sb.append($"drw${sname} = vm.CreateDrawer("drw${sname}", Me)"$).append(CRLF)
	Else
		AddInstruction(sb, "pgIndex", "BuildNavDrawer", "")
	End If
	
	CodeLine2(sb, smtitle, smsubtitle, "s", prefix, suffix, "AddTitleSubTitle")
	CodeLine2(sb, sColor, sintensity, "s", prefix, suffix, "SetColorIntensity")
	CodeLine(sb, sminivariantwidth, "s", prefix, suffix, "Setminivariantwidth")
	CodeLine(sb, smobilebreakpoint, "s", prefix, suffix, "Setmobilebreakpoint")
	CodeLine(sb, soverlaycolor, "s", prefix, suffix, "Setoverlaycolor")
	'
	CodeLine(sb, "mt-" & smargintop, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", prefix, suffix, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", prefix, suffix, "AddClass")
	'
	If sfloat <> "" Then
		AddCode(sb, $"${prefix}${suffix}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, soverlayopacity, "s", prefix, suffix, "Setoverlayopacity")
	CodeLine(sb, ssrc, "s", prefix, suffix, "Setsrc")
	CodeLine(sb, stag, "s", prefix, suffix, "Settag")
	CodeLine(sb, swidth, "s", prefix, suffix, "Setwidth")
	CodeLine(sb, sheight, "s", prefix, suffix, "Setheight")
	'
	CodeLine(sb, bisabsolute, "b", prefix, suffix, "Setabsolute")
	CodeLine(sb, bisapp, "b", prefix, suffix, "Setapp")
	CodeLine(sb, bisbottom, "b", prefix, suffix, "Setbottom")
	CodeLine(sb, bisclipped, "b", prefix, suffix, "Setclipped")
	CodeLine(sb, bisdark, "b", prefix, suffix, "Setdark")
	CodeLine(sb, bisdisableresizewatcher, "b", prefix, suffix, "Setdisableresizewatcher")
	CodeLine(sb, bisdisableroutewatcher, "b", prefix, suffix, "Setdisableroutewatcher")
	CodeLine(sb, bisexpandonhover, "b", prefix, suffix, "Setexpandonhover")
	CodeLine(sb, bisfixed, "b", prefix, suffix, "Setfixed")
	CodeLine(sb, bisfloating, "b", prefix, suffix, "Setfloating")
	CodeLine(sb, bishideoverlay, "b", prefix, suffix, "Sethideoverlay")
	CodeLine(sb, bislight, "b", prefix, suffix, "Setlight")
	CodeLine(sb, bisminivariant, "b", prefix, suffix, "Setminivariant")
	CodeLine(sb, bispermanent, "b", prefix, suffix, "Setpermanent")
	CodeLine(sb, bisright, "b", prefix, suffix, "Setright")
	CodeLine(sb, bisstateless, "b", prefix, suffix, "Setstateless")
	CodeLine(sb, bistemporary, "b", prefix, suffix, "Settemporary")
	CodeLine(sb, bistouchless, "b", prefix, suffix, "Settouchless")
	CodeLine(sb, bisVisible, "b", prefix, suffix, "Setvisible")
	'
	If buseoptions Then
		For Each m As Map In lcontents
			Dim sskey As String = m.getdefault("key", "")
			Dim ssavatar As String = m.getdefault("avatar", "")
			Dim ssiconname As String = m.getdefault("icon", "")
			Dim sIconcolor As String = m.GetDefault("iconcolor", "")
			Dim sstitle As String = m.getdefault("title", "")
			Dim sssubtitle As String = m.GetDefault("subtitle", "")
			Dim ssactionicon As String = m.getdefault("action", "")
			If sskey = "" Then Continue
			sb.append($"${prefix}${suffix}.AddItem1("${sskey}", "${ssavatar}", "${ssiconname}", "${sIconcolor}", "${sstitle}", "${sssubtitle}", "", "${ssactionicon}", "")"$).append(CRLF)
			If bisdivider Then AddCode(sb,$"${prefix}${suffix}.AddDivider1(${bisinset})"$)
		Next
	Else
		'set data source
		AddCode(sb, $"vm.setdata("${sDatasource}", vm.newlist)"$)
		AddCode(sb, $"${prefix}${suffix}.SetDataSourceTemplate1("${sDatasource}","${sKeyfld}","${sAvatarfld}","${sIconfld}","${sIconcolorfld}","${sTitlefld}","${sSubtitlefld}","${sSubtitle1fld}","${sActioniconfld}","${sActioniconcolorfld}")"$)
	End If
	'
	If bismasterdrawer = False Then
		AddComment(sb, "Paste code here to to add container components")
		AddNewLine(sb)		
		AddCode(sb, $"vm.AddDrawer(drw${sname})"$)
		AddCode(sb, "End Sub")
		AddNewLine(sb)
		AddCode(sb, $"Sub ShowDrawer_${sname}"$)
		AddCode(sb, $"vm.ShowDrawer("drw${sname}")"$)
		AddCode(sb, "End Sub")
		AddNewLine(sb)
		AddCode(sb, $"Sub HideDrawer_${sname}"$)
		AddCode(sb, $"vm.HideDrawer("drw${sname}")"$)
		AddCode(sb, "End Sub")
		AddNewLine(sb)
	End If
End Sub

Sub Design_SpeedDial
	Dim speeddial As VMSpeedDial = ui.CreateSpeedDial(sname, Me)
	speeddial.SetStatic(True)
	speeddial.SetAbsolute(bisabsolute)
	speeddial.SetBottom(bisbottom)
	speeddial.SetDark(bisdark)
	speeddial.SetIcon(smastericon)
	speeddial.SetDirection(sDirection)
	speeddial.SetFinalicon(sFinalicon)
	speeddial.SetFixed(bisfixed)
	speeddial.SetHref(shref)
	speeddial.SetInitialicon(sInitialicon)
	speeddial.SetLarge(bisLarge)
	speeddial.SetLeft(bisleft)
	speeddial.SetMode(sMode)
	speeddial.SetOpenonhover(bisopenonhover)
	speeddial.SetOrigin(sorigin)
	speeddial.SetRight(bisright)
	speeddial.SetSmall(bisSmall)
	speeddial.SetTarget(starget)
	speeddial.SetTo(sTo)
	speeddial.SetTop(bistop)
	speeddial.SetTransition(stransition)
	speeddial.SetVisible(bisVisible)
	speeddial.SetXlarge(bisXlarge)
	speeddial.SetXsmall(bisXsmall)
	speeddial.SetColorIntensity(sColor, sintensity)
	speeddial.SetTextColorIntensity(stextcolor, stextintensity)
	If smargintop <> "" Then speeddial.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then speeddial.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then speeddial.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then speeddial.AddClass("mr-" & smarginright)
	If smargins <> "" Then speeddial.AddClass("ms-" & smargins)
	If smargine <> "" Then speeddial.AddClass("me-" & smargine)
	If smarginx <> "" Then speeddial.AddClass("mx-" & smarginx)
	If smarginy <> "" Then speeddial.AddClass("my-" & smarginy)
	If smargina <> "" Then speeddial.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then speeddial.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then speeddial.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then speeddial.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then speeddial.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then speeddial.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then speeddial.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then speeddial.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then speeddial.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then speeddial.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		speeddial.Addclass(sfloat)
	End If
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssiconname As String = m.getdefault("icon", "")
		Dim sIconcolor As String = m.GetDefault("iconcolor", "")
		If sskey = "" Then Continue
		speeddial.AddItem(sskey, ssiconname, sIconcolor)
		'
		AddCode(sbEvents, $"Private Sub ${sskey}_click(e As BANanoEvent)"$)
		AddCode(sbEvents, "End Sub")
		AddNewLine(sbEvents)
	Next
	ui.AddControl(speeddial.SpeedDial, speeddial.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim spd${sname} As VMSpeedDial = vm.CreateSpeedDial("spd${sname}", Me)"$).append(CRLF)
	CodeLine(sb, bisabsolute, "b", "spd", sname, "SetAbsolute")
	CodeLine(sb, bisbottom, "b", "spd", sname, "SetBottom")
	CodeLine(sb, bisdark, "b", "spd", sname, "SetDark")
	CodeLine(sb, sDirection, "s", "spd", sname, "SetDirection")
	CodeLine(sb, sFinalicon, "s", "spd", sname, "SetFinalicon")
	CodeLine(sb, bisfixed, "b", "spd", sname, "SetFixed")
	CodeLine(sb, shref, "s", "spd", sname, "SetHref")
	If sfloat <> "" Then
		AddCode(sb, $"spd${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, smastericon, "s", "spd", sname, "SetIcon")
	CodeLine(sb, sInitialicon, "s", "spd", sname, "SetInitialicon")
	CodeLine(sb, bisLarge, "b", "spd", sname, "SetLarge")
	CodeLine(sb, bisleft, "b", "spd", sname, "SetLeft")
	CodeLine(sb, sMode, "s", "spd", sname, "SetMode")
	CodeLine(sb, bisopenonhover, "b", "spd", sname, "SetOpenonhover")
	CodeLine(sb, sorigin, "s", "spd", sname, "SetOrigin")
	CodeLine(sb, bisright, "b", "spd", sname, "SetRight")
	CodeLine(sb, bisSmall, "b", "spd", sname, "SetSmall")
	CodeLine(sb, stabindex, "s", "spd", sname, "SetTabindex")
	CodeLine(sb, starget, "s", "spd", sname, "SetTarget")
	CodeLine(sb, sTo, "s", "spd", sname, "SetTo")
	CodeLine(sb, bistop, "b", "spd", sname, "SetTop")
	CodeLine(sb, stransition, "s", "spd", sname, "SetTransition")
	CodeLine(sb, bisVisible, "b", "spd", sname, "SetVisible")
	CodeLine(sb, bisXlarge, "b", "spd", sname, "SetXlarge")
	CodeLine(sb, bisXsmall, "b", "spd", sname, "SetXsmall")
	
	'
	Dim pres As String = "spd"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")

	CodeLine2(sb, sColor, sintensity, "s", "spd", sname, "SetColorIntensity")
	CodeLine2(sb, stextcolor, stextintensity, "s", "spd", sname, "SetTextColorIntensity")
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssiconname As String = m.getdefault("icon", "")
		Dim sIconcolor As String = m.GetDefault("iconcolor", "")
		If sskey = "" Then Continue
		sb.append($"spd${sname}.AddItem("${sskey}", "${ssiconname}", "${sIconcolor}")"$).append(CRLF)
	Next
	If bismainclick Then
		AddCode(sb, $"spd${sname}.SetOnClick("spd${sname}_click")"$)
		AddCode(sbEvents, $"Private Sub spd${sname}_click(e As BANanoEvent)"$)
		AddCode(sbEvents, "End Sub")
	End If
	
	'
	sb.append($"${sparent}.AddControl(spd${sname}.SpeedDial, spd${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Dialog
	Dim dialog As VMCard = ui.CreateCard(sname, Me)
    dialog.SetStatic(True)
	dialog.IsDialog = True
	dialog.SetTitle(stitle)
	dialog.Actions.AddSpacer
	dialog.SetCancel(sCancelid, sCancelcaption)
	dialog.SetOK(sOkid, sOkcaption)
	dialog.Settitleprimary(bistitleprimary)
	dialog.Setdark(bisdark)
	dialog.Setdisabled(bisDisabled)
	dialog.Setwidth(swidth)
	dialog.Setmaxwidth(smaxwidth)
	dialog.Setlight(bislight)
	If sfloat <> "" Then
		dialog.Addclass(sfloat)
	End If
	ui.AddControl(dialog.Card, dialog.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)

	
'	Dim dialog As VMDialog = ui.createdialog("dialog" & sname, Me)
'	dialog.SetStatic(True)
'	dialog.SetTitle(stitle)
'	dialog.Setactivator(sactivator)
'	dialog.Setcontentclass(scontentclass)
'	dialog.Setorigin(sorigin)
'	dialog.SetOverlayColorIntensity(soverlaycolor, soverlaycolorintensity)
'	dialog.Setoverlayopacity(soverlayopacity)
'	dialog.Settransition(stransition)
'	dialog.Setwidth(swidth)
'	dialog.Setmaxwidth(smaxwidth)
'	dialog.SetCancel(sCancelid, sCancelcaption)
'	dialog.SetOK(sOkid, sOkcaption)
'	'
'	dialog.Setattach(bisattach)
'	dialog.Setbackdrop(bisbackdrop)
'	dialog.Setdark(bisdark)
'	dialog.Setdisabled(bisdisabled)
'	dialog.Seteager(biseager)
'	dialog.Setfullscreen(bisfullscreen)
'	dialog.Sethideoverlay(bishideoverlay)
'	dialog.Setinternalactivator(bisinternalactivator)
'	dialog.Setlight(bislight)
'	dialog.Setnoclickanimation(bisnoclickanimation)
'	dialog.Setopenonhover(bisopenonhover)
'	dialog.Setpersistent(bispersistent)
'	dialog.Setretainfocus(bisretainfocus)
'	dialog.Setscrollable(bisscrollable)
'	dialog.Setslotactivator(bisslotactivator)
'	dialog.Settitleprimary(bistitleprimary)
'	'this is an invisible component
'	ui.AddControl(dialog.Dialog, dialog.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)

	'create the source code
	AddInstruction(sb, "<Your Module>", "Process_Globals","")
	AddNewLine(sb)
	sb.append($"Private dlg${sname} As VMDialog"$).append(CRLF).append(CRLF)
	'	
	AddNewLine(sb)
	AddInstruction(sb, "<Your Module>", "Code","")
	AddComment(sb, "add the dialog to page")
	sb.append($"CreateDialog_${sname}"$).append(CRLF)
	'
	If bisshowonopen Then
		AddNewLine(sb)
		AddInstruction(sb, "<Your Module>", "Show","")
		AddComment(sb, "show the dialog on open")
		sb.append($"dlg${sname}.Show"$).append(CRLF)
	End If
	
	AddNewLine(sb)
	AddInstruction(sb, "<Your Module>", "", "")
	AddNewLine(sb)
	AddComment(sb, "create dialog")
	sb.append($"Sub CreateDialog_${vm.propercase(sname)}"$).append(CRLF)
	sb.append($"dlg${sname} = vm.CreateDialog("dlg${sname}", Me)"$).Append(CRLF)
	'
	CodeLine(sb, stitle, "s", "dlg", sname, "Settitle")
	CodeLine2(sb, sCancelid, sCancelcaption, "s", "dlg", sname, "SetCancel")
	CodeLine2(sb, sOkid, sOkcaption, "s", "dlg", sname, "SetOk")
	CodeLine(sb, sactivator, "s", "dlg", sname, "Setactivator")
	CodeLine(sb, scontentclass, "s", "dlg", sname, "Setcontentclass")
	CodeLine(sb, sorigin, "s", "dlg", sname, "Setorigin")
	CodeLine(sb, soverlaycolor, "s", "dlg", sname, "Setoverlaycolor")
	CodeLine(sb, soverlaycolorintensity, "s", "dlg", sname, "Setoverlaycolorintensity")
	CodeLine(sb, soverlayopacity, "s", "dlg", sname, "Setoverlayopacity")
	CodeLine(sb, stransition, "s", "dlg", sname, "Settransition")
	CodeLine(sb, swidth, "s", "dlg", sname, "Setwidth")
	CodeLine(sb, smaxwidth, "s", "dlg", sname, "Setmaxwidth")
	'
	CodeLine(sb, bisattach, "b", "dlg", sname, "Setattach")
	CodeLine(sb, bisbackdrop, "b", "dlg", sname, "Setbackdrop")
	CodeLine(sb, bisdark, "b", "dlg", sname, "Setdark")
	CodeLine(sb, bisDisabled, "b", "dlg", sname, "Setdisabled")
	CodeLine(sb, biseager, "b", "dlg", sname, "Seteager")
	CodeLine(sb, bisfullscreen, "b", "dlg", sname, "Setfullscreen")
	CodeLine(sb, bishideoverlay, "b", "dlg", sname, "Sethideoverlay")
	CodeLine(sb, bisinternalactivator, "b", "dlg", sname, "Setinternalactivator")
	CodeLine(sb, bislight, "b", "dlg", sname, "Setlight")
	CodeLine(sb, bisnoclickanimation, "b", "dlg", sname, "Setnoclickanimation")
	CodeLine(sb, bisopenonhover, "b", "dlg", sname, "Setopenonhover")
	CodeLine(sb, bispersistent, "b", "dlg", sname, "Setpersistent")
	CodeLine(sb, bisretainfocus, "b", "dlg", sname, "Setretainfocus")
	CodeLine(sb, bisscrollable, "b", "dlg", sname, "Setscrollable")
	CodeLine(sb, bisslotactivator, "b", "dlg", sname, "Setslotactivator")
	CodeLine(sb, bistitleprimary, "b", "dlg", sname, "SetTitlePrimary")
	sb.append($"vm.AddDialog(dlg${sname})"$).append(CRLF)
	sb.append("End Sub").append(CRLF)
	'
	'**** SAVE THE RECORD
	AddNewLine(sb)
	AddComment(sb, $"add code to process the details of ${sname}"$)
	sb.append($"Sub ${sOkid}_click(e As BANanoEvent)"$).append(CRLF)
	AddComment(sb, "get the record")
	sb.append($"Dim Record As Map = dlg${sname}.Container.GetData"$).append(CRLF)
	AddComment(sb, "validate the record")
	sb.append($"Dim bValid As Boolean = vm.Validate(Record, dlg${sname}.Container.Required)"$).append(CRLF)
	AddComment(sb, "if invalid exit")
	AddCode(sb, $"If bValid = False Then"$)
	AddCode(sb, $"Dim strError As String = vue.GetError"$)
	AddCode(sb, $"vm.ShowSnackBarError(strError)"$)
	AddCode(sb, "Return")
	AddCode(sb, "End If")
	'execute other stuff
	
	Dim diagName As String = $"dlg${sname}"$
	Dim rsName As String = $"rslt${stablename}"$
	Select Case sclickaction
	Case "showfs"
		'show file select
	Case "read"
		sb.append($"Dim RecID As String = Record.Get("${sprimarykey}")"$).append(CRLF)
		AddComment(sb,"read record from database")
		'read record from the database
		Select Case sdbtype
		Case "banano"
			AddComment(sb, "database variable")
			sb.append($"Dim db As BANanoSQL"$).append(CRLF)
			AddComment(sb, "open the database and wait")
			sb.append($"db.OpenWait("${sdatabasename}", "${sdatabasename}")"$).append(CRLF)
			AddComment(sb, "resultset variable")
			sb.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
			AddComment(sb, "initialize table for reading")
			sb.append($"${rsName}.Initialize("${stablename}", "${sprimarykey}")"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
			sb.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
			AddComment(sb, "initialize table for table creation")
			sb.append($"${rsName}.Initialize("${sdatabasename}", "${stablename}", "${sprimarykey}", "${sprimarykey}")"$).append(CRLF)
		End Select
		'
		AddComment(sb, "define schema for record")
		sb.append($"${rsName}.SchemaFromDesign(${diagName}.Container)"$).append(CRLF)
		AddComment(sb, "generate & run command to read record")
		sb.append($"${rsName}.Read(RecID)"$).append(CRLF)
		Select Case sdbtype
		Case "banano"
			sb.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
			AddCode(sb, $"${rsName}.JSON = BANano.CallInlinePHPWait(${rsName}.MethodName, ${rsName}.Build)"$)
		End Select
		AddCode(sb, $"${rsName}.FromJSON"$)
		AddComment(sb, "was the read successful?")
		sb.append($"If ${rsName}.Result.Size = 0 Then Return"$).append(CRLF)
		AddComment(sb, "the record as found!")
		sb.append($"Dim Record As Map = ${rsName}.result.get(0)"$).append(CRLF)
		AddComment(sb, "update the state, this updates the v-model(s) for each input control")
		sb.append($"vm.SetState(Record)"$).append(CRLF)
	Case "sendcredentials"
		AddComment(sbEvents, "read the contents!")
		AddCode(sbEvents, $"Dim sfirstname As String = Record.get(?)"$)
		AddCode(sbEvents, $"Dim semail As String = Record.get(?)"$)
		AddCode(sbEvents, $"Dim spassword As String = Record.get(?)"$)
		AddComment(sbEvents, "Build the message")
		AddCode(sbEvents, $"Dim nmsg As String = "Good Day " & sfirstname & "||Your Sign In credentials are the following:||Your Email: " & semail & "||Your Password: " & spassword||Regards|${sprojectname} Development Team|"$)
		Dim subject As String = $"${sprojectname}: Sign In Credentials"$
		AddCode(sbEvents, $"Dim se As Map = CreateMap()"$)
		AddCode(sbEvents, $"se.put("from", "${ssenderemail}")"$)
		AddCode(sbEvents, $"se.put("to", "${ssendtoemail}")"$)
		AddCode(sbEvents, $"se.put("cc", "${sccemail}")"$)
		AddCode(sbEvents, $"se.put("subject", "${subject}")"$)
		AddCode(sbEvents, $"se.put("msg", nmsg)"$)
		AddComment(sbEvents, "Send the message and wait for response")
		AddCode(sbEvents, $"vm.PagePause"$)
		AddCode(sbEvents, $"Dim Result As String = BANano.CallInlinePHPWait("SendEmail", se)"$)
		AddCode(sbEvents, $"Dim ResultM As Map = BANano.FromJSON(Result)"$)
		AddComment(sbEvents, "What is the result of the response from SMTP")
		AddCode(sbEvents, $"Dim Response As String = ResultM.Get("response")"$)
		AddCode(sbEvents, $"vm.PageResume"$)
		AddCode(sbEvents, $"Select Case Response"$)
		AddCode(sbEvents, $"Case "failure""$)
		AddCode(sbEvents, $"vm.ShowSnackBarError("An error was experienced sending the email!")"$)
		AddCode(sbEvents, "Case Else")
		AddCode(sbEvents, $"vm.ShowSnackBarSuccess("Information was sent successfully.")"$)
		AddCode(sbEvents, "End Select")
		AddNewLine(sbEvents)
	Case "contactus"
		AddComment(sbEvents, "read the contents!")
		AddCode(sbEvents, $"Dim sfullname As String = Record.get(?)"$)
		AddCode(sbEvents, $"Dim semail As String = Record.get(?)"$)
		AddCode(sbEvents, $"Dim sphone As String = Record.get(?)"$)
		AddCode(sbEvents, $"Dim scomment As String = Record.get(?)"$)
		AddComment(sbEvents, "Build the message")
		AddCode(sbEvents, $"Dim nmsg As String = "Full Name: " & sfullname & "||Email Address: " & semail & "||Telephone: " & sphone & "||Message:||" & scomment"$)
		AddCode(sbEvents, $"Dim se As Map = CreateMap()"$)
		AddCode(sbEvents, $"se.put("from", "${ssenderemail}")"$)
		AddCode(sbEvents, $"se.put("to", "${ssendtoemail}")"$)
		AddCode(sbEvents, $"se.put("cc", "${sccemail}")"$)
		AddCode(sbEvents, $"se.put("subject", "${sprojectname} Contact Us: " & sfullname)"$)
		AddCode(sbEvents, $"se.put("msg", nmsg)"$)
		AddComment(sbEvents, "Send the message and wait for response")
		AddCode(sbEvents, $"vm.PagePause"$)
		AddCode(sbEvents, $"Dim Result As String = BANano.CallInlinePHPWait("SendEmail", se)"$)
		AddCode(sbEvents, $"Dim ResultM As Map = BANano.FromJSON(Result)"$)
		AddComment(sbEvents, "What is the result of the response from SMTP")
		AddCode(sbEvents, $"Dim Response As String = ResultM.Get("response")"$)
		AddCode(sbEvents, $"vm.PageResume"$)
		AddCode(sbEvents, $"Select Case Response"$)
		AddCode(sbEvents, $"Case "failure""$)
		AddCode(sbEvents, $"vm.ShowSnackBarError("An error was experienced sending the information!")"$)
		AddCode(sbEvents, "Case Else")
		AddCode(sbEvents, $"vm.ShowSnackBarSuccess("Information was sent successfully.")"$)
		AddCode(sbEvents, "End Select")
		AddNewLine(sbEvents)
	Case "add"
		Select Case sdbtype
		Case "banano"
			AddComment(sb, "database variable")
			sb.append($"Dim db As BANanoSQL"$).append(CRLF)
			AddComment(sb, "open the database and wait")
			sb.append($"db.OpenWait("${sdatabasename}", "${sdatabasename}")"$).append(CRLF)
			'add a record to database
			If bisautoincrement = True Then
				Select Case sdbtype
				Case "banano"
					AddComment(sb, "generate max value")
					sb.append($"Dim nextID As Int = 0"$).append(CRLF)
					AddComment(sb, "generate & run command to get max value")
					AddComment(sb, "initialize table")
					sb.append($"${rsName}.Initialize("${stablename}", "${sprimarykey}")"$).append(CRLF)
					sb.append($"${rsName}.GetMax"$).append(CRLF)
					sb.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
					AddCode(sb, $"${rsName}.FromJSON"$)
					sb.append($"nextID = ${rsName}.GetNextID"$).append(CRLF)
					AddComment(sb, "update the record with the next id")
					sb.append($"Record.Put("${sprimarykey}", nextID)"$).append(CRLF)
				Case "sqlite"
					sb.append($"Record.Put("${sprimarykey}", Null)"$).append(CRLF)
				Case "mssql"
					'remove the auto key as its identity
					AddComment(sb, "remove the primary key")
					AddCode(sb, $"Record.Remove("${sprimarykey}")"$)
				End Select
			End If
			
			AddComment(sb, "initialize table for insert")
			sb.append($"${rsName}.Initialize("${stablename}", "${sprimarykey}")"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
			sb.append($"${rsName}.Initialize("${sdatabasename}", "${stablename}", "${sprimarykey}", "${sprimarykey}")"$).append(CRLF)
		End Select
		'
		AddComment(sb, "define schema for record")
		sb.append($"${rsName}.SchemaFromDesign(${diagName}.Container)"$).append(CRLF)
		AddComment(sb, "insert a record")
		sb.append($"${rsName}.Insert1(Record)"$).append(CRLF)
		AddComment(sb, "generate & run command to insert record")
		Select Case sdbtype
		Case "banano"
			sb.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
			AddCode(sb, $"${rsName}.JSON = BANano.CallInlinePHPWait(${rsName}.MethodName, ${rsName}.Build)"$)
		End Select
		AddCode(sb, $"${rsName}.FromJSON"$)
	Case "save"
		AddComment(sb, "read record id")
		sb.append($"Dim RecID As String = Record.Get("${sprimarykey}")"$).append(CRLF)
		'
		AddComment(sb, "initialize table for update")
		Select Case sdbtype
		Case "banano"
			AddComment(sb, "database variable")
			sb.append($"Dim db As BANanoSQL"$).append(CRLF)
			AddComment(sb, "open the database and wait")
			sb.append($"db.OpenWait("${sdatabasename}", "${sdatabasename}")"$).append(CRLF)
			sb.append($"${rsName}.Initialize("${stablename}", "${sprimarykey}")"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
			sb.append($"${rsName}.Initialize("${sdatabasename}", "${stablename}", "${sprimarykey}", "${sprimarykey}")"$).append(CRLF)
			If bisautoincrement = True Then
				Select Case sdbtype
				Case "mssql"
					'remove the primary key for addition
					AddComment(sb, "remove the primary key")
					AddCode(sb, $"Record.Remove("${sprimarykey}")"$)
				End Select
			End If
		End Select
			'
		AddComment(sb, "define schema for record")
		sb.append($"${rsName}.SchemaFromDesign(${diagName}.Container)"$).append(CRLF)
		AddComment(sb, "update a record")
		sb.append($"${rsName}.Update1(Record, RecID)"$).append(CRLF)
		AddComment(sb, "generate & run command to update record")
		Select Case sdbtype
		Case "banano"
			sb.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
			AddCode(sb, $"${rsName}.JSON = BANano.CallInlinePHPWait(${rsName}.MethodName, ${rsName}.Build)"$)
		End Select
		AddCode(sb, $"${rsName}.FromJSON"$)
		sb.append($"End Select"$).append(CRLF)
	Case "delete"
	End Select
	AddCode(sb, "End Sub")
	AddNewLine(sb)
	'
	'**** CANCEL DIALOG
	'add code to cancel the dialog
	AddNewLine(sb)
	AddComment(sb, $"add code to cancel the dialog for ${sname}"$)
	sb.append($"Sub ${sCancelid}_click(e As BANanoEvent)"$).append(CRLF)
	AddComment(sb, "hide the modal")
	AddCode(sb, $"dlg${sname}.Hide"$)
	sb.append("End Sub").append(CRLF).append(CRLF)
	
End Sub

Sub Design_Carousel
	Dim carousel As VMCarousel = ui.CreateCarousel(sname, Me)
	carousel.SetStatic(True)
	'
	carousel.Setactiveclass(sactiveclass)
	carousel.Setdelimitericon(sdelimitericon)
	carousel.Setheight(sheight)
	carousel.Setinterval(sinterval)
	carousel.Setmax(smmax)
	carousel.SetVerticalDelimiters(sverticaldelimiter)
	carousel.SetProgressColorIntensity(sprogresscolor, sprogresscolorintensity)
	'
	carousel.Setcontinuous(biscontinuous)
	carousel.Setcycle(biscycle)
	carousel.Setdark(bisdark)
	carousel.Sethidedelimiterbackground(bishidedelimiterbackground)
	carousel.Sethidedelimiters(bishidedelimiters)
	carousel.Setlight(bislight)
	carousel.Setmandatory(bismandatory)
	'carousel.Setmultiple(bismultiple)
	carousel.Setnexticon(bisnexticon)
	carousel.Setprevicon(bisprevicon)
	carousel.Setprogress(bisprogress)
	carousel.Setreverse(bisreverse)
	carousel.Setshowarrows(bisshowarrows)
	carousel.Setshowarrowsonhover(bisshowarrowsonhover)
	carousel.Settouchless(bistouchless)
	carousel.Setvertical(bisvertical)
	carousel.Setvisible(bisVisible)
	If smargintop <> "" Then carousel.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then carousel.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then carousel.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then carousel.AddClass("mr-" & smarginright)
	If smargins <> "" Then carousel.AddClass("ms-" & smargins)
	If smargine <> "" Then carousel.AddClass("me-" & smargine)
	If smarginx <> "" Then carousel.AddClass("mx-" & smarginx)
	If smarginy <> "" Then carousel.AddClass("my-" & smarginy)
	If smargina <> "" Then carousel.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then carousel.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then carousel.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then carousel.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then carousel.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then carousel.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then carousel.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then carousel.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then carousel.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then carousel.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		carousel.Addclass(sfloat)
	End If
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssavatar As String = m.getdefault("avatar", "")
		If sskey = "" Then Continue
		carousel.AddItem1(ssavatar)
	Next
	'
	ui.AddControl(carousel.Carousel, carousel.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'create the source code
	sb.append($"Dim car${sname} As VMCarousel = vm.CreateCarousel("car${sname}", Me)"$).append(CRLF)
	CodeLine(sb, sactiveclass, "s", "car", sname, "Setactiveclass")
	CodeLine(sb, sdelimitericon, "s", "car", sname, "Setdelimitericon")
	CodeLine(sb, sheight, "s", "car", sname, "Setheight")
	CodeLine(sb, sinterval, "s", "car", sname, "Setinterval")
	CodeLine(sb, smmax, "s", "car", sname, "Setmax")
	CodeLine(sb, sverticaldelimiter, "s", "car", sname, "SetVerticalDelimiters")
	CodeLine2(sb, sprogresscolor, sprogresscolorintensity, "s", "car", sname, "SetProgressColorIntensity")
	'
	CodeLine(sb, biscontinuous, "b", "car", sname, "Setcontinuous")
	CodeLine(sb, biscycle, "b", "car", sname, "Setcycle")
	CodeLine(sb, bisdark, "b", "car", sname, "Setdark")
	CodeLine(sb, bishidedelimiterbackground, "b", "car", sname, "Sethidedelimiterbackground")
	CodeLine(sb, bishidedelimiters, "b", "car", sname, "Sethidedelimiters")
	CodeLine(sb, bislight, "b", "car", sname, "Setlight")
	CodeLine(sb, bismandatory, "b", "car", sname, "Setmandatory")
	'CodeLine(sb, bismultiple, "b", "car", sname, "Setmultiple")
	CodeLine(sb, bisnexticon, "b", "car", sname, "Setnexticon")
	If sfloat <> "" Then
		AddCode(sb, $"car${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisprevicon, "b", "car", sname, "Setprevicon")
	CodeLine(sb, bisprogress, "b", "car", sname, "Setprogress")
	CodeLine(sb, bisreverse, "b", "car", sname, "Setreverse")
	CodeLine(sb, bisshowarrows, "b", "car", sname, "Setshowarrows")
	CodeLine(sb, bisshowarrowsonhover, "b", "car", sname, "Setshowarrowsonhover")
	CodeLine(sb, bistouchless, "b", "car", sname, "Settouchless")
	CodeLine(sb, bisvertical, "b", "car", sname, "Setvertical")
	CodeLine(sb, bisVisible, "b", "car", sname, "Setvisible")
	'
	Dim pres As String = "car"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssavatar As String = m.getdefault("avatar", "")
		If sskey = "" Then Continue
		CodeLine(sb, ssavatar, "s", "car", sname, "AddItem1")
	Next
	sb.append($"${sparent}.AddControl(car${sname}.Carousel, car${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Menu
	Dim menu As VMMenu = ui.CreateMenu(sname, Me)
	menu.setstatic(True)
	Select Case menutype
	Case "icon"
		menu.SetIcon(siconname)
	Case "btn"
		menu.SetButton(siconname, stitle)
	End Select
	menu.Setactivator(sactivator)
	menu.Setclosedelay(sclosedelay)
	menu.Setcontentclass(scontentclass)
	menu.Setmaxheight(smaxheight)
	menu.Setmaxwidth(smaxwidth)
	menu.Setminwidth(sminwidth)
	menu.Setnudgebottom(snudgebottom)
	menu.Setnudgeleft(snudgeleft)
	menu.Setnudgeright(snudgeright)
	menu.Setnudgetop(snudgetop)
	menu.Setnudgewidth(snudgewidth)
	menu.Setopendelay(sopendelay)
	menu.Setorigin(sorigin)
	menu.Setpositionx(spositionx)
	menu.Setpositiony(spositiony)
	menu.Setreturnvalue(sreturnvalue)
	menu.Settransition(stransition)
	'
	menu.Setabsolute(bisabsolute)
	menu.Setallowoverflow(bisallowoverflow)
	menu.Setauto(bisauto)
	menu.Setbottom(bisbottom)
	menu.Setcloseonclick(biscloseonclick)
	menu.Setcloseoncontentclick(biscloseoncontentclick)
	menu.Setdark(bisdark)
	menu.Setdisablekeys(bisdisablekeys)
	menu.Setdisabled(bisDisabled)
	menu.Seteager(biseager)
	menu.Setfixed(bisfixed)
	menu.Setinternalactivator(bisinternalactivator)
	menu.Setleft(bisleft)
	menu.Setlight(bislight)
	menu.Setoffsetoverflow(bisoffsetoverflow)
	menu.Setoffsetx(bisoffsetx)
	menu.Setoffsety(bisoffsety)
	menu.Setopenonclick(bisopenonclick)
	menu.Setopenonhover(bisopenonhover)
	menu.Setright(bisright)
	menu.Setslotactivator(bisslotactivator)
	menu.Settop(bistop)
	menu.SetVisible(bisVisible)
	If smargintop <> "" Then menu.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then menu.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then menu.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then menu.AddClass("mr-" & smarginright)
	If smargins <> "" Then menu.AddClass("ms-" & smargins)
	If smargine <> "" Then menu.AddClass("me-" & smargine)
	If smarginx <> "" Then menu.AddClass("mx-" & smarginx)
	If smarginy <> "" Then menu.AddClass("my-" & smarginy)
	If smargina <> "" Then menu.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then menu.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then menu.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then menu.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then menu.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then menu.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then menu.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then menu.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then menu.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then menu.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		menu.Addclass(sfloat)
	End If
	'
	'link events
	AddCode(sbEvents, $"Sub menu${sname}Items_click(e As BANanoEvent)"$)
	AddCode(sbEvents, $"Dim itemID As String = vm.GetIDFromEvent(e)"$)
	AddCode(sbEvents, $"Select Case itemID"$)

	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssavatar As String = m.getdefault("avatar", "")
		Dim ssiconname As String = m.getdefault("icon", "")
		Dim sIconcolor As String = m.getdefault("iconcolor", "")
		Dim sstitle As String = m.getdefault("title", "")
		'Dim sssubtitle As String = m.GetDefault("subtitle", "")
		'Dim ssactionicon As String = m.getdefault("action", "")
		If sskey = "" Then Continue
		menu.AddItem1(sskey, ssavatar, ssiconname, sIconcolor, sstitle, "", "","","") 
		If bisdivider Then menu.adddivider1(True)
		AddCode(sbEvents, $"Case "${sskey}""$)
	Next
	AddCode(sbEvents,"End Select")
	AddCode(sbEvents, "End Sub")
	'
	ui.AddControl(menu.Menu, menu.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim menu${sname} As VMMenu = vm.CreateMenu("menu${sname}", Me)"$).append(CRLF)
	Select Case menutype
	Case "icon"
		menu.SetIcon(siconname)
		CodeLine(sb, siconname, "s", "menu", sname, "SetIcon")
	Case "btn"
		CodeLine2a(sb, siconname, stitle, "s", "menu", sname, "SetButton")
	End Select
	CodeLine(sb, bisVisible, "b", "menu", sname, "SetVisible")
	CodeLine(sb, sactivator, "s", "menu", sname, "Setactivator")
	CodeLine(sb, sclosedelay, "s", "menu", sname, "Setclosedelay")
	CodeLine(sb, scontentclass, "s", "menu", sname, "Setcontentclass")
	CodeLine(sb, smaxheight, "s", "menu", sname, "Setmaxheight")
	CodeLine(sb, smaxwidth, "s", "menu", sname, "Setmaxwidth")
	CodeLine(sb, sminwidth, "s", "menu", sname, "Setminwidth")
	CodeLine(sb, snudgebottom, "s", "menu", sname, "Setnudgebottom")
	CodeLine(sb, snudgeleft, "s", "menu", sname, "Setnudgeleft")
	CodeLine(sb, snudgeright, "s", "menu", sname, "Setnudgeright")
	CodeLine(sb, snudgetop, "s", "menu", sname, "Setnudgetop")
	CodeLine(sb, snudgewidth, "s", "menu", sname, "Setnudgewidth")
	CodeLine(sb, sopendelay, "s", "menu", sname, "Setopendelay")
	CodeLine(sb, sorigin, "s", "menu", sname, "Setorigin")
	If sfloat <> "" Then
		AddCode(sb, $"menu${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, spositionx, "s", "menu", sname, "Setpositionx")
	CodeLine(sb, spositiony, "s", "menu", sname, "Setpositiony")
	CodeLine(sb, sreturnvalue, "s", "menu", sname, "Setreturnvalue")
	CodeLine(sb, stransition, "s", "menu", sname, "Settransition")
	'
	CodeLine(sb, bisabsolute, "b", "menu", sname, "Setabsolute")
	CodeLine(sb, bisallowoverflow, "b", "menu", sname, "Setallowoverflow")
	CodeLine(sb, bisauto, "b", "menu", sname, "Setauto")
	CodeLine(sb, bisbottom, "b", "menu", sname, "Setbottom")
	CodeLine(sb, biscloseonclick, "b", "menu", sname, "Setcloseonclick")
	CodeLine(sb, biscloseoncontentclick, "b", "menu", sname, "Setcloseoncontentclick")
	CodeLine(sb, bisdark, "b", "menu", sname, "Setdark")
	CodeLine(sb, bisdisablekeys, "b", "menu", sname, "Setdisablekeys")
	CodeLine(sb, bisDisabled, "b", "menu", sname, "Setdisabled")
	CodeLine(sb, biseager, "b", "menu", sname, "Seteager")
	CodeLine(sb, bisfixed, "b", "menu", sname, "Setfixed")
	CodeLine(sb, bisinternalactivator, "b", "menu", sname, "Setinternalactivator")
	CodeLine(sb, bisleft, "b", "menu", sname, "Setleft")
	CodeLine(sb, bislight, "b", "menu", sname, "Setlight")
	CodeLine(sb, bisoffsetoverflow, "b", "menu", sname, "Setoffsetoverflow")
	CodeLine(sb, bisoffsetx, "b", "menu", sname, "Setoffsetx")
	CodeLine(sb, bisoffsety, "b", "menu", sname, "Setoffsety")
	CodeLine(sb, bisopenonclick, "b", "menu", sname, "Setopenonclick")
	CodeLine(sb, bisopenonhover, "b", "menu", sname, "Setopenonhover")
	CodeLine(sb, bisright, "b", "menu", sname, "Setright")
	CodeLine(sb, bisslotactivator, "b", "menu", sname, "Setslotactivator")
	CodeLine(sb, bistop, "b", "menu", sname, "Settop")
	'
	Dim pres As String = "menu"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssavatar As String = m.getdefault("avatar", "")
		Dim ssiconname As String = m.getdefault("icon", "")
		Dim sIconcolor As String = m.getdefault("iconcolor", "")
		Dim sstitle As String = m.getdefault("title", "")
		'Dim sssubtitle As String = m.GetDefault("subtitle", "")
		'Dim ssactionicon As String = m.getdefault("action", "")
		If sskey = "" Then Continue
		sb.append($"menu${sname}.AddItem1("${sskey}", "${ssavatar}", "${ssiconname}", "${sIconcolor}", "${sstitle}", "", "","","")"$).append(CRLF)
		If bisdivider Then CodeLine(sb, True, "b", "menu", sname, "AddDivider1")
	Next
		
	sb.append($"${sparent}.AddControl(menu${sname}.Menu, menu${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)

End Sub

Sub Design_ToolBar
	Dim tbl As VMToolBar = ui.CreateToolbar(sname, Me)
	tbl.SetStatic(True)
	Select Case sbartype
	Case "app"
		tbl.SetAppBar(True)
	Case "tool"
		tbl.SetToolBar(True)
	Case "sys"
		tbl.SetSystemBar(True)
	End Select
	'
	tbl.SetExtensionHeight(sextensionheight)
	tbl.SetScrollTarget(sscrolltarget)
	tbl.SetScrollThreshold(sscrollthreshold)
	tbl.SetSrc(ssrc)
	tbl.SetElevation(selevation)
	'
	If bishamburger Then tbl.AddHamburger
	'
	If bislogovisible Then
		tbl.Logo.SetBorderRadius(sborderradius)
		tbl.Logo.SetBorderWidth(sborderwidth)
		tbl.Logo.SetBorderColor(sbordercolor)
		tbl.Logo.SetBorderStyle(sborderstyle)
		tbl.Logo.SetSize(slogowidth, slogoheight)
		tbl.AddLogo(slogourl)
	End If
	'
	If bistitle Then tbl.AddTitle(stitle, stitleclass)
	If bissubtitle Then tbl.AddSubHeading1(stoolbarsubtitle)
	If bissearch Then
		tbl.AddSpacer
		tbl.AddSearch(ssearchkey)
	End If
	
	If bisspacer Then tbl.AddSpacer
	
	tbl.SetColorIntensity(sColor, sintensity)
	tbl.SetTextColorIntensity(stextcolor, stextintensity)
	'
	tbl.SetMaxWidth(smaxwidth)
	tbl.SetWidth(swidth)
	tbl.SetMinWidth(sminwidth)
	'
	tbl.SetMinHeight(sminheight)
	tbl.SetMaxHeight(smaxheight)
	tbl.SetHeight(sheight)
	'
	tbl.Setdense(bisdense)
	tbl.SetFLat(bisflat)
	tbl.Setdark(bisdark)
	tbl.Setabsolute(bisabsolute)
	tbl.Setclippedleft(bisclippedleft)
	tbl.Setclippedright(bisclippedright)
	tbl.Setclippedleft(bisclippedleft)
	tbl.Setcollapse(biscollapse)
	tbl.Setcollapseonscroll(biscollapseonscroll)
	tbl.Setelevateonscroll(biselevateonscroll)
	tbl.Setextended(bisextended)
	tbl.SetFadeImgOnScroll(bisfadeimageonscroll)
	tbl.Setfixed(bisfixed)
	tbl.Setfloating(bisfloating)
	tbl.Sethideonscroll(bishideonscroll)
	tbl.Setinvertedscroll(bisinvertedscroll)
	tbl.Setprominent(bisprominent)
	tbl.Setscrolloffscreen(bisscrolloffscreen)
	tbl.Setshort(bisshort)
	tbl.Setshrinkonscroll(bisshrinkonscroll)
	tbl.Setvisible(bisVisible)
	If smargintop <> "" Then tbl.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then tbl.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then tbl.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then tbl.AddClass("mr-" & smarginright)
	If smargins <> "" Then tbl.AddClass("ms-" & smargins)
	If smargine <> "" Then tbl.AddClass("me-" & smargine)
	If smarginx <> "" Then tbl.AddClass("mx-" & smarginx)
	If smarginy <> "" Then tbl.AddClass("my-" & smarginy)
	If smargina <> "" Then tbl.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then tbl.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then tbl.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then tbl.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then tbl.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then tbl.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then tbl.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then tbl.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then tbl.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then tbl.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		tbl.Addclass(sfloat)
	End If
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssiconname As String = m.getdefault("icon", "")
		Dim sIconcolor As String = m.getdefault("iconcolor", "")
		Dim sstitle As String = m.getdefault("title", "")
		Dim sssubtitle As String = m.GetDefault("subtitle", "")
		Dim sitemtype As String = m.getdefault("itemtype", "icon")
		Dim sBadge As String = m.getdefault("badge", "")
		If sskey = "" Then Continue
		Select Case sitemtype
		Case "menu"
			'tbl.AddMenu(sskey)
		Case "btn"
			tbl.AddItem(sskey, ssiconname, sIconcolor, sstitle, sssubtitle, sBadge)
			AddCode(sbEvents, $"Private Sub ${sskey}_click(e As BANanoEvent)"$)
			AddCode(sbEvents, $"vm.ShowSnackBar("${sstitle}")"$)
			AddCode(sbEvents, "End Sub")
			AddNewLine(sbEvents)
		Case "icon"
			tbl.AddIcon1(sskey, ssiconname, sIconcolor, sssubtitle, sBadge)
			AddCode(sbEvents, $"Private Sub ${sskey}_click(e As BANanoEvent)"$)
			AddCode(sbEvents, $"vm.ShowSnackBar("${sstitle}")"$)
			AddCode(sbEvents, "End Sub")
			AddNewLine(sbEvents)
		End Select
	Next
	'
	ui.AddControl(tbl.toolbar, tbl.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	If biscurrent = False Then 
		AddNewLine(sb)
		AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
		AddNewLine(sb)
		'
		sb.append($"Dim tbl${sname} As VMToolBar = ui.CreateToolBar("tbl${sname}", Me)"$).append(CRLF)
		Select Case sbartype
		Case "app"
			CodeLine(sb, True, "b", "tbl", sname, "SetAppBar")
		Case "tool"
			CodeLine(sb, True, "b", "tbl", sname, "SetToolBar")
		Case "sys"
			CodeLine(sb, True, "b", "tbl", sname, "SetSystemBar")
		End Select
	Else
		AddInstruction(sb, "pgIndex", "BuildNavBar", "")
	End If
	'
	AddComment(sb, "add a hamburger")
	If biscurrent = False Then
		CodeLine1(sb, True, "b", "tbl", sname, "AddHamburger")
		AddCode(sb, $"tbl${sname}.Hamburger.SetVisible(${bishamburger})"$)
	Else
		CodeLine1(sb, True, "b", "vm.NavBar", "", "AddHamburger")
		AddCode(sb, $"vm.NavBar.Hamburger.SetVisible(${bishamburger})"$)
	End If
	'
	AddComment(sb, "add a logo")
	'
	If biscurrent = False Then
		CodeLine(sb, sborderradius, "s", "tbl", sname, "Logo.SetBorderRadius")
		CodeLine(sb, sborderwidth, "s", "tbl", sname, "Logo.SetBorderWidth")
		CodeLine(sb, sbordercolor, "s", "tbl", sname, "Logo.SetBorderColor")
		CodeLine(sb, sborderstyle, "s", "tbl", sname, "Logo.SetBorderStyle")
		If sfloat <> "" Then
			AddCode(sb, $"tbl${sname}.AddClass("${sfloat}")"$)
		End If
		CodeLine2(sb, slogowidth, slogoheight, "s", "tbl", sname, "Logo.SetSize")
		AddCode(sb, $"tbl${sname}.Logo.SetOnClick(Me, "logo_click")"$)
		CodeLine(sb, slogourl, "s", "tbl", sname, "AddLogo")
		If bislogovisible Then
			AddCode(sb, $"tbl${sname}.Logo.Show"$)
		Else
			AddCode(sb, $"tbl${sname}.Logo.Hide"$)
		End If
	Else
		If sfloat <> "" Then
			AddCode(sb, $"vm.NavBar.AddClass("${sfloat}")"$)
		End If
		CodeLine(sb, sborderradius, "s", "vm.NavBar", "", "Logo.SetBorderRadius")
		CodeLine(sb, sborderwidth, "s", "vm.NavBar", "", "Logo.SetBorderWidth")
		CodeLine(sb, sbordercolor, "s", "vm.NavBar", "", "Logo.SetBorderColor")
		CodeLine(sb, sborderstyle, "s", "vm.NavBar", "", "Logo.SetBorderStyle")
		CodeLine2(sb, slogowidth, slogoheight, "s", "vm.NavBar", "", "Logo.SetSize")
		AddCode(sb, $"vm.NavBar.Logo.SetOnClick(Me, "logo_click")"$)
		CodeLine(sb, slogourl, "s", "vm.NavBar", "", "AddLogo")
		If bislogovisible Then
			AddCode(sb, "vm.NavBar.Logo.Show")
		Else
			AddCode(sb, "vm.NavBar.Logo.Hide")
		End If
	End If
	'
	If biscurrent = False Then
		If bistitle Then 
			AddCode(sb, $"tbl${sname}.Title.SetOnClick(Me, "title_click")"$)
			CodeLine2(sb, stitle, stitleclass, "s", "tbl", sname, "AddTitle")
		End If
		If bissubtitle Then CodeLine(sb, stoolbarsubtitle, "s", "tbl", sname, "AddSubHeading1")
		If bissearch Then
			sb.append($"tbl${sname}.AddSpacer"$).append(CRLF)
			sb.append($"tbl${sname}.AddSearch("${ssearchkey}")"$).append(CRLF)
		End If
		If bisspacer Then sb.append($"tbl${sname}.AddSpacer"$).append(CRLF)
		
		CodeLine(sb, sextensionheight, "s", "tbl", sname, "SetExtensionHeight")
		CodeLine(sb, sscrolltarget, "s", "tbl", sname, "SetScrollTarget")
		CodeLine(sb, sscrollthreshold, "s", "tbl", sname, "SetScrollThreshold")
		CodeLine(sb, ssrc, "s", "tbl", sname, "SetSrc")
		CodeLine(sb, selevation, "s", "tbl", sname, "SetElevation")
		CodeLine(sb, bisflat, "b", "tbl", sname, "SetFlat")
		'
		CodeLine(sb, swidth, "s", "tbl", sname, "SetWidth")
		CodeLine(sb, sminwidth, "s", "tbl", sname, "SetMinWidth")
		CodeLine(sb, smaxwidth, "s", "tbl", sname, "SetMaxWidth")
		CodeLine(sb, sheight, "s", "tbl", sname, "SetHeight")
		CodeLine(sb, sminheight, "s", "tbl", sname, "SetMinHeight")
		CodeLine(sb, smaxheight, "s", "tbl", sname, "SetMaxHeight")
		'
		CodeLine2(sb, sColor, sintensity, "s", "tbl", sname, "SetColorIntensity")
		CodeLine2(sb, stextcolor, stextintensity, "s", "tbl", sname, "SetTextcolorintensity")
		
		CodeLine(sb, bisdense, "b", "tbl", sname, "SetDense")
		CodeLine(sb, bisdark, "b", "tbl", sname, "SetDark")
		CodeLine(sb, bisabsolute, "b", "tbl", sname, "SetAbsolute")
		CodeLine(sb, bisclippedleft, "b", "tbl", sname, "SetClippedLeft")
		CodeLine(sb, bisclippedright, "b", "tbl", sname, "SetClippedRight")
		CodeLine(sb, bisclippedleft, "b", "tbl", sname, "SetClippedLeft")
		CodeLine(sb, biscollapse, "b", "tbl", sname, "SetCollapse")
		CodeLine(sb, biscollapseonscroll, "b", "tbl", sname, "SetCollapseOnScroll")
		CodeLine(sb, biselevateonscroll, "b", "tbl", sname, "SetElevateOnScroll")
		CodeLine(sb, bisextended, "b", "tbl", sname, "SetExtended")
		CodeLine(sb, bisfadeimageonscroll, "b", "tbl", sname, "SetFadeImgOnScroll")
		CodeLine(sb, bisfixed, "b", "tbl", sname, "SetFixed")
		CodeLine(sb, bisfloating, "b", "tbl", sname, "SetFloating")
		CodeLine(sb, bishideonscroll, "b", "tbl", sname, "SetHideOnScroll")
		CodeLine(sb, bisinvertedscroll, "b", "tbl", sname, "SetInvertedScroll")
		CodeLine(sb, bisprominent, "b", "tbl", sname, "SetProminent")
		CodeLine(sb, bisscrolloffscreen, "b", "tbl", sname, "SetScrollOffScreen")
		CodeLine(sb, bisshort, "b", "tbl", sname, "SetShort")
		CodeLine(sb, bisshrinkonscroll, "b", "tbl", sname, "SetShrinkOnScroll")
		CodeLine(sb, bisVisible, "b", "tbl", sname, "SetVisible")
		'
		Dim pres As String = "tbl"
		CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
		CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
		CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
		CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
		CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
		CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
		CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
		CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
		CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
		CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
		CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
		CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
		CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
		CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
		CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
		CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
		CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
		CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	Else
		If bistitle Then 
			AddCode(sb, $"vm.NavBar.Title.SetOnClick(Me, "title_click")"$)
			CodeLine2(sb, stitle, stitleclass, "s", "vm.NavBar", "", "AddTitle")
		End If
		If bissubtitle Then CodeLine(sb, stoolbarsubtitle, "s", "vm.NavBar", "", "AddSubHeading1")
		If bissearch Then
			sb.append($"vm.NavBar.AddSpacer"$).append(CRLF)
			sb.append($"vm.NavBar.AddSearch("${ssearchkey}")"$).append(CRLF)
		End If
		If bisspacer Then sb.append($"vm.NavBar.AddSpacer"$).append(CRLF)
		'
		CodeLine2(sb, sColor, sintensity, "s", "vm.NavBar", "", "SetColorIntensity")
		CodeLine2(sb, stextcolor, stextintensity, "s", "vm.NavBar", "", "SetTextcolorintensity")
		CodeLine(sb, sextensionheight, "s", "vm.NavBar", "", "SetExtensionHeight")
		CodeLine(sb, sscrolltarget, "s", "vm.NavBar", "", "SetScrollTarget")
		CodeLine(sb, sscrollthreshold, "s", "vm.NavBar", "", "SetScrollThreshold")
		CodeLine(sb, ssrc, "s", "vm.NavBar", "", "SetSrc")
		CodeLine(sb, selevation, "s", "vm.NavBar", "", "SetElevation")
		CodeLine(sb, bisflat, "b", "vm.NavBar", "", "SetFlat")
		'
		CodeLine(sb, swidth, "s", "vm.NavBar", "", "SetWidth")
		CodeLine(sb, sminwidth, "s", "vm.NavBar", "", "SetMinWidth")
		CodeLine(sb, smaxwidth, "s", "vm.NavBar", "", "SetMaxWidth")
		CodeLine(sb, sheight, "s", "vm.NavBar", "", "SetHeight")
		CodeLine(sb, sminheight, "s", "vm.NavBar", "", "SetMinHeight")
		CodeLine(sb, smaxheight, "s", "vm.NavBar", "", "SetMaxHeight")
		'
		
		CodeLine(sb, bisdense, "b", "vm.NavBar", "", "SetDense")
		CodeLine(sb, bisdark, "b", "vm.NavBar", "", "SetDark")
		CodeLine(sb, bisabsolute, "b", "vm.NavBar", "", "SetAbsolute")
		CodeLine(sb, bisclippedleft, "b", "vm.NavBar", "", "SetClippedLeft")
		CodeLine(sb, bisclippedright, "b", "vm.NavBar", "", "SetClippedRight")
		CodeLine(sb, bisclippedleft, "b", "vm.NavBar", "", "SetClippedLeft")
		CodeLine(sb, biscollapse, "b", "vm.NavBar", "", "SetCollapse")
		CodeLine(sb, biscollapseonscroll, "b", "vm.NavBar", "", "SetCollapseOnScroll")
		CodeLine(sb, biselevateonscroll, "b", "vm.NavBar", "", "SetElevateOnScroll")
		CodeLine(sb, bisextended, "b", "vm.NavBar", "", "SetExtended")
		CodeLine(sb, bisfadeimageonscroll, "b", "vm.NavBar", "", "SetFadeImgOnScroll")
		CodeLine(sb, bisfixed, "b", "vm.NavBar", "", "SetFixed")
		CodeLine(sb, bisfloating, "b", "vm.NavBar", "", "SetFloating")
		CodeLine(sb, bishideonscroll, "b", "vm.NavBar", "", "SetHideOnScroll")
		CodeLine(sb, bisinvertedscroll, "b", "vm.NavBar", "", "SetInvertedScroll")
		CodeLine(sb, bisprominent, "b", "vm.NavBar", "", "SetProminent")
		CodeLine(sb, bisscrolloffscreen, "b", "vm.NavBar", "", "SetScrollOffScreen")
		CodeLine(sb, bisshort, "b", "vm.NavBar", "", "SetShort")
		CodeLine(sb, bisshrinkonscroll, "b", "vm.NavBar", "", "SetShrinkOnScroll")
		CodeLine(sb, bisVisible, "b", "vm.NavBar", "", "SetVisible")
		'
		Dim pres As String = "vm.NavBar"
		CodeLine(sb, "mt-" & smargintop, "s", pres, "", "AddClass")
		CodeLine(sb, "mb-" & smarginbottom, "s", pres, "", "AddClass")
		CodeLine(sb, "ml-" & smarginleft, "s", pres, "", "AddClass")
		CodeLine(sb, "mr-" & smarginright, "s", pres, "", "AddClass")
		CodeLine(sb, "ms-" & smargins, "s", pres, "", "AddClass")
		CodeLine(sb, "me-" & smargine, "s", pres, "", "AddClass")
		CodeLine(sb, "mx-" & smarginx, "s", pres, "", "AddClass")
		CodeLine(sb, "my-" & smarginy, "s", pres, "", "AddClass")
		CodeLine(sb, "ma-" & smargina, "s", pres, "", "AddClass")
		CodeLine(sb, "pt-" & spaddingtop, "s", pres, "", "AddClass")
		CodeLine(sb, "pb-" & spaddingbottom, "s", pres, "", "AddClass")
		CodeLine(sb, "pl-" & spaddingleft, "s", pres, "", "AddClass")
		CodeLine(sb, "pr-" & spaddingright, "s", pres, "", "AddClass")
		CodeLine(sb, "ps-" & spaddings, "s", pres, "", "AddClass")
		CodeLine(sb, "pe-" & spaddinge, "s", pres, "", "AddClass")
		CodeLine(sb, "px-" & spaddingx, "s", pres, "", "AddClass")
		CodeLine(sb, "py-" & spaddingy, "s", pres, "", "AddClass")
		CodeLine(sb, "pa-" & spaddinga, "s", pres, "", "AddClass")
	End If
	
	AddNewLine(sb)	
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssiconname As String = m.getdefault("icon", "")
		Dim sIconcolor As String = m.getdefault("iconcolor", "")
		Dim sstitle As String = m.getdefault("title", "")
		Dim sssubtitle As String = m.GetDefault("subtitle", "")
		Dim sitemtype As String = m.getdefault("itemtype", "icon")
		Dim sBadge As String = m.getdefault("badge", "")
		If sskey = "" Then Continue
		Select Case sitemtype
		Case "menu"
			If biscurrent = False Then
				sb.append($"tbl${sname}.AddMenu(${sskey})"$).append(CRLF)
			Else
				sb.append($"vm.NavBar.AddMenu(${sskey})"$).append(CRLF)
			End If
		Case "btn"
			If biscurrent = False Then
				sb.append($"tbl${sname}.AddItem("${sskey}", "${ssiconname}", "${sIconcolor}", "${sstitle}", "${sssubtitle}", "${sBadge}")"$).append(CRLF)
			Else
				sb.append($"vm.NavBar.AddItem("${sskey}", "${ssiconname}", "${sIconcolor}", "${sstitle}", "${sssubtitle}", "${sBadge}")"$).append(CRLF)
			End If
		Case "icon"
			If biscurrent = False Then
				sb.append($"tbl${sname}.AddIcon1("${sskey}", "${ssiconname}", "${sIconcolor}", "${sssubtitle}", "${sBadge}")"$).append(CRLF)
			Else
				sb.append($"vm.NavBar.AddIcon1("${sskey}", "${ssiconname}", "${sIconcolor}", "${sssubtitle}", "${sBadge}")"$).append(CRLF)
			End If
		End Select
	Next
	AddNewLine(sb)
	'
	If bissearch Then
		AddNewLine(sbEvents)
		AddComment(sbEvents, "fire when search looses focus")
		AddCode(sbEvents, $"Private Sub ${ssearchkey}_change(e as BANanoEvent)"$)
		AddComment(sbEvents, "get the search phrase")
		AddCode(sbEvents, $"Dim s${ssearchkey} As String = vm.GetData("${ssearchkey}")"$)
		AddCode(sbEvents, $"vm.ShowSnackBar(s${ssearchkey})"$)
		AddCode(sbEvents, "End Sub")
		AddNewLine(sbEvents)
	End If
	
	'
	If biscurrent = False Then
		sb.append($"${sparent}.AddControl(tbl${sname}.ToolBar, tbl${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	End If
End Sub

Sub Design_Button
	Dim btn As VMButton = ui.NewButton(Me, True, sname, stitle, True, bisPrimary, False, bfitwidth)
	btn.Sethref(shref)
	btn.SetTarget(starget)
	btn.setto(sTo)
	btn.SetTooltip(stooltip)
	btn.SetColorIntensity(sColor, sintensity)
	btn.SetTextColorIntensity(stextcolor, stextintensity)
	btn.SetDisabled(bisDisabled).Setoutlined(bisoutlined)
	btn.SetRounded(bisrounded).SetTransparent(bistext)
	'
	Select Case sbuttontype
	Case "normal"
		If siconname <> "" Then
			btn.AddIcon(siconname, siconpos, "")
		End If
	Case "icon"
		btn.SetIconButton(siconname)
	Case "fab"
		btn.Setfabbutton(siconname)
	End Select
	'
	btn.SetDepressed(bisdepressed)
	btn.SetDark(bisdark)
	btn.SetTile(bistile)
	btn.SetWidth(swidth)
	btn.SetHeight(sheight)
	btn.SetMinWidth(sminwidth)
	btn.SetMaxWidth(smaxwidth)
	btn.SetMinHeight(sminheight)
	btn.SetMaxHeight(smaxheight)
	btn.SetVisible(bisVisible)
	If smargintop <> "" Then btn.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then btn.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then btn.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then btn.AddClass("mr-" & smarginright)
	If smargins <> "" Then btn.AddClass("ms-" & smargins)
	If smargine <> "" Then btn.AddClass("me-" & smargine)
	If smarginx <> "" Then btn.AddClass("mx-" & smarginx)
	If smarginy <> "" Then btn.AddClass("my-" & smarginy)
	If smargina <> "" Then btn.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then btn.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then btn.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then btn.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then btn.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then btn.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then btn.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then btn.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then btn.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then btn.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then 
		btn.AddClass(sfloat)
	End If
	Select Case ssize
		Case "small"
			btn.setsmall(True)
		Case "large"
			btn.SetLarge(True)
		Case "x-small"
			btn.SetXSmall(True)
		Case "x-large"
			btn.SetXLarge(True)
	End Select
	'
	ui.AddControl(btn.button, btn.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'build the source code
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim btn${sname} As VMButton = vm.NewButton(Me, ${bStatic}, "btn${sname}", "${stitle}", True, ${bisPrimary}, False, ${bfitwidth})"$).append(CRLF)
	If shref <> "" Then sb.append($"btn${sname}.Sethref("${shref}")"$).append(CRLF)
	If starget <> "" Then sb.append($"btn${sname}.SetTarget("${starget}")"$).append(CRLF)
	If sTo <> "" Then sb.append($"btn${sname}.setto("${sTo}")"$).append(CRLF)
	If stooltip <> "" Then sb.append($"btn${sname}.SetTooltip("${stooltip}")"$).append(CRLF)
	If sColor <> "" Then sb.append($"btn${sname}.SetColorIntensity("${sColor}", "${sintensity}")"$).append(CRLF)
	If stextcolor <> "" Then sb.append($"btn${sname}.SetTextColorIntensity("${stextcolor}", "${stextintensity}")"$).append(CRLF)
	If bisDisabled Then sb.append($"btn${sname}.SetDisabled(${bisDisabled})"$).append(CRLF)
	If bisoutlined Then sb.append($"btn${sname}.Setoutlined(${bisoutlined})"$).append(CRLF)
	If bisrounded Then sb.append($"btn${sname}.SetRounded(${bisrounded})"$).append(CRLF)
	If bistext Then sb.append($"btn${sname}.SetTransparent(${bistext})"$).append(CRLF)
	If sfloat <> "" Then 
		AddCode(sb, $"btn${sname}.AddClass("${sfloat}")"$)
	End If
	
	
	Select Case sbuttontype
	Case "normal"
		If siconname <> "" Then
			AddCode(sb, $"btn${sname}.AddIcon("${siconname}", "${siconpos}", "")"$)
		End If
	Case "icon"
		sb.append($"btn${sname}.SetIconButton("${siconname}")"$).append(CRLF)
	Case "fab"
		sb.append($"btn${sname}.SetFabButton("${siconname}")"$).append(CRLF)
	End Select
	
	If bisdepressed Then sb.append($"btn${sname}.SetDepressed(${bisdepressed})"$).append(CRLF)
	If bisdark Then sb.append($"btn${sname}.SetDark(${bisdark})"$).append(CRLF)
	If bistile Then sb.append($"btn${sname}.SetTile(${bistile})"$).append(CRLF)
	If swidth <> "" Then sb.append($"btn${sname}.SetWidth("${swidth}")"$).append(CRLF)
	If sheight <> "" Then sb.append($"btn${sname}.SetHeight("${sheight}")"$).append(CRLF)
	If sminwidth <> "" Then sb.append($"btn${sname}.SetMinWidth("${sminwidth}")"$).append(CRLF)
	If smaxwidth <> "" Then sb.append($"btn${sname}.SetMaxWidth("${smaxwidth}")"$).append(CRLF)
	If sminheight <> "" Then sb.append($"btn${sname}.SetMinHeight("${sminheight}")"$).append(CRLF)
	If smaxheight <> "" Then sb.append($"btn${sname}.SetMaxHeight("${smaxheight}")"$).append(CRLF)
	CodeLine(sb, bisVisible, "b", "btn", sname, "SetVisible")
	'
	Dim pres As String = "btn"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	'
	Select Case ssize
		Case "small"
			CodeLine(sb, True, "b", "btn", sname, "SetSmall")
		Case "large"
			CodeLine(sb, True, "b", "btn", sname, "SetLarge")
		Case "x-small"
			CodeLine(sb, True, "b", "btn", sname, "SetXSmall")
		Case "x-large"
			CodeLine(sb, True, "b", "btn", sname, "SetXLarge")
	End Select
	sb.append($"${sparent}.AddControl(btn${sname}.Button, btn${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'add events
	'
	AddCode(sbEvents, $"Private Sub btn${sname}_click(e As BANanoEvent)"$)
	Select Case sclickaction
	Case "showfs"
		'show file select
		AddComment(sbEvents, "show file select")
		AddCode(sbEvents, $"vm.ShowFileSelect("${sdialogpage}")"$)
	Case "sendcredentials"
		AddComment(sbEvents, "read the contents!")
		AddCode(sbEvents, $"Dim sfirstname As String = Record.get(?)"$)
		AddCode(sbEvents, $"Dim semail As String = Record.get(?)"$)
		AddCode(sbEvents, $"Dim spassword As String = Record.get(?)"$)
		AddComment(sbEvents, "Build the message")
		AddCode(sbEvents, $"Dim nmsg As String = "Good Day " & sfirstname & "||Your Sign In credentials are the following:||Your Email: " & semail & "||Your Password: " & spassword||Regards|${sprojectname} Development Team|"$)
		Dim subject As String = $"${sprojectname}: Sign In Credentials"$
		AddCode(sbEvents, $"Dim se As Map = CreateMap()"$)
		AddCode(sbEvents, $"se.put("from", "${ssenderemail}")"$)
		AddCode(sbEvents, $"se.put("to", "${ssendtoemail}")"$)
		AddCode(sbEvents, $"se.put("cc", "${sccemail}")"$)
		AddCode(sbEvents, $"se.put("subject", "${subject}")"$)
		AddCode(sbEvents, $"se.put("msg", nmsg)"$)
		AddComment(sbEvents, "Send the message and wait for response")
		AddCode(sbEvents, $"vm.PagePause"$)
		AddCode(sbEvents, $"Dim Result As String = BANano.CallInlinePHPWait("SendEmail", se)"$)
		AddCode(sbEvents, $"Dim ResultM As Map = BANano.FromJSON(Result)"$)
		AddComment(sbEvents, "What is the result of the response from SMTP")
		AddCode(sbEvents, $"Dim Response As String = ResultM.Get("response")"$)
		AddCode(sbEvents, $"vm.PageResume"$)
		AddCode(sbEvents, $"Select Case Response"$)
		AddCode(sbEvents, $"Case "failure""$)
		AddCode(sbEvents, $"vm.ShowSnackBarError("An error was experienced sending the email!")"$)
		AddCode(sbEvents, "Case Else")
		AddCode(sbEvents, $"vm.ShowSnackBarSuccess("Information was sent successfully.")"$)
		AddCode(sbEvents, "End Select")
		AddNewLine(sbEvents)
	Case "contactus"
		'send contact us email
		AddComment(sbEvents, "get the record to create/update")
		sbEvents.append($"Dim Record As Map = ${sdialogpage}.Container.GetData"$).append(CRLF)
		AddComment(sbEvents, "validate the record")
		sbEvents.append($"Dim bValid As Boolean = vm.Validate(Record, ${sdialogpage}.Container.Required)"$).append(CRLF)
		AddComment(sbEvents, "if invalid exit create/update")
		sbEvents.append($"If bValid = False Then"$).append(CRLF)
		AddCode(sbEvents, $"Dim strError As String = vue.GetError"$)
		AddCode(sbEvents, $"vm.ShowSnackBarError(strError)"$)
		AddCode(sbEvents, "Return")
		AddCode(sbEvents, "End If")
		AddComment(sbEvents, "read the contents!")
		AddCode(sbEvents, $"Dim sfullname As String = Record.get(?)"$)
		AddCode(sbEvents, $"Dim semail As String = Record.get(?)"$)
		AddCode(sbEvents, $"Dim sphone As String = Record.get(?)"$)
		AddCode(sbEvents, $"Dim scomment As String = Record.get(?)"$)
		AddComment(sbEvents, "Build the message")
		AddCode(sbEvents, $"Dim nmsg As String = "Full Name: " & sfullname & "||Email Address: " & semail & "||Telephone: " & sphone & "||Message:||" & scomment"$)
		AddCode(sbEvents, $"Dim se As Map = CreateMap()"$)
		AddCode(sbEvents, $"se.put("from", "${ssenderemail}")"$)
		AddCode(sbEvents, $"se.put("to", "${ssendtoemail}")"$)
		AddCode(sbEvents, $"se.put("cc", "${sccemail}")"$)
		AddCode(sbEvents, $"se.put("subject", "${sprojectname} Contact Us: " & sfullname)"$)
		AddCode(sbEvents, $"se.put("msg", nmsg)"$)
		AddComment(sbEvents, "Send the message and wait for response")
		AddCode(sbEvents, $"vm.PagePause"$)
		AddCode(sbEvents, $"Dim Result As String = BANano.CallInlinePHPWait("SendEmail", se)"$)
		AddCode(sbEvents, $"Dim ResultM As Map = BANano.FromJSON(Result)"$)
		AddComment(sbEvents, "What is the result of the response from SMTP")
		AddCode(sbEvents, $"Dim Response As String = ResultM.Get("response")"$)
		AddCode(sbEvents, $"vm.PageResume"$)
		AddCode(sbEvents, $"Select Case Response"$)
		AddCode(sbEvents, $"Case "failure""$)
		AddCode(sbEvents, $"vm.ShowSnackBarError("An error was experienced sending the information!")"$)
		AddCode(sbEvents, "Case Else")
		AddCode(sbEvents, $"vm.ShowSnackBarSuccess("Information was sent successfully.")"$)
		AddCode(sbEvents, "End Select")
		AddNewLine(sbEvents)
		'
	Case "add"
		'add a record
		AddComment(sbEvents, "set mode to A-dd")
		sbEvents.append($"Mode = "A""$).append(CRLF)
		AddComment(sbEvents, "set default values")
		sbEvents.append($"${sdialogpage}.Container.SetDefaults"$).append(CRLF)
		If sdialogpage.ToLowerCase <> "vm" Then
			AddComment(sbEvents, "update the title")
			sbEvents.append($"${sdialogpage}.SetTitle("New Record")"$).append(CRLF)
			AddComment(sbEvents, "show dialog")
			sbEvents.append($"vm.ShowDialog("${sdialogpage}")"$).append(CRLF)
		End If
	Case "edit"
		'edit a record
		AddComment(sbEvents, "set mode to E-dit")
		sbEvents.append($"Mode = "E""$).append(CRLF)
		AddComment(sbEvents, "set default values")
		sbEvents.append($"${sdialogpage}.Container.SetDefaults"$).append(CRLF)
		If sdialogpage.tolowercase <> "vm" Then
			AddComment(sbEvents, "update the title")
			sbEvents.append($"${sdialogpage}.SetTitle("Edit Record")"$).append(CRLF)
			AddComment(sbEvents, "show dialog")
			sbEvents.append($"vm.ShowDialog("${sdialogpage}")"$).append(CRLF)
		End If
		AddComment(sbEvents,"add code to read the record as a map")
		AddCode(sbEvents, "Dim Record As Map = CreateMap()")
		AddComment(sbEvents, "set state to display the record")
		AddCode(sbEvents, "vm.SetState(Record)")
	Case "save"
		'save a record
		AddComment(sbEvents, "get the record to create/update")
		sbEvents.append($"Dim Record As Map = ${sdialogpage}.Container.GetData"$).append(CRLF)
		AddComment(sbEvents, "validate the record")
		sbEvents.append($"Dim bValid As Boolean = vm.Validate(Record, ${sdialogpage}.Container.Required)"$).append(CRLF)
		AddComment(sbEvents, "if invalid exit create/update")
		sbEvents.append($"If bValid = False Then"$).append(CRLF)
			AddCode(sbEvents, $"Dim strError As String = vue.GetError"$)
			AddCode(sbEvents, $"vm.ShowSnackBarError(strError)"$)
		AddCode(sbEvents, "Return")
		AddCode(sbEvents, "End If")
		AddComment(sbEvents, "add code to save the record!")
	Case "delete"
		'delete a record
		AddComment(sbEvents, "get the record to delete")
		sbEvents.append($"Dim Record As Map = ${sdialogpage}.Container.GetData"$).append(CRLF)
		AddComment(sbEvents, "add code to delete the record!")
	Case "showdialog"
		'show a dialog
		AddCode(sbEvents, $"vm.ShowDialog("${sdialogpage}")"$)
	Case "hidedialog"
		'hide a dialog
		AddCode(sbEvents, $"vm.HideDialog("${sdialogpage}")"$)
	Case "showpage"
		'show a page
		AddCode(sbEvents, $"vm.ShowPage("${sdialogpage}")"$)
	Case "showdrawer"
		AddCode(sbEvents, $"vm.ShowDrawer("${sdialogpage}")	"$)
	Case "hidedrawer"
		AddCode(sbEvents, $"vm.HideDrawer("${sdialogpage}")"$)
	End Select
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

Sub Design_TextField
	Dim bHasHash As Boolean = False
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	'encrypt
	If shashtype <> "" And salg <> "" Then
		bHasHash = True
		AddComment(sbRead, "Reference the BANanoEncrypt Library...")
		AddCode(sbRead, $"Dim bencrypt As BANanoHashes"$)
		AddComment(sbRead, "Initialize the encryption")
		AddCode(sbRead, $"bencrypt.Initialize(s${svmodel}, Main.AppName)"$)
		AddComment(sbRead, "Encrypt the content")
		AddCode(sbRead, $"Dim s${svmodel}hash As String = bencrypt.Hash("${shashtype}", "${salg}")"$)
		AddComment(sbRead, "update the content")
		AddCode(sbRead, $"Record.put("${svmodel}", s${svmodel}hash)"$)
	End If
	'check do not match
	If sdonotmatchto <> "" Then
		AddComment(sbRead, "Check do not match")
		AddCode(sbRead, $"s${sdonotmatchto} = Record.Get("${smatchto}")"$)
		If bHasHash Then
			AddCode(sbRead, $"s${svmodel} = Record.Get("${svmodel}")"$)
		End If
		AddCode(sbRead, $"If s${sdonotmatchto} = s${svmodel} Then"$)
		AddCode(sbRead, $"vm.ShowSnackBarError("The '${sdonotmatchto}' and '${svmodel}' should not match!")"$)
		AddCode(sbRead, "Return")
		AddCode(sbRead, "End If")
	End If
	'check matching
	If smatchto <> "" Then
		AddComment(sbRead, "Check match")
		AddCode(sbRead, $"s${smatchto} = Record.Get("${smatchto}")"$)
		If bHasHash Then
			AddCode(sbRead, $"s${svmodel} = Record.Get("${svmodel}")"$)
		End If
		AddCode(sbRead, $"If s${smatchto} <> s${svmodel} Then"$)
		AddCode(sbRead, $"vm.ShowSnackBarError("The passwords do not match!")"$)
		AddCode(sbRead, "Return")
		AddCode(sbRead, "End If")
	End If
	'is not updatable
	If bisupdatable = False Then
		AddComment(sbRead, "Should not be updated...")
		AddCode(sbRead, $"Record.Remove("${svmodel}")"$)
	End If
	'set time now
	If bisdatenow Then
		AddCode(sbRead, $"s${svmodel} = vue.DateNow"$)
		AddCode(sbRead, $"Record.put("${svmodel}", s${svmodel})"$)
	End If
	'set time now
	If bistimenow Then
		AddCode(sbRead, $"s${svmodel} = vue.TimeNow"$)
		AddCode(sbRead, $"Record.put("${svmodel}", s${svmodel})"$)
	End If
	'set date time now
	If bisdatetimenow Then
		AddCode(sbRead, $"s${svmodel} = vue.DateTimeNow"$)
		AddCode(sbRead, $"Record.put("${svmodel}", s${svmodel})"$)
	End If
	
	Dim txt As VMTextField = ui.NewTextField(Me, True, sname, svmodel, stitle, splaceholder, bisrequired, siconname, imaxlen, shelpertext, serrortext, stabindex)
	txt.SetFieldType(sfieldtype)
	txt.SetSolo(bissolo)
	txt.SetValue(svalue)
	txt.SetOutlined(bisoutlined)
	txt.SetFilled(bisfilled)
	txt.SetDense(bisdense)
	txt.SetSingleLine(bissingleline)
	txt.SetPersistentHint(bispersistenthint)
	txt.SetShaped(bisshaped)
	txt.SetLoading(bisloading)
	txt.SetFlat(bisflat)
	txt.SetRounded(bisrounded)
	txt.SetClearable(bclearable)
	txt.SetHideDetails(bishidedetails)
	txt.SetVisible(bisVisible)
	txt.SetAutoFocus(bisautofocus)
	txt.SetReadOnly(bisreadonly)
	txt.SetDisabled(bisDisabled)
	If smargintop <> "" Then txt.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then txt.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then txt.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then txt.AddClass("mr-" & smarginright)
	If smargins <> "" Then txt.AddClass("ms-" & smargins)
	If smargine <> "" Then txt.AddClass("me-" & smargine)
	If smarginx <> "" Then txt.AddClass("mx-" & smarginx)
	If smarginy <> "" Then txt.AddClass("my-" & smarginy)
	If smargina <> "" Then txt.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then txt.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then txt.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then txt.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then txt.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then txt.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then txt.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then txt.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then txt.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then txt.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		txt.Addclass(sfloat)
	End If
	ui.AddControl(txt.textfield, txt.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim txt${sname} As VMTextField = vm.NewTextField(Me, ${bStatic}, "txt${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, "${siconname}", ${imaxlen}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
	
	'
	CodeLine(sb, svalue, "s", "txt", sname, "SetValue")
	CodeLine(sb, bisreadonly, "b", "txt", sname, "SetReadonly")
	CodeLine(sb, bisDisabled, "b", "txt", sname, "SetDisabled")
	CodeLine(sb, sfieldtype, "s", "txt", sname, "SetFieldType")
	CodeLine(sb, bissolo, "b", "txt", sname, "SetSolo")
	CodeLine(sb, bisoutlined, "b", "txt", sname, "SetOutlined")
	CodeLine(sb, bisfilled, "b", "txt", sname, "SetFilled")
	CodeLine(sb, bisdense, "b", "txt", sname, "SetDense")
	CodeLine(sb, bisautofocus, "b", "txt", sname, "SetAutoFocus")
	CodeLine(sb, bissingleline, "b", "txt", sname, "SetSingleLine")
	CodeLine(sb, bispersistenthint, "b", "txt", sname, "SetPersistentHint")
	CodeLine(sb, bisshaped, "b", "txt", sname, "SetShaped")
	CodeLine(sb, bisloading, "b", "txt", sname, "SetLoading")
	CodeLine(sb, bisflat, "b", "txt", sname, "SetFlat")
	CodeLine(sb, bisrounded, "b", "txt", sname, "SetRounded")
	CodeLine(sb, bclearable, "b", "txt", sname, "SetClearable")
	CodeLine(sb, bishidedetails, "b", "txt", sname, "SetHideDetails")
	CodeLine(sb, bisVisible, "b", "txt", sname, "SetVisible")
	'
	Dim pres As String = "txt"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	If sfloat <> "" Then
		AddCode(sb, $"txt${sname}.AddClass("${sfloat}")"$)
	End If
	

	sb.append($"${sparent}.AddControl(txt${sname}.textfield, txt${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub CodeLine(sbx As StringBuilder, varName As String, varType As String, prefix As String, ssname As String, methodName As String)
	Select Case varType
		Case "b"
			If methodName.EqualsIgnoreCase("SetVisible") Then
				sbx.append($"${prefix}${ssname}.${methodName}(${varName})"$).append(CRLF)
			Else
				If varName Then sbx.append($"${prefix}${ssname}.${methodName}(${varName})"$).append(CRLF)
			End If
		Case "s"
			If varName = "mt-" Then varName = ""
			If varName = "mb-" Then varName = ""
			If varName = "ml-" Then varName = ""
			If varName = "mr-" Then varName = ""
			If varName = "ms-" Then varName = ""
			If varName = "me-" Then varName = ""
			If varName = "mx-" Then varName = ""
			If varName = "my-" Then varName = ""
			If varName = "ma-" Then varName = ""
			If varName = "pt-" Then varName = ""
			If varName = "pb-" Then varName = ""
			If varName = "pl-" Then varName = ""
			If varName = "pr-" Then varName = ""
			If varName = "ps-" Then varName = ""
			If varName = "pe-" Then varName = ""
			If varName = "px-" Then varName = ""
			If varName = "py-" Then varName = ""
			If varName = "pa-" Then varName = ""
		
			If varName <> "" Then sbx.append($"${prefix}${ssname}.${methodName}("${varName}")"$).append(CRLF)
	End Select
End Sub

Sub CodeLine2(sbx As StringBuilder, varName As String, varName1 As String, varType As String, prefix As String, ssname As String, methodName As String)
	Select Case varType
		Case "b"
			If varName Then sbx.append($"${prefix}${ssname}.${methodName}("${varName}","${varName1})"$).append(CRLF)
		Case "s"
			If varName <> "" Then sbx.append($"${prefix}${ssname}.${methodName}("${varName}","${varName1}")"$).append(CRLF)
	End Select
End Sub

Sub CodeLine2a(sbx As StringBuilder, varName As String, varName1 As String, varType As String, prefix As String, ssname As String, methodName As String)
	Select Case varType
		Case "b"
			sbx.append($"${prefix}${ssname}.${methodName}("${varName}","${varName1})"$).append(CRLF)
		Case "s"
			sbx.append($"${prefix}${ssname}.${methodName}("${varName}","${varName1}")"$).append(CRLF)
	End Select
End Sub

Sub CodeLine1(sbx As StringBuilder, varName As String, varType As String, prefix As String, ssname As String, methodName As String)
	Select Case varType
		Case "b"
			If varName Then sbx.append($"${prefix}${ssname}.${methodName}"$).append(CRLF)
		Case "s"
			If varName <> "" Then sbx.append($"${prefix}${ssname}.${methodName}"$).append(CRLF)
	End Select
End Sub

Sub btnRefresh_click(e As BANanoEvent)
	CreateUX
End Sub



Sub compMenuitems_click(e As BANanoEvent)
	Dim menuID As String = vm.getidfromevent(e)
	Select Case menuID
	Case "btnclearcomp"
		vm.ShowConfirm("clearcomp", "Confirm Clear Components", "Are you sure that you want to clear the components?", "Yes", "No")
	Case "btnremovelastcomp"
		vm.ShowConfirm("removelastcomp", "Confirm Remove Last", "Are you sure that you want to remove the last component?", "Yes", "No")
	Case "btndownloadcomp"
		Dim prj As Map = vm.getdata("project")
		Dim pid As String = prj.getdefault("id", "")
		Dim sprojectname As String = prj.getdefault("projectname", "")
		If pid = "" Then
			vm.ShowSnackBarError("Please select the project to save the components to first!")
			Return
		End If
		vm.PagePause
		Dim db As BANanoSQL
		Dim compSQL As BANanoAlaSQLE
		db.OpenWait("bvmdesigner", "bvmdesigner")
		'add the components
		compSQL.Initialize("components", "id")
		compSQL.SelectAll(Array("*"), Array("row","col"))
		compSQL.result = db.ExecuteWait(compSQL.query, compSQL.args)
		compSQL.FromJSON
		'convert to json
		Dim compJSON As String = BANano.ToJSON(compSQL.result)
		vm.SaveText2File(compJSON, $"${sprojectname}.txt"$)
		vm.PageResume
	Case "btnuploadcomp"
		'upload components
		'activate file uploader
		vm.ShowFileSelect("fucomponent")
	End Select
End Sub

Sub fucomponent_change(e As BANanoEvent)
	Dim fileList As List = vm.GetFileListFromTarget(e)
	If fileList.size = 0 Then Return 
	'only process 1 file
	Dim fr As String = fileList.get(0)
	'
	Dim db As BANanoSQL
	Dim compSQL As BANanoAlaSQLE
	Dim CompList As List
	CompList.initialize
	Dim Result As Map
	Dim promise As BANanoPromise = vm.readAsText(fr)
	promise.Then(Result)
		'get the json content
		Dim compJSON As String = Result.get("result")
		'convert to list
		CompList = BANano.fromjson(compJSON)
	promise.Else(Result)
		Dim compError As String = Result.get("result")
		vm.ShowSnackbar(compError)
	promise.End
	'nully file component so we can select same file
	vm.NullifyFileSelect("fucomponent")
	'
	'lets import to the db
	db.OpenWait("bvmdesigner", "bvmdesigner")
	compSQL.Initialize("components", "id")
	compSQL.AddIntegers(Array("id", "row","col","tabindex"))
	compSQL.AddStrings(Array("parentid","name","vmodel","attributes","styles","classes", "loose","label", "icon","avatar","items", "controltype"))
	For Each nrec As Map In CompList
		compSQL.Insert1(nrec)
		compSQL.result = db.ExecuteWait(compSQL.query, compSQL.args)
		compSQL.FromJSON
	Next
	CreateUX
End Sub

Sub gridMenuitems_click(e As BANanoEvent)
	Dim menuID As String = vm.getidfromevent(e)
	Select Case menuID
		Case "btncleargrid"
			vm.ShowConfirm("cleargrid", "Confirm Clear Grid", "Are you sure that you want to clear the grid?", "Yes", "No")
		Case "btnremovelastgrid"
			vm.ShowConfirm("removelastgrid", "Confirm Remove Last", "Are you sure that you want to remove the last grid row?", "Yes", "No")
	End Select
End Sub


Sub confirm_cancel(e As BANanoEvent)
	Dim resp As String = vm.getconfirm
	Select Case resp
	Case "confirmsave"
		'clear the components
		NewProject
	End Select
End Sub

Sub confirm_ok(e As BANanoEvent)
	Dim resp As String = vm.getconfirm
	Select Case resp
		Case "clearcomp"
			ClearComp
		Case "removelastcomp"
			RemoveLastCompItem
		Case "cleargrid"
			ClearGrid
		Case "removelastgrid"
			RemoveLastGridItem
		Case "deletepropbag"
			DeleteIT
		Case "deleteproject"
			DeleteProject
		Case "loadproject"		
			ExtractComponents("Yes")
		Case "confirmsave"
			SaveComponents("yes")
	End Select
End Sub


'remove last comp item
Sub RemoveLastCompItem
	vm.pagepause
	ShowBag("")
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("components", "id")
	rsSQL.Execute("select id from components order by id desc")
	rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
	rsSQL.FromJSON
	If rsSQL.result.size > 0 Then
		'get the record
		Dim rec As Map = rsSQL.result.get(0)
		'get the id
		Dim sid As String = rec.get("id")
		'delete the record
		rsSQL.Initialize("components", "id")
		rsSQL.AddIntegers(Array("id", "row","col","tabindex"))
		rsSQL.AddStrings(Array("parentid","name","vmodel","attributes","styles","classes", "loose","label", "icon","avatar","items", "controltype"))
		rsSQL.Delete(sid)
		rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
		rsSQL.FromJSON
	End If
	vm.pageresume
	isDirty = True
	CreateUX
End Sub

'clear the contents of the grid
Sub ClearComp
	vm.pagepause
	ShowBag("")
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("components", "id")
	rsSQL.DeleteAll
	rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
	rsSQL.FromJSON
	vm.setdata("tableitems", vm.newlist)
	vm.pageresume
	CreateUX
End Sub

'remove last grid item
Sub RemoveLastGridItem
	vm.pagepause
	ShowBag("")
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("grid", "id")
	rsSQL.Execute("select id from grid order by id desc")
	rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
	rsSQL.fromjson
	If rsSQL.result.size > 0 Then
		'get the record
		Dim rec As Map = rsSQL.result.get(0)
		'get the id
		Dim sid As String = rec.get("id")
		'delete the record
		rsSQL.Initialize("grid", "id")
		rsSQL.AddIntegers(Array("id"))
		rsSQL.AddStrings(Array("controltype"))
		rsSQL.Delete(sid)
		rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
		rsSQL.FromJSON
	End If
	vm.pageresume
	isDirty = True
	CreateUX
End Sub

'clear the contents of the grid
Sub ClearGrid
	vm.pagepause
	ShowBag("")
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("grid", "id")
	rsSQL.DeleteAll
	rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
	rsSQL.FromJSON
	vm.pageresume
	CreateUX
End Sub

'create the layout of the page
Sub DesignLayout
	vm.Container.AddRows(1)
	vm.Container.AddColumns(1,2,2,2,2)
	vm.Container.AddColumns(1,7,7,7,7)
	vm.Container.AddColumns(1,3,3,3,3)
	'vm.Container.SetStyleRC(1, 3, "overflow-y", "scroll")
	'vm.Container.SetStyleRC(1, 1, "overflow-y", "scroll")
	'
	'vm.Container.SetBorderRC(1, 2, "1px", vm.COLOR_LIGHTBLUE, vm.BORDER_DASHED)
	'
	'set drag and drop events
	'vm.Container.SetOnDragOverRC(1, 2, "ItemDragOver")
	'vm.Container.SetOnDropRC(1, 2, "ItemDrop")
	'
	ep = vm.CreateExpansionpanels("ep1", Me).SetAccordion(True)
	ep.SetVisible(True)
	ep.SetVmodel("selectedpanel")
	'
	Dim ep1 As VMExpansionPanel = GridPanel
	ep.AddPanel(ep1)
	'***
	'display
	Dim display As VMExpansionPanel = DisplayPanel
	ep.AddPanel(display)
	'***
	' form inputs
	Dim inputs As VMExpansionPanel = FormInputPanel
	ep.AddPanel(inputs)
	'
	Dim nav As VMExpansionPanel = NavigationPanel
	ep.AddPanel(nav)
	'
	ep.AddPanel(LayoutPanel)
	ep.AddPanel(ToolsPanel)
	'
	'create toolbox tabs
	tblBox = vm.CreateTabs("tblbox", Me).SetVModel("tblbox")
	tblBox.AddTabSlider
	tblBox.AddTabItem("tblbox1","Toolbox", "", ep.tostring)
	'list of components
	Dim myComponents1 As VMList = vm.CreateList("mycomponents", Me)
	myComponents1.SetDataSourceTemplate("myux", "id", "avatar", "", "vmodel", "label", "")
	myComponents1.SetDense(True)
	tblBox.AddTabItem("comps","Components", "", myComponents1.tostring)
	
	'add tab as toolbox
	vm.container.AddComponent(1, 1, tblBox.tostring)
	
	tabs = vm.CreateTabs("tabsd", Me).SetGrow(True).SetIconsAndText(True).SetCentered(True).SetVModel("devspace")
	tabs.OnToolBar = False
	'
	dnd = vm.CreateContainer("dnd", Me).SetFluid(True)
	dnd.AddRows(1).AddColumns12
	dnd.SetJustifyRC(1, 1, "center")
	dnd.SetAlignRC(1, 1, "center")
	dnd.AddClassRC(1, 1, Array("mx-auto"))
	dnd.SetOnDragOver("ItemDragOver")
	dnd.SetOnDrop("ItemDrop")
	'
	mymac.Initialize(vue, "myma", Me)
	mymac.SetMacbook
	'
	myipad.Initialize(vue, "myipad", Me)
	myipad.SetIpad
	myipad.hide
	'
	myiphone.Initialize(vue, "myiphone", Me)
	myiphone.SetIphone8Plus
	myiphone.hide
		
	dnd.AddComponent(1, 1, mymac.tostring)
	dnd.AddComponent(1, 1, myipad.tostring)
	dnd.AddComponent(1, 1, myiphone.tostring)
	'
	b4x = vm.CreateContainer("b4x", Me).SetFluid(True)
	b4x.AddRows(1).AddColumns12
	'
	html5 = vm.CreateContainer("html5", Me).SetFluid(True)
	html5.AddRows(1).AddColumns12
	'
	schema = vm.CreateContainer("schema", Me).SetFluid(True)
	schema.AddRows(3).AddColumns12
	'
	schemaDT = vm.CreateDataTable("schemaDT", "key", Me)
	schemaDT.SetTitle("Schema")
	schemaDT.AddButtonIcon("schemaDB", "mdi-database", "", "Database Schema")
	schemaDT.AddButtonIcon("schemalisting", "mdi-file-outline", "", "Table Listing")
	schemaDT.AddButtonIcon("formlisting", "mdi-laptop", "", "Form Listing")
	schemaDT.AddButtonIcon("builderlisting", "build", "", "Builder Listing")
	schemaDT.AddButtonIcon("schemaReset", "mdi-restart", "", "Reset")
	
	schemaDT.AddColumns(CreateMap("key": "Name", "title": "Title", "subtitle": "Type", "colwidth": "Width"))
	schemaDT.AddColumns(CreateMap("colalign": "Align", "colcontroltype": "Component", "coldatatype": "Data Type", "collength": "Length",  "colvalue": "Value"))
	schemaDT.AddColumns(CreateMap("colsortable": "Sortable", "colrequired": "Required", "colvisible": "Visible", "colactive": "Active", "colontable": "On Table"))
	schemaDT.AddColumns(CreateMap("colindexed": "Indexed", "colvaluedisplay": "Value / Display"))
	
	schemaDT.AddColumns(CreateMap("colrow": "Row"))
	schemaDT.AddColumns(CreateMap("colcolumn": "Col"))
	schemaDT.AddColumns(CreateMap("coloffsetsmall": "OS"))
	schemaDT.AddColumns(CreateMap("coloffsetmedium": "OM"))
	schemaDT.AddColumns(CreateMap("coloffsetlarge": "OL"))
	schemaDT.AddColumns(CreateMap("coloffsetxlarge": "OX"))
	schemaDT.AddColumns(CreateMap("colsizesmall": "SS"))
	schemaDT.AddColumns(CreateMap("colsizemedium": "SM"))
	schemaDT.AddColumns(CreateMap("colsizelarge": "SL"))
	schemaDT.AddColumns(CreateMap("colsizexlarge": "SX"))
	'
	schemaDT.AddColumns(CreateMap("colscope": "Scope"))
	schemaDT.AddColumns(CreateMap("colfieldtype": "Field Type"))
	schemaDT.AddColumns(CreateMap("coldefaultvalue": "Default Value"))
	schemaDT.AddColumns(CreateMap("subtitle1": "Description"))
	schemaDT.AddColumns(CreateMap("colminrange": "Min Range"))
	schemaDT.AddColumns(CreateMap("colmaxrange": "Max Range"))
	schemaDT.AddColumns(CreateMap("collist": "List / Parameters"))
	schemaDT.AddColumns(CreateMap("coltype": "Type"))
	schemaDT.AddColumns(CreateMap("colsetranges": "Set Ranges"))
	schemaDT.AddColumns(CreateMap("colhasset": "Set"))
	schemaDT.AddColumns(CreateMap("colhasget": "Get"))
	's
	schemaDT.SetEdit(True)
	schemaDT.SetDelete(True)
	schemaDT.SetDataSourceName("tableitems")
	schema.AddComponent(1, 1, schemaDT.ToString)
	'create the preview
	'previewTB = vm.CreateDataTable("previewSchema", "key", Me)
	'previewTB.SetTitle("Preview")
	'Dim p As String = previewTB.tostring
	'schema.AddComponent(2, 1, p)
	'
	dbCode.Initialize(vue, "dbcode", Me)
	dbCode.SetLanguage("vb")
	dbCode.SetTitle("Table Schema Source Code")
	schema.AddComponent(2, 1, dbCode.tostring)
	'
	pc.Initialize(vue, "b4xcode", Me)
	pc.SetLanguage("vb")
	pc.SetTitle("B4X Source Code")
	b4x.AddComponent(1, 1, pc.tostring)
	
	'html code
	htm.Initialize(vue, "htmlcode", Me)
	htm.SetLanguage("html")
	htm.SetTitle("HTML Source Code")
	html5.AddComponent(1, 1, htm.tostring)
	'
	tabs.AddTab("dndrea", "Drag n Drop / Preview", "mdi-drag-variant", dnd)
	tabs.AddTab("b4xarea", "B4X", "code", b4x)
	tabs.AddTab("htmlarea", "HTML", "mdi-language-html5", html5)
	tabs.AddTab("schemaarea", "Schema", "mdi-database", schema)
	
	vm.container.AddComponent(1, 2, tabs.tostring)
	'
	'create a toolbar to save and delete the property bag
	tblProp = vm.CreateToolbar("tblx", Me).SetDense(True).SetVisible(False)
	tblProp.AddSpacer
	tblProp.AddIcon("btnSaveProp", "save", "Save property bag", "")
	tblProp.AddIcon("btnDeleteProp", "delete", "Delete property bag", "")
	vm.container.AddComponent(1, 3, tblProp.tostring)
End Sub

Sub builderlisting_click(e As BANanoEvent)
	Dim dbFields As List
	dbFields.initialize
	dbFields.AddAll(Array("key", "title", "coltype", "colscope" , "colfieldtype" , "coldefaultvalue", "colminrange", "colmaxrange", "colhasset", "colhasget", "edit", "delete"))
	schemaDT.ApplyFilter(dbFields)
	schemaDT.SetDataSourceName("tableitems")
End Sub

'show columns applicable to the form input
Sub formlisting_click(e As BANanoEvent)
	Dim dbFields As List
	dbFields.initialize
	dbFields.AddAll(Array("key", "title", "colcontroltype", "coldatatype" , "colrow" , _
	"colcolumn", "coloffsetsmall", "coloffsetmedium", "coloffsetlarge", "coloffsetxlarge", _
	"colsizesmall", "colsizemedium", "colsizelarge", "colsizexlarge", "edit", "delete"))
	schemaDT.ApplyFilter(dbFields)
	schemaDT.SetDataSourceName("tableitems")
End Sub

'show columns applicable to the table listing
Sub schemalisting_click(e As BANanoEvent)
	Dim dbFields As List
	dbFields.initialize
	dbFields.AddAll(Array("key", "title", "subtitle", "colwidth" , "colalign" , "colsortable", "colontable", "edit", "delete"))
	schemaDT.ApplyFilter(dbFields)
	schemaDT.SetDataSourceName("tableitems")
End Sub

'only show columns that are related to the database
Sub schemaDB_click(e As BANanoEvent)
	Dim dbFields As List
	dbFields.initialize
	dbFields.AddAll(Array("key", "title", "coldatatype" , "collength" , "colvalue", "colindexed", "colvaluedisplay", "edit", "delete"))
	schemaDT.ApplyFilter(dbFields)
	schemaDT.SetDataSourceName("tableitems")
End Sub

'reset the filter
Sub schemaReset_click(e As BANanoEvent)
	schemaDT.ResetFilter
	schemaDT.SetDataSourceName("tableitems")
End Sub

Sub AddInstruction(sbx As StringBuilder, modName As String, subName As String, partX As String)
	Dim xcode As String = $"INSTRUCTION: Copy and paste the code below this line to the "${modName}" module,"$
	If subName <> "" Then
	  xcode = xcode & $" inside the "${subName}" subroutine, "$
	End If 
	If partX <> "" Then
		xcode = xcode & $" ${partX}"$
	End If
	AddComment(sbx, xcode)
End Sub

Sub Design_DBSourceCode
	Dim prj As Map = vm.getdata("project")
	Dim pid As String = prj.getdefault("id", "")
	sprojectname = prj.getdefault("projectname", "")
	sdbtype = prj.getdefault("dbtype", "")
	sdatabasename = prj.getdefault("databasename", "")
	Select Case sdbtype
	Case "banano"
		rsType = "BANanoAlaSQLE"
	Case "sqlite"
		rsType = "BANanoSQLiteE"
		If sdatabasename.endswith(".db") = False Then sdatabasename = $"${sdatabasename}.db"$
	Case "mysql"
		rsType = "BANanoMySQLE"
	Case "mssql"
		rsType = "BANanoMSSQLE"
	End Select
	'
	If pid = "" Then
		vm.showsnackbarerror("Please select a project to process first!")
		Return
	End If
	'
	'get the table name
	dbCode.SetTitle("Table Schema Source Code")
	'
	Read_Table
	'
	Dim auto As String = ""
	Dim tbName As String = mattr.get("vmodel")
	Dim itemkey As String = mattr.get("itemkey")
	bisautoincrement = YesNoToBoolean(mattr.getdefault("isautoincrement", "No"))
	Dim ssingular As String = mattr.Get("singular")
	Dim smanyrecords As String = mattr.get("manyrecords")
	Dim snewid As String = mattr.get("newid")
	Dim sisaddnew As String = mattr.get("isaddnew")
	Dim stitle As String = mattr.get("label")
	Dim isdialog As String = mattr.get("isdialog")
	Dim sDatasourcename As String = mattr.get("datasourcename")
	'
	itemkey = itemkey.tolowercase
	If bisautoincrement Then auto = itemkey
	tbName = tbName.tolowercase
	'
	ssingular = vm.propercase(ssingular)
	Dim dlg As String = vm.propercase(smanyrecords)
	Dim dlg As String = dlg.replace(" ","")
	dlg = dlg.trim
	'
	Dim mdlName As String = $"pg${dlg}"$
	Dim diagName As String = $"dlg${dlg}"$
	Dim rsName As String = $"rs${dlg}"$
	'
	If tbName = "" Then Return
	
	Dim flds As List = vm.getdata("tableitems")
	'define fields to sort by
	Dim sorts As List
	sorts.initialize
	Dim actions As List
	actions.initialize
	Dim loaders As List
	loaders.initialize
	Dim foreign As List
	foreign.initialize
	'find if we have foreign key linkages
	For Each m As Map In flds
		Dim bcolislookup As Boolean = YesNoToBoolean(m.GetDefault("colislookup", "No"))
		If bcolislookup Then foreign.add(m)
	Next
	'
	Dim sbl As StringBuilder
	sbl.Initialize
	AddComment(sbl, "INSTRUCTION: In your B4J project, click Project > Add New Module > Code Module")
	AddComment(sbl, $"INSTRUCTION: Type "${mdlName}" as the module name and click Ok"$)
	AddNewLine(sbl)
	AddNewLine(sbl)
	
	'show on navbar
	If  bisShowonnavbar Then
		AddInstruction(sbl, "pgIndex", "BuildNavBar" , "")
		AddComment(sbl,$"Add ${stitle} to navbar"$)
		If bisicon Then
			AddCode(sbl, $"vm.NavBar.AddIcon1("nav${dlg}", "${siconname}", "${sIconcolor}","${stooltip}", "")"$)
		Else
			AddCode(sbl, $"vm.NavBar.AddButton1("nav${dlg}", "${siconname}", "${stitle}", "${stooltip}", "")"$)
		End If
		AddNewLine(sbl)
		'AddComment(sbl, $"add add & refresh button to the navbar for ${dlg}"$)
		'AddCode(sbl, $"vm.NavBar.AddIcon("btnAdd${dlg}","add", "Add ${ssingular}", "")"$)
		'AddCode(sbl, $"vm.NavBar.AddIcon("btnRefresh${dlg}","refresh", "Refresh ${stitle}", "")"$)
		'AddNewLine(sbl)
		'AddNewLine(sbl)
		'
		'**** CLICK - ADD RECORD
		'AddInstruction(sbl, "pgIndex", "" , "")
		'AddComment(sbl, $"add a new ${dlg} ${ssingular}"$)
		'AddCode(sbl, $"Sub btnAdd${dlg}_click(e As BANanoEvent)"$)
		'AddComment(sbl, $"execute adding ${ssingular}"$)
		'AddCode(sbl, $"${mdlName}.Add${dlg}"$)
		'AddCode(sbl, "End Sub")
		'AddCode(sbl, CRLF)
		'AddCode(sbl, CRLF)
		'
		'**** CLICK - REFRESH RECORDS
		'AddComment(sbl, $"refresh ${stitle} listing"$)
		'AddCode(sbl, $"Sub btnRefresh${dlg}_click(e As BANanoEvent)"$)
		'AddComment(sbl, $"execute code to refresh listing for ${stitle}"$)
		'AddCode(sbl, $"vm.CallMethod("SelectAll_${dlg}")"$)
		'AddCode(sbl, "End Sub")
		'AddCode(sbl, CRLF)
		'AddCode(sbl, CRLF)
	
		'**** NAV CLICK TO SHOW PAGE
		AddInstruction(sbl, "pgIndex", "" , "")
		AddComment(sbl, $"click ${mdlName} nav button"$)
		AddCode(sbl, $"Sub nav${dlg}_click(e As BANanoEvent)"$)
		AddComment(sbl, $"show the page ${stitle}"$)
		AddCode(sbl, $"${mdlName}.Show"$)
		AddCode(sbl, "End Sub")
		AddCode(sbl, CRLF)
	End If
	
	'show on drawer
	If bisShowondrawer Then
		AddInstruction(sbl, "pgIndex", "BuildNavDrawer", "")
		AddComment(sbl,$"Add ${stitle} to drawer"$)
		AddCode(sbl, $"vm.Drawer.AddIcon1("page${dlg}", "${siconname}", "${sIconcolor}", "${stitle}", "${stooltip}")"$)
		If bisdivider Then
			AddCode(sbl, $"vm.Drawer.AddDivider1(${bisinsetdivider})"$)
		End If
		AddNewLine(sbl)
		'**** DRAWER CLICK TO SHOW PAGE
		AddInstruction(sbl, "pgIndex", "draweritems_click" , "inside the case statement")
		AddCode(sbl, $"Case "page${dlg.tolowercase}""$)
		AddComment(sbl, $"show ${stitle}"$)
		AddCode(sbl, $"${mdlName}.Show"$)
		AddCode(sbl, CRLF)
	End If
	'
	'**** ADD PAGE TO MASTER
	AddInstruction(sbl, "pgIndex", "AddPages" , "")
	AddComment(sbl, $"code to add the ${stitle} template code to the master HTML template"$)
	AddCode(sbl, $"vm.AddPage(${mdlName}.name, ${mdlName})"$)
	AddCode(sbl, CRLF)
	AddCode(sbl, CRLF)
	'
	'**** DELETE COMFIRM
	AddInstruction(sbl, "pgIndex", "confirm_ok" , "inside the case statement")
	sbl.append($"Case "delete_${tbName}""$).append(CRLF)
	AddComment(sbl, "read the saved record id")
	sbl.append($"Dim RecID As String = vm.GetState("${tbName}${sItemkey}", "")"$).append(CRLF)
	sbl.append($"If RecID = "" Then Return"$).append(CRLF)
	AddComment(sbl, "delete the record")
	sbl.append($"${mdlName}.DeleteRecord_${dlg}(RecID)"$).append(CRLF)
	sbl.append(CRLF).append(CRLF)
	'
	'**** OPEN DB & CREATE TABLE
	AddInstruction(sbl, "Main", "BANano_Ready" , "before pgIndex.Init call")
	Select Case sdbtype
	Case "banano"	
		AddComment(sbl, "open the database and wait")
		sbl.append($"db.OpenWait("${sdatabasename}", "${sdatabasename}")"$).append(CRLF)
		AddComment(sbl, "resultset variable")
		sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
		AddComment(sbl, "initialize table for table creation")
		sbl.append($"${rsName}.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
	Case "sqlite", "mysql", "mssql"
		sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
		AddComment(sbl, "initialize table for table creation")
			sbl.append($"${rsName}.Initialize("${sdatabasename}", "${tbName}", "${itemkey}", "${auto}")"$).append(CRLF)
	End Select	
	
	AddComment(sbl, "add each field to the schema")
'
	If bisEdit Then actions.add(CreateMap("key":"edit","title":"Edit"))
	If bisDelete Then actions.Add(CreateMap("key":"delete","title":"Delete"))
	If bisClone Then actions.add(CreateMap("key":"clone","title":"Clone"))
	If bisDownload Then actions.add(CreateMap("key":"download","title":"Download"))
	If bisPrint Then actions.add(CreateMap("key":"print","title":"Print"))
	If bisMenu Then actions.add(CreateMap("key":"menu","title":"Menu"))
	
	'add columns
	For Each m As Map In flds
		Dim xkey As String = m.GetDefault("key","")   'Name
		Dim xtitle As String = m.GetDefault("title","")  'Title
		Dim xtype As String = m.GetDefault("subtitle","")  'Type
		Dim xdatatype As String = m.GetDefault("coldatatype", "")   'Data Type
		Dim xlength As String = m.GetDefault("collength","")  'Length
		Dim xvalue As String = m.GetDefault("colvalue", "")   'Value
		Dim xindexed As String = m.GetDefault("colindexed", "No")      'Indexed
		Dim xsortable As Boolean = YesNoToBoolean(m.GetDefault("colsortable", "No"))    'Sortable
		
		If xkey = "" Then Continue
		xkey= xkey.tolowercase
		Select Case xtype
		Case "action"
			'add to a list of actions
			actions.add(m)
		Case Else
			sbl.append($"${rsName}.SchemaAddField("${xkey}", "${xdatatype}")"$).append(CRLF)
			'we can sort by this field
			If xsortable Then sorts.add(xkey)
			'add columns to format
		End Select
	Next
	AddComment(sbl, "generate & run command to create the table")
	sbl.append($"${rsName}.SchemaCreateTable"$).append(CRLF)
	
	Select Case sdbtype
	Case "banano"
		sbl.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
	Case "sqlite", "mysql", "mssql"
		AddCode(sbl, $"${rsName}.JSON = BANano.CallInlinePHPWait(${rsName}.MethodName, ${rsName}.Build)"$)
	End Select	
	
	AddCode(sbl, $"${rsName}.FromJSON"$)
	AddNewLine(sbl)
	AddNewLine(sbl)
	'
	'**** PAGE CODE
	'copy this code to a code module
	AddComment(sbl, $"INSTRUCTION: Press and hold Crtl+A to select all code and press Delete key, this will delete all the code"$)
	AddInstruction(sbl, mdlName, "" , "")
	'
	AddNewLine(sbl)
	AddCode(sbl, $"'Static code module"$)
	AddCode(sbl, $"#IgnoreWarnings:12"$)
	AddCode(sbl, $"Sub Process_Globals"$)
	AddCode(sbl, $"Public Name As String = "${dlg}Code""$)
	AddCode(sbl, $"Public Title As String = "${stitle}""$)
	AddCode(sbl, $"Private vm As BANanoVM"$)
	AddCode(sbl, $"Private BANano As BANano  'ignore"$)
	sbl.append($"Private ${diagName} As VMDialog"$).append(CRLF)
	sbl.append($"Private dt${tbName} As VMDataTable"$).append(CRLF)
	sbl.append($"Private cont As VMContainer"$).append(CRLF)
	sbl.append($"Private Mode As String"$).append(CRLF)
	AddCode(sbl, "Private vue As BANanoVue")
	AddCode(sbl, "End Sub")
	AddNewLine(sbl)
	'
	'**** BUILD PAGE
	AddCode(sbl, "Sub Code")
	AddComment(sbl, "Establish a reference to the app")
	AddCode(sbl, "vm = pgIndex.vm")
	AddCode(sbl, "vue = vm.vue")
	'
	AddComment(sbl, "create a container to hold all contents based on the page name")
	AddCode(sbl, $"cont = vm.CreateContainer(Name, Me)"$)
	AddComment(sbl, "hide the container")
	AddCode(sbl, "cont.Hide")
	AddComment(sbl, "add the table to container")
	AddCode(sbl, $"CreateDataTable_${tbName}"$)
	AddComment(sbl, "add the dialog to page")
	sbl.append($"CreateDialog_${dlg}"$).append(CRLF)
	AddComment(sbl, "add the container to the page")
	AddCode(sbl, "vm.AddContainer(cont)")
	AddComment(sbl, "add method to get all records")
	AddCode(sbl, $"vm.SetMethod(Me, "SelectAll_${dlg}")"$)
	'
	'set methods for foreign linkages
	For Each f As Map In foreign
		Dim scolforeigntable As String = f.getdefault("colforeigntable", "")
		AddCode(sbl, $"vm.SetMethod(Me, "Load_${scolforeigntable}")"$)
	Next
	'
	AddCode(sbl, "End Sub")
	AddNewLine(sbl)
	'
	'**** SHOW PAGE
	AddComment(sbl,"show the page")
	AddCode(sbl, "Sub Show")
	'
	If bisNavbarvisible Then
		AddComment(sbl, "the navbar is visible for this page")
		AddCode(sbl,"vm.NavBar.Show")
	Else
		AddComment(sbl, "the navbar is hidden for this page")
		AddCode(sbl, "vm.NavBar.Hide")
	End If
	'
	If bisHamburgervisible Then
		AddComment(sbl, "show the hamburger for this page")
		AddCode(sbl, "vm.NavBar.Hamburger.SetVisible(True)")
	Else
		AddComment(sbl, "hide the hamburger for this page")
		AddCode(sbl, "vm.NavBar.Hamburger.SetVisible(False)")
	End If
	'
	If bisDrawervisible Then
		AddComment(sbl, "the drawer should be visible for this page")
		AddCode(sbl, "vm.Drawer.Show")
	Else
		AddComment(sbl, "the drawer should be hidden for this page")
		AddCode(sbl, "vm.Drawer.Hide")
	End If
	'
	If bislogovisible Then
		AddComment(sbl, "the logo should be visible for this page")
		AddCode(sbl, "vm.NavBar.Logo.Show")
	Else
		AddComment(sbl, "the logo should be hidden for this page")
		AddCode(sbl, "vm.NavBar.Logo.Hide")
	End If
	'update the navbar title
	If bisUpdatenavtitle Then
		AddComment(sbl, "update the navbar title")
		AddCode(sbl, $"vm.NavBar.UpdateTitle(Title)"$)
	End If
	'
	If  bisShowonnavbar Then
		AddComment(sbl, $"show ${stitle} on navbar"$)
		'AddCode(sbl, $"vm.ShowItem("btnAdd${dlg}")"$)
		'AddCode(sbl, $"vm.ShowItem("btnRefresh${dlg}")"$)
		AddCode(sbl, $"vm.ShowItem("nav${dlg}")"$)
	Else
		AddCode(sbl, $"vm.HideItem("nav${dlg}")"$)
	End If
	'
	AddComment(sbl, "2. Show the page and hide others")
	AddCode(sbl, $"vm.ShowPage(Name)"$)
	AddComment(sbl, "load records to table")
	AddCode(sbl, $"vm.CallMethod("SelectAll_${dlg}")"$)
	AddCode(sbl, "End Sub")
	AddNewLine(sbl)
	'
	'**** DELETE ALL RECORDS
	AddComment(sbl, "delete all records")
	sbl.append($"Sub DeleteAll_${dlg}"$).append(CRLF)
	Select Case sdbtype
		Case "banano"
			AddComment(sbl, "database variable")
			sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
			AddComment(sbl, "open the database and wait")
			sbl.append($"db.OpenWait("${sdatabasename}", "${sdatabasename}")"$).append(CRLF)
			AddComment(sbl, "resultset variable")
			sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
			AddComment(sbl, "initialize table for deletion")
			sbl.append($"${rsName}.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
			AddComment(sbl, "generate & run command to delete all records")
			sbl.append($"${rsName}.DeleteAll"$).append(CRLF)
			sbl.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
			sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
			AddComment(sbl, "initialize table for table creation")
			sbl.append($"${rsName}.Initialize("${sdatabasename}", "${tbName}", "${itemkey}", "${auto}")"$).append(CRLF)
			sbl.append($"${rsName}.DeleteAll"$).append(CRLF)
			AddCode(sbl, $"${rsName}.JSON = BANano.CallInlinePHPWait(${rsName}.MethodName, ${rsName}.Build)"$)
	End Select
	'
	
	AddCode(sbl, $"${rsName}.FromJSON"$)
	AddComment(sbl, $"execute code to refresh listing for ${stitle}"$)
	AddCode(sbl, $"vm.CallMethod("SelectAll_${dlg}")"$)
	sbl.append("End Sub").append(CRLF).append(CRLF)
	'
	'**** DELETE SINGLE RECORD
	AddComment(sbl, "delete single record")
	sbl.append($"Sub DeleteRecord_${dlg}(RecordID As String)"$).append(CRLF)
	Select Case sdbtype
	Case "banano"
		AddComment(sbl, "database variable")
		sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
		AddComment(sbl, "open the database and wait")
		sbl.append($"db.OpenWait("${sdatabasename}", "${sdatabasename}")"$).append(CRLF)
		AddComment(sbl, "resultset variable")
		sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
		AddComment(sbl, "initialize table for deletion")
			sbl.append($"${rsName}.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
	Case "sqlite", "mysql", "mssql"
		sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
		AddComment(sbl, "initialize table for deletion")
			sbl.append($"${rsName}.Initialize("${sdatabasename}", "${tbName}", "${itemkey}", "${auto}")"$).append(CRLF)
	End Select
	'
	
	AddComment(sbl, "define schema for record")
	sbl.append($"${rsName}.SchemaFromDesign(${diagName}.Container)"$).append(CRLF)
	AddComment(sbl, "generate & run command to delete single record")
	sbl.append($"${rsName}.Delete(RecordID)"$).append(CRLF)
	Select Case sdbtype
	Case "banano"	
		sbl.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
	Case "sqlite", "mysql", "mssql"
		AddCode(sbl, $"${rsName}.JSON = BANano.CallInlinePHPWait(${rsName}.MethodName, ${rsName}.Build)"$)
	End Select
	AddCode(sbl, $"${rsName}.FromJSON"$)
	AddComment(sbl, $"execute code to refresh listing for ${stitle}"$)
	AddCode(sbl, $"vm.CallMethod("SelectAll_${dlg}")"$)
	sbl.append("End Sub").append(CRLF).append(CRLF)
	'
	'**** SELECT ALL RECORDS
	AddComment(sbl, "select all records")
	sbl.append($"Sub SelectAll_${dlg}"$).append(CRLF)
	Select Case sdbtype
		Case "banano"
			AddComment(sbl, "database variable")
			sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
			AddComment(sbl, "open the database and wait")
			sbl.append($"db.OpenWait("${sdatabasename}", "${sdatabasename}")"$).append(CRLF)
			AddComment(sbl, "resultset variable")
			sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
			AddComment(sbl, "initialize table for reading")
			sbl.append($"${rsName}.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
			sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
			AddComment(sbl, "initialize table for table creation")
			sbl.append($"${rsName}.Initialize("${sdatabasename}", "${tbName}", "${itemkey}", "${auto}")"$).append(CRLF)
	End Select
	'
	
	AddComment(sbl, "generate & run command to select all records")
	'use sorts
	Dim ssort As String
	If sorts.size = 0 Then sorts.add(itemkey)
	ssort = vm.List2ArrayVariable(sorts) 
	If foreign.Size = 0 Then
		'we do not have foreign links	
		sbl.append($"${rsName}.SelectAll(Array("*"), Array(${ssort}))"$).append(CRLF)
	Else
		'process a foreign query linkages
		Dim sbCommand As StringBuilder
		sbCommand.Initialize
		Dim sbWhere As StringBuilder
		sbWhere.Initialize
		Dim fTables As Map
		fTables.initialize
		Dim sbSorts As StringBuilder
		sbSorts.Initialize
		'
		sbCommand.Append("SELECT ")
		'
		For Each m As Map In flds
			Dim fld As String = m.GetDefault("key","")
			Dim xsortable As Boolean = YesNoToBoolean(m.GetDefault("colsortable", "No"))
			'Dim xontable As Boolean = YesNoToBoolean(m.GetDefault("colontable", "No"))
			If fld = "" Then Continue
			'If xontable = False Then Continue
			
			sbCommand.append($"${tbName}.${fld},"$)
			'	
			Dim bcolislookup As Boolean = YesNoToBoolean(m.GetDefault("colislookup", "No"))
			If bcolislookup Then
				'add the link to the foreign table
				Dim scolforeigntable As String = m.getdefault("colforeigntable", "")
				Dim ccolforeignkey As String = m.getdefault("colforeignkey", "")
				Dim ccolforeignvalue As String = m.getdefault("colforeignvalue", "")
				'
				scolforeigntable = scolforeigntable.tolowercase
				ccolforeignkey = ccolforeignkey.tolowercase
				ccolforeignvalue = ccolforeignvalue.tolowercase
				'add the foreign value field
				sbCommand.append($"${scolforeigntable}.${ccolforeignvalue},"$)
				'add sortable
				If xsortable Then sbSorts.append($"${scolforeigntable}.${ccolforeignvalue},"$)

				'add the where clause
				sbWhere.append($"${tbName}.${fld} = ${scolforeigntable}.${ccolforeignkey} AND "$)
				'build list of foreign tables, ensure we dont have duplicates
				fTables.put(scolforeigntable, scolforeigntable)
			Else
				'add sortable
				If xsortable Then sbSorts.append($"${tbName}.${fld},"$)
			End If
		Next
		'remove training comma
		Dim xCommand As String = sbCommand.tostring
		xCommand = vm.RemDelim(xCommand, ",")
		Dim xWhere As String = sbWhere.ToString
		xWhere = vm.RemDelim(xWhere, " AND ")
		Dim xSorts As String = sbSorts.tostring
		xSorts = vm.RemDelim(xSorts, ",")
		'		
		Dim xFrom As String = vm.JoinMapKeys(fTables, ",")
		Dim xSQL As String = $"${xCommand} FROM ${tbName}, ${xFrom} WHERE ${xWhere}"$
		If xSorts <> "" Then xSQL = xSQL & $" ORDER BY ${xSorts}"$
		'create an execute
		AddCode(sbl, $"Dim strSQL As String = "${xSQL}""$)
		sbl.append($"${rsName}.Execute(strSQL)"$).append(CRLF)
	End If
	'
	Select Case sdbtype
	Case "banano"	
		sbl.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
	Case "sqlite", "mysql", "mssql"
		AddCode(sbl, $"${rsName}.JSON = BANano.CallInlinePHPWait(${rsName}.MethodName, ${rsName}.Build)"$)
	End Select
	AddCode(sbl, $"${rsName}.FromJSON"$)
	AddComment(sbl, "save records to state")
	sbl.append($"VM.SetData("${sDatasourcename}", ${rsName}.Result)"$).append(CRLF)
	AddComment(sbl, "update the data table records")
	AddCode(sbl, $"dt${tbName}.SetDataSource(${rsName}.Result)"$)
	sbl.append("End Sub").append(CRLF).append(CRLF)
	'
	'**** IS LOOKUP TABLE
	If bislookup Then
		'update the tables	
	End If
	'
	'**** TABLE ACTIONS
	'process table actions
	For Each a As Map In actions
		Dim xkey As String = a.GetDefault("key","")   'Name
		Dim xtitle As String = a.GetDefault("title","")  'Title
		'
		AddComment(sbl, $"${tbName} ${xtitle} action"$)
		sbl.append($"Sub dt${tbName}_${xkey}(item As Map)"$).append(CRLF)
		AddComment(sbl, "get the key")
		sbl.append($"Dim RecID As String = item.Get("${sItemkey}")"$).append(CRLF)
		AddCode(sbl, $"If RecID = "" Then Return"$)
		Select Case xkey
		Case "clone"
			'clone an existing record
			AddComment(sbl,"set mode to A-dd")
			sbl.append($"Mode = "A""$).append(CRLF)
			'set methods for foreign linkages
			For Each f As Map In foreign
				Dim scolforeigntable As String = f.getdefault("colforeigntable", "")
				AddCode(sbl, $"vm.CallMethod("Load_${scolforeigntable}")"$)
			Next			
			AddComment(sbl,"read existing record from database")
				'read record from the database
			Select Case sdbtype
			Case "banano"
				AddComment(sbl, "database variable")
				sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
				AddComment(sbl, "open the database and wait")
				sbl.append($"db.OpenWait("${sdatabasename}", "${sdatabasename}")"$).append(CRLF)
				AddComment(sbl, "resultset variable")
				sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
				AddComment(sbl, "initialize table for reading")
						sbl.append($"${rsName}.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
			Case "sqlite", "mysql", "mssql"
				sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
				AddComment(sbl, "initialize table for table creation")
						sbl.append($"${rsName}.Initialize("${sdatabasename}", "${tbName}", "${itemkey}", "${auto}")"$).append(CRLF)
			End Select
			
			AddComment(sbl, "define schema for record")
			sbl.append($"${rsName}.SchemaFromDesign(${diagName}.Container)"$).append(CRLF)
			AddComment(sbl, "generate & run command to read record")
			sbl.append($"${rsName}.Read(RecID)"$).append(CRLF)
			Select Case sdbtype
			Case "banano"
				sbl.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
			Case "sqlite", "mysql", "mssql"
				AddCode(sbl, $"${rsName}.JSON = BANano.CallInlinePHPWait(${rsName}.MethodName, ${rsName}.Build)"$)
			End Select
			AddCode(sbl, $"${rsName}.FromJSON"$)
			AddComment(sbl, "was the read successful?")
			sbl.append($"If ${rsName}.Result.Size = 0 Then Return"$).append(CRLF)
			AddComment(sbl, "the record as found!")
			sbl.append($"Dim Record As Map = ${rsName}.Result.Get(0)"$).append(CRLF)
			AddComment(sbl, "nullify key")
			AddCode(sbl, $"Record.put("${sItemkey}", Null)"$)
			AddComment(sbl, "Update the dialog details")
			AddCode(sbl, $"${diagName}.SetTitle("New ${ssingular}")"$)
			AddComment(sbl, "show the modal")
			AddCode(sbl, $"${diagName}.Show"$)
			AddComment(sbl, "update the state, this updates the v-model(s) for each input control")
			sbl.append($"vm.SetState(Record)"$).append(CRLF)
		Case "edit"
			'we are editing
			AddComment(sbl,"set mode to E-dit")
			sbl.append($"Mode = "E""$).append(CRLF)
			'set methods for foreign linkages
			For Each f As Map In foreign
				Dim scolforeigntable As String = f.getdefault("colforeigntable", "")
				AddCode(sbl, $"vm.CallMethod("Load_${scolforeigntable}")"$)
			Next
			AddComment(sbl,"read record from database")
			'read record from the database
			Select Case sdbtype
			Case "banano"
				AddComment(sbl, "database variable")
				sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
				AddComment(sbl, "open the database and wait")
				sbl.append($"db.OpenWait("${sdatabasename}", "${sdatabasename}")"$).append(CRLF)
				AddComment(sbl, "resultset variable")
				sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
				AddComment(sbl, "initialize table for reading")
						sbl.append($"${rsName}.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
			Case "sqlite", "mysql", "mssql"
				sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
				AddComment(sbl, "initialize table for table creation")
						sbl.append($"${rsName}.Initialize("${sdatabasename}", "${tbName}", "${itemkey}", "${auto}")"$).append(CRLF)
			End Select
				'
			AddComment(sbl, "define schema for record")
			sbl.append($"${rsName}.SchemaFromDesign(${diagName}.Container)"$).append(CRLF)
			AddComment(sbl, "generate & run command to read record")
			sbl.append($"${rsName}.Read(RecID)"$).append(CRLF)
			Select Case sdbtype
			Case "banano"
				sbl.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
			Case "sqlite", "mysql", "mssql"
				AddCode(sbl, $"${rsName}.JSON = BANano.CallInlinePHPWait(${rsName}.MethodName, ${rsName}.Build)"$)
			End Select
			AddCode(sbl, $"${rsName}.FromJSON"$)
			AddComment(sbl, "was the read successful?")
			sbl.append($"If ${rsName}.Result.Size = 0 Then Return"$).append(CRLF)
			AddComment(sbl, "the record as found!")
			sbl.append($"Dim Record As Map = ${rsName}.result.get(0)"$).append(CRLF)
			AddComment(sbl, "Update the dialog details")
			AddCode(sbl, $"${diagName}.SetTitle("Edit ${ssingular}")"$)
			AddComment(sbl, "show the modal")
			AddCode(sbl, $"${diagName}.Show"$)
			AddComment(sbl, "update the state, this updates the v-model(s) for each input control")
			sbl.append($"vm.SetState(Record)"$).append(CRLF)
		Case "delete"
			'we are deleting
			AddComment(sbl, "save the id to delete")
				sbl.append($"vm.SetData("${tbName}${sItemkey}", RecID)"$).append(CRLF)
			AddComment(sbl, "show confirm dialog")
			sconfirmfield = sconfirmfield.tolowercase
			AddCode(sbl, $"Dim s${sconfirmfield} As String = item.getdefault("${sconfirmfield}","")"$)
			sbl.append($"vm.ShowConfirm("delete_${tbName}", "Confirm Delete: " & s${sconfirmfield}, "$ & "_").append(CRLF)
			sbl.append($""Are you sure that you want to delete this ${ssingular}. You will not be able to undo your actions. Continue?","Ok","Cancel")"$).append(CRLF)
		Case Else
			'we are doing something else
			AddCode(sbl, $"vm.ShowSnackBarSuccess(BANano.ToJSON(item))"$)		
		End Select
		sbl.append($"End Sub"$).append(CRLF).Append(CRLF).append(CRLF)
	Next
	'
	'**** ADD NEW RECORD
	'add a new record
	AddComment(sbl, $"add a new ${ssingular}"$)
	sbl.append($"Sub Add${dlg}"$).Append(CRLF)
	AddComment(sbl, "set mode to A-add")
	sbl.append($"Mode = "A""$).append(CRLF)
	'set methods for foreign linkages
	For Each f As Map In foreign
		Dim scolforeigntable As String = f.getdefault("colforeigntable", "")
		AddCode(sbl, $"vm.CallMethod("Load_${scolforeigntable}")"$)
	Next
	AddComment(sbl, "update the title")
	sbl.append($"${diagName}.SetTitle("New ${ssingular}")"$).append(CRLF)
	AddComment(sbl, "show dialog")
	sbl.append($"${diagName}.Show"$).append(CRLF)
	sbl.append("End Sub").append(CRLF).append(CRLF).Append(CRLF)
	'
	'**** CLICK - ADD NEW BUTTON ON TABLE
	'button to add a new record
	If sisaddnew = "Yes" Then
		AddComment(sbl, "when add new is clicked")
		sbl.append($"Sub ${snewid}_click(e As BANanoEvent)"$).Append(CRLF)
		sbl.append($"Add${dlg}"$).append(CRLF)
		sbl.append("End Sub").append(CRLF).append(CRLF)
	End If
	'
	'**** CREATE DIALOG
	'create dialog
	If isdialog Then
		AddComment(sbl, "create dialog")
		
		sbl.append($"Sub CreateDialog_${dlg}"$).append(CRLF)
		sbl.append($"${diagName} = vm.CreateDialog("${diagName}", Me)"$).Append(CRLF)
		CodeLine(sbl, stitle, "s", "dlg", tbName, "SetTitle")
		CodeLine2(sbl, $"btnOk${dlg}"$, "Save", "s", "dlg", tbName, "SetOk")
		CodeLine2(sbl, $"btnCancel${dlg}"$, "Cancel", "s", "dlg", tbName, "SetCancel")
		CodeLine(sbl, "700px", "s", "dlg", tbName, "Setwidth")
		CodeLine(sbl, True, "b", "dlg", tbName, "Setpersistent")
		AddComment(sbl, "*** Add code to create components below this line!")
		AddNewLine(sbl)
		sbl.append($"vm.AddDialog(${diagName})"$).append(CRLF)
		sbl.append("End Sub").append(CRLF).append(CRLF)
		'add the save and cancel code
		
		'**** SAVE THE RECORD
		AddComment(sbl, $"add code to save the ${ssingular}"$)
		sbl.append($"Sub btnOk${dlg}_click(e As BANanoEvent)"$).append(CRLF)
		AddComment(sbl, "create/update record to table")
		AddComment(sbl, "get the record to create/update")
		sbl.append($"Dim Record As Map = ${diagName}.Container.GetData"$).append(CRLF)
		AddComment(sbl, "validate the record")
		sbl.append($"Dim bValid As Boolean = vm.Validate(Record, ${diagName}.Container.Required)"$).append(CRLF)
		AddComment(sbl, "if invalid exit create/update")
		AddCode(sbl, $"If bValid = False Then"$)
		AddCode(sbl, $"Dim strError As String = vue.GetError"$)
		AddCode(sbl, $"vm.ShowSnackBarError(strError)"$)		
		AddCode(sbl, "Return")
		AddCode(sbl, "End If")
		Select Case sdbtype
		Case "banano"
			AddComment(sbl, "database variable")
			sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
			AddComment(sbl, "open the database and wait")
			sbl.append($"db.OpenWait("${sdatabasename}", "${sdatabasename}")"$).append(CRLF)
			AddComment(sbl, "resultset variable")
			sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
			AddComment(sbl, "resultset variable")
			sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
		End Select
		'
		AddComment(sbl, "check mode")
		sbl.append($"Select Case Mode"$).append(CRLF)
		sbl.append($"Case "A""$).Append(CRLF)
		
		' we have an auto increment field
		If bisautoincrement = True Then
			Select Case sdbtype
			Case "banano"
				AddComment(sbl, "generate max value")
				sbl.append($"Dim nextID As Int = 0"$).append(CRLF)
				AddComment(sbl, "generate & run command to get max value")
				AddComment(sbl, "initialize table")
				sbl.append($"${rsName}.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
				sbl.append($"${rsName}.GetMax"$).append(CRLF)
				sbl.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
				AddCode(sbl, $"${rsName}.FromJSON"$)
				sbl.append($"nextID = ${rsName}.GetNextID"$).append(CRLF)
				AddComment(sbl, "update the record with the next id")
				sbl.append($"Record.Put("${itemkey}", nextID)"$).append(CRLF)
			Case "sqlite"
				sbl.append($"Record.Put("${itemkey}", Null)"$).append(CRLF)
			Case "mssql"
				'remove the auto key as its identity
				AddComment(sbl, "remove the primary key")
				AddCode(sbl, $"Record.Remove("${itemkey}")"$)
			End Select
		End If
		'
		AddComment(sbl, "initialize table for insert")
		Select Case sdbtype
		Case "banano"
				sbl.append($"${rsName}.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
				sbl.append($"${rsName}.Initialize("${sdatabasename}", "${tbName}", "${itemkey}", "${auto}")"$).append(CRLF)
		End Select
		'
		AddComment(sbl, "define schema for record")
		sbl.append($"${rsName}.SchemaFromDesign(${diagName}.Container)"$).append(CRLF)
		AddComment(sbl, "insert a record")
		sbl.append($"${rsName}.Insert1(Record)"$).append(CRLF)
		AddComment(sbl, "generate & run command to insert record")
		Select Case sdbtype
		Case "banano"
			sbl.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
			AddCode(sbl, $"${rsName}.JSON = BANano.CallInlinePHPWait(${rsName}.MethodName, ${rsName}.Build)"$)
		End Select
		AddCode(sbl, $"${rsName}.FromJSON"$)
		'
		'**** CLICK OK ON DIALOG EDIT RECORD
		sbl.append($"Case "E""$).Append(CRLF)
		AddComment(sbl, "read record id")
		sbl.append($"Dim RecID As String = Record.Get("${itemkey}")"$).append(CRLF)
		'
		AddComment(sbl, "initialize table for edit")
		Select Case sdbtype
		Case "banano"
			sbl.append($"${rsName}.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
			sbl.append($"${rsName}.Initialize("${sdatabasename}", "${tbName}", "${itemkey}", "${auto}")"$).append(CRLF)
				If bisautoincrement = True Then
					Select Case sdbtype
					Case "mssql"
						'remove the primary key for addition
						AddComment(sbl, "remove the primary key")
						AddCode(sbl, $"Record.Remove("${itemkey}")"$)
					End Select
				End If
		End Select
		'
		AddComment(sbl, "define schema for record")
		sbl.append($"${rsName}.SchemaFromDesign(${diagName}.Container)"$).append(CRLF)
		AddComment(sbl, "update a record")
		sbl.append($"${rsName}.Update1(Record, RecID)"$).append(CRLF)
		AddComment(sbl, "generate & run command to update record")
		Select Case sdbtype
		Case "banano"
			sbl.append($"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$).append(CRLF)
		Case "sqlite", "mysql", "mssql"
			AddCode(sbl, $"${rsName}.JSON = BANano.CallInlinePHPWait(${rsName}.MethodName, ${rsName}.Build)"$)
		End Select
		AddCode(sbl, $"${rsName}.FromJSON"$)
		sbl.append($"End Select"$).append(CRLF)
		AddComment(sbl, "hide the modal")
		AddCode(sbl, $"${diagName}.Hide"$)
		AddComment(sbl, $"execute code to refresh listing for ${stitle}"$)
		AddCode(sbl, $"vm.CallMethod("SelectAll_${dlg}")"$)
		sbl.append("End Sub").append(CRLF).append(CRLF)
		
		
		'**** CANCEL DIALOG
		'add code to cancel the dialog
		AddComment(sbl, $"add code to cancel the dialog for ${ssingular}"$)
		sbl.append($"Sub btnCancel${dlg}_click(e As BANanoEvent)"$).append(CRLF)
		AddComment(sbl, "hide the modal")		
		AddCode(sbl, $"${diagName}.Hide"$)
		sbl.append("End Sub").append(CRLF).append(CRLF)
		'
		'**** FOREIGN LINKAGES
		'set methods for foreign linkages
		For Each f As Map In foreign
			Dim scolforeigntable As String = f.getdefault("colforeigntable", "")
			Dim scolforeignkey As String = f.getdefault("colforeignkey", "")
			Dim scolforeignvalue As String = f.GetDefault("colforeignvalue", "")
			scolforeigntable = scolforeigntable.tolowercase
			scolforeignkey = scolforeignkey.tolowercase
			scolforeignvalue = scolforeignvalue.tolowercase
			'
			'define fields to select
			Dim rsName As String = $"rs${scolforeigntable}"$
			Dim fselect As List
			fselect.initialize
			fselect.add(scolforeignkey)
			fselect.add(scolforeignvalue)
			Dim fFields As String = vm.List2ArrayVariable(fselect)
			'define sort field
			Dim fsort As List
			fsort.Initialize
			fsort.add(scolforeignvalue)
			Dim sFields As String = vm.List2ArrayVariable(fsort)
			'
			AddComment(sbl, $"load records for ${scolforeigntable}"$)
			AddCode(sbl, $"Sub Load_${scolforeigntable}"$)
			Select Case sdbtype
			Case "banano"
				AddComment(sbl, "database variable")
				AddCode(sbl, $"Dim db As BANanoSQL"$)
				AddComment(sbl, "open the database and wait")
				AddCode(sbl, $"db.OpenWait("${sdatabasename}", "${sdatabasename}")"$)
				AddComment(sbl, "resultset variable")
				AddCode(sbl, $"Dim ${rsName} As ${rsType}"$)
				AddComment(sbl, "initialize table for reading")
				AddCode(sbl, $"${rsName}.Initialize("${scolforeigntable}", "${scolforeignkey}")"$)
			Case "sqlite", "mysql", "mssql"
				sbl.append($"Dim ${rsName} As ${rsType}"$).append(CRLF)
				AddComment(sbl, "initialize table for reading")
				sbl.append($"${rsName}.Initialize("${sdatabasename}", "${scolforeigntable}", "${scolforeignkey}", "${auto}")"$).append(CRLF)
			End Select
			'
			AddComment(sbl, "generate & run command to select records")
			AddCode(sbl, $"${rsName}.SelectAll(Array(${fFields}), Array(${sFields}))"$)
			Select Case sdbtype
			Case "banano"	
				AddCode(sbl, $"${rsName}.Result = db.ExecuteWait(${rsName}.query, ${rsName}.args)"$)
			Case "sqlite", "mysql", "mssql"
				AddCode(sbl, $"${rsName}.JSON = BANano.CallInlinePHPWait(${rsName}.MethodName, ${rsName}.Build)"$)
			End Select
			AddCode(sbl, $"${rsName}.FromJSON"$)
			AddCode(sbl, $"VM.SetData("${scolforeigntable}", ${rsName}.Result)"$)
			AddCode(sbl, "End Sub")
		Next
			
	End If
	'
	'update the code box
	dbCode.SetCode(sbl.tostring)
	'save the code to download later
	BANano.setsessionstorage("tablecode", sbl.tostring)
End Sub

Sub AddNewLine(sbx As StringBuilder)
	sbx.append(CRLF)
End Sub

Sub AddCode(sbx As StringBuilder, scomment As String)
	sbx.append(scomment).append(CRLF)
End Sub


Sub AddComment(xb As StringBuilder, sc As String)
	xb.append($"'${sc}"$).append(CRLF)
End Sub


'table row click
Sub schemaDT_edit(item As Map)
	Dim skey As String = item.getdefault("key", "")
	If skey = "" Then Return
	pbtable.OpenPanel(2)
	pbtable.EditItem(skey)
End Sub

Sub schemaDT_delete(item As Map)
	Dim skey As String = item.getdefault("key", "")
	If skey = "" Then Return
	'read the existing items
	Dim contents As List = vue.GetData("tableitems")
	'does the record exist
	Dim rpos As Int = vm.ListOfMapsRecordPos(contents, "key", skey)
	rpos = BANano.parseInt(rpos)
	If rpos <> -1 Then
		contents.RemoveAt(rpos)
	End If
	vue.SetData("tableitems", contents)
	SavePropertyBag
End Sub

Sub dbcodecopy_click(e As BANanoEvent)
	Dim gridsource As String = BANano.GetSessionStorage("tablecode")
	vm.SaveText2File(gridsource, "tablecode.txt")
End Sub


Sub b4xcodecopy_click(e As BANanoEvent)
	Dim gridsource As String = BANano.GetSessionStorage("sourcecode")
	vm.SaveText2File(gridsource, "sourcecode.txt")
End Sub

Sub htmlcodecopy_click(e As BANanoEvent)
	Dim gridhtml As String = BANano.GetSessionStorage("html")
	vm.SaveText2File(gridhtml, "html.txt")
End Sub

Sub btnSaveProp_click(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub btnDeleteProp_click(e As BANanoEvent)
	DeletePropertyBag
End Sub
'
Sub DesignStructure
	'apply filter
	Dim dbFields As List
	dbFields.initialize
	dbFields.AddAll(Array("key", "title", "coltype", "colscope" , "colfieldtype" , "coldefaultvalue", "colminrange", "colmaxrange", "colhasset", "colhasget", "edit", "delete"))
	schemaDT.ApplyFilter(dbFields)
	schemaDT.SetDataSourceName("tableitems")
End Sub


Sub TableStructure
	'apply filter
	Dim dbFields As List
	dbFields.initialize
	dbFields.AddAll(Array("key", "title", "coldatatype" , "collength" , "colvalue", "colindexed", "colvaluedisplay", "edit", "delete"))
	schemaDT.ApplyFilter(dbFields)
	schemaDT.SetDataSourceName("tableitems")
End Sub

'a component has been clicked
Sub mycomponents_click(e As BANanoEvent)
	istool = False
	vm.CallMethod("LoadContainers")
	vm.CallMethod("LoadComponents")
	drwprojectdetails.hide
	Dim itemID As String = vm.GetIDFromEvent(e)
	itemID = BANano.parseint(itemID)
	vm.setdata("devspace", 0)
	vm.HideItems(Array("schemaarea"))
	'read the record from the database
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("components", "id")
	rsSQL.AddIntegers(Array("id", "row","col","tabindex"))
	rsSQL.AddStrings(Array("parentid","name","vmodel","attributes","styles","classes", "loose","label", "icon","avatar","items", "controltype"))

	rsSQL.Read(itemID)
	rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
	rsSQL.FromJSON
	If rsSQL.result.size = 0 Then Return
	'read the first record found
	Dim rec As Map = rsSQL.result.get(0)
	'read the type of record
	Dim stypeof As String = rec.get("controltype")
	Dim sattributes As String = rec.get("attributes")
	mattr = BANano.FromJson(sattributes)
	Dim sname As String = rec.get("name")
	'DONT OVERWRITE
	If avatarMap.containskey(stypeof) Then 
		mattr.remove("controltype")
	End If
	vm.setdata("propbagtype", stypeof)
	vm.setdata("propbag", rec)
	dbCode.SetCode("")
	vm.setdata("tableitems", vm.newlist)
	Dim scontents As String = rec.getdefault("items", "")
	Dim contents As List
	contents.initialize
	If scontents <> "" Then
		contents = BANano.FromJson(scontents)
		vm.setdata("tableitems", contents)
	End If
	schemaDT.SetDataSourceName("tableitems")
	vm.CallMethod("LoadTables")
	'
	'show the property bags
	Select Case stypeof
		Case "table"
			ShowBag("pbtable")
			pbtable.SetDefaults
			vm.setdata("controltype", "table")
			pbtable.hideitem("id")
			pbtable.Hideitem("controltype")
			pbtable.ClearContents
			TableStructure
			Design_DBSourceCode
		Case "rating"
			ShowBag("pbrating")
			pbrating.SetDefaults
			vm.setdata("controltype", "rating")
			pbrating.hideitem("id")
			pbrating.Hideitem("controltype")
		Case "speeddial"
			ShowBag("pbspeeddial")
			pbspeeddial.SetDefaults
			vm.setdata("controltype", "speeddial")
			pbspeeddial.hideitem("id")
			pbspeeddial.Hideitem("controltype")
			pbspeeddial.ClearContents
		Case "page"
			ShowBag("pbpage")
			pbpage.SetDefaults
			vm.setdata("controltype", "page")
			pbpage.hideitem("id")
			pbpage.Hideitem("controltype")
			vm.setdata("devspace", 1)
		Case "avatar"
			ShowBag("pbavatar")
			pbavatar.SetDefaults
			vm.setdata("controltype", "avatar")
			pbavatar.hideitem("id")
			pbavatar.Hideitem("controltype")
		Case "builder"
			istool = True
			ShowBag("pbbuilder")
			pbbuilder.SetDefaults
			vm.setdata("controltype", "builder")
			pbbuilder.hideitem("id")
			pbbuilder.Hideitem("controltype")
			pbbuilder.ClearContents
			DesignStructure
			vm.setdata("devspace", 1)
		Case "panel"
			ShowBag("pbexpansionpanels")
			pbexpansionpanels.SetDefaults
			vm.setdata("controltype", "panel")
			pbexpansionpanels.hideitem("id")
			pbexpansionpanels.Hideitem("controltype")
			pbexpansionpanels.ClearContents
		Case "stepper"
			ShowBag("pbstepper")
			pbstepper.SetDefaults
			vm.setdata("controltype", "stepper")
			pbstepper.hideitem("id")
			pbstepper.Hideitem("controltype")
			pbstepper.ClearContents
		Case "tabs"
			ShowBag("pbtabs")
			pbtabs.SetDefaults
			vm.setdata("controltype", "tabs")
			pbtabs.hideitem("id")
			pbtabs.Hideitem("controltype")
			pbtabs.ClearContents
		Case "list"
			ShowBag("pblist")
			pblist.SetDefaults
			vm.setdata("controltype", "list")
			pblist.hideitem("id")
			pblist.Hideitem("controltype")
			pblist.ClearContents
		Case "badge"
			ShowBag("pbbadge")
			pbbadge.SetDefaults
			vm.setdata("controltype", "badge")
			pbbadge.hideitem("id")
			pbbadge.Hideitem("controltype")
		Case "chip"
			ShowBag("pbchip")
			pbchip.SetDefaults
			vm.setdata("controltype", "chip")
			pbchip.hideitem("id")
			pbchip.Hideitem("controltype")
		Case "dialog"
			ShowBag("pbdialog")
			pbdialog.SetDefaults
			vm.setdata("controltype", "dialog")
			pbdialog.hideitem("id")
			pbdialog.Hideitem("controltype")
		Case "carousel"
			ShowBag("pbcarousel")
			pbcarousel.SetDefaults
			pbcarousel.hideitem("id")
			pbcarousel.Hideitem("controltype")
			vm.setdata("controltype", "carousel")
			pbcarousel.ClearContents
		Case "drawer"
			ShowBag("pbdrawer")
			pbdrawer.SetDefaults
			pbdrawer.hideitem("id")
			pbdrawer.Hideitem("controltype")
			vm.setdata("controltype", "drawer")
			pbdrawer.ClearContents
		Case "menu"
			ShowBag("pbmenu")
			pbmenu.SetDefaults
			pbmenu.hideitem("id")
			pbmenu.Hideitem("controltype")
			vm.setdata("controltype", "menu")
			pbmenu.ClearContents
		Case "toolbar"
			ShowBag("pbtoolbar")
			pbtoolbar.SetDefaults
			pbtoolbar.hideitem("id")
			pbtoolbar.Hideitem("controltype")
			vm.setdata("controltype", "toolbar")
			pbtoolbar.ClearContents
		Case "container"
			ShowBag("pbcontainer")
			pbcontainer.SetDefaults
			vm.setdata("controltype", "container")
			pbcontainer.hideitem("id")
			pbcontainer.Hideitem("controltype")
		Case "parallax"
			ShowBag("pbparallax")
			pbparallax.SetDefaults
			vm.setdata("controltype", "parallax")
			pbparallax.hideitem("id")
			pbparallax.Hideitem("controltype")
			
		Case "text"
			ShowBag("pbtextfield")
			pbtextfield.SetDefaults
			pbtextfield.hideitem("id")
			pbtextfield.Hideitem("controltype")
			vm.setdata("controltype", "text")
			
		Case "textarea"
			ShowBag("pbtextfield")
			pbtextfield.SetDefaults
			pbtextfield.hideitem("id")
			pbtextfield.Hideitem("controltype")
			vm.setdata("controltype", "textarea")
			
		Case "quill"
			ShowBag("pbquill")
			pbquill.SetDefaults
			pbquill.hideitem("id")
			pbquill.Hideitem("controltype")
			vm.setdata("controltype", "quill")
			
		Case "fileselect"
			ShowBag("pbfileselect")
			pbfileselect.SetDefaults
			pbfileselect.hideitem("id")
			pbfileselect.Hideitem("controltype")
			vm.setdata("controltype", "fileselect")
		
		Case "infobox"
			ShowBag("pbinfobox")
			pbinfobox.SetDefaults
			pbinfobox.hideitem("id")
			pbinfobox.Hideitem("controltype")
			vm.setdata("controltype", "infobox")
			
		Case "checkbox"
			ShowBag("pbcheckbox")
			pbcheckbox.SetDefaults
			pbcheckbox.hideitem("id")
			pbcheckbox.Hideitem("controltype")
			vm.setdata("controltype", "checkbox")
			
		Case "date"
			ShowBag("pbdatepicker")
			pbdatepicker.SetDefaults
			vm.setdata("controltype", "date")
			pbdatepicker.hideitem("id")
			pbdatepicker.Hideitem("controltype")
			
		Case "file"
			ShowBag("pbtextfield")
			pbtextfield.SetDefaults
			vm.setdata("controltype", "file")
			pbtextfield.hideitem("id")
			pbtextfield.Hideitem("controltype")
			
		Case "radio"
			ShowBag("pbradiogroup")
			pbradiogroup.SetDefaults
			pbradiogroup.hideitem("id")
			pbradiogroup.Hideitem("controltype")
			vm.setdata("controltype", "radio")
			
		Case "select"
			ShowBag("pbselectbox")
			pbselectbox.SetDefaults
			vm.setdata("controltype", "select")
			pbselectbox.hideitem("id")
			pbselectbox.Hideitem("controltype")
			
		Case "slider"
			ShowBag("pbslider")
			pbslider.SetDefaults
			pbslider.hideitem("id")
			pbslider.Hideitem("controltype")
			
		Case "switch"
			ShowBag("pbcheckbox")
			pbcheckbox.SetDefaults
			pbcheckbox.hideitem("id")
			vm.setdata("controltype", "switch")
			pbcheckbox.Hideitem("controltype")
			
		Case "label"
			ShowBag("pblabel")
			pblabel.SetDefaults
			pblabel.hideitem("id")
			pblabel.Hideitem("controltype")
			
		Case "email"
			ShowBag("pbtextfield")
			pbtextfield.SetDefaults
			vm.setdata("controltype", "email")
			pbtextfield.hideitem("id")
			pbtextfield.Hideitem("controltype")
			
		Case "password"
			ShowBag("pbtextfield")
			pbtextfield.SetDefaults
			vm.setdata("controltype", "password")
			pbtextfield.hideitem("id")
			pbtextfield.Hideitem("controltype")
			
		Case "tel"
			ShowBag("pbtextfield")
			pbtextfield.SetDefaults
			vm.setdata("controltype", "tel")
			pbtextfield.hideitem("id")
			pbtextfield.Hideitem("controltype")
			
		Case "combo"
			ShowBag("pbselectbox")
			pbselectbox.SetDefaults
			vm.setdata("controltype", "combo")
			pbselectbox.hideitem("id")
			pbselectbox.Hideitem("controltype")
		Case "number"
			ShowBag("pbtextfield")
			pbtextfield.SetDefaults
			vm.setdata("controltype", "number")
			pbtextfield.hideitem("id")
			pbtextfield.Hideitem("controltype")
			
		Case "profile"
			ShowBag("pbimage")
			pbimage.SetDefaults
			vm.setdata("controltype", "profile")
			pbimage.hideitem("id")
			pbimage.Hideitem("controltype")
			
		Case "auto"
			ShowBag("pbselectbox")
			pbselectbox.SetDefaults
			vm.setdata("controltype", "auto")
			pbselectbox.hideitem("id")
			pbselectbox.Hideitem("controltype")
			
		Case "time"
			ShowBag("pbdatepicker")
			pbdatepicker.SetDefaults
			pbdatepicker.hideitem("id")
			pbdatepicker.Hideitem("controltype")
			vm.setdata("controltype", "time")
			
		Case "image"
			ShowBag("pbimage")
			pbimage.SetDefaults
			pbimage.hideitem("id")
			pbimage.Hideitem("controltype")
			vm.setdata("controltype", "image")
			
		Case "button"
			ShowBag("pbbutton")
			pbbutton.SetDefaults
			pbbutton.hideitem("id")
			pbbutton.Hideitem("controltype")
			vm.setdata("controltype", "button")
		Case "icon"
			ShowBag("pbicon")
			pbicon.SetDefaults
			pbicon.hideitem("id")
			pbicon.Hideitem("controltype")
			vm.setdata("controltype", "icon")
	End Select
	'
	vm.setstate(mattr)
End Sub

Sub ToolsPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("eptools", "ep1", Me)
	grd.Header.SetText("Tools")
	grd.Container.SetTag("div")
	grd.Container.AddRows(2).AddColumns4X3
	'
	Dim page As VMImage = ToolboxImage("page", "./assets/page.png", "Page")
	grd.Container.AddComponent(1,1,page.tostring)
	
	Dim cls As VMImage = ToolboxImage("builder", "./assets/build.png", "Builder")
	grd.Container.AddComponent(1,2,cls.tostring)
	
	Return grd
End Sub


Sub NavigationPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("epnav", "ep1", Me)
	grd.Header.SetText("Navigation")
	grd.Container.SetTag("div")
	grd.Container.AddRows(2).AddColumns4X3
	'
	Dim btn As VMImage = ToolboxImage("button", "./assets/button.png", "Button")
	grd.Container.AddComponent(1,1,btn.tostring)
	'
	Dim listx As VMImage = ToolboxImage("list", "./assets/list.png", "List")
	grd.Container.AddComponent(1,2,listx.tostring)
	'
	Dim tabsx As VMImage = ToolboxImage("tabs", "./assets/tabs.png", "Tabs")
	grd.Container.AddComponent(1,3,tabsx.tostring)
	'
	Dim stper As VMImage = ToolboxImage("stepper", "./assets/stepper.png", "Stepper")
	grd.Container.AddComponent(1,4,stper.tostring)
	'
	Dim exppanel As VMImage = ToolboxImage("panel", "./assets/panel.png", "Expansion Panel")
	grd.Container.AddComponent(2,1,exppanel.tostring)
	'
	Return grd
End Sub

Sub LayoutPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("laynav", "epx", Me)
	grd.Header.SetText("Layouts")
	grd.Container.SetTag("div")
	grd.Container.AddRows(2).AddColumns4X3
	'
	Dim cont As VMImage = ToolboxImage("container", "./assets/container.png", "Container")
	grd.Container.AddComponent(1,1,cont.tostring)
	'
	Dim tblr As VMImage = ToolboxImage("toolbar", "./assets/toolbar.png", "Toolbar")
	grd.Container.AddComponent(1,2,tblr.tostring)
	'
	Dim menu As VMImage = ToolboxImage("menu", "./assets/menu.png", "Menu")
	grd.Container.AddComponent(1,3,menu.tostring)
	'
	Dim drawer As VMImage = ToolboxImage("drawer", "./assets/sidebar.png", "Drawer")
	grd.Container.AddComponent(1,4,drawer.tostring)
	'
	Dim carousel As VMImage = ToolboxImage("carousel", "./assets/carousel.png", "Carousel")
	grd.Container.AddComponent(2,1,carousel.tostring)
	'
	Dim dialog As VMImage = ToolboxImage("dialog", "./assets/dialog.png", "Dialog")
	grd.Container.AddComponent(2,2,dialog.tostring)
	'
	Dim speeddial As VMImage = ToolboxImage("speeddial", "./assets/speeddial.png", "Speed Dial")
	grd.Container.AddComponent(2,3,speeddial.tostring)
	'
	Dim table As VMImage = ToolboxImage("table", "./assets/table.png", "Table")
	grd.Container.AddComponent(2,4,table.tostring)
	
	Return grd
End Sub

Sub DisplayPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("ep3grid", "ep1", Me)
	grd.Header.SetText("Display")
	grd.Container.SetTag("div")
	grd.Container.AddRows(2).AddColumns4X3
	'
	Dim profile As VMImage = ToolboxImage("profile", "./assets/profilepic.png", "Profile Picture")
	grd.Container.AddComponent(1,1,profile.tostring)
	'
	Dim image As VMImage = ToolboxImage("image", "./assets/image.png", "Image")
	grd.Container.AddComponent(1,2,image.tostring)
	'
	Dim icon As VMImage = ToolboxImage("icon", "./assets/icon.png", "Icon")
	grd.Container.AddComponent(1,3,icon.tostring)
	'
	Dim para As VMImage = ToolboxImage("parallax", "./assets/parallax.png", "Parallax")
	grd.Container.AddComponent(1,4,para.tostring)
	'
	Dim chip As VMImage = ToolboxImage("chip", "./assets/chip.png", "Chip")
	grd.Container.AddComponent(2,1,chip.tostring)
	'
	Dim badge As VMImage = ToolboxImage("badge", "./assets/badge.png", "Badge")
	grd.Container.AddComponent(2,2,badge.tostring)
	'
	Dim avatar As VMImage = ToolboxImage("avatar", "./assets/avatar.png", "Avatar")
	grd.Container.AddComponent(2,3,avatar.tostring)
	'
	Dim infobox As VMImage = ToolboxImage("infobox", "./assets/infobox.png", "Info Box")
	grd.Container.AddComponent(2,4,infobox.tostring)
	
	'
	Return grd
End Sub

Sub ToolboxImage(eid As String, url As String, tt As String) As VMImage
	Dim img As VMImage = vm.CreateImage(eid, Me).SetStatic(True).SetValue(url).SetOnDragStart(Me, "ItemDragStart")
	img.SetHeight("32px").SetWidth("32px").SetCursorMove.SetTooltip(tt).RemoveAttr("v-show")
	avatarMap.put(eid, url)
	Return img
End Sub

Sub FormInputPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("ep2grid", "ep1", Me)
	grd.Header.SetText("Form Inputs")
	grd.Container.SetTag("div")
	grd.Container.AddRows(5).AddColumns4X3
	'
	Dim text As VMImage = ToolboxImage("text", "./assets/text.png", "Text Field")
	grd.Container.AddComponent(1,1,text.tostring)
	'
	Dim textarea As VMImage = ToolboxImage("textarea", "./assets/textarea.png", "Text Area")
	grd.Container.AddComponent(1,2,textarea.tostring)
	'
	Dim checkbox As VMImage = ToolboxImage("checkbox", "./assets/checkbox.png", "Checkbox")
	grd.Container.AddComponent(1,3,checkbox.tostring)
	'
	Dim datepicker As VMImage = ToolboxImage("date" , "./assets/datepicker.png",  "Date Picker")
	grd.Container.AddComponent(1,4,datepicker.tostring)
	'
	Dim sFile As VMImage = ToolboxImage("file", "./assets/uploader.png", "File Input")
	grd.Container.AddComponent(2,1,sFile.tostring)
	'
	Dim radio As VMImage = ToolboxImage("radio", "./assets/radio.png", "Radio Group")
	grd.Container.AddComponent(2,2,radio.tostring)
	'
	Dim sSelect As VMImage = ToolboxImage("select", "./assets/select.png" , "Select")
	grd.Container.AddComponent(2,3,sSelect.tostring)
	'
	Dim slider As VMImage = ToolboxImage("slider", "./assets/slider.png" , "Slider")
	grd.Container.AddComponent(2,4,slider.tostring)
	'
	Dim sswitch As VMImage = ToolboxImage("switch", "./assets/switch.png", "Switch")
	grd.Container.AddComponent(3,1,sswitch.tostring)
	'
	Dim xlabel As VMImage = ToolboxImage("label", "./assets/label.png", "Label")
	grd.Container.AddComponent(3,2,xlabel.tostring)
	
	Dim email As VMImage = ToolboxImage("email", "./assets/email.png", "Email")
	grd.Container.AddComponent(3,3,email.tostring)
	'
	Dim password As VMImage = ToolboxImage("password", "./assets/password.png", "Password")
	grd.Container.AddComponent(3,4,password.tostring)
	'
	Dim tel As VMImage = ToolboxImage("tel", "./assets/telephone.png", "Telephone")
	grd.Container.AddComponent(4,1,tel.tostring)
	'
	Dim time As VMImage = ToolboxImage("time", "./assets/time.png", "Time Picker")
	grd.Container.AddComponent(4,2,time.tostring)
	'
	Dim combo As VMImage = ToolboxImage("combo", "./assets/combo.png", "Combo Box")
	grd.Container.AddComponent(4,3,combo.tostring)
	'
	Dim auto As VMImage = ToolboxImage("auto", "./assets/autocomplete.png", "Auto Complete")
	grd.Container.AddComponent(4,4,auto.tostring)
	'
	Dim rating As VMImage = ToolboxImage("rating", "./assets/rating.png", "Rating")
	grd.Container.AddComponent(5,1,rating.tostring)
	'
	Dim quill As VMImage = ToolboxImage("quill", "./assets/quill.png", "Quill")
	grd.Container.AddComponent(5,2,quill.tostring)
	'
	Dim fileselect As VMImage = ToolboxImage("fileselect", "./assets/fileselect.png", "File Select")
	grd.Container.AddComponent(5,3,fileselect.tostring)
	Return grd
End Sub


Sub ToolboxDiv(eid As String, text As String) As VMElement
	Dim dv As VMElement = vm.CreateDiv(eid).SetStatic(True).SetOnDragStart(Me, "ItemDragStart")
	dv.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	dv.SetText(text).SetTextAlignCenter.SetCursorMove.SetLineHeight("32px").SetBorderRadius("5px")
	dv.removeattr("v-show")
	Return dv
End Sub

Sub GridPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("ep1grid", "ep1", Me)
	grd.Header.SetText("Grid")
	grd.Container.SetTag("div")
	grd.Container.AddRows(8).AddColumns4X3
	'
	Dim rc12 As VMElement = ToolboxDiv("rc12","12")
	grd.Container.AddComponent(1,1,rc12.tostring)
	'
	Dim rc62 As VMElement = ToolboxDiv("rc6x2","6x2")
	grd.Container.AddComponent(1,2,rc62.tostring)
	'
	Dim rc112 As VMElement = ToolboxDiv("rc12x1","12x1")
	grd.Container.AddComponent(1,3,rc112.tostring)
	'
	Dim rc26 As VMElement = ToolboxDiv("rc2x6","2x6")
	grd.Container.AddComponent(1,4,rc26.tostring)
	'
	Dim rc43 As VMElement = ToolboxDiv("rc4x3","4x3")
	grd.Container.AddComponent(2,1,rc43.tostring)
	'
	Dim rc34 As VMElement = ToolboxDiv("rc3x4","3x4")
	grd.Container.AddComponent(2,2,rc34.tostring)
	'
	Dim rc57 As VMElement = ToolboxDiv("rc5p7","5+7")
	grd.Container.AddComponent(2,3,rc57.tostring)
	'
	Dim rc75 As VMElement = ToolboxDiv("rc7p5","7+5")
	grd.Container.AddComponent(2,4,rc75.tostring)
	'
	Dim rc84 As VMElement = ToolboxDiv("rc8p4","8+4")
	grd.Container.AddComponent(3,1,rc84.tostring)
	'
	Dim rc93 As VMElement = ToolboxDiv("rc9p3","9+3")
	grd.Container.AddComponent(3,2,rc93.tostring)
	'
	Dim rc102 As VMElement = ToolboxDiv("rc10p2","10+2")
	grd.Container.AddComponent(3,3,rc102.tostring)
	'
	Dim rc111 As VMElement = ToolboxDiv("rc11p1","11+1")
	grd.Container.AddComponent(3,4,rc111.tostring)
	'
	Dim rc4p8 As VMElement = ToolboxDiv("rc4p8","4+8")
	grd.Container.AddComponent(4,1,rc4p8.tostring)
	'
	Dim rc3p9 As VMElement = ToolboxDiv("rc3p9","3+9")
	grd.Container.AddComponent(4,2,rc3p9.tostring)
	'
	Dim rc2p10 As VMElement = ToolboxDiv("rc2p10","2+10")
	grd.Container.AddComponent(4,3,rc2p10.tostring)
	'
	Dim rc1p11 As VMElement = ToolboxDiv("rc1p11","1+11")
	grd.Container.AddComponent(4,4,rc1p11.tostring)
	'
	Dim row As VMElement = ToolboxDiv("row","R1")
	grd.Container.AddComponent(5,1,row.tostring)
	'
	Dim col1 As VMElement = ToolboxDiv("col1","C1")
	grd.Container.AddComponent(5,2,col1.tostring)
	'
	Dim col2 As VMElement = ToolboxDiv("col2","C2")
	grd.Container.AddComponent(5,3,col2.tostring)
	'
	Dim col3 As VMElement = ToolboxDiv("col3","C3")
	grd.Container.AddComponent(5,4,col3.tostring)
	'
	Dim col4 As VMElement = ToolboxDiv("col4","C4")
	grd.Container.AddComponent(6,1,col4.tostring)
	'
	Dim col5 As VMElement = ToolboxDiv("col5","C5")
	grd.Container.AddComponent(6,2,col5.tostring)
	'
	Dim col6 As VMElement = ToolboxDiv("col6","C6")
	grd.Container.AddComponent(6,3,col6.tostring)
	'
	Dim col7 As VMElement = ToolboxDiv("col7","C7")
	grd.Container.AddComponent(6,4,col7.tostring)
	
	Dim col8 As VMElement = ToolboxDiv("col8","C8")
	grd.Container.AddComponent(7,1,col8.tostring)
	'
	Dim col9 As VMElement = ToolboxDiv("col9","C9")
	grd.Container.AddComponent(7,2,col9.tostring)
	'
	Dim col10 As VMElement = ToolboxDiv("col10","C10")
	grd.Container.AddComponent(7,3,col10.tostring)
	'
	Dim col11 As VMElement = ToolboxDiv("col11","C11")
	grd.Container.AddComponent(7,4,col11.tostring)
	'
	Dim col12 As VMElement = ToolboxDiv("col12","C12")
	grd.Container.AddComponent(8,1,col12.tostring)
	'
	Return grd
End Sub


'whenever we drag over
Sub ItemDragOver(e As BANanoEvent)
	'prevent the browser from stopping our drop events
	e.PreventDefault
	'e.OtherField("dataTransfer").SetField("dropEffect", "none")
End Sub

'whenever something is dragged
Sub ItemDragStart(e As BANanoEvent)
	'get the id of the element and save it for later use
	Dim itemID As String = vm.GetIDFromEvent(e)
	e.OtherField("dataTransfer").RunMethod("setData", Array("text/plain", itemID))
End Sub

'whenever we drop an item
Sub ItemDrop(e As BANanoEvent)
	'which project are we working on
	Dim project As Map = vm.GetData("project")
	Dim pid As String = project.getdefault("id", "")
	If pid = "" Then
		vm.ShowSnackBarError("You need to create a project / activate a project to add components to!")
		'show the iphone
		vm.setdata("devspace", 0)
		mymac.hide
		myipad.hide
		myiphone.show
		myiphone.SetLandScape(False)
		vm.drawer.Show
		NewProject
		Return
	End If
	sdatabasename = project.getdefault("databasename", "")
	ShowBag("")
	istool = False
	vm.setdata("tableitems", vm.newlist)
	dbCode.SetCode("")
	vm.setdata("devspace", 0)
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	e.PreventDefault
	'get the saved id by data transfer
	Dim savedid As String = e.OtherField("dataTransfer").RunMethod("getData", Array("text")).result
	'
	'get the item we are dropping to
	Dim dropZoneID As String = vm.GetIDFromEvent(e)
	'
	e.OtherField("dataTransfer").RunMethod("clearData", Null)
	
			'drop on root
			Select Case savedid
				Case "rc12","rc6x2", "rc1x12", "rc2x6","rc4x3", "rc3x4", _
			"rc5p7","rc7p5","rc8p4","rc9p3","rc10p2","rc11p1", _
			"rc4p8", "rc3p9", "rc2p10", "rc1p11", "rc12x1", _
			"row", "col2", "col1", "col3","col4","col5", "col6", "col7", _
			"col8", "col9", "col10", "col11", "col12"
					'adding 1 row and
					BANano.SetLocalStorage("selectedpanel", 0)
					vm.setdata("showmatrix", "Yes")
					vm.setdata("hasborder", "Yes")
					vm.pagepause
					db.OpenWait("bvmdesigner", "bvmdesigner")
					rsSQL.Initialize("grid", "id")
					rsSQL.AddIntegers(Array("id"))
					rsSQL.AddStrings(Array("controltype"))
					Dim nrec As Map = CreateMap()
					nrec.put("id", DateTime.now)
					nrec.put("controltype", savedid)
					rsSQL.Insert1(nrec)
					rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
					rsSQL.FromJSON
					isDirty = True
					vm.pageresume
				Case Else
					If avatarMap.containskey(savedid) = False Then Return
					BANano.SetLocalStorage("selectedpanel", 2)
					'
					isDirty = True
					Dim rowPos As Int = 0
					vm.pagepause
					db.OpenWait("bvmdesigner", "bvmdesigner")
					rsSQL.Initialize("components", "row")
					'get the max rows
					rsSQL.GetMax
					rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
					rsSQL.FromJSON
					rowPos = rsSQL.GetNextID
			
					'
					Dim slabel As String = savedid
					slabel = slabel & vm.cstr(rowPos)
					'
					Dim avatar As String = ""
					If avatarMap.containskey(savedid) Then avatar = avatarMap.get(savedid)
					Dim sid As String = DateTime.now
					sid = BANano.parseint(sid)
					'
					Dim nrec As Map = CreateMap()
					nrec.put("id", sid)
					nrec.put("controltype", savedid)
					nrec.put("row", rowPos)
					nrec.put("col", 1)
					nrec.put("name", slabel)
					nrec.put("vmodel", slabel)
					nrec.put("label", slabel)
					nrec.put("avatar", avatar)
					
					'
					Dim attr As Map = CreateMap()
					attr.put("isupdatable", "Yes")
					attr.put("buttontype", "normal")
					attr.put("parent", "vm.Container")
					attr.put("fieldtype", "string")
					attr.put("id", sid)
					attr.put("vmodel", slabel)
					attr.put("row", rowPos)
					attr.put("stepactive", "1")
					attr.put("col", 1)
					attr.put("label", slabel)
					attr.put("offsetsmall",0)
					attr.put("offsetmedium",0)
					attr.put("offsetlarge",0)
					attr.put("offsetxlarge",0)
					attr.put("sizesmall",12)
					attr.put("sizemedium",12)
					attr.put("sizelarge",12)
					attr.put("sizexlarge",12)
					attr.put("isrequired","Yes")
					attr.put("isclearable","Yes")
					attr.put("isvisible","Yes")
					attr.put("isdisabled","No")
					attr.put("isautogrow","No")
					attr.put("ontable", "No")
					attr.put("maxlength", 0)
					attr.Put("iconname", "mdi-account")
					attr.put("centeronparent", "No")
					attr.put("sourcetable", "datasource")
					attr.put("sourcefield", "id")
					attr.put("displayfield", "text")
					attr.put("useoptions", "Yes")
					attr.put("showlabel", "Yes")
					attr.put("labelontop", "Yes")
					attr.put("keys", "1,2,3")
					attr.put("values","One,Two,Three")
					attr.put("tformat","24hr")
					attr.put("isforinput", "Yes")
					attr.put("minvalue", "0")
					attr.put("maxvalue", "100")
					attr.put("slidervalue", "20")
					attr.put("stepvalue", "1")
					attr.put("prependicon", "volume_down")
					attr.put("appendicon", "volume_up")
					attr.put("truevalue", "Yes")
					attr.put("falsevalue", "No")
					attr.put("thumbsize", "32")
					attr.put("iconpos", "left")
					attr.put("isdivider", "Yes")
					attr.put("dialogpage", "vm")
					attr.put("toolbarsubtitle", "1.00")
					attr.put("isclearable", "No")
						'
					Select Case savedid
						Case "avatar"
							attr.put("src", "./assets/sponge.png")
							attr.put("size", "48")
							attr.put("avatartype", "isimage")
							attr.put("label", "A")
							nrec.put("label", "A")
							attr.put("color", "blue")
							attr.put("badge", "1")
						Case "date"
							attr.put("iconname", "event")
						Case "time"
							attr.put("iconname", "access_time")
						Case "label"
							attr.put("labelsize", "p")
							attr.put("value", slabel)
						Case "email"
							attr.put("iconname", "mdi-email-outline")
						Case "password"
							attr.put("iconname", "mdi-lock-outline")
							attr.put("istoggle", "Yes")
							attr.put("hashtype", "SHA256")
							attr.put("alg", "b64")
						Case "tel"
							attr.put("iconname", "mdi-phone")
						Case "textarea"
							attr.put("iconname", "mdi-comment-outline")
						Case "badge"
							attr.put("color", "primary")
							attr.put("content", "2")
							attr.put("badgetype", "iscontent")
						Case "chip"
							attr.put("isactive", "Yes")
							attr.put("iconname", "mdi-account-circle")
							attr.put("color", "indigo")
							attr.put("textcolor", "white")
							attr.put("chiptype", "icon")
							BANano.SetLocalStorage("selectedpanel", 1)
						Case "profile"
							attr.put("borderradius", "50%")
							attr.put("borderwidth", "1px")
							attr.put("bordercolor", "black")
							attr.put("borderstyle", "solid")
							attr.put("src", "./assets/sponge.png")
							attr.put("width", "100")
							attr.put("height", "100")
							BANano.SetLocalStorage("selectedpanel", 1)
						Case "file"
							attr.Put("isupload", "Yes")
							attr.put("isupdatable", "No")
							attr.put("isclearable", "No")
						Case "fileselect"
							attr.put("parent", "vm")
							attr.put("action", "readAsText")
						Case "infobox"
							BANano.SetLocalStorage("selectedpanel", 1)
							attr.put("icon", "shopping_cart")
							attr.put("iconcolor", "red")
							attr.put("text", "New Orders")
							attr.put("from", "0")
							attr.put("to", "500")
							attr.put("duration", "3000")
							attr.put("decimal", ".")
							attr.put("decimals", "0")
							attr.put("separator", ",")
							attr.put("infotype", "stylenone")
							attr.put("isautoplay", "Yes")
							attr.put("ishoverzoomeffect", "Yes")
						Case "image"
							attr.put("src", "./assets/bird.jpg")
							BANano.SetLocalStorage("selectedpanel", 1)
						Case "parallax"
							attr.put("src", "./assets/material.jpg")
							BANano.SetLocalStorage("selectedpanel", 1)
						Case "icon"
							attr.put("size", "x-large")
							attr.put("color", "blue")
							attr.put("iconname", "mdi-vuetify")
							BANano.SetLocalStorage("selectedpanel", 1)
						Case "button"
							BANano.SetLocalStorage("selectedpanel", 3)
						Case "stepper"
							BANano.SetLocalStorage("selectedpanel", 3)
							nrec.put("items", StepperItems)
						Case "panel"
							BANano.SetLocalStorage("selectedpanel", 3)
							nrec.put("items", StepperItems)
						Case "page"
							BANano.SetLocalStorage("selectedpanel", 4)
							MakeYes(attr, Array("isnavbarvisible", "ishamburgervisible", _
							"islogovisible", "isshowondrawer", "isshowonnavbar"))
					 		MakeYes(attr, Array("isupdatenavtitle","isdivider","isinsetdivider"))
							
							attr.put("pagetitle", slabel)
							attr.put("iconcolor", "blue")
							attr.put("tooltip", "Tooltip for " & slabel)
						Case "builder"
							BANano.SetLocalStorage("selectedpanel", 4)
							nrec.put("items", vm.newlist)
						Case "tabs"
							attr.put("mobilebreakpoint", "1264")
							attr.put("slider-size", "2")
							attr.put("isgrow", "Yes")
							attr.put("isiconsandtext", "Yes")
							BANano.SetLocalStorage("selectedpanel", 3)
							nrec.put("items", MenuItems)
						Case "list"
							attr.Put("istile", "Yes")
							attr.put("isoptions", "Yes")
							attr.put("isdivider", "Yes")
							attr.put("datasource", "ListRecords")
							attr.put("keyfld", "key")
							attr.put("avatarfld", "avatar")
							attr.put("iconfld", "iconname")
							attr.put("iconcolorfld", "iconcolor")
							attr.put("titlefld", "title")
							attr.put("subtitlefld", "subtitle")
							attr.put("subtitle1fld", "subtitle1")
							attr.put("actioniconfld", "actionicon")
							attr.put("actioniconcolorfld", "actioniconcolor")
							BANano.SetLocalStorage("selectedpanel", 3)
							nrec.put("items", MenuItems)
						Case "container"
							attr.put("elevation", "2")
							attr.put("transition", "")
							attr.put("borderradius", "")
							attr.put("borderwidth", "")
							attr.put("bordercolor", "")
							attr.put("borderstyle", "")
							attr.put("color", "")
							attr.put("intensity","")
							BANano.SetLocalStorage("selectedpanel", 4)
						Case "toolbar"
							attr.put("bartype", "tool")
							attr.put("logourl", "./assets/sponge.png")
							attr.put("borderradius", "50%")
							attr.put("borderwidth", "1px")
							attr.put("bordercolor", "black")
							attr.put("borderstyle", "solid")
							attr.put("ishamburger", "Yes")
							attr.put("isspacer", "Yes")
							attr.put("logowidth", "46px")
							attr.put("logoheight", "46px")
							attr.put("islogovisible", "Yes")
							attr.put("iscurrent", "Yes")
							attr.put("istitle","Yes")
							attr.put("issubtitle", "Yes")
							attr.put("issearch", "Yes")
							attr.put("isfixed", "Yes")
							attr.put("searchkey", "appsearch")
							attr.put("subtitle", "1.00")
							BANano.SetLocalStorage("selectedpanel", 4)
							nrec.put("items", MenuItems)
						Case "menu"
							attr.put("iconname", "mdi-dots-vertical")
							attr.put("iscloseonclick", "Yes")
							attr.put("iscloseoncontentclick", "Yes")
							attr.put("isopenonclick", "Yes")
							attr.put("menutype", "icon")
							attr.put("isopenonhover", "Yes")
							attr.put("isoffsety", "Yes")
							BANano.SetLocalStorage("selectedpanel", 4)
							nrec.put("items", MenuItems)
						Case "drawer"
							attr.put("ismasterdrawer", "Yes")
							attr.put("isdivider", "Yes")
							attr.put("src", "")
							attr.put("isabsolute", "Yes")
							attr.put("width", "400")
							attr.put("keyfld", "key")
							attr.put("avatarfld", "avatar")
							attr.put("iconfld", "iconname")
							attr.put("iconcolorfld", "iconcolor")
							attr.put("titlefld", "title")
							attr.put("subtitlefld", "subtitle")
							attr.put("subtitle1fld", "subtitle1")
							attr.put("actioniconfld", "actionicon")
							attr.put("actioniconcolorfld", "actioniconcolor")
							attr.put("useoptions", "Yes")
							BANano.SetLocalStorage("selectedpanel", 4)
							nrec.put("items", DemoItems)
						Case "carousel"
							attr.put("src", "./assets/vbanner.jpg")
							attr.put("iscontinuous","Yes")
							attr.put("ismandatory","Yes")
							attr.put("isshowarrows", "Yes")
							BANano.SetLocalStorage("selectedpanel", 4)
							nrec.put("items", CarouselItems)
						Case "dialog"
							attr.put("isretainfocus", "Yes")
							attr.put("okid", "btnOK")
							attr.put("okcaption", "Ok")
							attr.put("cancelid", "btnCancel")
							attr.put("cancelcaption","Cancel")
							attr.put("width", "70%")
							BANano.SetLocalStorage("selectedpanel", 4)
						Case "speeddial"
							attr.put("direction", "top")
							attr.put("isbottom", "Yes")
							attr.put("islarge", "Yes")
							attr.put("isabsolute","Yes")
							attr.put("isright","Yes")
							attr.put("isdark", "Yes")
							attr.put("mastericon", "mdi-plus")
							attr.put("color","blue")
							BANano.SetLocalStorage("selectedpanel", 4)
							nrec.put("items", MenuItems)
						Case "rating"
							attr.Put("value", "2")
							attr.put("isripple", "Yes")
							BANano.SetLocalStorage("selectedpanel", 2)
						Case "table"
							attr.Put("selecttype", "all")
							attr.put("itemsperpage", "10")
							attr.put("itemkey", "id")
							attr.put("mobilebreakpoint", "600")
							attr.put("page", "1")
							attr.put("serveritemslength", "-1")
							attr.put("title", "My Table")
							attr.put("isautoincrement", "Yes")
							attr.put("isaddnew", "Yes")
							attr.put("isedit", "Yes")
							attr.put("isdelete", "Yes")
							attr.put("issearchbox", "Yes")
							attr.put("isdialog", "Yes")
							attr.put("newid", "btnNew")
							attr.put("newicon","mdi-plus")
							attr.put("newtooltip", "Add a new record")
							attr.put("ismultisort", "Yes")
							attr.Put("issingleselect", "Yes")	
							attr.put("datasourcename", "records")	
							attr.put("singular", "record")
							attr.put("manyrecords","records")
							attr.put("isnavbarvisible", "Yes")
							attr.put("isdrawervisible", "No")
							attr.put("ishamburgervisible", "Yes")
							attr.put("islogovisible", "Yes")
							attr.put("isshowondrawer", "Yes")
							attr.put("isshowonnavbar", "Yes")
							attr.put("isdivider","Yes")
							BANano.SetLocalStorage("selectedpanel", 4)
						Case "switch", "checkbox"
							attr.put("value", "No")
					End Select
					'
					'save just in case
					vm.SetState(attr)
					'
					Dim sjson As String = BANano.ToJson(attr)
					nrec.put("attributes", sjson)
					'
					rsSQL.Initialize("components", "id")
			rsSQL.AddIntegers(Array("id", "row","col","tabindex"))
			rsSQL.AddStrings(Array("parentid","name","vmodel","attributes","styles","classes", "loose","label", "icon","avatar","items", "controltype"))

					rsSQL.Insert1(nrec)
					rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
					rsSQL.FromJSON
					vm.pageresume
			End Select
			'
			CreateUX
End Sub

Sub MakeYes(atr As Map, itemsL As List)
	For Each k As String In itemsL
		atr.put(k, "Yes")
	Next
End Sub

Sub StepperItems As String
	Dim recs As List
	recs.initialize
	'
	recs.add(CreateMap("key":"btna","title":"Banner","subtitle":"A business banner"))
	recs.add(CreateMap("key":"btnb","title":"Squirrel","subtitle":"Another squirrel"))
	recs.add(CreateMap("key":"btnc","title":"Sky","subtitle":"Heavens"))
	recs.add(CreateMap("key":"btnd","title":"Planet","subtitle":"Planets of the world"))
	recs.add(CreateMap("key":"btne","title":"Bird","subtitle":"This is a beautiful bird"))
	'
	Dim sjson As String = BANano.ToJson(recs)
	Return sjson
End Sub

Sub CarouselItems As String
	Dim recs As List
	recs.initialize
	'
	recs.add(CreateMap("key":"btna","avatar":"./assets/vbanner.jpg","title":"Banner"))
	recs.add(CreateMap("key":"btnb","avatar":"./assets/squirrel.jpg","title":"Squirrel"))
	recs.add(CreateMap("key":"btnc","avatar":"./assets/sky.jpg","title":"Sky"))
	recs.add(CreateMap("key":"btnd","avatar":"./assets/planet.jpg","title":"Planet"))
	recs.add(CreateMap("key":"btne","avatar":"./assets/bird.jpg","title":"Bird"))
	'
	Dim sjson As String = BANano.ToJson(recs)
	Return sjson
End Sub

'sample demo items
Sub MenuItems As String
	Dim recs As List
	recs.initialize
	'
	recs.add(CreateMap("key":"btna","icon":"dashboard","iconcolor":"red","title":"Banner","subtitle":"A business banner","action":"","itemtype": "btn"))
	recs.add(CreateMap("key":"btnb","icon":"account_box","iconcolor":"indigo","title":"Squirrel","subtitle":"Another squirrel","action":"","itemtype": "icon"))
	recs.add(CreateMap("key":"btnc","icon":"gavel","iconcolor":"green","title":"Sky","subtitle":"Heavens","action":"","itemtype": "icon"))
	recs.add(CreateMap("key":"btnd","icon":"question_answer","iconcolor":"purple","title":"Planet","subtitle":"Planets of the world","action":"","itemtype": "icon"))
	recs.add(CreateMap("key":"btne","icon":"mdi-account","iconcolor":"yellow","title":"Bird","subtitle":"This is a beautiful bird","action":"","itemtype": "icon"))
	'
	Dim sjson As String = BANano.ToJson(recs)
	Return sjson
End Sub


'sample demo items
Sub DemoItems As String
	Dim recs As List
	recs.initialize
	'
	recs.add(CreateMap("key":"btna","avatar":"./assets/vbanner.jpg", "title":"Banner","subtitle":"A business banner","action":""))
	recs.add(CreateMap("key":"btnb", "iconcolor":"indigo","icon":"account_box","title":"Squirrel","subtitle":"Another squirrel","action":""))
	recs.add(CreateMap("key":"btnc","avatar":"./assets/sky.jpg","iconcolor":"green","title":"Sky","subtitle":"Heavens","action":""))
	recs.add(CreateMap("key":"btnd", "iconcolor":"purple", "icon":"question_answer","title":"Planet","subtitle":"Planets of the world","action":""))
	recs.add(CreateMap("key":"btne","avatar":"./assets/bird.jpg","title":"Bird","subtitle":"This is a beautiful bird","action":""))
	'
	Dim sjson As String = BANano.ToJson(recs)
	Return sjson
End Sub


#Region Slider Property Bag
Sub PropertyBag_Slider
	vm.setdata("pbslider",False)
	lstBags.add("pbslider")
	pbslider = vm.CreateProperty("ppbslider", Me)
	pbslider.SetVShow("pbslider")
	pbslider.AddHeading("d","Details")
	pbslider.AddText("d","id","ID","","")
	pbslider.AddSelect("d", "controltype", "Type", controltypes)
	pbslider.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbslider.AddText("d","vmodel","VModel","","")
	pbslider.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbslider.AddText2("d", CreateMap("label": "Label", "slidervalue": "Value(,)"))
	pbslider.AddText2("d", CreateMap("stepvalue": "Step Value"))
	pbslider.AddText2("d", CreateMap("minvalue": "Min Value", "maxvalue": "Max Value"))
	pbslider.AddText2("d", CreateMap("prependicon": "Prepend Icon", "appendicon": "Append Icon"))
	pbslider.AddText2("d", CreateMap("thumbsize": "Thumb Size", "tabindex":"Tab Index"))
	pbslider.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
	pbslider.AddSelect2("d","thumbcolor","Thumb Color", vm.ColorOptions, "thumbintensity","Thumb Intensity", vm.IntensityOptions)
	pbslider.AddSelect2("d","trackcolor","Track Color", vm.ColorOptions, "trackintensity","Track Intensity", vm.IntensityOptions)
	pbslider.AddSelect("d","float", "Float", vm.Floats)
	'
	pbslider.AddHeading("m","Margins & Padding")
	pbslider.AddMarginsPaddings("m")
	'
	pbslider.AddHeading("e","Settings")
	pbslider.AddSwitches("e", CreateMap("isrequired": "Required", "isvisible": "Visible"))
	pbslider.AddSwitches("e", CreateMap("isdisabled": "Disabled", "isreadonly": "Read Only"))
	pbslider.AddSwitches("e", CreateMap("isvertical": "Vertical", "isthumbalways": "Thumb Label Always"))
	pbslider.AddSwitches("e", CreateMap("isthumblabel": "Thumb Label", "ishidedetails": "Hide Details"))
	pbslider.AddSwitches("e", CreateMap("isdark": "Dark", "isdense": "Dense"))
	pbslider.AddHeading("f","Matrix")
	pbslider.AddMatrix("f")
	vm.Container.AddComponent(1, 3, pbslider.tostring)
End Sub
#End Region


#Region DatePicker Property Bag
Sub PropertyBag_DatePicker
	vm.setdata("pbdatepicker", False)
	lstBags.add("pbdatepicker")
	pbdatepicker = vm.CreateProperty("ppbdatepicker", Me)
	pbdatepicker.SetVShow("pbdatepicker")
	pbdatepicker.AddHeading("d","Details")
	pbdatepicker.AddText("d","id","ID","","")
	pbdatepicker.AddSelect("d", "controltype", "Type", controltypes)
	pbdatepicker.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbdatepicker.AddText("d","vmodel","VModel","","")
	pbdatepicker.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbdatepicker.AddText2("d", CreateMap("label": "Label", "value":"Value"))
	pbdatepicker.AddText("d","iconname","Icon Name","","")
	pbdatepicker.AddText("d","placeholder","Placeholder","","")
	pbdatepicker.AddText("d","helpertext","Helper Text","","")
	pbdatepicker.AddText("d","errortext","Error Text","","")
	pbdatepicker.AddText("d","firstdayofweek","First Day of Week","","0")
	pbdatepicker.AddRadioGroupH("d", "tformat", "T:Format", CreateMap("ampm":"AM/PM","24hr":"24hr"))
	'pbdatepicker.AddSelect("d","headercolor","Header Color", vm.ColorOptions)
	'pbdatepicker.AddSelect("d","headerintensity","Header Intensity", vm.IntensityOptions)
	'pbdatepicker.AddSelect("d","color","T:Color", vm.ColorOptions)
	'pbdatepicker.AddSelect("d","intensity","T:Intensity", vm.IntensityOptions)
	pbdatepicker.AddNumber("d","tabindex","Tab Index","","")
	pbdatepicker.AddSelect("d","float", "Float", vm.Floats)
	'
	pbdatepicker.AddHeading("m","Margins & Padding")
	pbdatepicker.AddMarginsPaddings("m")
	'
	pbdatepicker.AddHeading("e","Settings")
	pbdatepicker.AddSwitches("e", CreateMap("isrequired": "Required", "isautofocus": "Auto Focus"))
	pbdatepicker.AddSwitches("e", CreateMap("ishidedetails": "Hide Details","isnow":"Now"))
	pbdatepicker.AddSwitches("e", CreateMap("isclearable": "Clearable"))
	'
	pbdatepicker.AddSwitches("e", CreateMap("isvisible": "Visible", "isdisabled": "Disabled"))
	pbdatepicker.AddSwitches("e", CreateMap("ontable": "On Table", "ismultiple": "Multiple"))
	pbdatepicker.AddSwitches("e", CreateMap("isrange": "Range", "isshowweek": "Show Week"))
	pbdatepicker.AddSwitches("e", CreateMap("isampm": "T:AM/PM in Title", "isdark": "Dark"))
	pbdatepicker.AddSwitches("e", CreateMap("isnotitle": "T:No Title", "isuseseconds": "T:Use Seconds"))
	'
	pbdatepicker.AddSwitches("e", CreateMap("issolo": "Solo", "isoutlined": "Outlined"))
	pbdatepicker.AddSwitches("e", CreateMap("isfilled": "Filled", "isdense": "Dense"))
	pbdatepicker.AddSwitches("e", CreateMap("issingleline": "Single Line", "ispersistenthint": "Persistent Hint"))
	pbdatepicker.AddSwitches("e", CreateMap("isshaped": "Shaped - FOS", "isloading": "Loading"))
	pbdatepicker.AddSwitches("e", CreateMap("isflat": "Flat - Solo", "isrounded": "Rounded - FOS"))
	'
	pbdatepicker.AddHeading("f","Matrix")
	pbdatepicker.AddMatrix("f")
	vm.container.Addcomponent(1, 3, pbdatepicker.tostring)
End Sub
#End Region


#Region Button Property Bag
Sub PropertyBag_Button
	Dim ops As Map = CreateMap("add":"Add Record","edit":"Edit Record","save":"Save Record","delete":"Delete Record", _
	"showdialog":"Show Dialog","hidedialog":"Hide Dialog","showpage":"Show Page","showdrawer":"Show Drawer", "hidedrawer":"Hide Drawer","contactus":"Contact Us", "sendcredentials":"User Credentials","showfs":"Show File Select","":"None")
	vm.setdata("pbbutton", False)
	lstBags.add("pbbutton")
	pbbutton = vm.CreateProperty("ppbbutton", Me)
	pbbutton.SetVShow("pbbutton")
	pbbutton.AddHeading("d","Details")
	pbbutton.AddText("d","id","ID","","")
	pbbutton.AddSelect("d", "controltype", "Type", controltypes)
	pbbutton.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbbutton.AddText("d","vmodel","ID","","")
	pbbutton.AddText2("d",CreateMap("label":"Label", "iconname":"Icon Name"))
	pbbutton.AddRadioGroupH("d", "iconpos", "Icon Position", iconpos)
	pbbutton.AddRadioGroupH("d", "buttontype", "Button Type", CreateMap("normal":"Normal","icon":"Icon","fab":"FAB"))
	pbbutton.AddText("d","href","Href","","")
	pbbutton.AddText("d","to","Navigate To","","")
	pbbutton.AddSelect2("d","target","Target", vm.TargetOptions, "size", "Size", iconsizes)
	pbbutton.AddText("d","dialogpage","Dialog / Page Name / Drawer / File Select","","")
	pbbutton.AddSelect("d","clickaction", "On Click Action", ops)
	pbbutton.AddText("d","tooltip","Tooltip","","")
	pbbutton.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
	pbbutton.AddSelect2("d","textcolor","Text Color", vm.ColorOptions, "textintensity","Text Intensity", vm.IntensityOptions)
	pbbutton.AddNumber("d","tabindex","Tab Index","","")
	pbbutton.AddSelect("d","float", "Float", vm.Floats)
	pbbutton.AddHeightWidths("d")
	'
	pbbutton.AddHeading("m","Margins & Padding")
	pbbutton.AddMarginsPaddings("m")
	'
	pbbutton.AddHeading("e","Settings")
	pbbutton.AddSwitches("e", CreateMap("istext": "Text", "isfitwidth": "Fit Width/Block"))
	pbbutton.AddSwitches("e", CreateMap("isoutlined": "Outlined", "isrounded": "Rounded"))
	pbbutton.AddSwitches("e", CreateMap("isdepressed": "Depressed", "isvisible": "Visible"))
	pbbutton.AddSwitches("e", CreateMap("isdisabled": "Disabled", "isdark": "Dark"))
	pbbutton.AddSwitches("e", CreateMap("istile": "Tile", "centeronparent": "Center on Parent"))
	'
	pbbutton.AddHeading("f","Matrix")
	pbbutton.AddMatrix("f")
	vm.Container.AddComponent(1, 3, pbbutton.tostring)
End Sub
#End Region

#Region Icon Property Bag
Sub PropertyBag_Icon
	vm.setdata("pbicon", False)
	lstBags.add("pbicon")
	pbicon = vm.CreateProperty("ppbicon", Me)
	pbicon.SetVShow("pbicon")
	pbicon.AddHeading("d","Details")
	pbicon.AddText("d","id","ID","","")
	pbicon.AddText("d", "controltype", "Type", "", "icon")
	pbicon.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbicon.AddText("d","vmodel","VModel","","")
	pbicon.AddText("d","iconname","Icon Name","","mdi-account-circle")
	pbicon.AddSelect("d", "size", "Icon Size", iconsizes)
	pbicon.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
	pbicon.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbicon.AddHeading("m","Margins & Padding")
	pbicon.AddMarginsPaddings("m")
	'
	pbicon.AddHeading("e","Settings")
	pbicon.AddSwitches("e", CreateMap("iscenteronparent": "CenterOnParent", "isdark": "Dark"))
	pbicon.AddSwitches("e", CreateMap("isdense": "Dense", "isdisabled": "Disabled"))
	pbicon.AddSwitches("e", CreateMap("isleft": "Left", "isright": "Right"))
	pbicon.AddSwitches("e", CreateMap("isvisible": "Visible"))
	
	pbicon.AddHeading("f","Matrix")
	pbicon.AddMatrix("f")
	vm.Container.AddComponent(1, 3, pbicon.tostring)
End Sub
#End Region

#Region Image Property Bag
Sub PropertyBag_Image
	vm.setdata("pbimage", False)
	lstBags.add("pbimage")
	pbimage = vm.CreateProperty("ppbimage",Me)
	pbimage.SetVShow("pbimage")
	pbimage.AddHeading("d","Details")
	pbimage.AddText("d","id","ID","","")
	pbimage.AddText("d", "controltype", "Type", "", "image")
	pbimage.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbimage.AddText("d","vmodel","ID","","")
	pbimage.AddText("d","src","Src","","./assets/sponge.png")
	pbimage.AddText("d","lazysrc","Lazy Src","","")
	pbimage.AddText("d","alt","Alt","","")
	pbimage.AddText("d","tooltip","Tooltip","","")
	pbimage.AddNumber("d","tabindex","Tab Index","","")
	pbimage.AddText2("d", CreateMap("borderradius":"Border Radius", "borderwidth":"Border Width"))
	pbimage.AddSelect2("d","bordercolor","Border Color", vm.ColorOptions, "borderstyle","Border Style",vm.BorderOptions)
	pbimage.AddText("d","aspectratio","Aspect Ratio","","")
	pbimage.AddSelect("d","float", "Float", vm.Floats)
	pbimage.AddHeightWidths("d")
	'
	pbimage.AddHeading("m","Margins & Padding")
	pbimage.AddMarginsPaddings("m")
	'
	pbimage.AddHeading("e","Settings")
	pbimage.AddSwitches("e", CreateMap("isvisible": "Visible", "ontable": "On Table"))
	pbimage.AddSwitches("e", CreateMap("centeronparent": "Center on Parent"))
	
	pbimage.AddHeading("f","Matrix")
	pbimage.AddMatrix("f")
	vm.Container.AddComponent(1, 3, pbimage.tostring)
End Sub
#End Region

#Region CheckBox Property Bag
Sub PropertyBag_CheckBox
	vm.setdata("pbcheckbox", False)
	lstBags.add("pbcheckbox")
	pbcheckbox = vm.CreateProperty("ppbcheckbox",Me)
	pbcheckbox.SetVShow("pbcheckbox")
	pbcheckbox.AddHeading("d","Details")
	pbcheckbox.AddText("d","id","ID","","")
	pbcheckbox.AddSelect("d", "controltype", "Type", controltypes)
	pbcheckbox.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbcheckbox.AddText("d","vmodel","VModel","","")
	pbcheckbox.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbcheckbox.AddText2("d",CreateMap("label":"Label", "value": "Value"))
	pbcheckbox.AddText2("d",CreateMap("truevalue":"True Value", "falsevalue":"False Value"))
	pbcheckbox.AddText2("d", CreateMap("tabindex":"Tab Index"))
	pbcheckbox.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
	pbcheckbox.AddSelect("d","switchloading","Loading", vm.ColorOptions)
	pbcheckbox.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbcheckbox.AddHeading("m","Margins & Padding")
	pbcheckbox.AddMarginsPaddings("m")
	'
	pbcheckbox.AddHeading("e","Settings")
	pbcheckbox.AddSwitches("e", CreateMap("isrequired": "Required", "isprimary": "Primary"))
	pbcheckbox.AddSwitches("e", CreateMap("isvisible": "Visible", "isdisabled": "Disabled"))
	pbcheckbox.AddSwitches("e", CreateMap("ontable": "On Table", "isdark": "Dark"))
	pbcheckbox.AddSwitches("e", CreateMap("isdense": "Dense", "ishidedetails": "Hide Details"))
	pbcheckbox.AddSwitches("e", CreateMap("isindeterminate": "Indeterminate", "islight": "Light"))
	pbcheckbox.AddSwitches("e", CreateMap("ismultiple": "Multiple", "isinset": "Inset"))
	pbcheckbox.AddSwitches("e", CreateMap("isflat": "Flat"))
	'
	pbcheckbox.AddHeading("f","Matrix")
	pbcheckbox.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbcheckbox.tostring)
End Sub
#End Region

#Region Radio Property Bag
Sub PropertyBag_RadioGroup
	vm.setdata("pbradiogroup", False)
	lstBags.add("pbradiogroup")
	pbradiogroup = vm.CreateProperty("ppbradiogroup", Me)
	pbradiogroup.SetVShow("pbradiogroup")
	pbradiogroup.AddHeading("d","Details")
	pbradiogroup.AddText("d","id","ID","","")
	pbradiogroup.AddText("d", "controltype", "Type", "", "radio")
	pbradiogroup.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbradiogroup.AddText("d","vmodel","VModel","","")
	pbradiogroup.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbradiogroup.AddText2("d",CreateMap("label":"Label","value":"Value"))
	pbradiogroup.AddNumber("d","tabindex","Tab Index","","")
	pbradiogroup.AddSelect("d","float", "Float", vm.Floats)
	
	
	pbradiogroup.AddHeading("ds","Data Source")
	pbradiogroup.AddSelectDS("ds", "sourcetable", "Data Source", "tablenames", "tablename", "tablename", "sourcetable_change")
	pbradiogroup.AddText2("ds", CreateMap("sourcefield":"Item Value", "displayfield":"Item Text"))
	pbradiogroup.AddSwitches("ds", CreateMap("useoptions": "Use These Items"))
	pbradiogroup.AddTextArea("ds","keys","Item Values (,)","", "1,2,3")
	pbradiogroup.AddTextArea("ds","values","Item Texts (,)", "", "One,Two,Three")
	'
	pbradiogroup.AddHeading("m","Margins & Padding")
	pbradiogroup.AddMarginsPaddings("m")
	'
	pbradiogroup.AddHeading("e","Settings")
	pbradiogroup.AddSwitches("e", CreateMap("showlabel": "Show Label", "labelontop": "Column"))
	pbradiogroup.AddSwitches("e", CreateMap("isvisible": "Visible", "isdisabled": "Disabled"))
	pbradiogroup.AddSwitches("e", CreateMap("ontable": "On Table", "ismandatory": "Mandatory"))
	pbradiogroup.AddSwitches("e", CreateMap("isdense": "Dense", "ishidedetails": "Hide Details"))
	pbradiogroup.AddSwitches("e", CreateMap("ismultiple": "Multiple", "useoptions": "Use Options"))
	'
	pbradiogroup.AddHeading("f","Matrix")
	pbradiogroup.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbradiogroup.tostring)
End Sub
#End Region

'from property bag when adding columns to a table
Sub colforeigntable_change(value As String)
	If value = "" Then Return
	'update tables, we will use this for lookups
	Dim db As BANanoSQL
	Dim rsTables As BANanoAlaSQLE
	rsTables.Initialize("tables", "tablename")
	rsTables.AddStrings(Array("tablename", "primarykey", "displayfields"))
	rsTables.Read(value)
	rsTables.Result = db.ExecuteWait(rsTables.query, rsTables.args)
	rsTables.FromJSON
	If rsTables.Result.Size = 0 Then Return
	Dim rs As Map = rsTables.result.get(0)
	Dim sprimarykey As String = rs.Get("primarykey")
	Dim sdisplayfields As String = rs.get("displayfields")
	'
	'update the key and display fields
	vm.SetData("colforeignkey", sprimarykey)
	vm.SetData("colforeignvalue", sdisplayfields)
	vm.SetData("itemscolforeignkey", sprimarykey)
	vm.SetData("itemscolforeignvalue", sdisplayfields)
	vm.SetData("itemscolislookup", "Yes")
End Sub

'data source selection
Sub sourcetable_change(value As String)
	If value = "" Then Return
	'update tables, we will use this for lookups
	Dim db As BANanoSQL
	Dim rsTables As BANanoAlaSQLE
	rsTables.Initialize("tables", "tablename")
	rsTables.AddStrings(Array("tablename", "primarykey", "displayfields"))
	rsTables.Read(value)
	rsTables.Result = db.ExecuteWait(rsTables.query, rsTables.args)
	rsTables.FromJSON
	If rsTables.Result.Size = 0 Then Return
	Dim rs As Map = rsTables.result.get(0)
	Dim sprimarykey As String = rs.Get("primarykey")
	Dim sdisplayfields As String = rs.get("displayfields")
	'
	'update the key and display fields
	vm.SetData("sourcefield", sprimarykey)
	vm.SetData("displayfield", sdisplayfields)
	vm.SetData("useoptions", "No")
End Sub

#Region Select Property Bag
Sub PropertyBag_Select
	vm.setdata("pbselectbox", False)
	lstBags.add("pbselectbox")
	pbselectbox = vm.CreateProperty("ppbselectbox", Me)
	pbselectbox.SetVShow("pbselectbox")
	pbselectbox.AddHeading("d","Details")
	pbselectbox.AddText("d","id","ID","","")
	pbselectbox.AddSelect("d", "controltype", "Type", controltypes)
	pbselectbox.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbselectbox.AddText("d","vmodel","VModel","","")
	pbselectbox.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbselectbox.AddText2("d",CreateMap("label":"Label", "value": "Value"))
	pbselectbox.AddText("d","iconname","Icon Name","","")
	pbselectbox.AddText("d","placeholder","Placeholder","","")
	pbselectbox.AddNumber("d","tabindex","Tab Index","","")
	pbselectbox.AddText("d","helpertext","Helper Text","","")
	pbselectbox.AddText("d","errortext","Error Text","","")
	pbselectbox.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbselectbox.AddHeading("ds","Data Source")
	pbselectbox.AddSelectDS("ds", "sourcetable", "Data Source", "tablenames", "tablename", "tablename", "sourcetable_change")
	pbselectbox.AddText2("ds",CreateMap("sourcefield":"Item Value", "displayfield":"Item Text"))
	pbselectbox.AddSwitches("ds", CreateMap("useoptions": "Use These Items"))
	pbselectbox.AddTextArea("ds","keys","Item Values (,)","", "1,2,3")
	pbselectbox.AddTextArea("ds","values","Item Texts (,)", "", "One,Two,Three")
	'
	pbselectbox.AddHeading("m","Margins & Padding")
	pbselectbox.AddMarginsPaddings("m")
	'
	pbselectbox.AddHeading("e","Settings")
	pbselectbox.AddSwitches("e", CreateMap("isrequired": "Required", "isautofocus": "Auto Focus"))
	pbselectbox.AddSwitches("e", CreateMap("ishidedetails": "Hide Details", "isclearable": "Clearable"))
	pbselectbox.AddSwitches("e", CreateMap("isvisible": "Visible", "isdisabled": "Disabled"))
	pbselectbox.AddSwitches("e", CreateMap("ismultiple": "Multiple", "ontable": "On Table"))
	pbselectbox.AddSwitches("e", CreateMap("issolo": "Solo", "isoutlined": "Outlined"))
	pbselectbox.AddSwitches("e", CreateMap("isfilled": "Filled", "isdense": "Dense"))
	pbselectbox.AddSwitches("e", CreateMap("issingleline": "Single Line", "ispersistenthint": "Persistent Hint"))
	pbselectbox.AddSwitches("e", CreateMap("isshaped": "Shaped - FOS", "isloading": "Loading"))
	pbselectbox.AddSwitches("e", CreateMap("isflat": "Flat - Solo", "isrounded": "Rounded - FOS"))
	pbselectbox.AddSwitches("e", CreateMap("isreturnobject": "Return Object", "ischips": "Chips"))
	pbselectbox.AddSwitches("e", CreateMap("issmallchips": "Small Chips", "isdeletablechips": "Deletable Chips"))
	'	
	pbselectbox.AddHeading("f","Matrix")
	pbselectbox.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbselectbox.tostring)
End Sub
#End Region

#Region Parallax
Sub PropertyBag_Parallax
	vm.setdata("pbparallax", False)
	lstBags.add("pbparallax")
	pbparallax = vm.CreateProperty("ppbparallax", Me)
	pbparallax.SetVShow("pbparallax")
	pbparallax.AddHeading("d","Details")
	pbparallax.AddText("d","id","ID","","")
	pbparallax.AddText("d", "controltype", "Type", "","parallax")
	pbparallax.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbparallax.AddText("d","vmodel","ID","","")
	pbparallax.AddText("d","height","Height","","500")
	pbparallax.AddText("d","src","Src","","./assets/material.jpg")
	pbparallax.AddText("d","alt","Alt","","")
	pbparallax.AddSelect("d","float", "Float", vm.Floats)
	
	
	pbparallax.AddHeading("m","Margins & Padding")
	pbparallax.AddMarginsPaddings("m")
	
	pbparallax.AddHeading("e","Settings")
	pbparallax.AddSwitches("e", CreateMap("isvisible": "Visible"))
	
	pbparallax.AddHeading("f","Matrix")
	pbparallax.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbparallax.tostring)
End Sub
#End Region

#Region Container
Sub PropertyBag_Container
	vm.setdata("pbcontainer", False)
	lstBags.add("pbcontainer")
	pbcontainer = vm.CreateProperty("ppbcontainer", Me)
	pbcontainer.SetVShow("pbcontainer")
	pbcontainer.AddHeading("d","Details")
	pbcontainer.AddText("d","id","ID","","")
	pbcontainer.AddText("d", "controltype", "Type", "","container")
	pbcontainer.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbcontainer.AddText("d","vmodel","ID","","")
	pbcontainer.AddSelect2("d","elevation","Elevation",vm.elevation, "transition","Transition",vm.Transition)
	pbcontainer.AddText2("d",CreateMap("borderradius":"Border Radius", "borderwidth":"Border Width"))
	pbcontainer.AddSelect2("d","bordercolor","Border Color", vm.ColorOptions, "borderstyle","Border Style",vm.BorderOptions)
	pbcontainer.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
	pbcontainer.AddSelect("d","float", "Float", vm.Floats)
	pbcontainer.AddHeightWidths("d")
	'
	pbcontainer.AddHeading("m","Margins & Padding")
	pbcontainer.AddMarginsPaddings("m")
	'
	pbcontainer.AddHeading("e","Settings")
	pbcontainer.AddSwitches("e", CreateMap("isitemdiv": "Div", "isnogutters": "No Gutters"))
	pbcontainer.AddSwitches("e", CreateMap("isfluid": "Fluid", "isshowmatrix": "Show Matrix"))
	pbcontainer.AddSwitches("e", CreateMap("isvisible": "Visible"))
	'
	pbcontainer.AddHeading("f","Matrix")
	pbcontainer.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbcontainer.tostring)
End Sub
#End Region

#Region Toolbar
Sub PropertyBag_Toolbar
	vm.setdata("pbtoolbar", False)
	lstBags.add("pbtoolbar")
	pbtoolbar = vm.CreateProperty("ppbcontainer", Me)
	pbtoolbar.SetVShow("pbtoolbar")
	pbtoolbar.AddHeading("d","Details")
	pbtoolbar.AddText("d","id","ID","","")
	pbtoolbar.AddText("d", "controltype", "Type", "","toolbar")
	pbtoolbar.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbtoolbar.AddText("d","vmodel","ID","","")
	pbtoolbar.AddRadioGroupH("d", "bartype", "Type", CreateMap("app":"AppBar","tool":"ToolBar","sys":"SystemBar"))
	pbtoolbar.AddSelect("d","elevation","Elevation",vm.elevation)
	pbtoolbar.AddText2("d",CreateMap("extensionheight":"Extension Height","searchkey":"Search Key"))
	pbtoolbar.AddText2("d",CreateMap("scrolltarget":"Scroll Target", "scrollthreshold":"Scroll Threshold"))
	pbtoolbar.AddText("d","src","Background Image","","")
	pbtoolbar.AddText("d","label","Title","","")
	pbtoolbar.AddText("d","titleclass","Title Class(es)","","")
	pbtoolbar.AddText("d","toolbarsubtitle","Sub Heading","","")
	pbtoolbar.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
	pbtoolbar.AddSelect2("d","textcolor","Text Color", vm.ColorOptions, "textintensity","Text Intensity", vm.IntensityOptions)
	pbtoolbar.AddSelect("d","float", "Float", vm.Floats)
	pbtoolbar.AddHeightWidths("d")
	'
	pbtoolbar.AddHeading("b", "Logo")
	pbtoolbar.AddText("b","logourl","Logo URL","","")
	pbtoolbar.AddText2("b",CreateMap("borderradius":"Logo Border Radius", "borderwidth":"Logo Border Width"))
	pbtoolbar.AddSelect2("b","bordercolor","Logo Border Color", vm.ColorOptions, "borderstyle","Logo Border Style",vm.BorderOptions)
	pbtoolbar.AddText2("b",CreateMap("logowidth":"Logo Width","logoheight":"Logo Height"))
	
	pbtoolbar.AddHeading("a", "Items")
	pbtoolbar.AddToolbarItems("a")

	'
	pbtoolbar.AddHeading("m","Margins & Padding")
	pbtoolbar.AddMarginsPaddings("m")
	'
	pbtoolbar.AddHeading("e","Settings")
	pbtoolbar.AddSwitches("e", CreateMap("iscurrent":"Master NavBar","isflat":"Flat"))
	pbtoolbar.AddSwitches("e", CreateMap("ishamburger":"Hamburger","islogovisible": "Logo"))
	pbtoolbar.AddSwitches("e", CreateMap("istitle":"Title", "issubtitle":"Sub Heading"))
	pbtoolbar.AddSwitches("e", CreateMap("issearch":"Add Search","isspacer":"Add Spacer"))
	pbtoolbar.AddSwitches("e", CreateMap("isdense":"Dense", "isfixed": "Fixed"))	
	pbtoolbar.AddSwitches("e", CreateMap("isdark":"Dark","isabsolute":"Absolute"))	
	pbtoolbar.AddSwitches("e", CreateMap("isclippedleft": "Clipped Left", "isclippedright": "Clipped Right"))
	pbtoolbar.AddSwitches("e", CreateMap("iscollapse": "Collapse", "iscollapseonscroll": "Collapse on Scroll"))
	pbtoolbar.AddSwitches("e", CreateMap("iselevateonscroll": "Elevate on Scroll", "isextended": "Extended"))
	pbtoolbar.AddSwitches("e", CreateMap("isfadeimageonscroll": "Fade Image on Scroll"))
	pbtoolbar.AddSwitches("e", CreateMap("isfloating": "Floating", "ishideonscroll": "Hide on Scroll"))
	pbtoolbar.AddSwitches("e", CreateMap("isinvertedscroll": "Inverted Scroll", "isprominent": "Prominent"))
	pbtoolbar.AddSwitches("e", CreateMap("isscrolloffscreen": "Scroll off Screen", "isshort": "Short"))
	pbtoolbar.AddSwitches("e", CreateMap("isshrinkonscroll": "Shrink on Scroll", "isvisible": "Visible"))
	'
	pbtoolbar.AddHeading("f","Matrix")
	pbtoolbar.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbtoolbar.tostring)
End Sub
#End Region

#Region Label Property Bag
Sub PropertyBag_Label
	vm.setdata("pblabel", False)
	lstBags.add("pblabel")
	Dim mlabelsize As Map = CreateMap("p":"Paragraph","h1":"H1", "h2":"H2", "h3":"H3", "h4":"H4", "h5":"H5","h6":"H6","span":"span","blockquote":"blockquote")
	pblabel = vm.CreateProperty("ppblabel", Me)
	pblabel.SetVShow("pblabel")
	pblabel.AddHeading("d","Details")
	pblabel.AddText("d","id","ID","","")
	pblabel.AddText("d", "controltype", "Type", "","label")
	pblabel.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pblabel.AddText("d","vmodel","ID","","")
	pblabel.AddSelect2("d", "labelsize", "Size", mlabelsize,"fontweight", "Font Weight", vm.FontWeightOptions)
	pblabel.AddTextArea("d","value","Text","","")
	pblabel.AddSelect2("d","textcolor","Text Color", vm.ColorOptions, "textintensity","Text Intensity", vm.IntensityOptions)
	pblabel.AddSelect2("d", "display", "Display", vm.DisplayOptions, "align", "Text Align", vm.TextAlignmentOptions)
	pblabel.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pblabel.AddHeading("m","Margins & Padding")
	pblabel.AddMarginsPaddings("m")
	
	pblabel.AddHeading("e","Settings")
	pblabel.AddSwitches("e", CreateMap("iscaption": "Caption","isloremipsum": "Lorem Ipsum"))
	pblabel.AddSwitches("e", CreateMap("isdisplay1": "Display1", "isdisplay2": "Display2"))
	pblabel.AddSwitches("e", CreateMap("isdisplay3": "Display3", "isdisplay4": "Display4"))
	pblabel.AddSwitches("e", CreateMap("isheadline": "Headline", "isitalic": "Italic"))
	pblabel.AddSwitches("e", CreateMap("isoverline": "Overline", "isvisible": "Visible"))
	pblabel.AddSwitches("e", CreateMap("issubtitle1": "SubTitle1", "issubtitle2": "SubTitle2"))
	pblabel.AddSwitches("e", CreateMap("istextcapitalize": "TextCapitalize", "istextlowercase": "TextLowerCase"))
	pblabel.AddSwitches("e", CreateMap("istextuppercase": "TextUpperCase", "istitle": "Title"))
	'
	pblabel.AddHeading("f","Matrix")
	pblabel.AddMatrix("f")
	vm.container.AddComponent(1, 3, pblabel.tostring)
End Sub
#End Region

#Region TxtBox Property Bag
Sub PropertyBag_TextField
	lstBags.add("pbtextfield")
	vm.setdata("pbtextfield", False)
	pbtextfield = vm.CreateProperty("ppbtextfield", Me)
	pbtextfield.SetVShow("pbtextfield")
	pbtextfield.AddHeading("d","Details")
	pbtextfield.AddText("d","id","ID","","")
	pbtextfield.AddSelect("d", "controltype", "Type", controltypes)
	pbtextfield.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbtextfield.AddText("d","vmodel","VModel","","")
	pbtextfield.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbtextfield.AddText2("d", CreateMap("label": "Label","value": "Value"))
	pbtextfield.AddText("d","iconname","Icon Name","","")
	pbtextfield.AddSelect1("d", "matchto", "Match To", "components", "vmodel", "vmodel")
	pbtextfield.AddSelect1("d", "donotmatchto", "Do No Match To", "components", "vmodel", "vmodel")
	pbtextfield.AddSelect2("d", "hashtype", "Hash Type", vue.HashType, "alg", "Algorithm", vue.Algorithm)
	pbtextfield.AddText("d", "placeholder","Placeholder","","")
	pbtextfield.AddText("d","helpertext","Helper Text","","")
	pbtextfield.AddText("d","errortext","Error Text","","")
	pbtextfield.AddText2("d",CreateMap("tabindex":"Tab Index", "maxlength":"Max Length/Counter"))
	pbtextfield.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbtextfield.AddHeading("g","File")
	pbtextfield.AddSwitches("g", CreateMap("isupload": "Upload File", "ismultiple": "Multiple"))
	pbtextfield.AddText("g","accept","Accept","","")
	pbtextfield.AddText("g","filenamevmodel","File Name VModel","","")
	pbtextfield.AddText("g","filedatevmodel","File Date VModel","","")
	pbtextfield.AddText("g","filesizevmodel","File Size VModel","","")
	pbtextfield.AddText("g","filetypevmodel","File Type VModel","","")
	'
	pbtextfield.AddHeading("m","Margins & Padding")
	pbtextfield.AddMarginsPaddings("m")
	'
	pbtextfield.AddHeading("e","Settings")
	pbtextfield.AddSwitches("e", CreateMap("isrequired": "Required", "isautofocus": "Auto Focus"))
	pbtextfield.AddSwitches("e", CreateMap("isdatenow":"Date Now", "istimenow":"Time Now"))
	pbtextfield.AddSwitches("e", CreateMap("isdatetimenow":"Date Time Now", "isreadonly": "Read Only"))
	pbtextfield.AddSwitches("e", CreateMap("ishidedetails": "Hide Details", "isupdatable": "Updatable"))
	pbtextfield.AddSwitches("e", CreateMap("isvisible": "Visible", "isdisabled": "Disabled"))
	pbtextfield.AddSwitches("e", CreateMap("isautogrow": "Autogrow", "ontable": "On Table"))
	pbtextfield.AddSwitches("e", CreateMap("issolo": "Solo", "isoutlined": "Outlined"))
	pbtextfield.AddSwitches("e", CreateMap("isfilled": "Filled", "isdense": "Dense"))
	pbtextfield.AddSwitches("e", CreateMap("issingleline": "Single Line", "ispersistenthint": "Persistent Hint"))
	pbtextfield.AddSwitches("e", CreateMap("isshaped": "Shaped - FOS", "isloading": "Loading"))
	pbtextfield.AddSwitches("e", CreateMap("isflat": "Flat - Solo", "isrounded": "Rounded - FOS"))
	pbtextfield.AddSwitches("e", CreateMap("istoggle": "Show Toggle Icons", "isclearable": "Clearable"))
	'
	pbtextfield.AddHeading("f","Matrix")
	pbtextfield.AddMatrix("f")
	Dim txtCode As String = pbtextfield.tostring
	vm.Container.AddComponent(1, 3, txtCode)
End Sub
#End Region

Sub DeletePropertyBag
	'get saved property bag
	mattr = vm.getdata("propbag")
	'get the id
	Dim sid As String = mattr.get("id")
	Dim slabel As String = mattr.get("label")
	If sid = "" Then Return
	vm.setdata("deleteid", sid)
	vm.ShowConfirm("deletepropbag", $"Confirm Delete: ${slabel}"$, _
	$"Are you sure that you want to delete component '${slabel}'?"$, "Yes", "No")
End Sub

Sub DeleteIT
	ShowBag("")
	'get the id tp delete
	Dim sid As String = vm.getdata("deleteid")
	sid = BANano.parseint(sid)
	vm.pagepause
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("components", "id")
	rsSQL.AddIntegers(Array("id", "row","col","tabindex"))
	rsSQL.AddStrings(Array("parentid","name","vmodel","attributes","styles","classes", "loose","label", "icon","avatar","items", "controltype"))

	rsSQL.Delete(sid)
	rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
	rsSQL.FromJSON
	vm.pageresume
	CreateUX
End Sub

Sub DeleteProject
	drwprojectdetails.hide
	ShowBag("")
	'get the id tp delete
	Dim sid As String = vm.getdata("deleteid")
	sid = BANano.parseint(sid)
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("project", "id")
	rsSQL.AddIntegers(Array("id"))
	rsSQL.AddStrings(Array("projectname","dbtype","databasename","components"))
	rsSQL.Delete(sid)
	rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
	rsSQL.FromJSON
	vm.callmethod("LoadProjects")
	vm.NavBar.UpdateTitle($"${Main.AppTitle}"$)
	vm.SetData("project", vm.newmap)
	BANano.SetLocalStorage("project", Null)
	drwprojectdetails.Container.Setdefaults
End Sub

Sub ppbtextfield_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbcheckbox_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbdatepicker_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbradiogroup_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbselectbox_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbslider_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppblabel_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbimage_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbbutton_change(e As BANanoEvent)
	SavePropertyBag	
End Sub

Sub ppbicon_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbdrawer_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbcarousel_change(e As BANanoEvent)
	SavePropertyBag
End Sub


Sub ppbparallax_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbcontainer_change(e As BANanoEvent)
	SavePropertyBag	
End Sub

Sub ppbtoolbar_change(e As BANanoEvent)
	SavePropertyBag
End Sub


Sub ppbmenu_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbdialog_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbbadge_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbchip_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbspeeddial_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbrating_change(e As BANanoEvent)
	SavePropertyBag
End Sub

Sub ppbtable_change(e As BANanoEvent)
	SavePropertyBag
End Sub

'save the property bag
Sub SavePropertyBag
	isDirty = True
	vm.CallMethod("LoadContainers")
	vm.CallMethod("LoadComponents")
	Dim isTable As Boolean = False
	'get the saved property bag
	Dim contents As List
	contents.initialize
	Dim scontents As String = ""
	contents = vm.getdata("tableitems")
	scontents = BANano.tojson(contents)
	schemaDT.SetDataSourceName("tableitems")
	dbCode.SetCode("")
	vm.pagepause
	Dim spropbagtype As String = vm.getdata("propbagtype")
	mattr = CreateMap()
	Dim serrortext As String
	Dim bisrequired As Boolean
	Dim slabel As String
	Select Case spropbagtype
		Case "text", "textarea", "file", "email", "password", "tel", "number"
			mattr = pbtextfield.properties
			serrortext = mattr.getdefault("errortext", "")
			bisrequired = YesNoToBoolean(mattr.GetDefault("isrequired","No"))
			slabel = mattr.getdefault("label", "")
			slabel = slabel.tolowercase
			If bisrequired And serrortext = "" Then
				serrortext = $"The ${slabel} is required!"$
				mattr.Put("errortext", serrortext)
				vm.SetState(mattr)
			End If
		Case "quill"
			mattr = pbquill.Properties
		Case "fileselect"
			mattr = pbfileselect.properties
		Case "infobox"
			mattr = pbinfobox.properties	
		Case "checkbox"
			mattr = pbcheckbox.Properties
		Case "date", "time"
			mattr = pbdatepicker.Properties
			serrortext = mattr.getdefault("errortext", "")
			bisrequired = YesNoToBoolean(mattr.GetDefault("isrequired","No"))
			slabel = mattr.getdefault("label", "")
			slabel = slabel.tolowercase
			If bisrequired And serrortext = "" Then
				serrortext = $"The ${slabel} is required!"$
				mattr.Put("errortext", serrortext)
				vm.SetState(mattr)
			End If
		Case "radio"
			mattr = pbradiogroup.Properties
		Case "select", "combo", "auto"
			mattr = pbselectbox.Properties
			serrortext = mattr.getdefault("errortext", "")
			bisrequired = YesNoToBoolean(mattr.GetDefault("isrequired","No"))
			slabel = mattr.getdefault("label", "")
			slabel = slabel.tolowercase
			If bisrequired And serrortext = "" Then
				serrortext = $"The ${slabel} is required!"$
				mattr.Put("errortext", serrortext)
				vm.SetState(mattr)
			End If
		Case "slider"
			mattr = pbslider.properties
		Case "switch"
			mattr = pbcheckbox.properties
		Case "label"
			mattr = pblabel.properties
			Dim isloremipsum As String = mattr.Get("isloremipsum")
			If isloremipsum = "Yes" Then
				mattr.Put("value", LoremIpsum(1))
				vm.SetState(mattr)
			End If
		Case "profile", "image"
			mattr = pbimage.Properties
		Case "button"
			mattr = pbbutton.properties
		Case "icon"
			mattr = pbicon.properties
		Case "parallax"
			mattr = pbparallax.properties
		Case "container"
			mattr = pbcontainer.properties
		Case "toolbar"
			mattr = pbtoolbar.properties
		Case "menu"
			mattr = pbmenu.properties
		Case "drawer"
			mattr = pbdrawer.properties
		Case "carousel"
			mattr = pbcarousel.properties
		Case "panel"
			mattr = pbexpansionpanels.properties
		Case "page"
			mattr = pbpage.properties
			spagetitle = mattr.getdefault("pagetitle", "")
			mattr.put("label", spagetitle)
		Case "builder"
			mattr = pbbuilder.properties
		Case "stepper"
			mattr = pbstepper.properties
		Case "tabs"
			mattr = pbtabs.properties
		Case "list"
			mattr = pblist.properties
		Case "dialog"
			mattr = pbdialog.properties
			Dim svmodel As String = mattr.get("vmodel")
			mattr.put("okid", $"btnOk${svmodel}"$)
			mattr.put("cancelid", $"btnCancel${svmodel}"$)
			vm.SetState(mattr)
		Case "chip"
			mattr = pbchip.properties
		Case "badge"
			mattr = pbbadge.properties
		Case "avatar"
			mattr = pbavatar.properties
		Case "speeddial"
			mattr = pbspeeddial.properties
		Case "rating"
			mattr = pbrating.properties
		Case "table"
			isTable = True
			mattr = pbtable.properties
			'update the defined items
			Dim svmodel As String = mattr.get("vmodel")
			Dim ssingular As String = mattr.GetDefault("singular","")
			Dim ssmanyrecords As String = mattr.getdefault("manyrecords","")
			Dim sconfirmfield As String = mattr.getdefault("confirmfield", "")
			Dim sItemkey As String = mattr.getdefault("itemkey", "")
			Dim sing As String = vm.propercase(ssingular)
			sing = sing.Replace(" ","")
			sing = sing.trim
			
			If sconfirmfield = "" Then 
				sconfirmfield = sItemkey
				mattr.put("confirmfield", sconfirmfield)
			End If
			mattr.put("datasourcename", svmodel)
			mattr.put("newtooltip", "Add a new " & ssingular)
			mattr.put("newid", $"btnNew${sing}"$)
			mattr.put("tooltip", $"Maintain ${ssmanyrecords}"$)
			vm.SetState(mattr)
			Design_DBSourceCode
	End Select
	'
	Dim sid As String = mattr.get("id")
	Dim srow As String = mattr.get("row")
	Dim scol As String = mattr.get("col")
	Dim stabindex As String = mattr.get("tabindex")
	Dim stitle As String = mattr.get("label")
	Dim svmodel As String = mattr.get("vmodel")
	Dim smanyrecords As String = mattr.get("manyrecords")
	'
	'is vmodel valid
	If avatarMap.containskey(svmodel) Then
		vm.SnackBar.SetColor("red")
		vm.SnackBar.SetTop(True)
		vm.ShowSnackBar("The vmodel you have specified is internal to the designer, please change it!")
		Return
	End If
	
	'
	sid = BANano.parseint(sid)
	srow = BANano.parseint(srow)
	scol = BANano.parseint(scol)
	stabindex = BANano.parseint(stabindex)
	'
	Dim attr As String = BANano.ToJson(mattr)
	Dim nrec As Map = CreateMap()
	nrec.put("id", sid)
	nrec.put("row", srow)
	nrec.put("col", scol)
	nrec.put("tabindex", stabindex)
	nrec.put("attributes", attr)
	nrec.put("vmodel", svmodel)
	nrec.put("label", stitle)
	nrec.put("name", svmodel)
	nrec.Put("items", scontents)
	'save the bag
	vm.setdata("propbag", nrec)
	'
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("components", "id")
	rsSQL.AddIntegers(Array("id", "row","col","tabindex"))
	rsSQL.AddStrings(Array("parentid","name","vmodel","attributes","styles","classes", "loose","label", "icon","avatar","items", "controltype"))

	rsSQL.Update1(nrec,sid)
	rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
	rsSQL.FromJSON
	'
	If isTable Then
		Read_Table
		Dim dlg As String = vm.propercase(smanyrecords)
		Dim dlg As String = dlg.replace(" ","")
		dlg = dlg.trim
		Dim diagName As String = $"dlg${dlg}"$
		'
		If bislookup Then
			'update tables, we will use this for lookups
			Dim tblTables As BANanoAlaSQLE
			tblTables.Initialize("tables", "tablename")
			tblTables.AddStrings(Array("tablename", "primarykey", "displayfields"))
			tblTables.Read(svmodel)
			tblTables.Result = db.ExecuteWait(tblTables.query, tblTables.args)
			tblTables.FromJSON
			If tblTables.Result.Size = 0 Then
				'add record
				tblTables.Initialize("tables", "tablename")
				tblTables.AddStrings(Array("tablename", "primarykey", "displayfields"))
				tblTables.SetField("tablename", svmodel)
				tblTables.SetField("displayfields", sdisplayfield)
				tblTables.SetField("primarykey", sItemkey)
				tblTables.Insert
				tblTables.Result = db.ExecuteWait(tblTables.query, tblTables.args)
				tblTables.FromJSON
			Else
				tblTables.Initialize("tables", "tablename")
				tblTables.AddStrings(Array("tablename", "primarykey", "displayfields"))
				tblTables.SetField("tablename", svmodel)
				tblTables.SetField("displayfields", sdisplayfield)
				tblTables.SetField("primarykey", sItemkey)
				tblTables.Update(svmodel)
				tblTables.Result = db.ExecuteWait(tblTables.query, tblTables.args)
				tblTables.FromJSON
			End If
		Else
			'delete the record
			Dim tblTables As BANanoAlaSQLE
			tblTables.Initialize("tables", "tablename")
			tblTables.AddStrings(Array("tablename", "primarykey", "displayfields"))
			tblTables.Delete(svmodel)
			tblTables.Result = db.ExecuteWait(tblTables.query, tblTables.args)
			tblTables.FromJSON
		End If
		vm.CallMethod("LoadTables")
			
		'explode the controls
		Dim contSQL As BANanoAlaSQLE
			
		For Each item As Map In contents
			Dim ckey As String = item.getdefault("key", "")
			Dim ctitle As String = item.getdefault("title", "")
			Dim ccolcontroltype As String = item.getdefault("colcontroltype", "")
			Dim ccollength As String = item.getdefault("collength", "")
			Dim ccoldatatype As String = item.getdefault("coldatatype", "")
			Dim cicon As String = item.getdefault("icon", "")
			Dim ccolvalue As String = item.getdefault("colvalue", "")
			Dim ccollength As String = item.getdefault("collength", "")
			Dim ccolrequired As String = item.getdefault("colrequired", "")
			Dim ccolvisible As String = item.getdefault("colvisible", "")
			Dim ccolontable As String = item.getdefault("colontable", "")
			Dim ccolforeigntable As String = item.GetDefault("colforeigntable", "")
			Dim ccolforeignkey As String = item.getdefault("colforeignkey", "")
			Dim ccolforeignvalue As String = item.getdefault("colforeignvalue", "")
			Dim ccolislookup As String = item.getdefault("colislookup", "No")
			'
			Dim cid As String = DateTime.now
			cid = BANano.parseint(cid)
			'
			Dim nc As Map = CreateMap()
			nc.put("id", cid)
			nc.put("label", ctitle)
			nc.put("controltype", ccolcontroltype)
			nc.put("parent", diagName & ".Container")
			nc.put("vmodel", ckey)
			nc.put("fieldtype", DataType2FieldType(ccoldatatype))
			nc.put("iconname", cicon)
			nc.put("value", ccolvalue)
			nc.put("sourcetable", ccolforeigntable)
			nc.put("sourcefield", ccolforeignkey)
			nc.put("displayfield", ccolforeignvalue)
			nc.put("colislookup", ccolislookup)
			If ccolislookup = "Yes" Then
				nc.put("useoptions", "No")
			Else
				nc.put("useoptions", "Yes")
			End If
			Dim cavatar As String = ""
			If avatarMap.containskey(ccolcontroltype) Then cavatar = avatarMap.get(ccolcontroltype)
			nc.put("avatar", cavatar)
			nc.put("maxlength", ccollength)
			nc.put("isrequired", ccolrequired)
			nc.put("isvisible", ccolvisible)
			nc.put("ontable", ccolontable)
			nc.put("showlabel", "Yes")
			nc.put("tformat","24hr")
			nc.put("isforinput", "Yes")
			nc.put("minvalue", "0")
			nc.put("maxvalue", "100")
			nc.put("slidervalue", "20")
			nc.put("stepvalue", "1")
			nc.put("truevalue", "Yes")
			nc.put("falsevalue", "No")
			nc.put("isupdatable", "Yes")
			If ccolrequired = "Yes" Then
				serrortext = $"The ${ctitle.tolowercase} is required!"$
				nc.Put("errortext", serrortext)
			End If
			'
			Dim matr As List
			matr.initialize
			matr.AddAll(Array("colrow", "colcolumn", "coloffsetsmall", "coloffsetmedium", "coloffsetlarge"))
			matr.AddAll(Array("coloffsetxlarge", "colsizesmall", "colsizemedium", "colsizelarge", "colsizexlarge"))
			matr.AddAll(Array("colisautofocus","colishidedetails","colisdense"))
			'
			For Each k As String In matr
				Dim v As String = item.GetDefault(k, "")
				Dim nk As String = vm.MidString2(k, 4)
				nc.put(nk, v)
			Next
			'
			Dim crow As String = item.getdefault("colrow","")
			Dim ccol As String = item.getdefault("colcolumn", "")
			crow = BANano.parseint(crow)
			ccol = BANano.parseint(ccol)
			'convert to attributes
			Dim attrJSON As String = BANano.ToJson(nc)
			'create a new record
			Dim nrec As Map = CreateMap()
			nrec.put("controltype", ccolcontroltype)
			nrec.put("id", cid)
			nrec.put("row", crow)
			nrec.put("col", ccol)
			nrec.put("parentid", diagName)
			nrec.put("name", ckey)
			nrec.put("vmodel", ckey)
			nrec.put("attributes", attrJSON)
			nrec.put("label", ctitle)
			nrec.put("icon", cicon)
			nrec.put("avatar", cavatar)
			'
			'we need to search for the component
			contSQL.Initialize("components", "vmodel")
			contSQL.AddIntegers(Array("id", "row","col","tabindex"))
			contSQL.AddStrings(Array("parentid","name","vmodel","attributes","styles","classes", "loose","label", "icon","avatar","items", "controltype"))

			Dim cw As Map = CreateMap()
			cw.put("vmodel", ckey)
			contSQL.SelectWhere(Array("*"), cw, Array("="), Array("id"))
			contSQL.result = db.ExecuteWait(contSQL.query, contSQL.args)
			contSQL.FromJSON
			'if we have zero, add it
			If contSQL.affectedRows = 0 Then
				contSQL.Initialize("components", "id")
				contSQL.AddIntegers(Array("id", "row","col","tabindex"))
				contSQL.AddStrings(Array("parentid","name","vmodel","attributes","styles","classes", "loose","label", "icon","avatar","items", "controltype"))

				contSQL.Insert1(nrec)
				contSQL.Result = db.ExecuteWait(contSQL.query, contSQL.args)
				contSQL.FromJSON
			Else
				'update existing record
				Dim oldrec As Map = contSQL.result.get(0)
				attrJSON = oldrec.get("attributes")
				Dim olda As Map = BANano.fromjson(attrJSON)
				For Each k As String In nc.keys
					Dim v As String = nc.get(k)
					If k <> "id" Then olda.put(k, v)
				Next
				attrJSON = BANano.tojson(olda)
				oldrec.Put("attributes", attrJSON)
				For Each k As String In nrec.keys
					If k = "attributes" Then Continue
					If k = "id" Then Continue
					Dim v As String = nrec.get(k)
					oldrec.put(k, v)
				Next
				contSQL.Initialize("components", "vmodel")
				contSQL.AddIntegers(Array("id", "row","col","tabindex"))
				contSQL.AddStrings(Array("parentid","name","vmodel","attributes","styles","classes", "loose","label", "icon","avatar","items", "controltype"))
				contSQL.Update1(oldrec, ckey)
				contSQL.result = db.ExecuteWait(contSQL.query, contSQL.args)
				contSQL.FromJSON
			End If
		Next
	Else
		vm.setdata("devspace", 0)
	End If
	vm.pageresume
	CreateUX
End Sub

'convert data type to field type
Sub DataType2FieldType(xvalue As String) As String
	xvalue = xvalue.tolowercase	
	xvalue = xvalue.replace("text", "string")
	xvalue = xvalue.replace("float", "dbl")
	xvalue = xvalue.replace("blob", "string")
	xvalue = xvalue.replace("none", "string")
	Return xvalue
End Sub

Sub MapRemovePrefix(m As Map) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In m.keys
		Dim v As String = m.Get(k)
		k = vm.MvField(k,2,"_")
		nm.Put(k, v)
	Next
	Return nm
End Sub

Sub ShowBag(thisBag As String)
	tblProp.setvisible(False)
	thisBag = thisBag.tolowercase
	Dim m As Map = CreateMap()
	For Each strT As String In lstBags
		m.Put(strT, False)
	Next
	If thisBag <> "" Then 
		tblProp.SetVisible(True)
		m.Put(thisBag, True)
	End If
	vm.SetState(m)
End Sub


#Region Menu
Sub PropertyBag_Menu
	vm.setdata("pbmenu", False)
	lstBags.add("pbmenu")
	pbmenu = vm.CreateProperty("ppbmenu", Me)
	pbmenu.SetVShow("pbmenu")
	pbmenu.AddHeading("d","Details")
	pbmenu.AddText("d","id","ID","","")
	pbmenu.AddText("d", "controltype", "Type", "","menu")
	pbmenu.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbmenu.AddText("d","vmodel","ID","","")
	pbmenu.AddRadioGroupH("d", "menutype", "Type", CreateMap("icon":"Icon","btn":"Button"))
	pbmenu.AddText2("d",CreateMap("activator":"Activator", "closedelay":"Close Delay"))
	pbmenu.AddText("d","contentclass","Content Class","","")
	pbmenu.AddText2("d",CreateMap("iconname":"Icon", "label":"Text"))
	pbmenu.AddText2("d", CreateMap("maxheight":"Max Height","maxwidth":"Max Width"))
	pbmenu.AddText2("d", CreateMap("minwidth":"Min Width","nudgewidth":"Nudge Width"))
	pbmenu.AddText2("d", CreateMap("nudgebottom":"Nudge Bottom","nudgetop":"Nudge Top"))
	pbmenu.AddText2("d", CreateMap("nudgeleft":"Nudge Left","nudgeright":"Nudge Right"))
	pbmenu.AddText2("d", CreateMap("opendelay":"Open Delay","origin":"Origin"))
	pbmenu.AddText2("d", CreateMap("positionx":"Position X","positiony":"Position Y"))
	pbmenu.AddText("d","returnvalue","Return Value","","")
	pbmenu.AddSelect("d","transition","Transition",vm.Transition)
	pbmenu.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbmenu.AddHeading("a", "Items")
	pbmenu.AddMenuItems("a")
	'
	'
	pbmenu.AddHeading("m","Margins & Padding")
	pbmenu.AddMarginsPaddings("m")
	
	pbmenu.AddHeading("e","Settings")
	pbmenu.AddSwitches("e", CreateMap("isdivider":"Divide Each"))
	pbmenu.AddSwitches("e", CreateMap("isabsolute": "Absolute", "isallowoverflow": "AllowOverflow"))
	pbmenu.AddSwitches("e", CreateMap("isauto": "Auto", "isbottom": "Bottom"))
	pbmenu.AddSwitches("e", CreateMap("iscloseonclick": "CloseOn Click", "iscloseoncontentclick": "CloseOnContentClick"))
	pbmenu.AddSwitches("e", CreateMap("isdark": "Dark", "isdisablekeys": "DisableKeys"))
	pbmenu.AddSwitches("e", CreateMap("isdisabled": "Disabled", "iseager": "Eager"))
	pbmenu.AddSwitches("e", CreateMap("isfixed": "Fixed", "isinternalactivator": "InternalActivator"))
	pbmenu.AddSwitches("e", CreateMap("isleft": "Left", "islight": "Light"))
	pbmenu.AddSwitches("e", CreateMap("isoffsetoverflow": "OffsetOverflow", "isoffsetx": "OffsetX"))
	pbmenu.AddSwitches("e", CreateMap("isoffsety": "OffsetY", "isopenonclick": "OpenOnClick"))
	pbmenu.AddSwitches("e", CreateMap("isopenonhover": "OpenOnHover", "isright": "Right"))
	pbmenu.AddSwitches("e", CreateMap("isslotactivator": "SlotActivator", "istop": "Top"))
	pbmenu.AddHeading("f","Matrix")
	pbmenu.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbmenu.tostring)
End Sub
#End Region

#Region Drawer
Sub PropertyBag_Drawer
	vm.setdata("pbdrawer", False)
	lstBags.add("pbdrawer")
	pbdrawer = vm.CreateProperty("ppbdrawer", Me)
	pbdrawer.SetVShow("pbdrawer")
	pbdrawer.AddHeading("d","Details")
	pbdrawer.AddText("d","id","ID","","")
	pbdrawer.AddText("d", "controltype", "Type", "","drawer")
	pbdrawer.AddText("d","vmodel","VModel","","")
	pbdrawer.AddText("d","mtitle","Title","","")
	pbdrawer.AddText("d","msubtitle","Sub Title","","")
	pbdrawer.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
	pbdrawer.AddText2("d",CreateMap("minivariantwidth":"MiniVariantWidth","mobilebreakpoint":"MobileBreakPoint"))
	pbdrawer.AddSelect("d","overlaycolor","OverlayColor",vm.ColorOptions)
	pbdrawer.AddText2("d",CreateMap("overlayopacity":"OverlayOpacity","tag":"Tag"))
	pbdrawer.AddText("d","src","Src","","")
	pbdrawer.AddText2("d", CreateMap("width":"Width","height":"Height"))
	pbdrawer.AddSelect("d","float", "Float", vm.Floats)
	
	
	pbdrawer.AddHeading("s", "Data Source")
	pbdrawer.AddText("s","datasource","Data Source","","")
	pbdrawer.AddText2("s",CreateMap("keyfld":"Key Fld", "avatarfld":"Avatar Fld"))
	pbdrawer.AddText2("s",CreateMap("iconfld":"Icon Fld", "iconcolorfld":"Icon Color Fld"))
	pbdrawer.AddText2("s",CreateMap("titlefld":"Title Fld", "subtitlefld":"Subtitle 1 Fld"))
	pbdrawer.AddText2("s",CreateMap("subtitle1fld":"Subtitle 2 Fld", "actioniconfld":"Action Icon Fld"))
	pbdrawer.AddText2("s",CreateMap("actioniconcolorfld":"Action Icon Color Fld"))
	'
	pbdrawer.AddHeading("a", "Items")
	pbdrawer.AddMenuItems("a")
	'
	'
	pbdrawer.AddHeading("m","Margins & Padding")
	pbdrawer.AddMarginsPaddings("m")
	
	pbdrawer.AddHeading("e","Settings")
	pbdrawer.AddSwitches("e", CreateMap("ismasterdrawer": "Master Drawer", "useoptions": "Use Items"))
	pbdrawer.AddSwitches("e", CreateMap("isdivider":"Divide Each", "isinset":"Inset Divider"))
	pbdrawer.AddSwitches("e", CreateMap("isapp": "App", "isright": "Right"))
	pbdrawer.AddSwitches("e", CreateMap("isabsolute": "Absolute", "isdark": "Dark"))
	pbdrawer.AddSwitches("e", CreateMap("isbottom": "Bottom", "isclipped": "Clipped"))
	pbdrawer.AddSwitches("e", CreateMap("isdisableresizewatcher": "DisableResizeWatcher"))
	pbdrawer.AddSwitches("e", CreateMap("isdisableroutewatcher": "DisableRouteWatcher"))
	pbdrawer.AddSwitches("e", CreateMap("isfixed": "Fixed", "isfloating":"Floating"))
	pbdrawer.AddSwitches("e", CreateMap("ishideoverlay": "HideOverlay", "islight": "Light"))
	pbdrawer.AddSwitches("e", CreateMap("isminivariant": "MiniVariant", "isexpandonhover": "ExpandOnHover"))
	pbdrawer.AddSwitches("e", CreateMap("ispermanent": "Permanent"))
	pbdrawer.AddSwitches("e", CreateMap("isstateless": "Stateless", "istemporary": "Temporary"))
	pbdrawer.AddSwitches("e", CreateMap("istouchless": "Touchless", "isvisible": "Visible"))
	
	pbdrawer.AddHeading("f","Matrix")
	pbdrawer.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbdrawer.tostring)
End Sub
#End Region

#Region Carousel
Sub PropertyBag_Carousel
	vm.setdata("pbcarousel", False)
	lstBags.add("pbcarousel")
	pbcarousel = vm.CreateProperty("ppbcarousel", Me)
	pbcarousel.SetVShow("pbcarousel")
	pbcarousel.AddHeading("d","Details")
	pbcarousel.AddText("d","id","ID","","")
	pbcarousel.AddText("d", "controltype", "Type", "","carousel")
	pbcarousel.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbcarousel.AddText("d","vmodel","ID","","")
	pbcarousel.AddText("d","activeclass","ActiveClass","","")
	pbcarousel.AddText("d","delimitericon","DelimiterIcon","","")
	pbcarousel.AddText2("d", CreateMap("height":"Height", "interval":"Interval"))
	pbcarousel.AddText("d","mmax","Max","","")
	pbcarousel.AddSelect2("d","progresscolor","Progress Color", vm.ColorOptions, "progresscolorintensity","Progress Color Intensity", vm.IntensityOptions)
	pbcarousel.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbcarousel.AddHeading("i", "Items")
	pbcarousel.AddCarouselItems("i")
	'
	pbcarousel.AddHeading("m","Margins & Padding")
	pbcarousel.AddMarginsPaddings("m")
	'
	pbcarousel.AddHeading("e","Settings")
	pbcarousel.AddSwitches("e", CreateMap("iscontinuous": "Continuous", "iscycle": "Cycle"))
	pbcarousel.AddSwitches("e", CreateMap("isdark": "Dark"))
	pbcarousel.AddSwitches("e", CreateMap("ishidedelimiterbackground": "HideDelimiterBackground"))
	pbcarousel.AddSwitches("e", CreateMap("ishidedelimiters": "HideDelimiters", "islight": "Light"))
	pbcarousel.AddSwitches("e", CreateMap("ismandatory": "Mandatory"))
	pbcarousel.AddSwitches("e", CreateMap("isnexticon": "NextIcon", "isprevicon": "PrevIcon"))
	pbcarousel.AddSwitches("e", CreateMap("isprogress": "Progress", "isreverse": "Reverse"))
	pbcarousel.AddSwitches("e", CreateMap("isshowarrows": "ShowArrows"))
	pbcarousel.AddSwitches("e", CreateMap("isshowarrowsonhover": "ShowArrowsOnHover"))
	pbcarousel.AddSwitches("e", CreateMap("istouchless": "Touchless", "isvertical": "Vertical"))
	pbcarousel.AddSwitches("e", CreateMap("isvisible": "Visible"))
	'
	pbcarousel.AddHeading("f","Matrix")
	pbcarousel.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbcarousel.tostring)
End Sub
#End Region

#Region Dialog
Sub PropertyBag_Dialog
	Dim ops As Map = CreateMap("add":"Create Record", "read":"Read Record", "save":"Update Record","delete":"Delete Record", "contactus":"Contact Us", "sendcredentials":"User Credentials", "showfs":"Show File Select", "":"None")
	vm.setdata("pbdialog", False)
	lstBags.add("pbdialog")
	pbdialog = vm.CreateProperty("ppbdialog", Me)
	pbdialog.SetVShow("pbdialog")
	pbdialog.AddHeading("d","Details")
	pbdialog.AddText("d","id","ID","","")
	pbdialog.AddText("d", "controltype", "Type", "","dialog")
	pbdialog.AddText("d","vmodel","ID","","")
	pbdialog.AddText("d","label","Title","","")
	pbdialog.AddText2("d",CreateMap("okid":"Ok ID","okcaption":"Ok Caption"))
	pbdialog.AddText2("d",CreateMap("cancelid":"Cancel ID", "cancelcaption":"Cancel Caption"))
	pbdialog.AddText2("d",CreateMap("tablename":"Data Source", "primarykey":"Primary Key"))
	pbdialog.AddSwitches("d", CreateMap("isautoincrement": "Auto Increment"))
	pbdialog.AddSelect("d","clickaction", "On Click Action", ops)
	pbdialog.AddText("d","activator","Activator","","")
	pbdialog.AddText("d","contentclass","ContentClass","","")
	pbdialog.AddText("d","origin","Origin","","")
	pbdialog.AddSelect2("d","overlaycolor","OverlayColor", vm.ColorOptions, "overlaycolorintensity","OverlayColor Intensity", vm.IntensityOptions)
	pbdialog.AddText("d","overlayopacity","OverlayOpacity","","")
	pbdialog.AddSelect("d","transition","Transition",vm.Transition)
	pbdialog.AddText2("d",CreateMap("width":"Width","maxwidth":"MaxWidth"))
	'
	pbdialog.AddHeading("e","Settings")
	pbdialog.AddSwitches("e", CreateMap("islight": "Light", "isshowonopen":"Show on Open"))
	pbdialog.AddSwitches("e", CreateMap("isattach": "Attach", "isbackdrop": "Backdrop"))
	pbdialog.AddSwitches("e", CreateMap("isdark": "Dark", "isdisabled": "Disabled"))
	pbdialog.AddSwitches("e", CreateMap("iseager": "Eager", "isfullscreen": "Fullscreen"))
	pbdialog.AddSwitches("e", CreateMap("ishideoverlay": "HideOverlay", "isinternalactivator": "InternalActivator"))
	pbdialog.AddSwitches("e", CreateMap("isnoclickanimation": "NoClickAnimation", "isopenonhover": "OpenOnHover"))
	pbdialog.AddSwitches("e", CreateMap("ispersistent": "Persistent", "isretainfocus": "RetainFocus"))
	pbdialog.AddSwitches("e", CreateMap("isscrollable": "Scrollable", "isslotactivator": "SlotActivator"))
	pbdialog.AddSwitches("e", CreateMap("istitleprimary": "TitlePrimary", "isvisible": "Visible"))
	'
	pbdialog.AddHeading("f","Matrix")
	pbdialog.AddMatrix("f")
	'
	vm.container.AddComponent(1, 3, pbdialog.tostring)
	
	
End Sub
#End Region

Sub Read_Dialog
	sactivator = mattr.getdefault("activator", "")
	scontentclass = mattr.getdefault("contentclass", "")
	sheight = mattr.getdefault("height", "")
	smaxwidth = mattr.getdefault("maxwidth", "")
	sorigin = mattr.getdefault("origin", "")
	soverlaycolor = mattr.getdefault("overlaycolor", "")
	soverlaycolorintensity = mattr.getdefault("overlaycolorintensity", "")
	soverlayopacity = mattr.getdefault("overlayopacity", "")
	stransition = mattr.getdefault("transition", "")
	swidth = mattr.getdefault("width", "")
	sCancelid = mattr.getdefault("cancelid", "")
	sCancelcaption = mattr.getdefault("cancelcaption", "")
	sOkid = mattr.getdefault("okid", "")
	sOkcaption = mattr.getdefault("okcaption", "")
	stablename = mattr.getdefault("tablename", "")
	sprimarykey = mattr.getdefault("primarykey", "")
	sclickaction = mattr.getdefault("clickaction", "")
	'
	bisautoincrement = YesNoToBoolean(mattr.getdefault("isautoincrement", "No"))
	bisattach = YesNoToBoolean(mattr.getdefault("isattach", "No"))
	bisbackdrop = YesNoToBoolean(mattr.getdefault("isbackdrop", "No"))
	bisshowonopen = YesNoToBoolean(mattr.getdefault("isshowonopen", "No"))
	bisDisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
	biseager = YesNoToBoolean(mattr.getdefault("iseager", "No"))
	bisfullscreen = YesNoToBoolean(mattr.getdefault("isfullscreen", "No"))
	bishideoverlay = YesNoToBoolean(mattr.getdefault("ishideoverlay", "No"))
	bisinternalactivator = YesNoToBoolean(mattr.getdefault("isinternalactivator", "No"))
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	bisnoclickanimation = YesNoToBoolean(mattr.getdefault("isnoclickanimation", "No"))
	bisopenonhover = YesNoToBoolean(mattr.getdefault("isopenonhover", "No"))
	bispersistent = YesNoToBoolean(mattr.getdefault("ispersistent", "No"))
	bisretainfocus = YesNoToBoolean(mattr.getdefault("isretainfocus", "No"))
	bisscrollable = YesNoToBoolean(mattr.getdefault("isscrollable", "No"))
	bisslotactivator = YesNoToBoolean(mattr.getdefault("isslotactivator", "No"))
	bistitleprimary = YesNoToBoolean(mattr.getdefault("istitleprimary", "No"))
End Sub

Sub LoremIpsum(count As Int) As String
	Dim str As String = $"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."$
	Dim sb As StringBuilder
	sb.Initialize
	For i = 1 To count
		sb.Append(str)
		If i < count Then
			sb.Append("{BR}").Append("{BR}")
		End If
	Next
	Return sb.tostring
End Sub

#Region SpeedDial
Sub PropertyBag_SpeedDial
	vm.setdata("pbspeeddial", False)
	lstBags.add("pbspeeddial")
	pbspeeddial = vm.CreateProperty("ppbspeeddial", Me)
	pbspeeddial.SetVShow("pbspeeddial")
	pbspeeddial.AddHeading("d","Details")
	pbspeeddial.AddText("d","id","ID","","")
	pbspeeddial.AddText("d", "controltype", "Type", "","speeddial")
	pbspeeddial.AddText2("d",CreateMap("vmodel":"VModel","mastericon":"Master Icon"))
	pbspeeddial.AddText2("d",CreateMap("initialicon":"Initial Icon","finalicon":"Final Icon"))
	pbspeeddial.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Color Intensity", vm.IntensityOptions)
	pbspeeddial.AddSelect2("d","textcolor","Text Color", vm.ColorOptions, "textintensity","Text Color Intensity", vm.IntensityOptions)
	pbspeeddial.AddSelect("d","direction","Direction",vm.Direction)
	pbspeeddial.AddText("d","href","Href","","")
	pbspeeddial.AddText("d","to","To","","")
	pbspeeddial.AddText("d","mode","Mode","","")
	pbspeeddial.AddText("d","origin","Origin","","")
	pbspeeddial.AddSelect2("d","target","Target", vm.TargetOptions, "transition","Transition",vm.Transition)
	pbspeeddial.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbspeeddial.AddHeading("a", "Items")
	pbspeeddial.AddCrudList("a", CreateMap("key":"Item Key", "title":"Title", "icon":"Icon", "iconcolor":"Icon Color"))
	'
	pbspeeddial.AddHeading("m","Margins & Padding")
	pbspeeddial.AddMarginsPaddings("m")
	
	pbspeeddial.AddHeading("e","Settings")
	pbspeeddial.AddSwitches("e", CreateMap("isopenonhover": "OpenOnHover","ismainclick":"Trap Click"))
	pbspeeddial.AddSwitches("e", CreateMap("istop": "Top", "isbottom": "Bottom"))
	pbspeeddial.AddSwitches("e", CreateMap("isleft": "Left", "isright": "Right"))	
	pbspeeddial.AddSwitches("e", CreateMap("isabsolute": "Absolute", "isvisible": "Visible"))
	pbspeeddial.AddSwitches("e", CreateMap("isdark": "Dark", "isfixed": "Fixed"))
	pbspeeddial.AddSwitches("e", CreateMap("issmall": "Small", "islarge": "Large"))
	pbspeeddial.AddSwitches("e", CreateMap("isxsmall": "XSmall", "isxlarge": "XLarge"))
	'
	pbspeeddial.AddHeading("f","Matrix")
	pbspeeddial.AddMatrix("f")
	'
	vm.container.AddComponent(1, 3, pbspeeddial.tostring)
End Sub
#End Region

Sub Read_SpeedDial
bisabsolute = YesNoToBoolean(mattr.getdefault("isabsolute", "No"))
bisbottom = YesNoToBoolean(mattr.getdefault("isbottom", "No"))
sColor = mattr.getdefault("color", "")
	smastericon = mattr.getdefault("mastericon","")
sintensity = mattr.getdefault("intensity", "")
sDirection = mattr.getdefault("direction", "")
sFinalicon = mattr.getdefault("finalicon", "")
bisfixed = YesNoToBoolean(mattr.getdefault("isfixed", "No"))
shref = mattr.getdefault("href", "")
sInitialicon = mattr.getdefault("initialicon", "")
bisLarge = YesNoToBoolean(mattr.getdefault("islarge", "No"))
bisleft = YesNoToBoolean(mattr.getdefault("isleft", "No"))
sMode = mattr.getdefault("mode", "")
bisopenonhover = YesNoToBoolean(mattr.getdefault("isopenonhover", "No"))
sorigin = mattr.getdefault("origin", "")
bisright = YesNoToBoolean(mattr.getdefault("isright", "No"))
bisSmall = YesNoToBoolean(mattr.getdefault("issmall", "No"))
stabindex = mattr.getdefault("tabindex", "")
starget = mattr.getdefault("target", "")
stextcolor = mattr.getdefault("textcolor", "")
stextintensity = mattr.getdefault("textintensity", "")
sTo = mattr.getdefault("to", "")
bistop = YesNoToBoolean(mattr.getdefault("istop", "No"))
stransition = mattr.getdefault("transition", "")
bisXlarge = YesNoToBoolean(mattr.getdefault("isxlarge", "No"))
	bisXsmall = YesNoToBoolean(mattr.getdefault("isxsmall", "No"))
	bismainclick = YesNoToBoolean(mattr.getdefault("ismainclick", "No"))
End Sub

#Region Rating
Sub PropertyBag_Rating
	vm.setdata("pbrating", False)
	lstBags.add("pbrating")
	pbrating = vm.CreateProperty("ppbrating", Me)
	pbrating.SetVShow("pbrating")
	pbrating.AddHeading("d","Details")
	pbrating.AddText("d","id","ID","","")
	pbrating.AddText("d", "controltype", "Type", "","rating")
	pbrating.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbrating.AddText("d","vmodel","VModel","","")
	pbrating.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbrating.AddText2("d",CreateMap("value":"Value", "length":"Length"))
	pbrating.AddText2("d",CreateMap("opendelay":"OpenDelay", "size":"Size"))
	pbrating.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Color Intensity", vm.IntensityOptions)
	pbrating.AddSelect2("d","backgroundcolor","Background Color", vm.ColorOptions, "backgroundintensity","Background Color Intensity", vm.IntensityOptions)
	pbrating.AddText("d","closedelay","Close Delay","","0")
	pbrating.AddText("d","emptyicon","Empty Icon","","")
	pbrating.AddText("d","fullicon","Full Icon","","")
	pbrating.AddText("d","halficon","Half Icon","","")
	pbrating.AddText("d","tabindex","Tab Index","","")
	pbrating.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbrating.AddHeading("m","Margins & Padding")
	pbrating.AddMarginsPaddings("m")
	'
	pbrating.AddHeading("e","Settings")
	pbrating.AddSwitches("e", CreateMap("isdark": "Dark", "islight": "Light"))
	pbrating.AddSwitches("e", CreateMap("isdense": "Dense", "ishalfincrements": "HalfIncrements"))
	pbrating.AddSwitches("e", CreateMap("ishover": "Hover", "islarge": "Large"))
	pbrating.AddSwitches("e", CreateMap("isreadonly": "Readonly", "isvisible": "Visible"))
	pbrating.AddSwitches("e", CreateMap("isripple": "Ripple", "issmall": "Small"))
	pbrating.AddSwitches("e", CreateMap("isxsmall": "XSmall","isxlarge": "XLarge"))
	'
	pbrating.AddHeading("f","Matrix")
	pbrating.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbrating.tostring)
End Sub
#End Region


Sub Read_Rating
	sBackgroundcolor = mattr.getdefault("backgroundcolor", "")
	sBackgroundintensity = mattr.getdefault("backgroundintensity", "")
	bisClearable = YesNoToBoolean(mattr.getdefault("isclearable", "No"))
	sclosedelay = mattr.getdefault("closedelay", "")
	sColor = mattr.getdefault("color", "")
	sintensity = mattr.getdefault("intensity", "")
	bisdense = YesNoToBoolean(mattr.getdefault("isdense", "No"))
	sEmptyicon = mattr.getdefault("emptyicon", "")
	sFullicon = mattr.getdefault("fullicon", "")
	sHalficon = mattr.getdefault("halficon", "")
	bisHalfincrements = YesNoToBoolean(mattr.getdefault("ishalfincrements", "No"))
	bisHover = YesNoToBoolean(mattr.getdefault("ishover", "No"))
	bisLarge = YesNoToBoolean(mattr.getdefault("islarge", "No"))
	sLength = mattr.getdefault("length", "")
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	sopendelay = mattr.getdefault("opendelay", "")
	bisRipple = YesNoToBoolean(mattr.getdefault("isripple", "No"))
	ssize = mattr.getdefault("size", "")
	bisSmall = YesNoToBoolean(mattr.getdefault("issmall", "No"))
	stabindex = mattr.getdefault("tabindex", "")
	bisVisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
	bisXlarge = YesNoToBoolean(mattr.getdefault("isxlarge", "No"))
	bisXsmall = YesNoToBoolean(mattr.getdefault("isxsmall", "No"))
End Sub

Sub Design_Rating
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	Dim rating As VMRating = ui.CreateRating("rating" & sname, Me)
	rating.SetStatic(True)
	rating.SetValue(svalue)
	rating.SetFieldType(sfieldtype)
	rating.SetClosedelay(sclosedelay)
	rating.SetDark(bisdark)
	rating.SetDense(bisdense)
	rating.SetEmptyicon(sEmptyicon)
	rating.SetFullicon(sFullicon)
	rating.SetHalficon(sHalficon)
	rating.SetHalfincrements(bisHalfincrements)
	rating.SetHover(bisHover)
	rating.SetLarge(bisLarge)
	rating.SetLength(sLength)
	rating.SetLight(bislight)
	rating.SetOpendelay(sopendelay)
	rating.SetReadonly(bisreadonly)
	rating.SetRipple(bisRipple)
	rating.SetSize(ssize)
	rating.SetSmall(bisSmall)
	rating.SetTabindex(stabindex)
	rating.SetVisible(bisVisible)
	rating.SetXlarge(bisXlarge)
	rating.SetXsmall(bisXsmall)
	rating.SetBackgroundColorIntensity(sBackgroundcolor, sBackgroundintensity)
	rating.SetColorIntensity(sColor, sintensity)
	If smargintop <> "" Then rating.AddClass("mt-" & smargintop)
If smarginbottom <> "" Then rating.AddClass("mb-" & smarginbottom)
If smarginleft <> "" Then rating.AddClass("ml-" & smarginleft)
If smarginright <> "" Then rating.AddClass("mr-" & smarginright)
If smargins <> "" Then rating.AddClass("ms-" & smargins)
If smargine <> "" Then rating.AddClass("me-" & smargine)
If smarginx <> "" Then rating.AddClass("mx-" & smarginx)
If smarginy <> "" Then rating.AddClass("my-" & smarginy)
If smargina <> "" Then rating.AddClass("ma-" & smargina)
If spaddingtop <> "" Then rating.AddClass("pt-" & spaddingtop)
If spaddingbottom <> "" Then rating.AddClass("pb-" & spaddingbottom)
If spaddingleft <> "" Then rating.AddClass("pl-" & spaddingleft)
If spaddingright <> "" Then rating.AddClass("pr-" & spaddingright)
If spaddings <> "" Then rating.AddClass("ps-" & spaddings)
If spaddinge <> "" Then rating.AddClass("pe-" & spaddinge)
If spaddingx <> "" Then rating.AddClass("px-" & spaddingx)
If spaddingy <> "" Then rating.AddClass("py-" & spaddingy)
If spaddinga <> "" Then rating.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		rating.Addclass(sfloat)
	End If
	'
	ui.AddControl(rating.Rating, rating.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim rat${sname} As VMRating = vm.CreateRating("rat${sname}", Me)"$).append(CRLF)
	CodeLine(sb, bisreadonly, "b", "rat", sname, "SetReadonly")
	CodeLine(sb, bisDisabled, "b", "rat", sname, "SetDisabled")
	CodeLine(sb, svalue, "s", "rat", sname, "SetValue")
	CodeLine(sb, sfieldtype, "s", "rat", sname, "SetFieldType")
	CodeLine(sb, sclosedelay, "s", "rat", sname, "SetClosedelay")
	CodeLine(sb, bisdark, "b", "rat", sname, "SetDark")
	CodeLine(sb, bisdense, "b", "rat", sname, "SetDense")
	If sfloat <> "" Then
		AddCode(sb, $"rat${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, sEmptyicon, "s", "rat", sname, "SetEmptyicon")
	CodeLine(sb, sFullicon, "s", "rat", sname, "SetFullicon")
	CodeLine(sb, sHalficon, "s", "rat", sname, "SetHalficon")
	CodeLine(sb, bisHalfincrements, "b", "rat", sname, "SetHalfincrements")
	CodeLine(sb, bisHover, "b", "rat", sname, "SetHover")
	CodeLine(sb, bisLarge, "b", "rat", sname, "SetLarge")
	CodeLine(sb, sLength, "s", "rat", sname, "SetLength")
	CodeLine(sb, bislight, "b", "rat", sname, "SetLight")
	CodeLine(sb, sopendelay, "s", "rat", sname, "SetOpendelay")
	CodeLine(sb, bisreadonly, "b", "rat", sname, "SetReadonly")
	CodeLine(sb, bisRipple, "b", "rat", sname, "SetRipple")
	CodeLine(sb, ssize, "s", "rat", sname, "SetSize")
	CodeLine(sb, bisSmall, "b", "rat", sname, "SetSmall")
	CodeLine(sb, stabindex, "s", "rat", sname, "SetTabindex")
	CodeLine(sb, bisVisible, "b", "rat", sname, "SetVisible")
	CodeLine(sb, bisXlarge, "b", "rat", sname, "SetXlarge")
	CodeLine(sb, bisXsmall, "b", "rat", sname, "SetXsmall")
	'
	Dim pres As String = "rat"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	CodeLine2(sb, sColor, sintensity, "b", "rat", sname, "SetColorIntensity")
	CodeLine2(sb, sBackgroundcolor, sBackgroundintensity, "b", "rat", sname, "SetBackgroundColorIntensity")
	AddCode(sb, $"Rating${sname}.SetOnInput(Me, "Rating${sname}_input")"$)
	sb.append($"${sparent}.AddControl(rat${sname}.Rating, rat${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub rat${sname}_input(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)

End Sub

#Region Table
Sub PropertyBag_Table
	vm.setdata("pbtable", False)
	lstBags.add("pbtable")
	pbtable = vm.CreateProperty("ppbtable", Me)
	pbtable.SetVShow("pbtable")
	pbtable.AddHeading("d","Details")
	pbtable.AddText("d","id","ID","","")
	pbtable.AddText("d", "controltype", "Type", "","table")
	pbtable.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbtable.AddText("d","vmodel","Table Name","","")
	pbtable.AddText("d","label","Title","","")
	pbtable.AddText("d","caption","Caption","","")
	pbtable.AddText2("d",CreateMap("singular":"Single Record", "manyrecords":"Many Records"))
	pbtable.AddText2("d",CreateMap("datasourcename":"Data Source", "itemkey":"Item Key"))
	pbtable.AddText2("d", CreateMap("displayfield":"Item Text","confirmfield":"Delete Field"))
	pbtable.AddSwitches("d", CreateMap("islookup": "Look Up Table"))
	'pbtable.AddRadioGroupH("d","selecttype","Select Type",CreateMap("all":"All","where":"Where"))
	'pbtable.AddText("d","selectfields","Select Fields","","")
	'pbtable.AddText("d","sortfields","Sort Fields","","")
	pbtable.AddText2("d", CreateMap("newid":"New ID","newicon":"New Icon"))
	pbtable.AddText("d","newtooltip", "New Tooltip","","")
	'pbtable.AddText("d","expandicon","Expand Icon","","")
	'pbtable.AddText("d","expanded","Expanded","","")
	'pbtable.AddText("d","filters","Filters","","")
	'pbtable.AddText("d","sortby","Sort By","","")
	'pbtable.AddText("d","sortdesc","Sort Desc","","")
	'pbtable.AddText("d","groupby","Group By","","")
	'pbtable.AddText("d","groupdesc","Group Desc","","")
	'pbtable.AddText("d","headerslength","Headers Length","","")
	pbtable.AddText2("d",CreateMap("height":"Height","mobilebreakpoint":"Mobile Breakpoint"))
	pbtable.AddText2("d",CreateMap("page":"Page","itemsperpage":"Items Per Page"))
	pbtable.AddSelect("d","float", "Float", vm.Floats)
	
	'pbtable.AddText("d","loadingtext","Loading Text","","")
	'pbtable.AddText("d","locale","Locale","","")
	'pbtable.AddText("d","nodatatext","No Data Text","","")
	'pbtable.AddText("d","noresultstext","No Results Text","","")
	'pbtable.AddText("d","search","Search","","")
	'pbtable.AddText("d","selectablekey","Selectable Key","","")
	'pbtable.AddText("d","serveritemslength","Server Items Length","","")
	'
	pbtable.AddHeading("p", "Page")
	pbtable.AddText("p","iconname","Icon Name","","")
	pbtable.AddText("p","tooltip","Tooltip","","")
	pbtable.AddSelect2("p","iconcolor","Icon Color", vm.ColorOptions, "iconcolorintensity","IconColor Intensity", vm.IntensityOptions)
	pbtable.AddTextArea("p","description","Description","","")
	pbtable.AddTextArea("p","keywords","KeyWords","","")
	'
	pbtable.AddSwitches("p", CreateMap("isnavbarvisible": "NavBarVisible", "isdrawervisible": "DrawerVisible"))
	pbtable.AddSwitches("p", CreateMap("ishamburgervisible": "HamburgerVisible", "islogovisible": "LogoVisible"))
	pbtable.AddSwitches("p", CreateMap("isshowondrawer": "ShowOnDrawer", "isshowonnavbar": "ShowOnNavBar"))
	pbtable.AddSwitches("p", CreateMap("isupdatenavtitle": "UpdateNavTitle","isdivider":"AddDivider"))
	pbtable.AddSwitches("p", CreateMap("isinsetdivider": "Inset Divider","isicon":"NavIcon"))
	'
	pbtable.AddHeading("c", "Columns")
	pbtable.AddDataTableColumns("c")
	'
	pbtable.AddHeading("m","Margins & Padding")
	pbtable.AddMarginsPaddings("m")
	'
	pbtable.AddHeading("e","Settings")
	pbtable.AddSwitches("e", CreateMap("isautoincrement": "Auto Increment", "isaddnew":"Add New"))
	pbtable.AddSwitches("e", CreateMap("isedit": "Edit", "isdelete":"Delete"))
	pbtable.AddSwitches("e", CreateMap("isdownload": "Download", "isclone":"Clone"))
	pbtable.AddSwitches("e", CreateMap("isprint": "Print", "ismenu":"Menu"))
	pbtable.AddSwitches("e", CreateMap("issearchbox": "Search","isdialog": "Dialog"))
	
	pbtable.AddSwitches("e", CreateMap("iscalculatewidths": "CalculateWidths", "isdark": "Dark"))
	pbtable.AddSwitches("e", CreateMap("isdense": "Dense", "isdisablefiltering": "DisableFiltering"))
	pbtable.AddSwitches("e", CreateMap("isdisablepagination": "DisablePagination", "isdisablesort": "DisableSort"))
	pbtable.AddSwitches("e", CreateMap("isfixedheader": "FixedHeader", "ishidedefaultfooter": "HideDefaultFooter"))
	pbtable.AddSwitches("e", CreateMap("ishidedefaultheader": "HideDefaultHeader", "islight": "Light"))
	pbtable.AddSwitches("e", CreateMap("isloading": "Loading", "ismultisort": "MultiSort"))
	pbtable.AddSwitches("e", CreateMap("ismustsort": "MustSort", "isshowexpand": "ShowExpand"))
	pbtable.AddSwitches("e", CreateMap("isshowgroupby": "ShowGroupBy", "isshowselect": "ShowSelect"))
	pbtable.AddSwitches("e", CreateMap("issingleexpand": "SingleExpand", "issingleselect": "SingleSelect"))
	pbtable.AddSwitches("e", CreateMap("isvisible":"Visible"))
	'
	pbtable.AddHeading("f","Matrix")
	pbtable.AddMatrix("f")
	'
	vm.container.AddComponent(1, 3, pbtable.tostring)
End Sub
#End Region

Sub Read_Table
	stooltip = mattr.GetDefault("tooltip", "")
	sDescription = mattr.getdefault("description", "")
	bisDrawervisible = YesNoToBoolean(mattr.getdefault("isdrawervisible", "No"))
	bisHamburgervisible = YesNoToBoolean(mattr.getdefault("ishamburgervisible", "No"))
	sIconcolor = mattr.getdefault("iconcolor", "")
	sIconcolorintensity = mattr.getdefault("iconcolorintensity", "")
	siconname = mattr.getdefault("iconname", "")
	sKeywords = mattr.getdefault("keywords", "")
	bislogovisible = YesNoToBoolean(mattr.getdefault("islogovisible", "No"))
	bisNavbarvisible = YesNoToBoolean(mattr.getdefault("isnavbarvisible", "No"))
	spagetitle = mattr.getdefault("pagetitle", "")
	bisShowondrawer = YesNoToBoolean(mattr.getdefault("isshowondrawer", "No"))
	bisShowonnavbar = YesNoToBoolean(mattr.getdefault("isshowonnavbar", "No"))
	bisUpdatenavtitle = YesNoToBoolean(mattr.getdefault("isupdatenavtitle", "No"))
	bisdivider = YesNoToBoolean(mattr.getdefault("isdivider", "No"))
	bisinsetdivider = YesNoToBoolean(mattr.getdefault("isinsetdivider", "No"))
	bisicon = YesNoToBoolean(mattr.getdefault("isicon", "No"))
	'
	bisautoincrement = YesNoToBoolean(mattr.getdefault("isautoincrement", "No"))
	bisaddnew = YesNoToBoolean(mattr.getdefault("isaddnew", "No"))
	bisDelete = YesNoToBoolean(mattr.getdefault("isdelete", "No"))
	bisClone = YesNoToBoolean(mattr.getdefault("isclone", "No"))
	bisDownload = YesNoToBoolean(mattr.getdefault("isdownload", "No"))
	bisEdit = YesNoToBoolean(mattr.getdefault("isedit", "No"))
	bisMenu = YesNoToBoolean(mattr.getdefault("ismenu", "No"))
	bisPrint = YesNoToBoolean(mattr.getdefault("isprint", "No"))
	bisSearchbox = YesNoToBoolean(mattr.getdefault("issearchbox", "No"))
	bisdialog = YesNoToBoolean(mattr.getdefault("isdialog", "No"))
	sSelectfields = mattr.getdefault("selectfields", "")
	sSelectfields = sSelectfields.tolowercase
	sSelecttype = mattr.getdefault("selecttype", "")
	sSortfields = mattr.getdefault("sortfields", "")
	sSortfields = sSortfields.tolowercase
	snewid = mattr.getdefault("newid", "")
	snewicon = mattr.getdefault("newicon", "")
	snewtooltip = mattr.getdefault("newtooltip", "")

	'
	bisCalculatewidths = YesNoToBoolean(mattr.getdefault("iscalculatewidths", "No"))
	sCaption = mattr.getdefault("caption", "")
	sDatasourcename = mattr.getdefault("datasourcename", "")
	bisdense = YesNoToBoolean(mattr.getdefault("isdense", "No"))
	bisDisablefiltering = YesNoToBoolean(mattr.getdefault("isdisablefiltering", "No"))
	bisDisablepagination = YesNoToBoolean(mattr.getdefault("isdisablepagination", "No"))
	bisDisablesort = YesNoToBoolean(mattr.getdefault("isdisablesort", "No"))
	'sExpandicon = mattr.getdefault("expandicon", "")
	'sExpanded = mattr.getdefault("expanded", "")
	'sFilters = mattr.getdefault("filters", "")
	bisFixedheader = YesNoToBoolean(mattr.getdefault("isfixedheader", "No"))
	'sGroupby = mattr.getdefault("groupby", "")
	'sGroupdesc = mattr.getdefault("groupdesc", "")
	'sHeaderslength = mattr.getdefault("headerslength", "")
	sheight = mattr.getdefault("height", "")
	bisHidedefaultfooter = YesNoToBoolean(mattr.getdefault("ishidedefaultfooter", "No"))
	bisHidedefaultheader = YesNoToBoolean(mattr.getdefault("ishidedefaultheader", "No"))
	sItemkey = mattr.getdefault("itemkey", "")
	sItemkey = sItemkey.tolowercase
	sItemsperpage = mattr.getdefault("itemsperpage", "")
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	bisloading = YesNoToBoolean(mattr.getdefault("isloading", "No"))
	'sLoadingtext = mattr.getdefault("loadingtext", "")
	'sLocale = mattr.getdefault("locale", "")
	smobilebreakpoint = mattr.getdefault("mobilebreakpoint", "")
	bisMultisort = YesNoToBoolean(mattr.getdefault("ismultisort", "No"))
	bisMustsort = YesNoToBoolean(mattr.getdefault("ismustsort", "No"))
	'sNodatatext = mattr.getdefault("nodatatext", "")
	'sNoresultstext = mattr.getdefault("noresultstext", "")
	sPage = mattr.getdefault("page", "")
	'sSearch = mattr.getdefault("search", "")
	'sSelectablekey = mattr.getdefault("selectablekey", "")
	'sServeritemslength = mattr.getdefault("serveritemslength", "")
	bisShowexpand = YesNoToBoolean(mattr.getdefault("isshowexpand", "No"))
	bisShowgroupby = YesNoToBoolean(mattr.getdefault("isshowgroupby", "No"))
	bisShowselect = YesNoToBoolean(mattr.getdefault("isshowselect", "No"))
	bisSingleexpand = YesNoToBoolean(mattr.getdefault("issingleexpand", "No"))
	bisSingleselect = YesNoToBoolean(mattr.getdefault("issingleselect", "No"))
	'sSortby = mattr.getdefault("sortby", "")
	'sSortdesc = mattr.getdefault("sortdesc", "")
	sdisplayfield = mattr.getdefault("displayfield","")
	sdisplayfield = sdisplayfield.tolowercase
	sconfirmfield = mattr.getdefault("confirmfield", "")
	sconfirmfield = sconfirmfield.tolowercase
	bislookup = YesNoToBoolean(mattr.getdefault("islookup", "No"))
End Sub


Sub Design_Table
	Dim datatable As VMDataTable = ui.CreateDataTable(sname, sItemkey, Me)
	datatable.SetStatic(True)
	datatable.SetTitle(stitle)
	datatable.SetSearchbox(bisSearchbox)
	datatable.SetCaption(sCaption)
	datatable.SetCalculatewidths(bisCalculatewidths)
	datatable.SetDark(bisdark)
	'datatable.SetDatasourcename(sDatasourcename)
	datatable.SetDense(bisdense)
	datatable.SetDisablefiltering(bisDisablefiltering)
	datatable.SetDisablepagination(bisDisablepagination)
	datatable.SetDisablesort(bisDisablesort)
	'datatable.SetExpandicon(sExpandicon)
	'datatable.SetExpanded(sExpanded)
	'datatable.SetFilters(sFilters)
	datatable.SetFixedheader(bisFixedheader)
	'datatable.SetGroupby(sGroupby)
	'datatable.SetGroupdesc(sGroupdesc)
	'datatable.SetHeaderslength(sHeaderslength)
	datatable.SetHeight(sheight)
	datatable.SetHidedefaultfooter(bisHidedefaultfooter)
	datatable.SetHidedefaultheader(bisHidedefaultheader)
	datatable.SetItemsperpage(sItemsperpage)
	datatable.SetLight(bislight)
	datatable.SetLoading(bisloading)
	'datatable.SetLoadingtext(sLoadingtext)
	'datatable.SetLocale(sLocale)
	datatable.SetMobilebreakpoint(smobilebreakpoint)	
	datatable.SetMultisort(bisMultisort)
	datatable.SetMustsort(bisMustsort)
	'datatable.SetNodatatext(sNodatatext)
	'datatable.SetNoresultstext(sNoresultstext)
	datatable.SetPage(sPage)
	'datatable.SetSearch(sSearch)
	'datatable.SetSelectablekey(sSelectablekey)
	'datatable.SetServeritemslength(sServeritemslength)
	datatable.SetShowexpand(bisShowexpand)
	'datatable.SetShowgroupby(bisShowgroupby)
	datatable.SetShowselect(bisShowselect)
	datatable.SetSingleexpand(bisSingleexpand)
	datatable.SetSingleselect(bisSingleselect)
	'datatable.SetSortby(sSortby)
	'datatable.SetSortdesc(sSortdesc)
	datatable.SetTabindex(stabindex)	
	datatable.SetVisible(bisVisible)
	If smargintop <> "" Then datatable.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then datatable.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then datatable.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then datatable.AddClass("mr-" & smarginright)
	If smargins <> "" Then datatable.AddClass("ms-" & smargins)
	If smargine <> "" Then datatable.AddClass("me-" & smargine)
	If smarginx <> "" Then datatable.AddClass("mx-" & smarginx)
	If smarginy <> "" Then datatable.AddClass("my-" & smarginy)
	If smargina <> "" Then datatable.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then datatable.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then datatable.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then datatable.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then datatable.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then datatable.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then datatable.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then datatable.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then datatable.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then datatable.AddClass("pa-" & spaddinga)


	'add columns
	'
	If bisaddnew Then
		datatable.SetAddNew(snewid, snewicon, snewtooltip)
	End If
	'add columns
	For Each m As Map In lcontents
		Dim xkey As String = m.GetDefault("key","")   'Name
		Dim xtitle As String = m.GetDefault("title","")  'Title
		Dim xtype As String = m.GetDefault("subtitle","")  'Type
		Dim xwidth As String = m.GetDefault("colwidth", "")  'Width
		Dim xalign As String = m.GetDefault("colalign", "")  'Align
		Dim xcomponent As String = m.GetDefault("colcontroltype","") 'Component
		Dim xdatatype As String = m.GetDefault("coldatatype", "")   'Data Type
		Dim xlength As String = m.GetDefault("collength","")  'Length
		Dim xvalue As String = m.GetDefault("colvalue", "")   'Value
		Dim xsortable As String = m.GetDefault("colsortable", "No")    'Sortable
		Dim xrequired As String = m.GetDefault("colrequired", "No")    'Required
		Dim xvisible As String = m.GetDefault("colvisible", "No")      'Visible
		Dim xactive As String = m.getdefault("colactive", "No")        'Active
		Dim xontable As Boolean = YesNoToBoolean(m.GetDefault("colontable", "No"))      'On Table
		Dim xindexed As String = m.GetDefault("colindexed", "No")      'Indexed
		Dim xicon As String = m.GetDefault("icon", "")
		Dim bcolislookup As Boolean = YesNoToBoolean(m.GetDefault("colislookup", "No"))
		Dim ccolforeignkey As String = m.getdefault("colforeignkey", "")
		Dim ccolforeignvalue As String = m.getdefault("colforeignvalue", "")
		
		If xkey = "" Then Continue
		If xontable = False Then Continue
		Dim bSortable As Boolean = YesNoToBoolean(xsortable)
		Select Case xtype
		Case "action"
		Case Else	
			If bcolislookup Then
				datatable.AddColumn1(ccolforeignvalue, xtitle, xtype,xwidth,bSortable,xalign)
			Else
				datatable.AddColumn1(xkey, xtitle, xtype,xwidth,bSortable,xalign)
			End If
		End Select
	Next
	
	datatable.SetEdit(bisEdit)
	datatable.SetDelete(bisDelete)
	datatable.SetClone(bisClone)
	datatable.SetDownload(bisDownload)
	datatable.SetPrint(bisPrint)
	datatable.SetMenu(bisMenu)
	If sfloat <> "" Then
		datatable.Addclass(sfloat)
	End If
	For Each m As Map In lcontents
		Dim xkey As String = m.GetDefault("key","")   'Name
		Dim xtitle As String = m.GetDefault("title","")  'Title
		Dim xtype As String = m.GetDefault("subtitle","")  'Type
		Dim xicon As String = m.GetDefault("icon", "")
		Select Case xtype
		Case "action"
			datatable.AddIcon(xkey, xtitle, xicon)
		End Select
	Next
	'
	ui.AddControl(datatable.DataTable, datatable.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	'build the code
	AddInstruction(sb, "<Your Module>", "", "")
	AddCode(sb, $"Sub CreateDataTable_${sname}"$)
	sb.append($"dt${sname} = vm.CreateDataTable("dt${sname}", "${sItemkey}", Me)"$).append(CRLF)
	CodeLine(sb, stitle, "s", "dt", sname, "SetTitle")
	CodeLine(sb, sCaption, "s", "dt", sname, "SetCaption")
	CodeLine(sb, bisSearchbox, "b", "dt", sname, "SetSearchbox")
	If bisaddnew Then
		sb.append($"dt${sname}.SetAddNew("${snewid}", "${snewicon}", "${snewtooltip}")"$).append(CRLF)
	End If
	'
	'AddCode(sb, $"vm.setdata("${sDatasourcename}", vm.newlist)"$)
	'CodeLine(sb, sDatasourcename, "s", "dt", sname, "SetDatasourcename")
	CodeLine(sb, bisCalculatewidths, "b", "dt", sname, "SetCalculatewidths")
	CodeLine(sb, bisdark, "b", "dt", sname, "SetDark")
	
	CodeLine(sb, bisdense, "b", "dt", sname, "SetDense")
	If sfloat <> "" Then
		AddCode(sb, $"dt${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisDisablefiltering, "b", "dt", sname, "SetDisablefiltering")
	CodeLine(sb, bisDisablepagination, "b", "dt", sname, "SetDisablepagination")
	CodeLine(sb, bisDisablesort, "b", "dt", sname, "SetDisablesort")
	'CodeLine(sb, sExpandicon, "s", "dt", sname, "SetExpandicon")
	'CodeLine(sb, sExpanded, "s", "dt", sname, "SetExpanded")
	'CodeLine(sb, sFilters, "s", "dt", sname, "SetFilters")
	CodeLine(sb, bisFixedheader, "b", "dt", sname, "SetFixedheader")
	'CodeLine(sb, sGroupby, "s", "dt", sname, "SetGroupby")
	'CodeLine(sb, sGroupdesc, "s", "dt", sname, "SetGroupdesc")
	'CodeLine(sb, sHeaderslength, "s", "dt", sname, "SetHeaderslength")
	CodeLine(sb, sheight, "s", "dt", sname, "SetHeight")
	CodeLine(sb, bisHidedefaultfooter, "b", "dt", sname, "SetHidedefaultfooter")
	CodeLine(sb, bisHidedefaultheader, "b", "dt", sname, "SetHidedefaultheader")
	CodeLine(sb, sItemsperpage, "s", "dt", sname, "SetItemsperpage")
	CodeLine(sb, bislight, "b", "dt", sname, "SetLight")
	CodeLine(sb, bisloading, "b", "dt", sname, "SetLoading")
	'CodeLine(sb, sLoadingtext, "s", "dt", sname, "SetLoadingtext")
	'CodeLine(sb, sLocale, "s", "dt", sname, "SetLocale")
	CodeLine(sb, smobilebreakpoint, "s", "dt", sname, "SetMobilebreakpoint")
	CodeLine(sb, bisMultisort, "b", "dt", sname, "SetMultisort")
	CodeLine(sb, bisMustsort, "b", "dt", sname, "SetMustsort")
	'CodeLine(sb, sNodatatext, "s", "dt", sname, "SetNodatatext")
	'CodeLine(sb, sNoresultstext, "s", "dt", sname, "SetNoresultstext")
	CodeLine(sb, sPage, "s", "dt", sname, "SetPage")
	'CodeLine(sb, sSearch, "s", "dt", sname, "SetSearch")
	'CodeLine(sb, sSelectablekey, "s", "dt", sname, "SetSelectablekey")
	'CodeLine(sb, sServeritemslength, "s", "dt", sname, "SetServeritemslength")
	CodeLine(sb, bisShowexpand, "b", "dt", sname, "SetShowexpand")
	CodeLine(sb, bisShowgroupby, "b", "dt", sname, "SetShowgroupby")
	CodeLine(sb, bisShowselect, "b", "dt", sname, "SetShowselect")
	CodeLine(sb, bisSingleexpand, "b", "dt", sname, "SetSingleexpand")
	CodeLine(sb, bisSingleselect, "b", "dt", sname, "SetSingleselect")
	'CodeLine(sb, sSortby, "s", "dt", sname, "SetSortby")
	'CodeLine(sb, sSortdesc, "s", "dt", sname, "SetSortdesc")
	CodeLine(sb, bisVisible, "b", "dt", sname, "SetVisible")
	'
	Dim pres As String = "dt"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	'
	Dim sba As StringBuilder
	sba.initialize
	
	'add columns
	For Each m As Map In lcontents
		Dim xkey As String = m.GetDefault("key","")   'Name
		Dim xtitle As String = m.GetDefault("title","")  'Title
		Dim xtype As String = m.GetDefault("subtitle","")  'Type
		Dim xwidth As String = m.GetDefault("colwidth", "0")  'Width
		Dim xalign As String = m.GetDefault("colalign", "")  'Align
		Dim xcomponent As String = m.GetDefault("colcontroltype","") 'Component
		Dim xdatatype As String = m.GetDefault("coldatatype", "")   'Data Type
		Dim xlength As String = m.GetDefault("collength","")  'Length
		Dim xvalue As String = m.GetDefault("colvalue", "")   'Value
		Dim xsortable As String = m.GetDefault("colsortable", "No")    'Sortable
		Dim xrequired As String = m.GetDefault("colrequired", "No")    'Required
		Dim xvisible As String = m.GetDefault("colvisible", "No")      'Visible
		Dim xactive As String = m.getdefault("colactive", "No")        'Active
		Dim xontable As Boolean = YesNoToBoolean(m.GetDefault("colontable", "No"))      'On Table
		Dim xindexed As String = m.GetDefault("colindexed", "No")      'Indexed
		Dim xicon As String = m.GetDefault("icon", "")
		Dim bcolislookup As Boolean = YesNoToBoolean(m.GetDefault("colislookup", "No"))
		Dim ccolforeignkey As String = m.getdefault("colforeignkey", "")
		Dim ccolforeignvalue As String = m.getdefault("colforeignvalue", "")
		
		If xkey = "" Then Continue
		If xontable = False Then Continue
		Dim bSortable As Boolean = YesNoToBoolean(xsortable)
		xkey = xkey.tolowercase
		ccolforeignvalue = ccolforeignvalue.tolowercase
		Select Case xtype
		Case "action"
			sba.append($"dt${sname}.AddIcon("${xkey}", "${xtitle}", "${xicon}")"$).append(CRLF)
		Case Else
			If bcolislookup Then
				sb.append($"dt${sname}.AddColumn1("${ccolforeignvalue}", "${xtitle}", "${xtype}",${xwidth},${bSortable},"${xalign}")"$).append(CRLF)
			Else	
				sb.append($"dt${sname}.AddColumn1("${xkey}", "${xtitle}", "${xtype}",${xwidth},${bSortable},"${xalign}")"$).append(CRLF)
			End If
		End Select
	Next
	
	CodeLine(sb, bisEdit, "b", "dt", sname, "SetEdit")
	CodeLine(sb, bisDelete, "b", "dt", sname, "SetDelete")
	CodeLine(sb, bisClone, "b", "dt", sname, "SetClone")
	CodeLine(sb, bisDownload, "b", "dt", sname, "SetDownload")
	CodeLine(sb, bisPrint, "b", "dt", sname, "SetPrint")
	CodeLine(sb, bisMenu, "b", "dt", sname, "SetMenu")
	sb.append(sba.tostring)
	'
	sb.append($"cont.AddControl(dt${sname}.DataTable, dt${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF)
	AddCode(sb, "End Sub")
	AddNewLine(sb)
	
	'
End Sub

#Region Chip
Sub PropertyBag_Chip
	vm.setdata("pbchip", False)
	lstBags.add("pbchip")
	pbchip = vm.CreateProperty("ppbchip", Me)
	pbchip.SetVShow("pbchip")
	pbchip.AddHeading("d","Details")
	pbchip.AddText("d","id","ID","","")
	pbchip.AddText("d", "controltype", "Type", "","chip")
	pbchip.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbchip.AddText("d","vmodel","VModel","","")
	pbchip.AddText("d", "label","Label","","")
	pbchip.AddText("d","src","Src","","./assets/sponge.png")
	pbchip.AddText("d","iconname","Icon Name","","")
	pbchip.AddRadioGroupH("d", "iconpos", "Position", iconpos)
	pbchip.AddRadioGroupH("d", "chiptype", "Type", CreateMap("icon":"Icon","image":"Image"))
	pbchip.AddSelect2("d","color","Color", vm.ColorOptions, "colorintensity", "Color Intensity", vm.IntensityOptions)
	pbchip.AddSelect2("d","textcolor","TextColor", vm.ColorOptions, "textcolorintensity","TextColor Intensity", vm.IntensityOptions)
	pbchip.AddText("d","href","Href","","")
	pbchip.AddText("d","to","To","","")
	pbchip.AddSelect("d","target","Target", vm.TargetOptions)
	pbchip.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbchip.AddHeading("m","Margins & Padding")
	pbchip.AddMarginsPaddings("m")
	'
	pbchip.AddHeading("e","Settings")
	pbchip.AddSwitches("e", CreateMap("isactive": "Active", "isappend": "Append"))
	pbchip.AddSwitches("e", CreateMap("isclose": "Close", "isdark": "Dark"))
	pbchip.AddSwitches("e", CreateMap("isdisabled": "Disabled", "isdraggable": "Draggable"))
	pbchip.AddSwitches("e", CreateMap("isexact": "Exact", "isfilter": "Filter"))
	pbchip.AddSwitches("e", CreateMap("islabel": "Label", "islarge": "Large"))
	pbchip.AddSwitches("e", CreateMap("islight": "Light", "islink": "Link"))
	pbchip.AddSwitches("e", CreateMap("isnuxt": "Nuxt", "isoutlined": "Outlined"))
	pbchip.AddSwitches("e", CreateMap("ispill": "Pill", "isreplace": "Replace"))
	pbchip.AddSwitches("e", CreateMap("isripple": "Ripple", "issmall": "Small"))
	pbchip.AddSwitches("e", CreateMap("isvisible": "Visible", "isxlarge": "XLarge"))
	pbchip.AddSwitches("e", CreateMap("isxsmall": "XSmall"))
	
	pbchip.AddHeading("f","Matrix")
	pbchip.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbchip.tostring)
End Sub
#End Region

#Region Badge
Sub PropertyBag_Badge
	vm.setdata("pbbadge", False)
	lstBags.add("pbbadge")
	pbbadge = vm.CreateProperty("ppbbadge", Me)
	pbbadge.SetVShow("pbbadge")
	pbbadge.AddHeading("d","Details")
	pbbadge.AddText("d","id","ID","","")
	pbbadge.AddText("d", "controltype", "Type", "","badge")
	pbbadge.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbbadge.AddText("d","vmodel","VModel","","")
	pbbadge.AddText2("d",CreateMap("content":"Content", "iconname":"Icon"))
	pbbadge.AddRadioGroupH("d", "badgetype", "Type", CreateMap("iscontent":"Content","isicon":"Icon"))
	pbbadge.AddSelect2("d","color","Color", vm.ColorOptions, "colorintensity","Color Intensity", vm.IntensityOptions)
	pbbadge.AddText2("d",CreateMap("offsetx":"Offset X", "offsety":"Offset Y"))
	pbbadge.AddSelect2("d","origin","Origin",vm.Transition,"transition","Transition",vm.Transition)
	pbbadge.AddSelect("d","float", "Float", vm.Floats)
	
	'
	'
	pbbadge.AddHeading("m","Margins & Padding")
	pbbadge.AddMarginsPaddings("m")
	
	pbbadge.AddHeading("e","Settings")
	pbbadge.AddSwitches("e", CreateMap("isavatar": "Avatar", "isbordered": "Bordered"))
	pbbadge.AddSwitches("e", CreateMap("isbottom": "Bottom", "isdark": "Dark"))
	pbbadge.AddSwitches("e", CreateMap("isdisabled": "Disabled", "isdot": "Dot"))
	pbbadge.AddSwitches("e", CreateMap("isinline": "Inline", "isleft": "Left"))
	pbbadge.AddSwitches("e", CreateMap("islight": "Light", "isoverlap": "Overlap"))
	pbbadge.AddSwitches("e", CreateMap("istile": "Tile", "isvisible": "Visible"))
	'
	pbbadge.AddHeading("f","Matrix")
	pbbadge.AddMatrix("f")
	'
	vm.container.AddComponent(1, 3, pbbadge.tostring)
End Sub
#End Region


#Region Avatar
Sub PropertyBag_Avatar
	vm.setdata("pbavatar", False)
	lstBags.add("pbavatar")
	pbavatar = vm.CreateProperty("ppbavatar", Me)
	pbavatar.SetChangeEvent("SavePropertyBag")
	pbavatar.SetVShow("pbavatar")
	pbavatar.AddHeading("d","Details")
	pbavatar.AddText("d","id","ID","","")
	pbavatar.AddText("d", "controltype", "Type", "","avatar")
	pbavatar.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbavatar.AddText("d","vmodel","VModel","","")
	pbavatar.AddText2("d", CreateMap("badge":"Badge","label":"Label"))
	pbavatar.AddText2("d", CreateMap("iconname": "Icon Name", "size": "Size"))
	pbavatar.AddText("d", "src", "Src","", "")
	pbavatar.AddRadioGroupH("d", "avatartype", "Type", CreateMap("islabel":"Label","isicon":"Icon", "isimage":"Image"))
	pbavatar.AddSelect2("d","color","Color", vm.ColorOptions, "colorintensity","Color Intensity", vm.IntensityOptions)
	pbavatar.AddSelect2("d","textcolor","TextColor", vm.ColorOptions, "textcolorintensity","TextColor Intensity", vm.IntensityOptions)
	pbavatar.AddSelect("d","float", "Float", vm.Floats)
	
	pbavatar.AddHeightWidths("d")
	'
	'
	pbavatar.AddHeading("m","Margins & Padding")
	pbavatar.AddMarginsPaddings("m")
	
	pbavatar.AddHeading("e","Settings")
	pbavatar.AddSwitches("e", CreateMap("isdisabled": "Disabled", "isvisible": "Visible"))
	pbavatar.AddSwitches("e", CreateMap("isleft": "Left", "isright": "Right"))
	pbavatar.AddSwitches("e", CreateMap("ishasbadge": "HasBadge", "istile": "Tile"))
	'
	pbavatar.AddHeading("f","Matrix")
	pbavatar.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbavatar.tostring)
End Sub
#End Region

Sub Read_Avatar
	sBadge = mattr.getdefault("badge", "")
	sColor = mattr.getdefault("color", "")
	sColorintensity = mattr.getdefault("colorintensity", "")
	bisDisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
	bisHasbadge = YesNoToBoolean(mattr.getdefault("ishasbadge", "No"))
	sheight = mattr.getdefault("height", "")
	bisleft = YesNoToBoolean(mattr.getdefault("isleft", "No"))
	smaxheight = mattr.getdefault("maxheight", "")
	smaxwidth = mattr.getdefault("maxwidth", "")
	sminheight = mattr.getdefault("minheight", "")
	sminwidth = mattr.getdefault("minwidth", "")
	bisright = YesNoToBoolean(mattr.getdefault("isright", "No"))
	ssize = mattr.getdefault("size", "")
	savatartype = mattr.GetDefault("avatartype","")
	stextcolor = mattr.getdefault("textcolor", "")
	stextintensity = mattr.getdefault("textintensity", "")
	bistile = YesNoToBoolean(mattr.getdefault("istile", "No"))
	bisVisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
End Sub

Sub Design_Avatar
	Dim avatar As VMAvatar = ui.CreateAvatar($"avatar${sname}"$, Me)
	avatar.setstatic(True)
	avatar.SetBadge(sBadge)
	avatar.SetColorintensity(sColor, sColorintensity)
	avatar.SetDisabled(bisDisabled)
	avatar.SetHasbadge(bisHasbadge)
	avatar.SetHeight(sheight)
	avatar.SetLeft(bisleft)
	avatar.SetMaxheight(smaxheight)
	avatar.SetMaxwidth(smaxwidth)
	avatar.SetMinheight(sminheight)
	avatar.SetMinwidth(sminwidth)
	avatar.SetRight(bisright)
	avatar.SetSize(ssize)
	avatar.SetTextcolorintensity(stextcolor, stextintensity)
	avatar.SetTile(bistile)	
	avatar.SetVisible(bisVisible)
	If smargintop <> "" Then avatar.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then avatar.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then avatar.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then avatar.AddClass("mr-" & smarginright)
	If smargins <> "" Then avatar.AddClass("ms-" & smargins)
	If smargine <> "" Then avatar.AddClass("me-" & smargine)
	If smarginx <> "" Then avatar.AddClass("mx-" & smarginx)
	If smarginy <> "" Then avatar.AddClass("my-" & smarginy)
	If smargina <> "" Then avatar.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then avatar.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then avatar.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then avatar.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then avatar.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then avatar.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then avatar.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then avatar.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then avatar.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then avatar.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		avatar.Addclass(sfloat)
	End If
	Select Case savatartype
	Case "islabel"
		avatar.SetTextOnly(stitle)
	Case "isicon"
		avatar.SetIconOnly(siconname)
	Case "isimage"	
		avatar.SetImageOnly(ssrc)
	End Select	
	ui.AddControl(avatar.Avatar, avatar.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim avt${sname} As VMAvatar = vm.CreateAvatar("avt${sname}", Me)"$).Append(CRLF)
	CodeLine(sb, sBadge, "s", "avt", sname, "SetBadge")
	CodeLine2(sb, sColor, sColorintensity, "s", "avt", sname, "SetColorintensity")
	CodeLine(sb, bisDisabled, "b", "avt", sname, "SetDisabled")
	CodeLine(sb, bisHasbadge, "b", "avt", sname, "SetHasbadge")
	CodeLine(sb, sheight, "s", "avt", sname, "SetHeight")
	CodeLine(sb, bisleft, "b", "avt", sname, "SetLeft")
	If sfloat <> "" Then
		AddCode(sb, $"avt${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, smaxheight, "s", "avt", sname, "SetMaxheight")
	CodeLine(sb, smaxwidth, "s", "avt", sname, "SetMaxwidth")
	CodeLine(sb, sminheight, "s", "avt", sname, "SetMinheight")
	CodeLine(sb, sminwidth, "s", "avt", sname, "SetMinwidth")
	CodeLine(sb, bisright, "b", "avt", sname, "SetRight")
	CodeLine(sb, ssize, "s", "avt", sname, "SetSize")
	CodeLine2(sb, stextcolor, stextintensity, "s", "avt", sname, "SetTextcolorintensity")
	CodeLine(sb, bistile, "b", "avt", sname, "SetTile")
	CodeLine(sb, bisVisible, "b", "avt", sname, "SetVisible")
	Select Case savatartype
	Case "islabel"
		CodeLine(sb, stitle, "s", "avt", sname, "SetTextonly")
	Case "isicon"
		CodeLine(sb, siconname, "s", "avt", sname, "SetIcononly")
	Case "isimage"
			CodeLine(sb, ssrc, "s", "avt", sname, "SetImageonly")
	End Select
	Dim pres As String = "avt"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	
	sb.append($"${sparent}.AddControl(avt${sname}.Avatar, avt${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
End Sub

#Region List
Sub PropertyBag_List
	vm.setdata("pblist", False)
	lstBags.add("pblist")
	pblist = vm.CreateProperty("ppblist", Me)
	pblist.SetChangeEvent("SavePropertyBag")
	pblist.SetVShow("pblist")
	pblist.AddHeading("d","Details")
	pblist.AddText("d","id","ID","","")
	pblist.AddText("d", "controltype", "Type", "","list")
	pblist.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pblist.AddText("d","vmodel","ID","","")
	pblist.AddText("d","datasource","Data Source","","")
	pblist.AddText2("d",CreateMap("keyfld":"Key Fld", "avatarfld":"Avatar Fld"))
	pblist.AddText2("d",CreateMap("iconfld":"Icon Fld", "iconcolorfld":"Icon Color Fld"))
	pblist.AddText2("d",CreateMap("titlefld":"Title Fld", "subtitlefld":"Subtitle 1 Fld"))
	pblist.AddText2("d",CreateMap("subtitle1fld":"Subtitle 2 Fld", "actioniconfld":"Action Icon Fld"))
	pblist.AddText2("d",CreateMap("actioniconcolorfld":"Action Icon Color Fld"))
	pblist.AddSelect2("d","color","Color", vm.ColorOptions, "colorintensity","Color Intensity", vm.IntensityOptions)
	pblist.AddSelect("d","elevation","Elevation",vm.elevation)
	pblist.AddSelect("d","float", "Float", vm.Floats)
	
	pblist.AddHeightWidths("d")
	'
	pblist.AddHeading("a", "Items")
	pblist.AddCrudList("a", CreateMap("key":"Item Key","avatar":"Avatar","icon":"Icon Name", "iconcolor": "Icon Color", "title":"Title","subtitle":"Sub Title 1","subtitle1":"Sub Title 2", "action":"Action Icon","actioncolor":"Action Color"))
	'
	pblist.AddHeading("m","Margins & Padding")
	pblist.AddMarginsPaddings("m")
	
	pblist.AddHeading("e","Settings")
	pblist.AddSwitches("e", CreateMap("isoptions": "Use Items", "isdivider":"Divide Each"))
	pblist.AddSwitches("e", CreateMap("isinsetdivider": "Inset Divider"))
	pblist.AddSwitches("e", CreateMap("isdark": "Dark", "isdense": "Dense"))
	pblist.AddSwitches("e", CreateMap("isdisabled": "Disabled", "isexpand": "Expand"))
	pblist.AddSwitches("e", CreateMap("isflat": "Flat", "islight": "Light"))
	pblist.AddSwitches("e", CreateMap("isnav": "Nav", "isrounded": "Rounded"))
	pblist.AddSwitches("e", CreateMap("isshaped": "Shaped", "issubheader": "Subheader"))
	pblist.AddSwitches("e", CreateMap("isthreeline": "ThreeLine", "istile": "Tile"))
	pblist.AddSwitches("e", CreateMap("istwoline": "TwoLine", "isvisible": "Visible"))
	'
	pblist.AddHeading("f","Matrix")
	pblist.AddMatrix("f")
	vm.container.AddComponent(1, 3, pblist.tostring)
End Sub
#End Region

Sub Read_List
	sColor = mattr.getdefault("color", "")
	sColorintensity = mattr.getdefault("colorintensity", "")
	bisdark = YesNoToBoolean(mattr.getdefault("isdark", "No"))
	bisdense = YesNoToBoolean(mattr.getdefault("isdense", "No"))
	bisDisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
	selevation = mattr.getdefault("elevation", "")
	bisExpand = YesNoToBoolean(mattr.getdefault("isexpand", "No"))
	bisflat = YesNoToBoolean(mattr.getdefault("isflat", "No"))
	sheight = mattr.getdefault("height", "")
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	smaxheight = mattr.getdefault("maxheight", "")
	smaxwidth = mattr.getdefault("maxwidth", "")
	sminheight = mattr.getdefault("minheight", "")
	sminwidth = mattr.getdefault("minwidth", "")
	bisNav = YesNoToBoolean(mattr.getdefault("isnav", "No"))
	bisrounded = YesNoToBoolean(mattr.getdefault("isrounded", "No"))
	bisshaped = YesNoToBoolean(mattr.getdefault("isshaped", "No"))
	bisSubheader = YesNoToBoolean(mattr.getdefault("issubheader", "No"))
	bisThreeline = YesNoToBoolean(mattr.getdefault("isthreeline", "No"))
	bistile = YesNoToBoolean(mattr.getdefault("istile", "No"))
	bisTwoline = YesNoToBoolean(mattr.getdefault("istwoline", "No"))
	bisoptions = YesNoToBoolean(mattr.getdefault("isoptions", "No"))
	bisVisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
	swidth = mattr.getdefault("width", "")
	sDatasource = mattr.getdefault("datasource", "")
	sKeyfld = mattr.getdefault("keyfld", "")
	sAvatarfld = mattr.getdefault("avatarfld", "")
	sIconfld = mattr.getdefault("iconfld", "")
	sIconcolorfld = mattr.getdefault("iconcolorfld", "")
	sTitlefld = mattr.getdefault("titlefld", "")
	sSubtitlefld = mattr.getdefault("subtitlefld", "")
	sSubtitle1fld = mattr.getdefault("subtitle1fld", "")
	sActioniconfld = mattr.getdefault("actioniconfld", "")
	sActioniconcolorfld = mattr.getdefault("actioniconcolorfld", "")
	bisinsetdivider = YesNoToBoolean(mattr.getdefault("isinsetdivider", "No"))
End Sub

Sub Design_List
	Dim lst As VMList = ui.CreateList($"lst${sname}"$, Me)
	lst.setstatic(True)
	lst.SetColorintensity(sColor, sColorintensity)
	lst.SetDark(bisdark)
	lst.SetDense(bisdense)
	lst.SetDisabled(bisDisabled)
	lst.SetElevation(selevation)
	lst.SetExpand(bisExpand)
	lst.SetFlat(bisflat)
	lst.SetHeight(sheight)
	lst.SetLight(bislight)
	lst.SetMaxheight(smaxheight)
	lst.SetMaxwidth(smaxwidth)
	lst.SetMinheight(sminheight)
	lst.SetMinwidth(sminwidth)
	lst.SetNav(bisNav)
	lst.SetRounded(bisrounded)
	lst.SetShaped(bisshaped)
	lst.SetSubheader(bisSubheader)
	lst.SetThreeline(bisThreeline)
	lst.SetTile(bistile)
	lst.SetTwoline(bisTwoline)
	lst.SetVisible(bisVisible)
	lst.SetWidth(swidth)
	If smargintop <> "" Then lst.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then lst.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then lst.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then lst.AddClass("mr-" & smarginright)
	If smargins <> "" Then lst.AddClass("ms-" & smargins)
	If smargine <> "" Then lst.AddClass("me-" & smargine)
	If smarginx <> "" Then lst.AddClass("mx-" & smarginx)
	If smarginy <> "" Then lst.AddClass("my-" & smarginy)
	If smargina <> "" Then lst.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then lst.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then lst.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then lst.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then lst.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then lst.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then lst.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then lst.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then lst.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then lst.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		lst.Addclass(sfloat)
	End If
	'
	'link events
	AddCode(sbEvents, $"Sub lst${sname}_click(e As BANanoEvent)"$)
	AddCode(sbEvents, $"Dim itemID As String = vm.GetIDFromEvent(e)"$)
	AddCode(sbEvents, $"Select Case itemID"$)
	'
	If bisoptions Then
		'add the menu items
		For Each m As Map In lcontents
			Dim sskey As String = m.getdefault("key", "")
			Dim ssavatar As String = m.getdefault("avatar", "")
			Dim ssiconname As String = m.getdefault("icon", "")
			Dim sIconcolor As String = m.getdefault("iconcolor", "")
			Dim sstitle As String = m.getdefault("title", "")
			Dim sssubtitle As String = m.GetDefault("subtitle", "")
			Dim ssubtitle1 As String = m.getdefault("subtitle1", "")
			Dim ssactionicon As String = m.getdefault("action", "")
			Dim sactioncolor As String = m.getdefault("actioncolor", "")
			'
			If sskey = "" Then Continue
			lst.AddItem1(sskey, ssavatar, ssiconname, sIconcolor, sstitle, sssubtitle, ssubtitle1, _
			ssactionicon, sactioncolor)
			If bisdivider Then lst.AddDivider1(bisinsetdivider)
			AddCode(sbEvents, $"Case "${sskey}""$)
			AddCode(sbEvents, $"vm.ShowSnackBarSuccess("${sstitle}")"$)
		Next
	End If
	AddCode(sbEvents,"End Select")
	AddCode(sbEvents, "End Sub")
	
	
	'
	ui.AddControl(lst.List, lst.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	sb.append($"Dim lst${sname} As VMList = vm.CreateList("lst${sname}", Me)"$).Append(CRLF)
	CodeLine2(sb, sColor, sColorintensity, "s", "lst", sname, "SetColorintensity")
	CodeLine(sb, bisdark, "b", "lst", sname, "SetDark")
	CodeLine(sb, bisdense, "b", "lst", sname, "SetDense")
	CodeLine(sb, bisDisabled, "b", "lst", sname, "SetDisabled")
	CodeLine(sb, selevation, "s", "lst", sname, "SetElevation")
	CodeLine(sb, bisExpand, "b", "lst", sname, "SetExpand")
	CodeLine(sb, bisflat, "b", "lst", sname, "SetFlat")
	CodeLine(sb, sheight, "s", "lst", sname, "SetHeight")
	CodeLine(sb, bislight, "b", "lst", sname, "SetLight")
	If sfloat <> "" Then
		AddCode(sb, $"lst${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, smaxheight, "s", "lst", sname, "SetMaxheight")
	CodeLine(sb, smaxwidth, "s", "lst", sname, "SetMaxwidth")
	CodeLine(sb, sminheight, "s", "lst", sname, "SetMinheight")
	CodeLine(sb, sminwidth, "s", "lst", sname, "SetMinwidth")
	CodeLine(sb, bisNav, "b", "lst", sname, "SetNav")
	CodeLine(sb, bisrounded, "b", "lst", sname, "SetRounded")
	CodeLine(sb, bisshaped, "b", "lst", sname, "SetShaped")
	CodeLine(sb, bisSubheader, "b", "lst", sname, "SetSubheader")
	CodeLine(sb, bisThreeline, "b", "lst", sname, "SetThreeline")
	CodeLine(sb, bistile, "b", "lst", sname, "SetTile")
	CodeLine(sb, bisTwoline, "b", "lst", sname, "SetTwoline")
	CodeLine(sb, bisVisible, "b", "lst", sname, "SetVisible")
	CodeLine(sb, swidth, "s", "lst", sname, "SetWidth")
	'
	Dim pres As String = "lst"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	'
	If bisoptions Then
		For Each m As Map In lcontents
			Dim sskey As String = m.getdefault("key", "")
			Dim ssavatar As String = m.getdefault("avatar", "")
			Dim ssiconname As String = m.getdefault("icon", "")
			Dim sIconcolor As String = m.getdefault("iconcolor", "")
			Dim sstitle As String = m.getdefault("title", "")
			Dim sssubtitle As String = m.GetDefault("subtitle", "")
			Dim ssubtitle1 As String = m.getdefault("subtitle1", "")
			Dim ssactionicon As String = m.getdefault("action", "")
			Dim sactioncolor As String = m.getdefault("actioncolor", "")
			'
			If sskey = "" Then Continue
			AddCode(sb, $"lst${sname}.AddItem1("${sskey}", "${ssavatar}", "${ssiconname}", "${sIconcolor}", "${sstitle}", "${sssubtitle}", "${ssubtitle1}", "${ssactionicon}", "${sactioncolor}")"$)
			If bisdivider Then 
				AddCode(sb, $"lst${sname}.AddDivider1(${bisinsetdivider})"$)
			End If
		Next
	Else
		'set data source
		AddCode(sb, $"vm.setdata("${sDatasource}", vm.newlist)"$)
		AddCode(sb, $"lst${sname}.SetDataSourceTemplate1("${sDatasource}","${sKeyfld}","${sAvatarfld}","${sIconfld}","${sIconcolorfld}","${sTitlefld}","${sSubtitlefld}","${sSubtitle1fld}","${sActioniconfld}","${sActioniconcolorfld}")"$)
	End If
	
	sb.append($"${sparent}.AddControl(lst${sname}.List, lst${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

#Region Tabs
Sub PropertyBag_Tabs
	vm.setdata("pbtabs", False)
	lstBags.add("pbtabs")
	pbtabs = vm.CreateProperty("ppbtabs", Me)
	pbtabs.SetChangeEvent("SavePropertyBag")
	pbtabs.SetVShow("pbtabs")
	pbtabs.AddHeading("d","Details")
	pbtabs.AddText("d","id","ID","","")
	pbtabs.AddText("d", "controltype", "Type", "","tabs")
	pbtabs.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbtabs.AddText("d","vmodel","VModel","","")
	pbtabs.AddSelect2("d","color","Color", vm.ColorOptions, "colorintensity","Color Intensity", vm.IntensityOptions)
	pbtabs.AddSelect2("d","backgroundcolor","BackgroundColor", vm.ColorOptions, "backgroundcolorintensity","BackgroundColor Intensity", vm.IntensityOptions)
	pbtabs.AddSelect2("d","slidercolor","SliderColor", vm.ColorOptions, "slidercolorintensity","SliderColor Intensity", vm.IntensityOptions)
	pbtabs.AddText2("d",CreateMap("height":"Height", "mobilebreakpoint":"MobileBreakPoint"))
	pbtabs.AddText2("d",CreateMap("previcon":"PrevIcon", "nexticon":"NextIcon"))
	pbtabs.AddText2("d",CreateMap("slidersize":"SliderSize","activeclass":"ActiveClass"))
	pbtabs.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbtabs.AddHeading("a", "Items")
	pbtabs.AddCrudList("a", CreateMap("key":"Item Key", "title":"Title", "icon":"Icon"))
	'
	pbtabs.AddHeading("m","Margins & Padding")
	pbtabs.AddMarginsPaddings("m")
	
	pbtabs.AddHeading("e","Settings")
	pbtabs.AddSwitches("e", CreateMap("isitemdiv": "ItemDiv", "isitemnogutter": "ItemNoGutter"))
	pbtabs.AddSwitches("e", CreateMap("isiconposright": "IconPos Right","istabslider":"AddTabSlider"))
	pbtabs.AddSwitches("e", CreateMap("isalignwithtitle": "AlignWithTitle", "iscenteractive": "CenterActive"))
	pbtabs.AddSwitches("e", CreateMap("iscentered": "Centered", "isdark": "Dark"))
	pbtabs.AddSwitches("e", CreateMap("isfixedtabs": "FixedTabs", "isgrow": "Grow"))
	pbtabs.AddSwitches("e", CreateMap("ishideslider": "HideSlider", "isiconsandtext": "IconsAndText"))
	pbtabs.AddSwitches("e", CreateMap("islight": "Light", "isoptional": "Optional"))
	pbtabs.AddSwitches("e", CreateMap("isright": "Right", "isshowarrows": "ShowArrows"))
	pbtabs.AddSwitches("e", CreateMap("isvertical": "Vertical", "isvisible": "Visible"))	'
	pbtabs.AddHeading("f","Matrix")
	pbtabs.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbtabs.tostring)
End Sub
#End Region

Sub Read_Tabs
	sactiveclass = mattr.getdefault("activeclass", "")
	bisAlignwithtitle = YesNoToBoolean(mattr.getdefault("isalignwithtitle", "No"))
	sBackgroundcolor = mattr.getdefault("backgroundcolor", "")
	sBackgroundcolorintensity = mattr.getdefault("backgroundcolorintensity", "")
	bisCenteractive = YesNoToBoolean(mattr.getdefault("iscenteractive", "No"))
	bisCentered = YesNoToBoolean(mattr.getdefault("iscentered", "No"))
	sColor = mattr.getdefault("color", "")
	sColorintensity = mattr.getdefault("colorintensity", "")
	bisdark = YesNoToBoolean(mattr.getdefault("isdark", "No"))
	bisFixedtabs = YesNoToBoolean(mattr.getdefault("isfixedtabs", "No"))
	bisGrow = YesNoToBoolean(mattr.getdefault("isgrow", "No"))
	sheight = mattr.getdefault("height", "")
	bisHideslider = YesNoToBoolean(mattr.getdefault("ishideslider", "No"))
	bisIconsandtext = YesNoToBoolean(mattr.getdefault("isiconsandtext", "No"))
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	smobilebreakpoint = mattr.getdefault("mobilebreakpoint", "")
	sNexticon = mattr.getdefault("nexticon", "")
	bisOptional = YesNoToBoolean(mattr.getdefault("isoptional", "No"))
	sPrevicon = mattr.getdefault("previcon", "")
	bisright = YesNoToBoolean(mattr.getdefault("isright", "No"))
	bisshowarrows = YesNoToBoolean(mattr.getdefault("isshowarrows", "No"))
	sSlidercolor = mattr.getdefault("slidercolor", "")
	sSlidercolorintensity = mattr.getdefault("slidercolorintensity", "")
	sSlidersize = mattr.getdefault("slidersize", "")
	bisvertical = YesNoToBoolean(mattr.getdefault("isvertical", "No"))
	bisVisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
	bisiconposright = YesNoToBoolean(mattr.getdefault("isiconposright","No"))
	bistabslider = YesNoToBoolean(mattr.getdefault("istabslider","No"))
End Sub

Sub Design_Stepper
	Dim stp As VMStepper = ui.CreateStepper($"stp${sname}"$, Me)
	stp.SetStatic(True)
	stp.SetAltlabels(bisAltlabels)
	stp.SetDark(bisdark)
	stp.SetLight(bislight)
	stp.SetNonlinear(bisNonlinear)
	stp.SetStepactive(sStepactive)
	stp.SetTabindex(stabindex)
	stp.SetVertical(bisvertical)
	stp.SetVisible(bisVisible)
	If smargintop <> "" Then stp.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then stp.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then stp.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then stp.AddClass("mr-" & smarginright)
	If smargins <> "" Then stp.AddClass("ms-" & smargins)
	If smargine <> "" Then stp.AddClass("me-" & smargine)
	If smarginx <> "" Then stp.AddClass("mx-" & smarginx)
	If smarginy <> "" Then stp.AddClass("my-" & smarginy)
	If smargina <> "" Then stp.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then stp.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then stp.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then stp.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then stp.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then stp.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then stp.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then stp.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then stp.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then stp.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		stp.Addclass(sfloat)
	End If
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim sstitle As String = m.getdefault("title", "")
		Dim ssubtitle As String = m.getdefault("subtitle", "")
		If sskey = "" Then Continue
		stp.AddStep1(sskey, sstitle, ssubtitle, "")
		'
		AddNewLine(sb)
		AddComment(sb, $"Create the ${sstitle} step"$)
		AddCode(sb, $"Sub CreateContainer_${sskey} As VMContainer"$)
		sb.append($"Dim cont${sskey} As VMContainer"$).append(CRLF)
		AddCode(sb, $"cont${sskey} = vm.CreateContainer("cont${sskey}", Me)"$)
		If bisitemdiv Then
			AddCode(sb, $"cont${sskey}.SetDiv(True)"$)
		End If
		If bisitemnogutter Then
			AddCode(sb, $"cont${sskey}.SetNoGutters(True)"$)
		End If
		AddComment(sb, "Add components for the container here!")
		AddNewLine(sb)
		AddCode(sb, $"Return cont${sskey}"$)
		AddCode(sb, $"End Sub"$)
		AddNewLine(sb)

	Next
	ui.AddControl(stp.Stepper, stp.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	AddCode(sb, $"Dim stp${sname} As VMStepper = vm.CreateStepper("stp${sname}", Me)"$)
	CodeLine(sb, bisAltlabels, "b", "stp", sname, "SetAltlabels")
	CodeLine(sb, bisdark, "b", "stp", sname, "SetDark")
	CodeLine(sb, bislight, "b", "stp", sname, "SetLight")
	CodeLine(sb, bisNonlinear, "b", "stp", sname, "SetNonlinear")
	CodeLine(sb, sStepactive, "s", "stp", sname, "SetStepactive")
	CodeLine(sb, bisvertical, "b", "stp", sname, "SetVertical")
	CodeLine(sb, bisVisible, "b", "stp", sname, "SetVisible")
	'
	Dim pres As String = "stp"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	If sfloat <> "" Then
		AddCode(sb, $"stp${sname}.AddClass("${sfloat}")"$)
	End If
	AddCode(sb, $"stp${sname}.SetOnChange(Me, "stp${sname}_change")"$)
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim sstitle As String = m.getdefault("title", "")
		Dim ssubtitle As String = m.getdefault("subtitle", "")
		If sskey = "" Then Continue
		AddCode(sb, $"Dim cont${sskey} As VMContainer = CreateContainer_${sskey}"$)
		AddCode(sb, $"stp${sname}.AddStep1("${sskey}", "${sstitle}", "${ssubtitle}", cont${sskey}.ToString)"$)
	Next
			
	sb.append($"${sparent}.AddControl(stp${sname}.Stepper, stp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	AddCode(sbEvents, $"Public Sub stp${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
	
End Sub

Sub Design_Tabs
	Dim tabs As VMTabs = ui.CreateTabs($"tbs${sname}"$, Me)
	tabs.SetStatic(True)
	tabs.SetTabSlider(bistabslider)
	tabs.SetActiveclass(sactiveclass)
	tabs.SetAlignwithtitle(bisAlignwithtitle)
	tabs.SetBackgroundcolorintensity(sBackgroundcolor, sBackgroundcolorintensity)
	tabs.SetCenteractive(bisCenteractive)
	tabs.SetCentered(bisCentered)
	tabs.SetColorintensity(sColor, sColorintensity)
	tabs.SetDark(bisdark)
	tabs.SetFixedtabs(bisFixedtabs)
	tabs.SetGrow(bisGrow)
	tabs.SetHeight(sheight)
	tabs.SetHideslider(bisHideslider)
	tabs.SetIconsandtext(bisIconsandtext)
	tabs.SetLight(bislight)
	tabs.SetMobilebreakpoint(smobilebreakpoint)
	tabs.SetNexticon(sNexticon)
	tabs.SetOptional(bisOptional)
	tabs.SetPrevicon(sPrevicon)
	tabs.SetRight(bisright)
	tabs.SetShowarrows(bisshowarrows)
	tabs.SetSlidercolorintensity(sSlidercolor, sSlidercolorintensity)
	tabs.SetSlidersize(sSlidersize)
	tabs.SetVertical(bisvertical)
	tabs.SetVisible(bisVisible)
	tabs.SetIconPosRight(bisiconposright)
	If smargintop <> "" Then tabs.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then tabs.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then tabs.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then tabs.AddClass("mr-" & smarginright)
	If smargins <> "" Then tabs.AddClass("ms-" & smargins)
	If smargine <> "" Then tabs.AddClass("me-" & smargine)
	If smarginx <> "" Then tabs.AddClass("mx-" & smarginx)
	If smarginy <> "" Then tabs.AddClass("my-" & smarginy)
	If smargina <> "" Then tabs.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then tabs.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then tabs.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then tabs.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then tabs.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then tabs.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then tabs.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then tabs.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then tabs.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then tabs.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		tabs.Addclass(sfloat)
	End If
	'
	'source code
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssiconname As String = m.getdefault("icon", "")
		Dim sstitle As String = m.getdefault("title", "")
		If sskey = "" Then Continue
		tabs.AddTab(sskey, sstitle, ssiconname, Null)
		'create the containers
		AddNewLine(sb)
		AddComment(sb, $"Create the ${sstitle} tab"$)
		AddCode(sb, $"Sub CreateContainer_${sskey} As VMContainer"$)
		sb.append($"Dim cont${sskey} As VMContainer"$).append(CRLF)
		AddCode(sb, $"cont${sskey} = vm.CreateContainer("cont${sskey}", Me)"$)
		If bisitemdiv Then
			AddCode(sb, $"cont${sskey}.SetDiv(True)"$)
		End If
		If bisitemnogutter Then
			AddCode(sb, $"cont${sskey}.SetNoGutters(True)"$)
		End If
		AddComment(sb, "Add components for the container here!")
		AddNewLine(sb)
		AddCode(sb, $"Return cont${sskey}"$)
		AddCode(sb, $"End Sub"$)
		AddNewLine(sb)
	Next
	ui.AddControl(tabs.Tabs, tabs.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	'
	AddCode(sb, $"Dim tbs${sname} As VMTabs = vm.CreateTabs("tbs${sname}", Me)"$)
	CodeLine(sb, bistabslider, "b", "tbs", sname, "SetTabSlider")
	CodeLine(sb, sactiveclass, "s", "tbs", sname, "SetActiveclass")
	CodeLine(sb, bisAlignwithtitle, "b", "tbs", sname, "SetAlignwithtitle")
	CodeLine2(sb, sBackgroundcolor, sBackgroundcolorintensity, "s", "tbs", sname, "SetBackgroundcolorintensity")
	CodeLine(sb, bisCenteractive, "b", "tbs", sname, "SetCenteractive")
	CodeLine(sb, bisCentered, "b", "tbs", sname, "SetCentered")
	CodeLine2(sb, sColor, sColorintensity, "s", "tbs", sname, "SetColorintensity")
	CodeLine(sb, bisdark, "b", "tbs", sname, "SetDark")
	CodeLine(sb, bisFixedtabs, "b", "tbs", sname, "SetFixedtabs")
	CodeLine(sb, bisGrow, "b", "tbs", sname, "SetGrow")
	CodeLine(sb, sheight, "s", "tbs", sname, "SetHeight")
	If sfloat <> "" Then
		AddCode(sb, $"tbs${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bisHideslider, "b", "tbs", sname, "SetHideslider")
	CodeLine(sb, bisiconposright, "b", "tbs", sname, "SetIconposright")
	CodeLine(sb, bisIconsandtext, "b", "tbs", sname, "SetIconsandtext")
	CodeLine(sb, bislight, "b", "tbs", sname, "SetLight")
	CodeLine(sb, smobilebreakpoint, "s", "tbs", sname, "SetMobilebreakpoint")
	CodeLine(sb, sNexticon, "s", "tbs", sname, "SetNexticon")
	CodeLine(sb, bisOptional, "b", "tbs", sname, "SetOptional")
	CodeLine(sb, sPrevicon, "s", "tbs", sname, "SetPrevicon")
	CodeLine(sb, bisright, "b", "tbs", sname, "SetRight")
	CodeLine(sb, bisshowarrows, "b", "tbs", sname, "SetShowarrows")
	CodeLine2(sb, sSlidercolor, sSlidercolorintensity, "s", "tbs", sname, "SetSlidercolorintensity")
	CodeLine(sb, sSlidersize, "s", "tbs", sname, "SetSlidersize")
	CodeLine(sb, bisvertical, "b", "tbs", sname, "SetVertical")
	CodeLine(sb, bisVisible, "b", "tbs", sname, "SetVisible")
	'
	Dim pres As String = "tbs"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	AddCode(sb, $"tbs${sname}.SetOnChange(me, "tbs${sname}_change")"$)
	'
	AddCode(sbEvents, $"Public Sub tbs${sname}_change(value As Object)"$)
	AddCode(sbEvents, $"VM.ShowSnackBarSuccess(value)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssiconname As String = m.getdefault("icon", "")
		Dim sstitle As String = m.getdefault("title", "")
		If sskey = "" Then Continue
		AddCode(sb, $"Dim cont${sskey} As VMContainer = CreateContainer_${sskey}"$)
		AddCode(sb, $"tbs${sname}.AddTab("${sskey}", "${sstitle}", "${ssiconname}", cont${sskey})"$)
	Next
		
	sb.append($"${sparent}.AddControl(tbs${sname}.Tabs, tbs${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

#Region Stepper
Sub PropertyBag_Stepper
	vm.setdata("pbstepper", False)
	lstBags.add("pbstepper")
	pbstepper = vm.CreateProperty("ppbstepper", Me)
	pbstepper.SetChangeEvent("SavePropertyBag")
	pbstepper.SetVShow("pbstepper")
	pbstepper.AddHeading("d","Details")
	pbstepper.AddText("d","id","ID","","")
	pbstepper.AddText("d", "controltype", "Type", "","stepper")
	pbstepper.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbstepper.AddText("d","vmodel","VModel","","")
	pbstepper.AddText("d","stepactive","StepActive","","")
	pbstepper.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbstepper.AddHeading("a", "Items")
	pbstepper.AddCrudList("a", CreateMap("key":"Item Key", "title":"Title", "subtitle":"Description"))
	'
	pbstepper.AddHeading("m","Margins & Padding")
	pbstepper.AddMarginsPaddings("m")
	
	pbstepper.AddHeading("e","Settings")
	pbstepper.AddSwitches("e", CreateMap("isitemdiv": "ItemDiv", "isitemnogutter": "ItemNoGutter"))
	pbstepper.AddSwitches("e", CreateMap("isaltlabels": "AltLabels", "isdark": "Dark"))
	pbstepper.AddSwitches("e", CreateMap("islight": "Light", "isnonlinear": "NonLinear"))
	pbstepper.AddSwitches("e", CreateMap("isvertical": "Vertical", "isvisible": "Visible"))
	'
	pbstepper.AddHeading("f","Matrix")
	pbstepper.AddMatrix("f")
	'
	vm.container.AddComponent(1, 3, pbstepper.tostring)
End Sub
#End Region

Sub Read_Stepper
	bisAltlabels = YesNoToBoolean(mattr.getdefault("isaltlabels", "No"))
	bisdark = YesNoToBoolean(mattr.getdefault("isdark", "No"))
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	bisNonlinear = YesNoToBoolean(mattr.getdefault("isnonlinear", "No"))
	sStepactive = mattr.getdefault("stepactive", "")
	bisvertical = YesNoToBoolean(mattr.getdefault("isvertical", "No"))
	bisVisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
End Sub

#Region ExpansionPanels
Sub PropertyBag_ExpansionPanels
	vm.setdata("pbexpansionpanels", False)
	lstBags.add("pbexpansionpanels")
	pbexpansionpanels = vm.CreateProperty("ppbexpansionpanels", Me)
	pbexpansionpanels.SetChangeEvent("SavePropertyBag")
	pbexpansionpanels.SetVShow("pbexpansionpanels")
	pbexpansionpanels.AddHeading("d","Details")
	pbexpansionpanels.AddText("d","id","ID","","")
	pbexpansionpanels.AddText("d", "controltype", "Type", "","expansionpanels")
	pbexpansionpanels.AddSelect1("d", "parent", "Parent", "containers", "component", "component")
	pbexpansionpanels.AddText("d","vmodel","VModel","","")
	pbexpansionpanels.AddText("d","activepanel","Active","","1")
	pbexpansionpanels.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbexpansionpanels.AddHeading("a", "Items")
	pbexpansionpanels.AddCrudList("a", CreateMap("key":"Item Key", "title":"Title"))
	'
	pbexpansionpanels.AddHeading("m","Margins & Padding")
	pbexpansionpanels.AddMarginsPaddings("m")
	
	pbexpansionpanels.AddHeading("e","Settings")
	pbexpansionpanels.AddSwitches("e", CreateMap("isitemdiv": "ItemDiv", "isitemnogutter": "ItemNoGutter"))
	pbexpansionpanels.AddSwitches("e", CreateMap("isaccordion": "Accordion", "isdark": "Dark"))
	pbexpansionpanels.AddSwitches("e", CreateMap("isdisabled": "Disabled", "isflat": "Flat"))
	pbexpansionpanels.AddSwitches("e", CreateMap("isfocusable": "Focusable", "ishover": "Hover"))
	pbexpansionpanels.AddSwitches("e", CreateMap("isinset": "Inset", "islight": "Light"))
	pbexpansionpanels.AddSwitches("e", CreateMap("ismandatory": "Mandatory", "ismultiple": "Multiple"))
	pbexpansionpanels.AddSwitches("e", CreateMap("ispopout": "Popout", "isreadonly": "Readonly"))
	pbexpansionpanels.AddSwitches("e", CreateMap("istile": "Tile", "isvisible": "Visible"))
	pbexpansionpanels.AddHeading("f","Matrix")
	pbexpansionpanels.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbexpansionpanels.tostring)
End Sub
#End Region

Sub Read_ExpansionPanels
	bisAccordion = YesNoToBoolean(mattr.getdefault("isaccordion", "No"))
	sActivepanel = mattr.getdefault("activepanel", "")
	bisdark = YesNoToBoolean(mattr.getdefault("isdark", "No"))
	bisDisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
	bisflat = YesNoToBoolean(mattr.getdefault("isflat", "No"))
	bisFocusable = YesNoToBoolean(mattr.getdefault("isfocusable", "No"))
	bisHover = YesNoToBoolean(mattr.getdefault("ishover", "No"))
	bisinset = YesNoToBoolean(mattr.getdefault("isinset", "No"))
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	bismandatory = YesNoToBoolean(mattr.getdefault("ismandatory", "No"))
	bismultiple = YesNoToBoolean(mattr.getdefault("ismultiple", "No"))
	bisPopout = YesNoToBoolean(mattr.getdefault("ispopout", "No"))
	bistile = YesNoToBoolean(mattr.getdefault("istile", "No"))
	bisVisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
End Sub

Sub Design_ExpansionPanels
	Dim expnl As VMExpansionPanels = ui.CreateExpansionPanels($"exp${sname}"$, Me)
	expnl.SetStatic(True)
	expnl.SetAccordion(bisAccordion)
	expnl.SetActivePanel(sActivepanel)
	expnl.SetDark(bisdark)
	expnl.SetDisabled(bisDisabled)
	expnl.SetFlat(bisflat)
	expnl.SetFocusable(bisFocusable)
	expnl.SetHover(bisHover)
	expnl.SetInset(bisinset)
	expnl.SetLight(bislight)
	expnl.SetMandatory(bismandatory)
	expnl.SetMultiple(bismultiple)
	expnl.SetPopout(bisPopout)
	expnl.SetReadonly(bisreadonly)
	expnl.SetTile(bistile)
	expnl.SetVisible(bisVisible)
	If smargintop <> "" Then expnl.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then expnl.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then expnl.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then expnl.AddClass("mr-" & smarginright)
	If smargins <> "" Then expnl.AddClass("ms-" & smargins)
	If smargine <> "" Then expnl.AddClass("me-" & smargine)
	If smarginx <> "" Then expnl.AddClass("mx-" & smarginx)
	If smarginy <> "" Then expnl.AddClass("my-" & smarginy)
	If smargina <> "" Then expnl.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then expnl.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then expnl.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then expnl.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then expnl.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then expnl.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then expnl.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then expnl.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then expnl.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then expnl.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		expnl.Addclass(sfloat)
	End If
	'
	'source code
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim sstitle As String = m.getdefault("title", "")
		If sskey = "" Then Continue
		expnl.AddPanel1(sskey, sstitle, Null)
		'create the containers
		AddNewLine(sb)
		AddComment(sb, $"Create the ${sstitle} tab"$)
		AddCode(sb, $"Sub CreateContainer_${sskey} As VMContainer"$)
		sb.append($"Dim cont${sskey} As VMContainer"$).append(CRLF)
		AddCode(sb, $"cont${sskey} = vm.CreateContainer("cont${sskey}", Me)"$)
		If bisitemdiv Then
			AddCode(sb, $"cont${sskey}.SetDiv(True)"$)
		End If
		If bisitemnogutter Then
			AddCode(sb, $"cont${sskey}.SetNoGutters(True)"$)
		End If
		AddComment(sb, "Add components for the container here!")
		AddNewLine(sb)
		AddCode(sb, $"Return cont${sskey}"$)
		AddCode(sb, $"End Sub"$)
		AddNewLine(sb)
	Next
	ui.AddControl(expnl.ExpansionPanels, expnl.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
'
	AddCode(sb, $"Dim exp${sname} As VMExpansionPanels = vm.CreateExpansionPanels("exp${sname}", Me)"$)
	CodeLine(sb, bisAccordion, "b", "exp", sname, "SetAccordion")
	CodeLine(sb, sActivepanel, "s", "exp", sname, "SetActivepanel")
	CodeLine(sb, bisdark, "b", "exp", sname, "SetDark")
	CodeLine(sb, bisDisabled, "b", "exp", sname, "SetDisabled")
	CodeLine(sb, bisflat, "b", "exp", sname, "SetFlat")
	CodeLine(sb, bisFocusable, "b", "exp", sname, "SetFocusable")
	CodeLine(sb, bisHover, "b", "exp", sname, "SetHover")
	CodeLine(sb, bisinset, "b", "exp", sname, "SetInset")
	CodeLine(sb, bislight, "b", "exp", sname, "SetLight")
	If sfloat <> "" Then
		AddCode(sb, $"exp${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, bismandatory, "b", "exp", sname, "SetMandatory")
	CodeLine(sb, bismultiple, "b", "exp", sname, "SetMultiple")
	CodeLine(sb, bisPopout, "b", "exp", sname, "SetPopout")
	CodeLine(sb, bisreadonly, "b", "exp", sname, "SetReadonly")
	CodeLine(sb, bistile, "b", "exp", sname, "SetTile")
	CodeLine(sb, bisVisible, "b", "exp", sname, "SetVisible")
	'
	Dim pres As String = "exp"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim sstitle As String = m.getdefault("title", "")
		If sskey = "" Then Continue
		AddCode(sb, $"Dim cont${sskey} As VMContainer = CreateContainer_${sskey}"$)
		AddCode(sb, $"exp${sname}.AddPanel1("${sskey}", "${sstitle}", cont${sskey})"$)
	Next
	sb.append($"${sparent}.AddControl(exp${sname}.ExpansionPanels, exp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)

	'
	AddNewLine(sb)
	AddCode(sbEvents, $"Private Sub exp${sname}_click(e As BANanoEvent)"$)
	AddCode(sbEvents, $"Dim expid As String = vm.GetIDFromEvent(e)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
	'
End Sub

#Region Builder
Sub PropertyBag_Builder
	vm.setdata("pbbuilder", False)
	lstBags.add("pbbuilder")
	pbbuilder = vm.CreateProperty("ppbbuilder", Me)
	pbbuilder.SetChangeEvent("SavePropertyBag")
	pbbuilder.SetVShow("pbbuilder")
	pbbuilder.AddHeading("d","Details")
	pbbuilder.AddText("d","id","ID","","")
	pbbuilder.AddText("d", "controltype", "Type", "","builder")
	pbbuilder.AddText2("d",CreateMap("prefix":"Prefix", "vmodel":"Instance"))
	pbbuilder.AddSelect("d", "buildertype", "BuilderType", CreateMap("classname":"Class","customview":"View","codemodule":"Code","vuejs":"Vue","bananoview":"BANano"))
	pbbuilder.AddText2("d", CreateMap("tag":"Tag"))
	pbbuilder.AddTextArea("d","decription","Decription","","")
	
	pbbuilder.AddHeading("a","Items")
	pbbuilder.AddDesignerProperties("a")
	 
	vm.container.AddComponent(1, 3, pbbuilder.tostring)
End Sub
#End Region

Sub Read_Builder
	sBuildertype = mattr.getdefault("buildertype", "")
	sDecription = mattr.getdefault("decription", "")
	sPrefix = mattr.getdefault("prefix", "")
	stag = mattr.getdefault("tag", "")
End Sub

Sub Design_Builder

End Sub

#Region Page
Sub PropertyBag_Page
	vm.setdata("pbpage", False)
	lstBags.add("pbpage")
	pbpage = vm.CreateProperty("ppbpage", Me)
	pbpage.SetChangeEvent("SavePropertyBag")
	pbpage.SetVShow("pbpage")
	pbpage.AddHeading("d","Details")
	pbpage.AddText("d","id","ID","","")
	pbpage.AddText("d", "controltype", "Type", "","page")
	pbpage.AddText2("d",CreateMap("vmodel":"Name"))
	pbpage.AddText("d","pagetitle","Title","","")
	pbpage.AddText("d","iconname","Icon Name","","")
	pbpage.AddText("d","tooltip","Tooltip","","")
	pbpage.AddSelect2("d","iconcolor","Icon Color", vm.ColorOptions, "iconcolorintensity","IconColor Intensity", vm.IntensityOptions)
	pbpage.AddTextArea("d","description","Description","","")
	pbpage.AddTextArea("d","keywords","KeyWords","","")
	'
	pbpage.AddHeading("e","Settings")
	pbpage.AddSwitches("e", CreateMap("isnavbarvisible": "NavBarVisible", "isdrawervisible": "DrawerVisible"))
	pbpage.AddSwitches("e", CreateMap("ishamburgervisible": "HamburgerVisible", "islogovisible": "LogoVisible"))
	pbpage.AddSwitches("e", CreateMap("isshowondrawer": "ShowOnDrawer", "isshowonnavbar": "ShowOnNavBar"))
	pbpage.AddSwitches("e", CreateMap("isupdatenavtitle": "UpdateNavTitle","isdivider":"AddDivider"))
	pbpage.AddSwitches("e", CreateMap("isinsetdivider": "Inset Divider","isicon":"NavIcon"))
	vm.container.AddComponent(1, 3, pbpage.tostring)
End Sub
#End Region


Sub Read_Page
	stooltip = mattr.GetDefault("tooltip", "")
	sDescription = mattr.getdefault("description", "")
	bisDrawervisible = YesNoToBoolean(mattr.getdefault("isdrawervisible", "No"))
	bisHamburgervisible = YesNoToBoolean(mattr.getdefault("ishamburgervisible", "No"))
	sIconcolor = mattr.getdefault("iconcolor", "")
	sIconcolorintensity = mattr.getdefault("iconcolorintensity", "")
	siconname = mattr.getdefault("iconname", "")
	sKeywords = mattr.getdefault("keywords", "")
	bislogovisible = YesNoToBoolean(mattr.getdefault("islogovisible", "No"))
	bisNavbarvisible = YesNoToBoolean(mattr.getdefault("isnavbarvisible", "No"))
	spagetitle = mattr.getdefault("pagetitle", "")
	bisShowondrawer = YesNoToBoolean(mattr.getdefault("isshowondrawer", "No"))
	bisShowonnavbar = YesNoToBoolean(mattr.getdefault("isshowonnavbar", "No"))
	bisUpdatenavtitle = YesNoToBoolean(mattr.getdefault("isupdatenavtitle", "No"))
	bisdivider = YesNoToBoolean(mattr.getdefault("isdivider", "No"))
	bisinsetdivider = YesNoToBoolean(mattr.getdefault("isinsetdivider", "No"))
	bisicon = YesNoToBoolean(mattr.getdefault("isicon", "No"))
End Sub

Sub Design_Page
	'just a drawer for show
	
	Dim sbi As StringBuilder
	sbi.initialize
	'
	Dim mdlName As String = $"pg${svmodel}"$
	
	'draw a fake drawer
	Dim drawer As VMNavigationDrawer = ui.CreateDrawer("drawerx", Me)
	Dim tbl As VMToolBar = ui.CreateToolbar("tblx", Me)
	'
	AddInstruction(sbi, "pgIndex", "AddPages" , "")
	AddComment(sbi, $"code to add the ${svmodel} template code to the master HTML template"$)
	AddCode(sbi, $"vm.AddPage(${mdlName}.name, ${mdlName})"$)
	AddCode(sbi, CRLF)
	
	AddComment(sb, "INSTRUCTION: In your B4J project, click Project > Add New Module > Code Module")
	AddComment(sb, $"INSTRUCTION: Type "${mdlName}" as the module name and click Ok"$)
	AddNewLine(sb)
	
	If  bisShowonnavbar Then
		'navigation bar
		AddInstruction(sb, "pgIndex", "BuildNavBar" , "")
		AddComment(sb,$"this page should have an icon/button in the navbar"$)
		If bisicon Then
			AddCode(sb, $"vm.NavBar.AddIcon1("nav${svmodel}", "${siconname}", "${sIconcolor}","${stooltip}", "")"$)
		Else
			AddCode(sb, $"vm.NavBar.AddButton1("nav${svmodel}", "${siconname}", "${spagetitle}", "${stooltip}", "")"$)
		End If
		AddNewLine(sb)
		'
		'**** NAV CLICK TO SHOW PAGE
		AddInstruction(sb, "pgIndex", "" , "")
		AddComment(sb, $"click ${mdlName} nav button"$)
		AddCode(sb, $"Sub nav${svmodel}_click(e As BANanoEvent)"$)
		AddComment(sb, $"show the page ${stitle}"$)
		AddCode(sb, $"${mdlName}.Show"$)
		AddCode(sb, "End Sub")
		AddCode(sb, CRLF)
	End If
	'
	'show on drawer
	If bisShowondrawer Then
		AddInstruction(sb, "pgIndex", "BuildNavDrawer", "")
		AddComment(sb,$"Add ${spagetitle} to drawer"$)
		AddCode(sb, $"vm.Drawer.AddIcon1("page${svmodel}", "${siconname}", "${sIconcolor}", "${spagetitle}", "${stooltip}")"$)
		If bisdivider Then
			AddCode(sb, $"vm.Drawer.AddDivider1(${bisinsetdivider})"$)
		End If
		AddNewLine(sb)
		'**** DRAWER CLICK TO SHOW PAGE
		AddInstruction(sb, "pgIndex", "draweritems_click" , "inside the case statement")
		AddCode(sb, $"Case "page${svmodel.tolowercase}""$)
		AddComment(sb, $"show ${stitle}"$)
		AddCode(sb, $"${mdlName}.Show"$)
		AddCode(sb, CRLF)
	End If
	'
	AddComment(sb, $"INSTRUCTION: Press and hold Crtl+A to select all code and press Delete key, this will delete all the code"$)
	AddInstruction(sb, mdlName, "" , "")
	AddCode(sb, $"'Static code module"$)
	AddCode(sb, $"#IgnoreWarnings:12"$)
	AddCode(sb, $"Sub Process_Globals"$)
	AddCode(sb, $"Public Name As String = "${svmodel}Code""$)
	AddCode(sb, $"Public Title As String = "${spagetitle}""$)
	AddCode(sb, $"Private vm As BANanoVM"$)
	AddCode(sb, "Private vue As BANanoVue")
	AddCode(sb, $"Private BANano As BANano  'ignore"$)
	sb.append($"Private cont As VMContainer"$).append(CRLF)
	AddCode(sb, "End Sub")
	AddNewLine(sb)
	'code for the page
	AddCode(sb, "Sub Code")
	AddComment(sb, "Establish a reference to the app")
	AddCode(sb, "vm = pgIndex.vm")
	AddCode(sb, "vue = vm.vue")
	AddComment(sb, "create a container to hold all contents based on the page name")
	AddCode(sb, $"cont = vm.CreateContainer(Name, Me)"$)
	AddComment(sb, "the container should be hidden initialy")
	AddCode(sb, "cont.Hide")
	AddComment(sb, "Add component here")
	AddNewLine(sb)
	AddComment(sb, "add container to the page")
	AddCode(sb, "vm.AddContainer(cont)")
	AddNewLine(sb)
	'
	drawer.SetStatic(True)
	drawer.Setabsolute(True)
	'draw a fake toolbar
	tbl.SetStatic(True)
	tbl.SetFixed(True)
	'
	If bisHamburgervisible Then
		tbl.AddHamburger
		tbl.SetHasMenuButton(True)
	End If
	'
	If bislogovisible Then
		tbl.Logo.SetBorderRadius("50%")
		tbl.Logo.SetBorder("1px", vm.COLOR_BLACK, vm.BORDER_SOLID)
		tbl.Logo.SetSize("46px", "46px")
		tbl.AddLogo("./assets/sponge.png")
	End If
	
	If bisUpdatenavtitle Then
		tbl.AddTitle(spagetitle,"")
	Else
		tbl.AddTitle(Main.appName,"")
	End If
	tbl.AddSpacer
	
	'show in navbar
	If  bisShowonnavbar Then
		'navigation bar
		If bisicon Then
			tbl.AddIcon1(svmodel, siconname, sIconcolor, stooltip, "")
		Else
			tbl.AddButton1(svmodel, siconname, spagetitle, stooltip, "")
		End If
	End If
	'show on drawer
	If bisShowondrawer Then
		drawer.AddIcon1("drw" & svmodel, siconname, sIconcolor, spagetitle, stooltip)
		If bisdivider Then
			drawer.AddDivider1(bisinsetdivider)
		End If
	End If
	'
	AddCode(sb, "End Sub")
	AddNewLine(sb)
	'
	'***** SHOW PAGE
	AddComment(sb,"show the page")
	AddCode(sb, "Sub Show")
	If bisNavbarvisible Then
		AddComment(sb, "the navbar is visible for this page")
		AddCode(sb,"vm.NavBar.Show")
		tbl.Show
	Else
		AddComment(sb, "the navbar is hidden for this page")
		AddCode(sb, "vm.NavBar.Hide")
		tbl.hide
	End If
	'
	If bisHamburgervisible Then
		AddComment(sb, "show the hamburger for this page")
		AddCode(sb, "vm.NavBar.Hamburger.SetVisible(True)")
		tbl.Hamburger.SetVisible(True)
	Else
		AddComment(sb, "hide the hamburger for this page")
		AddCode(sb, "vm.NavBar.Hamburger.SetVisible(False)")
		tbl.Hamburger.SetVisible(False)
	End If
	'
	If bisDrawervisible Then
		AddComment(sb, "the drawer should be visible for this page")
		AddCode(sb, "vm.Drawer.Show")
		drawer.Show
	Else
		AddComment(sb, "the drawer should be hidden for this page")
		AddCode(sb, "vm.Drawer.Hide")
		drawer.Hide
	End If
	'
	If bislogovisible Then
		AddComment(sb, "the logo should be visible for this page")
		AddCode(sb, "vm.NavBar.Logo.Show")
		tbl.Logo.Show
	Else
		AddComment(sb, "the logo should be hidden for this page")
		AddCode(sb, "vm.NavBar.Logo.Hide")
		tbl.Logo.Hide
	End If
	
	'update the navbar title
	If bisUpdatenavtitle Then
		AddComment(sb, "update the navbar title")
		AddCode(sb, $"vm.NavBar.UpdateTitle("${spagetitle}")"$)
		tbl.UpdateTitle(spagetitle)
	End If
	'
	If  bisShowonnavbar Then
		AddComment(sb, $"show buttons for ${mdlName}"$)
		AddCode(sb, $"vm.ShowItem("nav${svmodel}")"$)
	Else
		AddCode(sb, $"vm.HideItem("nav${svmodel}")"$)
	End If
	
	AddComment(sb, "Show the page and hide others")
	AddCode(sb, $"vm.ShowPage(Name)"$)
	AddCode(sb, "End Sub")
	AddNewLine(sb)
	AddNewLine(sb)
	sb.append(sbi.tostring)
	'show the stuff
	If bisDrawervisible Then
		ui.AddControl(drawer.NavigationDrawer, drawer.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	End If
	
	If bisNavbarvisible Then
		ui.AddControl(tbl.ToolBar, tbl.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	End If
End Sub

#Region Quill
Sub PropertyBag_Quill
	vm.setdata("pbquill", False)
	lstBags.add("pbquill")
	pbquill = vm.CreateProperty("ppbquill", Me)
	pbquill.SetChangeEvent("SavePropertyBag")
	pbquill.SetVShow("pbquill")
	pbquill.AddHeading("d","Details")
	pbquill.AddText("d","id","ID","","")
	pbquill.AddText("d", "controltype", "Type", "","quill")
	pbquill.AddSelectDS("d", "parent", "Parent", "containers", "component", "component", "")
	pbquill.AddText("d","vmodel","VModel","","")
	pbquill.AddText2("d",CreateMap("height":"Height", "width":"Width"))
	pbquill.AddText("d","errortext","Error Text","","")
	pbquill.AddText("d","tabindex","TabIndex","","")
	pbquill.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbquill.AddHeading("m","Margins & Padding")
	pbquill.AddMarginsPaddings("m")
	
	pbquill.AddHeading("e","Settings")
	pbquill.AddSwitches("e", CreateMap("isrequired": "Required", "isvisible": "Visible"))
	'
	pbquill.AddHeading("f","Matrix")
	pbquill.AddMatrix("f")
	'
	vm.container.AddComponent(1, 3, pbquill.tostring)
End Sub
#End Region


Sub Read_Quill
	sheight = mattr.getdefault("height", "")
	bisrequired = YesNoToBoolean(mattr.getdefault("isrequired", "No"))
	stabindex = mattr.getdefault("tabindex", "")
	bisVisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
	swidth = mattr.getdefault("width", "")
	serrortext = mattr.getdefault("errortext", "")
End Sub

Sub Design_Quill
	AddCode(sbRead, $"Dim s${svmodel} As String = Record.Get("${svmodel}")"$)
	'
	Dim Q As VMQuill
	Q.Initialize(vue, $"q${sname}"$, Me)
	Q.SetStatic(True)
	Q.SetDesignMode(True) 
	Q.SetHeight(sheight)
	Q.SetWidth(swidth)
	Q.SetRequired(bisrequired)
	Q.SetTabindex(stabindex)
	Q.SetVisible(bisVisible)
	If smargintop <> "" Then Q.AddClass("mt-" & smargintop)
If smarginbottom <> "" Then Q.AddClass("mb-" & smarginbottom)
If smarginleft <> "" Then Q.AddClass("ml-" & smarginleft)
If smarginright <> "" Then Q.AddClass("mr-" & smarginright)
If smargins <> "" Then Q.AddClass("ms-" & smargins)
If smargine <> "" Then Q.AddClass("me-" & smargine)
If smarginx <> "" Then Q.AddClass("mx-" & smarginx)
If smarginy <> "" Then Q.AddClass("my-" & smarginy)
If smargina <> "" Then Q.AddClass("ma-" & smargina)
If spaddingtop <> "" Then Q.AddClass("pt-" & spaddingtop)
If spaddingbottom <> "" Then Q.AddClass("pb-" & spaddingbottom)
If spaddingleft <> "" Then Q.AddClass("pl-" & spaddingleft)
If spaddingright <> "" Then Q.AddClass("pr-" & spaddingright)
If spaddings <> "" Then Q.AddClass("ps-" & spaddings)
If spaddinge <> "" Then Q.AddClass("pe-" & spaddinge)
If spaddingx <> "" Then Q.AddClass("px-" & spaddingx)
If spaddingy <> "" Then Q.AddClass("py-" & spaddingy)
If spaddinga <> "" Then Q.AddClass("pa-" & spaddinga)


	If sfloat <> "" Then
		q.Addclass(sfloat)
	End If
	ui.AddControl(Q.Quill, Q.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddNewLine(sb)
	AddCode(sb, $"'INSTRUCTION: Copy & paste the code below to where your "${sparent}" is being built!"$)
	AddNewLine(sb)
	
	AddCode(sb, $"Dim q${sname} As VMQuill"$)
	AddCode(sb, $"q${sname}.Initialize(vue, "q${sname}", Me)"$)
	CodeLine(sb, sheight, "s", "q", sname, "SetHeight")
	CodeLine(sb, bisrequired, "b", "q", sname, "SetRequired")
	CodeLine(sb, stabindex, "s", "q", sname, "SetTabindex")
	CodeLine(sb, bisVisible, "b", "q", sname, "SetVisible")
	CodeLine(sb, swidth, "s", "q", sname, "SetWidth")
	CodeLine(sb, sname, "s", "q", sname, "SetVModel")
	'
	Dim pres As String = "q"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	If sfloat <> "" Then
		AddCode(sb, $"q${sname}.AddClass("${sfloat}")"$)
	End If
	'
	AddCode(sb, $"q${sname}.SetOnFocus("q${sname}_focus")"$)
	AddCode(sb, $"q${sname}.SetOnTextChange("q${sname}_textchange")"$)
	AddCode(sb, $"q${sname}.SetOnBlur("q${sname}_blur")"$)
	AddCode(sb, $"q${sname}.SetOnSelectionChange("q${sname}_selectionchange")"$)
	'	
	sb.append($"${sparent}.AddControl(q${sname}.Quill, q${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub q${sname}_focus()"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
	'
	AddCode(sbEvents, $"Private Sub q${sname}_textchange()"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
'
	AddCode(sbEvents, $"Private Sub q${sname}_blur()"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
	'
	AddCode(sbEvents, $"Private Sub q${sname}_selectionchange()"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

#Region InfoBox
Sub PropertyBag_InfoBox
	vm.setdata("pbinfobox", False)
	lstBags.add("pbinfobox")
	pbinfobox = vm.CreateProperty("ppbinfobox", Me)
	pbinfobox.SetChangeEvent("SavePropertyBag")
	pbinfobox.SetVShow("pbinfobox")
	pbinfobox.AddHeading("d","Details")
	pbinfobox.AddText("d","id","ID","","")
	pbinfobox.AddText("d", "controltype", "Type", "","infobox")
	pbinfobox.AddSelectDS("d", "parent", "Parent", "containers", "component", "component", "")
	pbinfobox.AddText("d","vmodel","ID","","")
	pbinfobox.AddText("d","icon","Icon","","")
	pbinfobox.AddText("d","text","Text","","")
	pbinfobox.AddText2("d",CreateMap("decimal":"Decimal", "decimals":"Decimals"))
	pbinfobox.AddText2("d",CreateMap("prefix":"Prefix", "suffix":"Suffix"))
	pbinfobox.AddText2("d",CreateMap("from":"From", "to":"To"))
	pbinfobox.AddText2("d",CreateMap("duration":"Duration","separator":"Separator"))
	pbinfobox.AddSelect2("d","iconcolor","IconColor", vm.ColorOptions, "iconbackgroundcolor","IconBackgroundColor", vm.ColorOptions)
	pbinfobox.AddSelect2("d","color","Color", vm.ColorOptions, "backgroundcolor","BackgroundColor", vm.ColorOptions)
	pbinfobox.AddRadioGroupH("d", "infotype", "Type", CreateMap("stylenone":"1","style2":"2","style3":"3","style4":"4"))
	pbinfobox.AddSelect("d","float", "Float", vm.Floats)
	
	'
	pbinfobox.AddHeading("m","Margins & Padding")
	pbinfobox.AddMarginsPaddings("m")
	
	pbinfobox.AddHeading("e","Settings")
	pbinfobox.AddSwitches("e", CreateMap("isautoplay": "Autoplay"))
	pbinfobox.AddSwitches("e", CreateMap("ishoverexpandeffect": "HoverExpandEffect"))
	pbinfobox.AddSwitches("e", CreateMap("ishoverzoomeffect": "HoverZoomEffect"))
	pbinfobox.AddSwitches("e", CreateMap("isvisible": "Visible", "isdisabled": "Disabled"))
	'
	pbinfobox.AddHeading("f","Matrix")
	pbinfobox.AddMatrix("f")
	'
	vm.container.AddComponent(1, 3, pbinfobox.tostring)
End Sub
#End Region

Sub Read_InfoBox
	sBackgroundcolor = mattr.getdefault("backgroundcolor", "")
	sColor = mattr.getdefault("color", "")
	sinfotype = mattr.getdefault("infotype", "")
	bisDisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
	sDuration = mattr.getdefault("duration", "")
	sFrom = mattr.getdefault("from", "")
	bisHoverexpandeffect = YesNoToBoolean(mattr.getdefault("ishoverexpandeffect", "No"))
	bisHoverzoomeffect = YesNoToBoolean(mattr.getdefault("ishoverzoomeffect", "No"))
	sIcon = mattr.getdefault("icon", "")
	sIconbackgroundcolor = mattr.getdefault("iconbackgroundcolor", "")
	sIconcolor = mattr.getdefault("iconcolor", "")
	sText = mattr.getdefault("text", "")
	sTo = mattr.getdefault("to", "")
	bisVisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
	bisautoplay = YesNoToBoolean(mattr.getdefault("isautoplay", "No"))
	sDecimal = mattr.getdefault("decimal", "")
	sDecimals = mattr.getdefault("decimals", "")
	sPrefix = mattr.getdefault("prefix", "")
	sSeparator = mattr.getdefault("separator", "")
	sSuffix = mattr.getdefault("suffix", "")
End Sub

Sub Design_InfoBox
	Dim ib As VMInfoBox
	ib.Initialize(vue, "ib" & sname, Me)
	ib.SetStatic(True)
	ib.SetDesignMode(True)
	ib.SetDecimal(sDecimal)
	ib.SetDecimals(sDecimals)
	ib.SetAutoplay(bisautoplay)
	ib.SetPrefix(sPrefix)
	ib.SetSeparator(sSeparator)
	ib.SetSuffix(sSuffix)
	ib.SetBackgroundcolor(sBackgroundcolor)
	ib.SetColor(sColor)
	ib.SetDisabled(bisDisabled)
	ib.SetDuration(sDuration)
	ib.SetFrom(sFrom)
	ib.SetHoverexpandeffect(bisHoverexpandeffect)
	ib.SetHoverzoomeffect(bisHoverzoomeffect)
	ib.SetIcon(sIcon)
	ib.SetIconbackgroundcolor(sIconbackgroundcolor)
	ib.SetIconcolor(sIconcolor)
	If smargintop <> "" Then ib.AddClass("mt-" & smargintop)
	If smarginbottom <> "" Then ib.AddClass("mb-" & smarginbottom)
	If smarginleft <> "" Then ib.AddClass("ml-" & smarginleft)
	If smarginright <> "" Then ib.AddClass("mr-" & smarginright)
	If smargins <> "" Then ib.AddClass("ms-" & smargins)
	If smargine <> "" Then ib.AddClass("me-" & smargine)
	If smarginx <> "" Then ib.AddClass("mx-" & smarginx)
	If smarginy <> "" Then ib.AddClass("my-" & smarginy)
	If smargina <> "" Then ib.AddClass("ma-" & smargina)
	If spaddingtop <> "" Then ib.AddClass("pt-" & spaddingtop)
	If spaddingbottom <> "" Then ib.AddClass("pb-" & spaddingbottom)
	If spaddingleft <> "" Then ib.AddClass("pl-" & spaddingleft)
	If spaddingright <> "" Then ib.AddClass("pr-" & spaddingright)
	If spaddings <> "" Then ib.AddClass("ps-" & spaddings)
	If spaddinge <> "" Then ib.AddClass("pe-" & spaddinge)
	If spaddingx <> "" Then ib.AddClass("px-" & spaddingx)
	If spaddingy <> "" Then ib.AddClass("py-" & spaddingy)
	If spaddinga <> "" Then ib.AddClass("pa-" & spaddinga)


	Select Case sinfotype
	Case ""	
	Case "style2"
		ib.SetStyle2(True)
	Case "style3"
		ib.SetStyle3(True)
	Case "style4"
		ib.SetStyle4(True)
	End Select
	'
	ib.SetText(sText)
	ib.SetTo(sTo)
	ib.SetVisible(bisVisible)
	If sfloat <> "" Then
		ib.Addclass(sfloat)
	End If
	ui.AddControl(ib.InfoBox, ib.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddCode(sb, $"Dim ib${sname} As VMInfoBox"$)
	AddCode(sb, $"ib${sname}.Initialize(vue, "ib${sname}", Me)"$)
	CodeLine(sb, bisautoplay, "b", "ib", sname, "SetAutoplay")
	CodeLine(sb, sDecimal, "s", "ib", sname, "SetDecimal")
	CodeLine(sb, sDecimals, "s", "ib", sname, "SetDecimals")
	CodeLine(sb, sPrefix, "s", "ib", sname, "SetPrefix")
	CodeLine(sb, sSeparator, "s", "ib", sname, "SetSeparator")
	CodeLine(sb, sSuffix, "s", "ib", sname, "SetSuffix")
	If sfloat <> "" Then
		AddCode(sb, $"ib${sname}.AddClass("${sfloat}")"$)
	End If
	CodeLine(sb, sBackgroundcolor, "s", "ib", sname, "SetBackgroundcolor")
	CodeLine(sb, sColor, "s", "ib", sname, "SetColor")
	CodeLine(sb, bisDisabled, "b", "ib", sname, "SetDisabled")
	CodeLine(sb, sDuration, "s", "ib", sname, "SetDuration")
	CodeLine(sb, sFrom, "s", "ib", sname, "SetFrom")
	CodeLine(sb, bisHoverexpandeffect, "b", "ib", sname, "SetHoverexpandeffect")
	CodeLine(sb, bisHoverzoomeffect, "b", "ib", sname, "SetHoverzoomeffect")
	CodeLine(sb, sIcon, "s", "ib", sname, "SetIcon")
	CodeLine(sb, sIconbackgroundcolor, "s", "ib", sname, "SetIconbackgroundcolor")
	CodeLine(sb, sIconcolor, "s", "ib", sname, "SetIconcolor")
	Select Case sinfotype
	Case ""
	Case "style2"
		CodeLine(sb, True, "b", "ib", sname, "SetStyle2")
	Case "style3"
		CodeLine(sb, True, "b", "ib", sname, "SetStyle3")
	Case "style4"
		CodeLine(sb, True, "b", "ib", sname, "SetStyle4")
	End Select
	CodeLine(sb, sText, "s", "ib", sname, "SetText")
	CodeLine(sb, sTo, "s", "ib", sname, "SetTo")
	CodeLine(sb, bisVisible, "b", "ib", sname, "SetVisible")
	'
	Dim pres As String = "ib"
	CodeLine(sb, "mt-" & smargintop, "s", pres, sname, "AddClass")
	CodeLine(sb, "mb-" & smarginbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "ml-" & smarginleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "mr-" & smarginright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ms-" & smargins, "s", pres, sname, "AddClass")
	CodeLine(sb, "me-" & smargine, "s", pres, sname, "AddClass")
	CodeLine(sb, "mx-" & smarginx, "s", pres, sname, "AddClass")
	CodeLine(sb, "my-" & smarginy, "s", pres, sname, "AddClass")
	CodeLine(sb, "ma-" & smargina, "s", pres, sname, "AddClass")
	CodeLine(sb, "pt-" & spaddingtop, "s", pres, sname, "AddClass")
	CodeLine(sb, "pb-" & spaddingbottom, "s", pres, sname, "AddClass")
	CodeLine(sb, "pl-" & spaddingleft, "s", pres, sname, "AddClass")
	CodeLine(sb, "pr-" & spaddingright, "s", pres, sname, "AddClass")
	CodeLine(sb, "ps-" & spaddings, "s", pres, sname, "AddClass")
	CodeLine(sb, "pe-" & spaddinge, "s", pres, sname, "AddClass")
	CodeLine(sb, "px-" & spaddingx, "s", pres, sname, "AddClass")
	CodeLine(sb, "py-" & spaddingy, "s", pres, sname, "AddClass")
	CodeLine(sb, "pa-" & spaddinga, "s", pres, sname, "AddClass")
	'
	sb.append($"${sparent}.AddControl(ib${sname}.InfoBox, ib${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	AddCode(sbEvents, $"Private Sub ib${sname}_click(e As BANanoEvent)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

#Region FileSelect
Sub PropertyBag_FileSelect
	vm.setdata("pbfileselect", False)
	lstBags.add("pbfileselect")
	pbfileselect = vm.CreateProperty("ppbfileselect", Me)
	pbfileselect.SetChangeEvent("SavePropertyBag")
	pbfileselect.SetVShow("pbfileselect")
	pbfileselect.AddHeading("d","Details")
	pbfileselect.AddText("d","id","ID","","")
	pbfileselect.AddText("d", "controltype", "Type", "","fileselect")
	pbfileselect.AddSelectDS("d", "parent", "Parent", "containers", "component", "component", "")
	pbfileselect.AddText("d","vmodel","ID","","")
	pbfileselect.AddText("g","filenamevmodel","File Name VModel","","")
	pbfileselect.AddText("g","filedatevmodel","File Date VModel","","")
	pbfileselect.AddText("g","filesizevmodel","File Size VModel","","")
	pbfileselect.AddText("g","filetypevmodel","File Type VModel","","")
		
	pbfileselect.AddRadioGroup("d", "action", "Action", CreateMap("upload": "Upload","readExcel":"readExcel", "readAsText":"readAsText","readAsBinaryString":"readAsBinaryString","readAsDataURL":"readAsDataURL","readAsArrayBuffer":"readAsArrayBuffer"))
	vm.container.AddComponent(1, 3, pbfileselect.tostring)
End Sub
#End Region


Sub Read_FileSelect
	sAction = mattr.getdefault("action", "")
End Sub

Sub Design_FileSelect
	If sfilenamevmodel <> "" Then
		AddCode(sbRead, $"Dim sFileName As String = vue.GetData("${sfilenamevmodel}")"$)
		AddCode(sbRead, $"Record.put("${sfilenamevmodel}", sFileName)"$)
	End If
	'
	If sfiledatevmodel <> "" Then
		AddCode(sbRead, $"Dim sFileDate As String = vue.GetData("${sfiledatevmodel}")"$)
		AddCode(sbRead, $"Record.put("${sfiledatevmodel}", sFileDate)"$)
	End If
	'
	If sfilesizevmodel <> "" Then
		AddCode(sbRead, $"Dim sFileSize As String = vue.GetData("${sfilesizevmodel}")"$)
		AddCode(sbRead, $"Record.put("${sfilesizevmodel}", sFileSize)"$)
	End If
	'
	If sfiletypevmodel <> "" Then
		AddCode(sbRead, $"Dim sFileType As String = vue.GetData("${sfiletypevmodel}")"$)
		AddCode(sbRead, $"Record.put("${sfiletypevmodel}", sFileType)"$)
	End If
	'
	' add an invisible file selector
	AddNewLine(sb)
	AddInstruction(sb, "<Your Module>", "Code","")
	AddComment(sb, "Add an invisible file selector")
	AddCode(sb, $"vm.AddFileSelect(${sparent}, "fs${sname}")"$)
	AddNewLine(sb)
	Dim bDone As Boolean = False
	'
	AddCode(sbEvents, $"Sub fs${sname}_change(e As BANanoEvent)"$)
	If sfilenamevmodel <> "" Then AddCode(sbEvents, $"vue.SetData("${sfilenamevmodel}", "")"$)
	If sfiledatevmodel <> "" Then AddCode(sbEvents, $"vue.SetData("${sfiledatevmodel}", "")"$)
	If sfilesizevmodel <> "" Then AddCode(sbEvents, $"vue.SetData("${sfilesizevmodel}", "")"$)
	If sfiletypevmodel <> "" Then AddCode(sbEvents, $"vue.SetData("${sfiletypevmodel}", "")"$)
	'
	AddComment(sbEvents, "get selected file(s)")
	AddCode(sbEvents, $"Dim fileList As List = vm.GetFileListFromTarget(e)"$)
	AddComment(sbEvents, "there is no selected file(s)")
	AddCode(sbEvents, "If fileList.size = 0 Then Return")
	AddComment(sbEvents, "get the first file selected")
	AddCode(sbEvents, $"Dim fileO As String = fileList.get(0)"$)
	'	
	AddComment(sbEvents, "get file details")
	AddCode(sbEvents, $"Dim fo As FileObject = vue.GetFileDetails(fileO)"$)
	If sfilenamevmodel <> "" Then
		AddCode(sbEvents, $"Dim sFileName As String = fo.FileName"$)
		AddCode(sbEvents, $"vue.SetData("${sfilenamevmodel}", sFileName)"$)
	End If
	If sfiledatevmodel <> "" Then
		AddCode(sbEvents, $"Dim sFileDate As String = fo.FileDate"$)
		AddCode(sbEvents, $"vue.SetData("${sfiledatevmodel}", sFileDate)"$)
	End If
	If sfilesizevmodel <> "" Then
		AddCode(sbEvents, $"Dim sFileSize As String = fo.FileSize"$)
		AddCode(sbEvents, $"vue.SetData("${sfilesizevmodel}", sFileSize)"$)
	End If
	If sfiletypevmodel <> "" Then
		AddCode(sbEvents, $"Dim sFileType As String = fo.FileType"$)
		AddCode(sbEvents, $"vue.SetData("${sfiletypevmodel}", sFileType)"$)
	End If
	
	'updatevmodel
	Select Case sAction
	Case "upload"
		AddComment(sbEvents, "start uploading the file")
		AddCode(sbEvents, $"Dim fd As BANanoObject"$)
		AddCode(sbEvents, $"fd.Initialize2("FormData", Null)"$)
		AddCode(sbEvents, $"fd.RunMethod("append", Array("upload", fileO))"$)
		AddCode(sbEvents, $"Dim rsltJSON As String = BANano.CallAjaxWait("./assets/upload.php", "POST", "", fd, True, Null)"$)
		AddComment(sbEvents, "get the result of the upload")
		AddCode(sbEvents, $"Dim rsltMap As Map = BANano.FromJson(rsltJSON)"$)
		AddCode(sbEvents, $"Dim sResult As String = rsltMap.get("status")"$)
		AddCode(sbEvents, $"Select Case sResult"$)
		AddCode(sbEvents, $"Case "success""$)
		If sfilenamevmodel <> "" Then 
			AddCode(sbEvents, $"sFileName = "./assets/" & sFileName"$)
			AddCode(sbEvents, $"vue.SetData("${sfilenamevmodel}", sFileName)"$)
		End If
		AddCode(sbEvents, $"vm.ShowSnackBarSuccess(sFileName & " was uploaded successfully.")"$)
		AddCode(sbEvents, $"Case "error""$)
		If sfilenamevmodel <> "" Then
			AddCode(sbEvents, $"vue.SetData("${sfilenamevmodel}", "")"$)
		End If
		AddCode(sbEvents, $"vm.ShowSnackBarError("An error was experienced uploading " & sFileName)"$)
		AddCode(sbEvents, $"End Select"$)
	Case "readAsText", "readAsBinaryString", "readAsDataURL", "readAsArrayBuffer", "readExcel"
		Select Case sAction
		Case "readExcel"
			AddComment(sbEvents, $"Read the file contents using 'readAsBinaryString'"$)
			AddCode(sbEvents, $"Dim Result As Map"$)
			AddCode(sbEvents, $"Dim promise As BANanoPromise = vm.readAsBinaryString(fileO)"$)
			AddCode(sbEvents, $"promise.Then(Result)"$)
			AddComment(sbEvents, "we have received the file contents, lets assign to a string")
			AddCode(sbEvents, $"Dim strReadAsBinaryString As String = Result.get("result")"$)
			AddComment(sbEvents, "process the file contents here, read the first worksheet from first row")
			AddCode(sbEvents, $"Dim be As BANanoOXML"$)
			AddCode(sbEvents, $"be.Initialize("")"$)
			AddCode(sbEvents, $"Dim xlsRows As List = be.ReadFile(strReadAsBinaryString)"$)
			AddComment(sbEvents, "process the excel rows")
			AddNewLine(sbEvents)
		Case Else
			AddComment(sbEvents, $"Read the file contents using '${sAction}'"$)
			AddCode(sbEvents, $"Dim Result As Map"$)
			AddCode(sbEvents, $"Dim promise As BANanoPromise = vm.${sAction}(fileO)"$)
			AddCode(sbEvents, $"promise.Then(Result)"$)
			AddComment(sbEvents, "we have received the file contents, lets assign to a string")
			AddCode(sbEvents, $"Dim str${sAction} As String = Result.get("result")"$)
			AddComment(sbEvents, "process the file contents here...")
			AddNewLine(sbEvents)
		End Select
		AddCode(sbEvents, $"promise.Else(Result)"$)
		AddComment(sbEvents, "there has been an error")
		AddCode(sbEvents, $"Dim fileError As String = Result.get("result")"$)
		AddCode(sbEvents, $"vm.ShowSnackBarSuccess(fileError)"$)
		AddCode(sbEvents, $"promise.End"$)
	End Select
	'
	AddComment(sbEvents, "nullify the selector - enable to process the same file!")
	AddCode(sbEvents, $"vm.NullifyFileSelect("fs${sname}")"$)	'
	AddCode(sbEvents, $"End Sub"$)
	AddNewLine(sbEvents)
End Sub

Sub logo_click(e As BANanoEvent)
	vm.ShowSnackBarSuccess("You have clicked the logo!")
End Sub

Sub title_click(e As BANanoEvent)
	vm.ShowSnackBarSuccess("You have clicked the title!")
End Sub