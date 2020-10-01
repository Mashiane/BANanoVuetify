package b4j.example;


import anywheresoftware.b4a.BA;

public class modcheckbox extends Object{
public static modcheckbox mostCurrent = new modcheckbox();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modcheckbox", null);
		ba.loadHtSubs(modcheckbox.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modcheckbox", ba);
		}
	}
    public static Class<?> getObject() {
		return modcheckbox.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
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
public static String  _chk1_change(Object _value) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub chk1_change(value As Object)";
 //BA.debugLineNum = 35;BA.debugLine="vm.ShowSnackBar($\"chk1_change: ${value}\"$)";
_vm._showsnackbar /*String*/ (("chk1_change: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_value)+""));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code";
 //BA.debugLineNum = 10;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modcheckbox.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.addrows(10).AddColumns2x6";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (10))._addcolumns2x6 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="vm.CreateCheckBox(\"chk1\", Me).SetLabel(\"Check Box";
_vm._createcheckbox /*b4j.example.vmcheckbox*/ ("chk1",modcheckbox.getObject())._setlabel /*b4j.example.vmcheckbox*/ ("Check Box 1")._setvmodel /*b4j.example.vmcheckbox*/ ("chk1")._setonchange /*b4j.example.vmcheckbox*/ (modcheckbox.getObject(),"chk1_change")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="vm.CreateLABEL(\"lbl1\").SetText(\"{{ chk1 }}\").AddT";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl1")._settext /*b4j.example.vmlabel*/ ("{{ chk1 }}")._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 21;BA.debugLine="vm.SetStateSingle(\"names\", Array())";
_vm._setstatesingle /*b4j.example.bananovm*/ ("names",(Object)(new Object[]{}));
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateCheckBox(\"chk2\", Me).SetLabel(\"John\").Se";
_vm._createcheckbox /*b4j.example.vmcheckbox*/ ("chk2",modcheckbox.getObject())._setlabel /*b4j.example.vmcheckbox*/ ("John")._setvmodel /*b4j.example.vmcheckbox*/ ("names")._setvalue /*b4j.example.vmcheckbox*/ ("John")._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.CreateCheckBox(\"chk3\", Me).SetLabel(\"Jacob\").S";
_vm._createcheckbox /*b4j.example.vmcheckbox*/ ("chk3",modcheckbox.getObject())._setlabel /*b4j.example.vmcheckbox*/ ("Jacob")._setvmodel /*b4j.example.vmcheckbox*/ ("names")._setvalue /*b4j.example.vmcheckbox*/ ("Jacob")._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 24;BA.debugLine="vm.CreateLABEL(\"lbl2\").SetText(\"{{ names }}\").Add";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl2")._settext /*b4j.example.vmlabel*/ ("{{ names }}")._addtocontainer /*String*/ (_cont,(int) (2),(int) (2));
 //BA.debugLineNum = 26;BA.debugLine="vm.CreateCheckBox(\"chk4\", Me).SetLabel(\"Red\").Set";
_vm._createcheckbox /*b4j.example.vmcheckbox*/ ("chk4",modcheckbox.getObject())._setlabel /*b4j.example.vmcheckbox*/ ("Red")._setvmodel /*b4j.example.vmcheckbox*/ ("chk4")._setvalue /*b4j.example.vmcheckbox*/ ("chk4")._sethidedetails /*b4j.example.vmcheckbox*/ (anywheresoftware.b4a.keywords.Common.True)._setcolor /*b4j.example.vmcheckbox*/ ("red")._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="vm.CreateLABEL(\"lbl4\").SetText(\"{{ chk4 }}\").AddT";
_vm._createlabel /*b4j.example.vmlabel*/ ("lbl4")._settext /*b4j.example.vmlabel*/ ("{{ chk4 }}")._addtocontainer /*String*/ (_cont,(int) (3),(int) (2));
 //BA.debugLineNum = 30;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"checkCode\"";
_name = "checkCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Check boxes\"";
_title = "Check boxes";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
