package b4j.example;


import anywheresoftware.b4a.BA;

public class modmenus extends Object{
public static modmenus mostCurrent = new modmenus();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modmenus", null);
		ba.loadHtSubs(modmenus.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modmenus", ba);
		}
	}
    public static Class<?> getObject() {
		return modmenus.class;
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
b4j.example.vmmenu _menu = null;
b4j.example.vmmenu _menu1 = null;
b4j.example.vmmenu _menu2 = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modmenus.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.addrows(3).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (3))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Dim menu As VMMenu = vm.CreateMenu(\"menu1\", Me).S";
_menu = _vm._createmenu /*b4j.example.vmmenu*/ ("menu1",modmenus.getObject())._seticon /*b4j.example.vmmenu*/ ("mdi-dots-vertical");
 //BA.debugLineNum = 21;BA.debugLine="menu.AddItem(\"inbox\", \"\", \"\", \"Inbox\", \"\",\"\")";
_menu._additem /*String*/ ("inbox","","","Inbox","","");
 //BA.debugLineNum = 22;BA.debugLine="menu.AddItem(\"drafs\", \"\", \"\", \"Drafts\", \"\",\"\")";
_menu._additem /*String*/ ("drafs","","","Drafts","","");
 //BA.debugLineNum = 23;BA.debugLine="menu.AddItem(\"sent\", \"\", \"\", \"Sent\", \"\",\"\")";
_menu._additem /*String*/ ("sent","","","Sent","","");
 //BA.debugLineNum = 24;BA.debugLine="menu.AddToContainer(cont, 1, 1)";
_menu._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 28;BA.debugLine="vue.AddCode($\"Dim menu As VMMenu = vm.CreateMenu(";
_vue._addcode /*String*/ (("Dim menu As VMMenu = vm.CreateMenu(\"menu1\", Me).SetIcon(\"mdi-dots-vertical\")"));
 //BA.debugLineNum = 29;BA.debugLine="vue.AddCode($\"menu.AddItem(\"inbox\", \"\", \"\", \"Inbo";
_vue._addcode /*String*/ (("menu.AddItem(\"inbox\", \"\", \"\", \"Inbox\", \"\",\"\")"));
 //BA.debugLineNum = 30;BA.debugLine="vue.AddCode($\"menu.AddItem(\"drafs\", \"\", \"\", \"Draf";
_vue._addcode /*String*/ (("menu.AddItem(\"drafs\", \"\", \"\", \"Drafts\", \"\",\"\")"));
 //BA.debugLineNum = 31;BA.debugLine="vue.AddCode($\"menu.AddItem(\"sent\", \"\", \"\", \"Sent\"";
_vue._addcode /*String*/ (("menu.AddItem(\"sent\", \"\", \"\", \"Sent\", \"\",\"\")"));
 //BA.debugLineNum = 32;BA.debugLine="vue.AddCode($\"menu.AddToContainer(cont, 1, 1)\"$)";
_vue._addcode /*String*/ (("menu.AddToContainer(cont, 1, 1)"));
 //BA.debugLineNum = 33;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 34;BA.debugLine="vue.AddCode($\"Sub menu1items_click(e As BANanoEve";
_vue._addcode /*String*/ (("Sub menu1items_click(e As BANanoEvent)"));
 //BA.debugLineNum = 35;BA.debugLine="vue.AddCode($\"'get the id from the event\"$)";
_vue._addcode /*String*/ (("'get the id from the event"));
 //BA.debugLineNum = 36;BA.debugLine="vue.AddCode($\"Dim elID As String = vm.GetIDFromEv";
_vue._addcode /*String*/ (("Dim elID As String = vm.GetIDFromEvent(e)"));
 //BA.debugLineNum = 37;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(elID)\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(elID)"));
 //BA.debugLineNum = 38;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 39;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"menu1code\", \"Menu\"";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modmenus.getObject(),"menu1code","Menu",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 42;BA.debugLine="Dim menu1 As VMMenu = vm.CreateMenu(\"menu2\", Me).";
_menu1 = _vm._createmenu /*b4j.example.vmmenu*/ ("menu2",modmenus.getObject())._setbutton /*b4j.example.vmmenu*/ ("mdi-image","My Button");
 //BA.debugLineNum = 43;BA.debugLine="menu1.AddItem(\"inbox1\", \"\", \"mdi-view-dashboard\",";
_menu1._additem /*String*/ ("inbox1","","mdi-view-dashboard","Inbox","","");
 //BA.debugLineNum = 44;BA.debugLine="menu1.AddItem(\"drafs1\", \"\", \"mdi-image\", \"Drafts\"";
_menu1._additem /*String*/ ("drafs1","","mdi-image","Drafts","","");
 //BA.debugLineNum = 45;BA.debugLine="menu1.AddItem(\"sent1\", \"\", \"mdi-help-box\", \"Sent\"";
_menu1._additem /*String*/ ("sent1","","mdi-help-box","Sent","","");
 //BA.debugLineNum = 46;BA.debugLine="menu1.AddToContainer(cont, 2, 1)";
_menu1._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 49;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"Dim menu1 As VMMenu = vm.CreateMenu(";
_vue._addcode /*String*/ (("Dim menu1 As VMMenu = vm.CreateMenu(\"menu2\", Me).SetButton(\"mdi-image\", \"My Button\")"));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"menu1.AddItem(\"inbox1\", \"\", \"mdi-vie";
_vue._addcode /*String*/ (("menu1.AddItem(\"inbox1\", \"\", \"mdi-view-dashboard\", \"Inbox\", \"\",\"\")"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"menu1.AddItem(\"drafs1\", \"\", \"mdi-ima";
_vue._addcode /*String*/ (("menu1.AddItem(\"drafs1\", \"\", \"mdi-image\", \"Drafts\", \"\",\"\")"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"menu1.AddItem(\"sent1\", \"\", \"mdi-help";
_vue._addcode /*String*/ (("menu1.AddItem(\"sent1\", \"\", \"mdi-help-box\", \"Sent\", \"\",\"\")"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"menu1.AddToContainer(cont, 2, 1)\"$)";
_vue._addcode /*String*/ (("menu1.AddToContainer(cont, 2, 1)"));
 //BA.debugLineNum = 55;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 56;BA.debugLine="vue.AddCode($\"Sub menu2items_click(e As BANanoEven";
_vue._addcode /*String*/ (("Sub menu2items_click(e As BANanoEvent)"));
 //BA.debugLineNum = 57;BA.debugLine="vue.AddCode($\"'get the id from the event\"$)";
_vue._addcode /*String*/ (("'get the id from the event"));
 //BA.debugLineNum = 58;BA.debugLine="vue.AddCode($\"Dim elID As String = vm.GetIDFromEve";
_vue._addcode /*String*/ (("Dim elID As String = vm.GetIDFromEvent(e)"));
 //BA.debugLineNum = 59;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(elID)\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(elID)"));
 //BA.debugLineNum = 60;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 61;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"menu2code\", \"Menu\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modmenus.getObject(),"menu2code","Menu",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 64;BA.debugLine="Dim menu2 As VMMenu = vm.CreateMenu(\"menu3\", Me).";
_menu2 = _vm._createmenu /*b4j.example.vmmenu*/ ("menu3",modmenus.getObject())._setavatar /*b4j.example.vmmenu*/ ("./assets/sponge.png");
 //BA.debugLineNum = 65;BA.debugLine="menu2.AddItem(\"inbox1\", \"\", \"mdi-view-dashboard\",";
_menu2._additem /*String*/ ("inbox1","","mdi-view-dashboard","Inbox","","");
 //BA.debugLineNum = 66;BA.debugLine="menu2.AddItem(\"drafs1\", \"\", \"mdi-image\", \"Drafts\"";
_menu2._additem /*String*/ ("drafs1","","mdi-image","Drafts","","");
 //BA.debugLineNum = 67;BA.debugLine="menu2.AddItem(\"sent1\", \"\", \"mdi-help-box\", \"Sent\"";
_menu2._additem /*String*/ ("sent1","","mdi-help-box","Sent","","");
 //BA.debugLineNum = 68;BA.debugLine="menu2.AddToContainer(cont, 3, 1)";
_menu2._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 71;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 72;BA.debugLine="vue.AddCode($\"Dim menu2 As VMMenu = vm.CreateMenu(";
_vue._addcode /*String*/ (("Dim menu2 As VMMenu = vm.CreateMenu(\"menu3\", Me).SetAvatar(\"./assets/sponge.png\")"));
 //BA.debugLineNum = 73;BA.debugLine="vue.AddCode($\"menu2.AddItem(\"inbox1\", \"\", \"mdi-vie";
_vue._addcode /*String*/ (("menu2.AddItem(\"inbox1\", \"\", \"mdi-view-dashboard\", \"Inbox\", \"\",\"\")"));
 //BA.debugLineNum = 74;BA.debugLine="vue.AddCode($\"menu2.AddItem(\"drafs1\", \"\", \"mdi-ima";
_vue._addcode /*String*/ (("menu2.AddItem(\"drafs1\", \"\", \"mdi-image\", \"Drafts\", \"\",\"\")"));
 //BA.debugLineNum = 75;BA.debugLine="vue.AddCode($\"menu2.AddItem(\"sent1\", \"\", \"mdi-help";
_vue._addcode /*String*/ (("menu2.AddItem(\"sent1\", \"\", \"mdi-help-box\", \"Sent\", \"\",\"\")"));
 //BA.debugLineNum = 76;BA.debugLine="vue.AddCode($\"menu2.AddToContainer(cont, 3, 1)\"$)";
_vue._addcode /*String*/ (("menu2.AddToContainer(cont, 3, 1)"));
 //BA.debugLineNum = 77;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 78;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 79;BA.debugLine="vue.AddCode($\"Sub menu3items_click(e As BANanoEven";
_vue._addcode /*String*/ (("Sub menu3items_click(e As BANanoEvent)"));
 //BA.debugLineNum = 80;BA.debugLine="vue.AddCode($\"'get the id from the event\"$)";
_vue._addcode /*String*/ (("'get the id from the event"));
 //BA.debugLineNum = 81;BA.debugLine="vue.AddCode($\"Dim elID As String = vm.GetIDFromEve";
_vue._addcode /*String*/ (("Dim elID As String = vm.GetIDFromEvent(e)"));
 //BA.debugLineNum = 82;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(elID)\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(elID)"));
 //BA.debugLineNum = 83;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 84;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"menu3code\", \"Menu\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modmenus.getObject(),"menu3code","Menu",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 88;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public static String  _menu1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub menu1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 113;BA.debugLine="vue.CopyCode2Clipboard(\"menu1code\")";
_vue._copycode2clipboard /*String*/ ("menu1code");
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public static String  _menu1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub menu1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 117;BA.debugLine="vue.DownloadCode(\"menu1code\", \"menu1code.txt\")";
_vue._downloadcode /*String*/ ("menu1code","menu1code.txt");
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public static String  _menu1items_click(com.ab.banano.BANanoEvent _e) throws Exception{
String _elid = "";
 //BA.debugLineNum = 92;BA.debugLine="Sub menu1items_click(e As BANanoEvent)";
 //BA.debugLineNum = 94;BA.debugLine="Dim elID As String = vm.GetIDFromEvent(e)";
_elid = _vm._getidfromevent /*String*/ (_e);
 //BA.debugLineNum = 95;BA.debugLine="vm.ShowSnackBar(elID)";
_vm._showsnackbar /*String*/ (_elid);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public static String  _menu2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub menu2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 122;BA.debugLine="vue.CopyCode2Clipboard(\"menu2code\")";
_vue._copycode2clipboard /*String*/ ("menu2code");
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public static String  _menu2codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub menu2codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 126;BA.debugLine="vue.DownloadCode(\"menu2code\", \"menu2code.txt\")";
_vue._downloadcode /*String*/ ("menu2code","menu2code.txt");
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public static String  _menu2items_click(com.ab.banano.BANanoEvent _e) throws Exception{
String _elid = "";
 //BA.debugLineNum = 98;BA.debugLine="Sub menu2items_click(e As BANanoEvent)";
 //BA.debugLineNum = 100;BA.debugLine="Dim elID As String = vm.GetIDFromEvent(e)";
_elid = _vm._getidfromevent /*String*/ (_e);
 //BA.debugLineNum = 101;BA.debugLine="vm.ShowSnackBar(elID)";
_vm._showsnackbar /*String*/ (_elid);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public static String  _menu3codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub menu3codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 131;BA.debugLine="vue.CopyCode2Clipboard(\"menu3code\")";
_vue._copycode2clipboard /*String*/ ("menu3code");
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public static String  _menu3codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub menu3codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 135;BA.debugLine="vue.DownloadCode(\"menu3code\", \"menu3code.txt\")";
_vue._downloadcode /*String*/ ("menu3code","menu3code.txt");
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public static String  _menu3items_click(com.ab.banano.BANanoEvent _e) throws Exception{
String _elid = "";
 //BA.debugLineNum = 105;BA.debugLine="Sub menu3items_click(e As BANanoEvent)";
 //BA.debugLineNum = 107;BA.debugLine="Dim elID As String = vm.GetIDFromEvent(e)";
_elid = _vm._getidfromevent /*String*/ (_e);
 //BA.debugLineNum = 108;BA.debugLine="vm.ShowSnackBar(elID)";
_vm._showsnackbar /*String*/ (_elid);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"menuCode\"";
_name = "menuCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Menus\"";
_title = "Menus";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
