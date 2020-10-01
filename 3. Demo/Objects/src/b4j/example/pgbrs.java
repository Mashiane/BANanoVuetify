package b4j.example;


import anywheresoftware.b4a.BA;

public class pgbrs extends Object{
public static pgbrs mostCurrent = new pgbrs();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgbrs", null);
		ba.loadHtSubs(pgbrs.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgbrs", ba);
		}
	}
    public static Class<?> getObject() {
		return pgbrs.class;
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
public static b4j.example.bananoshared _bananoshared = null;
public static String  _border1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub border1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 72;BA.debugLine="vue.CopyCode2Clipboard(\"border1code\")";
_vue._copycode2clipboard /*String*/ ("border1code");
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _border1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub border1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 76;BA.debugLine="vue.DownloadCode(\"border1code\", \"border1code.txt\"";
_vue._downloadcode /*String*/ ("border1code","border1code.txt");
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public static String  _border2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub border2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 81;BA.debugLine="vue.CopyCode2Clipboard(\"border2code\")";
_vue._copycode2clipboard /*String*/ ("border2code");
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static String  _border2codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub border2codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 85;BA.debugLine="vue.DownloadCode(\"border2code\", \"border2code.txt\"";
_vue._downloadcode /*String*/ ("border2code","border2code.txt");
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static String  _border3codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub border3codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 91;BA.debugLine="vue.CopyCode2Clipboard(\"border3code\")";
_vue._copycode2clipboard /*String*/ ("border3code");
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public static String  _border3codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub border3codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 95;BA.debugLine="vue.DownloadCode(\"border3code\", \"border3code.txt\"";
_vue._downloadcode /*String*/ ("border3code","border3code.txt");
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,pgbrs.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.addrows(3).AddColumns6x2";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (3))._addcolumns6x2 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 19;BA.debugLine="cont.AddRows(3).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (3))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 21;BA.debugLine="vm.Div(\"\").SetRounded.AddClass(\"pa-6 text-center";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded /*b4j.example.vmelement*/ ()._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Rounded")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.Div(\"\").SetRounded_SM.AddClass(\"pa-6 text-cent";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_sm /*b4j.example.vmelement*/ ()._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Rounded_SM")._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 23;BA.debugLine="vm.Div(\"\").SetRounded_LG.AddClass(\"pa-6 text-cent";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_lg /*b4j.example.vmelement*/ ()._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Rounded_LG")._addtocontainer /*String*/ (_cont,(int) (1),(int) (3));
 //BA.debugLineNum = 24;BA.debugLine="vm.Div(\"\").SetRounded_XL.AddClass(\"pa-6 text-cent";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_xl /*b4j.example.vmelement*/ ()._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Rounded_XL")._addtocontainer /*String*/ (_cont,(int) (1),(int) (4));
 //BA.debugLineNum = 25;BA.debugLine="vm.Div(\"\").SetRounded_Pill.AddClass(\"pa-6 text-ce";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_pill /*b4j.example.vmelement*/ ()._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Pill")._addtocontainer /*String*/ (_cont,(int) (1),(int) (5));
 //BA.debugLineNum = 26;BA.debugLine="vm.Div(\"\").SetRounded_Circle.AddClass(\"pa-6 text-";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_circle /*b4j.example.vmelement*/ ()._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Circle")._addtocontainer /*String*/ (_cont,(int) (1),(int) (6));
 //BA.debugLineNum = 28;BA.debugLine="vm.Div(\"\").SetRounded_Top(\"xl\").AddClass(\"pa-6 te";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_top /*b4j.example.vmelement*/ ("xl")._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Rounded Top")._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 29;BA.debugLine="vm.Div(\"\").SetRounded_Right(\"xl\").AddClass(\"pa-6";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_right /*b4j.example.vmelement*/ ("xl")._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Rounded Right")._addtocontainer /*String*/ (_cont,(int) (2),(int) (2));
 //BA.debugLineNum = 30;BA.debugLine="vm.Div(\"\").SetRounded_Bottom(\"xl\").AddClass(\"pa-6";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_bottom /*b4j.example.vmelement*/ ("xl")._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Rounded Bottom")._addtocontainer /*String*/ (_cont,(int) (2),(int) (3));
 //BA.debugLineNum = 31;BA.debugLine="vm.Div(\"\").SetRounded_Left(\"xl\").AddClass(\"pa-6 t";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_left /*b4j.example.vmelement*/ ("xl")._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Rounded Left")._addtocontainer /*String*/ (_cont,(int) (2),(int) (4));
 //BA.debugLineNum = 33;BA.debugLine="vm.Div(\"\").SetRounded_TopLeft(\"xl\").AddClass(\"pa-";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_topleft /*b4j.example.vmelement*/ ("xl")._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Top Left")._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 34;BA.debugLine="vm.Div(\"\").SetRounded_TopRight(\"xl\").AddClass(\"pa";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_topright /*b4j.example.vmelement*/ ("xl")._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Top Right")._addtocontainer /*String*/ (_cont,(int) (3),(int) (2));
 //BA.debugLineNum = 35;BA.debugLine="vm.Div(\"\").SetRounded_BottomRight(\"xl\").AddClass(";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_bottomright /*b4j.example.vmelement*/ ("xl")._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Bottom Right")._addtocontainer /*String*/ (_cont,(int) (3),(int) (3));
 //BA.debugLineNum = 36;BA.debugLine="vm.Div(\"\").SetRounded_BottomLeft(\"xl\").AddClass(\"";
_vm._div /*b4j.example.vmelement*/ ("")._setrounded_bottomleft /*b4j.example.vmelement*/ ("xl")._addclass /*b4j.example.vmelement*/ ("pa-6 text-center grey lighten-2")._settext /*b4j.example.vmelement*/ ("Bottom Left")._addtocontainer /*String*/ (_cont,(int) (3),(int) (4));
 //BA.debugLineNum = 39;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 40;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded.AddClass(\"pa-6";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded.AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Rounded\").AddToContainer(cont,1,1)"));
 //BA.debugLineNum = 41;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_SM.AddClass(\"p";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_SM.AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Rounded_SM\").AddToContainer(cont,1,2)"));
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_LG.AddClass(\"p";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_LG.AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Rounded_LG\").AddToContainer(cont,1,3)"));
 //BA.debugLineNum = 43;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_XL.AddClass(\"p";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_XL.AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Rounded_XL\").AddToContainer(cont,1,4)"));
 //BA.debugLineNum = 44;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_Pill.AddClass(";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_Pill.AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Pill\").AddToContainer(cont,1,5)"));
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_Circle.AddClas";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_Circle.AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Circle\").AddToContainer(cont,1,6)"));
 //BA.debugLineNum = 46;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"border1code\", \"Roun";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,pgbrs.getObject(),"border1code","Rounded 1",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 49;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_Top(\"xl\").AddC";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_Top(\"xl\").AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Rounded Top\").AddToContainer(cont,2,1)"));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_Right(\"xl\").Ad";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_Right(\"xl\").AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Rounded Right\").AddToContainer(cont,2,2)"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_Bottom(\"xl\").A";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_Bottom(\"xl\").AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Rounded Bottom\").AddToContainer(cont,2,3)"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_Left(\"xl\").Add";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_Left(\"xl\").AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Rounded Left\").AddToContainer(cont,2,4)"));
 //BA.debugLineNum = 54;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"border2code\", \"Roun";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,pgbrs.getObject(),"border2code","Rounded 2",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 58;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 59;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_TopLeft(\"xl\").";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_TopLeft(\"xl\").AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Top Left\").AddToContainer(cont,3,1)"));
 //BA.debugLineNum = 60;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_TopRight(\"xl\")";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_TopRight(\"xl\").AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Top Right\").AddToContainer(cont,3,2)"));
 //BA.debugLineNum = 61;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_BottomRight(\"x";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_BottomRight(\"xl\").AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Bottom Right\").AddToContainer(cont,3,3)"));
 //BA.debugLineNum = 62;BA.debugLine="vue.AddCode($\"vm.Div(\"\").SetRounded_BottomLeft(\"xl";
_vue._addcode /*String*/ (("vm.Div(\"\").SetRounded_BottomLeft(\"xl\").AddClass(\"pa-6 text-center grey lighten-2\").SetText(\"Bottom Left\").AddToContainer(cont,3,4)"));
 //BA.debugLineNum = 63;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"border3code\", \"Roun";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,pgbrs.getObject(),"border3code","Rounded 3",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 67;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"bordersCode\"";
_name = "bordersCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Borders & Radius\"";
_title = "Borders & Radius";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
