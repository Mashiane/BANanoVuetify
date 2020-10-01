package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcolorpicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcolorpicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcolorpicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _colorpicker = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public String _vmodel = "";
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
public b4j.example.vmcolorpicker  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 82;BA.debugLine="Sub AddChild(child As VMElement) As VMColorPicker";
 //BA.debugLineNum = 83;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 84;BA.debugLine="ColorPicker.SetText(childHTML)";
_colorpicker._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 118;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 119;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 120;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcolorpicker  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub AddClass(c As String) As VMColorPicker";
 //BA.debugLineNum = 101;BA.debugLine="ColorPicker.AddClass(c)";
_colorpicker._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 269;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 270;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 352;BA.debugLine="ColorPicker.BindStyleSingle(prop, value)";
_colorpicker._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 393;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 394;BA.debugLine="ColorPicker.BuildModel(mprops, mstyles, lclasses,";
_colorpicker._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 395;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ColorPicker As VMElement";
_colorpicker = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcolorpicker  _disable() throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub Disable As VMColorPicker";
 //BA.debugLineNum = 262;BA.debugLine="ColorPicker.Disable(True)";
_colorpicker._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _enable() throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub Enable As VMColorPicker";
 //BA.debugLineNum = 256;BA.debugLine="ColorPicker.Enable(True)";
_colorpicker._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _hide() throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub Hide As VMColorPicker";
 //BA.debugLineNum = 244;BA.debugLine="ColorPicker.SetVisible(False)";
_colorpicker._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="ColorPicker.Initialize(v, ID)";
_colorpicker._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="ColorPicker.SetTag(\"v-color-picker\")";
_colorpicker._settag /*b4j.example.vmelement*/ ("v-color-picker");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 96;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcolorpicker  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="public Sub RemoveAttr(sName As String) As VMColorP";
 //BA.debugLineNum = 303;BA.debugLine="ColorPicker.RemoveAttr(sName)";
_colorpicker._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub Render";
 //BA.debugLineNum = 78;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcolorpicker  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetAttr(attr As Map) As VMColorPicker";
 //BA.debugLineNum = 107;BA.debugLine="ColorPicker.SetAttr(attr)";
_colorpicker._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 371;BA.debugLine="Sub SetAttributes(attrs As List) As VMColorPicker";
 //BA.debugLineNum = 372;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 373;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub SetAttrLoose(loose As String) As VMColorPicker";
 //BA.debugLineNum = 276;BA.debugLine="ColorPicker.SetAttrLoose(loose)";
_colorpicker._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 346;BA.debugLine="ColorPicker.SetAttrSingle(prop, value)";
_colorpicker._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setcanvasheight(Object _varcanvasheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 125;BA.debugLine="Sub SetCanvasHeight(varCanvasHeight As Object) As";
 //BA.debugLineNum = 126;BA.debugLine="Dim pp As String = $\"${ID}CanvasHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CanvasHeight");
 //BA.debugLineNum = 127;BA.debugLine="vue.SetStateSingle(pp, varCanvasHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcanvasheight);
 //BA.debugLineNum = 128;BA.debugLine="ColorPicker.Bind(\":canvas-height\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":canvas-height",_pp);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 293;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 294;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 295;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 296;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 297;BA.debugLine="ColorPicker.Bind(\":color\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setdark(Object _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 133;BA.debugLine="Sub SetDark(varDark As Object) As VMColorPicker";
 //BA.debugLineNum = 134;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 135;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardark);
 //BA.debugLineNum = 136;BA.debugLine="ColorPicker.Bind(\":dark\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 31;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMColorPicker";
 //BA.debugLineNum = 321;BA.debugLine="ColorPicker.SetDesignMode(b)";
_colorpicker._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 322;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 38;BA.debugLine="ColorPicker.SetDeviceOffsets(OS, OM, OL, OX)";
_colorpicker._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 50;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 51;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 44;BA.debugLine="ColorPicker.SetDeviceSizes(SS, SM, SL, SX)";
_colorpicker._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMColor";
 //BA.debugLineNum = 142;BA.debugLine="ColorPicker.SetDisabled(varDisabled)";
_colorpicker._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setdotsize(Object _vardotsize) throws Exception{
String _pp = "";
 //BA.debugLineNum = 147;BA.debugLine="Sub SetDotSize(varDotSize As Object) As VMColorPic";
 //BA.debugLineNum = 148;BA.debugLine="Dim pp As String = $\"${ID}DotSize\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DotSize");
 //BA.debugLineNum = 149;BA.debugLine="vue.SetStateSingle(pp, varDotSize)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardotsize);
 //BA.debugLineNum = 150;BA.debugLine="ColorPicker.Bind(\":dot-size\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":dot-size",_pp);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setflat(Object _varflat) throws Exception{
String _pp = "";
 //BA.debugLineNum = 155;BA.debugLine="Sub SetFlat(varFlat As Object) As VMColorPicker";
 //BA.debugLineNum = 156;BA.debugLine="Dim pp As String = $\"${ID}Flat\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Flat");
 //BA.debugLineNum = 157;BA.debugLine="vue.SetStateSingle(pp, varFlat)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varflat);
 //BA.debugLineNum = 158;BA.debugLine="ColorPicker.Bind(\":flat\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":flat",_pp);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _sethidecanvas(Object _varhidecanvas) throws Exception{
String _pp = "";
 //BA.debugLineNum = 163;BA.debugLine="Sub SetHideCanvas(varHideCanvas As Object) As VMCo";
 //BA.debugLineNum = 164;BA.debugLine="Dim pp As String = $\"${ID}HideCanvas\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideCanvas");
 //BA.debugLineNum = 165;BA.debugLine="vue.SetStateSingle(pp, varHideCanvas)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varhidecanvas);
 //BA.debugLineNum = 166;BA.debugLine="ColorPicker.Bind(\":hide-canvas\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":hide-canvas",_pp);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _sethideinputs(Object _varhideinputs) throws Exception{
String _pp = "";
 //BA.debugLineNum = 171;BA.debugLine="Sub SetHideInputs(varHideInputs As Object) As VMCo";
 //BA.debugLineNum = 172;BA.debugLine="Dim pp As String = $\"${ID}HideInputs\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideInputs");
 //BA.debugLineNum = 173;BA.debugLine="vue.SetStateSingle(pp, varHideInputs)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varhideinputs);
 //BA.debugLineNum = 174;BA.debugLine="ColorPicker.Bind(\":hide-inputs\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":hide-inputs",_pp);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _sethidemodeswitch(Object _varhidemodeswitch) throws Exception{
String _pp = "";
 //BA.debugLineNum = 179;BA.debugLine="Sub SetHideModeSwitch(varHideModeSwitch As Object)";
 //BA.debugLineNum = 180;BA.debugLine="Dim pp As String = $\"${ID}HideModeSwitch\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideModeSwitch");
 //BA.debugLineNum = 181;BA.debugLine="vue.SetStateSingle(pp, varHideModeSwitch)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varhidemodeswitch);
 //BA.debugLineNum = 182;BA.debugLine="ColorPicker.Bind(\":hide-mode-switch\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":hide-mode-switch",_pp);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Sub SetKey(k As String) As VMColorPicker";
 //BA.debugLineNum = 388;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 389;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 390;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setlight(Object _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 187;BA.debugLine="Sub SetLight(varLight As Object) As VMColorPicker";
 //BA.debugLineNum = 188;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 189;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlight);
 //BA.debugLineNum = 190;BA.debugLine="ColorPicker.Bind(\":light\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub SetMarginAll(p As String) As VMColorPicker";
 //BA.debugLineNum = 315;BA.debugLine="ColorPicker.setmarginall(p)";
_colorpicker._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setmode(Object _varmode) throws Exception{
String _pp = "";
 //BA.debugLineNum = 195;BA.debugLine="Sub SetMode(varMode As Object) As VMColorPicker";
 //BA.debugLineNum = 196;BA.debugLine="Dim pp As String = $\"${ID}Mode\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mode");
 //BA.debugLineNum = 197;BA.debugLine="vue.SetStateSingle(pp, varMode)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmode);
 //BA.debugLineNum = 198;BA.debugLine="ColorPicker.Bind(\":mode\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":mode",_pp);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 334;BA.debugLine="ColorPicker.SetName(varName, bbind)";
_colorpicker._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetPaddingAll(p As String) As VMColorPicker";
 //BA.debugLineNum = 309;BA.debugLine="ColorPicker.SetPaddingAll(p)";
_colorpicker._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMCol";
 //BA.debugLineNum = 26;BA.debugLine="ColorPicker.SetRC(sRow, sCol)";
_colorpicker._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setshowswatches(Object _varshowswatches) throws Exception{
String _pp = "";
 //BA.debugLineNum = 203;BA.debugLine="Sub SetShowSwatches(varShowSwatches As Object) As";
 //BA.debugLineNum = 204;BA.debugLine="Dim pp As String = $\"${ID}ShowSwatches\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowSwatches");
 //BA.debugLineNum = 205;BA.debugLine="vue.SetStateSingle(pp, varShowSwatches)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varshowswatches);
 //BA.debugLineNum = 206;BA.debugLine="ColorPicker.Bind(\":show-swatches\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":show-swatches",_pp);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetStyle(sm As Map) As VMColorPicker";
 //BA.debugLineNum = 113;BA.debugLine="ColorPicker.SetStyle(sm)";
_colorpicker._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 340;BA.debugLine="ColorPicker.SetStyleSingle(prop, value)";
_colorpicker._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setswatches(Object _varswatches) throws Exception{
String _pp = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub SetSwatches(varSwatches As Object) As VMColorP";
 //BA.debugLineNum = 212;BA.debugLine="Dim pp As String = $\"${ID}Swatches\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Swatches");
 //BA.debugLineNum = 213;BA.debugLine="vue.SetStateSingle(pp, varSwatches)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varswatches);
 //BA.debugLineNum = 214;BA.debugLine="ColorPicker.Bind(\":swatches\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":swatches",_pp);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setswatchesmaxheight(Object _varswatchesmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 219;BA.debugLine="Sub SetSwatchesMaxHeight(varSwatchesMaxHeight As O";
 //BA.debugLineNum = 220;BA.debugLine="Dim pp As String = $\"${ID}SwatchesMaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SwatchesMaxHeight");
 //BA.debugLineNum = 221;BA.debugLine="vue.SetStateSingle(pp, varSwatchesMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varswatchesmaxheight);
 //BA.debugLineNum = 222;BA.debugLine="ColorPicker.Bind(\":swatches-max-height\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":swatches-max-height",_pp);
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub SetTabIndex(ti As String) As VMColorPicker";
 //BA.debugLineNum = 328;BA.debugLine="ColorPicker.SetTabIndex(ti)";
_colorpicker._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetText(t As Object) As VMColorPicker";
 //BA.debugLineNum = 90;BA.debugLine="ColorPicker.SetText(t)";
_colorpicker._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 403;BA.debugLine="Sub SetTextColor(varColor As String) As VMColorPic";
 //BA.debugLineNum = 404;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 405;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 410;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 411;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 412;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 413;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 414;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 415;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetValue(varValue As String) As VMColorPicker";
 //BA.debugLineNum = 228;BA.debugLine="ColorPicker.SetValue(varValue,False)";
_colorpicker._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 229;BA.debugLine="vue.SetData(vmodel, varValue)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(_varvalue));
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub SetVElse(vif As String) As VMColorPicker";
 //BA.debugLineNum = 357;BA.debugLine="ColorPicker.SetVElse(vif)";
_colorpicker._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 379;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 380;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 381;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 382;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 383;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub SetVhtml(vhtml As String) As VMColorPicker";
 //BA.debugLineNum = 367;BA.debugLine="ColorPicker.SetVHtml(vhtml)";
_colorpicker._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetVIf(vif As String) As VMColorPicker";
 //BA.debugLineNum = 67;BA.debugLine="ColorPicker.SetVIf(vif)";
_colorpicker._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub SetVisible(b As Boolean) As VMColorPicker";
 //BA.debugLineNum = 398;BA.debugLine="ColorPicker.SetVisible(b)";
_colorpicker._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetVModel(k As String) As VMColorPicker";
 //BA.debugLineNum = 61;BA.debugLine="ColorPicker.SetVModel(k)";
_colorpicker._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 62;BA.debugLine="vmodel = k.tolowercase";
_vmodel = _k.toLowerCase();
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetVShow(vif As String) As VMColorPicker";
 //BA.debugLineNum = 72;BA.debugLine="ColorPicker.SetVShow(vif)";
_colorpicker._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub SetVText(vhtml As String) As VMColorPicker";
 //BA.debugLineNum = 362;BA.debugLine="ColorPicker.SetVText(vhtml)";
_colorpicker._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _setwidth(Object _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 234;BA.debugLine="Sub SetWidth(varWidth As Object) As VMColorPicker";
 //BA.debugLineNum = 235;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 236;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varwidth);
 //BA.debugLineNum = 237;BA.debugLine="ColorPicker.Bind(\":width\", pp)";
_colorpicker._bind /*b4j.example.vmelement*/ (":width",_pp);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcolorpicker  _show() throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub Show As VMColorPicker";
 //BA.debugLineNum = 250;BA.debugLine="ColorPicker.SetVisible(True)";
_colorpicker._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 57;BA.debugLine="Return ColorPicker.ToString";
if (true) return _colorpicker._tostring /*String*/ ();
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcolorpicker  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 281;BA.debugLine="Sub UseTheme(themeName As String) As VMColorPicker";
 //BA.debugLineNum = 282;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 283;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 284;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 285;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 286;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcolorpicker)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
