package b4j.example;


import anywheresoftware.b4a.BA;

public class modcombo extends Object{
public static modcombo mostCurrent = new modcombo();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modcombo", null);
		ba.loadHtSubs(modcombo.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modcombo", ba);
		}
	}
    public static Class<?> getObject() {
		return modcombo.class;
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
public static b4j.example.modcheckbox _modcheckbox = null;
public static b4j.example.modcolorpicker _modcolorpicker = null;
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
b4j.example.vmselect _cbo1 = null;
b4j.example.vmselect _cbo2 = null;
b4j.example.vmselect _cbo3 = null;
b4j.example.vmselect _cbo4 = null;
b4j.example.vmselect _cbo5 = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code";
 //BA.debugLineNum = 10;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modcombo.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 16;BA.debugLine="cont.AddRows(1).AddColumns(10, 12, 12, 12, 12)";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (1))._addcolumns /*b4j.example.vmcontainer*/ ((int) (10),(int) (12),(int) (12),(int) (12),(int) (12));
 //BA.debugLineNum = 18;BA.debugLine="vm.setstatesingle(\"select\", Array(\"Vuetify\", \"Pro";
_vm._setstatesingle /*b4j.example.bananovm*/ ("select",(Object)(new Object[]{(Object)("Vuetify"),(Object)("Programming")}));
 //BA.debugLineNum = 19;BA.debugLine="vm.setstatesingle(\"items\", Array(\"Programming\", \"";
_vm._setstatesingle /*b4j.example.bananovm*/ ("items",(Object)(new Object[]{(Object)("Programming"),(Object)("Design"),(Object)("Vue"),(Object)("Vuetify")}));
 //BA.debugLineNum = 21;BA.debugLine="Dim cbo1 As VMSelect = vm.CreateComboBox(\"cbo1\",";
_cbo1 = _vm._createcombobox /*b4j.example.vmselect*/ ("cbo1",modcombo.getObject());
 //BA.debugLineNum = 22;BA.debugLine="cbo1.SetVModel(\"select\").SetItems(\"items\").SetLab";
_cbo1._setvmodel /*b4j.example.vmselect*/ ("select")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Select a favourate activity or create a new one");
 //BA.debugLineNum = 23;BA.debugLine="cbo1.SetMultiple(True).AddToContainer(cont, 1, 1)";
_cbo1._setmultiple /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="Dim cbo2 As VMSelect = vm.CreateComboBox(\"cbo2\",";
_cbo2 = _vm._createcombobox /*b4j.example.vmselect*/ ("cbo2",modcombo.getObject());
 //BA.debugLineNum = 26;BA.debugLine="cbo2.SetVModel(\"select\").SetItems(\"items\").SetLab";
_cbo2._setvmodel /*b4j.example.vmselect*/ ("select")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("I use chips")._setchips /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 27;BA.debugLine="cbo2.SetMultiple(True).AddToContainer(cont, 1, 2)";
_cbo2._setmultiple /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 29;BA.debugLine="Dim cbo3 As VMSelect = vm.CreateComboBox(\"cbo3\",";
_cbo3 = _vm._createcombobox /*b4j.example.vmselect*/ ("cbo3",modcombo.getObject());
 //BA.debugLineNum = 30;BA.debugLine="cbo3.SetVModel(\"select\").SetItems(\"items\").SetLab";
_cbo3._setvmodel /*b4j.example.vmselect*/ ("select")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("I use chips")._setchips /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setreadonly /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 31;BA.debugLine="cbo3.SetMultiple(True).AddToContainer(cont, 1, 3)";
_cbo3._setmultiple /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (3));
 //BA.debugLineNum = 33;BA.debugLine="Dim cbo4 As VMSelect = vm.CreateComboBox(\"cbo4\",";
_cbo4 = _vm._createcombobox /*b4j.example.vmselect*/ ("cbo4",modcombo.getObject());
 //BA.debugLineNum = 34;BA.debugLine="cbo4.SetVModel(\"select\").SetItems(\"items\").SetLab";
_cbo4._setvmodel /*b4j.example.vmselect*/ ("select")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("I use chips")._setdense /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setoutlined /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 35;BA.debugLine="cbo4.SetMultiple(True).AddToContainer(cont, 1, 4)";
_cbo4._setmultiple /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (4));
 //BA.debugLineNum = 37;BA.debugLine="Dim cbo5 As VMSelect = vm.CreateComboBox(\"cbo5\",";
_cbo5 = _vm._createcombobox /*b4j.example.vmselect*/ ("cbo5",modcombo.getObject());
 //BA.debugLineNum = 38;BA.debugLine="cbo5.SetVModel(\"select\").SetItems(\"items\").SetLab";
_cbo5._setvmodel /*b4j.example.vmselect*/ ("select")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("I use chips");
 //BA.debugLineNum = 39;BA.debugLine="cbo5.SetHint(\"Max of 5 tags\").SetPersistentHint(T";
_cbo5._sethint /*b4j.example.vmselect*/ ("Max of 5 tags")._setpersistenthint /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._sethideselected /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setsmallchips /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 40;BA.debugLine="cbo5.SetMultiple(True).AddToContainer(cont, 1, 5)";
_cbo5._setmultiple /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (1),(int) (5));
 //BA.debugLineNum = 43;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"comboCode\"";
_name = "comboCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Combo Boxes\"";
_title = "Combo Boxes";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
