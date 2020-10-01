package b4j.example;


import anywheresoftware.b4a.BA;

public class modbottomsheet extends Object{
public static modbottomsheet mostCurrent = new modbottomsheet();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modbottomsheet", null);
		ba.loadHtSubs(modbottomsheet.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modbottomsheet", ba);
		}
	}
    public static Class<?> getObject() {
		return modbottomsheet.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
public static b4j.example.vmbottomsheet _bs1 = null;
public static b4j.example.vmbottomsheet _bs2 = null;
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
public static b4j.example.modwindow _modwindow = null;
public static b4j.example.pgbrs _pgbrs = null;
public static b4j.example.bananoshared _bananoshared = null;
public static String  _bscodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub bscodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 83;BA.debugLine="vue.CopyCode2Clipboard(\"bscode\")";
_vue._copycode2clipboard /*String*/ ("bscode");
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public static String  _bscodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub bscodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 87;BA.debugLine="vue.DownloadCode(\"bscode\", \"bscode.txt\")";
_vue._downloadcode /*String*/ ("bscode","bscode.txt");
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public static String  _btnclosesheet_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub btnCloseSheet_click(e As BANanoEvent)";
 //BA.debugLineNum = 104;BA.debugLine="bs1.hide";
_bs1._hide /*String*/ ();
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public static String  _btnclosesheet2_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub btnCloseSheet2_click(e As BANanoEvent)";
 //BA.debugLineNum = 92;BA.debugLine="bs2.hide";
_bs2._hide /*String*/ ();
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public static String  _btninset_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub btnInset_click(e As BANanoEvent)";
 //BA.debugLineNum = 96;BA.debugLine="bs2.show";
_bs2._show /*String*/ ();
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public static String  _btnsheet_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub btnSheet_click(e As BANanoEvent)";
 //BA.debugLineNum = 100;BA.debugLine="bs1.show";
_bs1._show /*String*/ ();
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmsheet _s1 = null;
b4j.example.vmlabel _lbl = null;
b4j.example.vmbutton _btnclose = null;
b4j.example.vmsheet _s = null;
 //BA.debugLineNum = 12;BA.debugLine="Sub Code";
 //BA.debugLineNum = 13;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 14;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 16;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modbottomsheet.getObject());
 //BA.debugLineNum = 18;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="cont.addrows(5).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (5))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 21;BA.debugLine="vm.CreateButton(\"btnSheet\", Me).SetLabel(\"Show Pe";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnSheet",modbottomsheet.getObject())._setlabel /*b4j.example.vmbutton*/ ("Show Persistent Sheet")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateButton(\"btnInset\", Me).SetLabel(\"Show In";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnInset",modbottomsheet.getObject())._setlabel /*b4j.example.vmbutton*/ ("Show Inset")._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="bs1 = vm.CreateBottomSheet(\"bs1\", Me).SetPersiste";
_bs1 = _vm._createbottomsheet /*b4j.example.vmbottomsheet*/ ("bs1",modbottomsheet.getObject())._setpersistent /*b4j.example.vmbottomsheet*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 27;BA.debugLine="Dim s1 As VMSheet = vm.CreateSheet(\"s1\", Me).SetT";
_s1 = _vm._createsheet /*b4j.example.vmsheet*/ ("s1",modbottomsheet.getObject())._settextcenter /*b4j.example.vmsheet*/ ()._setheight /*b4j.example.vmsheet*/ ("200px");
 //BA.debugLineNum = 28;BA.debugLine="s1.Sheet.AddRows(2).AddColumns12";
_s1._sheet /*b4j.example.vmcontainer*/ ._addrows /*b4j.example.vmcontainer*/ ((int) (2))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 30;BA.debugLine="Dim lbl As VMLabel = vm.CreateLabel(\"lblme\").SetT";
_lbl = _vm._createlabel /*b4j.example.vmlabel*/ ("lblme")._settext /*b4j.example.vmlabel*/ ("This is a bottom sheet using persistent prop!")._setspan /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 31;BA.debugLine="s1.Sheet.AddComponent(1, 1, lbl.ToString)";
_s1._sheet /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_lbl._tostring /*String*/ ());
 //BA.debugLineNum = 33;BA.debugLine="Dim btnClose As VMButton = vm.CreateButton(\"btnCl";
_btnclose = _vm._createbutton /*b4j.example.vmbutton*/ ("btnCloseSheet",modbottomsheet.getObject())._setlabel /*b4j.example.vmbutton*/ ("Close Sheet");
 //BA.debugLineNum = 34;BA.debugLine="s1.Sheet.AddComponent(2, 1, btnClose.ToString)";
_s1._sheet /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (2),(int) (1),_btnclose._tostring /*String*/ ());
 //BA.debugLineNum = 36;BA.debugLine="bs1.AddComponent(s1.ToString)";
_bs1._addcomponent /*b4j.example.vmbottomsheet*/ (_s1._tostring /*String*/ ());
 //BA.debugLineNum = 39;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 40;BA.debugLine="vue.AddCode(\"Private bs1 As VMBottomSheet\")";
_vue._addcode /*String*/ ("Private bs1 As VMBottomSheet");
 //BA.debugLineNum = 41;BA.debugLine="vue.AddCode($\"bs1 = vm.CreateBottomSheet(\"bs1\", Me";
_vue._addcode /*String*/ (("bs1 = vm.CreateBottomSheet(\"bs1\", Me).SetPersistent(True)"));
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 43;BA.debugLine="vue.AddCode($\"Dim s1 As VMSheet = vm.CreateSheet(\"";
_vue._addcode /*String*/ (("Dim s1 As VMSheet = vm.CreateSheet(\"s1\", Me).SetTextCenter.SetHeight(\"200px\")"));
 //BA.debugLineNum = 44;BA.debugLine="vue.AddCode($\"s1.Sheet.AddRows(1).AddColumns12\"$)";
_vue._addcode /*String*/ (("s1.Sheet.AddRows(1).AddColumns12"));
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 46;BA.debugLine="vue.AddCode($\"Dim lbl As VMLabel = vm.CreateLabel(";
_vue._addcode /*String*/ (("Dim lbl As VMLabel = vm.CreateLabel(\"lblme\").SetText(\"This is a bottom sheet using persistent prop!\").SetParagraph"));
 //BA.debugLineNum = 47;BA.debugLine="vue.AddCode($\"s1.Sheet.AddComponent(1, 1, lbl.ToSt";
_vue._addcode /*String*/ (("s1.Sheet.AddComponent(1, 1, lbl.ToString)"));
 //BA.debugLineNum = 48;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 49;BA.debugLine="vue.AddCode($\"Dim btnClose As VMButton = vm.Create";
_vue._addcode /*String*/ (("Dim btnClose As VMButton = vm.CreateButton(\"btnCloseSheet\", Me).SetLabel(\"Close Sheet\")"));
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"s1.Sheet.AddComponent(1, 1, btnClose";
_vue._addcode /*String*/ (("s1.Sheet.AddComponent(1, 1, btnClose.ToString)"));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"bs1.AddComponent(s1.ToString)\"$)";
_vue._addcode /*String*/ (("bs1.AddComponent(s1.ToString)"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"vm.AddBottomSheet(bs1)\"$)";
_vue._addcode /*String*/ (("vm.AddBottomSheet(bs1)"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode(\"\")";
_vue._addcode /*String*/ ("");
 //BA.debugLineNum = 55;BA.debugLine="vue.AddCode(\"' to show the sheet...\")";
_vue._addcode /*String*/ ("' to show the sheet...");
 //BA.debugLineNum = 56;BA.debugLine="vue.AddCode(\"bs1.show\")";
_vue._addcode /*String*/ ("bs1.show");
 //BA.debugLineNum = 57;BA.debugLine="vue.AddCode(\"' to hide the sheet...\")";
_vue._addcode /*String*/ ("' to hide the sheet...");
 //BA.debugLineNum = 58;BA.debugLine="vue.AddCode(\"bs1.hide\")";
_vue._addcode /*String*/ ("bs1.hide");
 //BA.debugLineNum = 59;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"bscode\", \"Bottom Sh";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbottomsheet.getObject(),"bscode","Bottom Sheet",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 62;BA.debugLine="bs2 = vm.CreateBottomSheet(\"bs2\", Me).SetInset(Tr";
_bs2 = _vm._createbottomsheet /*b4j.example.vmbottomsheet*/ ("bs2",modbottomsheet.getObject())._setinset /*b4j.example.vmbottomsheet*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 63;BA.debugLine="Dim s As VMSheet = vm.CreateSheet(\"s2\", Me).SetTe";
_s = _vm._createsheet /*b4j.example.vmsheet*/ ("s2",modbottomsheet.getObject())._settextcenter /*b4j.example.vmsheet*/ ()._setheight /*b4j.example.vmsheet*/ ("200px");
 //BA.debugLineNum = 65;BA.debugLine="s.Sheet.AddRows(2).AddColumns12";
_s._sheet /*b4j.example.vmcontainer*/ ._addrows /*b4j.example.vmcontainer*/ ((int) (2))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 67;BA.debugLine="Dim lbl As VMLabel = vm.CreateLabel(\"lbl2\").SetTe";
_lbl = _vm._createlabel /*b4j.example.vmlabel*/ ("lbl2")._settext /*b4j.example.vmlabel*/ ("This is a bottom sheet using inset prop!")._setparagraph /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 68;BA.debugLine="s.Sheet.AddComponent(1, 1, lbl.ToString)";
_s._sheet /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_lbl._tostring /*String*/ ());
 //BA.debugLineNum = 70;BA.debugLine="Dim btnClose As VMButton = vm.CreateButton(\"btnCl";
_btnclose = _vm._createbutton /*b4j.example.vmbutton*/ ("btnCloseSheet2",modbottomsheet.getObject())._setlabel /*b4j.example.vmbutton*/ ("Close Sheet");
 //BA.debugLineNum = 71;BA.debugLine="s.Sheet.AddComponent(2, 1, btnClose.ToString)";
_s._sheet /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (2),(int) (1),_btnclose._tostring /*String*/ ());
 //BA.debugLineNum = 73;BA.debugLine="bs2.AddComponent(s.ToString)";
_bs2._addcomponent /*b4j.example.vmbottomsheet*/ (_s._tostring /*String*/ ());
 //BA.debugLineNum = 75;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 77;BA.debugLine="vm.AddBottomSheet(bs1)";
_vm._addbottomsheet /*String*/ (_bs1);
 //BA.debugLineNum = 78;BA.debugLine="vm.AddBottomSheet(bs2)";
_vm._addbottomsheet /*String*/ (_bs2);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"bottomSheetCode\"";
_name = "bottomSheetCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Bottom Sheet\"";
_title = "Bottom Sheet";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private bs1 As VMBottomSheet";
_bs1 = new b4j.example.vmbottomsheet();
 //BA.debugLineNum = 7;BA.debugLine="Private bs2 As VMBottomSheet";
_bs2 = new b4j.example.vmbottomsheet();
 //BA.debugLineNum = 8;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
}
