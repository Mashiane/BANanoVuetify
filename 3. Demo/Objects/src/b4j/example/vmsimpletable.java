package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmsimpletable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmsimpletable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmsimpletable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _simpletable = null;
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
public b4j.example.vmsimpletable  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 55;BA.debugLine="Sub AddChild(child As VMElement) As VMSimpleTable";
 //BA.debugLineNum = 56;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 57;BA.debugLine="SimpleTable.SetText(childHTML)";
_simpletable._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
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
public b4j.example.vmsimpletable  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub AddClass(c As String) As VMSimpleTable";
 //BA.debugLineNum = 74;BA.debugLine="SimpleTable.AddClass(c)";
_simpletable._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub AddComponent(comp As String) As VMSimpleTable";
 //BA.debugLineNum = 317;BA.debugLine="SimpleTable.SetText(comp)";
_simpletable._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 328;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsimpletable  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 165;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 166;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 248;BA.debugLine="SimpleTable.BindStyleSingle(prop, value)";
_simpletable._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 332;BA.debugLine="SimpleTable.BuildModel(mprops, mstyles, lclasses,";
_simpletable._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public SimpleTable As VMElement";
_simpletable = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean    'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object      'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsimpletable  _disable() throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub Disable As VMSimpleTable";
 //BA.debugLineNum = 158;BA.debugLine="SimpleTable.Disable(True)";
_simpletable._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _enable() throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub Enable As VMSimpleTable";
 //BA.debugLineNum = 152;BA.debugLine="SimpleTable.Enable(True)";
_simpletable._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _hide() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub Hide As VMSimpleTable";
 //BA.debugLineNum = 140;BA.debugLine="SimpleTable.SetVisible(False)";
_simpletable._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="SimpleTable.Initialize(v, ID)";
_simpletable._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 15;BA.debugLine="SimpleTable.SetTag(\"v-simple-table\")";
_simpletable._settag /*b4j.example.vmelement*/ ("v-simple-table");
 //BA.debugLineNum = 16;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
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
public b4j.example.vmsimpletable  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSimple";
 //BA.debugLineNum = 199;BA.debugLine="SimpleTable.RemoveAttr(sName)";
_simpletable._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub Render";
 //BA.debugLineNum = 51;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsimpletable  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub SetAttr(attr as map) As VMSimpleTable";
 //BA.debugLineNum = 80;BA.debugLine="SimpleTable.SetAttr(attr)";
_simpletable._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 267;BA.debugLine="Sub SetAttributes(attrs As List) As VMSimpleTable";
 //BA.debugLineNum = 268;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 269;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSimpleTable";
 //BA.debugLineNum = 172;BA.debugLine="SimpleTable.SetAttrLoose(loose)";
_simpletable._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 242;BA.debugLine="SimpleTable.SetAttrSingle(prop, value)";
_simpletable._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 243;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 189;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 190;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 191;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 192;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 193;BA.debugLine="SimpleTable.Bind(\":color\", pp)";
_simpletable._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setdark(Object _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 98;BA.debugLine="Sub SetDark(varDark As Object) As VMSimpleTable";
 //BA.debugLineNum = 99;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 100;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardark);
 //BA.debugLineNum = 101;BA.debugLine="SimpleTable.Bind(\":dark\", pp)";
_simpletable._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 23;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setdense(Object _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 106;BA.debugLine="Sub SetDense(varDense As Object) As VMSimpleTable";
 //BA.debugLineNum = 107;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 108;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardense);
 //BA.debugLineNum = 109;BA.debugLine="SimpleTable.Bind(\":dense\", pp)";
_simpletable._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSimpleTable";
 //BA.debugLineNum = 217;BA.debugLine="SimpleTable.SetDesignMode(b)";
_simpletable._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 218;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 297;BA.debugLine="SimpleTable.SetDeviceOffsets(OS, OM, OL, OX)";
_simpletable._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 304;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 305;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 311;BA.debugLine="SimpleTable.SetDeviceSizes(SS, SM, SL, SX)";
_simpletable._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setfixedheader(Object _varfixedheader) throws Exception{
String _pp = "";
 //BA.debugLineNum = 114;BA.debugLine="Sub SetFixedHeader(varFixedHeader As Object) As VM";
 //BA.debugLineNum = 115;BA.debugLine="Dim pp As String = $\"${ID}FixedHeader\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"FixedHeader");
 //BA.debugLineNum = 116;BA.debugLine="vue.SetStateSingle(pp, varFixedHeader)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varfixedheader);
 //BA.debugLineNum = 117;BA.debugLine="SimpleTable.Bind(\":fixed-header\", pp)";
_simpletable._bind /*b4j.example.vmelement*/ (":fixed-header",_pp);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setheight(Object _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 122;BA.debugLine="Sub SetHeight(varHeight As Object) As VMSimpleTabl";
 //BA.debugLineNum = 123;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 124;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varheight);
 //BA.debugLineNum = 125;BA.debugLine="SimpleTable.Bind(\":height\", pp)";
_simpletable._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetKey(k As String) As VMSimpleTable";
 //BA.debugLineNum = 284;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 285;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setlight(Object _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 130;BA.debugLine="Sub SetLight(varLight As Object) As VMSimpleTable";
 //BA.debugLineNum = 131;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 132;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlight);
 //BA.debugLineNum = 133;BA.debugLine="SimpleTable.Bind(\":light\", pp)";
_simpletable._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetMarginAll(p As String) As VMSimpleTable";
 //BA.debugLineNum = 211;BA.debugLine="SimpleTable.setmarginall(p)";
_simpletable._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 230;BA.debugLine="SimpleTable.SetName(varName, bbind)";
_simpletable._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub SetPaddingAll(p As String) As VMSimpleTable";
 //BA.debugLineNum = 205;BA.debugLine="SimpleTable.SetPaddingAll(p)";
_simpletable._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMSim";
 //BA.debugLineNum = 291;BA.debugLine="SimpleTable.SetRC(sRow, sCol)";
_simpletable._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetStyle(sm As Map) As VMSimpleTable";
 //BA.debugLineNum = 86;BA.debugLine="SimpleTable.SetStyle(sm)";
_simpletable._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 236;BA.debugLine="SimpleTable.SetStyleSingle(prop, value)";
_simpletable._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetTabIndex(ti As String) As VMSimpleTable";
 //BA.debugLineNum = 224;BA.debugLine="SimpleTable.SetTabIndex(ti)";
_simpletable._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetText(t As Object) As VMSimpleTable";
 //BA.debugLineNum = 63;BA.debugLine="SimpleTable.SetText(t)";
_simpletable._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _settextcenter() throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub SetTextCenter As VMSimpleTable";
 //BA.debugLineNum = 323;BA.debugLine="SimpleTable.AddClass(\"text-center\")";
_simpletable._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 341;BA.debugLine="Sub SetTextColor(varColor As String) As VMSimpleTa";
 //BA.debugLineNum = 342;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 343;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 348;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 349;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 350;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 351;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 352;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetVElse(vif As String) As VMSimpleTable";
 //BA.debugLineNum = 253;BA.debugLine="SimpleTable.SetVElse(vif)";
_simpletable._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 275;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 276;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 277;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 278;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 279;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub SetVhtml(vhtml As String) As VMSimpleTable";
 //BA.debugLineNum = 263;BA.debugLine="SimpleTable.SetVHtml(vhtml)";
_simpletable._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetVIf(vif As String) As VMSimpleTable";
 //BA.debugLineNum = 40;BA.debugLine="SimpleTable.SetVIf(vif)";
_simpletable._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub SetVisible(b As Boolean) As VMSimpleTable";
 //BA.debugLineNum = 336;BA.debugLine="SimpleTable.SetVisible(b)";
_simpletable._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetVModel(k As String) As VMSimpleTable";
 //BA.debugLineNum = 35;BA.debugLine="SimpleTable.SetVModel(k)";
_simpletable._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetVShow(vif As String) As VMSimpleTable";
 //BA.debugLineNum = 45;BA.debugLine="SimpleTable.SetVShow(vif)";
_simpletable._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetVText(vhtml As String) As VMSimpleTable";
 //BA.debugLineNum = 258;BA.debugLine="SimpleTable.SetVText(vhtml)";
_simpletable._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimpletable  _show() throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub Show As VMSimpleTable";
 //BA.debugLineNum = 146;BA.debugLine="SimpleTable.SetVisible(True)";
_simpletable._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 31;BA.debugLine="Return SimpleTable.ToString";
if (true) return _simpletable._tostring /*String*/ ();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsimpletable  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 177;BA.debugLine="Sub UseTheme(themeName As String) As VMSimpleTable";
 //BA.debugLineNum = 178;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 179;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 180;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 181;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 182;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimpletable)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
