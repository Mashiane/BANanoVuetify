package b4j.example;


import anywheresoftware.b4a.BA;

public class modbottomnavigation extends Object{
public static modbottomnavigation mostCurrent = new modbottomnavigation();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modbottomnavigation", null);
		ba.loadHtSubs(modbottomnavigation.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modbottomnavigation", ba);
		}
	}
    public static Class<?> getObject() {
		return modbottomnavigation.class;
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
public static String  _botnavcodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub botnavcodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 55;BA.debugLine="vue.CopyCode2Clipboard(\"botnavcode\")";
_vue._copycode2clipboard /*String*/ ("botnavcode");
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public static String  _botnavcodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub botnavcodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 59;BA.debugLine="vue.DownloadCode(\"botnavcode\", \"botnavcode.txt\")";
_vue._downloadcode /*String*/ ("botnavcode","botnavcode.txt");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
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
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modbottomnavigation.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.addrows(1).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (1))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="vm.BottomNav.Hide";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._hide /*b4j.example.vmbottomnavigation*/ ();
 //BA.debugLineNum = 21;BA.debugLine="vm.BottomNav.SetVModel(\"botnav\")";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._setvmodel /*b4j.example.vmbottomnavigation*/ ("botnav");
 //BA.debugLineNum = 22;BA.debugLine="vm.BottomNav.SetAbsolute(True)";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._setabsolute /*b4j.example.vmbottomnavigation*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 23;BA.debugLine="vm.BottomNav.SetGrow(True)";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._setgrow /*b4j.example.vmbottomnavigation*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 24;BA.debugLine="vm.BottomNav.SetHeight(\"56\")";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._setheight /*b4j.example.vmbottomnavigation*/ ("56");
 //BA.debugLineNum = 25;BA.debugLine="vm.BottomNav.SetShift(True)";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._setshift /*b4j.example.vmbottomnavigation*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 27;BA.debugLine="vm.BottomNav.AddButton(\"btnaz\", \"Banner\", \"dashbo";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._addbutton /*String*/ ("btnaz","Banner","dashboard","red","btnaz","A business banner","");
 //BA.debugLineNum = 28;BA.debugLine="vm.BottomNav.AddButton(\"btnbz\", \"Squirrel\", \"acco";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._addbutton /*String*/ ("btnbz","Squirrel","account_box","indigo","btnbz","Another squirrel","");
 //BA.debugLineNum = 29;BA.debugLine="vm.BottomNav.AddButton(\"btncz\", \"Sky\", \"gavel\", \"";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._addbutton /*String*/ ("btncz","Sky","gavel","green","btncz","Heavens","");
 //BA.debugLineNum = 30;BA.debugLine="vm.BottomNav.AddButton(\"btndz\", \"Planet\", \"questi";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._addbutton /*String*/ ("btndz","Planet","question_answer","purple","btndz","Planets of the world","");
 //BA.debugLineNum = 31;BA.debugLine="vm.BottomNav.AddButton(\"btnez\", \"Bird\", \"mdi-acco";
_vm._bottomnav /*b4j.example.vmbottomnavigation*/ ._addbutton /*String*/ ("btnez","Bird","mdi-account","yellow","btnez","This is a beautiful bird","");
 //BA.debugLineNum = 34;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 35;BA.debugLine="vue.AddCode($\"vm.BottomNav.Hide\"$)";
_vue._addcode /*String*/ (("vm.BottomNav.Hide"));
 //BA.debugLineNum = 36;BA.debugLine="vue.AddCode($\"vm.BottomNav.SetVModel(\"botnav\")\"$)";
_vue._addcode /*String*/ (("vm.BottomNav.SetVModel(\"botnav\")"));
 //BA.debugLineNum = 37;BA.debugLine="vue.AddCode($\"vm.BottomNav.SetAbsolute(True)\"$)";
_vue._addcode /*String*/ (("vm.BottomNav.SetAbsolute(True)"));
 //BA.debugLineNum = 38;BA.debugLine="vue.AddCode($\"vm.BottomNav.SetGrow(True)\"$)";
_vue._addcode /*String*/ (("vm.BottomNav.SetGrow(True)"));
 //BA.debugLineNum = 39;BA.debugLine="vue.AddCode($\"vm.BottomNav.SetHeight(\"56\")\"$)";
_vue._addcode /*String*/ (("vm.BottomNav.SetHeight(\"56\")"));
 //BA.debugLineNum = 40;BA.debugLine="vue.AddCode($\"vm.BottomNav.SetShift(True)\"$)";
_vue._addcode /*String*/ (("vm.BottomNav.SetShift(True)"));
 //BA.debugLineNum = 41;BA.debugLine="vue.AddCode($\"'add items\"$)";
_vue._addcode /*String*/ (("'add items"));
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"vm.BottomNav.AddButton(\"btnaz\", \"Ban";
_vue._addcode /*String*/ (("vm.BottomNav.AddButton(\"btnaz\", \"Banner\", \"dashboard\", \"red\", \"btnaz\", \"A business banner\", \"\")"));
 //BA.debugLineNum = 43;BA.debugLine="vue.AddCode($\"vm.BottomNav.AddButton(\"btnbz\", \"Squ";
_vue._addcode /*String*/ (("vm.BottomNav.AddButton(\"btnbz\", \"Squirrel\", \"account_box\", \"indigo\", \"btnbz\", \"Another squirrel\", \"\")"));
 //BA.debugLineNum = 44;BA.debugLine="vue.AddCode($\"vm.BottomNav.AddButton(\"btncz\", \"Sky";
_vue._addcode /*String*/ (("vm.BottomNav.AddButton(\"btncz\", \"Sky\", \"gavel\", \"green\", \"btncz\", \"Heavens\", \"\")"));
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"vm.BottomNav.AddButton(\"btndz\", \"Pla";
_vue._addcode /*String*/ (("vm.BottomNav.AddButton(\"btndz\", \"Planet\", \"question_answer\", \"purple\", \"btndz\", \"Planets of the world\", \"\")"));
 //BA.debugLineNum = 46;BA.debugLine="vue.AddCode($\"vm.BottomNav.AddButton(\"btnez\", \"Bir";
_vue._addcode /*String*/ (("vm.BottomNav.AddButton(\"btnez\", \"Bird\", \"mdi-account\", \"yellow\", \"btnez\", \"This is a beautiful bird\", \"\")"));
 //BA.debugLineNum = 47;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"botnavcode\", \"Botto";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbottomnavigation.getObject(),"botnavcode","Bottom Nav",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 50;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"bottomNavCode\"";
_name = "bottomNavCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Bottom Navigation\"";
_title = "Bottom Navigation";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
