package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmwindow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmwindow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmwindow.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _window = null;
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
public b4j.example.vmwindow  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 118;BA.debugLine="Sub AddChild(child As VMElement) As VMWindow";
 //BA.debugLineNum = 119;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 120;BA.debugLine="Window.SetText(childHTML)";
_window._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 154;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 155;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 156;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwindow  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub AddClass(c As String) As VMWindow";
 //BA.debugLineNum = 137;BA.debugLine="Window.AddClass(c)";
_window._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub AddComponent(comp As String) As VMWindow";
 //BA.debugLineNum = 31;BA.debugLine="SetText(comp)";
_settext((Object)(_comp));
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 77;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 78;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 79;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 80;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 81;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 82;BA.debugLine="SetText(d.ToString)";
_settext((Object)(_d._tostring /*String*/ ()));
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _additem(b4j.example.vmwindowitem _vitem) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub AddItem(vitem As VMWindowItem) As VMWindow";
 //BA.debugLineNum = 59;BA.debugLine="SetText(vitem.ToString)";
_settext((Object)(_vitem._tostring /*String*/ ()));
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 290;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 291;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 373;BA.debugLine="Window.BindStyleSingle(prop, value)";
_window._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 414;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 415;BA.debugLine="Window.BuildModel(mprops, mstyles, lclasses, loose";
_window._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 416;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Window As VMElement";
_window = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean  'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object   'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwindow  _disable() throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub Disable As VMWindow";
 //BA.debugLineNum = 283;BA.debugLine="Window.Disable(True)";
_window._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _enable() throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub Enable As VMWindow";
 //BA.debugLineNum = 277;BA.debugLine="Window.Enable(True)";
_window._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _hide() throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub Hide As VMWindow";
 //BA.debugLineNum = 265;BA.debugLine="Window.SetVisible(False)";
_window._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="Window.Initialize(v, ID)";
_window._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 15;BA.debugLine="Window.SetTag(\"v-window\")";
_window._settag /*b4j.example.vmelement*/ ("v-window");
 //BA.debugLineNum = 16;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 132;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwindow  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="public Sub RemoveAttr(sName As String) As VMWindow";
 //BA.debugLineNum = 324;BA.debugLine="Window.RemoveAttr(sName)";
_window._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub Render";
 //BA.debugLineNum = 114;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwindow  _setactiveclass(Object _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 161;BA.debugLine="Sub SetActiveClass(varActiveClass As Object) As VM";
 //BA.debugLineNum = 162;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 163;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varactiveclass);
 //BA.debugLineNum = 164;BA.debugLine="Window.Bind(\":active-class\", pp)";
_window._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub SetAttr(attr As Map) As VMWindow";
 //BA.debugLineNum = 143;BA.debugLine="Window.SetAttr(attr)";
_window._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 392;BA.debugLine="Sub SetAttributes(attrs As List) As VMWindow";
 //BA.debugLineNum = 393;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 394;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetAttrLoose(loose As String) As VMWindow";
 //BA.debugLineNum = 297;BA.debugLine="Window.SetAttrLoose(loose)";
_window._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 367;BA.debugLine="Window.SetAttrSingle(prop, value)";
_window._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 314;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 315;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 316;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 317;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 318;BA.debugLine="Window.Bind(\":color\", pp)";
_window._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setcontinuos(Object _varcontinuos) throws Exception{
String _pp = "";
 //BA.debugLineNum = 169;BA.debugLine="Sub SetContinuos(varContinuos As Object) As VMWind";
 //BA.debugLineNum = 170;BA.debugLine="Dim pp As String = $\"${ID}Continuos\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Continuos");
 //BA.debugLineNum = 171;BA.debugLine="vue.SetStateSingle(pp, varContinuos)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcontinuos);
 //BA.debugLineNum = 172;BA.debugLine="Window.Bind(\":continuos\", pp)";
_window._bind /*b4j.example.vmelement*/ (":continuos",_pp);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setdark(Object _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 177;BA.debugLine="Sub SetDark(varDark As Object) As VMWindow";
 //BA.debugLineNum = 178;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 179;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardark);
 //BA.debugLineNum = 180;BA.debugLine="Window.Bind(\":dark\", pp)";
_window._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 42;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMWindow";
 //BA.debugLineNum = 342;BA.debugLine="Window.SetDesignMode(b)";
_window._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 343;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 37;BA.debugLine="Window.SetDeviceOffsets(OS, OM, OL, OX)";
_window._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 72;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 73;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 66;BA.debugLine="Window.SetDeviceSizes(SS, SM, SL, SX)";
_window._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 408;BA.debugLine="Sub SetKey(k As String) As VMWindow";
 //BA.debugLineNum = 409;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 410;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 411;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setlight(Object _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 185;BA.debugLine="Sub SetLight(varLight As Object) As VMWindow";
 //BA.debugLineNum = 186;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 187;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlight);
 //BA.debugLineNum = 188;BA.debugLine="Window.Bind(\":light\", pp)";
_window._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub SetMarginAll(p As String) As VMWindow";
 //BA.debugLineNum = 336;BA.debugLine="Window.setmarginall(p)";
_window._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 355;BA.debugLine="Window.SetName(varName, bbind)";
_window._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setnexticon(Object _varnexticon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 193;BA.debugLine="Sub SetNextIcon(varNextIcon As Object) As VMWindow";
 //BA.debugLineNum = 194;BA.debugLine="Dim pp As String = $\"${ID}NextIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NextIcon");
 //BA.debugLineNum = 195;BA.debugLine="vue.SetStateSingle(pp, varNextIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varnexticon);
 //BA.debugLineNum = 196;BA.debugLine="Window.Bind(\":next-icon\", pp)";
_window._bind /*b4j.example.vmelement*/ (":next-icon",_pp);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setonchange(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 46;BA.debugLine="Sub SetOnChange(eventHandler As Object,methodName";
 //BA.debugLineNum = 47;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 48;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmwindow)(this);};
 //BA.debugLineNum = 49;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 50;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 51;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 53;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub SetPaddingAll(p As String) As VMWindow";
 //BA.debugLineNum = 330;BA.debugLine="Window.SetPaddingAll(p)";
_window._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setprevicon(Object _varprevicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 201;BA.debugLine="Sub SetPrevIcon(varPrevIcon As Object) As VMWindow";
 //BA.debugLineNum = 202;BA.debugLine="Dim pp As String = $\"${ID}PrevIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrevIcon");
 //BA.debugLineNum = 203;BA.debugLine="vue.SetStateSingle(pp, varPrevIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varprevicon);
 //BA.debugLineNum = 204;BA.debugLine="Window.Bind(\":prev-icon\", pp)";
_window._bind /*b4j.example.vmelement*/ (":prev-icon",_pp);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMWin";
 //BA.debugLineNum = 25;BA.debugLine="Window.SetRC(sRow, sCol)";
_window._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setreverse(Object _varreverse) throws Exception{
String _pp = "";
 //BA.debugLineNum = 209;BA.debugLine="Sub SetReverse(varReverse As Object) As VMWindow";
 //BA.debugLineNum = 210;BA.debugLine="Dim pp As String = $\"${ID}Reverse\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Reverse");
 //BA.debugLineNum = 211;BA.debugLine="vue.SetStateSingle(pp, varReverse)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varreverse);
 //BA.debugLineNum = 212;BA.debugLine="Window.Bind(\":reverse\", pp)";
_window._bind /*b4j.example.vmelement*/ (":reverse",_pp);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setshowarrows(Object _varshowarrows) throws Exception{
String _pp = "";
 //BA.debugLineNum = 217;BA.debugLine="Sub SetShowArrows(varShowArrows As Object) As VMWi";
 //BA.debugLineNum = 218;BA.debugLine="Dim pp As String = $\"${ID}ShowArrows\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowArrows");
 //BA.debugLineNum = 219;BA.debugLine="vue.SetStateSingle(pp, varShowArrows)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varshowarrows);
 //BA.debugLineNum = 220;BA.debugLine="Window.Bind(\":show-arrows\", pp)";
_window._bind /*b4j.example.vmelement*/ (":show-arrows",_pp);
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setshowarrowsonhover(Object _varshowarrowsonhover) throws Exception{
String _pp = "";
 //BA.debugLineNum = 225;BA.debugLine="Sub SetShowArrowsOnHover(varShowArrowsOnHover As O";
 //BA.debugLineNum = 226;BA.debugLine="Dim pp As String = $\"${ID}ShowArrowsOnHover\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowArrowsOnHover");
 //BA.debugLineNum = 227;BA.debugLine="vue.SetStateSingle(pp, varShowArrowsOnHover)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varshowarrowsonhover);
 //BA.debugLineNum = 228;BA.debugLine="Window.Bind(\":show-arrows-on-hover\", pp)";
_window._bind /*b4j.example.vmelement*/ (":show-arrows-on-hover",_pp);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetStyle(sm As Map) As VMWindow";
 //BA.debugLineNum = 149;BA.debugLine="Window.SetStyle(sm)";
_window._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 361;BA.debugLine="Window.SetStyleSingle(prop, value)";
_window._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetTabIndex(ti As String) As VMWindow";
 //BA.debugLineNum = 349;BA.debugLine="Window.SetTabIndex(ti)";
_window._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetText(t As Object) As VMWindow";
 //BA.debugLineNum = 126;BA.debugLine="Window.SetText(t)";
_window._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 424;BA.debugLine="Sub SetTextColor(varColor As String) As VMWindow";
 //BA.debugLineNum = 425;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 426;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 427;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 431;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 432;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 433;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 434;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 435;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 436;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _settouch(Object _vartouch) throws Exception{
String _pp = "";
 //BA.debugLineNum = 233;BA.debugLine="Sub SetTouch(varTouch As Object) As VMWindow";
 //BA.debugLineNum = 234;BA.debugLine="Dim pp As String = $\"${ID}Touch\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Touch");
 //BA.debugLineNum = 235;BA.debugLine="vue.SetStateSingle(pp, varTouch)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartouch);
 //BA.debugLineNum = 236;BA.debugLine="Window.Bind(\":touch\", pp)";
_window._bind /*b4j.example.vmelement*/ (":touch",_pp);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _settouchless(Object _vartouchless) throws Exception{
String _pp = "";
 //BA.debugLineNum = 241;BA.debugLine="Sub SetTouchless(varTouchless As Object) As VMWind";
 //BA.debugLineNum = 242;BA.debugLine="Dim pp As String = $\"${ID}Touchless\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Touchless");
 //BA.debugLineNum = 243;BA.debugLine="vue.SetStateSingle(pp, varTouchless)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartouchless);
 //BA.debugLineNum = 244;BA.debugLine="Window.Bind(\":touchless\", pp)";
_window._bind /*b4j.example.vmelement*/ (":touchless",_pp);
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setvalue(Object _varvalue) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetValue(varValue As Object) As VMWindow";
 //BA.debugLineNum = 250;BA.debugLine="Window.SetValue(varValue, False)";
_window._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Sub SetVElse(vif As String) As VMWindow";
 //BA.debugLineNum = 378;BA.debugLine="Window.SetVElse(vif)";
_window._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setvertical(Object _varvertical) throws Exception{
String _pp = "";
 //BA.debugLineNum = 255;BA.debugLine="Sub SetVertical(varVertical As Object) As VMWindow";
 //BA.debugLineNum = 256;BA.debugLine="Dim pp As String = $\"${ID}Vertical\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Vertical");
 //BA.debugLineNum = 257;BA.debugLine="vue.SetStateSingle(pp, varVertical)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varvertical);
 //BA.debugLineNum = 258;BA.debugLine="Window.Bind(\":vertical\", pp)";
_window._bind /*b4j.example.vmelement*/ (":vertical",_pp);
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 400;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 401;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 402;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 403;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 404;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Sub SetVhtml(vhtml As String) As VMWindow";
 //BA.debugLineNum = 388;BA.debugLine="Window.SetVHtml(vhtml)";
_window._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetVIf(vif As String) As VMWindow";
 //BA.debugLineNum = 103;BA.debugLine="Window.SetVIf(vif)";
_window._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 418;BA.debugLine="Sub SetVisible(b As Boolean) As VMWindow";
 //BA.debugLineNum = 419;BA.debugLine="Window.SetVisible(b)";
_window._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 420;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetVModel(k As String) As VMWindow";
 //BA.debugLineNum = 98;BA.debugLine="Window.SetVModel(k)";
_window._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetVShow(vif As String) As VMWindow";
 //BA.debugLineNum = 108;BA.debugLine="Window.SetVShow(vif)";
_window._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub SetVText(vhtml As String) As VMWindow";
 //BA.debugLineNum = 383;BA.debugLine="Window.SetVText(vhtml)";
_window._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindow  _show() throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub Show As VMWindow";
 //BA.debugLineNum = 271;BA.debugLine="Window.SetVisible(True)";
_window._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 87;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 88;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 89;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 90;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 91;BA.debugLine="Log($\"VMWindow.${eName} event has not been defi";
__c.Log(("VMWindow."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 94;BA.debugLine="Return Window.ToString";
if (true) return _window._tostring /*String*/ ();
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwindow  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 302;BA.debugLine="Sub UseTheme(themeName As String) As VMWindow";
 //BA.debugLineNum = 303;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 304;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 305;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 306;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 307;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindow)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
