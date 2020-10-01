package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _template = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _hascontent = false;
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
public b4j.example.vmtemplate  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 187;BA.debugLine="Sub AddChild(child As VMElement) As VMTemplate";
 //BA.debugLineNum = 188;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 189;BA.debugLine="Template.SetText(childHTML)";
_template._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 190;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 225;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 226;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 227;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtemplate  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub AddClass(c As String) As VMTemplate";
 //BA.debugLineNum = 208;BA.debugLine="Template.AddClass(c)";
_template._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _addcomponent(String _scomp) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub AddComponent(scomp As String) As VMTemplate";
 //BA.debugLineNum = 73;BA.debugLine="SetText(scomp)";
_settext(_scomp);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 255;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 256;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 306;BA.debugLine="Template.BuildModel(mprops, mstyles, lclasses, lo";
_template._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Template As VMElement";
_template = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 10;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtemplate  _disable() throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub Disable As VMTemplate";
 //BA.debugLineNum = 248;BA.debugLine="Template.Disable(True)";
_template._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _enable() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub Enable As VMTemplate";
 //BA.debugLineNum = 243;BA.debugLine="Template.Enable(True)";
_template._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _hide() throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub Hide As VMTemplate";
 //BA.debugLineNum = 233;BA.debugLine="Template.SetVisible(False)";
_template._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="Template.Initialize(v, ID)";
_template._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="Template.SetTag(\"template\")";
_template._settag /*b4j.example.vmelement*/ ("template");
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="HasContent = False";
_hascontent = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 203;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtemplate  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="public Sub RemoveAttr(sName As String) As VMTempla";
 //BA.debugLineNum = 262;BA.debugLine="Template.RemoveAttr(sName)";
_template._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub Render";
 //BA.debugLineNum = 183;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtemplate  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub SetAttr(attr As Map) As VMTemplate";
 //BA.debugLineNum = 214;BA.debugLine="Template.SetAttr(attr)";
_template._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 65;BA.debugLine="Sub SetAttributes(attrs As List) As VMTemplate";
 //BA.debugLineNum = 66;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 67;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetAttrLoose(loose As String) As VMTemplate";
 //BA.debugLineNum = 126;BA.debugLine="Template.SetAttrLoose(loose)";
_template._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 301;BA.debugLine="Template.SetAttrSingle(prop, value)";
_template._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 148;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 149;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtemplate)(this);};
 //BA.debugLineNum = 150;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 151;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 152;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 };
 //BA.debugLineNum = 155;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 156;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 157;BA.debugLine="Template.Bind(\":color\", pp)";
_template._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 34;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMTemplate";
 //BA.debugLineNum = 278;BA.debugLine="Template.SetDesignMode(b)";
_template._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 279;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 280;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 48;BA.debugLine="Template.SetDeviceOffsets(OS, OM, OL, OX)";
_template._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 60;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 61;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 54;BA.debugLine="Template.SetDeviceSizes(SS, SM, SL, SX)";
_template._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub SetMarginAll(p As String) As VMTemplate";
 //BA.debugLineNum = 273;BA.debugLine="Template.setmarginall(p)";
_template._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 290;BA.debugLine="Template.SetName(varName, bbind)";
_template._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub SetPaddingAll(p As String) As VMTemplate";
 //BA.debugLineNum = 268;BA.debugLine="Template.SetPaddingAll(p)";
_template._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMTem";
 //BA.debugLineNum = 42;BA.debugLine="Template.SetRC(sRow, sCol)";
_template._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setslotactions() throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetSlotActions As VMTemplate";
 //BA.debugLineNum = 110;BA.debugLine="SetAttrLoose(\"v-slot:actions\")";
_setattrloose("v-slot:actions");
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setslotactivator() throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetSlotActivator As VMTemplate";
 //BA.debugLineNum = 115;BA.debugLine="Template.SetAttrLoose(\"v-slot:activator\")";
_template._setattrloose /*b4j.example.vmelement*/ ("v-slot:activator");
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setslotactivator1(String _act) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetSlotActivator1(act As String) As VMTemplate";
 //BA.debugLineNum = 120;BA.debugLine="SetAttrSingle(\"v-slot:activator\", $\"{ ${act} }\"$)";
_setattrsingle("v-slot:activator",("{ "+__c.SmartStringFormatter("",(Object)(_act))+" }"));
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setslotactivatoron() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetSlotActivatorOn As VMTemplate";
 //BA.debugLineNum = 131;BA.debugLine="SetAttrSingle(\"v-slot:activator\", \"{ on }\")";
_setattrsingle("v-slot:activator","{ on }");
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setslotappend() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetSlotAppend As VMTemplate";
 //BA.debugLineNum = 84;BA.debugLine="Template.SetAttrLoose(\"v-slot:append\")";
_template._setattrloose /*b4j.example.vmelement*/ ("v-slot:append");
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setslotextension() throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetSlotExtension As VMTemplate";
 //BA.debugLineNum = 105;BA.debugLine="Template.SetAttrLoose(\"v-slot:extension\")";
_template._setattrloose /*b4j.example.vmelement*/ ("v-slot:extension");
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setsloticon() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetSlotIcon As VMTemplate";
 //BA.debugLineNum = 94;BA.debugLine="Template.SetAttrLoose(\"v-slot:icon\")";
_template._setattrloose /*b4j.example.vmelement*/ ("v-slot:icon");
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setslotopposite() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetSlotOpposite As VMTemplate";
 //BA.debugLineNum = 99;BA.debugLine="Template.SetAttrLoose(\"v-slot:opposite\")";
_template._setattrloose /*b4j.example.vmelement*/ ("v-slot:opposite");
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setslotprepend(String _pvalue) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetSlotPrepend(pValue As String) As VMTemplate";
 //BA.debugLineNum = 79;BA.debugLine="SetAttrSingle(\"v-slot:prepend\", pValue)";
_setattrsingle("v-slot:prepend",_pvalue);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setslotprogress() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetSlotProgress As VMTemplate";
 //BA.debugLineNum = 89;BA.debugLine="Template.SetAttrLoose(\"v-slot:progress\")";
_template._setattrloose /*b4j.example.vmelement*/ ("v-slot:progress");
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetStatic(b As Boolean) As VMTemplate";
 //BA.debugLineNum = 28;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 29;BA.debugLine="Template.SetStatic(b)";
_template._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub SetStyle(sm As Map) As VMTemplate";
 //BA.debugLineNum = 220;BA.debugLine="Template.SetStyle(sm)";
_template._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 296;BA.debugLine="Template.SetStyleSingle(prop, value)";
_template._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetTabIndex(ti As String) As VMTemplate";
 //BA.debugLineNum = 284;BA.debugLine="Template.SetTabIndex(ti)";
_template._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _settext(String _t) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetText(t As String) As VMTemplate";
 //BA.debugLineNum = 196;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 197;BA.debugLine="Template.SetText(t)";
_template._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 316;BA.debugLine="Sub SetTextColor(varColor As String) As VMTemplate";
 //BA.debugLineNum = 317;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 318;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 323;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 324;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmtemplate)(this);};
 //BA.debugLineNum = 325;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 326;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 327;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 328;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub SetVIf(vif As String) As VMTemplate";
 //BA.debugLineNum = 172;BA.debugLine="Template.SetVIf(vif)";
_template._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub SetVisible(b As Boolean) As VMTemplate";
 //BA.debugLineNum = 311;BA.debugLine="Template.SetVisible(b)";
_template._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub SetVModel(k As String) As VMTemplate";
 //BA.debugLineNum = 167;BA.debugLine="Template.SetVModel(k)";
_template._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub SetVShow(vif As String) As VMTemplate";
 //BA.debugLineNum = 177;BA.debugLine="Template.SetVShow(vif)";
_template._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtemplate  _show() throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub Show As VMTemplate";
 //BA.debugLineNum = 238;BA.debugLine="Template.SetVisible(True)";
_template._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 163;BA.debugLine="Return Template.ToString";
if (true) return _template._tostring /*String*/ ();
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtemplate  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 136;BA.debugLine="Sub UseTheme(themeName As String) As VMTemplate";
 //BA.debugLineNum = 137;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 138;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 139;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 140;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 141;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtemplate)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
