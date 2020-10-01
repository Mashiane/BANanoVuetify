package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmsteppercontent extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmsteppercontent", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmsteppercontent.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _steppercontent = null;
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
public b4j.example.vmsteppercontent  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 80;BA.debugLine="Sub AddChild(child As VMElement) As VMStepperConte";
 //BA.debugLineNum = 81;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 82;BA.debugLine="StepperContent.SetText(childHTML)";
_steppercontent._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 116;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 117;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 118;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsteppercontent  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub AddClass(c As String) As VMStepperContent";
 //BA.debugLineNum = 99;BA.debugLine="StepperContent.AddClass(c)";
_steppercontent._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _addcomponent(String _scomp) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub AddComponent(scomp As String) As VMStepperCont";
 //BA.debugLineNum = 38;BA.debugLine="SetText(scomp)";
_settext((Object)(_scomp));
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 152;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 153;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 203;BA.debugLine="StepperContent.BuildModel(mprops, mstyles, lclasse";
_steppercontent._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public StepperContent As VMElement";
_steppercontent = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean   'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object  'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean   'ignore";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsteppercontent  _disable() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub Disable As VMStepperContent";
 //BA.debugLineNum = 145;BA.debugLine="StepperContent.Disable(True)";
_steppercontent._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _enable() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub Enable As VMStepperContent";
 //BA.debugLineNum = 140;BA.debugLine="StepperContent.Enable(True)";
_steppercontent._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _hide() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub Hide As VMStepperContent";
 //BA.debugLineNum = 130;BA.debugLine="StepperContent.SetVisible(False)";
_steppercontent._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="StepperContent.Initialize(v, ID)";
_steppercontent._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="StepperContent.SetTag(\"v-stepper-content\")";
_steppercontent._settag /*b4j.example.vmelement*/ ("v-stepper-content");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 94;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsteppercontent  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSteppe";
 //BA.debugLineNum = 159;BA.debugLine="StepperContent.RemoveAttr(sName)";
_steppercontent._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub Render";
 //BA.debugLineNum = 76;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsteppercontent  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetAttr(attr As Map) As VMStepperContent";
 //BA.debugLineNum = 105;BA.debugLine="StepperContent.SetAttr(attr)";
_steppercontent._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 47;BA.debugLine="Sub SetAttributes(attrs As List) As VMStepperConte";
 //BA.debugLineNum = 48;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 49;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetAttrLoose(loose As String) As VMStepperCont";
 //BA.debugLineNum = 43;BA.debugLine="StepperContent.SetAttrLoose(loose)";
_steppercontent._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 198;BA.debugLine="StepperContent.SetAttrSingle(prop, value)";
_steppercontent._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 25;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMStepperConten";
 //BA.debugLineNum = 175;BA.debugLine="StepperContent.SetDesignMode(b)";
_steppercontent._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 176;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetMarginAll(p As String) As VMStepperContent";
 //BA.debugLineNum = 170;BA.debugLine="StepperContent.setmarginall(p)";
_steppercontent._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 187;BA.debugLine="StepperContent.SetName(varName, bbind)";
_steppercontent._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetPaddingAll(p As String) As VMStepperContent";
 //BA.debugLineNum = 165;BA.debugLine="StepperContent.SetPaddingAll(p)";
_steppercontent._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetStatic(b As Boolean) As VMStepperContent";
 //BA.debugLineNum = 32;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 33;BA.debugLine="StepperContent.SetStatic(b)";
_steppercontent._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setstep(String _varstep) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetStep(varStep As String) As VMStepperContent";
 //BA.debugLineNum = 124;BA.debugLine="StepperContent.SetAttrSingle(\"step\", varStep)";
_steppercontent._setattrsingle /*b4j.example.vmelement*/ ("step",_varstep);
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetStyle(sm As Map) As VMStepperContent";
 //BA.debugLineNum = 111;BA.debugLine="StepperContent.SetStyle(sm)";
_steppercontent._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 193;BA.debugLine="StepperContent.SetStyleSingle(prop, value)";
_steppercontent._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetTabIndex(ti As String) As VMStepperContent";
 //BA.debugLineNum = 181;BA.debugLine="StepperContent.SetTabIndex(ti)";
_steppercontent._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetText(t As Object) As VMStepperContent";
 //BA.debugLineNum = 88;BA.debugLine="StepperContent.SetText(t)";
_steppercontent._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetVIf(vif As String) As VMStepperContent";
 //BA.debugLineNum = 65;BA.debugLine="StepperContent.SetVIf(vif)";
_steppercontent._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetVisible(b As Boolean) As VMStepperContent";
 //BA.debugLineNum = 208;BA.debugLine="StepperContent.SetVisible(b)";
_steppercontent._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 209;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetVModel(k As String) As VMStepperContent";
 //BA.debugLineNum = 60;BA.debugLine="StepperContent.SetVModel(k)";
_steppercontent._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetVShow(vif As String) As VMStepperContent";
 //BA.debugLineNum = 70;BA.debugLine="StepperContent.SetVShow(vif)";
_steppercontent._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppercontent  _show() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub Show As VMStepperContent";
 //BA.debugLineNum = 135;BA.debugLine="StepperContent.SetVisible(True)";
_steppercontent._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppercontent)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 56;BA.debugLine="Return StepperContent.ToString";
if (true) return _steppercontent._tostring /*String*/ ();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
