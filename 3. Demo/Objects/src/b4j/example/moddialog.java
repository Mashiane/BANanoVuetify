package b4j.example;


import anywheresoftware.b4a.BA;

public class moddialog extends Object{
public static moddialog mostCurrent = new moddialog();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.moddialog", null);
		ba.loadHtSubs(moddialog.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.moddialog", ba);
		}
	}
    public static Class<?> getObject() {
		return moddialog.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _name = "";
public static String _title = "";
public static b4j.example.bananovm _vm = null;
public static com.ab.banano.BANano _banano = null;
public static b4j.example.bananovue _vue = null;
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moditemgroups _moditemgroups = null;
public static b4j.example.modcalendar _modcalendar = null;
public static b4j.example.modcard _modcard = null;
public static b4j.example.modsparkline _modsparkline = null;
public static b4j.example.modbuttons _modbuttons = null;
public static b4j.example.modchips _modchips = null;
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
public static String  _alertcodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub alertCodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 138;BA.debugLine="vue.CopyCode2Clipboard(\"alertCode\")";
_vue._copycode2clipboard /*String*/ ("alertCode");
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public static String  _alertcodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub alertCodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 142;BA.debugLine="vue.DownloadCode(\"alertCode\", \"alertCode.txt\")";
_vue._downloadcode /*String*/ ("alertCode","alertCode.txt");
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public static String  _btncancelit_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub btnCancelIt_click(e As BANanoEvent)";
 //BA.debugLineNum = 232;BA.debugLine="vm.HideDialog(\"inputdialog\")";
_vm._hidedialog /*String*/ ("inputdialog");
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return "";
}
public static String  _btnconfirm1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub btnConfirm1_click(e As BANanoEvent)";
 //BA.debugLineNum = 165;BA.debugLine="vm.ShowConfirm(\"promptuser\", \"Confirm Vuetify\", \"";
_vm._showconfirm /*String*/ ("promptuser","Confirm Vuetify","Are you sure that you want to use Vuetify?","Yep","Nada");
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public static String  _btndialog_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Sub btnDialog_click(e As BANanoEvent)";
 //BA.debugLineNum = 249;BA.debugLine="vm.ShowDialog(\"diag1\")";
_vm._showdialog /*String*/ ("diag1");
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public static String  _btnhideoverlay_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub btnHideOverlay_click(e As BANanoEvent)";
 //BA.debugLineNum = 236;BA.debugLine="vm.ShowDialog(\"diag3\")";
_vm._showdialog /*String*/ ("diag3");
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public static String  _btninputdialog_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub btnInputDialog_click(e As BANanoEvent)";
 //BA.debugLineNum = 174;BA.debugLine="vm.ShowDialog(\"inputdialog\")";
_vm._showdialog /*String*/ ("inputdialog");
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public static String  _btnok_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub btnok_click(e As BANanoEvent)";
 //BA.debugLineNum = 253;BA.debugLine="vm.hidedialog(\"diag1\")";
_vm._hidedialog /*String*/ ("diag1");
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public static String  _btnok1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub btnOk1_click(e As BANanoEvent)";
 //BA.debugLineNum = 241;BA.debugLine="vm.HideDialog(\"diag2\")";
_vm._hidedialog /*String*/ ("diag2");
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return "";
}
public static String  _btnpersistent_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub btnPersistent_click(e As BANanoEvent)";
 //BA.debugLineNum = 245;BA.debugLine="vm.ShowDialog(\"diag2\")";
_vm._showdialog /*String*/ ("diag2");
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public static String  _btnprompt1_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub btnPrompt1_click(e As BANanoEvent)";
 //BA.debugLineNum = 170;BA.debugLine="vm.ShowAlert(\"alertuser\", \"Alert User\", \"This is";
_vm._showalert /*String*/ ("alertuser","Alert User","This is an alert!","Yippie!");
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public static String  _btnsaveit_click(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.Map _user = null;
 //BA.debugLineNum = 225;BA.debugLine="Sub btnSaveIt_click(e As BANanoEvent)";
 //BA.debugLineNum = 226;BA.debugLine="Dim user As Map = vm.GetData(\"user\")";
_user = new anywheresoftware.b4a.objects.collections.Map();
_user = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_vm._getdata /*Object*/ ("user")));
 //BA.debugLineNum = 227;BA.debugLine="vm.ShowSnackBar(BANano.tojson(user))";
_vm._showsnackbar /*String*/ (BA.ObjectToString(_banano.ToJson((Object)(_user.getObject()))));
 //BA.debugLineNum = 228;BA.debugLine="vm.HideDialog(\"inputdialog\")";
_vm._hidedialog /*String*/ ("inputdialog");
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return "";
}
public static String  _code() throws Exception{
b4j.example.vmcontainer _cont = null;
b4j.example.vmdialog _diag = null;
b4j.example.vmdialog _diag2 = null;
b4j.example.vmdialog _diag3 = null;
b4j.example.vmdialog _diagx = null;
 //BA.debugLineNum = 11;BA.debugLine="Sub Code";
 //BA.debugLineNum = 12;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 13;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 15;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,moddialog.getObject());
 //BA.debugLineNum = 17;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 19;BA.debugLine="cont.AddRows(3).AddColumns2x6";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (3))._addcolumns2x6 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 20;BA.debugLine="cont.AddRows(10).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (10))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 22;BA.debugLine="vm.CreateButton(\"btnDialog\", Me).SetLabel(\"Show D";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnDialog",moddialog.getObject())._setlabel /*b4j.example.vmbutton*/ ("Show Dialog")._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 23;BA.debugLine="vm.CreateButton(\"btnPersistent\", Me).SetLabel(\"Pe";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnPersistent",moddialog.getObject())._setlabel /*b4j.example.vmbutton*/ ("Persistent")._addtocontainer /*String*/ (_cont,(int) (1),(int) (2));
 //BA.debugLineNum = 24;BA.debugLine="vm.CreateButton(\"btnHideOverlay\", Me).SetLabel(\"H";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnHideOverlay",moddialog.getObject())._setlabel /*b4j.example.vmbutton*/ ("Hide Overlay")._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 25;BA.debugLine="vm.CreateButton(\"btnInputDialog\", Me).SetLabel(\"I";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnInputDialog",moddialog.getObject())._setlabel /*b4j.example.vmbutton*/ ("Input Dialog")._addtocontainer /*String*/ (_cont,(int) (2),(int) (2));
 //BA.debugLineNum = 26;BA.debugLine="vm.CreateButton(\"btnPrompt1\", Me).SetLabel(\"Alert";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnPrompt1",moddialog.getObject())._setlabel /*b4j.example.vmbutton*/ ("Alert Dialog")._addtocontainer /*String*/ (_cont,(int) (3),(int) (1));
 //BA.debugLineNum = 27;BA.debugLine="vm.CreateButton(\"btnConfirm1\", Me).SetLabel(\"Conf";
_vm._createbutton /*b4j.example.vmbutton*/ ("btnConfirm1",moddialog.getObject())._setlabel /*b4j.example.vmbutton*/ ("Confirm Dialog")._addtocontainer /*String*/ (_cont,(int) (3),(int) (2));
 //BA.debugLineNum = 30;BA.debugLine="Dim diag As VMDialog = vm.CreateDialog(\"diag1\", M";
_diag = _vm._createdialog /*b4j.example.vmdialog*/ ("diag1",moddialog.getObject());
 //BA.debugLineNum = 31;BA.debugLine="diag.SetWidth(\"500\")";
_diag._setwidth /*b4j.example.vmdialog*/ ("500");
 //BA.debugLineNum = 32;BA.debugLine="diag.SetTitle(\"Privacy Policy\")";
_diag._settitle /*b4j.example.vmdialog*/ ("Privacy Policy");
 //BA.debugLineNum = 33;BA.debugLine="diag.Container.SetText(\"Lorem ipsum...\")";
_diag._container /*b4j.example.vmcontainer*/ ._settext /*b4j.example.vmcontainer*/ ("Lorem ipsum...");
 //BA.debugLineNum = 34;BA.debugLine="diag.AddOK(\"btnOk\", \"I agree\")";
_diag._addok /*b4j.example.vmdialog*/ ("btnOk","I agree");
 //BA.debugLineNum = 35;BA.debugLine="vm.AddDialog(diag)";
_vm._adddialog /*String*/ (_diag);
 //BA.debugLineNum = 38;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 39;BA.debugLine="vue.AddCode($\"Dim diag As VMDialog = vm.CreateDia";
_vue._addcode /*String*/ (("Dim diag As VMDialog = vm.CreateDialog(\"diag1\", Me)"));
 //BA.debugLineNum = 40;BA.debugLine="vue.AddCode($\"diag.SetWidth(\"500\")\"$)";
_vue._addcode /*String*/ (("diag.SetWidth(\"500\")"));
 //BA.debugLineNum = 41;BA.debugLine="vue.AddCode($\"diag.SetTitle(\"Privacy Policy\")\"$)";
_vue._addcode /*String*/ (("diag.SetTitle(\"Privacy Policy\")"));
 //BA.debugLineNum = 42;BA.debugLine="vue.AddCode($\"diag.Container.SetText(\"Lorem ipsum";
_vue._addcode /*String*/ (("diag.Container.SetText(\"Lorem ipsum...\")"));
 //BA.debugLineNum = 43;BA.debugLine="vue.AddCode($\"diag.AddOK(\"btnOk\", \"I agree\")\"$)";
_vue._addcode /*String*/ (("diag.AddOK(\"btnOk\", \"I agree\")"));
 //BA.debugLineNum = 44;BA.debugLine="vue.AddCode($\"vm.AddDialog(diag)\"$)";
_vue._addcode /*String*/ (("vm.AddDialog(diag)"));
 //BA.debugLineNum = 45;BA.debugLine="vue.AddCode($\"'\"$)";
_vue._addcode /*String*/ (("'"));
 //BA.debugLineNum = 46;BA.debugLine="vue.AddCode(\"Sub btnok_click(e As BANanoEvent)\")";
_vue._addcode /*String*/ ("Sub btnok_click(e As BANanoEvent)");
 //BA.debugLineNum = 47;BA.debugLine="vue.AddCode($\"vm.hidedialog(\"diag1\")\"$)";
_vue._addcode /*String*/ (("vm.hidedialog(\"diag1\")"));
 //BA.debugLineNum = 48;BA.debugLine="vue.AddCode(\"End Sub\")";
_vue._addcode /*String*/ ("End Sub");
 //BA.debugLineNum = 49;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"diag1code\", \"Dialo";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,moddialog.getObject(),"diag1code","Dialog",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (4),(int) (1));
 //BA.debugLineNum = 52;BA.debugLine="Dim diag2 As VMDialog = vm.CreateDialog(\"diag2\",";
_diag2 = _vm._createdialog /*b4j.example.vmdialog*/ ("diag2",moddialog.getObject())._setmaxwidth /*b4j.example.vmdialog*/ ("390")._setmodal /*b4j.example.vmdialog*/ (anywheresoftware.b4a.keywords.Common.True)._settitle /*b4j.example.vmdialog*/ ("Use Google's location service?");
 //BA.debugLineNum = 53;BA.debugLine="diag2.SetScrollable(True)";
_diag2._setscrollable /*b4j.example.vmdialog*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 54;BA.debugLine="diag2.Container.SetText(\"Let Google help apps det";
_diag2._container /*b4j.example.vmcontainer*/ ._settext /*b4j.example.vmcontainer*/ ("Let Google help apps determine location. This means sending anonymous location data to Google, even when no apps are running");
 //BA.debugLineNum = 55;BA.debugLine="diag2.AddCancel(\"btnDisagree\", \"I Disagree\")";
_diag2._addcancel /*b4j.example.vmdialog*/ ("btnDisagree","I Disagree");
 //BA.debugLineNum = 56;BA.debugLine="diag2.AddOK(\"btnOk1\", \"I agree\")";
_diag2._addok /*b4j.example.vmdialog*/ ("btnOk1","I agree");
 //BA.debugLineNum = 57;BA.debugLine="vm.AddDialog(diag2)";
_vm._adddialog /*String*/ (_diag2);
 //BA.debugLineNum = 60;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 61;BA.debugLine="vue.AddCode($\"Dim diag2 As VMDialog = vm.CreateDia";
_vue._addcode /*String*/ (("Dim diag2 As VMDialog = vm.CreateDialog(\"diag2\", Me).SetMaxWidth(\"390\").SetModal(True).SetTitle(\"Use Google's location service?\")"));
 //BA.debugLineNum = 62;BA.debugLine="vue.AddCode($\"diag2.SetScrollable(True)\"$)";
_vue._addcode /*String*/ (("diag2.SetScrollable(True)"));
 //BA.debugLineNum = 63;BA.debugLine="vue.AddCode($\"diag2.Container.SetText(\"Let Google";
_vue._addcode /*String*/ (("diag2.Container.SetText(\"Let Google help apps determine location. This means sending anonymous location data to Google, even when no apps are running\")"));
 //BA.debugLineNum = 64;BA.debugLine="vue.AddCode($\"diag2.AddCancel(\"btnDisagree\", \"I Di";
_vue._addcode /*String*/ (("diag2.AddCancel(\"btnDisagree\", \"I Disagree\")"));
 //BA.debugLineNum = 65;BA.debugLine="vue.AddCode($\"diag2.AddOK(\"btnOk1\", \"I agree\")\"$)";
_vue._addcode /*String*/ (("diag2.AddOK(\"btnOk1\", \"I agree\")"));
 //BA.debugLineNum = 66;BA.debugLine="vue.AddCode($\"vm.AddDialog(diag2)\"$)";
_vue._addcode /*String*/ (("vm.AddDialog(diag2)"));
 //BA.debugLineNum = 67;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"diag2code\", \"Dialog";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,moddialog.getObject(),"diag2code","Dialog",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (5),(int) (1));
 //BA.debugLineNum = 70;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 71;BA.debugLine="vue.AddCode($\"'see pgIndex.alert_ok\"$)";
_vue._addcode /*String*/ (("'see pgIndex.alert_ok"));
 //BA.debugLineNum = 72;BA.debugLine="vue.AddCode($\"Sub btnPrompt1_click(e As BANanoEven";
_vue._addcode /*String*/ (("Sub btnPrompt1_click(e As BANanoEvent)"));
 //BA.debugLineNum = 73;BA.debugLine="vue.AddCode($\"vm.ShowAlert(\"alertuser\", \"Alert Use";
_vue._addcode /*String*/ (("vm.ShowAlert(\"alertuser\", \"Alert User\", \"This is an alert!\", \"Yippie!\")"));
 //BA.debugLineNum = 74;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 75;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"alertCode\", \"Alert\"";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,moddialog.getObject(),"alertCode","Alert",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (6),(int) (1));
 //BA.debugLineNum = 78;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 80;BA.debugLine="vue.AddCode($\"'see pgIndex.confirm_ok\"$)";
_vue._addcode /*String*/ (("'see pgIndex.confirm_ok"));
 //BA.debugLineNum = 81;BA.debugLine="vue.AddCode($\"Sub btnConfirm1_click(e As BANanoEve";
_vue._addcode /*String*/ (("Sub btnConfirm1_click(e As BANanoEvent)"));
 //BA.debugLineNum = 82;BA.debugLine="vue.AddCode($\"vm.ShowConfirm(\"promptuser\", \"Confir";
_vue._addcode /*String*/ (("vm.ShowConfirm(\"promptuser\", \"Confirm Vuetify\", \"Are you sure that you want to use Vuetify?\", \"Yep\", \"Nada\")"));
 //BA.debugLineNum = 83;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 84;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"confirmCode\", \"Conf";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,moddialog.getObject(),"confirmCode","Confirm",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (7),(int) (1));
 //BA.debugLineNum = 87;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 88;BA.debugLine="vue.AddCode($\"'when the ok button is clicked for a";
_vue._addcode /*String*/ (("'when the ok button is clicked for a confirm dialog"));
 //BA.debugLineNum = 89;BA.debugLine="vue.AddCode($\"Sub confirm_ok(e As BANanoEvent)\"$)";
_vue._addcode /*String*/ (("Sub confirm_ok(e As BANanoEvent)"));
 //BA.debugLineNum = 90;BA.debugLine="vue.AddCode($\"Dim sproc As String = vm.GetConfirm\"";
_vue._addcode /*String*/ (("Dim sproc As String = vm.GetConfirm"));
 //BA.debugLineNum = 91;BA.debugLine="vue.AddCode($\"Select Case sproc\"$)";
_vue._addcode /*String*/ (("Select Case sproc"));
 //BA.debugLineNum = 92;BA.debugLine="vue.AddCode($\"Case \"promptuser\"\"$)";
_vue._addcode /*String*/ (("Case \"promptuser\""));
 //BA.debugLineNum = 93;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Yes, use Vuetify!\")";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Yes, use Vuetify!\")"));
 //BA.debugLineNum = 94;BA.debugLine="vue.AddCode($\"Case Else\"$)";
_vue._addcode /*String*/ (("Case Else"));
 //BA.debugLineNum = 95;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(sproc)\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(sproc)"));
 //BA.debugLineNum = 96;BA.debugLine="vue.AddCode($\"End Select\"$)";
_vue._addcode /*String*/ (("End Select"));
 //BA.debugLineNum = 97;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 98;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"confirmAnswer\", \"Co";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,moddialog.getObject(),"confirmAnswer","Confirm Response",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (8),(int) (1));
 //BA.debugLineNum = 103;BA.debugLine="Dim diag3 As VMDialog = vm.CreateDialog(\"diag3\",";
_diag3 = _vm._createdialog /*b4j.example.vmdialog*/ ("diag3",moddialog.getObject())._sethideoverlay /*b4j.example.vmdialog*/ (anywheresoftware.b4a.keywords.Common.True)._setmaxwidth /*b4j.example.vmdialog*/ ("80%")._settitle /*b4j.example.vmdialog*/ ("This is it")._setscrollable /*b4j.example.vmdialog*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 104;BA.debugLine="diag3.Container.SetText(\"Let Google help apps det";
_diag3._container /*b4j.example.vmcontainer*/ ._settext /*b4j.example.vmcontainer*/ ("Let Google help apps determine location. This means sending anonymous location data to Google, even when no apps are running");
 //BA.debugLineNum = 105;BA.debugLine="diag3.AddCancel(\"btnDisagree2\", \"I Disagree\")";
_diag3._addcancel /*b4j.example.vmdialog*/ ("btnDisagree2","I Disagree");
 //BA.debugLineNum = 106;BA.debugLine="diag3.AddOK(\"btnOk3\", \"I agree\")";
_diag3._addok /*b4j.example.vmdialog*/ ("btnOk3","I agree");
 //BA.debugLineNum = 107;BA.debugLine="vm.AddDialog(diag3)";
_vm._adddialog /*String*/ (_diag3);
 //BA.debugLineNum = 110;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 112;BA.debugLine="Dim diagx As VMDialog = InputDialog";
_diagx = _inputdialog();
 //BA.debugLineNum = 113;BA.debugLine="vm.AddDialog(diagx)";
_vm._adddialog /*String*/ (_diagx);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public static String  _confirmanswercopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub confirmAnswercopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 119;BA.debugLine="vue.CopyCode2Clipboard(\"confirmAnswer\")";
_vue._copycode2clipboard /*String*/ ("confirmAnswer");
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public static String  _confirmanswerdownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub confirmAnswerdownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 123;BA.debugLine="vue.DownloadCode(\"confirmAnswer\", \"confirmAnswer.t";
_vue._downloadcode /*String*/ ("confirmAnswer","confirmAnswer.txt");
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public static String  _confirmcodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub confirmCodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 129;BA.debugLine="vue.CopyCode2Clipboard(\"confirmCode\")";
_vue._copycode2clipboard /*String*/ ("confirmCode");
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public static String  _confirmcodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub confirmCodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 133;BA.debugLine="vue.DownloadCode(\"confirmCode\", \"confirmCode.txt\"";
_vue._downloadcode /*String*/ ("confirmCode","confirmCode.txt");
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public static String  _diag1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub diag1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 155;BA.debugLine="vue.CopyCode2Clipboard(\"diag1code\")";
_vue._copycode2clipboard /*String*/ ("diag1code");
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public static String  _diag1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub diag1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 159;BA.debugLine="vue.DownloadCode(\"diag1code\", \"diag1code.txt\")";
_vue._downloadcode /*String*/ ("diag1code","diag1code.txt");
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public static String  _diag2codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub diag2codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 147;BA.debugLine="vue.CopyCode2Clipboard(\"diag2code\")";
_vue._copycode2clipboard /*String*/ ("diag2code");
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public static String  _diag2codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub diag2codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 151;BA.debugLine="vue.DownloadCode(\"diag2code\", \"diag2code.txt\")";
_vue._downloadcode /*String*/ ("diag2code","diag2code.txt");
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public static b4j.example.vmdialog  _inputdialog() throws Exception{
anywheresoftware.b4a.objects.collections.Map _user = null;
b4j.example.vmdialog _diag = null;
b4j.example.vmcheckbox _chkagree = null;
b4j.example.vmdatetimepicker _dob = null;
b4j.example.vmfileinput _fi = null;
b4j.example.vmradiogroup _rg1 = null;
b4j.example.vmselect _selx = null;
b4j.example.vmslider _age = null;
b4j.example.vmcheckbox _swt = null;
b4j.example.vmtextfield _txtm = null;
b4j.example.vmtextfield _txtfn = null;
b4j.example.vmselect _ac1 = null;
b4j.example.vmavatar _a3 = null;
b4j.example.vmdatetimepicker _tp2 = null;
b4j.example.vmselect _cbo1 = null;
b4j.example.vmtextfield _pwd = null;
 //BA.debugLineNum = 177;BA.debugLine="Sub InputDialog As VMDialog";
 //BA.debugLineNum = 178;BA.debugLine="Dim user As Map = CreateMap()";
_user = new anywheresoftware.b4a.objects.collections.Map();
_user = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 179;BA.debugLine="vm.SetData(\"user\", user)";
_vm._setdata /*b4j.example.bananovm*/ ("user",(Object)(_user.getObject()));
 //BA.debugLineNum = 181;BA.debugLine="Dim diag As VMDialog = vm.CreateDialog(\"inputdial";
_diag = _vm._createdialog /*b4j.example.vmdialog*/ ("inputdialog",moddialog.getObject());
 //BA.debugLineNum = 182;BA.debugLine="diag.SetModal(True)";
_diag._setmodal /*b4j.example.vmdialog*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 183;BA.debugLine="diag.SetWidth(\"800px\")";
_diag._setwidth /*b4j.example.vmdialog*/ ("800px");
 //BA.debugLineNum = 184;BA.debugLine="diag.SetTitle(\"Input Dialog\")";
_diag._settitle /*b4j.example.vmdialog*/ ("Input Dialog");
 //BA.debugLineNum = 185;BA.debugLine="diag.Container.AddRows(7).AddColumns2x6";
_diag._container /*b4j.example.vmcontainer*/ ._addrows /*b4j.example.vmcontainer*/ ((int) (7))._addcolumns2x6 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 187;BA.debugLine="Dim chkAgree As VMCheckBox = vm.CreateCheckBox(\"c";
_chkagree = _vm._createcheckbox /*b4j.example.vmcheckbox*/ ("chkAgree1",moddialog.getObject())._setvmodel /*b4j.example.vmcheckbox*/ ("user.agree")._setlabel /*b4j.example.vmcheckbox*/ ("I agree");
 //BA.debugLineNum = 188;BA.debugLine="Dim dob As VMDateTimePicker = vm.CreateDatePicker";
_dob = _vm._createdatepicker /*b4j.example.vmdatetimepicker*/ ("dob",moddialog.getObject())._setvmodel /*b4j.example.vmdatetimepicker*/ ("user.dob")._setlabel /*b4j.example.vmdatetimepicker*/ ("Date of Birth")._setforinput /*b4j.example.vmdatetimepicker*/ ();
 //BA.debugLineNum = 189;BA.debugLine="Dim fi As VMFileInput = vm.CreateFileInput(\"myfil";
_fi = _vm._createfileinput /*b4j.example.vmfileinput*/ ("myfile",moddialog.getObject())._setaccept /*b4j.example.vmfileinput*/ ("image/*")._setlabel /*b4j.example.vmfileinput*/ ("File input")._setvmodel /*b4j.example.vmfileinput*/ ("user.myfile");
 //BA.debugLineNum = 190;BA.debugLine="Dim rg1 As VMRadioGroup = vm.CreateRadioGroup(\"ge";
_rg1 = _vm._createradiogroup /*b4j.example.vmradiogroup*/ ("gender",moddialog.getObject())._setvmodel /*b4j.example.vmradiogroup*/ ("user.gender")._sethorizontal /*b4j.example.vmradiogroup*/ (anywheresoftware.b4a.keywords.Common.True)._setlabel /*b4j.example.vmradiogroup*/ ("Gender");
 //BA.debugLineNum = 191;BA.debugLine="rg1.SetOptions(CreateMap(\"m\":\"Male\",\"f\":\"Female\")";
_rg1._setoptions /*String*/ (anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("m"),(Object)("Male"),(Object)("f"),(Object)("Female")}));
 //BA.debugLineNum = 192;BA.debugLine="Dim selx As VMSelect = vm.CreateSelect(\"code\", Me";
_selx = _vm._createselect /*b4j.example.vmselect*/ ("code",moddialog.getObject())._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Code")._setvmodel /*b4j.example.vmselect*/ ("user.code");
 //BA.debugLineNum = 193;BA.debugLine="Dim age As VMSlider = vm.CreateSlider(\"age\", Me).";
_age = _vm._createslider /*b4j.example.vmslider*/ ("age",moddialog.getObject())._setvmodel /*b4j.example.vmslider*/ ("user.age")._setmin /*b4j.example.vmslider*/ ((double)(Double.parseDouble("0")))._setmax /*b4j.example.vmslider*/ ((double)(Double.parseDouble("100")))._setlabel /*b4j.example.vmslider*/ ("Age")._setthumblabel /*b4j.example.vmslider*/ ("always")._setvalue /*b4j.example.vmslider*/ ("46");
 //BA.debugLineNum = 194;BA.debugLine="Dim swt As VMCheckBox = vm.CreateSwitch(\"notif\",";
_swt = _vm._createswitch /*b4j.example.vmcheckbox*/ ("notif",moddialog.getObject())._setlabel /*b4j.example.vmcheckbox*/ ("Receive Notifications")._setvmodel /*b4j.example.vmcheckbox*/ ("user.notif");
 //BA.debugLineNum = 195;BA.debugLine="Dim txtm As VMTextField = vm.CreateTextArea(\"abou";
_txtm = _vm._createtextarea /*b4j.example.vmtextfield*/ ("about",moddialog.getObject())._setlabel /*b4j.example.vmtextfield*/ ("About Yourself")._setvmodel /*b4j.example.vmtextfield*/ ("user.about");
 //BA.debugLineNum = 196;BA.debugLine="Dim txtfn As VMTextField = vm.CreateTextField(\"fn";
_txtfn = _vm._createtextfield /*b4j.example.vmtextfield*/ ("fn",moddialog.getObject())._setlabel /*b4j.example.vmtextfield*/ ("First Name")._setvmodel /*b4j.example.vmtextfield*/ ("user.fn")._sethint /*b4j.example.vmtextfield*/ ("Enter a first name")._setpersistenthint /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setclearable /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True)._setmaxlength /*b4j.example.vmtextfield*/ (BA.NumberToString(50));
 //BA.debugLineNum = 197;BA.debugLine="Dim ac1 As VMSelect = vm.CreateAutoComplete(\"ln\",";
_ac1 = _vm._createautocomplete /*b4j.example.vmselect*/ ("ln",moddialog.getObject())._setvmodel /*b4j.example.vmselect*/ ("user.ln")._bind /*b4j.example.vmselect*/ (":items","items")._setlabel /*b4j.example.vmselect*/ ("Last Name");
 //BA.debugLineNum = 198;BA.debugLine="Dim a3 As VMAvatar = vm.CreateAvatar(\"dp\", Me).Se";
_a3 = _vm._createavatar /*b4j.example.vmavatar*/ ("dp",moddialog.getObject())._setimage /*b4j.example.vmavatar*/ ("./assets/sponge.png","Sponge",(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 199;BA.debugLine="Dim tp2 As VMDateTimePicker = vm.CreateTimePicker";
_tp2 = _vm._createtimepicker /*b4j.example.vmdatetimepicker*/ ("tob",moddialog.getObject())._setvmodel /*b4j.example.vmdatetimepicker*/ ("user.tob")._setlabel /*b4j.example.vmdatetimepicker*/ ("Time of Birth")._setforinput /*b4j.example.vmdatetimepicker*/ ();
 //BA.debugLineNum = 200;BA.debugLine="Dim cbo1 As VMSelect = vm.CreateComboBox(\"combox\"";
_cbo1 = _vm._createcombobox /*b4j.example.vmselect*/ ("combox",moddialog.getObject())._setvmodel /*b4j.example.vmselect*/ ("user.combo")._setitems /*b4j.example.vmselect*/ ("items")._setlabel /*b4j.example.vmselect*/ ("Select a favourate activity or create a new one");
 //BA.debugLineNum = 201;BA.debugLine="Dim pwd As VMTextField = vm.CreateTextField(\"pwd\"";
_pwd = _vm._createtextfield /*b4j.example.vmtextfield*/ ("pwd",moddialog.getObject())._setlabel /*b4j.example.vmtextfield*/ ("Password")._setpassword /*b4j.example.vmtextfield*/ (anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True)._setname /*b4j.example.vmtextfield*/ ((Object)("password"),anywheresoftware.b4a.keywords.Common.False)._setvmodel /*b4j.example.vmtextfield*/ ("user.pwd")._sethint /*b4j.example.vmtextfield*/ ("At least enter 8 characters.");
 //BA.debugLineNum = 202;BA.debugLine="pwd.SetCounter(8)";
_pwd._setcounter /*b4j.example.vmtextfield*/ (BA.ObjectToBoolean(8));
 //BA.debugLineNum = 204;BA.debugLine="diag.Container.AddComponent(1, 1, chkAgree.ToStri";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (1),_chkagree._tostring /*String*/ ());
 //BA.debugLineNum = 205;BA.debugLine="diag.Container.AddComponent(1, 2, dob.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (1),(int) (2),_dob._tostring /*String*/ ());
 //BA.debugLineNum = 206;BA.debugLine="diag.Container.AddComponent(2, 1, fi.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (2),(int) (1),_fi._tostring /*String*/ ());
 //BA.debugLineNum = 207;BA.debugLine="diag.Container.AddComponent(2, 2, rg1.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (2),(int) (2),_rg1._tostring /*String*/ ());
 //BA.debugLineNum = 208;BA.debugLine="diag.Container.AddComponent(3, 1, selx.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (3),(int) (1),_selx._tostring /*String*/ ());
 //BA.debugLineNum = 209;BA.debugLine="diag.Container.AddComponent(3, 2, age.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (3),(int) (2),_age._tostring /*String*/ ());
 //BA.debugLineNum = 210;BA.debugLine="diag.Container.AddComponent(4, 1, swt.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (4),(int) (1),_swt._tostring /*String*/ ());
 //BA.debugLineNum = 211;BA.debugLine="diag.Container.AddComponent(4, 2, txtm.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (4),(int) (2),_txtm._tostring /*String*/ ());
 //BA.debugLineNum = 212;BA.debugLine="diag.Container.AddComponent(5, 1, txtfn.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (5),(int) (1),_txtfn._tostring /*String*/ ());
 //BA.debugLineNum = 213;BA.debugLine="diag.Container.AddComponent(5, 2, ac1.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (5),(int) (2),_ac1._tostring /*String*/ ());
 //BA.debugLineNum = 214;BA.debugLine="diag.Container.AddComponent(6, 1, a3.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (6),(int) (1),_a3._tostring /*String*/ ());
 //BA.debugLineNum = 215;BA.debugLine="diag.Container.AddComponent(6, 2, tp2.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (6),(int) (2),_tp2._tostring /*String*/ ());
 //BA.debugLineNum = 216;BA.debugLine="diag.Container.AddComponent(7, 1, cbo1.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (7),(int) (1),_cbo1._tostring /*String*/ ());
 //BA.debugLineNum = 217;BA.debugLine="diag.Container.AddComponent(7, 2, pwd.tostring)";
_diag._container /*b4j.example.vmcontainer*/ ._addcomponent /*String*/ ((int) (7),(int) (2),_pwd._tostring /*String*/ ());
 //BA.debugLineNum = 219;BA.debugLine="diag.AddCancel(\"btnCancelIt\", \"Cancel\")";
_diag._addcancel /*b4j.example.vmdialog*/ ("btnCancelIt","Cancel");
 //BA.debugLineNum = 220;BA.debugLine="diag.AddOK(\"btnSaveIt\", \"Save\")";
_diag._addok /*b4j.example.vmdialog*/ ("btnSaveIt","Save");
 //BA.debugLineNum = 221;BA.debugLine="Return diag";
if (true) return _diag;
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"dialogCode\"";
_name = "dialogCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Dialog\"";
_title = "Dialog";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
