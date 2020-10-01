package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmelement extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmelement", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmelement.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vuehtml _element = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _hascontent = false;
public String _showkey = "";
public String _diskey = "";
public String _reqkey = "";
public String _errkey = "";
public String _stylekey = "";
public boolean _designmode = false;
public boolean _busesstyles = false;
public boolean _busesrequired = false;
public boolean _buseddisabled = false;
public boolean _busesshow = false;
public boolean _busesvmodel = false;
public boolean _busesclass = false;
public String _errormessage = "";
public String _r = "";
public String _c = "";
public String _os = "";
public String _om = "";
public String _ol = "";
public String _ox = "";
public String _ss = "";
public String _sm = "";
public String _sl = "";
public String _sx = "";
public String _mt = "";
public String _mb = "";
public String _ml = "";
public String _mr = "";
public String _pt = "";
public String _pb = "";
public String _pl = "";
public String _pr = "";
public String _fieldtype = "";
public String _typeof = "";
public String _inputtype = "";
public String _template = "";
public boolean _isvisible = false;
public boolean _isdisabled = false;
public boolean _isrequired = false;
public boolean _isarray = false;
public boolean _isexcluded = false;
public String _actualid = "";
public String _host = "";
public boolean _exclude = false;
public String _vmodel = "";
public Object _uncheckedvalue = null;
public Object _value = null;
public boolean _bstatic = false;
public boolean _centeronparent = false;
public anywheresoftware.b4a.objects.collections.List _classlist = null;
public String _classkey = "";
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
public b4j.example.vmelement  _addattr(String _attr,String _attrvalue) throws Exception{
 //BA.debugLineNum = 1525;BA.debugLine="Sub AddAttr(attr As String, attrValue As String) A";
 //BA.debugLineNum = 1526;BA.debugLine="SetAttrSingle(attr, attrValue)";
_setattrsingle(_attr,_attrvalue);
 //BA.debugLineNum = 1527;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1528;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addattributes(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1545;BA.debugLine="Sub AddAttributes(m As Map) As VMElement";
 //BA.debugLineNum = 1546;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1547;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 1548;BA.debugLine="SetAttrSingle(k, v)";
_setattrsingle(_k,BA.ObjectToString(_v));
 }
};
 //BA.debugLineNum = 1550;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1551;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addbr() throws Exception{
 //BA.debugLineNum = 872;BA.debugLine="Sub AddBR As VMElement";
 //BA.debugLineNum = 873;BA.debugLine="SetText(\"<br>\")";
_settext("<br>");
 //BA.debugLineNum = 874;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 875;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 997;BA.debugLine="Sub AddChild(child As VMElement) As VMElement";
 //BA.debugLineNum = 998;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 999;BA.debugLine="SetText(childHTML)";
_settext(_childhtml);
 //BA.debugLineNum = 1000;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1001;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addchilddiv(String _divid,String _divclass) throws Exception{
b4j.example.vmelement _childdiv = null;
 //BA.debugLineNum = 441;BA.debugLine="Sub AddChildDiv(divID As String, divClass As Strin";
 //BA.debugLineNum = 442;BA.debugLine="Dim childDiv As VMElement";
_childdiv = new b4j.example.vmelement();
 //BA.debugLineNum = 443;BA.debugLine="childDiv.Initialize(vue, divID).AddClass(divClass";
_childdiv._initialize /*b4j.example.vmelement*/ (ba,_vue,_divid)._addclass /*b4j.example.vmelement*/ (_divclass);
 //BA.debugLineNum = 444;BA.debugLine="childDiv.SetDesignMode(DesignMode)";
_childdiv._setdesignmode /*b4j.example.vmelement*/ (_designmode);
 //BA.debugLineNum = 445;BA.debugLine="AddChild(childDiv)";
_addchild(_childdiv);
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 1004;BA.debugLine="Sub AddChildren(children As List) As VMElement";
 //BA.debugLineNum = 1005;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 1006;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 1008;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1009;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addclass(String _classname) throws Exception{
 //BA.debugLineNum = 884;BA.debugLine="Sub AddClass(className As String) As VMElement";
 //BA.debugLineNum = 885;BA.debugLine="Element.AddClass(className)";
_element._addclass /*b4j.example.vuehtml*/ (_classname);
 //BA.debugLineNum = 886;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 887;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 888;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addclassdynamic(String _classname) throws Exception{
 //BA.debugLineNum = 911;BA.debugLine="Sub AddClassDynamic(className As String) As VMElem";
 //BA.debugLineNum = 912;BA.debugLine="AddDynamicClass(className)";
_adddynamicclass(_classname);
 //BA.debugLineNum = 913;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 1192;BA.debugLine="Sub AddComponent(comp As String) As VMElement";
 //BA.debugLineNum = 1193;BA.debugLine="SetText(comp)";
_settext(_comp);
 //BA.debugLineNum = 1194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addcontentlist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub AddContentList(lst As List) As VMElement";
 //BA.debugLineNum = 336;BA.debugLine="Element.AddContentList(lst)";
_element._addcontentlist /*b4j.example.vuehtml*/ (_lst);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _adddivider() throws Exception{
String _strline = "";
 //BA.debugLineNum = 356;BA.debugLine="Sub AddDivider As VMElement";
 //BA.debugLineNum = 357;BA.debugLine="Dim strLine As String = $\"<v-divider></v-divider>";
_strline = ("<v-divider></v-divider>");
 //BA.debugLineNum = 358;BA.debugLine="SetText(strLine)";
_settext(_strline);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _adddynamicclass(String _classname) throws Exception{
int _cpos = 0;
 //BA.debugLineNum = 891;BA.debugLine="Sub AddDynamicClass(className As String) As VMElem";
 //BA.debugLineNum = 892;BA.debugLine="If vue.hasstate(classKey) = False Then";
if (_vue._hasstate /*boolean*/ (_classkey)==__c.False) { 
 //BA.debugLineNum = 893;BA.debugLine="vue.SetData(classKey, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_classkey,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 };
 //BA.debugLineNum = 895;BA.debugLine="classList = vue.GetData(classKey)";
_classlist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ (_classkey)));
 //BA.debugLineNum = 896;BA.debugLine="Dim cpos As Int = classList.IndexOf(className)";
_cpos = _classlist.IndexOf((Object)(_classname));
 //BA.debugLineNum = 897;BA.debugLine="cpos = BANano.parseInt(cpos)";
_cpos = _banano.parseInt((Object)(_cpos));
 //BA.debugLineNum = 898;BA.debugLine="If cpos = -1 Then classList.Add(className)";
if (_cpos==-1) { 
_classlist.Add((Object)(_classname));};
 //BA.debugLineNum = 899;BA.debugLine="vue.SetData(classKey, classList)";
_vue._setdata /*b4j.example.bananovue*/ (_classkey,(Object)(_classlist.getObject()));
 //BA.debugLineNum = 900;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 901;BA.debugLine="bUsesClass = True";
_busesclass = __c.True;
 //BA.debugLineNum = 902;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 903;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addelement(b4j.example.vmelement _el) throws Exception{
 //BA.debugLineNum = 1181;BA.debugLine="Sub AddElement(el As VMElement) As VMElement";
 //BA.debugLineNum = 1182;BA.debugLine="SetText(el.ToString)";
_settext(_el._tostring /*String*/ ());
 //BA.debugLineNum = 1183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addelement1(String _eltag,String _elid,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 193;BA.debugLine="Sub AddElement1(elTag As String, elID As String, e";
 //BA.debugLineNum = 194;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 195;BA.debugLine="d.Initialize(vue, elID).SetTag(elTag)";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 196;BA.debugLine="d.SetStatic(bStatic)";
_d._setstatic /*b4j.example.vmelement*/ (_bstatic);
 //BA.debugLineNum = 197;BA.debugLine="d.SetDesignMode(DesignMode)";
_d._setdesignmode /*b4j.example.vmelement*/ (_designmode);
 //BA.debugLineNum = 198;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, loose)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 199;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 200;BA.debugLine="SetText(d.ToString)";
_settext(_d._tostring /*String*/ ());
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addelements(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
b4j.example.vmelement _li = null;
 //BA.debugLineNum = 1174;BA.debugLine="Sub AddElements(lst As List) As VMElement";
 //BA.debugLineNum = 1175;BA.debugLine="For Each li As VMElement In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_li = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 1176;BA.debugLine="SetText(li.tostring)";
_settext(_li._tostring /*String*/ ());
 }
};
 //BA.debugLineNum = 1178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addhr() throws Exception{
 //BA.debugLineNum = 878;BA.debugLine="Sub AddHR As VMElement";
 //BA.debugLineNum = 879;BA.debugLine="SetText(\"<hr>\")";
_settext("<hr>");
 //BA.debugLineNum = 880;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 881;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addoffsets(String _soffsetsmall,String _soffsetmedium,String _soffsetlarge,String _soffsetxlarge) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub AddOffsets(sOffsetSmall As String, sOffsetMedi";
 //BA.debugLineNum = 253;BA.debugLine="AddAttr(\"offset-sm\", sOffsetSmall)";
_addattr("offset-sm",_soffsetsmall);
 //BA.debugLineNum = 254;BA.debugLine="AddAttr(\"offset-xl\", sOffsetXLarge)";
_addattr("offset-xl",_soffsetxlarge);
 //BA.debugLineNum = 255;BA.debugLine="AddAttr(\"offset-md\", sOffsetMedium)";
_addattr("offset-md",_soffsetmedium);
 //BA.debugLineNum = 256;BA.debugLine="AddAttr(\"offset-lg\", sOffsetLarge)";
_addattr("offset-lg",_soffsetlarge);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addsizes(String _ssizesmall,String _ssizemedium,String _ssizelarge,String _ssizexlarge) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub AddSizes(sSizeSmall As String, sSizeMedium As";
 //BA.debugLineNum = 244;BA.debugLine="AddAttr(\"sm\", sSizeSmall)";
_addattr("sm",_ssizesmall);
 //BA.debugLineNum = 245;BA.debugLine="AddAttr(\"xl\", sSizeXLarge)";
_addattr("xl",_ssizexlarge);
 //BA.debugLineNum = 246;BA.debugLine="AddAttr(\"md\", sSizeMedium)";
_addattr("md",_ssizemedium);
 //BA.debugLineNum = 247;BA.debugLine="AddAttr(\"lg\", sSizeLarge)";
_addattr("lg",_ssizelarge);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addspace() throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub AddSpace() As VMElement";
 //BA.debugLineNum = 165;BA.debugLine="SetText(\"{NBSP}\")";
_settext("{NBSP}");
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addspacer() throws Exception{
String _strline = "";
 //BA.debugLineNum = 362;BA.debugLine="Sub AddSpacer As VMElement";
 //BA.debugLineNum = 363;BA.debugLine="Dim strLine As String = $\"<v-spacer></v-spacer>\"$";
_strline = ("<v-spacer></v-spacer>");
 //BA.debugLineNum = 364;BA.debugLine="SetText(strLine)";
_settext(_strline);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addstyle(String _stylename,String _stylevalue) throws Exception{
 //BA.debugLineNum = 1530;BA.debugLine="Sub AddStyle(styleName As String, styleValue As St";
 //BA.debugLineNum = 1531;BA.debugLine="SetStyleSingle(styleName, styleValue)";
_setstylesingle(_stylename,(Object)(_stylevalue));
 //BA.debugLineNum = 1532;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1533;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addstyles(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1536;BA.debugLine="Sub AddStyles(m As Map) As VMElement";
 //BA.debugLineNum = 1537;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1538;BA.debugLine="Dim v As String = m.Get(k)";
_v = BA.ObjectToString(_m.Get((Object)(_k)));
 //BA.debugLineNum = 1539;BA.debugLine="AddStyle(k,v)";
_addstyle(_k,_v);
 }
};
 //BA.debugLineNum = 1541;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1542;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addsubheader(String _text) throws Exception{
String _strline = "";
 //BA.debugLineNum = 340;BA.debugLine="Sub AddSubHeader(Text As String) As VMElement";
 //BA.debugLineNum = 341;BA.debugLine="Dim strLine As String = $\"<v-subheader>${Text}</v";
_strline = ("<v-subheader>"+__c.SmartStringFormatter("",(Object)(_text))+"</v-subheader>");
 //BA.debugLineNum = 342;BA.debugLine="SetText(strLine)";
_settext(_strline);
 //BA.debugLineNum = 343;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 1440;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 1441;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 1442;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _addtoparent(b4j.example.vmelement _parent) throws Exception{
 //BA.debugLineNum = 1520;BA.debugLine="Sub AddToParent(parent As VMElement) As VMElement";
 //BA.debugLineNum = 1521;BA.debugLine="parent.SetText(ToString)";
_parent._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 1522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _addverticaldivider(String _classname) throws Exception{
b4j.example.vmelement _elx = null;
 //BA.debugLineNum = 346;BA.debugLine="Sub AddVerticalDivider(className As String) As VME";
 //BA.debugLineNum = 348;BA.debugLine="Dim elx As VMElement";
_elx = new b4j.example.vmelement();
 //BA.debugLineNum = 349;BA.debugLine="elx.Initialize(vue, \"\").SetTag(\"v-divider\")";
_elx._initialize /*b4j.example.vmelement*/ (ba,_vue,"")._settag /*b4j.example.vmelement*/ ("v-divider");
 //BA.debugLineNum = 350;BA.debugLine="elx.AddAttr(\"vertical\", True)";
_elx._addattr /*b4j.example.vmelement*/ ("vertical",BA.ObjectToString(__c.True));
 //BA.debugLineNum = 351;BA.debugLine="elx.AddClass(className)";
_elx._addclass /*b4j.example.vmelement*/ (_classname);
 //BA.debugLineNum = 352;BA.debugLine="SetText(elx.ToString)";
_settext(_elx._tostring /*String*/ ());
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 1135;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 1136;BA.debugLine="prop = prop.tolowercase";
_prop = _prop.toLowerCase();
 //BA.debugLineNum = 1137;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 1138;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 1140;BA.debugLine="Select Case prop";
switch (BA.switchObjectToInt(_prop,":disabled",":required")) {
case 0: {
 //BA.debugLineNum = 1142;BA.debugLine="bUsedDisabled = True";
_buseddisabled = __c.True;
 break; }
case 1: {
 //BA.debugLineNum = 1144;BA.debugLine="bUsesRequired = True";
_busesrequired = __c.True;
 break; }
}
;
 //BA.debugLineNum = 1146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _bindclass(String _classname) throws Exception{
 //BA.debugLineNum = 905;BA.debugLine="Sub BindClass(className As String) As VMElement";
 //BA.debugLineNum = 906;BA.debugLine="AddDynamicClass(className)";
_adddynamicclass(_classname);
 //BA.debugLineNum = 907;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 908;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _binddynamiccomponent(String _viewid,String _compid) throws Exception{
 //BA.debugLineNum = 747;BA.debugLine="Sub BindDynamicComponent(viewID As String, compID";
 //BA.debugLineNum = 748;BA.debugLine="viewID = viewID.ToLowerCase";
_viewid = _viewid.toLowerCase();
 //BA.debugLineNum = 749;BA.debugLine="compID = compID.tolowercase";
_compid = _compid.toLowerCase();
 //BA.debugLineNum = 750;BA.debugLine="SetVBindIs(viewID)";
_setvbindis(_viewid);
 //BA.debugLineNum = 751;BA.debugLine="vue.SetData(viewID, compID)";
_vue._setdata /*b4j.example.bananovue*/ (_viewid,(Object)(_compid));
 //BA.debugLineNum = 752;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _bindstyle(anywheresoftware.b4a.objects.collections.Map _optm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
anywheresoftware.b4a.objects.collections.Map _smp = null;
anywheresoftware.b4a.objects.collections.Map _oldm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 845;BA.debugLine="Sub BindStyle(optm As Map) As VMElement";
 //BA.debugLineNum = 846;BA.debugLine="If ID = \"\" Then Return Me";
if ((_id).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 847;BA.debugLine="bUsesStyles = True";
_busesstyles = __c.True;
 //BA.debugLineNum = 848;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 849;BA.debugLine="If vue.HasState(styleKey) = False Then";
if (_vue._hasstate /*boolean*/ (_stylekey)==__c.False) { 
 //BA.debugLineNum = 850;BA.debugLine="Dim SMp As Map = CreateMap()";
_smp = new anywheresoftware.b4a.objects.collections.Map();
_smp = __c.createMap(new Object[] {});
 //BA.debugLineNum = 851;BA.debugLine="vue.SetData(styleKey, SMp)";
_vue._setdata /*b4j.example.bananovue*/ (_stylekey,(Object)(_smp.getObject()));
 };
 //BA.debugLineNum = 853;BA.debugLine="Dim oldm As Map = vue.GetState(styleKey, nm)";
_oldm = new anywheresoftware.b4a.objects.collections.Map();
_oldm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_vue._getstate /*Object*/ (_stylekey,(Object)(_nm.getObject()))));
 //BA.debugLineNum = 854;BA.debugLine="For Each k As String In optm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group9 = _optm.Keys();
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_k = BA.ObjectToString(group9.Get(index9));
 //BA.debugLineNum = 855;BA.debugLine="Dim v As Object = optm.Get(k)";
_v = _optm.Get((Object)(_k));
 //BA.debugLineNum = 856;BA.debugLine="oldm.Put(k, v)";
_oldm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 858;BA.debugLine="vue.SetStateSingle(styleKey, oldm)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stylekey,(Object)(_oldm.getObject()));
 //BA.debugLineNum = 859;BA.debugLine="SetAttrSingle(\":style\", styleKey)";
_setattrsingle(":style",_stylekey);
 //BA.debugLineNum = 860;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 861;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _bindstylesingle(String _prop,String _optm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
 //BA.debugLineNum = 863;BA.debugLine="Sub BindStyleSingle(prop As String, optm As String";
 //BA.debugLineNum = 864;BA.debugLine="If ID = \"\" Then Return Me";
if ((_id).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 865;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 866;BA.debugLine="nm.Put(prop, optm)";
_nm.Put((Object)(_prop),(Object)(_optm));
 //BA.debugLineNum = 867;BA.debugLine="BindStyle(nm)";
_bindstyle(_nm);
 //BA.debugLineNum = 868;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 869;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 1444;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 1445;BA.debugLine="Element.BuildModel(mprops, mstyles, lclasses, loo";
_element._buildmodel /*b4j.example.vuehtml*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 1446;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _centeralign() throws Exception{
 //BA.debugLineNum = 435;BA.debugLine="Sub CenterAlign As VMElement";
 //BA.debugLineNum = 436;BA.debugLine="SetStyleSingle(\"text-align\", \"center\")";
_setstylesingle("text-align",(Object)("center"));
 //BA.debugLineNum = 437;BA.debugLine="SetStyleSingle(\"display\", \"inline-block\")";
_setstylesingle("display",(Object)("inline-block"));
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Element As VueHTML";
_element = new b4j.example.vuehtml();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Public hasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 8;BA.debugLine="Public showKey As String";
_showkey = "";
 //BA.debugLineNum = 9;BA.debugLine="Private disKey As String";
_diskey = "";
 //BA.debugLineNum = 10;BA.debugLine="Private reqKey As String";
_reqkey = "";
 //BA.debugLineNum = 11;BA.debugLine="Private errKey As String";
_errkey = "";
 //BA.debugLineNum = 12;BA.debugLine="Private styleKey As String";
_stylekey = "";
 //BA.debugLineNum = 13;BA.debugLine="Public DesignMode As Boolean";
_designmode = false;
 //BA.debugLineNum = 14;BA.debugLine="Private bUsesStyles As Boolean";
_busesstyles = false;
 //BA.debugLineNum = 15;BA.debugLine="Private bUsesRequired As Boolean";
_busesrequired = false;
 //BA.debugLineNum = 16;BA.debugLine="Private bUsedDisabled As Boolean";
_buseddisabled = false;
 //BA.debugLineNum = 17;BA.debugLine="Private bUsesShow As Boolean";
_busesshow = false;
 //BA.debugLineNum = 18;BA.debugLine="Private bUsesVModel As Boolean";
_busesvmodel = false;
 //BA.debugLineNum = 19;BA.debugLine="Private bUsesClass As Boolean";
_busesclass = false;
 //BA.debugLineNum = 20;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
 //BA.debugLineNum = 23;BA.debugLine="Public R As String";
_r = "";
 //BA.debugLineNum = 24;BA.debugLine="Public C As String";
_c = "";
 //BA.debugLineNum = 25;BA.debugLine="Public OS As String";
_os = "";
 //BA.debugLineNum = 26;BA.debugLine="Public OM As String";
_om = "";
 //BA.debugLineNum = 27;BA.debugLine="Public OL As String";
_ol = "";
 //BA.debugLineNum = 28;BA.debugLine="Public OX As String";
_ox = "";
 //BA.debugLineNum = 29;BA.debugLine="Public SS As String";
_ss = "";
 //BA.debugLineNum = 30;BA.debugLine="Public SM As String";
_sm = "";
 //BA.debugLineNum = 31;BA.debugLine="Public SL As String";
_sl = "";
 //BA.debugLineNum = 32;BA.debugLine="Public SX As String";
_sx = "";
 //BA.debugLineNum = 33;BA.debugLine="Public MT As String";
_mt = "";
 //BA.debugLineNum = 34;BA.debugLine="Public MB As String";
_mb = "";
 //BA.debugLineNum = 35;BA.debugLine="Public ML As String";
_ml = "";
 //BA.debugLineNum = 36;BA.debugLine="Public MR As String";
_mr = "";
 //BA.debugLineNum = 37;BA.debugLine="Public PT As String";
_pt = "";
 //BA.debugLineNum = 38;BA.debugLine="Public PB As String";
_pb = "";
 //BA.debugLineNum = 39;BA.debugLine="Public PL As String";
_pl = "";
 //BA.debugLineNum = 40;BA.debugLine="Public PR As String";
_pr = "";
 //BA.debugLineNum = 41;BA.debugLine="Public fieldType As String";
_fieldtype = "";
 //BA.debugLineNum = 42;BA.debugLine="Public typeOf As String";
_typeof = "";
 //BA.debugLineNum = 43;BA.debugLine="Public InputType As String";
_inputtype = "";
 //BA.debugLineNum = 44;BA.debugLine="Public Template As String";
_template = "";
 //BA.debugLineNum = 45;BA.debugLine="Public IsVisible As Boolean";
_isvisible = false;
 //BA.debugLineNum = 46;BA.debugLine="Public IsDisabled As Boolean";
_isdisabled = false;
 //BA.debugLineNum = 47;BA.debugLine="Public IsRequired As Boolean";
_isrequired = false;
 //BA.debugLineNum = 48;BA.debugLine="Public IsArray As Boolean";
_isarray = false;
 //BA.debugLineNum = 49;BA.debugLine="Public IsExcluded As Boolean";
_isexcluded = false;
 //BA.debugLineNum = 50;BA.debugLine="Public ActualID As String";
_actualid = "";
 //BA.debugLineNum = 51;BA.debugLine="Public Host As String";
_host = "";
 //BA.debugLineNum = 52;BA.debugLine="Public Exclude As Boolean";
_exclude = false;
 //BA.debugLineNum = 53;BA.debugLine="Public vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 54;BA.debugLine="Public UncheckedValue As Object";
_uncheckedvalue = new Object();
 //BA.debugLineNum = 55;BA.debugLine="Public Value As Object";
_value = new Object();
 //BA.debugLineNum = 56;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 57;BA.debugLine="Public CenterOnParent As Boolean";
_centeronparent = false;
 //BA.debugLineNum = 58;BA.debugLine="Private classList As List";
_classlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 59;BA.debugLine="Private classKey As String";
_classkey = "";
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _clear() throws Exception{
 //BA.debugLineNum = 630;BA.debugLine="Sub Clear As VMElement";
 //BA.debugLineNum = 631;BA.debugLine="Element.clear";
_element._clear /*b4j.example.vuehtml*/ ();
 //BA.debugLineNum = 632;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 633;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createmeta() throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 150;BA.debugLine="Sub CreateMETA() As VMElement";
 //BA.debugLineNum = 151;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 152;BA.debugLine="el.Initialize(vue, \"\").SetTag(\"meta\")";
_el._initialize /*b4j.example.vmelement*/ (ba,_vue,"")._settag /*b4j.example.vmelement*/ ("meta");
 //BA.debugLineNum = 153;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _disable(boolean _b) throws Exception{
 //BA.debugLineNum = 500;BA.debugLine="Sub Disable(b As Boolean) As VMElement";
 //BA.debugLineNum = 501;BA.debugLine="If ID = \"\" Then Return Me";
if ((_id).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 502;BA.debugLine="IsDisabled = b";
_isdisabled = _b;
 //BA.debugLineNum = 503;BA.debugLine="bUsedDisabled = True";
_buseddisabled = __c.True;
 //BA.debugLineNum = 504;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 505;BA.debugLine="SetAttrSingle(\"disabled\", b)";
_setattrsingle("disabled",BA.ObjectToString(_b));
 //BA.debugLineNum = 506;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 508;BA.debugLine="vue.SetStateSingle(disKey, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_diskey,(Object)(_b));
 //BA.debugLineNum = 509;BA.debugLine="Bind(\":disabled\", disKey)";
_bind(":disabled",_diskey);
 //BA.debugLineNum = 510;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _disableitem(String _elid) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub DisableItem(elID As String) As VMElement";
 //BA.debugLineNum = 412;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 413;BA.debugLine="vue.SetStateSingle($\"${elID}disabled\"$, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(__c.True));
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _enable(boolean _b) throws Exception{
boolean _n = false;
 //BA.debugLineNum = 486;BA.debugLine="Sub Enable(b As Boolean) As VMElement";
 //BA.debugLineNum = 487;BA.debugLine="If ID = \"\" Then Return Me";
if ((_id).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 488;BA.debugLine="Dim n As Boolean = Not(b)";
_n = __c.Not(_b);
 //BA.debugLineNum = 489;BA.debugLine="IsDisabled = n";
_isdisabled = _n;
 //BA.debugLineNum = 490;BA.debugLine="bUsedDisabled = True";
_buseddisabled = __c.True;
 //BA.debugLineNum = 491;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 492;BA.debugLine="SetAttrSingle(\"disabled\", n)";
_setattrsingle("disabled",BA.ObjectToString(_n));
 //BA.debugLineNum = 493;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 495;BA.debugLine="vue.SetStateSingle(disKey, n)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_diskey,(Object)(_n));
 //BA.debugLineNum = 496;BA.debugLine="Bind(\":disabled\", disKey)";
_bind(":disabled",_diskey);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _enableitem(String _elid) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub EnableItem(elID As String) As VMElement";
 //BA.debugLineNum = 406;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 407;BA.debugLine="vue.SetStateSingle($\"${elID}disabled\"$, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"disabled"),(Object)(__c.False));
 //BA.debugLineNum = 408;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _hide() throws Exception{
 //BA.debugLineNum = 521;BA.debugLine="Sub Hide As VMElement";
 //BA.debugLineNum = 522;BA.debugLine="IsVisible = False";
_isvisible = __c.False;
 //BA.debugLineNum = 523;BA.debugLine="vue.SetStateSingle(showKey, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_showkey,(Object)(__c.False));
 //BA.debugLineNum = 524;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _hideitem(String _elid) throws Exception{
 //BA.debugLineNum = 418;BA.debugLine="Sub HideItem(elID As String) As VMElement";
 //BA.debugLineNum = 419;BA.debugLine="elID = elID.tolowercase";
_elid = _elid.toLowerCase();
 //BA.debugLineNum = 420;BA.debugLine="vue.SetStateSingle($\"${elID}show\"$, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"show"),(Object)(__c.False));
 //BA.debugLineNum = 421;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 62;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 63;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 64;BA.debugLine="ID = ID.trim";
_id = _id.trim();
 //BA.debugLineNum = 65;BA.debugLine="If IsValidID(ID) = False Then";
if (_isvalidid(_id)==__c.False) { 
 //BA.debugLineNum = 66;BA.debugLine="Log($\"Your component ID '${ID}' should contain a";
__c.Log(("Your component ID '"+__c.SmartStringFormatter("",(Object)(_id))+"' should contain alphanumeric ONLY!"));
 };
 //BA.debugLineNum = 69;BA.debugLine="Element.Initialize(ID,\"div\")";
_element._initialize /*b4j.example.vuehtml*/ (ba,_id,"div");
 //BA.debugLineNum = 70;BA.debugLine="classList.Initialize";
_classlist.Initialize();
 //BA.debugLineNum = 71;BA.debugLine="ErrorMessage = \"\"";
_errormessage = "";
 //BA.debugLineNum = 72;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 73;BA.debugLine="MT = \"\"";
_mt = "";
 //BA.debugLineNum = 74;BA.debugLine="MB = \"\"";
_mb = "";
 //BA.debugLineNum = 75;BA.debugLine="ML = \"\"";
_ml = "";
 //BA.debugLineNum = 76;BA.debugLine="MR = \"\"";
_mr = "";
 //BA.debugLineNum = 77;BA.debugLine="PT = \"\"";
_pt = "";
 //BA.debugLineNum = 78;BA.debugLine="PB = \"\"";
_pb = "";
 //BA.debugLineNum = 79;BA.debugLine="PL = \"\"";
_pl = "";
 //BA.debugLineNum = 80;BA.debugLine="PR = \"\"";
_pr = "";
 //BA.debugLineNum = 81;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 82;BA.debugLine="Value = Null";
_value = __c.Null;
 //BA.debugLineNum = 83;BA.debugLine="UncheckedValue = Null";
_uncheckedvalue = __c.Null;
 //BA.debugLineNum = 84;BA.debugLine="Template = \"\"";
_template = "";
 //BA.debugLineNum = 85;BA.debugLine="hasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 86;BA.debugLine="bUsesStyles = False";
_busesstyles = __c.False;
 //BA.debugLineNum = 87;BA.debugLine="bUsesRequired = False";
_busesrequired = __c.False;
 //BA.debugLineNum = 88;BA.debugLine="bUsedDisabled = False";
_buseddisabled = __c.False;
 //BA.debugLineNum = 89;BA.debugLine="bUsesShow = False";
_busesshow = __c.False;
 //BA.debugLineNum = 90;BA.debugLine="CenterOnParent = False";
_centeronparent = __c.False;
 //BA.debugLineNum = 91;BA.debugLine="bUsesVModel = False";
_busesvmodel = __c.False;
 //BA.debugLineNum = 92;BA.debugLine="bUsesClass = False";
_busesclass = __c.False;
 //BA.debugLineNum = 93;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 95;BA.debugLine="showKey = $\"${ID}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"show");
 //BA.debugLineNum = 96;BA.debugLine="disKey = $\"${ID}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_id))+"disabled");
 //BA.debugLineNum = 97;BA.debugLine="reqKey = $\"${ID}required\"$";
_reqkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"required");
 //BA.debugLineNum = 98;BA.debugLine="errKey = $\"${ID}error\"$";
_errkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"error");
 //BA.debugLineNum = 99;BA.debugLine="styleKey = $\"${ID}style\"$";
_stylekey = (""+__c.SmartStringFormatter("",(Object)(_id))+"style");
 //BA.debugLineNum = 100;BA.debugLine="classKey = $\"${ID}class\"$";
_classkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"class");
 //BA.debugLineNum = 102;BA.debugLine="If ID <> \"\" Then";
if ((_id).equals("") == false) { 
 //BA.debugLineNum = 104;BA.debugLine="SetRef(ID)";
_setref(_id);
 };
 //BA.debugLineNum = 113;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 114;BA.debugLine="SetRC(1,1)";
_setrc(BA.NumberToString(1),BA.NumberToString(1));
 //BA.debugLineNum = 115;BA.debugLine="SetDeviceOffsets(0,0,0,0)";
_setdeviceoffsets(BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0));
 //BA.debugLineNum = 116;BA.debugLine="SetDeviceSizes(12,12,12,12)";
_setdevicesizes(BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12),BA.NumberToString(12));
 //BA.debugLineNum = 118;BA.debugLine="typeOf = \"text\"";
_typeof = "text";
 //BA.debugLineNum = 119;BA.debugLine="fieldType = \"string\"";
_fieldtype = "string";
 //BA.debugLineNum = 120;BA.debugLine="InputType = \"text\"";
_inputtype = "text";
 //BA.debugLineNum = 122;BA.debugLine="IsVisible = True";
_isvisible = __c.True;
 //BA.debugLineNum = 123;BA.debugLine="IsDisabled = False";
_isdisabled = __c.False;
 //BA.debugLineNum = 124;BA.debugLine="IsRequired = False";
_isrequired = __c.False;
 //BA.debugLineNum = 125;BA.debugLine="IsArray = False";
_isarray = __c.False;
 //BA.debugLineNum = 126;BA.debugLine="IsExcluded = False";
_isexcluded = __c.False;
 //BA.debugLineNum = 127;BA.debugLine="ActualID = \"\"";
_actualid = "";
 //BA.debugLineNum = 128;BA.debugLine="Host = \"\"";
_host = "";
 //BA.debugLineNum = 129;BA.debugLine="Exclude = False";
_exclude = __c.False;
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public boolean  _isvalidid(String _idname) throws Exception{
int _slen = 0;
int _i = 0;
String _mout = "";
 //BA.debugLineNum = 174;BA.debugLine="Sub IsValidID(idName As String) As Boolean";
 //BA.debugLineNum = 175;BA.debugLine="If idName = \"\" Then Return True";
if ((_idname).equals("")) { 
if (true) return __c.True;};
 //BA.debugLineNum = 176;BA.debugLine="Dim slen As Int = idName.Length";
_slen = _idname.length();
 //BA.debugLineNum = 177;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 178;BA.debugLine="For i = 0 To slen - 1";
{
final int step4 = 1;
final int limit4 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 179;BA.debugLine="Dim mout As String = idName.CharAt(i)";
_mout = BA.ObjectToString(_idname.charAt(_i));
 //BA.debugLineNum = 180;BA.debugLine="If \"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQR";
if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".indexOf(_mout)==-1) { 
 //BA.debugLineNum = 181;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 //BA.debugLineNum = 184;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return false;
}
public String  _makepx(String _svalue) throws Exception{
 //BA.debugLineNum = 547;BA.debugLine="Sub MakePx(sValue As String) As String";
 //BA.debugLineNum = 548;BA.debugLine="Return Element.MakePx(sValue)";
if (true) return _element._makepx /*String*/ (_svalue);
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _moveup(String _stop) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub MoveUp(sTop As String) As VMElement";
 //BA.debugLineNum = 158;BA.debugLine="SetAttrSingle(\"margin-top\", sTop)";
_setattrsingle("margin-top",_stop);
 //BA.debugLineNum = 159;BA.debugLine="SetStyleSingle(\"z-index\",\"9999\")";
_setstylesingle("z-index",(Object)("9999"));
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 1198;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 1199;BA.debugLine="If hasContent Then p.SetText(ToString)";
if (_hascontent) { 
_p._settext /*b4j.example.vmelement*/ (_tostring());};
 //BA.debugLineNum = 1200;BA.debugLine="End Sub";
return "";
}
public String  _pop1(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 943;BA.debugLine="Sub Pop1(p As VMElement)";
 //BA.debugLineNum = 944;BA.debugLine="p.AddChild(Me)";
_p._addchild /*b4j.example.vmelement*/ ((b4j.example.vmelement)(this));
 //BA.debugLineNum = 945;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 811;BA.debugLine="public Sub RemoveAttr(sName As String) As VMElemen";
 //BA.debugLineNum = 812;BA.debugLine="Element.RemoveAttr(sName)";
_element._removeattr /*b4j.example.vuehtml*/ (_sname);
 //BA.debugLineNum = 813;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 814;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _removeattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _s = "";
 //BA.debugLineNum = 1254;BA.debugLine="Sub RemoveAttributes(attrs As List) As VMElement";
 //BA.debugLineNum = 1255;BA.debugLine="For Each s As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1256;BA.debugLine="RemoveAttr(s)";
_removeattr(_s);
 }
};
 //BA.debugLineNum = 1258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _removeclass(String _classname) throws Exception{
 //BA.debugLineNum = 650;BA.debugLine="Sub RemoveClass(className As String) As VMElement";
 //BA.debugLineNum = 651;BA.debugLine="Element.removeClass(className)";
_element._removeclass /*b4j.example.vuehtml*/ (_classname);
 //BA.debugLineNum = 652;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _removeclassdynamic(String _classname) throws Exception{
 //BA.debugLineNum = 916;BA.debugLine="Sub RemoveClassDynamic(className As String) As VME";
 //BA.debugLineNum = 917;BA.debugLine="RemoveDynamicClass(className)";
_removedynamicclass(_classname);
 //BA.debugLineNum = 918;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 919;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _removedynamicclass(String _classname) throws Exception{
int _cpos = 0;
 //BA.debugLineNum = 922;BA.debugLine="Sub RemoveDynamicClass(className As String) As VME";
 //BA.debugLineNum = 923;BA.debugLine="If vue.hasstate(classKey) = False Then";
if (_vue._hasstate /*boolean*/ (_classkey)==__c.False) { 
 //BA.debugLineNum = 924;BA.debugLine="vue.SetData(classKey, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_classkey,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 };
 //BA.debugLineNum = 926;BA.debugLine="classList = vue.GetData(classKey)";
_classlist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vue._getdata /*Object*/ (_classkey)));
 //BA.debugLineNum = 927;BA.debugLine="Dim cpos As Int = classList.IndexOf(className)";
_cpos = _classlist.IndexOf((Object)(_classname));
 //BA.debugLineNum = 928;BA.debugLine="cpos = BANano.parseInt(cpos)";
_cpos = _banano.parseInt((Object)(_cpos));
 //BA.debugLineNum = 929;BA.debugLine="If cpos <> -1 Then classList.RemoveAt(cpos)";
if (_cpos!=-1) { 
_classlist.RemoveAt(_cpos);};
 //BA.debugLineNum = 930;BA.debugLine="vue.SetData(classKey, classList)";
_vue._setdata /*b4j.example.bananovue*/ (_classkey,(Object)(_classlist.getObject()));
 //BA.debugLineNum = 931;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 932;BA.debugLine="bUsesClass = True";
_busesclass = __c.True;
 //BA.debugLineNum = 933;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 934;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _removevmodel() throws Exception{
 //BA.debugLineNum = 1247;BA.debugLine="Sub RemoveVModel As VMElement";
 //BA.debugLineNum = 1248;BA.debugLine="RemoveAttr(\"v-model\")";
_removeattr("v-model");
 //BA.debugLineNum = 1249;BA.debugLine="bUsesVModel = False";
_busesvmodel = __c.False;
 //BA.debugLineNum = 1250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _removevshow() throws Exception{
 //BA.debugLineNum = 1241;BA.debugLine="Sub RemoveVShow As VMElement";
 //BA.debugLineNum = 1242;BA.debugLine="RemoveAttr(\"v-show\")";
_removeattr("v-show");
 //BA.debugLineNum = 1243;BA.debugLine="bUsesShow = False";
_busesshow = __c.False;
 //BA.debugLineNum = 1244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1245;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 1262;BA.debugLine="Sub Render";
 //BA.debugLineNum = 1263;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 1264;BA.debugLine="End Sub";
return "";
}
public String  _render1(String _parent) throws Exception{
 //BA.debugLineNum = 938;BA.debugLine="Sub Render1(Parent As String)";
 //BA.debugLineNum = 939;BA.debugLine="BANano.GetElement(Parent).Append(ToString)";
_banano.GetElement(_parent).Append(_tostring());
 //BA.debugLineNum = 940;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _required(boolean _b) throws Exception{
 //BA.debugLineNum = 471;BA.debugLine="Sub Required(b As Boolean) As VMElement";
 //BA.debugLineNum = 472;BA.debugLine="If ID = \"\" Then Return Me";
if ((_id).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 473;BA.debugLine="IsRequired = b";
_isrequired = _b;
 //BA.debugLineNum = 474;BA.debugLine="bUsesRequired = True";
_busesrequired = __c.True;
 //BA.debugLineNum = 475;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 476;BA.debugLine="SetAttrSingle(\"required\", b)";
_setattrsingle("required",BA.ObjectToString(_b));
 //BA.debugLineNum = 477;BA.debugLine="vue.SetStateSingle(errKey, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_errkey,(Object)(__c.False));
 //BA.debugLineNum = 478;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 480;BA.debugLine="vue.SetStateSingle(reqKey, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_reqkey,(Object)(_b));
 //BA.debugLineNum = 481;BA.debugLine="vue.SetStateSingle(errKey, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_errkey,(Object)(__c.False));
 //BA.debugLineNum = 482;BA.debugLine="Bind(\":required\", reqKey)";
_bind(":required",_reqkey);
 //BA.debugLineNum = 483;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setactiveclass(String _sclass) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetActiveClass(sClass As String) As VMElement";
 //BA.debugLineNum = 136;BA.debugLine="SetAttrSingle(\"active-class\", sClass)";
_setattrsingle("active-class",_sclass);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setalt(String _a) throws Exception{
 //BA.debugLineNum = 1114;BA.debugLine="Sub SetAlt(a As String) As VMElement";
 //BA.debugLineNum = 1115;BA.debugLine="Element.SetAlt(a)";
_element._setalt /*b4j.example.vuehtml*/ (_a);
 //BA.debugLineNum = 1116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setattr(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1070;BA.debugLine="Sub SetAttr(m As Map) As VMElement";
 //BA.debugLineNum = 1071;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 1072;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1073;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 1074;BA.debugLine="Select Case k";
switch (BA.switchObjectToInt(_k,":disabled",":required",":style","v-show","v-model",":class")) {
case 0: {
 //BA.debugLineNum = 1076;BA.debugLine="bUsedDisabled = True";
_buseddisabled = __c.True;
 break; }
case 1: {
 //BA.debugLineNum = 1078;BA.debugLine="bUsesRequired = True";
_busesrequired = __c.True;
 break; }
case 2: {
 //BA.debugLineNum = 1080;BA.debugLine="bUsesStyles = True";
_busesstyles = __c.True;
 break; }
case 3: {
 //BA.debugLineNum = 1082;BA.debugLine="bUsesShow = True";
_busesshow = __c.True;
 break; }
case 4: {
 //BA.debugLineNum = 1084;BA.debugLine="bUsesVModel = True";
_busesvmodel = __c.True;
 break; }
case 5: {
 //BA.debugLineNum = 1086;BA.debugLine="bUsesClass = True";
_busesclass = __c.True;
 break; }
}
;
 //BA.debugLineNum = 1088;BA.debugLine="Element.SetAttr(k, v)";
_element._setattr /*b4j.example.vuehtml*/ (_k,BA.ObjectToString(_v));
 }
};
 //BA.debugLineNum = 1090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setattr1(String _attr,Object _vals) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 540;BA.debugLine="Sub SetAttr1(attr As String, vals As Object) As VM";
 //BA.debugLineNum = 541;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 542;BA.debugLine="opt.Put(attr, vals)";
_opt.Put((Object)(_attr),_vals);
 //BA.debugLineNum = 543;BA.debugLine="SetAttr(opt)";
_setattr(_opt);
 //BA.debugLineNum = 544;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 545;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 312;BA.debugLine="Sub SetAttributes(attrs As List) As VMElement";
 //BA.debugLineNum = 313;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 314;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub SetAttrLoose(loose As String) As VMElement";
 //BA.debugLineNum = 320;BA.debugLine="Element.AddLooseAttribute(loose)";
_element._addlooseattribute /*b4j.example.vuehtml*/ (_loose);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setattrsingle(String _prop,String _vals) throws Exception{
anywheresoftware.b4a.objects.collections.Map _attr = null;
 //BA.debugLineNum = 464;BA.debugLine="Sub SetAttrSingle(prop As String, vals As String)";
 //BA.debugLineNum = 465;BA.debugLine="Dim attr As Map = CreateMap()";
_attr = new anywheresoftware.b4a.objects.collections.Map();
_attr = __c.createMap(new Object[] {});
 //BA.debugLineNum = 466;BA.debugLine="attr.Put(prop, vals)";
_attr.Put((Object)(_prop),(Object)(_vals));
 //BA.debugLineNum = 467;BA.debugLine="SetAttr(attr)";
_setattr(_attr);
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setautocomplete(String _auto) throws Exception{
 //BA.debugLineNum = 795;BA.debugLine="Sub SetAutoComplete(auto As String) As VMElement";
 //BA.debugLineNum = 796;BA.debugLine="SetAttr(CreateMap(\"autocomplete\": auto))";
_setattr(__c.createMap(new Object[] {(Object)("autocomplete"),(Object)(_auto)}));
 //BA.debugLineNum = 797;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 798;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setbackgroundcolor(Object _p) throws Exception{
 //BA.debugLineNum = 1012;BA.debugLine="Sub SetBackgroundColor(p As Object) As VMElement";
 //BA.debugLineNum = 1013;BA.debugLine="SetStyle(CreateMap(\"background-color\":p))";
_setstyle(__c.createMap(new Object[] {(Object)("background-color"),_p}));
 //BA.debugLineNum = 1014;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1015;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setbackgroundimage(String _surl) throws Exception{
 //BA.debugLineNum = 1093;BA.debugLine="Sub SetBackgroundImage(sURL As String) As VMElemen";
 //BA.debugLineNum = 1094;BA.debugLine="Element.SetStyle(\"background-image\", $\"url('${sUR";
_element._setstyle /*b4j.example.vuehtml*/ ("background-image",("url('"+__c.SmartStringFormatter("",(Object)(_surl))+"')"));
 //BA.debugLineNum = 1095;BA.debugLine="Element.SetStyle(\"background-size\", \"100% 100%\")";
_element._setstyle /*b4j.example.vuehtml*/ ("background-size","100% 100%");
 //BA.debugLineNum = 1102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setbool() throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetBool As VMElement";
 //BA.debugLineNum = 277;BA.debugLine="fieldType = \"bool\"";
_fieldtype = "bool";
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setborder(String _width,String _color,String _bstyle) throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 604;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
 //BA.debugLineNum = 605;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 606;BA.debugLine="b.Put(\"border-style\", bstyle)";
_b.Put((Object)("border-style"),(Object)(_bstyle));
 //BA.debugLineNum = 607;BA.debugLine="b.Put(\"border-width\", width)";
_b.Put((Object)("border-width"),(Object)(_width));
 //BA.debugLineNum = 608;BA.debugLine="b.Put(\"border-color\", color)";
_b.Put((Object)("border-color"),(Object)(_color));
 //BA.debugLineNum = 609;BA.debugLine="SetStyle(b)";
_setstyle(_b);
 //BA.debugLineNum = 610;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setborderradius(String _size) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetBorderRadius(size As String) As VMElement";
 //BA.debugLineNum = 222;BA.debugLine="Element.SetStyleRound(size)";
_element._setstyleround /*b4j.example.vuehtml*/ (_size);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setbottom(String _sbottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1479;BA.debugLine="Sub SetBottom(sbottom As String) As VMElement";
 //BA.debugLineNum = 1480;BA.debugLine="If sbottom = \"\" Then Return Me";
if ((_sbottom).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1481;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1482;BA.debugLine="SetAttrSingle(\"bottom\", sbottom)";
_setattrsingle("bottom",_sbottom);
 //BA.debugLineNum = 1483;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 1485;BA.debugLine="Dim pp As String = $\"${ID}bottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"bottom");
 //BA.debugLineNum = 1486;BA.debugLine="vue.SetStateSingle(pp, sbottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_sbottom));
 //BA.debugLineNum = 1487;BA.debugLine="Bind(\":bottom\", pp)";
_bind(":bottom",_pp);
 //BA.debugLineNum = 1488;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1489;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setbutton() throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetButton As VMElement";
 //BA.debugLineNum = 292;BA.debugLine="typeOf = \"button\"";
_typeof = "button";
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcell(String _scell) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub SetCell(scell As String) As VMElement";
 //BA.debugLineNum = 303;BA.debugLine="C = scell";
_c = _scell;
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setchecked(boolean _b) throws Exception{
 //BA.debugLineNum = 1164;BA.debugLine="Sub SetChecked(b As Boolean) As VMElement";
 //BA.debugLineNum = 1165;BA.debugLine="SetAttr(CreateMap(\":checked\":b))";
_setattr(__c.createMap(new Object[] {(Object)(":checked"),(Object)(_b)}));
 //BA.debugLineNum = 1166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 949;BA.debugLine="Sub SetColor(varColor As String) As VMElement";
 //BA.debugLineNum = 950;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 951;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 952;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 953;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 955;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 956;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 957;BA.debugLine="Bind(\":color\", pp)";
_bind(":color",_pp);
 //BA.debugLineNum = 958;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 959;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 962;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 963;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 964;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 965;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 966;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 967;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 969;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 970;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 971;BA.debugLine="Bind(\":color\", pp)";
_bind(":color",_pp);
 //BA.debugLineNum = 972;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 973;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcontainer(boolean _b) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Sub SetContainer(b As Boolean) As VMElement";
 //BA.debugLineNum = 430;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 431;BA.debugLine="AddClass(\"container\")";
_addclass("container");
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcursormove() throws Exception{
 //BA.debugLineNum = 614;BA.debugLine="Sub SetCursorMove As VMElement";
 //BA.debugLineNum = 615;BA.debugLine="SetStyle(CreateMap(\"cursor\": \"move\"))";
_setstyle(__c.createMap(new Object[] {(Object)("cursor"),(Object)("move")}));
 //BA.debugLineNum = 616;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 617;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setcursorpointer() throws Exception{
 //BA.debugLineNum = 619;BA.debugLine="Sub SetCursorPointer As VMElement";
 //BA.debugLineNum = 620;BA.debugLine="SetStyle(CreateMap(\"cursor\": \"pointer\"))";
_setstyle(__c.createMap(new Object[] {(Object)("cursor"),(Object)("pointer")}));
 //BA.debugLineNum = 621;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 622;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 188;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdate() throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub SetDate As VMElement";
 //BA.debugLineNum = 287;BA.debugLine="fieldType = \"date\"";
_fieldtype = "date";
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdense() throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetDense As VMElement";
 //BA.debugLineNum = 375;BA.debugLine="Element.SetAttr(\"dense\", True)";
_element._setattr /*b4j.example.vuehtml*/ ("dense",BA.ObjectToString(__c.True));
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMElement";
 //BA.debugLineNum = 450;BA.debugLine="Element.SetDesignMode(b)";
_element._setdesignmode /*b4j.example.vuehtml*/ (_b);
 //BA.debugLineNum = 451;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdeviceoffsets(String _soffsetsmall,String _soffsetmedium,String _soffsetlarge,String _soffsetxlarge) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetDeviceOffsets(sOffsetSmall As String, sOffs";
 //BA.debugLineNum = 227;BA.debugLine="OS = sOffsetSmall";
_os = _soffsetsmall;
 //BA.debugLineNum = 228;BA.debugLine="OM = sOffsetMedium";
_om = _soffsetmedium;
 //BA.debugLineNum = 229;BA.debugLine="OL = sOffsetLarge";
_ol = _soffsetlarge;
 //BA.debugLineNum = 230;BA.debugLine="OX = sOffsetXLarge";
_ox = _soffsetxlarge;
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 297;BA.debugLine="SetRC(srow,scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 298;BA.debugLine="SetDeviceSizes(small,medium,large,xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdevicesizes(String _ssizesmall,String _ssizemedium,String _ssizelarge,String _ssizexlarge) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetDeviceSizes(sSizeSmall As String, sSizeMedi";
 //BA.debugLineNum = 235;BA.debugLine="SS = sSizeSmall";
_ss = _ssizesmall;
 //BA.debugLineNum = 236;BA.debugLine="SM = sSizeMedium";
_sm = _ssizemedium;
 //BA.debugLineNum = 237;BA.debugLine="SL = sSizeLarge";
_sl = _ssizelarge;
 //BA.debugLineNum = 238;BA.debugLine="SX = sSizeXLarge";
_sx = _ssizexlarge;
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 1047;BA.debugLine="Sub SetDisabled(b As Boolean) As VMElement";
 //BA.debugLineNum = 1048;BA.debugLine="If ID = \"\" Then Return Me";
if ((_id).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1049;BA.debugLine="bUsedDisabled = b";
_buseddisabled = _b;
 //BA.debugLineNum = 1050;BA.debugLine="IsDisabled = b";
_isdisabled = _b;
 //BA.debugLineNum = 1051;BA.debugLine="vue.SetStatesingle(disKey, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_diskey,(Object)(_b));
 //BA.debugLineNum = 1052;BA.debugLine="Element.SetAttrSingle(\":disabled\", disKey)";
_element._setattrsingle /*b4j.example.vuehtml*/ (":disabled",_diskey);
 //BA.debugLineNum = 1053;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1054;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdouble() throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetDouble As VMElement";
 //BA.debugLineNum = 266;BA.debugLine="fieldType = \"dbl\"";
_fieldtype = "dbl";
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdraggable(boolean _b) throws Exception{
 //BA.debugLineNum = 574;BA.debugLine="Sub SetDraggable(b As Boolean) As VMElement";
 //BA.debugLineNum = 575;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 576;BA.debugLine="SetAttrSingle(\"draggable\", b)";
_setattrsingle("draggable",BA.ObjectToString(_b));
 //BA.debugLineNum = 577;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 579;BA.debugLine="SetAttr(CreateMap(\":draggable\":b))";
_setattr(__c.createMap(new Object[] {(Object)(":draggable"),(Object)(_b)}));
 //BA.debugLineNum = 580;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 581;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setdroppable(boolean _b) throws Exception{
 //BA.debugLineNum = 583;BA.debugLine="Sub SetDroppable(b As Boolean) As VMElement";
 //BA.debugLineNum = 584;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 585;BA.debugLine="SetAttr(CreateMap(\"droppable\":b))";
_setattr(__c.createMap(new Object[] {(Object)("droppable"),(Object)(_b)}));
 //BA.debugLineNum = 586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 588;BA.debugLine="SetAttr(CreateMap(\":droppable\":b))";
_setattr(__c.createMap(new Object[] {(Object)(":droppable"),(Object)(_b)}));
 //BA.debugLineNum = 589;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setelevation(String _elnum) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub SetElevation(elNum As String) As VMElement";
 //BA.debugLineNum = 380;BA.debugLine="AddClass($\"elevation-${elNum}\"$)";
_addclass(("elevation-"+__c.SmartStringFormatter("",(Object)(_elnum))+""));
 //BA.debugLineNum = 381;BA.debugLine="Element.SetAttr(\"elevation\", BANano.parseInt(elNu";
_element._setattr /*b4j.example.vuehtml*/ ("elevation",BA.NumberToString(_banano.parseInt((Object)(_elnum))));
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _seterrortext(String _etxt) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetErrorText(eTxt As String) As VMElement";
 //BA.debugLineNum = 170;BA.debugLine="ErrorMessage = eTxt";
_errormessage = _etxt;
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setevent(String _eventname,String _methodname) throws Exception{
 //BA.debugLineNum = 655;BA.debugLine="Sub SetEvent(eventName As String, methodName As St";
 //BA.debugLineNum = 656;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 657;BA.debugLine="SetAttrSingle(eventName, methodName)";
_setattrsingle(_eventname,_methodname);
 //BA.debugLineNum = 658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setfluid() throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub SetFluid As VMElement";
 //BA.debugLineNum = 370;BA.debugLine="Element.SetAttr(\"fluid\", True)";
_element._setattr /*b4j.example.vuehtml*/ ("fluid",BA.ObjectToString(__c.True));
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setfor(String _f) throws Exception{
 //BA.debugLineNum = 551;BA.debugLine="Sub SetFor(f As String) As VMElement";
 //BA.debugLineNum = 552;BA.debugLine="Element.SetAttrSingle(\"for\", f)";
_element._setattrsingle /*b4j.example.vuehtml*/ ("for",_f);
 //BA.debugLineNum = 553;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 554;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 598;BA.debugLine="Sub SetHeight(h As String) As VMElement";
 //BA.debugLineNum = 599;BA.debugLine="SetStyle(CreateMap(\"height\":h))";
_setstyle(__c.createMap(new Object[] {(Object)("height"),(Object)(_h)}));
 //BA.debugLineNum = 600;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _sethideonleave(boolean _b) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetHideOnLeave(b As Boolean) As VMElement";
 //BA.debugLineNum = 141;BA.debugLine="SetAttrSingle(\"hide-on-leave\", b)";
_setattrsingle("hide-on-leave",BA.ObjectToString(_b));
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _sethref(String _h) throws Exception{
 //BA.debugLineNum = 1042;BA.debugLine="Sub SetHREF(h As String) As VMElement";
 //BA.debugLineNum = 1043;BA.debugLine="Element.SetAttrHREF(h)";
_element._setattrhref /*b4j.example.vuehtml*/ (_h);
 //BA.debugLineNum = 1044;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1045;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setid(String _n,boolean _bbind) throws Exception{
 //BA.debugLineNum = 816;BA.debugLine="Sub SetID(n As String, bBind As Boolean) As VMElem";
 //BA.debugLineNum = 817;BA.debugLine="If bBind Then";
if (_bbind) { 
 //BA.debugLineNum = 818;BA.debugLine="RemoveAttr(\"id\")";
_removeattr("id");
 //BA.debugLineNum = 819;BA.debugLine="SetAttr(CreateMap(\":id\": n))";
_setattr(__c.createMap(new Object[] {(Object)(":id"),(Object)(_n)}));
 }else {
 //BA.debugLineNum = 821;BA.debugLine="RemoveAttr(\":id\")";
_removeattr(":id");
 //BA.debugLineNum = 822;BA.debugLine="SetAttr(CreateMap(\"id\": n))";
_setattr(__c.createMap(new Object[] {(Object)("id"),(Object)(_n)}));
 };
 //BA.debugLineNum = 824;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 825;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setint() throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetInt As VMElement";
 //BA.debugLineNum = 282;BA.debugLine="fieldType = \"int\"";
_fieldtype = "int";
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setis(String _t) throws Exception{
 //BA.debugLineNum = 694;BA.debugLine="Sub SetIs(t As String) As VMElement";
 //BA.debugLineNum = 695;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 696;BA.debugLine="SetAttr(CreateMap(\":is\": t))";
_setattr(__c.createMap(new Object[] {(Object)(":is"),(Object)(_t)}));
 //BA.debugLineNum = 697;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 698;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setkey(Object _k,boolean _bbind) throws Exception{
 //BA.debugLineNum = 682;BA.debugLine="Sub SetKey(k As Object, bBind As Boolean) As VMEle";
 //BA.debugLineNum = 683;BA.debugLine="If bBind Then";
if (_bbind) { 
 //BA.debugLineNum = 684;BA.debugLine="If vue.StateExists(k) = False Then vue.SetStateS";
if (_vue._stateexists /*boolean*/ (BA.ObjectToString(_k))==__c.False) { 
_vue._setstatesingle /*b4j.example.bananovue*/ (BA.ObjectToString(_k),(Object)(__c.DateTime.getNow()));};
 //BA.debugLineNum = 685;BA.debugLine="RemoveAttr(\"key\")";
_removeattr("key");
 //BA.debugLineNum = 686;BA.debugLine="Element.SetAttrSingle(\":key\", k)";
_element._setattrsingle /*b4j.example.vuehtml*/ (":key",BA.ObjectToString(_k));
 }else {
 //BA.debugLineNum = 688;BA.debugLine="RemoveAttr(\":key\")";
_removeattr(":key");
 //BA.debugLineNum = 689;BA.debugLine="Element.SetAttrSingle(\"key\", k)";
_element._setattrsingle /*b4j.example.vuehtml*/ ("key",BA.ObjectToString(_k));
 };
 //BA.debugLineNum = 691;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 692;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setleft(String _sleft) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1493;BA.debugLine="Sub SetLeft(sleft As String) As VMElement";
 //BA.debugLineNum = 1494;BA.debugLine="If sleft = \"\" Then Return Me";
if ((_sleft).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1495;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1496;BA.debugLine="SetAttrSingle(\"left\", sleft)";
_setattrsingle("left",_sleft);
 //BA.debugLineNum = 1497;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 1499;BA.debugLine="Dim pp As String = $\"${ID}left\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"left");
 //BA.debugLineNum = 1500;BA.debugLine="vue.SetStateSingle(pp, sleft)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_sleft));
 //BA.debugLineNum = 1501;BA.debugLine="Bind(\":left\", pp)";
_bind(":left",_pp);
 //BA.debugLineNum = 1502;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1503;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setlineheight(Object _lh) throws Exception{
 //BA.debugLineNum = 1124;BA.debugLine="Sub SetLineHeight(lh As Object) As VMElement";
 //BA.debugLineNum = 1125;BA.debugLine="SetStyle(CreateMap(\"line-height\": lh))";
_setstyle(__c.createMap(new Object[] {(Object)("line-height"),_lh}));
 //BA.debugLineNum = 1126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmarginall(Object _p) throws Exception{
 //BA.debugLineNum = 1017;BA.debugLine="Sub SetMarginAll(p As Object) As VMElement";
 //BA.debugLineNum = 1018;BA.debugLine="SetStyle(CreateMap(\"margin\":p))";
_setstyle(__c.createMap(new Object[] {(Object)("margin"),_p}));
 //BA.debugLineNum = 1019;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1020;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmargins(String _smt,String _smb,String _sml,String _smr) throws Exception{
 //BA.debugLineNum = 1416;BA.debugLine="Sub SetMargins(sMT As String, sMB As String, sML A";
 //BA.debugLineNum = 1417;BA.debugLine="SetStyleSingle(\"margin-top\", sMT)";
_setstylesingle("margin-top",(Object)(_smt));
 //BA.debugLineNum = 1418;BA.debugLine="SetStyleSingle(\"margin-bottom\", sMB)";
_setstylesingle("margin-bottom",(Object)(_smb));
 //BA.debugLineNum = 1419;BA.debugLine="SetStyleSingle(\"margin-left\", sML)";
_setstylesingle("margin-left",(Object)(_sml));
 //BA.debugLineNum = 1420;BA.debugLine="SetStyleSingle(\"margin-right\", sMR)";
_setstylesingle("margin-right",(Object)(_smr));
 //BA.debugLineNum = 1421;BA.debugLine="MT = sMT";
_mt = _smt;
 //BA.debugLineNum = 1422;BA.debugLine="MB = sMB";
_mb = _smb;
 //BA.debugLineNum = 1423;BA.debugLine="ML = sML";
_ml = _sml;
 //BA.debugLineNum = 1424;BA.debugLine="MR = sMR";
_mr = _smr;
 //BA.debugLineNum = 1425;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1426;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmaxheight(String _mw) throws Exception{
 //BA.debugLineNum = 1032;BA.debugLine="Sub SetMaxHeight(mw As String) As VMElement";
 //BA.debugLineNum = 1033;BA.debugLine="Element.SetStyle(\"max-height\",mw)";
_element._setstyle /*b4j.example.vuehtml*/ ("max-height",_mw);
 //BA.debugLineNum = 1034;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1035;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmaxwidth(String _mw) throws Exception{
 //BA.debugLineNum = 1027;BA.debugLine="Sub SetMaxWidth(mw As String) As VMElement";
 //BA.debugLineNum = 1028;BA.debugLine="Element.SetStyle(\"max-width\",mw)";
_element._setstyle /*b4j.example.vuehtml*/ ("max-width",_mw);
 //BA.debugLineNum = 1029;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1030;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmethodpost() throws Exception{
 //BA.debugLineNum = 569;BA.debugLine="Sub SetMethodPost As VMElement";
 //BA.debugLineNum = 570;BA.debugLine="SetAttr(CreateMap(\"method\":\"POST\"))";
_setattr(__c.createMap(new Object[] {(Object)("method"),(Object)("POST")}));
 //BA.debugLineNum = 571;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 572;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setmode(String _smode) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetMode(sMode As String) As VMElement";
 //BA.debugLineNum = 146;BA.debugLine="SetAttrSingle(\"mode\", sMode)";
_setattrsingle("mode",_smode);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setname(String _n,boolean _bbind) throws Exception{
 //BA.debugLineNum = 800;BA.debugLine="Sub SetName(n As String, bBind As Boolean) As VMEl";
 //BA.debugLineNum = 801;BA.debugLine="If bBind Then";
if (_bbind) { 
 //BA.debugLineNum = 802;BA.debugLine="RemoveAttr(\"name\")";
_removeattr("name");
 //BA.debugLineNum = 803;BA.debugLine="SetAttr(CreateMap(\":name\": n))";
_setattr(__c.createMap(new Object[] {(Object)(":name"),(Object)(_n)}));
 }else {
 //BA.debugLineNum = 805;BA.debugLine="RemoveAttr(\":name\")";
_removeattr(":name");
 //BA.debugLineNum = 806;BA.debugLine="SetAttr(CreateMap(\"name\": n))";
_setattr(__c.createMap(new Object[] {(Object)("name"),(Object)(_n)}));
 };
 //BA.debugLineNum = 808;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 809;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setnumber() throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetNumber As VMElement";
 //BA.debugLineNum = 272;BA.debugLine="typeOf = \"number\"";
_typeof = "number";
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonblur(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1302;BA.debugLine="Sub SetOnBlur(module As Object, methodName As Stri";
 //BA.debugLineNum = 1303;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1304;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1305;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1306;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1307;BA.debugLine="SetAttr(CreateMap(\"@blur\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@blur"),(Object)(_methodname)}));
 //BA.debugLineNum = 1309;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonchange(Object _eventhandler,String _source) throws Exception{
String _methodname = "";
String _sval = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 387;BA.debugLine="Sub SetOnChange(eventHandler As Object, source As";
 //BA.debugLineNum = 388;BA.debugLine="source = source.tolowercase";
_source = _source.toLowerCase();
 //BA.debugLineNum = 389;BA.debugLine="Dim methodName As String  = $\"${source}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_source))+"_change");
 //BA.debugLineNum = 390;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 391;BA.debugLine="Dim sval As String";
_sval = "";
 //BA.debugLineNum = 392;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sval)}))));
 //BA.debugLineNum = 393;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 395;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonclear(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1290;BA.debugLine="Sub SetOnClear(module As Object, methodName As Str";
 //BA.debugLineNum = 1291;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1292;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1293;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1294;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1295;BA.debugLine="SetAttr(CreateMap(\"@md-clear\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@md-clear"),(Object)(_methodname)}));
 //BA.debugLineNum = 1297;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonclick(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 1320;BA.debugLine="Sub SetOnClick(module As Object, methodName As Str";
 //BA.debugLineNum = 1321;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1322;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1323;BA.debugLine="SetAttrSingle(\"@click\", methodName)";
_setattrsingle("@click",_methodname);
 //BA.debugLineNum = 1324;BA.debugLine="vue.SetMethod(module, methodName)";
_vue._setmethod /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 1325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1326;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonclickstop(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 1339;BA.debugLine="Sub SetOnClickStop(module As Object, methodName As";
 //BA.debugLineNum = 1340;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1341;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1342;BA.debugLine="SetAttrSingle(\"@click.stop\", methodName)";
_setattrsingle("@click.stop",_methodname);
 //BA.debugLineNum = 1343;BA.debugLine="vue.SetMethod(module, methodName)";
_vue._setmethod /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 1344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondragend(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1382;BA.debugLine="Sub SetOnDragEnd(module As Object, methodName As S";
 //BA.debugLineNum = 1383;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1384;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1385;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1386;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1387;BA.debugLine="SetAttr(CreateMap(\"@dragend\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@dragend"),(Object)(_methodname)}));
 //BA.debugLineNum = 1389;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1390;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1391;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondragenter(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1393;BA.debugLine="Sub SetOnDragEnter(module As Object, methodName As";
 //BA.debugLineNum = 1394;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1395;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1396;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1397;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1398;BA.debugLine="SetAttr(CreateMap(\"@dragenter\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@dragenter"),(Object)(_methodname)}));
 //BA.debugLineNum = 1400;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1401;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1402;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondragover(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1359;BA.debugLine="Sub SetOnDragOver(module As Object, methodName As";
 //BA.debugLineNum = 1360;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1361;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1362;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1363;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1364;BA.debugLine="SetAttr(CreateMap(\"@dragover\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@dragover"),(Object)(_methodname)}));
 //BA.debugLineNum = 1366;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1367;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1368;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondragstart(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1370;BA.debugLine="Sub SetOnDragStart(module As Object, methodName As";
 //BA.debugLineNum = 1371;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1372;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1373;BA.debugLine="SetDraggable(True)";
_setdraggable(__c.True);
 //BA.debugLineNum = 1374;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1375;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1376;BA.debugLine="SetAttr(CreateMap(\"@dragstart\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@dragstart"),(Object)(_methodname)}));
 //BA.debugLineNum = 1378;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setondrop(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1404;BA.debugLine="Sub SetOnDrop(module As Object, methodName As Stri";
 //BA.debugLineNum = 1405;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1406;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1407;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1408;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1409;BA.debugLine="SetAttr(CreateMap(\"@drop\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@drop"),(Object)(_methodname)}));
 //BA.debugLineNum = 1411;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1412;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1413;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonevent(Object _module,String _eventname,String _methodname,String _args) throws Exception{
 //BA.debugLineNum = 1329;BA.debugLine="Sub SetOnEvent(module As Object, eventName As Stri";
 //BA.debugLineNum = 1330;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1331;BA.debugLine="eventName = eventName.tolowercase";
_eventname = _eventname.toLowerCase();
 //BA.debugLineNum = 1332;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1333;BA.debugLine="SetAttrSingle($\"v-on:${eventName}\"$, methodName &";
_setattrsingle(("v-on:"+__c.SmartStringFormatter("",(Object)(_eventname))+""),_methodname+("("+__c.SmartStringFormatter("",(Object)(_args))+")"));
 //BA.debugLineNum = 1334;BA.debugLine="vue.SetMethod(module, methodName)";
_vue._setmethod /*b4j.example.bananovue*/ (_module,_methodname);
 //BA.debugLineNum = 1335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonfocus(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1279;BA.debugLine="Sub SetOnFocus(module As Object, methodName As Str";
 //BA.debugLineNum = 1280;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1281;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1282;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1283;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1284;BA.debugLine="SetAttr(CreateMap(\"@focus\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@focus"),(Object)(_methodname)}));
 //BA.debugLineNum = 1286;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setoninput(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1267;BA.debugLine="Sub SetOnInput(module As Object, methodName As Str";
 //BA.debugLineNum = 1268;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1269;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1270;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1271;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1272;BA.debugLine="SetAttr(CreateMap(\"@input\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@input"),(Object)(_methodname)}));
 //BA.debugLineNum = 1274;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonkeydownenter(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1553;BA.debugLine="Sub SetOnKeydownEnter(eventHandler As Object, meth";
 //BA.debugLineNum = 1554;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1555;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1556;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1557;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1558;BA.debugLine="SetAttr(CreateMap(\"@keydown.enter\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@keydown.enter"),(Object)(_methodname)}));
 //BA.debugLineNum = 1560;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1561;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1562;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonmouseout(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 662;BA.debugLine="Sub SetOnMouseOut(module As Object, methodName As";
 //BA.debugLineNum = 663;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 664;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 665;BA.debugLine="SetAttr(CreateMap(\"@mouseout\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mouseout"),(Object)(_methodname)}));
 //BA.debugLineNum = 666;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 667;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 668;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 669;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 670;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setonmouseover(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 672;BA.debugLine="Sub SetOnMouseOver(module As Object, methodName As";
 //BA.debugLineNum = 673;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 674;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 675;BA.debugLine="SetAttr(CreateMap(\"@mouseover\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mouseover"),(Object)(_methodname)}));
 //BA.debugLineNum = 676;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 677;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 678;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 679;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 680;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setontouchstart(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 1348;BA.debugLine="Sub SetOnTouchStart(module As Object, methodName A";
 //BA.debugLineNum = 1349;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1350;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1351;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 1352;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 1353;BA.debugLine="SetAttr(CreateMap(\"@touchstart\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@touchstart"),(Object)(_methodname)}));
 //BA.debugLineNum = 1355;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 1356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setpadding(String _spt,String _spb,String _spl,String _spr) throws Exception{
 //BA.debugLineNum = 1428;BA.debugLine="Sub SetPadding(sPT As String, sPB As String, sPL A";
 //BA.debugLineNum = 1429;BA.debugLine="SetStyleSingle(\"padding-top\", sPT)";
_setstylesingle("padding-top",(Object)(_spt));
 //BA.debugLineNum = 1430;BA.debugLine="SetStyleSingle(\"padding-bottom\", sPB)";
_setstylesingle("padding-bottom",(Object)(_spb));
 //BA.debugLineNum = 1431;BA.debugLine="SetStyleSingle(\"padding-left\", sPL)";
_setstylesingle("padding-left",(Object)(_spl));
 //BA.debugLineNum = 1432;BA.debugLine="SetStyleSingle(\"padding-right\", sPR)";
_setstylesingle("padding-right",(Object)(_spr));
 //BA.debugLineNum = 1433;BA.debugLine="PT = sPT";
_pt = _spt;
 //BA.debugLineNum = 1434;BA.debugLine="PB = sPB";
_pb = _spb;
 //BA.debugLineNum = 1435;BA.debugLine="PL = sPL";
_pl = _spl;
 //BA.debugLineNum = 1436;BA.debugLine="PR = sPR";
_pr = _spr;
 //BA.debugLineNum = 1437;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1438;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setpaddingall(Object _p) throws Exception{
 //BA.debugLineNum = 1022;BA.debugLine="Sub SetPaddingAll(p As Object) As VMElement";
 //BA.debugLineNum = 1023;BA.debugLine="SetStyle(CreateMap(\"padding\":p))";
_setstyle(__c.createMap(new Object[] {(Object)("padding"),_p}));
 //BA.debugLineNum = 1024;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1025;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setplaceholder(String _varplaceholder) throws Exception{
 //BA.debugLineNum = 535;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
 //BA.debugLineNum = 536;BA.debugLine="Element.SetAttrPlaceHolder(varPlaceholder)";
_element._setattrplaceholder /*b4j.example.vuehtml*/ (_varplaceholder);
 //BA.debugLineNum = 537;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setpointer(boolean _b) throws Exception{
 //BA.debugLineNum = 1314;BA.debugLine="Sub SetPointer(b As Boolean) As VMElement";
 //BA.debugLineNum = 1315;BA.debugLine="Element.SetPointer(True)";
_element._setpointer /*b4j.example.vuehtml*/ (__c.True);
 //BA.debugLineNum = 1316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setposition(String _sposition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1451;BA.debugLine="Sub SetPosition(sposition As String) As VMElement";
 //BA.debugLineNum = 1452;BA.debugLine="If sposition = \"\" Then Return Me";
if ((_sposition).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1453;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1454;BA.debugLine="SetAttrSingle(\"position\", sposition)";
_setattrsingle("position",_sposition);
 //BA.debugLineNum = 1455;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 1457;BA.debugLine="Dim pp As String = $\"${ID}position\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"position");
 //BA.debugLineNum = 1458;BA.debugLine="vue.SetStateSingle(pp, sposition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_sposition));
 //BA.debugLineNum = 1459;BA.debugLine="Bind(\":position\", pp)";
_bind(":position",_pp);
 //BA.debugLineNum = 1460;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1461;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMEle";
 //BA.debugLineNum = 216;BA.debugLine="SetRow(sRow)";
_setrow(_srow);
 //BA.debugLineNum = 217;BA.debugLine="SetCell(sCol)";
_setcell(_scol);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setref(String _varref) throws Exception{
 //BA.debugLineNum = 701;BA.debugLine="Sub SetRef(varRef As String) As VMElement";
 //BA.debugLineNum = 702;BA.debugLine="If varRef <> \"\" Then";
if ((_varref).equals("") == false) { 
 //BA.debugLineNum = 703;BA.debugLine="SetAttr(CreateMap(\"ref\": varRef))";
_setattr(__c.createMap(new Object[] {(Object)("ref"),(Object)(_varref)}));
 };
 //BA.debugLineNum = 705;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 706;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrequired(boolean _b) throws Exception{
 //BA.debugLineNum = 1056;BA.debugLine="Sub SetRequired(b As Boolean) As VMElement";
 //BA.debugLineNum = 1057;BA.debugLine="IsRequired = b";
_isrequired = _b;
 //BA.debugLineNum = 1058;BA.debugLine="bUsesRequired = True";
_busesrequired = __c.True;
 //BA.debugLineNum = 1059;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1060;BA.debugLine="Element.SetAttrSingle(\"required\", b)";
_element._setattrsingle /*b4j.example.vuehtml*/ ("required",BA.ObjectToString(_b));
 //BA.debugLineNum = 1061;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 1063;BA.debugLine="If ID = \"\" Then Return Me";
if ((_id).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1064;BA.debugLine="vue.SetStateSingle(reqKey, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_reqkey,(Object)(_b));
 //BA.debugLineNum = 1065;BA.debugLine="Element.SetAttr(\":required\", reqKey)";
_element._setattr /*b4j.example.vuehtml*/ (":required",_reqkey);
 //BA.debugLineNum = 1066;BA.debugLine="vue.SetStateSingle(errKey, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_errkey,(Object)(__c.False));
 //BA.debugLineNum = 1067;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1068;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setright(String _sright) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1507;BA.debugLine="Sub SetRight(sright As String) As VMElement";
 //BA.debugLineNum = 1508;BA.debugLine="If sright = \"\" Then Return Me";
if ((_sright).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1509;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1510;BA.debugLine="SetAttrSingle(\"right\", sright)";
_setattrsingle("right",_sright);
 //BA.debugLineNum = 1511;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 1513;BA.debugLine="Dim pp As String = $\"${ID}right\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"right");
 //BA.debugLineNum = 1514;BA.debugLine="vue.SetStateSingle(pp, sright)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_sright));
 //BA.debugLineNum = 1515;BA.debugLine="Bind(\":right\", pp)";
_bind(":right",_pp);
 //BA.debugLineNum = 1516;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1517;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded() throws Exception{
 //BA.debugLineNum = 1564;BA.debugLine="Sub SetRounded As VMElement";
 //BA.debugLineNum = 1565;BA.debugLine="AddClass(\"rounded\")";
_addclass("rounded");
 //BA.debugLineNum = 1566;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1567;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_bottom(String _size) throws Exception{
 //BA.debugLineNum = 1604;BA.debugLine="Sub SetRounded_Bottom(Size As String) As VMElement";
 //BA.debugLineNum = 1605;BA.debugLine="If Size = \"\" Then";
if ((_size).equals("")) { 
 //BA.debugLineNum = 1606;BA.debugLine="AddClass(\"rounded-b\")";
_addclass("rounded-b");
 }else {
 //BA.debugLineNum = 1608;BA.debugLine="AddClass($\"rounded-b-${Size}\"$)";
_addclass(("rounded-b-"+__c.SmartStringFormatter("",(Object)(_size))+""));
 };
 //BA.debugLineNum = 1610;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_bottomleft(String _size) throws Exception{
 //BA.debugLineNum = 1649;BA.debugLine="Sub SetRounded_BottomLeft(Size As String) As VMEle";
 //BA.debugLineNum = 1650;BA.debugLine="If Size = \"\" Then";
if ((_size).equals("")) { 
 //BA.debugLineNum = 1651;BA.debugLine="AddClass(\"rounded-bl\")";
_addclass("rounded-bl");
 }else {
 //BA.debugLineNum = 1653;BA.debugLine="AddClass($\"rounded-bl-${Size}\"$)";
_addclass(("rounded-bl-"+__c.SmartStringFormatter("",(Object)(_size))+""));
 };
 //BA.debugLineNum = 1655;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1656;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_bottomright(String _size) throws Exception{
 //BA.debugLineNum = 1658;BA.debugLine="Sub SetRounded_BottomRight(Size As String) As VMEl";
 //BA.debugLineNum = 1659;BA.debugLine="If Size = \"\" Then";
if ((_size).equals("")) { 
 //BA.debugLineNum = 1660;BA.debugLine="AddClass(\"rounded-br\")";
_addclass("rounded-br");
 }else {
 //BA.debugLineNum = 1662;BA.debugLine="AddClass($\"rounded-br-${Size}\"$)";
_addclass(("rounded-br-"+__c.SmartStringFormatter("",(Object)(_size))+""));
 };
 //BA.debugLineNum = 1664;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1665;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_circle() throws Exception{
 //BA.debugLineNum = 1590;BA.debugLine="Sub SetRounded_Circle As VMElement";
 //BA.debugLineNum = 1591;BA.debugLine="AddClass(\"rounded-circle\")";
_addclass("rounded-circle");
 //BA.debugLineNum = 1592;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1593;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_left(String _size) throws Exception{
 //BA.debugLineNum = 1622;BA.debugLine="Sub SetRounded_Left(Size As String) As VMElement";
 //BA.debugLineNum = 1623;BA.debugLine="If Size = \"\" Then";
if ((_size).equals("")) { 
 //BA.debugLineNum = 1624;BA.debugLine="AddClass(\"rounded-l\")";
_addclass("rounded-l");
 }else {
 //BA.debugLineNum = 1626;BA.debugLine="AddClass($\"rounded-l-${Size}\"$)";
_addclass(("rounded-l-"+__c.SmartStringFormatter("",(Object)(_size))+""));
 };
 //BA.debugLineNum = 1628;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1629;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_lg() throws Exception{
 //BA.debugLineNum = 1574;BA.debugLine="Sub SetRounded_LG As VMElement";
 //BA.debugLineNum = 1575;BA.debugLine="AddClass(\"rounded-lg\")";
_addclass("rounded-lg");
 //BA.debugLineNum = 1576;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1577;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_pill() throws Exception{
 //BA.debugLineNum = 1585;BA.debugLine="Sub SetRounded_Pill As VMElement";
 //BA.debugLineNum = 1586;BA.debugLine="AddClass(\"rounded-pill\")";
_addclass("rounded-pill");
 //BA.debugLineNum = 1587;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1588;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_right(String _size) throws Exception{
 //BA.debugLineNum = 1613;BA.debugLine="Sub SetRounded_Right(Size As String) As VMElement";
 //BA.debugLineNum = 1614;BA.debugLine="If Size = \"\" Then";
if ((_size).equals("")) { 
 //BA.debugLineNum = 1615;BA.debugLine="AddClass(\"rounded-r\")";
_addclass("rounded-r");
 }else {
 //BA.debugLineNum = 1617;BA.debugLine="AddClass($\"rounded-r-${Size}\"$)";
_addclass(("rounded-r-"+__c.SmartStringFormatter("",(Object)(_size))+""));
 };
 //BA.debugLineNum = 1619;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1620;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_sm() throws Exception{
 //BA.debugLineNum = 1569;BA.debugLine="Sub SetRounded_SM As VMElement";
 //BA.debugLineNum = 1570;BA.debugLine="AddClass(\"rounded-sm\")";
_addclass("rounded-sm");
 //BA.debugLineNum = 1571;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1572;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_top(String _size) throws Exception{
 //BA.debugLineNum = 1595;BA.debugLine="Sub SetRounded_Top(Size As String) As VMElement";
 //BA.debugLineNum = 1596;BA.debugLine="If Size = \"\" Then";
if ((_size).equals("")) { 
 //BA.debugLineNum = 1597;BA.debugLine="AddClass(\"rounded-t\")";
_addclass("rounded-t");
 }else {
 //BA.debugLineNum = 1599;BA.debugLine="AddClass($\"rounded-t-${Size}\"$)";
_addclass(("rounded-t-"+__c.SmartStringFormatter("",(Object)(_size))+""));
 };
 //BA.debugLineNum = 1601;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1602;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_topleft(String _size) throws Exception{
 //BA.debugLineNum = 1631;BA.debugLine="Sub SetRounded_TopLeft(Size As String) As VMElemen";
 //BA.debugLineNum = 1632;BA.debugLine="If Size = \"\" Then";
if ((_size).equals("")) { 
 //BA.debugLineNum = 1633;BA.debugLine="AddClass(\"rounded-tl\")";
_addclass("rounded-tl");
 }else {
 //BA.debugLineNum = 1635;BA.debugLine="AddClass($\"rounded-tl-${Size}\"$)";
_addclass(("rounded-tl-"+__c.SmartStringFormatter("",(Object)(_size))+""));
 };
 //BA.debugLineNum = 1637;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1638;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_topright(String _size) throws Exception{
 //BA.debugLineNum = 1640;BA.debugLine="Sub SetRounded_TopRight(Size As String) As VMEleme";
 //BA.debugLineNum = 1641;BA.debugLine="If Size = \"\" Then";
if ((_size).equals("")) { 
 //BA.debugLineNum = 1642;BA.debugLine="AddClass(\"rounded-tr\")";
_addclass("rounded-tr");
 }else {
 //BA.debugLineNum = 1644;BA.debugLine="AddClass($\"rounded-tr-${Size}\"$)";
_addclass(("rounded-tr-"+__c.SmartStringFormatter("",(Object)(_size))+""));
 };
 //BA.debugLineNum = 1646;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1647;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrounded_xl() throws Exception{
 //BA.debugLineNum = 1579;BA.debugLine="Sub SetRounded_XL As VMElement";
 //BA.debugLineNum = 1580;BA.debugLine="AddClass(\"rounded-xl\")";
_addclass("rounded-xl");
 //BA.debugLineNum = 1581;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1582;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setrow(String _srow) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetRow(sRow As String) As VMElement";
 //BA.debugLineNum = 211;BA.debugLine="R = sRow";
_r = _srow;
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setslot(String _sltvalue) throws Exception{
 //BA.debugLineNum = 635;BA.debugLine="Sub SetSlot(sltValue As String) As VMElement";
 //BA.debugLineNum = 636;BA.debugLine="Element.SetAttrSingle(\"slot\", sltValue)";
_element._setattrsingle /*b4j.example.vuehtml*/ ("slot",_sltvalue);
 //BA.debugLineNum = 637;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 638;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setslotscope(String _sltvalue) throws Exception{
 //BA.debugLineNum = 640;BA.debugLine="Sub SetSlotScope(sltValue As String) As VMElement";
 //BA.debugLineNum = 641;BA.debugLine="Element.SetAttrSingle(\"slot-scope\", sltValue)";
_element._setattrsingle /*b4j.example.vuehtml*/ ("slot-scope",_sltvalue);
 //BA.debugLineNum = 642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setsrc(String _s,boolean _bbind) throws Exception{
 //BA.debugLineNum = 1105;BA.debugLine="Sub SetSRC(s As String, bbind As Boolean) As VMEle";
 //BA.debugLineNum = 1106;BA.debugLine="If bbind Then";
if (_bbind) { 
 //BA.debugLineNum = 1107;BA.debugLine="SetAttr(CreateMap(\":src\":s))";
_setattr(__c.createMap(new Object[] {(Object)(":src"),(Object)(_s)}));
 }else {
 //BA.debugLineNum = 1109;BA.debugLine="SetAttr(CreateMap(\"src\":s))";
_setattr(__c.createMap(new Object[] {(Object)("src"),(Object)(_s)}));
 };
 //BA.debugLineNum = 1111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetStatic(b As Boolean) As VMElement";
 //BA.debugLineNum = 206;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 991;BA.debugLine="Sub SetStyle(m As Map) As VMElement";
 //BA.debugLineNum = 992;BA.debugLine="Element.SetStyles(m)";
_element._setstyles /*b4j.example.vuehtml*/ (_m);
 //BA.debugLineNum = 993;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 994;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setstyleround(String _size) throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Sub SetStyleRound(size As String) As VMElement";
 //BA.debugLineNum = 401;BA.debugLine="Element.SetStyleRound(size)";
_element._setstyleround /*b4j.example.vuehtml*/ (_size);
 //BA.debugLineNum = 402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setstylesingle(String _prop,Object _vals) throws Exception{
anywheresoftware.b4a.objects.collections.Map _attr = null;
 //BA.debugLineNum = 456;BA.debugLine="Sub SetStyleSingle(prop As String, vals As Object)";
 //BA.debugLineNum = 457;BA.debugLine="Dim attr As Map = CreateMap()";
_attr = new anywheresoftware.b4a.objects.collections.Map();
_attr = __c.createMap(new Object[] {});
 //BA.debugLineNum = 458;BA.debugLine="attr.Put(prop, vals)";
_attr.Put((Object)(_prop),_vals);
 //BA.debugLineNum = 459;BA.debugLine="SetStyle(attr)";
_setstyle(_attr);
 //BA.debugLineNum = 460;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 561;BA.debugLine="Sub SetTabIndex(ti As String) As VMElement";
 //BA.debugLineNum = 562;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 563;BA.debugLine="If ti = \"0\" Then Return Me";
if ((_ti).equals("0")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 564;BA.debugLine="If ti = Null Then Return Me";
if (_ti== null) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 565;BA.debugLine="Element.SetTabIndex(ti)";
_element._settabindex /*b4j.example.vuehtml*/ (_ti);
 //BA.debugLineNum = 566;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 567;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settag(String _t) throws Exception{
 //BA.debugLineNum = 1169;BA.debugLine="Sub SetTag(t As String) As VMElement";
 //BA.debugLineNum = 1170;BA.debugLine="Element.SetTag(t)";
_element._settag /*b4j.example.vuehtml*/ (_t);
 //BA.debugLineNum = 1171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settagspan(boolean _b) throws Exception{
 //BA.debugLineNum = 1129;BA.debugLine="Sub SetTagSpan(b As Boolean) As VMElement";
 //BA.debugLineNum = 1130;BA.debugLine="Element.SetTag(\"span\")";
_element._settag /*b4j.example.vuehtml*/ ("span");
 //BA.debugLineNum = 1131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settemplate(String _tmp) throws Exception{
 //BA.debugLineNum = 781;BA.debugLine="Sub SetTemplate(tmp As String) As VMElement";
 //BA.debugLineNum = 782;BA.debugLine="Element.Clear";
_element._clear /*b4j.example.vuehtml*/ ();
 //BA.debugLineNum = 783;BA.debugLine="SetText(tmp)";
_settext(_tmp);
 //BA.debugLineNum = 784;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 785;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settext(String _t) throws Exception{
 //BA.debugLineNum = 1186;BA.debugLine="Sub SetText(t As String) As VMElement";
 //BA.debugLineNum = 1187;BA.debugLine="Element.SetText(t)";
_element._settext /*b4j.example.vuehtml*/ (_t);
 //BA.debugLineNum = 1188;BA.debugLine="hasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 1189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settextaligncenter() throws Exception{
 //BA.debugLineNum = 624;BA.debugLine="Sub SetTextAlignCenter As VMElement";
 //BA.debugLineNum = 625;BA.debugLine="SetStyle(CreateMap(\"text-align\": \"center\"))";
_setstyle(__c.createMap(new Object[] {(Object)("text-align"),(Object)("center")}));
 //BA.debugLineNum = 626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settextcenter() throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub SetTextCenter As VMElement";
 //BA.debugLineNum = 308;BA.debugLine="AddClass(\"text-center\")";
_addclass("text-center");
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 976;BA.debugLine="Sub SetTextColor(varColor As String) As VMElement";
 //BA.debugLineNum = 977;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 978;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 979;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 980;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 983;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 984;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 985;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 986;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 987;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 988;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 989;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setto(String _t) throws Exception{
 //BA.debugLineNum = 1037;BA.debugLine="Sub SetTo(t As String) As VMElement";
 //BA.debugLineNum = 1038;BA.debugLine="Element.SetAttrSingle(\"to\", t)";
_element._setattrsingle /*b4j.example.vuehtml*/ ("to",_t);
 //BA.debugLineNum = 1039;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1040;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settop(String _stop) throws Exception{
String _pp = "";
 //BA.debugLineNum = 1465;BA.debugLine="Sub SetTop(stop As String) As VMElement";
 //BA.debugLineNum = 1466;BA.debugLine="If stop = \"\" Then Return Me";
if ((_stop).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1467;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 1468;BA.debugLine="SetAttrSingle(\"top\", stop)";
_setattrsingle("top",_stop);
 //BA.debugLineNum = 1469;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 };
 //BA.debugLineNum = 1471;BA.debugLine="Dim pp As String = $\"${ID}top\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"top");
 //BA.debugLineNum = 1472;BA.debugLine="vue.SetStateSingle(pp, stop)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_stop));
 //BA.debugLineNum = 1473;BA.debugLine="Bind(\":top\", pp)";
_bind(":top",_pp);
 //BA.debugLineNum = 1474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _settype(String _stypeof) throws Exception{
 //BA.debugLineNum = 645;BA.debugLine="Sub SetType(stypeOf As String) As VMElement";
 //BA.debugLineNum = 646;BA.debugLine="Element.SetAttrSingle(\"type\", stypeOf)";
_element._setattrsingle /*b4j.example.vuehtml*/ ("type",_stypeof);
 //BA.debugLineNum = 647;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 648;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setuncheckedvalue(Object _suncheckedvalue) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetUncheckedValue(suncheckedValue As Object) A";
 //BA.debugLineNum = 261;BA.debugLine="UncheckedValue = suncheckedValue";
_uncheckedvalue = _suncheckedvalue;
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvalue(String _valuename,boolean _bbind) throws Exception{
 //BA.debugLineNum = 767;BA.debugLine="Sub SetValue(valueName As String, bbind As Boolean";
 //BA.debugLineNum = 768;BA.debugLine="If bbind Then";
if (_bbind) { 
 //BA.debugLineNum = 769;BA.debugLine="RemoveAttr(\"value\")";
_removeattr("value");
 //BA.debugLineNum = 770;BA.debugLine="valueName = valueName.tolowercase";
_valuename = _valuename.toLowerCase();
 //BA.debugLineNum = 771;BA.debugLine="SetAttr(CreateMap(\":value\":valueName))";
_setattr(__c.createMap(new Object[] {(Object)(":value"),(Object)(_valuename)}));
 }else {
 //BA.debugLineNum = 773;BA.debugLine="Value = valueName";
_value = (Object)(_valuename);
 //BA.debugLineNum = 774;BA.debugLine="RemoveAttr(\":value\")";
_removeattr(":value");
 //BA.debugLineNum = 775;BA.debugLine="SetAttr(CreateMap(\"value\":valueName))";
_setattr(__c.createMap(new Object[] {(Object)("value"),(Object)(_valuename)}));
 };
 //BA.debugLineNum = 777;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 778;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvbind(String _t) throws Exception{
 //BA.debugLineNum = 728;BA.debugLine="Sub SetVBind(t As String) As VMElement";
 //BA.debugLineNum = 729;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 730;BA.debugLine="SetAttr(CreateMap(\"v-bind\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-bind"),(Object)(_t)}));
 //BA.debugLineNum = 731;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 732;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvbindis(String _t) throws Exception{
 //BA.debugLineNum = 734;BA.debugLine="Sub SetVBindIs(t As String) As VMElement";
 //BA.debugLineNum = 735;BA.debugLine="t = t.tolowercase";
_t = _t.toLowerCase();
 //BA.debugLineNum = 736;BA.debugLine="SetAttr(CreateMap(\"v-bind:is\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-bind:is"),(Object)(_t)}));
 //BA.debugLineNum = 737;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 738;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvcloak() throws Exception{
 //BA.debugLineNum = 556;BA.debugLine="Sub SetVCloak As VMElement";
 //BA.debugLineNum = 557;BA.debugLine="Element.setvcloak";
_element._setvcloak /*b4j.example.vuehtml*/ ();
 //BA.debugLineNum = 558;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 559;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvelse(Object _t) throws Exception{
 //BA.debugLineNum = 713;BA.debugLine="Sub SetVElse(t As Object) As VMElement";
 //BA.debugLineNum = 714;BA.debugLine="SetAttr(CreateMap(\"v-else\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-else"),_t}));
 //BA.debugLineNum = 715;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 716;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvelseif(Object _t) throws Exception{
 //BA.debugLineNum = 718;BA.debugLine="Sub SetVElseIf(t As Object) As VMElement";
 //BA.debugLineNum = 719;BA.debugLine="SetAttr(CreateMap(\"v-else-if\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-else-if"),_t}));
 //BA.debugLineNum = 720;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 721;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setverticalalignmiddle() throws Exception{
 //BA.debugLineNum = 1119;BA.debugLine="Sub SetVerticalAlignMiddle As VMElement";
 //BA.debugLineNum = 1120;BA.debugLine="SetStyle(CreateMap(\"vertical-align\": \"middle\"))";
_setstyle(__c.createMap(new Object[] {(Object)("vertical-align"),(Object)("middle")}));
 //BA.debugLineNum = 1121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 756;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 757;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 758;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 759;BA.debugLine="If vue.StateExists(dataSource) = False Then vue.S";
if (_vue._stateexists /*boolean*/ (_datasource)==__c.False) { 
_vue._setstatesingle /*b4j.example.bananovue*/ (_datasource,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));};
 //BA.debugLineNum = 760;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 761;BA.debugLine="SetAttr(CreateMap(\"v-for\": sline))";
_setattr(__c.createMap(new Object[] {(Object)("v-for"),(Object)(_sline)}));
 //BA.debugLineNum = 762;BA.debugLine="RemoveAttr(\"ref\")";
_removeattr("ref");
 //BA.debugLineNum = 763;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 764;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvhtml(String _h) throws Exception{
 //BA.debugLineNum = 787;BA.debugLine="Sub SetVHtml(h As String) As VMElement";
 //BA.debugLineNum = 788;BA.debugLine="If h = \"\" Then Return Me";
if ((_h).equals("")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 789;BA.debugLine="h = h.tolowercase";
_h = _h.toLowerCase();
 //BA.debugLineNum = 790;BA.debugLine="If vue.StateExists(h) = False Then vue.SetStateSi";
if (_vue._stateexists /*boolean*/ (_h)==__c.False) { 
_vue._setstatesingle /*b4j.example.bananovue*/ (_h,__c.Null);};
 //BA.debugLineNum = 791;BA.debugLine="Element.SetAttrSingle(\"v-html\", h)";
_element._setattrsingle /*b4j.example.vuehtml*/ ("v-html",_h);
 //BA.debugLineNum = 792;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 827;BA.debugLine="Sub SetVIf(vif As String) As VMElement";
 //BA.debugLineNum = 828;BA.debugLine="vif = vif.ToLowerCase";
_vif = _vif.toLowerCase();
 //BA.debugLineNum = 829;BA.debugLine="If vue.HasState(vif) = False Then vue.SetStateFal";
if (_vue._hasstate /*boolean*/ (_vif)==__c.False) { 
_vue._setstatefalse /*b4j.example.bananovue*/ (_vif);};
 //BA.debugLineNum = 830;BA.debugLine="Element.SetVIf(vif)";
_element._setvif /*b4j.example.vuehtml*/ (_vif);
 //BA.debugLineNum = 831;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 832;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 528;BA.debugLine="Sub SetVisible(b As Boolean) As VMElement";
 //BA.debugLineNum = 529;BA.debugLine="IsVisible = b";
_isvisible = _b;
 //BA.debugLineNum = 530;BA.debugLine="SetVShow(showKey)";
_setvshow(_showkey);
 //BA.debugLineNum = 531;BA.debugLine="vue.SetStateSingle(showKey, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_showkey,(Object)(_b));
 //BA.debugLineNum = 532;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 533;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 1150;BA.debugLine="Sub SetVModel(k As String) As VMElement";
 //BA.debugLineNum = 1151;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 1152;BA.debugLine="bUsesVModel = False";
_busesvmodel = __c.False;
 //BA.debugLineNum = 1153;BA.debugLine="If k = \"value\" Then Return Me";
if ((_k).equals("value")) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 1154;BA.debugLine="vmodel = k";
_vmodel = _k;
 //BA.debugLineNum = 1155;BA.debugLine="If vue.HasState(k) = False Then";
if (_vue._hasstate /*boolean*/ (_k)==__c.False) { 
 //BA.debugLineNum = 1156;BA.debugLine="vue.SetData(k, Null)";
_vue._setdata /*b4j.example.bananovue*/ (_k,__c.Null);
 };
 //BA.debugLineNum = 1158;BA.debugLine="Element.SetAttrSingle(\"v-model\", k)";
_element._setattrsingle /*b4j.example.vuehtml*/ ("v-model",_k);
 //BA.debugLineNum = 1159;BA.debugLine="bUsesVModel = True";
_busesvmodel = __c.True;
 //BA.debugLineNum = 1160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 1161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvon(Object _t) throws Exception{
 //BA.debugLineNum = 723;BA.debugLine="Sub SetVOn(t As Object) As VMElement";
 //BA.debugLineNum = 724;BA.debugLine="SetAttr(CreateMap(\"v-on\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-on"),_t}));
 //BA.debugLineNum = 725;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 726;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 740;BA.debugLine="Sub SetVOnce(t As Boolean) As VMElement";
 //BA.debugLineNum = 741;BA.debugLine="If t = False Then Return Me";
if (_t==__c.False) { 
if (true) return (b4j.example.vmelement)(this);};
 //BA.debugLineNum = 742;BA.debugLine="SetAttrLoose(\"v-once\")";
_setattrloose("v-once");
 //BA.debugLineNum = 743;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 744;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 834;BA.debugLine="Sub SetVShow(vif As String) As VMElement";
 //BA.debugLineNum = 835;BA.debugLine="vif = vif.ToLowerCase";
_vif = _vif.toLowerCase();
 //BA.debugLineNum = 836;BA.debugLine="bUsesShow = False";
_busesshow = __c.False;
 //BA.debugLineNum = 837;BA.debugLine="If vif <> \"show\" Then";
if ((_vif).equals("show") == false) { 
 //BA.debugLineNum = 838;BA.debugLine="bUsesShow = True";
_busesshow = __c.True;
 //BA.debugLineNum = 839;BA.debugLine="If vue.HasState(vif) = False Then vue.SetStateFa";
if (_vue._hasstate /*boolean*/ (_vif)==__c.False) { 
_vue._setstatefalse /*b4j.example.bananovue*/ (_vif);};
 //BA.debugLineNum = 840;BA.debugLine="Element.SetVShow(vif)";
_element._setvshow /*b4j.example.vuehtml*/ (_vif);
 };
 //BA.debugLineNum = 842;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setvtext(Object _t) throws Exception{
 //BA.debugLineNum = 708;BA.debugLine="Sub SetVText(t As Object) As VMElement";
 //BA.debugLineNum = 709;BA.debugLine="SetAttr(CreateMap(\"v-text\": t))";
_setattr(__c.createMap(new Object[] {(Object)("v-text"),_t}));
 //BA.debugLineNum = 710;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 711;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 593;BA.debugLine="Sub SetWidth(w As String) As VMElement";
 //BA.debugLineNum = 594;BA.debugLine="SetStyle(CreateMap(\"width\":w))";
_setstyle(__c.createMap(new Object[] {(Object)("width"),(Object)(_w)}));
 //BA.debugLineNum = 595;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 596;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _show() throws Exception{
 //BA.debugLineNum = 514;BA.debugLine="Sub Show As VMElement";
 //BA.debugLineNum = 515;BA.debugLine="IsVisible = True";
_isvisible = __c.True;
 //BA.debugLineNum = 516;BA.debugLine="vue.SetStateSingle(showKey, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_showkey,(Object)(__c.True));
 //BA.debugLineNum = 517;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 518;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _showitem(String _elid) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Sub ShowItem(elID As String) As VMElement";
 //BA.debugLineNum = 425;BA.debugLine="vue.SetStateSingle($\"${elID}show\"$, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"show"),(Object)(__c.True));
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 1202;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 1203;BA.debugLine="If bUsesStyles = False Then";
if (_busesstyles==__c.False) { 
 //BA.debugLineNum = 1205;BA.debugLine="RemoveAttr(\":style\")";
_removeattr(":style");
 };
 //BA.debugLineNum = 1207;BA.debugLine="If bUsesRequired = False Then";
if (_busesrequired==__c.False) { 
 //BA.debugLineNum = 1209;BA.debugLine="RemoveAttr(\":required\")";
_removeattr(":required");
 };
 //BA.debugLineNum = 1211;BA.debugLine="If bUsedDisabled = False Then";
if (_buseddisabled==__c.False) { 
 //BA.debugLineNum = 1213;BA.debugLine="RemoveAttr(\":disabled\")";
_removeattr(":disabled");
 };
 //BA.debugLineNum = 1215;BA.debugLine="If bUsesShow = False Then";
if (_busesshow==__c.False) { 
 //BA.debugLineNum = 1216;BA.debugLine="RemoveAttr(\"v-show\")";
_removeattr("v-show");
 };
 //BA.debugLineNum = 1219;BA.debugLine="If bUsesVModel = False Then";
if (_busesvmodel==__c.False) { 
 //BA.debugLineNum = 1220;BA.debugLine="RemoveAttr(\"v-model\")";
_removeattr("v-model");
 };
 //BA.debugLineNum = 1223;BA.debugLine="If classList.Size = 0 Then";
if (_classlist.getSize()==0) { 
 //BA.debugLineNum = 1224;BA.debugLine="bUsesClass = False";
_busesclass = __c.False;
 }else {
 //BA.debugLineNum = 1226;BA.debugLine="vue.SetData(classKey, classList)";
_vue._setdata /*b4j.example.bananovue*/ (_classkey,(Object)(_classlist.getObject()));
 //BA.debugLineNum = 1227;BA.debugLine="SetAttrSingle(\":class\", classKey)";
_setattrsingle(":class",_classkey);
 //BA.debugLineNum = 1228;BA.debugLine="bUsesClass = True";
_busesclass = __c.True;
 };
 //BA.debugLineNum = 1230;BA.debugLine="If bUsesClass = False Then";
if (_busesclass==__c.False) { 
 //BA.debugLineNum = 1231;BA.debugLine="RemoveAttr(\":class\")";
_removeattr(":class");
 };
 //BA.debugLineNum = 1233;BA.debugLine="If DesignMode Then";
if (_designmode) { 
 //BA.debugLineNum = 1234;BA.debugLine="RemoveAttributes(Array(\"v-show\", \":disabled\", \":";
_removeattributes(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("v-show"),(Object)(":disabled"),(Object)(":required"),(Object)(":class"),(Object)("v-model"),(Object)("tabindex"),(Object)(":style")}));
 };
 //BA.debugLineNum = 1237;BA.debugLine="Template = Element.tostring";
_template = _element._tostring /*String*/ ();
 //BA.debugLineNum = 1238;BA.debugLine="Return Template";
if (true) return _template;
 //BA.debugLineNum = 1239;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmelement  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 325;BA.debugLine="Sub UseTheme(themeName As String) As VMElement";
 //BA.debugLineNum = 326;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 327;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 328;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 329;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 330;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmelement)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
