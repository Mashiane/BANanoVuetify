package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananomssqle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananomssqle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananomssqle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _rectype = null;
public String _db_varchar_20 = "";
public String _db_varchar_10 = "";
public String _db_varchar_30 = "";
public String _db_varchar_40 = "";
public String _db_varchar_50 = "";
public String _db_varchar_100 = "";
public String _db_varchar_255 = "";
public String _db_string = "";
public String _db_int = "";
public String _db_float = "";
public String _db_blob = "";
public String _db_bool = "";
public String _db_real = "";
public String _db_date = "";
public String _db_integer = "";
public String _db_text = "";
public com.ab.banano.BANano _banano = null;
public String _methodname = "";
public String _methodnamedynamic = "";
public anywheresoftware.b4a.objects.collections.Map _schema = null;
public String _tablename = "";
public String _primarykey = "";
public anywheresoftware.b4a.objects.collections.Map _record = null;
public boolean _ok = false;
public String _dbase = "";
public anywheresoftware.b4a.objects.collections.List _result = null;
public String _command = "";
public anywheresoftware.b4a.objects.collections.List _types = null;
public anywheresoftware.b4a.objects.collections.List _args = null;
public String _query = "";
public String _response = "";
public String _error = "";
public long _affectedrows = 0L;
public String _json = "";
public String _host = "";
public String _username = "";
public String _password = "";
public String _auto = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moditemgroups _moditemgroups = null;
public b4j.example.modcalendar _modcalendar = null;
public b4j.example.modcard _modcard = null;
public b4j.example.modsparkline _modsparkline = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modbadges _modbadges = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modalert _modalert = null;
public b4j.example.modautocomplete _modautocomplete = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbanner _modbanner = null;
public b4j.example.modbottomnavigation _modbottomnavigation = null;
public b4j.example.modbottomsheet _modbottomsheet = null;
public b4j.example.modbreadcrumbs _modbreadcrumbs = null;
public b4j.example.modcarousel _modcarousel = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modcolorpicker _modcolorpicker = null;
public b4j.example.modcombo _modcombo = null;
public b4j.example.moddatatable _moddatatable = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddesign _moddesign = null;
public b4j.example.modexpansionpanels _modexpansionpanels = null;
public b4j.example.modfileinput _modfileinput = null;
public b4j.example.modform _modform = null;
public b4j.example.modgrid _modgrid = null;
public b4j.example.modicons _modicons = null;
public b4j.example.modimages _modimages = null;
public b4j.example.modlists _modlists = null;
public b4j.example.modloadingskeleton _modloadingskeleton = null;
public b4j.example.modmenus _modmenus = null;
public b4j.example.modmessageboard _modmessageboard = null;
public b4j.example.modoverlay _modoverlay = null;
public b4j.example.modpagination _modpagination = null;
public b4j.example.modparallax _modparallax = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradiogroups _modradiogroups = null;
public b4j.example.modrating _modrating = null;
public b4j.example.modrealtimelogging _modrealtimelogging = null;
public b4j.example.modselects _modselects = null;
public b4j.example.modslidegroups _modslidegroups = null;
public b4j.example.modslider _modslider = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modstepper _modstepper = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextfield _modtextfield = null;
public b4j.example.modtimeline _modtimeline = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtoolkit _modtoolkit = null;
public b4j.example.modtreeview _modtreeview = null;
public b4j.example.modwindow _modwindow = null;
public b4j.example.pgbrs _pgbrs = null;
public b4j.example.bananoshared _bananoshared = null;
public b4j.example.bananomssqle  _addblobs(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 484;BA.debugLine="Sub AddBlobs(fieldNames As List) As BANanoMSSQLE";
 //BA.debugLineNum = 485;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 486;BA.debugLine="recType.Put(strfld,\"BLOB\")";
_rectype.Put((Object)(_strfld),(Object)("BLOB"));
 }
};
 //BA.debugLineNum = 488;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _addbooleans(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 492;BA.debugLine="Sub AddBooleans(fieldNames As List) As BANanoMSSQL";
 //BA.debugLineNum = 493;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 494;BA.debugLine="recType.Put(strfld,\"BOOL\")";
_rectype.Put((Object)(_strfld),(Object)("BOOL"));
 }
};
 //BA.debugLineNum = 496;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _adddoubles(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 476;BA.debugLine="Sub AddDoubles(fieldNames As List) As BANanoMSSQLE";
 //BA.debugLineNum = 477;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 478;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
_rectype.Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
 //BA.debugLineNum = 480;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _addintegers(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 468;BA.debugLine="Sub AddIntegers(fieldNames As List) As BANanoMSSQL";
 //BA.debugLineNum = 469;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 470;BA.debugLine="recType.Put(strfld,\"INT\")";
_rectype.Put((Object)(_strfld),(Object)("INT"));
 }
};
 //BA.debugLineNum = 472;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _addstrings(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 460;BA.debugLine="Sub AddStrings(fieldNames As List) As BANanoMSSQLE";
 //BA.debugLineNum = 461;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 462;BA.debugLine="recType.Put(strfld,\"STRING\")";
_rectype.Put((Object)(_strfld),(Object)("STRING"));
 }
};
 //BA.debugLineNum = 464;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _andoroperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
 //BA.debugLineNum = 54;BA.debugLine="Sub AndOrOperators(sm As Map) As List    'ignore";
 //BA.debugLineNum = 55;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 56;BA.debugLine="nl.initialize";
_nl.Initialize();
 //BA.debugLineNum = 57;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 58;BA.debugLine="nl.Add(\"AND\")";
_nl.Add((Object)("AND"));
 }
};
 //BA.debugLineNum = 60;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _build() throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 884;BA.debugLine="Sub Build As Map";
 //BA.debugLineNum = 885;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 886;BA.debugLine="b.Put(\"command\", command)";
_b.Put((Object)("command"),(Object)(_command));
 //BA.debugLineNum = 887;BA.debugLine="b.Put(\"query\", query)";
_b.Put((Object)("query"),(Object)(_query));
 //BA.debugLineNum = 888;BA.debugLine="b.Put(\"args\", args)";
_b.Put((Object)("args"),(Object)(_args.getObject()));
 //BA.debugLineNum = 889;BA.debugLine="b.Put(\"types\", types)";
_b.Put((Object)("types"),(Object)(_types.getObject()));
 //BA.debugLineNum = 890;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 891;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _builddynamic() throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 894;BA.debugLine="Sub BuildDynamic As Map";
 //BA.debugLineNum = 895;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 896;BA.debugLine="b.Put(\"command\", command)";
_b.Put((Object)("command"),(Object)(_command));
 //BA.debugLineNum = 897;BA.debugLine="b.Put(\"query\", query)";
_b.Put((Object)("query"),(Object)(_query));
 //BA.debugLineNum = 898;BA.debugLine="b.Put(\"args\", args)";
_b.Put((Object)("args"),(Object)(_args.getObject()));
 //BA.debugLineNum = 899;BA.debugLine="b.Put(\"types\", types)";
_b.Put((Object)("types"),(Object)(_types.getObject()));
 //BA.debugLineNum = 900;BA.debugLine="b.put(\"host\", host)";
_b.Put((Object)("host"),(Object)(_host));
 //BA.debugLineNum = 901;BA.debugLine="b.Put(\"username\", username)";
_b.Put((Object)("username"),(Object)(_username));
 //BA.debugLineNum = 902;BA.debugLine="b.Put(\"password\", password)";
_b.Put((Object)("password"),(Object)(_password));
 //BA.debugLineNum = 903;BA.debugLine="b.Put(\"dbname\", DBase)";
_b.Put((Object)("dbname"),(Object)(_dbase));
 //BA.debugLineNum = 904;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 905;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private recType As Map";
_rectype = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Public const DB_VARCHAR_20 As String = \"VARCHAR(2";
_db_varchar_20 = "VARCHAR(20)";
 //BA.debugLineNum = 5;BA.debugLine="Public const DB_VARCHAR_10 As String = \"VARCHAR(1";
_db_varchar_10 = "VARCHAR(10)";
 //BA.debugLineNum = 6;BA.debugLine="Public const DB_VARCHAR_30 As String = \"VARCHAR(3";
_db_varchar_30 = "VARCHAR(30)";
 //BA.debugLineNum = 7;BA.debugLine="Public const DB_VARCHAR_40 As String = \"VARCHAR(4";
_db_varchar_40 = "VARCHAR(40)";
 //BA.debugLineNum = 8;BA.debugLine="Public const DB_VARCHAR_50 As String = \"VARCHAR(5";
_db_varchar_50 = "VARCHAR(50)";
 //BA.debugLineNum = 9;BA.debugLine="Public const DB_VARCHAR_100 As String = \"VARCHAR(";
_db_varchar_100 = "VARCHAR(100)";
 //BA.debugLineNum = 10;BA.debugLine="Public const DB_VARCHAR_255 As String = \"VARCHAR(";
_db_varchar_255 = "VARCHAR(255)";
 //BA.debugLineNum = 11;BA.debugLine="Public const DB_STRING As String = \"TEXT\"";
_db_string = "TEXT";
 //BA.debugLineNum = 12;BA.debugLine="Public const DB_INT As String = \"INT\"";
_db_int = "INT";
 //BA.debugLineNum = 13;BA.debugLine="Public const DB_FLOAT As String = \"FLOAT\"";
_db_float = "FLOAT";
 //BA.debugLineNum = 14;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
_db_blob = "BLOB";
 //BA.debugLineNum = 15;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
_db_bool = "BOOL";
 //BA.debugLineNum = 16;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
_db_real = "REAL";
 //BA.debugLineNum = 17;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
_db_date = "DATE";
 //BA.debugLineNum = 18;BA.debugLine="Public const DB_INTEGER As String = \"INTEGER\"";
_db_integer = "INTEGER";
 //BA.debugLineNum = 19;BA.debugLine="Public const DB_TEXT As String = \"TEXT\"";
_db_text = "TEXT";
 //BA.debugLineNum = 20;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 21;BA.debugLine="Public MethodName As String";
_methodname = "";
 //BA.debugLineNum = 22;BA.debugLine="Public MethodNameDynamic As String";
_methodnamedynamic = "";
 //BA.debugLineNum = 23;BA.debugLine="Private Schema As Map";
_schema = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 24;BA.debugLine="Public TableName As String";
_tablename = "";
 //BA.debugLineNum = 25;BA.debugLine="Public PrimaryKey As String";
_primarykey = "";
 //BA.debugLineNum = 26;BA.debugLine="Public Record As Map";
_record = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 27;BA.debugLine="Public OK As Boolean";
_ok = false;
 //BA.debugLineNum = 28;BA.debugLine="Public DBase As String";
_dbase = "";
 //BA.debugLineNum = 29;BA.debugLine="Public result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 30;BA.debugLine="Public command As String";
_command = "";
 //BA.debugLineNum = 31;BA.debugLine="Public types As List";
_types = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 32;BA.debugLine="Public args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 33;BA.debugLine="Public query As String";
_query = "";
 //BA.debugLineNum = 34;BA.debugLine="Public response As String";
_response = "";
 //BA.debugLineNum = 35;BA.debugLine="Public error As String";
_error = "";
 //BA.debugLineNum = 36;BA.debugLine="Public affectedRows As Long";
_affectedrows = 0L;
 //BA.debugLineNum = 37;BA.debugLine="Public json As String";
_json = "";
 //BA.debugLineNum = 38;BA.debugLine="Private Schema As Map";
_schema = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 39;BA.debugLine="Private host As String";
_host = "";
 //BA.debugLineNum = 40;BA.debugLine="Private username As String";
_username = "";
 //BA.debugLineNum = 41;BA.debugLine="Private password As String";
_password = "";
 //BA.debugLineNum = 42;BA.debugLine="Private Auto As String";
_auto = "";
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssqle  _createtable(anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
String _fldname = "";
String _fldtype = "";
int _fldtot = 0;
int _fldcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 326;BA.debugLine="public Sub CreateTable(tblFields As Map) As BANano";
 //BA.debugLineNum = 327;BA.debugLine="Dim fldName As String";
_fldname = "";
 //BA.debugLineNum = 328;BA.debugLine="Dim fldType As String";
_fldtype = "";
 //BA.debugLineNum = 329;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
 //BA.debugLineNum = 330;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
 //BA.debugLineNum = 331;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 332;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 333;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 334;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
 //BA.debugLineNum = 335;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
 //BA.debugLineNum = 336;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
 //BA.debugLineNum = 337;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
 //BA.debugLineNum = 338;BA.debugLine="fldType = fldType.Replace(\"STRING\", \"TEXT\")";
_fldtype = _fldtype.replace("STRING","TEXT");
 //BA.debugLineNum = 339;BA.debugLine="fldType = fldType.Replace(\"TEXT\", \"VARCHAR(255)\"";
_fldtype = _fldtype.replace("TEXT","VARCHAR(255)");
 //BA.debugLineNum = 340;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
 //BA.debugLineNum = 341;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
 //BA.debugLineNum = 343;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(_escapefield(_fldname));
 //BA.debugLineNum = 344;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 345;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
 //BA.debugLineNum = 346;BA.debugLine="If fldName.EqualsIgnoreCase(Auto) Then";
if (_fldname.equalsIgnoreCase(_auto)) { 
 //BA.debugLineNum = 347;BA.debugLine="sb.Append(\" IDENTITY(1,1)\")";
_sb.Append(" IDENTITY(1,1)");
 };
 //BA.debugLineNum = 349;BA.debugLine="If fldName.EqualsIgnoreCase(PrimaryKey) Then";
if (_fldname.equalsIgnoreCase(_primarykey)) { 
 //BA.debugLineNum = 350;BA.debugLine="sb.Append(\" PRIMARY KEY\")";
_sb.Append(" PRIMARY KEY");
 };
 }
};
 //BA.debugLineNum = 353;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 355;BA.debugLine="query = \"CREATE TABLE \" & EscapeField(TableName)";
_query = "CREATE TABLE "+_escapefield(_tablename)+" "+_sb.ToString();
 //BA.debugLineNum = 356;BA.debugLine="command = \"createtable\"";
_command = "createtable";
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="private Sub CStr(o As Object) As String";
 //BA.debugLineNum = 402;BA.debugLine="If o = BANano.UNDEFINED Then o = \"\"";
if ((_o).equals(_banano.UNDEFINED())) { 
_o = (Object)("");};
 //BA.debugLineNum = 403;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssqle  _delete(String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
 //BA.debugLineNum = 695;BA.debugLine="Sub Delete(primaryValue As String) As BANanoMSSQLE";
 //BA.debugLineNum = 696;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 697;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 698;BA.debugLine="DeleteWhere(TableName, qw, Array(\"=\"))";
_deletewhere(_tablename,_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}));
 //BA.debugLineNum = 699;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 700;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _deleteall() throws Exception{
String _sb = "";
 //BA.debugLineNum = 157;BA.debugLine="Sub DeleteAll As BANanoMSSQLE";
 //BA.debugLineNum = 158;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(Ta";
_sb = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+"");
 //BA.debugLineNum = 159;BA.debugLine="query = sb";
_query = _sb;
 //BA.debugLineNum = 160;BA.debugLine="command = \"delete\"";
_command = "delete";
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _deletewhere(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _opr = "";
 //BA.debugLineNum = 802;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
 //BA.debugLineNum = 803;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 804;BA.debugLine="Log($\"BANanoMSSQLE.DeleteWhere: '${tblName}' sch";
__c.Log(("BANanoMSSQLE.DeleteWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
 //BA.debugLineNum = 806;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 807;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 808;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 809;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 810;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 811;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 812;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 813;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 814;BA.debugLine="For i = 0 To iWhere";
{
final int step12 = 1;
final int limit12 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 815;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 816;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 818;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 819;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 820;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 821;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 823;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 824;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 825;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 826;BA.debugLine="command = \"delete\"";
_command = "delete";
 //BA.debugLineNum = 827;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 828;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
 //BA.debugLineNum = 239;BA.debugLine="Sub EQOperators(sm As Map) As List    'ignore";
 //BA.debugLineNum = 240;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 241;BA.debugLine="nl.initialize";
_nl.Initialize();
 //BA.debugLineNum = 242;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 243;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
 //BA.debugLineNum = 245;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public String  _escapefield(String _f) throws Exception{
 //BA.debugLineNum = 506;BA.debugLine="Private Sub EscapeField(f As String) As String";
 //BA.debugLineNum = 507;BA.debugLine="Return $\"[${f}]\"$";
if (true) return ("["+__c.SmartStringFormatter("",(Object)(_f))+"]");
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssqle  _execute(String _strsql) throws Exception{
 //BA.debugLineNum = 511;BA.debugLine="Sub Execute(strSQL As String) As BANanoMSSQLE";
 //BA.debugLineNum = 512;BA.debugLine="strSQL = strSQL.trim";
_strsql = _strsql.trim();
 //BA.debugLineNum = 513;BA.debugLine="query = strSQL";
_query = _strsql;
 //BA.debugLineNum = 514;BA.debugLine="command = \"execute\"";
_command = "execute";
 //BA.debugLineNum = 515;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _exists(String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
 //BA.debugLineNum = 704;BA.debugLine="Sub Exists(primaryValue As String) As BANanoMSSQLE";
 //BA.debugLineNum = 705;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 706;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 707;BA.debugLine="SelectWhere(TableName, Array(PrimaryKey), qw, Nul";
_selectwhere(_tablename,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}),_qw,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 708;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 709;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _firstrecord() throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 500;BA.debugLine="Sub FirstRecord As Map";
 //BA.debugLineNum = 501;BA.debugLine="Dim rec As Map = result.Get(0)";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_result.Get((int) (0))));
 //BA.debugLineNum = 502;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _fromjson() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 134;BA.debugLine="Sub FromJSON As BANanoMSSQLE";
 //BA.debugLineNum = 135;BA.debugLine="OK = False";
_ok = __c.False;
 //BA.debugLineNum = 136;BA.debugLine="If json.StartsWith(\"{\") Or json.Startswith(\"[\") T";
if (_json.startsWith("{") || _json.startsWith("[")) { 
 //BA.debugLineNum = 137;BA.debugLine="Dim m As Map = BANano.FromJson(json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_banano.FromJson((Object)(_json))));
 //BA.debugLineNum = 138;BA.debugLine="response = m.Get(\"response\")";
_response = BA.ObjectToString(_m.Get((Object)("response")));
 //BA.debugLineNum = 139;BA.debugLine="error = m.Get(\"error\")";
_error = BA.ObjectToString(_m.Get((Object)("error")));
 //BA.debugLineNum = 140;BA.debugLine="result = m.Get(\"result\")";
_result = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)("result"))));
 //BA.debugLineNum = 141;BA.debugLine="affectedRows = m.Get(\"affectedRows\")";
_affectedrows = BA.ObjectToLongNumber(_m.Get((Object)("affectedRows")));
 //BA.debugLineNum = 142;BA.debugLine="If response = \"Success\" Then";
if ((_response).equals("Success")) { 
 //BA.debugLineNum = 143;BA.debugLine="OK = True";
_ok = __c.True;
 };
 }else {
 //BA.debugLineNum = 146;BA.debugLine="response = json";
_response = _json;
 //BA.debugLineNum = 147;BA.debugLine="error = json";
_error = _json;
 //BA.debugLineNum = 148;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 149;BA.debugLine="affectedRows = -1";
_affectedrows = (long) (-1);
 //BA.debugLineNum = 150;BA.debugLine="OK = False";
_ok = __c.False;
 };
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 595;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
 //BA.debugLineNum = 596;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 597;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 598;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 599;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 600;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 601;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 602;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 603;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 605;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 606;BA.debugLine="End Sub";
return null;
}
public String  _getmaptype(String _k) throws Exception{
String _coltype = "";
 //BA.debugLineNum = 544;BA.debugLine="private Sub GetMapType(k As String) As String";
 //BA.debugLineNum = 545;BA.debugLine="If recType.ContainsKey(k) Then";
if (_rectype.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 546;BA.debugLine="Dim colType As String = recType.GetDefault(k, \"S";
_coltype = BA.ObjectToString(_rectype.GetDefault((Object)(_k),(Object)("STRING")));
 //BA.debugLineNum = 547;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"INTEGER","INT","BOOL","BOOLEAN","BLOB","REAL","FLOAT","DOUBLE")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 549;BA.debugLine="Return \"i\"";
if (true) return "i";
 break; }
case 4: {
 //BA.debugLineNum = 551;BA.debugLine="Return \"b\"";
if (true) return "b";
 break; }
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 553;BA.debugLine="Return \"d\"";
if (true) return "d";
 break; }
default: {
 //BA.debugLineNum = 555;BA.debugLine="Return \"s\"";
if (true) return "s";
 break; }
}
;
 }else {
 //BA.debugLineNum = 558;BA.debugLine="Return \"s\"";
if (true) return "s";
 };
 //BA.debugLineNum = 560;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
 //BA.debugLineNum = 520;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
 //BA.debugLineNum = 521;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 522;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
 //BA.debugLineNum = 523;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 524;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 525;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 526;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 527;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 528;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(_rectype.GetDefault((Object)(_col),(Object)("STRING")));
 //BA.debugLineNum = 529;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"INTEGER","INT","BOOL","BOOLEAN","BLOB","REAL","FLOAT","DOUBLE")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 531;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 4: {
 //BA.debugLineNum = 533;BA.debugLine="listOfTypes.add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 535;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
default: {
 //BA.debugLineNum = 537;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
}
;
 }
};
 //BA.debugLineNum = 540;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
 //BA.debugLineNum = 541;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _key = "";
String _value = "";
String _vtype = "";
 //BA.debugLineNum = 563;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
 //BA.debugLineNum = 564;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 565;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 566;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 567;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 568;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 569;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 571;BA.debugLine="Dim key As String = sourceMap.getkeyat(iCnt)";
_key = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 572;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
 //BA.debugLineNum = 573;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 574;BA.debugLine="value = value.trim";
_value = _value.trim();
 //BA.debugLineNum = 576;BA.debugLine="Dim vtype As String = GetMapType(key)";
_vtype = _getmaptype(_key);
 //BA.debugLineNum = 577;BA.debugLine="Select Case vtype";
switch (BA.switchObjectToInt(_vtype,"i","d","s","b")) {
case 0: {
 //BA.debugLineNum = 580;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 581;BA.debugLine="value = BANano.parseInt(value)";
_value = BA.NumberToString(_banano.parseInt((Object)(_value)));
 break; }
case 1: {
 //BA.debugLineNum = 584;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 585;BA.debugLine="value = BANano.parsefloat(value)";
_value = BA.NumberToString(_banano.parseFloat((Object)(_value)));
 break; }
case 2: 
case 3: {
 break; }
}
;
 //BA.debugLineNum = 589;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 591;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _getmax() throws Exception{
String _sb = "";
 //BA.debugLineNum = 367;BA.debugLine="Sub GetMax As BANanoMSSQLE";
 //BA.debugLineNum = 368;BA.debugLine="Dim sb As String = $\"SELECT MAX(${PrimaryKey}) As";
_sb = ("SELECT MAX("+__c.SmartStringFormatter("",(Object)(_primarykey))+") As "+__c.SmartStringFormatter("",(Object)(_primarykey))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+"");
 //BA.debugLineNum = 369;BA.debugLine="query = sb";
_query = _sb;
 //BA.debugLineNum = 370;BA.debugLine="command = \"getmax\"";
_command = "getmax";
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _getmin() throws Exception{
String _sb = "";
 //BA.debugLineNum = 375;BA.debugLine="Sub GetMin As BANanoMSSQLE";
 //BA.debugLineNum = 376;BA.debugLine="Dim sb As String = $\"SELECT MIN(${PrimaryKey}) As";
_sb = ("SELECT MIN("+__c.SmartStringFormatter("",(Object)(_primarykey))+") As "+__c.SmartStringFormatter("",(Object)(_primarykey))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+"");
 //BA.debugLineNum = 377;BA.debugLine="query = sb";
_query = _sb;
 //BA.debugLineNum = 378;BA.debugLine="command = \"getmin\"";
_command = "getmin";
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public String  _getnextid() throws Exception{
int _nextid = 0;
String _strid = "";
anywheresoftware.b4a.objects.collections.Map _nr = null;
String _ni = "";
 //BA.debugLineNum = 382;BA.debugLine="Sub GetNextID As String";
 //BA.debugLineNum = 383;BA.debugLine="Dim nextid As Int";
_nextid = 0;
 //BA.debugLineNum = 384;BA.debugLine="Dim strid As String";
_strid = "";
 //BA.debugLineNum = 386;BA.debugLine="If result.Size = 0 Then";
if (_result.getSize()==0) { 
 //BA.debugLineNum = 387;BA.debugLine="nextid = 0";
_nextid = (int) (0);
 }else {
 //BA.debugLineNum = 389;BA.debugLine="Dim nr As Map = result.Get(0)";
_nr = new anywheresoftware.b4a.objects.collections.Map();
_nr = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_result.Get((int) (0))));
 //BA.debugLineNum = 390;BA.debugLine="Dim ni As String = nr.GetDefault(PrimaryKey,\"0\")";
_ni = BA.ObjectToString(_nr.GetDefault((Object)(_primarykey),(Object)("0")));
 //BA.debugLineNum = 391;BA.debugLine="nextid = BANano.parseInt(ni)";
_nextid = _banano.parseInt((Object)(_ni));
 };
 //BA.debugLineNum = 393;BA.debugLine="nextid = nextid + 1";
_nextid = (int) (_nextid+1);
 //BA.debugLineNum = 394;BA.debugLine="strid = CStr(nextid)";
_strid = _cstr((Object)(_nextid));
 //BA.debugLineNum = 395;BA.debugLine="nextid = BANano.ParseInt(nextid)";
_nextid = _banano.parseInt((Object)(_nextid));
 //BA.debugLineNum = 396;BA.debugLine="Return strid";
if (true) return _strid;
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssqle  _gettablenames() throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub GetTableNames As BANanoMSSQLE";
 //BA.debugLineNum = 114;BA.debugLine="query = $\"select table_name from information_sche";
_query = ("select table_name from information_schema.tables where TABLE_TYPE = 'BASE TABLE' and table_name not in ('MSreplication_options','spt_fallback_db', 'spt_fallback_dev', 'spt_fallback_usg', 'spt_monitor') order by table_name");
 //BA.debugLineNum = 115;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _gettablestructure() throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub GetTableStructure As BANanoMSSQLE";
 //BA.debugLineNum = 121;BA.debugLine="query = $\"select character_maximum_length, column";
_query = ("select character_maximum_length, column_name, data_type from information_schema.columns where table_name = '"+__c.SmartStringFormatter("",(Object)(_tablename))+"'");
 //BA.debugLineNum = 122;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _initialize(anywheresoftware.b4a.BA _ba,String _dbname,String _tblname,String _pk,String _ai) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 407;BA.debugLine="Sub Initialize(dbName As String, tblName As String";
 //BA.debugLineNum = 408;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 409;BA.debugLine="Schema.Initialize";
_schema.Initialize();
 //BA.debugLineNum = 410;BA.debugLine="Record.Initialize";
_record.Initialize();
 //BA.debugLineNum = 411;BA.debugLine="MethodName = \"BANanoMSSQL\"";
_methodname = "BANanoMSSQL";
 //BA.debugLineNum = 412;BA.debugLine="MethodNameDynamic = \"BANanoMSSQLDynamic\"";
_methodnamedynamic = "BANanoMSSQLDynamic";
 //BA.debugLineNum = 413;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 414;BA.debugLine="command = \"\"";
_command = "";
 //BA.debugLineNum = 415;BA.debugLine="PrimaryKey = PK";
_primarykey = _pk;
 //BA.debugLineNum = 416;BA.debugLine="DBase = dbName";
_dbase = _dbname;
 //BA.debugLineNum = 417;BA.debugLine="TableName = tblName";
_tablename = _tblname;
 //BA.debugLineNum = 418;BA.debugLine="types.Initialize";
_types.Initialize();
 //BA.debugLineNum = 419;BA.debugLine="args.Initialize";
_args.Initialize();
 //BA.debugLineNum = 420;BA.debugLine="types = Null";
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 421;BA.debugLine="args = Null";
_args = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 422;BA.debugLine="query = \"\"";
_query = "";
 //BA.debugLineNum = 423;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 424;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 425;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 426;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 427;BA.debugLine="OK = False";
_ok = __c.False;
 //BA.debugLineNum = 428;BA.debugLine="host = \"\"";
_host = "";
 //BA.debugLineNum = 429;BA.debugLine="username = \"\"";
_username = "";
 //BA.debugLineNum = 430;BA.debugLine="password = \"\"";
_password = "";
 //BA.debugLineNum = 431;BA.debugLine="Auto = AI";
_auto = _ai;
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _insert() throws Exception{
 //BA.debugLineNum = 610;BA.debugLine="Sub Insert As BANanoMSSQLE";
 //BA.debugLineNum = 611;BA.debugLine="Insert1(Record)";
_insert1(_record);
 //BA.debugLineNum = 612;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 613;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _insert1(anywheresoftware.b4a.objects.collections.Map _rec) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
 //BA.debugLineNum = 616;BA.debugLine="Sub Insert1(Rec As Map) As BANanoMSSQLE";
 //BA.debugLineNum = 617;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 618;BA.debugLine="Log($\"BANanoMSSQLE.Insert: '${TableName}' schema";
__c.Log(("BANanoMSSQLE.Insert: '"+__c.SmartStringFormatter("",(Object)(_tablename))+"' schema is not set!"));
 };
 //BA.debugLineNum = 620;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 621;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 622;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 623;BA.debugLine="Dim listOfValues As List = GetMapValues(Rec)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_rec);
 //BA.debugLineNum = 624;BA.debugLine="Dim listOfTypes As List = GetMapTypes(Rec)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_rec);
 //BA.debugLineNum = 625;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 626;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 627;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 628;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 629;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 630;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(TableName)}";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" ("));
 //BA.debugLineNum = 631;BA.debugLine="iTot = Rec.Size - 1";
_itot = (int) (_rec.getSize()-1);
 //BA.debugLineNum = 632;BA.debugLine="For iCnt = 0 To iTot";
{
final int step16 = 1;
final int limit16 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit16 ;_icnt = _icnt + step16 ) {
 //BA.debugLineNum = 633;BA.debugLine="Dim col As String = Rec.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_rec.GetKeyAt(_icnt));
 //BA.debugLineNum = 634;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 635;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 636;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 638;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 639;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 641;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 642;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 643;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 644;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 645;BA.debugLine="query = sb.ToString";
_query = _sb.ToString();
 //BA.debugLineNum = 646;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 647;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 648;BA.debugLine="command = \"insert\"";
_command = "insert";
 //BA.debugLineNum = 649;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 650;BA.debugLine="End Sub";
return null;
}
public String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 671;BA.debugLine="private Sub Join(delimiter As String, lst As List)";
 //BA.debugLineNum = 672;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 673;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 674;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 675;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 676;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 677;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 678;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 679;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 680;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 682;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
return "";
}
public String  _joinfields(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 654;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
 //BA.debugLineNum = 655;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 656;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 657;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 658;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 659;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 660;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 661;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 662;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 663;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 664;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 665;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 667;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 668;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _jsonx = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 436;BA.debugLine="private Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 437;BA.debugLine="Dim jsonx As BANanoJSONParser";
_jsonx = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 438;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 439;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 440;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 441;BA.debugLine="Try";
try { //BA.debugLineNum = 442;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 443;BA.debugLine="jsonx.Initialize(strJSON)";
_jsonx.Initialize(_strjson);
 //BA.debugLineNum = 444;BA.debugLine="Map1 = jsonx.NextObject";
_map1 = _jsonx.NextObject();
 };
 //BA.debugLineNum = 446;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 448;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 450;BA.debugLine="End Sub";
return null;
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _jsonx = null;
 //BA.debugLineNum = 453;BA.debugLine="private Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 454;BA.debugLine="Dim jsonx As BANanoJSONGenerator";
_jsonx = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 455;BA.debugLine="jsonx.Initialize(mp)";
_jsonx.Initialize(_mp);
 //BA.debugLineNum = 456;BA.debugLine="Return jsonx.ToString";
if (true) return _jsonx.ToString();
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _newlist() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 127;BA.debugLine="Sub NewList As List";
 //BA.debugLineNum = 128;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 129;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 130;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _read(String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
 //BA.debugLineNum = 687;BA.debugLine="Sub Read(primaryValue As String) As BANanoMSSQLE";
 //BA.debugLineNum = 688;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 689;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 690;BA.debugLine="SelectWhere(TableName, Array(\"*\"), qw, Null, Arra";
_selectwhere(_tablename,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),_qw,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 691;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 692;BA.debugLine="End Sub";
return null;
}
public String  _recordfrommap(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 248;BA.debugLine="Sub RecordFromMap(sm As Map)";
 //BA.debugLineNum = 249;BA.debugLine="Record.Initialize";
_record.Initialize();
 //BA.debugLineNum = 250;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _sm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 251;BA.debugLine="Dim v As Object = sm.Get(k)";
_v = _sm.Get((Object)(_k));
 //BA.debugLineNum = 252;BA.debugLine="Record.Put(k, v)";
_record.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssqle  _resettypes() throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub ResetTypes As BANanoMSSQLE";
 //BA.debugLineNum = 362;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemaaddblob(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 169;BA.debugLine="Sub SchemaAddBlob(bools As List) As BANanoMSSQLE";
 //BA.debugLineNum = 170;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 171;BA.debugLine="Schema.Put(b, DB_BLOB)";
_schema.Put((Object)(_b),(Object)(_db_blob));
 }
};
 //BA.debugLineNum = 173;BA.debugLine="AddBlobs(bools)";
_addblobs(_bools);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemaaddblobs(anywheresoftware.b4a.objects.collections.List _blobs) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SchemaAddBlobs(blobs As List) As BANanoMSSQLE";
 //BA.debugLineNum = 302;BA.debugLine="SchemaAddBlob(blobs)";
_schemaaddblob(_blobs);
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemaaddboolean(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 179;BA.debugLine="Sub SchemaAddBoolean(bools As List) As BANanoMSSQL";
 //BA.debugLineNum = 180;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 181;BA.debugLine="Schema.Put(b, DB_BOOL)";
_schema.Put((Object)(_b),(Object)(_db_bool));
 }
};
 //BA.debugLineNum = 183;BA.debugLine="AddBooleans(bools)";
_addbooleans(_bools);
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemaaddbooleans(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SchemaAddBooleans(bools As List) As BANanoMSSQ";
 //BA.debugLineNum = 269;BA.debugLine="SchemaAddBoolean(bools)";
_schemaaddboolean(_bools);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemaadddate(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 188;BA.debugLine="Sub SchemaAddDate(bools As List) As BANanoMSSQLE";
 //BA.debugLineNum = 189;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 190;BA.debugLine="Schema.Put(b, DB_DATE)";
_schema.Put((Object)(_b),(Object)(_db_date));
 }
};
 //BA.debugLineNum = 192;BA.debugLine="AddStrings(bools)";
_addstrings(_bools);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemaadddates(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SchemaAddDates(dates As List) As BANanoMSSQLE";
 //BA.debugLineNum = 320;BA.debugLine="SchemaAddDate(dates)";
_schemaadddate(_dates);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemaadddoubles(anywheresoftware.b4a.objects.collections.List _dbls) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SchemaAddDoubles(dbls As List) As BANanoMSSQLE";
 //BA.debugLineNum = 296;BA.debugLine="SchemaAddFloat(dbls)";
_schemaaddfloat(_dbls);
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public String  _schemaaddfield(String _fldname,String _fldtype) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SchemaAddField(fldName As String, fldType As S";
 //BA.debugLineNum = 165;BA.debugLine="Schema.Put(fldName, fldType)";
_schema.Put((Object)(_fldname),(Object)(_fldtype));
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssqle  _schemaaddfloat(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 197;BA.debugLine="Sub SchemaAddFloat(bools As List) As BANanoMSSQLE";
 //BA.debugLineNum = 198;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 199;BA.debugLine="Schema.Put(b, DB_FLOAT)";
_schema.Put((Object)(_b),(Object)(_db_float));
 }
};
 //BA.debugLineNum = 201;BA.debugLine="AddDoubles(bools)";
_adddoubles(_bools);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemaaddint(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 215;BA.debugLine="Sub SchemaAddInt(bools As List) As BANanoMSSQLE";
 //BA.debugLineNum = 216;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 217;BA.debugLine="Schema.Put(b, DB_INT)";
_schema.Put((Object)(_b),(Object)(_db_int));
 }
};
 //BA.debugLineNum = 219;BA.debugLine="AddIntegers(bools)";
_addintegers(_bools);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemaaddintegers(anywheresoftware.b4a.objects.collections.List _ints) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SchemaAddIntegers(ints As List) As BANanoMSSQL";
 //BA.debugLineNum = 291;BA.debugLine="SchemaAddInt(ints)";
_schemaaddint(_ints);
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemaaddstrings(anywheresoftware.b4a.objects.collections.List _strings) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub SchemaAddStrings(strings As List) As BANanoMSS";
 //BA.debugLineNum = 308;BA.debugLine="SchemaAddText(strings)";
_schemaaddtext(_strings);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemaaddtext(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 205;BA.debugLine="Sub SchemaAddText(bools As List) As BANanoMSSQLE";
 //BA.debugLineNum = 206;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 207;BA.debugLine="Schema.Put(b, DB_STRING)";
_schema.Put((Object)(_b),(Object)(_db_string));
 }
};
 //BA.debugLineNum = 209;BA.debugLine="AddStrings(bools)";
_addstrings(_bools);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemaclear() throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SchemaClear As BANanoMSSQLE";
 //BA.debugLineNum = 258;BA.debugLine="Schema.clear";
_schema.Clear();
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemacreatetable() throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SchemaCreateTable As BANanoMSSQLE";
 //BA.debugLineNum = 315;BA.debugLine="Return CreateTable(Schema)";
if (true) return _createtable(_schema);
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _schemafromdesign(b4j.example.vmcontainer _cont) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub SchemaFromDesign(cont As VMContainer) As BANan";
 //BA.debugLineNum = 276;BA.debugLine="SchemaAddBoolean(cont.Booleans)";
_schemaaddboolean(_cont._booleans /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 277;BA.debugLine="SchemaAddDate(cont.Dates)";
_schemaadddate(_cont._dates /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 278;BA.debugLine="SchemaAddFloat(cont.Doubles)";
_schemaaddfloat(_cont._doubles /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 279;BA.debugLine="SchemaAddInt(cont.Integers)";
_schemaaddint(_cont._integers /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 280;BA.debugLine="SchemaAddText(cont.Strings)";
_schemaaddtext(_cont._strings /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 282;BA.debugLine="AddStrings(cont.Strings)";
_addstrings(_cont._strings /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 283;BA.debugLine="AddIntegers(cont.Integers)";
_addintegers(_cont._integers /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 284;BA.debugLine="AddDoubles(cont.Doubles)";
_adddoubles(_cont._doubles /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 285;BA.debugLine="AddBooleans(cont.Booleans)";
_addbooleans(_cont._booleans /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 286;BA.debugLine="AddStrings(cont.Dates)";
_addstrings(_cont._dates /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _selectall(anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
 //BA.debugLineNum = 832;BA.debugLine="Sub SelectAll(tblfields As List, orderBy As List)";
 //BA.debugLineNum = 834;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 835;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 836;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 838;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 840;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 842;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 843;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 844;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+""));
 //BA.debugLineNum = 845;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 847;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 848;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 849;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 852;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 853;BA.debugLine="command =  \"select\"";
_command = "select";
 //BA.debugLineNum = 854;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 855;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _selectdistinctall(anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
 //BA.debugLineNum = 858;BA.debugLine="Sub SelectDistinctAll(tblfields As List, orderBy A";
 //BA.debugLineNum = 860;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 861;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 862;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 864;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 866;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 868;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 869;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 870;BA.debugLine="sb.Append($\"SELECT DISTINCT ${selFIelds} FROM ${E";
_sb.Append(("SELECT DISTINCT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+""));
 //BA.debugLineNum = 871;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 873;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 874;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 875;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 878;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 879;BA.debugLine="command =  \"select\"";
_command = "select";
 //BA.debugLineNum = 880;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 881;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _selectdistinctwhere(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _oper = "";
String _stro = "";
 //BA.debugLineNum = 757;BA.debugLine="Sub SelectDistinctWhere(tblName As String, tblfiel";
 //BA.debugLineNum = 758;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 759;BA.debugLine="Log($\"BANanoMSSQLE.SelectWhere: '${tblName}' sch";
__c.Log(("BANanoMSSQLE.SelectWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
 //BA.debugLineNum = 761;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 762;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 763;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 765;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 766;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 767;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 769;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 771;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 773;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 774;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 775;BA.debugLine="sb.Append($\"SELECT DISTINCT ${selFIelds} FROM ${E";
_sb.Append(("SELECT DISTINCT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 776;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 777;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 778;BA.debugLine="For i = 0 To iWhere";
{
final int step20 = 1;
final int limit20 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 779;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 780;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 782;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 783;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 784;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 785;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 }
};
 //BA.debugLineNum = 787;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 789;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 790;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 791;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 794;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 795;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 796;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 797;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 798;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 799;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _selectwhere(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _opr = "";
String _stro = "";
 //BA.debugLineNum = 712;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
 //BA.debugLineNum = 713;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 714;BA.debugLine="Log($\"BANanoMSSQLE.SelectWhere: '${tblName}' sch";
__c.Log(("BANanoMSSQLE.SelectWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
 //BA.debugLineNum = 716;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 717;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 718;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 720;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 721;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 722;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 724;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 726;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 728;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 729;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 730;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 731;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 732;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 733;BA.debugLine="For i = 0 To iWhere";
{
final int step20 = 1;
final int limit20 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 734;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 735;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 737;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 738;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 739;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 740;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 742;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 744;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 745;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 746;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 749;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 750;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 751;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 752;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 753;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 754;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _selectwhere1(anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _andor,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _sandor = "";
String _col = "";
String _opr = "";
String _stro = "";
 //BA.debugLineNum = 64;BA.debugLine="Sub SelectWhere1(tblfields As List, tblWhere As Ma";
 //BA.debugLineNum = 65;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 66;BA.debugLine="If AndOr = Null Then AndOr = AndOrOperators(tblWh";
if (_andor== null) { 
_andor = _andoroperators(_tblwhere);};
 //BA.debugLineNum = 67;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 68;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 70;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 71;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 72;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 74;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 76;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 78;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 79;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 80;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" WHERE "));
 //BA.debugLineNum = 81;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 82;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 83;BA.debugLine="For i = 0 To iWhere";
{
final int step18 = 1;
final int limit18 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
 //BA.debugLineNum = 84;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 85;BA.debugLine="Dim sandor As String = AndOr.get(i)";
_sandor = BA.ObjectToString(_andor.Get(_i));
 //BA.debugLineNum = 86;BA.debugLine="sb.Append($\" ${sandor} \"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_sandor))+" "));
 };
 //BA.debugLineNum = 88;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 89;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 90;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 91;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 93;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 95;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 96;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 97;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 100;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 101;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 102;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 103;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 104;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 105;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 106;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 107;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 108;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _setconnection(String _shost,String _susername,String _spassword) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetConnection(shost As String, susername As St";
 //BA.debugLineNum = 47;BA.debugLine="host = shost";
_host = _shost;
 //BA.debugLineNum = 48;BA.debugLine="username = susername";
_username = _susername;
 //BA.debugLineNum = 49;BA.debugLine="password = spassword";
_password = _spassword;
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _setfield(String _fldname,Object _fldvalue) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetField(fldName As String, fldValue As Object";
 //BA.debugLineNum = 264;BA.debugLine="Record.Put(fldName, fldValue)";
_record.Put((Object)(_fldname),_fldvalue);
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _update(String _privalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tblwhere = null;
 //BA.debugLineNum = 224;BA.debugLine="Sub Update(priValue As String) As BANanoMSSQLE";
 //BA.debugLineNum = 225;BA.debugLine="Dim tblWhere As Map = CreateMap()";
_tblwhere = new anywheresoftware.b4a.objects.collections.Map();
_tblwhere = __c.createMap(new Object[] {});
 //BA.debugLineNum = 226;BA.debugLine="tblWhere.Put(PrimaryKey, priValue)";
_tblwhere.Put((Object)(_primarykey),(Object)(_privalue));
 //BA.debugLineNum = 227;BA.debugLine="UpdateWhere(TableName, Record, tblWhere, Null)";
_updatewhere(_tablename,_record,_tblwhere,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _update1(anywheresoftware.b4a.objects.collections.Map _rec,String _privalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tblwhere = null;
 //BA.debugLineNum = 231;BA.debugLine="Sub Update1(Rec As Map, priValue As String) As BAN";
 //BA.debugLineNum = 232;BA.debugLine="Record = rec";
_record = _rec;
 //BA.debugLineNum = 233;BA.debugLine="Dim tblWhere As Map = CreateMap()";
_tblwhere = new anywheresoftware.b4a.objects.collections.Map();
_tblwhere = __c.createMap(new Object[] {});
 //BA.debugLineNum = 234;BA.debugLine="tblWhere.Put(PrimaryKey, priValue)";
_tblwhere.Put((Object)(_primarykey),(Object)(_privalue));
 //BA.debugLineNum = 235;BA.debugLine="UpdateWhere(TableName, Rec, tblWhere, Null)";
_updatewhere(_tablename,_rec,_tblwhere,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _updateall(anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
String _oper = "";
 //BA.debugLineNum = 953;BA.debugLine="Sub UpdateAll(tblFields As Map,operators As List)";
 //BA.debugLineNum = 954;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblfields);};
 //BA.debugLineNum = 955;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 956;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 957;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 958;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 959;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(TableName)} SET";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" SET "));
 //BA.debugLineNum = 960;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 961;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 962;BA.debugLine="For i = 0 To iTot";
{
final int step9 = 1;
final int limit9 = _itot;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 963;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 964;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 965;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 966;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 967;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
 //BA.debugLineNum = 969;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 };
 }
};
 //BA.debugLineNum = 972;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 973;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 974;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 975;BA.debugLine="command = \"update\"";
_command = "update";
 //BA.debugLineNum = 976;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 977;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssqle  _updatewhere(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listoftypes1 = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listofvalues1 = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
int _iwhere = 0;
String _opr = "";
 //BA.debugLineNum = 908;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
 //BA.debugLineNum = 909;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 910;BA.debugLine="Log($\"BANanoMSSQLE.UpdateWhere: '${tblName}' sch";
__c.Log(("BANanoMSSQLE.UpdateWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
 //BA.debugLineNum = 912;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 913;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 914;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 915;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
 //BA.debugLineNum = 916;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 917;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 918;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
 //BA.debugLineNum = 919;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 920;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 921;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 922;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 923;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 924;BA.debugLine="For i = 0 To iTot";
{
final int step16 = 1;
final int limit16 = _itot;
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 925;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 926;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 927;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 928;BA.debugLine="sb.Append(\"= ?,\")";
_sb.Append("= ?,");
 }else {
 //BA.debugLineNum = 930;BA.debugLine="sb.Append(\"= ?\")";
_sb.Append("= ?");
 };
 }
};
 //BA.debugLineNum = 933;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
 //BA.debugLineNum = 934;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 935;BA.debugLine="For i = 0 To iWhere";
{
final int step27 = 1;
final int limit27 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
 //BA.debugLineNum = 936;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 937;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 939;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 940;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 941;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 942;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 944;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 945;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 946;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 947;BA.debugLine="command = \"update\"";
_command = "update";
 //BA.debugLineNum = 948;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssqle)(this);
 //BA.debugLineNum = 949;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
