package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmparallax extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmparallax", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmparallax.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _parallax = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmcontainer _container = null;
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
public b4j.example.vmparallax  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 102;BA.debugLine="Sub AddChild(child As VMElement) As VMParallax";
 //BA.debugLineNum = 103;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 104;BA.debugLine="Parallax.SetText(childHTML)";
_parallax._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 138;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 139;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 140;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmparallax  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub AddClass(c As String) As VMParallax";
 //BA.debugLineNum = 121;BA.debugLine="Parallax.AddClass(c)";
_parallax._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub AddComponent(comp As String) As VMParallax";
 //BA.debugLineNum = 77;BA.debugLine="Parallax.SetText(comp)";
_parallax._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 211;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 212;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 294;BA.debugLine="Parallax.BindStyleSingle(prop, value)";
_parallax._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 336;BA.debugLine="Parallax.BuildModel(mprops, mstyles, lclasses, loo";
_parallax._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Parallax As VMElement";
_parallax = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean     'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 10;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmparallax  _disable() throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub Disable As VMParallax";
 //BA.debugLineNum = 204;BA.debugLine="Parallax.Disable(True)";
_parallax._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _enable() throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub Enable As VMParallax";
 //BA.debugLineNum = 198;BA.debugLine="Parallax.Enable(True)";
_parallax._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _hide() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub Hide As VMParallax";
 //BA.debugLineNum = 186;BA.debugLine="Parallax.SetVisible(False)";
_parallax._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="Parallax.Initialize(v, ID)";
_parallax._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="Parallax.SetTag(\"v-parallax\")";
_parallax._settag /*b4j.example.vmelement*/ ("v-parallax");
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="Container.Initialize(vue, $\"${ID}par\"$, Module)";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"par"),_module);
 //BA.debugLineNum = 22;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 116;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmparallax  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="public Sub RemoveAttr(sName As String) As VMParall";
 //BA.debugLineNum = 244;BA.debugLine="Parallax.RemoveAttr(sName)";
_parallax._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub Render";
 //BA.debugLineNum = 98;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmparallax  _setalt(String _varalt) throws Exception{
String _pp = "";
 //BA.debugLineNum = 145;BA.debugLine="Sub SetAlt(varAlt As String) As VMParallax";
 //BA.debugLineNum = 146;BA.debugLine="If varAlt = \"\" Then Return Me";
if ((_varalt).equals("")) { 
if (true) return (b4j.example.vmparallax)(this);};
 //BA.debugLineNum = 147;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 148;BA.debugLine="SetAttrSingle(\"alt\", varAlt)";
_setattrsingle("alt",_varalt);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 };
 //BA.debugLineNum = 151;BA.debugLine="Dim pp As String = $\"${ID}Alt\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Alt");
 //BA.debugLineNum = 152;BA.debugLine="vue.SetStateSingle(pp, varAlt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varalt));
 //BA.debugLineNum = 153;BA.debugLine="Parallax.Bind(\":alt\", pp)";
_parallax._bind /*b4j.example.vmelement*/ (":alt",_pp);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetAttr(attr As Map) As VMParallax";
 //BA.debugLineNum = 127;BA.debugLine="Parallax.SetAttr(attr)";
_parallax._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 313;BA.debugLine="Sub SetAttributes(attrs As List) As VMParallax";
 //BA.debugLineNum = 314;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 315;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetAttrLoose(loose As String) As VMParallax";
 //BA.debugLineNum = 218;BA.debugLine="Parallax.SetAttrLoose(loose)";
_parallax._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 288;BA.debugLine="Parallax.SetAttrSingle(prop, value)";
_parallax._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 234;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 235;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 236;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 237;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 238;BA.debugLine="Parallax.Bind(\":color\", pp)";
_parallax._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 27;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMParallax";
 //BA.debugLineNum = 262;BA.debugLine="Parallax.SetDesignMode(b)";
_parallax._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 263;BA.debugLine="Container.SetDesignMode(b)";
_container._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 264;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 53;BA.debugLine="Parallax.SetDeviceOffsets(OS, OM, OL, OX)";
_parallax._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 65;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 66;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 59;BA.debugLine="Parallax.SetDeviceSizes(SS, SM, SL, SX)";
_parallax._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 158;BA.debugLine="Sub SetHeight(varHeight As String) As VMParallax";
 //BA.debugLineNum = 159;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmparallax)(this);};
 //BA.debugLineNum = 160;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 161;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 };
 //BA.debugLineNum = 164;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 165;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 166;BA.debugLine="Parallax.Bind(\":height\", pp)";
_parallax._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub SetKey(k As String) As VMParallax";
 //BA.debugLineNum = 330;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 331;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub SetMarginAll(p As String) As VMParallax";
 //BA.debugLineNum = 256;BA.debugLine="Parallax.setmarginall(p)";
_parallax._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 276;BA.debugLine="Parallax.SetName(varName, bbind)";
_parallax._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetPaddingAll(p As String) As VMParallax";
 //BA.debugLineNum = 250;BA.debugLine="Parallax.SetPaddingAll(p)";
_parallax._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMPar";
 //BA.debugLineNum = 47;BA.debugLine="Parallax.SetRC(sRow, sCol)";
_parallax._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setsrc(String _varsrc) throws Exception{
String _pp = "";
 //BA.debugLineNum = 171;BA.debugLine="Sub SetSrc(varSrc As String) As VMParallax";
 //BA.debugLineNum = 172;BA.debugLine="If varSrc = \"\" Then Return Me";
if ((_varsrc).equals("")) { 
if (true) return (b4j.example.vmparallax)(this);};
 //BA.debugLineNum = 173;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 174;BA.debugLine="SetAttrSingle(\"src\", varSrc)";
_setattrsingle("src",_varsrc);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 };
 //BA.debugLineNum = 177;BA.debugLine="Dim pp As String = $\"${ID}Src\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Src");
 //BA.debugLineNum = 178;BA.debugLine="vue.SetStateSingle(pp, varSrc)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsrc));
 //BA.debugLineNum = 179;BA.debugLine="Parallax.Bind(\":src\", pp)";
_parallax._bind /*b4j.example.vmelement*/ (":src",_pp);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetStatic(b As Boolean) As VMParallax";
 //BA.debugLineNum = 39;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 40;BA.debugLine="Parallax.SetStatic(b)";
_parallax._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 41;BA.debugLine="Container.SetStatic(b)";
_container._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetStyle(sm As Map) As VMParallax";
 //BA.debugLineNum = 133;BA.debugLine="Parallax.SetStyle(sm)";
_parallax._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 282;BA.debugLine="Parallax.SetStyleSingle(prop, value)";
_parallax._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub SetTabIndex(ti As String) As VMParallax";
 //BA.debugLineNum = 270;BA.debugLine="Parallax.SetTabIndex(ti)";
_parallax._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetText(t As Object) As VMParallax";
 //BA.debugLineNum = 110;BA.debugLine="Parallax.SetText(t)";
_parallax._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 346;BA.debugLine="Sub SetTextColor(varColor As String) As VMParallax";
 //BA.debugLineNum = 347;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 348;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 353;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 354;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 355;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 356;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 357;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetVElse(vif As String) As VMParallax";
 //BA.debugLineNum = 299;BA.debugLine="Parallax.SetVElse(vif)";
_parallax._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 321;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 322;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 323;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 324;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 325;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetVhtml(vhtml As String) As VMParallax";
 //BA.debugLineNum = 309;BA.debugLine="Parallax.SetVHtml(vhtml)";
_parallax._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetVIf(vif As String) As VMParallax";
 //BA.debugLineNum = 87;BA.debugLine="Parallax.SetVIf(vif)";
_parallax._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetVisible(b As Boolean) As VMParallax";
 //BA.debugLineNum = 341;BA.debugLine="Parallax.SetVisible(b)";
_parallax._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetVModel(k As String) As VMParallax";
 //BA.debugLineNum = 82;BA.debugLine="Parallax.SetVModel(k)";
_parallax._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setvonce(boolean _t) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetVOnce(t As Boolean) As VMParallax";
 //BA.debugLineNum = 34;BA.debugLine="Parallax.setvonce(t)";
_parallax._setvonce /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetVShow(vif As String) As VMParallax";
 //BA.debugLineNum = 92;BA.debugLine="Parallax.SetVShow(vif)";
_parallax._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub SetVText(vhtml As String) As VMParallax";
 //BA.debugLineNum = 304;BA.debugLine="Parallax.SetVText(vhtml)";
_parallax._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 305;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmparallax  _show() throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Sub Show As VMParallax";
 //BA.debugLineNum = 192;BA.debugLine="Parallax.SetVisible(True)";
_parallax._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 72;BA.debugLine="If Container.HasContent Then AddComponent(Contain";
if (_container._hascontent /*boolean*/ ) { 
_addcomponent(_container._tostring /*String*/ ());};
 //BA.debugLineNum = 73;BA.debugLine="Return Parallax.ToString";
if (true) return _parallax._tostring /*String*/ ();
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmparallax  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 223;BA.debugLine="Sub UseTheme(themeName As String) As VMParallax";
 //BA.debugLineNum = 224;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 225;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 226;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 227;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 228;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmparallax)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
