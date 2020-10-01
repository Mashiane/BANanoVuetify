package b4j.example;


import anywheresoftware.b4a.BA;

public class modimages extends Object{
public static modimages mostCurrent = new modimages();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modimages", null);
		ba.loadHtSubs(modimages.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modimages", ba);
		}
	}
    public static Class<?> getObject() {
		return modimages.class;
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
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modimages.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.addrows(3).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (3))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateImage(\"img1\", Me).SetValue(\"./assets/bg-";
_vm._createimage /*b4j.example.vmimage*/ ("img1",modimages.getObject())._setvalue /*b4j.example.vmimage*/ ("./assets/bg-2.jpg")._sethover /*b4j.example.vmimage*/ (anywheresoftware.b4a.keywords.Common.True)._setheight /*b4j.example.vmimage*/ ("125")._setaspectratio /*b4j.example.vmimage*/ ("1.7")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="vue.AddCode($\"vm.CreateImage(\"img1\", Me).SetValue";
_vue._addcode /*String*/ (("vm.CreateImage(\"img1\", Me).SetValue(\"./assets/bg-2.jpg\").SetHover(True).SetHeight(\"125\").SetAspectRatio(\"1.7\").AddToContainer(cont, 1, 1)"));
 //BA.debugLineNum = 24;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"image1code\", \"Imag";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modimages.getObject(),"image1code","Image",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 28;BA.debugLine="vm.CreateImage(\"img2\", Me).SetLazySrc(\"https://pi";
_vm._createimage /*b4j.example.vmimage*/ ("img2",modimages.getObject())._setlazysrc /*b4j.example.vmimage*/ ("https://picsum.photos/id/11/100/60")._setmaxwidth /*b4j.example.vmimage*/ ("500")._setmaxheight /*b4j.example.vmimage*/ ("300")._setvalue /*b4j.example.vmimage*/ ("https://picsum.photos/510/300?random")._setaspectratio /*b4j.example.vmimage*/ ("2")._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 31;BA.debugLine="vue.AddCode($\"vm.CreateImage(\"img2\", Me).SetLazyS";
_vue._addcode /*String*/ (("vm.CreateImage(\"img2\", Me).SetLazySrc(\"https://picsum.photos/id/11/100/60\").SetMaxWidth(\"500\").SetMaxHeight(\"300\").SetValue(\"https://picsum.photos/510/300?random\").SetAspectRatio(\"2\").AddToContainer(cont, 2, 1)"));
 //BA.debugLineNum = 32;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"image2code\", \"Imag";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modimages.getObject(),"image2code","Image Lady Load",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 34;BA.debugLine="vm.CreateImage(\"img3\", Me).SetValue(\"./assets/squ";
_vm._createimage /*b4j.example.vmimage*/ ("img3",modimages.getObject())._setvalue /*b4j.example.vmimage*/ ("./assets/squirrel.jpg")._setcontain /*b4j.example.vmimage*/ (BA.ObjectToBoolean("125"))._setmaxheight /*b4j.example.vmimage*/ ("125")._setaspectratio /*b4j.example.vmimage*/ ("1.4")._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 36;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 37;BA.debugLine="vue.AddCode($\"vm.CreateImage(\"img3\", Me).SetValue(";
_vue._addcode /*String*/ (("vm.CreateImage(\"img3\", Me).SetValue(\"./assets/squirrel.jpg\").SetContain(\"125\").SetMaxHeight(\"125\").SetAspectRatio(\"1.4\").AddToContainer(cont, 3, 1)"));
 //BA.debugLineNum = 38;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"image3code\", \"Image";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modimages.getObject(),"image3code","Image",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 41;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public static String  _image1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub image1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 46;BA.debugLine="vue.CopyCode2Clipboard(\"image1code\")";
_vue._copycode2clipboard /*String*/ ("image1code");
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _image1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub image1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 50;BA.debugLine="vue.DownloadCode(\"image1code\", \"image1code.txt\")";
_vue._downloadcode /*String*/ ("image1code","image1code.txt");
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public static String  _image2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub image2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 55;BA.debugLine="vue.CopyCode2Clipboard(\"image2code\")";
_vue._copycode2clipboard /*String*/ ("image2code");
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public static String  _image2codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub image2codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 59;BA.debugLine="vue.DownloadCode(\"image2code\", \"image2code.txt\")";
_vue._downloadcode /*String*/ ("image2code","image2code.txt");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static String  _image3codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub image3codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 64;BA.debugLine="vue.CopyCode2Clipboard(\"image3code\")";
_vue._copycode2clipboard /*String*/ ("image3code");
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public static String  _image3codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub image3codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 68;BA.debugLine="vue.DownloadCode(\"image3code\", \"image3code.txt\")";
_vue._downloadcode /*String*/ ("image3code","image3code.txt");
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"imagesCode\"";
_name = "imagesCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Images\"";
_title = "Images";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
