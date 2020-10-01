package b4j.example;


import anywheresoftware.b4a.BA;

public class modmessageboard extends Object{
public static modmessageboard mostCurrent = new modmessageboard();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modmessageboard", null);
		ba.loadHtSubs(modmessageboard.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modmessageboard", ba);
		}
	}
    public static Class<?> getObject() {
		return modmessageboard.class;
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
b4j.example.vmcard _mb = null;
b4j.example.vmlist _messages = null;
 //BA.debugLineNum = 9;BA.debugLine="Sub Code";
 //BA.debugLineNum = 10;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modmessageboard.getObject());
 //BA.debugLineNum = 14;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 15;BA.debugLine="cont.AddRows(1).AddColumns(1, 12, 8, 6, 6)";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (1))._addcolumns /*b4j.example.vmcontainer*/ ((int) (1),(int) (12),(int) (8),(int) (6),(int) (6));
 //BA.debugLineNum = 17;BA.debugLine="cont.SetJustifyRC(1, 0, vm.JUSTIFY_CENTER)";
_cont._setjustifyrc /*b4j.example.vmcontainer*/ ((int) (1),(int) (0),_vm._justify_center /*String*/ );
 //BA.debugLineNum = 19;BA.debugLine="Dim mb As VMCard = vm.createcard(\"mb\", Me)";
_mb = _vm._createcard /*b4j.example.vmcard*/ ("mb",modmessageboard.getObject());
 //BA.debugLineNum = 20;BA.debugLine="mb.Toolbar.SetColorIntensity(vm.COLOR_ORANGE, vm.";
_mb._toolbar /*b4j.example.vmtoolbar*/ ._setcolorintensity /*b4j.example.vmtoolbar*/ (_vm._color_orange /*String*/ ,_vm._intensity_lighten1 /*String*/ )._setdark /*b4j.example.vmtoolbar*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 21;BA.debugLine="mb.ToolBar.AddHamburger";
_mb._toolbar /*b4j.example.vmtoolbar*/ ._addhamburger /*b4j.example.vmtoolbar*/ ();
 //BA.debugLineNum = 22;BA.debugLine="mb.ToolBar.AddTitle(\"Message Board\", \"\")";
_mb._toolbar /*b4j.example.vmtoolbar*/ ._addtitle /*b4j.example.vmtoolbar*/ ("Message Board","");
 //BA.debugLineNum = 23;BA.debugLine="mb.ToolBar.AddSpacer";
_mb._toolbar /*b4j.example.vmtoolbar*/ ._addspacer /*b4j.example.vmtoolbar*/ ();
 //BA.debugLineNum = 24;BA.debugLine="mb.ToolBar.AddIcon(\"btnMagnify\", \"mdi-magnify\", \"";
_mb._toolbar /*b4j.example.vmtoolbar*/ ._addicon /*b4j.example.vmtoolbar*/ ("btnMagnify","mdi-magnify","","");
 //BA.debugLineNum = 26;BA.debugLine="Dim messages As VMList = vm.CreateList(\"messages\"";
_messages = _vm._createlist /*b4j.example.vmlist*/ ("messages",modmessageboard.getObject())._settwoline /*b4j.example.vmlist*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 27;BA.debugLine="messages.AddItemJSON($\"{ \"header\": \"Today\"}\"$)";
_messages._additemjson /*b4j.example.vmlist*/ (("{ \"header\": \"Today\"}"));
 //BA.debugLineNum = 28;BA.debugLine="messages.AddItemJSON($\"{ \"divider\": true }\"$)";
_messages._additemjson /*b4j.example.vmlist*/ (("{ \"divider\": true }"));
 //BA.debugLineNum = 29;BA.debugLine="messages.AddItem(\"\", \"https://picsum.photos/250/3";
_messages._additem /*b4j.example.vmlist*/ ("","https://picsum.photos/250/300?image=660","","Meeting @ Noon","Spike Lee - I'll be in your neighborhood","");
 //BA.debugLineNum = 32;BA.debugLine="mb.AddStuff(messages.tostring)";
_mb._addstuff /*b4j.example.vmcard*/ (_messages._tostring /*String*/ ());
 //BA.debugLineNum = 34;BA.debugLine="cont.AddComponent(1, 1, mb.tostring)";
_cont._addcomponent /*String*/ ((int) (1),(int) (1),_mb._tostring /*String*/ ());
 //BA.debugLineNum = 36;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"messageBoardCode\"";
_name = "messageBoardCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Message Board\"";
_title = "Message Board";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
