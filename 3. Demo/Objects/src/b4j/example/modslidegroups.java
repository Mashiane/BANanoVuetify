package b4j.example;


import anywheresoftware.b4a.BA;

public class modslidegroups extends Object{
public static modslidegroups mostCurrent = new modslidegroups();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modslidegroups", null);
		ba.loadHtSubs(modslidegroups.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modslidegroups", ba);
		}
	}
    public static Class<?> getObject() {
		return modslidegroups.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
public static b4j.example.bananovue _vue = null;
public static com.ab.banano.BANano _banano = null;
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
b4j.example.vmsheet _sheet = null;
b4j.example.vmslidegroup _sg = null;
b4j.example.vmslideitem _si = null;
b4j.example.vmelement _btn = null;
b4j.example.vmsheet _sheet1 = null;
b4j.example.vmslidegroup _sg1 = null;
b4j.example.vmslideitem _si1 = null;
b4j.example.vmcard _vcard = null;
b4j.example.vmscaletransition _st = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modslidegroups.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.addrows(5).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (5))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Dim sheet As VMSheet = vm.CreateSheet(\"\", Me).Add";
_sheet = _vm._createsheet /*b4j.example.vmsheet*/ ("",modslidegroups.getObject())._addclass /*b4j.example.vmsheet*/ ("mx-auto")._setmaxwidth /*b4j.example.vmsheet*/ ("700");
 //BA.debugLineNum = 21;BA.debugLine="Dim sg As VMSlideGroup = vm.CreateSlideGroup(\"sli";
_sg = _vm._createslidegroup /*b4j.example.vmslidegroup*/ ("slidegroup",modslidegroups.getObject())._setmultiple /*b4j.example.vmslidegroup*/ ((Object)(anywheresoftware.b4a.keywords.Common.True))._setshowarrows /*b4j.example.vmslidegroup*/ ((Object)(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 22;BA.debugLine="Dim si As VMSlideItem = vm.CreateSlideItem(\"\", Me";
_si = _vm._createslideitem /*b4j.example.vmslideitem*/ ("",modslidegroups.getObject())._setvfor /*b4j.example.vmslideitem*/ ("n","25")._setattrsingle /*b4j.example.vmslideitem*/ (":key","n")._setactivetoggle /*b4j.example.vmslideitem*/ ();
 //BA.debugLineNum = 24;BA.debugLine="Dim btn  As VMElement = vm.VBtn(\"\").AddClass(\"mx-";
_btn = _vm._vbtn /*b4j.example.vmelement*/ ("")._addclass /*b4j.example.vmelement*/ ("mx-2")._setattrsingle /*b4j.example.vmelement*/ (":input-value","active");
 //BA.debugLineNum = 25;BA.debugLine="btn.SetActiveClass(\"purple white--text\").SetAttrS";
_btn._setactiveclass /*b4j.example.vmelement*/ ("purple white--text")._setattrsingle /*b4j.example.vmelement*/ ("depressed",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True))._setattrsingle /*b4j.example.vmelement*/ ("rounded",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True));
 //BA.debugLineNum = 26;BA.debugLine="btn.SetAttrSingle(\"@click\", \"toggle\").SetText(\"{{";
_btn._setattrsingle /*b4j.example.vmelement*/ ("@click","toggle")._settext /*b4j.example.vmelement*/ ("{{ n }}");
 //BA.debugLineNum = 28;BA.debugLine="si.AddComponent(btn.ToString)";
_si._addcomponent /*b4j.example.vmslideitem*/ (_btn._tostring /*String*/ ());
 //BA.debugLineNum = 29;BA.debugLine="sg.AddComponent(si.ToString)";
_sg._addcomponent /*b4j.example.vmslidegroup*/ (_si._tostring /*String*/ ());
 //BA.debugLineNum = 30;BA.debugLine="sheet.AddComponent(sg.tostring)";
_sheet._addcomponent /*b4j.example.vmsheet*/ (_sg._tostring /*String*/ ());
 //BA.debugLineNum = 31;BA.debugLine="sheet.AddToContainer(cont, 1, 1)";
_sheet._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 34;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 35;BA.debugLine="vue.AddCode($\"Dim sheet As VMSheet = vm.CreateShee";
_vue._addcode /*String*/ (("Dim sheet As VMSheet = vm.CreateSheet(\"\", Me).AddClass(\"mx-auto\").SetMaxWidth(\"700\")"));
 //BA.debugLineNum = 36;BA.debugLine="vue.AddCode($\"Dim sg As VMSlideGroup = vm.CreateSl";
_vue._addcode /*String*/ (("Dim sg As VMSlideGroup = vm.CreateSlideGroup(\"slidegroup\", Me).SetMultiple(True).SetShowArrows(True)"));
 //BA.debugLineNum = 37;BA.debugLine="vue.AddCode($\"Dim si As VMSlideItem = vm.CreateSli";
_vue._addcode /*String*/ (("Dim si As VMSlideItem = vm.CreateSlideItem(\"\", Me).SetVFor(\"n\", \"25\").SetAttrSingle(\":key\", \"n\").SetActiveToggle"));
 //BA.debugLineNum = 38;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 39;BA.debugLine="vue.AddCode($\"Dim btn  As VMElement = vm.VBtn(\"\").";
_vue._addcode /*String*/ (("Dim btn  As VMElement = vm.VBtn(\"\").AddClass(\"mx-2\").SetAttrSingle(\":input-value\", \"active\")"));
 //BA.debugLineNum = 40;BA.debugLine="vue.AddCode($\"btn.SetActiveClass(\"purple white--te";
_vue._addcode /*String*/ (("btn.SetActiveClass(\"purple white--text\").SetAttrSIngle(\"depressed\", True).SetAttrSingle(\"rounded\", True)"));
 //BA.debugLineNum = 41;BA.debugLine="vue.AddCode($\"btn.SetAttrSingle(\"@click\", \"toggle\"";
_vue._addcode /*String*/ (("btn.SetAttrSingle(\"@click\", \"toggle\").SetText(\"{{ n }}\")"));
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 43;BA.debugLine="vue.AddCode($\"si.AddComponent(btn.ToString)\"$)";
_vue._addcode /*String*/ (("si.AddComponent(btn.ToString)"));
 //BA.debugLineNum = 44;BA.debugLine="vue.AddCode($\"sg.AddComponent(si.ToString)\"$)";
_vue._addcode /*String*/ (("sg.AddComponent(si.ToString)"));
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"sheet.AddComponent(sg.tostring)\"$)";
_vue._addcode /*String*/ (("sheet.AddComponent(sg.tostring)"));
 //BA.debugLineNum = 46;BA.debugLine="vue.AddCode($\"sheet.AddToContainer(cont, 1, 1)\"$)";
_vue._addcode /*String*/ (("sheet.AddToContainer(cont, 1, 1)"));
 //BA.debugLineNum = 47;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 48;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"slideg1\", \"Slide Gr";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modslidegroups.getObject(),"slideg1","Slide Group",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 51;BA.debugLine="Dim sheet1 As VMSheet = vm.CreateSheet(\"\", Me).Se";
_sheet1 = _vm._createsheet /*b4j.example.vmsheet*/ ("",modslidegroups.getObject())._setelevation /*b4j.example.vmsheet*/ (BA.NumberToString(8))._addclass /*b4j.example.vmsheet*/ ("mx-auto")._setmaxwidth /*b4j.example.vmsheet*/ ("800");
 //BA.debugLineNum = 52;BA.debugLine="Dim sg1 As VMSlideGroup = vm.CreateSlideGroup(\"sl";
_sg1 = _vm._createslidegroup /*b4j.example.vmslidegroup*/ ("slidegroup1",modslidegroups.getObject())._setcenteractive /*b4j.example.vmslidegroup*/ ((Object)(anywheresoftware.b4a.keywords.Common.True))._setshowarrows /*b4j.example.vmslidegroup*/ ((Object)(anywheresoftware.b4a.keywords.Common.True))._setvmodel /*b4j.example.vmslidegroup*/ ("modelx")._setdata /*b4j.example.vmslidegroup*/ ("modelx",anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 53;BA.debugLine="sg1.AddClass(\"pa-4\")";
_sg1._addclass /*b4j.example.vmslidegroup*/ ("pa-4");
 //BA.debugLineNum = 54;BA.debugLine="Dim si1 As VMSlideItem = vm.CreateSlideItem(\"\", M";
_si1 = _vm._createslideitem /*b4j.example.vmslideitem*/ ("",modslidegroups.getObject())._setvfor /*b4j.example.vmslideitem*/ ("n","15")._setattrsingle /*b4j.example.vmslideitem*/ (":key","n")._setactivetoggle /*b4j.example.vmslideitem*/ ();
 //BA.debugLineNum = 56;BA.debugLine="Dim vcard As VMCard = vm.CreateCard(\"\", Me)";
_vcard = _vm._createcard /*b4j.example.vmcard*/ ("",modslidegroups.getObject());
 //BA.debugLineNum = 57;BA.debugLine="vcard.SetAttrSingle(\":color\", \"active ? 'primary'";
_vcard._setattrsingle /*b4j.example.vmcard*/ (":color","active ? 'primary' : 'grey lighten-1'");
 //BA.debugLineNum = 58;BA.debugLine="vcard.AddClass(\"ma-4\").SetHeight(200).SetWidth(10";
_vcard._addclass /*b4j.example.vmcard*/ ("ma-4")._setheight /*b4j.example.vmcard*/ (BA.NumberToString(200))._setwidth /*b4j.example.vmcard*/ (BA.NumberToString(100))._setattrsingle /*b4j.example.vmcard*/ ("@click","toggle");
 //BA.debugLineNum = 59;BA.debugLine="vcard.Container.AddRows(1).AddColumns12";
_vcard._container /*b4j.example.vmcontainer*/ ._addrows /*b4j.example.vmcontainer*/ ((int) (1))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 60;BA.debugLine="vcard.Container.SetClassRC(1,0,\"fill-height\")";
_vcard._container /*b4j.example.vmcontainer*/ ._setclassrc /*b4j.example.vmcontainer*/ ((int) (1),(int) (0),"fill-height");
 //BA.debugLineNum = 61;BA.debugLine="vcard.Container.SetAlignRC(1,0, \"center\")";
_vcard._container /*b4j.example.vmcontainer*/ ._setalignrc /*b4j.example.vmcontainer*/ ((int) (1),(int) (0),"center");
 //BA.debugLineNum = 62;BA.debugLine="vcard.Container.SetJustifyRC(1,0, \"center\")";
_vcard._container /*b4j.example.vmcontainer*/ ._setjustifyrc /*b4j.example.vmcontainer*/ ((int) (1),(int) (0),"center");
 //BA.debugLineNum = 64;BA.debugLine="Dim st As VMScaleTransition";
_st = new b4j.example.vmscaletransition();
 //BA.debugLineNum = 65;BA.debugLine="st.Initialize(vue, \"\", Me)";
_st._initialize /*b4j.example.vmscaletransition*/ (ba,_vue,"",modslidegroups.getObject());
 //BA.debugLineNum = 66;BA.debugLine="st.AddElement(\"\", \"v-icon\", \"mdi-close-circle-out";
_st._addelement /*b4j.example.vmscaletransition*/ ("","v-icon","mdi-close-circle-outline",anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("v-if"),(Object)("active"),(Object)("color"),(Object)("white"),(Object)("size"),(Object)(48)}),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 67;BA.debugLine="vcard.Container.AddComponent(1,1, st.ToString)";
_vcard._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_st._tostring /*String*/ ());
 //BA.debugLineNum = 69;BA.debugLine="si1.AddComponent(vcard.ToString)";
_si1._addcomponent /*b4j.example.vmslideitem*/ (_vcard._tostring /*String*/ ());
 //BA.debugLineNum = 70;BA.debugLine="sg1.AddComponent(si1.ToString)";
_sg1._addcomponent /*b4j.example.vmslidegroup*/ (_si1._tostring /*String*/ ());
 //BA.debugLineNum = 71;BA.debugLine="sheet1.AddComponent(sg1.tostring)";
_sheet1._addcomponent /*b4j.example.vmsheet*/ (_sg1._tostring /*String*/ ());
 //BA.debugLineNum = 72;BA.debugLine="sheet1.AddToContainer(cont, 3, 1)";
_sheet1._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 75;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 76;BA.debugLine="vue.AddCode($\"Dim sheet1 As VMSheet = vm.CreateShe";
_vue._addcode /*String*/ (("Dim sheet1 As VMSheet = vm.CreateSheet(\"\", Me).SetElevation(8).AddClass(\"mx-auto\").SetMaxWidth(\"800\")"));
 //BA.debugLineNum = 77;BA.debugLine="vue.AddCode($\"Dim sg1 As VMSlideGroup = vm.CreateS";
_vue._addcode /*String*/ (("Dim sg1 As VMSlideGroup = vm.CreateSlideGroup(\"slidegroup1\", Me).SetCenterActive(True).SetShowArrows(True).SetVModel(\"modelx\").SetData(\"modelx\", Null)"));
 //BA.debugLineNum = 78;BA.debugLine="vue.AddCode($\"sg1.AddClass(\"pa-4\")\"$)";
_vue._addcode /*String*/ (("sg1.AddClass(\"pa-4\")"));
 //BA.debugLineNum = 79;BA.debugLine="vue.AddCode($\"Dim si1 As VMSlideItem = vm.CreateSl";
_vue._addcode /*String*/ (("Dim si1 As VMSlideItem = vm.CreateSlideItem(\"\", Me).SetVFor(\"n\", \"15\").SetAttrSingle(\":key\", \"n\").SetActiveToggle"));
 //BA.debugLineNum = 80;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 81;BA.debugLine="vue.AddCode($\"Dim vcard As VMCard = vm.CreateCard(";
_vue._addcode /*String*/ (("Dim vcard As VMCard = vm.CreateCard(\"\", Me)"));
 //BA.debugLineNum = 82;BA.debugLine="vue.AddCode($\"vcard.SetAttrSingle(\":color\", \"activ";
_vue._addcode /*String*/ (("vcard.SetAttrSingle(\":color\", \"active ? 'primary' : 'grey lighten-1'\")"));
 //BA.debugLineNum = 83;BA.debugLine="vue.AddCode($\"vcard.AddClass(\"ma-4\").SetHeight(200";
_vue._addcode /*String*/ (("vcard.AddClass(\"ma-4\").SetHeight(200).SetWidth(100).SetAttrSingle(\"@click\", \"toggle\")"));
 //BA.debugLineNum = 84;BA.debugLine="vue.AddCode($\"vcard.Container.AddRows(1).AddColumn";
_vue._addcode /*String*/ (("vcard.Container.AddRows(1).AddColumns12"));
 //BA.debugLineNum = 85;BA.debugLine="vue.AddCode($\"vcard.Container.SetClassRC(1,0,\"fill";
_vue._addcode /*String*/ (("vcard.Container.SetClassRC(1,0,\"fill-height\")"));
 //BA.debugLineNum = 86;BA.debugLine="vue.AddCode($\"vcard.Container.SetAlignRC(1,0, \"cen";
_vue._addcode /*String*/ (("vcard.Container.SetAlignRC(1,0, \"center\")"));
 //BA.debugLineNum = 87;BA.debugLine="vue.AddCode($\"vcard.Container.SetJustifyRC(1,0, \"c";
_vue._addcode /*String*/ (("vcard.Container.SetJustifyRC(1,0, \"center\")"));
 //BA.debugLineNum = 88;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 89;BA.debugLine="vue.AddCode($\"Dim st As VMScaleTransition\"$)";
_vue._addcode /*String*/ (("Dim st As VMScaleTransition"));
 //BA.debugLineNum = 90;BA.debugLine="vue.AddCode($\"st.Initialize(vue, \"\", Me)\"$)";
_vue._addcode /*String*/ (("st.Initialize(vue, \"\", Me)"));
 //BA.debugLineNum = 91;BA.debugLine="vue.AddCode($\"st.AddElement(\"\", \"v-icon\", \"mdi-clo";
_vue._addcode /*String*/ (("st.AddElement(\"\", \"v-icon\", \"mdi-close-circle-outline\", CreateMap(\"v-if\":\"active\",\"color\":\"white\",\"size\":48), Null, Null)"));
 //BA.debugLineNum = 92;BA.debugLine="vue.AddCode($\"vcard.Container.AddComponent(1,1, st";
_vue._addcode /*String*/ (("vcard.Container.AddComponent(1,1, st.ToString)"));
 //BA.debugLineNum = 93;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 94;BA.debugLine="vue.AddCode($\"si1.AddComponent(vcard.ToString)\"$)";
_vue._addcode /*String*/ (("si1.AddComponent(vcard.ToString)"));
 //BA.debugLineNum = 95;BA.debugLine="vue.AddCode($\"sg1.AddComponent(si1.ToString)\"$)";
_vue._addcode /*String*/ (("sg1.AddComponent(si1.ToString)"));
 //BA.debugLineNum = 96;BA.debugLine="vue.AddCode($\"sheet1.AddComponent(sg1.tostring)\"$)";
_vue._addcode /*String*/ (("sheet1.AddComponent(sg1.tostring)"));
 //BA.debugLineNum = 97;BA.debugLine="vue.AddCode($\"sheet1.AddToContainer(cont, 3, 1)\"$)";
_vue._addcode /*String*/ (("sheet1.AddToContainer(cont, 3, 1)"));
 //BA.debugLineNum = 98;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 99;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"slideg2\", \"Slide Gr";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modslidegroups.getObject(),"slideg2","Slide Group Card",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 102;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 103;BA.debugLine="vue.AddCode($\"Sub slidegroup1_change(value As List";
_vue._addcode /*String*/ (("Sub slidegroup1_change(value As List)"));
 //BA.debugLineNum = 104;BA.debugLine="vue.AddCode($\"vm.ShowSnackBarSuccess(BANano.ToJson";
_vue._addcode /*String*/ (("vm.ShowSnackBarSuccess(BANano.ToJson(value))"));
 //BA.debugLineNum = 105;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 106;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 107;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 108;BA.debugLine="vue.AddCode($\"Sub slidegroup_change(value As List)";
_vue._addcode /*String*/ (("Sub slidegroup_change(value As List)"));
 //BA.debugLineNum = 109;BA.debugLine="vue.AddCode($\"vm.ShowSnackBarSuccess(BANano.ToJson";
_vue._addcode /*String*/ (("vm.ShowSnackBarSuccess(BANano.ToJson(value))"));
 //BA.debugLineNum = 110;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 111;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"slideg2eve\", \"Slide";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modslidegroups.getObject(),"slideg2eve","Slide Group Change Event",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 114;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"slidegroupsCode\"";
_name = "slidegroupsCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Slide Groups\"";
_title = "Slide Groups";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _slideg1copy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub slideg1copy_click(e As BANanoEvent)";
 //BA.debugLineNum = 140;BA.debugLine="vue.CopyCode2Clipboard(\"slideg1\")";
_vue._copycode2clipboard /*String*/ ("slideg1");
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public static String  _slideg1download_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub slideg1download_click(e As BANanoEvent)";
 //BA.debugLineNum = 144;BA.debugLine="vue.DownloadCode(\"slideg1\", \"slideg1.txt\")";
_vue._downloadcode /*String*/ ("slideg1","slideg1.txt");
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public static String  _slideg2copy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub slideg2copy_click(e As BANanoEvent)";
 //BA.debugLineNum = 130;BA.debugLine="vue.CopyCode2Clipboard(\"slideg2\")";
_vue._copycode2clipboard /*String*/ ("slideg2");
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public static String  _slideg2download_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub slideg2download_click(e As BANanoEvent)";
 //BA.debugLineNum = 134;BA.debugLine="vue.DownloadCode(\"slideg2\", \"slideg2.txt\")";
_vue._downloadcode /*String*/ ("slideg2","slideg2.txt");
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public static String  _slideg2evecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub slideg2evecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 119;BA.debugLine="vue.CopyCode2Clipboard(\"slideg2eve\")";
_vue._copycode2clipboard /*String*/ ("slideg2eve");
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public static String  _slideg2evedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub slideg2evedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 123;BA.debugLine="vue.DownloadCode(\"slideg2eve\", \"slideg2eve.txt\")";
_vue._downloadcode /*String*/ ("slideg2eve","slideg2eve.txt");
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public static String  _slidegroup_change(anywheresoftware.b4a.objects.collections.List _value) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub slidegroup_change(value As List)";
 //BA.debugLineNum = 155;BA.debugLine="vm.ShowSnackBarSuccess(BANano.ToJson(value))";
_vm._showsnackbarsuccess /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_value.getObject()))));
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public static String  _slidegroup1_change(anywheresoftware.b4a.objects.collections.List _value) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub slidegroup1_change(value As List)";
 //BA.debugLineNum = 150;BA.debugLine="vm.ShowSnackBarSuccess(BANano.ToJson(value))";
_vm._showsnackbarsuccess /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_value.getObject()))));
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
}
