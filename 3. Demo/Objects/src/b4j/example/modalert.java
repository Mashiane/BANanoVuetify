package b4j.example;


import anywheresoftware.b4a.BA;

public class modalert extends Object{
public static modalert mostCurrent = new modalert();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modalert", null);
		ba.loadHtSubs(modalert.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modalert", ba);
		}
	}
    public static Class<?> getObject() {
		return modalert.class;
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
public static String  _a10codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub a10codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 97;BA.debugLine="vue.CopyCode2Clipboard(\"a10code\")";
_vue._copycode2clipboard /*String*/ ("a10code");
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public static String  _a11codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub a11codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 100;BA.debugLine="vue.CopyCode2Clipboard(\"a11code\")";
_vue._copycode2clipboard /*String*/ ("a11code");
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public static String  _a12codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub a12codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 103;BA.debugLine="vue.CopyCode2Clipboard(\"a12code\")";
_vue._copycode2clipboard /*String*/ ("a12code");
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public static String  _a13codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub a13codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 106;BA.debugLine="vue.CopyCode2Clipboard(\"a13code\")";
_vue._copycode2clipboard /*String*/ ("a13code");
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public static String  _a1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub a1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 70;BA.debugLine="vue.CopyCode2Clipboard(\"a1code\")";
_vue._copycode2clipboard /*String*/ ("a1code");
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public static String  _a1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub a1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 110;BA.debugLine="vue.DownloadCode(\"a1code\", \"a1code.txt\")";
_vue._downloadcode /*String*/ ("a1code","a1code.txt");
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public static String  _a2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub a2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 73;BA.debugLine="vue.CopyCode2Clipboard(\"a2code\")";
_vue._copycode2clipboard /*String*/ ("a2code");
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public static String  _a3codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub a3codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 76;BA.debugLine="vue.CopyCode2Clipboard(\"a3code\")";
_vue._copycode2clipboard /*String*/ ("a3code");
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public static String  _a4codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub a4codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 79;BA.debugLine="vue.CopyCode2Clipboard(\"a4code\")";
_vue._copycode2clipboard /*String*/ ("a4code");
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public static String  _a5codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub a5codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 82;BA.debugLine="vue.CopyCode2Clipboard(\"a5code\")";
_vue._copycode2clipboard /*String*/ ("a5code");
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public static String  _a6codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub a6codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 85;BA.debugLine="vue.CopyCode2Clipboard(\"a6code\")";
_vue._copycode2clipboard /*String*/ ("a6code");
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static String  _a7codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub a7codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 88;BA.debugLine="vue.CopyCode2Clipboard(\"a7code\")";
_vue._copycode2clipboard /*String*/ ("a7code");
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public static String  _a8codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub a8codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 91;BA.debugLine="vue.CopyCode2Clipboard(\"a8code\")";
_vue._copycode2clipboard /*String*/ ("a8code");
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public static String  _a9codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub a9codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 94;BA.debugLine="vue.CopyCode2Clipboard(\"a9code\")";
_vue._copycode2clipboard /*String*/ ("a9code");
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
String _scontent = "";
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modalert.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.AddRows(15).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (15))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateAlert(\"a1\", Me, \"success\").SetContent(\"I";
_vm._createalert /*b4j.example.vmalert*/ ("a1",modalert.getObject(),"success")._setcontent /*b4j.example.vmalert*/ ("I'm a success alert.")._show /*b4j.example.vmalert*/ ()._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"a1code\", \"Alert\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a1code","Alert",("vm.CreateAlert(\"a1\", Me, \"success\").SetContent(\"I'm a success alert.\").Show.AddToContainer(cont, 1, 1)"))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.CreateAlert(\"a2\", Me, \"info\").SetContent(\"I'm";
_vm._createalert /*b4j.example.vmalert*/ ("a2",modalert.getObject(),"info")._setcontent /*b4j.example.vmalert*/ ("I'm an info alert.")._show /*b4j.example.vmalert*/ ()._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"a2code\", \"Alert\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a2code","Alert",("vm.CreateAlert(\"a2\", Me, \"info\").SetContent(\"I'm an info alert.\").AddToContainer(cont, 1, 1)"))._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 26;BA.debugLine="vm.CreateAlert(\"a3\", Me, \"warning\").SetContent(\"I";
_vm._createalert /*b4j.example.vmalert*/ ("a3",modalert.getObject(),"warning")._setcontent /*b4j.example.vmalert*/ ("I'm a warning alert.")._show /*b4j.example.vmalert*/ ()._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"a3code\", \"Alert\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a3code","Alert",("vm.CreateAlert(\"a3\", Me, \"warning\").SetContent(\"I'm a warning alert.\").AddToContainer(cont, 1, 1)"))._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 29;BA.debugLine="vm.CreateAlert(\"a4\", Me, \"error\").SetContent(\"I'm";
_vm._createalert /*b4j.example.vmalert*/ ("a4",modalert.getObject(),"error")._setcontent /*b4j.example.vmalert*/ ("I'm an error alert.")._show /*b4j.example.vmalert*/ ()._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="pgIndex.CreateVBCode(vue, Me,\"a4code\", \"Alert\", $";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a4code","Alert",("vm.CreateAlert(\"a4\", Me, \"error\").SetContent(\"I'm an error alert.\").AddToContainer(cont, 1, 1)"))._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 32;BA.debugLine="vm.CreateAlert(\"a5\", Me, \"\").SetContent(\"I'm an a";
_vm._createalert /*b4j.example.vmalert*/ ("a5",modalert.getObject(),"")._setcontent /*b4j.example.vmalert*/ ("I'm an alert.")._show /*b4j.example.vmalert*/ ()._seticon /*b4j.example.vmalert*/ ("mdi-material-design")._setborder /*b4j.example.vmalert*/ ("top")._setcolorintensity /*b4j.example.vmalert*/ (_vm._color_red /*String*/ ,_vm._intensity_lighten2 /*String*/ )._setdark /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 33;BA.debugLine="pgIndex.CreateVBCode(vue, Me,\"a5code\", \"Alert\", $";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a5code","Alert",("vm.CreateAlert(\"a5\", Me, \"\").SetContent(\"I'm an alert.\").SetIcon(\"mdi-material-design\").SetBorder(\"top\").SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_LIGHTEN2).SetDark(True).AddToContainer(cont, 1, 1)"))._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 36;BA.debugLine="vm.CreateAlert(\"a6\", Me, \"\").SetContent(\"I'm an a";
_vm._createalert /*b4j.example.vmalert*/ ("a6",modalert.getObject(),"")._setcontent /*b4j.example.vmalert*/ ("I'm an alert.")._show /*b4j.example.vmalert*/ ()._setborder /*b4j.example.vmalert*/ ("right")._setcolorintensity /*b4j.example.vmalert*/ (_vm._color_bluegrey /*String*/ ,_vm._intensity_lighten2 /*String*/ )._setdark /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 37;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"a6code\", \"Alert\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a6code","Alert",("vm.CreateAlert(\"a6\", Me, \"\").SetContent(\"I'm an alert.\").SetBorder(\"right\").SetColorIntensity(vm.COLOR_BLUEGREY, vm.INTENSITY_LIGHTEN2).SetDark(True).AddToContainer(cont, 1, 1)"))._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 40;BA.debugLine="vm.CreateAlert(\"a7\", Me, \"\").SetContent(\"I'm an a";
_vm._createalert /*b4j.example.vmalert*/ ("a7",modalert.getObject(),"")._setcontent /*b4j.example.vmalert*/ ("I'm an alert.")._show /*b4j.example.vmalert*/ ()._seticon /*b4j.example.vmalert*/ ("mdi-vuetify")._setprominent /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._setborder /*b4j.example.vmalert*/ ("bottom")._setcolorintensity /*b4j.example.vmalert*/ (_vm._color_pink /*String*/ ,_vm._intensity_lighten2 /*String*/ )._setdark /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (7),(int) (1));
 //BA.debugLineNum = 41;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"a7code\", \"Alert\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a7code","Alert",("vm.CreateAlert(\"a7\", Me, \"\").SetContent(\"I'm an alert.\").Show.SetIcon(\"mdi-vuetify\").SetProminent(True).SetBorder(\"bottom\").SetColorIntensity(vm.COLOR_PINK, vm.INTENSITY_LIGHTEN2).SetDark(True).AddToContainer(cont, 1, 1)"))._addtocontainer /*String*/ (_cont,(int) (7),(int) (1));
 //BA.debugLineNum = 43;BA.debugLine="vm.CreateAlert(\"a8\", Me, \"\").Show.SetContent(\"You";
_vm._createalert /*b4j.example.vmalert*/ ("a8",modalert.getObject(),"")._show /*b4j.example.vmalert*/ ()._setcontent /*b4j.example.vmalert*/ ("You've got {B}5{/B} new updates on your timeline!.")._seticon /*b4j.example.vmalert*/ ("mdi-twitter")._setdismissible /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._setborder /*b4j.example.vmalert*/ ("left")._setcoloredborder /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._setoutlined /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._setcolor /*b4j.example.vmalert*/ (_vm._color_cyan /*String*/ )._setelevation /*b4j.example.vmalert*/ (BA.NumberToString(2))._addtocontainer /*String*/ (_cont,(int) (8),(int) (1));
 //BA.debugLineNum = 44;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"a8code\", \"Alert\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a8code","Alert",("vm.CreateAlert(\"a8\", Me, \"\").Show.SetContent(\"You've got {B}5{/B} new updates on your timeline!.\").SetIcon(\"mdi-twitter\").SetDismissible(True).SetBorder(\"left\").SetColoredBorder(True).SetOutlined(True).SetColor(vm.COLOR_CYAN).SetElevation(2).AddToContainer(cont, 1, 1)"))._addtocontainer /*String*/ (_cont,(int) (8),(int) (1));
 //BA.debugLineNum = 46;BA.debugLine="vm.CreateAlert(\"a9\", Me, \"success\").Show.SetConte";
_vm._createalert /*b4j.example.vmalert*/ ("a9",modalert.getObject(),"success")._show /*b4j.example.vmalert*/ ()._setcontent /*b4j.example.vmalert*/ ("I'm an alert.")._setborder /*b4j.example.vmalert*/ ("top")._setcoloredborder /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._setelevation /*b4j.example.vmalert*/ (BA.NumberToString(2))._setcolorintensity /*b4j.example.vmalert*/ (_vm._color_red /*String*/ ,_vm._intensity_lighten2 /*String*/ )._addtocontainer /*String*/ (_cont,(int) (9),(int) (1));
 //BA.debugLineNum = 47;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"a9code\", \"Alert\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a9code","Alert",("vm.CreateAlert(\"a9\", Me, \"success\").SetContent(\"I'm an alert.\").SetBorder(\"top\").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_RED, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 9, 1)"))._addtocontainer /*String*/ (_cont,(int) (9),(int) (1));
 //BA.debugLineNum = 49;BA.debugLine="vm.CreateAlert(\"a10\", Me, \"info\").Show.SetContent";
_vm._createalert /*b4j.example.vmalert*/ ("a10",modalert.getObject(),"info")._show /*b4j.example.vmalert*/ ()._setcontent /*b4j.example.vmalert*/ ("I'm an alert.")._setborder /*b4j.example.vmalert*/ ("right")._setcoloredborder /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._setelevation /*b4j.example.vmalert*/ (BA.NumberToString(2))._setcolorintensity /*b4j.example.vmalert*/ (_vm._color_bluegrey /*String*/ ,_vm._intensity_lighten2 /*String*/ )._addtocontainer /*String*/ (_cont,(int) (10),(int) (1));
 //BA.debugLineNum = 50;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"a10code\", \"Alert\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a10code","Alert",("vm.CreateAlert(\"a10\", Me, \"info\").SetContent(\"I'm an alert.\").SetBorder(\"right\").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_BLUEGREY, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 10, 1)"))._addtocontainer /*String*/ (_cont,(int) (10),(int) (1));
 //BA.debugLineNum = 52;BA.debugLine="vm.CreateAlert(\"a11\", Me, \"warning\").Show.SetCont";
_vm._createalert /*b4j.example.vmalert*/ ("a11",modalert.getObject(),"warning")._show /*b4j.example.vmalert*/ ()._setcontent /*b4j.example.vmalert*/ ("I'm an alert.")._setborder /*b4j.example.vmalert*/ ("bottom")._setcoloredborder /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._setelevation /*b4j.example.vmalert*/ (BA.NumberToString(2))._setcolorintensity /*b4j.example.vmalert*/ (_vm._color_pink /*String*/ ,_vm._intensity_lighten2 /*String*/ )._addtocontainer /*String*/ (_cont,(int) (11),(int) (1));
 //BA.debugLineNum = 53;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"a11code\", \"Alert\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a11code","Alert",("vm.CreateAlert(\"a11\", Me, \"warning\").SetContent(\"I'm an alert.\").SetBorder(\"bottom\").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_PINK, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 11, 1)"))._addtocontainer /*String*/ (_cont,(int) (11),(int) (1));
 //BA.debugLineNum = 56;BA.debugLine="vm.CreateAlert(\"a12\", Me, \"error\").Show.SetConten";
_vm._createalert /*b4j.example.vmalert*/ ("a12",modalert.getObject(),"error")._show /*b4j.example.vmalert*/ ()._setcontent /*b4j.example.vmalert*/ ("I'm an alert.")._setborder /*b4j.example.vmalert*/ ("left")._setcoloredborder /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._setelevation /*b4j.example.vmalert*/ (BA.NumberToString(2))._setcolorintensity /*b4j.example.vmalert*/ (_vm._color_indigo /*String*/ ,_vm._intensity_lighten2 /*String*/ )._addtocontainer /*String*/ (_cont,(int) (12),(int) (1));
 //BA.debugLineNum = 57;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"a12code\", \"Alert\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a12code","Alert",("vm.CreateAlert(\"a12\", Me, \"error\").SetContent(\"I'm an alert.\").SetBorder(\"left\").SetColoredBorder(True).SetElevation(2).SetColorIntensity(vm.COLOR_INDIGO, vm.INTENSITY_LIGHTEN2).AddToContainer(cont, 12, 1)"))._addtocontainer /*String*/ (_cont,(int) (12),(int) (1));
 //BA.debugLineNum = 60;BA.debugLine="Dim sContent As String = vm.Rand_LoremIpsum(1)";
_scontent = _vm._rand_loremipsum /*String*/ ((int) (1));
 //BA.debugLineNum = 61;BA.debugLine="vm.CreateAlert(\"a13\", Me, \"\").Show.SetContent(sCo";
_vm._createalert /*b4j.example.vmalert*/ ("a13",modalert.getObject(),"")._show /*b4j.example.vmalert*/ ()._setcontent /*b4j.example.vmalert*/ (_scontent)._setborder /*b4j.example.vmalert*/ ("left")._setcloselabel /*b4j.example.vmalert*/ ("Close Alert")._setdismissible /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._setdark /*b4j.example.vmalert*/ (anywheresoftware.b4a.keywords.Common.True)._setcolorintensity /*b4j.example.vmalert*/ (_vm._color_deeppurple /*String*/ ,_vm._intensity_accent4 /*String*/ )._addtocontainer /*String*/ (_cont,(int) (13),(int) (1));
 //BA.debugLineNum = 62;BA.debugLine="pgIndex.CreateVBCode(vue, Me,\"a13code\", \"Alert\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modalert.getObject(),"a13code","Alert",("Dim sContent As String = vm.Rand_LoremIpsum(1)<br>vm.CreateAlert(\"a13\", Me, \"\").Show.SetContent(sContent).SetBorder(\"left\").SetCloseLabel(\"Close Alert\").SetDismissible(True).SetDark(True).SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4).AddToContainer(cont, 13, 1)"))._addtocontainer /*String*/ (_cont,(int) (13),(int) (1));
 //BA.debugLineNum = 66;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"alertCode\"";
_name = "alertCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Alert\"";
_title = "Alert";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
