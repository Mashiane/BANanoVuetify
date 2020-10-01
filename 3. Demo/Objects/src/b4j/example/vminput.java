package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vminput extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vminput", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vminput.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _input = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public String _vmodel = "";
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
public b4j.example.vminput  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 103;BA.debugLine="Sub AddChild(child As VMElement) As VMInput";
 //BA.debugLineNum = 104;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 105;BA.debugLine="Input.SetText(childHTML)";
_input._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 139;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 140;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 141;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminput  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub AddClass(c As String) As VMInput";
 //BA.debugLineNum = 122;BA.debugLine="Input.AddClass(c)";
_input._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 511;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 512;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 513;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminput  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 460;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 461;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 462;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 463;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 515;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 516;BA.debugLine="Input.BuildModel(mprops, mstyles, lclasses, loose)";
_input._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 517;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 518;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Input As VMElement";
_input = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 10;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminput  _disable() throws Exception{
 //BA.debugLineNum = 453;BA.debugLine="Sub Disable As VMInput";
 //BA.debugLineNum = 454;BA.debugLine="Input.Disable(True)";
_input._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 455;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _enable() throws Exception{
 //BA.debugLineNum = 448;BA.debugLine="Sub Enable As VMInput";
 //BA.debugLineNum = 449;BA.debugLine="Input.Enable(True)";
_input._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 450;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _hide() throws Exception{
 //BA.debugLineNum = 438;BA.debugLine="Sub Hide As VMInput";
 //BA.debugLineNum = 439;BA.debugLine="Input.SetVisible(False)";
_input._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 440;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="Input.Initialize(v, ID)";
_input._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="Input.SetTag(\"v-input\")";
_input._settag /*b4j.example.vmelement*/ ("v-input");
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 22;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 117;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminput  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 467;BA.debugLine="public Sub RemoveAttr(sName As String) As VMInput";
 //BA.debugLineNum = 468;BA.debugLine="Input.RemoveAttr(sName)";
_input._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 469;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 470;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub Render";
 //BA.debugLineNum = 99;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminput  _setappendicon(Object _varappendicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 146;BA.debugLine="Sub SetAppendIcon(varAppendIcon As Object) As VMIn";
 //BA.debugLineNum = 147;BA.debugLine="Dim pp As String = $\"${ID}AppendIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AppendIcon");
 //BA.debugLineNum = 148;BA.debugLine="vue.SetStateSingle(pp, varAppendIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varappendicon);
 //BA.debugLineNum = 149;BA.debugLine="Input.Bind(\":append-icon\", pp)";
_input._bind /*b4j.example.vmelement*/ (":append-icon",_pp);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub SetAttr(attr As Map) As VMInput";
 //BA.debugLineNum = 128;BA.debugLine="Input.SetAttr(attr)";
_input._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 69;BA.debugLine="Sub SetAttributes(attrs As List) As VMInput";
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
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetAttrLoose(loose As String) As VMInput";
 //BA.debugLineNum = 65;BA.debugLine="Input.SetAttrLoose(loose)";
_input._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 505;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 506;BA.debugLine="Input.SetAttrSingle(prop, value)";
_input._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 507;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setbackgroundcolor(Object _varbackgroundcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 154;BA.debugLine="Sub SetBackgroundColor(varBackgroundColor As Objec";
 //BA.debugLineNum = 155;BA.debugLine="Dim pp As String = $\"${ID}BackgroundColor\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"BackgroundColor");
 //BA.debugLineNum = 156;BA.debugLine="vue.SetStateSingle(pp, varBackgroundColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varbackgroundcolor);
 //BA.debugLineNum = 157;BA.debugLine="Input.Bind(\":background-color\", pp)";
_input._bind /*b4j.example.vmelement*/ (":background-color",_pp);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setcolor(Object _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 162;BA.debugLine="Sub SetColor(varColor As Object) As VMInput";
 //BA.debugLineNum = 163;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 164;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcolor);
 //BA.debugLineNum = 165;BA.debugLine="Input.Bind(\":color\", pp)";
_input._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setdark(Object _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 170;BA.debugLine="Sub SetDark(varDark As Object) As VMInput";
 //BA.debugLineNum = 171;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 172;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardark);
 //BA.debugLineNum = 173;BA.debugLine="Input.Bind(\":dark\", pp)";
_input._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 33;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setdense(Object _vardense) throws Exception{
String _pp = "";
 //BA.debugLineNum = 178;BA.debugLine="Sub SetDense(varDense As Object) As VMInput";
 //BA.debugLineNum = 179;BA.debugLine="Dim pp As String = $\"${ID}Dense\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dense");
 //BA.debugLineNum = 180;BA.debugLine="vue.SetStateSingle(pp, varDense)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vardense);
 //BA.debugLineNum = 181;BA.debugLine="Input.Bind(\":dense\", pp)";
_input._bind /*b4j.example.vmelement*/ (":dense",_pp);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 483;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMInput";
 //BA.debugLineNum = 484;BA.debugLine="Input.SetDesignMode(b)";
_input._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 485;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 486;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 487;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 47;BA.debugLine="Input.SetDeviceOffsets(OS, OM, OL, OX)";
_input._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 59;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 60;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 53;BA.debugLine="Input.SetDeviceSizes(SS, SM, SL, SX)";
_input._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMInput";
 //BA.debugLineNum = 187;BA.debugLine="Input.SetDisabled(varDisabled)";
_input._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _seterror(boolean _varerror) throws Exception{
String _pp = "";
 //BA.debugLineNum = 192;BA.debugLine="Sub SetError(varError As Boolean) As VMInput";
 //BA.debugLineNum = 193;BA.debugLine="Dim pp As String = $\"${vmodel}Error\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"Error");
 //BA.debugLineNum = 194;BA.debugLine="vue.SetStateSingle(pp, varError)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varerror));
 //BA.debugLineNum = 195;BA.debugLine="Input.Bind(\":error\", pp)";
_input._bind /*b4j.example.vmelement*/ (":error",_pp);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _seterrorcount(Object _varerrorcount) throws Exception{
String _pp = "";
 //BA.debugLineNum = 200;BA.debugLine="Sub SetErrorCount(varErrorCount As Object) As VMIn";
 //BA.debugLineNum = 201;BA.debugLine="Dim pp As String = $\"${vmodel}ErrorCount\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"ErrorCount");
 //BA.debugLineNum = 202;BA.debugLine="vue.SetStateSingle(pp, varErrorCount)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varerrorcount);
 //BA.debugLineNum = 203;BA.debugLine="Input.Bind(\":error-count\", pp)";
_input._bind /*b4j.example.vmelement*/ (":error-count",_pp);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _seterrormessages(boolean _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _pp = "";
 //BA.debugLineNum = 208;BA.debugLine="Sub SetErrorMessages(b As Boolean) As VMInput";
 //BA.debugLineNum = 209;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 210;BA.debugLine="Dim nl As List = vue.NewList";
_nl = new anywheresoftware.b4a.objects.collections.List();
_nl = _vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 211;BA.debugLine="Dim pp As String = $\"${vmodel}ErrorMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"ErrorMessages");
 //BA.debugLineNum = 212;BA.debugLine="vue.SetData(pp, nl)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_nl.getObject()));
 //BA.debugLineNum = 213;BA.debugLine="Input.Bind(\":error-messages\", pp)";
_input._bind /*b4j.example.vmelement*/ (":error-messages",_pp);
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setheight(Object _varheight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 218;BA.debugLine="Sub SetHeight(varHeight As Object) As VMInput";
 //BA.debugLineNum = 219;BA.debugLine="Dim pp As String = $\"${ID}Height\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Height");
 //BA.debugLineNum = 220;BA.debugLine="vue.SetStateSingle(pp, varHeight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varheight);
 //BA.debugLineNum = 221;BA.debugLine="Input.Bind(\":height\", pp)";
_input._bind /*b4j.example.vmelement*/ (":height",_pp);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _sethidedetails(boolean _varhidedetails) throws Exception{
String _pp = "";
 //BA.debugLineNum = 226;BA.debugLine="Sub SetHideDetails(varHideDetails As Boolean) As V";
 //BA.debugLineNum = 227;BA.debugLine="Dim pp As String = $\"${ID}HideDetails\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"HideDetails");
 //BA.debugLineNum = 228;BA.debugLine="vue.SetStateSingle(pp, varHideDetails)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhidedetails));
 //BA.debugLineNum = 229;BA.debugLine="Input.Bind(\":hide-details\", pp)";
_input._bind /*b4j.example.vmelement*/ (":hide-details",_pp);
 //BA.debugLineNum = 230;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _sethint(Object _varhint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 234;BA.debugLine="Sub SetHint(varHint As Object) As VMInput";
 //BA.debugLineNum = 235;BA.debugLine="Dim pp As String = $\"${ID}Hint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Hint");
 //BA.debugLineNum = 236;BA.debugLine="vue.SetStateSingle(pp, varHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varhint);
 //BA.debugLineNum = 237;BA.debugLine="Input.Bind(\":hint\", pp)";
_input._bind /*b4j.example.vmelement*/ (":hint",_pp);
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setid(Object _varid) throws Exception{
String _pp = "";
 //BA.debugLineNum = 242;BA.debugLine="Sub SetId(varId As Object) As VMInput";
 //BA.debugLineNum = 243;BA.debugLine="Dim pp As String = $\"${ID}Id\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Id");
 //BA.debugLineNum = 244;BA.debugLine="vue.SetStateSingle(pp, varId)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varid);
 //BA.debugLineNum = 245;BA.debugLine="Input.Bind(\":id\", pp)";
_input._bind /*b4j.example.vmelement*/ (":id",_pp);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setlabel(Object _varlabel) throws Exception{
String _pp = "";
 //BA.debugLineNum = 250;BA.debugLine="Sub SetLabel(varLabel As Object) As VMInput";
 //BA.debugLineNum = 251;BA.debugLine="Dim pp As String = $\"${ID}Label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Label");
 //BA.debugLineNum = 252;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlabel);
 //BA.debugLineNum = 253;BA.debugLine="Input.Bind(\":label\", pp)";
_input._bind /*b4j.example.vmelement*/ (":label",_pp);
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setlight(Object _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 258;BA.debugLine="Sub SetLight(varLight As Object) As VMInput";
 //BA.debugLineNum = 259;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 260;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varlight);
 //BA.debugLineNum = 261;BA.debugLine="Input.Bind(\":light\", pp)";
_input._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 262;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setloading(Object _varloading) throws Exception{
String _pp = "";
 //BA.debugLineNum = 266;BA.debugLine="Sub SetLoading(varLoading As Object) As VMInput";
 //BA.debugLineNum = 267;BA.debugLine="Dim pp As String = $\"${ID}Loading\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Loading");
 //BA.debugLineNum = 268;BA.debugLine="vue.SetStateSingle(pp, varLoading)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varloading);
 //BA.debugLineNum = 269;BA.debugLine="Input.Bind(\":loading\", pp)";
_input._bind /*b4j.example.vmelement*/ (":loading",_pp);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 478;BA.debugLine="Sub SetMarginAll(p As String) As VMInput";
 //BA.debugLineNum = 479;BA.debugLine="Input.setmarginall(p)";
_input._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 480;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setmessages(Object _varmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 274;BA.debugLine="Sub SetMessages(varMessages As Object) As VMInput";
 //BA.debugLineNum = 275;BA.debugLine="Dim pp As String = $\"${ID}Messages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Messages");
 //BA.debugLineNum = 276;BA.debugLine="vue.SetStateSingle(pp, varMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varmessages);
 //BA.debugLineNum = 277;BA.debugLine="Input.Bind(\":messages\", pp)";
_input._bind /*b4j.example.vmelement*/ (":messages",_pp);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 495;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 496;BA.debugLine="Input.SetName(varName, bbind)";
_input._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setonchange(Object _eventhandler,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 366;BA.debugLine="Sub SetOnChange(EventHandler As Object, methodName";
 //BA.debugLineNum = 367;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 368;BA.debugLine="If SubExists(EventHandler, methodName) = False Th";
if (__c.SubExists(ba,_eventhandler,_methodname)==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 369;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 370;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(EventHan";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_eventhandler,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 371;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 373;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setonclickappend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 378;BA.debugLine="Sub SetOnClickAppend(methodName As String) As VMIn";
 //BA.debugLineNum = 379;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 380;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 381;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 382;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 383;BA.debugLine="SetAttr(CreateMap(\"@click:append\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:append"),(Object)(_methodname)}));
 //BA.debugLineNum = 385;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setonclickprepend(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 390;BA.debugLine="Sub SetOnClickPrepend(methodName As String) As VMI";
 //BA.debugLineNum = 391;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 392;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 393;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 394;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 395;BA.debugLine="SetAttr(CreateMap(\"@click:prepend\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click:prepend"),(Object)(_methodname)}));
 //BA.debugLineNum = 397;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setonmousedown(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 402;BA.debugLine="Sub SetOnMousedown(methodName As String) As VMInpu";
 //BA.debugLineNum = 403;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 404;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 405;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 406;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 407;BA.debugLine="SetAttr(CreateMap(\"@mousedown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mousedown"),(Object)(_methodname)}));
 //BA.debugLineNum = 409;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 410;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setonmouseup(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 414;BA.debugLine="Sub SetOnMouseup(methodName As String) As VMInput";
 //BA.debugLineNum = 415;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 416;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 417;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 418;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 419;BA.debugLine="SetAttr(CreateMap(\"@mouseup\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@mouseup"),(Object)(_methodname)}));
 //BA.debugLineNum = 421;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setonupdateerror(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 426;BA.debugLine="Sub SetOnUpdateError(methodName As String) As VMIn";
 //BA.debugLineNum = 427;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 428;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 429;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 430;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 431;BA.debugLine="SetAttr(CreateMap(\"@update:error\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@update:error"),(Object)(_methodname)}));
 //BA.debugLineNum = 433;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 434;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Sub SetPaddingAll(p As String) As VMInput";
 //BA.debugLineNum = 474;BA.debugLine="Input.SetPaddingAll(p)";
_input._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 475;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setpersistenthint(Object _varpersistenthint) throws Exception{
String _pp = "";
 //BA.debugLineNum = 282;BA.debugLine="Sub SetPersistentHint(varPersistentHint As Object)";
 //BA.debugLineNum = 283;BA.debugLine="Dim pp As String = $\"${ID}PersistentHint\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PersistentHint");
 //BA.debugLineNum = 284;BA.debugLine="vue.SetStateSingle(pp, varPersistentHint)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varpersistenthint);
 //BA.debugLineNum = 285;BA.debugLine="Input.Bind(\":persistent-hint\", pp)";
_input._bind /*b4j.example.vmelement*/ (":persistent-hint",_pp);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setprependicon(Object _varprependicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 290;BA.debugLine="Sub SetPrependIcon(varPrependIcon As Object) As VM";
 //BA.debugLineNum = 291;BA.debugLine="Dim pp As String = $\"${ID}PrependIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrependIcon");
 //BA.debugLineNum = 292;BA.debugLine="vue.SetStateSingle(pp, varPrependIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varprependicon);
 //BA.debugLineNum = 293;BA.debugLine="Input.Bind(\":prepend-icon\", pp)";
_input._bind /*b4j.example.vmelement*/ (":prepend-icon",_pp);
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMInp";
 //BA.debugLineNum = 41;BA.debugLine="Input.SetRC(sRow, sCol)";
_input._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setreadonly(Object _varreadonly) throws Exception{
String _pp = "";
 //BA.debugLineNum = 298;BA.debugLine="Sub SetReadonly(varReadonly As Object) As VMInput";
 //BA.debugLineNum = 299;BA.debugLine="Dim pp As String = $\"${ID}Readonly\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Readonly");
 //BA.debugLineNum = 300;BA.debugLine="vue.SetStateSingle(pp, varReadonly)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varreadonly);
 //BA.debugLineNum = 301;BA.debugLine="Input.Bind(\":readonly\", pp)";
_input._bind /*b4j.example.vmelement*/ (":readonly",_pp);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setrules(boolean _varrules) throws Exception{
String _pp = "";
 //BA.debugLineNum = 306;BA.debugLine="Sub SetRules(varRules As Boolean) As VMInput";
 //BA.debugLineNum = 307;BA.debugLine="If varRules = False Then Return Me";
if (_varrules==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 308;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 309;BA.debugLine="If DesignMode Then Return Me";
if (_designmode) { 
if (true) return (b4j.example.vminput)(this);};
 //BA.debugLineNum = 310;BA.debugLine="Dim pp As String = $\"${vmodel}Rules\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_vmodel))+"Rules");
 //BA.debugLineNum = 311;BA.debugLine="Input.Bind(\":rules\", pp)";
_input._bind /*b4j.example.vmelement*/ (":rules",_pp);
 //BA.debugLineNum = 312;BA.debugLine="vue.SetData(pp, vue.NewList)";
_vue._setdata /*b4j.example.bananovue*/ (_pp,(Object)(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setslotappend(boolean _b) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetSlotAppend(b As Boolean) As VMInput    'ign";
 //BA.debugLineNum = 349;BA.debugLine="SetAttr(CreateMap(\"slot\": \"append\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("append")}));
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setslotmessage(boolean _b) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub SetSlotMessage(b As Boolean) As VMInput    'ig";
 //BA.debugLineNum = 355;BA.debugLine="SetAttr(CreateMap(\"slot\": \"message\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("message")}));
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setslotprepend(boolean _b) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub SetSlotPrepend(b As Boolean) As VMInput    'ig";
 //BA.debugLineNum = 361;BA.debugLine="SetAttr(CreateMap(\"slot\": \"prepend\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("prepend")}));
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetStatic(b As Boolean) As VMInput";
 //BA.debugLineNum = 27;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 28;BA.debugLine="Input.SetStatic(b)";
_input._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetStyle(sm As Map) As VMInput";
 //BA.debugLineNum = 134;BA.debugLine="Input.SetStyle(sm)";
_input._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 500;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 501;BA.debugLine="Input.SetStyleSingle(prop, value)";
_input._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 502;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setsuccess(Object _varsuccess) throws Exception{
String _pp = "";
 //BA.debugLineNum = 317;BA.debugLine="Sub SetSuccess(varSuccess As Object) As VMInput";
 //BA.debugLineNum = 318;BA.debugLine="Dim pp As String = $\"${ID}Success\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Success");
 //BA.debugLineNum = 319;BA.debugLine="vue.SetStateSingle(pp, varSuccess)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varsuccess);
 //BA.debugLineNum = 320;BA.debugLine="Input.Bind(\":success\", pp)";
_input._bind /*b4j.example.vmelement*/ (":success",_pp);
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setsuccessmessages(Object _varsuccessmessages) throws Exception{
String _pp = "";
 //BA.debugLineNum = 325;BA.debugLine="Sub SetSuccessMessages(varSuccessMessages As Objec";
 //BA.debugLineNum = 326;BA.debugLine="Dim pp As String = $\"${ID}SuccessMessages\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SuccessMessages");
 //BA.debugLineNum = 327;BA.debugLine="vue.SetStateSingle(pp, varSuccessMessages)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varsuccessmessages);
 //BA.debugLineNum = 328;BA.debugLine="Input.Bind(\":success-messages\", pp)";
_input._bind /*b4j.example.vmelement*/ (":success-messages",_pp);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 489;BA.debugLine="Sub SetTabIndex(ti As String) As VMInput";
 //BA.debugLineNum = 490;BA.debugLine="Input.SetTabIndex(ti)";
_input._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 491;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetText(t As Object) As VMInput";
 //BA.debugLineNum = 111;BA.debugLine="Input.SetText(t)";
_input._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 525;BA.debugLine="Sub SetTextColor(varColor As String) As VMInput";
 //BA.debugLineNum = 526;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 527;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 528;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 529;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 532;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 533;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 534;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 535;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 536;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 537;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setvalidateonblur(Object _varvalidateonblur) throws Exception{
String _pp = "";
 //BA.debugLineNum = 333;BA.debugLine="Sub SetValidateOnBlur(varValidateOnBlur As Object)";
 //BA.debugLineNum = 334;BA.debugLine="Dim pp As String = $\"${ID}ValidateOnBlur\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ValidateOnBlur");
 //BA.debugLineNum = 335;BA.debugLine="vue.SetStateSingle(pp, varValidateOnBlur)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varvalidateonblur);
 //BA.debugLineNum = 336;BA.debugLine="Input.Bind(\":validate-on-blur\", pp)";
_input._bind /*b4j.example.vmelement*/ (":validate-on-blur",_pp);
 //BA.debugLineNum = 337;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setvalue(Object _varvalue) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub SetValue(varValue As Object) As VMInput";
 //BA.debugLineNum = 342;BA.debugLine="Input.SetValue(varValue, False)";
_input._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 343;BA.debugLine="vue.SetData(vmodel, varValue)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,_varvalue);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetVIf(vif As String) As VMInput";
 //BA.debugLineNum = 88;BA.debugLine="Input.SetVIf(vif)";
_input._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 519;BA.debugLine="Sub SetVisible(b As Boolean) As VMInput";
 //BA.debugLineNum = 520;BA.debugLine="Input.SetVisible(b)";
_input._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 521;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 522;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetVModel(k As String) As VMInput";
 //BA.debugLineNum = 82;BA.debugLine="Input.SetVModel(k)";
_input._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 83;BA.debugLine="vmodel = k.tolowercase";
_vmodel = _k.toLowerCase();
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetVShow(vif As String) As VMInput";
 //BA.debugLineNum = 93;BA.debugLine="Input.SetVShow(vif)";
_input._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _show() throws Exception{
 //BA.debugLineNum = 443;BA.debugLine="Sub Show As VMInput";
 //BA.debugLineNum = 444;BA.debugLine="Input.SetVisible(True)";
_input._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 445;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 78;BA.debugLine="Return Input.ToString";
if (true) return _input._tostring /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
