package b4j.example;


import anywheresoftware.b4a.BA;

public class modrating extends Object{
public static modrating mostCurrent = new modrating();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modrating", null);
		ba.loadHtSubs(modrating.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modrating", ba);
		}
	}
    public static Class<?> getObject() {
		return modrating.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
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
b4j.example.vmrating _r1 = null;
b4j.example.vmrating _r2 = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code";
 //BA.debugLineNum = 10;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modrating.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(5).AddColumns4x3";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (5))._addcolumns4x3 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.setdata(\"rating\", 4)";
_vm._setdata /*b4j.example.bananovm*/ ("rating",(Object)(4));
 //BA.debugLineNum = 20;BA.debugLine="Dim r1 As VMRating = vm.CreateRating(\"r1\", Me).Se";
_r1 = _vm._createrating /*b4j.example.vmrating*/ ("r1",modrating.getObject())._setvmodel /*b4j.example.vmrating*/ ("rating")._setbackgroundcolorintensity /*b4j.example.vmrating*/ (_vm._color_purple /*String*/ ,_vm._intensity_lighten3 /*String*/ );
 //BA.debugLineNum = 21;BA.debugLine="r1.SetColor(vm.color_purple).SetSmall(True)";
_r1._setcolor /*b4j.example.vmrating*/ (_vm._color_purple /*String*/ )._setsmall /*b4j.example.vmrating*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 22;BA.debugLine="cont.AddComponent(1, 1, r1.tostring)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_r1._tostring /*String*/ ());
 //BA.debugLineNum = 24;BA.debugLine="Dim r2 As VMRating = vm.CreateRating(\"r2\", Me).Se";
_r2 = _vm._createrating /*b4j.example.vmrating*/ ("r2",modrating.getObject())._setvmodel /*b4j.example.vmrating*/ ("rating")._setbackgroundcolorintensity /*b4j.example.vmrating*/ (_vm._color_pink /*String*/ ,_vm._intensity_lighten3 /*String*/ );
 //BA.debugLineNum = 25;BA.debugLine="r2.SetColor(vm.color_pink).SetSize(\"64\")";
_r2._setcolor /*b4j.example.vmrating*/ (_vm._color_pink /*String*/ )._setsize /*b4j.example.vmrating*/ ("64");
 //BA.debugLineNum = 26;BA.debugLine="cont.AddComponent(1, 2, r2.tostring)";
_cont._addcomponent /*String*/ ((int) (1),(int) (2),_r2._tostring /*String*/ ());
 //BA.debugLineNum = 29;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"ratingCode\"";
_name = "ratingCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Rating\"";
_title = "Rating";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
