package b4j.example;


import anywheresoftware.b4a.BA;

public class modsparkline extends Object{
public static modsparkline mostCurrent = new modsparkline();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modsparkline", null);
		ba.loadHtSubs(modsparkline.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modsparkline", ba);
		}
	}
    public static Class<?> getObject() {
		return modsparkline.class;
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
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmsparkline _sparksparkline1 = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modsparkline.getObject());
 //BA.debugLineNum = 15;BA.debugLine="cont.AddRows(2).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (2))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 17;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Dim sparksparkline1 As VMSparkLine";
_sparksparkline1 = new b4j.example.vmsparkline();
 //BA.debugLineNum = 21;BA.debugLine="sparksparkline1.Initialize(vue, \"sparksparkline1\"";
_sparksparkline1._initialize /*b4j.example.vmsparkline*/ (ba,_vue,"sparksparkline1",modsparkline.getObject());
 //BA.debugLineNum = 22;BA.debugLine="sparksparkline1.SetValue(Array(0, 2, 5 ,9 ,5 ,10";
_sparksparkline1._setvalue /*b4j.example.vmsparkline*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0),(Object)(2),(Object)(5),(Object)(9),(Object)(5),(Object)(10),(Object)(3),(Object)(5),(Object)(0),(Object)(0),(Object)(1),(Object)(8),(Object)(2),(Object)(9),(Object)(0)}));
 //BA.debugLineNum = 23;BA.debugLine="sparksparkline1.SetGradient(Array(\"#f72047\", \"#ff";
_sparksparkline1._setgradient /*b4j.example.vmsparkline*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("#f72047"),(Object)("#ffd200"),(Object)("#1feaea")}));
 //BA.debugLineNum = 24;BA.debugLine="sparksparkline1.SetSmooth(10)";
_sparksparkline1._setsmooth /*b4j.example.vmsparkline*/ (BA.ObjectToBoolean(10));
 //BA.debugLineNum = 25;BA.debugLine="sparksparkline1.SetPadding(\"8\")";
_sparksparkline1._setpadding /*b4j.example.vmsparkline*/ ("8");
 //BA.debugLineNum = 26;BA.debugLine="sparksparkline1.SetLinewidth(\"2\")";
_sparksparkline1._setlinewidth /*b4j.example.vmsparkline*/ ("2");
 //BA.debugLineNum = 27;BA.debugLine="sparksparkline1.SetStrokeLineCap(\"round\")";
_sparksparkline1._setstrokelinecap /*b4j.example.vmsparkline*/ ("round");
 //BA.debugLineNum = 28;BA.debugLine="sparksparkline1.SetGradientdirection(\"top\")";
_sparksparkline1._setgradientdirection /*b4j.example.vmsparkline*/ ("top");
 //BA.debugLineNum = 29;BA.debugLine="sparksparkline1.SetFill(False)";
_sparksparkline1._setfill /*b4j.example.vmsparkline*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 30;BA.debugLine="sparksparkline1.SetType(\"trend\")";
_sparksparkline1._settype /*b4j.example.vmsparkline*/ ("trend");
 //BA.debugLineNum = 31;BA.debugLine="sparksparkline1.SetAutoLineWidth(False)";
_sparksparkline1._setautolinewidth /*b4j.example.vmsparkline*/ (anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 32;BA.debugLine="sparksparkline1.SetVisible(True)";
_sparksparkline1._setvisible /*b4j.example.vmsparkline*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 33;BA.debugLine="sparksparkline1.SetAutoDraw(True)";
_sparksparkline1._setautodraw /*b4j.example.vmsparkline*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 34;BA.debugLine="sparksparkline1.AddToContainer(cont,1,1)";
_sparksparkline1._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 37;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 38;BA.debugLine="vue.AddCode($\"Dim sparksparkline1 As VMSparkLine\"$";
_vue._addcode /*String*/ (("Dim sparksparkline1 As VMSparkLine"));
 //BA.debugLineNum = 39;BA.debugLine="vue.AddCode($\"sparksparkline1.Initialize(vue, \"spa";
_vue._addcode /*String*/ (("sparksparkline1.Initialize(vue, \"sparksparkline1\", Me)"));
 //BA.debugLineNum = 40;BA.debugLine="vue.AddCode($\"sparksparkline1.SetValue(Array(0, 2,";
_vue._addcode /*String*/ (("sparksparkline1.SetValue(Array(0, 2, 5 ,9 ,5 ,10 ,3, 5, 0, 0, 1, 8, 2, 9, 0))"));
 //BA.debugLineNum = 41;BA.debugLine="vue.AddCode($\"sparksparkline1.SetGradient(Array(\"#";
_vue._addcode /*String*/ (("sparksparkline1.SetGradient(Array(\"#f72047\", \"#ffd200\", \"#1feaea\"))"));
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"sparksparkline1.SetSmooth(10)\"$)";
_vue._addcode /*String*/ (("sparksparkline1.SetSmooth(10)"));
 //BA.debugLineNum = 43;BA.debugLine="vue.AddCode($\"sparksparkline1.SetPadding(\"8\")\"$)";
_vue._addcode /*String*/ (("sparksparkline1.SetPadding(\"8\")"));
 //BA.debugLineNum = 44;BA.debugLine="vue.AddCode($\"sparksparkline1.SetLinewidth(\"2\")\"$)";
_vue._addcode /*String*/ (("sparksparkline1.SetLinewidth(\"2\")"));
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"sparksparkline1.SetStrokeLineCap(\"ro";
_vue._addcode /*String*/ (("sparksparkline1.SetStrokeLineCap(\"round\")"));
 //BA.debugLineNum = 46;BA.debugLine="vue.AddCode($\"sparksparkline1.SetGradientdirection";
_vue._addcode /*String*/ (("sparksparkline1.SetGradientdirection(\"top\")"));
 //BA.debugLineNum = 47;BA.debugLine="vue.AddCode($\"sparksparkline1.SetFill(False)\"$)";
_vue._addcode /*String*/ (("sparksparkline1.SetFill(False)"));
 //BA.debugLineNum = 48;BA.debugLine="vue.AddCode($\"sparksparkline1.SetType(\"trend\")\"$)";
_vue._addcode /*String*/ (("sparksparkline1.SetType(\"trend\")"));
 //BA.debugLineNum = 49;BA.debugLine="vue.AddCode($\"sparksparkline1.SetAutoLineWidth(Fal";
_vue._addcode /*String*/ (("sparksparkline1.SetAutoLineWidth(False)"));
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"sparksparkline1.SetVisible(True)\"$)";
_vue._addcode /*String*/ (("sparksparkline1.SetVisible(True)"));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"sparksparkline1.SetAutoDraw(True)\"$)";
_vue._addcode /*String*/ (("sparksparkline1.SetAutoDraw(True)"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"sparksparkline1.AddToContainer(cont,";
_vue._addcode /*String*/ (("sparksparkline1.AddToContainer(cont,1,1)"));
 //BA.debugLineNum = 53;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"sparkcode\", \"Sparkl";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modsparkline.getObject(),"sparkcode","Sparkline",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 57;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"sparkLineCode\"";
_name = "sparkLineCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"SparkLine\"";
_title = "SparkLine";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _sparkcodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub sparkcodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 63;BA.debugLine="vue.CopyCode2Clipboard(\"sparkcode\")";
_vue._copycode2clipboard /*String*/ ("sparkcode");
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static String  _sparkcodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub sparkcodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 67;BA.debugLine="vue.DownloadCode(\"sparkcode\", \"sparkcode.txt\")";
_vue._downloadcode /*String*/ ("sparkcode","sparkcode.txt");
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
}
