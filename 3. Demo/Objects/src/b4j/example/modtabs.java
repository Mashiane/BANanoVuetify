package b4j.example;


import anywheresoftware.b4a.BA;

public class modtabs extends Object{
public static modtabs mostCurrent = new modtabs();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modtabs", null);
		ba.loadHtSubs(modtabs.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modtabs", ba);
		}
	}
    public static Class<?> getObject() {
		return modtabs.class;
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
public static b4j.example.modwindow _modwindow = null;
public static b4j.example.pgbrs _pgbrs = null;
public static b4j.example.bananoshared _bananoshared = null;
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmlabel _lbl1 = null;
b4j.example.vmcontainer _contbtna = null;
b4j.example.vmlabel _lbl2 = null;
b4j.example.vmcontainer _contbtnb = null;
b4j.example.vmlabel _lbl3 = null;
b4j.example.vmcontainer _contbtnc = null;
b4j.example.vmtabs _b = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modtabs.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.addrows(5).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (5))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 21;BA.debugLine="Dim lbl1 As VMLabel = vm.CreateLabel(\"\").SetParag";
_lbl1 = _vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 22;BA.debugLine="lbl1.SetText(vm.Rand_LoremIpsum(1))";
_lbl1._settext /*b4j.example.vmlabel*/ (_vm._rand_loremipsum /*String*/ ((int) (1)));
 //BA.debugLineNum = 23;BA.debugLine="Dim contbtna As VMContainer";
_contbtna = new b4j.example.vmcontainer();
 //BA.debugLineNum = 24;BA.debugLine="contbtna = vm.CreateContainer(\"contxa\", Me)";
_contbtna = _vm._createcontainer /*b4j.example.vmcontainer*/ ("contxa",modtabs.getObject());
 //BA.debugLineNum = 25;BA.debugLine="contbtna.AddControlS(lbl1.Label, lbl1.tostring, 1";
_contbtna._addcontrols /*String*/ (_lbl1._label /*b4j.example.vmelement*/ ,_lbl1._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 27;BA.debugLine="Dim lbl2 As VMLabel = vm.CreateLabel(\"\").SetParag";
_lbl2 = _vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 28;BA.debugLine="lbl2.SetText(vm.Rand_LoremIpsum(1))";
_lbl2._settext /*b4j.example.vmlabel*/ (_vm._rand_loremipsum /*String*/ ((int) (1)));
 //BA.debugLineNum = 29;BA.debugLine="Dim contbtnb As VMContainer";
_contbtnb = new b4j.example.vmcontainer();
 //BA.debugLineNum = 30;BA.debugLine="contbtnb = vm.CreateContainer(\"contxb\", Me)";
_contbtnb = _vm._createcontainer /*b4j.example.vmcontainer*/ ("contxb",modtabs.getObject());
 //BA.debugLineNum = 31;BA.debugLine="contbtnb.AddControlS(lbl2.Label, lbl2.tostring, 1";
_contbtnb._addcontrols /*String*/ (_lbl2._label /*b4j.example.vmelement*/ ,_lbl2._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 34;BA.debugLine="Dim lbl3 As VMLabel = vm.CreateLabel(\"\").SetParag";
_lbl3 = _vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 35;BA.debugLine="lbl3.SetText(vm.Rand_LoremIpsum(1))";
_lbl3._settext /*b4j.example.vmlabel*/ (_vm._rand_loremipsum /*String*/ ((int) (1)));
 //BA.debugLineNum = 36;BA.debugLine="Dim contbtnc As VMContainer";
_contbtnc = new b4j.example.vmcontainer();
 //BA.debugLineNum = 37;BA.debugLine="contbtnc = vm.CreateContainer(\"contxc\", Me)";
_contbtnc = _vm._createcontainer /*b4j.example.vmcontainer*/ ("contxc",modtabs.getObject());
 //BA.debugLineNum = 38;BA.debugLine="contbtnc.AddControlS(lbl3.Label, lbl3.tostring, 1";
_contbtnc._addcontrols /*String*/ (_lbl3._label /*b4j.example.vmelement*/ ,_lbl3._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 40;BA.debugLine="Dim b As VMTabs = vm.CreateTabs(\"b\", Me).SetGrow(";
_b = _vm._createtabs /*b4j.example.vmtabs*/ ("b",modtabs.getObject())._setgrow /*b4j.example.vmtabs*/ (anywheresoftware.b4a.keywords.Common.True)._seticonsandtext /*b4j.example.vmtabs*/ (anywheresoftware.b4a.keywords.Common.True)._setdark /*b4j.example.vmtabs*/ (anywheresoftware.b4a.keywords.Common.True)._setcentered /*b4j.example.vmtabs*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 41;BA.debugLine="b.AddTab(\"b1\", \"Item 1\", \"mdi-phone\",contbtna)";
_b._addtab /*String*/ ("b1","Item 1","mdi-phone",_contbtna);
 //BA.debugLineNum = 42;BA.debugLine="b.AddTabBadge(\"b2\", \"Item 2\", \"mdi-heart\", contbt";
_b._addtabbadge /*String*/ ("b2","Item 2","mdi-heart",_contbtnb,"10");
 //BA.debugLineNum = 43;BA.debugLine="vm.SetBadgeAvatar(\"b2\", False)";
_vm._setbadgeavatar /*b4j.example.bananovm*/ ("b2",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 44;BA.debugLine="vm.SetBadgeOverlap(\"b2\", False)";
_vm._setbadgeoverlap /*b4j.example.bananovm*/ ("b2",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 45;BA.debugLine="vm.SetBadgeOffsetX(\"b2\", \"-40\")";
_vm._setbadgeoffsetx /*b4j.example.bananovm*/ ("b2","-40");
 //BA.debugLineNum = 46;BA.debugLine="vm.SetBadgeOffsetY(\"b2\", \"20\")";
_vm._setbadgeoffsety /*b4j.example.bananovm*/ ("b2","20");
 //BA.debugLineNum = 47;BA.debugLine="b.AddTab(\"b3\", \"Item 3\", \"mdi-account-box\", contb";
_b._addtab /*String*/ ("b3","Item 3","mdi-account-box",_contbtnc);
 //BA.debugLineNum = 48;BA.debugLine="b.AddToContainer(cont, 1, 1)";
_b._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 51;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"'create containers and content\"$)";
_vue._addcode /*String*/ (("'create containers and content"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"Dim lbl1 As VMLabel = vm.CreateLabe";
_vue._addcode /*String*/ (("Dim lbl1 As VMLabel = vm.CreateLabel(\"\").SetParagraph"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"lbl1.SetText(vm.Rand_LoremIpsum(1))";
_vue._addcode /*String*/ (("lbl1.SetText(vm.Rand_LoremIpsum(1))"));
 //BA.debugLineNum = 55;BA.debugLine="vue.AddCode($\"Dim contbtna As VMContainer\"$)";
_vue._addcode /*String*/ (("Dim contbtna As VMContainer"));
 //BA.debugLineNum = 56;BA.debugLine="vue.AddCode($\"contbtna = vm.CreateContainer(\"cont";
_vue._addcode /*String*/ (("contbtna = vm.CreateContainer(\"contxa\", Me)"));
 //BA.debugLineNum = 57;BA.debugLine="vue.AddCode($\"contbtna.AddControlS(lbl1.Label, lb";
_vue._addcode /*String*/ (("contbtna.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)"));
 //BA.debugLineNum = 58;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 59;BA.debugLine="vue.AddCode($\"Dim lbl2 As VMLabel = vm.CreateLabe";
_vue._addcode /*String*/ (("Dim lbl2 As VMLabel = vm.CreateLabel(\"\").SetParagraph"));
 //BA.debugLineNum = 60;BA.debugLine="vue.AddCode($\"lbl2.SetText(vm.Rand_LoremIpsum(1))";
_vue._addcode /*String*/ (("lbl2.SetText(vm.Rand_LoremIpsum(1))"));
 //BA.debugLineNum = 61;BA.debugLine="vue.AddCode($\"Dim contbtnb As VMContainer\"$)";
_vue._addcode /*String*/ (("Dim contbtnb As VMContainer"));
 //BA.debugLineNum = 62;BA.debugLine="vue.AddCode($\"contbtnb = vm.CreateContainer(\"cont";
_vue._addcode /*String*/ (("contbtnb = vm.CreateContainer(\"contxb\", Me)"));
 //BA.debugLineNum = 63;BA.debugLine="vue.AddCode($\"contbtnb.AddControlS(lbl2.Label, lb";
_vue._addcode /*String*/ (("contbtnb.AddControlS(lbl2.Label, lbl2.tostring, 1, 1, 12, 12, 12, 12)"));
 //BA.debugLineNum = 64;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 65;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 66;BA.debugLine="vue.AddCode($\"Dim lbl3 As VMLabel = vm.CreateLabe";
_vue._addcode /*String*/ (("Dim lbl3 As VMLabel = vm.CreateLabel(\"\").SetParagraph"));
 //BA.debugLineNum = 67;BA.debugLine="vue.AddCode($\"lbl3.SetText(vm.Rand_LoremIpsum(1))";
_vue._addcode /*String*/ (("lbl3.SetText(vm.Rand_LoremIpsum(1))"));
 //BA.debugLineNum = 68;BA.debugLine="vue.AddCode($\"Dim contbtnc As VMContainer\"$)";
_vue._addcode /*String*/ (("Dim contbtnc As VMContainer"));
 //BA.debugLineNum = 69;BA.debugLine="vue.AddCode($\"contbtnc = vm.CreateContainer(\"cont";
_vue._addcode /*String*/ (("contbtnc = vm.CreateContainer(\"contxc\", Me)"));
 //BA.debugLineNum = 70;BA.debugLine="vue.AddCode($\"contbtnc.AddControlS(lbl3.Label, lb";
_vue._addcode /*String*/ (("contbtnc.AddControlS(lbl3.Label, lbl3.tostring, 1, 1, 12, 12, 12, 12)"));
 //BA.debugLineNum = 71;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"tab1code\", \"Tab Co";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modtabs.getObject(),"tab1code","Tab Containers",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 74;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 75;BA.debugLine="vue.AddCode($\"Dim b As VMTabs = vm.CreateTabs(\"b\",";
_vue._addcode /*String*/ (("Dim b As VMTabs = vm.CreateTabs(\"b\", Me).SetGrow(True).SetIconsAndText(True).SetDark(True).SetCentered(True)"));
 //BA.debugLineNum = 76;BA.debugLine="vue.AddCode($\"b.AddTab(\"b1\", \"Item 1\", \"mdi-phone\"";
_vue._addcode /*String*/ (("b.AddTab(\"b1\", \"Item 1\", \"mdi-phone\",contbtna)"));
 //BA.debugLineNum = 77;BA.debugLine="vue.AddCode($\"b.AddTabBadge(\"b2\", \"Item 2\", \"mdi-h";
_vue._addcode /*String*/ (("b.AddTabBadge(\"b2\", \"Item 2\", \"mdi-heart\", contbtnb, \"10\")"));
 //BA.debugLineNum = 78;BA.debugLine="vue.AddCode($\"vm.SetBadgeAvatar(\"b2\", False)\"$)";
_vue._addcode /*String*/ (("vm.SetBadgeAvatar(\"b2\", False)"));
 //BA.debugLineNum = 79;BA.debugLine="vue.AddCode($\"vm.SetBadgeOverlap(\"b2\", False)\"$)";
_vue._addcode /*String*/ (("vm.SetBadgeOverlap(\"b2\", False)"));
 //BA.debugLineNum = 80;BA.debugLine="vue.AddCode($\"vm.SetBadgeOffsetX(\"b2\", \"-40\")\"$)";
_vue._addcode /*String*/ (("vm.SetBadgeOffsetX(\"b2\", \"-40\")"));
 //BA.debugLineNum = 81;BA.debugLine="vue.AddCode($\"vm.SetBadgeOffsetY(\"b2\", \"20\")\"$)";
_vue._addcode /*String*/ (("vm.SetBadgeOffsetY(\"b2\", \"20\")"));
 //BA.debugLineNum = 82;BA.debugLine="vue.AddCode($\"b.AddTab(\"b3\", \"Item 3\", \"mdi-accoun";
_vue._addcode /*String*/ (("b.AddTab(\"b3\", \"Item 3\", \"mdi-account-box\", contbtnc)"));
 //BA.debugLineNum = 83;BA.debugLine="vue.AddCode($\"b.AddToContainer(cont, 1, 1)\"$)";
_vue._addcode /*String*/ (("b.AddToContainer(cont, 1, 1)"));
 //BA.debugLineNum = 84;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"tab2code\", \"Tabs\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modtabs.getObject(),"tab2code","Tabs",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 102;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"tabsCode\"";
_name = "tabsCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Tabs\"";
_title = "Tabs";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _tab1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub tab1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 116;BA.debugLine="vue.CopyCode2Clipboard(\"tab1code\")";
_vue._copycode2clipboard /*String*/ ("tab1code");
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public static String  _tab1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub tab1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 120;BA.debugLine="vue.DownloadCode(\"tab1code\", \"tab1code.txt\")";
_vue._downloadcode /*String*/ ("tab1code","tab1code.txt");
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public static String  _tab2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub tab2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 107;BA.debugLine="vue.CopyCode2Clipboard(\"tab2code\")";
_vue._copycode2clipboard /*String*/ ("tab2code");
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public static String  _tab2codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub tab2codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 111;BA.debugLine="vue.DownloadCode(\"tab2code\", \"tab2code.txt\")";
_vue._downloadcode /*String*/ ("tab2code","tab2code.txt");
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
}
