B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#ignorewarnings: 12
Sub Process_Globals
	Dim vm As BANanoVM
	Private ui As VMContainer
	Private BANano As BANano
	Private bHasBorder As Boolean
	Private bShowMatrix As Boolean
	'
	Private pbtextfield As VMProperty   	'done
	Private pbdatepicker As VMProperty  	'done
	Private pbcheckbox As VMProperty    	'done
	Private pbradiogroup As VMProperty  	'done
	Private pbselectbox As VMProperty		'done
	Private pbslider As VMProperty			'done
	Private pbicon As VMProperty			'done
	Private pbbutton As VMProperty			'done
	Private pblabel As VMProperty			'done
	Private pbimage As VMProperty			'done
	Private pbparallax As VMProperty
	Private pbcontainer As VMProperty
	Private lstBags As List
	Private avatarMap As Map
	Private controltypes As Map
	Private fieldtypes As Map
	Private dnd As VMContainer
	Private tabs As VMTabs
	Private b4x As VMContainer
	Private html5 As VMContainer
	Private mymac As VMDevice
	Private myipad As VMDevice
	Private myiphone As VMDevice
	Private iconsizes As Map
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
	Private sicon As String
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
	Private biconbutton As Boolean
	Private bfabbutton As Boolean
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
	'Private sheadercolor As String
	'Private sheaderintensity As String
	Private bStatic As Boolean
	Private sb As StringBuilder
	'
	Private pc As VMPrism
	Private htm As VMPrism
	
	Private selevation As String
	Private stransition As String
	Private bisfluid As Boolean
	Private bisshowmatrix As Boolean
	Private bisnogutters As Boolean
End Sub

Sub Init
	controltypes = CreateMap("number":"number", "text":"text", "tel":"tel", "email":"email","password":"password", "textarea":"textarea", "date":"date", "time":"time", "select":"select", "combo":"combo", "auto":"auto","file":"file","profile":"profile","image":"image","button":"button","rangeslider":"rangeslider")
	fieldtypes = CreateMap("string":"string", "int":"int", "bool":"bool", "date":"date","dbl":"float")
	iconsizes = CreateMap("":"Normal","small":"Small", "medium":"Medium", "large":"Large", "x-small":"X-Small", "x-large":"X-Large")
	'
	lstBags.Initialize
	lstBags.Add("pbtextfield")
	lstBags.Add("pbdatepicker")
	lstBags.Add("pbcheckbox")
	lstBags.Add("pbradiogroup")
	lstBags.add("pbselectbox")
	lstBags.add("pbslider")
	lstBags.Add("pbicon")
	lstBags.add("pbbutton")
	lstBags.Add("pblabel")
	lstBags.Add("pbimage")
	lstBags.add("pbparallax")
	lstBags.add("pbcontainer")
	'
	avatarMap.initialize
	avatarMap.put("text", "./assets/text.png")
	avatarMap.put("textarea", "./assets/textarea.png")
	avatarMap.put("checkbox", "./assets/checkbox.png")
	avatarMap.put("date", "./assets/datepicker.png")
	avatarMap.put("file", "./assets/uploader.png")
	avatarMap.put("radio", "./assets/radio.png")
	avatarMap.put("select", "./assets/select.png")
	avatarMap.put("slider", "./assets/slider.png")
	avatarMap.put("switch", "./assets/switch.png")
	avatarMap.put("label", "./assets/label.png")
	avatarMap.put("email", "./assets/email.png")
	avatarMap.put("password", "./assets/password.png")
	avatarMap.put("tel", "./assets/telephone.png")
	avatarMap.put("time", "./assets/time.png")
	avatarMap.put("combo", "./assets/combo.png")
	avatarMap.put("auto", "./assets/autocomplete.png")
	avatarMap.put("profile", "./assets/profilepic.png")
	avatarMap.put("image", "./assets/image.png")
	avatarMap.put("button", "./assets/button.png")
	avatarMap.put("icon", "./assets/icon.png")
	avatarMap.put("parallax", "./assets/carousel.png")
	avatarMap.put("container", "./assets/container.png")
	'
	bHasBorder = False
	bShowMatrix = False
	'
	vm.Initialize(Me, Main.appname)
	'
	'get last selected panel
	Dim sp As String = BANano.GetLocalStorage("selectedpanel")
	If sp <> Null Then
		vm.setdata("selectedpanel", BANano.parseint(sp))
	Else
		vm.setdata("selectedpanel", 0)
	End If
	'
	bHasBorder = BANano.GetLocalStorage("hasborder")
	If bHasBorder <> True Then bHasBorder = False
	'
	bShowMatrix = BANano.GetLocalStorage("showmatrix")
	If bShowMatrix <> True Then bShowMatrix = False
	'
	vm.setdata("showmatrix", bShowMatrix)
	vm.setdata("hasborder", bHasBorder)
	
	vm.RTL = False
	vm.SnackBar.SetColor("green")
	vm.SnackBar.SetTop(True)
	vm.NavBar.SetModeFixed(True)
	vm.NavBar.SetHasMenuButton(True)
	vm.NavBar.UpdateLogo("./assets/sponge.png")
	vm.NavBar.UpdateTitle("BANanoVuetify Designer 3")
	vm.NavBar.Logo.SetBorderRadius("50%")
	vm.NavBar.Logo.SetBorder("1px", vm.COLOR_BLACK, vm.BORDER_DOTTED)
	
	vm.NavBar.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	vm.NavBar.SetDark(True)
	vm.Footer.Hide
	vm.Drawer.Hide
	'
	vm.NavBar.AddIcon("btnRefresh", "refresh", "Refresh", "")
	'
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	Dim gridmenu As VMMenu = vm.createmenu("gridMenu", Me).SetButton("", "Grid")
	gridmenu.AddItem("btnClearGrid", "", "delete", "Clear", "", "")
	gridmenu.AddItem("btnRemoveLastGrid", "", "delete", "Remove Last", "", "")
	vm.NavBar.AddMenu(gridmenu)
	'
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	Dim compmenu As VMMenu = vm.createmenu("compMenu", Me).SetButton("", "Components")
	compmenu.AddItem("btnclearcomp", "", "delete", "Clear", "", "")
	compmenu .AddItem("btnremovelastcomp", "", "delete", "Remove Last", "", "")
	vm.NavBar.AddMenu(compmenu)
	'
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	Dim optMenu As VMMenu = vm.createmenu("optMenu", Me).SetButton("", "Options")
	optMenu.AddItem("btnShowMatrix", "", "", "Show Matrix", "", "")
	optMenu.AddItem("btnHasBorder", "", "", "Has Border", "", "")
	vm.NavBar.AddMenu(optMenu)
	'
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	vm.NavBar.AddIcon("btnSourceCode", "code", "Source Code", "")
	'
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	vm.navbar.AddButton(vm.createbutton("btnhtml", Me).SetLabel("HTML").SetTransparent(True))
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	vm.NavBar.Addicon("btnmac", "mdi-laptop-mac", "Macbook","")
	vm.navbar.AddIcon("btnipad","mdi-tablet-ipad", "iPad", "")
	vm.NavBar.addicon("btniphone", "mdi-cellphone-iphone", "iPhone", "")
	'
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	vm.NavBar.AddIcon("btnBack", "chevron_left", "Back to demo", "")
	'
	BuildDrawer
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
	'
	AddPages
	vm.UX
	'
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
	

Sub btnSourceCode_click(e As BANanoEvent)
	Dim gridsource As String = BANano.GetSessionStorage("sourcecode")
	vm.SaveText2File(gridsource, "sourcecode.txt")
End Sub

Sub btnhtml_click(e As BANanoEvent)
	Dim gridhtml As String = BANano.GetSessionStorage("html")
	vm.SaveText2File(gridhtml, "html.txt")
End Sub

Sub YesNoToBoolean(xvalue As String) As Boolean
	Select Case xvalue
		Case "Yes"
			Return True
		Case Else
			Return False
	End Select
End Sub

Sub CreateUX
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
	compSQL.SelectAll(Array("*"), Array("id"))
	compSQL.result = db.executewait(compSQL.query, compSQL.args)
	'
	vm.setdata("myux", compSQL.result)
	
	sb.initialize
	'
	'make it a div
	ui = vm.CreateContainer("ui", Me)
	ui.SetDesignMode(True)
	If bShowMatrix = True Then
		ui.ShowMatrix = True
	Else
		ui.showmatrix = False
	End If
	'
	If bHasBorder = True Then
		ui.HasBorder = True
	Else
		ui.HasBorder = False
	End If
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
		sfieldtype = rec.getdefault("fieldtype", "")
		
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
		splaceholder = mattr.getdefault("placeholder", "")
		bisrequired = YesNoToBoolean(mattr.getdefault("isrequired", "No"))
		sicon = mattr.GetDefault("icon", "")
		shelpertext = mattr.getdefault("helpertext", "")
		serrortext = mattr.getdefault("errortext", "")
		imaxlen = mattr.getdefault("maxlength", "0")
		If imaxlen = "" Then imaxlen = "0"
		imaxlen = BANano.parseint(imaxlen)
		bautogrow = YesNoToBoolean(mattr.getdefault("isautogrow", "No"))
		svalue = mattr.getdefault("value", "")
		bisPrimary = YesNoToBoolean(mattr.getdefault("isprimary", "No"))
		bisvisible = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
		bisdisabled = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
		bontable = YesNoToBoolean(mattr.getdefault("ontable", "No"))
		bisdark = YesNoToBoolean(mattr.getdefault("isdark", "No"))
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
		biconbutton = YesNoToBoolean(mattr.getdefault("isiconbutton", "No"))
		bfabbutton = YesNoToBoolean(mattr.getdefault("isfabbutton", "No"))
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
		scolor = mattr.get("color")
		sintensity = mattr.get("intensity")
		'
		stextcolor = mattr.getdefault("textcolor", "")
		stextintensity = mattr.getdefault("textintensity", "")
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
		bisreadonly = YesNoToBoolean(mattr.getdefault("isreadonly", "No"))
		bisvertical = YesNoToBoolean(mattr.getdefault("isvertical", "No"))
		bisthumbalways = YesNoToBoolean(mattr.getdefault("isthumbalways", "No"))
		bisthumblabel = YesNoToBoolean(mattr.getdefault("isthumblabel", "No"))
		sminvalue = mattr.getdefault("minvalue", "0")
		sstepvalue = mattr.getdefault("stepvalue","1")
		smaxvalue = mattr.getdefault("maxvalue", "100")
		sprependicon = mattr.getdefault("prependicon", "")
		sappendicon = mattr.getdefault("appendicon","")
		sthumbsize = mattr.getdefault("thumbsize","32")
		sthumbcolor = mattr.getdefault("thumbcolor", "")
		sthumbintensity = mattr.getdefault("thumbintensity", "")
		strackcolor = mattr.GetDefault("trackcolor", "")
		strackintensity = mattr.getdefault("trackintensity","")
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
					
		bStatic = True
		'
		Select Case controltype
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
				Design_Slider
			Case "label"
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
	Dim txta As VMTextField = ui.NewTextArea(Me, True, sname, svmodel, stitle, splaceholder, bisrequired, bautogrow, sicon, imaxlen, shelpertext, serrortext, stabindex)
	txta.SetSolo(bissolo)
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
	ui.AddControl(txta.TextField, txta.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim txta${sname} As VMTextField = vm.NewTextArea(Me, ${bStatic}, "txta${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, ${bautogrow}, "${sicon}", ${imaxlen}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)

	CodeLine(sb, sfieldtype, "s", "txta", sname, "SetFieldType")
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

	sb.append($".Container.AddControl(txta${sname}.TextField, txta${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Switch
	Dim swt As VMCheckBox = ui.NewSwitch(Me, True, sname, svmodel, stitle, struevalue, sfalsevalue, bisPrimary, stabindex)
	swt.SetColorIntensity(scolor, sintensity)
	swt.SetRequired(bisrequired)
	swt.SetDisabled(bisdisabled)
	swt.SetDark(bisdark)
	swt.SetDense(bisdense)
	swt.SetHideDetails(bishidedetails)
	swt.SetLight(bislight)
	swt.SetLoading(sswitchloading)
	swt.SetMultiple(bismultiple)
	swt.SetInset(bisinset).SetFlat(bisflat)
	ui.AddControl(swt.checkbox, swt.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim swt${sname} As VMCheckBox = vm.NewSwitch(Me, ${bStatic}, "swt${sname}", "${svmodel}", "${stitle}", "${svalue}", "${sfalsevalue}", ${bisPrimary}, ${stabindex})"$).append(CRLF)
	CodeLine(sb, bisrequired, "b", "swt", sname, "SetRequired")
	CodeLine(sb, bisdisabled, "b", "swt", sname, "SetDisabled")
	CodeLine(sb, bisdark, "b", "swt", sname, "SetDark")
	CodeLine(sb, bisdense, "b", "swt", sname, "SetDense")
	CodeLine(sb, bishidedetails, "b", "swt", sname, "SetHideDetails")
	CodeLine(sb, bisinset, "b", "swt", sname, "SetInset")
	CodeLine(sb, bislight, "b", "swt", sname, "SetLight")
	CodeLine(sb, sswitchloading, "s", "swt", sname, "SetLoading")
	CodeLine(sb, bismultiple, "b", "swt", sname, "SetMultiple")
	CodeLine(sb, bisflat, "b", "swt", sname, "SetFlat")
	
	If scolor <> "" Then sb.append($"swt${sname}.SetColorIntensity("${scolor}", "${sintensity}")"$).append(CRLF)
	'
	sb.append($".Container.AddControl(swt${sname}.CheckBox, swt${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
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
	ui.AddControl(chk.checkbox, chk.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim chk${sname} As VMCheckBox = vm.NewCheckBox(Me, ${bStatic}, "chk${sname}", "${svmodel}", "${stitle}", "${struevalue}", "${sfalsevalue}", ${bisPrimary}, ${stabindex})"$).append(CRLF)
	CodeLine(sb, bisrequired, "b", "chk", sname, "SetRequired")
	CodeLine(sb, bisdisabled, "b", "chk", sname, "SetDisabled")
	CodeLine(sb, bisdark, "b", "chk", sname, "SetDark")
	CodeLine(sb, bisdense, "b", "chk", sname, "SetDense")
	CodeLine(sb, bishidedetails, "b", "chk", sname, "SetHideDetails")
	CodeLine(sb, bisindeterminate, "b", "chk", sname, "SetIndeterminate")
	CodeLine(sb, bislight, "b", "chk", sname, "SetLight")
	CodeLine(sb, bismultiple, "b", "chk", sname, "SetMultiple")
	If scolor <> "" Then sb.append($"chk${sname}.SetColorIntensity("${scolor}", "${sintensity}")"$).append(CRLF)
	'
	sb.append($".Container.AddControl(chk${sname}.CheckBox, chk${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Date
	Dim dp As VMDateTimePicker = ui.NewDatePicker(Me, True, "dp" & sname, svmodel, stitle, bisrequired, splaceholder, shelpertext, serrortext, stabindex)
	dp.SetVisible(bisvisible)
	dp.SetDisabled(bisdisabled)
	dp.SetRange(bisrange)
	dp.SetShowWeek(bisshowweek)
	dp.SetDark(bisdark)
	'dp.SetNotitle(bisnotitle)
	'dp.SetColorIntensity(scolor, sintensity)
	'dp.SetHeaderColorIntensity(sheadercolor, sheaderintensity)
	dp.SetFirstDayOfWeek(sfirstdayofweek)
	dp.SetMultiple(bismultiple)
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
		
	CodeLine(sb, bisvisible, "b", "dp", sname, "SetVisible")
	CodeLine(sb, bisdisabled, "b", "dp", sname, "SetDisabled")
	CodeLine(sb, bisrange, "b", "dp", sname, "SetRange")
	CodeLine(sb, bisshowweek, "b", "dp", sname, "SetShowWeek")
	CodeLine(sb, bisdark, "b", "dp", sname, "SetDark")
	'CodeLine(sb, bisnotitle, "b", "dp", sname, "SetNotitle")
	CodeLine(sb, sfirstdayofweek, "s", "dp", sname, "SetFirstDayOfWeek")
	CodeLine(sb, bismultiple, "b", "dp", sname, "SetMultiple")
	'If scolor <> "" Then sb.append($"dp${sname}.SetColorIntensity("${scolor}", "${sintensity}")"$).append(CRLF)
	'If sheadercolor <> "" Then sb.append($"dp${sname}.SetHeaderColorIntensity("${sheadercolor}", "${sheaderintensity}")"$).append(CRLF)
	'
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

	sb.append($".Container.AddControl(dp${sname}.DateTimePicker, dp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
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
				
	sb.append($".Container.AddControl(fi${sname}.TextField, fi${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

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
	CodeLine(sb, bisdisabled, "b", "rd", sname, "SetDisabled")
	CodeLine(sb, bisdense, "b", "rd", sname, "SetDense")
	CodeLine(sb, bismultiple, "b", "rd", sname, "SetMultiple")
	CodeLine(sb, bishidedetails, "b", "rd", sname, "SetHideDetails")
				
	sb.append($".Container.AddControl(rd${sname}.RadioGroup, rd${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

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

	sb.append($".Container.AddControl(sel${sname}.Combo, sel${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Slider
	Dim sld As VMSlider = ui.Newslider(Me, True, sname, svmodel, stitle, sminvalue, smaxvalue, stabindex)
	sld.SetValue(svalue)
	sld.SetColorIntensity(scolor, sintensity)
	sld.SetHideDetails(bishidedetails)
	sld.SetDark(bisdark)
	sld.SetReadonly(bisreadonly)
	sld.SetVertical(bisvertical)
	sld.SetStep(sstepvalue)
	sld.SetPrependIcon(sprependicon)
	sld.SetAppendIcon(sappendicon)
	sld.SetDense(bisdense)
	sld.SetThumbSize(sthumbsize)
	sld.SetThumbColorIntensity(sthumbcolor,sthumbintensity)
	sld.SetTrackColorIntensity(strackcolor,strackintensity)
	If bisthumblabel Then sld.SetThumbLabel(bisthumblabel)
	If bisthumbalways Then sld.SetThumbLabelAlways(bisthumbalways)
	ui.AddControl(sld.slider, sld.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim sld${sname} As VMSlider = vm.NewSlider(Me, ${bStatic}, "sld${sname}", "${svmodel}", "${stitle}", ${sminvalue}, ${smaxvalue}, ${stabindex})
.Container.AddControl(sld${sname}.Slider, sld${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

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
	ui.AddControl(lbl.Label, lbl.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim lbl${sname} As VMLabel =vm.NewLabel(${bStatic}, "lbl${sname}", "${svmodel}", "${slabelsize}", "${svalue}")"$).append(CRLF)
	CodeLine(sb, sdisplay, "s", "lbl", sname, "AddClass")
	CodeLine(sb, salign, "s", "lbl", sname, "AddClass")
	CodeLine(sb, sfontweight, "s", "lbl", sname, "AddClass")
	CodeLine(sb, bisitalic, "b", "lbl", sname, "SetItalic")
	If stextcolor <> "" Then sb.append($"lbl${sname}.SetTextColorIntensity("${stextcolor}", "${stextintensity}")"$).append(CRLF)

	sb.append($".Container.AddControl(lbl${sname}.Label, lbl${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Email
	Dim email As VMTextField = ui.NewEmail(Me, True, sname, svmodel, stitle, splaceholder, bisrequired, sicon, shelpertext, serrortext, stabindex)
	email.SetFieldType(sfieldtype)
	email.SetSolo(bissolo)
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
	ui.AddControl(email.TextField, email.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim email${sname} As VMTextField = vm.NewEmail(Me, ${bStatic}, "email${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, "${sicon}", "${shelpertext}", "${serrortext}", ${stabindex})"$).Append(CRLF)

	CodeLine(sb, sfieldtype, "s", "email", sname, "SetFieldType")
	CodeLine(sb, bissolo, "b", "email", sname, "SetSolo")
	CodeLine(sb, bisoutlined, "b", "email", sname, "SetOutlined")
	CodeLine(sb, bisfilled, "b", "email", sname, "SetFilled")
	CodeLine(sb, bisdense, "b", "email", sname, "SetDense")
	CodeLine(sb, bissingleline, "b", "email", sname, "SetSingleLine")
	CodeLine(sb, bispersistenthint, "b", "email", sname, "SetPersistentHint")
	CodeLine(sb, bisshaped, "b", "email", sname, "SetShaped")
	CodeLine(sb, bisloading, "b", "email", sname, "SetLoading")
	CodeLine(sb, bisflat, "b", "email", sname, "SetFlat")
	CodeLine(sb, bisrounded, "b", "email", sname, "SetRounded")
	CodeLine(sb, bclearable, "b", "email", sname, "SetClearable")
	CodeLine(sb, bishidedetails, "b", "email", sname, "SetHideDetails")

	sb.append($".Container.AddControl(email${sname}.textfield, email${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Password
	Dim pwd As VMTextField = ui.NewPassword(Me, True, sname, svmodel, stitle, splaceholder, bisrequired, bToggle, sicon, imaxlen, shelpertext, serrortext, stabindex)
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
				
	ui.AddControl(pwd.TextField, pwd.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim pwd${sname} As VMTextField = vm.NewPassword(Me, ${bStatic}, "pwd${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, ${bToggle}, "${sicon}", ${imaxlen}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
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

	sb.append($".Container.AddControl(pwd${sname}.textfield, pwd${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Tel
	Dim tel As VMTextField = ui.NewTel(Me, True, sname, svmodel, stitle, splaceholder, bisrequired, sicon, shelpertext, serrortext, stabindex)
	tel.SetFieldType(sfieldtype)
	tel.SetSolo(bissolo)
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
	ui.AddControl(tel.TextField, tel.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim tel${sname} As VMTextField = vm.NewTel(Me, ${bStatic}, "tel${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, "${sicon}", "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)

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
		
	sb.append($".Container.AddControl(tel${sname}.textfield, tel${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'

End Sub

Sub Design_Time
	Dim tp As VMDateTimePicker = ui.Newtimepicker(Me, True, "tp" & sname, svmodel, stitle, bisrequired, splaceholder, shelpertext, serrortext, stabindex)
	tp.SetVisible(bisvisible)
	tp.SetDisabled(bisdisabled)
	tp.SetAmPmInTitle(bisampm)
	tp.SetDark(bisdark)
	'tp.SetNotitle(bisnotitle)
	tp.SetUSeSeconds(bisuseseconds)
	'tp.SetColorIntensity(scolor, sintensity)
	'tp.SetHeaderColorIntensity(sheadercolor, sheaderintensity)
	tp.SetFormat(stformat)
			
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
	CodeLine(sb, bisvisible, "b", "tp", sname, "SetVisible")
	CodeLine(sb, bisdisabled, "b", "tp", sname, "SetDisabled")
	CodeLine(sb, bisampm, "b", "tp", sname, "SetAmPmInTitle")
	CodeLine(sb, bisdark, "b", "tp", sname, "SetDark")
	'CodeLine(sb, bisnotitle, "b", "tp", sname, "SetNotitle")
	CodeLine(sb, bisuseseconds, "b", "tp", sname, "SetUSeSeconds")
	'If scolor <> "" Then sb.append($"tp${sname}.SetColorIntensity("${scolor}", "${sintensity}")"$).append(CRLF)
	'If sheadercolor <> "" Then sb.append($"tp${sname}.SetHeaderColorIntensity("${sheadercolor}", "${sheaderintensity}")"$).append(CRLF)
	'
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
		
	sb.append($".Container.AddControl(tp${sname}.DateTimePicker, tp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Icon
	Dim icn As VMIcon = ui.NewIcon(Me, True, sname, sicon, ssize, scolor, sintensity)
	icn.SetDark(bisdark)
	icn.SetDense(bisdense)
	icn.SetDisabled(bisdisabled)
	icn.SetCenterOnParent(bcenteronparent)
	ui.AddControl(icn.Icon, icn.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim icn${sname} As VMIcon = vm.NewIcon(Me, True, "${sname}", "${sicon}", "${ssize}", "${scolor}", "${sintensity}")"$).append(CRLF)
	CodeLine(sb, bisdark, "b", "icn", sname, "SetDark")
	CodeLine(sb, bisdense, "b", "icn", sname, "SetDense")
	CodeLine(sb, bisdisabled, "b", "icn", sname, "SetDisabled")
	CodeLine(sb, bcenteronparent, "b", "icn", sname, "SetCenterOnParent")
	sb.append($".Container.AddControl(icn${sname}.Icon, icn${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_Parallax
	Dim para As VMParallax = ui.NewParallax(Me, True, sname, sheight, ssrc, salt)
	ui.AddControl(para.Parallax, para.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim prlx${sname} As VMParallax = vm.NewParallax(Me, ${bStatic}, "prlx${sname}", "${sheight}", "${ssrc}", "${salt}")"$).append(CRLF)
	sb.append($".Container.AddControl(prlx${sname}.Parallax, img${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
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
	sb.append($".Container.AddControl(cont${sname}.Container, cont${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
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
	sb.append($".Container.AddControl(img${sname}.Image, img${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
	'
End Sub

Sub Design_Button
	If biconbutton Then stitle = ""
	If bfabbutton Then stitle = ""
	Dim btn As VMButton = ui.NewButton(Me, True, sname, stitle, True, bisPrimary, False, bfitwidth)
	btn.Sethref(shref)
	btn.SetTarget(starget)
	btn.setto(sto)
	btn.SetTooltip(stooltip)
	btn.SetColorIntensity(scolor, sintensity)
	btn.SetTextColorIntensity(stextcolor, stextintensity)
	btn.SetDisabled(bisdisabled).Setoutlined(bisoutlined)
	btn.SetRounded(bisrounded).SetTransparent(bistext)
	If biconbutton Then btn.SetIconButton(sicon)
	If bfabbutton Then btn.Setfabbutton(sicon)
	btn.SetDepressed(bisdepressed)
	btn.SetDark(bisdark)
	btn.SetTile(bistile)
	btn.SetWidth(swidth)
	btn.SetHeight(sheight)
	btn.SetMinWidth(sminwidth)
	btn.SetMaxWidth(smaxwidth)
	btn.SetMinHeight(sminheight)
	btn.SetMaxHeight(smaxheight)
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
				
	sb.append($"Dim btn${sname} As VMButton = vm.NewButton(Me, True, "${sname}", "${stitle}", True, ${bisPrimary}, False, ${bfitwidth})"$).append(CRLF)
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
	If biconbutton Then sb.append($"btn${sname}.SetIconButton("${sicon}")"$).append(CRLF)
	If bfabbutton Then sb.append($"btn${sname}.SetFabButton("${sicon}")"$).append(CRLF)
	If bisdepressed Then sb.append($"btn${sname}.SetDepressed(${bisdepressed})"$).append(CRLF)
	If bisdark Then sb.append($"btn${sname}.SetDark(${bisdark})"$).append(CRLF)
	If bistile Then sb.append($"btn${sname}.SetTile(${bistile})"$).append(CRLF)
	If swidth <> "" Then sb.append($"btn${sname}.SetWidth("${swidth}")"$).append(CRLF)
	If sheight <> "" Then sb.append($"btn${sname}.SetHeight("${sheight}")"$).append(CRLF)
	If sminwidth <> "" Then sb.append($"btn${sname}.SetMinWidth("${sminwidth}")"$).append(CRLF)
	If smaxwidth <> "" Then sb.append($"btn${sname}.SetMaxWidth("${smaxwidth}")"$).append(CRLF)
	If sminheight <> "" Then sb.append($"btn${sname}.SetMinHeight("${sminheight}")"$).append(CRLF)
	If smaxheight <> "" Then sb.append($"btn${sname}.SetMaxHeight("${smaxheight}")"$).append(CRLF)
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
	sb.append($".Container.AddControl(btn${sname}.Button, btn${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub Design_TextField
	Dim txt As VMTextField = ui.NewTextField(Me, True, sname, svmodel, stitle, splaceholder, bisrequired, sicon, imaxlen, shelpertext, serrortext, stabindex)
	txt.SetFieldType(sfieldtype)
	txt.SetSolo(bissolo)
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
	ui.AddControl(txt.textfield, txt.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
	'
	sb.append($"Dim txt${sname} As VMTextField = vm.NewTextField(Me, ${bStatic}, "txt${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bisrequired}, "${sicon}", ${imaxlen}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
	'
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

	sb.append($".Container.AddControl(txt${sname}.textfield, txt${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
End Sub

Sub CodeLine(sbx As StringBuilder, varName As String, varType As String, prefix As String, ssname As String, methodName As String)
	Select Case varType
		Case "b"
			If varName Then sbx.append($"${prefix}${ssname}.${methodName}(${varName})"$).append(CRLF)
		Case "s"
			If varName <> "" Then sbx.append($"${prefix}${ssname}.${methodName}("${varName}")"$).append(CRLF)
	End Select
End Sub

Sub BuildDrawer
	
End Sub

Sub btnRefresh_click(e As BANanoEvent)
	CreateUX
End Sub

Sub btnBack_click(e As BANanoEvent)
	pgIndex.init
End Sub

Sub optMenuitems_click(e As BANanoEvent)
	Dim menuID As String = vm.getidfromevent(e)
	Select Case menuID
		Case "btnshowmatrix"
			vm.ToggleState("showmatrix")
			bShowMatrix = vm.getdata("showmatrix")
			If bShowMatrix = True Then
				BANano.setlocalstorage("showmatrix", True)
			Else
				BANano.setlocalstorage("showmatrix", False)
			End If
			CreateUX
		Case "btnhasborder"
			vm.togglestate("hasborder")
			bHasBorder = vm.getdata("hasborder")
			If bHasBorder = True Then
				BANano.setlocalstorage("hasborder", True)
			Else
				BANano.setlocalstorage("hasborder", False)
			End If
			CreateUX
	End Select
End Sub

Sub compMenuitems_click(e As BANanoEvent)
	Dim menuID As String = vm.getidfromevent(e)
	Select Case menuID
		Case "btnclearcomp"
			vm.ShowConfirm("clearcomp", "Confirm Clear Components", "Are you sure that you want to clear the components?", "Yes", "No")
		Case "btnremovelastcomp"
			vm.ShowConfirm("removelastcomp", "Confirm Remove Last", "Are you sure that you want to remove the last component?", "Yes", "No")
	End Select
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

Sub AddPages

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
	vm.Container.SetOnDragOverRC(1, 2, "ItemDragOver")
	vm.Container.SetOnDropRC(1, 2, "ItemDrop")
	'
	Dim ep As VMExpansionPanels = vm.CreateExpansionpanels("ep1", Me).SetAccordion(True)
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
	'
	mymac = vm.CreateDevice("mymac", Me).SetMacbook
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
	'b4x code
	pc = vm.CreatePrism("b4xcode", Me).SetLanguage("vb")
	b4x.AddComponent(1, 1, pc.tostring)
	
	'html code
	htm = vm.CreatePrism("htmlcode", Me).SetLanguage("html")
	html5.AddComponent(1, 1, htm.tostring)
	'
	tabs.AddTab("dndrea", "Drag n Drop / Preview", "mdi-drag-variant", dnd)
	tabs.AddTab("b4xarea", "B4X", "code", b4x)
	tabs.AddTab("htmlarea", "HTML", "mdi-language-html5", html5)
	vm.container.AddComponent(1, 2, tabs.tostring)
End Sub
'

Sub ComponentsPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("ep0grid", "ep1", Me)
	grd.Header.SetText("My Components")
	grd.Container.SetTag("div")
	grd.Container.AddRows(1).AddColumns12
	'
	Dim mycomponents As VMList = vm.CreateList("mycomponents", Me)
	mycomponents.SetDataSourceTemplate("myux", "id", "avatar", "", "vmodel", "label", "")
	
	grd.Container.AddComponent(1,1,mycomponents.tostring)

	Return grd
End Sub

'a component has been clicked
Sub mycomponents_click(e As BANanoEvent)
	Dim itemID As String = vm.GetIDFromEvent(e)
	itemID = BANano.parseint(itemID)
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
	'show the property bags
	Select Case stypeof
		Case "container"
			ShowBag("pbcontainer")
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
			vm.setdata("controltype", "text")
			pbtextfield.hideitem("id")
			pbtextfield.Hideitem("controltype")
		Case "textarea"
			ShowBag("pbtextfield")
			pbtextfield.SetDefaults
			vm.setdata("controltype", "textarea")
			pbtextfield.hideitem("id")
			pbtextfield.Hideitem("controltype")
		Case "checkbox"
			ShowBag("pbcheckbox")
			pbcheckbox.SetDefaults
			pbcheckbox.hideitem("id")
			pbcheckbox.Hideitem("controltype")
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
			vm.setdata("controltype", "time")
			pbdatepicker.hideitem("id")
			pbdatepicker.Hideitem("controltype")
		Case "image"
			ShowBag("pbimage")
			pbimage.SetDefaults
			vm.setdata("controltype", "image")
			pbimage.hideitem("id")
			pbimage.Hideitem("controltype")
		Case "button"
			ShowBag("pbbutton")
			pbbutton.SetDefaults
			vm.setdata("controltype", "button")
			pbbutton.hideitem("id")
			pbbutton.Hideitem("controltype")
		Case "icon"
			ShowBag("pbicon")
			pbicon.SetDefaults
			vm.setdata("controltype", "icon")
			pbicon.hideitem("id")
			pbicon.Hideitem("controltype")
	End Select
	'
	Dim mattr As Map = BANano.FromJson(sattributes)
	'DONT OVERWRITE
	Select Case stypeof
		Case "text", "textarea", "date", "file", "select", "email", "password","tel", "combo", "number", "auto", "time", "image", "profile", "button", "icon", "parallax", "container"
			mattr.remove("controltype")
	End Select
	vm.setstate(mattr)
	vm.setdata("propbagtype", stypeof)
	vm.setdata("propbag", mattr)
End Sub


Sub NavigationPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("epnav", "ep1", Me)
	grd.Header.SetText("Navigation")
	grd.Container.SetTag("div")
	grd.Container.AddRows(1).AddColumns4X3
	'
	Dim btn As VMImage = ToolboxImage("button", "./assets/button.png", "Button")
	grd.Container.AddComponent(1,1,btn.tostring)
	'
	Return grd
End Sub

Sub LayoutPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("laynav", "epx", Me)
	grd.Header.SetText("Layouts")
	grd.Container.SetTag("div")
	grd.Container.AddRows(1).AddColumns4X3
	'
	Dim cont As VMImage = ToolboxImage("container", "./assets/container.png", "Container")
	grd.Container.AddComponent(1,1,cont.tostring)
	'
	Return grd
End Sub

Sub DisplayPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("ep3grid", "ep1", Me)
	grd.Header.SetText("Display")
	grd.Container.SetTag("div")
	grd.Container.AddRows(1).AddColumns4X3
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
	Dim para As VMImage = ToolboxImage("parallax", "./assets/carousel.png", "Parallax")
	grd.Container.AddComponent(1,4,para.tostring)
	'
	Return grd
End Sub

Sub ToolboxImage(eid As String, url As String, tt As String) As VMImage
	Dim img As VMImage = vm.CreateImage(eid, Me).SetValue(url).SetOnDragStart(Me, "ItemDragStart")
	img.SetHeight("32px").SetWidth("32px").SetCursorMove.SetTooltip(tt)
	Return img
End Sub

Sub FormPanel As VMExpansionPanel
	Dim grd As VMExpansionPanel = vm.CreateExpansionPanel("ep2grid", "ep1", Me)
	grd.Header.SetText("Form Inputs")
	grd.Container.SetTag("div")
	grd.Container.AddRows(4).AddColumns4X3
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
	Dim slabel As VMImage = ToolboxImage("label", "./assets/label.png", "Label")
	grd.Container.AddComponent(3,2,slabel.tostring)
	
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
	Return grd
End Sub


Sub ToolboxDiv(eid As String, text As String) As VMElement
	Dim dv As VMElement = vm.CreateDiv(eid).SetOnDragStart(Me, "ItemDragStart")
	dv.SetBorder("2px", vm.COLOR_BLACK, vm.BORDER_SOLID).SetWidth("42px").SetHeight("32px").SetVerticalAlignMiddle
	dv.SetText(text).SetTextAlignCenter.SetCursorMove.SetBackgroundColor(vm.COLOR_GREY).SetLineHeight("32px")
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
	ShowBag("")
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
	
	Select Case dropZoneID
		Case "bananovmdemocontainerr1c2"
			'drop on root
			Select Case savedid
				Case "rc12","rc6x2", "rc1x12", "rc2x6","rc4x3", "rc3x4", _
			"rc5p7","rc7p5","rc8p4","rc9p3","rc10p2","rc11p1", _
			"rc4p8", "rc3p9", "rc2p10", "rc1p11", "rc12x1", _
			"row", "col2", "col1", "col3","col4","col5", "col6", "col7", _
			"col8", "col9", "col10", "col11", "col12"
					'adding 1 row and
					BANano.SetLocalStorage("selectedpanel", 0)
					BANano.SetLocalStorage("hasborder", True)
					BANano.SetLocalStorage("showmatrix", True)
					vm.setdata("showmatrix", True)
					vm.setdata("hasborder", True)
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
				Case "text", "textarea", "checkbox", "date", "file", "radio", "select", "slider", _
			"switch", "label", "email", "password", "tel", "combo", "number", "profile", "auto", "time", "image", "button", "icon", _
			"parallax", "container"
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
					attr.put("fieldtype", "string")
					attr.put("id", sid)
					attr.put("vmodel", slabel)
					attr.put("row", rowPos)
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
					attr.Put("icon", "mdi-account-circle")
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
					'
					Select Case savedid
						Case "label"
							attr.put("labelsize", "p")
							attr.put("value", slabel)
						Case "password"
							attr.put("istoggle", "Yes")
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
							BANano.SetLocalStorage("selectedpanel", 1)
						Case "button"
							BANano.SetLocalStorage("selectedpanel", 3)
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
	End Select
End Sub

#Region Slider Property Bag
Sub PropertyBag_Slider
	vm.setdata("pbslider",False)
	pbslider = vm.CreateProperty("ppbslider", Me)
	pbslider.SetVShow("pbslider")
	pbslider.AddHeading("d","Details")
	pbslider.AddText("d","id","ID","","")
	pbslider.AddSelect("d", "controltype", "Type", controltypes)
	pbslider.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbslider.AddText("d", "vmodel","VModel","","")
	pbslider.AddText("d", "label","Label","","")
	pbslider.AddText("d", "value", "Value(s)","","20")
	pbslider.AddText("d", "minvalue", "Min Value","","0")
	pbslider.AddText("d", "stepvalue", "Step","","1")
	pbslider.AddText("d", "maxvalue", "Max Value","","100")
	pbslider.AddText("d", "prependicon", "Prepend Icon","","volume_down")
	pbslider.AddText("d", "appendicon", "Append Icon","","volume_up")
	pbslider.AddText("d", "thumbsize", "Thumb Size","","32")
	pbslider.AddSelect("d","color","Color", vm.ColorOptions)
	pbslider.AddSelect("d","intensity","Intensity", vm.IntensityOptions)
	pbslider.AddSelect("d","thumbcolor","Thumb Color", vm.ColorOptions)
	pbslider.AddSelect("d","thumbintensity","Thumb Intensity", vm.IntensityOptions)
	pbslider.AddSelect("d","trackcolor","Track Color", vm.ColorOptions)
	pbslider.AddSelect("d","trackintensity","Track Intensity", vm.IntensityOptions)
	pbslider.AddNumber("d","tabindex","Tab Index","","")
	'
	pbslider.AddCheck2(1, 1, "isrequired", "Required")
	pbslider.AddCheck2(1, 2, "isvisible", "Visible")
	pbslider.AddCheck2(2, 1, "isdisabled", "Disabled")
	pbslider.AddCheck2(2, 2, "isreadonly", "Read Only")
	pbslider.AddCheck2(3, 1, "isvertical", "Vertical")
	pbslider.AddCheck2(3, 2, "isthumbalways", "Thumb Label Always")
	pbslider.AddCheck2(4, 1, "isthumblabel", "Thumb Label")
	pbslider.AddCheck2(4, 2, "ishidedetails", "Hide Details")
	pbslider.AddCheck2(5, 1, "isdark", "Dark")
	pbslider.AddCheck2(5, 2, "isdense", "Dense")
	pbslider.SetChecks("d")
	
	pbslider.AddMatrix("d")
	pbslider.AddButton("d", "btnSaveSlider", "Save", "savePropertyBag")
	pbslider.AddButton("d", "btnDeleteSlider", "Delete", "deletePropertyBag")
	vm.Container.AddComponent(1, 3, pbslider.tostring)
End Sub
#End Region


#Region DatePicker Property Bag
Sub PropertyBag_DatePicker
	vm.setdata("pbdatepicker", False)
	pbdatepicker = vm.CreateProperty("ppbdatepicker", Me)
	pbdatepicker.SetVShow("pbdatepicker")
	pbdatepicker.AddHeading("d","Details")
	pbdatepicker.AddText("d","id","ID","","")
	pbdatepicker.AddSelect("d", "controltype", "Type", controltypes)
	pbdatepicker.AddText("d","vmodel","VModel","","")
	pbdatepicker.AddText("d","label","Label","","")
	pbdatepicker.AddText("d","placeholder","Placeholder","","")
	pbdatepicker.AddText("d","helpertext","Helper Text","","")
	pbdatepicker.AddText("d","errortext","Error Text","","")
	pbdatepicker.AddText("d","firstdayofweek","First Day of Week","","0")
	pbdatepicker.AddRadioGroup("d", "tformat", "T:Format", CreateMap("ampm":"AM/PM","24hr":"24hr"))
	'pbdatepicker.AddSelect("d","headercolor","Header Color", vm.ColorOptions)
	'pbdatepicker.AddSelect("d","headerintensity","Header Intensity", vm.IntensityOptions)
	'pbdatepicker.AddSelect("d","color","T:Color", vm.ColorOptions)
	'pbdatepicker.AddSelect("d","intensity","T:Intensity", vm.IntensityOptions)
	pbdatepicker.AddNumber("d","tabindex","Tab Index","","")
	'
	pbdatepicker.AddCheck2(1, 1, "isrequired", "Required")
	pbdatepicker.AddCheck2(1, 2, "isclearable", "Clearable")
	pbdatepicker.AddCheck2(2, 1, "isvisible", "Visible")
	pbdatepicker.AddCheck2(2, 2, "isdisabled", "Disabled")
	pbdatepicker.AddCheck2(3, 1, "ontable", "On Table")
	pbdatepicker.AddCheck2(3, 2, "ismultiple", "Multiple")
	pbdatepicker.AddCheck2(4, 1, "isrange", "Range")
	pbdatepicker.AddCheck2(4, 2, "isshowweek", "Show Week")
	pbdatepicker.AddCheck2(5, 1, "isampm", "T:AM/PM in Title")
	pbdatepicker.AddCheck2(5, 2, "isdark", "Dark")
	pbdatepicker.AddCheck2(6, 1, "isnotitle", "T:No Title")
	pbdatepicker.AddCheck2(6, 2, "isuseseconds", "T:Use Seconds")
	'
	pbdatepicker.AddCheck2(7, 1, "issolo", "Solo")
	pbdatepicker.AddCheck2(7, 2, "isoutlined", "Outlined")
	pbdatepicker.AddCheck2(8, 1, "isfilled", "Filled")
	pbdatepicker.AddCheck2(8, 2, "isdense", "Dense")
	pbdatepicker.AddCheck2(9, 1, "issingleline", "Single Line")
	pbdatepicker.AddCheck2(9, 2, "ispersistenthint", "Persistent Hint")
	pbdatepicker.AddCheck2(10, 1, "isshaped", "Shaped - FOS")
	pbdatepicker.AddCheck2(10, 2, "isloading", "Loading")
	pbdatepicker.AddCheck2(11, 1, "isflat", "Flat - Solo")
	pbdatepicker.AddCheck2(11, 2, "isrounded", "Rounded - FOS")
	pbdatepicker.AddCheck2(12, 1, "ishidedetails", "Hide Details")
	pbdatepicker.SetChecks("d")
		
	pbdatepicker.AddMatrix("d")
	pbdatepicker.AddButton("d", "btnSaveDate", "Save", "savePropertyBag")
	pbdatepicker.AddButton("d", "btnDeleteDate", "Delete", "deletePropertyBag")
	vm.container.Addcomponent(1, 3, pbdatepicker.tostring)
End Sub
#End Region


#Region Button Property Bag
Sub PropertyBag_Button
	vm.setdata("pbbutton", False)
	pbbutton = vm.CreateProperty("ppbbutton", Me)
	pbbutton.SetVShow("pbbutton")
	pbbutton.AddHeading("d","Details")
	pbbutton.AddText("d","id","ID","","")
	pbbutton.AddSelect("d", "controltype", "Type", controltypes)
	pbbutton.AddText("d","vmodel","ID","","")
	pbbutton.AddText("d","label","Label","","")
	pbbutton.AddText("d","href","Href","","")
	pbbutton.AddText("d","target","Target","","")
	pbbutton.AddText("d","to","Navigate To","","")
	pbbutton.AddText("d","icon","Icon Name","","")
	pbbutton.AddText("d","tooltip","Tooltip","","")
	pbbutton.AddSelect("d","color","Color", vm.ColorOptions)
	pbbutton.AddSelect("d","intensity","Intensity", vm.IntensityOptions)
	pbbutton.AddSelect("d","textcolor","Text Color", vm.ColorOptions)
	pbbutton.AddSelect("d","textintensity","Text Intensity", vm.IntensityOptions)
	'
	pbbutton.AddSelect("d", "size", "Size", iconsizes)
	pbbutton.AddNumber("d","tabindex","Tab Index","","")
	'
	pbbutton.AddCheck2(1, 1, "istext", "Text")
	pbbutton.AddCheck2(1, 2, "isfitwidth", "Fit Width/Block")
	pbbutton.AddCheck2(2, 1, "isoutlined", "Outlined")
	pbbutton.AddCheck2(2, 2, "isrounded", "Rounded")
	pbbutton.AddCheck2(3, 1, "isiconbutton", "Icon Button")
	pbbutton.AddCheck2(3, 2, "isdepressed", "Depressed")
	pbbutton.AddCheck2(4, 1, "isfabbutton", "FAB Button")
	pbbutton.AddCheck2(4, 2, "isvisible", "Visible")
	pbbutton.AddCheck2(5, 1, "isdisabled", "Disabled")
	pbbutton.AddCheck2(5, 2, "isdark", "Dark")
	pbbutton.AddCheck2(6, 1, "istile", "Tile")
	pbbutton.AddCheck2(6, 2, "centeronparent", "Center on Parent")
	
	pbbutton.SetChecks("d")
	'
	pbbutton.AddHeightWidths("d")
	
	pbbutton.AddMatrix("d")
	pbbutton.AddButton("d", "btnSaveButton", "Save", "savePropertyBag")
	pbbutton.AddButton("d", "btnDeleteButton", "Delete", "deletePropertyBag")
	vm.Container.AddComponent(1, 3, pbbutton.tostring)
End Sub
#End Region

#Region Icon Property Bag
Sub PropertyBag_Icon
	vm.setdata("pbicon", False)
	pbicon = vm.CreateProperty("ppbicon", Me)
	pbicon.SetVShow("pbicon")
	pbicon.AddHeading("d","Details")
	pbicon.AddText("d","id","ID","","")
	pbicon.AddText("d", "controltype", "Type", "", "icon")
	pbicon.AddText("d","vmodel","ID","","")
	pbicon.AddText("d","icon","Icon Name","","mdi-account-circle")
	pbicon.AddSelect("d", "size", "Icon Size", iconsizes)
	pbicon.AddSelect("d","color","Color", vm.ColorOptions)
	pbicon.AddSelect("d","intensity","Intensity", vm.IntensityOptions)
	pbicon.AddCheck2(1, 1, "isvisible", "Visible")
	pbicon.AddCheck2(1, 2, "ontable", "On Table")
	pbicon.AddCheck2(2, 1, "isdark", "Dark")
	pbicon.AddCheck2(2, 2, "isdense", "Dense")
	pbicon.AddCheck2(3, 1, "isdisabled", "Disabled")
	pbicon.AddCheck2(3, 2, "centeronparent", "Center on Parent")
	pbicon.SetChecks("d")
	
	pbicon.AddMatrix("d")
	pbicon.AddButton("d", "btnSaveIcon", "Save", "savePropertyBag")
	pbicon.AddButton("d", "btnDeleteIcon", "Delete", "deletePropertyBag")
	vm.Container.AddComponent(1, 3, pbicon.tostring)
End Sub
#End Region

#Region Image Property Bag
Sub PropertyBag_Image
	vm.setdata("pbimage", False)
	pbimage = vm.CreateProperty("ppbimage",Me)
	pbimage.SetVShow("pbimage")
	pbimage.AddHeading("d","Details")
	pbimage.AddText("d","id","ID","","")
	pbimage.AddText("d", "controltype", "Type", "", "image")
	pbimage.AddText("d","vmodel","VModel","","")
	pbimage.AddText("d","src","Src","","./assets/sponge.png")
	pbimage.AddText("d","lazysrc","Lazy Src","","")
	pbimage.AddText("d","alt","Alt","","")
	pbimage.AddText("d","tooltip","Tooltip","","")
	pbimage.AddNumber("d","tabindex","Tab Index","","")
	pbimage.AddText("d","borderradius","Border Radius","","")
	pbimage.AddText("d","borderwidth","Border Width","","")
	pbimage.AddSelect("d","bordercolor","Border Color", vm.ColorOptions)
	pbimage.AddSelect("d","borderstyle","Border Style",vm.BorderOptions)
	pbimage.AddText("d","aspectratio","Aspect Ratio","","")
	pbimage.AddHeightWidths("d")
	'
	pbimage.AddCheck2(1, 1, "isvisible", "Visible")
	pbimage.AddCheck2(1, 2, "ontable", "On Table")
	pbimage.AddCheck2(2, 1, "centeronparent", "Center on Parent")
	pbimage.SetChecks("d")
	
	pbimage.AddMatrix("d")
	'
	pbimage.AddButton("d", "btnSaveImage", "Save", "savePropertyBag")
	pbimage.AddButton("d", "btnDeleteImage", "Delete", "deletePropertyBag")
	vm.Container.AddComponent(1, 3, pbimage.tostring)
End Sub
#End Region

#Region CheckBox Property Bag
Sub PropertyBag_CheckBox
	vm.setdata("pbcheckbox", False)
	pbcheckbox = vm.CreateProperty("ppbcheckbox",Me)
	pbcheckbox.SetVShow("pbcheckbox")
	pbcheckbox.AddHeading("d","Details")
	pbcheckbox.AddText("d","id","ID","","")
	pbcheckbox.AddSelect("d", "controltype", "Type", controltypes)
	pbcheckbox.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbcheckbox.AddText("d","vmodel","VModel","","")
	pbcheckbox.AddText("d","label","Label","","")
	pbcheckbox.AddText("d","truevalue","True Value","","Yes")
	pbcheckbox.AddText("d","falsevalue","False Value","","No")
	pbcheckbox.AddNumber("d","tabindex","Tab Index","","")
	pbcheckbox.AddSelect("d","color","Color", vm.ColorOptions)
	pbcheckbox.AddSelect("d","intensity","Intensity", vm.IntensityOptions)
	pbcheckbox.AddSelect("d","switchloading","Loading", vm.ColorOptions)
	'
	pbcheckbox.AddCheck2(1, 1, "isrequired", "Required")
	pbcheckbox.AddCheck2(1, 2, "isprimary", "Primary")
	pbcheckbox.AddCheck2(2, 1, "isvisible", "Visible")
	pbcheckbox.AddCheck2(2, 2, "isdisabled", "Disabled")
	pbcheckbox.AddCheck2(3, 1, "ontable", "On Table")
	pbcheckbox.AddCheck2(3, 2, "isdark", "Dark")
	pbcheckbox.AddCheck2(4, 1, "isdense", "Dense")
	pbcheckbox.AddCheck2(4, 2, "ishidedetails", "Hide Details")
	pbcheckbox.AddCheck2(5, 1, "isindeterminate", "Indeterminate")
	pbcheckbox.AddCheck2(5, 2, "islight", "Light")
	pbcheckbox.AddCheck2(6, 1, "ismultiple", "Multiple")
	pbcheckbox.AddCheck2(6, 2, "isinset", "Inset")
	pbcheckbox.AddCheck2(7, 1, "isflat", "Flat")
	pbcheckbox.SetChecks("d")
	'
	pbcheckbox.AddMatrix("d")
	pbcheckbox.AddButton("d", "btnSaveCheck", "Save", "savePropertyBag")
	pbcheckbox.AddButton("d", "btnDeleteCheck", "Delete", "deletePropertyBag")
	'
	vm.container.AddComponent(1, 3, pbcheckbox.tostring)
End Sub
#End Region

#Region Radio Property Bag
Sub PropertyBag_RadioGroup
	vm.setdata("pbradiogroup", False)
	pbradiogroup = vm.CreateProperty("ppbradiogroup", Me)
	pbradiogroup.SetVShow("pbradiogroup")
	pbradiogroup.AddHeading("d","Details")
	pbradiogroup.AddText("d","id","ID","","")
	pbradiogroup.AddText("d", "controltype", "Type", "", "radio")
	pbradiogroup.AddText("d","vmodel","VModel","","")
	pbradiogroup.AddText("d","label","Label","","")
	pbradiogroup.AddText("d","value","Value","","")
	pbradiogroup.AddText("d","sourcetable","Data Source","","")
	pbradiogroup.AddText("d","sourcefield","Item Value","","")
	pbradiogroup.AddText("d","displayfield","Item Text","","")
	pbradiogroup.AddTextArea("d","keys","Item Values (,)","", "1,2,3")
	pbradiogroup.AddTextArea("d","values","Item Texts (,)", "", "One,Two,Three")
	pbradiogroup.AddNumber("d","tabindex","Tab Index","","")
	'
	pbradiogroup.AddCheck2(1, 1, "showlabel", "Show Label")
	pbradiogroup.AddCheck2(1, 2, "labelontop", "Column")
	pbradiogroup.AddCheck2(2, 1, "isvisible", "Visible")
	pbradiogroup.AddCheck2(2, 2, "isdisabled", "Disabled")
	pbradiogroup.AddCheck2(3, 1, "ontable", "On Table")
	pbradiogroup.AddCheck2(3, 2, "ismandatory", "Mandatory")
	pbradiogroup.AddCheck2(4, 1, "isdense", "Dense")
	pbradiogroup.AddCheck2(4, 2, "ishidedetails", "Hide Details")
	pbradiogroup.AddCheck2(5, 1, "ismultiple", "Multiple")
	pbradiogroup.AddCheck2(5, 2, "useoptions", "Use Options")
	pbradiogroup.SetChecks("d")
	
	pbradiogroup.AddMatrix("d")
	pbradiogroup.AddButton("d", "btnSaveRadio", "Save", "savePropertyBag")
	pbradiogroup.AddButton("d", "btnDeleteRadio", "Delete", "deletePropertyBag")
	'
	vm.container.AddComponent(1, 3, pbradiogroup.tostring)
End Sub
#End Region

#Region Select Property Bag
Sub PropertyBag_Select
	vm.setdata("pgselectbox", False)
	pbselectbox = vm.CreateProperty("ppbselectbox", Me)
	pbselectbox.SetVShow("pbselectbox")
	pbselectbox.AddHeading("d","Details")
	pbselectbox.AddText("d","id","ID","","")
	pbselectbox.AddSelect("d", "controltype", "Type", controltypes)
	pbselectbox.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbselectbox.AddText("d","vmodel","VModel","","")
	pbselectbox.AddText("d","label","Label","","")
	pbselectbox.AddText("d", "value", "Value","","")
	pbselectbox.AddText("d","placeholder","Placeholder","","")
	pbselectbox.AddNumber("d","tabindex","Tab Index","","")
	pbselectbox.AddText("d","helpertext","Helper Text","","")
	pbselectbox.AddText("d","errortext","Error Text","","")
	pbselectbox.AddText("d","sourcetable","Data Source","","")
	pbselectbox.AddText("d","sourcefield","Item Value","","")
	pbselectbox.AddText("d","displayfield","Item Text","","")
	pbselectbox.AddTextArea("d","keys","Item Values (,)","", "1,2,3")
	pbselectbox.AddTextArea("d","values","Item Texts (,)", "", "One,Two,Three")
	'
	pbselectbox.AddCheck2(1, 1, "isrequired", "Required")
	pbselectbox.AddCheck2(1, 2, "isclearable", "Clearable")
	pbselectbox.AddCheck2(2, 1, "isvisible", "Visible")
	pbselectbox.AddCheck2(2, 2, "isdisabled", "Disabled")
	pbselectbox.AddCheck2(3, 1, "ismultiple", "Multiple")
	pbselectbox.AddCheck2(3, 2, "ontable", "On Table")
	pbselectbox.AddCheck2(4, 1, "issolo", "Solo")
	pbselectbox.AddCheck2(4, 2, "isoutlined", "Outlined")
	pbselectbox.AddCheck2(5, 1, "isfilled", "Filled")
	pbselectbox.AddCheck2(5, 2, "isdense", "Dense")
	pbselectbox.AddCheck2(6, 1, "issingleline", "Single Line")
	pbselectbox.AddCheck2(6, 2, "ispersistenthint", "Persistent Hint")
	pbselectbox.AddCheck2(7, 1, "isshaped", "Shaped - FOS")
	pbselectbox.AddCheck2(7, 2, "isloading", "Loading")
	pbselectbox.AddCheck2(8, 1, "isflat", "Flat - Solo")
	pbselectbox.AddCheck2(8, 2, "isrounded", "Rounded - FOS")
	pbselectbox.AddCheck2(9, 1, "ishidedetails", "Hide Details")
	pbselectbox.AddCheck2(9, 2, "useoptions", "Use Options")
	pbselectbox.AddCheck2(10, 1, "isreturnobject", "Return Object")
	pbselectbox.AddCheck2(10, 2, "ischips", "Chips")
	pbselectbox.AddCheck2(11, 1, "issmallchips", "Small Chips")
	pbselectbox.AddCheck2(11, 2, "isdeletablechips", "Deletable Chips")
	pbselectbox.SetChecks("d")
	
	pbselectbox.AddMatrix("d")
	'
	pbselectbox.AddButton("d", "btnSaveSelect", "Save", "savePropertyBag")
	pbselectbox.AddButton("d", "btnDeleteSelect", "Delete", "deletePropertyBag")
	vm.container.AddComponent(1, 3, pbselectbox.tostring)
End Sub
#End Region

#Region Parallax
Sub PropertyBag_Parallax
	vm.setdata("pbparallax", False)
	pbparallax = vm.CreateProperty("ppbparallax", Me)
	pbparallax.SetVShow("pbparallax")
	pbparallax.AddHeading("d","Details")
	pbparallax.AddText("d","id","ID","","")
	pbparallax.AddText("d", "controltype", "Type", "","parallax")
	pbparallax.AddText("d","vmodel","ID","","")
	pbparallax.AddText("d","height","Height","","500")
	pbparallax.AddText("d","src","Src","","./assets/material.jpg")
	pbparallax.AddText("d","alt","Alt","","")
	
	pbparallax.AddCheck2(1, 1, "isvisible", "Visible")
	pbparallax.SetChecks("d")
	pbparallax.AddMatrix("d")
	'
	pbparallax.AddButton("d", "btnSaveParallax", "Save", "savePropertyBag")
	pbparallax.AddButton("d", "btnDeleteParallax", "Delete", "deletePropertyBag")
	vm.container.AddComponent(1, 3, pbparallax.tostring)
End Sub
#End Region

#Region Container
Sub PropertyBag_Container
	vm.setdata("pbcontainer", False)
	pbcontainer = vm.CreateProperty("ppbcontainer", Me)
	pbcontainer.SetVShow("pbcontainer")
	pbcontainer.AddHeading("d","Details")
	pbcontainer.AddText("d","id","ID","","")
	pbcontainer.AddText("d", "controltype", "Type", "","container")
	pbcontainer.AddText("d","vmodel","ID","","")
	pbcontainer.AddSelect("d","elevation","Elevation",vm.elevation)
	pbcontainer.AddSelect("d","transition","Transition",vm.Transition)
	pbcontainer.AddText("d","borderradius","Border Radius","","")
	pbcontainer.AddText("d","borderwidth","Border Width","","")
	pbcontainer.AddSelect("d","bordercolor","Border Color", vm.ColorOptions)
	pbcontainer.AddSelect("d","borderstyle","Border Style",vm.BorderOptions)
	pbcontainer.AddSelect("d","color","Color", vm.ColorOptions)
	pbcontainer.AddSelect("d","intensity","Intensity", vm.IntensityOptions)
	'
	pbcontainer.AddCheck2(1, 1, "isvisible", "Visible")
	pbcontainer.AddCheck2(1, 2, "isfluid", "Fluid")
	pbcontainer.AddCheck2(2, 1, "isshowmatrix", "Show Matrix")
	pbcontainer.AddCheck2(2, 2, "isnogutters", "No Gutters")
	pbcontainer.SetChecks("d")
	'
	pbcontainer.AddHeightWidths("d")
	pbcontainer.AddMatrix("d")
	'
	pbcontainer.AddButton("d", "btnSaveContainer", "Save", "savePropertyBag")
	pbcontainer.AddButton("d", "btnDeleteContainer", "Delete", "deletePropertyBag")
	vm.container.AddComponent(1, 3, pbcontainer.tostring)
End Sub
#End Region



#Region Label Property Bag
Sub PropertyBag_Label
	vm.setdata("pblabel", False)
	pblabel = vm.CreateProperty("ppblabel", Me)
	pblabel.SetVShow("pblabel")
	pblabel.AddHeading("d","Details")
	pblabel.AddText("d","id","ID","","")
	pblabel.AddText("d", "controltype", "Type", "","label")
	pblabel.AddText("d","vmodel","VModel","","")
	pblabel.AddSelect("d", "labelsize", "Size", CreateMap("p":"Paragraph","h1":"H1", "h2":"H2", "h3":"H3", "h4":"H4", "h5":"H5","h6":"H6","span":"span","blockquote":"blockquote"))
	
	pblabel.AddTextArea("d","value","Text","","")
	pblabel.AddSelect("d","textcolor","Text Color", vm.ColorOptions)
	pblabel.AddSelect("d","textintensity","Text Intensity", vm.IntensityOptions)
	pblabel.AddSelect("d", "display", "Display", vm.DisplayOptions)
	pblabel.AddSelect("d", "align", "Text Align", vm.TextAlignmentOptions)
	pblabel.AddSelect("d", "fontweight", "Font Weight", vm.FontWeightOptions)
	
	pblabel.AddCheck2(1, 1, "isvisible", "Visible")
	pblabel.AddCheck2(1, 2, "ontable", "On Table")
	pblabel.AddCheck2(2, 1, "isitalic", "Italic")
	pblabel.SetChecks("d")
	pblabel.AddMatrix("d")
	'
	pblabel.AddButton("d", "btnSaveLabel", "Save", "savePropertyBag")
	pblabel.AddButton("d", "btnDeleteLabel", "Delete", "deletePropertyBag")
	vm.container.AddComponent(1, 3, pblabel.tostring)
End Sub
#End Region

#Region TxtBox Property Bag
Sub PropertyBag_TextField
		
	vm.setdata("pbtextfield", False)
	pbtextfield = vm.CreateProperty("ppbtextfield", Me)
	pbtextfield.SetVShow("pbtextfield")
	pbtextfield.AddHeading("d","Details")
	pbtextfield.AddText("d","id","ID","","")
	pbtextfield.AddSelect("d", "controltype", "Type", controltypes)
	pbtextfield.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbtextfield.AddText("d","vmodel","VModel","","")
	pbtextfield.AddText("d","label","Label","","")
	pbtextfield.AddText("d","icon","Icon Name","","")
	pbtextfield.AddText("d", "value", "Value","","")
	pbtextfield.AddText("d", "placeholder","Placeholder","","")
	pbtextfield.AddText("d","helpertext","Helper Text","","")
	pbtextfield.AddText("d","errortext","Error Text","","")
	pbtextfield.AddNumber("d","tabindex","Tab Index","","")
	pbtextfield.AddTel("d","maxlength","Max Length/Counter","","")
	'
	pbtextfield.AddCheck2(1, 1, "isrequired", "Required")
	pbtextfield.AddCheck2(1, 2, "isclearable", "Clearable")
	pbtextfield.AddCheck2(2, 1, "isvisible", "Visible")
	pbtextfield.AddCheck2(2, 2, "isdisabled", "Disabled")
	pbtextfield.AddCheck2(3, 1, "isautogrow", "Autogrow")
	pbtextfield.AddCheck2(3, 2, "ontable", "On Table")
	pbtextfield.AddCheck2(4, 1, "issolo", "Solo")
	pbtextfield.AddCheck2(4, 2, "isoutlined", "Outlined")
	pbtextfield.AddCheck2(5, 1, "isfilled", "Filled")
	pbtextfield.AddCheck2(5, 2, "isdense", "Dense")
	pbtextfield.AddCheck2(6, 1, "issingleline", "Single Line")
	pbtextfield.AddCheck2(6, 2, "ispersistenthint", "Persistent Hint")
	pbtextfield.AddCheck2(7, 1, "isshaped", "Shaped - FOS")
	pbtextfield.AddCheck2(7, 2, "isloading", "Loading")
	pbtextfield.AddCheck2(8, 1, "isflat", "Flat - Solo")
	pbtextfield.AddCheck2(8, 2, "isrounded", "Rounded - FOS")
	pbtextfield.AddCheck2(9, 1, "ishidedetails", "Hide Details")
	pbtextfield.AddCheck2(9, 2, "istoggle", "Show Toggle Icons")
	pbtextfield.SetChecks("d")
	
	pbtextfield.AddMatrix("d")
	pbtextfield.AddButton("d", "btnSaveText", "Save", "savePropertyBag")
	pbtextfield.AddButton("d", "btnDelete", "Delete", "deletePropertyBag")
	'pbtextfield.AddButton("d", "btnClone", "Clone", "clonePropertyBag")
	'
	Dim txtCode As String = pbtextfield.tostring
	vm.Container.AddComponent(1, 3, txtCode)
End Sub
#End Region

Sub ClonePropertyBag

End Sub


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

Sub ppbparallax_change(e As BANanoEvent)
	SavePropertyBag
End Sub

'save the property bag
Sub SavePropertyBag
	'get the saved property bag
	vm.setdata("devspace", 0)
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
	End Select
	'
	Dim sid As String = props.get("id")
	Dim srow As String = props.get("row")
	Dim scol As String = props.get("col")
	Dim stabindex As String = props.get("tabindex")
	Dim slabel As String = props.get("label")
	Dim svmodel As String = props.get("vmodel")
	'
	'is vmodel valid
	Select Case svmodel
		Case "text", "textarea", "checkbox", "date", "file", "radio", "select", "slider", "switch", "label", "email", "password", "tel", "combo", "number", "profile", "auto", "time", "image", "button", "icon", "parallax", "container"
			vm.SnackBar.SetColor("red")
			vm.SnackBar.SetTop(True)
			vm.ShowSnackBar("The vmodel you have specified is internal to the designer, please change it!")
			Return
	End Select
	
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
	nrec.put("label", slabel)
	nrec.put("name", svmodel)
	
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("components", "id")
	rsSQL.RecordFromMap(nrec)
	rsSQL.Update(sid)
	rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	vm.pageresume
	CreateUX
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
	thisBag = thisBag.tolowercase
	Dim m As Map = CreateMap()
	For Each strT As String In lstBags
		m.Put(strT, False)
	Next
	m.Put(thisBag, True)
	vm.SetState(m)
End Sub


	