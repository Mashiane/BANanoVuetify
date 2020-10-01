package b4j.example;


import anywheresoftware.b4a.BA;

public class modtextfield extends Object{
public static modtextfield mostCurrent = new modtextfield();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modtextfield", null);
		ba.loadHtSubs(modtextfield.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modtextfield", ba);
		}
	}
    public static Class<?> getObject() {
		return modtextfield.class;
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
b4j.example.vmtextfield _mytxt = null;
b4j.example.vmbutton _btnafter = null;
b4j.example.vmmenu _menuafter = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modtextfield.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.addrows(10).AddColumns8";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (10))._addcolumns8 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Dim mytxt As VMTextField = vm.CreateTextField(\"t1";
_mytxt = _vm._createtextfield /*b4j.example.vmtextfield*/ ("t1",modtextfield.getObject())._setlabel /*b4j.example.vmtextfield*/ ("Regular")._sethint /*b4j.example.vmtextfield*/ ("Enter a name")._setpersistenthint /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 21;BA.debugLine="mytxt.SetPrependIcon(\"place\")";
_mytxt._setprependicon /*b4j.example.vmtextfield*/ ("place");
 //BA.debugLineNum = 22;BA.debugLine="mytxt.SetPrependInnerIcon(\"mdi-account-circle-out";
_mytxt._setprependinnericon /*b4j.example.vmtextfield*/ ("mdi-account-circle-outline");
 //BA.debugLineNum = 23;BA.debugLine="mytxt.SetAppendIcon(\"mdi-caravan\")";
_mytxt._setappendicon /*b4j.example.vmtextfield*/ ("mdi-caravan");
 //BA.debugLineNum = 24;BA.debugLine="mytxt.SetAppendOuterIcon(\"mdi-map-marker-radius\")";
_mytxt._setappendoutericon /*b4j.example.vmtextfield*/ ("mdi-map-marker-radius");
 //BA.debugLineNum = 25;BA.debugLine="mytxt.SetSingleLine(True).SetClearable(True).SetM";
_mytxt._setsingleline /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setclearable /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setmaxlength /*b4j.example.vmtextfield*/ (BA.NumberToString(25));
 //BA.debugLineNum = 26;BA.debugLine="mytxt.SetVModel(\"t1data\")";
_mytxt._setvmodel /*b4j.example.vmtextfield*/ ("t1data");
 //BA.debugLineNum = 29;BA.debugLine="mytxt.SetOnKeydown(Me, \"t1_keydown\")";
_mytxt._setonkeydown /*b4j.example.vmtextfield*/ (modtextfield.getObject(),"t1_keydown");
 //BA.debugLineNum = 30;BA.debugLine="mytxt.SetOnClickAppend(Me, \"t1append_click\")";
_mytxt._setonclickappend /*b4j.example.vmtextfield*/ (modtextfield.getObject(),"t1append_click");
 //BA.debugLineNum = 31;BA.debugLine="mytxt.SetOnClickAppendOuter(Me, \"t1appendouter_cl";
_mytxt._setonclickappendouter /*b4j.example.vmtextfield*/ (modtextfield.getObject(),"t1appendouter_click");
 //BA.debugLineNum = 32;BA.debugLine="mytxt.SetOnClickPrepend(Me, \"t1prepend_click\")";
_mytxt._setonclickprepend /*b4j.example.vmtextfield*/ (modtextfield.getObject(),"t1prepend_click");
 //BA.debugLineNum = 33;BA.debugLine="mytxt.SetOnClickPrependInner(Me, \"t1prependinner_";
_mytxt._setonclickprependinner /*b4j.example.vmtextfield*/ (modtextfield.getObject(),"t1prependinner_click");
 //BA.debugLineNum = 34;BA.debugLine="mytxt.SetOnClickClear(Me, \"t1_clear\")";
_mytxt._setonclickclear /*b4j.example.vmtextfield*/ (modtextfield.getObject(),"t1_clear");
 //BA.debugLineNum = 36;BA.debugLine="Dim btnAfter As VMButton = vm.CreateButton(\"t1aft";
_btnafter = _vm._createbutton /*b4j.example.vmbutton*/ ("t1after",modtextfield.getObject())._setcolor /*b4j.example.vmbutton*/ (_vm._color_orange /*String*/ )._seticonbutton /*b4j.example.vmbutton*/ ("mdi-thumb-up");
 //BA.debugLineNum = 37;BA.debugLine="mytxt.AddButtonAfter(btnAfter)";
_mytxt._addbuttonafter /*b4j.example.vmtextfield*/ (_btnafter);
 //BA.debugLineNum = 39;BA.debugLine="mytxt.AddToContainer(cont, 1, 1)";
_mytxt._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 42;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 43;BA.debugLine="vue.AddCode($\"Dim mytxt As VMTextField = vm.Create";
_vue._addcode /*String*/ (("Dim mytxt As VMTextField = vm.CreateTextField(\"t1\", Me).SetLabel(\"Regular\").SetHint(\"Enter a name\").SetPersistentHint(True)"));
 //BA.debugLineNum = 44;BA.debugLine="vue.AddCode($\"mytxt.SetPrependIcon(\"place\")\"$)";
_vue._addcode /*String*/ (("mytxt.SetPrependIcon(\"place\")"));
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"mytxt.SetPrependInnerIcon(\"mdi-accou";
_vue._addcode /*String*/ (("mytxt.SetPrependInnerIcon(\"mdi-account-circle-outline\")"));
 //BA.debugLineNum = 46;BA.debugLine="vue.AddCode($\"mytxt.SetAppendIcon(\"mdi-caravan\")\"$";
_vue._addcode /*String*/ (("mytxt.SetAppendIcon(\"mdi-caravan\")"));
 //BA.debugLineNum = 47;BA.debugLine="vue.AddCode($\"mytxt.SetAppendOuterIcon(\"mdi-map-ma";
_vue._addcode /*String*/ (("mytxt.SetAppendOuterIcon(\"mdi-map-marker-radius\")"));
 //BA.debugLineNum = 48;BA.debugLine="vue.AddCode($\"mytxt.SetSingleLine(True).SetClearab";
_vue._addcode /*String*/ (("mytxt.SetSingleLine(True).SetClearable(True).SetMaxLength(25)"));
 //BA.debugLineNum = 49;BA.debugLine="vue.AddCode($\"mytxt.SetVModel(\"t1data\")\"$)";
_vue._addcode /*String*/ (("mytxt.SetVModel(\"t1data\")"));
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"'events\"$)";
_vue._addcode /*String*/ (("'events"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"mytxt.SetOnKeydown(Me, \"t1_keydown\")";
_vue._addcode /*String*/ (("mytxt.SetOnKeydown(Me, \"t1_keydown\")"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"mytxt.SetOnClickAppend(Me, \"t1append";
_vue._addcode /*String*/ (("mytxt.SetOnClickAppend(Me, \"t1append_click\")"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"mytxt.SetOnClickAppendOuter(Me, \"t1a";
_vue._addcode /*String*/ (("mytxt.SetOnClickAppendOuter(Me, \"t1appendouter_click\")"));
 //BA.debugLineNum = 55;BA.debugLine="vue.AddCode($\"mytxt.SetOnClickPrepend(Me, \"t1prepe";
_vue._addcode /*String*/ (("mytxt.SetOnClickPrepend(Me, \"t1prepend_click\")"));
 //BA.debugLineNum = 56;BA.debugLine="vue.AddCode($\"mytxt.SetOnClickPrependInner(Me, \"t1";
_vue._addcode /*String*/ (("mytxt.SetOnClickPrependInner(Me, \"t1prependinner_click\")"));
 //BA.debugLineNum = 57;BA.debugLine="vue.AddCode($\"mytxt.SetOnClickClear(Me, \"t1_clear\"";
_vue._addcode /*String*/ (("mytxt.SetOnClickClear(Me, \"t1_clear\")"));
 //BA.debugLineNum = 58;BA.debugLine="vue.AddCode($\"' button after\"$)";
_vue._addcode /*String*/ (("' button after"));
 //BA.debugLineNum = 59;BA.debugLine="vue.AddCode($\"Dim btnAfter As VMButton = vm.Create";
_vue._addcode /*String*/ (("Dim btnAfter As VMButton = vm.CreateButton(\"t1after\", Me).SetColor(vm.COLOR_ORANGE).SetIconButton(\"mdi-thumb-up\")"));
 //BA.debugLineNum = 60;BA.debugLine="vue.AddCode($\"mytxt.AddButtonAfter(btnAfter)\"$)";
_vue._addcode /*String*/ (("mytxt.AddButtonAfter(btnAfter)"));
 //BA.debugLineNum = 61;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 62;BA.debugLine="vue.AddCode($\"mytxt.AddToContainer(cont, 1, 1)\"$)";
_vue._addcode /*String*/ (("mytxt.AddToContainer(cont, 1, 1)"));
 //BA.debugLineNum = 63;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 64;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"t1cc\", \"Text Field\"";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modtextfield.getObject(),"t1cc","Text Field",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 67;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 68;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 69;BA.debugLine="vue.AddCode($\"Sub t1after_click(e As BANanoEvent)\"";
_vue._addcode /*String*/ (("Sub t1after_click(e As BANanoEvent)"));
 //BA.debugLineNum = 70;BA.debugLine="vue.AddCode($\"vm.ShowSnackBarSuccess(\"Clicked Butt";
_vue._addcode /*String*/ (("vm.ShowSnackBarSuccess(\"Clicked Button After Text Field!\")"));
 //BA.debugLineNum = 71;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 72;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 73;BA.debugLine="vue.AddCode($\"Sub t1_clear(e As BANanoEvent)\"$)";
_vue._addcode /*String*/ (("Sub t1_clear(e As BANanoEvent)"));
 //BA.debugLineNum = 74;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"t1 clear\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"t1 clear\")"));
 //BA.debugLineNum = 75;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 76;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 77;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 78;BA.debugLine="vue.AddCode($\"Sub t1_keydown(e As BANanoEvent)\"$)";
_vue._addcode /*String*/ (("Sub t1_keydown(e As BANanoEvent)"));
 //BA.debugLineNum = 79;BA.debugLine="vue.AddCode($\"vm.NavBar.UpdateTitle(\"t1 keydown...";
_vue._addcode /*String*/ (("vm.NavBar.UpdateTitle(\"t1 keydown...\")"));
 //BA.debugLineNum = 80;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 81;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 82;BA.debugLine="vue.AddCode($\"Sub t1append_click(e As BANanoEvent)";
_vue._addcode /*String*/ (("Sub t1append_click(e As BANanoEvent)"));
 //BA.debugLineNum = 83;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"append click\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"append click\")"));
 //BA.debugLineNum = 84;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 85;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 86;BA.debugLine="vue.AddCode($\"Sub t1appendouter_click(e As BANanoE";
_vue._addcode /*String*/ (("Sub t1appendouter_click(e As BANanoEvent)"));
 //BA.debugLineNum = 87;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"append-outer click\"";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"append-outer click\")"));
 //BA.debugLineNum = 88;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 89;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 90;BA.debugLine="vue.AddCode($\"Sub t1prepend_click(e As BANanoEvent";
_vue._addcode /*String*/ (("Sub t1prepend_click(e As BANanoEvent)"));
 //BA.debugLineNum = 91;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"prepend click\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"prepend click\")"));
 //BA.debugLineNum = 92;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 93;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 94;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 95;BA.debugLine="vue.AddCode($\"Sub t1prependinner_click(e As BANano";
_vue._addcode /*String*/ (("Sub t1prependinner_click(e As BANanoEvent)"));
 //BA.debugLineNum = 96;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"prepend-inner click";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"prepend-inner click\")"));
 //BA.debugLineNum = 97;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 98;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"t1eve\", \"Text Field";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modtextfield.getObject(),"t1eve","Text Field Events",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 101;BA.debugLine="Dim menuAfter As VMMenu";
_menuafter = new b4j.example.vmmenu();
 //BA.debugLineNum = 102;BA.debugLine="menuAfter = vm.CreateMenu(\"menuAfter\", Me)";
_menuafter = _vm._createmenu /*b4j.example.vmmenu*/ ("menuAfter",modtextfield.getObject());
 //BA.debugLineNum = 103;BA.debugLine="menuAfter.SetIconColor(\"mdi-dots-vertical\", vm.co";
_menuafter._seticoncolor /*b4j.example.vmmenu*/ ("mdi-dots-vertical",_vm._color_green /*String*/ );
 //BA.debugLineNum = 104;BA.debugLine="menuAfter.AddKeyValue(\"day\", \"Day\")";
_menuafter._addkeyvalue /*String*/ ("day","Day");
 //BA.debugLineNum = 105;BA.debugLine="menuAfter.AddKeyValue(\"week\", \"Week\")";
_menuafter._addkeyvalue /*String*/ ("week","Week");
 //BA.debugLineNum = 106;BA.debugLine="menuAfter.AddKeyValue(\"month\", \"Month\")";
_menuafter._addkeyvalue /*String*/ ("month","Month");
 //BA.debugLineNum = 108;BA.debugLine="vm.CreateTextField(\"t2\", Me).SetLabel(\"Solo\").Set";
_vm._createtextfield /*b4j.example.vmtextfield*/ ("t2",modtextfield.getObject())._setlabel /*b4j.example.vmtextfield*/ ("Solo")._setplaceholder /*b4j.example.vmtextfield*/ ("Text fields")._setprependinnericon /*b4j.example.vmtextfield*/ ("place")._setsolo /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setclearable /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setcounter /*b4j.example.vmtextfield*/ (BA.ObjectToBoolean(25))._addmenuafter /*b4j.example.vmtextfield*/ (_menuafter)._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 109;BA.debugLine="vm.CreateTextField(\"t3\", Me).SetLabel(\"Filled\").S";
_vm._createtextfield /*b4j.example.vmtextfield*/ ("t3",modtextfield.getObject())._setlabel /*b4j.example.vmtextfield*/ ("Filled")._setappendicon /*b4j.example.vmtextfield*/ ("place")._setfilled /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setclearable /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 110;BA.debugLine="vm.CreateTextField(\"t4\", Me).SetLabel(\"Outline\").";
_vm._createtextfield /*b4j.example.vmtextfield*/ ("t4",modtextfield.getObject())._setlabel /*b4j.example.vmtextfield*/ ("Outline")._setprefix /*b4j.example.vmtextfield*/ ("$")._setappendoutericon /*b4j.example.vmtextfield*/ ("place")._setvalue /*b4j.example.vmtextfield*/ ("10")._setoutlined /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setclearable /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 111;BA.debugLine="vm.CreateTextField(\"t5\", Me).SetVModel(\"firstname";
_vm._createtextfield /*b4j.example.vmtextfield*/ ("t5",modtextfield.getObject())._setvmodel /*b4j.example.vmtextfield*/ ("firstname")._setlabel /*b4j.example.vmtextfield*/ ("Filled Shaped")._setcounter /*b4j.example.vmtextfield*/ (BA.ObjectToBoolean(25))._setclearable /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setshaped /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setfilled /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (7),(int) (1));
 //BA.debugLineNum = 112;BA.debugLine="vm.CreateTextField(\"t6\", Me).SetVModel(\"lastname\"";
_vm._createtextfield /*b4j.example.vmtextfield*/ ("t6",modtextfield.getObject())._setvmodel /*b4j.example.vmtextfield*/ ("lastname")._setsuffix /*b4j.example.vmtextfield*/ ("@gmail.com")._setlabel /*b4j.example.vmtextfield*/ ("Outline Shaped")._setclearable /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setshaped /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setoutlined /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (8),(int) (1));
 //BA.debugLineNum = 113;BA.debugLine="vm.CreateTextField(\"p1\", Me).SetLabel(\"Password\")";
_vm._createtextfield /*b4j.example.vmtextfield*/ ("p1",modtextfield.getObject())._setlabel /*b4j.example.vmtextfield*/ ("Password")._setpassword /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True)._setname /*b4j.example.vmtextfield*/ ((Object)("password"),anywheresoftware.b4a.keywords.Common.False)._sethint /*b4j.example.vmtextfield*/ ("At least enter 8 characters.")._setcounter /*b4j.example.vmtextfield*/ (BA.ObjectToBoolean(8))._addtocontainer /*String*/ (_cont,(int) (9),(int) (1));
 //BA.debugLineNum = 114;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"textfieldCode\"";
_name = "textfieldCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Text Field\"";
_title = "Text Field";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _t1_clear(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub t1_clear(e As BANanoEvent)";
 //BA.debugLineNum = 143;BA.debugLine="vm.ShowSnackBar(\"t1 clear\")";
_vm._showsnackbar /*String*/ ("t1 clear");
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _t1_keydown(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub t1_keydown(e As BANanoEvent)";
 //BA.debugLineNum = 148;BA.debugLine="vm.NavBar.UpdateTitle($\"t1 keydown...\"$)";
_vm._navbar /*b4j.example.vmtoolbar*/ ._updatetitle /*b4j.example.vmtoolbar*/ (("t1 keydown..."));
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public static String  _t1after_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub t1after_click(e As BANanoEvent)";
 //BA.debugLineNum = 139;BA.debugLine="vm.ShowSnackBarSuccess(\"Clicked Button After Text";
_vm._showsnackbarsuccess /*String*/ ("Clicked Button After Text Field!");
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public static String  _t1append_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub t1append_click(e As BANanoEvent)";
 //BA.debugLineNum = 152;BA.debugLine="vm.ShowSnackBar(\"append click\")";
_vm._showsnackbar /*String*/ ("append click");
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public static String  _t1appendouter_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub t1appendouter_click(e As BANanoEvent)";
 //BA.debugLineNum = 156;BA.debugLine="vm.ShowSnackBar(\"append-outer click\")";
_vm._showsnackbar /*String*/ ("append-outer click");
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public static String  _t1cccopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub t1cccopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 130;BA.debugLine="vue.CopyCode2Clipboard(\"t1cc\")";
_vue._copycode2clipboard /*String*/ ("t1cc");
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public static String  _t1ccdownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub t1ccdownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 134;BA.debugLine="vue.DownloadCode(\"t1cc\", \"t1cc.txt\")";
_vue._downloadcode /*String*/ ("t1cc","t1cc.txt");
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public static String  _t1evecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub t1evecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 119;BA.debugLine="vue.CopyCode2Clipboard(\"t1eve\")";
_vue._copycode2clipboard /*String*/ ("t1eve");
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public static String  _t1evedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub t1evedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 123;BA.debugLine="vue.DownloadCode(\"t1eve\", \"t1eve.txt\")";
_vue._downloadcode /*String*/ ("t1eve","t1eve.txt");
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public static String  _t1prepend_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub t1prepend_click(e As BANanoEvent)";
 //BA.debugLineNum = 160;BA.debugLine="vm.ShowSnackBar(\"prepend click\")";
_vm._showsnackbar /*String*/ ("prepend click");
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public static String  _t1prependinner_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub t1prependinner_click(e As BANanoEvent)";
 //BA.debugLineNum = 165;BA.debugLine="vm.ShowSnackBar(\"prepend-inner click\")";
_vm._showsnackbar /*String*/ ("prepend-inner click");
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
}
