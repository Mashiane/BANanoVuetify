package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmslidegroup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmslidegroup", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmslidegroup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _slidegroup = null;
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
public b4j.example.vmslidegroup  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 84;BA.debugLine="Sub AddChild(child As VMElement) As VMSlideGroup";
 //BA.debugLineNum = 85;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 86;BA.debugLine="SlideGroup.SetText(childHTML)";
_slidegroup._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 120;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 121;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 122;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslidegroup  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub AddClass(c As String) As VMSlideGroup";
 //BA.debugLineNum = 103;BA.debugLine="SlideGroup.AddClass(c)";
_slidegroup._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub AddComponent(comp As String) As VMSlideGroup";
 //BA.debugLineNum = 30;BA.debugLine="SetText(comp)";
_settext((Object)(_comp));
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _additem(b4j.example.vmslideitem _vitem) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub AddItem(vitem As VMSlideItem) As VMSlideGroup";
 //BA.debugLineNum = 35;BA.debugLine="SetText(vitem.ToString)";
_settext((Object)(_vitem._tostring /*String*/ ()));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 428;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 429;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslidegroup  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 272;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 273;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 355;BA.debugLine="SlideGroup.BindStyleSingle(prop, value)";
_slidegroup._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 432;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 433;BA.debugLine="SlideGroup.BuildModel(mprops, mstyles, lclasses, l";
_slidegroup._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public SlideGroup As VMElement";
_slidegroup = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean   'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslidegroup  _disable() throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub Disable As VMSlideGroup";
 //BA.debugLineNum = 265;BA.debugLine="SlideGroup.Disable(True)";
_slidegroup._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _enable() throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub Enable As VMSlideGroup";
 //BA.debugLineNum = 259;BA.debugLine="SlideGroup.Enable(True)";
_slidegroup._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _hide() throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub Hide As VMSlideGroup";
 //BA.debugLineNum = 247;BA.debugLine="SlideGroup.SetVisible(False)";
_slidegroup._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="SlideGroup.Initialize(v, ID)";
_slidegroup._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 15;BA.debugLine="SlideGroup.SetTag(\"v-slide-group\")";
_slidegroup._settag /*b4j.example.vmelement*/ ("v-slide-group");
 //BA.debugLineNum = 16;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 98;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslidegroup  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSlideG";
 //BA.debugLineNum = 306;BA.debugLine="SlideGroup.RemoveAttr(sName)";
_slidegroup._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub Render";
 //BA.debugLineNum = 80;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslidegroup  _setactiveclass(Object _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 127;BA.debugLine="Sub SetActiveClass(varActiveClass As Object) As VM";
 //BA.debugLineNum = 128;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 129;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varactiveclass);
 //BA.debugLineNum = 130;BA.debugLine="SlideGroup.Bind(\":active-class\", pp)";
_slidegroup._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetAttr(attr As Map) As VMSlideGroup";
 //BA.debugLineNum = 109;BA.debugLine="SlideGroup.SetAttr(attr)";
_slidegroup._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 374;BA.debugLine="Sub SetAttributes(attrs As List) As VMSlideGroup";
 //BA.debugLineNum = 375;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 376;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSlideGroup";
 //BA.debugLineNum = 279;BA.debugLine="SlideGroup.SetAttrLoose(loose)";
_slidegroup._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 349;BA.debugLine="SlideGroup.SetAttrSingle(prop, value)";
_slidegroup._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setcenteractive(Object _varcenteractive) throws Exception{
String _pp = "";
 //BA.debugLineNum = 135;BA.debugLine="Sub SetCenterActive(varCenterActive As Object) As";
 //BA.debugLineNum = 136;BA.debugLine="Dim pp As String = $\"${ID}CenterActive\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CenterActive");
 //BA.debugLineNum = 137;BA.debugLine="vue.SetStateSingle(pp, varCenterActive)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcenteractive);
 //BA.debugLineNum = 138;BA.debugLine="SlideGroup.Bind(\":center-active\", pp)";
_slidegroup._bind /*b4j.example.vmelement*/ (":center-active",_pp);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 296;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 297;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 298;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 299;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 300;BA.debugLine="SlideGroup.Bind(\":color\", pp)";
_slidegroup._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setdark(Object _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 143;BA.debugLine="Sub SetDark(varDark As Object) As VMSlideGroup";
 //BA.debugLineNum = 144;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 145;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardark);
 //BA.debugLineNum = 146;BA.debugLine="SlideGroup.Bind(\":dark\", pp)";
_slidegroup._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 24;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSlideGroup";
 //BA.debugLineNum = 324;BA.debugLine="SlideGroup.SetDesignMode(b)";
_slidegroup._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 325;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 404;BA.debugLine="SlideGroup.SetDeviceOffsets(OS, OM, OL, OX)";
_slidegroup._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 411;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 412;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 413;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 418;BA.debugLine="SlideGroup.SetDeviceSizes(SS, SM, SL, SX)";
_slidegroup._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Sub SetKey(k As String) As VMSlideGroup";
 //BA.debugLineNum = 391;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 392;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setlight(Object _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 151;BA.debugLine="Sub SetLight(varLight As Object) As VMSlideGroup";
 //BA.debugLineNum = 152;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 153;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlight);
 //BA.debugLineNum = 154;BA.debugLine="SlideGroup.Bind(\":light\", pp)";
_slidegroup._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setmandatory(Object _varmandatory) throws Exception{
String _pp = "";
 //BA.debugLineNum = 159;BA.debugLine="Sub SetMandatory(varMandatory As Object) As VMSlid";
 //BA.debugLineNum = 160;BA.debugLine="Dim pp As String = $\"${ID}Mandatory\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mandatory");
 //BA.debugLineNum = 161;BA.debugLine="vue.SetStateSingle(pp, varMandatory)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmandatory);
 //BA.debugLineNum = 162;BA.debugLine="SlideGroup.Bind(\":mandatory\", pp)";
_slidegroup._bind /*b4j.example.vmelement*/ (":mandatory",_pp);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub SetMarginAll(p As String) As VMSlideGroup";
 //BA.debugLineNum = 318;BA.debugLine="SlideGroup.setmarginall(p)";
_slidegroup._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setmax(Object _varmax) throws Exception{
String _pp = "";
 //BA.debugLineNum = 167;BA.debugLine="Sub SetMax(varMax As Object) As VMSlideGroup";
 //BA.debugLineNum = 168;BA.debugLine="Dim pp As String = $\"${ID}Max\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Max");
 //BA.debugLineNum = 169;BA.debugLine="vue.SetStateSingle(pp, varMax)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmax);
 //BA.debugLineNum = 170;BA.debugLine="SlideGroup.Bind(\":max\", pp)";
_slidegroup._bind /*b4j.example.vmelement*/ (":max",_pp);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setmobilebreakpoint(Object _varmobilebreakpoint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 175;BA.debugLine="Sub SetMobileBreakPoint(varMobileBreakPoint As Obj";
 //BA.debugLineNum = 176;BA.debugLine="Dim pp As String = $\"${ID}MobileBreakPoint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MobileBreakPoint");
 //BA.debugLineNum = 177;BA.debugLine="vue.SetStateSingle(pp, varMobileBreakPoint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmobilebreakpoint);
 //BA.debugLineNum = 178;BA.debugLine="SlideGroup.Bind(\":mobile-break-point\", pp)";
_slidegroup._bind /*b4j.example.vmelement*/ (":mobile-break-point",_pp);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setmultiple(Object _varmultiple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 183;BA.debugLine="Sub SetMultiple(varMultiple As Object) As VMSlideG";
 //BA.debugLineNum = 184;BA.debugLine="Dim pp As String = $\"${ID}Multiple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Multiple");
 //BA.debugLineNum = 185;BA.debugLine="vue.SetStateSingle(pp, varMultiple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmultiple);
 //BA.debugLineNum = 186;BA.debugLine="SlideGroup.Bind(\":multiple\", pp)";
_slidegroup._bind /*b4j.example.vmelement*/ (":multiple",_pp);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 337;BA.debugLine="SlideGroup.SetName(varName, bbind)";
_slidegroup._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setnexticon(Object _varnexticon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 191;BA.debugLine="Sub SetNextIcon(varNextIcon As Object) As VMSlideG";
 //BA.debugLineNum = 192;BA.debugLine="Dim pp As String = $\"${ID}NextIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NextIcon");
 //BA.debugLineNum = 193;BA.debugLine="vue.SetStateSingle(pp, varNextIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varnexticon);
 //BA.debugLineNum = 194;BA.debugLine="SlideGroup.Bind(\":next-icon\", pp)";
_slidegroup._bind /*b4j.example.vmelement*/ (":next-icon",_pp);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setonchange(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 40;BA.debugLine="Sub SetOnChange(eventHandler As Object,methodName";
 //BA.debugLineNum = 41;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 42;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmslidegroup)(this);};
 //BA.debugLineNum = 43;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 44;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 45;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 47;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setonclicklocation(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 233;BA.debugLine="Sub SetOnClickLocation(methodName As String) As VM";
 //BA.debugLineNum = 234;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 235;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmslidegroup)(this);};
 //BA.debugLineNum = 236;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 237;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 238;BA.debugLine="SetAttr(CreateMap(\"@click:location\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:location"),(Object)(_methodname)}));
 //BA.debugLineNum = 240;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetPaddingAll(p As String) As VMSlideGroup";
 //BA.debugLineNum = 312;BA.debugLine="SlideGroup.SetPaddingAll(p)";
_slidegroup._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setprevicon(Object _varprevicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 199;BA.debugLine="Sub SetPrevIcon(varPrevIcon As Object) As VMSlideG";
 //BA.debugLineNum = 200;BA.debugLine="Dim pp As String = $\"${ID}PrevIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrevIcon");
 //BA.debugLineNum = 201;BA.debugLine="vue.SetStateSingle(pp, varPrevIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varprevicon);
 //BA.debugLineNum = 202;BA.debugLine="SlideGroup.Bind(\":prev-icon\", pp)";
_slidegroup._bind /*b4j.example.vmelement*/ (":prev-icon",_pp);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMSli";
 //BA.debugLineNum = 398;BA.debugLine="SlideGroup.SetRC(sRow, sCol)";
_slidegroup._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setshowarrows(Object _varshowarrows) throws Exception{
String _pp = "";
 //BA.debugLineNum = 207;BA.debugLine="Sub SetShowArrows(varShowArrows As Object) As VMSl";
 //BA.debugLineNum = 208;BA.debugLine="Dim pp As String = $\"${ID}ShowArrows\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowArrows");
 //BA.debugLineNum = 209;BA.debugLine="vue.SetStateSingle(pp, varShowArrows)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varshowarrows);
 //BA.debugLineNum = 210;BA.debugLine="SlideGroup.Bind(\":show-arrows\", pp)";
_slidegroup._bind /*b4j.example.vmelement*/ (":show-arrows",_pp);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setslotnext(boolean _b) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetSlotNext(b As Boolean) As VMSlideGroup    '";
 //BA.debugLineNum = 222;BA.debugLine="SetAttr(CreateMap(\"slot\": \"next\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("next")}));
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setslotprev(boolean _b) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetSlotPrev(b As Boolean) As VMSlideGroup    '";
 //BA.debugLineNum = 228;BA.debugLine="SetAttr(CreateMap(\"slot\": \"prev\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("prev")}));
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetStyle(sm As Map) As VMSlideGroup";
 //BA.debugLineNum = 115;BA.debugLine="SlideGroup.SetStyle(sm)";
_slidegroup._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 343;BA.debugLine="SlideGroup.SetStyleSingle(prop, value)";
_slidegroup._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub SetTabIndex(ti As String) As VMSlideGroup";
 //BA.debugLineNum = 331;BA.debugLine="SlideGroup.SetTabIndex(ti)";
_slidegroup._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetText(t As Object) As VMSlideGroup";
 //BA.debugLineNum = 92;BA.debugLine="SlideGroup.SetText(t)";
_slidegroup._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _settextcenter() throws Exception{
 //BA.debugLineNum = 423;BA.debugLine="Sub SetTextCenter As VMSlideGroup";
 //BA.debugLineNum = 424;BA.debugLine="SlideGroup.AddClass(\"text-center\")";
_slidegroup._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 425;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 442;BA.debugLine="Sub SetTextColor(varColor As String) As VMSlideGro";
 //BA.debugLineNum = 443;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 444;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 445;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 449;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 450;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 451;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 452;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 453;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 454;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setvalue(Object _varvalue) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetValue(varValue As Object) As VMSlideGroup";
 //BA.debugLineNum = 216;BA.debugLine="SlideGroup.SetValue(varValue, False)";
_slidegroup._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub SetVElse(vif As String) As VMSlideGroup";
 //BA.debugLineNum = 360;BA.debugLine="SlideGroup.SetVElse(vif)";
_slidegroup._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 382;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 383;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 384;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 385;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 386;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub SetVhtml(vhtml As String) As VMSlideGroup";
 //BA.debugLineNum = 370;BA.debugLine="SlideGroup.SetVHtml(vhtml)";
_slidegroup._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetVIf(vif As String) As VMSlideGroup";
 //BA.debugLineNum = 69;BA.debugLine="SlideGroup.SetVIf(vif)";
_slidegroup._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="Sub SetVisible(b As Boolean) As VMSlideGroup";
 //BA.debugLineNum = 437;BA.debugLine="SlideGroup.SetVisible(b)";
_slidegroup._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 438;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetVModel(k As String) As VMSlideGroup";
 //BA.debugLineNum = 64;BA.debugLine="SlideGroup.SetVModel(k)";
_slidegroup._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetVShow(vif As String) As VMSlideGroup";
 //BA.debugLineNum = 74;BA.debugLine="SlideGroup.SetVShow(vif)";
_slidegroup._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub SetVText(vhtml As String) As VMSlideGroup";
 //BA.debugLineNum = 365;BA.debugLine="SlideGroup.SetVText(vhtml)";
_slidegroup._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslidegroup  _show() throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub Show As VMSlideGroup";
 //BA.debugLineNum = 253;BA.debugLine="SlideGroup.SetVisible(True)";
_slidegroup._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 53;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 54;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 55;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 56;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 57;BA.debugLine="Log($\"VMSlideGroup.${eName} event has not been";
__c.Log(("VMSlideGroup."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 60;BA.debugLine="Return SlideGroup.ToString";
if (true) return _slidegroup._tostring /*String*/ ();
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslidegroup  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 284;BA.debugLine="Sub UseTheme(themeName As String) As VMSlideGroup";
 //BA.debugLineNum = 285;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 286;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 287;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 288;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 289;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslidegroup)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
