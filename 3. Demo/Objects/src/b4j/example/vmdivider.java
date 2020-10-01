package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdivider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmdivider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdivider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _divider = null;
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
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
public b4j.example.vmdivider  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 92;BA.debugLine="Sub AddChild(child As VMElement) As VMDivider";
 //BA.debugLineNum = 93;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 94;BA.debugLine="Divider.SetText(childHTML)";
_divider._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 128;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 129;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 130;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdivider  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub AddClass(c As String) As VMDivider";
 //BA.debugLineNum = 111;BA.debugLine="Divider.AddClass(c)";
_divider._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 230;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdivider  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 161;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 162;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 235;BA.debugLine="Divider.BuildModel(mprops, mstyles, lclasses, loo";
_divider._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Divider As VMElement";
_divider = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 5;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="Private DesignMode As Boolean";
_designmode = false;
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdivider  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue) As VMDivider";
 //BA.debugLineNum = 11;BA.debugLine="Divider.Initialize(v, \"\").SetTag(\"v-divider\")";
_divider._initialize /*b4j.example.vmelement*/ (ba,_v,"")._settag /*b4j.example.vmelement*/ ("v-divider");
 //BA.debugLineNum = 12;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 13;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 106;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdivider  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="public Sub RemoveAttr(sName As String) As VMDivide";
 //BA.debugLineNum = 168;BA.debugLine="Divider.RemoveAttr(sName)";
_divider._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub Render";
 //BA.debugLineNum = 88;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdivider  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetAttr(attr As Map) As VMDivider";
 //BA.debugLineNum = 117;BA.debugLine="Divider.SetAttr(attr)";
_divider._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 58;BA.debugLine="Sub SetAttributes(attrs As List) As VMDivider";
 //BA.debugLineNum = 59;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 60;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetAttrLoose(loose As String) As VMDivider";
 //BA.debugLineNum = 49;BA.debugLine="Divider.SetAttrLoose(loose)";
_divider._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 212;BA.debugLine="Divider.SetAttrSingle(prop, value)";
_divider._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setdark() throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetDark As VMDivider";
 //BA.debugLineNum = 136;BA.debugLine="Divider.SetAttrLoose(\"dark\")";
_divider._setattrloose /*b4j.example.vmelement*/ ("dark");
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 30;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMDivider";
 //BA.debugLineNum = 184;BA.debugLine="Divider.SetDesignMode(b)";
_divider._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 185;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 25;BA.debugLine="Divider.SetDeviceOffsets(OS, OM, OL, OX)";
_divider._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 43;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 44;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 37;BA.debugLine="Divider.SetDeviceSizes(SS, SM, SL, SX)";
_divider._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetDisabled(b As Boolean) As VMDivider";
 //BA.debugLineNum = 201;BA.debugLine="Divider.SetDisabled(b)";
_divider._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetHeight(h As String) As VMDivider";
 //BA.debugLineNum = 218;BA.debugLine="Divider.SetStyleSingle(\"height\", h)";
_divider._setstylesingle /*b4j.example.vmelement*/ ("height",(Object)(_h));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setinset() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetInset As VMDivider";
 //BA.debugLineNum = 142;BA.debugLine="Divider.SetAttrLoose(\"inset\")";
_divider._setattrloose /*b4j.example.vmelement*/ ("inset");
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setlight() throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub SetLight As VMDivider";
 //BA.debugLineNum = 148;BA.debugLine="Divider.SetAttrLoose(\"light\")";
_divider._setattrloose /*b4j.example.vmelement*/ ("light");
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetMarginAll(p As String) As VMDivider";
 //BA.debugLineNum = 179;BA.debugLine="Divider.setmarginall(p)";
_divider._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 196;BA.debugLine="Divider.SetName(varName, bbind)";
_divider._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetPaddingAll(p As String) As VMDivider";
 //BA.debugLineNum = 174;BA.debugLine="Divider.SetPaddingAll(p)";
_divider._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMDiv";
 //BA.debugLineNum = 19;BA.debugLine="Divider.SetRC(sRow, sCol)";
_divider._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetStyle(sm As Map) As VMDivider";
 //BA.debugLineNum = 123;BA.debugLine="Divider.SetStyle(sm)";
_divider._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 207;BA.debugLine="Divider.SetStyleSingle(prop, value)";
_divider._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetTabIndex(ti As String) As VMDivider";
 //BA.debugLineNum = 190;BA.debugLine="Divider.SetTabIndex(ti)";
_divider._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetText(t As Object) As VMDivider";
 //BA.debugLineNum = 100;BA.debugLine="Divider.SetText(t)";
_divider._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 245;BA.debugLine="Sub SetTextColor(varColor As String) As VMDivider";
 //BA.debugLineNum = 246;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 247;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 252;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 253;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 254;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 255;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 256;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setvelseif(String _t) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetVElseIf(t As String) As VMDivider";
 //BA.debugLineNum = 54;BA.debugLine="SetAttrSingle(\"v-else-if\", t)";
_setattrsingle("v-else-if",_t);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setvertical() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetVertical As VMDivider";
 //BA.debugLineNum = 154;BA.debugLine="Divider.SetAttrLoose(\"vertical\")";
_divider._setattrloose /*b4j.example.vmelement*/ ("vertical");
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetVIf(vif As String) As VMDivider";
 //BA.debugLineNum = 77;BA.debugLine="Divider.SetVIf(vif)";
_divider._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub SetVisible(b As Boolean) As VMDivider";
 //BA.debugLineNum = 240;BA.debugLine="Divider.SetVisible(b)";
_divider._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetVModel(k As String) As VMDivider";
 //BA.debugLineNum = 72;BA.debugLine="Divider.SetVModel(k)";
_divider._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetVShow(vif As String) As VMDivider";
 //BA.debugLineNum = 82;BA.debugLine="Divider.SetVShow(vif)";
_divider._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdivider  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetWidth(w As String) As VMDivider";
 //BA.debugLineNum = 224;BA.debugLine="Divider.SetStyleSingle(\"width\", w)";
_divider._setstylesingle /*b4j.example.vmelement*/ ("width",(Object)(_w));
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 68;BA.debugLine="Return Divider.ToString";
if (true) return _divider._tostring /*String*/ ();
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
