package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmfabtransition extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmfabtransition", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmfabtransition.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _fabtransition = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
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
public b4j.example.vmfabtransition  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 73;BA.debugLine="Sub AddChild(child As VMElement) As VMFabTransitio";
 //BA.debugLineNum = 74;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 75;BA.debugLine="FabTransition.SetText(childHTML)";
_fabtransition._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 103;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 104;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 105;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfabtransition  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub AddClass(c As String) As VMFabTransition";
 //BA.debugLineNum = 86;BA.debugLine="FabTransition.AddClass(c)";
_fabtransition._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub AddComponent(comp As String) As VMFabTransitio";
 //BA.debugLineNum = 347;BA.debugLine="FabTransition.SetText(comp)";
_fabtransition._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 31;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 32;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 33;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 34;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 35;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 36;BA.debugLine="SetText(d.ToString)";
_settext(_d._tostring /*String*/ ());
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 358;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfabtransition  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 204;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 205;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 278;BA.debugLine="FabTransition.BindStyleSingle(prop, value)";
_fabtransition._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 363;BA.debugLine="FabTransition.BuildModel(mprops, mstyles, lclasse";
_fabtransition._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public FabTransition As VMElement";
_fabtransition = new b4j.example.vmelement();
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
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfabtransition  _disable() throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub Disable As VMFabTransition";
 //BA.debugLineNum = 197;BA.debugLine="FabTransition.Disable(True)";
_fabtransition._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _enable() throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub Enable As VMFabTransition";
 //BA.debugLineNum = 191;BA.debugLine="FabTransition.Enable(True)";
_fabtransition._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _hide() throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub Hide As VMFabTransition";
 //BA.debugLineNum = 179;BA.debugLine="FabTransition.SetVisible(False)";
_fabtransition._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="FabTransition.Initialize(v, ID)";
_fabtransition._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="FabTransition.SetTag(\"v-fab-transition\")";
_fabtransition._settag /*b4j.example.vmelement*/ ("v-fab-transition");
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 81;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfabtransition  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="public Sub RemoveAttr(sName As String) As VMFabTra";
 //BA.debugLineNum = 228;BA.debugLine="FabTransition.RemoveAttr(sName)";
_fabtransition._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Render";
 //BA.debugLineNum = 69;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfabtransition  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetAttr(attr As Map) As VMFabTransition";
 //BA.debugLineNum = 92;BA.debugLine="FabTransition.SetAttr(attr)";
_fabtransition._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 297;BA.debugLine="Sub SetAttributes(attrs As List) As VMFabTransitio";
 //BA.debugLineNum = 298;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 299;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub SetAttrLoose(loose As String) As VMFabTransiti";
 //BA.debugLineNum = 211;BA.debugLine="FabTransition.SetAttrLoose(loose)";
_fabtransition._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 272;BA.debugLine="FabTransition.SetAttrSingle(prop, value)";
_fabtransition._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 25;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMFabTransition";
 //BA.debugLineNum = 246;BA.debugLine="FabTransition.SetDesignMode(b)";
_fabtransition._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 247;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 327;BA.debugLine="FabTransition.SetDeviceOffsets(OS, OM, OL, OX)";
_fabtransition._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 334;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 335;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 341;BA.debugLine="FabTransition.SetDeviceSizes(SS, SM, SL, SX)";
_fabtransition._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setgroup(boolean _vargroup) throws Exception{
String _pp = "";
 //BA.debugLineNum = 138;BA.debugLine="Sub SetGroup(varGroup As Boolean) As VMFabTransiti";
 //BA.debugLineNum = 139;BA.debugLine="If varGroup = False Then Return Me";
if (_vargroup==__c.False) { 
if (true) return (b4j.example.vmfabtransition)(this);};
 //BA.debugLineNum = 140;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 141;BA.debugLine="SetAttrSingle(\"group\", varGroup)";
_setattrsingle("group",BA.ObjectToString(_vargroup));
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 };
 //BA.debugLineNum = 144;BA.debugLine="Dim pp As String = $\"${ID}Group\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Group");
 //BA.debugLineNum = 145;BA.debugLine="vue.SetStateSingle(pp, varGroup)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vargroup));
 //BA.debugLineNum = 146;BA.debugLine="FabTransition.Bind(\":group\", pp)";
_fabtransition._bind /*b4j.example.vmelement*/ (":group",_pp);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _sethideonleave(boolean _varhideonleave) throws Exception{
String _pp = "";
 //BA.debugLineNum = 151;BA.debugLine="Sub SetHideOnLeave(varHideOnLeave As Boolean) As V";
 //BA.debugLineNum = 152;BA.debugLine="If varHideOnLeave = False Then Return Me";
if (_varhideonleave==__c.False) { 
if (true) return (b4j.example.vmfabtransition)(this);};
 //BA.debugLineNum = 153;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 154;BA.debugLine="SetAttrSingle(\"hide-on-leave\", varHideOnLeave)";
_setattrsingle("hide-on-leave",BA.ObjectToString(_varhideonleave));
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 };
 //BA.debugLineNum = 157;BA.debugLine="Dim pp As String = $\"${ID}HideOnLeave\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideOnLeave");
 //BA.debugLineNum = 158;BA.debugLine="vue.SetStateSingle(pp, varHideOnLeave)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhideonleave));
 //BA.debugLineNum = 159;BA.debugLine="FabTransition.Bind(\":hide-on-leave\", pp)";
_fabtransition._bind /*b4j.example.vmelement*/ (":hide-on-leave",_pp);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetKey(k As String) As VMFabTransition";
 //BA.debugLineNum = 314;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 315;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setleaveabsolute(boolean _varleaveabsolute) throws Exception{
String _pp = "";
 //BA.debugLineNum = 164;BA.debugLine="Sub SetLeaveAbsolute(varLeaveAbsolute As Boolean)";
 //BA.debugLineNum = 165;BA.debugLine="If varLeaveAbsolute = False Then Return Me";
if (_varleaveabsolute==__c.False) { 
if (true) return (b4j.example.vmfabtransition)(this);};
 //BA.debugLineNum = 166;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 167;BA.debugLine="SetAttrSingle(\"leave-absolute\", varLeaveAbsolute";
_setattrsingle("leave-absolute",BA.ObjectToString(_varleaveabsolute));
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 };
 //BA.debugLineNum = 170;BA.debugLine="Dim pp As String = $\"${ID}LeaveAbsolute\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"LeaveAbsolute");
 //BA.debugLineNum = 171;BA.debugLine="vue.SetStateSingle(pp, varLeaveAbsolute)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varleaveabsolute));
 //BA.debugLineNum = 172;BA.debugLine="FabTransition.Bind(\":leave-absolute\", pp)";
_fabtransition._bind /*b4j.example.vmelement*/ (":leave-absolute",_pp);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub SetMarginAll(p As String) As VMFabTransition";
 //BA.debugLineNum = 240;BA.debugLine="FabTransition.setmarginall(p)";
_fabtransition._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setmode(String _varmode) throws Exception{
String _pp = "";
 //BA.debugLineNum = 110;BA.debugLine="Sub SetMode(varMode As String) As VMFabTransition";
 //BA.debugLineNum = 111;BA.debugLine="If varMode = \"\" Then Return Me";
if ((_varmode).equals("")) { 
if (true) return (b4j.example.vmfabtransition)(this);};
 //BA.debugLineNum = 112;BA.debugLine="If varMode = \"out-in\" Then Return Me";
if ((_varmode).equals("out-in")) { 
if (true) return (b4j.example.vmfabtransition)(this);};
 //BA.debugLineNum = 113;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 114;BA.debugLine="SetAttrSingle(\"mode\", varMode)";
_setattrsingle("mode",_varmode);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 };
 //BA.debugLineNum = 117;BA.debugLine="Dim pp As String = $\"${ID}Mode\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mode");
 //BA.debugLineNum = 118;BA.debugLine="vue.SetStateSingle(pp, varMode)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmode));
 //BA.debugLineNum = 119;BA.debugLine="FabTransition.Bind(\":mode\", pp)";
_fabtransition._bind /*b4j.example.vmelement*/ (":mode",_pp);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 260;BA.debugLine="FabTransition.SetName(varName, bbind)";
_fabtransition._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setorigin(String _varorigin) throws Exception{
String _pp = "";
 //BA.debugLineNum = 124;BA.debugLine="Sub SetOrigin(varOrigin As String) As VMFabTransit";
 //BA.debugLineNum = 125;BA.debugLine="If varOrigin = \"\" Then Return Me";
if ((_varorigin).equals("")) { 
if (true) return (b4j.example.vmfabtransition)(this);};
 //BA.debugLineNum = 126;BA.debugLine="If varOrigin = \"center center\" Then Return Me";
if ((_varorigin).equals("center center")) { 
if (true) return (b4j.example.vmfabtransition)(this);};
 //BA.debugLineNum = 127;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 128;BA.debugLine="SetAttrSingle(\"origin\", varOrigin)";
_setattrsingle("origin",_varorigin);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 };
 //BA.debugLineNum = 131;BA.debugLine="Dim pp As String = $\"${ID}Origin\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Origin");
 //BA.debugLineNum = 132;BA.debugLine="vue.SetStateSingle(pp, varOrigin)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varorigin));
 //BA.debugLineNum = 133;BA.debugLine="FabTransition.Bind(\":origin\", pp)";
_fabtransition._bind /*b4j.example.vmelement*/ (":origin",_pp);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Sub SetPaddingAll(p As String) As VMFabTransition";
 //BA.debugLineNum = 234;BA.debugLine="FabTransition.SetPaddingAll(p)";
_fabtransition._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMFab";
 //BA.debugLineNum = 321;BA.debugLine="FabTransition.SetRC(sRow, sCol)";
_fabtransition._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub SetStatic(b As Boolean) As VMFabTransition";
 //BA.debugLineNum = 253;BA.debugLine="FabTransition.SetStatic(b)";
_fabtransition._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 254;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetStyle(sm As Map) As VMFabTransition";
 //BA.debugLineNum = 98;BA.debugLine="FabTransition.SetStyle(sm)";
_fabtransition._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 266;BA.debugLine="FabTransition.SetStyleSingle(prop, value)";
_fabtransition._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public String  _settext(String _child) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetText(child As String)";
 //BA.debugLineNum = 44;BA.debugLine="FabTransition.SetText(child)";
_fabtransition._settext /*b4j.example.vmelement*/ (_child);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfabtransition  _settextcenter() throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub SetTextCenter As VMFabTransition";
 //BA.debugLineNum = 353;BA.debugLine="FabTransition.AddClass(\"text-center\")";
_fabtransition._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _settextcolor(String _textcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 374;BA.debugLine="Sub SetTextColor(textcolor As String) As VMFabTran";
 //BA.debugLineNum = 375;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmfabtransition)(this);};
 //BA.debugLineNum = 376;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 377;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _settextcolorintensity(String _textcolor,String _textintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 382;BA.debugLine="Sub SetTextColorIntensity(textcolor As String, tex";
 //BA.debugLineNum = 383;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmfabtransition)(this);};
 //BA.debugLineNum = 384;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 385;BA.debugLine="Dim sIntensity As String = $\"text--${textintensit";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_textintensity))+"");
 //BA.debugLineNum = 386;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 387;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub SetVElse(vif As String) As VMFabTransition";
 //BA.debugLineNum = 283;BA.debugLine="FabTransition.SetVElse(vif)";
_fabtransition._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 305;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 306;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 307;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 308;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 309;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetVhtml(vhtml As String) As VMFabTransition";
 //BA.debugLineNum = 293;BA.debugLine="FabTransition.SetVHtml(vhtml)";
_fabtransition._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetVIf(vif As String) As VMFabTransition";
 //BA.debugLineNum = 58;BA.debugLine="FabTransition.SetVIf(vif)";
_fabtransition._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub SetVisible(b As Boolean) As VMFabTransition";
 //BA.debugLineNum = 369;BA.debugLine="FabTransition.SetVisible(b)";
_fabtransition._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetVModel(k As String) As VMFabTransition";
 //BA.debugLineNum = 53;BA.debugLine="FabTransition.SetVModel(k)";
_fabtransition._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetVShow(vif As String) As VMFabTransition";
 //BA.debugLineNum = 63;BA.debugLine="FabTransition.SetVShow(vif)";
_fabtransition._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetVText(vhtml As String) As VMFabTransition";
 //BA.debugLineNum = 288;BA.debugLine="FabTransition.SetVText(vhtml)";
_fabtransition._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfabtransition  _show() throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Sub Show As VMFabTransition";
 //BA.debugLineNum = 185;BA.debugLine="FabTransition.SetVisible(True)";
_fabtransition._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 49;BA.debugLine="Return FabTransition.ToString";
if (true) return _fabtransition._tostring /*String*/ ();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfabtransition  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 216;BA.debugLine="Sub UseTheme(themeName As String) As VMFabTransiti";
 //BA.debugLineNum = 217;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 218;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 219;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 220;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 221;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfabtransition)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
