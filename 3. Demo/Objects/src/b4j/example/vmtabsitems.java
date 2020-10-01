package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtabsitems extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtabsitems", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtabsitems.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _tabsitems = null;
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
public b4j.example.vmtabsitems  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 88;BA.debugLine="Sub AddChild(child As VMElement) As VMTabsItems";
 //BA.debugLineNum = 89;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 90;BA.debugLine="TabsItems.SetText(childHTML)";
_tabsitems._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 124;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 125;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 126;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsitems  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub AddClass(c As String) As VMTabsItems";
 //BA.debugLineNum = 107;BA.debugLine="TabsItems.AddClass(c)";
_tabsitems._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub AddComponent(comp As String) As VMTabsItems";
 //BA.debugLineNum = 32;BA.debugLine="TabsItems.SetText(comp)";
_tabsitems._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 362;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 363;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 413;BA.debugLine="TabsItems.BuildModel(mprops, mstyles, lclasses, lo";
_tabsitems._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TabsItems As VMElement";
_tabsitems = new b4j.example.vmelement();
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
public b4j.example.vmtabsitems  _disable() throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub Disable As VMTabsItems";
 //BA.debugLineNum = 355;BA.debugLine="TabsItems.Disable(True)";
_tabsitems._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _enable() throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub Enable As VMTabsItems";
 //BA.debugLineNum = 350;BA.debugLine="TabsItems.Enable(True)";
_tabsitems._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _hide() throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Sub Hide As VMTabsItems";
 //BA.debugLineNum = 340;BA.debugLine="TabsItems.SetVisible(False)";
_tabsitems._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="TabsItems.Initialize(v, ID)";
_tabsitems._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="TabsItems.SetTag(\"v-tabs-items\")";
_tabsitems._settag /*b4j.example.vmelement*/ ("v-tabs-items");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="SetOnChange($\"${ID}_change\"$)";
_setonchange((""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 102;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsitems  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="public Sub RemoveAttr(sName As String) As VMTabsIt";
 //BA.debugLineNum = 369;BA.debugLine="TabsItems.RemoveAttr(sName)";
_tabsitems._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub Render";
 //BA.debugLineNum = 84;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsitems  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 131;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 132;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 133;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 134;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 137;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 138;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 139;BA.debugLine="TabsItems.Bind(\":active-class\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetAttr(attr As Map) As VMTabsItems";
 //BA.debugLineNum = 113;BA.debugLine="TabsItems.SetAttr(attr)";
_tabsitems._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 49;BA.debugLine="Sub SetAttributes(attrs As List) As VMTabsItems";
 //BA.debugLineNum = 50;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 51;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetAttrLoose(loose As String) As VMTabsItems";
 //BA.debugLineNum = 44;BA.debugLine="TabsItems.SetAttrLoose(loose)";
_tabsitems._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 408;BA.debugLine="TabsItems.SetAttrSingle(prop, value)";
_tabsitems._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setcontinuous(boolean _varcontinuous) throws Exception{
String _pp = "";
 //BA.debugLineNum = 144;BA.debugLine="Sub SetContinuous(varContinuous As Boolean) As VMT";
 //BA.debugLineNum = 145;BA.debugLine="If varContinuous = False Then Return Me";
if (_varcontinuous==__c.False) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 146;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 147;BA.debugLine="SetAttrSingle(\"continuous\",varContinuous)";
_setattrsingle("continuous",BA.ObjectToString(_varcontinuous));
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 150;BA.debugLine="Dim pp As String = $\"${ID}Continuous\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Continuous");
 //BA.debugLineNum = 151;BA.debugLine="vue.SetStateSingle(pp, varContinuous)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcontinuous));
 //BA.debugLineNum = 152;BA.debugLine="TabsItems.Bind(\":continuous\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":continuous",_pp);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 157;BA.debugLine="Sub SetDark(varDark As Boolean) As VMTabsItems";
 //BA.debugLineNum = 158;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 159;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 160;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 161;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 163;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 164;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 165;BA.debugLine="TabsItems.Bind(\":dark\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 37;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMTabsItems";
 //BA.debugLineNum = 385;BA.debugLine="TabsItems.SetDesignMode(b)";
_tabsitems._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 386;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 170;BA.debugLine="Sub SetLight(varLight As Boolean) As VMTabsItems";
 //BA.debugLineNum = 171;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 172;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 173;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 176;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 177;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 178;BA.debugLine="TabsItems.Bind(\":light\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setmandatory(boolean _varmandatory) throws Exception{
String _pp = "";
 //BA.debugLineNum = 183;BA.debugLine="Sub SetMandatory(varMandatory As Boolean) As VMTab";
 //BA.debugLineNum = 184;BA.debugLine="If varMandatory = False Then Return Me";
if (_varmandatory==__c.False) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 185;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 186;BA.debugLine="SetAttrSingle(\"mandatory\", varMandatory)";
_setattrsingle("mandatory",BA.ObjectToString(_varmandatory));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 189;BA.debugLine="Dim pp As String = $\"${ID}Mandatory\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Mandatory");
 //BA.debugLineNum = 190;BA.debugLine="vue.SetStateSingle(pp, varMandatory)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmandatory));
 //BA.debugLineNum = 191;BA.debugLine="TabsItems.Bind(\":mandatory\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":mandatory",_pp);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub SetMarginAll(p As String) As VMTabsItems";
 //BA.debugLineNum = 380;BA.debugLine="TabsItems.setmarginall(p)";
_tabsitems._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setmax(String _varmax) throws Exception{
String _pp = "";
 //BA.debugLineNum = 196;BA.debugLine="Sub SetMax(varMax As String) As VMTabsItems";
 //BA.debugLineNum = 197;BA.debugLine="If varMax = \"\" Then Return Me";
if ((_varmax).equals("")) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 198;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 199;BA.debugLine="SetAttrSingle(\"max\", varMax)";
_setattrsingle("max",_varmax);
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 202;BA.debugLine="Dim pp As String = $\"${ID}Max\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Max");
 //BA.debugLineNum = 203;BA.debugLine="vue.SetStateSingle(pp, varMax)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmax));
 //BA.debugLineNum = 204;BA.debugLine="TabsItems.Bind(\":max\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":max",_pp);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setmultiple(boolean _varmultiple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 209;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMTabsI";
 //BA.debugLineNum = 210;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 211;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 212;BA.debugLine="SetAttrSingle(\"multiple\", varMultiple)";
_setattrsingle("multiple",BA.ObjectToString(_varmultiple));
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 215;BA.debugLine="Dim pp As String = $\"${ID}Multiple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Multiple");
 //BA.debugLineNum = 216;BA.debugLine="vue.SetStateSingle(pp, varMultiple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varmultiple));
 //BA.debugLineNum = 217;BA.debugLine="TabsItems.Bind(\":multiple\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":multiple",_pp);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 397;BA.debugLine="TabsItems.SetName(varName, bbind)";
_tabsitems._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setnexticon(String _varnexticon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 222;BA.debugLine="Sub SetNextIcon(varNextIcon As String) As VMTabsIt";
 //BA.debugLineNum = 223;BA.debugLine="If varNextIcon = \"\" Then Return Me";
if ((_varnexticon).equals("")) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 224;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 225;BA.debugLine="SetAttrSingle(\"next-icon\", varNextIcon)";
_setattrsingle("next-icon",_varnexticon);
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 228;BA.debugLine="Dim pp As String = $\"${ID}NextIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NextIcon");
 //BA.debugLineNum = 229;BA.debugLine="vue.SetStateSingle(pp, varNextIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnexticon));
 //BA.debugLineNum = 230;BA.debugLine="TabsItems.Bind(\":next-icon\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":next-icon",_pp);
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setonchange(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 327;BA.debugLine="Sub SetOnChange(methodName As String) As VMTabsIte";
 //BA.debugLineNum = 328;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 329;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 330;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 331;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 332;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 334;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetPaddingAll(p As String) As VMTabsItems";
 //BA.debugLineNum = 375;BA.debugLine="TabsItems.SetPaddingAll(p)";
_tabsitems._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setprevicon(String _varprevicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 235;BA.debugLine="Sub SetPrevIcon(varPrevIcon As String) As VMTabsIt";
 //BA.debugLineNum = 236;BA.debugLine="If varPrevIcon = \"\" Then Return Me";
if ((_varprevicon).equals("")) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 237;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 238;BA.debugLine="SetAttrSingle(\"prev-icon\", varPrevIcon)";
_setattrsingle("prev-icon",_varprevicon);
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 241;BA.debugLine="Dim pp As String = $\"${ID}PrevIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrevIcon");
 //BA.debugLineNum = 242;BA.debugLine="vue.SetStateSingle(pp, varPrevIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprevicon));
 //BA.debugLineNum = 243;BA.debugLine="TabsItems.Bind(\":prev-icon\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":prev-icon",_pp);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setreverse(boolean _varreverse) throws Exception{
String _pp = "";
 //BA.debugLineNum = 248;BA.debugLine="Sub SetReverse(varReverse As Boolean) As VMTabsIte";
 //BA.debugLineNum = 249;BA.debugLine="If varReverse = False Then Return Me";
if (_varreverse==__c.False) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 250;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 251;BA.debugLine="SetAttrSingle(\"reverse\", varReverse)";
_setattrsingle("reverse",BA.ObjectToString(_varreverse));
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 254;BA.debugLine="Dim pp As String = $\"${ID}Reverse\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Reverse");
 //BA.debugLineNum = 255;BA.debugLine="vue.SetStateSingle(pp, varReverse)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreverse));
 //BA.debugLineNum = 256;BA.debugLine="TabsItems.Bind(\":reverse\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":reverse",_pp);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setshowarrows(boolean _varshowarows) throws Exception{
String _pp = "";
 //BA.debugLineNum = 261;BA.debugLine="Sub SetShowArrows(varShowArows As Boolean) As VMTa";
 //BA.debugLineNum = 262;BA.debugLine="If varShowArows = False Then Return Me";
if (_varshowarows==__c.False) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 263;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 264;BA.debugLine="SetAttrSingle(\"show-arrows\", varShowArows)";
_setattrsingle("show-arrows",BA.ObjectToString(_varshowarows));
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 267;BA.debugLine="Dim pp As String = $\"${ID}ShowArrows\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowArrows");
 //BA.debugLineNum = 268;BA.debugLine="vue.SetStateSingle(pp, varShowArows)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowarows));
 //BA.debugLineNum = 269;BA.debugLine="TabsItems.Bind(\":show-arrows\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":show-arrows",_pp);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setshowarrowsonhover(boolean _varshowarrowsonhover) throws Exception{
String _pp = "";
 //BA.debugLineNum = 274;BA.debugLine="Sub SetShowArrowsOnHover(varShowArrowsOnHover As B";
 //BA.debugLineNum = 275;BA.debugLine="If varShowArrowsOnHover = False Then Return Me";
if (_varshowarrowsonhover==__c.False) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 276;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 277;BA.debugLine="SetAttrSingle(\"show-arrows-on-hover\", varShowArr";
_setattrsingle("show-arrows-on-hover",BA.ObjectToString(_varshowarrowsonhover));
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 280;BA.debugLine="Dim pp As String = $\"${ID}ShowArrowsOnHover\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ShowArrowsOnHover");
 //BA.debugLineNum = 281;BA.debugLine="vue.SetStateSingle(pp, varShowArrowsOnHover)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varshowarrowsonhover));
 //BA.debugLineNum = 282;BA.debugLine="TabsItems.Bind(\":show-arrows-on-hover\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":show-arrows-on-hover",_pp);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetStatic(b As Boolean) As VMTabsItems";
 //BA.debugLineNum = 26;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 27;BA.debugLine="TabsItems.SetStatic(b)";
_tabsitems._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetStyle(sm As Map) As VMTabsItems";
 //BA.debugLineNum = 119;BA.debugLine="TabsItems.SetStyle(sm)";
_tabsitems._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 402;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 403;BA.debugLine="TabsItems.SetStyleSingle(prop, value)";
_tabsitems._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 404;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Sub SetTabIndex(ti As String) As VMTabsItems";
 //BA.debugLineNum = 391;BA.debugLine="TabsItems.SetTabIndex(ti)";
_tabsitems._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 392;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetText(t As Object) As VMTabsItems";
 //BA.debugLineNum = 96;BA.debugLine="TabsItems.SetText(t)";
_tabsitems._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 422;BA.debugLine="Sub SetTextColor(varColor As String) As VMTabsItem";
 //BA.debugLineNum = 423;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 424;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 425;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 429;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 430;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 431;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 432;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 433;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _settouch(Object _vartouch) throws Exception{
String _pp = "";
 //BA.debugLineNum = 287;BA.debugLine="Sub SetTouch(varTouch As Object) As VMTabsItems";
 //BA.debugLineNum = 288;BA.debugLine="Dim pp As String = $\"${ID}Touch\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Touch");
 //BA.debugLineNum = 289;BA.debugLine="vue.SetStateSingle(pp, varTouch)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartouch);
 //BA.debugLineNum = 290;BA.debugLine="TabsItems.Bind(\":touch\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":touch",_pp);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _settouchless(boolean _vartouchless) throws Exception{
String _pp = "";
 //BA.debugLineNum = 295;BA.debugLine="Sub SetTouchless(varTouchless As Boolean) As VMTab";
 //BA.debugLineNum = 296;BA.debugLine="If varTouchless = False Then Return Me";
if (_vartouchless==__c.False) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 297;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 298;BA.debugLine="SetAttrSingle(\"touchless\", varTouchless)";
_setattrsingle("touchless",BA.ObjectToString(_vartouchless));
 //BA.debugLineNum = 299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 301;BA.debugLine="Dim pp As String = $\"${ID}Touchless\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Touchless");
 //BA.debugLineNum = 302;BA.debugLine="vue.SetStateSingle(pp, varTouchless)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartouchless));
 //BA.debugLineNum = 303;BA.debugLine="TabsItems.Bind(\":touchless\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":touchless",_pp);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetValue(varValue As String) As VMTabsItems";
 //BA.debugLineNum = 309;BA.debugLine="TabsItems.SetValue(varValue, False)";
_tabsitems._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setvertical(boolean _varvertical) throws Exception{
String _pp = "";
 //BA.debugLineNum = 314;BA.debugLine="Sub SetVertical(varVertical As Boolean) As VMTabsI";
 //BA.debugLineNum = 315;BA.debugLine="If varVertical = False Then Return Me";
if (_varvertical==__c.False) { 
if (true) return (b4j.example.vmtabsitems)(this);};
 //BA.debugLineNum = 316;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 317;BA.debugLine="SetAttrSingle(\"vertical\", varVertical)";
_setattrsingle("vertical",BA.ObjectToString(_varvertical));
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 };
 //BA.debugLineNum = 320;BA.debugLine="Dim pp As String = $\"${ID}Vertical\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Vertical");
 //BA.debugLineNum = 321;BA.debugLine="vue.SetStateSingle(pp, varVertical)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvertical));
 //BA.debugLineNum = 322;BA.debugLine="TabsItems.Bind(\":vertical\", pp)";
_tabsitems._bind /*b4j.example.vmelement*/ (":vertical",_pp);
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SetVIf(vif As String) As VMTabsItems";
 //BA.debugLineNum = 73;BA.debugLine="TabsItems.SetVIf(vif)";
_tabsitems._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Sub SetVisible(b As Boolean) As VMTabsItems";
 //BA.debugLineNum = 417;BA.debugLine="TabsItems.SetVisible(b)";
_tabsitems._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetVModel(k As String) As VMTabsItems";
 //BA.debugLineNum = 68;BA.debugLine="TabsItems.SetVModel(k)";
_tabsitems._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub SetVShow(vif As String) As VMTabsItems";
 //BA.debugLineNum = 78;BA.debugLine="TabsItems.SetVShow(vif)";
_tabsitems._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitems  _show() throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub Show As VMTabsItems";
 //BA.debugLineNum = 345;BA.debugLine="TabsItems.SetVisible(True)";
_tabsitems._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitems)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 57;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 58;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 59;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 60;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 61;BA.debugLine="Log($\"VMTabsItems.${eName} event has not been de";
__c.Log(("VMTabsItems."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 64;BA.debugLine="Return TabsItems.ToString";
if (true) return _tabsitems._tostring /*String*/ ();
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
