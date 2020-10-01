package b4j.example;


import anywheresoftware.b4a.BA;

public class modoverlay extends Object{
public static modoverlay mostCurrent = new modoverlay();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modoverlay", null);
		ba.loadHtSubs(modoverlay.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modoverlay", ba);
		}
	}
    public static Class<?> getObject() {
		return modoverlay.class;
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
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modoverlay.getObject());
 //BA.debugLineNum = 15;BA.debugLine="cont.AddRows(2).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (2))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 19;BA.debugLine="vue.AddCode($\"'show the overlay\"$)";
_vue._addcode /*String*/ (("'show the overlay"));
 //BA.debugLineNum = 20;BA.debugLine="vue.AddCode($\"vm.PageResume\"$)";
_vue._addcode /*String*/ (("vm.PageResume"));
 //BA.debugLineNum = 21;BA.debugLine="vue.AddCode($\"'hide the overlay\"$)";
_vue._addcode /*String*/ (("'hide the overlay"));
 //BA.debugLineNum = 22;BA.debugLine="vue.AddCode($\"vm.PagePause\"$)";
_vue._addcode /*String*/ (("vm.PagePause"));
 //BA.debugLineNum = 23;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"overlaycode\", \"Ove";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modoverlay.getObject(),"overlaycode","Overlay",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 26;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 28;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public static String  _overlaycodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub overlaycodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 33;BA.debugLine="vue.CopyCode2Clipboard(\"overlaycode\")";
_vue._copycode2clipboard /*String*/ ("overlaycode");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public static String  _overlaycodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub overlaycodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 37;BA.debugLine="vue.DownloadCode(\"overlaycode\", \"overlaycode.txt\"";
_vue._downloadcode /*String*/ ("overlaycode","overlaycode.txt");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"overlayCode\"";
_name = "overlayCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Overlay\"";
_title = "Overlay";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
