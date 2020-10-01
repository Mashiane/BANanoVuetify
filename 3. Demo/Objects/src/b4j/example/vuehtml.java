package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vuehtml extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vuehtml", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vuehtml.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _id = "";
public String _tag = "";
public anywheresoftware.b4a.objects.collections.Map _properties = null;
public anywheresoftware.b4a.objects.collections.List _contents = null;
public anywheresoftware.b4a.objects.collections.Map _classes = null;
public anywheresoftware.b4a.objects.collections.Map _styles = null;
public anywheresoftware.b4a.objects.collections.Map _looseattributes = null;
public anywheresoftware.b4a.objects.collections.List _dontbreak = null;
public String _prefix = "";
public boolean _doaproperclose = false;
public anywheresoftware.b4a.objects.collections.Map _cssrule = null;
public anywheresoftware.b4a.objects.collections.List _singlequote = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sbafter = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _sbbefore = null;
public boolean _isimportant = false;
public com.ab.banano.BANano _banano = null;
public String _parentid = "";
public String _ds = "";
public boolean _hascontent = false;
public boolean _designmode = false;
public String _vmodel = "";
public String _showkey = "";
public String _diskey = "";
public String _reqkey = "";
public String _errkey = "";
public String _stylekey = "";
public anywheresoftware.b4a.objects.collections.List _classlist = null;
public String _classkey = "";
public boolean _bstatic = false;
public String _value = "";
public String _errormessage = "";
public String _fieldtype = "";
public String _typeof = "";
public String _inputtype = "";
public anywheresoftware.b4a.objects.collections.Map _stylelist = null;
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
public b4j.example.vuehtml  _addanchor(String _href,String _caption,String _target) throws Exception{
 //BA.debugLineNum = 2876;BA.debugLine="Sub AddAnchor(href As String,caption As String,Tar";
 //BA.debugLineNum = 2877;BA.debugLine="AddLink(href,caption,Target)";
_addlink(_href,_caption,_target);
 //BA.debugLineNum = 2878;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2879;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addattribute(String _varprop,String _varvalue) throws Exception{
String _rname = "";
 //BA.debugLineNum = 2594;BA.debugLine="public Sub AddAttribute(varProp As String, varvalu";
 //BA.debugLineNum = 2595;BA.debugLine="If BANano.IsUndefined(varvalue) Or BANano.IsNull(";
if (_banano.IsUndefined((Object)(_varvalue)) || _banano.IsNull((Object)(_varvalue))) { 
if (true) return (b4j.example.vuehtml)(this);};
 //BA.debugLineNum = 2596;BA.debugLine="If BANano.IsNumber(varvalue) Then varvalue = CStr";
if (_banano.IsNumber((Object)(_varvalue))) { 
_varvalue = _cstr((Object)(_varvalue));};
 //BA.debugLineNum = 2598;BA.debugLine="If BANano.IsBoolean(varvalue) Then";
if (_banano.IsBoolean((Object)(_varvalue))) { 
 //BA.debugLineNum = 2599;BA.debugLine="properties.put(varProp, varvalue)";
_properties.Put((Object)(_varprop),(Object)(_varvalue));
 //BA.debugLineNum = 2600;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 }else {
 //BA.debugLineNum = 2603;BA.debugLine="If varvalue.StartsWith(\":\") Then";
if (_varvalue.startsWith(":")) { 
 //BA.debugLineNum = 2604;BA.debugLine="If varvalue.StartsWith(\"$\") Then";
if (_varvalue.startsWith("$")) { 
 //BA.debugLineNum = 2605;BA.debugLine="properties.put(varProp, varvalue)";
_properties.Put((Object)(_varprop),(Object)(_varvalue));
 //BA.debugLineNum = 2606;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 }else {
 //BA.debugLineNum = 2608;BA.debugLine="Dim rname As String = MidString2(varvalue, 2)";
_rname = _midstring2(_varvalue,(int) (2));
 //BA.debugLineNum = 2609;BA.debugLine="properties.put($\":${varProp}\"$, rname)";
_properties.Put((Object)((":"+__c.SmartStringFormatter("",(Object)(_varprop))+"")),(Object)(_rname));
 //BA.debugLineNum = 2610;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 };
 }else {
 //BA.debugLineNum = 2614;BA.debugLine="properties.put(varProp, varvalue)";
_properties.Put((Object)(_varprop),(Object)(_varvalue));
 //BA.debugLineNum = 2615;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 };
 };
 //BA.debugLineNum = 2618;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addattributeifset(String _prop,String _svalue) throws Exception{
 //BA.debugLineNum = 1394;BA.debugLine="Sub AddAttributeIfSet(prop As String, svalue As St";
 //BA.debugLineNum = 1395;BA.debugLine="If svalue <> \"\" Then";
if ((_svalue).equals("") == false) { 
 //BA.debugLineNum = 1396;BA.debugLine="AddAttribute(prop,svalue)";
_addattribute(_prop,_svalue);
 };
 //BA.debugLineNum = 1398;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addattributeoncondition(boolean _bcondition,String _attr,String _svalue) throws Exception{
 //BA.debugLineNum = 1841;BA.debugLine="Sub AddAttributeOnCondition(bCondition As Boolean,";
 //BA.debugLineNum = 1842;BA.debugLine="If bCondition = True Then";
if (_bcondition==__c.True) { 
 //BA.debugLineNum = 1843;BA.debugLine="AddAttribute(attr,svalue)";
_addattribute(_attr,_svalue);
 };
 //BA.debugLineNum = 1845;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1846;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addbold(String _svalue) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2752;BA.debugLine="Sub AddBold(svalue As String) As VueHTML";
 //BA.debugLineNum = 2753;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2754;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2755;BA.debugLine="sb.Append(\"{B}\").Append(svalue).Append(\"{/B}\")";
_sb.Append("{B}").Append(_svalue).Append("{/B}");
 //BA.debugLineNum = 2756;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 2757;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2758;BA.debugLine="End Sub";
return null;
}
public String  _addbr() throws Exception{
 //BA.debugLineNum = 775;BA.debugLine="Sub AddBR";
 //BA.debugLineNum = 776;BA.debugLine="SetText(\"<br>\")";
_settext("<br>");
 //BA.debugLineNum = 777;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _addbreak(boolean _b) throws Exception{
 //BA.debugLineNum = 2863;BA.debugLine="Sub AddBreak(b As Boolean) As VueHTML  'ignore";
 //BA.debugLineNum = 2864;BA.debugLine="AddContent(\"{BR}\")";
_addcontent("{BR}");
 //BA.debugLineNum = 2865;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2866;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addchild(b4j.example.vuehtml _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 2329;BA.debugLine="Sub AddChild(child As VueHTML) As VueHTML";
 //BA.debugLineNum = 2330;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 2331;BA.debugLine="SetText(childHTML)";
_settext(_childhtml);
 //BA.debugLineNum = 2332;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2333;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vuehtml _childx = null;
 //BA.debugLineNum = 2336;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 2337;BA.debugLine="For Each childx As VueHTML In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vuehtml)(group1.Get(index1));
 //BA.debugLineNum = 2338;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 2340;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _addcite(String _svalue) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2838;BA.debugLine="Sub AddCite(svalue As String) As VueHTML";
 //BA.debugLineNum = 2839;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2840;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2841;BA.debugLine="sb.Append(\"<cite>\").Append(svalue).Append(\"</cite";
_sb.Append("<cite>").Append(_svalue).Append("</cite>");
 //BA.debugLineNum = 2842;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 2843;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2844;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addclass(String _svalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _spclasses = null;
String _strclass = "";
 //BA.debugLineNum = 2566;BA.debugLine="Sub AddClass(svalue As String) As VueHTML";
 //BA.debugLineNum = 2567;BA.debugLine="svalue = svalue.Trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 2568;BA.debugLine="If svalue = \"\" Then Return Me";
if ((_svalue).equals("")) { 
if (true) return (b4j.example.vuehtml)(this);};
 //BA.debugLineNum = 2570;BA.debugLine="svalue = svalue.Replace(\" \",\";\")";
_svalue = _svalue.replace(" ",";");
 //BA.debugLineNum = 2571;BA.debugLine="Dim spClasses As List = StrParse(\";\",svalue)";
_spclasses = new anywheresoftware.b4a.objects.collections.List();
_spclasses = _strparse(";",_svalue);
 //BA.debugLineNum = 2572;BA.debugLine="For Each strClass As String In spClasses";
{
final anywheresoftware.b4a.BA.IterableList group5 = _spclasses;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_strclass = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 2573;BA.debugLine="strClass = strClass.Trim";
_strclass = _strclass.trim();
 //BA.debugLineNum = 2574;BA.debugLine="If strClass.Length > 0 Then";
if (_strclass.length()>0) { 
 //BA.debugLineNum = 2575;BA.debugLine="Classes.Put(strClass,strClass)";
_classes.Put((Object)(_strclass),(Object)(_strclass));
 };
 }
};
 //BA.debugLineNum = 2578;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 2579;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addclasses(anywheresoftware.b4a.objects.collections.List _clslist) throws Exception{
String _c = "";
 //BA.debugLineNum = 881;BA.debugLine="Sub AddClasses(clsList As List) As VueHTML";
 //BA.debugLineNum = 882;BA.debugLine="For Each c As String In clsList";
{
final anywheresoftware.b4a.BA.IterableList group1 = _clslist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 883;BA.debugLine="AddClass(c)";
_addclass(_c);
 }
};
 //BA.debugLineNum = 885;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 886;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addclassoncondition(boolean _bcondition,String _sclass) throws Exception{
 //BA.debugLineNum = 1895;BA.debugLine="Sub AddClassOnCondition(bCondition As Boolean, sCl";
 //BA.debugLineNum = 1896;BA.debugLine="If bCondition  Then";
if (_bcondition) { 
 //BA.debugLineNum = 1897;BA.debugLine="AddClass(sClass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 1899;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addclassonfalsecondition(boolean _bcondition,String _sclass) throws Exception{
 //BA.debugLineNum = 1902;BA.debugLine="Sub AddClassOnFalseCondition(bCondition As Boolean";
 //BA.debugLineNum = 1903;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
 //BA.debugLineNum = 1904;BA.debugLine="AddClass(sClass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 1906;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1907;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addclassonvalue(int _ivalue,String _sclass) throws Exception{
 //BA.debugLineNum = 1888;BA.debugLine="Sub AddClassOnValue(iValue As Int, sClass As Strin";
 //BA.debugLineNum = 1889;BA.debugLine="If iValue > 0 Then";
if (_ivalue>0) { 
 //BA.debugLineNum = 1890;BA.debugLine="AddClass(sClass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 1892;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1893;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcode(String _svalue) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2813;BA.debugLine="Sub AddCode(svalue As String) As VueHTML";
 //BA.debugLineNum = 2814;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2815;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2816;BA.debugLine="sb.Append(\"<code>\").Append(svalue).Append(\"</code";
_sb.Append("<code>").Append(_svalue).Append("</code>");
 //BA.debugLineNum = 2817;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 2818;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2819;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcontent(String _svalue) throws Exception{
 //BA.debugLineNum = 2125;BA.debugLine="public Sub AddContent(svalue As String) As VueHTML";
 //BA.debugLineNum = 2126;BA.debugLine="svalue = CStr(svalue)";
_svalue = _cstr((Object)(_svalue));
 //BA.debugLineNum = 2127;BA.debugLine="If svalue.Length > 0 Then";
if (_svalue.length()>0) { 
 //BA.debugLineNum = 2128;BA.debugLine="Contents.Add(svalue)";
_contents.Add((Object)(_svalue));
 //BA.debugLineNum = 2129;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 };
 //BA.debugLineNum = 2131;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcontentafter(String _svalue) throws Exception{
 //BA.debugLineNum = 2135;BA.debugLine="public Sub AddContentAfter(svalue As String) As Vu";
 //BA.debugLineNum = 2136;BA.debugLine="svalue = CStr(svalue)";
_svalue = _cstr((Object)(_svalue));
 //BA.debugLineNum = 2137;BA.debugLine="If svalue.Length > 0 Then";
if (_svalue.length()>0) { 
 //BA.debugLineNum = 2138;BA.debugLine="SBAfter.Append(svalue)";
_sbafter.Append(_svalue);
 //BA.debugLineNum = 2139;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 };
 //BA.debugLineNum = 2141;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcontentbefore(String _svalue) throws Exception{
 //BA.debugLineNum = 2145;BA.debugLine="public Sub AddContentBefore(svalue As String) As V";
 //BA.debugLineNum = 2146;BA.debugLine="svalue = CStr(svalue)";
_svalue = _cstr((Object)(_svalue));
 //BA.debugLineNum = 2147;BA.debugLine="If svalue.Length > 0 Then";
if (_svalue.length()>0) { 
 //BA.debugLineNum = 2148;BA.debugLine="SBBefore.Append(svalue)";
_sbbefore.Append(_svalue);
 //BA.debugLineNum = 2149;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 };
 //BA.debugLineNum = 2151;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcontentline(String _svalue) throws Exception{
 //BA.debugLineNum = 1551;BA.debugLine="public Sub AddContentLine(svalue As String) As Vue";
 //BA.debugLineNum = 1552;BA.debugLine="If svalue <> \"\" Then";
if ((_svalue).equals("") == false) { 
 //BA.debugLineNum = 1553;BA.debugLine="svalue = svalue.Replace(CRLF,\"\")";
_svalue = _svalue.replace(__c.CRLF,"");
 //BA.debugLineNum = 1554;BA.debugLine="AddContent(svalue)";
_addcontent(_svalue);
 };
 //BA.debugLineNum = 1556;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1557;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcontentlist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
String _strcontent = "";
 //BA.debugLineNum = 1926;BA.debugLine="Sub AddContentList(lst As List) As VueHTML";
 //BA.debugLineNum = 1927;BA.debugLine="For Each strContent As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcontent = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1928;BA.debugLine="AddContent(strContent)";
_addcontent(_strcontent);
 }
};
 //BA.debugLineNum = 1930;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1931;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcontentlistreverse(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _ltot = 0;
int _lcnt = 0;
String _strcontent = "";
 //BA.debugLineNum = 1652;BA.debugLine="Sub AddContentListReverse(lst As List) As VueHTML";
 //BA.debugLineNum = 1653;BA.debugLine="Dim lTot As Int = lst.Size - 1";
_ltot = (int) (_lst.getSize()-1);
 //BA.debugLineNum = 1654;BA.debugLine="Dim lCnt As Int";
_lcnt = 0;
 //BA.debugLineNum = 1655;BA.debugLine="For lCnt = lTot To 0 Step -1";
{
final int step3 = -1;
final int limit3 = (int) (0);
_lcnt = _ltot ;
for (;_lcnt >= limit3 ;_lcnt = _lcnt + step3 ) {
 //BA.debugLineNum = 1656;BA.debugLine="Dim strContent As String = lst.Get(lCnt)";
_strcontent = BA.ObjectToString(_lst.Get(_lcnt));
 //BA.debugLineNum = 1657;BA.debugLine="AddContent(strContent)";
_addcontent(_strcontent);
 }
};
 //BA.debugLineNum = 1659;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1660;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcssclassproperties(String _sproperties) throws Exception{
 //BA.debugLineNum = 592;BA.debugLine="Sub AddCSSClassProperties(sProperties As String) A";
 //BA.debugLineNum = 593;BA.debugLine="AddCssRule(\".\" & ID,sProperties)";
_addcssrule("."+_id,_sproperties);
 //BA.debugLineNum = 594;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcssrule(String _stylename,String _content) throws Exception{
String _scontent = "";
anywheresoftware.b4a.objects.collections.List _themstyles = null;
String _strit = "";
 //BA.debugLineNum = 635;BA.debugLine="Sub AddCssRule(styleName As String, content As Str";
 //BA.debugLineNum = 636;BA.debugLine="Dim scontent As String";
_scontent = "";
 //BA.debugLineNum = 638;BA.debugLine="Dim themStyles As List = StrParse(\",\",styleName)";
_themstyles = new anywheresoftware.b4a.objects.collections.List();
_themstyles = _strparse(",",_stylename);
 //BA.debugLineNum = 639;BA.debugLine="For Each strIT As String In themStyles";
{
final anywheresoftware.b4a.BA.IterableList group3 = _themstyles;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strit = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 640;BA.debugLine="strIT = strIT.Replace(CRLF,\"\")";
_strit = _strit.replace(__c.CRLF,"");
 //BA.debugLineNum = 641;BA.debugLine="If CSSRule.ContainsKey(strIT) Then";
if (_cssrule.ContainsKey((Object)(_strit))) { 
 //BA.debugLineNum = 642;BA.debugLine="scontent = CSSRule.Get(strIT)";
_scontent = BA.ObjectToString(_cssrule.Get((Object)(_strit)));
 //BA.debugLineNum = 643;BA.debugLine="scontent = scontent & \";\" & content";
_scontent = _scontent+";"+_content;
 //BA.debugLineNum = 644;BA.debugLine="CSSRule.Put(strIT,scontent)";
_cssrule.Put((Object)(_strit),(Object)(_scontent));
 }else {
 //BA.debugLineNum = 646;BA.debugLine="CSSRule.Put(strIT,content)";
_cssrule.Put((Object)(_strit),(Object)(_content));
 };
 }
};
 //BA.debugLineNum = 649;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 650;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addcursor() throws Exception{
 //BA.debugLineNum = 1878;BA.debugLine="Sub AddCursor As VueHTML";
 //BA.debugLineNum = 1879;BA.debugLine="SetStyle(\"cursor\", \"pointer\")";
_setstyle("cursor","pointer");
 //BA.debugLineNum = 1880;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1881;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _adddataattribute(String _attribute,String _svalue) throws Exception{
boolean _sw = false;
 //BA.debugLineNum = 1790;BA.debugLine="Sub AddDataAttribute(attribute As String, svalue A";
 //BA.debugLineNum = 1791;BA.debugLine="Dim sw As Boolean = attribute.StartsWith(\"data-\")";
_sw = _attribute.startsWith("data-");
 //BA.debugLineNum = 1792;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 1793;BA.debugLine="AddAttribute(attribute,svalue)";
_addattribute(_attribute,_svalue);
 }else {
 //BA.debugLineNum = 1795;BA.debugLine="AddAttribute(\"data-\" & attribute,svalue)";
_addattribute("data-"+_attribute,_svalue);
 };
 //BA.debugLineNum = 1797;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1798;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _adddataattributeoncondition(boolean _bcondition,String _attribute,String _svalue) throws Exception{
 //BA.debugLineNum = 1800;BA.debugLine="Sub AddDataAttributeOnCondition(bCondition As Bool";
 //BA.debugLineNum = 1801;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
 //BA.debugLineNum = 1802;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 };
 //BA.debugLineNum = 1804;BA.debugLine="AddDataAttribute(attribute,svalue)";
_adddataattribute(_attribute,_svalue);
 //BA.debugLineNum = 1805;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1806;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _adddiv(String _divid,String _divcontent,String _divclass) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 2743;BA.debugLine="Sub AddDiv(divid As String, divContent As String,";
 //BA.debugLineNum = 2744;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 2745;BA.debugLine="div.Initialize(divid,\"div\").SetText(divContent).a";
_div._initialize /*b4j.example.vuehtml*/ (ba,_divid,"div")._settext /*b4j.example.vuehtml*/ (_divcontent)._addclass /*b4j.example.vuehtml*/ (_divclass);
 //BA.debugLineNum = 2746;BA.debugLine="AddContent(div.HTML)";
_addcontent(_div._html /*String*/ ());
 //BA.debugLineNum = 2747;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2748;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _adddynamicclass(String _classname) throws Exception{
int _cpos = 0;
 //BA.debugLineNum = 257;BA.debugLine="Sub AddDynamicClass(className As String) As VueHTM";
 //BA.debugLineNum = 258;BA.debugLine="Dim cpos As Int = classList.IndexOf(className)";
_cpos = _classlist.IndexOf((Object)(_classname));
 //BA.debugLineNum = 259;BA.debugLine="cpos = BANano.parseInt(cpos)";
_cpos = _banano.parseInt((Object)(_cpos));
 //BA.debugLineNum = 260;BA.debugLine="If cpos = -1 Then classList.Add(className)";
if (_cpos==-1) { 
_classlist.Add((Object)(_classname));};
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addelement(b4j.example.vuehtml _el) throws Exception{
String _scode = "";
 //BA.debugLineNum = 2170;BA.debugLine="public Sub AddElement(el As VueHTML) As VueHTML";
 //BA.debugLineNum = 2171;BA.debugLine="If el <> Null Then";
if (_el!= null) { 
 //BA.debugLineNum = 2172;BA.debugLine="Dim scode As String = el.tostring";
_scode = _el._tostring /*String*/ ();
 //BA.debugLineNum = 2173;BA.debugLine="AddContent(scode)";
_addcontent(_scode);
 //BA.debugLineNum = 2174;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 };
 //BA.debugLineNum = 2176;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addelementline(b4j.example.vuehtml _el) throws Exception{
String _scode = "";
 //BA.debugLineNum = 1531;BA.debugLine="public Sub AddElementLine(el As VueHTML) As VueHTM";
 //BA.debugLineNum = 1532;BA.debugLine="If el <> Null Then";
if (_el!= null) { 
 //BA.debugLineNum = 1533;BA.debugLine="Dim scode As String = el.html";
_scode = _el._html /*String*/ ();
 //BA.debugLineNum = 1534;BA.debugLine="AddContent(scode)";
_addcontent(_scode);
 };
 //BA.debugLineNum = 1536;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1537;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addelements(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.example.vuehtml _el = null;
 //BA.debugLineNum = 2180;BA.debugLine="Sub AddElements(lst As List) As VueHTML";
 //BA.debugLineNum = 2181;BA.debugLine="For Each el As VueHTML In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_el = (b4j.example.vuehtml)(group1.Get(index1));
 //BA.debugLineNum = 2182;BA.debugLine="AddElement(el)";
_addelement(_el);
 }
};
 //BA.debugLineNum = 2184;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2185;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addem(String _svalue) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2846;BA.debugLine="Sub AddEM(svalue As String) As VueHTML";
 //BA.debugLineNum = 2847;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2848;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2849;BA.debugLine="sb.Append(\"<em>\").Append(svalue).Append(\"</em>\")";
_sb.Append("<em>").Append(_svalue).Append("</em>");
 //BA.debugLineNum = 2850;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 2851;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2852;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addheading(int _ssize,String _scontent) throws Exception{
b4j.example.vuehtml _hdr = null;
String _hkey = "";
 //BA.debugLineNum = 1605;BA.debugLine="Sub AddHeading(sSize As Int, sContent As String) A";
 //BA.debugLineNum = 1606;BA.debugLine="Dim hdr As VueHTML";
_hdr = new b4j.example.vuehtml();
 //BA.debugLineNum = 1607;BA.debugLine="Dim hKey As String = \"h\" & sSize";
_hkey = "h"+BA.NumberToString(_ssize);
 //BA.debugLineNum = 1608;BA.debugLine="hdr.Initialize(\"\",hKey)";
_hdr._initialize /*b4j.example.vuehtml*/ (ba,"",_hkey);
 //BA.debugLineNum = 1609;BA.debugLine="hdr.AddContent(sContent)";
_hdr._addcontent /*b4j.example.vuehtml*/ (_scontent);
 //BA.debugLineNum = 1610;BA.debugLine="AddContent(hdr.HTML)";
_addcontent(_hdr._html /*String*/ ());
 //BA.debugLineNum = 1611;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1612;BA.debugLine="End Sub";
return null;
}
public String  _addhr() throws Exception{
 //BA.debugLineNum = 780;BA.debugLine="Sub AddHR";
 //BA.debugLineNum = 781;BA.debugLine="SetText(\"<hr>\")";
_settext("<hr>");
 //BA.debugLineNum = 782;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _additalic(String _svalue) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2761;BA.debugLine="Sub AddItalic(svalue As String) As VueHTML";
 //BA.debugLineNum = 2762;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2763;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2764;BA.debugLine="sb.Append(\"{I}\").Append(svalue).Append(\"{/I}\")";
_sb.Append("{I}").Append(_svalue).Append("{/I}");
 //BA.debugLineNum = 2765;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 2766;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2767;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addkbd(String _svalue) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2804;BA.debugLine="Sub AddKBD(svalue As String) As VueHTML";
 //BA.debugLineNum = 2805;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2806;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2807;BA.debugLine="sb.Append(\"<kbd>\").Append(svalue).Append(\"</kbd>\"";
_sb.Append("<kbd>").Append(_svalue).Append("</kbd>");
 //BA.debugLineNum = 2808;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 2809;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2810;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addlink(String _href,String _caption,String _target) throws Exception{
b4j.example.vuehtml _a = null;
 //BA.debugLineNum = 2869;BA.debugLine="Sub AddLink(href As String,caption As String,Targe";
 //BA.debugLineNum = 2870;BA.debugLine="Dim a As VueHTML";
_a = new b4j.example.vuehtml();
 //BA.debugLineNum = 2871;BA.debugLine="a.Initialize(\"\",\"a\").SetAttrHREF(href).AddContent";
_a._initialize /*b4j.example.vuehtml*/ (ba,"","a")._setattrhref /*b4j.example.vuehtml*/ (_href)._addcontent /*b4j.example.vuehtml*/ (_caption)._setattrtarget /*b4j.example.vuehtml*/ (_target);
 //BA.debugLineNum = 2872;BA.debugLine="AddElement(a)";
_addelement(_a);
 //BA.debugLineNum = 2873;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2874;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addlooseattribute(String _svalue) throws Exception{
 //BA.debugLineNum = 1740;BA.debugLine="Sub AddLooseAttribute(svalue As String) As VueHTML";
 //BA.debugLineNum = 1741;BA.debugLine="LooseAttributes.Put(svalue,svalue)";
_looseattributes.Put((Object)(_svalue),(Object)(_svalue));
 //BA.debugLineNum = 1742;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1743;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addlooseattributeoncondition(boolean _bstatus,String _svalue) throws Exception{
 //BA.debugLineNum = 1732;BA.debugLine="Sub AddLooseAttributeOnCondition(bStatus As Boolea";
 //BA.debugLineNum = 1733;BA.debugLine="If bStatus = True Then";
if (_bstatus==__c.True) { 
 //BA.debugLineNum = 1734;BA.debugLine="AddLooseAttribute(svalue)";
_addlooseattribute(_svalue);
 };
 //BA.debugLineNum = 1736;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1737;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addlooseattributeonfalsecondition(boolean _bstatus,String _svalue) throws Exception{
 //BA.debugLineNum = 1631;BA.debugLine="Sub AddLooseAttributeOnFalseCondition(bStatus As B";
 //BA.debugLineNum = 1632;BA.debugLine="If bStatus = False Then";
if (_bstatus==__c.False) { 
 //BA.debugLineNum = 1633;BA.debugLine="AddLooseAttribute(svalue)";
_addlooseattribute(_svalue);
 };
 //BA.debugLineNum = 1635;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1636;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addmailto(String _emailaddress,String _subject,String _caption) throws Exception{
b4j.example.vuehtml _a = null;
 //BA.debugLineNum = 2735;BA.debugLine="Sub AddMailTo(emailaddress As String,subject As St";
 //BA.debugLineNum = 2736;BA.debugLine="subject = subject.Replace(\" \", \"%20\")";
_subject = _subject.replace(" ","%20");
 //BA.debugLineNum = 2737;BA.debugLine="Dim a As VueHTML";
_a = new b4j.example.vuehtml();
 //BA.debugLineNum = 2738;BA.debugLine="a.Initialize(\"\",\"a\").setAttrHREF($\"mailto:${email";
_a._initialize /*b4j.example.vuehtml*/ (ba,"","a")._setattrhref /*b4j.example.vuehtml*/ (("mailto:"+__c.SmartStringFormatter("",(Object)(_emailaddress))+"?subject="+__c.SmartStringFormatter("",(Object)(_subject))+""))._addcontent /*b4j.example.vuehtml*/ (_caption)._setattrtargetblank /*b4j.example.vuehtml*/ (__c.True);
 //BA.debugLineNum = 2739;BA.debugLine="AddContent(a.ToString)";
_addcontent(_a._tostring /*String*/ ());
 //BA.debugLineNum = 2740;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2741;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addmark(String _scontent,String _sclass) throws Exception{
b4j.example.vuehtml _p = null;
 //BA.debugLineNum = 1622;BA.debugLine="Sub AddMark(sContent As String, sclass As String)";
 //BA.debugLineNum = 1623;BA.debugLine="Dim p As VueHTML";
_p = new b4j.example.vuehtml();
 //BA.debugLineNum = 1624;BA.debugLine="p.Initialize(\"\",\"mark\").AddClass(sclass)";
_p._initialize /*b4j.example.vuehtml*/ (ba,"","mark")._addclass /*b4j.example.vuehtml*/ (_sclass);
 //BA.debugLineNum = 1625;BA.debugLine="p.AddContent(sContent)";
_p._addcontent /*b4j.example.vuehtml*/ (_scontent);
 //BA.debugLineNum = 1626;BA.debugLine="AddContent(p.HTML)";
_addcontent(_p._html /*String*/ ());
 //BA.debugLineNum = 1627;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1628;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addpre(String _svalue) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2821;BA.debugLine="Sub AddPre(svalue As String) As VueHTML";
 //BA.debugLineNum = 2822;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2823;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2824;BA.debugLine="sb.Append(\"<pre>\").Append(svalue).Append(\"</pre>\"";
_sb.Append("<pre>").Append(_svalue).Append("</pre>");
 //BA.debugLineNum = 2825;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 2826;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addproperty(String _skey,String _svalue) throws Exception{
 //BA.debugLineNum = 1455;BA.debugLine="Public Sub AddProperty(sKey As String, sValue As S";
 //BA.debugLineNum = 1456;BA.debugLine="AddAttribute(sKey, sValue)";
_addattribute(_skey,_svalue);
 //BA.debugLineNum = 1457;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addpropertyoncondition(boolean _bcondition,String _attr,String _svalue) throws Exception{
 //BA.debugLineNum = 1447;BA.debugLine="Sub AddPropertyOnCondition(bCondition As Boolean,";
 //BA.debugLineNum = 1448;BA.debugLine="If bCondition Then";
if (_bcondition) { 
 //BA.debugLineNum = 1449;BA.debugLine="AddAttribute(attr,svalue)";
_addattribute(_attr,_svalue);
 };
 //BA.debugLineNum = 1451;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addspace() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub AddSpace() As VueHTML";
 //BA.debugLineNum = 113;BA.debugLine="SetText(\"{NBSP}\")";
_settext("{NBSP}");
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addstrong(String _svalue) throws Exception{
b4j.example.vuehtml _s = null;
 //BA.debugLineNum = 2854;BA.debugLine="Sub AddStrong(svalue As String) As VueHTML";
 //BA.debugLineNum = 2855;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
 //BA.debugLineNum = 2856;BA.debugLine="s = CreateStrong(\"\").SetText(svalue)";
_s = _createstrong("")._settext /*b4j.example.vuehtml*/ (_svalue);
 //BA.debugLineNum = 2857;BA.debugLine="AddElement(s)";
_addelement(_s);
 //BA.debugLineNum = 2858;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addstyle(String _prop,Object _svalue) throws Exception{
 //BA.debugLineNum = 2532;BA.debugLine="Sub AddStyle(prop As String, svalue As Object) As";
 //BA.debugLineNum = 2533;BA.debugLine="AddStyleAttribute(prop,svalue)";
_addstyleattribute(_prop,_svalue);
 //BA.debugLineNum = 2534;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2535;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addstyleattribute(String _sprop,Object _svalue) throws Exception{
String _xvalue = "";
 //BA.debugLineNum = 2538;BA.debugLine="Sub AddStyleAttribute(sprop As String, svalue As O";
 //BA.debugLineNum = 2539;BA.debugLine="If svalue = Null Then Return Me";
if (_svalue== null) { 
if (true) return (b4j.example.vuehtml)(this);};
 //BA.debugLineNum = 2540;BA.debugLine="sprop = sprop.ToLowerCase";
_sprop = _sprop.toLowerCase();
 //BA.debugLineNum = 2541;BA.debugLine="sprop = sprop.Trim";
_sprop = _sprop.trim();
 //BA.debugLineNum = 2542;BA.debugLine="Dim xvalue As String = CStr(svalue)";
_xvalue = _cstr(_svalue);
 //BA.debugLineNum = 2544;BA.debugLine="sprop = RemDelim(sprop,\":\")";
_sprop = _remdelim(_sprop,":");
 //BA.debugLineNum = 2546;BA.debugLine="xvalue = RemDelim(xvalue,\";\")";
_xvalue = _remdelim(_xvalue,";");
 //BA.debugLineNum = 2547;BA.debugLine="sprop = sprop.Trim";
_sprop = _sprop.trim();
 //BA.debugLineNum = 2548;BA.debugLine="xvalue = xvalue.trim";
_xvalue = _xvalue.trim();
 //BA.debugLineNum = 2549;BA.debugLine="If xvalue.Length > 0 And sprop.length > 0 Then";
if (_xvalue.length()>0 && _sprop.length()>0) { 
 //BA.debugLineNum = 2551;BA.debugLine="If xvalue.EndsWith(\"!important\") = False Then";
if (_xvalue.endsWith("!important")==__c.False) { 
 //BA.debugLineNum = 2552;BA.debugLine="If IsImportant Then";
if (_isimportant) { 
 //BA.debugLineNum = 2553;BA.debugLine="xvalue = xvalue & \" !important\"";
_xvalue = _xvalue+" !important";
 };
 };
 //BA.debugLineNum = 2557;BA.debugLine="Styles.Put(sprop, xvalue)";
_styles.Put((Object)(_sprop),(Object)(_xvalue));
 };
 //BA.debugLineNum = 2559;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 2560;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2561;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addstyleattributeoncondition(boolean _bcondition,String _attr,String _svalue) throws Exception{
 //BA.debugLineNum = 1834;BA.debugLine="Sub AddStyleAttributeOnCondition(bCondition As Boo";
 //BA.debugLineNum = 1835;BA.debugLine="If bCondition = True Then";
if (_bcondition==__c.True) { 
 //BA.debugLineNum = 1836;BA.debugLine="SetStyle(attr,svalue)";
_setstyle(_attr,_svalue);
 };
 //BA.debugLineNum = 1838;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1839;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addstyleoncondition(boolean _bcondition,String _attribute,String _svalue) throws Exception{
 //BA.debugLineNum = 1808;BA.debugLine="Sub AddStyleOnCondition(bCondition As Boolean,attr";
 //BA.debugLineNum = 1809;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
 //BA.debugLineNum = 1810;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 };
 //BA.debugLineNum = 1812;BA.debugLine="AddStyle(attribute,svalue)";
_addstyle(_attribute,(Object)(_svalue));
 //BA.debugLineNum = 1813;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1814;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addsub(String _svalue) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2796;BA.debugLine="Sub AddSub(svalue As String) As VueHTML";
 //BA.debugLineNum = 2797;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2798;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2799;BA.debugLine="sb.Append(\"<sub>\").Append(svalue).Append(\"</sub>\"";
_sb.Append("<sub>").Append(_svalue).Append("</sub>");
 //BA.debugLineNum = 2800;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 2801;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2802;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addsubscript(String _svalue) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2779;BA.debugLine="Sub AddSubScript(svalue As String) As VueHTML";
 //BA.debugLineNum = 2780;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2781;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2782;BA.debugLine="sb.Append(\"{SUB}\").Append(svalue).Append(\"{/SUB}\"";
_sb.Append("{SUB}").Append(_svalue).Append("{/SUB}");
 //BA.debugLineNum = 2783;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 2784;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2785;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addsup(String _svalue) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2830;BA.debugLine="Sub AddSup(svalue As String) As VueHTML";
 //BA.debugLineNum = 2831;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2832;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2833;BA.debugLine="sb.Append(\"<sup>\").Append(svalue).Append(\"</sup>\"";
_sb.Append("<sup>").Append(_svalue).Append("</sup>");
 //BA.debugLineNum = 2834;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 2835;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2836;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addsuperscript(String _svalue) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2788;BA.debugLine="Sub AddSuperScript(svalue As String) As VueHTML";
 //BA.debugLineNum = 2789;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2790;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2791;BA.debugLine="sb.Append(\"{SUP}\").Append(svalue).Append(\"{/SUP}\"";
_sb.Append("{SUP}").Append(_svalue).Append("{/SUP}");
 //BA.debugLineNum = 2792;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 2793;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2794;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addtext(String _txt) throws Exception{
 //BA.debugLineNum = 1949;BA.debugLine="Sub AddText(txt As String) As VueHTML";
 //BA.debugLineNum = 1950;BA.debugLine="AddContent(txt)";
_addcontent(_txt);
 //BA.debugLineNum = 1951;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1952;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _addunderline(String _svalue) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2770;BA.debugLine="Sub AddUnderline(svalue As String) As VueHTML";
 //BA.debugLineNum = 2771;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2772;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2773;BA.debugLine="sb.Append(\"{U}\").Append(svalue).Append(\"{/U}\")";
_sb.Append("{U}").Append(_svalue).Append("{/U}");
 //BA.debugLineNum = 2774;BA.debugLine="AddContent(sb.ToString)";
_addcontent(_sb.ToString());
 //BA.debugLineNum = 2775;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2776;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendh1(String _paratext) throws Exception{
 //BA.debugLineNum = 2882;BA.debugLine="Sub AppendH1(paraText As String) As VueHTML";
 //BA.debugLineNum = 2883;BA.debugLine="AddContent($\"<h1>${paraText}</h1>\"$)";
_addcontent(("<h1>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h1>"));
 //BA.debugLineNum = 2884;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2885;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendh2(String _paratext) throws Exception{
 //BA.debugLineNum = 2887;BA.debugLine="Sub AppendH2(paraText As String) As VueHTML";
 //BA.debugLineNum = 2888;BA.debugLine="AddContent($\"<h2>${paraText}</h2>\"$)";
_addcontent(("<h2>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h2>"));
 //BA.debugLineNum = 2889;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2890;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendh3(String _paratext) throws Exception{
 //BA.debugLineNum = 2892;BA.debugLine="Sub AppendH3(paraText As String) As VueHTML";
 //BA.debugLineNum = 2893;BA.debugLine="AddContent($\"<h3>${paraText}</h3>\"$)";
_addcontent(("<h3>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h3>"));
 //BA.debugLineNum = 2894;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2895;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendh4(String _paratext) throws Exception{
 //BA.debugLineNum = 2897;BA.debugLine="Sub AppendH4(paraText As String) As VueHTML";
 //BA.debugLineNum = 2898;BA.debugLine="AddContent($\"<h4>${paraText}</h4>\"$)";
_addcontent(("<h4>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h4>"));
 //BA.debugLineNum = 2899;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendh5(String _paratext) throws Exception{
 //BA.debugLineNum = 2907;BA.debugLine="Sub AppendH5(paraText As String) As VueHTML";
 //BA.debugLineNum = 2908;BA.debugLine="AddContent($\"<h5>${paraText}</h5>\"$)";
_addcontent(("<h5>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h5>"));
 //BA.debugLineNum = 2909;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2910;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendh6(String _paratext) throws Exception{
 //BA.debugLineNum = 2912;BA.debugLine="Sub AppendH6(paraText As String) As VueHTML";
 //BA.debugLineNum = 2913;BA.debugLine="AddContent($\"<h6>${paraText}</h6>\"$)";
_addcontent(("<h6>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</h6>"));
 //BA.debugLineNum = 2914;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendparagraph(String _scontent) throws Exception{
b4j.example.vuehtml _p = null;
 //BA.debugLineNum = 1614;BA.debugLine="Sub AppendParagraph(sContent As String) As VueHTML";
 //BA.debugLineNum = 1615;BA.debugLine="Dim p As VueHTML";
_p = new b4j.example.vuehtml();
 //BA.debugLineNum = 1616;BA.debugLine="p.Initialize(\"\",\"p\")";
_p._initialize /*b4j.example.vuehtml*/ (ba,"","p");
 //BA.debugLineNum = 1617;BA.debugLine="p.AddContent(sContent)";
_p._addcontent /*b4j.example.vuehtml*/ (_scontent);
 //BA.debugLineNum = 1618;BA.debugLine="AddContent(p.HTML)";
_addcontent(_p._html /*String*/ ());
 //BA.debugLineNum = 1619;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1620;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _appendsmall(String _paratext) throws Exception{
 //BA.debugLineNum = 2902;BA.debugLine="Sub AppendSmall(paraText As String) As VueHTML";
 //BA.debugLineNum = 2903;BA.debugLine="AddContent($\"<small>${paraText}</small>\"$)";
_addcontent(("<small>"+__c.SmartStringFormatter("",(Object)(_paratext))+"</small>"));
 //BA.debugLineNum = 2904;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2905;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _applystyle(String _sstyle) throws Exception{
anywheresoftware.b4a.objects.collections.List _pieces = null;
String _strpiece = "";
String _attr = "";
String _vals = "";
 //BA.debugLineNum = 1487;BA.debugLine="Sub ApplyStyle(sStyle As String) As VueHTML";
 //BA.debugLineNum = 1489;BA.debugLine="sStyle = sStyle.trim";
_sstyle = _sstyle.trim();
 //BA.debugLineNum = 1490;BA.debugLine="sStyle = RemDelim(sStyle,\";\")";
_sstyle = _remdelim(_sstyle,";");
 //BA.debugLineNum = 1491;BA.debugLine="Dim pieces As List = StrParse(\";\",sStyle)";
_pieces = new anywheresoftware.b4a.objects.collections.List();
_pieces = _strparse(";",_sstyle);
 //BA.debugLineNum = 1492;BA.debugLine="For Each strPiece As String In pieces";
{
final anywheresoftware.b4a.BA.IterableList group4 = _pieces;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strpiece = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 1493;BA.debugLine="Dim attr As String = MvField(strPiece,1,\":\")";
_attr = _mvfield(_strpiece,(int) (1),":");
 //BA.debugLineNum = 1494;BA.debugLine="Dim vals As String = MvField(strPiece,2,\":\")";
_vals = _mvfield(_strpiece,(int) (2),":");
 //BA.debugLineNum = 1495;BA.debugLine="attr = attr.trim";
_attr = _attr.trim();
 //BA.debugLineNum = 1496;BA.debugLine="vals = vals.trim";
_vals = _vals.trim();
 //BA.debugLineNum = 1497;BA.debugLine="If attr <> \"\" Then";
if ((_attr).equals("") == false) { 
 //BA.debugLineNum = 1498;BA.debugLine="SetStyle(attr,vals)";
_setstyle(_attr,_vals);
 };
 }
};
 //BA.debugLineNum = 1501;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1502;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 176;BA.debugLine="prop = prop.tolowercase";
_prop = _prop.toLowerCase();
 //BA.debugLineNum = 177;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 178;BA.debugLine="SetAttr(prop, stateprop)";
_setattr(_prop,_stateprop);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _bindstyle(anywheresoftware.b4a.objects.collections.Map _optm) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 373;BA.debugLine="Sub BindStyle(optm As Map) As VueHTML";
 //BA.debugLineNum = 374;BA.debugLine="If ID = \"\" Then Return Me";
if ((_id).equals("")) { 
if (true) return (b4j.example.vuehtml)(this);};
 //BA.debugLineNum = 375;BA.debugLine="For Each k As String In optm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _optm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 376;BA.debugLine="Dim v As Object = optm.Get(k)";
_v = _optm.Get((Object)(_k));
 //BA.debugLineNum = 377;BA.debugLine="styleList.Put(k, v)";
_stylelist.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _bindstylesingle(String _prop,String _optm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
 //BA.debugLineNum = 382;BA.debugLine="Sub BindStyleSingle(prop As String, optm As String";
 //BA.debugLineNum = 383;BA.debugLine="If ID = \"\" Then Return Me";
if ((_id).equals("")) { 
if (true) return (b4j.example.vuehtml)(this);};
 //BA.debugLineNum = 384;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 385;BA.debugLine="nm.Put(prop, optm)";
_nm.Put((Object)(_prop),(Object)(_optm));
 //BA.debugLineNum = 386;BA.debugLine="BindStyle(nm)";
_bindstyle(_nm);
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public String  _buildattributes() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _skey = "";
String _strkey = "";
Object _strvalue = null;
 //BA.debugLineNum = 2411;BA.debugLine="Sub BuildAttributes As String";
 //BA.debugLineNum = 2412;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2413;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2414;BA.debugLine="Dim kTot As Int = properties.Size - 1";
_ktot = (int) (_properties.getSize()-1);
 //BA.debugLineNum = 2415;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 2416;BA.debugLine="If DesignMode Then";
if (_designmode) { 
 //BA.debugLineNum = 2417;BA.debugLine="For kCnt = kTot To 0 Step -1";
{
final int step6 = -1;
final int limit6 = (int) (0);
_kcnt = _ktot ;
for (;_kcnt >= limit6 ;_kcnt = _kcnt + step6 ) {
 //BA.debugLineNum = 2418;BA.debugLine="Dim sKey As String = properties.GetKeyAt(kCnt)";
_skey = BA.ObjectToString(_properties.GetKeyAt(_kcnt));
 //BA.debugLineNum = 2419;BA.debugLine="If sKey.StartsWith(\":\") Then properties.Remove(";
if (_skey.startsWith(":")) { 
_properties.Remove((Object)(_skey));};
 //BA.debugLineNum = 2421;BA.debugLine="If sKey.StartsWith(\"@\") Then properties.Remove(";
if (_skey.startsWith("@")) { 
_properties.Remove((Object)(_skey));};
 }
};
 //BA.debugLineNum = 2423;BA.debugLine="properties.Remove(\"v-if\")";
_properties.Remove((Object)("v-if"));
 //BA.debugLineNum = 2424;BA.debugLine="properties.Remove(\"v-show\")";
_properties.Remove((Object)("v-show"));
 };
 //BA.debugLineNum = 2426;BA.debugLine="Dim strKey As String = properties.GetKeyAt(0)";
_strkey = BA.ObjectToString(_properties.GetKeyAt((int) (0)));
 //BA.debugLineNum = 2427;BA.debugLine="Dim strValue As Object = properties.Get(strKey)";
_strvalue = _properties.Get((Object)(_strkey));
 //BA.debugLineNum = 2428;BA.debugLine="If SingleQuote.IndexOf(strKey) = -1 Then";
if (_singlequote.IndexOf((Object)(_strkey))==-1) { 
 //BA.debugLineNum = 2429;BA.debugLine="sb.Append(ToProperty(strKey,strValue))";
_sb.Append(_toproperty(_strkey,_strvalue));
 }else {
 //BA.debugLineNum = 2431;BA.debugLine="sb.Append(ToSingleQuoteProperty(strKey,strValue)";
_sb.Append(_tosinglequoteproperty(_strkey,_strvalue));
 };
 //BA.debugLineNum = 2433;BA.debugLine="For kCnt = 1 To kTot";
{
final int step21 = 1;
final int limit21 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit21 ;_kcnt = _kcnt + step21 ) {
 //BA.debugLineNum = 2434;BA.debugLine="strKey = properties.GetKeyAt(kCnt)";
_strkey = BA.ObjectToString(_properties.GetKeyAt(_kcnt));
 //BA.debugLineNum = 2435;BA.debugLine="strValue = properties.Get(strKey)";
_strvalue = _properties.Get((Object)(_strkey));
 //BA.debugLineNum = 2436;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 2437;BA.debugLine="If SingleQuote.IndexOf(strKey) = -1 Then";
if (_singlequote.IndexOf((Object)(_strkey))==-1) { 
 //BA.debugLineNum = 2438;BA.debugLine="sb.Append(ToProperty(strKey,strValue))";
_sb.Append(_toproperty(_strkey,_strvalue));
 }else {
 //BA.debugLineNum = 2440;BA.debugLine="sb.Append(ToSingleQuoteProperty(strKey,strValue";
_sb.Append(_tosinglequoteproperty(_strkey,_strvalue));
 };
 }
};
 //BA.debugLineNum = 2443;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 2444;BA.debugLine="End Sub";
return "";
}
public String  _buildclass() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strclass = "";
String _estyle = "";
 //BA.debugLineNum = 2188;BA.debugLine="Sub BuildClass() As String";
 //BA.debugLineNum = 2189;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2190;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2191;BA.debugLine="Dim kTot As Int = Classes.Size - 1";
_ktot = (int) (_classes.getSize()-1);
 //BA.debugLineNum = 2192;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 2193;BA.debugLine="Dim strClass As String  = Classes.GetKeyAt(0)";
_strclass = BA.ObjectToString(_classes.GetKeyAt((int) (0)));
 //BA.debugLineNum = 2194;BA.debugLine="sb.Append(strClass)";
_sb.Append(_strclass);
 //BA.debugLineNum = 2195;BA.debugLine="For kCnt = 1 To kTot";
{
final int step7 = 1;
final int limit7 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit7 ;_kcnt = _kcnt + step7 ) {
 //BA.debugLineNum = 2196;BA.debugLine="Dim strClass As String  = Classes.GetKeyAt(kCnt)";
_strclass = BA.ObjectToString(_classes.GetKeyAt(_kcnt));
 //BA.debugLineNum = 2198;BA.debugLine="If CSSRule.ContainsKey(strClass.tolowercase) The";
if (_cssrule.ContainsKey((Object)(_strclass.toLowerCase()))) { 
 //BA.debugLineNum = 2199;BA.debugLine="Dim eStyle As String = CSSRule.Get(strClass)";
_estyle = BA.ObjectToString(_cssrule.Get((Object)(_strclass)));
 //BA.debugLineNum = 2200;BA.debugLine="ApplyStyle(eStyle)";
_applystyle(_estyle);
 //BA.debugLineNum = 2201;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 2204;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 2205;BA.debugLine="sb.Append(strClass)";
_sb.Append(_strclass);
 }
};
 //BA.debugLineNum = 2207;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 2208;BA.debugLine="End Sub";
return "";
}
public String  _buildcssrules() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strkey = "";
String _scontent = "";
anywheresoftware.b4a.objects.collections.List _spprops = null;
anywheresoftware.b4a.objects.collections.List _nlist = null;
String _strpropvalue = "";
String _strprop = "";
String _strvalue = "";
String _nline = "";
String _values = "";
 //BA.debugLineNum = 597;BA.debugLine="Sub BuildCSSRules() As String";
 //BA.debugLineNum = 598;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 599;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 601;BA.debugLine="For Each strKey As String In CSSRule.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _cssrule.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 603;BA.debugLine="Dim scontent As String = CSSRule.Get(strKey)";
_scontent = BA.ObjectToString(_cssrule.Get((Object)(_strkey)));
 //BA.debugLineNum = 604;BA.debugLine="Dim spProps As List = StrParse(\";\",scontent)";
_spprops = new anywheresoftware.b4a.objects.collections.List();
_spprops = _strparse(";",_scontent);
 //BA.debugLineNum = 605;BA.debugLine="Dim nList As List";
_nlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 606;BA.debugLine="nList.initialize";
_nlist.Initialize();
 //BA.debugLineNum = 607;BA.debugLine="For Each strPropValue As String In spProps";
{
final anywheresoftware.b4a.BA.IterableList group8 = _spprops;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_strpropvalue = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 608;BA.debugLine="strPropValue = strPropValue.Trim";
_strpropvalue = _strpropvalue.trim();
 //BA.debugLineNum = 609;BA.debugLine="If strPropValue <> \"\" Then";
if ((_strpropvalue).equals("") == false) { 
 //BA.debugLineNum = 610;BA.debugLine="Dim strProp As String = MvField(strPropValue,1";
_strprop = _mvfield(_strpropvalue,(int) (1),":");
 //BA.debugLineNum = 611;BA.debugLine="Dim strValue As String = MvField(strPropValue,";
_strvalue = _mvfield(_strpropvalue,(int) (2),":");
 //BA.debugLineNum = 612;BA.debugLine="strProp = strProp.Trim";
_strprop = _strprop.trim();
 //BA.debugLineNum = 613;BA.debugLine="strValue = strValue.trim";
_strvalue = _strvalue.trim();
 //BA.debugLineNum = 614;BA.debugLine="If strValue.EndsWith(\"!important\") = False And";
if (_strvalue.endsWith("!important")==__c.False && _isimportant==__c.True) { 
 //BA.debugLineNum = 615;BA.debugLine="strValue = strValue & \" !important\"";
_strvalue = _strvalue+" !important";
 };
 //BA.debugLineNum = 617;BA.debugLine="Dim nLine As String = $\"${strProp}:${strValue}";
_nline = (""+__c.SmartStringFormatter("",(Object)(_strprop))+":"+__c.SmartStringFormatter("",(Object)(_strvalue))+"");
 //BA.debugLineNum = 618;BA.debugLine="nList.Add(nLine)";
_nlist.Add((Object)(_nline));
 };
 }
};
 //BA.debugLineNum = 621;BA.debugLine="scontent = Join(\";\",nList)";
_scontent = _join(";",_nlist);
 //BA.debugLineNum = 622;BA.debugLine="CSSRule.Put(strKey,scontent)";
_cssrule.Put((Object)(_strkey),(Object)(_scontent));
 }
};
 //BA.debugLineNum = 625;BA.debugLine="For Each strKey As String In CSSRule.Keys";
{
final anywheresoftware.b4a.BA.IterableList group25 = _cssrule.Keys();
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_strkey = BA.ObjectToString(group25.Get(index25));
 //BA.debugLineNum = 626;BA.debugLine="Dim values As String = CSSRule.Get(strKey)";
_values = BA.ObjectToString(_cssrule.Get((Object)(_strkey)));
 //BA.debugLineNum = 627;BA.debugLine="If values.StartsWith(\"{\") = False Then values =";
if (_values.startsWith("{")==__c.False) { 
_values = "{"+_values;};
 //BA.debugLineNum = 628;BA.debugLine="If values.EndsWith(\"}\") = False Then values = va";
if (_values.endsWith("}")==__c.False) { 
_values = _values+"}";};
 //BA.debugLineNum = 629;BA.debugLine="sb.Append(strKey).Append(\" \").Append(values).App";
_sb.Append(_strkey).Append(" ").Append(_values).Append(__c.CRLF);
 }
};
 //BA.debugLineNum = 631;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 632;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _buildmodel(anywheresoftware.b4a.objects.collections.Map _props,anywheresoftware.b4a.objects.collections.Map _styleprops,anywheresoftware.b4a.objects.collections.List _classnames,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
String _k = "";
String _v = "";
String _c = "";
 //BA.debugLineNum = 3538;BA.debugLine="Sub BuildModel(props As Map, styleProps As Map, cl";
 //BA.debugLineNum = 3539;BA.debugLine="If loose <> Null Then";
if (_loose!= null) { 
 //BA.debugLineNum = 3540;BA.debugLine="SetAttributes(loose)";
_setattributes(_loose);
 };
 //BA.debugLineNum = 3542;BA.debugLine="If props <> Null Then";
if (_props!= null) { 
 //BA.debugLineNum = 3543;BA.debugLine="For Each k As String In props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _props.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_k = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 3544;BA.debugLine="Dim v As String = props.Get(k)";
_v = BA.ObjectToString(_props.Get((Object)(_k)));
 //BA.debugLineNum = 3545;BA.debugLine="SetAttr(k, v)";
_setattr(_k,_v);
 }
};
 };
 //BA.debugLineNum = 3548;BA.debugLine="If styleProps <> Null Then";
if (_styleprops!= null) { 
 //BA.debugLineNum = 3549;BA.debugLine="SetStyles(styleProps)";
_setstyles(_styleprops);
 };
 //BA.debugLineNum = 3551;BA.debugLine="If classNames <> Null Then";
if (_classnames!= null) { 
 //BA.debugLineNum = 3552;BA.debugLine="For Each c As String In classNames";
{
final anywheresoftware.b4a.BA.IterableList group14 = _classnames;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_c = BA.ObjectToString(group14.Get(index14));
 //BA.debugLineNum = 3553;BA.debugLine="AddClass(c)";
_addclass(_c);
 }
};
 };
 //BA.debugLineNum = 3556;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 3557;BA.debugLine="End Sub";
return null;
}
public String  _buildstyle() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _kcnt = 0;
int _ktot = 0;
String _strkey = "";
String _strvalue = "";
String _strline = "";
 //BA.debugLineNum = 2213;BA.debugLine="Sub BuildStyle() As String";
 //BA.debugLineNum = 2214;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2215;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2216;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 2217;BA.debugLine="Dim kTot As Int = Styles.Size - 1";
_ktot = (int) (_styles.getSize()-1);
 //BA.debugLineNum = 2219;BA.debugLine="Dim strKey As String = Styles.GetKeyAt(0)";
_strkey = BA.ObjectToString(_styles.GetKeyAt((int) (0)));
 //BA.debugLineNum = 2220;BA.debugLine="Dim strValue As String = Styles.Get(strKey)";
_strvalue = BA.ObjectToString(_styles.Get((Object)(_strkey)));
 //BA.debugLineNum = 2221;BA.debugLine="Dim strLine As String = ToStyle(strKey,strValue)";
_strline = _tostyle(_strkey,_strvalue);
 //BA.debugLineNum = 2222;BA.debugLine="sb.Append(strLine)";
_sb.Append(_strline);
 //BA.debugLineNum = 2223;BA.debugLine="For kCnt = 1 To kTot";
{
final int step9 = 1;
final int limit9 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit9 ;_kcnt = _kcnt + step9 ) {
 //BA.debugLineNum = 2224;BA.debugLine="Dim strKey As String = Styles.GetKeyAt(kCnt)";
_strkey = BA.ObjectToString(_styles.GetKeyAt(_kcnt));
 //BA.debugLineNum = 2225;BA.debugLine="Dim strValue As String = Styles.Get(strKey)";
_strvalue = BA.ObjectToString(_styles.Get((Object)(_strkey)));
 //BA.debugLineNum = 2226;BA.debugLine="Dim strLine As String = ToStyle(strKey,strValue)";
_strline = _tostyle(_strkey,_strvalue);
 //BA.debugLineNum = 2227;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 2228;BA.debugLine="sb.Append(strLine)";
_sb.Append(_strline);
 }
};
 //BA.debugLineNum = 2230;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 2231;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _centeritems(boolean _b) throws Exception{
 //BA.debugLineNum = 712;BA.debugLine="Sub CenterItems(b As Boolean) As VueHTML";
 //BA.debugLineNum = 713;BA.debugLine="SetStyle(\"justify-content\", \"center\")";
_setstyle("justify-content","center");
 //BA.debugLineNum = 714;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _centertext(boolean _b) throws Exception{
 //BA.debugLineNum = 718;BA.debugLine="Sub CenterText(b As Boolean) As VueHTML";
 //BA.debugLineNum = 719;BA.debugLine="SetStyle(\"text-align\", \"center\")";
_setstyle("text-align","center");
 //BA.debugLineNum = 720;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 721;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Tag As String";
_tag = "";
 //BA.debugLineNum = 6;BA.debugLine="Private properties As Map";
_properties = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="Private Contents As List";
_contents = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="Private Classes As Map";
_classes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Public Styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private LooseAttributes As Map";
_looseattributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private DontBreak As List";
_dontbreak = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private Prefix As String";
_prefix = "";
 //BA.debugLineNum = 13;BA.debugLine="Private DoAProperClose As Boolean";
_doaproperclose = false;
 //BA.debugLineNum = 14;BA.debugLine="Private CSSRule As Map";
_cssrule = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 15;BA.debugLine="Private SingleQuote As List";
_singlequote = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Private SBAfter As StringBuilder";
_sbafter = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private SBBefore As StringBuilder";
_sbbefore = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public IsImportant As Boolean";
_isimportant = false;
 //BA.debugLineNum = 19;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 20;BA.debugLine="Private ParentID As String";
_parentid = "";
 //BA.debugLineNum = 21;BA.debugLine="Private ds As String";
_ds = "";
 //BA.debugLineNum = 22;BA.debugLine="Private hasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 23;BA.debugLine="Private DesignMode As Boolean";
_designmode = false;
 //BA.debugLineNum = 24;BA.debugLine="Private vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 25;BA.debugLine="Public showKey As String";
_showkey = "";
 //BA.debugLineNum = 26;BA.debugLine="Public disKey As String";
_diskey = "";
 //BA.debugLineNum = 27;BA.debugLine="Public reqKey As String";
_reqkey = "";
 //BA.debugLineNum = 28;BA.debugLine="Public errKey As String";
_errkey = "";
 //BA.debugLineNum = 29;BA.debugLine="Private styleKey As String";
_stylekey = "";
 //BA.debugLineNum = 30;BA.debugLine="Private classList As List";
_classlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 31;BA.debugLine="Private classKey As String";
_classkey = "";
 //BA.debugLineNum = 32;BA.debugLine="Public bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 33;BA.debugLine="Public value As String";
_value = "";
 //BA.debugLineNum = 34;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
 //BA.debugLineNum = 35;BA.debugLine="Public fieldType As String";
_fieldtype = "";
 //BA.debugLineNum = 36;BA.debugLine="Public typeOf As String";
_typeof = "";
 //BA.debugLineNum = 37;BA.debugLine="Public InputType As String";
_inputtype = "";
 //BA.debugLineNum = 38;BA.debugLine="Public styleList As Map";
_stylelist = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public boolean  _classexists(String _svalue) throws Exception{
 //BA.debugLineNum = 1858;BA.debugLine="Sub ClassExists(svalue As String) As Boolean";
 //BA.debugLineNum = 1859;BA.debugLine="svalue = svalue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 1860;BA.debugLine="If svalue.Length > 0 Then";
if (_svalue.length()>0) { 
 //BA.debugLineNum = 1861;BA.debugLine="Return Classes.ContainsKey(svalue)";
if (true) return _classes.ContainsKey((Object)(_svalue));
 };
 //BA.debugLineNum = 1863;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 1864;BA.debugLine="End Sub";
return false;
}
public b4j.example.vuehtml  _clear() throws Exception{
 //BA.debugLineNum = 1441;BA.debugLine="Sub Clear As VueHTML";
 //BA.debugLineNum = 1442;BA.debugLine="Contents.clear";
_contents.Clear();
 //BA.debugLineNum = 1443;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1444;BA.debugLine="End Sub";
return null;
}
public String  _close() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2663;BA.debugLine="private Sub Close() As String";
 //BA.debugLineNum = 2664;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2665;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2666;BA.debugLine="Select Case Tag.ToLowerCase";
switch (BA.switchObjectToInt(_tag.toLowerCase(),"img","link","meta","input","source","hr","br")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: {
 //BA.debugLineNum = 2668;BA.debugLine="DoAProperClose = False";
_doaproperclose = __c.False;
 break; }
}
;
 //BA.debugLineNum = 2670;BA.debugLine="If DoAProperClose = True Then";
if (_doaproperclose==__c.True) { 
 //BA.debugLineNum = 2671;BA.debugLine="sb.Append(\"</\")";
_sb.Append("</");
 //BA.debugLineNum = 2672;BA.debugLine="sb.Append(Tag)";
_sb.Append(_tag);
 //BA.debugLineNum = 2673;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 };
 //BA.debugLineNum = 2675;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 2676;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _createanchor(String _aid) throws Exception{
b4j.example.vuehtml _a = null;
 //BA.debugLineNum = 3206;BA.debugLine="Sub CreateAnchor(aid As String) As VueHTML";
 //BA.debugLineNum = 3207;BA.debugLine="Dim a As VueHTML";
_a = new b4j.example.vuehtml();
 //BA.debugLineNum = 3208;BA.debugLine="a.Initialize(aid,\"a\")";
_a._initialize /*b4j.example.vuehtml*/ (ba,_aid,"a");
 //BA.debugLineNum = 3209;BA.debugLine="Return a";
if (true) return _a;
 //BA.debugLineNum = 3210;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createarticle(String _aid) throws Exception{
b4j.example.vuehtml _a = null;
 //BA.debugLineNum = 3213;BA.debugLine="Sub CreateArticle(aid As String) As VueHTML";
 //BA.debugLineNum = 3214;BA.debugLine="Dim a As VueHTML";
_a = new b4j.example.vuehtml();
 //BA.debugLineNum = 3215;BA.debugLine="a.Initialize(aid,\"article\")";
_a._initialize /*b4j.example.vuehtml*/ (ba,_aid,"article");
 //BA.debugLineNum = 3216;BA.debugLine="Return a";
if (true) return _a;
 //BA.debugLineNum = 3217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createaside(String _aid) throws Exception{
b4j.example.vuehtml _a = null;
 //BA.debugLineNum = 3220;BA.debugLine="Sub CreateAside(aid As String) As VueHTML";
 //BA.debugLineNum = 3221;BA.debugLine="Dim a As VueHTML";
_a = new b4j.example.vuehtml();
 //BA.debugLineNum = 3222;BA.debugLine="a.Initialize(aid,\"aside\")";
_a._initialize /*b4j.example.vuehtml*/ (ba,_aid,"aside");
 //BA.debugLineNum = 3223;BA.debugLine="Return a";
if (true) return _a;
 //BA.debugLineNum = 3224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createaudio(String _cid) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 3274;BA.debugLine="Sub CreateAUDIO(cid As String) As VueHTML";
 //BA.debugLineNum = 3275;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
 //BA.debugLineNum = 3276;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 3277;BA.debugLine="div.Initialize(cid,\"audio\")";
_div._initialize /*b4j.example.vuehtml*/ (ba,_cid,"audio");
 //BA.debugLineNum = 3278;BA.debugLine="Return div";
if (true) return _div;
 //BA.debugLineNum = 3279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createblockquote(String _bqid) throws Exception{
b4j.example.vuehtml _ul = null;
 //BA.debugLineNum = 2992;BA.debugLine="Sub CreateBlockQuote(bqid As String) As VueHTML";
 //BA.debugLineNum = 2993;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
 //BA.debugLineNum = 2994;BA.debugLine="ul.Initialize(bqid,\"blockquote\")";
_ul._initialize /*b4j.example.vuehtml*/ (ba,_bqid,"blockquote");
 //BA.debugLineNum = 2995;BA.debugLine="Return ul";
if (true) return _ul;
 //BA.debugLineNum = 2996;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createbutton(String _btnid) throws Exception{
b4j.example.vuehtml _b = null;
 //BA.debugLineNum = 3431;BA.debugLine="Sub CreateButton(btnID As String) As VueHTML";
 //BA.debugLineNum = 3432;BA.debugLine="Dim b As VueHTML";
_b = new b4j.example.vuehtml();
 //BA.debugLineNum = 3433;BA.debugLine="b.Initialize(btnID, \"button\")";
_b._initialize /*b4j.example.vuehtml*/ (ba,_btnid,"button");
 //BA.debugLineNum = 3434;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 3435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createcanvas(String _cid) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 3266;BA.debugLine="Sub CreateCANVAS(cid As String) As VueHTML";
 //BA.debugLineNum = 3267;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
 //BA.debugLineNum = 3268;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 3269;BA.debugLine="div.Initialize(cid,\"canvas\")";
_div._initialize /*b4j.example.vuehtml*/ (ba,_cid,"canvas");
 //BA.debugLineNum = 3270;BA.debugLine="Return div";
if (true) return _div;
 //BA.debugLineNum = 3271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createcaption(String _cid) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 3331;BA.debugLine="Sub CreateCAPTION(cid As String) As VueHTML";
 //BA.debugLineNum = 3332;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
 //BA.debugLineNum = 3333;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 3334;BA.debugLine="div.Initialize(cid,\"caption\")";
_div._initialize /*b4j.example.vuehtml*/ (ba,_cid,"caption");
 //BA.debugLineNum = 3335;BA.debugLine="Return div";
if (true) return _div;
 //BA.debugLineNum = 3336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createcode(String _oid) throws Exception{
b4j.example.vuehtml _o = null;
 //BA.debugLineNum = 3404;BA.debugLine="Sub CreateCode(oid As String) As VueHTML";
 //BA.debugLineNum = 3405;BA.debugLine="Dim o As VueHTML";
_o = new b4j.example.vuehtml();
 //BA.debugLineNum = 3406;BA.debugLine="o.Initialize(oid, \"code\")";
_o._initialize /*b4j.example.vuehtml*/ (ba,_oid,"code");
 //BA.debugLineNum = 3407;BA.debugLine="Return o";
if (true) return _o;
 //BA.debugLineNum = 3408;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createcontainer(String _cid) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 3258;BA.debugLine="Sub CreateContainer(cid As String) As VueHTML";
 //BA.debugLineNum = 3259;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
 //BA.debugLineNum = 3260;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 3261;BA.debugLine="div.Initialize(cid,\"div\").AddClass(\"container\")";
_div._initialize /*b4j.example.vuehtml*/ (ba,_cid,"div")._addclass /*b4j.example.vuehtml*/ ("container");
 //BA.debugLineNum = 3262;BA.debugLine="Return div";
if (true) return _div;
 //BA.debugLineNum = 3263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createdatalist(String _nid) throws Exception{
b4j.example.vuehtml _n = null;
 //BA.debugLineNum = 2963;BA.debugLine="Sub CreateDataList(nid As String) As VueHTML";
 //BA.debugLineNum = 2964;BA.debugLine="Dim n As VueHTML";
_n = new b4j.example.vuehtml();
 //BA.debugLineNum = 2965;BA.debugLine="n.Initialize(nid, \"datalist\")";
_n._initialize /*b4j.example.vuehtml*/ (ba,_nid,"datalist");
 //BA.debugLineNum = 2966;BA.debugLine="Return n";
if (true) return _n;
 //BA.debugLineNum = 2967;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createdd(String _preid) throws Exception{
b4j.example.vuehtml _ul = null;
 //BA.debugLineNum = 3036;BA.debugLine="Sub CreateDD(preid As String) As VueHTML";
 //BA.debugLineNum = 3037;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
 //BA.debugLineNum = 3038;BA.debugLine="ul.Initialize(preid, \"dd\")";
_ul._initialize /*b4j.example.vuehtml*/ (ba,_preid,"dd");
 //BA.debugLineNum = 3039;BA.debugLine="Return ul";
if (true) return _ul;
 //BA.debugLineNum = 3040;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _creatediv(String _did) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 2985;BA.debugLine="Sub CreateDIV(did As String) As VueHTML";
 //BA.debugLineNum = 2986;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 2987;BA.debugLine="div.Initialize(did,\"div\")";
_div._initialize /*b4j.example.vuehtml*/ (ba,_did,"div");
 //BA.debugLineNum = 2988;BA.debugLine="Return div";
if (true) return _div;
 //BA.debugLineNum = 2989;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createdl(String _preid) throws Exception{
b4j.example.vuehtml _ul = null;
 //BA.debugLineNum = 3024;BA.debugLine="Sub CreateDL(preid As String) As VueHTML";
 //BA.debugLineNum = 3025;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
 //BA.debugLineNum = 3026;BA.debugLine="ul.Initialize(preid, \"dl\")";
_ul._initialize /*b4j.example.vuehtml*/ (ba,_preid,"dl");
 //BA.debugLineNum = 3027;BA.debugLine="Return ul";
if (true) return _ul;
 //BA.debugLineNum = 3028;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createdt(String _preid) throws Exception{
b4j.example.vuehtml _ul = null;
 //BA.debugLineNum = 3030;BA.debugLine="Sub CreateDT(preid As String) As VueHTML";
 //BA.debugLineNum = 3031;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
 //BA.debugLineNum = 3032;BA.debugLine="ul.Initialize(preid, \"dt\")";
_ul._initialize /*b4j.example.vuehtml*/ (ba,_preid,"dt");
 //BA.debugLineNum = 3033;BA.debugLine="Return ul";
if (true) return _ul;
 //BA.debugLineNum = 3034;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createem(String _sid) throws Exception{
b4j.example.vuehtml _s = null;
 //BA.debugLineNum = 3184;BA.debugLine="Sub CreateEM(sid As String) As VueHTML";
 //BA.debugLineNum = 3185;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
 //BA.debugLineNum = 3186;BA.debugLine="s.Initialize(sid, \"em\")";
_s._initialize /*b4j.example.vuehtml*/ (ba,_sid,"em");
 //BA.debugLineNum = 3187;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 3188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createfieldset(String _fid,String _scaption) throws Exception{
b4j.example.vuehtml _fs = null;
b4j.example.vuehtml _lgnd = null;
 //BA.debugLineNum = 3249;BA.debugLine="Sub CreateFieldSet(fID As String, sCaption As Stri";
 //BA.debugLineNum = 3250;BA.debugLine="Dim fs As VueHTML";
_fs = new b4j.example.vuehtml();
 //BA.debugLineNum = 3251;BA.debugLine="fs.Initialize(fID,\"fieldset\")";
_fs._initialize /*b4j.example.vuehtml*/ (ba,_fid,"fieldset");
 //BA.debugLineNum = 3252;BA.debugLine="Dim lgnd As VueHTML = CreateLegend(\"\", sCaption)";
_lgnd = _createlegend("",_scaption);
 //BA.debugLineNum = 3253;BA.debugLine="fs.AddElement(lgnd)";
_fs._addelement /*b4j.example.vuehtml*/ (_lgnd);
 //BA.debugLineNum = 3254;BA.debugLine="Return fs";
if (true) return _fs;
 //BA.debugLineNum = 3255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createfigcaption(String _fid) throws Exception{
b4j.example.vuehtml _f = null;
 //BA.debugLineNum = 3103;BA.debugLine="Sub CreateFigCaption(fid As String) As VueHTML";
 //BA.debugLineNum = 3104;BA.debugLine="Dim f As VueHTML";
_f = new b4j.example.vuehtml();
 //BA.debugLineNum = 3105;BA.debugLine="f.Initialize(fid, \"figcaption\")";
_f._initialize /*b4j.example.vuehtml*/ (ba,_fid,"figcaption");
 //BA.debugLineNum = 3106;BA.debugLine="Return f";
if (true) return _f;
 //BA.debugLineNum = 3107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createfigure(String _fid) throws Exception{
b4j.example.vuehtml _f = null;
 //BA.debugLineNum = 3111;BA.debugLine="Sub CreateFigure(fid As String) As VueHTML";
 //BA.debugLineNum = 3112;BA.debugLine="Dim f As VueHTML";
_f = new b4j.example.vuehtml();
 //BA.debugLineNum = 3113;BA.debugLine="f.Initialize(fid, \"figure\")";
_f._initialize /*b4j.example.vuehtml*/ (ba,_fid,"figure");
 //BA.debugLineNum = 3114;BA.debugLine="Return f";
if (true) return _f;
 //BA.debugLineNum = 3115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createfooter(String _fid) throws Exception{
b4j.example.vuehtml _f = null;
 //BA.debugLineNum = 2949;BA.debugLine="Sub CreateFooter(fid As String) As VueHTML";
 //BA.debugLineNum = 2950;BA.debugLine="Dim f As VueHTML";
_f = new b4j.example.vuehtml();
 //BA.debugLineNum = 2951;BA.debugLine="f.Initialize(fid, \"footer\")";
_f._initialize /*b4j.example.vuehtml*/ (ba,_fid,"footer");
 //BA.debugLineNum = 2952;BA.debugLine="Return f";
if (true) return _f;
 //BA.debugLineNum = 2953;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createform(String _fid) throws Exception{
b4j.example.vuehtml _frm = null;
 //BA.debugLineNum = 3235;BA.debugLine="Sub CreateForm(fID As String) As VueHTML";
 //BA.debugLineNum = 3236;BA.debugLine="Dim frm As VueHTML";
_frm = new b4j.example.vuehtml();
 //BA.debugLineNum = 3237;BA.debugLine="frm.Initialize(fID, \"form\")";
_frm._initialize /*b4j.example.vuehtml*/ (ba,_fid,"form");
 //BA.debugLineNum = 3238;BA.debugLine="Return frm";
if (true) return _frm;
 //BA.debugLineNum = 3239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh(String _hid,int _size) throws Exception{
String _hkey = "";
b4j.example.vuehtml _h = null;
 //BA.debugLineNum = 3118;BA.debugLine="Sub CreateH(hid As String, size As Int) As VueHTML";
 //BA.debugLineNum = 3119;BA.debugLine="Dim hkey As String = \"h\" & CStr(size)";
_hkey = "h"+_cstr((Object)(_size));
 //BA.debugLineNum = 3120;BA.debugLine="Dim h As VueHTML";
_h = new b4j.example.vuehtml();
 //BA.debugLineNum = 3121;BA.debugLine="h.Initialize(hid, hkey)";
_h._initialize /*b4j.example.vuehtml*/ (ba,_hid,_hkey);
 //BA.debugLineNum = 3122;BA.debugLine="Return h";
if (true) return _h;
 //BA.debugLineNum = 3123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh1(String _hid) throws Exception{
b4j.example.vuehtml _hdr = null;
 //BA.debugLineNum = 3127;BA.debugLine="Sub CreateH1(hid As String) As VueHTML";
 //BA.debugLineNum = 3128;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,1)";
_hdr = _createh(_hid,(int) (1));
 //BA.debugLineNum = 3129;BA.debugLine="Return hdr";
if (true) return _hdr;
 //BA.debugLineNum = 3130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh2(String _hid) throws Exception{
b4j.example.vuehtml _hdr = null;
 //BA.debugLineNum = 3133;BA.debugLine="Sub CreateH2(hid As String) As VueHTML";
 //BA.debugLineNum = 3134;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,2)";
_hdr = _createh(_hid,(int) (2));
 //BA.debugLineNum = 3135;BA.debugLine="Return hdr";
if (true) return _hdr;
 //BA.debugLineNum = 3136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh3(String _hid) throws Exception{
b4j.example.vuehtml _hdr = null;
 //BA.debugLineNum = 3139;BA.debugLine="Sub CreateH3(hid As String) As VueHTML";
 //BA.debugLineNum = 3140;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,3)";
_hdr = _createh(_hid,(int) (3));
 //BA.debugLineNum = 3141;BA.debugLine="Return hdr";
if (true) return _hdr;
 //BA.debugLineNum = 3142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh4(String _hid) throws Exception{
b4j.example.vuehtml _hdr = null;
 //BA.debugLineNum = 3145;BA.debugLine="Sub CreateH4(hid As String) As VueHTML";
 //BA.debugLineNum = 3146;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,4)";
_hdr = _createh(_hid,(int) (4));
 //BA.debugLineNum = 3147;BA.debugLine="Return hdr";
if (true) return _hdr;
 //BA.debugLineNum = 3148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh5(String _hid) throws Exception{
b4j.example.vuehtml _hdr = null;
 //BA.debugLineNum = 3151;BA.debugLine="Sub CreateH5(hid As String) As VueHTML";
 //BA.debugLineNum = 3152;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,5)";
_hdr = _createh(_hid,(int) (5));
 //BA.debugLineNum = 3153;BA.debugLine="Return hdr";
if (true) return _hdr;
 //BA.debugLineNum = 3154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createh6(String _hid) throws Exception{
b4j.example.vuehtml _hdr = null;
 //BA.debugLineNum = 3157;BA.debugLine="Sub CreateH6(hid As String) As VueHTML";
 //BA.debugLineNum = 3158;BA.debugLine="Dim hdr As VueHTML = CreateH(hid,6)";
_hdr = _createh(_hid,(int) (6));
 //BA.debugLineNum = 3159;BA.debugLine="Return hdr";
if (true) return _hdr;
 //BA.debugLineNum = 3160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createheader(String _hid) throws Exception{
b4j.example.vuehtml _h = null;
 //BA.debugLineNum = 2970;BA.debugLine="Sub CreateHeader(hid As String) As VueHTML";
 //BA.debugLineNum = 2971;BA.debugLine="Dim h As VueHTML";
_h = new b4j.example.vuehtml();
 //BA.debugLineNum = 2972;BA.debugLine="h.Initialize(hid, \"header\")";
_h._initialize /*b4j.example.vuehtml*/ (ba,_hid,"header");
 //BA.debugLineNum = 2973;BA.debugLine="Return h";
if (true) return _h;
 //BA.debugLineNum = 2974;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createhr(boolean _b) throws Exception{
b4j.example.vuehtml _hr = null;
 //BA.debugLineNum = 3164;BA.debugLine="Sub CreateHR(b As Boolean) As VueHTML";
 //BA.debugLineNum = 3165;BA.debugLine="Dim hr As VueHTML";
_hr = new b4j.example.vuehtml();
 //BA.debugLineNum = 3166;BA.debugLine="hr.Initialize(\"\",\"hr\")";
_hr._initialize /*b4j.example.vuehtml*/ (ba,"","hr");
 //BA.debugLineNum = 3167;BA.debugLine="Return hr";
if (true) return _hr;
 //BA.debugLineNum = 3168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createiframe(String _ifid) throws Exception{
b4j.example.vuehtml _i = null;
 //BA.debugLineNum = 3531;BA.debugLine="Sub CreateIFrame(ifid As String) As VueHTML";
 //BA.debugLineNum = 3532;BA.debugLine="Dim i As VueHTML";
_i = new b4j.example.vuehtml();
 //BA.debugLineNum = 3533;BA.debugLine="i.Initialize(ifid, \"iframe\")";
_i._initialize /*b4j.example.vuehtml*/ (ba,_ifid,"iframe");
 //BA.debugLineNum = 3534;BA.debugLine="Return i";
if (true) return _i;
 //BA.debugLineNum = 3535;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createimg(String _imgid) throws Exception{
b4j.example.vuehtml _img = null;
 //BA.debugLineNum = 3096;BA.debugLine="Sub CreateIMG(imgid As String) As VueHTML";
 //BA.debugLineNum = 3097;BA.debugLine="Dim img As VueHTML";
_img = new b4j.example.vuehtml();
 //BA.debugLineNum = 3098;BA.debugLine="img.Initialize(imgid, \"img\")";
_img._initialize /*b4j.example.vuehtml*/ (ba,_imgid,"img");
 //BA.debugLineNum = 3099;BA.debugLine="Return img";
if (true) return _img;
 //BA.debugLineNum = 3100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinput(String _tid) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3366;BA.debugLine="Sub CreateInput(tid As String) As VueHTML";
 //BA.debugLineNum = 3367;BA.debugLine="tid = tid.tolowercase";
_tid = _tid.toLowerCase();
 //BA.debugLineNum = 3368;BA.debugLine="Dim input As VueHTML";
_input = new b4j.example.vuehtml();
 //BA.debugLineNum = 3369;BA.debugLine="input.Initialize(tid, \"input\")";
_input._initialize /*b4j.example.vuehtml*/ (ba,_tid,"input");
 //BA.debugLineNum = 3370;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputbutton(String _tid,String _tvalue) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3438;BA.debugLine="Sub CreateInputButton(tid As String, tValue As Str";
 //BA.debugLineNum = 3439;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetAttrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("button")._setattrvalue /*b4j.example.vuehtml*/ (_tvalue);
 //BA.debugLineNum = 3440;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3441;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputcheckbox(String _tid) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3487;BA.debugLine="Sub CreateInputCheckBox(tid As String) As VueHTML";
 //BA.debugLineNum = 3488;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("checkbox")._setattr /*b4j.example.vuehtml*/ ("tabindex","0");
 //BA.debugLineNum = 3489;BA.debugLine="input.AddAttribute(\"autocomplete\", \"off\")";
_input._addattribute /*b4j.example.vuehtml*/ ("autocomplete","off");
 //BA.debugLineNum = 3490;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3491;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputcolor(String _tid) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3468;BA.debugLine="Sub CreateInputColor(tid As String) As VueHTML";
 //BA.debugLineNum = 3469;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("color");
 //BA.debugLineNum = 3470;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3471;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputdate(String _tid) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3462;BA.debugLine="Sub CreateInputDate(tid As String) As VueHTML";
 //BA.debugLineNum = 3463;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("date");
 //BA.debugLineNum = 3464;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3465;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputemail(String _tid) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3475;BA.debugLine="Sub CreateInputEmail(tid As String) As VueHTML";
 //BA.debugLineNum = 3476;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("email");
 //BA.debugLineNum = 3477;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3478;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputfile(String _tid) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3456;BA.debugLine="Sub CreateInputFile(tid As String) As VueHTML";
 //BA.debugLineNum = 3457;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("file");
 //BA.debugLineNum = 3458;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputnumber(String _tid) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3525;BA.debugLine="Sub CreateInputNumber(tid As String) As VueHTML";
 //BA.debugLineNum = 3526;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("number");
 //BA.debugLineNum = 3527;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3528;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputpassword(String _tid) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3481;BA.debugLine="Sub CreateInputPassword(tid As String) As VueHTML";
 //BA.debugLineNum = 3482;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("password");
 //BA.debugLineNum = 3483;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3484;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputradio(String _tid,String _tname) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3505;BA.debugLine="Sub CreateInputRadio(tid As String, tname As Strin";
 //BA.debugLineNum = 3506;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("radio")._setattrtabindex /*b4j.example.vuehtml*/ ("0")._setattrname /*b4j.example.vuehtml*/ (_tname);
 //BA.debugLineNum = 3507;BA.debugLine="input.SetAttrautocomplete(\"off\")";
_input._setattrautocomplete /*b4j.example.vuehtml*/ (BA.ObjectToBoolean("off"));
 //BA.debugLineNum = 3508;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3509;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputrange(String _sid) throws Exception{
b4j.example.vuehtml _s = null;
 //BA.debugLineNum = 2925;BA.debugLine="Sub CreateInputRange(sid As String) As VueHTML";
 //BA.debugLineNum = 2926;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
 //BA.debugLineNum = 2927;BA.debugLine="s.Initialize(sid, \"input\").SetAttrTYPE(\"range\")";
_s._initialize /*b4j.example.vuehtml*/ (ba,_sid,"input")._setattrtype /*b4j.example.vuehtml*/ ("range");
 //BA.debugLineNum = 2928;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 2929;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputreset(String _tid,String _tvalue) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3444;BA.debugLine="Sub CreateInputReset(tid As String, tValue As Stri";
 //BA.debugLineNum = 3445;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetAttrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("reset")._setattrvalue /*b4j.example.vuehtml*/ (_tvalue);
 //BA.debugLineNum = 3446;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputsearch(String _sid) throws Exception{
b4j.example.vuehtml _s = null;
 //BA.debugLineNum = 2918;BA.debugLine="Sub CreateInputSearch(sid As String) As VueHTML";
 //BA.debugLineNum = 2919;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
 //BA.debugLineNum = 2920;BA.debugLine="s.Initialize(sid, \"input\").SetAttrTYPE(\"search\")";
_s._initialize /*b4j.example.vuehtml*/ (ba,_sid,"input")._setattrtype /*b4j.example.vuehtml*/ ("search");
 //BA.debugLineNum = 2921;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 2922;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputsubmit(String _tid,String _tvalue) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3450;BA.debugLine="Sub CreateInputSubmit(tid As String, tValue As Str";
 //BA.debugLineNum = 3451;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("submit")._setattrvalue /*b4j.example.vuehtml*/ (_tvalue);
 //BA.debugLineNum = 3452;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3453;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputtel(String _tid) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3512;BA.debugLine="Sub CreateInputTel(tid As String) As VueHTML";
 //BA.debugLineNum = 3513;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("tel");
 //BA.debugLineNum = 3514;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputtext(String _tid) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3425;BA.debugLine="Sub CreateInputText(tid As String) As VueHTML";
 //BA.debugLineNum = 3426;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetAttrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("text");
 //BA.debugLineNum = 3427;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3428;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createinputurl(String _tid) throws Exception{
b4j.example.vuehtml _input = null;
 //BA.debugLineNum = 3518;BA.debugLine="Sub CreateInputUrl(tid As String) As VueHTML";
 //BA.debugLineNum = 3519;BA.debugLine="Dim input As VueHTML = CreateInput(tid).SetattrTY";
_input = _createinput(_tid)._setattrtype /*b4j.example.vuehtml*/ ("url");
 //BA.debugLineNum = 3520;BA.debugLine="Return input";
if (true) return _input;
 //BA.debugLineNum = 3521;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createlabel(String _lid) throws Exception{
b4j.example.vuehtml _lbl = null;
 //BA.debugLineNum = 3349;BA.debugLine="Sub CreateLabel(lid As String) As VueHTML";
 //BA.debugLineNum = 3350;BA.debugLine="lid = lid.tolowercase";
_lid = _lid.toLowerCase();
 //BA.debugLineNum = 3351;BA.debugLine="Dim lbl As VueHTML";
_lbl = new b4j.example.vuehtml();
 //BA.debugLineNum = 3352;BA.debugLine="lbl.Initialize(lid, \"label\")";
_lbl._initialize /*b4j.example.vuehtml*/ (ba,_lid,"label");
 //BA.debugLineNum = 3353;BA.debugLine="Return lbl";
if (true) return _lbl;
 //BA.debugLineNum = 3354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createlegend(String _fid,String _scaption) throws Exception{
b4j.example.vuehtml _fs = null;
 //BA.debugLineNum = 3242;BA.debugLine="Sub CreateLegend(fID As String, sCaption As String";
 //BA.debugLineNum = 3243;BA.debugLine="Dim fs As VueHTML";
_fs = new b4j.example.vuehtml();
 //BA.debugLineNum = 3244;BA.debugLine="fs.Initialize(fID, \"legend\").AddContent(sCaption)";
_fs._initialize /*b4j.example.vuehtml*/ (ba,_fid,"legend")._addcontent /*b4j.example.vuehtml*/ (_scaption);
 //BA.debugLineNum = 3245;BA.debugLine="Return fs";
if (true) return _fs;
 //BA.debugLineNum = 3246;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createli(String _liid) throws Exception{
b4j.example.vuehtml _li = null;
 //BA.debugLineNum = 3089;BA.debugLine="Sub CreateLI(liid As String) As VueHTML";
 //BA.debugLineNum = 3090;BA.debugLine="Dim li As VueHTML";
_li = new b4j.example.vuehtml();
 //BA.debugLineNum = 3091;BA.debugLine="li.Initialize(liid, \"li\")";
_li._initialize /*b4j.example.vuehtml*/ (ba,_liid,"li");
 //BA.debugLineNum = 3092;BA.debugLine="Return li";
if (true) return _li;
 //BA.debugLineNum = 3093;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createmain(String _mainid) throws Exception{
b4j.example.vuehtml _m = null;
 //BA.debugLineNum = 2933;BA.debugLine="Sub CreateMain(mainid As String) As VueHTML";
 //BA.debugLineNum = 2934;BA.debugLine="Dim m As VueHTML";
_m = new b4j.example.vuehtml();
 //BA.debugLineNum = 2935;BA.debugLine="m.Initialize(mainid, \"main\")";
_m._initialize /*b4j.example.vuehtml*/ (ba,_mainid,"main");
 //BA.debugLineNum = 2936;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 2937;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createmark(String _preid) throws Exception{
b4j.example.vuehtml _ul = null;
 //BA.debugLineNum = 3010;BA.debugLine="Sub CreateMARK(preid As String) As VueHTML";
 //BA.debugLineNum = 3011;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
 //BA.debugLineNum = 3012;BA.debugLine="ul.Initialize(preid, \"mark\")";
_ul._initialize /*b4j.example.vuehtml*/ (ba,_preid,"mark");
 //BA.debugLineNum = 3013;BA.debugLine="Return ul";
if (true) return _ul;
 //BA.debugLineNum = 3014;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createnav(String _nid) throws Exception{
b4j.example.vuehtml _n = null;
 //BA.debugLineNum = 2956;BA.debugLine="Sub CreateNav(nid As String) As VueHTML";
 //BA.debugLineNum = 2957;BA.debugLine="Dim n As VueHTML";
_n = new b4j.example.vuehtml();
 //BA.debugLineNum = 2958;BA.debugLine="n.Initialize(nid, \"nav\")";
_n._initialize /*b4j.example.vuehtml*/ (ba,_nid,"nav");
 //BA.debugLineNum = 2959;BA.debugLine="Return n";
if (true) return _n;
 //BA.debugLineNum = 2960;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createol(String _preid) throws Exception{
b4j.example.vuehtml _ul = null;
 //BA.debugLineNum = 3042;BA.debugLine="Sub CreateOL(preid As String) As VueHTML";
 //BA.debugLineNum = 3043;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
 //BA.debugLineNum = 3044;BA.debugLine="ul.Initialize(preid, \"ol\")";
_ul._initialize /*b4j.example.vuehtml*/ (ba,_preid,"ol");
 //BA.debugLineNum = 3045;BA.debugLine="Return ul";
if (true) return _ul;
 //BA.debugLineNum = 3046;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createol1(String _ulid,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
b4j.example.vuehtml _ul = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
String _optid = "";
String _optval = "";
b4j.example.vuehtml _thisoption = null;
 //BA.debugLineNum = 3056;BA.debugLine="Sub CreateOL1(ulid As String, items As List) As Vu";
 //BA.debugLineNum = 3057;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
 //BA.debugLineNum = 3058;BA.debugLine="ul.Initialize(ulid, \"ol\")";
_ul._initialize /*b4j.example.vuehtml*/ (ba,_ulid,"ol");
 //BA.debugLineNum = 3059;BA.debugLine="For Each opt As Map In items";
_opt = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _items;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_opt = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 3060;BA.debugLine="Dim optid As String = opt.Get(\"id\")";
_optid = BA.ObjectToString(_opt.Get((Object)("id")));
 //BA.debugLineNum = 3061;BA.debugLine="Dim optval As String = opt.Get(\"value\")";
_optval = BA.ObjectToString(_opt.Get((Object)("value")));
 //BA.debugLineNum = 3062;BA.debugLine="Dim thisoption As VueHTML = CreateLI(\"\")";
_thisoption = _createli("");
 //BA.debugLineNum = 3063;BA.debugLine="optid = CStr(optid)";
_optid = _cstr((Object)(_optid));
 //BA.debugLineNum = 3064;BA.debugLine="optval = CStr(optval)";
_optval = _cstr((Object)(_optval));
 //BA.debugLineNum = 3065;BA.debugLine="thisoption.SetText(optval)";
_thisoption._settext /*b4j.example.vuehtml*/ (_optval);
 //BA.debugLineNum = 3066;BA.debugLine="thisoption.SetAttrVALUE(optid)";
_thisoption._setattrvalue /*b4j.example.vuehtml*/ (_optid);
 //BA.debugLineNum = 3067;BA.debugLine="ul.AddElement(thisoption)";
_ul._addelement /*b4j.example.vuehtml*/ (_thisoption);
 }
};
 //BA.debugLineNum = 3069;BA.debugLine="Return ul";
if (true) return _ul;
 //BA.debugLineNum = 3070;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createoptgroup(String _oid) throws Exception{
b4j.example.vuehtml _o = null;
 //BA.debugLineNum = 3389;BA.debugLine="Sub CreateOptGroup(oid As String) As VueHTML";
 //BA.debugLineNum = 3390;BA.debugLine="Dim o As VueHTML";
_o = new b4j.example.vuehtml();
 //BA.debugLineNum = 3391;BA.debugLine="o.Initialize(oid, \"optgroup\")";
_o._initialize /*b4j.example.vuehtml*/ (ba,_oid,"optgroup");
 //BA.debugLineNum = 3392;BA.debugLine="Return o";
if (true) return _o;
 //BA.debugLineNum = 3393;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createoption(String _oid) throws Exception{
b4j.example.vuehtml _o = null;
 //BA.debugLineNum = 3381;BA.debugLine="Sub CreateOption(oid As String) As VueHTML";
 //BA.debugLineNum = 3382;BA.debugLine="Dim o As VueHTML";
_o = new b4j.example.vuehtml();
 //BA.debugLineNum = 3383;BA.debugLine="o.Initialize(oid, \"option\")";
_o._initialize /*b4j.example.vuehtml*/ (ba,_oid,"option");
 //BA.debugLineNum = 3384;BA.debugLine="Return o";
if (true) return _o;
 //BA.debugLineNum = 3385;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createparagraph(String _pid) throws Exception{
b4j.example.vuehtml _p = null;
 //BA.debugLineNum = 3228;BA.debugLine="Sub CreateParagraph(pid As String) As VueHTML";
 //BA.debugLineNum = 3229;BA.debugLine="Dim p As VueHTML";
_p = new b4j.example.vuehtml();
 //BA.debugLineNum = 3230;BA.debugLine="p.Initialize(pid, \"p\")";
_p._initialize /*b4j.example.vuehtml*/ (ba,_pid,"p");
 //BA.debugLineNum = 3231;BA.debugLine="Return p";
if (true) return _p;
 //BA.debugLineNum = 3232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createpre(String _preid) throws Exception{
b4j.example.vuehtml _ul = null;
 //BA.debugLineNum = 3004;BA.debugLine="Sub CreatePRE(preid As String) As VueHTML";
 //BA.debugLineNum = 3005;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
 //BA.debugLineNum = 3006;BA.debugLine="ul.Initialize(preid, \"pre\").AddClass(\"code-line\")";
_ul._initialize /*b4j.example.vuehtml*/ (ba,_preid,"pre")._addclass /*b4j.example.vuehtml*/ ("code-line");
 //BA.debugLineNum = 3007;BA.debugLine="Return ul";
if (true) return _ul;
 //BA.debugLineNum = 3008;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createprogressbar(String _pbid) throws Exception{
b4j.example.vuehtml _pb = null;
 //BA.debugLineNum = 2941;BA.debugLine="Sub CreateProgressBar(pbid As String) As VueHTML";
 //BA.debugLineNum = 2942;BA.debugLine="Dim pb As VueHTML";
_pb = new b4j.example.vuehtml();
 //BA.debugLineNum = 2943;BA.debugLine="pb.Initialize(pbid, \"progress\")";
_pb._initialize /*b4j.example.vuehtml*/ (ba,_pbid,"progress");
 //BA.debugLineNum = 2944;BA.debugLine="Return pb";
if (true) return _pb;
 //BA.debugLineNum = 2945;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createsection(String _sid) throws Exception{
b4j.example.vuehtml _s = null;
 //BA.debugLineNum = 2977;BA.debugLine="Sub CreateSection(sid As String) As VueHTML";
 //BA.debugLineNum = 2978;BA.debugLine="Dim s As VueHTML = CreateDIV(sid)";
_s = _creatediv(_sid);
 //BA.debugLineNum = 2979;BA.debugLine="s.AddClass(\"section\")";
_s._addclass /*b4j.example.vuehtml*/ ("section");
 //BA.debugLineNum = 2980;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 2981;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createselect(String _oid) throws Exception{
b4j.example.vuehtml _o = null;
 //BA.debugLineNum = 3397;BA.debugLine="Sub CreateSelect(oid As String) As VueHTML";
 //BA.debugLineNum = 3398;BA.debugLine="Dim o As VueHTML";
_o = new b4j.example.vuehtml();
 //BA.debugLineNum = 3399;BA.debugLine="o.Initialize(oid, \"select\")";
_o._initialize /*b4j.example.vuehtml*/ (ba,_oid,"select");
 //BA.debugLineNum = 3400;BA.debugLine="Return o";
if (true) return _o;
 //BA.debugLineNum = 3401;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createselect1(String _tid,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
b4j.example.vuehtml _ta = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
String _optid = "";
String _optval = "";
b4j.example.vuehtml _thisoption = null;
 //BA.debugLineNum = 3411;BA.debugLine="Sub CreateSelect1(tid As String, options As List)";
 //BA.debugLineNum = 3412;BA.debugLine="Dim ta As VueHTML";
_ta = new b4j.example.vuehtml();
 //BA.debugLineNum = 3413;BA.debugLine="ta.Initialize(tid, \"select\")";
_ta._initialize /*b4j.example.vuehtml*/ (ba,_tid,"select");
 //BA.debugLineNum = 3414;BA.debugLine="For Each opt As Map In options";
_opt = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _options;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_opt = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 3415;BA.debugLine="Dim optid As String = opt.Get(\"id\")";
_optid = BA.ObjectToString(_opt.Get((Object)("id")));
 //BA.debugLineNum = 3416;BA.debugLine="Dim optval As String = opt.Get(\"value\")";
_optval = BA.ObjectToString(_opt.Get((Object)("value")));
 //BA.debugLineNum = 3417;BA.debugLine="Dim thisoption As VueHTML = CreateOption(\"\").Set";
_thisoption = _createoption("")._settext /*b4j.example.vuehtml*/ (_optval);
 //BA.debugLineNum = 3418;BA.debugLine="thisoption.SetParentID(tid).SetAttrVALUE(optid)";
_thisoption._setparentid /*b4j.example.vuehtml*/ (_tid)._setattrvalue /*b4j.example.vuehtml*/ (_optid);
 //BA.debugLineNum = 3419;BA.debugLine="ta.AddElement(thisoption)";
_ta._addelement /*b4j.example.vuehtml*/ (_thisoption);
 }
};
 //BA.debugLineNum = 3421;BA.debugLine="Return ta";
if (true) return _ta;
 //BA.debugLineNum = 3422;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createsmall(String _sid) throws Exception{
b4j.example.vuehtml _s = null;
 //BA.debugLineNum = 3192;BA.debugLine="Sub CreateSmall(sid As String) As VueHTML";
 //BA.debugLineNum = 3193;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
 //BA.debugLineNum = 3194;BA.debugLine="s.Initialize(sid,\"small\")";
_s._initialize /*b4j.example.vuehtml*/ (ba,_sid,"small");
 //BA.debugLineNum = 3195;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 3196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createsource(String _cid) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 3299;BA.debugLine="Sub CreateSOURCE(cid As String) As VueHTML";
 //BA.debugLineNum = 3300;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
 //BA.debugLineNum = 3301;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 3302;BA.debugLine="div.Initialize(cid, \"source\")";
_div._initialize /*b4j.example.vuehtml*/ (ba,_cid,"source");
 //BA.debugLineNum = 3303;BA.debugLine="Return div";
if (true) return _div;
 //BA.debugLineNum = 3304;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createspan(String _sid) throws Exception{
b4j.example.vuehtml _s = null;
 //BA.debugLineNum = 3199;BA.debugLine="Sub CreateSpan(sid As String) As VueHTML";
 //BA.debugLineNum = 3200;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
 //BA.debugLineNum = 3201;BA.debugLine="s.Initialize(sid,\"span\")";
_s._initialize /*b4j.example.vuehtml*/ (ba,_sid,"span");
 //BA.debugLineNum = 3202;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 3203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createstrong(String _sid) throws Exception{
b4j.example.vuehtml _s = null;
 //BA.debugLineNum = 3177;BA.debugLine="Sub CreateStrong(sid As String) As VueHTML";
 //BA.debugLineNum = 3178;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
 //BA.debugLineNum = 3179;BA.debugLine="s.Initialize(sid, \"strong\")";
_s._initialize /*b4j.example.vuehtml*/ (ba,_sid,"strong");
 //BA.debugLineNum = 3180;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 3181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createsub(String _sid) throws Exception{
b4j.example.vuehtml _s = null;
 //BA.debugLineNum = 3171;BA.debugLine="Sub CreateSub(sid As String) As VueHTML";
 //BA.debugLineNum = 3172;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
 //BA.debugLineNum = 3173;BA.debugLine="s.Initialize(sid, \"sub\")";
_s._initialize /*b4j.example.vuehtml*/ (ba,_sid,"sub");
 //BA.debugLineNum = 3174;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 3175;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createtable(String _cid) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 3290;BA.debugLine="Sub CreateTABLE(cid As String) As VueHTML";
 //BA.debugLineNum = 3291;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
 //BA.debugLineNum = 3292;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 3293;BA.debugLine="div.Initialize(cid, \"table\")";
_div._initialize /*b4j.example.vuehtml*/ (ba,_cid,"table");
 //BA.debugLineNum = 3294;BA.debugLine="Return div";
if (true) return _div;
 //BA.debugLineNum = 3295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createtbody(String _cid) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 3323;BA.debugLine="Sub CreateTBODY(cid As String) As VueHTML";
 //BA.debugLineNum = 3324;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
 //BA.debugLineNum = 3325;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 3326;BA.debugLine="div.Initialize(cid, \"tbody\")";
_div._initialize /*b4j.example.vuehtml*/ (ba,_cid,"tbody");
 //BA.debugLineNum = 3327;BA.debugLine="Return div";
if (true) return _div;
 //BA.debugLineNum = 3328;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createtd(String _cid) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 3340;BA.debugLine="Sub CreateTD(cid As String) As VueHTML";
 //BA.debugLineNum = 3341;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
 //BA.debugLineNum = 3342;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 3343;BA.debugLine="div.Initialize(cid, \"td\")";
_div._initialize /*b4j.example.vuehtml*/ (ba,_cid,"td");
 //BA.debugLineNum = 3344;BA.debugLine="Return div";
if (true) return _div;
 //BA.debugLineNum = 3345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createtextarea(String _tid) throws Exception{
b4j.example.vuehtml _ta = null;
 //BA.debugLineNum = 3374;BA.debugLine="Sub CreateTextArea(tid As String) As VueHTML";
 //BA.debugLineNum = 3375;BA.debugLine="Dim ta As VueHTML";
_ta = new b4j.example.vuehtml();
 //BA.debugLineNum = 3376;BA.debugLine="ta.Initialize(tid, \"textarea\")";
_ta._initialize /*b4j.example.vuehtml*/ (ba,_tid,"textarea");
 //BA.debugLineNum = 3377;BA.debugLine="Return ta";
if (true) return _ta;
 //BA.debugLineNum = 3378;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createthead(String _cid) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 3315;BA.debugLine="Sub CreateTHEAD(cid As String) As VueHTML";
 //BA.debugLineNum = 3316;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
 //BA.debugLineNum = 3317;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 3318;BA.debugLine="div.Initialize(cid, \"thead\")";
_div._initialize /*b4j.example.vuehtml*/ (ba,_cid,"thead");
 //BA.debugLineNum = 3319;BA.debugLine="Return div";
if (true) return _div;
 //BA.debugLineNum = 3320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createtime(String _preid) throws Exception{
b4j.example.vuehtml _ul = null;
 //BA.debugLineNum = 3017;BA.debugLine="Sub CreateTIME(preid As String) As VueHTML";
 //BA.debugLineNum = 3018;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
 //BA.debugLineNum = 3019;BA.debugLine="ul.Initialize(preid, \"time\")";
_ul._initialize /*b4j.example.vuehtml*/ (ba,_preid,"time");
 //BA.debugLineNum = 3020;BA.debugLine="Return ul";
if (true) return _ul;
 //BA.debugLineNum = 3021;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createtr(String _cid) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 3308;BA.debugLine="Sub CreateTR(cid As String) As VueHTML";
 //BA.debugLineNum = 3309;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
 //BA.debugLineNum = 3310;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 3311;BA.debugLine="div.Initialize(cid, \"tr\")";
_div._initialize /*b4j.example.vuehtml*/ (ba,_cid,"tr");
 //BA.debugLineNum = 3312;BA.debugLine="Return div";
if (true) return _div;
 //BA.debugLineNum = 3313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createul(String _preid) throws Exception{
b4j.example.vuehtml _ul = null;
 //BA.debugLineNum = 3048;BA.debugLine="Sub CreateUL(preid As String) As VueHTML";
 //BA.debugLineNum = 3049;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
 //BA.debugLineNum = 3050;BA.debugLine="ul.Initialize(preid, \"ul\")";
_ul._initialize /*b4j.example.vuehtml*/ (ba,_preid,"ul");
 //BA.debugLineNum = 3051;BA.debugLine="Return ul";
if (true) return _ul;
 //BA.debugLineNum = 3052;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createul1(String _ulid,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
b4j.example.vuehtml _ul = null;
anywheresoftware.b4a.objects.collections.Map _opt = null;
String _optid = "";
String _optval = "";
b4j.example.vuehtml _thisoption = null;
 //BA.debugLineNum = 3073;BA.debugLine="Sub CreateUL1(ulid As String, items As List) As Vu";
 //BA.debugLineNum = 3074;BA.debugLine="Dim ul As VueHTML";
_ul = new b4j.example.vuehtml();
 //BA.debugLineNum = 3075;BA.debugLine="ul.Initialize(ulid, \"ul\")";
_ul._initialize /*b4j.example.vuehtml*/ (ba,_ulid,"ul");
 //BA.debugLineNum = 3076;BA.debugLine="For Each opt As Map In items";
_opt = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _items;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_opt = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 3077;BA.debugLine="Dim optid As String = opt.Get(\"id\")";
_optid = BA.ObjectToString(_opt.Get((Object)("id")));
 //BA.debugLineNum = 3078;BA.debugLine="Dim optval As String = opt.Get(\"value\")";
_optval = BA.ObjectToString(_opt.Get((Object)("value")));
 //BA.debugLineNum = 3079;BA.debugLine="optid = CStr(optid)";
_optid = _cstr((Object)(_optid));
 //BA.debugLineNum = 3080;BA.debugLine="optval = CStr(optval)";
_optval = _cstr((Object)(_optval));
 //BA.debugLineNum = 3081;BA.debugLine="Dim thisoption As VueHTML = CreateLI(optid)";
_thisoption = _createli(_optid);
 //BA.debugLineNum = 3082;BA.debugLine="thisoption.SetText(optval)";
_thisoption._settext /*b4j.example.vuehtml*/ (_optval);
 //BA.debugLineNum = 3083;BA.debugLine="ul.AddElement(thisoption)";
_ul._addelement /*b4j.example.vuehtml*/ (_thisoption);
 }
};
 //BA.debugLineNum = 3085;BA.debugLine="Return ul";
if (true) return _ul;
 //BA.debugLineNum = 3086;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createvideo(String _cid) throws Exception{
b4j.example.vuehtml _div = null;
 //BA.debugLineNum = 3282;BA.debugLine="Sub CreateVIDEO(cid As String) As VueHTML";
 //BA.debugLineNum = 3283;BA.debugLine="cid = cid.tolowercase";
_cid = _cid.toLowerCase();
 //BA.debugLineNum = 3284;BA.debugLine="Dim div As VueHTML";
_div = new b4j.example.vuehtml();
 //BA.debugLineNum = 3285;BA.debugLine="div.Initialize(cid,\"video\")";
_div._initialize /*b4j.example.vuehtml*/ (ba,_cid,"video");
 //BA.debugLineNum = 3286;BA.debugLine="Return div";
if (true) return _div;
 //BA.debugLineNum = 3287;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 2118;BA.debugLine="private Sub CStr(o As Object) As String";
 //BA.debugLineNum = 2119;BA.debugLine="If o = BANano.UNDEFINED Then o = \"\"";
if ((_o).equals(_banano.UNDEFINED())) { 
_o = (Object)("");};
 //BA.debugLineNum = 2120;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 2121;BA.debugLine="End Sub";
return "";
}
public String  _formattext(String _stext) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rm = null;
int _ktot = 0;
int _kcnt = 0;
String _strvalue = "";
String _strrep = "";
 //BA.debugLineNum = 2462;BA.debugLine="private Sub FormatText(sText As String) As String";
 //BA.debugLineNum = 2463;BA.debugLine="Dim RM As Map";
_rm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2464;BA.debugLine="RM.Initialize";
_rm.Initialize();
 //BA.debugLineNum = 2465;BA.debugLine="RM.clear";
_rm.Clear();
 //BA.debugLineNum = 2466;BA.debugLine="RM.Put(\"{U}\", \"<ins>\")";
_rm.Put((Object)("{U}"),(Object)("<ins>"));
 //BA.debugLineNum = 2467;BA.debugLine="RM.Put(\"{/U}\", \"</ins>\")";
_rm.Put((Object)("{/U}"),(Object)("</ins>"));
 //BA.debugLineNum = 2468;BA.debugLine="RM.Put(\"¢\",\"&cent;\")";
_rm.Put((Object)("¢"),(Object)("&cent;"));
 //BA.debugLineNum = 2469;BA.debugLine="RM.put(\"£\",\"&pound;\")";
_rm.Put((Object)("£"),(Object)("&pound;"));
 //BA.debugLineNum = 2470;BA.debugLine="RM.Put(\"{SUP}\", \"<sup>\")";
_rm.Put((Object)("{SUP}"),(Object)("<sup>"));
 //BA.debugLineNum = 2471;BA.debugLine="RM.Put(\"{/SUP}\", \"</sup>\")";
_rm.Put((Object)("{/SUP}"),(Object)("</sup>"));
 //BA.debugLineNum = 2472;BA.debugLine="RM.Put(\"¥\",\"&yen;\")";
_rm.Put((Object)("¥"),(Object)("&yen;"));
 //BA.debugLineNum = 2473;BA.debugLine="RM.Put(\"€\",\"&euro;\")";
_rm.Put((Object)("€"),(Object)("&euro;"));
 //BA.debugLineNum = 2474;BA.debugLine="RM.put(\"©\",\"&copy;\")";
_rm.Put((Object)("©"),(Object)("&copy;"));
 //BA.debugLineNum = 2475;BA.debugLine="RM.Put(\"®\",\"&reg;\")";
_rm.Put((Object)("®"),(Object)("&reg;"));
 //BA.debugLineNum = 2476;BA.debugLine="RM.Put(\"{POUND}\",\"&pound;\")";
_rm.Put((Object)("{POUND}"),(Object)("&pound;"));
 //BA.debugLineNum = 2477;BA.debugLine="RM.Put(\"{/B}\", \"</b>\")";
_rm.Put((Object)("{/B}"),(Object)("</b>"));
 //BA.debugLineNum = 2478;BA.debugLine="RM.Put(\"{I}\", \"<i>\")";
_rm.Put((Object)("{I}"),(Object)("<i>"));
 //BA.debugLineNum = 2479;BA.debugLine="RM.Put(\"{YEN}\",\"&yen;\")";
_rm.Put((Object)("{YEN}"),(Object)("&yen;"));
 //BA.debugLineNum = 2480;BA.debugLine="RM.Put(\"{EURO}\",\"&euro;\")";
_rm.Put((Object)("{EURO}"),(Object)("&euro;"));
 //BA.debugLineNum = 2481;BA.debugLine="RM.Put(\"{CODE}\",\"<code>\")";
_rm.Put((Object)("{CODE}"),(Object)("<code>"));
 //BA.debugLineNum = 2482;BA.debugLine="RM.Put(\"{/CODE}\",\"</code>\")";
_rm.Put((Object)("{/CODE}"),(Object)("</code>"));
 //BA.debugLineNum = 2483;BA.debugLine="RM.put(\"{COPYRIGHT}\",\"&copy;\")";
_rm.Put((Object)("{COPYRIGHT}"),(Object)("&copy;"));
 //BA.debugLineNum = 2484;BA.debugLine="RM.Put(\"{REGISTERED}\",\"&reg;\")";
_rm.Put((Object)("{REGISTERED}"),(Object)("&reg;"));
 //BA.debugLineNum = 2485;BA.debugLine="RM.Put(\"®\", \"&reg;\")";
_rm.Put((Object)("®"),(Object)("&reg;"));
 //BA.debugLineNum = 2486;BA.debugLine="RM.Put(\"{B}\", \"<b>\")";
_rm.Put((Object)("{B}"),(Object)("<b>"));
 //BA.debugLineNum = 2487;BA.debugLine="RM.Put(\"{SMALL}\", \"<small>\")";
_rm.Put((Object)("{SMALL}"),(Object)("<small>"));
 //BA.debugLineNum = 2488;BA.debugLine="RM.Put(\"{/SMALL}\", \"</small>\")";
_rm.Put((Object)("{/SMALL}"),(Object)("</small>"));
 //BA.debugLineNum = 2489;BA.debugLine="RM.Put(\"{EM}\", \"<em>\")";
_rm.Put((Object)("{EM}"),(Object)("<em>"));
 //BA.debugLineNum = 2490;BA.debugLine="RM.Put(\"{/EM}\", \"</em>\")";
_rm.Put((Object)("{/EM}"),(Object)("</em>"));
 //BA.debugLineNum = 2491;BA.debugLine="RM.Put(\"{MARK}\", \"<mark>\")";
_rm.Put((Object)("{MARK}"),(Object)("<mark>"));
 //BA.debugLineNum = 2492;BA.debugLine="RM.Put(\"{/MARK}\", \"</mark>\")";
_rm.Put((Object)("{/MARK}"),(Object)("</mark>"));
 //BA.debugLineNum = 2493;BA.debugLine="RM.Put(\"{/I}\", \"</i>\")";
_rm.Put((Object)("{/I}"),(Object)("</i>"));
 //BA.debugLineNum = 2494;BA.debugLine="RM.Put(\"{SUB}\", \"<sub>\")";
_rm.Put((Object)("{SUB}"),(Object)("<sub>"));
 //BA.debugLineNum = 2495;BA.debugLine="RM.Put(\"{/SUB}\", \"</sub>\")";
_rm.Put((Object)("{/SUB}"),(Object)("</sub>"));
 //BA.debugLineNum = 2496;BA.debugLine="RM.Put(\"{BR}\", \"<br/>\")";
_rm.Put((Object)("{BR}"),(Object)("<br/>"));
 //BA.debugLineNum = 2497;BA.debugLine="RM.Put(\"{WBR}\",\"<wbr>\")";
_rm.Put((Object)("{WBR}"),(Object)("<wbr>"));
 //BA.debugLineNum = 2498;BA.debugLine="RM.Put(\"{STRONG}\", \"<strong>\")";
_rm.Put((Object)("{STRONG}"),(Object)("<strong>"));
 //BA.debugLineNum = 2499;BA.debugLine="RM.Put(\"{/STRONG}\", \"</strong>\")";
_rm.Put((Object)("{/STRONG}"),(Object)("</strong>"));
 //BA.debugLineNum = 2500;BA.debugLine="RM.Put(\"{NBSP}\", \"&nbsp;\")";
_rm.Put((Object)("{NBSP}"),(Object)("&nbsp;"));
 //BA.debugLineNum = 2501;BA.debugLine="RM.Put(\"“\",\"\")";
_rm.Put((Object)("“"),(Object)(""));
 //BA.debugLineNum = 2502;BA.debugLine="RM.Put(\"”\",\"\")";
_rm.Put((Object)("”"),(Object)(""));
 //BA.debugLineNum = 2503;BA.debugLine="RM.Put(\"’\",\"'\")";
_rm.Put((Object)("’"),(Object)("'"));
 //BA.debugLineNum = 2504;BA.debugLine="Dim kTot As Int = RM.Size - 1";
_ktot = (int) (_rm.getSize()-1);
 //BA.debugLineNum = 2505;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 2506;BA.debugLine="For kCnt = 0 To kTot";
{
final int step44 = 1;
final int limit44 = _ktot;
_kcnt = (int) (0) ;
for (;_kcnt <= limit44 ;_kcnt = _kcnt + step44 ) {
 //BA.debugLineNum = 2507;BA.debugLine="Dim strValue As String = RM.GetKeyAt(kCnt)";
_strvalue = BA.ObjectToString(_rm.GetKeyAt(_kcnt));
 //BA.debugLineNum = 2508;BA.debugLine="Dim strRep As String = RM.Get(strValue)";
_strrep = BA.ObjectToString(_rm.Get((Object)(_strvalue)));
 //BA.debugLineNum = 2509;BA.debugLine="sText = sText.Replace(strValue, strRep)";
_stext = _stext.replace(_strvalue,_strrep);
 }
};
 //BA.debugLineNum = 2511;BA.debugLine="sText = BANano.SF(sText)";
_stext = _banano.SF(_stext);
 //BA.debugLineNum = 2512;BA.debugLine="Return sText";
if (true) return _stext;
 //BA.debugLineNum = 2513;BA.debugLine="End Sub";
return "";
}
public Object  _getattr(String _attr) throws Exception{
 //BA.debugLineNum = 1848;BA.debugLine="Sub GetAttr(attr As String) As Object";
 //BA.debugLineNum = 1849;BA.debugLine="attr = attr.tolowercase";
_attr = _attr.toLowerCase();
 //BA.debugLineNum = 1850;BA.debugLine="If properties.ContainsKey(attr) Then";
if (_properties.ContainsKey((Object)(_attr))) { 
 //BA.debugLineNum = 1851;BA.debugLine="Return properties.Get(attr)";
if (true) return _properties.Get((Object)(_attr));
 }else {
 //BA.debugLineNum = 1853;BA.debugLine="Return \"\"";
if (true) return (Object)("");
 };
 //BA.debugLineNum = 1855;BA.debugLine="End Sub";
return null;
}
public String  _getcomponentbuilder() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _sout = "";
 //BA.debugLineNum = 2066;BA.debugLine="private Sub GetComponentBuilder() As String";
 //BA.debugLineNum = 2067;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2068;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2069;BA.debugLine="If Prefix.Length > 0 Then";
if (_prefix.length()>0) { 
 //BA.debugLineNum = 2070;BA.debugLine="sb.Append(Prefix)";
_sb.Append(_prefix);
 };
 //BA.debugLineNum = 2072;BA.debugLine="sb.Append(\"<\")";
_sb.Append("<");
 //BA.debugLineNum = 2073;BA.debugLine="sb.Append(Tag)";
_sb.Append(_tag);
 //BA.debugLineNum = 2074;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 2075;BA.debugLine="If ID.Length > 0 Then";
if (_id.length()>0) { 
 //BA.debugLineNum = 2076;BA.debugLine="sb.Append(ToProperty(\"id\",ID))";
_sb.Append(_toproperty("id",(Object)(_id)));
 };
 //BA.debugLineNum = 2078;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 //BA.debugLineNum = 2079;BA.debugLine="Select Case Tag.ToLowerCase";
switch (BA.switchObjectToInt(_tag.toLowerCase(),"img","link","meta","input","source")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
 //BA.debugLineNum = 2081;BA.debugLine="DoAProperClose = False";
_doaproperclose = __c.False;
 break; }
}
;
 //BA.debugLineNum = 2083;BA.debugLine="If DoAProperClose = True Then";
if (_doaproperclose==__c.True) { 
 //BA.debugLineNum = 2084;BA.debugLine="sb.Append(\"</\")";
_sb.Append("</");
 //BA.debugLineNum = 2085;BA.debugLine="sb.Append(Tag)";
_sb.Append(_tag);
 //BA.debugLineNum = 2086;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 };
 //BA.debugLineNum = 2088;BA.debugLine="Dim sout As String = sb.tostring";
_sout = _sb.ToString();
 //BA.debugLineNum = 2089;BA.debugLine="sout = sout.Trim";
_sout = _sout.trim();
 //BA.debugLineNum = 2090;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 2091;BA.debugLine="End Sub";
return "";
}
public String  _getcssstyle(String _stylename) throws Exception{
 //BA.debugLineNum = 587;BA.debugLine="Sub GetCssStyle(styleName As String) As String";
 //BA.debugLineNum = 588;BA.debugLine="Return CSSRule.Get(styleName)";
if (true) return BA.ObjectToString(_cssrule.Get((Object)(_stylename)));
 //BA.debugLineNum = 589;BA.debugLine="End Sub";
return "";
}
public String  _getkeys(String _delim,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strkey = "";
String _sout = "";
 //BA.debugLineNum = 2387;BA.debugLine="Sub GetKeys(Delim As String, m As Map) As String";
 //BA.debugLineNum = 2388;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2389;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2390;BA.debugLine="For Each strKey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 2391;BA.debugLine="sb.Append(strKey).Append(Delim)";
_sb.Append(_strkey).Append(_delim);
 }
};
 //BA.debugLineNum = 2393;BA.debugLine="Dim sout As String = sb.ToString";
_sout = _sb.ToString();
 //BA.debugLineNum = 2394;BA.debugLine="sout = RemDelim(sout,Delim)";
_sout = _remdelim(_sout,_delim);
 //BA.debugLineNum = 2395;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 2396;BA.debugLine="End Sub";
return "";
}
public String  _getstyleattr(String _attr) throws Exception{
boolean _hasitem = false;
 //BA.debugLineNum = 1509;BA.debugLine="Sub GetStyleAttr(attr As String) As String";
 //BA.debugLineNum = 1510;BA.debugLine="attr = attr.ToLowerCase";
_attr = _attr.toLowerCase();
 //BA.debugLineNum = 1511;BA.debugLine="attr = RemDelim(attr,\":\")";
_attr = _remdelim(_attr,":");
 //BA.debugLineNum = 1512;BA.debugLine="attr = attr.trim";
_attr = _attr.trim();
 //BA.debugLineNum = 1513;BA.debugLine="Dim hasItem As Boolean = Styles.ContainsKey(attr)";
_hasitem = _styles.ContainsKey((Object)(_attr));
 //BA.debugLineNum = 1514;BA.debugLine="If hasItem Then";
if (_hasitem) { 
 //BA.debugLineNum = 1515;BA.debugLine="Return Styles.Get(attr)";
if (true) return BA.ObjectToString(_styles.Get((Object)(_attr)));
 }else {
 //BA.debugLineNum = 1517;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 1519;BA.debugLine="End Sub";
return "";
}
public String  _getvalues(String _delim,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strkey = "";
String _sout = "";
 //BA.debugLineNum = 2399;BA.debugLine="Sub GetValues(Delim As String, m As Map) As String";
 //BA.debugLineNum = 2400;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2401;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2402;BA.debugLine="For Each strKey As String In m.values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_strkey = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 2403;BA.debugLine="sb.Append(strKey).Append(Delim)";
_sb.Append(_strkey).Append(_delim);
 }
};
 //BA.debugLineNum = 2405;BA.debugLine="Dim sout As String = sb.ToString";
_sout = _sb.ToString();
 //BA.debugLineNum = 2406;BA.debugLine="sout = RemDelim(sout,Delim)";
_sout = _remdelim(_sout,_delim);
 //BA.debugLineNum = 2407;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 2408;BA.debugLine="End Sub";
return "";
}
public String  _html() throws Exception{
String _sout = "";
 //BA.debugLineNum = 1868;BA.debugLine="public Sub HTML As String";
 //BA.debugLineNum = 1869;BA.debugLine="Dim sOut As String = ToString";
_sout = _tostring();
 //BA.debugLineNum = 1870;BA.debugLine="Return sOut";
if (true) return _sout;
 //BA.debugLineNum = 1871;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _initialize(anywheresoftware.b4a.BA _ba,String _elid,String _stag) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 43;BA.debugLine="Public Sub Initialize(elID As String, stag As Stri";
 //BA.debugLineNum = 44;BA.debugLine="ds = \"\"";
_ds = "";
 //BA.debugLineNum = 45;BA.debugLine="classList.Initialize";
_classlist.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="styleList.Initialize";
_stylelist.Initialize();
 //BA.debugLineNum = 47;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 48;BA.debugLine="hasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 49;BA.debugLine="ParentID = \"\"";
_parentid = "";
 //BA.debugLineNum = 50;BA.debugLine="ID = elID.tolowercase";
_id = _elid.toLowerCase();
 //BA.debugLineNum = 51;BA.debugLine="If IsValidID(ID) = False Then";
if (_isvalidid(_id)==__c.False) { 
 //BA.debugLineNum = 52;BA.debugLine="Log($\"Your component ID '${ID}' should contain a";
__c.Log(("Your component ID '"+__c.SmartStringFormatter("",(Object)(_id))+"' should contain alphanumeric ONLY!"));
 };
 //BA.debugLineNum = 55;BA.debugLine="typeOf = \"text\"";
_typeof = "text";
 //BA.debugLineNum = 56;BA.debugLine="fieldType = \"string\"";
_fieldtype = "string";
 //BA.debugLineNum = 57;BA.debugLine="InputType = \"text\"";
_inputtype = "text";
 //BA.debugLineNum = 58;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 59;BA.debugLine="value = Null";
_value = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 60;BA.debugLine="IsImportant = False";
_isimportant = __c.False;
 //BA.debugLineNum = 61;BA.debugLine="SBBefore.Initialize";
_sbbefore.Initialize();
 //BA.debugLineNum = 62;BA.debugLine="SBAfter.Initialize";
_sbafter.Initialize();
 //BA.debugLineNum = 63;BA.debugLine="properties.Initialize";
_properties.Initialize();
 //BA.debugLineNum = 64;BA.debugLine="properties.clear";
_properties.Clear();
 //BA.debugLineNum = 65;BA.debugLine="Contents.Initialize";
_contents.Initialize();
 //BA.debugLineNum = 66;BA.debugLine="Contents.clear";
_contents.Clear();
 //BA.debugLineNum = 67;BA.debugLine="Styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 68;BA.debugLine="Styles.clear";
_styles.Clear();
 //BA.debugLineNum = 69;BA.debugLine="Classes.Initialize";
_classes.Initialize();
 //BA.debugLineNum = 70;BA.debugLine="Classes.clear";
_classes.Clear();
 //BA.debugLineNum = 71;BA.debugLine="LooseAttributes.Initialize";
_looseattributes.Initialize();
 //BA.debugLineNum = 72;BA.debugLine="LooseAttributes.clear";
_looseattributes.Clear();
 //BA.debugLineNum = 73;BA.debugLine="DontBreak.Initialize";
_dontbreak.Initialize();
 //BA.debugLineNum = 74;BA.debugLine="DontBreak.clear";
_dontbreak.Clear();
 //BA.debugLineNum = 75;BA.debugLine="DontBreak.Add(\"li\")";
_dontbreak.Add((Object)("li"));
 //BA.debugLineNum = 76;BA.debugLine="DontBreak.Add(\"a\")";
_dontbreak.Add((Object)("a"));
 //BA.debugLineNum = 77;BA.debugLine="DontBreak.Add(\"i\")";
_dontbreak.Add((Object)("i"));
 //BA.debugLineNum = 78;BA.debugLine="DontBreak.Add(\"span\")";
_dontbreak.Add((Object)("span"));
 //BA.debugLineNum = 79;BA.debugLine="DontBreak.Add(\"img\")";
_dontbreak.Add((Object)("img"));
 //BA.debugLineNum = 80;BA.debugLine="Tag = stag.tolowercase";
_tag = _stag.toLowerCase();
 //BA.debugLineNum = 81;BA.debugLine="Prefix = \"\"";
_prefix = "";
 //BA.debugLineNum = 82;BA.debugLine="DoAProperClose = True";
_doaproperclose = __c.True;
 //BA.debugLineNum = 83;BA.debugLine="CSSRule.Initialize";
_cssrule.Initialize();
 //BA.debugLineNum = 84;BA.debugLine="CSSRule.clear";
_cssrule.Clear();
 //BA.debugLineNum = 85;BA.debugLine="SingleQuote.Initialize";
_singlequote.Initialize();
 //BA.debugLineNum = 86;BA.debugLine="SingleQuote.clear";
_singlequote.Clear();
 //BA.debugLineNum = 87;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 88;BA.debugLine="ErrorMessage = \"\"";
_errormessage = "";
 //BA.debugLineNum = 90;BA.debugLine="showKey = $\"${ID}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"show");
 //BA.debugLineNum = 91;BA.debugLine="disKey = $\"${ID}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_id))+"disabled");
 //BA.debugLineNum = 92;BA.debugLine="reqKey = $\"${ID}required\"$";
_reqkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"required");
 //BA.debugLineNum = 93;BA.debugLine="errKey = $\"${ID}error\"$";
_errkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"error");
 //BA.debugLineNum = 94;BA.debugLine="styleKey = $\"${ID}style\"$";
_stylekey = (""+__c.SmartStringFormatter("",(Object)(_id))+"style");
 //BA.debugLineNum = 95;BA.debugLine="classKey = $\"${ID}class\"$";
_classkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"class");
 //BA.debugLineNum = 96;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public boolean  _isvalidid(String _idname) throws Exception{
int _slen = 0;
int _i = 0;
String _mout = "";
 //BA.debugLineNum = 560;BA.debugLine="Sub IsValidID(idName As String) As Boolean";
 //BA.debugLineNum = 561;BA.debugLine="If idName = \"\" Then Return True";
if ((_idname).equals("")) { 
if (true) return __c.True;};
 //BA.debugLineNum = 562;BA.debugLine="Dim slen As Int = idName.Length";
_slen = _idname.length();
 //BA.debugLineNum = 563;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 564;BA.debugLine="For i = 0 To slen - 1";
{
final int step4 = 1;
final int limit4 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 565;BA.debugLine="Dim mout As String = idName.CharAt(i)";
_mout = BA.ObjectToString(_idname.charAt(_i));
 //BA.debugLineNum = 566;BA.debugLine="If \"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQR";
if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(_mout)==-1) { 
 //BA.debugLineNum = 567;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 //BA.debugLineNum = 570;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 571;BA.debugLine="End Sub";
return false;
}
public String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 2651;BA.debugLine="public Sub Join(delimiter As String, lst As List)";
 //BA.debugLineNum = 2652;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 2653;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2654;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2655;BA.debugLine="sb.Append(lst.get(0))";
_sb.Append(BA.ObjectToString(_lst.Get((int) (0))));
 //BA.debugLineNum = 2656;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 2657;BA.debugLine="sb.Append(delimiter).Append(lst.get(i))";
_sb.Append(_delimiter).Append(BA.ObjectToString(_lst.Get(_i)));
 }
};
 //BA.debugLineNum = 2659;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 2660;BA.debugLine="End Sub";
return "";
}
public String  _makepx(String _svalue) throws Exception{
 //BA.debugLineNum = 1745;BA.debugLine="Sub MakePx(sValue As String) As String";
 //BA.debugLineNum = 1746;BA.debugLine="sValue = sValue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 1747;BA.debugLine="If sValue.EndsWith(\"%\") Then";
if (_svalue.endsWith("%")) { 
 //BA.debugLineNum = 1748;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vm")) { 
 //BA.debugLineNum = 1750;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("px")) { 
 //BA.debugLineNum = 1752;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("cm")) { 
 //BA.debugLineNum = 1754;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("mm")) { 
 //BA.debugLineNum = 1756;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("in")) { 
 //BA.debugLineNum = 1758;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pt")) { 
 //BA.debugLineNum = 1760;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pc")) { 
 //BA.debugLineNum = 1762;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("em")) { 
 //BA.debugLineNum = 1764;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ex")) { 
 //BA.debugLineNum = 1766;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ch")) { 
 //BA.debugLineNum = 1768;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("rem")) { 
 //BA.debugLineNum = 1770;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vw")) { 
 //BA.debugLineNum = 1772;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vh")) { 
 //BA.debugLineNum = 1774;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmin")) { 
 //BA.debugLineNum = 1776;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmax")) { 
 //BA.debugLineNum = 1778;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith(";")) { 
 //BA.debugLineNum = 1780;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else {
 //BA.debugLineNum = 1782;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
_svalue = _svalue.replace("px","");
 //BA.debugLineNum = 1783;BA.debugLine="sValue = $\"${sValue}px\"$";
_svalue = (""+__c.SmartStringFormatter("",(Object)(_svalue))+"px");
 //BA.debugLineNum = 1784;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
if ((_svalue).equals("px")) { 
_svalue = "";};
 //BA.debugLineNum = 1785;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 1787;BA.debugLine="End Sub";
return "";
}
public String  _midstring2(String _text,int _start) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub MidString2(Text As String, Start As Int) As St";
 //BA.debugLineNum = 109;BA.debugLine="Return Text.SubString(Start-1)";
if (true) return _text.substring((int) (_start-1));
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _moveup(String _stop) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub MoveUp(sTop As String) As VueHTML";
 //BA.debugLineNum = 102;BA.debugLine="SetAttrSingle(\"margin-top\", sTop)";
_setattrsingle("margin-top",_stop);
 //BA.debugLineNum = 103;BA.debugLine="SetStyleSingle(\"z-index\",\"9999\")";
_setstylesingle("z-index","9999");
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public String  _mvfield(String _svalue,int _iposition,String _delimiter) throws Exception{
int _xpos = 0;
anywheresoftware.b4a.objects.collections.List _mvalues = null;
int _tvalues = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
 //BA.debugLineNum = 808;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
 //BA.debugLineNum = 809;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 810;BA.debugLine="Dim xPos As Int = sValue.IndexOf(Delimiter)";
_xpos = _svalue.indexOf(_delimiter);
 //BA.debugLineNum = 811;BA.debugLine="If xPos = -1 Then Return sValue";
if (_xpos==-1) { 
if (true) return _svalue;};
 //BA.debugLineNum = 812;BA.debugLine="Dim mValues As List = StrParse(Delimiter,sValue)";
_mvalues = new anywheresoftware.b4a.objects.collections.List();
_mvalues = _strparse(_delimiter,_svalue);
 //BA.debugLineNum = 813;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
 //BA.debugLineNum = 814;BA.debugLine="tValues = mValues.size -1";
_tvalues = (int) (_mvalues.getSize()-1);
 //BA.debugLineNum = 815;BA.debugLine="Select Case iPosition";
switch (BA.switchObjectToInt(_iposition,(int) (-1),(int) (-2),(int) (-3))) {
case 0: {
 //BA.debugLineNum = 817;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 break; }
case 1: {
 //BA.debugLineNum = 819;BA.debugLine="Return mValues.get(tValues - 1)";
if (true) return BA.ObjectToString(_mvalues.Get((int) (_tvalues-1)));
 break; }
case 2: {
 //BA.debugLineNum = 821;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 822;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 823;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
 //BA.debugLineNum = 824;BA.debugLine="sb.Append(mValues.Get(1))";
_sb.Append(BA.ObjectToString(_mvalues.Get((int) (1))));
 //BA.debugLineNum = 825;BA.debugLine="For startcnt = 2 To tValues";
{
final int step17 = 1;
final int limit17 = _tvalues;
_startcnt = (int) (2) ;
for (;_startcnt <= limit17 ;_startcnt = _startcnt + step17 ) {
 //BA.debugLineNum = 826;BA.debugLine="sb.Append(Delimiter)";
_sb.Append(_delimiter);
 //BA.debugLineNum = 827;BA.debugLine="sb.Append(mValues.get(startcnt))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_startcnt)));
 }
};
 //BA.debugLineNum = 829;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 break; }
default: {
 //BA.debugLineNum = 831;BA.debugLine="iPosition = iPosition - 1";
_iposition = (int) (_iposition-1);
 //BA.debugLineNum = 832;BA.debugLine="If iPosition <= -1 Then";
if (_iposition<=-1) { 
 //BA.debugLineNum = 833;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 };
 //BA.debugLineNum = 835;BA.debugLine="If iPosition > tValues Then";
if (_iposition>_tvalues) { 
 //BA.debugLineNum = 836;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 838;BA.debugLine="Return mValues.get(iPosition)";
if (true) return BA.ObjectToString(_mvalues.Get(_iposition));
 break; }
}
;
 //BA.debugLineNum = 840;BA.debugLine="End Sub";
return "";
}
public String  _mvfieldfrom(String _svalue,int _iposition,String _delimiter) throws Exception{
anywheresoftware.b4a.objects.collections.List _mvalues = null;
int _tvalues = 0;
boolean _ew = false;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
 //BA.debugLineNum = 2248;BA.debugLine="public Sub MvFieldFrom(sValue As String, iPosition";
 //BA.debugLineNum = 2249;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 2250;BA.debugLine="Dim mValues As List";
_mvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2251;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
 //BA.debugLineNum = 2252;BA.debugLine="Dim ew As Boolean = sValue.EndsWith(Delimiter)";
_ew = _svalue.endsWith(_delimiter);
 //BA.debugLineNum = 2253;BA.debugLine="If ew Then";
if (_ew) { 
 //BA.debugLineNum = 2254;BA.debugLine="sValue = sValue & \" \"";
_svalue = _svalue+" ";
 };
 //BA.debugLineNum = 2256;BA.debugLine="mValues = StrParse(Delimiter, sValue)";
_mvalues = _strparse(_delimiter,_svalue);
 //BA.debugLineNum = 2257;BA.debugLine="tValues = mValues.size -1";
_tvalues = (int) (_mvalues.getSize()-1);
 //BA.debugLineNum = 2258;BA.debugLine="If tValues < iPosition Then";
if (_tvalues<_iposition) { 
 //BA.debugLineNum = 2259;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 };
 //BA.debugLineNum = 2261;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2262;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2263;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
 //BA.debugLineNum = 2264;BA.debugLine="sb.Append(mValues.get(iPosition))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_iposition)));
 //BA.debugLineNum = 2265;BA.debugLine="For startcnt = iPosition + 1 To tValues";
{
final int step17 = 1;
final int limit17 = _tvalues;
_startcnt = (int) (_iposition+1) ;
for (;_startcnt <= limit17 ;_startcnt = _startcnt + step17 ) {
 //BA.debugLineNum = 2266;BA.debugLine="sb.Append(Delimiter)";
_sb.Append(_delimiter);
 //BA.debugLineNum = 2267;BA.debugLine="sb.Append(mValues.get(startcnt))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_startcnt)));
 }
};
 //BA.debugLineNum = 2269;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 2270;BA.debugLine="End Sub";
return "";
}
public String  _open() throws Exception{
String _thisclass = "";
String _thisstyle = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _thisattr = "";
String _thoseloose = "";
 //BA.debugLineNum = 2345;BA.debugLine="private Sub Open() As String";
 //BA.debugLineNum = 2351;BA.debugLine="Dim thisClass As String = BuildClass";
_thisclass = _buildclass();
 //BA.debugLineNum = 2352;BA.debugLine="thisClass = thisClass.trim";
_thisclass = _thisclass.trim();
 //BA.debugLineNum = 2353;BA.debugLine="If thisClass.Length > 0 Then";
if (_thisclass.length()>0) { 
 //BA.debugLineNum = 2354;BA.debugLine="AddAttribute(\"class\", thisClass)";
_addattribute("class",_thisclass);
 };
 //BA.debugLineNum = 2357;BA.debugLine="Dim thisStyle As String = BuildStyle";
_thisstyle = _buildstyle();
 //BA.debugLineNum = 2358;BA.debugLine="thisStyle = thisStyle.trim";
_thisstyle = _thisstyle.trim();
 //BA.debugLineNum = 2359;BA.debugLine="If thisStyle.Length > 0 Then";
if (_thisstyle.length()>0) { 
 //BA.debugLineNum = 2360;BA.debugLine="AddAttribute(\"style\", thisStyle)";
_addattribute("style",_thisstyle);
 };
 //BA.debugLineNum = 2362;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2363;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2364;BA.debugLine="If Prefix.Length > 0 Then";
if (_prefix.length()>0) { 
 //BA.debugLineNum = 2365;BA.debugLine="sb.Append(Prefix)";
_sb.Append(_prefix);
 };
 //BA.debugLineNum = 2367;BA.debugLine="sb.Append(\"<\")";
_sb.Append("<");
 //BA.debugLineNum = 2368;BA.debugLine="sb.Append(Tag)";
_sb.Append(_tag);
 //BA.debugLineNum = 2369;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 2370;BA.debugLine="If ID.Length > 0 Then";
if (_id.length()>0) { 
 //BA.debugLineNum = 2371;BA.debugLine="sb.Append(ToProperty(\"id\",ID))";
_sb.Append(_toproperty("id",(Object)(_id)));
 //BA.debugLineNum = 2372;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 };
 //BA.debugLineNum = 2375;BA.debugLine="Dim thisAttr As String = BuildAttributes";
_thisattr = _buildattributes();
 //BA.debugLineNum = 2376;BA.debugLine="thisAttr = thisAttr.Trim";
_thisattr = _thisattr.trim();
 //BA.debugLineNum = 2377;BA.debugLine="If thisAttr.Length > 0 Then";
if (_thisattr.length()>0) { 
 //BA.debugLineNum = 2378;BA.debugLine="sb.Append(thisAttr)";
_sb.Append(_thisattr);
 };
 //BA.debugLineNum = 2380;BA.debugLine="Dim thoseLoose As String = GetKeys(\" \",LooseAttri";
_thoseloose = _getkeys(" ",_looseattributes);
 //BA.debugLineNum = 2381;BA.debugLine="sb.Append(\" \").Append(thoseLoose)";
_sb.Append(" ").Append(_thoseloose);
 //BA.debugLineNum = 2382;BA.debugLine="sb.Append(\">\")";
_sb.Append(">");
 //BA.debugLineNum = 2383;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 2384;BA.debugLine="End Sub";
return "";
}
public String  _pointer() throws Exception{
 //BA.debugLineNum = 1874;BA.debugLine="Sub Pointer As String";
 //BA.debugLineNum = 1875;BA.debugLine="Return \"cursor:pointer\"";
if (true) return "cursor:pointer";
 //BA.debugLineNum = 1876;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vuehtml _pelement) throws Exception{
 //BA.debugLineNum = 2011;BA.debugLine="Sub Pop(pElement As VueHTML)";
 //BA.debugLineNum = 2012;BA.debugLine="If hasContent Then SetText(ToString)";
if (_hascontent) { 
_settext(_tostring());};
 //BA.debugLineNum = 2013;BA.debugLine="End Sub";
return "";
}
public String  _poptoparent(String _sparentid) throws Exception{
String _sout = "";
com.ab.banano.BANanoElement _pel = null;
 //BA.debugLineNum = 3357;BA.debugLine="Sub PopToParent(sParentID As String)";
 //BA.debugLineNum = 3358;BA.debugLine="Dim sout As String = ToString";
_sout = _tostring();
 //BA.debugLineNum = 3359;BA.debugLine="sParentID = sParentID.tolowercase";
_sparentid = _sparentid.toLowerCase();
 //BA.debugLineNum = 3360;BA.debugLine="Dim pEL As BANanoElement";
_pel = new com.ab.banano.BANanoElement();
 //BA.debugLineNum = 3361;BA.debugLine="pEL = BANano.GetElement($\"#${sParentID}\"$)";
_pel = _banano.GetElement(("#"+__c.SmartStringFormatter("",(Object)(_sparentid))+""));
 //BA.debugLineNum = 3362;BA.debugLine="pEL.Append(sout)";
_pel.Append(_sout);
 //BA.debugLineNum = 3363;BA.debugLine="End Sub";
return "";
}
public String  _ramovefromlist(anywheresoftware.b4a.objects.collections.List _listx,String _item) throws Exception{
int _li = 0;
 //BA.debugLineNum = 850;BA.debugLine="Sub RamoveFromList(listX As List, item As String)";
 //BA.debugLineNum = 851;BA.debugLine="Dim li As Int = listX.IndexOf(item)";
_li = _listx.IndexOf((Object)(_item));
 //BA.debugLineNum = 852;BA.debugLine="If li >= 0 Then listX.RemoveAt(li)";
if (_li>=0) { 
_listx.RemoveAt(_li);};
 //BA.debugLineNum = 853;BA.debugLine="End Sub";
return "";
}
public Object  _randlistvalue(anywheresoftware.b4a.objects.collections.List _listx) throws Exception{
 //BA.debugLineNum = 844;BA.debugLine="Sub RandListValue(ListX As List) As Object";
 //BA.debugLineNum = 845;BA.debugLine="ShuffleList(ListX)";
_shufflelist(_listx);
 //BA.debugLineNum = 846;BA.debugLine="Return ListX.Get(Rnd(0, ListX.Size -1))";
if (true) return _listx.Get(__c.Rnd((int) (0),(int) (_listx.getSize()-1)));
 //BA.debugLineNum = 847;BA.debugLine="End Sub";
return null;
}
public String  _remdelim(String _svalue,String _delim) throws Exception{
boolean _sw = false;
int _ldelim = 0;
String _nvalue = "";
 //BA.debugLineNum = 2516;BA.debugLine="private Sub RemDelim(sValue As String, Delim As St";
 //BA.debugLineNum = 2517;BA.debugLine="Dim sw As Boolean = sValue.EndsWith(Delim)";
_sw = _svalue.endsWith(_delim);
 //BA.debugLineNum = 2518;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 2519;BA.debugLine="Dim lDelim As Int = Delim.Length";
_ldelim = _delim.length();
 //BA.debugLineNum = 2520;BA.debugLine="Dim nValue As String = sValue";
_nvalue = _svalue;
 //BA.debugLineNum = 2521;BA.debugLine="sw = nValue.EndsWith(Delim)";
_sw = _nvalue.endsWith(_delim);
 //BA.debugLineNum = 2522;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 2523;BA.debugLine="nValue = nValue.SubString2(0, nValue.Length-lDe";
_nvalue = _nvalue.substring((int) (0),(int) (_nvalue.length()-_ldelim));
 };
 //BA.debugLineNum = 2525;BA.debugLine="Return nValue";
if (true) return _nvalue;
 }else {
 //BA.debugLineNum = 2527;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 2529;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _removeattr(String _sname) throws Exception{
anywheresoftware.b4a.objects.collections.List _sitems = null;
String _strstyle = "";
 //BA.debugLineNum = 2036;BA.debugLine="public Sub RemoveAttr(sName As String) As VueHTML";
 //BA.debugLineNum = 2037;BA.debugLine="sName = sName.ToLowerCase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 2038;BA.debugLine="sName = sName.Replace(\" \",\";\")";
_sname = _sname.replace(" ",";");
 //BA.debugLineNum = 2039;BA.debugLine="Dim sItems As List = StrParse(\";\",sName)";
_sitems = new anywheresoftware.b4a.objects.collections.List();
_sitems = _strparse(";",_sname);
 //BA.debugLineNum = 2040;BA.debugLine="For Each strStyle As String In sItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sitems;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strstyle = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 2041;BA.debugLine="strStyle = strStyle.trim";
_strstyle = _strstyle.trim();
 //BA.debugLineNum = 2042;BA.debugLine="If properties.ContainsKey(strStyle) Then";
if (_properties.ContainsKey((Object)(_strstyle))) { 
 //BA.debugLineNum = 2043;BA.debugLine="properties.Remove(strStyle)";
_properties.Remove((Object)(_strstyle));
 };
 }
};
 //BA.debugLineNum = 2046;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2047;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeattrdata(String _sdata) throws Exception{
 //BA.debugLineNum = 2016;BA.debugLine="public Sub RemoveAttrData(sData As String) As VueH";
 //BA.debugLineNum = 2017;BA.debugLine="sData = $\"data-${sData}\"$";
_sdata = ("data-"+__c.SmartStringFormatter("",(Object)(_sdata))+"");
 //BA.debugLineNum = 2018;BA.debugLine="RemoveAttr(sData)";
_removeattr(_sdata);
 //BA.debugLineNum = 2019;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2020;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeattribute(String _prop) throws Exception{
 //BA.debugLineNum = 2030;BA.debugLine="Sub RemoveAttribute(prop As String) As VueHTML";
 //BA.debugLineNum = 2031;BA.debugLine="RemoveAttr(prop)";
_removeattr(_prop);
 //BA.debugLineNum = 2032;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2033;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeattributeoncondition(boolean _bcondition,String _prop) throws Exception{
 //BA.debugLineNum = 2022;BA.debugLine="Sub RemoveAttributeOnCondition(bCondition As Boole";
 //BA.debugLineNum = 2023;BA.debugLine="If bCondition Then";
if (_bcondition) { 
 //BA.debugLineNum = 2024;BA.debugLine="RemoveAttr(prop)";
_removeattr(_prop);
 };
 //BA.debugLineNum = 2026;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _s = "";
 //BA.debugLineNum = 151;BA.debugLine="Sub RemoveAttributes(attrs As List) As VueHTML";
 //BA.debugLineNum = 152;BA.debugLine="For Each s As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 153;BA.debugLine="RemoveAttr(s)";
_removeattr(_s);
 }
};
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeborder(boolean _b) throws Exception{
 //BA.debugLineNum = 700;BA.debugLine="Sub RemoveBorder(b As Boolean) As VueHTML";
 //BA.debugLineNum = 701;BA.debugLine="SetStyle(\"border\",\"none none double none\")";
_setstyle("border","none none double none");
 //BA.debugLineNum = 702;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 703;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeclass(String _classname) throws Exception{
anywheresoftware.b4a.objects.collections.List _sitems = null;
String _strstyle = "";
 //BA.debugLineNum = 2156;BA.debugLine="public Sub RemoveClass(className As String) As Vue";
 //BA.debugLineNum = 2157;BA.debugLine="className = className.Trim";
_classname = _classname.trim();
 //BA.debugLineNum = 2158;BA.debugLine="className = className.replace(\" \",\";\")";
_classname = _classname.replace(" ",";");
 //BA.debugLineNum = 2159;BA.debugLine="Dim sItems As List = StrParse(\";\",className)";
_sitems = new anywheresoftware.b4a.objects.collections.List();
_sitems = _strparse(";",_classname);
 //BA.debugLineNum = 2160;BA.debugLine="For Each strStyle As String In sItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sitems;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_strstyle = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 2161;BA.debugLine="strStyle = strStyle.Trim";
_strstyle = _strstyle.trim();
 //BA.debugLineNum = 2162;BA.debugLine="If Classes.ContainsKey(strStyle) Then";
if (_classes.ContainsKey((Object)(_strstyle))) { 
 //BA.debugLineNum = 2163;BA.debugLine="Classes.Remove(strStyle)";
_classes.Remove((Object)(_strstyle));
 };
 }
};
 //BA.debugLineNum = 2166;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeclassoncondition(boolean _bcondition,String _sclass) throws Exception{
 //BA.debugLineNum = 1909;BA.debugLine="Sub RemoveClassOnCondition(bCondition As Boolean,";
 //BA.debugLineNum = 1910;BA.debugLine="If bCondition Then";
if (_bcondition) { 
 //BA.debugLineNum = 1911;BA.debugLine="RemoveClass(sClass)";
_removeclass(_sclass);
 };
 //BA.debugLineNum = 1913;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1914;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removeclassonfalsecondition(boolean _bcondition,String _sclass) throws Exception{
 //BA.debugLineNum = 1917;BA.debugLine="Sub RemoveClassOnFalseCondition(bCondition As Bool";
 //BA.debugLineNum = 1918;BA.debugLine="If bCondition = False Then";
if (_bcondition==__c.False) { 
 //BA.debugLineNum = 1919;BA.debugLine="RemoveClass(sClass)";
_removeclass(_sclass);
 };
 //BA.debugLineNum = 1921;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1922;BA.debugLine="End Sub";
return null;
}
public String  _removecssrule(String _stylename,String _styleprop) throws Exception{
String _scontent = "";
anywheresoftware.b4a.objects.collections.List _spprops = null;
anywheresoftware.b4a.objects.collections.List _nlist = null;
String _strpropvalue = "";
String _strprop = "";
String _strvalue = "";
String _nline = "";
 //BA.debugLineNum = 653;BA.debugLine="Sub RemoveCssRule(styleName As String, styleProp A";
 //BA.debugLineNum = 654;BA.debugLine="Dim scontent As String";
_scontent = "";
 //BA.debugLineNum = 655;BA.debugLine="If CSSRule.ContainsKey(styleName) Then";
if (_cssrule.ContainsKey((Object)(_stylename))) { 
 //BA.debugLineNum = 656;BA.debugLine="scontent = CSSRule.Get(styleName)";
_scontent = BA.ObjectToString(_cssrule.Get((Object)(_stylename)));
 //BA.debugLineNum = 657;BA.debugLine="scontent = scontent.trim";
_scontent = _scontent.trim();
 //BA.debugLineNum = 658;BA.debugLine="Dim spProps As List = StrParse(\";\",scontent)";
_spprops = new anywheresoftware.b4a.objects.collections.List();
_spprops = _strparse(";",_scontent);
 //BA.debugLineNum = 659;BA.debugLine="Dim nList As List";
_nlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 660;BA.debugLine="nList.initialize";
_nlist.Initialize();
 //BA.debugLineNum = 661;BA.debugLine="For Each strPropValue As String In spProps";
{
final anywheresoftware.b4a.BA.IterableList group8 = _spprops;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_strpropvalue = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 662;BA.debugLine="strPropValue = strPropValue.Trim";
_strpropvalue = _strpropvalue.trim();
 //BA.debugLineNum = 663;BA.debugLine="Dim strProp As String = MvField(strPropValue,1,";
_strprop = _mvfield(_strpropvalue,(int) (1),":");
 //BA.debugLineNum = 664;BA.debugLine="Dim strValue As String = MvField(strPropValue,2";
_strvalue = _mvfield(_strpropvalue,(int) (2),":");
 //BA.debugLineNum = 665;BA.debugLine="strProp = strProp.Trim";
_strprop = _strprop.trim();
 //BA.debugLineNum = 666;BA.debugLine="strValue = strValue.trim";
_strvalue = _strvalue.trim();
 //BA.debugLineNum = 667;BA.debugLine="If styleProp.EqualsIgnoreCase(strProp) = False";
if (_styleprop.equalsIgnoreCase(_strprop)==__c.False) { 
 //BA.debugLineNum = 668;BA.debugLine="Dim nLine As String = $\"${strProp}:${strValue}";
_nline = (""+__c.SmartStringFormatter("",(Object)(_strprop))+":"+__c.SmartStringFormatter("",(Object)(_strvalue))+"");
 //BA.debugLineNum = 669;BA.debugLine="nList.Add(nLine)";
_nlist.Add((Object)(_nline));
 };
 }
};
 //BA.debugLineNum = 672;BA.debugLine="scontent = Join(\";\",nList)";
_scontent = _join(";",_nlist);
 //BA.debugLineNum = 673;BA.debugLine="CSSRule.Put(styleName,scontent)";
_cssrule.Put((Object)(_stylename),(Object)(_scontent));
 };
 //BA.debugLineNum = 675;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _removedynamicclass(String _classname) throws Exception{
int _cpos = 0;
 //BA.debugLineNum = 264;BA.debugLine="Sub RemoveDynamicClass(className As String) As Vue";
 //BA.debugLineNum = 265;BA.debugLine="Dim cpos As Int = classList.IndexOf(className)";
_cpos = _classlist.IndexOf((Object)(_classname));
 //BA.debugLineNum = 266;BA.debugLine="cpos = BANano.parseInt(cpos)";
_cpos = _banano.parseInt((Object)(_cpos));
 //BA.debugLineNum = 267;BA.debugLine="If cpos <> -1 Then classList.RemoveAt(cpos)";
if (_cpos!=-1) { 
_classlist.RemoveAt(_cpos);};
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _removestyle(String _stylename) throws Exception{
anywheresoftware.b4a.objects.collections.List _sitems = null;
String _strstyle = "";
 //BA.debugLineNum = 2050;BA.debugLine="public Sub RemoveStyle(styleName As String) As Vue";
 //BA.debugLineNum = 2051;BA.debugLine="styleName = styleName.Trim";
_stylename = _stylename.trim();
 //BA.debugLineNum = 2052;BA.debugLine="styleName = styleName.tolowercase";
_stylename = _stylename.toLowerCase();
 //BA.debugLineNum = 2053;BA.debugLine="styleName = styleName.Replace(\" \",\";\")";
_stylename = _stylename.replace(" ",";");
 //BA.debugLineNum = 2054;BA.debugLine="Dim sItems As List = StrParse(\";\",styleName)";
_sitems = new anywheresoftware.b4a.objects.collections.List();
_sitems = _strparse(";",_stylename);
 //BA.debugLineNum = 2055;BA.debugLine="For Each strStyle As String In sItems";
{
final anywheresoftware.b4a.BA.IterableList group5 = _sitems;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_strstyle = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 2056;BA.debugLine="strStyle = strStyle.trim";
_strstyle = _strstyle.trim();
 //BA.debugLineNum = 2057;BA.debugLine="If Styles.ContainsKey(strStyle) Then";
if (_styles.ContainsKey((Object)(_strstyle))) { 
 //BA.debugLineNum = 2058;BA.debugLine="Styles.Remove(strStyle)";
_styles.Remove((Object)(_strstyle));
 };
 }
};
 //BA.debugLineNum = 2061;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2062;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setalt(String _a) throws Exception{
 //BA.debugLineNum = 752;BA.debugLine="Sub SetAlt(a As String) As VueHTML";
 //BA.debugLineNum = 753;BA.debugLine="SetAttr(\"alt\", a)";
_setattr("alt",_a);
 //BA.debugLineNum = 754;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 755;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattr(String _prop,String _vals) throws Exception{
anywheresoftware.b4a.objects.collections.Map _attr = null;
 //BA.debugLineNum = 493;BA.debugLine="Sub SetAttr(prop As String, vals As String) As Vue";
 //BA.debugLineNum = 494;BA.debugLine="Dim attr As Map = CreateMap()";
_attr = new anywheresoftware.b4a.objects.collections.Map();
_attr = __c.createMap(new Object[] {});
 //BA.debugLineNum = 495;BA.debugLine="attr.Put(prop, vals)";
_attr.Put((Object)(_prop),(Object)(_vals));
 //BA.debugLineNum = 496;BA.debugLine="SetAttrs(attr)";
_setattrs(_attr);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattraction(String _stitle) throws Exception{
 //BA.debugLineNum = 1414;BA.debugLine="Sub SetAttrACTION(stitle As String) As VueHTML";
 //BA.debugLineNum = 1415;BA.debugLine="AddAttribute(\"action\", stitle)";
_addattribute("action",_stitle);
 //BA.debugLineNum = 1416;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1417;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattralt(String _svalue) throws Exception{
 //BA.debugLineNum = 1829;BA.debugLine="Sub SetAttrALT(sValue As String) As VueHTML";
 //BA.debugLineNum = 1830;BA.debugLine="AddAttribute(\"alt\",sValue)";
_addattribute("alt",_svalue);
 //BA.debugLineNum = 1831;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1832;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrautocomplete(boolean _b) throws Exception{
 //BA.debugLineNum = 1420;BA.debugLine="Sub SetAttrAUTOCOMPLETE(b As Boolean) As VueHTML";
 //BA.debugLineNum = 1421;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 1422;BA.debugLine="AddAttribute(\"autocomplete\", \"on\")";
_addattribute("autocomplete","on");
 };
 //BA.debugLineNum = 1424;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1425;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrautocompleteoff(boolean _b) throws Exception{
 //BA.debugLineNum = 3493;BA.debugLine="Sub SetAttrAutoCompleteOFF(b As Boolean) As VueHTM";
 //BA.debugLineNum = 3494;BA.debugLine="SetAttr(\"autocomplete\", \"off\")";
_setattr("autocomplete","off");
 //BA.debugLineNum = 3495;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 3496;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrautofocus(boolean _b) throws Exception{
 //BA.debugLineNum = 1428;BA.debugLine="Sub SetAttrAUTOFOCUS(b As Boolean) As VueHTML";
 //BA.debugLineNum = 1429;BA.debugLine="If b Then AddLooseAttribute(\"autofocus\")";
if (_b) { 
_addlooseattribute("autofocus");};
 //BA.debugLineNum = 1430;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1431;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrcols(String _l) throws Exception{
 //BA.debugLineNum = 1703;BA.debugLine="Sub SetAttrCols(l As String) As VueHTML";
 //BA.debugLineNum = 1704;BA.debugLine="AddAttribute(\"cols\",l)";
_addattribute("cols",_l);
 //BA.debugLineNum = 1705;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1706;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrcss(Object _w) throws Exception{
 //BA.debugLineNum = 1280;BA.debugLine="Sub SetAttrCSS(w As Object) As VueHTML";
 //BA.debugLineNum = 1281;BA.debugLine="AddAttribute(\"css\", w)";
_addattribute("css",BA.ObjectToString(_w));
 //BA.debugLineNum = 1282;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrdata(String _prop,String _svalue) throws Exception{
boolean _sw = false;
 //BA.debugLineNum = 2108;BA.debugLine="Sub SetAttrData(prop As String, svalue As String)";
 //BA.debugLineNum = 2109;BA.debugLine="Dim sw As Boolean = prop.StartsWith(\"data-\")";
_sw = _prop.startsWith("data-");
 //BA.debugLineNum = 2110;BA.debugLine="If sw Then";
if (_sw) { 
 //BA.debugLineNum = 2111;BA.debugLine="AddAttribute(prop,svalue)";
_addattribute(_prop,_svalue);
 }else {
 //BA.debugLineNum = 2113;BA.debugLine="AddAttribute(\"data-\" & prop,svalue)";
_addattribute("data-"+_prop,_svalue);
 };
 //BA.debugLineNum = 2115;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 1050;BA.debugLine="Sub SetAttrDisabled(b As Boolean) As VueHTML";
 //BA.debugLineNum = 1051;BA.debugLine="If b Then AddLooseAttribute(\"disabled\")";
if (_b) { 
_addlooseattribute("disabled");};
 //BA.debugLineNum = 1052;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1053;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrfor(String _sfor) throws Exception{
 //BA.debugLineNum = 1662;BA.debugLine="Sub SetAttrFOR(sFor As String) As VueHTML";
 //BA.debugLineNum = 1663;BA.debugLine="AddAttribute(\"for\",sFor)";
_addattribute("for",_sfor);
 //BA.debugLineNum = 1664;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1665;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrheight(String _h) throws Exception{
 //BA.debugLineNum = 1286;BA.debugLine="Sub SetAttrHeight(h As String) As VueHTML";
 //BA.debugLineNum = 1287;BA.debugLine="AddAttribute(\"height\", h)";
_addattribute("height",_h);
 //BA.debugLineNum = 1288;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrhref(String _svalue) throws Exception{
 //BA.debugLineNum = 1883;BA.debugLine="Sub SetAttrHREF(svalue As String) As VueHTML";
 //BA.debugLineNum = 1884;BA.debugLine="AddAttribute(\"href\",svalue)";
_addattribute("href",_svalue);
 //BA.debugLineNum = 1885;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1886;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 511;BA.debugLine="Sub SetAttributes(attrs As List) As VueHTML";
 //BA.debugLineNum = 512;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 513;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 515;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrlabel(String _l) throws Exception{
 //BA.debugLineNum = 1691;BA.debugLine="Sub SetAttrLabel(l As String) As VueHTML";
 //BA.debugLineNum = 1692;BA.debugLine="AddAttribute(\"label\",l)";
_addattribute("label",_l);
 //BA.debugLineNum = 1693;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1694;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 518;BA.debugLine="Sub SetAttrLoose(loose As String) As VueHTML";
 //BA.debugLineNum = 519;BA.debugLine="AddLooseAttribute(loose)";
_addlooseattribute(_loose);
 //BA.debugLineNum = 520;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 521;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrmax(Object _m) throws Exception{
 //BA.debugLineNum = 1970;BA.debugLine="Sub SetAttrMax(m As Object) As VueHTML";
 //BA.debugLineNum = 1971;BA.debugLine="SetAttr(\"max\", m)";
_setattr("max",BA.ObjectToString(_m));
 //BA.debugLineNum = 1972;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1973;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrmaxheight(Object _m) throws Exception{
 //BA.debugLineNum = 2005;BA.debugLine="Sub SetAttrMaxHeight(m As Object) As VueHTML";
 //BA.debugLineNum = 2006;BA.debugLine="SetAttr(\"mnax-height\", MakePx(m))";
_setattr("mnax-height",_makepx(BA.ObjectToString(_m)));
 //BA.debugLineNum = 2007;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2008;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrmaxwidth(Object _m) throws Exception{
 //BA.debugLineNum = 1998;BA.debugLine="Sub SetAttrMaxWidth(m As Object) As VueHTML";
 //BA.debugLineNum = 1999;BA.debugLine="SetAttr(\"max-width\", MakePx(m))";
_setattr("max-width",_makepx(BA.ObjectToString(_m)));
 //BA.debugLineNum = 2000;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2001;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrmethod(String _svalue) throws Exception{
 //BA.debugLineNum = 1545;BA.debugLine="Sub SetAttrMETHOD(sValue As String) As VueHTML";
 //BA.debugLineNum = 1546;BA.debugLine="AddAttribute(\"method\",sValue)";
_addattribute("method",_svalue);
 //BA.debugLineNum = 1547;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1548;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrmin(Object _m) throws Exception{
 //BA.debugLineNum = 1977;BA.debugLine="Sub SetAttrMin(m As Object) As VueHTML";
 //BA.debugLineNum = 1978;BA.debugLine="SetAttr(\"min\", MakePx(m))";
_setattr("min",_makepx(BA.ObjectToString(_m)));
 //BA.debugLineNum = 1979;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1980;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrminheight(Object _m) throws Exception{
 //BA.debugLineNum = 1991;BA.debugLine="Sub SetAttrMinHeight(m As Object) As VueHTML";
 //BA.debugLineNum = 1992;BA.debugLine="SetAttr(\"min-height\", MakePx(m))";
_setattr("min-height",_makepx(BA.ObjectToString(_m)));
 //BA.debugLineNum = 1993;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1994;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrminwidth(Object _m) throws Exception{
 //BA.debugLineNum = 1984;BA.debugLine="Sub SetAttrMinWidth(m As Object) As VueHTML";
 //BA.debugLineNum = 1985;BA.debugLine="SetAttr(\"min-width\", MakePx(m))";
_setattr("min-width",_makepx(BA.ObjectToString(_m)));
 //BA.debugLineNum = 1986;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrmulti(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 142;BA.debugLine="Sub SetAttrMulti(attr As Map) As VueHTML";
 //BA.debugLineNum = 143;BA.debugLine="For Each k As String In attr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attr.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 144;BA.debugLine="Dim v As String = attr.Get(k)";
_v = BA.ObjectToString(_attr.Get((Object)(_k)));
 //BA.debugLineNum = 145;BA.debugLine="AddAttribute(k, v)";
_addattribute(_k,_v);
 }
};
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrname(String _sname) throws Exception{
 //BA.debugLineNum = 1674;BA.debugLine="Sub SetAttrNAME(sName As String) As VueHTML";
 //BA.debugLineNum = 1675;BA.debugLine="AddAttribute(\"name\",sName)";
_addattribute("name",_sname);
 //BA.debugLineNum = 1676;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1677;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrplaceholder(String _splaceholder) throws Exception{
 //BA.debugLineNum = 1402;BA.debugLine="Sub SetAttrPlaceHolder(sPlaceholder As String) As";
 //BA.debugLineNum = 1403;BA.debugLine="AddAttribute(\"placeholder\",sPlaceholder)";
_addattribute("placeholder",_splaceholder);
 //BA.debugLineNum = 1404;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrrel(String _rel) throws Exception{
 //BA.debugLineNum = 1435;BA.debugLine="Sub SetAttrREL(rel As String) As VueHTML";
 //BA.debugLineNum = 1436;BA.debugLine="AddAttribute(\"rel\", rel)";
_addattribute("rel",_rel);
 //BA.debugLineNum = 1437;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1438;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrrole(String _svalue) throws Exception{
 //BA.debugLineNum = 1540;BA.debugLine="Sub SetAttrROLE(sValue As String) As VueHTML";
 //BA.debugLineNum = 1541;BA.debugLine="AddAttribute(\"role\",sValue)";
_addattribute("role",_svalue);
 //BA.debugLineNum = 1542;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1543;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrrolebutton(boolean _b) throws Exception{
 //BA.debugLineNum = 943;BA.debugLine="Sub SetAttrRoleButton(b As Boolean) As VueHTML   '";
 //BA.debugLineNum = 944;BA.debugLine="SetAttrROLE(\"button\")";
_setattrrole("button");
 //BA.debugLineNum = 945;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 946;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrrows(String _l) throws Exception{
 //BA.debugLineNum = 1697;BA.debugLine="Sub SetAttrRows(l As String) As VueHTML";
 //BA.debugLineNum = 1698;BA.debugLine="AddAttribute(\"rows\",l)";
_addattribute("rows",_l);
 //BA.debugLineNum = 1699;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1700;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrrowspan(String _sname) throws Exception{
 //BA.debugLineNum = 1709;BA.debugLine="Sub SetAttrROWSPAN(sName As String) As VueHTML";
 //BA.debugLineNum = 1710;BA.debugLine="AddAttribute(\"rowspan\",sName)";
_addattribute("rowspan",_sname);
 //BA.debugLineNum = 1711;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1712;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrs(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 134;BA.debugLine="Sub SetAttrs(attr As Map) As VueHTML";
 //BA.debugLineNum = 135;BA.debugLine="For Each k As String In attr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attr.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 136;BA.debugLine="Dim v As String = attr.Get(k)";
_v = BA.ObjectToString(_attr.Get((Object)(_k)));
 //BA.debugLineNum = 137;BA.debugLine="AddAttribute(k, v)";
_addattribute(_k,_v);
 }
};
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrsingle(String _prop,String _vals) throws Exception{
anywheresoftware.b4a.objects.collections.Map _attr = null;
 //BA.debugLineNum = 485;BA.debugLine="Sub SetAttrSingle(prop As String, vals As String)";
 //BA.debugLineNum = 486;BA.debugLine="Dim attr As Map = CreateMap()";
_attr = new anywheresoftware.b4a.objects.collections.Map();
_attr = __c.createMap(new Object[] {});
 //BA.debugLineNum = 487;BA.debugLine="attr.Put(prop, vals)";
_attr.Put((Object)(_prop),(Object)(_vals));
 //BA.debugLineNum = 488;BA.debugLine="SetAttrs(attr)";
_setattrs(_attr);
 //BA.debugLineNum = 489;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrsrc(String _svalue,boolean _static) throws Exception{
String _tmpfile = "";
 //BA.debugLineNum = 1817;BA.debugLine="Sub SetAttrSRC(sValue As String, Static As Boolean";
 //BA.debugLineNum = 1818;BA.debugLine="Dim tmpFile As String = MvField(sValue,1,\"?\")";
_tmpfile = _mvfield(_svalue,(int) (1),"?");
 //BA.debugLineNum = 1819;BA.debugLine="If Static Then";
if (_static) { 
 //BA.debugLineNum = 1820;BA.debugLine="sValue = tmpFile";
_svalue = _tmpfile;
 }else {
 //BA.debugLineNum = 1822;BA.debugLine="sValue = tmpFile & \"?\" & DateTime.now";
_svalue = _tmpfile+"?"+BA.NumberToString(__c.DateTime.getNow());
 };
 //BA.debugLineNum = 1824;BA.debugLine="AddAttribute(\"src\",sValue)";
_addattribute("src",_svalue);
 //BA.debugLineNum = 1825;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1826;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrsummary(String _sname) throws Exception{
 //BA.debugLineNum = 1679;BA.debugLine="Sub SetAttrSUMMARY(sName As String) As VueHTML";
 //BA.debugLineNum = 1680;BA.debugLine="AddAttribute(\"summary\",sName)";
_addattribute("summary",_sname);
 //BA.debugLineNum = 1681;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1682;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtabindex(String _tbi) throws Exception{
 //BA.debugLineNum = 3498;BA.debugLine="Sub SetAttrTabIndex(tbi As String) As VueHTML";
 //BA.debugLineNum = 3499;BA.debugLine="SetAttr(\"tabindex\", tbi)";
_setattr("tabindex",_tbi);
 //BA.debugLineNum = 3500;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 3501;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtarget(String _svalue) throws Exception{
 //BA.debugLineNum = 1461;BA.debugLine="Sub SetAttrTARGET(sValue As String) As VueHTML";
 //BA.debugLineNum = 1462;BA.debugLine="If sValue.Trim = \"\" Then Return Me";
if ((_svalue.trim()).equals("")) { 
if (true) return (b4j.example.vuehtml)(this);};
 //BA.debugLineNum = 1463;BA.debugLine="AddAttribute(\"target\",sValue)";
_addattribute("target",_svalue);
 //BA.debugLineNum = 1464;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1465;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtargetblank(boolean _b) throws Exception{
 //BA.debugLineNum = 1467;BA.debugLine="Sub SetAttrTargetBlank(b As Boolean) As VueHTML";
 //BA.debugLineNum = 1468;BA.debugLine="SetAttrTARGET(\"_blank\")";
_setattrtarget("_blank");
 //BA.debugLineNum = 1469;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1470;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtargetparent(boolean _b) throws Exception{
 //BA.debugLineNum = 1477;BA.debugLine="Sub SetAttrTargetParent(b As Boolean) As VueHTML";
 //BA.debugLineNum = 1478;BA.debugLine="SetAttrTARGET(\"_parent\")";
_setattrtarget("_parent");
 //BA.debugLineNum = 1479;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1480;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtargetself(boolean _b) throws Exception{
 //BA.debugLineNum = 1472;BA.debugLine="Sub SetAttrTargetSelf(b As Boolean) As VueHTML";
 //BA.debugLineNum = 1473;BA.debugLine="SetAttrTARGET(\"_self\")";
_setattrtarget("_self");
 //BA.debugLineNum = 1474;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtargettop(boolean _b) throws Exception{
 //BA.debugLineNum = 1482;BA.debugLine="Sub SetAttrTargetTop(b As Boolean) As VueHTML    '";
 //BA.debugLineNum = 1483;BA.debugLine="SetAttrTARGET(\"_top\")";
_setattrtarget("_top");
 //BA.debugLineNum = 1484;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1485;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtitle(String _stitle) throws Exception{
 //BA.debugLineNum = 1408;BA.debugLine="Sub SetAttrTITLE(stitle As String) As VueHTML";
 //BA.debugLineNum = 1409;BA.debugLine="AddAttribute(\"title\", stitle)";
_addattribute("title",_stitle);
 //BA.debugLineNum = 1410;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtype(String _svalue) throws Exception{
 //BA.debugLineNum = 1714;BA.debugLine="Sub SetAttrTYPE(sValue As String) As VueHTML";
 //BA.debugLineNum = 1715;BA.debugLine="AddAttribute(\"type\",sValue)";
_addattribute("type",_svalue);
 //BA.debugLineNum = 1716;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1717;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtypelowercase() throws Exception{
 //BA.debugLineNum = 1569;BA.debugLine="Sub SetAttrTypeLowerCase() As VueHTML";
 //BA.debugLineNum = 1570;BA.debugLine="AddAttribute(\"type\",\"a\")";
_addattribute("type","a");
 //BA.debugLineNum = 1571;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1572;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtypelowercaseroman() throws Exception{
 //BA.debugLineNum = 1579;BA.debugLine="Sub SetAttrTypeLowerCaseRoman() As VueHTML";
 //BA.debugLineNum = 1580;BA.debugLine="AddAttribute(\"type\",\"i\")";
_addattribute("type","i");
 //BA.debugLineNum = 1581;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1582;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtypenumbers() throws Exception{
 //BA.debugLineNum = 1559;BA.debugLine="Sub SetAttrTypeNumbers() As VueHTML";
 //BA.debugLineNum = 1560;BA.debugLine="AddAttribute(\"type\",\"1\")";
_addattribute("type","1");
 //BA.debugLineNum = 1561;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1562;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtypeuppercase() throws Exception{
 //BA.debugLineNum = 1564;BA.debugLine="Sub SetAttrTypeUpperCase() As VueHTML";
 //BA.debugLineNum = 1565;BA.debugLine="AddAttribute(\"type\",\"A\")";
_addattribute("type","A");
 //BA.debugLineNum = 1566;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1567;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrtypeuppercaseroman() throws Exception{
 //BA.debugLineNum = 1574;BA.debugLine="Sub SetAttrTypeUpperCaseRoman() As VueHTML";
 //BA.debugLineNum = 1575;BA.debugLine="AddAttribute(\"type\",\"I\")";
_addattribute("type","I");
 //BA.debugLineNum = 1576;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1577;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrvalue(String _svalue) throws Exception{
 //BA.debugLineNum = 1668;BA.debugLine="Sub SetAttrVALUE(sValue As String) As VueHTML";
 //BA.debugLineNum = 1669;BA.debugLine="AddAttribute(\"value\",sValue)";
_addattribute("value",_svalue);
 //BA.debugLineNum = 1670;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1671;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setattrwidth(Object _w) throws Exception{
 //BA.debugLineNum = 1274;BA.debugLine="Sub SetAttrWidth(w As Object) As VueHTML";
 //BA.debugLineNum = 1275;BA.debugLine="AddAttribute(\"width\", w)";
_addattribute("width",BA.ObjectToString(_w));
 //BA.debugLineNum = 1276;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setautocomplete(String _auto) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub SetAutoComplete(auto As String) As VueHTML";
 //BA.debugLineNum = 357;BA.debugLine="SetAttrs(CreateMap(\"autocomplete\": auto))";
_setattrs(__c.createMap(new Object[] {(Object)("autocomplete"),(Object)(_auto)}));
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setbackgroundcolor(Object _p) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetBackgroundColor(p As Object) As VueHTML";
 //BA.debugLineNum = 208;BA.debugLine="SetStyles(CreateMap(\"background-color\":p))";
_setstyles(__c.createMap(new Object[] {(Object)("background-color"),_p}));
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setbackgroundimage(String _surl) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetBackgroundImage(sURL As String) As VueHTML";
 //BA.debugLineNum = 244;BA.debugLine="SetStyle(\"background-image\", $\"url('${sURL}')\"$)";
_setstyle("background-image",("url('"+__c.SmartStringFormatter("",(Object)(_surl))+"')"));
 //BA.debugLineNum = 245;BA.debugLine="SetStyle(\"background-size\", \"100% 100%\")";
_setstyle("background-size","100% 100%");
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setbool() throws Exception{
 //BA.debugLineNum = 535;BA.debugLine="Sub SetBool As VueHTML";
 //BA.debugLineNum = 536;BA.debugLine="fieldType = \"bool\"";
_fieldtype = "bool";
 //BA.debugLineNum = 537;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setborder(String _width,String _color,String _bstyle) throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 421;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
 //BA.debugLineNum = 422;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 423;BA.debugLine="b.Put(\"border-style\", bstyle)";
_b.Put((Object)("border-style"),(Object)(_bstyle));
 //BA.debugLineNum = 424;BA.debugLine="b.Put(\"border-width\", width)";
_b.Put((Object)("border-width"),(Object)(_width));
 //BA.debugLineNum = 425;BA.debugLine="b.Put(\"border-color\", color)";
_b.Put((Object)("border-color"),(Object)(_color));
 //BA.debugLineNum = 426;BA.debugLine="SetStyles(b)";
_setstyles(_b);
 //BA.debugLineNum = 427;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setbutton() throws Exception{
 //BA.debugLineNum = 550;BA.debugLine="Sub SetButton As VueHTML";
 //BA.debugLineNum = 551;BA.debugLine="typeOf = \"button\"";
_typeof = "button";
 //BA.debugLineNum = 552;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 553;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setchecked(boolean _b) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub SetChecked(b As Boolean) As VueHTML";
 //BA.debugLineNum = 192;BA.debugLine="SetAttrs(CreateMap(\":checked\":b))";
_setattrs(__c.createMap(new Object[] {(Object)(":checked"),(Object)(_b)}));
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcite(Object _c) throws Exception{
 //BA.debugLineNum = 2998;BA.debugLine="Sub SetCite(c As Object) As VueHTML";
 //BA.debugLineNum = 2999;BA.debugLine="AddAttribute(\"cite\", c)";
_addattribute("cite",BA.ObjectToString(_c));
 //BA.debugLineNum = 3000;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 3001;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setclass(Object _c) throws Exception{
 //BA.debugLineNum = 917;BA.debugLine="Sub SetClass(c As Object) As VueHTML   'ignore";
 //BA.debugLineNum = 918;BA.debugLine="AddClass(c)";
_addclass(BA.ObjectToString(_c));
 //BA.debugLineNum = 919;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 920;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setclasscenter() throws Exception{
 //BA.debugLineNum = 1504;BA.debugLine="Sub SetClassCenter As VueHTML";
 //BA.debugLineNum = 1505;BA.debugLine="AddClass(\"center\")";
_addclass("center");
 //BA.debugLineNum = 1506;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1507;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setclasses(anywheresoftware.b4a.objects.collections.List _clslist) throws Exception{
String _c = "";
 //BA.debugLineNum = 873;BA.debugLine="Sub SetClasses(clsList As List) As VueHTML";
 //BA.debugLineNum = 874;BA.debugLine="For Each c As String In clsList";
{
final anywheresoftware.b4a.BA.IterableList group1 = _clslist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 875;BA.debugLine="AddClass(c)";
_addclass(_c);
 }
};
 //BA.debugLineNum = 877;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 878;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setclassrow(boolean _b) throws Exception{
 //BA.debugLineNum = 937;BA.debugLine="Sub SetClassRow(b As Boolean) As VueHTML   'ignore";
 //BA.debugLineNum = 938;BA.debugLine="AddClass(\"row\")";
_addclass("row");
 //BA.debugLineNum = 939;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 940;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setclasssection(boolean _b) throws Exception{
 //BA.debugLineNum = 923;BA.debugLine="Sub SetClassSection(b As Boolean) As VueHTML   'ig";
 //BA.debugLineNum = 924;BA.debugLine="AddClass(\"section\")";
_addclass("section");
 //BA.debugLineNum = 925;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 926;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcode(String _stext) throws Exception{
b4j.example.vuehtml _s = null;
 //BA.debugLineNum = 1941;BA.debugLine="Sub SetCode(sText As String) As VueHTML";
 //BA.debugLineNum = 1942;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
 //BA.debugLineNum = 1943;BA.debugLine="s = CreateCode(\"\").SetText(sText)";
_s = _createcode("")._settext /*b4j.example.vuehtml*/ (_stext);
 //BA.debugLineNum = 1944;BA.debugLine="AddElement(s)";
_addelement(_s);
 //BA.debugLineNum = 1945;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1946;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcolor(String _c) throws Exception{
 //BA.debugLineNum = 730;BA.debugLine="Sub SetColor(c As String) As VueHTML";
 //BA.debugLineNum = 731;BA.debugLine="SetAttr(\"color\", c)";
_setattr("color",_c);
 //BA.debugLineNum = 732;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 733;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcolspan(String _sname) throws Exception{
 //BA.debugLineNum = 1685;BA.debugLine="Sub SetCOLSPAN(sName As String) As VueHTML";
 //BA.debugLineNum = 1686;BA.debugLine="AddAttribute(\"colspan\",sName)";
_addattribute("colspan",_sname);
 //BA.debugLineNum = 1687;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1688;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcontainer(boolean _b) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetContainer(b As Boolean) As VueHTML";
 //BA.debugLineNum = 344;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vuehtml)(this);};
 //BA.debugLineNum = 345;BA.debugLine="AddClass(\"container\")";
_addclass("container");
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcontents(String _svalue) throws Exception{
 //BA.debugLineNum = 1522;BA.debugLine="public Sub SetContents(svalue As String) As VueHTM";
 //BA.debugLineNum = 1523;BA.debugLine="Contents.Initialize";
_contents.Initialize();
 //BA.debugLineNum = 1524;BA.debugLine="Contents.clear";
_contents.Clear();
 //BA.debugLineNum = 1525;BA.debugLine="If svalue.Length > 0 Then";
if (_svalue.length()>0) { 
 //BA.debugLineNum = 1526;BA.debugLine="AddContent(svalue)";
_addcontent(_svalue);
 };
 //BA.debugLineNum = 1528;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1529;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcursormove() throws Exception{
 //BA.debugLineNum = 431;BA.debugLine="Sub SetCursorMove As VueHTML";
 //BA.debugLineNum = 432;BA.debugLine="SetStyles(CreateMap(\"cursor\": \"move\"))";
_setstyles(__c.createMap(new Object[] {(Object)("cursor"),(Object)("move")}));
 //BA.debugLineNum = 433;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setcursorpointer() throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="Sub SetCursorPointer As VueHTML";
 //BA.debugLineNum = 437;BA.debugLine="SetStyles(CreateMap(\"cursor\": \"pointer\"))";
_setstyles(__c.createMap(new Object[] {(Object)("cursor"),(Object)("pointer")}));
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setdata(Object _dsx) throws Exception{
 //BA.debugLineNum = 759;BA.debugLine="Sub SetData(dsx As Object) As VueHTML";
 //BA.debugLineNum = 760;BA.debugLine="ds = dsx";
_ds = BA.ObjectToString(_dsx);
 //BA.debugLineNum = 761;BA.debugLine="SetVFor(\"row\", dsx)";
_setvfor("row",BA.ObjectToString(_dsx));
 //BA.debugLineNum = 762;BA.debugLine="SetKey(\"id\",False)";
_setkey((Object)("id"),__c.False);
 //BA.debugLineNum = 763;BA.debugLine="SetValue(\"value\",False)";
_setvalue("value",__c.False);
 //BA.debugLineNum = 764;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 765;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setdate() throws Exception{
 //BA.debugLineNum = 545;BA.debugLine="Sub SetDate As VueHTML";
 //BA.debugLineNum = 546;BA.debugLine="fieldType = \"date\"";
_fieldtype = "date";
 //BA.debugLineNum = 547;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 548;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 2684;BA.debugLine="Sub SetDesignMode(b As Boolean) As VueHTML";
 //BA.debugLineNum = 2685;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 2686;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2687;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setdouble() throws Exception{
 //BA.debugLineNum = 524;BA.debugLine="Sub SetDouble As VueHTML";
 //BA.debugLineNum = 525;BA.debugLine="fieldType = \"dbl\"";
_fieldtype = "dbl";
 //BA.debugLineNum = 526;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 527;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setdraggable(boolean _b) throws Exception{
 //BA.debugLineNum = 451;BA.debugLine="Sub SetDraggable(b As Boolean) As VueHTML";
 //BA.debugLineNum = 452;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 453;BA.debugLine="SetAttr(\"draggable\", b)";
_setattr("draggable",BA.ObjectToString(_b));
 //BA.debugLineNum = 454;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 };
 //BA.debugLineNum = 456;BA.debugLine="SetAttrs(CreateMap(\":draggable\":b))";
_setattrs(__c.createMap(new Object[] {(Object)(":draggable"),(Object)(_b)}));
 //BA.debugLineNum = 457;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setdroppable(boolean _b) throws Exception{
 //BA.debugLineNum = 460;BA.debugLine="Sub SetDroppable(b As Boolean) As VueHTML";
 //BA.debugLineNum = 461;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 462;BA.debugLine="SetAttrs(CreateMap(\"droppable\":b))";
_setattrs(__c.createMap(new Object[] {(Object)("droppable"),(Object)(_b)}));
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 };
 //BA.debugLineNum = 465;BA.debugLine="SetAttrs(CreateMap(\":droppable\":b))";
_setattrs(__c.createMap(new Object[] {(Object)(":droppable"),(Object)(_b)}));
 //BA.debugLineNum = 466;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setelementtypeoncondition(boolean _bstatus,String _selementtype) throws Exception{
 //BA.debugLineNum = 1639;BA.debugLine="Sub SetElementTypeOnCondition(bStatus As Boolean,s";
 //BA.debugLineNum = 1640;BA.debugLine="If bStatus Then";
if (_bstatus) { 
 //BA.debugLineNum = 1641;BA.debugLine="Tag = sElementType";
_tag = _selementtype;
 };
 //BA.debugLineNum = 1643;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1644;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _seterrortext(String _etxt) throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Sub SetErrorText(eTxt As String) As VueHTML";
 //BA.debugLineNum = 556;BA.debugLine="ErrorMessage = eTxt";
_errormessage = _etxt;
 //BA.debugLineNum = 557;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setexact(boolean _b) throws Exception{
 //BA.debugLineNum = 768;BA.debugLine="Sub SetExact(b As Boolean) As VueHTML";
 //BA.debugLineNum = 769;BA.debugLine="If b Then SetAttr(\"exact\", b)";
if (_b) { 
_setattr("exact",BA.ObjectToString(_b));};
 //BA.debugLineNum = 770;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setfor(String _f) throws Exception{
 //BA.debugLineNum = 501;BA.debugLine="Sub SetFor(f As String) As VueHTML";
 //BA.debugLineNum = 502;BA.debugLine="SetAttr(\"for\", f)";
_setattr("for",_f);
 //BA.debugLineNum = 503;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _sethref(String _h) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetHREF(h As String) As VueHTML";
 //BA.debugLineNum = 238;BA.debugLine="SetAttrHREF(h)";
_setattrhref(_h);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setinline(boolean _b) throws Exception{
 //BA.debugLineNum = 867;BA.debugLine="Sub SetInline(b As Boolean) As VueHTML";
 //BA.debugLineNum = 868;BA.debugLine="SetStyles(CreateMap(\"display\":\"inline-flex\",\"marg";
_setstyles(__c.createMap(new Object[] {(Object)("display"),(Object)("inline-flex"),(Object)("margin-right"),(Object)("10px")}));
 //BA.debugLineNum = 869;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 870;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setint() throws Exception{
 //BA.debugLineNum = 540;BA.debugLine="Sub SetInt As VueHTML";
 //BA.debugLineNum = 541;BA.debugLine="fieldType = \"int\"";
_fieldtype = "int";
 //BA.debugLineNum = 542;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 543;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setis(String _t) throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub SetIs(t As String) As VueHTML";
 //BA.debugLineNum = 281;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 282;BA.debugLine="SetAttrs(CreateMap(\":is\": t))";
_setattrs(__c.createMap(new Object[] {(Object)(":is"),(Object)(_t)}));
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setkey(Object _k,boolean _bbind) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetKey(k As Object, bBind As Boolean) As VueHT";
 //BA.debugLineNum = 272;BA.debugLine="If bBind Then";
if (_bbind) { 
 //BA.debugLineNum = 273;BA.debugLine="SetAttr(\":key\", k)";
_setattr(":key",BA.ObjectToString(_k));
 }else {
 //BA.debugLineNum = 275;BA.debugLine="SetAttr(\"key\", k)";
_setattr("key",BA.ObjectToString(_k));
 };
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setlineheight(Object _lh) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetLineHeight(lh As Object) As VueHTML";
 //BA.debugLineNum = 165;BA.debugLine="SetStyles(CreateMap(\"line-height\": lh))";
_setstyles(__c.createMap(new Object[] {(Object)("line-height"),_lh}));
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setmarginall(Object _p) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetMarginAll(p As Object) As VueHTML";
 //BA.debugLineNum = 213;BA.debugLine="SetStyles(CreateMap(\"margin\":p))";
_setstyles(__c.createMap(new Object[] {(Object)("margin"),_p}));
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setmargins(String _smt,String _smb,String _sml,String _smr) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetMargins(sMT As String, sMB As String, sML A";
 //BA.debugLineNum = 119;BA.debugLine="SetStyle(\"margin-top\", sMT)";
_setstyle("margin-top",_smt);
 //BA.debugLineNum = 120;BA.debugLine="SetStyle(\"margin-bottom\", sMB)";
_setstyle("margin-bottom",_smb);
 //BA.debugLineNum = 121;BA.debugLine="SetStyle(\"margin-left\", sML)";
_setstyle("margin-left",_sml);
 //BA.debugLineNum = 122;BA.debugLine="SetStyle(\"margin-right\", sMR)";
_setstyle("margin-right",_smr);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setmaxheight(String _mw) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetMaxHeight(mw As String) As VueHTML";
 //BA.debugLineNum = 228;BA.debugLine="SetStyle(\"max-height\",mw)";
_setstyle("max-height",_mw);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setmaxwidth(String _mw) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetMaxWidth(mw As String) As VueHTML";
 //BA.debugLineNum = 223;BA.debugLine="SetStyle(\"max-width\", mw)";
_setstyle("max-width",_mw);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setmethodpost() throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="Sub SetMethodPost As VueHTML";
 //BA.debugLineNum = 447;BA.debugLine="SetAttrs(CreateMap(\"method\":\"POST\"))";
_setattrs(__c.createMap(new Object[] {(Object)("method"),(Object)("POST")}));
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setname(String _n,boolean _bbind) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub SetName(n As String, bBind As Boolean) As VueH";
 //BA.debugLineNum = 362;BA.debugLine="If bBind Then";
if (_bbind) { 
 //BA.debugLineNum = 363;BA.debugLine="RemoveAttr(\"name\")";
_removeattr("name");
 //BA.debugLineNum = 364;BA.debugLine="SetAttrs(CreateMap(\":name\": n))";
_setattrs(__c.createMap(new Object[] {(Object)(":name"),(Object)(_n)}));
 }else {
 //BA.debugLineNum = 366;BA.debugLine="RemoveAttr(\":name\")";
_removeattr(":name");
 //BA.debugLineNum = 367;BA.debugLine="SetAttrs(CreateMap(\"name\": n))";
_setattrs(__c.createMap(new Object[] {(Object)("name"),(Object)(_n)}));
 };
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setnumber() throws Exception{
 //BA.debugLineNum = 530;BA.debugLine="Sub SetNumber As VueHTML";
 //BA.debugLineNum = 531;BA.debugLine="typeOf = \"number\"";
_typeof = "number";
 //BA.debugLineNum = 532;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 533;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonblur(String _methodname) throws Exception{
 //BA.debugLineNum = 2308;BA.debugLine="Sub SetOnBlur(methodName As String) As VueHTML";
 //BA.debugLineNum = 2309;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2310;BA.debugLine="SetAttr(\"@blur\", methodName)";
_setattr("@blur",_methodname);
 //BA.debugLineNum = 2311;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonchange(Object _eventhandler,String _methodname) throws Exception{
 //BA.debugLineNum = 580;BA.debugLine="Sub SetOnChange(eventHandler As Object, methodName";
 //BA.debugLineNum = 581;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 582;BA.debugLine="SetAttr(\"@change\", methodName)";
_setattr("@change",_methodname);
 //BA.debugLineNum = 583;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonclick(String _methodname) throws Exception{
 //BA.debugLineNum = 2316;BA.debugLine="Sub SetOnClick(methodName As String) As VueHTML";
 //BA.debugLineNum = 2317;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2318;BA.debugLine="SetAttr(\"@click\", methodName)";
_setattr("@click",_methodname);
 //BA.debugLineNum = 2319;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setondblclick(String _methodname) throws Exception{
 //BA.debugLineNum = 2272;BA.debugLine="Sub SetOnDblClick(methodName As String) As VueHTML";
 //BA.debugLineNum = 2273;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2274;BA.debugLine="SetAttr(\"@dblclick\", methodName)";
_setattr("@dblclick",_methodname);
 //BA.debugLineNum = 2275;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonfocus(String _methodname) throws Exception{
 //BA.debugLineNum = 2302;BA.debugLine="Sub SetOnFocus(methodName As String) As VueHTML";
 //BA.debugLineNum = 2303;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2304;BA.debugLine="SetAttr(\"@focus\", methodName)";
_setattr("@focus",_methodname);
 //BA.debugLineNum = 2305;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2306;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setoninput(String _methodname) throws Exception{
 //BA.debugLineNum = 2296;BA.debugLine="Sub SetOnInput(methodName As String) As VueHTML";
 //BA.debugLineNum = 2297;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2298;BA.debugLine="SetAttr(\"@input\", methodName)";
_setattr("@input",_methodname);
 //BA.debugLineNum = 2299;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonkeydown(String _methodname) throws Exception{
 //BA.debugLineNum = 2284;BA.debugLine="Sub SetOnKeyDown(methodName As String) As VueHTML";
 //BA.debugLineNum = 2285;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2286;BA.debugLine="SetAttr(\"@keydown\", methodName)";
_setattr("@keydown",_methodname);
 //BA.debugLineNum = 2287;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonkeyup(String _methodname) throws Exception{
 //BA.debugLineNum = 2290;BA.debugLine="Sub SetOnKeyUp(methodName As String) As VueHTML";
 //BA.debugLineNum = 2291;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2292;BA.debugLine="SetAttr(\"@keyup\", methodName)";
_setattr("@keyup",_methodname);
 //BA.debugLineNum = 2293;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonmouseout(String _methodname) throws Exception{
 //BA.debugLineNum = 687;BA.debugLine="Sub SetOnMouseOut(methodName As String) As VueHTML";
 //BA.debugLineNum = 688;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 689;BA.debugLine="SetAttr(\"@mouseout\", methodName)";
_setattr("@mouseout",_methodname);
 //BA.debugLineNum = 690;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonmouseover(String _methodname) throws Exception{
 //BA.debugLineNum = 693;BA.debugLine="Sub SetOnMouseOver(methodName As String) As VueHTM";
 //BA.debugLineNum = 694;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 695;BA.debugLine="SetAttr(\"@mouseover\", methodName)";
_setattr("@mouseover",_methodname);
 //BA.debugLineNum = 696;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 697;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setonsubmit(String _methodname) throws Exception{
 //BA.debugLineNum = 2278;BA.debugLine="Sub SetOnSubmit(methodName As String) As VueHTML";
 //BA.debugLineNum = 2279;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2280;BA.debugLine="SetAttr(\"@submit\", methodName)";
_setattr("@submit",_methodname);
 //BA.debugLineNum = 2281;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2282;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setontouchstart(String _methodname) throws Exception{
 //BA.debugLineNum = 2322;BA.debugLine="Sub SetOnTouchStart(methodName As String) As VueHT";
 //BA.debugLineNum = 2323;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2324;BA.debugLine="SetAttr(\"@touchstart\", methodName)";
_setattr("@touchstart",_methodname);
 //BA.debugLineNum = 2325;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2326;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setpadding(String _spt,String _spb,String _spl,String _spr) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetPadding(sPT As String, sPB As String, sPL A";
 //BA.debugLineNum = 127;BA.debugLine="SetStyle(\"padding-top\", sPT)";
_setstyle("padding-top",_spt);
 //BA.debugLineNum = 128;BA.debugLine="SetStyle(\"padding-bottom\", sPB)";
_setstyle("padding-bottom",_spb);
 //BA.debugLineNum = 129;BA.debugLine="SetStyle(\"padding-left\", sPL)";
_setstyle("padding-left",_spl);
 //BA.debugLineNum = 130;BA.debugLine="SetStyle(\"padding-right\", sPR)";
_setstyle("padding-right",_spr);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setpaddingall(Object _p) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetPaddingAll(p As Object) As VueHTML";
 //BA.debugLineNum = 218;BA.debugLine="SetStyles(CreateMap(\"padding\":p))";
_setstyles(__c.createMap(new Object[] {(Object)("padding"),_p}));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setparentid(String _sparentid) throws Exception{
 //BA.debugLineNum = 2679;BA.debugLine="Sub SetParentID(sParentID As String) As VueHTML";
 //BA.debugLineNum = 2680;BA.debugLine="ParentID = sParentID";
_parentid = _sparentid;
 //BA.debugLineNum = 2681;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 2682;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setpointer(boolean _b) throws Exception{
 //BA.debugLineNum = 706;BA.debugLine="Sub SetPointer(b As Boolean) As VueHTML";
 //BA.debugLineNum = 707;BA.debugLine="SetStyle(\"cursor\",\"pointer\")";
_setstyle("cursor","pointer");
 //BA.debugLineNum = 708;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 709;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setprefix(String _sprefix) throws Exception{
 //BA.debugLineNum = 1955;BA.debugLine="Sub SetPrefix(sPrefix As String) As VueHTML";
 //BA.debugLineNum = 1956;BA.debugLine="Prefix = sPrefix";
_prefix = _sprefix;
 //BA.debugLineNum = 1957;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1958;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setref(String _varref) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetRef(varRef As String) As VueHTML";
 //BA.debugLineNum = 288;BA.debugLine="If varRef <> \"\" Then";
if ((_varref).equals("") == false) { 
 //BA.debugLineNum = 289;BA.debugLine="SetAttrs(CreateMap(\"ref\": varRef))";
_setattrs(__c.createMap(new Object[] {(Object)("ref"),(Object)(_varref)}));
 };
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 1044;BA.debugLine="Sub SetRequired(b As Boolean) As VueHTML";
 //BA.debugLineNum = 1045;BA.debugLine="SetAttr(\":required\", b)";
_setattr(":required",BA.ObjectToString(_b));
 //BA.debugLineNum = 1046;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1047;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setslot(String _sltvalue) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub SetSlot(sltValue As String) As VueHTML";
 //BA.debugLineNum = 406;BA.debugLine="SetAttr(\"slot\", sltValue)";
_setattr("slot",_sltvalue);
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setslotscope(String _sltvalue) throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="Sub SetSlotScope(sltValue As String) As VueHTML";
 //BA.debugLineNum = 411;BA.debugLine="SetAttr(\"slot-scope\", sltValue)";
_setattr("slot-scope",_sltvalue);
 //BA.debugLineNum = 412;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setspan(String _stext) throws Exception{
b4j.example.vuehtml _s = null;
 //BA.debugLineNum = 898;BA.debugLine="Sub SetSpan(sText As String) As VueHTML";
 //BA.debugLineNum = 899;BA.debugLine="Dim s As VueHTML";
_s = new b4j.example.vuehtml();
 //BA.debugLineNum = 900;BA.debugLine="s = CreateSpan(\"\").SetText(sText)";
_s = _createspan("")._settext /*b4j.example.vuehtml*/ (_stext);
 //BA.debugLineNum = 901;BA.debugLine="AddElement(s)";
_addelement(_s);
 //BA.debugLineNum = 902;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 903;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setsrc(String _s,boolean _bbind) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SetSRC(s As String, bbind As Boolean) As VueHT";
 //BA.debugLineNum = 197;BA.debugLine="If bbind Then";
if (_bbind) { 
 //BA.debugLineNum = 198;BA.debugLine="SetAttrs(CreateMap(\":src\":s))";
_setattrs(__c.createMap(new Object[] {(Object)(":src"),(Object)(_s)}));
 }else {
 //BA.debugLineNum = 200;BA.debugLine="SetAttrs(CreateMap(\"src\":s))";
_setattrs(__c.createMap(new Object[] {(Object)("src"),(Object)(_s)}));
 };
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstateonclick(Object _ns) throws Exception{
 //BA.debugLineNum = 905;BA.debugLine="Sub SetStateOnClick(ns As Object) As VueHTML";
 //BA.debugLineNum = 906;BA.debugLine="SetAttr(\"@click\", ns)";
_setattr("@click",BA.ObjectToString(_ns));
 //BA.debugLineNum = 907;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 908;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 574;BA.debugLine="Sub SetStatic(b As Boolean) As VueHTML";
 //BA.debugLineNum = 575;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 576;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 577;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyle(String _prop,String _vals) throws Exception{
anywheresoftware.b4a.objects.collections.Map _attr = null;
 //BA.debugLineNum = 478;BA.debugLine="Sub SetStyle(prop As String, vals As String) As Vu";
 //BA.debugLineNum = 479;BA.debugLine="Dim attr As Map = CreateMap()";
_attr = new anywheresoftware.b4a.objects.collections.Map();
_attr = __c.createMap(new Object[] {});
 //BA.debugLineNum = 480;BA.debugLine="attr.Put(prop, vals)";
_attr.Put((Object)(_prop),(Object)(_vals));
 //BA.debugLineNum = 481;BA.debugLine="SetStyles(attr)";
_setstyles(_attr);
 //BA.debugLineNum = 482;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundattachment(String _r) throws Exception{
 //BA.debugLineNum = 1341;BA.debugLine="Sub SetStyleBackgroundAttachment(r As String) As V";
 //BA.debugLineNum = 1342;BA.debugLine="SetStyle(\"background-attachment\", r)";
_setstyle("background-attachment",_r);
 //BA.debugLineNum = 1343;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1344;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundclip(Object _c) throws Exception{
 //BA.debugLineNum = 1063;BA.debugLine="Sub SetStyleBackgroundClip(c As Object) As VueHTML";
 //BA.debugLineNum = 1064;BA.debugLine="SetStyle(\"background-clip\",c)";
_setstyle("background-clip",BA.ObjectToString(_c));
 //BA.debugLineNum = 1065;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1066;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundcolor(Object _c) throws Exception{
 //BA.debugLineNum = 1056;BA.debugLine="Sub SetStyleBackgroundColor(c As Object) As VueHTM";
 //BA.debugLineNum = 1057;BA.debugLine="SetStyle(\"background-color\",c)";
_setstyle("background-color",BA.ObjectToString(_c));
 //BA.debugLineNum = 1058;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundimage(String _imgurl) throws Exception{
 //BA.debugLineNum = 1322;BA.debugLine="Sub SetStyleBackgroundImage(imgURL As String) As V";
 //BA.debugLineNum = 1323;BA.debugLine="SetStyle(\"background-image\", $\"url('${imgURL}')\"$";
_setstyle("background-image",("url('"+__c.SmartStringFormatter("",(Object)(_imgurl))+"')"));
 //BA.debugLineNum = 1324;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundorigin(Object _c) throws Exception{
 //BA.debugLineNum = 1070;BA.debugLine="Sub SetStyleBackgroundOrigin(c As Object) As VueHT";
 //BA.debugLineNum = 1071;BA.debugLine="SetStyle(\"background-origin\",c)";
_setstyle("background-origin",BA.ObjectToString(_c));
 //BA.debugLineNum = 1072;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1073;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundposition(String _r) throws Exception{
 //BA.debugLineNum = 1348;BA.debugLine="Sub SetStyleBackgroundPosition(r As String) As Vue";
 //BA.debugLineNum = 1349;BA.debugLine="SetStyle(\"background-position\", r)";
_setstyle("background-position",_r);
 //BA.debugLineNum = 1350;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1351;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundrepeat(String _r) throws Exception{
 //BA.debugLineNum = 1328;BA.debugLine="Sub SetStyleBackgroundRepeat(r As String) As VueHT";
 //BA.debugLineNum = 1329;BA.debugLine="SetStyle(\"background-repeat\", r)";
_setstyle("background-repeat",_r);
 //BA.debugLineNum = 1330;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebackgroundsize(String _r) throws Exception{
 //BA.debugLineNum = 1334;BA.debugLine="Sub SetStyleBackgroundSize(r As String) As VueHTML";
 //BA.debugLineNum = 1335;BA.debugLine="SetStyle(\"background-size\", r)";
_setstyle("background-size",_r);
 //BA.debugLineNum = 1336;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1337;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderbottomcolor(String _c) throws Exception{
 //BA.debugLineNum = 1213;BA.debugLine="Sub SetStyleBorderBottomColor(c As String) As VueH";
 //BA.debugLineNum = 1214;BA.debugLine="SetStyle(\"border-bottom-color\",c)";
_setstyle("border-bottom-color",_c);
 //BA.debugLineNum = 1215;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1216;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderbottomleftradius(String _bottomleft) throws Exception{
 //BA.debugLineNum = 1102;BA.debugLine="Sub SetStyleBorderBottomLeftRadius(bottomLeft As S";
 //BA.debugLineNum = 1103;BA.debugLine="bottomLeft = MakePx(bottomLeft)";
_bottomleft = _makepx(_bottomleft);
 //BA.debugLineNum = 1104;BA.debugLine="SetStyle(\"border-bottom-left-radius\", bottomLeft)";
_setstyle("border-bottom-left-radius",_bottomleft);
 //BA.debugLineNum = 1105;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderbottomrightradius(String _bottomright) throws Exception{
 //BA.debugLineNum = 1108;BA.debugLine="Sub SetStyleBorderBottomRightRadius(bottomRight As";
 //BA.debugLineNum = 1109;BA.debugLine="bottomRight = MakePx(bottomRight)";
_bottomright = _makepx(_bottomright);
 //BA.debugLineNum = 1110;BA.debugLine="SetStyle(\"border-bottom-right-radius\", bottomRigh";
_setstyle("border-bottom-right-radius",_bottomright);
 //BA.debugLineNum = 1111;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderbottomstyle(String _c) throws Exception{
 //BA.debugLineNum = 1228;BA.debugLine="Sub SetStyleBorderBottomStyle(c As String) As VueH";
 //BA.debugLineNum = 1229;BA.debugLine="SetStyle(\"border-bottom-style\",c)";
_setstyle("border-bottom-style",_c);
 //BA.debugLineNum = 1230;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderbottomwidth(String _b) throws Exception{
 //BA.debugLineNum = 1181;BA.debugLine="Sub SetStyleBorderBottomWidth(b As String) As VueH";
 //BA.debugLineNum = 1182;BA.debugLine="SetStyle(\"border-bottom-width\",MakePx(b))";
_setstyle("border-bottom-width",_makepx(_b));
 //BA.debugLineNum = 1183;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebordercolor(String _c) throws Exception{
 //BA.debugLineNum = 1191;BA.debugLine="Sub SetStyleBorderColor(c As String) As VueHTML";
 //BA.debugLineNum = 1192;BA.debugLine="SetStyle(\"border-color\",c)";
_setstyle("border-color",_c);
 //BA.debugLineNum = 1193;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderleftcolor(String _c) throws Exception{
 //BA.debugLineNum = 1196;BA.debugLine="Sub SetStyleBorderLeftColor(c As String) As VueHTM";
 //BA.debugLineNum = 1197;BA.debugLine="SetStyle(\"border-left-color\",c)";
_setstyle("border-left-color",_c);
 //BA.debugLineNum = 1198;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderleftstyle(String _c) throws Exception{
 //BA.debugLineNum = 1218;BA.debugLine="Sub SetStyleBorderLeftStyle(c As String) As VueHTM";
 //BA.debugLineNum = 1219;BA.debugLine="SetStyle(\"border-left-style\",c)";
_setstyle("border-left-style",_c);
 //BA.debugLineNum = 1220;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderleftwidth(String _b) throws Exception{
 //BA.debugLineNum = 1171;BA.debugLine="Sub SetStyleBorderLeftWidth(b As String) As VueHTM";
 //BA.debugLineNum = 1172;BA.debugLine="SetStyle(\"border-left-width\",MakePx(b))";
_setstyle("border-left-width",_makepx(_b));
 //BA.debugLineNum = 1173;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderradius(String _topleft,String _topright,String _bottomleft,String _bottomright) throws Exception{
anywheresoftware.b4a.objects.collections.List _br = null;
String _sbr = "";
 //BA.debugLineNum = 1076;BA.debugLine="Sub SetStyleBorderRadius(topLeft As String, topRig";
 //BA.debugLineNum = 1077;BA.debugLine="Dim br As List";
_br = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1078;BA.debugLine="br.Initialize";
_br.Initialize();
 //BA.debugLineNum = 1079;BA.debugLine="br.Add(MakePx(topLeft))";
_br.Add((Object)(_makepx(_topleft)));
 //BA.debugLineNum = 1080;BA.debugLine="br.Add(MakePx(topRight))";
_br.Add((Object)(_makepx(_topright)));
 //BA.debugLineNum = 1081;BA.debugLine="br.Add(MakePx(bottomLeft))";
_br.Add((Object)(_makepx(_bottomleft)));
 //BA.debugLineNum = 1082;BA.debugLine="br.Add(MakePx(bottomRight))";
_br.Add((Object)(_makepx(_bottomright)));
 //BA.debugLineNum = 1084;BA.debugLine="Dim sbr As String = Join(\" \", br)";
_sbr = _join(" ",_br);
 //BA.debugLineNum = 1085;BA.debugLine="SetStyle(\"border-radius\", sbr)";
_setstyle("border-radius",_sbr);
 //BA.debugLineNum = 1086;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1087;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderrightcolor(String _c) throws Exception{
 //BA.debugLineNum = 1202;BA.debugLine="Sub SetStyleBorderRightColor(c As String) As VueHT";
 //BA.debugLineNum = 1203;BA.debugLine="SetStyle(\"border-right-color\",c)";
_setstyle("border-right-color",_c);
 //BA.debugLineNum = 1204;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderrightstyle(String _c) throws Exception{
 //BA.debugLineNum = 1223;BA.debugLine="Sub SetStyleBorderRightStyle(c As String) As VueHT";
 //BA.debugLineNum = 1224;BA.debugLine="SetStyle(\"border-right-style\",c)";
_setstyle("border-right-style",_c);
 //BA.debugLineNum = 1225;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderrightwidth(String _b) throws Exception{
 //BA.debugLineNum = 1176;BA.debugLine="Sub SetStyleBorderRightWidth(b As String) As VueHT";
 //BA.debugLineNum = 1177;BA.debugLine="SetStyle(\"border-right-width\",MakePx(b))";
_setstyle("border-right-width",_makepx(_b));
 //BA.debugLineNum = 1178;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyle(Object _bs) throws Exception{
 //BA.debugLineNum = 1141;BA.debugLine="Sub SetStyleBorderStyle(bs As Object) As VueHTML";
 //BA.debugLineNum = 1142;BA.debugLine="SetStyle(\"border-style\",bs)";
_setstyle("border-style",BA.ObjectToString(_bs));
 //BA.debugLineNum = 1143;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyledashed(boolean _b) throws Exception{
 //BA.debugLineNum = 1151;BA.debugLine="Sub SetStyleBorderStyleDashed(b As Boolean) As Vue";
 //BA.debugLineNum = 1152;BA.debugLine="SetStyle(\"border-style\",\"dashed\")";
_setstyle("border-style","dashed");
 //BA.debugLineNum = 1153;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyledotted(boolean _b) throws Exception{
 //BA.debugLineNum = 1146;BA.debugLine="Sub SetStyleBorderStyleDotted(b As Boolean) As Vue";
 //BA.debugLineNum = 1147;BA.debugLine="SetStyle(\"border-style\",\"dotted\")";
_setstyle("border-style","dotted");
 //BA.debugLineNum = 1148;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1149;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyledouble(boolean _b) throws Exception{
 //BA.debugLineNum = 1161;BA.debugLine="Sub SetStyleBorderStyleDouble(b As Boolean) As Vue";
 //BA.debugLineNum = 1162;BA.debugLine="SetStyle(\"border-style\",\"double\")";
_setstyle("border-style","double");
 //BA.debugLineNum = 1163;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstylegroove(boolean _b) throws Exception{
 //BA.debugLineNum = 1238;BA.debugLine="Sub SetStyleBorderStyleGroove(b As Boolean) As Vue";
 //BA.debugLineNum = 1239;BA.debugLine="SetStyle(\"border-style\",\"groove\")";
_setstyle("border-style","groove");
 //BA.debugLineNum = 1240;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstylehidden(boolean _b) throws Exception{
 //BA.debugLineNum = 1263;BA.debugLine="Sub SetStyleBorderStyleHidden(b As Boolean) As Vue";
 //BA.debugLineNum = 1264;BA.debugLine="SetStyle(\"border-style\",\"hidden\")";
_setstyle("border-style","hidden");
 //BA.debugLineNum = 1265;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1266;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyleinset(boolean _b) throws Exception{
 //BA.debugLineNum = 1248;BA.debugLine="Sub SetStyleBorderStyleInset(b As Boolean) As VueH";
 //BA.debugLineNum = 1249;BA.debugLine="SetStyle(\"border-style\",\"inset\")";
_setstyle("border-style","inset");
 //BA.debugLineNum = 1250;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstylenone(boolean _b) throws Exception{
 //BA.debugLineNum = 1258;BA.debugLine="Sub SetStyleBorderStyleNone(b As Boolean) As VueHT";
 //BA.debugLineNum = 1259;BA.debugLine="SetStyle(\"border-style\",\"none\")";
_setstyle("border-style","none");
 //BA.debugLineNum = 1260;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyleoutset(boolean _b) throws Exception{
 //BA.debugLineNum = 1253;BA.debugLine="Sub SetStyleBorderStyleOutset(b As Boolean) As Vue";
 //BA.debugLineNum = 1254;BA.debugLine="SetStyle(\"border-style\",\"outset\")";
_setstyle("border-style","outset");
 //BA.debugLineNum = 1255;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1256;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstyleridge(boolean _b) throws Exception{
 //BA.debugLineNum = 1243;BA.debugLine="Sub SetStyleBorderStyleRidge(b As Boolean) As VueH";
 //BA.debugLineNum = 1244;BA.debugLine="SetStyle(\"border-style\",\"ridge\")";
_setstyle("border-style","ridge");
 //BA.debugLineNum = 1245;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1246;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderstylesolid(boolean _b) throws Exception{
 //BA.debugLineNum = 1156;BA.debugLine="Sub SetStyleBorderStyleSolid(b As Boolean) As VueH";
 //BA.debugLineNum = 1157;BA.debugLine="SetStyle(\"border-style\",\"solid\")";
_setstyle("border-style","solid");
 //BA.debugLineNum = 1158;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1159;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebordertopcolor(String _c) throws Exception{
 //BA.debugLineNum = 1207;BA.debugLine="Sub SetStyleBorderTopColor(c As String) As VueHTML";
 //BA.debugLineNum = 1208;BA.debugLine="SetStyle(\"border-top-color\",c)";
_setstyle("border-top-color",_c);
 //BA.debugLineNum = 1209;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1210;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebordertopleftradius(String _topleft) throws Exception{
 //BA.debugLineNum = 1090;BA.debugLine="Sub SetStyleBorderTopLeftRadius(topLeft As String)";
 //BA.debugLineNum = 1091;BA.debugLine="topLeft = MakePx(topLeft)";
_topleft = _makepx(_topleft);
 //BA.debugLineNum = 1092;BA.debugLine="SetStyle(\"border-top-left-radius\", topLeft)";
_setstyle("border-top-left-radius",_topleft);
 //BA.debugLineNum = 1093;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1094;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebordertoprightradius(String _topright) throws Exception{
 //BA.debugLineNum = 1096;BA.debugLine="Sub SetStyleBorderTopRightRadius(topRight As Strin";
 //BA.debugLineNum = 1097;BA.debugLine="topRight = MakePx(topRight)";
_topright = _makepx(_topright);
 //BA.debugLineNum = 1098;BA.debugLine="SetStyle(\"border-top-right-radius\", topRight)";
_setstyle("border-top-right-radius",_topright);
 //BA.debugLineNum = 1099;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebordertopstyle(String _c) throws Exception{
 //BA.debugLineNum = 1233;BA.debugLine="Sub SetStyleBorderTopStyle(c As String) As VueHTML";
 //BA.debugLineNum = 1234;BA.debugLine="SetStyle(\"border-top-style\",c)";
_setstyle("border-top-style",_c);
 //BA.debugLineNum = 1235;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1236;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylebordertopwidth(String _b) throws Exception{
 //BA.debugLineNum = 1186;BA.debugLine="Sub SetStyleBorderTopWidth(b As String) As VueHTML";
 //BA.debugLineNum = 1187;BA.debugLine="SetStyle(\"border-top-width\",MakePx(b))";
_setstyle("border-top-width",_makepx(_b));
 //BA.debugLineNum = 1188;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleborderwidth(String _b) throws Exception{
 //BA.debugLineNum = 1166;BA.debugLine="Sub SetStyleBorderWidth(b As String) As VueHTML";
 //BA.debugLineNum = 1167;BA.debugLine="SetStyle(\"border-width\",MakePx(b))";
_setstyle("border-width",_makepx(_b));
 //BA.debugLineNum = 1168;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylecolor(Object _c) throws Exception{
 //BA.debugLineNum = 1114;BA.debugLine="Sub SetStyleColor(c As Object) As VueHTML";
 //BA.debugLineNum = 1115;BA.debugLine="SetStyle(\"color\",c)";
_setstyle("color",BA.ObjectToString(_c));
 //BA.debugLineNum = 1116;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyledirection(Object _f) throws Exception{
 //BA.debugLineNum = 1034;BA.debugLine="Sub SetStyleDirection(f As Object) As VueHTML   'i";
 //BA.debugLineNum = 1035;BA.debugLine="SetStyle(\"direction\", f)";
_setstyle("direction",BA.ObjectToString(_f));
 //BA.debugLineNum = 1036;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1037;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontfamily(Object _f) throws Exception{
 //BA.debugLineNum = 948;BA.debugLine="Sub SetStyleFontFamily(f As Object) As VueHTML   '";
 //BA.debugLineNum = 949;BA.debugLine="SetStyle(\"font-family\", f)";
_setstyle("font-family",BA.ObjectToString(_f));
 //BA.debugLineNum = 950;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 951;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontsize(Object _f) throws Exception{
 //BA.debugLineNum = 981;BA.debugLine="Sub SetStyleFontSize(f As Object) As VueHTML   'ig";
 //BA.debugLineNum = 982;BA.debugLine="SetStyle(\"font-size\", MakePx(f))";
_setstyle("font-size",_makepx(BA.ObjectToString(_f)));
 //BA.debugLineNum = 983;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 984;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontstyle(Object _f) throws Exception{
 //BA.debugLineNum = 976;BA.debugLine="Sub SetStyleFontStyle(f As Object) As VueHTML   'i";
 //BA.debugLineNum = 977;BA.debugLine="SetStyle(\"font-style\", f)";
_setstyle("font-style",BA.ObjectToString(_f));
 //BA.debugLineNum = 978;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontvariant(Object _f) throws Exception{
 //BA.debugLineNum = 965;BA.debugLine="Sub SetStyleFontVariant(f As Object) As VueHTML";
 //BA.debugLineNum = 966;BA.debugLine="SetStyle(\"font-variant\", f)";
_setstyle("font-variant",BA.ObjectToString(_f));
 //BA.debugLineNum = 967;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 968;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontweight(Object _f) throws Exception{
 //BA.debugLineNum = 954;BA.debugLine="Sub SetStyleFontWeight(f As Object) As VueHTML   '";
 //BA.debugLineNum = 955;BA.debugLine="SetStyle(\"font-weight\", f)";
_setstyle("font-weight",BA.ObjectToString(_f));
 //BA.debugLineNum = 956;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 957;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontweightbold(boolean _f) throws Exception{
 //BA.debugLineNum = 960;BA.debugLine="Sub SetStyleFontWeightBold(f As Boolean) As VueHTM";
 //BA.debugLineNum = 961;BA.debugLine="SetStyle(\"font-weight\", \"bold\")";
_setstyle("font-weight","bold");
 //BA.debugLineNum = 962;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylefontweightnormal(boolean _f) throws Exception{
 //BA.debugLineNum = 970;BA.debugLine="Sub SetStyleFontWeightNormal(f As Boolean) As VueH";
 //BA.debugLineNum = 971;BA.debugLine="SetStyle(\"font-weight\", \"normal\")";
_setstyle("font-weight","normal");
 //BA.debugLineNum = 972;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 973;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleheight(Object _h) throws Exception{
 //BA.debugLineNum = 796;BA.debugLine="Sub SetStyleHeight(h As Object) As VueHTML";
 //BA.debugLineNum = 797;BA.debugLine="SetStyles(CreateMap(\"height\":h))";
_setstyles(__c.createMap(new Object[] {(Object)("height"),_h}));
 //BA.debugLineNum = 798;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 799;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleimportant(boolean _b) throws Exception{
 //BA.debugLineNum = 1268;BA.debugLine="Sub SetStyleImportant(b As Boolean) As VueHTML";
 //BA.debugLineNum = 1269;BA.debugLine="IsImportant = b";
_isimportant = _b;
 //BA.debugLineNum = 1270;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleletterspacing(Object _f) throws Exception{
 //BA.debugLineNum = 1003;BA.debugLine="Sub SetStyleLetterSpacing(f As Object) As VueHTML";
 //BA.debugLineNum = 1004;BA.debugLine="SetStyle(\"letter-spacing\", MakePx(f))";
_setstyle("letter-spacing",_makepx(BA.ObjectToString(_f)));
 //BA.debugLineNum = 1005;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1006;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylelineheight(Object _f) throws Exception{
 //BA.debugLineNum = 1018;BA.debugLine="Sub SetStyleLineHeight(f As Object) As VueHTML   '";
 //BA.debugLineNum = 1019;BA.debugLine="SetStyle(\"line-height\", f)";
_setstyle("line-height",BA.ObjectToString(_f));
 //BA.debugLineNum = 1020;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1021;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleliststylecircle() throws Exception{
 //BA.debugLineNum = 1585;BA.debugLine="Sub SetStyleListStyleCircle() As VueHTML";
 //BA.debugLineNum = 1586;BA.debugLine="SetStyle(\"list-style-type\",\"circle\")";
_setstyle("list-style-type","circle");
 //BA.debugLineNum = 1587;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1588;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleliststyledisk() throws Exception{
 //BA.debugLineNum = 1590;BA.debugLine="Sub SetStyleListStyleDisk() As VueHTML";
 //BA.debugLineNum = 1591;BA.debugLine="SetStyle(\"list-style-type\",\"disk\")";
_setstyle("list-style-type","disk");
 //BA.debugLineNum = 1592;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1593;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleliststylenone() throws Exception{
 //BA.debugLineNum = 1595;BA.debugLine="Sub SetStyleListStyleNone() As VueHTML";
 //BA.debugLineNum = 1596;BA.debugLine="SetStyle(\"list-style-type\",\"none\")";
_setstyle("list-style-type","none");
 //BA.debugLineNum = 1597;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1598;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleliststylesquare() throws Exception{
 //BA.debugLineNum = 1600;BA.debugLine="Sub SetStyleListStyleSquare() As VueHTML";
 //BA.debugLineNum = 1601;BA.debugLine="SetStyle(\"list-style-type\",\"square\")";
_setstyle("list-style-type","square");
 //BA.debugLineNum = 1602;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylemargin(String _marginbottom) throws Exception{
 //BA.debugLineNum = 1355;BA.debugLine="Sub SetStyleMargin(MarginBottom As String) As VueH";
 //BA.debugLineNum = 1356;BA.debugLine="SetStyle(\"margin\", MakePx(MarginBottom))";
_setstyle("margin",_makepx(_marginbottom));
 //BA.debugLineNum = 1357;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1358;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylemarginbottom(String _marginbottom) throws Exception{
 //BA.debugLineNum = 1361;BA.debugLine="Sub SetStyleMarginBottom(MarginBottom As String) A";
 //BA.debugLineNum = 1362;BA.debugLine="SetStyle(\"margin-bottom\", MakePx(MarginBottom))";
_setstyle("margin-bottom",_makepx(_marginbottom));
 //BA.debugLineNum = 1363;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylemarginleft(String _marginleft) throws Exception{
 //BA.debugLineNum = 1373;BA.debugLine="Sub SetStyleMarginLeft(MarginLeft As String) As Vu";
 //BA.debugLineNum = 1374;BA.debugLine="SetStyle(\"margin-left\", MakePx(MarginLeft))";
_setstyle("margin-left",_makepx(_marginleft));
 //BA.debugLineNum = 1375;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylemarginright(String _marginright) throws Exception{
 //BA.debugLineNum = 1367;BA.debugLine="Sub SetStyleMarginRight(MarginRight As String) As";
 //BA.debugLineNum = 1368;BA.debugLine="SetStyle(\"margin-right\", MakePx(MarginRight))";
_setstyle("margin-right",_makepx(_marginright));
 //BA.debugLineNum = 1369;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1370;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylemargintop(String _margintop) throws Exception{
 //BA.debugLineNum = 1379;BA.debugLine="Sub SetStyleMarginTop(MarginTop As String) As VueH";
 //BA.debugLineNum = 1380;BA.debugLine="SetStyle(\"margin-top\", MakePx(MarginTop))";
_setstyle("margin-top",_makepx(_margintop));
 //BA.debugLineNum = 1381;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1382;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleoutline(Object _c) throws Exception{
 //BA.debugLineNum = 1119;BA.debugLine="Sub SetStyleOutline(c As Object) As VueHTML";
 //BA.debugLineNum = 1120;BA.debugLine="SetStyle(\"outline\",c)";
_setstyle("outline",BA.ObjectToString(_c));
 //BA.debugLineNum = 1121;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleoutlinecolor(Object _bs) throws Exception{
 //BA.debugLineNum = 1130;BA.debugLine="Sub SetStyleOutlineColor(bs As Object) As VueHTML";
 //BA.debugLineNum = 1131;BA.debugLine="SetStyle(\"outline-color\",bs)";
_setstyle("outline-color",BA.ObjectToString(_bs));
 //BA.debugLineNum = 1132;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleoutlinestyle(Object _bs) throws Exception{
 //BA.debugLineNum = 1124;BA.debugLine="Sub SetStyleOutlineStyle(bs As Object) As VueHTML";
 //BA.debugLineNum = 1125;BA.debugLine="SetStyle(\"outline-style\",bs)";
_setstyle("outline-style",BA.ObjectToString(_bs));
 //BA.debugLineNum = 1126;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleoutlinewidth(Object _bs) throws Exception{
 //BA.debugLineNum = 1135;BA.debugLine="Sub SetStyleOutlineWidth(bs As Object) As VueHTML";
 //BA.debugLineNum = 1136;BA.debugLine="SetStyle(\"outline-width\",MakePx(bs))";
_setstyle("outline-width",_makepx(BA.ObjectToString(_bs)));
 //BA.debugLineNum = 1137;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylepadding(String _paddingbottom) throws Exception{
 //BA.debugLineNum = 1292;BA.debugLine="Sub SetStylePadding(PaddingBottom As String) As Vu";
 //BA.debugLineNum = 1293;BA.debugLine="SetStyle(\"padding\", MakePx(PaddingBottom))";
_setstyle("padding",_makepx(_paddingbottom));
 //BA.debugLineNum = 1294;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylepaddingbottom(String _paddingbottom) throws Exception{
 //BA.debugLineNum = 1298;BA.debugLine="Sub SetStylePaddingBottom(PaddingBottom As String)";
 //BA.debugLineNum = 1299;BA.debugLine="SetStyle(\"padding-bottom\", MakePx(PaddingBottom))";
_setstyle("padding-bottom",_makepx(_paddingbottom));
 //BA.debugLineNum = 1300;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylepaddingleft(String _paddingleft) throws Exception{
 //BA.debugLineNum = 1310;BA.debugLine="Sub SetStylePaddingLeft(PaddingLeft As String) As";
 //BA.debugLineNum = 1311;BA.debugLine="SetStyle(\"padding-left\", MakePx(PaddingLeft))";
_setstyle("padding-left",_makepx(_paddingleft));
 //BA.debugLineNum = 1312;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylepaddingright(String _paddingright) throws Exception{
 //BA.debugLineNum = 1304;BA.debugLine="Sub SetStylePaddingRight(PaddingRight As String) A";
 //BA.debugLineNum = 1305;BA.debugLine="SetStyle(\"padding-right\", MakePx(PaddingRight))";
_setstyle("padding-right",_makepx(_paddingright));
 //BA.debugLineNum = 1306;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylepaddingtop(String _paddingtop) throws Exception{
 //BA.debugLineNum = 1316;BA.debugLine="Sub SetStylePaddingTop(PaddingTop As String) As Vu";
 //BA.debugLineNum = 1317;BA.debugLine="SetStyle(\"padding-top\", MakePx(PaddingTop))";
_setstyle("padding-top",_makepx(_paddingtop));
 //BA.debugLineNum = 1318;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1319;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleround(String _size) throws Exception{
 //BA.debugLineNum = 736;BA.debugLine="Sub SetStyleRound(size As String) As VueHTML";
 //BA.debugLineNum = 737;BA.debugLine="If size = \"\" Then Return Me";
if ((_size).equals("")) { 
if (true) return (b4j.example.vuehtml)(this);};
 //BA.debugLineNum = 738;BA.debugLine="size = MakePx(size)";
_size = _makepx(_size);
 //BA.debugLineNum = 739;BA.debugLine="SetStyle(\"-moz-border-radius\", size)";
_setstyle("-moz-border-radius",_size);
 //BA.debugLineNum = 740;BA.debugLine="SetStyle(\"-webkit-border-radius\", size)";
_setstyle("-webkit-border-radius",_size);
 //BA.debugLineNum = 741;BA.debugLine="SetStyle(\"border-radius\", size)";
_setstyle("border-radius",_size);
 //BA.debugLineNum = 742;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 889;BA.debugLine="Sub SetStyles(m As Map) As VueHTML";
 //BA.debugLineNum = 890;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 891;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 892;BA.debugLine="AddStyle(k, v)";
_addstyle(_k,(Object)(_v));
 }
};
 //BA.debugLineNum = 894;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 895;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylesingle(String _prop,String _vals) throws Exception{
anywheresoftware.b4a.objects.collections.Map _attr = null;
 //BA.debugLineNum = 470;BA.debugLine="Sub SetStyleSingle(prop As String, vals As String)";
 //BA.debugLineNum = 471;BA.debugLine="Dim attr As Map = CreateMap()";
_attr = new anywheresoftware.b4a.objects.collections.Map();
_attr = __c.createMap(new Object[] {});
 //BA.debugLineNum = 472;BA.debugLine="attr.Put(prop, vals)";
_attr.Put((Object)(_prop),(Object)(_vals));
 //BA.debugLineNum = 473;BA.debugLine="SetStyles(attr)";
_setstyles(_attr);
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyletextaligncenter(boolean _f) throws Exception{
 //BA.debugLineNum = 987;BA.debugLine="Sub SetStyleTextAlignCenter(f As Boolean) As VueHT";
 //BA.debugLineNum = 988;BA.debugLine="SetStyle(\"text-align\", \"center\")";
_setstyle("text-align","center");
 //BA.debugLineNum = 989;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 990;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyletextdecoration(Object _f) throws Exception{
 //BA.debugLineNum = 1008;BA.debugLine="Sub SetStyleTextDecoration(f As Object) As VueHTML";
 //BA.debugLineNum = 1009;BA.debugLine="SetStyle(\"text-decoration\", f)";
_setstyle("text-decoration",BA.ObjectToString(_f));
 //BA.debugLineNum = 1010;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyletextindent(Object _f) throws Exception{
 //BA.debugLineNum = 993;BA.debugLine="Sub SetStyleTextIndent(f As Object) As VueHTML   '";
 //BA.debugLineNum = 994;BA.debugLine="SetStyle(\"text-indent\", MakePx(f))";
_setstyle("text-indent",_makepx(BA.ObjectToString(_f)));
 //BA.debugLineNum = 995;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 996;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyletextshadow(Object _f) throws Exception{
 //BA.debugLineNum = 1013;BA.debugLine="Sub SetStyleTextShadow(f As Object) As VueHTML   '";
 //BA.debugLineNum = 1014;BA.debugLine="SetStyle(\"text-shadow\", f)";
_setstyle("text-shadow",BA.ObjectToString(_f));
 //BA.debugLineNum = 1015;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1016;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyletexttransform(Object _f) throws Exception{
 //BA.debugLineNum = 998;BA.debugLine="Sub SetStyleTextTransform(f As Object) As VueHTML";
 //BA.debugLineNum = 999;BA.debugLine="SetStyle(\"text-transform\", f)";
_setstyle("text-transform",BA.ObjectToString(_f));
 //BA.debugLineNum = 1000;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1001;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstyleverticalalign(Object _f) throws Exception{
 //BA.debugLineNum = 1029;BA.debugLine="Sub SetStyleVerticalAlign(f As Object) As VueHTML";
 //BA.debugLineNum = 1030;BA.debugLine="SetStyle(\"vertical-align\", f)";
_setstyle("vertical-align",BA.ObjectToString(_f));
 //BA.debugLineNum = 1031;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1032;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylewhitespace(Object _f) throws Exception{
 //BA.debugLineNum = 1024;BA.debugLine="Sub SetStyleWhiteSpace(f As Object) As VueHTML   '";
 //BA.debugLineNum = 1025;BA.debugLine="SetStyle(\"white-space\", f)";
_setstyle("white-space",BA.ObjectToString(_f));
 //BA.debugLineNum = 1026;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylewidth(Object _h) throws Exception{
 //BA.debugLineNum = 802;BA.debugLine="Sub SetStyleWidth(h As Object) As VueHTML";
 //BA.debugLineNum = 803;BA.debugLine="SetStyles(CreateMap(\"width\":h))";
_setstyles(__c.createMap(new Object[] {(Object)("width"),_h}));
 //BA.debugLineNum = 804;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 805;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylewordspacing(Object _f) throws Exception{
 //BA.debugLineNum = 1039;BA.debugLine="Sub SetStyleWordSpacing(f As Object) As VueHTML";
 //BA.debugLineNum = 1040;BA.debugLine="SetStyle(\"word-spacing\", MakePx(f))";
_setstyle("word-spacing",_makepx(BA.ObjectToString(_f)));
 //BA.debugLineNum = 1041;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1042;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setstylezindex(String _zindex) throws Exception{
 //BA.debugLineNum = 1647;BA.debugLine="Sub SetStyleZIndex(zindex As String) As VueHTML";
 //BA.debugLineNum = 1648;BA.debugLine="SetStyle(\"z-index\",zindex)";
_setstyle("z-index",_zindex);
 //BA.debugLineNum = 1649;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1650;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 682;BA.debugLine="Sub SetTabIndex(ti As String) As VueHTML";
 //BA.debugLineNum = 683;BA.debugLine="SetAttr(\"tabindex\", ti)";
_setattr("tabindex",_ti);
 //BA.debugLineNum = 684;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 685;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settag(String _stag) throws Exception{
 //BA.debugLineNum = 1961;BA.debugLine="Sub SetTag(sTag As String) As VueHTML";
 //BA.debugLineNum = 1962;BA.debugLine="Tag = sTag.tolowercase";
_tag = _stag.toLowerCase();
 //BA.debugLineNum = 1963;BA.debugLine="If Tag = \"pre\" Then";
if ((_tag).equals("pre")) { 
 //BA.debugLineNum = 1964;BA.debugLine="AddClass(\"code-line\")";
_addclass("code-line");
 };
 //BA.debugLineNum = 1966;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1967;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settagspan(boolean _b) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetTagSpan(b As Boolean) As VueHTML";
 //BA.debugLineNum = 170;BA.debugLine="SetTag(\"span\")";
_settag("span");
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settemplate(Object _tmp) throws Exception{
 //BA.debugLineNum = 746;BA.debugLine="Sub SetTemplate(tmp As Object) As VueHTML";
 //BA.debugLineNum = 747;BA.debugLine="Clear";
_clear();
 //BA.debugLineNum = 748;BA.debugLine="SetText(tmp)";
_settext(BA.ObjectToString(_tmp));
 //BA.debugLineNum = 749;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 750;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settext(String _stext) throws Exception{
 //BA.debugLineNum = 1935;BA.debugLine="Sub SetText(sText As String) As VueHTML";
 //BA.debugLineNum = 1936;BA.debugLine="AddContent(sText)";
_addcontent(_stext);
 //BA.debugLineNum = 1937;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 1938;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settextaligncenter() throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="Sub SetTextAlignCenter As VueHTML";
 //BA.debugLineNum = 442;BA.debugLine="SetStyles(CreateMap(\"text-align\": \"center\"))";
_setstyles(__c.createMap(new Object[] {(Object)("text-align"),(Object)("center")}));
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settextcenter() throws Exception{
 //BA.debugLineNum = 506;BA.debugLine="Sub SetTextCenter As VueHTML";
 //BA.debugLineNum = 507;BA.debugLine="AddClass(\"text-center\")";
_addclass("text-center");
 //BA.debugLineNum = 508;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setto(Object _t) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetTo(t As Object) As VueHTML";
 //BA.debugLineNum = 233;BA.debugLine="SetAttr(\"to\", t)";
_setattr("to",BA.ObjectToString(_t));
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _settype(String _stypeof) throws Exception{
 //BA.debugLineNum = 415;BA.debugLine="Sub SetType(stypeOf As String) As VueHTML";
 //BA.debugLineNum = 416;BA.debugLine="SetAttr(\"type\", stypeOf)";
_setattr("type",_stypeof);
 //BA.debugLineNum = 417;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _seturl(String _u) throws Exception{
 //BA.debugLineNum = 724;BA.debugLine="Sub SetURL(u As String) As VueHTML";
 //BA.debugLineNum = 725;BA.debugLine="SetAttr(\"url\", u)";
_setattr("url",_u);
 //BA.debugLineNum = 726;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 727;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvalue(String _valuename,boolean _bbind) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub SetValue(valueName As String, bbind As Boolean";
 //BA.debugLineNum = 393;BA.debugLine="If bbind Then";
if (_bbind) { 
 //BA.debugLineNum = 394;BA.debugLine="RemoveAttr(\"value\")";
_removeattr("value");
 //BA.debugLineNum = 395;BA.debugLine="valueName = valueName.tolowercase";
_valuename = _valuename.toLowerCase();
 //BA.debugLineNum = 396;BA.debugLine="SetAttrs(CreateMap(\":value\":valueName))";
_setattrs(__c.createMap(new Object[] {(Object)(":value"),(Object)(_valuename)}));
 }else {
 //BA.debugLineNum = 398;BA.debugLine="value = valueName";
_value = _valuename;
 //BA.debugLineNum = 399;BA.debugLine="RemoveAttr(\":value\")";
_removeattr(":value");
 //BA.debugLineNum = 400;BA.debugLine="SetAttrs(CreateMap(\"value\":valueName))";
_setattrs(__c.createMap(new Object[] {(Object)("value"),(Object)(_valuename)}));
 };
 //BA.debugLineNum = 402;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvbind(String _t) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetVBind(t As String) As VueHTML";
 //BA.debugLineNum = 315;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 316;BA.debugLine="SetAttrs(CreateMap(\"v-bind\": t))";
_setattrs(__c.createMap(new Object[] {(Object)("v-bind"),(Object)(_t)}));
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvbindis(String _t) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetVBindIs(t As String) As VueHTML";
 //BA.debugLineNum = 321;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 322;BA.debugLine="SetAttrs(CreateMap(\"v-bind:is\": t))";
_setattrs(__c.createMap(new Object[] {(Object)("v-bind:is"),(Object)(_t)}));
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvcloak() throws Exception{
 //BA.debugLineNum = 677;BA.debugLine="Sub SetVCloak As VueHTML";
 //BA.debugLineNum = 678;BA.debugLine="SetAttr(\"v-cloak\", \"true\")";
_setattr("v-cloak","true");
 //BA.debugLineNum = 679;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 680;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvelse(Object _t) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub SetVElse(t As Object) As VueHTML";
 //BA.debugLineNum = 300;BA.debugLine="SetAttrs(CreateMap(\"v-else\": t))";
_setattrs(__c.createMap(new Object[] {(Object)("v-else"),_t}));
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvelseif(Object _t) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetVElseIf(t As Object) As VueHTML";
 //BA.debugLineNum = 305;BA.debugLine="SetAttrs(CreateMap(\"v-else-if\": t))";
_setattrs(__c.createMap(new Object[] {(Object)("v-else-if"),_t}));
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setverticalalignmiddle() throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetVerticalAlignMiddle As VueHTML";
 //BA.debugLineNum = 160;BA.debugLine="SetStyles(CreateMap(\"vertical-align\": \"middle\"))";
_setstyles(__c.createMap(new Object[] {(Object)("vertical-align"),(Object)("middle")}));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 333;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 334;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 335;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 336;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 337;BA.debugLine="SetAttrs(CreateMap(\"v-for\": sline))";
_setattrs(__c.createMap(new Object[] {(Object)("v-for"),(Object)(_sline)}));
 //BA.debugLineNum = 338;BA.debugLine="RemoveAttr(\"ref\")";
_removeattr("ref");
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvhtml(String _h) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetVHtml(h As String) As VueHTML";
 //BA.debugLineNum = 350;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vuehtml)(this);};
 //BA.debugLineNum = 351;BA.debugLine="h = h.tolowercase";
_h = _h.toLowerCase();
 //BA.debugLineNum = 352;BA.debugLine="SetAttr(\"v-html\", h)";
_setattr("v-html",_h);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 785;BA.debugLine="Sub SetVIf(vif As String) As VueHTML";
 //BA.debugLineNum = 786;BA.debugLine="SetAttr(\"v-if\", vif)";
_setattr("v-if",_vif);
 //BA.debugLineNum = 787;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 788;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvlazy(Object _varlazyload) throws Exception{
 //BA.debugLineNum = 911;BA.debugLine="Sub SetVLazy(varLazyLoad As Object) As VueHTML";
 //BA.debugLineNum = 912;BA.debugLine="SetAttr(\"v-lazy\", varLazyLoad)";
_setattr("v-lazy",BA.ObjectToString(_varlazyload));
 //BA.debugLineNum = 913;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetVModel(k As String) As VueHTML";
 //BA.debugLineNum = 184;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 185;BA.debugLine="vmodel = k";
_vmodel = _k;
 //BA.debugLineNum = 186;BA.debugLine="AddAttribute(\"v-model\", k)";
_addattribute("v-model",_k);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvon(Object _t) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub SetVOn(t As Object) As VueHTML";
 //BA.debugLineNum = 310;BA.debugLine="SetAttrs(CreateMap(\"v-on\": t))";
_setattrs(__c.createMap(new Object[] {(Object)("v-on"),_t}));
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetVOnce(t As Boolean) As VueHTML";
 //BA.debugLineNum = 327;BA.debugLine="If t = False Then Return Me";
if (_t==__c.False) { 
if (true) return (b4j.example.vuehtml)(this);};
 //BA.debugLineNum = 328;BA.debugLine="SetAttrLoose(\"v-once\")";
_setattrloose("v-once");
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 790;BA.debugLine="Sub SetVShow(vif As String) As VueHTML";
 //BA.debugLineNum = 791;BA.debugLine="SetAttr(\"v-show\", vif)";
_setattr("v-show",_vif);
 //BA.debugLineNum = 792;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _setvtext(Object _t) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub SetVText(t As Object) As VueHTML";
 //BA.debugLineNum = 295;BA.debugLine="SetAttrs(CreateMap(\"v-text\": t))";
_setattrs(__c.createMap(new Object[] {(Object)("v-text"),_t}));
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _shufflelist(anywheresoftware.b4a.objects.collections.List _pl) throws Exception{
int _i = 0;
int _j = 0;
Object _k = null;
 //BA.debugLineNum = 855;BA.debugLine="Sub ShuffleList(pl As List) As List";
 //BA.debugLineNum = 856;BA.debugLine="For i = pl.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_pl.getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 857;BA.debugLine="Dim j As Int";
_j = 0;
 //BA.debugLineNum = 858;BA.debugLine="Dim k As Object";
_k = new Object();
 //BA.debugLineNum = 859;BA.debugLine="j = Rnd(0, i + 1)";
_j = __c.Rnd((int) (0),(int) (_i+1));
 //BA.debugLineNum = 860;BA.debugLine="k = pl.Get(j)";
_k = _pl.Get(_j);
 //BA.debugLineNum = 861;BA.debugLine="pl.Set(j,pl.Get(i))";
_pl.Set(_j,_pl.Get(_i));
 //BA.debugLineNum = 862;BA.debugLine="pl.Set(i,k)";
_pl.Set(_i,_k);
 }
};
 //BA.debugLineNum = 864;BA.debugLine="Return pl";
if (true) return _pl;
 //BA.debugLineNum = 865;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _strparse(String _delim,String _inputstring) throws Exception{
String[] _values = null;
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 2622;BA.debugLine="Sub StrParse(delim As String, inputString As Strin";
 //BA.debugLineNum = 2623;BA.debugLine="Dim values() As String = BANano.Split(delim,input";
_values = _banano.Split(_delim,_inputstring);
 //BA.debugLineNum = 2624;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2625;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 2626;BA.debugLine="nl.AddAll(values)";
_nl.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(_values));
 //BA.debugLineNum = 2627;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 2628;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _strparse1(String _delim,String _inputstring) throws Exception{
anywheresoftware.b4a.objects.collections.List _outlist = null;
int _commaloc = 0;
String _leftside = "";
String _rightside = "";
 //BA.debugLineNum = 2631;BA.debugLine="private Sub StrParse1(Delim As String, InputString";
 //BA.debugLineNum = 2632;BA.debugLine="Dim OutList As List";
_outlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2633;BA.debugLine="Dim CommaLoc As Int";
_commaloc = 0;
 //BA.debugLineNum = 2634;BA.debugLine="OutList.Initialize";
_outlist.Initialize();
 //BA.debugLineNum = 2635;BA.debugLine="OutList.clear";
_outlist.Clear();
 //BA.debugLineNum = 2636;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
_commaloc = _inputstring.indexOf(_delim);
 //BA.debugLineNum = 2637;BA.debugLine="Do While CommaLoc >-1";
while (_commaloc>-1) {
 //BA.debugLineNum = 2638;BA.debugLine="Dim LeftSide As String";
_leftside = "";
 //BA.debugLineNum = 2639;BA.debugLine="LeftSide= InputString.SubString2(0,CommaLoc)";
_leftside = _inputstring.substring((int) (0),_commaloc);
 //BA.debugLineNum = 2640;BA.debugLine="Dim RightSide As String";
_rightside = "";
 //BA.debugLineNum = 2641;BA.debugLine="RightSide= InputString.SubString(CommaLoc+1)";
_rightside = _inputstring.substring((int) (_commaloc+1));
 //BA.debugLineNum = 2642;BA.debugLine="OutList.Add(LeftSide)";
_outlist.Add((Object)(_leftside));
 //BA.debugLineNum = 2643;BA.debugLine="InputString=RightSide";
_inputstring = _rightside;
 //BA.debugLineNum = 2644;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
_commaloc = _inputstring.indexOf(_delim);
 }
;
 //BA.debugLineNum = 2646;BA.debugLine="OutList.Add(InputString)";
_outlist.Add((Object)(_inputstring));
 //BA.debugLineNum = 2647;BA.debugLine="Return OutList";
if (true) return _outlist;
 //BA.debugLineNum = 2648;BA.debugLine="End Sub";
return null;
}
public String  _toproperty(String _sname,Object _svalue) throws Exception{
String _script = "";
 //BA.debugLineNum = 2094;BA.debugLine="private Sub ToProperty(sName As String, svalue As";
 //BA.debugLineNum = 2095;BA.debugLine="sName = CStr(sName)";
_sname = _cstr((Object)(_sname));
 //BA.debugLineNum = 2096;BA.debugLine="sName = sName.Trim";
_sname = _sname.trim();
 //BA.debugLineNum = 2097;BA.debugLine="Dim script As String = \"\"";
_script = "";
 //BA.debugLineNum = 2098;BA.debugLine="If sName.Length > 0 Then";
if (_sname.length()>0) { 
 //BA.debugLineNum = 2099;BA.debugLine="script = $\"${sName}=\"${svalue}\"\"$";
_script = (""+__c.SmartStringFormatter("",(Object)(_sname))+"=\""+__c.SmartStringFormatter("",_svalue)+"\"");
 //BA.debugLineNum = 2100;BA.debugLine="script = script.trim";
_script = _script.trim();
 //BA.debugLineNum = 2101;BA.debugLine="Return script";
if (true) return _script;
 }else {
 //BA.debugLineNum = 2103;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 2105;BA.debugLine="End Sub";
return "";
}
public String  _tosinglequoteproperty(String _sname,Object _svalue) throws Exception{
String _script = "";
 //BA.debugLineNum = 2447;BA.debugLine="private Sub ToSingleQuoteProperty(sName As String,";
 //BA.debugLineNum = 2448;BA.debugLine="sName = CStr(sName)";
_sname = _cstr((Object)(_sname));
 //BA.debugLineNum = 2449;BA.debugLine="sName = sName.Trim";
_sname = _sname.trim();
 //BA.debugLineNum = 2450;BA.debugLine="If sName.Length > 0 Then";
if (_sname.length()>0) { 
 //BA.debugLineNum = 2451;BA.debugLine="Dim script As String = $\"${sName}='${svalue}'\"$";
_script = (""+__c.SmartStringFormatter("",(Object)(_sname))+"='"+__c.SmartStringFormatter("",_svalue)+"'");
 //BA.debugLineNum = 2452;BA.debugLine="script = script.trim";
_script = _script.trim();
 //BA.debugLineNum = 2453;BA.debugLine="Return script";
if (true) return _script;
 }else {
 //BA.debugLineNum = 2455;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 2457;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
String _imgurl = "";
String _lnk = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _strcontent = "";
String _sout = "";
 //BA.debugLineNum = 2690;BA.debugLine="public Sub ToString As String";
 //BA.debugLineNum = 2691;BA.debugLine="If DesignMode Then";
if (_designmode) { 
 //BA.debugLineNum = 2692;BA.debugLine="RemoveAttributes(Array(\"v-show\", \":disabled\", \":";
_removeattributes(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("v-show"),(Object)(":disabled"),(Object)(":required"),(Object)(":class"),(Object)("v-model"),(Object)("tabindex"),(Object)(":style")}));
 };
 //BA.debugLineNum = 2694;BA.debugLine="If ParentID <> \"\" Then";
if ((_parentid).equals("") == false) { 
 //BA.debugLineNum = 2695;BA.debugLine="ID = ParentID & ID";
_id = _parentid+_id;
 };
 //BA.debugLineNum = 2697;BA.debugLine="Select Case Tag";
switch (BA.switchObjectToInt(_tag,"img","script","link")) {
case 0: 
case 1: {
 //BA.debugLineNum = 2700;BA.debugLine="Dim imgURL As String = GetAttr(\"src\")";
_imgurl = BA.ObjectToString(_getattr("src"));
 //BA.debugLineNum = 2701;BA.debugLine="If imgURL.Length > 0 Then";
if (_imgurl.length()>0) { 
 //BA.debugLineNum = 2702;BA.debugLine="imgURL = imgURL.tolowercase";
_imgurl = _imgurl.toLowerCase();
 };
 break; }
case 2: {
 //BA.debugLineNum = 2705;BA.debugLine="Dim lnk As String = GetAttr(\"href\")";
_lnk = BA.ObjectToString(_getattr("href"));
 //BA.debugLineNum = 2706;BA.debugLine="If lnk.Length > 0 Then";
if (_lnk.length()>0) { 
 //BA.debugLineNum = 2707;BA.debugLine="lnk = lnk.tolowercase";
_lnk = _lnk.toLowerCase();
 };
 break; }
}
;
 //BA.debugLineNum = 2710;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2711;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2712;BA.debugLine="sb.Append(SBBefore)";
_sb.Append(BA.ObjectToString(_sbbefore));
 //BA.debugLineNum = 2713;BA.debugLine="sb.Append(Open)";
_sb.Append(_open());
 //BA.debugLineNum = 2714;BA.debugLine="For Each strContent As String In Contents";
{
final anywheresoftware.b4a.BA.IterableList group23 = _contents;
final int groupLen23 = group23.getSize()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_strcontent = BA.ObjectToString(group23.Get(index23));
 //BA.debugLineNum = 2715;BA.debugLine="If strContent.Length > 0 Then";
if (_strcontent.length()>0) { 
 //BA.debugLineNum = 2716;BA.debugLine="strContent = strContent.trim";
_strcontent = _strcontent.trim();
 //BA.debugLineNum = 2717;BA.debugLine="sb.Append(strContent.trim)";
_sb.Append(_strcontent.trim());
 };
 }
};
 //BA.debugLineNum = 2720;BA.debugLine="sb.Append(Close)";
_sb.Append(_close());
 //BA.debugLineNum = 2721;BA.debugLine="Dim sout As String = sb.ToString";
_sout = _sb.ToString();
 //BA.debugLineNum = 2722;BA.debugLine="If DontBreak.IndexOf(Tag) <> -1 Then";
if (_dontbreak.IndexOf((Object)(_tag))!=-1) { 
 //BA.debugLineNum = 2723;BA.debugLine="sout = sout.Replace(CRLF,\"\")";
_sout = _sout.replace(__c.CRLF,"");
 };
 //BA.debugLineNum = 2726;BA.debugLine="sout = sout & SBAfter.tostring";
_sout = _sout+_sbafter.ToString();
 //BA.debugLineNum = 2727;BA.debugLine="sout = sout.Replace(CRLF,\"\")";
_sout = _sout.replace(__c.CRLF,"");
 //BA.debugLineNum = 2728;BA.debugLine="sout = sout.Replace(\"  >\",\">\")";
_sout = _sout.replace("  >",">");
 //BA.debugLineNum = 2729;BA.debugLine="sout = sout.Replace(\" >\",\">\")";
_sout = _sout.replace(" >",">");
 //BA.debugLineNum = 2730;BA.debugLine="sout = FormatText(sout)";
_sout = _formattext(_sout);
 //BA.debugLineNum = 2731;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 2732;BA.debugLine="End Sub";
return "";
}
public String  _tostyle(String _sname,String _svalue) throws Exception{
boolean _ew = false;
String _sout = "";
 //BA.debugLineNum = 2234;BA.debugLine="private Sub ToStyle(sName As String, svalue As Str";
 //BA.debugLineNum = 2235;BA.debugLine="If sName.Length > 0 And svalue.Length > 0 Then";
if (_sname.length()>0 && _svalue.length()>0) { 
 //BA.debugLineNum = 2236;BA.debugLine="Dim ew As Boolean = sName.EndsWith(\":\")";
_ew = _sname.endsWith(":");
 //BA.debugLineNum = 2237;BA.debugLine="If ew Then";
if (_ew) { 
 //BA.debugLineNum = 2238;BA.debugLine="sName = MvField(sName,1,\":\")";
_sname = _mvfield(_sname,(int) (1),":");
 };
 //BA.debugLineNum = 2240;BA.debugLine="Dim sout As String = $\"${sName}:${svalue};\"$";
_sout = (""+__c.SmartStringFormatter("",(Object)(_sname))+":"+__c.SmartStringFormatter("",(Object)(_svalue))+";");
 //BA.debugLineNum = 2241;BA.debugLine="If sout = \":;\" Then sout = \"\"";
if ((_sout).equals(":;")) { 
_sout = "";};
 //BA.debugLineNum = 2242;BA.debugLine="Return sout";
if (true) return _sout;
 }else {
 //BA.debugLineNum = 2244;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 2246;BA.debugLine="End Sub";
return "";
}
public b4j.example.vuehtml  _updateattribute(String _name,Object _propvalue) throws Exception{
Object _svalue = null;
 //BA.debugLineNum = 1720;BA.debugLine="Sub UpdateAttribute(name As String, propValue As O";
 //BA.debugLineNum = 1721;BA.debugLine="If properties.ContainsKey(name) Then";
if (_properties.ContainsKey((Object)(_name))) { 
 //BA.debugLineNum = 1722;BA.debugLine="Dim svalue As Object = properties.Get(name)";
_svalue = _properties.Get((Object)(_name));
 //BA.debugLineNum = 1723;BA.debugLine="svalue = svalue & \";\" & propValue";
_svalue = (Object)(BA.ObjectToString(_svalue)+";"+BA.ObjectToString(_propvalue));
 //BA.debugLineNum = 1724;BA.debugLine="properties.Put(name,svalue)";
_properties.Put((Object)(_name),_svalue);
 }else {
 //BA.debugLineNum = 1726;BA.debugLine="properties.Put(name,propValue)";
_properties.Put((Object)(_name),_propvalue);
 };
 //BA.debugLineNum = 1728;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1729;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _usetheme(String _sprefix,String _themename) throws Exception{
 //BA.debugLineNum = 1384;BA.debugLine="Sub UseTheme(sPrefix As String, themeName As Strin";
 //BA.debugLineNum = 1385;BA.debugLine="If themeName = \"\" Then Return Me";
if ((_themename).equals("")) { 
if (true) return (b4j.example.vuehtml)(this);};
 //BA.debugLineNum = 1386;BA.debugLine="themeName = themeName.tolowercase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 1387;BA.debugLine="If sPrefix <> \"\" And themeName <> \"\" Then";
if ((_sprefix).equals("") == false && (_themename).equals("") == false) { 
 //BA.debugLineNum = 1388;BA.debugLine="AddClass($\"${sPrefix}-${themeName}\"$)";
_addclass((""+__c.SmartStringFormatter("",(Object)(_sprefix))+"-"+__c.SmartStringFormatter("",(Object)(_themename))+""));
 };
 //BA.debugLineNum = 1390;BA.debugLine="Return Me";
if (true) return (b4j.example.vuehtml)(this);
 //BA.debugLineNum = 1391;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _wrap(String _wid,String _wraptype) throws Exception{
b4j.example.vuehtml _p = null;
 //BA.debugLineNum = 929;BA.debugLine="Sub Wrap(wid As String, wrapType As String) As Vue";
 //BA.debugLineNum = 930;BA.debugLine="Dim p As VueHTML";
_p = new b4j.example.vuehtml();
 //BA.debugLineNum = 931;BA.debugLine="p.Initialize(wid,wrapType)";
_p._initialize /*b4j.example.vuehtml*/ (ba,_wid,_wraptype);
 //BA.debugLineNum = 932;BA.debugLine="p.AddContent(HTML)";
_p._addcontent /*b4j.example.vuehtml*/ (_html());
 //BA.debugLineNum = 933;BA.debugLine="Return p";
if (true) return _p;
 //BA.debugLineNum = 934;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
