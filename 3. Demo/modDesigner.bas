﻿B4J=true
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
	Private pbswitchbox As VMProperty   	'done
	Private pbradiogroup As VMProperty  	'done
	Private pbselectbox As VMProperty		'done
	Private pbslider As VMProperty			'done
	Private pbicon As VMProperty			'done
	Private pbbutton As VMProperty			'done
	Private pblabel As VMProperty			'done
	Private pbimage As VMProperty			'done
	Private lstBags As List
	Private avatarMap As Map
	Private controltypes As Map
	Private fieldtypes As Map
	Private dnd As VMContainer
	Private tabs As VMTabs
	Private b4x As VMContainer
	Private html5 As VMContainer
End Sub


Sub Init
	controltypes = CreateMap("number":"number", "text":"text", "tel":"tel", "email":"email","password":"password", "textarea":"textarea", "date":"date", "time":"time", "select":"select", "combo":"combo", "auto":"auto","file":"file","profile":"profile","image":"image","button":"button")
	fieldtypes = CreateMap("string":"string", "int":"int", "bool":"bool", "date":"date","dbl":"float")
				
	lstBags.Initialize
	lstBags.Add("pbtextfield")
	lstBags.Add("pbdatepicker")
	lstBags.Add("pbcheckbox")
	lstBags.add("pbswitchbox")
	lstBags.Add("pbradiogroup")
	lstBags.add("pbselectbox")
	lstBags.add("pbslider")
	lstBags.Add("pbicon")
	lstBags.add("pbbutton")
	lstBags.Add("pblabel")
	lstBags.Add("pbimage")
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
	'
	vm.navbar.AddDivider(True, Null, Null, Array("mx-2"), Null)
	'
	vm.NavBar.AddIcon("btnBack", "chevron_left", "Back to demo", "")
	'
	BuildDrawer
	'
	vm.Container.SetFluid(True)
	vm.setdata("myux", Array())
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
	
	DesignLayout
	'add property bags
	PropertyBag_TextField   'ok
	PropertyBag_DatePicker  'ok
	PropertyBag_CheckBox
	PropertyBag_Switch
	PropertyBag_RadioGroup
	PropertyBag_Select    'ok
	PropertyBag_Slider
	PropertyBag_Label
	PropertyBag_Image
	PropertyBag_Icon
	PropertyBag_Button
	'
	CreateUX(gridSQL, compSQL)
	
	AddPages
		
	vm.UX
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

Sub CreateUX(gridSQL As BANanoAlaSQLE, compSQL As BANanoAlaSQLE)
	Dim sb As StringBuilder
	sb.initialize
	'
	'make it a div
	ui = vm.CreateContainer("ui", Me).SetTag("div")
	'ui.SetStatic(True)
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
	For Each rec As Map In compSQL.result
		Dim controltype As String = rec.get("controltype")
		Dim srow As String = rec.getdefault("row","0")
		If srow = "" Then srow = "1"
		srow = BANano.parseint(srow)
		Dim scol As String = rec.getdefault("col","0")
		If scol = "" Then scol = "1"
		scol = BANano.parseint(scol)
		Dim stabindex As String = rec.getdefault("tabindex","0")
		If stabindex = "" Then stabindex = "0"
		stabindex = BANano.parseint(stabindex)
		Dim sname As String = rec.get("name")
		Dim svmodel As String = rec.get("vmodel")
		Dim sattributes As String = rec.get("attributes")
		Dim sstyles As String = rec.get("styles")
		Dim sclasses As String = rec.get("classes")
		Dim sloose As String = rec.get("loose")
		Dim stitle As String = rec.get("label")
		Dim sfieldtype As String = rec.getdefault("fieldtype", "")
		
		' get the attributes
		Dim mattr As Map = BANano.FromJson(sattributes)
		Dim os As String = mattr.get("offsetsmall")
		Dim om As String = mattr.get("offsetmedium")
		Dim ol As String = mattr.get("offsetlarge")
		Dim ox As String = mattr.get("offsetxlarge")
		'
		Dim ss As String = mattr.get("sizesmall")
		Dim sm As String = mattr.get("sizemedium")
		Dim sl As String = mattr.get("sizelarge")
		Dim sx As String = mattr.get("sizexlarge")
		'
		Dim splaceholder As String = mattr.getdefault("placeholder", "")
		Dim brequired As Boolean = YesNoToBoolean(mattr.getdefault("isrequired", "No"))
		Dim sicon As String = mattr.GetDefault("icon", "")
		Dim shelpertext As String = mattr.getdefault("helpertext", "")
		Dim serrortext As String = mattr.getdefault("errortext", "")
		Dim imaxlen As String = mattr.getdefault("maxlength", "0")
		If imaxlen = "" Then imaxlen = "0"
		imaxlen = BANano.parseint(imaxlen)
		Dim bautogrow As Boolean = YesNoToBoolean(mattr.getdefault("isautogrow", "No"))
		Dim svalue As String = mattr.getdefault("defaultvalue", "")
		Dim scheckedvalue As String = mattr.getdefault("checkedvalue", "Yes")
		Dim suncheckedvalue As String = mattr.getdefault("checkedvalue", "No")
		Dim bPrimary As Boolean = YesNoToBoolean(mattr.getdefault("isprimary", "No"))
		Dim optionsm As Map = CreateMap("f":"Female","m":"Male")
		Dim bisvisible As Boolean = YesNoToBoolean(mattr.getdefault("isvisible", "No"))
		Dim bisdisabled As Boolean = YesNoToBoolean(mattr.getdefault("isdisabled", "No"))
		Dim bontable As Boolean = YesNoToBoolean(mattr.getdefault("ontable", "No"))
			'
		Dim bissolo As Boolean = YesNoToBoolean(mattr.getdefault("issolo", "No"))
		Dim bisoutlined As Boolean = YesNoToBoolean(mattr.getdefault("isoutlined", "No"))
		Dim bisfilled As Boolean = YesNoToBoolean(mattr.getdefault("isfilled", "No"))
		Dim bisdense As Boolean = YesNoToBoolean(mattr.getdefault("isdense", "No"))
		Dim bissingleline As Boolean = YesNoToBoolean(mattr.getdefault("issingleline", "No"))
		Dim bispersistenthint As Boolean = YesNoToBoolean(mattr.getdefault("ispersistenthint", "No"))
		Dim bisshaped As Boolean = YesNoToBoolean(mattr.getdefault("isshaped", "No"))
		Dim bisloading As Boolean = YesNoToBoolean(mattr.getdefault("isloading", "No"))
		Dim bisflat As Boolean = YesNoToBoolean(mattr.getdefault("isflat", "No"))
		Dim bisrounded As Boolean = YesNoToBoolean(mattr.getdefault("isrounded", "No"))
		Dim bclearable As Boolean = YesNoToBoolean(mattr.getdefault("isclearable", "No"))
		Dim bishidedetails As Boolean = YesNoToBoolean(mattr.getdefault("ishidedetails", "No"))
		Dim bToggle As Boolean = YesNoToBoolean(mattr.getdefault("istoggle", "No"))
		'
		Dim swidth As String = mattr.getdefault("width", "")
		Dim sheight As String = mattr.getdefault("height", "")
		Dim sminwidth As String = mattr.getdefault("minwidth", "")
		Dim sminheight As String = mattr.getdefault("minheight", "")
		Dim smaxwidth As String = mattr.getdefault("maxwidth", "")
		Dim smaxheight As String = mattr.getdefault("maxheight", "")
		'
		Dim stooltip As String = mattr.getdefault("tooltip", "")
		Dim scolor As String = mattr.getdefault("color", "")
		Dim sintensity As String = mattr.getdefault("intensity", "")
		'
		Dim stextcolor As String = mattr.getdefault("textcolor", "")
		Dim stextintensity As String = mattr.getdefault("textintensity", "")
		'
		Dim bShowLabel As Boolean = True
		Dim bLabelOnTop As Boolean = True
		Dim bMultiple As Boolean = False
		Dim sidfield As String = "id"
		Dim sdisplayfield As String = "text"
		Dim bReturnObject As Boolean = False
		Dim smaxvalue As String = "0"
		Dim sminvalue As String = "100"
		Dim labelsize As String = vm.SIZE_P
		Dim bstatic As Boolean = True
		'
		Select Case controltype
		Case "text"
			Dim txt As VMTextField = vm.NewTextField(Me, True, sname, svmodel, stitle, splaceholder, brequired, sicon, imaxlen, shelpertext, serrortext, stabindex)
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
sb.append($"Dim txt${sname} As VMTextField = vm.NewTextField(Me, ${bstatic}, "txt${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${brequired}, "${sicon}", ${imaxlen}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
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
			'
		Case "textarea"
				Dim txta As VMTextField = vm.NewTextArea(Me, True, sname, svmodel, stitle, splaceholder, brequired, bautogrow, sicon, imaxlen, shelpertext, serrortext, stabindex)
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
				sb.append($"Dim txta${sname} As VMTextField = vm.NewTextArea(Me, ${bstatic}, "txta${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${brequired}, ${bautogrow}, "${sicon}", ${imaxlen}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)

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
			'
		Case "checkbox"
			Dim chk As VMCheckBox = vm.NewCheckBox(Me, True, sname, svmodel, stitle, svalue, suncheckedvalue, bPrimary, stabindex)
					chk.setstatic(True)
			ui.AddControl(chk.checkbox, chk.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
			'
sb.append($"Dim chk${sname} As VMCheckBox = vm.NewCheckBox(Me, ${bstatic}, "chk${sname}", "${svmodel}", "${stitle}", "${svalue}", "${suncheckedvalue}", ${bPrimary}, ${stabindex})
.Container.AddControl(chk${sname}.CheckBox, chk${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
			'
		Case "date"
			Dim dp As VMDateTimePicker = vm.NewDatePicker(Me, True, sname, svmodel, stitle, brequired, splaceholder, shelpertext, serrortext, stabindex)
			ui.AddControl(dp.DateTimePicker, dp.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
			'
sb.append($"Dim dp${sname} As VMDateTimePicker = vm.NewDatePicker(Me, ${bstatic}, "dp${sname}", "${svmodel}", "${stitle}", ${brequired}, "${splaceholder}", "${shelpertext}", "${serrortext}", ${stabindex})
.Container.AddControl(dp${sname}.DateTimePicker, dp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
			'
		Case "file"
				Dim fi As VMTextField = vm.NewFileInput(Me, True, sname, svmodel, stitle, splaceholder, brequired, shelpertext, serrortext, stabindex)
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
			
				sb.append($"Dim fi${sname} As VMTextField = vm.NewFileInput(Me, ${bstatic}, "fi${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${brequired}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
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
		Case "radio"
			Dim rd As VMRadioGroup = vm.NewRadioGroup(Me, True, sname, svmodel, stitle, svalue, optionsm, bShowLabel, bLabelOnTop, stabindex)
					rd.setstatic(True)
			
			ui.AddControl(rd.RadioGroup, rd.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
			'
sb.append($"Dim rd${sname} As VMRadioGroup = vm.NewRadioGroup(Me, ${bstatic}, "rd${sname}", "rd${svmodel}", "${stitle}", "${svalue}", optionsm, ${bShowLabel}, ${bLabelOnTop}, ${stabindex})
.Container.AddControl(rd${sname}.RadioGroup, rd${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
			'
		Case "select"
			Dim sel As VMSelect = vm.NewSelectOptions(Me, True, sname, svmodel, stitle, brequired, bMultiple, splaceholder, optionsm, sidfield, sdisplayfield, bReturnObject, shelpertext, serrortext, stabindex)
					sel.setstatic(True)
			ui.AddControl(sel.Combo, sel.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
			'
sb.append($"Dim sel${sname} As VMSelect = vm.NewSelectOptions(Me, ${bstatic}, "sel${sname}", "${svmodel}", "${stitle}", ${brequired}, ${bMultiple}, "${splaceholder}", optionsm, "${sidfield}", "${sdisplayfield}", ${bReturnObject}, "${shelpertext}", "${serrortext}", ${stabindex})
.Container.AddControl(sel${sname}.Combo, sel${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
			'
		Case "slider"
			Dim sld As VMSlider = vm.newslider(Me, True, sname, svmodel, stitle, sminvalue, smaxvalue, stabindex)
					'sld.setstatic(True)
			ui.AddControl(sld.slider, sld.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
			'
sb.append($"Dim sld${sname} As VMSlider = vm.newSlider(Me, ${bstatic}, "sld${sname}", "${svmodel}", "${stitle}", ${sminvalue}, ${smaxvalue}, ${stabindex})
.Container.AddControl(sld${sname}.Slider, sld${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
			'
		Case "switch"
			Dim swt As VMSwitch = vm.NewSwitch(Me, True, sname, svmodel, stitle, svalue, suncheckedvalue, bPrimary, stabindex)
					'swt.setstatic(True)
			ui.AddControl(swt.SwitchBox, swt.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
			'
sb.append($"Dim swt${sname} As VMSwitch = vm.NewSwitch(Me, ${bstatic}, "swt${sname}", "${svmodel}", "${stitle}", "${svalue}", "${suncheckedvalue}", ${bPrimary}, ${stabindex})
.Container.AddControl(swt${sname}.SwitchBox, swt${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
			'
		Case "label"
			Dim lbl As VMLabel =vm.NewLabel(True, sname, svmodel, labelsize, stitle)
					'lbl.setstatic(True)
			ui.AddControl(lbl.Label, lbl.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
			'
sb.append($"Dim lbl${sname} As VMLabel =vm.NewLabel(${bstatic}, "lbl${sname}", "${svmodel}", "${labelsize}", "${stitle}")
.Container.AddControl(lbl${sname}.Label, lbl${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
'
		Case "email"
				Dim email As VMTextField = vm.NewEmail(Me, True, sname, svmodel, stitle, splaceholder, brequired, sicon, shelpertext, serrortext, stabindex)
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
				sb.append($"Dim email${sname} As VMTextField = vm.NewEmail(Me, ${bstatic}, "email${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${brequired}, "${sicon}", "${shelpertext}", "${serrortext}", ${stabindex})"$).Append(CRLF)

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
		Case "password"
				Dim pwd As VMTextField = vm.NewPassword(Me, True, sname, svmodel, stitle, splaceholder, brequired, bToggle, sicon, imaxlen, shelpertext, serrortext, stabindex)
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
				sb.append($"Dim pwd${sname} As VMTextField = vm.NewPassword(Me, ${bstatic}, "pwd${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${brequired}, ${bToggle}, "${sicon}", ${imaxlen}, "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)
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
		Case "tel"
				Dim tel As VMTextField = vm.NewTel(Me, True, sname, svmodel, stitle, splaceholder, brequired, sicon, shelpertext, serrortext, stabindex)
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
				sb.append($"Dim tel${sname} As VMTextField = vm.NewTel(Me, ${bstatic}, "tel${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${brequired}, "${sicon}", "${shelpertext}", "${serrortext}", ${stabindex})"$).append(CRLF)

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
		Case "combo"
			Dim cbo As VMSelect = vm.newComboOptions(Me, True, sname, svmodel,stitle, brequired, bMultiple, splaceholder, optionsm, sidfield, sdisplayfield, bReturnObject, shelpertext, serrortext, stabindex)
					'cbo.setstatic(True)
			ui.AddControl(cbo.Combo, cbo.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
			'
sb.append($"Dim cbo${sname} As VMSelect = vm.newComboOptions(Me, ${bstatic}, "cbo${sname}", "${svmodel}", "${stitle}", ${brequired}, ${bMultiple}, "${splaceholder}", optionsm, "${sidfield}", "${sdisplayfield}", ${bReturnObject}, "${shelpertext}", "${serrortext}", ${stabindex})
.Container.AddControl(cbo${sname}.Combo, cbo${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
			'
		Case "time"
			Dim tp As VMDateTimePicker = vm.newtimepicker(Me, True, sname, svmodel, stitle, brequired, splaceholder, shelpertext, serrortext, stabindex)
			'tp.setstatic(True)
			ui.AddControl(tp.DateTimePicker, tp.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
			'
				sb.append($"Dim tp${sname} As VMDateTimePicker = vm.newtimepicker(Me, ${bstatic}, "tp${sname}", "${svmodel}", "${stitle}", ${brequired}, "${splaceholder}", "${shelpertext}", "${serrortext}", ${stabindex})
			.Container.AddControl(tp${sname}.DateTimePicker, tp${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
			'
		Case "profile", "image"
			Dim ssrc As String = mattr.getdefault("src", "")
			Dim slazysrc As String = mattr.getdefault("lazysrc", "")
			Dim salt As String = mattr.getdefault("alt","")
			Dim sborderradius As String = mattr.getdefault("borderradius","")
			Dim sborderwidth As String = mattr.getdefault("borderwidth","")
			Dim sbordercolor As String = mattr.getdefault("bordercolor", "")
			Dim sborderstyle As String = mattr.getdefault("borderstyle", "")
			Dim saspectratio As String = mattr.getdefault("aspectratio", "")
						'	
			Dim img As VMImage = vm.NewImage(Me, True, sname, svmodel, ssrc, salt, swidth, sheight)
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
			ui.AddControl(img.Image, img.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
			'
sb.append($"Dim img${sname} As VMImage = vm.NewImage(Me, ${bstatic}, "img${sname}", "${svmodel}", "${ssrc}", "${salt}", "${swidth}", "${sheight}")"$).append(CRLF)
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
sb.append($".Container.AddControl(img${sname}.Image, img${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
			'
		Case "auto"
			Dim auto As VMSelect = vm.NewAutoCompleteOptions(Me, True, sname, svmodel, stitle, splaceholder, bMultiple, splaceholder, optionsm, sidfield, sdisplayfield, bReturnObject, shelpertext, serrortext, stabindex)
					'auto.setstatic(True)
			ui.AddControl(auto.Combo, auto.tostring, srow, scol, os, om, ol, ox, ss, sm, sl, sx)
			'
sb.append($"Dim auto${sname} As VMSelect = vm.NewAutoCompleteOptions(Me, ${bstatic}, "auto${sname}", "${svmodel}", "${stitle}", "${splaceholder}", ${bMultiple}, "${splaceholder}", optionsm, "${sidfield}", "${sdisplayfield}", ${bReturnObject}, "${shelpertext}", "${serrortext}", ${stabindex})
.Container.AddControl(auto${sname}.Combo, auto${sname}.tostring, ${srow}, ${scol}, ${os}, ${om}, ${ol}, ${ox}, ${ss}, ${sm}, ${sl}, ${sx})"$).append(CRLF).append(CRLF)
				'
		Case "button"
			Dim bfitwidth As Boolean = YesNoToBoolean(mattr.getdefault("isfitwidth", "No"))
			Dim shref As String = mattr.getdefault("href","")
			Dim starget As String = mattr.getdefault("target","")
			Dim sto As String = mattr.getdefault("to","")
			Dim bistext As Boolean = YesNoToBoolean(mattr.getdefault("istext", "No"))
			Dim biconbutton As String = YesNoToBoolean(mattr.getdefault("isiconbutton", "No"))
			Dim bfabbutton As String = YesNoToBoolean(mattr.getdefault("isfabbutton", "No"))
			Dim bisdepressed As String = YesNoToBoolean(mattr.getdefault("isdepressed", "No"))
			Dim bisdark As String = YesNoToBoolean(mattr.getdefault("isdark", "No"))
			Dim bistile As String = YesNoToBoolean(mattr.getdefault("istile", "No"))
			Dim ssize As String = mattr.GetDefault("size", "")
			
			If biconbutton Then stitle = ""
			If bfabbutton Then stitle = ""
			Dim btn As VMButton = vm.NewButton(Me, True, sname, stitle, True, bPrimary, False, bfitwidth)
			btn.Sethref(shref)
			btn.SetTarget(starget)
			btn.setto(sto)
			btn.SetTooltip(stooltip)
			btn.SetColorIntensity(scolor, sintensity)
			btn.SetTextColorIntensity(stextcolor, stextintensity)
			btn.SetDisabled(bisdisabled)
			btn.Setoutlined(bisoutlined)
			btn.SetRounded(bisrounded)
			btn.SetTransparent(bistext)
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
				
sb.append($"Dim btn${sname} As VMButton = vm.NewButton(Me, True, "${sname}", "${stitle}", True, ${bPrimary}, False, ${bfitwidth})"$).append(CRLF)
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
		End Select
	Next
	
	Dim html As String = ui.tostring
	Dim shtml As String = vm.BeautifySourceCode("html", html)
	'save grid source code
	BANano.SetSessionStorage("sourcecode", sb.tostring)
	BANano.SetSessionStorage("html", shtml)
	'drag and drop preview area
	dnd.AddComponent(1, 1, shtml)
	'b4x code
	Dim pc As VMPrism = vm.CreatePrism("b4xcode", Me)
	pc.SetLanguage("vb").SetCode(sb.tostring)
	b4x.AddComponent(1, 1, pc.tostring)
	
	'html code
	Dim htm As VMPrism = vm.CreatePrism("htmlcode", Me)
	htm.SetLanguage("html").SetCode(shtml)
	html5.AddComponent(1, 1, htm.tostring)
	'
	tabs.AddTab("dndrea", "Drag n Drop / Preview", "mdi-drag-variant", dnd)
	tabs.AddTab("b4xarea", "B4X", "code", b4x)
	tabs.AddTab("htmlarea", "HTML", "mdi-language-html5", html5)
	vm.container.AddComponent(1, 2, tabs.tostring)
	
	'vm.Container.AddComponent(1, 2, html)
End Sub

Sub CodeLine(sb As StringBuilder, varName As String, varType As String, prefix As String, sname As String, methodName As String)
	Select Case varType
	Case "b"
		If varName Then sb.append($"${prefix}${sname}.${methodName}(${varName})"$).append(CRLF)
	Case "s"
		If varName <> "" Then sb.append($"${prefix}${sname}.${methodName}("${varName}")"$).append(CRLF)
	End Select
End Sub

Sub BuildDrawer
	
End Sub

Sub btnRefresh_click(e As BANanoEvent)
	Init
	'CreateUI
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
		Init	
	Case "btnhasborder"
		vm.togglestate("hasborder")
		bHasBorder = vm.getdata("hasborder")
		If bHasBorder = True Then
			BANano.setlocalstorage("hasborder", True)
		Else
			BANano.setlocalstorage("hasborder", False)
		End If
		Init
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
	Init
	'CreateUI
End Sub

'clear the contents of the grid
Sub ClearComp
	vm.pagepause
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("components", "id")
	rsSQL.DeleteAll
	rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	vm.pageresume
	Init
	'CreateUI
End Sub

'remove last grid item
Sub RemoveLastGridItem
	vm.pagepause
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
	Init
	'CreateUI
End Sub

'clear the contents of the grid
Sub ClearGrid
	vm.pagepause
	Dim db As BANanoSQL
	Dim rsSQL As BANanoAlaSQLE
	db.OpenWait("bvmdesigner", "bvmdesigner")
	rsSQL.Initialize("grid", "id")
	rsSQL.DeleteAll
	rsSQL.result = db.executewait(rsSQL.query, rsSQL.args)
	vm.pageresume
	Init
	'CreateUI
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
	Dim page As VMExpansionPanel = GridPage
	ep.AddPanel(page)
	'
	vm.container.AddComponent(1, 1, ep.tostring)
	'
	tabs = vm.CreateTabs("tabs", Me).SetGrow(True).SetIconsAndText(True).SetCentered(True).SetVModel("devspace")
	tabs.OnToolBar = False
	'
	dnd = vm.CreateContainer("dnd", Me).SetFluid(True)
	dnd.AddRows(1).AddColumns12
	'
	b4x = vm.CreateContainer("b4x", Me).SetFluid(True)
	b4x.AddRows(1).AddColumns12
	'
	html5 = vm.CreateContainer("html5", Me).SetFluid(True)
	html5.AddRows(1).AddColumns12
	'	
	'Dim dc As VMElement = vm.CreateDynamicContent("dc")
	'vm.container.AddComponent(1, 2, dc.tostring)
End Sub
'

Sub GridPage As VMExpansionPanel
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
		ShowBag("pbswitchbox")
		pbswitchbox.SetDefaults
		pbswitchbox.hideitem("id")
		pbswitchbox.Hideitem("controltype")
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
	End Select
	'
	Dim mattr As Map = BANano.FromJson(sattributes)
	'DONT OVERWRITE
	Select Case stypeof
		Case "text", "textarea", "date", "file", "select", "email", "password","tel", "combo", "number", "auto", "time", "image", "profile", "button"
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
			"switch", "label", "email", "password", "tel", "combo", "number", "profile", "auto", "time", "image", "button"
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
			attr.put("ontable", "Yes")
			attr.put("maxlength", 0)
			'
			Select Case savedid
			Case "password"
				attr.put("istoggle", "Yes")
			Case "profile"
				attr.put("borderradius", "50%")
				attr.put("borderwidth", "1px")
				attr.put("bordercolor", "black")
				attr.put("borderstyle", "solid")
				attr.put("src", "./assets/sponge.png")
				attr.put("width", "150")
				attr.put("height", "150")
				BANano.SetLocalStorage("selectedpanel", 1)
			Case "image"
				attr.put("src", "./assets/bird.jpg")
				BANano.SetLocalStorage("selectedpanel", 1)
			Case "button"
				BANano.SetLocalStorage("selectedpanel", 3)
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
		Init
	End Select
End Sub

#Region Slider Property Bag
Sub PropertyBag_Slider
	vm.setdata("pbslider",False)
	pbslider = vm.CreateProperty("ppbslider", Me)
	pbslider.SetVShow("pbslider")
	pbslider.AddHeading("d","Details")
	pbslider.AddText("d","id","ID","","")
	pbslider.AddText("d", "controltype", "Type", "", "slider")
	pbslider.AddText("d","vmodel","VModel","","")
	pbslider.AddText("d","label","Label","","")
	pbslider.AddText("d", "value", "Value","","20")
	pbslider.AddText("d", "minvalue", "Min Value","","0")
	pbslider.AddText("d", "maxvalue", "Max Value","","100")
		
	pbslider.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbslider.AddNumber("d","tabindex","Tab Index","","")
	'
	pbslider.AddCheck2(1, 1, "isrequired", "Required")
	pbslider.AddCheck2(1, 2, "isvisible", "Visible")
	pbslider.AddCheck2(2, 1, "isdisabled", "Disabled")
	pbslider.AddCheck2(2, 2, "ontable", "On Table")
	pbslider.AddCheck2(3, 1, "thumblabel", "Show ThumbTable")
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
	
	pbdatepicker.AddNumber("d","tabindex","Tab Index","","")
	pbdatepicker.AddText("d","helpertext","Helper Text","","")
	pbdatepicker.AddText("d","errortext","Error Text","","")
	'
	pbdatepicker.AddCheck2(1, 1, "isrequired", "Required")
	pbdatepicker.AddCheck2(1, 2, "isclearable", "Clearable")
	pbdatepicker.AddCheck2(2, 1, "isvisible", "Visible")
	pbdatepicker.AddCheck2(2, 2, "isdisabled", "Disabled")
	pbdatepicker.AddCheck2(3, 1, "ontable", "On Table")
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
	pbbutton.AddSelect("d", "size", "Size", CreateMap("":"Normal","small":"Small", "large":"Large", "x-small":"X-Small", "x-large":"X-Large"))
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
	pbicon.AddText("d","vmodel","VModel","","")
	pbicon.AddText("d","icon","Icon Name","","thumb_up")
	pbicon.AddSelect("d", "iconsize", "Icon Size", CreateMap("small":"small", "large":"large", "x-small":"x-small", "x-large":"x-large"))
	
	pbicon.AddNumber("d","tabindex","Tab Index","","")
	'
	pbicon.AddCheck2(1, 1, "visible", "Visible")
	pbicon.AddCheck2(1, 2, "ontable", "On Table")
	pbicon.SetChecks("d")
	
	pbicon.AddMatrix("d")
	pbicon.AddButton("d", "btnSaveIcon", "Save", "savePropertyBag")
	pbicon.AddButton("d", "btnDeleteIcon", "Delete", "deletePropertyBag")
	vm.Container.AddComponent(1, 3, pbicon.tostring)
End Sub
#End Region

#Region Switch Property Bag
Sub PropertyBag_Switch
	vm.setdata("pbswitchbox", False)
	pbswitchbox = vm.CreateProperty("ppbswitchbox", Me)
	pbswitchbox.SetVShow("pbswitchbox")
	pbswitchbox.AddHeading("d","Details")
	pbswitchbox.AddText("d","id","ID","","")
	pbswitchbox.AddText("d", "controltype", "Type", "", "switchbox")
	pbswitchbox.AddText("d","vmodel","VModel","","")
	pbswitchbox.AddText("d","label","Label","","")
	pbswitchbox.AddText("d","checkedvalue","Checked Value","","")
	pbswitchbox.AddText("d","uncheckedvalue","Unchecked Value","","")
	
	pbswitchbox.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbswitchbox.AddNumber("d","tabindex","Tab Index","","")
	'
	pbswitchbox.AddCheck2(1, 1, "isrequired", "Required")
	pbswitchbox.AddCheck2(1, 2, "isprimary", "Primary")
	pbswitchbox.AddCheck2(2, 1, "isvisible", "Visible")
	pbswitchbox.AddCheck2(2, 2, "isdisabled", "Disabled")
	pbswitchbox.AddCheck2(3, 1, "ontable", "On Table")
	pbswitchbox.SetChecks("d")
	
	pbswitchbox.AddMatrix("d")
	pbswitchbox.AddButton("d", "btnSaveSwitch", "Save", "savePropertyBag")
	pbswitchbox.AddButton("d", "btnDeleteSwitch", "Delete", "deletePropertyBag")
	vm.container.AddComponent(1, 3, pbswitchbox.tostring)
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
	pbimage.AddSelect("d", "controltype", "Type", controltypes)
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
	pbimage.AddCheck2(1, 1, "visible", "Visible")
	pbimage.AddCheck2(1, 2, "ontable", "On Table")
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
	pbcheckbox.AddText("d", "controltype", "Type", "", "checkbox")
	pbcheckbox.AddText("d","vmodel","VModel","","")
	pbcheckbox.AddText("d","label","Label","","")
	pbcheckbox.AddText("d","checkedvalue","Checked Value","","")
	pbcheckbox.AddText("d","uncheckedvalue","Unchecked Value","","")
	
	pbcheckbox.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbcheckbox.AddNumber("d","tabindex","Tab Index","","")
	'
	pbcheckbox.AddCheck2(1, 1, "isrequired", "Required")
	pbcheckbox.AddCheck2(1, 2, "isprimary", "Primary")
	pbcheckbox.AddCheck2(2, 1, "isvisible", "Visible")
	pbcheckbox.AddCheck2(2, 2, "isdisabled", "Disabled")
	pbcheckbox.AddCheck2(3, 1, "ontable", "On Table")
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
	pbradiogroup.AddText("d", "controltype", "Type", "", "radiogroup")
	pbradiogroup.AddText("d","vmodel","VModel","","")
	pbradiogroup.AddText("d","label","Label","","")
	pbradiogroup.AddText("d","value","Value","","")
	
	pbradiogroup.AddTextArea("d","keys","Keys (,)","", "1,2,3")
	pbradiogroup.AddTextArea("d","values","Values (,)","", "One,Two,Three")
	pbradiogroup.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbradiogroup.AddNumber("d","tabindex","Tab Index","","")
	'
	pbradiogroup.AddCheck2(1, 1, "showlabel", "Show Label")
	pbradiogroup.AddCheck2(1, 2, "labelontop", "Label on Top")
	pbradiogroup.AddCheck2(2, 1, "isvisible", "Visible")
	pbradiogroup.AddCheck2(2, 2, "isdisabled", "Disabled")
	pbradiogroup.AddCheck2(3, 1, "ontable", "On Table")
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
	pbselectbox.AddText("d","vmodel","VModel","","")
	pbselectbox.AddText("d","label","Label","","")
	pbselectbox.AddText("d", "defaultvalue", "Default Value","","")
	pbselectbox.AddText("d","placeholder","Placeholder","","")	
	pbselectbox.AddSelect("d", "fieldtype", "Field Type", fieldtypes)
	pbselectbox.AddNumber("d","tabindex","Tab Index","","")
	pbselectbox.AddText("d","helpertext","Helper Text","","")
	pbselectbox.AddText("d","errortext","Error Text","","")
	pbselectbox.AddText("d","sourcetable","Source Table","","")
	pbselectbox.AddText("d","sourcefield","Source Field","","")
	pbselectbox.AddText("d","displayfield","Display Field","","")
	pbselectbox.AddTextArea("d","keys","Keys (,)","", "1,2,3")
	pbselectbox.AddTextArea("d","values","Values (,)", "", "One,Two,Three")
	'
	pbselectbox.AddCheck2(1, 1, "isrequired", "Required")
	pbselectbox.AddCheck2(1, 2, "ismultiple", "Multiple")
	pbselectbox.AddCheck2(2, 1, "isvisible", "Visible")
	pbselectbox.AddCheck2(2, 2, "isdisabled", "Disabled")
	pbselectbox.AddCheck2(3, 1, "ontable", "On Table")
	pbselectbox.AddCheck2(3, 2, "useoptions", "Use Options")
	pbselectbox.SetChecks("d")
	
	pbselectbox.AddMatrix("d")
	'
	pbselectbox.AddButton("d", "btnSaveSelect", "Save", "savePropertyBag")
	pbselectbox.AddButton("d", "btnDeleteSelect", "Delete", "deletePropertyBag")
	vm.container.AddComponent(1, 3, pbselectbox.tostring)
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
	pblabel.AddSelect("d", "size", "Size", CreateMap("p":"Paragraph","h1":"H1", "h2":"H2", "h3":"H3", "h4":"H4", "h5":"H5","h6":"H6","span":"span","blockquote":"blockquote"))
	pblabel.AddTextArea("d","text","Text","","")
	
	pblabel.AddNumber("d","tabindex","Tab Index","","")
	pblabel.AddCheck("d", "visible","Visible", "Yes")
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
	pbtextfield.AddText("d", "defaultvalue", "Default Value","","")
	pbtextfield.AddText("d","placeholder","Placeholder","","")
	
	
	pbtextfield.AddNumber("d","tabindex","Tab Index","","")
	pbtextfield.AddTel("d","maxlength","Max Length/Counter","","")
	pbtextfield.AddText("d","helpertext","Helper Text","","")
	pbtextfield.AddText("d","errortext","Error Text","","")
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
	Init
End Sub

'save the property bag
Sub SavePropertyBag
	'get the saved property bag
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
		props = pbswitchbox.properties
	Case "label"
		props = pblabel.properties
	Case "profile", "image"
		props = pbimage.Properties
	Case "button"
		props = pbbutton.properties
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
	Case "text", "textarea", "checkbox", "date", "file", "radio", "select", "slider", "switch", "label", "email", "password", "tel", "combo", "number", "profile", "auto", "time", "image", _
	"button"
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
	Init
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


	