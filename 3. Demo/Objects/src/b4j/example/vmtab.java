package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtab extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmtab", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtab.class).invoke(this, new Object[] {null});
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
public b4j.example.vmicon _icon = null;
public b4j.example.vmbadge _badge = null;
public boolean _hasbadge = false;
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
public b4j.example.vmtab  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 120;BA.debugLine="Sub AddChild(child As VMElement) As VMTab";
 //BA.debugLineNum = 121;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 122;BA.debugLine="TabItem.SetText(childHTML)";
_tabitem._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 163;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 164;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 165;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtab  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub AddClass(c As String) As VMTab";
 //BA.debugLineNum = 146;BA.debugLine="TabItem.AddClass(c)";
_tabitem._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub AddComponent(comp As String) As VMTab";
 //BA.debugLineNum = 62;BA.debugLine="TabItem.SetText(comp)";
_tabitem._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 412;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 413;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 489;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 490;BA.debugLine="TabItem.BuildModel(mprops, mstyles, lclasses, loos";
_tabitem._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 491;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 492;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 8;BA.debugLine="Private Module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="Private Icon As VMIcon";
_icon = new b4j.example.vmicon();
 //BA.debugLineNum = 11;BA.debugLine="Public Badge As VMBadge";
_badge = new b4j.example.vmbadge();
 //BA.debugLineNum = 12;BA.debugLine="Private hasBadge As Boolean";
_hasbadge = false;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtab  _disable() throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Sub Disable As VMTab";
 //BA.debugLineNum = 405;BA.debugLine="TabItem.Disable(True)";
_tabitem._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 406;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _enable() throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Sub Enable As VMTab";
 //BA.debugLineNum = 400;BA.debugLine="TabItem.Enable(True)";
_tabitem._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 401;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _hide() throws Exception{
 //BA.debugLineNum = 389;BA.debugLine="Sub Hide As VMTab";
 //BA.debugLineNum = 390;BA.debugLine="TabItem.SetVisible(False)";
_tabitem._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 17;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 18;BA.debugLine="TabItem.Initialize(v, ID)";
_tabitem._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 19;BA.debugLine="TabItem.SetTag(\"v-tab\")";
_tabitem._settag /*b4j.example.vmelement*/ ("v-tab");
 //BA.debugLineNum = 20;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 22;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 23;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 24;BA.debugLine="Icon.Initialize(vue, $\"${ID}icon\"$, Module)";
_icon._initialize /*b4j.example.vmicon*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"icon"),_module);
 //BA.debugLineNum = 25;BA.debugLine="Badge.Initialize(vue, $\"${ID}badge\"$, Module)";
_badge._initialize /*b4j.example.vmbadge*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"badge"),_module);
 //BA.debugLineNum = 26;BA.debugLine="hasBadge = False";
_hasbadge = __c.False;
 //BA.debugLineNum = 27;BA.debugLine="SetOnClick($\"${ID}_click\"$)";
_setonclick((""+__c.SmartStringFormatter("",(Object)(_id))+"_click"));
 //BA.debugLineNum = 28;BA.debugLine="SetOnChange($\"${ID}_change\"$)";
_setonchange((""+__c.SmartStringFormatter("",(Object)(_id))+"_change"));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 141;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtab  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 418;BA.debugLine="public Sub RemoveAttr(sName As String) As VMTab";
 //BA.debugLineNum = 419;BA.debugLine="TabItem.RemoveAttr(sName)";
_tabitem._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 420;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub Render";
 //BA.debugLineNum = 116;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtab  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 170;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 171;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 172;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 173;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 };
 //BA.debugLineNum = 176;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 177;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 178;BA.debugLine="TabItem.Bind(\":active-class\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 179;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setappend(boolean _varappend) throws Exception{
String _pp = "";
 //BA.debugLineNum = 183;BA.debugLine="Sub SetAppend(varAppend As Boolean) As VMTab";
 //BA.debugLineNum = 184;BA.debugLine="If varAppend = False Then Return Me";
if (_varappend==__c.False) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 185;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 186;BA.debugLine="SetAttrSingle(\"append\", varAppend)";
_setattrsingle("append",BA.ObjectToString(_varappend));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 };
 //BA.debugLineNum = 189;BA.debugLine="Dim pp As String = $\"${ID}Append\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Append");
 //BA.debugLineNum = 190;BA.debugLine="vue.SetStateSingle(pp, varAppend)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappend));
 //BA.debugLineNum = 191;BA.debugLine="TabItem.Bind(\":append\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":append",_pp);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub SetAttr(attr As Map) As VMTab";
 //BA.debugLineNum = 152;BA.debugLine="TabItem.SetAttr(attr)";
_tabitem._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 153;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 71;BA.debugLine="Sub SetAttributes(attrs As List) As VMTab";
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
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetAttrLoose(loose As String) As VMTab";
 //BA.debugLineNum = 67;BA.debugLine="TabItem.SetAttrLoose(loose)";
_tabitem._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 460;BA.debugLine="TabItem.SetAttrSingle(prop, value)";
_tabitem._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setbadge(String _scontent) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub SetBadge(scontent As String) As VMTab";
 //BA.debugLineNum = 40;BA.debugLine="Badge.SetContent(scontent)";
_badge._setcontent /*b4j.example.vmbadge*/ (_scontent);
 //BA.debugLineNum = 41;BA.debugLine="Badge.SetBordered(True)";
_badge._setbordered /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 42;BA.debugLine="Badge.SetOverlap(True)";
_badge._setoverlap /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 43;BA.debugLine="Badge.SetColorIntensity(vue.COLOR_CYAN, vue.INTEN";
_badge._setcolorintensity /*b4j.example.vmbadge*/ (_vue._color_cyan /*String*/ ,_vue._intensity_normal /*String*/ );
 //BA.debugLineNum = 44;BA.debugLine="Badge.SetAvatar(True)";
_badge._setavatar /*b4j.example.vmbadge*/ (__c.True);
 //BA.debugLineNum = 45;BA.debugLine="Badge.SetIcon(\"\")";
_badge._seticon /*b4j.example.vmbadge*/ ("");
 //BA.debugLineNum = 46;BA.debugLine="Badge.SetDot(False)";
_badge._setdot /*b4j.example.vmbadge*/ (__c.False);
 //BA.debugLineNum = 47;BA.debugLine="Badge.SetOffsetX(\"0\")";
_badge._setoffsetx /*b4j.example.vmbadge*/ ("0");
 //BA.debugLineNum = 48;BA.debugLine="Badge.SetOffsetY(\"0\")";
_badge._setoffsety /*b4j.example.vmbadge*/ ("0");
 //BA.debugLineNum = 49;BA.debugLine="hasBadge = True";
_hasbadge = __c.True;
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 196;BA.debugLine="Sub SetDark(varDark As Boolean) As VMTab";
 //BA.debugLineNum = 197;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 198;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 199;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 };
 //BA.debugLineNum = 202;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 203;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 204;BA.debugLine="TabItem.Bind(\":dark\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 33;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 434;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMTab";
 //BA.debugLineNum = 435;BA.debugLine="TabItem.SetDesignMode(b)";
_tabitem._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 436;BA.debugLine="Icon.SetDesignMode(b)";
_icon._setdesignmode /*b4j.example.vmicon*/ (_b);
 //BA.debugLineNum = 437;BA.debugLine="Badge.SetDesignMode(b)";
_badge._setdesignmode /*b4j.example.vmbadge*/ (_b);
 //BA.debugLineNum = 438;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 439;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setdisabled(boolean _vardisabled) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMTab";
 //BA.debugLineNum = 210;BA.debugLine="TabItem.SetDisabled(varDisabled)";
_tabitem._setdisabled /*b4j.example.vmelement*/ (_vardisabled);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setexact(boolean _varexact) throws Exception{
String _pp = "";
 //BA.debugLineNum = 215;BA.debugLine="Sub SetExact(varExact As Boolean) As VMTab";
 //BA.debugLineNum = 216;BA.debugLine="If varExact = False Then Return Me";
if (_varexact==__c.False) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 217;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 218;BA.debugLine="SetAttrSingle(\"exact\", varExact)";
_setattrsingle("exact",BA.ObjectToString(_varexact));
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 };
 //BA.debugLineNum = 221;BA.debugLine="Dim pp As String = $\"${ID}Exact\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Exact");
 //BA.debugLineNum = 222;BA.debugLine="vue.SetStateSingle(pp, varExact)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexact));
 //BA.debugLineNum = 223;BA.debugLine="TabItem.Bind(\":exact\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":exact",_pp);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setexactactiveclass(String _varexactactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 228;BA.debugLine="Sub SetExactActiveClass(varExactActiveClass As Str";
 //BA.debugLineNum = 229;BA.debugLine="If varExactActiveClass = \"\" Then Return Me";
if ((_varexactactiveclass).equals("")) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 230;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 231;BA.debugLine="SetAttrSingle(\"exact-active-class\", varExactActi";
_setattrsingle("exact-active-class",_varexactactiveclass);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 };
 //BA.debugLineNum = 234;BA.debugLine="Dim pp As String = $\"${ID}ExactActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ExactActiveClass");
 //BA.debugLineNum = 235;BA.debugLine="vue.SetStateSingle(pp, varExactActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexactactiveclass));
 //BA.debugLineNum = 236;BA.debugLine="TabItem.Bind(\":exact-active-class\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":exact-active-class",_pp);
 //BA.debugLineNum = 237;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _sethref(String _varhref) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SetHref(varHref As String) As VMTab";
 //BA.debugLineNum = 242;BA.debugLine="If varHref = \"\" Then Return Me";
if ((_varhref).equals("")) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 243;BA.debugLine="SetAttrSingle(\"href\", varHref)";
_setattrsingle("href",_varhref);
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _seticon(String _iconname) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetIcon(iconName As String) As VMTab";
 //BA.debugLineNum = 127;BA.debugLine="If iconName = \"\" Then Return Me";
if ((_iconname).equals("")) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 128;BA.debugLine="Icon.SetText(iconName)";
_icon._settext /*b4j.example.vmicon*/ (_iconname);
 //BA.debugLineNum = 129;BA.debugLine="AddComponent(Icon.ToString)";
_addcomponent(_icon._tostring /*String*/ ());
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setkey(String _varkey) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetKey(varKey As String) As VMTab";
 //BA.debugLineNum = 314;BA.debugLine="If varKey = \"\" Then Return Me";
if ((_varkey).equals("")) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 315;BA.debugLine="SetAttrSingle(\"key\", varKey)";
_setattrsingle("key",_varkey);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 248;BA.debugLine="Sub SetLight(varLight As Boolean) As VMTab";
 //BA.debugLineNum = 249;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 250;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 251;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 };
 //BA.debugLineNum = 254;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 255;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 256;BA.debugLine="TabItem.Bind(\":light\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setlink(boolean _varlink) throws Exception{
String _pp = "";
 //BA.debugLineNum = 261;BA.debugLine="Sub SetLink(varLink As Boolean) As VMTab";
 //BA.debugLineNum = 262;BA.debugLine="If varLink = False Then Return Me";
if (_varlink==__c.False) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 263;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 264;BA.debugLine="SetAttrSingle(\"link\", varLink)";
_setattrsingle("link",BA.ObjectToString(_varlink));
 //BA.debugLineNum = 265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 };
 //BA.debugLineNum = 267;BA.debugLine="Dim pp As String = $\"${ID}Link\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Link");
 //BA.debugLineNum = 268;BA.debugLine="vue.SetStateSingle(pp, varLink)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlink));
 //BA.debugLineNum = 269;BA.debugLine="TabItem.Bind(\":link\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":link",_pp);
 //BA.debugLineNum = 270;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Sub SetMarginAll(p As String) As VMTab";
 //BA.debugLineNum = 430;BA.debugLine="TabItem.setmarginall(p)";
_tabitem._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 431;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setname(Object _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 448;BA.debugLine="Sub SetName(varName As Object, bbind As Boolean) A";
 //BA.debugLineNum = 449;BA.debugLine="TabItem.SetName(varName, bbind)";
_tabitem._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bbind);
 //BA.debugLineNum = 450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setnuxt(boolean _varnuxt) throws Exception{
String _pp = "";
 //BA.debugLineNum = 274;BA.debugLine="Sub SetNuxt(varNuxt As Boolean) As VMTab";
 //BA.debugLineNum = 275;BA.debugLine="If varNuxt = False Then Return Me";
if (_varnuxt==__c.False) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 276;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 277;BA.debugLine="SetAttrSingle(\"nuxt\", varNuxt)";
_setattrsingle("nuxt",BA.ObjectToString(_varnuxt));
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 };
 //BA.debugLineNum = 280;BA.debugLine="Dim pp As String = $\"${ID}Nuxt\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Nuxt");
 //BA.debugLineNum = 281;BA.debugLine="vue.SetStateSingle(pp, varNuxt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnuxt));
 //BA.debugLineNum = 282;BA.debugLine="TabItem.Bind(\":nuxt\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":nuxt",_pp);
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setonchange(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 353;BA.debugLine="Sub SetOnChange(methodName As String) As VMTab";
 //BA.debugLineNum = 354;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 355;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 356;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 357;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 358;BA.debugLine="SetAttr(CreateMap(\"@change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@change"),(Object)(_methodname)}));
 //BA.debugLineNum = 360;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setonclick(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 365;BA.debugLine="Sub SetOnClick(methodName As String) As VMTab";
 //BA.debugLineNum = 366;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 367;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 368;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 369;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 370;BA.debugLine="SetAttr(CreateMap(\"@click\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@click"),(Object)(_methodname)}));
 //BA.debugLineNum = 372;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setonkeydown(String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 377;BA.debugLine="Sub SetOnKeydown(methodName As String) As VMTab";
 //BA.debugLineNum = 378;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 379;BA.debugLine="If SubExists(Module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 380;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 381;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Module,";
_cb = new com.ab.banano.BANanoObject();
_cb = (com.ab.banano.BANanoObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new com.ab.banano.BANanoObject(), (java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 382;BA.debugLine="SetAttr(CreateMap(\"@keydown\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("@keydown"),(Object)(_methodname)}));
 //BA.debugLineNum = 384;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 385;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Sub SetPaddingAll(p As String) As VMTab";
 //BA.debugLineNum = 425;BA.debugLine="TabItem.SetPaddingAll(p)";
_tabitem._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setreplace(boolean _varreplace) throws Exception{
String _pp = "";
 //BA.debugLineNum = 287;BA.debugLine="Sub SetReplace(varReplace As Boolean) As VMTab";
 //BA.debugLineNum = 288;BA.debugLine="If varReplace = False Then Return Me";
if (_varreplace==__c.False) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 289;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 290;BA.debugLine="SetAttrSingle(\"replace\", varReplace)";
_setattrsingle("replace",BA.ObjectToString(_varreplace));
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 };
 //BA.debugLineNum = 293;BA.debugLine="Dim pp As String = $\"${ID}Replace\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Replace");
 //BA.debugLineNum = 294;BA.debugLine="vue.SetStateSingle(pp, varReplace)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreplace));
 //BA.debugLineNum = 295;BA.debugLine="TabItem.Bind(\":replace\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":replace",_pp);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setripple(boolean _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 300;BA.debugLine="Sub SetRipple(varRipple As Boolean) As VMTab";
 //BA.debugLineNum = 301;BA.debugLine="If varRipple Then Return Me";
if (_varripple) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 302;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 303;BA.debugLine="SetAttrSingle(\"ripple\", varRipple)";
_setattrsingle("ripple",BA.ObjectToString(_varripple));
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 };
 //BA.debugLineNum = 306;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 307;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varripple));
 //BA.debugLineNum = 308;BA.debugLine="TabItem.Bind(\":ripple\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 //BA.debugLineNum = 309;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetStatic(b As Boolean) As VMTab";
 //BA.debugLineNum = 54;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 55;BA.debugLine="TabItem.SetStatic(b)";
_tabitem._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 56;BA.debugLine="Icon.SetStatic(b)";
_icon._setstatic /*b4j.example.vmicon*/ (_b);
 //BA.debugLineNum = 57;BA.debugLine="Badge.SetStatic(b)";
_badge._setstatic /*b4j.example.vmbadge*/ (_b);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub SetStyle(sm As Map) As VMTab";
 //BA.debugLineNum = 158;BA.debugLine="TabItem.SetStyle(sm)";
_tabitem._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 454;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 455;BA.debugLine="TabItem.SetStyleSingle(prop, value)";
_tabitem._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 456;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _settabdisabled(String _stepid,boolean _steplabel) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 481;BA.debugLine="Sub SetTabDisabled(stepID As String, stepLabel As";
 //BA.debugLineNum = 482;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 483;BA.debugLine="Dim stepShow As String = $\"${stepID}disabled\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"disabled");
 //BA.debugLineNum = 484;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(_steplabel));
 //BA.debugLineNum = 485;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _settabicon(String _stepid,String _steplabel) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 473;BA.debugLine="Sub SetTabIcon(stepID As String, stepLabel As Stri";
 //BA.debugLineNum = 474;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 475;BA.debugLine="Dim stepShow As String = $\"${stepID}icon\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"icon");
 //BA.debugLineNum = 476;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(_steplabel));
 //BA.debugLineNum = 477;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 478;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Sub SetTabIndex(ti As String) As VMTab";
 //BA.debugLineNum = 443;BA.debugLine="TabItem.SetTabIndex(ti)";
_tabitem._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 444;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _settablabel(String _stepid,String _steplabel) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 465;BA.debugLine="Sub SetTabLabel(stepID As String, stepLabel As Str";
 //BA.debugLineNum = 466;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 467;BA.debugLine="Dim stepShow As String = $\"${stepID}label\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"label");
 //BA.debugLineNum = 468;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(_steplabel));
 //BA.debugLineNum = 469;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 470;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _settag(String _vartag) throws Exception{
String _pp = "";
 //BA.debugLineNum = 320;BA.debugLine="Sub SetTag(varTag As String) As VMTab";
 //BA.debugLineNum = 321;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 322;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 323;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 };
 //BA.debugLineNum = 326;BA.debugLine="Dim pp As String = $\"${ID}Tag\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tag");
 //BA.debugLineNum = 327;BA.debugLine="vue.SetStateSingle(pp, varTag)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartag));
 //BA.debugLineNum = 328;BA.debugLine="TabItem.Bind(\":tag\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":tag",_pp);
 //BA.debugLineNum = 329;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _settarget(String _vartarget) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetTarget(varTarget As String) As VMTab";
 //BA.debugLineNum = 334;BA.debugLine="If varTarget = \"\" Then Return Me";
if ((_vartarget).equals("")) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 335;BA.debugLine="SetAttrSingle(\"target\", varTarget)";
_setattrsingle("target",_vartarget);
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _settext(String _t) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub SetText(t As String) As VMTab";
 //BA.debugLineNum = 135;BA.debugLine="TabItem.SetText(t)";
_tabitem._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setto(String _varto) throws Exception{
String _pp = "";
 //BA.debugLineNum = 340;BA.debugLine="Sub SetTo(varTo As String) As VMTab";
 //BA.debugLineNum = 341;BA.debugLine="If varTo = \"\" Then Return Me";
if ((_varto).equals("")) { 
if (true) return (b4j.example.vmtab)(this);};
 //BA.debugLineNum = 342;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 343;BA.debugLine="SetAttrSingle(\"to\", varTo)";
_setattrsingle("to",_varto);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 };
 //BA.debugLineNum = 346;BA.debugLine="Dim pp As String = $\"${ID}To\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"To");
 //BA.debugLineNum = 347;BA.debugLine="vue.SetStateSingle(pp, varTo)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varto));
 //BA.debugLineNum = 348;BA.debugLine="TabItem.Bind(\":to\", pp)";
_tabitem._bind /*b4j.example.vmelement*/ (":to",_pp);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetVIf(vif As String) As VMTab";
 //BA.debugLineNum = 100;BA.debugLine="TabItem.SetVIf(vif)";
_tabitem._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 494;BA.debugLine="Sub SetVisible(b As Boolean) As VMTab";
 //BA.debugLineNum = 495;BA.debugLine="TabItem.SetVisible(b)";
_tabitem._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 496;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetVModel(k As String) As VMTab";
 //BA.debugLineNum = 95;BA.debugLine="TabItem.SetVModel(k)";
_tabitem._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 96;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetVShow(vif As String) As VMTab";
 //BA.debugLineNum = 110;BA.debugLine="TabItem.SetVShow(vif)";
_tabitem._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _setvtext(String _vtext) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetVText(vtext As String) As VMTab";
 //BA.debugLineNum = 105;BA.debugLine="TabItem.SetVtext(vtext)";
_tabitem._setvtext /*b4j.example.vmelement*/ ((Object)(_vtext));
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtab  _show() throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Sub Show As VMTab";
 //BA.debugLineNum = 395;BA.debugLine="TabItem.SetVisible(True)";
_tabitem._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtab)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _ename = "";
 //BA.debugLineNum = 79;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 80;BA.debugLine="If vue.ShowWarnings Then";
if (_vue._showwarnings /*boolean*/ ) { 
 //BA.debugLineNum = 81;BA.debugLine="Dim eName As String = $\"${ID}_change\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 82;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 83;BA.debugLine="Log($\"VMTab.${eName} event has not been defined!";
__c.Log(("VMTab."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 //BA.debugLineNum = 85;BA.debugLine="eName = $\"${ID}_click\"$";
_ename = (""+__c.SmartStringFormatter("",(Object)(_id))+"_click");
 //BA.debugLineNum = 86;BA.debugLine="If SubExists(Module, eName) = False Then";
if (__c.SubExists(ba,_module,_ename)==__c.False) { 
 //BA.debugLineNum = 87;BA.debugLine="Log($\"VMTab.${eName} event has not been defined!";
__c.Log(("VMTab."+__c.SmartStringFormatter("",(Object)(_ename))+" event has not been defined!"));
 };
 };
 //BA.debugLineNum = 90;BA.debugLine="If hasBadge Then AddComponent(Badge.ToString)";
if (_hasbadge) { 
_addcomponent(_badge._tostring /*String*/ ());};
 //BA.debugLineNum = 91;BA.debugLine="Return TabItem.ToString";
if (true) return _tabitem._tostring /*String*/ ();
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
