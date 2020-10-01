package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmskeletonloader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmskeletonloader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmskeletonloader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _skeletonloader = null;
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
public b4j.example.vmskeletonloader  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 80;BA.debugLine="Sub AddChild(child As VMElement) As VMSkeletonLoad";
 //BA.debugLineNum = 81;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 82;BA.debugLine="SkeletonLoader.SetText(childHTML)";
_skeletonloader._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 116;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 117;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 118;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmskeletonloader  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub AddClass(c As String) As VMSkeletonLoader";
 //BA.debugLineNum = 99;BA.debugLine="SkeletonLoader.AddClass(c)";
_skeletonloader._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 270;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 271;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 353;BA.debugLine="SkeletonLoader.BindStyleSingle(prop, value)";
_skeletonloader._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 395;BA.debugLine="SkeletonLoader.BuildModel(mprops, mstyles, lclasse";
_skeletonloader._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public SkeletonLoader As VMElement";
_skeletonloader = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean   'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object    'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmskeletonloader  _disable() throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub Disable As VMSkeletonLoader";
 //BA.debugLineNum = 263;BA.debugLine="SkeletonLoader.Disable(True)";
_skeletonloader._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _enable() throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub Enable As VMSkeletonLoader";
 //BA.debugLineNum = 257;BA.debugLine="SkeletonLoader.Enable(True)";
_skeletonloader._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _hide() throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub Hide As VMSkeletonLoader";
 //BA.debugLineNum = 245;BA.debugLine="SkeletonLoader.SetVisible(False)";
_skeletonloader._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="SkeletonLoader.Initialize(v, ID)";
_skeletonloader._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 15;BA.debugLine="SkeletonLoader.SetTag(\"v-skeleton-loader\")";
_skeletonloader._settag /*b4j.example.vmelement*/ ("v-skeleton-loader");
 //BA.debugLineNum = 16;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 94;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmskeletonloader  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSkelet";
 //BA.debugLineNum = 304;BA.debugLine="SkeletonLoader.RemoveAttr(sName)";
_skeletonloader._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub Render";
 //BA.debugLineNum = 76;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmskeletonloader  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetAttr(attr As Map) As VMSkeletonLoader";
 //BA.debugLineNum = 105;BA.debugLine="SkeletonLoader.SetAttr(attr)";
_skeletonloader._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 372;BA.debugLine="Sub SetAttributes(attrs As List) As VMSkeletonLoad";
 //BA.debugLineNum = 373;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 374;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSkeletonLoa";
 //BA.debugLineNum = 277;BA.debugLine="SkeletonLoader.SetAttrLoose(loose)";
_skeletonloader._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 347;BA.debugLine="SkeletonLoader.SetAttrSingle(prop, value)";
_skeletonloader._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setboilerplate(Object _varboilerplate) throws Exception{
String _pp = "";
 //BA.debugLineNum = 123;BA.debugLine="Sub SetBoilerplate(varBoilerplate As Object) As VM";
 //BA.debugLineNum = 124;BA.debugLine="Dim pp As String = $\"${ID}Boilerplate\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Boilerplate");
 //BA.debugLineNum = 125;BA.debugLine="vue.SetStateSingle(pp, varBoilerplate)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varboilerplate);
 //BA.debugLineNum = 126;BA.debugLine="SkeletonLoader.Bind(\":boilerplate\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":boilerplate",_pp);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 294;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 295;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 296;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 297;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 298;BA.debugLine="SkeletonLoader.Bind(\":color\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setdark(Object _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 131;BA.debugLine="Sub SetDark(varDark As Object) As VMSkeletonLoader";
 //BA.debugLineNum = 132;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 133;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardark);
 //BA.debugLineNum = 134;BA.debugLine="SkeletonLoader.Bind(\":dark\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 23;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSkeletonLoade";
 //BA.debugLineNum = 322;BA.debugLine="SkeletonLoader.SetDesignMode(b)";
_skeletonloader._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 323;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 37;BA.debugLine="SkeletonLoader.SetDeviceOffsets(OS, OM, OL, OX)";
_skeletonloader._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 49;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 50;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 43;BA.debugLine="SkeletonLoader.SetDeviceSizes(SS, SM, SL, SX)";
_skeletonloader._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setelevation(Object _varelevation) throws Exception{
String _pp = "";
 //BA.debugLineNum = 139;BA.debugLine="Sub SetElevation(varElevation As Object) As VMSkel";
 //BA.debugLineNum = 140;BA.debugLine="Dim pp As String = $\"${ID}Elevation\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Elevation");
 //BA.debugLineNum = 141;BA.debugLine="vue.SetStateSingle(pp, varElevation)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varelevation);
 //BA.debugLineNum = 142;BA.debugLine="SkeletonLoader.Bind(\":elevation\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":elevation",_pp);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setheight(Object _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 147;BA.debugLine="Sub SetHeight(varHeight As Object) As VMSkeletonLo";
 //BA.debugLineNum = 148;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 149;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varheight);
 //BA.debugLineNum = 150;BA.debugLine="SkeletonLoader.Bind(\":height\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Sub SetKey(k As String) As VMSkeletonLoader";
 //BA.debugLineNum = 389;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 390;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setlight(Object _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 155;BA.debugLine="Sub SetLight(varLight As Object) As VMSkeletonLoad";
 //BA.debugLineNum = 156;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 157;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlight);
 //BA.debugLineNum = 158;BA.debugLine="SkeletonLoader.Bind(\":light\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setloading(Object _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 163;BA.debugLine="Sub SetLoading(varLoading As Object) As VMSkeleton";
 //BA.debugLineNum = 164;BA.debugLine="Dim pp As String = $\"${ID}Loading\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Loading");
 //BA.debugLineNum = 165;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varloading);
 //BA.debugLineNum = 166;BA.debugLine="SkeletonLoader.Bind(\":loading\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":loading",_pp);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetMarginAll(p As String) As VMSkeletonLoader";
 //BA.debugLineNum = 316;BA.debugLine="SkeletonLoader.setmarginall(p)";
_skeletonloader._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setmaxheight(Object _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 171;BA.debugLine="Sub SetMaxHeight(varMaxHeight As Object) As VMSkel";
 //BA.debugLineNum = 172;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 173;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmaxheight);
 //BA.debugLineNum = 174;BA.debugLine="SkeletonLoader.Bind(\":max-height\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":max-height",_pp);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setmaxwidth(Object _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 179;BA.debugLine="Sub SetMaxWidth(varMaxWidth As Object) As VMSkelet";
 //BA.debugLineNum = 180;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 181;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmaxwidth);
 //BA.debugLineNum = 182;BA.debugLine="SkeletonLoader.Bind(\":max-width\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":max-width",_pp);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setminheight(Object _varminheigh) throws Exception{
String _pp = "";
 //BA.debugLineNum = 187;BA.debugLine="Sub SetMinHeight(varMinHeigh As Object) As VMSkele";
 //BA.debugLineNum = 188;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 189;BA.debugLine="vue.SetStateSingle(pp, varMinHeigh)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varminheigh);
 //BA.debugLineNum = 190;BA.debugLine="SkeletonLoader.Bind(\":min-height\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":min-height",_pp);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setminwidth(Object _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 195;BA.debugLine="Sub SetMinWidth(varMinWidth As Object) As VMSkelet";
 //BA.debugLineNum = 196;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 197;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varminwidth);
 //BA.debugLineNum = 198;BA.debugLine="SkeletonLoader.Bind(\":min-width\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":min-width",_pp);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 335;BA.debugLine="SkeletonLoader.SetName(varName, bbind)";
_skeletonloader._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub SetPaddingAll(p As String) As VMSkeletonLoader";
 //BA.debugLineNum = 310;BA.debugLine="SkeletonLoader.SetPaddingAll(p)";
_skeletonloader._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMSke";
 //BA.debugLineNum = 31;BA.debugLine="SkeletonLoader.SetRC(sRow, sCol)";
_skeletonloader._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetStyle(sm As Map) As VMSkeletonLoader";
 //BA.debugLineNum = 111;BA.debugLine="SkeletonLoader.SetStyle(sm)";
_skeletonloader._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 341;BA.debugLine="SkeletonLoader.SetStyleSingle(prop, value)";
_skeletonloader._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetTabIndex(ti As String) As VMSkeletonLoader";
 //BA.debugLineNum = 329;BA.debugLine="SkeletonLoader.SetTabIndex(ti)";
_skeletonloader._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetText(t As Object) As VMSkeletonLoader";
 //BA.debugLineNum = 88;BA.debugLine="SkeletonLoader.SetText(t)";
_skeletonloader._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 404;BA.debugLine="Sub SetTextColor(varColor As String) As VMSkeleton";
 //BA.debugLineNum = 405;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 406;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 411;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 412;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 413;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 414;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 415;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 416;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _settile(Object _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 203;BA.debugLine="Sub SetTile(varTile As Object) As VMSkeletonLoader";
 //BA.debugLineNum = 204;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 205;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartile);
 //BA.debugLineNum = 206;BA.debugLine="SkeletonLoader.Bind(\":tile\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":tile",_pp);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _settransition(Object _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub SetTransition(varTransition As Object) As VMSk";
 //BA.debugLineNum = 212;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 213;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartransition);
 //BA.debugLineNum = 214;BA.debugLine="SkeletonLoader.Bind(\":transition\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _settype(Object _vartype) throws Exception{
String _pp = "";
 //BA.debugLineNum = 219;BA.debugLine="Sub SetType(varType As Object) As VMSkeletonLoader";
 //BA.debugLineNum = 220;BA.debugLine="Dim pp As String = $\"${ID}Type\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Type");
 //BA.debugLineNum = 221;BA.debugLine="vue.SetStateSingle(pp, varType)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartype);
 //BA.debugLineNum = 222;BA.debugLine="SkeletonLoader.Bind(\":type\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":type",_pp);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _settypes(Object _vartypes) throws Exception{
String _pp = "";
 //BA.debugLineNum = 227;BA.debugLine="Sub SetTypes(varTypes As Object) As VMSkeletonLoad";
 //BA.debugLineNum = 228;BA.debugLine="Dim pp As String = $\"${ID}Types\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Types");
 //BA.debugLineNum = 229;BA.debugLine="vue.SetStateSingle(pp, varTypes)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartypes);
 //BA.debugLineNum = 230;BA.debugLine="SkeletonLoader.Bind(\":types\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":types",_pp);
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub SetVElse(vif As String) As VMSkeletonLoader";
 //BA.debugLineNum = 358;BA.debugLine="SkeletonLoader.SetVElse(vif)";
_skeletonloader._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 380;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 381;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 382;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 383;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 384;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 367;BA.debugLine="Sub SetVhtml(vhtml As String) As VMSkeletonLoader";
 //BA.debugLineNum = 368;BA.debugLine="SkeletonLoader.SetVHtml(vhtml)";
_skeletonloader._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetVIf(vif As String) As VMSkeletonLoader";
 //BA.debugLineNum = 65;BA.debugLine="SkeletonLoader.SetVIf(vif)";
_skeletonloader._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Sub SetVisible(b As Boolean) As VMSkeletonLoader";
 //BA.debugLineNum = 399;BA.debugLine="SkeletonLoader.SetVisible(b)";
_skeletonloader._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 400;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetVModel(k As String) As VMSkeletonLoader";
 //BA.debugLineNum = 60;BA.debugLine="SkeletonLoader.SetVModel(k)";
_skeletonloader._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetVShow(vif As String) As VMSkeletonLoader";
 //BA.debugLineNum = 70;BA.debugLine="SkeletonLoader.SetVShow(vif)";
_skeletonloader._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub SetVText(vhtml As String) As VMSkeletonLoader";
 //BA.debugLineNum = 363;BA.debugLine="SkeletonLoader.SetVText(vhtml)";
_skeletonloader._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _setwidth(Object _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 235;BA.debugLine="Sub SetWidth(varWidth As Object) As VMSkeletonLoad";
 //BA.debugLineNum = 236;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 237;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varwidth);
 //BA.debugLineNum = 238;BA.debugLine="SkeletonLoader.Bind(\":width\", pp)";
_skeletonloader._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmskeletonloader  _show() throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub Show As VMSkeletonLoader";
 //BA.debugLineNum = 251;BA.debugLine="SkeletonLoader.SetVisible(True)";
_skeletonloader._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 56;BA.debugLine="Return SkeletonLoader.ToString";
if (true) return _skeletonloader._tostring /*String*/ ();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmskeletonloader  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 282;BA.debugLine="Sub UseTheme(themeName As String) As VMSkeletonLoa";
 //BA.debugLineNum = 283;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 284;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 285;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 286;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 287;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmskeletonloader)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
