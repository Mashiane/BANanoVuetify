package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmradio extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmradio", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmradio.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _radio = null;
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
public b4j.example.vmradio  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 148;BA.debugLine="Sub AddChild(child As VMElement) As VMRadio";
 //BA.debugLineNum = 149;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 150;BA.debugLine="Radio.SetText(childHTML)";
_radio._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 184;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 185;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 186;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradio  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub AddClass(c As String) As VMRadio";
 //BA.debugLineNum = 167;BA.debugLine="Radio.AddClass(c)";
_radio._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 479;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 480;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradio  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 435;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 436;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 437;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 483;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 484;BA.debugLine="Radio.BuildModel(mprops, mstyles, lclasses, loose)";
_radio._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 485;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Radio As VMElement";
_radio = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradio  _disable() throws Exception{
 //BA.debugLineNum = 427;BA.debugLine="Sub Disable As VMRadio";
 //BA.debugLineNum = 428;BA.debugLine="Radio.Disable(True)";
_radio._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 429;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _enable() throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Sub Enable As VMRadio";
 //BA.debugLineNum = 423;BA.debugLine="Radio.Enable(True)";
_radio._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 424;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _hide() throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub Hide As VMRadio";
 //BA.debugLineNum = 413;BA.debugLine="Radio.SetVisible(False)";
_radio._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="Radio.Initialize(v, ID)";
_radio._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="Radio.SetTag(\"v-radio\")";
_radio._settag /*b4j.example.vmelement*/ ("v-radio");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="Radio.typeOf = \"radio\"";
_radio._typeof /*String*/  = "radio";
 //BA.debugLineNum = 21;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="SetOnChange(Module, $\"${ID}_change\"$)";
_setonchange(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 162;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradio  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="public Sub RemoveAttr(sName As String) As VMRadio";
 //BA.debugLineNum = 442;BA.debugLine="Radio.RemoveAttr(sName)";
_radio._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 443;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub Render";
 //BA.debugLineNum = 144;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradio  _setactiveclass(Object _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 191;BA.debugLine="Sub SetActiveClass(varActiveClass As Object) As VM";
 //BA.debugLineNum = 192;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 193;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",BA.ObjectToString(_varactiveclass));
 }else {
 //BA.debugLineNum = 195;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 196;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varactiveclass);
 //BA.debugLineNum = 197;BA.debugLine="Radio.Bind(\":active-class\", pp)";
_radio._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 };
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub SetAttr(attr As Map) As VMRadio";
 //BA.debugLineNum = 173;BA.debugLine="Radio.SetAttr(attr)";
_radio._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 69;BA.debugLine="Sub SetAttributes(attrs As List) As VMRadio";
 //BA.debugLineNum = 70;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 71;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetAttrLoose(loose As String) As VMRadio";
 //BA.debugLineNum = 65;BA.debugLine="Radio.SetAttrLoose(loose)";
_radio._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 474;BA.debugLine="Radio.SetAttrSingle(prop, value)";
_radio._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 475;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setcolor(Object _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 203;BA.debugLine="Sub SetColor(varColor As Object) As VMRadio";
 //BA.debugLineNum = 204;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 205;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",BA.ObjectToString(_varcolor));
 }else {
 //BA.debugLineNum = 207;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 208;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcolor);
 //BA.debugLineNum = 209;BA.debugLine="Radio.Bind(\":color\", pp)";
_radio._bind /*b4j.example.vmelement*/ (":color",_pp);
 };
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 101;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 102;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 103;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 104;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 }else {
 //BA.debugLineNum = 106;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 107;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 108;BA.debugLine="Radio.Bind(\":color\", pp)";
_radio._bind /*b4j.example.vmelement*/ (":color",_pp);
 };
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setdark(Object _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 215;BA.debugLine="Sub SetDark(varDark As Object) As VMRadio";
 //BA.debugLineNum = 216;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 217;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 }else {
 //BA.debugLineNum = 219;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 220;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardark);
 //BA.debugLineNum = 221;BA.debugLine="Radio.Bind(\":dark\", pp)";
_radio._bind /*b4j.example.vmelement*/ (":dark",_pp);
 };
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 39;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 457;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMRadio";
 //BA.debugLineNum = 458;BA.debugLine="Radio.SetDesignMode(b)";
_radio._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 459;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 460;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 47;BA.debugLine="Radio.SetDeviceOffsets(OS, OM, OL, OX)";
_radio._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 59;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 60;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 53;BA.debugLine="Radio.SetDeviceSizes(SS, SM, SL, SX)";
_radio._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMRadio";
 //BA.debugLineNum = 228;BA.debugLine="Radio.SetDisabled(varDisabled)";
_radio._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setid(Object _varid) throws Exception{
String _pp = "";
 //BA.debugLineNum = 233;BA.debugLine="Sub SetId(varId As Object) As VMRadio";
 //BA.debugLineNum = 234;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 235;BA.debugLine="SetAttrSingle(\"id\", varId)";
_setattrsingle("id",BA.ObjectToString(_varid));
 }else {
 //BA.debugLineNum = 237;BA.debugLine="Dim pp As String = $\"${ID}Id\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Id");
 //BA.debugLineNum = 238;BA.debugLine="vue.SetStateSingle(pp, varId)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varid);
 //BA.debugLineNum = 239;BA.debugLine="Radio.Bind(\":id\", pp)";
_radio._bind /*b4j.example.vmelement*/ (":id",_pp);
 };
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setlabel(Object _varlabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 245;BA.debugLine="Sub SetLabel(varLabel As Object) As VMRadio";
 //BA.debugLineNum = 246;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 247;BA.debugLine="SetAttrSingle(\"label\", varLabel)";
_setattrsingle("label",BA.ObjectToString(_varlabel));
 }else {
 //BA.debugLineNum = 249;BA.debugLine="Dim pp As String = $\"${ID}Label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Label");
 //BA.debugLineNum = 250;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlabel);
 //BA.debugLineNum = 251;BA.debugLine="Radio.Bind(\":label\", pp)";
_radio._bind /*b4j.example.vmelement*/ (":label",_pp);
 };
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setlight(Object _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 257;BA.debugLine="Sub SetLight(varLight As Object) As VMRadio";
 //BA.debugLineNum = 258;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 259;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 }else {
 //BA.debugLineNum = 261;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 262;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlight);
 //BA.debugLineNum = 263;BA.debugLine="Radio.Bind(\":light\", pp)";
_radio._bind /*b4j.example.vmelement*/ (":light",_pp);
 };
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 452;BA.debugLine="Sub SetMarginAll(p As String) As VMRadio";
 //BA.debugLineNum = 453;BA.debugLine="Radio.setmarginall(p)";
_radio._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 454;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setname(Object _varname) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub SetName(varName As Object) As VMRadio";
 //BA.debugLineNum = 270;BA.debugLine="SetAttrSingle(\"name\", varName)";
_setattrsingle("name",BA.ObjectToString(_varname));
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setofficon(Object _varofficon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 275;BA.debugLine="Sub SetOffIcon(varOffIcon As Object) As VMRadio";
 //BA.debugLineNum = 276;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 277;BA.debugLine="SetAttrSingle(\"off-icon\", varOffIcon)";
_setattrsingle("off-icon",BA.ObjectToString(_varofficon));
 }else {
 //BA.debugLineNum = 279;BA.debugLine="Dim pp As String = $\"${ID}OffIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OffIcon");
 //BA.debugLineNum = 280;BA.debugLine="vue.SetStateSingle(pp, varOffIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varofficon);
 //BA.debugLineNum = 281;BA.debugLine="Radio.Bind(\":off-icon\", pp)";
_radio._bind /*b4j.example.vmelement*/ (":off-icon",_pp);
 };
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setonchange(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 340;BA.debugLine="Sub SetOnChange(eventHandler As Object,methodName";
 //BA.debugLineNum = 341;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 342;BA.debugLine="If SubExists(eventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradio)(this);};
 //BA.debugLineNum = 343;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 344;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(eventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 345;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 347;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setonclickappend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 352;BA.debugLine="Sub SetOnClickAppend(methodName As String) As VMRa";
 //BA.debugLineNum = 353;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 354;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradio)(this);};
 //BA.debugLineNum = 355;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 356;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 357;BA.debugLine="SetAttr(CreateMap(\"@click:append\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:append"),(Object)(_methodname)}));
 //BA.debugLineNum = 359;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setonclickprepend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 364;BA.debugLine="Sub SetOnClickPrepend(methodName As String) As VMR";
 //BA.debugLineNum = 365;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 366;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradio)(this);};
 //BA.debugLineNum = 367;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 368;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 369;BA.debugLine="SetAttr(CreateMap(\"@click:prepend\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:prepend"),(Object)(_methodname)}));
 //BA.debugLineNum = 371;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setonicon(Object _varonicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 287;BA.debugLine="Sub SetOnIcon(varOnIcon As Object) As VMRadio";
 //BA.debugLineNum = 288;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 289;BA.debugLine="SetAttrSingle(\"on-icon\", varOnIcon)";
_setattrsingle("on-icon",BA.ObjectToString(_varonicon));
 }else {
 //BA.debugLineNum = 291;BA.debugLine="Dim pp As String = $\"${ID}OnIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OnIcon");
 //BA.debugLineNum = 292;BA.debugLine="vue.SetStateSingle(pp, varOnIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varonicon);
 //BA.debugLineNum = 293;BA.debugLine="Radio.Bind(\":on-icon\", pp)";
_radio._bind /*b4j.example.vmelement*/ (":on-icon",_pp);
 };
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setonmousedown(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 376;BA.debugLine="Sub SetOnMousedown(methodName As String) As VMRadi";
 //BA.debugLineNum = 377;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 378;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradio)(this);};
 //BA.debugLineNum = 379;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 380;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 381;BA.debugLine="SetAttr(CreateMap(\"@mousedown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mousedown"),(Object)(_methodname)}));
 //BA.debugLineNum = 383;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setonmouseup(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 388;BA.debugLine="Sub SetOnMouseup(methodName As String) As VMRadio";
 //BA.debugLineNum = 389;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 390;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradio)(this);};
 //BA.debugLineNum = 391;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 392;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 393;BA.debugLine="SetAttr(CreateMap(\"@mouseup\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mouseup"),(Object)(_methodname)}));
 //BA.debugLineNum = 395;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setonupdateerror(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 400;BA.debugLine="Sub SetOnUpdateError(methodName As String) As VMRa";
 //BA.debugLineNum = 401;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 402;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradio)(this);};
 //BA.debugLineNum = 403;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 404;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 405;BA.debugLine="SetAttr(CreateMap(\"@update:error\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:error"),(Object)(_methodname)}));
 //BA.debugLineNum = 407;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 408;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 447;BA.debugLine="Sub SetPaddingAll(p As String) As VMRadio";
 //BA.debugLineNum = 448;BA.debugLine="Radio.SetPaddingAll(p)";
_radio._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 449;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 450;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetPrimary(b As Boolean) As VMRadio";
 //BA.debugLineNum = 329;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmradio)(this);};
 //BA.debugLineNum = 330;BA.debugLine="SetColor(\"primary\")";
_setcolor((Object)("primary"));
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMRad";
 //BA.debugLineNum = 34;BA.debugLine="Radio.SetRC(sRow, sCol)";
_radio._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setreadonly(Object _varreadonly) throws Exception{
String _pp = "";
 //BA.debugLineNum = 299;BA.debugLine="Sub SetReadonly(varReadonly As Object) As VMRadio";
 //BA.debugLineNum = 300;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 301;BA.debugLine="SetAttrSingle(\"readonly\", varReadonly)";
_setattrsingle("readonly",BA.ObjectToString(_varreadonly));
 }else {
 //BA.debugLineNum = 303;BA.debugLine="Dim pp As String = $\"${ID}Readonly\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Readonly");
 //BA.debugLineNum = 304;BA.debugLine="vue.SetStateSingle(pp, varReadonly)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varreadonly);
 //BA.debugLineNum = 305;BA.debugLine="Radio.Bind(\":readonly\", pp)";
_radio._bind /*b4j.example.vmelement*/ (":readonly",_pp);
 };
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setripple(Object _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 311;BA.debugLine="Sub SetRipple(varRipple As Object) As VMRadio";
 //BA.debugLineNum = 312;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 313;BA.debugLine="SetAttrSingle(\"ripple\", varRipple)";
_setattrsingle("ripple",BA.ObjectToString(_varripple));
 }else {
 //BA.debugLineNum = 315;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 316;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varripple);
 //BA.debugLineNum = 317;BA.debugLine="Radio.Bind(\":ripple\", pp)";
_radio._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 };
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setslotlabel(boolean _b) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub SetSlotLabel(b As Boolean) As VMRadio    'igno";
 //BA.debugLineNum = 335;BA.debugLine="SetAttr(CreateMap(\"slot\": \"label\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("label")}));
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetStatic(b As Boolean) As VMRadio";
 //BA.debugLineNum = 27;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 28;BA.debugLine="Radio.SetStatic(b)";
_radio._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub SetStyle(sm As Map) As VMRadio";
 //BA.debugLineNum = 179;BA.debugLine="Radio.SetStyle(sm)";
_radio._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 468;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 469;BA.debugLine="Radio.SetStyleSingle(prop, value)";
_radio._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 470;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 463;BA.debugLine="Sub SetTabIndex(ti As String) As VMRadio";
 //BA.debugLineNum = 464;BA.debugLine="Radio.SetTabIndex(ti)";
_radio._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 465;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub SetText(t As Object) As VMRadio";
 //BA.debugLineNum = 156;BA.debugLine="Radio.SetText(t)";
_radio._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 493;BA.debugLine="Sub SetTextColor(varColor As String) As VMRadio";
 //BA.debugLineNum = 494;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 495;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 496;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 500;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 501;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 502;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 503;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 504;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 505;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 506;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setvalue(Object _varvalue) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetValue(varValue As Object) As VMRadio";
 //BA.debugLineNum = 324;BA.debugLine="Radio.SetValue(varValue, False)";
_radio._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setvfor(String _item,String _datasource,String _keyfield,String _valuefield,String _labelfield) throws Exception{
String _sline = "";
 //BA.debugLineNum = 77;BA.debugLine="Sub SetVFor(item As String, dataSource As String,";
 //BA.debugLineNum = 78;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 79;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 80;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 81;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 82;BA.debugLine="SetAttrSingle(\":key\", keyField)";
_setattrsingle(":key",_keyfield);
 //BA.debugLineNum = 83;BA.debugLine="SetAttrSingle(\":value\", valueField)";
_setattrsingle(":value",_valuefield);
 //BA.debugLineNum = 84;BA.debugLine="SetAttrSingle(\":label\", labelField)";
_setattrsingle(":label",_labelfield);
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub SetVIf(vif As String) As VMRadio";
 //BA.debugLineNum = 133;BA.debugLine="Radio.SetVIf(vif)";
_radio._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 487;BA.debugLine="Sub SetVisible(b As Boolean) As VMRadio";
 //BA.debugLineNum = 488;BA.debugLine="Radio.SetVisible(b)";
_radio._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 489;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetVModel(k As String) As VMRadio";
 //BA.debugLineNum = 128;BA.debugLine="Radio.SetVModel(k)";
_radio._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetVShow(vif As String) As VMRadio";
 //BA.debugLineNum = 138;BA.debugLine="Radio.SetVShow(vif)";
_radio._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _show() throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub Show As VMRadio";
 //BA.debugLineNum = 418;BA.debugLine="Radio.SetVisible(True)";
_radio._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 115;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 116;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 117;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 118;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 119;BA.debugLine="Log($\"VMRadio.${eName} event has not been define";
__c.Log(("VMRadio."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 122;BA.debugLine="RemoveAttr(\"required\")";
_removeattr("required");
 //BA.debugLineNum = 123;BA.debugLine="RemoveAttr(\":required\")";
_removeattr(":required");
 //BA.debugLineNum = 124;BA.debugLine="Return Radio.ToString";
if (true) return _radio._tostring /*String*/ ();
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradio  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 89;BA.debugLine="Sub UseTheme(themeName As String) As VMRadio";
 //BA.debugLineNum = 90;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 91;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 92;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 93;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 94;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
