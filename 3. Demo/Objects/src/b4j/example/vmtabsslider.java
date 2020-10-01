package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtabsslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtabsslider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtabsslider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _tabsslider = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
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
public b4j.example.vmtabsslider  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 73;BA.debugLine="Sub AddChild(child As VMElement) As VMTabsSlider";
 //BA.debugLineNum = 74;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 75;BA.debugLine="TabsSlider.SetText(childHTML)";
_tabsslider._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 109;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 110;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 111;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsslider  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub AddClass(c As String) As VMTabsSlider";
 //BA.debugLineNum = 92;BA.debugLine="TabsSlider.AddClass(c)";
_tabsslider._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub AddComponent(comp As String) As VMTabsSlider";
 //BA.debugLineNum = 23;BA.debugLine="TabsSlider.SetText(comp)";
_tabsslider._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 147;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 148;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 198;BA.debugLine="TabsSlider.BuildModel(mprops, mstyles, lclasses, l";
_tabsslider._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TabsSlider As VMElement";
_tabsslider = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsslider  _disable() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub Disable As VMTabsSlider";
 //BA.debugLineNum = 140;BA.debugLine="TabsSlider.Disable(True)";
_tabsslider._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _enable() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub Enable As VMTabsSlider";
 //BA.debugLineNum = 135;BA.debugLine="TabsSlider.Enable(True)";
_tabsslider._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _hide() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub Hide As VMTabsSlider";
 //BA.debugLineNum = 125;BA.debugLine="TabsSlider.SetVisible(False)";
_tabsslider._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 14;BA.debugLine="TabsSlider.Initialize(v, ID)";
_tabsslider._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 15;BA.debugLine="TabsSlider.SetTag(\"v-tabs-slider\")";
_tabsslider._settag /*b4j.example.vmelement*/ ("v-tabs-slider");
 //BA.debugLineNum = 16;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 87;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsslider  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="public Sub RemoveAttr(sName As String) As VMTabsSl";
 //BA.debugLineNum = 154;BA.debugLine="TabsSlider.RemoveAttr(sName)";
_tabsslider._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Render";
 //BA.debugLineNum = 69;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsslider  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetAttr(attr as map) As VMTabsSlider";
 //BA.debugLineNum = 98;BA.debugLine="TabsSlider.SetAttr(attr)";
_tabsslider._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 32;BA.debugLine="Sub SetAttributes(attrs As List) As VMTabsSlider";
 //BA.debugLineNum = 33;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 34;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetAttrLoose(loose As String) As VMTabsSlider";
 //BA.debugLineNum = 28;BA.debugLine="TabsSlider.SetAttrLoose(loose)";
_tabsslider._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 193;BA.debugLine="TabsSlider.SetAttrSingle(prop, value)";
_tabsslider._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setcolor(Object _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 116;BA.debugLine="Sub SetColor(varColor As Object) As VMTabsSlider";
 //BA.debugLineNum = 117;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 118;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varcolor);
 //BA.debugLineNum = 119;BA.debugLine="TabsSlider.Bind(\":color\", pp)";
_tabsslider._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 40;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMTabsSlider";
 //BA.debugLineNum = 170;BA.debugLine="TabsSlider.SetDesignMode(b)";
_tabsslider._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 171;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetMarginAll(p As String) As VMTabsSlider";
 //BA.debugLineNum = 165;BA.debugLine="TabsSlider.setmarginall(p)";
_tabsslider._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 182;BA.debugLine="TabsSlider.SetName(varName, bbind)";
_tabsslider._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub SetPaddingAll(p As String) As VMTabsSlider";
 //BA.debugLineNum = 160;BA.debugLine="TabsSlider.SetPaddingAll(p)";
_tabsslider._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetStyle(sm As Map) As VMTabsSlider";
 //BA.debugLineNum = 104;BA.debugLine="TabsSlider.SetStyle(sm)";
_tabsslider._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 188;BA.debugLine="TabsSlider.SetStyleSingle(prop, value)";
_tabsslider._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub SetTabIndex(ti As String) As VMTabsSlider";
 //BA.debugLineNum = 176;BA.debugLine="TabsSlider.SetTabIndex(ti)";
_tabsslider._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 177;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetText(t As Object) As VMTabsSlider";
 //BA.debugLineNum = 81;BA.debugLine="TabsSlider.SetText(t)";
_tabsslider._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 207;BA.debugLine="Sub SetTextColor(varColor As String) As VMTabsSlid";
 //BA.debugLineNum = 208;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 209;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 214;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 215;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 216;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 217;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 218;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetVIf(vif As String) As VMTabsSlider";
 //BA.debugLineNum = 58;BA.debugLine="TabsSlider.SetVIf(vif)";
_tabsslider._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub SetVisible(b As Boolean) As VMTabsSlider";
 //BA.debugLineNum = 202;BA.debugLine="TabsSlider.SetVisible(b)";
_tabsslider._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetVModel(k As String) As VMTabsSlider";
 //BA.debugLineNum = 53;BA.debugLine="TabsSlider.SetVModel(k)";
_tabsslider._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetVShow(vif As String) As VMTabsSlider";
 //BA.debugLineNum = 63;BA.debugLine="TabsSlider.SetVShow(vif)";
_tabsslider._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsslider  _show() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub Show As VMTabsSlider";
 //BA.debugLineNum = 130;BA.debugLine="TabsSlider.SetVisible(True)";
_tabsslider._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsslider)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 49;BA.debugLine="Return TabsSlider.ToString";
if (true) return _tabsslider._tostring /*String*/ ();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
