package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmskeleton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmskeleton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmskeleton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _skeleton = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public Object _module = null;
public boolean _designmode = false;
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
public b4j.example.vmskeleton  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub AddClass(c As String) As VMSkeleton";
 //BA.debugLineNum = 138;BA.debugLine="Skeleton.AddClass(c)";
_skeleton._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 61;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 62;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 176;BA.debugLine="Skeleton.BuildModel(mprops, mstyles, lclasses, loo";
_skeleton._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Skeleton As VMElement";
_skeleton = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private module As Object   'ignore";
_module = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean    'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _disable() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub Disable";
 //BA.debugLineNum = 51;BA.debugLine="Skeleton.Disable(True)";
_skeleton._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _enable() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub Enable";
 //BA.debugLineNum = 47;BA.debugLine="Skeleton.Enable(True)";
_skeleton._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _hide() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 39;BA.debugLine="Skeleton.SetVisible(False)";
_skeleton._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmskeleton  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 11;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 12;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 13;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 14;BA.debugLine="Skeleton.Initialize(vue, ID).SetTag(\"vue-skeleton";
_skeleton._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("vue-skeleton");
 //BA.debugLineNum = 15;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 172;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmskeleton  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSkelet";
 //BA.debugLineNum = 84;BA.debugLine="Skeleton.RemoveAttr(sName)";
_skeleton._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub Render";
 //BA.debugLineNum = 168;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmskeleton  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetAttr(attr As Map) As VMSkeleton";
 //BA.debugLineNum = 159;BA.debugLine="Skeleton.SetAttr(attr)";
_skeleton._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 31;BA.debugLine="Sub SetAttributes(attrs As List) As VMSkeleton";
 //BA.debugLineNum = 32;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 33;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSkeleton";
 //BA.debugLineNum = 27;BA.debugLine="Skeleton.SetAttrLoose(loose)";
_skeleton._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 148;BA.debugLine="Skeleton.SetAttrSingle(prop, value)";
_skeleton._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setborder(String _width,String _color,String _bstyle) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
 //BA.debugLineNum = 79;BA.debugLine="Skeleton.SetBorder(width, color, bstyle)";
_skeleton._setborder /*b4j.example.vmelement*/ (_width,_color,_bstyle);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 20;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSkeleton";
 //BA.debugLineNum = 100;BA.debugLine="Skeleton.SetDesignMode(b)";
_skeleton._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 101;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetDisabled(b As Boolean) As VMSkeleton";
 //BA.debugLineNum = 117;BA.debugLine="Skeleton.SetDisabled(b)";
_skeleton._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetHeight(h As String) As VMSkeleton";
 //BA.debugLineNum = 55;BA.debugLine="Skeleton.SetStyleSingle(\"height\", h)";
_skeleton._setstylesingle /*b4j.example.vmelement*/ ("height",(Object)(_h));
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetMarginAll(p As String) As VMSkeleton";
 //BA.debugLineNum = 95;BA.debugLine="Skeleton.setmarginall(p)";
_skeleton._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 112;BA.debugLine="Skeleton.SetName(varName, bbind)";
_skeleton._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetPaddingAll(p As String) As VMSkeleton";
 //BA.debugLineNum = 90;BA.debugLine="Skeleton.SetPaddingAll(p)";
_skeleton._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Sub SetStyle(m As Map) As VMSkeleton";
 //BA.debugLineNum = 153;BA.debugLine="Skeleton.SetStyle(m)";
_skeleton._setstyle /*b4j.example.vmelement*/ (_m);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 143;BA.debugLine="Skeleton.SetStyleSingle(prop, value)";
_skeleton._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetTabIndex(ti As String) As VMSkeleton";
 //BA.debugLineNum = 106;BA.debugLine="Skeleton.SetTabIndex(ti)";
_skeleton._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _settext(String _t) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetText(t As String) As VMSkeleton";
 //BA.debugLineNum = 67;BA.debugLine="Skeleton.SetText(t)";
_skeleton._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 185;BA.debugLine="Sub SetTextColor(varColor As String) As VMSkeleton";
 //BA.debugLineNum = 186;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 187;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 192;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 193;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 194;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 195;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 196;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetVIf(vif As String) As VMSkeleton";
 //BA.debugLineNum = 122;BA.debugLine="Skeleton.SetVIf(vif)";
_skeleton._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetVisible(b As Boolean) As VMSkeleton";
 //BA.debugLineNum = 180;BA.debugLine="Skeleton.SetVisible(b)";
_skeleton._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="private Sub SetVModel(k As String) As VMSkeleton";
 //BA.debugLineNum = 132;BA.debugLine="Skeleton.SetVModel(k)";
_skeleton._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetVShow(vif As String) As VMSkeleton";
 //BA.debugLineNum = 127;BA.debugLine="Skeleton.SetVShow(vif)";
_skeleton._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeleton  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetWidth(w As String) As VMSkeleton";
 //BA.debugLineNum = 72;BA.debugLine="Skeleton.SetStyleSingle(\"width\", w)";
_skeleton._setstylesingle /*b4j.example.vmelement*/ ("width",(Object)(_w));
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeleton)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public String  _show() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub Show";
 //BA.debugLineNum = 43;BA.debugLine="Skeleton.SetVisible(True)";
_skeleton._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 164;BA.debugLine="Return Skeleton.tostring";
if (true) return _skeleton._tostring /*String*/ ();
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
