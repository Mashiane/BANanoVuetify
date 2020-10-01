package b4j.example;


import anywheresoftware.b4a.BA;

public class modwindow extends Object{
public static modwindow mostCurrent = new modwindow();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modwindow", null);
		ba.loadHtSubs(modwindow.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modwindow", ba);
		}
	}
    public static Class<?> getObject() {
		return modwindow.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
public static b4j.example.bananovue _vue = null;
public static com.ab.banano.BANano _banano = null;
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
public static b4j.example.modtextfield _modtextfield = null;
public static b4j.example.modtimeline _modtimeline = null;
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtoolkit _modtoolkit = null;
public static b4j.example.modtreeview _modtreeview = null;
public static b4j.example.pgbrs _pgbrs = null;
public static b4j.example.bananoshared _bananoshared = null;
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmcard _vcard = null;
b4j.example.vmwindow _window = null;
b4j.example.vmwindowitem _winitem = null;
b4j.example.vmcard _itemcard = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modwindow.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.addrows(3).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (3))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Dim vcard As VMCard = vm.CreateCard(\"onb\", Me).Se";
_vcard = _vm._createcard /*b4j.example.vmcard*/ ("onb",modwindow.getObject())._setflat /*b4j.example.vmcard*/ (anywheresoftware.b4a.keywords.Common.True)._settile /*b4j.example.vmcard*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 21;BA.debugLine="Dim window As VMWindow = vm.CreateWindow(\"onw\", M";
_window = _vm._createwindow /*b4j.example.vmwindow*/ ("onw",modwindow.getObject())._setvmodel /*b4j.example.vmwindow*/ ("onboarding")._setdata /*b4j.example.vmwindow*/ ("onboarding",(Object)(0));
 //BA.debugLineNum = 22;BA.debugLine="Dim winitem As VMWindowItem = vm.CreateWindowItem";
_winitem = _vm._createwindowitem /*b4j.example.vmwindowitem*/ ("onwi",modwindow.getObject())._setdata /*b4j.example.vmwindowitem*/ ("lengthx",(Object)(3));
 //BA.debugLineNum = 23;BA.debugLine="winitem.SetVFor(\"n\", \"lengthx\").SetAttrSingle(\":k";
_winitem._setvfor /*b4j.example.vmwindowitem*/ ("n","lengthx")._setattrsingle /*b4j.example.vmwindowitem*/ (":key","`card-${n}`");
 //BA.debugLineNum = 24;BA.debugLine="Dim itemcard As VMCard = vm.CreateCard(\"oncard\",";
_itemcard = _vm._createcard /*b4j.example.vmcard*/ ("oncard",modwindow.getObject())._setcolor /*b4j.example.vmcard*/ ("transparent")._setheight /*b4j.example.vmcard*/ ("200");
 //BA.debugLineNum = 25;BA.debugLine="itemcard.Container.AddRows(1).AddColumns12";
_itemcard._container /*b4j.example.vmcontainer*/ ._addrows /*b4j.example.vmcontainer*/ ((int) (1))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 26;BA.debugLine="itemcard.Container.SetClassRC(1,1, \"fill-height\")";
_itemcard._container /*b4j.example.vmcontainer*/ ._setclassrc /*b4j.example.vmcontainer*/ ((int) (1),(int) (1),"fill-height");
 //BA.debugLineNum = 27;BA.debugLine="itemcard.Container.SetAlignRC(1, 1, \"center\")";
_itemcard._container /*b4j.example.vmcontainer*/ ._setalignrc /*b4j.example.vmcontainer*/ ((int) (1),(int) (1),"center");
 //BA.debugLineNum = 28;BA.debugLine="itemcard.Container.SetJustifyRC(1, 1, \"center\")";
_itemcard._container /*b4j.example.vmcontainer*/ ._setjustifyrc /*b4j.example.vmcontainer*/ ((int) (1),(int) (1),"center");
 //BA.debugLineNum = 29;BA.debugLine="itemcard.Container.SetAttrRC(1, 1, \"tag\", \"v-card";
_itemcard._container /*b4j.example.vmcontainer*/ ._setattrrc /*b4j.example.vmcontainer*/ ((int) (1),(int) (1),"tag","v-card-text");
 //BA.debugLineNum = 30;BA.debugLine="itemcard.Container.AddComponent(1,1, vm.Loremipsu";
_itemcard._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_vm._loremipsum /*String*/ ());
 //BA.debugLineNum = 31;BA.debugLine="itemcard.Actions.SetSpaceBetween";
_itemcard._actions /*b4j.example.vmcardactions*/ ._setspacebetween /*b4j.example.vmcardactions*/ ();
 //BA.debugLineNum = 32;BA.debugLine="itemcard.Actions.AddIcon(\"prevslide\", \"mdi-chevro";
_itemcard._actions /*b4j.example.vmcardactions*/ ._addicon /*b4j.example.vmcardactions*/ ("prevslide","mdi-chevron-left","","","","");
 //BA.debugLineNum = 33;BA.debugLine="itemcard.Actions.AddIcon(\"nextslide\", \"mdi-chevro";
_itemcard._actions /*b4j.example.vmcardactions*/ ._addicon /*b4j.example.vmcardactions*/ ("nextslide","mdi-chevron-right","","","","");
 //BA.debugLineNum = 35;BA.debugLine="winitem.AddComponent(itemcard.tostring)";
_winitem._addcomponent /*b4j.example.vmwindowitem*/ (_itemcard._tostring /*String*/ ());
 //BA.debugLineNum = 36;BA.debugLine="window.AddComponent(winitem.tostring)";
_window._addcomponent /*b4j.example.vmwindow*/ (_winitem._tostring /*String*/ ());
 //BA.debugLineNum = 37;BA.debugLine="vcard.AddComponent(window.tostring)";
_vcard._addcomponent /*b4j.example.vmcard*/ (_window._tostring /*String*/ ());
 //BA.debugLineNum = 39;BA.debugLine="vcard.AddToContainer(cont,1,1)";
_vcard._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 41;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public static String  _nextslide_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub nextslide_click(e As BANanoEvent)";
 //BA.debugLineNum = 49;BA.debugLine="vm.IncrementTo(\"onboarding\", 1, 2)";
_vm._incrementto /*b4j.example.bananovm*/ ("onboarding",(int) (1),(int) (2));
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public static String  _prevslide_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub prevslide_click(e As BANanoEvent)";
 //BA.debugLineNum = 45;BA.debugLine="vm.DecrementTo(\"onboarding\", 1, 0)";
_vm._decrementto /*b4j.example.bananovm*/ ("onboarding",(int) (1),(int) (0));
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"windowCode\"";
_name = "windowCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Window\"";
_title = "Window";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
