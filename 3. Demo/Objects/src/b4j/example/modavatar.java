package b4j.example;


import anywheresoftware.b4a.BA;

public class modavatar extends Object{
public static modavatar mostCurrent = new modavatar();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modavatar", null);
		ba.loadHtSubs(modavatar.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modavatar", ba);
		}
	}
    public static Class<?> getObject() {
		return modavatar.class;
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
public static String  _av1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub av1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 36;BA.debugLine="vue.CopyCode2Clipboard(\"av1code\")";
_vue._copycode2clipboard /*String*/ ("av1code");
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public static String  _av2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub av2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 40;BA.debugLine="vue.CopyCode2Clipboard(\"av2code\")";
_vue._copycode2clipboard /*String*/ ("av2code");
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public static String  _av3codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub av3codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 44;BA.debugLine="vue.CopyCode2Clipboard(\"av3code\")";
_vue._copycode2clipboard /*String*/ ("av3code");
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public static String  _av4codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub av4codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 48;BA.debugLine="vue.CopyCode2Clipboard(\"av4code\")";
_vue._copycode2clipboard /*String*/ ("av4code");
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
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
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modavatar.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.AddRows(4).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (4))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateAvatar(\"av1\", Me).SetSize(\"36\").SetColor";
_vm._createavatar /*b4j.example.vmavatar*/ ("av1",modavatar.getObject())._setsize /*b4j.example.vmavatar*/ ("36")._setcolor /*b4j.example.vmavatar*/ ("indigo")._setlabeltheme /*b4j.example.vmavatar*/ ("white-text-only")._settext /*b4j.example.vmavatar*/ ("36",(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"av1code\", \"Avatar\"";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modavatar.getObject(),"av1code","Avatar",("vm.CreateAvatar(\"av1\", Me).SetSize(\"36\").SetColor(\"indigo\").SetLabelTheme(\"white-text-only\").SetText(\"36\", Null, Null, Null).AddToContainer(cont, 1, 1)"))._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.CreateAvatar(\"av2\", Me).SetTile(True).SetColor";
_vm._createavatar /*b4j.example.vmavatar*/ ("av2",modavatar.getObject())._settile /*b4j.example.vmavatar*/ (anywheresoftware.b4a.keywords.Common.True)._setcolor /*b4j.example.vmavatar*/ ("blue")._seticon /*b4j.example.vmavatar*/ ("mdi-alarm","",(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"av2code\", \"Avatar\"";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modavatar.getObject(),"av2code","Avatar",("vm.CreateAvatar(\"av2\", Me).SetTile(True).SetColor(\"blue\").SetIcon(\"mdi-alarm\",\"\",Null, Null, Null).AddToContainer(cont, 1, 1)"))._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 26;BA.debugLine="vm.CreateAvatar(\"av3\", Me).SetImage(\"./assets/spo";
_vm._createavatar /*b4j.example.vmavatar*/ ("av3",modavatar.getObject())._setimage /*b4j.example.vmavatar*/ ("./assets/sponge.png","Sponge",(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="pgIndex.CreateVBCode(vue, Me,\"av3code\", \"Avatar\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modavatar.getObject(),"av3code","Avatar",("vm.CreateAvatar(\"av3\", Me).SetImage(\"./assets/sponge.png\", \"Sponge\", Null, Null, Null).AddToContainer(cont, 1, 1)"))._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 29;BA.debugLine="vm.CreateAvatar(\"av4\", Me).SetColor(\"red\").SetIco";
_vm._createavatar /*b4j.example.vmavatar*/ ("av4",modavatar.getObject())._setcolor /*b4j.example.vmavatar*/ ("red")._seticon /*b4j.example.vmavatar*/ ("mdi-account-circle","",(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"av4code\", \"Avatar\"";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modavatar.getObject(),"av4code","Avatar",("vm.CreateAvatar(\"av4\", Me).SetColor(\"red\").SetIcon(\"mdi-account-circle\", \"\", Null, Null, Null).AddToContainer(cont, 3, 1)"))._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 32;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"avatarCode\"";
_name = "avatarCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Avatars\"";
_title = "Avatars";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
