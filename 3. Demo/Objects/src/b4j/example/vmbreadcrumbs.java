package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmbreadcrumbs extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmbreadcrumbs", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmbreadcrumbs.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _breadcrumbs = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _designmode = false;
public Object _module = null;
public boolean _bstatic = false;
public anywheresoftware.b4a.objects.collections.List _items = null;
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
public String  _addbreadcrumbsitem(b4j.example.vmbreadcrumbsitem _bci) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub AddBreadCrumbsItem(bci As VMBreadCrumbsItem)";
 //BA.debugLineNum = 55;BA.debugLine="AddComponent(bci.ToString)";
_addcomponent(_bci._tostring /*String*/ ());
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbs  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 84;BA.debugLine="Sub AddChild(child As VMElement) As VMBreadCrumbs";
 //BA.debugLineNum = 85;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 86;BA.debugLine="BreadCrumbs.SetText(childHTML)";
_breadcrumbs._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 120;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 121;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 122;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbs  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub AddClass(c As String) As VMBreadCrumbs";
 //BA.debugLineNum = 103;BA.debugLine="BreadCrumbs.AddClass(c)";
_breadcrumbs._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub AddComponent(comp As String) As VMBreadCrumbs";
 //BA.debugLineNum = 365;BA.debugLine="BreadCrumbs.SetText(comp)";
_breadcrumbs._settext /*b4j.example.vmelement*/ (_comp);
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public String  _additem(String _stext,String _shref,String _sto,boolean _bexact,boolean _bdisabled,boolean _blink) throws Exception{
anywheresoftware.b4a.objects.collections.Map _bci = null;
 //BA.debugLineNum = 27;BA.debugLine="Sub AddItem(sText As String, shref As String, sTo";
 //BA.debugLineNum = 28;BA.debugLine="Dim bci As Map = CreateMap()";
_bci = new anywheresoftware.b4a.objects.collections.Map();
_bci = __c.createMap(new Object[] {});
 //BA.debugLineNum = 29;BA.debugLine="bci.Put(\"disabled\", bDisabled)";
_bci.Put((Object)("disabled"),(Object)(_bdisabled));
 //BA.debugLineNum = 30;BA.debugLine="bci.Put(\"exact\", bExact)";
_bci.Put((Object)("exact"),(Object)(_bexact));
 //BA.debugLineNum = 31;BA.debugLine="bci.Put(\"href\", shref)";
_bci.Put((Object)("href"),(Object)(_shref));
 //BA.debugLineNum = 32;BA.debugLine="bci.Put(\"link\", bLink)";
_bci.Put((Object)("link"),(Object)(_blink));
 //BA.debugLineNum = 33;BA.debugLine="bci.Put(\"text\", sText)";
_bci.Put((Object)("text"),(Object)(_stext));
 //BA.debugLineNum = 34;BA.debugLine="bci.Put(\"to\", sTo)";
_bci.Put((Object)("to"),(Object)(_sto));
 //BA.debugLineNum = 35;BA.debugLine="items.Add(bci)";
_items.Add((Object)(_bci.getObject()));
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 376;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbs  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 216;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 217;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 296;BA.debugLine="BreadCrumbs.BindStyleSingle(prop, value)";
_breadcrumbs._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 297;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 380;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 381;BA.debugLine="BreadCrumbs.BuildModel(mprops, mstyles, lclasses,";
_breadcrumbs._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 382;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public BreadCrumbs As VMElement";
_breadcrumbs = new b4j.example.vmelement();
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
 //BA.debugLineNum = 10;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub Clear";
 //BA.debugLineNum = 45;BA.debugLine="items.Clear";
_items.Clear();
 //BA.debugLineNum = 46;BA.debugLine="SetItems(items)";
_setitems(_items);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbs  _disable() throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Sub Disable As VMBreadCrumbs";
 //BA.debugLineNum = 209;BA.debugLine="BreadCrumbs.Enable(False)";
_breadcrumbs._enable /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _enable() throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Sub Enable As VMBreadCrumbs";
 //BA.debugLineNum = 203;BA.debugLine="BreadCrumbs.Enable(True)";
_breadcrumbs._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _hide() throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub Hide As VMBreadCrumbs";
 //BA.debugLineNum = 191;BA.debugLine="BreadCrumbs.SetVisible(False)";
_breadcrumbs._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 16;BA.debugLine="BreadCrumbs.Initialize(v, ID)";
_breadcrumbs._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="BreadCrumbs.SetTag(\"v-breadcrumbs\")";
_breadcrumbs._settag /*b4j.example.vmelement*/ ("v-breadcrumbs");
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 21;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="SetItems(vue.NewList)";
_setitems(_vue._newlist /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 98;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public String  _refresh() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub Refresh";
 //BA.debugLineNum = 51;BA.debugLine="SetItems(items)";
_setitems(_items);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbs  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="public Sub RemoveAttr(sName As String) As VMBreadC";
 //BA.debugLineNum = 240;BA.debugLine="BreadCrumbs.RemoveAttr(sName)";
_breadcrumbs._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub Render";
 //BA.debugLineNum = 80;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbs  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetAttr(attr As Map) As VMBreadCrumbs";
 //BA.debugLineNum = 109;BA.debugLine="BreadCrumbs.SetAttr(attr)";
_breadcrumbs._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 315;BA.debugLine="Sub SetAttributes(attrs As List) As VMBreadCrumbs";
 //BA.debugLineNum = 316;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 317;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub SetAttrLoose(loose As String) As VMBreadCrumbs";
 //BA.debugLineNum = 223;BA.debugLine="BreadCrumbs.SetAttrLoose(loose)";
_breadcrumbs._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 224;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 290;BA.debugLine="BreadCrumbs.SetAttrSingle(prop, value)";
_breadcrumbs._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 291;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setdark(boolean _vardark) throws Exception{
String _pp = "";
 //BA.debugLineNum = 141;BA.debugLine="Sub SetDark(varDark As Boolean) As VMBreadCrumbs";
 //BA.debugLineNum = 142;BA.debugLine="If varDark = False Then Return Me";
if (_vardark==__c.False) { 
if (true) return (b4j.example.vmbreadcrumbs)(this);};
 //BA.debugLineNum = 143;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 144;BA.debugLine="SetAttrSingle(\"dark\", varDark)";
_setattrsingle("dark",BA.ObjectToString(_vardark));
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 };
 //BA.debugLineNum = 147;BA.debugLine="Dim pp As String = $\"${ID}Dark\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Dark");
 //BA.debugLineNum = 148;BA.debugLine="vue.SetStateSingle(pp, varDark)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardark));
 //BA.debugLineNum = 149;BA.debugLine="BreadCrumbs.Bind(\":dark\", pp)";
_breadcrumbs._bind /*b4j.example.vmelement*/ (":dark",_pp);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setdata(String _prop,Object _value) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetData(prop As String, value As Object) As VM";
 //BA.debugLineNum = 39;BA.debugLine="vue.SetData(prop, value)";
_vue._setdata /*b4j.example.bananovue*/ (_prop,_value);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMBreadCrumbs";
 //BA.debugLineNum = 258;BA.debugLine="BreadCrumbs.SetDesignMode(b)";
_breadcrumbs._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 259;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 260;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 345;BA.debugLine="BreadCrumbs.SetDeviceOffsets(OS, OM, OL, OX)";
_breadcrumbs._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 352;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 353;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 359;BA.debugLine="BreadCrumbs.SetDeviceSizes(SS, SM, SL, SX)";
_breadcrumbs._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setdivider(String _vardivider) throws Exception{
String _pp = "";
 //BA.debugLineNum = 127;BA.debugLine="Sub SetDivider(varDivider As String) As VMBreadCru";
 //BA.debugLineNum = 128;BA.debugLine="If varDivider = \"\" Then Return Me";
if ((_vardivider).equals("")) { 
if (true) return (b4j.example.vmbreadcrumbs)(this);};
 //BA.debugLineNum = 129;BA.debugLine="If varDivider = \"/\" Then Return Me";
if ((_vardivider).equals("/")) { 
if (true) return (b4j.example.vmbreadcrumbs)(this);};
 //BA.debugLineNum = 130;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 131;BA.debugLine="SetAttrSingle(\"divider\", varDivider)";
_setattrsingle("divider",_vardivider);
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 };
 //BA.debugLineNum = 134;BA.debugLine="Dim pp As String = $\"${ID}Divider\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Divider");
 //BA.debugLineNum = 135;BA.debugLine="vue.SetStateSingle(pp, varDivider)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardivider));
 //BA.debugLineNum = 136;BA.debugLine="BreadCrumbs.Bind(\":divider\", pp)";
_breadcrumbs._bind /*b4j.example.vmelement*/ (":divider",_pp);
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setitems(anywheresoftware.b4a.objects.collections.List _varitems) throws Exception{
String _pp = "";
 //BA.debugLineNum = 180;BA.debugLine="Sub SetItems(varItems As List) As VMBreadCrumbs";
 //BA.debugLineNum = 181;BA.debugLine="If bStatic Then Return Me";
if (_bstatic) { 
if (true) return (b4j.example.vmbreadcrumbs)(this);};
 //BA.debugLineNum = 182;BA.debugLine="Dim pp As String = $\"${ID}Items\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Items");
 //BA.debugLineNum = 183;BA.debugLine="vue.SetStateSingle(pp, varItems)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varitems.getObject()));
 //BA.debugLineNum = 184;BA.debugLine="BreadCrumbs.Bind(\":items\", pp)";
_breadcrumbs._bind /*b4j.example.vmelement*/ (":items",_pp);
 //BA.debugLineNum = 185;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 331;BA.debugLine="Sub SetKey(k As String) As VMBreadCrumbs";
 //BA.debugLineNum = 332;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 333;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 334;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setlarge(boolean _varlarge) throws Exception{
String _pp = "";
 //BA.debugLineNum = 154;BA.debugLine="Sub SetLarge(varLarge As Boolean) As VMBreadCrumbs";
 //BA.debugLineNum = 155;BA.debugLine="If varLarge = False Then Return Me";
if (_varlarge==__c.False) { 
if (true) return (b4j.example.vmbreadcrumbs)(this);};
 //BA.debugLineNum = 156;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 157;BA.debugLine="SetAttrSingle(\"large\", varLarge)";
_setattrsingle("large",BA.ObjectToString(_varlarge));
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 };
 //BA.debugLineNum = 160;BA.debugLine="Dim pp As String = $\"${ID}Large\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Large");
 //BA.debugLineNum = 161;BA.debugLine="vue.SetStateSingle(pp, varLarge)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlarge));
 //BA.debugLineNum = 162;BA.debugLine="BreadCrumbs.Bind(\":large\", pp)";
_breadcrumbs._bind /*b4j.example.vmelement*/ (":large",_pp);
 //BA.debugLineNum = 163;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setlight(boolean _varlight) throws Exception{
String _pp = "";
 //BA.debugLineNum = 167;BA.debugLine="Sub SetLight(varLight As Boolean) As VMBreadCrumbs";
 //BA.debugLineNum = 168;BA.debugLine="If varLight = False Then Return Me";
if (_varlight==__c.False) { 
if (true) return (b4j.example.vmbreadcrumbs)(this);};
 //BA.debugLineNum = 169;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 170;BA.debugLine="SetAttrSingle(\"light\", varLight)";
_setattrsingle("light",BA.ObjectToString(_varlight));
 //BA.debugLineNum = 171;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 };
 //BA.debugLineNum = 173;BA.debugLine="Dim pp As String = $\"${ID}Light\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Light");
 //BA.debugLineNum = 174;BA.debugLine="vue.SetStateSingle(pp, varLight)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varlight));
 //BA.debugLineNum = 175;BA.debugLine="BreadCrumbs.Bind(\":light\", pp)";
_breadcrumbs._bind /*b4j.example.vmelement*/ (":light",_pp);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetMarginAll(p As String) As VMBreadCrumbs";
 //BA.debugLineNum = 252;BA.debugLine="BreadCrumbs.setmarginall(p)";
_breadcrumbs._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 278;BA.debugLine="BreadCrumbs.SetName(varName, bbind)";
_breadcrumbs._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetPaddingAll(p As String) As VMBreadCrumbs";
 //BA.debugLineNum = 246;BA.debugLine="BreadCrumbs.SetPaddingAll(p)";
_breadcrumbs._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMBre";
 //BA.debugLineNum = 339;BA.debugLine="BreadCrumbs.SetRC(sRow, sCol)";
_breadcrumbs._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub SetStatic(b As Boolean) As VMBreadCrumbs";
 //BA.debugLineNum = 265;BA.debugLine="BreadCrumbs.SetStatic(b)";
_breadcrumbs._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 266;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetStyle(sm As Map) As VMBreadCrumbs";
 //BA.debugLineNum = 115;BA.debugLine="BreadCrumbs.SetStyle(sm)";
_breadcrumbs._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 284;BA.debugLine="BreadCrumbs.SetStyleSingle(prop, value)";
_breadcrumbs._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 285;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetTabIndex(ti As String) As VMBreadCrumbs";
 //BA.debugLineNum = 272;BA.debugLine="BreadCrumbs.SetTabIndex(ti)";
_breadcrumbs._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _settext(String _t) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetText(t As String) As VMBreadCrumbs";
 //BA.debugLineNum = 92;BA.debugLine="BreadCrumbs.SetText(t)";
_breadcrumbs._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _settextcenter() throws Exception{
 //BA.debugLineNum = 370;BA.debugLine="Sub SetTextCenter As VMBreadCrumbs";
 //BA.debugLineNum = 371;BA.debugLine="BreadCrumbs.AddClass(\"text-center\")";
_breadcrumbs._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 372;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub SetVElse(vif As String) As VMBreadCrumbs";
 //BA.debugLineNum = 301;BA.debugLine="BreadCrumbs.SetVElse(vif)";
_breadcrumbs._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 302;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setvfor(String _item,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 323;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
 //BA.debugLineNum = 324;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 325;BA.debugLine="item = item.tolowercase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 326;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
_sline = (""+__c.SmartStringFormatter("",(Object)(_item))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 327;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub SetVhtml(vhtml As String) As VMBreadCrumbs";
 //BA.debugLineNum = 311;BA.debugLine="BreadCrumbs.SetVHtml(vhtml)";
_breadcrumbs._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 312;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetVIf(vif As String) As VMBreadCrumbs";
 //BA.debugLineNum = 69;BA.debugLine="BreadCrumbs.SetVIf(vif)";
_breadcrumbs._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Sub SetVisible(b As Boolean) As VMBreadCrumbs";
 //BA.debugLineNum = 387;BA.debugLine="BreadCrumbs.SetVisible(b)";
_breadcrumbs._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 388;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetVModel(k As String) As VMBreadCrumbs";
 //BA.debugLineNum = 64;BA.debugLine="BreadCrumbs.SetVModel(k)";
_breadcrumbs._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetVShow(vif As String) As VMBreadCrumbs";
 //BA.debugLineNum = 74;BA.debugLine="BreadCrumbs.SetVShow(vif)";
_breadcrumbs._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub SetVText(vhtml As String) As VMBreadCrumbs";
 //BA.debugLineNum = 306;BA.debugLine="BreadCrumbs.SetVText(vhtml)";
_breadcrumbs._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbreadcrumbs  _show() throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub Show As VMBreadCrumbs";
 //BA.debugLineNum = 197;BA.debugLine="BreadCrumbs.SetVisible(True)";
_breadcrumbs._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 198;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 60;BA.debugLine="Return BreadCrumbs.ToString";
if (true) return _breadcrumbs._tostring /*String*/ ();
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbreadcrumbs  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 228;BA.debugLine="Sub UseTheme(themeName As String) As VMBreadCrumbs";
 //BA.debugLineNum = 229;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 230;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 231;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 232;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 233;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmbreadcrumbs)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
