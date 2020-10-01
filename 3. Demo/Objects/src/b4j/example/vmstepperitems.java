package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmstepperitems extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmstepperitems", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmstepperitems.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _stepperitems = null;
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
public b4j.example.vmstepperitems  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 69;BA.debugLine="Sub AddChild(child As VMElement) As VMStepperItems";
 //BA.debugLineNum = 70;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 71;BA.debugLine="StepperItems.SetText(childHTML)";
_stepperitems._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 105;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 106;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 107;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepperitems  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub AddClass(c As String) As VMStepperItems";
 //BA.debugLineNum = 88;BA.debugLine="StepperItems.AddClass(c)";
_stepperitems._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _addcomponent(String _scomp) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub AddComponent(scomp As String) As VMStepperItem";
 //BA.debugLineNum = 38;BA.debugLine="SetText(scomp)";
_settext((Object)(_scomp));
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 139;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 140;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 212;BA.debugLine="StepperItems.BindStyleSingle(prop, value)";
_stepperitems._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 250;BA.debugLine="StepperItems.BuildModel(mprops, mstyles, lclasses,";
_stepperitems._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 251;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public StepperItems As VMElement";
_stepperitems = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean    'ignore";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepperitems  _disable() throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub Disable As VMStepperItems";
 //BA.debugLineNum = 132;BA.debugLine="StepperItems.Disable(True)";
_stepperitems._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _enable() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub Enable As VMStepperItems";
 //BA.debugLineNum = 126;BA.debugLine="StepperItems.Enable(True)";
_stepperitems._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _hide() throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub Hide As VMStepperItems";
 //BA.debugLineNum = 114;BA.debugLine="StepperItems.SetVisible(False)";
_stepperitems._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="StepperItems.Initialize(v, ID).SetTag(\"v-stepper-";
_stepperitems._initialize /*b4j.example.vmelement*/ (ba,_v,_id)._settag /*b4j.example.vmelement*/ ("v-stepper-items");
 //BA.debugLineNum = 16;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 83;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepperitems  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="public Sub RemoveAttr(sName As String) As VMSteppe";
 //BA.debugLineNum = 163;BA.debugLine="StepperItems.RemoveAttr(sName)";
_stepperitems._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub Render";
 //BA.debugLineNum = 65;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepperitems  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetAttr(attr As Map) As VMStepperItems";
 //BA.debugLineNum = 94;BA.debugLine="StepperItems.SetAttr(attr)";
_stepperitems._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 227;BA.debugLine="Sub SetAttributes(attrs As List) As VMStepperItems";
 //BA.debugLineNum = 228;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 229;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetAttrLoose(loose As String) As VMStepperItem";
 //BA.debugLineNum = 146;BA.debugLine="StepperItems.SetAttrLoose(loose)";
_stepperitems._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 206;BA.debugLine="StepperItems.SetAttrSingle(prop, value)";
_stepperitems._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 24;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMStepperItems";
 //BA.debugLineNum = 181;BA.debugLine="StepperItems.SetDesignMode(b)";
_stepperitems._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 182;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub SetKey(k As String) As VMStepperItems";
 //BA.debugLineNum = 244;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 245;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetMarginAll(p As String) As VMStepperItems";
 //BA.debugLineNum = 175;BA.debugLine="StepperItems.setmarginall(p)";
_stepperitems._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 194;BA.debugLine="StepperItems.SetName(varName, bbind)";
_stepperitems._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetPaddingAll(p As String) As VMStepperItems";
 //BA.debugLineNum = 169;BA.debugLine="StepperItems.SetPaddingAll(p)";
_stepperitems._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetStatic(b As Boolean) As VMStepperItems";
 //BA.debugLineNum = 31;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 32;BA.debugLine="StepperItems.SetStatic(b)";
_stepperitems._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetStyle(sm As Map) As VMStepperItems";
 //BA.debugLineNum = 100;BA.debugLine="StepperItems.SetStyle(sm)";
_stepperitems._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 200;BA.debugLine="StepperItems.SetStyleSingle(prop, value)";
_stepperitems._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetTabIndex(ti As String) As VMStepperItems";
 //BA.debugLineNum = 188;BA.debugLine="StepperItems.SetTabIndex(ti)";
_stepperitems._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetText(t As Object) As VMStepperItems";
 //BA.debugLineNum = 77;BA.debugLine="StepperItems.SetText(t)";
_stepperitems._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 235;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 236;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 237;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 238;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 239;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetVhtml(vhtml As String) As VMStepperItems";
 //BA.debugLineNum = 223;BA.debugLine="StepperItems.SetVHtml(vhtml)";
_stepperitems._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetVIf(vif As String) As VMStepperItems";
 //BA.debugLineNum = 54;BA.debugLine="StepperItems.SetVIf(vif)";
_stepperitems._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 254;BA.debugLine="Sub SetVisible(b As Boolean) As VMStepperItems";
 //BA.debugLineNum = 255;BA.debugLine="StepperItems.SetVisible(b)";
_stepperitems._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetVModel(k As String) As VMStepperItems";
 //BA.debugLineNum = 49;BA.debugLine="StepperItems.SetVModel(k)";
_stepperitems._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetVShow(vif As String) As VMStepperItems";
 //BA.debugLineNum = 59;BA.debugLine="StepperItems.SetVShow(vif)";
_stepperitems._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetVText(vhtml As String) As VMStepperItems";
 //BA.debugLineNum = 218;BA.debugLine="StepperItems.SetVText(vhtml)";
_stepperitems._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepperitems  _show() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub Show As VMStepperItems";
 //BA.debugLineNum = 120;BA.debugLine="StepperItems.SetVisible(True)";
_stepperitems._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 45;BA.debugLine="Return StepperItems.ToString";
if (true) return _stepperitems._tostring /*String*/ ();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepperitems  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 151;BA.debugLine="Sub UseTheme(themeName As String) As VMStepperItem";
 //BA.debugLineNum = 152;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 153;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 154;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 155;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 156;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepperitems)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
