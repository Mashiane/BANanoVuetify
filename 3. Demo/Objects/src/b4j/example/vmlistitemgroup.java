package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlistitemgroup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmlistitemgroup", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlistitemgroup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _listitemgroup = null;
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
public b4j.example.vmlistitemgroup  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 87;BA.debugLine="Sub AddChild(child As VMElement) As VMListItemGrou";
 //BA.debugLineNum = 88;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 89;BA.debugLine="ListItemGroup.SetText(childHTML)";
_listitemgroup._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 123;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 124;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 125;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemgroup  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub AddClass(c As String) As VMListItemGroup";
 //BA.debugLineNum = 106;BA.debugLine="ListItemGroup.AddClass(c)";
_listitemgroup._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub AddComponent(comp As String) As VMListItemGrou";
 //BA.debugLineNum = 43;BA.debugLine="ListItemGroup.SetText(comp)";
_listitemgroup._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 163;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 164;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 236;BA.debugLine="ListItemGroup.BindStyleSingle(prop, value)";
_listitemgroup._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 241;BA.debugLine="ListItemGroup.BuildModel(mprops, mstyles, lclasses";
_listitemgroup._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ListItemGroup As VMElement";
_listitemgroup = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private DesignMode As Boolean    'ignore";
_designmode = false;
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object        'ignore";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean       'ignore";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemgroup  _disable() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub Disable As VMListItemGroup";
 //BA.debugLineNum = 156;BA.debugLine="ListItemGroup.Disable(True)";
_listitemgroup._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _enable() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub Enable As VMListItemGroup";
 //BA.debugLineNum = 150;BA.debugLine="ListItemGroup.Enable(True)";
_listitemgroup._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _hide() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub Hide As VMListItemGroup";
 //BA.debugLineNum = 138;BA.debugLine="ListItemGroup.SetVisible(False)";
_listitemgroup._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="ListItemGroup.Initialize(v, ID)";
_listitemgroup._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="ListItemGroup.SetTag(\"v-list-item-group\")";
_listitemgroup._settag /*b4j.example.vmelement*/ ("v-list-item-group");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 101;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemgroup  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="public Sub RemoveAttr(sName As String) As VMListIt";
 //BA.debugLineNum = 187;BA.debugLine="ListItemGroup.RemoveAttr(sName)";
_listitemgroup._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub Render";
 //BA.debugLineNum = 83;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemgroup  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetAttr(attr As Map) As VMListItemGroup";
 //BA.debugLineNum = 112;BA.debugLine="ListItemGroup.SetAttr(attr)";
_listitemgroup._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 54;BA.debugLine="Sub SetAttributes(attrs As List) As VMListItemGrou";
 //BA.debugLineNum = 55;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 56;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub SetAttrLoose(loose As String) As VMListItemGro";
 //BA.debugLineNum = 170;BA.debugLine="ListItemGroup.SetAttrLoose(loose)";
_listitemgroup._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 230;BA.debugLine="ListItemGroup.SetAttrSingle(prop, value)";
_listitemgroup._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setcolor(String _varcolor) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Sub SetColor(varColor As String) As VMListItemGrou";
 //BA.debugLineNum = 131;BA.debugLine="ListItemGroup.SetAttrSingle(\"color\", varColor)";
_listitemgroup._setattrsingle /*b4j.example.vmelement*/ ("color",_varcolor);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 36;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMListItemGroup";
 //BA.debugLineNum = 205;BA.debugLine="ListItemGroup.SetDesignMode(b)";
_listitemgroup._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 206;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetMarginAll(p As String) As VMListItemGroup";
 //BA.debugLineNum = 199;BA.debugLine="ListItemGroup.setmarginall(p)";
_listitemgroup._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 218;BA.debugLine="ListItemGroup.SetName(varName, bbind)";
_listitemgroup._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setonchange(String _methodname) throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 24;BA.debugLine="Sub SetOnChange(methodName As String) As VMListIte";
 //BA.debugLineNum = 25;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 26;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmlistitemgroup)(this);};
 //BA.debugLineNum = 27;BA.debugLine="Dim items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 28;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_items.getObject())}))));
 //BA.debugLineNum = 29;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 31;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetPaddingAll(p As String) As VMListItemGroup";
 //BA.debugLineNum = 193;BA.debugLine="ListItemGroup.SetPaddingAll(p)";
_listitemgroup._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetStatic(b As Boolean) As VMListItemGroup";
 //BA.debugLineNum = 49;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 50;BA.debugLine="ListItemGroup.SetStatic(b)";
_listitemgroup._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetStyle(sm As Map) As VMListItemGroup";
 //BA.debugLineNum = 118;BA.debugLine="ListItemGroup.SetStyle(sm)";
_listitemgroup._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 223;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 224;BA.debugLine="ListItemGroup.SetStyleSingle(prop, value)";
_listitemgroup._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub SetTabIndex(ti As String) As VMListItemGroup";
 //BA.debugLineNum = 212;BA.debugLine="ListItemGroup.SetTabIndex(ti)";
_listitemgroup._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetText(t As Object) As VMListItemGroup";
 //BA.debugLineNum = 95;BA.debugLine="ListItemGroup.SetText(t)";
_listitemgroup._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetVIf(vif As String) As VMListItemGroup";
 //BA.debugLineNum = 72;BA.debugLine="ListItemGroup.SetVIf(vif)";
_listitemgroup._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetVisible(b As Boolean) As VMListItemGroup";
 //BA.debugLineNum = 245;BA.debugLine="ListItemGroup.SetVisible(b)";
_listitemgroup._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetVModel(k As String) As VMListItemGroup";
 //BA.debugLineNum = 67;BA.debugLine="ListItemGroup.SetVModel(k)";
_listitemgroup._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetVShow(vif As String) As VMListItemGroup";
 //BA.debugLineNum = 77;BA.debugLine="ListItemGroup.SetVShow(vif)";
_listitemgroup._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitemgroup  _show() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub Show As VMListItemGroup";
 //BA.debugLineNum = 144;BA.debugLine="ListItemGroup.SetVisible(True)";
_listitemgroup._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 63;BA.debugLine="Return ListItemGroup.ToString";
if (true) return _listitemgroup._tostring /*String*/ ();
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlistitemgroup  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 175;BA.debugLine="Sub UseTheme(themeName As String) As VMListItemGro";
 //BA.debugLineNum = 176;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 177;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 178;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 179;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 180;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlistitemgroup)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
