package b4j.example;


import anywheresoftware.b4a.BA;

public class modslider extends Object{
public static modslider mostCurrent = new modslider();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modslider", null);
		ba.loadHtSubs(modslider.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modslider", ba);
		}
	}
    public static Class<?> getObject() {
		return modslider.class;
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
public static b4j.example.modrating _modrating = null;
public static b4j.example.modrealtimelogging _modrealtimelogging = null;
public static b4j.example.modselects _modselects = null;
public static b4j.example.modslidegroups _modslidegroups = null;
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
anywheresoftware.b4a.objects.collections.List _seasons = null;
b4j.example.vmslider _sldx = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code";
 //BA.debugLineNum = 10;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modslider.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 15;BA.debugLine="cont.AddRows(10).AddColumns2x6";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (10))._addcolumns2x6 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 17;BA.debugLine="vm.SetState(CreateMap(\"volume\": 10, \"min\": 0, \"ma";
_vm._setstate /*b4j.example.bananovm*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("volume"),(Object)(10),(Object)("min"),(Object)(0),(Object)("max"),(Object)(100),(Object)("disabled"),(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)("readonly"),(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)("vertical"),(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)("range"),(Object)(anywheresoftware.b4a.keywords.Common.False)}));
 //BA.debugLineNum = 19;BA.debugLine="Dim seasons As List";
_seasons = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 20;BA.debugLine="seasons.Initialize";
_seasons.Initialize();
 //BA.debugLineNum = 21;BA.debugLine="seasons.AddAll(Array(\"Winter\", \"Spring\", \"Summer\"";
_seasons.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Winter"),(Object)("Spring"),(Object)("Summer"),(Object)("Fall")}));
 //BA.debugLineNum = 23;BA.debugLine="vm.CreateSlider(\"sl1\", Me).SetVModel(\"min\").SetMi";
_vm._createslider /*b4j.example.vmslider*/ ("sl1",modslider.getObject())._setvmodel /*b4j.example.vmslider*/ ("min")._setmin /*b4j.example.vmslider*/ ((double)(Double.parseDouble("-100")))._setmax /*b4j.example.vmslider*/ ((double)(Double.parseDouble("100")))._setlabel /*b4j.example.vmslider*/ ("Min")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="vm.CreateSlider(\"sl2\", Me).SetVModel(\"min\").SetRe";
_vm._createslider /*b4j.example.vmslider*/ ("sl2",modslider.getObject())._setvmodel /*b4j.example.vmslider*/ ("min")._setreadonly /*b4j.example.vmslider*/ (anywheresoftware.b4a.keywords.Common.True)._setmin /*b4j.example.vmslider*/ ((double)(Double.parseDouble("-100")))._setmax /*b4j.example.vmslider*/ ((double)(Double.parseDouble("100")))._setlabel /*b4j.example.vmslider*/ ("Read Only")._setvalue /*b4j.example.vmslider*/ ("30")._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="vm.CreateSlider(\"sl3\", Me).SetVModel(\"min\").SetDi";
_vm._createslider /*b4j.example.vmslider*/ ("sl3",modslider.getObject())._setvmodel /*b4j.example.vmslider*/ ("min")._setdisabled /*b4j.example.vmslider*/ (anywheresoftware.b4a.keywords.Common.True)._setmin /*b4j.example.vmslider*/ ((double)(Double.parseDouble("-100")))._setmax /*b4j.example.vmslider*/ ((double)(Double.parseDouble("100")))._setlabel /*b4j.example.vmslider*/ ("Min")._setvalue /*b4j.example.vmslider*/ ("30")._setinverselabel /*b4j.example.vmslider*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 29;BA.debugLine="vm.CreateSlider(\"sl4\", Me).SetPrependIcon(\"volume";
_vm._createslider /*b4j.example.vmslider*/ ("sl4",modslider.getObject())._setprependicon /*b4j.example.vmslider*/ ("volume_up")._setthumblabel /*b4j.example.vmslider*/ ("always")._settrackcolor /*b4j.example.vmslider*/ ("pink")._setthumbcolor /*b4j.example.vmslider*/ ("orange")._setvmodel /*b4j.example.vmslider*/ ("volume")._setmin /*b4j.example.vmslider*/ ((double)(Double.parseDouble("0")))._setmax /*b4j.example.vmslider*/ ((double)(Double.parseDouble("10")))._setlabel /*b4j.example.vmslider*/ ("Volume")._setvalue /*b4j.example.vmslider*/ ("5")._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 31;BA.debugLine="vm.CreateSlider(\"sl5\", Me).SetAppendIcon(\"alarm\")";
_vm._createslider /*b4j.example.vmslider*/ ("sl5",modslider.getObject())._setappendicon /*b4j.example.vmslider*/ ("alarm")._setvmodel /*b4j.example.vmslider*/ ("alarm")._setmin /*b4j.example.vmslider*/ ((double)(Double.parseDouble("0")))._setcolor /*b4j.example.vmslider*/ ("brown")._setmax /*b4j.example.vmslider*/ ((double)(Double.parseDouble("10")))._setlabel /*b4j.example.vmslider*/ ("Alarm")._setvalue /*b4j.example.vmslider*/ ("5")._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 33;BA.debugLine="vm.CreateSlider(\"sl6\", Me).SetPrependIcon(\"zoom_o";
_vm._createslider /*b4j.example.vmslider*/ ("sl6",modslider.getObject())._setprependicon /*b4j.example.vmslider*/ ("zoom_out")._setappendicon /*b4j.example.vmslider*/ ("zoom_in")._setvmodel /*b4j.example.vmslider*/ ("zoom")._setmin /*b4j.example.vmslider*/ ((double)(Double.parseDouble("0")))._setmax /*b4j.example.vmslider*/ ((double)(Double.parseDouble("10")))._setvalue /*b4j.example.vmslider*/ ("5")._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 35;BA.debugLine="Dim sldx As VMSlider = vm.CreateSlider(\"sldx\", Me";
_sldx = _vm._createslider /*b4j.example.vmslider*/ ("sldx",modslider.getObject())._setticklabels /*b4j.example.vmslider*/ (_seasons)._setvmodel /*b4j.example.vmslider*/ ("season")._setvalue /*b4j.example.vmslider*/ ("0");
 //BA.debugLineNum = 36;BA.debugLine="sldx.SetMin(\"0\").SetMax(\"3\").SetTicks(\"always\").S";
_sldx._setmin /*b4j.example.vmslider*/ ((double)(Double.parseDouble("0")))._setmax /*b4j.example.vmslider*/ ((double)(Double.parseDouble("3")))._setticks /*b4j.example.vmslider*/ ("always")._setticksize /*b4j.example.vmslider*/ ((int)(Double.parseDouble("4")))._setstep /*b4j.example.vmslider*/ ((double)(Double.parseDouble("1")));
 //BA.debugLineNum = 37;BA.debugLine="sldx.AddToContainer(cont, 7, 1)";
_sldx._addtocontainer /*String*/ (_cont,(int) (7),(int) (1));
 //BA.debugLineNum = 43;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"sliderCode\"";
_name = "sliderCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Sliders\"";
_title = "Sliders";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static String  _s16_prepend(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub s16_prepend(e As BANanoEvent)";
 //BA.debugLineNum = 53;BA.debugLine="vm.Decrement(\"zoom\", 1)";
_vm._decrement /*b4j.example.bananovm*/ ("zoom",(int) (1));
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public static String  _sl6_append(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub sl6_append(e As BANanoEvent)";
 //BA.debugLineNum = 48;BA.debugLine="vm.Increment(\"zoom\", 1)";
_vm._increment /*b4j.example.bananovm*/ ("zoom",(int) (1));
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
}
