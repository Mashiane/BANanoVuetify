package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmprogresslinear extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmprogresslinear", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmprogresslinear.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _progresslinear = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public b4j.example.vmelement _tmp = null;
public boolean _haslabel = false;
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
public b4j.example.vmprogresslinear  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 99;BA.debugLine="Sub AddChild(child As VMElement) As VMProgressLine";
 //BA.debugLineNum = 100;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 101;BA.debugLine="ProgressLinear.SetText(childHTML)";
_progresslinear._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 129;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 130;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 131;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresslinear  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub AddClass(c As String) As VMProgressLinear";
 //BA.debugLineNum = 112;BA.debugLine="ProgressLinear.AddClass(c)";
_progresslinear._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 571;BA.debugLine="Sub AddComponent(comp As String) As VMProgressLine";
 //BA.debugLineNum = 572;BA.debugLine="ProgressLinear.SetText(comp)";
_progresslinear._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 573;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 574;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 582;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 583;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 584;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresslinear  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 408;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 409;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 502;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 503;BA.debugLine="ProgressLinear.BindStyleSingle(prop, value)";
_progresslinear._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 504;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 587;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 588;BA.debugLine="ProgressLinear.BuildModel(mprops, mstyles, lclass";
_progresslinear._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 589;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ProgressLinear As VMElement";
_progresslinear = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean   'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object   'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean   'ignore";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="Private tmp As VMElement";
_tmp = new b4j.example.vmelement();
 //BA.debugLineNum = 11;BA.debugLine="Private hasLabel As Boolean";
_haslabel = false;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresslinear  _disable() throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Sub Disable As VMProgressLinear";
 //BA.debugLineNum = 401;BA.debugLine="ProgressLinear.Disable(True)";
_progresslinear._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _enable() throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Sub Enable As VMProgressLinear";
 //BA.debugLineNum = 395;BA.debugLine="ProgressLinear.Enable(True)";
_progresslinear._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public String  _getvalue() throws Exception{
String _pp = "";
String _svalue = "";
 //BA.debugLineNum = 28;BA.debugLine="Sub GetValue As String";
 //BA.debugLineNum = 29;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 30;BA.debugLine="Dim svalue As String = vue.GetData(pp)";
_svalue = BA.ObjectToString(_vue._getdata /*Object*/ (_pp));
 //BA.debugLineNum = 31;BA.debugLine="Return svalue";
if (true) return _svalue;
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresslinear  _hide() throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub Hide As VMProgressLinear";
 //BA.debugLineNum = 383;BA.debugLine="ProgressLinear.SetVisible(False)";
_progresslinear._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="ProgressLinear.Initialize(v, ID)";
_progresslinear._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 18;BA.debugLine="ProgressLinear.SetTag(\"v-progress-linear\")";
_progresslinear._settag /*b4j.example.vmelement*/ ("v-progress-linear");
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 22;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="tmp.Initialize(vue, $\"${ID}tmp\"$).SetTag(\"templat";
_tmp._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tmp"))._settag /*b4j.example.vmelement*/ ("template");
 //BA.debugLineNum = 24;BA.debugLine="hasLabel = False";
_haslabel = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 107;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresslinear  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="public Sub RemoveAttr(sName As String) As VMProgre";
 //BA.debugLineNum = 447;BA.debugLine="ProgressLinear.RemoveAttr(sName)";
_progresslinear._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub Render";
 //BA.debugLineNum = 95;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresslinear  _setabsolute(boolean _varabsolute) throws Exception{
String _pp = "";
 //BA.debugLineNum = 136;BA.debugLine="Sub SetAbsolute(varAbsolute As Boolean) As VMProgr";
 //BA.debugLineNum = 137;BA.debugLine="If varAbsolute = False Then Return Me";
if (_varabsolute==__c.False) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 138;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 139;BA.debugLine="SetAttrSingle(\"absolute\", varAbsolute)";
_setattrsingle("absolute",BA.ObjectToString(_varabsolute));
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 142;BA.debugLine="Dim pp As String = $\"${ID}Absolute\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Absolute");
 //BA.debugLineNum = 143;BA.debugLine="vue.SetStateSingle(pp, varAbsolute)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varabsolute));
 //BA.debugLineNum = 144;BA.debugLine="ProgressLinear.Bind(\":absolute\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":absolute",_pp);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setactive(boolean _varactive) throws Exception{
String _pp = "";
 //BA.debugLineNum = 162;BA.debugLine="Sub SetActive(varActive As Boolean) As VMProgressL";
 //BA.debugLineNum = 163;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 164;BA.debugLine="SetAttrSingle(\"active\", varActive)";
_setattrsingle("active",BA.ObjectToString(_varactive));
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 167;BA.debugLine="Dim pp As String = $\"${ID}Active\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Active");
 //BA.debugLineNum = 168;BA.debugLine="vue.SetStateSingle(pp, varActive)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactive));
 //BA.debugLineNum = 169;BA.debugLine="ProgressLinear.Bind(\":active\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":active",_pp);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetAttr(attr As Map) As VMProgressLinear";
 //BA.debugLineNum = 118;BA.debugLine="ProgressLinear.SetAttr(attr)";
_progresslinear._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 522;BA.debugLine="Sub SetAttributes(attrs As List) As VMProgressLine";
 //BA.debugLineNum = 523;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 524;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 526;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 527;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 414;BA.debugLine="Sub SetAttrLoose(loose As String) As VMProgressLin";
 //BA.debugLineNum = 415;BA.debugLine="ProgressLinear.SetAttrLoose(loose)";
_progresslinear._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 416;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 496;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 497;BA.debugLine="ProgressLinear.SetAttrSingle(prop, value)";
_progresslinear._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setbackgroundcolor(String _varbackgroundcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 303;BA.debugLine="Sub SetBackgroundColor(varBackgroundColor As Strin";
 //BA.debugLineNum = 304;BA.debugLine="If varBackgroundColor = \"\" Then Return Me";
if ((_varbackgroundcolor).equals("")) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 305;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 306;BA.debugLine="SetAttrSingle(\"background-color\", varBackgroundC";
_setattrsingle("background-color",_varbackgroundcolor);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 309;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 310;BA.debugLine="vue.SetStateSingle(pp, varBackgroundColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbackgroundcolor));
 //BA.debugLineNum = 311;BA.debugLine="ProgressLinear.Bind(\":background-color\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setbackgroundcolorintensity(String _varbackgroundcolor,String _varbackgroundcolorintensity) throws Exception{
String _mcolor = "";
String _pp = "";
 //BA.debugLineNum = 599;BA.debugLine="Sub SetBackgroundColorIntensity(varBackgroundColor";
 //BA.debugLineNum = 600;BA.debugLine="If varBackgroundColor = \"\" Then Return Me";
if ((_varbackgroundcolor).equals("")) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 601;BA.debugLine="Dim mcolor As String = $\"${varBackgroundColor} ${";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_varbackgroundcolor))+" "+__c.SmartStringFormatter("",(Object)(_varbackgroundcolorintensity))+"");
 //BA.debugLineNum = 602;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 603;BA.debugLine="SetAttrSingle(\"background-color\", mcolor)";
_setattrsingle("background-color",_mcolor);
 //BA.debugLineNum = 604;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 606;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 607;BA.debugLine="vue.SetStateSingle(pp, mcolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_mcolor));
 //BA.debugLineNum = 608;BA.debugLine="ProgressLinear.Bind(\":background-color\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 609;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 610;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setbackgroundopacity(String _varbackgroundopacity) throws Exception{
String _pp = "";
 //BA.debugLineNum = 316;BA.debugLine="Sub SetBackgroundOpacity(varBackgroundOpacity As S";
 //BA.debugLineNum = 317;BA.debugLine="If varBackgroundOpacity = \"\" Then Return Me";
if ((_varbackgroundopacity).equals("")) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 318;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 319;BA.debugLine="SetAttrSingle(\"background-opacity\", varBackgroun";
_setattrsingle("background-opacity",_varbackgroundopacity);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 322;BA.debugLine="Dim pp As String = $\"${ID}BackgroundOpacity\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundOpacity");
 //BA.debugLineNum = 323;BA.debugLine="vue.SetStateSingle(pp, varBackgroundOpacity)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbackgroundopacity));
 //BA.debugLineNum = 324;BA.debugLine="ProgressLinear.Bind(\":background-opacity\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":background-opacity",_pp);
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setbottom(boolean _varbottom) throws Exception{
String _pp = "";
 //BA.debugLineNum = 174;BA.debugLine="Sub SetBottom(varBottom As Boolean) As VMProgressL";
 //BA.debugLineNum = 175;BA.debugLine="If varBottom = False Then Return Me";
if (_varbottom==__c.False) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 176;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 177;BA.debugLine="SetAttrSingle(\"bottom\", varBottom)";
_setattrsingle("bottom",BA.ObjectToString(_varbottom));
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 180;BA.debugLine="Dim pp As String = $\"${ID}Bottom\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Bottom");
 //BA.debugLineNum = 181;BA.debugLine="vue.SetStateSingle(pp, varBottom)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbottom));
 //BA.debugLineNum = 182;BA.debugLine="ProgressLinear.Bind(\":bottom\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":bottom",_pp);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setbuffervalue(String _varbuffervalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 329;BA.debugLine="Sub SetBufferValue(varBufferValue As String) As VM";
 //BA.debugLineNum = 330;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 331;BA.debugLine="SetAttrSingle(\"buffer-value\", varBufferValue)";
_setattrsingle("buffer-value",_varbuffervalue);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 334;BA.debugLine="Dim pp As String = $\"${ID}BufferValue\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BufferValue");
 //BA.debugLineNum = 335;BA.debugLine="vue.SetStateSingle(pp, varBufferValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varbuffervalue));
 //BA.debugLineNum = 336;BA.debugLine="ProgressLinear.Bind(\":buffer-value\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":buffer-value",_pp);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 341;BA.debugLine="Sub SetColor(varColor As String) As VMProgressLine";
 //BA.debugLineNum = 342;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 343;BA.debugLine="If varColor = \"primary\" Then Return Me";
if ((_varcolor).equals("primary")) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 344;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 345;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 348;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 349;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 350;BA.debugLine="ProgressLinear.Bind(\":color\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 432;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 433;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 434;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 435;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 436;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 437;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 439;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 440;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 441;BA.debugLine="ProgressLinear.Bind(\":color\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 187;BA.debugLine="Sub SetDark(varDark As Boolean) As VMProgressLinea";
 //BA.debugLineNum = 188;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 189;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 190;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 193;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 194;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 195;BA.debugLine="ProgressLinear.Bind(\":dark\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 35;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 464;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMProgressLinea";
 //BA.debugLineNum = 465;BA.debugLine="ProgressLinear.SetDesignMode(b)";
_progresslinear._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 466;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 467;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 551;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 552;BA.debugLine="ProgressLinear.SetDeviceOffsets(OS, OM, OL, OX)";
_progresslinear._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 553;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 554;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 558;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 559;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 560;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 561;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 565;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 566;BA.debugLine="ProgressLinear.SetDeviceSizes(SS, SM, SL, SX)";
_progresslinear._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 567;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setfixed(boolean _varfixed) throws Exception{
String _pp = "";
 //BA.debugLineNum = 200;BA.debugLine="Sub SetFixed(varFixed As Boolean) As VMProgressLin";
 //BA.debugLineNum = 201;BA.debugLine="If varFixed = False Then Return Me";
if (_varfixed==__c.False) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 202;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 203;BA.debugLine="SetAttrSingle(\"fixed\", varFixed)";
_setattrsingle("fixed",BA.ObjectToString(_varfixed));
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 206;BA.debugLine="Dim pp As String = $\"${ID}Fixed\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Fixed");
 //BA.debugLineNum = 207;BA.debugLine="vue.SetStateSingle(pp, varFixed)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varfixed));
 //BA.debugLineNum = 208;BA.debugLine="ProgressLinear.Bind(\":fixed\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":fixed",_pp);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 355;BA.debugLine="Sub SetHeight(varHeight As String) As VMProgressLi";
 //BA.debugLineNum = 356;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 357;BA.debugLine="If varHeight = \"4\" Then Return Me";
if ((_varheight).equals("4")) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 358;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 359;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 362;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 363;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 364;BA.debugLine="ProgressLinear.Bind(\":height\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setindeterminate(boolean _varindeterminate) throws Exception{
String _pp = "";
 //BA.debugLineNum = 213;BA.debugLine="Sub SetIndeterminate(varIndeterminate As Boolean)";
 //BA.debugLineNum = 214;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 215;BA.debugLine="SetAttrSingle(\"indeterminate\", varIndeterminate)";
_setattrsingle("indeterminate",BA.ObjectToString(_varindeterminate));
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 218;BA.debugLine="Dim pp As String = $\"${ID}Indeterminate\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Indeterminate");
 //BA.debugLineNum = 219;BA.debugLine="vue.SetStateSingle(pp, varIndeterminate)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varindeterminate));
 //BA.debugLineNum = 220;BA.debugLine="ProgressLinear.Bind(\":indeterminate\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":indeterminate",_pp);
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 538;BA.debugLine="Sub SetKey(k As String) As VMProgressLinear";
 //BA.debugLineNum = 539;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 540;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 541;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 542;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setlabel(String _lbltext) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetLabel(lblText As String) As VMProgressLinea";
 //BA.debugLineNum = 42;BA.debugLine="hasLabel = True";
_haslabel = __c.True;
 //BA.debugLineNum = 43;BA.debugLine="tmp.SetAttrSingle(\"v-slot\", \"{ value }\")";
_tmp._setattrsingle /*b4j.example.vmelement*/ ("v-slot","{ value }");
 //BA.debugLineNum = 44;BA.debugLine="tmp.SetText($\"<strong>{{ Math.ceil(value) }}${lbl";
_tmp._settext /*b4j.example.vmelement*/ (("<strong>{{ Math.ceil(value) }}"+__c.SmartStringFormatter("",(Object)(_lbltext))+"</strong>"));
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 225;BA.debugLine="Sub SetLight(varLight As Boolean) As VMProgressLin";
 //BA.debugLineNum = 226;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 227;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 228;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 231;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 232;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 233;BA.debugLine="ProgressLinear.Bind(\":light\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 458;BA.debugLine="Sub SetMarginAll(p As String) As VMProgressLinear";
 //BA.debugLineNum = 459;BA.debugLine="ProgressLinear.setmarginall(p)";
_progresslinear._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 460;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 484;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 485;BA.debugLine="ProgressLinear.SetName(varName, bbind)";
_progresslinear._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 486;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 487;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 452;BA.debugLine="Sub SetPaddingAll(p As String) As VMProgressLinear";
 //BA.debugLineNum = 453;BA.debugLine="ProgressLinear.SetPaddingAll(p)";
_progresslinear._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 454;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setquery(boolean _varquery) throws Exception{
String _pp = "";
 //BA.debugLineNum = 238;BA.debugLine="Sub SetQuery(varQuery As Boolean) As VMProgressLin";
 //BA.debugLineNum = 239;BA.debugLine="If varQuery = False Then Return Me";
if (_varquery==__c.False) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 240;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 241;BA.debugLine="SetAttrSingle(\"query\", varQuery)";
_setattrsingle("query",BA.ObjectToString(_varquery));
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 244;BA.debugLine="Dim pp As String = $\"${ID}Query\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Query");
 //BA.debugLineNum = 245;BA.debugLine="vue.SetStateSingle(pp, varQuery)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varquery));
 //BA.debugLineNum = 246;BA.debugLine="ProgressLinear.Bind(\":query\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":query",_pp);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 545;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMPro";
 //BA.debugLineNum = 546;BA.debugLine="ProgressLinear.SetRC(sRow, sCol)";
_progresslinear._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 547;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 548;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setreactive(boolean _varreactive) throws Exception{
String _pp = "";
 //BA.debugLineNum = 149;BA.debugLine="Sub SetReactive(varReactive As Boolean) As VMProgr";
 //BA.debugLineNum = 150;BA.debugLine="If varReactive = False Then Return Me";
if (_varreactive==__c.False) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 151;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 152;BA.debugLine="SetAttrSingle(\"reactive\", varReactive)";
_setattrsingle("reactive",BA.ObjectToString(_varreactive));
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 155;BA.debugLine="Dim pp As String = $\"${ID}Reactive\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Reactive");
 //BA.debugLineNum = 156;BA.debugLine="vue.SetStateSingle(pp, varReactive)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreactive));
 //BA.debugLineNum = 157;BA.debugLine="ProgressLinear.Bind(\":reactive\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":reactive",_pp);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setrounded(boolean _varrounded) throws Exception{
String _pp = "";
 //BA.debugLineNum = 251;BA.debugLine="Sub SetRounded(varRounded As Boolean) As VMProgres";
 //BA.debugLineNum = 252;BA.debugLine="If varRounded = False Then Return Me";
if (_varrounded==__c.False) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 253;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 254;BA.debugLine="SetAttrSingle(\"rounded\", varRounded)";
_setattrsingle("rounded",BA.ObjectToString(_varrounded));
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 257;BA.debugLine="Dim pp As String = $\"${ID}Rounded\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Rounded");
 //BA.debugLineNum = 258;BA.debugLine="vue.SetStateSingle(pp, varRounded)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrounded));
 //BA.debugLineNum = 259;BA.debugLine="ProgressLinear.Bind(\":rounded\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":rounded",_pp);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 471;BA.debugLine="Sub SetStatic(b As Boolean) As VMProgressLinear";
 //BA.debugLineNum = 472;BA.debugLine="ProgressLinear.SetStatic(b)";
_progresslinear._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 473;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setstream(boolean _varstream) throws Exception{
String _pp = "";
 //BA.debugLineNum = 264;BA.debugLine="Sub SetStream(varStream As Boolean) As VMProgressL";
 //BA.debugLineNum = 265;BA.debugLine="If varStream = False Then Return Me";
if (_varstream==__c.False) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 266;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 267;BA.debugLine="SetAttrSingle(\"stream\", varStream)";
_setattrsingle("stream",BA.ObjectToString(_varstream));
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 270;BA.debugLine="Dim pp As String = $\"${ID}Stream\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Stream");
 //BA.debugLineNum = 271;BA.debugLine="vue.SetStateSingle(pp, varStream)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varstream));
 //BA.debugLineNum = 272;BA.debugLine="ProgressLinear.Bind(\":stream\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":stream",_pp);
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setstriped(boolean _varstriped) throws Exception{
String _pp = "";
 //BA.debugLineNum = 277;BA.debugLine="Sub SetStriped(varStriped As Boolean) As VMProgres";
 //BA.debugLineNum = 278;BA.debugLine="If varStriped = False Then Return Me";
if (_varstriped==__c.False) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 279;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 280;BA.debugLine="SetAttrSingle(\"striped\", varStriped)";
_setattrsingle("striped",BA.ObjectToString(_varstriped));
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 283;BA.debugLine="Dim pp As String = $\"${ID}Striped\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Striped");
 //BA.debugLineNum = 284;BA.debugLine="vue.SetStateSingle(pp, varStriped)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varstriped));
 //BA.debugLineNum = 285;BA.debugLine="ProgressLinear.Bind(\":striped\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":striped",_pp);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetStyle(sm As Map) As VMProgressLinear";
 //BA.debugLineNum = 124;BA.debugLine="ProgressLinear.SetStyle(sm)";
_progresslinear._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 490;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 491;BA.debugLine="ProgressLinear.SetStyleSingle(prop, value)";
_progresslinear._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 478;BA.debugLine="Sub SetTabIndex(ti As String) As VMProgressLinear";
 //BA.debugLineNum = 479;BA.debugLine="ProgressLinear.SetTabIndex(ti)";
_progresslinear._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 480;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _settext(String _lbltext) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetText(lblText As String) As VMProgressLinear";
 //BA.debugLineNum = 49;BA.debugLine="hasLabel = True";
_haslabel = __c.True;
 //BA.debugLineNum = 50;BA.debugLine="tmp.SetAttrSingle(\"v-slot\", \"{ value }\")";
_tmp._setattrsingle /*b4j.example.vmelement*/ ("v-slot","{ value }");
 //BA.debugLineNum = 51;BA.debugLine="tmp.SetText($\"<strong>{{ Math.ceil(value) }}${lbl";
_tmp._settext /*b4j.example.vmelement*/ (("<strong>{{ Math.ceil(value) }}"+__c.SmartStringFormatter("",(Object)(_lbltext))+"</strong>"));
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _settextcenter() throws Exception{
 //BA.debugLineNum = 577;BA.debugLine="Sub SetTextCenter As VMProgressLinear";
 //BA.debugLineNum = 578;BA.debugLine="ProgressLinear.AddClass(\"text-center\")";
_progresslinear._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 579;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 57;BA.debugLine="Sub SetTextColor(varColor As String) As VMProgress";
 //BA.debugLineNum = 58;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 59;BA.debugLine="tmp.AddClass(sColor)";
_tmp._addclass /*b4j.example.vmelement*/ (_scolor);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 64;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 65;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 66;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 67;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 68;BA.debugLine="tmp.AddClass(mcolor)";
_tmp._addclass /*b4j.example.vmelement*/ (_mcolor);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _settop(boolean _vartop) throws Exception{
String _pp = "";
 //BA.debugLineNum = 290;BA.debugLine="Sub SetTop(varTop As Boolean) As VMProgressLinear";
 //BA.debugLineNum = 291;BA.debugLine="If varTop = False Then Return Me";
if (_vartop==__c.False) { 
if (true) return (b4j.example.vmprogresslinear)(this);};
 //BA.debugLineNum = 292;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 293;BA.debugLine="SetAttrSingle(\"top\", varTop)";
_setattrsingle("top",BA.ObjectToString(_vartop));
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 296;BA.debugLine="Dim pp As String = $\"${ID}Top\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Top");
 //BA.debugLineNum = 297;BA.debugLine="vue.SetStateSingle(pp, varTop)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartop));
 //BA.debugLineNum = 298;BA.debugLine="ProgressLinear.Bind(\":top\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":top",_pp);
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setvalue(String _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 369;BA.debugLine="Sub SetValue(varValue As String) As VMProgressLine";
 //BA.debugLineNum = 370;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 371;BA.debugLine="SetAttrSingle(\"value\", varValue)";
_setattrsingle("value",_varvalue);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 };
 //BA.debugLineNum = 374;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 375;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 376;BA.debugLine="ProgressLinear.Bind(\":value\", pp)";
_progresslinear._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 377;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 507;BA.debugLine="Sub SetVElse(vif As String) As VMProgressLinear";
 //BA.debugLineNum = 508;BA.debugLine="ProgressLinear.SetVElse(vif)";
_progresslinear._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 509;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 530;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 531;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 532;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 533;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 534;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 535;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 517;BA.debugLine="Sub SetVhtml(vhtml As String) As VMProgressLinear";
 //BA.debugLineNum = 518;BA.debugLine="ProgressLinear.SetVHtml(vhtml)";
_progresslinear._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 519;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetVIf(vif As String) As VMProgressLinear";
 //BA.debugLineNum = 84;BA.debugLine="ProgressLinear.SetVIf(vif)";
_progresslinear._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 593;BA.debugLine="Sub SetVisible(b As Boolean) As VMProgressLinear";
 //BA.debugLineNum = 594;BA.debugLine="ProgressLinear.SetVisible(b)";
_progresslinear._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 595;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 596;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetVModel(k As String) As VMProgressLinear";
 //BA.debugLineNum = 79;BA.debugLine="ProgressLinear.SetVModel(k)";
_progresslinear._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetVShow(vif As String) As VMProgressLinear";
 //BA.debugLineNum = 89;BA.debugLine="ProgressLinear.SetVShow(vif)";
_progresslinear._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 512;BA.debugLine="Sub SetVText(vhtml As String) As VMProgressLinear";
 //BA.debugLineNum = 513;BA.debugLine="ProgressLinear.SetVText(vhtml)";
_progresslinear._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresslinear  _show() throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub Show As VMProgressLinear";
 //BA.debugLineNum = 389;BA.debugLine="ProgressLinear.SetVisible(True)";
_progresslinear._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 390;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 74;BA.debugLine="If hasLabel Then AddComponent(tmp.ToString)";
if (_haslabel) { 
_addcomponent(_tmp._tostring /*String*/ ());};
 //BA.debugLineNum = 75;BA.debugLine="Return ProgressLinear.ToString";
if (true) return _progresslinear._tostring /*String*/ ();
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresslinear  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 420;BA.debugLine="Sub UseTheme(themeName As String) As VMProgressLin";
 //BA.debugLineNum = 421;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 422;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 423;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 424;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 425;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 427;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresslinear)(this);
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
