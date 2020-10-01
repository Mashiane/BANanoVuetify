package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlazy extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmlazy", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlazy.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _lazy = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
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
public b4j.example.vmlazy  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 55;BA.debugLine="Sub AddChild(child As VMElement) As VMLazy";
 //BA.debugLineNum = 56;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 57;BA.debugLine="Lazy.SetText(childHTML)";
_lazy._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 91;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 92;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 93;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlazy  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub AddClass(c As String) As VMLazy";
 //BA.debugLineNum = 74;BA.debugLine="Lazy.AddClass(c)";
_lazy._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 163;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 164;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 246;BA.debugLine="Lazy.BindStyleSingle(prop, value)";
_lazy._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 288;BA.debugLine="Lazy.BuildModel(mprops, mstyles, lclasses, loose)";
_lazy._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Lazy As VMElement";
_lazy = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean   'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object     'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlazy  _disable() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub Disable As VMLazy";
 //BA.debugLineNum = 156;BA.debugLine="Lazy.Disable(True)";
_lazy._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _enable() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub Enable As VMLazy";
 //BA.debugLineNum = 150;BA.debugLine="Lazy.Enable(True)";
_lazy._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _hide() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub Hide As VMLazy";
 //BA.debugLineNum = 138;BA.debugLine="Lazy.SetVisible(False)";
_lazy._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="Lazy.Initialize(v, ID)";
_lazy._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 15;BA.debugLine="Lazy.SetTag(\"v-lazy\")";
_lazy._settag /*b4j.example.vmelement*/ ("v-lazy");
 //BA.debugLineNum = 16;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 69;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlazy  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="public Sub RemoveAttr(sName As String) As VMLazy";
 //BA.debugLineNum = 197;BA.debugLine="Lazy.RemoveAttr(sName)";
_lazy._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub Render";
 //BA.debugLineNum = 51;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlazy  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetAttr(attr As Map) As VMLazy";
 //BA.debugLineNum = 80;BA.debugLine="Lazy.SetAttr(attr)";
_lazy._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 265;BA.debugLine="Sub SetAttributes(attrs As List) As VMLazy";
 //BA.debugLineNum = 266;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 267;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetAttrLoose(loose As String) As VMLazy";
 //BA.debugLineNum = 170;BA.debugLine="Lazy.SetAttrLoose(loose)";
_lazy._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 240;BA.debugLine="Lazy.SetAttrSingle(prop, value)";
_lazy._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 187;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 188;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 189;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 190;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 191;BA.debugLine="Lazy.Bind(\":color\", pp)";
_lazy._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 23;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMLazy";
 //BA.debugLineNum = 215;BA.debugLine="Lazy.SetDesignMode(b)";
_lazy._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 216;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetKey(k As String) As VMLazy";
 //BA.debugLineNum = 282;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 283;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub SetMarginAll(p As String) As VMLazy";
 //BA.debugLineNum = 209;BA.debugLine="Lazy.setmarginall(p)";
_lazy._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setminheight(Object _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 98;BA.debugLine="Sub SetMinHeight(varMinHeight As Object) As VMLazy";
 //BA.debugLineNum = 99;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 100;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varminheight);
 //BA.debugLineNum = 101;BA.debugLine="Lazy.Bind(\":min-height\", pp)";
_lazy._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 228;BA.debugLine="Lazy.SetName(varName, bbind)";
_lazy._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setoptions(Object _varoptions) throws Exception{
String _pp = "";
 //BA.debugLineNum = 106;BA.debugLine="Sub SetOptions(varOptions As Object) As VMLazy";
 //BA.debugLineNum = 107;BA.debugLine="Dim pp As String = $\"${ID}Options\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Options");
 //BA.debugLineNum = 108;BA.debugLine="vue.SetStateSingle(pp, varOptions)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varoptions);
 //BA.debugLineNum = 109;BA.debugLine="Lazy.Bind(\":options\", pp)";
_lazy._bind /*b4j.example.vmelement*/ (":options",_pp);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub SetPaddingAll(p As String) As VMLazy";
 //BA.debugLineNum = 203;BA.debugLine="Lazy.SetPaddingAll(p)";
_lazy._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetStyle(sm As Map) As VMLazy";
 //BA.debugLineNum = 86;BA.debugLine="Lazy.SetStyle(sm)";
_lazy._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 234;BA.debugLine="Lazy.SetStyleSingle(prop, value)";
_lazy._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetTabIndex(ti As String) As VMLazy";
 //BA.debugLineNum = 222;BA.debugLine="Lazy.SetTabIndex(ti)";
_lazy._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _settag(Object _vartag) throws Exception{
String _pp = "";
 //BA.debugLineNum = 114;BA.debugLine="Sub SetTag(varTag As Object) As VMLazy";
 //BA.debugLineNum = 115;BA.debugLine="Dim pp As String = $\"${ID}Tag\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tag");
 //BA.debugLineNum = 116;BA.debugLine="vue.SetStateSingle(pp, varTag)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartag);
 //BA.debugLineNum = 117;BA.debugLine="Lazy.Bind(\":tag\", pp)";
_lazy._bind /*b4j.example.vmelement*/ (":tag",_pp);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetText(t As Object) As VMLazy";
 //BA.debugLineNum = 63;BA.debugLine="Lazy.SetText(t)";
_lazy._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 297;BA.debugLine="Sub SetTextColor(varColor As String) As VMLazy";
 //BA.debugLineNum = 298;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 299;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 304;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 305;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 306;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 307;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 308;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _settransition(Object _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 122;BA.debugLine="Sub SetTransition(varTransition As Object) As VMLa";
 //BA.debugLineNum = 123;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 124;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartransition);
 //BA.debugLineNum = 125;BA.debugLine="Lazy.Bind(\":transition\", pp)";
_lazy._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setvalue(Object _varvalue) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetValue(varValue As Object) As VMLazy";
 //BA.debugLineNum = 131;BA.debugLine="Lazy.SetValue(varValue, False)";
_lazy._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub SetVElse(vif As String) As VMLazy";
 //BA.debugLineNum = 251;BA.debugLine="Lazy.SetVElse(vif)";
_lazy._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 273;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 274;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 275;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 276;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 277;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetVhtml(vhtml As String) As VMLazy";
 //BA.debugLineNum = 261;BA.debugLine="Lazy.SetVHtml(vhtml)";
_lazy._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetVIf(vif As String) As VMLazy";
 //BA.debugLineNum = 40;BA.debugLine="Lazy.SetVIf(vif)";
_lazy._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetVisible(b As Boolean) As VMLazy";
 //BA.debugLineNum = 292;BA.debugLine="Lazy.SetVisible(b)";
_lazy._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetVModel(k As String) As VMLazy";
 //BA.debugLineNum = 35;BA.debugLine="Lazy.SetVModel(k)";
_lazy._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetVShow(vif As String) As VMLazy";
 //BA.debugLineNum = 45;BA.debugLine="Lazy.SetVShow(vif)";
_lazy._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetVText(vhtml As String) As VMLazy";
 //BA.debugLineNum = 256;BA.debugLine="Lazy.SetVText(vhtml)";
_lazy._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlazy  _show() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub Show As VMLazy";
 //BA.debugLineNum = 144;BA.debugLine="Lazy.SetVisible(True)";
_lazy._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 31;BA.debugLine="Return Lazy.ToString";
if (true) return _lazy._tostring /*String*/ ();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlazy  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 175;BA.debugLine="Sub UseTheme(themeName As String) As VMLazy";
 //BA.debugLineNum = 176;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 177;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 178;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 179;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 180;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlazy)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
