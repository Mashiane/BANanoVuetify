package b4j.example;


import anywheresoftware.b4a.BA;

public class modbuttons extends Object{
public static modbuttons mostCurrent = new modbuttons();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modbuttons", null);
		ba.loadHtSubs(modbuttons.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modbuttons", ba);
		}
	}
    public static Class<?> getObject() {
		return modbuttons.class;
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
public static String  _addit_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub addit_click(e As BANanoEvent)";
 //BA.debugLineNum = 352;BA.debugLine="vm.ShowSnackBar(\"Add It!\")";
_vm._showsnackbar /*String*/ ("Add It!");
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return "";
}
public static String  _btn4_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub btn4_click(e As BANanoEvent)";
 //BA.debugLineNum = 343;BA.debugLine="vm.ShowConfirm(\"delete_user\", \"Confirm Delete\", \"";
_vm._showconfirm /*String*/ ("delete_user","Confirm Delete","Are you sure you want to delete this user?","Yes","No");
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return "";
}
public static String  _btnaccent_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub btnAccent_click(e As BANanoEvent)";
 //BA.debugLineNum = 335;BA.debugLine="vm.ShowSnackBAr(\"clicked accent\")";
_vm._showsnackbar /*String*/ ("clicked accent");
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return "";
}
public static String  _btnbuttonclickcopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub btnButtonClickcopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 200;BA.debugLine="vue.CopyCode2Clipboard(\"btnSpeedDialClick\")";
_vue._copycode2clipboard /*String*/ ("btnSpeedDialClick");
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public static String  _btnbuttonclickdownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub btnButtonClickdownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 204;BA.debugLine="vue.DownloadCode(\"btnSpeedDialClick\", \"btnSpeedDi";
_vue._downloadcode /*String*/ ("btnSpeedDialClick","btnSpeedDialClick.txt");
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public static String  _btnprimary_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub btnPrimary_click(e As BANanoEvent)";
 //BA.debugLineNum = 339;BA.debugLine="vm.ShowAlert(\"did_it\", \"TheMash\", \"This is my fir";
_vm._showalert /*String*/ ("did_it","TheMash","This is my first alert!","Cool");
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return "";
}
public static String  _btnspeeddialclickcopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub btnSpeedDialClickcopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 191;BA.debugLine="vue.CopyCode2Clipboard(\"btnSpeedDialClick\")";
_vue._copycode2clipboard /*String*/ ("btnSpeedDialClick");
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public static String  _btnspeeddialclickdownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub btnSpeedDialClickdownload_click(e As BANanoEve";
 //BA.debugLineNum = 195;BA.debugLine="vue.DownloadCode(\"btnSpeedDialClick\", \"btnSpeedDi";
_vue._downloadcode /*String*/ ("btnSpeedDialClick","btnSpeedDialClick.txt");
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public static String  _btnspeeddialcodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub btnSpeedDialCodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 209;BA.debugLine="vue.CopyCode2Clipboard(\"btnSpeedDialCode\")";
_vue._copycode2clipboard /*String*/ ("btnSpeedDialCode");
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public static String  _btnspeeddialcodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub btnSpeedDialCodedownload_click(e As BANanoEven";
 //BA.debugLineNum = 213;BA.debugLine="vue.DownloadCode(\"btnSpeedDialCode\", \"btnSpeedDia";
_vue._downloadcode /*String*/ ("btnSpeedDialCode","btnSpeedDialCode.txt");
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public static String  _btntogglecodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub btnToggleCodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 228;BA.debugLine="vue.CopyCode2Clipboard(\"btnToggleCode\")";
_vue._copycode2clipboard /*String*/ ("btnToggleCode");
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return "";
}
public static String  _btntogglecodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub btnToggleCodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 232;BA.debugLine="vue.DownloadCode(\"btnToggleCode\", \"btnToggleCode.";
_vue._downloadcode /*String*/ ("btnToggleCode","btnToggleCode.txt");
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return "";
}
public static String  _btntogglecodemcopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub btnToggleCodeMcopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 218;BA.debugLine="vue.CopyCode2Clipboard(\"btnToggleCodeM\")";
_vue._copycode2clipboard /*String*/ ("btnToggleCodeM");
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public static String  _btntogglecodemdownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub btnToggleCodeMdownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 222;BA.debugLine="vue.DownloadCode(\"btnToggleCodeM\", \"btnToggleCode";
_vue._downloadcode /*String*/ ("btnToggleCodeM","btnToggleCodeM.txt");
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode1copy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub buttoncode1copy_click(e As BANanoEvent)";
 //BA.debugLineNum = 245;BA.debugLine="vue.CopyCode2Clipboard(\"buttoncode1\")";
_vue._copycode2clipboard /*String*/ ("buttoncode1");
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode1download_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub buttoncode1download_click(e As BANanoEvent)";
 //BA.debugLineNum = 249;BA.debugLine="vue.DownloadCode(\"buttoncode1\", \"buttoncode1.txt\"";
_vue._downloadcode /*String*/ ("buttoncode1","buttoncode1.txt");
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode2copy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub buttoncode2copy_click(e As BANanoEvent)";
 //BA.debugLineNum = 253;BA.debugLine="vue.CopyCode2Clipboard(\"buttoncode2\")";
_vue._copycode2clipboard /*String*/ ("buttoncode2");
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode2download_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub buttoncode2download_click(e As BANanoEvent)";
 //BA.debugLineNum = 257;BA.debugLine="vue.DownloadCode(\"buttoncode2\", \"buttoncode2.txt\"";
_vue._downloadcode /*String*/ ("buttoncode2","buttoncode2.txt");
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode3copy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub buttoncode3copy_click(e As BANanoEvent)";
 //BA.debugLineNum = 261;BA.debugLine="vue.CopyCode2Clipboard(\"buttoncode3\")";
_vue._copycode2clipboard /*String*/ ("buttoncode3");
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode3download_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub buttoncode3download_click(e As BANanoEvent)";
 //BA.debugLineNum = 265;BA.debugLine="vue.DownloadCode(\"buttoncode3\", \"buttoncode3.txt\"";
_vue._downloadcode /*String*/ ("buttoncode3","buttoncode3.txt");
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode4copy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub buttoncode4copy_click(e As BANanoEvent)";
 //BA.debugLineNum = 269;BA.debugLine="vue.CopyCode2Clipboard(\"buttoncode4\")";
_vue._copycode2clipboard /*String*/ ("buttoncode4");
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode4download_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub buttoncode4download_click(e As BANanoEvent)";
 //BA.debugLineNum = 273;BA.debugLine="vue.DownloadCode(\"buttoncode4\", \"buttoncode4.txt\"";
_vue._downloadcode /*String*/ ("buttoncode4","buttoncode4.txt");
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode5copy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub buttoncode5copy_click(e As BANanoEvent)";
 //BA.debugLineNum = 277;BA.debugLine="vue.CopyCode2Clipboard(\"buttoncode5\")";
_vue._copycode2clipboard /*String*/ ("buttoncode5");
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode5download_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub buttoncode5download_click(e As BANanoEvent)";
 //BA.debugLineNum = 281;BA.debugLine="vue.DownloadCode(\"buttoncode5\", \"buttoncode5.txt\"";
_vue._downloadcode /*String*/ ("buttoncode5","buttoncode5.txt");
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode6copy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub buttoncode6copy_click(e As BANanoEvent)";
 //BA.debugLineNum = 285;BA.debugLine="vue.CopyCode2Clipboard(\"buttoncode6\")";
_vue._copycode2clipboard /*String*/ ("buttoncode6");
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode6download_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub buttoncode6download_click(e As BANanoEvent)";
 //BA.debugLineNum = 289;BA.debugLine="vue.DownloadCode(\"buttoncode6\", \"buttoncode6.txt\"";
_vue._downloadcode /*String*/ ("buttoncode6","buttoncode6.txt");
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode7copy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub buttoncode7copy_click(e As BANanoEvent)";
 //BA.debugLineNum = 293;BA.debugLine="vue.CopyCode2Clipboard(\"buttoncode7\")";
_vue._copycode2clipboard /*String*/ ("buttoncode7");
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode7download_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub buttoncode7download_click(e As BANanoEvent)";
 //BA.debugLineNum = 297;BA.debugLine="vue.DownloadCode(\"buttoncode7\", \"buttoncode7.txt\"";
_vue._downloadcode /*String*/ ("buttoncode7","buttoncode7.txt");
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode8copy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub buttoncode8copy_click(e As BANanoEvent)";
 //BA.debugLineNum = 301;BA.debugLine="vue.CopyCode2Clipboard(\"buttoncode8\")";
_vue._copycode2clipboard /*String*/ ("buttoncode8");
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncode8download_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub buttoncode8download_click(e As BANanoEvent)";
 //BA.debugLineNum = 305;BA.debugLine="vue.DownloadCode(\"buttoncode8\", \"buttoncode8.txt\"";
_vue._downloadcode /*String*/ ("buttoncode8","buttoncode8.txt");
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub buttoncodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 237;BA.debugLine="vue.CopyCode2Clipboard(\"buttoncode\")";
_vue._copycode2clipboard /*String*/ ("buttoncode");
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub buttoncodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 241;BA.debugLine="vue.DownloadCode(\"buttoncode\", \"buttoncode.txt\")";
_vue._downloadcode /*String*/ ("buttoncode","buttoncode.txt");
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmbuttontoggle _btntoggle = null;
b4j.example.vmbuttontoggle _btntogglem = null;
anywheresoftware.b4a.objects.collections.List _nl = null;
b4j.example.vmspeeddial _sp1 = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modbuttons.getObject());
 //BA.debugLineNum = 16;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 18;BA.debugLine="cont.AddRows(20).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (20))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="vm.CreateButton(\"btn4\", Me).SetLabel(\"Confirm\").U";
_vm._createbutton /*b4j.example.vmbutton*/ ("btn4",modbuttons.getObject())._setlabel /*b4j.example.vmbutton*/ ("Confirm")._usetheme /*b4j.example.vmbutton*/ ("red-l-2")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 21;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 22;BA.debugLine="vue.AddCode($\"vm.CreateButton(\"btn4\", Me).SetLabe";
_vue._addcode /*String*/ (("vm.CreateButton(\"btn4\", Me).SetLabel(\"Confirm\").UseTheme(\"red-l-2\").AddToContainer(cont, 1, 1)"));
 //BA.debugLineNum = 23;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"buttoncode\", \"Butt";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"buttoncode","Buttons",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="vm.CreateButton(\"btnPrimary\", Me).SetLabel(\"Alert";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnPrimary",modbuttons.getObject())._setlabel /*b4j.example.vmbutton*/ ("Alert")._setprimary /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 26;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="vue.AddCode($\"vm.CreateButton(\"btnPrimary\", Me).S";
_vue._addcode /*String*/ (("vm.CreateButton(\"btnPrimary\", Me).SetLabel(\"Alert\").SetPrimary(True).AddToContainer(cont, 2, 1)"));
 //BA.debugLineNum = 28;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"buttoncode1\", \"But";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"buttoncode1","Buttons",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="vm.CreateButton(\"btnAccent\", Me).SetLabel(\"Accent";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnAccent",modbuttons.getObject())._setlabel /*b4j.example.vmbutton*/ ("Accent")._setaccent /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 31;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 32;BA.debugLine="vue.AddCode($\"vm.CreateButton(\"btnAccent\", Me).Se";
_vue._addcode /*String*/ (("vm.CreateButton(\"btnAccent\", Me).SetLabel(\"Accent\").SetAccent(True).AddToContainer(cont, 3, 1)"));
 //BA.debugLineNum = 33;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"buttoncode2\", \"But";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"buttoncode2","Buttons",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 35;BA.debugLine="vm.CreateIconButton(\"btnx\", Me, \"mdi-heart\").SetC";
_vm._createiconbutton /*b4j.example.vmbutton*/ ("btnx",modbuttons.getObject(),"mdi-heart")._setcolor /*b4j.example.vmbutton*/ ("pink")._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 36;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 37;BA.debugLine="vue.AddCode($\"vm.CreateIconButton(\"btnx\", Me, \"md";
_vue._addcode /*String*/ (("vm.CreateIconButton(\"btnx\", Me, \"mdi-heart\").SetColor(\"pink\").AddToContainer(cont, 4, 1)"));
 //BA.debugLineNum = 38;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"buttoncode3\", \"But";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"buttoncode3","Buttons",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 40;BA.debugLine="vm.CreateFABButton(\"fab1\", Me, \"mdi-plus\").SetCol";
_vm._createfabbutton /*b4j.example.vmbutton*/ ("fab1",modbuttons.getObject(),"mdi-plus")._setcolor /*b4j.example.vmbutton*/ ("indigo")._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 41;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"vm.CreateFABButton(\"fab1\", Me, \"mdi";
_vue._addcode /*String*/ (("vm.CreateFABButton(\"fab1\", Me, \"mdi-plus\").SetColor(\"indigo\").AddToContainer(cont, 5, 1)"));
 //BA.debugLineNum = 43;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"buttoncode4\", \"But";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"buttoncode4","Buttons",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 45;BA.debugLine="vm.CreateFABButton(\"fab2\", Me, \"mdi-pencil\").SetO";
_vm._createfabbutton /*b4j.example.vmbutton*/ ("fab2",modbuttons.getObject(),"mdi-pencil")._setoutlined /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setlarge /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setcolor /*b4j.example.vmbutton*/ ("teal")._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 46;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 47;BA.debugLine="vue.AddCode($\"vm.CreateFABButton(\"fab2\", Me, \"mdi";
_vue._addcode /*String*/ (("vm.CreateFABButton(\"fab2\", Me, \"mdi-pencil\").SetOutlined(True).SetLarge(True).SetColor(\"teal\").AddToContainer(cont, 6, 1)"));
 //BA.debugLineNum = 48;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"buttoncode5\", \"But";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"buttoncode5","Buttons",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 50;BA.debugLine="vm.CreateButton(\"tilex\", Me).SetLabel(\"Tile Butto";
_vm._createbutton /*b4j.example.vmbutton*/ ("tilex",modbuttons.getObject())._setlabel /*b4j.example.vmbutton*/ ("Tile Button")._settile /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setcolor /*b4j.example.vmbutton*/ ("orange")._addtocontainer /*String*/ (_cont,(int) (7),(int) (1));
 //BA.debugLineNum = 51;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"vm.CreateButton(\"tilex\", Me).SetLab";
_vue._addcode /*String*/ (("vm.CreateButton(\"tilex\", Me).SetLabel(\"Tile Button\").SetTile(True).SetColor(\"orange\").AddToContainer(cont, 7, 1)"));
 //BA.debugLineNum = 53;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"buttoncode6\", \"But";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"buttoncode6","Buttons",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (7),(int) (1));
 //BA.debugLineNum = 55;BA.debugLine="vm.CreateButton(\"blockx\", Me).SetLabel(\"Block But";
_vm._createbutton /*b4j.example.vmbutton*/ ("blockx",modbuttons.getObject())._setlabel /*b4j.example.vmbutton*/ ("Block Button")._setblock /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setcolor /*b4j.example.vmbutton*/ ("green")._addtocontainer /*String*/ (_cont,(int) (8),(int) (1));
 //BA.debugLineNum = 56;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 57;BA.debugLine="vue.AddCode($\"vm.CreateButton(\"blockx\", Me).SetLa";
_vue._addcode /*String*/ (("vm.CreateButton(\"blockx\", Me).SetLabel(\"Block Button\").SetBlock(True).SetColor(\"green\").AddToContainer(cont, 8, 1)"));
 //BA.debugLineNum = 58;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"buttoncode7\", \"But";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"buttoncode7","Buttons",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (8),(int) (1));
 //BA.debugLineNum = 60;BA.debugLine="vm.CreateButton(\"roundx\", Me).SetLabel(\"Round But";
_vm._createbutton /*b4j.example.vmbutton*/ ("roundx",modbuttons.getObject())._setlabel /*b4j.example.vmbutton*/ ("Round Button")._setrounded /*b4j.example.vmbutton*/ (anywheresoftware.b4a.keywords.Common.True)._setcolor /*b4j.example.vmbutton*/ ("yellow")._addtocontainer /*String*/ (_cont,(int) (9),(int) (1));
 //BA.debugLineNum = 61;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 62;BA.debugLine="vue.AddCode($\"vm.CreateButton(\"roundx\", Me).SetLa";
_vue._addcode /*String*/ (("vm.CreateButton(\"roundx\", Me).SetLabel(\"Round Button\").SetRounded(True).SetColor(\"yellow\").AddToContainer(cont, 9, 1)"));
 //BA.debugLineNum = 63;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"buttoncode8\", \"But";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"buttoncode8","Buttons",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (9),(int) (1));
 //BA.debugLineNum = 66;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 67;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 68;BA.debugLine="vue.AddCode($\"Sub edit_click(e As BANanoEvent)\"$)";
_vue._addcode /*String*/ (("Sub edit_click(e As BANanoEvent)"));
 //BA.debugLineNum = 69;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Edit!\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Edit!\")"));
 //BA.debugLineNum = 70;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 71;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 72;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 73;BA.debugLine="vue.AddCode($\"Sub addit_click(e As BANanoEvent)\"$";
_vue._addcode /*String*/ (("Sub addit_click(e As BANanoEvent)"));
 //BA.debugLineNum = 74;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Add It!\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Add It!\")"));
 //BA.debugLineNum = 75;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 76;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 77;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 78;BA.debugLine="vue.AddCode($\"Sub deleteit_click(e As BANanoEvent";
_vue._addcode /*String*/ (("Sub deleteit_click(e As BANanoEvent)"));
 //BA.debugLineNum = 79;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Delete It!\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Delete It!\")"));
 //BA.debugLineNum = 80;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 81;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"btnButtonClick\", \"";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"btnButtonClick","Button Clicks",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (10),(int) (1));
 //BA.debugLineNum = 84;BA.debugLine="Dim btnToggle As VMButtonToggle = vm.CreateButton";
_btntoggle = _vm._createbuttontoggle /*b4j.example.vmbuttontoggle*/ ("btnToggle",modbuttons.getObject());
 //BA.debugLineNum = 85;BA.debugLine="btnToggle.setvmodel(\"toggleexclusive\")";
_btntoggle._setvmodel /*b4j.example.vmbuttontoggle*/ ("toggleexclusive");
 //BA.debugLineNum = 86;BA.debugLine="vm.setdata(\"toggleexclusive\", 2)";
_vm._setdata /*b4j.example.bananovm*/ ("toggleexclusive",(Object)(2));
 //BA.debugLineNum = 87;BA.debugLine="btnToggle.AddIcon(\"al\", \"mdi-format-align-left\",";
_btntoggle._addicon /*String*/ ("al","mdi-format-align-left","","","Align left");
 //BA.debugLineNum = 88;BA.debugLine="btnToggle.AddIcon(\"ac\", \"mdi-format-align-center\"";
_btntoggle._addicon /*String*/ ("ac","mdi-format-align-center","","","Align center");
 //BA.debugLineNum = 89;BA.debugLine="btnToggle.AddIcon(\"ar\", \"mdi-format-align-right\",";
_btntoggle._addicon /*String*/ ("ar","mdi-format-align-right","","","Align right");
 //BA.debugLineNum = 90;BA.debugLine="btnToggle.AddIcon(\"aj\", \"mdi-format-align-justify";
_btntoggle._addicon /*String*/ ("aj","mdi-format-align-justify","","","Align justify");
 //BA.debugLineNum = 91;BA.debugLine="btnToggle.AddToContainer(cont, 11,1)";
_btntoggle._addtocontainer /*String*/ (_cont,(int) (11),(int) (1));
 //BA.debugLineNum = 93;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 94;BA.debugLine="vue.AddCode($\"'single selection\"$)";
_vue._addcode /*String*/ (("'single selection"));
 //BA.debugLineNum = 95;BA.debugLine="vue.AddCode($\"Dim btnToggle As VMButtonToggle = v";
_vue._addcode /*String*/ (("Dim btnToggle As VMButtonToggle = vm.CreateButtonToggle(\"btnToggle\", Me)"));
 //BA.debugLineNum = 96;BA.debugLine="vue.AddCode($\"btnToggle.setvmodel(\"toggleexclusiv";
_vue._addcode /*String*/ (("btnToggle.setvmodel(\"toggleexclusive\")"));
 //BA.debugLineNum = 97;BA.debugLine="vue.AddCode($\"vm.setdata(\"toggleexclusive\", 2)\"$)";
_vue._addcode /*String*/ (("vm.setdata(\"toggleexclusive\", 2)"));
 //BA.debugLineNum = 98;BA.debugLine="vue.AddCode($\"btnToggle.AddIcon(\"al\", \"mdi-format";
_vue._addcode /*String*/ (("btnToggle.AddIcon(\"al\", \"mdi-format-align-left\", \"\", \"\", \"Align left\")"));
 //BA.debugLineNum = 99;BA.debugLine="vue.AddCode($\"btnToggle.AddIcon(\"ac\", \"mdi-format";
_vue._addcode /*String*/ (("btnToggle.AddIcon(\"ac\", \"mdi-format-align-center\",\"\",\"\", \"Align center\")"));
 //BA.debugLineNum = 100;BA.debugLine="vue.AddCode($\"btnToggle.AddIcon(\"ar\", \"mdi-format";
_vue._addcode /*String*/ (("btnToggle.AddIcon(\"ar\", \"mdi-format-align-right\", \"\", \"\", \"Align right\")"));
 //BA.debugLineNum = 101;BA.debugLine="vue.AddCode($\"btnToggle.AddIcon(\"aj\", \"mdi-format";
_vue._addcode /*String*/ (("btnToggle.AddIcon(\"aj\", \"mdi-format-align-justify\",\"\",\"\", \"Align justify\")"));
 //BA.debugLineNum = 102;BA.debugLine="vue.AddCode($\"btnToggle.AddToContainer(cont, 10,1";
_vue._addcode /*String*/ (("btnToggle.AddToContainer(cont, 10,1)"));
 //BA.debugLineNum = 103;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"btnToggleCode\", \"T";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"btnToggleCode","Toggle",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (11),(int) (1));
 //BA.debugLineNum = 106;BA.debugLine="Dim btnToggleM As VMButtonToggle = vm.CreateButto";
_btntogglem = _vm._createbuttontoggle /*b4j.example.vmbuttontoggle*/ ("btnToggleM",modbuttons.getObject());
 //BA.debugLineNum = 107;BA.debugLine="btnToggleM.SetMultiple(True)";
_btntogglem._setmultiple /*b4j.example.vmbuttontoggle*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 108;BA.debugLine="btnToggleM.SetShaped(True)";
_btntogglem._setshaped /*b4j.example.vmbuttontoggle*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 109;BA.debugLine="btnToggleM.setvmodel(\"togglemultiple\")";
_btntogglem._setvmodel /*b4j.example.vmbuttontoggle*/ ("togglemultiple");
 //BA.debugLineNum = 110;BA.debugLine="Dim nl As List = vm.CreateB4xList(Array(0,1,2))";
_nl = new anywheresoftware.b4a.objects.collections.List();
_nl = _vm._createb4xlist /*anywheresoftware.b4a.objects.collections.List*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0),(Object)(1),(Object)(2)}));
 //BA.debugLineNum = 111;BA.debugLine="vm.setdata(\"togglemultiple\", nl)";
_vm._setdata /*b4j.example.bananovm*/ ("togglemultiple",(Object)(_nl.getObject()));
 //BA.debugLineNum = 112;BA.debugLine="btnToggleM.AddIcon(\"al\", \"mdi-format-bold\", \"\", \"";
_btntogglem._addicon /*String*/ ("al","mdi-format-bold","","","Bold");
 //BA.debugLineNum = 113;BA.debugLine="btnToggleM.AddIcon(\"ac\", \"mdi-format-italic\",\"\",\"";
_btntogglem._addicon /*String*/ ("ac","mdi-format-italic","","","Italic");
 //BA.debugLineNum = 114;BA.debugLine="btnToggleM.AddIcon(\"ar\", \"mdi-format-underline\",";
_btntogglem._addicon /*String*/ ("ar","mdi-format-underline","","","Underline");
 //BA.debugLineNum = 115;BA.debugLine="btnToggleM.AddIcon(\"aj\", \"mdi-format-color-fill\",";
_btntogglem._addicon /*String*/ ("aj","mdi-format-color-fill","","","Color Fill");
 //BA.debugLineNum = 116;BA.debugLine="btnToggleM.AddToContainer(cont, 12,1)";
_btntogglem._addtocontainer /*String*/ (_cont,(int) (12),(int) (1));
 //BA.debugLineNum = 119;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 120;BA.debugLine="vue.AddCode($\"'multiple selection\"$)";
_vue._addcode /*String*/ (("'multiple selection"));
 //BA.debugLineNum = 121;BA.debugLine="vue.AddCode($\"Dim btnToggleM As VMButtonToggle = v";
_vue._addcode /*String*/ (("Dim btnToggleM As VMButtonToggle = vm.CreateButtonToggle(\"btnToggleM\", Me)"));
 //BA.debugLineNum = 122;BA.debugLine="vue.AddCode($\"btnToggleM.SetMultiple(True)\"$)";
_vue._addcode /*String*/ (("btnToggleM.SetMultiple(True)"));
 //BA.debugLineNum = 123;BA.debugLine="vue.AddCode($\"btnToggleM.SetShaped(True)\"$)";
_vue._addcode /*String*/ (("btnToggleM.SetShaped(True)"));
 //BA.debugLineNum = 124;BA.debugLine="vue.AddCode($\"btnToggleM.setvmodel(\"togglemultiple";
_vue._addcode /*String*/ (("btnToggleM.setvmodel(\"togglemultiple\")"));
 //BA.debugLineNum = 125;BA.debugLine="vue.AddCode($\"Dim nl As List = vm.CreateB4xList(Ar";
_vue._addcode /*String*/ (("Dim nl As List = vm.CreateB4xList(Array(0,1,2))"));
 //BA.debugLineNum = 126;BA.debugLine="vue.AddCode($\"vm.setdata(\"togglemultiple\", nl)\"$)";
_vue._addcode /*String*/ (("vm.setdata(\"togglemultiple\", nl)"));
 //BA.debugLineNum = 127;BA.debugLine="vue.AddCode($\"btnToggleM.AddIcon(\"al\", \"mdi-format";
_vue._addcode /*String*/ (("btnToggleM.AddIcon(\"al\", \"mdi-format-bold\", \"\", \"\", \"Bold\")"));
 //BA.debugLineNum = 128;BA.debugLine="vue.AddCode($\"btnToggleM.AddIcon(\"ac\", \"mdi-format";
_vue._addcode /*String*/ (("btnToggleM.AddIcon(\"ac\", \"mdi-format-italic\",\"\",\"\", \"Italic\")"));
 //BA.debugLineNum = 129;BA.debugLine="vue.AddCode($\"btnToggleM.AddIcon(\"ar\", \"mdi-format";
_vue._addcode /*String*/ (("btnToggleM.AddIcon(\"ar\", \"mdi-format-underline\", \"\", \"\", \"Underline\")"));
 //BA.debugLineNum = 130;BA.debugLine="vue.AddCode($\"btnToggleM.AddIcon(\"aj\", \"mdi-format";
_vue._addcode /*String*/ (("btnToggleM.AddIcon(\"aj\", \"mdi-format-color-fill\",\"\",\"\", \"Color Fill\")"));
 //BA.debugLineNum = 131;BA.debugLine="vue.AddCode($\"btnToggleM.AddToContainer(cont, 11,1";
_vue._addcode /*String*/ (("btnToggleM.AddToContainer(cont, 11,1)"));
 //BA.debugLineNum = 132;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"btnToggleCodeM\", \"T";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"btnToggleCodeM","Toggle Multiple",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (12),(int) (1));
 //BA.debugLineNum = 134;BA.debugLine="Dim sp1 As VMSpeedDial = vm.CreateSpeedDial(\"sp1\"";
_sp1 = _vm._createspeeddial /*b4j.example.vmspeeddial*/ ("sp1",modbuttons.getObject(),"mdi-account-circle","mdi-close");
 //BA.debugLineNum = 135;BA.debugLine="sp1.SetColorIntensity(vm.COLOR_BLUE, vm.INTENSITY";
_sp1._setcolorintensity /*b4j.example.vmspeeddial*/ (_vm._color_blue /*String*/ ,_vm._intensity_darken2 /*String*/ );
 //BA.debugLineNum = 136;BA.debugLine="sp1.SetDark(True)";
_sp1._setdark /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 137;BA.debugLine="sp1.SetAbsolute(True)";
_sp1._setabsolute /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 138;BA.debugLine="sp1.SetBottom(True)";
_sp1._setbottom /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 139;BA.debugLine="sp1.SetRight(True)";
_sp1._setright /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 140;BA.debugLine="sp1.SetOpenOnHover(True)";
_sp1._setopenonhover /*b4j.example.vmspeeddial*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 141;BA.debugLine="sp1.AddItem(\"speededit\", \"mdi-pencil\", \"green\")";
_sp1._additem /*b4j.example.vmspeeddial*/ ("speededit","mdi-pencil","green");
 //BA.debugLineNum = 142;BA.debugLine="sp1.AddItem(\"speedaddit\", \"mdi-plus\", \"indigo\")";
_sp1._additem /*b4j.example.vmspeeddial*/ ("speedaddit","mdi-plus","indigo");
 //BA.debugLineNum = 143;BA.debugLine="sp1.AddItem(\"speeddeleteit\", \"mdi-delete\", \"red\")";
_sp1._additem /*b4j.example.vmspeeddial*/ ("speeddeleteit","mdi-delete","red");
 //BA.debugLineNum = 144;BA.debugLine="vm.AddSpeedDial(sp1)";
_vm._addspeeddial /*String*/ (_sp1);
 //BA.debugLineNum = 147;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 148;BA.debugLine="vue.AddCode($\"Dim sp1 As VMSpeedDial = vm.CreateSp";
_vue._addcode /*String*/ (("Dim sp1 As VMSpeedDial = vm.CreateSpeedDial(\"sp1\", Me, \"mdi-account-circle\", \"mdi-close\")"));
 //BA.debugLineNum = 149;BA.debugLine="vue.AddCode($\"sp1.SetColorIntensity(vm.COLOR_BLUE,";
_vue._addcode /*String*/ (("sp1.SetColorIntensity(vm.COLOR_BLUE, vm.INTENSITY_DARKEN2)"));
 //BA.debugLineNum = 150;BA.debugLine="vue.AddCode($\"sp1.SetDark(True)\"$)";
_vue._addcode /*String*/ (("sp1.SetDark(True)"));
 //BA.debugLineNum = 151;BA.debugLine="vue.AddCode($\"sp1.SetAbsolute(True)\"$)";
_vue._addcode /*String*/ (("sp1.SetAbsolute(True)"));
 //BA.debugLineNum = 152;BA.debugLine="vue.AddCode($\"sp1.SetBottom(True)\"$)";
_vue._addcode /*String*/ (("sp1.SetBottom(True)"));
 //BA.debugLineNum = 153;BA.debugLine="vue.AddCode($\"sp1.SetRight(True)\"$)";
_vue._addcode /*String*/ (("sp1.SetRight(True)"));
 //BA.debugLineNum = 154;BA.debugLine="vue.AddCode($\"sp1.SetOpenOnHover(True)\"$)";
_vue._addcode /*String*/ (("sp1.SetOpenOnHover(True)"));
 //BA.debugLineNum = 155;BA.debugLine="vue.AddCode($\"sp1.AddItem(\"speededit\", \"mdi-pencil";
_vue._addcode /*String*/ (("sp1.AddItem(\"speededit\", \"mdi-pencil\", \"green\")"));
 //BA.debugLineNum = 156;BA.debugLine="vue.AddCode($\"sp1.AddItem(\"speedaddit\", \"mdi-plus\"";
_vue._addcode /*String*/ (("sp1.AddItem(\"speedaddit\", \"mdi-plus\", \"indigo\")"));
 //BA.debugLineNum = 157;BA.debugLine="vue.AddCode($\"sp1.AddItem(\"speeddeleteit\", \"mdi-de";
_vue._addcode /*String*/ (("sp1.AddItem(\"speeddeleteit\", \"mdi-delete\", \"red\")"));
 //BA.debugLineNum = 158;BA.debugLine="vue.AddCode($\"vm.AddSpeedDial(sp1)\"$)";
_vue._addcode /*String*/ (("vm.AddSpeedDial(sp1)"));
 //BA.debugLineNum = 159;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 160;BA.debugLine="vue.AddCode($\"'add container to page\"$)";
_vue._addcode /*String*/ (("'add container to page"));
 //BA.debugLineNum = 161;BA.debugLine="vue.AddCode($\"vm.AddContainer(cont)\"$)";
_vue._addcode /*String*/ (("vm.AddContainer(cont)"));
 //BA.debugLineNum = 162;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"btnSpeedDialCode\",";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"btnSpeedDialCode","Speed Dial",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (13),(int) (1));
 //BA.debugLineNum = 165;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 166;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 167;BA.debugLine="vue.AddCode($\"Sub speededit_click(e As BANanoEvent";
_vue._addcode /*String*/ (("Sub speededit_click(e As BANanoEvent)"));
 //BA.debugLineNum = 168;BA.debugLine="vue.AddCode($\"vm.ShowSnackBarSuccess(\"Speed edit\")";
_vue._addcode /*String*/ (("vm.ShowSnackBarSuccess(\"Speed edit\")"));
 //BA.debugLineNum = 169;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 170;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 171;BA.debugLine="vue.AddCode($\"Sub speedaddit_click(e As BANanoEven";
_vue._addcode /*String*/ (("Sub speedaddit_click(e As BANanoEvent)"));
 //BA.debugLineNum = 172;BA.debugLine="vue.AddCode($\"vm.ShowSnackBarSuccess(\"Speed add it";
_vue._addcode /*String*/ (("vm.ShowSnackBarSuccess(\"Speed add it\")"));
 //BA.debugLineNum = 173;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 174;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 175;BA.debugLine="vue.AddCode($\"Sub speeddeleteit_click(e As BANanoE";
_vue._addcode /*String*/ (("Sub speeddeleteit_click(e As BANanoEvent)"));
 //BA.debugLineNum = 176;BA.debugLine="vue.AddCode($\"vm.ShowSnackBarSuccess(\"Speed delete";
_vue._addcode /*String*/ (("vm.ShowSnackBarSuccess(\"Speed delete it\")"));
 //BA.debugLineNum = 177;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 178;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"btnSpeedDialClick\"";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modbuttons.getObject(),"btnSpeedDialClick","Speed Dial Click",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (14),(int) (1));
 //BA.debugLineNum = 182;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public static String  _deleteit_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub deleteit_click(e As BANanoEvent)";
 //BA.debugLineNum = 357;BA.debugLine="vm.ShowSnackBar(\"Delete It!\")";
_vm._showsnackbar /*String*/ ("Delete It!");
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return "";
}
public static String  _edit_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub edit_click(e As BANanoEvent)";
 //BA.debugLineNum = 347;BA.debugLine="vm.ShowSnackBar(\"Edit!\")";
_vm._showsnackbar /*String*/ ("Edit!");
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return "";
}
public static String  _fab1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub fab1_click(e As BANanoEvent)";
 //BA.debugLineNum = 331;BA.debugLine="vm.ShowSnackBAr(\"clicked fab1\")";
_vm._showsnackbar /*String*/ ("clicked fab1");
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return "";
}
public static String  _fab2_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub fab2_click(e As BANanoEvent)";
 //BA.debugLineNum = 327;BA.debugLine="vm.ShowSnackBAr(\"clicked fab2\")";
_vm._showsnackbar /*String*/ ("clicked fab2");
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"buttonsCode\"";
_name = "buttonsCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Buttons\"";
_title = "Buttons";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _speedaddit_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub speedaddit_click(e As BANanoEvent)";
 //BA.debugLineNum = 314;BA.debugLine="vm.ShowSnackBarSuccess(\"Speed add it\")";
_vm._showsnackbarsuccess /*String*/ ("Speed add it");
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public static String  _speeddeleteit_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub speeddeleteit_click(e As BANanoEvent)";
 //BA.debugLineNum = 318;BA.debugLine="vm.ShowSnackBarSuccess(\"Speed delete it\")";
_vm._showsnackbarsuccess /*String*/ ("Speed delete it");
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return "";
}
public static String  _speededit_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub speededit_click(e As BANanoEvent)";
 //BA.debugLineNum = 310;BA.debugLine="vm.ShowSnackBarSuccess(\"Speed edit\")";
_vm._showsnackbarsuccess /*String*/ ("Speed edit");
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return "";
}
public static String  _tilex_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub tilex_click(e As BANanoEvent)";
 //BA.debugLineNum = 322;BA.debugLine="vm.ShowSnackBAr(\"clicked Tile\")";
_vm._showsnackbar /*String*/ ("clicked Tile");
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return "";
}
}
