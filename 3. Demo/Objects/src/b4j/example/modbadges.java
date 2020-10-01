package b4j.example;


import anywheresoftware.b4a.BA;

public class modbadges extends Object{
public static modbadges mostCurrent = new modbadges();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modbadges", null);
		ba.loadHtSubs(modbadges.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modbadges", ba);
		}
	}
    public static Class<?> getObject() {
		return modbadges.class;
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
public static b4j.example.modwindow _modwindow = null;
public static b4j.example.pgbrs _pgbrs = null;
public static b4j.example.bananoshared _bananoshared = null;
public static String  _b1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub b1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 67;BA.debugLine="vue.CopyCode2Clipboard(\"b1code\")";
_vue._copycode2clipboard /*String*/ ("b1code");
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _b2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub b2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 71;BA.debugLine="vue.CopyCode2Clipboard(\"b2code\")";
_vue._copycode2clipboard /*String*/ ("b2code");
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public static String  _b3codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub b3codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 75;BA.debugLine="vue.CopyCode2Clipboard(\"b3code\")";
_vue._copycode2clipboard /*String*/ ("b3code");
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _btnim_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub btnim_click(e As BANanoEvent)";
 //BA.debugLineNum = 63;BA.debugLine="vm.IncrementBadge(\"b1\", 1)";
_vm._incrementbadge /*b4j.example.bananovm*/ ("b1",(int) (1));
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmbadge _b1 = null;
b4j.example.vmicon _icon = null;
b4j.example.vmbadge _b2 = null;
b4j.example.vmbutton _b2btn = null;
b4j.example.vmbadge _b3 = null;
b4j.example.vmavatar _av = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modbadges.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.AddRows(4).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (4))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Dim b1 As VMBadge = vm.CreateBadge(\"bb1\", Me).Set";
_b1 = _vm._createbadge /*b4j.example.vmbadge*/ ("bb1",modbadges.getObject())._setcolor /*b4j.example.vmbadge*/ ("green")._setoverlap /*b4j.example.vmbadge*/ (anywheresoftware.b4a.keywords.Common.True)._setcontent /*b4j.example.vmbadge*/ ("5");
 //BA.debugLineNum = 21;BA.debugLine="Dim icon As VMIcon = vm.CreateIcon(\"icon1\", Me).S";
_icon = _vm._createicon /*b4j.example.vmicon*/ ("icon1",modbadges.getObject())._settext /*b4j.example.vmicon*/ ("mdi-email")._setlarge /*b4j.example.vmicon*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 22;BA.debugLine="b1.AddComponent(icon.ToString)";
_b1._addcomponent /*b4j.example.vmbadge*/ (_icon._tostring /*String*/ ());
 //BA.debugLineNum = 23;BA.debugLine="cont.AddComponent(1, 1, b1.ToString)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_b1._tostring /*String*/ ());
 //BA.debugLineNum = 25;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 26;BA.debugLine="vue.AddCode($\"Dim b1 As VMBadge = vm.CreateBadge(";
_vue._addcode /*String*/ (("Dim b1 As VMBadge = vm.CreateBadge(\"b1\", Me).SetColor(\"green\").SetOverlap(True).SetContent(\"5\")"));
 //BA.debugLineNum = 27;BA.debugLine="vue.AddCode($\"Dim icon As VMIcon = vm.CreateIcon(";
_vue._addcode /*String*/ (("Dim icon As VMIcon = vm.CreateIcon(\"icon1\", Me).SetText(\"mdi-email\").SetLarge(True)"));
 //BA.debugLineNum = 28;BA.debugLine="vue.AddCode($\"b1.AddComponent(icon.ToString)\"$)";
_vue._addcode /*String*/ (("b1.AddComponent(icon.ToString)"));
 //BA.debugLineNum = 29;BA.debugLine="vue.AddCode($\"cont.AddComponent(1, 1, b1.ToString";
_vue._addcode /*String*/ (("cont.AddComponent(1, 1, b1.ToString)"));
 //BA.debugLineNum = 30;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"b1code\", \"Badge\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbadges.getObject(),"b1code","Badge",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 33;BA.debugLine="Dim b2 As VMBadge = vm.CreateBadge(\"b2\", Me).SetB";
_b2 = _vm._createbadge /*b4j.example.vmbadge*/ ("b2",modbadges.getObject())._setbordered /*b4j.example.vmbadge*/ (anywheresoftware.b4a.keywords.Common.True)._setcolor /*b4j.example.vmbadge*/ ("error")._seticon /*b4j.example.vmbadge*/ ("mdi-lock")._setoverlap /*b4j.example.vmbadge*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 34;BA.debugLine="Dim b2btn As VMButton = vm.CreateButton(\"b2btn\",";
_b2btn = _vm._createbutton /*b4j.example.vmbutton*/ ("b2btn",modbadges.getObject())._setlabel /*b4j.example.vmbutton*/ ("Lock Account")._setcolor /*b4j.example.vmbutton*/ ("error")._setdepressed /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addclass /*b4j.example.vmbutton*/ ("white--text");
 //BA.debugLineNum = 35;BA.debugLine="b2.AddComponent(b2btn.tostring)";
_b2._addcomponent /*b4j.example.vmbadge*/ (_b2btn._tostring /*String*/ ());
 //BA.debugLineNum = 36;BA.debugLine="cont.AddComponent(2, 1, b2.ToString)";
_cont._addcomponent /*String*/ ((int) (2),(int) (1),_b2._tostring /*String*/ ());
 //BA.debugLineNum = 38;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 39;BA.debugLine="vue.AddCode($\"Dim b2 As VMBadge = vm.CreateBadge(";
_vue._addcode /*String*/ (("Dim b2 As VMBadge = vm.CreateBadge(\"b2\", Me).SetBordered(True).SetColor(\"error\").SetIcon(\"mdi-lock\").SetOverlap(True)"));
 //BA.debugLineNum = 40;BA.debugLine="vue.AddCode($\"Dim b2btn As VMButton = vm.CreateBu";
_vue._addcode /*String*/ (("Dim b2btn As VMButton = vm.CreateButton(\"b2btn\", Me).SetLabel(\"Lock Account\").SetColor(\"error\").SetDepressed(True).AddClass(\"white--text\")"));
 //BA.debugLineNum = 41;BA.debugLine="vue.AddCode($\"b2.AddComponent(b2btn.ToString)\"$)";
_vue._addcode /*String*/ (("b2.AddComponent(b2btn.ToString)"));
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"cont.AddComponent(2, 1, b2.ToString";
_vue._addcode /*String*/ (("cont.AddComponent(2, 1, b2.ToString)"));
 //BA.debugLineNum = 43;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"b2code\", \"Badge\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbadges.getObject(),"b2code","Badge",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 46;BA.debugLine="Dim b3 As VMBadge = vm.CreateBadge(\"b3\", Me).SetO";
_b3 = _vm._createbadge /*b4j.example.vmbadge*/ ("b3",modbadges.getObject())._setonlineindicator /*b4j.example.vmbadge*/ (anywheresoftware.b4a.keywords.Common.True)._setcolorintensity /*b4j.example.vmbadge*/ (_vm._color_deeppurple /*String*/ ,_vm._intensity_accent4 /*String*/ );
 //BA.debugLineNum = 47;BA.debugLine="Dim av As VMAvatar = vm.CreateAvatar(\"avx\", Me).S";
_av = _vm._createavatar /*b4j.example.vmavatar*/ ("avx",modbadges.getObject())._setimage /*b4j.example.vmavatar*/ ("https://cdn.vuetifyjs.com/images/lists/2.jpg","",(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 48;BA.debugLine="b3.AddComponent(av.ToString)";
_b3._addcomponent /*b4j.example.vmbadge*/ (_av._tostring /*String*/ ());
 //BA.debugLineNum = 49;BA.debugLine="cont.AddComponent(3, 1, b3.ToString)";
_cont._addcomponent /*String*/ ((int) (3),(int) (1),_b3._tostring /*String*/ ());
 //BA.debugLineNum = 51;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"Dim b3 As VMBadge = vm.CreateBadge(";
_vue._addcode /*String*/ (("Dim b3 As VMBadge = vm.CreateBadge(\"b3\", Me).SetOnlineIndicator(True).SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"Dim av As VMAvatar = vm.CreateAvata";
_vue._addcode /*String*/ (("Dim av As VMAvatar = vm.CreateAvatar(\"avx\", Me).SetImage(\"https://cdn.vuetifyjs.com/images/lists/2.jpg\",\"\",Null, Null, Null)"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"b3.AddComponent(av.ToString)\"$)";
_vue._addcode /*String*/ (("b3.AddComponent(av.ToString)"));
 //BA.debugLineNum = 55;BA.debugLine="vue.AddCode($\"cont.AddComponent(3, 1, b3.ToString";
_vue._addcode /*String*/ (("cont.AddComponent(3, 1, b3.ToString)"));
 //BA.debugLineNum = 56;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"b3code\", \"Badge\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbadges.getObject(),"b3code","Badge",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 59;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"badgeCode\"";
_name = "badgeCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Badges\"";
_title = "Badges";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
