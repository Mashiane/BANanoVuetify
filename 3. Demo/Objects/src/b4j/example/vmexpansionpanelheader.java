package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmexpansionpanelheader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmexpansionpanelheader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmexpansionpanelheader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _expansionpanelheader = null;
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
public b4j.example.vmexpansionpanelheader  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 62;BA.debugLine="Sub AddChild(child As VMElement) As VMExpansionPan";
 //BA.debugLineNum = 63;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 64;BA.debugLine="ExpansionPanelHeader.SetText(childHTML)";
_expansionpanelheader._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 98;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 99;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 100;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanelheader  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub AddClass(c As String) As VMExpansionPanelHeade";
 //BA.debugLineNum = 81;BA.debugLine="ExpansionPanelHeader.AddClass(c)";
_expansionpanelheader._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 370;BA.debugLine="Sub AddComponent(comp As String) As VMExpansionPan";
 //BA.debugLineNum = 371;BA.debugLine="ExpansionPanelHeader.SetText(comp)";
_expansionpanelheader._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 382;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanelheader  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 228;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 229;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 302;BA.debugLine="ExpansionPanelHeader.BindStyleSingle(prop, value)";
_expansionpanelheader._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 386;BA.debugLine="ExpansionPanelHeader.BuildModel(mprops, mstyles, l";
_expansionpanelheader._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ExpansionPanelHeader As VMElement";
_expansionpanelheader = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean  'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanelheader  _disable() throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub Disable As VMExpansionPanelHeader";
 //BA.debugLineNum = 221;BA.debugLine="ExpansionPanelHeader.Disable(True)";
_expansionpanelheader._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _enable() throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub Enable As VMExpansionPanelHeader";
 //BA.debugLineNum = 215;BA.debugLine="ExpansionPanelHeader.Enable(True)";
_expansionpanelheader._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _hide() throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub Hide As VMExpansionPanelHeader";
 //BA.debugLineNum = 203;BA.debugLine="ExpansionPanelHeader.SetVisible(False)";
_expansionpanelheader._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="ExpansionPanelHeader.Initialize(v, ID)";
_expansionpanelheader._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="ExpansionPanelHeader.SetTag(\"v-expansion-panel-he";
_expansionpanelheader._settag /*b4j.example.vmelement*/ ("v-expansion-panel-header");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 76;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanelheader  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="public Sub RemoveAttr(sName As String) As VMExpans";
 //BA.debugLineNum = 253;BA.debugLine="ExpansionPanelHeader.RemoveAttr(sName)";
_expansionpanelheader._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Render";
 //BA.debugLineNum = 58;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanelheader  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetAttr(attr As Map) As VMExpansionPanelHeader";
 //BA.debugLineNum = 87;BA.debugLine="ExpansionPanelHeader.SetAttr(attr)";
_expansionpanelheader._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 321;BA.debugLine="Sub SetAttributes(attrs As List) As VMExpansionPan";
 //BA.debugLineNum = 322;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 323;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Sub SetAttrLoose(loose As String) As VMExpansionPa";
 //BA.debugLineNum = 235;BA.debugLine="ExpansionPanelHeader.SetAttrLoose(loose)";
_expansionpanelheader._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 236;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 296;BA.debugLine="ExpansionPanelHeader.SetAttrSingle(prop, value)";
_expansionpanelheader._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 105;BA.debugLine="Sub SetColor(varColor As String) As VMExpansionPan";
 //BA.debugLineNum = 106;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmexpansionpanelheader)(this);};
 //BA.debugLineNum = 107;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 108;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 };
 //BA.debugLineNum = 111;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 112;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 113;BA.debugLine="ExpansionPanelHeader.Bind(\":color\", pp)";
_expansionpanelheader._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 118;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 119;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 120;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 121;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmexpansionpanelheader)(this);};
 //BA.debugLineNum = 122;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 123;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 };
 //BA.debugLineNum = 126;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 127;BA.debugLine="ExpansionPanelHeader.Bind(\":color\", pp)";
_expansionpanelheader._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 31;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMExpansionPane";
 //BA.debugLineNum = 271;BA.debugLine="ExpansionPanelHeader.SetDesignMode(b)";
_expansionpanelheader._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 272;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 351;BA.debugLine="ExpansionPanelHeader.SetDeviceOffsets(OS, OM, OL,";
_expansionpanelheader._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 352;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 358;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 359;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 365;BA.debugLine="ExpansionPanelHeader.SetDeviceSizes(SS, SM, SL, S";
_expansionpanelheader._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setdisablediconrotate(boolean _vardisablediconrotate) throws Exception{
String _pp = "";
 //BA.debugLineNum = 132;BA.debugLine="Sub SetDisabledIconRotate(varDisabledIconRotate As";
 //BA.debugLineNum = 133;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 134;BA.debugLine="SetAttrSingle(\"color\", varDisabledIconRotate)";
_setattrsingle("color",BA.ObjectToString(_vardisablediconrotate));
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 };
 //BA.debugLineNum = 137;BA.debugLine="Dim pp As String = $\"${ID}DisabledIconRotate\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"DisabledIconRotate");
 //BA.debugLineNum = 138;BA.debugLine="vue.SetStateSingle(pp, varDisabledIconRotate)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisablediconrotate));
 //BA.debugLineNum = 139;BA.debugLine="ExpansionPanelHeader.Bind(\":disabled-icon-rotate\"";
_expansionpanelheader._bind /*b4j.example.vmelement*/ (":disabled-icon-rotate",_pp);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setexpandicon(String _varexpandicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 144;BA.debugLine="Sub SetExpandIcon(varExpandIcon As String) As VMEx";
 //BA.debugLineNum = 145;BA.debugLine="If varExpandIcon = \"\" Then Return Me";
if ((_varexpandicon).equals("")) { 
if (true) return (b4j.example.vmexpansionpanelheader)(this);};
 //BA.debugLineNum = 146;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 147;BA.debugLine="SetAttrSingle(\"expand-icon\", varExpandIcon)";
_setattrsingle("expand-icon",_varexpandicon);
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 };
 //BA.debugLineNum = 150;BA.debugLine="Dim pp As String = $\"${ID}ExpandIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ExpandIcon");
 //BA.debugLineNum = 151;BA.debugLine="vue.SetStateSingle(pp, varExpandIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexpandicon));
 //BA.debugLineNum = 152;BA.debugLine="ExpansionPanelHeader.Bind(\":expand-icon\", pp)";
_expansionpanelheader._bind /*b4j.example.vmelement*/ (":expand-icon",_pp);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _sethideactions(boolean _varhideactions) throws Exception{
String _pp = "";
 //BA.debugLineNum = 157;BA.debugLine="Sub SetHideActions(varHideActions As Boolean) As V";
 //BA.debugLineNum = 158;BA.debugLine="If varHideActions = False Then Return Me";
if (_varhideactions==__c.False) { 
if (true) return (b4j.example.vmexpansionpanelheader)(this);};
 //BA.debugLineNum = 159;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 160;BA.debugLine="SetAttrSingle(\"hide-actions\", varHideActions)";
_setattrsingle("hide-actions",BA.ObjectToString(_varhideactions));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 };
 //BA.debugLineNum = 163;BA.debugLine="Dim pp As String = $\"${ID}HideActions\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideActions");
 //BA.debugLineNum = 164;BA.debugLine="vue.SetStateSingle(pp, varHideActions)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhideactions));
 //BA.debugLineNum = 165;BA.debugLine="ExpansionPanelHeader.Bind(\":hide-actions\", pp)";
_expansionpanelheader._bind /*b4j.example.vmelement*/ (":hide-actions",_pp);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetKey(k As String) As VMExpansionPanelHeader";
 //BA.debugLineNum = 338;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 339;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetMarginAll(p As String) As VMExpansionPanelH";
 //BA.debugLineNum = 265;BA.debugLine="ExpansionPanelHeader.setmarginall(p)";
_expansionpanelheader._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 284;BA.debugLine="ExpansionPanelHeader.SetName(varName, bbind)";
_expansionpanelheader._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 189;BA.debugLine="Sub SetOnClick(methodName As String) As VMExpansio";
 //BA.debugLineNum = 190;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 191;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmexpansionpanelheader)(this);};
 //BA.debugLineNum = 192;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 193;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 194;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 196;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub SetPaddingAll(p As String) As VMExpansionPanel";
 //BA.debugLineNum = 259;BA.debugLine="ExpansionPanelHeader.SetPaddingAll(p)";
_expansionpanelheader._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMExp";
 //BA.debugLineNum = 345;BA.debugLine="ExpansionPanelHeader.SetRC(sRow, sCol)";
_expansionpanelheader._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setripple(boolean _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 170;BA.debugLine="Sub SetRipple(varRipple As Boolean) As VMExpansion";
 //BA.debugLineNum = 171;BA.debugLine="If varRipple = False Then Return Me";
if (_varripple==__c.False) { 
if (true) return (b4j.example.vmexpansionpanelheader)(this);};
 //BA.debugLineNum = 172;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 173;BA.debugLine="SetAttrSingle(\"ripple\", varRipple)";
_setattrsingle("ripple",BA.ObjectToString(_varripple));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 };
 //BA.debugLineNum = 176;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 177;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varripple));
 //BA.debugLineNum = 178;BA.debugLine="ExpansionPanelHeader.Bind(\":ripple\", pp)";
_expansionpanelheader._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setslotactions(boolean _b) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Sub SetSlotActions(b As Boolean) As VMExpansionPan";
 //BA.debugLineNum = 184;BA.debugLine="SetAttr(CreateMap(\"slot\": \"actions\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("actions")}));
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetStatic(b As Boolean) As VMExpansionPanelHea";
 //BA.debugLineNum = 25;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 26;BA.debugLine="ExpansionPanelHeader.SetStatic(b)";
_expansionpanelheader._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetStyle(sm As Map) As VMExpansionPanelHeader";
 //BA.debugLineNum = 93;BA.debugLine="ExpansionPanelHeader.SetStyle(sm)";
_expansionpanelheader._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 290;BA.debugLine="ExpansionPanelHeader.SetStyleSingle(prop, value)";
_expansionpanelheader._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetTabIndex(ti As String) As VMExpansionPanelH";
 //BA.debugLineNum = 278;BA.debugLine="ExpansionPanelHeader.SetTabIndex(ti)";
_expansionpanelheader._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _settext(String _t) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetText(t As String) As VMExpansionPanelHeader";
 //BA.debugLineNum = 70;BA.debugLine="ExpansionPanelHeader.SetText(t)";
_expansionpanelheader._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _settextcenter() throws Exception{
 //BA.debugLineNum = 376;BA.debugLine="Sub SetTextCenter As VMExpansionPanelHeader";
 //BA.debugLineNum = 377;BA.debugLine="ExpansionPanelHeader.AddClass(\"text-center\")";
_expansionpanelheader._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetVElse(vif As String) As VMExpansionPanelHea";
 //BA.debugLineNum = 307;BA.debugLine="ExpansionPanelHeader.SetVElse(vif)";
_expansionpanelheader._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 329;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 330;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 331;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 332;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 333;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetVhtml(vhtml As String) As VMExpansionPanelH";
 //BA.debugLineNum = 317;BA.debugLine="ExpansionPanelHeader.SetVHtml(vhtml)";
_expansionpanelheader._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetVIf(vif As String) As VMExpansionPanelHeade";
 //BA.debugLineNum = 47;BA.debugLine="ExpansionPanelHeader.SetVIf(vif)";
_expansionpanelheader._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Sub SetVisible(b As Boolean) As VMExpansionPanelHe";
 //BA.debugLineNum = 391;BA.debugLine="ExpansionPanelHeader.SetVisible(b)";
_expansionpanelheader._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetVModel(k As String) As VMExpansionPanelHead";
 //BA.debugLineNum = 42;BA.debugLine="ExpansionPanelHeader.SetVModel(k)";
_expansionpanelheader._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetVShow(vif As String) As VMExpansionPanelHea";
 //BA.debugLineNum = 52;BA.debugLine="ExpansionPanelHeader.SetVShow(vif)";
_expansionpanelheader._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetVText(vhtml As String) As VMExpansionPanelH";
 //BA.debugLineNum = 312;BA.debugLine="ExpansionPanelHeader.SetVText(vhtml)";
_expansionpanelheader._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmexpansionpanelheader  _show() throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub Show As VMExpansionPanelHeader";
 //BA.debugLineNum = 209;BA.debugLine="ExpansionPanelHeader.SetVisible(True)";
_expansionpanelheader._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 38;BA.debugLine="Return ExpansionPanelHeader.ToString";
if (true) return _expansionpanelheader._tostring /*String*/ ();
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmexpansionpanelheader  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 240;BA.debugLine="Sub UseTheme(themeName As String) As VMExpansionPa";
 //BA.debugLineNum = 241;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 242;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 243;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 244;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 245;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmexpansionpanelheader)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
