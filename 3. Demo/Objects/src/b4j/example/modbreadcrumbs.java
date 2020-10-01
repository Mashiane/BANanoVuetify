package b4j.example;


import anywheresoftware.b4a.BA;

public class modbreadcrumbs extends Object{
public static modbreadcrumbs mostCurrent = new modbreadcrumbs();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modbreadcrumbs", null);
		ba.loadHtSubs(modbreadcrumbs.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modbreadcrumbs", ba);
		}
	}
    public static Class<?> getObject() {
		return modbreadcrumbs.class;
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
public static String  _bccodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub bccodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 55;BA.debugLine="vue.CopyCode2Clipboard(\"bccode\")";
_vue._copycode2clipboard /*String*/ ("bccode");
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public static String  _bccodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub bccodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 59;BA.debugLine="vue.DownloadCode(\"bccode\", \"bccode.txt\")";
_vue._downloadcode /*String*/ ("bccode","bccode.txt");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmbreadcrumbs _bcbreadcrumbs1 = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modbreadcrumbs.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.AddRows(2).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (2))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Dim bcbreadcrumbs1 As VMBreadCrumbs";
_bcbreadcrumbs1 = new b4j.example.vmbreadcrumbs();
 //BA.debugLineNum = 21;BA.debugLine="bcbreadcrumbs1.Initialize(vue, \"bcbreadcrumbs1\",";
_bcbreadcrumbs1._initialize /*b4j.example.vmbreadcrumbs*/ (ba,_vue,"bcbreadcrumbs1",modbreadcrumbs.getObject());
 //BA.debugLineNum = 22;BA.debugLine="bcbreadcrumbs1.SetVisible(True)";
_bcbreadcrumbs1._setvisible /*b4j.example.vmbreadcrumbs*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 24;BA.debugLine="bcbreadcrumbs1.clear";
_bcbreadcrumbs1._clear /*String*/ ();
 //BA.debugLineNum = 25;BA.debugLine="bcbreadcrumbs1.AddItem(\"Banner\", \"\", \"\", False, F";
_bcbreadcrumbs1._additem /*String*/ ("Banner","","",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 26;BA.debugLine="bcbreadcrumbs1.AddItem(\"Squirrel\", \"\", \"\", False,";
_bcbreadcrumbs1._additem /*String*/ ("Squirrel","","",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 27;BA.debugLine="bcbreadcrumbs1.AddItem(\"Sky\", \"\", \"\", False, Fals";
_bcbreadcrumbs1._additem /*String*/ ("Sky","","",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 28;BA.debugLine="bcbreadcrumbs1.AddItem(\"Planet\", \"\", \"\", False, F";
_bcbreadcrumbs1._additem /*String*/ ("Planet","","",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 29;BA.debugLine="bcbreadcrumbs1.AddItem(\"Bird\", \"\", \"\", False, Fal";
_bcbreadcrumbs1._additem /*String*/ ("Bird","","",anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 30;BA.debugLine="bcbreadcrumbs1.Refresh";
_bcbreadcrumbs1._refresh /*String*/ ();
 //BA.debugLineNum = 31;BA.debugLine="bcbreadcrumbs1.AddToContainer(cont, 2,1)";
_bcbreadcrumbs1._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 34;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 35;BA.debugLine="vue.AddCode($\"Dim bcbreadcrumbs1 As VMBreadCrumbs\"";
_vue._addcode /*String*/ (("Dim bcbreadcrumbs1 As VMBreadCrumbs"));
 //BA.debugLineNum = 36;BA.debugLine="vue.AddCode($\"bcbreadcrumbs1.Initialize(vue, \"bcbr";
_vue._addcode /*String*/ (("bcbreadcrumbs1.Initialize(vue, \"bcbreadcrumbs1\", Me)"));
 //BA.debugLineNum = 37;BA.debugLine="vue.AddCode($\"bcbreadcrumbs1.SetVisible(True)\"$)";
_vue._addcode /*String*/ (("bcbreadcrumbs1.SetVisible(True)"));
 //BA.debugLineNum = 38;BA.debugLine="vue.AddCode($\"'add each item\"$)";
_vue._addcode /*String*/ (("'add each item"));
 //BA.debugLineNum = 39;BA.debugLine="vue.AddCode($\"bcbreadcrumbs1.clear\"$)";
_vue._addcode /*String*/ (("bcbreadcrumbs1.clear"));
 //BA.debugLineNum = 40;BA.debugLine="vue.AddCode($\"bcbreadcrumbs1.AddItem(\"Banner\", \"\",";
_vue._addcode /*String*/ (("bcbreadcrumbs1.AddItem(\"Banner\", \"\", \"\", False, False, True)"));
 //BA.debugLineNum = 41;BA.debugLine="vue.AddCode($\"bcbreadcrumbs1.AddItem(\"Squirrel\", \"";
_vue._addcode /*String*/ (("bcbreadcrumbs1.AddItem(\"Squirrel\", \"\", \"\", False, False, True)"));
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"bcbreadcrumbs1.AddItem(\"Sky\", \"\", \"\"";
_vue._addcode /*String*/ (("bcbreadcrumbs1.AddItem(\"Sky\", \"\", \"\", False, False, True)"));
 //BA.debugLineNum = 43;BA.debugLine="vue.AddCode($\"bcbreadcrumbs1.AddItem(\"Planet\", \"\",";
_vue._addcode /*String*/ (("bcbreadcrumbs1.AddItem(\"Planet\", \"\", \"\", False, False, True)"));
 //BA.debugLineNum = 44;BA.debugLine="vue.AddCode($\"bcbreadcrumbs1.AddItem(\"Bird\", \"\", \"";
_vue._addcode /*String*/ (("bcbreadcrumbs1.AddItem(\"Bird\", \"\", \"\", False, False, True)"));
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"bcbreadcrumbs1.Refresh\"$)";
_vue._addcode /*String*/ (("bcbreadcrumbs1.Refresh"));
 //BA.debugLineNum = 46;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 47;BA.debugLine="vue.AddCode($\"bcbreadcrumbs1.AddToContainer(cont,";
_vue._addcode /*String*/ (("bcbreadcrumbs1.AddToContainer(cont, 2,1)"));
 //BA.debugLineNum = 48;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"bccode\", \"Bread Cru";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbreadcrumbs.getObject(),"bccode","Bread Crumb",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 51;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"breadCode\"";
_name = "breadCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Bread Crumbs\"";
_title = "Bread Crumbs";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
