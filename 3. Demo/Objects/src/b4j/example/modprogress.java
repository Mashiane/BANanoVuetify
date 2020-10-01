package b4j.example;


import anywheresoftware.b4a.BA;

public class modprogress extends Object{
public static modprogress mostCurrent = new modprogress();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modprogress", null);
		ba.loadHtSubs(modprogress.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modprogress", ba);
		}
	}
    public static Class<?> getObject() {
		return modprogress.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
public static b4j.example.bananovue _vue = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.vmprogresscircular _pc5 = null;
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
public static String  _circulate() throws Exception{
String _vpc5 = "";
 //BA.debugLineNum = 366;BA.debugLine="Sub circulate";
 //BA.debugLineNum = 368;BA.debugLine="Dim vpc5 As String = pc5.GetValue";
_vpc5 = _pc5._getvalue /*String*/ ();
 //BA.debugLineNum = 369;BA.debugLine="vpc5 = BANano.parseint(vpc5)";
_vpc5 = BA.NumberToString(_banano.parseInt((Object)(_vpc5)));
 //BA.debugLineNum = 370;BA.debugLine="If vpc5 = \"100\" Then";
if ((_vpc5).equals("100")) { 
 //BA.debugLineNum = 372;BA.debugLine="vpc5 = \"0\"";
_vpc5 = "0";
 }else {
 //BA.debugLineNum = 375;BA.debugLine="vpc5 = BANano.parseint(vpc5) + 10";
_vpc5 = BA.NumberToString(_banano.parseInt((Object)(_vpc5))+10);
 };
 //BA.debugLineNum = 378;BA.debugLine="pc5.SetValue(vpc5)";
_pc5._setvalue /*b4j.example.vmprogresscircular*/ (_vpc5);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmprogresslinear _plprogresslinear1 = null;
b4j.example.vmprogresslinear _plprogresslinear2 = null;
b4j.example.vmprogresslinear _pl3 = null;
b4j.example.vmprogresslinear _pl4 = null;
b4j.example.vmprogresslinear _pl5 = null;
b4j.example.vmprogresslinear _pl6 = null;
b4j.example.vmprogresslinear _pl7 = null;
b4j.example.vmprogresslinear _pl8 = null;
b4j.example.vmprogresscircular _pc1 = null;
b4j.example.vmprogresscircular _pc2 = null;
b4j.example.vmprogresscircular _pc3 = null;
b4j.example.vmprogresscircular _pc4 = null;
 //BA.debugLineNum = 12;BA.debugLine="Sub Code";
 //BA.debugLineNum = 13;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 14;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 16;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modprogress.getObject());
 //BA.debugLineNum = 17;BA.debugLine="cont.AddRows(10).AddColumns2x6";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (10))._addcolumns2x6 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 19;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 21;BA.debugLine="Dim plprogresslinear1 As VMProgressLinear";
_plprogresslinear1 = new b4j.example.vmprogresslinear();
 //BA.debugLineNum = 22;BA.debugLine="plprogresslinear1.Initialize(vue, \"plprogressline";
_plprogresslinear1._initialize /*b4j.example.vmprogresslinear*/ (ba,_vue,"plprogresslinear1",modprogress.getObject());
 //BA.debugLineNum = 23;BA.debugLine="plprogresslinear1.SetValue(\"15\")";
_plprogresslinear1._setvalue /*b4j.example.vmprogresslinear*/ ("15");
 //BA.debugLineNum = 24;BA.debugLine="plprogresslinear1.SetVisible(True)";
_plprogresslinear1._setvisible /*b4j.example.vmprogresslinear*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 25;BA.debugLine="plprogresslinear1.AddToContainer(cont, 1, 1)";
_plprogresslinear1._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 28;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 29;BA.debugLine="vue.AddCode($\"Dim plprogresslinear1 As VMProgress";
_vue._addcode /*String*/ (("Dim plprogresslinear1 As VMProgressLinear"));
 //BA.debugLineNum = 30;BA.debugLine="vue.AddCode($\"plprogresslinear1.Initialize(vue, \"";
_vue._addcode /*String*/ (("plprogresslinear1.Initialize(vue, \"plprogresslinear1\", Me)"));
 //BA.debugLineNum = 31;BA.debugLine="vue.AddCode($\"plprogresslinear1.SetValue(\"15\")\"$)";
_vue._addcode /*String*/ (("plprogresslinear1.SetValue(\"15\")"));
 //BA.debugLineNum = 32;BA.debugLine="vue.AddCode($\"plprogresslinear1.SetVisible(True)\"";
_vue._addcode /*String*/ (("plprogresslinear1.SetVisible(True)"));
 //BA.debugLineNum = 33;BA.debugLine="vue.AddCode($\"cont.AddControl(plprogresslinear1.P";
_vue._addcode /*String*/ (("cont.AddControl(plprogresslinear1.ProgressLinear, plprogresslinear1.tostring, 1, 1, 0, 0, 0, 0, 12, 6, 6, 6)"));
 //BA.debugLineNum = 34;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"prg1code\", \"Progre";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"prg1code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 38;BA.debugLine="Dim plprogresslinear2 As VMProgressLinear";
_plprogresslinear2 = new b4j.example.vmprogresslinear();
 //BA.debugLineNum = 39;BA.debugLine="plprogresslinear2.Initialize(vue, \"plprogressline";
_plprogresslinear2._initialize /*b4j.example.vmprogresslinear*/ (ba,_vue,"plprogresslinear2",modprogress.getObject());
 //BA.debugLineNum = 40;BA.debugLine="plprogresslinear2.SetVModel(\"pl2\")";
_plprogresslinear2._setvmodel /*b4j.example.vmprogresslinear*/ ("pl2");
 //BA.debugLineNum = 41;BA.debugLine="vue.setdata(\"pl2\", \"50\")";
_vue._setdata /*b4j.example.bananovue*/ ("pl2",(Object)("50"));
 //BA.debugLineNum = 42;BA.debugLine="plprogresslinear2.SetVisible(True)";
_plprogresslinear2._setvisible /*b4j.example.vmprogresslinear*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 43;BA.debugLine="plprogresslinear2.SetColor(vm.color_deeppurple)";
_plprogresslinear2._setcolor /*b4j.example.vmprogresslinear*/ (_vm._color_deeppurple /*String*/ );
 //BA.debugLineNum = 44;BA.debugLine="plprogresslinear2.AddToContainer(cont, 1,2)";
_plprogresslinear2._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 47;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 48;BA.debugLine="vue.AddCode($\"'use vmodel to set data\"$)";
_vue._addcode /*String*/ (("'use vmodel to set data"));
 //BA.debugLineNum = 49;BA.debugLine="vue.AddCode($\"Dim plprogresslinear2 As VMProgressL";
_vue._addcode /*String*/ (("Dim plprogresslinear2 As VMProgressLinear"));
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"plprogresslinear2.Initialize(vue, \"p";
_vue._addcode /*String*/ (("plprogresslinear2.Initialize(vue, \"plprogresslinear2\", Me)"));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"plprogresslinear2.SetVModel(\"pl2\")\"$";
_vue._addcode /*String*/ (("plprogresslinear2.SetVModel(\"pl2\")"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"vue.setdata(\"pl2\", \"50\")\"$)";
_vue._addcode /*String*/ (("vue.setdata(\"pl2\", \"50\")"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"plprogresslinear2.SetVisible(True)\"$";
_vue._addcode /*String*/ (("plprogresslinear2.SetVisible(True)"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"plprogresslinear2.SetColor(vm.color_";
_vue._addcode /*String*/ (("plprogresslinear2.SetColor(vm.color_deeppurple)"));
 //BA.debugLineNum = 55;BA.debugLine="vue.AddCode($\"plprogresslinear2.AddToContainer(con";
_vue._addcode /*String*/ (("plprogresslinear2.AddToContainer(cont, 1,2)"));
 //BA.debugLineNum = 56;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"prg2code\", \"Progres";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"prg2code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 60;BA.debugLine="Dim pl3 As VMProgressLinear";
_pl3 = new b4j.example.vmprogresslinear();
 //BA.debugLineNum = 61;BA.debugLine="pl3.Initialize(vue, \"pl3\", Me).SetVisible(True).S";
_pl3._initialize /*b4j.example.vmprogresslinear*/ (ba,_vue,"pl3",modprogress.getObject())._setvisible /*b4j.example.vmprogresslinear*/ (anywheresoftware.b4a.keywords.Common.True)._setindeterminate /*b4j.example.vmprogresslinear*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 62;BA.debugLine="pl3.SetColorIntensity(vm.color_yellow, vm.Intensi";
_pl3._setcolorintensity /*b4j.example.vmprogresslinear*/ (_vm._color_yellow /*String*/ ,_vm._intensity_darken2 /*String*/ );
 //BA.debugLineNum = 63;BA.debugLine="pl3.AddToContainer(cont, 2,1)";
_pl3._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 66;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 67;BA.debugLine="vue.AddCode($\"Dim pl3 As VMProgressLinear\"$)";
_vue._addcode /*String*/ (("Dim pl3 As VMProgressLinear"));
 //BA.debugLineNum = 68;BA.debugLine="vue.AddCode($\"pl3.Initialize(vue, \"pl3\", Me).SetVi";
_vue._addcode /*String*/ (("pl3.Initialize(vue, \"pl3\", Me).SetVisible(True).SetIndeterminate(True)"));
 //BA.debugLineNum = 69;BA.debugLine="vue.AddCode($\"pl3.SetColorIntensity(vm.color_yello";
_vue._addcode /*String*/ (("pl3.SetColorIntensity(vm.color_yellow, vm.Intensity_darken2)"));
 //BA.debugLineNum = 70;BA.debugLine="vue.AddCode($\"pl3.AddToContainer(cont, 2,1)\"$)";
_vue._addcode /*String*/ (("pl3.AddToContainer(cont, 2,1)"));
 //BA.debugLineNum = 71;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 72;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pl3code\", \"Progress";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"pl3code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 75;BA.debugLine="Dim pl4 As VMProgressLinear";
_pl4 = new b4j.example.vmprogresslinear();
 //BA.debugLineNum = 76;BA.debugLine="pl4.Initialize(vue, \"pl4\", Me).SetVisible(True).S";
_pl4._initialize /*b4j.example.vmprogresslinear*/ (ba,_vue,"pl4",modprogress.getObject())._setvisible /*b4j.example.vmprogresslinear*/ (anywheresoftware.b4a.keywords.Common.True)._setvalue /*b4j.example.vmprogresslinear*/ ("10")._setbuffervalue /*b4j.example.vmprogresslinear*/ ("20");
 //BA.debugLineNum = 77;BA.debugLine="pl4.SetColorIntensity(vm.color_yellow, vm.Intensi";
_pl4._setcolorintensity /*b4j.example.vmprogresslinear*/ (_vm._color_yellow /*String*/ ,_vm._intensity_darken2 /*String*/ );
 //BA.debugLineNum = 78;BA.debugLine="pl4.AddToContainer(cont, 2,2)";
_pl4._addtocontainer /*String*/ (_cont,(int) (2),(int) (2));
 //BA.debugLineNum = 81;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 82;BA.debugLine="vue.AddCode($\"Dim pl4 As VMProgressLinear\"$)";
_vue._addcode /*String*/ (("Dim pl4 As VMProgressLinear"));
 //BA.debugLineNum = 83;BA.debugLine="vue.AddCode($\"pl4.Initialize(vue, \"pl4\", Me).SetVi";
_vue._addcode /*String*/ (("pl4.Initialize(vue, \"pl4\", Me).SetVisible(True).SetValue(\"10\").SetBufferValue(\"20\")"));
 //BA.debugLineNum = 84;BA.debugLine="vue.AddCode($\"pl4.SetColorIntensity(vm.color_yello";
_vue._addcode /*String*/ (("pl4.SetColorIntensity(vm.color_yellow, vm.Intensity_darken2)"));
 //BA.debugLineNum = 85;BA.debugLine="vue.AddCode($\"pl4.AddToContainer(cont, 2,2)\"$)";
_vue._addcode /*String*/ (("pl4.AddToContainer(cont, 2,2)"));
 //BA.debugLineNum = 86;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pl4code\", \"Progress";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"pl4code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (2));
 //BA.debugLineNum = 90;BA.debugLine="Dim pl5 As VMProgressLinear";
_pl5 = new b4j.example.vmprogresslinear();
 //BA.debugLineNum = 91;BA.debugLine="pl5.Initialize(vue, \"pl5\", Me).SetVisible(True).S";
_pl5._initialize /*b4j.example.vmprogresslinear*/ (ba,_vue,"pl5",modprogress.getObject())._setvisible /*b4j.example.vmprogresslinear*/ (anywheresoftware.b4a.keywords.Common.True)._setvalue /*b4j.example.vmprogresslinear*/ ("30");
 //BA.debugLineNum = 92;BA.debugLine="pl5.SetBackgroundColorIntensity(vm.color_bluegrey";
_pl5._setbackgroundcolorintensity /*b4j.example.vmprogresslinear*/ (_vm._color_bluegrey /*String*/ ,_vm._intensity_normal /*String*/ );
 //BA.debugLineNum = 93;BA.debugLine="pl5.AddToContainer(cont, 3,1)";
_pl5._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 96;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 97;BA.debugLine="vue.AddCode($\"Dim pl5 As VMProgressLinear\"$)";
_vue._addcode /*String*/ (("Dim pl5 As VMProgressLinear"));
 //BA.debugLineNum = 98;BA.debugLine="vue.AddCode($\"pl5.Initialize(vue, \"pl5\", Me).SetVi";
_vue._addcode /*String*/ (("pl5.Initialize(vue, \"pl5\", Me).SetVisible(True).SetValue(\"30\")"));
 //BA.debugLineNum = 99;BA.debugLine="vue.AddCode($\"pl5.SetBackgroundColorIntensity(vm.c";
_vue._addcode /*String*/ (("pl5.SetBackgroundColorIntensity(vm.color_bluegrey, vm.intensity_normal)"));
 //BA.debugLineNum = 100;BA.debugLine="vue.AddCode($\"pl5.AddToContainer(cont, 3,1)\"$)";
_vue._addcode /*String*/ (("pl5.AddToContainer(cont, 3,1)"));
 //BA.debugLineNum = 101;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 102;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pl5code\", \"Progress";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"pl5code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 107;BA.debugLine="Dim pl6 As VMProgressLinear";
_pl6 = new b4j.example.vmprogresslinear();
 //BA.debugLineNum = 108;BA.debugLine="pl6.Initialize(vue, \"pl6\", Me).SetVisible(True).S";
_pl6._initialize /*b4j.example.vmprogresslinear*/ (ba,_vue,"pl6",modprogress.getObject())._setvisible /*b4j.example.vmprogresslinear*/ (anywheresoftware.b4a.keywords.Common.True)._setvalue /*b4j.example.vmprogresslinear*/ ("20")._setbuffervalue /*b4j.example.vmprogresslinear*/ ("0")._setstream /*b4j.example.vmprogresslinear*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 109;BA.debugLine="pl6.SetColorIntensity(vm.color_yellow, vm.Intensi";
_pl6._setcolorintensity /*b4j.example.vmprogresslinear*/ (_vm._color_yellow /*String*/ ,_vm._intensity_darken2 /*String*/ );
 //BA.debugLineNum = 110;BA.debugLine="pl6.AddToContainer(cont, 3,2)";
_pl6._addtocontainer /*String*/ (_cont,(int) (3),(int) (2));
 //BA.debugLineNum = 113;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 114;BA.debugLine="vue.AddCode($\"Dim pl6 As VMProgressLinear\"$)";
_vue._addcode /*String*/ (("Dim pl6 As VMProgressLinear"));
 //BA.debugLineNum = 115;BA.debugLine="vue.AddCode($\"pl6.Initialize(vue, \"pl6\", Me).SetVi";
_vue._addcode /*String*/ (("pl6.Initialize(vue, \"pl6\", Me).SetVisible(True).SetValue(\"20\").SetBufferValue(\"0\").SetStream(True)"));
 //BA.debugLineNum = 116;BA.debugLine="vue.AddCode($\"pl6.SetColorIntensity(vm.color_yello";
_vue._addcode /*String*/ (("pl6.SetColorIntensity(vm.color_yellow, vm.Intensity_darken2)"));
 //BA.debugLineNum = 117;BA.debugLine="vue.AddCode($\"pl6.AddToContainer(cont, 3,2)\"$)";
_vue._addcode /*String*/ (("pl6.AddToContainer(cont, 3,2)"));
 //BA.debugLineNum = 118;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pl6code\", \"Progress";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"pl6code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (3),(int) (2));
 //BA.debugLineNum = 120;BA.debugLine="Dim pl7 As VMProgressLinear";
_pl7 = new b4j.example.vmprogresslinear();
 //BA.debugLineNum = 121;BA.debugLine="pl7.Initialize(vue, \"pl7\", Me).SetVisible(True).S";
_pl7._initialize /*b4j.example.vmprogresslinear*/ (ba,_vue,"pl7",modprogress.getObject())._setvisible /*b4j.example.vmprogresslinear*/ (anywheresoftware.b4a.keywords.Common.True)._setvalue /*b4j.example.vmprogresslinear*/ ("10")._setheight /*b4j.example.vmprogresslinear*/ ("30")._setstriped /*b4j.example.vmprogresslinear*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 122;BA.debugLine="pl7.AddToContainer(cont, 4,1)";
_pl7._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 125;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 126;BA.debugLine="vue.AddCode($\"Dim pl7 As VMProgressLinear\"$)";
_vue._addcode /*String*/ (("Dim pl7 As VMProgressLinear"));
 //BA.debugLineNum = 127;BA.debugLine="vue.AddCode($\"pl7.Initialize(vue, \"pl7\", Me).SetVi";
_vue._addcode /*String*/ (("pl7.Initialize(vue, \"pl7\", Me).SetVisible(True).SetValue(\"10\").SetHeight(\"30\").SetStriped(True)"));
 //BA.debugLineNum = 128;BA.debugLine="vue.AddCode($\"pl7.AddToContainer(cont, 4,1)\"$)";
_vue._addcode /*String*/ (("pl7.AddToContainer(cont, 4,1)"));
 //BA.debugLineNum = 129;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pl7code\", \"Progress";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"pl7code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 132;BA.debugLine="Dim pl8 As VMProgressLinear";
_pl8 = new b4j.example.vmprogresslinear();
 //BA.debugLineNum = 133;BA.debugLine="pl8.Initialize(vue, \"pl8\", Me).SetVisible(True).S";
_pl8._initialize /*b4j.example.vmprogresslinear*/ (ba,_vue,"pl8",modprogress.getObject())._setvisible /*b4j.example.vmprogresslinear*/ (anywheresoftware.b4a.keywords.Common.True)._setheight /*b4j.example.vmprogresslinear*/ ("30")._setreactive /*b4j.example.vmprogresslinear*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 134;BA.debugLine="pl8.SetVModel(\"pl8\").SetLabel(\"%\")";
_pl8._setvmodel /*b4j.example.vmprogresslinear*/ ("pl8")._setlabel /*b4j.example.vmprogresslinear*/ ("%");
 //BA.debugLineNum = 135;BA.debugLine="pl8.AddToContainer(cont, 4,2)";
_pl8._addtocontainer /*String*/ (_cont,(int) (4),(int) (2));
 //BA.debugLineNum = 136;BA.debugLine="vue.SetData(\"pl8\", \"60\")";
_vue._setdata /*b4j.example.bananovue*/ ("pl8",(Object)("60"));
 //BA.debugLineNum = 139;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 140;BA.debugLine="vue.AddCode($\"Dim pl8 As VMProgressLinear\"$)";
_vue._addcode /*String*/ (("Dim pl8 As VMProgressLinear"));
 //BA.debugLineNum = 141;BA.debugLine="vue.AddCode($\"pl8.Initialize(vue, \"pl8\", Me).SetVi";
_vue._addcode /*String*/ (("pl8.Initialize(vue, \"pl8\", Me).SetVisible(True).SetHeight(\"30\").SetReactive(True)"));
 //BA.debugLineNum = 142;BA.debugLine="vue.AddCode($\"pl8.SetVModel(\"pl8\").SetLabel(\"%\")\"$";
_vue._addcode /*String*/ (("pl8.SetVModel(\"pl8\").SetLabel(\"%\")"));
 //BA.debugLineNum = 143;BA.debugLine="vue.AddCode($\"pl8.AddToContainer(cont, 4,2)\"$)";
_vue._addcode /*String*/ (("pl8.AddToContainer(cont, 4,2)"));
 //BA.debugLineNum = 144;BA.debugLine="vue.AddCode($\"vue.SetData(\"pl8\", \"60\")\"$)";
_vue._addcode /*String*/ (("vue.SetData(\"pl8\", \"60\")"));
 //BA.debugLineNum = 145;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pl8code\", \"Progress";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"pl8code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (4),(int) (2));
 //BA.debugLineNum = 149;BA.debugLine="Dim pc1 As VMProgressCircular";
_pc1 = new b4j.example.vmprogresscircular();
 //BA.debugLineNum = 150;BA.debugLine="pc1.Initialize(vue, \"pc1\", Me).SetVisible(True).S";
_pc1._initialize /*b4j.example.vmprogresscircular*/ (ba,_vue,"pc1",modprogress.getObject())._setvisible /*b4j.example.vmprogresscircular*/ (anywheresoftware.b4a.keywords.Common.True)._setvalue /*b4j.example.vmprogresscircular*/ ("20");
 //BA.debugLineNum = 151;BA.debugLine="pc1.AddToContainer(cont, 5,1)";
_pc1._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 154;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 155;BA.debugLine="vue.AddCode($\"Dim pc1 As VMProgressCircular\"$)";
_vue._addcode /*String*/ (("Dim pc1 As VMProgressCircular"));
 //BA.debugLineNum = 156;BA.debugLine="vue.AddCode($\"pc1.Initialize(vue, \"pc1\", Me).SetVi";
_vue._addcode /*String*/ (("pc1.Initialize(vue, \"pc1\", Me).SetVisible(True).SetValue(\"20\")"));
 //BA.debugLineNum = 157;BA.debugLine="vue.AddCode($\"pc1.AddToContainer(cont, 5,1)\"$)";
_vue._addcode /*String*/ (("pc1.AddToContainer(cont, 5,1)"));
 //BA.debugLineNum = 158;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pc1code\", \"Progress";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"pc1code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 162;BA.debugLine="Dim pc2 As VMProgressCircular";
_pc2 = new b4j.example.vmprogresscircular();
 //BA.debugLineNum = 163;BA.debugLine="pc2.Initialize(vue, \"pc2\", Me).SetVisible(True).S";
_pc2._initialize /*b4j.example.vmprogresscircular*/ (ba,_vue,"pc2",modprogress.getObject())._setvisible /*b4j.example.vmprogresscircular*/ (anywheresoftware.b4a.keywords.Common.True)._setvalue /*b4j.example.vmprogresscircular*/ ("80")._setcolor /*b4j.example.vmprogresscircular*/ (_vm._color_bluegrey /*String*/ );
 //BA.debugLineNum = 164;BA.debugLine="pc2.AddToContainer(cont, 5,2)";
_pc2._addtocontainer /*String*/ (_cont,(int) (5),(int) (2));
 //BA.debugLineNum = 167;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 168;BA.debugLine="vue.AddCode($\"Dim pc2 As VMProgressCircular\"$)";
_vue._addcode /*String*/ (("Dim pc2 As VMProgressCircular"));
 //BA.debugLineNum = 169;BA.debugLine="vue.AddCode($\"pc2.Initialize(vue, \"pc2\", Me).SetVi";
_vue._addcode /*String*/ (("pc2.Initialize(vue, \"pc2\", Me).SetVisible(True).SetValue(\"80\").SetColor(vm.Color_bluegrey)"));
 //BA.debugLineNum = 170;BA.debugLine="vue.AddCode($\"pc2.AddToContainer(cont, 5,2)\"$)";
_vue._addcode /*String*/ (("pc2.AddToContainer(cont, 5,2)"));
 //BA.debugLineNum = 171;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pc2code\", \"Progress";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"pc2code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (5),(int) (2));
 //BA.debugLineNum = 174;BA.debugLine="Dim pc3 As VMProgressCircular";
_pc3 = new b4j.example.vmprogresscircular();
 //BA.debugLineNum = 175;BA.debugLine="pc3.Initialize(vue, \"pc3\", Me).SetVisible(True).S";
_pc3._initialize /*b4j.example.vmprogresscircular*/ (ba,_vue,"pc3",modprogress.getObject())._setvisible /*b4j.example.vmprogresscircular*/ (anywheresoftware.b4a.keywords.Common.True)._setcolor /*b4j.example.vmprogresscircular*/ (_vm._color_red /*String*/ )._setindeterminate /*b4j.example.vmprogresscircular*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 176;BA.debugLine="pc3.AddToContainer(cont, 6,1)";
_pc3._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 179;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 180;BA.debugLine="vue.AddCode($\"Dim pc3 As VMProgressCircular\"$)";
_vue._addcode /*String*/ (("Dim pc3 As VMProgressCircular"));
 //BA.debugLineNum = 181;BA.debugLine="vue.AddCode($\"pc3.Initialize(vue, \"pc3\", Me).SetVi";
_vue._addcode /*String*/ (("pc3.Initialize(vue, \"pc3\", Me).SetVisible(True).SetColor(vm.color_red).SetIndeterminate(True)"));
 //BA.debugLineNum = 182;BA.debugLine="vue.AddCode($\"pc3.AddToContainer(cont, 6,1)\"$)";
_vue._addcode /*String*/ (("pc3.AddToContainer(cont, 6,1)"));
 //BA.debugLineNum = 183;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 184;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pc3code\", \"Progress";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"pc3code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 188;BA.debugLine="Dim pc4 As VMProgressCircular";
_pc4 = new b4j.example.vmprogresscircular();
 //BA.debugLineNum = 189;BA.debugLine="pc4.Initialize(vue, \"pc4\", Me).SetVisible(True).S";
_pc4._initialize /*b4j.example.vmprogresscircular*/ (ba,_vue,"pc4",modprogress.getObject())._setvisible /*b4j.example.vmprogresscircular*/ (anywheresoftware.b4a.keywords.Common.True)._setindeterminate /*b4j.example.vmprogresscircular*/ (anywheresoftware.b4a.keywords.Common.True)._setwidth /*b4j.example.vmprogresscircular*/ ("7")._setsize /*b4j.example.vmprogresscircular*/ ("80");
 //BA.debugLineNum = 190;BA.debugLine="pc4.AddToContainer(cont, 7,1)";
_pc4._addtocontainer /*String*/ (_cont,(int) (7),(int) (1));
 //BA.debugLineNum = 192;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 193;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 194;BA.debugLine="vue.AddCode($\"Dim pc4 As VMProgressCircular\"$)";
_vue._addcode /*String*/ (("Dim pc4 As VMProgressCircular"));
 //BA.debugLineNum = 195;BA.debugLine="vue.AddCode($\"pc4.Initialize(vue, \"pc4\", Me).SetVi";
_vue._addcode /*String*/ (("pc4.Initialize(vue, \"pc4\", Me).SetVisible(True).SetIndeterminate(True).SetWidth(\"7\").SetSize(\"80\")"));
 //BA.debugLineNum = 196;BA.debugLine="vue.AddCode($\"pc4.AddToContainer(cont, 7,1)\"$)";
_vue._addcode /*String*/ (("pc4.AddToContainer(cont, 7,1)"));
 //BA.debugLineNum = 197;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pc4code\", \"Progress";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"pc4code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (7),(int) (1));
 //BA.debugLineNum = 201;BA.debugLine="pc5.Initialize(vue, \"pc5\", Me).SetVisible(True).S";
_pc5._initialize /*b4j.example.vmprogresscircular*/ (ba,_vue,"pc5",modprogress.getObject())._setvisible /*b4j.example.vmprogresscircular*/ (anywheresoftware.b4a.keywords.Common.True)._setlabel /*b4j.example.vmprogresscircular*/ ("%")._settextcolor /*b4j.example.vmprogresscircular*/ (_vm._color_blue /*String*/ );
 //BA.debugLineNum = 202;BA.debugLine="pc5.SetRotate(\"360\").SetSize(\"90\").SetWidth(\"20\")";
_pc5._setrotate /*b4j.example.vmprogresscircular*/ ("360")._setsize /*b4j.example.vmprogresscircular*/ ("90")._setwidth /*b4j.example.vmprogresscircular*/ ("20")._setcolor /*b4j.example.vmprogresscircular*/ (_vm._color_amber /*String*/ )._setvalue /*b4j.example.vmprogresscircular*/ ("0");
 //BA.debugLineNum = 203;BA.debugLine="pc5.AddToContainer(cont, 7,2)";
_pc5._addtocontainer /*String*/ (_cont,(int) (7),(int) (2));
 //BA.debugLineNum = 207;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 208;BA.debugLine="vue.AddCode($\"'when the app is mounted, execute st";
_vue._addcode /*String*/ (("'when the app is mounted, execute startit"));
 //BA.debugLineNum = 209;BA.debugLine="vue.AddCode($\"vue.SetMounted(Me, \"startit\")\"$)";
_vue._addcode /*String*/ (("vue.SetMounted(Me, \"startit\")"));
 //BA.debugLineNum = 210;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 211;BA.debugLine="vue.AddCode($\"pc5.Initialize(vue, \"pc5\", Me).SetVi";
_vue._addcode /*String*/ (("pc5.Initialize(vue, \"pc5\", Me).SetVisible(True).SetLabel(\"%\").SetTextColor(vm.COLOR_BLUE)"));
 //BA.debugLineNum = 212;BA.debugLine="vue.AddCode($\"pc5.SetRotate(\"360\").SetSize(\"90\").S";
_vue._addcode /*String*/ (("pc5.SetRotate(\"360\").SetSize(\"90\").SetWidth(\"20\").SetColor(vm.COLOR_AMBER).SetValue(\"0\")"));
 //BA.debugLineNum = 213;BA.debugLine="vue.AddCode($\"pc5.AddToContainer(cont, 7,2)\"$)";
_vue._addcode /*String*/ (("pc5.AddToContainer(cont, 7,2)"));
 //BA.debugLineNum = 214;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 215;BA.debugLine="vue.AddCode($\"Sub startit\"$)";
_vue._addcode /*String*/ (("Sub startit"));
 //BA.debugLineNum = 216;BA.debugLine="vue.AddCode($\"Dim cb As BANanoObject = BANano.call";
_vue._addcode /*String*/ (("Dim cb As BANanoObject = BANano.callback(Me,\"circulate\", Null)"));
 //BA.debugLineNum = 217;BA.debugLine="vue.AddCode($\"BANano.Window.SetInterval(cb, 1000)\"";
_vue._addcode /*String*/ (("BANano.Window.SetInterval(cb, 1000)"));
 //BA.debugLineNum = 218;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 219;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 220;BA.debugLine="vue.AddCode($\"Sub circulate\"$)";
_vue._addcode /*String*/ (("Sub circulate"));
 //BA.debugLineNum = 221;BA.debugLine="vue.AddCode($\"'read the stored value\"$)";
_vue._addcode /*String*/ (("'read the stored value"));
 //BA.debugLineNum = 222;BA.debugLine="vue.AddCode($\"Dim vpc5 As String = pc5.GetValue\"$)";
_vue._addcode /*String*/ (("Dim vpc5 As String = pc5.GetValue"));
 //BA.debugLineNum = 223;BA.debugLine="vue.AddCode($\"vpc5 = BANano.parseint(vpc5)\"$)";
_vue._addcode /*String*/ (("vpc5 = BANano.parseint(vpc5)"));
 //BA.debugLineNum = 224;BA.debugLine="vue.AddCode($\"If vpc5 = \"100\" Then\"$)";
_vue._addcode /*String*/ (("If vpc5 = \"100\" Then"));
 //BA.debugLineNum = 225;BA.debugLine="vue.AddCode($\"'we have reached 100%\"$)";
_vue._addcode /*String*/ (("'we have reached 100%"));
 //BA.debugLineNum = 226;BA.debugLine="vue.AddCode($\"vpc5 = \"0\"\"$)";
_vue._addcode /*String*/ (("vpc5 = \"0\""));
 //BA.debugLineNum = 227;BA.debugLine="vue.AddCode($\"Else\"$)";
_vue._addcode /*String*/ (("Else"));
 //BA.debugLineNum = 228;BA.debugLine="vue.AddCode($\"'increment by 10\"$)";
_vue._addcode /*String*/ (("'increment by 10"));
 //BA.debugLineNum = 229;BA.debugLine="vue.AddCode($\"vpc5 = BANano.parseint(vpc5) + 10\"$)";
_vue._addcode /*String*/ (("vpc5 = BANano.parseint(vpc5) + 10"));
 //BA.debugLineNum = 230;BA.debugLine="vue.AddCode($\"End If\"$)";
_vue._addcode /*String*/ (("End If"));
 //BA.debugLineNum = 231;BA.debugLine="vue.AddCode($\"'save the state\"$)";
_vue._addcode /*String*/ (("'save the state"));
 //BA.debugLineNum = 232;BA.debugLine="vue.AddCode($\"pc5.SetValue(vpc5)\"$)";
_vue._addcode /*String*/ (("pc5.SetValue(vpc5)"));
 //BA.debugLineNum = 233;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 234;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pc5code\", \"Progress";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modprogress.getObject(),"pc5code","Progress",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (7),(int) (2));
 //BA.debugLineNum = 237;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 238;BA.debugLine="vue.SetMounted(Me, \"startit\")";
_vue._setmounted /*b4j.example.bananovue*/ (modprogress.getObject(),"startit");
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public static String  _pc1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub pc1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 280;BA.debugLine="vue.CopyCode2Clipboard(\"pc1code\")";
_vue._copycode2clipboard /*String*/ ("pc1code");
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return "";
}
public static String  _pc1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub pc1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 284;BA.debugLine="vue.DownloadCode(\"pc1code\", \"pc1code.txt\")";
_vue._downloadcode /*String*/ ("pc1code","pc1code.txt");
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return "";
}
public static String  _pc2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub pc2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 270;BA.debugLine="vue.CopyCode2Clipboard(\"pc2code\")";
_vue._copycode2clipboard /*String*/ ("pc2code");
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return "";
}
public static String  _pc2codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub pc2codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 274;BA.debugLine="vue.DownloadCode(\"pc2code\", \"pc2code.txt\")";
_vue._downloadcode /*String*/ ("pc2code","pc2code.txt");
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public static String  _pc3codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub pc3codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 261;BA.debugLine="vue.CopyCode2Clipboard(\"pc3code\")";
_vue._copycode2clipboard /*String*/ ("pc3code");
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public static String  _pc3codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub pc3codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 265;BA.debugLine="vue.DownloadCode(\"pc3code\", \"pc3code.txt\")";
_vue._downloadcode /*String*/ ("pc3code","pc3code.txt");
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public static String  _pc4codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub pc4codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 252;BA.debugLine="vue.CopyCode2Clipboard(\"pc4code\")";
_vue._copycode2clipboard /*String*/ ("pc4code");
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return "";
}
public static String  _pc4codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub pc4codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 256;BA.debugLine="vue.DownloadCode(\"pc4code\", \"pc4code.txt\")";
_vue._downloadcode /*String*/ ("pc4code","pc4code.txt");
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public static String  _pc5codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub pc5codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 243;BA.debugLine="vue.CopyCode2Clipboard(\"pc5code\")";
_vue._copycode2clipboard /*String*/ ("pc5code");
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return "";
}
public static String  _pc5codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub pc5codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 247;BA.debugLine="vue.DownloadCode(\"pc4code\", \"pc5code.txt\")";
_vue._downloadcode /*String*/ ("pc4code","pc5code.txt");
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public static String  _pl3codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub pl3codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 333;BA.debugLine="vue.CopyCode2Clipboard(\"pl3code\")";
_vue._copycode2clipboard /*String*/ ("pl3code");
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return "";
}
public static String  _pl3codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Sub pl3codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 337;BA.debugLine="vue.DownloadCode(\"pl3code\", \"pl3code.txt\")";
_vue._downloadcode /*String*/ ("pl3code","pl3code.txt");
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return "";
}
public static String  _pl4codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub pl4codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 324;BA.debugLine="vue.CopyCode2Clipboard(\"pl4code\")";
_vue._copycode2clipboard /*String*/ ("pl4code");
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return "";
}
public static String  _pl4codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub pl4codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 328;BA.debugLine="vue.DownloadCode(\"pl4code\", \"pl4code.txt\")";
_vue._downloadcode /*String*/ ("pl4code","pl4code.txt");
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return "";
}
public static String  _pl5codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub pl5codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 316;BA.debugLine="vue.CopyCode2Clipboard(\"pl5code\")";
_vue._copycode2clipboard /*String*/ ("pl5code");
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return "";
}
public static String  _pl5codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub pl5codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 320;BA.debugLine="vue.DownloadCode(\"pl5code\", \"pl5code.txt\")";
_vue._downloadcode /*String*/ ("pl5code","pl5code.txt");
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return "";
}
public static String  _pl6codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub pl6codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 307;BA.debugLine="vue.CopyCode2Clipboard(\"pl6code\")";
_vue._copycode2clipboard /*String*/ ("pl6code");
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public static String  _pl6codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub pl6codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 311;BA.debugLine="vue.DownloadCode(\"pl6code\", \"pl6code.txt\")";
_vue._downloadcode /*String*/ ("pl6code","pl6code.txt");
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return "";
}
public static String  _pl7codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub pl7codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 298;BA.debugLine="vue.CopyCode2Clipboard(\"pl7code\")";
_vue._copycode2clipboard /*String*/ ("pl7code");
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public static String  _pl7codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub pl7codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 302;BA.debugLine="vue.DownloadCode(\"pl7code\", \"pl7code.txt\")";
_vue._downloadcode /*String*/ ("pl7code","pl7code.txt");
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return "";
}
public static String  _pl8codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub pl8codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 289;BA.debugLine="vue.CopyCode2Clipboard(\"pl8code\")";
_vue._copycode2clipboard /*String*/ ("pl8code");
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public static String  _pl8codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub pl8codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 293;BA.debugLine="vue.DownloadCode(\"pl8code\", \"pl8code.txt\")";
_vue._downloadcode /*String*/ ("pl8code","pl8code.txt");
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public static String  _prg1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub prg1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 351;BA.debugLine="vue.CopyCode2Clipboard(\"prg1code\")";
_vue._copycode2clipboard /*String*/ ("prg1code");
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public static String  _prg1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub prg1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 355;BA.debugLine="vue.DownloadCode(\"prg1code\", \"prg1code.txt\")";
_vue._downloadcode /*String*/ ("prg1code","prg1code.txt");
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return "";
}
public static String  _prg2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub prg2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 342;BA.debugLine="vue.CopyCode2Clipboard(\"prg2code\")";
_vue._copycode2clipboard /*String*/ ("prg2code");
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public static String  _prg2codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="Sub prg2codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 346;BA.debugLine="vue.DownloadCode(\"prg2code\", \"prg2code.txt\")";
_vue._downloadcode /*String*/ ("prg2code","prg2code.txt");
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"progressCode\"";
_name = "progressCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Progress\"";
_title = "Progress";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 8;BA.debugLine="Private pc5 As VMProgressCircular";
_pc5 = new b4j.example.vmprogresscircular();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public static String  _startit() throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 361;BA.debugLine="Sub startit";
 //BA.debugLineNum = 362;BA.debugLine="Dim cb As BANanoObject = BANano.callback(Me,\"circ";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(modprogress.getObject(),"circulate",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 363;BA.debugLine="BANano.Window.SetInterval(cb, 1000)";
_banano.Window().SetInterval((Object)(_cb.getObject()),(int) (1000));
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return "";
}
}
