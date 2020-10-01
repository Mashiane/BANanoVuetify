package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmsimplecheckbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmsimplecheckbox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmsimplecheckbox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _simplecheckbox = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
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
public b4j.example.vmsimplecheckbox  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 111;BA.debugLine="Sub AddChild(child As VMElement) As VMSimpleCheckB";
 //BA.debugLineNum = 112;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 113;BA.debugLine="SimpleCheckBox.SetText(childHTML)";
_simplecheckbox._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 147;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 148;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 149;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsimplecheckbox  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub AddClass(c As String) As VMSimpleCheckBox";
 //BA.debugLineNum = 130;BA.debugLine="SimpleCheckBox.AddClass(c)";
_simplecheckbox._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 345;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsimplecheckbox  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 293;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 294;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 295;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 350;BA.debugLine="SimpleCheckBox.BuildModel(mprops, mstyles, lclasse";
_simplecheckbox._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public SimpleCheckBox As VMElement";
_simplecheckbox = new b4j.example.vmelement();
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
 //BA.debugLineNum = 10;BA.debugLine="Private vmodel As String";
_vmodel = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsimplecheckbox  _disable() throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Sub Disable As VMSimpleCheckBox";
 //BA.debugLineNum = 286;BA.debugLine="SimpleCheckBox.Disable(True)";
_simplecheckbox._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _enable() throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Sub Enable As VMSimpleCheckBox";
 //BA.debugLineNum = 281;BA.debugLine="SimpleCheckBox.Enable(True)";
_simplecheckbox._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _hide() throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub Hide As VMSimpleCheckBox";
 //BA.debugLineNum = 271;BA.debugLine="SimpleCheckBox.SetVisible(False)";
_simplecheckbox._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 272;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="SimpleCheckBox.Initialize(v, ID)";
_simplecheckbox._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="SimpleCheckBox.SetTag(\"v-simple-checkbox\")";
_simplecheckbox._settag /*b4j.example.vmelement*/ ("v-simple-checkbox");
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 21;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="vmodel = \"\"";
_vmodel = "";
 //BA.debugLineNum = 23;BA.debugLine="SetOnClick($\"${ID}_click\"$)";
_setonclick((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 125;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsimplecheckbox  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSimple";
 //BA.debugLineNum = 300;BA.debugLine="SimpleCheckBox.RemoveAttr(sName)";
_simplecheckbox._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub Render";
 //BA.debugLineNum = 107;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsimplecheckbox  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub SetAttr(attr As Map) As VMSimpleCheckBox";
 //BA.debugLineNum = 136;BA.debugLine="SimpleCheckBox.SetAttr(attr)";
_simplecheckbox._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 71;BA.debugLine="Sub SetAttributes(attrs As List) As VMSimpleCheckB";
 //BA.debugLineNum = 72;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 73;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetAttrLoose(loose As String) As VMSimpleCheck";
 //BA.debugLineNum = 67;BA.debugLine="SimpleCheckBox.SetAttrLoose(loose)";
_simplecheckbox._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 339;BA.debugLine="SimpleCheckBox.SetAttrSingle(prop, value)";
_simplecheckbox._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 154;BA.debugLine="Sub SetColor(varColor As String) As VMSimpleCheckB";
 //BA.debugLineNum = 155;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmsimplecheckbox)(this);};
 //BA.debugLineNum = 156;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 157;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 };
 //BA.debugLineNum = 160;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 161;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 162;BA.debugLine="SimpleCheckBox.Bind(\":color\", pp)";
_simplecheckbox._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 167;BA.debugLine="Sub SetDark(varDark As Boolean) As VMSimpleCheckBo";
 //BA.debugLineNum = 168;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmsimplecheckbox)(this);};
 //BA.debugLineNum = 169;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 170;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 };
 //BA.debugLineNum = 173;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 174;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 175;BA.debugLine="SimpleCheckBox.Bind(\":dark\", pp)";
_simplecheckbox._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 28;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMSimpleCheckBo";
 //BA.debugLineNum = 316;BA.debugLine="SimpleCheckBox.SetDesignMode(b)";
_simplecheckbox._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 317;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 49;BA.debugLine="SimpleCheckBox.SetDeviceOffsets(OS, OM, OL, OX)";
_simplecheckbox._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 61;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 62;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 55;BA.debugLine="SimpleCheckBox.SetDeviceSizes(SS, SM, SL, SX)";
_simplecheckbox._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMSimpl";
 //BA.debugLineNum = 181;BA.debugLine="SimpleCheckBox.SetDisabled(varDisabled)";
_simplecheckbox._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setindeterminate(boolean _varindeterminate) throws Exception{
String _pp = "";
 //BA.debugLineNum = 186;BA.debugLine="Sub SetIndeterminate(varIndeterminate As Boolean)";
 //BA.debugLineNum = 187;BA.debugLine="If varIndeterminate = False Then Return Me";
if (_varindeterminate==__c.False) { 
if (true) return (b4j.example.vmsimplecheckbox)(this);};
 //BA.debugLineNum = 188;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 189;BA.debugLine="SetAttrSingle(\"indeterminate\", varIndeterminate)";
_setattrsingle("indeterminate",BA.ObjectToString(_varindeterminate));
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 };
 //BA.debugLineNum = 192;BA.debugLine="Dim pp As String = $\"${ID}Indeterminate\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Indeterminate");
 //BA.debugLineNum = 193;BA.debugLine="vue.SetStateSingle(pp, varIndeterminate)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varindeterminate));
 //BA.debugLineNum = 194;BA.debugLine="SimpleCheckBox.Bind(\":indeterminate\", pp)";
_simplecheckbox._bind /*b4j.example.vmelement*/ (":indeterminate",_pp);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setindeterminateicon(String _varindeterminateicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 199;BA.debugLine="Sub SetIndeterminateIcon(varIndeterminateIcon As S";
 //BA.debugLineNum = 200;BA.debugLine="If varIndeterminateIcon = \"\" Then Return Me";
if ((_varindeterminateicon).equals("")) { 
if (true) return (b4j.example.vmsimplecheckbox)(this);};
 //BA.debugLineNum = 201;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 202;BA.debugLine="SetAttrSingle(\"indeterminate-icon\", varIndetermi";
_setattrsingle("indeterminate-icon",_varindeterminateicon);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 };
 //BA.debugLineNum = 205;BA.debugLine="Dim pp As String = $\"${ID}IndeterminateIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"IndeterminateIcon");
 //BA.debugLineNum = 206;BA.debugLine="vue.SetStateSingle(pp, varIndeterminateIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varindeterminateicon));
 //BA.debugLineNum = 207;BA.debugLine="SimpleCheckBox.Bind(\":indeterminate-icon\", pp)";
_simplecheckbox._bind /*b4j.example.vmelement*/ (":indeterminate-icon",_pp);
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 212;BA.debugLine="Sub SetLight(varLight As Boolean) As VMSimpleCheck";
 //BA.debugLineNum = 213;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmsimplecheckbox)(this);};
 //BA.debugLineNum = 214;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 215;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 };
 //BA.debugLineNum = 218;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 219;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 220;BA.debugLine="SimpleCheckBox.Bind(\":light\", pp)";
_simplecheckbox._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub SetMarginAll(p As String) As VMSimpleCheckBox";
 //BA.debugLineNum = 311;BA.debugLine="SimpleCheckBox.setmarginall(p)";
_simplecheckbox._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 328;BA.debugLine="SimpleCheckBox.SetName(varName, bbind)";
_simplecheckbox._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setofficon(String _varofficon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 225;BA.debugLine="Sub SetOffIcon(varOffIcon As String) As VMSimpleCh";
 //BA.debugLineNum = 226;BA.debugLine="If varOffIcon = \"\" Then Return Me";
if ((_varofficon).equals("")) { 
if (true) return (b4j.example.vmsimplecheckbox)(this);};
 //BA.debugLineNum = 227;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 228;BA.debugLine="SetAttrSingle(\"off-icon\", varOffIcon)";
_setattrsingle("off-icon",_varofficon);
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 };
 //BA.debugLineNum = 231;BA.debugLine="Dim pp As String = $\"${ID}OffIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"OffIcon");
 //BA.debugLineNum = 232;BA.debugLine="vue.SetStateSingle(pp, varOffIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varofficon));
 //BA.debugLineNum = 233;BA.debugLine="SimpleCheckBox.Bind(\":off-icon\", pp)";
_simplecheckbox._bind /*b4j.example.vmelement*/ (":off-icon",_pp);
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 258;BA.debugLine="Sub SetOnClick(methodName As String) As VMSimpleCh";
 //BA.debugLineNum = 259;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 260;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmsimplecheckbox)(this);};
 //BA.debugLineNum = 261;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 262;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 263;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 265;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub SetPaddingAll(p As String) As VMSimpleCheckBox";
 //BA.debugLineNum = 306;BA.debugLine="SimpleCheckBox.SetPaddingAll(p)";
_simplecheckbox._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMSim";
 //BA.debugLineNum = 43;BA.debugLine="SimpleCheckBox.SetRC(sRow, sCol)";
_simplecheckbox._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setripple(boolean _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 238;BA.debugLine="Sub SetRipple(varRipple As Boolean) As VMSimpleChe";
 //BA.debugLineNum = 239;BA.debugLine="If varRipple = False Then Return Me";
if (_varripple==__c.False) { 
if (true) return (b4j.example.vmsimplecheckbox)(this);};
 //BA.debugLineNum = 240;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 241;BA.debugLine="SetAttrSingle(\"ripple\", varRipple)";
_setattrsingle("ripple",BA.ObjectToString(_varripple));
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 };
 //BA.debugLineNum = 244;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 245;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varripple));
 //BA.debugLineNum = 246;BA.debugLine="SimpleCheckBox.Bind(\":ripple\", pp)";
_simplecheckbox._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetStatic(b As Boolean) As VMSimpleCheckBox";
 //BA.debugLineNum = 35;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 36;BA.debugLine="SimpleCheckBox.SetStatic(b)";
_simplecheckbox._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub SetStyle(sm As Map) As VMSimpleCheckBox";
 //BA.debugLineNum = 142;BA.debugLine="SimpleCheckBox.SetStyle(sm)";
_simplecheckbox._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 334;BA.debugLine="SimpleCheckBox.SetStyleSingle(prop, value)";
_simplecheckbox._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetTabIndex(ti As String) As VMSimpleCheckBox";
 //BA.debugLineNum = 322;BA.debugLine="SimpleCheckBox.SetTabIndex(ti)";
_simplecheckbox._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetText(t As Object) As VMSimpleCheckBox";
 //BA.debugLineNum = 119;BA.debugLine="SimpleCheckBox.SetText(t)";
_simplecheckbox._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 360;BA.debugLine="Sub SetTextColor(varColor As String) As VMSimpleCh";
 //BA.debugLineNum = 361;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 362;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 367;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 368;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 369;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 370;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 371;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setvalue(boolean _varvalue) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetValue(varValue As Boolean) As VMSimpleCheck";
 //BA.debugLineNum = 252;BA.debugLine="SimpleCheckBox.SetValue(varValue, False)";
_simplecheckbox._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 253;BA.debugLine="vue.SetData(vmodel, varValue)";
_vue._setdata /*b4j.example.bananovue*/ (_vmodel,(Object)(_varvalue));
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetVIf(vif As String) As VMSimpleCheckBox";
 //BA.debugLineNum = 96;BA.debugLine="SimpleCheckBox.SetVIf(vif)";
_simplecheckbox._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub SetVisible(b As Boolean) As VMSimpleCheckBox";
 //BA.debugLineNum = 355;BA.debugLine="SimpleCheckBox.SetVisible(b)";
_simplecheckbox._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub SetVModel(k As String) As VMSimpleCheckBox";
 //BA.debugLineNum = 90;BA.debugLine="SimpleCheckBox.SetVModel(k)";
_simplecheckbox._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 91;BA.debugLine="vmodel = k.tolowercase";
_vmodel = _k.toLowerCase();
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub SetVShow(vif As String) As VMSimpleCheckBox";
 //BA.debugLineNum = 101;BA.debugLine="SimpleCheckBox.SetVShow(vif)";
_simplecheckbox._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsimplecheckbox  _show() throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Sub Show As VMSimpleCheckBox";
 //BA.debugLineNum = 276;BA.debugLine="SimpleCheckBox.SetVisible(True)";
_simplecheckbox._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 277;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsimplecheckbox)(this);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 79;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 80;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 81;BA.debugLine="Dim eName As String = $\"${ID}_click\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 82;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 83;BA.debugLine="Log($\"VMSimpleCheckBox.${eName} event has not be";
__c.Log(("VMSimpleCheckBox."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 86;BA.debugLine="Return SimpleCheckBox.ToString";
if (true) return _simplecheckbox._tostring /*String*/ ();
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
