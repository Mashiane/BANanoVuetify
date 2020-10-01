package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananoalasqle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananoalasqle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananoalasqle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _db_bool = "";
public String _db_int = "";
public String _db_string = "";
public String _db_real = "";
public String _db_date = "";
public String _db_blob = "";
public String _db_float = "";
public String _db_integer = "";
public String _db_text = "";
public anywheresoftware.b4a.objects.collections.Map _rectype = null;
public com.ab.banano.BANano _banano = null;
public anywheresoftware.b4a.objects.collections.Map _schema = null;
public String _tablename = "";
public String _primarykey = "";
public String _response = "";
public anywheresoftware.b4a.objects.collections.List _result = null;
public String _command = "";
public anywheresoftware.b4a.objects.collections.List _types = null;
public anywheresoftware.b4a.objects.collections.List _args = null;
public String _query = "";
public String _json = "";
public String _error = "";
public long _affectedrows = 0L;
public anywheresoftware.b4a.objects.collections.Map _record = null;
public boolean _ok = false;
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
public b4j.example.bananoalasqle  _addblobs(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 269;BA.debugLine="Sub AddBlobs(fieldNames As List) As BANanoAlaSQLE";
 //BA.debugLineNum = 270;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 271;BA.debugLine="recType.Put(strfld,\"BLOB\")";
_rectype.Put((Object)(_strfld),(Object)("BLOB"));
 }
};
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _addbooleans(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 261;BA.debugLine="Sub AddBooleans(fieldNames As List) As BANanoAlaSQ";
 //BA.debugLineNum = 262;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 263;BA.debugLine="recType.Put(strfld,\"BOOL\")";
_rectype.Put((Object)(_strfld),(Object)("BOOL"));
 }
};
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _adddoubles(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 253;BA.debugLine="Sub AddDoubles(fieldNames As List) As BANanoAlaSQL";
 //BA.debugLineNum = 254;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 255;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
_rectype.Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _addintegers(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 245;BA.debugLine="Sub AddIntegers(fieldNames As List) As BANanoAlaSQ";
 //BA.debugLineNum = 246;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 247;BA.debugLine="recType.Put(strfld,\"INT\")";
_rectype.Put((Object)(_strfld),(Object)("INT"));
 }
};
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _addstrings(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 237;BA.debugLine="Sub AddStrings(fieldNames As List) As BANanoAlaSQL";
 //BA.debugLineNum = 238;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 239;BA.debugLine="recType.Put(strfld,\"STRING\")";
_rectype.Put((Object)(_strfld),(Object)("STRING"));
 }
};
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _andoroperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
 //BA.debugLineNum = 842;BA.debugLine="Sub AndOrOperators(sm As Map) As List    'ignore";
 //BA.debugLineNum = 843;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 844;BA.debugLine="nl.initialize";
_nl.Initialize();
 //BA.debugLineNum = 845;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 846;BA.debugLine="nl.Add(\"AND\")";
_nl.Add((Object)("AND"));
 }
};
 //BA.debugLineNum = 848;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 849;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
_db_bool = "BOOL";
 //BA.debugLineNum = 4;BA.debugLine="Public const DB_INT As String = \"INT\"";
_db_int = "INT";
 //BA.debugLineNum = 5;BA.debugLine="Public const DB_STRING As String = \"STRING\"";
_db_string = "STRING";
 //BA.debugLineNum = 6;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
_db_real = "REAL";
 //BA.debugLineNum = 7;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
_db_date = "DATE";
 //BA.debugLineNum = 8;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
_db_blob = "BLOB";
 //BA.debugLineNum = 9;BA.debugLine="Public const DB_FLOAT As String = \"FLOAT\"";
_db_float = "FLOAT";
 //BA.debugLineNum = 10;BA.debugLine="Public const DB_INTEGER As String = \"INTEGER\"";
_db_integer = "INTEGER";
 //BA.debugLineNum = 11;BA.debugLine="Public const DB_TEXT As String = \"TEXT\"";
_db_text = "TEXT";
 //BA.debugLineNum = 12;BA.debugLine="Private recType As Map";
_rectype = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 14;BA.debugLine="Private Schema As Map";
_schema = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 15;BA.debugLine="Private TableName As String";
_tablename = "";
 //BA.debugLineNum = 16;BA.debugLine="Private PrimaryKey As String";
_primarykey = "";
 //BA.debugLineNum = 17;BA.debugLine="Public response As String";
_response = "";
 //BA.debugLineNum = 18;BA.debugLine="Public result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 19;BA.debugLine="Public command As String";
_command = "";
 //BA.debugLineNum = 20;BA.debugLine="Public types As List";
_types = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 21;BA.debugLine="Public args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 22;BA.debugLine="Public query As String";
_query = "";
 //BA.debugLineNum = 23;BA.debugLine="Public json As String";
_json = "";
 //BA.debugLineNum = 24;BA.debugLine="Public error As String";
_error = "";
 //BA.debugLineNum = 25;BA.debugLine="Public affectedRows As Long";
_affectedrows = 0L;
 //BA.debugLineNum = 26;BA.debugLine="Public Record As Map";
_record = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 27;BA.debugLine="Public OK As Boolean";
_ok = false;
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananoalasqle  _createtable(anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
String _fldname = "";
String _fldtype = "";
int _fldtot = 0;
int _fldcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 373;BA.debugLine="public Sub CreateTable(tblFields As Map) As BANano";
 //BA.debugLineNum = 374;BA.debugLine="Dim fldName As String";
_fldname = "";
 //BA.debugLineNum = 375;BA.debugLine="Dim fldType As String";
_fldtype = "";
 //BA.debugLineNum = 376;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
 //BA.debugLineNum = 377;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
 //BA.debugLineNum = 378;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 379;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 380;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 381;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
 //BA.debugLineNum = 382;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
 //BA.debugLineNum = 383;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
 //BA.debugLineNum = 384;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
 //BA.debugLineNum = 385;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
 //BA.debugLineNum = 386;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
 //BA.debugLineNum = 388;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(_escapefield(_fldname));
 //BA.debugLineNum = 389;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 390;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
 //BA.debugLineNum = 391;BA.debugLine="If fldName.EqualsIgnoreCase(PrimaryKey) Then";
if (_fldname.equalsIgnoreCase(_primarykey)) { 
 //BA.debugLineNum = 392;BA.debugLine="sb.Append(\" PRIMARY KEY\")";
_sb.Append(" PRIMARY KEY");
 };
 }
};
 //BA.debugLineNum = 395;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 397;BA.debugLine="query = \"CREATE TABLE IF NOT EXISTS \" & EscapeFie";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tablename)+" "+_sb.ToString();
 //BA.debugLineNum = 398;BA.debugLine="args = Null";
_args = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 399;BA.debugLine="types = Null";
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 400;BA.debugLine="command = \"createtable\"";
_command = "createtable";
 //BA.debugLineNum = 401;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 402;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 403;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 404;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 405;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 232;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananoalasqle  _delete(String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
 //BA.debugLineNum = 356;BA.debugLine="Sub Delete(primaryValue As String) As BANanoAlaSQL";
 //BA.debugLineNum = 357;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 358;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 359;BA.debugLine="DeleteWhere(qw, Array(\"=\"))";
_deletewhere(_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}));
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _deleteall() throws Exception{
String _sb = "";
 //BA.debugLineNum = 667;BA.debugLine="Sub DeleteAll As BANanoAlaSQLE";
 //BA.debugLineNum = 668;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(Ta";
_sb = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" WHERE 1=1");
 //BA.debugLineNum = 669;BA.debugLine="query = sb";
_query = _sb;
 //BA.debugLineNum = 670;BA.debugLine="args = Null";
_args = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 671;BA.debugLine="types = Null";
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 672;BA.debugLine="command = \"delete\"";
_command = "delete";
 //BA.debugLineNum = 673;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 674;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 675;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 676;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 677;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 678;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _deletewhere(anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _opr = "";
 //BA.debugLineNum = 636;BA.debugLine="Sub DeleteWhere(tblWhere As Map, operators As List";
 //BA.debugLineNum = 637;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 638;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 639;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 640;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 641;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 642;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(TableName)}";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" WHERE "));
 //BA.debugLineNum = 643;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 644;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 645;BA.debugLine="For i = 0 To iWhere";
{
final int step9 = 1;
final int limit9 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 646;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 647;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 649;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 650;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 651;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 652;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 654;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 655;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 656;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 657;BA.debugLine="command = \"delete\"";
_command = "delete";
 //BA.debugLineNum = 658;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 659;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 660;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 661;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 662;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 663;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 664;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _droptable() throws Exception{
 //BA.debugLineNum = 463;BA.debugLine="public Sub DropTable As BANanoAlaSQLE";
 //BA.debugLineNum = 465;BA.debugLine="query = \"DROP TABLE \" & EscapeField(TableName)";
_query = "DROP TABLE "+_escapefield(_tablename);
 //BA.debugLineNum = 466;BA.debugLine="args = Null";
_args = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 467;BA.debugLine="types = Null";
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 468;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 469;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 470;BA.debugLine="command = \"droptable\"";
_command = "droptable";
 //BA.debugLineNum = 471;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 472;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 473;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
 //BA.debugLineNum = 580;BA.debugLine="Sub EQOperators(sm As Map) As List    'ignore";
 //BA.debugLineNum = 581;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 582;BA.debugLine="nl.initialize";
_nl.Initialize();
 //BA.debugLineNum = 583;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 584;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
 //BA.debugLineNum = 586;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 587;BA.debugLine="End Sub";
return null;
}
public String  _escapefield(String _f) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Private Sub EscapeField(f As String) As String";
 //BA.debugLineNum = 364;BA.debugLine="Return $\"[${f}]\"$";
if (true) return ("["+__c.SmartStringFormatter("",(Object)(_f))+"]");
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananoalasqle  _execute(String _strsql) throws Exception{
 //BA.debugLineNum = 477;BA.debugLine="Sub Execute(strSQL As String) As BANanoAlaSQLE";
 //BA.debugLineNum = 478;BA.debugLine="strSQL = strSQL.trim";
_strsql = _strsql.trim();
 //BA.debugLineNum = 479;BA.debugLine="query = strSQL";
_query = _strsql;
 //BA.debugLineNum = 480;BA.debugLine="args = Null";
_args = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 481;BA.debugLine="types = Null";
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 482;BA.debugLine="command = \"execute\"";
_command = "execute";
 //BA.debugLineNum = 483;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 484;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 485;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 486;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 487;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 488;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _exists(String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
 //BA.debugLineNum = 754;BA.debugLine="Sub Exists(primaryValue As String) As BANanoAlaSQL";
 //BA.debugLineNum = 755;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 756;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 757;BA.debugLine="SelectWhere(Array(PrimaryKey), qw, Array(\"=\"), Ar";
_selectwhere(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 758;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 759;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _firstrecord() throws Exception{
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 122;BA.debugLine="Sub FirstRecord As Map";
 //BA.debugLineNum = 123;BA.debugLine="Dim rec As Map = result.Get(0)";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_result.Get((int) (0))));
 //BA.debugLineNum = 124;BA.debugLine="Return rec";
if (true) return _rec;
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _fromjson() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub FromJSON As BANanoAlaSQLE";
 //BA.debugLineNum = 130;BA.debugLine="response = \"Success\"";
_response = "Success";
 //BA.debugLineNum = 131;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 132;BA.debugLine="affectedRows = result.size";
_affectedrows = (long) (_result.getSize());
 //BA.debugLineNum = 133;BA.debugLine="OK = True";
_ok = __c.True;
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 326;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
 //BA.debugLineNum = 327;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 328;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 329;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 330;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 331;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 332;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 333;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 334;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 336;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public String  _getmaptype(String _k) throws Exception{
String _coltype = "";
 //BA.debugLineNum = 537;BA.debugLine="private Sub GetMapType(k As String) As String";
 //BA.debugLineNum = 538;BA.debugLine="If recType.ContainsKey(k) Then";
if (_rectype.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 539;BA.debugLine="Dim colType As String = recType.GetDefault(k, \"S";
_coltype = BA.ObjectToString(_rectype.GetDefault((Object)(_k),(Object)("STRING")));
 //BA.debugLineNum = 540;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"INTEGER","INT","BOOL","BOOLEAN","BLOB","REAL","FLOAT","DOUBLE")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 542;BA.debugLine="Return \"i\"";
if (true) return "i";
 break; }
case 4: {
 //BA.debugLineNum = 544;BA.debugLine="Return \"b\"";
if (true) return "b";
 break; }
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 546;BA.debugLine="Return \"d\"";
if (true) return "d";
 break; }
default: {
 //BA.debugLineNum = 548;BA.debugLine="Return \"s\"";
if (true) return "s";
 break; }
}
;
 }else {
 //BA.debugLineNum = 551;BA.debugLine="Return \"s\"";
if (true) return "s";
 };
 //BA.debugLineNum = 553;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
 //BA.debugLineNum = 556;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
 //BA.debugLineNum = 557;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 558;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
 //BA.debugLineNum = 559;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 560;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 561;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 562;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 563;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 564;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(_rectype.GetDefault((Object)(_col),(Object)("STRING")));
 //BA.debugLineNum = 565;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"INTEGER","INT","BOOL","BOOLEAN","BLOB","REAL","FLOAT","DOUBLE")) {
case 0: 
case 1: 
case 2: 
case 3: {
 //BA.debugLineNum = 567;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 4: {
 //BA.debugLineNum = 569;BA.debugLine="listOfTypes.add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 571;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
default: {
 //BA.debugLineNum = 573;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
}
;
 }
};
 //BA.debugLineNum = 576;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
 //BA.debugLineNum = 577;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _key = "";
String _value = "";
String _vtype = "";
 //BA.debugLineNum = 277;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
 //BA.debugLineNum = 278;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 279;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 280;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 281;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 282;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 283;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 285;BA.debugLine="Dim key As String = sourceMap.getkeyat(iCnt)";
_key = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 286;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
 //BA.debugLineNum = 287;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 288;BA.debugLine="value = value.trim";
_value = _value.trim();
 //BA.debugLineNum = 290;BA.debugLine="Dim vtype As String = GetMapType(key)";
_vtype = _getmaptype(_key);
 //BA.debugLineNum = 291;BA.debugLine="Select Case vtype";
switch (BA.switchObjectToInt(_vtype,"i","d","s","b")) {
case 0: {
 //BA.debugLineNum = 294;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 295;BA.debugLine="value = BANano.parseInt(value)";
_value = BA.NumberToString(_banano.parseInt((Object)(_value)));
 break; }
case 1: {
 //BA.debugLineNum = 298;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 299;BA.debugLine="value = BANano.parsefloat(value)";
_value = BA.NumberToString(_banano.parseFloat((Object)(_value)));
 break; }
case 2: 
case 3: {
 break; }
}
;
 //BA.debugLineNum = 303;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 305;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _getmax() throws Exception{
String _sb = "";
 //BA.debugLineNum = 432;BA.debugLine="Sub GetMax As BANanoAlaSQLE";
 //BA.debugLineNum = 433;BA.debugLine="Dim sb As String = $\"SELECT MAX([${PrimaryKey}])";
_sb = ("SELECT MAX(["+__c.SmartStringFormatter("",(Object)(_primarykey))+"]) As ["+__c.SmartStringFormatter("",(Object)(_primarykey))+"] FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+"");
 //BA.debugLineNum = 434;BA.debugLine="query = sb";
_query = _sb;
 //BA.debugLineNum = 435;BA.debugLine="args = Null";
_args = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 436;BA.debugLine="types = Null";
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 437;BA.debugLine="command = \"getmax\"";
_command = "getmax";
 //BA.debugLineNum = 438;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 439;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 440;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 441;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 442;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _getmaxwhere(String _fldname,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _opr = "";
 //BA.debugLineNum = 763;BA.debugLine="Sub GetMaxWhere(fldName As String, tblWhere As Map";
 //BA.debugLineNum = 764;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 765;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 766;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 768;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 769;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 770;BA.debugLine="sb.Append($\"SELECT MAX([${fldName}]) As [${fldNam";
_sb.Append(("SELECT MAX(["+__c.SmartStringFormatter("",(Object)(_fldname))+"]) As ["+__c.SmartStringFormatter("",(Object)(_fldname))+"] FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" WHERE "));
 //BA.debugLineNum = 771;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 772;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 773;BA.debugLine="For i = 0 To iWhere";
{
final int step9 = 1;
final int limit9 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 774;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 775;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 777;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 778;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 779;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 780;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 783;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 784;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 785;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 786;BA.debugLine="command = \"getmax\"";
_command = "getmax";
 //BA.debugLineNum = 787;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 788;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 789;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 790;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 791;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 792;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _getmin() throws Exception{
String _sb = "";
 //BA.debugLineNum = 447;BA.debugLine="Sub GetMin As BANanoAlaSQLE";
 //BA.debugLineNum = 448;BA.debugLine="Dim sb As String = $\"SELECT MIN([${PrimaryKey}])";
_sb = ("SELECT MIN(["+__c.SmartStringFormatter("",(Object)(_primarykey))+"]) As ["+__c.SmartStringFormatter("",(Object)(_primarykey))+"] FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+"");
 //BA.debugLineNum = 449;BA.debugLine="query = sb";
_query = _sb;
 //BA.debugLineNum = 450;BA.debugLine="args = Null";
_args = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 451;BA.debugLine="types = Null";
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 452;BA.debugLine="command = \"getmin\"";
_command = "getmin";
 //BA.debugLineNum = 453;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 454;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 455;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 456;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 457;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 458;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return null;
}
public String  _getnextid() throws Exception{
int _nextid = 0;
String _strid = "";
anywheresoftware.b4a.objects.collections.Map _nr = null;
String _ni = "";
 //BA.debugLineNum = 213;BA.debugLine="Sub GetNextID As String";
 //BA.debugLineNum = 214;BA.debugLine="Dim nextid As Int";
_nextid = 0;
 //BA.debugLineNum = 215;BA.debugLine="Dim strid As String";
_strid = "";
 //BA.debugLineNum = 217;BA.debugLine="If result.Size = 0 Then";
if (_result.getSize()==0) { 
 //BA.debugLineNum = 218;BA.debugLine="nextid = 0";
_nextid = (int) (0);
 }else {
 //BA.debugLineNum = 220;BA.debugLine="Dim nr As Map = result.Get(0)";
_nr = new anywheresoftware.b4a.objects.collections.Map();
_nr = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_result.Get((int) (0))));
 //BA.debugLineNum = 221;BA.debugLine="Dim ni As String = nr.Getdefault(PrimaryKey,\"0\")";
_ni = BA.ObjectToString(_nr.GetDefault((Object)(_primarykey),(Object)("0")));
 //BA.debugLineNum = 222;BA.debugLine="nextid = BANano.parseInt(ni)";
_nextid = _banano.parseInt((Object)(_ni));
 };
 //BA.debugLineNum = 224;BA.debugLine="nextid = nextid + 1";
_nextid = (int) (_nextid+1);
 //BA.debugLineNum = 225;BA.debugLine="strid = CStr(nextid)";
_strid = _cstr((Object)(_nextid));
 //BA.debugLineNum = 226;BA.debugLine="nextid = BANano.ParseInt(nextid)";
_nextid = _banano.parseInt((Object)(_nextid));
 //BA.debugLineNum = 227;BA.debugLine="Return strid";
if (true) return _strid;
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananoalasqle  _initialize(anywheresoftware.b4a.BA _ba,String _tblname,String _prikey) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 31;BA.debugLine="public Sub Initialize(tblName As String, priKey As";
 //BA.debugLineNum = 32;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 33;BA.debugLine="Schema.Initialize";
_schema.Initialize();
 //BA.debugLineNum = 34;BA.debugLine="TableName = tblName";
_tablename = _tblname;
 //BA.debugLineNum = 35;BA.debugLine="PrimaryKey = priKey";
_primarykey = _prikey;
 //BA.debugLineNum = 36;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 37;BA.debugLine="result.initialize";
_result.Initialize();
 //BA.debugLineNum = 38;BA.debugLine="command = \"\"";
_command = "";
 //BA.debugLineNum = 39;BA.debugLine="types = Null";
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 40;BA.debugLine="args = Null";
_args = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 41;BA.debugLine="query = \"\"";
_query = "";
 //BA.debugLineNum = 42;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 43;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 44;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 45;BA.debugLine="Record.initialize";
_record.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="OK = False";
_ok = __c.False;
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _insert() throws Exception{
 //BA.debugLineNum = 493;BA.debugLine="Sub Insert As BANanoAlaSQLE";
 //BA.debugLineNum = 494;BA.debugLine="Insert1(Record)";
_insert1(_record);
 //BA.debugLineNum = 495;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 496;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _insert1(anywheresoftware.b4a.objects.collections.Map _rec) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
 //BA.debugLineNum = 499;BA.debugLine="Sub Insert1(Rec As Map) As BANanoAlaSQLE";
 //BA.debugLineNum = 500;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 501;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 502;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 503;BA.debugLine="Dim listOfValues As List = GetMapValues(Rec)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_rec);
 //BA.debugLineNum = 504;BA.debugLine="Dim listOfTypes As List = GetMapTypes(Rec)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_rec);
 //BA.debugLineNum = 505;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 506;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 507;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 508;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 509;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 510;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(TableName)}";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" ("));
 //BA.debugLineNum = 511;BA.debugLine="iTot = Rec.Size - 1";
_itot = (int) (_rec.getSize()-1);
 //BA.debugLineNum = 512;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
 //BA.debugLineNum = 513;BA.debugLine="Dim col As String = Rec.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_rec.GetKeyAt(_icnt));
 //BA.debugLineNum = 514;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 515;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 516;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 518;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 519;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 521;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 522;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 523;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 524;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 525;BA.debugLine="query = sb.ToString";
_query = _sb.ToString();
 //BA.debugLineNum = 526;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 527;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 528;BA.debugLine="command = \"insert\"";
_command = "insert";
 //BA.debugLineNum = 529;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 530;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 531;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 532;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 533;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 534;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 535;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _insertlist() throws Exception{
String _ssql = "";
 //BA.debugLineNum = 417;BA.debugLine="Sub InsertList As BANanoAlaSQLE";
 //BA.debugLineNum = 418;BA.debugLine="Dim sSQL As String = $\"SELECT * INTO [${TableName";
_ssql = ("SELECT * INTO ["+__c.SmartStringFormatter("",(Object)(_tablename))+"] FROM ?");
 //BA.debugLineNum = 419;BA.debugLine="query = sSQL";
_query = _ssql;
 //BA.debugLineNum = 420;BA.debugLine="args = Null";
_args = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 421;BA.debugLine="types = Null";
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 422;BA.debugLine="command = \"insert\"";
_command = "insert";
 //BA.debugLineNum = 423;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 424;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 425;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 426;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 427;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 428;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return null;
}
public String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 904;BA.debugLine="private Sub Join(delimiter As String, lst As List)";
 //BA.debugLineNum = 905;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 906;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 907;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 908;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 909;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 910;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 911;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 912;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 913;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 915;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 916;BA.debugLine="End Sub";
return "";
}
public String  _joinfields(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 309;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
 //BA.debugLineNum = 310;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 311;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 312;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 313;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 314;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 315;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 316;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 317;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 318;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 319;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 320;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 322;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _json2list(String _strvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
com.ab.banano.BANanoJSONParser _parser = null;
 //BA.debugLineNum = 697;BA.debugLine="Sub Json2List(strValue As String) As List";
 //BA.debugLineNum = 698;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 699;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 700;BA.debugLine="lst.clear";
_lst.Clear();
 //BA.debugLineNum = 701;BA.debugLine="If strValue.Length = 0 Then";
if (_strvalue.length()==0) { 
 //BA.debugLineNum = 702;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 704;BA.debugLine="Try";
try { //BA.debugLineNum = 705;BA.debugLine="Dim parser As BANanoJSONParser";
_parser = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 706;BA.debugLine="parser.Initialize(strValue)";
_parser.Initialize(_strvalue);
 //BA.debugLineNum = 707;BA.debugLine="Return parser.NextArray";
if (true) return _parser.NextArray();
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 709;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 711;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _jsonx = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 340;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 341;BA.debugLine="Dim jsonx As BANanoJSONParser";
_jsonx = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 342;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 343;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 344;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 345;BA.debugLine="Try";
try { //BA.debugLineNum = 346;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 347;BA.debugLine="jsonx.Initialize(strJSON)";
_jsonx.Initialize(_strjson);
 //BA.debugLineNum = 348;BA.debugLine="Map1 = jsonx.NextObject";
_map1 = _jsonx.NextObject();
 };
 //BA.debugLineNum = 350;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 352;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public String  _list2json(anywheresoftware.b4a.objects.collections.List _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _xjson = null;
 //BA.debugLineNum = 690;BA.debugLine="Sub List2Json(mp As List) As String";
 //BA.debugLineNum = 691;BA.debugLine="Dim xjson As BANanoJSONGenerator";
_xjson = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 692;BA.debugLine="xjson.Initialize2(mp)";
_xjson.Initialize2(_mp);
 //BA.debugLineNum = 693;BA.debugLine="Return xjson.ToString";
if (true) return _xjson.ToString();
 //BA.debugLineNum = 694;BA.debugLine="End Sub";
return "";
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _xjson = null;
 //BA.debugLineNum = 683;BA.debugLine="Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 684;BA.debugLine="Dim xjson As BANanoJSONGenerator";
_xjson = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 685;BA.debugLine="xjson.Initialize(mp)";
_xjson.Initialize(_mp);
 //BA.debugLineNum = 686;BA.debugLine="Return xjson.ToString";
if (true) return _xjson.ToString();
 //BA.debugLineNum = 687;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _newlist() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 410;BA.debugLine="Sub NewList As List";
 //BA.debugLineNum = 411;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 412;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 413;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _read(String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
 //BA.debugLineNum = 746;BA.debugLine="Sub Read(primaryValue As String) As BANanoAlaSQLE";
 //BA.debugLineNum = 747;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 748;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 749;BA.debugLine="SelectWhere(Array(\"*\"), qw, Array(\"=\"), Array(Pri";
_selectwhere(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 750;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 751;BA.debugLine="End Sub";
return null;
}
public String  _recordfrommap(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 113;BA.debugLine="Sub RecordFromMap(sm As Map)";
 //BA.debugLineNum = 114;BA.debugLine="Record.Initialize";
_record.Initialize();
 //BA.debugLineNum = 115;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _sm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 116;BA.debugLine="Dim v As Object = sm.Get(k)";
_v = _sm.Get((Object)(_k));
 //BA.debugLineNum = 117;BA.debugLine="Record.Put(k, v)";
_record.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananoalasqle  _resettypes() throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub ResetTypes As BANanoAlaSQLE";
 //BA.debugLineNum = 209;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemaaddblob(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 51;BA.debugLine="Sub SchemaAddBlob(bools As List) As BANanoAlaSQLE";
 //BA.debugLineNum = 52;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 53;BA.debugLine="Schema.Put(b, DB_BLOB)";
_schema.Put((Object)(_b),(Object)(_db_blob));
 }
};
 //BA.debugLineNum = 55;BA.debugLine="AddBlobs(bools)";
_addblobs(_bools);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemaaddblobs(anywheresoftware.b4a.objects.collections.List _blobs) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SchemaAddBlobs(blobs As List) As BANanoAlaSQLE";
 //BA.debugLineNum = 160;BA.debugLine="SchemaAddBlob(blobs)";
_schemaaddblob(_blobs);
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemaaddboolean(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 60;BA.debugLine="Sub SchemaAddBoolean(bools As List) As BANanoAlaSQ";
 //BA.debugLineNum = 61;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 62;BA.debugLine="Schema.Put(b, DB_BOOL)";
_schema.Put((Object)(_b),(Object)(_db_bool));
 }
};
 //BA.debugLineNum = 64;BA.debugLine="AddBooleans(bools)";
_addbooleans(_bools);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemaaddbooleans(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Sub SchemaAddBooleans(bools As List) As BANanoAlaS";
 //BA.debugLineNum = 166;BA.debugLine="SchemaAddBoolean(bools)";
_schemaaddboolean(_bools);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemaadddate(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 69;BA.debugLine="Sub SchemaAddDate(bools As List) As BANanoAlaSQLE";
 //BA.debugLineNum = 70;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 71;BA.debugLine="Schema.Put(b, DB_DATE)";
_schema.Put((Object)(_b),(Object)(_db_date));
 }
};
 //BA.debugLineNum = 73;BA.debugLine="AddStrings(bools)";
_addstrings(_bools);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemaadddates(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub SchemaAddDates(dates As List) As BANanoAlaSQLE";
 //BA.debugLineNum = 183;BA.debugLine="SchemaAddDate(dates)";
_schemaadddate(_dates);
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemaadddoubles(anywheresoftware.b4a.objects.collections.List _dbls) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SchemaAddDoubles(dbls As List) As BANanoAlaSQL";
 //BA.debugLineNum = 177;BA.debugLine="SchemaAddFloat(dbls)";
_schemaaddfloat(_dbls);
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public String  _schemaaddfield(String _fldname,String _fldtype) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SchemaAddField(fldName As String, fldType As S";
 //BA.debugLineNum = 105;BA.debugLine="Schema.Put(fldName, fldType)";
_schema.Put((Object)(_fldname),(Object)(_fldtype));
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananoalasqle  _schemaaddfloat(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 78;BA.debugLine="Sub SchemaAddFloat(bools As List) As BANanoAlaSQLE";
 //BA.debugLineNum = 79;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 80;BA.debugLine="Schema.Put(b, DB_FLOAT)";
_schema.Put((Object)(_b),(Object)(_db_float));
 }
};
 //BA.debugLineNum = 82;BA.debugLine="AddDoubles(bools)";
_adddoubles(_bools);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemaaddint(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 96;BA.debugLine="Sub SchemaAddInt(bools As List) As BANanoAlaSQLE";
 //BA.debugLineNum = 97;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 98;BA.debugLine="Schema.Put(b, DB_INT)";
_schema.Put((Object)(_b),(Object)(_db_int));
 }
};
 //BA.debugLineNum = 100;BA.debugLine="AddIntegers(bools)";
_addintegers(_bools);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemaaddintegers(anywheresoftware.b4a.objects.collections.List _ints) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SchemaAddIntegers(ints As List) As BANanoAlaSQ";
 //BA.debugLineNum = 172;BA.debugLine="SchemaAddInt(ints)";
_schemaaddint(_ints);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemaaddstrings(anywheresoftware.b4a.objects.collections.List _strings) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SchemaAddStrings(strings As List) As BANanoAla";
 //BA.debugLineNum = 188;BA.debugLine="SchemaAddText(strings)";
_schemaaddtext(_strings);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemaaddtext(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 86;BA.debugLine="Sub SchemaAddText(bools As List) As BANanoAlaSQLE";
 //BA.debugLineNum = 87;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 88;BA.debugLine="Schema.Put(b, DB_STRING)";
_schema.Put((Object)(_b),(Object)(_db_string));
 }
};
 //BA.debugLineNum = 90;BA.debugLine="AddStrings(bools)";
_addstrings(_bools);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemaclear() throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SchemaClear As BANanoAlaSQLE";
 //BA.debugLineNum = 155;BA.debugLine="Schema.clear";
_schema.Clear();
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemacreatetable() throws Exception{
 //BA.debugLineNum = 367;BA.debugLine="Sub SchemaCreateTable As BANanoAlaSQLE";
 //BA.debugLineNum = 368;BA.debugLine="CreateTable(Schema)";
_createtable(_schema);
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _schemafromdesign(b4j.example.vmcontainer _cont) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SchemaFromDesign(cont As VMContainer) As BANan";
 //BA.debugLineNum = 194;BA.debugLine="SchemaAddBoolean(cont.Booleans)";
_schemaaddboolean(_cont._booleans /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 195;BA.debugLine="SchemaAddDate(cont.Dates)";
_schemaadddate(_cont._dates /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 196;BA.debugLine="SchemaAddFloat(cont.Doubles)";
_schemaaddfloat(_cont._doubles /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 197;BA.debugLine="SchemaAddInt(cont.Integers)";
_schemaaddint(_cont._integers /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 198;BA.debugLine="SchemaAddText(cont.Strings)";
_schemaaddtext(_cont._strings /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 200;BA.debugLine="AddStrings(cont.Strings)";
_addstrings(_cont._strings /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 201;BA.debugLine="AddIntegers(cont.Integers)";
_addintegers(_cont._integers /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 202;BA.debugLine="AddDoubles(cont.Doubles)";
_adddoubles(_cont._doubles /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 203;BA.debugLine="AddBooleans(cont.Booleans)";
_addbooleans(_cont._booleans /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 204;BA.debugLine="AddStrings(cont.Dates)";
_addstrings(_cont._dates /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _selectall(anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
 //BA.debugLineNum = 919;BA.debugLine="Sub SelectAll(tblfields As List, orderBy As List)";
 //BA.debugLineNum = 921;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 922;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 923;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 925;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 927;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 929;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 930;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 931;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+""));
 //BA.debugLineNum = 932;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 934;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 935;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 936;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 939;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 940;BA.debugLine="args = Null";
_args = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 941;BA.debugLine="types = Null";
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 942;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 943;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 944;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 945;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 946;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 947;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 948;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 949;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _selectwhere(anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
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
 //BA.debugLineNum = 796;BA.debugLine="Sub SelectWhere(tblfields As List, tblWhere As Map";
 //BA.debugLineNum = 797;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 798;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 799;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 801;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 802;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 803;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 805;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 807;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 809;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 810;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 811;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" WHERE "));
 //BA.debugLineNum = 812;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 813;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 814;BA.debugLine="For i = 0 To iWhere";
{
final int step17 = 1;
final int limit17 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
 //BA.debugLineNum = 815;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 816;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 818;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 819;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 820;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 821;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 823;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 825;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 826;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 827;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 830;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 831;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 832;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 833;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 834;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 835;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 836;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 837;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 838;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 839;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 840;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _selectwhere1(anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _andor,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
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
 //BA.debugLineNum = 852;BA.debugLine="Sub SelectWhere1(tblfields As List, tblWhere As Ma";
 //BA.debugLineNum = 853;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 854;BA.debugLine="If AndOr = Null Then AndOr = AndOrOperators(tblWh";
if (_andor== null) { 
_andor = _andoroperators(_tblwhere);};
 //BA.debugLineNum = 855;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 856;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 858;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 859;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 860;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 862;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 864;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 866;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 867;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 868;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" WHERE "));
 //BA.debugLineNum = 869;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 870;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 871;BA.debugLine="For i = 0 To iWhere";
{
final int step18 = 1;
final int limit18 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
 //BA.debugLineNum = 872;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 873;BA.debugLine="Dim sandor As String = AndOr.get(i)";
_sandor = BA.ObjectToString(_andor.Get(_i));
 //BA.debugLineNum = 874;BA.debugLine="sb.Append($\" ${sandor} \"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_sandor))+" "));
 };
 //BA.debugLineNum = 876;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 877;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 878;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 879;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 881;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 883;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 884;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 885;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 888;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 889;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 890;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 891;BA.debugLine="command = \"select\"";
_command = "select";
 //BA.debugLineNum = 892;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 893;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 894;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 895;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 896;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 897;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 898;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _setfield(String _fldname,Object _fldvalue) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetField(fldName As String, fldValue As Object";
 //BA.debugLineNum = 109;BA.debugLine="Record.Put(fldName, fldValue)";
_record.Put((Object)(_fldname),_fldvalue);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _update(String _privalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tblwhere = null;
 //BA.debugLineNum = 137;BA.debugLine="Sub Update(priValue As String) As BANanoAlaSQLE";
 //BA.debugLineNum = 138;BA.debugLine="Dim tblWhere As Map = CreateMap()";
_tblwhere = new anywheresoftware.b4a.objects.collections.Map();
_tblwhere = __c.createMap(new Object[] {});
 //BA.debugLineNum = 139;BA.debugLine="tblWhere.Put(PrimaryKey, priValue)";
_tblwhere.Put((Object)(_primarykey),(Object)(_privalue));
 //BA.debugLineNum = 140;BA.debugLine="UpdateWhere(Record, tblWhere, Null)";
_updatewhere(_record,_tblwhere,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _update1(anywheresoftware.b4a.objects.collections.Map _rec,String _privalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tblwhere = null;
 //BA.debugLineNum = 144;BA.debugLine="Sub Update1(rec As Map, priValue As String) As BAN";
 //BA.debugLineNum = 145;BA.debugLine="Record = rec";
_record = _rec;
 //BA.debugLineNum = 146;BA.debugLine="Dim tblWhere As Map = CreateMap()";
_tblwhere = new anywheresoftware.b4a.objects.collections.Map();
_tblwhere = __c.createMap(new Object[] {});
 //BA.debugLineNum = 147;BA.debugLine="tblWhere.Put(PrimaryKey, priValue)";
_tblwhere.Put((Object)(_primarykey),(Object)(_privalue));
 //BA.debugLineNum = 148;BA.debugLine="UpdateWhere(rec, tblWhere, Null)";
_updatewhere(_rec,_tblwhere,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _updateall(anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _oper = "";
String _col = "";
 //BA.debugLineNum = 714;BA.debugLine="Sub UpdateAll(tblFields As Map, operators As List)";
 //BA.debugLineNum = 715;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblfields);};
 //BA.debugLineNum = 716;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 717;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 718;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 719;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 720;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(TableName)} SET";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" SET "));
 //BA.debugLineNum = 721;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 722;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 723;BA.debugLine="For i = 0 To iTot";
{
final int step9 = 1;
final int limit9 = _itot;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 724;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 725;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 726;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 727;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 728;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
 //BA.debugLineNum = 730;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 };
 }
};
 //BA.debugLineNum = 733;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 734;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 735;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 736;BA.debugLine="command = \"update\"";
_command = "update";
 //BA.debugLineNum = 737;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 738;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 739;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 740;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 741;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 742;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasqle  _updatewhere(anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
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
 //BA.debugLineNum = 590;BA.debugLine="Sub UpdateWhere(tblfields As Map, tblWhere As Map,";
 //BA.debugLineNum = 591;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 592;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 593;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 594;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
 //BA.debugLineNum = 595;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 596;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 597;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
 //BA.debugLineNum = 598;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 599;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 600;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(TableName)} SET";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tablename)))+" SET "));
 //BA.debugLineNum = 601;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 602;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 603;BA.debugLine="For i = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
 //BA.debugLineNum = 604;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 605;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 606;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 607;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
 //BA.debugLineNum = 609;BA.debugLine="sb.Append(\" = ?\")";
_sb.Append(" = ?");
 };
 }
};
 //BA.debugLineNum = 612;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
 //BA.debugLineNum = 613;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 614;BA.debugLine="For i = 0 To iWhere";
{
final int step24 = 1;
final int limit24 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
 //BA.debugLineNum = 615;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 616;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 618;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 619;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 620;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 621;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 623;BA.debugLine="query = sb.tostring";
_query = _sb.ToString();
 //BA.debugLineNum = 624;BA.debugLine="args = listOfValues";
_args = _listofvalues;
 //BA.debugLineNum = 625;BA.debugLine="types = listOfTypes";
_types = _listoftypes;
 //BA.debugLineNum = 626;BA.debugLine="command = \"update\"";
_command = "update";
 //BA.debugLineNum = 627;BA.debugLine="response = \"\"";
_response = "";
 //BA.debugLineNum = 628;BA.debugLine="error = \"\"";
_error = "";
 //BA.debugLineNum = 629;BA.debugLine="result = NewList";
_result = _newlist();
 //BA.debugLineNum = 630;BA.debugLine="json = \"\"";
_json = "";
 //BA.debugLineNum = 631;BA.debugLine="affectedRows = 0";
_affectedrows = (long) (0);
 //BA.debugLineNum = 632;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasqle)(this);
 //BA.debugLineNum = 633;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
