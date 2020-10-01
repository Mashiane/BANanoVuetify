package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmhover extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmhover", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmhover.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _hover = null;
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
public b4j.example.vmhover  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 63;BA.debugLine="Sub AddChild(child As VMElement) As VMHover";
 //BA.debugLineNum = 64;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 65;BA.debugLine="Hover.SetText(childHTML)";
_hover._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 93;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 94;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 95;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmhover  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub AddClass(c As String) As VMHover";
 //BA.debugLineNum = 76;BA.debugLine="Hover.AddClass(c)";
_hover._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub AddComponent(comp As String) As VMHover";
 //BA.debugLineNum = 325;BA.debugLine="Hover.SetText(comp)";
_hover._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 335;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 336;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmhover  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 181;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 182;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 256;BA.debugLine="Hover.BindStyleSingle(prop, value)";
_hover._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 341;BA.debugLine="Hover.BuildModel(mprops, mstyles, lclasses, loose";
_hover._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Hover As VMElement";
_hover = new b4j.example.vmelement();
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
public b4j.example.vmhover  _disable() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub Disable As VMHover";
 //BA.debugLineNum = 174;BA.debugLine="Hover.Disable(True)";
_hover._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _enable() throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub Enable As VMHover";
 //BA.debugLineNum = 168;BA.debugLine="Hover.Enable(True)";
_hover._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _hide() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub Hide As VMHover";
 //BA.debugLineNum = 156;BA.debugLine="Hover.SetVisible(False)";
_hover._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="Hover.Initialize(v, ID)";
_hover._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="Hover.SetTag(\"v-hover\")";
_hover._settag /*b4j.example.vmelement*/ ("v-hover");
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Hover.SetAttrSingle(\"v-slot:default\", \"{ hover }\"";
_hover._setattrsingle /*b4j.example.vmelement*/ ("v-slot:default","{ hover }");
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 71;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmhover  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="public Sub RemoveAttr(sName As String) As VMHover";
 //BA.debugLineNum = 206;BA.debugLine="Hover.RemoveAttr(sName)";
_hover._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub Render";
 //BA.debugLineNum = 59;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmhover  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetAttr(attr As Map) As VMHover";
 //BA.debugLineNum = 82;BA.debugLine="Hover.SetAttr(attr)";
_hover._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 275;BA.debugLine="Sub SetAttributes(attrs As List) As VMHover";
 //BA.debugLineNum = 276;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 277;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetAttrLoose(loose As String) As VMHover";
 //BA.debugLineNum = 188;BA.debugLine="Hover.SetAttrLoose(loose)";
_hover._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 250;BA.debugLine="Hover.SetAttrSingle(prop, value)";
_hover._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setclosedelay(String _varclosedelay) throws Exception{
String _pp = "";
 //BA.debugLineNum = 100;BA.debugLine="Sub SetCloseDelay(varCloseDelay As String) As VMHo";
 //BA.debugLineNum = 101;BA.debugLine="If varCloseDelay = \"\" Then Return Me";
if ((_varclosedelay).equals("")) { 
if (true) return (b4j.example.vmhover)(this);};
 //BA.debugLineNum = 102;BA.debugLine="If varCloseDelay = \"0\" Then Return Me";
if ((_varclosedelay).equals("0")) { 
if (true) return (b4j.example.vmhover)(this);};
 //BA.debugLineNum = 103;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 104;BA.debugLine="SetAttrSingle(\"close-delay\", varCloseDelay)";
_setattrsingle("close-delay",_varclosedelay);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 };
 //BA.debugLineNum = 107;BA.debugLine="Dim pp As String = $\"${ID}CloseDelay\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"CloseDelay");
 //BA.debugLineNum = 108;BA.debugLine="vue.SetStateSingle(pp, varCloseDelay)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varclosedelay));
 //BA.debugLineNum = 109;BA.debugLine="Hover.Bind(\":close-delay\", pp)";
_hover._bind /*b4j.example.vmelement*/ (":close-delay",_pp);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 31;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMHover";
 //BA.debugLineNum = 224;BA.debugLine="Hover.SetDesignMode(b)";
_hover._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 225;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 305;BA.debugLine="Hover.SetDeviceOffsets(OS, OM, OL, OX)";
_hover._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 312;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 313;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 319;BA.debugLine="Hover.SetDeviceSizes(SS, SM, SL, SX)";
_hover._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 320;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setdisabled(boolean _vardisabled) throws Exception{
String _pp = "";
 //BA.debugLineNum = 128;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMHover";
 //BA.debugLineNum = 129;BA.debugLine="If varDisabled = False Then Return Me";
if (_vardisabled==__c.False) { 
if (true) return (b4j.example.vmhover)(this);};
 //BA.debugLineNum = 130;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 131;BA.debugLine="SetAttrSingle(\"disabled\", varDisabled)";
_setattrsingle("disabled",BA.ObjectToString(_vardisabled));
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 };
 //BA.debugLineNum = 134;BA.debugLine="Dim pp As String = $\"${ID}Disabled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Disabled");
 //BA.debugLineNum = 135;BA.debugLine="vue.SetStateSingle(pp, varDisabled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisabled));
 //BA.debugLineNum = 136;BA.debugLine="Hover.Bind(\":disabled\", pp)";
_hover._bind /*b4j.example.vmelement*/ (":disabled",_pp);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetKey(k As String) As VMHover";
 //BA.debugLineNum = 292;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 293;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetMarginAll(p As String) As VMHover";
 //BA.debugLineNum = 218;BA.debugLine="Hover.setmarginall(p)";
_hover._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 238;BA.debugLine="Hover.SetName(varName, bbind)";
_hover._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setopendelay(String _varopendelay) throws Exception{
String _pp = "";
 //BA.debugLineNum = 114;BA.debugLine="Sub SetOpenDelay(varOpenDelay As String) As VMHove";
 //BA.debugLineNum = 115;BA.debugLine="If varOpenDelay = \"\" Then Return Me";
if ((_varopendelay).equals("")) { 
if (true) return (b4j.example.vmhover)(this);};
 //BA.debugLineNum = 116;BA.debugLine="If varOpenDelay = \"0\" Then Return Me";
if ((_varopendelay).equals("0")) { 
if (true) return (b4j.example.vmhover)(this);};
 //BA.debugLineNum = 117;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 118;BA.debugLine="SetAttrSingle(\"open-delay\", varOpenDelay)";
_setattrsingle("open-delay",_varopendelay);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 };
 //BA.debugLineNum = 121;BA.debugLine="Dim pp As String = $\"${ID}OpenDelay\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OpenDelay");
 //BA.debugLineNum = 122;BA.debugLine="vue.SetStateSingle(pp, varOpenDelay)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varopendelay));
 //BA.debugLineNum = 123;BA.debugLine="Hover.Bind(\":open-delay\", pp)";
_hover._bind /*b4j.example.vmelement*/ (":open-delay",_pp);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetPaddingAll(p As String) As VMHover";
 //BA.debugLineNum = 212;BA.debugLine="Hover.SetPaddingAll(p)";
_hover._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 298;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMHov";
 //BA.debugLineNum = 299;BA.debugLine="Hover.SetRC(sRow, sCol)";
_hover._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetStatic(b As Boolean) As VMHover";
 //BA.debugLineNum = 231;BA.debugLine="Hover.SetStatic(b)";
_hover._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 232;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetStyle(sm As Map) As VMHover";
 //BA.debugLineNum = 88;BA.debugLine="Hover.SetStyle(sm)";
_hover._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 244;BA.debugLine="Hover.SetStyleSingle(prop, value)";
_hover._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public String  _settext(String _child) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetText(child As String)";
 //BA.debugLineNum = 27;BA.debugLine="Hover.SetText(child)";
_hover._settext /*b4j.example.vmelement*/ (_child);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmhover  _settextcenter() throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub SetTextCenter As VMHover";
 //BA.debugLineNum = 331;BA.debugLine="Hover.AddClass(\"text-center\")";
_hover._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setvalue(boolean _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 141;BA.debugLine="Sub SetValue(varValue As Boolean) As VMHover";
 //BA.debugLineNum = 142;BA.debugLine="If varValue = False Then Return Me";
if (_varvalue==__c.False) { 
if (true) return (b4j.example.vmhover)(this);};
 //BA.debugLineNum = 143;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 144;BA.debugLine="SetAttrSingle(\"value\", varValue)";
_setattrsingle("value",BA.ObjectToString(_varvalue));
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 };
 //BA.debugLineNum = 147;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 148;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 149;BA.debugLine="Hover.Bind(\":value\", pp)";
_hover._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Sub SetVElse(vif As String) As VMHover";
 //BA.debugLineNum = 261;BA.debugLine="Hover.SetVElse(vif)";
_hover._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 283;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 284;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 285;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 286;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 287;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetVhtml(vhtml As String) As VMHover";
 //BA.debugLineNum = 271;BA.debugLine="Hover.SetVHtml(vhtml)";
_hover._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetVIf(vif As String) As VMHover";
 //BA.debugLineNum = 48;BA.debugLine="Hover.SetVIf(vif)";
_hover._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetVisible(b As Boolean) As VMHover";
 //BA.debugLineNum = 347;BA.debugLine="Hover.SetVisible(b)";
_hover._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetVModel(k As String) As VMHover";
 //BA.debugLineNum = 43;BA.debugLine="Hover.SetVModel(k)";
_hover._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetVShow(vif As String) As VMHover";
 //BA.debugLineNum = 53;BA.debugLine="Hover.SetVShow(vif)";
_hover._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetVText(vhtml As String) As VMHover";
 //BA.debugLineNum = 266;BA.debugLine="Hover.SetVText(vhtml)";
_hover._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmhover  _show() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub Show As VMHover";
 //BA.debugLineNum = 162;BA.debugLine="Hover.SetVisible(True)";
_hover._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 39;BA.debugLine="Return Hover.ToString";
if (true) return _hover._tostring /*String*/ ();
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmhover  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 193;BA.debugLine="Sub UseTheme(themeName As String) As VMHover";
 //BA.debugLineNum = 194;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 195;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 196;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 197;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 198;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmhover)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
