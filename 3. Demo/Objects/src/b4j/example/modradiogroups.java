package b4j.example;


import anywheresoftware.b4a.BA;

public class modradiogroups extends Object{
public static modradiogroups mostCurrent = new modradiogroups();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modradiogroups", null);
		ba.loadHtSubs(modradiogroups.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modradiogroups", ba);
		}
	}
    public static Class<?> getObject() {
		return modradiogroups.class;
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
b4j.example.vmradiogroup _rg1 = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code";
 //BA.debugLineNum = 10;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modradiogroups.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(10).AddColumns2x6";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (10))._addcolumns2x6 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="Dim rg1 As VMRadioGroup = vm.CreateRadioGroup(\"rg";
_rg1 = _vm._createradiogroup /*b4j.example.vmradiogroup*/ ("rg2",modradiogroups.getObject())._setvmodel /*b4j.example.vmradiogroup*/ ("rg2")._sethorizontal /*b4j.example.vmradiogroup*/ (anywheresoftware.b4a.keywords.Common.True)._setlabel /*b4j.example.vmradiogroup*/ ("Other Radios");
 //BA.debugLineNum = 19;BA.debugLine="rg1.SetOptions(CreateMap(\"rad1\":\"Radio 1\",\"rad2\":";
_rg1._setoptions /*String*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("rad1"),(Object)("Radio 1"),(Object)("rad2"),(Object)("Radio 2"),(Object)("rad3"),(Object)("Radio 3")}));
 //BA.debugLineNum = 20;BA.debugLine="rg1.SetOnChange(Me, \"rg2_change\")";
_rg1._setonchange /*b4j.example.vmradiogroup*/ (modradiogroups.getObject(),"rg2_change");
 //BA.debugLineNum = 21;BA.debugLine="rg1.AddToContainer(cont, 1, 1)";
_rg1._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"radioCode\"";
_name = "radioCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Radio Groups\"";
_title = "Radio Groups";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static String  _rg2_change(Object _e) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub rg2_change(e As Object)";
 //BA.debugLineNum = 27;BA.debugLine="vm.ShowSnackBar(e)";
_vm._showsnackbar /*String*/ (BA.ObjectToString(_e));
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
}
