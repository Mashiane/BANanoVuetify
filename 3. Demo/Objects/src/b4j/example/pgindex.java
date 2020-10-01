package b4j.example;


import anywheresoftware.b4a.BA;

public class pgindex extends Object{
public static pgindex mostCurrent = new pgindex();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgindex", null);
		ba.loadHtSubs(pgindex.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgindex", ba);
		}
	}
    public static Class<?> getObject() {
		return pgindex.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.bananovm _vm = null;
public static b4j.example.bananovue _vue = null;
public static b4j.example.main _main = null;
public static b4j.example.moditemgroups _moditemgroups = null;
public static b4j.example.modcalendar _modcalendar = null;
public static b4j.example.modcard _modcard = null;
public static b4j.example.modsparkline _modsparkline = null;
public static b4j.example.modbuttons _modbuttons = null;
public static b4j.example.modchips _modchips = null;
public static b4j.example.moddialog _moddialog = null;
public static b4j.example.modbadges _modbadges = null;
public static b4j.example.modtabs _modtabs = null;
public static b4j.example.modalert _modalert = null;
public static b4j.example.modautocomplete _modautocomplete = null;
public static b4j.example.modavatar _modavatar = null;
public static b4j.example.modbanner _modbanner = null;
public static b4j.example.modbottomnavigation _modbottomnavigation = null;
public static b4j.example.modbottomsheet _modbottomsheet = null;
public static b4j.example.modbreadcrumbs _modbreadcrumbs = null;
public static b4j.example.modcarousel _modcarousel = null;
public static b4j.example.modcheckbox _modcheckbox = null;
public static b4j.example.modcolorpicker _modcolorpicker = null;
public static b4j.example.modcombo _modcombo = null;
public static b4j.example.moddatatable _moddatatable = null;
public static b4j.example.moddatepicker _moddatepicker = null;
public static b4j.example.moddesign _moddesign = null;
public static b4j.example.modexpansionpanels _modexpansionpanels = null;
public static b4j.example.modfileinput _modfileinput = null;
public static b4j.example.modform _modform = null;
public static b4j.example.modgrid _modgrid = null;
public static b4j.example.modicons _modicons = null;
public static b4j.example.modimages _modimages = null;
public static b4j.example.modlists _modlists = null;
public static b4j.example.modloadingskeleton _modloadingskeleton = null;
public static b4j.example.modmenus _modmenus = null;
public static b4j.example.modmessageboard _modmessageboard = null;
public static b4j.example.modoverlay _modoverlay = null;
public static b4j.example.modpagination _modpagination = null;
public static b4j.example.modparallax _modparallax = null;
public static b4j.example.modprogress _modprogress = null;
public static b4j.example.modradiogroups _modradiogroups = null;
public static b4j.example.modrating _modrating = null;
public static b4j.example.modrealtimelogging _modrealtimelogging = null;
public static b4j.example.modselects _modselects = null;
public static b4j.example.modslidegroups _modslidegroups = null;
public static b4j.example.modslider _modslider = null;
public static b4j.example.modsnackbar _modsnackbar = null;
public static b4j.example.modstepper _modstepper = null;
public static b4j.example.modswitch _modswitch = null;
public static b4j.example.modtextarea _modtextarea = null;
public static b4j.example.modtextfield _modtextfield = null;
public static b4j.example.modtimeline _modtimeline = null;
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtoolkit _modtoolkit = null;
public static b4j.example.modtreeview _modtreeview = null;
public static b4j.example.modwindow _modwindow = null;
public static b4j.example.pgbrs _pgbrs = null;
public static b4j.example.bananoshared _bananoshared = null;
public static String  _about_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Sub about_click(e As BANanoEvent)";
 //BA.debugLineNum = 399;BA.debugLine="vm.ShowSnackBar(\"About!\")";
_vm._showsnackbar /*String*/ ("About!");
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return "";
}
public static String  _addpages() throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Sub AddPages";
 //BA.debugLineNum = 425;BA.debugLine="vm.AddPage(modButtons.name, modButtons)";
_vm._addpage /*String*/ (_modbuttons._name /*String*/ ,(Object)(_modbuttons.getObject()));
 //BA.debugLineNum = 426;BA.debugLine="vm.AddPage(modCombo.name, modCombo)";
_vm._addpage /*String*/ (_modcombo._name /*String*/ ,(Object)(_modcombo.getObject()));
 //BA.debugLineNum = 427;BA.debugLine="vm.AddPage(modFileInput.name, modFileInput)";
_vm._addpage /*String*/ (_modfileinput._name /*String*/ ,(Object)(_modfileinput.getObject()));
 //BA.debugLineNum = 428;BA.debugLine="vm.AddPage(modForm.name, modForm)";
_vm._addpage /*String*/ (_modform._name /*String*/ ,(Object)(_modform.getObject()));
 //BA.debugLineNum = 429;BA.debugLine="vm.AddPage(modSelects.name, modSelects)";
_vm._addpage /*String*/ (_modselects._name /*String*/ ,(Object)(_modselects.getObject()));
 //BA.debugLineNum = 430;BA.debugLine="vm.AddPage(modCheckBox.name, modCheckBox)";
_vm._addpage /*String*/ (_modcheckbox._name /*String*/ ,(Object)(_modcheckbox.getObject()));
 //BA.debugLineNum = 431;BA.debugLine="vm.AddPage(modSwitch.name, modSwitch)";
_vm._addpage /*String*/ (_modswitch._name /*String*/ ,(Object)(_modswitch.getObject()));
 //BA.debugLineNum = 432;BA.debugLine="vm.AddPage(modRadioGroups.name, modRadioGroups)";
_vm._addpage /*String*/ (_modradiogroups._name /*String*/ ,(Object)(_modradiogroups.getObject()));
 //BA.debugLineNum = 433;BA.debugLine="vm.AddPage(modSlider.name, modSlider)";
_vm._addpage /*String*/ (_modslider._name /*String*/ ,(Object)(_modslider.getObject()));
 //BA.debugLineNum = 434;BA.debugLine="vm.AddPage(modTextArea.name, modTextArea)";
_vm._addpage /*String*/ (_modtextarea._name /*String*/ ,(Object)(_modtextarea.getObject()));
 //BA.debugLineNum = 435;BA.debugLine="vm.AddPage(modTextField.name, modTextField)";
_vm._addpage /*String*/ (_modtextfield._name /*String*/ ,(Object)(_modtextfield.getObject()));
 //BA.debugLineNum = 436;BA.debugLine="vm.AddPage(modImages.name, modImages)";
_vm._addpage /*String*/ (_modimages._name /*String*/ ,(Object)(_modimages.getObject()));
 //BA.debugLineNum = 437;BA.debugLine="vm.AddPage(modSnackBar.name, modSnackBar)";
_vm._addpage /*String*/ (_modsnackbar._name /*String*/ ,(Object)(_modsnackbar.getObject()));
 //BA.debugLineNum = 438;BA.debugLine="vm.AddPage(modLists.name, modLists)";
_vm._addpage /*String*/ (_modlists._name /*String*/ ,(Object)(_modlists.getObject()));
 //BA.debugLineNum = 439;BA.debugLine="vm.AddPage(modDatePicker.name, modDatePicker)";
_vm._addpage /*String*/ (_moddatepicker._name /*String*/ ,(Object)(_moddatepicker.getObject()));
 //BA.debugLineNum = 440;BA.debugLine="vm.AddPage(modTimePicker.name, modTimePicker)";
_vm._addpage /*String*/ (_modtimepicker._name /*String*/ ,(Object)(_modtimepicker.getObject()));
 //BA.debugLineNum = 441;BA.debugLine="vm.AddPage(modAvatar.name, modAvatar)";
_vm._addpage /*String*/ (_modavatar._name /*String*/ ,(Object)(_modavatar.getObject()));
 //BA.debugLineNum = 442;BA.debugLine="vm.AddPage(modBadges.name, modBadges)";
_vm._addpage /*String*/ (_modbadges._name /*String*/ ,(Object)(_modbadges.getObject()));
 //BA.debugLineNum = 443;BA.debugLine="vm.AddPage(modIcons.name, modIcons)";
_vm._addpage /*String*/ (_modicons._name /*String*/ ,(Object)(_modicons.getObject()));
 //BA.debugLineNum = 444;BA.debugLine="vm.AddPage(modGrid.name, modGrid)";
_vm._addpage /*String*/ (_modgrid._name /*String*/ ,(Object)(_modgrid.getObject()));
 //BA.debugLineNum = 445;BA.debugLine="vm.AddPage(modToolbar.name, modToolbar)";
_vm._addpage /*String*/ (_modtoolbar._name /*String*/ ,(Object)(_modtoolbar.getObject()));
 //BA.debugLineNum = 446;BA.debugLine="vm.AddPage(modDialog.name, modDialog)";
_vm._addpage /*String*/ (_moddialog._name /*String*/ ,(Object)(_moddialog.getObject()));
 //BA.debugLineNum = 447;BA.debugLine="vm.AddPage(modMenus.name, modMenus)";
_vm._addpage /*String*/ (_modmenus._name /*String*/ ,(Object)(_modmenus.getObject()));
 //BA.debugLineNum = 448;BA.debugLine="vm.AddPage(modAutoComplete.name, modAutoComplete)";
_vm._addpage /*String*/ (_modautocomplete._name /*String*/ ,(Object)(_modautocomplete.getObject()));
 //BA.debugLineNum = 449;BA.debugLine="vm.AddPage(modChips.name, modChips)";
_vm._addpage /*String*/ (_modchips._name /*String*/ ,(Object)(_modchips.getObject()));
 //BA.debugLineNum = 450;BA.debugLine="vm.AddPage(modStepper.name, modStepper)";
_vm._addpage /*String*/ (_modstepper._name /*String*/ ,(Object)(_modstepper.getObject()));
 //BA.debugLineNum = 451;BA.debugLine="vm.AddPage(modTabs.name, modTabs)";
_vm._addpage /*String*/ (_modtabs._name /*String*/ ,(Object)(_modtabs.getObject()));
 //BA.debugLineNum = 452;BA.debugLine="vm.addpage(modDataTable.name, modDataTable)";
_vm._addpage /*String*/ (_moddatatable._name /*String*/ ,(Object)(_moddatatable.getObject()));
 //BA.debugLineNum = 453;BA.debugLine="vm.AddPage(modDesign.name, modDesign)";
_vm._addpage /*String*/ (_moddesign._name /*String*/ ,(Object)(_moddesign.getObject()));
 //BA.debugLineNum = 454;BA.debugLine="vm.AddPage(modBanner.name, modBanner)";
_vm._addpage /*String*/ (_modbanner._name /*String*/ ,(Object)(_modbanner.getObject()));
 //BA.debugLineNum = 455;BA.debugLine="vm.AddPage(modTreeView.name, modTreeView)";
_vm._addpage /*String*/ (_modtreeview._name /*String*/ ,(Object)(_modtreeview.getObject()));
 //BA.debugLineNum = 456;BA.debugLine="vm.AddPage(modBottomNavigation.name, modBottomNav";
_vm._addpage /*String*/ (_modbottomnavigation._name /*String*/ ,(Object)(_modbottomnavigation.getObject()));
 //BA.debugLineNum = 457;BA.debugLine="vm.AddPage(modBottomSheet.name, modBottomSheet)";
_vm._addpage /*String*/ (_modbottomsheet._name /*String*/ ,(Object)(_modbottomsheet.getObject()));
 //BA.debugLineNum = 458;BA.debugLine="vm.AddPage(modAlert.name, modAlert)";
_vm._addpage /*String*/ (_modalert._name /*String*/ ,(Object)(_modalert.getObject()));
 //BA.debugLineNum = 459;BA.debugLine="vm.AddPage(modCarousel.name, modCarousel)";
_vm._addpage /*String*/ (_modcarousel._name /*String*/ ,(Object)(_modcarousel.getObject()));
 //BA.debugLineNum = 460;BA.debugLine="vm.AddPage(modMessageBoard.name, modMessageBoard)";
_vm._addpage /*String*/ (_modmessageboard._name /*String*/ ,(Object)(_modmessageboard.getObject()));
 //BA.debugLineNum = 461;BA.debugLine="vm.AddPage(modExpansionPanels.name, modExpansionP";
_vm._addpage /*String*/ (_modexpansionpanels._name /*String*/ ,(Object)(_modexpansionpanels.getObject()));
 //BA.debugLineNum = 462;BA.debugLine="vm.addpage(modParallax.name, modParallax)";
_vm._addpage /*String*/ (_modparallax._name /*String*/ ,(Object)(_modparallax.getObject()));
 //BA.debugLineNum = 463;BA.debugLine="vm.addpage(modColorPicker.name, modColorPicker)";
_vm._addpage /*String*/ (_modcolorpicker._name /*String*/ ,(Object)(_modcolorpicker.getObject()));
 //BA.debugLineNum = 464;BA.debugLine="vm.addpage(modRating.name, modRating)";
_vm._addpage /*String*/ (_modrating._name /*String*/ ,(Object)(_modrating.getObject()));
 //BA.debugLineNum = 465;BA.debugLine="vm.AddPage(modLoadingSkeleton.name, modLoadingSke";
_vm._addpage /*String*/ (_modloadingskeleton._name /*String*/ ,(Object)(_modloadingskeleton.getObject()));
 //BA.debugLineNum = 466;BA.debugLine="vm.AddPage(modTimeLine.name, modTimeLine)";
_vm._addpage /*String*/ (_modtimeline._name /*String*/ ,(Object)(_modtimeline.getObject()));
 //BA.debugLineNum = 467;BA.debugLine="vm.AddPage(modSparkLine.name, modSparkLine)";
_vm._addpage /*String*/ (_modsparkline._name /*String*/ ,(Object)(_modsparkline.getObject()));
 //BA.debugLineNum = 468;BA.debugLine="vm.AddPage(modCard.name, modCard)";
_vm._addpage /*String*/ (_modcard._name /*String*/ ,(Object)(_modcard.getObject()));
 //BA.debugLineNum = 469;BA.debugLine="vm.AddPage(modBreadCrumbs.name, modBreadCrumbs)";
_vm._addpage /*String*/ (_modbreadcrumbs._name /*String*/ ,(Object)(_modbreadcrumbs.getObject()));
 //BA.debugLineNum = 470;BA.debugLine="vm.AddPage(modPagination.name, modPagination)";
_vm._addpage /*String*/ (_modpagination._name /*String*/ ,(Object)(_modpagination.getObject()));
 //BA.debugLineNum = 471;BA.debugLine="vm.AddPage(modProgress.name, modProgress)";
_vm._addpage /*String*/ (_modprogress._name /*String*/ ,(Object)(_modprogress.getObject()));
 //BA.debugLineNum = 472;BA.debugLine="vm.AddPage(modOverlay.name, modOverlay)";
_vm._addpage /*String*/ (_modoverlay._name /*String*/ ,(Object)(_modoverlay.getObject()));
 //BA.debugLineNum = 473;BA.debugLine="vm.AddPage(modRealtimeLogging.name, modRealtimeLo";
_vm._addpage /*String*/ (_modrealtimelogging._name /*String*/ ,(Object)(_modrealtimelogging.getObject()));
 //BA.debugLineNum = 474;BA.debugLine="vm.AddPage(modCalendar.name, modCalendar)";
_vm._addpage /*String*/ (_modcalendar._name /*String*/ ,(Object)(_modcalendar.getObject()));
 //BA.debugLineNum = 475;BA.debugLine="vm.AddPage(modToolkit.name, modToolkit)";
_vm._addpage /*String*/ (_modtoolkit._name /*String*/ ,(Object)(_modtoolkit.getObject()));
 //BA.debugLineNum = 476;BA.debugLine="vm.AddPage(pgBRs.name, pgBRs)";
_vm._addpage /*String*/ (_pgbrs._name /*String*/ ,(Object)(_pgbrs.getObject()));
 //BA.debugLineNum = 477;BA.debugLine="vm.AddPage(modItemGroups.name, modItemGroups)";
_vm._addpage /*String*/ (_moditemgroups._name /*String*/ ,(Object)(_moditemgroups.getObject()));
 //BA.debugLineNum = 478;BA.debugLine="vm.AddPage(modSlideGroups.name, modSlideGroups)";
_vm._addpage /*String*/ (_modslidegroups._name /*String*/ ,(Object)(_modslidegroups.getObject()));
 //BA.debugLineNum = 479;BA.debugLine="vm.AddPage(modWindow.name, modWindow)";
_vm._addpage /*String*/ (_modwindow._name /*String*/ ,(Object)(_modwindow.getObject()));
 //BA.debugLineNum = 480;BA.debugLine="End Sub";
return "";
}
public static String  _alert_ok(com.ab.banano.BANanoEvent _e) throws Exception{
String _sproc = "";
 //BA.debugLineNum = 199;BA.debugLine="Sub alert_ok(e As BANanoEvent)";
 //BA.debugLineNum = 200;BA.debugLine="Dim sproc As String = vm.GetAlert";
_sproc = _vm._getalert /*String*/ ();
 //BA.debugLineNum = 201;BA.debugLine="Select Case sproc";
switch (BA.switchObjectToInt(_sproc,"alertuser")) {
case 0: {
 //BA.debugLineNum = 203;BA.debugLine="vm.ShowSnackBar(\"Selected alert user!\")";
_vm._showsnackbar /*String*/ ("Selected alert user!");
 break; }
default: {
 //BA.debugLineNum = 205;BA.debugLine="vm.ShowSnackBar(sproc)";
_vm._showsnackbar /*String*/ (_sproc);
 break; }
}
;
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public static String  _bottomnav_change(Object _value) throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Private Sub bottomnav_change(value As Object)";
 //BA.debugLineNum = 483;BA.debugLine="vm.ShowSnackBarSuccess(value)";
_vm._showsnackbarsuccess /*String*/ (BA.ObjectToString(_value));
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return "";
}
public static String  _btnbutton_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 420;BA.debugLine="Sub btnButton_click(e As BANanoEvent)";
 //BA.debugLineNum = 421;BA.debugLine="vm.ShowSnackBar(\"Button click...\")";
_vm._showsnackbar /*String*/ ("Button click...");
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return "";
}
public static String  _btnheart_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Sub btnHeart_click(e As BANanoEvent)";
 //BA.debugLineNum = 417;BA.debugLine="vm.ShowSnackBar(\"My heart...\")";
_vm._showsnackbar /*String*/ ("My heart...");
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return "";
}
public static String  _builddrawer() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub BuildDrawer";
 //BA.debugLineNum = 82;BA.debugLine="vm.Drawer.Show";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._show /*b4j.example.vmnavigationdrawer*/ ();
 //BA.debugLineNum = 95;BA.debugLine="vm.Drawer.SetOpenOnMediumLarge(True)";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._setopenonmediumlarge /*b4j.example.vmnavigationdrawer*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 97;BA.debugLine="vm.Drawer.List.SetDense(True)";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._list /*b4j.example.vmlist*/ ._setdense /*b4j.example.vmlist*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 98;BA.debugLine="vm.Drawer.SetWidth(\"300\")";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._setwidth /*b4j.example.vmnavigationdrawer*/ ("300");
 //BA.debugLineNum = 99;BA.debugLine="vm.Drawer.AddTitleSubTitle(\"BANanoVuetifyCore\", $";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addtitlesubtitle /*b4j.example.vmnavigationdrawer*/ ("BANanoVuetifyCore",("Version "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_main._version /*String*/ ))+""));
 //BA.debugLineNum = 100;BA.debugLine="vm.Drawer.AddDivider";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._adddivider /*b4j.example.vmnavigationdrawer*/ ();
 //BA.debugLineNum = 102;BA.debugLine="vm.Drawer.AddParentChild(\"\",\"styles\", \"\", \"\", \"St";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("","styles","","","Styles & Animations","");
 //BA.debugLineNum = 103;BA.debugLine="vm.Drawer.AddParentChild(\"styles\",\"borders\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("styles","borders","","","Borders & Radius","");
 //BA.debugLineNum = 104;BA.debugLine="vm.Drawer.AddParentChild(\"styles\",\"itemgroups\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("styles","itemgroups","","","Item Groups","");
 //BA.debugLineNum = 105;BA.debugLine="vm.Drawer.AddParentChild(\"styles\",\"slidegroups\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("styles","slidegroups","","","Slide Groups","");
 //BA.debugLineNum = 106;BA.debugLine="vm.Drawer.AddParentChild(\"styles\",\"windows\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("styles","windows","","","Windows","");
 //BA.debugLineNum = 108;BA.debugLine="vm.Drawer.AddParentChild(\"\",\"ui\", \"\", \"\", \"UI Com";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("","ui","","","UI Components","");
 //BA.debugLineNum = 109;BA.debugLine="vm.Drawer.AddParentChild(\"ui\",\"alerts\", \"\", \"\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","alerts","","","Alerts","");
 //BA.debugLineNum = 110;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"avatars\", \"\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","avatars","","","Avatars","");
 //BA.debugLineNum = 111;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"badges\", \"\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","badges","","","Badges","");
 //BA.debugLineNum = 112;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"banners\", \"\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","banners","","","Banners","");
 //BA.debugLineNum = 113;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"bottomnavigation\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","bottomnavigation","","","Bottom Navigation","");
 //BA.debugLineNum = 114;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"bottomsheets\", \"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","bottomsheets","","","Bottom Sheets","");
 //BA.debugLineNum = 115;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"breadcrumbs\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","breadcrumbs","","","Breadcrumbs","");
 //BA.debugLineNum = 116;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"buttons\", \"\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","buttons","","","Buttons","");
 //BA.debugLineNum = 117;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"calendar\", \"\", \"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","calendar","","","Calendar","");
 //BA.debugLineNum = 118;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"cards\", \"\", \"\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","cards","","","Cards","");
 //BA.debugLineNum = 119;BA.debugLine="vm.drawer.AddParentChild(\"ui\", \"carousel\", \"\",\"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","carousel","","","Carousel","");
 //BA.debugLineNum = 120;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"chips\", \"\", \"\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","chips","","","Chips","");
 //BA.debugLineNum = 121;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"dialogs\", \"\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","dialogs","","","Dialogs","");
 //BA.debugLineNum = 122;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"expansionpanel\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","expansionpanel","","","Expansion Panel","");
 //BA.debugLineNum = 124;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"icons\", \"\", \"\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","icons","","","Icons","");
 //BA.debugLineNum = 125;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"images\", \"\",\"\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","images","","","Images","");
 //BA.debugLineNum = 127;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"lists\", \"\", \"\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","lists","","","Lists","");
 //BA.debugLineNum = 128;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"menus\", \"\", \"\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","menus","","","Menus","");
 //BA.debugLineNum = 129;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"overlays\", \"\", \"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","overlays","","","Overlays","");
 //BA.debugLineNum = 130;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"pagination\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","pagination","","","Paginations","");
 //BA.debugLineNum = 131;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"parallax\", \"\", \"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","parallax","","","Parallax","");
 //BA.debugLineNum = 132;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"progress\", \"\", \"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","progress","","","Progress","");
 //BA.debugLineNum = 133;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"modLoadingSkeleto";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","modLoadingSkeleton","","","Skeleton Loaders","");
 //BA.debugLineNum = 134;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"snackbars\", \"\",\"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","snackbars","","","Snackbars","");
 //BA.debugLineNum = 135;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"sparklines\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","sparklines","","","Sparklines","");
 //BA.debugLineNum = 136;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"steppers\", \"\", \"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","steppers","","","Steppers","");
 //BA.debugLineNum = 137;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"tables\", \"\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","tables","","","Tables","");
 //BA.debugLineNum = 138;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"tabs\", \"\", \"\", \"T";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","tabs","","","Tabs","");
 //BA.debugLineNum = 139;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"timelines\", \"\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","timelines","","","Timelines","");
 //BA.debugLineNum = 140;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"toolbars\", \"\", \"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","toolbars","","","Toolbars","");
 //BA.debugLineNum = 141;BA.debugLine="vm.Drawer.AddParentChild(\"ui\", \"treeview\", \"\", \"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("ui","treeview","","","TreeView","");
 //BA.debugLineNum = 143;BA.debugLine="vm.Drawer.AddParentChild(\"\", \"forms\", \"\", \"\", \"Fo";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("","forms","","","Form Inputs","");
 //BA.debugLineNum = 144;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"autocomplete\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","autocomplete","","","Auto Complete","");
 //BA.debugLineNum = 145;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"checkbox\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","checkbox","","","Check Box","");
 //BA.debugLineNum = 146;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"combo\", \"\", \"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","combo","","","Combo Box","");
 //BA.debugLineNum = 147;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"colorpicker\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","colorpicker","","","Color Picker","");
 //BA.debugLineNum = 148;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"datepicker\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","datepicker","","","Date Picker","");
 //BA.debugLineNum = 149;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"fileinput\", \"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","fileinput","","","File Input","");
 //BA.debugLineNum = 150;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"form\", \"\",\"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","form","","","Form","");
 //BA.debugLineNum = 151;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"radiogroups\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","radiogroups","","","Radio Groups","");
 //BA.debugLineNum = 152;BA.debugLine="vm.drawer.AddParentChild(\"forms\", \"rating\", \"\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","rating","","","Rating","");
 //BA.debugLineNum = 153;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"selects\", \"\",\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","selects","","","Selects","");
 //BA.debugLineNum = 154;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"switch\", \"\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","switch","","","Switch","");
 //BA.debugLineNum = 155;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"slider\", \"\",\"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","slider","","","Slider","");
 //BA.debugLineNum = 156;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"textarea\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","textarea","","","Text Area","");
 //BA.debugLineNum = 157;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"textfield\", \"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","textfield","","","Text Field","");
 //BA.debugLineNum = 158;BA.debugLine="vm.Drawer.AddParentChild(\"forms\", \"timepicker\", \"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("forms","timepicker","","","Time Picker","");
 //BA.debugLineNum = 160;BA.debugLine="vm.Drawer.AddParentChild(\"\", \"grid\", \"\", \"\", \"Gri";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("","grid","","","Grid Design","");
 //BA.debugLineNum = 161;BA.debugLine="vm.Drawer.AddParentChild(\"grid\", \"grids\", \"\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("grid","grids","","","Grids","");
 //BA.debugLineNum = 162;BA.debugLine="vm.Drawer.AddParentChild(\"grid\", \"design\", \"\", \"\"";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("grid","design","","","Grid Design","");
 //BA.debugLineNum = 164;BA.debugLine="vm.Drawer.AddParentChild(\"\", \"examples\", \"\", \"\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("","examples","","","Examples","");
 //BA.debugLineNum = 165;BA.debugLine="vm.drawer.AddParentChild(\"examples\", \"messageboar";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("examples","messageboard","","","Message Board","");
 //BA.debugLineNum = 166;BA.debugLine="vm.drawer.AddParentChild(\"examples\", \"reallogs\",";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._addparentchild /*b4j.example.vmnavigationdrawer*/ ("examples","reallogs","","","Realtime Logging","");
 //BA.debugLineNum = 173;BA.debugLine="vm.drawer.Refresh";
_vm._drawer /*b4j.example.vmnavigationdrawer*/ ._refresh /*String*/ ();
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public static String  _buildfooter() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub BuildFooter";
 //BA.debugLineNum = 71;BA.debugLine="vm.Footer.SHow";
_vm._footer /*b4j.example.vmfooter*/ ._show /*b4j.example.vmfooter*/ ();
 //BA.debugLineNum = 72;BA.debugLine="vm.Footer.SetFixed(True)";
_vm._footer /*b4j.example.vmfooter*/ ._setfixed /*b4j.example.vmfooter*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 73;BA.debugLine="vm.Footer.SetColor(\"indigo\")";
_vm._footer /*b4j.example.vmfooter*/ ._setcolor /*b4j.example.vmfooter*/ ("indigo");
 //BA.debugLineNum = 74;BA.debugLine="vm.footer.Container.SetTag(\"div\")";
_vm._footer /*b4j.example.vmfooter*/ ._container /*b4j.example.vmcontainer*/ ._settag /*b4j.example.vmcontainer*/ ("div");
 //BA.debugLineNum = 75;BA.debugLine="vm.footer.Container.AddRows(1).AddColumns12";
_vm._footer /*b4j.example.vmfooter*/ ._container /*b4j.example.vmcontainer*/ ._addrows /*b4j.example.vmcontainer*/ ((int) (1))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 76;BA.debugLine="vm.Footer.Container.SetAttrRC(1, 0, \"align\", \"cen";
_vm._footer /*b4j.example.vmfooter*/ ._container /*b4j.example.vmcontainer*/ ._setattrrc /*b4j.example.vmcontainer*/ ((int) (1),(int) (0),"align","center");
 //BA.debugLineNum = 77;BA.debugLine="vm.Footer.AddMadeWithLove(1, 1, \"with B4J, BANana";
_vm._footer /*b4j.example.vmfooter*/ ._addmadewithlove /*String*/ ((int) (1),(int) (1),"with B4J, BANanano & BANanoVuetify by","TheMash","mbanga.anele@gmail.com");
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _buildnavbar() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub BuildNavBar";
 //BA.debugLineNum = 41;BA.debugLine="vm.NavBar.AddHamburger";
_vm._navbar /*b4j.example.vmtoolbar*/ ._addhamburger /*b4j.example.vmtoolbar*/ ();
 //BA.debugLineNum = 42;BA.debugLine="vm.NavBar.Hamburger.SetVisible(True)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._hamburger /*b4j.example.vmelement*/ ._setvisible /*b4j.example.vmelement*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 46;BA.debugLine="vm.NavBar.Logo.SetBorderRadius(\"50%\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._logo /*b4j.example.vmimage*/ ._setborderradius /*b4j.example.vmimage*/ ("50%");
 //BA.debugLineNum = 47;BA.debugLine="vm.NavBar.Logo.SetBorderWidth(\"1px\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._logo /*b4j.example.vmimage*/ ._setborderwidth /*b4j.example.vmimage*/ ("1px");
 //BA.debugLineNum = 48;BA.debugLine="vm.NavBar.Logo.SetBorderColor(\"black\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._logo /*b4j.example.vmimage*/ ._setbordercolor /*b4j.example.vmimage*/ ("black");
 //BA.debugLineNum = 49;BA.debugLine="vm.NavBar.Logo.SetBorderStyle(\"solid\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._logo /*b4j.example.vmimage*/ ._setborderstyle /*b4j.example.vmimage*/ ("solid");
 //BA.debugLineNum = 50;BA.debugLine="vm.NavBar.Logo.SetSize(\"46px\",\"46px\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._logo /*b4j.example.vmimage*/ ._setsize /*b4j.example.vmimage*/ ("46px","46px");
 //BA.debugLineNum = 51;BA.debugLine="vm.NavBar.AddLogo(\"./assets/sponge.png\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._addlogo /*b4j.example.vmtoolbar*/ ("./assets/sponge.png");
 //BA.debugLineNum = 52;BA.debugLine="vm.NavBar.Logo.Show";
_vm._navbar /*b4j.example.vmtoolbar*/ ._logo /*b4j.example.vmimage*/ ._show /*b4j.example.vmimage*/ ();
 //BA.debugLineNum = 53;BA.debugLine="vm.NavBar.AddTitle(Main.AppTitle,\"\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._addtitle /*b4j.example.vmtoolbar*/ (_main._apptitle /*String*/ ,"");
 //BA.debugLineNum = 54;BA.debugLine="vm.NavBar.AddSubHeading1(Main.Version)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._addsubheading1 /*b4j.example.vmtoolbar*/ (_main._version /*String*/ );
 //BA.debugLineNum = 55;BA.debugLine="vm.NavBar.AddSpacer";
_vm._navbar /*b4j.example.vmtoolbar*/ ._addspacer /*b4j.example.vmtoolbar*/ ();
 //BA.debugLineNum = 56;BA.debugLine="vm.NavBar.SetVisible(True)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._setvisible /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 57;BA.debugLine="vm.NavBar.SetModeFixed(True)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._setmodefixed /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 58;BA.debugLine="vm.NavBar.SetColorIntensity(vm.COLOR_DEEPPURPLE,";
_vm._navbar /*b4j.example.vmtoolbar*/ ._setcolorintensity /*b4j.example.vmtoolbar*/ (_vm._color_deeppurple /*String*/ ,_vm._intensity_accent4 /*String*/ );
 //BA.debugLineNum = 59;BA.debugLine="vm.NavBar.SetDark(True)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._setdark /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 61;BA.debugLine="vm.NavBar.AddSearch(\"txtsearch\")";
_vm._navbar /*b4j.example.vmtoolbar*/ ._addsearch /*b4j.example.vmtoolbar*/ ("txtsearch");
 //BA.debugLineNum = 62;BA.debugLine="vm.NavBar.AddIcon(\"btnHeart\", \"mdi-heart\", \"My he";
_vm._navbar /*b4j.example.vmtoolbar*/ ._addicon /*b4j.example.vmtoolbar*/ ("btnHeart","mdi-heart","My heart","");
 //BA.debugLineNum = 63;BA.debugLine="vm.NavBar.AddIcon(\"btnButton\", \"mdi-magnify\", \"My";
_vm._navbar /*b4j.example.vmtoolbar*/ ._addicon /*b4j.example.vmtoolbar*/ ("btnButton","mdi-magnify","My button","");
 //BA.debugLineNum = 65;BA.debugLine="vm.NavBar.SetSrc(\"https://picsum.photos/1920/1080";
_vm._navbar /*b4j.example.vmtoolbar*/ ._setsrc /*b4j.example.vmtoolbar*/ ("https://picsum.photos/1920/1080?random");
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _confirm_cancel(com.ab.banano.BANanoEvent _e) throws Exception{
String _sproc = "";
 //BA.debugLineNum = 190;BA.debugLine="Sub confirm_cancel(e As BANanoEvent)";
 //BA.debugLineNum = 191;BA.debugLine="Dim sproc As String = vm.GetConfirm";
_sproc = _vm._getconfirm /*String*/ ();
 //BA.debugLineNum = 192;BA.debugLine="Select Case sproc";
switch (BA.switchObjectToInt(_sproc,"")) {
case 0: {
 break; }
}
;
 //BA.debugLineNum = 195;BA.debugLine="vm.ShowSnackBar(sproc)";
_vm._showsnackbar /*String*/ (_sproc);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public static String  _confirm_ok(com.ab.banano.BANanoEvent _e) throws Exception{
String _sproc = "";
 //BA.debugLineNum = 179;BA.debugLine="Sub confirm_ok(e As BANanoEvent)";
 //BA.debugLineNum = 180;BA.debugLine="Dim sproc As String = vm.GetConfirm";
_sproc = _vm._getconfirm /*String*/ ();
 //BA.debugLineNum = 181;BA.debugLine="Select Case sproc";
switch (BA.switchObjectToInt(_sproc,"promptuser")) {
case 0: {
 //BA.debugLineNum = 183;BA.debugLine="vm.ShowSnackBar(\"Yes, use Vuetify!\")";
_vm._showsnackbar /*String*/ ("Yes, use Vuetify!");
 break; }
default: {
 //BA.debugLineNum = 185;BA.debugLine="vm.ShowSnackBar(sproc)";
_vm._showsnackbar /*String*/ (_sproc);
 break; }
}
;
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public static b4j.example.vmprism  _createvbcode(b4j.example.bananovue _vuex,Object _module,String _codeid,String _stitle,String _scode) throws Exception{
b4j.example.vmprism _pri = null;
 //BA.debugLineNum = 486;BA.debugLine="Sub CreateVBCode(vuex As BANanoVue, module As Obje";
 //BA.debugLineNum = 487;BA.debugLine="scode = scode.Replace(\"~\", \"$\")";
_scode = _scode.replace("~","$");
 //BA.debugLineNum = 488;BA.debugLine="Dim pri As VMPrism";
_pri = new b4j.example.vmprism();
 //BA.debugLineNum = 489;BA.debugLine="pri.Initialize(vuex, codeID, module)";
_pri._initialize /*b4j.example.vmprism*/ (ba,_vuex,_codeid,_module);
 //BA.debugLineNum = 490;BA.debugLine="pri.SetLanguage(\"vb\")";
_pri._setlanguage /*b4j.example.vmprism*/ ("vb");
 //BA.debugLineNum = 491;BA.debugLine="pri.SetTitle(sTitle)";
_pri._settitle /*String*/ (_stitle);
 //BA.debugLineNum = 492;BA.debugLine="pri.SetCode(scode)";
_pri._setcode /*b4j.example.vmprism*/ (_scode);
 //BA.debugLineNum = 493;BA.debugLine="Return pri";
if (true) return _pri;
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return null;
}
public static String  _dashboard_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Sub dashboard_click(e As BANanoEvent)";
 //BA.debugLineNum = 391;BA.debugLine="vm.ShowSnackBar(\"Dashboard!\")";
_vm._showsnackbar /*String*/ ("Dashboard!");
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return "";
}
public static String  _drafs_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub drafs_click(e As BANanoEvent)";
 //BA.debugLineNum = 408;BA.debugLine="vm.ShowSnackBar(\"Drafts!\")";
_vm._showsnackbar /*String*/ ("Drafts!");
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return "";
}
public static String  _draweritems_click(Object _elid) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub draweritems_click(elID As Object)";
 //BA.debugLineNum = 212;BA.debugLine="vm.pageresume";
_vm._pageresume /*String*/ ();
 //BA.debugLineNum = 213;BA.debugLine="vm.BottomNav.Hide";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._hide /*b4j.example.vmbottomnavigation*/ ();
 //BA.debugLineNum = 214;BA.debugLine="modSnackBar.HideSnacks";
_modsnackbar._hidesnacks /*String*/ ();
 //BA.debugLineNum = 216;BA.debugLine="vm.callmethod(\"stop\")";
_vm._callmethod /*String*/ ("stop");
 //BA.debugLineNum = 217;BA.debugLine="Select Case elID";
switch (BA.switchObjectToInt(_elid,(Object)("windows"),(Object)("slidegroups"),(Object)("itemgroups"),(Object)("borders"),(Object)("toolkit"),(Object)("calendar"),(Object)("reallogs"),(Object)("progress"),(Object)("pagination"),(Object)("breadcrumbs"),(Object)("cards"),(Object)("sparklines"),(Object)("timelines"),(Object)("modloadingskeleton"),(Object)("rating"),(Object)("colorpicker"),(Object)("parallax"),(Object)("expansionpanel"),(Object)("messageboard"),(Object)("carousel"),(Object)("alerts"),(Object)("bottomsheets"),(Object)("bottomnavigation"),(Object)("banners"),(Object)("design"),(Object)("tables"),(Object)("treeview"),(Object)("overlays"),(Object)("images"),(Object)("icons"),(Object)("grids"),(Object)("avatars"),(Object)("badges"),(Object)("toolbars"),(Object)("buttons"),(Object)("chips"),(Object)("dialogs"),(Object)("snackbars"),(Object)("checkbox"),(Object)("combo"),(Object)("datepicker"),(Object)("fileinput"),(Object)("form"),(Object)("radiogroups"),(Object)("selects"),(Object)("slider"),(Object)("switch"),(Object)("textarea"),(Object)("textfield"),(Object)("timepicker"),(Object)("menus"),(Object)("autocomplete"),(Object)("lists"),(Object)("steppers"),(Object)("tabs"))) {
case 0: {
 //BA.debugLineNum = 219;BA.debugLine="vm.NavBar.UpdateTitle(modWindow.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modwindow._title /*String*/ );
 //BA.debugLineNum = 220;BA.debugLine="vm.ShowPage(modWindow.name)";
_vm._showpage /*String*/ (_modwindow._name /*String*/ );
 break; }
case 1: {
 //BA.debugLineNum = 222;BA.debugLine="vm.NavBar.UpdateTitle(modSlideGroups.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modslidegroups._title /*String*/ );
 //BA.debugLineNum = 223;BA.debugLine="vm.ShowPage(modSlideGroups.name)";
_vm._showpage /*String*/ (_modslidegroups._name /*String*/ );
 break; }
case 2: {
 //BA.debugLineNum = 225;BA.debugLine="vm.NavBar.UpdateTitle(modItemGroups.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_moditemgroups._title /*String*/ );
 //BA.debugLineNum = 226;BA.debugLine="vm.ShowPage(modItemGroups.name)";
_vm._showpage /*String*/ (_moditemgroups._name /*String*/ );
 break; }
case 3: {
 //BA.debugLineNum = 228;BA.debugLine="vm.NavBar.UpdateTitle(pgBRs.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_pgbrs._title /*String*/ );
 //BA.debugLineNum = 229;BA.debugLine="vm.ShowPage(pgBRs.name)";
_vm._showpage /*String*/ (_pgbrs._name /*String*/ );
 break; }
case 4: {
 //BA.debugLineNum = 231;BA.debugLine="vm.NavBar.UpdateTitle(modToolkit.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modtoolkit._title /*String*/ );
 //BA.debugLineNum = 232;BA.debugLine="vm.ShowPage(modToolkit.name)";
_vm._showpage /*String*/ (_modtoolkit._name /*String*/ );
 //BA.debugLineNum = 233;BA.debugLine="modToolkit.Show";
_modtoolkit._show /*String*/ ();
 break; }
case 5: {
 //BA.debugLineNum = 235;BA.debugLine="vm.NavBar.UpdateTitle(modCalendar.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modcalendar._title /*String*/ );
 //BA.debugLineNum = 236;BA.debugLine="vm.ShowPage(modCalendar.name)";
_vm._showpage /*String*/ (_modcalendar._name /*String*/ );
 break; }
case 6: {
 //BA.debugLineNum = 238;BA.debugLine="vm.NavBar.UpdateTitle(modRealtimeLogging.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modrealtimelogging._title /*String*/ );
 //BA.debugLineNum = 239;BA.debugLine="vm.ShowPage(modRealtimeLogging.name)";
_vm._showpage /*String*/ (_modrealtimelogging._name /*String*/ );
 break; }
case 7: {
 //BA.debugLineNum = 241;BA.debugLine="vm.NavBar.UpdateTitle(modProgress.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modprogress._title /*String*/ );
 //BA.debugLineNum = 242;BA.debugLine="vm.ShowPage(modProgress.name)";
_vm._showpage /*String*/ (_modprogress._name /*String*/ );
 break; }
case 8: {
 //BA.debugLineNum = 244;BA.debugLine="vm.NavBar.UpdateTitle(modPagination.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modpagination._title /*String*/ );
 //BA.debugLineNum = 245;BA.debugLine="vm.ShowPage(modPagination.name)";
_vm._showpage /*String*/ (_modpagination._name /*String*/ );
 break; }
case 9: {
 //BA.debugLineNum = 247;BA.debugLine="vm.NavBar.UpdateTitle(modBreadCrumbs.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modbreadcrumbs._title /*String*/ );
 //BA.debugLineNum = 248;BA.debugLine="vm.ShowPage(modBreadCrumbs.name)";
_vm._showpage /*String*/ (_modbreadcrumbs._name /*String*/ );
 break; }
case 10: {
 //BA.debugLineNum = 250;BA.debugLine="vm.NavBar.UpdateTitle(modCard.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modcard._title /*String*/ );
 //BA.debugLineNum = 251;BA.debugLine="vm.ShowPage(modCard.name)";
_vm._showpage /*String*/ (_modcard._name /*String*/ );
 break; }
case 11: {
 //BA.debugLineNum = 253;BA.debugLine="vm.NavBar.UpdateTitle(modSparkLine.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modsparkline._title /*String*/ );
 //BA.debugLineNum = 254;BA.debugLine="vm.ShowPage(modSparkLine.name)";
_vm._showpage /*String*/ (_modsparkline._name /*String*/ );
 break; }
case 12: {
 //BA.debugLineNum = 256;BA.debugLine="vm.NavBar.UpdateTitle(modTimeLine.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modtimeline._title /*String*/ );
 //BA.debugLineNum = 257;BA.debugLine="vm.ShowPage(modTimeLine.name)";
_vm._showpage /*String*/ (_modtimeline._name /*String*/ );
 break; }
case 13: {
 //BA.debugLineNum = 259;BA.debugLine="vm.NavBar.UpdateTitle(modLoadingSkeleton.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modloadingskeleton._title /*String*/ );
 //BA.debugLineNum = 260;BA.debugLine="vm.ShowPage(modLoadingSkeleton.name)";
_vm._showpage /*String*/ (_modloadingskeleton._name /*String*/ );
 break; }
case 14: {
 //BA.debugLineNum = 262;BA.debugLine="vm.NavBar.UpdateTitle(modRating.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modrating._title /*String*/ );
 //BA.debugLineNum = 263;BA.debugLine="vm.ShowPage(modRating.name)";
_vm._showpage /*String*/ (_modrating._name /*String*/ );
 break; }
case 15: {
 //BA.debugLineNum = 265;BA.debugLine="vm.NavBar.UpdateTitle(modColorPicker.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modcolorpicker._title /*String*/ );
 //BA.debugLineNum = 266;BA.debugLine="vm.ShowPage(modColorPicker.name)";
_vm._showpage /*String*/ (_modcolorpicker._name /*String*/ );
 break; }
case 16: {
 //BA.debugLineNum = 268;BA.debugLine="vm.NavBar.UpdateTitle(modParallax.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modparallax._title /*String*/ );
 //BA.debugLineNum = 269;BA.debugLine="vm.ShowPage(modParallax.name)";
_vm._showpage /*String*/ (_modparallax._name /*String*/ );
 break; }
case 17: {
 //BA.debugLineNum = 271;BA.debugLine="vm.NavBar.UpdateTitle(modExpansionPanels.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modexpansionpanels._title /*String*/ );
 //BA.debugLineNum = 272;BA.debugLine="vm.ShowPage(modExpansionPanels.name)";
_vm._showpage /*String*/ (_modexpansionpanels._name /*String*/ );
 break; }
case 18: {
 //BA.debugLineNum = 274;BA.debugLine="vm.NavBar.UpdateTitle(modMessageBoard.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modmessageboard._title /*String*/ );
 //BA.debugLineNum = 275;BA.debugLine="vm.ShowPage(modMessageBoard.name)";
_vm._showpage /*String*/ (_modmessageboard._name /*String*/ );
 break; }
case 19: {
 //BA.debugLineNum = 277;BA.debugLine="vm.NavBar.UpdateTitle(modCarousel.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modcarousel._title /*String*/ );
 //BA.debugLineNum = 278;BA.debugLine="vm.ShowPage(modCarousel.name)";
_vm._showpage /*String*/ (_modcarousel._name /*String*/ );
 break; }
case 20: {
 //BA.debugLineNum = 280;BA.debugLine="vm.NavBar.UpdateTitle(modAlert.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modalert._title /*String*/ );
 //BA.debugLineNum = 281;BA.debugLine="vm.ShowPage(modAlert.name)";
_vm._showpage /*String*/ (_modalert._name /*String*/ );
 break; }
case 21: {
 //BA.debugLineNum = 283;BA.debugLine="vm.NavBar.UpdateTitle(modBottomSheet.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modbottomsheet._title /*String*/ );
 //BA.debugLineNum = 284;BA.debugLine="vm.ShowPage(modBottomSheet.name)";
_vm._showpage /*String*/ (_modbottomsheet._name /*String*/ );
 break; }
case 22: {
 //BA.debugLineNum = 286;BA.debugLine="vm.BottomNav.Show";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._show /*b4j.example.vmbottomnavigation*/ ();
 //BA.debugLineNum = 287;BA.debugLine="vm.NavBar.UpdateTitle(modBottomNavigation.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modbottomnavigation._title /*String*/ );
 //BA.debugLineNum = 288;BA.debugLine="vm.ShowPage(modBottomNavigation.name)";
_vm._showpage /*String*/ (_modbottomnavigation._name /*String*/ );
 break; }
case 23: {
 //BA.debugLineNum = 290;BA.debugLine="vm.NavBar.UpdateTitle(modBanner.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modbanner._title /*String*/ );
 //BA.debugLineNum = 291;BA.debugLine="vm.ShowPage(modBanner.name)";
_vm._showpage /*String*/ (_modbanner._name /*String*/ );
 break; }
case 24: {
 //BA.debugLineNum = 293;BA.debugLine="vm.NavBar.UpdateTitle(modDesign.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_moddesign._title /*String*/ );
 //BA.debugLineNum = 294;BA.debugLine="vm.ShowPage(modDesign.name)";
_vm._showpage /*String*/ (_moddesign._name /*String*/ );
 break; }
case 25: {
 //BA.debugLineNum = 296;BA.debugLine="vm.NavBar.UpdateTitle(modDataTable.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_moddatatable._title /*String*/ );
 //BA.debugLineNum = 297;BA.debugLine="vm.ShowPage(modDataTable.name)";
_vm._showpage /*String*/ (_moddatatable._name /*String*/ );
 break; }
case 26: {
 //BA.debugLineNum = 299;BA.debugLine="vm.NavBar.UpdateTitle(modTreeView.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modtreeview._title /*String*/ );
 //BA.debugLineNum = 300;BA.debugLine="vm.ShowPage(modTreeView.name)";
_vm._showpage /*String*/ (_modtreeview._name /*String*/ );
 break; }
case 27: {
 //BA.debugLineNum = 302;BA.debugLine="vm.NavBar.UpdateTitle(modOverlay.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modoverlay._title /*String*/ );
 //BA.debugLineNum = 303;BA.debugLine="vm.ShowPage(modOverlay.name)";
_vm._showpage /*String*/ (_modoverlay._name /*String*/ );
 //BA.debugLineNum = 304;BA.debugLine="vm.PagePause";
_vm._pagepause /*String*/ ();
 break; }
case 28: {
 //BA.debugLineNum = 306;BA.debugLine="vm.NavBar.UpdateTitle(modImages.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modimages._title /*String*/ );
 //BA.debugLineNum = 307;BA.debugLine="vm.ShowPage(modImages.name)";
_vm._showpage /*String*/ (_modimages._name /*String*/ );
 break; }
case 29: {
 //BA.debugLineNum = 309;BA.debugLine="vm.NavBar.UpdateTitle(modIcons.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modicons._title /*String*/ );
 //BA.debugLineNum = 310;BA.debugLine="vm.showpage(modIcons.name)";
_vm._showpage /*String*/ (_modicons._name /*String*/ );
 break; }
case 30: {
 //BA.debugLineNum = 312;BA.debugLine="vm.NavBar.UpdateTitle(modGrid.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modgrid._title /*String*/ );
 //BA.debugLineNum = 313;BA.debugLine="vm.ShowPage(modGrid.name)";
_vm._showpage /*String*/ (_modgrid._name /*String*/ );
 break; }
case 31: {
 //BA.debugLineNum = 315;BA.debugLine="vm.NavBar.UpdateTitle(modAvatar.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modavatar._title /*String*/ );
 //BA.debugLineNum = 316;BA.debugLine="vm.ShowPage(modAvatar.name)";
_vm._showpage /*String*/ (_modavatar._name /*String*/ );
 break; }
case 32: {
 //BA.debugLineNum = 318;BA.debugLine="vm.NavBar.UpdateTitle(modBadges.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modbadges._title /*String*/ );
 //BA.debugLineNum = 319;BA.debugLine="vm.ShowPage(modBadges.name)";
_vm._showpage /*String*/ (_modbadges._name /*String*/ );
 break; }
case 33: {
 //BA.debugLineNum = 321;BA.debugLine="vm.NavBar.UpdateTitle(modToolbar.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modtoolbar._title /*String*/ );
 //BA.debugLineNum = 322;BA.debugLine="vm.ShowPage(modToolbar.name)";
_vm._showpage /*String*/ (_modtoolbar._name /*String*/ );
 break; }
case 34: {
 //BA.debugLineNum = 324;BA.debugLine="vm.NavBar.UpdateTitle(modButtons.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modbuttons._title /*String*/ );
 //BA.debugLineNum = 325;BA.debugLine="vm.ShowPage(modButtons.name)";
_vm._showpage /*String*/ (_modbuttons._name /*String*/ );
 break; }
case 35: {
 //BA.debugLineNum = 327;BA.debugLine="vm.NavBar.UpdateTitle(modChips.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modchips._title /*String*/ );
 //BA.debugLineNum = 328;BA.debugLine="vm.ShowPage(modChips.name)";
_vm._showpage /*String*/ (_modchips._name /*String*/ );
 break; }
case 36: {
 //BA.debugLineNum = 330;BA.debugLine="vm.NavBar.UpdateTitle(modDialog.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_moddialog._title /*String*/ );
 //BA.debugLineNum = 331;BA.debugLine="vm.ShowPage(modDialog.name)";
_vm._showpage /*String*/ (_moddialog._name /*String*/ );
 break; }
case 37: {
 //BA.debugLineNum = 333;BA.debugLine="vm.NavBar.UpdateTitle(modSnackBar.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modsnackbar._title /*String*/ );
 //BA.debugLineNum = 334;BA.debugLine="vm.ShowPage(modSnackBar.name)";
_vm._showpage /*String*/ (_modsnackbar._name /*String*/ );
 //BA.debugLineNum = 335;BA.debugLine="modSnackBar.ShowSnacks";
_modsnackbar._showsnacks /*String*/ ();
 break; }
case 38: {
 //BA.debugLineNum = 337;BA.debugLine="vm.NavBar.UpdateTitle(modCheckBox.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modcheckbox._title /*String*/ );
 //BA.debugLineNum = 338;BA.debugLine="vm.ShowPage(modCheckBox.name)";
_vm._showpage /*String*/ (_modcheckbox._name /*String*/ );
 break; }
case 39: {
 //BA.debugLineNum = 340;BA.debugLine="vm.NavBar.UpdateTitle(modCombo.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modcombo._title /*String*/ );
 //BA.debugLineNum = 341;BA.debugLine="vm.ShowPage(modCombo.name)";
_vm._showpage /*String*/ (_modcombo._name /*String*/ );
 break; }
case 40: {
 //BA.debugLineNum = 343;BA.debugLine="vm.NavBar.UpdateTitle(modDatePicker.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_moddatepicker._title /*String*/ );
 //BA.debugLineNum = 344;BA.debugLine="vm.ShowPage(modDatePicker.name)";
_vm._showpage /*String*/ (_moddatepicker._name /*String*/ );
 break; }
case 41: {
 //BA.debugLineNum = 346;BA.debugLine="vm.NavBar.UpdateTitle(modFileInput.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modfileinput._title /*String*/ );
 //BA.debugLineNum = 347;BA.debugLine="vm.ShowPage(modFileInput.name)";
_vm._showpage /*String*/ (_modfileinput._name /*String*/ );
 break; }
case 42: {
 //BA.debugLineNum = 349;BA.debugLine="vm.NavBar.UpdateTitle(modForm.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modform._title /*String*/ );
 //BA.debugLineNum = 350;BA.debugLine="vm.ShowPage(modForm.name)";
_vm._showpage /*String*/ (_modform._name /*String*/ );
 break; }
case 43: {
 //BA.debugLineNum = 352;BA.debugLine="vm.NavBar.UpdateTitle(modRadioGroups.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modradiogroups._title /*String*/ );
 //BA.debugLineNum = 353;BA.debugLine="vm.ShowPage(modRadioGroups.name)";
_vm._showpage /*String*/ (_modradiogroups._name /*String*/ );
 break; }
case 44: {
 //BA.debugLineNum = 355;BA.debugLine="vm.NavBar.UpdateTitle(modSelects.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modselects._title /*String*/ );
 //BA.debugLineNum = 356;BA.debugLine="vm.ShowPage(modSelects.name)";
_vm._showpage /*String*/ (_modselects._name /*String*/ );
 break; }
case 45: {
 //BA.debugLineNum = 358;BA.debugLine="vm.NavBar.UpdateTitle(modSlider.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modslider._title /*String*/ );
 //BA.debugLineNum = 359;BA.debugLine="vm.ShowPage(modSlider.name)";
_vm._showpage /*String*/ (_modslider._name /*String*/ );
 break; }
case 46: {
 //BA.debugLineNum = 361;BA.debugLine="vm.NavBar.UpdateTitle(modSwitch.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modswitch._title /*String*/ );
 //BA.debugLineNum = 362;BA.debugLine="vm.ShowPage(modSwitch.name)";
_vm._showpage /*String*/ (_modswitch._name /*String*/ );
 break; }
case 47: {
 //BA.debugLineNum = 364;BA.debugLine="vm.NavBar.UpdateTitle(modTextArea.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modtextarea._title /*String*/ );
 //BA.debugLineNum = 365;BA.debugLine="vm.ShowPage(modTextArea.name)";
_vm._showpage /*String*/ (_modtextarea._name /*String*/ );
 break; }
case 48: {
 //BA.debugLineNum = 367;BA.debugLine="vm.NavBar.UpdateTitle(modTextField.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modtextfield._title /*String*/ );
 //BA.debugLineNum = 368;BA.debugLine="vm.ShowPage(modTextField.name)";
_vm._showpage /*String*/ (_modtextfield._name /*String*/ );
 break; }
case 49: {
 //BA.debugLineNum = 370;BA.debugLine="vm.NavBar.UpdateTitle(modTimePicker.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modtimepicker._title /*String*/ );
 //BA.debugLineNum = 371;BA.debugLine="vm.ShowPage(modTimePicker.name)";
_vm._showpage /*String*/ (_modtimepicker._name /*String*/ );
 break; }
case 50: {
 //BA.debugLineNum = 373;BA.debugLine="vm.NavBar.UpdateTitle(modMenus.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modmenus._title /*String*/ );
 //BA.debugLineNum = 374;BA.debugLine="vm.ShowPage(modMenus.name)";
_vm._showpage /*String*/ (_modmenus._name /*String*/ );
 break; }
case 51: {
 //BA.debugLineNum = 376;BA.debugLine="vm.NavBar.UpdateTitle(modAutoComplete.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modautocomplete._title /*String*/ );
 //BA.debugLineNum = 377;BA.debugLine="modAutoComplete.reset";
_modautocomplete._reset /*String*/ ();
 //BA.debugLineNum = 378;BA.debugLine="vm.ShowPage(modAutoComplete.name)";
_vm._showpage /*String*/ (_modautocomplete._name /*String*/ );
 break; }
case 52: {
 //BA.debugLineNum = 380;BA.debugLine="vm.NavBar.UpdateTitle(modLists.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modlists._title /*String*/ );
 //BA.debugLineNum = 381;BA.debugLine="vm.ShowPage(modLists.name)";
_vm._showpage /*String*/ (_modlists._name /*String*/ );
 break; }
case 53: {
 //BA.debugLineNum = 383;BA.debugLine="vm.NavBar.UpdateTitle(modStepper.title)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (_modstepper._title /*String*/ );
 //BA.debugLineNum = 384;BA.debugLine="vm.ShowPage(modStepper.name)";
_vm._showpage /*String*/ (_modstepper._name /*String*/ );
 break; }
case 54: {
 //BA.debugLineNum = 386;BA.debugLine="vm.ShowPage(modTabs.name)";
_vm._showpage /*String*/ (_modtabs._name /*String*/ );
 break; }
}
;
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return "";
}
public static String  _inbox_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 402;BA.debugLine="Sub inbox_click(e As BANanoEvent)";
 //BA.debugLineNum = 403;BA.debugLine="vm.ShowSnackBar(\"Inbox!\")";
_vm._showsnackbar /*String*/ ("Inbox!");
 //BA.debugLineNum = 404;BA.debugLine="vm.pagepause";
_vm._pagepause /*String*/ ();
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="vm.Initialize(Me, Main.appname)";
_vm._initialize /*String*/ (ba,pgindex.getObject(),_main._appname /*String*/ );
 //BA.debugLineNum = 10;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 11;BA.debugLine="vm.ShowWarnings = False";
_vm._showwarnings /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 12;BA.debugLine="vue.ShowWarnings = False";
_vue._showwarnings /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 15;BA.debugLine="vm.RTL = False";
_vm._rtl /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 16;BA.debugLine="vm.SnackBar.SetColor(\"green\")";
_vm._snackbar /*b4j.example.vmsnackbar*/ ._setcolor /*b4j.example.vmsnackbar*/ ("green");
 //BA.debugLineNum = 17;BA.debugLine="vm.SnackBar.SetTop(True)";
_vm._snackbar /*b4j.example.vmsnackbar*/ ._settop /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 18;BA.debugLine="vm.SnackBar.SetShaped(True)";
_vm._snackbar /*b4j.example.vmsnackbar*/ ._setshaped /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 20;BA.debugLine="BuildNavBar";
_buildnavbar();
 //BA.debugLineNum = 21;BA.debugLine="BuildDrawer";
_builddrawer();
 //BA.debugLineNum = 24;BA.debugLine="vm.Container.SetFluid(True)";
_vm._container /*b4j.example.vmcontainer*/ ._setfluid /*b4j.example.vmcontainer*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 26;BA.debugLine="vm.AddTheme(\"grey5\", vm.vue.COLOR_BLACK, vm.vue.I";
_vm._addtheme /*String*/ ("grey5",_vm._vue /*b4j.example.bananovue*/ ._color_black /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._intensity_normal /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._color_red /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._intensity_lighten5 /*String*/ );
 //BA.debugLineNum = 27;BA.debugLine="vm.AddTheme(\"bluedark2\", vm.vue.COLOR_WHITE, vm.v";
_vm._addtheme /*String*/ ("bluedark2",_vm._vue /*b4j.example.bananovue*/ ._color_white /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._intensity_normal /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._color_blue /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._intensity_darken2 /*String*/ );
 //BA.debugLineNum = 28;BA.debugLine="vm.AddTheme(\"red-l-2\", vm.vue.COLOR_BLACK, vm.vue";
_vm._addtheme /*String*/ ("red-l-2",_vm._vue /*b4j.example.bananovue*/ ._color_black /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._intensity_normal /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._color_red /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._intensity_lighten2 /*String*/ );
 //BA.debugLineNum = 29;BA.debugLine="vm.AddTheme(\"white-text-only\", vm.vue.COLOR_WHITE";
_vm._addtheme /*String*/ ("white-text-only",_vm._vue /*b4j.example.bananovue*/ ._color_white /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._intensity_normal /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._color_none /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._intensity_normal /*String*/ );
 //BA.debugLineNum = 31;BA.debugLine="AddPages";
_addpages();
 //BA.debugLineNum = 32;BA.debugLine="BuildFooter";
_buildfooter();
 //BA.debugLineNum = 34;BA.debugLine="vm.UX";
_vm._ux /*String*/ ();
 //BA.debugLineNum = 36;BA.debugLine="vm.showpage(modProgress.name)";
_vm._showpage /*String*/ (_modprogress._name /*String*/ );
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public static String  _photos_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Sub photos_click(e As BANanoEvent)";
 //BA.debugLineNum = 395;BA.debugLine="vm.ShowSnackBar(\"Photos\")";
_vm._showsnackbar /*String*/ ("Photos");
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Dim vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 5;BA.debugLine="Dim vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static String  _sent_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub sent_click(e As BANanoEvent)";
 //BA.debugLineNum = 413;BA.debugLine="vm.ShowSnackBar(\"Sent!\")";
_vm._showsnackbar /*String*/ ("Sent!");
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return "";
}
}
