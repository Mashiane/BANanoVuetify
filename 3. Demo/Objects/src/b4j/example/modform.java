package b4j.example;


import anywheresoftware.b4a.BA;

public class modform extends Object{
public static modform mostCurrent = new modform();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modform", null);
		ba.loadHtSubs(modform.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modform", ba);
		}
	}
    public static Class<?> getObject() {
		return modform.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
public static b4j.example.vmform _frmuser = null;
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
b4j.example.vmtextfield _txtfirstname = null;
b4j.example.vmtextfield _txtlastname = null;
b4j.example.vmtextfield _txtemail = null;
b4j.example.vmselect _selitems = null;
b4j.example.vmcheckbox _chk = null;
b4j.example.vmtextfield _txtload = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 13;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modform.getObject());
 //BA.debugLineNum = 15;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 17;BA.debugLine="cont.AddRows(10).AddColumns(1, 12, 12, 12, 12)";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (10))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int) (12),(int) (12),(int) (12),(int) (12));
 //BA.debugLineNum = 19;BA.debugLine="vm.setstatesingle(\"items\", Array(\"Programming\", \"";
_vm._setstatesingle /*b4j.example.bananovm*/ ("items",(Object)(new Object[]{(Object)("Programming"),(Object)("Design"),(Object)("Vue"),(Object)("Vuetify")}));
 //BA.debugLineNum = 21;BA.debugLine="frmUser = vm.CreateForm(\"frmUser\", Me)";
_frmuser = _vm._createform /*b4j.example.vmform*/ ("frmUser",modform.getObject());
 //BA.debugLineNum = 23;BA.debugLine="frmUser.Container.AddRows(2).AddColumns(3, 12, 4,";
_frmuser._container /*b4j.example.vmcontainer*/ ._addrows /*b4j.example.vmcontainer*/ ((int) (2))._addcolumns /*b4j.example.vmcontainer*/ ((int) (3),(int) (12),(int) (4),(int) (4),(int) (4));
 //BA.debugLineNum = 25;BA.debugLine="Dim txtFirstName As VMTextField = vm.CreateTextFi";
_txtfirstname = _vm._createtextfield /*b4j.example.vmtextfield*/ ("firstname",modform.getObject())._setvmodel /*b4j.example.vmtextfield*/ ("firstname")._setcounter /*b4j.example.vmtextfield*/ (BA.ObjectToBoolean("10"))._setlabel /*b4j.example.vmtextfield*/ ("First Name")._setrequired /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 26;BA.debugLine="frmUser.Container.AddComponent(1,1, txtFirstName.";
_frmuser._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_txtfirstname._tostring /*String*/ ());
 //BA.debugLineNum = 28;BA.debugLine="Dim txtLastName As VMTextField = vm.CreateTextFie";
_txtlastname = _vm._createtextfield /*b4j.example.vmtextfield*/ ("lastname",modform.getObject())._setvmodel /*b4j.example.vmtextfield*/ ("lastname")._setcounter /*b4j.example.vmtextfield*/ (BA.ObjectToBoolean("10"))._setlabel /*b4j.example.vmtextfield*/ ("Last Name")._setrequired /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 29;BA.debugLine="frmUser.Container.AddComponent(1,2, txtLastName.T";
_frmuser._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (2),_txtlastname._tostring /*String*/ ());
 //BA.debugLineNum = 31;BA.debugLine="Dim txtEmail As VMTextField = vm.CreateTextField(";
_txtemail = _vm._createtextfield /*b4j.example.vmtextfield*/ ("email",modform.getObject())._setvmodel /*b4j.example.vmtextfield*/ ("email")._setlabel /*b4j.example.vmtextfield*/ ("E-mail")._setrequired /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 32;BA.debugLine="frmUser.Container.AddComponent(1,3, txtEmail.ToSt";
_frmuser._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (3),_txtemail._tostring /*String*/ ());
 //BA.debugLineNum = 34;BA.debugLine="Dim selItems As VMSelect = vm.CreateSelect(\"item\"";
_selitems = _vm._createselect /*b4j.example.vmselect*/ ("item",modform.getObject())._setvmodel /*b4j.example.vmselect*/ ("select")._setlabel /*b4j.example.vmselect*/ ("Item")._setrequired /*b4j.example.vmselect*/ (anywheresoftware.b4a.keywords.Common.True)._setitems /*b4j.example.vmselect*/ ("items");
 //BA.debugLineNum = 35;BA.debugLine="frmUser.Container.AddComponent(2,1, selItems.ToSt";
_frmuser._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (2),(int) (1),_selitems._tostring /*String*/ ());
 //BA.debugLineNum = 37;BA.debugLine="Dim chk As VMCheckBox = vm.CreateCheckBox(\"chkAgr";
_chk = _vm._createcheckbox /*b4j.example.vmcheckbox*/ ("chkAgree",modform.getObject())._setvmodel /*b4j.example.vmcheckbox*/ ("checkbox")._setlabel /*b4j.example.vmcheckbox*/ ("Do you agree?")._setrequired /*b4j.example.vmcheckbox*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 38;BA.debugLine="frmUser.Container.AddComponent(2,2, chk.ToString)";
_frmuser._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (2),(int) (2),_chk._tostring /*String*/ ());
 //BA.debugLineNum = 40;BA.debugLine="Dim txtLoad As VMTextField = vm.CreateTextField(\"";
_txtload = _vm._createtextfield /*b4j.example.vmtextfield*/ ("txtload",modform.getObject())._setcolor /*b4j.example.vmtextfield*/ ("success")._setloading /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setdisabled /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 41;BA.debugLine="frmUser.Container.AddComponent(2,3, txtLoad.ToStr";
_frmuser._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (2),(int) (3),_txtload._tostring /*String*/ ());
 //BA.debugLineNum = 43;BA.debugLine="cont.AddComponent(1, 1, frmUser.ToString)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_frmuser._tostring /*String*/ ());
 //BA.debugLineNum = 46;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"formCode\"";
_name = "formCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Form\"";
_title = "Form";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private frmUser As VMForm";
_frmuser = new b4j.example.vmform();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
