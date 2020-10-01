package b4j.example;


import anywheresoftware.b4a.BA;

public class modsnackbar extends Object{
public static modsnackbar mostCurrent = new modsnackbar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modsnackbar", null);
		ba.loadHtSubs(modsnackbar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modsnackbar", ba);
		}
	}
    public static Class<?> getObject() {
		return modsnackbar.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
public static b4j.example.bananovue _vue = null;
public static b4j.example.vmsnackbar _snack1 = null;
public static b4j.example.vmsnackbar _snack3 = null;
public static b4j.example.vmsnackbar _snack4 = null;
public static b4j.example.vmsnackbar _snack5 = null;
public static b4j.example.vmsnackbar _snack6 = null;
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
public static String  _btns1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub btns1_click(e As BANanoEvent)";
 //BA.debugLineNum = 89;BA.debugLine="vm.ShowSnackBar(\"I am a snack bar!\")";
_vm._showsnackbar /*String*/ ("I am a snack bar!");
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 14;BA.debugLine="Sub Code";
 //BA.debugLineNum = 15;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 16;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 18;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modsnackbar.getObject());
 //BA.debugLineNum = 20;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 22;BA.debugLine="cont.addrows(10).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (10))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 24;BA.debugLine="vm.CreateButton(\"btns1\", Me).SetLabel(\"Open Snack";
_vm._createbutton /*b4j.example.vmbutton*/ ("btns1",modsnackbar.getObject())._setlabel /*b4j.example.vmbutton*/ ("Open Snackbar")._setdark /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setcolorintensity /*b4j.example.vmbutton*/ (_vm._color_red /*String*/ ,_vm._intensity_darken2 /*String*/ )._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 28;BA.debugLine="vue.AddCode($\"vm.CreateButton(\"btns1\", Me).SetLab";
_vue._addcode /*String*/ (("vm.CreateButton(\"btns1\", Me).SetLabel(\"Open Snackbar\").SetDark(True).SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_DARKEN2).AddToContainer(cont, 5, 1)"));
 //BA.debugLineNum = 29;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 30;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 31;BA.debugLine="vue.AddCode($\"Sub btns1_click(e As BANanoEvent)\"$";
_vue._addcode /*String*/ (("Sub btns1_click(e As BANanoEvent)"));
 //BA.debugLineNum = 32;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"I am a snack bar!\"";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"I am a snack bar!\")"));
 //BA.debugLineNum = 33;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 34;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"snack1code\", \"Show";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modsnackbar.getObject(),"snack1code","Show SnackBar",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 36;BA.debugLine="snack1 = vm.CreateSnackBar(\"snack2\", Me)";
_snack1 = _vm._createsnackbar /*b4j.example.vmsnackbar*/ ("snack2",modsnackbar.getObject());
 //BA.debugLineNum = 37;BA.debugLine="snack1.SetLabel(\"Shaped SnackBar\")";
_snack1._setlabel /*b4j.example.vmsnackbar*/ ("Shaped SnackBar");
 //BA.debugLineNum = 38;BA.debugLine="snack1.SetTimeout(\"-1\")";
_snack1._settimeout /*b4j.example.vmsnackbar*/ ("-1");
 //BA.debugLineNum = 39;BA.debugLine="snack1.Hide";
_snack1._hide /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 40;BA.debugLine="snack1.SetAbsolute(True)";
_snack1._setabsolute /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 41;BA.debugLine="snack1.SetTopLeft(True)";
_snack1._settopleft /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 42;BA.debugLine="snack1.SetShaped(True)";
_snack1._setshaped /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 43;BA.debugLine="vm.AddSnackBar(snack1)";
_vm._addsnackbar /*String*/ (_snack1);
 //BA.debugLineNum = 45;BA.debugLine="snack3 = vm.CreateSnackBar(\"snack3\", Me)";
_snack3 = _vm._createsnackbar /*b4j.example.vmsnackbar*/ ("snack3",modsnackbar.getObject());
 //BA.debugLineNum = 46;BA.debugLine="snack3.SetLabel(\"Pill SnackBar\")";
_snack3._setlabel /*b4j.example.vmsnackbar*/ ("Pill SnackBar");
 //BA.debugLineNum = 47;BA.debugLine="snack3.SetTimeout(\"-1\")";
_snack3._settimeout /*b4j.example.vmsnackbar*/ ("-1");
 //BA.debugLineNum = 48;BA.debugLine="snack3.Hide";
_snack3._hide /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 49;BA.debugLine="snack3.SetColor(vm.COLOR_BLUEGREY)";
_snack3._setcolor /*b4j.example.vmsnackbar*/ (_vm._color_bluegrey /*String*/ );
 //BA.debugLineNum = 50;BA.debugLine="snack3.SetAbsolute(True)";
_snack3._setabsolute /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 51;BA.debugLine="snack3.SetTopRight(True)";
_snack3._settopright /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 52;BA.debugLine="snack3.SetRounded(\"pill\")";
_snack3._setrounded /*b4j.example.vmsnackbar*/ ((Object)("pill"));
 //BA.debugLineNum = 53;BA.debugLine="vm.AddSnackBar(snack3)";
_vm._addsnackbar /*String*/ (_snack3);
 //BA.debugLineNum = 55;BA.debugLine="snack4  = vm.CreateSnackBar(\"snack4\", Me)";
_snack4 = _vm._createsnackbar /*b4j.example.vmsnackbar*/ ("snack4",modsnackbar.getObject());
 //BA.debugLineNum = 56;BA.debugLine="snack4.SetLabel(\"Centered SnackBar\")";
_snack4._setlabel /*b4j.example.vmsnackbar*/ ("Centered SnackBar");
 //BA.debugLineNum = 57;BA.debugLine="snack4.SetTimeout(\"-1\")";
_snack4._settimeout /*b4j.example.vmsnackbar*/ ("-1");
 //BA.debugLineNum = 58;BA.debugLine="snack4.Hide";
_snack4._hide /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 59;BA.debugLine="snack4.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.";
_snack4._setcolorintensity /*b4j.example.vmsnackbar*/ (_vm._color_deeppurple /*String*/ ,_vm._intensity_accent4 /*String*/ );
 //BA.debugLineNum = 60;BA.debugLine="snack4.SetAbsolute(True)";
_snack4._setabsolute /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 61;BA.debugLine="snack4.SetCentered(True)";
_snack4._setcentered /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 62;BA.debugLine="snack4.SetElevation(\"24\")";
_snack4._setelevation /*b4j.example.vmsnackbar*/ ("24");
 //BA.debugLineNum = 63;BA.debugLine="vm.AddSnackBar(snack4)";
_vm._addsnackbar /*String*/ (_snack4);
 //BA.debugLineNum = 65;BA.debugLine="snack5 = vm.CreateSnackBar(\"snack5\", Me)";
_snack5 = _vm._createsnackbar /*b4j.example.vmsnackbar*/ ("snack5",modsnackbar.getObject());
 //BA.debugLineNum = 66;BA.debugLine="snack5.SetLabel(\"Bottom Left\")";
_snack5._setlabel /*b4j.example.vmsnackbar*/ ("Bottom Left");
 //BA.debugLineNum = 67;BA.debugLine="snack5.SetTimeout(\"-1\")";
_snack5._settimeout /*b4j.example.vmsnackbar*/ ("-1");
 //BA.debugLineNum = 68;BA.debugLine="snack5.Hide";
_snack5._hide /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 69;BA.debugLine="snack5.SetColor(vm.COLOR_PRIMARY)";
_snack5._setcolor /*b4j.example.vmsnackbar*/ (_vm._color_primary /*String*/ );
 //BA.debugLineNum = 70;BA.debugLine="snack5.SetAbsolute(True)";
_snack5._setabsolute /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 71;BA.debugLine="snack5.SetBottomLeft(True)";
_snack5._setbottomleft /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 72;BA.debugLine="snack5.SetText1(True)";
_snack5._settext1 /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 73;BA.debugLine="vm.AddSnackBar(snack5)";
_vm._addsnackbar /*String*/ (_snack5);
 //BA.debugLineNum = 75;BA.debugLine="snack6  = vm.CreateSnackBar(\"snack6\", Me)";
_snack6 = _vm._createsnackbar /*b4j.example.vmsnackbar*/ ("snack6",modsnackbar.getObject());
 //BA.debugLineNum = 76;BA.debugLine="snack6.SetLabel(\"Outlined\")";
_snack6._setlabel /*b4j.example.vmsnackbar*/ ("Outlined");
 //BA.debugLineNum = 77;BA.debugLine="snack6.SetTimeout(\"-1\")";
_snack6._settimeout /*b4j.example.vmsnackbar*/ ("-1");
 //BA.debugLineNum = 78;BA.debugLine="snack6.Hide";
_snack6._hide /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 79;BA.debugLine="snack6.SetColor(vm.COLOR_SUCCESS)";
_snack6._setcolor /*b4j.example.vmsnackbar*/ (_vm._color_success /*String*/ );
 //BA.debugLineNum = 80;BA.debugLine="snack6.SetAbsolute(True)";
_snack6._setabsolute /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 81;BA.debugLine="snack6.SetBottomRight(True)";
_snack6._setbottomright /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 82;BA.debugLine="snack6.SetOutlined(True)";
_snack6._setoutlined /*b4j.example.vmsnackbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 83;BA.debugLine="vm.AddSnackBar(snack6)";
_vm._addsnackbar /*String*/ (_snack6);
 //BA.debugLineNum = 85;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static String  _hidesnacks() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub HideSnacks";
 //BA.debugLineNum = 109;BA.debugLine="snack1.hide";
_snack1._hide /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 110;BA.debugLine="snack3.hide";
_snack3._hide /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 111;BA.debugLine="snack4.hide";
_snack4._hide /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 112;BA.debugLine="snack5.hide";
_snack5._hide /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 113;BA.debugLine="snack6.hide";
_snack6._hide /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"snackCode\"";
_name = "snackCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Snack Bar\"";
_title = "Snack Bar";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="Public snack1 As VMSnackBar";
_snack1 = new b4j.example.vmsnackbar();
 //BA.debugLineNum = 8;BA.debugLine="Public snack3 As VMSnackBar";
_snack3 = new b4j.example.vmsnackbar();
 //BA.debugLineNum = 9;BA.debugLine="Public snack4 As VMSnackBar";
_snack4 = new b4j.example.vmsnackbar();
 //BA.debugLineNum = 10;BA.debugLine="Public snack5 As VMSnackBar";
_snack5 = new b4j.example.vmsnackbar();
 //BA.debugLineNum = 11;BA.debugLine="Public snack6 As VMSnackBar";
_snack6 = new b4j.example.vmsnackbar();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public static String  _showsnacks() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub ShowSnacks";
 //BA.debugLineNum = 101;BA.debugLine="snack1.Show";
_snack1._show /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 102;BA.debugLine="snack3.Show";
_snack3._show /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 103;BA.debugLine="snack4.Show";
_snack4._show /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 104;BA.debugLine="snack5.Show";
_snack5._show /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 105;BA.debugLine="snack6.Show";
_snack6._show /*b4j.example.vmsnackbar*/ ();
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static String  _snack1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub snack1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 93;BA.debugLine="vue.CopyCode2Clipboard(\"snack1code\")";
_vue._copycode2clipboard /*String*/ ("snack1code");
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static String  _snack1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub snack1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 97;BA.debugLine="vue.DownloadCode(\"snack1code\", \"snack1code.txt\")";
_vue._downloadcode /*String*/ ("snack1code","snack1code.txt");
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
}
