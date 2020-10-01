package b4j.example;


import anywheresoftware.b4a.BA;

public class modcarousel extends Object{
public static modcarousel mostCurrent = new modcarousel();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modcarousel", null);
		ba.loadHtSubs(modcarousel.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modcarousel", ba);
		}
	}
    public static Class<?> getObject() {
		return modcarousel.class;
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
public static String  _carcodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub carcodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 67;BA.debugLine="vue.CopyCode2Clipboard(\"carcode\")";
_vue._copycode2clipboard /*String*/ ("carcode");
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _carcodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub carcodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 71;BA.debugLine="vue.DownloadCode(\"carcode\", \"carcode.txt\")";
_vue._downloadcode /*String*/ ("carcode","carcode.txt");
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
anywheresoftware.b4a.objects.collections.List _items = null;
b4j.example.vmcarousel _c1 = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modcarousel.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.AddRows(5).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (5))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 21;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 22;BA.debugLine="items.initialize";
_items.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="items.add(CreateMap(\"src\":\"./assets/squirrel.jpg\"";
_items.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("src"),(Object)("./assets/squirrel.jpg")}).getObject()));
 //BA.debugLineNum = 24;BA.debugLine="items.add(CreateMap(\"src\":\"./assets/sky.jpg\"))";
_items.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("src"),(Object)("./assets/sky.jpg")}).getObject()));
 //BA.debugLineNum = 25;BA.debugLine="items.add(CreateMap(\"src\":\"./assets/bird.jpg\"))";
_items.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("src"),(Object)("./assets/bird.jpg")}).getObject()));
 //BA.debugLineNum = 26;BA.debugLine="items.add(CreateMap(\"src\":\"./assets/planet.jpg\"))";
_items.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("src"),(Object)("./assets/planet.jpg")}).getObject()));
 //BA.debugLineNum = 28;BA.debugLine="vm.setdata(\"images\", items)";
_vm._setdata /*b4j.example.bananovm*/ ("images",(Object)(_items.getObject()));
 //BA.debugLineNum = 30;BA.debugLine="Dim c1 As VMCarousel = vm.CreateCarousel(\"c1\", Me";
_c1 = _vm._createcarousel /*b4j.example.vmcarousel*/ ("c1",modcarousel.getObject())._setheight /*b4j.example.vmcarousel*/ ("400")._setcycle /*b4j.example.vmcarousel*/ (anywheresoftware.b4a.keywords.Common.True)._sethidedelimiterbackground /*b4j.example.vmcarousel*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 31;BA.debugLine="c1.SetShowArrowsOnHover(True)";
_c1._setshowarrowsonhover /*b4j.example.vmcarousel*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 32;BA.debugLine="c1.item.SetVFor(\"(item, i)\", \"images\")";
_c1._item /*b4j.example.vmcarouselitem*/ ._setvfor /*b4j.example.vmcarouselitem*/ ("(item, i)","images");
 //BA.debugLineNum = 33;BA.debugLine="c1.item.Bind(\":key\", \"i\")";
_c1._item /*b4j.example.vmcarouselitem*/ ._bind /*b4j.example.vmcarouselitem*/ (":key","i");
 //BA.debugLineNum = 34;BA.debugLine="c1.item.Bind(\":src\", \"item.src\")";
_c1._item /*b4j.example.vmcarouselitem*/ ._bind /*b4j.example.vmcarouselitem*/ (":src","item.src");
 //BA.debugLineNum = 35;BA.debugLine="c1.item.SetReverseTransition(\"fade-transition\")";
_c1._item /*b4j.example.vmcarouselitem*/ ._setreversetransition /*b4j.example.vmcarouselitem*/ ("fade-transition");
 //BA.debugLineNum = 36;BA.debugLine="c1.item.SetTransition(\"fade-transition\")";
_c1._item /*b4j.example.vmcarouselitem*/ ._settransition /*b4j.example.vmcarouselitem*/ ("fade-transition");
 //BA.debugLineNum = 37;BA.debugLine="cont.AddComponent(1, 1, c1.tostring)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_c1._tostring /*String*/ ());
 //BA.debugLineNum = 40;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 41;BA.debugLine="vue.AddCode($\"' create a list of images\"$)";
_vue._addcode /*String*/ (("' create a list of images"));
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"Dim items As List\"$)";
_vue._addcode /*String*/ (("Dim items As List"));
 //BA.debugLineNum = 43;BA.debugLine="vue.AddCode($\"items.initialize\"$)";
_vue._addcode /*String*/ (("items.initialize"));
 //BA.debugLineNum = 44;BA.debugLine="vue.AddCode($\"items.add(CreateMap(\"src\":\"./assets";
_vue._addcode /*String*/ (("items.add(CreateMap(\"src\":\"./assets/squirrel.jpg\"))"));
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"items.add(CreateMap(\"src\":\"./assets";
_vue._addcode /*String*/ (("items.add(CreateMap(\"src\":\"./assets/sky.jpg\"))"));
 //BA.debugLineNum = 46;BA.debugLine="vue.AddCode($\"items.add(CreateMap(\"src\":\"./assets";
_vue._addcode /*String*/ (("items.add(CreateMap(\"src\":\"./assets/bird.jpg\"))"));
 //BA.debugLineNum = 47;BA.debugLine="vue.AddCode($\"items.add(CreateMap(\"src\":\"./assets";
_vue._addcode /*String*/ (("items.add(CreateMap(\"src\":\"./assets/planet.jpg\"))"));
 //BA.debugLineNum = 48;BA.debugLine="vue.AddCode($\"'save to state\"$)";
_vue._addcode /*String*/ (("'save to state"));
 //BA.debugLineNum = 49;BA.debugLine="vue.AddCode($\"vm.setdata(\"images\", items)\"$)";
_vue._addcode /*String*/ (("vm.setdata(\"images\", items)"));
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"Dim c1 As VMCarousel = vm.CreateCar";
_vue._addcode /*String*/ (("Dim c1 As VMCarousel = vm.CreateCarousel(\"c1\", Me).SetHeight(\"400\").SetCycle(True).SetHideDelimiterBackground(True)"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"c1.SetShowArrowsOnHover(True)\"$)";
_vue._addcode /*String*/ (("c1.SetShowArrowsOnHover(True)"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"c1.item.SetVFor(\"(item, i)\", \"image";
_vue._addcode /*String*/ (("c1.item.SetVFor(\"(item, i)\", \"images\")"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"c1.item.Bind(\":key\", \"i\")\"$)";
_vue._addcode /*String*/ (("c1.item.Bind(\":key\", \"i\")"));
 //BA.debugLineNum = 55;BA.debugLine="vue.AddCode($\"c1.item.Bind(\":src\", \"item.src\")\"$)";
_vue._addcode /*String*/ (("c1.item.Bind(\":src\", \"item.src\")"));
 //BA.debugLineNum = 56;BA.debugLine="vue.AddCode($\"c1.item.SetReverseTransition(\"fade-";
_vue._addcode /*String*/ (("c1.item.SetReverseTransition(\"fade-transition\")"));
 //BA.debugLineNum = 57;BA.debugLine="vue.AddCode($\"c1.item.SetTransition(\"fade-transit";
_vue._addcode /*String*/ (("c1.item.SetTransition(\"fade-transition\")"));
 //BA.debugLineNum = 58;BA.debugLine="vue.AddCode($\"cont.AddComponent(1, 1, c1.tostring";
_vue._addcode /*String*/ (("cont.AddComponent(1, 1, c1.tostring)"));
 //BA.debugLineNum = 59;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"carcode\", \"Carouse";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modcarousel.getObject(),"carcode","Carousel",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 62;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"carouselCode\"";
_name = "carouselCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Carousel\"";
_title = "Carousel";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
