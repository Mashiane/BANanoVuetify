package b4j.example;


import anywheresoftware.b4a.BA;

public class modtextarea extends Object{
public static modtextarea mostCurrent = new modtextarea();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modtextarea", null);
		ba.loadHtSubs(modtextarea.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modtextarea", ba);
		}
	}
    public static Class<?> getObject() {
		return modtextarea.class;
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
public static b4j.example.modslider _modslider = null;
public static b4j.example.modsnackbar _modsnackbar = null;
public static b4j.example.modstepper _modstepper = null;
public static b4j.example.modswitch _modswitch = null;
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
b4j.example.vmtextfield _ta4 = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code";
 //BA.debugLineNum = 10;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modtextarea.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(10).AddColumns2x6";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (10))._addcolumns2x6 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateTextArea(\"ta1\", Me).SetLabel(\"Prepend Ic";
_vm._createtextarea /*b4j.example.vmtextfield*/ ("ta1",modtextarea.getObject())._setlabel /*b4j.example.vmtextfield*/ ("Prepend Icon")._setrows /*b4j.example.vmtextfield*/ (BA.NumberToString(1))._setprependicon /*b4j.example.vmtextfield*/ ("comment")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateTextArea(\"ta2\", Me).SetLabel(\"Prepend In";
_vm._createtextarea /*b4j.example.vmtextfield*/ ("ta2",modtextarea.getObject())._setlabel /*b4j.example.vmtextfield*/ ("Prepend Inner Icon")._setprependinnericon /*b4j.example.vmtextfield*/ ("comment")._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateTextArea(\"ta3\", Me).SetLabel(\"Prepend Ou";
_vm._createtextarea /*b4j.example.vmtextfield*/ ("ta3",modtextarea.getObject())._setlabel /*b4j.example.vmtextfield*/ ("Prepend Outer Icon")._setappendoutericon /*b4j.example.vmtextfield*/ ("comment")._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="Dim ta4 As VMTextField = vm.CreateTextArea(\"ta4\",";
_ta4 = _vm._createtextarea /*b4j.example.vmtextfield*/ ("ta4",modtextarea.getObject());
 //BA.debugLineNum = 25;BA.debugLine="ta4.SetLabel(\"Label\").SetAutoGrow(True).SetName(\"";
_ta4._setlabel /*b4j.example.vmtextfield*/ ("Label")._setautogrow /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setname /*b4j.example.vmtextfield*/ ((Object)("ta4"),anywheresoftware.b4a.keywords.Common.False)._setfilled /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 26;BA.debugLine="ta4.SetValue(\"The Woodman set to work at once, an";
_ta4._setvalue /*b4j.example.vmtextfield*/ ("The Woodman set to work at once, and so sharp was his axe that the tree was soon chopped nearly through.")._addtocontainer /*String*/ (_cont,(int) (2),(int) (2));
 //BA.debugLineNum = 28;BA.debugLine="vm.CreateTextArea(\"ta5\", Me).SetLabel(\"Background";
_vm._createtextarea /*b4j.example.vmtextfield*/ ("ta5",modtextarea.getObject())._setlabel /*b4j.example.vmtextfield*/ ("Background")._setbackgroundcolorintensity /*b4j.example.vmtextfield*/ ((Object)(_vm._vue /*b4j.example.bananovue*/ ._color_amber /*String*/ ),_vm._vue /*b4j.example.bananovue*/ ._intensity_accent1 /*String*/ )._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="vm.CreateTextArea(\"ta6\", Me).SetLabel(\"Clearable\"";
_vm._createtextarea /*b4j.example.vmtextfield*/ ("ta6",modtextarea.getObject())._setlabel /*b4j.example.vmtextfield*/ ("Clearable")._setclearable /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (3),(int) (2));
 //BA.debugLineNum = 32;BA.debugLine="vm.CreateTextArea(\"ta7\", Me).SetLabel(\"Clearable\"";
_vm._createtextarea /*b4j.example.vmtextfield*/ ("ta7",modtextarea.getObject())._setlabel /*b4j.example.vmtextfield*/ ("Clearable")._setoutlined /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setshaped /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 34;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"textareaCode\"";
_name = "textareaCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Text Area\"";
_title = "Text Area";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
