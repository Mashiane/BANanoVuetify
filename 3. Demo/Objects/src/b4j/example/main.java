package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 500, 500);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static String _appname = "";
public static String _apptitle = "";
public static String _publish = "";
public static String _serverip = "";
public static com.ab.banano.BANanoSQL _db = null;
public static b4j.example.bananoalasqle _alasql = null;
public static String _version = "";
public static String _port = "";
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
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 60;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
anywheresoftware.b4j.objects.JFX _fx = null;
String _url = "";
String _apppath = "";
 //BA.debugLineNum = 19;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 21;BA.debugLine="BANano.Initialize(\"BANano\", AppName, Version)";
_banano.Initialize("BANano",_appname,(long)(Double.parseDouble(_version)));
 //BA.debugLineNum = 22;BA.debugLine="BANano.HTML_NAME = \"index.html\"";
_banano.HTML_NAME = "index.html";
 //BA.debugLineNum = 23;BA.debugLine="BANano.Header.Title = AppTitle";
_banano.Header.Title = _apptitle;
 //BA.debugLineNum = 30;BA.debugLine="BANano.TranspilerOptions.UseServiceWorker = False";
_banano.TranspilerOptions.setUseServiceWorker(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 31;BA.debugLine="BANano.TranspilerOptions.MergeAllCSSFiles = False";
_banano.TranspilerOptions.setMergeAllCSSFiles(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 32;BA.debugLine="BANano.TranspilerOptions.MergeAllJavascriptFiles";
_banano.TranspilerOptions.setMergeAllJavascriptFiles(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 33;BA.debugLine="BANano.TranspilerOptions.MinifyOnline = False";
_banano.TranspilerOptions.setMinifyOnline(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 35;BA.debugLine="BANano.TranspilerOptions.EnableLiveCodeSwapping";
_banano.TranspilerOptions.setEnableLiveCodeSwapping(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 37;BA.debugLine="BANano.TranspilerOptions.RedirectOutput(File.DirA";
_banano.TranspilerOptions.RedirectOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"log.txt");
 //BA.debugLineNum = 40;BA.debugLine="BANano.PHP_NAME = $\"${AppName}.php\"$";
_banano.PHP_NAME = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_appname))+".php");
 //BA.debugLineNum = 41;BA.debugLine="BANano.PHPHost = $\"http://${ServerIP}:${Port}/${A";
_banano.PHPHost = ("http://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_serverip))+":"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_port))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_appname))+"/");
 //BA.debugLineNum = 42;BA.debugLine="BANano.PHPAddHeader(\"Access-Control-Allow-Origin:";
_banano.PHPAddHeader("Access-Control-Allow-Origin: *");
 //BA.debugLineNum = 44;BA.debugLine="BANano.Build(Publish)";
_banano.Build(_publish);
 //BA.debugLineNum = 46;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 47;BA.debugLine="Dim URL As String = File.GetUri(File.DirApp,\"log.";
_url = anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"log.txt");
 //BA.debugLineNum = 48;BA.debugLine="fx.ShowExternalDocument(URL)";
_fx.ShowExternalDocument(_url);
 //BA.debugLineNum = 50;BA.debugLine="Dim appPath As String = $\"http://localhost/${AppN";
_apppath = ("http://localhost/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_appname))+"/index.html");
 //BA.debugLineNum = 51;BA.debugLine="If Port <> \"\" Then appPath = $\"http://localhost:$";
if ((_port).equals("") == false) { 
_apppath = ("http://localhost:"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_port))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_appname))+"/index.html");};
 //BA.debugLineNum = 52;BA.debugLine="fx.ShowExternalDocument(appPath)";
_fx.ShowExternalDocument(_apppath);
 //BA.debugLineNum = 54;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public static String  _banano_ready() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub BANano_Ready";
 //BA.debugLineNum = 65;BA.debugLine="db.OpenWait(\"bvmdesigner\", \"bvmdesigner\")";
_db.OpenWait("bvmdesigner","bvmdesigner");
 //BA.debugLineNum = 66;BA.debugLine="alaSQL.Initialize(\"grid\", \"id\")";
_alasql._initialize /*b4j.example.bananoalasqle*/ (ba,"grid","id");
 //BA.debugLineNum = 67;BA.debugLine="alaSQL.SchemaAddField(\"id\", alaSQL.DB_INT)";
_alasql._schemaaddfield /*String*/ ("id",_alasql._db_int /*String*/ );
 //BA.debugLineNum = 68;BA.debugLine="alaSQL.SchemaAddField(\"controltype\", alaSQL.DB_TE";
_alasql._schemaaddfield /*String*/ ("controltype",_alasql._db_text /*String*/ );
 //BA.debugLineNum = 69;BA.debugLine="alaSQL.SchemaCreateTable";
_alasql._schemacreatetable /*b4j.example.bananoalasqle*/ ();
 //BA.debugLineNum = 70;BA.debugLine="alaSQL.result = db.ExecuteWait(alaSQL.query, alaS";
_alasql._result /*anywheresoftware.b4a.objects.collections.List*/  = _db.ExecuteWait(_alasql._query /*String*/ ,_alasql._args /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 72;BA.debugLine="alaSQL.Initialize(\"components\", \"id\")";
_alasql._initialize /*b4j.example.bananoalasqle*/ (ba,"components","id");
 //BA.debugLineNum = 73;BA.debugLine="alaSQL.SchemaAddField(\"controltype\", alaSQL.DB_TE";
_alasql._schemaaddfield /*String*/ ("controltype",_alasql._db_text /*String*/ );
 //BA.debugLineNum = 74;BA.debugLine="alaSQL.SchemaAddIntegers(Array(\"id\", \"row\",\"col\",";
_alasql._schemaaddintegers /*b4j.example.bananoalasqle*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("id"),(Object)("row"),(Object)("col"),(Object)("tabindex")}));
 //BA.debugLineNum = 75;BA.debugLine="alaSQL.SchemaAddStrings(Array(\"parentid\",\"name\",\"";
_alasql._schemaaddstrings /*b4j.example.bananoalasqle*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("parentid"),(Object)("name"),(Object)("vmodel"),(Object)("attributes"),(Object)("styles"),(Object)("classes"),(Object)("loose"),(Object)("label"),(Object)("icon"),(Object)("avatar"),(Object)("items")}));
 //BA.debugLineNum = 76;BA.debugLine="alaSQL.SchemaCreateTable";
_alasql._schemacreatetable /*b4j.example.bananoalasqle*/ ();
 //BA.debugLineNum = 77;BA.debugLine="alaSQL.result = db.ExecuteWait(alaSQL.query, alaS";
_alasql._result /*anywheresoftware.b4a.objects.collections.List*/  = _db.ExecuteWait(_alasql._query /*String*/ ,_alasql._args /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 78;BA.debugLine="pgIndex.Init";
_pgindex._init /*String*/ ();
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
pgindex._process_globals();
moditemgroups._process_globals();
modcalendar._process_globals();
modcard._process_globals();
modsparkline._process_globals();
modbuttons._process_globals();
modchips._process_globals();
moddialog._process_globals();
modbadges._process_globals();
modtabs._process_globals();
modalert._process_globals();
modautocomplete._process_globals();
modavatar._process_globals();
modbanner._process_globals();
modbottomnavigation._process_globals();
modbottomsheet._process_globals();
modbreadcrumbs._process_globals();
modcarousel._process_globals();
modcheckbox._process_globals();
modcolorpicker._process_globals();
modcombo._process_globals();
moddatatable._process_globals();
moddatepicker._process_globals();
moddesign._process_globals();
modexpansionpanels._process_globals();
modfileinput._process_globals();
modform._process_globals();
modgrid._process_globals();
modicons._process_globals();
modimages._process_globals();
modlists._process_globals();
modloadingskeleton._process_globals();
modmenus._process_globals();
modmessageboard._process_globals();
modoverlay._process_globals();
modpagination._process_globals();
modparallax._process_globals();
modprogress._process_globals();
modradiogroups._process_globals();
modrating._process_globals();
modrealtimelogging._process_globals();
modselects._process_globals();
modslidegroups._process_globals();
modslider._process_globals();
modsnackbar._process_globals();
modstepper._process_globals();
modswitch._process_globals();
modtextarea._process_globals();
modtextfield._process_globals();
modtimeline._process_globals();
modtimepicker._process_globals();
modtoolbar._process_globals();
modtoolkit._process_globals();
modtreeview._process_globals();
modwindow._process_globals();
pgbrs._process_globals();
bananoshared._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Public BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 9;BA.debugLine="Public AppName As String = \"bvmcoredemo\"";
_appname = "bvmcoredemo";
 //BA.debugLineNum = 10;BA.debugLine="Public AppTitle As String = \"BVMCoreDemo\"";
_apptitle = "BVMCoreDemo";
 //BA.debugLineNum = 11;BA.debugLine="Private Publish As String = \"C:/laragon/www\"";
_publish = "C:/laragon/www";
 //BA.debugLineNum = 12;BA.debugLine="Public ServerIP As String = \"localhost\"";
_serverip = "localhost";
 //BA.debugLineNum = 13;BA.debugLine="Private db As BANanoSQL";
_db = new com.ab.banano.BANanoSQL();
 //BA.debugLineNum = 14;BA.debugLine="Private alaSQL As BANanoAlaSQLE";
_alasql = new b4j.example.bananoalasqle();
 //BA.debugLineNum = 15;BA.debugLine="Public Version As String = \"4.34\"";
_version = "4.34";
 //BA.debugLineNum = 16;BA.debugLine="Public Port As String = \"8080\"";
_port = "8080";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
}
