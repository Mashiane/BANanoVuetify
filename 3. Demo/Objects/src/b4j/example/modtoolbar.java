package b4j.example;


import anywheresoftware.b4a.BA;

public class modtoolbar extends Object{
public static modtoolbar mostCurrent = new modtoolbar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modtoolbar", null);
		ba.loadHtSubs(modtoolbar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modtoolbar", ba);
		}
	}
    public static Class<?> getObject() {
		return modtoolbar.class;
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
public static b4j.example.modtextfield _modtextfield = null;
public static b4j.example.modtimeline _modtimeline = null;
public static b4j.example.modtimepicker _modtimepicker = null;
public static b4j.example.modtoolkit _modtoolkit = null;
public static b4j.example.modtreeview _modtreeview = null;
public static b4j.example.modwindow _modwindow = null;
public static b4j.example.pgbrs _pgbrs = null;
public static b4j.example.bananoshared _bananoshared = null;
public static String  _btnexport_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub btnexport_click(e As BANanoEvent)";
 //BA.debugLineNum = 162;BA.debugLine="vm.ShowSnackBar(\"Export!\")";
_vm._showsnackbar /*String*/ ("Export!");
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public static String  _btnheart_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub btnheart_click(e As BANanoEvent)";
 //BA.debugLineNum = 170;BA.debugLine="vm.ShowSnackBar(\"Heart!\")";
_vm._showsnackbar /*String*/ ("Heart!");
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public static String  _btnmagnify_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub btnmagnify_click(e As BANanoEvent)";
 //BA.debugLineNum = 174;BA.debugLine="vm.ShowSnackBar(\"Search!\")";
_vm._showsnackbar /*String*/ ("Search!");
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub btnmenu_click(e As BANanoEvent)";
 //BA.debugLineNum = 166;BA.debugLine="vm.ShowSnackBar(\"Menu!\")";
_vm._showsnackbar /*String*/ ("Menu!");
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmtoolbar _tbl1 = null;
b4j.example.vmbutton _fab = null;
b4j.example.vmbutton _fab2 = null;
b4j.example.vmtoolbar _tbx = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modtoolbar.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 17;BA.debugLine="cont.AddRows(5).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (5))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 19;BA.debugLine="Dim tbl1 As VMToolBar = vm.CreateToolbar(\"tbl1\",";
_tbl1 = _vm._createtoolbar /*b4j.example.vmtoolbar*/ ("tbl1",modtoolbar.getObject());
 //BA.debugLineNum = 20;BA.debugLine="tbl1.SetProminent(True).SetExtended(True).SetDark";
_tbl1._setprominent /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True)._setextended /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True)._setdark /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 21;BA.debugLine="tbl1.SetSrc(\"./assets/vbanner.jpg\")";
_tbl1._setsrc /*b4j.example.vmtoolbar*/ ("./assets/vbanner.jpg");
 //BA.debugLineNum = 23;BA.debugLine="tbl1.AddHamburger";
_tbl1._addhamburger /*b4j.example.vmtoolbar*/ ();
 //BA.debugLineNum = 24;BA.debugLine="tbl1.AddTitle(\"Toolbar Title\",\"\")";
_tbl1._addtitle /*b4j.example.vmtoolbar*/ ("Toolbar Title","");
 //BA.debugLineNum = 25;BA.debugLine="tbl1.AddSpacer";
_tbl1._addspacer /*b4j.example.vmtoolbar*/ ();
 //BA.debugLineNum = 27;BA.debugLine="tbl1.AddIcon(\"btnmagnify\", \"mdi-magnify\", \"\", \"\")";
_tbl1._addicon /*b4j.example.vmtoolbar*/ ("btnmagnify","mdi-magnify","","");
 //BA.debugLineNum = 28;BA.debugLine="tbl1.AddIcon(\"btnheart\", \"mdi-heart\", \"\", \"\")";
_tbl1._addicon /*b4j.example.vmtoolbar*/ ("btnheart","mdi-heart","","");
 //BA.debugLineNum = 29;BA.debugLine="tbl1.AddIcon(\"btnmenu\", \"mdi-dots-vertical\", \"\",";
_tbl1._addicon /*b4j.example.vmtoolbar*/ ("btnmenu","mdi-dots-vertical","","");
 //BA.debugLineNum = 30;BA.debugLine="tbl1.AddIcon(\"btnexport\", \"mdi-export\", \"\", \"\")";
_tbl1._addicon /*b4j.example.vmtoolbar*/ ("btnexport","mdi-export","","");
 //BA.debugLineNum = 32;BA.debugLine="Dim fab As VMButton = vm.CreateFABButton(\"fabx\",";
_fab = _vm._createfabbutton /*b4j.example.vmbutton*/ ("fabx",modtoolbar.getObject(),"mdi-plus")._setcolor /*b4j.example.vmbutton*/ ("pink")._setbottomleft /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 33;BA.debugLine="Dim fab2 As VMButton = vm.CreateFABButton(\"fabbr\"";
_fab2 = _vm._createfabbutton /*b4j.example.vmbutton*/ ("fabbr",modtoolbar.getObject(),"mdi-plus")._setcolor /*b4j.example.vmbutton*/ ("green")._setbottomright /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 35;BA.debugLine="tbl1.AddFAB(fab)";
_tbl1._addfab /*b4j.example.vmtoolbar*/ (_fab);
 //BA.debugLineNum = 36;BA.debugLine="tbl1.AddFAB(fab2)";
_tbl1._addfab /*b4j.example.vmtoolbar*/ (_fab2);
 //BA.debugLineNum = 38;BA.debugLine="tbl1.AddToContainer(cont, 1, 1)";
_tbl1._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 41;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"Dim tbl1 As VMToolBar = vm.CreateToo";
_vue._addcode /*String*/ (("Dim tbl1 As VMToolBar = vm.CreateToolbar(\"tbl1\", Me)"));
 //BA.debugLineNum = 43;BA.debugLine="vue.AddCode($\"tbl1.SetProminent(True).SetExtended(";
_vue._addcode /*String*/ (("tbl1.SetProminent(True).SetExtended(True).SetDark(True)"));
 //BA.debugLineNum = 44;BA.debugLine="vue.AddCode($\"tbl1.SetSrc(\"./assets/vbanner.jpg\")\"";
_vue._addcode /*String*/ (("tbl1.SetSrc(\"./assets/vbanner.jpg\")"));
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 46;BA.debugLine="vue.AddCode($\"tbl1.AddHamburger\"$)";
_vue._addcode /*String*/ (("tbl1.AddHamburger"));
 //BA.debugLineNum = 47;BA.debugLine="vue.AddCode($\"tbl1.AddTitle(\"Toolbar Title\",\"\")\"$)";
_vue._addcode /*String*/ (("tbl1.AddTitle(\"Toolbar Title\",\"\")"));
 //BA.debugLineNum = 48;BA.debugLine="vue.AddCode($\"tbl1.AddSpacer\"$)";
_vue._addcode /*String*/ (("tbl1.AddSpacer"));
 //BA.debugLineNum = 49;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"tbl1.AddIcon(\"btnmagnify\", \"mdi-magn";
_vue._addcode /*String*/ (("tbl1.AddIcon(\"btnmagnify\", \"mdi-magnify\", \"\", \"\")"));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"tbl1.AddIcon(\"btnheart\", \"mdi-heart\"";
_vue._addcode /*String*/ (("tbl1.AddIcon(\"btnheart\", \"mdi-heart\", \"\", \"\")"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"tbl1.AddIcon(\"btnmenu\", \"mdi-dots-ve";
_vue._addcode /*String*/ (("tbl1.AddIcon(\"btnmenu\", \"mdi-dots-vertical\", \"\", \"\")"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"tbl1.AddIcon(\"btnexport\", \"mdi-expor";
_vue._addcode /*String*/ (("tbl1.AddIcon(\"btnexport\", \"mdi-export\", \"\", \"\")"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 55;BA.debugLine="vue.AddCode($\"Dim fab As VMButton = vm.CreateFABBu";
_vue._addcode /*String*/ (("Dim fab As VMButton = vm.CreateFABButton(\"fabx\", Me, \"mdi-plus\").SetColor(\"pink\").SetBottomLeft(True)"));
 //BA.debugLineNum = 56;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 57;BA.debugLine="vue.AddCode($\"'trapping events\"$)";
_vue._addcode /*String*/ (("'trapping events"));
 //BA.debugLineNum = 58;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 59;BA.debugLine="vue.AddCode($\"Sub btnexport_click(e As BANanoEvent";
_vue._addcode /*String*/ (("Sub btnexport_click(e As BANanoEvent)"));
 //BA.debugLineNum = 60;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Export!\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Export!\")"));
 //BA.debugLineNum = 61;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 62;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 63;BA.debugLine="vue.AddCode($\"Sub btnmenu_click(e As BANanoEvent)\"";
_vue._addcode /*String*/ (("Sub btnmenu_click(e As BANanoEvent)"));
 //BA.debugLineNum = 64;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Menu!\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Menu!\")"));
 //BA.debugLineNum = 65;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 66;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 67;BA.debugLine="vue.AddCode($\"Sub btnheart_click(e As BANanoEvent)";
_vue._addcode /*String*/ (("Sub btnheart_click(e As BANanoEvent)"));
 //BA.debugLineNum = 68;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Heart!\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Heart!\")"));
 //BA.debugLineNum = 69;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 70;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 71;BA.debugLine="vue.AddCode($\"Sub btnmagnify_click(e As BANanoEven";
_vue._addcode /*String*/ (("Sub btnmagnify_click(e As BANanoEvent)"));
 //BA.debugLineNum = 72;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Search!\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Search!\")"));
 //BA.debugLineNum = 73;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 74;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 75;BA.debugLine="vue.AddCode($\"Sub fabx_click(e As BANanoEvent)\"$)";
_vue._addcode /*String*/ (("Sub fabx_click(e As BANanoEvent)"));
 //BA.debugLineNum = 76;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Pink button clicked";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Pink button clicked!\")"));
 //BA.debugLineNum = 77;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 78;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 79;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 80;BA.debugLine="vue.AddCode($\"Sub fabbr_click(e As BANanoEvent)\"$)";
_vue._addcode /*String*/ (("Sub fabbr_click(e As BANanoEvent)"));
 //BA.debugLineNum = 81;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Green button clicke";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Green button clicked!\")"));
 //BA.debugLineNum = 82;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 83;BA.debugLine="vue.AddCode($\"Dim fab2 As VMButton = vm.CreateFABB";
_vue._addcode /*String*/ (("Dim fab2 As VMButton = vm.CreateFABButton(\"fabbr\", Me, \"mdi-plus\").SetColor(\"green\").SetBottomRight(True)"));
 //BA.debugLineNum = 84;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 85;BA.debugLine="vue.AddCode($\"tbl1.AddFAB(fab)\"$)";
_vue._addcode /*String*/ (("tbl1.AddFAB(fab)"));
 //BA.debugLineNum = 86;BA.debugLine="vue.AddCode($\"tbl1.AddFAB(fab2)\"$)";
_vue._addcode /*String*/ (("tbl1.AddFAB(fab2)"));
 //BA.debugLineNum = 87;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 88;BA.debugLine="vue.AddCode($\"tbl1.AddToContainer(cont, 1, 1)\"$)";
_vue._addcode /*String*/ (("tbl1.AddToContainer(cont, 1, 1)"));
 //BA.debugLineNum = 89;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"toolbar1code\", \"Too";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modtoolbar.getObject(),"toolbar1code","Toolbar",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 93;BA.debugLine="Dim tbx As VMToolBar = vm.createtoolbar(\"tbx\", Me";
_tbx = _vm._createtoolbar /*b4j.example.vmtoolbar*/ ("tbx",modtoolbar.getObject())._setdark /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True)._setcolor /*b4j.example.vmtoolbar*/ (_vm._color_purple /*String*/ );
 //BA.debugLineNum = 94;BA.debugLine="tbx.AddTitle(\"My Toolbar X\",\"\")";
_tbx._addtitle /*b4j.example.vmtoolbar*/ ("My Toolbar X","");
 //BA.debugLineNum = 95;BA.debugLine="tbx.AddDivider(True, Null, Null, Array(\"mx-4\"), N";
_tbx._adddivider /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("mx-4")}),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 96;BA.debugLine="tbx.AddSubHeading(\"My Sub Heading X\", Null, Null,";
_tbx._addsubheading /*b4j.example.vmtoolbar*/ ("My Sub Heading X",(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 97;BA.debugLine="tbx.AddSpacer";
_tbx._addspacer /*b4j.example.vmtoolbar*/ ();
 //BA.debugLineNum = 98;BA.debugLine="tbx.AddButton(vm.CreateButton(\"btnx1\", Me).SetAtt";
_tbx._addbutton /*b4j.example.vmtoolbar*/ (_vm._createbutton /*b4j.example.vmbutton*/ ("btnx1",modtoolbar.getObject())._setattrloose /*b4j.example.vmbutton*/ ("text")._setlabel /*b4j.example.vmbutton*/ ("News"));
 //BA.debugLineNum = 99;BA.debugLine="tbx.AddButton(vm.CreateButton(\"btnx2\", Me).SetAtt";
_tbx._addbutton /*b4j.example.vmtoolbar*/ (_vm._createbutton /*b4j.example.vmbutton*/ ("btnx2",modtoolbar.getObject())._setattrloose /*b4j.example.vmbutton*/ ("text")._setlabel /*b4j.example.vmbutton*/ ("Blog"));
 //BA.debugLineNum = 100;BA.debugLine="tbx.AddButton(vm.CreateButton(\"btnx3\", Me).SetAtt";
_tbx._addbutton /*b4j.example.vmtoolbar*/ (_vm._createbutton /*b4j.example.vmbutton*/ ("btnx3",modtoolbar.getObject())._setattrloose /*b4j.example.vmbutton*/ ("text")._setlabel /*b4j.example.vmbutton*/ ("Music"));
 //BA.debugLineNum = 101;BA.debugLine="tbx.AddHamburger   'tbxmenu";
_tbx._addhamburger /*b4j.example.vmtoolbar*/ ();
 //BA.debugLineNum = 103;BA.debugLine="cont.AddComponent(4,1, tbx.ToString)";
_cont._addcomponent /*String*/ ((int) (4),(int) (1),_tbx._tostring /*String*/ ());
 //BA.debugLineNum = 106;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 107;BA.debugLine="vue.AddCode($\"Dim tbx As VMToolBar = vm.createtool";
_vue._addcode /*String*/ (("Dim tbx As VMToolBar = vm.createtoolbar(\"tbx\", Me).SetDark(True).SetColor(vm.COLOR_PURPLE)"));
 //BA.debugLineNum = 108;BA.debugLine="vue.AddCode($\"tbx.AddTitle(\"My Toolbar X\",\"\")\"$)";
_vue._addcode /*String*/ (("tbx.AddTitle(\"My Toolbar X\",\"\")"));
 //BA.debugLineNum = 109;BA.debugLine="vue.AddCode($\"tbx.AddDivider(True, Null, Null, Arr";
_vue._addcode /*String*/ (("tbx.AddDivider(True, Null, Null, Array(\"mx-4\"), Null)"));
 //BA.debugLineNum = 110;BA.debugLine="vue.AddCode($\"tbx.AddSubHeading(\"My Sub Heading X\"";
_vue._addcode /*String*/ (("tbx.AddSubHeading(\"My Sub Heading X\", Null, Null, Null, Null)"));
 //BA.debugLineNum = 111;BA.debugLine="vue.AddCode($\"tbx.AddSpacer\"$)";
_vue._addcode /*String*/ (("tbx.AddSpacer"));
 //BA.debugLineNum = 112;BA.debugLine="vue.AddCode($\"tbx.AddButton(vm.CreateButton(\"btnx1";
_vue._addcode /*String*/ (("tbx.AddButton(vm.CreateButton(\"btnx1\", Me).SetAttrLoose(\"text\").SetLabel(\"News\"))"));
 //BA.debugLineNum = 113;BA.debugLine="vue.AddCode($\"tbx.AddButton(vm.CreateButton(\"btnx2";
_vue._addcode /*String*/ (("tbx.AddButton(vm.CreateButton(\"btnx2\", Me).SetAttrLoose(\"text\").SetLabel(\"Blog\"))"));
 //BA.debugLineNum = 114;BA.debugLine="vue.AddCode($\"tbx.AddButton(vm.CreateButton(\"btnx3";
_vue._addcode /*String*/ (("tbx.AddButton(vm.CreateButton(\"btnx3\", Me).SetAttrLoose(\"text\").SetLabel(\"Music\"))"));
 //BA.debugLineNum = 115;BA.debugLine="vue.AddCode($\"tbx.AddHamburger   'tbxmenu\"$)";
_vue._addcode /*String*/ (("tbx.AddHamburger   'tbxmenu"));
 //BA.debugLineNum = 116;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 117;BA.debugLine="vue.AddCode($\"cont.AddComponent(3,1, tbx.ToString)";
_vue._addcode /*String*/ (("cont.AddComponent(3,1, tbx.ToString)"));
 //BA.debugLineNum = 118;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 119;BA.debugLine="vue.AddCode($\"'events\"$)";
_vue._addcode /*String*/ (("'events"));
 //BA.debugLineNum = 120;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 121;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 122;BA.debugLine="vue.AddCode($\"Sub tbxmenu_click(e As BANanoEvent)\"";
_vue._addcode /*String*/ (("Sub tbxmenu_click(e As BANanoEvent)"));
 //BA.debugLineNum = 123;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Menu clicked!\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Menu clicked!\")"));
 //BA.debugLineNum = 124;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 125;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 126;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 127;BA.debugLine="vue.AddCode($\"Sub btnexport_click(e As BANanoEvent";
_vue._addcode /*String*/ (("Sub btnexport_click(e As BANanoEvent)"));
 //BA.debugLineNum = 128;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Export!\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Export!\")"));
 //BA.debugLineNum = 129;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 130;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"toolbar2code\", \"Too";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modtoolbar.getObject(),"toolbar2code","Toolbar",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 134;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public static String  _fabbr_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub fabbr_click(e As BANanoEvent)";
 //BA.debugLineNum = 183;BA.debugLine="vm.ShowSnackBar(\"Green button clicked!\")";
_vm._showsnackbar /*String*/ ("Green button clicked!");
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public static String  _fabx_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub fabx_click(e As BANanoEvent)";
 //BA.debugLineNum = 178;BA.debugLine="vm.ShowSnackBar(\"Pink button clicked!\")";
_vm._showsnackbar /*String*/ ("Pink button clicked!");
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"toolbarCode\"";
_name = "toolbarCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Toolbars\"";
_title = "Toolbars";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _tbxmenu_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub tbxmenu_click(e As BANanoEvent)";
 //BA.debugLineNum = 157;BA.debugLine="vm.ShowSnackBar(\"Menu clicked!\")";
_vm._showsnackbar /*String*/ ("Menu clicked!");
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public static String  _toolbar1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub toolbar1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 148;BA.debugLine="vue.CopyCode2Clipboard(\"toolbar1code\")";
_vue._copycode2clipboard /*String*/ ("toolbar1code");
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public static String  _toolbar1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub toolbar1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 152;BA.debugLine="vue.DownloadCode(\"toolbar1code\", \"toolbar1code.tx";
_vue._downloadcode /*String*/ ("toolbar1code","toolbar1code.txt");
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public static String  _toolbar2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub toolbar2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 139;BA.debugLine="vue.CopyCode2Clipboard(\"toolbar2code\")";
_vue._copycode2clipboard /*String*/ ("toolbar2code");
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public static String  _toolbar2codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub toolbar2codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 143;BA.debugLine="vue.DownloadCode(\"toolbar2code\", \"toolbar2code.tx";
_vue._downloadcode /*String*/ ("toolbar2code","toolbar2code.txt");
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
}
