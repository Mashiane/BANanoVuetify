package b4j.example;


import anywheresoftware.b4a.BA;

public class modfileinput extends Object{
public static modfileinput mostCurrent = new modfileinput();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modfileinput", null);
		ba.loadHtSubs(modfileinput.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modfileinput", ba);
		}
	}
    public static Class<?> getObject() {
		return modfileinput.class;
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
b4j.example.vmfileinput _fi9 = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code";
 //BA.debugLineNum = 10;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modfileinput.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.AddRows(10).AddColumns(1, 12, 12, 12, 12)";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (10))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int) (12),(int) (12),(int) (12),(int) (12));
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateFileInput(\"fi1\", Me).SetMultiple(True).S";
_vm._createfileinput /*b4j.example.vmfileinput*/ ("fi1",modfileinput.getObject())._setmultiple /*b4j.example.vmfileinput*/ (anywheresoftware.b4a.keywords.Common.True)._setlabel /*b4j.example.vmfileinput*/ ("File input")._setvmodel /*b4j.example.vmfileinput*/ ("myfiles")._setplaceholder /*b4j.example.vmfileinput*/ ("Please choose some files")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateFileInput(\"fi2\", Me).SetAccept(\"image/*\"";
_vm._createfileinput /*b4j.example.vmfileinput*/ ("fi2",modfileinput.getObject())._setaccept /*b4j.example.vmfileinput*/ ("image/*")._setlabel /*b4j.example.vmfileinput*/ ("File input")._setprependicon /*b4j.example.vmfileinput*/ ("mdi-camera")._sethideinput /*b4j.example.vmfileinput*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateFileInput(\"fi3\", Me).SetChips(True).SetL";
_vm._createfileinput /*b4j.example.vmfileinput*/ ("fi3",modfileinput.getObject())._setchips /*b4j.example.vmfileinput*/ (anywheresoftware.b4a.keywords.Common.True)._setlabel /*b4j.example.vmfileinput*/ ("File input (with chips)")._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="vm.CreateFileInput(\"fi4\", Me).SetSmallChips(True)";
_vm._createfileinput /*b4j.example.vmfileinput*/ ("fi4",modfileinput.getObject())._setsmallchips /*b4j.example.vmfileinput*/ (anywheresoftware.b4a.keywords.Common.True)._setlabel /*b4j.example.vmfileinput*/ ("File input (with small chips)")._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 26;BA.debugLine="vm.CreateFileInput(\"fi5\", Me).SetShowSize(True).S";
_vm._createfileinput /*b4j.example.vmfileinput*/ ("fi5",modfileinput.getObject())._setshowsize /*b4j.example.vmfileinput*/ (anywheresoftware.b4a.keywords.Common.True)._setlabel /*b4j.example.vmfileinput*/ ("File input (show size)")._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 28;BA.debugLine="vm.CreateFileInput(\"fi6\", Me).SetMultiple(True).S";
_vm._createfileinput /*b4j.example.vmfileinput*/ ("fi6",modfileinput.getObject())._setmultiple /*b4j.example.vmfileinput*/ (anywheresoftware.b4a.keywords.Common.True)._setshowsize /*b4j.example.vmfileinput*/ (anywheresoftware.b4a.keywords.Common.True)._setcounter /*b4j.example.vmfileinput*/ (BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True))._setlabel /*b4j.example.vmfileinput*/ ("File input (show size & counter)")._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="vm.CreateFileInput(\"fi7\", Me).SetFilled(True).Set";
_vm._createfileinput /*b4j.example.vmfileinput*/ ("fi7",modfileinput.getObject())._setfilled /*b4j.example.vmfileinput*/ (anywheresoftware.b4a.keywords.Common.True)._setprependicon /*b4j.example.vmfileinput*/ ("mdi-camera")._setlabel /*b4j.example.vmfileinput*/ ("File input (custom)")._addtocontainer /*String*/ (_cont,(int) (7),(int) (1));
 //BA.debugLineNum = 32;BA.debugLine="vm.CreateFileInput(\"fi8\", Me).SetOutlined(True).S";
_vm._createfileinput /*b4j.example.vmfileinput*/ ("fi8",modfileinput.getObject())._setoutlined /*b4j.example.vmfileinput*/ (anywheresoftware.b4a.keywords.Common.True)._setdense /*b4j.example.vmfileinput*/ (anywheresoftware.b4a.keywords.Common.True)._setlabel /*b4j.example.vmfileinput*/ ("File input (custom)")._addtocontainer /*String*/ (_cont,(int) (8),(int) (1));
 //BA.debugLineNum = 34;BA.debugLine="Dim fi9 As VMFileInput = vm.CreateFileInput(\"fi9\"";
_fi9 = _vm._createfileinput /*b4j.example.vmfileinput*/ ("fi9",modfileinput.getObject())._setvmodel /*b4j.example.vmfileinput*/ ("files")._setcolorintensity /*b4j.example.vmfileinput*/ (_vm._vue /*b4j.example.bananovue*/ ._color_deeppurple /*String*/ ,_vm._vue /*b4j.example.bananovue*/ ._intensity_accent4 /*String*/ );
 //BA.debugLineNum = 35;BA.debugLine="fi9.SetCounter(True).SetLabel(\"File Input\").SetMu";
_fi9._setcounter /*b4j.example.vmfileinput*/ (BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True))._setlabel /*b4j.example.vmfileinput*/ ("File Input")._setmultiple /*b4j.example.vmfileinput*/ (anywheresoftware.b4a.keywords.Common.True)._setplaceholder /*b4j.example.vmfileinput*/ ("Select your files");
 //BA.debugLineNum = 36;BA.debugLine="fi9.SetPrependIcon(\"mdi-paperclip\").SetOutlined(T";
_fi9._setprependicon /*b4j.example.vmfileinput*/ ("mdi-paperclip")._setoutlined /*b4j.example.vmfileinput*/ (anywheresoftware.b4a.keywords.Common.True)._setshowsize /*b4j.example.vmfileinput*/ (BA.ObjectToBoolean("1000"))._addtocontainer /*String*/ (_cont,(int) (9),(int) (1));
 //BA.debugLineNum = 39;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public static String  _fi1_change(anywheresoftware.b4a.objects.collections.List _filelist) throws Exception{
Object _obj = null;
 //BA.debugLineNum = 43;BA.debugLine="Sub fi1_change(fileList As List)";
 //BA.debugLineNum = 44;BA.debugLine="For Each obj As Object In fileList";
{
final anywheresoftware.b4a.BA.IterableList group1 = _filelist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_obj = group1.Get(index1);
 //BA.debugLineNum = 45;BA.debugLine="Log(obj)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_obj));
 }
};
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"fileinputCode\"";
_name = "fileinputCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"File Input\"";
_title = "File Input";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
