package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmsheet extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmsheet", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmsheet.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmcontainer _sheet = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public boolean _hascontent = false;
public b4j.example.vmcontainer _footer = null;
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
public b4j.example.vmsheet  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 64;BA.debugLine="Sub AddChild(child As VMElement) As VMSheet";
 //BA.debugLineNum = 65;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 66;BA.debugLine="Sheet.SetText(childHTML)";
_sheet._settext /*b4j.example.vmcontainer*/ (_childhtml);
 //BA.debugLineNum = 67;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 101;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 102;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsheet  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub AddClass(c As String) As VMSheet";
 //BA.debugLineNum = 83;BA.debugLine="Sheet.AddClass(c)";
_sheet._addclass /*b4j.example.vmcontainer*/ (_c);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Sub AddComponent(comp As String) As VMSheet";
 //BA.debugLineNum = 440;BA.debugLine="Sheet.SetText(comp)";
_sheet._settext /*b4j.example.vmcontainer*/ (_comp);
 //BA.debugLineNum = 441;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 451;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 452;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsheet  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 277;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 278;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 367;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 368;BA.debugLine="Sheet.BindStyleSingle(prop, value)";
_sheet._bindstylesingle /*b4j.example.vmcontainer*/ (_prop,_value);
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 456;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 457;BA.debugLine="Sheet.BuildModel(mprops, mstyles, lclasses, loose";
_sheet._buildmodel /*b4j.example.vmcontainer*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Sheet As VMContainer";
_sheet = new b4j.example.vmcontainer();
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
 //BA.debugLineNum = 10;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
 //BA.debugLineNum = 11;BA.debugLine="Public Footer As VMContainer";
_footer = new b4j.example.vmcontainer();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsheet  _hide() throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub Hide As VMSheet";
 //BA.debugLineNum = 265;BA.debugLine="Sheet.SetVisible(False)";
_sheet._setvisible /*b4j.example.vmcontainer*/ (__c.False);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Sheet.Initialize(v, ID, eventHandler).SetTag(\"v-s";
_sheet._initialize /*b4j.example.vmcontainer*/ (ba,_v,_id,_eventhandler)._settag /*b4j.example.vmcontainer*/ ("v-sheet");
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 23;BA.debugLine="Footer.Initialize(vue, $\"${ID}footer\"$, eventHand";
_footer._initialize /*b4j.example.vmcontainer*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"footer"),_eventhandler);
 //BA.debugLineNum = 24;BA.debugLine="Footer.SetTag(\"v-sheet-footer\")";
_footer._settag /*b4j.example.vmcontainer*/ ("v-sheet-footer");
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 73;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsheet  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSheet";
 //BA.debugLineNum = 316;BA.debugLine="Sheet.RemoveAttr(sName)";
_sheet._removeattr /*b4j.example.vmcontainer*/ (_sname);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub Render";
 //BA.debugLineNum = 60;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsheet  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetAttr(attr As Map) As VMSheet";
 //BA.debugLineNum = 89;BA.debugLine="Sheet.SetAttr(attr)";
_sheet._setattr /*b4j.example.vmcontainer*/ (_attr);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 389;BA.debugLine="Sub SetAttributes(attrs As List) As VMSheet";
 //BA.debugLineNum = 390;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 391;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSheet";
 //BA.debugLineNum = 284;BA.debugLine="Sheet.SetAttrLoose(loose)";
_sheet._setattrloose /*b4j.example.vmcontainer*/ (_loose);
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 362;BA.debugLine="Sheet.SetAttrSingle(prop, value)";
_sheet._setattrsingle /*b4j.example.vmcontainer*/ (_prop,_value);
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 107;BA.debugLine="Sub SetColor(varColor As String) As VMSheet";
 //BA.debugLineNum = 108;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 109;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 110;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 113;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 114;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 115;BA.debugLine="Sheet.Bind(\":color\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":color",_pp);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 301;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 302;BA.debugLine="If color = \"\" Then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 303;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 304;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 305;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 308;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 309;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 310;BA.debugLine="Sheet.Bind(\":color\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":color",_pp);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 224;BA.debugLine="Sub SetDark(varDark As Boolean) As VMSheet";
 //BA.debugLineNum = 225;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 226;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 227;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 230;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 231;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 232;BA.debugLine="Sheet.Bind(\":dark\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":dark",_pp);
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 29;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSheet";
 //BA.debugLineNum = 334;BA.debugLine="Sheet.SetDesignMode(b)";
_sheet._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 335;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 336;BA.debugLine="Footer.SetDesignMode(b)";
_footer._setdesignmode /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 419;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 420;BA.debugLine="Sheet.SetDeviceOffsets(OS, OM, OL, OX)";
_sheet._setdeviceoffsets /*b4j.example.vmcontainer*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 421;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 426;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 427;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 428;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 429;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 434;BA.debugLine="Sheet.SetDeviceSizes(SS, SM, SL, SX)";
_sheet._setdevicesizes /*b4j.example.vmcontainer*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setelevation(String _varelevation) throws Exception{
String _pp = "";
 //BA.debugLineNum = 120;BA.debugLine="Sub SetElevation(varElevation As String) As VMShee";
 //BA.debugLineNum = 121;BA.debugLine="If varElevation = \"\" Then Return Me";
if ((_varelevation).equals("")) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 122;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 123;BA.debugLine="SetAttrSingle(\"elevation\", varElevation)";
_setattrsingle("elevation",_varelevation);
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 126;BA.debugLine="Dim pp As String = $\"${ID}Elevation\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Elevation");
 //BA.debugLineNum = 127;BA.debugLine="vue.SetStateSingle(pp, varElevation)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varelevation));
 //BA.debugLineNum = 128;BA.debugLine="Sheet.Bind(\":elevation\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":elevation",_pp);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setheight(String _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 133;BA.debugLine="Sub SetHeight(varHeight As String) As VMSheet";
 //BA.debugLineNum = 134;BA.debugLine="If varHeight = \"\" Then Return Me";
if ((_varheight).equals("")) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 135;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 136;BA.debugLine="SetAttrSingle(\"height\", varHeight)";
_setattrsingle("height",_varheight);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 139;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 140;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varheight));
 //BA.debugLineNum = 141;BA.debugLine="Sheet.Bind(\":height\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":height",_pp);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 406;BA.debugLine="Sub SetKey(k As String) As VMSheet";
 //BA.debugLineNum = 407;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 408;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 237;BA.debugLine="Sub SetLight(varLight As Boolean) As VMSheet";
 //BA.debugLineNum = 238;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 239;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 240;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 243;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 244;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 245;BA.debugLine="Sheet.Bind(\":light\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":light",_pp);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub SetMarginAll(p As String) As VMSheet";
 //BA.debugLineNum = 328;BA.debugLine="Sheet.setmarginall(p)";
_sheet._setmarginall /*b4j.example.vmcontainer*/ (_p);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setmaxheight(String _varmaxheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 146;BA.debugLine="Sub SetMaxHeight(varMaxHeight As String) As VMShee";
 //BA.debugLineNum = 147;BA.debugLine="If varMaxHeight = \"\" Then Return Me";
if ((_varmaxheight).equals("")) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 148;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 149;BA.debugLine="SetAttrSingle(\"max-height\", varMaxHeight)";
_setattrsingle("max-height",_varmaxheight);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 152;BA.debugLine="Dim pp As String = $\"${ID}MaxHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxHeight");
 //BA.debugLineNum = 153;BA.debugLine="vue.SetStateSingle(pp, varMaxHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxheight));
 //BA.debugLineNum = 154;BA.debugLine="Sheet.Bind(\":max-height\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":max-height",_pp);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setmaxwidth(String _varmaxwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 159;BA.debugLine="Sub SetMaxWidth(varMaxWidth As String) As VMSheet";
 //BA.debugLineNum = 160;BA.debugLine="If varMaxWidth = \"\" Then Return Me";
if ((_varmaxwidth).equals("")) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 161;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 162;BA.debugLine="SetAttrSingle(\"max-width\", varMaxWidth)";
_setattrsingle("max-width",_varmaxwidth);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 165;BA.debugLine="Dim pp As String = $\"${ID}MaxWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MaxWidth");
 //BA.debugLineNum = 166;BA.debugLine="vue.SetStateSingle(pp, varMaxWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmaxwidth));
 //BA.debugLineNum = 167;BA.debugLine="Sheet.Bind(\":max-width\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":max-width",_pp);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setminheight(String _varminheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 172;BA.debugLine="Sub SetMinHeight(varMinHeight As String) As VMShee";
 //BA.debugLineNum = 173;BA.debugLine="If varMinHeight = \"\" Then Return Me";
if ((_varminheight).equals("")) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 174;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 175;BA.debugLine="SetAttrSingle(\"min-height\", varMinHeight)";
_setattrsingle("min-height",_varminheight);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 178;BA.debugLine="Dim pp As String = $\"${ID}MinHeight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinHeight");
 //BA.debugLineNum = 179;BA.debugLine="vue.SetStateSingle(pp, varMinHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminheight));
 //BA.debugLineNum = 180;BA.debugLine="Sheet.Bind(\":min-height\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":min-height",_pp);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setminwidth(String _varminwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 185;BA.debugLine="Sub SetMinWidth(varMinWidth As String) As VMSheet";
 //BA.debugLineNum = 186;BA.debugLine="If varMinWidth = \"\" Then Return Me";
if ((_varminwidth).equals("")) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 187;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 188;BA.debugLine="SetAttrSingle(\"min-width\", varMinWidth)";
_setattrsingle("min-width",_varminwidth);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 191;BA.debugLine="Dim pp As String = $\"${ID}MinWidth\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"MinWidth");
 //BA.debugLineNum = 192;BA.debugLine="vue.SetStateSingle(pp, varMinWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varminwidth));
 //BA.debugLineNum = 193;BA.debugLine="Sheet.Bind(\":min-width\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":min-width",_pp);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 350;BA.debugLine="Sheet.SetName(varName, bbind)";
_sheet._setname /*b4j.example.vmcontainer*/ ((Object)(_varname),_bbind);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetPaddingAll(p As String) As VMSheet";
 //BA.debugLineNum = 322;BA.debugLine="Sheet.SetPaddingAll(p)";
_sheet._setpaddingall /*b4j.example.vmcontainer*/ (_p);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 413;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMShe";
 //BA.debugLineNum = 414;BA.debugLine="Sheet.SetRC(sRow, sCol)";
_sheet._setrc /*b4j.example.vmcontainer*/ (_srow,_scol);
 //BA.debugLineNum = 415;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetStatic(b As Boolean) As VMSheet";
 //BA.debugLineNum = 342;BA.debugLine="Sheet.SetStatic(b)";
_sheet._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 343;BA.debugLine="Footer.SetStatic(b)";
_footer._setstatic /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 344;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetStyle(sm As Map) As VMSheet";
 //BA.debugLineNum = 95;BA.debugLine="Sheet.SetStyle(sm)";
_sheet._setstyle /*b4j.example.vmcontainer*/ (_sm);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 356;BA.debugLine="Sheet.SetStyleSingle(prop, value)";
_sheet._setstylesingle /*b4j.example.vmcontainer*/ (_prop,_value);
 //BA.debugLineNum = 357;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _settag(String _vartag) throws Exception{
String _pp = "";
 //BA.debugLineNum = 198;BA.debugLine="Sub SetTag(varTag As String) As VMSheet";
 //BA.debugLineNum = 199;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 200;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 201;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 204;BA.debugLine="Dim pp As String = $\"${ID}Tag\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tag");
 //BA.debugLineNum = 205;BA.debugLine="vue.SetStateSingle(pp, varTag)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartag));
 //BA.debugLineNum = 206;BA.debugLine="Sheet.Bind(\":tag\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":tag",_pp);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public String  _settext(String _txt) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetText(txt As String)";
 //BA.debugLineNum = 77;BA.debugLine="Sheet.SetText(txt)";
_sheet._settext /*b4j.example.vmcontainer*/ (_txt);
 //BA.debugLineNum = 78;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsheet  _settextcenter() throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="Sub SetTextCenter As VMSheet";
 //BA.debugLineNum = 447;BA.debugLine="Sheet.AddClass(\"text-center\")";
_sheet._addclass /*b4j.example.vmcontainer*/ ("text-center");
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _settextcolor(String _textcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 468;BA.debugLine="Sub SetTextColor(textcolor As String) As VMSheet";
 //BA.debugLineNum = 469;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 470;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 471;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 472;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _settextcolorintensity(String _textcolor,String _textintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 476;BA.debugLine="Sub SetTextColorIntensity(textcolor As String, tex";
 //BA.debugLineNum = 477;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 478;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 479;BA.debugLine="Dim sIntensity As String = $\"text--${textintensit";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_textintensity))+"");
 //BA.debugLineNum = 480;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 481;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _settile(boolean _vartile) throws Exception{
String _pp = "";
 //BA.debugLineNum = 250;BA.debugLine="Sub SetTile(varTile As Boolean) As VMSheet";
 //BA.debugLineNum = 251;BA.debugLine="If varTile = False Then Return Me";
if (_vartile==__c.False) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 252;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 253;BA.debugLine="SetAttrSingle(\"tile\", varTile)";
_setattrsingle("tile",BA.ObjectToString(_vartile));
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 256;BA.debugLine="Dim pp As String = $\"${ID}Tile\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tile");
 //BA.debugLineNum = 257;BA.debugLine="vue.SetStateSingle(pp, varTile)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartile));
 //BA.debugLineNum = 258;BA.debugLine="Sheet.Bind(\":tile\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":tile",_pp);
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _settopoverlap() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetTopOverlap As VMSheet";
 //BA.debugLineNum = 35;BA.debugLine="AddClass(\"mx-auto\")";
_addclass("mx-auto");
 //BA.debugLineNum = 36;BA.debugLine="SetStyleSingle(\"top\", \"-24px\")";
_setstylesingle("top","-24px");
 //BA.debugLineNum = 37;BA.debugLine="SetStyleSingle(\"position\", \"relative\")";
_setstylesingle("position","relative");
 //BA.debugLineNum = 38;BA.debugLine="SetAttrSingle(\"max-width\", \"calc(100% - 32px)\")";
_setattrsingle("max-width","calc(100% - 32px)");
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub SetVElse(vif As String) As VMSheet";
 //BA.debugLineNum = 373;BA.debugLine="Sheet.SetVElse(vif)";
_sheet._setvelse /*b4j.example.vmcontainer*/ (_vif);
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 397;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 398;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 399;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 400;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 401;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 402;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 403;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 383;BA.debugLine="Sub SetVhtml(vhtml As String) As VMSheet";
 //BA.debugLineNum = 384;BA.debugLine="Sheet.SetVHtml(vhtml)";
_sheet._setvhtml /*b4j.example.vmcontainer*/ (_vhtml);
 //BA.debugLineNum = 385;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetVIf(vif As String) As VMSheet";
 //BA.debugLineNum = 49;BA.debugLine="Sheet.SetVIf(vif)";
_sheet._setvif /*b4j.example.vmcontainer*/ (_vif);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 462;BA.debugLine="Sub SetVisible(b As Boolean) As VMSheet";
 //BA.debugLineNum = 463;BA.debugLine="Sheet.SetVisible(b)";
_sheet._setvisible /*b4j.example.vmcontainer*/ (_b);
 //BA.debugLineNum = 464;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetVShow(vif As String) As VMSheet";
 //BA.debugLineNum = 54;BA.debugLine="Sheet.SetVShow(vif)";
_sheet._setvshow /*b4j.example.vmcontainer*/ (_vif);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Sub SetVText(vhtml As String) As VMSheet";
 //BA.debugLineNum = 378;BA.debugLine="Sheet.SetVText(vhtml)";
_sheet._setvtext /*b4j.example.vmcontainer*/ (_vhtml);
 //BA.debugLineNum = 379;BA.debugLine="HasContent = True";
_hascontent = __c.True;
 //BA.debugLineNum = 380;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _setwidth(String _varwidth) throws Exception{
String _pp = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub SetWidth(varWidth As String) As VMSheet";
 //BA.debugLineNum = 212;BA.debugLine="If varWidth = \"\" Then Return Me";
if ((_varwidth).equals("")) { 
if (true) return (b4j.example.vmsheet)(this);};
 //BA.debugLineNum = 213;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 214;BA.debugLine="SetAttrSingle(\"width\", varWidth)";
_setattrsingle("width",_varwidth);
 //BA.debugLineNum = 215;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 };
 //BA.debugLineNum = 217;BA.debugLine="Dim pp As String = $\"${ID}Width\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Width");
 //BA.debugLineNum = 218;BA.debugLine="vue.SetStateSingle(pp, varWidth)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varwidth));
 //BA.debugLineNum = 219;BA.debugLine="Sheet.Bind(\":width\", pp)";
_sheet._bind /*b4j.example.vmcontainer*/ (":width",_pp);
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsheet  _show() throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub Show As VMSheet";
 //BA.debugLineNum = 271;BA.debugLine="Sheet.SetVisible(True)";
_sheet._setvisible /*b4j.example.vmcontainer*/ (__c.True);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 44;BA.debugLine="If Footer.HasContent Then SetText(Footer.tostring";
if (_footer._hascontent /*boolean*/ ) { 
_settext(_footer._tostring /*String*/ ());};
 //BA.debugLineNum = 45;BA.debugLine="Return Sheet.ToString";
if (true) return _sheet._tostring /*String*/ ();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsheet  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 289;BA.debugLine="Sub UseTheme(themeName As String) As VMSheet";
 //BA.debugLineNum = 290;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 291;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 292;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 293;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 294;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsheet)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
