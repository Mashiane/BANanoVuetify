package b4j.example;


import anywheresoftware.b4a.BA;

public class bananoshared extends Object{
public static bananoshared mostCurrent = new bananoshared();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananoshared", null);
		ba.loadHtSubs(bananoshared.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.bananoshared", ba);
		}
	}
    public static Class<?> getObject() {
		return bananoshared.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static String[] _unitwords = null;
public static String[] _tenwords = null;
public static String[] _thousandwords = null;
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
public static class _fileobject{
public boolean IsInitialized;
public String FileName;
public String FileDate;
public long FileSize;
public String FileType;
public void Initialize() {
IsInitialized = true;
FileName = "";
FileDate = "";
FileSize = 0L;
FileType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static String  _aftertodayrg(long _dvariance) throws Exception{
 //BA.debugLineNum = 1883;BA.debugLine="public Sub AfterTodayRG(dVariance As Long) As Stri";
 //BA.debugLineNum = 1884;BA.debugLine="If dVariance <= 0 Then";
if (_dvariance<=0) { 
 //BA.debugLineNum = 1885;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else if(_dvariance>0) { 
 //BA.debugLineNum = 1887;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else {
 //BA.debugLineNum = 1889;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 };
 //BA.debugLineNum = 1891;BA.debugLine="End Sub";
return "";
}
public static long  _age(String _sdob) throws Exception{
long _ldob = 0L;
long _diff = 0L;
long _tpd = 0L;
long _p1 = 0L;
long _p2 = 0L;
 //BA.debugLineNum = 2312;BA.debugLine="Sub Age(sdob As String) As Long";
 //BA.debugLineNum = 2313;BA.debugLine="DateTime.dateformat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 2314;BA.debugLine="Dim ldob As Long = DateTime.DateParse(sdob)";
_ldob = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_sdob);
 //BA.debugLineNum = 2315;BA.debugLine="Dim diff As Long = DateTime.now - ldob";
_diff = (long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()-_ldob);
 //BA.debugLineNum = 2316;BA.debugLine="Dim tpd As Long = DateTime.TicksPerDay";
_tpd = anywheresoftware.b4a.keywords.Common.DateTime.TicksPerDay;
 //BA.debugLineNum = 2317;BA.debugLine="Dim p1 As Long = diff / tpd";
_p1 = (long) (_diff/(double)_tpd);
 //BA.debugLineNum = 2318;BA.debugLine="Dim p2 As Long = p1 / 365";
_p2 = (long) (_p1/(double)365);
 //BA.debugLineNum = 2319;BA.debugLine="p2 = NumberFormat(p2,0,0)";
_p2 = (long)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat(_p2,(int) (0),(int) (0))));
 //BA.debugLineNum = 2320;BA.debugLine="Return p2";
if (true) return _p2;
 //BA.debugLineNum = 2321;BA.debugLine="End Sub";
return 0L;
}
public static String  _alpha(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 905;BA.debugLine="Public Sub Alpha(value As String) As String";
 //BA.debugLineNum = 906;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 907;BA.debugLine="Try";
try { //BA.debugLineNum = 908;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 909;BA.debugLine="If value = \"\" Then value = \"\"";
if ((_value).equals("")) { 
_value = "";};
 //BA.debugLineNum = 910;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 911;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 912;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 913;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 914;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 915;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 916;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
if (_instr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ",_mout)!=-1) { 
 //BA.debugLineNum = 917;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 920;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 922;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 924;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _audittrail(anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _df = null;
String _k = "";
Object _v = null;
Object _nv = null;
Object _ov = null;
 //BA.debugLineNum = 1559;BA.debugLine="Sub AuditTrail(oldM As Map, newM As Map) As Map";
 //BA.debugLineNum = 1560;BA.debugLine="Dim df As Map = CreateMap()";
_df = new anywheresoftware.b4a.objects.collections.Map();
_df = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1561;BA.debugLine="For Each k As String In oldM.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _oldm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1562;BA.debugLine="Dim v As Object = oldM.Get(k)";
_v = _oldm.Get((Object)(_k));
 //BA.debugLineNum = 1563;BA.debugLine="If newM.ContainsKey(k) Then";
if (_newm.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1564;BA.debugLine="Dim nv As Object = newM.Get(k)";
_nv = _newm.Get((Object)(_k));
 //BA.debugLineNum = 1565;BA.debugLine="If v <> nv Then";
if ((_v).equals(_nv) == false) { 
 //BA.debugLineNum = 1566;BA.debugLine="df.Put(k, nv)";
_df.Put((Object)(_k),_nv);
 };
 };
 }
};
 //BA.debugLineNum = 1570;BA.debugLine="For Each k As String In newM.Keys";
{
final anywheresoftware.b4a.BA.IterableList group11 = _newm.Keys();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_k = BA.ObjectToString(group11.Get(index11));
 //BA.debugLineNum = 1571;BA.debugLine="Dim v As Object = newM.Get(k)";
_v = _newm.Get((Object)(_k));
 //BA.debugLineNum = 1572;BA.debugLine="If oldM.ContainsKey(k) Then";
if (_oldm.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1573;BA.debugLine="Dim ov As Object = oldM.Get(k)";
_ov = _oldm.Get((Object)(_k));
 //BA.debugLineNum = 1574;BA.debugLine="If v <> ov Then";
if ((_v).equals(_ov) == false) { 
 //BA.debugLineNum = 1575;BA.debugLine="df.Put(k, v)";
_df.Put((Object)(_k),_v);
 };
 }else {
 //BA.debugLineNum = 1578;BA.debugLine="df.Put(k, v)";
_df.Put((Object)(_k),_v);
 };
 }
};
 //BA.debugLineNum = 1581;BA.debugLine="Return df";
if (true) return _df;
 //BA.debugLineNum = 1582;BA.debugLine="End Sub";
return null;
}
public static String  _beautifyname(String _idname) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _ls = null;
int _slen = 0;
int _i = 0;
String _mout = "";
String _sname = "";
 //BA.debugLineNum = 176;BA.debugLine="Sub BeautifyName(idName As String) As String";
 //BA.debugLineNum = 177;BA.debugLine="idName = idName.trim";
_idname = _idname.trim();
 //BA.debugLineNum = 178;BA.debugLine="If idName = \"\" Then Return \"\"";
if ((_idname).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 179;BA.debugLine="Dim ls As StringBuilder";
_ls = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 180;BA.debugLine="ls.Initialize";
_ls.Initialize();
 //BA.debugLineNum = 181;BA.debugLine="Dim slen As Int = idName.Length";
_slen = _idname.length();
 //BA.debugLineNum = 182;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 183;BA.debugLine="For i = 0 To slen - 1";
{
final int step7 = 1;
final int limit7 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 184;BA.debugLine="Dim mout As String = idName.CharAt(i)";
_mout = BA.ObjectToString(_idname.charAt(_i));
 //BA.debugLineNum = 185;BA.debugLine="If \"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQR";
if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(_mout)==-1) { 
 //BA.debugLineNum = 186;BA.debugLine="ls.Append(\"-\")";
_ls.Append("-");
 }else {
 //BA.debugLineNum = 188;BA.debugLine="ls.Append(mout)";
_ls.Append(_mout);
 };
 }
};
 //BA.debugLineNum = 191;BA.debugLine="Dim sname As String = ls.tostring";
_sname = _ls.ToString();
 //BA.debugLineNum = 192;BA.debugLine="sname = ProperSubName(sname, False)";
_sname = _propersubname(_sname,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 193;BA.debugLine="Return sname";
if (true) return _sname;
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public static String  _beautifysourcecode(String _slang,String _sc) throws Exception{
String _res = "";
 //BA.debugLineNum = 549;BA.debugLine="Sub BeautifySourceCode(slang As String, sc As Stri";
 //BA.debugLineNum = 550;BA.debugLine="Select Case slang";
switch (BA.switchObjectToInt(_slang,"js","css","html")) {
case 0: {
 //BA.debugLineNum = 552;BA.debugLine="Dim res As String = BANano.RunJavascriptMethod(\"";
_res = BA.ObjectToString(_banano.RunJavascriptMethod("js_beautify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sc)})));
 break; }
case 1: {
 //BA.debugLineNum = 554;BA.debugLine="Dim res As String = BANano.RunJavascriptMethod(\"";
_res = BA.ObjectToString(_banano.RunJavascriptMethod("css_beautify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sc)})));
 break; }
case 2: {
 //BA.debugLineNum = 556;BA.debugLine="Dim res As String = BANano.RunJavascriptMethod(\"";
_res = BA.ObjectToString(_banano.RunJavascriptMethod("html_beautify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sc)})));
 break; }
}
;
 //BA.debugLineNum = 558;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 559;BA.debugLine="End Sub";
return "";
}
public static String  _br() throws Exception{
 //BA.debugLineNum = 1461;BA.debugLine="Sub BR As String";
 //BA.debugLineNum = 1462;BA.debugLine="Return \"<br>\"";
if (true) return "<br>";
 //BA.debugLineNum = 1463;BA.debugLine="End Sub";
return "";
}
public static String  _buildattributes(anywheresoftware.b4a.objects.collections.Map _properties) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbx = null;
String _k = "";
String _v = "";
 //BA.debugLineNum = 382;BA.debugLine="Sub BuildAttributes(properties As Map) As String";
 //BA.debugLineNum = 383;BA.debugLine="If properties.ContainsKey(\"tagname\") Then";
if (_properties.ContainsKey((Object)("tagname"))) { 
 //BA.debugLineNum = 384;BA.debugLine="properties.remove(\"tagname\")";
_properties.Remove((Object)("tagname"));
 };
 //BA.debugLineNum = 386;BA.debugLine="Dim sbx As StringBuilder";
_sbx = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 387;BA.debugLine="sbx.Initialize";
_sbx.Initialize();
 //BA.debugLineNum = 388;BA.debugLine="For Each k As String In properties.keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _properties.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 389;BA.debugLine="Dim v As String = properties.get(k)";
_v = BA.ObjectToString(_properties.Get((Object)(_k)));
 //BA.debugLineNum = 390;BA.debugLine="If BANano.IsUndefined(v) Then v = \"\"";
if (_banano.IsUndefined((Object)(_v))) { 
_v = "";};
 //BA.debugLineNum = 391;BA.debugLine="If BANano.IsNull(v) Then v = \"\"";
if (_banano.IsNull((Object)(_v))) { 
_v = "";};
 //BA.debugLineNum = 392;BA.debugLine="If BANano.IsBoolean(v) Then";
if (_banano.IsBoolean((Object)(_v))) { 
 //BA.debugLineNum = 393;BA.debugLine="sbx.Append($\"${k}=\"${v}\" \"$)";
_sbx.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_k))+"=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_v))+"\" "));
 }else {
 //BA.debugLineNum = 395;BA.debugLine="k = k.trim";
_k = _k.trim();
 //BA.debugLineNum = 396;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 397;BA.debugLine="If k = \"\" Then Continue";
if ((_k).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 398;BA.debugLine="If v = \"\" Then Continue";
if ((_v).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 399;BA.debugLine="sbx.Append($\"${k}=\"${v}\" \"$)";
_sbx.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_k))+"=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_v))+"\" "));
 };
 }
};
 //BA.debugLineNum = 402;BA.debugLine="Return sbx.tostring";
if (true) return _sbx.ToString();
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _buildemail(String _sfrom,String _sto,String _scc,String _ssubject,String _smsg) throws Exception{
anywheresoftware.b4a.objects.collections.Map _se = null;
 //BA.debugLineNum = 39;BA.debugLine="Sub BuildEmail(sfrom As String, sto As String, scc";
 //BA.debugLineNum = 40;BA.debugLine="Dim se As Map = CreateMap(\"from\":sfrom, \"to\":sto,";
_se = new anywheresoftware.b4a.objects.collections.Map();
_se = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("from"),(Object)(_sfrom),(Object)("to"),(Object)(_sto),(Object)("cc"),(Object)(_scc),(Object)("subject"),(Object)(_ssubject),(Object)("msg"),(Object)(_smsg)});
 //BA.debugLineNum = 41;BA.debugLine="Return se";
if (true) return _se;
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public static String  _buildstyle(anywheresoftware.b4a.objects.collections.Map _styles) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbx = null;
String _k = "";
String _v = "";
 //BA.debugLineNum = 366;BA.debugLine="Sub BuildStyle(styles As Map) As String";
 //BA.debugLineNum = 367;BA.debugLine="Dim sbx As StringBuilder";
_sbx = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 368;BA.debugLine="sbx.Initialize";
_sbx.Initialize();
 //BA.debugLineNum = 369;BA.debugLine="For Each k As String In styles.keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _styles.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 370;BA.debugLine="Dim v As String = styles.get(k)";
_v = BA.ObjectToString(_styles.Get((Object)(_k)));
 //BA.debugLineNum = 371;BA.debugLine="If BANano.IsUndefined(v) Then v = \"\"";
if (_banano.IsUndefined((Object)(_v))) { 
_v = "";};
 //BA.debugLineNum = 372;BA.debugLine="If BANano.IsNull(v) Then v = \"\"";
if (_banano.IsNull((Object)(_v))) { 
_v = "";};
 //BA.debugLineNum = 373;BA.debugLine="k = k.trim";
_k = _k.trim();
 //BA.debugLineNum = 374;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 375;BA.debugLine="If k = \"\" Then Continue";
if ((_k).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 376;BA.debugLine="If v = \"\" Then Continue";
if ((_v).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 377;BA.debugLine="sbx.Append($\"${k}:${v};\"$)";
_sbx.Append((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_k))+":"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_v))+";"));
 }
};
 //BA.debugLineNum = 379;BA.debugLine="Return sbx.tostring";
if (true) return _sbx.ToString();
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return "";
}
public static String  _capitalize(String _t) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub Capitalize(t As String) As String";
 //BA.debugLineNum = 215;BA.debugLine="Return ProperCase(t)";
if (true) return _propercase(_t);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return "";
}
public static double  _cdbl(String _value) throws Exception{
double _out = 0;
 //BA.debugLineNum = 780;BA.debugLine="Public Sub CDbl(value As String) As Double";
 //BA.debugLineNum = 781;BA.debugLine="Try";
try { //BA.debugLineNum = 782;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 783;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 784;BA.debugLine="value = value.Replace(\",\",\"\")";
_value = _value.replace(",","");
 //BA.debugLineNum = 785;BA.debugLine="Dim out As Double = NumberFormat2(value,0,2,2,Fa";
_out = (double)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_value)),(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)));
 //BA.debugLineNum = 786;BA.debugLine="Return out";
if (true) return _out;
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 788;BA.debugLine="Return value";
if (true) return (double)(Double.parseDouble(_value));
 };
 //BA.debugLineNum = 790;BA.debugLine="End Sub";
return 0;
}
public static int  _cint(Object _o) throws Exception{
 //BA.debugLineNum = 1038;BA.debugLine="Sub CInt(o As Object) As Int";
 //BA.debugLineNum = 1039;BA.debugLine="Return Floor(o)";
if (true) return (int) (anywheresoftware.b4a.keywords.Common.Floor((double)(BA.ObjectToNumber(_o))));
 //BA.debugLineNum = 1040;BA.debugLine="End Sub";
return 0;
}
public static String  _clearinterval(Object _interval) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub ClearInterval(interval As Object)";
 //BA.debugLineNum = 85;BA.debugLine="BANano.Window.ClearInterval(interval)";
_banano.Window().ClearInterval(_interval);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static long  _clng(Object _o) throws Exception{
 //BA.debugLineNum = 1034;BA.debugLine="Sub CLng(o As Object) As Long";
 //BA.debugLineNum = 1035;BA.debugLine="Return Floor(o)";
if (true) return (long) (anywheresoftware.b4a.keywords.Common.Floor((double)(BA.ObjectToNumber(_o))));
 //BA.debugLineNum = 1036;BA.debugLine="End Sub";
return 0L;
}
public static anywheresoftware.b4a.objects.collections.Map  _copymap(anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1619;BA.debugLine="Sub CopyMap(source As Map, keys As List) As Map";
 //BA.debugLineNum = 1620;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1621;BA.debugLine="If keys.Get(0) = \"*\" Then";
if ((_keys.Get((int) (0))).equals((Object)("*"))) { 
 //BA.debugLineNum = 1622;BA.debugLine="For Each k As String In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _source.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1623;BA.debugLine="Dim v As Object = source.Get(k)";
_v = _source.Get((Object)(_k));
 //BA.debugLineNum = 1624;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 }else {
 //BA.debugLineNum = 1627;BA.debugLine="For Each k As String In keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _keys;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_k = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 1628;BA.debugLine="Dim v As Object = source.Get(k)";
_v = _source.Get((Object)(_k));
 //BA.debugLineNum = 1629;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 };
 //BA.debugLineNum = 1632;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1633;BA.debugLine="End Sub";
return null;
}
public static String  _correctname(String _oldname) throws Exception{
String _strname = "";
 //BA.debugLineNum = 246;BA.debugLine="Sub CorrectName(oldName As String) As String";
 //BA.debugLineNum = 247;BA.debugLine="Dim strName As String = StringBreakAtUpperCase(ol";
_strname = _stringbreakatuppercase(_oldname);
 //BA.debugLineNum = 248;BA.debugLine="strName = strName.replace(\" \", \"-\")";
_strname = _strname.replace(" ","-");
 //BA.debugLineNum = 249;BA.debugLine="strName = strName.tolowercase";
_strname = _strname.toLowerCase();
 //BA.debugLineNum = 250;BA.debugLine="Return strName";
if (true) return _strname;
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _createlist(String _delimiter,String _values) throws Exception{
anywheresoftware.b4a.objects.collections.List _newlst = null;
anywheresoftware.b4a.objects.collections.List _spv = null;
 //BA.debugLineNum = 1793;BA.debugLine="Sub CreateList(Delimiter As String, Values As Stri";
 //BA.debugLineNum = 1794;BA.debugLine="Dim newLst As List";
_newlst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1795;BA.debugLine="newLst.Initialize";
_newlst.Initialize();
 //BA.debugLineNum = 1796;BA.debugLine="If Values.length > 0 Then";
if (_values.length()>0) { 
 //BA.debugLineNum = 1797;BA.debugLine="Dim spV As List = StrParse(Delimiter,Values)";
_spv = new anywheresoftware.b4a.objects.collections.List();
_spv = _strparse(_delimiter,_values);
 //BA.debugLineNum = 1798;BA.debugLine="newLst.AddAll(spV)";
_newlst.AddAll(_spv);
 };
 //BA.debugLineNum = 1800;BA.debugLine="Return newLst";
if (true) return _newlst;
 //BA.debugLineNum = 1801;BA.debugLine="End Sub";
return null;
}
public static String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 1671;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 1672;BA.debugLine="If o = BANano.UNDEFINED Then o = \"\"";
if ((_o).equals(_banano.UNDEFINED())) { 
_o = (Object)("");};
 //BA.debugLineNum = 1673;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 1674;BA.debugLine="End Sub";
return "";
}
public static String  _datatype2fieldtype(String _fldtype) throws Exception{
 //BA.debugLineNum = 2386;BA.debugLine="Sub DataType2FieldType(fldtype As String) As Strin";
 //BA.debugLineNum = 2387;BA.debugLine="fldtype = fldtype.ToUpperCase";
_fldtype = _fldtype.toUpperCase();
 //BA.debugLineNum = 2388;BA.debugLine="If fldtype.EqualsIgnoreCase(\"double\") Then fldtyp";
if (_fldtype.equalsIgnoreCase("double")) { 
_fldtype = "FLOAT";};
 //BA.debugLineNum = 2389;BA.debugLine="If fldtype.EqualsIgnoreCase(\"integer\") Then fldty";
if (_fldtype.equalsIgnoreCase("integer")) { 
_fldtype = "INT";};
 //BA.debugLineNum = 2390;BA.debugLine="If fldtype.EqualsIgnoreCase(\"long\") Then fldtype";
if (_fldtype.equalsIgnoreCase("long")) { 
_fldtype = "INT";};
 //BA.debugLineNum = 2391;BA.debugLine="If fldtype.EqualsIgnoreCase(\"short\") Then fldtype";
if (_fldtype.equalsIgnoreCase("short")) { 
_fldtype = "INT";};
 //BA.debugLineNum = 2392;BA.debugLine="If fldtype.endswith(\"INT\") Then fldtype = \"INT\"";
if (_fldtype.endsWith("INT")) { 
_fldtype = "INT";};
 //BA.debugLineNum = 2393;BA.debugLine="If fldtype.endswith(\"CHAR\") Then fldtype = \"TEXT\"";
if (_fldtype.endsWith("CHAR")) { 
_fldtype = "TEXT";};
 //BA.debugLineNum = 2394;BA.debugLine="If fldtype.endswith(\"TEXT\") Then fldtype = \"TEXT\"";
if (_fldtype.endsWith("TEXT")) { 
_fldtype = "TEXT";};
 //BA.debugLineNum = 2395;BA.debugLine="If fldtype.endswith(\"REAL\") Then fldtype = \"FLOAT";
if (_fldtype.endsWith("REAL")) { 
_fldtype = "FLOAT";};
 //BA.debugLineNum = 2396;BA.debugLine="If fldtype.endswith(\"BIT\") Then fldtype = \"INT\"";
if (_fldtype.endsWith("BIT")) { 
_fldtype = "INT";};
 //BA.debugLineNum = 2398;BA.debugLine="fldtype = fldtype.tolowercase";
_fldtype = _fldtype.toLowerCase();
 //BA.debugLineNum = 2399;BA.debugLine="fldtype = fldtype.replace(\"text\", \"string\")";
_fldtype = _fldtype.replace("text","string");
 //BA.debugLineNum = 2400;BA.debugLine="fldtype = fldtype.replace(\"float\", \"dbl\")";
_fldtype = _fldtype.replace("float","dbl");
 //BA.debugLineNum = 2401;BA.debugLine="fldtype = fldtype.replace(\"blob\", \"string\")";
_fldtype = _fldtype.replace("blob","string");
 //BA.debugLineNum = 2402;BA.debugLine="fldtype = fldtype.replace(\"none\", \"string\")";
_fldtype = _fldtype.replace("none","string");
 //BA.debugLineNum = 2403;BA.debugLine="fldtype = fldtype.replace(\"varchar\", \"string\")";
_fldtype = _fldtype.replace("varchar","string");
 //BA.debugLineNum = 2404;BA.debugLine="Return fldtype";
if (true) return _fldtype;
 //BA.debugLineNum = 2405;BA.debugLine="End Sub";
return "";
}
public static String  _dateadd(String _mdate,int _howmanydays) throws Exception{
long _convertdate = 0L;
long _newdateday = 0L;
 //BA.debugLineNum = 752;BA.debugLine="Sub DateAdd(mDate As String, HowManyDays As Int) A";
 //BA.debugLineNum = 753;BA.debugLine="HowManyDays = BANano.parseInt(HowManyDays)";
_howmanydays = _banano.parseInt((Object)(_howmanydays));
 //BA.debugLineNum = 754;BA.debugLine="Dim ConvertDate, NewDateDay As Long";
_convertdate = 0L;
_newdateday = 0L;
 //BA.debugLineNum = 755;BA.debugLine="ConvertDate = DateTime.DateParse(mDate)";
_convertdate = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_mdate);
 //BA.debugLineNum = 756;BA.debugLine="NewDateDay = DateTime.Add(ConvertDate, 0, 0, HowM";
_newdateday = anywheresoftware.b4a.keywords.Common.DateTime.Add(_convertdate,(int) (0),(int) (0),_howmanydays);
 //BA.debugLineNum = 757;BA.debugLine="Return DateTime.Date(NewDateDay)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_newdateday);
 //BA.debugLineNum = 758;BA.debugLine="End Sub";
return "";
}
public static int  _datediff(String _currentdate,String _otherdate) throws Exception{
com.ab.banano.BANanoObject _dates = null;
com.ab.banano.BANanoObject _datee = null;
 //BA.debugLineNum = 496;BA.debugLine="Sub DateDiff(currentDate As String, otherDate As S";
 //BA.debugLineNum = 497;BA.debugLine="Dim dateS, dateE As BANanoObject";
_dates = new com.ab.banano.BANanoObject();
_datee = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 498;BA.debugLine="dateS.Initialize4(\"moment\", currentDate)";
_dates.Initialize4("moment",(Object)(_currentdate));
 //BA.debugLineNum = 499;BA.debugLine="dateE.Initialize4(\"moment\", otherDate)";
_datee.Initialize4("moment",(Object)(_otherdate));
 //BA.debugLineNum = 500;BA.debugLine="Return dateS.RunMethod(\"diff\", Array(dateE, \"days";
if (true) return (int)(BA.ObjectToNumber(_dates.RunMethod("diff",(Object)(new Object[]{(Object)(_datee.getObject()),(Object)("days")}))));
 //BA.debugLineNum = 501;BA.debugLine="End Sub";
return 0;
}
public static String  _dateformat(String _item,String _sformat) throws Exception{
long _dt = 0L;
String _rslt = "";
 //BA.debugLineNum = 2324;BA.debugLine="Sub DateFormat(item As String, sFormat As String)";
 //BA.debugLineNum = 2325;BA.debugLine="If BANano.IsUndefined(item) Or BANano.IsNull(item";
if (_banano.IsUndefined((Object)(_item)) || _banano.IsNull((Object)(_item))) { 
if (true) return "";};
 //BA.debugLineNum = 2326;BA.debugLine="If item.Length = 0 Then Return \"\"";
if (_item.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 2327;BA.debugLine="Try";
try { //BA.debugLineNum = 2328;BA.debugLine="item = MvField(item,1,\" \")";
_item = _mvfield(_item,(int) (1)," ");
 //BA.debugLineNum = 2329;BA.debugLine="item = item.trim";
_item = _item.trim();
 //BA.debugLineNum = 2330;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 2331;BA.debugLine="Dim dt As Long = DateTime.DateParse(item)";
_dt = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_item);
 //BA.debugLineNum = 2332;BA.debugLine="DateTime.DateFormat = sFormat";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_sformat);
 //BA.debugLineNum = 2333;BA.debugLine="Dim rslt As String = DateTime.Date(dt)";
_rslt = anywheresoftware.b4a.keywords.Common.DateTime.Date(_dt);
 //BA.debugLineNum = 2334;BA.debugLine="Return rslt";
if (true) return _rslt;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 2336;BA.debugLine="Return item";
if (true) return _item;
 };
 //BA.debugLineNum = 2338;BA.debugLine="End Sub";
return "";
}
public static long  _dateiconv(String _sdate) throws Exception{
long _lps = 0L;
 //BA.debugLineNum = 335;BA.debugLine="Sub DateIconv(sdate As String) As Long";
 //BA.debugLineNum = 336;BA.debugLine="Dim lps As Long = DateTime.DateParse(sdate)";
_lps = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 337;BA.debugLine="Return lps";
if (true) return _lps;
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return 0L;
}
public static boolean  _dateisafter(String _date1,String _date2) throws Exception{
int _d1 = 0;
int _d2 = 0;
boolean _b = false;
 //BA.debugLineNum = 309;BA.debugLine="Sub DateIsAfter(date1 As String, date2 As String)";
 //BA.debugLineNum = 310;BA.debugLine="Dim d1 As Int = DateIconv(date1)";
_d1 = (int) (_dateiconv(_date1));
 //BA.debugLineNum = 311;BA.debugLine="Dim d2 As Int = DateIconv(date2)";
_d2 = (int) (_dateiconv(_date2));
 //BA.debugLineNum = 312;BA.debugLine="d1 = BANano.parseint(d1)";
_d1 = _banano.parseInt((Object)(_d1));
 //BA.debugLineNum = 313;BA.debugLine="d2 = BANano.parseInt(d2)";
_d2 = _banano.parseInt((Object)(_d2));
 //BA.debugLineNum = 314;BA.debugLine="Dim b As Boolean = BANano.IIf(d1 > d2, True, Fals";
_b = BA.ObjectToBoolean(_banano.IIf((Object)(_d1>_d2),(Object)(anywheresoftware.b4a.keywords.Common.True),(Object)(anywheresoftware.b4a.keywords.Common.False)));
 //BA.debugLineNum = 315;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return false;
}
public static String  _datenow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 1593;BA.debugLine="Public Sub DateNow() As String";
 //BA.debugLineNum = 1594;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 1595;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 1596;BA.debugLine="lNow = DateTime.Now";
_lnow = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 1597;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 1598;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = anywheresoftware.b4a.keywords.Common.DateTime.Date(_lnow);
 //BA.debugLineNum = 1599;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 1600;BA.debugLine="End Sub";
return "";
}
public static String  _dateoconv(long _ldate) throws Exception{
String _sdate = "";
 //BA.debugLineNum = 340;BA.debugLine="Sub DateOconv(lDate As Long) As String";
 //BA.debugLineNum = 341;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 342;BA.debugLine="Dim sdate As String = DateTime.Date(lDate)";
_sdate = anywheresoftware.b4a.keywords.Common.DateTime.Date(_ldate);
 //BA.debugLineNum = 343;BA.debugLine="Return sdate";
if (true) return _sdate;
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return "";
}
public static String  _datetimenow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 1602;BA.debugLine="Public Sub DateTimeNow() As String";
 //BA.debugLineNum = 1603;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 1604;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 1605;BA.debugLine="lNow = DateTime.Now";
_lnow = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 1606;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
 //BA.debugLineNum = 1607;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = anywheresoftware.b4a.keywords.Common.DateTime.Date(_lnow);
 //BA.debugLineNum = 1608;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 1609;BA.debugLine="End Sub";
return "";
}
public static String  _datetimenowtoisostring() throws Exception{
com.ab.banano.BANanoObject _obj = null;
String _sdate = "";
 //BA.debugLineNum = 25;BA.debugLine="Sub DateTimeNowToISOString As String";
 //BA.debugLineNum = 26;BA.debugLine="Dim obj As BANanoObject";
_obj = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 27;BA.debugLine="Dim sdate As String = obj.Initialize2(\"Date\", Nul";
_sdate = BA.ObjectToString(_obj.Initialize2("Date",anywheresoftware.b4a.keywords.Common.Null).RunMethod("toISOString",anywheresoftware.b4a.keywords.Common.Null).Result());
 //BA.debugLineNum = 28;BA.debugLine="Return sdate";
if (true) return _sdate;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public static String  _doupload(Object _fileobj) throws Exception{
Object _aevt = null;
com.ab.banano.BANanoXMLHttpRequest _xhr = null;
com.ab.banano.BANanoObject _fd = null;
anywheresoftware.b4a.objects.collections.Map _err = null;
String _serr = "";
 //BA.debugLineNum = 562;BA.debugLine="private Sub DoUpload(fileObj As Object) As String";
 //BA.debugLineNum = 563;BA.debugLine="Dim aEvt As Object";
_aevt = new Object();
 //BA.debugLineNum = 564;BA.debugLine="Dim xhr As BANanoXMLHttpRequest";
_xhr = new com.ab.banano.BANanoXMLHttpRequest();
 //BA.debugLineNum = 566;BA.debugLine="Dim fd As BANanoObject";
_fd = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 567;BA.debugLine="fd.Initialize2(\"FormData\",Null)";
_fd.Initialize2("FormData",anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 568;BA.debugLine="fd.RunMethod(\"append\", Array(\"upload\", fileObj))";
_fd.RunMethod("append",(Object)(new Object[]{(Object)("upload"),_fileobj}));
 //BA.debugLineNum = 570;BA.debugLine="xhr.Initialize";
_xhr.Initialize();
 //BA.debugLineNum = 571;BA.debugLine="xhr.Open(\"POST\", \"./assets/upload.php\")";
_xhr.Open("POST","./assets/upload.php");
 //BA.debugLineNum = 572;BA.debugLine="xhr.AddEventListenerOpenAsync(\"onreadystatechange";
_xhr.AddEventListenerOpenAsync("onreadystatechange",_aevt);
 //BA.debugLineNum = 573;BA.debugLine="If xhr.ReadyState = 4 Then";
if (_xhr.getReadyState()==4) { 
 //BA.debugLineNum = 574;BA.debugLine="If xhr.Status = 200 Then";
if (_xhr.getStatus()==200) { 
 //BA.debugLineNum = 575;BA.debugLine="BANano.ReturnThen(xhr.ResponseText)";
_banano.ReturnThen((Object)(_xhr.getResponseText()));
 }else {
 //BA.debugLineNum = 577;BA.debugLine="Dim err As Map = CreateMap()";
_err = new anywheresoftware.b4a.objects.collections.Map();
_err = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 578;BA.debugLine="err.Put(\"status\", \"error\")";
_err.Put((Object)("status"),(Object)("error"));
 //BA.debugLineNum = 579;BA.debugLine="Dim serr As String = BANano.ToJson(err)";
_serr = BA.ObjectToString(_banano.ToJson((Object)(_err.getObject())));
 //BA.debugLineNum = 580;BA.debugLine="BANano.ReturnElse(serr)";
_banano.ReturnElse((Object)(_serr));
 };
 };
 //BA.debugLineNum = 583;BA.debugLine="xhr.CloseEventListener";
_xhr.CloseEventListener();
 //BA.debugLineNum = 584;BA.debugLine="xhr.Send2(fd)";
_xhr.Send2((Object)(_fd.getObject()));
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _eqoperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
 //BA.debugLineNum = 1450;BA.debugLine="Sub EQOperators(sm As Map) As List   'ignore";
 //BA.debugLineNum = 1451;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1452;BA.debugLine="nl.initialize";
_nl.Initialize();
 //BA.debugLineNum = 1453;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1454;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
 //BA.debugLineNum = 1456;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 1457;BA.debugLine="End Sub";
return null;
}
public static String  _escapefield(String _f) throws Exception{
 //BA.debugLineNum = 2047;BA.debugLine="Sub EscapeField(f As String) As String";
 //BA.debugLineNum = 2048;BA.debugLine="Return $\"[${f}]\"$";
if (true) return ("["+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_f))+"]");
 //BA.debugLineNum = 2049;BA.debugLine="End Sub";
return "";
}
public static String  _expectedrag(double _dvalue) throws Exception{
 //BA.debugLineNum = 1907;BA.debugLine="Public Sub ExpectedRAG(dValue As Double) As String";
 //BA.debugLineNum = 1908;BA.debugLine="If dValue = 0 Then";
if (_dvalue==0) { 
 //BA.debugLineNum = 1909;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else if(_dvalue>0) { 
 //BA.debugLineNum = 1911;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else if(_dvalue<0) { 
 //BA.debugLineNum = 1913;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else {
 //BA.debugLineNum = 1915;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 };
 //BA.debugLineNum = 1917;BA.debugLine="End Sub";
return "";
}
public static String  _expenditurerag(double _dvariance) throws Exception{
 //BA.debugLineNum = 1919;BA.debugLine="Public Sub ExpenditureRAG(dVariance As Double) As";
 //BA.debugLineNum = 1920;BA.debugLine="If dVariance > 0 Then";
if (_dvariance>0) { 
 //BA.debugLineNum = 1921;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else if(_dvariance<0) { 
 //BA.debugLineNum = 1923;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else if(_dvariance==0) { 
 //BA.debugLineNum = 1925;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else {
 //BA.debugLineNum = 1927;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 };
 //BA.debugLineNum = 1929;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _explodelist(anywheresoftware.b4a.objects.collections.List _lst,int _runs) throws Exception{
anywheresoftware.b4a.objects.collections.List _nlist = null;
int _ocnt = 0;
 //BA.debugLineNum = 101;BA.debugLine="Sub ExplodeList(lst As List, runs As Int) As List";
 //BA.debugLineNum = 102;BA.debugLine="Dim nList As List";
_nlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 103;BA.debugLine="nList.Initialize";
_nlist.Initialize();
 //BA.debugLineNum = 104;BA.debugLine="Dim oCnt As Int";
_ocnt = 0;
 //BA.debugLineNum = 105;BA.debugLine="For oCnt = 1 To runs";
{
final int step4 = 1;
final int limit4 = _runs;
_ocnt = (int) (1) ;
for (;_ocnt <= limit4 ;_ocnt = _ocnt + step4 ) {
 //BA.debugLineNum = 106;BA.debugLine="nList.AddAll(lst)";
_nlist.AddAll(_lst);
 }
};
 //BA.debugLineNum = 108;BA.debugLine="nList = ShuffleList(nList)";
_nlist = _shufflelist(_nlist);
 //BA.debugLineNum = 109;BA.debugLine="Return nList";
if (true) return _nlist;
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _extractmap(anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 631;BA.debugLine="Sub ExtractMap(source As Map, keys As List) As Map";
 //BA.debugLineNum = 632;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 633;BA.debugLine="For Each k As String In keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _keys;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 634;BA.debugLine="Dim v As Object = source.get(k)";
_v = _source.Get((Object)(_k));
 //BA.debugLineNum = 635;BA.debugLine="nm.put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 637;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 638;BA.debugLine="End Sub";
return null;
}
public static String  _facedone(int _dvalue) throws Exception{
 //BA.debugLineNum = 2018;BA.debugLine="Public Sub FaceDone(dValue As Int) As String";
 //BA.debugLineNum = 2019;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 100: {
 //BA.debugLineNum = 2021;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 2023;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 2025;BA.debugLine="End Sub";
return "";
}
public static String  _facerag(int _dvalue) throws Exception{
 //BA.debugLineNum = 1983;BA.debugLine="Public Sub FaceRAG(dValue As Int) As String";
 //BA.debugLineNum = 1984;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 1986;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 1: {
 //BA.debugLineNum = 1988;BA.debugLine="Return \"./assets/neutralface.png\"";
if (true) return "./assets/neutralface.png";
 break; }
case 2: {
 //BA.debugLineNum = 1990;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 1992;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 1994;BA.debugLine="End Sub";
return "";
}
public static String  _facerg(int _dvalue) throws Exception{
 //BA.debugLineNum = 1996;BA.debugLine="Public Sub FaceRG(dValue As Int) As String";
 //BA.debugLineNum = 1997;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 1999;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 1: {
 //BA.debugLineNum = 2001;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 2003;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 2005;BA.debugLine="End Sub";
return "";
}
public static String  _facerg1(int _dvalue) throws Exception{
 //BA.debugLineNum = 2007;BA.debugLine="Public Sub FaceRG1(dValue As Int) As String";
 //BA.debugLineNum = 2008;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 1: {
 //BA.debugLineNum = 2010;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 0: {
 //BA.debugLineNum = 2012;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 2014;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 2016;BA.debugLine="End Sub";
return "";
}
public static String  _fixrecords(anywheresoftware.b4a.objects.collections.List _recs,anywheresoftware.b4a.objects.collections.List _trimthese,anywheresoftware.b4a.objects.collections.List _numthese,anywheresoftware.b4a.objects.collections.List _boolthese,anywheresoftware.b4a.objects.collections.List _datethese,anywheresoftware.b4a.objects.collections.List _dblthese) throws Exception{
int _rtot = 0;
int _rcnt = 0;
anywheresoftware.b4a.objects.collections.Map _rec = null;
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1677;BA.debugLine="Sub FixRecords(recs As List, trimThese As List, nu";
 //BA.debugLineNum = 1678;BA.debugLine="Dim rTot As Int = recs.Size - 1";
_rtot = (int) (_recs.getSize()-1);
 //BA.debugLineNum = 1679;BA.debugLine="Dim rCnt As Int";
_rcnt = 0;
 //BA.debugLineNum = 1680;BA.debugLine="For rCnt = 0 To rTot";
{
final int step3 = 1;
final int limit3 = _rtot;
_rcnt = (int) (0) ;
for (;_rcnt <= limit3 ;_rcnt = _rcnt + step3 ) {
 //BA.debugLineNum = 1681;BA.debugLine="Dim rec As Map = recs.Get(rCnt)";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_recs.Get(_rcnt)));
 //BA.debugLineNum = 1683;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1684;BA.debugLine="For Each k As String In rec.keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _rec.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 1685;BA.debugLine="Dim v As Object = rec.Get(k)";
_v = _rec.Get((Object)(_k));
 //BA.debugLineNum = 1686;BA.debugLine="k = k.ToLowerCase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 1687;BA.debugLine="nrec.Put(k, v)";
_nrec.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1689;BA.debugLine="If dateThese <> Null Then MakeDate(nrec,dateThes";
if (_datethese!= null) { 
_makedate(_nrec,_datethese);};
 //BA.debugLineNum = 1690;BA.debugLine="If trimThese <> Null Then MakeTrim(nrec,trimThes";
if (_trimthese!= null) { 
_maketrim(_nrec,_trimthese);};
 //BA.debugLineNum = 1691;BA.debugLine="If numThese <> Null Then MakeInteger(nrec, numTh";
if (_numthese!= null) { 
_makeinteger(_nrec,_numthese);};
 //BA.debugLineNum = 1692;BA.debugLine="If dblThese <> Null Then MakeDouble(nrec, dblThe";
if (_dblthese!= null) { 
_makedouble(_nrec,_dblthese);};
 //BA.debugLineNum = 1693;BA.debugLine="If boolThese <> Null Then MakeBoolean(nrec, bool";
if (_boolthese!= null) { 
_makeboolean(_nrec,_boolthese);};
 //BA.debugLineNum = 1694;BA.debugLine="recs.Set(rCnt, nrec)";
_recs.Set(_rcnt,(Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 1696;BA.debugLine="End Sub";
return "";
}
public static String  _formatfilesize(float _bytes) throws Exception{
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
 //BA.debugLineNum = 818;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
 //BA.debugLineNum = 819;BA.debugLine="If BANano.IsNull(Bytes) Or BANano.IsUndefined(Byt";
if (_banano.IsNull((Object)(_bytes)) || _banano.IsUndefined((Object)(_bytes))) { 
 //BA.debugLineNum = 820;BA.debugLine="Bytes = 0";
_bytes = (float) (0);
 };
 //BA.debugLineNum = 822;BA.debugLine="Bytes = BANano.parsefloat(Bytes)";
_bytes = (float) (_banano.parseFloat((Object)(_bytes)));
 //BA.debugLineNum = 823;BA.debugLine="Try";
try { //BA.debugLineNum = 824;BA.debugLine="Private Unit() As String = Array As String(\" Byt";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
 //BA.debugLineNum = 825;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
 //BA.debugLineNum = 826;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
 //BA.debugLineNum = 828;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
 //BA.debugLineNum = 829;BA.debugLine="Private I As Int";
_i = 0;
 //BA.debugLineNum = 830;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (anywheresoftware.b4a.keywords.Common.Abs(_bytes));
 //BA.debugLineNum = 831;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (anywheresoftware.b4a.keywords.Common.Floor(anywheresoftware.b4a.keywords.Common.Logarithm(_bytes,1024)));
 //BA.debugLineNum = 832;BA.debugLine="Po = Power(1024, I)";
_po = anywheresoftware.b4a.keywords.Common.Power(1024,_i);
 //BA.debugLineNum = 833;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
 //BA.debugLineNum = 834;BA.debugLine="Return NumberFormat(Si, 1, 3) & Unit(I)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_si,(int) (1),(int) (3))+_unit[_i];
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19); //BA.debugLineNum = 837;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 };
 //BA.debugLineNum = 839;BA.debugLine="End Sub";
return "";
}
public static String  _formattext(String _stext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rm = null;
int _ktot = 0;
int _kcnt = 0;
String _strvalue = "";
String _strrep = "";
 //BA.debugLineNum = 2248;BA.debugLine="Sub FormatText(sText As String) As String";
 //BA.debugLineNum = 2249;BA.debugLine="Dim RM As Map";
_rm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2250;BA.debugLine="RM.Initialize";
_rm.Initialize();
 //BA.debugLineNum = 2251;BA.debugLine="RM.clear";
_rm.Clear();
 //BA.debugLineNum = 2252;BA.debugLine="RM.Put(\"{U}\", \"<ins>\")";
_rm.Put((Object)("{U}"),(Object)("<ins>"));
 //BA.debugLineNum = 2253;BA.debugLine="RM.Put(\"{/U}\", \"</ins>\")";
_rm.Put((Object)("{/U}"),(Object)("</ins>"));
 //BA.debugLineNum = 2254;BA.debugLine="RM.Put(\"¢\",\"&cent;\")";
_rm.Put((Object)("¢"),(Object)("&cent;"));
 //BA.debugLineNum = 2255;BA.debugLine="RM.put(\"£\",\"&pound;\")";
_rm.Put((Object)("£"),(Object)("&pound;"));
 //BA.debugLineNum = 2256;BA.debugLine="RM.Put(\"{SUP}\", \"<sup>\")";
_rm.Put((Object)("{SUP}"),(Object)("<sup>"));
 //BA.debugLineNum = 2257;BA.debugLine="RM.Put(\"{/SUP}\", \"</sup>\")";
_rm.Put((Object)("{/SUP}"),(Object)("</sup>"));
 //BA.debugLineNum = 2258;BA.debugLine="RM.Put(\"¥\",\"&yen;\")";
_rm.Put((Object)("¥"),(Object)("&yen;"));
 //BA.debugLineNum = 2259;BA.debugLine="RM.Put(\"€\",\"&euro;\")";
_rm.Put((Object)("€"),(Object)("&euro;"));
 //BA.debugLineNum = 2260;BA.debugLine="RM.put(\"©\",\"&copy;\")";
_rm.Put((Object)("©"),(Object)("&copy;"));
 //BA.debugLineNum = 2261;BA.debugLine="RM.Put(\"®\",\"&reg;\")";
_rm.Put((Object)("®"),(Object)("&reg;"));
 //BA.debugLineNum = 2262;BA.debugLine="RM.put(\"{COPYRIGHT}\", \"&copy;\")";
_rm.Put((Object)("{COPYRIGHT}"),(Object)("&copy;"));
 //BA.debugLineNum = 2263;BA.debugLine="RM.Put(\"{TRADEMARK}\", \"&reg;\")";
_rm.Put((Object)("{TRADEMARK}"),(Object)("&reg;"));
 //BA.debugLineNum = 2264;BA.debugLine="RM.Put(\"{POUND}\",\"&pound;\")";
_rm.Put((Object)("{POUND}"),(Object)("&pound;"));
 //BA.debugLineNum = 2265;BA.debugLine="RM.Put(\"{/B}\", \"</b>\")";
_rm.Put((Object)("{/B}"),(Object)("</b>"));
 //BA.debugLineNum = 2266;BA.debugLine="RM.Put(\"{I}\", \"<i>\")";
_rm.Put((Object)("{I}"),(Object)("<i>"));
 //BA.debugLineNum = 2267;BA.debugLine="RM.Put(\"{YEN}\",\"&yen;\")";
_rm.Put((Object)("{YEN}"),(Object)("&yen;"));
 //BA.debugLineNum = 2268;BA.debugLine="RM.Put(\"{EURO}\",\"&euro;\")";
_rm.Put((Object)("{EURO}"),(Object)("&euro;"));
 //BA.debugLineNum = 2269;BA.debugLine="RM.Put(\"{CODE}\",\"<code>\")";
_rm.Put((Object)("{CODE}"),(Object)("<code>"));
 //BA.debugLineNum = 2270;BA.debugLine="RM.Put(\"{/CODE}\",\"</code>\")";
_rm.Put((Object)("{/CODE}"),(Object)("</code>"));
 //BA.debugLineNum = 2271;BA.debugLine="RM.put(\"{COPYRIGHT}\",\"&copy;\")";
_rm.Put((Object)("{COPYRIGHT}"),(Object)("&copy;"));
 //BA.debugLineNum = 2272;BA.debugLine="RM.Put(\"{REGISTERED}\",\"&reg;\")";
_rm.Put((Object)("{REGISTERED}"),(Object)("&reg;"));
 //BA.debugLineNum = 2273;BA.debugLine="RM.Put(\"{B}\", \"<b>\")";
_rm.Put((Object)("{B}"),(Object)("<b>"));
 //BA.debugLineNum = 2274;BA.debugLine="RM.Put(\"{SMALL}\", \"<small>\")";
_rm.Put((Object)("{SMALL}"),(Object)("<small>"));
 //BA.debugLineNum = 2275;BA.debugLine="RM.Put(\"{/SMALL}\", \"</small>\")";
_rm.Put((Object)("{/SMALL}"),(Object)("</small>"));
 //BA.debugLineNum = 2276;BA.debugLine="RM.Put(\"{EM}\", \"<em>\")";
_rm.Put((Object)("{EM}"),(Object)("<em>"));
 //BA.debugLineNum = 2277;BA.debugLine="RM.Put(\"{/EM}\", \"</em>\")";
_rm.Put((Object)("{/EM}"),(Object)("</em>"));
 //BA.debugLineNum = 2278;BA.debugLine="RM.Put(\"{MARK}\", \"<mark>\")";
_rm.Put((Object)("{MARK}"),(Object)("<mark>"));
 //BA.debugLineNum = 2279;BA.debugLine="RM.Put(\"{/MARK}\", \"</mark>\")";
_rm.Put((Object)("{/MARK}"),(Object)("</mark>"));
 //BA.debugLineNum = 2280;BA.debugLine="RM.Put(\"{/I}\", \"</i>\")";
_rm.Put((Object)("{/I}"),(Object)("</i>"));
 //BA.debugLineNum = 2281;BA.debugLine="RM.Put(\"{SUB}\", \"<sub>\")";
_rm.Put((Object)("{SUB}"),(Object)("<sub>"));
 //BA.debugLineNum = 2282;BA.debugLine="RM.Put(\"{/SUB}\", \"</sub>\")";
_rm.Put((Object)("{/SUB}"),(Object)("</sub>"));
 //BA.debugLineNum = 2283;BA.debugLine="RM.Put(\"{BR}\", \"<br/>\")";
_rm.Put((Object)("{BR}"),(Object)("<br/>"));
 //BA.debugLineNum = 2284;BA.debugLine="RM.Put(\"{WBR}\",\"<wbr>\")";
_rm.Put((Object)("{WBR}"),(Object)("<wbr>"));
 //BA.debugLineNum = 2285;BA.debugLine="RM.Put(\"{STRONG}\", \"<strong>\")";
_rm.Put((Object)("{STRONG}"),(Object)("<strong>"));
 //BA.debugLineNum = 2286;BA.debugLine="RM.Put(\"{/STRONG}\", \"</strong>\")";
_rm.Put((Object)("{/STRONG}"),(Object)("</strong>"));
 //BA.debugLineNum = 2287;BA.debugLine="RM.Put(\"{NBSP}\", \"&nbsp;\")";
_rm.Put((Object)("{NBSP}"),(Object)("&nbsp;"));
 //BA.debugLineNum = 2288;BA.debugLine="RM.Put(\"“\",\"\")";
_rm.Put((Object)("“"),(Object)(""));
 //BA.debugLineNum = 2289;BA.debugLine="RM.Put(\"”\",\"\")";
_rm.Put((Object)("”"),(Object)(""));
 //BA.debugLineNum = 2290;BA.debugLine="RM.Put(\"’\",\"'\")";
_rm.Put((Object)("’"),(Object)("'"));
 //BA.debugLineNum = 2291;BA.debugLine="Dim kTot As Int = RM.Size - 1";
_ktot = (int) (_rm.getSize()-1);
 //BA.debugLineNum = 2292;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 2293;BA.debugLine="For kCnt = 0 To kTot";
{
final int step45 = 1;
final int limit45 = _ktot;
_kcnt = (int) (0) ;
for (;_kcnt <= limit45 ;_kcnt = _kcnt + step45 ) {
 //BA.debugLineNum = 2294;BA.debugLine="Dim strValue As String = RM.GetKeyAt(kCnt)";
_strvalue = BA.ObjectToString(_rm.GetKeyAt(_kcnt));
 //BA.debugLineNum = 2295;BA.debugLine="Dim strRep As String = RM.Get(strValue)";
_strrep = BA.ObjectToString(_rm.Get((Object)(_strvalue)));
 //BA.debugLineNum = 2296;BA.debugLine="sText = sText.Replace(strValue, strRep)";
_stext = _stext.replace(_strvalue,_strrep);
 }
};
 //BA.debugLineNum = 2298;BA.debugLine="sText = BANano.SF(sText)";
_stext = _banano.SF(_stext);
 //BA.debugLineNum = 2299;BA.debugLine="Return sText";
if (true) return _stext;
 //BA.debugLineNum = 2300;BA.debugLine="End Sub";
return "";
}
public static String  _gar(int _dvalue) throws Exception{
 //BA.debugLineNum = 1957;BA.debugLine="Public Sub GAR(dValue As Int) As String";
 //BA.debugLineNum = 1958;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 1960;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
case 1: {
 //BA.debugLineNum = 1962;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 1964;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
default: {
 //BA.debugLineNum = 1966;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 1968;BA.debugLine="End Sub";
return "";
}
public static String  _generatenanoid() throws Exception{
com.ab.banano.BANanoObject _crypto = null;
String _nanoid = "";
com.ab.banano.BANanoObject _tmpints = null;
byte[] _randoms = null;
int _i = 0;
com.ab.banano.BANanoObject _n = null;
String _tmpn = "";
 //BA.debugLineNum = 2499;BA.debugLine="public Sub GenerateNanoID() As String";
 //BA.debugLineNum = 2501;BA.debugLine="Dim crypto As BANanoObject";
_crypto = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 2502;BA.debugLine="If Not(BANano.Window.GetField(\"crypto\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(BA.ObjectToBoolean(_banano.Window().GetField("crypto")))) { 
 //BA.debugLineNum = 2503;BA.debugLine="crypto = BANano.Window.GetField(\"msCrypto\")";
_crypto = _banano.Window().GetField("msCrypto");
 }else {
 //BA.debugLineNum = 2505;BA.debugLine="crypto = BANano.Window.GetField(\"crypto\")";
_crypto = _banano.Window().GetField("crypto");
 };
 //BA.debugLineNum = 2508;BA.debugLine="Dim nanoID As String";
_nanoid = "";
 //BA.debugLineNum = 2509;BA.debugLine="Dim tmpInts As BANanoObject";
_tmpints = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 2510;BA.debugLine="tmpInts.Initialize2(\"Uint8Array\", 21)";
_tmpints.Initialize2("Uint8Array",(Object)(21));
 //BA.debugLineNum = 2511;BA.debugLine="Dim Randoms(21) As Byte = crypto.RunMethod(\"getRa";
_randoms = (byte[])(_crypto.RunMethod("getRandomValues",(Object)(_tmpints.getObject())).getObject());
 //BA.debugLineNum = 2512;BA.debugLine="For i = 20 To 0 Step -1";
{
final int step11 = -1;
final int limit11 = (int) (0);
_i = (int) (20) ;
for (;_i >= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 2513;BA.debugLine="Dim n As BANanoObject = Bit.And(63, Randoms(i))";
_n = new com.ab.banano.BANanoObject();
_n = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Bit.And((int) (63),(int) (_randoms[_i]))));
 //BA.debugLineNum = 2514;BA.debugLine="If n < 36 Then";
if ((double)(BA.ObjectToNumber(_n))<36) { 
 //BA.debugLineNum = 2515;BA.debugLine="nanoID = nanoID & n.RunMethod(\"toString\", 36).R";
_nanoid = _nanoid+BA.ObjectToString(_n.RunMethod("toString",(Object)(36)).Result());
 }else if((double)(BA.ObjectToNumber(_n))<62) { 
 //BA.debugLineNum = 2517;BA.debugLine="n = n - 26 'ignore";
_n = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)((double)(BA.ObjectToNumber(_n))-26));
 //BA.debugLineNum = 2518;BA.debugLine="Dim tmpN As String = n.RunMethod(\"toString\", 36";
_tmpn = BA.ObjectToString(_n.RunMethod("toString",(Object)(36)).Result());
 //BA.debugLineNum = 2519;BA.debugLine="nanoID = nanoID & tmpN.ToUpperCase";
_nanoid = _nanoid+_tmpn.toUpperCase();
 }else if((double)(BA.ObjectToNumber(_n))<63) { 
 //BA.debugLineNum = 2521;BA.debugLine="nanoID = nanoID & \"_\"";
_nanoid = _nanoid+"_";
 }else {
 //BA.debugLineNum = 2523;BA.debugLine="nanoID = nanoID & \"-\"";
_nanoid = _nanoid+"-";
 };
 }
};
 //BA.debugLineNum = 2526;BA.debugLine="Return nanoID";
if (true) return _nanoid;
 //BA.debugLineNum = 2527;BA.debugLine="End Sub";
return "";
}
public static String  _generatepassword(int _intnum) throws Exception{
 //BA.debugLineNum = 1137;BA.debugLine="Sub GeneratePassword(IntNum As Int) As String";
 //BA.debugLineNum = 1138;BA.debugLine="Return RandomString(IntNum,True,True,True,\"\")";
if (true) return _randomstring(_intnum,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,"");
 //BA.debugLineNum = 1139;BA.debugLine="End Sub";
return "";
}
public static String  _getalphabets(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 603;BA.debugLine="Public Sub GetAlphabets(value As String) As String";
 //BA.debugLineNum = 604;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 605;BA.debugLine="Try";
try { //BA.debugLineNum = 606;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 607;BA.debugLine="If value = \"\" Then value = \"\"";
if ((_value).equals("")) { 
_value = "";};
 //BA.debugLineNum = 608;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 609;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 610;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 611;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 612;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 613;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 614;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
if (_instr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ",_mout)!=-1) { 
 //BA.debugLineNum = 615;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 618;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 620;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 622;BA.debugLine="End Sub";
return "";
}
public static String  _getalphanumeric(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 2340;BA.debugLine="Sub GetAlphaNumeric(value As String) As String";
 //BA.debugLineNum = 2341;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 2342;BA.debugLine="Try";
try { //BA.debugLineNum = 2343;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 2344;BA.debugLine="If value = \"\" Then value = \"\"";
if ((_value).equals("")) { 
_value = "";};
 //BA.debugLineNum = 2345;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 2346;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 2347;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 2348;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 2349;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 2350;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 2351;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
if (_instr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789",_mout)!=-1) { 
 //BA.debugLineNum = 2352;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 2355;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 2357;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 2359;BA.debugLine="End Sub";
return "";
}
public static com.ab.banano.BANanoObject  _getelementbyid(String _sid) throws Exception{
com.ab.banano.BANanoObject _el = null;
 //BA.debugLineNum = 491;BA.debugLine="Sub getElementById(sid As String) As BANanoObject";
 //BA.debugLineNum = 492;BA.debugLine="Dim el As BANanoObject = BANano.Window.GetField(\"";
_el = new com.ab.banano.BANanoObject();
_el = _banano.Window().GetField("document").RunMethod("getElementById",(Object)(new Object[]{(Object)(_sid)}));
 //BA.debugLineNum = 493;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return null;
}
public static String  _getemailresponse(String _email) throws Exception{
anywheresoftware.b4a.objects.collections.Map _respm = null;
String _response = "";
 //BA.debugLineNum = 32;BA.debugLine="Sub GetEmailResponse(email As String) As String";
 //BA.debugLineNum = 33;BA.debugLine="Dim respM As Map = BANano.FromJson(email)";
_respm = new anywheresoftware.b4a.objects.collections.Map();
_respm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_banano.FromJson((Object)(_email))));
 //BA.debugLineNum = 34;BA.debugLine="Dim response As String = respM.Get(\"response\")";
_response = BA.ObjectToString(_respm.Get((Object)("response")));
 //BA.debugLineNum = 35;BA.debugLine="Return response";
if (true) return _response;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public static String  _geteventtargetproperty(com.ab.banano.BANanoEvent _e,String _prop) throws Exception{
String _sid = "";
 //BA.debugLineNum = 165;BA.debugLine="Sub GetEventTargetProperty(e As BANanoEvent, prop";
 //BA.debugLineNum = 166;BA.debugLine="Dim sid As String = e.OtherField(\"target\").GetFie";
_sid = BA.ObjectToString(_e.OtherField("target").GetField(_prop).Result());
 //BA.debugLineNum = 167;BA.debugLine="Return sid";
if (true) return _sid;
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public static com.ab.banano.BANanoPromise  _getfileastext(com.ab.banano.BANanoEvent _e) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
anywheresoftware.b4a.objects.collections.List _filelist = null;
anywheresoftware.b4a.objects.collections.Map _fr = null;
 //BA.debugLineNum = 2462;BA.debugLine="Sub GetFileAsText(e As BANanoEvent) As BANanoPromi";
 //BA.debugLineNum = 2463;BA.debugLine="Dim promise As BANanoPromise";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 2464;BA.debugLine="Dim fileList As List = GetFileListFromTarget(e)";
_filelist = new anywheresoftware.b4a.objects.collections.List();
_filelist = _getfilelistfromtarget(_e);
 //BA.debugLineNum = 2466;BA.debugLine="If fileList.size = 0 Then Return promise";
if (_filelist.getSize()==0) { 
if (true) return _promise;};
 //BA.debugLineNum = 2468;BA.debugLine="Dim fr As Map = fileList.get(0)";
_fr = new anywheresoftware.b4a.objects.collections.Map();
_fr = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_filelist.Get((int) (0))));
 //BA.debugLineNum = 2470;BA.debugLine="promise = readAsText(fr)";
_promise = _readastext(_fr);
 //BA.debugLineNum = 2471;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 2472;BA.debugLine="End Sub";
return null;
}
public static b4j.example.bananoshared._fileobject  _getfiledetails(anywheresoftware.b4a.objects.collections.Map _fileobj) throws Exception{
String _sname = "";
com.ab.banano.BANanoObject _slastmodifieddate = null;
String _ssize = "";
String _stype = "";
String _yyyy = "";
String _dd = "";
String _mm = "";
String _hh = "";
String _minutes = "";
String _fd = "";
b4j.example.bananoshared._fileobject _ff = null;
 //BA.debugLineNum = 519;BA.debugLine="Sub GetFileDetails(fileObj As Map) As FileObject";
 //BA.debugLineNum = 520;BA.debugLine="Dim sname As String = fileObj.Get(\"name\")";
_sname = BA.ObjectToString(_fileobj.Get((Object)("name")));
 //BA.debugLineNum = 521;BA.debugLine="Dim slastModifiedDate As BANanoObject = fileObj.G";
_slastmodifieddate = new com.ab.banano.BANanoObject();
_slastmodifieddate = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_fileobj.Get((Object)("lastModifiedDate"))));
 //BA.debugLineNum = 522;BA.debugLine="Dim ssize As String = fileObj.Get(\"size\")";
_ssize = BA.ObjectToString(_fileobj.Get((Object)("size")));
 //BA.debugLineNum = 523;BA.debugLine="Dim stype As String = fileObj.Get(\"type\")";
_stype = BA.ObjectToString(_fileobj.Get((Object)("type")));
 //BA.debugLineNum = 525;BA.debugLine="Dim yyyy As String = slastModifiedDate.RunMethod(";
_yyyy = BA.ObjectToString(_slastmodifieddate.RunMethod("getFullYear",anywheresoftware.b4a.keywords.Common.Null).Result());
 //BA.debugLineNum = 526;BA.debugLine="Dim dd As String = slastModifiedDate.RunMethod(\"g";
_dd = BA.ObjectToString(_slastmodifieddate.RunMethod("getDate",anywheresoftware.b4a.keywords.Common.Null).Result());
 //BA.debugLineNum = 527;BA.debugLine="Dim mm As String = slastModifiedDate.RunMethod(\"g";
_mm = BA.ObjectToString(_slastmodifieddate.RunMethod("getMonth",anywheresoftware.b4a.keywords.Common.Null).Result());
 //BA.debugLineNum = 528;BA.debugLine="Dim hh As String = slastModifiedDate.RunMethod(\"g";
_hh = BA.ObjectToString(_slastmodifieddate.RunMethod("getHours",anywheresoftware.b4a.keywords.Common.Null).Result());
 //BA.debugLineNum = 529;BA.debugLine="Dim minutes As String = slastModifiedDate.RunMeth";
_minutes = BA.ObjectToString(_slastmodifieddate.RunMethod("getMinutes",anywheresoftware.b4a.keywords.Common.Null).Result());
 //BA.debugLineNum = 531;BA.debugLine="dd = PadRight(dd, 2, \"0\")";
_dd = _padright(_dd,(int) (2),"0");
 //BA.debugLineNum = 532;BA.debugLine="mm = PadRight(mm, 2, \"0\")";
_mm = _padright(_mm,(int) (2),"0");
 //BA.debugLineNum = 533;BA.debugLine="hh = PadRight(hh, 2, \"0\")";
_hh = _padright(_hh,(int) (2),"0");
 //BA.debugLineNum = 534;BA.debugLine="minutes = PadRight(minutes, 2, \"0\")";
_minutes = _padright(_minutes,(int) (2),"0");
 //BA.debugLineNum = 536;BA.debugLine="Dim fd As String = $\"${yyyy}-${mm}-${dd} ${hh}:${";
_fd = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_yyyy))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mm))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dd))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_hh))+":"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_minutes))+"");
 //BA.debugLineNum = 539;BA.debugLine="Dim ff As FileObject";
_ff = new b4j.example.bananoshared._fileobject();
 //BA.debugLineNum = 540;BA.debugLine="ff.Initialize";
_ff.Initialize();
 //BA.debugLineNum = 541;BA.debugLine="ff.FileName = sname";
_ff.FileName /*String*/  = _sname;
 //BA.debugLineNum = 542;BA.debugLine="ff.FileDate = fd";
_ff.FileDate /*String*/  = _fd;
 //BA.debugLineNum = 543;BA.debugLine="ff.FileSize = ssize";
_ff.FileSize /*long*/  = (long)(Double.parseDouble(_ssize));
 //BA.debugLineNum = 544;BA.debugLine="ff.FileType = stype";
_ff.FileType /*String*/  = _stype;
 //BA.debugLineNum = 545;BA.debugLine="Return ff";
if (true) return _ff;
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return null;
}
public static String  _getfileext(String _fullpath) throws Exception{
 //BA.debugLineNum = 1656;BA.debugLine="Sub GetFileExt(FullPath As String) As String";
 //BA.debugLineNum = 1657;BA.debugLine="Return FullPath.SubString(FullPath.LastIndexOf(\".";
if (true) return _fullpath.substring((int) (_fullpath.lastIndexOf(".")+1));
 //BA.debugLineNum = 1658;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _getfilelistfromtarget(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.List _files = null;
 //BA.debugLineNum = 170;BA.debugLine="Sub GetFileListFromTarget(e As BANanoEvent) As Lis";
 //BA.debugLineNum = 171;BA.debugLine="Dim files As List = e.OtherField(\"target\").GetFie";
_files = new anywheresoftware.b4a.objects.collections.List();
_files = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e.OtherField("target").GetField("files").Result()));
 //BA.debugLineNum = 172;BA.debugLine="Return files";
if (true) return _files;
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public static String  _getfileparentpath(String _path) throws Exception{
String _path1 = "";
int _l = 0;
 //BA.debugLineNum = 1636;BA.debugLine="Sub GetFileParentPath(Path As String) As String";
 //BA.debugLineNum = 1637;BA.debugLine="Dim Path1 As String";
_path1 = "";
 //BA.debugLineNum = 1638;BA.debugLine="Dim L As Int";
_l = 0;
 //BA.debugLineNum = 1639;BA.debugLine="If Path = \"/\" Then";
if ((_path).equals("/")) { 
 //BA.debugLineNum = 1640;BA.debugLine="Return \"/\"";
if (true) return "/";
 };
 //BA.debugLineNum = 1642;BA.debugLine="L = Path.LastIndexOf(\"/\")";
_l = _path.lastIndexOf("/");
 //BA.debugLineNum = 1643;BA.debugLine="If L = Path.Length - 1 Then";
if (_l==_path.length()-1) { 
 //BA.debugLineNum = 1645;BA.debugLine="Path1 = Path.SubString2(0,L)";
_path1 = _path.substring((int) (0),_l);
 }else {
 //BA.debugLineNum = 1647;BA.debugLine="Path1 = Path";
_path1 = _path;
 };
 //BA.debugLineNum = 1649;BA.debugLine="L = Path.LastIndexOf(\"/\")";
_l = _path.lastIndexOf("/");
 //BA.debugLineNum = 1650;BA.debugLine="If L = 0 Then";
if (_l==0) { 
 //BA.debugLineNum = 1651;BA.debugLine="L = 1";
_l = (int) (1);
 };
 //BA.debugLineNum = 1653;BA.debugLine="Return Path1.SubString2(0,L)";
if (true) return _path1.substring((int) (0),_l);
 //BA.debugLineNum = 1654;BA.debugLine="End Sub";
return "";
}
public static String  _getidfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
com.ab.banano.BANanoElement _cureve = null;
String _id = "";
 //BA.debugLineNum = 135;BA.debugLine="Sub GetIDFromEvent(e As BANanoEvent) As String";
 //BA.debugLineNum = 136;BA.debugLine="Dim curEve As BANanoElement = BANano.ToElement(e.";
_cureve = new com.ab.banano.BANanoElement();
_cureve = _banano.ToElement(_e.OtherField("currentTarget"));
 //BA.debugLineNum = 137;BA.debugLine="Dim ID As String = curEve.GetField(\"id\").Result";
_id = BA.ObjectToString(_cureve.GetField("id").Result());
 //BA.debugLineNum = 138;BA.debugLine="Return ID";
if (true) return _id;
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public static String  _getkeyfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
com.ab.banano.BANanoElement _cureve = null;
String _id = "";
 //BA.debugLineNum = 142;BA.debugLine="Sub GetKeyFromEvent(e As BANanoEvent) As String";
 //BA.debugLineNum = 143;BA.debugLine="Dim curEve As BANanoElement = BANano.ToElement(e.";
_cureve = new com.ab.banano.BANanoElement();
_cureve = _banano.ToElement(_e.OtherField("currentTarget"));
 //BA.debugLineNum = 144;BA.debugLine="Dim ID As String = curEve.GetField(\"key\").Result";
_id = BA.ObjectToString(_cureve.GetField("key").Result());
 //BA.debugLineNum = 145;BA.debugLine="Return ID";
if (true) return _id;
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _getlistofmapsproperty(anywheresoftware.b4a.objects.collections.List _lst,String _prop) throws Exception{
anywheresoftware.b4a.objects.collections.List _kc = null;
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _v = "";
 //BA.debugLineNum = 862;BA.debugLine="Sub GetListOfMapsProperty(lst As List, prop As Str";
 //BA.debugLineNum = 863;BA.debugLine="prop = prop.tolowercase";
_prop = _prop.toLowerCase();
 //BA.debugLineNum = 864;BA.debugLine="Dim kc As List";
_kc = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 865;BA.debugLine="kc.initialize";
_kc.Initialize();
 //BA.debugLineNum = 866;BA.debugLine="For Each rec As Map In lst";
_rec = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = _lst;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_rec = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group4.Get(index4)));
 //BA.debugLineNum = 867;BA.debugLine="Dim v As String = rec.Get(prop)";
_v = BA.ObjectToString(_rec.Get((Object)(_prop)));
 //BA.debugLineNum = 868;BA.debugLine="kc.add(v)";
_kc.Add((Object)(_v));
 }
};
 //BA.debugLineNum = 870;BA.debugLine="Return kc";
if (true) return _kc;
 //BA.debugLineNum = 871;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getmapkeys(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
Object _value = null;
 //BA.debugLineNum = 1298;BA.debugLine="Sub GetMapKeys(sourceMap As Map) As List";
 //BA.debugLineNum = 1299;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1300;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 1301;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 1302;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 1303;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 1304;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 1305;BA.debugLine="Dim value As Object = sourceMap.GetKeyAt(iCnt)";
_value = _sourcemap.GetKeyAt(_icnt);
 //BA.debugLineNum = 1306;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
 //BA.debugLineNum = 1308;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 1309;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _getmapvalues(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
Object _value = null;
 //BA.debugLineNum = 1284;BA.debugLine="Sub GetMapValues(sourceMap As Map) As List";
 //BA.debugLineNum = 1285;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1286;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 1287;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 1288;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 1289;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 1290;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 1291;BA.debugLine="Dim value As Object = sourceMap.GetValueAt(iCnt)";
_value = _sourcemap.GetValueAt(_icnt);
 //BA.debugLineNum = 1292;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
 //BA.debugLineNum = 1294;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 1295;BA.debugLine="End Sub";
return null;
}
public static String  _getnumbers(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 1313;BA.debugLine="Public Sub GetNumbers(value As String) As String";
 //BA.debugLineNum = 1314;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 1315;BA.debugLine="Try";
try { //BA.debugLineNum = 1316;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 1317;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 1318;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 1319;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 1320;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 1321;BA.debugLine="For i = 0 To slen - 1";
{
final int step8 = 1;
final int limit8 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 1322;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 1323;BA.debugLine="If InStr(\"0123456789.-\", mout) <> -1 Then";
if (_instr("0123456789.-",_mout)!=-1) { 
 //BA.debugLineNum = 1324;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 1327;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 1329;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 1331;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _getoptionsfromkv(String _delim,String _k,String _v) throws Exception{
anywheresoftware.b4a.objects.collections.Map _no = null;
String[] _rkeys = null;
String[] _rvalues = null;
int _rtot = 0;
int _vtot = 0;
int _rcnt = 0;
String _k1 = "";
String _v1 = "";
 //BA.debugLineNum = 2090;BA.debugLine="Sub GetOptionsFromKV(delim As String, k As String,";
 //BA.debugLineNum = 2091;BA.debugLine="k = CStr(k)";
_k = _cstr((Object)(_k));
 //BA.debugLineNum = 2092;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 2093;BA.debugLine="Dim no As Map = CreateMap()";
_no = new anywheresoftware.b4a.objects.collections.Map();
_no = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 2094;BA.debugLine="Dim rkeys() As String = BANano.Split(delim, k)";
_rkeys = _banano.Split(_delim,_k);
 //BA.debugLineNum = 2095;BA.debugLine="Dim rvalues() As String = BANano.Split(delim, v)";
_rvalues = _banano.Split(_delim,_v);
 //BA.debugLineNum = 2097;BA.debugLine="Dim rTot As Int = rkeys.Length - 1";
_rtot = (int) (_rkeys.length-1);
 //BA.debugLineNum = 2098;BA.debugLine="Dim vTot As Int = rvalues.Length - 1";
_vtot = (int) (_rvalues.length-1);
 //BA.debugLineNum = 2100;BA.debugLine="If rTot <> vTot Then Return no";
if (_rtot!=_vtot) { 
if (true) return _no;};
 //BA.debugLineNum = 2102;BA.debugLine="Dim rCnt As Int";
_rcnt = 0;
 //BA.debugLineNum = 2103;BA.debugLine="For rCnt = 0 To rTot";
{
final int step10 = 1;
final int limit10 = _rtot;
_rcnt = (int) (0) ;
for (;_rcnt <= limit10 ;_rcnt = _rcnt + step10 ) {
 //BA.debugLineNum = 2104;BA.debugLine="Dim k1 As String = rkeys(rCnt)";
_k1 = _rkeys[_rcnt];
 //BA.debugLineNum = 2105;BA.debugLine="Dim v1 As String = rvalues(rCnt)";
_v1 = _rvalues[_rcnt];
 //BA.debugLineNum = 2106;BA.debugLine="no.put(k1, v1)";
_no.Put((Object)(_k1),(Object)(_v1));
 }
};
 //BA.debugLineNum = 2108;BA.debugLine="Return no";
if (true) return _no;
 //BA.debugLineNum = 2109;BA.debugLine="End Sub";
return null;
}
public static String  _getreadystate() throws Exception{
String _rs = "";
 //BA.debugLineNum = 286;BA.debugLine="Sub GetReadyState As String";
 //BA.debugLineNum = 287;BA.debugLine="Dim rs As String = BANano.Window.GetField(\"docume";
_rs = BA.ObjectToString(_banano.Window().GetField("document").GetField("readyState").Result());
 //BA.debugLineNum = 288;BA.debugLine="Return rs";
if (true) return _rs;
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return "";
}
public static b4j.example.bananoshared._fileobject  _getselectedfileobject(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.List _filelist = null;
anywheresoftware.b4a.objects.collections.Map _fileo = null;
b4j.example.bananoshared._fileobject _fo = null;
 //BA.debugLineNum = 2489;BA.debugLine="Sub GetSelectedFileObject(e As BANanoEvent) As Fil";
 //BA.debugLineNum = 2491;BA.debugLine="Dim fileList As List = GetFileListFromTarget(e)";
_filelist = new anywheresoftware.b4a.objects.collections.List();
_filelist = _getfilelistfromtarget(_e);
 //BA.debugLineNum = 2492;BA.debugLine="If fileList.size = 0 Then Return Null";
if (_filelist.getSize()==0) { 
if (true) return (b4j.example.bananoshared._fileobject)(anywheresoftware.b4a.keywords.Common.Null);};
 //BA.debugLineNum = 2494;BA.debugLine="Dim fileO As Map = fileList.Get(0)";
_fileo = new anywheresoftware.b4a.objects.collections.Map();
_fileo = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_filelist.Get((int) (0))));
 //BA.debugLineNum = 2495;BA.debugLine="Dim fo As FileObject = GetFileDetails(fileO)";
_fo = _getfiledetails(_fileo);
 //BA.debugLineNum = 2496;BA.debugLine="Return fo";
if (true) return _fo;
 //BA.debugLineNum = 2497;BA.debugLine="End Sub";
return null;
}
public static com.ab.banano.BANanoObject  _gettargetfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
com.ab.banano.BANanoObject _ovalue = null;
 //BA.debugLineNum = 160;BA.debugLine="Sub GetTargetFromEvent(e As BANanoEvent) As BANano";
 //BA.debugLineNum = 161;BA.debugLine="Dim oValue As BANanoObject = e.OtherField(\"target";
_ovalue = new com.ab.banano.BANanoObject();
_ovalue = _e.OtherField("target");
 //BA.debugLineNum = 162;BA.debugLine="Return oValue";
if (true) return _ovalue;
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public static String  _gettargetpropertyfromevent(com.ab.banano.BANanoEvent _e,String _prop) throws Exception{
Object _ovalue = null;
 //BA.debugLineNum = 154;BA.debugLine="Sub GetTargetPropertyFromEvent(e As BANanoEvent, p";
 //BA.debugLineNum = 155;BA.debugLine="Dim oValue As Object = e.OtherField(\"target\").Get";
_ovalue = _e.OtherField("target").GetField(_prop).Result();
 //BA.debugLineNum = 156;BA.debugLine="Return oValue";
if (true) return BA.ObjectToString(_ovalue);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public static String  _gettargetvaluefromevent(com.ab.banano.BANanoEvent _e) throws Exception{
Object _ovalue = null;
 //BA.debugLineNum = 149;BA.debugLine="Sub GetTargetValueFromEvent(e As BANanoEvent) As S";
 //BA.debugLineNum = 150;BA.debugLine="Dim oValue As Object = e.OtherField(\"target\").Get";
_ovalue = _e.OtherField("target").GetField("value").Result();
 //BA.debugLineNum = 151;BA.debugLine="Return oValue";
if (true) return BA.ObjectToString(_ovalue);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public static String  _getuploadfilename(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.List _filelist = null;
anywheresoftware.b4a.objects.collections.Map _fileo = null;
b4j.example.bananoshared._fileobject _fo = null;
String _sfilename = "";
 //BA.debugLineNum = 2476;BA.debugLine="Sub GetUploadFileName(e As BANanoEvent) As String";
 //BA.debugLineNum = 2478;BA.debugLine="Dim fileList As List = GetFileListFromTarget(e)";
_filelist = new anywheresoftware.b4a.objects.collections.List();
_filelist = _getfilelistfromtarget(_e);
 //BA.debugLineNum = 2479;BA.debugLine="If fileList.size = 0 Then Return \"\"";
if (_filelist.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 2481;BA.debugLine="Dim fileO As Map = fileList.Get(0)";
_fileo = new anywheresoftware.b4a.objects.collections.Map();
_fileo = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_filelist.Get((int) (0))));
 //BA.debugLineNum = 2483;BA.debugLine="Dim fo As FileObject = GetFileDetails(fileO)";
_fo = _getfiledetails(_fileo);
 //BA.debugLineNum = 2484;BA.debugLine="Dim sFileName As String = fo.FileName";
_sfilename = _fo.FileName /*String*/ ;
 //BA.debugLineNum = 2485;BA.debugLine="Return sFileName";
if (true) return _sfilename;
 //BA.debugLineNum = 2486;BA.debugLine="End Sub";
return "";
}
public static String  _getuploadresult(String _filename,Object _rslt) throws Exception{
String _sfilename = "";
anywheresoftware.b4a.objects.collections.Map _res = null;
String _sresult = "";
 //BA.debugLineNum = 2447;BA.debugLine="Sub GetUploadResult(fileName As String, rslt As Ob";
 //BA.debugLineNum = 2449;BA.debugLine="Dim sFileName As String";
_sfilename = "";
 //BA.debugLineNum = 2450;BA.debugLine="Dim res As Map = BANano.fromjson(rslt)";
_res = new anywheresoftware.b4a.objects.collections.Map();
_res = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_banano.FromJson(_rslt)));
 //BA.debugLineNum = 2451;BA.debugLine="Dim sResult As String = res.get(\"status\")";
_sresult = BA.ObjectToString(_res.Get((Object)("status")));
 //BA.debugLineNum = 2452;BA.debugLine="Select Case sResult";
switch (BA.switchObjectToInt(_sresult,"success","error")) {
case 0: {
 //BA.debugLineNum = 2454;BA.debugLine="sFileName = $\"./assets/${fileName}\"$";
_sfilename = ("./assets/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+"");
 break; }
case 1: {
 //BA.debugLineNum = 2456;BA.debugLine="sFileName = \"\"";
_sfilename = "";
 break; }
}
;
 //BA.debugLineNum = 2458;BA.debugLine="Return sFileName";
if (true) return _sfilename;
 //BA.debugLineNum = 2459;BA.debugLine="End Sub";
return "";
}
public static String  _hideelement(String _elid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _stylem = null;
 //BA.debugLineNum = 2302;BA.debugLine="Sub HideElement(elID As String)";
 //BA.debugLineNum = 2303;BA.debugLine="Dim stylem As Map = CreateMap(\"visibility\":\"hidde";
_stylem = new anywheresoftware.b4a.objects.collections.Map();
_stylem = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("visibility"),(Object)("hidden")});
 //BA.debugLineNum = 2304;BA.debugLine="BANano.GetElement($\"#${elID}\"$).SetStyle(BANano.T";
_banano.GetElement(("#"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_elid))+"")).SetStyle(BA.ObjectToString(_banano.ToJson((Object)(_stylem.getObject()))));
 //BA.debugLineNum = 2305;BA.debugLine="End Sub";
return "";
}
public static String  _hr() throws Exception{
 //BA.debugLineNum = 1466;BA.debugLine="Sub HR As String";
 //BA.debugLineNum = 1467;BA.debugLine="Return \"<hr>\"";
if (true) return "<hr>";
 //BA.debugLineNum = 1468;BA.debugLine="End Sub";
return "";
}
public static String  _httpupload(Object _fileobj,Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
String _error = "";
String _json = "";
 //BA.debugLineNum = 587;BA.debugLine="Sub HTTPUpload(fileObj As Object, module As Object";
 //BA.debugLineNum = 588;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 590;BA.debugLine="Dim Error As String";
_error = "";
 //BA.debugLineNum = 591;BA.debugLine="Dim json As String";
_json = "";
 //BA.debugLineNum = 594;BA.debugLine="promise.CallSub(Me, \"DoUpload\", Array(fileObj))";
_promise.CallSub(bananoshared.getObject(),"DoUpload",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fileobj}));
 //BA.debugLineNum = 595;BA.debugLine="promise.ThenWait(json)";
_promise.ThenWait((Object)(_json));
 //BA.debugLineNum = 596;BA.debugLine="BANano.CallSub(module, methodname, Array(fileObj,";
_banano.CallSub(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fileobj,(Object)(_json)}));
 //BA.debugLineNum = 597;BA.debugLine="promise.ElseWait(Error)  'ignore";
_promise.ElseWait((Object)(_error));
 //BA.debugLineNum = 598;BA.debugLine="BANano.CallSub(module, methodname, Array(fileObj,";
_banano.CallSub(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fileobj,(Object)(_error)}));
 //BA.debugLineNum = 599;BA.debugLine="promise.End";
_promise.End();
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return "";
}
public static String  _inquotes(String _svalue) throws Exception{
 //BA.debugLineNum = 1235;BA.debugLine="Public Sub InQuotes(sValue As String) As String";
 //BA.debugLineNum = 1236;BA.debugLine="Return QUOTE & sValue & QUOTE";
if (true) return anywheresoftware.b4a.keywords.Common.QUOTE+_svalue+anywheresoftware.b4a.keywords.Common.QUOTE;
 //BA.debugLineNum = 1237;BA.debugLine="End Sub";
return "";
}
public static int  _instr(String _text,String _sfind) throws Exception{
 //BA.debugLineNum = 640;BA.debugLine="Sub InStr(Text As String, sFind As String) As Int";
 //BA.debugLineNum = 641;BA.debugLine="Return Text.tolowercase.IndexOf(sFind.tolowercase";
if (true) return _text.toLowerCase().indexOf(_sfind.toLowerCase());
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return 0;
}
public static long  _instrrev(String _value,String _search) throws Exception{
 //BA.debugLineNum = 841;BA.debugLine="Sub InStrRev(value As String, search As String) As";
 //BA.debugLineNum = 842;BA.debugLine="Return value.LastIndexOf(search) + 1";
if (true) return (long) (_value.lastIndexOf(_search)+1);
 //BA.debugLineNum = 843;BA.debugLine="End Sub";
return 0L;
}
public static String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbx = null;
String _fld = "";
 //BA.debugLineNum = 231;BA.debugLine="Sub Join(delimiter As String, lst As List) As Stri";
 //BA.debugLineNum = 232;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 233;BA.debugLine="Dim sbx As StringBuilder";
_sbx = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 234;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 235;BA.debugLine="sbx.Initialize";
_sbx.Initialize();
 //BA.debugLineNum = 236;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 237;BA.debugLine="sbx.Append(fld)";
_sbx.Append(_fld);
 //BA.debugLineNum = 238;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 239;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 240;BA.debugLine="sbx.Append(delimiter).Append(fld)";
_sbx.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 242;BA.debugLine="Return sbx.ToString";
if (true) return _sbx.ToString();
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public static String  _joinfields(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 2052;BA.debugLine="Sub JoinFields(delimiter As String, lst As List) A";
 //BA.debugLineNum = 2053;BA.debugLine="If lst.Size = 0 Then Return \"\"";
if (_lst.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 2054;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 2055;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2056;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 2057;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2058;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 2059;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 2060;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 2061;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 2062;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 2063;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 2064;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 2066;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 2067;BA.debugLine="End Sub";
return "";
}
public static String  _joinfields1(String _delimiter,String _squote,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
String _xfld = "";
 //BA.debugLineNum = 2070;BA.debugLine="Sub JoinFields1(delimiter As String, sQuote As Str";
 //BA.debugLineNum = 2071;BA.debugLine="If lst.Size = 0 Then Return \"\"";
if (_lst.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 2072;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 2073;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2074;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 2075;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2076;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 2077;BA.debugLine="Dim xfld As String = $\"${fld}\"$";
_xfld = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fld))+"");
 //BA.debugLineNum = 2078;BA.debugLine="xfld = sQuote & xfld & sQuote";
_xfld = _squote+_xfld+_squote;
 //BA.debugLineNum = 2079;BA.debugLine="sb.Append(xfld)";
_sb.Append(_xfld);
 //BA.debugLineNum = 2080;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 2081;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 2082;BA.debugLine="Dim xfld As String = $\"${fld}\"$";
_xfld = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fld))+"");
 //BA.debugLineNum = 2083;BA.debugLine="xfld = sQuote & xfld & sQuote";
_xfld = _squote+_xfld+_squote;
 //BA.debugLineNum = 2084;BA.debugLine="sb.Append(delimiter).Append(xfld)";
_sb.Append(_delimiter).Append(_xfld);
 }
};
 //BA.debugLineNum = 2086;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 2087;BA.debugLine="End Sub";
return "";
}
public static String  _joinitems(String _delimiter,String _squote,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
String _xfld = "";
 //BA.debugLineNum = 2225;BA.debugLine="Sub JoinItems(delimiter As String, sQuote As Strin";
 //BA.debugLineNum = 2226;BA.debugLine="If lst.Size = 0 Then Return \"\"";
if (_lst.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 2227;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 2228;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2229;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 2230;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2231;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 2232;BA.debugLine="Dim xfld As String = $\"${fld}\"$";
_xfld = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fld))+"");
 //BA.debugLineNum = 2233;BA.debugLine="xfld = sQuote & xfld & sQuote";
_xfld = _squote+_xfld+_squote;
 //BA.debugLineNum = 2234;BA.debugLine="sb.Append(xfld)";
_sb.Append(_xfld);
 //BA.debugLineNum = 2235;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 2236;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 2237;BA.debugLine="Dim xfld As String = $\"${fld}\"$";
_xfld = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fld))+"");
 //BA.debugLineNum = 2238;BA.debugLine="xfld = sQuote & xfld & sQuote";
_xfld = _squote+_xfld+_squote;
 //BA.debugLineNum = 2239;BA.debugLine="sb.Append(delimiter).Append(xfld)";
_sb.Append(_delimiter).Append(_xfld);
 }
};
 //BA.debugLineNum = 2241;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 2242;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _joinlists(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
anywheresoftware.b4a.objects.collections.List _lo = null;
Object _k = null;
 //BA.debugLineNum = 686;BA.debugLine="Sub JoinLists(lst As List) As List";
 //BA.debugLineNum = 687;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 688;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 689;BA.debugLine="For Each lo As List In lst";
_lo = new anywheresoftware.b4a.objects.collections.List();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_lo = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(group3.Get(index3)));
 //BA.debugLineNum = 690;BA.debugLine="For Each k As Object In lo";
{
final anywheresoftware.b4a.BA.IterableList group4 = _lo;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = group4.Get(index4);
 //BA.debugLineNum = 691;BA.debugLine="nl.Add(k)";
_nl.Add(_k);
 }
};
 }
};
 //BA.debugLineNum = 694;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 695;BA.debugLine="End Sub";
return null;
}
public static String  _joinmapkeys(anywheresoftware.b4a.objects.collections.Map _m,String _delim) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strkey = "";
 //BA.debugLineNum = 405;BA.debugLine="Sub JoinMapKeys(m As Map, delim As String) As Stri";
 //BA.debugLineNum = 406;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 407;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 408;BA.debugLine="Dim kTot As Int = m.Size - 1";
_ktot = (int) (_m.getSize()-1);
 //BA.debugLineNum = 409;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 410;BA.debugLine="Dim strKey As String = m.getkeyat(0)";
_strkey = BA.ObjectToString(_m.GetKeyAt((int) (0)));
 //BA.debugLineNum = 411;BA.debugLine="sb.Append(strKey)";
_sb.Append(_strkey);
 //BA.debugLineNum = 412;BA.debugLine="For kCnt = 1 To kTot";
{
final int step7 = 1;
final int limit7 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit7 ;_kcnt = _kcnt + step7 ) {
 //BA.debugLineNum = 413;BA.debugLine="Dim strKey As String = m.getkeyat(kCnt)";
_strkey = BA.ObjectToString(_m.GetKeyAt(_kcnt));
 //BA.debugLineNum = 414;BA.debugLine="sb.Append(delim).append(strKey)";
_sb.Append(_delim).Append(_strkey);
 }
};
 //BA.debugLineNum = 416;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _joinmaps(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
anywheresoftware.b4a.objects.collections.Map _mr = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 673;BA.debugLine="Sub JoinMaps(lst As List) As Map";
 //BA.debugLineNum = 674;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 675;BA.debugLine="If lst.Size = 0 Then Return nm";
if (_lst.getSize()==0) { 
if (true) return _nm;};
 //BA.debugLineNum = 676;BA.debugLine="For Each mr As Map In lst";
_mr = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_mr = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 677;BA.debugLine="For Each k As String In mr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _mr.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 678;BA.debugLine="Dim v As Object = mr.Get(k)";
_v = _mr.Get((Object)(_k));
 //BA.debugLineNum = 679;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 }
};
 //BA.debugLineNum = 682;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
return null;
}
public static String  _joinnonblanks(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _str = "";
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 645;BA.debugLine="Sub JoinNonBlanks(delimiter As String, lst As List";
 //BA.debugLineNum = 646;BA.debugLine="If lst.size = 0 Then Return \"\"";
if (_lst.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 648;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 649;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 650;BA.debugLine="For Each str As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group4 = _lst;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_str = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 651;BA.debugLine="str = str.Trim";
_str = _str.trim();
 //BA.debugLineNum = 652;BA.debugLine="If str.Length > 0 Then";
if (_str.length()>0) { 
 //BA.debugLineNum = 653;BA.debugLine="nl.Add(str)";
_nl.Add((Object)(_str));
 };
 }
};
 //BA.debugLineNum = 656;BA.debugLine="If nl.Size = 0 Then Return \"\"";
if (_nl.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 658;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 659;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 660;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 661;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 662;BA.debugLine="fld = nl.Get(0)";
_fld = BA.ObjectToString(_nl.Get((int) (0)));
 //BA.debugLineNum = 663;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 664;BA.debugLine="For i = 1 To nl.size - 1";
{
final int step17 = 1;
final int limit17 = (int) (_nl.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
 //BA.debugLineNum = 665;BA.debugLine="Dim fld As String = nl.Get(i)";
_fld = BA.ObjectToString(_nl.Get(_i));
 //BA.debugLineNum = 666;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 668;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 669;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _json2list(String _strvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
com.ab.banano.BANanoJSONParser _parser = null;
 //BA.debugLineNum = 1051;BA.debugLine="Sub Json2List(strValue As String) As List";
 //BA.debugLineNum = 1052;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1053;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1054;BA.debugLine="lst.clear";
_lst.Clear();
 //BA.debugLineNum = 1055;BA.debugLine="If strValue.Length = 0 Then";
if (_strvalue.length()==0) { 
 //BA.debugLineNum = 1056;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 1058;BA.debugLine="Try";
try { //BA.debugLineNum = 1059;BA.debugLine="Dim parser As BANanoJSONParser";
_parser = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 1060;BA.debugLine="parser.Initialize(strValue)";
_parser.Initialize(_strvalue);
 //BA.debugLineNum = 1061;BA.debugLine="Return parser.NextArray";
if (true) return _parser.NextArray();
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 1063;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 1065;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 993;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 994;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 995;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 996;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 997;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 998;BA.debugLine="Try";
try { //BA.debugLineNum = 999;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 1000;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
 //BA.debugLineNum = 1001;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
 //BA.debugLineNum = 1003;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 1005;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 1007;BA.debugLine="End Sub";
return null;
}
public static String  _jsonpretty(Object _m) throws Exception{
String _pretty = "";
 //BA.debugLineNum = 625;BA.debugLine="Sub JSONPretty(m As Object) As String";
 //BA.debugLineNum = 626;BA.debugLine="Dim pretty As String = BANano.RunJavascriptMethod";
_pretty = BA.ObjectToString(_banano.RunJavascriptMethod("JSON.stringify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_m,anywheresoftware.b4a.keywords.Common.Null,(Object)(4)})));
 //BA.debugLineNum = 627;BA.debugLine="Return pretty";
if (true) return _pretty;
 //BA.debugLineNum = 628;BA.debugLine="End Sub";
return "";
}
public static String  _jsonsetproperty(String _sjson,anywheresoftware.b4a.objects.collections.Map _updates) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _k = "";
Object _v = null;
String _sout = "";
 //BA.debugLineNum = 1439;BA.debugLine="Sub JSONSetProperty(sjson As String, updates As Ma";
 //BA.debugLineNum = 1440;BA.debugLine="Dim m As Map = BANano.FromJson(sjson)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_banano.FromJson((Object)(_sjson))));
 //BA.debugLineNum = 1441;BA.debugLine="For Each k As String In updates.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _updates.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1442;BA.debugLine="Dim v As Object = updates.Get(k)";
_v = _updates.Get((Object)(_k));
 //BA.debugLineNum = 1443;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1445;BA.debugLine="Dim sout As String = BANano.ToJson(m)";
_sout = BA.ObjectToString(_banano.ToJson((Object)(_m.getObject())));
 //BA.debugLineNum = 1446;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 1447;BA.debugLine="End Sub";
return "";
}
public static String  _jsonvalues2lowercase(String _sjson,anywheresoftware.b4a.objects.collections.List _props) throws Exception{
anywheresoftware.b4a.objects.collections.Map _jmap = null;
String _njson = "";
 //BA.debugLineNum = 969;BA.debugLine="Sub JSONValues2LowerCase(sJSON As String, props As";
 //BA.debugLineNum = 971;BA.debugLine="Dim jmap As Map = Json2Map(sJSON)";
_jmap = new anywheresoftware.b4a.objects.collections.Map();
_jmap = _json2map(_sjson);
 //BA.debugLineNum = 972;BA.debugLine="MapValues2LowerCase(jmap, props)";
_mapvalues2lowercase(_jmap,_props);
 //BA.debugLineNum = 973;BA.debugLine="Dim nJSON As String = Map2Json(jmap)";
_njson = _map2json(_jmap);
 //BA.debugLineNum = 974;BA.debugLine="Return nJSON";
if (true) return _njson;
 //BA.debugLineNum = 975;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _keyvalues2map(String _delim,String _keys,String _values) throws Exception{
anywheresoftware.b4a.objects.collections.List _rkeys = null;
anywheresoftware.b4a.objects.collections.List _rvalues = null;
anywheresoftware.b4a.objects.collections.Map _optm = null;
int _rtot = 0;
int _vtot = 0;
int _rcnt = 0;
String _k = "";
String _v = "";
 //BA.debugLineNum = 464;BA.debugLine="Sub KeyValues2Map(delim As String, keys As String,";
 //BA.debugLineNum = 465;BA.debugLine="Dim rkeys As List = StrParse(delim, keys)";
_rkeys = new anywheresoftware.b4a.objects.collections.List();
_rkeys = _strparse(_delim,_keys);
 //BA.debugLineNum = 466;BA.debugLine="Dim rvalues As List = StrParse(delim, values)";
_rvalues = new anywheresoftware.b4a.objects.collections.List();
_rvalues = _strparse(_delim,_values);
 //BA.debugLineNum = 468;BA.debugLine="Dim optm As Map = CreateMap()";
_optm = new anywheresoftware.b4a.objects.collections.Map();
_optm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 470;BA.debugLine="Dim rTot As Int = rkeys.Size -1";
_rtot = (int) (_rkeys.getSize()-1);
 //BA.debugLineNum = 471;BA.debugLine="Dim vTot As Int = rvalues.Size - 1";
_vtot = (int) (_rvalues.getSize()-1);
 //BA.debugLineNum = 472;BA.debugLine="If rTot <> vTot Then";
if (_rtot!=_vtot) { 
 }else {
 //BA.debugLineNum = 474;BA.debugLine="Dim rCnt As Int";
_rcnt = 0;
 //BA.debugLineNum = 475;BA.debugLine="For rCnt = 0 To rTot";
{
final int step9 = 1;
final int limit9 = _rtot;
_rcnt = (int) (0) ;
for (;_rcnt <= limit9 ;_rcnt = _rcnt + step9 ) {
 //BA.debugLineNum = 476;BA.debugLine="Dim k As String = rkeys.Get(rCnt)";
_k = BA.ObjectToString(_rkeys.Get(_rcnt));
 //BA.debugLineNum = 477;BA.debugLine="Dim v As String = rvalues.Get(rCnt)";
_v = BA.ObjectToString(_rvalues.Get(_rcnt));
 //BA.debugLineNum = 478;BA.debugLine="optm.put(k, v)";
_optm.Put((Object)(_k),(Object)(_v));
 }
};
 };
 //BA.debugLineNum = 481;BA.debugLine="Return optm";
if (true) return _optm;
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return null;
}
public static String  _lcase(String _text) throws Exception{
 //BA.debugLineNum = 1231;BA.debugLine="Sub LCase(Text As String) As String";
 //BA.debugLineNum = 1232;BA.debugLine="Return Text.ToLowerCase";
if (true) return _text.toLowerCase();
 //BA.debugLineNum = 1233;BA.debugLine="End Sub";
return "";
}
public static String  _leftstring(String _text,long _llength) throws Exception{
 //BA.debugLineNum = 1194;BA.debugLine="Sub LeftString(Text As String, lLength As Long)As";
 //BA.debugLineNum = 1195;BA.debugLine="If lLength>Text.Length Then lLength=Text.Length";
if (_llength>_text.length()) { 
_llength = (long) (_text.length());};
 //BA.debugLineNum = 1196;BA.debugLine="Return Text.SubString2(0, lLength)";
if (true) return _text.substring((int) (0),(int) (_llength));
 //BA.debugLineNum = 1197;BA.debugLine="End Sub";
return "";
}
public static int  _len(String _text) throws Exception{
 //BA.debugLineNum = 847;BA.debugLine="Sub Len(Text As String) As Int";
 //BA.debugLineNum = 848;BA.debugLine="Return Text.Length";
if (true) return _text.length();
 //BA.debugLineNum = 849;BA.debugLine="End Sub";
return 0;
}
public static String[]  _list2array(anywheresoftware.b4a.objects.collections.List _a_lstargs) throws Exception{
String[] _arrargs = null;
int _i = 0;
 //BA.debugLineNum = 1104;BA.debugLine="Sub List2Array (a_lstArgs As List) As String()";
 //BA.debugLineNum = 1105;BA.debugLine="Dim arrArgs(a_lstArgs.Size) As String";
_arrargs = new String[_a_lstargs.getSize()];
java.util.Arrays.fill(_arrargs,"");
 //BA.debugLineNum = 1106;BA.debugLine="For i = 0 To arrArgs.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_arrargs.length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 1107;BA.debugLine="arrArgs(i) = a_lstArgs.Get(i)";
_arrargs[_i] = BA.ObjectToString(_a_lstargs.Get(_i));
 }
};
 //BA.debugLineNum = 1109;BA.debugLine="Return arrArgs";
if (true) return _arrargs;
 //BA.debugLineNum = 1110;BA.debugLine="End Sub";
return null;
}
public static String  _list2arrayvariable(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 949;BA.debugLine="Sub List2ArrayVariable(lst As List) As String";
 //BA.debugLineNum = 950;BA.debugLine="If lst.Size = 0 Then";
if (_lst.getSize()==0) { 
 //BA.debugLineNum = 951;BA.debugLine="Return $\"\"\"\"$";
if (true) return ("\"\"");
 };
 //BA.debugLineNum = 953;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 954;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 955;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 956;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 957;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 958;BA.debugLine="fld = $\"\"${fld}\"\"$";
_fld = ("\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fld))+"\"");
 //BA.debugLineNum = 959;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 960;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 961;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 962;BA.debugLine="fld = $\"\"${fld}\"\"$";
_fld = ("\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fld))+"\"");
 //BA.debugLineNum = 963;BA.debugLine="sb.Append(\",\").Append(fld)";
_sb.Append(",").Append(_fld);
 }
};
 //BA.debugLineNum = 965;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 966;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _list2idvalue(anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
String _mv1 = "";
String _mv2 = "";
anywheresoftware.b4a.objects.collections.List _nlst = null;
anywheresoftware.b4a.objects.collections.Map _dict = null;
String _mk = "";
String _mv = "";
anywheresoftware.b4a.objects.collections.Map _nm = null;
 //BA.debugLineNum = 933;BA.debugLine="Sub List2IDValue(lst As List, mapValues As List) A";
 //BA.debugLineNum = 934;BA.debugLine="Dim mv1 As String = mapValues.get(0)";
_mv1 = BA.ObjectToString(_mapvalues.Get((int) (0)));
 //BA.debugLineNum = 935;BA.debugLine="Dim mv2 As String = mapValues.get(1)";
_mv2 = BA.ObjectToString(_mapvalues.Get((int) (1)));
 //BA.debugLineNum = 936;BA.debugLine="Dim nlst As List";
_nlst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 937;BA.debugLine="nlst.initialize";
_nlst.Initialize();
 //BA.debugLineNum = 938;BA.debugLine="For Each dict As Map In lst";
_dict = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _lst;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_dict = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
 //BA.debugLineNum = 939;BA.debugLine="Dim mk As String = dict.get(mv1)";
_mk = BA.ObjectToString(_dict.Get((Object)(_mv1)));
 //BA.debugLineNum = 940;BA.debugLine="Dim mv As String = dict.get(mv2)";
_mv = BA.ObjectToString(_dict.Get((Object)(_mv2)));
 //BA.debugLineNum = 941;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 942;BA.debugLine="nm.Put(\"id\", mk)";
_nm.Put((Object)("id"),(Object)(_mk));
 //BA.debugLineNum = 943;BA.debugLine="nm.put(\"value\", mv)";
_nm.Put((Object)("value"),(Object)(_mv));
 //BA.debugLineNum = 944;BA.debugLine="nlst.Add(nm)";
_nlst.Add((Object)(_nm.getObject()));
 }
};
 //BA.debugLineNum = 946;BA.debugLine="Return nlst";
if (true) return _nlst;
 //BA.debugLineNum = 947;BA.debugLine="End Sub";
return null;
}
public static String  _list2json(anywheresoftware.b4a.objects.collections.List _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 1044;BA.debugLine="Sub List2Json(mp As List) As String";
 //BA.debugLineNum = 1045;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 1046;BA.debugLine="JSON.Initialize2(mp)";
_json.Initialize2(_mp);
 //BA.debugLineNum = 1047;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 1048;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _list2keyvalues(anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
 //BA.debugLineNum = 928;BA.debugLine="Sub List2KeyValues(lst As List, mapvalues As List)";
 //BA.debugLineNum = 929;BA.debugLine="Return List2IDValue(lst, mapvalues)";
if (true) return _list2idvalue(_lst,_mapvalues);
 //BA.debugLineNum = 930;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _list2map(anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
 //BA.debugLineNum = 1395;BA.debugLine="Sub List2Map(lst As List, keyName As String, value";
 //BA.debugLineNum = 1396;BA.debugLine="Return List2Options(lst, keyName, valueName)";
if (true) return _list2options(_lst,_keyname,_valuename);
 //BA.debugLineNum = 1397;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _list2mapsimple(anywheresoftware.b4a.objects.collections.List _lst,boolean _bsort) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
 //BA.debugLineNum = 1371;BA.debugLine="Sub List2MapSimple(lst As List, bSort As Boolean)";
 //BA.debugLineNum = 1372;BA.debugLine="If bSort Then lst.Sort(True)";
if (_bsort) { 
_lst.Sort(anywheresoftware.b4a.keywords.Common.True);};
 //BA.debugLineNum = 1373;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1374;BA.debugLine="For Each k As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1375;BA.debugLine="nm.Put(k, k)";
_nm.Put((Object)(_k),(Object)(_k));
 }
};
 //BA.debugLineNum = 1377;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1378;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _list2options(anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
anywheresoftware.b4a.objects.collections.Map _nrec = null;
 //BA.debugLineNum = 1382;BA.debugLine="Sub List2Options(lst As List, keyName As String, v";
 //BA.debugLineNum = 1383;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1384;BA.debugLine="recs.Initialize";
_recs.Initialize();
 //BA.debugLineNum = 1385;BA.debugLine="For Each k As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1386;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1387;BA.debugLine="nrec.Put(keyName, k)";
_nrec.Put((Object)(_keyname),(Object)(_k));
 //BA.debugLineNum = 1388;BA.debugLine="nrec.Put(valueName, k)";
_nrec.Put((Object)(_valuename),(Object)(_k));
 //BA.debugLineNum = 1389;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 1391;BA.debugLine="Return recs";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_recs.getObject()));
 //BA.debugLineNum = 1392;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _listofmap2strings(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.Map _nm = null;
 //BA.debugLineNum = 2361;BA.debugLine="Sub ListOfMap2Strings(lst As List) As List";
 //BA.debugLineNum = 2362;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2363;BA.debugLine="nl = NewList";
_nl = _newlist();
 //BA.debugLineNum = 2364;BA.debugLine="For Each m As Map In lst";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 2365;BA.debugLine="Dim nm As Map = Map2Strings(m)";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = _map2strings(_m);
 //BA.debugLineNum = 2366;BA.debugLine="nl.Add(nm)";
_nl.Add((Object)(_nm.getObject()));
 }
};
 //BA.debugLineNum = 2368;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 2369;BA.debugLine="End Sub";
return null;
}
public static int  _listofmapsrecordpos(anywheresoftware.b4a.objects.collections.List _lst,String _k,String _v) throws Exception{
int _ltot = 0;
int _lcnt = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _sk = "";
 //BA.debugLineNum = 436;BA.debugLine="Sub ListOfMapsRecordPos(lst As List, k As String,";
 //BA.debugLineNum = 437;BA.debugLine="Dim lTot As Int = lst.Size - 1";
_ltot = (int) (_lst.getSize()-1);
 //BA.debugLineNum = 438;BA.debugLine="Dim lCnt As Int";
_lcnt = 0;
 //BA.debugLineNum = 439;BA.debugLine="For lCnt = 0 To lTot";
{
final int step3 = 1;
final int limit3 = _ltot;
_lcnt = (int) (0) ;
for (;_lcnt <= limit3 ;_lcnt = _lcnt + step3 ) {
 //BA.debugLineNum = 440;BA.debugLine="Dim m As Map = lst.Get(lCnt)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_lst.Get(_lcnt)));
 //BA.debugLineNum = 441;BA.debugLine="Dim sk As String = m.GetDefault(k, \"\")";
_sk = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 442;BA.debugLine="If sk.EqualsIgnoreCase(v) Then";
if (_sk.equalsIgnoreCase(_v)) { 
 //BA.debugLineNum = 443;BA.debugLine="Return lCnt";
if (true) return _lcnt;
 };
 }
};
 //BA.debugLineNum = 446;BA.debugLine="Return -1";
if (true) return (int) (-1);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return 0;
}
public static anywheresoftware.b4a.objects.collections.List  _listremoveduplicates(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nd = null;
String _k = "";
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 504;BA.debugLine="Sub ListRemoveDuplicates(lst As List) As List";
 //BA.debugLineNum = 505;BA.debugLine="Dim nd As Map = CreateMap()";
_nd = new anywheresoftware.b4a.objects.collections.Map();
_nd = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 506;BA.debugLine="For Each k As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 507;BA.debugLine="nd.Put(k, k)";
_nd.Put((Object)(_k),(Object)(_k));
 }
};
 //BA.debugLineNum = 509;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 510;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 511;BA.debugLine="For Each k As String In nd.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _nd.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 512;BA.debugLine="nl.Add(k)";
_nl.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 514;BA.debugLine="nl.Sort(True)";
_nl.Sort(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 515;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return null;
}
public static String  _longdate(String _sdate) throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 1203;BA.debugLine="Sub LongDate(sDate As String) As String";
 //BA.debugLineNum = 1204;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1205;BA.debugLine="Try";
try { //BA.debugLineNum = 1206;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 1207;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 1208;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("EEEE, dd MMMM yyyy");
 //BA.debugLineNum = 1209;BA.debugLine="Return DateTime.Date(dt)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 1211;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 1213;BA.debugLine="End Sub";
return "";
}
public static String  _longdatetime(String _sdate) throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 1215;BA.debugLine="Sub LongDateTime(sDate As String) As String";
 //BA.debugLineNum = 1216;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1217;BA.debugLine="Try";
try { //BA.debugLineNum = 1218;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
 //BA.debugLineNum = 1219;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 1220;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("EEEE, dd MMMM yyyy HH:mm");
 //BA.debugLineNum = 1221;BA.debugLine="Return DateTime.Date(dt)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 1223;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 1225;BA.debugLine="End Sub";
return "";
}
public static String  _longdatetimetoday() throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 1612;BA.debugLine="Sub LongDateTimeToday() As String";
 //BA.debugLineNum = 1613;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
 //BA.debugLineNum = 1614;BA.debugLine="Dim dt As Long = DateTime.now";
_dt = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 1615;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy, HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yyyy, HH:mm");
 //BA.debugLineNum = 1616;BA.debugLine="Return DateTime.Date(dt)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_dt);
 //BA.debugLineNum = 1617;BA.debugLine="End Sub";
return "";
}
public static String  _loremipsum(String _count) throws Exception{
 //BA.debugLineNum = 419;BA.debugLine="Sub LoremIpsum(count As String) As String";
 //BA.debugLineNum = 420;BA.debugLine="Return Rand_LoremIpsum(count)";
if (true) return _rand_loremipsum((int)(Double.parseDouble(_count)));
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return "";
}
public static String  _makeboolean(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1742;BA.debugLine="Sub MakeBoolean(m As Map, xkeys As List)";
 //BA.debugLineNum = 1743;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1744;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1745;BA.debugLine="Dim v As String = m.GetDefault(k,\"0\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("0")));
 //BA.debugLineNum = 1746;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 1747;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 1748;BA.debugLine="Select Case v";
switch (BA.switchObjectToInt(_v,"","0","false","False",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False),BA.NumberToString(0),"no","No","1","true","True",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True),BA.NumberToString(1),"yes","Yes")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 1750;BA.debugLine="m.Put(k, False)";
_m.Put((Object)(_k),(Object)(anywheresoftware.b4a.keywords.Common.False));
 break; }
case 8: 
case 9: 
case 10: 
case 11: 
case 12: 
case 13: 
case 14: {
 //BA.debugLineNum = 1752;BA.debugLine="m.Put(k, True)";
_m.Put((Object)(_k),(Object)(anywheresoftware.b4a.keywords.Common.True));
 break; }
}
;
 };
 }
};
 //BA.debugLineNum = 1756;BA.debugLine="End Sub";
return "";
}
public static String  _makedate(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1780;BA.debugLine="Sub MakeDate(m As Map, xkeys As List)";
 //BA.debugLineNum = 1781;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1782;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1783;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 1784;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 1785;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 1786;BA.debugLine="v = MvField(v,1,\" \")";
_v = _mvfield(_v,(int) (1)," ");
 //BA.debugLineNum = 1787;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 1790;BA.debugLine="End Sub";
return "";
}
public static String  _makedouble(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1711;BA.debugLine="Sub MakeDouble(m As Map, xkeys As List)";
 //BA.debugLineNum = 1712;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1713;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1714;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 1715;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 1716;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 1717;BA.debugLine="If v = \"\" Then v = \"0\"";
if ((_v).equals("")) { 
_v = "0";};
 //BA.debugLineNum = 1718;BA.debugLine="v = BANano.parseFloat(v)";
_v = BA.NumberToString(_banano.parseFloat((Object)(_v)));
 //BA.debugLineNum = 1719;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 1722;BA.debugLine="End Sub";
return "";
}
public static String  _makeinteger(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1698;BA.debugLine="Sub MakeInteger(m As Map, xkeys As List)";
 //BA.debugLineNum = 1699;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1700;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1701;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 1702;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 1703;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 1704;BA.debugLine="If v = \"\" Then v = \"0\"";
if ((_v).equals("")) { 
_v = "0";};
 //BA.debugLineNum = 1705;BA.debugLine="v = BANano.parseInt(v)";
_v = BA.NumberToString(_banano.parseInt((Object)(_v)));
 //BA.debugLineNum = 1706;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 1709;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _makelowercase(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1770;BA.debugLine="Sub MakeLowerCase(m As Map) As Map";
 //BA.debugLineNum = 1771;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1772;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1773;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 1774;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 1775;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1777;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1778;BA.debugLine="End Sub";
return null;
}
public static String  _makemoney(String _svalue) throws Exception{
 //BA.debugLineNum = 1159;BA.debugLine="Sub MakeMoney(sValue As String) As String";
 //BA.debugLineNum = 1160;BA.debugLine="If sValue.Length = 0 Then Return \"0.00\"";
if (_svalue.length()==0) { 
if (true) return "0.00";};
 //BA.debugLineNum = 1161;BA.debugLine="If sValue = \"null\" Then sValue = \"0.00\"";
if ((_svalue).equals("null")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 1162;BA.debugLine="sValue = sValue.Replace(\",\",\"\")";
_svalue = _svalue.replace(",","");
 //BA.debugLineNum = 1163;BA.debugLine="sValue = Val(sValue)";
_svalue = _val(_svalue);
 //BA.debugLineNum = 1164;BA.debugLine="If sValue = \"0\" Then sValue = \"000\"";
if ((_svalue).equals("0")) { 
_svalue = "000";};
 //BA.debugLineNum = 1165;BA.debugLine="sValue = Round2(sValue,2)";
_svalue = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2((double)(Double.parseDouble(_svalue)),(int) (2)));
 //BA.debugLineNum = 1166;BA.debugLine="Return NumberFormat2(sValue, 1, 2, 2, True)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_svalue)),(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1167;BA.debugLine="End Sub";
return "";
}
public static String  _makepx(String _svalue) throws Exception{
 //BA.debugLineNum = 1487;BA.debugLine="Sub MakePx(sValue As String) As String";
 //BA.debugLineNum = 1488;BA.debugLine="sValue = sValue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 1489;BA.debugLine="If sValue.EndsWith(\"%\") Then";
if (_svalue.endsWith("%")) { 
 //BA.debugLineNum = 1490;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vm")) { 
 //BA.debugLineNum = 1492;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("px")) { 
 //BA.debugLineNum = 1494;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("cm")) { 
 //BA.debugLineNum = 1496;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("mm")) { 
 //BA.debugLineNum = 1498;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("in")) { 
 //BA.debugLineNum = 1500;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pt")) { 
 //BA.debugLineNum = 1502;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pc")) { 
 //BA.debugLineNum = 1504;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("em")) { 
 //BA.debugLineNum = 1506;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ex")) { 
 //BA.debugLineNum = 1508;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ch")) { 
 //BA.debugLineNum = 1510;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("rem")) { 
 //BA.debugLineNum = 1512;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vw")) { 
 //BA.debugLineNum = 1514;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vh")) { 
 //BA.debugLineNum = 1516;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmin")) { 
 //BA.debugLineNum = 1518;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmax")) { 
 //BA.debugLineNum = 1520;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith(";")) { 
 //BA.debugLineNum = 1522;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else {
 //BA.debugLineNum = 1524;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
_svalue = _svalue.replace("px","");
 //BA.debugLineNum = 1525;BA.debugLine="sValue = $\"${sValue}px\"$";
_svalue = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_svalue))+"px");
 //BA.debugLineNum = 1526;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
if ((_svalue).equals("px")) { 
_svalue = "";};
 //BA.debugLineNum = 1527;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 1529;BA.debugLine="End Sub";
return "";
}
public static String  _maketrim(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1759;BA.debugLine="Sub MakeTrim(m As Map, xkeys As List)";
 //BA.debugLineNum = 1760;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1761;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1762;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 1763;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 1764;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 1765;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 1768;BA.debugLine="End Sub";
return "";
}
public static String  _makeyesno(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1724;BA.debugLine="Sub MakeYesNo(m As Map, xkeys As List)";
 //BA.debugLineNum = 1725;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1726;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1727;BA.debugLine="Dim v As String = m.GetDefault(k,\"No\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("No")));
 //BA.debugLineNum = 1728;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 1729;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 1730;BA.debugLine="Select Case v";
switch (BA.switchObjectToInt(_v,"","0","false","False",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False),BA.NumberToString(0),"no","No","1","true","True",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True),BA.NumberToString(1),"yes","Yes")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 1732;BA.debugLine="m.Put(k, \"No\")";
_m.Put((Object)(_k),(Object)("No"));
 break; }
case 8: 
case 9: 
case 10: 
case 11: 
case 12: 
case 13: 
case 14: {
 //BA.debugLineNum = 1734;BA.debugLine="m.Put(k, \"Yes\")";
_m.Put((Object)(_k),(Object)("Yes"));
 break; }
}
;
 };
 }
};
 //BA.debugLineNum = 1738;BA.debugLine="End Sub";
return "";
}
public static String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 979;BA.debugLine="Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 980;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 981;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 982;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 983;BA.debugLine="End Sub";
return "";
}
public static String  _map2jsonpretty(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 985;BA.debugLine="Sub Map2JsonPretty(mp As Map) As String";
 //BA.debugLineNum = 986;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 987;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 988;BA.debugLine="Return JSON.ToPrettyString(4)";
if (true) return _json.ToPrettyString((int) (4));
 //BA.debugLineNum = 989;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _map2options(anywheresoftware.b4a.objects.collections.Map _m,String _keyname,String _valuename) throws Exception{
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
Object _v = null;
anywheresoftware.b4a.objects.collections.Map _nrec = null;
 //BA.debugLineNum = 1400;BA.debugLine="Sub Map2Options(m As Map, keyName As String, value";
 //BA.debugLineNum = 1401;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1402;BA.debugLine="recs.Initialize";
_recs.Initialize();
 //BA.debugLineNum = 1403;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1404;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 1405;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1406;BA.debugLine="nrec.Put(keyName, k)";
_nrec.Put((Object)(_keyname),(Object)(_k));
 //BA.debugLineNum = 1407;BA.debugLine="nrec.Put(valueName, v)";
_nrec.Put((Object)(_valuename),_v);
 //BA.debugLineNum = 1408;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 1410;BA.debugLine="Return recs";
if (true) return _recs;
 //BA.debugLineNum = 1411;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _map2strings(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
String _vv = "";
 //BA.debugLineNum = 2373;BA.debugLine="Sub Map2Strings(m As Map) As Map";
 //BA.debugLineNum = 2374;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 2375;BA.debugLine="For Each k As String In m.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2376;BA.debugLine="Dim v As Object = m.get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 2377;BA.debugLine="If BANano.IsNull(v) Then v = \"\"";
if (_banano.IsNull(_v)) { 
_v = (Object)("");};
 //BA.debugLineNum = 2378;BA.debugLine="If BANano.IsUndefined(v) Then v = \"\"";
if (_banano.IsUndefined(_v)) { 
_v = (Object)("");};
 //BA.debugLineNum = 2379;BA.debugLine="Dim vv As String = CStr(v)";
_vv = _cstr(_v);
 //BA.debugLineNum = 2380;BA.debugLine="nm.put(k, vv)";
_nm.Put((Object)(_k),(Object)(_vv));
 }
};
 //BA.debugLineNum = 2382;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 2383;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _mapclone(anywheresoftware.b4a.objects.collections.Map _oldmap) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1414;BA.debugLine="Sub MapClone(oldMap As Map) As Map";
 //BA.debugLineNum = 1415;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1416;BA.debugLine="For Each k As String In oldMap.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _oldmap.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1417;BA.debugLine="Dim v As Object = oldMap.Get(k)";
_v = _oldmap.Get((Object)(_k));
 //BA.debugLineNum = 1418;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1420;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1421;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _mapcloneswap(anywheresoftware.b4a.objects.collections.Map _oldmap) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1424;BA.debugLine="Sub MapCloneSwap(oldMap As Map) As Map";
 //BA.debugLineNum = 1425;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1426;BA.debugLine="For Each k As String In oldMap.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _oldmap.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1427;BA.debugLine="Dim v As Object = oldMap.Get(k)";
_v = _oldmap.Get((Object)(_k));
 //BA.debugLineNum = 1428;BA.debugLine="nm.Put(v, k)";
_nm.Put(_v,(Object)(_k));
 }
};
 //BA.debugLineNum = 1430;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1431;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _mapkeys2list(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
String _k = "";
 //BA.debugLineNum = 699;BA.debugLine="Sub MapKeys2List(m As Map) As List";
 //BA.debugLineNum = 700;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 701;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 702;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 703;BA.debugLine="lst.Add(k)";
_lst.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 705;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 706;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _mapkeyslowercaselist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 1272;BA.debugLine="Sub MapKeysLowerCaseList(lst As List) As List";
 //BA.debugLineNum = 1273;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1274;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 1275;BA.debugLine="For Each rec As Map In lst";
_rec = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_rec = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 1276;BA.debugLine="rec = MapKeysLowerCaseSingle(rec)";
_rec = _mapkeyslowercasesingle(_rec);
 //BA.debugLineNum = 1277;BA.debugLine="nl.Add(rec)";
_nl.Add((Object)(_rec.getObject()));
 }
};
 //BA.debugLineNum = 1279;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 1280;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _mapkeyslowercasesingle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1261;BA.debugLine="Sub MapKeysLowerCaseSingle(m As Map) As Map";
 //BA.debugLineNum = 1262;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1263;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1264;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 1265;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 1266;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1268;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1269;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _mapremoveprefix(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
String _v = "";
 //BA.debugLineNum = 2408;BA.debugLine="Sub MapRemovePrefix(m As Map) As Map";
 //BA.debugLineNum = 2409;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 2410;BA.debugLine="For Each k As String In m.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2411;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 2412;BA.debugLine="k = MvField(k,2,\"_\")";
_k = _mvfield(_k,(int) (2),"_");
 //BA.debugLineNum = 2413;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),(Object)(_v));
 }
};
 //BA.debugLineNum = 2415;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 2416;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _mapvalues2list(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
String _k = "";
 //BA.debugLineNum = 709;BA.debugLine="Sub MapValues2List(m As Map) As List";
 //BA.debugLineNum = 710;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 711;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 712;BA.debugLine="For Each k As String In m.values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 713;BA.debugLine="lst.Add(k)";
_lst.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 715;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 716;BA.debugLine="End Sub";
return null;
}
public static String  _mapvalues2lowercase(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _props) throws Exception{
String _prop = "";
String _v = "";
 //BA.debugLineNum = 1068;BA.debugLine="Sub MapValues2LowerCase(m As Map, props As List)";
 //BA.debugLineNum = 1069;BA.debugLine="For Each prop As String In props";
{
final anywheresoftware.b4a.BA.IterableList group1 = _props;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_prop = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1070;BA.debugLine="If m.ContainsKey(prop) Then";
if (_m.ContainsKey((Object)(_prop))) { 
 //BA.debugLineNum = 1071;BA.debugLine="Dim v As String = m.GetDefault(prop,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_prop),(Object)("")));
 //BA.debugLineNum = 1072;BA.debugLine="v = v.tolowercase";
_v = _v.toLowerCase();
 //BA.debugLineNum = 1073;BA.debugLine="m.Put(prop,v)";
_m.Put((Object)(_prop),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 1076;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _mergemaps(anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _om = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1356;BA.debugLine="Sub MergeMaps(oldm As Map, newm As Map) As Map";
 //BA.debugLineNum = 1357;BA.debugLine="Dim om As Map = CreateMap()";
_om = new anywheresoftware.b4a.objects.collections.Map();
_om = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1358;BA.debugLine="For Each k As String In oldm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _oldm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1359;BA.debugLine="Dim v As Object = oldm.Get(k)";
_v = _oldm.Get((Object)(_k));
 //BA.debugLineNum = 1360;BA.debugLine="om.Put(k, v)";
_om.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1363;BA.debugLine="For Each k As String In newm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _newm.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 1364;BA.debugLine="Dim v As Object = newm.Get(k)";
_v = _newm.Get((Object)(_k));
 //BA.debugLineNum = 1365;BA.debugLine="om.Put(k, v)";
_om.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1367;BA.debugLine="Return om";
if (true) return _om;
 //BA.debugLineNum = 1368;BA.debugLine="End Sub";
return null;
}
public static String  _midstring(String _text,int _start,int _llength) throws Exception{
 //BA.debugLineNum = 1181;BA.debugLine="Sub MidString(Text As String, Start As Int, lLengt";
 //BA.debugLineNum = 1182;BA.debugLine="Return Text.SubString2(Start-1,Start+lLength-1)";
if (true) return _text.substring((int) (_start-1),(int) (_start+_llength-1));
 //BA.debugLineNum = 1183;BA.debugLine="End Sub";
return "";
}
public static String  _midstring2(String _text,int _start) throws Exception{
 //BA.debugLineNum = 1185;BA.debugLine="Sub MidString2(Text As String, Start As Int) As St";
 //BA.debugLineNum = 1186;BA.debugLine="Return Text.SubString(Start-1)";
if (true) return _text.substring((int) (_start-1));
 //BA.debugLineNum = 1187;BA.debugLine="End Sub";
return "";
}
public static String  _monthadd(String _mdate,int _howmanymonths) throws Exception{
long _convertdate = 0L;
long _newdateday = 0L;
 //BA.debugLineNum = 760;BA.debugLine="Sub MonthAdd(mDate As String, HowManyMonths As Int";
 //BA.debugLineNum = 761;BA.debugLine="HowManyMonths = BANano.parseInt(HowManyMonths)";
_howmanymonths = _banano.parseInt((Object)(_howmanymonths));
 //BA.debugLineNum = 762;BA.debugLine="Dim ConvertDate, NewDateDay As Long";
_convertdate = 0L;
_newdateday = 0L;
 //BA.debugLineNum = 763;BA.debugLine="ConvertDate = DateTime.DateParse(mDate)";
_convertdate = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_mdate);
 //BA.debugLineNum = 764;BA.debugLine="NewDateDay = DateTime.Add(ConvertDate, 0, HowMany";
_newdateday = anywheresoftware.b4a.keywords.Common.DateTime.Add(_convertdate,(int) (0),_howmanymonths,(int) (0));
 //BA.debugLineNum = 765;BA.debugLine="Return DateTime.Date(NewDateDay)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_newdateday);
 //BA.debugLineNum = 766;BA.debugLine="End Sub";
return "";
}
public static String  _monthnow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 743;BA.debugLine="Public Sub MonthNow() As String";
 //BA.debugLineNum = 744;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 745;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 746;BA.debugLine="lNow = DateTime.Now";
_lnow = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 747;BA.debugLine="DateTime.DateFormat = \"M\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("M");
 //BA.debugLineNum = 748;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = anywheresoftware.b4a.keywords.Common.DateTime.Date(_lnow);
 //BA.debugLineNum = 749;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 750;BA.debugLine="End Sub";
return "";
}
public static int  _mvcount(String _strmv,String _delimiter) throws Exception{
String[] _spvalues = null;
 //BA.debugLineNum = 1553;BA.debugLine="Sub MvCount(strMV As String, Delimiter As String)";
 //BA.debugLineNum = 1554;BA.debugLine="Dim spValues() As String = BANano.Split(Delimiter";
_spvalues = _banano.Split(_delimiter,_strmv);
 //BA.debugLineNum = 1555;BA.debugLine="Return spValues.Length";
if (true) return _spvalues.length;
 //BA.debugLineNum = 1556;BA.debugLine="End Sub";
return 0;
}
public static String  _mvdistinct(String _delim,String _strmv) throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _mi = null;
String _k = "";
anywheresoftware.b4a.objects.collections.List _nl = null;
String _sout = "";
 //BA.debugLineNum = 449;BA.debugLine="Sub MvDistinct(delim As String, strmv As String) A";
 //BA.debugLineNum = 450;BA.debugLine="Dim items As List = StrParse(delim, strmv)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = _strparse(_delim,_strmv);
 //BA.debugLineNum = 451;BA.debugLine="Dim mi As Map = CreateMap()";
_mi = new anywheresoftware.b4a.objects.collections.Map();
_mi = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 452;BA.debugLine="For Each k As String In items";
{
final anywheresoftware.b4a.BA.IterableList group3 = _items;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 453;BA.debugLine="mi.Put(k, k)";
_mi.Put((Object)(_k),(Object)(_k));
 }
};
 //BA.debugLineNum = 455;BA.debugLine="Dim nl As List = NewList";
_nl = new anywheresoftware.b4a.objects.collections.List();
_nl = _newlist();
 //BA.debugLineNum = 456;BA.debugLine="For Each k As String In mi.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _mi.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 457;BA.debugLine="nl.Add(k)";
_nl.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 459;BA.debugLine="Dim sout As String = Join(delim, nl)";
_sout = _join(_delim,_nl);
 //BA.debugLineNum = 460;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return "";
}
public static String  _mvfield(String _svalue,int _iposition,String _delimiter) throws Exception{
int _xpos = 0;
anywheresoftware.b4a.objects.collections.List _mvalues = null;
int _tvalues = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
 //BA.debugLineNum = 1804;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
 //BA.debugLineNum = 1805;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1806;BA.debugLine="Dim xPos As Int = sValue.IndexOf(Delimiter)";
_xpos = _svalue.indexOf(_delimiter);
 //BA.debugLineNum = 1807;BA.debugLine="If xPos = -1 Then Return sValue";
if (_xpos==-1) { 
if (true) return _svalue;};
 //BA.debugLineNum = 1808;BA.debugLine="Dim mValues As List = StrParse(Delimiter,sValue)";
_mvalues = new anywheresoftware.b4a.objects.collections.List();
_mvalues = _strparse(_delimiter,_svalue);
 //BA.debugLineNum = 1809;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
 //BA.debugLineNum = 1810;BA.debugLine="tValues = mValues.size -1";
_tvalues = (int) (_mvalues.getSize()-1);
 //BA.debugLineNum = 1811;BA.debugLine="Select Case iPosition";
switch (BA.switchObjectToInt(_iposition,(int) (-1),(int) (-2),(int) (-3))) {
case 0: {
 //BA.debugLineNum = 1813;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 break; }
case 1: {
 //BA.debugLineNum = 1815;BA.debugLine="Return mValues.get(tValues - 1)";
if (true) return BA.ObjectToString(_mvalues.Get((int) (_tvalues-1)));
 break; }
case 2: {
 //BA.debugLineNum = 1817;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1818;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1819;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
 //BA.debugLineNum = 1820;BA.debugLine="sb.Append(mValues.Get(1))";
_sb.Append(BA.ObjectToString(_mvalues.Get((int) (1))));
 //BA.debugLineNum = 1821;BA.debugLine="For startcnt = 2 To tValues";
{
final int step17 = 1;
final int limit17 = _tvalues;
_startcnt = (int) (2) ;
for (;_startcnt <= limit17 ;_startcnt = _startcnt + step17 ) {
 //BA.debugLineNum = 1822;BA.debugLine="sb.Append(Delimiter)";
_sb.Append(_delimiter);
 //BA.debugLineNum = 1823;BA.debugLine="sb.Append(mValues.get(startcnt))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_startcnt)));
 }
};
 //BA.debugLineNum = 1825;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 break; }
default: {
 //BA.debugLineNum = 1827;BA.debugLine="iPosition = iPosition - 1";
_iposition = (int) (_iposition-1);
 //BA.debugLineNum = 1828;BA.debugLine="If iPosition <= -1 Then";
if (_iposition<=-1) { 
 //BA.debugLineNum = 1829;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 };
 //BA.debugLineNum = 1831;BA.debugLine="If iPosition > tValues Then";
if (_iposition>_tvalues) { 
 //BA.debugLineNum = 1832;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 1834;BA.debugLine="Return mValues.get(iPosition)";
if (true) return BA.ObjectToString(_mvalues.Get(_iposition));
 break; }
}
;
 //BA.debugLineNum = 1836;BA.debugLine="End Sub";
return "";
}
public static String  _mvquoteitems(String _delim,String _mvstring) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbout = null;
anywheresoftware.b4a.objects.collections.List _litems = null;
String _k = "";
String _sout = "";
 //BA.debugLineNum = 255;BA.debugLine="Sub MVQuoteItems(delim As String, mvstring As Stri";
 //BA.debugLineNum = 256;BA.debugLine="Dim sbOut As StringBuilder";
_sbout = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 257;BA.debugLine="sbOut.Initialize";
_sbout.Initialize();
 //BA.debugLineNum = 258;BA.debugLine="Dim lItems As List = StrParse(delim, mvstring)";
_litems = new anywheresoftware.b4a.objects.collections.List();
_litems = _strparse(_delim,_mvstring);
 //BA.debugLineNum = 259;BA.debugLine="For Each k As String In lItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _litems;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 260;BA.debugLine="k = CStr(k)";
_k = _cstr((Object)(_k));
 //BA.debugLineNum = 261;BA.debugLine="k = k.Trim";
_k = _k.trim();
 //BA.debugLineNum = 262;BA.debugLine="sbOut.Append($\"\"${k}\"\"$).Append(delim)";
_sbout.Append(("\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_k))+"\"")).Append(_delim);
 }
};
 //BA.debugLineNum = 264;BA.debugLine="Dim sout As String = sbOut.ToString";
_sout = _sbout.ToString();
 //BA.debugLineNum = 265;BA.debugLine="sout = RemDelim(sout, delim)";
_sout = _remdelim(_sout,_delim);
 //BA.debugLineNum = 266;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return "";
}
public static String  _mvsinglequoteitems(String _delim,String _mvstring) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbout = null;
anywheresoftware.b4a.objects.collections.List _litems = null;
String _k = "";
String _sout = "";
 //BA.debugLineNum = 270;BA.debugLine="Sub MVSingleQuoteItems(delim As String, mvstring A";
 //BA.debugLineNum = 271;BA.debugLine="Dim sbOut As StringBuilder";
_sbout = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 272;BA.debugLine="sbOut.Initialize";
_sbout.Initialize();
 //BA.debugLineNum = 273;BA.debugLine="Dim lItems As List = StrParse(delim, mvstring)";
_litems = new anywheresoftware.b4a.objects.collections.List();
_litems = _strparse(_delim,_mvstring);
 //BA.debugLineNum = 274;BA.debugLine="For Each k As String In lItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _litems;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 275;BA.debugLine="k = CStr(k)";
_k = _cstr((Object)(_k));
 //BA.debugLineNum = 276;BA.debugLine="k = k.Trim";
_k = _k.trim();
 //BA.debugLineNum = 277;BA.debugLine="sbOut.Append($\"'${k}'\"$).Append(delim)";
_sbout.Append(("'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_k))+"'")).Append(_delim);
 }
};
 //BA.debugLineNum = 279;BA.debugLine="Dim sout As String = sbOut.ToString";
_sout = _sbout.ToString();
 //BA.debugLineNum = 280;BA.debugLine="sout = RemDelim(sout, delim)";
_sout = _remdelim(_sout,_delim);
 //BA.debugLineNum = 281;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _newb4xlist(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 112;BA.debugLine="Sub NewB4xList(items As List) As List";
 //BA.debugLineNum = 113;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 114;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 115;BA.debugLine="nl.AddAll(items)";
_nl.AddAll(_items);
 //BA.debugLineNum = 116;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public static com.ab.banano.BANanoObject  _newdate(int _year,int _month,int _day) throws Exception{
com.ab.banano.BANanoObject _dd = null;
 //BA.debugLineNum = 1009;BA.debugLine="Sub NewDate(year As Int, month As Int, day As Int)";
 //BA.debugLineNum = 1010;BA.debugLine="Dim dd As BANanoObject";
_dd = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 1011;BA.debugLine="dd.Initialize2(\"Date\", Array(year, month, day))";
_dd.Initialize2("Date",(Object)(new Object[]{(Object)(_year),(Object)(_month),(Object)(_day)}));
 //BA.debugLineNum = 1012;BA.debugLine="Return dd";
if (true) return _dd;
 //BA.debugLineNum = 1013;BA.debugLine="End Sub";
return null;
}
public static com.ab.banano.BANanoObject  _newdatetime(int _year,int _month,int _day,int _hour,int _minute) throws Exception{
com.ab.banano.BANanoObject _dd = null;
 //BA.debugLineNum = 1015;BA.debugLine="Sub NewDateTime(year As Int, month As Int, day As";
 //BA.debugLineNum = 1016;BA.debugLine="Dim dd As BANanoObject";
_dd = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 1017;BA.debugLine="dd.Initialize2(\"Date\", Array(year, month, day, ho";
_dd.Initialize2("Date",(Object)(new Object[]{(Object)(_year),(Object)(_month),(Object)(_day),(Object)(_hour),(Object)(_minute)}));
 //BA.debugLineNum = 1018;BA.debugLine="Return dd";
if (true) return _dd;
 //BA.debugLineNum = 1019;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _newlist() throws Exception{
anywheresoftware.b4a.objects.collections.List _elx = null;
 //BA.debugLineNum = 119;BA.debugLine="Sub NewList As List";
 //BA.debugLineNum = 120;BA.debugLine="Dim elx As List";
_elx = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 121;BA.debugLine="elx.Initialize";
_elx.Initialize();
 //BA.debugLineNum = 122;BA.debugLine="Return elx";
if (true) return _elx;
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _newlist1(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 126;BA.debugLine="Sub NewList1(items As List) As List";
 //BA.debugLineNum = 127;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 128;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 129;BA.debugLine="nl.AddAll(items)";
_nl.AddAll(_items);
 //BA.debugLineNum = 130;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _newmap() throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
 //BA.debugLineNum = 484;BA.debugLine="Sub NewMap As Map";
 //BA.debugLineNum = 485;BA.debugLine="Dim nm As Map";
_nm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 486;BA.debugLine="nm.Initialize";
_nm.Initialize();
 //BA.debugLineNum = 487;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return null;
}
public static int  _numberofdaysbetweendates(String _currentdate,String _otherdate) throws Exception{
long _currdate = 0L;
long _othdate = 0L;
long _tpd = 0L;
long _iout = 0L;
 //BA.debugLineNum = 771;BA.debugLine="Sub NumberOfDaysBetweenDates(CurrentDate As String";
 //BA.debugLineNum = 772;BA.debugLine="Dim CurrDate, OthDate As Long";
_currdate = 0L;
_othdate = 0L;
 //BA.debugLineNum = 773;BA.debugLine="CurrDate = DateTime.DateParse(CurrentDate)";
_currdate = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_currentdate);
 //BA.debugLineNum = 774;BA.debugLine="OthDate = DateTime.DateParse(OtherDate)";
_othdate = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_otherdate);
 //BA.debugLineNum = 775;BA.debugLine="Dim tpd As Long = DateTime.TicksPerDay";
_tpd = anywheresoftware.b4a.keywords.Common.DateTime.TicksPerDay;
 //BA.debugLineNum = 776;BA.debugLine="Dim iOut As Long = (CurrDate - OthDate)/tpd";
_iout = (long) ((_currdate-_othdate)/(double)_tpd);
 //BA.debugLineNum = 777;BA.debugLine="Return iOut";
if (true) return (int) (_iout);
 //BA.debugLineNum = 778;BA.debugLine="End Sub";
return 0;
}
public static String  _numbersuffix(double _n) throws Exception{
String[] _suffix = null;
int _thousands = 0;
int _maxdecimalplaces = 0;
double _relativeerror = 0;
 //BA.debugLineNum = 1078;BA.debugLine="Sub NumberSuffix(N As Double) As String";
 //BA.debugLineNum = 1079;BA.debugLine="If N < 0 Then";
if (_n<0) { 
 //BA.debugLineNum = 1080;BA.debugLine="Return \"-\" & NumberSuffix(-N)";
if (true) return "-"+_numbersuffix(-_n);
 };
 //BA.debugLineNum = 1082;BA.debugLine="Dim Suffix() As String = Array As String(\"\", \"k\",";
_suffix = new String[]{"","k","M","B","T"};
 //BA.debugLineNum = 1083;BA.debugLine="Dim Thousands As Int = 0";
_thousands = (int) (0);
 //BA.debugLineNum = 1084;BA.debugLine="Do While N >= 1000 And Thousands < Suffix.Length";
while (_n>=1000 && _thousands<_suffix.length-1) {
 //BA.debugLineNum = 1085;BA.debugLine="Thousands = Thousands + 1";
_thousands = (int) (_thousands+1);
 //BA.debugLineNum = 1086;BA.debugLine="N = N / 1000";
_n = _n/(double)1000;
 }
;
 //BA.debugLineNum = 1088;BA.debugLine="If Thousands = 0 Then";
if (_thousands==0) { 
 //BA.debugLineNum = 1089;BA.debugLine="Return NumberFormat2(N, 1, 2, 2, False)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat2(_n,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 1092;BA.debugLine="Dim MaxDecimalPlaces As Int = 0";
_maxdecimalplaces = (int) (0);
 //BA.debugLineNum = 1093;BA.debugLine="Do While MaxDecimalPlaces < 5";
while (_maxdecimalplaces<5) {
 //BA.debugLineNum = 1094;BA.debugLine="Dim RelativeError As Double = Abs(N - Round2(N,";
_relativeerror = anywheresoftware.b4a.keywords.Common.Abs(_n-anywheresoftware.b4a.keywords.Common.Round2(_n,_maxdecimalplaces))/(double)_n;
 //BA.debugLineNum = 1095;BA.debugLine="If RelativeError < 0.007 Then";
if (_relativeerror<0.007) { 
 //BA.debugLineNum = 1096;BA.debugLine="Exit";
if (true) break;
 };
 //BA.debugLineNum = 1098;BA.debugLine="MaxDecimalPlaces = MaxDecimalPlaces + 1";
_maxdecimalplaces = (int) (_maxdecimalplaces+1);
 }
;
 //BA.debugLineNum = 1100;BA.debugLine="Return NumberFormat2(N, 1, 0, MaxDecimalPlaces, F";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat2(_n,(int) (1),(int) (0),_maxdecimalplaces,anywheresoftware.b4a.keywords.Common.False)+_suffix[_thousands];
 //BA.debugLineNum = 1101;BA.debugLine="End Sub";
return "";
}
public static String  _numbertowords(long _n) throws Exception{
 //BA.debugLineNum = 2529;BA.debugLine="Sub NumberToWords(N As Long) As String";
 //BA.debugLineNum = 2530;BA.debugLine="If N < 0 Then";
if (_n<0) { 
 //BA.debugLineNum = 2531;BA.debugLine="Return \"Minus \" & NumberToWordsPositive(-N)";
if (true) return "Minus "+_numbertowordspositive((long) (-_n));
 }else {
 //BA.debugLineNum = 2533;BA.debugLine="Return NumberToWordsPositive(N)    'including ze";
if (true) return _numbertowordspositive(_n);
 };
 //BA.debugLineNum = 2535;BA.debugLine="End Sub";
return "";
}
public static String  _numbertowords100(int _n) throws Exception{
String _tens = "";
String _units = "";
 //BA.debugLineNum = 2595;BA.debugLine="private Sub NumberToWords100(N As Int) As String";
 //BA.debugLineNum = 2596;BA.debugLine="If N < 20 Then";
if (_n<20) { 
 //BA.debugLineNum = 2597;BA.debugLine="Return UnitWords(N)";
if (true) return _unitwords[_n];
 };
 //BA.debugLineNum = 2600;BA.debugLine="Dim Tens As String = TenWords(N / 10)    'Tens al";
_tens = _tenwords[(int) (_n/(double)10)];
 //BA.debugLineNum = 2601;BA.debugLine="Dim Units As String = UnitWords(N Mod 10)    'Uni";
_units = _unitwords[(int) (_n%10)];
 //BA.debugLineNum = 2603;BA.debugLine="If Units.Length = 0 Then";
if (_units.length()==0) { 
 //BA.debugLineNum = 2604;BA.debugLine="Return Tens";
if (true) return _tens;
 }else {
 //BA.debugLineNum = 2606;BA.debugLine="Return Tens & \"-\" & Units";
if (true) return _tens+"-"+_units;
 };
 //BA.debugLineNum = 2609;BA.debugLine="End Sub";
return "";
}
public static String  _numbertowords1000(int _n) throws Exception{
String _hundreds = "";
String _tensunits = "";
 //BA.debugLineNum = 2578;BA.debugLine="private Sub NumberToWords1000(N As Int) As String";
 //BA.debugLineNum = 2580;BA.debugLine="If N < 100 Then";
if (_n<100) { 
 //BA.debugLineNum = 2581;BA.debugLine="Return NumberToWords100(N)";
if (true) return _numbertowords100(_n);
 };
 //BA.debugLineNum = 2584;BA.debugLine="Dim Hundreds As String = UnitWords(N / 100) & \" H";
_hundreds = _unitwords[(int) (_n/(double)100)]+" Hundred";
 //BA.debugLineNum = 2585;BA.debugLine="Dim TensUnits As String = NumberToWords100(N Mod";
_tensunits = _numbertowords100((int) (_n%100));
 //BA.debugLineNum = 2587;BA.debugLine="If TensUnits.Length = 0 Then";
if (_tensunits.length()==0) { 
 //BA.debugLineNum = 2588;BA.debugLine="Return Hundreds";
if (true) return _hundreds;
 }else {
 //BA.debugLineNum = 2590;BA.debugLine="Return Hundreds & \" and \" & TensUnits";
if (true) return _hundreds+" and "+_tensunits;
 };
 //BA.debugLineNum = 2593;BA.debugLine="End Sub";
return "";
}
public static String  _numbertowordspositive(long _n) throws Exception{
int[] _groupsofthree = null;
int _numgroupsofthree = 0;
String _temp = "";
int _groupofthree = 0;
int _thisgroup = 0;
 //BA.debugLineNum = 2537;BA.debugLine="private Sub NumberToWordsPositive(N As Long) As St";
 //BA.debugLineNum = 2538;BA.debugLine="If N = 0 Then";
if (_n==0) { 
 //BA.debugLineNum = 2539;BA.debugLine="Return \"Zero\"    'that gets rid of that pesky sp";
if (true) return "Zero";
 };
 //BA.debugLineNum = 2542;BA.debugLine="Dim GroupsOfThree(10) As Int";
_groupsofthree = new int[(int) (10)];
;
 //BA.debugLineNum = 2544;BA.debugLine="Dim NumGroupsOfThree As Int = 0";
_numgroupsofthree = (int) (0);
 //BA.debugLineNum = 2546;BA.debugLine="Do While N <> 0";
while (_n!=0) {
 //BA.debugLineNum = 2547;BA.debugLine="GroupsOfThree(NumGroupsOfThree) = N Mod 1000";
_groupsofthree[_numgroupsofthree] = (int) (_n%1000);
 //BA.debugLineNum = 2548;BA.debugLine="NumGroupsOfThree = NumGroupsOfThree + 1";
_numgroupsofthree = (int) (_numgroupsofthree+1);
 //BA.debugLineNum = 2550;BA.debugLine="N = N / 1000";
_n = (long) (_n/(double)1000);
 }
;
 //BA.debugLineNum = 2553;BA.debugLine="Dim Temp As String = \"\"";
_temp = "";
 //BA.debugLineNum = 2554;BA.debugLine="For GroupOfThree = NumGroupsOfThree - 1 To 0 Step";
{
final int step12 = -1;
final int limit12 = (int) (0);
_groupofthree = (int) (_numgroupsofthree-1) ;
for (;_groupofthree >= limit12 ;_groupofthree = _groupofthree + step12 ) {
 //BA.debugLineNum = 2555;BA.debugLine="Dim ThisGroup As Int = GroupsOfThree(GroupOfThre";
_thisgroup = _groupsofthree[_groupofthree];
 //BA.debugLineNum = 2557;BA.debugLine="If ThisGroup <> 0 Then";
if (_thisgroup!=0) { 
 //BA.debugLineNum = 2558;BA.debugLine="If Temp.Length <> 0 Then";
if (_temp.length()!=0) { 
 //BA.debugLineNum = 2559;BA.debugLine="If GroupOfThree = 0 And ThisGroup < 100 Then";
if (_groupofthree==0 && _thisgroup<100) { 
 //BA.debugLineNum = 2560;BA.debugLine="Temp = Temp & \" and \"";
_temp = _temp+" and ";
 }else {
 //BA.debugLineNum = 2562;BA.debugLine="Temp = Temp & \", \"";
_temp = _temp+", ";
 };
 };
 //BA.debugLineNum = 2566;BA.debugLine="Temp = Temp & NumberToWords1000(ThisGroup)";
_temp = _temp+_numbertowords1000(_thisgroup);
 //BA.debugLineNum = 2568;BA.debugLine="If GroupOfThree <> 0 Then";
if (_groupofthree!=0) { 
 //BA.debugLineNum = 2569;BA.debugLine="Temp = Temp & \" \" & ThousandWords(GroupOfThree";
_temp = _temp+" "+_thousandwords[_groupofthree];
 };
 };
 }
};
 //BA.debugLineNum = 2574;BA.debugLine="Return Temp";
if (true) return _temp;
 //BA.debugLineNum = 2576;BA.debugLine="End Sub";
return "";
}
public static String  _onerror(anywheresoftware.b4a.objects.collections.Map _event) throws Exception{
com.ab.banano.BANanoObject _filereader = null;
com.ab.banano.BANanoObject _uploadedfile = null;
boolean _abort = false;
 //BA.debugLineNum = 2212;BA.debugLine="private Sub OnError(event As Map) As String 'ignor";
 //BA.debugLineNum = 2213;BA.debugLine="Dim FileReader As BANanoObject = event.Get(\"targe";
_filereader = new com.ab.banano.BANanoObject();
_filereader = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_event.Get((Object)("target"))));
 //BA.debugLineNum = 2214;BA.debugLine="Dim UploadedFile As BANanoObject = FileReader.Get";
_uploadedfile = new com.ab.banano.BANanoObject();
_uploadedfile = _filereader.GetField("file");
 //BA.debugLineNum = 2215;BA.debugLine="Dim Abort As Boolean = False";
_abort = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 2220;BA.debugLine="BANano.ReturnElse(CreateMap(\"name\": UploadedFile.";
_banano.ReturnElse((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)(_uploadedfile.GetField("name").getObject()),(Object)("result"),(Object)(_filereader.GetField("error").getObject()),(Object)("abort"),(Object)(_abort)}).getObject()));
 //BA.debugLineNum = 2221;BA.debugLine="End Sub";
return "";
}
public static String  _onload(anywheresoftware.b4a.objects.collections.Map _event) throws Exception{
com.ab.banano.BANanoObject _filereader = null;
com.ab.banano.BANanoObject _uploadedfile = null;
 //BA.debugLineNum = 2204;BA.debugLine="private Sub OnLoad(event As Map) As String 'ignore";
 //BA.debugLineNum = 2206;BA.debugLine="Dim FileReader As BANanoObject = event.Get(\"targe";
_filereader = new com.ab.banano.BANanoObject();
_filereader = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_event.Get((Object)("target"))));
 //BA.debugLineNum = 2207;BA.debugLine="Dim UploadedFile As BANanoObject = FileReader.Get";
_uploadedfile = new com.ab.banano.BANanoObject();
_uploadedfile = _filereader.GetField("file");
 //BA.debugLineNum = 2209;BA.debugLine="BANano.ReturnThen(CreateMap(\"name\": UploadedFile.";
_banano.ReturnThen((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("name"),(Object)(_uploadedfile.GetField("name").getObject()),(Object)("result"),(Object)(_filereader.GetField("result").getObject())}).getObject()));
 //BA.debugLineNum = 2210;BA.debugLine="End Sub";
return "";
}
public static String  _pad(String _value,int _maxlen,String _padchar,boolean _right) throws Exception{
int _intordnolen = 0;
int _i = 0;
 //BA.debugLineNum = 1021;BA.debugLine="Sub Pad(Value As String, MaxLen As Int, PadChar As";
 //BA.debugLineNum = 1022;BA.debugLine="Dim  intOrdNoLen As Int = Value.Length";
_intordnolen = _value.length();
 //BA.debugLineNum = 1023;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 1024;BA.debugLine="For i = 1 To (MaxLen - intOrdNoLen) Step 1";
{
final int step3 = 1;
final int limit3 = (int) ((_maxlen-_intordnolen));
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 1025;BA.debugLine="If right Then";
if (_right) { 
 //BA.debugLineNum = 1026;BA.debugLine="Value =  Value & PadChar";
_value = _value+_padchar;
 }else {
 //BA.debugLineNum = 1028;BA.debugLine="Value = PadChar & Value";
_value = _padchar+_value;
 };
 }
};
 //BA.debugLineNum = 1031;BA.debugLine="Return Value";
if (true) return _value;
 //BA.debugLineNum = 1032;BA.debugLine="End Sub";
return "";
}
public static String  _padright(String _value,int _maxlen,String _padchar) throws Exception{
int _intordnolen = 0;
int _i = 0;
 //BA.debugLineNum = 852;BA.debugLine="Sub PadRight(Value As String, MaxLen As Int, PadCh";
 //BA.debugLineNum = 853;BA.debugLine="Value = CStr(Value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 854;BA.debugLine="Dim intOrdNoLen As Int = Len(Value)";
_intordnolen = _len(_value);
 //BA.debugLineNum = 855;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 856;BA.debugLine="For i = 1 To (MaxLen - intOrdNoLen) Step 1";
{
final int step4 = 1;
final int limit4 = (int) ((_maxlen-_intordnolen));
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 857;BA.debugLine="Value = PadChar & Value";
_value = _padchar+_value;
 }
};
 //BA.debugLineNum = 859;BA.debugLine="Return Value";
if (true) return _value;
 //BA.debugLineNum = 860;BA.debugLine="End Sub";
return "";
}
public static String  _percentage(String _svalue) throws Exception{
 //BA.debugLineNum = 1169;BA.debugLine="Sub Percentage(sValue As String) As String";
 //BA.debugLineNum = 1170;BA.debugLine="If sValue = \"\" Then sValue = \"0.00\"";
if ((_svalue).equals("")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 1171;BA.debugLine="If sValue.Length = 0 Then Return \"0.00\"";
if (_svalue.length()==0) { 
if (true) return "0.00";};
 //BA.debugLineNum = 1172;BA.debugLine="If sValue = \"null\" Then sValue = \"0.00\"";
if ((_svalue).equals("null")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 1173;BA.debugLine="sValue = sValue.Replace(\",\",\"\")";
_svalue = _svalue.replace(",","");
 //BA.debugLineNum = 1174;BA.debugLine="sValue = Val(sValue)";
_svalue = _val(_svalue);
 //BA.debugLineNum = 1175;BA.debugLine="If sValue = \"0\" Then sValue = \"0.00\"";
if ((_svalue).equals("0")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 1176;BA.debugLine="sValue = Round2(sValue,2)";
_svalue = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2((double)(Double.parseDouble(_svalue)),(int) (2)));
 //BA.debugLineNum = 1177;BA.debugLine="sValue = sValue & \"%\"";
_svalue = _svalue+"%";
 //BA.debugLineNum = 1178;BA.debugLine="Return sValue";
if (true) return _svalue;
 //BA.debugLineNum = 1179;BA.debugLine="End Sub";
return "";
}
public static String  _priorityrag(int _dvalue) throws Exception{
 //BA.debugLineNum = 1931;BA.debugLine="Public Sub PriorityRAG(dValue As Int) As String";
 //BA.debugLineNum = 1932;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 1934;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
case 1: {
 //BA.debugLineNum = 1936;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 1938;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
default: {
 //BA.debugLineNum = 1940;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 1942;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 4;BA.debugLine="Dim UnitWords() As String = Array As String( _";
_unitwords = new String[]{"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
 //BA.debugLineNum = 11;BA.debugLine="Dim TenWords() As String = Array As String( _";
_tenwords = new String[]{"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
 //BA.debugLineNum = 17;BA.debugLine="Dim ThousandWords() As String = Array As String(";
_thousandwords = new String[]{"","Thousand","Million","Billion","Trillion","Quadrillion","Pentillion","Sexillion","Septillion","Octillion"};
 //BA.debugLineNum = 21;BA.debugLine="Type FileObject(FileName As String, FileDate As S";
;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _progressrag(double _dvariance) throws Exception{
 //BA.debugLineNum = 1894;BA.debugLine="Public Sub ProgressRAG(dVariance As Double) As Str";
 //BA.debugLineNum = 1895;BA.debugLine="If dVariance < 0 Then";
if (_dvariance<0) { 
 //BA.debugLineNum = 1896;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else if(_dvariance>0) { 
 //BA.debugLineNum = 1898;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else if(_dvariance==0) { 
 //BA.debugLineNum = 1900;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else {
 //BA.debugLineNum = 1902;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 };
 //BA.debugLineNum = 1904;BA.debugLine="End Sub";
return "";
}
public static int  _progressstatus(int _dvalue) throws Exception{
 //BA.debugLineNum = 2027;BA.debugLine="Sub ProgressStatus(dValue As Int) As Int";
 //BA.debugLineNum = 2028;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 100: {
 //BA.debugLineNum = 2030;BA.debugLine="Return 1";
if (true) return (int) (1);
 break; }
default: {
 //BA.debugLineNum = 2032;BA.debugLine="Return 0";
if (true) return (int) (0);
 break; }
}
;
 //BA.debugLineNum = 2034;BA.debugLine="End Sub";
return 0;
}
public static String  _projectdate(String _sdate) throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 805;BA.debugLine="Sub ProjectDate(sDate As String) As String";
 //BA.debugLineNum = 806;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 807;BA.debugLine="Try";
try { //BA.debugLineNum = 808;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 809;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 810;BA.debugLine="DateTime.DateFormat = \"dd-MMM-yyyy, EEE\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MMM-yyyy, EEE");
 //BA.debugLineNum = 811;BA.debugLine="Return DateTime.Date(dt)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 813;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 815;BA.debugLine="End Sub";
return "";
}
public static String  _projectdays(String _sdays) throws Exception{
 //BA.debugLineNum = 793;BA.debugLine="Sub ProjectDays(sDays As String) As String";
 //BA.debugLineNum = 794;BA.debugLine="Try";
try { //BA.debugLineNum = 795;BA.debugLine="sDays = sDays.trim";
_sdays = _sdays.trim();
 //BA.debugLineNum = 796;BA.debugLine="If sDays = \"\" Then sDays = \"0\"";
if ((_sdays).equals("")) { 
_sdays = "0";};
 //BA.debugLineNum = 797;BA.debugLine="sDays = sDays.Replace(\",\",\"\")";
_sdays = _sdays.replace(",","");
 //BA.debugLineNum = 798;BA.debugLine="sDays = NumberFormat2(sDays,0,0,0,True)";
_sdays = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_sdays)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 799;BA.debugLine="Return sDays & \" Dys\"";
if (true) return _sdays+" Dys";
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 801;BA.debugLine="Return \"0 Dys\"";
if (true) return "0 Dys";
 };
 //BA.debugLineNum = 803;BA.debugLine="End Sub";
return "";
}
public static String  _propercase(String _mystr) throws Exception{
String _x = "";
int _j = 0;
int _k = 0;
 //BA.debugLineNum = 1239;BA.debugLine="Sub ProperCase(myStr As String) As String";
 //BA.debugLineNum = 1240;BA.debugLine="Try";
try { //BA.debugLineNum = 1241;BA.debugLine="If myStr.trim.length = 0 Then Return \"\"";
if (_mystr.trim().length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 1242;BA.debugLine="Dim x As String";
_x = "";
 //BA.debugLineNum = 1243;BA.debugLine="Dim j, k As Int";
_j = 0;
_k = 0;
 //BA.debugLineNum = 1244;BA.debugLine="myStr = myStr.tolowercase";
_mystr = _mystr.toLowerCase();
 //BA.debugLineNum = 1245;BA.debugLine="x = myStr.ToUpperCase.CharAt(0)";
_x = BA.ObjectToString(_mystr.toUpperCase().charAt((int) (0)));
 //BA.debugLineNum = 1246;BA.debugLine="myStr = x & myStr.SubString2(1, myStr.Length)";
_mystr = _x+_mystr.substring((int) (1),_mystr.length());
 //BA.debugLineNum = 1247;BA.debugLine="For j = 1 To myStr.Length";
{
final int step8 = 1;
final int limit8 = _mystr.length();
_j = (int) (1) ;
for (;_j <= limit8 ;_j = _j + step8 ) {
 //BA.debugLineNum = 1248;BA.debugLine="k = myStr.IndexOf2(\" \", j + 1)";
_k = _mystr.indexOf(" ",(int) (_j+1));
 //BA.debugLineNum = 1249;BA.debugLine="If k = -1 Then Exit";
if (_k==-1) { 
if (true) break;};
 //BA.debugLineNum = 1250;BA.debugLine="x = myStr.ToUpperCase.CharAt(k + 1)";
_x = BA.ObjectToString(_mystr.toUpperCase().charAt((int) (_k+1)));
 //BA.debugLineNum = 1251;BA.debugLine="myStr = myStr.SubString2(0, k + 1) & x & myStr.";
_mystr = _mystr.substring((int) (0),(int) (_k+1))+_x+_mystr.substring((int) (_k+2),_mystr.length());
 }
};
 //BA.debugLineNum = 1253;BA.debugLine="Return myStr";
if (true) return _mystr;
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 1255;BA.debugLine="Return myStr";
if (true) return _mystr;
 };
 //BA.debugLineNum = 1257;BA.debugLine="End Sub";
return "";
}
public static String  _propersubname(String _vx,boolean _removepref) throws Exception{
anywheresoftware.b4a.objects.collections.List _varlist = null;
int _vartot = 0;
int _varcnt = 0;
String _varitem = "";
String _subname1 = "";
 //BA.debugLineNum = 196;BA.debugLine="Sub ProperSubName(vx As String, removePref As Bool";
 //BA.debugLineNum = 197;BA.debugLine="vx = vx.Replace(\":\", \"-\")";
_vx = _vx.replace(":","-");
 //BA.debugLineNum = 198;BA.debugLine="vx = vx.Replace(\".\", \"-\")";
_vx = _vx.replace(".","-");
 //BA.debugLineNum = 199;BA.debugLine="Dim varList As List = StrParse(\"-\", vx)";
_varlist = new anywheresoftware.b4a.objects.collections.List();
_varlist = _strparse("-",_vx);
 //BA.debugLineNum = 200;BA.debugLine="If removePref Then";
if (_removepref) { 
 //BA.debugLineNum = 201;BA.debugLine="varList.RemoveAt(0)";
_varlist.RemoveAt((int) (0));
 };
 //BA.debugLineNum = 203;BA.debugLine="Dim varTot As Int = varList.Size - 1";
_vartot = (int) (_varlist.getSize()-1);
 //BA.debugLineNum = 204;BA.debugLine="Dim varCnt As Int";
_varcnt = 0;
 //BA.debugLineNum = 205;BA.debugLine="For varCnt = 0 To varTot";
{
final int step9 = 1;
final int limit9 = _vartot;
_varcnt = (int) (0) ;
for (;_varcnt <= limit9 ;_varcnt = _varcnt + step9 ) {
 //BA.debugLineNum = 206;BA.debugLine="Dim varItem As String = varList.Get(varCnt)";
_varitem = BA.ObjectToString(_varlist.Get(_varcnt));
 //BA.debugLineNum = 207;BA.debugLine="varItem = ProperCase(varItem)";
_varitem = _propercase(_varitem);
 //BA.debugLineNum = 208;BA.debugLine="varList.Set(varCnt, varItem)";
_varlist.Set(_varcnt,(Object)(_varitem));
 }
};
 //BA.debugLineNum = 210;BA.debugLine="Dim subName1 As String = Join(\"\",varList)";
_subname1 = _join("",_varlist);
 //BA.debugLineNum = 211;BA.debugLine="Return subName1";
if (true) return _subname1;
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public static String  _rag(int _dvalue) throws Exception{
 //BA.debugLineNum = 1944;BA.debugLine="Public Sub RAG(dValue As Int) As String";
 //BA.debugLineNum = 1945;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 1947;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
 //BA.debugLineNum = 1949;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 1951;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
 //BA.debugLineNum = 1953;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 1955;BA.debugLine="End Sub";
return "";
}
public static String  _ramovefromlist(anywheresoftware.b4a.objects.collections.List _listx,String _item) throws Exception{
int _li = 0;
 //BA.debugLineNum = 1846;BA.debugLine="Sub RamoveFromList(listX As List, item As String)";
 //BA.debugLineNum = 1847;BA.debugLine="Dim li As Int = listX.IndexOf(item)";
_li = _listx.IndexOf((Object)(_item));
 //BA.debugLineNum = 1848;BA.debugLine="If li >= 0 Then listX.RemoveAt(li)";
if (_li>=0) { 
_listx.RemoveAt(_li);};
 //BA.debugLineNum = 1849;BA.debugLine="End Sub";
return "";
}
public static String  _rand_loremipsum(int _count) throws Exception{
String _str = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 424;BA.debugLine="Sub Rand_LoremIpsum(count As Int) As String";
 //BA.debugLineNum = 425;BA.debugLine="Dim str As String = $\"Lorem ipsum dolor sit amet,";
_str = ("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
 //BA.debugLineNum = 426;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 427;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 428;BA.debugLine="For i = 1 To count";
{
final int step4 = 1;
final int limit4 = _count;
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 429;BA.debugLine="sb.Append(str).Append(CRLF)";
_sb.Append(_str).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 }
};
 //BA.debugLineNum = 431;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return "";
}
public static Object  _randlistvalue(anywheresoftware.b4a.objects.collections.List _listx) throws Exception{
 //BA.debugLineNum = 1840;BA.debugLine="Sub RandListValue(ListX As List) As Object";
 //BA.debugLineNum = 1841;BA.debugLine="ShuffleList(ListX)";
_shufflelist(_listx);
 //BA.debugLineNum = 1842;BA.debugLine="Return ListX.Get(Rnd(0, ListX.Size -1))";
if (true) return _listx.Get(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (_listx.getSize()-1)));
 //BA.debugLineNum = 1843;BA.debugLine="End Sub";
return null;
}
public static String  _randomstring(int _ilength,boolean _blowercase,boolean _buppercase,boolean _bnumbers,String _additionalchars) throws Exception{
String _source = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _r = 0;
 //BA.debugLineNum = 1113;BA.debugLine="Sub RandomString(iLength As Int, bLowerCase As Boo";
 //BA.debugLineNum = 1114;BA.debugLine="Dim source As String";
_source = "";
 //BA.debugLineNum = 1115;BA.debugLine="If bLowerCase = True Then";
if (_blowercase==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 1116;BA.debugLine="source = source &\"abcdefghijklmnopqrstuvwxyz\"";
_source = _source+"abcdefghijklmnopqrstuvwxyz";
 };
 //BA.debugLineNum = 1118;BA.debugLine="If bUpperCase = True Then";
if (_buppercase==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 1119;BA.debugLine="source = source &\"ABCDEFGHIJKLMNOPQRSTUVWXYZ\"";
_source = _source+"ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 };
 //BA.debugLineNum = 1121;BA.debugLine="If bNumbers = True Then";
if (_bnumbers==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 1122;BA.debugLine="source = source &\"0123456789\"";
_source = _source+"0123456789";
 };
 //BA.debugLineNum = 1124;BA.debugLine="If AdditionalChars.Length > 0 Then";
if (_additionalchars.length()>0) { 
 //BA.debugLineNum = 1125;BA.debugLine="source = source&AdditionalChars";
_source = _source+_additionalchars;
 };
 //BA.debugLineNum = 1128;BA.debugLine="Dim SB As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1129;BA.debugLine="SB.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1130;BA.debugLine="For i = 1 To iLength";
{
final int step16 = 1;
final int limit16 = _ilength;
_i = (int) (1) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 1131;BA.debugLine="Dim r As Int = Rnd(0,source.Length-1)";
_r = anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (_source.length()-1));
 //BA.debugLineNum = 1132;BA.debugLine="SB.Append(source.SubString2(r,r+1))";
_sb.Append(_source.substring(_r,(int) (_r+1)));
 }
};
 //BA.debugLineNum = 1134;BA.debugLine="Return SB.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 1135;BA.debugLine="End Sub";
return "";
}
public static com.ab.banano.BANanoPromise  _readasarraybuffer(anywheresoftware.b4a.objects.collections.Map _fr) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
 //BA.debugLineNum = 2180;BA.debugLine="Sub readAsArrayBuffer(fr As Map) As BANanoPromise";
 //BA.debugLineNum = 2181;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 2184;BA.debugLine="promise.CallSub(Me, \"ReadFile\", Array(fr, \"readAs";
_promise.CallSub(bananoshared.getObject(),"ReadFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fr.getObject()),(Object)("readAsArrayBuffer")}));
 //BA.debugLineNum = 2185;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 2186;BA.debugLine="End Sub";
return null;
}
public static com.ab.banano.BANanoPromise  _readasbinarystring(anywheresoftware.b4a.objects.collections.Map _fr) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
 //BA.debugLineNum = 2164;BA.debugLine="Sub readAsBinaryString(fr As Map) As BANanoPromise";
 //BA.debugLineNum = 2165;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 2168;BA.debugLine="promise.CallSub(Me, \"ReadFile\", Array(fr, \"readAs";
_promise.CallSub(bananoshared.getObject(),"ReadFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fr.getObject()),(Object)("readAsBinaryString")}));
 //BA.debugLineNum = 2169;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 2170;BA.debugLine="End Sub";
return null;
}
public static com.ab.banano.BANanoPromise  _readasdataurl(anywheresoftware.b4a.objects.collections.Map _fr) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
 //BA.debugLineNum = 2172;BA.debugLine="Sub readAsDataURL(fr As Map) As BANanoPromise";
 //BA.debugLineNum = 2173;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 2176;BA.debugLine="promise.CallSub(Me, \"ReadFile\", Array(fr, \"readAs";
_promise.CallSub(bananoshared.getObject(),"ReadFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fr.getObject()),(Object)("readAsDataURL")}));
 //BA.debugLineNum = 2177;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 2178;BA.debugLine="End Sub";
return null;
}
public static com.ab.banano.BANanoPromise  _readastext(anywheresoftware.b4a.objects.collections.Map _fr) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
 //BA.debugLineNum = 2156;BA.debugLine="public Sub readAsText(fr As Map) As BANanoPromise";
 //BA.debugLineNum = 2157;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 2160;BA.debugLine="promise.CallSub(Me, \"ReadFile\", Array(fr, \"readAs";
_promise.CallSub(bananoshared.getObject(),"ReadFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fr.getObject()),(Object)("readAsText")}));
 //BA.debugLineNum = 2161;BA.debugLine="Return promise";
if (true) return _promise;
 //BA.debugLineNum = 2162;BA.debugLine="End Sub";
return null;
}
public static String  _readfile(Object _filetoread,String _methodname) throws Exception{
com.ab.banano.BANanoObject _filereader = null;
anywheresoftware.b4a.objects.collections.Map _event = null;
 //BA.debugLineNum = 2188;BA.debugLine="private Sub ReadFile(FileToRead As Object, MethodN";
 //BA.debugLineNum = 2190;BA.debugLine="Dim FileReader As BANanoObject";
_filereader = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 2191;BA.debugLine="FileReader.Initialize2(\"FileReader\", Null)";
_filereader.Initialize2("FileReader",anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 2193;BA.debugLine="FileReader.SetField(\"file\", FileToRead)";
_filereader.SetField("file",_filetoread);
 //BA.debugLineNum = 2197;BA.debugLine="Dim event As Map";
_event = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2198;BA.debugLine="FileReader.SetField(\"onload\", BANano.CallBack(Me,";
_filereader.SetField("onload",_banano.CallBack(bananoshared.getObject(),"OnLoad",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_event.getObject())})));
 //BA.debugLineNum = 2199;BA.debugLine="FileReader.SetField(\"onerror\", BANano.CallBack(Me";
_filereader.SetField("onerror",_banano.CallBack(bananoshared.getObject(),"OnError",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_event.getObject())})));
 //BA.debugLineNum = 2201;BA.debugLine="FileReader.RunMethod(MethodName, FileToRead)";
_filereader.RunMethod(_methodname,_filetoread);
 //BA.debugLineNum = 2202;BA.debugLine="End Sub";
return "";
}
public static String  _remdelim(String _svalue,String _delim) throws Exception{
boolean _sw = false;
int _ldelim = 0;
String _nvalue = "";
 //BA.debugLineNum = 320;BA.debugLine="Sub RemDelim(sValue As String, Delim As String) As";
 //BA.debugLineNum = 321;BA.debugLine="Dim sw As Boolean = sValue.EndsWith(Delim)";
_sw = _svalue.endsWith(_delim);
 //BA.debugLineNum = 322;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 323;BA.debugLine="Dim lDelim As Int = Delim.Length";
_ldelim = _delim.length();
 //BA.debugLineNum = 324;BA.debugLine="Dim nValue As String = sValue";
_nvalue = _svalue;
 //BA.debugLineNum = 325;BA.debugLine="sw = nValue.EndsWith(Delim)";
_sw = _nvalue.endsWith(_delim);
 //BA.debugLineNum = 326;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 327;BA.debugLine="nValue = nValue.SubString2(0, nValue.Length-lDe";
_nvalue = _nvalue.substring((int) (0),(int) (_nvalue.length()-_ldelim));
 };
 //BA.debugLineNum = 329;BA.debugLine="Return nValue";
if (true) return _nvalue;
 }else {
 //BA.debugLineNum = 331;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.StringBuilderWrapper  _remdelimsb(String _delimiter,anywheresoftware.b4a.keywords.StringBuilderWrapper _value) throws Exception{
int _delimlen = 0;
 //BA.debugLineNum = 1142;BA.debugLine="Sub RemDelimSB(delimiter As String, value As Strin";
 //BA.debugLineNum = 1143;BA.debugLine="If value.tostring.EndsWith(delimiter) = True Then";
if (_value.ToString().endsWith(_delimiter)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 1144;BA.debugLine="Dim delimLen As Int = delimiter.length";
_delimlen = _delimiter.length();
 //BA.debugLineNum = 1145;BA.debugLine="value.Remove(value.Length-delimLen,value.Length)";
_value.Remove((int) (_value.getLength()-_delimlen),_value.getLength());
 };
 //BA.debugLineNum = 1147;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 1148;BA.debugLine="End Sub";
return null;
}
public static String  _replacestring(String _text,String _sfind,String _sreplacewith) throws Exception{
 //BA.debugLineNum = 1199;BA.debugLine="Sub ReplaceString(Text As String, sFind As String,";
 //BA.debugLineNum = 1200;BA.debugLine="Return Text.Replace(sFind, sReplaceWith)";
if (true) return _text.replace(_sfind,_sreplacewith);
 //BA.debugLineNum = 1201;BA.debugLine="End Sub";
return "";
}
public static String  _rightstring(String _text,long _llength) throws Exception{
 //BA.debugLineNum = 1189;BA.debugLine="Sub RightString(Text As String, lLength As Long) A";
 //BA.debugLineNum = 1190;BA.debugLine="If lLength>Text.Length Then lLength=Text.Length";
if (_llength>_text.length()) { 
_llength = (long) (_text.length());};
 //BA.debugLineNum = 1191;BA.debugLine="Return Text.SubString(Text.Length-lLength)";
if (true) return _text.substring((int) (_text.length()-_llength));
 //BA.debugLineNum = 1192;BA.debugLine="End Sub";
return "";
}
public static String  _rsaidnumber2dateofbirth(String _rsaid) throws Exception{
String _yymmdd = "";
String _yy = "";
String _mm = "";
String _dd = "";
 //BA.debugLineNum = 720;BA.debugLine="Sub RSAIDNumber2DateOfBirth(rsaID As String) As St";
 //BA.debugLineNum = 722;BA.debugLine="If rsaID.length = 13 Then";
if (_rsaid.length()==13) { 
 //BA.debugLineNum = 723;BA.debugLine="Dim yymmdd As String = LeftString(rsaID, 6)";
_yymmdd = _leftstring(_rsaid,(long) (6));
 //BA.debugLineNum = 724;BA.debugLine="Dim yy As String = LeftString(yymmdd,2)";
_yy = _leftstring(_yymmdd,(long) (2));
 //BA.debugLineNum = 725;BA.debugLine="Dim mm As String = MidString(yymmdd,3,2)";
_mm = _midstring(_yymmdd,(int) (3),(int) (2));
 //BA.debugLineNum = 726;BA.debugLine="Dim dd As String = RightString(yymmdd,2)";
_dd = _rightstring(_yymmdd,(long) (2));
 //BA.debugLineNum = 727;BA.debugLine="yymmdd = $\"19${yy}-${mm}-${dd}\"$";
_yymmdd = ("19"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_yy))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mm))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dd))+"");
 //BA.debugLineNum = 728;BA.debugLine="Return yymmdd";
if (true) return _yymmdd;
 }else {
 //BA.debugLineNum = 730;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 732;BA.debugLine="End Sub";
return "";
}
public static String  _savebinaryarray2file(Object _iuint8array,String _dbname) throws Exception{
anywheresoftware.b4a.objects.collections.List _fc = null;
com.ab.banano.BANanoObject _blob = null;
 //BA.debugLineNum = 1542;BA.debugLine="Sub SaveBinaryArray2File(iUint8Array As Object, db";
 //BA.debugLineNum = 1543;BA.debugLine="Dim fc As List";
_fc = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1544;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 1545;BA.debugLine="fc.Add(iUint8Array)";
_fc.Add(_iuint8array);
 //BA.debugLineNum = 1547;BA.debugLine="Dim blob As BANanoObject";
_blob = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 1548;BA.debugLine="blob.Initialize2(\"Blob\",Array(fc, CreateMap(\"type";
_blob.Initialize2("Blob",(Object)(new Object[]{(Object)(_fc.getObject()),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("type"),(Object)("application/octet-stream")}).getObject())}));
 //BA.debugLineNum = 1549;BA.debugLine="BANano.RunJavascriptMethod(\"saveAs\",Array(blob, d";
_banano.RunJavascriptMethod("saveAs",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_blob.getObject()),(Object)(_dbname)}));
 //BA.debugLineNum = 1550;BA.debugLine="End Sub";
return "";
}
public static String  _savetext2file(String _content,String _filename) throws Exception{
anywheresoftware.b4a.objects.collections.List _fc = null;
com.ab.banano.BANanoObject _blob = null;
 //BA.debugLineNum = 1533;BA.debugLine="Sub SaveText2File(content As String, fileName As S";
 //BA.debugLineNum = 1534;BA.debugLine="Dim fc As List";
_fc = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1535;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 1536;BA.debugLine="fc.Add(content)";
_fc.Add((Object)(_content));
 //BA.debugLineNum = 1537;BA.debugLine="Dim blob As BANanoObject";
_blob = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 1538;BA.debugLine="blob.Initialize2(\"Blob\",Array(fc, CreateMap(\"type";
_blob.Initialize2("Blob",(Object)(new Object[]{(Object)(_fc.getObject()),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("type"),(Object)("text/plain;charset=utf-8")}).getObject())}));
 //BA.debugLineNum = 1539;BA.debugLine="BANano.RunJavascriptMethod(\"saveAs\",Array(blob,fi";
_banano.RunJavascriptMethod("saveAs",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_blob.getObject()),(Object)(_filename)}));
 //BA.debugLineNum = 1540;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundimage(String _elid,String _url) throws Exception{
 //BA.debugLineNum = 1434;BA.debugLine="Sub SetBackgroundImage(elid As String, url As Stri";
 //BA.debugLineNum = 1435;BA.debugLine="BANano.GetElement(elid).SetStyle(BANano.ToJson(Cr";
_banano.GetElement(_elid).SetStyle(BA.ObjectToString(_banano.ToJson((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("background-image"),(Object)(("url('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_url))+"')")),(Object)("background-size"),(Object)("100% 100%")}).getObject()))));
 //BA.debugLineNum = 1436;BA.debugLine="End Sub";
return "";
}
public static String  _setcoverimage(String _imgurl) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
String _sjson = "";
 //BA.debugLineNum = 2420;BA.debugLine="Sub SetCoverImage(imgURL As String)";
 //BA.debugLineNum = 2421;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 2422;BA.debugLine="If imgURL = \"none\" Then";
if ((_imgurl).equals("none")) { 
 //BA.debugLineNum = 2423;BA.debugLine="opt.Put(\"background-image\", \"none\")";
_opt.Put((Object)("background-image"),(Object)("none"));
 }else {
 //BA.debugLineNum = 2431;BA.debugLine="opt.Put(\"background\", $\"url('${imgURL}')\"$)";
_opt.Put((Object)("background"),(Object)(("url('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imgurl))+"')")));
 //BA.debugLineNum = 2432;BA.debugLine="opt.Put(\"position\", \"absolute\")";
_opt.Put((Object)("position"),(Object)("absolute"));
 //BA.debugLineNum = 2433;BA.debugLine="opt.Put(\"height\", \"100%\")";
_opt.Put((Object)("height"),(Object)("100%"));
 //BA.debugLineNum = 2434;BA.debugLine="opt.Put(\"width\", \"100%\")";
_opt.Put((Object)("width"),(Object)("100%"));
 //BA.debugLineNum = 2435;BA.debugLine="opt.Put(\"top\", \"0\")";
_opt.Put((Object)("top"),(Object)("0"));
 //BA.debugLineNum = 2436;BA.debugLine="opt.Put(\"bottom\", \"0\")";
_opt.Put((Object)("bottom"),(Object)("0"));
 //BA.debugLineNum = 2437;BA.debugLine="opt.Put(\"right\", \"0\")";
_opt.Put((Object)("right"),(Object)("0"));
 //BA.debugLineNum = 2438;BA.debugLine="opt.Put(\"left\", \"0\")";
_opt.Put((Object)("left"),(Object)("0"));
 //BA.debugLineNum = 2439;BA.debugLine="opt.Put(\"z-index\", \"0\")";
_opt.Put((Object)("z-index"),(Object)("0"));
 };
 //BA.debugLineNum = 2441;BA.debugLine="Dim sjson As String = BANano.ToJson(opt)";
_sjson = BA.ObjectToString(_banano.ToJson((Object)(_opt.getObject())));
 //BA.debugLineNum = 2442;BA.debugLine="BANano.GetElement(\"#body\").SetStyle(sjson)";
_banano.GetElement("#body").SetStyle(_sjson);
 //BA.debugLineNum = 2443;BA.debugLine="End Sub";
return "";
}
public static Object  _setinterval(Object _module,String _methodname,int _ms,anywheresoftware.b4a.objects.collections.List _args) throws Exception{
com.ab.banano.BANanoObject _cb = null;
Object _res = null;
 //BA.debugLineNum = 77;BA.debugLine="Sub SetInterval(module As Object, methodname As St";
 //BA.debugLineNum = 78;BA.debugLine="methodname = methodname.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 79;BA.debugLine="Dim cb As BANanoObject = BANano.callback(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,_args)));
 //BA.debugLineNum = 80;BA.debugLine="Dim res As Object = BANano.Window.SetInterval(cb,";
_res = _banano.Window().SetInterval((Object)(_cb.getObject()),_ms);
 //BA.debugLineNum = 81;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public static String  _setonreadychange(Object _eventhandler) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 292;BA.debugLine="Sub SetOnReadyChange(EventHandler As Object)";
 //BA.debugLineNum = 293;BA.debugLine="If SubExists(EventHandler, \"ReadyChange\") = False";
if (anywheresoftware.b4a.keywords.Common.SubExists(ba,_eventhandler,"ReadyChange")==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
 //BA.debugLineNum = 294;BA.debugLine="Dim cb As BANanoObject = BANano.callback(EventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,"ReadyChange",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))));
 //BA.debugLineNum = 295;BA.debugLine="BANano.Window.GetField(\"document\").AddEventListen";
_banano.Window().GetField("document").AddEventListener("readystatechange",(Object)(_cb.getObject()),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _setprefix(String _prefix,anywheresoftware.b4a.objects.collections.Map _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _mk = "";
Object _mv = null;
String _mk1 = "";
 //BA.debugLineNum = 1660;BA.debugLine="Sub SetPrefix(prefix As String, target As Map) As";
 //BA.debugLineNum = 1661;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
 //BA.debugLineNum = 1662;BA.debugLine="For Each mk As String In target.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _target.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1663;BA.debugLine="Dim mv As Object = target.Get(mk)";
_mv = _target.Get((Object)(_mk));
 //BA.debugLineNum = 1664;BA.debugLine="Dim mk1 As String = prefix & \"_\" & mk";
_mk1 = _prefix+"_"+_mk;
 //BA.debugLineNum = 1665;BA.debugLine="nm.Put(mk1,mv)";
_nm.Put((Object)(_mk1),_mv);
 }
};
 //BA.debugLineNum = 1667;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1668;BA.debugLine="End Sub";
return null;
}
public static String  _showelement(String _elid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _stylem = null;
 //BA.debugLineNum = 2307;BA.debugLine="Sub ShowElement(elID As String)";
 //BA.debugLineNum = 2308;BA.debugLine="Dim stylem As Map = CreateMap(\"visibility\":\"visib";
_stylem = new anywheresoftware.b4a.objects.collections.Map();
_stylem = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("visibility"),(Object)("visible")});
 //BA.debugLineNum = 2309;BA.debugLine="BANano.GetElement($\"#${elID}\"$).SetStyle(BANano.T";
_banano.GetElement(("#"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_elid))+"")).SetStyle(BA.ObjectToString(_banano.ToJson((Object)(_stylem.getObject()))));
 //BA.debugLineNum = 2310;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _shufflelist(anywheresoftware.b4a.objects.collections.List _pl) throws Exception{
int _i = 0;
int _j = 0;
Object _k = null;
 //BA.debugLineNum = 88;BA.debugLine="Sub ShuffleList(pl As List) As List";
 //BA.debugLineNum = 89;BA.debugLine="For i = pl.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_pl.getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 90;BA.debugLine="Dim j As Int";
_j = 0;
 //BA.debugLineNum = 91;BA.debugLine="Dim k As Object";
_k = new Object();
 //BA.debugLineNum = 92;BA.debugLine="j = Rnd(0, i + 1)";
_j = anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (_i+1));
 //BA.debugLineNum = 93;BA.debugLine="k = pl.Get(j)";
_k = _pl.Get(_j);
 //BA.debugLineNum = 94;BA.debugLine="pl.Set(j,pl.Get(i))";
_pl.Set(_j,_pl.Get(_i));
 //BA.debugLineNum = 95;BA.debugLine="pl.Set(i,k)";
_pl.Set(_i,_k);
 }
};
 //BA.debugLineNum = 97;BA.debugLine="Return pl";
if (true) return _pl;
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _sortmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
String _strkey = "";
Object _strvalue = null;
 //BA.debugLineNum = 1334;BA.debugLine="Sub SortMap(m As Map) As Map";
 //BA.debugLineNum = 1335;BA.debugLine="Try";
try { //BA.debugLineNum = 1336;BA.debugLine="Dim nm As Map";
_nm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1337;BA.debugLine="nm.Initialize";
_nm.Initialize();
 //BA.debugLineNum = 1338;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1339;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1340;BA.debugLine="For Each strkey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _m.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_strkey = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 1341;BA.debugLine="lst.Add(strkey)";
_lst.Add((Object)(_strkey));
 }
};
 //BA.debugLineNum = 1344;BA.debugLine="lst.Sort(True)";
_lst.Sort(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1345;BA.debugLine="For Each strkey As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group10 = _lst;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_strkey = BA.ObjectToString(group10.Get(index10));
 //BA.debugLineNum = 1346;BA.debugLine="Dim strvalue As Object = m.Get(strkey)";
_strvalue = _m.Get((Object)(_strkey));
 //BA.debugLineNum = 1347;BA.debugLine="nm.Put(strkey,strvalue)";
_nm.Put((Object)(_strkey),_strvalue);
 }
};
 //BA.debugLineNum = 1349;BA.debugLine="Return nm";
if (true) return _nm;
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 1351;BA.debugLine="Return m";
if (true) return _m;
 };
 //BA.debugLineNum = 1353;BA.debugLine="End Sub";
return null;
}
public static String  _space(int _hm) throws Exception{
String _rs = "";
 //BA.debugLineNum = 1151;BA.debugLine="Sub Space(HM As Int) As String";
 //BA.debugLineNum = 1152;BA.debugLine="Dim RS As String = \"\"";
_rs = "";
 //BA.debugLineNum = 1153;BA.debugLine="Do While Len(RS) < HM";
while (_len(_rs)<_hm) {
 //BA.debugLineNum = 1154;BA.debugLine="RS = RS & \" \"";
_rs = _rs+" ";
 }
;
 //BA.debugLineNum = 1156;BA.debugLine="Return RS";
if (true) return _rs;
 //BA.debugLineNum = 1157;BA.debugLine="End Sub";
return "";
}
public static String  _statusrag(int _dvalue) throws Exception{
 //BA.debugLineNum = 1970;BA.debugLine="Public Sub StatusRAG(dValue As Int) As String";
 //BA.debugLineNum = 1971;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 1973;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
 //BA.debugLineNum = 1975;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 1977;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
 //BA.debugLineNum = 1979;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 1981;BA.debugLine="End Sub";
return "";
}
public static String  _statusrg(int _dvalue) throws Exception{
 //BA.debugLineNum = 2036;BA.debugLine="Sub StatusRG(dValue As Int) As String";
 //BA.debugLineNum = 2037;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2039;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
 //BA.debugLineNum = 2041;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
 //BA.debugLineNum = 2043;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
}
;
 //BA.debugLineNum = 2045;BA.debugLine="End Sub";
return "";
}
public static String  _stringbreakatuppercase(String _st) throws Exception{
int _k = 0;
String _s = "";
String _newst = "";
int _i = 0;
 //BA.debugLineNum = 347;BA.debugLine="Sub StringBreakAtUpperCase(st As String) As String";
 //BA.debugLineNum = 348;BA.debugLine="If st.Length = 0 Then Return \"\"";
if (_st.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 349;BA.debugLine="Dim k As Int";
_k = 0;
 //BA.debugLineNum = 350;BA.debugLine="Dim s As String";
_s = "";
 //BA.debugLineNum = 351;BA.debugLine="Dim newst As String = st.CharAt(0)";
_newst = BA.ObjectToString(_st.charAt((int) (0)));
 //BA.debugLineNum = 352;BA.debugLine="For i = 1 To st.Length - 1";
{
final int step5 = 1;
final int limit5 = (int) (_st.length()-1);
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 353;BA.debugLine="s = st.CharAt(i)";
_s = BA.ObjectToString(_st.charAt(_i));
 //BA.debugLineNum = 354;BA.debugLine="k = Asc(s)";
_k = anywheresoftware.b4a.keywords.Common.Asc(BA.ObjectToChar(_s));
 //BA.debugLineNum = 355;BA.debugLine="If (k > 64) And (k < 91) And (st.CharAt(i-1) <>";
if ((_k>64) && (_k<91) && (_st.charAt((int) (_i-1))!=BA.ObjectToChar(" "))) { 
 //BA.debugLineNum = 356;BA.debugLine="newst = newst & \" \" & s";
_newst = _newst+" "+_s;
 }else {
 //BA.debugLineNum = 358;BA.debugLine="newst = newst & s";
_newst = _newst+_s;
 };
 }
};
 //BA.debugLineNum = 361;BA.debugLine="Return newst";
if (true) return _newst;
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _strparse(String _delim,String _inputstring) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String[] _values = null;
 //BA.debugLineNum = 218;BA.debugLine="Sub StrParse(delim As String, inputString As Strin";
 //BA.debugLineNum = 219;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 220;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 221;BA.debugLine="inputString = CStr(inputString)";
_inputstring = _cstr((Object)(_inputstring));
 //BA.debugLineNum = 222;BA.debugLine="If inputString = \"null\" Then inputString = \"\"";
if ((_inputstring).equals("null")) { 
_inputstring = "";};
 //BA.debugLineNum = 223;BA.debugLine="If inputString = \"undefined\" Then inputString = \"";
if ((_inputstring).equals("undefined")) { 
_inputstring = "";};
 //BA.debugLineNum = 224;BA.debugLine="If inputString = \"\" Then Return nl";
if ((_inputstring).equals("")) { 
if (true) return _nl;};
 //BA.debugLineNum = 225;BA.debugLine="Dim values() As String = BANano.Split(delim,input";
_values = _banano.Split(_delim,_inputstring);
 //BA.debugLineNum = 226;BA.debugLine="nl.AddAll(values)";
_nl.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(_values));
 //BA.debugLineNum = 227;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public static double  _sumlistofmapsproperty(anywheresoftware.b4a.objects.collections.List _lst,String _prop) throws Exception{
double _tsum = 0;
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _propv = "";
 //BA.debugLineNum = 874;BA.debugLine="Sub SumListOfMapsProperty(lst As List, prop As Str";
 //BA.debugLineNum = 875;BA.debugLine="Dim tsum As Double = 0";
_tsum = 0;
 //BA.debugLineNum = 876;BA.debugLine="For Each rec As Map In lst";
_rec = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_rec = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
 //BA.debugLineNum = 877;BA.debugLine="Dim propv As String = rec.GetDefault(prop,\"0\")";
_propv = BA.ObjectToString(_rec.GetDefault((Object)(_prop),(Object)("0")));
 //BA.debugLineNum = 878;BA.debugLine="tsum = tsum + BANano.parseFloat(propv)";
_tsum = _tsum+_banano.parseFloat((Object)(_propv));
 }
};
 //BA.debugLineNum = 880;BA.debugLine="Return tsum";
if (true) return _tsum;
 //BA.debugLineNum = 881;BA.debugLine="End Sub";
return 0;
}
public static String  _timenow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 1584;BA.debugLine="Public Sub TimeNow() As String";
 //BA.debugLineNum = 1585;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 1586;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 1587;BA.debugLine="lNow = DateTime.Now";
_lnow = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 1588;BA.debugLine="DateTime.DateFormat = \"HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("HH:mm");
 //BA.debugLineNum = 1589;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = anywheresoftware.b4a.keywords.Common.DateTime.Date(_lnow);
 //BA.debugLineNum = 1590;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 1591;BA.debugLine="End Sub";
return "";
}
public static String  _trimstring(String _strvalue) throws Exception{
 //BA.debugLineNum = 1227;BA.debugLine="private Sub TrimString(strValue As String) As Stri";
 //BA.debugLineNum = 1228;BA.debugLine="Return strValue.trim";
if (true) return _strvalue.trim();
 //BA.debugLineNum = 1229;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _unflatten(anywheresoftware.b4a.objects.collections.List _tdata,String _childname) throws Exception{
anywheresoftware.b4a.objects.collections.List _tree = null;
anywheresoftware.b4a.objects.collections.Map _mappedarr = null;
anywheresoftware.b4a.objects.collections.Map _arrelem = null;
String _did = "";
anywheresoftware.b4a.objects.collections.List _cdata = null;
anywheresoftware.b4a.objects.collections.Map _mappedelem = null;
String _parentid = "";
anywheresoftware.b4a.objects.collections.Map _parentelem = null;
anywheresoftware.b4a.objects.collections.List _children = null;
String _mk = "";
anywheresoftware.b4a.objects.collections.Map _mi = null;
anywheresoftware.b4a.objects.collections.List _childs = null;
 //BA.debugLineNum = 2113;BA.debugLine="Sub Unflatten(tdata As List, childname As String)";
 //BA.debugLineNum = 2115;BA.debugLine="Dim tree As List";
_tree = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2116;BA.debugLine="Dim mappedArr As Map";
_mappedarr = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2118;BA.debugLine="tree.Initialize";
_tree.Initialize();
 //BA.debugLineNum = 2119;BA.debugLine="mappedArr.Initialize";
_mappedarr.Initialize();
 //BA.debugLineNum = 2122;BA.debugLine="For Each arrElem As Map In tdata";
_arrelem = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _tdata;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_arrelem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
 //BA.debugLineNum = 2123;BA.debugLine="Dim dID As String = arrElem.Get(\"id\")";
_did = BA.ObjectToString(_arrelem.Get((Object)("id")));
 //BA.debugLineNum = 2125;BA.debugLine="Dim cdata As List";
_cdata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2126;BA.debugLine="cdata.Initialize";
_cdata.Initialize();
 //BA.debugLineNum = 2127;BA.debugLine="arrElem.Put(childname, cdata)";
_arrelem.Put((Object)(_childname),(Object)(_cdata.getObject()));
 //BA.debugLineNum = 2129;BA.debugLine="mappedArr.Put(dID, arrElem)";
_mappedarr.Put((Object)(_did),(Object)(_arrelem.getObject()));
 }
};
 //BA.debugLineNum = 2132;BA.debugLine="For Each dID As String In mappedArr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group12 = _mappedarr.Keys();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_did = BA.ObjectToString(group12.Get(index12));
 //BA.debugLineNum = 2133;BA.debugLine="Dim mappedElem As Map = mappedArr.Get(dID)";
_mappedelem = new anywheresoftware.b4a.objects.collections.Map();
_mappedelem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mappedarr.Get((Object)(_did))));
 //BA.debugLineNum = 2134;BA.debugLine="Dim parentid As String = mappedElem.Get(\"parenti";
_parentid = BA.ObjectToString(_mappedelem.Get((Object)("parentid")));
 //BA.debugLineNum = 2136;BA.debugLine="If parentid = \"\" Or parentid = \"0\" Then";
if ((_parentid).equals("") || (_parentid).equals("0")) { 
 //BA.debugLineNum = 2137;BA.debugLine="tree.Add(mappedElem)";
_tree.Add((Object)(_mappedelem.getObject()));
 }else {
 //BA.debugLineNum = 2140;BA.debugLine="Dim parentElem As Map = mappedArr.Get(parentid)";
_parentelem = new anywheresoftware.b4a.objects.collections.Map();
_parentelem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mappedarr.Get((Object)(_parentid))));
 //BA.debugLineNum = 2141;BA.debugLine="Dim children As List = parentElem.Get(childname";
_children = new anywheresoftware.b4a.objects.collections.List();
_children = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_parentelem.Get((Object)(_childname))));
 //BA.debugLineNum = 2142;BA.debugLine="children.Add(mappedElem)";
_children.Add((Object)(_mappedelem.getObject()));
 //BA.debugLineNum = 2143;BA.debugLine="parentElem.Put(childname, children)";
_parentelem.Put((Object)(_childname),(Object)(_children.getObject()));
 //BA.debugLineNum = 2144;BA.debugLine="mappedArr.Put(parentid, parentElem)";
_mappedarr.Put((Object)(_parentid),(Object)(_parentelem.getObject()));
 };
 }
};
 //BA.debugLineNum = 2148;BA.debugLine="For Each mk As String In mappedArr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group25 = _mappedarr.Keys();
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_mk = BA.ObjectToString(group25.Get(index25));
 //BA.debugLineNum = 2149;BA.debugLine="Dim mi As Map = mappedArr.Get(mk)";
_mi = new anywheresoftware.b4a.objects.collections.Map();
_mi = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mappedarr.Get((Object)(_mk))));
 //BA.debugLineNum = 2150;BA.debugLine="Dim childs As List = mi.Get(childname)";
_childs = new anywheresoftware.b4a.objects.collections.List();
_childs = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mi.Get((Object)(_childname))));
 //BA.debugLineNum = 2151;BA.debugLine="If childs.Size = 0 Then mi.Remove(childname)";
if (_childs.getSize()==0) { 
_mi.Remove((Object)(_childname));};
 }
};
 //BA.debugLineNum = 2153;BA.debugLine="Return tree";
if (true) return _tree;
 //BA.debugLineNum = 2154;BA.debugLine="End Sub";
return null;
}
public static String  _uploadfilewait(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.List _filelist = null;
anywheresoftware.b4a.objects.collections.Map _fileo = null;
com.ab.banano.BANanoObject _fd = null;
String _res = "";
 //BA.debugLineNum = 61;BA.debugLine="Sub UploadFileWait(e As BANanoEvent) As String";
 //BA.debugLineNum = 63;BA.debugLine="Dim fileList As List = GetFileListFromTarget(e)";
_filelist = new anywheresoftware.b4a.objects.collections.List();
_filelist = _getfilelistfromtarget(_e);
 //BA.debugLineNum = 64;BA.debugLine="If fileList.size = 0 Then Return \"\"";
if (_filelist.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 67;BA.debugLine="Dim fileO As Map = fileList.Get(0)";
_fileo = new anywheresoftware.b4a.objects.collections.Map();
_fileo = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_filelist.Get((int) (0))));
 //BA.debugLineNum = 69;BA.debugLine="Dim fd As BANanoObject";
_fd = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 70;BA.debugLine="fd.Initialize2(\"FormData\", Null)";
_fd.Initialize2("FormData",anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 71;BA.debugLine="fd.RunMethod(\"append\", Array(\"upload\", fileO))";
_fd.RunMethod("append",(Object)(new Object[]{(Object)("upload"),(Object)(_fileo.getObject())}));
 //BA.debugLineNum = 73;BA.debugLine="Dim Res As String = BANano.CallAjaxWait(\"./assets";
_res = BA.ObjectToString(_banano.CallAjaxWait("./assets/upload.php","POST","",(Object)(_fd.getObject()),anywheresoftware.b4a.keywords.Common.True,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 74;BA.debugLine="Return Res";
if (true) return _res;
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public static String  _val(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 884;BA.debugLine="Public Sub Val(value As String) As String";
 //BA.debugLineNum = 885;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 886;BA.debugLine="Try";
try { //BA.debugLineNum = 887;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 888;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 889;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 890;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 891;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 892;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 893;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 894;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 895;BA.debugLine="If InStr(\"0123456789.-\", mout) <> -1 Then";
if (_instr("0123456789.-",_mout)!=-1) { 
 //BA.debugLineNum = 896;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 899;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 901;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 903;BA.debugLine="End Sub";
return "";
}
public static String  _yearnow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 734;BA.debugLine="Public Sub YearNow() As String";
 //BA.debugLineNum = 735;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 736;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 737;BA.debugLine="lNow = DateTime.Now";
_lnow = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 738;BA.debugLine="DateTime.DateFormat = \"yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy");
 //BA.debugLineNum = 739;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = anywheresoftware.b4a.keywords.Common.DateTime.Date(_lnow);
 //BA.debugLineNum = 740;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 741;BA.debugLine="End Sub";
return "";
}
public static boolean  _yesnotoboolean(String _xvalue) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub YesNoToBoolean(xvalue As String) As Boolean";
 //BA.debugLineNum = 300;BA.debugLine="Select Case xvalue";
switch (BA.switchObjectToInt(_xvalue,"Yes","yes")) {
case 0: 
case 1: {
 //BA.debugLineNum = 302;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 break; }
default: {
 //BA.debugLineNum = 304;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 break; }
}
;
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return false;
}
}
