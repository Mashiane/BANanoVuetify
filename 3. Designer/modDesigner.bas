B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#ignorewarnings: 12
Sub Process_Globals
	Private Mode As String
	Private ep As VMExpansionPanels
	Private vm As BANanoVM
	Private ui As VMContainer
	Private BANano As BANano  'ignore
	Private bHasBorder As Boolean
	Private bShowMatrix As Boolean
	Private tblProp As VMToolBar
	Private istool As Boolean
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
	Private myComponents As VMDataTable
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
	Private bisvisible As Boolean
	Private bisdisabled As Boolean
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
	Private bisreadonly As Boolean
	'
	Private bfitwidth As Boolean
	Private shref As String
	Private starget As String
	Private sto As String
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
	Private scolor As String
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
	Private bisreadonly As Boolean
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
	Private stextcolor As String
	Private stransition As String
	'
	Private bisabsolute As Boolean
	Private bisallowoverflow As Boolean
	Private bisauto As Boolean
	Private bisbottom As Boolean
	Private biscloseonclick As Boolean
	Private biscloseoncontentclick As Boolean
	Private bisdisablekeys As Boolean
	Private bisdisabled As Boolean
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
	Private scolor As String
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
	Private bismultiple As Boolean
	Private bisnexticon As Boolean
	Private bisprevicon As Boolean
	Private bisprogress As Boolean
	Private bisreverse As Boolean
	Private bisshowarrows As Boolean
	Private bisshowarrowsonhover As Boolean
	Private bistouchless As Boolean
	Private sverticaldelimiter As String
	Private bisinset As Boolean
	'
	Private biscaption As Boolean
	Private bisdisabled As Boolean
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
	Private bisdisabled As Boolean
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
	Private sto As String
	Private bistop As Boolean
	Private stransition As String
	Private bisXlarge As Boolean
	Private bisXsmall As Boolean
	'rating
	Private sBackgroundcolor As String
	Private sBackgroundintensity As String
	Private bisClearable As Boolean
	Private sclosedelay As String
	Private scolor As String
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
	Private bisreadonly As Boolean
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
Private sLoadingtext As String
Private sLocale As String
Private smobilebreakpoint As String
Private bisMultisort As Boolean
Private bisMustsort As Boolean
Private sNodatatext As String
Private sNoresultstext As String
Private sPage As String
Private sSearch As String
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
	Private scolor As String
	Private sColorintensity As String
	Private bisdisabled As Boolean
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
	Private stextcolor As String
	Private sTextcolorintensity As String
	Private sto As String
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
	Private bisdisabled As Boolean
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
	Private scolor As String
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
	Private bisvisible As Boolean
	Private bisiconposright As Boolean
	'
	Private bisAltlabels As Boolean
	Private bisdark As Boolean
	Private bislight As Boolean
	Private bisNonlinear As Boolean
	Private sStepactive As String
	Private stabindex As String
	Private bisvertical As Boolean
	Private bisvisible As Boolean
	'
	Private bisAccordion As Boolean
	Private sActivepanel As String
	Private bisdark As Boolean
	Private bisdisabled As Boolean
	Private bisflat As Boolean
	Private bisFocusable As Boolean
	Private bisHover As Boolean
	Private bisinset As Boolean
	Private bislight As Boolean
	Private bismandatory As Boolean
	Private bismultiple As Boolean
	Private bisPopout As Boolean
	Private bisreadonly As Boolean
	Private bistile As Boolean
	Private bisvisible As Boolean
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
End Sub

Sub Init
	controltypes = CreateMap("number":"number", "text":"text", "tel":"tel", "email":"email","password":"password", "textarea":"textarea", "date":"date", "time":"time", "select":"select", "combo":"combo", "auto":"auto","file":"file","profile":"profile","image":"image","button":"button","rangeslider":"rangeslider")
	fieldtypes = CreateMap("string":"string", "int":"int", "bool":"bool", "date":"date","dbl":"float")
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
	'initialize the application
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
	
	'
	'get last selected panel
	Dim sp As String = BANano.GetLocalStorage("selectedpanel")
	If sp <> Null Then
		vm.setdata("selectedpanel", BANano.parseint(sp))
	Else
		vm.setdata("selectedpanel", 0)
	End If
	'
	vm.RTL = False
	vm.SnackBar.SetColor("green")
	vm.SnackBar.SetTop(True)
	vm.NavBar.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	vm.NavBar.SetDark(True)
	vm.Footer.Hide
	'
	vm.Drawer.AddTitleSubTitle("Projects", "")
	'
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
	vm.Drawer.SetDataSourceTemplate1("projects","id","","","","projectname","","","","")
	'
	vm.SetMethod(Me, "LoadProjects")
	'
	vm.UX
	'
	vm.SetData("project", vm.newmap)
	drwprojectdetails.Container.Setdefaults
	CreateUX
	vm.CallMethod("LoadProjects")
	'
	Dim db As BANanoSQL
	Dim prjSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	prjSQL.Initialize("project", "id")
	prjSQL.SelectAll(Array("*"), Array("projectname"))
	prjSQL.result = db.executewait(prjSQL.query, prjSQL.args)
	Dim projects As List = prjSQL.result
	If projects.size = 0 Then
		vm.ShowSnackBArError("You need to create a new project first!")
		Mode = "A"
		drwprojectdetails.Show
	Else	
		vm.ShowSnackBarError("You need to select the work project from the drawer first!")
		vm.Drawer.Show
	End If
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
	compSQL.Read(pid)
	compSQL.result = db.executewait(compSQL.query, compSQL.args)
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
	Dim prj As Map = vm.getdata("project")
	Dim pid As String = prj.getdefault("id", "")
	If pid = "" Then
		vm.ShowSnackBarError("Please select the project to extract components from!")
		Return
	End If
	Dim compJSON As String = prj.getdefault("components", "")
	If compJSON = "" Then Return
	'
	vm.PagePause
	'lets import to the db
	Dim CompList As List
	CompList.initialize
	CompList = BANano.FromJSON(compJSON)
	Dim db As BANanoSQL
	Dim compSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	compSQL.Initialize("components", "id")
	For Each nrec As Map In CompList
		compSQL.RecordFromMap(nrec)
		compSQL.Insert
		compSQL.result = db.executewait(compSQL.query, compSQL.args)
	Next
	vm.PageResume
	CreateUX
End Sub

'save components to project
Sub btnSaveComponents2Project_click(e As BANanoEvent)
	Dim prj As Map = vm.getdata("project")
	Dim pid As String = prj.getdefault("id", "")
	If pid = "" Then
		vm.ShowSnackBarError("Please select the project to save the components to first!")
		Return 
	End If
	'get the components
	vm.PagePause
	Dim db As BANanoSQL
	Dim compSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	'add the components
	compSQL.Initialize("components", "id")
	compSQL.SelectAll(Array("*"), Array("row","col"))
	compSQL.result = db.executewait(compSQL.query, compSQL.args)
	'convert to json
	Dim compJSON As String = BANano.ToJSON(compSQL.result)
	'save to project
	pid = BANano.parseint(pid)
	prj.Put("components", compJSON)
	db.OpenWait("bvmdesigner", "bvmdesigner")
	compSQL.Initialize("project", "id")
	compSQL.RecordFromMap(prj)
	compSQL.Update(pid)
	compSQL.result = db.executewait(compSQL.query, compSQL.args)
	vm.SetData("project", prj)
	vm.PageResume
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
	rsSQL.Read(menuID)
	rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	If rsSQL.result.size = 0 Then Return
	'read the first record found
	Dim rec As Map = rsSQL.result.get(0)
	vm.setdata("project", rec)
	vm.setstate(rec)
	Mode = "E"
	Dim sprojectname As String = rec.getdefault("projectname", "")
	vm.NavBar.UpdateTitle($"${Main.AppTitle} [${sprojectname}]"$)
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
	NewProject
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

Sub LoadProjects
	'"projectname","dbtype","databasename"
	Dim db As BANanoSQL
	Dim prjSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	prjSQL.Initialize("project", "id")
	prjSQL.SelectAll(Array("*"), Array("projectname"))
	prjSQL.result = db.executewait(prjSQL.query, prjSQL.args)
	vm.setdata("projects", prjSQL.result)
End Sub

Sub btnProject_click(e As BANanoEvent)
	'hide all property bags
	ShowBag("")
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
	Dim txtprojectname As VMTextField = vm.NewTextField(Me, True, "txtprojectname", "projectname", "Project Name", "", True, "", 0, "", "", 0)
	txtprojectname.SetFieldType("string")
	txtprojectname.SetOutlined(True)
	txtprojectname.SetClearable(True)
	txtprojectname.SetHideDetails(True)
	txtprojectname.SetVisible(True)
	txtprojectname.SetDense(True)
	drwprojectdetails.Container.AddControl(txtprojectname.textfield, txtprojectname.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim dbtypekeys As String = "banano,sqlite,mysql,mssql"
	Dim dbtypevalues As String = "BANanoSQL,SQLite,MySQL,MSSQL"
	Dim dbtypemap As Map = vm.keyvalues2map(",", dbtypekeys, dbtypevalues)
	Dim rddbtype As VMRadioGroup = vm.NewRadioGroup(Me, True, "rddbtype", "dbtype", "Database Type", "banano", dbtypemap, False, True, 0)
	rddbtype.SetFieldType("string")
	rddbtype.SetHideDetails(True)
	rddbtype.SetVisible(True)
	rddbtype.AddClass("my-2")
	drwprojectdetails.Container.AddControl(rddbtype.RadioGroup, rddbtype.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim txtdatabasename As VMTextField = vm.NewTextField(Me, True, "txtdatabasename", "databasename", "Database Name", "", True, "", 0, "", "", 0)
	txtdatabasename.SetFieldType("string")
	txtdatabasename.SetOutlined(True)
	txtdatabasename.SetDense(True)
	txtdatabasename.SetClearable(True)
	txtdatabasename.SetHideDetails(True)
	txtdatabasename.SetVisible(True)
	drwprojectdetails.Container.AddControl(txtdatabasename.textfield, txtdatabasename.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)

	Dim btnbtnCancelProject As VMButton = vm.NewButton(Me, True, "btnbtnCancelProject", "Cancel", True, False, False, True)
	btnbtnCancelProject.SetColorIntensity("red", "")
	btnbtnCancelProject.Setoutlined(True)
	btnbtnCancelProject.SetVisible(True)
	drwprojectdetails.Container.AddControl(btnbtnCancelProject.Button, btnbtnCancelProject.tostring, 2, 1, 0, 0, 0, 0, 12, 6, 6, 6)

	Dim btnbtnSaveProject As VMButton = vm.NewButton(Me, True, "btnbtnSaveProject", "Save", True, False, False, True)
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
	vm.SetData("project", vm.newmap)	
	Dim Record As Map = drwprojectdetails.Container.GetData
	'validate the record
	Dim bValid As Boolean = vm.Validate(Record, drwprojectdetails.Container.Required)
	'if invalid exit create/update
	If bValid = False Then
		vm.ShowSnackBar("Please ensure that the project name and database name are specified!")
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
		Record.put("id", pid)
		db.OpenWait("bvmdesigner", "bvmdesigner")
		rsSQL.Initialize("project", "id")
		rsSQL.RecordFromMap(Record)
		rsSQL.Insert
		rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	Case "E"
		Dim prj As Map = vm.GetData("project")
		Dim pid As String = prj.Get("id")
		pid = BANano.parseint(pid)
		Record.put("id", pid)
		db.OpenWait("bvmdesigner", "bvmdesigner")
		rsSQL.Initialize("project", "id")
		rsSQL.RecordFromMap(Record)
		rsSQL.Update(pid)
		rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	End Select
	Dim sprojectname As String = Record.getdefault("projectname", "")
	vm.NavBar.UpdateTitle($"${Main.AppTitle} [${sprojectname}]"$)
	vm.SetData("project", Record)
	vm.CallMethod("LoadProjects")
	drwprojectdetails.hide
End Sub

Sub Read_Badge
	bisAvatar = YesNoToBoolean(mattr.getdefault("isavatar", "No"))
	bisBordered = YesNoToBoolean(mattr.getdefault("isbordered", "No"))
	bisbottom = YesNoToBoolean(mattr.getdefault("isbottom", "No"))
	scolor = mattr.getdefault("color", "")
	sbadgetype = mattr.getdefault("badgetype", "iscontent")
	sColorintensity = mattr.getdefault("colorintensity", "")
	sContent = mattr.getdefault("content", "")
	bisdark = YesNoToBoolean(mattr.getdefault("isdark", "No"))
	bisdisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
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
	scolor = mattr.getdefault("color", "")
	sColorintensity = mattr.getdefault("colorintensity", "")
	bisdisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
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
	sTextcolorintensity = mattr.getdefault("textcolorintensity", "")
	sto = mattr.getdefault("to", "")
	bisvisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
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
	bShowMatrix = YesNoToBoolean(vm.getdata("showmatrix"))
	bHasBorder = YesNoToBoolean(vm.getdata("hasborder"))
	
	vm.pagepause
	vm.setdata("myux", Array())
	'
	Dim db As BANanoSQL
	Dim gridSQL As BANanoAlaSQLE
	Dim compSQL As BANanoAlaSQLE
	''start with the grid
	db.OpenWait("bvmdesigner", "bvmdesigner")
	
	gridSQL.Initialize("grid", "id")
	gridSQL.SelectAll(Array("*"), Array("id"))
	gridSQL.result = db.executewait(gridSQL.query, gridSQL.args)
	'
	'add the components
	compSQL.Initialize("components", "id")
	compSQL.SelectAll(Array("*"), Array("row","col"))
	compSQL.result = db.executewait(compSQL.query, compSQL.args)
	'
	vm.setdata("myux", compSQL.result)
	
	sb.initialize
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
		sparent = mattr.getdefault("parent", "vm")
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
		bisvisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
		bisdisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
		bontable = YesNoToBoolean(mattr.getdefault("ontable", "No"))
		bisdark = YesNoToBoolean(mattr.getdefault("isdark", "No"))
		bisnow = YesNoToBoolean(mattr.getdefault("isnow", "No"))
		sdialogpage = mattr.getdefault("dialogpage", "")
		sclickaction = mattr.getdefault("clickaction","")
		siconpos = mattr.getdefault("iconpos", "left")
		sbuttontype = mattr.getdefault("buttontype", "normal")
		'
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
		bisreadonly = YesNoToBoolean(mattr.getdefault("isreadonly", "No"))
		'
		bfitwidth = YesNoToBoolean(mattr.getdefault("isfitwidth", "No"))
		shref = mattr.getdefault("href","")
		starget = mattr.getdefault("target","")
		sto = mattr.getdefault("to","")
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
		scolor = mattr.getdefault("color","")
		sintensity = mattr.getdefault("intensity","")
		If scolor = "undefined" Then scolor = ""
		If scolor = "none" Then scolor = ""
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
		'
		bStatic = True
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
		End Select
	Next
	
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
	bisdisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
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
	bisreadonly = YesNoToBoolean(mattr.getdefault("isreadonly", "No"))
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
	scolor = mattr.getdefault("color", "")
	If scolor = "undefined" Then scolor = ""
	If scolor = "none" Then scolor = ""
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
	txta.SetVisible(bisvisible)
	ui.AddControl(txta.TextField, txta.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim txta${sname} As VMTextField = vm.NewTextArea(Me, ${bStatic}, "txta${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, ${bautogrow}, "${siconname}", ${imaxlen}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)

	CodeLine(sb, sfieldtype, "s", "txta", sname, "SetFieldType")
	CodeLine(sb, svalue, "s", "txta", sname, "SetValue")
	CodeLine(sb, bissolo, "b", "txta", sname, "SetSolo")
	CodeLine(sb, bisoutlined, "b", "txta", sname, "SetOutlined")
	CodeLine(sb, bisfilled, "b", "txta", sname, "SetFilled")
	CodeLine(sb, bisdense, "b", "txta", sname, "SetDense")
	CodeLine(sb, bissingleline, "b", "txta", sname, "SetSingleLine")
	CodeLine(sb, bispersistenthint, "b", "txta", sname, "SetPersistentHint")
	CodeLine(sb, bisshaped, "b", "txta", sname, "SetShaped")
	CodeLine(sb, bisloading, "b", "txta", sname, "SetLoading")
	CodeLine(sb, bisflat, "b", "txta", sname, "SetFlat")
	CodeLine(sb, bisrounded, "b", "txta", sname, "SetRounded")
	CodeLine(sb, bclearable, "b", "txta", sname, "SetClearable")
	CodeLine(sb, bishidedetails, "b", "txta", sname, "SetHideDetails")
	CodeLine(sb, bisvisible, "b", "txta", sname, "SetVisible")

	sb.append($"${sparent}.Container.AddControl(txta${sname}.TextField, txta${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Switch
	Dim swt As VMCheckBox = ui.NewSwitch(Me, True, sname, svmodel, stitle, struevalue, sfalsevalue, bisPrimary, stabindex)
	swt.SetColorIntensity(scolor, sintensity)
	swt.SetRequired(bisrequired)
	swt.SetDisabled(bisdisabled)
	swt.SetDark(bisdark)
	swt.SetValue(svalue)
	swt.SetDense(bisdense)
	swt.SetHideDetails(bishidedetails)
	swt.SetLight(bislight)
	swt.SetLoading(sswitchloading)
	swt.SetMultiple(bismultiple)
	swt.SetInset(bisinset).SetFlat(bisflat)
	swt.SetFieldType(sfieldtype)
	swt.SetVisible(bisvisible)
	ui.AddControl(swt.checkbox, swt.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim swt${sname} As VMCheckBox = vm.NewSwitch(Me, ${bStatic}, "swt${sname}", "${svmodel}", "${stitle}", "${svalue}", "${sfalsevalue}", ${bisPrimary}, ${stabindex})"$).append(CRLF)
	CodeLine(sb, bisrequired, "b", "swt", sname, "SetRequired")
	CodeLine(sb, sfieldtype, "s", "swt", sname, "SetFieldType")
	CodeLine(sb, svalue, "s", "swt", sname, "SetValue")
	CodeLine(sb, bisdisabled, "b", "swt", sname, "SetDisabled")
	CodeLine(sb, bisdark, "b", "swt", sname, "SetDark")
	CodeLine(sb, bisdense, "b", "swt", sname, "SetDense")
	CodeLine(sb, bishidedetails, "b", "swt", sname, "SetHideDetails")
	CodeLine(sb, bisinset, "b", "swt", sname, "SetInset")
	CodeLine(sb, bislight, "b", "swt", sname, "SetLight")
	CodeLine(sb, sswitchloading, "s", "swt", sname, "SetLoading")
	CodeLine(sb, bismultiple, "b", "swt", sname, "SetMultiple")
	CodeLine(sb, bisflat, "b", "swt", sname, "SetFlat")
	CodeLine(sb, bisvisible, "b", "swt", sname, "SetVisible")
	
	If scolor <> "" Then sb.append($"swt${sname}.SetColorIntensity("${scolor}", "${sintensity}")"$).append(CRLF)
	'
	AddCode(sb, $"swt${sname}.SetOnChange(Me, "swt${sname}_change")"$)
	sb.append($"${sparent}.Container.AddControl(swt${sname}.CheckBox, swt${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	
	'add events
	AddCode(sbEvents, $"Private Sub swt${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

Sub Design_CheckBox
	Dim chk As VMCheckBox = ui.NewCheckBox(Me, True, sname, svmodel, stitle, struevalue, sfalsevalue, bisPrimary, stabindex)
	chk.SetColorIntensity(scolor, sintensity)
	chk.SetRequired(bisrequired)
	chk.SetDisabled(bisdisabled)
	chk.SetDark(bisdark)
	chk.SetDense(bisdense)
	chk.SetHideDetails(bishidedetails)
	chk.SetIndeterminate(bisindeterminate)
	chk.SetLight(bislight)
	chk.SetMultiple(bismultiple)
	chk.SetValue(svalue)
	chk.SetFieldType(sfieldtype)
	chk.SetVisible(bisvisible)
	ui.AddControl(chk.checkbox, chk.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim chk${sname} As VMCheckBox = vm.NewCheckBox(Me, ${bStatic}, "chk${sname}", "${svmodel}", "${stitle}", "${struevalue}", "${sfalsevalue}", ${bisPrimary}, ${stabindex})"$).append(CRLF)
	CodeLine(sb, bisrequired, "b", "chk", sname, "SetRequired")
	CodeLine(sb, svalue, "s", "chk", sname, "SetValue")
	CodeLine(sb, bisdisabled, "b", "chk", sname, "SetDisabled")
	CodeLine(sb, bisdark, "b", "chk", sname, "SetDark")
	CodeLine(sb, bisdense, "b", "chk", sname, "SetDense")
	CodeLine(sb, bishidedetails, "b", "chk", sname, "SetHideDetails")
	CodeLine(sb, bisindeterminate, "b", "chk", sname, "SetIndeterminate")
	CodeLine(sb, bislight, "b", "chk", sname, "SetLight")
	CodeLine(sb, bismultiple, "b", "chk", sname, "SetMultiple")
	CodeLine(sb, sfieldtype, "s", "chk", sname, "SetFieldType")
	CodeLine(sb, bisvisible, "b", "chk", sname, "SetVisible")
	AddCode(sb, $"chk${sname}.SetOnChange(Me, "chk${sname}_change")"$)
	If scolor <> "" Then sb.append($"chk${sname}.SetColorIntensity("${scolor}", "${sintensity}")"$).append(CRLF)
	'
	sb.append($"${sparent}.Container.AddControl(chk${sname}.CheckBox, chk${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub chk${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

Sub Design_Date
	Dim dp As VMDateTimePicker = ui.NewDatePicker(Me, True, "dp" & sname, svmodel, stitle, bisrequired, splaceholder, shelpertext, serrortext, stabindex)
	dp.SetVisible(bisvisible)
	dp.SetDisabled(bisdisabled)
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
				
	ui.AddControl(dp.DateTimePicker, dp.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim dp${sname} As VMDateTimePicker = vm.NewDatePicker(Me, ${bStatic}, "dp${sname}", "${svmodel}", "${stitle}", ${bisrequired}, "${splaceholder}", "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
		
	CodeLine(sb, sfieldtype, "s", "dp", sname, "SetFieldType")
	CodeLine(sb, bisvisible, "b", "dp", sname, "SetVisible")
	CodeLine(sb, bisdisabled, "b", "dp", sname, "SetDisabled")
	CodeLine(sb, bisrange, "b", "dp", sname, "SetRange")
	CodeLine(sb, bisshowweek, "b", "dp", sname, "SetShowWeek")
	CodeLine(sb, bisdark, "b", "dp", sname, "SetDark")
	CodeLine(sb, svalue, "s", "dp", sname, "SetValue")
	CodeLine(sb, bisnow, "b", "dp", sname, "SetIsNow")
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
	AddCode(sb, $"dp${sname}.SetOnChange(Me, "dp${sname}_change")"$)
	
	sb.append($"${sparent}.Container.AddControl(dp${sname}.DateTimePicker, dp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub dp${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
	
End Sub

Sub Design_Chip
	Dim chip As VMChip = ui.CreateChip($"chip${sname}"$, Me)
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
	chip.SetColorintensity(scolor, sColorintensity)
	chip.SetDark(bisdark)
	chip.SetDisabled(bisdisabled)
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
	chip.SetTextcolorintensity(stextcolor, sTextcolorintensity)
	chip.SetTo(sto)
	chip.SetVisible(bisvisible)
	chip.SetXlarge(bisXlarge)
	chip.SetXsmall(bisXsmall)
	ui.AddControl(chip.Chip, chip.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	
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
	CodeLine2(sb, scolor, sColorintensity, "s", "chp", sname, "SetColorintensity")
	CodeLine(sb, bisdark, "b", "chp", sname, "SetDark")
	CodeLine(sb, bisdisabled, "b", "chp", sname, "SetDisabled")
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
	CodeLine2(sb, stextcolor, sTextcolorintensity, "s", "chp", sname, "SetTextcolorintensity")
	CodeLine(sb, sto, "s", "chp", sname, "SetTo")
	CodeLine(sb, bisvisible, "b", "chp", sname, "SetVisible")
	CodeLine(sb, bisXlarge, "b", "chp", sname, "SetXlarge")
	CodeLine(sb, bisXsmall, "b", "chp", sname, "SetXsmall")
	
	sb.append($"${sparent}.Container.AddControl(chp${sname}.Chip, chp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
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
	Dim badge As VMBadge = ui.CreateBadge($"badge${sname}"$, Me)
	badge.SetStatic(True)
	badge.SetAvatar(bisAvatar)
	badge.SetBordered(bisBordered)
	badge.SetBottom(bisbottom)
	badge.SetColorintensity(scolor, sColorintensity)
	Select Case sbadgetype
	Case "iscontent"
		badge.SetContent(sContent)
	Case "isicon"	
		badge.SetIcon(siconname)
	End Select
	badge.SetDark(bisdark)
	badge.SetDisabled(bisdisabled)
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
	badge.SetVisible(bisvisible)
	ui.AddControl(badge.Badge, badge.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	
	AddCode(sb, $"Dim bdg${sname} As VMBadge = vm.CreateBadge("bdg${sname}", Me)"$)
	CodeLine(sb, bisAvatar, "b", "bdg", sname, "SetAvatar")
	CodeLine(sb, bisBordered, "b", "bdg", sname, "SetBordered")
	CodeLine(sb, bisbottom, "b", "bdg", sname, "SetBottom")
	CodeLine2(sb, scolor, sColorintensity, "s", "bdg", sname, "SetColorintensity")
	Select Case sbadgetype
	Case "iscontent"
		CodeLine(sb, sContent, "s", "bdg", sname, "SetContent")
	Case "isicon"
		CodeLine(sb, siconname, "s", "bdg", sname, "SetIcon")
	End Select
	CodeLine(sb, bisdark, "b", "bdg", sname, "SetDark")
	CodeLine(sb, bisdisabled, "b", "bdg", sname, "SetDisabled")
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
	CodeLine(sb, bisvisible, "b", "bdg", sname, "SetVisible")
	
	sb.append($"${sparent}.Container.AddControl(bdg${sname}.Badge, bdg${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub




Sub Design_File
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
	fi.SetVisible(bisvisible)
	ui.AddControl(fi.TextField, fi.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
			
	sb.append($"Dim fi${sname} As VMTextField = vm.NewFileInput(Me, ${bStatic}, False, "fi${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
	CodeLine(sb, bissolo, "b", "fi", sname, "SetSolo")
	CodeLine(sb, bisoutlined, "b", "fi", sname, "SetOutlined")
	CodeLine(sb, bisfilled, "b", "fi", sname, "SetFilled")
	CodeLine(sb, bisdense, "b", "fi", sname, "SetDense")
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
	CodeLine(sb, bisvisible, "b", "fi", sname, "SetVisible")
	
	sb.append($"${sparent}.Container.AddControl(fi${sname}.TextField, fi${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub fi${sname}_change(fileList As List)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

Sub Design_Radio
	If buseoptions Then
		Dim optionsm As Map = vm.keyvalues2map(",", skeys, svalues)
		Dim rd As VMRadioGroup = ui.NewRadioGroup(Me, True, "rd" & sname, svmodel, stitle, svalue, optionsm, bshowlabel, blabelontop, stabindex)
	Else
		Dim rd As VMRadioGroup = ui.NewRadioGroupDataSource(Me, True, "rd" & sname, svmodel, stitle, svalue, ssourcetable, _
					ssourcefield, sdisplayfield, bshowlabel, blabelontop, stabindex)
	End If
	rd.SetMandatory(bismandatory)
	rd.SetDisabled(bisdisabled)
	rd.SetDense(bisdense)
	rd.SetMultiple(bismultiple)
	rd.SetHideDetails(bishidedetails)
	rd.SetFieldType(sfieldtype)
	rd.SetVisible(bisvisible)
	ui.AddControl(rd.RadioGroup, rd.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
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
	CodeLine(sb, bisdisabled, "b", "rd", sname, "SetDisabled")
	CodeLine(sb, bisdense, "b", "rd", sname, "SetDense")
	CodeLine(sb, bismultiple, "b", "rd", sname, "SetMultiple")
	CodeLine(sb, bishidedetails, "b", "rd", sname, "SetHideDetails")
	CodeLine(sb, bisvisible, "b", "rd", sname, "SetVisible")
	AddCode(sb, $"rd${sname}.SetOnChange(Me, "rd${sname}_change")"$)
	sb.append($"${sparent}.Container.AddControl(rd${sname}.RadioGroup, rd${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub rd${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

Sub Design_Select
	Select Case controltype
		Case "select"
			If buseoptions Then
				Dim optionsm As Map = vm.keyvalues2map(",", skeys, svalues)
				Dim sel As VMSelect = ui.NewSelectOptions(Me, True, "sel" & sname, svmodel, stitle, bisrequired, bismultiple, _
						splaceholder, optionsm, ssourcefield, sdisplayfield, bisreturnobject, shelpertext, serrortext, stabindex)
			Else
				'use data source
				Dim sel As VMSelect = ui.NewSelectDataSource(Me, True, "sel" & sname, svmodel, stitle, bisrequired, bismultiple, _
						splaceholder, ssourcetable, ssourcefield, sdisplayfield, bisreturnobject, shelpertext, serrortext, stabindex)
			End If
		Case "combo"
			If buseoptions Then
				Dim optionsm As Map = vm.keyvalues2map(",", skeys, svalues)
				Dim sel As VMSelect = ui.NewComboOptions(Me, True, "sel" & sname, svmodel, stitle, bisrequired, bismultiple, _
						splaceholder, optionsm, ssourcefield, sdisplayfield, bisreturnobject, shelpertext, serrortext, stabindex)
			Else
				'use data source
				Dim sel As VMSelect = ui.NewComboDataSource(Me, True, "sel" & sname, svmodel, stitle, bisrequired, bismultiple, _
						splaceholder, ssourcetable, ssourcefield, sdisplayfield, bisreturnobject, shelpertext, serrortext, stabindex)
			End If
		Case "auto"
			If buseoptions Then
				Dim optionsm As Map = vm.keyvalues2map(",", skeys, svalues)
				Dim sel As VMSelect = ui.NewAutoCompleteOptions(Me, True, "sel" & sname, svmodel, stitle, bisrequired, bismultiple, _
						splaceholder, optionsm, ssourcefield, sdisplayfield, bisreturnobject, shelpertext, serrortext, stabindex)
			Else
				'use data source
				Dim sel As VMSelect = ui.NewAutoCompleteDataSource(Me, True, "sel" & sname, svmodel, stitle, bisrequired, bismultiple, _
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
	sel.SetVisible(bisvisible)
	ui.AddControl(sel.Combo, sel.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
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
	CodeLine(sb, bissingleline, "b", "sel", sname, "SetSingleLine")
	CodeLine(sb, bispersistenthint, "b", "sel", sname, "SetPersistentHint")
	CodeLine(sb, bisshaped, "b", "sel", sname, "SetShaped")
	CodeLine(sb, bisloading, "b", "sel", sname, "SetLoading")
	CodeLine(sb, bisflat, "b", "sel", sname, "SetFlat")
	CodeLine(sb, bisrounded, "b", "sel", sname, "SetRounded")
	CodeLine(sb, bclearable, "b", "sel", sname, "SetClearable")
	CodeLine(sb, bishidedetails, "b", "sel", sname, "SetHideDetails")
	CodeLine(sb, bischips, "b", "sel", sname, "SetChips")
	CodeLine(sb, bissmallchips, "b", "sel", sname, "SetSmallChips")
	CodeLine(sb, bisdeletablechips, "b", "sel", sname, "SetDeletableChips")
	CodeLine(sb, bisvisible, "b", "sel", sname, "SetVisible")
	AddCode(sb, $"sel${sname}.SetOnChange(Me, "sel${sname}_change")"$)
	'
	sb.append($"${sparent}.Container.AddControl(sel${sname}.Combo, sel${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub sel${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
	
End Sub

Sub Design_Slider
	Dim sld As VMSlider = ui.Newslider(Me, True, sname, svmodel, stitle, sminvalue, smaxvalue, stabindex)
	sld.SetValue(sslidervalue)
	sld.SetColorIntensity(scolor, sintensity)
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
	sld.SetVisible(bisvisible)
	ui.AddControl(sld.slider, sld.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim sld${sname} As VMSlider = vm.NewSlider(Me, ${bStatic}, "sld${sname}", "${svmodel}", "${stitle}", ${sminvalue}, ${smaxvalue}, ${stabindex})"$).append(CRLF)
	CodeLine(sb, sslidervalue, "s", "sld", sname, "SetValue")
	CodeLine2(sb, scolor, sintensity, "s", "sld", sname, "SetColorIntensity")
	CodeLine(sb, bishidedetails, "b", "sld", sname, "SetHidedetails")
	CodeLine(sb, sfieldtype, "s", "sld", sname, "SetFieldType")
	CodeLine(sb, svalue, "s", "sld", sname, "SetValue")
	CodeLine(sb, bisdark, "b", "sld", sname, "SetDark")
	CodeLine(sb, bisreadonly, "b", "sld", sname, "SetReadonly")
	CodeLine(sb, bisvertical, "b", "sld", sname, "SetVertical")
	CodeLine(sb, sstepvalue, "s", "sld", sname, "SetStep")
	CodeLine(sb, sprependicon, "s", "sld", sname, "SetPrependicon")
	CodeLine(sb, sappendicon, "s", "sld", sname, "SetAppendIcon")
	CodeLine(sb, bisdense, "b", "sld", sname, "SetDense")
	CodeLine(sb, sthumbsize, "s", "sld", sname, "SetThumbSize")
	CodeLine(sb, bisvisible, "b", "sld", sname, "SetVisible")
	CodeLine2(sb, sthumbcolor, sthumbintensity, "s", "sld", sname, "SetThumbColorIntensity")
	CodeLine2(sb, strackcolor, strackintensity, "s", "sld", sname, "SetTrackColorIntensity")
	If bisthumblabel Then CodeLine(sb, bisthumblabel, "b", "sld", sname, "SetThumblabel")
	If bisthumbalways Then CodeLine(sb, bisthumbalways, "b", "sld", sname, "SetThumblabelalways")
	sb.append($"${sparent}.Container.AddControl(sld${sname}.Slider, sld${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
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
	lbl.Setvisible(bisvisible)
	ui.AddControl(lbl.Label, lbl.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim lbl${sname} As VMLabel =vm.NewLabel(${bStatic}, "lbl${sname}", "${svmodel}", "${slabelsize}", "${svalue}")"$).append(CRLF)
	CodeLine(sb, sdisplay, "s", "lbl", sname, "AddClass")
	CodeLine(sb, salign, "s", "lbl", sname, "AddClass")
	CodeLine(sb, sfontweight, "s", "lbl", sname, "AddClass")
	CodeLine(sb, bisitalic, "b", "lbl", sname, "SetItalic")
	
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
	CodeLine(sb, bisvisible, "b", "lbl", sname, "Setvisible")
	If stextcolor <> "" Then sb.append($"lbl${sname}.SetTextColorIntensity("${stextcolor}", "${stextintensity}")"$).append(CRLF)

	sb.append($"${sparent}.Container.AddControl(lbl${sname}.Label, lbl${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Email
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
	email.SetVisible(bisvisible)
	ui.AddControl(email.TextField, email.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim txt${sname} As VMTextField = vm.NewEmail(Me, ${bStatic}, "txt${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, "${siconname}", "${shelpertext}", "${serrortext}", ${stabindex})"$).Append(CRLF)

	CodeLine(sb, sfieldtype, "s", "txt", sname, "SetFieldType")
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
	CodeLine(sb, bisvisible, "b", "txt", sname, "SetVisible")

	sb.append($"${sparent}.Container.AddControl(txt${sname}.textfield, txt${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Password
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
	pwd.SetVisible(bisvisible)
				
	ui.AddControl(pwd.TextField, pwd.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim pwd${sname} As VMTextField = vm.NewPassword(Me, ${bStatic}, "pwd${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, ${bToggle}, "${siconname}", ${imaxlen}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
	'
	CodeLine(sb, sfieldtype, "s", "pwd", sname, "SetFieldType")
	CodeLine(sb, bissolo, "b", "pwd", sname, "SetSolo")
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
	CodeLine(sb, bisvisible, "b", "pwd", sname, "SetVisible")

	sb.append($"${sparent}.Container.AddControl(pwd${sname}.textfield, pwd${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Tel
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
	tel.SetVisible(bisvisible)
	ui.AddControl(tel.TextField, tel.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim tel${sname} As VMTextField = vm.NewTel(Me, ${bStatic}, "tel${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, "${siconname}", "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)

	CodeLine(sb, svalue, "s", "tel", sname, "SetValue")
	CodeLine(sb, sfieldtype, "s", "tel", sname, "SetFieldType")
	CodeLine(sb, bissolo, "b", "tel", sname, "SetSolo")
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
	CodeLine(sb, bisvisible, "b", "tel", sname, "SetVisible")
		
	sb.append($"${sparent}.Container.AddControl(tel${sname}.textfield, tel${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Time
	Dim tp As VMDateTimePicker = ui.Newtimepicker(Me, True, "tp" & sname, svmodel, stitle, bisrequired, splaceholder, shelpertext, serrortext, stabindex)
	tp.SetVisible(bisvisible)
	tp.SetDisabled(bisdisabled)
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
			
	ui.AddControl(tp.DateTimePicker, tp.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim tp${sname} As VMDateTimePicker = vm.NewTimePicker(Me, ${bStatic}, "tp${sname}", "${svmodel}", "${stitle}", ${bisrequired}, "${splaceholder}", "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
	'
	CodeLine(sb, svalue, "s", "tp", sname, "SetValue")
	CodeLine(sb, bisvisible, "b", "tp", sname, "SetVisible")
	CodeLine(sb, bisdisabled, "b", "tp", sname, "SetDisabled")
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
	AddCode(sb, $"tp${sname}.SetOnChange(Me, "tp${sname}_change")"$)
	sb.append($"${sparent}.Container.AddControl(tp${sname}.DateTimePicker, tp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	'add events
	AddCode(sbEvents, $"Private Sub tp${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
End Sub

Sub Design_Icon
	Dim icn As VMIcon = ui.NewIcon(Me, True, sname, siconname, ssize, scolor, sintensity)
	icn.SetDark(bisdark)
	icn.SetDense(bisdense)
	icn.SetDisabled(bisdisabled)
	icn.SetCenterOnParent(bcenteronparent)
	icn.SetLeft(bisleft)
	icn.SetRight(bisright)
	icn.SetVisible(bisvisible)
	ui.AddControl(icn.Icon, icn.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim icn${sname} As VMIcon = vm.NewIcon(Me, True, "${sname}", "${siconname}", "${ssize}", "${scolor}", "${sintensity}")"$).append(CRLF)
	CodeLine(sb, bisdark, "b", "icn", sname, "SetDark")
	CodeLine(sb, bisdense, "b", "icn", sname, "SetDense")
	CodeLine(sb, bisdisabled, "b", "icn", sname, "SetDisabled")
	CodeLine(sb, bcenteronparent, "b", "icn", sname, "SetCenterOnParent")
	CodeLine(sb, bisleft, "b", "icn", sname, "SetLeft")
	CodeLine(sb, bisright, "b", "icn", sname, "SetRight")
	CodeLine(sb, bisvisible, "b", "icn", sname, "SetVisible")
	sb.append($"${sparent}.Container.AddControl(icn${sname}.Icon, icn${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Parallax
	Dim para As VMParallax = ui.NewParallax(Me, True, sname, sheight, ssrc, salt)
	para.SetVisible(bisvisible)
	ui.AddControl(para.Parallax, para.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim prlx${sname} As VMParallax = vm.NewParallax(Me, ${bStatic}, "prlx${sname}", "${sheight}", "${ssrc}", "${salt}")"$).append(CRLF)
	CodeLine(sb, bisvisible, "b", "prlx", sname, "SetVisible")
	sb.append($"${sparent}.Container.AddControl(prlx${sname}.Parallax, prlx${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Container
	Dim cont As VMContainer = ui.NewContainer(Me, True, "cont" & sname)
	cont.SetElevation(selevation)
	cont.SetTransition(stransition)
	cont.SetFluid(bisfluid)
	cont.SetShowMatrix(bisshowmatrix)
	cont.SetNoGutters(bisnogutters)
	cont.SetVisible(bisvisible)
	cont.SetBorderRadius(sborderradius)
	cont.SetBorderWidth(sborderwidth)
	cont.SetBorderColor(sbordercolor)
	cont.SetBorderStyle(sborderstyle)
	cont.SetColorIntensity(scolor, sintensity)
	cont.SetWidth(swidth)
	cont.SetHeight(sheight)
	cont.SetMinWidth(sminwidth)
	cont.SetMaxWidth(smaxwidth)
	cont.SetMinHeight(sminheight)
	cont.SetMaxHeight(smaxheight)
	ui.AddControl(cont.Container, cont.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim cont${sname} As VMContainer = vm.NewContainer(Me, ${bStatic}, "cont${sname}")"$).append(CRLF)
	CodeLine(sb, selevation, "s", "cont", sname, "SetElevation")
	CodeLine(sb, stransition, "s", "cont", sname, "SetTransition")
	CodeLine(sb, bisfluid, "b", "cont", sname, "SetFluid")
	CodeLine(sb, bisshowmatrix, "b", "cont", sname, "SetShowMatrix")
	CodeLine(sb, bisnogutters, "b", "cont", sname, "SetNoGutters")
	CodeLine(sb, bisvisible, "b", "cont", sname, "SetVisible")
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
	If scolor <> "" Then sb.append($"cont${sname}.SetColorIntensity("${scolor}", "${sintensity}")"$).append(CRLF)
	sb.append($"${sparent}.Container.AddControl(cont${sname}.Container, cont${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
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
	img.SetVisible(bisvisible)
	img.SetCenterOnParent(bcenteronparent)
				
	ui.AddControl(img.Image, img.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim img${sname} As VMImage = vm.NewImage(Me, ${bStatic}, "img${sname}", "${svmodel}", "${ssrc}", "${salt}", "${swidth}", "${sheight}")"$).append(CRLF)
	CodeLine(sb, slazysrc, "s", "img", sname, "SetLazysrc")
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
	CodeLine(sb, bisvisible, "b", "img", sname, "SetVisible")
	sb.append($"${sparent}.Container.AddControl(img${sname}.Image, img${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
End Sub

Sub Design_Drawer
	Dim drw As VMNavigationDrawer = ui.CreateDrawer("drw" & sname, Me)
	drw.SetStatic(True)
	drw.AddTitleSubTitle(smtitle,smsubtitle)
	drw.SetcolorIntensity(scolor,sintensity)
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
	drw.Setvisible(bisvisible)
	'
	'link events
	AddCode(sbEvents, $"Sub drw${sname}Items_click(e As BANanoEvent)"$)
	AddCode(sbEvents, $"Dim itemID As String = vm.GetIDFromEvent(e)"$)
	AddCode(sbEvents, $"Select Case itemID"$)
	
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
	AddCode(sbEvents,"End Select")
	AddCode(sbEvents, "End Sub")
	ui.AddControl(drw.NavigationDrawer, drw.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	
	'
	AddInstruction(sb, "Your", "Process_Globals","")
	AddNewLine(sb)
	AddCode(sb, $"Private drw${sname} As VMNavigationDrawer"$)
	AddNewLine(sb)
	
	AddInstruction(sb, "Your", "Code","before vm.Ux")
	AddNewLine(sb)
	AddCode(sb, $"Sub CreateDrawer_${sname}"$)
	sb.append($"drw${sname} = vm.CreateDrawer("drw${sname}", Me)"$).append(CRLF)
	CodeLine2(sb, smtitle, smsubtitle, "s", "drw", sname, "AddTitleSubTitle")
	CodeLine2(sb, scolor, sintensity, "s", "drw", sname, "SetColorIntensity")
	CodeLine(sb, sminivariantwidth, "s", "drw", sname, "Setminivariantwidth")
	CodeLine(sb, smobilebreakpoint, "s", "drw", sname, "Setmobilebreakpoint")
	CodeLine(sb, soverlaycolor, "s", "drw", sname, "Setoverlaycolor")
	CodeLine(sb, soverlayopacity, "s", "drw", sname, "Setoverlayopacity")
	CodeLine(sb, ssrc, "s", "drw", sname, "Setsrc")
	CodeLine(sb, stag, "s", "drw", sname, "Settag")
	CodeLine(sb, swidth, "s", "drw", sname, "Setwidth")
	CodeLine(sb, sheight, "s", "drw", sname, "Setheight")
	'
	CodeLine(sb, bisabsolute, "b", "drw", sname, "Setabsolute")
	CodeLine(sb, bisapp, "b", "drw", sname, "Setapp")
	CodeLine(sb, bisbottom, "b", "drw", sname, "Setbottom")
	CodeLine(sb, bisclipped, "b", "drw", sname, "Setclipped")
	CodeLine(sb, bisdark, "b", "drw", sname, "Setdark")
	CodeLine(sb, bisdisableresizewatcher, "b", "drw", sname, "Setdisableresizewatcher")
	CodeLine(sb, bisdisableroutewatcher, "b", "drw", sname, "Setdisableroutewatcher")
	CodeLine(sb, bisexpandonhover, "b", "drw", sname, "Setexpandonhover")
	CodeLine(sb, bisfixed, "b", "drw", sname, "Setfixed")
	CodeLine(sb, bisfloating, "b", "drw", sname, "Setfloating")
	CodeLine(sb, bishideoverlay, "b", "drw", sname, "Sethideoverlay")
	CodeLine(sb, bislight, "b", "drw", sname, "Setlight")
	CodeLine(sb, bisminivariant, "b", "drw", sname, "Setminivariant")
	CodeLine(sb, bispermanent, "b", "drw", sname, "Setpermanent")
	CodeLine(sb, bisright, "b", "drw", sname, "Setright")
	CodeLine(sb, bisstateless, "b", "drw", sname, "Setstateless")
	CodeLine(sb, bistemporary, "b", "drw", sname, "Settemporary")
	CodeLine(sb, bistouchless, "b", "drw", sname, "Settouchless")
	CodeLine(sb, bisvisible, "b", "drw", sname, "Setvisible")
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
			sb.append($"drw${sname}.AddItem1("${sskey}", "${ssavatar}", "${ssiconname}", "${sIconcolor}", "${sstitle}", "${sssubtitle}", "", "${ssactionicon}", "")"$).append(CRLF)
			If bisdivider Then AddCode(sb,$"drw.AddDivider1(${bisinset})"$)
		Next
	Else
		'set data source
		AddCode(sb, $"vm.setdata("${sDatasource}", vm.newlist)"$)
		AddCode(sb, $"drw${sname}.SetDataSourceTemplate1("${sDatasource}","${sKeyfld}","${sAvatarfld}","${sIconfld}","${sIconcolorfld}","${sTitlefld}","${sSubtitlefld}","${sSubtitle1fld}","${sActioniconfld}","${sActioniconcolorfld}")"$)
	End If
	'
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
	
End Sub

Sub Design_SpeedDial
	Dim speeddial As VMSpeedDial = ui.CreateSpeedDial("speeddial" & sname, Me)
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
	speeddial.SetTo(sto)
	speeddial.SetTop(bistop)
	speeddial.SetTransition(stransition)
	speeddial.SetVisible(bisvisible)
	speeddial.SetXlarge(bisXlarge)
	speeddial.SetXsmall(bisXsmall)
	speeddial.SetColorIntensity(scolor, sintensity)
	speeddial.SetTextColorIntensity(stextcolor, stextintensity)
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
	sb.append($"Dim spd${sname} As VMSpeedDial = vm.CreateSpeedDial("spd${sname}", Me)"$).append(CRLF)
	CodeLine(sb, bisabsolute, "b", "spd", sname, "SetAbsolute")
	CodeLine(sb, bisbottom, "b", "spd", sname, "SetBottom")
	CodeLine(sb, bisdark, "b", "spd", sname, "SetDark")
	CodeLine(sb, sDirection, "s", "spd", sname, "SetDirection")
	CodeLine(sb, sFinalicon, "s", "spd", sname, "SetFinalicon")
	CodeLine(sb, bisfixed, "b", "spd", sname, "SetFixed")
	CodeLine(sb, shref, "s", "spd", sname, "SetHref")
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
	CodeLine(sb, sto, "s", "spd", sname, "SetTo")
	CodeLine(sb, bistop, "b", "spd", sname, "SetTop")
	CodeLine(sb, stransition, "s", "spd", sname, "SetTransition")
	CodeLine(sb, bisvisible, "b", "spd", sname, "SetVisible")
	CodeLine(sb, bisXlarge, "b", "spd", sname, "SetXlarge")
	CodeLine(sb, bisXsmall, "b", "spd", sname, "SetXsmall")
	CodeLine2(sb, scolor, sintensity, "s", "spd", sname, "SetColorIntensity")
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
	sb.append($"${sparent}.Container.AddControl(spd${sname}.SpeedDial, spd${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Dialog
	Dim dialog As VMCard = ui.CreateCard("dialog" & sname, Me)
    dialog.SetStatic(True)
	dialog.IsDialog = True
	dialog.SetTitle(stitle)
	dialog.Actions.AddSpacer
	dialog.SetCancel(sCancelid, sCancelcaption)
	dialog.SetOK(sOkid, sOkcaption)
	dialog.Settitleprimary(bistitleprimary)
	dialog.Setdark(bisdark)
	dialog.Setdisabled(bisdisabled)
	dialog.Setwidth(swidth)
	dialog.Setmaxwidth(smaxwidth)
	dialog.Setlight(bislight)
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
	AddComment(sb, "paste this on Process_Globals")
	sb.append($"Private dlg${sname} As VMDialog"$).append(CRLF).append(CRLF)
	AddComment(sb, "create dialog")
	sb.append($"Sub CreateDialog_${vm.propercase(sname)}"$).append(CRLF)
	sb.append($"dlg${sname} = vm.CreateDialog("dlg${sname}", Me)"$).Append(CRLF)
	'
	CodeLine(sb, stitle, "s", "dlg", sname, "Settitle")
	CodeLine2(sb, sOkid, sOkcaption, "s", "dlg", sname, "SetOk")
	CodeLine2(sb, sCancelid, sCancelcaption, "s", "dlg", sname, "SetCancel")
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
	CodeLine(sb, bisdisabled, "b", "dlg", sname, "Setdisabled")
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
	CodeLine(sb, bistitleprimary, "b", "dlg", sname, "Settitleprimary")
	sb.append($"vm.AddDialog(dlg${sname})"$).append(CRLF)
	sb.append("End Sub").append(CRLF)
End Sub

Sub Design_Carousel
	Dim carousel As VMCarousel = ui.CreateCarousel("carousel" & sname, Me)
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
	carousel.Setvisible(bisvisible)
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssavatar As String = m.getdefault("avatar", "")
		If sskey = "" Then Continue
		carousel.AddItem1(ssavatar)
	Next
	'
	ui.AddControl(carousel.Carousel, carousel.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	
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
	CodeLine(sb, bisprevicon, "b", "car", sname, "Setprevicon")
	CodeLine(sb, bisprogress, "b", "car", sname, "Setprogress")
	CodeLine(sb, bisreverse, "b", "car", sname, "Setreverse")
	CodeLine(sb, bisshowarrows, "b", "car", sname, "Setshowarrows")
	CodeLine(sb, bisshowarrowsonhover, "b", "car", sname, "Setshowarrowsonhover")
	CodeLine(sb, bistouchless, "b", "car", sname, "Settouchless")
	CodeLine(sb, bisvertical, "b", "car", sname, "Setvertical")
	CodeLine(sb, bisvisible, "b", "car", sname, "Setvisible")
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssavatar As String = m.getdefault("avatar", "")
		If sskey = "" Then Continue
		CodeLine(sb, ssavatar, "s", "car", sname, "AddItem1")
	Next
	sb.append($"${sparent}.Container.AddControl(car${sname}.Carousel, car${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Menu
	Dim menu As VMMenu = ui.CreateMenu("menu" & sname, Me)
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
	menu.Setdisabled(bisdisabled)
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
	menu.SetVisible(bisvisible)
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
	sb.append($"Dim menu${sname} As VMMenu = vm.CreateMenu("menu${sname}", Me)"$).append(CRLF)
	Select Case menutype
	Case "icon"
		menu.SetIcon(siconname)
		CodeLine(sb, siconname, "s", "menu", sname, "SetIcon")
	Case "btn"
		CodeLine2a(sb, siconname, stitle, "s", "menu", sname, "SetButton")
	End Select
	CodeLine(sb, bisvisible, "b", "menu", sname, "SetVisible")
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
	CodeLine(sb, bisdisabled, "b", "menu", sname, "Setdisabled")
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
		
	sb.append($"${sparent}.Container.AddControl(menu${sname}.Menu, menu${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)

End Sub

Sub Design_ToolBar
	Dim tbl As VMToolBar = ui.CreateToolbar("tbl" & sname, Me)
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
	
	tbl.SetColorIntensity(scolor, sintensity)
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
	tbl.Setvisible(bisvisible)
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
		sb.append($"Dim tbl${sname} As VMToolBar = ui.CreateToolBar("tbl${sname}", Me)"$).append(CRLF)
		Select Case sbartype
		Case "app"
			CodeLine(sb, True, "b", "tbl", sname, "SetAppBar")
		Case "tool"
			CodeLine(sb, True, "b", "tbl", sname, "SetToolBar")
		Case "sys"
			CodeLine(sb, True, "b", "tbl", sname, "SetSystemBar")
		End Select
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
		CodeLine2(sb, slogowidth, slogoheight, "s", "tbl", sname, "Logo.SetSize")
		CodeLine(sb, slogourl, "s", "tbl", sname, "AddLogo")
		If bislogovisible Then
			AddCode(sb, $"tbl${sname}.Logo.Show"$)
		Else
			AddCode(sb, $"tbl${sname}.Logo.Hide"$)
		End If
	Else
		CodeLine(sb, sborderradius, "s", "vm.NavBar", "", "Logo.SetBorderRadius")
		CodeLine(sb, sborderwidth, "s", "vm.NavBar", "", "Logo.SetBorderWidth")
		CodeLine(sb, sbordercolor, "s", "vm.NavBar", "", "Logo.SetBorderColor")
		CodeLine(sb, sborderstyle, "s", "vm.NavBar", "", "Logo.SetBorderStyle")
		CodeLine2(sb, slogowidth, slogoheight, "s", "vm.NavBar", "", "Logo.SetSize")
		CodeLine(sb, slogourl, "s", "vm.NavBar", "", "AddLogo")
		If bislogovisible Then
			AddCode(sb, "vm.NavBar.Logo.Show")
		Else
			AddCode(sb, "vm.NavBar.Logo.Hide")
		End If
	End If
	'
	If biscurrent = False Then
		If bistitle Then CodeLine2(sb, stitle, stitleclass, "s", "tbl", sname, "AddTitle")
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
		CodeLine2(sb, scolor, sintensity, "s", "tbl", sname, "SetColorIntensity")
		
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
		CodeLine(sb, bisvisible, "b", "tbl", sname, "SetVisible")
	Else
		If bistitle Then CodeLine2(sb, stitle, stitleclass, "s", "vm.NavBar", "", "AddTitle")
		If bissubtitle Then CodeLine(sb, stoolbarsubtitle, "s", "vm.NavBar", "", "AddSubHeading1")
		If bissearch Then
			sb.append($"vm.NavBar.AddSpacer"$).append(CRLF)
			sb.append($"vm.NavBar.AddSearch("${ssearchkey}")"$).append(CRLF)
		End If
		If bisspacer Then sb.append($"vm.NavBar.AddSpacer"$).append(CRLF)
		'
		CodeLine2(sb, scolor, sintensity, "s", "vm.NavBar", "", "SetColorIntensity")
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
		CodeLine(sb, bisvisible, "b", "vm.NavBar", "", "SetVisible")
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
		sb.append($"${sparent}.Container.AddControl(tbl${sname}.ToolBar, tbl${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	End If
End Sub

Sub Design_Button
	Dim btn As VMButton = ui.NewButton(Me, True, sname, stitle, True, bisPrimary, False, bfitwidth)
	btn.Sethref(shref)
	btn.SetTarget(starget)
	btn.setto(sto)
	btn.SetTooltip(stooltip)
	btn.SetColorIntensity(scolor, sintensity)
	btn.SetTextColorIntensity(stextcolor, stextintensity)
	btn.SetDisabled(bisdisabled).Setoutlined(bisoutlined)
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
	btn.SetVisible(bisvisible)
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
				
	sb.append($"Dim btn${sname} As VMButton = vm.NewButton(Me, True, "btn${sname}", "${stitle}", True, ${bisPrimary}, False, ${bfitwidth})"$).append(CRLF)
	If shref <> "" Then sb.append($"btn${sname}.Sethref("${shref}")"$).append(CRLF)
	If starget <> "" Then sb.append($"btn${sname}.SetTarget("${starget}")"$).append(CRLF)
	If sto <> "" Then sb.append($"btn${sname}.setto("${sto}")"$).append(CRLF)
	If stooltip <> "" Then sb.append($"btn${sname}.SetTooltip("${stooltip}")"$).append(CRLF)
	If scolor <> "" Then sb.append($"btn${sname}.SetColorIntensity("${scolor}", "${sintensity}")"$).append(CRLF)
	If stextcolor <> "" Then sb.append($"btn${sname}.SetTextColorIntensity("${stextcolor}", "${stextintensity}")"$).append(CRLF)
	If bisdisabled Then sb.append($"btn${sname}.SetDisabled(${bisdisabled})"$).append(CRLF)
	If bisoutlined Then sb.append($"btn${sname}.Setoutlined(${bisoutlined})"$).append(CRLF)
	If bisrounded Then sb.append($"btn${sname}.SetRounded(${bisrounded})"$).append(CRLF)
	If bistext Then sb.append($"btn${sname}.SetTransparent(${bistext})"$).append(CRLF)
	
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
	CodeLine(sb, bisvisible, "b", "btn", sname, "SetVisible")
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
	sb.append($"${sparent}.Container.AddControl(btn${sname}.Button, btn${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'add events
	'
	AddCode(sbEvents, $"Private Sub btn${sname}_click(e As BANanoEvent)"$)
	Select Case sclickaction
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
		sbEvents.append($"If bValid = False Then Return"$).append(CRLF)
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
	txt.SetVisible(bisvisible)
	ui.AddControl(txt.textfield, txt.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim txt${sname} As VMTextField = vm.NewTextField(Me, ${bStatic}, "txt${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, "${siconname}", ${imaxlen}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
	
	'
	CodeLine(sb, svalue, "s", "txt", sname, "SetValue")
	CodeLine(sb, sfieldtype, "s", "txt", sname, "SetFieldType")
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
	CodeLine(sb, bisvisible, "b", "txt", sname, "SetVisible")

	sb.append($"${sparent}.Container.AddControl(txt${sname}.textfield, txt${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub CodeLine(sbx As StringBuilder, varName As String, varType As String, prefix As String, ssname As String, methodName As String)
	Select Case varType
		Case "b"
			If varName Then sbx.append($"${prefix}${ssname}.${methodName}(${varName})"$).append(CRLF)
		Case "s"
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
		compSQL.result = db.executewait(compSQL.query, compSQL.args)
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
	For Each nrec As Map In CompList
		compSQL.RecordFromMap(nrec)
		compSQL.Insert
		compSQL.result = db.executewait(compSQL.query, compSQL.args)
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
	rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	If rsSQL.result.size > 0 Then
		'get the record
		Dim rec As Map = rsSQL.result.get(0)
		'get the id
		Dim sid As String = rec.get("id")
		'delete the record
		rsSQL.Initialize("components", "id")
		rsSQL.Delete(sid)
		rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	End If
	vm.pageresume
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
	rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	vm.pageresume
	ClearTableThings
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
	rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	If rsSQL.result.size > 0 Then
		'get the record
		Dim rec As Map = rsSQL.result.get(0)
		'get the id
		Dim sid As String = rec.get("id")
		'delete the record
		rsSQL.Initialize("grid", "id")
		rsSQL.Delete(sid)
		rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	End If
	vm.pageresume
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
	rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	vm.pageresume
	CreateUX
End Sub

Sub DesignLayout
	vm.Container.AddRows(1)
	vm.Container.AddColumns(1,2,2,2,2)
	vm.Container.AddColumns(1,7,7,7,7)
	vm.Container.AddColumns(1,3,3,3,3)
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
	Dim inputs As VMExpansionPanel = FormPanel
	ep.AddPanel(inputs)
	'
	Dim nav As VMExpansionPanel = NavigationPanel
	ep.AddPanel(nav)
	'
	ep.AddPanel(LayoutPanel)
	ep.AddPanel(ToolsPanel)
	'
	Dim page As VMExpansionPanel = ComponentsPanel
	ep.AddPanel(page)
	'
	vm.container.AddComponent(1, 1, ep.tostring)
	'
	tabs = vm.CreateTabs("tabs", Me).SetGrow(True).SetIconsAndText(True).SetCentered(True).SetVModel("devspace")
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
	mymac = vm.CreateDevice("myma", Me).SetMacbook
	'
	myipad = vm.CreateDevice("myipad", Me).SetIpad
	myipad.hide
	'
	myiphone = vm.CreateDevice("myiphone", Me).SetIphoneX
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
	'	
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
	dbCode = vm.CreatePrism("dbcode", Me).SetLanguage("vb")
	dbCode.SetTitle("Table Schema Source Code")
	schema.AddComponent(2, 1, dbCode.tostring)
	'
	pc = vm.CreatePrism("b4xcode", Me).SetLanguage("vb")
	pc.SetTitle("B4X Source Code")
	b4x.AddComponent(1, 1, pc.tostring)
	
	'html code
	htm = vm.CreatePrism("htmlcode", Me).SetLanguage("html")
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
	Design_TablePreview
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
	Design_TablePreview
End Sub

'show columns applicable to the table listing
Sub schemalisting_click(e As BANanoEvent)
	Dim dbFields As List
	dbFields.initialize
	dbFields.AddAll(Array("key", "title", "subtitle", "colwidth" , "colalign" , "colsortable", "colontable", "edit", "delete"))
	schemaDT.ApplyFilter(dbFields)
	schemaDT.SetDataSourceName("tableitems")
	Design_TablePreview
End Sub

'only show columns that are related to the database
Sub schemaDB_click(e As BANanoEvent)
	Dim dbFields As List
	dbFields.initialize
	dbFields.AddAll(Array("key", "title", "coldatatype" , "collength" , "colvalue", "colindexed", "colvaluedisplay", "edit", "delete"))
	schemaDT.ApplyFilter(dbFields)
	schemaDT.SetDataSourceName("tableitems")
	Design_TablePreview
End Sub

'reset the filter
Sub schemaReset_click(e As BANanoEvent)
	schemaDT.ResetFilter
	schemaDT.SetDataSourceName("tableitems")
	Design_TablePreview
End Sub

Sub AddInstruction(sbx As StringBuilder, modName As String, subName As String, partX As String)
	Dim xcode As String = $"INSTRUCTION: Copy and paste the code below this line to the "${modName}" module,"$
	If subName <> "" Then
	  xcode = xcode & $" inside the "${subName}" subroutine, "$
	End If 
	If partX <> "" Then
		xcode = xcode & $" inside ${partX}"$
	End If
	AddComment(sbx, xcode)
End Sub

Sub Design_DBSourceCode
	'get the table name
	dbCode.SetTitle("Table Schema Source Code")
	Dim tbName As String = BANano.GetLocalStorage("dbtable")
	Dim itemkey As String = BANano.getlocalstorage("itemkey")
	Dim isautoincrement As String = BANano.getlocalStorage("isautoincrement")
	Dim ssingular As String = BANano.getlocalstorage("singular")
	Dim snewid As String = BANano.getlocalstorage("newid")
	Dim sisaddnew As String = BANano.getlocalstorage("isaddnew")
	Dim stitle As String = BANano.getlocalstorage("title")
	Dim isdialog As String = BANano.getlocalstorage("isdialog")
	Dim ds As String = BANano.getlocalstorage("ds")
	Dim capName As String = vm.propercase(ssingular)
	capName = capName.replace(" ","")
	capName = capName.trim
	Dim mdlName As String = $"mod${capName}"$
	Dim diagName As String = $"dialog${tbName}"$
	'
	dbCode.SetCode("")
	If tbName = "" Then Return
	Dim dialogKey As String = $"dialog${tbName}"$
	
	Dim flds As List = vm.getdata("tableitems")
	'define fields to sort by
	Dim sorts As List
	sorts.initialize
	Dim kv As Map
	kv.initialize
	Dim actions As List
	actions.initialize
	Dim loaders As List
	loaders.initialize
	'
	Dim sbl As StringBuilder
	sbl.Initialize
	AddComment(sbl, "INSTRUCTION: In your B4J project, click Project > Add New Module > Code Module")
	AddComment(sbl, $"INSTRUCTION: Type "${mdlName}" as the module name and click Ok"$)
	AddNewLine(sbl)
	AddNewLine(sbl)
	'navigation bar
	AddInstruction(sbl, "pgIndex", "BuildNavBar", "")
	AddComment(sbl,$"code to add the add and refresh navigation buttons for ${tbName}"$)
	AddCode(sbl, $"vm.NavBar.AddIcon("btnAdd${capName}","add", "Add ${capName}", "")"$)
	AddCode(sbl, $"vm.NavBar.AddIcon("btnRefresh${capName}","refresh", "Refresh ${stitle}", "")"$)
	AddNewLine(sbl)
	AddNewLine(sbl)
	AddInstruction(sbl, "pgIndex", "BuildNavDrawer" , "")
	AddComment(sbl,$"code to add an item on the drawer for ${tbName}"$)
	AddCode(sbl, $"vm.Drawer.AddItem("page${capName}", "", "${stitle}")"$)
	AddCode(sbl, CRLF)
	AddCode(sbl, CRLF)
	AddInstruction(sbl, "pgIndex", "AddPages" , "")
	AddComment(sbl, $"code to add the ${capName} template code to the master HTML template"$)
	AddCode(sbl, $"vm.AddPage(${mdlName}.name, ${mdlName})"$)
	AddCode(sbl, CRLF)
	AddCode(sbl, CRLF)
	AddInstruction(sbl, "pgIndex", "draweritems_click" , "the case statement")
	AddCode(sbl, $"Case "page${capName.tolowercase}""$)
	AddComment(sbl, $"show ${capName}"$)
	AddCode(sbl, $"${mdlName}.Show"$)
	AddNewLine(sbl)
	AddNewLine(sbl)
	'
	AddInstruction(sbl, "pgIndex", "" , "")
	AddComment(sbl, $"add a new ${capName} record"$)
	AddCode(sbl, $"Sub btnAdd${capName}_click(e As BANanoEvent)"$)
	AddComment(sbl, $"execute adding ${capName}"$)
	AddCode(sbl, $"${mdlName}.Add${tbName}"$)
	AddCode(sbl, "End Sub")
	AddCode(sbl, CRLF)
	AddCode(sbl, CRLF)
	'
	AddComment(sbl, $"refresh ${capName} listing"$)
	AddCode(sbl, $"Sub btnRefresh${capName}_click(e As BANanoEvent)"$)
	'If scanfilter = "Yes" Then
	'	AddComment(pgIdx, "Reset the filters")
	'	AddCode(pgIdx, $"vm.CallMethod("ResetFilters${capName}")"$)
	'End If
	AddComment(sbl, $"execute code to refresh listing for ${capName}"$)
	AddCode(sbl, $"vm.CallMethod("SelectAll_${vm.propercase(tbName)}")"$)
	AddCode(sbl, "End Sub")
	AddCode(sbl, CRLF)
	AddCode(sbl, CRLF)
	
	'confirm code
	AddInstruction(sbl, "pgIndex", "confirm_ok" , "the case statement")
	sbl.append($"Case "delete_${tbName.tolowercase}""$).append(CRLF)
	AddComment(sbl, "read the saved record id")
	sbl.append($"Dim RecID As String = vm.GetState("${tbName}${sItemkey}", "")"$).append(CRLF)
	sbl.append($"If RecID = "" Then Return"$).append(CRLF)
	AddComment(sbl, "delete the record")
	sbl.append($"${mdlName}.DeleteRecord_${vm.propercase(tbName)}(RecID)"$).append(CRLF)
	AddComment(sbl, $"execute code to refresh listing for ${capName}"$)
	AddCode(sbl, $"vm.CallMethod("SelectAll_${vm.propercase(tbName)}")"$)
	sbl.append(CRLF).append(CRLF)
	
	
	AddInstruction(sbl, "Main", "BANano_Ready" , "")
	AddComment(sbl, "database variable * DECLARE 'DB' THIS ONCE")
	sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
	AddComment(sbl, "open the database and wait")
	sbl.append($"db.OpenWait("<dbName>", "<dbName>")"$).append(CRLF)
	AddComment(sbl, "resultset variable")
	sbl.append($"Dim alaSQL As BANanoAlaSQLE"$).append(CRLF)
	AddComment(sbl, "initialize table for table creation")
	sbl.append($"alaSQL.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
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
		Dim xcolvaluedisplay As String = m.GetDefault("colvaluedisplay", "")   'Value / Display
		
		If xkey = "" Then Continue
		Select Case xtype
		Case "action"
			'add to a list of actions
			actions.add(m)
		Case Else
			sbl.append($"alaSQL.SchemaAddField("${xkey}", "${xdatatype}")"$).append(CRLF)
			'we can sort by this field
			If xsortable Then sorts.add(xkey)
			'is this a value / display field to be for combo use
			Select Case xcolvaluedisplay
			Case "isvalue"
				kv.put("value", xkey)
			Case "isdisplay"
				kv.put("display", xkey)
			End Select
		End Select
	Next
	AddComment(sbl, "generate & run command to create the table")
	sbl.append($"alaSQL.SchemaCreateTable"$).append(CRLF)
	sbl.append($"alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)"$).append(CRLF)
	AddNewLine(sbl)
	AddNewLine(sbl)
	'copy this code to a code module
	AddComment(sbl, $"INSTRUCTION: Press and hold Crtl+A to select all code and press Delete key, this will delete all the code"$)
	AddInstruction(sbl, mdlName, "" , "")
	AddCode(sbl, $"'Static code module"$)
	AddCode(sbl, $"#IgnoreWarnings:12"$)
	AddCode(sbl, $"Sub Process_Globals"$)
	AddCode(sbl, $"Public name As String = "${tbName}Code""$)
	AddCode(sbl, $"Public title As String = "${stitle}""$)
	AddCode(sbl, $"Private vm As BANanoVM"$)
	AddCode(sbl, $"Private BANano As BANano  'ignore"$)
	sbl.append($"Private dialog${tbName} As VMDialog"$).append(CRLF)
	sbl.append($"Private datatable${tbName} As VmDataTable"$).append(CRLF)
	sbl.append($"Private cont As VMContainer"$).append(CRLF)
	sbl.append($"Private Mode As String"$).append(CRLF)
	AddCode(sbl, "End Sub")
	AddNewLine(sbl)
	'code for the page
	AddCode(sbl, "Sub Code")
	AddComment(sbl, "Establish a reference to the app")
	AddCode(sbl, "vm = pgIndex.vm")
	AddComment(sbl, "create a container to hold all contents based on the page name")
	AddCode(sbl, $"cont = vm.CreateContainer(name, Me)"$)
	AddComment(sbl, "add the table")
	AddCode(sbl, $"CreateListing_${tbName}"$)
	AddComment(sbl, "hide the container")
	AddCode(sbl, "cont.Hide")
	AddComment(sbl, "add the container to the page")
	AddCode(sbl, "vm.AddContainer(cont)")
	AddComment(sbl, "add the dialog to the page")
	sbl.append($"CreateDialog_${vm.propercase(tbName)}"$).append(CRLF)
	AddComment(sbl, "add method to get all records")
	AddCode(sbl, $"vm.SetMethod(Me, "SelectAll_${vm.propercase(tbName)}")"$)
	AddCode(sbl, "End Sub")
	AddNewLine(sbl)
	'
	AddComment(sbl,"show the page")
	AddCode(sbl, "Sub Show")
	AddComment(sbl, "update the navbar title")
	AddCode(sbl, $"vm.NavBar.UpdateTitle(title)"$)
	AddComment(sbl, "hide all buttons")
	AddCode(sbl, "vm.NavBAr.HideItems")
	AddComment(sbl, $"show buttons for ${mdlName}"$)
	AddCode(sbl, $"vm.ShowItem("btnAdd${capName}")"$)
	AddCode(sbl, $"vm.ShowItem("btnRefresh${capName}")"$)
	AddComment(sbl, "2. Show the page and hide others")
	AddCode(sbl, $"vm.ShowPage(name)"$)
	AddCode(sbl, "End Sub")
	AddNewLine(sbl)
	'
	AddComment(sbl, "delete all records")
	sbl.append($"Sub DeleteAll_${vm.propercase(tbName)}"$).append(CRLF)
	AddComment(sbl, "database variable")
	sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
	AddComment(sbl, "open the database and wait")
	sbl.append($"db.OpenWait("<dbName>", "<dbName>")"$).append(CRLF)
	AddComment(sbl, "resultset variable")
	sbl.append($"Dim alaSQL As BANanoAlaSQLE"$).append(CRLF)
	AddComment(sbl, "initialize table for deletion")
	sbl.append($"alaSQL.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
	AddComment(sbl, "generate & run command to delete all records")
	sbl.append($"alaSQL.DeleteAll"$).append(CRLF)
	sbl.append($"alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)"$).append(CRLF)
	sbl.append("End Sub").append(CRLF).append(CRLF)
	'
	AddComment(sbl, "delete single record")
	sbl.append($"Sub DeleteRecord_${vm.propercase(tbName)}(RecordID As String)"$).append(CRLF)
	AddComment(sbl, "database variable")
	sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
	AddComment(sbl, "open the database and wait")
	sbl.append($"db.OpenWait("<dbName>", "<dbName>")"$).append(CRLF)
	AddComment(sbl, "resultset variable")
	sbl.append($"Dim alaSQL As BANanoAlaSQLE"$).append(CRLF)
	AddComment(sbl, "initialize table for deletion")
	sbl.append($"alaSQL.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
	AddComment(sbl, "generate & run command to delete single record")
	sbl.append($"alaSQL.Delete(RecordID)"$).append(CRLF)
	sbl.append($"alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)"$).append(CRLF)
	sbl.append("End Sub").append(CRLF).append(CRLF)
	'
	AddComment(sbl, "select all records")
	sbl.append($"Sub SelectAll_${vm.propercase(tbName)}"$).append(CRLF)
	AddComment(sbl, "database variable")
	sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
	AddComment(sbl, "open the database and wait")
	sbl.append($"db.OpenWait("<dbName>", "<dbName>")"$).append(CRLF)
	AddComment(sbl, "resultset variable")
	sbl.append($"Dim alaSQL As BANanoAlaSQLE"$).append(CRLF)
	AddComment(sbl, "initialize table for reading")
	sbl.append($"alaSQL.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
	AddComment(sbl, "generate & run command to select all records")
	'use sorts
	Dim ssort As String
	If sorts.size = 0 Then sorts.add(itemkey)
	ssort = vm.List2ArrayVariable(sorts) 	
	sbl.append($"alaSQL.SelectAll(Array("*"), Array(${ssort}))"$).append(CRLF)
	sbl.append($"alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)"$).append(CRLF)
	sbl.append($"VM.SetData("${ds}", alaSQL.Result)"$).append(CRLF)
	sbl.append("End Sub").append(CRLF).append(CRLF)
	'define sub to load data to selects/combo
	If kv.size = 2 Then
		Dim xdisplay As String = kv.getdefault("display", "")
		Dim xvalue As String = kv.getdefault("value", "")
		'define fields to select
		Dim fselect As List
		fselect.initialize
		fselect.add(xvalue)
		fselect.add(xdisplay)
		Dim fFields As String = vm.List2ArrayVariable(fselect)
		'define sort field
		Dim fsort As List
		fsort.Initialize
		fsort.add(xdisplay)
		Dim sFields As String = vm.List2ArrayVariable(fsort)
		'
		AddComment(sbl, "load records for selects/combo")
		sbl.append($"Sub LoadCombo_${vm.propercase(tbName)}"$).append(CRLF)
		AddComment(sbl, "database variable")
		sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
		AddComment(sbl, "open the database and wait")
		sbl.append($"db.OpenWait("<dbName>", "<dbName>")"$).append(CRLF)
		AddComment(sbl, "resultset variable")
		sbl.append($"Dim alaSQL As BANanoAlaSQLE"$).append(CRLF)
		AddComment(sbl, "initialize table for reading")
		sbl.append($"alaSQL.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
		AddComment(sbl, "generate & run command to select records")
		sbl.append($"alaSQL.SelectAll(Array(${fFields}), Array(${sFields}))"$).append(CRLF)
		sbl.append($"alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)"$).append(CRLF)
		sbl.append($"VM.SetData("${tbName}Combo", alaSQL.Result)"$).append(CRLF)
		sbl.append("End Sub").append(CRLF).append(CRLF)
	End If
	'insert & update the record to the database
	AddComment(sbl, "create/update record to table")
	sbl.append($"Sub CreateUpdate_${vm.propercase(tbName)}"$).append(CRLF)
	AddComment(sbl, "get the record to create/update")
	sbl.append($"Dim Record As Map = ${dialogKey}.Container.GetData"$).append(CRLF)
	AddComment(sbl, "validate the record")
	sbl.append($"Dim bValid As Boolean = vm.Validate(Record, ${dialogKey}.Container.Required)"$).append(CRLF)
	AddComment(sbl, "if invalid exit create/update")
	sbl.append($"If bValid = False Then Return"$).append(CRLF)
	AddComment(sbl, "database variable")
	sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
	AddComment(sbl, "open the database and wait")
	sbl.append($"db.OpenWait("<dbName>", "<dbName>")"$).append(CRLF)
	AddComment(sbl, "resultset variable")
	sbl.append($"Dim alaSQL As BANanoAlaSQLE"$).append(CRLF)
	AddComment(sbl, "initialize table for insert/update")
	sbl.append($"alaSQL.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
	' we have an auto increment field
	If isautoincrement.EqualsIgnoreCase("yes") Then
		AddComment(sbl, "generate max value")
		sbl.append($"Dim nextID As Int = 0"$).append(CRLF)
		AddComment(sbl, "generate & run command to get max value")
		sbl.append($"alaSQL.GetMax"$).append(CRLF)
		sbl.append($"alaSQL.Result = db.ExecuteWait(alaSQL.query, alaSQL.args)"$).append(CRLF)
		sbl.append($"nextID = alaSQL.GetNextID"$).append(CRLF)
		AddComment(sbl, "update the record with the next id")
		sbl.append($"Record.Put("${itemkey}", nextID)"$).append(CRLF)
		AddComment(sbl, "initialize table for insert/update after auto-increment")
		sbl.append($"alaSQL.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
	End If
	
	AddComment(sbl, "define schema for record")
	sbl.append($"alaSQL.SchemaFromDesign(${dialogKey}.Container)"$).append(CRLF)
	AddComment(sbl, "prepare record for database")
	sbl.append($"alaSQL.RecordFromMap(Record)"$).append(CRLF)
	AddComment(sbl, "are we creating/updating a record")
	sbl.append($"Select Case Mode"$).append(CRLF)
	sbl.append($"Case "A""$).Append(CRLF)
	AddComment(sbl, "insert a record")
	sbl.append($"alaSQL.Insert"$).append(CRLF)
	AddComment(sbl, "generate & run command to insert record")
	sbl.append($"alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)"$).append(CRLF)
	sbl.append($"Case "E""$).Append(CRLF)
	AddComment(sbl, "read record id")
	sbl.append($"Dim RecID As String = Record.Get("${itemkey}")"$).append(CRLF)
	AddComment(sbl, "update a record")
	sbl.append($"alaSQL.Update(RecID)"$).append(CRLF)
	AddComment(sbl, "generate & run command to update record")
	sbl.append($"alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)"$).append(CRLF)
	sbl.append($"End Select"$).append(CRLF)
	sbl.append("End Sub").append(CRLF).append(CRLF)
	'read record from the database
	AddComment(sbl, "read record")
	sbl.append($"Sub Read_${vm.propercase(tbName)}(RecID As String)"$).append(CRLF)
	AddComment(sbl, "set default values")
	sbl.append($"${dialogKey}.Container.SetDefaults"$).append(CRLF)
	AddComment(sbl, "database variable")
	sbl.append($"Dim db As BANanoSQL"$).append(CRLF)
	AddComment(sbl, "open the database and wait")
	sbl.append($"db.OpenWait("<dbName>", "<dbName>")"$).append(CRLF)
	AddComment(sbl, "resultset variable")
	sbl.append($"Dim alaSQL As BANanoAlaSQLE"$).append(CRLF)
	AddComment(sbl, "initialize table for reading")
	sbl.append($"alaSQL.Initialize("${tbName}", "${itemkey}")"$).append(CRLF)
	AddComment(sbl, "generate & run command to read record")
	sbl.append($"alaSQL.Read(RecID)"$).append(CRLF)
	sbl.append($"alaSQL.Result = db.executewait(alaSQL.query, alaSQL.args)"$).append(CRLF)
	AddComment(sbl, "was the read successful?")
	sbl.append($"If alaSQL.Result.Size = 0 Then Return"$).append(CRLF)
	AddComment(sbl, "the record as found!")
	sbl.append($"Dim Record As Map = alaSQL.result.get(0)"$).append(CRLF)
	AddComment(sbl, "Update the dialog details")
	AddCode(sbl, $"${diagName}.SetTitle("Edit ${vm.propercase(ssingular)}")"$)
	AddComment(sbl, "set the default values for the dialog")
	AddCode(sbl, $"${diagName}.Container.SetDefaults"$)
	AddComment(sbl, "update the state, this updates the v-model(s) for each input control")
	AddComment(sbl, "save the state and update UI!")
	sbl.append($"vm.SetState(Record)"$).append(CRLF)
	AddComment(sbl, "show the modal")
	AddCode(sbl, $"vm.ShowDialog("${diagName}")"$)
	sbl.append("End Sub").append(CRLF).append(CRLF)
	'process table actions
	For Each m As Map In actions
		Dim xkey As String = m.GetDefault("key","")   'Name
		Dim xtitle As String = m.GetDefault("title","")  'Title
		'
		AddComment(sbl, $"${tbName} ${xtitle} action"$)
		sbl.append($"Sub ${tbName}_${xkey}(item As Map)"$).append(CRLF)
		AddComment(sbl, "get the key")
		sbl.append($"Dim RecID As String = item.Get("${sItemkey}")"$).append(CRLF)
		Select Case xkey
		Case "edit"
			'we are editing
			AddComment(sbl,"set mode to E-dit")
			sbl.append($"Mode = "E""$).append(CRLF)
			AddComment(sbl,"read record from database")
			sbl.append($"Read_${vm.propercase(tbName)}(RecID)"$).append(CRLF)
		Case "delete"
			'we are deleting
			AddComment(sbl, "save the id to delete")
			sbl.append($"vm.SetData("${tbName}${sItemkey}", RecID)"$).append(CRLF)
			AddComment(sbl, "show confirm dialog")
			sbl.append($"vm.ShowConfirm("delete_${tbName.tolowercase}", "Confirm Delete: " & RecID, "$ & "_").append(CRLF)
			sbl.append($""Are you sure that you want to delete this ${ssingular}. You will not be able to undo your actions. Continue?","Ok","Cancel")"$).append(CRLF)
		Case Else
			'we are doing something else		
		End Select
		sbl.append($"End Sub"$).append(CRLF).Append(CRLF).append(CRLF)
	Next
	'add a new record
	AddComment(sbl, "add a new record")
	sbl.append($"Sub Add${tbName}"$).Append(CRLF)
	AddComment(sbl, "set mode to A-add")
	sbl.append($"Mode = "A""$).append(CRLF)
	AddComment(sbl, "set default values")
	sbl.append($"${dialogKey}.Container.SetDefaults"$).append(CRLF)
	AddComment(sbl, "update the title")
	sbl.append($"${dialogKey}.SetTitle("New ${vm.ProperCase(ssingular)}")"$).append(CRLF)
	AddComment(sbl, "show dialog")
	sbl.append($"vm.ShowDialog("${dialogKey}")"$).append(CRLF)
	sbl.append("End Sub").append(CRLF).append(CRLF).Append(CRLF)
	'button to add a new record
	If sisaddnew = "Yes" Then
		AddComment(sbl, "when add new is clicked")
		sbl.append($"Sub ${snewid}_click(e As BANanoEvent)"$).Append(CRLF)
		sbl.append($"Add${tbName}"$).append(CRLF)
		sbl.append("End Sub").append(CRLF).append(CRLF)
	End If
	'create dialog
	If isdialog Then
		AddComment(sbl, "create dialog")
		
		sbl.append($"Sub CreateDialog_${vm.propercase(tbName)}"$).append(CRLF)
		sbl.append($"dialog${tbName} = vm.CreateDialog("dialog${tbName}", Me)"$).Append(CRLF)
		CodeLine(sbl, stitle, "s", "dialog", tbName, "SetTitle")
		CodeLine2(sbl, $"btnOk${tbName}"$, "Save", "s", "dialog", tbName, "SetOk")
		CodeLine2(sbl, $"btnCancel${tbName}"$, "Cancel", "s", "dialog", tbName, "SetCancel")
		CodeLine(sbl, "70%", "s", "dialog", tbName, "Setwidth")
		CodeLine(sbl, True, "b", "dialog", tbName, "Setpersistent")
		sbl.append($"vm.AddDialog(dialog${tbName})"$).append(CRLF)
		sbl.append("End Sub").append(CRLF).append(CRLF)
		'add the save and cancel code
		
		AddComment(sbl, $"add code to save the ${ssingular}"$)
		sbl.append($"Sub btnOk${tbName}_click(e As BANanoEvent)"$).append(CRLF)
		AddComment(sbl, "save the record")
		sbl.append($"CreateUpdate_${vm.propercase(tbName)}"$).append(CRLF)
		AddComment(sbl, $"execute code to refresh listing for ${capName}"$)
		AddCode(sbl, $"vm.CallMethod("SelectAll_${vm.propercase(tbName)}")"$)
		sbl.append("End Sub").append(CRLF).append(CRLF)
		'add code to cancel the dialog
		AddComment(sbl, $"add code to cancel the dialog for ${ssingular}"$)
		sbl.append($"Sub btnCancel${tbName}_click(e As BANanoEvent)"$).append(CRLF)
		AddComment(sbl, "hide the modal")		
		AddCode(sbl, $"vm.HideDialog("dialog${tbName}")"$)
		sbl.append("End Sub").append(CRLF).append(CRLF)
	End If
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
	pbtable.OpenPanel(1)
	pbtable.edititem(skey)
End Sub

Sub schemaDT_delete(item As Map)
	Dim skey As String = item.getdefault("key", "")
	If skey = "" Then Return
	pbtable.OpenPanel(1)
	pbtable.edititem(skey)
	pbtable.DeleteItem
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

Sub ComponentsPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("ep0grid", "ep1", Me)
	grd.Header.SetText("My Components")
	grd.Container.SetTag("div")
	grd.Container.AddRows(1).AddColumns12
	'
	Dim myComponents1 As VMList = vm.CreateList("mycomponents", Me)
	myComponents1.SetDataSourceTemplate("myux", "id", "avatar", "", "vmodel", "label", "")
	
	grd.Container.AddComponent(1,1,myComponents1.tostring)

	Return grd
End Sub

Sub DesignStructure(scontents As String)
	ReadTableDetails(mattr)
			
	If scontents = "" Then
		'we dont have menu items
		vm.setdata("tableitems", vm.newlist)
	Else
		Dim contents As List = BANano.FromJson(scontents)
		vm.setdata("tableitems", contents)
	End If
	schemaDT.SetDataSourceName("tableitems")
	'apply filter
	Dim dbFields As List
	dbFields.initialize
	dbFields.AddAll(Array("key", "title", "coltype", "colscope" , "colfieldtype" , "coldefaultvalue", "colminrange", "colmaxrange", "colhasset", "colhasget", "edit", "delete"))
	schemaDT.ApplyFilter(dbFields)
	Design_TablePreview
End Sub


Sub TableStructure(scontents As String)
	ReadTableDetails(mattr)
			
	If scontents = "" Then
		'we dont have menu items
		vm.setdata("tableitems", vm.newlist)
	Else
		Dim contents As List = BANano.FromJson(scontents)
		vm.setdata("tableitems", contents)
	End If
	schemaDT.SetDataSourceName("tableitems")
	'apply filter
	Dim dbFields As List
	dbFields.initialize
	dbFields.AddAll(Array("key", "title", "coldatatype" , "collength" , "colvalue", "colindexed", "colvaluedisplay", "edit", "delete"))
	schemaDT.ApplyFilter(dbFields)
	Design_TablePreview
End Sub

Sub ClearTableThings
	vm.setdata("tableitems", vm.newlist)
	BANano.setlocalstorage("title", "")
	BANano.SetLocalStorage("dbtable", "")
	BANano.setlocalstorage("itemkey", "")
	BANano.SetlocalStorage("isautoincrement", "")
	BANano.setlocalstorage("singular", "")
	BANano.setlocalstorage("newid", "")
	BANano.setlocalstorage("isaddnew", "")
	BANano.setlocalstorage("ds","")
	dbCode.SetCode("")
End Sub

'a component has been clicked
Sub mycomponents_click(e As BANanoEvent)
	istool = False
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
	rsSQL.Read(itemID)
	rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	If rsSQL.result.size = 0 Then Return
	'read the first record found
	Dim rec As Map = rsSQL.result.get(0)
	'read the type of record
	Dim stypeof As String = rec.get("controltype")
	Dim sattributes As String = rec.get("attributes")
	Dim mattr As Map = BANano.FromJson(sattributes)
	'DONT OVERWRITE
	If avatarMap.containskey(stypeof) Then 
		mattr.remove("controltype")
	End If
	vm.setdata("propbagtype", stypeof)
	vm.setdata("propbag", mattr)
	vm.setdata("bag", rec)
	ClearTableThings
	
	'show the property bags
	Select Case stypeof
		Case "table"
			ShowBag("pbtable")
			pbtable.SetDefaults
			vm.setdata("controltype", "table")
			pbtable.hideitem("id")
			pbtable.Hideitem("controltype")
			pbtable.ClearContents
			'get the items
			Dim scontents As String = rec.getdefault("items", "")
			'
			TableStructure(scontents)
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
			'get the items
			Dim scontents As String = rec.getdefault("items", "")
			If scontents = "" Then
				'we dont have menu items
				vm.setdata("tableitems", vm.newlist)
			Else
				Dim contents As List = BANano.FromJson(scontents)
				vm.setdata("tableitems", contents)
			End If
			'
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
			'get the items
			Dim scontents As String = rec.getdefault("items", "")
			DesignStructure(scontents)
			vm.setdata("devspace", 1)
		Case "panel"
			ShowBag("pbexpansionpanels")
			pbexpansionpanels.SetDefaults
			vm.setdata("controltype", "panel")
			pbexpansionpanels.hideitem("id")
			pbexpansionpanels.Hideitem("controltype")
			pbexpansionpanels.ClearContents
			'get the items
			Dim scontents As String = rec.getdefault("items", "")
			If scontents = "" Then
				'we dont have menu items
				vm.setdata("tableitems", vm.newlist)
			Else
				Dim contents As List = BANano.FromJson(scontents)
				vm.setdata("tableitems", contents)
			End If
		
		Case "stepper"
			ShowBag("pbstepper")
			pbstepper.SetDefaults
			vm.setdata("controltype", "stepper")
			pbstepper.hideitem("id")
			pbstepper.Hideitem("controltype")
			pbstepper.ClearContents
			'get the items
			Dim scontents As String = rec.getdefault("items", "")
			If scontents = "" Then
				'we dont have menu items
				vm.setdata("tableitems", vm.newlist)
			Else
				Dim contents As List = BANano.FromJson(scontents)
				vm.setdata("tableitems", contents)
			End If
		
		Case "tabs"
			ShowBag("pbtabs")
			pbtabs.SetDefaults
			vm.setdata("controltype", "tabs")
			pbtabs.hideitem("id")
			pbtabs.Hideitem("controltype")
			pbtabs.ClearContents
			'get the items
			Dim scontents As String = rec.getdefault("items", "")
			If scontents = "" Then
				'we dont have menu items
				vm.setdata("tableitems", vm.newlist)
			Else
				Dim contents As List = BANano.FromJson(scontents)
				vm.setdata("tableitems", contents)
			End If
		Case "list"
			ShowBag("pblist")
			pblist.SetDefaults
			vm.setdata("controltype", "list")
			pblist.hideitem("id")
			pblist.Hideitem("controltype")
			pblist.ClearContents
			'get the items
			Dim scontents As String = rec.getdefault("items", "")
			If scontents = "" Then
				'we dont have menu items
				vm.setdata("tableitems", vm.newlist)
			Else
				Dim contents As List = BANano.FromJson(scontents)
				vm.setdata("tableitems", contents)
			End If
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
			'get the items
			Dim scontents As String = rec.getdefault("items", "")
			If scontents = "" Then
				'we dont have menu items
				vm.setdata("tableitems", vm.newlist)
			Else
				Dim contents As List = BANano.FromJson(scontents)
				vm.setdata("tableitems", contents)
			End If
		Case "drawer"
			ShowBag("pbdrawer")
			pbdrawer.SetDefaults
			pbdrawer.hideitem("id")
			pbdrawer.Hideitem("controltype")
			vm.setdata("controltype", "drawer")
			pbdrawer.ClearContents
			'get the items
			Dim scontents As String = rec.getdefault("items", "")
			If scontents = "" Then
				'we dont have menu items
				vm.setdata("tableitems", vm.newlist)
			Else
				Dim contents As List = BANano.FromJson(scontents)
				vm.setdata("tableitems", contents)
			End If
		Case "menu"
			ShowBag("pbmenu")
			pbmenu.SetDefaults
			pbmenu.hideitem("id")
			pbmenu.Hideitem("controltype")
			vm.setdata("controltype", "menu")
			pbmenu.ClearContents
			'get the items
			Dim scontents As String = rec.getdefault("items", "")
			If scontents = "" Then
				'we dont have menu items
				vm.setdata("tableitems", vm.newlist)
			Else
				Dim contents As List = BANano.FromJson(scontents)
				vm.setdata("tableitems", contents)
			End If
		Case "toolbar"
			ShowBag("pbtoolbar")
			pbtoolbar.SetDefaults
			pbtoolbar.hideitem("id")
			pbtoolbar.Hideitem("controltype")
			vm.setdata("controltype", "toolbar")
			pbtoolbar.ClearContents
			
			'get the items
			Dim scontents As String = rec.getdefault("items", "")
			If scontents = "" Then
				'we dont have menu items
				vm.setdata("tableitems", vm.newlist)
			Else
				Dim contents As List = BANano.FromJson(scontents)
				vm.setdata("tableitems", contents)
			End If
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
	Log(mattr)
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
	Return grd
End Sub

Sub ToolboxImage(eid As String, url As String, tt As String) As VMImage
	Dim img As VMImage = vm.CreateImage(eid, Me).SetStatic(True).SetValue(url).SetOnDragStart(Me, "ItemDragStart")
	img.SetHeight("32px").SetWidth("32px").SetCursorMove.SetTooltip(tt).RemoveAttr("v-show")
	avatarMap.put(eid, url)
	Return img
End Sub

Sub FormPanel As VMExpansionPanel
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
	ShowBag("")
	istool = False
	ClearTableThings
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
					Dim nrec As Map = CreateMap()
					nrec.put("id", DateTime.now)
					nrec.put("controltype", savedid)
					rsSQL.RecordFromMap(nrec)
					rsSQL.Insert
					rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
					vm.pageresume
				Case Else
					If avatarMap.containskey(savedid) = False Then Return
					BANano.SetLocalStorage("selectedpanel", 2)
					'
					Dim rowPos As Int = 0
					vm.pagepause
					db.OpenWait("bvmdesigner", "bvmdesigner")
					rsSQL.Initialize("components", "row")
					'get the max rows
					rsSQL.GetMax
					rsSQL.result = db.ExecuteWait(rsSQL.query, rsSQL.args)
					rowPos = rsSQL.GetNextID
			
					'
					Dim slabel As String = savedid
					slabel = slabel & vm.cstr(rowPos)
					'
					Dim avatar As String = ""
					If avatarMap.containskey(savedid) Then avatar = avatarMap.get(savedid)
					Dim sid As String = DateTime.now
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
					attr.put("buttontype", "normal")
					attr.put("parent", "vm")
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
							attr.put("newid", "btnNewRecord")
							attr.put("newicon","mdi-plus")
							attr.put("newtooltip", "Add a new record")
							attr.put("ismultisort", "Yes")
							attr.Put("issingleselect", "Yes")	
							attr.put("datasourcename", "records")						
							BANano.SetLocalStorage("selectedpanel", 4)
							
					End Select
					'
					'save just in case
					vm.SetState(attr)
					'
					Dim sjson As String = BANano.ToJson(attr)
					nrec.put("attributes", sjson)
					'
					rsSQL.Initialize("components", "id")
					rsSQL.RecordFromMap(nrec)
					rsSQL.Insert
					rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
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
	pbslider.AddText2("d",CreateMap("parent":"Parent", "vmodel":"VModel"))
	pbslider.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbslider.AddText2("d", CreateMap("label": "Label", "slidervalue": "Value(,)"))
	pbslider.AddText2("d", CreateMap("stepvalue": "Step Value"))
	pbslider.AddText2("d", CreateMap("minvalue": "Min Value", "maxvalue": "Max Value"))
	pbslider.AddText2("d", CreateMap("prependicon": "Prepend Icon", "appendicon": "Append Icon"))
	pbslider.AddText2("d", CreateMap("thumbsize": "Thumb Size", "tabindex":"Tab Index"))
	pbslider.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
	pbslider.AddSelect2("d","thumbcolor","Thumb Color", vm.ColorOptions, "thumbintensity","Thumb Intensity", vm.IntensityOptions)
	pbslider.AddSelect2("d","trackcolor","Track Color", vm.ColorOptions, "trackintensity","Track Intensity", vm.IntensityOptions)
	
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
	pbdatepicker.AddText2("d",CreateMap("parent":"Parent","vmodel":"VModel"))
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
	'
	pbdatepicker.AddHeading("e","Settings")
	pbdatepicker.AddSwitches("e", CreateMap("isrequired": "Required", "isclearable": "Clearable"))
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
	pbdatepicker.AddSwitches("e", CreateMap("ishidedetails": "Hide Details","isnow":"Now"))
	pbdatepicker.AddHeading("f","Matrix")
	pbdatepicker.AddMatrix("f")
	vm.container.Addcomponent(1, 3, pbdatepicker.tostring)
End Sub
#End Region


#Region Button Property Bag
Sub PropertyBag_Button
	Dim ops As Map = CreateMap("add":"Add Record","edit":"Edit Record","save":"Save Record","delete":"Delete Record", _
	"showdialog":"Show Dialog","hidedialog":"Hide Dialog","showpage":"Show Page","":"None","showdrawer":"Show Drawer", "hidedrawer":"Hide Drawer")
	vm.setdata("pbbutton", False)
	lstBags.add("pbbutton")
	pbbutton = vm.CreateProperty("ppbbutton", Me)
	pbbutton.SetVShow("pbbutton")
	pbbutton.AddHeading("d","Details")
	pbbutton.AddText("d","id","ID","","")
	pbbutton.AddSelect("d", "controltype", "Type", controltypes)
	pbbutton.AddText2("d",CreateMap("parent":"Parent","vmodel":"ID"))
	pbbutton.AddText2("d",CreateMap("label":"Label", "iconname":"Icon Name"))
	pbbutton.AddRadioGroupH("d", "iconpos", "Icon Position", iconpos)
	pbbutton.AddRadioGroupH("d", "buttontype", "Button Type", CreateMap("normal":"Normal","icon":"Icon","fab":"FAB"))
	pbbutton.AddText("d","href","Href","","")
	pbbutton.AddText("d","to","Navigate To","","")
	pbbutton.AddSelect2("d","target","Target", vm.TargetOptions, "size", "Size", iconsizes)
	pbbutton.AddText("d","dialogpage","Dialog / Page Name / Drawer","","")
	pbbutton.AddSelect("d","clickaction", "On Click Action", ops)
	pbbutton.AddText("d","tooltip","Tooltip","","")
	pbbutton.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
	pbbutton.AddSelect2("d","textcolor","Text Color", vm.ColorOptions, "textintensity","Text Intensity", vm.IntensityOptions)
	pbbutton.AddNumber("d","tabindex","Tab Index","","")
	pbbutton.AddHeightWidths("f")
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
	pbicon.AddText2("d",CreateMap("parent":"Parent", "vmodel":"ID"))
	pbicon.AddText("d","iconname","Icon Name","","mdi-account-circle")
	pbicon.AddSelect("d", "size", "Icon Size", iconsizes)
	pbicon.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
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
	pbimage.AddText2("d",CreateMap("parent":"Parent", "vmodel":"VModel"))
	pbimage.AddText("d","src","Src","","./assets/sponge.png")
	pbimage.AddText("d","lazysrc","Lazy Src","","")
	pbimage.AddText("d","alt","Alt","","")
	pbimage.AddText("d","tooltip","Tooltip","","")
	pbimage.AddNumber("d","tabindex","Tab Index","","")
	pbimage.AddText2("d", CreateMap("borderradius":"Border Radius", "borderwidth":"Border Width"))
	pbimage.AddSelect2("d","bordercolor","Border Color", vm.ColorOptions, "borderstyle","Border Style",vm.BorderOptions)
	pbimage.AddText("d","aspectratio","Aspect Ratio","","")
	pbimage.AddHeightWidths("f")
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
	pbcheckbox.AddText2("d",CreateMap("parent":"Parent", "vmodel":"VModel"))
	pbcheckbox.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbcheckbox.AddText2("d",CreateMap("label":"Label", "value": "Value"))
	pbcheckbox.AddText2("d",CreateMap("truevalue":"True Value", "falsevalue":"False Value"))
	pbcheckbox.AddText2("d", CreateMap("tabindex":"Tab Index"))
	pbcheckbox.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
	pbcheckbox.AddSelect("d","switchloading","Loading", vm.ColorOptions)
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
	pbradiogroup.AddText2("d",CreateMap("parent":"Parent","vmodel":"VModel"))
	pbradiogroup.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbradiogroup.AddText2("d",CreateMap("label":"Label","value":"Value"))
	pbradiogroup.AddText("d","sourcetable","Data Source","","")
	pbradiogroup.AddText2("d", CreateMap("sourcefield":"Item Value", "displayfield":"Item Text"))
	pbradiogroup.AddTextArea("d","keys","Item Values (,)","", "1,2,3")
	pbradiogroup.AddTextArea("d","values","Item Texts (,)", "", "One,Two,Three")
	pbradiogroup.AddNumber("d","tabindex","Tab Index","","")
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

#Region Select Property Bag
Sub PropertyBag_Select
	vm.setdata("pbselectbox", False)
	lstBags.add("pbselectbox")
	pbselectbox = vm.CreateProperty("ppbselectbox", Me)
	pbselectbox.SetVShow("pbselectbox")
	pbselectbox.AddHeading("d","Details")
	pbselectbox.AddText("d","id","ID","","")
	pbselectbox.AddSelect("d", "controltype", "Type", controltypes)
	pbselectbox.AddText2("d",CreateMap("parent":"Parent", "vmodel":"VModel"))
	pbselectbox.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbselectbox.AddText2("d",CreateMap("label":"Label", "value": "Value"))
	pbselectbox.AddText("d","iconname","Icon Name","","")
	pbselectbox.AddText("d","placeholder","Placeholder","","")
	pbselectbox.AddNumber("d","tabindex","Tab Index","","")
	pbselectbox.AddText("d","helpertext","Helper Text","","")
	pbselectbox.AddText("d","errortext","Error Text","","")
	pbselectbox.AddText("d","sourcetable","Data Source","","")
	pbselectbox.AddText2("d",CreateMap("sourcefield":"Item Value", "displayfield":"Item Text"))
	pbselectbox.AddTextArea("d","keys","Item Values (,)","", "1,2,3")
	pbselectbox.AddTextArea("d","values","Item Texts (,)", "", "One,Two,Three")
	'
	pbselectbox.AddHeading("e","Settings")
	pbselectbox.AddSwitches("e", CreateMap("isrequired": "Required", "isclearable": "Clearable"))
	pbselectbox.AddSwitches("e", CreateMap("isvisible": "Visible", "isdisabled": "Disabled"))
	pbselectbox.AddSwitches("e", CreateMap("ismultiple": "Multiple", "ontable": "On Table"))
	pbselectbox.AddSwitches("e", CreateMap("issolo": "Solo", "isoutlined": "Outlined"))
	pbselectbox.AddSwitches("e", CreateMap("isfilled": "Filled", "isdense": "Dense"))
	pbselectbox.AddSwitches("e", CreateMap("issingleline": "Single Line", "ispersistenthint": "Persistent Hint"))
	pbselectbox.AddSwitches("e", CreateMap("isshaped": "Shaped - FOS", "isloading": "Loading"))
	pbselectbox.AddSwitches("e", CreateMap("isflat": "Flat - Solo", "isrounded": "Rounded - FOS"))
	pbselectbox.AddSwitches("e", CreateMap("ishidedetails": "Hide Details", "useoptions": "Use Options"))
	pbselectbox.AddSwitches("e", CreateMap("isreturnobject": "Return Object", "ischips": "Chips"))
	pbselectbox.AddSwitches("e", CreateMap("issmallchips": "Small Chips", "isdeletablechips": "Deletable Chips"))
	
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
	pbparallax.AddText2("d",CreateMap("parent":"Parent", "vmodel":"ID"))
	pbparallax.AddText("d","height","Height","","500")
	pbparallax.AddText("d","src","Src","","./assets/material.jpg")
	pbparallax.AddText("d","alt","Alt","","")
	
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
	pbcontainer.AddText2("d",CreateMap("parent":"Parent", "vmodel":"ID"))
	pbcontainer.AddSelect2("d","elevation","Elevation",vm.elevation, "transition","Transition",vm.Transition)
	pbcontainer.AddText2("d",CreateMap("borderradius":"Border Radius", "borderwidth":"Border Width"))
	pbcontainer.AddSelect2("d","bordercolor","Border Color", vm.ColorOptions, "borderstyle","Border Style",vm.BorderOptions)
	pbcontainer.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
	pbcontainer.AddHeightWidths("d")
	'
	pbcontainer.AddHeading("e","Settings")
	pbcontainer.AddSwitches("e", CreateMap("isvisible": "Visible", "isfluid": "Fluid"))
	pbcontainer.AddSwitches("e", CreateMap("isshowmatrix": "Show Matrix", "isnogutters": "No Gutters"))
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
	pbtoolbar.AddText2("d",CreateMap("parent":"Parent", "vmodel":"ID"))
	pbtoolbar.AddRadioGroupH("d", "bartype", "Type", CreateMap("app":"AppBar","tool":"ToolBar","sys":"SystemBar"))
	pbtoolbar.AddSelect("d","elevation","Elevation",vm.elevation)
	pbtoolbar.AddText2("d",CreateMap("extensionheight":"Extension Height","searchkey":"Search Key"))
	pbtoolbar.AddText2("d",CreateMap("scrolltarget":"Scroll Target", "scrollthreshold":"Scroll Threshold"))
	pbtoolbar.AddText("d","src","Background Image","","")
	pbtoolbar.AddText("d","label","Title","","")
	pbtoolbar.AddText("d","titleclass","Title Class(es)","","")
	pbtoolbar.AddText("d","toolbarsubtitle","Sub Heading","","")
	pbtoolbar.AddSelect2("d","color","Color", vm.ColorOptions, "intensity","Intensity", vm.IntensityOptions)
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
	pblabel.AddText2("d",CreateMap("parent":"Parent", "vmodel":"VModel"))
	pblabel.AddSelect2("d", "labelsize", "Size", mlabelsize,"fontweight", "Font Weight", vm.FontWeightOptions)
	pblabel.AddTextArea("d","value","Text","","")
	pblabel.AddSelect2("d","textcolor","Text Color", vm.ColorOptions, "textintensity","Text Intensity", vm.IntensityOptions)
	pblabel.AddSelect2("d", "display", "Display", vm.DisplayOptions, "align", "Text Align", vm.TextAlignmentOptions)
	
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
	pbtextfield.AddText2("d",CreateMap("parent":"Parent", "vmodel":"VModel"))
	pbtextfield.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbtextfield.AddText2("d", CreateMap("label": "Label","value": "Value"))
	pbtextfield.AddText("d","iconname","Icon Name","","")
	pbtextfield.AddText("d", "placeholder","Placeholder","","")
	pbtextfield.AddText("d","helpertext","Helper Text","","")
	pbtextfield.AddText("d","errortext","Error Text","","")
	pbtextfield.AddText2("d",CreateMap("tabindex":"Tab Index", "maxlength":"Max Length/Counter"))
	'
	pbtextfield.AddHeading("e","Settings")
	pbtextfield.AddSwitches("e", CreateMap("isrequired": "Required", "isclearable": "Clearable"))
	pbtextfield.AddSwitches("e", CreateMap("isvisible": "Visible", "isdisabled": "Disabled"))
	pbtextfield.AddSwitches("e", CreateMap("isautogrow": "Autogrow", "ontable": "On Table"))
	pbtextfield.AddSwitches("e", CreateMap("issolo": "Solo", "isoutlined": "Outlined"))
	pbtextfield.AddSwitches("e", CreateMap("isfilled": "Filled", "isdense": "Dense"))
	pbtextfield.AddSwitches("e", CreateMap("issingleline": "Single Line", "ispersistenthint": "Persistent Hint"))
	pbtextfield.AddSwitches("e", CreateMap("isshaped": "Shaped - FOS", "isloading": "Loading"))
	pbtextfield.AddSwitches("e", CreateMap("isflat": "Flat - Solo", "isrounded": "Rounded - FOS"))
	pbtextfield.AddSwitches("e", CreateMap("ishidedetails": "Hide Details", "istoggle": "Show Toggle Icons"))
	
	pbtextfield.AddHeading("f","Matrix")
	pbtextfield.AddMatrix("f")
	Dim txtCode As String = pbtextfield.tostring
	vm.Container.AddComponent(1, 3, txtCode)
End Sub
#End Region

Sub DeletePropertyBag
	'get saved property bag
	Dim props As Map = vm.getdata("propbag")
	'get the id
	Dim sid As String = props.get("id")
	Dim slabel As String = props.get("label")
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
	rsSQL.Delete(sid)
	rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
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
	rsSQL.Delete(sid)
	rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	vm.callmethod("LoadProjects")
	vm.NavBar.UpdateTitle($"${Main.AppTitle} ${Main.version}"$)
	vm.SetData("project", vm.newmap)
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

Sub ReadTableDetails(props As Map)
	Dim vmodel As String = props.getdefault("vmodel", "")
	Dim itemkey As String = props.getdefault("itemkey", "")
	Dim isautoincrement As String = props.getdefault("isautoincrement", "No")
	Dim ssingular As String = props.GetDefault("singular", "")
	Dim snewid As String = props.getdefault("newid", "")
	Dim sisaddnew As String = props.getdefault("isaddnew", "")
	Dim isdialog As String = props.getdefault("isdialog", "No")
	Dim slabel As String = props.getdefault("label", "")
	Dim sDatasourcename As String = props.getdefault("datasourcename", "")
	'
	BANano.SetLocalStorage("dbtable", vmodel)
	BANano.setlocalstorage("itemkey", itemkey)
	BANano.SetlocalStorage("isautoincrement", isautoincrement)
	BANano.setlocalstorage("singular", ssingular)
	BANano.setlocalstorage("newid", snewid)
	BANano.setlocalstorage("isaddnew", sisaddnew)
	BANano.setlocalstorage("isdialog", isdialog)
	BANano.Setlocalstorage("title", slabel)
	BANano.setlocalstorage("ds", sDatasourcename)
End Sub

'save the property bag
Sub SavePropertyBag
	Dim isTable As Boolean = False
	'get the saved property bag
	Dim contents As List
	contents.initialize
	Dim scontents As String = ""
	vm.pagepause
	Dim spropbagtype As String = vm.getdata("propbagtype")
	Dim props As Map = CreateMap()
	Select Case spropbagtype
		Case "text", "textarea", "file", "email", "password", "tel", "number"
			props = pbtextfield.properties
		Case "checkbox"
			props = pbcheckbox.Properties
		Case "date", "time"
			props = pbdatepicker.Properties
		Case "radio"
			props = pbradiogroup.Properties
		Case "select", "combo", "auto"
			props = pbselectbox.Properties
		Case "slider"
			props = pbslider.properties
		Case "switch"
			props = pbcheckbox.properties
		Case "label"
			props = pblabel.properties
			Dim isloremipsum As String = props.Get("isloremipsum")
			If isloremipsum = "Yes" Then
				props.Put("value", LoremIpsum(1))
				vm.SetState(props)
			End If
		Case "profile", "image"
			props = pbimage.Properties
		Case "button"
			props = pbbutton.properties
		Case "icon"
			props = pbicon.properties
		Case "parallax"
			props = pbparallax.properties
		Case "container"
			props = pbcontainer.properties
		Case "toolbar"
			props = pbtoolbar.properties
			contents = vm.getdata("tableitems")
			scontents = BANano.tojson(contents)
		Case "menu"
			props = pbmenu.properties
			contents = vm.getdata("tableitems")
			scontents = BANano.tojson(contents)
		Case "drawer"
			props = pbdrawer.properties
			contents = vm.getdata("tableitems")
			scontents = BANano.tojson(contents)
		Case "carousel"
			props = pbcarousel.properties
			contents = vm.getdata("tableitems")
			scontents = BANano.tojson(contents)
		Case "panel"
			props = pbexpansionpanels.properties
			contents = vm.getdata("tableitems")
			scontents = BANano.tojson(contents)
		Case "page"
			props = pbpage.properties
		Case "builder"
			props = pbbuilder.properties
			contents = vm.getdata("tableitems")
			scontents = BANano.tojson(contents)
		Case "stepper"
			props = pbstepper.properties
			contents = vm.getdata("tableitems")
			scontents = BANano.tojson(contents)
		Case "tabs"
			props = pbtabs.properties
			contents = vm.getdata("tableitems")
			scontents = BANano.tojson(contents)
		Case "list"
			props = pblist.properties
			contents = vm.getdata("tableitems")
			scontents = BANano.tojson(contents)
		Case "dialog"
			props = pbdialog.properties
		Case "chip"
			props = pbchip.properties
		Case "badge"
			props = pbbadge.properties
		Case "avatar"
			props = pbavatar.properties
		Case "speeddial"
			props = pbspeeddial.properties
			contents = vm.getdata("tableitems")
			scontents = BANano.tojson(contents)
		Case "rating"
			props = pbrating.properties
		Case "table"
			isTable = pbtable.istable
			props = pbtable.properties
			contents = vm.getdata("tableitems")
			scontents = BANano.tojson(contents)
			'
			ReadTableDetails(props)
	End Select
	'
	Dim sid As String = props.get("id")
	Dim srow As String = props.get("row")
	Dim scol As String = props.get("col")
	Dim stabindex As String = props.get("tabindex")
	Dim stitle As String = props.get("label")
	Dim svmodel As String = props.get("vmodel")
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
	Dim attr As String = BANano.ToJson(props)
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
	vm.setdata("bag", nrec)
	'
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("components", "id")
	rsSQL.RecordFromMap(nrec)
	rsSQL.Update(sid)
	rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	vm.pageresume
	CreateUX
	'
	If isTable Then
	Else
		vm.setdata("devspace", 0)
	End If
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
	pbmenu.AddText2("d",CreateMap("parent":"Parent","vmodel":"ID"))
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
	'
	pbmenu.AddHeading("a", "Items")
	pbmenu.AddMenuItems("a")
	'
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
	pbcarousel.AddText2("d",CreateMap("parent":"Parent", "vmodel":"VModel"))
	pbcarousel.AddText("d","activeclass","ActiveClass","","")
	pbcarousel.AddText("d","delimitericon","DelimiterIcon","","")
	pbcarousel.AddText2("d", CreateMap("height":"Height", "interval":"Interval"))
	pbcarousel.AddText("d","mmax","Max","","")
	pbcarousel.AddSelect2("d","progresscolor","Progress Color", vm.ColorOptions, "progresscolorintensity","Progress Color Intensity", vm.IntensityOptions)
	'
	pbcarousel.AddHeading("i", "Items")
	pbcarousel.AddCarouselItems("i")

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
	vm.setdata("pbdialog", False)
	lstBags.add("pbdialog")
	pbdialog = vm.CreateProperty("ppbdialog", Me)
	pbdialog.SetVShow("pbdialog")
	pbdialog.AddHeading("d","Details")
	pbdialog.AddText("d","id","ID","","")
	pbdialog.AddText("d", "controltype", "Type", "","dialog")
	pbdialog.AddText("d","vmodel","VModel","","")
	pbdialog.AddText("d","label","Title","","")
	pbdialog.AddText2("d",CreateMap("okid":"Ok ID","okcaption":"Ok Caption"))
	pbdialog.AddText2("d",CreateMap("cancelid":"Cancel ID", "cancelcaption":"Cancel Caption"))
	pbdialog.AddText("d","activator","Activator","","")
	pbdialog.AddText("d","contentclass","ContentClass","","")
	pbdialog.AddText("d","origin","Origin","","")
	pbdialog.AddSelect2("d","overlaycolor","OverlayColor", vm.ColorOptions, "overlaycolorintensity","OverlayColor Intensity", vm.IntensityOptions)
	pbdialog.AddText("d","overlayopacity","OverlayOpacity","","")
	pbdialog.AddSelect("d","transition","Transition",vm.Transition)
	pbdialog.AddText2("d",CreateMap("width":"Width","maxwidth":"MaxWidth"))
	'
	pbdialog.AddHeading("e","Settings")
	pbdialog.AddSwitches("e", CreateMap("isattach": "Attach", "isbackdrop": "Backdrop"))
	pbdialog.AddSwitches("e", CreateMap("isdark": "Dark", "isdisabled": "Disabled"))
	pbdialog.AddSwitches("e", CreateMap("iseager": "Eager", "isfullscreen": "Fullscreen"))
	pbdialog.AddSwitches("e", CreateMap("ishideoverlay": "HideOverlay", "isinternalactivator": "InternalActivator"))
	pbdialog.AddSwitches("e", CreateMap("islight": "Light"))
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
	'
	bisattach = YesNoToBoolean(mattr.getdefault("isattach", "No"))
	bisbackdrop = YesNoToBoolean(mattr.getdefault("isbackdrop", "No"))
	bisdisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
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
	'
	pbspeeddial.AddHeading("a", "Items")
	pbspeeddial.AddCrudList("a", CreateMap("key":"Item Key", "title":"Title", "icon":"Icon", "iconcolor":"Icon Color"))
	'
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
scolor = mattr.getdefault("color", "")
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
sto = mattr.getdefault("to", "")
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
	pbrating.AddText2("d",CreateMap("parent":"Parent","vmodel":"VModel"))
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
	scolor = mattr.getdefault("color", "")
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
	bisreadonly = YesNoToBoolean(mattr.getdefault("isreadonly", "No"))
	bisRipple = YesNoToBoolean(mattr.getdefault("isripple", "No"))
	ssize = mattr.getdefault("size", "")
	bisSmall = YesNoToBoolean(mattr.getdefault("issmall", "No"))
	stabindex = mattr.getdefault("tabindex", "")
	bisvisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
	bisXlarge = YesNoToBoolean(mattr.getdefault("isxlarge", "No"))
	bisXsmall = YesNoToBoolean(mattr.getdefault("isxsmall", "No"))
End Sub

Sub Design_Rating
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
	rating.SetVisible(bisvisible)
	rating.SetXlarge(bisXlarge)
	rating.SetXsmall(bisXsmall)
	rating.SetBackgroundColorIntensity(sBackgroundcolor, sBackgroundintensity)
	rating.SetColorIntensity(scolor, sintensity)
	'
	ui.AddControl(rating.Rating, rating.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim rat${sname} As VMRating = vm.CreateRating("rat${sname}", Me)"$).append(CRLF)
	CodeLine(sb, svalue, "s", "rat", sname, "SetValue")
	CodeLine(sb, sfieldtype, "s", "rat", sname, "SetFieldType")
	CodeLine(sb, sclosedelay, "s", "rat", sname, "SetClosedelay")
	CodeLine(sb, bisdark, "b", "rat", sname, "SetDark")
	CodeLine(sb, bisdense, "b", "rat", sname, "SetDense")
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
	CodeLine(sb, bisvisible, "b", "rat", sname, "SetVisible")
	CodeLine(sb, bisXlarge, "b", "rat", sname, "SetXlarge")
	CodeLine(sb, bisXsmall, "b", "rat", sname, "SetXsmall")
	CodeLine2(sb, scolor, sintensity, "b", "rat", sname, "SetColorIntensity")
	CodeLine2(sb, sBackgroundcolor, sBackgroundintensity, "b", "rat", sname, "SetBackgroundColorIntensity")
	AddCode(sb, $"Rating${sname}.SetOnInput(Me, "Rating${sname}_input")"$)
	sb.append($"${sparent}.Container.AddControl(rat${sname}.Rating, rat${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
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
	pbtable.IsTable = True
	pbtable.SetVShow("pbtable")
	pbtable.AddHeading("d","Details")
	pbtable.AddText("d","id","ID","","")
	pbtable.AddText("d", "controltype", "Type", "","table")
	pbtable.AddText2("d",CreateMap("parent":"Parent", "vmodel":"ID"))
	pbtable.AddText("d","label","Title","","")
	pbtable.AddText("d","caption","Caption","","")
	pbtable.AddText("d","singular","Single Record","","")
	pbtable.AddText("d","manyrecords","Many Records","","")
	pbtable.AddText2("d",CreateMap("datasourcename":"Data Source", "itemkey":"Item Key"))
	pbtable.AddRadioGroupH("d","selecttype","Select Type",CreateMap("all":"All","where":"Where"))
	pbtable.AddText("d","selectfields","Select Fields","","")
	pbtable.AddText("d","sortfields","Sort Fields","","")
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
	pbtable.AddText("d","loadingtext","Loading Text","","")
	pbtable.AddText("d","locale","Locale","","")
	pbtable.AddText("d","nodatatext","No Data Text","","")
	pbtable.AddText("d","noresultstext","No Results Text","","")
	'pbtable.AddText("d","search","Search","","")
	'pbtable.AddText("d","selectablekey","Selectable Key","","")
	'pbtable.AddText("d","serveritemslength","Server Items Length","","")
	'
	pbtable.AddHeading("c", "Columns")
	pbtable.AddDataTableColumns("c")
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
	sSelecttype = mattr.getdefault("selecttype", "")
	sSortfields = mattr.getdefault("sortfields", "")
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
	sItemsperpage = mattr.getdefault("itemsperpage", "")
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	bisloading = YesNoToBoolean(mattr.getdefault("isloading", "No"))
	sLoadingtext = mattr.getdefault("loadingtext", "")
	sLocale = mattr.getdefault("locale", "")
	smobilebreakpoint = mattr.getdefault("mobilebreakpoint", "")
	bisMultisort = YesNoToBoolean(mattr.getdefault("ismultisort", "No"))
	bisMustsort = YesNoToBoolean(mattr.getdefault("ismustsort", "No"))
	sNodatatext = mattr.getdefault("nodatatext", "")
	sNoresultstext = mattr.getdefault("noresultstext", "")
	sPage = mattr.getdefault("page", "")
	sSearch = mattr.getdefault("search", "")
	'sSelectablekey = mattr.getdefault("selectablekey", "")
	'sServeritemslength = mattr.getdefault("serveritemslength", "")
	bisShowexpand = YesNoToBoolean(mattr.getdefault("isshowexpand", "No"))
	bisShowgroupby = YesNoToBoolean(mattr.getdefault("isshowgroupby", "No"))
	bisShowselect = YesNoToBoolean(mattr.getdefault("isshowselect", "No"))
	bisSingleexpand = YesNoToBoolean(mattr.getdefault("issingleexpand", "No"))
	bisSingleselect = YesNoToBoolean(mattr.getdefault("issingleselect", "No"))
	'sSortby = mattr.getdefault("sortby", "")
	'sSortdesc = mattr.getdefault("sortdesc", "")
End Sub

Sub Design_TablePreview
	dbCode.SetCode("")
	If istool Then Return
	Design_DBSourceCode
'	previewTB = vm.CreateDataTable("previewSchema", sItemkey, Me)
'	previewTB.SetTitle(slabel)
'	previewTB.SetSearchbox(bisSearchbox)
'	previewTB.SetCaption(sCaption)
'	previewTB.SetCalculatewidths(bisCalculatewidths)
'	previewTB.SetDark(bisdark)
'	previewTB.SetDatasourcename(sDatasourcename)
'	previewTB.SetDense(bisdense)
'	previewTB.SetDisablefiltering(bisDisablefiltering)
'	previewTB.SetDisablepagination(bisDisablepagination)
'	previewTB.SetDisablesort(bisDisablesort)
'	'previewTB.SetExpandicon(sExpandicon)
'	'previewTB.SetExpanded(sExpanded)
'	'previewTB.SetFilters(sFilters)
'	previewTB.SetFixedheader(bisFixedheader)
'	'previewTB.SetGroupby(sGroupby)
'	'previewTB.SetGroupdesc(sGroupdesc)
'	'previewTB.SetHeaderslength(sHeaderslength)
'	previewTB.SetHeight(sheight)
'	previewTB.SetHidedefaultfooter(bisHidedefaultfooter)
'	previewTB.SetHidedefaultheader(bisHidedefaultheader)
'	previewTB.SetItemsperpage(sItemsperpage)
'	previewTB.SetLight(bislight)
'	previewTB.SetLoading(bisloading)
'	previewTB.SetLoadingtext(sLoadingtext)
'	previewTB.SetLocale(sLocale)
'	previewTB.SetMobilebreakpoint(smobilebreakpoint)
'	previewTB.SetMultisort(bisMultisort)
'	previewTB.SetMustsort(bisMustsort)
'	previewTB.SetNodatatext(sNodatatext)
'	previewTB.SetNoresultstext(sNoresultstext)
'	previewTB.SetPage(sPage)
'	'previewTB.SetSearch(sSearch)
'	'previewTB.SetSelectablekey(sSelectablekey)
'	'previewTB.SetServeritemslength(sServeritemslength)
'	previewTB.SetShowexpand(bisShowexpand)
'	previewTB.SetShowgroupby(bisShowgroupby)
'	previewTB.SetShowselect(bisShowselect)
'	previewTB.SetSingleexpand(bisSingleexpand)
'	previewTB.SetSingleselect(bisSingleselect)
'	'previewTB.SetSortby(sSortby)
'	'previewTB.SetSortdesc(sSortdesc)
'	'previewTB.SetTabindex(stabindex)
'	previewTB.SetVisible(bisvisible)
'	'add columns
'	'
'	If bisaddnew Then
'		previewTB.SetAddNew(snewid, snewicon, snewtooltip)
'	End If
'	'add columns
'	For Each m As Map In lcontents
'		Dim xkey As String = m.GetDefault("key","")   'Name
'		Dim xtitle As String = m.GetDefault("title","")  'Title
'		Dim xtype As String = m.GetDefault("subtitle","")  'Type
'		Dim xwidth As String = m.GetDefault("colwidth", "")  'Width
'		Dim xalign As String = m.GetDefault("colalign", "")  'Align
'		Dim xcomponent As String = m.GetDefault("colcontroltype","") 'Component
'		Dim xdatatype As String = m.GetDefault("coldatatype", "")   'Data Type
'		Dim xlength As String = m.GetDefault("collength","")  'Length
'		Dim xvalue As String = m.GetDefault("colvalue", "")   'Value
'		Dim xsortable As String = m.GetDefault("colsortable", "No")    'Sortable
'		Dim xrequired As String = m.GetDefault("colrequired", "No")    'Required
'		Dim xvisible As String = m.GetDefault("colvisible", "No")      'Visible
'		Dim xactive As String = m.getdefault("colactive", "No")        'Active
'		Dim xontable As Boolean = YesNoToBoolean(m.GetDefault("colontable", "No"))      'On Table
'		Dim xindexed As String = m.GetDefault("colindexed", "No")      'Indexed
'		If xkey = "" Then Continue
'		If xontable = False Then Continue
'		Dim bSortable As Boolean = YesNoToBoolean(xsortable)
'		Select Case xtype
'		Case "action"
'		Case Else		
'			previewTB.AddColumn1(xkey, xtitle, xtype, xwidth, bSortable, xalign)
'		End Select
'	Next
'	
'	previewTB.SetEdit(bisEdit)
'	previewTB.SetDelete(bisDelete)
'	previewTB.SetClone(bisClone)
'	previewTB.SetDownload(bisDownload)
'	previewTB.SetPrint(bisPrint)
'	previewTB.SetMenu(bisMenu)
'	For Each m As Map In lcontents
'		Dim xkey As String = m.GetDefault("key","")   'Name
'		Dim xtitle As String = m.GetDefault("title","")  'Title
'		Dim xtype As String = m.GetDefault("subtitle","")  'Type
'		Dim xicon As String = m.GetDefault("icon", "")
'		Select Case xtype
'		Case "action"
'			previewTB.AddIcon(xkey, xtitle, xicon)
'		End Select
'	Next
'	'
'	previewTB.BANanoReplace
End Sub

Sub Design_Table
	Design_TablePreview
	Dim datatable As VMDataTable = ui.CreateDataTable("datatable" & sname, sItemkey, Me)
	datatable.SetStatic(True)
	datatable.SetTitle(stitle)
	datatable.SetSearchbox(bisSearchbox)
	datatable.SetCaption(sCaption)
	datatable.SetCalculatewidths(bisCalculatewidths)
	datatable.SetDark(bisdark)
	datatable.SetDatasourcename(sDatasourcename)
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
	datatable.SetLoadingtext(sLoadingtext)
	datatable.SetLocale(sLocale)
	datatable.SetMobilebreakpoint(smobilebreakpoint)	
	datatable.SetMultisort(bisMultisort)
	datatable.SetMustsort(bisMustsort)
	datatable.SetNodatatext(sNodatatext)
	datatable.SetNoresultstext(sNoresultstext)
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
	datatable.SetVisible(bisvisible)
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
		If xkey = "" Then Continue
		If xontable = False Then Continue
		Dim bSortable As Boolean = YesNoToBoolean(xsortable)
		Select Case xtype
		Case "action"
		Case Else		
			datatable.AddColumn1(xkey, xtitle, xtype,xwidth,bSortable,xalign)
		End Select
	Next
	
	datatable.SetEdit(bisEdit)
	datatable.SetDelete(bisDelete)
	datatable.SetClone(bisClone)
	datatable.SetDownload(bisDownload)
	datatable.SetPrint(bisPrint)
	datatable.SetMenu(bisMenu)
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
	AddCode(sb, $"Sub CreateListing_${sname}"$)
	sb.append($"Dim datatable${sname} As VmDataTable = vm.CreateDataTable("datatable${sname}", "${sItemkey}", Me)"$).append(CRLF)
	CodeLine(sb, stitle, "s", "DataTable", sname, "SetTitle")
	CodeLine(sb, sCaption, "s", "DataTable", sname, "SetCaption")
	CodeLine(sb, bisSearchbox, "b", "DataTable", sname, "SetSearchbox")
	If bisaddnew Then
		sb.append($"datatable${sname}.SetAddNew("${snewid}", "${snewicon}", "${snewtooltip}")"$).append(CRLF)
	End If
	'
	AddCode(sb, $"vm.setdata("${sDatasourcename}", vm.newlist)"$)
	CodeLine(sb, bisCalculatewidths, "b", "DataTable", sname, "SetCalculatewidths")
	CodeLine(sb, bisdark, "b", "DataTable", sname, "SetDark")
	CodeLine(sb, sDatasourcename, "s", "DataTable", sname, "SetDatasourcename")
	CodeLine(sb, bisdense, "b", "DataTable", sname, "SetDense")
	CodeLine(sb, bisDisablefiltering, "b", "DataTable", sname, "SetDisablefiltering")
	CodeLine(sb, bisDisablepagination, "b", "DataTable", sname, "SetDisablepagination")
	CodeLine(sb, bisDisablesort, "b", "DataTable", sname, "SetDisablesort")
	'CodeLine(sb, sExpandicon, "s", "DataTable", sname, "SetExpandicon")
	'CodeLine(sb, sExpanded, "s", "DataTable", sname, "SetExpanded")
	'CodeLine(sb, sFilters, "s", "DataTable", sname, "SetFilters")
	CodeLine(sb, bisFixedheader, "b", "DataTable", sname, "SetFixedheader")
	'CodeLine(sb, sGroupby, "s", "DataTable", sname, "SetGroupby")
	'CodeLine(sb, sGroupdesc, "s", "DataTable", sname, "SetGroupdesc")
	'CodeLine(sb, sHeaderslength, "s", "DataTable", sname, "SetHeaderslength")
	CodeLine(sb, sheight, "s", "DataTable", sname, "SetHeight")
	CodeLine(sb, bisHidedefaultfooter, "b", "DataTable", sname, "SetHidedefaultfooter")
	CodeLine(sb, bisHidedefaultheader, "b", "DataTable", sname, "SetHidedefaultheader")
	CodeLine(sb, sItemsperpage, "s", "DataTable", sname, "SetItemsperpage")
	CodeLine(sb, bislight, "b", "DataTable", sname, "SetLight")
	CodeLine(sb, bisloading, "b", "DataTable", sname, "SetLoading")
	CodeLine(sb, sLoadingtext, "s", "DataTable", sname, "SetLoadingtext")
	CodeLine(sb, sLocale, "s", "DataTable", sname, "SetLocale")
	CodeLine(sb, smobilebreakpoint, "s", "DataTable", sname, "SetMobilebreakpoint")
	CodeLine(sb, bisMultisort, "b", "DataTable", sname, "SetMultisort")
	CodeLine(sb, bisMustsort, "b", "DataTable", sname, "SetMustsort")
	CodeLine(sb, sNodatatext, "s", "DataTable", sname, "SetNodatatext")
	CodeLine(sb, sNoresultstext, "s", "DataTable", sname, "SetNoresultstext")
	CodeLine(sb, sPage, "s", "DataTable", sname, "SetPage")
	'CodeLine(sb, sSearch, "s", "DataTable", sname, "SetSearch")
	'CodeLine(sb, sSelectablekey, "s", "DataTable", sname, "SetSelectablekey")
	'CodeLine(sb, sServeritemslength, "s", "DataTable", sname, "SetServeritemslength")
	CodeLine(sb, bisShowexpand, "b", "DataTable", sname, "SetShowexpand")
	CodeLine(sb, bisShowgroupby, "b", "DataTable", sname, "SetShowgroupby")
	CodeLine(sb, bisShowselect, "b", "DataTable", sname, "SetShowselect")
	CodeLine(sb, bisSingleexpand, "b", "DataTable", sname, "SetSingleexpand")
	CodeLine(sb, bisSingleselect, "b", "DataTable", sname, "SetSingleselect")
	'CodeLine(sb, sSortby, "s", "DataTable", sname, "SetSortby")
	'CodeLine(sb, sSortdesc, "s", "DataTable", sname, "SetSortdesc")
	CodeLine(sb, bisvisible, "b", "DataTable", sname, "SetVisible")
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
		If xkey = "" Then Continue
		If xontable = False Then Continue
		Dim bSortable As Boolean = YesNoToBoolean(xsortable)
		Select Case xtype
		Case "action"
			sba.append($"DataTable${sname}.AddIcon("${xkey}", "${xtitle}", "${xicon}")"$).append(CRLF)
		Case Else
			sb.append($"DataTable${sname}.AddColumn1("${xkey}", "${xtitle}", "${xtype}",${xwidth},${bSortable},"${xalign}")"$).append(CRLF)
		End Select
	Next
	
	CodeLine(sb, bisEdit, "b", "DataTable", sname, "SetEdit")
	CodeLine(sb, bisDelete, "b", "DataTable", sname, "SetDelete")
	CodeLine(sb, bisClone, "b", "DataTable", sname, "SetClone")
	CodeLine(sb, bisDownload, "b", "DataTable", sname, "SetDownload")
	CodeLine(sb, bisPrint, "b", "DataTable", sname, "SetPrint")
	CodeLine(sb, bisMenu, "b", "DataTable", sname, "SetMenu")
	sb.append(sba.tostring)
	'
	sb.append($"cont.AddControl(datatable${sname}.DataTable, datatable${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	AddCode(sb, "End Sub")
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
	pbchip.AddText2("d",CreateMap("parent":"Parent", "vmodel":"VModel"))
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
	pbbadge.AddText2("d",CreateMap("parent":"Parent", "vmodel":"VModel"))
	pbbadge.AddText2("d",CreateMap("content":"Content", "iconname":"Icon"))
	pbbadge.AddRadioGroupH("d", "badgetype", "Type", CreateMap("iscontent":"Content","isicon":"Icon"))
	pbbadge.AddSelect2("d","color","Color", vm.ColorOptions, "colorintensity","Color Intensity", vm.IntensityOptions)
	pbbadge.AddText2("d",CreateMap("offsetx":"Offset X", "offsety":"Offset Y"))
	pbbadge.AddSelect2("d","origin","Origin",vm.Transition,"transition","Transition",vm.Transition)
	'
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
	pbavatar.AddText2("d", CreateMap("parent":"Parent", "vmodel":"VModel"))
	pbavatar.AddText2("d", CreateMap("badge":"Badge","label":"Label"))
	pbavatar.AddText2("d", CreateMap("iconname": "Icon Name", "size": "Size"))
	pbavatar.AddText("d", "src", "Src","", "")
	pbavatar.AddRadioGroupH("d", "avatartype", "Type", CreateMap("islabel":"Label","isicon":"Icon", "isimage":"Image"))
	pbavatar.AddSelect2("d","color","Color", vm.ColorOptions, "colorintensity","Color Intensity", vm.IntensityOptions)
	pbavatar.AddSelect2("d","textcolor","TextColor", vm.ColorOptions, "textcolorintensity","TextColor Intensity", vm.IntensityOptions)
	'
	pbavatar.AddHeading("e","Settings")
	pbavatar.AddSwitches("e", CreateMap("isdisabled": "Disabled", "isvisible": "Visible"))
	pbavatar.AddSwitches("e", CreateMap("isleft": "Left", "isright": "Right"))
	pbavatar.AddSwitches("e", CreateMap("ishasbadge": "HasBadge", "istile": "Tile"))
	'
	pbavatar.AddHeading("f","Matrix")
	pbavatar.AddHeightWidths("f")
	pbavatar.AddMatrix("f")
	vm.container.AddComponent(1, 3, pbavatar.tostring)
End Sub
#End Region

Sub Read_Avatar
	sBadge = mattr.getdefault("badge", "")
	scolor = mattr.getdefault("color", "")
	sColorintensity = mattr.getdefault("colorintensity", "")
	bisdisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
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
	sTextcolorintensity = mattr.getdefault("textcolorintensity", "")
	bistile = YesNoToBoolean(mattr.getdefault("istile", "No"))
	bisvisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
End Sub

Sub Design_Avatar
	Dim avatar As VMAvatar = ui.CreateAvatar($"avatar${sname}"$, Me)
	avatar.setstatic(True)
	avatar.SetBadge(sBadge)
	avatar.SetColorintensity(scolor, sColorintensity)
	avatar.SetDisabled(bisdisabled)
	avatar.SetHasbadge(bisHasbadge)
	avatar.SetHeight(sheight)
	avatar.SetLeft(bisleft)
	avatar.SetMaxheight(smaxheight)
	avatar.SetMaxwidth(smaxwidth)
	avatar.SetMinheight(sminheight)
	avatar.SetMinwidth(sminwidth)
	avatar.SetRight(bisright)
	avatar.SetSize(ssize)
	avatar.SetTextcolorintensity(stextcolor, sTextcolorintensity)
	avatar.SetTile(bistile)	
	avatar.SetVisible(bisvisible)
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
	sb.append($"Dim avt${sname} As VMAvatar = vm.CreateAvatar("avt${sname}", Me)"$).Append(CRLF)
	CodeLine(sb, sBadge, "s", "avt", sname, "SetBadge")
	CodeLine2(sb, scolor, sColorintensity, "s", "avt", sname, "SetColorintensity")
	CodeLine(sb, bisdisabled, "b", "avt", sname, "SetDisabled")
	CodeLine(sb, bisHasbadge, "b", "avt", sname, "SetHasbadge")
	CodeLine(sb, sheight, "s", "avt", sname, "SetHeight")
	CodeLine(sb, bisleft, "b", "avt", sname, "SetLeft")
	CodeLine(sb, smaxheight, "s", "avt", sname, "SetMaxheight")
	CodeLine(sb, smaxwidth, "s", "avt", sname, "SetMaxwidth")
	CodeLine(sb, sminheight, "s", "avt", sname, "SetMinheight")
	CodeLine(sb, sminwidth, "s", "avt", sname, "SetMinwidth")
	CodeLine(sb, bisright, "b", "avt", sname, "SetRight")
	CodeLine(sb, ssize, "s", "avt", sname, "SetSize")
	CodeLine2(sb, stextcolor, sTextcolorintensity, "s", "avt", sname, "SetTextcolorintensity")
	CodeLine(sb, bistile, "b", "avt", sname, "SetTile")
	CodeLine(sb, bisvisible, "b", "avt", sname, "SetVisible")
	Select Case savatartype
	Case "islabel"
		CodeLine(sb, stitle, "s", "avt", sname, "SetTextonly")
	Case "isicon"
		CodeLine(sb, siconname, "s", "avt", sname, "SetIcononly")
	Case "isimage"
		CodeLine(sb, ssrc, "s", "avt", sname, "SetImageonly")
	End Select
	
	sb.append($"${sparent}.Container.AddControl(avt${sname}.Avatar, avt${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
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
	pblist.AddText2("d",CreateMap("parent":"Parent", "vmodel":"ID"))
	pblist.AddText("d","datasource","Data Source","","")
	pblist.AddText2("d",CreateMap("keyfld":"Key Fld", "avatarfld":"Avatar Fld"))
	pblist.AddText2("d",CreateMap("iconfld":"Icon Fld", "iconcolorfld":"Icon Color Fld"))
	pblist.AddText2("d",CreateMap("titlefld":"Title Fld", "subtitlefld":"Subtitle 1 Fld"))
	pblist.AddText2("d",CreateMap("subtitle1fld":"Subtitle 2 Fld", "actioniconfld":"Action Icon Fld"))
	pblist.AddText2("d",CreateMap("actioniconcolorfld":"Action Icon Color Fld"))
	'	
	pblist.AddSelect2("d","color","Color", vm.ColorOptions, "colorintensity","Color Intensity", vm.IntensityOptions)
	pblist.AddSelect("d","elevation","Elevation",vm.elevation)
	'
	pblist.AddHeading("a", "Items")
	pblist.AddCrudList("a", CreateMap("key":"Item Key","avatar":"Avatar","icon":"Icon Name", "iconcolor": "Icon Color", "title":"Title","subtitle":"Sub Title 1","subtitle1":"Sub Title 2", "action":"Action Icon","actioncolor":"Action Color"))
	'
	pblist.AddHeading("e","Settings")
	pblist.AddSwitches("e", CreateMap("isoptions": "Use Items", "isdivider":"Divide Each"))
	pblist.AddSwitches("e", CreateMap("isdark": "Dark", "isdense": "Dense"))
	pblist.AddSwitches("e", CreateMap("isdisabled": "Disabled", "isexpand": "Expand"))
	pblist.AddSwitches("e", CreateMap("isflat": "Flat", "islight": "Light"))
	pblist.AddSwitches("e", CreateMap("isnav": "Nav", "isrounded": "Rounded"))
	pblist.AddSwitches("e", CreateMap("isshaped": "Shaped", "issubheader": "Subheader"))
	pblist.AddSwitches("e", CreateMap("isthreeline": "ThreeLine", "istile": "Tile"))
	pblist.AddSwitches("e", CreateMap("istwoline": "TwoLine", "isvisible": "Visible"))
	'
	pblist.AddHeading("f","Matrix")
	pblist.AddHeightWidths("f")
	pblist.AddMatrix("f")
	vm.container.AddComponent(1, 3, pblist.tostring)
End Sub
#End Region

Sub Read_List
	scolor = mattr.getdefault("color", "")
	sColorintensity = mattr.getdefault("colorintensity", "")
	bisdark = YesNoToBoolean(mattr.getdefault("isdark", "No"))
	bisdense = YesNoToBoolean(mattr.getdefault("isdense", "No"))
	bisdisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
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
	bisvisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
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
End Sub

Sub Design_List
	Dim lst As VMList = ui.CreateList($"lst${sname}"$, Me)
	lst.setstatic(True)
	lst.SetColorintensity(scolor, sColorintensity)
	lst.SetDark(bisdark)
	lst.SetDense(bisdense)
	lst.SetDisabled(bisdisabled)
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
	lst.SetVisible(bisvisible)
	lst.SetWidth(swidth)
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
			If bisdivider Then lst.AddDivider1(True)
			AddCode(sbEvents, $"Case "${sskey}""$)
		Next
	End If
	AddCode(sbEvents,"End Select")
	AddCode(sbEvents, "End Sub")
	'
	ui.AddControl(lst.List, lst.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim lst${sname} As VMList = vm.CreateList("lst${sname}", Me)"$).Append(CRLF)
	CodeLine2(sb, scolor, sColorintensity, "s", "lst", sname, "SetColorintensity")
	CodeLine(sb, bisdark, "b", "lst", sname, "SetDark")
	CodeLine(sb, bisdense, "b", "lst", sname, "SetDense")
	CodeLine(sb, bisdisabled, "b", "lst", sname, "SetDisabled")
	CodeLine(sb, selevation, "s", "lst", sname, "SetElevation")
	CodeLine(sb, bisExpand, "b", "lst", sname, "SetExpand")
	CodeLine(sb, bisflat, "b", "lst", sname, "SetFlat")
	CodeLine(sb, sheight, "s", "lst", sname, "SetHeight")
	CodeLine(sb, bislight, "b", "lst", sname, "SetLight")
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
	CodeLine(sb, bisvisible, "b", "lst", sname, "SetVisible")
	CodeLine(sb, swidth, "s", "lst", sname, "SetWidth")
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
			If bisdivider Then CodeLine(sb, True, "b", "lst", sname, "AddDivider1")
		Next
	Else
		'set data source
		AddCode(sb, $"vm.setdata("${sDatasource}", vm.newlist)"$)
		AddCode(sb, $"lst${sname}.SetDataSourceTemplate1("${sDatasource}","${sKeyfld}","${sAvatarfld}","${sIconfld}","${sIconcolorfld}","${sTitlefld}","${sSubtitlefld}","${sSubtitle1fld}","${sActioniconfld}","${sActioniconcolorfld}")"$)
	End If
	
	sb.append($"${sparent}.Container.AddControl(lst${sname}.Avatar, lst${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
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
	pbtabs.AddText2("d",CreateMap("parent":"Parent", "vmodel":"VModel"))
	pbtabs.AddSelect2("d","color","Color", vm.ColorOptions, "colorintensity","Color Intensity", vm.IntensityOptions)
	pbtabs.AddSelect2("d","backgroundcolor","BackgroundColor", vm.ColorOptions, "backgroundcolorintensity","BackgroundColor Intensity", vm.IntensityOptions)
	pbtabs.AddSelect2("d","slidercolor","SliderColor", vm.ColorOptions, "slidercolorintensity","SliderColor Intensity", vm.IntensityOptions)
	pbtabs.AddText2("d",CreateMap("height":"Height", "mobilebreakpoint":"MobileBreakPoint"))
	pbtabs.AddText2("d",CreateMap("previcon":"PrevIcon", "nexticon":"NextIcon"))
	pbtabs.AddText2("d",CreateMap("slidersize":"SliderSize","activeclass":"ActiveClass"))
	'
	pbtabs.AddHeading("a", "Items")
	pbtabs.AddCrudList("a", CreateMap("key":"Item Key", "title":"Title", "icon":"Icon"))
	
	pbtabs.AddHeading("e","Settings")
	pbtabs.AddSwitches("e", CreateMap("isalignwithtitle": "AlignWithTitle", "iscenteractive": "CenterActive"))
	pbtabs.AddSwitches("e", CreateMap("iscentered": "Centered", "isdark": "Dark"))
	pbtabs.AddSwitches("e", CreateMap("isfixedtabs": "FixedTabs", "isgrow": "Grow"))
	pbtabs.AddSwitches("e", CreateMap("ishideslider": "HideSlider", "isiconsandtext": "IconsAndText"))
	pbtabs.AddSwitches("e", CreateMap("islight": "Light", "isoptional": "Optional"))
	pbtabs.AddSwitches("e", CreateMap("isright": "Right", "isshowarrows": "ShowArrows"))
	pbtabs.AddSwitches("e", CreateMap("isvertical": "Vertical", "isvisible": "Visible"))
	pbtabs.AddSwitches("e", CreateMap("isiconposright": "IconPos Right"))
	'
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
	scolor = mattr.getdefault("color", "")
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
	bisvisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
	bisiconposright = YesNoToBoolean(mattr.getdefault("isiconposright","No"))
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
	stp.SetVisible(bisvisible)
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim sstitle As String = m.getdefault("title", "")
		Dim ssubtitle As String = m.getdefault("subtitle", "")
		If sskey = "" Then Continue
		stp.AddStep1(sskey, sstitle, ssubtitle, "")
		'
		sb.append($"Dim cont${sskey} As VMContainer"$).append(CRLF)
		AddCode(sb, $"cont${sskey} = vm.CreateContainer("cont${sskey}", Me)"$)
		AddNewLine(sb)

	Next
	ui.AddControl(stp.Stepper, stp.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddCode(sb, $"Dim stp${sname} As VMStepper = vm.CreateStepper("stp${sname}", Me)"$)
	CodeLine(sb, bisAltlabels, "b", "stp", sname, "SetAltlabels")
	CodeLine(sb, bisdark, "b", "stp", sname, "SetDark")
	CodeLine(sb, bislight, "b", "stp", sname, "SetLight")
	CodeLine(sb, bisNonlinear, "b", "stp", sname, "SetNonlinear")
	CodeLine(sb, sStepactive, "s", "stp", sname, "SetStepactive")
	CodeLine(sb, bisvertical, "b", "stp", sname, "SetVertical")
	CodeLine(sb, bisvisible, "b", "stp", sname, "SetVisible")
	AddCode(sb, $"stp${sname}.SetOnChange(Me, "stp${sname}_change")"$)
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim sstitle As String = m.getdefault("title", "")
		Dim ssubtitle As String = m.getdefault("subtitle", "")
		If sskey = "" Then Continue
		AddCode(sb, $"stp${sname}.AddStep1("${sskey}", "${sstitle}", "${ssubtitle}", cont${sskey}.ToString)"$)
	Next
			
	sb.append($"${sparent}.Container.AddControl(stp${sname}.Stepper, stp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
	AddCode(sbEvents, $"Public Sub stp${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
	
End Sub

Sub Design_Tabs
	Dim tabs As VMTabs = ui.CreateTabs($"tabs${sname}"$, Me)
	tabs.SetStatic(True)
	tabs.AddTabSlider
	tabs.SetActiveclass(sactiveclass)
	tabs.SetAlignwithtitle(bisAlignwithtitle)
	tabs.SetBackgroundcolorintensity(sBackgroundcolor, sBackgroundcolorintensity)
	tabs.SetCenteractive(bisCenteractive)
	tabs.SetCentered(bisCentered)
	tabs.SetColorintensity(scolor, sColorintensity)
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
	tabs.SetVisible(bisvisible)
	tabs.SetIconPosRight(bisiconposright)
	'
	'source code
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssiconname As String = m.getdefault("icon", "")
		Dim sstitle As String = m.getdefault("title", "")
		If sskey = "" Then Continue
		tabs.AddTab(sskey, sstitle, ssiconname, Null)
		'create the containers
		sb.append($"Dim cont${sskey} As VMContainer"$).append(CRLF)
		AddCode(sb, $"cont${sskey} = vm.CreateContainer("cont${sskey}", Me)"$)
		AddNewLine(sb)
	Next
	ui.AddControl(tabs.Tabs, tabs.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	AddCode(sb, $"Dim tabs${sname} As VMTabs = vm.CreateTabs("tabs${sname}", Me)"$)
	CodeLine(sb, True, "b", "Tabs", sname, "AddTabSlider")
	CodeLine(sb, sactiveclass, "s", "Tabs", sname, "SetActiveclass")
	CodeLine(sb, bisAlignwithtitle, "b", "Tabs", sname, "SetAlignwithtitle")
	CodeLine2(sb, sBackgroundcolor, sBackgroundcolorintensity, "s", "Tabs", sname, "SetBackgroundcolorintensity")
	CodeLine(sb, bisCenteractive, "b", "Tabs", sname, "SetCenteractive")
	CodeLine(sb, bisCentered, "b", "Tabs", sname, "SetCentered")
	CodeLine2(sb, scolor, sColorintensity, "s", "Tabs", sname, "SetColorintensity")
	CodeLine(sb, bisdark, "b", "Tabs", sname, "SetDark")
	CodeLine(sb, bisFixedtabs, "b", "Tabs", sname, "SetFixedtabs")
	CodeLine(sb, bisGrow, "b", "Tabs", sname, "SetGrow")
	CodeLine(sb, sheight, "s", "Tabs", sname, "SetHeight")
	CodeLine(sb, bisHideslider, "b", "Tabs", sname, "SetHideslider")
	CodeLine(sb, bisiconposright, "b", "Tabs", sname, "SetIconposright")
	CodeLine(sb, bisIconsandtext, "b", "Tabs", sname, "SetIconsandtext")
	CodeLine(sb, bislight, "b", "Tabs", sname, "SetLight")
	CodeLine(sb, smobilebreakpoint, "s", "Tabs", sname, "SetMobilebreakpoint")
	CodeLine(sb, sNexticon, "s", "Tabs", sname, "SetNexticon")
	CodeLine(sb, bisOptional, "b", "Tabs", sname, "SetOptional")
	CodeLine(sb, sPrevicon, "s", "Tabs", sname, "SetPrevicon")
	CodeLine(sb, bisright, "b", "Tabs", sname, "SetRight")
	CodeLine(sb, bisshowarrows, "b", "Tabs", sname, "SetShowarrows")
	CodeLine2(sb, sSlidercolor, sSlidercolorintensity, "s", "Tabs", sname, "SetSlidercolorintensity")
	CodeLine(sb, sSlidersize, "s", "Tabs", sname, "SetSlidersize")
	CodeLine(sb, bisvertical, "b", "Tabs", sname, "SetVertical")
	CodeLine(sb, bisvisible, "b", "Tabs", sname, "SetVisible")
	AddCode(sb, $"tabs${sname}.SetOnChange(me, "tabs${sname}_change")"$)
	'
	AddCode(sbEvents, $"Public Sub tabs${sname}_change(value As Object)"$)
	AddCode(sbEvents, "End Sub")
	AddNewLine(sbEvents)
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim ssiconname As String = m.getdefault("icon", "")
		Dim sstitle As String = m.getdefault("title", "")
		If sskey = "" Then Continue
		AddCode(sb, $"tabs${sname}.AddTab("${sskey}", "${sstitle}", "${ssiconname}", cont${sskey})"$)
	Next
		
	sb.append($"${sparent}.Container.AddControl(tabs${sname}.Tabs, tabs${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
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
	pbstepper.AddText2("d",CreateMap("parent":"Parent", "vmodel":"VModel"))
	pbstepper.AddText("d","stepactive","StepActive","","")
	'
	pbstepper.AddHeading("a", "Items")
	pbstepper.AddCrudList("a", CreateMap("key":"Item Key", "title":"Title", "subtitle":"Description"))
	'
	pbstepper.AddHeading("e","Settings")
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
	bisvisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
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
	pbexpansionpanels.AddText2("d",CreateMap("parent":"Parent", "vmodel":"ID"))
	pbexpansionpanels.AddText("d","activepanel","Active","","1")
	'
	pbexpansionpanels.AddHeading("a", "Items")
	pbexpansionpanels.AddCrudList("a", CreateMap("key":"Item Key", "title":"Title"))
	'
	pbexpansionpanels.AddHeading("e","Settings")
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
	bisdisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
	bisflat = YesNoToBoolean(mattr.getdefault("isflat", "No"))
	bisFocusable = YesNoToBoolean(mattr.getdefault("isfocusable", "No"))
	bisHover = YesNoToBoolean(mattr.getdefault("ishover", "No"))
	bisinset = YesNoToBoolean(mattr.getdefault("isinset", "No"))
	bislight = YesNoToBoolean(mattr.getdefault("islight", "No"))
	bismandatory = YesNoToBoolean(mattr.getdefault("ismandatory", "No"))
	bismultiple = YesNoToBoolean(mattr.getdefault("ismultiple", "No"))
	bisPopout = YesNoToBoolean(mattr.getdefault("ispopout", "No"))
	bisreadonly = YesNoToBoolean(mattr.getdefault("isreadonly", "No"))
	bistile = YesNoToBoolean(mattr.getdefault("istile", "No"))
	bisvisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
End Sub

Sub Design_ExpansionPanels
	Dim expnl As VMExpansionPanels = ui.CreateExpansionPanels($"exp${sname}"$, Me)
	expnl.SetStatic(True)
	expnl.SetAccordion(bisAccordion)
	expnl.SetActivePanel(sActivepanel)
	expnl.SetDark(bisdark)
	expnl.SetDisabled(bisdisabled)
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
	expnl.SetVisible(bisvisible)
	'
	'source code
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim sstitle As String = m.getdefault("title", "")
		If sskey = "" Then Continue
		expnl.AddPanel1(sskey, sstitle, Null)
		'create the containers
		sb.append($"Dim cont${sskey} As VMContainer"$).append(CRLF)
		AddCode(sb, $"cont${sskey} = vm.CreateContainer("cont${sskey}", Me)"$)
		AddNewLine(sb)
	Next
	ui.AddControl(expnl.ExpansionPanels, expnl.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)

'
	AddCode(sb, $"Dim exp${sname} As VMExpansionPanels = vm.CreateExpansionPanels("exp${sname}", Me)"$)
	CodeLine(sb, bisAccordion, "b", "exp", sname, "SetAccordion")
	CodeLine(sb, sActivepanel, "s", "exp", sname, "SetActivepanel")
	CodeLine(sb, bisdark, "b", "exp", sname, "SetDark")
	CodeLine(sb, bisdisabled, "b", "exp", sname, "SetDisabled")
	CodeLine(sb, bisflat, "b", "exp", sname, "SetFlat")
	CodeLine(sb, bisFocusable, "b", "exp", sname, "SetFocusable")
	CodeLine(sb, bisHover, "b", "exp", sname, "SetHover")
	CodeLine(sb, bisinset, "b", "exp", sname, "SetInset")
	CodeLine(sb, bislight, "b", "exp", sname, "SetLight")
	CodeLine(sb, bismandatory, "b", "exp", sname, "SetMandatory")
	CodeLine(sb, bismultiple, "b", "exp", sname, "SetMultiple")
	CodeLine(sb, bisPopout, "b", "exp", sname, "SetPopout")
	CodeLine(sb, bisreadonly, "b", "exp", sname, "SetReadonly")
	CodeLine(sb, bistile, "b", "exp", sname, "SetTile")
	CodeLine(sb, bisvisible, "b", "exp", sname, "SetVisible")
	'
	For Each m As Map In lcontents
		Dim sskey As String = m.getdefault("key", "")
		Dim sstitle As String = m.getdefault("title", "")
		If sskey = "" Then Continue
		AddCode(sb, $"exp${sname}.AddPanel1("${sskey}", "${sstitle}", cont${sskey})"$)
	Next
	sb.append($"${sparent}.Container.AddControl(exp${sname}.ExpansionPanels, exp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)

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
	
	'
	AddInstruction(sbi, "pgIndex", "AddPages" , "")
	AddComment(sbi, $"code to add the ${svmodel} template code to the master HTML template"$)
	AddCode(sbi, $"vm.AddPage(${mdlName}.name, ${mdlName})"$)
	AddCode(sbi, CRLF)
	
	AddComment(sb, "INSTRUCTION: In your B4J project, click Project > Add New Module > Code Module")
	AddComment(sb, $"INSTRUCTION: Type "${mdlName}" as the module name and click Ok"$)
	AddNewLine(sb)
	AddComment(sb, $"INSTRUCTION: Press and hold Crtl+A to select all code and press Delete key, this will delete all the code"$)
	AddInstruction(sb, mdlName, "" , "")
	AddCode(sb, $"'Static code module"$)
	AddCode(sb, $"#IgnoreWarnings:12"$)
	AddCode(sb, $"Sub Process_Globals"$)
	AddCode(sb, $"Public Name As String = "${svmodel}Code""$)
	AddCode(sb, $"Public Title As String = "${spagetitle}""$)
	AddCode(sb, $"Private vm As BANanoVM"$)
	AddCode(sb, $"Private BANano As BANano  'ignore"$)
	sb.append($"Private cont As VMContainer"$).append(CRLF)
	AddCode(sb, "End Sub")
	AddNewLine(sb)
	'code for the page
	AddCode(sb, "Sub Code")
	AddComment(sb, "Establish a reference to the app")
	AddCode(sb, "vm = pgIndex.vm")
	AddComment(sb, "create a container to hold all contents based on the page name")
	AddCode(sb, $"cont = vm.CreateContainer(Name, Me)"$)
	AddComment(sb, "the container should be hidden initialy")
	AddCode(sb, "cont.Hide")
	AddNewLine(sb)
	'
	'draw a fake drawer
	Dim drawer As VMNavigationDrawer = ui.CreateDrawer("drawerx", Me)
	drawer.SetStatic(True)
	drawer.Setabsolute(True)
	'draw a fake toolbar
	Dim tbl As VMToolBar = ui.CreateToolbar("tblx", Me)
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
	'show in navbar
	If  bisShowonnavbar Then
		'navigation bar
		AddComment(sb,$"this page should have an icon/button in the navbar"$)
		If bisicon Then
			AddCode(sb, $"vm.NavBar.AddIcon1("nav${svmodel}", "${siconname}", "${sIconcolor}","${stooltip}", "")"$)
			tbl.AddIcon1(svmodel, siconname, sIconcolor, stooltip, "")
		Else
			AddCode(sb, $"vm.NavBar.AddButton1("nav${svmodel}", "${siconname}", "${spagetitle}", "${stooltip}", "")"$)
			tbl.AddButton1(svmodel, siconname, spagetitle, stooltip, "")
		End If
	End If
	'show on drawer
	If bisShowondrawer Then
		drawer.AddIcon1("drw" & svmodel, siconname, sIconcolor, spagetitle, stooltip)
		If bisdivider Then
			drawer.AddDivider1(bisinsetdivider)
		End If
		'
		AddComment(sb,$"this page should show on the drawer"$)
		AddCode(sb, $"vm.Drawer.AddIcon1("drw${svmodel.tolowercase}", "${siconname}", "${sIconcolor}", "${spagetitle}", "${stooltip}")"$)
		If bisdivider Then
			AddCode(sb, $"vm.Drawer.AddDivider(${bisinsetdivider})"$)
		End If
		'
		'on click show the page
		AddInstruction(sbi, "pgIndex", "" , "")
		AddComment(sbi, $"click ${mdlName} nav button"$)
		AddCode(sbi, $"Sub nav${svmodel}_click(e As BANanoEvent)"$)
		AddComment(sbi, $"show the page ${svmodel}"$)
		AddCode(sbi, $"${mdlName}.Show"$)
		AddCode(sbi, "End Sub")
		AddCode(sbi, CRLF)
		'
		AddInstruction(sbi, "pgIndex", "draweritems_click" , "the case statement")
		AddCode(sbi, $"Case "drw${svmodel.tolowercase}""$)
		AddComment(sbi, $"show ${spagetitle}"$)
		AddCode(sbi, $"${mdlName}.Show"$)
		AddCode(sbi, CRLF)
	End If
	'
	AddCode(sb, "End Sub")
	AddNewLine(sb)
	'
	AddComment(sb,"show the page")
	AddCode(sb, "Sub Show")
	'update the navbar title
	If bisUpdatenavtitle Then
		AddComment(sb, "update the navbar title")
		AddCode(sb, $"vm.NavBar.UpdateTitle("${spagetitle}")"$)
		tbl.UpdateTitle(spagetitle)
	End If
	'
	If  bisShowonnavbar Then
		AddComment(sb, "hide all buttons in the navbar")
		AddCode(sb, "vm.NavBar.HideItems")
		AddComment(sb, $"show buttons for ${mdlName}"$)
		AddCode(sb, $"vm.ShowItem("nav${svmodel}")"$)
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
