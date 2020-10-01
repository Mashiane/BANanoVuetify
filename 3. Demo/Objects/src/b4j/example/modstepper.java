package b4j.example;


import anywheresoftware.b4a.BA;

public class modstepper extends Object{
public static modstepper mostCurrent = new modstepper();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modstepper", null);
		ba.loadHtSubs(modstepper.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modstepper", ba);
		}
	}
    public static Class<?> getObject() {
		return modstepper.class;
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
b4j.example.vmstepper _stepper = null;
b4j.example.vmstepper _stepper2 = null;
b4j.example.vmstepper _stepper3 = null;
b4j.example.vmstepper _stepper4 = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modstepper.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 17;BA.debugLine="cont.AddRows(4).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (4))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="Dim lbl1 As VMLabel = vm.CreateLabel(\"\").SetParag";
_lbl1 = _vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 21;BA.debugLine="lbl1.SetText(vm.Rand_LoremIpsum(1))";
_lbl1._settext /*b4j.example.vmlabel*/ (_vm._rand_loremipsum /*String*/ ((int) (1)));
 //BA.debugLineNum = 22;BA.debugLine="Dim contbtna As VMContainer";
_contbtna = new b4j.example.vmcontainer();
 //BA.debugLineNum = 23;BA.debugLine="contbtna = vm.CreateContainer(\"contxa\", Me)";
_contbtna = _vm._createcontainer /*b4j.example.vmcontainer*/ ("contxa",modstepper.getObject());
 //BA.debugLineNum = 24;BA.debugLine="contbtna.AddControlS(lbl1.Label, lbl1.tostring, 1";
_contbtna._addcontrols /*String*/ (_lbl1._label /*b4j.example.vmelement*/ ,_lbl1._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 26;BA.debugLine="Dim lbl2 As VMLabel = vm.CreateLabel(\"\").SetParag";
_lbl2 = _vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 27;BA.debugLine="lbl2.SetText(vm.Rand_LoremIpsum(1))";
_lbl2._settext /*b4j.example.vmlabel*/ (_vm._rand_loremipsum /*String*/ ((int) (1)));
 //BA.debugLineNum = 28;BA.debugLine="Dim contbtnb As VMContainer";
_contbtnb = new b4j.example.vmcontainer();
 //BA.debugLineNum = 29;BA.debugLine="contbtnb = vm.CreateContainer(\"contxb\", Me)";
_contbtnb = _vm._createcontainer /*b4j.example.vmcontainer*/ ("contxb",modstepper.getObject());
 //BA.debugLineNum = 30;BA.debugLine="contbtnb.AddControlS(lbl2.Label, lbl2.tostring, 1";
_contbtnb._addcontrols /*String*/ (_lbl2._label /*b4j.example.vmelement*/ ,_lbl2._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 33;BA.debugLine="Dim lbl3 As VMLabel = vm.CreateLabel(\"\").SetParag";
_lbl3 = _vm._createlabel /*b4j.example.vmlabel*/ ("")._setparagraph /*b4j.example.vmlabel*/ ();
 //BA.debugLineNum = 34;BA.debugLine="lbl3.SetText(vm.Rand_LoremIpsum(1))";
_lbl3._settext /*b4j.example.vmlabel*/ (_vm._rand_loremipsum /*String*/ ((int) (1)));
 //BA.debugLineNum = 35;BA.debugLine="Dim contbtnc As VMContainer";
_contbtnc = new b4j.example.vmcontainer();
 //BA.debugLineNum = 36;BA.debugLine="contbtnc = vm.CreateContainer(\"contxc\", Me)";
_contbtnc = _vm._createcontainer /*b4j.example.vmcontainer*/ ("contxc",modstepper.getObject());
 //BA.debugLineNum = 37;BA.debugLine="contbtnc.AddControlS(lbl3.Label, lbl3.tostring, 1";
_contbtnc._addcontrols /*String*/ (_lbl3._label /*b4j.example.vmelement*/ ,_lbl3._tostring /*String*/ (),BA.NumberToString(1),BA.NumberToString(1),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 40;BA.debugLine="Dim stepper As VMStepper = vm.CreateStepper(\"a\",";
_stepper = _vm._createstepper /*b4j.example.vmstepper*/ ("a",modstepper.getObject())._setonchange /*b4j.example.vmstepper*/ (modstepper.getObject(),"stepperChange");
 //BA.debugLineNum = 41;BA.debugLine="stepper.AddStep(\"astep1\", \"Step 1\", \"Name of Step";
_stepper._addstep /*b4j.example.vmstepper*/ ("astep1","Step 1","Name of Step 1",anywheresoftware.b4a.keywords.Common.True,_contbtna._tostring /*String*/ ());
 //BA.debugLineNum = 42;BA.debugLine="stepper.AddStep(\"astep2\", \"Step 2\", \"Name of Step";
_stepper._addstep /*b4j.example.vmstepper*/ ("astep2","Step 2","Name of Step 2",anywheresoftware.b4a.keywords.Common.True,_contbtnb._tostring /*String*/ ());
 //BA.debugLineNum = 43;BA.debugLine="stepper.AddStep(\"astep3\", \"Step 3\", \"Name of Step";
_stepper._addstep /*b4j.example.vmstepper*/ ("astep3","Step 3","Name of Step 3",anywheresoftware.b4a.keywords.Common.True,_contbtnc._tostring /*String*/ ());
 //BA.debugLineNum = 44;BA.debugLine="stepper.AddToContainer(cont, 1, 1)";
_stepper._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 47;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 48;BA.debugLine="vue.AddCode($\"'create containers and content\"$)";
_vue._addcode /*String*/ (("'create containers and content"));
 //BA.debugLineNum = 49;BA.debugLine="vue.AddCode($\"Dim lbl1 As VMLabel = vm.CreateLabe";
_vue._addcode /*String*/ (("Dim lbl1 As VMLabel = vm.CreateLabel(\"\").SetParagraph"));
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"lbl1.SetText(vm.Rand_LoremIpsum(1))";
_vue._addcode /*String*/ (("lbl1.SetText(vm.Rand_LoremIpsum(1))"));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"Dim contbtna As VMContainer\"$)";
_vue._addcode /*String*/ (("Dim contbtna As VMContainer"));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"contbtna = vm.CreateContainer(\"cont";
_vue._addcode /*String*/ (("contbtna = vm.CreateContainer(\"contxa\", Me)"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"contbtna.AddControlS(lbl1.Label, lb";
_vue._addcode /*String*/ (("contbtna.AddControlS(lbl1.Label, lbl1.tostring, 1, 1, 12, 12, 12, 12)"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 55;BA.debugLine="vue.AddCode($\"Dim lbl2 As VMLabel = vm.CreateLabe";
_vue._addcode /*String*/ (("Dim lbl2 As VMLabel = vm.CreateLabel(\"\").SetParagraph"));
 //BA.debugLineNum = 56;BA.debugLine="vue.AddCode($\"lbl2.SetText(vm.Rand_LoremIpsum(1))";
_vue._addcode /*String*/ (("lbl2.SetText(vm.Rand_LoremIpsum(1))"));
 //BA.debugLineNum = 57;BA.debugLine="vue.AddCode($\"Dim contbtnb As VMContainer\"$)";
_vue._addcode /*String*/ (("Dim contbtnb As VMContainer"));
 //BA.debugLineNum = 58;BA.debugLine="vue.AddCode($\"contbtnb = vm.CreateContainer(\"cont";
_vue._addcode /*String*/ (("contbtnb = vm.CreateContainer(\"contxb\", Me)"));
 //BA.debugLineNum = 59;BA.debugLine="vue.AddCode($\"contbtnb.AddControlS(lbl2.Label, lb";
_vue._addcode /*String*/ (("contbtnb.AddControlS(lbl2.Label, lbl2.tostring, 1, 1, 12, 12, 12, 12)"));
 //BA.debugLineNum = 60;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 61;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 62;BA.debugLine="vue.AddCode($\"Dim lbl3 As VMLabel = vm.CreateLabe";
_vue._addcode /*String*/ (("Dim lbl3 As VMLabel = vm.CreateLabel(\"\").SetParagraph"));
 //BA.debugLineNum = 63;BA.debugLine="vue.AddCode($\"lbl3.SetText(vm.Rand_LoremIpsum(1))";
_vue._addcode /*String*/ (("lbl3.SetText(vm.Rand_LoremIpsum(1))"));
 //BA.debugLineNum = 64;BA.debugLine="vue.AddCode($\"Dim contbtnc As VMContainer\"$)";
_vue._addcode /*String*/ (("Dim contbtnc As VMContainer"));
 //BA.debugLineNum = 65;BA.debugLine="vue.AddCode($\"contbtnc = vm.CreateContainer(\"cont";
_vue._addcode /*String*/ (("contbtnc = vm.CreateContainer(\"contxc\", Me)"));
 //BA.debugLineNum = 66;BA.debugLine="vue.AddCode($\"contbtnc.AddControlS(lbl3.Label, lb";
_vue._addcode /*String*/ (("contbtnc.AddControlS(lbl3.Label, lbl3.tostring, 1, 1, 12, 12, 12, 12)"));
 //BA.debugLineNum = 67;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"step1code\", \"Creat";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modstepper.getObject(),"step1code","Creating Containers with Content",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 70;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 71;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 72;BA.debugLine="vue.AddCode($\"Dim stepper As VMStepper = vm.Create";
_vue._addcode /*String*/ (("Dim stepper As VMStepper = vm.CreateStepper(\"a\", Me).SetOnChange(Me, \"stepperChange\")"));
 //BA.debugLineNum = 73;BA.debugLine="vue.AddCode($\"stepper.AddStep(\"astep1\", \"Step 1\",";
_vue._addcode /*String*/ (("stepper.AddStep(\"astep1\", \"Step 1\", \"Name of Step 1\", True, contbtna.Tostring)"));
 //BA.debugLineNum = 74;BA.debugLine="vue.AddCode($\"stepper.AddStep(\"astep2\", \"Step 2\",";
_vue._addcode /*String*/ (("stepper.AddStep(\"astep2\", \"Step 2\", \"Name of Step 2\", True, contbtnb.ToString)"));
 //BA.debugLineNum = 75;BA.debugLine="vue.AddCode($\"stepper.AddStep(\"astep3\", \"Step 3\",";
_vue._addcode /*String*/ (("stepper.AddStep(\"astep3\", \"Step 3\", \"Name of Step 3\", True, contbtnc.ToString)"));
 //BA.debugLineNum = 76;BA.debugLine="vue.AddCode($\"stepper.AddToContainer(cont, 1, 1)\"$";
_vue._addcode /*String*/ (("stepper.AddToContainer(cont, 1, 1)"));
 //BA.debugLineNum = 77;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 78;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"step2code\", \"Steppe";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modstepper.getObject(),"step2code","Stepper",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 83;BA.debugLine="Dim stepper2 As VMStepper = vm.CreateStepper(\"b\",";
_stepper2 = _vm._createstepper /*b4j.example.vmstepper*/ ("b",modstepper.getObject())._setonchange /*b4j.example.vmstepper*/ (modstepper.getObject(),"stepperChange");
 //BA.debugLineNum = 84;BA.debugLine="stepper2.AddStep(\"bstep1\", \"Step 1\", \"\", True, co";
_stepper2._addstep /*b4j.example.vmstepper*/ ("bstep1","Step 1","",anywheresoftware.b4a.keywords.Common.True,_contbtna._tostring /*String*/ ())._setstepcomplete /*b4j.example.vmstepper*/ ("bstep1",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 85;BA.debugLine="stepper2.AddStep(\"bstep2\", \"Step 2\", \"\", True, co";
_stepper2._addstep /*b4j.example.vmstepper*/ ("bstep2","Step 2","",anywheresoftware.b4a.keywords.Common.True,_contbtnb._tostring /*String*/ ())._setstepcomplete /*b4j.example.vmstepper*/ ("bstep2",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 86;BA.debugLine="stepper2.AddStep(\"bstep3\", \"Step 3\", \"\", True, co";
_stepper2._addstep /*b4j.example.vmstepper*/ ("bstep3","Step 3","",anywheresoftware.b4a.keywords.Common.True,_contbtnc._tostring /*String*/ ());
 //BA.debugLineNum = 87;BA.debugLine="stepper2.AddToContainer(cont, 2, 2)";
_stepper2._addtocontainer /*String*/ (_cont,(int) (2),(int) (2));
 //BA.debugLineNum = 89;BA.debugLine="Dim stepper3 As VMStepper = vm.CreateStepper(\"c\",";
_stepper3 = _vm._createstepper /*b4j.example.vmstepper*/ ("c",modstepper.getObject())._setvertical /*b4j.example.vmstepper*/ (anywheresoftware.b4a.keywords.Common.True)._setonchange /*b4j.example.vmstepper*/ (modstepper.getObject(),"stepperChange");
 //BA.debugLineNum = 90;BA.debugLine="stepper3.AddStep(\"cstep1\", \"Step 1\", \"\", True, co";
_stepper3._addstep /*b4j.example.vmstepper*/ ("cstep1","Step 1","",anywheresoftware.b4a.keywords.Common.True,_contbtna._tostring /*String*/ ());
 //BA.debugLineNum = 91;BA.debugLine="stepper3.AddStep(\"cstep2\", \"Step 2\", \"\", True, co";
_stepper3._addstep /*b4j.example.vmstepper*/ ("cstep2","Step 2","",anywheresoftware.b4a.keywords.Common.True,_contbtnb._tostring /*String*/ ());
 //BA.debugLineNum = 92;BA.debugLine="stepper3.AddStep(\"cstep3\", \"Step 3\", \"\", True, co";
_stepper3._addstep /*b4j.example.vmstepper*/ ("cstep3","Step 3","",anywheresoftware.b4a.keywords.Common.True,_contbtnc._tostring /*String*/ ());
 //BA.debugLineNum = 93;BA.debugLine="stepper3.AddToContainer(cont, 3, 1)";
_stepper3._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 95;BA.debugLine="Dim stepper4 As VMStepper = vm.CreateStepper(\"d\",";
_stepper4 = _vm._createstepper /*b4j.example.vmstepper*/ ("d",modstepper.getObject())._setvertical /*b4j.example.vmstepper*/ (anywheresoftware.b4a.keywords.Common.True)._setaltlabels /*b4j.example.vmstepper*/ (anywheresoftware.b4a.keywords.Common.True)._setonchange /*b4j.example.vmstepper*/ (modstepper.getObject(),"stepperChange");
 //BA.debugLineNum = 96;BA.debugLine="stepper4.AddStep(\"dstep1\", \"Step 1\", \"\", True, co";
_stepper4._addstep /*b4j.example.vmstepper*/ ("dstep1","Step 1","",anywheresoftware.b4a.keywords.Common.True,_contbtna._tostring /*String*/ ());
 //BA.debugLineNum = 97;BA.debugLine="stepper4.AddStep(\"dstep2\", \"Step 2\", \"\", True, co";
_stepper4._addstep /*b4j.example.vmstepper*/ ("dstep2","Step 2","",anywheresoftware.b4a.keywords.Common.True,_contbtnb._tostring /*String*/ ());
 //BA.debugLineNum = 98;BA.debugLine="stepper4.AddStep(\"dstep3\", \"Step 3\", \"\", True, co";
_stepper4._addstep /*b4j.example.vmstepper*/ ("dstep3","Step 3","",anywheresoftware.b4a.keywords.Common.True,_contbtnc._tostring /*String*/ ());
 //BA.debugLineNum = 99;BA.debugLine="stepper4.AddToContainer(cont, 4, 1)";
_stepper4._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 102;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 103;BA.debugLine="vue.AddCode($\"Dim stepper4 As VMStepper = vm.Creat";
_vue._addcode /*String*/ (("Dim stepper4 As VMStepper = vm.CreateStepper(\"d\", Me).SetVertical(True).SetAltLabels(True).SetOnChange(Me, \"stepperChange\")"));
 //BA.debugLineNum = 104;BA.debugLine="vue.AddCode($\"stepper4.AddStep(\"dstep1\", \"Step 1\",";
_vue._addcode /*String*/ (("stepper4.AddStep(\"dstep1\", \"Step 1\", \"\", True, contbtna.ToString)"));
 //BA.debugLineNum = 105;BA.debugLine="vue.AddCode($\"stepper4.AddStep(\"dstep2\", \"Step 2\",";
_vue._addcode /*String*/ (("stepper4.AddStep(\"dstep2\", \"Step 2\", \"\", True, contbtnb.ToString)"));
 //BA.debugLineNum = 106;BA.debugLine="vue.AddCode($\"stepper4.AddStep(\"dstep3\", \"Step 3\",";
_vue._addcode /*String*/ (("stepper4.AddStep(\"dstep3\", \"Step 3\", \"\", True, contbtnc.ToString)"));
 //BA.debugLineNum = 107;BA.debugLine="vue.AddCode($\"stepper4.AddToContainer(cont, 4, 1)\"";
_vue._addcode /*String*/ (("stepper4.AddToContainer(cont, 4, 1)"));
 //BA.debugLineNum = 108;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 109;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 110;BA.debugLine="vue.AddCode($\"Sub stepperChange(numx As Int)		'ign";
_vue._addcode /*String*/ (("Sub stepperChange(numx As Int)		'ignore"));
 //BA.debugLineNum = 111;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(numx)\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(numx)"));
 //BA.debugLineNum = 112;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 113;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"step3code\", \"Steppe";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modstepper.getObject(),"step3code","Stepper with Event",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 118;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"stepperCode\"";
_name = "stepperCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Steppers\"";
_title = "Steppers";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _step1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub step1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 145;BA.debugLine="vue.CopyCode2Clipboard(\"step1code\")";
_vue._copycode2clipboard /*String*/ ("step1code");
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public static String  _step1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub step1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 149;BA.debugLine="vue.DownloadCode(\"step1code\", \"step1code.txt\")";
_vue._downloadcode /*String*/ ("step1code","step1code.txt");
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public static String  _step2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub step2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 123;BA.debugLine="vue.CopyCode2Clipboard(\"step2code\")";
_vue._copycode2clipboard /*String*/ ("step2code");
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public static String  _step2codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub step2codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 127;BA.debugLine="vue.DownloadCode(\"step2code\", \"step2code.txt\")";
_vue._downloadcode /*String*/ ("step2code","step2code.txt");
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public static String  _step3codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub step3codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 132;BA.debugLine="vue.CopyCode2Clipboard(\"step3code\")";
_vue._copycode2clipboard /*String*/ ("step3code");
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public static String  _step3codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub step3codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 136;BA.debugLine="vue.DownloadCode(\"step3code\", \"step3code.txt\")";
_vue._downloadcode /*String*/ ("step3code","step3code.txt");
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public static String  _stepperchange(int _numx) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub stepperChange(numx As Int)		'ignore";
 //BA.debugLineNum = 140;BA.debugLine="vm.ShowSnackBar(numx)";
_vm._showsnackbar /*String*/ (BA.NumberToString(_numx));
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
}
