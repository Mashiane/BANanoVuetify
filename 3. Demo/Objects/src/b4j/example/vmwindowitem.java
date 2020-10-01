package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmwindowitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmwindowitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmwindowitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _windowitem = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public b4j.example.vmcontainer _container = null;
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
public b4j.example.vmwindowitem  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 73;BA.debugLine="Sub AddChild(child As VMElement) As VMWindowItem";
 //BA.debugLineNum = 74;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 75;BA.debugLine="WindowItem.SetText(childHTML)";
_windowitem._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
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
public b4j.example.vmwindowitem  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub AddClass(c As String) As VMWindowItem";
 //BA.debugLineNum = 92;BA.debugLine="WindowItem.AddClass(c)";
_windowitem._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub AddComponent(comp As String) As VMWindowItem";
 //BA.debugLineNum = 37;BA.debugLine="SetText(comp)";
_settext((Object)(_comp));
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 46;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 47;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 48;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 49;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 50;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 51;BA.debugLine="SetText(d.ToString)";
_settext((Object)(_d._tostring /*String*/ ()));
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 187;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 188;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 189;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 269;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 270;BA.debugLine="WindowItem.BindStyleSingle(prop, value)";
_windowitem._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 312;BA.debugLine="WindowItem.BuildModel(mprops, mstyles, lclasses, l";
_windowitem._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public WindowItem As VMElement";
_windowitem = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Public Container As VMContainer";
_container = new b4j.example.vmcontainer();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwindowitem  _disable() throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub Disable As VMWindowItem";
 //BA.debugLineNum = 180;BA.debugLine="WindowItem.Disable(True)";
_windowitem._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _enable() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub Enable As VMWindowItem";
 //BA.debugLineNum = 174;BA.debugLine="WindowItem.Enable(True)";
_windowitem._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _hide() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub Hide As VMWindowItem";
 //BA.debugLineNum = 162;BA.debugLine="WindowItem.SetVisible(False)";
_windowitem._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="WindowItem.Initialize(v, ID)";
_windowitem._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="WindowItem.SetTag(\"v-window-item\")";
_windowitem._settag /*b4j.example.vmelement*/ ("v-window-item");
 //BA.debugLineNum = 17;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 18;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 20;BA.debugLine="Container.Initialize(vue, $\"${ID}container\"$, eve";
_container._initialize /*b4j.example.vmcontainer*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"container"),_eventhandler);
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 87;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwindowitem  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="public Sub RemoveAttr(sName As String) As VMWindow";
 //BA.debugLineNum = 221;BA.debugLine="WindowItem.RemoveAttr(sName)";
_windowitem._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Render";
 //BA.debugLineNum = 69;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwindowitem  _setactiveclass(Object _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 116;BA.debugLine="Sub SetActiveClass(varActiveClass As Object) As VM";
 //BA.debugLineNum = 117;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 118;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varactiveclass);
 //BA.debugLineNum = 119;BA.debugLine="WindowItem.Bind(\":active-class\", pp)";
_windowitem._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetAttr(attr As Map) As VMWindowItem";
 //BA.debugLineNum = 98;BA.debugLine="WindowItem.SetAttr(attr)";
_windowitem._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 289;BA.debugLine="Sub SetAttributes(attrs As List) As VMWindowItem";
 //BA.debugLineNum = 290;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 291;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetAttrLoose(loose As String) As VMWindowItem";
 //BA.debugLineNum = 194;BA.debugLine="WindowItem.SetAttrLoose(loose)";
_windowitem._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 264;BA.debugLine="WindowItem.SetAttrSingle(prop, value)";
_windowitem._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _pp = "";
String _scolor = "";
 //BA.debugLineNum = 211;BA.debugLine="Sub SetColorIntensity(varColor As String, varInten";
 //BA.debugLineNum = 212;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 213;BA.debugLine="Dim scolor As String = $\"${varColor} ${varIntensi";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+" "+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 214;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 215;BA.debugLine="WindowItem.Bind(\":color\", pp)";
_windowitem._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 42;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMWindowItem";
 //BA.debugLineNum = 239;BA.debugLine="WindowItem.SetDesignMode(b)";
_windowitem._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 240;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMWindo";
 //BA.debugLineNum = 125;BA.debugLine="WindowItem.SetDisabled(varDisabled)";
_windowitem._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _seteager(Object _vareager) throws Exception{
String _pp = "";
 //BA.debugLineNum = 130;BA.debugLine="Sub SetEager(varEager As Object) As VMWindowItem";
 //BA.debugLineNum = 131;BA.debugLine="Dim pp As String = $\"${ID}Eager\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Eager");
 //BA.debugLineNum = 132;BA.debugLine="vue.SetStateSingle(pp, varEager)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vareager);
 //BA.debugLineNum = 133;BA.debugLine="WindowItem.Bind(\":eager\", pp)";
_windowitem._bind /*b4j.example.vmelement*/ (":eager",_pp);
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub SetKey(k As String) As VMWindowItem";
 //BA.debugLineNum = 306;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 307;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetMarginAll(p As String) As VMWindowItem";
 //BA.debugLineNum = 233;BA.debugLine="WindowItem.setmarginall(p)";
_windowitem._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 252;BA.debugLine="WindowItem.SetName(varName, bbind)";
_windowitem._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub SetPaddingAll(p As String) As VMWindowItem";
 //BA.debugLineNum = 227;BA.debugLine="WindowItem.SetPaddingAll(p)";
_windowitem._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setreversetransition(Object _varreversetransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 138;BA.debugLine="Sub SetReverseTransition(varReverseTransition As O";
 //BA.debugLineNum = 139;BA.debugLine="Dim pp As String = $\"${ID}ReverseTransition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ReverseTransition");
 //BA.debugLineNum = 140;BA.debugLine="vue.SetStateSingle(pp, varReverseTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_varreversetransition);
 //BA.debugLineNum = 141;BA.debugLine="WindowItem.Bind(\":reverse-transition\", pp)";
_windowitem._bind /*b4j.example.vmelement*/ (":reverse-transition",_pp);
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetStyle(sm As Map) As VMWindowItem";
 //BA.debugLineNum = 104;BA.debugLine="WindowItem.SetStyle(sm)";
_windowitem._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 258;BA.debugLine="WindowItem.SetStyleSingle(prop, value)";
_windowitem._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetTabIndex(ti As String) As VMWindowItem";
 //BA.debugLineNum = 246;BA.debugLine="WindowItem.SetTabIndex(ti)";
_windowitem._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetText(t As Object) As VMWindowItem";
 //BA.debugLineNum = 81;BA.debugLine="WindowItem.SetText(t)";
_windowitem._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _settextcolor(String _varcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 321;BA.debugLine="Sub SetTextColor(varColor As String) As VMWindowIt";
 //BA.debugLineNum = 322;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 323;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _settextcolorintensity(String _varcolor,String _varintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 328;BA.debugLine="Sub SetTextColorIntensity(varColor As String, varI";
 //BA.debugLineNum = 329;BA.debugLine="Dim sColor As String = $\"${varColor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_varcolor))+"--text");
 //BA.debugLineNum = 330;BA.debugLine="Dim sIntensity As String = $\"text--${varIntensity";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_varintensity))+"");
 //BA.debugLineNum = 331;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 332;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _settransition(Object _vartransition) throws Exception{
String _pp = "";
 //BA.debugLineNum = 146;BA.debugLine="Sub SetTransition(varTransition As Object) As VMWi";
 //BA.debugLineNum = 147;BA.debugLine="Dim pp As String = $\"${ID}Transition\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Transition");
 //BA.debugLineNum = 148;BA.debugLine="vue.SetStateSingle(pp, varTransition)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,_vartransition);
 //BA.debugLineNum = 149;BA.debugLine="WindowItem.Bind(\":transition\", pp)";
_windowitem._bind /*b4j.example.vmelement*/ (":transition",_pp);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setvalue(Object _varvalue) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetValue(varValue As Object) As VMWindowItem";
 //BA.debugLineNum = 155;BA.debugLine="WindowItem.SetValue(varValue, False)";
_windowitem._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varvalue),__c.False);
 //BA.debugLineNum = 156;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Sub SetVElse(vif As String) As VMWindowItem";
 //BA.debugLineNum = 275;BA.debugLine="WindowItem.SetVElse(vif)";
_windowitem._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 297;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 298;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 299;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 300;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 301;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Sub SetVhtml(vhtml As String) As VMWindowItem";
 //BA.debugLineNum = 285;BA.debugLine="WindowItem.SetVHtml(vhtml)";
_windowitem._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetVIf(vif As String) As VMWindowItem";
 //BA.debugLineNum = 58;BA.debugLine="WindowItem.SetVIf(vif)";
_windowitem._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Sub SetVisible(b As Boolean) As VMWindowItem";
 //BA.debugLineNum = 316;BA.debugLine="WindowItem.SetVisible(b)";
_windowitem._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 317;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetVModel(k As String) As VMWindowItem";
 //BA.debugLineNum = 31;BA.debugLine="WindowItem.SetVModel(k)";
_windowitem._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetVShow(vif As String) As VMWindowItem";
 //BA.debugLineNum = 63;BA.debugLine="WindowItem.SetVShow(vif)";
_windowitem._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Sub SetVText(vhtml As String) As VMWindowItem";
 //BA.debugLineNum = 280;BA.debugLine="WindowItem.SetVText(vhtml)";
_windowitem._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 281;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwindowitem  _show() throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub Show As VMWindowItem";
 //BA.debugLineNum = 168;BA.debugLine="WindowItem.SetVisible(True)";
_windowitem._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 26;BA.debugLine="If Container.HasContent Then SetText(Container.To";
if (_container._hascontent /*boolean*/ ) { 
_settext((Object)(_container._tostring /*String*/ ()));};
 //BA.debugLineNum = 27;BA.debugLine="Return WindowItem.ToString";
if (true) return _windowitem._tostring /*String*/ ();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwindowitem  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 199;BA.debugLine="Sub UseTheme(themeName As String) As VMWindowItem";
 //BA.debugLineNum = 200;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 201;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 202;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 203;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 204;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwindowitem)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
