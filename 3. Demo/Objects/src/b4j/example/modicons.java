package b4j.example;


import anywheresoftware.b4a.BA;

public class modicons extends Object{
public static modicons mostCurrent = new modicons();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modicons", null);
		ba.loadHtSubs(modicons.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modicons", ba);
		}
	}
    public static Class<?> getObject() {
		return modicons.class;
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
public static String  _btnxcodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub btnxcodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 58;BA.debugLine="vue.CopyCode2Clipboard(\"btnxcode\")";
_vue._copycode2clipboard /*String*/ ("btnxcode");
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public static String  _btnxcodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub btnxcodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 62;BA.debugLine="vue.DownloadCode(\"btnxcode\", \"btnxcode.txt\")";
_vue._downloadcode /*String*/ ("btnxcode","btnxcode.txt");
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modicons.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.AddRows(4).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (4))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateIcon(\"icon1\", Me).SetText(\"home\").AddToC";
_vm._createicon /*b4j.example.vmicon*/ ("icon1",modicons.getObject())._settext /*b4j.example.vmicon*/ ("home")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="vue.AddCode($\"vm.CreateIcon(\"icon1\", Me).SetText(";
_vue._addcode /*String*/ (("vm.CreateIcon(\"icon1\", Me).SetText(\"home\").AddToContainer(cont, 1, 1)"));
 //BA.debugLineNum = 24;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"icon1code\", \"Icon\"";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modicons.getObject(),"icon1code","Icon",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 28;BA.debugLine="vm.CreateIcon(\"icon2\", Me).SetText(\"add\").SetColo";
_vm._createicon /*b4j.example.vmicon*/ ("icon2",modicons.getObject())._settext /*b4j.example.vmicon*/ ("add")._setcolor /*b4j.example.vmicon*/ ("red")._setlarge /*b4j.example.vmicon*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 31;BA.debugLine="vue.AddCode($\"vm.CreateIcon(\"icon2\", Me).SetText(";
_vue._addcode /*String*/ (("vm.CreateIcon(\"icon2\", Me).SetText(\"add\").SetColor(\"red\").SetLarge(True).AddToContainer(cont, 2, 1)"));
 //BA.debugLineNum = 32;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"icon2code\", \"Icon\"";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modicons.getObject(),"icon2code","Icon",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 35;BA.debugLine="vm.CreateIcon(\"icon3\", Me).SetText(\"mdi-email\").S";
_vm._createicon /*b4j.example.vmicon*/ ("icon3",modicons.getObject())._settext /*b4j.example.vmicon*/ ("mdi-email")._setcolor /*b4j.example.vmicon*/ ("teal")._setxlarge /*b4j.example.vmicon*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 37;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 38;BA.debugLine="vue.AddCode($\"vm.CreateIcon(\"icon3\", Me).SetText(";
_vue._addcode /*String*/ (("vm.CreateIcon(\"icon3\", Me).SetText(\"mdi-email\").SetColor(\"teal\").SetXLarge(True).AddToContainer(cont, 3, 1)"));
 //BA.debugLineNum = 39;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"icon3code\", \"Icon\"";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modicons.getObject(),"icon3code","Icon",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 44;BA.debugLine="vm.CreateButton(\"btn1\", Me).SetLabel(\"Accept\").Se";
_vm._createbutton /*b4j.example.vmbutton*/ ("btn1",modicons.getObject())._setlabel /*b4j.example.vmbutton*/ ("Accept")._setcolor /*b4j.example.vmbutton*/ ("purple")._addicon /*b4j.example.vmbutton*/ ("add","left","")._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 47;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 48;BA.debugLine="vue.AddCode($\"vm.CreateButton(\"btn1\", Me).SetLabe";
_vue._addcode /*String*/ (("vm.CreateButton(\"btn1\", Me).SetLabel(\"Accept\").SetColor(\"purple\").AddIcon(\"add\", \"left\", \"\").AddToContainer(cont, 4, 1)"));
 //BA.debugLineNum = 49;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"btnxcode\", \"Button";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modicons.getObject(),"btnxcode","Button Icon",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 53;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public static String  _icon1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub icon1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 67;BA.debugLine="vue.CopyCode2Clipboard(\"icon1code\")";
_vue._copycode2clipboard /*String*/ ("icon1code");
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _icon1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub icon1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 71;BA.debugLine="vue.DownloadCode(\"icon1code\", \"icon1code.txt\")";
_vue._downloadcode /*String*/ ("icon1code","icon1code.txt");
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public static String  _icon2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub icon2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 76;BA.debugLine="vue.CopyCode2Clipboard(\"icon2code\")";
_vue._copycode2clipboard /*String*/ ("icon2code");
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public static String  _icon2codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub icon2codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 80;BA.debugLine="vue.DownloadCode(\"icon2code\", \"icon2code.txt\")";
_vue._downloadcode /*String*/ ("icon2code","icon2code.txt");
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public static String  _icon3codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub icon3codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 85;BA.debugLine="vue.CopyCode2Clipboard(\"icon3code\")";
_vue._copycode2clipboard /*String*/ ("icon3code");
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static String  _icon3codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub icon3codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 89;BA.debugLine="vue.DownloadCode(\"icon3code\", \"icon3code.txt\")";
_vue._downloadcode /*String*/ ("icon3code","icon3code.txt");
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"iconCode\"";
_name = "iconCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Icons\"";
_title = "Icons";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
