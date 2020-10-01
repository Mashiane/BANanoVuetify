package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmitem.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _item = null;
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
public b4j.example.vmitem  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 84;BA.debugLine="Sub AddChild(child As VMElement) As VMItem";
 //BA.debugLineNum = 85;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 86;BA.debugLine="Item.SetText(childHTML)";
_item._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 115;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 116;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 117;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmitem  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub AddClass(c As String) As VMItem";
 //BA.debugLineNum = 98;BA.debugLine="Item.AddClass(c)";
_item._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _addcomponent(String _comp) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub AddComponent(comp As String) As VMItem";
 //BA.debugLineNum = 31;BA.debugLine="SetText(comp)";
_settext(_comp);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _addelement(String _elid,String _eltag,String _eltext,anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses) throws Exception{
b4j.example.vmelement _d = null;
 //BA.debugLineNum = 36;BA.debugLine="Sub AddElement(elID As String, elTag As String, el";
 //BA.debugLineNum = 37;BA.debugLine="Dim d As VMElement";
_d = new b4j.example.vmelement();
 //BA.debugLineNum = 38;BA.debugLine="d.Initialize(vue,elID).SetDesignMode(DesignMode).";
_d._initialize /*b4j.example.vmelement*/ (ba,_vue,_elid)._setdesignmode /*b4j.example.vmelement*/ (_designmode)._settag /*b4j.example.vmelement*/ (_eltag);
 //BA.debugLineNum = 39;BA.debugLine="d.SetText(elText)";
_d._settext /*b4j.example.vmelement*/ (_eltext);
 //BA.debugLineNum = 40;BA.debugLine="d.BuildModel(mprops, mstyles, lclasses, Null)";
_d._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 41;BA.debugLine="SetText(d.ToString)";
_settext(_d._tostring /*String*/ ());
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 352;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmitem  _bind(String _prop,String _stateprop) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub Bind(prop As String, stateprop As String) As V";
 //BA.debugLineNum = 188;BA.debugLine="stateprop = stateprop.ToLowerCase";
_stateprop = _stateprop.toLowerCase();
 //BA.debugLineNum = 189;BA.debugLine="SetAttrSingle(prop, stateprop)";
_setattrsingle(_prop,_stateprop);
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _bindstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub BindStyleSingle(prop As String, value As Strin";
 //BA.debugLineNum = 278;BA.debugLine="Item.BindStyleSingle(prop, value)";
_item._bindstylesingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _buildmodel(anywheresoftware.b4a.objects.collections.Map _mprops,anywheresoftware.b4a.objects.collections.Map _mstyles,anywheresoftware.b4a.objects.collections.List _lclasses,anywheresoftware.b4a.objects.collections.List _loose) throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub BuildModel(mprops As Map, mstyles As Map, lcla";
 //BA.debugLineNum = 357;BA.debugLine="Item.BuildModel(mprops, mstyles, lclasses, loose)";
_item._buildmodel /*b4j.example.vmelement*/ (_mprops,_mstyles,_lclasses,_loose);
 //BA.debugLineNum = 358;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Item As VMElement";
_item = new b4j.example.vmelement();
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
public b4j.example.vmitem  _disable() throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub Disable As VMItem";
 //BA.debugLineNum = 181;BA.debugLine="Item.Disable(True)";
_item._disable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _enable() throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub Enable As VMItem";
 //BA.debugLineNum = 175;BA.debugLine="Item.Enable(True)";
_item._enable /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _hide() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub Hide As VMItem";
 //BA.debugLineNum = 163;BA.debugLine="Item.SetVisible(False)";
_item._setvisible /*b4j.example.vmelement*/ (__c.False);
 //BA.debugLineNum = 164;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="Item.Initialize(v, ID)";
_item._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 16;BA.debugLine="Item.SetTag(\"v-item\")";
_item._settag /*b4j.example.vmelement*/ ("v-item");
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 20;BA.debugLine="bStatic = False";
_bstatic = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 93;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmitem  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="public Sub RemoveAttr(sName As String) As VMItem";
 //BA.debugLineNum = 227;BA.debugLine="Item.RemoveAttr(sName)";
_item._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub Render";
 //BA.debugLineNum = 80;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmitem  _setactiveclass(String _varactiveclass) throws Exception{
String _pp = "";
 //BA.debugLineNum = 122;BA.debugLine="Sub SetActiveClass(varActiveClass As String) As VM";
 //BA.debugLineNum = 123;BA.debugLine="If varActiveClass = \"\" Then Return Me";
if ((_varactiveclass).equals("")) { 
if (true) return (b4j.example.vmitem)(this);};
 //BA.debugLineNum = 124;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 125;BA.debugLine="SetAttrSingle(\"active-class\", varActiveClass)";
_setattrsingle("active-class",_varactiveclass);
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 };
 //BA.debugLineNum = 128;BA.debugLine="Dim pp As String = $\"${ID}ActiveClass\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"ActiveClass");
 //BA.debugLineNum = 129;BA.debugLine="vue.SetStateSingle(pp, varActiveClass)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varactiveclass));
 //BA.debugLineNum = 130;BA.debugLine="Item.Bind(\":active-class\", pp)";
_item._bind /*b4j.example.vmelement*/ (":active-class",_pp);
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setactivetoggle() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetActiveToggle As VMItem";
 //BA.debugLineNum = 25;BA.debugLine="SetAttrSingle(\"v-slot:default\", \"{ active, toggle";
_setattrsingle("v-slot:default","{ active, toggle }");
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetAttr(attr As Map) As VMItem";
 //BA.debugLineNum = 104;BA.debugLine="Item.SetAttr(attr)";
_item._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setattributes(anywheresoftware.b4a.objects.collections.List _attrs) throws Exception{
String _stra = "";
 //BA.debugLineNum = 297;BA.debugLine="Sub SetAttributes(attrs As List) As VMItem";
 //BA.debugLineNum = 298;BA.debugLine="For Each stra As String In attrs";
{
final anywheresoftware.b4a.BA.IterableList group1 = _attrs;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_stra = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 299;BA.debugLine="SetAttrLoose(stra)";
_setattrloose(_stra);
 }
};
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setattrloose(String _loose) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetAttrLoose(loose As String) As VMItem";
 //BA.debugLineNum = 195;BA.debugLine="Item.SetAttrLoose(loose)";
_item._setattrloose /*b4j.example.vmelement*/ (_loose);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setattrsingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetAttrSingle(prop As String, value As String)";
 //BA.debugLineNum = 272;BA.debugLine="Item.SetAttrSingle(prop, value)";
_item._setattrsingle /*b4j.example.vmelement*/ (_prop,_value);
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setcolorintensity(String _color,String _intensity) throws Exception{
String _scolor = "";
String _pp = "";
 //BA.debugLineNum = 212;BA.debugLine="Sub SetColorIntensity(color As String, intensity A";
 //BA.debugLineNum = 213;BA.debugLine="if color = \"\" then Return Me";
if ((_color).equals("")) { 
if (true) return (b4j.example.vmitem)(this);};
 //BA.debugLineNum = 214;BA.debugLine="Dim scolor As String = $\"${color} ${intensity}\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_color))+" "+__c.SmartStringFormatter("",(Object)(_intensity))+"");
 //BA.debugLineNum = 215;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 216;BA.debugLine="SetAttrSingle(\"color\", scolor)";
_setattrsingle("color",_scolor);
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 };
 //BA.debugLineNum = 219;BA.debugLine="Dim pp As String = $\"${ID}Color\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Color");
 //BA.debugLineNum = 220;BA.debugLine="vue.SetStateSingle(pp, scolor)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_scolor));
 //BA.debugLineNum = 221;BA.debugLine="Item.Bind(\":color\", pp)";
_item._bind /*b4j.example.vmelement*/ (":color",_pp);
 //BA.debugLineNum = 222;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setdata(String _xprop,Object _xvalue) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetData(xprop As String, xValue As Object) As";
 //BA.debugLineNum = 57;BA.debugLine="vue.SetData(xprop, xValue)";
_vue._setdata /*b4j.example.bananovue*/ (_xprop,_xvalue);
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setdesignmode(boolean _b) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMItem";
 //BA.debugLineNum = 245;BA.debugLine="Item.SetDesignMode(b)";
_item._setdesignmode /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 246;BA.debugLine="DesignMode = b";
_designmode = _b;
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setdeviceoffsets(String _os,String _om,String _ol,String _ox) throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Sub SetDeviceOffsets(OS As String, OM As String,OL";
 //BA.debugLineNum = 327;BA.debugLine="Item.SetDeviceOffsets(OS, OM, OL, OX)";
_item._setdeviceoffsets /*b4j.example.vmelement*/ (_os,_om,_ol,_ox);
 //BA.debugLineNum = 328;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setdevicepositions(String _srow,String _scell,String _small,String _medium,String _large,String _xlarge) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetDevicePositions(srow As String, scell As St";
 //BA.debugLineNum = 334;BA.debugLine="SetRC(srow, scell)";
_setrc(_srow,_scell);
 //BA.debugLineNum = 335;BA.debugLine="SetDeviceSizes(small,medium, large, xlarge)";
_setdevicesizes(_small,_medium,_large,_xlarge);
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setdevicesizes(String _ss,String _sm,String _sl,String _sx) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetDeviceSizes(SS As String, SM As String, SL";
 //BA.debugLineNum = 341;BA.debugLine="Item.SetDeviceSizes(SS, SM, SL, SX)";
_item._setdevicesizes /*b4j.example.vmelement*/ (_ss,_sm,_sl,_sx);
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setdisabled(boolean _vardisabled) throws Exception{
String _pp = "";
 //BA.debugLineNum = 148;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMItem";
 //BA.debugLineNum = 149;BA.debugLine="If varDisabled = False Then Return Me";
if (_vardisabled==__c.False) { 
if (true) return (b4j.example.vmitem)(this);};
 //BA.debugLineNum = 150;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 151;BA.debugLine="SetAttrSingle(\"disabled\", varDisabled)";
_setattrsingle("disabled",BA.ObjectToString(_vardisabled));
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 };
 //BA.debugLineNum = 154;BA.debugLine="Dim pp As String = $\"${ID}Disabled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Disabled");
 //BA.debugLineNum = 155;BA.debugLine="vue.SetStateSingle(pp, varDisabled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_vardisabled));
 //BA.debugLineNum = 156;BA.debugLine="Item.Bind(\":disabled\", pp)";
_item._bind /*b4j.example.vmelement*/ (":disabled",_pp);
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setkey(String _k) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub SetKey(k As String) As VMItem";
 //BA.debugLineNum = 314;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 315;BA.debugLine="SetAttrSingle(\":key\", k)";
_setattrsingle(":key",_k);
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setmarginall(String _p) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetMarginAll(p As String) As VMItem";
 //BA.debugLineNum = 239;BA.debugLine="Item.setmarginall(p)";
_item._setmarginall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setname(String _varname,boolean _bbind) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub SetName(varName As String, bbind As Boolean) A";
 //BA.debugLineNum = 260;BA.debugLine="Item.SetName(varName, bbind)";
_item._setname /*b4j.example.vmelement*/ (_varname,_bbind);
 //BA.debugLineNum = 261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setpaddingall(String _p) throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub SetPaddingAll(p As String) As VMItem";
 //BA.debugLineNum = 233;BA.debugLine="Item.SetPaddingAll(p)";
_item._setpaddingall /*b4j.example.vmelement*/ ((Object)(_p));
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setrc(String _srow,String _scol) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub SetRC(sRow As String, sCol As String) As VMIte";
 //BA.debugLineNum = 321;BA.debugLine="Item.SetRC(sRow, sCol)";
_item._setrc /*b4j.example.vmelement*/ (_srow,_scol);
 //BA.debugLineNum = 322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setstatic(boolean _b) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetStatic(b As Boolean) As VMItem";
 //BA.debugLineNum = 252;BA.debugLine="Item.SetStatic(b)";
_item._setstatic /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 253;BA.debugLine="bStatic = b";
_bstatic = _b;
 //BA.debugLineNum = 254;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetStyle(sm As Map) As VMItem";
 //BA.debugLineNum = 110;BA.debugLine="Item.SetStyle(sm)";
_item._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 111;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setstylesingle(String _prop,String _value) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Sub SetStyleSingle(prop As String, value As String";
 //BA.debugLineNum = 266;BA.debugLine="Item.SetStyleSingle(prop, value)";
_item._setstylesingle /*b4j.example.vmelement*/ (_prop,(Object)(_value));
 //BA.debugLineNum = 267;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _settext(String _txt) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetText(txt As String) As VMItem";
 //BA.debugLineNum = 47;BA.debugLine="Item.SetText(txt)";
_item._settext /*b4j.example.vmelement*/ (_txt);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _settextcenter() throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub SetTextCenter As VMItem";
 //BA.debugLineNum = 347;BA.debugLine="Item.AddClass(\"text-center\")";
_item._addclass /*b4j.example.vmelement*/ ("text-center");
 //BA.debugLineNum = 348;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _settextcolor(String _textcolor) throws Exception{
String _scolor = "";
 //BA.debugLineNum = 369;BA.debugLine="Sub SetTextColor(textcolor As String) As VMItem";
 //BA.debugLineNum = 370;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmitem)(this);};
 //BA.debugLineNum = 371;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 372;BA.debugLine="AddClass(sColor)";
_addclass(_scolor);
 //BA.debugLineNum = 373;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _settextcolorintensity(String _textcolor,String _textintensity) throws Exception{
String _scolor = "";
String _sintensity = "";
String _mcolor = "";
 //BA.debugLineNum = 377;BA.debugLine="Sub SetTextColorIntensity(textcolor As String, tex";
 //BA.debugLineNum = 378;BA.debugLine="If textcolor = \"\" Then Return Me";
if ((_textcolor).equals("")) { 
if (true) return (b4j.example.vmitem)(this);};
 //BA.debugLineNum = 379;BA.debugLine="Dim sColor As String = $\"${textcolor}--text\"$";
_scolor = (""+__c.SmartStringFormatter("",(Object)(_textcolor))+"--text");
 //BA.debugLineNum = 380;BA.debugLine="Dim sIntensity As String = $\"text--${textintensit";
_sintensity = ("text--"+__c.SmartStringFormatter("",(Object)(_textintensity))+"");
 //BA.debugLineNum = 381;BA.debugLine="Dim mcolor As String = $\"${sColor} ${sIntensity}\"";
_mcolor = (""+__c.SmartStringFormatter("",(Object)(_scolor))+" "+__c.SmartStringFormatter("",(Object)(_sintensity))+"");
 //BA.debugLineNum = 382;BA.debugLine="AddClass(mcolor)";
_addclass(_mcolor);
 //BA.debugLineNum = 383;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setvalue(String _varvalue) throws Exception{
String _pp = "";
 //BA.debugLineNum = 135;BA.debugLine="Sub SetValue(varValue As String) As VMItem";
 //BA.debugLineNum = 136;BA.debugLine="If varValue = \"\" Then Return Me";
if ((_varvalue).equals("")) { 
if (true) return (b4j.example.vmitem)(this);};
 //BA.debugLineNum = 137;BA.debugLine="If bStatic Then";
if (_bstatic) { 
 //BA.debugLineNum = 138;BA.debugLine="SetAttrSingle(\"value\", varValue)";
_setattrsingle("value",_varvalue);
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 };
 //BA.debugLineNum = 141;BA.debugLine="Dim pp As String = $\"${ID}Value\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(_id))+"Value");
 //BA.debugLineNum = 142;BA.debugLine="vue.SetStateSingle(pp, varValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_pp,(Object)(_varvalue));
 //BA.debugLineNum = 143;BA.debugLine="Item.Bind(\":value\", pp)";
_item._bind /*b4j.example.vmelement*/ (":value",_pp);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setvelse(String _vif) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub SetVElse(vif As String) As VMItem";
 //BA.debugLineNum = 283;BA.debugLine="Item.SetVElse(vif)";
_item._setvelse /*b4j.example.vmelement*/ ((Object)(_vif));
 //BA.debugLineNum = 284;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setvfor(String _eitem,String _datasource) throws Exception{
String _sline = "";
 //BA.debugLineNum = 305;BA.debugLine="Sub SetVFor(eitem As String, dataSource As String)";
 //BA.debugLineNum = 306;BA.debugLine="dataSource = dataSource.tolowercase";
_datasource = _datasource.toLowerCase();
 //BA.debugLineNum = 307;BA.debugLine="eitem = eitem.tolowercase";
_eitem = _eitem.toLowerCase();
 //BA.debugLineNum = 308;BA.debugLine="Dim sline As String = $\"${eitem} in ${dataSource}";
_sline = (""+__c.SmartStringFormatter("",(Object)(_eitem))+" in "+__c.SmartStringFormatter("",(Object)(_datasource))+"");
 //BA.debugLineNum = 309;BA.debugLine="SetAttrSingle(\"v-for\", sline)";
_setattrsingle("v-for",_sline);
 //BA.debugLineNum = 310;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setvhtml(String _vhtml) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub SetVhtml(vhtml As String) As VMItem";
 //BA.debugLineNum = 293;BA.debugLine="Item.SetVHtml(vhtml)";
_item._setvhtml /*b4j.example.vmelement*/ (_vhtml);
 //BA.debugLineNum = 294;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetVIf(vif As String) As VMItem";
 //BA.debugLineNum = 69;BA.debugLine="Item.SetVIf(vif)";
_item._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setvisible(boolean _b) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub SetVisible(b As Boolean) As VMItem";
 //BA.debugLineNum = 363;BA.debugLine="Item.SetVisible(b)";
_item._setvisible /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetVModel(k As String) As VMItem";
 //BA.debugLineNum = 64;BA.debugLine="Item.SetVModel(k)";
_item._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetVShow(vif As String) As VMItem";
 //BA.debugLineNum = 74;BA.debugLine="Item.SetVShow(vif)";
_item._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _setvtext(String _vhtml) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub SetVText(vhtml As String) As VMItem";
 //BA.debugLineNum = 288;BA.debugLine="Item.SetVText(vhtml)";
_item._setvtext /*b4j.example.vmelement*/ ((Object)(_vhtml));
 //BA.debugLineNum = 289;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmitem  _show() throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub Show As VMItem";
 //BA.debugLineNum = 169;BA.debugLine="Item.SetVisible(True)";
_item._setvisible /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 53;BA.debugLine="Return Item.ToString";
if (true) return _item._tostring /*String*/ ();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmitem  _usetheme(String _themename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _themes = null;
String _sclass = "";
 //BA.debugLineNum = 200;BA.debugLine="Sub UseTheme(themeName As String) As VMItem";
 //BA.debugLineNum = 201;BA.debugLine="themeName = themeName.ToLowerCase";
_themename = _themename.toLowerCase();
 //BA.debugLineNum = 202;BA.debugLine="Dim themes As Map = vue.themes";
_themes = new anywheresoftware.b4a.objects.collections.Map();
_themes = _vue._themes /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 203;BA.debugLine="If themes.ContainsKey(themeName) Then";
if (_themes.ContainsKey((Object)(_themename))) { 
 //BA.debugLineNum = 204;BA.debugLine="Dim sclass As String = themes.Get(themeName)";
_sclass = BA.ObjectToString(_themes.Get((Object)(_themename)));
 //BA.debugLineNum = 205;BA.debugLine="AddClass(sclass)";
_addclass(_sclass);
 };
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmitem)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
