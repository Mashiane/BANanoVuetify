package b4j.example;


import anywheresoftware.b4a.BA;

public class modbanner extends Object{
public static modbanner mostCurrent = new modbanner();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modbanner", null);
		ba.loadHtSubs(modbanner.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modbanner", ba);
		}
	}
    public static Class<?> getObject() {
		return modbanner.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
public static b4j.example.bananovue _vue = null;
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
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
public static String  _banner1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub banner1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 105;BA.debugLine="vue.CopyCode2Clipboard(\"banner1code\")";
_vue._copycode2clipboard /*String*/ ("banner1code");
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static String  _banner1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub banner1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 109;BA.debugLine="vue.DownloadCode(\"banner1code\", \"banner1code.txt\"";
_vue._downloadcode /*String*/ ("banner1code","banner1code.txt");
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public static String  _bannercardcodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub bannercardcodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 96;BA.debugLine="vue.CopyCode2Clipboard(\"bannercardcode\")";
_vue._copycode2clipboard /*String*/ ("bannercardcode");
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public static String  _bannercardcodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub bannercardcodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 100;BA.debugLine="vue.DownloadCode(\"bannercardcode\", \"bannercardcod";
_vue._downloadcode /*String*/ ("bannercardcode","bannercardcode.txt");
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public static String  _checkconnection(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub checkConnection(e As BANanoEvent)";
 //BA.debugLineNum = 92;BA.debugLine="vm.showsnackbar(\"Check connection!\")";
_vm._showsnackbar /*String*/ ("Check connection!");
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmcard _card = null;
b4j.example.vmcheckbox _sticky = null;
b4j.example.vmbanner _banner = null;
b4j.example.vmbutton _btngetonline = null;
b4j.example.vmbanner _banner1 = null;
b4j.example.vmavatar _avat = null;
 //BA.debugLineNum = 11;BA.debugLine="Sub Code";
 //BA.debugLineNum = 12;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 13;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 15;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modbanner.getObject());
 //BA.debugLineNum = 17;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 19;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (2))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 21;BA.debugLine="Dim card As VMCard = vm.CreateCard(\"bannercard\",";
_card = _vm._createcard /*b4j.example.vmcard*/ ("bannercard",modbanner.getObject());
 //BA.debugLineNum = 22;BA.debugLine="card.ToolBar.AddTitle(\"My Documents\",\"\")";
_card._toolbar /*b4j.example.vmtoolbar*/ ._addtitle /*b4j.example.vmtoolbar*/ ("My Documents","");
 //BA.debugLineNum = 23;BA.debugLine="card.ToolBar.AddSpacer";
_card._toolbar /*b4j.example.vmtoolbar*/ ._addspacer /*b4j.example.vmtoolbar*/ ();
 //BA.debugLineNum = 24;BA.debugLine="card.ToolBar.SetFlat(True)";
_card._toolbar /*b4j.example.vmtoolbar*/ ._setflat /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 26;BA.debugLine="Dim sticky As VMCheckBox = vm.CreateSwitch(\"switc";
_sticky = _vm._createswitch /*b4j.example.vmcheckbox*/ ("switchsticky",modbanner.getObject())._setvmodel /*b4j.example.vmcheckbox*/ ("sticky")._setlabel /*b4j.example.vmcheckbox*/ ("Sticky Banner")._sethidedetails /*b4j.example.vmcheckbox*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 27;BA.debugLine="card.ToolBar.AddComponent(\"sticky\", sticky.ToStri";
_card._toolbar /*b4j.example.vmtoolbar*/ ._addcomponent /*b4j.example.vmtoolbar*/ ("sticky",_sticky._tostring /*String*/ ());
 //BA.debugLineNum = 29;BA.debugLine="Dim banner As VMBanner = vm.CreateBanner(\"banner1";
_banner = _vm._createbanner /*b4j.example.vmbanner*/ ("banner1",modbanner.getObject())._setsingleline /*b4j.example.vmbanner*/ ((Object)(anywheresoftware.b4a.keywords.Common.True))._bind /*b4j.example.vmbanner*/ (":sticky","sticky");
 //BA.debugLineNum = 30;BA.debugLine="banner.SetText(\"We can't save your edits while yo";
_banner._settext /*b4j.example.vmbanner*/ ((Object)("We can't save your edits while you are in offline mode."));
 //BA.debugLineNum = 32;BA.debugLine="Dim btnGetOnline As VMButton = vm.CreateButton(\"b";
_btngetonline = _vm._createbutton /*b4j.example.vmbutton*/ ("btngetOnline",modbanner.getObject())._settransparent /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setcolorintensity /*b4j.example.vmbutton*/ (_vm._color_deeppurple /*String*/ ,_vm._intensity_accent4 /*String*/ );
 //BA.debugLineNum = 33;BA.debugLine="btnGetOnline.SetLAbel(\"Get Online\")";
_btngetonline._setlabel /*b4j.example.vmbutton*/ ("Get Online");
 //BA.debugLineNum = 34;BA.debugLine="banner.AddAction(btnGetOnline)";
_banner._addaction /*b4j.example.vmbanner*/ (_btngetonline);
 //BA.debugLineNum = 36;BA.debugLine="card.AddStuff(banner.ToString)";
_card._addstuff /*b4j.example.vmcard*/ (_banner._tostring /*String*/ ());
 //BA.debugLineNum = 38;BA.debugLine="cont.AddComponent(1, 1, card.ToString)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_card._tostring /*String*/ ());
 //BA.debugLineNum = 41;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"Dim card As VMCard = vm.CreateCard(\"";
_vue._addcode /*String*/ (("Dim card As VMCard = vm.CreateCard(\"bannercard\", Me)"));
 //BA.debugLineNum = 43;BA.debugLine="vue.AddCode($\"card.ToolBar.AddTitle(\"My Documents\"";
_vue._addcode /*String*/ (("card.ToolBar.AddTitle(\"My Documents\",\"\")"));
 //BA.debugLineNum = 44;BA.debugLine="vue.AddCode($\"card.ToolBar.AddSpacer\"$)";
_vue._addcode /*String*/ (("card.ToolBar.AddSpacer"));
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"card.ToolBar.SetFlat(True)\"$)";
_vue._addcode /*String*/ (("card.ToolBar.SetFlat(True)"));
 //BA.debugLineNum = 46;BA.debugLine="vue.AddCode($\"Dim sticky As VMCheckBox = vm.Create";
_vue._addcode /*String*/ (("Dim sticky As VMCheckBox = vm.CreateSwitch(\"switchsticky\", Me).SetVModel(\"sticky\").SetLabel(\"Sticky Banner\").SetHideDetails(True)"));
 //BA.debugLineNum = 47;BA.debugLine="vue.AddCode($\"card.ToolBar.AddComponent(\"sticky\",";
_vue._addcode /*String*/ (("card.ToolBar.AddComponent(\"sticky\", sticky.ToString)"));
 //BA.debugLineNum = 48;BA.debugLine="vue.AddCode($\"Dim banner As VMBanner = vm.CreateBa";
_vue._addcode /*String*/ (("Dim banner As VMBanner = vm.CreateBanner(\"banner1\", Me).SetSingleLine(True).Bind(\":sticky\", \"sticky\")"));
 //BA.debugLineNum = 49;BA.debugLine="vue.AddCode($\"banner.SetText(\"We can't save your e";
_vue._addcode /*String*/ (("banner.SetText(\"We can't save your edits while you are in offline mode.\")"));
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"Dim btnGetOnline As VMButton = vm.Cr";
_vue._addcode /*String*/ (("Dim btnGetOnline As VMButton = vm.CreateButton(\"btngetOnline\", Me).SetTransparent(True).SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)"));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"btnGetOnline.SetLAbel(\"Get Online\")\"";
_vue._addcode /*String*/ (("btnGetOnline.SetLAbel(\"Get Online\")"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"banner.AddAction(btnGetOnline)\"$)";
_vue._addcode /*String*/ (("banner.AddAction(btnGetOnline)"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"card.AddStuff(banner.ToString)\"$)";
_vue._addcode /*String*/ (("card.AddStuff(banner.ToString)"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"cont.AddComponent(1, 1, card.ToStrin";
_vue._addcode /*String*/ (("cont.AddComponent(1, 1, card.ToString)"));
 //BA.debugLineNum = 55;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"bannercardcode\", \"B";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbanner.getObject(),"bannercardcode","Banner",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 58;BA.debugLine="Dim banner1 As VMBanner = vm.CreateBanner(\"banner";
_banner1 = _vm._createbanner /*b4j.example.vmbanner*/ ("banner1",modbanner.getObject())._settwoline /*b4j.example.vmbanner*/ ((Object)(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 59;BA.debugLine="Dim avat As VMAvatar = vm.CreateAvatar(\"avat1\", M";
_avat = _vm._createavatar /*b4j.example.vmavatar*/ ("avat1",modbanner.getObject())._setslot /*b4j.example.vmavatar*/ ("icon")._setsize /*b4j.example.vmavatar*/ ("40")._setcolorintensity /*b4j.example.vmavatar*/ (_vm._color_deeppurple /*String*/ ,_vm._intensity_accent4 /*String*/ );
 //BA.debugLineNum = 60;BA.debugLine="avat.SetIcon(\"mdi-lock\",\"\", CreateMap(\"color\" : \"";
_avat._seticon /*b4j.example.vmavatar*/ ("mdi-lock","",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("color"),(Object)("white")}),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 62;BA.debugLine="banner1.AddComponent(avat.ToString)";
_banner1._addcomponent /*b4j.example.vmbanner*/ (_avat._tostring /*String*/ ());
 //BA.debugLineNum = 63;BA.debugLine="banner1.SetText(vm.Rand_LoremIpsum(1))";
_banner1._settext /*b4j.example.vmbanner*/ ((Object)(_vm._rand_loremipsum /*String*/ ((int) (1))));
 //BA.debugLineNum = 64;BA.debugLine="banner1.AddAction(vm.CreateButton(\"btnDismis\", Me";
_banner1._addaction /*b4j.example.vmbanner*/ (_vm._createbutton /*b4j.example.vmbutton*/ ("btnDismis",modbanner.getObject())._setlabel /*b4j.example.vmbutton*/ ("Dismiss")._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._settransparent /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 65;BA.debugLine="banner1.AddAction(vm.CreateButton(\"btnRetry\", Me)";
_banner1._addaction /*b4j.example.vmbanner*/ (_vm._createbutton /*b4j.example.vmbutton*/ ("btnRetry",modbanner.getObject())._setlabel /*b4j.example.vmbutton*/ ("Retry")._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._settransparent /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 67;BA.debugLine="banner1.SetOnClickIcon(\"checkConnection\")";
_banner1._setonclickicon /*b4j.example.vmbanner*/ ("checkConnection");
 //BA.debugLineNum = 69;BA.debugLine="cont.AddComponent(2, 1, banner1.ToString)";
_cont._addcomponent /*String*/ ((int) (2),(int) (1),_banner1._tostring /*String*/ ());
 //BA.debugLineNum = 72;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 73;BA.debugLine="vue.AddCode($\"Dim banner1 As VMBanner = vm.CreateB";
_vue._addcode /*String*/ (("Dim banner1 As VMBanner = vm.CreateBanner(\"banner1\", Me).SetTwoLine(True)"));
 //BA.debugLineNum = 74;BA.debugLine="vue.AddCode($\"Dim avat As VMAvatar = vm.CreateAvat";
_vue._addcode /*String*/ (("Dim avat As VMAvatar = vm.CreateAvatar(\"avat1\", Me).SetSlot(\"icon\").SetSize(\"40\").SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)"));
 //BA.debugLineNum = 75;BA.debugLine="vue.AddCode($\"avat.SetIcon(\"mdi-lock\",\"\", CreateMa";
_vue._addcode /*String*/ (("avat.SetIcon(\"mdi-lock\",\"\", CreateMap(\"color\" : \"white\"), Null, Null)"));
 //BA.debugLineNum = 76;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 77;BA.debugLine="vue.AddCode($\"banner1.AddComponent(avat.ToString)\"";
_vue._addcode /*String*/ (("banner1.AddComponent(avat.ToString)"));
 //BA.debugLineNum = 78;BA.debugLine="vue.AddCode($\"banner1.SetText(vm.Rand_LoremIpsum(1";
_vue._addcode /*String*/ (("banner1.SetText(vm.Rand_LoremIpsum(1))"));
 //BA.debugLineNum = 79;BA.debugLine="vue.AddCode($\"banner1.AddAction(vm.CreateButton(\"b";
_vue._addcode /*String*/ (("banner1.AddAction(vm.CreateButton(\"btnDismis\", Me).SetLabel(\"Dismiss\").SetPrimary(True).SetTransparent(True))"));
 //BA.debugLineNum = 80;BA.debugLine="vue.AddCode($\"banner1.AddAction(vm.CreateButton(\"b";
_vue._addcode /*String*/ (("banner1.AddAction(vm.CreateButton(\"btnRetry\", Me).SetLabel(\"Retry\").SetPrimary(True).SetTransparent(True))"));
 //BA.debugLineNum = 81;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 82;BA.debugLine="vue.AddCode($\"banner1.SetOnClickIcon(\"checkConnect";
_vue._addcode /*String*/ (("banner1.SetOnClickIcon(\"checkConnection\")"));
 //BA.debugLineNum = 83;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 84;BA.debugLine="vue.AddCode($\"cont.AddComponent(1, 2, banner1.ToSt";
_vue._addcode /*String*/ (("cont.AddComponent(1, 2, banner1.ToString)"));
 //BA.debugLineNum = 85;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"banner1code\", \"Bann";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbanner.getObject(),"banner1code","Banner",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 87;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public name As String = \"bannerCode\"";
_name = "bannerCode";
 //BA.debugLineNum = 5;BA.debugLine="Public title As String = \"Banner\"";
_title = "Banner";
 //BA.debugLineNum = 6;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 7;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
