package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananosqlitee extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananosqlitee", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananosqlitee.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _rectype = null;
public String _db_bool = "";
public String _db_int = "";
public String _db_string = "";
public String _db_real = "";
public String _db_date = "";
public String _db_blob = "";
public String _db_integer = "";
public String _db_text = "";
public String _db_float = "";
public com.ab.banano.BANano _banano = null;
public String _methodname = "";
public anywheresoftware.b4a.objects.collections.Map _schema = null;
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
public boolean _ok = false;
public String _tablename = "";
public String _primarykey = "";
public anywheresoftware.b4a.objects.collections.Map _record = null;
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
public b4j.example.bananosqlitee  _addblobs(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 840;BA.debugLine="private Sub AddBlobs(fieldNames As List) As BANano";
 //BA.debugLineNum = 841;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 842;BA.debugLine="recType.Put(strfld,\"BLOB\")";
_rectype.Put((Object)(_strfld),(Object)("BLOB"));
 }
};
 //BA.debugLineNum = 844;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 845;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _addbooleans(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 827;BA.debugLine="private Sub AddBooleans(fieldNames As List) As BAN";
 //BA.debugLineNum = 828;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 829;BA.debugLine="recType.Put(strfld,\"BOOL\")";
_rectype.Put((Object)(_strfld),(Object)("BOOL"));
 }
};
 //BA.debugLineNum = 831;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 832;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _adddoubles(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 819;BA.debugLine="private Sub AddDoubles(fieldNames As List) As BANa";
 //BA.debugLineNum = 820;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 821;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
_rectype.Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
 //BA.debugLineNum = 823;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 824;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _addintegers(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 811;BA.debugLine="private Sub AddIntegers(fieldNames As List) As BAN";
 //BA.debugLineNum = 812;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 813;BA.debugLine="recType.Put(strfld,\"INT\")";
_rectype.Put((Object)(_strfld),(Object)("INT"));
 }
};
 //BA.debugLineNum = 815;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 816;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _addstrings(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 803;BA.debugLine="private Sub AddStrings(fieldNames As List) As BANa";
 //BA.debugLineNum = 804;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 805;BA.debugLine="recType.Put(strfld,\"STRING\")";
_rectype.Put((Object)(_strfld),(Object)("STRING"));
 }
};
 //BA.debugLineNum = 807;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 808;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _andoroperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
 //BA.debugLineNum = 89;BA.debugLine="Sub AndOrOperators(sm As Map) As List    'ignore";
 //BA.debugLineNum = 90;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 91;BA.debugLine="nl.initialize";
_nl.Initialize();
 //BA.debugLineNum = 92;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 93;BA.debugLine="nl.Add(\"AND\")";
_nl.Add((Object)("AND"));
 }
};
 //BA.debugLineNum = 95;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _build() throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 792;BA.debugLine="Sub Build As Map";
 //BA.debugLineNum = 793;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 794;BA.debugLine="b.Put(\"dbname\", DBase)";
_b.Put((Object)("dbname"),(Object)(_dbase));
 //BA.debugLineNum = 795;BA.debugLine="b.Put(\"command\", command)";
_b.Put((Object)("command"),(Object)(_command));
 //BA.debugLineNum = 796;BA.debugLine="b.Put(\"query\", query)";
_b.Put((Object)("query"),(Object)(_query));
 //BA.debugLineNum = 797;BA.debugLine="b.Put(\"args\", args)";
_b.Put((Object)("args"),(Object)(_args.getObject()));
 //BA.debugLineNum = 798;BA.debugLine="b.Put(\"types\", types)";
_b.Put((Object)("types"),(Object)(_types.getObject()));
 //BA.debugLineNum = 799;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 800;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private recType As Map";
_rectype = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
_db_bool = "BOOL";
 //BA.debugLineNum = 5;BA.debugLine="Public const DB_INT As String = \"INT\"";
_db_int = "INT";
 //BA.debugLineNum = 6;BA.debugLine="Public const DB_STRING As String = \"STRING\"";
_db_string = "STRING";
 //BA.debugLineNum = 7;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
_db_real = "REAL";
 //BA.debugLineNum = 8;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
_db_date = "DATE";
 //BA.debugLineNum = 9;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
_db_blob = "BLOB";
 //BA.debugLineNum = 10;BA.debugLine="Public const DB_INTEGER As String = \"INTEGER\"";
_db_integer = "INTEGER";
 //BA.debugLineNum = 11;BA.debugLine="Public const DB_TEXT As String = \"TEXT\"";
_db_text = "TEXT";
 //BA.debugLineNum = 12;BA.debugLine="Public const DB_FLOAT As String = \"FLOAT\"";
_db_float = "FLOAT";
 //BA.debugLineNum = 13;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 14;BA.debugLine="Public MethodName As String";
_methodname = "";
 //BA.debugLineNum = 15;BA.debugLine="Private Schema As Map";
_schema = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 16;BA.debugLine="Public DBase As String";
_dbase = "";
 //BA.debugLineNum = 17;BA.debugLine="Public result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 18;BA.debugLine="Public command As String";
_command = "";
 //BA.debugLineNum = 19;BA.debugLine="Public types As List";
_types = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 20;BA.debugLine="Public args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 21;BA.debugLine="Public query As String";
_query = "";
 //BA.debugLineNum = 22;BA.debugLine="Public response As String";
_response = "";
 //BA.debugLineNum = 23;BA.debugLine="Public error As String";
_error = "";
 //BA.debugLineNum = 24;BA.debugLine="Public affectedRows As Long";
_affectedrows = 0L;
 //BA.debugLineNum = 25;BA.debugLine="Public json As String";
_json = "";
 //BA.debugLineNum = 26;BA.debugLine="Public OK As Boolean";
_ok = false;
 //BA.debugLineNum = 27;BA.debugLine="Public TableName As String";
_tablename = "";
 //BA.debugLineNum = 28;BA.debugLine="Public PrimaryKey As String";
_primarykey = "";
 //BA.debugLineNum = 29;BA.debugLine="Public Record As Map";
_record = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananosqlitee  _columnnames() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub ColumnNames As BANanoSQLiteE";
 //BA.debugLineNum = 62;BA.debugLine="query = $\"PRAGMA table_info('${TableName}')\"$";
_query = ("PRAGMA table_info('"+__c.SmartStringFormatter("",(Object)(_tablename))+"')");
 //BA.debugLineNum = 63;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _createdatabase() throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub CreateDatabase As BANanoSQLiteE";
 //BA.debugLineNum = 312;BA.debugLine="query = $\"CREATE DATABASE IF NOT EXISTS ${EscapeF";
_query = ("CREATE DATABASE IF NOT EXISTS "+__c.SmartStringFormatter("",(Object)(_escapefield(_dbase)))+"");
 //BA.debugLineNum = 313;BA.debugLine="command = \"createdb\"";
_command = "createdb";
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _createtable(anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
String _fldname = "";
String _fldtype = "";
int _fldtot = 0;
int _fldcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 331;BA.debugLine="public Sub CreateTable(tblFields As Map) As BANano";
 //BA.debugLineNum = 332;BA.debugLine="Dim fldName As String";
_fldname = "";
 //BA.debugLineNum = 333;BA.debugLine="Dim fldType As String";
_fldtype = "";
 //BA.debugLineNum = 334;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
 //BA.debugLineNum = 335;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
 //BA.debugLineNum = 336;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 337;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 338;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 339;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
 //BA.debugLineNum = 340;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
 //BA.debugLineNum = 341;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
 //BA.debugLineNum = 342;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
 //BA.debugLineNum = 343;BA.debugLine="fldType = fldType.Replace(\"STRING\", \"TEXT\")";
_fldtype = _fldtype.replace("STRING","TEXT");
 //BA.debugLineNum = 344;BA.debugLine="fldType = fldType.Replace(\"TEXT\", \"VARCHAR(255)\"";
_fldtype = _fldtype.replace("TEXT","VARCHAR(255)");
 //BA.debugLineNum = 345;BA.debugLine="If fldType = DB_INT Then fldType = DB_INTEGER";
if ((_fldtype).equals(_db_int)) { 
_fldtype = _db_integer;};
 //BA.debugLineNum = 346;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
 //BA.debugLineNum = 347;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
 //BA.debugLineNum = 349;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(_escapefield(_fldname));
 //BA.debugLineNum = 350;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 351;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
 //BA.debugLineNum = 352;BA.debugLine="Select Case fldType";
switch (BA.switchObjectToInt(_fldtype,"STRING","TEXT","VARCHAR(255)")) {
case 0: 
case 1: 
case 2: {
 //BA.debugLineNum = 354;BA.debugLine="sb.Append(\" COLLATE NOCASE\")";
_sb.Append(" COLLATE NOCASE");
 break; }
}
;
 //BA.debugLineNum = 356;BA.debugLine="If fldName.EqualsIgnoreCase(PrimaryKey) Then";
if (_fldname.equalsIgnoreCase(_primarykey)) { 
 //BA.debugLineNum = 357;BA.debugLine="sb.Append(\" PRIMARY KEY\")";
_sb.Append(" PRIMARY KEY");
 };
 }
};
 //BA.debugLineNum = 360;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 362;BA.debugLine="query = \"CREATE TABLE IF NOT EXISTS \" & EscapeFie";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tablename)+" "+_sb.ToString();
 //BA.debugLineNum = 363;BA.debugLine="command = \"createtable\"";
_command = "createtable";
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 172;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananosqlitee  _delete(String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
 //BA.debugLineNum = 547;BA.debugLine="Sub Delete(primaryValue As String) As BANanoSQLite";
 //BA.debugLineNum = 548;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 549;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 550;BA.debugLine="DeleteWhere(TableName, qw, Array(\"=\"))";
_deletewhere(_tablename,_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}));
 //BA.debugLineNum = 551;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _deleteall() throws Exception{
 //BA.debugLineNum = 694;BA.debugLine="Sub DeleteAll As BANanoSQLiteE";
 //BA.debugLineNum = 695;BA.debugLine="query = $\"DELETE FROM ${EscapeField(TableName)}\"$";
_query = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+"");
 //BA.debugLineNum = 696;BA.debugLine="command = \"delete\"";
_command = "delete";
 //BA.debugLineNum = 697;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 698;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _deletewhere(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _opr = "";
 //BA.debugLineNum = 711;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
 //BA.debugLineNum = 712;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 713;BA.debugLine="Log($\"BANanoSQLiteE.DeleteWhere: '${tblName}' sc";
__c.Log(("BANanoSQLiteE.DeleteWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
 //BA.debugLineNum = 715;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 716;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 717;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 718;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 719;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 720;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 721;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 722;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 723;BA.debugLine="For i = 0 To iWhere";
{
final int step12 = 1;
final int limit12 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 724;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 725;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 727;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 728;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 729;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 730;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 732;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 733;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 734;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 735;BA.debugLine="command = \"delete\"";
_command = "delete";
 //BA.debugLineNum = 736;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 737;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _dropdatabase() throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub DropDataBase As BANanoSQLiteE";
 //BA.debugLineNum = 319;BA.debugLine="query = $\"DROP DATABASE ${EscapeField(DBase)}\"$";
_query = ("DROP DATABASE "+__c.SmartStringFormatter("",(Object)(_escapefield(_dbase)))+"");
 //BA.debugLineNum = 320;BA.debugLine="command = \"dropdb\"";
_command = "dropdb";
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _droptable() throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="public Sub DropTable As BANanoSQLiteE";
 //BA.debugLineNum = 371;BA.debugLine="query = \"DROP TABLE \" & EscapeField(TableName)";
_query = "DROP TABLE "+_escapefield(_tablename);
 //BA.debugLineNum = 372;BA.debugLine="command = \"droptable\"";
_command = "droptable";
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
 //BA.debugLineNum = 700;BA.debugLine="private Sub EQOperators(sm As Map) As List   'igno";
 //BA.debugLineNum = 701;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 702;BA.debugLine="nl.initialize";
_nl.Initialize();
 //BA.debugLineNum = 703;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 704;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
 //BA.debugLineNum = 706;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 707;BA.debugLine="End Sub";
return null;
}
public String  _escapefield(String _f) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Private Sub EscapeField(f As String) As String";
 //BA.debugLineNum = 307;BA.debugLine="Return $\"[${f}]\"$";
if (true) return ("["+__c.SmartStringFormatter("",(Object)(_f))+"]");
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananosqlitee  _execute(String _strsql) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub Execute(strSQL As String) As BANanoSQLiteE";
 //BA.debugLineNum = 325;BA.debugLine="query = strSQL";
_query = _strsql;
 //BA.debugLineNum = 326;BA.debugLine="command = \"execute\"";
_command = "execute";
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _exists(String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
 //BA.debugLineNum = 596;BA.debugLine="Sub Exists(primaryValue As String) As BANanoSQLite";
 //BA.debugLineNum = 597;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 598;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 599;BA.debugLine="SelectWhere(TableName, Array(PrimaryKey), qw, Nul";
_selectwhere(_tablename,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}),_qw,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 600;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _firstrecord() throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 834;BA.debugLine="Sub FirstRecord As Map";
 //BA.debugLineNum = 835;BA.debugLine="Dim rec As Map = result.Get(0)";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_result.Get((int) (0))));
 //BA.debugLineNum = 836;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 837;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _fromjson() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 936;BA.debugLine="Sub FromJSON As BANanoSQLiteE";
 //BA.debugLineNum = 937;BA.debugLine="OK = False";
_ok = __c.False;
 //BA.debugLineNum = 938;BA.debugLine="If json.StartsWith(\"{\") Or json.Startswith(\"[\") T";
if (_json.startsWith("{") || _json.startsWith("[")) { 
 //BA.debugLineNum = 939;BA.debugLine="Dim m As Map = BANano.FromJson(json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_banano.FromJson((Object)(_json))));
 //BA.debugLineNum = 940;BA.debugLine="response = m.Get(\"response\")";
_response = BA.ObjectToString(_m.Get((Object)("response")));
 //BA.debugLineNum = 941;BA.debugLine="error = m.Get(\"error\")";
_error = BA.ObjectToString(_m.Get((Object)("error")));
 //BA.debugLineNum = 942;BA.debugLine="result = m.Get(\"result\")";
_result = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)("result"))));
 //BA.debugLineNum = 943;BA.debugLine="affectedRows = m.Get(\"affectedRows\")";
_affectedrows = BA.ObjectToLongNumber(_m.Get((Object)("affectedRows")));
 //BA.debugLineNum = 944;BA.debugLine="If response = \"Success\" Then";
if ((_response).equals("Success")) { 
 //BA.debugLineNum = 945;BA.debugLine="OK = True";
_ok = __c.True;
 };
 }else {
 //BA.debugLineNum = 948;BA.debugLine="response = json";
_response = _json;
 //BA.debugLineNum = 949;BA.debugLine="error = json";
_error = _json;
 //BA.debugLineNum = 950;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 951;BA.debugLine="affectedRows = -1";
_affectedrows = (long) (-1);
 //BA.debugLineNum = 952;BA.debugLine="OK = False";
_ok = __c.False;
 };
 //BA.debugLineNum = 954;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 955;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 453;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
 //BA.debugLineNum = 454;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 455;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 456;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 457;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 458;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 459;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 460;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 461;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 463;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public String  _getmaptype(String _k) throws Exception{
String _coltype = "";
 //BA.debugLineNum = 402;BA.debugLine="private Sub GetMapType(k As String) As String";
 //BA.debugLineNum = 403;BA.debugLine="If recType.ContainsKey(k) Then";
if (_rectype.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 404;BA.debugLine="Dim colType As String = recType.GetDefault(k, \"S";
_coltype = BA.ObjectToString(_rectype.GetDefault((Object)(_k),(Object)("STRING")));
 //BA.debugLineNum = 405;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"INTEGER","INT","BOOL","BOOLEAN","BLOB","REAL","FLOAT","DOUBLE")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 407;BA.debugLine="Return \"i\"";
if (true) return "i";
 break; }
case 4: {
 //BA.debugLineNum = 409;BA.debugLine="Return \"b\"";
if (true) return "b";
 break; }
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 411;BA.debugLine="Return \"d\"";
if (true) return "d";
 break; }
default: {
 //BA.debugLineNum = 413;BA.debugLine="Return \"s\"";
if (true) return "s";
 break; }
}
;
 }else {
 //BA.debugLineNum = 416;BA.debugLine="Return \"s\"";
if (true) return "s";
 };
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
 //BA.debugLineNum = 378;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
 //BA.debugLineNum = 379;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 380;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
 //BA.debugLineNum = 381;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 382;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 383;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 384;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 385;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 386;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(_rectype.GetDefault((Object)(_col),(Object)("STRING")));
 //BA.debugLineNum = 387;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"INTEGER","INT","BOOL","BOOLEAN","BLOB","REAL","FLOAT","DOUBLE")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 389;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 4: {
 //BA.debugLineNum = 391;BA.debugLine="listOfTypes.add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 393;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
default: {
 //BA.debugLineNum = 395;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
}
;
 }
};
 //BA.debugLineNum = 398;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _key = "";
String _value = "";
String _vtype = "";
 //BA.debugLineNum = 421;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
 //BA.debugLineNum = 422;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 423;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 424;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 425;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 426;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 427;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 429;BA.debugLine="Dim key As String = sourceMap.getkeyat(iCnt)";
_key = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 430;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
 //BA.debugLineNum = 431;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 432;BA.debugLine="value = value.trim";
_value = _value.trim();
 //BA.debugLineNum = 434;BA.debugLine="Dim vtype As String = GetMapType(key)";
_vtype = _getmaptype(_key);
 //BA.debugLineNum = 435;BA.debugLine="Select Case vtype";
switch (BA.switchObjectToInt(_vtype,"i","d","s","b")) {
case 0: {
 //BA.debugLineNum = 438;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 439;BA.debugLine="value = BANano.parseInt(value)";
_value = BA.NumberToString(_banano.parseInt((Object)(_value)));
 break; }
case 1: {
 //BA.debugLineNum = 442;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 443;BA.debugLine="value = BANano.parsefloat(value)";
_value = BA.NumberToString(_banano.parseFloat((Object)(_value)));
 break; }
case 2: 
case 3: {
 break; }
}
;
 //BA.debugLineNum = 447;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 449;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 450;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _getmax() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub GetMax As BANanoSQLiteE";
 //BA.debugLineNum = 47;BA.debugLine="query = $\"SELECT MAX(${PrimaryKey}) As ${PrimaryK";
_query = ("SELECT MAX("+__c.SmartStringFormatter("",(Object)(_primarykey))+") As "+__c.SmartStringFormatter("",(Object)(_primarykey))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+"");
 //BA.debugLineNum = 48;BA.debugLine="command = \"getmax\"";
_command = "getmax";
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _getmin() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub GetMin As BANanoSQLiteE";
 //BA.debugLineNum = 54;BA.debugLine="query = $\"SELECT MIN(${PrimaryKey}) As ${PrimaryK";
_query = ("SELECT MIN("+__c.SmartStringFormatter("",(Object)(_primarykey))+") As "+__c.SmartStringFormatter("",(Object)(_primarykey))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+"");
 //BA.debugLineNum = 55;BA.debugLine="command = \"getmin\"";
_command = "getmin";
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public String  _getnextid() throws Exception{
int _nextid = 0;
String _strid = "";
anywheresoftware.b4a.objects.collections.Map _nr = null;
String _ni = "";
 //BA.debugLineNum = 154;BA.debugLine="Sub GetNextID As String";
 //BA.debugLineNum = 155;BA.debugLine="Dim nextid As Int";
_nextid = 0;
 //BA.debugLineNum = 156;BA.debugLine="Dim strid As String";
_strid = "";
 //BA.debugLineNum = 158;BA.debugLine="If result.Size = 0 Then";
if (_result.getSize()==0) { 
 //BA.debugLineNum = 159;BA.debugLine="nextid = 0";
_nextid = (int) (0);
 }else {
 //BA.debugLineNum = 161;BA.debugLine="Dim nr As Map = result.Get(0)";
_nr = new anywheresoftware.b4a.objects.collections.Map();
_nr = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_result.Get((int) (0))));
 //BA.debugLineNum = 162;BA.debugLine="Dim ni As String = nr.GetDefault(PrimaryKey,\"0\")";
_ni = BA.ObjectToString(_nr.GetDefault((Object)(_primarykey),(Object)("0")));
 //BA.debugLineNum = 163;BA.debugLine="nextid = BANano.parseInt(ni)";
_nextid = _banano.parseInt((Object)(_ni));
 };
 //BA.debugLineNum = 165;BA.debugLine="nextid = nextid + 1";
_nextid = (int) (_nextid+1);
 //BA.debugLineNum = 166;BA.debugLine="strid = CStr(nextid)";
_strid = _cstr((Object)(_nextid));
 //BA.debugLineNum = 167;BA.debugLine="nextid = BANano.ParseInt(nextid)";
_nextid = _banano.parseInt((Object)(_nextid));
 //BA.debugLineNum = 168;BA.debugLine="Return strid";
if (true) return _strid;
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananosqlitee  _gettablenames() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub GetTableNames As BANanoSQLiteE";
 //BA.debugLineNum = 77;BA.debugLine="query = $\"select table_name from information_sche";
_query = ("select table_name from information_schema.tables where table_schema = '"+__c.SmartStringFormatter("",(Object)(_dbase))+"' order by table_name");
 //BA.debugLineNum = 78;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _gettablestructure() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub GetTableStructure As BANanoSQLiteE";
 //BA.debugLineNum = 84;BA.debugLine="query = $\"describe ${EscapeField(TableName)}\"$";
_query = ("describe "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+"");
 //BA.debugLineNum = 85;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _initialize(anywheresoftware.b4a.BA _ba,String _dbname,String _tblname,String _pk,String _ai) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 177;BA.debugLine="Public Sub Initialize(dbName As String, tblName As";
 //BA.debugLineNum = 178;BA.debugLine="Schema.Initialize";
_schema.Initialize();
 //BA.debugLineNum = 179;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 180;BA.debugLine="Record.Initialize";
_record.Initialize();
 //BA.debugLineNum = 181;BA.debugLine="MethodName = \"BANanoSQLite\"";
_methodname = "BANanoSQLite";
 //BA.debugLineNum = 182;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 183;BA.debugLine="command = \"\"";
_command = "";
 //BA.debugLineNum = 184;BA.debugLine="PrimaryKey = PK";
_primarykey = _pk;
 //BA.debugLineNum = 185;BA.debugLine="DBase = dbName";
_dbase = _dbname;
 //BA.debugLineNum = 186;BA.debugLine="TableName = tblName";
_tablename = _tblname;
 //BA.debugLineNum = 187;BA.debugLine="types.Initialize";
_types.Initialize();
 //BA.debugLineNum = 188;BA.debugLine="args.Initialize";
_args.Initialize();
 //BA.debugLineNum = 189;BA.debugLine="types = Null";
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 190;BA.debugLine="args = Null";
_args = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 191;BA.debugLine="query = \"\"";
_query = "";
 //BA.debugLineNum = 192;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 193;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 194;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 195;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 196;BA.debugLine="OK = False";
_ok = __c.False;
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _insert() throws Exception{
 //BA.debugLineNum = 468;BA.debugLine="Sub Insert As BANanoSQLiteE";
 //BA.debugLineNum = 469;BA.debugLine="Insert1(Record)";
_insert1(_record);
 //BA.debugLineNum = 470;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _insert1(anywheresoftware.b4a.objects.collections.Map _rec) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
 //BA.debugLineNum = 474;BA.debugLine="Sub Insert1(Rec As Map) As BANanoSQLiteE";
 //BA.debugLineNum = 475;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 476;BA.debugLine="Log($\"BANanoSQLiteE.Insert1: '${TableName}' sche";
__c.Log(("BANanoSQLiteE.Insert1: '"+__c.SmartStringFormatter("",(Object)(_tablename))+"' schema is not set!"));
 };
 //BA.debugLineNum = 478;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 479;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 480;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 481;BA.debugLine="Dim listOfValues As List = GetMapValues(Rec)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_rec);
 //BA.debugLineNum = 482;BA.debugLine="Dim listOfTypes As List = GetMapTypes(Rec)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_rec);
 //BA.debugLineNum = 483;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 484;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 485;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 486;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 487;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 488;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(TableName)}";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" ("));
 //BA.debugLineNum = 489;BA.debugLine="iTot = Rec.Size - 1";
_itot = (int) (_rec.getSize()-1);
 //BA.debugLineNum = 490;BA.debugLine="For iCnt = 0 To iTot";
{
final int step16 = 1;
final int limit16 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit16 ;_icnt = _icnt + step16 ) {
 //BA.debugLineNum = 491;BA.debugLine="Dim col As String = Rec.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_rec.GetKeyAt(_icnt));
 //BA.debugLineNum = 492;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 493;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 494;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 496;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 497;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 499;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 500;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 501;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 502;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 503;BA.debugLine="query = sb.ToString";
_query = _sb.ToString();
 //BA.debugLineNum = 504;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 505;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 506;BA.debugLine="command = \"insert\"";
_command = "insert";
 //BA.debugLineNum = 507;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _insertreplace() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
 //BA.debugLineNum = 513;BA.debugLine="Sub InsertReplace As BANanoSQLiteE";
 //BA.debugLineNum = 514;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 515;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 516;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 517;BA.debugLine="Dim listOfValues As List = GetMapValues(Record)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_record);
 //BA.debugLineNum = 518;BA.debugLine="Dim listOfTypes As List = GetMapTypes(Record)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_record);
 //BA.debugLineNum = 519;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 520;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 521;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 522;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 523;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 524;BA.debugLine="sb.Append($\"REPLACE INTO ${EscapeField(TableName)";
_sb.Append(("REPLACE INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" ("));
 //BA.debugLineNum = 525;BA.debugLine="iTot = Record.Size - 1";
_itot = (int) (_record.getSize()-1);
 //BA.debugLineNum = 526;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
 //BA.debugLineNum = 527;BA.debugLine="Dim col As String = Record.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_record.GetKeyAt(_icnt));
 //BA.debugLineNum = 528;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 529;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 530;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 532;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 533;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 535;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 536;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 537;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 538;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 539;BA.debugLine="query = sb.ToString";
_query = _sb.ToString();
 //BA.debugLineNum = 540;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 541;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 542;BA.debugLine="command = \"replace\"";
_command = "replace";
 //BA.debugLineNum = 543;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return null;
}
public String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 573;BA.debugLine="private Sub Join(delimiter As String, lst As List)";
 //BA.debugLineNum = 574;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 575;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 576;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 577;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 578;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 579;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 580;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 581;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 582;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 584;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return "";
}
public String  _joinfields(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 556;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
 //BA.debugLineNum = 557;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 558;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 559;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 560;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 561;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 562;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 563;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 564;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 565;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 566;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 567;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 569;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _jsonx = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 282;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 283;BA.debugLine="Dim jsonx As BANanoJSONParser";
_jsonx = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 284;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 285;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 286;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 287;BA.debugLine="Try";
try { //BA.debugLineNum = 288;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 289;BA.debugLine="jsonx.Initialize(strJSON)";
_jsonx.Initialize(_strjson);
 //BA.debugLineNum = 290;BA.debugLine="Map1 = jsonx.NextObject";
_map1 = _jsonx.NextObject();
 };
 //BA.debugLineNum = 292;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 294;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _jsonx = null;
 //BA.debugLineNum = 299;BA.debugLine="Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 300;BA.debugLine="Dim jsonx As BANanoJSONGenerator";
_jsonx = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 301;BA.debugLine="jsonx.Initialize(mp)";
_jsonx.Initialize(_mp);
 //BA.debugLineNum = 302;BA.debugLine="Return jsonx.ToString";
if (true) return _jsonx.ToString();
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _newlist() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 148;BA.debugLine="Sub NewList As List";
 //BA.debugLineNum = 149;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 150;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 151;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _read(String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
 //BA.debugLineNum = 588;BA.debugLine="Sub Read(primaryValue As String) As BANanoSQLiteE";
 //BA.debugLineNum = 589;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 590;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 591;BA.debugLine="SelectWhere(TableName, Array(\"*\"), qw, Null, Arra";
_selectwhere(_tablename,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),_qw,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 592;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return null;
}
public String  _recordfrommap(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 32;BA.debugLine="Sub RecordFromMap(sm As Map)";
 //BA.debugLineNum = 33;BA.debugLine="Record.Initialize";
_record.Initialize();
 //BA.debugLineNum = 34;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _sm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 35;BA.debugLine="Dim v As Object = sm.Get(k)";
_v = _sm.Get((Object)(_k));
 //BA.debugLineNum = 36;BA.debugLine="Record.Put(k, v)";
_record.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananosqlitee  _schemaaddblob(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 253;BA.debugLine="Sub SchemaAddBlob(bools As List) As BANanoSQLiteE";
 //BA.debugLineNum = 254;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 255;BA.debugLine="Schema.Put(b, DB_BLOB)";
_schema.Put((Object)(_b),(Object)(_db_blob));
 }
};
 //BA.debugLineNum = 257;BA.debugLine="AddBlobs(bools)";
_addblobs(_bools);
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _schemaaddboolean(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 212;BA.debugLine="Sub SchemaAddBoolean(bools As List) As BANanoSQLit";
 //BA.debugLineNum = 213;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 214;BA.debugLine="Schema.Put(b, DB_BOOL)";
_schema.Put((Object)(_b),(Object)(_db_bool));
 }
};
 //BA.debugLineNum = 216;BA.debugLine="AddBooleans(bools)";
_addbooleans(_bools);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _schemaadddate(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 273;BA.debugLine="Sub SchemaAddDate(bools As List) As BANanoSQLiteE";
 //BA.debugLineNum = 274;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 275;BA.debugLine="Schema.Put(b, DB_DATE)";
_schema.Put((Object)(_b),(Object)(_db_date));
 }
};
 //BA.debugLineNum = 277;BA.debugLine="AddStrings(bools)";
_addstrings(_bools);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public String  _schemaaddfield(String _fldname,String _fldtype) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SchemaAddField(fldName As String, fldType As S";
 //BA.debugLineNum = 41;BA.debugLine="Schema.Put(fldName, fldType)";
_schema.Put((Object)(_fldname),(Object)(_fldtype));
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananosqlitee  _schemaaddfloat(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 245;BA.debugLine="Sub SchemaAddFloat(bools As List) As BANanoSQLiteE";
 //BA.debugLineNum = 246;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 247;BA.debugLine="Schema.Put(b, DB_FLOAT)";
_schema.Put((Object)(_b),(Object)(_db_float));
 }
};
 //BA.debugLineNum = 249;BA.debugLine="AddDoubles(bools)";
_adddoubles(_bools);
 //BA.debugLineNum = 250;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _schemaaddint(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 237;BA.debugLine="Sub SchemaAddInt(bools As List) As BANanoSQLiteE";
 //BA.debugLineNum = 238;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 239;BA.debugLine="Schema.Put(b, DB_INTEGER)";
_schema.Put((Object)(_b),(Object)(_db_integer));
 }
};
 //BA.debugLineNum = 241;BA.debugLine="AddIntegers(bools)";
_addintegers(_bools);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _schemaaddtext(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 261;BA.debugLine="Sub SchemaAddText(bools As List) As BANanoSQLiteE";
 //BA.debugLineNum = 262;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 263;BA.debugLine="Schema.Put(b, DB_STRING)";
_schema.Put((Object)(_b),(Object)(_db_string));
 }
};
 //BA.debugLineNum = 265;BA.debugLine="AddStrings(bools)";
_addstrings(_bools);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _schemaclear() throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SchemaClear As BANanoSQLiteE";
 //BA.debugLineNum = 202;BA.debugLine="Schema.clear";
_schema.Clear();
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _schemacreatetable() throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub SchemaCreateTable As BANanoSQLiteE";
 //BA.debugLineNum = 270;BA.debugLine="Return CreateTable(Schema)";
if (true) return _createtable(_schema);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _schemafromdesign(b4j.example.vmcontainer _cont) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SchemaFromDesign(cont As VMContainer) As BANan";
 //BA.debugLineNum = 222;BA.debugLine="SchemaAddBoolean(cont.Booleans)";
_schemaaddboolean(_cont._booleans /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 223;BA.debugLine="SchemaAddDate(cont.Dates)";
_schemaadddate(_cont._dates /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 224;BA.debugLine="SchemaAddFloat(cont.Doubles)";
_schemaaddfloat(_cont._doubles /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 225;BA.debugLine="SchemaAddInt(cont.Integers)";
_schemaaddint(_cont._integers /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 226;BA.debugLine="SchemaAddText(cont.Strings)";
_schemaaddtext(_cont._strings /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 228;BA.debugLine="AddStrings(cont.Strings)";
_addstrings(_cont._strings /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 229;BA.debugLine="AddIntegers(cont.Integers)";
_addintegers(_cont._integers /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 230;BA.debugLine="AddDoubles(cont.Doubles)";
_adddoubles(_cont._doubles /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 231;BA.debugLine="AddBooleans(cont.Booleans)";
_addbooleans(_cont._booleans /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 232;BA.debugLine="AddStrings(cont.Dates)";
_addstrings(_cont._dates /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _selectall(anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
 //BA.debugLineNum = 741;BA.debugLine="Sub SelectAll(tblfields As List, orderBy As List)";
 //BA.debugLineNum = 743;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 744;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 745;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 747;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 749;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 751;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 752;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 753;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+""));
 //BA.debugLineNum = 754;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 756;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 757;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 758;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 761;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 762;BA.debugLine="command =  \"select\"";
_command = "select";
 //BA.debugLineNum = 763;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 764;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _selectdistinctall(anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
 //BA.debugLineNum = 767;BA.debugLine="Sub SelectDistinctAll(tblfields As List, orderBy A";
 //BA.debugLineNum = 769;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 770;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 771;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 773;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 775;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 777;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 778;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 779;BA.debugLine="sb.Append($\"SELECT DISTINCT ${selFIelds} FROM ${E";
_sb.Append(("SELECT DISTINCT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+""));
 //BA.debugLineNum = 780;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 782;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 783;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 784;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 787;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 788;BA.debugLine="command =  \"select\"";
_command = "select";
 //BA.debugLineNum = 789;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 790;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _selectdistinctwhere(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
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
 //BA.debugLineNum = 649;BA.debugLine="Sub SelectDistinctWhere(tblName As String, tblfiel";
 //BA.debugLineNum = 650;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 651;BA.debugLine="Log($\"BANanoSQLiteE.SelectDistinctWhere: '${tblN";
__c.Log(("BANanoSQLiteE.SelectDistinctWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
 //BA.debugLineNum = 653;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 654;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 655;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 657;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 658;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 659;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 661;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 663;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 665;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 666;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 667;BA.debugLine="sb.Append($\"SELECT DISTINCT ${selFIelds} FROM ${E";
_sb.Append(("SELECT DISTINCT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 668;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 669;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 670;BA.debugLine="For i = 0 To iWhere";
{
final int step20 = 1;
final int limit20 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 671;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 672;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 674;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 675;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 676;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 677;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 }
};
 //BA.debugLineNum = 679;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 681;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 682;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 683;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 686;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 687;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 688;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 689;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 690;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _selectwhere(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
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
 //BA.debugLineNum = 604;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
 //BA.debugLineNum = 605;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 606;BA.debugLine="Log($\"BANanoSQLiteE.SelectWhere: '${tblName}' sc";
__c.Log(("BANanoSQLiteE.SelectWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
 //BA.debugLineNum = 608;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 609;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 610;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 612;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 613;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 614;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 616;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 618;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 620;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 621;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 622;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 623;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 624;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 625;BA.debugLine="For i = 0 To iWhere";
{
final int step20 = 1;
final int limit20 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 626;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 627;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 629;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 630;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 631;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 632;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 }
};
 //BA.debugLineNum = 634;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 636;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 637;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 638;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 641;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 642;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 643;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 644;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 645;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _selectwhere1(anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _andor,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
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
 //BA.debugLineNum = 99;BA.debugLine="Sub SelectWhere1(tblfields As List, tblWhere As Ma";
 //BA.debugLineNum = 100;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 101;BA.debugLine="If AndOr = Null Then AndOr = AndOrOperators(tblWh";
if (_andor== null) { 
_andor = _andoroperators(_tblwhere);};
 //BA.debugLineNum = 102;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 103;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 105;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 106;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 107;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 109;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 111;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 113;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 114;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 115;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" WHERE "));
 //BA.debugLineNum = 116;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 117;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 118;BA.debugLine="For i = 0 To iWhere";
{
final int step18 = 1;
final int limit18 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
 //BA.debugLineNum = 119;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 120;BA.debugLine="Dim sandor As String = AndOr.get(i)";
_sandor = BA.ObjectToString(_andor.Get(_i));
 //BA.debugLineNum = 121;BA.debugLine="sb.Append($\" ${sandor} \"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_sandor))+" "));
 };
 //BA.debugLineNum = 123;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 124;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 125;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 126;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 128;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 130;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 131;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 132;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 135;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 136;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 137;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 138;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 139;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 140;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 141;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 142;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 143;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _setfield(String _fldname,Object _fldvalue) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetField(fldName As String, fldValue As Object";
 //BA.debugLineNum = 207;BA.debugLine="Record.Put(fldName, fldValue)";
_record.Put((Object)(_fldname),_fldvalue);
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _tablenames() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub TableNames As BANanoSQLiteE";
 //BA.debugLineNum = 69;BA.debugLine="query = \"SELECT name FROM sqlite_master WHERE typ";
_query = "SELECT name FROM sqlite_master WHERE type='table' AND name Not LIKE 'sqlite_%' ORDER BY name";
 //BA.debugLineNum = 70;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _update(String _privalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tblwhere = null;
 //BA.debugLineNum = 847;BA.debugLine="Sub Update(priValue As String) As BANanoSQLiteE";
 //BA.debugLineNum = 848;BA.debugLine="Dim tblWhere As Map = CreateMap()";
_tblwhere = new anywheresoftware.b4a.objects.collections.Map();
_tblwhere = __c.createMap(new Object[] {});
 //BA.debugLineNum = 849;BA.debugLine="tblWhere.Put(PrimaryKey, priValue)";
_tblwhere.Put((Object)(_primarykey),(Object)(_privalue));
 //BA.debugLineNum = 850;BA.debugLine="UpdateWhere(TableName, Record, tblWhere, Null)";
_updatewhere(_tablename,_record,_tblwhere,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 851;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 852;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _update1(anywheresoftware.b4a.objects.collections.Map _rec,String _privalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tblwhere = null;
 //BA.debugLineNum = 854;BA.debugLine="Sub Update1(Rec As Map, priValue As String) As BAN";
 //BA.debugLineNum = 855;BA.debugLine="Record = Rec";
_record = _rec;
 //BA.debugLineNum = 856;BA.debugLine="Dim tblWhere As Map = CreateMap()";
_tblwhere = new anywheresoftware.b4a.objects.collections.Map();
_tblwhere = __c.createMap(new Object[] {});
 //BA.debugLineNum = 857;BA.debugLine="tblWhere.Put(PrimaryKey, priValue)";
_tblwhere.Put((Object)(_primarykey),(Object)(_privalue));
 //BA.debugLineNum = 858;BA.debugLine="UpdateWhere(TableName, Rec, tblWhere, Null)";
_updatewhere(_tablename,_rec,_tblwhere,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 859;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 860;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _updateall(anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
String _oper = "";
 //BA.debugLineNum = 908;BA.debugLine="Sub UpdateAll(tblFields As Map, operators As List)";
 //BA.debugLineNum = 909;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblfields);};
 //BA.debugLineNum = 910;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 911;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 912;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 913;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 914;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(TableName)} SET";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" SET "));
 //BA.debugLineNum = 915;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 916;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 917;BA.debugLine="For i = 0 To iTot";
{
final int step9 = 1;
final int limit9 = _itot;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 918;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 919;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 920;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 921;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 922;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
 //BA.debugLineNum = 924;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 };
 }
};
 //BA.debugLineNum = 927;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 928;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 929;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 930;BA.debugLine="command = \"update\"";
_command = "update";
 //BA.debugLineNum = 931;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 932;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlitee  _updatewhere(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
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
 //BA.debugLineNum = 863;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
 //BA.debugLineNum = 864;BA.debugLine="If Schema.Size = 0 Then";
if (_schema.getSize()==0) { 
 //BA.debugLineNum = 865;BA.debugLine="Log($\"BANanoSQLiteE.UpdateWhere: '${tblName}' sc";
__c.Log(("BANanoSQLiteE.UpdateWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
 //BA.debugLineNum = 867;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 868;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 869;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 870;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
 //BA.debugLineNum = 871;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 872;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 873;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
 //BA.debugLineNum = 874;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 875;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 876;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 877;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 878;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 879;BA.debugLine="For i = 0 To iTot";
{
final int step16 = 1;
final int limit16 = _itot;
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 880;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 881;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 882;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 883;BA.debugLine="sb.Append(\"= ?,\")";
_sb.Append("= ?,");
 }else {
 //BA.debugLineNum = 885;BA.debugLine="sb.Append(\"= ?\")";
_sb.Append("= ?");
 };
 }
};
 //BA.debugLineNum = 888;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
 //BA.debugLineNum = 889;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 890;BA.debugLine="For i = 0 To iWhere";
{
final int step27 = 1;
final int limit27 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
 //BA.debugLineNum = 891;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 892;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 894;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 895;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 896;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 897;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 899;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 900;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 901;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 902;BA.debugLine="command = \"update\"";
_command = "update";
 //BA.debugLineNum = 903;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlitee)(this);
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
