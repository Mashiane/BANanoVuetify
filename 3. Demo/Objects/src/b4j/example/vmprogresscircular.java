package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmprogresscircular extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmprogresscircular", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmprogresscircular.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _progresscircular = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public boolean _haslabel = false;
public b4j.example.vmelement _text = null;
public String _suffix = "";
public String _pvalue = "";
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
public b4j.example.vmprogresscircular  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 116;BA.debugLine="Sub AddChild(child As VMElement) As VMProgressCirc";
 //BA.debugLineNum = 117;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 118;BA.debugLine="ProgressCircular.SetText(childHTML)";
_progresscircular._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 146;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 147;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 148;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresscircular  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub AddClass(c As String) As VMProgressCircular";
 //BA.debugLineNum = 129;BA.debugLine="ProgressCircular.AddClass(c)";
_progresscircular._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 432;BA.debugLine="Sub AddComponent(comp As String) As VMProgressCirc";
 //BA.debugLineNum = 433;BA.debugLine="ProgressCircular.SetText(comp)";
_progresscircular._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 443;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 444;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresscircular  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 267;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 268;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 364;BA.debugLine="ProgressCircular.BindStyleSingle(prop, value)";
_progresscircular._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 448;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 449;BA.debugLine="ProgressCircular.BuildModel(mprops, mstyles, lcla";
_progresscircular._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ProgressCircular As VMElement";
_progresscircular = new b4j.example.vmelement();
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
 //BA.debugLineNum = 10;BA.debugLine="Private hasLabel As Boolean";
_haslabel = false;
 //BA.debugLineNum = 11;BA.debugLine="Public Text As VMElement";
_text = new b4j.example.vmelement();
 //BA.debugLineNum = 12;BA.debugLine="Private suffix As String";
_suffix = "";
 //BA.debugLineNum = 13;BA.debugLine="Private pValue As String";
_pvalue = "";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresscircular  _disable() throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub Disable As VMProgressCircular";
 //BA.debugLineNum = 260;BA.debugLine="ProgressCircular.Disable(True)";
_progresscircular._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _enable() throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub Enable As VMProgressCircular";
 //BA.debugLineNum = 254;BA.debugLine="ProgressCircular.Enable(True)";
_progresscircular._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public String  _getvalue() throws Exception{
String _pp = "";
String _svalue = "";
 //BA.debugLineNum = 206;BA.debugLine="Sub GetValue As String";
 //BA.debugLineNum = 207;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 208;BA.debugLine="Dim svalue As String = vue.GetData(pp)";
_svalue = BA.ObjectToString(_vue._getdata /*Object*/ (_pp));
 //BA.debugLineNum = 209;BA.debugLine="Return svalue";
if (true) return _svalue;
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresscircular  _hide() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub Hide As VMProgressCircular";
 //BA.debugLineNum = 242;BA.debugLine="ProgressCircular.SetVisible(False)";
_progresscircular._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 18;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 19;BA.debugLine="ProgressCircular.Initialize(v, ID)";
_progresscircular._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 20;BA.debugLine="ProgressCircular.SetTag(\"v-progress-circular\")";
_progresscircular._settag /*b4j.example.vmelement*/ ("v-progress-circular");
 //BA.debugLineNum = 21;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 22;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 24;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="hasLabel = False";
_haslabel = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="Text.Initialize(vue, $\"${ID}tmp\"$).SetTag(\"span\")";
_text._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tmp"))._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 27;BA.debugLine="suffix = \"\"";
_suffix = "";
 //BA.debugLineNum = 28;BA.debugLine="pValue = \"\"";
_pvalue = "";
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 124;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresscircular  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="public Sub RemoveAttr(sName As String) As VMProgre";
 //BA.debugLineNum = 306;BA.debugLine="ProgressCircular.RemoveAttr(sName)";
_progresscircular._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub Render";
 //BA.debugLineNum = 112;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresscircular  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetAttr(attr As Map) As VMProgressCircular";
 //BA.debugLineNum = 135;BA.debugLine="ProgressCircular.SetAttr(attr)";
_progresscircular._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 383;BA.debugLine="Sub SetAttributes(attrs As List) As VMProgressCirc";
 //BA.debugLineNum = 384;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 385;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Sub SetAttrLoose(loose As String) As VMProgressCir";
 //BA.debugLineNum = 274;BA.debugLine="ProgressCircular.SetAttrLoose(loose)";
_progresscircular._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 358;BA.debugLine="ProgressCircular.SetAttrSingle(prop, value)";
_progresscircular._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 153;BA.debugLine="Sub SetColor(varColor As String) As VMProgressCirc";
 //BA.debugLineNum = 154;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmprogresscircular)(this);};
 //BA.debugLineNum = 155;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 156;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 };
 //BA.debugLineNum = 159;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 160;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 161;BA.debugLine="ProgressCircular.Bind(\":color\", pp)";
_progresscircular._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 291;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 292;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmprogresscircular)(this);};
 //BA.debugLineNum = 293;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 294;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 295;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 };
 //BA.debugLineNum = 298;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 299;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 300;BA.debugLine="ProgressCircular.Bind(\":color\", pp)";
_progresscircular._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 33;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMProgressCircu";
 //BA.debugLineNum = 324;BA.debugLine="ProgressCircular.SetDesignMode(b)";
_progresscircular._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 325;BA.debugLine="Text.SetDesignMode(b)";
_text._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 326;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 413;BA.debugLine="ProgressCircular.SetDeviceOffsets(OS, OM, OL, OX)";
_progresscircular._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 419;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 420;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 421;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 426;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 427;BA.debugLine="ProgressCircular.SetDeviceSizes(SS, SM, SL, SX)";
_progresscircular._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 428;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setindeterminate(boolean _varindeterminate) throws Exception{
String _pp = "";
 //BA.debugLineNum = 227;BA.debugLine="Sub SetIndeterminate(varIndeterminate As Boolean)";
 //BA.debugLineNum = 228;BA.debugLine="If varIndeterminate = False Then Return Me";
if (_varindeterminate==__c.False) { 
if (true) return (b4j.example.vmprogresscircular)(this);};
 //BA.debugLineNum = 229;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 230;BA.debugLine="SetAttrSingle(\"indeterminate\", varIndeterminate)";
_setattrsingle("indeterminate",BA.ObjectToString(_varindeterminate));
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 };
 //BA.debugLineNum = 233;BA.debugLine="Dim pp As String = $\"${ID}Indeterminate\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Indeterminate");
 //BA.debugLineNum = 234;BA.debugLine="vue.SetStateSingle(pp, varIndeterminate)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varindeterminate));
 //BA.debugLineNum = 235;BA.debugLine="ProgressCircular.Bind(\":indeterminate\", pp)";
_progresscircular._bind /*b4j.example.vmelement*/ (":indeterminate",_pp);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Sub SetKey(k As String) As VMProgressCircular";
 //BA.debugLineNum = 400;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 401;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setlabel(String _lbltext) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetLabel(lblText As String) As VMProgressCircu";
 //BA.debugLineNum = 54;BA.debugLine="hasLabel = True";
_haslabel = __c.True;
 //BA.debugLineNum = 55;BA.debugLine="suffix = lblText";
_suffix = _lbltext;
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub SetMarginAll(p As String) As VMProgressCircula";
 //BA.debugLineNum = 318;BA.debugLine="ProgressCircular.setmarginall(p)";
_progresscircular._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 346;BA.debugLine="ProgressCircular.SetName(varName, bbind)";
_progresscircular._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetPaddingAll(p As String) As VMProgressCircul";
 //BA.debugLineNum = 312;BA.debugLine="ProgressCircular.SetPaddingAll(p)";
_progresscircular._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 406;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMPro";
 //BA.debugLineNum = 407;BA.debugLine="ProgressCircular.SetRC(sRow, sCol)";
_progresscircular._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 408;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setreactive(boolean _varreactive) throws Exception{
String _pp = "";
 //BA.debugLineNum = 40;BA.debugLine="Sub SetReactive(varReactive As Boolean) As VMProgr";
 //BA.debugLineNum = 41;BA.debugLine="If varReactive = False Then Return Me";
if (_varreactive==__c.False) { 
if (true) return (b4j.example.vmprogresscircular)(this);};
 //BA.debugLineNum = 42;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 43;BA.debugLine="SetAttrSingle(\"reactive\", varReactive)";
_setattrsingle("reactive",BA.ObjectToString(_varreactive));
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 };
 //BA.debugLineNum = 46;BA.debugLine="Dim pp As String = $\"${ID}Reactive\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Reactive");
 //BA.debugLineNum = 47;BA.debugLine="vue.SetStateSingle(pp, varReactive)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreactive));
 //BA.debugLineNum = 48;BA.debugLine="ProgressCircular.Bind(\":reactive\", pp)";
_progresscircular._bind /*b4j.example.vmelement*/ (":reactive",_pp);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setrotate(String _varrotate) throws Exception{
String _pp = "";
 //BA.debugLineNum = 166;BA.debugLine="Sub SetRotate(varRotate As String) As VMProgressCi";
 //BA.debugLineNum = 167;BA.debugLine="If varRotate = \"\" Then Return Me";
if ((_varrotate).equals("")) { 
if (true) return (b4j.example.vmprogresscircular)(this);};
 //BA.debugLineNum = 168;BA.debugLine="If varRotate = \"0\" Then Return Me";
if ((_varrotate).equals("0")) { 
if (true) return (b4j.example.vmprogresscircular)(this);};
 //BA.debugLineNum = 169;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 170;BA.debugLine="SetAttrSingle(\"rotate\", varRotate)";
_setattrsingle("rotate",_varrotate);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 };
 //BA.debugLineNum = 173;BA.debugLine="Dim pp As String = $\"${ID}Rotate\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Rotate");
 //BA.debugLineNum = 174;BA.debugLine="vue.SetStateSingle(pp, varRotate)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varrotate));
 //BA.debugLineNum = 175;BA.debugLine="ProgressCircular.Bind(\":rotate\", pp)";
_progresscircular._bind /*b4j.example.vmelement*/ (":rotate",_pp);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setsize(String _varsize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 180;BA.debugLine="Sub SetSize(varSize As String) As VMProgressCircul";
 //BA.debugLineNum = 181;BA.debugLine="If varSize = \"\" Then Return Me";
if ((_varsize).equals("")) { 
if (true) return (b4j.example.vmprogresscircular)(this);};
 //BA.debugLineNum = 182;BA.debugLine="If varSize = \"32\" Then Return Me";
if ((_varsize).equals("32")) { 
if (true) return (b4j.example.vmprogresscircular)(this);};
 //BA.debugLineNum = 183;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 184;BA.debugLine="SetAttrSingle(\"size\", varSize)";
_setattrsingle("size",_varsize);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 };
 //BA.debugLineNum = 187;BA.debugLine="Dim pp As String = $\"${ID}Size\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Size");
 //BA.debugLineNum = 188;BA.debugLine="vue.SetStateSingle(pp, varSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsize));
 //BA.debugLineNum = 189;BA.debugLine="ProgressCircular.Bind(\":size\", pp)";
_progresscircular._bind /*b4j.example.vmelement*/ (":size",_pp);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetStatic(b As Boolean) As VMProgressCircular";
 //BA.debugLineNum = 332;BA.debugLine="ProgressCircular.SetStatic(b)";
_progresscircular._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 333;BA.debugLine="Text.SetStatic(b)";
_text._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 334;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub SetStyle(sm As Map) As VMProgressCircular";
 //BA.debugLineNum = 141;BA.debugLine="ProgressCircular.SetStyle(sm)";
_progresscircular._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 352;BA.debugLine="ProgressCircular.SetStyleSingle(prop, value)";
_progresscircular._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Sub SetTabIndex(ti As String) As VMProgressCircula";
 //BA.debugLineNum = 340;BA.debugLine="ProgressCircular.SetTabIndex(ti)";
_progresscircular._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _settext(String _lbltext) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetText(lblText As String) As VMProgressCircul";
 //BA.debugLineNum = 60;BA.debugLine="hasLabel = True";
_haslabel = __c.True;
 //BA.debugLineNum = 61;BA.debugLine="suffix = lblText";
_suffix = _lbltext;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _settextcenter() throws Exception{
 //BA.debugLineNum = 438;BA.debugLine="Sub SetTextCenter As VMProgressCircular";
 //BA.debugLineNum = 439;BA.debugLine="ProgressCircular.AddClass(\"text-center\")";
_progresscircular._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 440;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 67;BA.debugLine="Sub SetTextColor(varColor As String) As VMProgress";
 //BA.debugLineNum = 68;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 69;BA.debugLine="Text.AddClass(sColor)";
_text._addclass /*b4j.example.vmelement*/ (_scolor);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 74;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 75;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 76;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 77;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 78;BA.debugLine="Text.AddClass(mcolor)";
_text._addclass /*b4j.example.vmelement*/ (_mcolor);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setvalue(String _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 194;BA.debugLine="Sub SetValue(varValue As String) As VMProgressCirc";
 //BA.debugLineNum = 195;BA.debugLine="pValue = varValue";
_pvalue = _varvalue;
 //BA.debugLineNum = 196;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 197;BA.debugLine="SetAttrSingle(\"value\", varValue)";
_setattrsingle("value",_varvalue);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 };
 //BA.debugLineNum = 200;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 201;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 202;BA.debugLine="ProgressCircular.Bind(\":value\", pp)";
_progresscircular._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub SetVElse(vif As String) As VMProgressCircular";
 //BA.debugLineNum = 369;BA.debugLine="ProgressCircular.SetVElse(vif)";
_progresscircular._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 391;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 392;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 393;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 394;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 395;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Sub SetVhtml(vhtml As String) As VMProgressCircula";
 //BA.debugLineNum = 379;BA.debugLine="ProgressCircular.SetVHtml(vhtml)";
_progresscircular._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetVIf(vif As String) As VMProgressCircular";
 //BA.debugLineNum = 101;BA.debugLine="ProgressCircular.SetVIf(vif)";
_progresscircular._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 454;BA.debugLine="Sub SetVisible(b As Boolean) As VMProgressCircular";
 //BA.debugLineNum = 455;BA.debugLine="ProgressCircular.SetVisible(b)";
_progresscircular._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetVModel(k As String) As VMProgressCircular";
 //BA.debugLineNum = 96;BA.debugLine="ProgressCircular.SetVModel(k)";
_progresscircular._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetVShow(vif As String) As VMProgressCircular";
 //BA.debugLineNum = 106;BA.debugLine="ProgressCircular.SetVShow(vif)";
_progresscircular._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Sub SetVText(vhtml As String) As VMProgressCircula";
 //BA.debugLineNum = 374;BA.debugLine="ProgressCircular.SetVText(vhtml)";
_progresscircular._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 213;BA.debugLine="Sub SetWidth(varWidth As String) As VMProgressCirc";
 //BA.debugLineNum = 214;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmprogresscircular)(this);};
 //BA.debugLineNum = 215;BA.debugLine="If varWidth = \"4\" Then Return Me";
if ((_varwidth).equals("4")) { 
if (true) return (b4j.example.vmprogresscircular)(this);};
 //BA.debugLineNum = 216;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 217;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 };
 //BA.debugLineNum = 220;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 221;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 222;BA.debugLine="ProgressCircular.Bind(\":width\", pp)";
_progresscircular._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogresscircular  _show() throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub Show As VMProgressCircular";
 //BA.debugLineNum = 248;BA.debugLine="ProgressCircular.SetVisible(True)";
_progresscircular._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 84;BA.debugLine="If hasLabel Then";
if (_haslabel) { 
 //BA.debugLineNum = 85;BA.debugLine="If bStatic = True Or DesignMode = True Then";
if (_bstatic==__c.True || _designmode==__c.True) { 
 //BA.debugLineNum = 86;BA.debugLine="Text.SetText($\"${pValue}${suffix}\"$)";
_text._settext /*b4j.example.vmelement*/ ((""+__c.SmartStringFormatter("",(Object)(_pvalue))+""+__c.SmartStringFormatter("",(Object)(_suffix))+""));
 }else {
 //BA.debugLineNum = 88;BA.debugLine="Text.SetText($\"{{ ${ID}value }}${suffix}\"$)";
_text._settext /*b4j.example.vmelement*/ (("{{ "+__c.SmartStringFormatter("",(Object)(_id))+"value }}"+__c.SmartStringFormatter("",(Object)(_suffix))+""));
 };
 //BA.debugLineNum = 90;BA.debugLine="AddComponent(Text.ToString)";
_addcomponent(_text._tostring /*String*/ ());
 };
 //BA.debugLineNum = 92;BA.debugLine="Return ProgressCircular.ToString";
if (true) return _progresscircular._tostring /*String*/ ();
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogresscircular  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 279;BA.debugLine="Sub UseTheme(themeName As String) As VMProgressCir";
 //BA.debugLineNum = 280;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 281;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 282;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 283;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 284;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogresscircular)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
