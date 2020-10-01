package b4j.example;


import anywheresoftware.b4a.BA;

public class moditemgroups extends Object{
public static moditemgroups mostCurrent = new moditemgroups();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.moditemgroups", null);
		ba.loadHtSubs(moditemgroups.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.moditemgroups", ba);
		}
	}
    public static Class<?> getObject() {
		return moditemgroups.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
public static b4j.example.bananovue _vue = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
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
public static b4j.example.modtoolbar _modtoolbar = null;
public static b4j.example.modtoolkit _modtoolkit = null;
public static b4j.example.modtreeview _modtreeview = null;
public static b4j.example.modwindow _modwindow = null;
public static b4j.example.pgbrs _pgbrs = null;
public static b4j.example.bananoshared _bananoshared = null;
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmitemgroup _ig = null;
b4j.example.vmitem _item = null;
b4j.example.vmcard _card = null;
b4j.example.vmscrollytransition _syt = null;
String _eachitem = "";
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,moditemgroups.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.addrows(5).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (5))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Dim ig As VMItemGroup = vm.CreateItemGroup(\"ig\",";
_ig = _vm._createitemgroup /*b4j.example.vmitemgroup*/ ("ig",moditemgroups.getObject());
 //BA.debugLineNum = 21;BA.debugLine="ig.Container.AddRows(1).AddColumns(3, 12, 4, 4, 4";
_ig._container /*b4j.example.vmcontainer*/ ._addrows /*b4j.example.vmcontainer*/ ((int) (1))._addcolumns /*b4j.example.vmcontainer*/ ((int) (3),(int) (12),(int) (4),(int) (4),(int) (4));
 //BA.debugLineNum = 23;BA.debugLine="Dim item As VMItem = vm.CreateItem(\"\", Me).SetAct";
_item = _vm._createitem /*b4j.example.vmitem*/ ("",moditemgroups.getObject())._setactivetoggle /*b4j.example.vmitem*/ ();
 //BA.debugLineNum = 25;BA.debugLine="Dim card As VMCard = vm.CreateCard(\"itemcard\", Me";
_card = _vm._createcard /*b4j.example.vmcard*/ ("itemcard",moditemgroups.getObject());
 //BA.debugLineNum = 26;BA.debugLine="card.SetAttrSingle(\":color\", \"active ? 'primary'";
_card._setattrsingle /*b4j.example.vmcard*/ (":color","active ? 'primary' : ''");
 //BA.debugLineNum = 27;BA.debugLine="card.AddClass(\"d-flex align-center\")";
_card._addclass /*b4j.example.vmcard*/ ("d-flex align-center");
 //BA.debugLineNum = 28;BA.debugLine="card.SetDark(True)";
_card._setdark /*b4j.example.vmcard*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 29;BA.debugLine="card.SetHeight(200)";
_card._setheight /*b4j.example.vmcard*/ (BA.NumberToString(200));
 //BA.debugLineNum = 30;BA.debugLine="card.SetAttrSingle(\"@click\", \"toggle\")";
_card._setattrsingle /*b4j.example.vmcard*/ ("@click","toggle");
 //BA.debugLineNum = 32;BA.debugLine="Dim syt As VMScrollYTransition";
_syt = new b4j.example.vmscrollytransition();
 //BA.debugLineNum = 33;BA.debugLine="syt.Initialize(vue, \"\", Me)";
_syt._initialize /*b4j.example.vmscrollytransition*/ (ba,_vue,"",moditemgroups.getObject());
 //BA.debugLineNum = 34;BA.debugLine="syt.AddElement(\"\", \"div\", \"Active\", CreateMap(\"v-";
_syt._addelement /*b4j.example.vmscrollytransition*/ ("","div","Active",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("v-if"),(Object)("active")}),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("display-3 flex-grow-1 text-center")}));
 //BA.debugLineNum = 35;BA.debugLine="card.SetTextAfter(syt.tostring)";
_card._settextafter /*b4j.example.vmcard*/ (_syt._tostring /*String*/ ());
 //BA.debugLineNum = 38;BA.debugLine="item.AddComponent(card.tostring)";
_item._addcomponent /*b4j.example.vmitem*/ (_card._tostring /*String*/ ());
 //BA.debugLineNum = 40;BA.debugLine="Dim eachItem As String = item.tostring";
_eachitem = _item._tostring /*String*/ ();
 //BA.debugLineNum = 41;BA.debugLine="ig.Container.AddComponent(1,1, eachItem)";
_ig._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_eachitem);
 //BA.debugLineNum = 42;BA.debugLine="ig.Container.AddComponent(1,2, eachItem)";
_ig._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (2),_eachitem);
 //BA.debugLineNum = 43;BA.debugLine="ig.Container.AddComponent(1,3, eachItem)";
_ig._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (3),_eachitem);
 //BA.debugLineNum = 45;BA.debugLine="ig.AddToContainer(cont, 1, 1)";
_ig._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 48;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 49;BA.debugLine="vue.AddCode($\"Dim ig As VMItemGroup = vm.CreateIte";
_vue._addcode /*String*/ (("Dim ig As VMItemGroup = vm.CreateItemGroup(\"ig\", Me)"));
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"ig.Container.AddRows(1).AddColumns(3";
_vue._addcode /*String*/ (("ig.Container.AddRows(1).AddColumns(3, 12, 4, 4, 4)"));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"Dim item As VMItem = vm.CreateItem(\"";
_vue._addcode /*String*/ (("Dim item As VMItem = vm.CreateItem(\"\", Me).SetActiveToggle"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"Dim card As VMCard = vm.CreateCard(\"";
_vue._addcode /*String*/ (("Dim card As VMCard = vm.CreateCard(\"itemcard\", Me)"));
 //BA.debugLineNum = 55;BA.debugLine="vue.AddCode($\"card.SetAttrSingle(\":color\", \"active";
_vue._addcode /*String*/ (("card.SetAttrSingle(\":color\", \"active ? 'primary' : ''\")"));
 //BA.debugLineNum = 56;BA.debugLine="vue.AddCode($\"card.AddClass(\"d-flex align-center\")";
_vue._addcode /*String*/ (("card.AddClass(\"d-flex align-center\")"));
 //BA.debugLineNum = 57;BA.debugLine="vue.AddCode($\"card.SetDark(True)\"$)";
_vue._addcode /*String*/ (("card.SetDark(True)"));
 //BA.debugLineNum = 58;BA.debugLine="vue.AddCode($\"card.SetHeight(200)\"$)";
_vue._addcode /*String*/ (("card.SetHeight(200)"));
 //BA.debugLineNum = 59;BA.debugLine="vue.AddCode($\"card.SetAttrSingle(\"@click\", \"toggle";
_vue._addcode /*String*/ (("card.SetAttrSingle(\"@click\", \"toggle\")"));
 //BA.debugLineNum = 60;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 61;BA.debugLine="vue.AddCode($\"Dim syt As VMScrollYTransition\"$)";
_vue._addcode /*String*/ (("Dim syt As VMScrollYTransition"));
 //BA.debugLineNum = 62;BA.debugLine="vue.AddCode($\"syt.Initialize(vue, \"\", Me)\"$)";
_vue._addcode /*String*/ (("syt.Initialize(vue, \"\", Me)"));
 //BA.debugLineNum = 63;BA.debugLine="vue.AddCode($\"syt.AddElement(\"\", \"div\", \"Active\",";
_vue._addcode /*String*/ (("syt.AddElement(\"\", \"div\", \"Active\", CreateMap(\"v-if\" :\"active\"), Null, Array(\"display-3 flex-grow-1 text-center\"))"));
 //BA.debugLineNum = 64;BA.debugLine="vue.AddCode($\"card.SetTextAfter(syt.tostring)\"$)";
_vue._addcode /*String*/ (("card.SetTextAfter(syt.tostring)"));
 //BA.debugLineNum = 65;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 66;BA.debugLine="vue.AddCode($\"'add the card to the item\"$)";
_vue._addcode /*String*/ (("'add the card to the item"));
 //BA.debugLineNum = 67;BA.debugLine="vue.AddCode($\"item.AddComponent(card.tostring)\"$)";
_vue._addcode /*String*/ (("item.AddComponent(card.tostring)"));
 //BA.debugLineNum = 68;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 69;BA.debugLine="vue.AddCode($\"Dim eachItem As String = item.tostri";
_vue._addcode /*String*/ (("Dim eachItem As String = item.tostring"));
 //BA.debugLineNum = 70;BA.debugLine="vue.AddCode($\"ig.Container.AddComponent(1,1, eachI";
_vue._addcode /*String*/ (("ig.Container.AddComponent(1,1, eachItem)"));
 //BA.debugLineNum = 71;BA.debugLine="vue.AddCode($\"ig.Container.AddComponent(1,2, eachI";
_vue._addcode /*String*/ (("ig.Container.AddComponent(1,2, eachItem)"));
 //BA.debugLineNum = 72;BA.debugLine="vue.AddCode($\"ig.Container.AddComponent(1,3, eachI";
_vue._addcode /*String*/ (("ig.Container.AddComponent(1,3, eachItem)"));
 //BA.debugLineNum = 73;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 74;BA.debugLine="vue.AddCode($\"ig.AddToContainer(cont, 1, 1)\"$)";
_vue._addcode /*String*/ (("ig.AddToContainer(cont, 1, 1)"));
 //BA.debugLineNum = 75;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"igcore\", \"Item Grou";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,moditemgroups.getObject(),"igcore","Item Group",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 78;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="vue.AddCode($\"Sub ig_change(values As List)\"$)";
_vue._addcode /*String*/ (("Sub ig_change(values As List)"));
 //BA.debugLineNum = 80;BA.debugLine="vue.AddCode($\"vm.ShowSnackBarSuccess(BANano.tojson";
_vue._addcode /*String*/ (("vm.ShowSnackBarSuccess(BANano.tojson(values))"));
 //BA.debugLineNum = 81;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 82;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"ige\", \"Item Group E";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,moditemgroups.getObject(),"ige","Item Group Event",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 140;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public static String  _ig_change(anywheresoftware.b4a.objects.collections.List _values) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub ig_change(values As List)";
 //BA.debugLineNum = 154;BA.debugLine="vm.ShowSnackBarSuccess(BANano.tojson(values))";
_vm._showsnackbarsuccess /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_values.getObject()))));
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public static String  _igcorecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub igcorecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 158;BA.debugLine="vue.CopyCode2Clipboard(\"igcore\")";
_vue._copycode2clipboard /*String*/ ("igcore");
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public static String  _igcoredownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub igcoredownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 162;BA.debugLine="vue.DownloadCode(\"igcore\", \"igcore.txt\")";
_vue._downloadcode /*String*/ ("igcore","igcore.txt");
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public static String  _igecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub igecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 145;BA.debugLine="vue.CopyCode2Clipboard(\"ige\")";
_vue._copycode2clipboard /*String*/ ("ige");
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public static String  _igedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub igedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 149;BA.debugLine="vue.DownloadCode(\"ige\", \"ige.txt\")";
_vue._downloadcode /*String*/ ("ige","ige.txt");
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"itemgroupsCode\"";
_name = "itemgroupsCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Item Groups\"";
_title = "Item Groups";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
