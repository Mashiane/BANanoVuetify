package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlistgroup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmlistgroup", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlistgroup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _listgroup = null;
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
public b4j.example.vmlistgroup  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 86;BA.debugLine="Sub AddChild(child As VMElement) As VMListGroup";
 //BA.debugLineNum = 87;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 88;BA.debugLine="ListGroup.SetText(childHTML)";
_listgroup._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 122;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 123;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 124;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistgroup  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub AddClass(c As String) As VMListGroup";
 //BA.debugLineNum = 105;BA.debugLine="ListGroup.AddClass(c)";
_listgroup._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub AddComponent(comp As String) As VMListGroup";
 //BA.debugLineNum = 32;BA.debugLine="SetText(comp)";
_settext((Object)(_comp));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 309;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 310;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 361;BA.debugLine="ListGroup.BuildModel(mprops, mstyles, lclasses, lo";
_listgroup._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ListGroup As VMElement";
_listgroup = new b4j.example.vmelement();
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
public b4j.example.vmlistgroup  _disable() throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub Disable As VMListGroup";
 //BA.debugLineNum = 302;BA.debugLine="ListGroup.Disable(True)";
_listgroup._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _enable() throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub Enable As VMListGroup";
 //BA.debugLineNum = 297;BA.debugLine="ListGroup.Enable(True)";
_listgroup._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _hide() throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub Hide As VMListGroup";
 //BA.debugLineNum = 287;BA.debugLine="ListGroup.SetVisible(False)";
_listgroup._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="ListGroup.Initialize(v, ID)";
_listgroup._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="ListGroup.SetTag(\"v-list-group\")";
_listgroup._settag /*b4j.example.vmelement*/ ("v-list-group");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 100;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistgroup  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="public Sub RemoveAttr(sName As String) As VMListGr";
 //BA.debugLineNum = 316;BA.debugLine="ListGroup.RemoveAttr(sName)";
_listgroup._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub Render";
 //BA.debugLineNum = 82;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistgroup  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 129;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 130;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmlistgroup)(this);};
 //BA.debugLineNum = 131;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 132;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 };
 //BA.debugLineNum = 135;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 136;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 137;BA.debugLine="ListGroup.Bind(\":active-class\", pp)";
_listgroup._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setappendicon(String _varappendicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 142;BA.debugLine="Sub SetAppendIcon(varAppendIcon As String) As VMLi";
 //BA.debugLineNum = 143;BA.debugLine="If varAppendIcon = \"\" Then Return Me";
if ((_varappendicon).equals("")) { 
if (true) return (b4j.example.vmlistgroup)(this);};
 //BA.debugLineNum = 144;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 145;BA.debugLine="SetAttrSingle(\"append-icon\", varAppendIcon)";
_setattrsingle("append-icon",_varappendicon);
 //BA.debugLineNum = 146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 };
 //BA.debugLineNum = 148;BA.debugLine="Dim pp As String = $\"${ID}AppendIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"AppendIcon");
 //BA.debugLineNum = 149;BA.debugLine="vue.SetStateSingle(pp, varAppendIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappendicon));
 //BA.debugLineNum = 150;BA.debugLine="ListGroup.Bind(\":append-icon\", pp)";
_listgroup._bind /*b4j.example.vmelement*/ (":append-icon",_pp);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub SetAttr(attr As Map) As VMListGroup";
 //BA.debugLineNum = 111;BA.debugLine="ListGroup.SetAttr(attr)";
_listgroup._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 36;BA.debugLine="Sub SetAttributes(attrs As List) As VMListGroup";
 //BA.debugLineNum = 37;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 38;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetAttrLoose(loose As String) As VMListGroup";
 //BA.debugLineNum = 51;BA.debugLine="ListGroup.SetAttrLoose(loose)";
_listgroup._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 355;BA.debugLine="ListGroup.SetAttrSingle(prop, value)";
_listgroup._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setcolor(String _varcolor) throws Exception{
String _pp = "";
 //BA.debugLineNum = 155;BA.debugLine="Sub SetColor(varColor As String) As VMListGroup";
 //BA.debugLineNum = 156;BA.debugLine="If varColor = \"\" Then Return Me";
if ((_varcolor).equals("")) { 
if (true) return (b4j.example.vmlistgroup)(this);};
 //BA.debugLineNum = 157;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 158;BA.debugLine="SetAttrSingle(\"color\", varColor)";
_setattrsingle("color",_varcolor);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 };
 //BA.debugLineNum = 161;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 162;BA.debugLine="vue.SetStateSingle(pp, varColor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varcolor));
 //BA.debugLineNum = 163;BA.debugLine="ListGroup.Bind(\":color\", pp)";
_listgroup._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 44;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMListGroup";
 //BA.debugLineNum = 332;BA.debugLine="ListGroup.SetDesignMode(b)";
_listgroup._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 333;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMListG";
 //BA.debugLineNum = 169;BA.debugLine="ListGroup.SetDisabled(varDisabled)";
_listgroup._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _seteager(boolean _vareager) throws Exception{
String _pp = "";
 //BA.debugLineNum = 174;BA.debugLine="Sub SetEager(varEager As Boolean) As VMListGroup";
 //BA.debugLineNum = 175;BA.debugLine="If varEager = False Then Return Me";
if (_vareager==__c.False) { 
if (true) return (b4j.example.vmlistgroup)(this);};
 //BA.debugLineNum = 176;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 177;BA.debugLine="SetAttrSingle(\"eager\", varEager)";
_setattrsingle("eager",BA.ObjectToString(_vareager));
 //BA.debugLineNum = 178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 };
 //BA.debugLineNum = 180;BA.debugLine="Dim pp As String = $\"${ID}Eager\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Eager");
 //BA.debugLineNum = 181;BA.debugLine="vue.SetStateSingle(pp, varEager)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareager));
 //BA.debugLineNum = 182;BA.debugLine="ListGroup.Bind(\":eager\", pp)";
_listgroup._bind /*b4j.example.vmelement*/ (":eager",_pp);
 //BA.debugLineNum = 183;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setgroup(String _vargroup) throws Exception{
String _pp = "";
 //BA.debugLineNum = 187;BA.debugLine="Sub SetGroup(varGroup As String) As VMListGroup";
 //BA.debugLineNum = 188;BA.debugLine="If varGroup = \"\" Then Return Me";
if ((_vargroup).equals("")) { 
if (true) return (b4j.example.vmlistgroup)(this);};
 //BA.debugLineNum = 189;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 190;BA.debugLine="SetAttrSingle(\"group\", varGroup)";
_setattrsingle("group",_vargroup);
 };
 //BA.debugLineNum = 192;BA.debugLine="Dim pp As String = $\"${ID}Group\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Group");
 //BA.debugLineNum = 193;BA.debugLine="vue.SetStateSingle(pp, varGroup)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vargroup));
 //BA.debugLineNum = 194;BA.debugLine="ListGroup.Bind(\":group\", pp)";
_listgroup._bind /*b4j.example.vmelement*/ (":group",_pp);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetMarginAll(p As String) As VMListGroup";
 //BA.debugLineNum = 327;BA.debugLine="ListGroup.setmarginall(p)";
_listgroup._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 344;BA.debugLine="ListGroup.SetName(varName, bbind)";
_listgroup._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setnoaction(boolean _varnoaction) throws Exception{
String _pp = "";
 //BA.debugLineNum = 199;BA.debugLine="Sub SetNoAction(varNoAction As Boolean) As VMListG";
 //BA.debugLineNum = 200;BA.debugLine="If varNoAction = False Then Return Me";
if (_varnoaction==__c.False) { 
if (true) return (b4j.example.vmlistgroup)(this);};
 //BA.debugLineNum = 201;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 202;BA.debugLine="SetAttrSingle(\"no-action\", varNoAction)";
_setattrsingle("no-action",BA.ObjectToString(_varnoaction));
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 };
 //BA.debugLineNum = 205;BA.debugLine="Dim pp As String = $\"${ID}NoAction\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"NoAction");
 //BA.debugLineNum = 206;BA.debugLine="vue.SetStateSingle(pp, varNoAction)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnoaction));
 //BA.debugLineNum = 207;BA.debugLine="ListGroup.Bind(\":no-action\", pp)";
_listgroup._bind /*b4j.example.vmelement*/ (":no-action",_pp);
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 274;BA.debugLine="Sub SetOnClick(methodName As String) As VMListGrou";
 //BA.debugLineNum = 275;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 276;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmlistgroup)(this);};
 //BA.debugLineNum = 277;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 278;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 279;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 281;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetPaddingAll(p As String) As VMListGroup";
 //BA.debugLineNum = 322;BA.debugLine="ListGroup.SetPaddingAll(p)";
_listgroup._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 323;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setprependicon(String _varprependicon) throws Exception{
String _pp = "";
 //BA.debugLineNum = 212;BA.debugLine="Sub SetPrependIcon(varPrependIcon As String) As VM";
 //BA.debugLineNum = 213;BA.debugLine="If varPrependIcon = \"\" Then Return Me";
if ((_varprependicon).equals("")) { 
if (true) return (b4j.example.vmlistgroup)(this);};
 //BA.debugLineNum = 214;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 215;BA.debugLine="SetAttrSingle(\"prepend-icon\", varPrependIcon)";
_setattrsingle("prepend-icon",_varprependicon);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 };
 //BA.debugLineNum = 218;BA.debugLine="Dim pp As String = $\"${ID}PrependIcon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"PrependIcon");
 //BA.debugLineNum = 219;BA.debugLine="vue.SetStateSingle(pp, varPrependIcon)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varprependicon));
 //BA.debugLineNum = 220;BA.debugLine="ListGroup.Bind(\":prepend-icon\", pp)";
_listgroup._bind /*b4j.example.vmelement*/ (":prepend-icon",_pp);
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setripple(boolean _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 225;BA.debugLine="Sub SetRipple(varRipple As Boolean) As VMListGroup";
 //BA.debugLineNum = 226;BA.debugLine="If varRipple Then Return Me";
if (_varripple) { 
if (true) return (b4j.example.vmlistgroup)(this);};
 //BA.debugLineNum = 227;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 228;BA.debugLine="SetAttrSingle(\"ripple\", varRipple)";
_setattrsingle("ripple",BA.ObjectToString(_varripple));
 //BA.debugLineNum = 229;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 };
 //BA.debugLineNum = 231;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 232;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varripple));
 //BA.debugLineNum = 233;BA.debugLine="ListGroup.Bind(\":ripple\", pp)";
_listgroup._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setslotactivator(boolean _b) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub SetSlotActivator(b As Boolean) As VMListGroup";
 //BA.debugLineNum = 257;BA.debugLine="SetAttr(CreateMap(\"slot\": \"activator\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("activator")}));
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setslotappendicon(boolean _b) throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub SetSlotAppendIcon(b As Boolean) As VMListGroup";
 //BA.debugLineNum = 263;BA.debugLine="SetAttr(CreateMap(\"slot\": \"append-icon\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("append-icon")}));
 //BA.debugLineNum = 264;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setslotprependicon(boolean _b) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub SetSlotPrependIcon(b As Boolean) As VMListGrou";
 //BA.debugLineNum = 269;BA.debugLine="SetAttr(CreateMap(\"slot\": \"prepend-icon\"))";
_setattr(__c.createMap(new Object[] {(Object)("slot"),(Object)("prepend-icon")}));
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetStatic(b As Boolean) As VMListGroup";
 //BA.debugLineNum = 25;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 26;BA.debugLine="ListGroup.SetStatic(b)";
_listgroup._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub SetStyle(sm As Map) As VMListGroup";
 //BA.debugLineNum = 117;BA.debugLine="ListGroup.SetStyle(sm)";
_listgroup._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 350;BA.debugLine="ListGroup.SetStyleSingle(prop, value)";
_listgroup._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setsubgroup(boolean _varsubgroup) throws Exception{
String _pp = "";
 //BA.debugLineNum = 238;BA.debugLine="Sub SetSubGroup(varSubGroup As Boolean) As VMListG";
 //BA.debugLineNum = 239;BA.debugLine="If varSubGroup = False Then Return Me";
if (_varsubgroup==__c.False) { 
if (true) return (b4j.example.vmlistgroup)(this);};
 //BA.debugLineNum = 240;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 241;BA.debugLine="SetAttrSingle(\"sub-group\", varSubGroup)";
_setattrsingle("sub-group",BA.ObjectToString(_varsubgroup));
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 };
 //BA.debugLineNum = 244;BA.debugLine="Dim pp As String = $\"${ID}SubGroup\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"SubGroup");
 //BA.debugLineNum = 245;BA.debugLine="vue.SetStateSingle(pp, varSubGroup)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varsubgroup));
 //BA.debugLineNum = 246;BA.debugLine="ListGroup.Bind(\":sub-group\", pp)";
_listgroup._bind /*b4j.example.vmelement*/ (":sub-group",_pp);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetTabIndex(ti As String) As VMListGroup";
 //BA.debugLineNum = 338;BA.debugLine="ListGroup.SetTabIndex(ti)";
_listgroup._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetText(t As Object) As VMListGroup";
 //BA.debugLineNum = 94;BA.debugLine="ListGroup.SetText(t)";
_listgroup._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 370;BA.debugLine="Sub SetTextColor(varColor As String) As VMListGrou";
 //BA.debugLineNum = 371;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 372;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 377;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 378;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 379;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 380;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 381;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetValue(varValue As String) As VMListGroup";
 //BA.debugLineNum = 252;BA.debugLine="ListGroup.SetValue(varValue, False)";
_listgroup._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setvelseif(Object _t) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetVElseIf(t As Object) As VMListGroup";
 //BA.debugLineNum = 71;BA.debugLine="ListGroup.Setvelseif(t)";
_listgroup._setvelseif /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetVIf(vif As String) As VMListGroup";
 //BA.debugLineNum = 66;BA.debugLine="ListGroup.SetVIf(vif)";
_listgroup._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub SetVisible(b As Boolean) As VMListGroup";
 //BA.debugLineNum = 365;BA.debugLine="ListGroup.SetVisible(b)";
_listgroup._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetVModel(k As String) As VMListGroup";
 //BA.debugLineNum = 61;BA.debugLine="ListGroup.SetVModel(k)";
_listgroup._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetVShow(vif As String) As VMListGroup";
 //BA.debugLineNum = 76;BA.debugLine="ListGroup.SetVShow(vif)";
_listgroup._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistgroup  _show() throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub Show As VMListGroup";
 //BA.debugLineNum = 292;BA.debugLine="ListGroup.SetVisible(True)";
_listgroup._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistgroup)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 57;BA.debugLine="Return ListGroup.ToString";
if (true) return _listgroup._tostring /*String*/ ();
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
