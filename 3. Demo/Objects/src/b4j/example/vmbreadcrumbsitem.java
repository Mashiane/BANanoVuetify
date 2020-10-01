package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbreadcrumbsitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmbreadcrumbsitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbreadcrumbsitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _breadcrumbsitem = null;
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
public b4j.example.vmbreadcrumbsitem  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 56;BA.debugLine="Sub AddChild(child As VMElement) As VMBreadCrumbsI";
 //BA.debugLineNum = 57;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 58;BA.debugLine="BreadCrumbsItem.SetText(childHTML)";
_breadcrumbsitem._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 98;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 99;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 100;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbsitem  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub AddClass(c As String) As VMBreadCrumbsItem";
 //BA.debugLineNum = 81;BA.debugLine="BreadCrumbsItem.AddClass(c)";
_breadcrumbsitem._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 450;BA.debugLine="Sub AddComponent(comp As String) As VMBreadCrumbsI";
 //BA.debugLineNum = 451;BA.debugLine="BreadCrumbsItem.SetText(comp)";
_breadcrumbsitem._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 461;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 462;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbsitem  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 302;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 303;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 382;BA.debugLine="BreadCrumbsItem.BindStyleSingle(prop, value)";
_breadcrumbsitem._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 467;BA.debugLine="BreadCrumbsItem.BuildModel(mprops, mstyles, lclas";
_breadcrumbsitem._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 468;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public BreadCrumbsItem As VMElement";
_breadcrumbsitem = new b4j.example.vmelement();
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
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean   'ignore";
_bstatic = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbsitem  _disable() throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Sub Disable As VMBreadCrumbsItem";
 //BA.debugLineNum = 295;BA.debugLine="BreadCrumbsItem.Enable(False)";
_breadcrumbsitem._enable /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _enable() throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub Enable As VMBreadCrumbsItem";
 //BA.debugLineNum = 289;BA.debugLine="BreadCrumbsItem.Enable(True)";
_breadcrumbsitem._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _hide() throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub Hide As VMBreadCrumbsItem";
 //BA.debugLineNum = 277;BA.debugLine="BreadCrumbsItem.SetVisible(False)";
_breadcrumbsitem._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="BreadCrumbsItem.Initialize(v, ID)";
_breadcrumbsitem._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="BreadCrumbsItem.SetTag(\"v-breadcrumbs-item\")";
_breadcrumbsitem._settag /*b4j.example.vmelement*/ ("v-breadcrumbs-item");
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 76;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbsitem  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="public Sub RemoveAttr(sName As String) As VMBreadC";
 //BA.debugLineNum = 326;BA.debugLine="BreadCrumbsItem.RemoveAttr(sName)";
_breadcrumbsitem._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 327;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub Render";
 //BA.debugLineNum = 52;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbsitem  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 105;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 106;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 107;BA.debugLine="If varActiveClass = \"v-breadcrumbs__item--disable";
if ((_varactiveclass).equals("v-breadcrumbs__item--disabled")) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 108;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 109;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 112;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 113;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 114;BA.debugLine="BreadCrumbsItem.Bind(\":active-class\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setappend(boolean _varappend) throws Exception{
String _pp = "";
 //BA.debugLineNum = 184;BA.debugLine="Sub SetAppend(varAppend As Boolean) As VMBreadCrum";
 //BA.debugLineNum = 185;BA.debugLine="If varAppend = False Then Return Me";
if (_varappend==__c.False) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 186;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 187;BA.debugLine="SetAttrSingle(\"append\", varAppend)";
_setattrsingle("append",BA.ObjectToString(_varappend));
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 190;BA.debugLine="Dim pp As String = $\"${ID}Append\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Append");
 //BA.debugLineNum = 191;BA.debugLine="vue.SetStateSingle(pp, varAppend)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varappend));
 //BA.debugLineNum = 192;BA.debugLine="BreadCrumbsItem.Bind(\":append\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":append",_pp);
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetAttr(attr As Map) As VMBreadCrumbsItem";
 //BA.debugLineNum = 87;BA.debugLine="BreadCrumbsItem.SetAttr(attr)";
_breadcrumbsitem._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 401;BA.debugLine="Sub SetAttributes(attrs As List) As VMBreadCrumbsI";
 //BA.debugLineNum = 402;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 403;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SetAttrLoose(loose As String) As VMBreadCrumbs";
 //BA.debugLineNum = 309;BA.debugLine="BreadCrumbsItem.SetAttrLoose(loose)";
_breadcrumbsitem._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 376;BA.debugLine="BreadCrumbsItem.SetAttrSingle(prop, value)";
_breadcrumbsitem._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 377;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 25;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMBreadCrumbsIt";
 //BA.debugLineNum = 344;BA.debugLine="BreadCrumbsItem.SetDesignMode(b)";
_breadcrumbsitem._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 345;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 430;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 431;BA.debugLine="BreadCrumbsItem.SetDeviceOffsets(OS, OM, OL, OX)";
_breadcrumbsitem._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 437;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 438;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 439;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 440;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 444;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 445;BA.debugLine="BreadCrumbsItem.SetDeviceSizes(SS, SM, SL, SX)";
_breadcrumbsitem._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 446;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setdisabled(boolean _vardisabled) throws Exception{
String _pp = "";
 //BA.debugLineNum = 197;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMBread";
 //BA.debugLineNum = 198;BA.debugLine="If varDisabled = False Then Return Me";
if (_vardisabled==__c.False) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 199;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 200;BA.debugLine="SetAttrSingle(\"disabled\", varDisabled)";
_setattrsingle("disabled",BA.ObjectToString(_vardisabled));
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 203;BA.debugLine="Dim pp As String = $\"${ID}Disabled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Disabled");
 //BA.debugLineNum = 204;BA.debugLine="vue.SetStateSingle(pp, varDisabled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisabled));
 //BA.debugLineNum = 205;BA.debugLine="BreadCrumbsItem.Bind(\":disabled\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":disabled",_pp);
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setexact(boolean _varexact) throws Exception{
String _pp = "";
 //BA.debugLineNum = 210;BA.debugLine="Sub SetExact(varExact As Boolean) As VMBreadCrumbs";
 //BA.debugLineNum = 211;BA.debugLine="If varExact = False Then Return Me";
if (_varexact==__c.False) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 212;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 213;BA.debugLine="SetAttrSingle(\"exact\", varExact)";
_setattrsingle("exact",BA.ObjectToString(_varexact));
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 216;BA.debugLine="Dim pp As String = $\"${ID}Exact\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Exact");
 //BA.debugLineNum = 217;BA.debugLine="vue.SetStateSingle(pp, varExact)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexact));
 //BA.debugLineNum = 218;BA.debugLine="BreadCrumbsItem.Bind(\":exact\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":exact",_pp);
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setexactactiveclass(String _varexactactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 119;BA.debugLine="Sub SetExactActiveClass(varExactActiveClass As Str";
 //BA.debugLineNum = 120;BA.debugLine="If varExactActiveClass = \"\" Then Return Me";
if ((_varexactactiveclass).equals("")) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 121;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 122;BA.debugLine="SetAttrSingle(\"exact-active-class\", varExactActi";
_setattrsingle("exact-active-class",_varexactactiveclass);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 125;BA.debugLine="Dim pp As String = $\"${ID}ExactActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ExactActiveClass");
 //BA.debugLineNum = 126;BA.debugLine="vue.SetStateSingle(pp, varExactActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varexactactiveclass));
 //BA.debugLineNum = 127;BA.debugLine="BreadCrumbsItem.Bind(\":exact-active-class\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":exact-active-class",_pp);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _sethref(String _varhref) throws Exception{
String _pp = "";
 //BA.debugLineNum = 132;BA.debugLine="Sub SetHref(varHref As String) As VMBreadCrumbsIte";
 //BA.debugLineNum = 133;BA.debugLine="If varHref = \"\" Then Return Me";
if ((_varhref).equals("")) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 134;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 135;BA.debugLine="SetAttrSingle(\"href\", varHref)";
_setattrsingle("href",_varhref);
 //BA.debugLineNum = 136;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 138;BA.debugLine="Dim pp As String = $\"${ID}Href\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Href");
 //BA.debugLineNum = 139;BA.debugLine="vue.SetStateSingle(pp, varHref)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varhref));
 //BA.debugLineNum = 140;BA.debugLine="BreadCrumbsItem.Bind(\":href\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":href",_pp);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetKey(k As String) As VMBreadCrumbsItem";
 //BA.debugLineNum = 418;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 419;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 420;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setlink(boolean _varlink) throws Exception{
String _pp = "";
 //BA.debugLineNum = 223;BA.debugLine="Sub SetLink(varLink As Boolean) As VMBreadCrumbsIt";
 //BA.debugLineNum = 224;BA.debugLine="If varLink = False Then Return Me";
if (_varlink==__c.False) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 225;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 226;BA.debugLine="SetAttrSingle(\"link\", varLink)";
_setattrsingle("link",BA.ObjectToString(_varlink));
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 229;BA.debugLine="Dim pp As String = $\"${ID}Link\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Link");
 //BA.debugLineNum = 230;BA.debugLine="vue.SetStateSingle(pp, varLink)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlink));
 //BA.debugLineNum = 231;BA.debugLine="BreadCrumbsItem.Bind(\":link\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":link",_pp);
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetMarginAll(p As String) As VMBreadCrumbsItem";
 //BA.debugLineNum = 338;BA.debugLine="BreadCrumbsItem.setmarginall(p)";
_breadcrumbsitem._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 364;BA.debugLine="BreadCrumbsItem.SetName(varName, bbind)";
_breadcrumbsitem._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setnuxt(boolean _varnuxt) throws Exception{
String _pp = "";
 //BA.debugLineNum = 236;BA.debugLine="Sub SetNuxt(varNuxt As Boolean) As VMBreadCrumbsIt";
 //BA.debugLineNum = 237;BA.debugLine="If varNuxt = False Then Return Me";
if (_varnuxt==__c.False) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 238;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 239;BA.debugLine="SetAttrSingle(\"nuxt\", varNuxt)";
_setattrsingle("nuxt",BA.ObjectToString(_varnuxt));
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 242;BA.debugLine="Dim pp As String = $\"${ID}Nuxt\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Nuxt");
 //BA.debugLineNum = 243;BA.debugLine="vue.SetStateSingle(pp, varNuxt)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varnuxt));
 //BA.debugLineNum = 244;BA.debugLine="BreadCrumbsItem.Bind(\":nuxt\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":nuxt",_pp);
 //BA.debugLineNum = 245;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetPaddingAll(p As String) As VMBreadCrumbsIte";
 //BA.debugLineNum = 332;BA.debugLine="BreadCrumbsItem.SetPaddingAll(p)";
_breadcrumbsitem._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMBre";
 //BA.debugLineNum = 425;BA.debugLine="BreadCrumbsItem.SetRC(sRow, sCol)";
_breadcrumbsitem._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setreplace(boolean _varreplace) throws Exception{
String _pp = "";
 //BA.debugLineNum = 249;BA.debugLine="Sub SetReplace(varReplace As Boolean) As VMBreadCr";
 //BA.debugLineNum = 250;BA.debugLine="If varReplace = False Then Return Me";
if (_varreplace==__c.False) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 251;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 252;BA.debugLine="SetAttrSingle(\"replace\", varReplace)";
_setattrsingle("replace",BA.ObjectToString(_varreplace));
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 255;BA.debugLine="Dim pp As String = $\"${ID}Replace\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Replace");
 //BA.debugLineNum = 256;BA.debugLine="vue.SetStateSingle(pp, varReplace)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varreplace));
 //BA.debugLineNum = 257;BA.debugLine="BreadCrumbsItem.Bind(\":replace\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":replace",_pp);
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setripple(boolean _varripple) throws Exception{
String _pp = "";
 //BA.debugLineNum = 262;BA.debugLine="Sub SetRipple(varRipple As Boolean) As VMBreadCrum";
 //BA.debugLineNum = 263;BA.debugLine="If varRipple = False Then Return Me";
if (_varripple==__c.False) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 264;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 265;BA.debugLine="SetAttrSingle(\"ripple\", varRipple)";
_setattrsingle("ripple",BA.ObjectToString(_varripple));
 //BA.debugLineNum = 266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 268;BA.debugLine="Dim pp As String = $\"${ID}Ripple\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Ripple");
 //BA.debugLineNum = 269;BA.debugLine="vue.SetStateSingle(pp, varRipple)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varripple));
 //BA.debugLineNum = 270;BA.debugLine="BreadCrumbsItem.Bind(\":ripple\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":ripple",_pp);
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Sub SetStatic(b As Boolean) As VMBreadCrumbsItem";
 //BA.debugLineNum = 351;BA.debugLine="BreadCrumbsItem.SetStatic(b)";
_breadcrumbsitem._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 352;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 353;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetStyle(sm As Map) As VMBreadCrumbsItem";
 //BA.debugLineNum = 93;BA.debugLine="BreadCrumbsItem.SetStyle(sm)";
_breadcrumbsitem._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 370;BA.debugLine="BreadCrumbsItem.SetStyleSingle(prop, value)";
_breadcrumbsitem._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub SetTabIndex(ti As String) As VMBreadCrumbsItem";
 //BA.debugLineNum = 358;BA.debugLine="BreadCrumbsItem.SetTabIndex(ti)";
_breadcrumbsitem._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _settag(String _vartag) throws Exception{
String _pp = "";
 //BA.debugLineNum = 145;BA.debugLine="Sub SetTag(varTag As String) As VMBreadCrumbsItem";
 //BA.debugLineNum = 146;BA.debugLine="If varTag = \"\" Then Return Me";
if ((_vartag).equals("")) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 147;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 148;BA.debugLine="SetAttrSingle(\"tag\", varTag)";
_setattrsingle("tag",_vartag);
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 151;BA.debugLine="Dim pp As String = $\"${ID}Tag\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Tag");
 //BA.debugLineNum = 152;BA.debugLine="vue.SetStateSingle(pp, varTag)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartag));
 //BA.debugLineNum = 153;BA.debugLine="BreadCrumbsItem.Bind(\":tag\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":tag",_pp);
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _settarget(String _vartarget) throws Exception{
String _pp = "";
 //BA.debugLineNum = 158;BA.debugLine="Sub SetTarget(varTarget As String) As VMBreadCrumb";
 //BA.debugLineNum = 159;BA.debugLine="If varTarget = \"\" Then Return Me";
if ((_vartarget).equals("")) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 160;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 161;BA.debugLine="SetAttrSingle(\"target\", varTarget)";
_setattrsingle("target",_vartarget);
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 164;BA.debugLine="Dim pp As String = $\"${ID}Target\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Target");
 //BA.debugLineNum = 165;BA.debugLine="vue.SetStateSingle(pp, varTarget)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartarget));
 //BA.debugLineNum = 166;BA.debugLine="BreadCrumbsItem.Bind(\":target\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":target",_pp);
 //BA.debugLineNum = 167;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _settext(String _vartext) throws Exception{
String _pp = "";
 //BA.debugLineNum = 62;BA.debugLine="Sub SetText(varText As String) As VMBreadCrumbsIte";
 //BA.debugLineNum = 63;BA.debugLine="If varText = \"\" Then Return Me";
if ((_vartext).equals("")) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 64;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 65;BA.debugLine="SetAttrSingle(\"text\", varText)";
_setattrsingle("text",_vartext);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 68;BA.debugLine="Dim pp As String = $\"${ID}Text\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Text");
 //BA.debugLineNum = 69;BA.debugLine="vue.SetStateSingle(pp, varText)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vartext));
 //BA.debugLineNum = 70;BA.debugLine="BreadCrumbsItem.Bind(\":text\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":text",_pp);
 //BA.debugLineNum = 71;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _settextcenter() throws Exception{
 //BA.debugLineNum = 456;BA.debugLine="Sub SetTextCenter As VMBreadCrumbsItem";
 //BA.debugLineNum = 457;BA.debugLine="BreadCrumbsItem.AddClass(\"text-center\")";
_breadcrumbsitem._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setto(String _varto) throws Exception{
String _pp = "";
 //BA.debugLineNum = 171;BA.debugLine="Sub SetTo(varTo As String) As VMBreadCrumbsItem";
 //BA.debugLineNum = 172;BA.debugLine="If varTo = \"\" Then Return Me";
if ((_varto).equals("")) { 
if (true) return (b4j.example.vmbreadcrumbsitem)(this);};
 //BA.debugLineNum = 173;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 174;BA.debugLine="SetAttrSingle(\"to\", varTo)";
_setattrsingle("to",_varto);
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 };
 //BA.debugLineNum = 177;BA.debugLine="Dim pp As String = $\"${ID}To\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"To");
 //BA.debugLineNum = 178;BA.debugLine="vue.SetStateSingle(pp, varTo)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varto));
 //BA.debugLineNum = 179;BA.debugLine="BreadCrumbsItem.Bind(\":to\", pp)";
_breadcrumbsitem._bind /*b4j.example.vmelement*/ (":to",_pp);
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub SetVElse(vif As String) As VMBreadCrumbsItem";
 //BA.debugLineNum = 387;BA.debugLine="BreadCrumbsItem.SetVElse(vif)";
_breadcrumbsitem._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 409;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 410;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 411;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 412;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 413;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Sub SetVhtml(vhtml As String) As VMBreadCrumbsItem";
 //BA.debugLineNum = 397;BA.debugLine="BreadCrumbsItem.SetVHtml(vhtml)";
_breadcrumbsitem._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 398;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetVIf(vif As String) As VMBreadCrumbsItem";
 //BA.debugLineNum = 41;BA.debugLine="BreadCrumbsItem.SetVIf(vif)";
_breadcrumbsitem._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 472;BA.debugLine="Sub SetVisible(b As Boolean) As VMBreadCrumbsItem";
 //BA.debugLineNum = 473;BA.debugLine="BreadCrumbsItem.SetVisible(b)";
_breadcrumbsitem._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetVModel(k As String) As VMBreadCrumbsItem";
 //BA.debugLineNum = 36;BA.debugLine="BreadCrumbsItem.SetVModel(k)";
_breadcrumbsitem._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetVShow(vif As String) As VMBreadCrumbsItem";
 //BA.debugLineNum = 46;BA.debugLine="BreadCrumbsItem.SetVShow(vif)";
_breadcrumbsitem._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Sub SetVText(vhtml As String) As VMBreadCrumbsItem";
 //BA.debugLineNum = 392;BA.debugLine="BreadCrumbsItem.SetVText(vhtml)";
_breadcrumbsitem._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 393;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbsitem  _show() throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub Show As VMBreadCrumbsItem";
 //BA.debugLineNum = 283;BA.debugLine="BreadCrumbsItem.SetVisible(True)";
_breadcrumbsitem._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 32;BA.debugLine="Return BreadCrumbsItem.ToString";
if (true) return _breadcrumbsitem._tostring /*String*/ ();
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbsitem  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 314;BA.debugLine="Sub UseTheme(themeName As String) As VMBreadCrumbs";
 //BA.debugLineNum = 315;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 316;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 317;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 318;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 319;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbsitem)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
