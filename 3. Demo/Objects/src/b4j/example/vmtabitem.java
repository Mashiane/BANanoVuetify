package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtabitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtabitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtabitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _tabitem = null;
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
public b4j.example.vmtabitem  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 89;BA.debugLine="Sub AddChild(child As VMElement) As VMTabItem";
 //BA.debugLineNum = 90;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 91;BA.debugLine="TabItem.SetText(childHTML)";
_tabitem._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 125;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 126;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 127;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabitem  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub AddClass(c As String) As VMTabItem";
 //BA.debugLineNum = 108;BA.debugLine="TabItem.AddClass(c)";
_tabitem._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub AddComponent(comp As String) As VMTabItem";
 //BA.debugLineNum = 47;BA.debugLine="TabItem.SetText(comp)";
_tabitem._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 219;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 220;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 221;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 270;BA.debugLine="TabItem.BuildModel(mprops, mstyles, lclasses, loos";
_tabitem._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TabItem As VMElement";
_tabitem = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabitem  _disable() throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub Disable As VMTabItem";
 //BA.debugLineNum = 212;BA.debugLine="TabItem.Disable(True)";
_tabitem._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _enable() throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub Enable As VMTabItem";
 //BA.debugLineNum = 207;BA.debugLine="TabItem.Enable(True)";
_tabitem._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _hide() throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub Hide As VMTabItem";
 //BA.debugLineNum = 197;BA.debugLine="TabItem.SetVisible(False)";
_tabitem._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="TabItem.Initialize(v, ID)";
_tabitem._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="TabItem.SetTag(\"v-tab-item\")";
_tabitem._settag /*b4j.example.vmelement*/ ("v-tab-item");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="SetAttrSingle(\"key\", ID)";
_setattrsingle("key",_id);
 //BA.debugLineNum = 21;BA.debugLine="TabItem.SetValue(ID, False)";
_tabitem._setvalue /*b4j.example.vmelement*/ (_id,__c.False);
 //BA.debugLineNum = 22;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 103;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabitem  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="public Sub RemoveAttr(sName As String) As VMTabIte";
 //BA.debugLineNum = 226;BA.debugLine="TabItem.RemoveAttr(sName)";
_tabitem._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub Render";
 //BA.debugLineNum = 85;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabitem  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 132;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 133;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmtabitem)(this);};
 //BA.debugLineNum = 134;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 135;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 };
 //BA.debugLineNum = 138;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 139;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 140;BA.debugLine="TabItem.Bind(\":active-class\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetAttr(attr As Map) As VMTabItem";
 //BA.debugLineNum = 114;BA.debugLine="TabItem.SetAttr(attr)";
_tabitem._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 56;BA.debugLine="Sub SetAttributes(attrs As List) As VMTabItem";
 //BA.debugLineNum = 57;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 58;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub SetAttrLoose(loose As String) As VMTabItem";
 //BA.debugLineNum = 52;BA.debugLine="TabItem.SetAttrLoose(loose)";
_tabitem._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 265;BA.debugLine="TabItem.SetAttrSingle(prop, value)";
_tabitem._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 27;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMTabItem";
 //BA.debugLineNum = 242;BA.debugLine="TabItem.SetDesignMode(b)";
_tabitem._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 243;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMTabIt";
 //BA.debugLineNum = 146;BA.debugLine="TabItem.SetDisabled(varDisabled)";
_tabitem._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _seteager(boolean _vareager) throws Exception{
String _pp = "";
 //BA.debugLineNum = 151;BA.debugLine="Sub SetEager(varEager As Boolean) As VMTabItem";
 //BA.debugLineNum = 152;BA.debugLine="If varEager = False Then Return Me";
if (_vareager==__c.False) { 
if (true) return (b4j.example.vmtabitem)(this);};
 //BA.debugLineNum = 153;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 154;BA.debugLine="SetAttrSingle(\"eager\", varEager)";
_setattrsingle("eager",BA.ObjectToString(_vareager));
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 };
 //BA.debugLineNum = 157;BA.debugLine="Dim pp As String = $\"${ID}Eager\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Eager");
 //BA.debugLineNum = 158;BA.debugLine="vue.SetStateSingle(pp, varEager)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vareager));
 //BA.debugLineNum = 159;BA.debugLine="TabItem.Bind(\":eager\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":eager",_pp);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setkey(String _varkey) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetKey(varKey As String) As VMTabItem";
 //BA.debugLineNum = 35;BA.debugLine="If varKey = \"\" Then Return Me";
if ((_varkey).equals("")) { 
if (true) return (b4j.example.vmtabitem)(this);};
 //BA.debugLineNum = 36;BA.debugLine="SetAttrSingle(\"key\", varKey)";
_setattrsingle("key",_varkey);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub SetMarginAll(p As String) As VMTabItem";
 //BA.debugLineNum = 237;BA.debugLine="TabItem.setmarginall(p)";
_tabitem._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 238;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 254;BA.debugLine="TabItem.SetName(varName, bbind)";
_tabitem._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetPaddingAll(p As String) As VMTabItem";
 //BA.debugLineNum = 232;BA.debugLine="TabItem.SetPaddingAll(p)";
_tabitem._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setreversetransition(String _varreversetransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 164;BA.debugLine="Sub SetReverseTransition(varReverseTransition As S";
 //BA.debugLineNum = 165;BA.debugLine="If varReverseTransition = \"\" Then Return Me";
if ((_varreversetransition).equals("")) { 
if (true) return (b4j.example.vmtabitem)(this);};
 //BA.debugLineNum = 166;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 167;BA.debugLine="SetAttrSingle(\"reverse-transition\", varReverseTr";
_setattrsingle("reverse-transition",_varreversetransition);
 //BA.debugLineNum = 168;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 };
 //BA.debugLineNum = 170;BA.debugLine="Dim pp As String = $\"${ID}ReverseTransition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ReverseTransition");
 //BA.debugLineNum = 171;BA.debugLine="vue.SetStateSingle(pp, varReverseTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreversetransition));
 //BA.debugLineNum = 172;BA.debugLine="TabItem.Bind(\":reverse-transition\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":reverse-transition",_pp);
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetStatic(b As Boolean) As VMTabItem";
 //BA.debugLineNum = 41;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 42;BA.debugLine="TabItem.SetStatic(b)";
_tabitem._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetStyle(sm As Map) As VMTabItem";
 //BA.debugLineNum = 120;BA.debugLine="TabItem.SetStyle(sm)";
_tabitem._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 260;BA.debugLine="TabItem.SetStyleSingle(prop, value)";
_tabitem._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub SetTabIndex(ti As String) As VMTabItem";
 //BA.debugLineNum = 248;BA.debugLine="TabItem.SetTabIndex(ti)";
_tabitem._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub SetText(t As Object) As VMTabItem";
 //BA.debugLineNum = 97;BA.debugLine="TabItem.SetText(t)";
_tabitem._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _settransition(String _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 177;BA.debugLine="Sub SetTransition(varTransition As String) As VMTa";
 //BA.debugLineNum = 178;BA.debugLine="If varTransition = \"\" Then Return Me";
if ((_vartransition).equals("")) { 
if (true) return (b4j.example.vmtabitem)(this);};
 //BA.debugLineNum = 179;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 180;BA.debugLine="SetAttrSingle(\"transition\", varTransition)";
_setattrsingle("transition",_vartransition);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 };
 //BA.debugLineNum = 183;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 184;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartransition));
 //BA.debugLineNum = 185;BA.debugLine="TabItem.Bind(\":transition\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setvalue(String _varvalue) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetValue(varValue As String) As VMTabItem";
 //BA.debugLineNum = 191;BA.debugLine="TabItem.SetValue(varValue, False)";
_tabitem._setvalue /*b4j.example.vmelement*/ (_varvalue,__c.False);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetVIf(vif As String) As VMTabItem";
 //BA.debugLineNum = 74;BA.debugLine="TabItem.SetVIf(vif)";
_tabitem._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetVisible(b As Boolean) As VMTabItem";
 //BA.debugLineNum = 275;BA.debugLine="TabItem.SetVisible(b)";
_tabitem._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetVModel(k As String) As VMTabItem";
 //BA.debugLineNum = 69;BA.debugLine="TabItem.SetVModel(k)";
_tabitem._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetVShow(vif As String) As VMTabItem";
 //BA.debugLineNum = 79;BA.debugLine="TabItem.SetVShow(vif)";
_tabitem._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabitem  _show() throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Sub Show As VMTabItem";
 //BA.debugLineNum = 202;BA.debugLine="TabItem.SetVisible(True)";
_tabitem._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabitem)(this);
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 65;BA.debugLine="Return TabItem.ToString";
if (true) return _tabitem._tostring /*String*/ ();
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
