

/* bananovuetifyconnect */
/* =========================== BANanoAlaSQLE  =========================== */
function banano_bananovuetifyconnect_bananoalasqle() {
var _B=this;
_B._db_bool="BOOL";

_B._db_int="INT";

_B._db_string="STRING";

_B._db_real="REAL";

_B._db_date="DATE";

_B._db_blob="BLOB";

_B._db_float="FLOAT";

_B._db_integer="INTEGER";

_B._db_text="TEXT";

_B._rectype={};

_B._schema={};

_B._tablename="";

_B._primarykey="";

_B._response="";

_B._result=[];

_B._command="";

_B._types=[];

_B._args=[];

_B._query="";

_B._json="";

_B._error="";

_B._affectedrows=0;

_B._record={};

_B._ok=false;

// [31] public Sub Initialize(tblName As String, priKey As String) As BANanoAlaSQLE 
_B.initialize=function(_tblname,_prikey) {
// [32]  recType.Initialize 
_B._rectype={};
// [33]  Schema.Initialize 
_B._schema={};
// [34]  TableName = tblName 
_B._tablename=_tblname;
// [35]  PrimaryKey = priKey 
_B._primarykey=_prikey;
// [36]  response = {30} 
_B._response="";
// [37]  result.initialize 
_B._result.length=0;
// [38]  command = {31} 
_B._command="";
// [39]  types = Null 
_B._types=null;
// [40]  args = Null 
_B._args=null;
// [41]  query = {32} 
_B._query="";
// [42]  json = {33} 
_B._json="";
// [43]  error = {34} 
_B._error="";
// [44]  affectedRows = 0 
_B._affectedrows=0;
// [45]  Record.initialize 
_B._record={};
// [46]  OK = False 
_B._ok=false;
// [47]  Return Me 
return _B;
// End Sub
};

// [51] Sub SchemaAddBlob(bools As List) As BANanoAlaSQLE 
_B.schemaaddblob=function(_bools) {
var _b;
// [52]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [53]  Schema.Put(b, DB_BLOB) 
_B._schema[_b]=_B._db_blob;
// [54]  Next 
}
// [55]  AddBlobs(bools) 
_B.addblobs(_bools,_B);
// [56]  Return Me 
return _B;
// End Sub
};

// [60] Sub SchemaAddBoolean(bools As List) As BANanoAlaSQLE 
_B.schemaaddboolean=function(_bools) {
var _b;
// [61]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [62]  Schema.Put(b, DB_BOOL) 
_B._schema[_b]=_B._db_bool;
// [63]  Next 
}
// [64]  AddBooleans(bools) 
_B.addbooleans(_bools,_B);
// [65]  Return Me 
return _B;
// End Sub
};

// [69] Sub SchemaAddDate(bools As List) As BANanoAlaSQLE 
_B.schemaadddate=function(_bools) {
var _b;
// [70]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [71]  Schema.Put(b, DB_DATE) 
_B._schema[_b]=_B._db_date;
// [72]  Next 
}
// [73]  AddStrings(bools) 
_B.addstrings(_bools,_B);
// [74]  Return Me 
return _B;
// End Sub
};

// [78] Sub SchemaAddFloat(bools As List) As BANanoAlaSQLE 
_B.schemaaddfloat=function(_bools) {
var _b;
// [79]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [80]  Schema.Put(b, DB_FLOAT) 
_B._schema[_b]=_B._db_float;
// [81]  Next 
}
// [82]  AddDoubles(bools) 
_B.adddoubles(_bools,_B);
// [83]  Return Me 
return _B;
// End Sub
};

// [86] Sub SchemaAddText(bools As List) As BANanoAlaSQLE 
_B.schemaaddtext=function(_bools) {
var _b;
// [87]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [88]  Schema.Put(b, DB_STRING) 
_B._schema[_b]=_B._db_string;
// [89]  Next 
}
// [90]  AddStrings(bools) 
_B.addstrings(_bools,_B);
// [91]  Return Me 
return _B;
// End Sub
};

// [96] Sub SchemaAddInt(bools As List) As BANanoAlaSQLE 
_B.schemaaddint=function(_bools) {
var _b;
// [97]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [98]  Schema.Put(b, DB_INT) 
_B._schema[_b]=_B._db_int;
// [99]  Next 
}
// [100]  AddIntegers(bools) 
_B.addintegers(_bools,_B);
// [101]  Return Me 
return _B;
// End Sub
};

// [104] Sub SchemaAddField(fldName As String, fldType As String) 
_B.schemaaddfield=function(_fldname,_fldtype) {
// [105]  Schema.Put(fldName, fldType) 
_B._schema[_fldname]=_fldtype;
// End Sub
};

// [108] Sub SetField(fldName As String, fldValue As Object) As BANanoAlaSQLE 
_B.setfield=function(_fldname,_fldvalue) {
// [109]  Record.Put(fldName, fldValue) 
_B._record[_fldname]=_fldvalue;
// [110]  Return Me 
return _B;
// End Sub
};

// [113] Sub RecordFromMap(sm As Map) 
_B.recordfrommap=function(_sm) {
var _k,_v;
// [114]  Record.Initialize 
_B._record={};
// [115]  For Each k As String In sm.Keys 
var _kKeys = Object.keys(_sm);
for (var _kindex=0;_kindex<_kKeys.length;_kindex++) {
_k=_kKeys[_kindex];
// [116]  Dim v As Object = sm.Get(k) 
_v=_sm[_k];
// [117]  Record.Put(k, v) 
_B._record[_k]=_v;
// [118]  Next 
}
// End Sub
};

// [122] Sub FirstRecord As Map 
_B.firstrecord=function() {
var _rec;
// [123]  Dim rec As Map = result.Get(0) 
_rec=_B._result[0];
// [124]  Return rec 
return _rec;
// End Sub
};

// [129] Sub FromJSON As BANanoAlaSQLE 
_B.fromjson=function() {
// [130]  response = {35} 
_B._response="Success";
// [131]  error = {36} 
_B._error="";
// [132]  affectedRows = result.size 
_B._affectedrows=_B._result.length;
// [133]  OK = True 
_B._ok=true;
// [134]  Return Me 
return _B;
// End Sub
};

// [137] Sub Update(priValue As String) As BANanoAlaSQLE 
_B.update=function(_privalue) {
var _tblwhere;
// [138]  Dim tblWhere As Map = CreateMap() 
_tblwhere={};
// [139]  tblWhere.Put(PrimaryKey, priValue) 
_tblwhere[_B._primarykey]=_privalue;
// [140]  UpdateWhere(Record, tblWhere, Null) 
_B.updatewhere(_B._record,_tblwhere,null,_B);
// [141]  Return Me 
return _B;
// End Sub
};

// [144] Sub Update1(rec As Map, priValue As String) As BANanoAlaSQLE 
_B.update1=function(_rec,_privalue) {
var _tblwhere;
// [145]  Record = rec 
_B._record=_rec;
// [146]  Dim tblWhere As Map = CreateMap() 
_tblwhere={};
// [147]  tblWhere.Put(PrimaryKey, priValue) 
_tblwhere[_B._primarykey]=_privalue;
// [148]  UpdateWhere(rec, tblWhere, Null) 
_B.updatewhere(_rec,_tblwhere,null,_B);
// [149]  Return Me 
return _B;
// End Sub
};

// [154] Sub SchemaClear As BANanoAlaSQLE 
_B.schemaclear=function() {
// [155]  Schema.clear 
_B._schema={};
// [156]  Return Me 
return _B;
// End Sub
};

// [159] Sub SchemaAddBlobs(blobs As List) As BANanoAlaSQLE 
_B.schemaaddblobs=function(_blobs) {
// [160]  SchemaAddBlob(blobs) 
_B.schemaaddblob(_blobs,_B);
// [161]  Return Me 
return _B;
// End Sub
};

// [165] Sub SchemaAddBooleans(bools As List) As BANanoAlaSQLE 
_B.schemaaddbooleans=function(_bools) {
// [166]  SchemaAddBoolean(bools) 
_B.schemaaddboolean(_bools,_B);
// [167]  Return Me 
return _B;
// End Sub
};

// [171] Sub SchemaAddIntegers(ints As List) As BANanoAlaSQLE 
_B.schemaaddintegers=function(_ints) {
// [172]  SchemaAddInt(ints) 
_B.schemaaddint(_ints,_B);
// [173]  Return Me 
return _B;
// End Sub
};

// [176] Sub SchemaAddDoubles(dbls As List) As BANanoAlaSQLE 
_B.schemaadddoubles=function(_dbls) {
// [177]  SchemaAddFloat(dbls) 
_B.schemaaddfloat(_dbls,_B);
// [178]  Return Me 
return _B;
// End Sub
};

// [182] Sub SchemaAddDates(dates As List) As BANanoAlaSQLE 
_B.schemaadddates=function(_dates) {
// [183]  SchemaAddDate(dates) 
_B.schemaadddate(_dates,_B);
// [184]  Return Me 
return _B;
// End Sub
};

// [187] Sub SchemaAddStrings(strings As List) As BANanoAlaSQLE 
_B.schemaaddstrings=function(_strings) {
// [188]  SchemaAddText(strings) 
_B.schemaaddtext(_strings,_B);
// [189]  Return Me 
return _B;
// End Sub
};

// [193] Sub SchemaFromDesign(cont As VMContainer) As BANanoAlaSQLE 
_B.schemafromdesign=function(_cont) {
// [194]  SchemaAddBoolean(cont.Booleans) 
_B.schemaaddboolean(_cont._booleans,_B);
// [195]  SchemaAddDate(cont.Dates) 
_B.schemaadddate(_cont._dates,_B);
// [196]  SchemaAddFloat(cont.Doubles) 
_B.schemaaddfloat(_cont._doubles,_B);
// [197]  SchemaAddInt(cont.Integers) 
_B.schemaaddint(_cont._integers,_B);
// [198]  SchemaAddText(cont.Strings) 
_B.schemaaddtext(_cont._strings,_B);
// [200]  AddStrings(cont.Strings) 
_B.addstrings(_cont._strings,_B);
// [201]  AddIntegers(cont.Integers) 
_B.addintegers(_cont._integers,_B);
// [202]  AddDoubles(cont.Doubles) 
_B.adddoubles(_cont._doubles,_B);
// [203]  AddBooleans(cont.Booleans) 
_B.addbooleans(_cont._booleans,_B);
// [204]  AddStrings(cont.Dates) 
_B.addstrings(_cont._dates,_B);
// [205]  Return Me 
return _B;
// End Sub
};

// [208] Sub ResetTypes As BANanoAlaSQLE 
_B.resettypes=function() {
// [209]  recType.Initialize 
_B._rectype={};
// [210]  Return Me 
return _B;
// End Sub
};

// [213] Sub GetNextID As String 
_B.getnextid=function() {
var _nextid,_strid,_nr,_ni;
// [214]  Dim nextid As Int 
_nextid=0;
// [215]  Dim strid As String 
_strid="";
// [217]  If result.Size = 0 Then 
if (_B._result.length==0) {
// [218]  nextid = 0 
_nextid=0;
// [219]  Else 
} else {
// [220]  Dim nr As Map = result.Get(0) 
_nr=_B._result[0];
// [221]  Dim ni As String = nr.Getdefault(PrimaryKey, {37} ) 
_ni=(_nr[_B._primarykey] || "0");
// [222]  nextid = BANano.parseInt(ni) 
_nextid=parseInt(_ni);
// [223]  End If 
}
// [224]  nextid = nextid + 1 
_nextid=_nextid+1;
// [225]  strid = CStr(nextid) 
_strid=_B.cstr(_nextid,_B);
// [226]  nextid = BANano.ParseInt(nextid) 
_nextid=parseInt(_nextid);
// [227]  Return strid 
return _strid;
// End Sub
};

// [231] Sub CStr(o As Object) As String 
_B.cstr=function(_o) {
// [232]  Return {38} & o 
return ""+_o;
// End Sub
};

// [237] Sub AddStrings(fieldNames As List) As BANanoAlaSQLE 
_B.addstrings=function(_fieldnames) {
var _strfld;
// [238]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [239]  recType.Put(strfld, {39} ) 
_B._rectype[_strfld]="STRING";
// [240]  Next 
}
// [241]  Return Me 
return _B;
// End Sub
};

// [245] Sub AddIntegers(fieldNames As List) As BANanoAlaSQLE 
_B.addintegers=function(_fieldnames) {
var _strfld;
// [246]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [247]  recType.Put(strfld, {40} ) 
_B._rectype[_strfld]="INT";
// [248]  Next 
}
// [249]  Return Me 
return _B;
// End Sub
};

// [253] Sub AddDoubles(fieldNames As List) As BANanoAlaSQLE 
_B.adddoubles=function(_fieldnames) {
var _strfld;
// [254]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [255]  recType.Put(strfld, {41} ) 
_B._rectype[_strfld]="DOUBLE";
// [256]  Next 
}
// [257]  Return Me 
return _B;
// End Sub
};

// [261] Sub AddBooleans(fieldNames As List) As BANanoAlaSQLE 
_B.addbooleans=function(_fieldnames) {
var _strfld;
// [262]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [263]  recType.Put(strfld, {42} ) 
_B._rectype[_strfld]="BOOL";
// [264]  Next 
}
// [265]  Return Me 
return _B;
// End Sub
};

// [269] Sub AddBlobs(fieldNames As List) As BANanoAlaSQLE 
_B.addblobs=function(_fieldnames) {
var _strfld;
// [270]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [271]  recType.Put(strfld, {43} ) 
_B._rectype[_strfld]="BLOB";
// [272]  Next 
}
// [273]  Return Me 
return _B;
// End Sub
};

// [277] private Sub GetMapValues(sourceMap As Map) As List 
_B.getmapvalues=function(_sourcemap) {
var _listofvalues,_icnt,_itot,_key,_value,_vtype;
// [278]  Dim listOfValues As List 
_listofvalues=[];
// [279]  listOfValues.Initialize 
_listofvalues.length=0;
// [280]  Dim iCnt As Int 
_icnt=0;
// [281]  Dim iTot As Int 
_itot=0;
// [282]  iTot = sourceMap.Size - 1 
_itot=Object.keys(_sourcemap).length-1;
// [283]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [285]  Dim key As String = sourceMap.getkeyat(iCnt) 
_key=banano_getB4JKeyAt(_sourcemap,_icnt);
// [286]  Dim value As String = sourceMap.GetValueAt(iCnt) 
_value=banano_getB4JValueAt(_sourcemap,_icnt);
// [287]  value = CStr(value) 
_value=_B.cstr(_value,_B);
// [288]  value = value.trim 
_value=_value.trim();
// [290]  Dim vtype As String = GetMapType(key) 
_vtype=_B.getmaptype(_key,_B);
// [291]  Select Case vtype 
switch ("" + _vtype) {
// [292]  Case {44} 
case "" + "i":
// [294]  If value = {45} Then value = {46} 
if (_value=="") {_value="0";}
// [295]  value = BANano.parseInt(value) 
_value=parseInt(_value);
// [296]  Case {47} 
break;
case "" + "d":
// [298]  If value = {48} Then value = {49} 
if (_value=="") {_value="0";}
// [299]  value = BANano.parsefloat(value) 
_value=parseFloat(_value);
// [300]  Case {50} , {51} 
break;
case "" + "s":
case "" + "b":
// [302]  End Select 
break;
}
// [303]  listOfValues.Add(value) 
_listofvalues.push(_value);
// [304]  Next 
}
// [305]  Return listOfValues 
return _listofvalues;
// End Sub
};

// [309] private Sub JoinFields(delimiter As String, lst As List) As String 
_B.joinfields=function(_delimiter,_lst) {
var _i,_sb,_fld;
// [310]  Dim i As Int 
_i=0;
// [311]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [312]  Dim fld As String 
_fld="";
// [313]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [314]  fld = lst.Get(0) 
_fld=_lst[0];
// [315]  fld = EscapeField(fld) 
_fld=_B.escapefield(_fld,_B);
// [316]  sb.Append(fld) 
_sb.append(_fld);
// [317]  For i = 1 To lst.size - 1 
for (_i=1;_i<=_lst.length-1;_i++) {
// [318]  Dim fld As String = lst.Get(i) 
_fld=_lst[_i];
// [319]  fld = EscapeField(fld) 
_fld=_B.escapefield(_fld,_B);
// [320]  sb.Append(delimiter).Append(fld) 
_sb.append(_delimiter).append(_fld);
// [321]  Next 
}
// [322]  Return sb.ToString 
return _sb.toString();
// End Sub
};

// [326] private Sub GetMapKeys(sourceMap As Map) As List 
_B.getmapkeys=function(_sourcemap) {
var _listofvalues,_icnt,_itot,_value;
// [327]  Dim listOfValues As List 
_listofvalues=[];
// [328]  listOfValues.Initialize 
_listofvalues.length=0;
// [329]  Dim iCnt As Int 
_icnt=0;
// [330]  Dim iTot As Int 
_itot=0;
// [331]  iTot = sourceMap.Size - 1 
_itot=Object.keys(_sourcemap).length-1;
// [332]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [333]  Dim value As String = sourceMap.GetKeyAt(iCnt) 
_value=banano_getB4JKeyAt(_sourcemap,_icnt);
// [334]  listOfValues.Add(value) 
_listofvalues.push(_value);
// [335]  Next 
}
// [336]  Return listOfValues 
return _listofvalues;
// End Sub
};

// [340] Sub Json2Map(strJSON As String) As Map 
_B.json2map=function(_strjson) {
var _jsonx,_map1;
// [341]  Dim jsonx As BANanoJSONParser 
_jsonx={};
// [342]  Dim Map1 As Map 
_map1={};
// [343]  Map1.Initialize 
_map1={};
// [344]  Map1.clear 
_map1={};
// [345]  Try 
try {
// [346]  If strJSON.length > 0 Then 
if (_strjson.length>0) {
// [347]  jsonx.Initialize(strJSON) 
_jsonx=JSON.parse(_strjson);
// [348]  Map1 = jsonx.NextObject 
_map1=_jsonx;
// [349]  End If 
}
// [350]  Return Map1 
return _map1;
// [351]  Catch 
} catch(err) {
// [352]  Return Map1 
return _map1;
// [353]  End Try 
}
// End Sub
};

// [356] Sub Delete(primaryValue As String) As BANanoAlaSQLE 
_B.delete=function(_primaryvalue) {
var _qw;
// [357]  Dim qw As Map = CreateMap() 
_qw={};
// [358]  qw.Put(PrimaryKey, primaryValue) 
_qw[_B._primarykey]=_primaryvalue;
// [359]  DeleteWhere(qw, Array( {52} )) 
_B.deletewhere(_qw,["="],_B);
// [360]  Return Me 
return _B;
// End Sub
};

// [363] Private Sub EscapeField(f As String) As String 
_B.escapefield=function(_f) {
// [364]  Return {0} 
return "[" + _f + "]";
// End Sub
};

// [367] Sub SchemaCreateTable As BANanoAlaSQLE 
_B.schemacreatetable=function() {
// [368]  CreateTable(Schema) 
_B.createtable(_B._schema,_B);
// [369]  Return Me 
return _B;
// End Sub
};

// [373] public Sub CreateTable(tblFields As Map) As BANanoAlaSQLE 
_B.createtable=function(_tblfields) {
var _fldname,_fldtype,_fldtot,_fldcnt,_sb;
// [374]  Dim fldName As String 
_fldname="";
// [375]  Dim fldType As String 
_fldtype="";
// [376]  Dim fldTot As Int 
_fldtot=0;
// [377]  Dim fldCnt As Int 
_fldcnt=0;
// [378]  fldTot = tblFields.Size - 1 
_fldtot=Object.keys(_tblfields).length-1;
// [379]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [380]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [381]  sb.Append( {53} ) 
_sb.append("(");
// [382]  For fldCnt = 0 To fldTot 
for (_fldcnt=0;_fldcnt<=_fldtot;_fldcnt++) {
// [383]  fldName = tblFields.GetKeyAt(fldCnt) 
_fldname=banano_getB4JKeyAt(_tblfields,_fldcnt);
// [384]  fldType = tblFields.Get(fldName) 
_fldtype=_tblfields[_fldname];
// [385]  If fldCnt > 0 Then 
if (_fldcnt>0) {
// [386]  sb.Append( {54} ) 
_sb.append(", ");
// [387]  End If 
}
// [388]  sb.Append(EscapeField(fldName)) 
_sb.append(_B.escapefield(_fldname,_B));
// [389]  sb.Append( {55} ) 
_sb.append(" ");
// [390]  sb.Append(fldType) 
_sb.append(_fldtype);
// [391]  If fldName.EqualsIgnoreCase(PrimaryKey) Then 
if (_fldname.equalsIgnoreCase(_B._primarykey)) {
// [392]  sb.Append( {56} ) 
_sb.append(" PRIMARY KEY");
// [393]  End If 
}
// [394]  Next 
}
// [395]  sb.Append( {57} ) 
_sb.append(")");
// [397]  query = {58} & EscapeField(TableName) & {59} & sb.ToString 
_B._query="CREATE TABLE IF NOT EXISTS "+_B.escapefield(_B._tablename,_B)+" "+_sb.toString();
// [398]  args = Null 
_B._args=null;
// [399]  types = Null 
_B._types=null;
// [400]  command = {60} 
_B._command="createtable";
// [401]  response = {61} 
_B._response="";
// [402]  error = {62} 
_B._error="";
// [403]  result = NewList 
_B._result=_B.newlist(_B);
// [404]  json = {63} 
_B._json="";
// [405]  affectedRows = 0 
_B._affectedrows=0;
// [406]  Return Me 
return _B;
// End Sub
};

// [410] Sub NewList As List 
_B.newlist=function() {
var _lst;
// [411]  Dim lst As List 
_lst=[];
// [412]  lst.Initialize 
_lst.length=0;
// [413]  Return lst 
return _lst;
// End Sub
};

// [417] Sub InsertList As BANanoAlaSQLE 
_B.insertlist=function() {
var _ssql;
// [418]  Dim sSQL As String = {1} 
_ssql="SELECT * INTO [" + _B._tablename + "] FROM ?";
// [419]  query = sSQL 
_B._query=_ssql;
// [420]  args = Null 
_B._args=null;
// [421]  types = Null 
_B._types=null;
// [422]  command = {64} 
_B._command="insert";
// [423]  response = {65} 
_B._response="";
// [424]  error = {66} 
_B._error="";
// [425]  result = NewList 
_B._result=_B.newlist(_B);
// [426]  json = {67} 
_B._json="";
// [427]  affectedRows = 0 
_B._affectedrows=0;
// [428]  Return Me 
return _B;
// End Sub
};

// [432] Sub GetMax As BANanoAlaSQLE 
_B.getmax=function() {
var _sb;
// [433]  Dim sb As String = {2} 
_sb="SELECT MAX([" + _B._primarykey + "]) As [" + _B._primarykey + "] FROM " + _B.escapefield(_B._tablename,_B) + "";
// [434]  query = sb 
_B._query=_sb;
// [435]  args = Null 
_B._args=null;
// [436]  types = Null 
_B._types=null;
// [437]  command = {68} 
_B._command="getmax";
// [438]  response = {69} 
_B._response="";
// [439]  error = {70} 
_B._error="";
// [440]  result = NewList 
_B._result=_B.newlist(_B);
// [441]  json = {71} 
_B._json="";
// [442]  affectedRows = 0 
_B._affectedrows=0;
// [443]  Return Me 
return _B;
// End Sub
};

// [447] Sub GetMin As BANanoAlaSQLE 
_B.getmin=function() {
var _sb;
// [448]  Dim sb As String = {3} 
_sb="SELECT MIN([" + _B._primarykey + "]) As [" + _B._primarykey + "] FROM " + _B.escapefield(_B._tablename,_B) + "";
// [449]  query = sb 
_B._query=_sb;
// [450]  args = Null 
_B._args=null;
// [451]  types = Null 
_B._types=null;
// [452]  command = {72} 
_B._command="getmin";
// [453]  response = {73} 
_B._response="";
// [454]  error = {74} 
_B._error="";
// [455]  result = NewList 
_B._result=_B.newlist(_B);
// [456]  json = {75} 
_B._json="";
// [457]  affectedRows = 0 
_B._affectedrows=0;
// [458]  Return Me 
return _B;
// End Sub
};

// [463] public Sub DropTable As BANanoAlaSQLE 
_B.droptable=function() {
// [465]  query = {76} & EscapeField(TableName) 
_B._query="DROP TABLE "+_B.escapefield(_B._tablename,_B);
// [466]  args = Null 
_B._args=null;
// [467]  types = Null 
_B._types=null;
// [468]  response = {77} 
_B._response="";
// [469]  error = {78} 
_B._error="";
// [470]  command = {79} 
_B._command="droptable";
// [471]  result = NewList 
_B._result=_B.newlist(_B);
// [472]  json = {80} 
_B._json="";
// [473]  affectedRows = 0 
_B._affectedrows=0;
// [474]  Return Me 
return _B;
// End Sub
};

// [477] Sub Execute(strSQL As String) As BANanoAlaSQLE 
_B.execute=function(_strsql) {
// [478]  strSQL = strSQL.trim 
_strsql=_strsql.trim();
// [479]  query = strSQL 
_B._query=_strsql;
// [480]  args = Null 
_B._args=null;
// [481]  types = Null 
_B._types=null;
// [482]  command = {81} 
_B._command="execute";
// [483]  response = {82} 
_B._response="";
// [484]  error = {83} 
_B._error="";
// [485]  result = NewList 
_B._result=_B.newlist(_B);
// [486]  json = {84} 
_B._json="";
// [487]  affectedRows = 0 
_B._affectedrows=0;
// [488]  Return Me 
return _B;
// End Sub
};

// [493] Sub Insert As BANanoAlaSQLE 
_B.insert=function() {
// [494]  Insert1(Record) 
_B.insert1(_B._record,_B);
// [495]  Return Me 
return _B;
// End Sub
};

// [499] Sub Insert1(Rec As Map) As BANanoAlaSQLE 
_B.insert1=function(_rec) {
var _sb,_columns,_values,_listofvalues,_listoftypes,_icnt,_itot,_col;
// [500]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [501]  Dim columns As StringBuilder 
_columns=new StringBuilder();
// [502]  Dim values As StringBuilder 
_values=new StringBuilder();
// [503]  Dim listOfValues As List = GetMapValues(Rec) 
_listofvalues=_B.getmapvalues(_rec,_B);
// [504]  Dim listOfTypes As List = GetMapTypes(Rec) 
_listoftypes=_B.getmaptypes(_rec,_B);
// [505]  Dim iCnt As Int 
_icnt=0;
// [506]  Dim iTot As Int 
_itot=0;
// [507]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [508]  columns.Initialize 
_columns.init();
_columns.isinitialized=true;
// [509]  values.Initialize 
_values.init();
_values.isinitialized=true;
// [510]  sb.Append( {4} ) 
_sb.append("INSERT INTO " + _B.escapefield(_B._tablename,_B) + " (");
// [511]  iTot = Rec.Size - 1 
_itot=Object.keys(_rec).length-1;
// [512]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [513]  Dim col As String = Rec.GetKeyAt(iCnt) 
_col=banano_getB4JKeyAt(_rec,_icnt);
// [514]  If iCnt > 0 Then 
if (_icnt>0) {
// [515]  columns.Append( {85} ) 
_columns.append(", ");
// [516]  values.Append( {86} ) 
_values.append(", ");
// [517]  End If 
}
// [518]  columns.Append(EscapeField(col)) 
_columns.append(_B.escapefield(_col,_B));
// [519]  values.Append( {87} ) 
_values.append("?");
// [520]  Next 
}
// [521]  sb.Append(columns.ToString) 
_sb.append(_columns.toString());
// [522]  sb.Append( {88} ) 
_sb.append(") VALUES (");
// [523]  sb.Append(values.ToString) 
_sb.append(_values.toString());
// [524]  sb.Append( {89} ) 
_sb.append(")");
// [525]  query = sb.ToString 
_B._query=_sb.toString();
// [526]  args = listOfValues 
_B._args=_listofvalues;
// [527]  types = listOfTypes 
_B._types=_listoftypes;
// [528]  command = {90} 
_B._command="insert";
// [529]  response = {91} 
_B._response="";
// [530]  error = {92} 
_B._error="";
// [531]  result = NewList 
_B._result=_B.newlist(_B);
// [532]  json = {93} 
_B._json="";
// [533]  affectedRows = 0 
_B._affectedrows=0;
// [534]  Return Me 
return _B;
// End Sub
};

// [537] private Sub GetMapType(k As String) As String 
_B.getmaptype=function(_k) {
var _coltype;
// [538]  If recType.ContainsKey(k) Then 
if ((_k in _B._rectype)) {
// [539]  Dim colType As String = recType.GetDefault(k, {94} ) 
_coltype=(_B._rectype[_k] || "STRING");
// [540]  Select Case colType 
switch ("" + _coltype) {
// [541]  Case {95} , {96} , {97} , {98} 
case "" + "INTEGER":
case "" + "INT":
case "" + "BOOL":
case "" + "BOOLEAN":
// [542]  Return {99} 
return "i";
// [543]  Case {100} 
case "" + "BLOB":
// [544]  Return {101} 
return "b";
// [545]  Case {102} , {103} , {104} 
case "" + "REAL":
case "" + "FLOAT":
case "" + "DOUBLE":
// [546]  Return {105} 
return "d";
// [547]  Case Else 
default:
// [548]  Return {106} 
return "s";
// [549]  End Select 
}
// [550]  Else 
} else {
// [551]  Return {107} 
return "s";
// [552]  End If 
}
// End Sub
};

// [556] private Sub GetMapTypes(sourceMap As Map) As List 
_B.getmaptypes=function(_sourcemap) {
var _listoftypes,_icnt,_itot,_col,_coltype;
// [557]  Dim listOfTypes As List 
_listoftypes=[];
// [558]  listOfTypes.Initialize 
_listoftypes.length=0;
// [559]  Dim iCnt As Int 
_icnt=0;
// [560]  Dim iTot As Int 
_itot=0;
// [561]  iTot = sourceMap.Size - 1 
_itot=Object.keys(_sourcemap).length-1;
// [562]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [563]  Dim col As String = sourceMap.GetKeyAt(iCnt) 
_col=banano_getB4JKeyAt(_sourcemap,_icnt);
// [564]  Dim colType As String = recType.GetDefault(col, {108} ) 
_coltype=(_B._rectype[_col] || "STRING");
// [565]  Select Case colType 
switch ("" + _coltype) {
// [566]  Case {109} , {110} , {111} , {112} 
case "" + "INTEGER":
case "" + "INT":
case "" + "BOOL":
case "" + "BOOLEAN":
// [567]  listOfTypes.add( {113} ) 
_listoftypes.push("i");
// [568]  Case {114} 
break;
case "" + "BLOB":
// [569]  listOfTypes.add( {115} ) 
_listoftypes.push("b");
// [570]  Case {116} , {117} , {118} 
break;
case "" + "REAL":
case "" + "FLOAT":
case "" + "DOUBLE":
// [571]  listOfTypes.add( {119} ) 
_listoftypes.push("d");
// [572]  Case Else 
break;
default:
// [573]  listOfTypes.add( {120} ) 
_listoftypes.push("s");
// [574]  End Select 
break;
}
// [575]  Next 
}
// [576]  Return listOfTypes 
return _listoftypes;
// End Sub
};

// [580] Sub EQOperators(sm As Map) As List 'ignore 
_B.eqoperators=function(_sm) {
var _nl,_k;
// [581]  Dim nl As List 
_nl=[];
// [582]  nl.initialize 
_nl.length=0;
// [583]  For Each k As String In sm.Keys 
var _kKeys = Object.keys(_sm);
for (var _kindex=0;_kindex<_kKeys.length;_kindex++) {
_k=_kKeys[_kindex];
// [584]  nl.Add( {121} ) 
_nl.push("=");
// [585]  Next 
}
// [586]  Return nl 
return _nl;
// End Sub
};

// [590] Sub UpdateWhere(tblfields As Map, tblWhere As Map, operators As List) As BANanoAlaSQLE 
_B.updatewhere=function(_tblfields,_tblwhere,_operators) {
var _listoftypes,_listoftypes1,_listofvalues,_listofvalues1,_sb,_i,_itot,_col,_iwhere,_opr;
// [591]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [592]  Dim listOfTypes As List = GetMapTypes(tblfields) 
_listoftypes=_B.getmaptypes(_tblfields,_B);
// [593]  Dim listOfTypes1 As List = GetMapTypes(tblWhere) 
_listoftypes1=_B.getmaptypes(_tblwhere,_B);
// [594]  listOfTypes.AddAll(listOfTypes1) 
_listoftypes.splice(_listoftypes.length,0,..._listoftypes1);
// [595]  Dim listOfValues As List = GetMapValues(tblfields) 
_listofvalues=_B.getmapvalues(_tblfields,_B);
// [596]  Dim listOfValues1 As List = GetMapValues(tblWhere) 
_listofvalues1=_B.getmapvalues(_tblwhere,_B);
// [597]  listOfValues.AddAll(listOfValues1) 
_listofvalues.splice(_listofvalues.length,0,..._listofvalues1);
// [598]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [599]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [600]  sb.Append( {5} ) 
_sb.append("UPDATE " + _B.escapefield(_B._tablename,_B) + " SET ");
// [601]  Dim i As Int 
_i=0;
// [602]  Dim iTot As Int = tblfields.Size - 1 
_itot=Object.keys(_tblfields).length-1;
// [603]  For i = 0 To iTot 
for (_i=0;_i<=_itot;_i++) {
// [604]  Dim col As String = tblfields.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblfields,_i);
// [605]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [606]  If i <> iTot Then 
if (_i!=_itot) {
// [607]  sb.Append( {122} ) 
_sb.append(" = ?,");
// [608]  Else 
} else {
// [609]  sb.Append( {123} ) 
_sb.append(" = ?");
// [610]  End If 
}
// [611]  Next 
}
// [612]  sb.Append( {6} ) 
_sb.append(" WHERE ");
// [613]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [614]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [615]  If i > 0 Then 
if (_i>0) {
// [616]  sb.Append( {124} ) 
_sb.append(" AND ");
// [617]  End If 
}
// [618]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [619]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [620]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [621]  sb.Append( {7} ) 
_sb.append(" " + _opr + " ?");
// [622]  Next 
}
// [623]  query = sb.tostring 
_B._query=_sb.toString();
// [624]  args = listOfValues 
_B._args=_listofvalues;
// [625]  types = listOfTypes 
_B._types=_listoftypes;
// [626]  command = {125} 
_B._command="update";
// [627]  response = {126} 
_B._response="";
// [628]  error = {127} 
_B._error="";
// [629]  result = NewList 
_B._result=_B.newlist(_B);
// [630]  json = {128} 
_B._json="";
// [631]  affectedRows = 0 
_B._affectedrows=0;
// [632]  Return Me 
return _B;
// End Sub
};

// [636] Sub DeleteWhere(tblWhere As Map, operators As List) As BANanoAlaSQLE 
_B.deletewhere=function(_tblwhere,_operators) {
var _listoftypes,_listofvalues,_sb,_i,_iwhere,_col,_opr;
// [637]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [638]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [639]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [640]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [641]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [642]  sb.Append( {8} ) 
_sb.append("DELETE FROM " + _B.escapefield(_B._tablename,_B) + " WHERE ");
// [643]  Dim i As Int 
_i=0;
// [644]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [645]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [646]  If i > 0 Then 
if (_i>0) {
// [647]  sb.Append( {129} ) 
_sb.append(" AND ");
// [648]  End If 
}
// [649]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [650]  sb.Append(col) 
_sb.append(_col);
// [651]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [652]  sb.Append( {9} ) 
_sb.append(" " + _opr + " ?");
// [653]  Next 
}
// [654]  query = sb.tostring 
_B._query=_sb.toString();
// [655]  args = listOfValues 
_B._args=_listofvalues;
// [656]  types = listOfTypes 
_B._types=_listoftypes;
// [657]  command = {130} 
_B._command="delete";
// [658]  response = {131} 
_B._response="";
// [659]  error = {132} 
_B._error="";
// [660]  result = NewList 
_B._result=_B.newlist(_B);
// [661]  json = {133} 
_B._json="";
// [662]  affectedRows = 0 
_B._affectedrows=0;
// [663]  Return Me 
return _B;
// End Sub
};

// [667] Sub DeleteAll As BANanoAlaSQLE 
_B.deleteall=function() {
var _sb;
// [668]  Dim sb As String = {10} 
_sb="DELETE FROM " + _B.escapefield(_B._tablename,_B) + " WHERE 1=1";
// [669]  query = sb 
_B._query=_sb;
// [670]  args = Null 
_B._args=null;
// [671]  types = Null 
_B._types=null;
// [672]  command = {134} 
_B._command="delete";
// [673]  response = {135} 
_B._response="";
// [674]  error = {136} 
_B._error="";
// [675]  result = NewList 
_B._result=_B.newlist(_B);
// [676]  json = {137} 
_B._json="";
// [677]  affectedRows = 0 
_B._affectedrows=0;
// [678]  Return Me 
return _B;
// End Sub
};

// [683] Sub Map2Json(mp As Map) As String 
_B.map2json=function(_mp) {
var _xjson;
// [684]  Dim xjson As BANanoJSONGenerator 
_xjson={};
// [685]  xjson.Initialize(mp) 
_xjson=_mp;
// [686]  Return xjson.ToString 
return JSON.stringify(_xjson);
// End Sub
};

// [690] Sub List2Json(mp As List) As String 
_B.list2json=function(_mp) {
var _xjson;
// [691]  Dim xjson As BANanoJSONGenerator 
_xjson={};
// [692]  xjson.Initialize2(mp) 
_xjson=_mp;
// [693]  Return xjson.ToString 
return JSON.stringify(_xjson);
// End Sub
};

// [697] Sub Json2List(strValue As String) As List 
_B.json2list=function(_strvalue) {
var _lst,_parser;
// [698]  Dim lst As List 
_lst=[];
// [699]  lst.Initialize 
_lst.length=0;
// [700]  lst.clear 
_lst.length=0;
// [701]  If strValue.Length = 0 Then 
if (_strvalue.length==0) {
// [702]  Return lst 
return _lst;
// [703]  End If 
}
// [704]  Try 
try {
// [705]  Dim parser As BANanoJSONParser 
_parser={};
// [706]  parser.Initialize(strValue) 
_parser=JSON.parse(_strvalue);
// [707]  Return parser.NextArray 
return _parser;
// [708]  Catch 
} catch(err) {
// [709]  Return lst 
return _lst;
// [710]  End Try 
}
// End Sub
};

// [714] Sub UpdateAll(tblFields As Map, operators As List) As BANanoAlaSQLE 
_B.updateall=function(_tblfields,_operators) {
var _listoftypes,_listofvalues,_sb,_i,_itot,_oper,_col;
// [715]  If operators = Null Then operators = EQOperators(tblFields) 
if (_operators==null) {_operators=_B.eqoperators(_tblfields,_B);}
// [716]  Dim listOfTypes As List = GetMapTypes(tblFields) 
_listoftypes=_B.getmaptypes(_tblfields,_B);
// [717]  Dim listOfValues As List = GetMapValues(tblFields) 
_listofvalues=_B.getmapvalues(_tblfields,_B);
// [718]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [719]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [720]  sb.Append( {11} ) 
_sb.append("UPDATE " + _B.escapefield(_B._tablename,_B) + " SET ");
// [721]  Dim i As Int 
_i=0;
// [722]  Dim iTot As Int = tblFields.Size - 1 
_itot=Object.keys(_tblfields).length-1;
// [723]  For i = 0 To iTot 
for (_i=0;_i<=_itot;_i++) {
// [724]  Dim oper As String = operators.Get(i) 
_oper=_operators[_i];
// [725]  Dim col As String = tblFields.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblfields,_i);
// [726]  sb.Append(col) 
_sb.append(_col);
// [727]  If i <> iTot Then 
if (_i!=_itot) {
// [728]  sb.Append( {138} ) 
_sb.append(" = ?,");
// [729]  Else 
} else {
// [730]  sb.Append( {12} ) 
_sb.append(" " + _oper + " ?");
// [731]  End If 
}
// [732]  Next 
}
// [733]  query = sb.tostring 
_B._query=_sb.toString();
// [734]  args = listOfValues 
_B._args=_listofvalues;
// [735]  types = listOfTypes 
_B._types=_listoftypes;
// [736]  command = {139} 
_B._command="update";
// [737]  response = {140} 
_B._response="";
// [738]  error = {141} 
_B._error="";
// [739]  result = NewList 
_B._result=_B.newlist(_B);
// [740]  json = {142} 
_B._json="";
// [741]  affectedRows = 0 
_B._affectedrows=0;
// [742]  Return Me 
return _B;
// End Sub
};

// [746] Sub Read(primaryValue As String) As BANanoAlaSQLE 
_B.read=function(_primaryvalue) {
var _qw;
// [747]  Dim qw As Map = CreateMap() 
_qw={};
// [748]  qw.Put(PrimaryKey, primaryValue) 
_qw[_B._primarykey]=_primaryvalue;
// [749]  SelectWhere(Array( {143} ), qw, Array( {144} ), Array(PrimaryKey)) 
_B.selectwhere(["*"],_qw,["="],[_B._primarykey],_B);
// [750]  Return Me 
return _B;
// End Sub
};

// [754] Sub Exists(primaryValue As String) As BANanoAlaSQLE 
_B.exists=function(_primaryvalue) {
var _qw;
// [755]  Dim qw As Map = CreateMap() 
_qw={};
// [756]  qw.Put(PrimaryKey, primaryValue) 
_qw[_B._primarykey]=_primaryvalue;
// [757]  SelectWhere(Array(PrimaryKey), qw, Array( {145} ), Array(PrimaryKey)) 
_B.selectwhere([_B._primarykey],_qw,["="],[_B._primarykey],_B);
// [758]  Return Me 
return _B;
// End Sub
};

// [763] Sub GetMaxWhere(fldName As String, tblWhere As Map, operators As List) As BANanoAlaSQLE 
_B.getmaxwhere=function(_fldname,_tblwhere,_operators) {
var _listoftypes,_listofvalues,_sb,_i,_iwhere,_col,_opr;
// [764]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [765]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [766]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [768]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [769]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [770]  sb.Append( {13} ) 
_sb.append("SELECT MAX([" + _fldname + "]) As [" + _fldname + "] FROM " + _B.escapefield(_B._tablename,_B) + " WHERE ");
// [771]  Dim i As Int 
_i=0;
// [772]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [773]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [774]  If i > 0 Then 
if (_i>0) {
// [775]  sb.Append( {146} ) 
_sb.append(" AND ");
// [776]  End If 
}
// [777]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [778]  sb.Append(col) 
_sb.append(_col);
// [779]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [780]  sb.Append( {14} ) 
_sb.append(" " + _opr + " ?");
// [781]  Next 
}
// [783]  query = sb.tostring 
_B._query=_sb.toString();
// [784]  args = listOfValues 
_B._args=_listofvalues;
// [785]  types = listOfTypes 
_B._types=_listoftypes;
// [786]  command = {147} 
_B._command="getmax";
// [787]  response = {148} 
_B._response="";
// [788]  error = {149} 
_B._error="";
// [789]  result = NewList 
_B._result=_B.newlist(_B);
// [790]  json = {150} 
_B._json="";
// [791]  affectedRows = 0 
_B._affectedrows=0;
// [792]  Return Me 
return _B;
// End Sub
};

// [796] Sub SelectWhere(tblfields As List, tblWhere As Map, operators As List, orderBy As List) As BANanoAlaSQLE 
_B.selectwhere=function(_tblfields,_tblwhere,_operators,_orderby) {
var _listoftypes,_listofvalues,_fld1,_selfields,_sb,_i,_iwhere,_col,_opr,_stro;
// [797]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [798]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [799]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [801]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [802]  Dim selFIelds As String = {151} 
_selfields="";
// [803]  Select Case fld1 
switch ("" + _fld1) {
// [804]  Case {152} 
case "" + "*":
// [805]  selFIelds = {153} 
_selfields="*";
// [806]  Case Else 
break;
default:
// [807]  selFIelds = JoinFields( {154} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [808]  End Select 
break;
}
// [809]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [810]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [811]  sb.Append( {15} ) 
_sb.append("SELECT " + _selfields + " FROM " + _B.escapefield(_B._tablename,_B) + " WHERE ");
// [812]  Dim i As Int 
_i=0;
// [813]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [814]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [815]  If i > 0 Then 
if (_i>0) {
// [816]  sb.Append( {155} ) 
_sb.append(" AND ");
// [817]  End If 
}
// [818]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [819]  sb.Append(col) 
_sb.append(_col);
// [820]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [821]  sb.Append( {16} ) 
_sb.append(" " + _opr + " ?");
// [822]  Next 
}
// [823]  If orderBy <> Null Then 
if (_orderby!=null) {
// [825]  Dim stro As String = JoinFields( {156} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [826]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [827]  sb.Append( {157} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [828]  End If 
}
// [829]  End If 
}
// [830]  query = sb.tostring 
_B._query=_sb.toString();
// [831]  args = listOfValues 
_B._args=_listofvalues;
// [832]  types = listOfTypes 
_B._types=_listoftypes;
// [833]  command = {158} 
_B._command="select";
// [834]  response = {159} 
_B._response="";
// [835]  error = {160} 
_B._error="";
// [836]  result = NewList 
_B._result=_B.newlist(_B);
// [837]  json = {161} 
_B._json="";
// [838]  affectedRows = 0 
_B._affectedrows=0;
// [839]  Return Me 
return _B;
// End Sub
};

// [842] Sub AndOrOperators(sm As Map) As List 'ignore 
_B.andoroperators=function(_sm) {
var _nl,_k;
// [843]  Dim nl As List 
_nl=[];
// [844]  nl.initialize 
_nl.length=0;
// [845]  For Each k As String In sm.Keys 
var _kKeys = Object.keys(_sm);
for (var _kindex=0;_kindex<_kKeys.length;_kindex++) {
_k=_kKeys[_kindex];
// [846]  nl.Add( {162} ) 
_nl.push("AND");
// [847]  Next 
}
// [848]  Return nl 
return _nl;
// End Sub
};

// [852] Sub SelectWhere1(tblfields As List, tblWhere As Map, operators As List, AndOr As List, orderBy As List) As BANanoAlaSQLE 
_B.selectwhere1=function(_tblfields,_tblwhere,_operators,_andor,_orderby) {
var _listoftypes,_listofvalues,_fld1,_selfields,_sb,_i,_iwhere,_sandor,_col,_opr,_stro;
// [853]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [854]  If AndOr = Null Then AndOr = AndOrOperators(tblWhere) 
if (_andor==null) {_andor=_B.andoroperators(_tblwhere,_B);}
// [855]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [856]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [858]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [859]  Dim selFIelds As String = {163} 
_selfields="";
// [860]  Select Case fld1 
switch ("" + _fld1) {
// [861]  Case {164} 
case "" + "*":
// [862]  selFIelds = {165} 
_selfields="*";
// [863]  Case Else 
break;
default:
// [864]  selFIelds = JoinFields( {166} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [865]  End Select 
break;
}
// [866]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [867]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [868]  sb.Append( {17} ) 
_sb.append("SELECT " + _selfields + " FROM " + _B.escapefield(_B._tablename,_B) + " WHERE ");
// [869]  Dim i As Int 
_i=0;
// [870]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [871]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [872]  If i > 0 Then 
if (_i>0) {
// [873]  Dim sandor As String = AndOr.get(i) 
_sandor=_andor[_i];
// [874]  sb.Append( {18} ) 
_sb.append(" " + _sandor + " ");
// [875]  End If 
}
// [876]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [877]  sb.Append(col) 
_sb.append(_col);
// [878]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [879]  sb.Append( {19} ) 
_sb.append(" " + _opr + " ?");
// [880]  Next 
}
// [881]  If orderBy <> Null Then 
if (_orderby!=null) {
// [883]  Dim stro As String = JoinFields( {167} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [884]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [885]  sb.Append( {168} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [886]  End If 
}
// [887]  End If 
}
// [888]  query = sb.tostring 
_B._query=_sb.toString();
// [889]  args = listOfValues 
_B._args=_listofvalues;
// [890]  types = listOfTypes 
_B._types=_listoftypes;
// [891]  command = {169} 
_B._command="select";
// [892]  response = {170} 
_B._response="";
// [893]  error = {171} 
_B._error="";
// [894]  result = NewList 
_B._result=_B.newlist(_B);
// [895]  json = {172} 
_B._json="";
// [896]  affectedRows = 0 
_B._affectedrows=0;
// [897]  Return Me 
return _B;
// End Sub
};

// [904] private Sub Join(delimiter As String, lst As List) As String 
_B.join=function(_delimiter,_lst) {
var _i,_sb,_fld;
// [905]  Dim i As Int 
_i=0;
// [906]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [907]  Dim fld As String 
_fld="";
// [908]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [909]  fld = lst.Get(0) 
_fld=_lst[0];
// [910]  sb.Append(fld) 
_sb.append(_fld);
// [911]  For i = 1 To lst.size - 1 
for (_i=1;_i<=_lst.length-1;_i++) {
// [912]  Dim fld As String = lst.Get(i) 
_fld=_lst[_i];
// [913]  sb.Append(delimiter).Append(fld) 
_sb.append(_delimiter).append(_fld);
// [914]  Next 
}
// [915]  Return sb.ToString 
return _sb.toString();
// End Sub
};

// [919] Sub SelectAll(tblfields As List, orderBy As List) As BANanoAlaSQLE 
_B.selectall=function(_tblfields,_orderby) {
var _fld1,_selfields,_sb,_stro;
// [921]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [922]  Dim selFIelds As String = {173} 
_selfields="";
// [923]  Select Case fld1 
switch ("" + _fld1) {
// [924]  Case {174} 
case "" + "*":
// [925]  selFIelds = {175} 
_selfields="*";
// [926]  Case Else 
break;
default:
// [927]  selFIelds = JoinFields( {176} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [928]  End Select 
break;
}
// [929]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [930]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [931]  sb.Append( {20} ) 
_sb.append("SELECT " + _selfields + " FROM " + _B.escapefield(_B._tablename,_B) + "");
// [932]  If orderBy <> Null Then 
if (_orderby!=null) {
// [934]  Dim stro As String = JoinFields( {177} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [935]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [936]  sb.Append( {178} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [937]  End If 
}
// [938]  End If 
}
// [939]  query = sb.tostring 
_B._query=_sb.toString();
// [940]  args = Null 
_B._args=null;
// [941]  types = Null 
_B._types=null;
// [942]  command = {179} 
_B._command="select";
// [943]  response = {180} 
_B._response="";
// [944]  error = {181} 
_B._error="";
// [945]  result = NewList 
_B._result=_B.newlist(_B);
// [946]  json = {182} 
_B._json="";
// [947]  affectedRows = 0 
_B._affectedrows=0;
// [948]  Return Me 
return _B;
// End Sub
};

}
/* =========================== BANanoMSSQLE  =========================== */
function banano_bananovuetifyconnect_bananomssqle() {
var _B=this;
_B._rectype={};

_B._db_varchar_20="VARCHAR(20)";

_B._db_varchar_10="VARCHAR(10)";

_B._db_varchar_30="VARCHAR(30)";

_B._db_varchar_40="VARCHAR(40)";

_B._db_varchar_50="VARCHAR(50)";

_B._db_varchar_100="VARCHAR(100)";

_B._db_varchar_255="VARCHAR(255)";

_B._db_string="TEXT";

_B._db_int="INT";

_B._db_float="FLOAT";

_B._db_blob="BLOB";

_B._db_bool="BOOL";

_B._db_real="REAL";

_B._db_date="DATE";

_B._db_integer="INTEGER";

_B._db_text="TEXT";

_B._methodname="";

_B._methodnamedynamic="";

_B._schema={};

_B._tablename="";

_B._primarykey="";

_B._record={};

_B._ok=false;

_B._dbase="";

_B._result=[];

_B._command="";

_B._types=[];

_B._args=[];

_B._query="";

_B._response="";

_B._error="";

_B._affectedrows=0;

_B._json="";

_B._host="";

_B._username="";

_B._password="";

_B._auto="";

// [46] Sub SetConnection(shost As String, susername As String, spassword As String) As BANanoMSSQLE 
_B.setconnection=function(_shost,_susername,_spassword) {
// [47]  host = shost 
_B._host=_shost;
// [48]  username = susername 
_B._username=_susername;
// [49]  password = spassword 
_B._password=_spassword;
// [50]  Return Me 
return _B;
// End Sub
};

// [54] Sub AndOrOperators(sm As Map) As List 'ignore 
_B.andoroperators=function(_sm) {
var _nl,_k;
// [55]  Dim nl As List 
_nl=[];
// [56]  nl.initialize 
_nl.length=0;
// [57]  For Each k As String In sm.Keys 
var _kKeys = Object.keys(_sm);
for (var _kindex=0;_kindex<_kKeys.length;_kindex++) {
_k=_kKeys[_kindex];
// [58]  nl.Add( {44} ) 
_nl.push("AND");
// [59]  Next 
}
// [60]  Return nl 
return _nl;
// End Sub
};

// [64] Sub SelectWhere1(tblfields As List, tblWhere As Map, operators As List, AndOr As List, orderBy As List) As BANanoMSSQLE 
_B.selectwhere1=function(_tblfields,_tblwhere,_operators,_andor,_orderby) {
var _listoftypes,_listofvalues,_fld1,_selfields,_sb,_i,_iwhere,_sandor,_col,_opr,_stro;
// [65]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [66]  If AndOr = Null Then AndOr = AndOrOperators(tblWhere) 
if (_andor==null) {_andor=_B.andoroperators(_tblwhere,_B);}
// [67]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [68]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [70]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [71]  Dim selFIelds As String = {45} 
_selfields="";
// [72]  Select Case fld1 
switch ("" + _fld1) {
// [73]  Case {46} 
case "" + "*":
// [74]  selFIelds = {47} 
_selfields="*";
// [75]  Case Else 
break;
default:
// [76]  selFIelds = JoinFields( {48} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [77]  End Select 
break;
}
// [78]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [79]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [80]  sb.Append( {0} ) 
_sb.append("SELECT " + _selfields + " FROM " + _B.escapefield(_B._tablename,_B) + " WHERE ");
// [81]  Dim i As Int 
_i=0;
// [82]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [83]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [84]  If i > 0 Then 
if (_i>0) {
// [85]  Dim sandor As String = AndOr.get(i) 
_sandor=_andor[_i];
// [86]  sb.Append( {1} ) 
_sb.append(" " + _sandor + " ");
// [87]  End If 
}
// [88]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [89]  sb.Append(col) 
_sb.append(_col);
// [90]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [91]  sb.Append( {2} ) 
_sb.append(" " + _opr + " ?");
// [92]  Next 
}
// [93]  If orderBy <> Null Then 
if (_orderby!=null) {
// [95]  Dim stro As String = JoinFields( {49} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [96]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [97]  sb.Append( {50} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [98]  End If 
}
// [99]  End If 
}
// [100]  query = sb.tostring 
_B._query=_sb.toString();
// [101]  args = listOfValues 
_B._args=_listofvalues;
// [102]  types = listOfTypes 
_B._types=_listoftypes;
// [103]  command = {51} 
_B._command="select";
// [104]  response = {52} 
_B._response="";
// [105]  error = {53} 
_B._error="";
// [106]  result = NewList 
_B._result=_B.newlist(_B);
// [107]  json = {54} 
_B._json="";
// [108]  affectedRows = 0 
_B._affectedrows=0;
// [109]  Return Me 
return _B;
// End Sub
};

// [113] Sub GetTableNames As BANanoMSSQLE 
_B.gettablenames=function() {
// [114]  query = {3} 
_B._query="select table_name from information_schema.tables where TABLE_TYPE = 'BASE TABLE' and table_name not in ('MSreplication_options','spt_fallback_db', 'spt_fallback_dev', 'spt_fallback_usg', 'spt_monitor') order by table_name";
// [115]  command = {55} 
_B._command="select";
// [116]  Return Me 
return _B;
// End Sub
};

// [120] Sub GetTableStructure As BANanoMSSQLE 
_B.gettablestructure=function() {
// [121]  query = {4} 
_B._query="select character_maximum_length, column_name, data_type from information_schema.columns where table_name = '" + _B._tablename + "'";
// [122]  command = {56} 
_B._command="select";
// [123]  Return Me 
return _B;
// End Sub
};

// [127] Sub NewList As List 
_B.newlist=function() {
var _lst;
// [128]  Dim lst As List 
_lst=[];
// [129]  lst.Initialize 
_lst.length=0;
// [130]  Return lst 
return _lst;
// End Sub
};

// [134] Sub FromJSON As BANanoMSSQLE 
_B.fromjson=function() {
var _m;
// [135]  OK = False 
_B._ok=false;
// [136]  If json.StartsWith( {57} ) Or json.Startswith( {58} ) Then 
if (_B._json.startsWith("{") || _B._json.startsWith("[")) {
// [137]  Dim m As Map = BANano.FromJson(json) 
_m=JSON.parse(_B._json);
// [138]  response = m.Get( {59} ) 
_B._response=_m["response"];
// [139]  error = m.Get( {60} ) 
_B._error=_m["error"];
// [140]  result = m.Get( {61} ) 
_B._result=_m["result"];
// [141]  affectedRows = m.Get( {62} ) 
_B._affectedrows=_m["affectedRows"];
// [142]  If response = {63} Then 
if (_B._response=="Success") {
// [143]  OK = True 
_B._ok=true;
// [144]  End If 
}
// [145]  Else 
} else {
// [146]  response = json 
_B._response=_B._json;
// [147]  error = json 
_B._error=_B._json;
// [148]  result = NewList 
_B._result=_B.newlist(_B);
// [149]  affectedRows = -1 
_B._affectedrows=-1;
// [150]  OK = False 
_B._ok=false;
// [151]  End If 
}
// [152]  Return Me 
return _B;
// End Sub
};

// [157] Sub DeleteAll As BANanoMSSQLE 
_B.deleteall=function() {
var _sb;
// [158]  Dim sb As String = {5} 
_sb="DELETE FROM " + _B.escapefield(_B._tablename,_B) + "";
// [159]  query = sb 
_B._query=_sb;
// [160]  command = {64} 
_B._command="delete";
// [161]  Return Me 
return _B;
// End Sub
};

// [164] Sub SchemaAddField(fldName As String, fldType As String) 
_B.schemaaddfield=function(_fldname,_fldtype) {
// [165]  Schema.Put(fldName, fldType) 
_B._schema[_fldname]=_fldtype;
// End Sub
};

// [169] Sub SchemaAddBlob(bools As List) As BANanoMSSQLE 
_B.schemaaddblob=function(_bools) {
var _b;
// [170]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [171]  Schema.Put(b, DB_BLOB) 
_B._schema[_b]=_B._db_blob;
// [172]  Next 
}
// [173]  AddBlobs(bools) 
_B.addblobs(_bools,_B);
// [174]  Return Me 
return _B;
// End Sub
};

// [179] Sub SchemaAddBoolean(bools As List) As BANanoMSSQLE 
_B.schemaaddboolean=function(_bools) {
var _b;
// [180]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [181]  Schema.Put(b, DB_BOOL) 
_B._schema[_b]=_B._db_bool;
// [182]  Next 
}
// [183]  AddBooleans(bools) 
_B.addbooleans(_bools,_B);
// [184]  Return Me 
return _B;
// End Sub
};

// [188] Sub SchemaAddDate(bools As List) As BANanoMSSQLE 
_B.schemaadddate=function(_bools) {
var _b;
// [189]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [190]  Schema.Put(b, DB_DATE) 
_B._schema[_b]=_B._db_date;
// [191]  Next 
}
// [192]  AddStrings(bools) 
_B.addstrings(_bools,_B);
// [193]  Return Me 
return _B;
// End Sub
};

// [197] Sub SchemaAddFloat(bools As List) As BANanoMSSQLE 
_B.schemaaddfloat=function(_bools) {
var _b;
// [198]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [199]  Schema.Put(b, DB_FLOAT) 
_B._schema[_b]=_B._db_float;
// [200]  Next 
}
// [201]  AddDoubles(bools) 
_B.adddoubles(_bools,_B);
// [202]  Return Me 
return _B;
// End Sub
};

// [205] Sub SchemaAddText(bools As List) As BANanoMSSQLE 
_B.schemaaddtext=function(_bools) {
var _b;
// [206]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [207]  Schema.Put(b, DB_STRING) 
_B._schema[_b]=_B._db_string;
// [208]  Next 
}
// [209]  AddStrings(bools) 
_B.addstrings(_bools,_B);
// [210]  Return Me 
return _B;
// End Sub
};

// [215] Sub SchemaAddInt(bools As List) As BANanoMSSQLE 
_B.schemaaddint=function(_bools) {
var _b;
// [216]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [217]  Schema.Put(b, DB_INT) 
_B._schema[_b]=_B._db_int;
// [218]  Next 
}
// [219]  AddIntegers(bools) 
_B.addintegers(_bools,_B);
// [220]  Return Me 
return _B;
// End Sub
};

// [224] Sub Update(priValue As String) As BANanoMSSQLE 
_B.update=function(_privalue) {
var _tblwhere;
// [225]  Dim tblWhere As Map = CreateMap() 
_tblwhere={};
// [226]  tblWhere.Put(PrimaryKey, priValue) 
_tblwhere[_B._primarykey]=_privalue;
// [227]  UpdateWhere(TableName, Record, tblWhere, Null) 
_B.updatewhere(_B._tablename,_B._record,_tblwhere,null,_B);
// [228]  Return Me 
return _B;
// End Sub
};

// [231] Sub Update1(Rec As Map, priValue As String) As BANanoMSSQLE 
_B.update1=function(_rec,_privalue) {
var _tblwhere;
// [232]  Record = rec 
_B._record=_rec;
// [233]  Dim tblWhere As Map = CreateMap() 
_tblwhere={};
// [234]  tblWhere.Put(PrimaryKey, priValue) 
_tblwhere[_B._primarykey]=_privalue;
// [235]  UpdateWhere(TableName, Rec, tblWhere, Null) 
_B.updatewhere(_B._tablename,_rec,_tblwhere,null,_B);
// [236]  Return Me 
return _B;
// End Sub
};

// [239] Sub EQOperators(sm As Map) As List 'ignore 
_B.eqoperators=function(_sm) {
var _nl,_k;
// [240]  Dim nl As List 
_nl=[];
// [241]  nl.initialize 
_nl.length=0;
// [242]  For Each k As String In sm.Keys 
var _kKeys = Object.keys(_sm);
for (var _kindex=0;_kindex<_kKeys.length;_kindex++) {
_k=_kKeys[_kindex];
// [243]  nl.Add( {65} ) 
_nl.push("=");
// [244]  Next 
}
// [245]  Return nl 
return _nl;
// End Sub
};

// [248] Sub RecordFromMap(sm As Map) 
_B.recordfrommap=function(_sm) {
var _k,_v;
// [249]  Record.Initialize 
_B._record={};
// [250]  For Each k As String In sm.Keys 
var _kKeys = Object.keys(_sm);
for (var _kindex=0;_kindex<_kKeys.length;_kindex++) {
_k=_kKeys[_kindex];
// [251]  Dim v As Object = sm.Get(k) 
_v=_sm[_k];
// [252]  Record.Put(k, v) 
_B._record[_k]=_v;
// [253]  Next 
}
// End Sub
};

// [257] Sub SchemaClear As BANanoMSSQLE 
_B.schemaclear=function() {
// [258]  Schema.clear 
_B._schema={};
// [259]  Return Me 
return _B;
// End Sub
};

// [263] Sub SetField(fldName As String, fldValue As Object) As BANanoMSSQLE 
_B.setfield=function(_fldname,_fldvalue) {
// [264]  Record.Put(fldName, fldValue) 
_B._record[_fldname]=_fldvalue;
// [265]  Return Me 
return _B;
// End Sub
};

// [268] Sub SchemaAddBooleans(bools As List) As BANanoMSSQLE 
_B.schemaaddbooleans=function(_bools) {
// [269]  SchemaAddBoolean(bools) 
_B.schemaaddboolean(_bools,_B);
// [270]  Return Me 
return _B;
// End Sub
};

// [275] Sub SchemaFromDesign(cont As VMContainer) As BANanoMSSQLE 
_B.schemafromdesign=function(_cont) {
// [276]  SchemaAddBoolean(cont.Booleans) 
_B.schemaaddboolean(_cont._booleans,_B);
// [277]  SchemaAddDate(cont.Dates) 
_B.schemaadddate(_cont._dates,_B);
// [278]  SchemaAddFloat(cont.Doubles) 
_B.schemaaddfloat(_cont._doubles,_B);
// [279]  SchemaAddInt(cont.Integers) 
_B.schemaaddint(_cont._integers,_B);
// [280]  SchemaAddText(cont.Strings) 
_B.schemaaddtext(_cont._strings,_B);
// [282]  AddStrings(cont.Strings) 
_B.addstrings(_cont._strings,_B);
// [283]  AddIntegers(cont.Integers) 
_B.addintegers(_cont._integers,_B);
// [284]  AddDoubles(cont.Doubles) 
_B.adddoubles(_cont._doubles,_B);
// [285]  AddBooleans(cont.Booleans) 
_B.addbooleans(_cont._booleans,_B);
// [286]  AddStrings(cont.Dates) 
_B.addstrings(_cont._dates,_B);
// [287]  Return Me 
return _B;
// End Sub
};

// [290] Sub SchemaAddIntegers(ints As List) As BANanoMSSQLE 
_B.schemaaddintegers=function(_ints) {
// [291]  SchemaAddInt(ints) 
_B.schemaaddint(_ints,_B);
// [292]  Return Me 
return _B;
// End Sub
};

// [295] Sub SchemaAddDoubles(dbls As List) As BANanoMSSQLE 
_B.schemaadddoubles=function(_dbls) {
// [296]  SchemaAddFloat(dbls) 
_B.schemaaddfloat(_dbls,_B);
// [297]  Return Me 
return _B;
// End Sub
};

// [301] Sub SchemaAddBlobs(blobs As List) As BANanoMSSQLE 
_B.schemaaddblobs=function(_blobs) {
// [302]  SchemaAddBlob(blobs) 
_B.schemaaddblob(_blobs,_B);
// [303]  Return Me 
return _B;
// End Sub
};

// [307] Sub SchemaAddStrings(strings As List) As BANanoMSSQLE 
_B.schemaaddstrings=function(_strings) {
// [308]  SchemaAddText(strings) 
_B.schemaaddtext(_strings,_B);
// [309]  Return Me 
return _B;
// End Sub
};

// [314] Sub SchemaCreateTable As BANanoMSSQLE 
_B.schemacreatetable=function() {
// [315]  Return CreateTable(Schema) 
return _B.createtable(_B._schema,_B);
// End Sub
};

// [319] Sub SchemaAddDates(dates As List) As BANanoMSSQLE 
_B.schemaadddates=function(_dates) {
// [320]  SchemaAddDate(dates) 
_B.schemaadddate(_dates,_B);
// [321]  Return Me 
return _B;
// End Sub
};

// [326] public Sub CreateTable(tblFields As Map) As BANanoMSSQLE 
_B.createtable=function(_tblfields) {
var _fldname,_fldtype,_fldtot,_fldcnt,_sb;
// [327]  Dim fldName As String 
_fldname="";
// [328]  Dim fldType As String 
_fldtype="";
// [329]  Dim fldTot As Int 
_fldtot=0;
// [330]  Dim fldCnt As Int 
_fldcnt=0;
// [331]  fldTot = tblFields.Size - 1 
_fldtot=Object.keys(_tblfields).length-1;
// [332]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [333]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [334]  sb.Append( {66} ) 
_sb.append("(");
// [335]  For fldCnt = 0 To fldTot 
for (_fldcnt=0;_fldcnt<=_fldtot;_fldcnt++) {
// [336]  fldName = tblFields.GetKeyAt(fldCnt) 
_fldname=banano_getB4JKeyAt(_tblfields,_fldcnt);
// [337]  fldType = tblFields.Get(fldName) 
_fldtype=_tblfields[_fldname];
// [338]  fldType = fldType.Replace( {67} , {68} ) 
_fldtype=_fldtype.split("STRING").join("TEXT");
// [339]  fldType = fldType.Replace( {69} , {70} ) 
_fldtype=_fldtype.split("TEXT").join("VARCHAR(255)");
// [340]  If fldCnt > 0 Then 
if (_fldcnt>0) {
// [341]  sb.Append( {71} ) 
_sb.append(", ");
// [342]  End If 
}
// [343]  sb.Append(EscapeField(fldName)) 
_sb.append(_B.escapefield(_fldname,_B));
// [344]  sb.Append( {72} ) 
_sb.append(" ");
// [345]  sb.Append(fldType) 
_sb.append(_fldtype);
// [346]  If fldName.EqualsIgnoreCase(Auto) Then 
if (_fldname.equalsIgnoreCase(_B._auto)) {
// [347]  sb.Append( {73} ) 
_sb.append(" IDENTITY(1,1)");
// [348]  End If 
}
// [349]  If fldName.EqualsIgnoreCase(PrimaryKey) Then 
if (_fldname.equalsIgnoreCase(_B._primarykey)) {
// [350]  sb.Append( {74} ) 
_sb.append(" PRIMARY KEY");
// [351]  End If 
}
// [352]  Next 
}
// [353]  sb.Append( {75} ) 
_sb.append(")");
// [355]  query = {76} & EscapeField(TableName) & {77} & sb.ToString 
_B._query="CREATE TABLE "+_B.escapefield(_B._tablename,_B)+" "+_sb.toString();
// [356]  command = {78} 
_B._command="createtable";
// [357]  Return Me 
return _B;
// End Sub
};

// [361] Sub ResetTypes As BANanoMSSQLE 
_B.resettypes=function() {
// [362]  recType.Initialize 
_B._rectype={};
// [363]  Return Me 
return _B;
// End Sub
};

// [367] Sub GetMax As BANanoMSSQLE 
_B.getmax=function() {
var _sb;
// [368]  Dim sb As String = {6} 
_sb="SELECT MAX(" + _B._primarykey + ") As " + _B._primarykey + " FROM " + _B.escapefield(_B._tablename,_B) + "";
// [369]  query = sb 
_B._query=_sb;
// [370]  command = {79} 
_B._command="getmax";
// [371]  Return Me 
return _B;
// End Sub
};

// [375] Sub GetMin As BANanoMSSQLE 
_B.getmin=function() {
var _sb;
// [376]  Dim sb As String = {7} 
_sb="SELECT MIN(" + _B._primarykey + ") As " + _B._primarykey + " FROM " + _B.escapefield(_B._tablename,_B) + "";
// [377]  query = sb 
_B._query=_sb;
// [378]  command = {80} 
_B._command="getmin";
// [379]  Return Me 
return _B;
// End Sub
};

// [382] Sub GetNextID As String 
_B.getnextid=function() {
var _nextid,_strid,_nr,_ni;
// [383]  Dim nextid As Int 
_nextid=0;
// [384]  Dim strid As String 
_strid="";
// [386]  If result.Size = 0 Then 
if (_B._result.length==0) {
// [387]  nextid = 0 
_nextid=0;
// [388]  Else 
} else {
// [389]  Dim nr As Map = result.Get(0) 
_nr=_B._result[0];
// [390]  Dim ni As String = nr.GetDefault(PrimaryKey, {81} ) 
_ni=(_nr[_B._primarykey] || "0");
// [391]  nextid = BANano.parseInt(ni) 
_nextid=parseInt(_ni);
// [392]  End If 
}
// [393]  nextid = nextid + 1 
_nextid=_nextid+1;
// [394]  strid = CStr(nextid) 
_strid=_B.cstr(_nextid,_B);
// [395]  nextid = BANano.ParseInt(nextid) 
_nextid=parseInt(_nextid);
// [396]  Return strid 
return _strid;
// End Sub
};

// [401] private Sub CStr(o As Object) As String 
_B.cstr=function(_o) {
// [402]  If o = BANano.UNDEFINED Then o = {82} 
if (_o==undefined) {_o="";}
// [403]  Return {83} & o 
return ""+_o;
// End Sub
};

// [407] Sub Initialize(dbName As String, tblName As String, PK As String, AI As String) As BANanoMSSQLE 
_B.initialize=function(_dbname,_tblname,_pk,_ai) {
// [408]  recType.Initialize 
_B._rectype={};
// [409]  Schema.Initialize 
_B._schema={};
// [410]  Record.Initialize 
_B._record={};
// [411]  MethodName = {84} 
_B._methodname="BANanoMSSQL";
// [412]  MethodNameDynamic = {85} 
_B._methodnamedynamic="BANanoMSSQLDynamic";
// [413]  result.Initialize 
_B._result.length=0;
// [414]  command = {86} 
_B._command="";
// [415]  PrimaryKey = PK 
_B._primarykey=_pk;
// [416]  DBase = dbName 
_B._dbase=_dbname;
// [417]  TableName = tblName 
_B._tablename=_tblname;
// [418]  types.Initialize 
_B._types.length=0;
// [419]  args.Initialize 
_B._args.length=0;
// [420]  types = Null 
_B._types=null;
// [421]  args = Null 
_B._args=null;
// [422]  query = {87} 
_B._query="";
// [423]  response = {88} 
_B._response="";
// [424]  error = {89} 
_B._error="";
// [425]  affectedRows = 0 
_B._affectedrows=0;
// [426]  json = {90} 
_B._json="";
// [427]  OK = False 
_B._ok=false;
// [428]  host = {91} 
_B._host="";
// [429]  username = {92} 
_B._username="";
// [430]  password = {93} 
_B._password="";
// [431]  Auto = AI 
_B._auto=_ai;
// [432]  Return Me 
return _B;
// End Sub
};

// [436] private Sub Json2Map(strJSON As String) As Map 
_B.json2map=function(_strjson) {
var _jsonx,_map1;
// [437]  Dim jsonx As BANanoJSONParser 
_jsonx={};
// [438]  Dim Map1 As Map 
_map1={};
// [439]  Map1.Initialize 
_map1={};
// [440]  Map1.clear 
_map1={};
// [441]  Try 
try {
// [442]  If strJSON.length > 0 Then 
if (_strjson.length>0) {
// [443]  jsonx.Initialize(strJSON) 
_jsonx=JSON.parse(_strjson);
// [444]  Map1 = jsonx.NextObject 
_map1=_jsonx;
// [445]  End If 
}
// [446]  Return Map1 
return _map1;
// [447]  Catch 
} catch(err) {
// [448]  Return Map1 
return _map1;
// [449]  End Try 
}
// End Sub
};

// [453] private Sub Map2Json(mp As Map) As String 
_B.map2json=function(_mp) {
var _jsonx;
// [454]  Dim jsonx As BANanoJSONGenerator 
_jsonx={};
// [455]  jsonx.Initialize(mp) 
_jsonx=_mp;
// [456]  Return jsonx.ToString 
return JSON.stringify(_jsonx);
// End Sub
};

// [460] Sub AddStrings(fieldNames As List) As BANanoMSSQLE 
_B.addstrings=function(_fieldnames) {
var _strfld;
// [461]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [462]  recType.Put(strfld, {94} ) 
_B._rectype[_strfld]="STRING";
// [463]  Next 
}
// [464]  Return Me 
return _B;
// End Sub
};

// [468] Sub AddIntegers(fieldNames As List) As BANanoMSSQLE 
_B.addintegers=function(_fieldnames) {
var _strfld;
// [469]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [470]  recType.Put(strfld, {95} ) 
_B._rectype[_strfld]="INT";
// [471]  Next 
}
// [472]  Return Me 
return _B;
// End Sub
};

// [476] Sub AddDoubles(fieldNames As List) As BANanoMSSQLE 
_B.adddoubles=function(_fieldnames) {
var _strfld;
// [477]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [478]  recType.Put(strfld, {96} ) 
_B._rectype[_strfld]="DOUBLE";
// [479]  Next 
}
// [480]  Return Me 
return _B;
// End Sub
};

// [484] Sub AddBlobs(fieldNames As List) As BANanoMSSQLE 
_B.addblobs=function(_fieldnames) {
var _strfld;
// [485]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [486]  recType.Put(strfld, {97} ) 
_B._rectype[_strfld]="BLOB";
// [487]  Next 
}
// [488]  Return Me 
return _B;
// End Sub
};

// [492] Sub AddBooleans(fieldNames As List) As BANanoMSSQLE 
_B.addbooleans=function(_fieldnames) {
var _strfld;
// [493]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [494]  recType.Put(strfld, {98} ) 
_B._rectype[_strfld]="BOOL";
// [495]  Next 
}
// [496]  Return Me 
return _B;
// End Sub
};

// [500] Sub FirstRecord As Map 
_B.firstrecord=function() {
var _rec;
// [501]  Dim rec As Map = result.Get(0) 
_rec=_B._result[0];
// [502]  Return rec 
return _rec;
// End Sub
};

// [506] Private Sub EscapeField(f As String) As String 
_B.escapefield=function(_f) {
// [507]  Return {8} 
return "[" + _f + "]";
// End Sub
};

// [511] Sub Execute(strSQL As String) As BANanoMSSQLE 
_B.execute=function(_strsql) {
// [512]  strSQL = strSQL.trim 
_strsql=_strsql.trim();
// [513]  query = strSQL 
_B._query=_strsql;
// [514]  command = {99} 
_B._command="execute";
// [515]  Return Me 
return _B;
// End Sub
};

// [520] private Sub GetMapTypes(sourceMap As Map) As List 
_B.getmaptypes=function(_sourcemap) {
var _listoftypes,_icnt,_itot,_col,_coltype;
// [521]  Dim listOfTypes As List 
_listoftypes=[];
// [522]  listOfTypes.Initialize 
_listoftypes.length=0;
// [523]  Dim iCnt As Int 
_icnt=0;
// [524]  Dim iTot As Int 
_itot=0;
// [525]  iTot = sourceMap.Size - 1 
_itot=Object.keys(_sourcemap).length-1;
// [526]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [527]  Dim col As String = sourceMap.GetKeyAt(iCnt) 
_col=banano_getB4JKeyAt(_sourcemap,_icnt);
// [528]  Dim colType As String = recType.GetDefault(col, {100} ) 
_coltype=(_B._rectype[_col] || "STRING");
// [529]  Select Case colType 
switch ("" + _coltype) {
// [530]  Case {101} , {102} , {103} , {104} 
case "" + "INTEGER":
case "" + "INT":
case "" + "BOOL":
case "" + "BOOLEAN":
// [531]  listOfTypes.add( {105} ) 
_listoftypes.push("i");
// [532]  Case {106} 
break;
case "" + "BLOB":
// [533]  listOfTypes.add( {107} ) 
_listoftypes.push("b");
// [534]  Case {108} , {109} , {110} 
break;
case "" + "REAL":
case "" + "FLOAT":
case "" + "DOUBLE":
// [535]  listOfTypes.add( {111} ) 
_listoftypes.push("d");
// [536]  Case Else 
break;
default:
// [537]  listOfTypes.add( {112} ) 
_listoftypes.push("s");
// [538]  End Select 
break;
}
// [539]  Next 
}
// [540]  Return listOfTypes 
return _listoftypes;
// End Sub
};

// [544] private Sub GetMapType(k As String) As String 
_B.getmaptype=function(_k) {
var _coltype;
// [545]  If recType.ContainsKey(k) Then 
if ((_k in _B._rectype)) {
// [546]  Dim colType As String = recType.GetDefault(k, {113} ) 
_coltype=(_B._rectype[_k] || "STRING");
// [547]  Select Case colType 
switch ("" + _coltype) {
// [548]  Case {114} , {115} , {116} , {117} 
case "" + "INTEGER":
case "" + "INT":
case "" + "BOOL":
case "" + "BOOLEAN":
// [549]  Return {118} 
return "i";
// [550]  Case {119} 
case "" + "BLOB":
// [551]  Return {120} 
return "b";
// [552]  Case {121} , {122} , {123} 
case "" + "REAL":
case "" + "FLOAT":
case "" + "DOUBLE":
// [553]  Return {124} 
return "d";
// [554]  Case Else 
default:
// [555]  Return {125} 
return "s";
// [556]  End Select 
}
// [557]  Else 
} else {
// [558]  Return {126} 
return "s";
// [559]  End If 
}
// End Sub
};

// [563] private Sub GetMapValues(sourceMap As Map) As List 
_B.getmapvalues=function(_sourcemap) {
var _listofvalues,_icnt,_itot,_key,_value,_vtype;
// [564]  Dim listOfValues As List 
_listofvalues=[];
// [565]  listOfValues.Initialize 
_listofvalues.length=0;
// [566]  Dim iCnt As Int 
_icnt=0;
// [567]  Dim iTot As Int 
_itot=0;
// [568]  iTot = sourceMap.Size - 1 
_itot=Object.keys(_sourcemap).length-1;
// [569]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [571]  Dim key As String = sourceMap.getkeyat(iCnt) 
_key=banano_getB4JKeyAt(_sourcemap,_icnt);
// [572]  Dim value As String = sourceMap.GetValueAt(iCnt) 
_value=banano_getB4JValueAt(_sourcemap,_icnt);
// [573]  value = CStr(value) 
_value=_B.cstr(_value,_B);
// [574]  value = value.trim 
_value=_value.trim();
// [576]  Dim vtype As String = GetMapType(key) 
_vtype=_B.getmaptype(_key,_B);
// [577]  Select Case vtype 
switch ("" + _vtype) {
// [578]  Case {127} 
case "" + "i":
// [580]  If value = {128} Then value = {129} 
if (_value=="") {_value="0";}
// [581]  value = BANano.parseInt(value) 
_value=parseInt(_value);
// [582]  Case {130} 
break;
case "" + "d":
// [584]  If value = {131} Then value = {132} 
if (_value=="") {_value="0";}
// [585]  value = BANano.parsefloat(value) 
_value=parseFloat(_value);
// [586]  Case {133} , {134} 
break;
case "" + "s":
case "" + "b":
// [588]  End Select 
break;
}
// [589]  listOfValues.Add(value) 
_listofvalues.push(_value);
// [590]  Next 
}
// [591]  Return listOfValues 
return _listofvalues;
// End Sub
};

// [595] private Sub GetMapKeys(sourceMap As Map) As List 
_B.getmapkeys=function(_sourcemap) {
var _listofvalues,_icnt,_itot,_value;
// [596]  Dim listOfValues As List 
_listofvalues=[];
// [597]  listOfValues.Initialize 
_listofvalues.length=0;
// [598]  Dim iCnt As Int 
_icnt=0;
// [599]  Dim iTot As Int 
_itot=0;
// [600]  iTot = sourceMap.Size - 1 
_itot=Object.keys(_sourcemap).length-1;
// [601]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [602]  Dim value As String = sourceMap.GetKeyAt(iCnt) 
_value=banano_getB4JKeyAt(_sourcemap,_icnt);
// [603]  listOfValues.Add(value) 
_listofvalues.push(_value);
// [604]  Next 
}
// [605]  Return listOfValues 
return _listofvalues;
// End Sub
};

// [610] Sub Insert As BANanoMSSQLE 
_B.insert=function() {
// [611]  Insert1(Record) 
_B.insert1(_B._record,_B);
// [612]  Return Me 
return _B;
// End Sub
};

// [616] Sub Insert1(Rec As Map) As BANanoMSSQLE 
_B.insert1=function(_rec) {
var _sb,_columns,_values,_listofvalues,_listoftypes,_icnt,_itot,_col;
// [617]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [618]  Log( {9} ) 
console.log("BANanoMSSQLE.Insert: '" + _B._tablename + "' schema is not set!");
// [619]  End If 
}
// [620]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [621]  Dim columns As StringBuilder 
_columns=new StringBuilder();
// [622]  Dim values As StringBuilder 
_values=new StringBuilder();
// [623]  Dim listOfValues As List = GetMapValues(Rec) 
_listofvalues=_B.getmapvalues(_rec,_B);
// [624]  Dim listOfTypes As List = GetMapTypes(Rec) 
_listoftypes=_B.getmaptypes(_rec,_B);
// [625]  Dim iCnt As Int 
_icnt=0;
// [626]  Dim iTot As Int 
_itot=0;
// [627]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [628]  columns.Initialize 
_columns.init();
_columns.isinitialized=true;
// [629]  values.Initialize 
_values.init();
_values.isinitialized=true;
// [630]  sb.Append( {10} ) 
_sb.append("INSERT INTO " + _B.escapefield(_B._tablename,_B) + " (");
// [631]  iTot = Rec.Size - 1 
_itot=Object.keys(_rec).length-1;
// [632]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [633]  Dim col As String = Rec.GetKeyAt(iCnt) 
_col=banano_getB4JKeyAt(_rec,_icnt);
// [634]  If iCnt > 0 Then 
if (_icnt>0) {
// [635]  columns.Append( {135} ) 
_columns.append(", ");
// [636]  values.Append( {136} ) 
_values.append(", ");
// [637]  End If 
}
// [638]  columns.Append(EscapeField(col)) 
_columns.append(_B.escapefield(_col,_B));
// [639]  values.Append( {137} ) 
_values.append("?");
// [640]  Next 
}
// [641]  sb.Append(columns.ToString) 
_sb.append(_columns.toString());
// [642]  sb.Append( {138} ) 
_sb.append(") VALUES (");
// [643]  sb.Append(values.ToString) 
_sb.append(_values.toString());
// [644]  sb.Append( {139} ) 
_sb.append(")");
// [645]  query = sb.ToString 
_B._query=_sb.toString();
// [646]  args = listOfValues 
_B._args=_listofvalues;
// [647]  types = listOfTypes 
_B._types=_listoftypes;
// [648]  command = {140} 
_B._command="insert";
// [649]  Return Me 
return _B;
// End Sub
};

// [654] private Sub JoinFields(delimiter As String, lst As List) As String 
_B.joinfields=function(_delimiter,_lst) {
var _i,_sb,_fld;
// [655]  Dim i As Int 
_i=0;
// [656]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [657]  Dim fld As String 
_fld="";
// [658]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [659]  fld = lst.Get(0) 
_fld=_lst[0];
// [660]  fld = EscapeField(fld) 
_fld=_B.escapefield(_fld,_B);
// [661]  sb.Append(fld) 
_sb.append(_fld);
// [662]  For i = 1 To lst.size - 1 
for (_i=1;_i<=_lst.length-1;_i++) {
// [663]  Dim fld As String = lst.Get(i) 
_fld=_lst[_i];
// [664]  fld = EscapeField(fld) 
_fld=_B.escapefield(_fld,_B);
// [665]  sb.Append(delimiter).Append(fld) 
_sb.append(_delimiter).append(_fld);
// [666]  Next 
}
// [667]  Return sb.ToString 
return _sb.toString();
// End Sub
};

// [671] private Sub Join(delimiter As String, lst As List) As String 
_B.join=function(_delimiter,_lst) {
var _i,_sb,_fld;
// [672]  Dim i As Int 
_i=0;
// [673]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [674]  Dim fld As String 
_fld="";
// [675]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [676]  fld = lst.Get(0) 
_fld=_lst[0];
// [677]  sb.Append(fld) 
_sb.append(_fld);
// [678]  For i = 1 To lst.size - 1 
for (_i=1;_i<=_lst.length-1;_i++) {
// [679]  Dim fld As String = lst.Get(i) 
_fld=_lst[_i];
// [680]  sb.Append(delimiter).Append(fld) 
_sb.append(_delimiter).append(_fld);
// [681]  Next 
}
// [682]  Return sb.ToString 
return _sb.toString();
// End Sub
};

// [687] Sub Read(primaryValue As String) As BANanoMSSQLE 
_B.read=function(_primaryvalue) {
var _qw;
// [688]  Dim qw As Map = CreateMap() 
_qw={};
// [689]  qw.Put(PrimaryKey, primaryValue) 
_qw[_B._primarykey]=_primaryvalue;
// [690]  SelectWhere(TableName, Array( {141} ), qw, Null, Array(PrimaryKey)) 
_B.selectwhere(_B._tablename,["*"],_qw,null,[_B._primarykey],_B);
// [691]  Return Me 
return _B;
// End Sub
};

// [695] Sub Delete(primaryValue As String) As BANanoMSSQLE 
_B.delete=function(_primaryvalue) {
var _qw;
// [696]  Dim qw As Map = CreateMap() 
_qw={};
// [697]  qw.Put(PrimaryKey, primaryValue) 
_qw[_B._primarykey]=_primaryvalue;
// [698]  DeleteWhere(TableName, qw, Array( {142} )) 
_B.deletewhere(_B._tablename,_qw,["="],_B);
// [699]  Return Me 
return _B;
// End Sub
};

// [704] Sub Exists(primaryValue As String) As BANanoMSSQLE 
_B.exists=function(_primaryvalue) {
var _qw;
// [705]  Dim qw As Map = CreateMap() 
_qw={};
// [706]  qw.Put(PrimaryKey, primaryValue) 
_qw[_B._primarykey]=_primaryvalue;
// [707]  SelectWhere(TableName, Array(PrimaryKey), qw, Null, Array(PrimaryKey)) 
_B.selectwhere(_B._tablename,[_B._primarykey],_qw,null,[_B._primarykey],_B);
// [708]  Return Me 
return _B;
// End Sub
};

// [712] Sub SelectWhere(tblName As String, tblfields As List, tblWhere As Map, operators As List, orderBy As List) As BANanoMSSQLE 
_B.selectwhere=function(_tblname,_tblfields,_tblwhere,_operators,_orderby) {
var _listoftypes,_listofvalues,_fld1,_selfields,_sb,_i,_iwhere,_col,_opr,_stro;
// [713]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [714]  Log( {11} ) 
console.log("BANanoMSSQLE.SelectWhere: '" + _tblname + "' schema is not set!");
// [715]  End If 
}
// [716]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [717]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [718]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [720]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [721]  Dim selFIelds As String = {143} 
_selfields="";
// [722]  Select Case fld1 
switch ("" + _fld1) {
// [723]  Case {144} 
case "" + "*":
// [724]  selFIelds = {145} 
_selfields="*";
// [725]  Case Else 
break;
default:
// [726]  selFIelds = JoinFields( {146} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [727]  End Select 
break;
}
// [728]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [729]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [730]  sb.Append( {12} ) 
_sb.append("SELECT " + _selfields + " FROM " + _B.escapefield(_tblname,_B) + " WHERE ");
// [731]  Dim i As Int 
_i=0;
// [732]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [733]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [734]  If i > 0 Then 
if (_i>0) {
// [735]  sb.Append( {147} ) 
_sb.append(" AND ");
// [736]  End If 
}
// [737]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [738]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [739]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [740]  sb.Append( {13} ) 
_sb.append(" " + _opr + " ?");
// [741]  Next 
}
// [742]  If orderBy <> Null Then 
if (_orderby!=null) {
// [744]  Dim stro As String = JoinFields( {148} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [745]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [746]  sb.Append( {149} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [747]  End If 
}
// [748]  End If 
}
// [749]  query = sb.tostring 
_B._query=_sb.toString();
// [750]  args = listOfValues 
_B._args=_listofvalues;
// [751]  types = listOfTypes 
_B._types=_listoftypes;
// [752]  command = {150} 
_B._command="select";
// [753]  Return Me 
return _B;
// End Sub
};

// [757] Sub SelectDistinctWhere(tblName As String, tblfields As List, tblWhere As Map, operators As List, orderBy As List) As BANanoMSSQLE 
_B.selectdistinctwhere=function(_tblname,_tblfields,_tblwhere,_operators,_orderby) {
var _listoftypes,_listofvalues,_fld1,_selfields,_sb,_i,_iwhere,_col,_oper,_stro;
// [758]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [759]  Log( {14} ) 
console.log("BANanoMSSQLE.SelectWhere: '" + _tblname + "' schema is not set!");
// [760]  End If 
}
// [761]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [762]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [763]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [765]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [766]  Dim selFIelds As String = {151} 
_selfields="";
// [767]  Select Case fld1 
switch ("" + _fld1) {
// [768]  Case {152} 
case "" + "*":
// [769]  selFIelds = {153} 
_selfields="*";
// [770]  Case Else 
break;
default:
// [771]  selFIelds = JoinFields( {154} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [772]  End Select 
break;
}
// [773]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [774]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [775]  sb.Append( {15} ) 
_sb.append("SELECT DISTINCT " + _selfields + " FROM " + _B.escapefield(_tblname,_B) + " WHERE ");
// [776]  Dim i As Int 
_i=0;
// [777]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [778]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [779]  If i > 0 Then 
if (_i>0) {
// [780]  sb.Append( {155} ) 
_sb.append(" AND ");
// [781]  End If 
}
// [782]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [783]  Dim oper As String = operators.Get(i) 
_oper=_operators[_i];
// [784]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [785]  sb.Append( {16} ) 
_sb.append(" " + _oper + " ?");
// [786]  Next 
}
// [787]  If orderBy <> Null Then 
if (_orderby!=null) {
// [789]  Dim stro As String = JoinFields( {156} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [790]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [791]  sb.Append( {157} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [792]  End If 
}
// [793]  End If 
}
// [794]  query = sb.tostring 
_B._query=_sb.toString();
// [795]  args = listOfValues 
_B._args=_listofvalues;
// [796]  types = listOfTypes 
_B._types=_listoftypes;
// [797]  command = {158} 
_B._command="select";
// [798]  Return Me 
return _B;
// End Sub
};

// [802] Sub DeleteWhere(tblName As String, tblWhere As Map, operators As List) As BANanoMSSQLE 
_B.deletewhere=function(_tblname,_tblwhere,_operators) {
var _listoftypes,_listofvalues,_sb,_i,_iwhere,_col,_opr;
// [803]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [804]  Log( {17} ) 
console.log("BANanoMSSQLE.DeleteWhere: '" + _tblname + "' schema is not set!");
// [805]  End If 
}
// [806]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [807]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [808]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [809]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [810]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [811]  sb.Append( {18} ) 
_sb.append("DELETE FROM " + _B.escapefield(_tblname,_B) + " WHERE ");
// [812]  Dim i As Int 
_i=0;
// [813]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [814]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [815]  If i > 0 Then 
if (_i>0) {
// [816]  sb.Append( {159} ) 
_sb.append(" AND ");
// [817]  End If 
}
// [818]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [819]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [820]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [821]  sb.Append( {19} ) 
_sb.append(" " + _opr + " ?");
// [822]  Next 
}
// [823]  query = sb.tostring 
_B._query=_sb.toString();
// [824]  args = listOfValues 
_B._args=_listofvalues;
// [825]  types = listOfTypes 
_B._types=_listoftypes;
// [826]  command = {160} 
_B._command="delete";
// [827]  Return Me 
return _B;
// End Sub
};

// [832] Sub SelectAll(tblfields As List, orderBy As List) As BANanoMSSQLE 
_B.selectall=function(_tblfields,_orderby) {
var _fld1,_selfields,_sb,_stro;
// [834]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [835]  Dim selFIelds As String = {161} 
_selfields="";
// [836]  Select Case fld1 
switch ("" + _fld1) {
// [837]  Case {162} 
case "" + "*":
// [838]  selFIelds = {163} 
_selfields="*";
// [839]  Case Else 
break;
default:
// [840]  selFIelds = JoinFields( {164} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [841]  End Select 
break;
}
// [842]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [843]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [844]  sb.Append( {20} ) 
_sb.append("SELECT " + _selfields + " FROM " + _B.escapefield(_B._tablename,_B) + "");
// [845]  If orderBy <> Null Then 
if (_orderby!=null) {
// [847]  Dim stro As String = JoinFields( {165} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [848]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [849]  sb.Append( {166} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [850]  End If 
}
// [851]  End If 
}
// [852]  query = sb.tostring 
_B._query=_sb.toString();
// [853]  command = {167} 
_B._command="select";
// [854]  Return Me 
return _B;
// End Sub
};

// [858] Sub SelectDistinctAll(tblfields As List, orderBy As List) As BANanoMSSQLE 
_B.selectdistinctall=function(_tblfields,_orderby) {
var _fld1,_selfields,_sb,_stro;
// [860]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [861]  Dim selFIelds As String = {168} 
_selfields="";
// [862]  Select Case fld1 
switch ("" + _fld1) {
// [863]  Case {169} 
case "" + "*":
// [864]  selFIelds = {170} 
_selfields="*";
// [865]  Case Else 
break;
default:
// [866]  selFIelds = JoinFields( {171} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [867]  End Select 
break;
}
// [868]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [869]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [870]  sb.Append( {21} ) 
_sb.append("SELECT DISTINCT " + _selfields + " FROM " + _B.escapefield(_B._tablename,_B) + "");
// [871]  If orderBy <> Null Then 
if (_orderby!=null) {
// [873]  Dim stro As String = JoinFields( {172} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [874]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [875]  sb.Append( {173} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [876]  End If 
}
// [877]  End If 
}
// [878]  query = sb.tostring 
_B._query=_sb.toString();
// [879]  command = {174} 
_B._command="select";
// [880]  Return Me 
return _B;
// End Sub
};

// [884] Sub Build As Map 
_B.build=function() {
var _b;
// [885]  Dim b As Map = CreateMap() 
_b={};
// [886]  b.Put( {175} , command) 
_b["command"]=_B._command;
// [887]  b.Put( {176} , query) 
_b["query"]=_B._query;
// [888]  b.Put( {177} , args) 
_b["args"]=_B._args;
// [889]  b.Put( {178} , types) 
_b["types"]=_B._types;
// [890]  Return b 
return _b;
// End Sub
};

// [894] Sub BuildDynamic As Map 
_B.builddynamic=function() {
var _b;
// [895]  Dim b As Map = CreateMap() 
_b={};
// [896]  b.Put( {179} , command) 
_b["command"]=_B._command;
// [897]  b.Put( {180} , query) 
_b["query"]=_B._query;
// [898]  b.Put( {181} , args) 
_b["args"]=_B._args;
// [899]  b.Put( {182} , types) 
_b["types"]=_B._types;
// [900]  b.put( {183} , host) 
_b["host"]=_B._host;
// [901]  b.Put( {184} , username) 
_b["username"]=_B._username;
// [902]  b.Put( {185} , password) 
_b["password"]=_B._password;
// [903]  b.Put( {186} , DBase) 
_b["dbname"]=_B._dbase;
// [904]  Return b 
return _b;
// End Sub
};

// [908] Sub UpdateWhere(tblName As String, tblfields As Map, tblWhere As Map, operators As List) As BANanoMSSQLE 
_B.updatewhere=function(_tblname,_tblfields,_tblwhere,_operators) {
var _listoftypes,_listoftypes1,_listofvalues,_listofvalues1,_sb,_i,_itot,_col,_iwhere,_opr;
// [909]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [910]  Log( {22} ) 
console.log("BANanoMSSQLE.UpdateWhere: '" + _tblname + "' schema is not set!");
// [911]  End If 
}
// [912]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [913]  Dim listOfTypes As List = GetMapTypes(tblfields) 
_listoftypes=_B.getmaptypes(_tblfields,_B);
// [914]  Dim listOfTypes1 As List = GetMapTypes(tblWhere) 
_listoftypes1=_B.getmaptypes(_tblwhere,_B);
// [915]  listOfTypes.AddAll(listOfTypes1) 
_listoftypes.splice(_listoftypes.length,0,..._listoftypes1);
// [916]  Dim listOfValues As List = GetMapValues(tblfields) 
_listofvalues=_B.getmapvalues(_tblfields,_B);
// [917]  Dim listOfValues1 As List = GetMapValues(tblWhere) 
_listofvalues1=_B.getmapvalues(_tblwhere,_B);
// [918]  listOfValues.AddAll(listOfValues1) 
_listofvalues.splice(_listofvalues.length,0,..._listofvalues1);
// [919]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [920]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [921]  sb.Append( {23} ) 
_sb.append("UPDATE " + _B.escapefield(_tblname,_B) + " SET ");
// [922]  Dim i As Int 
_i=0;
// [923]  Dim iTot As Int = tblfields.Size - 1 
_itot=Object.keys(_tblfields).length-1;
// [924]  For i = 0 To iTot 
for (_i=0;_i<=_itot;_i++) {
// [925]  Dim col As String = tblfields.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblfields,_i);
// [926]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [927]  If i <> iTot Then 
if (_i!=_itot) {
// [928]  sb.Append( {187} ) 
_sb.append("= ?,");
// [929]  Else 
} else {
// [930]  sb.Append( {188} ) 
_sb.append("= ?");
// [931]  End If 
}
// [932]  Next 
}
// [933]  sb.Append( {24} ) 
_sb.append(" WHERE ");
// [934]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [935]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [936]  If i > 0 Then 
if (_i>0) {
// [937]  sb.Append( {189} ) 
_sb.append(" AND ");
// [938]  End If 
}
// [939]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [940]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [941]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [942]  sb.Append( {25} ) 
_sb.append(" " + _opr + " ?");
// [943]  Next 
}
// [944]  query = sb.tostring 
_B._query=_sb.toString();
// [945]  args = listOfValues 
_B._args=_listofvalues;
// [946]  types = listOfTypes 
_B._types=_listoftypes;
// [947]  command = {190} 
_B._command="update";
// [948]  Return Me 
return _B;
// End Sub
};

// [953] Sub UpdateAll(tblFields As Map,operators As List) As BANanoMSSQLE 
_B.updateall=function(_tblfields,_operators) {
var _listoftypes,_listofvalues,_sb,_i,_itot,_col,_oper;
// [954]  If operators = Null Then operators = EQOperators(tblFields) 
if (_operators==null) {_operators=_B.eqoperators(_tblfields,_B);}
// [955]  Dim listOfTypes As List = GetMapTypes(tblFields) 
_listoftypes=_B.getmaptypes(_tblfields,_B);
// [956]  Dim listOfValues As List = GetMapValues(tblFields) 
_listofvalues=_B.getmapvalues(_tblfields,_B);
// [957]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [958]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [959]  sb.Append( {26} ) 
_sb.append("UPDATE " + _B.escapefield(_B._tablename,_B) + " SET ");
// [960]  Dim i As Int 
_i=0;
// [961]  Dim iTot As Int = tblFields.Size - 1 
_itot=Object.keys(_tblfields).length-1;
// [962]  For i = 0 To iTot 
for (_i=0;_i<=_itot;_i++) {
// [963]  Dim col As String = tblFields.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblfields,_i);
// [964]  Dim oper As String = operators.Get(i) 
_oper=_operators[_i];
// [965]  sb.Append(col) 
_sb.append(_col);
// [966]  If i <> iTot Then 
if (_i!=_itot) {
// [967]  sb.Append( {191} ) 
_sb.append(" = ?,");
// [968]  Else 
} else {
// [969]  sb.Append( {27} ) 
_sb.append(" " + _oper + " ?");
// [970]  End If 
}
// [971]  Next 
}
// [972]  query = sb.tostring 
_B._query=_sb.toString();
// [973]  args = listOfValues 
_B._args=_listofvalues;
// [974]  types = listOfTypes 
_B._types=_listoftypes;
// [975]  command = {192} 
_B._command="update";
// [976]  Return Me 
return _B;
// End Sub
};

}
/* =========================== BANanoMySQLE  =========================== */
function banano_bananovuetifyconnect_bananomysqle() {
var _B=this;
_B._rectype={};

_B._db_varchar_20="VARCHAR(20)";

_B._db_varchar_10="VARCHAR(10)";

_B._db_varchar_30="VARCHAR(30)";

_B._db_varchar_40="VARCHAR(40)";

_B._db_varchar_50="VARCHAR(50)";

_B._db_varchar_100="VARCHAR(100)";

_B._db_varchar_255="VARCHAR(255)";

_B._db_string="TEXT";

_B._db_int="INT";

_B._db_float="FLOAT";

_B._db_blob="BLOB";

_B._db_bool="BOOL";

_B._db_real="REAL";

_B._db_date="DATE";

_B._db_integer="INTEGER";

_B._db_text="TEXT";

_B._methodname="";

_B._methodnamedynamic="";

_B._schema={};

_B._host="";

_B._username="";

_B._password="";

_B._dbase="";

_B._result=[];

_B._command="";

_B._types=[];

_B._args=[];

_B._query="";

_B._response="";

_B._error="";

_B._affectedrows=0;

_B._json="";

_B._ok=false;

_B._tablename="";

_B._primarykey="";

_B._record={};

_B._auto="";

_B._fields=[];

// [50] Sub SetConnection(shost As String, susername As String, spassword As String) As BANanoMySQLE 
_B.setconnection=function(_shost,_susername,_spassword) {
// [51]  host = shost 
_B._host=_shost;
// [52]  username = susername 
_B._username=_susername;
// [53]  password = spassword 
_B._password=_spassword;
// [54]  Return Me 
return _B;
// End Sub
};

// [57] Sub RecordFromMap(sm As Map) 
_B.recordfrommap=function(_sm) {
var _k,_v;
// [58]  Record.Initialize 
_B._record={};
// [59]  For Each k As String In sm.Keys 
var _kKeys = Object.keys(_sm);
for (var _kindex=0;_kindex<_kKeys.length;_kindex++) {
_k=_kKeys[_kindex];
// [60]  Dim v As Object = sm.Get(k) 
_v=_sm[_k];
// [61]  Record.Put(k, v) 
_B._record[_k]=_v;
// [62]  Next 
}
// End Sub
};

// [66] Sub AndOrOperators(sm As Map) As List 'ignore 
_B.andoroperators=function(_sm) {
var _nl,_k;
// [67]  Dim nl As List 
_nl=[];
// [68]  nl.initialize 
_nl.length=0;
// [69]  For Each k As String In sm.Keys 
var _kKeys = Object.keys(_sm);
for (var _kindex=0;_kindex<_kKeys.length;_kindex++) {
_k=_kKeys[_kindex];
// [70]  nl.Add( {52} ) 
_nl.push("AND");
// [71]  Next 
}
// [72]  Return nl 
return _nl;
// End Sub
};

// [76] Sub SelectWhere1(tblfields As List, tblWhere As Map, operators As List, AndOr As List, orderBy As List) As BANanoMySQLE 
_B.selectwhere1=function(_tblfields,_tblwhere,_operators,_andor,_orderby) {
var _listoftypes,_listofvalues,_fld1,_selfields,_sb,_i,_iwhere,_sandor,_col,_opr,_stro;
// [77]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [78]  If AndOr = Null Then AndOr = AndOrOperators(tblWhere) 
if (_andor==null) {_andor=_B.andoroperators(_tblwhere,_B);}
// [79]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [80]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [82]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [83]  Dim selFIelds As String = {53} 
_selfields="";
// [84]  Select Case fld1 
switch ("" + _fld1) {
// [85]  Case {54} 
case "" + "*":
// [86]  selFIelds = {55} 
_selfields="*";
// [87]  Case Else 
break;
default:
// [88]  selFIelds = JoinFields( {56} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [89]  End Select 
break;
}
// [90]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [91]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [92]  sb.Append( {0} ) 
_sb.append("SELECT " + _selfields + " FROM " + _B.escapefield(_B._tablename,_B) + " WHERE ");
// [93]  Dim i As Int 
_i=0;
// [94]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [95]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [96]  If i > 0 Then 
if (_i>0) {
// [97]  Dim sandor As String = AndOr.get(i) 
_sandor=_andor[_i];
// [98]  sb.Append( {1} ) 
_sb.append(" " + _sandor + " ");
// [99]  End If 
}
// [100]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [101]  sb.Append(col) 
_sb.append(_col);
// [102]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [103]  sb.Append( {2} ) 
_sb.append(" " + _opr + " ?");
// [104]  Next 
}
// [105]  If orderBy <> Null Then 
if (_orderby!=null) {
// [107]  Dim stro As String = JoinFields( {57} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [108]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [109]  sb.Append( {58} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [110]  End If 
}
// [111]  End If 
}
// [112]  query = sb.tostring 
_B._query=_sb.toString();
// [113]  args = listOfValues 
_B._args=_listofvalues;
// [114]  types = listOfTypes 
_B._types=_listoftypes;
// [115]  command = {59} 
_B._command="select";
// [116]  response = {60} 
_B._response="";
// [117]  error = {61} 
_B._error="";
// [118]  result = NewList 
_B._result=_B.newlist(_B);
// [119]  json = {62} 
_B._json="";
// [120]  affectedRows = 0 
_B._affectedrows=0;
// [121]  Return Me 
return _B;
// End Sub
};

// [124] Sub NewList As List 
_B.newlist=function() {
var _lst;
// [125]  Dim lst As List 
_lst=[];
// [126]  lst.Initialize 
_lst.length=0;
// [127]  Return lst 
return _lst;
// End Sub
};

// [132] Sub FromJSON As BANanoMySQLE 
_B.fromjson=function() {
var _m;
// [133]  OK = False 
_B._ok=false;
// [134]  If json.StartsWith( {63} ) Or json.Startswith( {64} ) Then 
if (_B._json.startsWith("{") || _B._json.startsWith("[")) {
// [135]  Dim m As Map = BANano.FromJson(json) 
_m=JSON.parse(_B._json);
// [136]  response = m.Get( {65} ) 
_B._response=_m["response"];
// [137]  error = m.Get( {66} ) 
_B._error=_m["error"];
// [138]  result = m.Get( {67} ) 
_B._result=_m["result"];
// [139]  affectedRows = m.Get( {68} ) 
_B._affectedrows=_m["affectedRows"];
// [140]  If response = {69} Then 
if (_B._response=="Success") {
// [141]  OK = True 
_B._ok=true;
// [142]  End If 
}
// [143]  Else 
} else {
// [144]  response = json 
_B._response=_B._json;
// [145]  error = json 
_B._error=_B._json;
// [146]  result = NewList 
_B._result=_B.newlist(_B);
// [147]  affectedRows = -1 
_B._affectedrows=-1;
// [148]  End If 
}
// [149]  Return Me 
return _B;
// End Sub
};

// [153] Sub SchemaAddField(fldName As String, fldType As String) 
_B.schemaaddfield=function(_fldname,_fldtype) {
// [154]  Schema.Put(fldName, fldType) 
_B._schema[_fldname]=_fldtype;
// End Sub
};

// [159] Sub GetMax As BANanoMySQLE 
_B.getmax=function() {
// [160]  query = {3} 
_B._query="SELECT MAX(" + _B._primarykey + ") As " + _B._primarykey + " FROM " + _B.escapefield(_B._tablename,_B) + "";
// [161]  command = {70} 
_B._command="getmax";
// [162]  Return Me 
return _B;
// End Sub
};

// [166] Sub GetMin As BANanoMySQLE 
_B.getmin=function() {
// [167]  query = {4} 
_B._query="SELECT MIN(" + _B._primarykey + ") As " + _B._primarykey + " FROM " + _B.escapefield(_B._tablename,_B) + "";
// [168]  command = {71} 
_B._command="getmin";
// [169]  Return Me 
return _B;
// End Sub
};

// [174] Sub GetDatabases As BANanoMySQLE 
_B.getdatabases=function() {
// [175]  query = {5} 
_B._query="SHOW DATABASES";
// [176]  command = {72} 
_B._command="databases";
// [177]  Return Me 
return _B;
// End Sub
};

// [182] Sub GetTableNames As BANanoMySQLE 
_B.gettablenames=function() {
// [183]  query = {6} 
_B._query="select table_name from information_schema.tables where table_schema = '" + _B._dbase + "' order by table_name";
// [184]  command = {73} 
_B._command="select";
// [185]  Return Me 
return _B;
// End Sub
};

// [189] Sub GetTableStructure As BANanoMySQLE 
_B.gettablestructure=function() {
// [190]  query = {7} 
_B._query="SHOW COLUMNS FROM " + _B.escapefield(_B._tablename,_B) + "";
// [191]  command = {74} 
_B._command="select";
// [192]  Return Me 
return _B;
// End Sub
};

// [195] Sub GetNextID As String 
_B.getnextid=function() {
var _nextid,_strid,_nr,_ni;
// [196]  Dim nextid As Int 
_nextid=0;
// [197]  Dim strid As String 
_strid="";
// [199]  If result.Size = 0 Then 
if (_B._result.length==0) {
// [200]  nextid = 0 
_nextid=0;
// [201]  Else 
} else {
// [202]  Dim nr As Map = result.Get(0) 
_nr=_B._result[0];
// [203]  Dim ni As String = nr.GetDefault(PrimaryKey, {75} ) 
_ni=(_nr[_B._primarykey] || "0");
// [204]  nextid = BANano.parseInt(ni) 
_nextid=parseInt(_ni);
// [205]  End If 
}
// [206]  nextid = nextid + 1 
_nextid=_nextid+1;
// [207]  strid = CStr(nextid) 
_strid=_B.cstr(_nextid,_B);
// [208]  nextid = BANano.ParseInt(nextid) 
_nextid=parseInt(_nextid);
// [209]  Return strid 
return _strid;
// End Sub
};

// [212] Sub CStr(o As Object) As String 
_B.cstr=function(_o) {
// [213]  Return {76} & o 
return ""+_o;
// End Sub
};

// [218] Public Sub Initialize(dbName As String, tblName As String, PK As String, AI As String) As BANanoMySQLE 
_B.initialize=function(_dbname,_tblname,_pk,_ai) {
// [219]  Schema.Initialize 
_B._schema={};
// [220]  recType.Initialize 
_B._rectype={};
// [221]  Record.Initialize 
_B._record={};
// [222]  MethodName = {78} 
_B._methodname="BANanoMySQL";
// [223]  MethodNameDynamic = {79} 
_B._methodnamedynamic="BANanoMySQLDynamic";
// [224]  result.Initialize 
_B._result.length=0;
// [225]  command = {80} 
_B._command="";
// [226]  PrimaryKey = PK 
_B._primarykey=_pk;
// [227]  DBase = dbName 
_B._dbase=_dbname;
// [228]  TableName = tblName 
_B._tablename=_tblname;
// [229]  types.Initialize 
_B._types.length=0;
// [230]  args.Initialize 
_B._args.length=0;
// [231]  types = Null 
_B._types=null;
// [232]  args = Null 
_B._args=null;
// [233]  query = {81} 
_B._query="";
// [234]  response = {82} 
_B._response="";
// [235]  error = {83} 
_B._error="";
// [236]  affectedRows = 0 
_B._affectedrows=0;
// [237]  json = {84} 
_B._json="";
// [238]  OK = False 
_B._ok=false;
// [239]  host = {85} 
_B._host="";
// [240]  username = {86} 
_B._username="";
// [241]  password = {87} 
_B._password="";
// [242]  Auto = AI 
_B._auto=_ai;
// [243]  Return Me 
return _B;
// End Sub
};

// [247] Sub SchemaClear As BANanoMySQLE 
_B.schemaclear=function() {
// [248]  Schema.clear 
_B._schema={};
// [249]  Return Me 
return _B;
// End Sub
};

// [252] Sub SetField(fldName As String, fldValue As Object) As BANanoMySQLE 
_B.setfield=function(_fldname,_fldvalue) {
// [253]  Record.Put(fldName, fldValue) 
_B._record[_fldname]=_fldvalue;
// [254]  Return Me 
return _B;
// End Sub
};

// [258] Sub SchemaAddBoolean(bools As List) As BANanoMySQLE 
_B.schemaaddboolean=function(_bools) {
var _b;
// [259]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [260]  Schema.Put(b, DB_BOOL) 
_B._schema[_b]=_B._db_bool;
// [261]  Next 
}
// [262]  AddBooleans(bools) 
_B.addbooleans(_bools,_B);
// [263]  Return Me 
return _B;
// End Sub
};

// [267] Sub SchemaFromDesign(cont As VMContainer) As BANanoMySQLE 
_B.schemafromdesign=function(_cont) {
// [268]  SchemaAddBoolean(cont.Booleans) 
_B.schemaaddboolean(_cont._booleans,_B);
// [269]  SchemaAddDate(cont.Dates) 
_B.schemaadddate(_cont._dates,_B);
// [270]  SchemaAddFloat(cont.Doubles) 
_B.schemaaddfloat(_cont._doubles,_B);
// [271]  SchemaAddInt(cont.Integers) 
_B.schemaaddint(_cont._integers,_B);
// [272]  SchemaAddText(cont.Strings) 
_B.schemaaddtext(_cont._strings,_B);
// [274]  AddStrings(cont.Strings) 
_B.addstrings(_cont._strings,_B);
// [275]  AddIntegers(cont.Integers) 
_B.addintegers(_cont._integers,_B);
// [276]  AddDoubles(cont.Doubles) 
_B.adddoubles(_cont._doubles,_B);
// [277]  AddBooleans(cont.Booleans) 
_B.addbooleans(_cont._booleans,_B);
// [278]  AddStrings(cont.Dates) 
_B.addstrings(_cont._dates,_B);
// [279]  Return Me 
return _B;
// End Sub
};

// [283] Sub SchemaAddInt(bools As List) As BANanoMySQLE 
_B.schemaaddint=function(_bools) {
var _b;
// [284]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [285]  Schema.Put(b, DB_INT) 
_B._schema[_b]=_B._db_int;
// [286]  Next 
}
// [287]  AddIntegers(bools) 
_B.addintegers(_bools,_B);
// [288]  Return Me 
return _B;
// End Sub
};

// [291] Sub SchemaAddFloat(bools As List) As BANanoMySQLE 
_B.schemaaddfloat=function(_bools) {
var _b;
// [292]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [293]  Schema.Put(b, DB_FLOAT) 
_B._schema[_b]=_B._db_float;
// [294]  Next 
}
// [295]  AddDoubles(bools) 
_B.adddoubles(_bools,_B);
// [296]  Return Me 
return _B;
// End Sub
};

// [299] Sub SchemaAddBlob(bools As List) As BANanoMySQLE 
_B.schemaaddblob=function(_bools) {
var _b;
// [300]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [301]  Schema.Put(b, DB_BLOB) 
_B._schema[_b]=_B._db_blob;
// [302]  Next 
}
// [303]  AddBlobs(bools) 
_B.addblobs(_bools,_B);
// [304]  Return Me 
return _B;
// End Sub
};

// [307] Sub SchemaAddText(bools As List) As BANanoMySQLE 
_B.schemaaddtext=function(_bools) {
var _b;
// [308]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [309]  Schema.Put(b, DB_STRING) 
_B._schema[_b]=_B._db_string;
// [310]  Next 
}
// [311]  AddStrings(bools) 
_B.addstrings(_bools,_B);
// [312]  Return Me 
return _B;
// End Sub
};

// [315] Sub SchemaCreateTable As BANanoMySQLE 
_B.schemacreatetable=function() {
// [316]  Return CreateTable(Schema) 
return _B.createtable(_B._schema,_B);
// End Sub
};

// [319] Sub SchemaAddDate(bools As List) As BANanoMySQLE 
_B.schemaadddate=function(_bools) {
var _b;
// [320]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [321]  Schema.Put(b, DB_DATE) 
_B._schema[_b]=_B._db_date;
// [322]  Next 
}
// [323]  AddStrings(bools) 
_B.addstrings(_bools,_B);
// [324]  Return Me 
return _B;
// End Sub
};

// [328] Sub Json2Map(strJSON As String) As Map 
_B.json2map=function(_strjson) {
var _jsonx,_map1;
// [329]  Dim jsonx As BANanoJSONParser 
_jsonx={};
// [330]  Dim Map1 As Map 
_map1={};
// [331]  Map1.Initialize 
_map1={};
// [332]  Map1.clear 
_map1={};
// [333]  Try 
try {
// [334]  If strJSON.length > 0 Then 
if (_strjson.length>0) {
// [335]  jsonx.Initialize(strJSON) 
_jsonx=JSON.parse(_strjson);
// [336]  Map1 = jsonx.NextObject 
_map1=_jsonx;
// [337]  End If 
}
// [338]  Return Map1 
return _map1;
// [339]  Catch 
} catch(err) {
// [340]  Return Map1 
return _map1;
// [341]  End Try 
}
// End Sub
};

// [345] Sub Map2Json(mp As Map) As String 
_B.map2json=function(_mp) {
var _jsonx;
// [346]  Dim jsonx As BANanoJSONGenerator 
_jsonx={};
// [347]  jsonx.Initialize(mp) 
_jsonx=_mp;
// [348]  Return jsonx.ToString 
return JSON.stringify(_jsonx);
// End Sub
};

// [353] Private Sub EscapeField(f As String) As String 
_B.escapefield=function(_f) {
// [354]  Return {8} 
return "`" + _f + "`";
// End Sub
};

// [358] Sub Connection As BANanoMySQLE 
_B.connection=function() {
// [359]  command = {88} 
_B._command="connection";
// [360]  Return Me 
return _B;
// End Sub
};

// [364] Sub CreateDatabase As BANanoMySQLE 
_B.createdatabase=function() {
// [365]  query = {9} 
_B._query="CREATE DATABASE IF NOT EXISTS " + _B.escapefield(_B._dbase,_B) + "";
// [366]  command = {89} 
_B._command="createdb";
// [367]  Return Me 
return _B;
// End Sub
};

// [371] Sub DropDataBase As BANanoMySQLE 
_B.dropdatabase=function() {
// [372]  query = {10} 
_B._query="DROP DATABASE " + _B.escapefield(_B._dbase,_B) + "";
// [373]  command = {90} 
_B._command="dropdb";
// [374]  Return Me 
return _B;
// End Sub
};

// [377] Sub Execute(strSQL As String) As BANanoMySQLE 
_B.execute=function(_strsql) {
// [378]  query = strSQL 
_B._query=_strsql;
// [379]  command = {91} 
_B._command="execute";
// [380]  Return Me 
return _B;
// End Sub
};

// [384] public Sub CreateTable(tblFields As Map) As BANanoMySQLE 
_B.createtable=function(_tblfields) {
var _fldname,_fldtype,_fldtot,_fldcnt,_sb;
// [385]  Dim fldName As String 
_fldname="";
// [386]  Dim fldType As String 
_fldtype="";
// [387]  Dim fldTot As Int 
_fldtot=0;
// [388]  Dim fldCnt As Int 
_fldcnt=0;
// [389]  fldTot = tblFields.Size - 1 
_fldtot=Object.keys(_tblfields).length-1;
// [390]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [391]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [392]  sb.Append( {92} ) 
_sb.append("(");
// [393]  For fldCnt = 0 To fldTot 
for (_fldcnt=0;_fldcnt<=_fldtot;_fldcnt++) {
// [394]  fldName = tblFields.GetKeyAt(fldCnt) 
_fldname=banano_getB4JKeyAt(_tblfields,_fldcnt);
// [395]  fldType = tblFields.Get(fldName) 
_fldtype=_tblfields[_fldname];
// [396]  fldType = fldType.Replace( {93} , {94} ) 
_fldtype=_fldtype.split("STRING").join("TEXT");
// [397]  fldType = fldType.Replace( {95} , {96} ) 
_fldtype=_fldtype.split("TEXT").join("VARCHAR(255)");
// [398]  If fldCnt > 0 Then 
if (_fldcnt>0) {
// [399]  sb.Append( {97} ) 
_sb.append(", ");
// [400]  End If 
}
// [401]  sb.Append(EscapeField(fldName)) 
_sb.append(_B.escapefield(_fldname,_B));
// [402]  sb.Append( {98} ) 
_sb.append(" ");
// [403]  sb.Append(fldType) 
_sb.append(_fldtype);
// [404]  If fldName.EqualsIgnoreCase(PrimaryKey) Then 
if (_fldname.equalsIgnoreCase(_B._primarykey)) {
// [405]  sb.Append( {99} ) 
_sb.append(" NOT NULL PRIMARY KEY");
// [406]  End If 
}
// [407]  If fldName.EqualsIgnoreCase(Auto) Then 
if (_fldname.equalsIgnoreCase(_B._auto)) {
// [408]  sb.Append( {100} ) 
_sb.append(" AUTO_INCREMENT");
// [409]  End If 
}
// [410]  Next 
}
// [411]  sb.Append( {101} ) 
_sb.append(")");
// [413]  query = {102} & EscapeField(TableName) & {103} & sb.ToString 
_B._query="CREATE TABLE IF NOT EXISTS "+_B.escapefield(_B._tablename,_B)+" "+_sb.toString();
// [414]  command = {104} 
_B._command="createtable";
// [415]  Return Me 
return _B;
// End Sub
};

// [419] public Sub DropTable As BANanoMySQLE 
_B.droptable=function() {
// [421]  query = {105} & EscapeField(TableName) 
_B._query="DROP TABLE "+_B.escapefield(_B._tablename,_B);
// [422]  command = {106} 
_B._command="droptable";
// [423]  Return Me 
return _B;
// End Sub
};

// [428] private Sub GetMapTypes(sourceMap As Map) As List 
_B.getmaptypes=function(_sourcemap) {
var _listoftypes,_icnt,_itot,_col,_coltype;
// [429]  Dim listOfTypes As List 
_listoftypes=[];
// [430]  listOfTypes.Initialize 
_listoftypes.length=0;
// [431]  Dim iCnt As Int 
_icnt=0;
// [432]  Dim iTot As Int 
_itot=0;
// [433]  iTot = sourceMap.Size - 1 
_itot=Object.keys(_sourcemap).length-1;
// [434]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [435]  Dim col As String = sourceMap.GetKeyAt(iCnt) 
_col=banano_getB4JKeyAt(_sourcemap,_icnt);
// [436]  Dim colType As String = recType.GetDefault(col, {107} ) 
_coltype=(_B._rectype[_col] || "STRING");
// [437]  Select Case colType 
switch ("" + _coltype) {
// [438]  Case {108} , {109} , {110} , {111} 
case "" + "INTEGER":
case "" + "INT":
case "" + "BOOL":
case "" + "BOOLEAN":
// [439]  listOfTypes.add( {112} ) 
_listoftypes.push("i");
// [440]  Case {113} 
break;
case "" + "BLOB":
// [441]  listOfTypes.add( {114} ) 
_listoftypes.push("b");
// [442]  Case {115} , {116} , {117} 
break;
case "" + "REAL":
case "" + "FLOAT":
case "" + "DOUBLE":
// [443]  listOfTypes.add( {118} ) 
_listoftypes.push("d");
// [444]  Case Else 
break;
default:
// [445]  listOfTypes.add( {119} ) 
_listoftypes.push("s");
// [446]  End Select 
break;
}
// [447]  Next 
}
// [448]  Return listOfTypes 
return _listoftypes;
// End Sub
};

// [452] private Sub GetMapType(k As String) As String 
_B.getmaptype=function(_k) {
var _coltype;
// [453]  If recType.ContainsKey(k) Then 
if ((_k in _B._rectype)) {
// [454]  Dim colType As String = recType.GetDefault(k, {120} ) 
_coltype=(_B._rectype[_k] || "STRING");
// [455]  Select Case colType 
switch ("" + _coltype) {
// [456]  Case {121} , {122} , {123} , {124} 
case "" + "INTEGER":
case "" + "INT":
case "" + "BOOL":
case "" + "BOOLEAN":
// [457]  Return {125} 
return "i";
// [458]  Case {126} 
case "" + "BLOB":
// [459]  Return {127} 
return "b";
// [460]  Case {128} , {129} , {130} 
case "" + "REAL":
case "" + "FLOAT":
case "" + "DOUBLE":
// [461]  Return {131} 
return "d";
// [462]  Case Else 
default:
// [463]  Return {132} 
return "s";
// [464]  End Select 
}
// [465]  Else 
} else {
// [466]  Return {133} 
return "s";
// [467]  End If 
}
// End Sub
};

// [471] private Sub GetMapValues(sourceMap As Map) As List 
_B.getmapvalues=function(_sourcemap) {
var _listofvalues,_icnt,_itot,_key,_value,_vtype;
// [472]  Dim listOfValues As List 
_listofvalues=[];
// [473]  listOfValues.Initialize 
_listofvalues.length=0;
// [474]  Dim iCnt As Int 
_icnt=0;
// [475]  Dim iTot As Int 
_itot=0;
// [476]  iTot = sourceMap.Size - 1 
_itot=Object.keys(_sourcemap).length-1;
// [477]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [479]  Dim key As String = sourceMap.getkeyat(iCnt) 
_key=banano_getB4JKeyAt(_sourcemap,_icnt);
// [480]  Dim value As String = sourceMap.GetValueAt(iCnt) 
_value=banano_getB4JValueAt(_sourcemap,_icnt);
// [481]  value = CStr(value) 
_value=_B.cstr(_value,_B);
// [482]  value = value.trim 
_value=_value.trim();
// [484]  Dim vtype As String = GetMapType(key) 
_vtype=_B.getmaptype(_key,_B);
// [485]  Select Case vtype 
switch ("" + _vtype) {
// [486]  Case {134} 
case "" + "i":
// [488]  If value = {135} Then value = {136} 
if (_value=="") {_value="0";}
// [489]  value = BANano.parseInt(value) 
_value=parseInt(_value);
// [490]  Case {137} 
break;
case "" + "d":
// [492]  If value = {138} Then value = {139} 
if (_value=="") {_value="0";}
// [493]  value = BANano.parsefloat(value) 
_value=parseFloat(_value);
// [494]  Case {140} , {141} 
break;
case "" + "s":
case "" + "b":
// [496]  End Select 
break;
}
// [497]  listOfValues.Add(value) 
_listofvalues.push(_value);
// [498]  Next 
}
// [499]  Return listOfValues 
return _listofvalues;
// End Sub
};

// [503] private Sub GetMapKeys(sourceMap As Map) As List 
_B.getmapkeys=function(_sourcemap) {
var _listofvalues,_icnt,_itot,_value;
// [504]  Dim listOfValues As List 
_listofvalues=[];
// [505]  listOfValues.Initialize 
_listofvalues.length=0;
// [506]  Dim iCnt As Int 
_icnt=0;
// [507]  Dim iTot As Int 
_itot=0;
// [508]  iTot = sourceMap.Size - 1 
_itot=Object.keys(_sourcemap).length-1;
// [509]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [510]  Dim value As String = sourceMap.GetKeyAt(iCnt) 
_value=banano_getB4JKeyAt(_sourcemap,_icnt);
// [511]  listOfValues.Add(value) 
_listofvalues.push(_value);
// [512]  Next 
}
// [513]  Return listOfValues 
return _listofvalues;
// End Sub
};

// [518] Sub Insert As BANanoMySQLE 
_B.insert=function() {
// [519]  Insert1(Record) 
_B.insert1(_B._record,_B);
// [520]  Return Me 
return _B;
// End Sub
};

// [524] Sub Insert1(Rec As Map) As BANanoMySQLE 
_B.insert1=function(_rec) {
var _sb,_columns,_values,_listofvalues,_listoftypes,_icnt,_itot,_col;
// [525]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [526]  Log( {11} ) 
console.log("BANanoMySQL.Insert: '" + _B._tablename + "' schema is not set!");
// [527]  End If 
}
// [528]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [529]  Dim columns As StringBuilder 
_columns=new StringBuilder();
// [530]  Dim values As StringBuilder 
_values=new StringBuilder();
// [531]  Dim listOfValues As List = GetMapValues(Rec) 
_listofvalues=_B.getmapvalues(_rec,_B);
// [532]  Dim listOfTypes As List = GetMapTypes(Rec) 
_listoftypes=_B.getmaptypes(_rec,_B);
// [533]  Dim iCnt As Int 
_icnt=0;
// [534]  Dim iTot As Int 
_itot=0;
// [535]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [536]  columns.Initialize 
_columns.init();
_columns.isinitialized=true;
// [537]  values.Initialize 
_values.init();
_values.isinitialized=true;
// [538]  sb.Append( {12} ) 
_sb.append("INSERT INTO " + _B.escapefield(_B._tablename,_B) + " (");
// [539]  iTot = Rec.Size - 1 
_itot=Object.keys(_rec).length-1;
// [540]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [541]  Dim col As String = Rec.GetKeyAt(iCnt) 
_col=banano_getB4JKeyAt(_rec,_icnt);
// [542]  If iCnt > 0 Then 
if (_icnt>0) {
// [543]  columns.Append( {142} ) 
_columns.append(", ");
// [544]  values.Append( {143} ) 
_values.append(", ");
// [545]  End If 
}
// [546]  columns.Append(EscapeField(col)) 
_columns.append(_B.escapefield(_col,_B));
// [547]  values.Append( {144} ) 
_values.append("?");
// [548]  Next 
}
// [549]  sb.Append(columns.ToString) 
_sb.append(_columns.toString());
// [550]  sb.Append( {145} ) 
_sb.append(") VALUES (");
// [551]  sb.Append(values.ToString) 
_sb.append(_values.toString());
// [552]  sb.Append( {146} ) 
_sb.append(")");
// [553]  query = sb.ToString 
_B._query=_sb.toString();
// [554]  args = listOfValues 
_B._args=_listofvalues;
// [555]  types = listOfTypes 
_B._types=_listoftypes;
// [556]  command = {147} 
_B._command="insert";
// [557]  Return Me 
return _B;
// End Sub
};

// [563] Sub InsertReplace As BANanoMySQLE 
_B.insertreplace=function() {
var _sb,_columns,_values,_listofvalues,_listoftypes,_icnt,_itot,_col;
// [564]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [565]  Dim columns As StringBuilder 
_columns=new StringBuilder();
// [566]  Dim values As StringBuilder 
_values=new StringBuilder();
// [567]  Dim listOfValues As List = GetMapValues(Record) 
_listofvalues=_B.getmapvalues(_B._record,_B);
// [568]  Dim listOfTypes As List = GetMapTypes(Record) 
_listoftypes=_B.getmaptypes(_B._record,_B);
// [569]  Dim iCnt As Int 
_icnt=0;
// [570]  Dim iTot As Int 
_itot=0;
// [571]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [572]  columns.Initialize 
_columns.init();
_columns.isinitialized=true;
// [573]  values.Initialize 
_values.init();
_values.isinitialized=true;
// [574]  sb.Append( {13} ) 
_sb.append("REPLACE INTO " + _B.escapefield(_B._tablename,_B) + " (");
// [575]  iTot = Record.Size - 1 
_itot=Object.keys(_B._record).length-1;
// [576]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [577]  Dim col As String = Record.GetKeyAt(iCnt) 
_col=banano_getB4JKeyAt(_B._record,_icnt);
// [578]  If iCnt > 0 Then 
if (_icnt>0) {
// [579]  columns.Append( {148} ) 
_columns.append(", ");
// [580]  values.Append( {149} ) 
_values.append(", ");
// [581]  End If 
}
// [582]  columns.Append(EscapeField(col)) 
_columns.append(_B.escapefield(_col,_B));
// [583]  values.Append( {150} ) 
_values.append("?");
// [584]  Next 
}
// [585]  sb.Append(columns.ToString) 
_sb.append(_columns.toString());
// [586]  sb.Append( {151} ) 
_sb.append(") VALUES (");
// [587]  sb.Append(values.ToString) 
_sb.append(_values.toString());
// [588]  sb.Append( {152} ) 
_sb.append(")");
// [589]  query = sb.ToString 
_B._query=_sb.toString();
// [590]  args = listOfValues 
_B._args=_listofvalues;
// [591]  types = listOfTypes 
_B._types=_listoftypes;
// [592]  command = {153} 
_B._command="replace";
// [593]  Return Me 
return _B;
// End Sub
};

// [597] Sub Delete(primaryValue As String) As BANanoMySQLE 
_B.delete=function(_primaryvalue) {
var _qw;
// [598]  Dim qw As Map = CreateMap() 
_qw={};
// [599]  qw.Put(PrimaryKey, primaryValue) 
_qw[_B._primarykey]=_primaryvalue;
// [600]  DeleteWhere(TableName, qw, Array( {154} )) 
_B.deletewhere(_B._tablename,_qw,["="],_B);
// [601]  Return Me 
return _B;
// End Sub
};

// [606] private Sub JoinFields(delimiter As String, lst As List) As String 
_B.joinfields=function(_delimiter,_lst) {
var _i,_sb,_fld;
// [607]  Dim i As Int 
_i=0;
// [608]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [609]  Dim fld As String 
_fld="";
// [610]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [611]  fld = lst.Get(0) 
_fld=_lst[0];
// [612]  fld = EscapeField(fld) 
_fld=_B.escapefield(_fld,_B);
// [613]  sb.Append(fld) 
_sb.append(_fld);
// [614]  For i = 1 To lst.size - 1 
for (_i=1;_i<=_lst.length-1;_i++) {
// [615]  Dim fld As String = lst.Get(i) 
_fld=_lst[_i];
// [616]  fld = EscapeField(fld) 
_fld=_B.escapefield(_fld,_B);
// [617]  sb.Append(delimiter).Append(fld) 
_sb.append(_delimiter).append(_fld);
// [618]  Next 
}
// [619]  Return sb.ToString 
return _sb.toString();
// End Sub
};

// [623] private Sub Join(delimiter As String, lst As List) As String 
_B.join=function(_delimiter,_lst) {
var _i,_sb,_fld;
// [624]  Dim i As Int 
_i=0;
// [625]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [626]  Dim fld As String 
_fld="";
// [627]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [628]  fld = lst.Get(0) 
_fld=_lst[0];
// [629]  sb.Append(fld) 
_sb.append(_fld);
// [630]  For i = 1 To lst.size - 1 
for (_i=1;_i<=_lst.length-1;_i++) {
// [631]  Dim fld As String = lst.Get(i) 
_fld=_lst[_i];
// [632]  sb.Append(delimiter).Append(fld) 
_sb.append(_delimiter).append(_fld);
// [633]  Next 
}
// [634]  Return sb.ToString 
return _sb.toString();
// End Sub
};

// [638] Sub Read(primaryValue As String) As BANanoMySQLE 
_B.read=function(_primaryvalue) {
var _qw;
// [639]  Dim qw As Map = CreateMap() 
_qw={};
// [640]  qw.Put(PrimaryKey, primaryValue) 
_qw[_B._primarykey]=_primaryvalue;
// [641]  SelectWhere(TableName, Array( {155} ), qw, Null, Array(PrimaryKey)) 
_B.selectwhere(_B._tablename,["*"],_qw,null,[_B._primarykey],_B);
// [642]  Return Me 
return _B;
// End Sub
};

// [646] Sub Exists(primaryValue As String) As BANanoMySQLE 
_B.exists=function(_primaryvalue) {
var _qw;
// [647]  Dim qw As Map = CreateMap() 
_qw={};
// [648]  qw.Put(PrimaryKey, primaryValue) 
_qw[_B._primarykey]=_primaryvalue;
// [649]  SelectWhere(TableName, Array(PrimaryKey), qw, Null, Array(PrimaryKey)) 
_B.selectwhere(_B._tablename,[_B._primarykey],_qw,null,[_B._primarykey],_B);
// [650]  Return Me 
return _B;
// End Sub
};

// [654] Sub SelectWhere(tblName As String, tblfields As List, tblWhere As Map, operators As List, orderBy As List) As BANanoMySQLE 
_B.selectwhere=function(_tblname,_tblfields,_tblwhere,_operators,_orderby) {
var _listoftypes,_listofvalues,_fld1,_selfields,_sb,_i,_iwhere,_col,_oper,_stro;
// [655]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [656]  Log( {14} ) 
console.log("BANanoMySQL.SelectWhere: '" + _tblname + "' schema is not set!");
// [657]  End If 
}
// [658]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [659]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [660]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [662]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [663]  Dim selFIelds As String = {156} 
_selfields="";
// [664]  Select Case fld1 
switch ("" + _fld1) {
// [665]  Case {157} 
case "" + "*":
// [666]  selFIelds = {158} 
_selfields="*";
// [667]  Case Else 
break;
default:
// [668]  selFIelds = JoinFields( {159} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [669]  End Select 
break;
}
// [670]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [671]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [672]  sb.Append( {15} ) 
_sb.append("SELECT " + _selfields + " FROM " + _B.escapefield(_tblname,_B) + " WHERE ");
// [673]  Dim i As Int 
_i=0;
// [674]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [675]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [676]  If i > 0 Then 
if (_i>0) {
// [677]  sb.Append( {160} ) 
_sb.append(" AND ");
// [678]  End If 
}
// [679]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [680]  Dim oper As String = operators.Get(i) 
_oper=_operators[_i];
// [681]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [682]  sb.Append( {16} ) 
_sb.append(" " + _oper + " ?");
// [683]  Next 
}
// [684]  If orderBy <> Null Then 
if (_orderby!=null) {
// [686]  Dim stro As String = JoinFields( {161} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [687]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [688]  sb.Append( {162} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [689]  End If 
}
// [690]  End If 
}
// [691]  query = sb.tostring 
_B._query=_sb.toString();
// [692]  args = listOfValues 
_B._args=_listofvalues;
// [693]  types = listOfTypes 
_B._types=_listoftypes;
// [694]  command = {163} 
_B._command="select";
// [695]  Return Me 
return _B;
// End Sub
};

// [699] Sub SelectDistinctWhere(tblName As String, tblfields As List, tblWhere As Map, operators As List, orderBy As List) As BANanoMySQLE 
_B.selectdistinctwhere=function(_tblname,_tblfields,_tblwhere,_operators,_orderby) {
var _listoftypes,_listofvalues,_fld1,_selfields,_sb,_i,_iwhere,_col,_oper,_stro;
// [700]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [701]  Log( {17} ) 
console.log("BANanoMySQL.SelectWhere: '" + _tblname + "' schema is not set!");
// [702]  End If 
}
// [703]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [704]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [705]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [707]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [708]  Dim selFIelds As String = {164} 
_selfields="";
// [709]  Select Case fld1 
switch ("" + _fld1) {
// [710]  Case {165} 
case "" + "*":
// [711]  selFIelds = {166} 
_selfields="*";
// [712]  Case Else 
break;
default:
// [713]  selFIelds = JoinFields( {167} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [714]  End Select 
break;
}
// [715]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [716]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [717]  sb.Append( {18} ) 
_sb.append("SELECT DISTINCT " + _selfields + " FROM " + _B.escapefield(_tblname,_B) + " WHERE ");
// [718]  Dim i As Int 
_i=0;
// [719]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [720]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [721]  If i > 0 Then 
if (_i>0) {
// [722]  sb.Append( {168} ) 
_sb.append(" AND ");
// [723]  End If 
}
// [724]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [725]  Dim oper As String = operators.Get(i) 
_oper=_operators[_i];
// [726]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [727]  sb.Append( {19} ) 
_sb.append(" " + _oper + " ?");
// [728]  Next 
}
// [729]  If orderBy <> Null Then 
if (_orderby!=null) {
// [731]  Dim stro As String = JoinFields( {169} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [732]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [733]  sb.Append( {170} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [734]  End If 
}
// [735]  End If 
}
// [736]  query = sb.tostring 
_B._query=_sb.toString();
// [737]  args = listOfValues 
_B._args=_listofvalues;
// [738]  types = listOfTypes 
_B._types=_listoftypes;
// [739]  command = {171} 
_B._command="select";
// [740]  Return Me 
return _B;
// End Sub
};

// [744] Sub DeleteAll As BANanoMySQLE 
_B.deleteall=function() {
// [745]  query = {20} 
_B._query="DELETE FROM " + _B.escapefield(_B._tablename,_B) + "";
// [746]  command = {172} 
_B._command="delete";
// [747]  Return Me 
return _B;
// End Sub
};

// [750] private Sub EQOperators(sm As Map) As List 'ignore 
_B.eqoperators=function(_sm) {
var _nl,_k;
// [751]  Dim nl As List 
_nl=[];
// [752]  nl.initialize 
_nl.length=0;
// [753]  For Each k As String In sm.Keys 
var _kKeys = Object.keys(_sm);
for (var _kindex=0;_kindex<_kKeys.length;_kindex++) {
_k=_kKeys[_kindex];
// [754]  nl.Add( {173} ) 
_nl.push("=");
// [755]  Next 
}
// [756]  Return nl 
return _nl;
// End Sub
};

// [761] Sub DeleteWhere(tblName As String, tblWhere As Map, operators As List) As BANanoMySQLE 
_B.deletewhere=function(_tblname,_tblwhere,_operators) {
var _listoftypes,_listofvalues,_sb,_i,_iwhere,_col,_opr;
// [762]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [763]  Log( {21} ) 
console.log("BANanoMySQL.DeleteWhere: '" + _tblname + "' schema is not set!");
// [764]  End If 
}
// [765]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [766]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [767]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [768]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [769]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [770]  sb.Append( {22} ) 
_sb.append("DELETE FROM " + _B.escapefield(_tblname,_B) + " WHERE ");
// [771]  Dim i As Int 
_i=0;
// [772]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [773]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [774]  If i > 0 Then 
if (_i>0) {
// [775]  sb.Append( {174} ) 
_sb.append(" AND ");
// [776]  End If 
}
// [777]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [778]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [779]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [780]  sb.Append( {23} ) 
_sb.append(" " + _opr + " ?");
// [781]  Next 
}
// [782]  query = sb.tostring 
_B._query=_sb.toString();
// [783]  args = listOfValues 
_B._args=_listofvalues;
// [784]  types = listOfTypes 
_B._types=_listoftypes;
// [785]  command = {175} 
_B._command="delete";
// [786]  Return Me 
return _B;
// End Sub
};

// [791] Sub SelectAll(tblfields As List, orderBy As List) As BANanoMySQLE 
_B.selectall=function(_tblfields,_orderby) {
var _fld1,_selfields,_sb,_stro;
// [793]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [794]  Dim selFIelds As String = {176} 
_selfields="";
// [795]  Select Case fld1 
switch ("" + _fld1) {
// [796]  Case {177} 
case "" + "*":
// [797]  selFIelds = {178} 
_selfields="*";
// [798]  Case Else 
break;
default:
// [799]  selFIelds = JoinFields( {179} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [800]  End Select 
break;
}
// [801]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [802]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [803]  sb.Append( {24} ) 
_sb.append("SELECT " + _selfields + " FROM " + _B.escapefield(_B._tablename,_B) + "");
// [804]  If orderBy <> Null Then 
if (_orderby!=null) {
// [806]  Dim stro As String = JoinFields( {180} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [807]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [808]  sb.Append( {181} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [809]  End If 
}
// [810]  End If 
}
// [811]  query = sb.tostring 
_B._query=_sb.toString();
// [812]  command = {182} 
_B._command="select";
// [813]  Return Me 
return _B;
// End Sub
};

// [817] Sub SelectDistinctAll(tblfields As List, orderBy As List) As BANanoMySQLE 
_B.selectdistinctall=function(_tblfields,_orderby) {
var _fld1,_selfields,_sb,_stro;
// [819]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [820]  Dim selFIelds As String = {183} 
_selfields="";
// [821]  Select Case fld1 
switch ("" + _fld1) {
// [822]  Case {184} 
case "" + "*":
// [823]  selFIelds = {185} 
_selfields="*";
// [824]  Case Else 
break;
default:
// [825]  selFIelds = JoinFields( {186} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [826]  End Select 
break;
}
// [827]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [828]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [829]  sb.Append( {25} ) 
_sb.append("SELECT DISTINCT " + _selfields + " FROM " + _B.escapefield(_B._tablename,_B) + "");
// [830]  If orderBy <> Null Then 
if (_orderby!=null) {
// [832]  Dim stro As String = JoinFields( {187} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [833]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [834]  sb.Append( {188} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [835]  End If 
}
// [836]  End If 
}
// [837]  query = sb.tostring 
_B._query=_sb.toString();
// [838]  command = {189} 
_B._command="select";
// [839]  Return Me 
return _B;
// End Sub
};

// [842] Sub Build As Map 
_B.build=function() {
var _b;
// [843]  Dim b As Map = CreateMap() 
_b={};
// [844]  b.Put( {190} , command) 
_b["command"]=_B._command;
// [845]  b.Put( {191} , query) 
_b["query"]=_B._query;
// [846]  b.Put( {192} , args) 
_b["args"]=_B._args;
// [847]  b.Put( {193} , types) 
_b["types"]=_B._types;
// [848]  Return b 
return _b;
// End Sub
};

// [852] Sub BuildDynamic As Map 
_B.builddynamic=function() {
var _b;
// [853]  Dim b As Map = CreateMap() 
_b={};
// [854]  b.Put( {194} , command) 
_b["command"]=_B._command;
// [855]  b.Put( {195} , query) 
_b["query"]=_B._query;
// [856]  b.Put( {196} , args) 
_b["args"]=_B._args;
// [857]  b.Put( {197} , types) 
_b["types"]=_B._types;
// [858]  b.put( {198} , host) 
_b["host"]=_B._host;
// [859]  b.Put( {199} , username) 
_b["username"]=_B._username;
// [860]  b.Put( {200} , password) 
_b["password"]=_B._password;
// [861]  b.Put( {201} , DBase) 
_b["dbname"]=_B._dbase;
// [862]  Return b 
return _b;
// End Sub
};

// [867] private Sub AddStrings(fieldNames As List) As BANanoMySQLE 
_B.addstrings=function(_fieldnames) {
var _strfld;
// [868]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [869]  recType.Put(strfld, {202} ) 
_B._rectype[_strfld]="STRING";
// [870]  Next 
}
// [871]  Return Me 
return _B;
// End Sub
};

// [875] private Sub AddIntegers(fieldNames As List) As BANanoMySQLE 
_B.addintegers=function(_fieldnames) {
var _strfld;
// [876]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [877]  recType.Put(strfld, {203} ) 
_B._rectype[_strfld]="INT";
// [878]  Next 
}
// [879]  Return Me 
return _B;
// End Sub
};

// [883] private Sub AddDoubles(fieldNames As List) As BANanoMySQLE 
_B.adddoubles=function(_fieldnames) {
var _strfld;
// [884]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [885]  recType.Put(strfld, {204} ) 
_B._rectype[_strfld]="DOUBLE";
// [886]  Next 
}
// [887]  Return Me 
return _B;
// End Sub
};

// [891] private Sub AddBooleans(fieldNames As List) As BANanoMySQLE 
_B.addbooleans=function(_fieldnames) {
var _strfld;
// [892]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [893]  recType.Put(strfld, {205} ) 
_B._rectype[_strfld]="BOOL";
// [894]  Next 
}
// [895]  Return Me 
return _B;
// End Sub
};

// [898] Sub FirstRecord As Map 
_B.firstrecord=function() {
var _rec;
// [899]  Dim rec As Map = result.Get(0) 
_rec=_B._result[0];
// [900]  Return rec 
return _rec;
// End Sub
};

// [904] private Sub AddBlobs(fieldNames As List) As BANanoMySQLE 
_B.addblobs=function(_fieldnames) {
var _strfld;
// [905]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [906]  recType.Put(strfld, {206} ) 
_B._rectype[_strfld]="BLOB";
// [907]  Next 
}
// [908]  Return Me 
return _B;
// End Sub
};

// [911] Sub Update(priValue As String) As BANanoMySQLE 
_B.update=function(_privalue) {
var _tblwhere;
// [912]  Dim tblWhere As Map = CreateMap() 
_tblwhere={};
// [913]  tblWhere.Put(PrimaryKey, priValue) 
_tblwhere[_B._primarykey]=_privalue;
// [914]  UpdateWhere(TableName, Record, tblWhere, Null) 
_B.updatewhere(_B._tablename,_B._record,_tblwhere,null,_B);
// [915]  Return Me 
return _B;
// End Sub
};

// [918] Sub Update1(Rec As Map, priValue As String) As BANanoMySQLE 
_B.update1=function(_rec,_privalue) {
var _tblwhere;
// [919]  Record = Rec 
_B._record=_rec;
// [920]  Dim tblWhere As Map = CreateMap() 
_tblwhere={};
// [921]  tblWhere.Put(PrimaryKey, priValue) 
_tblwhere[_B._primarykey]=_privalue;
// [922]  UpdateWhere(TableName, Rec, tblWhere, Null) 
_B.updatewhere(_B._tablename,_rec,_tblwhere,null,_B);
// [923]  Return Me 
return _B;
// End Sub
};

// [927] Sub UpdateWhere(tblName As String, tblfields As Map, tblWhere As Map, operators As List) As BANanoMySQLE 
_B.updatewhere=function(_tblname,_tblfields,_tblwhere,_operators) {
var _listoftypes,_listoftypes1,_listofvalues,_listofvalues1,_sb,_i,_itot,_col,_iwhere,_opr;
// [928]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [929]  Log( {26} ) 
console.log("BANanoMySQL.UpdateWhere: '" + _tblname + "' schema is not set!");
// [930]  End If 
}
// [931]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [932]  Dim listOfTypes As List = GetMapTypes(tblfields) 
_listoftypes=_B.getmaptypes(_tblfields,_B);
// [933]  Dim listOfTypes1 As List = GetMapTypes(tblWhere) 
_listoftypes1=_B.getmaptypes(_tblwhere,_B);
// [934]  listOfTypes.AddAll(listOfTypes1) 
_listoftypes.splice(_listoftypes.length,0,..._listoftypes1);
// [935]  Dim listOfValues As List = GetMapValues(tblfields) 
_listofvalues=_B.getmapvalues(_tblfields,_B);
// [936]  Dim listOfValues1 As List = GetMapValues(tblWhere) 
_listofvalues1=_B.getmapvalues(_tblwhere,_B);
// [937]  listOfValues.AddAll(listOfValues1) 
_listofvalues.splice(_listofvalues.length,0,..._listofvalues1);
// [938]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [939]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [940]  sb.Append( {27} ) 
_sb.append("UPDATE " + _B.escapefield(_tblname,_B) + " SET ");
// [941]  Dim i As Int 
_i=0;
// [942]  Dim iTot As Int = tblfields.Size - 1 
_itot=Object.keys(_tblfields).length-1;
// [943]  For i = 0 To iTot 
for (_i=0;_i<=_itot;_i++) {
// [944]  Dim col As String = tblfields.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblfields,_i);
// [945]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [946]  If i <> iTot Then 
if (_i!=_itot) {
// [947]  sb.Append( {207} ) 
_sb.append("= ?,");
// [948]  Else 
} else {
// [949]  sb.Append( {208} ) 
_sb.append("= ?");
// [950]  End If 
}
// [951]  Next 
}
// [952]  sb.Append( {28} ) 
_sb.append(" WHERE ");
// [953]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [954]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [955]  If i > 0 Then 
if (_i>0) {
// [956]  sb.Append( {209} ) 
_sb.append(" AND ");
// [957]  End If 
}
// [958]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [959]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [960]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [961]  sb.Append( {29} ) 
_sb.append(" " + _opr + " ?");
// [962]  Next 
}
// [963]  fields = GetMapKeys(tblfields) 
_B._fields=_B.getmapkeys(_tblfields,_B);
// [964]  query = sb.tostring 
_B._query=_sb.toString();
// [965]  args = listOfValues 
_B._args=_listofvalues;
// [966]  types = listOfTypes 
_B._types=_listoftypes;
// [967]  command = {210} 
_B._command="update";
// [968]  Return Me 
return _B;
// End Sub
};

// [973] Sub UpdateAll(tblFields As Map, operators As List) As BANanoMySQLE 
_B.updateall=function(_tblfields,_operators) {
var _listoftypes,_listofvalues,_sb,_i,_itot,_col,_oper;
// [974]  If operators = Null Then operators = EQOperators(tblFields) 
if (_operators==null) {_operators=_B.eqoperators(_tblfields,_B);}
// [975]  Dim listOfTypes As List = GetMapTypes(tblFields) 
_listoftypes=_B.getmaptypes(_tblfields,_B);
// [976]  Dim listOfValues As List = GetMapValues(tblFields) 
_listofvalues=_B.getmapvalues(_tblfields,_B);
// [977]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [978]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [979]  sb.Append( {30} ) 
_sb.append("UPDATE " + _B.escapefield(_B._tablename,_B) + " SET ");
// [980]  Dim i As Int 
_i=0;
// [981]  Dim iTot As Int = tblFields.Size - 1 
_itot=Object.keys(_tblfields).length-1;
// [982]  For i = 0 To iTot 
for (_i=0;_i<=_itot;_i++) {
// [983]  Dim col As String = tblFields.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblfields,_i);
// [984]  Dim oper As String = operators.Get(i) 
_oper=_operators[_i];
// [985]  sb.Append(col) 
_sb.append(_col);
// [986]  If i <> iTot Then 
if (_i!=_itot) {
// [987]  sb.Append( {211} ) 
_sb.append(" = ?,");
// [988]  Else 
} else {
// [989]  sb.Append( {31} ) 
_sb.append(" " + _oper + " ?");
// [990]  End If 
}
// [991]  Next 
}
// [992]  query = sb.tostring 
_B._query=_sb.toString();
// [993]  args = listOfValues 
_B._args=_listofvalues;
// [994]  types = listOfTypes 
_B._types=_listoftypes;
// [995]  command = {212} 
_B._command="update";
// [996]  Return Me 
return _B;
// End Sub
};

}
/* =========================== BANanoSQLiteE  =========================== */
function banano_bananovuetifyconnect_bananosqlitee() {
var _B=this;
_B._rectype={};

_B._db_bool="BOOL";

_B._db_int="INT";

_B._db_string="STRING";

_B._db_real="REAL";

_B._db_date="DATE";

_B._db_blob="BLOB";

_B._db_integer="INTEGER";

_B._db_text="TEXT";

_B._db_float="FLOAT";

_B._methodname="";

_B._schema={};

_B._dbase="";

_B._result=[];

_B._command="";

_B._types=[];

_B._args=[];

_B._query="";

_B._response="";

_B._error="";

_B._affectedrows=0;

_B._json="";

_B._ok=false;

_B._tablename="";

_B._primarykey="";

_B._record={};

// [32] Sub RecordFromMap(sm As Map) 
_B.recordfrommap=function(_sm) {
var _k,_v;
// [33]  Record.Initialize 
_B._record={};
// [34]  For Each k As String In sm.Keys 
var _kKeys = Object.keys(_sm);
for (var _kindex=0;_kindex<_kKeys.length;_kindex++) {
_k=_kKeys[_kindex];
// [35]  Dim v As Object = sm.Get(k) 
_v=_sm[_k];
// [36]  Record.Put(k, v) 
_B._record[_k]=_v;
// [37]  Next 
}
// End Sub
};

// [40] Sub SchemaAddField(fldName As String, fldType As String) 
_B.schemaaddfield=function(_fldname,_fldtype) {
// [41]  Schema.Put(fldName, fldType) 
_B._schema[_fldname]=_fldtype;
// End Sub
};

// [46] Sub GetMax As BANanoSQLiteE 
_B.getmax=function() {
// [47]  query = {0} 
_B._query="SELECT MAX(" + _B._primarykey + ") As " + _B._primarykey + " FROM " + _B.escapefield(_B._tablename,_B) + "";
// [48]  command = {41} 
_B._command="getmax";
// [49]  Return Me 
return _B;
// End Sub
};

// [53] Sub GetMin As BANanoSQLiteE 
_B.getmin=function() {
// [54]  query = {1} 
_B._query="SELECT MIN(" + _B._primarykey + ") As " + _B._primarykey + " FROM " + _B.escapefield(_B._tablename,_B) + "";
// [55]  command = {42} 
_B._command="getmin";
// [56]  Return Me 
return _B;
// End Sub
};

// [61] Sub ColumnNames As BANanoSQLiteE 
_B.columnnames=function() {
// [62]  query = {2} 
_B._query="PRAGMA table_info('" + _B._tablename + "')";
// [63]  command = {43} 
_B._command="select";
// [64]  Return Me 
return _B;
// End Sub
};

// [68] Sub TableNames As BANanoSQLiteE 
_B.tablenames=function() {
// [69]  query = {44} 
_B._query="SELECT name FROM sqlite_master WHERE type='table' AND name Not LIKE 'sqlite_%' ORDER BY name";
// [70]  command = {45} 
_B._command="select";
// [71]  Return Me 
return _B;
// End Sub
};

// [76] Sub GetTableNames As BANanoSQLiteE 
_B.gettablenames=function() {
// [77]  query = {3} 
_B._query="select table_name from information_schema.tables where table_schema = '" + _B._dbase + "' order by table_name";
// [78]  command = {46} 
_B._command="select";
// [79]  Return Me 
return _B;
// End Sub
};

// [83] Sub GetTableStructure As BANanoSQLiteE 
_B.gettablestructure=function() {
// [84]  query = {4} 
_B._query="describe " + _B.escapefield(_B._tablename,_B) + "";
// [85]  command = {47} 
_B._command="select";
// [86]  Return Me 
return _B;
// End Sub
};

// [89] Sub AndOrOperators(sm As Map) As List 'ignore 
_B.andoroperators=function(_sm) {
var _nl,_k;
// [90]  Dim nl As List 
_nl=[];
// [91]  nl.initialize 
_nl.length=0;
// [92]  For Each k As String In sm.Keys 
var _kKeys = Object.keys(_sm);
for (var _kindex=0;_kindex<_kKeys.length;_kindex++) {
_k=_kKeys[_kindex];
// [93]  nl.Add( {48} ) 
_nl.push("AND");
// [94]  Next 
}
// [95]  Return nl 
return _nl;
// End Sub
};

// [99] Sub SelectWhere1(tblfields As List, tblWhere As Map, operators As List, AndOr As List, orderBy As List) As BANanoSQLiteE 
_B.selectwhere1=function(_tblfields,_tblwhere,_operators,_andor,_orderby) {
var _listoftypes,_listofvalues,_fld1,_selfields,_sb,_i,_iwhere,_sandor,_col,_opr,_stro;
// [100]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [101]  If AndOr = Null Then AndOr = AndOrOperators(tblWhere) 
if (_andor==null) {_andor=_B.andoroperators(_tblwhere,_B);}
// [102]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [103]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [105]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [106]  Dim selFIelds As String = {49} 
_selfields="";
// [107]  Select Case fld1 
switch ("" + _fld1) {
// [108]  Case {50} 
case "" + "*":
// [109]  selFIelds = {51} 
_selfields="*";
// [110]  Case Else 
break;
default:
// [111]  selFIelds = JoinFields( {52} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [112]  End Select 
break;
}
// [113]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [114]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [115]  sb.Append( {5} ) 
_sb.append("SELECT " + _selfields + " FROM " + _B.escapefield(_B._tablename,_B) + " WHERE ");
// [116]  Dim i As Int 
_i=0;
// [117]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [118]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [119]  If i > 0 Then 
if (_i>0) {
// [120]  Dim sandor As String = AndOr.get(i) 
_sandor=_andor[_i];
// [121]  sb.Append( {6} ) 
_sb.append(" " + _sandor + " ");
// [122]  End If 
}
// [123]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [124]  sb.Append(col) 
_sb.append(_col);
// [125]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [126]  sb.Append( {7} ) 
_sb.append(" " + _opr + " ?");
// [127]  Next 
}
// [128]  If orderBy <> Null Then 
if (_orderby!=null) {
// [130]  Dim stro As String = JoinFields( {53} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [131]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [132]  sb.Append( {54} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [133]  End If 
}
// [134]  End If 
}
// [135]  query = sb.tostring 
_B._query=_sb.toString();
// [136]  args = listOfValues 
_B._args=_listofvalues;
// [137]  types = listOfTypes 
_B._types=_listoftypes;
// [138]  command = {55} 
_B._command="select";
// [139]  response = {56} 
_B._response="";
// [140]  error = {57} 
_B._error="";
// [141]  result = NewList 
_B._result=_B.newlist(_B);
// [142]  json = {58} 
_B._json="";
// [143]  affectedRows = 0 
_B._affectedrows=0;
// [144]  Return Me 
return _B;
// End Sub
};

// [148] Sub NewList As List 
_B.newlist=function() {
var _lst;
// [149]  Dim lst As List 
_lst=[];
// [150]  lst.Initialize 
_lst.length=0;
// [151]  Return lst 
return _lst;
// End Sub
};

// [154] Sub GetNextID As String 
_B.getnextid=function() {
var _nextid,_strid,_nr,_ni;
// [155]  Dim nextid As Int 
_nextid=0;
// [156]  Dim strid As String 
_strid="";
// [158]  If result.Size = 0 Then 
if (_B._result.length==0) {
// [159]  nextid = 0 
_nextid=0;
// [160]  Else 
} else {
// [161]  Dim nr As Map = result.Get(0) 
_nr=_B._result[0];
// [162]  Dim ni As String = nr.GetDefault(PrimaryKey, {59} ) 
_ni=(_nr[_B._primarykey] || "0");
// [163]  nextid = BANano.parseInt(ni) 
_nextid=parseInt(_ni);
// [164]  End If 
}
// [165]  nextid = nextid + 1 
_nextid=_nextid+1;
// [166]  strid = CStr(nextid) 
_strid=_B.cstr(_nextid,_B);
// [167]  nextid = BANano.ParseInt(nextid) 
_nextid=parseInt(_nextid);
// [168]  Return strid 
return _strid;
// End Sub
};

// [171] Sub CStr(o As Object) As String 
_B.cstr=function(_o) {
// [172]  Return {60} & o 
return ""+_o;
// End Sub
};

// [177] Public Sub Initialize(dbName As String, tblName As String, PK As String, AI As String) As BANanoSQLiteE 
_B.initialize=function(_dbname,_tblname,_pk,_ai) {
// [178]  Schema.Initialize 
_B._schema={};
// [179]  recType.Initialize 
_B._rectype={};
// [180]  Record.Initialize 
_B._record={};
// [181]  MethodName = {62} 
_B._methodname="BANanoSQLite";
// [182]  result.Initialize 
_B._result.length=0;
// [183]  command = {63} 
_B._command="";
// [184]  PrimaryKey = PK 
_B._primarykey=_pk;
// [185]  DBase = dbName 
_B._dbase=_dbname;
// [186]  TableName = tblName 
_B._tablename=_tblname;
// [187]  types.Initialize 
_B._types.length=0;
// [188]  args.Initialize 
_B._args.length=0;
// [189]  types = Null 
_B._types=null;
// [190]  args = Null 
_B._args=null;
// [191]  query = {64} 
_B._query="";
// [192]  response = {65} 
_B._response="";
// [193]  error = {66} 
_B._error="";
// [194]  affectedRows = 0 
_B._affectedrows=0;
// [195]  json = {67} 
_B._json="";
// [196]  OK = False 
_B._ok=false;
// [197]  Return Me 
return _B;
// End Sub
};

// [201] Sub SchemaClear As BANanoSQLiteE 
_B.schemaclear=function() {
// [202]  Schema.clear 
_B._schema={};
// [203]  Return Me 
return _B;
// End Sub
};

// [206] Sub SetField(fldName As String, fldValue As Object) As BANanoSQLiteE 
_B.setfield=function(_fldname,_fldvalue) {
// [207]  Record.Put(fldName, fldValue) 
_B._record[_fldname]=_fldvalue;
// [208]  Return Me 
return _B;
// End Sub
};

// [212] Sub SchemaAddBoolean(bools As List) As BANanoSQLiteE 
_B.schemaaddboolean=function(_bools) {
var _b;
// [213]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [214]  Schema.Put(b, DB_BOOL) 
_B._schema[_b]=_B._db_bool;
// [215]  Next 
}
// [216]  AddBooleans(bools) 
_B.addbooleans(_bools,_B);
// [217]  Return Me 
return _B;
// End Sub
};

// [221] Sub SchemaFromDesign(cont As VMContainer) As BANanoSQLiteE 
_B.schemafromdesign=function(_cont) {
// [222]  SchemaAddBoolean(cont.Booleans) 
_B.schemaaddboolean(_cont._booleans,_B);
// [223]  SchemaAddDate(cont.Dates) 
_B.schemaadddate(_cont._dates,_B);
// [224]  SchemaAddFloat(cont.Doubles) 
_B.schemaaddfloat(_cont._doubles,_B);
// [225]  SchemaAddInt(cont.Integers) 
_B.schemaaddint(_cont._integers,_B);
// [226]  SchemaAddText(cont.Strings) 
_B.schemaaddtext(_cont._strings,_B);
// [228]  AddStrings(cont.Strings) 
_B.addstrings(_cont._strings,_B);
// [229]  AddIntegers(cont.Integers) 
_B.addintegers(_cont._integers,_B);
// [230]  AddDoubles(cont.Doubles) 
_B.adddoubles(_cont._doubles,_B);
// [231]  AddBooleans(cont.Booleans) 
_B.addbooleans(_cont._booleans,_B);
// [232]  AddStrings(cont.Dates) 
_B.addstrings(_cont._dates,_B);
// [233]  Return Me 
return _B;
// End Sub
};

// [237] Sub SchemaAddInt(bools As List) As BANanoSQLiteE 
_B.schemaaddint=function(_bools) {
var _b;
// [238]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [239]  Schema.Put(b, DB_INTEGER) 
_B._schema[_b]=_B._db_integer;
// [240]  Next 
}
// [241]  AddIntegers(bools) 
_B.addintegers(_bools,_B);
// [242]  Return Me 
return _B;
// End Sub
};

// [245] Sub SchemaAddFloat(bools As List) As BANanoSQLiteE 
_B.schemaaddfloat=function(_bools) {
var _b;
// [246]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [247]  Schema.Put(b, DB_FLOAT) 
_B._schema[_b]=_B._db_float;
// [248]  Next 
}
// [249]  AddDoubles(bools) 
_B.adddoubles(_bools,_B);
// [250]  Return Me 
return _B;
// End Sub
};

// [253] Sub SchemaAddBlob(bools As List) As BANanoSQLiteE 
_B.schemaaddblob=function(_bools) {
var _b;
// [254]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [255]  Schema.Put(b, DB_BLOB) 
_B._schema[_b]=_B._db_blob;
// [256]  Next 
}
// [257]  AddBlobs(bools) 
_B.addblobs(_bools,_B);
// [258]  Return Me 
return _B;
// End Sub
};

// [261] Sub SchemaAddText(bools As List) As BANanoSQLiteE 
_B.schemaaddtext=function(_bools) {
var _b;
// [262]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [263]  Schema.Put(b, DB_STRING) 
_B._schema[_b]=_B._db_string;
// [264]  Next 
}
// [265]  AddStrings(bools) 
_B.addstrings(_bools,_B);
// [266]  Return Me 
return _B;
// End Sub
};

// [269] Sub SchemaCreateTable As BANanoSQLiteE 
_B.schemacreatetable=function() {
// [270]  Return CreateTable(Schema) 
return _B.createtable(_B._schema,_B);
// End Sub
};

// [273] Sub SchemaAddDate(bools As List) As BANanoSQLiteE 
_B.schemaadddate=function(_bools) {
var _b;
// [274]  For Each b As String In bools 
for (var _bindex=0;_bindex<_bools.length;_bindex++) {
_b=_bools[_bindex];
// [275]  Schema.Put(b, DB_DATE) 
_B._schema[_b]=_B._db_date;
// [276]  Next 
}
// [277]  AddStrings(bools) 
_B.addstrings(_bools,_B);
// [278]  Return Me 
return _B;
// End Sub
};

// [282] Sub Json2Map(strJSON As String) As Map 
_B.json2map=function(_strjson) {
var _jsonx,_map1;
// [283]  Dim jsonx As BANanoJSONParser 
_jsonx={};
// [284]  Dim Map1 As Map 
_map1={};
// [285]  Map1.Initialize 
_map1={};
// [286]  Map1.clear 
_map1={};
// [287]  Try 
try {
// [288]  If strJSON.length > 0 Then 
if (_strjson.length>0) {
// [289]  jsonx.Initialize(strJSON) 
_jsonx=JSON.parse(_strjson);
// [290]  Map1 = jsonx.NextObject 
_map1=_jsonx;
// [291]  End If 
}
// [292]  Return Map1 
return _map1;
// [293]  Catch 
} catch(err) {
// [294]  Return Map1 
return _map1;
// [295]  End Try 
}
// End Sub
};

// [299] Sub Map2Json(mp As Map) As String 
_B.map2json=function(_mp) {
var _jsonx;
// [300]  Dim jsonx As BANanoJSONGenerator 
_jsonx={};
// [301]  jsonx.Initialize(mp) 
_jsonx=_mp;
// [302]  Return jsonx.ToString 
return JSON.stringify(_jsonx);
// End Sub
};

// [306] Private Sub EscapeField(f As String) As String 
_B.escapefield=function(_f) {
// [307]  Return {8} 
return "[" + _f + "]";
// End Sub
};

// [311] Sub CreateDatabase As BANanoSQLiteE 
_B.createdatabase=function() {
// [312]  query = {9} 
_B._query="CREATE DATABASE IF NOT EXISTS " + _B.escapefield(_B._dbase,_B) + "";
// [313]  command = {68} 
_B._command="createdb";
// [314]  Return Me 
return _B;
// End Sub
};

// [318] Sub DropDataBase As BANanoSQLiteE 
_B.dropdatabase=function() {
// [319]  query = {10} 
_B._query="DROP DATABASE " + _B.escapefield(_B._dbase,_B) + "";
// [320]  command = {69} 
_B._command="dropdb";
// [321]  Return Me 
return _B;
// End Sub
};

// [324] Sub Execute(strSQL As String) As BANanoSQLiteE 
_B.execute=function(_strsql) {
// [325]  query = strSQL 
_B._query=_strsql;
// [326]  command = {70} 
_B._command="execute";
// [327]  Return Me 
return _B;
// End Sub
};

// [331] public Sub CreateTable(tblFields As Map) As BANanoSQLiteE 
_B.createtable=function(_tblfields) {
var _fldname,_fldtype,_fldtot,_fldcnt,_sb;
// [332]  Dim fldName As String 
_fldname="";
// [333]  Dim fldType As String 
_fldtype="";
// [334]  Dim fldTot As Int 
_fldtot=0;
// [335]  Dim fldCnt As Int 
_fldcnt=0;
// [336]  fldTot = tblFields.Size - 1 
_fldtot=Object.keys(_tblfields).length-1;
// [337]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [338]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [339]  sb.Append( {71} ) 
_sb.append("(");
// [340]  For fldCnt = 0 To fldTot 
for (_fldcnt=0;_fldcnt<=_fldtot;_fldcnt++) {
// [341]  fldName = tblFields.GetKeyAt(fldCnt) 
_fldname=banano_getB4JKeyAt(_tblfields,_fldcnt);
// [342]  fldType = tblFields.Get(fldName) 
_fldtype=_tblfields[_fldname];
// [343]  fldType = fldType.Replace( {72} , {73} ) 
_fldtype=_fldtype.split("STRING").join("TEXT");
// [344]  fldType = fldType.Replace( {74} , {75} ) 
_fldtype=_fldtype.split("TEXT").join("VARCHAR(255)");
// [345]  If fldType = DB_INT Then fldType = DB_INTEGER 
if (_fldtype==_B._db_int) {_fldtype=_B._db_integer;}
// [346]  If fldCnt > 0 Then 
if (_fldcnt>0) {
// [347]  sb.Append( {76} ) 
_sb.append(", ");
// [348]  End If 
}
// [349]  sb.Append(EscapeField(fldName)) 
_sb.append(_B.escapefield(_fldname,_B));
// [350]  sb.Append( {77} ) 
_sb.append(" ");
// [351]  sb.Append(fldType) 
_sb.append(_fldtype);
// [352]  Select Case fldType 
switch ("" + _fldtype) {
// [353]  Case {78} , {79} , {80} 
case "" + "STRING":
case "" + "TEXT":
case "" + "VARCHAR(255)":
// [354]  sb.Append( {81} ) 
_sb.append(" COLLATE NOCASE");
// [355]  End Select 
break;
}
// [356]  If fldName.EqualsIgnoreCase(PrimaryKey) Then 
if (_fldname.equalsIgnoreCase(_B._primarykey)) {
// [357]  sb.Append( {82} ) 
_sb.append(" PRIMARY KEY");
// [358]  End If 
}
// [359]  Next 
}
// [360]  sb.Append( {83} ) 
_sb.append(")");
// [362]  query = {84} & EscapeField(TableName) & {85} & sb.ToString 
_B._query="CREATE TABLE IF NOT EXISTS "+_B.escapefield(_B._tablename,_B)+" "+_sb.toString();
// [363]  command = {86} 
_B._command="createtable";
// [364]  Return Me 
return _B;
// End Sub
};

// [369] public Sub DropTable As BANanoSQLiteE 
_B.droptable=function() {
// [371]  query = {87} & EscapeField(TableName) 
_B._query="DROP TABLE "+_B.escapefield(_B._tablename,_B);
// [372]  command = {88} 
_B._command="droptable";
// [373]  Return Me 
return _B;
// End Sub
};

// [378] private Sub GetMapTypes(sourceMap As Map) As List 
_B.getmaptypes=function(_sourcemap) {
var _listoftypes,_icnt,_itot,_col,_coltype;
// [379]  Dim listOfTypes As List 
_listoftypes=[];
// [380]  listOfTypes.Initialize 
_listoftypes.length=0;
// [381]  Dim iCnt As Int 
_icnt=0;
// [382]  Dim iTot As Int 
_itot=0;
// [383]  iTot = sourceMap.Size - 1 
_itot=Object.keys(_sourcemap).length-1;
// [384]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [385]  Dim col As String = sourceMap.GetKeyAt(iCnt) 
_col=banano_getB4JKeyAt(_sourcemap,_icnt);
// [386]  Dim colType As String = recType.GetDefault(col, {89} ) 
_coltype=(_B._rectype[_col] || "STRING");
// [387]  Select Case colType 
switch ("" + _coltype) {
// [388]  Case {90} , {91} , {92} , {93} 
case "" + "INTEGER":
case "" + "INT":
case "" + "BOOL":
case "" + "BOOLEAN":
// [389]  listOfTypes.add( {94} ) 
_listoftypes.push("i");
// [390]  Case {95} 
break;
case "" + "BLOB":
// [391]  listOfTypes.add( {96} ) 
_listoftypes.push("b");
// [392]  Case {97} , {98} , {99} 
break;
case "" + "REAL":
case "" + "FLOAT":
case "" + "DOUBLE":
// [393]  listOfTypes.add( {100} ) 
_listoftypes.push("d");
// [394]  Case Else 
break;
default:
// [395]  listOfTypes.add( {101} ) 
_listoftypes.push("s");
// [396]  End Select 
break;
}
// [397]  Next 
}
// [398]  Return listOfTypes 
return _listoftypes;
// End Sub
};

// [402] private Sub GetMapType(k As String) As String 
_B.getmaptype=function(_k) {
var _coltype;
// [403]  If recType.ContainsKey(k) Then 
if ((_k in _B._rectype)) {
// [404]  Dim colType As String = recType.GetDefault(k, {102} ) 
_coltype=(_B._rectype[_k] || "STRING");
// [405]  Select Case colType 
switch ("" + _coltype) {
// [406]  Case {103} , {104} , {105} , {106} 
case "" + "INTEGER":
case "" + "INT":
case "" + "BOOL":
case "" + "BOOLEAN":
// [407]  Return {107} 
return "i";
// [408]  Case {108} 
case "" + "BLOB":
// [409]  Return {109} 
return "b";
// [410]  Case {110} , {111} , {112} 
case "" + "REAL":
case "" + "FLOAT":
case "" + "DOUBLE":
// [411]  Return {113} 
return "d";
// [412]  Case Else 
default:
// [413]  Return {114} 
return "s";
// [414]  End Select 
}
// [415]  Else 
} else {
// [416]  Return {115} 
return "s";
// [417]  End If 
}
// End Sub
};

// [421] private Sub GetMapValues(sourceMap As Map) As List 
_B.getmapvalues=function(_sourcemap) {
var _listofvalues,_icnt,_itot,_key,_value,_vtype;
// [422]  Dim listOfValues As List 
_listofvalues=[];
// [423]  listOfValues.Initialize 
_listofvalues.length=0;
// [424]  Dim iCnt As Int 
_icnt=0;
// [425]  Dim iTot As Int 
_itot=0;
// [426]  iTot = sourceMap.Size - 1 
_itot=Object.keys(_sourcemap).length-1;
// [427]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [429]  Dim key As String = sourceMap.getkeyat(iCnt) 
_key=banano_getB4JKeyAt(_sourcemap,_icnt);
// [430]  Dim value As String = sourceMap.GetValueAt(iCnt) 
_value=banano_getB4JValueAt(_sourcemap,_icnt);
// [431]  value = CStr(value) 
_value=_B.cstr(_value,_B);
// [432]  value = value.trim 
_value=_value.trim();
// [434]  Dim vtype As String = GetMapType(key) 
_vtype=_B.getmaptype(_key,_B);
// [435]  Select Case vtype 
switch ("" + _vtype) {
// [436]  Case {116} 
case "" + "i":
// [438]  If value = {117} Then value = {118} 
if (_value=="") {_value="0";}
// [439]  value = BANano.parseInt(value) 
_value=parseInt(_value);
// [440]  Case {119} 
break;
case "" + "d":
// [442]  If value = {120} Then value = {121} 
if (_value=="") {_value="0";}
// [443]  value = BANano.parsefloat(value) 
_value=parseFloat(_value);
// [444]  Case {122} , {123} 
break;
case "" + "s":
case "" + "b":
// [446]  End Select 
break;
}
// [447]  listOfValues.Add(value) 
_listofvalues.push(_value);
// [448]  Next 
}
// [449]  Return listOfValues 
return _listofvalues;
// End Sub
};

// [453] private Sub GetMapKeys(sourceMap As Map) As List 
_B.getmapkeys=function(_sourcemap) {
var _listofvalues,_icnt,_itot,_value;
// [454]  Dim listOfValues As List 
_listofvalues=[];
// [455]  listOfValues.Initialize 
_listofvalues.length=0;
// [456]  Dim iCnt As Int 
_icnt=0;
// [457]  Dim iTot As Int 
_itot=0;
// [458]  iTot = sourceMap.Size - 1 
_itot=Object.keys(_sourcemap).length-1;
// [459]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [460]  Dim value As String = sourceMap.GetKeyAt(iCnt) 
_value=banano_getB4JKeyAt(_sourcemap,_icnt);
// [461]  listOfValues.Add(value) 
_listofvalues.push(_value);
// [462]  Next 
}
// [463]  Return listOfValues 
return _listofvalues;
// End Sub
};

// [468] Sub Insert As BANanoSQLiteE 
_B.insert=function() {
// [469]  Insert1(Record) 
_B.insert1(_B._record,_B);
// [470]  Return Me 
return _B;
// End Sub
};

// [474] Sub Insert1(Rec As Map) As BANanoSQLiteE 
_B.insert1=function(_rec) {
var _sb,_columns,_values,_listofvalues,_listoftypes,_icnt,_itot,_col;
// [475]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [476]  Log( {11} ) 
console.log("BANanoSQLiteE.Insert1: '" + _B._tablename + "' schema is not set!");
// [477]  End If 
}
// [478]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [479]  Dim columns As StringBuilder 
_columns=new StringBuilder();
// [480]  Dim values As StringBuilder 
_values=new StringBuilder();
// [481]  Dim listOfValues As List = GetMapValues(Rec) 
_listofvalues=_B.getmapvalues(_rec,_B);
// [482]  Dim listOfTypes As List = GetMapTypes(Rec) 
_listoftypes=_B.getmaptypes(_rec,_B);
// [483]  Dim iCnt As Int 
_icnt=0;
// [484]  Dim iTot As Int 
_itot=0;
// [485]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [486]  columns.Initialize 
_columns.init();
_columns.isinitialized=true;
// [487]  values.Initialize 
_values.init();
_values.isinitialized=true;
// [488]  sb.Append( {12} ) 
_sb.append("INSERT INTO " + _B.escapefield(_B._tablename,_B) + " (");
// [489]  iTot = Rec.Size - 1 
_itot=Object.keys(_rec).length-1;
// [490]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [491]  Dim col As String = Rec.GetKeyAt(iCnt) 
_col=banano_getB4JKeyAt(_rec,_icnt);
// [492]  If iCnt > 0 Then 
if (_icnt>0) {
// [493]  columns.Append( {124} ) 
_columns.append(", ");
// [494]  values.Append( {125} ) 
_values.append(", ");
// [495]  End If 
}
// [496]  columns.Append(EscapeField(col)) 
_columns.append(_B.escapefield(_col,_B));
// [497]  values.Append( {126} ) 
_values.append("?");
// [498]  Next 
}
// [499]  sb.Append(columns.ToString) 
_sb.append(_columns.toString());
// [500]  sb.Append( {127} ) 
_sb.append(") VALUES (");
// [501]  sb.Append(values.ToString) 
_sb.append(_values.toString());
// [502]  sb.Append( {128} ) 
_sb.append(")");
// [503]  query = sb.ToString 
_B._query=_sb.toString();
// [504]  args = listOfValues 
_B._args=_listofvalues;
// [505]  types = listOfTypes 
_B._types=_listoftypes;
// [506]  command = {129} 
_B._command="insert";
// [507]  Return Me 
return _B;
// End Sub
};

// [513] Sub InsertReplace As BANanoSQLiteE 
_B.insertreplace=function() {
var _sb,_columns,_values,_listofvalues,_listoftypes,_icnt,_itot,_col;
// [514]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [515]  Dim columns As StringBuilder 
_columns=new StringBuilder();
// [516]  Dim values As StringBuilder 
_values=new StringBuilder();
// [517]  Dim listOfValues As List = GetMapValues(Record) 
_listofvalues=_B.getmapvalues(_B._record,_B);
// [518]  Dim listOfTypes As List = GetMapTypes(Record) 
_listoftypes=_B.getmaptypes(_B._record,_B);
// [519]  Dim iCnt As Int 
_icnt=0;
// [520]  Dim iTot As Int 
_itot=0;
// [521]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [522]  columns.Initialize 
_columns.init();
_columns.isinitialized=true;
// [523]  values.Initialize 
_values.init();
_values.isinitialized=true;
// [524]  sb.Append( {13} ) 
_sb.append("REPLACE INTO " + _B.escapefield(_B._tablename,_B) + " (");
// [525]  iTot = Record.Size - 1 
_itot=Object.keys(_B._record).length-1;
// [526]  For iCnt = 0 To iTot 
for (_icnt=0;_icnt<=_itot;_icnt++) {
// [527]  Dim col As String = Record.GetKeyAt(iCnt) 
_col=banano_getB4JKeyAt(_B._record,_icnt);
// [528]  If iCnt > 0 Then 
if (_icnt>0) {
// [529]  columns.Append( {130} ) 
_columns.append(", ");
// [530]  values.Append( {131} ) 
_values.append(", ");
// [531]  End If 
}
// [532]  columns.Append(EscapeField(col)) 
_columns.append(_B.escapefield(_col,_B));
// [533]  values.Append( {132} ) 
_values.append("?");
// [534]  Next 
}
// [535]  sb.Append(columns.ToString) 
_sb.append(_columns.toString());
// [536]  sb.Append( {133} ) 
_sb.append(") VALUES (");
// [537]  sb.Append(values.ToString) 
_sb.append(_values.toString());
// [538]  sb.Append( {134} ) 
_sb.append(")");
// [539]  query = sb.ToString 
_B._query=_sb.toString();
// [540]  args = listOfValues 
_B._args=_listofvalues;
// [541]  types = listOfTypes 
_B._types=_listoftypes;
// [542]  command = {135} 
_B._command="replace";
// [543]  Return Me 
return _B;
// End Sub
};

// [547] Sub Delete(primaryValue As String) As BANanoSQLiteE 
_B.delete=function(_primaryvalue) {
var _qw;
// [548]  Dim qw As Map = CreateMap() 
_qw={};
// [549]  qw.Put(PrimaryKey, primaryValue) 
_qw[_B._primarykey]=_primaryvalue;
// [550]  DeleteWhere(TableName, qw, Array( {136} )) 
_B.deletewhere(_B._tablename,_qw,["="],_B);
// [551]  Return Me 
return _B;
// End Sub
};

// [556] private Sub JoinFields(delimiter As String, lst As List) As String 
_B.joinfields=function(_delimiter,_lst) {
var _i,_sb,_fld;
// [557]  Dim i As Int 
_i=0;
// [558]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [559]  Dim fld As String 
_fld="";
// [560]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [561]  fld = lst.Get(0) 
_fld=_lst[0];
// [562]  fld = EscapeField(fld) 
_fld=_B.escapefield(_fld,_B);
// [563]  sb.Append(fld) 
_sb.append(_fld);
// [564]  For i = 1 To lst.size - 1 
for (_i=1;_i<=_lst.length-1;_i++) {
// [565]  Dim fld As String = lst.Get(i) 
_fld=_lst[_i];
// [566]  fld = EscapeField(fld) 
_fld=_B.escapefield(_fld,_B);
// [567]  sb.Append(delimiter).Append(fld) 
_sb.append(_delimiter).append(_fld);
// [568]  Next 
}
// [569]  Return sb.ToString 
return _sb.toString();
// End Sub
};

// [573] private Sub Join(delimiter As String, lst As List) As String 
_B.join=function(_delimiter,_lst) {
var _i,_sb,_fld;
// [574]  Dim i As Int 
_i=0;
// [575]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [576]  Dim fld As String 
_fld="";
// [577]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [578]  fld = lst.Get(0) 
_fld=_lst[0];
// [579]  sb.Append(fld) 
_sb.append(_fld);
// [580]  For i = 1 To lst.size - 1 
for (_i=1;_i<=_lst.length-1;_i++) {
// [581]  Dim fld As String = lst.Get(i) 
_fld=_lst[_i];
// [582]  sb.Append(delimiter).Append(fld) 
_sb.append(_delimiter).append(_fld);
// [583]  Next 
}
// [584]  Return sb.ToString 
return _sb.toString();
// End Sub
};

// [588] Sub Read(primaryValue As String) As BANanoSQLiteE 
_B.read=function(_primaryvalue) {
var _qw;
// [589]  Dim qw As Map = CreateMap() 
_qw={};
// [590]  qw.Put(PrimaryKey, primaryValue) 
_qw[_B._primarykey]=_primaryvalue;
// [591]  SelectWhere(TableName, Array( {137} ), qw, Null, Array(PrimaryKey)) 
_B.selectwhere(_B._tablename,["*"],_qw,null,[_B._primarykey],_B);
// [592]  Return Me 
return _B;
// End Sub
};

// [596] Sub Exists(primaryValue As String) As BANanoSQLiteE 
_B.exists=function(_primaryvalue) {
var _qw;
// [597]  Dim qw As Map = CreateMap() 
_qw={};
// [598]  qw.Put(PrimaryKey, primaryValue) 
_qw[_B._primarykey]=_primaryvalue;
// [599]  SelectWhere(TableName, Array(PrimaryKey), qw, Null, Array(PrimaryKey)) 
_B.selectwhere(_B._tablename,[_B._primarykey],_qw,null,[_B._primarykey],_B);
// [600]  Return Me 
return _B;
// End Sub
};

// [604] Sub SelectWhere(tblName As String, tblfields As List, tblWhere As Map, operators As List, orderBy As List) As BANanoSQLiteE 
_B.selectwhere=function(_tblname,_tblfields,_tblwhere,_operators,_orderby) {
var _listoftypes,_listofvalues,_fld1,_selfields,_sb,_i,_iwhere,_col,_oper,_stro;
// [605]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [606]  Log( {14} ) 
console.log("BANanoSQLiteE.SelectWhere: '" + _tblname + "' schema is not set!");
// [607]  End If 
}
// [608]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [609]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [610]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [612]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [613]  Dim selFIelds As String = {138} 
_selfields="";
// [614]  Select Case fld1 
switch ("" + _fld1) {
// [615]  Case {139} 
case "" + "*":
// [616]  selFIelds = {140} 
_selfields="*";
// [617]  Case Else 
break;
default:
// [618]  selFIelds = JoinFields( {141} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [619]  End Select 
break;
}
// [620]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [621]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [622]  sb.Append( {15} ) 
_sb.append("SELECT " + _selfields + " FROM " + _B.escapefield(_tblname,_B) + " WHERE ");
// [623]  Dim i As Int 
_i=0;
// [624]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [625]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [626]  If i > 0 Then 
if (_i>0) {
// [627]  sb.Append( {142} ) 
_sb.append(" AND ");
// [628]  End If 
}
// [629]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [630]  Dim oper As String = operators.Get(i) 
_oper=_operators[_i];
// [631]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [632]  sb.Append( {16} ) 
_sb.append(" " + _oper + " ?");
// [633]  Next 
}
// [634]  If orderBy <> Null Then 
if (_orderby!=null) {
// [636]  Dim stro As String = JoinFields( {143} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [637]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [638]  sb.Append( {144} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [639]  End If 
}
// [640]  End If 
}
// [641]  query = sb.tostring 
_B._query=_sb.toString();
// [642]  args = listOfValues 
_B._args=_listofvalues;
// [643]  types = listOfTypes 
_B._types=_listoftypes;
// [644]  command = {145} 
_B._command="select";
// [645]  Return Me 
return _B;
// End Sub
};

// [649] Sub SelectDistinctWhere(tblName As String, tblfields As List, tblWhere As Map, operators As List, orderBy As List) As BANanoSQLiteE 
_B.selectdistinctwhere=function(_tblname,_tblfields,_tblwhere,_operators,_orderby) {
var _listoftypes,_listofvalues,_fld1,_selfields,_sb,_i,_iwhere,_col,_oper,_stro;
// [650]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [651]  Log( {17} ) 
console.log("BANanoSQLiteE.SelectDistinctWhere: '" + _tblname + "' schema is not set!");
// [652]  End If 
}
// [653]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [654]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [655]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [657]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [658]  Dim selFIelds As String = {146} 
_selfields="";
// [659]  Select Case fld1 
switch ("" + _fld1) {
// [660]  Case {147} 
case "" + "*":
// [661]  selFIelds = {148} 
_selfields="*";
// [662]  Case Else 
break;
default:
// [663]  selFIelds = JoinFields( {149} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [664]  End Select 
break;
}
// [665]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [666]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [667]  sb.Append( {18} ) 
_sb.append("SELECT DISTINCT " + _selfields + " FROM " + _B.escapefield(_tblname,_B) + " WHERE ");
// [668]  Dim i As Int 
_i=0;
// [669]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [670]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [671]  If i > 0 Then 
if (_i>0) {
// [672]  sb.Append( {150} ) 
_sb.append(" AND ");
// [673]  End If 
}
// [674]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [675]  Dim oper As String = operators.Get(i) 
_oper=_operators[_i];
// [676]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [677]  sb.Append( {19} ) 
_sb.append(" " + _oper + " ?");
// [678]  Next 
}
// [679]  If orderBy <> Null Then 
if (_orderby!=null) {
// [681]  Dim stro As String = JoinFields( {151} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [682]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [683]  sb.Append( {152} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [684]  End If 
}
// [685]  End If 
}
// [686]  query = sb.tostring 
_B._query=_sb.toString();
// [687]  args = listOfValues 
_B._args=_listofvalues;
// [688]  types = listOfTypes 
_B._types=_listoftypes;
// [689]  command = {153} 
_B._command="select";
// [690]  Return Me 
return _B;
// End Sub
};

// [694] Sub DeleteAll As BANanoSQLiteE 
_B.deleteall=function() {
// [695]  query = {20} 
_B._query="DELETE FROM " + _B.escapefield(_B._tablename,_B) + "";
// [696]  command = {154} 
_B._command="delete";
// [697]  Return Me 
return _B;
// End Sub
};

// [700] private Sub EQOperators(sm As Map) As List 'ignore 
_B.eqoperators=function(_sm) {
var _nl,_k;
// [701]  Dim nl As List 
_nl=[];
// [702]  nl.initialize 
_nl.length=0;
// [703]  For Each k As String In sm.Keys 
var _kKeys = Object.keys(_sm);
for (var _kindex=0;_kindex<_kKeys.length;_kindex++) {
_k=_kKeys[_kindex];
// [704]  nl.Add( {155} ) 
_nl.push("=");
// [705]  Next 
}
// [706]  Return nl 
return _nl;
// End Sub
};

// [711] Sub DeleteWhere(tblName As String, tblWhere As Map, operators As List) As BANanoSQLiteE 
_B.deletewhere=function(_tblname,_tblwhere,_operators) {
var _listoftypes,_listofvalues,_sb,_i,_iwhere,_col,_opr;
// [712]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [713]  Log( {21} ) 
console.log("BANanoSQLiteE.DeleteWhere: '" + _tblname + "' schema is not set!");
// [714]  End If 
}
// [715]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [716]  Dim listOfTypes As List = GetMapTypes(tblWhere) 
_listoftypes=_B.getmaptypes(_tblwhere,_B);
// [717]  Dim listOfValues As List = GetMapValues(tblWhere) 
_listofvalues=_B.getmapvalues(_tblwhere,_B);
// [718]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [719]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [720]  sb.Append( {22} ) 
_sb.append("DELETE FROM " + _B.escapefield(_tblname,_B) + " WHERE ");
// [721]  Dim i As Int 
_i=0;
// [722]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [723]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [724]  If i > 0 Then 
if (_i>0) {
// [725]  sb.Append( {156} ) 
_sb.append(" AND ");
// [726]  End If 
}
// [727]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [728]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [729]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [730]  sb.Append( {23} ) 
_sb.append(" " + _opr + " ?");
// [731]  Next 
}
// [732]  query = sb.tostring 
_B._query=_sb.toString();
// [733]  args = listOfValues 
_B._args=_listofvalues;
// [734]  types = listOfTypes 
_B._types=_listoftypes;
// [735]  command = {157} 
_B._command="delete";
// [736]  Return Me 
return _B;
// End Sub
};

// [741] Sub SelectAll(tblfields As List, orderBy As List) As BANanoSQLiteE 
_B.selectall=function(_tblfields,_orderby) {
var _fld1,_selfields,_sb,_stro;
// [743]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [744]  Dim selFIelds As String = {158} 
_selfields="";
// [745]  Select Case fld1 
switch ("" + _fld1) {
// [746]  Case {159} 
case "" + "*":
// [747]  selFIelds = {160} 
_selfields="*";
// [748]  Case Else 
break;
default:
// [749]  selFIelds = JoinFields( {161} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [750]  End Select 
break;
}
// [751]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [752]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [753]  sb.Append( {24} ) 
_sb.append("SELECT " + _selfields + " FROM " + _B.escapefield(_B._tablename,_B) + "");
// [754]  If orderBy <> Null Then 
if (_orderby!=null) {
// [756]  Dim stro As String = JoinFields( {162} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [757]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [758]  sb.Append( {163} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [759]  End If 
}
// [760]  End If 
}
// [761]  query = sb.tostring 
_B._query=_sb.toString();
// [762]  command = {164} 
_B._command="select";
// [763]  Return Me 
return _B;
// End Sub
};

// [767] Sub SelectDistinctAll(tblfields As List, orderBy As List) As BANanoSQLiteE 
_B.selectdistinctall=function(_tblfields,_orderby) {
var _fld1,_selfields,_sb,_stro;
// [769]  Dim fld1 As String = tblfields.Get(0) 
_fld1=_tblfields[0];
// [770]  Dim selFIelds As String = {165} 
_selfields="";
// [771]  Select Case fld1 
switch ("" + _fld1) {
// [772]  Case {166} 
case "" + "*":
// [773]  selFIelds = {167} 
_selfields="*";
// [774]  Case Else 
break;
default:
// [775]  selFIelds = JoinFields( {168} , tblfields) 
_selfields=_B.joinfields(",",_tblfields,_B);
// [776]  End Select 
break;
}
// [777]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [778]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [779]  sb.Append( {25} ) 
_sb.append("SELECT DISTINCT " + _selfields + " FROM " + _B.escapefield(_B._tablename,_B) + "");
// [780]  If orderBy <> Null Then 
if (_orderby!=null) {
// [782]  Dim stro As String = JoinFields( {169} , orderBy) 
_stro=_B.joinfields(",",_orderby,_B);
// [783]  If stro.Length > 0 Then 
if (_stro.length>0) {
// [784]  sb.Append( {170} ).Append(stro) 
_sb.append(" ORDER BY ").append(_stro);
// [785]  End If 
}
// [786]  End If 
}
// [787]  query = sb.tostring 
_B._query=_sb.toString();
// [788]  command = {171} 
_B._command="select";
// [789]  Return Me 
return _B;
// End Sub
};

// [792] Sub Build As Map 
_B.build=function() {
var _b;
// [793]  Dim b As Map = CreateMap() 
_b={};
// [794]  b.Put( {172} , DBase) 
_b["dbname"]=_B._dbase;
// [795]  b.Put( {173} , command) 
_b["command"]=_B._command;
// [796]  b.Put( {174} , query) 
_b["query"]=_B._query;
// [797]  b.Put( {175} , args) 
_b["args"]=_B._args;
// [798]  b.Put( {176} , types) 
_b["types"]=_B._types;
// [799]  Return b 
return _b;
// End Sub
};

// [803] private Sub AddStrings(fieldNames As List) As BANanoSQLiteE 
_B.addstrings=function(_fieldnames) {
var _strfld;
// [804]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [805]  recType.Put(strfld, {177} ) 
_B._rectype[_strfld]="STRING";
// [806]  Next 
}
// [807]  Return Me 
return _B;
// End Sub
};

// [811] private Sub AddIntegers(fieldNames As List) As BANanoSQLiteE 
_B.addintegers=function(_fieldnames) {
var _strfld;
// [812]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [813]  recType.Put(strfld, {178} ) 
_B._rectype[_strfld]="INT";
// [814]  Next 
}
// [815]  Return Me 
return _B;
// End Sub
};

// [819] private Sub AddDoubles(fieldNames As List) As BANanoSQLiteE 
_B.adddoubles=function(_fieldnames) {
var _strfld;
// [820]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [821]  recType.Put(strfld, {179} ) 
_B._rectype[_strfld]="DOUBLE";
// [822]  Next 
}
// [823]  Return Me 
return _B;
// End Sub
};

// [827] private Sub AddBooleans(fieldNames As List) As BANanoSQLiteE 
_B.addbooleans=function(_fieldnames) {
var _strfld;
// [828]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [829]  recType.Put(strfld, {180} ) 
_B._rectype[_strfld]="BOOL";
// [830]  Next 
}
// [831]  Return Me 
return _B;
// End Sub
};

// [834] Sub FirstRecord As Map 
_B.firstrecord=function() {
var _rec;
// [835]  Dim rec As Map = result.Get(0) 
_rec=_B._result[0];
// [836]  Return rec 
return _rec;
// End Sub
};

// [840] private Sub AddBlobs(fieldNames As List) As BANanoSQLiteE 
_B.addblobs=function(_fieldnames) {
var _strfld;
// [841]  For Each strfld As String In fieldNames 
for (var _strfldindex=0;_strfldindex<_fieldnames.length;_strfldindex++) {
_strfld=_fieldnames[_strfldindex];
// [842]  recType.Put(strfld, {181} ) 
_B._rectype[_strfld]="BLOB";
// [843]  Next 
}
// [844]  Return Me 
return _B;
// End Sub
};

// [847] Sub Update(priValue As String) As BANanoSQLiteE 
_B.update=function(_privalue) {
var _tblwhere;
// [848]  Dim tblWhere As Map = CreateMap() 
_tblwhere={};
// [849]  tblWhere.Put(PrimaryKey, priValue) 
_tblwhere[_B._primarykey]=_privalue;
// [850]  UpdateWhere(TableName, Record, tblWhere, Null) 
_B.updatewhere(_B._tablename,_B._record,_tblwhere,null,_B);
// [851]  Return Me 
return _B;
// End Sub
};

// [854] Sub Update1(Rec As Map, priValue As String) As BANanoSQLiteE 
_B.update1=function(_rec,_privalue) {
var _tblwhere;
// [855]  Record = Rec 
_B._record=_rec;
// [856]  Dim tblWhere As Map = CreateMap() 
_tblwhere={};
// [857]  tblWhere.Put(PrimaryKey, priValue) 
_tblwhere[_B._primarykey]=_privalue;
// [858]  UpdateWhere(TableName, Rec, tblWhere, Null) 
_B.updatewhere(_B._tablename,_rec,_tblwhere,null,_B);
// [859]  Return Me 
return _B;
// End Sub
};

// [863] Sub UpdateWhere(tblName As String, tblfields As Map, tblWhere As Map, operators As List) As BANanoSQLiteE 
_B.updatewhere=function(_tblname,_tblfields,_tblwhere,_operators) {
var _listoftypes,_listoftypes1,_listofvalues,_listofvalues1,_sb,_i,_itot,_col,_iwhere,_opr;
// [864]  If Schema.Size = 0 Then 
if (Object.keys(_B._schema).length==0) {
// [865]  Log( {26} ) 
console.log("BANanoSQLiteE.UpdateWhere: '" + _tblname + "' schema is not set!");
// [866]  End If 
}
// [867]  If operators = Null Then operators = EQOperators(tblWhere) 
if (_operators==null) {_operators=_B.eqoperators(_tblwhere,_B);}
// [868]  Dim listOfTypes As List = GetMapTypes(tblfields) 
_listoftypes=_B.getmaptypes(_tblfields,_B);
// [869]  Dim listOfTypes1 As List = GetMapTypes(tblWhere) 
_listoftypes1=_B.getmaptypes(_tblwhere,_B);
// [870]  listOfTypes.AddAll(listOfTypes1) 
_listoftypes.splice(_listoftypes.length,0,..._listoftypes1);
// [871]  Dim listOfValues As List = GetMapValues(tblfields) 
_listofvalues=_B.getmapvalues(_tblfields,_B);
// [872]  Dim listOfValues1 As List = GetMapValues(tblWhere) 
_listofvalues1=_B.getmapvalues(_tblwhere,_B);
// [873]  listOfValues.AddAll(listOfValues1) 
_listofvalues.splice(_listofvalues.length,0,..._listofvalues1);
// [874]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [875]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [876]  sb.Append( {27} ) 
_sb.append("UPDATE " + _B.escapefield(_tblname,_B) + " SET ");
// [877]  Dim i As Int 
_i=0;
// [878]  Dim iTot As Int = tblfields.Size - 1 
_itot=Object.keys(_tblfields).length-1;
// [879]  For i = 0 To iTot 
for (_i=0;_i<=_itot;_i++) {
// [880]  Dim col As String = tblfields.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblfields,_i);
// [881]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [882]  If i <> iTot Then 
if (_i!=_itot) {
// [883]  sb.Append( {182} ) 
_sb.append("= ?,");
// [884]  Else 
} else {
// [885]  sb.Append( {183} ) 
_sb.append("= ?");
// [886]  End If 
}
// [887]  Next 
}
// [888]  sb.Append( {28} ) 
_sb.append(" WHERE ");
// [889]  Dim iWhere As Int = tblWhere.Size - 1 
_iwhere=Object.keys(_tblwhere).length-1;
// [890]  For i = 0 To iWhere 
for (_i=0;_i<=_iwhere;_i++) {
// [891]  If i > 0 Then 
if (_i>0) {
// [892]  sb.Append( {184} ) 
_sb.append(" AND ");
// [893]  End If 
}
// [894]  Dim col As String = tblWhere.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblwhere,_i);
// [895]  sb.Append(EscapeField(col)) 
_sb.append(_B.escapefield(_col,_B));
// [896]  Dim opr As String = operators.Get(i) 
_opr=_operators[_i];
// [897]  sb.Append( {29} ) 
_sb.append(" " + _opr + " ?");
// [898]  Next 
}
// [899]  query = sb.tostring 
_B._query=_sb.toString();
// [900]  args = listOfValues 
_B._args=_listofvalues;
// [901]  types = listOfTypes 
_B._types=_listoftypes;
// [902]  command = {185} 
_B._command="update";
// [903]  Return Me 
return _B;
// End Sub
};

// [908] Sub UpdateAll(tblFields As Map, operators As List) As BANanoSQLiteE 
_B.updateall=function(_tblfields,_operators) {
var _listoftypes,_listofvalues,_sb,_i,_itot,_col,_oper;
// [909]  If operators = Null Then operators = EQOperators(tblFields) 
if (_operators==null) {_operators=_B.eqoperators(_tblfields,_B);}
// [910]  Dim listOfTypes As List = GetMapTypes(tblFields) 
_listoftypes=_B.getmaptypes(_tblfields,_B);
// [911]  Dim listOfValues As List = GetMapValues(tblFields) 
_listofvalues=_B.getmapvalues(_tblfields,_B);
// [912]  Dim sb As StringBuilder 
_sb=new StringBuilder();
// [913]  sb.Initialize 
_sb.init();
_sb.isinitialized=true;
// [914]  sb.Append( {30} ) 
_sb.append("UPDATE " + _B.escapefield(_B._tablename,_B) + " SET ");
// [915]  Dim i As Int 
_i=0;
// [916]  Dim iTot As Int = tblFields.Size - 1 
_itot=Object.keys(_tblfields).length-1;
// [917]  For i = 0 To iTot 
for (_i=0;_i<=_itot;_i++) {
// [918]  Dim col As String = tblFields.GetKeyAt(i) 
_col=banano_getB4JKeyAt(_tblfields,_i);
// [919]  Dim oper As String = operators.Get(i) 
_oper=_operators[_i];
// [920]  sb.Append(col) 
_sb.append(_col);
// [921]  If i <> iTot Then 
if (_i!=_itot) {
// [922]  sb.Append( {186} ) 
_sb.append(" = ?,");
// [923]  Else 
} else {
// [924]  sb.Append( {31} ) 
_sb.append(" " + _oper + " ?");
// [925]  End If 
}
// [926]  Next 
}
// [927]  query = sb.tostring 
_B._query=_sb.toString();
// [928]  args = listOfValues 
_B._args=_listofvalues;
// [929]  types = listOfTypes 
_B._types=_listoftypes;
// [930]  command = {187} 
_B._command="update";
// [931]  Return Me 
return _B;
// End Sub
};

// [936] Sub FromJSON As BANanoSQLiteE 
_B.fromjson=function() {
var _m;
// [937]  OK = False 
_B._ok=false;
// [938]  If json.StartsWith( {188} ) Or json.Startswith( {189} ) Then 
if (_B._json.startsWith("{") || _B._json.startsWith("[")) {
// [939]  Dim m As Map = BANano.FromJson(json) 
_m=JSON.parse(_B._json);
// [940]  response = m.Get( {190} ) 
_B._response=_m["response"];
// [941]  error = m.Get( {191} ) 
_B._error=_m["error"];
// [942]  result = m.Get( {192} ) 
_B._result=_m["result"];
// [943]  affectedRows = m.Get( {193} ) 
_B._affectedrows=_m["affectedRows"];
// [944]  If response = {194} Then 
if (_B._response=="Success") {
// [945]  OK = True 
_B._ok=true;
// [946]  End If 
}
// [947]  Else 
} else {
// [948]  response = json 
_B._response=_B._json;
// [949]  error = json 
_B._error=_B._json;
// [950]  result = NewList 
_B._result=_B.newlist(_B);
// [951]  affectedRows = -1 
_B._affectedrows=-1;
// [952]  OK = False 
_B._ok=false;
// [953]  End If 
}
// [954]  Return Me 
return _B;
// End Sub
};

}
