package b4j.example;


import anywheresoftware.b4a.BA;

public class modpagination extends Object{
public static modpagination mostCurrent = new modpagination();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.modpagination", null);
		ba.loadHtSubs(modpagination.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.modpagination", ba);
		}
	}
    public static Class<?> getObject() {
		return modpagination.class;
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
b4j.example.vmpagination _pgnpagination1 = null;
 //BA.debugLineNum = 10;BA.debugLine="Sub Code";
 //BA.debugLineNum = 11;BA.debugLine="vm = pgIndex.vm";
_vm = _pgindex._vm /*b4j.example.bananovm*/ ;
 //BA.debugLineNum = 12;BA.debugLine="vue = vm.vue";
_vue = _vm._vue /*b4j.example.bananovue*/ ;
 //BA.debugLineNum = 14;BA.debugLine="Dim cont As VMContainer = vm.CreateContainer(name";
_cont = _vm._createcontainer /*b4j.example.vmcontainer*/ (_name,modpagination.getObject());
 //BA.debugLineNum = 15;BA.debugLine="cont.AddRows(2).AddColumns12";
_cont._addrows /*b4j.example.vmcontainer*/ ((int) (2))._addcolumns12 /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 17;BA.debugLine="cont.Hide";
_cont._hide /*b4j.example.vmcontainer*/ ();
 //BA.debugLineNum = 19;BA.debugLine="Dim pgnpagination1 As VMPagination";
_pgnpagination1 = new b4j.example.vmpagination();
 //BA.debugLineNum = 20;BA.debugLine="pgnpagination1.Initialize(vue, \"pgnpagination1\",";
_pgnpagination1._initialize /*b4j.example.vmpagination*/ (ba,_vue,"pgnpagination1",modpagination.getObject());
 //BA.debugLineNum = 21;BA.debugLine="pgnpagination1.SetCircle(True)";
_pgnpagination1._setcircle /*b4j.example.vmpagination*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 22;BA.debugLine="pgnpagination1.SetColor(\"blue\")";
_pgnpagination1._setcolor /*b4j.example.vmpagination*/ ("blue");
 //BA.debugLineNum = 23;BA.debugLine="pgnpagination1.SetLength(\"10\")";
_pgnpagination1._setlength /*b4j.example.vmpagination*/ ("10");
 //BA.debugLineNum = 24;BA.debugLine="pgnpagination1.SetVisible(True)";
_pgnpagination1._setvisible /*b4j.example.vmpagination*/ (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 25;BA.debugLine="pgnpagination1.SetOnInput(\"pgnpagination1_input\")";
_pgnpagination1._setoninput /*b4j.example.vmpagination*/ ("pgnpagination1_input");
 //BA.debugLineNum = 26;BA.debugLine="pgnpagination1.SetOnNext(\"pgnpagination1_next\")";
_pgnpagination1._setonnext /*b4j.example.vmpagination*/ ("pgnpagination1_next");
 //BA.debugLineNum = 27;BA.debugLine="pgnpagination1.SetOnPrevious(\"pgnpagination1_prev";
_pgnpagination1._setonprevious /*b4j.example.vmpagination*/ ("pgnpagination1_previous");
 //BA.debugLineNum = 28;BA.debugLine="pgnpagination1.AddToContainer(cont,1,1)";
_pgnpagination1._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 31;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 32;BA.debugLine="vue.AddCode($\"Dim pgnpagination1 As VMPagination\"$";
_vue._addcode /*String*/ (("Dim pgnpagination1 As VMPagination"));
 //BA.debugLineNum = 33;BA.debugLine="vue.AddCode($\"pgnpagination1.Initialize(vue, \"pgnp";
_vue._addcode /*String*/ (("pgnpagination1.Initialize(vue, \"pgnpagination1\", Me)"));
 //BA.debugLineNum = 34;BA.debugLine="vue.AddCode($\"pgnpagination1.SetCircle(True)\"$)";
_vue._addcode /*String*/ (("pgnpagination1.SetCircle(True)"));
 //BA.debugLineNum = 35;BA.debugLine="vue.AddCode($\"pgnpagination1.SetColor(\"blue\")\"$)";
_vue._addcode /*String*/ (("pgnpagination1.SetColor(\"blue\")"));
 //BA.debugLineNum = 36;BA.debugLine="vue.AddCode($\"pgnpagination1.SetLength(\"10\")\"$)";
_vue._addcode /*String*/ (("pgnpagination1.SetLength(\"10\")"));
 //BA.debugLineNum = 37;BA.debugLine="vue.AddCode($\"pgnpagination1.SetVisible(True)\"$)";
_vue._addcode /*String*/ (("pgnpagination1.SetVisible(True)"));
 //BA.debugLineNum = 38;BA.debugLine="vue.AddCode($\"pgnpagination1.SetOnInput(\"pgnpagina";
_vue._addcode /*String*/ (("pgnpagination1.SetOnInput(\"pgnpagination1_input\")"));
 //BA.debugLineNum = 39;BA.debugLine="vue.AddCode($\"pgnpagination1.SetOnNext(\"pgnpaginat";
_vue._addcode /*String*/ (("pgnpagination1.SetOnNext(\"pgnpagination1_next\")"));
 //BA.debugLineNum = 40;BA.debugLine="vue.AddCode($\"pgnpagination1.SetOnPrevious(\"pgnpag";
_vue._addcode /*String*/ (("pgnpagination1.SetOnPrevious(\"pgnpagination1_previous\")"));
 //BA.debugLineNum = 41;BA.debugLine="vue.AddCode($\"pgnpagination1.AddToContainer(cont,1";
_vue._addcode /*String*/ (("pgnpagination1.AddToContainer(cont,1,1)"));
 //BA.debugLineNum = 42;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pagi1code\", \"Pagina";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modpagination.getObject(),"pagi1code","Pagination",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (1),(int) (1));
 //BA.debugLineNum = 45;BA.debugLine="vue.SourceCodeBuilder";
_vue._sourcecodebuilder /*String*/ ();
 //BA.debugLineNum = 46;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 47;BA.debugLine="vue.AddCode($\"Private Sub pgnpagination1_input(val";
_vue._addcode /*String*/ (("Private Sub pgnpagination1_input(value As Object)"));
 //BA.debugLineNum = 48;BA.debugLine="vue.AddCode($\"vm.ShowSnackBarSuccess(value)\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBarSuccess(value)"));
 //BA.debugLineNum = 49;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 50;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 51;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 52;BA.debugLine="vue.AddCode($\"Private Sub pgnpagination1_next(e As";
_vue._addcode /*String*/ (("Private Sub pgnpagination1_next(e As BANanoEvent)"));
 //BA.debugLineNum = 53;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Next...\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Next...\")"));
 //BA.debugLineNum = 54;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 55;BA.debugLine="vue.AddCode($\"\"$)";
_vue._addcode /*String*/ ((""));
 //BA.debugLineNum = 56;BA.debugLine="vue.AddCode($\"Private Sub pgnpagination1_previous(";
_vue._addcode /*String*/ (("Private Sub pgnpagination1_previous(e As BANanoEvent)"));
 //BA.debugLineNum = 57;BA.debugLine="vue.AddCode($\"vm.ShowSnackBar(\"Previous....\")\"$)";
_vue._addcode /*String*/ (("vm.ShowSnackBar(\"Previous....\")"));
 //BA.debugLineNum = 58;BA.debugLine="vue.AddCode($\"End Sub\"$)";
_vue._addcode /*String*/ (("End Sub"));
 //BA.debugLineNum = 59;BA.debugLine="pgIndex.CreateVBCode(vue, Me, \"pagi1clickcode\", \"P";
_pgindex._createvbcode /*b4j.example.vmprism*/ (_vue,modpagination.getObject(),"pagi1clickcode","Pagination Events",_vue._getsourcecode /*String*/ ())._addtocontainer /*String*/ (_cont,(int) (2),(int) (1));
 //BA.debugLineNum = 63;BA.debugLine="vm.AddContainer(cont)";
_vm._addcontainer /*String*/ (_cont);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static String  _pagi1clickcodecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub pagi1clickcodecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 90;BA.debugLine="vue.CopyCode2Clipboard(\"pagi1clickcode\")";
_vue._copycode2clipboard /*String*/ ("pagi1clickcode");
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public static String  _pagi1clickcodedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub pagi1clickcodedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 94;BA.debugLine="vue.DownloadCode(\"pagi1clickcode\", \"pagi1clickcode";
_vue._downloadcode /*String*/ ("pagi1clickcode","pagi1clickcode.txt");
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public static String  _pagi1codecopy_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub pagi1codecopy_click(e As BANanoEvent)";
 //BA.debugLineNum = 81;BA.debugLine="vue.CopyCode2Clipboard(\"pagi1code\")";
_vue._copycode2clipboard /*String*/ ("pagi1code");
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static String  _pagi1codedownload_click(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub pagi1codedownload_click(e As BANanoEvent)";
 //BA.debugLineNum = 85;BA.debugLine="vue.DownloadCode(\"pagi1code\", \"pagi1code.txt\")";
_vue._downloadcode /*String*/ ("pagi1code","pagi1code.txt");
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static String  _pgnpagination1_input(Object _value) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Private Sub pgnpagination1_input(value As Object)";
 //BA.debugLineNum = 67;BA.debugLine="vm.ShowSnackBarSuccess(value)";
_vm._showsnackbarsuccess /*String*/ (BA.ObjectToString(_value));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _pgnpagination1_next(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Private Sub pgnpagination1_next(e As BANanoEvent)";
 //BA.debugLineNum = 72;BA.debugLine="vm.ShowSnackBar(\"Next...\")";
_vm._showsnackbar /*String*/ ("Next...");
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _pgnpagination1_previous(com.ab.banano.BANanoEvent _e) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Private Sub pgnpagination1_previous(e As BANanoEve";
 //BA.debugLineNum = 76;BA.debugLine="vm.ShowSnackBar(\"Previous....\")";
_vm._showsnackbar /*String*/ ("Previous....");
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public name As String = \"paginationCode\"";
_name = "paginationCode";
 //BA.debugLineNum = 4;BA.debugLine="Public title As String = \"Pagination\"";
_title = "Pagination";
 //BA.debugLineNum = 5;BA.debugLine="Private vm As BANanoVM";
_vm = new b4j.example.bananovm();
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
