package b4j.example;


import anywheresoftware.b4a.BA;

public class modloadingskeleton extends Object{
public static modloadingskeleton mostCurrent = new modloadingskeleton();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modloadingskeleton", null);
		ba.loadHtSubs(modloadingskeleton.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modloadingskeleton", ba);
		}
	}
    public static Class<?> getObject() {
		return modloadingskeleton.class;
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
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmsheet _s1 = null;
b4j.example.vmskeletonloader _skl = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modloadingskeleton.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.AddRows(4).AddColumns2X6";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (4))._addcolumns2x6 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Dim s1 As VMSheet = vm.createsheet(\"sheet1\", Me).";
_s1 = _vm._createsheet /*b4j.example.vmsheet*/ ("sheet1",modloadingskeleton.getObject())._addclass /*b4j.example.vmsheet*/ ("px-3 pt-3 pb-3");
 //BA.debugLineNum = 22;BA.debugLine="Dim skl As VMSkeletonLoader = vm.CreateSkeletonLo";
_skl = _vm._createskeletonloader /*b4j.example.vmskeletonloader*/ ("sl1",modloadingskeleton.getObject())._addclass /*b4j.example.vmskeletonloader*/ ("mx-auto")._setmaxwidth /*b4j.example.vmskeletonloader*/ ((Object)("300"))._settype /*b4j.example.vmskeletonloader*/ ((Object)("card"));
 //BA.debugLineNum = 24;BA.debugLine="s1.AddComponent(skl.tostring)";
_s1._addcomponent /*b4j.example.vmsheet*/ (_skl._tostring /*String*/ ());
 //BA.debugLineNum = 26;BA.debugLine="cont.AddComponent(1, 1, s1.tostring)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_s1._tostring /*String*/ ());
 //BA.debugLineNum = 29;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 30;BA.debugLine="vue.AddCode($\"Dim s1 As VMSheet = vm.createsheet(";
_vue._addcode /*String*/ (("Dim s1 As VMSheet = vm.createsheet(\"sheet1\", Me).AddClass(\"px-3 pt-3 pb-3\")"));
 //BA.debugLineNum = 31;BA.debugLine="vue.AddCode($\"Dim skl As VMSkeletonLoader = vm.Cr";
_vue._addcode /*String*/ (("Dim skl As VMSkeletonLoader = vm.CreateSkeletonLoader(\"sl1\", Me).AddClass(\"mx-auto\").SetMaxWidth(\"300\").SetType(\"card\")"));
 //BA.debugLineNum = 32;BA.debugLine="vue.AddCode($\"s1.AddComponent(skl.tostring)\"$)";
_vue._addcode /*String*/ (("s1.AddComponent(skl.tostring)"));
 //BA.debugLineNum = 33;BA.debugLine="vue.AddCode($\"cont.AddComponent(1, 1, s1.tostring";
_vue._addcode /*String*/ (("cont.AddComponent(1, 1, s1.tostring)"));
 //BA.debugLineNum = 34;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"skel1code\", \"Skele";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modloadingskeleton.getObject(),"skel1code","Skeleton",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 38;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"skeletonCode\"";
_name = "skeletonCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Skeleton Loaders\"";
_title = "Skeleton Loaders";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _skel1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub skel1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 43;BA.debugLine="vue.CopyCode2Clipboard(\"skel1code\")";
_vue._copycode2clipboard /*String*/ ("skel1code");
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _skel1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub skel1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 47;BA.debugLine="vue.DownloadCode(\"skel1code\", \"skel1code.txt\")";
_vue._downloadcode /*String*/ ("skel1code","skel1code.txt");
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
}
