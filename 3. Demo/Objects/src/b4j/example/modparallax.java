package b4j.example;


import anywheresoftware.b4a.BA;

public class modparallax extends Object{
public static modparallax mostCurrent = new modparallax();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modparallax", null);
		ba.loadHtSubs(modparallax.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modparallax", ba);
		}
	}
    public static Class<?> getObject() {
		return modparallax.class;
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
b4j.example.vmparallax _par = null;
b4j.example.vmparallax _par1 = null;
b4j.example.vmlabel _h1 = null;
b4j.example.vmlabel _h4 = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modparallax.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.addrows(2).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (2))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Dim par As VMParallax = vm.CreateParallax(\"p1\", M";
_par = _vm._createparallax /*b4j.example.vmparallax*/ ("p1",modparallax.getObject())._setsrc /*b4j.example.vmparallax*/ ("./assets/material.jpg");
 //BA.debugLineNum = 21;BA.debugLine="cont.AddComponent(1, 1, par.tostring)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_par._tostring /*String*/ ());
 //BA.debugLineNum = 24;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 25;BA.debugLine="vue.AddCode($\"Dim par As VMParallax = vm.CreatePa";
_vue._addcode /*String*/ (("Dim par As VMParallax = vm.CreateParallax(\"p1\", Me).SetSRC(\"./assets/material.jpg\")"));
 //BA.debugLineNum = 26;BA.debugLine="vue.AddCode($\"cont.AddComponent(1, 1, par.tostrin";
_vue._addcode /*String*/ (("cont.AddComponent(1, 1, par.tostring)"));
 //BA.debugLineNum = 27;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"par1code\", \"Parall";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modparallax.getObject(),"par1code","Parallax",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 29;BA.debugLine="Dim par1 As VMParallax = vm.CreateParallax(\"p2\",";
_par1 = _vm._createparallax /*b4j.example.vmparallax*/ ("p2",modparallax.getObject())._setsrc /*b4j.example.vmparallax*/ ("./assets/bg-2.jpg")._setattrloose /*b4j.example.vmparallax*/ ("dark");
 //BA.debugLineNum = 30;BA.debugLine="par1.Container.AddRows(1).AddColumns12";
_par1._container /*b4j.example.vmcontainer*/ ._addrows /*b4j.example.vmcontainer*/ ((int) (1))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 31;BA.debugLine="par1.Container.SetAlignRC(1, 0, vm.ALIGN_CENTER)";
_par1._container /*b4j.example.vmcontainer*/ ._setalignrc /*b4j.example.vmcontainer*/ ((int) (1),(int) (0),_vm._align_center /*String*/ );
 //BA.debugLineNum = 32;BA.debugLine="par1.Container.SetJustifyRC(1, 0, vm.JUSTIFY_CENT";
_par1._container /*b4j.example.vmcontainer*/ ._setjustifyrc /*b4j.example.vmcontainer*/ ((int) (1),(int) (0),_vm._justify_center /*String*/ );
 //BA.debugLineNum = 33;BA.debugLine="par1.Container.SetTextCenterRC(1, 1)";
_par1._container /*b4j.example.vmcontainer*/ ._settextcenterrc /*b4j.example.vmcontainer*/ ((int) (1),(int) (1));
 //BA.debugLineNum = 35;BA.debugLine="Dim h1 As VMLabel = vm.CreateLabel(\"h1\").AddClass";
_h1 = _vm._createlabel /*b4j.example.vmlabel*/ ("h1")._addclass /*b4j.example.vmlabel*/ ("display-1 font-weight-thin mb-4")._settext /*b4j.example.vmlabel*/ ("Vuetify.js")._seth1 /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 36;BA.debugLine="par1.Container.AddComponent(1, 1, h1.tostring)";
_par1._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_h1._tostring /*String*/ ());
 //BA.debugLineNum = 38;BA.debugLine="Dim h4 As VMLabel = vm.createlabel(\"h4\").AddClass";
_h4 = _vm._createlabel /*b4j.example.vmlabel*/ ("h4")._addclass /*b4j.example.vmlabel*/ ("subheading")._settext /*b4j.example.vmlabel*/ ("Build your application today!")._seth4 /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 39;BA.debugLine="par1.Container.AddComponent(1, 1, h4.tostring)";
_par1._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_h4._tostring /*String*/ ());
 //BA.debugLineNum = 41;BA.debugLine="cont.AddComponent(2, 1, par1.tostring)";
_cont._addcomponent /*String*/ ((int) (2),(int) (1),_par1._tostring /*String*/ ());
 //BA.debugLineNum = 44;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"Dim par1 As VMParallax = vm.CreatePa";
_vue._addcode /*String*/ (("Dim par1 As VMParallax = vm.CreateParallax(\"p2\", Me).SetSRC(\"./assets/bg-2.jpg\").SetAttrLoose(\"dark\")"));
 //BA.debugLineNum = 46;BA.debugLine="vue.AddCode($\"par1.Container.AddRows(1).AddColumns";
_vue._addcode /*String*/ (("par1.Container.AddRows(1).AddColumns12"));
 //BA.debugLineNum = 47;BA.debugLine="vue.AddCode($\"par1.Container.SetAlignRC(1, 0, vm.A";
_vue._addcode /*String*/ (("par1.Container.SetAlignRC(1, 0, vm.ALIGN_CENTER)"));
 //BA.debugLineNum = 48;BA.debugLine="vue.AddCode($\"par1.Container.SetJustifyRC(1, 0, vm";
_vue._addcode /*String*/ (("par1.Container.SetJustifyRC(1, 0, vm.JUSTIFY_CENTER)"));
 //BA.debugLineNum = 49;BA.debugLine="vue.AddCode($\"par1.Container.SetTextCenterRC(1, 1)";
_vue._addcode /*String*/ (("par1.Container.SetTextCenterRC(1, 1)"));
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"Dim h1 As VMLabel = vm.CreateLabel(\"";
_vue._addcode /*String*/ (("Dim h1 As VMLabel = vm.CreateLabel(\"h1\").AddClass(\"display-1 font-weight-thin mb-4\").SetText(\"Vuetify.js\").SetH1"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"par1.Container.AddComponent(1, 1, h1";
_vue._addcode /*String*/ (("par1.Container.AddComponent(1, 1, h1.tostring)"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"Dim h4 As VMLabel = vm.createlabel(\"";
_vue._addcode /*String*/ (("Dim h4 As VMLabel = vm.createlabel(\"h4\").AddClass(\"subheading\").SetText(\"Build your application today!\").SetH4"));
 //BA.debugLineNum = 55;BA.debugLine="vue.AddCode($\"par1.Container.AddComponent(1, 1, h4";
_vue._addcode /*String*/ (("par1.Container.AddComponent(1, 1, h4.tostring)"));
 //BA.debugLineNum = 56;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 57;BA.debugLine="vue.AddCode($\"cont.AddComponent(2, 1, par1.tostrin";
_vue._addcode /*String*/ (("cont.AddComponent(2, 1, par1.tostring)"));
 //BA.debugLineNum = 58;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"par2code\", \"Paralla";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modparallax.getObject(),"par2code","Parallax with Container",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 60;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public static String  _par1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub par1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 65;BA.debugLine="vue.CopyCode2Clipboard(\"par1code\")";
_vue._copycode2clipboard /*String*/ ("par1code");
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public static String  _par1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub par1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 69;BA.debugLine="vue.DownloadCode(\"par1code\", \"par1code.txt\")";
_vue._downloadcode /*String*/ ("par1code","par1code.txt");
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public static String  _par2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub par2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 74;BA.debugLine="vue.CopyCode2Clipboard(\"par2code\")";
_vue._copycode2clipboard /*String*/ ("par2code");
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public static String  _par2codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub par2codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 78;BA.debugLine="vue.DownloadCode(\"par2code\", \"par2code.txt\")";
_vue._downloadcode /*String*/ ("par2code","par2code.txt");
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"parallaxCode\"";
_name = "parallaxCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Parallax\"";
_title = "Parallax";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
